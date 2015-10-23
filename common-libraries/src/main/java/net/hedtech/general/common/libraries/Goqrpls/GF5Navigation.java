package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
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

public class GF5Navigation extends AbstractSupportCodeObject {
	

	public GF5Navigation(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_F5_NAVIGATION
	/*
	PACKAGE G$_F5_NAVIGATION IS
  PROCEDURE WHEN_NEW_BLOCK_INSTANCE;
  PROCEDURE CHECK_TYPE;
  PROCEDURE CALL_ROUTINE;
  PROCEDURE INIT_NEXT_SELECTION;
  PROCEDURE GLO_INIT_ROUTINE;
--
  PROCEDURE KEY_ENTER;
  PROCEDURE KEY_EXIT;
  PROCEDURE KEY_NEXT_BLOCK;
  PROCEDURE KEY_NEXT_RECORD;
  PROCEDURE KEY_PREV_BLOCK;
  PROCEDURE KEY_PREV_RECORD;
  PROCEDURE WHEN_BUTTON_PRESSED;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_F5_NAVIGATION
		/*
		PACKAGE BODY G$_F5_NAVIGATION IS
--
  PROCEDURE WHEN_NEW_BLOCK_INSTANCE IS
  	lv_url  VARCHAR2(60) := G$_GET_UPRF_LINKS_MY_INST;
  BEGIN
    SET_ITEM_PROPERTY('G$_NAV_BLOCK.URL_MY_INSTITUTION',LABEL,lv_url);
    SET_ITEM_PROPERTY('G$_NAV_BLOCK.URL_MY_INSTITUTION',TOOLTIP_TEXT,lv_url);
  END WHEN_NEW_BLOCK_INSTANCE;
--
--
  PROCEDURE CHECK_TYPE IS
    lv_nav_value  VARCHAR2(30) := NAME_IN('G$_NAV_BLOCK.GO_ITEM');
  BEGIN
    IF lv_nav_value IS NOT NULL THEN
--
      IF lv_nav_value IN ('EXIT','QUIT') THEN
        G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
--
      ELSIF lv_nav_value = 'GUAGMNU' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0024','LIB','*ERROR* Menu is already running; cannot start up another copy.'));
        RAISE FORM_TRIGGER_FAILURE;
--
      ELSIF lv_nav_value = 'GUAINIT' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0025','LIB','*ERROR* GUAINIT has already been run for this Banner session.'));
        RAISE FORM_TRIGGER_FAILURE;
--
      ELSE
        COPY(lv_nav_value,'G$_NAV_BLOCK.CALL_FLD');
        COPY(lv_nav_value,'GLOBAL.SELECTFRM');
--
        IF SUBSTR(lv_nav_value,1,1) = 'V' THEN
          IF NVL(LENGTH(lv_nav_value), 0) = 8 THEN
            COPY(SUBSTR(lv_nav_value,2,2),'G$_NAV_BLOCK.FORM_LEADING_EDGE');
          ELSE
            COPY(SUBSTR(lv_nav_value,2,1),'G$_NAV_BLOCK.FORM_LEADING_EDGE');
          END IF;
        ELSE
          IF NVL(LENGTH(lv_nav_value), 0) = 8 THEN
            COPY(SUBSTR(lv_nav_value,1,2),'G$_NAV_BLOCK.FORM_LEADING_EDGE');
          ELSE
            COPY(SUBSTR(lv_nav_value,1,1),'G$_NAV_BLOCK.FORM_LEADING_EDGE');
          END IF;
        END IF;
--
        IF SUBSTR(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE'),1,1) <> '*' THEN
          IF (SUBSTR(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE'),1,1) NOT BETWEEN 'A' AND 'Z') THEN
            MESSAGE(G$_NLS.Get('GOQRPLS-0026','LIB','*ERROR* Objects must begin with a letter.'));
            RAISE FORM_TRIGGER_FAILURE;
          END IF;
        END IF;
--
        EXECUTE_TRIGGER('CALL_ROUTINE');
        G$_CHECK_FAILURE;
--
        EXECUTE_TRIGGER('INIT_NEXT_SELECTION');
        IF NOT FORM_SUCCESS THEN
          NULL;
        END IF;
--
      END IF;
    END IF;
  END CHECK_TYPE;
--
--
  PROCEDURE CALL_ROUTINE IS
    wrk_objt      VARCHAR2(30);
    al_button     NUMBER;
    lv_nav_value  VARCHAR2(30) := NAME_IN('G$_NAV_BLOCK.CALL_FLD');
--
  CURSOR find_objt_c (cp_obj VARCHAR2) IS
    SELECT GUBOBJS_OBJT_CODE
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = cp_obj;
--
  BEGIN
    << INIT_CALL >>
    COPY(lv_nav_value,'GLOBAL.NEW_FORM');
--
    OPEN find_objt_c (lv_nav_value);
    FETCH find_objt_c INTO WRK_OBJT;
    CLOSE find_objt_c;
--
-- If nothing is returned, check if the object is valid.  Could be the user is not authorized.
--
    IF NOT G$_CHK_AUTH.G$_CHECK_VALID_OBJ_FNC(lv_nav_value) THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0027','LIB','*ERROR* Invalid object name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    ELSE
      WRK_OBJT := 'FORM';
    END IF;
--
    IF wrk_objt NOT IN ('MENU','MESSAGE') THEN
      EXECUTE_TRIGGER('GLO_INIT_ROUTINE');
      G$_CHECK_FAILURE;
--
      IF NAME_IN('G$_NAV_BLOCK.FORM_TYPE_IND') = 'Q' AND wrk_objt = 'FORM' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0028','LIB','*ERROR* Invalid form name entered.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF;
--
    COPY(NAME_IN('SYSTEM.CURRENT_FORM'),'GLOBAL.CALLING_FORM');
--
-- This step will execute either a call form or a newform for the requested form if 
-- global.callfrm is null.  The null check allows this step to be bypassed in the event that
-- the product initialization form (?OQMENU) has requested that control be passed to another 
-- form.  If this is the case the trigger will cycle around one more time and pass control 
-- to the form that the initialization routine requested.
--
    IF NAME_IN('GLOBAL.CALLFRM') IS NULL THEN
--
-- Check whether or not the user is running a Payroll or a
-- Position control form.  If so, check to see if the 
-- initialization form has been run.  If not, skip logic
-- otherwise call routine to check for electronic approvals.
--
      IF SUBSTR(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE'),1,1) IN ('N','P') THEN
        IF NVL(NAME_IN(NAME_IN('G$_NAV_BLOCK.FORM_INIT_IND')),'N') = 'Y' THEN
          G$_GET_PIPE_MESSAGES;
          EXECUTE_TRIGGER('GET_EAWTE_MESSAGES');
        END IF;
      END IF;
--
-- Determine the type of object we are about to call.
--
      IF wrk_objt = 'JOBS' THEN
        COPY(NAME_IN('G$_NAV_BLOCK.GO_ITEM'),'GLOBAL.KEY_JOB_NAME');
        COPY('GJAPCTL','GLOBAL.NEW_FORM');
--
      ELSIF wrk_objt = 'QUICKFLOW' THEN
        G$_QUICKFLOW(NAME_IN('GLOBAL.NEW_FORM'));
        RETURN;
--
      ELSIF wrk_objt = 'MESSAGE' THEN
        SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
            G$_NLS.Get('GOQRPLS-0029','LIB','Please use desktop or web application to complete this activity. These applications may be accessible through your Banner toolbar.'));
        al_button := SHOW_ALERT('G$_INFO_ALERT');
        RETURN;
--
      ELSIF wrk_objt = 'MENU' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0030','LIB','*ERROR* Menu objects cannot be called from here.'));
        RETURN;
--
      ELSE
        NULL;
      END IF;
--
-- Form call logic.
--
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),NAME_IN('GLOBAL.NEW_FORM'),'');
--
      COPY('','GLOBAL.KEY_CALL_CODE');
      COPY('','GLOBAL.WIN_TITLE');
      COPY('','GLOBAL.WIN_X_POS');
      COPY('','GLOBAL.WIN_Y_POX');
--
    END IF;
--
-- This step checks to see if a form name has been placed in the
-- GLOBAL.CALLFRM field.  If not, the trigger exits.
-- If there is a value, then copy the form name to :KEY_BLOCK.callfld 
-- and wipe out the global value. THEN restart the logic in this 
-- trigger over which will pass control directly to the requested form.
--
    IF NAME_IN('GLOBAL.CALLFRM') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.CALLFORM'),'G$_NAV_BLOCK.CALL_FLD');
      COPY('','GLOBAL.CALLFRM');
      GOTO INIT_CALL;
    END IF;
  END CALL_ROUTINE;
--
--
  PROCEDURE INIT_NEXT_SELECTION IS
  BEGIN
    IF NAME_IN('GLOBAL.MENU_NAME_PARM') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.MENU_NAME_PARM'),'G$_NAV_BLOCK.CALL_FLD');
      COPY('','GLOBAL.MENU_NAME_PARM');
      EXECUTE_TRIGGER('CALL_ROUTINE');
    END IF;
--
    COPY('','G$_NAV_BLOCK.GO_ITEM');
  END INIT_NEXT_SELECTION;
--
--
  PROCEDURE GLO_INIT_ROUTINE IS
  BEGIN
    COPY('GLOBAL.INIT' || RTRIM(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE')),'G$_NAV_BLOCK.FORM_INIT_IND');
--
    IF NVL(LENGTH(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE')), 0) = 1 THEN
      COPY(SUBSTR(NAME_IN('G$_NAV_BLOCK.CALL_FLD'),3,1),'G$_NAV_BLOCK.FORM_TYPE_IND');
    ELSE
      COPY(SUBSTR(NAME_IN('G$_NAV_BLOCK.CALL_FLD'),4,1),'G$_NAV_BLOCK.FORM_TYPE_IND');
    END IF;
--
    DEFAULT_VALUE('N','GLOBAL.INIT' || RTRIM(NAME_IN('G$_NAV_BLOCK.FORM_LEADING_EDGE')));
  END GLO_INIT_ROUTINE;
--
--
  PROCEDURE KEY_ENTER IS
  BEGIN
    G$_RECONNECT;
    G$_CHECK_FAILURE;
--
    IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
      MESSAGE( G$_NLS.Get('GOQRPLS-0031','LIB','*ERROR* There are pending form changes; Commit or Rollback.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF INSTR(NAME_IN('G$_NAV_BLOCK.GO_ITEM'),'%') >= 1 THEN
      COPY('','G$_NAV_BLOCK.GO_ITEM');
      RETURN;
    END IF;
--
    EXECUTE_TRIGGER('CHECK_TYPE');
    G$_CHECK_FAILURE;
  END KEY_ENTER;
--
--
  PROCEDURE KEY_EXIT IS
  BEGIN
    IF NAME_IN('G$_NAV_BLOCK.HOLD_CURSOR_LOCATION') IS NOT NULL THEN
      G$_GOQOLIB_KEY_TRIGGER.KEY_MENU;
      G$_CHECK_FAILURE;
    END IF;
  END KEY_EXIT;
--
--
  PROCEDURE KEY_NEXT_BLOCK IS
  BEGIN
    IF NAME_IN('G$_NAV_BLOCK.HOLD_CURSOR_LOCATION') IS NOT NULL THEN
      G$_GOQOLIB_KEY_TRIGGER.KEY_MENU;
      G$_CHECK_FAILURE;
    END IF;
  END KEY_NEXT_BLOCK;
--
--
  PROCEDURE KEY_NEXT_RECORD IS
    last_menu_no    INTEGER(2) := NVL(NAME_IN('G$_NAV_BLOCK.LAST_MENU_ITEM'),0);
  	menu_item_name  VARCHAR2(30);
  	menu_item_value VARCHAR2(30);
  BEGIN
    IF last_menu_no < 1 THEN
    	last_menu_no := 10;
    ELSE
    	last_menu_no := last_menu_no - 1;
    END IF;
--
    IF last_menu_no = 0 THEN
      COPY('0','G$_NAV_BLOCK.LAST_MENU_ITEM');
      COPY('','G$_NAV_BLOCK.GO_ITEM');
      RETURN;
    END IF;
--  	
    FOR i IN REVERSE 1..last_menu_no LOOP
      menu_item_name := 'ACTION.LAST10_' || TO_CHAR(i);
      IF GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
        menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i));
--
        IF menu_item_value IS NOT NULL THEN
          COPY(i,'G$_NAV_BLOCK.LAST_MENU_ITEM');
          COPY(menu_item_value,'G$_NAV_BLOCK.GO_ITEM');
          EXIT;
        END IF;
--
      END IF;
    END LOOP;
  END KEY_NEXT_RECORD;
--
--
  PROCEDURE KEY_PREV_BLOCK IS
  BEGIN
    IF NAME_IN('G$_NAV_BLOCK.HOLD_CURSOR_LOCATION') IS NOT NULL THEN
      G$_GOQOLIB_KEY_TRIGGER.KEY_MENU;
      G$_CHECK_FAILURE;
    END IF;
  END KEY_PREV_BLOCK;
--
--
  PROCEDURE KEY_PREV_RECORD IS
    last_menu_no    INTEGER(2) := NVL(NAME_IN('G$_NAV_BLOCK.LAST_MENU_ITEM'),0);
	  menu_item_name  VARCHAR2(30);
	  menu_item_value VARCHAR2(30);
  BEGIN
    IF last_menu_no >= 10 THEN
  	  last_menu_no := 1;
    ELSE
  	  last_menu_no := last_menu_no + 1;
    END IF;
--
    FOR i IN last_menu_no..10 LOOP
      menu_item_name := 'ACTION.LAST10_' || TO_CHAR(i);
      IF GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
        menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i));
--
        IF menu_item_value IS NOT NULL THEN
          COPY(i,'G$_NAV_BLOCK.LAST_MENU_ITEM');
          COPY(menu_item_value,'G$_NAV_BLOCK.GO_ITEM');
          EXIT;
        END IF;
--
      ELSE
        COPY('0','G$_NAV_BLOCK.LAST_MENU_ITEM');
        COPY('','G$_NAV_BLOCK.GO_ITEM');
      END IF;
    END LOOP;
  END KEY_PREV_RECORD;
--
--
  PROCEDURE WHEN_BUTTON_PRESSED IS
  BEGIN
    IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
      MESSAGE( G$_NLS.Get('GOQRPLS-0032','LIB','*ERROR* There are pending form changes; Commit or Rollback.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUIOBJS','');
--
    IF NAME_IN('GLOBAL.MENU_NAME_PARM') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.MENU_NAME_PARM'),'G$_NAV_BLOCK.GO_ITEM');
      COPY('','GLOBAL.MENU_NAME_PARM');
      GO_ITEM('G$_NAV_BLOCK.GO_ITEM');
      DO_KEY('ENTER');
      G$_CHECK_FAILURE;
    END IF;
  END WHEN_BUTTON_PRESSED;
--
END;
		*/
		/* <p>
		* 
/* </p>
		*/
		public void whenNewBlockInstance()
		{
			NString lvUrl = getContainer().gGetUprfLinksMyInst();
			setItemLabel("G$_NAV_BLOCK.URL_MY_INSTITUTION", lvUrl.getValue());
			setItemToolTip("G$_NAV_BLOCK.URL_MY_INSTITUTION", lvUrl);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkType()
		{
			NString lvNavValue = getNameIn("G$_NAV_BLOCK.GO_ITEM");
			if ( !lvNavValue.isNull() )
			{
				// 
				if ( in(lvNavValue, "EXIT", "QUIT").getValue() )
				{
					getContainer().getGGoqolibKeyTrigger().b2kExitForm();
				}
				else if ( lvNavValue.equals("GUAGMNU") ) {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0024"), toStr("LIB"), toStr("*ERROR* Menu is already running; cannot start up another copy.")));
					throw new ApplicationException();
				}
				else if ( lvNavValue.equals("GUAINIT") ) {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0025"), toStr("LIB"), toStr("*ERROR* GUAINIT has already been run for this Banner session.")));
					throw new ApplicationException();
				}
				else {
					copy(lvNavValue,"G$_NAV_BLOCK.CALL_FLD");
					copy(lvNavValue,"GLOBAL.SELECTFRM");
					// 
					if ( substring(lvNavValue, toInt(1), toInt(1)).equals("V") )
					{
						if ( isNull(length(lvNavValue), 0).equals(8) )
						{
							copy(substring(lvNavValue, toInt(2), toInt(2)),"G$_NAV_BLOCK.FORM_LEADING_EDGE");
						}
						else {
							copy(substring(lvNavValue, toInt(2), toInt(1)),"G$_NAV_BLOCK.FORM_LEADING_EDGE");
						}
					}
					else {
						if ( isNull(length(lvNavValue), 0).equals(8) )
						{
							copy(substring(lvNavValue, toInt(1), toInt(2)),"G$_NAV_BLOCK.FORM_LEADING_EDGE");
						}
						else {
							copy(substring(lvNavValue, toInt(1), toInt(1)),"G$_NAV_BLOCK.FORM_LEADING_EDGE");
						}
					}
					// 
					if ( substring(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE"), toInt(1), toInt(1)).notEquals("*") )
					{
						if ((!between(substring(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE"), toInt(1), toInt(1)), "A", "Z")))
						{
							errorMessage(GNls.Fget(toStr("GOQRPLS-0026"), toStr("LIB"), toStr("*ERROR* Objects must begin with a letter.")));
							throw new ApplicationException();
						}
					}
					// 
					executeAction("CALL_ROUTINE");
					// 
					try{
						executeAction("INIT_NEXT_SELECTION");
					} catch(Exception e){}
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void callRoutine()
		{
			int rowCount = 0;
			NString wrkObjt= NString.getNull();
			NNumber alButton= NNumber.getNull();
			NString lvNavValue = getNameIn("G$_NAV_BLOCK.CALL_FLD");
			String sqlfindObjtC = "SELECT GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_CP_OBJ ";
			DataCursor findObjtC = new DataCursor(sqlfindObjtC);
			NString cpObj = NString.getNull();
			try {
				do{
					copy(lvNavValue,"GLOBAL.NEW_FORM");
					// 
					cpObj=lvNavValue;
					//Setting query parameters
					findObjtC.addParameter("P_CP_OBJ", cpObj);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findObjtC.
					findObjtC.open();
					ResultSet findObjtCResults = findObjtC.fetchInto();
					if ( findObjtCResults != null ) {
						wrkObjt = findObjtCResults.getStr(0);
					}
					findObjtC.close();
					// 
					//  If nothing is returned, check if the object is valid.  Could be the user is not authorized.
					// 
					if ( GChkAuth.gCheckValidObjFnc(lvNavValue).isFalse() )
					{
						errorMessage(GNls.Fget(toStr("GOQRPLS-0027"), toStr("LIB"), toStr("*ERROR* Invalid object name entered.")));
						throw new ApplicationException();
					}
					else {
						wrkObjt = toStr("FORM");
					}
					// 
					if ( !in(wrkObjt, "MENU", "MESSAGE").getValue() )
					{
						executeAction("GLO_INIT_ROUTINE");
						getContainer().gCheckFailure();
						// 
						if ( getNameIn("G$_NAV_BLOCK.FORM_TYPE_IND").equals("Q") && wrkObjt.equals("FORM") )
						{
							errorMessage(GNls.Fget(toStr("GOQRPLS-0028"), toStr("LIB"), toStr("*ERROR* Invalid form name entered.")));
							throw new ApplicationException();
						}
					}
					// 
					copy(getCurrentTaskName(),"GLOBAL.CALLING_FORM");
					// 
					//  This step will execute either a call form or a newform for the requested form if 
					//  global.callfrm is null.  The null check allows this step to be bypassed in the event that
					//  the product initialization form (?OQMENU) has requested that control be passed to another 
					//  form.  If this is the case the trigger will cycle around one more time and pass control 
					//  to the form that the initialization routine requested.
					// 
					if ( getNameIn("GLOBAL.CALLFRM").isNull() )
					{
						// 
						//  Check whether or not the user is running a Payroll or a
						//  Position control form.  If so, check to see if the 
						//  initialization form has been run.  If not, skip logic
						//  otherwise call routine to check for electronic approvals.
						// 
						if ( in(substring(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE"), toInt(1), toInt(1)), "N", "P").getValue() )
						{
							if ( isNull(getNameIn(getNameIn("G$_NAV_BLOCK.FORM_INIT_IND")), "N").equals("Y") )
							{
								getContainer().gGetPipeMessages();
								executeAction("GET_EAWTE_MESSAGES");
							}
						}
						// 
						//  Determine the type of object we are about to call.
						// 
						if ( wrkObjt.equals("JOBS") )
						{
							copy(getNameIn("G$_NAV_BLOCK.GO_ITEM"),"GLOBAL.KEY_JOB_NAME");
							copy("GJAPCTL","GLOBAL.NEW_FORM");
						}
						else if ( wrkObjt.equals("QUICKFLOW") ) {
							getContainer().gQuickflow(getNameIn("GLOBAL.NEW_FORM"));
							return ;
						}
						else if ( wrkObjt.equals("MESSAGE") ) {
							setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("GOQRPLS-0029"), toStr("LIB"), toStr("Please use desktop or web application to complete this activity. These applications may be accessible through your Banner toolbar.")));
							alButton = toNumber(showAlert("G$_INFO_ALERT"));
							return ;
						}
						else if ( wrkObjt.equals("MENU") ) {
							errorMessage(GNls.Fget(toStr("GOQRPLS-0030"), toStr("LIB"), toStr("*ERROR* Menu objects cannot be called from here.")));
							return ;
						}
						else {
						}
						// 
						//  Form call logic.
						// 
						executeAction("G$_REVOKE_ACCESS");
						getContainer().gCheckFailure();
						getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), getNameIn("GLOBAL.NEW_FORM"), toStr(""));
						// 
						copy("","GLOBAL.KEY_CALL_CODE");
						copy("","GLOBAL.WIN_TITLE");
						copy("","GLOBAL.WIN_X_POS");
						copy("","GLOBAL.WIN_Y_POX");
					}
					// 
					//  This step checks to see if a form name has been placed in the
					//  GLOBAL.CALLFRM field.  If not, the trigger exits.
					//  If there is a value, then copy the form name to :KEY_BLOCK.callfld 
					//  and wipe out the global value. THEN restart the logic in this 
					//  trigger over which will pass control directly to the requested form.
					// 
					if ( !getNameIn("GLOBAL.CALLFRM").isNull() )
					{
						copy(getNameIn("GLOBAL.CALLFORM"),"G$_NAV_BLOCK.CALL_FLD");
						copy("","GLOBAL.CALLFRM");
					}
					else
						break;
				}while(true);
				}finally{
					findObjtC.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void initNextSelection()
		{
			if ( !getNameIn("GLOBAL.MENU_NAME_PARM").isNull() )
			{
				copy(getNameIn("GLOBAL.MENU_NAME_PARM"),"G$_NAV_BLOCK.CALL_FLD");
				copy("","GLOBAL.MENU_NAME_PARM");
				executeAction("CALL_ROUTINE");
			}
			// 
			copy("","G$_NAV_BLOCK.GO_ITEM");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gloInitRoutine()
		{
			copy(toStr("GLOBAL.INIT").append(rtrim(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE"))),"G$_NAV_BLOCK.FORM_INIT_IND");
			// 
			if ( isNull(length(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE")), 0).equals(1) )
			{
				copy(substring(getNameIn("G$_NAV_BLOCK.CALL_FLD"), toInt(3), toInt(1)),"G$_NAV_BLOCK.FORM_TYPE_IND");
			}
			else {
				copy(substring(getNameIn("G$_NAV_BLOCK.CALL_FLD"), toInt(4), toInt(1)),"G$_NAV_BLOCK.FORM_TYPE_IND");
			}
			// 
			setDefaultValue("N", toStr("GLOBAL.INIT").append(rtrim(getNameIn("G$_NAV_BLOCK.FORM_LEADING_EDGE"))));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyEnter()
		{
			getContainer().gReconnect();
			getContainer().gCheckFailure();
			// 
			if ( getTaskStatus().equals("CHANGED") )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0031"), toStr("LIB"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
				throw new ApplicationException();
			}
			// 
			if ( inStr(getNameIn("G$_NAV_BLOCK.GO_ITEM"), toStr("%")).greaterOrEquals(1) )
			{
				copy("","G$_NAV_BLOCK.GO_ITEM");
				return ;
			}
			// 
			executeAction("CHECK_TYPE");
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyExit()
		{
			if ( !getNameIn("G$_NAV_BLOCK.HOLD_CURSOR_LOCATION").isNull() )
			{
				getContainer().getGGoqolibKeyTrigger().keyMenu();
				getContainer().gCheckFailure();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNextBlock()
		{
			if ( !getNameIn("G$_NAV_BLOCK.HOLD_CURSOR_LOCATION").isNull() )
			{
				getContainer().getGGoqolibKeyTrigger().keyMenu();
				getContainer().gCheckFailure();
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void keyNextRecord()
		{
			NInteger lastMenuNo = isNull(toInt(getNameIn("G$_NAV_BLOCK.LAST_MENU_ITEM")), 0);
			NString menuItemName= NString.getNull();
			NString menuItemValue= NString.getNull();
			if ( lastMenuNo.lesser(1) )
			{
				lastMenuNo = toInt(10);
			}
			else {
				lastMenuNo = lastMenuNo.subtract(1);
			}
			// 
			if ( lastMenuNo.equals(0) )
			{
				copy("0","G$_NAV_BLOCK.LAST_MENU_ITEM");
				copy("","G$_NAV_BLOCK.GO_ITEM");
				return ;
			}
			//   	
			for ( int i = lastMenuNo.toInt32(); i >= 1 ; i-- )
			{
				menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
				if ( getMenuItemVisible(menuItemName.getValue()) )
				{
					menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
					// 
					if ( !menuItemValue.isNull() )
					{
						copy(i,"G$_NAV_BLOCK.LAST_MENU_ITEM");
						copy(menuItemValue,"G$_NAV_BLOCK.GO_ITEM");
							break;
					}
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrevBlock()
		{
			if ( !getNameIn("G$_NAV_BLOCK.HOLD_CURSOR_LOCATION").isNull() )
			{
				getContainer().getGGoqolibKeyTrigger().keyMenu();
				getContainer().gCheckFailure();
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void keyPrevRecord()
		{
			NInteger lastMenuNo = isNull(toInt(getNameIn("G$_NAV_BLOCK.LAST_MENU_ITEM")), 0);
			NString menuItemName= NString.getNull();
			NString menuItemValue= NString.getNull();
			if ( lastMenuNo.greaterOrEquals(10) )
			{
				lastMenuNo = toInt(1);
			}
			else {
				lastMenuNo = lastMenuNo.add(1);
			}
			// 
			for ( int i = lastMenuNo.toInt32(); i <= 10; i++ )
			{
				menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
				if ( getMenuItemVisible(menuItemName.getValue()) )
				{
					menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
					// 
					if ( !menuItemValue.isNull() )
					{
						copy(i,"G$_NAV_BLOCK.LAST_MENU_ITEM");
						copy(menuItemValue,"G$_NAV_BLOCK.GO_ITEM");
							break;
					}
				}
				else {
					copy("0","G$_NAV_BLOCK.LAST_MENU_ITEM");
					copy("","G$_NAV_BLOCK.GO_ITEM");
				}
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void whenButtonPressed()
		{
			if ( getTaskStatus().equals("CHANGED") )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0032"), toStr("LIB"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
				throw new ApplicationException();
			}
			// 
			executeAction("G$_REVOKE_ACCESS");
			getContainer().gCheckFailure();
			getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUIOBJS"), toStr(""));
			// 
			if ( !getNameIn("GLOBAL.MENU_NAME_PARM").isNull() )
			{
				copy(getNameIn("GLOBAL.MENU_NAME_PARM"),"G$_NAV_BLOCK.GO_ITEM");
				copy("","GLOBAL.MENU_NAME_PARM");
				goItem(toStr("G$_NAV_BLOCK.GO_ITEM"));
				// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
				//				SupportClasses.SQLFORMS.DoKey("ENTER");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
				
				
				getContainer().gCheckFailure();
			}
		}
		
	
	
}
