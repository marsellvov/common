package net.hedtech.banner.finance.common.Fraprop;


import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.runtime.Task;
import net.hedtech.general.common.forms.BaseTask;
	
/// <summary>
/// 
/// </summary>
public class FrapropTask extends BaseTask
{
	public FrapropTask (String taskName) {
		super(taskName);
	}

	public FrapropTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.finance.common.Fraprop.model.FrapropModel getModel() {
		return (net.hedtech.banner.finance.common.Fraprop.model.FrapropModel)super.getModel();
	}

	public net.hedtech.banner.finance.common.Fraprop.services.FrapropServices getServices() {
		return (net.hedtech.banner.finance.common.Fraprop.services.FrapropServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		

	public net.hedtech.banner.finance.common.Fraprop.services.CopyInsertFrbprop getCopyInsertFrbprop() 
	{
		return (net.hedtech.banner.finance.common.Fraprop.services.CopyInsertFrbprop)getSupportCodeManager().getPackage("COPY_INSERT_FRBPROP");
	}
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices getFoqrpls()
    {
		return (net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices)getSupportCodeManager().getLibrary("FOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    public net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices getNoqjpls()
    {
		return (net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices)getSupportCodeManager().getLibrary("NOQJPLS");
    }

}
