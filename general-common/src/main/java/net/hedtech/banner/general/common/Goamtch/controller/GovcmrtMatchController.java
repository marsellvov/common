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

public class GovcmrtMatchController extends DefaultBlockController {


	
	public GovcmrtMatchController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.PRE-BLOCK
		 BEGIN
  IF NVL(:COMMIT_COMPLETED,'N') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0054','FORM','*ERROR* You must press Duplicate Check or Next Block to perform Common Matching.'));
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
	--
  EXECUTE_TRIGGER('ENABLE_LOCAL_BTNS');
	G$_CHECK_FAILURE;
--
  :FORM_HEADER.QUERIED_DETAIL := 'Y';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void govcmrtMatch_blockIn()
		{
			
				if ( isNull(getFormModel().getFormHeader().getCommitCompleted(), "N").notEquals("Y") )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0054"), toStr("FORM"), toStr("*ERROR* You must press Duplicate Check or Next Block to perform Common Matching.")));
					throw new ApplicationException();
				}
				// 
				executeAction("ENABLE_LOCAL_BTNS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getFormModel().getFormHeader().setQueriedDetail(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.POST-QUERY
		 BEGIN
  EXECUTE_TRIGGER('GET_MATCH_DETAILS');
  G$_CHECK_FAILURE;
--
  POPULATE_MATCH_ADDRESS_LIST;
  G$_CHECK_FAILURE;
  --
  POPULATE_MATCH_TELEPHONE_LIST;
  G$_CHECK_FAILURE;
  --
  POPULATE_MATCH_EMAIL_LIST;
  G$_CHECK_FAILURE;
  -- 73-1
  POP_GOVCMRT_MATCH_LIST;
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('POST_QUERY_TRG');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void govcmrtMatch_AfterQuery(RowAdapterEvent args)
		{
			
				executeAction("GET_MATCH_DETAILS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().populateMatchAddressList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().populateMatchTelephoneList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().populateMatchEmailList();
				getTask().getGoqrpls().gCheckFailure();
				//  73-1
				this.getTask().getServices().popGovcmrtMatchList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("POST_QUERY_TRG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.WHEN-MOUSE-DOUBLECLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void govcmrtMatch_doubleClick()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-CLRBLK
		 BEGIN
  CLEAR_MATCH_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void govcmrtMatch_keyClearBlock()
		{
			
				this.getTask().getServices().clearMatchBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-CLRFRM
		 BEGIN
	-- 74-G
  --CHECK_CLRFRM;
  --G$_CHECK_FAILURE;
--
 	IF :SYSTEM.RECORD_STATUS = 'CHANGED' THEN
    :SYSTEM.MESSAGE_LEVEL := '5';
    COMMIT_FORM;
    :SYSTEM.MESSAGE_LEVEL := '0';
	END IF;
--
  REMOVE_CMRT_RECORDS;
  REMOVE_CMME_RECORDS;
--
  EXECUTE_TRIGGER('DISABLE_LOCAL_BTNS');
  G$_CHECK_FAILURE;
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CHECK_BTN',ENABLED,PROPERTY_FALSE);
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void govcmrtMatch_ClearTask()
		{
			
				//  74-G
				// CHECK_CLRFRM;
				// G$_CHECK_FAILURE;
				// 
				if ( getRecordStatus().equals("CHANGED") )
				{
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					commitTask();
							} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				}
				// 
				this.getTask().getServices().removeCmrtRecords();
				this.getTask().getServices().removeCmmeRecords();
				// 
				executeAction("DISABLE_LOCAL_BTNS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setItemEnabled("BUTTON_CONTROL_BLOCK.CHECK_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-CLRREC
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
		 * GOVCMRT_MATCH.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void govcmrtMatch_ClearRecord()
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

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-COMMIT
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void govcmrtMatch_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-CREREC
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
--  	IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
--    	  RETURN;
--  	END IF;
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
		 * GOVCMRT_MATCH.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void govcmrtMatch_CreateRecord()
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
					//   	IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
					//     	  RETURN;
					//   	END IF;
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

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-DELREC
		 BEGIN
 
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void govcmrtMatch_DeleteRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-DUPREC
		 BEGIN
  SELECT_ID_AND_EXIT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void govcmrtMatch_CopyRecord()
		{
			
				this.getTask().getServices().selectIdAndExit();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-ENTQRY
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void govcmrtMatch_Search()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-EXEQRY
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
		 * GOVCMRT_MATCH.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void govcmrtMatch_ExecuteQuery()
		{
			
				getFormModel().getFormHeader().setCalledForm(toInt(0));
				getFormModel().getFormHeader().setHoldBlkItem(toStr(getCursorItem()));
				// 
				goBlock(toStr("GORCMDO"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-NXTBLK
		 IF  GET_TAB_PAGE_PROPERTY('GOVCMID',ENABLED) = 'TRUE' THEN
    NAV_TO_GOVCMID_TAB;
ELSE
	  
	  G$_INVALID_FUNCTION_MSG;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void govcmrtMatch_NextBlock()
		{
			
				if ( toBool(getTabPageEnabled("GOVCMID")).equals("TRUE") )
				{
					this.getTask().getServices().navToGovcmidTab();
				}
				else {
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-NXTREC
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void govcmrtMatch_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-PRVBLK
		 BEGIN
  CLEAR_MATCH_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void govcmrtMatch_PreviousBlock()
		{
			
				this.getTask().getServices().clearMatchBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.KEY-PRVREC
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void govcmrtMatch_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOVCMRT_MATCH.GET_MATCH_DETAILS
		 DECLARE
  lv_atyp_code   SPRADDR.SPRADDR_ATYP_CODE%TYPE;
  lv_cnty_code   SPRADDR.SPRADDR_CNTY_CODE%TYPE;
  lv_emal_code   GOREMAL.GOREMAL_EMAL_CODE%TYPE;
  lv_emal_stat   GOREMAL.GOREMAL_STATUS_IND%TYPE;
  lv_natn_code   SPRADDR.SPRADDR_NATN_CODE%TYPE;
  lv_tele_code   SPRTELE.SPRTELE_TELE_CODE%TYPE;
  lv_tele_stat   SPRTELE.SPRTELE_STATUS_IND%TYPE;
  lv_addid_code  GORADID.GORADID_ADID_CODE%TYPE;
--
  lv_change_ind  SPRIDEN.SPRIDEN_CHANGE_IND%TYPE;
  lv_first_name  SPRIDEN.SPRIDEN_FIRST_NAME%TYPE;
  lv_full_name   VARCHAR2(230);
  lv_id          SPRIDEN.SPRIDEN_ID%TYPE;
  lv_middle_name SPRIDEN.SPRIDEN_MI%TYPE;
  lv_last_name   SPRIDEN.SPRIDEN_LAST_NAME%TYPE;
--
	CURSOR spriden_c_id_rowid IS
	  SELECT SPRIDEN_ID || DECODE(SPRIDEN_CHANGE_IND,'I','*','')
	    FROM SPRIDEN
	   WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_SPRIDEN_ID_ROWID;
--
	CURSOR spriden_c_name_rowid IS
	  SELECT SPRIDEN_FIRST_NAME,
	         SPRIDEN_MI,
	         SPRIDEN_LAST_NAME,
	         SPRIDEN_CHANGE_IND
	    FROM SPRIDEN
	   WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_SPRIDEN_NAME_ROWID;
--
	CURSOR spriden_c IS
	  SELECT SPRIDEN_ID,
	         SPRIDEN_FIRST_NAME,
	         SPRIDEN_MI,
	         SPRIDEN_LAST_NAME
	    FROM SPRIDEN
	   WHERE SPRIDEN_PIDM = :GOVCMRT_MATCH.GOVCMRT_PIDM
	     AND SPRIDEN_CHANGE_IND IS NULL;
--
  CURSOR spbpers_c IS
    SELECT SPBPERS_SSN,
           SPBPERS_SEX,
           SPBPERS_BIRTH_DATE
      FROM SPBPERS
     WHERE SPBPERS_PIDM = :GOVCMRT_MATCH.GOVCMRT_PIDM;
--
  CURSOR spraddr_c IS
    SELECT SPRADDR_STREET_LINE1,
           SPRADDR_STREET_LINE2,
           SPRADDR_STREET_LINE3,
           SPRADDR_CITY || ', ' || SPRADDR_STAT_CODE || ' ' || SPRADDR_ZIP,
           SPRADDR_ATYP_CODE,
           SPRADDR_CNTY_CODE,
           SPRADDR_NATN_CODE,
           SPRADDR_STATUS_IND
      FROM SPRADDR
     WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_SPRADDR_ROWID;
--
  CURSOR sprtele_c IS
    SELECT SPRTELE_PHONE_AREA || ' ' || SPRTELE_PHONE_NUMBER || ' ' || SPRTELE_PHONE_EXT,
           SPRTELE_TELE_CODE,
           DECODE(SPRTELE_STATUS_IND,'I','*','')
      FROM SPRTELE
     WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_SPRTELE_ROWID;
--
  CURSOR goremal_c IS
    SELECT GOREMAL_EMAIL_ADDRESS,
           GOREMAL_EMAL_CODE,
           DECODE(GOREMAL_STATUS_IND,'I','*','')
      FROM GOREMAL
     WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_GOREMAL_ROWID;
--
--
--Additional ID
   CURSOR goradid_c IS
     SELECT GORADID_ADID_CODE,GORADID_ADDITIONAL_ID
     FROM GORADID
     WHERE ROWID = :GOVCMRT_MATCH.GOVCMRT_GORADID_ROWID;
     <multilinecomment> GORADID_PIDM=:GOVCMRT_MATCH.GOVCMRT_PIDM
       AND GORADID_ADDITIONAL_ID = :GOTCMME.GOTCMME_ADDITIONAL_ID
       AND GORADID_ADID_CODE = :GOTCMME.GOTCMME_ADID_CODE;</multilinecomment>

--Additional ID
BEGIN
--
-- If the match ID rowid column is not null, then get that id.
--
  IF :GOVCMRT_MATCH.GOVCMRT_SPRIDEN_ID_ROWID IS NOT NULL THEN
    OPEN spriden_c_id_rowid;
    FETCH spriden_c_id_rowid INTO :GOVCMRT_MATCH.MATCH_ID;
    CLOSE spriden_c_id_rowid;
  END IF;
--
-- If the match NAME rowid column is not null, then get that name.
--
  IF :GOVCMRT_MATCH.GOVCMRT_SPRIDEN_NAME_ROWID IS NOT NULL THEN
    OPEN spriden_c_name_rowid;
    FETCH spriden_c_name_rowid INTO lv_first_name,
                                    lv_middle_name,
                                    lv_last_name,
                                    lv_change_ind;
    CLOSE spriden_c_name_rowid;
    G$_BUILD_FULL_NAME(lv_full_name,lv_last_name,lv_first_name,lv_middle_name,'','',90);
    IF lv_change_ind = 'N' THEN
    	lv_full_name := lv_full_name || '*';
    END IF;
    :GOVCMRT_MATCH.MATCH_NAME := lv_full_name || 'more stuff';
  END IF;
--
-- If the id or name is still null, get these for the pidm.
--
  OPEN spriden_c;
  FETCH spriden_c INTO lv_id, 
                       lv_first_name,
                       lv_middle_name,
                       lv_last_name;
  CLOSE spriden_c;
--
  IF :GOVCMRT_MATCH.MATCH_ID IS NULL THEN
  	:GOVCMRT_MATCH.MATCH_ID := lv_id;
  END IF;
  IF :GOVCMRT_MATCH.MATCH_NAME IS NULL THEN
    G$_BUILD_FULL_NAME(:GOVCMRT_MATCH.MATCH_NAME,lv_last_name,lv_first_name,lv_middle_name,'','',90);
  END IF;
--
--
  OPEN spbpers_c;
  FETCH spbpers_c INTO :GOVCMRT_MATCH.MATCH_SSN, 
                       :GOVCMRT_MATCH.MATCH_SEX, 
                       :GOVCMRT_MATCH.MATCH_BIRTH_DATE;
  CLOSE spbpers_c;
--
  IF :GOVCMRT_MATCH.GOVCMRT_SPRADDR_ROWID IS NOT NULL THEN
    OPEN spraddr_c;
    FETCH spraddr_c INTO :GOVCMRT_MATCH.MATCH_STREET_LINE1, 
                         :GOVCMRT_MATCH.MATCH_STREET_LINE2,
                         :GOVCMRT_MATCH.MATCH_STREET_LINE3,
                         :GOVCMRT_MATCH.MATCH_CITY_STATE_ZIP,
                         lv_atyp_code, 
                         lv_cnty_code, 
                         lv_natn_code,
                         :GOVCMRT_MATCH.MATCH_ADDRESS_STATUS_IND;
    CLOSE spraddr_c;
  END IF;
--  no longer display the Address Type description; replaced with just the ATYP_CODE below
  --IF lv_atyp_code IS NOT NULL THEN
  --  :GOVCMRT_MATCH.MATCH_ATYP_DESCRIPTION := GB_STVATYP.F_GET_DESCRIPTION(lv_atyp_code);
  --END IF;
  -- concatenate the Address Type with Street Line 1;
  -- place an asterisk at front of description if Address Type is Inactive status
  IF  lv_atyp_code IS NOT NULL THEN
      IF	:GOVCMRT_MATCH.MATCH_ADDRESS_STATUS_IND IS NOT NULL THEN
      		:GOVCMRT_MATCH.MATCH_STREET_LINE1 := '*' || lv_atyp_code || '=' ||
      		                                     :GOVCMRT_MATCH.MATCH_STREET_LINE1;
      ELSE
      		:GOVCMRT_MATCH.MATCH_STREET_LINE1 := lv_atyp_code || '=' || 
      		                                     :GOVCMRT_MATCH.MATCH_STREET_LINE1;
      END IF;
  END IF;
-- 73-5
  --
  IF  lv_natn_code IS NOT NULL THEN
  	  :GOVCMRT_MATCH.MATCH_NATION := GB_STVNATN.F_GET_DESCRIPTION(lv_natn_code);
  	  IF  :GOVCMRT_MATCH.MATCH_NATION IS NOT NULL THEN
  	  		:GOVCMRT_MATCH.MATCH_COUNTY_NATION := :GOVCMRT_MATCH.MATCH_NATION;
  	  END IF;
  END IF;
  --
  IF  lv_cnty_code IS NOT NULL THEN
  	  :GOVCMRT_MATCH.MATCH_COUNTY := GB_STVCNTY.F_GET_DESCRIPTION(lv_cnty_code);
  	  IF  :GOVCMRT_MATCH.MATCH_COUNTY IS NOT NULL THEN
  	  		:GOVCMRT_MATCH.MATCH_COUNTY_NATION := :GOVCMRT_MATCH.MATCH_COUNTY || ', ' || 
  	  																					:GOVCMRT_MATCH.MATCH_COUNTY_NATION;
  	  END IF;
  END IF;
  --
--
--
-- Get telephone information
--
  IF :GOVCMRT_MATCH.GOVCMRT_SPRTELE_ROWID IS NOT NULL THEN
    OPEN sprtele_c;
    FETCH sprtele_c INTO :GOVCMRT_MATCH.MATCH_PHONE,
                         lv_tele_code,
                         lv_tele_stat;
    CLOSE sprtele_c;
  END IF;
--
  IF lv_tele_code IS NOT NULL THEN
--    :GOVCMRT_MATCH.MATCH_PHONE := GB_STVTELE.F_GET_DESCRIPTION(lv_tele_code)
    :GOVCMRT_MATCH.MATCH_PHONE := lv_tele_stat || lv_tele_code
                                  || '=' || :GOVCMRT_MATCH.MATCH_PHONE;
  END IF;
--
-- Get e-mail information
--
  IF :GOVCMRT_MATCH.GOVCMRT_GOREMAL_ROWID IS NOT NULL THEN
    OPEN goremal_c;
    FETCH goremal_c INTO :GOVCMRT_MATCH.MATCH_EMAIL,
                         lv_emal_code,
                         lv_emal_stat;
    CLOSE goremal_c;
  END IF;
--
  IF lv_emal_code IS NOT NULL THEN
--    :GOVCMRT_MATCH.MATCH_EMAIL := GB_GTVEMAL.F_GET_DESCRIPTION(lv_emal_code)
    :GOVCMRT_MATCH.MATCH_EMAIL := lv_emal_stat || lv_emal_code 
                                  || '=' || :GOVCMRT_MATCH.MATCH_EMAIL;
  END IF;
--Additional ID
  OPEN goradid_c; 
  FETCH goradid_c INTO lv_addid_code, 
                       :GOVCMRT_MATCH.MATCH_ADDITIONAL_ID;
  IF lv_addid_code IS NOT NULL THEN
  	:GOVCMRT_MATCH.MATCH_ADDITIONAL_ID := lv_addid_code || ' = ' ||:GOVCMRT_MATCH.MATCH_ADDITIONAL_ID;
 	END IF;
  CLOSE goradid_c;
  
--Additional ID  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.GET_MATCH_DETAILS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_MATCH_DETAILS")
		public void govcmrtMatch_GetMatchDetails()
		{
			

				
				GovcmrtMatchAdapter govcmrtMatchElement = (GovcmrtMatchAdapter)this.getFormModel().getGovcmrtMatch().getRowAdapter(true);
				
                if(govcmrtMatchElement==null){
                	return;
                }


				int rowCount = 0;
				{
					NString lvAtypCode= NString.getNull();
					NString lvCntyCode= NString.getNull();
					NString lvEmalCode= NString.getNull();
					NString lvEmalStat= NString.getNull();
					NString lvNatnCode= NString.getNull();
					NString lvTeleCode= NString.getNull();
					NString lvTeleStat= NString.getNull();
					NString lvAddidCode= NString.getNull();
					// 
					NString lvChangeInd= NString.getNull();
					NString lvFirstName= NString.getNull();
					NString lvFullName= NString.getNull();
					NString lvId= NString.getNull();
					NString lvMiddleName= NString.getNull();
					NString lvLastName= NString.getNull();
					String sqlspridenCIdRowid = "SELECT SPRIDEN_ID || DECODE(SPRIDEN_CHANGE_IND, 'I', '*', '') " +
	" FROM SPRIDEN " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_SPRIDEN_ID_ROWID ";
					DataCursor spridenCIdRowid = new DataCursor(sqlspridenCIdRowid);
					String sqlspridenCNameRowid = "SELECT SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_LAST_NAME, SPRIDEN_CHANGE_IND " +
	" FROM SPRIDEN " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_SPRIDEN_NAME_ROWID ";
					DataCursor spridenCNameRowid = new DataCursor(sqlspridenCNameRowid);
					String sqlspridenC = "SELECT SPRIDEN_ID, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_LAST_NAME " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :GOVCMRT_MATCH_GOVCMRT_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
					DataCursor spridenC = new DataCursor(sqlspridenC);
					String sqlspbpersC = "SELECT SPBPERS_SSN, SPBPERS_SEX, SPBPERS_BIRTH_DATE " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :GOVCMRT_MATCH_GOVCMRT_PIDM ";
					DataCursor spbpersC = new DataCursor(sqlspbpersC);
					String sqlspraddrC = "SELECT SPRADDR_STREET_LINE1, SPRADDR_STREET_LINE2, SPRADDR_STREET_LINE3, SPRADDR_CITY || ', ' || SPRADDR_STAT_CODE || ' ' || SPRADDR_ZIP, SPRADDR_ATYP_CODE, SPRADDR_CNTY_CODE, SPRADDR_NATN_CODE, SPRADDR_STATUS_IND " +
	" FROM SPRADDR " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_SPRADDR_ROWID ";
					DataCursor spraddrC = new DataCursor(sqlspraddrC);
					String sqlsprteleC = "SELECT SPRTELE_PHONE_AREA || ' ' || SPRTELE_PHONE_NUMBER || ' ' || SPRTELE_PHONE_EXT, SPRTELE_TELE_CODE, DECODE(SPRTELE_STATUS_IND, 'I', '*', '') " +
	" FROM SPRTELE " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_SPRTELE_ROWID ";
					DataCursor sprteleC = new DataCursor(sqlsprteleC);
					String sqlgoremalC = "SELECT GOREMAL_EMAIL_ADDRESS, GOREMAL_EMAL_CODE, DECODE(GOREMAL_STATUS_IND, 'I', '*', '') " +
	" FROM GOREMAL " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_GOREMAL_ROWID ";
					DataCursor goremalC = new DataCursor(sqlgoremalC);
					String sqlgoradidC = "SELECT GORADID_ADID_CODE, GORADID_ADDITIONAL_ID " +
	" FROM GORADID " +
	" WHERE ROWID = :GOVCMRT_MATCH_GOVCMRT_GORADID_ROWID ";
					DataCursor goradidC = new DataCursor(sqlgoradidC);
					try {
						// 
						//  If the match ID rowid column is not null, then get that id.
						// 
						if ( !govcmrtMatchElement.getGovcmrtSpridenIdRowid().isNull() )
						{
							//Setting query parameters
							spridenCIdRowid.addParameter("GOVCMRT_MATCH_GOVCMRT_SPRIDEN_ID_ROWID", govcmrtMatchElement.getGovcmrtSpridenIdRowid());
						
							spridenCIdRowid.open();
							ResultSet spridenCIdRowidResults = spridenCIdRowid.fetchInto();
							if ( spridenCIdRowidResults != null ) {
								govcmrtMatchElement.setMatchId(spridenCIdRowidResults.getStr(0));
							}
							spridenCIdRowid.close();
						}
						// 
						//  If the match NAME rowid column is not null, then get that name.
						// 
						if ( !govcmrtMatchElement.getGovcmrtSpridenNameRowid().isNull() )
						{
							//Setting query parameters
							spridenCNameRowid.addParameter("GOVCMRT_MATCH_GOVCMRT_SPRIDEN_NAME_ROWID", govcmrtMatchElement.getGovcmrtSpridenNameRowid());
							spridenCNameRowid.open();
							ResultSet spridenCNameRowidResults = spridenCNameRowid.fetchInto();
							if ( spridenCNameRowidResults != null ) {
								lvFirstName = spridenCNameRowidResults.getStr(0);
								lvMiddleName = spridenCNameRowidResults.getStr(1);
								lvLastName = spridenCNameRowidResults.getStr(2);
								lvChangeInd = spridenCNameRowidResults.getStr(3);
							}
							spridenCNameRowid.close();
							Ref<NString> pFullName_ref = new Ref<NString>(lvFullName);
							getTask().getGoqrpls().gBuildFullName(pFullName_ref, lvLastName, lvFirstName, lvMiddleName, toStr(""), toStr(""), toInt(90));
							lvFullName = pFullName_ref.val;
							if ( lvChangeInd.equals("N") )
							{
								lvFullName = lvFullName.append("*");
							}
							govcmrtMatchElement.setMatchName(lvFullName.append("more stuff"));
						}
						// 
						//  If the id or name is still null, get these for the pidm.
						// 
						//Setting query parameters
						spridenC.addParameter("GOVCMRT_MATCH_GOVCMRT_PIDM", govcmrtMatchElement.getGovcmrtPidm());
						spridenC.open();
						ResultSet spridenCResults = spridenC.fetchInto();
						if ( spridenCResults != null ) {
							lvId = spridenCResults.getStr(0);
							lvFirstName = spridenCResults.getStr(1);
							lvMiddleName = spridenCResults.getStr(2);
							lvLastName = spridenCResults.getStr(3);
						}
						spridenC.close();
						// 
						if ( govcmrtMatchElement.getMatchId().isNull() )
						{
							govcmrtMatchElement.setMatchId(lvId);
						}
						if ( govcmrtMatchElement.getMatchName().isNull() )
						{
							Ref<NString> pFullName_ref = new Ref<NString>(govcmrtMatchElement.getMatchName());
							getTask().getGoqrpls().gBuildFullName(pFullName_ref, lvLastName, lvFirstName, lvMiddleName, toStr(""), toStr(""), toInt(90));
							govcmrtMatchElement.setMatchName(pFullName_ref.val);
						}
						// 
						// 
						//Setting query parameters
						spbpersC.addParameter("GOVCMRT_MATCH_GOVCMRT_PIDM", govcmrtMatchElement.getGovcmrtPidm());
						spbpersC.open();
						ResultSet spbpersCResults = spbpersC.fetchInto();
						if ( spbpersCResults != null ) {
							govcmrtMatchElement.setMatchSsn(spbpersCResults.getStr(0));
							govcmrtMatchElement.setMatchSex(spbpersCResults.getStr(1));
							govcmrtMatchElement.setMatchBirthDate(spbpersCResults.getDate(2));
						}
						spbpersC.close();
						// 
						if ( !govcmrtMatchElement.getGovcmrtSpraddrRowid().isNull() )
						{
							//Setting query parameters
							spraddrC.addParameter("GOVCMRT_MATCH_GOVCMRT_SPRADDR_ROWID", govcmrtMatchElement.getGovcmrtSpraddrRowid());
							spraddrC.open();
							ResultSet spraddrCResults = spraddrC.fetchInto();
							if ( spraddrCResults != null ) {
								govcmrtMatchElement.setMatchStreetLine1(spraddrCResults.getStr(0));
								govcmrtMatchElement.setMatchStreetLine2(spraddrCResults.getStr(1));
								govcmrtMatchElement.setMatchStreetLine3(spraddrCResults.getStr(2));
								govcmrtMatchElement.setMatchCityStateZip(spraddrCResults.getStr(3));
								lvAtypCode = spraddrCResults.getStr(4);
								lvCntyCode = spraddrCResults.getStr(5);
								lvNatnCode = spraddrCResults.getStr(6);
								govcmrtMatchElement.setMatchAddressStatusInd(spraddrCResults.getStr(7));
							}
							spraddrC.close();
						}
						//   no longer display the Address Type description; replaced with just the ATYP_CODE below
						// IF lv_atyp_code IS NOT NULL THEN
						//   :GOVCMRT_MATCH.MATCH_ATYP_DESCRIPTION := GB_STVATYP.F_GET_DESCRIPTION(lv_atyp_code);
						// END IF;
						//  concatenate the Address Type with Street Line 1;
						//  place an asterisk at front of description if Address Type is Inactive status
						if ( !lvAtypCode.isNull() )
						{
							if ( !govcmrtMatchElement.getMatchAddressStatusInd().isNull() )
							{
								govcmrtMatchElement.setMatchStreetLine1(toStr("*").append(lvAtypCode).append("=").append(govcmrtMatchElement.getMatchStreetLine1()));
							}
							else {
								govcmrtMatchElement.setMatchStreetLine1(lvAtypCode.append("=").append(govcmrtMatchElement.getMatchStreetLine1()));
							}
						}
						//  73-5
						// 
						if ( !lvNatnCode.isNull() )
						{
							govcmrtMatchElement.setMatchNation(GbStvnatn.fGetDescription(lvNatnCode));
							if ( !govcmrtMatchElement.getMatchNation().isNull() )
							{
								govcmrtMatchElement.setMatchCountyNation(govcmrtMatchElement.getMatchNation());
							}
						}
						// 
						if ( !lvCntyCode.isNull() )
						{
							govcmrtMatchElement.setMatchCounty(GbStvcnty.fGetDescription(lvCntyCode));
							if ( !govcmrtMatchElement.getMatchCounty().isNull() )
							{
								govcmrtMatchElement.setMatchCountyNation(govcmrtMatchElement.getMatchCounty().append(", ").append(govcmrtMatchElement.getMatchCountyNation()));
							}
						}
						// 
						// 
						// 
						//  Get telephone information
						// 
						if ( !govcmrtMatchElement.getGovcmrtSprteleRowid().isNull() )
						{
							//Setting query parameters
							sprteleC.addParameter("GOVCMRT_MATCH_GOVCMRT_SPRTELE_ROWID", govcmrtMatchElement.getGovcmrtSprteleRowid());
							sprteleC.open();
							ResultSet sprteleCResults = sprteleC.fetchInto();
							if ( sprteleCResults != null ) {
								govcmrtMatchElement.setMatchPhone(sprteleCResults.getStr(0));
								lvTeleCode = sprteleCResults.getStr(1);
								lvTeleStat = sprteleCResults.getStr(2);
							}
							sprteleC.close();
						}
						// 
						if ( !lvTeleCode.isNull() )
						{
							//     :GOVCMRT_MATCH.MATCH_PHONE := GB_STVTELE.F_GET_DESCRIPTION(lv_tele_code)
							govcmrtMatchElement.setMatchPhone(lvTeleStat.append(lvTeleCode).append("=").append(govcmrtMatchElement.getMatchPhone()));
						}
						// 
						//  Get e-mail information
						// 
						if ( !govcmrtMatchElement.getGovcmrtGoremalRowid().isNull() )
						{
							//Setting query parameters
							goremalC.addParameter("GOVCMRT_MATCH_GOVCMRT_GOREMAL_ROWID", govcmrtMatchElement.getGovcmrtGoremalRowid());
							goremalC.open();
							ResultSet goremalCResults = goremalC.fetchInto();
							if ( goremalCResults != null ) {
								govcmrtMatchElement.setMatchEmail(goremalCResults.getStr(0));
								lvEmalCode = goremalCResults.getStr(1);
								lvEmalStat = goremalCResults.getStr(2);
							}
							goremalC.close();
						}
						// 
						if ( !lvEmalCode.isNull() )
						{
							//     :GOVCMRT_MATCH.MATCH_EMAIL := GB_GTVEMAL.F_GET_DESCRIPTION(lv_emal_code)
							govcmrtMatchElement.setMatchEmail(lvEmalStat.append(lvEmalCode).append("=").append(govcmrtMatchElement.getMatchEmail()));
						}
						// Additional ID
						//Setting query parameters
						goradidC.addParameter("GOVCMRT_MATCH_GOVCMRT_GORADID_ROWID", govcmrtMatchElement.getGovcmrtGoradidRowid());
						goradidC.open();
						ResultSet goradidCResults = goradidC.fetchInto();
						if ( goradidCResults != null ) {
							lvAddidCode = goradidCResults.getStr(0);
							govcmrtMatchElement.setMatchAdditionalId(goradidCResults.getStr(1));
						}
						if ( !lvAddidCode.isNull() )
						{
							govcmrtMatchElement.setMatchAdditionalId(lvAddidCode.append(" = ").append(govcmrtMatchElement.getMatchAdditionalId()));
						}
						goradidC.close();
					}
					finally{
						spridenCIdRowid.close();
						spridenCNameRowid.close();
						spridenC.close();
						spbpersC.close();
						spraddrC.close();
						sprteleC.close();
						goremalC.close();
						goradidC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVCMRT_MATCH.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void govcmrtMatch_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FORM_HEADER_MATCH_PIDM", this.getFormModel().getFormHeader().getMatchPidm()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="MATCH_ADID_CODE")
		public void matchAdidCode_WhenMouseDoubleclick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="MATCH_ADID_CODE", function=KeyFunction.ITEM_CHANGE)
		public void matchAdidCode_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('','','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="MATCH_ADID_CODE")
		public void matchAdidCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="MATCH_ADID_CODE")
		public void matchAdidCode_GSearchOptions()
		{
			
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="MATCH_ADID_CODE", function=KeyFunction.NEXT_ITEM)
		public void matchAdidCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="MATCH_ADID_CODE", function=KeyFunction.ITEM_OUT)
		public void matchAdidCode_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER MATCH_ADID_CODE.WHEN-VALIDATE-ITEM
		 IF	:GOTCMME.GOTCMME_ADID_CODE IS NULL THEN
		:GOTCMME.ADID_DESC := '';
  	RETURN;
END IF;
--
:GOTCMME.ADID_DESC := GB_GTVADID.f_get_description(p_code => :GOTCMME.GOTCMME_ADID_CODE);
IF  :GOTCMME.ADID_DESC is NULL THEN
		MESSAGE(G$_NLS.Get('GOAMTCH-0055','FORM','*ERROR* Invalid ID Type code; press LIST for valid code.'));
  	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MATCH_ADID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="MATCH_ADID_CODE")
		public void matchAdidCode_validate()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				
                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeAdidCode().isNull() )
				{
					gotcmmeElement.setAdidDesc(toStr(""));
					return ;
				}
				// 
				gotcmmeElement.setAdidDesc(GbGtvadid.fGetDescription(/*pCode=>*/gotcmmeElement.getGotcmmeAdidCode()));
				if ( gotcmmeElement.getAdidDesc().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0055"), toStr("FORM"), toStr("*ERROR* Invalid ID Type code; press LIST for valid code.")));
					throw new ApplicationException();
				}
			}

		
	
	
}

