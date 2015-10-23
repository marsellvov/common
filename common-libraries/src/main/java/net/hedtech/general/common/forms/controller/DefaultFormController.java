package net.hedtech.general.common.forms.controller;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import net.hedtech.general.common.dbservices.GChkAuth;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.forms.interactionStrategies.BannerInteractionStrategy;
import net.hedtech.general.common.forms.services.MenuServices;
import net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqrpls.GSd;
import net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices;
import net.hedtech.general.common.runtime.MessageBinder;
import net.hedtech.general.common.services.BannerServices;
import morphis.core.utils.behavior.Scope;
import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
import morphis.core.utils.behavior.annotations.Error;
import morphis.foundations.core.appdatalayer.events.QueryComplete;
import morphis.foundations.core.appsupportlib.exceptions.ValidationException;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.ViewServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ExecuteActionProcessor;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractFormController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.CanvasDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.WindowDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeDescriptor.TreeCacheStatus;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.TreeNode;
import morphis.foundations.core.appsupportlib.runtime.events.TaskEnded;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStartedPre;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuDefinition;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.ui.IInteractionBlock;
import morphis.foundations.core.appsupportlib.ui.InteractionBlockMode;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.appsupportlib.Globals.getGlobal;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.getItemVisible;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.setItemVisible;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.types.Types.*;

public class DefaultFormController extends AbstractFormController {

	
	private String keyBlockName = "KEY_BLOCK";
	private String keyBlockBntOkName = "KEY_BLOCK.EXECUTE_BTN";
	private String keyBlockBtnRollBackName = "KEY_BLOCK.KEY-CLRFRM_BTN";
	
	private boolean hasKeyBlockLogic = false;
	private int nextBlockLogic = 0;
	protected List<CanvasDescriptor> hiddenCanvas = new ArrayList<CanvasDescriptor>();
	

	public DefaultFormController(ITask task) {
		this(task, true);
	}
	
	public DefaultFormController(ITask task, boolean hasKeyBlockFunction) {
		super(task);
		
		if(hasKeyBlockFunction){
			if(this.keyBlockName == null || this.keyBlockName.isEmpty()) {
				this.setKeyBlockName("KEY_BLOCK");
			}
			
	//		if (this.task.findBlock("KEY_BLOCK") != null && this.task.findItem("KEY_BLOCK", "EXECUTE_BTN") != null)
			if (this.task.findBlock(this.keyBlockName) != null && this.task.findItem(this.keyBlockName, "EXECUTE_BTN") != null)
				this.hasKeyBlockLogic = true;
		}
		else
			this.hasKeyBlockLogic = hasKeyBlockFunction;
		
	}
	
	public DefaultFormController(ITask task, String thisKeyBlockName) {
		super(task);
		
		setKeyBlockName(thisKeyBlockName);
		
//		if (this.task.findBlock("KEY_BLOCK") != null && this.task.findItem("KEY_BLOCK", "EXECUTE_BTN") != null)
		if (this.task.findBlock(this.keyBlockName) != null && this.task.findItem(this.keyBlockName, "EXECUTE_BTN") != null)
			hasKeyBlockLogic = true;
	}
	
	public boolean getHasKeyBlockLogic(){
		return hasKeyBlockLogic;
	}

