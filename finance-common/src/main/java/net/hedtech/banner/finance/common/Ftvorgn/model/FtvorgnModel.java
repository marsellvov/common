package net.hedtech.banner.finance.common.Ftvorgn.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;

//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;

import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;



// import com.ellucian.forms.Null.model.ButtonControlBlock;





public class FtvorgnModel extends FormModel {
	
	
	public FtvorgnModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getFtvorgn() 
	{
		return (IDBBusinessObject) getBusinessObject("FTVORGN");
	}

//	public ButtonControlBlock getButtonControlBlock() 
//	{
//		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
//	}


}

		

