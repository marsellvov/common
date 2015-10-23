package net.hedtech.banner.general.common.Guqintf.services;

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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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

import net.hedtech.banner.general.common.Guqintf.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guqintf.model.*;



public class GuqintfServices extends AbstractSupportCodeObject{
	
	
	public GuqintfServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuqintfTask  getTask() {
		return (GuqintfTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guqintf.model.GuqintfModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE audit_trail_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1
1. Add logic for the RPOVLDT program for Financial Aid.  SQ 08/17/94
   Modify the STANDARD_CALL trigger to test if current job to
   execute is RPOVLDT and if so, execute customized trigger to
   build the host command rather than the standard one.  Also
   added BLD_HOST_COMMAND_RPOVLDT.
AUDIT TRAIL: 2.1.5
1. Add new security logic.                            SQ 08/10/95
2. Convertion to form 4.5                             NR 08/20/96
AUDIT TRAIL: 2.1.11
1. Added code to the following triggers for a Student NM 04/24/96
   form that runs on C report online: INS_PRUN, 
   JS_HOST_COMMANDS, and PIPEIT.  Created new trigger 
   INS_PRUN_SMRCMPL.
2. Remove logic in JS_HOST_COMMANDS that deal with    SQ 12/02/96
   vms and c programs.
3. Change student compliance to use HOST_COMMANDS     SQ 12/03/96
   instead of JS_HOST_COMMANDS.  Created shell script
   to be executed for compliance.
AUDIT TRAIL: 2.1.12
1. Added in trigger DISPLAY_MSG code to simulate interrupt  NR 12/18/96
   STOP and RESTART execution using OPEN_FORM of dummy form
   GUATEMP. (modified for RNANA97)
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:307
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. TM 03/20/97
   Changed WHEN_NEW_FORM_INSTANCE trigger so it no longer changes
   OPS$ to OPS\$ if the OPSYS = 'UNX'. This is now handled by
   gurjobs when it runs on unix platforms.
2. TM 05/15/97
   Added elsif logic to js_host_commands and host_commands
   program units to handle Windows NT(WNT).
3. TM 06/13/97
   1. Changed STANDARD_CALL and JS_HOST_COMMANDS to do a host command
      instead of using PIPEIT when GLOBAL.USER_INTERFACE = 'CHARMODE'
      and GLOBAL.CHARMODE_USER_GURJOBS (from gubinst) = 'N'
   2. Added new progunits to get an output directory name on the
      server if running thru gurjobs.
   3. DEFECT-4512. Made process_msg a multi-line item to resolve
      problem where only part of the message displayed in char mode.

AUDIT TRAIL: 3.1
1. SJQ 02/20/98
   Modify the pipeit logic to increase the size of the pipe, to use a global
   which contains the number of minutes to wait on the pipe, to purge the pipe
   prior to attempting to read it, add an additional status message to display
   for jobs which must wait for completion, add a moving display item so users
   know the program is still active.

AUDIT TRAIL: 4.0
1. AC	02/02/99
   Changed Postupdate trigger at gjbprun block to pre-update.

2. EPM 4/30/99
   Removed logic involved with global.charmode_use_gurjobs from JS_HOST_COMMAND 
   and STANDARD_CALL triggers.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:308
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:309
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit GET_HOME
	
	PROCEDURE GET_HOME IS
   HOME_IS        VARCHAR2(60);
   WHAT_OS        VARCHAR2(30);
   UPRF_STRING    VARCHAR2(30)  := 'GURJOBS_DIRECTORY';
--
 CURSOR GURUPRFC_REMOTE IS
 SELECT GURUPRF_VALUE FROM GURUPRF
  WHERE GURUPRF_USER_ID  = USER
    AND GURUPRF_GROUP    = 'JOBSUB'
    AND GURUPRF_KEY      = WHAT_OS
    AND GURUPRF_STRING   = UPRF_STRING;
BEGIN
--
-- Find the user profile which indicates where the user wants their 
-- batch output to go. This is the name of a directory somewhere.
--
   WHAT_OS := :GLOBAL.OS_IND;
   OPEN GURUPRFC_REMOTE;
   FETCH GURUPRFC_REMOTE INTO HOME_IS;
   IF GURUPRFC_REMOTE%NOTFOUND THEN
      :GLOBAL.GURJOBS_DIRECTORY := 'UNKNOWN';
   ELSE
      :GLOBAL.GURJOBS_DIRECTORY := HOME_IS;
   END IF;
   CLOSE GURUPRFC_REMOTE;

END;
	*/
	//ID:310
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void getHome()
		{
			int rowCount = 0;
			NString homeIs= NString.getNull();
			NString whatOs= NString.getNull();
			NString uprfString = toStr("GURJOBS_DIRECTORY");
			String sqlguruprfcRemote = "SELECT GURUPRF_VALUE " +
	" FROM GURUPRF " +
	" WHERE GURUPRF_USER_ID = USER AND GURUPRF_GROUP = 'JOBSUB' AND GURUPRF_KEY = :P_WHAT_OS AND GURUPRF_STRING = :P_UPRF_STRING ";
			DataCursor guruprfcRemote = new DataCursor(sqlguruprfcRemote);
			try {
				// 
				//  Find the user profile which indicates where the user wants their 
				//  batch output to go. This is the name of a directory somewhere.
				// 
				whatOs = getGlobal("OS_IND");
				//Setting query parameters
				guruprfcRemote.addParameter("P_WHAT_OS", whatOs);
				guruprfcRemote.addParameter("P_UPRF_STRING", uprfString);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable guruprfcRemote.
				guruprfcRemote.open();
				ResultSet guruprfcRemoteResults = guruprfcRemote.fetchInto();
				if ( guruprfcRemoteResults != null ) {
					homeIs = guruprfcRemoteResults.getStr(0);
				}
				if ( guruprfcRemote.notFound() )
				{
					setGlobal("GURJOBS_DIRECTORY", toStr("UNKNOWN"));
				}
				else {
					setGlobal("GURJOBS_DIRECTORY", homeIs);
				}
				guruprfcRemote.close();
				}finally{
					guruprfcRemote.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

AUDIT TRAIL: 4.2
1. KPATKAR 03/01/00
   Added a PRE_INSERT TRIGGER to the GJBPRUN block to
   correct defect 36180.
2. AP 03/29/00
   Modify the logic to look for Global_job_id = 'RPEDISB'
   when processing Global_call_form = TSASPAY in triggers
   WHEN_NEW_FORM_INSTANCE, D0_NEWFRM, INS_PRUN
   Modification done for A/R-Title IV enhancement
3. EDELANEY 3/22/00 
   Added new triggers for handing special command line parameters for smarqcm, when
   submitting online compliance.


AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:311
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:312
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_5
	
	PROCEDURE AUDIT_TRAIL_5_5 IS
<multilinecomment>
AUDIT TRAIL: 5.5
1. TM 07/08/2002
   Changed pipeit to check global.alt_pipe_name and use it if it has a value.
   This is used internally to test com and pl files on VMS and NT.
   alt_pipe_name is set via the zoatmtm form which also changes the global.opsys.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:313
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail55()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:314
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.1 
1.  G Shalovka  01 February 2005
    Correct defect 9900.
    Problem: Call to Financial Aid process RPBVLDT may not work properly
             and return unexpected Oracle error if user does not have 
             update premission for form GUQINTF.
    Solution:Add exception handling to trigger BLD_HOST_COMMAND_RPOVLDT
             so user will get informational error instead of Oracle error.
2.  G Shalovka  01 February 2005
    Correct defect 86919.
    Problem: Trigger When-New-Form-Instance has badly formed 'IF' statement
             which may prevent execution of subordinate code.
    Solution:Corrected trigger content.

AUDIT TRAIL: 7.2
1.  SJQ 05/12/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
    
AUDIT TRAIL: 7.4
1.  LVH 10/01/2006
    Change PIPEIT to include ::HomeMIFcode in command, if MIF Enabled
    
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:315
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
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
	//ID:316
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:317
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_5
	
	PROCEDURE AUDIT_TRAIL_7_5 IS
<multilinecomment>
AUDIT TRAIL: 7.5
1.  G Shalovka  20 Septemeber 2007
    Correct defect 1-DLI7Q.
    Problem: Potential to pass prohibited characters thru form items 
    					and routing improper commands	to command line.
    Solution:Modify form-level triggers JS_HOST_COMMANDS and STANDARD_CALL 
             	to call to new security procedure in package GOKPVAL
							to detect invalid characters and exit form while giving error message.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:318
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail75()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.1 
1. Eapen Mani 30 May 2008
   Defect:1-3K6141
   ISC Defect correction.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:319
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUQINTF
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Feb 17 09:12:30 2012
-- MSGSIGN : #ea21fa3cbd126647
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:320
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
1. TGKinderman 09/22/2009
   Modify in support of an AQ alternative communication mechanism to that of DBMS_PIPE.  As an alternative to
   form-level trigger PIPEIT, create pl/sql unit AQIT for enqueue of g_msg_fragments to the GURJOBS_Q queue.
2. TGKinderman 12/04/2009
   Minor adjustment to pl/sql unit AQIT as to the value of l_wait_factor.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:321
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AQIT
	
	PROCEDURE AQIT IS
  STATUS         NUMBER;
  MAX_WAIT       INTEGER := 15;
  MAX_SIZE       INTEGER := 8192;
  LOOP_NUM       INTEGER;
  LOOP_CNT       INTEGER := 0;
  X_POS          INTEGER := -2;
  COMMAND_TYPE   VARCHAR2(30) := 'WAIT';
  WHAT_PIPE      VARCHAR2(30) := 'GURJOBS';
  RETURN_PIPE    VARCHAR2(30);
  RETURN_MESSAGE VARCHAR2(200);
  SEND_REC_IND   VARCHAR2(1) := 'S';
  SHOW_STAT_IND  VARCHAR2(1) := 'N';
-- -- -- --
-- -- -- --
  l_queue_name        VARCHAR2(61)  := 'BANINST1.GURJOBS_Q';
  l_token             VARCHAR2(512);
  l_command_type      VARCHAR2(30);
  l_gurjobs_directory VARCHAR2(500) := 'XOXOXO';
  l_return_status     VARCHAR2(1)   := '1';
  l_max_wait          NUMBER;
  l_wait_factor       NUMBER;
-- -- -- --
-- -- -- --
--
BEGIN
  DEFAULT_VALUE('15','GLOBAL.MAX_WAIT_TIME');
  DEFAULT_VALUE('NONE','GLOBAL.ALT_PIPE_NAME');
  IF :GLOBAL.ALT_PIPE_NAME <> 'NONE' THEN
     WHAT_PIPE := :GLOBAL.ALT_PIPE_NAME;
  END IF;
  IF :GLOBAL.CALL_FORM = 'GJAPCTL' THEN
    COMMAND_TYPE := 'HOST';
    LOOP_NUM := 4;
  ELSE
    COMMAND_TYPE := 'WAIT';
    LOOP_NUM := TO_NUMBER(:GLOBAL.MAX_WAIT_TIME) * 4;
    SHOW_STAT_IND := 'Y';
  END IF;
--
  IF :GLOBAL.WAIT_UNTIL_DONE = 'Y' THEN
    LOOP_NUM := TO_NUMBER(:GLOBAL.MAX_WAIT_TIME) * 4;
    :GLOBAL.WAIT_UNTIL_DONE := 'N';
    SHOW_STAT_IND := 'Y';
  END IF;
--
  IF SHOW_STAT_IND = 'Y' THEN
    :PROCESS_STATUS :=  G$_NLS.Get('GUQINTF-0028', 'FORM','Status: Sending request.') ;
    SET_ITEM_PROPERTY('DUMMY.PROCESS_STATUS',DISPLAYED,PROPERTY_TRUE);
    SYNCHRONIZE;
  END IF;
--
-- Begin send logic.
-- -- -- --
-- -- -- --
  :GLOBAL.PIPE_TIMED_OUT := 'N';
  :GLOBAL.GURJOBS_PIPE_FAILED := 'N';
  l_token := GB_ADVQ_UTIL.F_GET_UNIQUE_TOKEN;
--
-- Check for MIF and pass campus code as part of COMMAND_TYPE. i.e. HOST::CAMP1 or
-- WAIT::CAMP1. gurjobs will parse the mif-code for later job execution.
--
  IF G$_VPDI_SECURITY.G$_IS_MIF_ENABLED THEN
  	COMMAND_TYPE := COMMAND_TYPE || '::' || G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC;
  END IF;
--
  l_command_type := COMMAND_TYPE;
  IF SUBSTR(COMMAND_TYPE,5,2) = '::' THEN
  	COMMAND_TYPE := SUBSTR(COMMAND_TYPE,1,4);
  END IF;
--
  IF :GLOBAL.GURJOBS_DIRECTORY IS NOT NULL THEN
    IF :GLOBAL.GURJOBS_DIRECTORY <> 'UNKNOWN' THEN
    l_gurjobs_directory := :GLOBAL.GURJOBS_DIRECTORY;
    END IF;
  END IF;
--
-- -- -- --
-- -- -- --
  G$_HANDSHAKE_AQ.P_HANDSHAKE_MSG_FRAGMENTS_ENQ(
                                         l_queue_name,
                                         l_return_status,
                                         l_token,
                                         sys.anydata.ConvertVARCHAR2(l_command_type),
                                         sys.anydata.ConvertVARCHAR2(:COMMAND_STRING),
                                         sys.anydata.ConvertVARCHAR2(l_gurjobs_directory));

-- -- -- --
-- -- -- --
  IF l_return_status <> '0' THEN 
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    IF l_return_status = '1' THEN
      MESSAGE(G$_NLS.Get('GUQINTF-0029','FORM','*ERROR* Unable to submit job. Verify gurjobs program is '||
                         'running and GURJOBS_Q queue is available.') );
    ELSE
      MESSAGE(G$_NLS.Get('GUQINTF-0030','FORM','*ERROR* The process has been interrupted, please try again.') );
    END IF;
    RETURN;
  END IF;
-- -- -- --
-- -- -- --
--
-- Begin receive logic.
--
  IF SHOW_STAT_IND = 'Y' THEN
    IF G$_ENV_IS_WINDOWS THEN
      :PROCESS_IND := 'v';
    END IF;
    :PROCESS_STATUS := G$_NLS.Get('GUQINTF-0031','FORM','Status: Waiting for completion.');
    SYNCHRONIZE;
  END IF;
--
  SEND_REC_IND := 'R';
-- -- -- --
-- -- -- --
-- --
-- -- l_max_wait and l_wait_factor values are multipled together inside the P_HANDSHAKE_MSG_FRAGMENTS_DEQ1 to
-- -- approximate the wait time of 60seconds (15 * 4) for HOST or 15mins (15 * 60) for WAIT jobs.
-- -- The actual operation occurs in gb_advq_util.p_dequeue_msg_fragments_condit.
  l_max_wait    := MAX_WAIT;
  l_wait_factor := LOOP_NUM;
  l_queue_name  := 'BANINST1.GURJOBS_RTN_Q';
-- --  
  G$_HANDSHAKE_AQ.P_HANDSHAKE_MSG_FRAGMENTS_DEQ1(l_queue_name,
                                                 l_token,
                                                 l_max_wait,
                                                 l_wait_factor,
                                                 l_return_status,
                                                 RETURN_MESSAGE);
-- -- -- --
-- -- -- --
  IF l_return_status <> '0' THEN 
    :GLOBAL.PIPE_TIMED_OUT := 'Y';
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    MESSAGE(G$_NLS.Get('GUQINTF-0032','FORM','*Warning* Timed out waiting for response from job submission program.') );
    RETURN;
  END IF;
  IF COMMAND_TYPE <> 'WAIT' THEN
    MESSAGE(RETURN_MESSAGE,NO_ACKNOWLEDGE);
  END IF;
--
-- -- -- --
-- -- -- --
EXCEPTION
  WHEN OTHERS THEN
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    IF SEND_REC_IND = 'S' THEN
      MESSAGE(G$_NLS.Get('GUQINTF-0033','FORM','*ERROR* Sending request caused: %01% %02%',
              TO_CHAR(SQLCODE), SUBSTR(SQLERRM,1,150)));
    ELSE
      MESSAGE(G$_NLS.Get('GUQINTF-0034','FORM','*ERROR* Receiving results caused: %01% %02%',
              TO_CHAR(SQLCODE), SUBSTR(SQLERRM,1,150)));
    END IF;
END;
	*/
	//ID:322
	/* <p>
/* </p>
		*/
		public void aqit()
		{
			NNumber status= NNumber.getNull();
			NInteger maxWait = toInt(15);
			NInteger maxSize = toInt(8192);
			NInteger loopNum= NInteger.getNull();
			NInteger loopCnt = toInt(0);
			NInteger xPos = new NInteger(-2);
			NString commandType = toStr("WAIT");
			NString whatPipe = toStr("GURJOBS");
			NString returnPipe= NString.getNull();
			NString returnMessage= NString.getNull();
			NString sendRecInd = toStr("S");
			NString showStatInd = toStr("N");
			//  -- -- --
			//  -- -- --
			NString lQueueName = toStr("BANINST1.GURJOBS_Q");
			NString lToken= NString.getNull();
			NString lCommandType= NString.getNull();
			NString lGurjobsDirectory = toStr("XOXOXO");
			NString lReturnStatus = toStr("1");
			NNumber lMaxWait= NNumber.getNull();
			NNumber lWaitFactor= NNumber.getNull();
			try
			{
				setDefaultValue("15", "GLOBAL.MAX_WAIT_TIME");
				setDefaultValue("NONE", "GLOBAL.ALT_PIPE_NAME");
				if ( getGlobal("ALT_PIPE_NAME").notEquals("NONE") )
				{
					whatPipe = getGlobal("ALT_PIPE_NAME");
				}
				if ( getGlobal("CALL_FORM").equals("GJAPCTL") )
				{
					commandType = toStr("HOST");
					loopNum = new NInteger(4);
				}
				else {
					commandType = toStr("WAIT");
					loopNum = new NInteger(toNumber(getGlobal("MAX_WAIT_TIME")).multiply(4));
					showStatInd = toStr("Y");
				}
				// 
				if ( getGlobal("WAIT_UNTIL_DONE").equals("Y") )
				{
					loopNum = new NInteger(toNumber(getGlobal("MAX_WAIT_TIME")).multiply(4));
					setGlobal("WAIT_UNTIL_DONE", toStr("N"));
					showStatInd = toStr("Y");
				}
				// 
				if ( showStatInd.equals("Y") )
				{
					getFormModel().getDummy().setProcessStatus(GNls.Fget(toStr("GUQINTF-0028"), toStr("FORM"), toStr("Status: Sending request.")));
					setItemVisible("DUMMY.PROCESS_STATUS", true);
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
				}
				// 
				//  Begin send logic.
				//  -- -- --
				//  -- -- --
				setGlobal("PIPE_TIMED_OUT", toStr("N"));
				setGlobal("GURJOBS_PIPE_FAILED", toStr("N"));
				lToken = GbAdvqUtil.fGetUniqueToken();
				// 
				//  Check for MIF and pass campus code as part of COMMAND_TYPE. i.e. HOST::CAMP1 or
				//  WAIT::CAMP1. gurjobs will parse the mif-code for later job execution.
				// 
				if ( GVpdiSecurity.FgIsMifEnabled().getValue() )
				{
					commandType = commandType.append("::").append(GVpdiSecurity.FgVpdiGetInstCodeFnc());
				}
				// 
				lCommandType = commandType;
				if ( substring(commandType, toInt(5), toInt(2)).equals("::") )
				{
					commandType = substring(commandType, toInt(1), toInt(4));
				}
				// 
				if ( !getGlobal("GURJOBS_DIRECTORY").isNull() )
				{
					if ( getGlobal("GURJOBS_DIRECTORY").notEquals("UNKNOWN") )
					{
						lGurjobsDirectory = getGlobal("GURJOBS_DIRECTORY");
					}
				}
				// 
				//  -- -- --
				//  -- -- --
				Ref<NString> pReturnStatus_ref = new Ref<NString>(lReturnStatus);
				getTask().getGoqrpls().getGHandshakeAq().pHandshakeMsgFragmentsEnq(lQueueName, pReturnStatus_ref, lToken, lCommandType, getFormModel().getDummy().getCommandString(), lGurjobsDirectory);
				lReturnStatus = pReturnStatus_ref.val;
				//  -- -- --
				//  -- -- --
				if ( lReturnStatus.notEquals("0") )
				{
					setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
					if ( lReturnStatus.equals("1") )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0029"), toStr("FORM"), toStr("*ERROR* Unable to submit job. Verify gurjobs program is ").append("running and GURJOBS_Q queue is available.")));
					}
					else {
						errorMessage(GNls.Fget(toStr("GUQINTF-0030"), toStr("FORM"), toStr("*ERROR* The process has been interrupted, please try again.")));
					}
					return ;
				}
				//  -- -- --
				//  -- -- --
				// 
				//  Begin receive logic.
				// 
				if ( showStatInd.equals("Y") )
				{
					if ( getTask().getGoqrpls().gEnvIsWindows().getValue() )
					{
						getFormModel().getDummy().setProcessInd(toStr("v"));
					}
					getFormModel().getDummy().setProcessStatus(GNls.Fget(toStr("GUQINTF-0031"), toStr("FORM"), toStr("Status: Waiting for completion.")));
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
				}
				// 
				sendRecInd = toStr("R");
				//  -- -- --
				//  -- -- --
				//  --
				//  -- l_max_wait and l_wait_factor values are multipled together inside the P_HANDSHAKE_MSG_FRAGMENTS_DEQ1 to
				//  -- approximate the wait time of 60seconds (15 * 4) for HOST or 15mins (15 * 60) for WAIT jobs.
				//  -- The actual operation occurs in gb_advq_util.p_dequeue_msg_fragments_condit.
				lMaxWait = toNumber(maxWait);
				lWaitFactor = toNumber(loopNum);
				lQueueName = toStr("BANINST1.GURJOBS_RTN_Q");
				//  --  
				pReturnStatus_ref = new Ref<NString>(lReturnStatus);
				Ref<NString> pResponse_ref = new Ref<NString>(returnMessage);
				getTask().getGoqrpls().getGHandshakeAq().pHandshakeMsgFragmentsDeq1(lQueueName, lToken, lMaxWait, lWaitFactor, pReturnStatus_ref, pResponse_ref);
				lReturnStatus = pReturnStatus_ref.val;
				returnMessage = pResponse_ref.val;
				//  -- -- --
				//  -- -- --
				if ( lReturnStatus.notEquals("0") )
				{
					setGlobal("PIPE_TIMED_OUT", toStr("Y"));
					setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
					warningMessage(GNls.Fget(toStr("GUQINTF-0032"), toStr("FORM"), toStr("*WARNING* Timed out waiting for response from job submission program.")));
					return ;
				}
				if ( commandType.notEquals("WAIT") )
				{
					message(returnMessage, OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
			}
			catch(Exception  e)
			{
				setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
				if ( sendRecInd.equals("S") )
				{
					errorMessage(GNls.Fget(toStr("GUQINTF-0033"), toStr("FORM"), toStr("*ERROR* Sending request caused: %01% %02%"), toChar(errorCode()), substring(errorMessage(), toInt(1), toInt(150))));
				}
				else {
					errorMessage(GNls.Fget(toStr("GUQINTF-0034"), toStr("FORM"), toStr("*ERROR* Receiving results caused: %01% %02%"), toChar(errorCode()), substring(errorMessage(), toInt(1), toInt(150))));
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_1
	
	PROCEDURE AUDIT_TRAIL_8_5_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.5.1
1. TGKinderman 02/17/2012
   Defect 1-12MT411
   In support of AR defect resolution for TSASPAY. Pass Enrollment Period (15 in length) values from TSASPAY form into the
   FinAid process RPEDISB. Modify block-level trigger GJBPRUN.INS_PRUN_RPEDISB to pass value through :GLOABL.PERIOD. HOLD_PERIOD
   item added to DUMMY block.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:323
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail851()
		{
		}

	
	

}
