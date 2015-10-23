package net.hedtech.banner.finance.common.Fraprop.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;


import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

//import com.ellucian.common.dbservices.*;
//import com.ellucian.common.dbservices.dbtypes.*;
//import net.hedtech.banner.finance.libraries.Goqwflw.*;
//import net.hedtech.banner.finance.libraries.Goqrpls.*;
//import net.hedtech.banner.finance.libraries.Foqrpls.*;
//import net.hedtech.banner.finance.libraries.Eoqrpls.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;

//import com.ellucian.forms.Goqolib.services.GNameClass;	

import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FormHeaderController extends DefaultBlockController {

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public FormHeaderController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}

	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_NAME_2.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_AGENCY_NAME_2", function=KeyFunction.NEXT_ITEM)
		public void frbpropAgencyName2_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER TOTAL.WHEN-NEW-ITEM-INSTANCE
		 execute_trigger('get_percentage_total');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TOTAL.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TOTAL", function=KeyFunction.ITEM_CHANGE)
		public void total_itemChange()
		{
			
				executeAction("get_percentage_total");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}

