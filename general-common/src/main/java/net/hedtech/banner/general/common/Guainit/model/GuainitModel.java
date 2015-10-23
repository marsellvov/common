package net.hedtech.banner.general.common.Guainit.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class GuainitModel extends FormModel {
	
	
	public GuainitModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public Display getDisplay() 
	{
		return (Display) getBusinessObject("DISPLAY");
	}


}

		

