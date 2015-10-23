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


import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;

public class GWfError extends AbstractSupportCodeObject {
	

	public GWfError(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_ERROR
	/*
	PACKAGE G$_WF_ERROR IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_ERROR provides the interfaces needed to
  present the user with consistently formatted error messages
  whenever an error is encountered in the execution of a 
  workflow task or activity, and to enable him or her to debug
  a task or activity should the need arise to know the
  parameters under which a task or activity is operating.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure SHOW_EXCEPTION is used to process unhandled
  exceptions.  It displays a given error message (or a generic
  message should none be supplied), performs a Workflow Release
  if indicated to do so, notifies the user of the exact package
  (if provided) and subprogram (if provided) of a module in
  which the exception was raised, and raises FORM_TRIGGER_FAILURE
  if indicated to do so.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SHOW_EXCEPTION  (err_msg_in         VARCHAR2,
                            progunit_name_in   VARCHAR2,
                            subprog_name_in    VARCHAR2,
                            release_wf_in      BOOLEAN,
                            raise_failure_in   BOOLEAN);

<multilinecomment>--------------------------------------------------------------*\
  The procedure DISPLAY_ERROR displays a given statement of error
  (or a generic statement should none be supplied) as either an
  alert or a message depending upon what is indicated, performs
  a Workflow Release if indicated to do so, and raises
  FORM_TRIGGER_FAILURE if indicated to do so.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE DISPLAY_ERROR   (err_msg_in         VARCHAR2 DEFAULT G$_WF_HEADER.ERR_MSG_DEFAULT,
                            display_method_in  VARCHAR2 DEFAULT 'MESSAGE',
                            release_wf_in      BOOLEAN  DEFAULT FALSE,
                            raise_failure_in   BOOLEAN  DEFAULT FALSE);

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_CAPTURE_CURRENT_STATE spools to a temporary
  log file Workflow-specific information to be used for
  debugging purposes and presents a message notifying the user
  that the spooling has taken place and providing the user with
  the location of the temporary log file.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_CAPTURE_CURRENT_STATE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_TRIGGER_TRACE stores off the current
  value of a global variable, which controls whether
  the G$_WF_LOGGING.DEBUG_MSG procedure of GOQRPLS spools
  any information to a temporary log file.  It then sets
  that value to 'Y' so that the appropriate information
  can be spooled.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_TRIGGER_TRACE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure RESET_TRIGGER_TRACE resets the value of a
  global variable, which controls whether
  the G$_WF_LOGGING.DEBUG_MSG procedure of GOQRPLS spools
  any information to a temporary log file, to the value
  to which it was set prior to the last call to the
  SET_TRIGGER_TRACE procedure using the value of a variable
  that was stored off by the latter procedure.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RESET_TRIGGER_TRACE;

END G$_WF_ERROR;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_ERROR
		/*
		PACKAGE BODY G$_WF_ERROR IS

--*
--* Declare private variables
--*

  vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_ERROR';

--*
--* Define public subprogram bodies
--*

  PROCEDURE SHOW_EXCEPTION  (err_msg_in         VARCHAR2,
                             progunit_name_in   VARCHAR2,
                             subprog_name_in    VARCHAR2,
                             release_wf_in      BOOLEAN,
                             raise_failure_in   BOOLEAN)
  IS
   vcCurrSubprog  CONSTANT  VARCHAR2(30)   := 'SHOW_EXCEPTION';
   vcErrLocation            VARCHAR2(2000);

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0189','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   G$_WF_ERROR.DISPLAY_ERROR(err_msg_in,'MESSAGE',release_wf_in,FALSE);
   

   IF progunit_name_in IS NULL THEN
     vcErrLocation := G$_WF_HEADER.MODULE_NAME;
   ELSIF subprog_name_in IS NULL THEN
     vcErrLocation := progunit_name_in || ' of ' || G$_WF_HEADER.MODULE_NAME;
   ELSE
     vcErrLocation := progunit_name_in || '.' || subprog_name_in || ' of ' || G$_WF_HEADER.MODULE_NAME;
   END IF;

   G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0190','LIB','Exception raised in %01%.',vcErrLocation),'MESSAGE',FALSE,raise_failure_in);

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0191','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  END SHOW_EXCEPTION;

-------------------------------
-------------------------------

  PROCEDURE DISPLAY_ERROR(err_msg_in         VARCHAR2 DEFAULT G$_WF_HEADER.ERR_MSG_DEFAULT,
                          display_method_in  VARCHAR2 DEFAULT 'MESSAGE',
                          release_wf_in      BOOLEAN  DEFAULT FALSE,
                          raise_failure_in   BOOLEAN  DEFAULT FALSE)
  IS
   vcCurrSubprog    CONSTANT  VARCHAR2(30)  := 'DISPLAY_ERROR';
   vcReleaseErrMsg            VARCHAR2(40)  := G$_NLS.Get('GOQWFLW-0192','LIB','*ERROR* This activity will be released. ');
   vcFullErrMsg               VARCHAR2(200);
   nAlertBtn                  NUMBER;
   
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0193','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   IF G$_WF_CONDITIONS.IS_WF_ACTIVITY AND release_wf_in THEN
    
     IF display_method_in = 'ALERT' THEN
       vcFullErrMsg := vcReleaseErrMsg || SUBSTR(err_msg_in,1,40);
     ELSIF display_method_in = 'MESSAGE' THEN
       vcFullErrMsg := vcReleaseErrMsg || SUBSTR(err_msg_in,1,160);
     END IF;

   ELSIF display_method_in = 'ALERT' THEN
     vcFullErrMsg := SUBSTR(err_msg_in,1,80);

   ELSIF display_method_in = 'MESSAGE' THEN
     vcFullErrMsg := SUBSTR(err_msg_in,1,200);

   END IF;

   IF display_method_in = 'ALERT' THEN
     nAlertBtn := G$_DISPLAY_ALERT('',vcFullErrMsg);
     nAlertBtn := NULL;

   ELSIF display_method_in = 'MESSAGE' THEN
     MESSAGE(vcFullErrMsg);

   END IF;

   IF G$_WF_CONDITIONS.IS_WF_ACTIVITY AND release_wf_in THEN
     G$_WF_CONTROL_FORM.WF_RELEASE;
   END IF;

   IF raise_failure_in THEN
     RAISE FORM_TRIGGER_FAILURE;
   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0194','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  END DISPLAY_ERROR;

-------------------------------
-------------------------------

  PROCEDURE WF_CAPTURE_CURRENT_STATE IS
   vcCurrSubprog         CONSTANT  VARCHAR2(30)  := 'WF_CAPTURE_CURRENT_STATE';
   WFTimerID                       TIMER;
   vcTimerMsg                      VARCHAR2(100);
   rgParamRgID                     RECORDGROUP;
   iParamRgRowCount                PLS_INTEGER;
   iParamRgCurrentRow              PLS_INTEGER;
   vcItmName                       VARCHAR2(61);
   vcItmInValue                    VARCHAR2(1938);
   vcItmIsProtected                VARCHAR2(1);
   vcItmVisAttrib                  VARCHAR2(2000);
   vcItmIsHighlighted              VARCHAR2(1);
   vcItmOutValue                   VARCHAR2(1938);

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0195','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   IF G$_WF_CONDITIONS.IS_MENU_FORM THEN

     -- If the current form is the General Menu Application Form, then
     -- spool a message indicating whether the timer that polls for
     -- workflow tasks and activities to perform currently exists
     -- on the form.

     WFTimerID := FIND_TIMER(G$_WF_HEADER.TM_NAME);

     IF ID_NULL(WFTimerID) THEN
       vcTimerMsg := G$_NLS.Get('GOQWFLW-0196','LIB','The timer %01% does not exist.',G$_WF_HEADER.TM_NAME);
     ELSE
       vcTimerMsg := G$_NLS.Get('GOQWFLW-0197','LIB','The timer %01% exists.',G$_WF_HEADER.TM_NAME);
     END IF;

     SET_TRIGGER_TRACE;
     G$_WF_LOGGING.DEBUG_MSG('~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
     G$_WF_LOGGING.DEBUG_MSG(vcTimerMsg                                                 );
     G$_WF_LOGGING.DEBUG_MSG('~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
     RESET_TRIGGER_TRACE;

   END IF;

   -- Spool the current value of any and all global variables that may contain
   -- Workflow-specific information.

   -- 5000-1 Added a call to the trace routine to capture the current value of the
   --        new global, GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET.
   
   SET_TRIGGER_TRACE;
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0198','LIB','~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'                                ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0199','LIB','Current value of all Workflow-related globals:           '                                ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0200','LIB','~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'                                ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0201','LIB','GLOBAL.WF_ACTIONQUEUE_IOR_STRING = ''%01%''', NAME_IN('GLOBAL.WF_ACTIONQUEUE_IOR_STRING') ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0202','LIB','GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET = ''%01%''', NAME_IN('GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET') ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0203','LIB','GLOBAL.WF_B2K_OBJT_NAME          = ''%01%''', NAME_IN('GLOBAL.WF_B2K_OBJT_NAME')          ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0204','LIB','GLOBAL.WF_B2K_OBJT_TYPE          = ''%01%''', NAME_IN('GLOBAL.WF_B2K_OBJT_TYPE')          ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0205','LIB','GLOBAL.WF_REQUEST_TYPE           = ''%01%''', NAME_IN('GLOBAL.WF_REQUEST_TYPE')           ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0206','LIB','GLOBAL.WF_WORK_ID                = ''%01%''', NAME_IN('GLOBAL.WF_WORK_ID')                ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0207','LIB','GLOBAL.WF_FIRST_QF_FORM          = ''%01%''', NAME_IN('GLOBAL.WF_FIRST_QF_FORM')          ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0208','LIB','GLOBAL.WF_LAST_QF_FORM           = ''%01%''', NAME_IN('GLOBAL.WF_LAST_QF_FORM')           ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0209','LIB','GLOBAL.WF_CURRENT_QF_FORM        = ''%01%''', NAME_IN('GLOBAL.WF_CURRENT_QF_FORM')        ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0210','LIB','GLOBAL.WF_ACTIVITY               = ''%01%''', NAME_IN('GLOBAL.WF_ACTIVITY')               ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0211','LIB','GLOBAL.WF_FOCUS_IS_SET           = ''%01%''', NAME_IN('GLOBAL.WF_FOCUS_IS_SET')           ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0212','LIB','GLOBAL.WF_ORIG_WIN_STATE         = ''%01%''', NAME_IN('GLOBAL.WF_ORIG_WIN_STATE')         ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0213','LIB','GLOBAL.WF_ORIG_WIN_TITLE         = ''%01%''', NAME_IN('GLOBAL.WF_ORIG_WIN_TITLE')         ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0214','LIB','GLOBAL.WF_CONTEXT_EXISTS         = ''%01%''', NAME_IN('GLOBAL.WF_CONTEXT_EXISTS')         ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0215','LIB','GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE = ''%01%''', NAME_IN('GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE') ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0216','LIB','GLOBAL.WF_ORIG_FORM_VALIDATION   = ''%01%''', NAME_IN('GLOBAL.WF_ORIG_FORM_VALIDATION')   ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0217','LIB','GLOBAL.WF_CONTEXT_POPULATED      = ''%01%''', NAME_IN('GLOBAL.WF_CONTEXT_POPULATED')      ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0218','LIB','GLOBAL.WF_LOCAL_RELEASE_EXISTS   = ''%01%''', NAME_IN('GLOBAL.WF_LOCAL_RELEASE_EXISTS')   ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0219','LIB','GLOBAL.WF_LOCAL_SUBMIT_EXISTS    = ''%01%''', NAME_IN('GLOBAL.WF_LOCAL_SUBMIT_EXISTS')    ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0220','LIB','GLOBAL.WF_PERFORM_COMMIT         = ''%01%''', NAME_IN('GLOBAL.WF_PERFORM_COMMIT')         ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0221','LIB','GLOBAL.WF_SUBMITTED              = ''%01%''', NAME_IN('GLOBAL.WF_SUBMITTED')              ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0222','LIB','GLOBAL.WF_APPL_TRANS_NO          = ''%01%''', NAME_IN('GLOBAL.WF_APPL_TRANS_NO')          ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0223','LIB','GLOBAL.WF_ORIG_TRIGGER_TRACE     = ''%01%''', NAME_IN('GLOBAL.WF_ORIG_TRIGGER_TRACE')     ));
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0224','LIB','~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'                                ));
   RESET_TRIGGER_TRACE;

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     -- If the current form is a workflow activity or was just released from being
     -- a workflow activity, the activity had action parameters defined for it, and
     -- the construct that contains the action parameters still exists on the form,
     -- spool the name, input value, and available attributes for all action parameters
     -- and their corresponding form items.

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName          := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',                      iParamRgCurrentRow);
         vcItmInValue       := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',                 iParamRgCurrentRow);
         vcItmIsProtected   := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED',    iParamRgCurrentRow);
         vcItmVisAttrib     := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_VIS_ATTRIB',      iParamRgCurrentRow);
         vcItmIsHighlighted := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED',  iParamRgCurrentRow);
         vcItmOutValue      := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_OUTPUT_VAL',                iParamRgCurrentRow);

         IF vcItmInValue = G$_WF_HEADER.NULL_STRING THEN
           vcItmInValue := NULL;
         END IF;

         SET_TRIGGER_TRACE;
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0225','LIB',' ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'                  ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0226','LIB',' Attributes of Workflow Action Parameter # %01%', TO_CHAR(iParamRgCurrentRow)));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0227','LIB',' ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'                  ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0228','LIB',' Parameter Name                         = ''%01''', vcItmName          ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0229','LIB',' Parameter Input Value                  = ''%01''', vcItmInValue       ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0230','LIB',' Parameter Input Value is Protected     = ''%01''', vcItmIsProtected   ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0231','LIB',' Parameter Input Value Visual Attribute = ''%01''', vcItmVisAttrib     ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0232','LIB',' Parameter Input Value is Highlighted   = ''%01''', vcItmIsHighlighted ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0233','LIB',' Parameter Output Value (if known)      = ''%01''', vcItmOutValue      ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0234','LIB',' ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~'             ));
         RESET_TRIGGER_TRACE;

         vcItmName          := NULL;
         vcItmInValue       := NULL;
         vcItmIsProtected   := NULL;
         vcItmVisAttrib     := NULL;
         vcItmIsHighlighted := NULL;
         vcItmOutValue      := NULL;
      END LOOP;

   END IF;

   IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' AND
      G$_WF_LOGGING.FILE_NAME IS NOT NULL THEN

     -- If the operating system is one that supports the use of the G$_WF_LOGGING.DEBUG_MSG
     -- procedure and the available information has appeared to be spooled to a file,
     -- notify the user that this is the case and provide the location of the temporary file.

     DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0235','LIB','The current state of all Workflow-related constructs has been spooled to a file.'),'MESSAGE',FALSE,FALSE);
     DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0236','LIB','See %01% for details.', G$_WF_LOGGING.FILE_NAME),'MESSAGE',FALSE,FALSE);
   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0237','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  END WF_CAPTURE_CURRENT_STATE;

-------------------------------
-------------------------------

 PROCEDURE SET_TRIGGER_TRACE IS
  vcCurrTrace              VARCHAR2(1);

 BEGIN
  vcCurrTrace := NVL(NAME_IN('GLOBAL.DO_TRIGGER_TRACE'),'N');

  COPY(vcCurrTrace, 'GLOBAL.WF_ORIG_TRIGGER_TRACE');
  COPY('Y'        , 'GLOBAL.DO_TRIGGER_TRACE');

 END SET_TRIGGER_TRACE;

-------------------------------
-------------------------------

 PROCEDURE RESET_TRIGGER_TRACE IS
  vcCurrTrace              VARCHAR2(1);
  vcOrigTrace              VARCHAR2(1);

 BEGIN
  vcOrigTrace := NVL(NAME_IN('GLOBAL.WF_ORIG_TRIGGER_TRACE'),'N');
  vcCurrTrace := NVL(NAME_IN('GLOBAL.DO_TRIGGER_TRACE')     ,'N');

  IF vcCurrTrace <> vcOrigTrace THEN
    COPY(vcOrigTrace, 'GLOBAL.DO_TRIGGER_TRACE');
  END IF;

 END RESET_TRIGGER_TRACE;

END G$_WF_ERROR;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_ERROR");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errMsgIn
		* @param progunitNameIn
		* @param subprogNameIn
		* @param releaseWfIn
		* @param raiseFailureIn
		*/
		public void showException(NString errMsgIn, NString progunitNameIn, NString subprogNameIn, NBool releaseWfIn, NBool raiseFailureIn)
		{

			final NString VCCURRSUBPROG = toStr("SHOW_EXCEPTION");
			NString vcerrlocation= NString.getNull();
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0189"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			displayError(errMsgIn, toStr("MESSAGE"), releaseWfIn, toBool(NBool.False));
			
			if ( progunitNameIn.isNull() )
			{
				vcerrlocation = GWfHeader.MODULE_NAME;
			}
			else if ( subprogNameIn.isNull() ) {
				vcerrlocation = progunitNameIn.append(" of ").append(GWfHeader.MODULE_NAME);
			}
			else {
				vcerrlocation = progunitNameIn.append(".").append(subprogNameIn).append(" of ").append(GWfHeader.MODULE_NAME);
			}
			displayError(GNls.Fget(toStr("GOQWFLW-0190"), toStr("LIB"), toStr("Exception raised in %01%."), vcerrlocation), toStr("MESSAGE"), toBool(NBool.False), raiseFailureIn);
			
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0191"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));

			
		}
/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void displayError() {
			displayError(GWfHeader.ERR_MSG_DEFAULT, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
		}

/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errMsgIn
		*/
		public void displayError(NString errMsgIn) {
			displayError(errMsgIn, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
		}

/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errMsgIn
		* @param displayMethodIn
		*/
		public void displayError(NString errMsgIn, NString displayMethodIn) {
			displayError(errMsgIn, displayMethodIn, toBool(NBool.False), toBool(NBool.False));
		}

/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errMsgIn
		* @param displayMethodIn
		* @param releaseWfIn
		*/
		public void displayError(NString errMsgIn, NString displayMethodIn, NBool releaseWfIn) {
			displayError(errMsgIn, displayMethodIn, releaseWfIn, toBool(NBool.False));
		}

/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errMsgIn
		* @param displayMethodIn
		* @param releaseWfIn
		* @param raiseFailureIn
		*/
		public void displayError(NString errMsgIn, NString displayMethodIn, NBool releaseWfIn, NBool raiseFailureIn)
		{

			final NString VCCURRSUBPROG = toStr("DISPLAY_ERROR");
			NString vcreleaseerrmsg = GNls.Fget(toStr("GOQWFLW-0192"), toStr("LIB"), toStr("*ERROR* This activity will be released. "));
			NString vcfullerrmsg= NString.getNull();
			NNumber nalertbtn= NNumber.getNull();
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0193"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			if ( getContainer().getGWfConditions().isWfActivity().getValue() && releaseWfIn.getValue() )
			{
				if ( displayMethodIn.equals("ALERT") )
				{
					vcfullerrmsg = vcreleaseerrmsg.append(substring(errMsgIn, toInt(1), toInt(40)));
				}
				else if ( displayMethodIn.equals("MESSAGE") ) {
					vcfullerrmsg = vcreleaseerrmsg.append(substring(errMsgIn, toInt(1), toInt(160)));
				}
			}
			else if ( displayMethodIn.equals("ALERT") ) {
				vcfullerrmsg = substring(errMsgIn, toInt(1), toInt(80));
			}
			else if ( displayMethodIn.equals("MESSAGE") ) {
				vcfullerrmsg = substring(errMsgIn, toInt(1), toInt(200));
			}
			if ( displayMethodIn.equals("ALERT") )
			{
				nalertbtn = getContainer().getGoqrpls().gDisplayAlert(toStr(""), vcfullerrmsg);
				nalertbtn = toNumber(null);
			}
			else if ( displayMethodIn.equals("MESSAGE") ) {
				errorMessage(vcfullerrmsg);
			}
			if ( getContainer().getGWfConditions().isWfActivity().getValue() && releaseWfIn.getValue() )
			{
				getContainer().getGWfControlForm().wfRelease();
			}
			if ( raiseFailureIn.getValue() )
			{
				throw new ApplicationException();
			}
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0194"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			
		}
/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfCaptureCurrentState()
		{

			final NString VCCURRSUBPROG = toStr("WF_CAPTURE_CURRENT_STATE");
			UnknownTypes.Timer wftimerid= null;
			NString vctimermsg= NString.getNull();
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitminvalue= NString.getNull();
			NString vcitmisprotected= NString.getNull();
			NString vcitmvisattrib= NString.getNull();
			NString vcitmishighlighted= NString.getNull();
			NString vcitmoutvalue= NString.getNull();
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0195"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			if ( getContainer().getGWfConditions().isMenuForm().getValue() )
			{
				//  If the current form is the General Menu Application Form, then
				//  spool a message indicating whether the timer that polls for
				//  workflow tasks and activities to perform currently exists
				//  on the form.
				// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
				//				wftimerid = SupportClasses.FORMS40.FindTimer(GWfHeader.tmName);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
				
				
				if ( (wftimerid == null) )
				{
					vctimermsg = GNls.Fget(toStr("GOQWFLW-0196"), toStr("LIB"), toStr("The timer %01% does not exist."), GWfHeader.TM_NAME);
				}
				else {
					vctimermsg = GNls.Fget(toStr("GOQWFLW-0197"), toStr("LIB"), toStr("The timer %01% exists."), GWfHeader.TM_NAME);
				}
				setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(toStr("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"));
				getContainer().getGWfLogging().debugMsg(vctimermsg);
				getContainer().getGWfLogging().debugMsg(toStr("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"));
				resetTriggerTrace();
			}
			//  Spool the current value of any and all global variables that may contain
			//  Workflow-specific information.
			//  5000-1 Added a call to the trace routine to capture the current value of the
			//         new global, GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET.
			setTriggerTrace();
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0198"), toStr("LIB"), toStr("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0199"), toStr("LIB"), toStr("Current value of all Workflow-related globals:           ")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0200"), toStr("LIB"), toStr("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0201"), toStr("LIB"), toStr("GLOBAL.WF_ACTIONQUEUE_IOR_STRING = '%01%'"), getNameIn("GLOBAL.WF_ACTIONQUEUE_IOR_STRING")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0202"), toStr("LIB"), toStr("GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET = '%01%'"), getNameIn("GLOBAL.WF_ACTIONQUEUE_IOR_IS_SET")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0203"), toStr("LIB"), toStr("GLOBAL.WF_B2K_OBJT_NAME          = '%01%'"), getNameIn("GLOBAL.WF_B2K_OBJT_NAME")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0204"), toStr("LIB"), toStr("GLOBAL.WF_B2K_OBJT_TYPE          = '%01%'"), getNameIn("GLOBAL.WF_B2K_OBJT_TYPE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0205"), toStr("LIB"), toStr("GLOBAL.WF_REQUEST_TYPE           = '%01%'"), getNameIn("GLOBAL.WF_REQUEST_TYPE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0206"), toStr("LIB"), toStr("GLOBAL.WF_WORK_ID                = '%01%'"), getNameIn("GLOBAL.WF_WORK_ID")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0207"), toStr("LIB"), toStr("GLOBAL.WF_FIRST_QF_FORM          = '%01%'"), getNameIn("GLOBAL.WF_FIRST_QF_FORM")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0208"), toStr("LIB"), toStr("GLOBAL.WF_LAST_QF_FORM           = '%01%'"), getNameIn("GLOBAL.WF_LAST_QF_FORM")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0209"), toStr("LIB"), toStr("GLOBAL.WF_CURRENT_QF_FORM        = '%01%'"), getNameIn("GLOBAL.WF_CURRENT_QF_FORM")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0210"), toStr("LIB"), toStr("GLOBAL.WF_ACTIVITY               = '%01%'"), getNameIn("GLOBAL.WF_ACTIVITY")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0211"), toStr("LIB"), toStr("GLOBAL.WF_FOCUS_IS_SET           = '%01%'"), getNameIn("GLOBAL.WF_FOCUS_IS_SET")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0212"), toStr("LIB"), toStr("GLOBAL.WF_ORIG_WIN_STATE         = '%01%'"), getNameIn("GLOBAL.WF_ORIG_WIN_STATE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0213"), toStr("LIB"), toStr("GLOBAL.WF_ORIG_WIN_TITLE         = '%01%'"), getNameIn("GLOBAL.WF_ORIG_WIN_TITLE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0214"), toStr("LIB"), toStr("GLOBAL.WF_CONTEXT_EXISTS         = '%01%'"), getNameIn("GLOBAL.WF_CONTEXT_EXISTS")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0215"), toStr("LIB"), toStr("GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE = '%01%'"), getNameIn("GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0216"), toStr("LIB"), toStr("GLOBAL.WF_ORIG_FORM_VALIDATION   = '%01%'"), getNameIn("GLOBAL.WF_ORIG_FORM_VALIDATION")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0217"), toStr("LIB"), toStr("GLOBAL.WF_CONTEXT_POPULATED      = '%01%'"), getNameIn("GLOBAL.WF_CONTEXT_POPULATED")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0218"), toStr("LIB"), toStr("GLOBAL.WF_LOCAL_RELEASE_EXISTS   = '%01%'"), getNameIn("GLOBAL.WF_LOCAL_RELEASE_EXISTS")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0219"), toStr("LIB"), toStr("GLOBAL.WF_LOCAL_SUBMIT_EXISTS    = '%01%'"), getNameIn("GLOBAL.WF_LOCAL_SUBMIT_EXISTS")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0220"), toStr("LIB"), toStr("GLOBAL.WF_PERFORM_COMMIT         = '%01%'"), getNameIn("GLOBAL.WF_PERFORM_COMMIT")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0221"), toStr("LIB"), toStr("GLOBAL.WF_SUBMITTED              = '%01%'"), getNameIn("GLOBAL.WF_SUBMITTED")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0222"), toStr("LIB"), toStr("GLOBAL.WF_APPL_TRANS_NO          = '%01%'"), getNameIn("GLOBAL.WF_APPL_TRANS_NO")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0223"), toStr("LIB"), toStr("GLOBAL.WF_ORIG_TRIGGER_TRACE     = '%01%'"), getNameIn("GLOBAL.WF_ORIG_TRIGGER_TRACE")));
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0224"), toStr("LIB"), toStr("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
			resetTriggerTrace();
			rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
			if ( !(rgparamrgid == null) )
			{
				//  If the current form is a workflow activity or was just released from being
				//  a workflow activity, the activity had action parameters defined for it, and
				//  the construct that contains the action parameters still exists on the form,
				//  spool the name, input value, and available attributes for all action parameters
				//  and their corresponding form items.
				iparamrgrowcount = getGroupRowCount(rgparamrgid);
				for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
				{
					vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
					vcitminvalue = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), iparamrgcurrentrow);
					vcitmisprotected = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"), iparamrgcurrentrow);
					vcitmvisattrib = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_VIS_ATTRIB"), iparamrgcurrentrow);
					vcitmishighlighted = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"), iparamrgcurrentrow);
					vcitmoutvalue = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_OUTPUT_VAL"), iparamrgcurrentrow);
					if ( vcitminvalue.equals(GWfHeader.NULL_STRING) )
					{
						vcitminvalue = toStr(null);
					}
					setTriggerTrace();
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0225"), toStr("LIB"), toStr(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0226"), toStr("LIB"), toStr(" Attributes of Workflow Action Parameter # %01%"), toChar(iparamrgcurrentrow)));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0227"), toStr("LIB"), toStr(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0228"), toStr("LIB"), toStr(" Parameter Name                         = '%01'"), vcitmname));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0229"), toStr("LIB"), toStr(" Parameter Input Value                  = '%01'"), vcitminvalue));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0230"), toStr("LIB"), toStr(" Parameter Input Value is Protected     = '%01'"), vcitmisprotected));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0231"), toStr("LIB"), toStr(" Parameter Input Value Visual Attribute = '%01'"), vcitmvisattrib));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0232"), toStr("LIB"), toStr(" Parameter Input Value is Highlighted   = '%01'"), vcitmishighlighted));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0233"), toStr("LIB"), toStr(" Parameter Output Value (if known)      = '%01'"), vcitmoutvalue));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0234"), toStr("LIB"), toStr(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")));
					resetTriggerTrace();
					vcitmname = toStr(null);
					vcitminvalue = toStr(null);
					vcitmisprotected = toStr(null);
					vcitmvisattrib = toStr(null);
					vcitmishighlighted = toStr(null);
					vcitmoutvalue = toStr(null);
				}
			}
			if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") && !getContainer().getGWfLogging().fileName.isNull() )
			{
				//  If the operating system is one that supports the use of the G$_WF_LOGGING.DEBUG_MSG
				//  procedure and the available information has appeared to be spooled to a file,
				//  notify the user that this is the case and provide the location of the temporary file.
				displayError(GNls.Fget(toStr("GOQWFLW-0235"), toStr("LIB"), toStr("The current state of all Workflow-related constructs has been spooled to a file.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
				displayError(GNls.Fget(toStr("GOQWFLW-0236"), toStr("LIB"), toStr("See %01% for details."), getContainer().getGWfLogging().fileName), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
				
			}
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0237"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));

			this.getLogger().trace(this, "F2J : wfCaptureCurrentState procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setTriggerTrace()
		{

			NString vccurrtrace= NString.getNull();
			vccurrtrace = isNull(getNameIn("GLOBAL.DO_TRIGGER_TRACE"), "N");
			copy(vccurrtrace,"GLOBAL.WF_ORIG_TRIGGER_TRACE");
			copy("Y","GLOBAL.DO_TRIGGER_TRACE");
			
		}
/* <p>
		* -----------------------------
		* -----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void resetTriggerTrace()
		{

			NString vccurrtrace= NString.getNull();
			NString vcorigtrace= NString.getNull();
			vcorigtrace = isNull(getNameIn("GLOBAL.WF_ORIG_TRIGGER_TRACE"), "N");
			vccurrtrace = isNull(getNameIn("GLOBAL.DO_TRIGGER_TRACE"), "N");
			if ( vccurrtrace.notEquals(vcorigtrace) )
			{
				copy(vcorigtrace,"GLOBAL.DO_TRIGGER_TRACE");
			}
			
		}
		
	
	
}
