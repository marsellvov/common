package net.hedtech.banner.general.common.Guainit;


import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
public class GuainitTask extends Task
{
	public GuainitTask (String taskName) {
		super(taskName);
	}

	public GuainitTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Guainit.model.GuainitModel getModel() {
		return (net.hedtech.banner.general.common.Guainit.model.GuainitModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Guainit.services.GuainitServices getServices() {
		return (net.hedtech.banner.general.common.Guainit.services.GuainitServices)getSupportCodeManager().getServices();
	}
	
	
		

	public net.hedtech.banner.general.common.Guainit.services.BanPreferences getBanPreferences() 
	{
		return (net.hedtech.banner.general.common.Guainit.services.BanPreferences)getSupportCodeManager().getPackage("BAN_PREFERENCES");
	}

	public net.hedtech.banner.general.common.Guainit.services.CaptureTimings getCaptureTimings() 
	{
		return (net.hedtech.banner.general.common.Guainit.services.CaptureTimings)getSupportCodeManager().getPackage("CAPTURE_TIMINGS");
	}

	public net.hedtech.banner.general.common.Guainit.services.PkgTimestampFormat getPkgTimestampFormat() 
	{
		return (net.hedtech.banner.general.common.Guainit.services.PkgTimestampFormat)getSupportCodeManager().getPackage("PKG_TIMESTAMP_FORMAT");
	}
	
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
