package net.hedtech.banner.student.common.Spaiden.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenPreviousAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpridenPreviousController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpridenPreviousController getGoqclibSpridenPreviousController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpridenPreviousController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRIDEN_PREVIOUS");
	}	
	
	public SpridenPreviousController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SpaidenTask getTask() {
		return (SpaidenTask)super.getTask();
	}

	public SpaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void spridenPrevious_blockChange()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@After
		public void spridenPrevious_recordChange()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_recordChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void spridenPrevious_itemChange()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spridenPrevious_AfterQuery(RowAdapterEvent args)
		{
			

						getGoqclibSpridenPreviousController().spridenPrevious_AfterQuery(args);
		}
		

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spridenPrevious_BeforeRowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_BeforeRowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spridenPrevious_RowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_RowDelete(args);
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.PRE-INSERT
		 -- 82-1 add SPRIDEN_SURNAME_PREFIX to check for unique name
DECLARE
  PTI_INTO_TEMP  VARCHAR2(1);
  the_alert	     NUMBER;
  pii_active     VARCHAR2(1) := 'N';
--
  CURSOR PTI_CURSOR1 IS
    SELECT 'X'
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :SPRIDEN_PREVIOUS.SPRIDEN_ID
       AND SPRIDEN_PIDM <> :SPRIDEN_PREVIOUS.SPRIDEN_PIDM;
--
  CURSOR PTI_CURSOR2 IS  -- 82-1
    SELECT 'X'
      FROM SPRIDEN
     WHERE NVL(SPRIDEN_SURNAME_PREFIX,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX,' ')
       AND NVL(SPRIDEN_NTYP_CODE,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE,' ')
       AND NVL(SPRIDEN_MI,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_MI,' ')
       AND NVL(SPRIDEN_FIRST_NAME,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME,' ')
       AND SPRIDEN_LAST_NAME = :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME
       AND SPRIDEN_ID = :SPRIDEN_PREVIOUS.SPRIDEN_ID
       AND SPRIDEN_PIDM = :SPRIDEN_PREVIOUS.SPRIDEN_PIDM;
--
BEGIN  
  pii_active := gokfgac.f_spriden_pii_active;
--
--  Check if NEXT is being used as ID.  This is invalid
--
--  IF :SPRIDEN_PREVIOUS.SPRIDEN_ID = 'NEXT' THEN
--    MESSAGE(G$_NLS.Get('GOQCLIB-0054','FORM','NEXT is not a valid ID.'));
--    RAISE FORM_TRIGGER_FAILURE;
--  END IF;
-- Turn off PII
  IF pii_active = 'Y' THEN
    gokfgac.p_turn_fgac_off;
  END IF;
