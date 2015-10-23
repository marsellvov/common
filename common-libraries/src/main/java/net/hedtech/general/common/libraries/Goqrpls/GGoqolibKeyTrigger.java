package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GGoqolibKeyTrigger extends AbstractSupportCodeObject {
	

	public GGoqolibKeyTrigger(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GOQOLIB_KEY_TRIGGER
	/*
	PACKAGE G$_GOQOLIB_KEY_TRIGGER IS
  PROCEDURE KEY_PRINT;
  PROCEDURE KEY_SCRDOWN;
  PROCEDURE KEY_SCRUP;
  PROCEDURE KEY_NXTSET;
  PROCEDURE KEY_PRVREC;
  PROCEDURE KEY_NXTREC;
  PROCEDURE KEY_UP;
  PROCEDURE KEY_DOWN;
  PROCEDURE KEY_PRVBLK;
  PROCEDURE KEY_NXTBLK;
  PROCEDURE KEY_CLRFRM;
  PROCEDURE KEY_F2;
  PROCEDURE KEY_ENTQRY;
  PROCEDURE KEY_EXEQRY;
  PROCEDURE KEY_EXIT;
  PROCEDURE KEY_NXTKEY;
  PROCEDURE KEY_MENU;
--
  PROCEDURE B2K_EXIT_FORM;
  PROCEDURE ON_SELECT;
  PROCEDURE ON_ERROR;
  PROCEDURE ON_ROLLBACK;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GOQOLIB_KEY_TRIGGER
		/*
		PACKAGE BODY G$_GOQOLIB_KEY_TRIGGER IS
--
-- 1-31O4PW.
  lv_value VARCHAR2(100);
--
  PROCEDURE SET_FORM_VALIDATION_SCOPE(P_VALIDATION_SCOPE_IN IN VARCHAR2);
  PROCEDURE RESET_FORM_STATUS;
--
  PROCEDURE KEY_PRINT IS
    event_win    VARCHAR2(60) := NAME_IN('SYSTEM.EVENT_WINDOW');
    lv_time      VARCHAR2(30);
    win_title    VARCHAR2(200);
    win_id       WINDOW;
    v_va         VISUALATTRIBUTE := FIND_VA('G$_NVA_CANVAS');
    v_nva_color  VARCHAR2(30);
  BEGIN
--
-- Change background to white if not already that color.
--
    IF NOT ID_NULL(v_va) THEN
      v_nva_color  := GET_VA_PROPERTY(v_va,BACKGROUND_COLOR);
--
      IF UPPER(v_nva_color) <> 'R255G255B255' THEN
        SET_VA_PROPERTY(v_va,BACKGROUND_COLOR,'R255G255B255');
        SYNCHRONIZE;
      END IF;
    END IF;
--
-- Find the window the user is on.
--
    IF event_win = 'G$_OPT_WINDOW' OR 
       event_win IS NULL THEN
      WIN_ID := G$_FIND_WINDOW_ID;
    ELSE
      WIN_ID := FIND_WINDOW(event_win);
    END IF;
    win_title := GET_WINDOW_PROPERTY(win_id,TITLE);
--
-- Add time to window title, print, wait a moment and then reset title.
--
    lv_time := TO_CHAR(SYSDATE,''||G$_DATE.GET_NLS_DATE_FORMAT||' HH:MI AM');
    SET_WINDOW_PROPERTY(win_id,TITLE,win_title || '     ' || lv_time);
    PRINT;
    GOKDBMS.LOCK_SLEEP(5);
--
    SET_WINDOW_PROPERTY(win_id,TITLE,win_title);
--
-- Reset previous canvas color.
--
    IF NOT ID_NULL(v_va) THEN
      SET_VA_PROPERTY(v_va,BACKGROUND_COLOR,v_nva_color);
      SYNCHRONIZE;
    END IF;
  END;
--
-- Navigation routines
--
  PROCEDURE KEY_SCRDOWN IS
  BEGIN
    SCROLL_DOWN;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_SCRUP IS
  BEGIN
    SCROLL_UP;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_NXTSET IS
  BEGIN
    NEXT_SET;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_PRVREC IS
  BEGIN
    PREVIOUS_RECORD;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_NXTREC IS
  BEGIN
    NEXT_RECORD;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_UP IS
  BEGIN
    DO_KEY('PREVIOUS_RECORD');
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_DOWN IS
  BEGIN
    DO_KEY('NEXT_RECORD');
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_PRVBLK IS
    prevblk   VARCHAR2(80) := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'),PREVIOUS_NAVIGATION_BLOCK);
    blkstatus VARCHAR2(20) := NULL;
  BEGIN
    IF GET_BLOCK_PROPERTY(prevblk,DEFAULT_WHERE) = 'key-block' THEN
      prevblk := GET_BLOCK_PROPERTY(prevblk,PREVIOUS_NAVIGATION_BLOCK);
      IF SUBSTR(prevblk,1,2) = 'G$' THEN
        WHILE SUBSTR(prevblk,1,2) = 'G$' LOOP
          prevblk := GET_BLOCK_PROPERTY(prevblk,PREVIOUS_NAVIGATION_BLOCK);
        END LOOP;
      END IF;
    ELSIF SUBSTR(prevblk,1,2) = 'G$' THEN
      WHILE SUBSTR(prevblk,1,2) = 'G$' LOOP
        prevblk := GET_BLOCK_PROPERTY(prevblk,PREVIOUS_NAVIGATION_BLOCK);
      END LOOP;
    END IF;
--
    IF prevblk = NAME_IN('SYSTEM.TRIGGER_BLOCK') THEN
      G$_INVALID_FUNCTION_MSG;
    ELSE
      GO_BLOCK(prevblk);
      blkstatus := GET_BLOCK_PROPERTY(prevblk,STATUS);
      IF blkstatus = 'NEW' AND GET_BLOCK_PROPERTY(prevblk,BASE_TABLE) IS NOT NULL THEN
        EXECUTE_QUERY;
      END IF;
    END IF;
  END;
--
  PROCEDURE KEY_NXTBLK IS
    nxtblk    VARCHAR2(80) := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'),NEXT_NAVIGATION_BLOCK);
    blkstatus VARCHAR2(20) := NULL;
  BEGIN
    IF SUBSTR(nxtblk,1,2) = 'G$' THEN
      WHILE SUBSTR(nxtblk,1,2) = 'G$' LOOP
        nxtblk := GET_BLOCK_PROPERTY(nxtblk,NEXT_NAVIGATION_BLOCK);
      END LOOP;
    END IF;
--
    IF nxtblk = NAME_IN('SYSTEM.TRIGGER_BLOCK') THEN
      G$_INVALID_FUNCTION_MSG;
    ELSE
      GO_BLOCK(nxtblk);
      blkstatus := GET_BLOCK_PROPERTY(nxtblk,STATUS);
      IF blkstatus = 'NEW' AND GET_BLOCK_PROPERTY(nxtblk,BASE_TABLE) IS NOT NULL THEN
        EXECUTE_QUERY;
      END IF;
    END IF;
  END;
--
--
  PROCEDURE KEY_CLRFRM IS
-- 1-31O4PW.
  lv_hold_cursor_item  VARCHAR2(61) := NAME_IN(':SYSTEM.CURSOR_ITEM');
--  
  BEGIN
  	-- 80-3
    G$_SD.P_CLOSE_SDE_FORM(p_delayed=> FALSE);
    --
    EXECUTE_TRIGGER('SAVE_KEYS');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('ENABLE_KEYS');
    G$_CHECK_FAILURE;
--
-- 1-31O4PW.
    lv_value:= lv_hold_cursor_item;
--
    CLEAR_FORM;
    IF NAME_IN('SYSTEM.FORM_STATUS') <> 'CHANGED' THEN
      G$_LOAD_FORM_HEADER;
      G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('GLOBAL_COPY');
      G$_CHECK_FAILURE;
      IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURRENT_BLOCK'),BASE_TABLE) IS NOT NULL THEN
        EXECUTE_QUERY;
        G$_CHECK_FAILURE;
      END IF;
    END IF;
  END;
--
  PROCEDURE KEY_ENTQRY IS
  BEGIN
  	-- 80-3
  	G$_SD.p_enter_query;
  	--
    ENTER_QUERY;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_EXEQRY IS
  BEGIN
    IF GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION) = 'FALSE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
    END IF;
--
    EXECUTE_QUERY;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE ON_SELECT IS
    lv_current_blk  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_BLOCK');
    lv_first_item   VARCHAR2(61) := '';
    lv_last_item    VARCHAR2(61) := '';
    lv_next_item    VARCHAR2(61) := '';
  BEGIN
    DEFAULT_VALUE('N','GLOBAL.DISABLE_EXTQRY');
--
-- If the extend query function has been disabled, check for it in the block
--
    IF NAME_IN('GLOBAL.DISABLE_EXTQRY') = 'Y' THEN
	    lv_first_item := lv_current_blk || '.' || GET_BLOCK_PROPERTY(lv_current_blk,FIRST_ITEM);
      lv_last_item  := lv_current_blk || '.' || GET_BLOCK_PROPERTY(lv_current_blk,LAST_ITEM);
      lv_next_item  := lv_first_item;
--
   	  LOOP
--
-- If queryable, check for colon
--
        IF GET_ITEM_PROPERTY(lv_next_item,ITEM_TYPE) IN ('TEXT ITEM') THEN
          IF GET_ITEM_PROPERTY(lv_next_item,QUERYABLE) = 'TRUE' THEN
          	IF SUBSTR(NAME_IN(lv_next_item),1,1) = ':' OR
          	   SUBSTR(NAME_IN(lv_next_item),1,1) = '&' THEN
             	MESSAGE(G$_NLS.Get('GOQRPLS-0043','LIB','*WARNING* Extended Query functionality has been disabled.'));
              RAISE FORM_TRIGGER_FAILURE;
       	    END IF;
          END IF;
        END IF;
--
-- If the last item has been checked, exit loop
--
        IF lv_next_item = lv_last_item THEN
     	    EXIT;
        END IF;
--
-- Get next item
--
        lv_next_item := lv_current_blk || '.' || GET_ITEM_PROPERTY(lv_next_item,NEXTITEM);
	    END LOOP;
    END IF;
--
    SELECT_RECORDS;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE KEY_F2 IS
  BEGIN
    BREAK;
  END;
--
--
  PROCEDURE B2K_EXIT_FORM IS
    ALERT_BUT           NUMBER;
    alert_button        NUMBER;
    CUR_ITEM            VARCHAR2(61) := NAME_IN('SYSTEM.CURSOR_ITEM');
    LV_VALIDATION_SCOPE VARCHAR2(20) := GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT);  
  BEGIN
	--XE	
    IF NAME_In('GLOBAL.BANNER_XE_MODE') = 'Y' AND
    	 NAME_IN('GLOBAL.EXIT_BANNER')    != 'Y' THEN
      G$_XE_STATE_MANAGER.DELETE_BXE_FROM_CALL_STACK(NAME_IN('SYSTEM.CURRENT_FORM'));
    END IF;
  -- END XE  	    	
    IF NAME_IN('GLOBAL.WF_SUBMIT_EXIT_IND') <> 'Y' THEN
      IF GET_MENU_ITEM_PROPERTY('ICONS.WF_SUBMIT',ENABLED) = 'TRUE' THEN
        IF (NAME_IN('SYSTEM.CURRENT_FORM')) <> 'GUAGMNU' THEN
          SET_ALERT_PROPERTY('G$_PIPE_MESSAGE_ALERT',TITLE,'B a n n e r ');
          SET_ALERT_PROPERTY('G$_PIPE_MESSAGE_ALERT',ALERT_MESSAGE_TEXT,
              G$_NLS.Get('GOQRPLS-0044','LIB','You have not completed or released this task in Workflow.   Are you sure you would like to continue Exiting ?'));
          alert_button := SHOW_ALERT('G$_PIPE_MESSAGE_ALERT');
          IF alert_button = ALERT_BUTTON1 THEN
            NULL;
          ELSE
            RETURN;
          END IF;
        END IF;
      END IF;
    END IF;
-- -- -- --
    COPY('N','GLOBAL.WF_SUBMIT_EXIT_IND');
-- -- -- ---- 
-- If in the key-block, just exit.
--
    IF NAME_IN('SYSTEM.TRIGGER_BLOCK') = 'KEY_BLOCK' THEN
      G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
      EXIT_FORM(NO_VALIDATE);
      RETURN;
    END IF;
--
-- If in enter-query mode
--
    IF NAME_IN('SYSTEM.MODE') = 'ENTER-QUERY' THEN
      EXIT_FORM;
      RETURN;
    END IF;
--
-- reset the form validation
--
-- Set the validation_unit to form scope.
-- LV_VALIDATION_SCOPE is holding the original value so as to restore.
--
    IF LV_VALIDATION_SCOPE <> 'FORM_SCOPE' THEN 
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, FORM_SCOPE); 
    END IF;   	
--
    IF GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION) = 'FALSE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
    END IF;
--
-- This is to force block level validation
--
    VALIDATE(BLOCK_SCOPE);
--
-- If validation fails, ask to close form
--
    IF NOT FORM_SUCCESS THEN
      COPY('0','SYSTEM.MESSAGE_LEVEL');
--
      alert_button := SHOW_ALERT('G$_CLOSE_FORM_ALERT');
      IF alert_button = ALERT_BUTTON1 THEN
        G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
        CLEAR_MESSAGE;
        RESET_FORM_STATUS;
        EXIT_FORM(NO_VALIDATE,FULL_ROLLBACK);
      ELSE
-- --   Restore validation to the forms original value
       	SET_FORM_VALIDATION_SCOPE(LV_VALIDATION_SCOPE);
        RETURN;
      END IF;
    END IF;
--
    PREVIOUS_ITEM;
    COPY('0','SYSTEM.MESSAGE_LEVEL');
--
-- If no changes, just exit
--
    IF NAME_IN('SYSTEM.FORM_STATUS') = 'QUERY' THEN
      RESET_FORM_STATUS;
      G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
      EXIT_FORM(NO_VALIDATE);
--
-- Ask to save or not
--
    ELSE
      alert_button := SHOW_ALERT('G$_EXIT_FORM_ALERT'); 
--
-- Exit saving changes
--
      IF alert_button = ALERT_BUTTON1 THEN 
        COMMIT_FORM;
--
-- Commit failed, ask to close form
--
        IF NOT FORM_SUCCESS OR NAME_IN('SYSTEM.FORM_STATUS') <> 'QUERY' THEN
          alert_button := SHOW_ALERT('G$_CLOSE_FORM_ALERT');
          IF alert_button = ALERT_BUTTON1 THEN
            G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
            CLEAR_MESSAGE;
            RESET_FORM_STATUS;
            EXIT_FORM(NO_VALIDATE,FULL_ROLLBACK);
          ELSE
-- -- Restore validation to the forms original value
            SET_FORM_VALIDATION_SCOPE(LV_VALIDATION_SCOPE);
            GO_ITEM(CUR_ITEM);
            RETURN;
          END IF;
--
-- Commit worked, exit
--
        ELSE
          G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
          EXIT_FORM;
        END IF;
--
-- Exit without saving changes.
--
      ELSIF alert_button = ALERT_BUTTON2 THEN 
        G$_VPDI.DO_VPDI_GLOBAL_ON_EXIT;
        RESET_FORM_STATUS;
        EXIT_FORM(NO_VALIDATE,FULL_ROLLBACK);
--
-- Don't exit.
--
      ELSE
-- --   Restore validation to the forms original value
      	SET_FORM_VALIDATION_SCOPE(LV_VALIDATION_SCOPE);
        COPY('Y','GLOBAL.CANCEL_BTN_PRESSED');
        GO_ITEM(CUR_ITEM);
      END IF;
    END IF;
  END;
--
  PROCEDURE KEY_EXIT IS
  BEGIN
    EXECUTE_TRIGGER('KEY_EXIT_TRG');
    G$_CHECK_FAILURE;
--
    COPY('','GLOBAL.VALUE');
    B2K_EXIT_FORM;
    G$_CHECK_FAILURE;
  END;
--
--
  PROCEDURE KEY_NXTKEY IS
    curr_item  VARCHAR2(61):= NAME_IN('SYSTEM.CURSOR_ITEM'); 
    sub_len    NUMBER(10) := INSTR(curr_item,'_');
    item_name  VARCHAR2(60) := SUBSTR(curr_item,1,sub_len)||'CODE';
  BEGIN
    IF GET_MENU_ITEM_PROPERTY('Action.Select',ENABLED) = 'TRUE' THEN
      IF NOT ID_NULL(FIND_ITEM(item_name)) THEN
        COPY(NAME_IN(SUBSTR(curr_item,1,sub_len)||'CODE'),'GLOBAL.VALUE');
      END IF;
--
      EXECUTE_TRIGGER('KEY_NXTKEY_TRG');
      G$_CHECK_FAILURE;
      B2K_EXIT_FORM;
    END IF; 
  END;
--
--
  PROCEDURE KEY_MENU IS
    lv_view_id           VIEWPORT     := FIND_VIEW('G$_NAV_CANVAS');
    lv_go_item_id        ITEM         := FIND_ITEM('G$_NAV_BLOCK.GO_ITEM');
    lv_leave_item_id     ITEM         := FIND_ITEM('G$_NAV_BLOCK.LEAVING_BLK_IND');
    lv_url_id            ITEM         := FIND_ITEM('G$_NAV_BLOCK.URL_MY_INSTITUTION');
    lv_hold_cursor_item  VARCHAR2(61) := NAME_IN(':SYSTEM.CURSOR_ITEM');
  BEGIN
    IF NOT ID_NULL(lv_view_id) THEN
--
-- Validate the status of the block before showing canvas.
--
      VALIDATE(ITEM_SCOPE);
      G$_CHECK_FAILURE;
--
-- Check for pending changes in the block and don't invoke if there are any.
--
      IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0045','LIB','*ERROR* There are pending form changes; Commit or Rollback.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
--
-- Nav bar is NOT displayed.
--
      IF GET_VIEW_PROPERTY(lv_view_id,VISIBLE) = 'FALSE' THEN
      	COPY(lv_hold_cursor_item,'G$_NAV_BLOCK.HOLD_CURSOR_LOCATION');
        SET_VIEW_PROPERTY(lv_view_id,VISIBLE,PROPERTY_TRUE);
--
        IF NOT ID_NULL(lv_go_item_id) THEN
          IF GET_ITEM_PROPERTY(lv_go_item_id,ENABLED) = 'FALSE' THEN
            SET_ITEM_PROPERTY(lv_go_item_id,ENABLED,PROPERTY_TRUE);
            SET_ITEM_PROPERTY(lv_go_item_id,NAVIGABLE,PROPERTY_TRUE);
          END IF;
          GO_ITEM(lv_go_item_id);
        END IF;
        IF NOT ID_NULL(lv_url_id) THEN
          SET_ITEM_PROPERTY(lv_url_id,ENABLED,PROPERTY_TRUE);
          SET_ITEM_PROPERTY(lv_url_id,NAVIGABLE,PROPERTY_TRUE);
        END IF;
--
-- Nav bar is displayed.
--
        ELSE
-- 1-31O4PW.
        default_value(lv_value,'G$_NAV_BLOCK.HOLD_CURSOR_LOCATION');
--
        COPY('','G$_NAV_BLOCK.GO_ITEM');
        IF NOT ID_NULL(lv_leave_item_id) THEN
          COPY('Y','G$_NAV_BLOCK.LEAVING_BLK_IND');
        END IF;
--
        GO_ITEM(NAME_IN('G$_NAV_BLOCK.HOLD_CURSOR_LOCATION'));
        SET_VIEW_PROPERTY(lv_view_id,VISIBLE,PROPERTY_FALSE);
--
        IF NOT ID_NULL(lv_go_item_id) THEN
          SET_ITEM_PROPERTY(lv_go_item_id,NAVIGABLE,PROPERTY_FALSE);
          SET_ITEM_PROPERTY(lv_go_item_id,ENABLED,PROPERTY_FALSE);
        END IF;
--
        IF NOT ID_NULL(lv_url_id) THEN
          SET_ITEM_PROPERTY(lv_url_id,NAVIGABLE,PROPERTY_FALSE);
          SET_ITEM_PROPERTY(lv_url_id,ENABLED,PROPERTY_FALSE);
        END IF;
      END IF;
    END IF;
  END;
--
-- ON Triggers
--
  PROCEDURE ON_ERROR IS
    lv_dbms_code   NUMBER        := 0;
    lv_err_code    NUMBER        := ERROR_CODE;
    lv_err_type    VARCHAR2(3)   := ERROR_TYPE;
    lv_err_text    VARCHAR2(200) := ERROR_TEXT;
    lv_full_msg    VARCHAR2(200) := '';
    lv_dummy       VARCHAR2(1)   := 'Y';
--
    lv_ora_msg     VARCHAR2(10);
    FUNCTION is_it_a_number (num_in VARCHAR2) 
     RETURN BOOLEAN IS
      lv_num       INTEGER;
    BEGIN
      lv_num := to_number(num_in);
      RETURN (TRUE);
    EXCEPTION
    WHEN OTHERS THEN 
      RETURN (FALSE);
    END;
--    
  BEGIN
--
-- Check if the standard errors for having lost the database connection occurred.
--
    IF INSTR(lv_err_text,'1012') > 0 OR
    	 INSTR(lv_err_text,'2396') > 0 OR
    	 INSTR(lv_err_text,'3114') > 0 THEN
      G$_RECONNECT;
      G$_CHECK_FAILURE;
    ELSE
--
-- Check if the error occurred because the connection was lost by hitting the database and 
-- trap any exceptions.
--
      BEGIN
        SELECT 'X'
          INTO lv_dummy
          FROM DUAL;
      EXCEPTION
        WHEN OTHERS THEN
          lv_dummy := 'Z';
      END;
--
-- If not connected, attempt to do so.
--
      IF NVL(lv_dummy,'X') = 'Z' THEN
        G$_RECONNECT;
        G$_CHECK_FAILURE;
--
      ELSE
        lv_dbms_code := DBMS_ERROR_CODE;
--
-- Display the error message which is being raised.  Check if it is equal to the
-- check policy error from FGAC.
--
        G$_ERRORS.POPULATE_VARIABLES;
        IF DBMS_ERROR_CODE = G$_ERRORS.CHECK_POLICY_VIOLATION THEN
          lv_full_msg := G$_ERRORS.CHECK_POLICY_MESSAGE;
--
        ELSIF lv_err_code = 40112 THEN
        	MESSAGE(G$_NLS.GET('GOQRPLS-0046','LIB',
            'Navigation was attempted to an item that is disabled or not valid; go to another item to continue.  It may be necessary to use the mouse.'));
--
        ELSE
-- There are a number of related error messages that can occur and therefore if the erorr is: 
--	"FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception" and ends with "ORA-nnnnn." 
-- then we will append the Oracle error message to the end. This means that instead of seeing:
--     FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception ORA-01843.
-- We would see:
--     FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception ORA-01843: not a valid month.
          lv_ora_msg := SUBSTR(lv_err_text,LENGTH(lv_err_text)-9,10);
          IF SUBSTR(lv_ora_msg,1,3) = 'ORA' THEN
            IF is_it_a_number(SUBSTR(lv_ora_msg,4,6)) THEN
              lv_full_msg := 
                SUBSTR(lv_err_type || '-' || TO_CHAR(lv_err_code) || ': ' || 
                       SUBSTR(lv_err_text,1,LENGTH(lv_err_text)-10) ||
                       SQLERRM ( substr(lv_ora_msg,4,6) ),
                  1,200);
            ELSE
              lv_full_msg := lv_err_type || '-' || TO_CHAR(lv_err_code) || ': ' || lv_err_text;
            END IF;
          ELSE
              lv_full_msg := lv_err_type || '-' || TO_CHAR(lv_err_code) || ': ' || lv_err_text;            	
          END IF;
        END IF;
--
        MESSAGE(lv_full_msg);
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
--
    END IF;
  END;
--
--
  PROCEDURE ON_ROLLBACK IS
    lv_role  VARCHAR2(30) := '';
  BEGIN 
--
-- Attempt to determine current role to know whether or not to call the discard.
-- If the user has pressed the exit key, then when the user reaches this point,
-- they have completed the G$_REVOKE_ACCESS routine which revoked all privileges.
--
    BEGIN
      SELECT ROLE
        INTO lv_role
        FROM SESSION_ROLES;
    EXCEPTION
      WHEN OTHERS THEN NULL;
    END;
--
-- Call the discard method and then issue a rollback.
--
    IF NVL(lv_role,'NONE') <> 'NONE' THEN
      GB_COMMON.P_ROLLBACK('NO ROLLBACK');
    END IF;
    ISSUE_ROLLBACK('');
--
    EXECUTE_TRIGGER('ON_ROLLBACK_TRG');
    G$_CHECK_FAILURE;
  END; 
--
--- Internal procedures.
--
-- This procedure is called in the B2K_EXIT_FORM procedure to restore the forms validation_unit
-- to the original value.  Original value is passed as P_VALIDATION_SCOPE_IN
--
  PROCEDURE SET_FORM_VALIDATION_SCOPE(P_VALIDATION_SCOPE_IN IN VARCHAR2) IS
  BEGIN
    IF P_VALIDATION_SCOPE_IN = 'ITEM_SCOPE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, ITEM_SCOPE); 
    ELSIF P_VALIDATION_SCOPE_IN = 'RECORD_SCOPE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, RECORD_SCOPE); 
    ELSIF P_VALIDATION_SCOPE_IN = 'BLOCK_SCOPE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, BLOCK_SCOPE); 
    ELSIF P_VALIDATION_SCOPE_IN = 'FORM_SCOPE' THEN
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, FORM_SCOPE); 
    ELSE
      SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION_UNIT, DEFAULT_SCOPE); 
    END IF;
  END;
--
--
  PROCEDURE RESET_FORM_STATUS IS
    CUR_FORM  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  BEGIN
    SET_FORM_PROPERTY(CUR_FORM,DEFER_REQUIRED_ENFORCEMENT,PROPERTY_TRUE);
    SET_FORM_PROPERTY(CUR_FORM,VALIDATION_UNIT,FORM_SCOPE);
    SET_FORM_PROPERTY(CUR_FORM,VALIDATION,PROPERTY_FALSE);
  END;
END;
		*/
				// 
		//  1-31O4PW.
		private NString lvValue= NString.getNull();
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrint()
		{
			NString eventWin = getCurrentWindow();
			NString lvTime= NString.getNull();
			NString winTitle= NString.getNull();
			WindowDescriptor winId= null;
			UnknownTypes.Visualattribute vVa = null;//(UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_CANVAS");
			NString vNvaColor= NString.getNull();
			// 
			//  Change background to white if not already that color.
			// 
			if ( !(vVa == null) )
			{
				// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin41".
				//				vNvaColor = SupportClasses.FORMS40.GetVaProperty(vVa, backgroundColor);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin41'.");
				
				
				// 
				if ( upper(vNvaColor).notEquals("R255G255B255") )
				{
					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
					//					SupportClasses.FORMS40.SetVaProperty(vVa, backgroundColor, "R255G255B255");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
					
					
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
				}
			}
			// 
			//  Find the window the user is on.
			// 
			if ( eventWin.equals("G$_OPT_WINDOW") || eventWin.isNull() )
			{
				winId = getContainer().gFindWindowId();
			}
			else {
				winId = findWindow(eventWin);
			}
			winTitle = toStr(getWindowTitle(winId));
			// 
			//  Add time to window title, print, wait a moment and then reset title.
			// 
			lvTime = toChar(NDate.getNow(), toStr("").append(GDate.getNlsDateFormat()).append(" HH:MI AM"));
			setWindowTitle(winId, winTitle.append("     ").append(lvTime));
			// F2J_NOT_SUPPORTED : Call to built-in "PRINT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludePrint".
			//			SupportClasses.SQLFORMS.Print();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'PRINT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludePrint'.");
			
			
			Gokdbms.lockSleep(toNumber(5));
			// 
			setWindowTitle(winId, winTitle);
			// 
			//  Reset previous canvas color.
			// 
			if ( !(vVa == null) )
			{
				// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
				//				SupportClasses.FORMS40.SetVaProperty(vVa, backgroundColor, vNvaColor);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
				
				
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
			}
		}
/* <p>
		* 
		*  Navigation routines
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyScrdown()
		{
			// F2J_NOT_SUPPORTED : Call to built-in "SCROLL_DOWN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin42".
			//			SupportClasses.SQLFORMS.ScrollDown();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SCROLL_DOWN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin42'.");
			
			
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyScrup()
		{
			// F2J_NOT_SUPPORTED : Call to built-in "SCROLL_UP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin43".
			//			SupportClasses.SQLFORMS.ScrollUp();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SCROLL_UP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin43'.");
			
			
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtset()
		{
			// F2J_NOT_SUPPORTED : Call to built-in "NEXT_SET" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin44".
			//			SupportClasses.SQLFORMS.NextSet();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'NEXT_SET' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin44'.");
			
			
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrvrec()
		{
			//previousRecord();
			//Morphis TODO GENERAL resolução bug ELLBHR-12157.Bruno Aleluia
			if ( isInFirstRecord() )
			{
			
				infoMessage(GNls.Fget(toStr("GOQRPLS-0191"), toStr("FORM"), toStr("At first record.")));
			}
			else {
				previousRecord();
			}
			//End
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtrec()
		{	
			boolean lastRecord = isInLastRecord(true);
			//nextRecord();
			//Morphis TODO GENERAL alguns casos de uso pedem mensagem at last record.Bruno Aleluia
			NNumber record = getCurrentRecord();
			nextRecord();
			if(record.equals(getCurrentRecord()))
			{
				if(getRecordStatus().equals(Status.NEW))
					errorMessage(GNls.Fget(toStr("GOQRPLS-0192"), toStr("FORM"), toStr("Record must entered or deleted first!")));
				else
					if(lastRecord)
						infoMessage(GNls.Fget(toStr("GOQRPLS-0193"), toStr("FORM"), toStr("At last record!")));
			}
			//End
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyUp()
		{
			//executeAction("PREVIOUS_RECORD");
			previousRecord();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyDown()
		{
			//executeAction("NEXT_RECORD");
			nextRecord();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrvblk()
		{
			NString prevblk = getBlockPreviousBlock(getTriggerBlock());
			NString blkstatus = NString.getNull();
			if ( getBlockWhereClause(prevblk).equals("key-block") )
			{
				prevblk = getBlockPreviousBlock(prevblk);
				if ( substring(prevblk, toInt(1), toInt(2)).equals("G$") )
				{
					while ( substring(prevblk, toInt(1), toInt(2)).equals("G$") ) {
						prevblk = getBlockPreviousBlock(prevblk);
					}
				}
			}
			else if ( substring(prevblk, toInt(1), toInt(2)).equals("G$") ) {
				while ( substring(prevblk, toInt(1), toInt(2)).equals("G$") ) {
					prevblk = getBlockPreviousBlock(prevblk);
				}
			}
			// 
			if ( prevblk.equals(getTriggerBlock()) || prevblk.isNull())
			{
				getContainer().gInvalidFunctionMsg();
			}
			else {
				try {
					if (validateCurrentBlock()){
						goBlock(prevblk);
						getCurrentTask().getNavigationModel().doNavigation();
					}
					else
						throw new ValidationException();
				} catch (Exception e) {
					throw new ValidationException(e.getMessage());
				}
				
				blkstatus = getBlockStatus(prevblk);
				if ( blkstatus.equals("NEW") && !getBlockQueryDataSourceName(prevblk).isNull() )
				{
					executeQuery();
				}
			}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtblk()
		{
			NString nxtblk = getBlockNextBlock(getTriggerBlock());
			NString blkstatus = NString.getNull();
			if ( substring(nxtblk, toInt(1), toInt(2)).equals("G$") )
			{
				while ( substring(nxtblk, toInt(1), toInt(2)).equals("G$") ) {
					nxtblk = getBlockNextBlock(nxtblk);
				}
			}
			// 
			if ( nxtblk.equals(getTriggerBlock()) || nxtblk.isNull() )
			{
				getContainer().gInvalidFunctionMsg();
			}
			else {
				try {
					if (validateCurrentBlock()){
						goBlock(nxtblk);
						getCurrentTask().getNavigationModel().doNavigation();
					}
					else
						throw new ValidationException();
				} catch (Exception e) {
					throw new ValidationException(/*e.getMessage()*/);
				}
				blkstatus = getBlockStatus(nxtblk);
				if ( blkstatus.equals("NEW") && !getBlockQueryDataSourceName(nxtblk).isNull() )
				{
					executeQuery();
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyClrfrm()
		{
			//  1-31O4PW.
			NString lvHoldCursorItem = getNameIn(":SYSTEM.CURSOR_ITEM");
			//  80-3
			// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
			getContainer().getGSd().pCloseSdeForm(/*pDelayed=>*/NBool.False);
			// 
			executeAction("SAVE_KEYS");
			getContainer().gCheckFailure();
			executeAction("ENABLE_KEYS");
			getContainer().gCheckFailure();
			// 
			//  1-31O4PW.
			lvValue = lvHoldCursorItem;
			// 
			try{
				clearTask();	
			} finally{
				if ( !getTaskStatus().equals("CHANGED") )
				{
					getContainer().gLoadFormHeader();
					getContainer().gCheckFailure();
					executeAction("GLOBAL_COPY");
					getContainer().gCheckFailure();
					if ( !getBlockQueryDataSourceName(getCurrentBlock()).isNull() )
					{
						executeQuery();
						getContainer().gCheckFailure();
					}
				}
				else{
					//JM added else statement in order to disable keyblock in case of pressing Cancel button in save confirmation alert
					executeAction("DISABLE_KEYS");
					getContainer().gCheckFailure();
				}
			}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyEntqry()
		{
			//  80-3
			getContainer().getGSd().pEnterQuery();
			// 
			enterQuery();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyExeqry()
		{
			//MORPHIS: TODO Validation mode logic
//			if ( SupportClasses.FORMS40.GetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION).equals("FALSE") )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, true);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//				
//			}
			if (!TaskServices.getCurrentTask().getValidationEnabled()){
				TaskServices.getCurrentTask().setValidationEnabled(true);
			}
			// 
			executeQuery();
		}
/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void onSelect()
		{
			NString lvCurrentBlk = getCurrentBlock();
			NString lvFirstItem = toStr("");
			NString lvLastItem = toStr("");
			NString lvNextItem = toStr("");
			setDefaultValue("N", "GLOBAL.DISABLE_EXTQRY");
			// 
			//  If the extend query function has been disabled, check for it in the block
			// 
			if ( getNameIn("GLOBAL.DISABLE_EXTQRY").equals("Y") )
			{
				lvFirstItem = lvCurrentBlk.append(".").append(getBlockFirstItem(lvCurrentBlk));
				lvLastItem = lvCurrentBlk.append(".").append(getBlockLastItem(lvCurrentBlk));
				lvNextItem = lvFirstItem;
				// 
				while (true) {
					// 
					//  If queryable, check for colon
					// 
					// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
					if ( in(getItemType(lvNextItem), "TEXT ITEM").getValue() )
					{
						if ( getItemQueryAllowed(lvNextItem).equals("TRUE") )
						{
							if ( substring(getNameIn(lvNextItem), toInt(1), toInt(1)).equals(":") || substring(getNameIn(lvNextItem), toInt(1), toInt(1)).equals("&") )
							{
								warningMessage(GNls.Fget(toStr("GOQRPLS-0043"), toStr("LIB"), toStr("*WARNING* Extended Query functionality has been disabled.")));
								throw new ApplicationException();
							}
						}
					}
					// 
					//  If the last item has been checked, exit loop
					// 
					if ( lvNextItem.equals(lvLastItem) )
					{
							break;
					}
					// 
					//  Get next item
					// 
					lvNextItem = lvCurrentBlk.append(".").append(getItemNextItem(lvNextItem));
				}
			}
			// 
			// F2J_NOT_SUPPORTED : Call to built-in "SELECT_RECORDS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin45".
			//			SupportClasses.FORMS40.SelectRecords();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SELECT_RECORDS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin45'.");
			
			
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyF2()
		{
			// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin46".
			//			SupportClasses.SQLFORMS.Break();
			this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin46'.");
			
			
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void b2kExitForm()
		{
			NNumber alertBut= NNumber.getNull();
			NNumber alertButton= NNumber.getNull();
			NString curItem = getCursorItem();
			//MORPHIS: TODO Validation mode manipulation
//			NString lvValidationScope = SupportClasses.FORMS40.GetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT);
			// XE	
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") && getNameIn("GLOBAL.EXIT_BANNER").notEquals("Y") )
			{
				getContainer().getGXeStateManager().deleteBxeFromCallStack(getCurrentTaskName());
			}
			//  END XE  	    	
			if ( getNameIn("GLOBAL.WF_SUBMIT_EXIT_IND").notEquals("Y") )
			{
				//MORPHIS: Menu logic
				//MORPHIS: added false condition to force skipping this block 
				//if ( getMenuItemEnabled("ICONS.WF_SUBMIT") )
				if ( getWorkspaceMode() )
				{
					if ( (getCurrentTaskName()).notEquals("GUAGMNU") )
					{
						setAlertTitle("G$_PIPE_MESSAGE_ALERT", "B a n n e r ");
						setAlertMessageText("G$_PIPE_MESSAGE_ALERT", GNls.Fget(toStr("GOQRPLS-0044"), toStr("LIB"), toStr("You have not completed or released this task in Workflow.   Are you sure you would like to continue Exiting ?")));
						alertButton = toNumber(showAlert("G$_PIPE_MESSAGE_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							//MORPHIS - start here also the wf pooling
							getContainer().getGoqwflw().getGWfDriver().setWorkspaceReuse();
						}
						else {
							return ;
						}
					}
				}
			}
			//  -- -- --
			copy("N","GLOBAL.WF_SUBMIT_EXIT_IND");
			//  -- -- ---- 
			//  If in the key-block, just exit.
			// 
			//((net.hedtech.general.common.forms.controller.DefaultFormController)Task.getCurrent().getFormController()).getKeyBlockName()
			if ( getTriggerBlock().equals("KEY_BLOCK") )
			{
				getContainer().getGVpdi().doVpdiGlobalOnExit();
				exitTask(TaskServices.NO_VALIDATE);
				return ;
			}
			// 
			//  If in enter-query mode
			// 
			if ( getMode().equals("ENTER-QUERY") )
			{
				exitTask();
				return ;
			}
			// 
			//  reset the form validation
			// 
			//MORPHIS: TODO Validation mode manipulation 
//			//  Set the validation_unit to form scope.
//			//  LV_VALIDATION_SCOPE is holding the original value so as to restore.
//			// 
//			if ( lvValidationScope.notEquals("FORM_SCOPE") )
//			{
//				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.FORM_SCOPE);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//				
//			}
//			// 
			
			if (!TaskServices.getCurrentTask().getValidationEnabled())
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//					SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, true);
				TaskServices.getCurrentTask().setValidationEnabled(true);
				// System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
			}
			// 
			//  This is to force block level validation
			boolean valid = true;
			try{
				valid = validateCurrentBlock();
			} catch (Exception e){
				valid = false;
			}
			if(!valid){
				// 
				//  If validation fails, ask to close form
				// 
				MessageServices.resetMessageLevel();
			
				alertButton = toNumber(showAlert("G$_CLOSE_FORM_ALERT"));
				if ( alertButton.equals(MessageServices.BUTTON1) )
				{
					getContainer().getGVpdi().doVpdiGlobalOnExit();
					clearMessage();
					resetFormStatus();
					exitTask(TaskServices.NO_VALIDATE, TaskServices.FULL_ROLLBACK);
				}
				else {
					//MORPHIS: TODO Validation mode manipulation
//					//  --   Restore validation to the forms original value
//					setFormValidationScope(lvValidationScope);
					return ;
				}
			}
			try {
				//MORPHIS TODO AP VALIDATION SCOPE is not implemented and FORM SCOPE doesn't validate items, records. P.S. If VALIDATION SCOPE IS IMPLEMENTED REMOVE THIS.
				TaskServices.getCurrentTask().setValidationEnabled(false);
				
				previousItem();
			} finally {

				//MORPHIS TODO AP VALIDATION SCOPE is not implemented and FORM SCOPE doesn't validate items, records. P.S. If VALIDATION SCOPE IS IMPLEMENTED REMOVE THIS.
				TaskServices.getCurrentTask().setValidationEnabled(true);
				MessageServices.resetMessageLevel();
			}
			
			
			// 
			//  If no changes, just exit
			// 
			if ( getTaskStatus().equals("QUERY") )
			{
				resetFormStatus();
				getContainer().getGVpdi().doVpdiGlobalOnExit();
				exitTask(TaskServices.NO_VALIDATE);
			}
			else {
				alertButton = toNumber(showAlert("G$_EXIT_FORM_ALERT"));
				// 
				//  Exit saving changes
				// 
				if ( alertButton.equals(MessageServices.BUTTON1) )
				{
					boolean failed = false;
					try{
						commitTask();
						// 
						//  Commit failed, ask to close form
						// 
					} catch(Exception e) {
						failed = true;
					}
					if ( failed || !getTaskStatus().equals("QUERY") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						alertButton = toNumber(showAlert("G$_CLOSE_FORM_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							getContainer().getGVpdi().doVpdiGlobalOnExit();
							clearMessage();
							resetFormStatus();
							exitTask(TaskServices.NO_VALIDATE, TaskServices.FULL_ROLLBACK);
						}
						else {
							//MORPHIS: TODO Validation mode manipulation
//							//  -- Restore validation to the forms original value
//							setFormValidationScope(lvValidationScope);
							goItem(curItem);
							return ;
						}
					}
					else {
						getContainer().getGVpdi().doVpdiGlobalOnExit();
						exitTask();
					}
				}
				else if ( alertButton.equals(MessageServices.BUTTON2) ) {
					getContainer().getGVpdi().doVpdiGlobalOnExit();
					resetFormStatus();
					exitTask(TaskServices.NO_VALIDATE, TaskServices.FULL_ROLLBACK);
				}
				else {
					//MORPHIS: TODO Validation mode manipulation
//					//  --   Restore validation to the forms original value
//					setFormValidationScope(lvValidationScope);
					copy("Y","GLOBAL.CANCEL_BTN_PRESSED");
					goItem(curItem);
				}
			}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyExit()
		{
			executeAction("KEY_EXIT_TRG");
			
			// 
			copy("","GLOBAL.VALUE");
			b2kExitForm();
			
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtkey()
		{
			NString currItem = getCursorItem();
			NNumber subLen = toNumber(inStr(currItem, toStr("_")));
			NString itemName = substring(currItem, toInt(1), toInt(subLen)).append("CODE");
			//if ( getMenuItemEnabled("Action.Select"))
			if (nameIn("GLOBAL.SELECT").startsWith("E"))
			{
				if ( !(findItem(itemName) == null) )
				{
					copy(getNameIn(substring(currItem, toInt(1), toInt(subLen)).append("CODE")),"GLOBAL.VALUE");
				}
				// 
				executeAction("KEY_NXTKEY_TRG");
				getContainer().gCheckFailure();
				b2kExitForm();
			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyMenu()
		{
			CanvasDescriptor lvViewId = findView("G$_NAV_CANVAS");
			ItemDescriptor lvGoItemId = findItem(toStr("G$_NAV_BLOCK.GO_ITEM"));
			ItemDescriptor lvLeaveItemId = findItem(toStr("G$_NAV_BLOCK.LEAVING_BLK_IND"));
			ItemDescriptor lvUrlId = findItem(toStr("G$_NAV_BLOCK.URL_MY_INSTITUTION"));
			NString lvHoldCursorItem = getNameIn(":SYSTEM.CURSOR_ITEM");
			if ( !(lvViewId == null) )
			{
				// 
				//  Validate the status of the block before showing canvas.
				// 
				validateItem(getCurrentItem());
				getContainer().gCheckFailure();
				// 
				//  Check for pending changes in the block and don't invoke if there are any.
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0045"), toStr("LIB"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				//  Nav bar is NOT displayed.
				// 
				if ( getViewVisible(lvViewId).equals("FALSE") )
				{
					copy(lvHoldCursorItem,"G$_NAV_BLOCK.HOLD_CURSOR_LOCATION");
					setViewVisible(lvViewId, true);
					// 
					if ( !(lvGoItemId == null) )
					{
						if ( getItemEnabled(lvGoItemId).equals("FALSE") )
						{
							setItemEnabled(lvGoItemId, true);
							setItemNavigable(lvGoItemId, true);
						}
						goItem(lvGoItemId);
					}
					if ( !(lvUrlId == null) )
					{
						setItemEnabled(lvUrlId, true);
						setItemNavigable(lvUrlId, true);
					}
				}
				else {
					//  1-31O4PW.
					setDefaultValue(lvValue, "G$_NAV_BLOCK.HOLD_CURSOR_LOCATION");
					// 
					copy("","G$_NAV_BLOCK.GO_ITEM");
					if ( !(lvLeaveItemId == null) )
					{
						copy("Y","G$_NAV_BLOCK.LEAVING_BLK_IND");
					}
					// 
					goItem(getNameIn("G$_NAV_BLOCK.HOLD_CURSOR_LOCATION"));
					setViewVisible(lvViewId, false);
					// 
					if ( !(lvGoItemId == null) )
					{
						setItemNavigable(lvGoItemId, false);
						setItemEnabled(lvGoItemId, false);
					}
					// 
					if ( !(lvUrlId == null) )
					{
						setItemNavigable(lvUrlId, false);
						setItemEnabled(lvUrlId, false);
					}
				}
			}
		}
/* <p>
		* 
		*  ON Triggers
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void onError()
		{
			int rowCount = 0;
			NNumber lvDbmsCode = toNumber(0);
			NNumber lvErrCode = errorCode();
			//NString lvErrType = SupportClasses.SQLFORMS.ErrorType();
			NString lvErrText = errorMessage();
			NString lvFullMsg = toStr("");
			NString lvDummy = toStr("Y");
			// 
			NString lvOraMsg= NString.getNull();
			// 
			//  Check if the standard errors for having lost the database connection occurred.
			// 
			if ( inStr(lvErrText, toStr("1012")).greater(0) || inStr(lvErrText, toStr("2396")).greater(0) || inStr(lvErrText, toStr("3114")).greater(0) )
			{
				getContainer().gReconnect();
				getContainer().gCheckFailure();
			}
			else {
				try
				{
					String sql1 = "SELECT 'X' " +
	" FROM DUAL ";
					DataCommand command1 = new DataCommand(sql1);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						lvDummy = results1.getStr(0);
					}
					results1.close();
				}
				catch(Exception  e)
				{
					lvDummy = toStr("Z");
				}
				// 
				//  If not connected, attempt to do so.
				// 
				if ( isNull(lvDummy, "X").equals("Z") )
				{
					getContainer().gReconnect();
					getContainer().gCheckFailure();
				}
				else {
					lvDbmsCode = toNumber(errorCode());
					// 
					//  Display the error message which is being raised.  Check if it is equal to the
					//  check policy error from FGAC.
					// 
					getContainer().getGErrors().populateVariables();
					if ( errorCode().equals(getContainer().getGErrors().checkPolicyViolation) )
					{
						lvFullMsg = getContainer().getGErrors().checkPolicyMessage;
					}
					else if ( lvErrCode.equals(40112) ) {
						warningMessage(GNls.Fget(toStr("GOQRPLS-0046"), toStr("LIB"), toStr("Navigation was attempted to an item that is disabled or not valid; go to another item to continue.  It may be necessary to use the mouse.")));
					}
					else {
						//  There are a number of related error messages that can occur and therefore if the erorr is: 
						// 	"FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception" and ends with "ORA-nnnnn." 
						//  then we will append the Oracle error message to the end. This means that instead of seeing:
						//      FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception ORA-01843.
						//  We would see:
						//      FRM-40735: WHEN-NEW_FORM-INSTANCE trigger raised unhandled exception ORA-01843: not a valid month.
						lvOraMsg = substring(lvErrText, length(lvErrText).subtract(9), toInt(10));
						if ( substring(lvOraMsg, toInt(1), toInt(3)).equals("ORA") )
						{
							if ( OnError_isItANumber_Local(substring(lvOraMsg, toInt(4), toInt(6))).getValue() )
							{
								//MORPHIS TODO removed the ErrorType from the Error Message
//								lvFullMsg = substring(lvErrType.append("-").append(toChar(lvErrCode)).append(": ").append(substring(lvErrText, toInt(1), length(lvErrText).subtract(10))).append(errorMessage()(substring(lvOraMsg, toInt(4), toInt(6)))), toInt(1), toInt(200));
								lvFullMsg = substring(toChar(lvErrCode).append(": ").append(substring(lvErrText, toInt(1), length(lvErrText).subtract(10))).append(errorMessage().append(substring(lvOraMsg, toInt(4), toInt(6)))), toInt(1), toInt(200));
							}
							else {
								//MORPHIS TODO removed the ErrorType from the Error Message
//								lvFullMsg = lvErrType.append("-").append(toChar(lvErrCode)).append(": ").append(lvErrText);
								lvFullMsg = toChar(lvErrCode).append(": ").append(lvErrText);
							}
						}
						else {
							//MORPHIS TODO removed the ErrorType from the Error Message
							lvFullMsg = toChar(lvErrCode).append(": ").append(lvErrText);
						}
					}
					// 
					errorMessage(lvFullMsg);
					throw new ApplicationException();
				}
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param numIn
		*/
		public NBool OnError_isItANumber_Local(NString numIn)
		{
			NInteger lvNum= NInteger.getNull();
			try
			{
				lvNum = toInt(numIn);
				return  toBool(((NBool.True)));
			}
			catch(Exception  e)
			{
				return  toBool(((NBool.False)));
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void onRollback()
		{
			int rowCount = 0;
			NString lvRole = toStr("");
			try
			{
				String sql2 = "SELECT ROLE " +
	" FROM SESSION_ROLES ";
				DataCommand command2 = new DataCommand(sql2);
				ResultSet results2 = command2.executeQuery();
				rowCount = command2.getRowCount();
				if ( results2.hasData() ) {
					lvRole = results2.getStr(0);
				}
				results2.close();
			}
			catch(Exception  e)
			{
			}
			// 
			//  Call the discard method and then issue a rollback.
			// 
			if ( isNull(lvRole, "NONE").notEquals("NONE") )
			{
				GbCommon.pRollback(toStr("NO ROLLBACK"));
			}
			issueRollback("");
			// 
			executeAction("ON_ROLLBACK_TRG");
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* - Internal procedures.
		* 
		*  This procedure is called in the B2K_EXIT_FORM procedure to restore the forms validation_unit
		*  to the original value.  Original value is passed as P_VALIDATION_SCOPE_IN
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pValidationScopeIn
		*/
		public void setFormValidationScope(NString pValidationScopeIn)
		{
			if ( pValidationScopeIn.equals("ITEM_SCOPE") )
			{
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.ITEM_SCOPE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
				
			}
			else if ( pValidationScopeIn.equals("RECORD_SCOPE") ) {
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.RECORD_SCOPE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
				
			}
			else if ( pValidationScopeIn.equals("BLOCK_SCOPE") ) {
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.BLOCK_SCOPE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
				
			}
			else if ( pValidationScopeIn.equals("FORM_SCOPE") ) {
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.FORM_SCOPE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
				
			}
			else {
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.DEFAULT_SCOPE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
				
				
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void resetFormStatus()
		{
			NString curForm = getCurrentTaskName();
			// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(curForm, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT, true);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
			
			
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(curForm, SupportClasses.Property.VALIDATION_UNIT, SupportClasses.Constants.FORM_SCOPE);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
			
			
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(curForm, SupportClasses.Property.VALIDATION, false);
			
//			setFormValidationEnabled(false);
			InteractionManager.getInteractionState().removeAttribute(Task.FORM_SUCESS);
		}
		
		//MORPHIS: To avoid dependency to GW package
		//TODO: allow this visibility
		public boolean getWorkspaceMode() 
		{
			Object val = Globals.getGlobal("WF_MODE");
			return val != null && val.equals("Y");
		}
	
}
