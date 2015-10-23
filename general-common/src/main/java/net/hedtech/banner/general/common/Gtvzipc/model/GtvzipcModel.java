package net.hedtech.banner.general.common.Gtvzipc.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;



import net.hedtech.banner.general.common.Gtvzipc.controller.ButtonControlBlockController;
//import com.ellucian.forms.Null.model.ButtonControlBlock;





public class GtvzipcModel extends FormModel {
	
	
	public GtvzipcModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getGtvzipcBlock() 
	{
		return (IDBBusinessObject) getBusinessObject("GTVZIPC_BLOCK");
	}

	public ButtonControlBlockController getButtonControlBlock() 
	{
		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