--
-- Check the uniqueness of the new ID
--
  OPEN PTI_CURSOR1;
  FETCH PTI_CURSOR1 INTO PTI_INTO_TEMP;
  IF PTI_CURSOR1%FOUND THEN
    CLOSE PTI_CURSOR1;
    MESSAGE(G$_NLS.Get('SPAIDEN-0015','FORM','*ERROR* ID has already been added to database.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CLOSE PTI_CURSOR1;
--
-- Check for uniqueness of the spriden record
--
  OPEN PTI_CURSOR2;
  FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP;
  IF PTI_CURSOR2%FOUND THEN
    CLOSE PTI_CURSOR2;
    MESSAGE(G$_NLS.Get('SPAIDEN-0016','FORM','*ERROR* This record already exists'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CLOSE PTI_CURSOR2;
--
-- Turn on PII
--
  IF pii_active = 'Y' THEN
    gokfgac.p_turn_fgac_on;
  END IF;
--
  IF :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND IS NULL THEN
    MESSAGE(G$_NLS.Get('SPAIDEN-0017','FORM','*ERROR* Invalid Change Indicator value.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :SPRIDEN_PREVIOUS.SPRIDEN_ID IS NULL THEN
    MESSAGE(G$_NLS.Get('SPAIDEN-0018','FORM','*ERROR* Invalid ID; Enter valid ID.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME IS NULL THEN
    MESSAGE(G$_NLS.Get('SPAIDEN-0019','FORM','*ERROR* Invalid Name; Enter valid Name.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND = 'P' AND 
     :SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME IS NULL THEN
    MESSAGE(G$_NLS.Get('SPAIDEN-0020','FORM','*ERROR* Invalid First Name; Enter valid Name.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--    
  :SPRIDEN_PREVIOUS.SPRIDEN_USER        := :GLOBAL.CURRENT_USER;
  :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN      := :SYSTEM.CURRENT_FORM;
  :SPRIDEN_PREVIOUS.SPRIDEN_CREATE_USER := :GLOBAL.CURRENT_USER;
  :SPRIDEN_PREVIOUS.SPRIDEN_CREATE_DATE := SYSDATE;
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    IF pii_active = 'Y' THEN
      -- spriden pii is active, turn fgac on 
      gokfgac.p_turn_fgac_on;
    END IF;
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spridenPrevious_BeforeRowInsert(RowAdapterEvent args)
		{
			
				//  82-1 add SPRIDEN_SURNAME_PREFIX to check for unique name
				SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter)args.getRow();


				int rowCount = 0;
				{
					NString ptiIntoTemp= NString.getNull();
					NNumber theAlert= NNumber.getNull();
					NString piiActive = toStr("N");
					String sqlptiCursor1 = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID AND SPRIDEN_PIDM <> :SPRIDEN_PREVIOUS_SPRIDEN_PIDM ";
					DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
					String sqlptiCursor2 = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE NVL(SPRIDEN_SURNAME_PREFIX, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX, ' ') AND NVL(SPRIDEN_NTYP_CODE, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE, ' ') AND NVL(SPRIDEN_MI, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_MI, ' ') AND NVL(SPRIDEN_FIRST_NAME, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME, ' ') AND SPRIDEN_LAST_NAME = :SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME AND SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID AND SPRIDEN_PIDM = :SPRIDEN_PREVIOUS_SPRIDEN_PIDM ";
					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
					try {
						try
						{
							piiActive = Gokfgac.fSpridenPiiActive();
							// 
							//   Check if NEXT is being used as ID.  This is invalid
							// 
							//   IF :SPRIDEN_PREVIOUS.SPRIDEN_ID = 'NEXT' THEN
							//     MESSAGE(G$_NLS.Get('GOQCLIB-0054','FORM','NEXT is not a valid ID.'));
							//     RAISE FORM_TRIGGER_FAILURE;
							//   END IF;
							//  Turn off PII
							if ( piiActive.equals("Y") )
							{
								Gokfgac.pTurnFgacOff();
							}
							// 
							//  Check the uniqueness of the new ID
							// 
							//Setting query parameters
							ptiCursor1.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID", spridenPreviousElement.getSpridenId());
							ptiCursor1.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_PIDM", spridenPreviousElement.getSpridenPidm());
							ptiCursor1.open();
							ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
							if ( ptiCursor1Results != null ) {
								ptiIntoTemp = ptiCursor1Results.getStr(0);
							}
							if ( ptiCursor1.found() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0015"), toStr("FORM"), toStr("*ERROR* ID has already been added to database.")));
								throw new ApplicationException();
							}
							// 
							//  Check for uniqueness of the spriden record
							// 
							//Setting query parameters
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX", spridenPreviousElement.getSpridenSurnamePrefix());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE", spridenPreviousElement.getSpridenNtypCode());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_MI", spridenPreviousElement.getSpridenMi());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME", spridenPreviousElement.getSpridenFirstName());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME", spridenPreviousElement.getSpridenLastName());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID", spridenPreviousElement.getSpridenId());
							ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_PIDM", spridenPreviousElement.getSpridenPidm());
							ptiCursor2.open();
							ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
							if ( ptiCursor2Results != null ) {
								ptiIntoTemp = ptiCursor2Results.getStr(0);
							}
							if ( ptiCursor2.found() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0016"), toStr("FORM"), toStr("*ERROR* This record already exists")));
								throw new ApplicationException();
							}
							// 
							//  Turn on PII
							// 
							if ( piiActive.equals("Y") )
							{
								Gokfgac.pTurnFgacOn();
							}
							// 
							if ( spridenPreviousElement.getSpridenChangeInd().isNull() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0017"), toStr("FORM"), toStr("*ERROR* Invalid Change Indicator value.")));
								throw new ApplicationException();
							}
							// 
							if ( spridenPreviousElement.getSpridenId().isNull() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0018"), toStr("FORM"), toStr("*ERROR* Invalid ID; Enter valid ID.")));
								throw new ApplicationException();
							}
							// 
							if ( spridenPreviousElement.getSpridenLastName().isNull() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0019"), toStr("FORM"), toStr("*ERROR* Invalid Name; Enter valid Name.")));
								throw new ApplicationException();
							}
							// 
							if ( spridenPreviousElement.getSpridenEntityInd().equals("P") && spridenPreviousElement.getSpridenFirstName().isNull() )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0020"), toStr("FORM"), toStr("*ERROR* Invalid First Name; Enter valid Name.")));
								throw new ApplicationException();
							}
							//     
							spridenPreviousElement.setSpridenUser(getGlobal("CURRENT_USER"));
							spridenPreviousElement.setSpridenOrigin(toStr(getCurrentTaskName()));
							spridenPreviousElement.setSpridenCreateUser(getGlobal("CURRENT_USER"));
							spridenPreviousElement.setSpridenCreateDate(NDate.getNow());
						}
						catch(ApplicationException e)
						{
							if ( piiActive.equals("Y") )
							{
								//  spriden pii is active, turn fgac on 
								Gokfgac.pTurnFgacOn();
							}
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor1.close();
						ptiCursor2.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spridenPrevious_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spridenPrevious_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_BeforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spridenPrevious_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void spridenPrevious_Save()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_Save();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void spridenPrevious_CreateRecord()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_CreateRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spridenPrevious_DeleteRecord()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_DeleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void spridenPrevious_CopyRecord()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_CopyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spridenPrevious_NextBlock()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_NextBlock();
		}

		
		/*
		 *<p>
		 *This trigger will determine if the cursor is about to move onto a null
		 *record.  If it is, then display the last row message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spridenPrevious_NextRecord()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spridenPrevious_PreviousBlock()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.DISABLE_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISABLE_ITEMS")
		public void spridenPrevious_DisableItems()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_DisableItems();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ENABLE_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_ITEMS")
		public void spridenPrevious_EnableItems()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_EnableItems();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.SET_ID_NAVIGABLE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_ID_NAVIGABLE")
		public void spridenPrevious_SetIdNavigable()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_SetIdNavigable();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.SET_NAME_NAVIGABLE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_NAME_NAVIGABLE")
		public void spridenPrevious_SetNameNavigable()
		{
			
			getGoqclibSpridenPreviousController().spridenPrevious_SetNameNavigable();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_doubleClick()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spridenNtypCode_itemChange()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchParameters()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchOptions()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spridenNtypCode_itemOut()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_validate()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spridenNtypCode_keyNexItem()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="LIST_VALUES_COPY", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_ListValuesCopy()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCode_ListValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_NTYP_CODE_LBT")
		@Before
		public void spridenNtypCodeLbt_click()
		{
			
			getGoqclibSpridenPreviousController().spridenNtypCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_NTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PREVIOUS_NTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void previousNtypDesc_itemChange()
		{
			
			getGoqclibSpridenPreviousController().previousNtypDesc_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CHANGE_IND.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="SPRIDEN_CHANGE_IND")
		public void spridenChangeInd_listChange()
		{
			
			getGoqclibSpridenPreviousController().spridenChangeInd_listChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_ID", function=KeyFunction.ITEM_CHANGE)
		public void spridenId_itemChange()
		{
			
			getGoqclibSpridenPreviousController().spridenId_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_LAST_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_LAST_NAME", function=KeyFunction.NEXT_ITEM)
		public void spridenLastName_keyNexItem()
		{
			
			getGoqclibSpridenPreviousController().spridenLastName_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ORIGIN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_ORIGIN", function=KeyFunction.NEXT_ITEM)
		public void spridenOrigin_keyNexItem()
		{
			
			getGoqclibSpridenPreviousController().spridenOrigin_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_USER.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPRIDEN_USER", function=KeyFunction.PREVIOUS_ITEM)
		public void spridenUser_PreviousItem()
		{
			
			getGoqclibSpridenPreviousController().spridenUser_PreviousItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spridenActivityDate_keyNexItem()
		{
			
			getGoqclibSpridenPreviousController().spridenActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spridenActivityDate_itemChange()
		{
			
			getGoqclibSpridenPreviousController().spridenActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spridenActivityDate_itemOut()
		{
			
			getGoqclibSpridenPreviousController().spridenActivityDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_CREATE_DATE", function=KeyFunction.NEXT_ITEM)
		public void spridenCreateDate_keyNexItem()
		{
			
			getGoqclibSpridenPreviousController().spridenCreateDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_CREATE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spridenCreateDate_itemChange()
		{
			
			getGoqclibSpridenPreviousController().spridenCreateDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_CREATE_DATE", function=KeyFunction.ITEM_OUT)
		public void spridenCreateDate_itemOut()
		{
			
			getGoqclibSpridenPreviousController().spridenCreateDate_itemOut();
		}

		
	
	
}

