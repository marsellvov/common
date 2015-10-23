package net.hedtech.general.common.libraries.Aoqolib.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;










public class AoqolibModel extends FormPartModel {
	
	
	public AoqolibModel(ITaskPart task){
		super(task);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public CpBlock getCpBlock() 
	{
		return (CpBlock) getBusinessObject("CP$_BLOCK");
	}

	public LastQuery getLastQuery() 
	{
		return (LastQuery) getBusinessObject("LAST_QUERY");
	}


}

		