	//Common libraries
	public EoqrplsServices getEoqrpls()
	{
		return (EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS");
	}
	
	public GoqrplsServices getGoqrpls()
	{
		return (GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS");
	}
	
	//Common Task parts
	public GoqolibTaskPart getGoqolibPart()
	{
		return (GoqolibTaskPart)this.getTask().getTaskPart("GOQOLIB");
	}
	
	//Property classes Services
	private GFormClass getGFormClass() {
		return (GFormClass) this.getGoqolibPart().getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	
	public String getKeyBlockName(){
		return keyBlockName;
	}
	
	public void setKeyBlockName(String value){
		if(value!= null && !value.isEmpty()) {
			keyBlockName = value;
			keyBlockBntOkName = value + ".EXECUTE_BTN";
			keyBlockBtnRollBackName = value + ".KEY-CLRFRM_BTN";
		}
		else {
			keyBlockName = "KEY_BLOCK";
			keyBlockBntOkName = "KEY_BLOCK.EXECUTE_BTN";
			keyBlockBtnRollBackName = "KEY_BLOCK.KEY-CLRFRM_BTN";
		}
	}
	
	
	@After(scope = Scope.All)
	@TaskStartedPre
	public void defaultPreForm(EventObject args)
	{
		BannerServices.setReadOnlyProperties(getTask());
		
		this.createMenu();
		filterMenu();
		
		
	}
	
	@Before(scope = Scope.All)
	@ActionTrigger(function = KeyFunction.BLOCK_CHANGE)
	public void defaultBlockChange()
	{
		filterMenu();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
	public void defaultClearForm()
	{
		//Force the validation to be active because it might be missing the reset on out actions of cleared record/items
		this.getTask().setValidationEnabled(true);
	}
	
	@ActionTrigger(action="FILTER_MENU")
	public void filterMenu()
	{
		try{
			
			MenuDefinition menu = ((BaseTask)getTask()).getMenuServices().getBlockFilteredOptions("GoTo", getTask().getName(), TaskServices.getCurrentBlock().getValue());
			
			if(menu != null)
			{
				BlockDescriptor menuBlock = BlockServices.findBlock("MENU_CONTROL");
				if(menuBlock != null)
				{
					ItemDescriptor itemDescriptor = menuBlock.findItem("GOTO_MENU");
					
					if(itemDescriptor != null)
					{
						TreeDescriptor treeDescriptor = (TreeDescriptor) itemDescriptor;
						
						for (TreeNode node : treeDescriptor.getRootNode().getChildren())
						{
							node.setVisible(false);
						}
						
						for (TreeNode node : menu.getChildren())
						{
							TreeNode n = treeDescriptor.findNode(node.getId());
							if (n != null)
								n.setVisible(true);
						}
						
						
					
						
						treeDescriptor.setCacheable(true);
						treeDescriptor.setCacheStatus(TreeCacheStatus.Changed);
						
						getTask().addCommand(getTask().getCommandDescriptorFactory().createBindMenuCommand(getTask(), menu.getId(), "MENU_CONTROL", "GOTO_MENU"));
					}
				}
				
				
			}
				
			
		}catch(Exception menuEx)
		{
		}
		
		this.setWorkspaceButtons();
	}
	
	
	private void setWorkspaceButtons()
	{
		// set select button visible or not
				if (TaskServices.getCurrentTask().getParent() == null || TaskServices.getCurrentTask().getParent().isWorkspace()||
						toStr(TaskServices.getCurrentTask().getModel().getParam("RELATED_FORM_CALL")).equalsIgnoreCase("Y"))
				{
					ItemServices.setItemVisible("MENU_CONTROL.SELECT_BT",true);
					ItemServices.setItemVisible("MENU_CONTROL.SELECT_BT",false);
					ItemServices.setItemVisible("MENU_CONTROL.CANCEL_BT",true);
					ItemServices.setItemVisible("MENU_CONTROL.CANCEL_BT",false);
				}
				else
				{
					ItemServices.setItemVisible("MENU_CONTROL.SELECT_BT",false);
					ItemServices.setItemVisible("MENU_CONTROL.SELECT_BT",true);
					
					ItemServices.setItemVisible("MENU_CONTROL.CANCEL_BT",false);
					ItemServices.setItemVisible("MENU_CONTROL.CANCEL_BT",true);
				}
				
				Boolean queryOnlyTask = (Boolean)TaskServices.getCurrentTask().getModel().getParams().getItemValue(Task.TASK_PARAMS, "QUERY_ONLY");
				NString block = TaskServices.getCurrentBlock().toUpper();
				
				if ((queryOnlyTask != null && queryOnlyTask.booleanValue()) || BannerServices.isQueryOnlyTask(TaskServices.getCurrentTask()) 
					|| BlockServices.getBlockMode(TaskServices.getCurrentBlock().getValue()) == InteractionBlockMode.Search ||
					block.equals("KEY_BLOCK"))
				{
					ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",true);
					ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",false);
				}
				else
				{
					ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",false);
					ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",true);
				}
	}

	@ActionTrigger(action="UPDATE_MENU")
	private void createMenu()
	{
		try {

			BlockDescriptor menuBlock = BlockServices.findBlock("MENU_CONTROL");
			if(menuBlock != null)
			{
				ItemDescriptor itemDescriptor = menuBlock.findItem("GOTO_MENU");
				
				if(itemDescriptor != null)
				{
					TreeDescriptor treeDescriptor = (TreeDescriptor) itemDescriptor;
					try{
						
						MenuDefinition menu = ((BaseTask)getTask()).getMenuServices().getOptionsMenuDefinition("GoTo", getTask().getName(), TaskServices.getCurrentBlock().getValue());
						
						if(menu != null)
						{
							treeDescriptor.clear();
							treeDescriptor.setCacheable(true);
							treeDescriptor.setCacheStatus(TreeCacheStatus.Changed);
							
							treeDescriptor.addTreeNode(null, menu);
							
							
						}
						
					}catch(Exception menuEx)
					{
						
					}
				}
			}
			
		} catch (Exception e) {

		}
	}
	
	@ActionTrigger(action="FORM_EVENT")
	public void formEvent(String name, String value)
	{
		
		String eventName = name.toUpperCase();
		((net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getLibrary("GOQRPLS")).getGXe().xeController(toStr(eventName), toStr(value));
	}
	
	@ActionTrigger(action="POST-FORM")
	public void postForm()
	{
		executeAction("SAVE_KEYS");
	}
	
	
	@ActionTrigger(action="DISPLAY_ID_IMAGE")
	public void displayIdImage()
	{
		((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gDisplayImage();
	}
	
	@ActionTrigger(action="WORKFLOW_EVENT")
	public void workflowEvent(String name, String value)
	{
		String eventName = name.toUpperCase(); //SHOW
		boolean mode = Boolean.valueOf(value); //true, false
		//((net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getGoqolibPart().getSupportCodeManager().getLibrary("GOQWFLW")).getGWfDriver().setWorkspaceMode(mode);

	}
	
	@ActionTrigger(action="WF_RELEASE")
	public void workflowRelease()
	{
		getGoqolibPart().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_RELEASE"));		
	}
	
	@ActionTrigger(action="WF_SUBMIT")
	public void workflowSubmit()
	{
		getGoqolibPart().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_SUBMIT"));		
	}
	
	@ActionTrigger(action="BDM_ADD")
	public void bdmAdd()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3), toInt(0));
	}
	
	@ActionTrigger(action="BDM_RETRIEVE")
	public void bdmRetrive()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(1));
	}
	
	@ActionTrigger(action="BDM_COUNT")
	public void bdmCount()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(2));
	}
	
