package net.hedtech.banner.general.common.Stvdisa;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

	
/// <summary>
/// 
/// </summary>
public class StvdisaTask extends BaseTask
{
	public StvdisaTask (String taskName) {
		super(taskName);
	}

	public StvdisaTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Stvdisa.model.StvdisaModel getModel() {
		return (net.hedtech.banner.general.common.Stvdisa.model.StvdisaModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Stvdisa.services.StvdisaServices getServices() {
		return (net.hedtech.banner.general.common.Stvdisa.services.StvdisaServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }


}
