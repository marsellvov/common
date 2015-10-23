package net.hedtech.banner.general.common.Goqrlib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// Report Object Reference Library
/// </summary>
public class GoqrlibTaskPart extends TaskPart
{
	public GoqrlibTaskPart(String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.banner.general.common.Goqrlib.model.GoqrlibModel getModel() {
		return (net.hedtech.banner.general.common.Goqrlib.model.GoqrlibModel)super.getModel();
	}

	public net.hedtech.banner.general.common.Goqrlib.services.GoqrlibServices getServices() {
		return (net.hedtech.banner.general.common.Goqrlib.services.GoqrlibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    
    public net.hedtech.general.common.libraries.Goqorep.GoqorepServices getGoqorep()
    {
		return (net.hedtech.general.common.libraries.Goqorep.GoqorepServices)getSupportCodeManager().getLibrary("GOQOREP");
    }



}
