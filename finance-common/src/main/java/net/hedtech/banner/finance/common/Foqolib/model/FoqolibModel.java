package net.hedtech.banner.finance.common.Foqolib.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;













public class FoqolibModel extends FormPartModel {
	
	
	public FoqolibModel(ITaskPart task){
		super(task);
    }
    
		

	public LibFormHeader getLibFormHeader() 
	{
		return (LibFormHeader) getBusinessObject("LIB$FORM_HEADER");
	}

	public CpBlock getCpBlock() 
	{
		return (CpBlock) getBusinessObject("CP$_BLOCK");
	}

	public LastQuery getLastQuery() 
	{
		return (LastQuery) getBusinessObject("LAST_QUERY");
	}

	public DateBlock getDateBlock() 
	{
		return (DateBlock) getBusinessObject("DATE$_BLOCK");
	}

	public ConsumpBlock getConsumpBlock() 
	{
		return (ConsumpBlock) getBusinessObject("CONSUMP$_BLOCK");
	}

	public OriginalCommodityDescBlock getOriginalCommodityDescBlock() 
	{
		return (OriginalCommodityDescBlock) getBusinessObject("ORIGINAL_COMMODITY_DESC_BLOCK");
	}

	public Dummy getDummy() 
	{
		return (Dummy) getBusinessObject("DUMMY");
	}

	public IDBBusinessObject getRqpoSuspenseBlock() 
	{
		return (IDBBusinessObject) getBusinessObject("RQPO_SUSPENSE_BLOCK");
	}

	public FFormatNumbers getFFormatNumbers() 
	{
		return (FFormatNumbers) getBusinessObject("F$_FORMAT_NUMBERS");
	}


}

		

