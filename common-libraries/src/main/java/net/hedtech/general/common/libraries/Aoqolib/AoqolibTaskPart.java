package net.hedtech.general.common.libraries.Aoqolib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// 
/// </summary>
public class AoqolibTaskPart extends TaskPart
{
	public AoqolibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.general.common.libraries.Aoqolib.model.AoqolibModel getModel() {
		return (net.hedtech.general.common.libraries.Aoqolib.model.AoqolibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Aoqolib.services.AoqolibServices getServices() {
		return (net.hedtech.general.common.libraries.Aoqolib.services.AoqolibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }

}
