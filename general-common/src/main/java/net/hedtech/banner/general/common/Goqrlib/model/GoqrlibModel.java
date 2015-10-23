package net.hedtech.banner.general.common.Goqrlib.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;







public class GoqrlibModel extends FormPartModel {
	
	
//	public GoqrlibModel(ITask task, Hashtable parameters){
//		super(task, parameters);
//    }
    
	public GoqrlibModel(ITaskPart task){
		super(task);
    }
    

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public GBannerReportHeader getGBannerReportHeader() 
	{
		return (GBannerReportHeader) getBusinessObject("G$_BANNER_REPORT_HEADER");
	}

	public GBannerReportBlock getGBannerReportBlock() 
	{
		return (GBannerReportBlock) getBusinessObject("G$_BANNER_REPORT_BLOCK");
	}


}

		

