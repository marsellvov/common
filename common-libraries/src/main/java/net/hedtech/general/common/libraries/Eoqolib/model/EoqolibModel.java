package net.hedtech.general.common.libraries.Eoqolib.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class EoqolibModel extends FormPartModel {
	
	
	public EoqolibModel(ITaskPart task){
		super(task);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}


}

		

