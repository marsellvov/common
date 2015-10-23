package net.hedtech.banner.alumni.common.Apaiden;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class ApaidenTask extends BaseTask
{
	public ApaidenTask (String taskName) {
		super(taskName);
	}

	public ApaidenTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.alumni.common.Apaiden.model.ApaidenModel getModel() {
		return (net.hedtech.banner.alumni.common.Apaiden.model.ApaidenModel)super.getModel();
	}

	public net.hedtech.banner.alumni.common.Apaiden.services.ApaidenServices getServices() {
		return (net.hedtech.banner.alumni.common.Apaiden.services.ApaidenServices)getSupportCodeManager().getServices();
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
    public net.hedtech.banner.alumni.common.Aoqrpls.AoqrplsServices getAoqrpls()
    {
		return (net.hedtech.banner.alumni.common.Aoqrpls.AoqrplsServices)getSupportCodeManager().getLibrary("AOQRPLS");
    }
    

}
