package net.hedtech.banner.general.common.Noqolib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.common.forms.baseForm.DefaultTaskPart;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// 
/// </summary>
public class NoqolibTaskPart extends DefaultTaskPart
{
	public NoqolibTaskPart(String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.banner.general.common.Noqolib.model.NoqolibModel getModel() {
		return (net.hedtech.banner.general.common.Noqolib.model.NoqolibModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Noqolib.services.NoqolibServices getServices() {
		return (net.hedtech.banner.general.common.Noqolib.services.NoqolibServices)getSupportCodeManager().getServices();
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
