package net.hedtech.banner.general.common.Guagmnu.services;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.services.Exceptions.TimedOut;



public class GuagmnuServices extends AbstractSupportCodeObject{
	
	
	public GuagmnuServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuagmnuTask  getTask() {
		return (GuagmnuTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guagmnu.model.GuagmnuModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit SET_CANVAS_COLORS
	
	PROCEDURE SET_CANVAS_COLORS IS
BEGIN
  SET_VA_PROPERTY('G$_NVA_MENU_MSG_CANVAS',  BACKGROUND_COLOR,:GLOBAL.UI_MESSAGE_COLOR);
  SET_VA_PROPERTY('G$_NVA_MENU_TREE_CANVAS', BACKGROUND_COLOR,:GLOBAL.UI_TREE_COLOR);
  SET_VA_PROPERTY('G$_NVA_MENU_LINKS_CANVAS',BACKGROUND_COLOR,:GLOBAL.UI_LINKS_COLOR);
END;

	*/
	//ID:705
	/* <p>
/* </p>
		*/
		public void setCanvasColors()
		{
			// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//			SupportClasses.FORMS40.SetVaProperty("G$_NVA_MENU_MSG_CANVAS", backgroundColor, getGlobal("UI_MESSAGE_COLOR"));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
			
			
			// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//			SupportClasses.FORMS40.SetVaProperty("G$_NVA_MENU_TREE_CANVAS", backgroundColor, getGlobal("UI_TREE_COLOR"));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
			
			
			// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//			SupportClasses.FORMS40.SetVaProperty("G$_NVA_MENU_LINKS_CANVAS", backgroundColor, getGlobal("UI_LINKS_COLOR"));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit SET_PREFERENCES
	
	PROCEDURE SET_PREFERENCES IS
  pl_id                  PARAMLIST; 
  pl_name                VARCHAR2(20) := 'PREFERENCES';  
--
  V_DISP_HINT_CB         VARCHAR2(1) := 'N';
  V_FORMNAME_CB          VARCHAR2(1);
  V_RELEASE_CB           VARCHAR2(1);
  V_DBASE_INST_CB        VARCHAR2(1);
  V_DATE_TIME_CB         VARCHAR2(1);
  V_REQ_ITEM_CB          VARCHAR2(1);
--
  G_FORMNAME_DISPLAY_IND VARCHAR2(1);
--
  CURSOR REC_EXST IS
    SELECT GURTPRF_FORMNAME_CB,
           GURTPRF_RELEASE_CB,GURTPRF_DBASE_INST_CB,
           GURTPRF_DATE_TIME_CB,GURTPRF_REQ_ITEM_CB,
           NVL(DECODE(GURTPRF_FORMNAME_DISPLAY_IND,'B','M', 'F','N', GURTPRF_FORMNAME_DISPLAY_IND),'N')
      FROM GURTPRF 
     WHERE GURTPRF_USER_ID = :GLOBAL.current_user1;   
--
BEGIN
  OPEN REC_EXST;
  FETCH REC_EXST INTO V_FORMNAME_CB,V_RELEASE_CB,V_DBASE_INST_CB,
                      V_DATE_TIME_CB,V_REQ_ITEM_CB,G_FORMNAME_DISPLAY_IND;
  CLOSE REC_EXST;
--
  pl_id := GET_PARAMETER_LIST(pl_name); 
  IF ID_NULL(pl_id) THEN 
    pl_id := CREATE_PARAMETER_LIST(pl_name); 
    ADD_PARAMETER(pl_id,'G$_PREFERENCES',TEXT_PARAMETER,'6'); 
  END IF;
--
  SET_PARAMETER_ATTR(pl_id,'G$_PREFERENCES',TEXT_PARAMETER,
                        V_DISP_HINT_CB  || V_FORMNAME_CB  || V_RELEASE_CB ||
                        V_DBASE_INST_CB || V_DATE_TIME_CB || V_REQ_ITEM_CB);
--
  :GLOBAL.FORMNAME_DISPLAY_IND := G_FORMNAME_DISPLAY_IND;
END;
	*/
	//ID:706
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setPreferences()
		{
			int rowCount = 0;
			Hashtable plId= null;
			NString plName = toStr("PREFERENCES");
			// 
			NString vDispHintCb = toStr("N");
			NString vFormnameCb= NString.getNull();
			NString vReleaseCb= NString.getNull();
			NString vDbaseInstCb= NString.getNull();
			NString vDateTimeCb= NString.getNull();
			NString vReqItemCb= NString.getNull();
			// 
			NString gFormnameDisplayInd= NString.getNull();
			String sqlrecExst = "SELECT GURTPRF_FORMNAME_CB, GURTPRF_RELEASE_CB, GURTPRF_DBASE_INST_CB, GURTPRF_DATE_TIME_CB, GURTPRF_REQ_ITEM_CB, NVL(DECODE(GURTPRF_FORMNAME_DISPLAY_IND, 'B', 'M', 'F', 'N', GURTPRF_FORMNAME_DISPLAY_IND), 'N') " +
	" FROM GURTPRF " +
	" WHERE GURTPRF_USER_ID = :GLOBAL_CURRENT_USER1 ";
			DataCursor recExst = new DataCursor(sqlrecExst);
			try {
				//Setting query parameters
				recExst.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable recExst.
				recExst.open();
				ResultSet recExstResults = recExst.fetchInto();
				if ( recExstResults != null ) {
					vFormnameCb = recExstResults.getStr(0);
					vReleaseCb = recExstResults.getStr(1);
					vDbaseInstCb = recExstResults.getStr(2);
					vDateTimeCb = recExstResults.getStr(3);
					vReqItemCb = recExstResults.getStr(4);
					gFormnameDisplayInd = recExstResults.getStr(5);
				}
				recExst.close();
				// 
				plId = getParameterList(plName);
				if ( (plId == null) )
				{
					plId = createParameterList(plName);
					addParameter(plId, "G$_PREFERENCES", "6");
				}
				// 
				setParameter(plId, "G$_PREFERENCES",  vDispHintCb.append(vFormnameCb).append(vReleaseCb).append(vDbaseInstCb).append(vDateTimeCb).append(vReqItemCb));
				// 
				setGlobal("FORMNAME_DISPLAY_IND", gFormnameDisplayInd);
				}finally{
					recExst.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit G$_GET_BANNER_MESSAGES
	
	PROCEDURE G$_GET_BANNER_MESSAGES IS 
<multilinecomment> This procedure checks for BANNER wide messages through the use of  
   a dbms pipe named as SCT||:global.session_id. It alerts the user 
   about important system messages.

  TIMED_OUT      EXCEPTION;
  PRAGMA         EXCEPTION_INIT(TIMED_OUT,-6556);
  STATUS         NUMBER;
  ALRT_STATUS    NUMBER;
  MAX_WAIT       INTEGER := 0;
  RETURN_PIPE    VARCHAR2(30);
  RETURN_MESSAGE VARCHAR2(200);
  MSG_ACTION     VARCHAR2(30);
  ALERT_MSG      VARCHAR2(80);
--
BEGIN
    RETURN_PIPE := 'SCT'||:GLOBAL.SESSION_ID;
    LOOP 
      STATUS := GOKDBMS.PIPE_RECEIVE_MESSAGE(RETURN_PIPE,MAX_WAIT);
      GOKDBMS.PIPE_UNPACK_MESSAGE(RETURN_MESSAGE);
      IF STATUS = 0 THEN 
         FOR i IN 1..3 LOOP
            BELL; SYNCHRONIZE;
         END LOOP;
         ALERT_MSG := RETURN_MESSAGE;
         SET_ALERT_PROPERTY('G$_BANNER_ALERT',ALERT_MESSAGE_TEXT,ALERT_MSG);
         ALRT_STATUS := SHOW_ALERT ('G$_BANNER_ALERT');
      END IF;
      GOKDBMS.PIPE_UNPACK_MESSAGE(MSG_ACTION);
      IF STATUS = 0 THEN 
         IF MSG_ACTION = 'EXIT' THEN
          G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
         END IF;
      END IF;
    END LOOP;
-- 
EXCEPTION
 WHEN TIMED_OUT THEN NULL;
 WHEN OTHERS THEN null;
--   MESSAGE ('*WARNING* Problem receiving piped messages.');
END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:707
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gGetBannerMessages()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_1_0
	
	 PROCEDURE AUDIT_TRAIL_1_0 IS
<multilinecomment>
AUDIT TRAIL: 1.2                                            INIT      DATE
1. New MENU application.                                     JW     07/15/88
AUDIT TRAIL: 1.3
1. Corrected direct link logic to work if the ?OQMENU form   JW     11/10/88
   set the GLOBAL.CALLFRM value.                                    88-6420
AUDIT TRAIL: 1.5
1. Added new triggers and globals for form level security
checking.                                                    CD     09/29/89
2. Fixed problem number 89-6364.  Increased field length
for menu choices to 15 characters.                           BR     09/26/89
3. Fixed problem number 89-6345.  Changed KEY-EXIT function
to return to higher level menu (function now duplicates KEY-
PRVBLK function)                                             BR     09/26/89
AUDIT TRAIL: 1.6
1. Fixed unreported problem.                                 AP     03/22/90
Can call GUQSECR from NEXT_SELECTION which causes system to start looping
and cannot break out.  Modified INIT_CHAR3 trigger to perform case statement
on CALLFLD and if GUQSECR then exetrg INVALID_KEYS_MSG otherwise blank out
CHAR3 field.
AUDIT TRAIL: 1.7
1. Fixed problem report 90-8505 AND 90-8509.                     AP 05/14/90
   Modified CHECK_TYPE trigger to validate that a valid entry is
   made in the 1st position of NEXT_SELECTION field.  Valid entries are
   A thru Z and *.
AUDIT TRAIL: 1.8
1.  Removed ability to call GUQ* forms.                         AP  10/09/90
    Modified CALL_ROUTINE form level trigger (dropped step 3).
AUDIT TRAIL: 1.9
1. Added Message display field to show messages waiting and
to access GUAMESG through COUNT QUERY HITS.                    ND   04/17/91
AUDIT TRAIL: 1.10
1. changed #copy's which caused truncation probs with forms    JW   08/16/91
   3.x to substr function.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:708
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail10()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_0
	
	PROCEDURE AUDIT_TRAIL_2_0 IS
<multilinecomment>
AUDIT TRAIL: 2.0                                            INIT      DATE
1.Modified for Pop-Up window                                 BG     05-06-93
AUDIT TRAIL: 2.1.1                                          INIT      DATE
1. Non-MS window setting                                     BG     04/25/95
AUDIT TRAIL: 2.1.5
1. Add new role security logic.                              SQ     07/12/95
2. Conversion to forms 4.5.                                  SQ     03/19/96
AUDIT TRAIL: 2.1.11
1. Modifications to support 2 char product                   SQ     09/04/96
identifier and 7 or 8 character form names.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:709
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail20()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0                                            INIT      DATE
1.  Conversion, changes and enhancements for Banner2000.      SQ     12/15/96
2.  New images.                                               SQ     06/27/97
3.  Add support for a new type of object (MESSAGE) and        SQ     06/30/97
    have it display a canned message.
4.  Interchange the names of items Key_Block.Process2_Image   GS     07/03/97
    and Key_Block.Process3_Image.
5.  Add code to INIT_NEXT_SELECTION to handle GUIOBJS Select  GS     07/03/97
    of a MENU Object.
6.  Modify logic to not allow this form to start up the menu  SQ     07/08/97
    form.  No nesting of menus.
7.  Modify to add another canvas and additional buttons so    SQ     07/22/97
    that if the site is not a higher ed site that a different
    view is presented.
8.  Modify POST-FORM to shut down graphics batch portion if   SQ     07/28/97
    graphs were started at least once.
9.  Remove all references to Action.Close Window since it was SQ     08/13/97
    remove and is obsolete.
10. Modify main menu logic to support a single or a double    SQ     08/15/97
    click and act in the same manner.
11. New form for supporting user-defined menues.              SQ     12/27/96
12. Chenges with Description field on GURMENU block.          JC     06/17/97
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:710
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0                                               INIT      DATE
1. Created new representation of menu structures. Menu tree on  JC
   the left and list of existing items on the right side of 
   the screen .Package POPULATE_EXPLORER.
2. For changing menu or executing the form with or without      JC
   NEXT_SELECTION item was added routine CHANGE_SELECTION.
3. To keep information about current menu tree in LIST_LEVEL    JC
   item was created package LOAD_LIST_ITEM.
4. For sorting menu items on the right side of the screen by    JC
   pressing the associated button on the top was created 
   routine SORT_ITEMS. 
5. To get last positions of middle bar (that expand menu tree   JC
   or view of items) or size description and name on the view
   from Registry was created routine READ_REG.
6. Created logic to find BANICON.dll file and to load it for    ET
   Banner icon library .Packages PATHFINDER, DLL_HANDLE.
7.  SJQ 05/10/99
    Clean up.  Modify cursor logic to stream line code.  Remove temporary
    workflow logic.
8.  SJQ 06/02/99
    Added call to G$_RESIZE_MAIN_WINDOW to the WHEN-NEW-FORM-INSTANCE
    trigger.  This is to resize the main window to address a bug in webforms.
9.  EPM 06/03/99
    Moved the line ":KEY_BLOCK.NEXT_SELECTION := '';" from the first
    line of the trigger INIT_NEXT_SELECTION to the last line of that
    trigger.  This corrects defect 12295.
10. EPM 06/03/99
    Code added to check type trigger that checks to make sure the user does not
    try and run GUAINIT.
11. MVS 06/03/1999
    Modified WHEN-NEW-FORM-INSTANCE and WHEN-TIMER-EXPIRED triggers to create
    and execute logic upon the expiration of a timer that polls for valid tasks
    and activities from SCT Workflow.  If Workflow is not installed or enabled
    at a client site, these triggers will not perform any Workflow function.
12. MH 06/07/1999
    Modified sort_items, sort_items_menu, sort_items_obj_type, populate_explorer.make_menu
    procedures
13. NR 07/07/1999
    Eliminated windows api calls to perfom change of cursor.
    Cleared item next_selection before exiting.
    
AUDIT TRAIL: 4.1
1.  MVS 10/13/1999
    (a) Created a CONFIRM_B2K_EXIT procedure to which all methods of manually exiting
        Banner2000 will be pointed.  This will ensure that the user is always prompted
        before Banner2000 is exited, regardless of the method invoked.  Updated text
        of alert presented when a user attempts to exit Banner2000 to be session-specific.
    (b) Updated form-level KEY-EXIT and CHECK_TYPE triggers to use new CONFIRM_B2K_EXIT
        procedure.
    (c) Deleted form-level KEY-CQUERY trigger, which was performing an exit from
        Banner2000 without prompting the user.  This trigger was never firing, as the
        block-level KEY-CQUERY trigger within KEY_BLOCK was always overriding it.
    (d) Updated KEY-NEXT-ITEM trigger for KEY_BLOCK.NEXT_SELECTION to not perform a
        code search on the entered value if the value is among the supported keywords
        for exiting a Banner2000 session (currently 'EXIT' and 'QUIT').
2.  MVS 10/13/1999
    Updated CONFIRM_B2K_EXIT procedure to disconnect a Banner2000 session from
    communications with SCT Workflow if a user launched the Banner2000 session
    from Workflow to perform tasks or activities.
3.  MVS 10/25/1999
    (a) Updated WHEN-NEW-FORM-INTANCE trigger to move "make Workflow timer" logic so that
        it executes before the START_UP_MENU procedure, which will use the existence of
        the Workflow timer as a test.
    (b) Updated form-level CALL_ROUTINE trigger to only display a pending message
        notification if it will not interfere with the returning of a user to SCT Workflow
        if he or she has completed a workflow task or activity.
    (c) Updated START_UP_MENU procedure to only display a pending message notification
        upon logging into Banner2000 if it will not interfere with the launching of
        a workflow task or activity (i.e., the timer that polls for workflow tasks
        and activities has not been created).
4.  MVS 11/01/1999
    Updated format of messages displayed in ON-ERROR trigger for errors that are not
    specifically handled such that user is given the error type along with the error
    number and text.

AUDIT TRAIL: 4.2
1.  SJQ 02/10/00
    Modify the CALL_ROUTINE to support quickflows which have a 'Q' in the third
    position of the name (11697).
2.  AP 05/30/00
    Created the GET_EAWTE_MESSAGES program unit which is called from CALL_ROUTINE
    to indicate if the user has time sheets to approve.
    (for Payroll and Position Control forms only).
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:711
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit BASELINE_USER_MSG
	
	PROCEDURE baseline_user_msg IS
  alrt_msg  VARCHAR2(200);
  alrt_btn  PLS_INTEGER;
BEGIN
  alrt_msg := G$_NLS.Get('GUAGMNU-0048','FORM','You are logged in as BASELINE. Changes you '
                         || 'make may affect all users.') ;
--
  SET_ALERT_PROPERTY('WARNING_ALERT', ALERT_MESSAGE_TEXT,alrt_msg);
  alrt_btn := SHOW_ALERT('WARNING_ALERT');
END;
	*/
	//ID:712
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void baselineUserMsg()
		{
			NString alrtMsg= NString.getNull();
			NInteger alrtBtn= NInteger.getNull();
			alrtMsg = GNls.Fget(toStr("GUAGMNU-0048"), toStr("FORM"), toStr("You are logged in as BASELINE. Changes you ").append("make may affect all users."));
			// 
			setAlertMessageText("WARNING_ALERT", alrtMsg);
			alrtBtn = toInt(showAlert("WARNING_ALERT"));
		}

	
	/* Original PL/SQL code for Prog Unit CONFIRM_B2K_EXIT
	
	PROCEDURE CONFIRM_B2K_EXIT IS
  lv_btn      INTEGER := 0;
  TimerID     TIMER;
BEGIN
  DEFAULT_VALUE('N','GLOBAL.RESTART_SESSION');
  IF :GLOBAL.RESTART_SESSION = 'Y' THEN
    RESTART_SESSION;
  ELSE
    IF G$_GET_UPRF_EXIT_ALERT = 'Y' THEN
--  	
-- 4100-1 The CONFIRM_B2K_EXIT procedure has been created from the previous KEY-EXIT
--        trigger of this form to serve as the single routine that should be invoked
--        whenever a user performs any action on the Main Menu form that could
--        potentially exit the user from a Banner2000 session.
--
--        This will ensure that the user is first prompted with an alert confirming
--        that the user does indeed want to exit a session before Banner2000 proceeds.
--
--        Additionally update the text of the alert the user receives to be specific
--        to an individual session, as the user may have multiple Banner2000 sessions open.
--
      lv_btn := G$_DISPLAY_ALERT('QUIT_ALERT',G$_NLS.Get('GUAGMNU-0049','FORM','Are you sure you want to exit this Banner session?'));
    ELSE
  	  lv_btn := ALERT_BUTTON1;
    END IF; 
--
-- 4100-2 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE
--        procedure to disconnect a SCT Banner session from communications
--        with SCT Workflow if a timer was created at the startup of that
--        session to communicate with Workflow (i.e., a user launched the
--        SCT Banner session from Workflow to perform tasks or activities).
--        
--        If Workflow is not enabled at a client site, the timer was never
--        created at the startup of the SCT Banner session and the following
--        disconnection will not be performed.
--
    IF lv_btn = ALERT_BUTTON1 THEN
      TimerID := FIND_TIMER(G$_WF_DRIVER.WF_TIMER_NAME);
--
      IF NOT ID_NULL(TimerID) THEN
        G$_WF_DRIVER.WF_EXECUTE('WF_DISCONNECT_B2K');
      END IF;
--
      :KEY_BLOCK.NEXT_SELECTION := '';
--
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      
       ELSE
    	
    	:GLOBAL.EXIT_BANNER :='N';
    	
    END IF; 
    
   
--
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
--
END CONFIRM_B2K_EXIT;
	*/
	//ID:713
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void confirmB2kExit()
		{
			NInteger lvBtn = toInt(0);
			UnknownTypes.Timer timerid= null;
			try
			{
				setDefaultValue("N", "GLOBAL.RESTART_SESSION");
				if ( getGlobal("RESTART_SESSION").equals("Y") )
				{
					restartSession();
				}
				else {
					if ( getTask().getGoqrpls().gGetUprfExitAlert().equals("Y") )
					{
						//   	
						//  4100-1 The CONFIRM_B2K_EXIT procedure has been created from the previous KEY-EXIT
						//         trigger of this form to serve as the single routine that should be invoked
						//         whenever a user performs any action on the Main Menu form that could
						//         potentially exit the user from a Banner2000 session.
						// 
						//         This will ensure that the user is first prompted with an alert confirming
						//         that the user does indeed want to exit a session before Banner2000 proceeds.
						// 
						//         Additionally update the text of the alert the user receives to be specific
						//         to an individual session, as the user may have multiple Banner2000 sessions open.
						// 
						lvBtn = toInt(getTask().getGoqrpls().gDisplayAlert(toStr("QUIT_ALERT"), GNls.Fget(toStr("GUAGMNU-0049"), toStr("FORM"), toStr("Are you sure you want to exit this Banner session?"))));
					}
					else {
						lvBtn = toInt(MessageServices.BUTTON1);
					}
					// 
					//  4100-2 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE
					//         procedure to disconnect a SCT Banner session from communications
					//         with SCT Workflow if a timer was created at the startup of that
					//         session to communicate with Workflow (i.e., a user launched the
					//         SCT Banner session from Workflow to perform tasks or activities).
					//         
					//         If Workflow is not enabled at a client site, the timer was never
					//         created at the startup of the SCT Banner session and the following
					//         disconnection will not be performed.
					// 
					if ( lvBtn.equals(MessageServices.BUTTON1) )
					{
						// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
						//						timerid = SupportClasses.FORMS40.FindTimer(GWfDriver.wfTimerName);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
						
						
						// 
						if ( !(timerid == null) )
						{
							getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_DISCONNECT_B2K"));
						}
						// 
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						// 
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						setGlobal("EXIT_BANNER", toStr("N"));
					}
				}
			}
			catch(Exception  e)
			{
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  TGKinderman 06/06/2000
    In the forms4.5 environment; Deleted referenced canvases SCROLL_CANVAS and
    SCRL_SUB_CANVAS and then copied them back in from GOQGMNU.fmb.  Deleted the
    referenced property class MENU_TYPE and then copied it back in from
    GOQGMNU.fmb.  To the form level property pallet, reaplly the local property
    class of MENU_TYPE.  On block MENU clear the value GURMENU from base table.
    In the forms6.0 environment; modified the scroll bar canvas for the MENU
    block to be SCROLL_CANVAS.  Removed the call to G$_RESIZE_MAIN_WINDOW from
    the WHEN-NEW-FORM-INSTANCE trigger.
2.  SJQ 08/25/2000
    Modified reference to G$_WIN_API routines to use the WIN_API routines.
3.  SJQ 08/31/2000
    Modify mouse movement triggers to use the appropriate set_application_property
    command to change the cursor.  Removed all refereneces to the G$_CURSORSET
    package.  Added logic to make the cursor look like an error when moving over
    the symbol types.
4.  SJQ 08/31/2000
    Add new alert window, canvas and buttons to emulate the alert for viewing
    messages.  Waiting for solution to crashing system.  Required creating a 
    local version of G$_DO_NEW_MESSAGES_EXIST, new window, new canvas, and two
    new buttons.
5.  SJQ 09/18/2000
    Replaced all CHANGE_ALERT_MESSAGE commands with SET_ALERT_PROPERTY commands.
    The previous command was unsupport and will be desupported.
6.  SJQ 10/11/2000
    Change several messages that said Banner2000 to be SCT Banner.
7.  SJQ 10/12/2000
    Modify the GET_EAWTE_MESSAGES routine to use the new ALERT_WINDOW instead of 
    using the built in alerts.  See entry #4 above.  Applied the G$_NVA_BUTTON_ITEM
    to all of the buttons which are local for the tool bars.
8.  SJQ 10/12/2000
    Copy the G$_GET_PIPE_MESSAGE routine local from GOQRPLS	so that the logic
    which launches the alert can be changed to use the new alert_window.  See entry
    #4 above.
9.  SJQ 10/13/2000
    Modify all logic which was calling another form to call a standard routine 
    (DO_FORM_CALL) and add logic to this routine to reset the cursor back to the
    default rather than the arrow.
10. SJQ 10/17/2000
    Modify the KEY-MENU entry to not display on the show keys menu.  Modify the NEXT and
    PREVIOUS block functions to disable them as they are invalid and remove from the key
    menu.
11. DRM 12-12-2000
    Adding two new alerts for Banner(r) XtenderSolutions(tm) product.  These two
    alerts are subclassed from GOQOLIB.fmb.
12. SJQ 01-11-2001
    Modify the DISPLAY_LINE item trigger: Modified the WHEN-MOUSE-DOWN, 
    WHEN-MOUSE-MOVE triggers to add NAME_IN on all SYSTEM.MOUSE_ITEM's and added 
    block qualification for any item which didn't have any.

    Modify the DISPLAY_BUT_LINE item trigger: Modified the WHEN-MOUSE-DOWN, 
    WHEN-MOUSE-MOVE triggers to add NAME_IN on all SYSTEM.MOUSE_ITEM's and added 
    block qualification for any item which didn't have any.
    
    Commented out the logic of the WHEN-BUTTON-PRESSED trigger on the TYPE_BTN
    which is supposed to change the sort of the records displayed on the menu but
    is not working correctly.

AUDIT TRAIL: 5.2
1. TGKinderman 04/23/2001
   DEFECT: 61357
   Problem: If you add more then 18 object names to a personal or custom menu it will not
   display correctly on GUAGMNU.  This was not a problem in Banner 4.x because the form had
   a scroll bar that would allow you to scroll through menus greater then 18 objects.
   Solution: Set the Scroll Bar Canvas property to SCRL_SUB_CANVAS on the ITEM block. During
   the conversion from 4.x to 5.0 this block was erroneously set to null.

AUDIT TRAIL: 5.3
1. DRM         08/08/2001
   Because Object Group GOQOLIB.G$_TOOLBAR.G$_TOOLBAR is not referenced into GUAGMNU
   like most Banner forms, we must create a local copy of the WHEN-MOUSE-CLICK trigger using
   GOQOLIB as the model.  This source code was therefore copied from 
   GOQOLIB.G$_HORIZONTAL_TOOLBAR.WHEN-MOUSE-CLICK into the G$_TOOLBAR_SHORT parallels
   in this current form, adding it to the code that already existed therein.  The identical 
   trigger in the vertical toolbar was then referenced from the horizontal toolbar.

   New non-visible, non-base-table item BXS_AWARE_IND item added to block 
   G$_HORIZONTAL_TOOLBAR.  This item allows BXS code to determine whether a given
   Banner form is "BXS-enabled" or not (compiled against a 5.3 or later release of GOQOLIB).

AUDIT TRAIL: 5.4
1.  SJQ 11/11/2001
    Modify the mouse movement triggers to remove all references to the G$_HINT package.
    This routine is obsolete and should not be referenced.
2.  G Shalovka  16 Jan 2002
    Modify Program Unit START_UP_MENU to include edit for valid preferred menu.
    This is to prevent GUAGMNU from attempting to display a StartUp Menu that
    is not properly built within the menu hierarchy.
3.  SJQ 02/01/2002
    Modify the attributes of the DISPLAY_BUT_LINE to make it a display item instead of a
    button and remove some of the NAME_IN commands within the triggers on this item.  This
    is to solve the problem where the resizing of the menu name and description didn't 
    work.
4.  SJQ 02/04/2002
    Modify the logic in the when-mouse-move trigger for the display_line item.  The logic
    is used when resizing the frame and was generating errors when you attempted to move
    the line all the way to the left (hiding the frame).  This was generating errors since
    it take into consideration the size of the scroll bar in that canvas (64892).
5.  SJQ 02/05/2002
    Remove the logic added as part of entry 2 above.  It was decided that this should be
    prevented by the menu maintenance forms.  Modify the START_UP_MENU to check if running
    net native and if so to hide the type button and resize the description button(73882).  
6.  SJQ 02/06/2002
    Modify the mouse-click buttons to clear the direct access field.  If an invalid entry 
    was entered and the user clicks on a menu, the error condition prevents the user action.
    Modify the POPULATE_EXPLORER routine to remove logic which was attempting to load the
    user's starting menu.  This is handled by the START_UP_MENU and is duplicate logic(57398).
7.  SJQ 02/07/2002
    Modify the WHEN-NEW-FORM-INSTANCE to remove unused globals.  Modify the CHANGE_SELECTION
    package to remove several unneeded GO_ITEM commands.  Removed the MAKE_BANNER_TIMER routine
    since this is no longer used.
8.  SJQ 02/11/2002
    Modify the attributes of the MENU_3_CANVAS and the MENU.MENU_DESC to make the width wide
    enough to display the full description value (80).  Add a horizontal scroll bar to the 
    MENU_3_CANVAS so that the user can scroll to read the full description.  Modify the 
    POPULATE_EXPLORER routine make sure that when building the indented description to handle
    truncated the description to equal the maximum size.
9.  SJQ 02/18/2002
    Add logic to the symbol item on the menu block to make sure the cursor navigates back to
    the selection field.  Also changed the background color of the scroll bar canvas on the 
    menu block to match the background color of the block.
10. HCheng 03/01/2002
    Problem: The font size is too small to read from MAC platform.
    Solution: Changed font size from 8 to 10 on KEY_BLOCK.LEVEL_LIST, KEY_BLOCK.NEXT_SELECTION,
              MENU.MENU_DESC, ITEM.MENU_DISP, ITEM.MENU_NAME and LOCAL_HIGHLITE_TEXT in VISUAL
              ATTRIBUTTES;
              Made ITEM.MENU_NAME unbold by changing weight from <unspecified> to Medium.
11. SJQ 03/20/2002
    Modify the attributes of the LEVEL_LIST item changing the weight from <unspecified> to
    Demilight.  Modify the items in the three blocks to all have the same font weight.
12. SJQ 03/20/2002
    Modify the exit logic to check if any data extract information was entered into the GUBOUTP
    table for this session.  If so, delete it as clean up processing.
13. SJQ 03/22/2002
    Modify the exit logic to add an alert if more than 500 records exist so the user knows 
    there may be a slight delay in exiting.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:714
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit GET_EAWTE_MESSAGES
	
	PROCEDURE GET_EAWTE_MESSAGES IS
--
  VAR1   VARCHAR2(1);
--
  CURSOR GURTKLR_EAWTE_INFO IS
    SELECT 'X' 
      FROM GURTKLR
     WHERE GURTKLR_USER_ID = :GLOBAL.current_user1
       AND GURTKLR_CREATOR = 'EAWTE';
--
BEGIN
  IF NAME_IN('GLOBAL.APPROVAL_MSG_IND') = 'Y' THEN
    OPEN GURTKLR_EAWTE_INFO;
    FETCH GURTKLR_EAWTE_INFO INTO VAR1;
--
    IF GURTKLR_EAWTE_INFO%FOUND THEN
      SET_ALERT_PROPERTY('G$_PIPE_MESSAGE_ALERT',ALERT_MESSAGE_TEXT,
            G$_NLS.Get('GUAGMNU-0050','FORM','Time transaction(s) exist. Do you wish to view them now?'));
      IF SHOW_ALERT('G$_PIPE_MESSAGE_ALERT') = ALERT_BUTTON1 THEN
--
        DELETE FROM GURTKLR
	       WHERE GURTKLR_USER_ID = :GLOBAL.current_user1
	         AND GURTKLR_CREATOR = 'EAWTE';
--
        :SYSTEM.MESSAGE_LEVEL := 5;
	      COMMIT;
	      :SYSTEM.MESSAGE_LEVEL := 0;
--
        IF NAME_IN('GLOBAL.SELECTFRM') <> 'PHADSUM' THEN
          DO_FORM_CALL('PHADSUM');
        END IF;
--
      END IF;
    END IF;
    CLOSE GURTKLR_EAWTE_INFO;
  END IF;
END;
	*/
	//ID:715
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void getEawteMessages(MessagesAdapter messagesElement)
		{
			int rowCount = 0;
			// 
			NString var1= NString.getNull();
			String sqlgurtklrEawteInfo = "SELECT 'X' " +
	" FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = :GLOBAL_CURRENT_USER1 AND GURTKLR_CREATOR = 'EAWTE' ";
			DataCursor gurtklrEawteInfo = new DataCursor(sqlgurtklrEawteInfo);
			try {
				if ( getNameIn("GLOBAL.APPROVAL_MSG_IND").equals("Y") )
				{
					//Setting query parameters
					gurtklrEawteInfo.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable gurtklrEawteInfo.
					gurtklrEawteInfo.open();
					ResultSet gurtklrEawteInfoResults = gurtklrEawteInfo.fetchInto();
					if ( gurtklrEawteInfoResults != null ) {
						var1 = gurtklrEawteInfoResults.getStr(0);
					}
					// 
					if ( gurtklrEawteInfo.found() )
					{
						setAlertMessageText("G$_PIPE_MESSAGE_ALERT", GNls.Fget(toStr("GUAGMNU-0050"), toStr("FORM"), toStr("Time transaction(s) exist. Do you wish to view them now?")));
						if ( showAlert("G$_PIPE_MESSAGE_ALERT").equals(MessageServices.BUTTON1) )
						{
							// 
							String sql1 = "DELETE FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = :GLOBAL_CURRENT_USER1 AND GURTKLR_CREATOR = 'EAWTE'";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
							rowCount = command1.execute();
							// 
							// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
							try { 
							MessageServices.setMessageLevel(MessageLevel.NONE);
							commitTask();
							// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
							} finally {
										
							MessageServices.resetMessageLevel();
							}
										
							// 
							if ( getNameIn("GLOBAL.SELECTFRM").notEquals("PHADSUM") )
							{
								doFormCall(messagesElement, toStr("PHADSUM"));
							}
						}
					}
					gurtklrEawteInfo.close();
				}
				}finally{
					gurtklrEawteInfo.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit G$_GET_PIPE_MESSAGES
	
	PROCEDURE G$_GET_PIPE_MESSAGES IS 
--sq
-- This PL/SQL procedure can be removed once the alert problem is solved.
-- See the 5.0 audit trail.
--
--
-- This procedure checks for Electronic Approvals messages through the use of  
-- a dbms pipe named as the Oracle username. It alerts the user to how many 
-- transactions they have pending. 
--
  TIMED_OUT      EXCEPTION;
  PRAGMA         EXCEPTION_INIT(TIMED_OUT,-6556);
  STATUS         PLS_INTEGER;
  MAX_WAIT       PLS_INTEGER := 0;
  RETURN_PIPE    VARCHAR2(30);
  RETURN_MESSAGE VARCHAR(200);
  COUNT_MSG      PLS_INTEGER := 0;
  ALERT_MESSAGE  VARCHAR2(80);
--
BEGIN
  DEFAULT_VALUE('N','GLOBAL.APPROVAL_MSG_IND');
  IF NAME_IN('GLOBAL.APPROVAL_MSG_IND') = 'Y' THEN 
    RETURN_PIPE := :GLOBAL.current_user1;
    LOOP 
      STATUS := GOKDBMS.PIPE_RECEIVE_MESSAGE(RETURN_PIPE,MAX_WAIT);
      GOKDBMS.PIPE_UNPACK_MESSAGE(RETURN_MESSAGE);
      IF STATUS = 0 THEN 
        COUNT_MSG := COUNT_MSG + 1;
      ELSE
        EXIT;
      END IF;
    END LOOP;
  END IF;
--
EXCEPTION
  WHEN TIMED_OUT THEN 
    IF COUNT_MSG > 0 THEN
      ALERT_MESSAGE := RETURN_MESSAGE;
      SET_ALERT_PROPERTY('G$_PIPE_MESSAGE_ALERT',ALERT_MESSAGE_TEXT,ALERT_MESSAGE);
      IF SHOW_ALERT('G$_PIPE_MESSAGE_ALERT') = ALERT_BUTTON1 THEN 
        IF NAME_IN('GLOBAL.SELECTFRM') <> 'NOAAPSM' THEN
          DO_FORM_CALL('NOAAPSM');
        END IF;
      END IF;    
    END IF;
--
  WHEN OTHERS THEN
    MESSAGE(G$_NLS.Get('GUAGMNU-0051','FORM','*WARNING* Problem receiving piped messages.'));
END;

	*/
	//ID:716
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gGetPipeMessages(MessagesAdapter messagesElement)
		{
			// sq
			//  This PL/SQL procedure can be removed once the alert problem is solved.
			//  See the 5.0 audit trail.
			// 
			// 
			//  This procedure checks for Electronic Approvals messages through the use of  
			//  a dbms pipe named as the Oracle username. It alerts the user to how many 
			//  transactions they have pending. 
			// 
			NInteger status= NInteger.getNull();
			NInteger maxWait = toInt(0);
			NString returnPipe= NString.getNull();
			NString returnMessage= NString.getNull();
			NInteger countMsg = toInt(0);
			NString alertMessage= NString.getNull();
		//	NString messagesElement =NString.getNull();
		
			try
			{
				setDefaultValue("N", "GLOBAL.APPROVAL_MSG_IND");
				if ( getNameIn("GLOBAL.APPROVAL_MSG_IND").equals("Y") )
				{
					returnPipe = getGlobal("CURRENT_USER1");
					while (true) {
						status = toInt(Gokdbms.FpipeReceiveMessage(returnPipe, toNumber(maxWait)));
						Ref<NString> p_item_ref = new Ref<NString>(returnMessage);
						Gokdbms.pipeUnpackMessage(p_item_ref);
						returnMessage = p_item_ref.val;
						if ( status.equals(0) )
						{
							countMsg = countMsg.add(1);
						}
						else {
								break;
							
						}
					}
				}
			}
			catch(TimedOut e)
			{
				if ( countMsg.greater(0) )
				{
					alertMessage = returnMessage;
					setAlertMessageText("G$_PIPE_MESSAGE_ALERT", alertMessage);
					if ( showAlert("G$_PIPE_MESSAGE_ALERT").equals(MessageServices.BUTTON1) )
					{
						if ( getNameIn("GLOBAL.SELECTFRM").notEquals("NOAAPSM") )
						{
							doFormCall(messagesElement, toStr("NOAAPSM"));
						}
					}
				}
			}
			catch(Exception  e)
			{
				warningMessage(GNls.Fget(toStr("GUAGMNU-0051"), toStr("FORM"), toStr("*WARNING* Problem receiving piped messages.")));
			}
		}

	
	/* Original PL/SQL code for Prog Unit DO_FORM_CALL
	
	<multilinecomment>
PROCEDURE DO_FORM_CALL (FORM_NAME_IN VARCHAR) IS
BEGIN
--
-- Turn off current role and call object.
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.current_user1,FORM_NAME_IN,'');
--
  SET_PREFERENCES;
--
  QUERY_BROADCAST_MSGS;
END;
</multilinecomment>
PROCEDURE DO_FORM_CALL (FORM_NAME_IN VARCHAR) IS
BEGIN
--
-- Turn off current role and call object.
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.current_user1,FORM_NAME_IN,'');
--
  DEFAULT_VALUE('N','GLOBAL.RESTART_SESSION');
  IF :GLOBAL.RESTART_SESSION = 'N' THEN
    SET_PREFERENCES;
    QUERY_BROADCAST_MSGS;
  END IF;
END;
	*/
	//ID:717
	/* <p>
		* PROCEDURE DO_FORM_CALL (FORM_NAME_IN VARCHAR) IS
		* BEGIN
		* --
		* -- Turn off current role and call object.
		* --
		* EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
		* G$_CHECK_FAILURE;
		* G$_SECURED_FORM_CALL(:GLOBAL.current_user1,FORM_NAME_IN,'');
		* --
		* SET_PREFERENCES;
		* --
		* QUERY_BROADCAST_MSGS;
		* END;
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formNameIn
		*/
		public void doFormCall(MessagesAdapter messagesElement, NString formNameIn)
		{
			// 
			//  Turn off current role and call object.
			// 
			executeAction("G$_REVOKE_ACCESS");
			getTask().getGoqrpls().gCheckFailure();
			getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), formNameIn, toStr(""));
			// 
			setDefaultValue("N", "GLOBAL.RESTART_SESSION");
			if ( getGlobal("RESTART_SESSION").equals("N") )
			{
				setPreferences();
				queryBroadcastMsgs(messagesElement);
			}
		}

	
	/* Original PL/SQL code for Prog Unit NAVIGATE_TREE
	
	PROCEDURE NAVIGATE_TREE (TO_CHILD_NODE VARCHAR2, TO_PARENT_NODE VARCHAR2) IS
  htree         ITEM;
  find_node     FTREE.NODE;
  start_branch  VARCHAR2(30);
--
  CURSOR get_parent_c (cp_obj VARCHAR2) IS
    SELECT GUTMENU_PRIOR_OBJ
      FROM GUTMENU
     WHERE GUTMENU_VALUE = cp_obj;
--
BEGIN
	HIDE_VIEW('SITEMAP');
--
  start_branch := NVL(TO_PARENT_NODE,'');
  htree := Find_Item('tree.gurmenu_desc');
  find_node := Ftree.FIND_TREE_NODE(htree,start_branch,Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
--
  IF TO_CHILD_NODE IS NOT NULL THEN
    IF start_branch IS NOT NULL THEN
      find_node := Ftree.FIND_TREE_NODE(htree,TO_CHILD_NODE,Ftree.find_next,
                         Ftree.NODE_VALUE,find_node,find_node);
    ELSE
  	  find_node := Ftree.FIND_TREE_NODE(htree,TO_CHILD_NODE,Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
    END IF;
  END IF;
--
  Ftree.Set_Tree_NODE_PROPERTY(htree,find_node,Ftree.NODE_STATE,Ftree.EXPANDED_NODE);
  Ftree.Set_Tree_Selection(htree, find_node, Ftree.SELECT_ON);
--
-- Change the icon
--
  IF Ftree.GET_TREE_NODE_PROPERTY(htree,find_node,Ftree.NODE_ICON) = 'folder' THEN
    Ftree.SET_TREE_NODE_PROPERTY(htree, find_node, Ftree.NODE_ICON, 'open_folder');
  END IF;
--
-- Find the parent folder and change the icon
--
  OPEN get_parent_c (TO_CHILD_NODE);
  FETCH get_parent_c INTO start_branch;
  CLOSE get_parent_c;
--
  find_node := Ftree.FIND_TREE_NODE(htree,start_branch,Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
  IF Ftree.GET_TREE_NODE_PROPERTY(htree,find_node,Ftree.NODE_ICON) = 'folder' THEN
    Ftree.SET_TREE_NODE_PROPERTY(htree, find_node, Ftree.NODE_ICON, 'open_folder');
  END IF;
--
-- Change the top level icon
--
  find_node := Ftree.FIND_TREE_NODE(htree,'*MENU',Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
  IF Ftree.GET_TREE_NODE_PROPERTY(htree,find_node,Ftree.NODE_ICON) = 'folder' THEN
    Ftree.SET_TREE_NODE_PROPERTY(htree, find_node, Ftree.NODE_ICON, 'open_folder');
  END IF;
END;
	*/
	//ID:718
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param toChildNode
		* @param toParentNode
		*/
		public void navigateTree(NString toChildNode, NString toParentNode)
		{
			int rowCount = 0;
			TreeDescriptor htree= null;
			TreeNode findNode= null;
			NString startBranch= NString.getNull();
			String sqlgetParentC = "SELECT GUTMENU_PRIOR_OBJ " +
	" FROM GUTMENU " +
	" WHERE GUTMENU_VALUE = :P_CP_OBJ ";
			DataCursor getParentC = new DataCursor(sqlgetParentC);
			NString cpObj = NString.getNull();
			try {
				hideView("SITEMAP");
				// 
				startBranch = isNull(toParentNode, "");
				htree = getTree("tree.gurmenu_desc");
				findNode = findTreeNode(htree, startBranch, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
				// 
				if ( !toChildNode.isNull() )
				{
					if ( !startBranch.isNull() )
					{
						findNode = findTreeNode(htree, toChildNode, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, findNode, findNode);
					}
					else {
						findNode = findTreeNode(htree, toChildNode, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
					}
				}
				// 
				// F2J_NOT_SUPPORTED : The property "TREE_NODE's nodeState" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
				//				SupportClasses.FTREE.SetTreeNodeProperty(htree, findNode, Ftree.nodeState, TreeServices.EXPANDED_NODE);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'TREE_NODE's nodeState' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
				
				
				setTreeSelection(htree, findNode, true);
				// 
				//  Change the icon
				// 
				if ( getTreeNodeIcon(htree, findNode).equals("folder") )
				{
					setTreeNodeIcon(htree, findNode, "open_folder");
				}
				// 
				//  Find the parent folder and change the icon
				// 
				cpObj=toChildNode;
				//Setting query parameters
				getParentC.addParameter("P_CP_OBJ", cpObj);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getParentC.
				getParentC.open();
				ResultSet getParentCResults = getParentC.fetchInto();
				if ( getParentCResults != null ) {
					startBranch = getParentCResults.getStr(0);
				}
				getParentC.close();
				// 
				findNode = findTreeNode(htree, startBranch, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
				if ( getTreeNodeIcon(htree, findNode).equals("folder") )
				{
					setTreeNodeIcon(htree, findNode, "open_folder");
				}
				// 
				//  Change the top level icon
				// 
				findNode = findTreeNode(htree, "*MENU", TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
				if ( getTreeNodeIcon(htree, findNode).equals("folder") )
				{
					setTreeNodeIcon(htree, findNode, "open_folder");
				}
				}finally{
					getParentC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit NAVIGATE_TREE_LABEL
	
	PROCEDURE NAVIGATE_TREE_LABEL (TO_CHILD_NODE VARCHAR2, TO_PARENT_NODE VARCHAR2) IS
  htree         ITEM;
  find_node     FTREE.NODE;
  start_branch  VARCHAR2(30);
BEGIN
	HIDE_VIEW('SITEMAP');
--
  start_branch := NVL(TO_PARENT_NODE,'');
  htree := Find_Item('tree_label.gurmenu_desc_label');
  find_node := Ftree.FIND_TREE_NODE(htree,start_branch,Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
--
  IF TO_CHILD_NODE IS NOT NULL THEN
    IF start_branch IS NOT NULL THEN
      find_node := Ftree.FIND_TREE_NODE(htree,TO_CHILD_NODE,Ftree.find_next,
                         Ftree.NODE_VALUE,find_node,find_node);
    ELSE
  	  find_node := Ftree.FIND_TREE_NODE(htree,TO_CHILD_NODE,Ftree.find_next,
                         Ftree.NODE_VALUE,ftree.root_node,ftree.root_node);
    END IF;
  END IF;
--
  Ftree.Set_Tree_NODE_PROPERTY(htree,find_node,Ftree.NODE_STATE,Ftree.EXPANDED_NODE);
  Ftree.Set_Tree_Selection(htree, find_node, Ftree.SELECT_ON);
END;
	*/
	//ID:719
	/* <p>
/* </p>
		* @param toChildNode
		* @param toParentNode
		*/
		public void navigateTreeLabel(NString toChildNode, NString toParentNode)
		{
			TreeDescriptor htree= null;
			TreeNode findNode= null;
			NString startBranch= NString.getNull();
			hideView("SITEMAP");
			// 
			startBranch = isNull(toParentNode, "");
			htree = getTree("tree_label.gurmenu_desc_label");
			findNode = findTreeNode(htree, startBranch, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
			// 
			if ( !toChildNode.isNull() )
			{
				if ( !startBranch.isNull() )
				{
					findNode = findTreeNode(htree, toChildNode, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, findNode, findNode);
				}
				else {
					findNode = findTreeNode(htree, toChildNode, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
				}
			}
			// 
			// F2J_NOT_SUPPORTED : The property "TREE_NODE's nodeState" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
			//			SupportClasses.FTREE.SetTreeNodeProperty(htree, findNode, Ftree.nodeState, TreeServices.EXPANDED_NODE);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'TREE_NODE's nodeState' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
			
			
			setTreeSelection(htree, findNode, true);
		}

	
	/* Original PL/SQL code for Prog Unit IS_RUNABLE
	
	FUNCTION is_runable (object_name VARCHAR2) RETURN BOOLEAN IS 
  CURSOR OBJECT_TYPE IS
   SELECT 'X'
     FROM GUBOBJS
    WHERE GUBOBJS_NAME = OBJECT_NAME
      AND GUBOBJS_OBJT_CODE IN ('FORM','JOBS','QUICKFLOW');
--
  hold_object VARCHAR2(1);
BEGIN
  OPEN OBJECT_TYPE;
  FETCH OBJECT_TYPE INTO hold_object;
  CLOSE OBJECT_TYPE;
--
  IF NVL(hold_object,'Z') = 'X' THEN
  	RETURN(TRUE);
  ELSE
  	RETURN(FALSE);
  END IF;
END;
	*/
	//ID:720
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param objectName
		*/
		public NBool isRunable(NString objectName)
		{
			int rowCount = 0;
			String sqlobjectType = "SELECT 'X' " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_OBJECT_NAME AND (GUBOBJS_OBJT_CODE) IN ('FORM', 'JOBS', 'QUICKFLOW') ";
			DataCursor objectType = new DataCursor(sqlobjectType);
			// 
			NString holdObject= NString.getNull();
			try {
				//Setting query parameters
				objectType.addParameter("P_OBJECT_NAME", objectName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable objectType.
				objectType.open();
				ResultSet objectTypeResults = objectType.fetchInto();
				if ( objectTypeResults != null ) {
					holdObject = objectTypeResults.getStr(0);
				}
				objectType.close();
				// 
				if ( isNull(holdObject, "Z").equals("X") )
				{
					return  toBool(((NBool.True)));
				}
				else {
					return  toBool(((NBool.False)));
				}
				}finally{
					objectType.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit DO_NEW_MESSAGES_EXIST
	
	PROCEDURE DO_NEW_MESSAGES_EXIST (p_USER VARCHAR2) IS
--
  dummy                VARCHAR2(1)  := NULL;
--
  CURSOR MSG_CURSOR1 IS
    SELECT 'X'
      FROM GURTKLR
     WHERE GURTKLR_USER_ID = p_USER
       AND GURTKLR_STATUS = 'P'
       AND TO_DATE(TO_CHAR(GURTKLR_TODO_DATE,'MMDDYYYY')||
           TO_CHAR(NVL(GURTKLR_TODO_TIME,0),'0000'),'MMDDYYYYHH24MI') <= SYSDATE;
--
BEGIN
  DEFAULT_VALUE('','GLOBAL.LAST_NOTIFY_TIME');
  DEFAULT_VALUE('','GLOBAL.LAST_NOTIFY_DATETIME');
--
  OPEN MSG_CURSOR1;
  FETCH MSG_CURSOR1 INTO dummy;
  IF MSG_CURSOR1%NOTFOUND THEN
    CLOSE MSG_CURSOR1;
    SET_ITEM_PROPERTY('MY_LINKS.NEW_MESSAGE_IMAGE',VISIBLE,PROPERTY_FALSE);
    RETURN;
  END IF;
  CLOSE MSG_CURSOR1;
--
  IF p_USER <> 'BASELINE' THEN
    COPY(TO_CHAR(SYSDATE,'HH24MI'),'GLOBAL.LAST_NOTIFY_TIME');
    COPY(TO_CHAR(SYSDATE,'MMDDYYYYHH24MI'),'GLOBAL.LAST_NOTIFY_DATETIME');
    SET_ITEM_PROPERTY('MY_LINKS.NEW_MESSAGE_IMAGE',VISIBLE,PROPERTY_TRUE);
  END IF;
END;

	*/
	//ID:721
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pUser
		*/
		public void doNewMessagesExist(NString pUser)
		{
			int rowCount = 0;
			// 
			NString dummy = NString.getNull();
			String sqlmsgCursor1 = "SELECT 'X' " +
	" FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = :P_P_USER AND GURTKLR_STATUS = 'P' AND TO_DATE(TO_CHAR(GURTKLR_TODO_DATE, 'MMDDYYYY') || TO_CHAR(NVL(GURTKLR_TODO_TIME, 0), '0000'), 'MMDDYYYYHH24MI') <= SYSDATE ";
			DataCursor msgCursor1 = new DataCursor(sqlmsgCursor1);
			try {
				setDefaultValue("", "GLOBAL.LAST_NOTIFY_TIME");
				setDefaultValue("", "GLOBAL.LAST_NOTIFY_DATETIME");
				// 
				//Setting query parameters
				msgCursor1.addParameter("P_P_USER", pUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable msgCursor1.
				msgCursor1.open();
				ResultSet msgCursor1Results = msgCursor1.fetchInto();
				if ( msgCursor1Results != null ) {
					dummy = msgCursor1Results.getStr(0);
				}
				if ( msgCursor1.notFound() )
				{
					msgCursor1.close();
					setItemVisible("MY_LINKS.NEW_MESSAGE_IMAGE", false);
					return ;
				}
				msgCursor1.close();
				// 
				if ( pUser.notEquals("BASELINE") )
				{
					copy(toChar(NDate.getNow(), "HH24MI"),"GLOBAL.LAST_NOTIFY_TIME");
					copy(toChar(NDate.getNow(), "MMDDYYYYHH24MI"),"GLOBAL.LAST_NOTIFY_DATETIME");
					setItemVisible("MY_LINKS.NEW_MESSAGE_IMAGE", true);
				}
				}finally{
					msgCursor1.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  G Shalovka 12 February 2003
    Re-design, adding sitemap canvases and Hierarchical Tree item in TREE block.
2.  G Shalovka 28 February 2003
    Defects 77922, 85470.
    Problem: Problem with time of day field in GUAMESG.
             Users are not always notified about messages with to-do times. 
    Solution: Modified procedure DO_NEW_MESSAGES_EXIST 
              cursors MSBG_CURSOR1 and MSG_CURSOR2 
              to look at date and time together and not compare them
              independently.
              User Guide documentation will also be updated to more clearly
              explain the interaction between GUAGMNU form and GUAMESG form.

AUDIT TRAIL: 6.0.0.1
1.  SJQ 07/15/2003
    Modify the several triggers in the key block and in the data blocks to add a call to the
    G$_RECONNECT routine to verify the user is connected and if not, force the user to provide 
    the logon parameters.  (87106)

AUDIT TRAIL: 6.1
1.  Michael Hitrik 07/24/2003
    Defect 87405
    Problem: Potential duplicate rows displayed in My Banner portion of GUAGMNU.
    Solution: Modified RG_GUVPEMNU_PERSONAL_LABEL and RG_GUVPEMNU_PERSONAL Record Groups,
              Added p_guppmnu procedure in POPULATE_PERSONAL_MENU Trigger
2.  Michael Hitrik 07/24/2003
    Defect 87407
    Problem: GUAGMNU not properly supporting *PROCESS (Business Processes)
    Solution: Modified Trigger POPULATE_ROOT_TREE
3.  XZ 08/04/2003
    Add the call to BXS in the WHEN-NEW-FORM-INSTANCE trigger. 
4.  SJQ 08/11/2003
    Add logic to the WHEN-NEW-FORM-INSTANCE to set indicator items, added to the form_header
    block, with values for which products are installed.  Modify the site map, products list,
    and tree to reference these items to not display entries for products not installed.  Did
    not modify the personal menu record group since entries couldn't have been added here by
    the user if the product doesn't exist.
5.  SJQ 08/20/2003
    Modify the decode in all of the record groups to correctly handle all object types.
6.  SJQ 08/25/2003
    Modify the population of the product list and the product tree to use a new database
    package which utilizes a new temporary table.  This routine removes branches which are
    menus without objects.  Modify the record groups to use this new temp table.
        
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:722
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit GET_SEQ
	
	FUNCTION get_seq (p_seq NUMBER) RETURN NUMBER IS
  the_rowcount PLS_INTEGER; 
--
BEGIN
  the_rowcount := GET_GROUP_ROW_COUNT('SEQ');
--
  IF the_rowcount >= p_seq THEN 
    RETURN GET_GROUP_NUMBER_CELL('SEQ.SeqCol', p_seq);
  ELSE
    RETURN NULL;
  END IF;
END;
	*/
	//ID:725
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pSeq
		*/
		public NNumber getSeq(NNumber pSeq)
		{
		//	NInteger theRowcount= NInteger.getNull();
			int theRowcount=0;
			theRowcount = getGroupRowCount("SEQ");
			// 
			if ( theRowcount <= pSeq.toInt32() )
			{
				return getGroupNumberCell("SEQ.SeqCol", pSeq);
			}
			else {
				return NNumber.getNull();
			}
		}

	
	/* Original PL/SQL code for Prog Unit IS_LAST
	
	FUNCTION is_last (p_seq NUMBER) RETURN BOOLEAN IS
  the_rowcount PLS_INTEGER; 
--
BEGIN
  the_rowcount := GET_GROUP_ROW_COUNT('SEQ');
--
  IF the_rowcount > p_seq THEN 
    RETURN FALSE;
  ELSE
    RETURN TRUE;
  END IF;
END;
	*/
	//ID:726
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pSeq
		*/
		public NBool isLast(NNumber pSeq)
		{
			//NInteger theRowcount= NInteger.getNull();
			int theRowcount=0;
			theRowcount = getGroupRowCount("SEQ");
			// 
			if ( theRowcount >(pSeq.toInt32()) )
			{
				return  toBool(NBool.False);
			}
			else {
				return  toBool(NBool.True);
			}
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_INSTALLED_LIST
	
	PROCEDURE POPULATE_INSTALLED_LIST IS
BEGIN
--
-- Determine which products are installed
--
  :GENERAL_INSTALLED_IND := 'Y';
  :BXS_INSTALLED_IND     := 'Y';
  :STUDENT_INSTALLED_IND := :GLOBAL.STUSYS;
  :ALUMNI_INSTALLED_IND  := :GLOBAL.ALUSYS;
  :FINANCE_INSTALLED_IND := :GLOBAL.FINSYS;
  :FINAID_INSTALLED_IND  := :GLOBAL.RESSYS;
  :HUMANRE_INSTALLED_IND := :GLOBAL.HRESYS;
  :AR_INSTALLED_IND      := :GLOBAL.BILCSH;
  :POSBUD_INSTALLED_IND  := :GLOBAL.POSBUD;
END;
	*/
	//ID:727
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateInstalledList()
		{
			// 
			//  Determine which products are installed
			// 
			getFormModel().getFormHeader().setGeneralInstalledInd(toStr("Y"));
			getFormModel().getFormHeader().setBxsInstalledInd(toStr("Y"));
			getFormModel().getFormHeader().setStudentInstalledInd(getGlobal("STUSYS"));
			getFormModel().getFormHeader().setAlumniInstalledInd(getGlobal("ALUSYS"));
			getFormModel().getFormHeader().setFinanceInstalledInd(getGlobal("FINSYS"));
			getFormModel().getFormHeader().setFinaidInstalledInd(getGlobal("RESSYS"));
			getFormModel().getFormHeader().setHumanreInstalledInd(getGlobal("HRESYS"));
			getFormModel().getFormHeader().setArInstalledInd(getGlobal("BILCSH"));
			getFormModel().getFormHeader().setPosbudInstalledInd(getGlobal("POSBUD"));
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 08/20/2003
    Re-design.  Remove image at top.  Remove redundant icons and show the new toolbar.
    Remove RUN routine (for graphics).  Enlarge existing canvases.  Make main window larger.
    Add new canvases.  Remove product list.  Remove SHUT_DOWN_GRAPH trigger since this
    was only for graphics.  Add a broadcast message window and block.  This queries the 
    gurtklr table for records for the BASELINE user.
2.  SJQ 09/20/2003
    Add a "porlet" canvas with blocks for current session information, current messages,
    current jobs and implement a java bean to add url links to launch the respective forms.
    Change the DO_NEW_MESSAGES_EXIST routine to no longer have a pop-up window when
    there are new messages.
3.  SJQ 09/25/2003
    Added a SET_URL_ITEMS routine which registers the HyperLink java bean and implements
    urls for a number of items on the form.  Each has a unique name and executes a 
    WHEN-CUSTOM-ITEM-EVENT trigger to call a form.  Added a few more blocks on the portlet
    canvas with data for various settings within Banner.  Created a G$_NVA_PROMPT, 
    G$_NVA_PROMPT_ITALIC and G$_NVA_FRAME visual attributes.  These are local for now.
    Removed a number of obsolete visual attribute which were not being used.  Modify the
    local DO_NEW_MESSAGES_EXIST routine to not display an alert but to update the displayed
    item.  Removed unused canvases.  Renamed others to be more respective of what they are
    for.  Changed the QUICKFLOW launch logic to use the new G$_QUICKFLOW routine in the
    library.  Changed all of the NVAs in the form to use VERDANA font.
4.  SJQ 10/02/2003
    Remove local copies of G$_NVA_PROMPT and G$_NVA_FRAME and reference in from GOQOLIB.
    Changed color of titles to yellowish/green and made the MAIN_WINDOW white.
5.  SJQ 10/22/2003
    Add record high lighting to the messages block.  Removed a few of the frames and added the
    data separator items.  
6.  SJQ 01/26/2004
    Remove call in WHEN-NEW-FORM-INSTANCE to disable all of the menu options.  The menu module
    was modified to make the default for this items to be disabled.
7.  SJQ 02/09/2004
    Add welcome message.  Modify the DO_NEW_MESSAGES_EXIST routine to update the display item
    with a notice that new messages exist.  Modify the WHEN-WINDOW-ACTIVATED trigger to call the
    DO_NEW_MESSAGES_EXIST.
8.  SJQ 03/01/2004
    Modify the NEXT_SELECTION item to support an up arrow and down arrow to scroll through the last
    ten entries.
9.  TGK 06/07/2004
    Modify ON-ERROR trigger to execute_trigger(g$_verify_access), such that g$_nls routine can be
    seen in the database for translated strings.
10. SJQ 06/29/2004
    Add subclassed visual attributes to the links, message and tree canvas.  Add a routine to
    call the routines in the library to get the user default values for these and add a pl/sql
    routine to apply these to the visual attribtutes.  Modify the routine which was used to
    initialize the java beans to change the location of the java.
11. SJQ 08/04/2004
    Change the logic behind the user links to display a message that these have not been set
    up to work as of yet.  Change the welcome message item to be a display_item.
12. SJQ 08/11/2004
    Remove obsolete logic from the CALL_ROUTINE related to work flow.
13. SJQ 08/17/2004
    Update the help hyperlink to support the new online help configuration and implementation.
    Update the query_broadcast_msgs routine to add logic to display or hide a broadcast image
    in the key block if a new message has arrived.
14. SJQ 08/24/2004
    Change the label on the help hyperlink.  Add logic to the do_form_call to reset the canvas
    colors based on the user's preferences so that changes made on the user preference form are
    dynamically applied.  Need this to add it here since the user could have used the gumappl
    from another form to change them.  Add logic to the do_form_call to reset the preferences
    parameter which is passed into all forms so that those settings can be made dynamic.
15. SJQ 09/01/2004
    Add a new routine, SET_FGAC_NOTICE, to check if rules exist for this user.  Added a new
    image on the main menu which represent the presence of rules.  The new routine will enable
    the image if rules exist for the user.  Modify the hyperlinks to not change color when 
    clicked.
16. SJQ 09/02/2004
    Change the method of implementing the hyperlinks.  Remove the Java bean implementation and
    switch to the same method used for the "options" window.  Correct some of the key board
    navigation issues.
17. SJQ 09/07/2004
    Clean up many of the routines related to the site map.  Many of the triggers were able to 
    be modifed to move the common logic to procedures.  
18. SJQ 09/08/2004
    Remove the broadcast and fgac security images from the form.  Migrated these to the menu
    module (gumappl).  Moved the logic to enable and disable the fgac image to the general
    library.  Visual modifications to the site map - add back the bevel to the canvas, make 
    the detail font smaller to draw attention to the headers.
19. SJQ 09/09/2004
    Remove the java implementation class from the key block.  This was used to control the
    disabled items text color.  This java implementation class was moved to GUAINIT.
20. SJQ 09/28/2004
    Modify the canvas behind the selection item to make it smaller so that a random selection 
    around the around won't make the other canvases disappear.
21. SJQ 09/30/2004
    Modify the WHEN-LIST-CHANGED trigger on the product list to clear the current selection
    after copying the value to the selection item.  Not clearing it was causing the screen to
    blank if you selected the same item two times in a row from the pull down list.  Update
    the WHEN-BUTTON-PRESSED trigger for the help link to build the list of products installed
    and pass that information as part of the url.
22. SJQ 10/11/2004
    Modify the hyperlink logic to support calling any SCT Banner object and not just URLS.
23. SJQ 10/13/2004
    Modify the QUERY_BROADCAST_MSGS routine to change the labels displayed to have init caps.
24. SJQ 10/14/2004
    Add logic to the CHECK_TYPE trigger to verify a menu entry.  If the user enters a menu name,
    verify it exists either on the personal menu or on the product menu.  If not, generate an
    error message.
25. TGK 10/20/2004
    Modify WEB.SHOW_DOCUMENT parameter from _TOP to _BLANK in MY_LINKS.URL_HELP.WHEN_BUTTON_PRESSED.
    This is to better support various browsers presentation of the help.
26. SJQ 10/26/2004
    Update the INVOKE_LINK to support more formats than just http://.  Changed to test for the
    existance of '://' instead of just 'http://'.
27. TGK 11/02/2004
    Modify WEB.SHOW_DOCUMENT parameter from _BLANK to SCTBANNER in MY_LINKS.URL_HELP.WHEN_BUTTON_PRESSED.
    This is to better support various browsers presentation of the help.  This will make online help
    present within a single browser session, no matter how many times it is called.  (The change of the
    parameter to SCTBANNER can be any alphanumeric combination).
48. SJQ 11/17/2004
    Update the RG_GUVPEMNU_PERSONAL and RG_GUVPEMNU_PERSONAL_LABEL record group's query logic to 
    add an NVL around the label column.  If an invalid object exists on a personal sub-menu, the 
    loading of the record group, used to populate the tree, stops when the label is null.  Added 
    an error message to be defaulted into the label if the object is invalid.  Update form to 
    support the *PERSONAL and *MENU choices.
49. SJQ 11/22/2004
    Modify the logic which calls forms to change the select into a cursor.  Add logic to the
    same routine so that if the object name entered doesn't fetch any records, to default the
    object type to FORM and attempt to call it.  Modify the key block logic to not call the 
    code/desc routine.  This was causing an "invalid object" error and not "user not authorized"
    exception.
50. SJQ 12/02/2004
    Remove time object support.  This was implemented for debugging purposes only.

AUDIT TRAIL: 7.1
1.  SJQ 02/10/2005
    Initialize the GLOBAL.SELECTFRM in the LOAD_FORM_HEADER.  In some circumstances, navigation
    to another form without using the "GO TO" item didn't create the global correctly.
2.  SJQ 02/22/2005
    The CALL_ROUTINE trigger doesn't correctly handle a quickflow object if this is the very
    first object launched from the menu.  The logic was treating the quickflow as if it was a 
    form and checking to see if the initialization form had been run.  Changed the logic to 
    verify the object was not a quickflow when doing this logic.  Added support for the user to
    enter "HELP" in the "GO TO" item to display the online help.  This was added for accessibility.
3.  SJQ 03/30/2005
    Modify the "GO TO" item to re-implement the code/description search logic so that wild card
    searching can be supported again.  This coincides with changes to the G$_SEARCH package in 
    the GOQRPLS library which are specific to the menu form.  If a user is not authorized to
    access an object, we don't want the "invalid object" but rather a security violation.
4.  SJQ 03/31/2005
    Modify the GET_EAWTE_MESSAGE procedure to revert the existing logic which displayed the alert
    about "time transactions".  More information can be found in the AUDIT_TRAIL_5_0 procedure,
    AUDIT TRAIL: 5.0 - #4 and #7.  Due to a crashing problem, form alerts were no longer used, 
    and replaced with windows.  The fix is being removed since the alerts no longer crash and 
    because some other changes have caused the window method to stop working.
5.  SJQ 03/31/2005
    Update the POPULATE_ROOT_TREE trigger to set the user's default starting menu to be highlighted
    so that it forces the menu to expand.  After it is expanded, remove the highlighting.
6.  SJQ 04/01/2005
    Update the CHECK_TYPE trigger, such that when it is attempting to verify a menu name, it will
    not bother to verify the "*personal" or "*menu" values since these must be valid as they are
    the root levels for the personal and product menus and are thus not included in the tables.
    Update the CHECK_TYPE trigger to check the GURMENU table for a menu if it can't be found
    on the two global temporary tables.  This would mean that either the user is not authorized
    so see any objects on the menu or it is a process menu.  If it is determined to be a process
    menu, verify if the process menus need to be loaded and then continue.
7.  SJQ 04/29/2005
    Change the tooltip for the object search button so that it is consistent with the F5 navigation
    block in all forms.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:728
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SET_URL_ITEMS
	
	PROCEDURE SET_URL_ITEMS IS
  lv_desc   VARCHAR2(90);
  -- 80-2
  lv_prog   VARCHAR2(100);
BEGIN
  IF NOT G$_CHECK_ACCESS('GUAPSWD') THEN
    SET_ITEM_PROPERTY('MY_LINKS.URL_PASSWORD',VISIBLE,PROPERTY_FALSE);
  END IF;
--
-- Set up the user preference urls
--
  lv_desc := G$_GET_UPRF_LINKS_DESC1;
  IF UPPER(SUBSTR(lv_desc,1,10)) = 'YOUR FIRST' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0052','FORM','Personal Link 1');
  END IF;
  -- 80-2 replace tooltip value of description with value of called program
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG1,1,100);
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF1',LABEL,lv_desc);
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF1',TOOLTIP_TEXT,lv_desc);
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF1',TOOLTIP_TEXT,lv_prog);
--
  lv_desc := G$_GET_UPRF_LINKS_DESC2;
  IF UPPER(SUBSTR(lv_desc,1,11)) = 'YOUR SECOND' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0053','FORM','Personal Link 2');
  END IF;
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF2',LABEL,lv_desc);
  -- 80-2 replace tooltip value of description with value of called program
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG2,1,100);
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF2',TOOLTIP_TEXT,lv_desc);
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF2',TOOLTIP_TEXT,lv_prog);
--
  lv_desc := G$_GET_UPRF_LINKS_DESC3;
  IF UPPER(SUBSTR(lv_desc,1,10)) = 'YOUR THIRD' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0054','FORM','Personal Link 3');
  END IF;
  -- 80-2 replace tooltip value of description with value of called program
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF3',LABEL,lv_desc);
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG3,1,100);
  -- 80-2 replace tooltip value of description with value of called program
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF3',TOOLTIP_TEXT,lv_desc);
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF3',TOOLTIP_TEXT,lv_prog);
--
  lv_desc := G$_GET_UPRF_LINKS_DESC4;
  IF UPPER(SUBSTR(lv_desc,1,11)) = 'YOUR FOURTH' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0055','FORM','Personal Link 4');
  END IF;
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF4',LABEL,lv_desc);
  -- 80-2 replace tooltip value of description with value of called program
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG4,1,100);
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF4',TOOLTIP_TEXT,lv_desc);
	SET_ITEM_PROPERTY('MY_LINKS.URL_PREF4',TOOLTIP_TEXT,lv_prog);
--
  lv_desc := G$_GET_UPRF_LINKS_DESC5;
  IF UPPER(SUBSTR(lv_desc,1,10)) = 'YOUR FIFTH' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0056','FORM','Personal Link 5');
  END IF;
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF5',LABEL,lv_desc);
  -- 80-2 replace tooltip value of description with value of called program
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG5,1,100);
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF5',TOOLTIP_TEXT,lv_desc);
	SET_ITEM_PROPERTY('MY_LINKS.URL_PREF5',TOOLTIP_TEXT,lv_prog);
--
  lv_desc := G$_GET_UPRF_LINKS_DESC6;
  IF UPPER(SUBSTR(lv_desc,1,10)) = 'YOUR SIXTH' THEN
  	lv_desc := G$_NLS.Get('GUAGMNU-0057','FORM','Personal Link 6');
  END IF;
  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF6',LABEL,lv_desc);
  -- 80-2 replace tooltip value of description with value of called program
  lv_prog := SUBSTR(G$_GET_UPRF_LINKS_PROG6,1,100);
--  SET_ITEM_PROPERTY('MY_LINKS.URL_PREF6',TOOLTIP_TEXT,lv_desc);
	SET_ITEM_PROPERTY('MY_LINKS.URL_PREF6',TOOLTIP_TEXT,lv_prog);
END;
	*/
	//ID:729
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setUrlItems()
		{
			NString lvDesc= NString.getNull();
			//  80-2
			NString lvProg= NString.getNull();
			if ( getTask().getGoqrpls().gCheckAccess(toStr("GUAPSWD")).not() )
			{
				setItemVisible("MY_LINKS.URL_PASSWORD", false);
			}
			// 
			//  Set up the user preference urls
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc1();
			if ( upper(substring(lvDesc, toInt(1), toInt(10))).equals("YOUR FIRST") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0052"), toStr("FORM"), toStr("Personal Link 1"));
			}
			//  80-2 replace tooltip value of description with value of called program
			lvProg = substring(gGetUprfLinksProg1(), toInt(1), toInt(100));
			setItemLabel("MY_LINKS.URL_PREF1", (lvDesc).toString());
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF1',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF1", lvProg);
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc2();
			if ( upper(substring(lvDesc, toInt(1), toInt(11))).equals("YOUR SECOND") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0053"), toStr("FORM"), toStr("Personal Link 2"));
			}
			setItemLabel("MY_LINKS.URL_PREF2", lvDesc.toString());
			//  80-2 replace tooltip value of description with value of called program
			lvProg = substring(getTask().getGoqrpls().gGetUprfLinksProg2(), toInt(1), toInt(100));
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF2',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF2", lvProg);
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc3();
			if ( upper(substring(lvDesc, toInt(1), toInt(10))).equals("YOUR THIRD") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0054"), toStr("FORM"), toStr("Personal Link 3"));
			}
			//  80-2 replace tooltip value of description with value of called program
			setItemLabel("MY_LINKS.URL_PREF3", lvDesc.toString());
			lvProg = substring(getTask().getGoqrpls().gGetUprfLinksProg3(), toInt(1), toInt(100));
			//  80-2 replace tooltip value of description with value of called program
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF3',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF3", lvProg);
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc4();
			if ( upper(substring(lvDesc, toInt(1), toInt(11))).equals("YOUR FOURTH") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0055"), toStr("FORM"), toStr("Personal Link 4"));
			}
			setItemLabel("MY_LINKS.URL_PREF4", lvDesc.toString());
			//  80-2 replace tooltip value of description with value of called program
			lvProg = substring(getTask().getGoqrpls().gGetUprfLinksProg4(), toInt(1), toInt(100));
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF4',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF4", lvProg);
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc5();
			if ( upper(substring(lvDesc, toInt(1), toInt(10))).equals("YOUR FIFTH") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0056"), toStr("FORM"), toStr("Personal Link 5"));
			}
			setItemLabel("MY_LINKS.URL_PREF5", lvDesc.toString());
			//  80-2 replace tooltip value of description with value of called program
			lvProg = substring(getTask().getGoqrpls().gGetUprfLinksProg5(), toInt(1), toInt(100));
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF5',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF5", lvProg);
			// 
			lvDesc = getTask().getGoqrpls().gGetUprfLinksDesc6();
			if ( upper(substring(lvDesc, toInt(1), toInt(10))).equals("YOUR SIXTH") )
			{
				lvDesc = GNls.Fget(toStr("GUAGMNU-0057"), toStr("FORM"), toStr("Personal Link 6"));
			}
			setItemLabel("MY_LINKS.URL_PREF6", lvDesc.toString());
			//  80-2 replace tooltip value of description with value of called program
			lvProg = substring(getTask().getGoqrpls().gGetUprfLinksProg6(), toInt(1), toInt(100));
			//   SET_ITEM_PROPERTY('MY_LINKS.URL_PREF6',TOOLTIP_TEXT,lv_desc);
			setItemToolTip("MY_LINKS.URL_PREF6", lvProg);
		}

	
	/* Original PL/SQL code for Prog Unit QUERY_BROADCAST_MSGS
	
	PROCEDURE QUERY_BROADCAST_MSGS IS
  lv_return_location   VARCHAR2(90) := :SYSTEM.CURSOR_ITEM;
BEGIN
  DEFAULT_VALUE('','GLOBAL.LAST_BROADCAST_TIME');
  DEFAULT_VALUE('','GLOBAL.LAST_BROADCAST_DATETIME');
--
  GO_BLOCK('MESSAGES');
--
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
--
-- Get the lastest broadcast message
--
  IF :MESSAGES.ROWID IS NOT NULL THEN
--
    IF :GLOBAL.LAST_BROADCAST_TIME IS NULL THEN
      COPY(TO_CHAR(SYSDATE,'HH24MI'),'GLOBAL.LAST_BROADCAST_TIME');
      COPY(TO_CHAR(SYSDATE,'MMDDYYYYHH24MI'),'GLOBAL.LAST_BROADCAST_DATETIME');
--
      IF TO_DATE(TO_CHAR(:GURTKLR_TODO_DATE,'MMDDYYYY') ||
                 TO_CHAR(NVL(:GURTKLR_TODO_TIME,0),'0000'),'MMDDYYYYHH24MI') <= SYSDATE THEN
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',ENABLED,PROPERTY_TRUE);
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',LABEL,G$_NLS.Get('GUAGMNU-0058','FORM','New Broadcast Message'));
      ELSE
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',ENABLED,PROPERTY_FALSE);
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',LABEL,G$_NLS.Get('GUAGMNU-0059','FORM','Broadcast Message'));
      END IF;
--
    ELSE
      IF (TO_DATE(TO_CHAR(:GURTKLR_TODO_DATE,'MMDDYYYY') ||
                 TO_CHAR(NVL(:GURTKLR_TODO_TIME,0),'0000'),'MMDDYYYYHH24MI') 
          BETWEEN TO_DATE(:GLOBAL.LAST_BROADCAST_DATETIME,'MMDDYYYYHH24MI') AND SYSDATE)
      OR (:GURTKLR_ACTIVITY_DATE 
               > TO_DATE(:GLOBAL.LAST_BROADCAST_DATETIME,'MMDDYYYYHH24MI')) THEN
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',ENABLED,PROPERTY_TRUE);
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',LABEL,G$_NLS.Get('GUAGMNU-0060','FORM','New Broadcast Message'));
      ELSE
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',ENABLED,PROPERTY_FALSE);
        SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',LABEL,G$_NLS.Get('GUAGMNU-0061','FORM','Broadcast Message'));
      END IF;
--
      COPY(TO_CHAR(SYSDATE,'HH24MI'),'GLOBAL.LAST_BROADCAST_TIME');
      COPY(TO_CHAR(SYSDATE,'MMDDYYYYHH24MI'),'GLOBAL.LAST_BROADCAST_DATETIME');
    END IF;
--
-- No records.
--
  ELSE
    SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',ENABLED,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('ICONS.BROADCAST',LABEL,G$_NLS.Get('GUAGMNU-0062','FORM','Broadcast Message'));
    COPY(TO_CHAR(SYSDATE,'HH24MI'),'GLOBAL.LAST_BROADCAST_TIME');
    COPY(TO_CHAR(SYSDATE,'MMDDYYYYHH24MI'),'GLOBAL.LAST_BROADCAST_DATETIME');
  END IF;
--
  GO_ITEM(lv_return_location);
END;
	*/
	//ID:730
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void queryBroadcastMsgs(MessagesAdapter messagesElement)
		{
			NString lvReturnLocation = getCursorItem();
			setDefaultValue("", "GLOBAL.LAST_BROADCAST_TIME");
			setDefaultValue("", "GLOBAL.LAST_BROADCAST_DATETIME");
			// 
			goBlock(toStr("MESSAGES"));
			// 
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			executeQuery();
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
			// 
			//  Get the lastest broadcast message
			// 
			// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
			if ( !messagesElement.getRowState().equals(DataRowStatus.INSERTED) )
			{
				// 
				if ( getGlobal("LAST_BROADCAST_TIME").isNull() )
				{
					copy(toChar(NDate.getNow(), "HH24MI"),"GLOBAL.LAST_BROADCAST_TIME");
					copy(toChar(NDate.getNow(), "MMDDYYYYHH24MI"),"GLOBAL.LAST_BROADCAST_DATETIME");
					// 
					if ( toDate(toChar(messagesElement.getGurtklrTodoDate(), "MMDDYYYY").append(toChar(isNull(messagesElement.getGurtklrTodoTime(), 0), "0000")), "MMDDYYYYHH24MI").lesserOrEquals(NDate.getNow()) )
					{
						setMenuItemEnabled("ICONS.BROADCAST", true);
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.BROADCAST", SupportClasses.Property.LABEL, GNls.Fget(toStr("GUAGMNU-0058"), toStr("FORM"), toStr("New Broadcast Message")));
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
						
						
					}
					else {
						setMenuItemEnabled("ICONS.BROADCAST", false);
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.BROADCAST", SupportClasses.Property.LABEL, GNls.Fget(toStr("GUAGMNU-0059"), toStr("FORM"), toStr("Broadcast Message")));
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
						
						
					}
				}
				else {
					if ( (between(toDate(toChar(messagesElement.getGurtklrTodoDate(), "MMDDYYYY").append(toChar(isNull(messagesElement.getGurtklrTodoTime(), 0), "0000")), "MMDDYYYYHH24MI"), toDate(getGlobal("LAST_BROADCAST_DATETIME"), "MMDDYYYYHH24MI"), NDate.getNow())) || (messagesElement.getGurtklrActivityDate().greater(toDate(getGlobal("LAST_BROADCAST_DATETIME"), "MMDDYYYYHH24MI"))) )
					{
						setMenuItemEnabled("ICONS.BROADCAST", true);
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.BROADCAST", SupportClasses.Property.LABEL, GNls.Fget(toStr("GUAGMNU-0060"), toStr("FORM"), toStr("New Broadcast Message")));
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
						
						
					}
					else {
						setMenuItemEnabled("ICONS.BROADCAST", false);
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.BROADCAST", SupportClasses.Property.LABEL, GNls.Fget(toStr("GUAGMNU-0061"), toStr("FORM"), toStr("Broadcast Message")));
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
						
						
					}
					// 
					copy(toChar(NDate.getNow(), "HH24MI"),"GLOBAL.LAST_BROADCAST_TIME");
					copy(toChar(NDate.getNow(), "MMDDYYYYHH24MI"),"GLOBAL.LAST_BROADCAST_DATETIME");
				}
			}
			else {
				setMenuItemEnabled("ICONS.BROADCAST", false);
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
				//				SupportClasses.FORMS40.SetMenuItemProperty("ICONS.BROADCAST", SupportClasses.Property.LABEL, GNls.Fget(toStr("GUAGMNU-0062"), toStr("FORM"), toStr("Broadcast Message")));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
				
				
				copy(toChar(NDate.getNow(), "HH24MI"),"GLOBAL.LAST_BROADCAST_TIME");
				copy(toChar(NDate.getNow(), "MMDDYYYYHH24MI"),"GLOBAL.LAST_BROADCAST_DATETIME");
			}
			// 
			goItem(lvReturnLocation);
		}

	
	/* Original PL/SQL code for Prog Unit READ_IMAGE_FILES
	
	PROCEDURE READ_IMAGE_FILES IS
BEGIN
  READ_IMAGE_FILE('my_institution.gif','URL','MY_LINKS.MY_INST_IMAGE');
  READ_IMAGE_FILE('check.gif',         'URL','MY_LINKS.NEW_MESSAGE_IMAGE');
END;
	*/
	//ID:731
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void readImageFiles()
		{
			readImageFile("MY_LINKS.MY_INST_IMAGE", "my_institution.gif",  "URL");
			readImageFile("MY_LINKS.NEW_MESSAGE_IMAGE", "check.gif",  "URL");
		}

	
	/* Original PL/SQL code for Prog Unit SITEMAP_ADD_HIGHLIGHT
	
	PROCEDURE SITEMAP_ADD_HIGHLIGHT IS
	item_name VARCHAR2(61) := :SYSTEM.CURSOR_ITEM;
BEGIN
  IF (item_name IS NOT NULL) AND (item_name LIKE 'SITE_MAP%') THEN
    IF (GET_ITEM_PROPERTY(item_name,FONT_STYLE) = 'UNDERLINE') THEN
      SET_ITEM_PROPERTY(item_name,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WHDR_HILITE');
    ELSE
	    SET_ITEM_PROPERTY(item_name,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL_HILITE');
    END IF;
  END IF;
END;
	*/
	//ID:732
	/* <p>
/* </p>
		*/
		public void sitemapAddHighlight()
		{
			NString itemName = getCursorItem();
			if ( (!itemName.isNull()) && (like(itemName, "SITE_MAP%")) )
			{
				//if ((SupportClasses.FORMS40.GetItemProperty(itemName, fontStyle).equals("UNDERLINE")))
					if ((getItemStyleClass(itemName).equals("UNDERLINE")))
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					setItemStyleClass(itemName, "G$_NVA_SITEMAP_WHDR_HILITE");
				}
				else {
					setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL_HILITE");
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit SITEMAP_REMOVE_HIGHLIGHT
	
	PROCEDURE SITEMAP_REMOVE_HIGHLIGHT IS
	item_name VARCHAR2(61) := :SYSTEM.CURSOR_ITEM;
BEGIN
  IF (item_name IS NOT NULL) AND (item_name LIKE 'SITE_MAP%') THEN
    IF (GET_ITEM_PROPERTY(item_name,FONT_STYLE) = 'UNDERLINE') THEN
      SET_ITEM_PROPERTY(item_name,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WHDR');
    ELSE
	    SET_ITEM_PROPERTY(item_name,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    END IF;
  END IF;
END;
	*/
	//ID:733
	/* <p>
/* </p>
		*/
		public void sitemapRemoveHighlight()
		{
			NString itemName = getCursorItem();
			if ( (!itemName.isNull()) && (like(itemName, "SITE_MAP%")) )
			{
				//if ((SupportClasses.FORMS40.GetItemProperty(itemName, fontStyle).equals("UNDERLINE")))
				if ((getItemStyleClass(itemName).equals("UNDERLINE")))
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					setItemStyleClass(itemName, "G$_NVA_SITEMAP_WHDR");
				}
				else {
					setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit SITEMAP_SELECTION
	
	PROCEDURE SITEMAP_SELECTION IS
	item_name        VARCHAR2(30);
	parent_menu_obj  VARCHAR2(30); 
	parent_menu_desc VARCHAR2(80);
	child_menu_obj   VARCHAR2(30);
BEGIN
  item_name := NAME_IN('SYSTEM.CURSOR_ITEM');
  IF NAME_IN(ITEM_NAME) IS NULL THEN
    RETURN;
  END IF;
--
  parent_menu_obj  := NAME_IN(REPLACE(item_name,'DESC','OBJ'));
  parent_menu_desc := NAME_IN(item_name);
  child_menu_obj   := NAME_IN(REPLACE(item_name,'MAIN_DESC','DTL_OBJ'));
--
  :KEY_BLOCK.NEXT_SELECTION := parent_menu_obj;
--
  IF IS_RUNABLE(child_menu_obj) THEN
    :KEY_BLOCK.NEXT_SELECTION := '';
    CLEAR_MESSAGE;
    :KEY_BLOCK.NEXT_SELECTION := child_menu_obj;
    GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
    SHOW_VIEW('SITEMAP');
    EXECUTE_TRIGGER('CHECK_TYPE');
  ELSE
    IF parent_menu_obj = '*PROCESS' THEN
      EXECUTE_TRIGGER('WAS_PROCESS_MENU_LOADED');
--  	  
  	  IF child_menu_obj = '*PROCESS' THEN
  	    child_menu_obj := NULL;
  	  END IF;
    END IF;
--  	  
    NAVIGATE_TREE(child_menu_obj,parent_menu_obj);
    GO_BLOCK('TREE');
  END IF;
END;
	*/
	//ID:734
	/* <p>
/* </p>
		*/
		public void sitemapSelection()
		{
			NString itemName= NString.getNull();
			NString parentMenuObj= NString.getNull();
			NString parentMenuDesc= NString.getNull();
			NString childMenuObj= NString.getNull();
			itemName = getCursorItem();
			if ( getNameIn(itemName).isNull() )
			{
				return ;
			}
			// 
			parentMenuObj = getNameIn(replace(itemName, "DESC", "OBJ"));
			parentMenuDesc = getNameIn(itemName);
			childMenuObj = getNameIn(replace(itemName, "MAIN_DESC", "DTL_OBJ"));
			// 
			getFormModel().getKeyBlock().setNextSelection(parentMenuObj);
			// 
			if ( isRunable(childMenuObj).getValue() )
			{
				getFormModel().getKeyBlock().setNextSelection(toStr(""));
				clearMessage();
				getFormModel().getKeyBlock().setNextSelection(childMenuObj);
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
				showView("SITEMAP");
				executeAction("CHECK_TYPE");
			}
			else {
				if ( parentMenuObj.equals("*PROCESS") )
				{
					executeAction("WAS_PROCESS_MENU_LOADED");
					//   	  
					if ( childMenuObj.equals("*PROCESS") )
					{
						childMenuObj = toStr(null);
					}
				}
				//   	  
				navigateTree(childMenuObj, parentMenuObj);
				goBlock(toStr("TREE"));
			}
		}

	
	/* Original PL/SQL code for Prog Unit INVOKE_LINK
	
	PROCEDURE INVOKE_LINK (p_link VARCHAR2) IS
  lv_objt        VARCHAR2(200) := p_link;
  lv_objt_found  VARCHAR2(1)   := 'N';
--
  CURSOR find_objt_c(p_object VARCHAR2) IS
    SELECT 'Y'
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = p_object;
BEGIN
  IF INSTR(lv_objt,'://') = 0 THEN
--
    lv_objt := UPPER(lv_objt);
    OPEN find_objt_c(lv_objt);
    FETCH find_objt_c INTO lv_objt_found;
    CLOSE find_objt_c;
--
    IF NVL(lv_objt_found,'N') = 'Y' THEN
      :KEY_BLOCK.NEXT_SELECTION := lv_objt;
      EXECUTE_TRIGGER('CHECK_TYPE');
    ELSE
      IF G$_CHECK_ACCESS('GUAUPRF') THEN
        :KEY_BLOCK.NEXT_SELECTION := 'GUAUPRF';
        EXECUTE_TRIGGER('CHECK_TYPE');
      ELSE
        --MESSAGE('*ERROR* This is not a correct URL or Banner object.');
        MESSAGE(G$_NLS.Get('GUAGMNU-0063','FORM','*ERROR* This is not a correct URL or Banner object.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF;
--
  ELSE
    WEB.SHOW_DOCUMENT(lv_objt,'_blank');
  END IF;
END;
	*/
	//ID:735
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pLink
		*/
		public void invokeLink(NString pLink)
		{
			int rowCount = 0;
			NString lvObjt = pLink;
			NString lvObjtFound = toStr("N");
			String sqlfindObjtC = "SELECT 'Y' " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_P_OBJECT ";
			DataCursor findObjtC = new DataCursor(sqlfindObjtC);
			NString pObject = NString.getNull();
			try {
				if ( inStr(lvObjt, toStr("://")).equals(0) )
				{
					// 
					lvObjt = upper(lvObjt);
					pObject=lvObjt;
					//Setting query parameters
					findObjtC.addParameter("P_P_OBJECT", pObject);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findObjtC.
					findObjtC.open();
					ResultSet findObjtCResults = findObjtC.fetchInto();
					if ( findObjtCResults != null ) {
						lvObjtFound = findObjtCResults.getStr(0);
					}
					findObjtC.close();
					// 
					if ( isNull(lvObjtFound, "N").equals("Y") )
					{
						getFormModel().getKeyBlock().setNextSelection(lvObjt);
						executeAction("CHECK_TYPE");
					}
					else {
						if ( getTask().getGoqrpls().gCheckAccess(toStr("GUAUPRF")).getValue() )
						{
							getFormModel().getKeyBlock().setNextSelection(toStr("GUAUPRF"));
							executeAction("CHECK_TYPE");
						}
						else {
							// MESSAGE('*ERROR* This is not a correct URL or Banner object.');
							errorMessage(GNls.Fget(toStr("GUAGMNU-0063"), toStr("FORM"), toStr("*ERROR* This is not a correct URL or Banner object.")));
							throw new ApplicationException();
						}
					}
				}
				else {
					showDocument(lvObjt, "_blank");
				}
				}finally{
					findObjtC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit GET_CANVAS_COLORS
	
	PROCEDURE GET_CANVAS_COLORS IS
BEGIN
  :GLOBAL.UI_LINKS_COLOR   := G$_GET_UPRF_LINKS_CANVAS_COLOR;
  :GLOBAL.UI_MESSAGE_COLOR := G$_GET_UPRF_MSG_CANVAS_COLOR;
  :GLOBAL.UI_TREE_COLOR    := G$_GET_UPRF_TREE_CANVAS_COLOR;
END;
	*/
	//ID:736
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void getCanvasColors()
		{
			setGlobal("UI_LINKS_COLOR", getTask().getGoqrpls().gGetUprfLinksCanvasColor());
			setGlobal("UI_MESSAGE_COLOR", getTask().getGoqrpls().gGetUprfMsgCanvasColor());
			setGlobal("UI_TREE_COLOR", getTask().getGoqrpls().gGetUprfTreeCanvasColor());
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:737
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment>
NOTE: Start new procedure due to size limitations.

AUDIT TRAIL: 7.2
1.  SJQ 04/15/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
2.  SJQ 07/01/2005
    Increase the display length of the "welcome user" item to display longer names.
3.  SJQ 07/26/2005
    Change the properties on the product list item to not be navigable.  If the user clicks on
    the list button and selects a null value, the cursor was navigating to the item and causing
    the other canvases to disappear (104069).
4.  SJQ 09/06/2005
    Update the WHEN-TIMER-EXPIRED routine to call the G$_TIMER routine from the library which 
    contains timer logic.  The local trigger wasn't calling this correctly and any new timer
    logic added to the library wasn't being executed.  This was done to help with the issue when
    a user session times out.
5.  SJQ 09/08/2005
    Update the CONFIRM_B2K_EXIT routine to check if the GLOBAL.RESTART_SESSION is set to 'Y'.  
    If it is, then do the exit of banner without prompting.  This is set if the user session had
    timed out and they reconnected.  Update the WHEN-NEW-FORM-INSTANCE trigger to not execute the
    START_UP_MENU routine.  This routine was trying to delete a parameter from a parameter list
    which wasn't needed.  This also caused an error if the user didn't have a starting menu set
    as a user preference.  Removed the START_UP_MENU routine as it wasn't called by any other
    routine or trigger.  Updated the ON-ERROR trigger to check for errors which are caused by
    a disconnect from the database and have the user reconnect.  These changes were to address
    additional issues related to defect 75322.
6.  SJQ 09/28/2005
    Remove left over support for 'time' debugging message.  Change the GUAINIT form to take a new
    command line parameter to capture the statistics and save to the GURADDL table.

AUDIT TRAIL: 7.3
1.  SJQ 10/17/2005
    Add new routine, GET_CANVAS_COLORS, to load the different values for the menu canvas colors
    into globals.  Modify the SET_CANVAS_COLORS routine to use the new globals.  Modify the
    PRE-FORM to call the GET_CANVAS_COLORS routine before calling the SET_CANVAS_COLORS.  Modify
    the CALL_ROUTINE to call the SET_CANVAS_COLORS routine so that if the user went to the
    user preference form and changed any of the canvas colors, they would see the change.
2.  SJQ 10/18/2005
    Remove performance gathering calls to the DBMS_UTILITY package.
3.  SJQ 11/07/2005
    Update the auto hint for the "go item" to be consistent with the F5 navigation item.  Update
    the DO_FORM_CALL to populate several globals which were being set either in the GUAINIT 
    form or as part of the G$_SECURED_FORM_CALL.  This is to help improve start up time and
    form navigation.  Remove some commented out logic.  Rewrite several of the large IF-ELSE-THEN
    commands with CASE commands for improved performance.  Change the form to always show the
    message image (check mark) if there are any pending messages, not just the first time you 
    enter the menu.
4.  SJQ 12/09/2005
    Remove some old commented out code.
5.  SJQ 12/12/2005
    Rewrite the CHECK_TYPE trigger to replace some of the big IF commands with a CASE command.
    Rewrite the KEY-NEXT-ITEM trigger on the NEXT_SELECTION item to replace some of the big
    IF commands with a CASE command.  CASE commands are more efficient and faster.
6.  SJQ 02/24/2006
    Change the key block search button to have a default attribute of disabled and add logic to
    the WHEN-NEW-FORM-INSTANCE trigger to enable it once the cursor has moved to the "go to" item.
    This was done to address the issue where the cursor was not ending up in the "go to" item 
    when the menu first loaded.
7.  SJQ 02/28/2006
    Remove several occurances of 'SCT' from labels or messages.
8.  SJQ 03/14/2006
    Update the WHEN-NEW-FORM-INSTANCE trigger to check whether workflow is enabled before executing 
    the call to the workflow routine.
9.  SJQ 03/28/2006
    Update the SET_URL_ITEMS to check if the user is authorized to access the password form.  If 
    the user is not authorized, hide the link which invokes it.  Modify the INVOKE_LINK logic 
    that is executed when the user clicks on one of the user customizable links to launch the
    user preference form (if the user is authorized to access the form) when the object to be 
    launched cannot not be determined.
10. SJQ 04/13/2006
    Update the NAVIGATE_TREE procedure, when called by the SITE_MAP to change the icon for the
    folder, it's parent folder and the top level folder if they are not already set to the open
    folder icon.  Modify the CHECK_TYPE trigger to verify that the menu name entered is loaded
    via the product or personal menus.  If not, give the user an error message.

AUDIT TRAIL: 7.4
1.  TGK 08/22/2006
    Modify the INB Data Extract to no longer write to the GUBOUTP/GUROUTP tables.  GUBOUTD/GUROUTD have been
    created to support the intermediate collection of the INB Data Extract data.  Finance FGAGASB extract
    will continue to write to GUBOUTP/GUROUTP tables with General7.4.
    Modify POST-FORM to execute_trigger PURGE_DATA_EXTRACT_OUTD to remove data extract data for the session
    upon exit of this form.  Only if Finance is installed is there a need to do the same for PURGE_DATA_EXTRACT.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:738
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit RESTART_SESSION
	
	PROCEDURE RESTART_SESSION IS
BEGIN
  :GLOBAL.SET_INST := 'N';
  :GLOBAL.RESTART_SESSION := 'N';
--
  NEW_FORM('GUAINIT',NO_ROLLBACK,NO_QUERY_ONLY); 
END;
	*/
	//ID:739
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void restartSession()
		{
			setGlobal("SET_INST", toStr("N"));
			setGlobal("RESTART_SESSION", toStr("N"));
			// 
			newTask("GUAINIT", TaskServices.NO_ROLLBACK, TaskServices.NO_QUERY_ONLY);
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>

AUDIT TRAIL: 8.0    
1.  TGK 01/18/2007 
    Apply the following 7.4.0.1 modifications to 8.0
*************
START 7.4.0.1
1.  TGK 12/05/2006 (SJQ implemented by TGK)
    Created new procedure, RESTART_SESSION, to reset several globals and then issue a NEW_FORM command to
    the GUAINIT form.  This is to cause the user's session to be restarted after the user has experienced
    a disconnect from the database.  Need to start over from GUAINIT so that all appropriate session
    settings are set.  Modify the WHEN-TIMER-EXPIRED trigger to call the new RESTART_SESSION instead of
    simply exiting if caused by the RESTART_SESSION timer.  Modify the CONFIRM_B2K_EXIT routine to test
    if the GLOBAL.RESTART_SESSION is set to 'Y'.  If it is then call the RESTART_SESSION procedure.
    Modify DO_FORM_CALL, upon the return from the called form; call SET_PREFERENCES and QUERY_BROADCAST_MSGS
    only if not restarting session.  (1-9LQSB related)
END 7.4.0.1
***********
2.  George Shalovka  16 August 2007
    Modify Program Unit SET_URL_ITEMS to display the called item instead of
      the description, which is already displayed, for the six individual links in block MY_LINKS.
      Change consisted or replacing call to G$_GET_URL_LINKS_DESC with
      G$_GET_UPRF_LINKS_PROG.
3.  ShylajaS 16 Oct 2007
    Added G$_NLS.Get to support Internationalization requirement.
    Defect # 1-1ADJKV
4.  LvH 20-Oct-2007
    a. Updated WHEN-NEW-FORM-INSTANCE to display name instead of User Id upon Logon
    b. Updated WHEN_WINDOW_ACTIVATED_TRG to display time of last logon
    c. Updated CHECK-TYPE to ensure that only BANSECR users can access the *SECURITY menu
    d. Added ON-LOGOUT trigger to capture logoff times
5.  SanjibP 31 Oct 2007
		Defect # 1-2WKYEP
		Added one line code in POPULATE_ROOT_TREE after process menu is loaded
		i.e :FORM_HEADER.BP_POP:='Y'
6.  TGKinderman 11/07/2007
    Removed an old brand reference found in pl/sql unit CONFIRM_B2K_EXIT
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:740
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit G$_GET_UPRF_LINKS_PROG1
	
	FUNCTION G$_GET_UPRF_LINKS_PROG1 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_1EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;

	*/
	//ID:741
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg1()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_1EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = getTask().getGoqrpls().gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>

AUDIT TRAIL: 8.2    
1.  LVH 11/01/2008 
    Defect 1-3QTC97
    Increased the length of URL_MESSAGES to accomodate the label.
        
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:742
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAGMNU
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu May 05 16:30:53 2011
-- MSGSIGN : #8da66b1ee33491a9
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:743
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment>

AUDIT TRAIL: 8.3    
1.  SA  29/07/2009 
    Defect 1-3CXWU9
 Added Global variable EXIT_BANNER property value 'N' 
 in a CONFIRM_B2K_EXIT procedure of a program unit
 When lv_btn value is other than ALERT_BUTTON1.

AUDIT TRAIL END

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:744
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_2
	
	PROCEDURE AUDIT_TRAIL_8_3_0_2 IS
<multilinecomment>

AUDIT TRAIL: 8.3.0.2
  1. PSM 08-FEB-2010
    Defect 1-6S9QX9
    a) Item NEXT_SELECTION "Justification" and"Bevel" properties are modifed
       Justification = Start (default)
       Bevel =  lowered
    b) Canvas GO_CANVAS "Bevel" property is modifed
       Bevel =  None
       
  2.PSM 24-FEB-2010
    Defect 1-4PU0C5
    Modified trigger WHEN_WINDOW_ACTIVATED_TRG in order dispaly window title date 
    and time in long date format(DL) according to NLS Parameter setting.  

  3.LVH 19-MAR-2010
    Defect 1-8HWD8O 
    Moved the call to G$_GET_UPRF_LINKS_PROG3 in SET_URL_ITEMS to accomodate
    a URL in the third link to be longer than 100 characters.
    
AUDIT TRAIL END

</multilinecomment>
BEGIN
  NULL;
END; 
	*/
	//ID:745
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8302()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_5
	
	PROCEDURE AUDIT_TRAIL_8_3_0_5 IS
<multilinecomment>

AUDIT TRAIL: 8.3.0.5
  1.LVH 07-MAY-2010
    Defect 1-4YE8KO 
    Added an EXCEPTION to the ON-LOGOUT trigger since the call to 
    G$_SECURITY.g$_audit_banner_logoff is not valid during a restart.    
AUDIT TRAIL END

</multilinecomment>
BEGIN
  NULL;
END; 
	*/
	//ID:746
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8305()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_2
	
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment>
AUDIT TRAIL: 8.4.2
1. Defect 1-CSSTSL  
   TGKinderman  05/04/2011
   Problem: Database Extension Utility is to assure tables have certain columns (with appropriate data type/length).
   One of those columns is _USER_ID VARCHAR2(30).  Tables GUBOUTP and GUROUTP, created some time ago, were created
   with columns _USER_ID NUMBER. This column name collides with the intent of the Database Extension Utility.  
   Solution: Existing columns (_USER_ID NUMBER) are being renamed to GUBOUTP_USER_NUM and GUROUTP_USER_NUM, both of
   type NUMBER. Database Extension Utility can subsequently add column _USER_ID VARCHAR2(30) to both tables.
   
AUDIT TRAIL END 
</multilinecomment>

BEGIN
	NULL;
  
END;
	*/
	//ID:747
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail842()
		{
		}

	
	

}
