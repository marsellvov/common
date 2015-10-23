package net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.banner.finance.common.Fragrnt.controller.ButtonControlBlockController;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;














import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GExtendedSearchBlock;
//import com.ellucian.forms.Null.model.ButtonControlBlock;





public class FragrntModel extends FormModel {
	
	
	public FragrntModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getFrbgrnt() 
	{
		return (IDBBusinessObject) getBusinessObject("FRBGRNT");
	}

	public IDBBusinessObject getFrragpt() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRAGPT");
	}

	public IDBBusinessObject getFrrgusn() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRGUSN");
	}

	public IDBBusinessObject getFrrgloc() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRGLOC");
	}

	public IDBBusinessObject getFrbgbil() 
	{
		return (IDBBusinessObject) getBusinessObject("FRBGBIL");
	}

	public IDBBusinessObject getFrrgrpi() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRGRPI");
	}

	public IDBBusinessObject getFrrgrec() 
	{
		return (IDBBusinessObject) getBusinessObject("FRRGREC");
	}

	public Block3 getBlock3() 
	{
		return (Block3) getBusinessObject("BLOCK3");
	}

	public Block5 getBlock5() 
	{
		return (Block5) getBusinessObject("BLOCK5");
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

	public GExtendedSearchBlock getGExtendedSearchBlock() 
	{
		return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
	}

//	public ButtonControlBlock getButtonControlBlock() 
//	{
//		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
//	}
	public ButtonControlBlockController getButtonControlBlock() 
	{
		return (ButtonControlBlockController) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

}

		

