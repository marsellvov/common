package net.hedtech.banner.general.common.Stvstat.controller;
 
import java.util.*;
import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Stvstat.model.*;
import net.hedtech.banner.general.common.Stvstat.*;
import net.hedtech.banner.general.common.Stvstat.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvstatController extends DefaultBlockController {


	
	public StvstatController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public StvstatTask getTask() {
		return (StvstatTask)super.getTask();
	}

	public StvstatModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVSTAT.PRE-INSERT
		    :STVSTAT_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSTAT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvstat_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvstatAdapter stvstatElement = (StvstatAdapter)args.getRow();

				stvstatElement.setStvstatActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVSTAT.PRE-UPDATE
		    :STVSTAT_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
		*/
		/*
		 *<p>
		 *Update activity date when a row is changed.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSTAT.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvstat_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvstatAdapter stvstatElement = (StvstatAdapter)args.getRow();


				stvstatElement.setStvstatActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
			}

		
		/* Original PL/SQL code code for TRIGGER STVSTAT.WHEN-NEW-RECORD-INSTANCE
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSTAT.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void stvstat_recordChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER STVSTAT_EDI_EQUIV.WHEN-VALIDATE-ITEM
		 -- Added for 7.0 UI.
G$_VALIDATE_FIXED_LENGTH;
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSTAT_EDI_EQUIV.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVSTAT_EDI_EQUIV")
		public void stvstatEdiEquiv_validate()
		{
			
				//  Added for 7.0 UI.
				//  Added for 7.0 UI.
			
			
				getTask().getGoqrpls().gValidateFixedLength(toStr("STVSTAT_EDI_EQUIV"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}

