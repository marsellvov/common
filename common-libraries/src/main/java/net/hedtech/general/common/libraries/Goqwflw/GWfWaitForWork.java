package net.hedtech.general.common.libraries.Goqwflw;

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
import morphis.foundations.extensions.assync.IAsyncJobContainer;
import morphis.foundations.extensions.assync.JobOptions;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.Exceptions.*;

public class GWfWaitForWork extends AbstractSupportCodeObject {
	

	public GWfWaitForWork(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_WAIT_FOR_WORK
	/*
	PACKAGE G$_WF_WAIT_FOR_WORK IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_WAIT_FOR_WORK provides the interfaces needed
  to enable a Banner session to launch the appropriate
  Banner object when a workflow task or activity is started,
  and to create, initialize, interrogate, reset and destroy
  as appropriate the constructs used by a Banner session
  to perform this function.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_INIT_GLOBALS creates and initializes all
  global variables that are needed to launch and execute
  a workflow task or activity.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_INIT_GLOBALS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure GET_ARGUMENT retrieves an argument from a string 
  of arguments
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION GET_ARGUMENT (ARG_STRING VARCHAR2, ARG_NAME VARCHAR2, PRE_DELIMITER VARCHAR2, POST_DELIMITER VARCHAR2 ) RETURN VARCHAR2;
 
<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_PERFORM_AUTO_LOGON automatically logs a
  user into a Banner session with his/her userid and password
  from Workflow if no other userid and password is specified.
  
  If a user is not starting a Banner session via Workflow,
  the default logon processing will occur.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_PERFORM_AUTO_LOGON;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_MAKE_TIMER creates, if the appropriate
  conditions are met, a timer that Banner uses
  to poll for workflow tasks and activities to perform.

  If the appropriate conditions are not met, the user is presented
  with an error message explaining why workflow tasks and
  activities will not be polled for.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_MAKE_TIMER;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_CHECK_MSG checks for messages from the
  action queue of Workflow and, if a message is received,
  sets the values of the affected constructs to the appropriate
  values and responds to the message as appropriate.

  The most common response to a message is to launch the
  requested Banner object as a workflow task or activity.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_CHECK_MSG;

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_CURR_WF_REQUEST_TYPE sets to a given value a
  variable which indicates whether Banner has received a
  request to perform a workflow task or activity.

  If the request to perform a workflow task has been received,
  then the variable will be set to 'T'.

  If the request to perform a workflow activity has been received,
  then the variable will be set to 'W'.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_CURR_WF_REQUEST_TYPE(type_in      VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure GET_CURR_WF_REQUEST_TYPE retrieves the current
  value of the variable which indicates whether Banner has
  received a request to perform a workflow task or activity.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GET_CURR_WF_REQUEST_TYPE RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  The procedure GET_CURR_B2K_OBJT_NAME retrieves the current
  value of the variable which indicates the Banner object
  name corresponding to the workflow task or activity that is
  currently in progress.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GET_CURR_B2K_OBJT_NAME RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  The procedure GET_CURR_B2K_OBJT_TYPE retrieves the current
  value of the variable which indicates the Banner object
  type corresponding to the workflow task or activity that is
  currently in progress.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GET_CURR_B2K_OBJT_TYPE RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  The procedure GET_CURR_WF_WORK_ID retrieves the current
  value of the variable which indicates the workflow activity
  ID corresponding to the workflow activity that is currently
  in progress.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GET_CURR_WF_WORK_ID RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  JGA
  The procedure GET_CURR_WF_TASK_ID is deprecated but needs to be here
  in case the version of GUAGMNU that the client is using still tries to call it.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GET_CURR_WF_TASK_ID RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_QF_FORMS sets to the appropriate values
  variables which indicate the first, last and current forms
  in a given QuickFlow.

  The current form of a QuickFlow is identified if the currently
  open form matches the name of one of the forms contained within
  the QuickFlow.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_QF_FORMS (qf_name_in   VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_DISCONNECT_B2K severs communications between
  a Banner session and Workflow, and will notify
  Workflow by default of the inavailability of the Banner
  session unless otherwise specified.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_DISCONNECT_B2K (notify_wf_in  BOOLEAN  DEFAULT NULL);

END G$_WF_WAIT_FOR_WORK;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_WAIT_FOR_WORK
		/*
		PACKAGE BODY G$_WF_WAIT_FOR_WORK IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_WAIT_FOR_WORK';

--*
--* Declare private subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure PERFORM_DEFAULT_LOGON performs the default Form
  Builder logon processing with a given userid, password and
  database connect string.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE PERFORM_DEFAULT_LOGON(aUserid        VARCHAR2,
                                 aPassword      VARCHAR2,
                                 aConnection    VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_CURR_B2K_OBJT_NAME sets to the appropriate
  value a variable which indicates the Banner object name
  corresponding to a given task ID for the workflow task or
  activity that is currently in progress.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_CURR_B2K_OBJT_NAME(task_name       VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_CURR_B2K_OBJT_TYPE sets to the appropriate
  value a variable which indicates the Banner object type
  corresponding to a given Banner object name.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_CURR_B2K_OBJT_TYPE(objt_name_in    VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_CURR_WF_WORK_ID sets to the appropriate
  value a variable which indicates the workflow activity
  ID corresponding to a given task ID for the workflow activity
  that is currently in progress.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_CURR_WF_WORK_ID   (work_id_in      VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure LAUNCH_B2K_OBJT launches a Banner object
  of a given name.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE LAUNCH_B2K_OBJT       (objt_name_in    VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure RELEASE_WF_TASK notifies Workflow that the
  Banner application is finished with a given workflow task ID.

  If the given workflow task ID is -1, the procedure additionally
  notifies Workflow that the Banner session with which
  it was communicating is no longer available.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RELEASE_WF_TASK       (work_id_in      VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_REINIT_GLOBALS reinitializes those global
  variables that are needed to launch and execute subsequent
  workflow tasks and activities after a task or activity
  has been performed.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_REINIT_GLOBALS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_DESTROY_TIMER destroys the timer that
  Banner uses to poll for workflow tasks and activities
  to perform.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_DESTROY_TIMER;

--*
--* Define public subprogram bodies
--*

 PROCEDURE WF_INIT_GLOBALS IS
  vcCurrSubprog   CONSTANT  VARCHAR2(30) := 'WF_INIT_GLOBALS';
  
 BEGIN
  DEFAULT_VALUE('' , 'GLOBAL.WF_LOG_FILE');
-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' BEGIN');
	
	DEFAULT_VALUE('Y', 'GLOBAL.DO_TRIGGER_TRACE');
	DEFAULT_VALUE('' , 'GLOBAL.WF_ARGS'); 
  	
  -- 5000-1 Set a default value for a new global to determine
  --        whether communication with Workflow has been
  --        established
  
  DEFAULT_VALUE('' , 'GLOBAL.WF_B2K_OBJT_NAME');
  DEFAULT_VALUE('' , 'GLOBAL.WF_B2K_OBJT_TYPE');

	DEFAULT_VALUE('' , 'GLOBAL.WF_PROXY_URL');	
	DEFAULT_VALUE('' , 'GLOBAL.WF_WORKFLOW_URL');	
	DEFAULT_VALUE('' , 'GLOBAL.WF_CLIENT_ID');	
	DEFAULT_VALUE('' , 'GLOBAL.WF_LOGON_USERNAME');	
	DEFAULT_VALUE('' , 'GLOBAL.WF_LOGON_PASSWORD');
	DEFAULT_VALUE('' , 'GLOBAL.WF_BANNER_CONNECTION');

  DEFAULT_VALUE('' , 'GLOBAL.WF_REQUEST_TYPE'); 
  DEFAULT_VALUE('' , 'GLOBAL.WF_WORK_ID');
  DEFAULT_VALUE('' , 'GLOBAL.WF_WORK_ACTIVITY_NAME');

  DEFAULT_VALUE('' , 'GLOBAL.WF_FIRST_QF_FORM');
  DEFAULT_VALUE('' , 'GLOBAL.WF_LAST_QF_FORM');
  DEFAULT_VALUE('' , 'GLOBAL.WF_CURRENT_QF_FORM');

  DEFAULT_VALUE('M', 'GLOBAL.WF_ACTIVITY');
  DEFAULT_VALUE('N', 'GLOBAL.WF_FOCUS_IS_SET');
  DEFAULT_VALUE('' , 'GLOBAL.WF_ORIG_WIN_STATE');
  DEFAULT_VALUE('' , 'GLOBAL.WF_ORIG_WIN_TITLE');
  DEFAULT_VALUE('N', 'GLOBAL.WF_CONTEXT_EXISTS');
  DEFAULT_VALUE('' , 'GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE');
  DEFAULT_VALUE('' , 'GLOBAL.WF_ORIG_FORM_VALIDATION');
  DEFAULT_VALUE('N', 'GLOBAL.WF_CONTEXT_POPULATED');
  DEFAULT_VALUE('N', 'GLOBAL.WF_LOCAL_RELEASE_EXISTS');
  DEFAULT_VALUE('N', 'GLOBAL.WF_LOCAL_SUBMIT_EXISTS');
  DEFAULT_VALUE('Y', 'GLOBAL.WF_PERFORM_COMMIT');
  DEFAULT_VALUE('N', 'GLOBAL.WF_SUBMITTED');
  DEFAULT_VALUE('' , 'GLOBAL.WF_APPL_TRANS_NO');
  DEFAULT_VALUE('' , 'GLOBAL.WF_ORIG_TRIGGER_TRACE');
  DEFAULT_VALUE('' , 'GLOBAL.IAMTICKET');
  
  -- VPD Begin 
 	
 	DEFAULT_VALUE('', 'GLOBAL.WF_VPDI_HOME_CODE');
 	DEFAULT_VALUE('', 'GLOBAL.WF_VPDI_ON');
 	
 	-- VPD End

  IF G$_WF_CONDITIONS.IS_INIT_FORM THEN

    -- If the current form is the General System Global Establishment Form,
    -- read the value of the form parameter that stores the value of the
    -- workflow incoming message pipe and sso pipe to the appropriate
    -- global variables to later employ it to establish communication
    -- with Workflow.

    --Parse WF_ARGS for used sub-arguments
    DECLARE
    	LV_IAMTICKET            VARCHAR2(60);
    	WF_ARGS_PARAM  					VARCHAR2(4000);
      WF_WORKFLOW_URL_PARAM 	VARCHAR2(2000);
      WF_PROXY_URL_PARAM			VARCHAR2(2000);
      WF_CLIENT_ID_PARAM			VARCHAR2(2000);
      WF_ARGS_PRE_DELIMITER   VARCHAR2(1) := '=';
      WF_ARGS_POST_DELIMITER  VARCHAR2(1) := '|';
      LOG_FILE 								VARCHAR2(255);
    BEGIN
    -- Grab the IAMTICKET off of the parameter that is coming in through the INIT_FORM
      LV_IAMTICKET := NAME_IN('PARAMETER.IAMTICKET');
      COPY (LV_IAMTICKET, 'GLOBAL.IAMTICKET'); 
    -- Once we depricate GLOBAL.WF_ACTIONQUEUE_IOR we will replace it in the next line with GLOBAL.WF_ARGS
      WF_ARGS_PARAM := NAME_IN('PARAMETER.WF_ACTIONQUEUE_IOR');
      COPY (WF_ARGS_PARAM , 'GLOBAL.WF_ARGS');
    --GET THE WF_URL ARG
      WF_WORKFLOW_URL_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'WF_URL', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
      COPY (WF_WORKFLOW_URL_PARAM , 'GLOBAL.WF_WORKFLOW_URL');
    --GET THE PROXY_URL ARG
      WF_PROXY_URL_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'PROXY_URL', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
      COPY (WF_PROXY_URL_PARAM , 'GLOBAL.WF_PROXY_URL');
    --GET THE CLIENT_ID ARG
      WF_CLIENT_ID_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'CLIENT_ID', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
 	  	COPY (WF_CLIENT_ID_PARAM , 'GLOBAL.WF_CLIENT_ID');
    --GET THE USERNAME TO LOGON AS TO REQUEST THE PROPER USER/PASS FROM    
      WF_CLIENT_ID_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'WF_LOGON_USERNAME', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
 		  COPY (WF_CLIENT_ID_PARAM , 'GLOBAL.WF_LOGON_USERNAME');
    --GET THE PASSWORD TO LOGON AS TO REQUEST THE PROPER USER/PASS FROM    
      WF_CLIENT_ID_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'WF_LOGON_PASSWORD', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
 	  	COPY (WF_CLIENT_ID_PARAM , 'GLOBAL.WF_LOGON_PASSWORD');
    --GET THE BANNER SESSION TO CONNECT TO    
      WF_CLIENT_ID_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'WF_BANNER_CONNECTION', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
 	  	COPY (WF_CLIENT_ID_PARAM , 'GLOBAL.WF_BANNER_CONNECTION');
 		-- GET THE BANNER VPDI Parameter     	
      WF_CLIENT_ID_PARAM := GET_ARGUMENT (WF_ARGS_PARAM, 'WF_VPDI_HOME_CODE', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER);
 		  COPY (WF_CLIENT_ID_PARAM , 'GLOBAL.WF_VPDI_HOME_CODE');

		-- Allow tracing to be turned on via parameters from Workflow.
		  LOG_FILE := GET_ARGUMENT(WF_ARGS_PARAM, 'LOG_FILE', WF_ARGS_PRE_DELIMITER, WF_ARGS_POST_DELIMITER );
		  IF LOG_FILE IS NOT NULL THEN
        COPY (LOG_FILE, 'GLOBAL.WF_LOG_FILE');
		  END IF;

    END;
   
  END IF;  --End condition of init form

-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' END');

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_INIT_GLOBALS;

------------------------
------------------------
<multilinecomment>  Gets a argument from a string of arguments in the form of arg1=value1|arg2=value2
 *    ARG_STRING - string containing all arguments that you want to retieve from
 *    ARG_NAME - name of argument... above example would be 'arg1' or 'arg2'
 *    PRE_DELIMITER - value's begining delimiting character before the value but after the argument name
 *    POST_DELIMITER -  value's ending delimiting character
 *
 </multilinecomment>

 FUNCTION GET_ARGUMENT (ARG_STRING VARCHAR2, ARG_NAME VARCHAR2, PRE_DELIMITER VARCHAR2, POST_DELIMITER VARCHAR2 ) RETURN VARCHAR2 IS
 		ARG_LOCATION 					PLS_INTEGER;
 		PRE_DELIM_LOCATION 		PLS_INTEGER;
 		POST_DELIM_LOCATION 	PLS_INTEGER;
  BEGIN
    --GET THE LOCATION OF THE ARGUMENT	
    ARG_LOCATION := INSTR(ARG_STRING, ARG_NAME);
    
    IF ARG_LOCATION = 0 THEN
    	RETURN NULL;
    END IF;
    
    --GET THE LOCATION OF THE FIRST PRE_DELIM AFTER THE LOCATION OF OUR ARGUMENT
    PRE_DELIM_LOCATION := INSTR(ARG_STRING, PRE_DELIMITER, ARG_LOCATION);
  	--GET THE LOCATION OF THE FIRST POST_DELIM AFTER THE LOCATION OF OUR PRE_DELIM
  	POST_DELIM_LOCATION := INSTR(ARG_STRING, POST_DELIMITER, PRE_DELIM_LOCATION);
    
    --IF I DIDN'T FIND THE POST DELIM, THIS VALUE MUST BE THE END OF THE STRING
    IF POST_DELIM_LOCATION = 0 THEN
			RETURN SUBSTR(ARG_STRING,PRE_DELIM_LOCATION + 1);
    ELSE	
			RETURN SUBSTR(ARG_STRING,PRE_DELIM_LOCATION + 1, POST_DELIM_LOCATION - PRE_DELIM_LOCATION - 1);
    END IF;
    
  END GET_ARGUMENT;
  
------------------------
------------------------

  FUNCTION VALIDATE_RETRIEVED_USER( vcRetrievedUser VARCHAR2, vcRetrievedPassword VARCHAR2 ) RETURN VARCHAR2 IS
  	vcErrMsg VARCHAR2(80) := null;
  BEGIN
    	-- Validates a retrieved user id.  If something doesn't validate
			-- returns the error msg otherwise null.
			--If the username is still the same as the WF_LOGON, the GET_USER_INFO Procedure didn't work.  We want to fail politely rather than try to log in with the sso user.
      IF vcRetrievedUser = NAME_IN('GLOBAL.WF_LOGON_USERNAME') THEN
        vcErrMsg := '*ERROR* Cannot obtain from Workflow a userid with which to log into Banner - Banner Workflow communication may be down.  Please contact your Workflow Administrator.';        
      END IF;
          
      IF vcRetrievedUser IS NULL OR vcRetrievedUser = '' THEN
        vcErrMsg := '*ERROR* Cannot obtain from Workflow a userid with which to log into Banner - Banner Workflow communication may be down.  Please contact your Workflow Administrator.';        
      END IF;     
    
      IF vcRetrievedPassword IS NULL OR vcRetrievedPassword = '' THEN
        vcErrMsg := '*ERROR* Cannot obtain from Workflow a user password with which to log into Banner - Banner Workflow communication  may be down.  Please contact your Workflow Administrator.';      
      END IF;
      
  		return vcErrMsg;
  END VALIDATE_RETRIEVED_USER;
------------------------
------------------------
 
 PROCEDURE WF_PERFORM_AUTO_LOGON IS
  vcCurrSubprog        CONSTANT  VARCHAR2(30)  := 'WF_PERFORM_AUTO_LOGON';
  vcSuppliedUserid               VARCHAR2(60);
  vcSuppliedPassword             VARCHAR2(60);
  vcSuppliedConnection           VARCHAR2(60);
  vcRetrievedUserid              VARCHAR2(60);
  vcRetrievedPassword            VARCHAR2(60);
  vcErrMsg                       VARCHAR2(80);
  excB2KLogonFailure             EXCEPTION;
	vpdiCodeMissing                EXCEPTION;
  vpdiCodeError                  EXCEPTION;
	iamNULLUserid                  EXCEPTION;
-- -- --
-- -- --
  lv_iamTicket                   VARCHAR2(60)  := NAME_IN('GLOBAL.IAMTICKET');
  lv_iamApplicationName          VARCHAR2(255);
  lv_iamUserid                   VARCHAR2(255);
  lv_iamPassword                 VARCHAR2(255);
  lv_iamAppConnectString         VARCHAR2(255);
-- -- --
-- -- --
 BEGIN
-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
   G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' BEGIN');
   IF G$_WF_CONDITIONS.IS_INIT_FORM THEN
     IF lv_iamTicket IS NOT NULL THEN
       G$_IAM_GET_CREDENTIALS(lv_iamTicket,
                              lv_iamApplicationName,
                              lv_iamUserid,
                              lv_iamPassword,
                              lv_iamAppConnectString);
       IF lv_iamUserid IS NULL THEN
         RAISE iamNULLUserid;
       END IF;
     END IF;
     IF G$_WF_CONDITIONS.CAN_CONNECT THEN
       IF lv_iamTicket IS NULL THEN
-- ****************** NON-IAM connection on behalf of Workflow is performed here
-- ******************
         -- If the name of the current operator is not known,
         -- communication between Workflow and this Banner
         -- session has indeed been established, and the current
         -- environment is a Web environment, then attempt to 
         -- retrieve the current operator's userid and password from
         -- Workflow. 
         -- Logon first as the passed banner user that has access to
         -- get the real Username/Password					
			   vcSuppliedConnection := NAME_IN('GLOBAL.WF_BANNER_CONNECTION');
         -- if WF didn't supply a connection, we want to use whatever
         -- the LOCAL environment variable might be.
         IF vcSuppliedConnection = '' THEN
           vcSuppliedConnection := NULL;
         END IF;
   -- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
   -- there is no connection to the database to be able to use the function.
         G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' Logging in as the SSO account ' || NAME_IN('GLOBAL.WF_LOGON_USERNAME') );
         -- Log in as the sso user.  The sso user only logs in to make
         -- http request to Workflow and decrypt the username and password
         -- that workflow returns to us.  For higher security, one could
         -- replace the use of the WF_LOGON_USERNAME and WF_LOGON_PASSWORD
         -- with actual hardcoded SSO username and password.  This frees
         -- the pll from having to get this information passed to it as an
         -- argument from workflow.  You can then secure it by only keeping
         -- a complied version of this form
         PERFORM_DEFAULT_LOGON(NAME_IN('GLOBAL.WF_LOGON_USERNAME'), NAME_IN('GLOBAL.WF_LOGON_PASSWORD'), vcSuppliedConnection);      
         G$_WF_BA.GET_USER_INFO( vcRetrievedUserid, vcRetrievedPassword );
   -- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
   -- there is no connection to the database to be able to use the function.
         G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' vcRetrievedUserid := ' || vcRetrievedUserid );
         -- FIRST WE NEED TO LOG OUT OF THE CURRENT USER THAT GOT OUR WORKFLOW
         -- USER/PASS FOR US     This has been moved up higher to ensure that
         -- a LOGOUT is called prior to any of the possible exceptions that can
         -- be raised.
         LOGOUT;
         vcErrMsg := VALIDATE_RETRIEVED_USER( vcRetrievedUserid, vcRetrievedPassword );
         IF (vcErrMsg IS NOT NULL) THEN
           vcRetrievedUserid := NULL;
           vcRetrievedPassword := NULL;
           vcSuppliedConnection := NULL;
           RAISE excB2KLogonFailure;      	
         END IF;
         -- If the current operator's userid and password were successfully
         -- retrieved from Workflow, then attempt to log the operator 
         -- into this Banner session with the retrieved userid and
         -- password, as well as the database connect string of
         -- the current operator.      
         PERFORM_DEFAULT_LOGON(vcRetrievedUserid, vcRetrievedPassword, vcSuppliedConnection);
-- ******************
-- ******************
       ELSE
         PERFORM_DEFAULT_LOGON(lv_iamUserid,
                               lv_iamPassword,
                               lv_iamAppConnectString);
       END IF;
       -- VPDI After Logon on behalf of Workflow (whether it is IAM or NON-IAM way)
       IF g$_vpdi_security.g$_is_mif_enabled() THEN
         COPY ('Y', 'GLOBAL.WF_VPDI_ON');  -- sets the MIF state
         IF NAME_IN('GLOBAL.WF_VPDI_HOME_CODE') IS NOT NULL THEN					
           COPY( NAME_IN( 'GLOBAL.WF_VPDI_HOME_CODE' ), 'PARAMETER.VPDI_CODE' );
         END IF;
       END IF;				
	  	 -- VPDI END
     ELSE
       IF lv_iamTicket IS NOT NULL THEN
         PERFORM_DEFAULT_LOGON(lv_iamUserid,
                               lv_iamPassword,
                               lv_iamAppConnectString);
       ELSE
         vcSuppliedUserid      := GET_APPLICATION_PROPERTY(USERNAME);
         vcSuppliedPassword    := GET_APPLICATION_PROPERTY(PASSWORD);
         vcSuppliedConnection  := GET_APPLICATION_PROPERTY(CONNECT_STRING);
         IF vcSuppliedUserid IS NOT NULL THEN
           -- If the userid of the current operator is known, attempt
           -- to log that operator into a Banner session with
           -- his/her userid, password and database connect string 
           -- using default logon processing. 
   -- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
   -- there is no connection to the database to be able to use the function.
           G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' Attempting to log on as user passed value: ' || vcSuppliedUserid );
           PERFORM_DEFAULT_LOGON(vcSuppliedUserid,vcSuppliedPassword,vcSuppliedConnection); 
         ELSE
           -- If the userid of the current operator is not known attempt
           -- to display the default Form Builder logon screen to request
           -- valid logon parameters.
           vcSuppliedUserid     := NULL;
           vcSuppliedPassword   := NULL;
           vcSuppliedConnection := NULL;
           LOGON_SCREEN;
           vcSuppliedUserid      := GET_APPLICATION_PROPERTY(USERNAME);
           vcSuppliedPassword    := GET_APPLICATION_PROPERTY(PASSWORD);
           vcSuppliedConnection  := GET_APPLICATION_PROPERTY(CONNECT_STRING);
           -- Attempt to perform default logon processing
           -- using the parameters requested.
           PERFORM_DEFAULT_LOGON(vcSuppliedUserid,vcSuppliedPassword,vcSuppliedConnection);
         END IF;
       END IF;
     END IF;   	
   END IF;
-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
   G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' END');

 EXCEPTION
   WHEN excB2KLogonFailure THEN
     G$_WF_SET_FOCUS.RESTORE_WINDOW;
     G$_WF_SET_FOCUS.SET_FOCUS;
     IF vcErrMsg IS NOT NULL THEN
       G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'ALERT',FALSE,TRUE);
       vcErrMsg := NULL;
     END IF;
   WHEN iamNULLUserid THEN
   -- Note:  The following string is not wrappered with G$_NLS.Get function because at this point (when this
   -- exeception is raised) there is no connection to the database to be able to use the function.
     G$_WF_ERROR.SHOW_EXCEPTION('*ERROR* IAM SSO Failure. Contact Security Administrator.',vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
   WHEN OTHERS THEN
     G$_WF_SET_FOCUS.RESTORE_WINDOW;
     G$_WF_SET_FOCUS.SET_FOCUS;
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
 END WF_PERFORM_AUTO_LOGON;

---------------------
---------------------

 PROCEDURE WF_MAKE_TIMER IS

  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'WF_MAKE_TIMER';
  vcErrMsg                 VARCHAR2(160);
  WFTimerID                TIMER;
  excWFLinkFailure         EXCEPTION;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0283','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_MENU_FORM THEN

    -- If the current form is the General Menu Application Form,
    -- disable all iconic toolbar buttons that relate to Workflow
    -- or Workflow Electronic Documents.

		G$_WF_ICONS.WF_DISABLE_ICONS;

    -- 5000-1 Updated following IF statement to evaluate IS_ACTIONQUEUE_IOR_SET
    --        instead of ACTIONQUEUE_IOR_STR_ACQUIRED, as the actionqueue IOR
    --        should have already been set under the appropriate conditions
    --        prior to WF_MAKE_TIMER being called.

    IF G$_WF_CONDITIONS.CAN_CONNECT THEN
    	
       -- If a communications gateway has been established between
       -- Workflow and this Banner session, evaluate
       -- the conditions under which the creation of a timer to
       -- poll for workflow tasks and activities is permissible.
       --
       -- If any of these conditions are not met, present the user
       -- with the appropriate error message.

       -- 5000-1 Removed the tests for whether the current environment
       --        supports Workflow interoperation or whether the Workflow
       --        interface object can be found.  Also removed the
       --        call to set the actionqueue IOR.
       --
       --        This logic is now being performed as part of the new
       --        WF_SET_ACTIONQUEUE_IOR procedure.

       IF NOT goksyst.F_IsSystemLinkEnabled('WORKFLOW') THEN
         vcErrMsg := G$_NLS.Get('GOQWFLW-0284','LIB','*ERROR* Communication with Workflow is not available because it is institutionally disabled.');
         RAISE excWFLinkFailure;
       END IF;

       -- If the above conditions are met, create a timer to poll
       -- for workflow tasks and activities to perform.

       WFTimerID := FIND_TIMER(G$_WF_HEADER.TM_NAME);

       IF ID_NULL(WFTimerID) THEN
         WFTimerID := CREATE_TIMER(G$_WF_HEADER.TM_NAME,G$_WF_HEADER.TIME_INTERVAL,REPEAT);
       END IF;

     END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0285','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN excWFLinkFailure THEN
     G$_WF_SET_FOCUS.RESTORE_WINDOW;
     G$_WF_SET_FOCUS.SET_FOCUS;
     
     IF vcErrMsg IS NOT NULL THEN
       G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);
       G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);
       CLEAR_MESSAGE;
       vcErrMsg := NULL;
     END IF;

   WHEN OTHERS THEN
     G$_WF_SET_FOCUS.RESTORE_WINDOW;
     G$_WF_SET_FOCUS.SET_FOCUS;
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_MAKE_TIMER;

---------------------
---------------------

 PROCEDURE WF_CHECK_MSG IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'WF_CHECK_MSG';
  currWorkID               VARCHAR2(4000);
  currActivityName         VARCHAR2(4000);
  vcCurrTaskForm           VARCHAR2(255);
  vcErrMsg                 VARCHAR2(160);
  excB2KConfirmExit        EXCEPTION;
  excExitProcedure         EXCEPTION;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0286','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_MENU_FORM THEN

    -- If the current form is the General Menu Application Form,
    -- check the workflow action queue by retrieving the current
    -- workflow workitem ID.

    G$_WF_BA.GET_WORK( currWorkID, vcCurrTaskForm,  currActivityName);

    --copy the activityname into a global
    COPY(currActivityName,'GLOBAL.WF_WORK_ACTIVITY_NAME');

    -- If the workflow task ID retrieved is non-null, then Workflow
    -- has requested that Banner perform an action.
    IF currWorkID <> 'no_work' THEN

      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0287','LIB','%01%.%02%: The retrieved non-null work id = ''%03%''',vcCurrProgUnit,vcCurrSubprog,currWorkID));

      IF currWorkID = 'wf_logged_off' THEN

        -- If the current task ID is 'wf_logged_off', then Workflow has been exited or logged off.
        --
        -- Present the user with an alert asking whether the user now wants to
        -- exit Banner as well.

        RAISE excB2KConfirmExit;
      END IF;

      -- If the current task ID is nonzero but not -1, then Workflow has a workflow
      -- task or activity for Banner to perform.
      

      -- Assume for now that the request is to perform a workflow task until otherwise
      -- determined.

      SET_CURR_WF_REQUEST_TYPE('T');

      -- Retrieve and store the Banner object name corresponding to the workflow task ID.

      SET_CURR_B2K_OBJT_NAME(vcCurrTaskForm);

      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0288','LIB','%01%.%02%:The retrieved object name = ''%03%''',vcCurrProgUnit,vcCurrSubprog,GET_CURR_B2K_OBJT_NAME));

      IF NVL(GET_CURR_B2K_OBJT_NAME,'NONE') = 'NONE' THEN

        -- If no Banner object name could be located, present the user with an
        -- appropriate error message.

        vcErrMsg := G$_NLS.Get('GOQWFLW-0289','LIB','*ERROR* Unable to find an executable ID for the task or activity received from Workflow.');
        RAISE excExitProcedure;
      END IF;

      -- Retrieve and store the Banner object type corresponding to the name of
      -- the Banner object that has been requested to be launched.

      SET_CURR_B2K_OBJT_TYPE(GET_CURR_B2K_OBJT_NAME);

      IF NVL(GET_CURR_B2K_OBJT_TYPE,'NONE') = 'NONE' THEN

        -- If the requested Banner object is not of a valid object type,
        -- present the user with an appropriate error message.

        vcErrMsg := G$_NLS.Get('GOQWFLW-0290','LIB','*ERROR* The executable ID for this Workflow task or activity, ''%01%'', is an invalid Banner object.',GET_CURR_B2K_OBJT_NAME);
        RAISE excExitProcedure;
      END IF;

      IF NOT G$_WF_CONDITIONS.IS_FORM AND
         NOT G$_WF_CONDITIONS.IS_PROCESS AND
         NOT G$_WF_CONDITIONS.IS_QUICKFLOW THEN

        -- If the requested Banner object is not a supported object type
        -- for performing workflow tasks or activities, present the user
        -- with an appropriate error message.

        vcErrMsg := G$_NLS.Get('GOQWFLW-0291','LIB','*ERROR* Banner objects of type %01% cannot be launched as Workflow activities.',GET_CURR_B2K_OBJT_TYPE);
        RAISE excExitProcedure;
      END IF;

      SET_CURR_WF_REQUEST_TYPE('W');
      SET_CURR_WF_WORK_ID(currWorkID);

      IF NVL(GET_CURR_WF_WORK_ID,'NONE') = 'NONE' THEN

          -- If no workflow activity ID could be located, present the user
          -- with an appropriate error message.

        vcErrMsg := G$_NLS.Get('GOQWFLW-0292','LIB','*ERROR* Unable to find a work ID for the activity received from Workflow.');
        RAISE excExitProcedure;
      END IF;

      IF NOT G$_WF_CONDITIONS.IS_FORM AND
         NOT G$_WF_CONDITIONS.IS_PROCESS THEN

          -- If the requested Banner object is not a supported object type
          -- for performing workflow activities, present the user with
          -- an appropriate error message.

        vcErrMsg := G$_NLS.Get('GOQWFLW-0293','LIB','*ERROR* Banner objects of type %01% cannot be launched as Workflow activities.',GET_CURR_B2K_OBJT_TYPE);
        RAISE excExitProcedure;
      END IF;

      IF G$_WF_CONDITIONS.IS_QUICKFLOW THEN

          -- If the requested Banner object is a QuickFlow, retrieve and store
          -- the names of the first, last and current forms in the QuickFlow.

        SET_QF_FORMS(GET_CURR_B2K_OBJT_NAME);

        IF NVL(NAME_IN('GLOBAL.WF_FIRST_QF_FORM'),'NONE')   = 'NONE' OR
           NVL(NAME_IN('GLOBAL.WF_LAST_QF_FORM'),'NONE')    = 'NONE' OR
           NVL(NAME_IN('GLOBAL.WF_CURRENT_QF_FORM'),'NONE') = 'NONE' THEN

            -- If the names of the forms contained within the QuickFlow could not
            -- be located, present the user with an appropriate error message.

          vcErrMsg := G$_NLS.Get('GOQWFLW-0294','LIB','*ERROR* Unable to find the forms associated with this QuickFlow activity.');
          RAISE excExitProcedure;
        END IF;

      END IF;


      -- Restore the MDI window of the Banner application and launch the
      -- appropriate Banner object.

      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0295','LIB','%01%.%02%: About to restore window.',vcCurrProgUnit,vcCurrSubprog));

      G$_WF_SET_FOCUS.RESTORE_WINDOW;

      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0296','LIB','%01%.%02%: About to launch form.',vcCurrProgUnit,vcCurrSubprog));

      LAUNCH_B2K_OBJT(GET_CURR_B2K_OBJT_NAME);
			G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0297','LIB','%01%.%02%: Completed launch.',vcCurrProgUnit,vcCurrSubprog));

      IF G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN

        -- Upon exiting the launched Banner object, if
        -- the object was launched as a workflow task or
        -- it was launched as a workflow activity that
        -- was subsequently submitted, minimize the MDI
        -- window of the Banner application.

        G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0298','LIB','%01%.%02%: About to minimize window.',vcCurrProgUnit,vcCurrSubprog));

				G$_WF_SET_FOCUS.MINIMIZE_WINDOW;

      END IF;

      --IF NOT G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN

        -- If the object was launched as a workflow task or
        -- it was launched as a workflow activity that
        -- was not subsequently submitted, explicitly notify
        -- Workflow that Banner is finished with
        -- the workflow task ID that is associated with
        -- the object that was launched.
        --RELEASE_WF_TASK(currWorkID);
        --
        -- RDR - Not sure why this is commentted out other than
        --       Workflow no longer supports "task" launching
        --       as of Workflow 3.x
      --END IF;

      -- Reinitialize the appropriate Workflow-specific global variables
      -- in preparation for the next request to perform a workflow
      -- task or activity.

      WF_REINIT_GLOBALS;

      currWorkID := NULL;

    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0299','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN excB2KConfirmExit THEN

     -- Restore and set focus upon the MDI window of
     -- the Banner application.

     G$_WF_SET_FOCUS.RESTORE_WINDOW;

     G$_WF_SET_FOCUS.SET_FOCUS;

     -- Sever communications between Workflow and
     -- this Banner session, but do not notify
     -- Workflow that the session is no longer available.
     --
     -- Communications must be severed because:
     --
     -- 1) if Workflow is exited, then there is no application
     --    with which to communicate, and
     --
     -- 2) if Workflow is logged off, there is no guarantee
     --    that the Workflow user will log back into Workflow
     --    with a user id that has permission to invoke the
     --    currently open Banner session using the previous
     --    user's permissions.
     --
     -- The notification to Workflow of the inavailability
     -- of Banner is not necessary, since this branch of logic
     -- only executes if Workflow has already been exited
     -- or logged off.

     WF_DISCONNECT_B2K(FALSE);

     currWorkID := NULL;

     -- Exit this Banner session if the user chooses to do so.
     -- Otherwise, notify the user that communication with Workflow
     -- is no longer available.

     IF G$_DISPLAY_ALERT(G$_WF_HEADER.MENU_FORM_QUIT_ALERT,G$_NLS.Get('GOQWFLW-0300','LIB','Do you want to exit this Banner session?')) = ALERT_BUTTON1 THEN
       COPY(NULL,G$_WF_HEADER.MENU_FORM_KEY_ITM);
       G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;

     ELSE
       G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0301','LIB','*NOTE* This Banner session will no longer communicate with Workflow.'),'MESSAGE',FALSE,FALSE);

     END IF;

   WHEN excExitProcedure THEN

     G$_WF_SET_FOCUS.RESTORE_WINDOW;

     G$_WF_SET_FOCUS.SET_FOCUS;

     IF vcErrMsg IS NOT NULL THEN

       G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);
       G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);

       CLEAR_MESSAGE;

       vcErrMsg := NULL;

     END IF;

     G$_WF_SET_FOCUS.MINIMIZE_WINDOW;

     IF currWorkID <> NULL THEN
       RELEASE_WF_TASK(currWorkID);
       currWorkID := NULL;
     END IF;

     WF_REINIT_GLOBALS;

   WHEN OTHERS THEN
     G$_WF_SET_FOCUS.RESTORE_WINDOW;
     G$_WF_SET_FOCUS.SET_FOCUS;
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
     G$_WF_SET_FOCUS.MINIMIZE_WINDOW;

     IF currWorkID <> NULL THEN
       RELEASE_WF_TASK(currWorkID);
       currWorkID := NULL;
     END IF;

     WF_REINIT_GLOBALS;

 END WF_CHECK_MSG;

----------------------
----------------------

 PROCEDURE SET_CURR_WF_REQUEST_TYPE(type_in  VARCHAR2) IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'SET_CURR_WF_REQUEST_TYPE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  COPY(type_in,'GLOBAL.WF_REQUEST_TYPE');

 END SET_CURR_WF_REQUEST_TYPE;

----------------------
----------------------

 FUNCTION GET_CURR_WF_REQUEST_TYPE RETURN VARCHAR2 IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'GET_CURR_WF_REQUEST_TYPE';
  vcRequestType            VARCHAR2(255);

 BEGIN  
	vcRequestType := NAME_IN('GLOBAL.WF_REQUEST_TYPE');
	G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' - vcRequestType := ' || vcRequestType );
  RETURN( vcRequestType );

 END GET_CURR_WF_REQUEST_TYPE;

----------------------
----------------------

 FUNCTION GET_CURR_B2K_OBJT_NAME RETURN VARCHAR2 IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'GET_CURR_B2K_OBJT_NAME';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' - GLOBAL.WF_B2K_OBJT_NAME: ' || NVL(NAME_IN('GLOBAL.WF_B2K_OBJT_NAME'),'NULL'));
  RETURN( NAME_IN('GLOBAL.WF_B2K_OBJT_NAME') );

 END GET_CURR_B2K_OBJT_NAME;

----------------------
----------------------

 FUNCTION GET_CURR_B2K_OBJT_TYPE RETURN VARCHAR2 IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'GET_CURR_B2K_OBJT_TYPE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN( NAME_IN('GLOBAL.WF_B2K_OBJT_TYPE') );

 END GET_CURR_B2K_OBJT_TYPE;

----------------------
----------------------

 FUNCTION GET_CURR_WF_WORK_ID RETURN VARCHAR2 IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'GET_CURR_WF_WORK_ID';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN ( NAME_IN('GLOBAL.WF_WORK_ID') );

 END GET_CURR_WF_WORK_ID;

----------------------
----------------------
--Deprecated... value returned is only here for older versions of GUAGMNU that use it
 FUNCTION GET_CURR_WF_TASK_ID RETURN PLS_INTEGER IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'GET_CURR_WF_TASK_ID';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN 0;

 END GET_CURR_WF_TASK_ID;

----------------------
----------------------

 PROCEDURE SET_QF_FORMS(qf_name_in  VARCHAR2) IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'SET_QF_FORMS';

  CURSOR GetFormsForQF_C(qf_name VARCHAR2) IS
   SELECT GURCALL_FORM
     FROM GURCALL
    WHERE GURCALL_CALL_CODE = qf_name
    ORDER BY GURCALL_SEQNO;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0302','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  COPY('NONE','GLOBAL.WF_CURRENT_QF_FORM');

  FOR FormsForQF_REC IN GetFormsForQF_C(qf_name_in) LOOP

      IF NAME_IN('SYSTEM.CURRENT_FORM') = FormsForQF_REC.GURCALL_FORM THEN
        COPY(FormsForQF_REC.GURCALL_FORM, 'GLOBAL.WF_CURRENT_QF_FORM');
      END IF;

      IF GetFormsForQF_C%ROWCOUNT = 1 THEN
        COPY(FormsForQF_REC.GURCALL_FORM, 'GLOBAL.WF_FIRST_QF_FORM');
      ELSE
        COPY(FormsForQF_REC.GURCALL_FORM, 'GLOBAL.WF_LAST_QF_FORM');
      END IF;

  END LOOP;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0303','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END SET_QF_FORMS;

----------------------
----------------------

 PROCEDURE WF_DISCONNECT_B2K(notify_wf_in  BOOLEAN  DEFAULT NULL) IS
  vcCurrSubprog    CONSTANT  VARCHAR2(30) := 'WF_DISCONNECT_B2K';
	sqlStatement               VARCHAR2(255);	
	    
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0304','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_MENU_FORM THEN

    --We want to purge the session tracking table of outdated items
    sqlStatement := 'BEGIN WFIKWIBC.purge_outdated_client_sessions; END;';
    GOKDBMS.DYNAMIC_SQL(sqlStatement);

    WF_DESTROY_TIMER;
    WF_REINIT_GLOBALS;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0305','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_DISCONNECT_B2K;

--*
--* Define private subprogram bodies
--*

PROCEDURE PERFORM_DEFAULT_LOGON(aUserid     VARCHAR2,
                                aPassword   VARCHAR2,
                                aConnection VARCHAR2) IS
  db_errnum_db  NUMBER; 
  lv_pass       VARCHAR2(100);
  nAlertBtn     NUMBER;                    
  BEGIN
  lv_pass := aPassword;
  <<START_CHECKING>>
  IF aConnection IS NOT NULL THEN 
    LOGON(aUserid,
          lv_pass || '@' || aConnection,
          TRUE);
  ELSE
    LOGON(aUserid,
          lv_pass,
          TRUE);
  END IF;

-- If the password was expired and they were forced to create a new password
-- the dbms_error_code will equal -24309 Already connected to a server
-- If they cancelled out of the change then it would be -28001 The password has expired
-- We only want to verify the password if it had expired and they changed it.
       
    db_errnum_db := DBMS_ERROR_CODE;
    IF db_errnum_db = -24309 THEN
--
-- Disallow the use of other special characters in passwords
--
      DEFAULT_VALUE('Y', 'GLOBAL.SKIP_FORM_CNT');
      EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
      IF NOT GOKPVAL.F_VALID_JOBSUB_PARM('PWD',GET_APPLICATION_PROPERTY(PASSWORD)) THEN
        nAlertBtn := G$_DISPLAY_ALERT('',G$_NLS.Get('GOQWFLW-0306','LIB','*ERROR* Unsupported character detected in the new password. Please re-login using your new password but changing it to a valid one.') );
        lv_pass := GET_APPLICATION_PROPERTY(PASSWORD);
        gp_udc_oracle_id.p_expire_account(aUserid);  -- We have to re-expire the password so that it is not used
        LOGOUT;
        GOTO start_checking;
      END IF;        
    END IF;

END PERFORM_DEFAULT_LOGON;
 
----------------------
----------------------
 
 PROCEDURE SET_CURR_B2K_OBJT_NAME(task_name VARCHAR2) IS
 
 BEGIN
  COPY(UPPER(task_name),'GLOBAL.WF_B2K_OBJT_NAME');

 END SET_CURR_B2K_OBJT_NAME;

----------------------
----------------------

 PROCEDURE SET_CURR_B2K_OBJT_TYPE(objt_name_in  VARCHAR2) IS
  vObjtType GUBOBJS.GUBOBJS_OBJT_CODE%TYPE;

  CURSOR GetObjtType_C(objt_name VARCHAR2) IS
   SELECT GUBOBJS_OBJT_CODE
     FROM GUBOBJS
    WHERE GUBOBJS_NAME = objt_name;
   
 BEGIN
  OPEN GetObjtType_C(objt_name_in);
  FETCH GetObjtType_C INTO vObjtType;
  CLOSE GetObjtType_C;

  COPY(vObjtType,'GLOBAL.WF_B2K_OBJT_TYPE');

 END SET_CURR_B2K_OBJT_TYPE;

----------------------
----------------------

 PROCEDURE SET_CURR_WF_WORK_ID(work_id_in  VARCHAR2) IS
  vcWorkID  VARCHAR2(255);
 
 BEGIN
  COPY(work_id_in,'GLOBAL.WF_WORK_ID');

 END SET_CURR_WF_WORK_ID;

----------------------
----------------------

 PROCEDURE LAUNCH_B2K_OBJT(objt_name_in  VARCHAR2) IS
  vcCurrSubprog    CONSTANT  VARCHAR2(30) := 'LAUNCH_B2K_OBJT';
 BEGIN
 	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0307','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));
 	-- Launch the requested Banner object.

  GO_ITEM(G$_WF_HEADER.MENU_FORM_KEY_ITM);
 	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0308','LIB','%01%.%02% JGA - AFTER GO ITEM',vcCurrProgUnit,vcCurrSubprog));
  COPY(objt_name_in,G$_WF_HEADER.MENU_FORM_KEY_ITM);
 	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0309','LIB','%01%.%02% JGA - AFTER COPY OBJECT',vcCurrProgUnit,vcCurrSubprog));

  DO_KEY('ENTER');

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0310','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));
 END LAUNCH_B2K_OBJT;

----------------------
----------------------

 PROCEDURE RELEASE_WF_TASK(work_id_in  VARCHAR2) IS
 BEGIN
  G$_WF_BA.RELEASE_TASK(work_id_in);

 END RELEASE_WF_TASK;

------------------------
------------------------

 PROCEDURE WF_REINIT_GLOBALS IS
 BEGIN 	
  COPY('' , 'GLOBAL.WF_B2K_OBJT_NAME');
  COPY('' , 'GLOBAL.WF_B2K_OBJT_TYPE');
  COPY('' , 'GLOBAL.WF_REQUEST_TYPE'); 
  COPY('' , 'GLOBAL.WF_WORK_ID');
  COPY('' , 'GLOBAL.WF_WORK_ACTIVITY_NAME');
  COPY('' , 'GLOBAL.WF_FIRST_QF_FORM');
  COPY('' , 'GLOBAL.WF_LAST_QF_FORM');
  COPY('' , 'GLOBAL.WF_CURRENT_QF_FORM');
  COPY('N', 'GLOBAL.WF_FOCUS_IS_SET');
  COPY('M', 'GLOBAL.WF_ACTIVITY');
  COPY('' , 'GLOBAL.WF_ORIG_WIN_TITLE');
  COPY('N', 'GLOBAL.WF_CONTEXT_EXISTS');
  COPY('' , 'GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE');
  COPY('' , 'GLOBAL.WF_ORIG_FORM_VALIDATION');
  COPY('N', 'GLOBAL.WF_CONTEXT_POPULATED');
  COPY('N', 'GLOBAL.WF_LOCAL_RELEASE_EXISTS');
  COPY('N', 'GLOBAL.WF_LOCAL_SUBMIT_EXISTS');
  COPY('Y', 'GLOBAL.WF_PERFORM_COMMIT');
  COPY('N', 'GLOBAL.WF_SUBMITTED');
  COPY('' , 'GLOBAL.WF_ORIG_TRIGGER_TRACE');

 END WF_REINIT_GLOBALS;

----------------------
----------------------

 PROCEDURE WF_DESTROY_TIMER IS
  WFTimerID TIMER;
 
 BEGIN
  WFTimerID := FIND_TIMER(G$_WF_HEADER.TM_NAME);

  IF NOT ID_NULL(WFTimerID) THEN
    DELETE_TIMER(WFTimerID);
  END IF;

 END WF_DESTROY_TIMER;

END G$_WF_WAIT_FOR_WORK;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_WAIT_FOR_WORK");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfInitGlobals()
		{
			
			final NString VCCURRSUBPROG = toStr("WF_INIT_GLOBALS");
			try
			{
				setDefaultValue("", "GLOBAL.WF_LOG_FILE");
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" BEGIN"));
				setDefaultValue("Y", "GLOBAL.DO_TRIGGER_TRACE");
				setDefaultValue("", "GLOBAL.WF_ARGS");
				//  5000-1 Set a default value for a new global to determine
				//         whether communication with Workflow has been
				//         established
				setDefaultValue("", "GLOBAL.WF_B2K_OBJT_NAME");
				setDefaultValue("", "GLOBAL.WF_B2K_OBJT_TYPE");
				setDefaultValue("", "GLOBAL.WF_PROXY_URL");
				setDefaultValue("", "GLOBAL.WF_WORKFLOW_URL");
				setDefaultValue("", "GLOBAL.WF_CLIENT_ID");
				setDefaultValue("", "GLOBAL.WF_LOGON_USERNAME");
				setDefaultValue("", "GLOBAL.WF_LOGON_PASSWORD");
				setDefaultValue("", "GLOBAL.WF_BANNER_CONNECTION");
				setDefaultValue("", "GLOBAL.WF_REQUEST_TYPE");
				setDefaultValue("", "GLOBAL.WF_WORK_ID");
				setDefaultValue("", "GLOBAL.WF_WORK_ACTIVITY_NAME");
				setDefaultValue("", "GLOBAL.WF_FIRST_QF_FORM");
				setDefaultValue("", "GLOBAL.WF_LAST_QF_FORM");
				setDefaultValue("", "GLOBAL.WF_CURRENT_QF_FORM");
				setDefaultValue("M", "GLOBAL.WF_ACTIVITY");
				setDefaultValue("N", "GLOBAL.WF_FOCUS_IS_SET");
				setDefaultValue("", "GLOBAL.WF_ORIG_WIN_STATE");
				setDefaultValue("", "GLOBAL.WF_ORIG_WIN_TITLE");
				setDefaultValue("N", "GLOBAL.WF_CONTEXT_EXISTS");
				setDefaultValue("", "GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE");
				setDefaultValue("", "GLOBAL.WF_ORIG_FORM_VALIDATION");
				setDefaultValue("N", "GLOBAL.WF_CONTEXT_POPULATED");
				setDefaultValue("N", "GLOBAL.WF_LOCAL_RELEASE_EXISTS");
				setDefaultValue("N", "GLOBAL.WF_LOCAL_SUBMIT_EXISTS");
				setDefaultValue("Y", "GLOBAL.WF_PERFORM_COMMIT");
				setDefaultValue("N", "GLOBAL.WF_SUBMITTED");
				setDefaultValue("", "GLOBAL.WF_APPL_TRANS_NO");
				setDefaultValue("", "GLOBAL.WF_ORIG_TRIGGER_TRACE");
				setDefaultValue("", "GLOBAL.IAMTICKET");
				//  VPD Begin 
				setDefaultValue("", "GLOBAL.WF_VPDI_HOME_CODE");
				setDefaultValue("", "GLOBAL.WF_VPDI_ON");
				//  VPD End
				if ( getContainer().getGWfConditions().isInitForm().getValue() )
				{
					{
						NString lvIamticket= NString.getNull();
						NString wfArgsParam= NString.getNull();
						NString wfWorkflowUrlParam= NString.getNull();
						NString wfProxyUrlParam= NString.getNull();
						NString wfClientIdParam= NString.getNull();
						NString wfArgsPreDelimiter = toStr("=");
						NString wfArgsPostDelimiter = toStr("|");
						NString logFile= NString.getNull();
						//  Grab the IAMTICKET off of the parameter that is coming in through the INIT_FORM
						lvIamticket = getNameIn("PARAMETER.IAMTICKET");
						copy(lvIamticket,"GLOBAL.IAMTICKET");
						
						
						//  Once we depricate GLOBAL.WF_ACTIONQUEUE_IOR we will replace it in the next line with GLOBAL.WF_ARGS
						wfArgsParam = getNameIn("PARAMETER.WF_ARGS");
						if ( wfArgsParam.isNull() )
							wfArgsParam = getNameIn("PARAMETER.WF_ACTIONQUEUE_IOR");
						else
							copy(wfArgsParam,"PARAMETER.WF_ACTIONQUEUE_IOR");
						
						copy(wfArgsParam,"GLOBAL.WF_ARGS");
												
						// GET THE WF_URL ARG
						wfWorkflowUrlParam = getArgument(wfArgsParam, toStr("WF_URL"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfWorkflowUrlParam,"GLOBAL.WF_WORKFLOW_URL");
						// GET THE PROXY_URL ARG
						wfProxyUrlParam = getArgument(wfArgsParam, toStr("PROXY_URL"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfProxyUrlParam,"GLOBAL.WF_PROXY_URL");
						// GET THE CLIENT_ID ARG
						wfClientIdParam = getArgument(wfArgsParam, toStr("CLIENT_ID"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfClientIdParam,"GLOBAL.WF_CLIENT_ID");
						// GET THE USERNAME TO LOGON AS TO REQUEST THE PROPER USER/PASS FROM    
						wfClientIdParam = getArgument(wfArgsParam, toStr("WF_LOGON_USERNAME"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfClientIdParam,"GLOBAL.WF_LOGON_USERNAME");
						// GET THE PASSWORD TO LOGON AS TO REQUEST THE PROPER USER/PASS FROM    
						wfClientIdParam = getArgument(wfArgsParam, toStr("WF_LOGON_PASSWORD"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfClientIdParam,"GLOBAL.WF_LOGON_PASSWORD");
						// GET THE BANNER SESSION TO CONNECT TO    
						wfClientIdParam = getArgument(wfArgsParam, toStr("WF_BANNER_CONNECTION"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfClientIdParam,"GLOBAL.WF_BANNER_CONNECTION");
						//  GET THE BANNER VPDI Parameter     	
						wfClientIdParam = getArgument(wfArgsParam, toStr("WF_VPDI_HOME_CODE"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						copy(wfClientIdParam,"GLOBAL.WF_VPDI_HOME_CODE");
						//  Allow tracing to be turned on via parameters from Workflow.
						logFile = getArgument(wfArgsParam, toStr("LOG_FILE"), wfArgsPreDelimiter, wfArgsPostDelimiter);
						if ( !logFile.isNull() )
						{
							copy(logFile,"GLOBAL.WF_LOG_FILE");
						}
					}
				}
				// End condition of init form
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" END"));
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				
			}


			
		}
/* <p>
		* ----------------------
		* ----------------------
		*   Gets a argument from a string of arguments in the form of arg1=value1|arg2=value2
		* *    ARG_STRING - string containing all arguments that you want to retieve from
		* *    ARG_NAME - name of argument... above example would be 'arg1' or 'arg2'
		* *    PRE_DELIMITER - value's begining delimiting character before the value but after the argument name
		* *    POST_DELIMITER -  value's ending delimiting character
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param argString
		* @param argName
		* @param preDelimiter
		* @param postDelimiter
		*/
		public NString getArgument(NString argString, NString argName, NString preDelimiter, NString postDelimiter)
		{
			NInteger argLocation= NInteger.getNull();
			NInteger preDelimLocation= NInteger.getNull();
			NInteger postDelimLocation= NInteger.getNull();
			// GET THE LOCATION OF THE ARGUMENT	
			argLocation = inStr(argString, argName);
			if ( argLocation.equals(0) )
			{
				return NString.getNull();
			}
			// GET THE LOCATION OF THE FIRST PRE_DELIM AFTER THE LOCATION OF OUR ARGUMENT
			preDelimLocation = inStr(argString, preDelimiter, argLocation);
			// GET THE LOCATION OF THE FIRST POST_DELIM AFTER THE LOCATION OF OUR PRE_DELIM
			postDelimLocation = inStr(argString, postDelimiter, preDelimLocation);
			// IF I DIDN'T FIND THE POST DELIM, THIS VALUE MUST BE THE END OF THE STRING
			if ( postDelimLocation.equals(0) )
			{
				return substring(argString, preDelimLocation.add(1));
			}
			else {
				return substring(argString, preDelimLocation.add(1), postDelimLocation.subtract(preDelimLocation).subtract(1));
			}
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param vcretrieveduser
		* @param vcretrievedpassword
		*/
		public NString validateRetrievedUser(NString vcretrieveduser, NString vcretrievedpassword)
		{
			
			NString vcerrmsg = NString.getNull();
			//  Validates a retrieved user id.  If something doesn't validate
			//  returns the error msg otherwise null.
			// If the username is still the same as the WF_LOGON, the GET_USER_INFO Procedure didn't work.  We want to fail politely rather than try to log in with the sso user.
			if ( vcretrieveduser.equals(getNameIn("GLOBAL.WF_LOGON_USERNAME")) )
			{
				vcerrmsg = toStr("*ERROR* Cannot obtain from Workflow a userid with which to log into Banner - Banner Workflow communication may be down.  Please contact your Workflow Administrator.");
			}
			if ( vcretrieveduser.isNull() || vcretrieveduser.equals("") )
			{
				vcerrmsg = toStr("*ERROR* Cannot obtain from Workflow a userid with which to log into Banner - Banner Workflow communication may be down.  Please contact your Workflow Administrator.");
			}
			if ( vcretrievedpassword.isNull() || vcretrievedpassword.equals("") )
			{
				vcerrmsg = toStr("*ERROR* Cannot obtain from Workflow a user password with which to log into Banner - Banner Workflow communication  may be down.  Please contact your Workflow Administrator.");
			}
			return vcerrmsg;
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfPerformAutoLogon()
		{


			final NString VCCURRSUBPROG = toStr("WF_PERFORM_AUTO_LOGON");
			NString vcsupplieduserid= NString.getNull();
			NString vcsuppliedpassword= NString.getNull();
			NString vcsuppliedconnection= NString.getNull();
			NString vcretrieveduserid= NString.getNull();
			NString vcretrievedpassword= NString.getNull();
			NString vcerrmsg= NString.getNull();
			//  -- --
			//  -- --
			NString lvIamticket = getNameIn("GLOBAL.IAMTICKET");
			NString lvIamapplicationname= NString.getNull();
			NString lvIamuserid= NString.getNull();
			NString lvIampassword= NString.getNull();
			NString lvIamappconnectstring= NString.getNull();
			try
			{
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" BEGIN"));
				if ( getContainer().getGWfConditions().isInitForm().getValue() )
				{
					if ( !lvIamticket.isNull() )
					{
						Ref<NString> pAppName_ref = new Ref<NString>(lvIamapplicationname);
						Ref<NString> pUser_ref = new Ref<NString>(lvIamuserid);
						Ref<NString> pPswd_ref = new Ref<NString>(lvIampassword);
						Ref<NString> pAppConn_ref = new Ref<NString>(lvIamappconnectstring);
						getContainer().gIamGetCredentials(lvIamticket, pAppName_ref, pUser_ref, pPswd_ref, pAppConn_ref);
						lvIamapplicationname = pAppName_ref.val;
						lvIamuserid = pUser_ref.val;
						lvIampassword = pPswd_ref.val;
						lvIamappconnectstring = pAppConn_ref.val;
						if ( lvIamuserid.isNull() )
						{
							throw new Iamnulluserid();
						}
					}
					if ( getContainer().getGWfConditions().canConnect().getValue() )
					{
						//MORPHIS : LOGIN REMOVED
						/*
						if ( lvIamticket.isNull() )
						{
							//  ****************** NON-IAM connection on behalf of Workflow is performed here
							//  ******************
							//  If the name of the current operator is not known,
							//  communication between Workflow and this Banner
							//  session has indeed been established, and the current
							//  environment is a Web environment, then attempt to 
							//  retrieve the current operator's userid and password from
							//  Workflow. 
							//  Logon first as the passed banner user that has access to
							//  get the real Username/Password					
							vcsuppliedconnection = getNameIn("GLOBAL.WF_BANNER_CONNECTION");
							//  if WF didn't supply a connection, we want to use whatever
							//  the LOCAL environment variable might be.
							if ( vcsuppliedconnection.equals("") )
							{
								vcsuppliedconnection = toStr(null);
							}
							//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
							//  there is no connection to the database to be able to use the function.
							getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" Logging in as the SSO account ").append(getNameIn("GLOBAL.WF_LOGON_USERNAME")));
							//  Log in as the sso user.  The sso user only logs in to make
							//  http request to Workflow and decrypt the username and password
							//  that workflow returns to us.  For higher security, one could
							//  replace the use of the WF_LOGON_USERNAME and WF_LOGON_PASSWORD
							//  with actual hardcoded SSO username and password.  This frees
							//  the pll from having to get this information passed to it as an
							//  argument from workflow.  You can then secure it by only keeping
							//  a complied version of this form
							performDefaultLogon(getNameIn("GLOBAL.WF_LOGON_USERNAME"), getNameIn("GLOBAL.WF_LOGON_PASSWORD"), vcsuppliedconnection);
							Ref<NString> username_ref = new Ref<NString>(vcretrieveduserid);
							Ref<NString> pwd_ref = new Ref<NString>(vcretrievedpassword);
							getContainer().getGWfBa().getUserInfo(username_ref, pwd_ref);
							vcretrieveduserid = username_ref.val;
							vcretrievedpassword = pwd_ref.val;
							//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
							//  there is no connection to the database to be able to use the function.
							getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" vcRetrievedUserid := ").append(vcretrieveduserid));
							//  FIRST WE NEED TO LOG OUT OF THE CURRENT USER THAT GOT OUR WORKFLOW
							//  USER/PASS FOR US     This has been moved up higher to ensure that
							//  a LOGOUT is called prior to any of the possible exceptions that can
							//  be raised.
							// F2J_NOT_SUPPORTED : Call to built-in "LOGOUT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
							//							SupportClasses.FORMS40.Logout();
							////
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGOUT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
							
							
							vcerrmsg = validateRetrievedUser(vcretrieveduserid, vcretrievedpassword);
							if ((!vcerrmsg.isNull()))
							{
								vcretrieveduserid = toStr(null);
								vcretrievedpassword = toStr(null);
								vcsuppliedconnection = toStr(null);
								throw new Excb2klogonfailure();
							}
							//  If the current operator's userid and password were successfully
							//  retrieved from Workflow, then attempt to log the operator 
							//  into this Banner session with the retrieved userid and
							//  password, as well as the database connect string of
							//  the current operator.      
							performDefaultLogon(vcretrieveduserid, vcretrievedpassword, vcsuppliedconnection);
						}
						else {
							performDefaultLogon(lvIamuserid, lvIampassword, lvIamappconnectstring);
						}
						*/
						
						//  VPDI After Logon on behalf of Workflow (whether it is IAM or NON-IAM way)
						if ( GVpdiSecurity.FgIsMifEnabled().getValue() )
						{
							copy("Y","GLOBAL.WF_VPDI_ON");
							//  sets the MIF state
							if ( !getNameIn("GLOBAL.WF_VPDI_HOME_CODE").isNull() )
							{
								copy(getNameIn("GLOBAL.WF_VPDI_HOME_CODE"),"PARAMETER.VPDI_CODE");
							}
						}
					}
					else {
						if ( !lvIamticket.isNull() )
						{
							performDefaultLogon(lvIamuserid, lvIampassword, lvIamappconnectstring);
						}
						else {
							vcsupplieduserid = toStr(getUser());
							vcsuppliedpassword = toStr(getPassword());
							vcsuppliedconnection = toStr(getConnectionString());
							if ( !vcsupplieduserid.isNull() )
							{
								//  If the userid of the current operator is known, attempt
								//  to log that operator into a Banner session with
								//  his/her userid, password and database connect string 
								//  using default logon processing. 
								//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
								//  there is no connection to the database to be able to use the function.
								getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" Attempting to log on as user passed value: ").append(vcsupplieduserid));
								performDefaultLogon(vcsupplieduserid, vcsuppliedpassword, vcsuppliedconnection);
							}
							else {
								//  If the userid of the current operator is not known attempt
								//  to display the default Form Builder logon screen to request
								//  valid logon parameters.
								vcsupplieduserid = toStr(null);
								vcsuppliedpassword = toStr(null);
								vcsuppliedconnection = toStr(null);
								// F2J_NOT_SUPPORTED : Call to built-in "LOGON_SCREEN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
								//								SupportClasses.FORMS40.LogonScreen();
								////
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGON_SCREEN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
								
								
								vcsupplieduserid = toStr(getUser());
								vcsuppliedpassword = toStr(getPassword());
								vcsuppliedconnection = toStr(getConnectionString());
								//  Attempt to perform default logon processing
								//  using the parameters requested.
								performDefaultLogon(vcsupplieduserid, vcsuppliedpassword, vcsuppliedconnection);
							}
						}
					}
				}
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" END"));
			}
			//MORPHIS: REMOVED
			/*
			catch(Excb2klogonfailure e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				if ( !vcerrmsg.isNull() )
				{
					getContainer().getGWfError().displayError(vcerrmsg, toStr("ALERT"), toBool(NBool.False), toBool(NBool.True));
					
					vcerrmsg = toStr(null);
				}
			}
			*/
			catch(Iamnulluserid e)
			{
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point (when this
				//  exeception is raised) there is no connection to the database to be able to use the function.
				getContainer().getGWfError().showException(toStr("*ERROR* IAM SSO Failure. Contact Security Administrator."), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}
			catch(Exception  e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
			
		}
/* <p>
		* -------------------
		* -------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfMakeTimer()
		{
			//MORPHIS: The original timer is not created here because now it only has the 'keep session alive' feature
			/*

			final NString VCCURRSUBPROG = toStr("WF_MAKE_TIMER");
			NString vcerrmsg= NString.getNull();
			UnknownTypes.Timer wftimerid= null;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0283"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				
				//MORPHIS
				if ( getContainer().getGWfConditions().isFormLauncher().getValue() )
				//if ( getContainer().getGWfConditions().isMenuForm().getValue() )
				{
					//  If the current form is the General Menu Application Form,
					//  disable all iconic toolbar buttons that relate to Workflow
					//  or Workflow Electronic Documents.
					getContainer().getGWfIcons().wfDisableIcons();
					//  5000-1 Updated following IF statement to evaluate IS_ACTIONQUEUE_IOR_SET
					//         instead of ACTIONQUEUE_IOR_STR_ACQUIRED, as the actionqueue IOR
					//         should have already been set under the appropriate conditions
					//         prior to WF_MAKE_TIMER being called.
					if ( getContainer().getGWfConditions().canConnect().getValue() )
					{
						//  If a communications gateway has been established between
						//  Workflow and this Banner session, evaluate
						//  the conditions under which the creation of a timer to
						//  poll for workflow tasks and activities is permissible.
						// 
						//  If any of these conditions are not met, present the user
						//  with the appropriate error message.
						//  5000-1 Removed the tests for whether the current environment
						//         supports Workflow interoperation or whether the Workflow
						//         interface object can be found.  Also removed the
						//         call to set the actionqueue IOR.
						// 
						//         This logic is now being performed as part of the new
						//         WF_SET_ACTIONQUEUE_IOR procedure.
						if ( Goksyst.fIssystemlinkenabled(toStr("WORKFLOW")).not() )
						{
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0284"), toStr("LIB"), toStr("*ERROR* Communication with Workflow is not available because it is institutionally disabled."));
							throw new Excwflinkfailure();
						}
						//  If the above conditions are met, create a timer to poll
						//  for workflow tasks and activities to perform.
						// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
						//						wftimerid = SupportClasses.FORMS40.FindTimer(GWfHeader.tmName);
						////
						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
						
						if ( (wftimerid == null) )
						{
							// F2J_NOT_SUPPORTED : Call to built-in "CREATE_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
							//							wftimerid = SupportClasses.FORMS40.CreateTimer(GWfHeader.tmName, GWfHeader.timeInterval, SupportClasses.Constants.REPEAT);
							////
							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
							
						}
						
					}

				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0285"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Excwflinkfailure e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				if ( !vcerrmsg.isNull() )
				{
					getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
					getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
					
					clearMessage();
					vcerrmsg = toStr(null);
				}
			}
			catch(Exception  e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
							
			}

			*/
			
		}
		
		public void wfCreateSessionReusableTimerJob(NString tmName, NNumber timeInterval) {
			ITask task = getWorkspaceTask();
			if ( task instanceof IAsyncJobContainer ) {
				IAsyncJobContainer jobLauncher = (IAsyncJobContainer)task;
				
				String id = tmName.getValue();
				if ( !jobLauncher.existsJob(id) ) {
					
					IAction action = new IAction() {					
						@Override
						public void execute() {
							getContainer().getGWfBa().updateClientId();					
						}
					};
					
					JobOptions options = new JobOptions();
					options.endTask = false;
					options.interval = 30;
					options.startNow = true;
					options.removeOnSessionExpire = true;
	
					jobLauncher.scheduleAsyncJob(id, action, options);
				}
			}
		}

		/* <p>
		* -------------------
		* -------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfCheckMsg()
		{

			final NString VCCURRSUBPROG = toStr("WF_CHECK_MSG");
			NString currworkid= NString.getNull();
			NString curractivityname= NString.getNull();
			NString vccurrtaskform= NString.getNull();
			NString vcerrmsg= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0286"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				
				//MORPHIS
				if ( getContainer().getGWfConditions().isFormLauncher().getValue() )
//				if ( getContainer().getGWfConditions().isMenuForm().getValue() )
				{
					//  If the current form is the General Menu Application Form,
					//  check the workflow action queue by retrieving the current
					//  workflow workitem ID.
					Ref<NString> workId_ref = new Ref<NString>(currworkid);
					Ref<NString> taskName_ref = new Ref<NString>(vccurrtaskform);
					Ref<NString> activityName_ref = new Ref<NString>(curractivityname);
					getContainer().getGWfBa().getWork(workId_ref, taskName_ref, activityName_ref);
					currworkid = workId_ref.val;
					vccurrtaskform = taskName_ref.val;
					curractivityname = activityName_ref.val;
					// copy the activityname into a global
					copy(curractivityname,"GLOBAL.WF_WORK_ACTIVITY_NAME");
					//  If the workflow task ID retrieved is non-null, then Workflow
					//  has requested that Banner perform an action.
					if ( currworkid.notEquals("no_work") )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0287"), toStr("LIB"), toStr("%01%.%02%: The retrieved non-null work id = '%03%'"), VCCURRPROGUNIT, VCCURRSUBPROG, currworkid));
						if ( currworkid.equals("wf_logged_off") )
						{
							//  If the current task ID is 'wf_logged_off', then Workflow has been exited or logged off.
							// 
							//  Present the user with an alert asking whether the user now wants to
							//  exit Banner as well.
							throw new Excb2kconfirmexit();
						}
						//  If the current task ID is nonzero but not -1, then Workflow has a workflow
						//  task or activity for Banner to perform.
						//  Assume for now that the request is to perform a workflow task until otherwise
						//  determined.
						setCurrWfRequestType(toStr("T"));
						//  Retrieve and store the Banner object name corresponding to the workflow task ID.
						setCurrB2kObjtName(vccurrtaskform);
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0288"), toStr("LIB"), toStr("%01%.%02%:The retrieved object name = '%03%'"), VCCURRPROGUNIT, VCCURRSUBPROG, getCurrB2kObjtName()));
						if ( isNull(getCurrB2kObjtName(), "NONE").equals("NONE") )
						{
							//  If no Banner object name could be located, present the user with an
							//  appropriate error message.
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0289"), toStr("LIB"), toStr("*ERROR* Unable to find an executable ID for the task or activity received from Workflow."));
							throw new Excexitprocedure();
						}
						//  Retrieve and store the Banner object type corresponding to the name of
						//  the Banner object that has been requested to be launched.
						setCurrB2kObjtType(getCurrB2kObjtName());
						if ( isNull(getCurrB2kObjtType(), "NONE").equals("NONE") )
						{
							//  If the requested Banner object is not of a valid object type,
							//  present the user with an appropriate error message.
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0290"), toStr("LIB"), toStr("*ERROR* The executable ID for this Workflow task or activity, '%01%', is an invalid Banner object."), getCurrB2kObjtName());
							throw new Excexitprocedure();
						}
						if ( getContainer().getGWfConditions().isForm().not() && getContainer().getGWfConditions().isProcess().not() && getContainer().getGWfConditions().isQuickflow().not() )
						{
							//  If the requested Banner object is not a supported object type
							//  for performing workflow tasks or activities, present the user
							//  with an appropriate error message.
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0291"), toStr("LIB"), toStr("*ERROR* Banner objects of type %01% cannot be launched as Workflow activities."), getCurrB2kObjtType());
							throw new Excexitprocedure();
						}
						setCurrWfRequestType(toStr("W"));
						setCurrWfWorkId(currworkid);
						if ( isNull(getCurrWfWorkId(), "NONE").equals("NONE") )
						{
							//  If no workflow activity ID could be located, present the user
							//  with an appropriate error message.
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0292"), toStr("LIB"), toStr("*ERROR* Unable to find a work ID for the activity received from Workflow."));
							throw new Excexitprocedure();
						}
						if ( getContainer().getGWfConditions().isForm().not() && getContainer().getGWfConditions().isProcess().not() )
						{
							//  If the requested Banner object is not a supported object type
							//  for performing workflow activities, present the user with
							//  an appropriate error message.
							vcerrmsg = GNls.Fget(toStr("GOQWFLW-0293"), toStr("LIB"), toStr("*ERROR* Banner objects of type %01% cannot be launched as Workflow activities."), getCurrB2kObjtType());
							throw new Excexitprocedure();
						}
						if ( getContainer().getGWfConditions().isQuickflow().getValue() )
						{
							//  If the requested Banner object is a QuickFlow, retrieve and store
							//  the names of the first, last and current forms in the QuickFlow.
							setQfForms(getCurrB2kObjtName());
							if ( isNull(getNameIn("GLOBAL.WF_FIRST_QF_FORM"), "NONE").equals("NONE") || isNull(getNameIn("GLOBAL.WF_LAST_QF_FORM"), "NONE").equals("NONE") || isNull(getNameIn("GLOBAL.WF_CURRENT_QF_FORM"), "NONE").equals("NONE") )
							{
								//  If the names of the forms contained within the QuickFlow could not
								//  be located, present the user with an appropriate error message.
								vcerrmsg = GNls.Fget(toStr("GOQWFLW-0294"), toStr("LIB"), toStr("*ERROR* Unable to find the forms associated with this QuickFlow activity."));
								throw new Excexitprocedure();
							}
						}
						//  Restore the MDI window of the Banner application and launch the
						//  appropriate Banner object.
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0295"), toStr("LIB"), toStr("%01%.%02%: About to restore window."), VCCURRPROGUNIT, VCCURRSUBPROG));
						getContainer().getGWfSetFocus().restoreWindow();
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0296"), toStr("LIB"), toStr("%01%.%02%: About to launch form."), VCCURRPROGUNIT, VCCURRSUBPROG));
						launchB2kObjt(getCurrB2kObjtName());
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0297"), toStr("LIB"), toStr("%01%.%02%: Completed launch."), VCCURRPROGUNIT, VCCURRSUBPROG));
						if ( getContainer().getGWfConditions().isWfSubmitted().getValue() )
						{
							//  Upon exiting the launched Banner object, if
							//  the object was launched as a workflow task or
							//  it was launched as a workflow activity that
							//  was subsequently submitted, minimize the MDI
							//  window of the Banner application.
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0298"), toStr("LIB"), toStr("%01%.%02%: About to minimize window."), VCCURRPROGUNIT, VCCURRSUBPROG));
							getContainer().getGWfSetFocus().minimizeWindow();
						}
						// IF NOT G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN
						//  If the object was launched as a workflow task or
						//  it was launched as a workflow activity that
						//  was not subsequently submitted, explicitly notify
						//  Workflow that Banner is finished with
						//  the workflow task ID that is associated with
						//  the object that was launched.
						// RELEASE_WF_TASK(currWorkID);
						// 
						//  RDR - Not sure why this is commentted out other than
						//        Workflow no longer supports "task" launching
						//        as of Workflow 3.x
						// END IF;
						//  Reinitialize the appropriate Workflow-specific global variables
						//  in preparation for the next request to perform a workflow
						//  task or activity.
						wfReinitGlobals();
						currworkid = toStr(null);
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0299"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Excb2kconfirmexit e)
			{
				//  Restore and set focus upon the MDI window of
				//  the Banner application.
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				//  Sever communications between Workflow and
				//  this Banner session, but do not notify
				//  Workflow that the session is no longer available.
				// 
				//  Communications must be severed because:
				// 
				//  1) if Workflow is exited, then there is no application
				//     with which to communicate, and
				// 
				//  2) if Workflow is logged off, there is no guarantee
				//     that the Workflow user will log back into Workflow
				//     with a user id that has permission to invoke the
				//     currently open Banner session using the previous
				//     user's permissions.
				// 
				//  The notification to Workflow of the inavailability
				//  of Banner is not necessary, since this branch of logic
				//  only executes if Workflow has already been exited
				//  or logged off.
				wfDisconnectB2k(toBool(NBool.False));
				currworkid = toStr(null);
				//  Exit this Banner session if the user chooses to do so.
				//  Otherwise, notify the user that communication with Workflow
				//  is no longer available.
				if ( getContainer().getGoqrpls().gDisplayAlert(GWfHeader.MENU_FORM_QUIT_ALERT, GNls.Fget(toStr("GOQWFLW-0300"), toStr("LIB"), toStr("Do you want to exit this Banner session?"))).equals(MessageServices.BUTTON1) )
				{
					copy(null,GWfHeader.MENU_FORM_KEY_ITM);
					getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
				else {
					getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0301"), toStr("LIB"), toStr("*NOTE* This Banner session will no longer communicate with Workflow.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
					
				}
			}
			catch(Excexitprocedure e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				if ( !vcerrmsg.isNull() )
				{
					getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));	
					////MORPHIS: Not needed
					//getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
					
					//MORPHIS: Not needed, otherwise messages are removed
					//clearMessage();
					vcerrmsg = toStr(null);
				}
				getContainer().getGWfSetFocus().minimizeWindow();
				if ( currworkid.isNotNull() )
				{
					releaseWfTask(currworkid);
					currworkid = toStr(null);
				}
				wfReinitGlobals();
			}
			catch(Exception  e)
			{
				getContainer().getGWfSetFocus().restoreWindow();
				getContainer().getGWfSetFocus().setFocus();
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				// 
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				getContainer().getGWfSetFocus().minimizeWindow();
				if ( currworkid.isNotNull() )
				{
					releaseWfTask(currworkid);
					currworkid = toStr(null);
				}
				wfReinitGlobals();
			}
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param typeIn
		*/
		public void setCurrWfRequestType(NString typeIn)
		{

			final NString VCCURRSUBPROG = toStr("SET_CURR_WF_REQUEST_TYPE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			copy(typeIn,"GLOBAL.WF_REQUEST_TYPE");			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getCurrWfRequestType()
		{
		
			final NString VCCURRSUBPROG = toStr("GET_CURR_WF_REQUEST_TYPE");
			NString vcrequesttype= NString.getNull();
			vcrequesttype = getNameIn("GLOBAL.WF_REQUEST_TYPE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" - vcRequestType := ").append(vcrequesttype));
			return toStr((vcrequesttype));

		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getCurrB2kObjtName()
		{
			final NString VCCURRSUBPROG = toStr("GET_CURR_B2K_OBJT_NAME");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" - GLOBAL.WF_B2K_OBJT_NAME: ").append(isNull(getNameIn("GLOBAL.WF_B2K_OBJT_NAME"), "NULL")));
			return ((getNameIn("GLOBAL.WF_B2K_OBJT_NAME")));
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getCurrB2kObjtType()
		{
			
			final NString VCCURRSUBPROG = toStr("GET_CURR_B2K_OBJT_TYPE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return ((getNameIn("GLOBAL.WF_B2K_OBJT_TYPE")));

		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getCurrWfWorkId()
		{
			
			final NString VCCURRSUBPROG = toStr("GET_CURR_WF_WORK_ID");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return ((getNameIn("GLOBAL.WF_WORK_ID")));

		}
/* <p>
		* --------------------
		* --------------------
		* Deprecated... value returned is only here for older versions of GUAGMNU that use it
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getCurrWfTaskId()
		{
			
			final NString VCCURRSUBPROG = toStr("GET_CURR_WF_TASK_ID");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return  toInt(0);
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param qfNameIn
		*/
		public void setQfForms(NString qfNameIn)
		{
			int rowCount = 0;

			final NString VCCURRSUBPROG = toStr("SET_QF_FORMS");
			String sqlgetformsforqfC = "SELECT GURCALL_FORM " +
	" FROM GURCALL " +
	" WHERE GURCALL_CALL_CODE = :P_QF_NAME " +
	" ORDER BY GURCALL_SEQNO";
			DataCursor getformsforqfC = new DataCursor(sqlgetformsforqfC);
			NString qfName = NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0302"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				copy("NONE","GLOBAL.WF_CURRENT_QF_FORM");
				qfName=qfNameIn;
				//Setting query parameters
				getformsforqfC.addParameter("P_QF_NAME", qfName);
				try
				{
					getformsforqfC.open();
					while (true)
					{
						TableRow formsforqfRec = getformsforqfC.fetchRow();
						if ( getformsforqfC.notFound() ) break;
						if ( getCurrentTaskName().equals(formsforqfRec.getStr("GURCALL_FORM")) )
						{
							copy(formsforqfRec.getStr("GURCALL_FORM"),"GLOBAL.WF_CURRENT_QF_FORM");
						}
						if ( getformsforqfC.getRowCount() == 1 )
						{
							copy(formsforqfRec.getStr("GURCALL_FORM"),"GLOBAL.WF_FIRST_QF_FORM");
						}
						else {
							copy(formsforqfRec.getStr("GURCALL_FORM"),"GLOBAL.WF_LAST_QF_FORM");
						}
					}
				}finally{
					getformsforqfC.close();
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0303"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfDisconnectB2k() {
			wfDisconnectB2k(NBool.getNull());
		}

/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param notifyWfIn
		*/
		public void wfDisconnectB2k(NBool notifyWfIn)
		{

			final NString VCCURRSUBPROG = toStr("WF_DISCONNECT_B2K");
			NString sqlstatement= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0304"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				//MORPHIS
				if ( getContainer().getGWfConditions().isFormLauncher().getValue() )
				//if ( getContainer().getGWfConditions().isMenuForm().getValue() )
				{
					// We want to purge the session tracking table of outdated items
					sqlstatement = toStr("BEGIN WFIKWIBC.purge_outdated_client_sessions; END;");
					Gokdbms.dynamicSql(sqlstatement);
					wfDestroyTimer();
					wfReinitGlobals();
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0305"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}
			
		}
/* <p>
		* *
		* * Define private subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param auserid
		* @param apassword
		* @param aconnection
		*/
		public void performDefaultLogon(NString auserid, NString apassword, NString aconnection)
		{

			NNumber dbErrnumDb= NNumber.getNull();
			NString lvPass= NString.getNull();
			NNumber nalertbtn= NNumber.getNull();
			lvPass = apassword;
			
//			 START_CHECKING:;
			//Replaced the goto usage by a loop with a flag
			boolean checking = true;
			
			while ( checking ) 
			{
				checking = false;
				if ( !aconnection.isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "LOGON" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
					//				SupportClasses.FORMS40.Logon(auserid, lvPass.append("@").append(aconnection), NBool.True);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGON' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
					
					
				}
				else {
					// F2J_NOT_SUPPORTED : Call to built-in "LOGON" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
					//				SupportClasses.FORMS40.Logon(auserid, lvPass, NBool.True);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGON' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
					
					
				}
				//  If the password was expired and they were forced to create a new password
				//  the dbms_error_code will equal -24309 Already connected to a server
				//  If they cancelled out of the change then it would be -28001 The password has expired
				//  We only want to verify the password if it had expired and they changed it.
				dbErrnumDb = toNumber(errorCode());
				if ( dbErrnumDb.equals(- (24309)) )
				{
//				
					//  Disallow the use of other special characters in passwords
//				
					setDefaultValue("Y", "GLOBAL.SKIP_FORM_CNT");
					executeAction("G$_VERIFY_ACCESS");
					if ( Gokpval.fValidJobsubParm(toStr("PWD"), toStr(getPassword())).not() )
					{
						nalertbtn = getContainer().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GOQWFLW-0306"), toStr("LIB"), toStr("*ERROR* Unsupported character detected in the new password. Please re-login using your new password but changing it to a valid one.")));
						lvPass = toStr(getPassword());
						GpUdcOracleId.pExpireAccount(auserid);
						//  We have to re-expire the password so that it is not used
						// F2J_NOT_SUPPORTED : Call to built-in "LOGOUT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//					SupportClasses.FORMS40.Logout();
//				// 
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGOUT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
//					 goto START_CHECKING;
						checking = true;
					}
				}
			}
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param taskName
		*/
		public void setCurrB2kObjtName(NString taskName)
		{

			copy(upper(taskName),"GLOBAL.WF_B2K_OBJT_NAME");
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param objtNameIn
		*/
		public void setCurrB2kObjtType(NString objtNameIn)
		{
			int rowCount = 0;

			NString vobjttype= NString.getNull();
			String sqlgetobjttypeC = "SELECT GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_OBJT_NAME ";
			DataCursor getobjttypeC = new DataCursor(sqlgetobjttypeC);
			NString objtName = NString.getNull();
			try {
				objtName=objtNameIn;
				//Setting query parameters
				getobjttypeC.addParameter("P_OBJT_NAME", objtName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getobjttypeC.
				getobjttypeC.open();
				ResultSet getobjttypeCResults = getobjttypeC.fetchInto();
				if ( getobjttypeCResults != null ) {
					vobjttype = getobjttypeCResults.getStr(0);
				}
				getobjttypeC.close();
				copy(vobjttype,"GLOBAL.WF_B2K_OBJT_TYPE");
				}finally{
					getobjttypeC.close();
				}

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workIdIn
		*/
		public void setCurrWfWorkId(NString workIdIn)
		{

			NString vcworkid= NString.getNull();
			copy(workIdIn,"GLOBAL.WF_WORK_ID");			
		}
/* <p>
		* --------------------
		* --------------------
/* </p>
		* @param objtNameIn
		*/
		public void launchB2kObjt(NString objtNameIn)
		{
			//MORPHIS: This existing code uses the menu field to call the requested form.
			//We replace it by the code to calling a form
			
			String taskName = objtNameIn.getValue();
			boolean sync = true;
			TaskServices.executeAction("CALL_FORM_BY_NAME", null, null, false, taskName, sync);
			
			/*
			final NString VCCURRSUBPROG = toStr("LAUNCH_B2K_OBJT");
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0307"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			//  Launch the requested Banner object.
			goItem(GWfHeader.MENU_FORM_KEY_ITM);
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0308"), toStr("LIB"), toStr("%01%.%02% JGA - AFTER GO ITEM"), VCCURRPROGUNIT, VCCURRSUBPROG));
			copy(objtNameIn,GWfHeader.MENU_FORM_KEY_ITM);
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0309"), toStr("LIB"), toStr("%01%.%02% JGA - AFTER COPY OBJECT"), VCCURRPROGUNIT, VCCURRSUBPROG));
			// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin9".
			//			SupportClasses.SQLFORMS.DoKey("ENTER");
			////
			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin9'.");
			
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0310"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			*/
			
			

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workIdIn
		*/
		public void releaseWfTask(NString workIdIn)
		{

			getContainer().getGWfBa().releaseTask(workIdIn);
			
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfReinitGlobals()
		{
			copy("","GLOBAL.WF_B2K_OBJT_NAME");
			copy("","GLOBAL.WF_B2K_OBJT_TYPE");
			copy("","GLOBAL.WF_REQUEST_TYPE");
			copy("","GLOBAL.WF_WORK_ID");
			copy("","GLOBAL.WF_WORK_ACTIVITY_NAME");
			copy("","GLOBAL.WF_FIRST_QF_FORM");
			copy("","GLOBAL.WF_LAST_QF_FORM");
			copy("","GLOBAL.WF_CURRENT_QF_FORM");
			copy("N","GLOBAL.WF_FOCUS_IS_SET");
			copy("M","GLOBAL.WF_ACTIVITY");
			copy("","GLOBAL.WF_ORIG_WIN_TITLE");
			copy("N","GLOBAL.WF_CONTEXT_EXISTS");
			copy("","GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE");
			copy("","GLOBAL.WF_ORIG_FORM_VALIDATION");
			copy("N","GLOBAL.WF_CONTEXT_POPULATED");
			copy("N","GLOBAL.WF_LOCAL_RELEASE_EXISTS");
			copy("N","GLOBAL.WF_LOCAL_SUBMIT_EXISTS");
			copy("Y","GLOBAL.WF_PERFORM_COMMIT");
			copy("N","GLOBAL.WF_SUBMITTED");
			copy("","GLOBAL.WF_ORIG_TRIGGER_TRACE");
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfDestroyTimer()
		{
			/*
			UnknownTypes.Timer wftimerid= null;
			// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//wftimerid = SupportClasses.FORMS40.FindTimer(GWfHeader.tmName);			
			if ( !(wftimerid == null) )
			{
				// F2J_NOT_SUPPORTED : Call to built-in "DELETE_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin10".
				//				SupportClasses.FORMS40.DeleteTimer(wftimerid);
			}
			*/

			ITask task = getWorkspaceTask();
			if ( task instanceof IAsyncJobContainer ) {
				IAsyncJobContainer jobLauncher = (IAsyncJobContainer)task;
				
				String id = GWfHeader.TM_NAME.getValue();
				jobLauncher.unscheduleAsyncJob(id);
			}
		}
		
	
	
}
