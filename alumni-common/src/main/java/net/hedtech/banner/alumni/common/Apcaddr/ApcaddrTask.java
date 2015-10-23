package net.hedtech.banner.alumni.common.Apcaddr;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class ApcaddrTask extends BaseTask
{
	public ApcaddrTask (String taskName) {
		super(taskName);
	}

	public ApcaddrTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.alumni.common.Apcaddr.model.ApcaddrModel getModel() {
		return (net.hedtech.banner.alumni.common.Apcaddr.model.ApcaddrModel)super.getModel();
	}

	public net.hedtech.banner.alumni.common.Apcaddr.services.ApcaddrServices getServices() {
		return (net.hedtech.banner.alumni.common.Apcaddr.services.ApcaddrServices)getSupportCodeManager().getServices();
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
    
    public net.hedtech.banner.alumni.common.Aoqrpls.AoqrplsServices getAoqrpls()
    {
		return (net.hedtech.banner.alumni.common.Aoqrpls.AoqrplsServices)getSupportCodeManager().getLibrary("AOQRPLS");
    }
    

}
