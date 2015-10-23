package net.hedtech.mesc.common.banner.payroll.Pyabene;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class PyabeneTask extends BaseTask
{
	public PyabeneTask (String taskName) {
		super(taskName);
	}

	public PyabeneTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.mesc.common.banner.payroll.Pyabene.model.PyabeneModel getModel() {
		return (net.hedtech.mesc.common.banner.payroll.Pyabene.model.PyabeneModel)super.getModel();
	}

	public net.hedtech.mesc.common.banner.payroll.Pyabene.services.PyabeneServices getServices() {
		return (net.hedtech.mesc.common.banner.payroll.Pyabene.services.PyabeneServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices getNoqjpls()
    {
		return (net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices)getSupportCodeManager().getLibrary("NOQJPLS");
    }
    public net.hedtech.general.common.libraries.Poqrpls.PoqrplsServices getPoqrpls()
    {
		return (net.hedtech.general.common.libraries.Poqrpls.PoqrplsServices)getSupportCodeManager().getLibrary("POQRPLS");
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
