package net.hedtech.banner.general.common.Gormedr.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;

//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;

import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;



//import com.ellucian.forms.Null.model.ButtonControlBlock;




public class GormedrModel extends FormModel {
	
	
	public GormedrModel(ITask task, Hashtable parameters){
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

	public GVpdiBlock getGVpdiBlock() 
	{
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public IDBBusinessObject getStvmedi() 
	{
		return (IDBBusinessObject) getBusinessObject("STVMEDI");
	}

	public IDBBusinessObject getGormedr() 
	{
		return (IDBBusinessObject) getBusinessObject("GORMEDR");
	}

//	public ButtonControlBlockController getButtonControlBlock() 
//	{
//		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
//	}


}

		

