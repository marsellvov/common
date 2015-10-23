package net.hedtech.banner.general.common.Gutpmnu.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;

//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;

import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;






//import com.ellucian.forms.Null.model.ButtonControlBlock;

//import net.hedtech.general.common.libraries.Goqolib.model.QkFlowManager;
//
//import net.hedtech.general.common.libraries.Goqolib.model.QkMenuManager;





public class GutpmnuModel extends FormModel {
	
	
	public GutpmnuModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getGubobjs() 
	{
		return (IDBBusinessObject) getBusinessObject("GUBOBJS");
	}

	public IDBBusinessObject getGurmenu() 
	{
		return (IDBBusinessObject) getBusinessObject("GURMENU");
	}

	public IDBBusinessObject getGurmenu2() 
	{
		return (IDBBusinessObject) getBusinessObject("GURMENU2");
	}

	public IDBBusinessObject getAllUsersBlock() 
	{
		return (IDBBusinessObject) getBusinessObject("ALL_USERS_BLOCK");
	}

	public IDBBusinessObject getButtonControlBlock() 
	{
		return (IDBBusinessObject) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

	public IDBBusinessObject getQkFlow() 
	{
		return (IDBBusinessObject) getBusinessObject("QK_FLOW");
	}

	public IDBBusinessObject getQkMenu() 
	{
		return (IDBBusinessObject) getBusinessObject("QK_MENU");
	}


}

		

