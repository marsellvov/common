package net.hedtech.general.common.forms.controller;
 
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.nextItem;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCurrentItem;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;

public class DefaultKeyBlockController extends DefaultBlockController {


	public DefaultKeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
	/**
	 * Utility method to do a nextItem skiping the GO button
	 */
	protected void nextFieldItem() {
		nextItem();
		if ( getCurrentItem().equals("EXECUTE_BTN") )
			nextItem();
	}
	
	
}