	@ActionTrigger(action="BDM_SCAN")
	public void bdmScan()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(13));
	}
	
	@ActionTrigger(action="BDM_PASTE")
	public void bdmPaste()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(9));
	}
	
	@ActionTrigger(action="BDM_PASTE_SPECIAL")
	public void bdmPasteSpecial()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(10));
	}
	
	@ActionTrigger(action="BDM_INSERT_OBJS")
	public void bdmInsertObjs()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(11));
	}
	
	@ActionTrigger(action="BDM_IMPORT_FILE")
	public void bdmImportFile()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(12));
	}
	
	@ActionTrigger(action="BDM_FAXIN")
	public void bdmFaxIn()
	{	
		((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgDriver2().pCallXs(toInt(3),toInt(14));
	}
	
	
	@ActionTrigger(action="VPDI_COMPONENT")
	public void callVpdiComponent()
	{	
		((net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getLibrary("GOQRPLS")).getGVpdi().callVpdiComponent();
	}
	
	/*BEGIN
	  IF CHANGES_PENDING THEN
	    RETURN;
	  END IF;
	--
	  IF NOT E$_IMG_UTIL.F_IS_BXS_USER() THEN
	    E$_IMG_UTIL.P_SHOW_MSG(E$_IMG_UTIL.IMG_NOT_AX_USER_CON);	
	    RETURN;
	  END IF;  
	--
	  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	  G$_CHECK_FAILURE;
	  G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),
	                       E$_IMG_UTIL.F_GET_FORM_NAME(0),
	                       E$_IMG_UTIL.F_GET_FORM_MODE(0));
	END;*/
	
	@ActionTrigger(action="BDM_PREFS")
	public void bdmPreferences()
	{	
		//MORPHIS TODO:
		/*
		 * Missing 1st IF 
		 */
		
		if (((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgUtil().fIsBxsUser() == new NBool(false)){
			//MORPHIS: TODO: Check if message or img_util.showmessage
			message(((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgUtil().IMG_NOT_AX_USER_CON);
			return;
		}
		//
		executeAction("G$_REVOKE_ACCESS");
		((GoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("GOQRPLS")).gSecuredFormCall(
				getGlobal("CURRENT_USER"), 
				((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgUtil().fGetFormName(toInt(0)),
				((EoqrplsServices)this.getTask().getSupportCodeManager().getLibrary("EOQRPLS")).getEImgUtil().fGetFormMode(toInt(0)));
		
	}
	
	@Before(scope = Scope.All)
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void beforeNextBlock() {
		++this.nextBlockLogic;
		if (this.hasKeyBlockLogic && this.nextBlockLogic == 1){
			if (this.hiddenCanvas.size() > 0){		
				for(CanvasDescriptor canvas : hiddenCanvas){
					ViewServices.showView(canvas);
				}
			}
		}
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void afterNextBlock() {
		--this.nextBlockLogic;
		if (this.hasKeyBlockLogic && this.nextBlockLogic == 0){
			
//			CanvasDescriptor keyblockCanvas = ItemServices.findItem("KEY_BLOCK", "EXECUTE_BTN").getCanvas();
			CanvasDescriptor keyblockCanvas = ItemServices.findItem(this.keyBlockName, "EXECUTE_BTN").getCanvas();
			WindowDescriptor keyblockWindow = keyblockCanvas.getCanvasWindow();
			CanvasDescriptor currentCanvas = ItemServices.findItem(TaskServices.getCursorField()).getCanvas();
			WindowDescriptor currentWindow = currentCanvas.getCanvasWindow();
			if (keyblockWindow.equals(currentWindow)){
				hideNonModalWindows(keyblockWindow, ((Task)keyblockWindow.getTask()));
//				if (this.hiddenCanvas.size() > 0 && TaskServices.getCurrentBlock().equals("KEY_BLOCK") && keyblockCanvas.equals(currentCanvas)){
				if (this.hiddenCanvas.size() > 0 && TaskServices.getCurrentBlock().equals(this.keyBlockName) && keyblockCanvas.equals(currentCanvas)){
					for(CanvasDescriptor canvas : hiddenCanvas){
						ViewServices.hideView(canvas);
					}
				}
				else{
					hiddenCanvas.clear();
				}
			}
		}
		TaskServices.doNavigation();
	}
	
	private void hideNonModalWindows(WindowDescriptor mainWindow, Task task) {
		for(WindowDescriptor test : task.getActiveWindowsList().values()){
			if(!test.equals(mainWindow)){
//				for(CanvasDescriptor canvas : test.getCanvas().values()){
//					ICommandDescriptorFactory commandFactory = task.getCommandDescriptorFactory();
//					task.addCommand(commandFactory.createHideCanvasCommand(canvas));	
//				}
				ViewServices.hideWindow(test);
			}
		}
	}


	@Error(scope = Scope.All)
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void nextBlockFailed(Exception error) throws Exception {
		this.afterNextBlock();
		throw error;
	}
	
	@Before(scope = Scope.All)
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void GoStartOverButtonsLogic() {
		if (this.hasKeyBlockLogic){
//			CanvasDescriptor keyblockCanvas = ItemServices.findItem("KEY_BLOCK", "EXECUTE_BTN").getCanvas();
			CanvasDescriptor keyblockCanvas = ItemServices.findItem(this.keyBlockName, "EXECUTE_BTN").getCanvas();
			WindowDescriptor keyblockWindow = keyblockCanvas.getCanvasWindow();
			CanvasDescriptor currentCanvas = ItemServices.findItem(TaskServices.getCursorField()).getCanvas();
			WindowDescriptor currentWindow = currentCanvas.getCanvasWindow();
			if (keyblockWindow.equals(currentWindow) || (currentWindow != null && !currentWindow.getModal())){
				hideNonModalWindows(keyblockWindow, ((Task)keyblockWindow.getTask()));
//				if(TaskServices.getCurrentBlock().equals("KEY_BLOCK")){
				if(TaskServices.getCurrentBlock().equals(this.keyBlockName)){
					if (keyblockCanvas.equals(currentCanvas)){
//						if (getItemVisible("KEY_BLOCK.EXECUTE_BTN").isFalse()){
						if (getItemVisible(this.keyBlockBntOkName).isFalse()){
							hiddenCanvas.clear();						
							for (CanvasDescriptor canvas : keyblockWindow.getCanvas().values()){
								if (!canvas.getId().equals(keyblockCanvas.getId()) && !canvas.getId().equals("G$_WELCOME_CANVAS") &&
										canvas.getVisible()){
									ViewServices.hideView(canvas);
									hiddenCanvas.add(canvas);
								}
							}
//							setItemVisible("KEY_BLOCK.EXECUTE_BTN", true);
							setItemVisible(this.keyBlockBntOkName, true);
//							setItemVisible("KEY_BLOCK.KEY-CLRFRM_BTN", false);	
							setItemVisible(this.keyBlockBtnRollBackName, false);					
							ViewServices.showView("G$_WELCOME_CANVAS");					
						}
						else if(hiddenCanvas.size() == 0){
							for (CanvasDescriptor canvas : keyblockWindow.getCanvas().values()){
								if (!canvas.getId().equals(keyblockCanvas.getId()) && !canvas.getId().equals("G$_WELCOME_CANVAS") &&
										canvas.getVisible()){
									ViewServices.hideView(canvas);
									hiddenCanvas.add(canvas);
								}
							}
							ViewServices.showView("G$_WELCOME_CANVAS");
						}
//						else if(hiddenCanvas.size() > 0 && getItemVisible("KEY_BLOCK.EXECUTE_BTN").isTrue()){
						else if(hiddenCanvas.size() > 0 && getItemVisible(this.keyBlockBntOkName).isTrue()){
							for (CanvasDescriptor canvas : hiddenCanvas){
								if (!canvas.getId().equals(keyblockCanvas.getId()) && canvas.getVisible() && !canvas.getId().equals("G$_WELCOME_CANVAS")){
									ViewServices.hideView(canvas);
								}
							}
							ViewServices.showView("G$_WELCOME_CANVAS");
						}
					}
				}
//				else if (TaskServices.getTriggerBlock() != null && getItemVisible("KEY_BLOCK.EXECUTE_BTN").isTrue()){
				else if (TaskServices.getTriggerBlock() != null && getItemVisible(this.keyBlockBntOkName).isTrue()){
//					setItemVisible("KEY_BLOCK.EXECUTE_BTN", false);
					setItemVisible(this.keyBlockBntOkName, false);
//					setItemVisible("KEY_BLOCK.KEY-CLRFRM_BTN", true);
					setItemVisible(this.keyBlockBtnRollBackName, true);
					ViewServices.hideView("G$_WELCOME_CANVAS");
					for(CanvasDescriptor canvas : hiddenCanvas){
						ViewServices.showView(canvas);
					}
					hiddenCanvas.clear();				
				}
			}
		}
	}
		
	@ActionTrigger(action = "SUP_DATA_ENG")
	public void suplementalDataEngine() {
		
		if(findItem(GSd.C_SDKEY_SD_BLOCK) == null)
			return;
		
		if (!TaskServices.getNameIn(GSd.C_SDKEY_SD_BLOCK).isNull())
			
			getGoqrpls().getGSd().pMenuHandler(GSd.C_SD_MNU_NAME);		
	}
	
	@Before(scope = Scope.All)
	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	public void supplementalDataEngineSetup() {
		
		try{
			if(!this.task.isEnded()){
				String block = this.task.getTriggerBlock();
				if (BlockServices.getBlockMode(block) != InteractionBlockMode.Search)
					getGFormClass().blockInSetupSDE();
			}
		} catch (Exception e){
			//TODO: Log?
		}
		
	}
	
	@After(scope = Scope.All)
	@QueryComplete		
	public void configureSupplementalDataQueryComplete(EventObject ev) {
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.EXIT)	
	public void configureSupplementalDataEngineExit() {
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.CLEAR_FORM)
	public void configureSupplementalDataEngineClearForm(){
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.CLEAR_BLOCK)	
	public void configureSupplementalDataEngineClearBlock() {
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.CLEAR_RECORD)	
	public void configureSupplementalDataEngineClearRecord() {
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.EXECUTE_QUERY)	
	public void configureSupplementalDataEngineExecuteQuery() {
		supplementalDataEngineSetup();
	}
	
	@After(scope = Scope.All)
	@ActionTrigger(function=KeyFunction.SAVE)	
	public void configureSupplementalDataEngineSave() {
		supplementalDataEngineSetup();
	}
	
	//See MessageBinder
	//Action to 'freeze' control info until next non-suspending message
	@After(scope = Scope.All)
	@ActionTrigger(action="ENABLE_KEYS")
	public void afterEnableKeys() {
		BlockDescriptor b = this.task.findBlock("KEY_BLOCK");
		if ( b != null && !BannerServices.isInKeyBlock(b) ) {
			b.setItem(MessageBinder.DELAYED_CONTROL_INFO, Boolean.TRUE);
		}
	}
	
	
	
	//**** Temporary methods for replacing TaskServices ****
	//This implementation is valid solves some problems without changing the form code or compromising the future solution
	//Currently only test f implementation for cleartask
	
	/*
	 * All builtin classes static imports should be replaced in the code by the ones from the chosen API (flavor), where :
	 * 1. All builtins should mark the FORM SUCESS flag in case of failure
	 * 2. Every call to a builtin should reset the flag at the start
	 * 3. The exception to be always captured is an RunTimeException originated by an ApplicationException
	 *    (Temporary ValidationException here only)
	 * 4. Builtins delegate the behavior to the corresponding framework Service class
	 */
	
	public static void clearTask()
	{
		TaskServices.clearFormSucess();
		try {
			TaskServices.clearTask();
		}
		catch(ValidationException ex) {
			//ex.printStackTrace();
			TaskServices.setFormSucess(false);
		}
	}
	
	protected void clearTask(NNumber commitMode) {
		TaskServices.clearFormSucess();
		try {
			TaskServices.clearTask(commitMode);
		}
		catch(ValidationException ex) {
			//ex.printStackTrace();
			TaskServices.setFormSucess(false);
		}
	}

}
