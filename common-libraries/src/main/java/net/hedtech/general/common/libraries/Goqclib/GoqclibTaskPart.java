package net.hedtech.general.common.libraries.Goqclib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;

import morphis.common.forms.baseForm.DefaultTaskPart;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// Common Object Reference Library
/// </summary>
public class GoqclibTaskPart extends TaskPart
{
//	public GoqclibTaskPart (String taskName) {
//		super(taskName);
//	}

	public GoqclibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.general.common.libraries.Goqclib.model.GoqclibModel getModel() {
		return (net.hedtech.general.common.libraries.Goqclib.model.GoqclibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Goqclib.services.GoqclibServices getServices() {
		return (net.hedtech.general.common.libraries.Goqclib.services.GoqclibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices getNoqjpls()
    {
		return (net.hedtech.general.common.libraries.Noqjpls.NoqjplsServices)getSupportCodeManager().getLibrary("NOQJPLS");
    }
    public net.hedtech.general.common.libraries.Noqrpls.NoqrplsServices getNoqrpls()
    {
		return (net.hedtech.general.common.libraries.Noqrpls.NoqrplsServices)getSupportCodeManager().getLibrary("NOQRPLS");
    }
    public net.hedtech.general.common.libraries.Poqrpls.PoqrplsServices getPoqrpls()
    {
		return (net.hedtech.general.common.libraries.Poqrpls.PoqrplsServices)getSupportCodeManager().getLibrary("POQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }


}
