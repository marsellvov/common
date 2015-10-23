package net.hedtech.general.common.forms.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class BaseModel extends FormModel {
	
	
	public BaseModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public MenuControl getMenuControl() 
	{
		return (MenuControl) getBusinessObject("MENU_CONTROL");
	}
}

		

