package net.hedtech.banner.general.common.Soaidns;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Soqrpls.SoqrplsServices;

import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class SoaidnsTask extends BaseTask
{
	public SoaidnsTask (String taskName) {
		super(taskName);
	}

	public SoaidnsTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Soaidns.model.SoaidnsModel getModel() {
		return (net.hedtech.banner.general.common.Soaidns.model.SoaidnsModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Soaidns.services.SoaidnsServices getServices() {
		return (net.hedtech.banner.general.common.Soaidns.services.SoaidnsServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public SoqrplsServices getSoqrpls()
    {
		return (net.hedtech.general.common.libraries.Soqrpls.SoqrplsServices)getSupportCodeManager().getLibrary("SOQRPLS");
    }
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
