package net.hedtech.banner.finance.common.Fraprop.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;


//import com.ellucian.forms.Goqolib.model.GSdkey;
//import com.ellucian.forms.Goqolib.model.GSdispManager;
//import com.ellucian.forms.Goqolib.model.GVpdiBlock;
//import com.ellucian.forms.Goqolib.model.GNavBlock;
//import com.ellucian.forms.Goqolib.model.GExtendedSearchBlock;
//import com.ellucian.forms.Null.model.ButtonControlBlock;
//import com.ellucian.forms.Goqolib.model.GOptBlock;

import net.hedtech.banner.finance.common.Fraprop.controller.ButtonControlBlockController;

import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GExtendedSearchBlock;


public class FrapropModel extends FormModel {
	
	
	public FrapropModel(ITask task, Hashtable parameters){
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

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public IDBBusinessObject getFrbprop() 
	{
		return (IDBBusinessObject) getBusinessObject("FRBPROP");
	}

	public IDBBusinessObject getFrrprpt() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRPRPT");
	}

	public IDBBusinessObject getFrrpusn() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRPUSN");
	}

	public IDBBusinessObject getFrrploc() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRPLOC");
	}

	public IDBBusinessObject getFrrprpi() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRPRPI");
	}

	public GExtendedSearchBlock getGExtendedSearchBlock() 
	{
		return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
	}

	public Block5 getBlock5() 
	{
		return (Block5) getBusinessObject("BLOCK5");
	}

//	public ButtonControlBlock getButtonControlBlock() 
//	{
//		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
//	}
	public ButtonControlBlockController getButtonControlBlock() 
	{
		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}
	public NavigateTo getNavigateTo() 
	{
		return (NavigateTo) getBusinessObject("NAVIGATE_TO");
	}

	public CopyBlock getCopyBlock() 
	{
		return (CopyBlock) getBusinessObject("COPY_BLOCK");
	}

	public GOptBlock getGOptBlock() 
	{
		return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
	}


}

		

