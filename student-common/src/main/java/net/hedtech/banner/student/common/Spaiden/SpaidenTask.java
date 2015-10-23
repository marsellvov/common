package net.hedtech.banner.student.common.Spaiden;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class SpaidenTask extends BaseTask
{
	public SpaidenTask (String taskName) {
		super(taskName);
	}

	public SpaidenTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.student.common.Spaiden.model.SpaidenModel getModel() {
		return (net.hedtech.banner.student.common.Spaiden.model.SpaidenModel)super.getModel();
	}

	public net.hedtech.banner.student.common.Spaiden.services.SpaidenServices getServices() {
		return (net.hedtech.banner.student.common.Spaiden.services.SpaidenServices)getSupportCodeManager().getServices();
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


}
