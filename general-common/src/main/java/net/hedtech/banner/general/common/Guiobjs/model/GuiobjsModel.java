package net.hedtech.banner.general.common.Guiobjs.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;



import net.hedtech.banner.general.common.Guiobjs.controller.ButtonControlBlockController;
//import com.ellucian.forms.Null.model.ButtonControlBlock;





public class GuiobjsModel extends FormModel {
	
	
	public GuiobjsModel(ITask task, Hashtable parameters){
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

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public IDBBusinessObject getGubobjs() 
	{
		return (IDBBusinessObject) getBusinessObject("GUBOBJS");
	}

	public ButtonControlBlockController getButtonControlBlock() 
	{
		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

