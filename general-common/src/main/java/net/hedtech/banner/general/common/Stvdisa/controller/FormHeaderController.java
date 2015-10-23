package net.hedtech.banner.general.common.Stvdisa.controller;
 
//import java.util.*;

import net.hedtech.banner.general.common.Stvdisa.StvdisaTask;
import net.hedtech.banner.general.common.Stvdisa.model.StvdisaModel;

//import org.jdesktop.databuffer.DataRow.DataRowStatus;

//import morphis.foundations.core.appdatalayer.*;
//import morphis.foundations.core.appdatalayer.data.*;
//import morphis.foundations.core.appdatalayer.events.*;
//import morphis.foundations.core.types.*;
//import morphis.foundations.core.appsupportlib.*;
//import morphis.foundations.core.appsupportlib.exceptions.*;
//import morphis.foundations.core.appsupportlib.model.*;
//import morphis.foundations.core.appsupportlib.ui.KeyFunction;
//import morphis.foundations.core.appsupportlib.util.*;
//import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
//import morphis.foundations.core.appsupportlib.runtime.events.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
//import morphis.foundations.core.appsupportlib.runtime.action.*;
//import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
//import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
//import static morphis.foundations.core.appsupportlib.Math.*;
//import static morphis.foundations.core.appsupportlib.Lib.*;
//import static morphis.foundations.core.appsupportlib.Globals.*;
//import static morphis.foundations.core.types.Types.*;
//import morphis.foundations.core.util.*;

//import com.ellucian.common.dbservices.*;
//import com.ellucian.common.dbservices.dbtypes.*;
//import net.hedtech.banner.student.libraries.Goqwflw.*;
//import net.hedtech.banner.student.libraries.Goqrpls.*;
//import net.hedtech.banner.student.libraries.Eoqrpls.*;
//
//import net.hedtech.banner.student.common.Stvdisa.model.*;
//import net.hedtech.banner.student.common.Stvdisa.*;
//import net.hedtech.banner.student.common.Stvdisa.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FormHeaderController extends DefaultBlockController {


	
	public FormHeaderController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvdisaTask getTask() {
		return (StvdisaTask)super.getTask();
	}

	public StvdisaModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
	
}

