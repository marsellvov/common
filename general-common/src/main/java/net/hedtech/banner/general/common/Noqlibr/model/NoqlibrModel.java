package net.hedtech.banner.general.common.Noqlibr.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;





public class NoqlibrModel extends FormPartModel {
	
	

	public NoqlibrModel(ITaskPart task){
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

	public IDBBusinessObject getNobtran() 
	{
		return (IDBBusinessObject) getBusinessObject("NOBTRAN");
	}

	public IDBBusinessObject getNobtranInfo1() 
	{
		return (IDBBusinessObject) getBusinessObject("NOBTRAN_INFO_1");
	}

	public IDBBusinessObject getNorcmnt() 
	{
		return (IDBBusinessObject) getBusinessObject("NORCMNT");
	}


}

		

