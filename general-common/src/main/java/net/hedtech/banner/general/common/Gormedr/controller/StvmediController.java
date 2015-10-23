package net.hedtech.banner.general.common.Gormedr.controller;
 
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.banner.general.common.Gormedr.model.*;
import net.hedtech.banner.general.common.Gormedr.*;
import net.hedtech.banner.general.common.Gormedr.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class StvmediController extends DefaultBlockController {


	
	public StvmediController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GormedrTask getTask() {
		return (GormedrTask)super.getTask();
	}

	public GormedrModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER STVMEDI.WHEN-NEW-RECORD-INSTANCE
		 POINTER_TO_CURSOR('pointer_to_seq_1','>>');
IF :SYSTEM.RECORD_STATUS = 'NEW' THEN
  IF :SYSTEM.CURSOR_RECORD <> '1' THEN
    PREVIOUS_RECORD;
  MESSAGE( G$_NLS.Get('GORMEDR-0005', 'FORM','At last record.') , NO_ACKNOWLEDGE);
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void stvmedi_recordChange()
		{
			

				if ( getRecordStatus().equals("NEW") )
				{
					if ( getCursorRecord().notEquals("1") )
					{
						previousRecord();
						infoMessage(GNls.Fget(toStr("GORMEDR-0005"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.KEY-DOWN
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
    MESSAGE ( G$_NLS.Get('GORMEDR-0007', 'FORM','At last record') );
    RAISE FORM_TRIGGER_FAILURE;
 ELSE
  DO_KEY('NEXT_RECORD');
END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void stvmedi_MoveDown()
		{
			
				if ( isInLastRecord(true) )
				{
					errorMessage(GNls.Fget(toStr("GORMEDR-0007"), toStr("FORM"), toStr("*ERROR* At last record")));
					throw new ApplicationException();
				}
				else {
					nextRecord();
				}
			}
		
		
		/* Original PL/SQL code code for TRIGGER STVMEDI.PRE-BLOCK
		 SET_ITEM_PROPERTY('STVMEDI_DESC', ENABLED, PROPERTY_OFF);
SET_ITEM_PROPERTY('STVMEDI_CODE', UPDATEABLE, PROPERTY_OFF);


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void stvmedi_blockIn()
		{
			
				setItemEnabled("STVMEDI_DESC", false);
				setItemUpdateAllowed("STVMEDI_CODE", false);
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.KEY-CREREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void stvmedi_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.KEY-DELREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void stvmedi_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void stvmedi_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.KEY-NXTBLK
		 GO_BLOCK('GORMEDR');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void stvmedi_NextBlock()
		{
			
				goBlock(toStr("GORMEDR"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.ON-POPULATE-DETAILS
		 --
-- Begin default relation declare section
--
DECLARE
  recstat     VARCHAR2(20) := :System.record_status;   
  startitm    VARCHAR2(61) := :System.cursor_item;   
  rel_id      Relation;
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  IF ( recstat = 'NEW' or recstat = 'INSERT' ) THEN   
    RETURN;
  END IF;
  --
  -- Begin GORMEDR detail program section
  --
  IF ( (:STVMEDI.STVMEDI_CODE is not null) ) THEN   
    rel_id := Find_Relation('STVMEDI.STVMEDI_GORMEDR');   
    Query_Master_Details(rel_id, 'GORMEDR');   
  END IF;
  --
  -- End GORMEDR detail program section
  --

  IF ( :System.cursor_item <> startitm ) THEN     
     Go_Item(startitm);     
     Check_Package_Failure;     
  END IF;
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void stvmedi_PopulateDetails(RowAdapterEvent args)
		{
			
			

			}

		
		/* Original PL/SQL code code for TRIGGER STVMEDI.ON-CHECK-DELETE-MASTER
		 --
-- Begin default relation declare section
--
DECLARE
  Dummy_Define CHAR(1);
  --
  -- Begin GORMEDR detail declare section
  --
  CURSOR GORMEDR_cur IS      
    SELECT 1 FROM GORMEDR N     
    WHERE N.GORMEDR_MEDI_CODE = :STVMEDI.STVMEDI_CODE;
  --
  -- End GORMEDR detail declare section
  --
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  --
  -- Begin GORMEDR detail program section
  --
  OPEN GORMEDR_cur;     
  FETCH GORMEDR_cur INTO Dummy_Define;     
  IF ( GORMEDR_cur%found ) THEN     
    Message( G$_NLS.Get('GORMEDR-0011', 'FORM','Cannot delete master record when matching detail records exist.') );     
    CLOSE GORMEDR_cur;     
    RAISE Form_Trigger_Failure;     
  END IF;
  CLOSE GORMEDR_cur;
  --
  -- End GORMEDR detail program section
  --
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMEDI.ON-CHECK-DELETE-MASTER
		 *
		 *
		 *</p>
		 * @param args
		*/

		@DeleteDetails
		public void stvmedi_DeleteDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				StvmediAdapter stvmediElement = (StvmediAdapter)args.getRow();


				int rowCount = 0;
				{
					NString dummyDefine= NString.getNull();
					String sqlgormedrCur = "SELECT 1 " +
	" FROM GORMEDR N " +
	" WHERE N.GORMEDR_MEDI_CODE = :STVMEDI_STVMEDI_CODE ";
					DataCursor gormedrCur = new DataCursor(sqlgormedrCur);
					try {
						// 
						//  Begin GORMEDR detail program section
						// 
						//Setting query parameters
						gormedrCur.addParameter("STVMEDI_STVMEDI_CODE", stvmediElement.getStvmediCode());

						gormedrCur.open();
						ResultSet gormedrCurResults = gormedrCur.fetchInto();
						if ( gormedrCurResults != null ) {
							dummyDefine = gormedrCurResults.getStr(0);
						}
						if ((gormedrCur.found()))
						{
							errorMessage(GNls.Fget(toStr("GORMEDR-0011"), toStr("FORM"), toStr("*ERROR* Cannot delete master record when matching detail records exist.")));
							gormedrCur.close();
							throw new ApplicationException();
						}
						gormedrCur.close();
					}
					finally{
						gormedrCur.close();
					}
				}
			}

		
	
	
}

