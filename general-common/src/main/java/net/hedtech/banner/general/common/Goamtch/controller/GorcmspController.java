package net.hedtech.banner.general.common.Goamtch.controller;
 
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Goamtch.model.*;
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.banner.general.common.Goamtch.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GorcmspController extends DefaultBlockController {


	
	public GorcmspController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoamtchTask getTask() {
		return (GoamtchTask)super.getTask();
	}

	public GoamtchModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GORCMSP.POST-QUERY
		 IF :GORCMSP.GORCMSP_LONG_DESC IS NULL THEN
 -- :GORCMSP.LONG_DESC := 'No Comment exists for this Rule Set.';                --Commented for Defect # 1-1ADJKV
     :GORCMSP.LONG_DESC := G$_NLS.Get('GOAMTCH-0060','FORM','No Comment exists for this Rule Set.');   --Added for Defect # 1-1ADJKV
ELSE
  :GORCMSP.LONG_DESC := :GORCMSP.GORCMSP_LONG_DESC;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gorcmsp_AfterQuery(RowAdapterEvent args)
		{
			
				GorcmspAdapter gorcmspElement = (GorcmspAdapter)args.getRow();


				if ( gorcmspElement.getGorcmspLongDesc().isNull() )
				{
					//  :GORCMSP.LONG_DESC := 'No Comment exists for this Rule Set.';                --Commented for Defect # 1-1ADJKV
					gorcmspElement.setLongDesc(GNls.Fget(toStr("GOAMTCH-0060"), toStr("FORM"), toStr("No Comment exists for this Rule Set.")));
				}
				else {
					gorcmspElement.setLongDesc(gorcmspElement.getGorcmspLongDesc());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMSP.KEY-EXIT
		 GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gorcmsp_Exit()
		{
			
				goItem(getFormModel().getFormHeader().getHoldBlkItem());
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMSP.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gorcmsp_NextBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMSP.KEY-NXTREC
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
  MESSAGE(G$_NLS.Get('GOAMTCH-0061','FORM','At last record.'));
ELSE
	NEXT_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gorcmsp_NextRecord()
		{
			
				if ( isInLastRecord() )
				{
					infoMessage(GNls.Fget(toStr("GOAMTCH-0061"), toStr("FORM"), toStr("At last record.")));
				}
				else {
					nextRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMSP.KEY-PRVBLK
		 PREVIOUS_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gorcmsp_PreviousBlock()
		{
			
				previousBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMSP.KEY-PRVREC
		 IF :SYSTEM.CURSOR_RECORD = '1' THEN
  MESSAGE(G$_NLS.Get('GOAMTCH-0062','FORM','At first record.'));
ELSE
	PREVIOUS_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gorcmsp_PreviousRecord()
		{
			
				if ( getCursorRecord().equals("1") )
				{
					infoMessage(GNls.Fget(toStr("GOAMTCH-0062"), toStr("FORM"), toStr("At first record.")));
				}
				else {
					previousRecord();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMSP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gorcmsp_BeforeQuery(QueryEvent args)
		{
			

                GtvcmscAdapter gtvcmscElement = (GtvcmscAdapter) this.getFormModel().getGtvcmsc().getRowAdapter();   
                if(gtvcmscElement==null){
                	return;
                }
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GTVCMSC_GTVCMSC_CODE", gtvcmscElement.getGtvcmscCode()));             


           
               }

		
	
	
}

