package net.hedtech.general.common.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bouncycastle.asn1.ocsp.Request;

import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.services.BannerFilter;
import net.hedtech.general.common.services.BannerServices;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import morphis.core.utils.collections.CollectionUtils;
import morphis.foundations.core.appdatalayer.data.configuration.IDataObjectConfiguration;
import morphis.foundations.core.appsupportlib.configuration.AppSupportLibSettings;
import morphis.foundations.core.appsupportlib.model.IBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.configuration.EventData;
import morphis.foundations.core.appsupportlib.runtime.configuration.ExtensionData;
import morphis.foundations.core.appsupportlib.runtime.control.IBlockController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.CanvasDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.ContentCanvasDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.WindowDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.BlockData;
import morphis.foundations.core.appsupportlib.runtime.web.message.BlockRecord;
import morphis.foundations.core.appsupportlib.runtime.web.message.DefaultMessageBinder;
import morphis.foundations.core.appsupportlib.runtime.web.message.ItemField;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageRequest;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageResponse;
import morphis.foundations.core.appsupportlib.runtime.web.message.RequestState;
import morphis.foundations.core.appsupportlib.runtime.web.message.XmlItemField;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.IPredicate;
import morphis.foundations.core.util.StringHelper;
import morphis.foundations.extensions.binding.DefaultSecurityMessageFilter;
import morphis.foundations.extensions.binding.FilterMessageBinder;

public class MessageBinder extends FilterMessageBinder {

	//Status properties
	//Property stating that the control info should be delayed until a non-suspending message response is sent
	//Used to 'freeze' the state of the KEY-BLOCK during alerts
	static public final String DELAYED_CONTROL_INFO = "DELAYED_CONTROL_INFO";
	static public final String BIND_ALWAYS_EXT = "BIND_ALWAYS";
	
	public MessageBinder(ITask task, MessageRequest request) {
		super(task, request);
	}
	
	//Message binder rules
	/*
	 1. Mandatory windows are the ones that (may) contain block/items that should always be visible and therefor bibdable
	 	=> In this application is the MainWindow only
	 2. if the window is not active (its a mandatory one), only include items form its content canvas
	 */
	
	@Override
	protected Iterable<WindowDescriptor> getBindWindows() {
		List<WindowDescriptor> bindWindows =  CollectionUtils.newList(super.getBindWindows());
		List<WindowDescriptor> mainWindows = getMandatoryWindows();
		for(WindowDescriptor w : mainWindows) {
			if ( !bindWindows.contains(w) ) {
				bindWindows.add(w);
			}
		}
		return bindWindows;
	}
	
	@Override
	protected List<ItemDescriptor> getBindItems(WindowDescriptor window, boolean visibleOnly) {
		
		List<ItemDescriptor> items = null;
		
		Task task = (Task)getTask();
		boolean isActive = task.getActiveWindowsList().containsValue(window) || getMandatoryWindows().contains(window); 
		if ( isActive ) { 
			items = super.getBindItems(window, visibleOnly);
		}
		else {
			//these will be the mandatory ones, no extra check for better performance
			IPredicate<CanvasDescriptor> predicate = new IPredicate<CanvasDescriptor>() {
				@Override
				public boolean filter(CanvasDescriptor cnv) {
					String name = cnv.getId();
					if ( name.equals("TEMP_CANVAS"))
						return false;
					return cnv instanceof ContentCanvasDescriptor;
				}
			};
			items = window.getItems(visibleOnly, predicate);
		}
		return items;
	}
	
	
	private List<WindowDescriptor> getMandatoryWindows() {
		WindowDescriptor win = getMainWindow();
		List<WindowDescriptor> result = CollectionUtils.newList();
		if ( win != null ) 
			result.add(win);
		return result;
	}
	
	private WindowDescriptor getMainWindow() {
		Task task = (Task)getTask();
		return task.findWindow("MAIN_WINDOW");
	}
	
	//Filter Message Binder redefinitios
	
	@Override
	protected void initializeFilters() {
		super.initializeFilters();
		
		//DEfault initiaization for security filters
		//TODO: get from configuration
		boolean security = false;
		boolean actionSecurity = true;
		boolean bindingSecurity = true;
		
		if ( security ) {
			DefaultSecurityMessageFilter filter = new DefaultSecurityMessageFilter();
			addFilter(filter);
			
			if ( actionSecurity ) {
				filter.setActionValidationEnabled(true);
			}
			
			if ( bindingSecurity ) {
				filter.setBindingValidationEnabled(true);
			}
		}
	}

