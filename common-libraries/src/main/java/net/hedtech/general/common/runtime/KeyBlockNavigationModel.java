package net.hedtech.general.common.runtime;

import net.hedtech.general.common.forms.controller.DefaultFormController;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.DefaultNavigationModel;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsNavigationModel;

public class KeyBlockNavigationModel extends FormsNavigationModel {

	public KeyBlockNavigationModel() {
		super();
	}

	public KeyBlockNavigationModel(Task owner) {
		super(owner);		
	}
	
	@Override
	public void performAfterEventExecution(boolean isValidated){
		ItemDescriptor item = null;
		boolean prevValue = false;
		
		//check if the task has closed
		if ( ownerTask.isEnded() ) {
			super.performAfterEventExecution(isValidated);
			return;
		}
		
		try {				
			DefaultFormController defController = null;
			if (ownerTask.getFormController() instanceof DefaultFormController)
				defController = (DefaultFormController)ownerTask.getFormController();
			if(defController != null && defController.getHasKeyBlockLogic()){
//				item = ItemServices.findItem("KEY_BLOCK", "KEY-CLRFRM_BTN");
				item = ItemServices.findItem(defController.getKeyBlockName(), "KEY-CLRFRM_BTN");
				if(item != null){
					prevValue = item.getNavigable();
					item.setNavigable(false);
				}
				ItemDescriptor goItem = ItemServices.findItem(defController.getKeyBlockName(), "EXECUTE_BTN");
				if(goItem != null){					
					goItem.setNavigable(true);
				}
					
			}
			
			super.performAfterEventExecution(isValidated);
			if (ownerTask.isEnded() || ownerTask != Task.getCurrent())
					return;
			
			
			if (defController != null){
				defController.GoStartOverButtonsLogic();
			}
		}
		finally{
			if (item != null)
				item.setNavigable(false);
		}
	}
	
	
	@Override
	public boolean performEndTaskNavigation(){
		boolean retVal = super.performEndTaskNavigation();		
		DefaultFormController defController = null;
		if (TaskServices.getCurrentTask() != null && TaskServices.getCurrentTask().getFormController() instanceof DefaultFormController)
			defController = (DefaultFormController)TaskServices.getCurrentTask().getFormController();
		if(defController != null && defController.getHasKeyBlockLogic()){
			defController.filterMenu();
		}
		return retVal;
	}
}
