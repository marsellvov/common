package net.hedtech.banner.general.common.Guainst;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class GuainstTask extends BaseTask
{
	public GuainstTask (String taskName) {
		super(taskName);
	}

	public GuainstTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Guainst.model.GuainstModel getModel() {
		return (net.hedtech.banner.general.common.Guainst.model.GuainstModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Guainst.services.GuainstServices getServices() {
		return (net.hedtech.banner.general.common.Guainst.services.GuainstServices)getSupportCodeManager().getServices();
	}
	
	
	
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
