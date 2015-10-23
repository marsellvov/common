package net.hedtech.banner.general.common.Guqwutl;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class GuqwutlTask extends BaseTask
{
	public GuqwutlTask (String taskName) {
		super(taskName);
	}

	public GuqwutlTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Guqwutl.model.GuqwutlModel getModel() {
		return (net.hedtech.banner.general.common.Guqwutl.model.GuqwutlModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Guqwutl.services.GuqwutlServices getServices() {
		return (net.hedtech.banner.general.common.Guqwutl.services.GuqwutlServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
//    public net.hedtech.general.common.libraries.Webutil.WebutilServices getWebutil()
//    {
//		return (net.hedtech.general.common.libraries.Webutil.WebutilServices)getSupportCodeManager().getLibrary("WEBUTIL");
//    }


}
