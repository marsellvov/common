package net.hedtech.banner.general.common.Gsqtofu;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class GsqtofuTask extends BaseTask
{
	public GsqtofuTask (String taskName) {
		super(taskName);
	}

	public GsqtofuTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Gsqtofu.model.GsqtofuModel getModel() {
		return (net.hedtech.banner.general.common.Gsqtofu.model.GsqtofuModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Gsqtofu.services.GsqtofuServices getServices() {
		return (net.hedtech.banner.general.common.Gsqtofu.services.GsqtofuServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }


}
