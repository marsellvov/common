package net.hedtech.general.common.libraries.Aoqclib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// Advancement Common Object Reference Library
/// </summary>
public class AoqclibTaskPart extends TaskPart
{


	public AoqclibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.general.common.libraries.Aoqclib.model.AoqclibModel getModel() {
		return (net.hedtech.general.common.libraries.Aoqclib.model.AoqclibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Aoqclib.services.AoqclibServices getServices() {
		return (net.hedtech.general.common.libraries.Aoqclib.services.AoqclibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries

	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
}
