package net.hedtech.banner.general.common.Guauipw;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.foundations.core.appsupportlib.runtime.Task;

	
public class GuauipwTask extends BaseTask
{
	public GuauipwTask (String taskName) {
		super(taskName);
	}

	public GuauipwTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Guauipw.model.GuauipwModel getModel() {
		return (net.hedtech.banner.general.common.Guauipw.model.GuauipwModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Guauipw.services.GuauipwServices getServices() {
		return (net.hedtech.banner.general.common.Guauipw.services.GuauipwServices)getSupportCodeManager().getServices();
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
