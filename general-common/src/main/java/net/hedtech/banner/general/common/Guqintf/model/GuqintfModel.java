package net.hedtech.banner.general.common.Guqintf.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;








public class GuqintfModel extends FormModel {
	
	
	public GuqintfModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public Dummy getDummy() 
	{
		return (Dummy) getBusinessObject("DUMMY");
	}

	public IDBBusinessObject getGjbprun() 
	{
		return (IDBBusinessObject) getBusinessObject("GJBPRUN");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

