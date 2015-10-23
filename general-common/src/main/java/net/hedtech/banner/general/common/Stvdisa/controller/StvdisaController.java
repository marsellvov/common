package net.hedtech.banner.general.common.Stvdisa.controller;
 
//import java.util.*;
//import org.jdesktop.databuffer.DataRow.DataRowStatus;
//import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
//import morphis.foundations.core.types.*;
//import morphis.foundations.core.appsupportlib.*;
//import morphis.foundations.core.appsupportlib.exceptions.*;
//import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
//import morphis.foundations.core.appsupportlib.util.*;
//import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
//import morphis.foundations.core.appsupportlib.runtime.events.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
//import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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
import static morphis.foundations.core.appsupportlib.Lib.*;
//import static morphis.foundations.core.appsupportlib.Globals.*;
//import static morphis.foundations.core.types.Types.*;
//import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
//import net.hedtech.general.common.dbservices.dbtypes.*;
//import net.hedtech.general.common.libraries.Goqwflw.*;
//import net.hedtech.general.common.libraries.Goqrpls.*;
//import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Stvdisa.model.*;
import net.hedtech.banner.general.common.Stvdisa.*;
//import net.hedtech.banner.general.common.Stvdisa.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvdisaController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public StvdisaController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER STVDISA.PRE-INSERT
		    :STVDISA_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void stvdisa_BeforeRowInsert(RowAdapterEvent args)
		{
			
				StvdisaAdapter stvdisaElement = (StvdisaAdapter)args.getRow();
				stvdisaElement.setStvdisaActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
		}

		
		/* Original PL/SQL code code for TRIGGER STVDISA.PRE-UPDATE
		    :STVDISA_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void stvdisa_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				StvdisaAdapter stvdisaElement = (StvdisaAdapter)args.getRow();
				stvdisaElement.setStvdisaActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
		}

		
		/* Original PL/SQL code code for TRIGGER STVDISA.ON-UPDATE
		 UPDATE STVDISA
SET STVDISA_DESC=:STVDISA_DESC,
    STVDISA_ACTIVITY_DATE=TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT)
WHERE STVDISA_CODE=:STVDISA_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void stvdisa_RowUpdate(RowAdapterEvent args)
		{
			
				StvdisaAdapter stvdisaElement = (StvdisaAdapter)args.getRow();

				int rowCount = 0;
				String sql1 = "UPDATE STVDISA " +
								"SET STVDISA_DESC = :STVDISA_DESC, STVDISA_ACTIVITY_DATE = TO_DATE(:CURRENT_DATE, G$_DATE.GET_NLS_DATE_FORMAT) " +
									" WHERE STVDISA_CODE = :STVDISA_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("STVDISA_DESC", stvdisaElement.getStvdisaDesc());
				command1.addParameter("CURRENT_DATE", getFormModel().getFormHeader().getCurrentDate());
				command1.addParameter("STVDISA_CODE", stvdisaElement.getStvdisaCode());
				rowCount = command1.execute();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVDISA_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void stvdisaActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDISA_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void stvdisaActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDISA_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVDISA_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void stvdisaActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
		}

}

