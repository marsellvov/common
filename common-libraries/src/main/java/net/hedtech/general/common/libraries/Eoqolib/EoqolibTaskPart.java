package net.hedtech.general.common.libraries.Eoqolib;


import java.util.Hashtable;

import net.hedtech.general.common.forms.BaseTask;
import morphis.common.forms.baseForm.DefaultTaskPart;
import morphis.foundations.core.appsupportlib.runtime.ITaskObject;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.configuration.TaskConfiguration;

	
/// <summary>
/// 
/// </summary>
///<remarks>
///                            PURPOSE OF FORM
///  This form is the Banner(r) XtenderSolutions(tm) Applicaton Referenced Object Library. This will provide
///  for the creation and maintenance of an object in this form while
///  referencing the object in other forms. The modification of the "master"
///  object in this form results in the same modification to forms that
///  reference these objects.
///</remarks>
public class EoqolibTaskPart extends DefaultTaskPart
{
	public EoqolibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.general.common.libraries.Eoqolib.model.EoqolibModel getModel() {
		return (net.hedtech.general.common.libraries.Eoqolib.model.EoqolibModel)super.getModel();
	}

	public net.hedtech.general.common.libraries.Eoqolib.services.EoqolibServices getServices() {
		return (net.hedtech.general.common.libraries.Eoqolib.services.EoqolibServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
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
