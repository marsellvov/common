package net.hedtech.general.common.libraries.Aoqclib.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;









public class AoqclibModel extends FormPartModel {
	
	
	public AoqclibModel(ITaskPart task){
		super(task);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public IDBBusinessObject getAuralrt() 
	{
		return (IDBBusinessObject) getBusinessObject("AURALRT");
	}

	public IDBBusinessObject getAgradtl() 
	{
		return (IDBBusinessObject) getBusinessObject("AGRADTL");
	}

	public IDBBusinessObject getAgrpgbe() 
	{
		return (IDBBusinessObject) getBusinessObject("AGRPGBE");
	}

	public IDBBusinessObject getAmrattn() 
	{
		return (IDBBusinessObject) getBusinessObject("AMRATTN");
	}


}

		

