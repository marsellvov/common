package net.hedtech.banner.general.common.BannerMain.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.workspace.forms.main.model.MainModel;





public class BannerMainModel extends MainModel {
	
	
	public BannerMainModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public Display getDisplay() 
	{
		return (Display) getBusinessObject("DISPLAY");
	}

	public IDBBusinessObject getGuiseti() 
	{
		return (IDBBusinessObject) getBusinessObject("GUISETI");
	}
}

		

