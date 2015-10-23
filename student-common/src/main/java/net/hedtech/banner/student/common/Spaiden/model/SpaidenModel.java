package net.hedtech.banner.student.common.Spaiden.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;


import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;













import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GExtendedSearchBlock;





public class SpaidenModel extends FormModel {
	
	
	public SpaidenModel(ITask task, Hashtable parameters){
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

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public IDBBusinessObject getSpridenCurrent() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRIDEN_CURRENT");
	}

	public IDBBusinessObject getSpridenPrevious() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRIDEN_PREVIOUS");
	}

	public IDBBusinessObject getSpraddr() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRADDR");
	}

	public IDBBusinessObject getSprtele() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRTELE");
	}

	public IDBBusinessObject getSpbpers() 
	{
		return (IDBBusinessObject) getBusinessObject("SPBPERS");
	}

	public IDBBusinessObject getGorprac() 
	{
		return (IDBBusinessObject) getBusinessObject("GORPRAC");
	}

	public IDBBusinessObject getGoremal() 
	{
		return (IDBBusinessObject) getBusinessObject("GOREMAL");
	}

	public IDBBusinessObject getSpremrg() 
	{
		return (IDBBusinessObject) getBusinessObject("SPREMRG");
	}

	public IDBBusinessObject getGoradid() 
	{
		return (IDBBusinessObject) getBusinessObject("GORADID");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public GOptBlock getGOptBlock() 
	{
		return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
	}

	public GExtendedSearchBlock getGExtendedSearchBlock() 
	{
		return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
	}


}

		

