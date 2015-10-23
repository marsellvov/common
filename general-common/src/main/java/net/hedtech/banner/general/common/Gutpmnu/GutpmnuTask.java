package net.hedtech.banner.general.common.Gutpmnu;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class GutpmnuTask extends BaseTask
{
	public GutpmnuTask (String taskName) {
		super(taskName);
	}

	public GutpmnuTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Gutpmnu.model.GutpmnuModel getModel() {
		return (net.hedtech.banner.general.common.Gutpmnu.model.GutpmnuModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Gutpmnu.services.GutpmnuServices getServices() {
		return (net.hedtech.banner.general.common.Gutpmnu.services.GutpmnuServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		

	public net.hedtech.banner.general.common.Gutpmnu.services.SubmenuMaintenance getSubmenuMaintenance() 
	{
		return (net.hedtech.banner.general.common.Gutpmnu.services.SubmenuMaintenance)getSupportCodeManager().getPackage("SUBMENU_MAINTENANCE");
	}
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqgmnu.GoqgmnuServices getGoqgmnu()
    {
		return (net.hedtech.general.common.libraries.Goqgmnu.GoqgmnuServices)getSupportCodeManager().getLibrary("GOQGMNU");
    }
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
