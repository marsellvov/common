package net.hedtech.banner.finance.common.Foaiden;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class FoaidenTask extends BaseTask
{
	public FoaidenTask (String taskName) {
		super(taskName);
	}

	public FoaidenTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.finance.common.Foaiden.model.FoaidenModel getModel() {
		return (net.hedtech.banner.finance.common.Foaiden.model.FoaidenModel)super.getModel();
	}

	public net.hedtech.banner.finance.common.Foaiden.services.FoaidenServices getServices() {
		return (net.hedtech.banner.finance.common.Foaiden.services.FoaidenServices)getSupportCodeManager().getServices();
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
    public net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices getFoqrpls()
    {
		return (net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices)getSupportCodeManager().getLibrary("FOQRPLS");
    }


}
