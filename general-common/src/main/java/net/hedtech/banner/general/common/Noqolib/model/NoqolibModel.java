package net.hedtech.banner.general.common.Noqolib.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;






public class NoqolibModel extends FormPartModel {
	
	
	public NoqolibModel(ITaskPart task){
		super(task);
    }
    
		

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public Noqolib getNoqolib() 
	{
		return (Noqolib) getBusinessObject("NOQOLIB");
	}


}

		

