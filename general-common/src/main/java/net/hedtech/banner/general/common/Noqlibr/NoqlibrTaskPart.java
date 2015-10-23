package net.hedtech.banner.general.common.Noqlibr;


import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// 
/// </summary>
public class NoqlibrTaskPart extends TaskPart
{
	
	public NoqlibrTaskPart(String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	public net.hedtech.banner.general.common.Noqlibr.services.NoqlibrServices getServices() {
		return (net.hedtech.banner.general.common.Noqlibr.services.NoqlibrServices)getSupportCodeManager().getServices();
	}
	
	
	@Override
	public net.hedtech.banner.general.common.Noqlibr.model.NoqlibrModel getModel() {
		return (net.hedtech.banner.general.common.Noqlibr.model.NoqlibrModel)super.getModel();
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


}
