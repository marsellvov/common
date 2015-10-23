package net.hedtech.banner.general.common.Soaidns.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;

//import net.hedtech.general.common.libraries.Goqolib.model.GSdispManager;

import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Soqolib.model.SCurriculaSummary;






public class SoaidnsModel extends FormModel {
	
	
	public SoaidnsModel(ITask task, Hashtable parameters){
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

	public IDBBusinessObject getSpriden() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRIDEN");
	}

	public Soundex getSoundex() 
	{
		return (Soundex) getBusinessObject("SOUNDEX");
	}

	public IDBBusinessObject getSpraddr() 
	{
		return (IDBBusinessObject) getBusinessObject("SPRADDR");
	}

	public IDBBusinessObject getSgbstdn() 
	{
		return (IDBBusinessObject) getBusinessObject("SGBSTDN");
	}

	public IDBBusinessObject getSfbetrm() 
	{
		return (IDBBusinessObject) getBusinessObject("SFBETRM");
	}

	public IDBBusinessObject getSovlcur() 
	{
		return (IDBBusinessObject) getBusinessObject("SOVLCUR");
	}

	public IDBBusinessObject getSovlfos() 
	{
		return (IDBBusinessObject) getBusinessObject("SOVLFOS");
	}

	public SCurriculaSummary getSCurriculaSummary() 
	{
		return (SCurriculaSummary) getBusinessObject("S$_CURRICULA_SUMMARY");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

