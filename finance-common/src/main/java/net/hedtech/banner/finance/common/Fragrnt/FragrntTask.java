package net.hedtech.banner.finance.common.Fragrnt;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class FragrntTask extends BaseTask
{
	public FragrntTask (String taskName) {
		super(taskName);
	}

	public FragrntTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel getModel() {
		return (net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel)super.getModel();
	}

	public net.hedtech.banner.finance.common.Fragrnt.services.FragrntServices getServices() {
		return (net.hedtech.banner.finance.common.Fragrnt.services.FragrntServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		

	public net.hedtech.banner.finance.common.Fragrnt.services.CopyInsertFrbgrnt getCopyInsertFrbgrnt() 
	{
		return (net.hedtech.banner.finance.common.Fragrnt.services.CopyInsertFrbgrnt)getSupportCodeManager().getPackage("COPY_INSERT_FRBGRNT");
	}

	public net.hedtech.banner.finance.common.Fragrnt.services.CopyFromPropTo getCopyFromPropTo() 
	{
		return (net.hedtech.banner.finance.common.Fragrnt.services.CopyFromPropTo)getSupportCodeManager().getPackage("COPY_FROM_PROP_TO");
	}
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices getFoqrpls()
    {
		return (net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices)getSupportCodeManager().getLibrary("FOQRPLS");
    }
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
