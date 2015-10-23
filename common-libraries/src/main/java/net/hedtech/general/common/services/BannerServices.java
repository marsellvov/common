package net.hedtech.general.common.services;

import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.ITaskPart;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;

/*
 * Global classe with utility methods specific for the Banner application
 */
public class BannerServices {

	static public boolean isKeyBlock(BlockDescriptor block) {
		// In original Banner key blocks where definid by having the defaultWhereClause as 'KEY-BLOCK'
		//TODO: Currently we check this by name, until more info is defined on the struct (or other mechanism)
		
		return block.getId().contains("KEY_BLOCK");
	}
	
	static public boolean isInKeyBlock(BlockDescriptor keyBlock) {
		// Checks if the executeButton is visible to decide is focus is set on KeyBlock or not.
		// Context: AfterEnableKeys on DefaultFormController created a conflict with a form (GOADDAD) that
		// 		performed EnableKeys action on KeyBlock.blockIn(), which is not a usual pattern. 
		// 		This caused the BlockCtrl info to not show on server response.
		// TODO: This verification may need to be done in another way (ex. TriggerItem.getBlock, CurrentBlock)
		
		ItemDescriptor executeButton = ItemServices.findItem(keyBlock.getId(), "EXECUTE_BTN");
		
		if (executeButton != null)
			return executeButton.getVisible();
		else
			return false;
		
	}
	
	static public boolean isQueryOnlyTask(ITask task) {
		
		boolean isReadOnly = false;
		
		String name = task.getName();
		
		if (name.length() > 3 && (name.substring(2, 3).equalsIgnoreCase("I") || name.substring(2, 3).equalsIgnoreCase("Q")))
		{
			ITaskPart goqolib = task.getTaskPart("GOQOLIB");
			
			if (goqolib != null)
			{
				try{
					ISupportCodeObject pkg = goqolib.getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
					if (pkg != null)
						isReadOnly=true;
				}
				catch(RuntimeException e){}				
			}
		}		
		return isReadOnly;
	}
	
	static public void setReadOnlyProperties(ITask task) {
		if (BannerServices.isQueryOnlyTask(task))
		{
			for (BlockDescriptor block : task.getBlockDescriptors())
			{
				block.addExtension("DISABLE_ACTIONS", "Y");
			}
		}
	}
	
	static public void goItem(NString itemName) {
		ItemDescriptor item = ItemServices.findItem(itemName);
		if (item != null)
			BannerServices.goItem(item);
	}
	
	
	static public void goItem(ItemDescriptor item) {
		if (item != null)
		{
			ItemServices.goItem(item);
			
			if (!item.getFullId().equals(TaskServices.getCurrentBlock() + "." + TaskServices.getCurrentField()))
			{
				InteractionManager.getInteractionState().addAttribute(Task.TASK_EVENT_FAILURE, true);
			}
		}
	}
}
