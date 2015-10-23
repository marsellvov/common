package net.hedtech.general.common.libraries.Goqolib.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class GoqolibModel extends FormPartModel {
	
	
	public GoqolibModel(ITaskPart task){
		super(task);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public Gubobjs getGubobjs() 
	{
		return (Gubobjs) getBusinessObject("GUBOBJS");
	}

	public GExtendedSearchBlock getGExtendedSearchBlock() 
	{
		return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
	}

	public GFuncBaseInfoBlock getGFuncBaseInfoBlock() 
	{
		return (GFuncBaseInfoBlock) getBusinessObject("G$_FUNC_BASE_INFO_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public GOptBlock getGOptBlock() 
	{
		return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
	}

	public GVpdiBlock getGVpdiBlock() 
	{
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public LibFormHeader getLibFormHeader() 
	{
		return (LibFormHeader) getBusinessObject("LIB$FORM_HEADER");
	}

	public IDBBusinessObject getQkMenu() 
	{
		return (IDBBusinessObject) getBusinessObject("QK_MENU");
	}

	public IDBBusinessObject getQkFlow() 
	{
		return (IDBBusinessObject) getBusinessObject("QK_FLOW");
	}

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}


}

		

