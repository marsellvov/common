package net.hedtech.banner.finance.common.Foqolib;


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
///<remarks>
///                            PURPOSE OF FORM
///  This form is the Finance Referenced Object Library. This will provide
///  for the creation and maintenance of an object in this form while
///  referencing the object in other forms. The modification of the "master"
///  object in this form results in the same modification to forms that
///  reference these objects.
///</remarks>
public class FoqolibTaskPart extends DefaultTaskPart
{
	public FoqolibTaskPart (String name, TaskConfiguration configuration, ITaskObject container) {
		super(name, configuration, container);
	}

	@Override
	public net.hedtech.banner.finance.common.Foqolib.model.FoqolibModel getModel() {
		return (net.hedtech.banner.finance.common.Foqolib.model.FoqolibModel)super.getModel();
	}

	public net.hedtech.banner.finance.common.Foqolib.services.FoqolibServices getServices() {
		return (net.hedtech.banner.finance.common.Foqolib.services.FoqolibServices)getSupportCodeManager().getServices();
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
    public net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices getFoqrpls()
    {
		return (net.hedtech.general.common.libraries.Foqrpls.FoqrplsServices)getSupportCodeManager().getLibrary("FOQRPLS");
    }


}
