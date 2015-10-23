package net.hedtech.general.common.libraries.Goqolib;


import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskPart;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;
import morphis.common.forms.baseForm.DefaultTaskPart;

	
/// <summary>
/// 
/// </summary>
///<remarks>
/// PURPOSE OF FORM
///  This form is the General Referenced Object Library. This will provide
///  for the creation and maintenance of an object in this form while
///  referencing the object in other forms. The modification of the "master"
///  object in this form results in the same modification to forms that
///  reference these objects.
///</remarks>
public class GoqolibTaskPart extends DefaultTaskPart
{
	public GoqolibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}
	
	@Override
	public net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel getModel() {
		return (net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Goqolib.services.GoqolibServices getServices() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
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
