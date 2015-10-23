package net.hedtech.banner.finance.common.Foqaddr.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;

//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;

import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;




import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;


import net.hedtech.general.common.libraries.Goqolib.model.GExtendedSearchBlock;





public class FoqaddrModel extends FormModel {
	
	
	public FoqaddrModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getSpraddr() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRADDR");
	}

	public GOptBlock getGOptBlock() 
	{
		return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

	public GExtendedSearchBlock getGExtendedSearchBlock() 
	{
		return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
	}


}

		