	@Override
	public MessageResponse bindTo() {
		//Override to process all blocks after binding
		MessageResponse response = super.bindTo();

		// Resolve
		List<BlockData> blocks = new ArrayList<BlockData>(response.getBody().getBlocks());
		for (BlockData bd : blocks) {
			if (bd.getRecords().isEmpty()){
				MessageRequest req = getRequest();
				if (req != null){
					BlockData prevData = req.getBody().getBlock(bd.getName());
					if (prevData != null){
						if (!StringHelper.isNullOrEmpty(bd.getSelected()) && bd.getSelected().equals(prevData.getSelected()))
						{
							continue;
						}
					}
				}
				processFooterData(bd);
			}
			else{
				applyMasksToData(bd);
				processFooterData(bd);
			}
		}
		return response;
	}

	private void applyMasksToData(BlockData bd) {
		ITask task = this.getTask();
		
		/************************/
		/*MASK VALUES PROCESSING*/
		/************************/
		boolean maskItemListBuilt = false;
		Map<String, BannerFilter> maskItemList = new HashMap<String, BannerFilter>();
		for (BlockRecord record : bd.getRecords()) {
			if (!maskItemListBuilt){
				for(ItemField cell : record.getFields()){
					ItemDescriptor item = bd.getBlock().findItem(cell.getName());
					if (item != null){

						String maskValue = item.getExtension(BaseTask.VALUE_MASK);
						if(!StringHelper.isNullOrEmpty(maskValue)){
							if (item.getEnabled()){
								item.setEnabled(false);
							}
							BannerFilter filter = new BannerFilter(maskValue);
							maskItemList.put(cell.getName(), filter);
							/* Apply mask to the value */
							cell.setValue(filter.getMaskedValue(cell.getValue()));
						}
					}
				}
				maskItemListBuilt = true;
			}
			else {				
				for(String itemName : maskItemList.keySet()){
					BannerFilter filter = maskItemList.get(itemName);
					record.setValue(itemName, filter.getMaskedValue(record.getValue(itemName)));
				}
			}
			if (maskItemListBuilt && maskItemList.size() == 0)
				break;
		}
	}
	
	private void processFooterData(BlockData bd){

		/************************/
		/*		FOOTER DATA		*/
		/************************/
		ITask task = this.getTask();
		IBusinessObject model = bd.getBusinessObject(task);
		try{
			if (!task.isSuspended()){
				if(bd.getName().equals(task.getCurrentBlock())){				
					morphis.foundations.core.appsupportlib.runtime.configuration.BlockData descData = new morphis.foundations.core.appsupportlib.runtime.configuration.BlockData();
					descData.setId("BANNER_FOOTER_DATA");
					descData.setAllowDelete(false);				
					descData.setAllowInsert(false);
					descData.setAllowSearch(false);
					descData.setAllowLoad(false);
					descData.setAllowUpdate(false);
					descData.setMultiRecord(false);
					descData.setEvents(new ArrayList<EventData>());
					descData.setExtensions(new ArrayList<ExtensionData>());
					
					BlockDescriptor blockDesc = AppSupportLibSettings.getConfig().getTaskFactory().getDescriptorsFactory().createBlock((Task)task, descData);
					blockDesc.setForceModelUpdate(true);
					BlockData footer = createBlockData(blockDesc, false);
					String recordId = "";
					BlockRecord record = footer.createBlockRecord(recordId);
					footer.add(record);
					ItemField activityDatefield = new ItemField("ACTIVITY_DATE", NDate.getNull());
					ItemField userIdField = new ItemField("USER_ID", NDate.getNull());
					if (model != null && model.getConfiguration() != null) {
						IDataObjectConfiguration blockConfig = model.getConfiguration();
						for (ItemDescriptor item : bd.getBlock().getItems()){
							if(!NString.isNullOrEmpty(item.getExtension("CopyTo"))){
								String copyTo = item.getExtension("CopyTo");
								String[] copyInfo = copyTo.split("\\.");
								String blockName = copyInfo[0];
								String itemName = copyInfo[1];
								if(itemName.equals("ACTIVITY_DATE"))
									activityDatefield.setValue(Types.toCanonicalStr(model.getValue(item.getId())));
								else if(itemName.equals("USER_ID"))
									userIdField.setValue(Types.toCanonicalStr(model.getValue(item.getId())));
							}
						}
					}
					record.add(activityDatefield);
					record.add(userIdField);
					/*
					if (model != null && model.getConfiguration() != null) {
						IDataObjectConfiguration blockConfig = model.getConfiguration();
						String blockName = blockConfig.getName();
						if(blockName.contains("."))
							blockName = blockName.split("\\.")[blockName.split("\\.").length - 1];
						ItemField field = new ItemField("ACTIVITY_DATE", NDate.getNull());
						if (blockConfig.getItem(blockName + "_ACTIVITY_DATE") != null){
							field = new ItemField("ACTIVITY_DATE", model.getValue(blockName + "_ACTIVITY_DATE"));							
						}
						record.add(field);
						
						field = new ItemField("USER_ID", NDate.getNull());
						if (blockConfig.getItem(blockName + "_USERID") != null){
							field = new ItemField("USER_ID", model.getValue(blockName + "_USERID"));						
						} else if (blockConfig.getItem(blockName + "_USER") != null){
							field = new ItemField("USER_ID", model.getValue(blockName + "_USER"));						
						} else if (blockConfig.getItem(blockName + "_USER_ID") != null){
							field = new ItemField("USER_ID", model.getValue(blockName + "_USER_ID"));						
						}
						record.add(field);
						
					} else {				
						ItemField field = new ItemField("ACTIVITY_DATE", NDate.getNull());
						record.add(field);
						field = new ItemField("USER_ID", NString.getNull());
						record.add(field);
					}		*/			
					getResponse().getBody().add(footer);		
				}			
			}	
		} catch (Exception ex)	{
			//TODO: Log
		}
	}
	
