package net.hedtech.banner.general.common.Guagmnu;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class GuagmnuTask extends BaseTask
{
	public GuagmnuTask (String taskName) {
		super(taskName);
	}

	public GuagmnuTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.Guagmnu.model.GuagmnuModel getModel() {
		return (net.hedtech.banner.general.common.Guagmnu.model.GuagmnuModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Guagmnu.services.GuagmnuServices getServices() {
		return (net.hedtech.banner.general.common.Guagmnu.services.GuagmnuServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		

	public net.hedtech.banner.general.common.Guagmnu.services.MenuSeq getMenuSeq() 
	{
		return (net.hedtech.banner.general.common.Guagmnu.services.MenuSeq)getSupportCodeManager().getPackage("MENU_SEQ");
	}
	
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
