package net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Hashtable;

import net.hedtech.general.common.forms.model.BaseModel;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class GoqclibModel extends FormPartModel {
	
	
	public GoqclibModel(ITaskPart task){
		super(task);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
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


}

		