	@Override
	protected void bindToBlockData(BlockDescriptor block, List<ItemDescriptor> items, IBlockController blockController,
			IBusinessObject model, boolean multirecord, boolean forceModelBind) {

		boolean doBind = 
				dataBindingRuleKeyBlock(block);

		if ( doBind )
			super.bindToBlockData(block, items, blockController, model, multirecord,forceModelBind);
	}
	
	
	private boolean dataBindingRuleKeyBlock(BlockDescriptor block) {
		if ( BannerServices.isKeyBlock(block) ) {

			//make shure key blocks are marked has BIND_ALWAYS
			if ( block.getExtension(BIND_ALWAYS_EXT) == null ) {
				block.addExtension(BIND_ALWAYS_EXT, "true");
			}
		}
		return true;
	}

	@Override
	protected void bindToBlockControl(BlockDescriptor block, List<ItemDescriptor> items, IBlockController blockController, IBusinessObject model, 
			boolean multirecord, boolean forceModelBind) 
	{
		//Binding rules
		boolean doBind = 
				controlBindingRuleDelayedBlock(block);
		
		if ( doBind )
			super.bindToBlockControl(block, items, blockController, model, multirecord, forceModelBind);
	}
	
	//**** Binding rules ****
	
	private boolean controlBindingRuleDelayedBlock(BlockDescriptor block)
	{
		//
		if ( BannerServices.isKeyBlock(block) ) {
			Boolean delayed = block.getItem(DELAYED_CONTROL_INFO);
			if ( delayed != null ) {
				//TODO: TRUE and FALSE should be enum/int values
				//NULL = never delayed
				//TRUE = is delayed and not suspended
				//FALSE = is delayed and was already suspended				
				//Note: The previous values are not used anymore because validation occurs before the suspension on clearTask in flavored forms
				
				boolean suspended = this.getTask().getAsyncState().isSuspending();
				if ( suspended )	{	
					block.setItem(DELAYED_CONTROL_INFO, Boolean.FALSE);
					return false; //No control info
				}
				String currentBlock = this.getTask().getCurrentBlock();
				BlockDescriptor cBlock = BlockServices.findBlock(currentBlock);
				boolean validBlock = cBlock.getRecordValid();
//				if ( !validBlock  && !currentBlock.equals("KEY_BLOCK") )
//					return;
				//Morphis TODO ao apagar row invalida fazia enabled ao Key block. ver bug ELLBHR-20521. Bruno Aleluia
				boolean delRecord = TaskServices.getRecordStatus(currentBlock).contains("QUERY");
				if ( (!validBlock || delRecord) && !currentBlock.equals("KEY_BLOCK") )
					return false;
				
				block.setItem(DELAYED_CONTROL_INFO, null); //clear the property
			}
		}
		return true;
	}
	
}
