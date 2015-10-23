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

public class GovcmidController extends DefaultBlockController {


	
	public GovcmidController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER GOVCMID.PRE-BLOCK
		 BEGIN
  EXECUTE_TRIGGER('ENABLE_LOCAL_BTNS');
	G$_CHECK_FAILURE;
--
  IF NVL(:FORM_HEADER.READ_IMAGES,'N') = 'N' THEN
    :FORM_HEADER.READ_IMAGES := 'Y';
    READ_IMAGE_FILE('up.gif','URL','BUTTON_CONTROL_BLOCK.SORT_ID_BTN');
    READ_IMAGE_FILE('down.gif','URL','BUTTON_CONTROL_BLOCK.SORT_NAME_BTN');
  END IF;
--
  :FORM_HEADER.QUERIED_DETAIL := 'Y';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void govcmid_blockIn()
		{
			
				executeAction("ENABLE_LOCAL_BTNS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				
				/*if ( isNull(getFormModel().getFormHeader().getReadImages(), "N").equals("N") )
				{
					getFormModel().getFormHeader().setReadImages(toStr("Y"));
					readImageFile("BUTTON_CONTROL_BLOCK.SORT_ID_BTN", "up.gif",  "URL");
					readImageFile("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN", "down.gif",  "URL");
				}*/
				// 
				getFormModel().getFormHeader().setQueriedDetail(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.POST-QUERY
		 
-- 73-5
EXECUTE_TRIGGER('GET_GOVCMRT_DETAIL');
G$_CHECK_FAILURE;
--
:GOVCMID.ADDRESS_HIERARCHY_MATCH := F_POP_ADDR_HIER_GOVCMID(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
G$_CHECK_FAILURE;
--
:GOVCMID.TELEPHONE_HIERARCHY_MATCH := F_POP_PHONE_HIER_GOVCMID(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
G$_CHECK_FAILURE;
--  
:GOVCMID.EMAIL_HIERARCHY_MATCH := F_POP_EMAIL_HIER_GOVCMID(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
G$_CHECK_FAILURE;
--
POP_GOVCMID_PRIORITY_LIST;
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('POST_QUERY_TRG');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void govcmid_AfterQuery(RowAdapterEvent args)
		{
			
				//  73-5
				GovcmidAdapter govcmidElement = (GovcmidAdapter)args.getRow();


				//  73-5
				executeAction("GET_GOVCMRT_DETAIL");
				getTask().getGoqrpls().gCheckFailure();
				// 
				govcmidElement.setAddressHierarchyMatch(this.getTask().getServices().fPopAddrHierGovcmid(govcmidElement, getFormModel().getKeyBlock().getKeyblockSourceCode()));
				getTask().getGoqrpls().gCheckFailure();
				// 
				govcmidElement.setTelephoneHierarchyMatch(this.getTask().getServices().fPopPhoneHierGovcmid(govcmidElement, getFormModel().getKeyBlock().getKeyblockSourceCode()));
				getTask().getGoqrpls().gCheckFailure();
				//   
				govcmidElement.setEmailHierarchyMatch(this.getTask().getServices().fPopEmailHierGovcmid(govcmidElement, getFormModel().getKeyBlock().getKeyblockSourceCode()));
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().popGovcmidPriorityList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("POST_QUERY_TRG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.WHEN-NEW-RECORD-INSTANCE
		 BEGIN
  IF :GOVCMID.GOVCMID_PIDM IS NOT NULL THEN
    POP_GOVCMID_PRIORITY_LIST;
    G$_CHECK_FAILURE;
    POP_GOVCMID_ADDRESS_LIST;                                                             
    G$_CHECK_FAILURE;
    POP_GOVCMID_PHONE_LIST;
    G$_CHECK_FAILURE;
    POP_GOVCMID_EMAIL_LIST;
    G$_CHECK_FAILURE;
  END IF;
  GO_ITEM('GOVCMID.GOVCMID_ID');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void govcmid_recordChange()
		{
			


				GovcmidAdapter govcmidElement = (GovcmidAdapter)this.getFormModel().getGovcmid().getRowAdapter(true);

                if(govcmidElement==null){
                	return;
                }


				if ( !govcmidElement.getGovcmidPidm().isNull() )
				{
					this.getTask().getServices().popGovcmidPriorityList();
					getTask().getGoqrpls().gCheckFailure();
					this.getTask().getServices().popGovcmidAddressList();
					getTask().getGoqrpls().gCheckFailure();
					this.getTask().getServices().popGovcmidPhoneList();
					getTask().getGoqrpls().gCheckFailure();
					this.getTask().getServices().popGovcmidEmailList();
					getTask().getGoqrpls().gCheckFailure();
				}
				goItem(toStr("GOVCMID.GOVCMID_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-CLRBLK
		 BEGIN
  CLEAR_SUSPENSE_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void govcmid_keyClearBlock()
		{
			
				this.getTask().getServices().clearSuspenseBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-CLRFRM
		 BEGIN
  CLEAR_SUSPENSE_BLOCK;
  G$_CHECK_FAILURE;
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CHECK_BTN',ENABLED,PROPERTY_FALSE);
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void govcmid_ClearTask()
		{
			
				this.getTask().getServices().clearSuspenseBlock();
				getTask().getGoqrpls().gCheckFailure();
				// 
				setItemEnabled("BUTTON_CONTROL_BLOCK.CHECK_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-CLRREC
		 BEGIN
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.UPDATE_BTN',ENABLED) = 'FALSE' THEN
  	
  	G$_INVALID_FUNCTION_MSG;
  ELSE
    CM_UPDATE_EXISTING_ID;
    G$_CHECK_FAILURE;
--
    CLEAN_UP_AND_EXIT;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void govcmid_ClearRecord()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
	
                if(gotcmmeElement==null){
                	return;
                }


				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.UPDATE_BTN").equals("FALSE") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					this.getTask().getServices().cmUpdateExistingId(gotcmmeElement);
					getTask().getGoqrpls().gCheckFailure();
					// 
					this.getTask().getServices().cleanUpAndExit();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-COMMIT
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void govcmid_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-CREREC
		 BEGIN
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CREATE_BTN',ENABLED) = 'FALSE' THEN
  	
  	G$_INVALID_FUNCTION_MSG;
  ELSE
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.UPDATE_BTN' ,ENABLED,PROPERTY_FALSE);
    CHECK_FIRST_NAME;
    G$_CHECK_FAILURE;
--
-- 73-5 replace with extended checks and rollback control
<multilinecomment>
    CM_CREATE_NEW_ID;
    G$_CHECK_FAILURE;
--
    CLEAN_UP_AND_EXIT;
    </multilinecomment>
-- 73-5
-- basic validtation checks to save API calls
  EXECUTE_TRIGGER('CM_CREATE_NEW_ID_1');
  G$_CHECK_FAILURE;
  -- if basic data entry missing, do not rollback
  IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
      RETURN;
  END IF;
  -- attempt create using API calls
  EXECUTE_TRIGGER('CM_CREATE_NEW_ID_2');
  G$_CHECK_FAILURE;
  -- if no API errors, after acknowledge, rollback 
  IF  :FORM_HEADER.API_FAILURE = 'Y' 
 	AND :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND = 'Y' THEN
      RETURN;
  ELSE
  	  CLEAN_UP_AND_EXIT;
  END IF;
  --
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void govcmid_CreateRecord()
		{
			

	
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
		
                if(gotcmmeElement==null){
                	return;
                }


				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.CREATE_BTN").equals("FALSE") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					setItemEnabled("BUTTON_CONTROL_BLOCK.UPDATE_BTN", false);
					this.getTask().getServices().checkFirstName(gotcmmeElement);
					getTask().getGoqrpls().gCheckFailure();
					// 
					//  73-5 replace with extended checks and rollback control
					// CM_CREATE_NEW_ID;
					// G$_CHECK_FAILURE;
					// --
					// CLEAN_UP_AND_EXIT;
					//  73-5
					//  basic validtation checks to save API calls
					executeAction("CM_CREATE_NEW_ID_1");
					getTask().getGoqrpls().gCheckFailure();
					//  if basic data entry missing, do not rollback
					if ( getFormModel().getFormHeader().getApiFailure().equals("Y") )
					{
						return ;
					}
					//  attempt create using API calls
					executeAction("CM_CREATE_NEW_ID_2");
					getTask().getGoqrpls().gCheckFailure();
					//  if no API errors, after acknowledge, rollback 
					if ( getFormModel().getFormHeader().getApiFailure().equals("Y") && getFormModel().getKeyBlock().getKeyblockApiFailureInd().equals("Y") )
					{
						return ;
					}
					else {
						this.getTask().getServices().cleanUpAndExit();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-DELREC
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void govcmid_DeleteRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-DUPREC
		 BEGIN
  SELECT_ID_AND_EXIT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void govcmid_CopyRecord()
		{
			
				this.getTask().getServices().selectIdAndExit();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-EXEQRY
		 BEGIN
  :FORM_HEADER.CALLED_FORM   := 0;
  :FORM_HEADER.HOLD_BLK_ITEM := :SYSTEM.CURSOR_ITEM;
--
	GO_BLOCK('GORCMDO');
  EXECUTE_QUERY(ALL_RECORDS);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void govcmid_ExecuteQuery()
		{
			
				getFormModel().getFormHeader().setCalledForm(toInt(0));
				getFormModel().getFormHeader().setHoldBlkItem(toStr(getCursorItem()));
				// 
//				goBlock(toStr("GORCMDO"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-NXTBLK
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void govcmid_NextBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-NXTREC
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
  MESSAGE(G$_NLS.Get('GOAMTCH-0056','FORM','At last record.'));
ELSE
	NEXT_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void govcmid_NextRecord()
		{
			
			
				if ( isInLastRecord(true) )
				{
					infoMessage(GNls.Fget(toStr("GOAMTCH-0056"), toStr("FORM"), toStr("At last record.")));
				}
				else {
					nextRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-PRVBLK
		 BEGIN
  IF GET_TAB_PAGE_PROPERTY('MATCH_TAB',ENABLED) = 'TRUE' THEN
    GO_BLOCK('GOVCMRT_MATCH');
  ELSE
    CLEAR_SUSPENSE_BLOCK;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void govcmid_PreviousBlock()
		{
			
				if ( toBool(getTabPageEnabled("MATCH_TAB")).equals("TRUE") )
				{
					goBlock(toStr("GOVCMRT_MATCH"));
				}
				else {
					this.getTask().getServices().clearSuspenseBlock();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.KEY-PRVREC
		 IF :SYSTEM.CURSOR_RECORD = '1' THEN
  MESSAGE(G$_NLS.Get('GOAMTCH-0057','FORM','At first record.'));
ELSE
	PREVIOUS_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void govcmid_PreviousRecord()
		{
			
				if ( isInFirstRecord() )
				{
					infoMessage(GNls.Fget(toStr("GOAMTCH-0057"), toStr("FORM"), toStr("At first record.")));
				}
				else {
					previousRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMID.GET_GOVCMRT_DETAIL
		 DECLARE
--
 lv_addid_code  GORADID.GORADID_ADID_CODE%TYPE;
--
  CURSOR spbpers_c IS
    SELECT SPBPERS_SSN,
           SPBPERS_SEX,
           SPBPERS_BIRTH_DATE
      FROM SPBPERS
     WHERE SPBPERS_PIDM = :GOVCMID.GOVCMID_PIDM;
--
  CURSOR govcmrt_rowids_c IS
    SELECT GOVCMRT_SPRADDR_ROWID,
           GOVCMRT_GOREMAL_ROWID,
           GOVCMRT_SPRTELE_ROWID,
           GOVCMRT_GORADID_ROWID
      FROM GOVCMRT
     WHERE GOVCMRT_PIDM = :GOVCMID.GOVCMID_PIDM;
--
--Additional ID
   CURSOR goradid_c IS
     SELECT GORADID_ADID_CODE,GORADID_ADDITIONAL_ID
     FROM GORADID
     WHERE ROWID = :GOVCMID.GOVCMRT_GORADID_ROWID;
     <multilinecomment> GORADID_PIDM = :GOVCMID.GOVCMID_PIDM
        AND GORADID_ADDITIONAL_ID = :GOTCMME.GOTCMME_ADDITIONAL_ID
       AND GORADID_ADID_CODE = :GOTCMME.GOTCMME_ADID_CODE; </multilinecomment>
--Additional ID
BEGIN
--
--:GOVCMID.GOVCMID_name := :GOVCMID.GOVCMID_name || 'and more stuff added';
  OPEN spbpers_c;
  FETCH spbpers_c INTO :GOVCMID.MATCH_SSN, 
                       :GOVCMID.MATCH_SEX, 
                       :GOVCMID.MATCH_BIRTH_DATE;
  CLOSE spbpers_c;
--
  OPEN govcmrt_rowids_c;
  FETCH govcmrt_rowids_c INTO :GOVCMID.GOVCMRT_SPRADDR_ROWID,
                              :GOVCMID.GOVCMRT_GOREMAL_ROWID,
                              :GOVCMID.GOVCMRT_SPRTELE_ROWID,
                              :GOVCMID.GOVCMRT_GORADID_ROWID;
  CLOSE govcmrt_rowids_c;
--
  :GOVCMID.MATCH_ID := :GOVCMID.GOVCMID_ID;
--Additional ID
  OPEN goradid_c; 
  FETCH goradid_c INTO lv_addid_code, 
                       :GOVCMID.MATCH_ADD_ID;
  IF lv_addid_code IS NOT NULL THEN
  	:GOVCMID.MATCH_ADD_ID := lv_addid_code||' = '|| 	:GOVCMID.MATCH_ADD_ID;
  END IF;
  
  
  CLOSE goradid_c;
  
--Additional ID    
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.GET_GOVCMRT_DETAIL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_GOVCMRT_DETAIL")
		public void govcmid_GetGovcmrtDetail()
		{
			


				GovcmidAdapter govcmidElement = (GovcmidAdapter)this.getFormModel().getGovcmid().getRowAdapter(true);
	
                if(govcmidElement==null){
                	return;
                }


				int rowCount = 0;
				{
					// 
					NString lvAddidCode= NString.getNull();
					String sqlspbpersC = "SELECT SPBPERS_SSN, SPBPERS_SEX, SPBPERS_BIRTH_DATE " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :GOVCMID_GOVCMID_PIDM ";
					DataCursor spbpersC = new DataCursor(sqlspbpersC);
					String sqlgovcmrtRowidsC = "SELECT GOVCMRT_SPRADDR_ROWID, GOVCMRT_GOREMAL_ROWID, GOVCMRT_SPRTELE_ROWID, GOVCMRT_GORADID_ROWID " +
	" FROM GOVCMRT " +
	" WHERE GOVCMRT_PIDM = :GOVCMID_GOVCMID_PIDM ";
					DataCursor govcmrtRowidsC = new DataCursor(sqlgovcmrtRowidsC);
					String sqlgoradidC = "SELECT GORADID_ADID_CODE, GORADID_ADDITIONAL_ID " +
	" FROM GORADID " +
	" WHERE ROWID = :GOVCMID_GOVCMRT_GORADID_ROWID ";
					DataCursor goradidC = new DataCursor(sqlgoradidC);
					try {
						// 
						// :GOVCMID.GOVCMID_name := :GOVCMID.GOVCMID_name || 'and more stuff added';
						//Setting query parameters
						spbpersC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
						spbpersC.open();
						ResultSet spbpersCResults = spbpersC.fetchInto();
						if ( spbpersCResults != null ) {
							govcmidElement.setMatchSsn(spbpersCResults.getStr(0));
							govcmidElement.setMatchSex(spbpersCResults.getStr(1));
							govcmidElement.setMatchBirthDate(spbpersCResults.getDate(2));
						}
//						spbpersC.close();
						// 
						//Setting query parameters
						govcmrtRowidsC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
						govcmrtRowidsC.open();
						ResultSet govcmrtRowidsCResults = govcmrtRowidsC.fetchInto();
						if ( govcmrtRowidsCResults != null ) {
							govcmidElement.setGovcmrtSpraddrRowid(govcmrtRowidsCResults.getStr(0));
							govcmidElement.setGovcmrtGoremalRowid(govcmrtRowidsCResults.getStr(1));
							govcmidElement.setGovcmrtSprteleRowid(govcmrtRowidsCResults.getStr(2));
							govcmidElement.setGovcmrtGoradidRowid(govcmrtRowidsCResults.getStr(3));
						}
//						govcmrtRowidsC.close();
						// 
						govcmidElement.setMatchId(govcmidElement.getGovcmidId());
						// Additional ID
						//Setting query parameters
						goradidC.addParameter("GOVCMID_GOVCMRT_GORADID_ROWID", govcmidElement.getGovcmrtGoradidRowid());
						goradidC.open();
						ResultSet goradidCResults = goradidC.fetchInto();
						if ( goradidCResults != null ) {
							lvAddidCode = goradidCResults.getStr(0);
							govcmidElement.setMatchAddId(goradidCResults.getStr(1));
						}
						if ( !lvAddidCode.isNull() )
						{
							govcmidElement.setMatchAddId(lvAddidCode.append(" = ").append(govcmidElement.getMatchAddId()));
						}
//						goradidC.close();
					}
					finally{
						spbpersC.close();
						govcmrtRowidsC.close();
						goradidC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMID.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void govcmid_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FORM_HEADER_MATCH_PIDM", this.getFormModel().getFormHeader().getMatchPidm()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER MATCH_PRIORITY_LIST.KEY-DOWN
		 NEXT_RECORD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_PRIORITY_LIST.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD, item="MATCH_PRIORITY_LIST")
		public void matchPriorityList_MoveDown()
		{
			
			govcmid_NextRecord();
		}

		
	
	
}

