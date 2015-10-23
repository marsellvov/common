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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
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
import net.hedtech.general.common.services.BannerServices;

public class GWfConditions extends AbstractSupportCodeObject {
	

	public GWfConditions(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONDITIONS
	/*
	PACKAGE G$_WF_CONDITIONS IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONDITIONS contains functions which evaluate
  conditions and return Boolean values to control the behavior
  of Banner as it polls for workflow tasks and activities
  to perform, and as it executes those tasks and activites when
  a user launches them from Workflow.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function CAN_CONNECT returns TRUE if all the parameters
  need to connect Workflow to Banner are supplied.
\*--------------------------------------------------------------</multilinecomment>
 FUNCTION CAN_CONNECT RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_INIT_FORM returns TRUE if the current form
  is the General System Global Establishment Form.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_INIT_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_MENU_FORM returns TRUE if the current form
  is the General Menu Application Form.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_MENU_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function checks to see if the form is the matching form.
\*--------------------------------------------------------------</multilinecomment>
 
 FUNCTION IS_MATCHING_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_SUPPORTED_ENV returns TRUE if the current
  operating system supports Workflow-enabled Banner.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_SUPPORTED_ENV RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function ENV_SUPPORTS_WINDOW_CONTROL returns TRUE if the
  current operating system supports the manipulation of windows.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION ENV_SUPPORTS_WINDOW_CONTROL RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function ACTIONQUEUE_IOR_STR_ACQUIRED returns TRUE if
  a stringified object reference ID was successfully sent
  to Banner from Workflow as a startup parameter and its
  value was captured as a variable that can be retrieved.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION ACTIONQUEUE_IOR_STR_ACQUIRED RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_ACTIONQUEUE_IOR_SET returns TRUE if a
  communications gateway between a Banner session and
  Workflow has been established.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_ACTIONQUEUE_IOR_SET RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function CAN_LOCATE_WF_INTERFACE_OBJT returns TRUE if
  the object which serves an interface between Workflow and
  Banner, the Banner Adapter to Workflow, has been
  successfully loaded and can be located.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION CAN_LOCATE_WF_INTERFACE_OBJT RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_WORK_ITEM returns TRUE if the task
  associated with a given task ID is part of a workflow.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_WORK_ITEM (work_id_in VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_CURR_WF_REQUEST_TYPE returns TRUE if an in-
  progress workflow task or activity is of the specified
  request type.

  For example, the invocation...

  G$_WF_CONDITIONS.IS_CURR_WF_REQUEST_TYPE('T')

  ...will return TRUE if a requested workflow task is currently
  in progress.

  Similarly, the invocation...

  G$_WF_CONDITIONS.IS_CURR_WF_REQUEST_TYPE('W')

  ...will return TRUE if a requested workflow activity is
  currently in progress.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_CURR_WF_REQUEST_TYPE (type_in VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_FORM returns TRUE if the action executable ID
  associated with the in-progress workflow task or activity
  is the name of a Banner Form.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_CURRENT_FORM returns TRUE if the name of the
  action executable ID associated with the in-progress workflow
  task or activity matches the name of the current Form that
  Banner is executing.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_CURRENT_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_PROCESS returns TRUE if the action executable ID
  associated with the in-progress workflow task or activity
  is the name of a Banner Process.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_PROCESS RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_QUICKFLOW returns TRUE if the action executable
  ID associated with the in-progress workflow task or activity
  is the name of a Banner QuickFlow.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_QUICKFLOW RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_FIRST_FORM_QF returns TRUE if the name of
  the first Form in the QuickFlow that is the workflow activity
  in progress matches the name of the current Form that Banner
  is executing.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_FIRST_FORM_QF RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_LAST_FORM_QF returns TRUE if the name of
  the last Form in the QuickFlow that is the workflow activity
  in progress matches the name of the current Form that Banner
  is executing.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_LAST_FORM_QF RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_CURRENT_FORM_QF returns TRUE if the name of
  the current Form in the QuickFlow that is the workflow activity
  in progress matches the name of the current Form that Banner
  is executing.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_CURRENT_FORM_QF RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_PASSTHROUGH_FORM returns TRUE if the launch
  a workflow task or activity has been requested, but the Form
  or set of Forms that represents the task or activity has not
  yet been reached by the Banner user.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_PASSTHROUGH_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_FOCUS_SET returns TRUE if the MDI application
  window for a Banner session has already been brought into
  focus in the process of launching a workflow task or activity.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_FOCUS_SET RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_TASK returns TRUE if the current Form or
  Process that Banner is executing is the in-progress workflow
  task.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_TASK RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_ACTIVITY returns TRUE if the current Form or
  Process that Banner is executing is the in-progress workflow
  activity.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_ACTIVITY RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_CURRENT_ACTIVITY_JOB returns TRUE if the
  current Process that Banner is executing is the in-progress
  workflow activity and the user is located on the Process
  Submission Control Form.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_CURRENT_ACTIVITY_JOB RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_CURRENT_ACTIVITY_QF returns TRUE if the
  current QuickFlow that Banner is executing is the in-
  progress workflow activity and the user is located on one
  of the forms that comprise the QuickFlow.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_CURRENT_ACTIVITY_QF RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WFED_APPLY_ACTIVITY returns TRUE if the current
  Form or Process that Banner is executing has been launched
  by invoking the Apply function of the Workflow Electronic
  Documents Form.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WFED_APPLY_ACTIVITY RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function CONTEXT_EXISTS returns TRUE if Banner was able
  to extract from Workflow the list of all action parameters
  that are associated with the current workflow activity.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION CONTEXT_EXISTS RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_CONTEXT_POPULATED returns TRUE if Banner
  was already able to update the appropriate items of a form
  with their corresponding input action parameter values for the
  current workflow activity.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_CONTEXT_POPULATED RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_KEY_BLOCK returns TRUE if a given block can
  be identified as the Key Block of the current Form that
  Banner is executing.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_KEY_BLOCK (block_in VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_ITEM_VALID returns TRUE if a given item name
  is indeed a valid item on the current form, and is of the
  appropriate name syntax and item type for it to be used as
  an action parameter for a workflow activity.

  IS_ITEM_VALID also returns an error type code as
  an output parameter to provide additional information should
  an item be considered invalid.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_ITEM_VALID (itm_in               VARCHAR2,
                         err_type_out    OUT  VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function CAN_POPULATE_ITEM returns TRUE if a given item
  can be populated with an input action parameter value in a
  given timeframe.

  Currently there are two supported timeframes, 'EVER' and 'NOW'.
  
  The need for two separate timeframes is a result of the
  number of properties Banner can validate at a given
  time considering that many of those properties can be changed
  programmatically at runtime.

  For example, by evaluating CAN_POPULATE_ITEM with a timeframe
  of 'EVER' upon first entering a form for each of its items
  that have been associated with an input action parameter,
  Banner can safely verify that each of those items exist
  in the form's Key Block.  This check can be performed here
  because the block in which an item is located cannot be changed
  at runtime in Oracle Forms 4.5.

  In contrast, by evaluating CAN_POPULATE_ITEM with a timeframe
  of 'NOW' upon navigating to each of the items to be populated
  with input action parameter values, Banner can only safely
  verify at the time of having input focus in the item that each
  item is enabled, as that property can be changed at any time
  between first entering the form and navigating to the item
  in question.

  CAN_POPULATE_ITEM also returns a comma delimited string of
  error type codes as an output parameter to provide additional
  information if an item cannot be populated for any reason.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION CAN_POPULATE_ITEM (itm_in               VARCHAR2,
                             timeframe_in         VARCHAR2,
                             err_type_out    OUT  VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function LOCAL_TRG_EXISTS returns TRUE if the current Form
  or Process that is the workflow activity in progress has set
  the value of a variable that indicates that a given local
  trigger exists in the current scope.

  For example, if the invocation of...

  G$_WF_CONDITIONS.LOCAL_TRG_EXISTS('WF_RELEASE')

  ...returns TRUE, then the current Form or Process executed
  the following procedure of this library...

  G$_WF_CONTROL_FORM.WF_SET_LOCAL_TRG_EXISTS('WF_RELEASE');

  ...to indicate to Banner that a local WF_RELEASE_TRG should
  be executed whenever a user executes the Workflow Release
  function in the current scope.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION LOCAL_TRG_EXISTS (trg_name_in VARCHAR2) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_ENTER_QUERY_MODE returns true if the current
  Form that Banner is executing is in Enter Query mode.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_ENTER_QUERY_MODE RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_COMMIT_OVERRIDE returns true if the current
  Form or Process that is the workflow activity in progress
  has set the value of a variable that indicates that Banner
  should not perform a Commit when the user selects the Workflow
  Submit function, i.e., if the current Form or Process
  executed the following procedure of this library...

  G$_WF_CONTROL_FORM.WF_SET_COMMIT_OVERRIDE;

  ...to ensure that a Commit is not performed in whatever is
  the current scope.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_COMMIT_OVERRIDE RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_INQUIRY_FORM returns TRUE if the current Form
  that Banner is executing follows a naming convention which
  indicates that the form is for inquiry only.  This convention
  purposefully excludes Query ("Q") forms, as these forms cannot
  be launched directly from the General Menu Application Form
  and thus cannot be launched as workflow activities.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_INQUIRY_FORM RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_QUERY_ONLY_ROLE returns TRUE if the current
  user has been granted a role either directly or via a class
  for the current Form that only allows that user to query
  records.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_QUERY_ONLY_ROLE RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function ARE_CHANGES_TO_SAVE returns TRUE if the Form that
  is currently being executed by Banner contains one or more
  new or changed records.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION ARE_CHANGES_TO_SAVE RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function IS_WF_SUBMITTED returns TRUE if the user has
  successfully performed the Workflow Submit function on the Form
  or Process that is currently being executed by Banner.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION IS_WF_SUBMITTED RETURN BOOLEAN;

END G$_WF_CONDITIONS;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONDITIONS
		/*
		PACKAGE BODY G$_WF_CONDITIONS IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONDITIONS';

--*
--* Define public subprogram bodies
--*

 FUNCTION CAN_CONNECT RETURN BOOLEAN IS 
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_CONNECTED';
 BEGIN
	G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
	RETURN (NVL(LENGTH(NAME_IN('GLOBAL.WF_ARGS')), 0) > 0);
	
 END CAN_CONNECT;

 FUNCTION IS_INIT_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_INIT_FORM';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#') = NVL(G$_WF_HEADER.INIT_FORM,'*'));

 END IS_INIT_FORM;

 --------------------------
 --------------------------

 FUNCTION IS_MENU_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_MENU_FORM';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  -- 5000-1 Modified the following return clause to use new MENU_FORM package
  --        header variable instead of GLOBAL.MENU_FORM, as the latter may not
  --        be defined at the time this function is referenced.
 
  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#') = NVL(G$_WF_HEADER.MENU_FORM,'*'));
 
 END IS_MENU_FORM;
 
 --------------------------
 --------------------------

 FUNCTION IS_MATCHING_FORM RETURN BOOLEAN IS
	vcFormName VARCHAR2(12);

 BEGIN
	vcFormName := NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'NULL');
	RETURN (vcFormName = 'GOAMTCH');
 END;

 --------------------------
 --------------------------

 FUNCTION IS_WF_SUPPORTED_ENV RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_WF_SUPPORTED_ENV';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  -- 5000-1 Modified the following return clause to additionally consider
  --        the Web to be a valid environment in which Workflow and Banner
  --        can interoperate.
   
  RETURN(G$_ENV_IS_WEB OR
         G$_ENV_IS_WINDOWS9X OR
         G$_ENV_IS_WINDOWSNT);
 
 END IS_WF_SUPPORTED_ENV;

 --------------------------
 --------------------------

 FUNCTION ENV_SUPPORTS_WINDOW_CONTROL RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'ENV_SUPPORTS_WINDOW_CONTROL';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(G$_ENV_IS_WINDOWS9X OR
         G$_ENV_IS_WINDOWSNT);
 
 END ENV_SUPPORTS_WINDOW_CONTROL;

 --------------------------
 --------------------------

 FUNCTION ACTIONQUEUE_IOR_STR_ACQUIRED RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'ACTIONQUEUE_IOR_STR_ACQUIRED';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(LENGTH(NAME_IN('GLOBAL.WF_ACTIONQUEUE_IOR_STRING')), 0) > 0);
 
 END ACTIONQUEUE_IOR_STR_ACQUIRED;

 --------------------------
 --------------------------

 FUNCTION IS_ACTIONQUEUE_IOR_SET RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_ACTIONQUEUE_IOR_SET';
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN TRUE;
 
 END IS_ACTIONQUEUE_IOR_SET;

 --------------------------
 --------------------------
 
 FUNCTION CAN_LOCATE_WF_INTERFACE_OBJT RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)          := 'CAN_LOCATE_WF_INTERFACE_OBJT';
  lhWFInterfObjt           ORA_FFI.LIBHANDLETYPE;
  bCanLocateObjt           BOOLEAN               := FALSE;
  excExitFunction          EXCEPTION;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  IF IS_WF_SUPPORTED_ENV THEN

    BEGIN
     lhWFInterfObjt := ORA_FFI.FIND_LIBRARY(G$_WF_HEADER.INTERFACE_OBJECT_NAME);
     bCanLocateObjt := TRUE;

    EXCEPTION
      WHEN ORA_FFI.FFI_ERROR THEN
        lhWFInterfObjt := ORA_FFI.LOAD_LIBRARY(NULL,G$_WF_HEADER.INTERFACE_OBJECT_NAME);

        bCanLocateObjt := TRUE;

    END;

  END IF;

  RAISE excExitFunction;

  RETURN NULL; 
 EXCEPTION
   WHEN excExitFunction THEN
     RETURN bCanLocateObjt;

   WHEN OTHERS THEN
     IF TOOL_ERR.NERRORS > 0 THEN
       TOOL_ERR.CLEAR;
     END IF;

     RETURN bCanLocateObjt;
 
 END CAN_LOCATE_WF_INTERFACE_OBJT;

 --------------------------
 --------------------------
 
 FUNCTION IS_WF_WORK_ITEM(work_id_in VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_WF_WORK_ITEM';
  iIsWorkitem              PLS_INTEGER  := 0;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
  iIsWorkitem := NVL(G$_WF_BA.IS_WORKFLOW_TASK(work_id_in),0);
  RETURN(iIsWorkItem <> 0);
 
 END IS_WF_WORK_ITEM;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_CURR_WF_REQUEST_TYPE(type_in  VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_CURR_WF_REQUEST_TYPE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
   
  RETURN(NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_WF_REQUEST_TYPE,'N') = type_in);

 END IS_CURR_WF_REQUEST_TYPE;

 --------------------------
 --------------------------
 
 FUNCTION IS_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_FORM';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_B2K_OBJT_TYPE,'NONE') = G$_WF_HEADER.FORM_ID);
 
 END IS_FORM;

 --------------------------
 --------------------------
 
 FUNCTION IS_CURRENT_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_CURRENT_FORM';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#')
         = NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_B2K_OBJT_NAME,'*'));
 
 END IS_CURRENT_FORM;

 --------------------------
 --------------------------
 
 FUNCTION IS_PROCESS RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_PROCESS';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_B2K_OBJT_TYPE,'NONE') = G$_WF_HEADER.JOBS_ID);
 
 END IS_PROCESS;

 --------------------------
 --------------------------
 
 FUNCTION IS_QUICKFLOW RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_QUICKFLOW';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_B2K_OBJT_TYPE,'NONE') = G$_WF_HEADER.QUICKFLOW_ID);
 
 END IS_QUICKFLOW;

 --------------------------
 --------------------------
 
 FUNCTION IS_FIRST_FORM_QF RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_FIRST_FORM_QF';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#') = NVL(NAME_IN('GLOBAL.WF_FIRST_QF_FORM'),'*'));

 END IS_FIRST_FORM_QF;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_LAST_FORM_QF RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_LAST_FORM_QF';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#') = NVL(NAME_IN('GLOBAL.WF_LAST_QF_FORM'),'*'));

 END IS_LAST_FORM_QF;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_CURRENT_FORM_QF RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_CURRENT_FORM_QF';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'#') = NVL(NAME_IN('GLOBAL.WF_CURRENT_QF_FORM'),'*'));

 END IS_CURRENT_FORM_QF;

 --------------------------
 --------------------------

 FUNCTION IS_WF_PASSTHROUGH_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'IS_WF_PASSTHROUGH_FORM';
  vcStackValue             VARCHAR2(256);
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');

  G$_WF_LOGGING.DEBUG_MSG( vcCurrProgUnit || '.' || vcCurrSubprog || ' - vcStackValue:= ' || vcStackValue );

  RETURN((IS_CURR_WF_REQUEST_TYPE('T') OR
          IS_CURR_WF_REQUEST_TYPE('W')   ) AND
         (INSTR(vcStackValue,'T') = 0 AND
          INSTR(vcStackValue,'W') = 0 AND
          INSTR(vcStackValue,'Q') = 0    ));
    
 END IS_WF_PASSTHROUGH_FORM;

 --------------------------
 --------------------------

 FUNCTION IS_FOCUS_SET RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_FOCUS_SET';
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(NAME_IN('GLOBAL.WF_FOCUS_IS_SET'),'N') = 'Y');
 
 END IS_FOCUS_SET;

 --------------------------
 --------------------------

 FUNCTION IS_WF_TASK RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'IS_WF_TASK';
  vcStackValue             VARCHAR2(256);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
   
  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');

  RETURN(SUBSTR(vcStackValue,-1) = 'T');

 END IS_WF_TASK;
  
 --------------------------
 --------------------------
 
 FUNCTION IS_WF_ACTIVITY RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'IS_WF_ACTIVITY';
  vcStackValue             VARCHAR2(256);
  bolReturn BOOLEAN;
  
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');

  bolReturn := (SUBSTR(vcStackValue,-1) = 'W' OR 
                SUBSTR(vcStackValue,-1) = 'Q'   );
  
  IF bolReturn THEN
  	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0007','LIB','%01%.%02% returns true; vcStackValue:= %03%', vcCurrProgUnit,vcCurrSubprog,vcStackValue ));
  ELSE 
  	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0008','LIB','%01%.%02% returns false; vcStackValue:= %03%', vcCurrProgUnit,vcCurrSubprog,vcStackValue ));
  END IF;
  
  RETURN bolReturn;
 
 END IS_WF_ACTIVITY;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_WF_CURRENT_ACTIVITY_JOB RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_WF_CURRENT_ACTIVITY_JOB';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog); 

  RETURN(IS_WF_ACTIVITY AND
         IS_PROCESS AND
         NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'NONE') = G$_WF_HEADER.JOBSUB_FORM);
 
 END IS_WF_CURRENT_ACTIVITY_JOB;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_WF_CURRENT_ACTIVITY_QF RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)  := 'IS_WF_CURRENT_ACTIVITY_QF';
  vcStackValue             VARCHAR2(256);
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');
 
  RETURN(SUBSTR(vcStackValue,-1) = 'Q');
 
 END IS_WF_CURRENT_ACTIVITY_QF;

 --------------------------
 --------------------------

 FUNCTION IS_WFED_APPLY_ACTIVITY RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_WFED_APPLY_ACTIVITY';
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(LENGTH(NAME_IN('GLOBAL.WF_APPL_TRANS_NO')), 0) > 0);
 
 END IS_WFED_APPLY_ACTIVITY;
 
 --------------------------
 --------------------------
 
 FUNCTION CONTEXT_EXISTS RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'CONTEXT_EXISTS';
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(NAME_IN('GLOBAL.WF_CONTEXT_EXISTS'),'N') = 'Y');
 
 END CONTEXT_EXISTS;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_CONTEXT_POPULATED RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_CONTEXT_POPULATED';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  RETURN(NVL(NAME_IN('GLOBAL.WF_CONTEXT_POPULATED'),'N') = 'Y');
 
 END IS_CONTEXT_POPULATED;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_KEY_BLOCK(block_in VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_KEY_BLOCK';
  BlockID                  BLOCK;
  bIsKeyBlk                BOOLEAN      := FALSE;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  -- If the default where clause of the block is set equal
  -- to the same "signature" value that can be found in
  -- every Banner form's Key Block, then the block
  -- is considered to be the Key Block of the form.
 
  IF block_in IS NOT NULL THEN
    BlockID := FIND_BLOCK(block_in);
 
    IF NOT ID_NULL(BlockID) THEN
 
      IF NVL(UPPER(GET_BLOCK_PROPERTY(BlockID,DEFAULT_WHERE)),'NONE') = G$_WF_HEADER.KEY_BLOCK_ID THEN
        bIsKeyBlk := TRUE;
      END IF;
 
    END IF;
 
  END IF;
 
  RETURN bIsKeyBlk;
 
 END IS_KEY_BLOCK;
 
 --------------------------
 --------------------------
 
 FUNCTION IS_ITEM_VALID(itm_in             VARCHAR2,
                        err_type_out  OUT  VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_ITEM_VALID';
  vcItmBlock               VARCHAR2(30);
  ItmID                    ITEM;
  vcItmType                VARCHAR2(30);
  bItmIsValid              BOOLEAN      := FALSE;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  IF itm_in IS NOT NULL THEN

    vcItmBlock := SUBSTR(itm_in,1,INSTR(itm_in,'.')-1);    

    IF vcItmBlock IS NULL THEN
      err_type_out := 'BLOCK_NOT_GIVEN';

    ELSE
      ItmID := FIND_ITEM(itm_in);

      IF ID_NULL(ItmID) THEN
        err_type_out := 'ITEM_NOT_FOUND';

      ELSE
        vcItmType   := GET_ITEM_PROPERTY(ItmID,ITEM_TYPE);

        IF vcItmType NOT IN ('TEXT ITEM','CHECKBOX','LIST','RADIO GROUP') THEN
          err_type_out := 'INVALID_TYPE';

        ELSE
          bItmIsValid  := TRUE;
          err_type_out := 'NONE';

        END IF;

      END IF;

    END IF;

  END IF;
 
  RETURN bItmIsValid;
 
 END IS_ITEM_VALID;

 --------------------------
 --------------------------
 
 FUNCTION CAN_POPULATE_ITEM(itm_in            VARCHAR2,
                            timeframe_in      VARCHAR2,
                            err_type_out  OUT VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)   := 'CAN_POPULATE_ITEM';
  vcItmErrType             VARCHAR2(30);
  vcItmBlock               VARCHAR2(30);
  vcItmCanvas              VARCHAR2(30);
  vcErrString              VARCHAR2(30);
  iErrCount                PLS_INTEGER    := 0;
  vcErrStack               VARCHAR2(2000);
  bCanPopulItm             BOOLEAN        := FALSE;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
 
  IF IS_ITEM_VALID(itm_in,vcItmErrType) THEN
    vcItmBlock  := SUBSTR(itm_in,1,INSTR(itm_in,'.')-1);
    vcItmCanvas := GET_ITEM_PROPERTY(itm_in,ITEM_CANVAS);
 
    IF timeframe_in = 'EVER' THEN

      IF vcItmCanvas IS NULL THEN
        vcErrString := 'NO_CANVAS';
        iErrCount   := iErrCount + 1;
        vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
      END IF;

      IF NOT IS_KEY_BLOCK(vcItmBlock) THEN
        vcErrString := 'NOT_KEY_BLOCK';
        iErrCount   := iErrCount + 1;
        vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
      END IF;

      IF iErrCount = 0 THEN
        bCanPopulItm := TRUE;
        err_type_out := 'NONE';
      ELSE
        err_type_out := vcErrStack;
      END IF;
 
    ELSIF timeframe_in = 'NOW' THEN

      IF vcItmCanvas IS NOT NULL AND
         IS_KEY_BLOCK(vcItmBlock) THEN

        IF GET_VIEW_PROPERTY(vcItmCanvas,VISIBLE)   = 'FALSE' THEN
          vcErrString := 'CANVAS_NOT_VISIBLE';
          iErrCount   := iErrCount + 1;
          vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
        END IF;

        IF GET_ITEM_PROPERTY(itm_in,DISPLAYED)      = 'FALSE' THEN
          vcErrString := 'ITEM_NOT_DISPLAYED';
          iErrCount   := iErrCount + 1;
          vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
        END IF;

        IF GET_ITEM_PROPERTY(itm_in,ENABLED)        = 'FALSE' THEN
          vcErrString := 'ITEM_NOT_ENABLED';
          iErrCount   := iErrCount + 1;
          vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
        END IF;

        IF GET_ITEM_PROPERTY(itm_in,NAVIGABLE)      = 'FALSE' THEN
          vcErrString := 'ITEM_NOT_NAVIGABLE';
          iErrCount   := iErrCount + 1;
          vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
        END IF;

        IF GET_ITEM_PROPERTY(itm_in,INSERT_ALLOWED) = 'FALSE' THEN
          vcErrString := 'INSERT_NOT_ALLOWED';
          iErrCount   := iErrCount + 1;
          vcErrStack  := G$_WF_Delimited_String.BuildString(vcErrString,vcErrStack,iErrCount,iErrCount,TRUE,',');
        END IF;

        IF iErrCount = 0 THEN
          bCanPopulItm := TRUE;
          err_type_out := 'NONE';
        ELSE
          err_type_out := vcErrStack;
        END IF;

      END IF;
 
    END IF;
 
  END IF;
 
  RETURN bCanPopulItm;
 
 END CAN_POPULATE_ITEM;
 
 --------------------------
 --------------------------

 FUNCTION LOCAL_TRG_EXISTS(trg_name_in  VARCHAR2) RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'LOCAL_TRG_EXISTS';
  vcGlobalName             VARCHAR2(30);
  bLocalExists             BOOLEAN      := FALSE;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  IF trg_name_in = 'WF_RELEASE' THEN
    vcGlobalName := 'WF_LOCAL_RELEASE_EXISTS';
  ELSIF trg_name_in = 'WF_SUBMIT' THEN
    vcGlobalName := 'WF_LOCAL_SUBMIT_EXISTS';
  END IF;

  IF vcGlobalName IS NOT NULL AND
     NVL(NAME_IN('GLOBAL.' || vcGlobalName),'N') = 'Y' THEN
    bLocalExists := TRUE;     
  END IF;

  RETURN bLocalExists;

 END LOCAL_TRG_EXISTS;

 --------------------------
 --------------------------

 FUNCTION IS_ENTER_QUERY_MODE RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_ENTER_QUERY_MODE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.MODE'),'NONE') = 'ENTER-QUERY');
 
 END IS_ENTER_QUERY_MODE;

 --------------------------
 --------------------------

 FUNCTION IS_COMMIT_OVERRIDE RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_COMMIT_OVERRIDE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('GLOBAL.WF_PERFORM_COMMIT'),'Y') = 'N');

 END IS_COMMIT_OVERRIDE;

 --------------------------
 --------------------------

 FUNCTION IS_INQUIRY_FORM RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_INQUIRY_FORM';
  vcCurrForm               VARCHAR2(30);
   
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  vcCurrForm := NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'NONE');

  RETURN(SUBSTR(vcCurrForm,3,1) IN ('C','I') OR
         SUBSTR(vcCurrForm,1,3) = 'FTV'        );
 
 END IS_INQUIRY_FORM;

 --------------------------
 --------------------------

 FUNCTION IS_QUERY_ONLY_ROLE RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_QUERY_ONLY_ROLE';
  vcCurrForm               VARCHAR2(30);
  vcCurrUser               VARCHAR2(30);
  vcCurrRole               VARCHAR2(30);
  bIsQueryOnly             BOOLEAN      := FALSE;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  vcCurrForm := NAME_IN('SYSTEM.CURRENT_FORM');
  vcCurrUser := NAME_IN('GLOBAL.CURRENT_USER');

  IF vcCurrForm IS NOT NULL AND
     vcCurrUser IS NOT NULL THEN

    vcCurrRole := NVL(G$_SECURITY.G$_GET_ROLE_FOR_OBJECT_FNC(vcCurrForm,vcCurrUser),'NONE');

    IF SUBSTR(vcCurrRole,-2,2) = '_Q' THEN
      bIsQueryOnly := TRUE;
    END IF;
 
  END IF;
 
  RETURN bIsQueryOnly;
 
 END IS_QUERY_ONLY_ROLE;

 --------------------------
 --------------------------

 FUNCTION ARE_CHANGES_TO_SAVE RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'ARE_CHANGES_TO_SAVE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

  RETURN(NVL(NAME_IN('SYSTEM.FORM_STATUS'),'NONE') <> 'QUERY');
 
 END ARE_CHANGES_TO_SAVE;
 
 --------------------------
 --------------------------

 FUNCTION IS_WF_SUBMITTED RETURN BOOLEAN IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'IS_WF_SUBMITTED';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

   RETURN(NVL(NAME_IN('GLOBAL.WF_SUBMITTED'),'N') = 'Y');

 END IS_WF_SUBMITTED;

END G$_WF_CONDITIONS;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONDITIONS");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool canConnect()
		{
			final NString VCCURRSUBPROG = toStr("IS_CONNECTED");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(length(getNameIn("GLOBAL.WF_ARGS")), 0).greater(0)));


		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isInitForm()
		{

			final NString VCCURRSUBPROG = toStr("IS_INIT_FORM");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(GWfHeader.INIT_FORM, "*"))));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isMenuForm()
		{
			final NString VCCURRSUBPROG = toStr("IS_MENU_FORM");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			//  5000-1 Modified the following return clause to use new MENU_FORM package
			//         header variable instead of GLOBAL.MENU_FORM, as the latter may not
			//         be defined at the time this function is referenced.
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(GWfHeader.MENU_FORM, "*"))));

		}
		
		//MORPHIS: Funcao alternativa
		public NBool isFormLauncher()
		{
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull("GUAINIT", "*"))));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isMatchingForm()
		{
			NString vcformname= NString.getNull();
			vcformname = isNull(getCurrentTaskName(), "NULL");
			return toBool((vcformname.equals("GOAMTCH")));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfSupportedEnv()
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_SUPPORTED_ENV");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			//  5000-1 Modified the following return clause to additionally consider
			//         the Web to be a valid environment in which Workflow and Banner
			//         can interoperate.
			return toBool((getContainer().getGoqrpls().gEnvIsWeb().getValue() || 
					getContainer().getGoqrpls().gEnvIsWindows9x().getValue() || 
					getContainer().getGoqrpls().gEnvIsWindowsnt().getValue()));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool envSupportsWindowControl()
		{
			final NString VCCURRSUBPROG = toStr("ENV_SUPPORTS_WINDOW_CONTROL");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((getContainer().getGoqrpls().gEnvIsWindows9x().getValue() || 
					getContainer().getGoqrpls().gEnvIsWindowsnt().getValue()));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool actionqueueIorStrAcquired()
		{
			final NString VCCURRSUBPROG = toStr("ACTIONQUEUE_IOR_STR_ACQUIRED");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(length(getNameIn("GLOBAL.WF_ACTIONQUEUE_IOR_STRING")), 0).greater(0)));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isActionqueueIorSet()
		{
			final NString VCCURRSUBPROG = toStr("IS_ACTIONQUEUE_IOR_SET");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return  toBool(NBool.True);
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool canLocateWfInterfaceObjt()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("CAN_LOCATE_WF_INTERFACE_OBJT");
//			UnknownTypes.OraFfiLibhandletype lhwfinterfobjt= null;
//			NBool bcanlocateobjt = toBool(NBool.False);
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
//				if ( isWfSupportedEnv().getValue() )
//				{
//					try
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
//						//						lhwfinterfobjt = SupportClasses.ORA_FFI.FindLibrary(GWfHeader.interfaceObjectName);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
//						
//						bcanlocateobjt = toBool(NBool.True);
//					}
//					catch(Exception e)
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "LOAD_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//						//						lhwfinterfobjt = SupportClasses.ORA_FFI.LoadLibrary(null, GWfHeader.interfaceObjectName);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LOAD_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//						
//						bcanlocateobjt = toBool(NBool.True);
//					}
//				}
//				throw new Excexitfunction();
//				return NBool.getNull();
//			}
//			catch(Excexitfunction e)
//			{
//				return bcanlocateobjt;
//			}
//			catch(Exception  e)
//			{
//				if ( SupportClasses.TOOL_ERR.Nerrors().greater(0) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//					//					SupportClasses.TOOL_ERR.Clear();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//					
//				}
//				return bcanlocateobjt;
//			}
//
			this.getLogger().trace(this, "F2J : canLocateWfInterfaceObjt function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workIdIn
		*/
		public NBool isWfWorkItem(NString workIdIn)
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_WORK_ITEM");
			NInteger iisworkitem = toInt(0);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			iisworkitem = isNull(getContainer().getGWfBa().isWorkflowTask(workIdIn), 0);
			return toBool((iisworkitem.notEquals(0)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param typeIn
		*/
		public NBool isCurrWfRequestType(NString typeIn)
		{
			final NString VCCURRSUBPROG = toStr("IS_CURR_WF_REQUEST_TYPE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getContainer().getGWfWaitForWork().getCurrWfRequestType(), "N").equals(typeIn)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isForm()
		{
			final NString VCCURRSUBPROG = toStr("IS_FORM");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getContainer().getGWfWaitForWork().getCurrB2kObjtType(), "NONE").equals(GWfHeader.FORM_ID)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isCurrentForm()
		{
			final NString VCCURRSUBPROG = toStr("IS_CURRENT_FORM");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(getContainer().getGWfWaitForWork().getCurrB2kObjtName(), "*"))));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isProcess()
		{
			final NString VCCURRSUBPROG = toStr("IS_PROCESS");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getContainer().getGWfWaitForWork().getCurrB2kObjtType(), "NONE").equals(GWfHeader.JOBS_ID)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isQuickflow()
		{
			final NString VCCURRSUBPROG = toStr("IS_QUICKFLOW");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getContainer().getGWfWaitForWork().getCurrB2kObjtType(), "NONE").equals(GWfHeader.QUICKFLOW_ID)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isFirstFormQf()
		{
			final NString VCCURRSUBPROG = toStr("IS_FIRST_FORM_QF");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(getNameIn("GLOBAL.WF_FIRST_QF_FORM"), "*"))));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isLastFormQf()
		{
			final NString VCCURRSUBPROG = toStr("IS_LAST_FORM_QF");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(getNameIn("GLOBAL.WF_LAST_QF_FORM"), "*"))));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isCurrentFormQf()
		{
			final NString VCCURRSUBPROG = toStr("IS_CURRENT_FORM_QF");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getCurrentTaskName(), "#").equals(isNull(getNameIn("GLOBAL.WF_CURRENT_QF_FORM"), "*"))));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfPassthroughForm()
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_PASSTHROUGH_FORM");
			NString vcstackvalue= NString.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" - vcStackValue:= ").append(vcstackvalue));
			return toBool(((isCurrWfRequestType(toStr("T")).getValue() || isCurrWfRequestType(toStr("W")).getValue()) && (inStr(vcstackvalue, toStr("T")).equals(0) && inStr(vcstackvalue, toStr("W")).equals(0) && inStr(vcstackvalue, toStr("Q")).equals(0))));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isFocusSet()
		{

			final NString VCCURRSUBPROG = toStr("IS_FOCUS_SET");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getNameIn("GLOBAL.WF_FOCUS_IS_SET"), "N").equals("Y")));

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfTask()
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_TASK");
			NString vcstackvalue= NString.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			return toBool((substring(vcstackvalue, - (1)).equals("T")));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfActivity()
		{

			final NString VCCURRSUBPROG = toStr("IS_WF_ACTIVITY");
			NString vcstackvalue= NString.getNull();
			NBool bolreturn= NBool.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			bolreturn = toBool(((substring(vcstackvalue, - (1)).equals("W") || substring(vcstackvalue, - (1)).equals("Q"))));
			if ( bolreturn.getValue() )
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0007"), toStr("LIB"), toStr("%01%.%02% returns true; vcStackValue:= %03%"), VCCURRPROGUNIT, VCCURRSUBPROG, vcstackvalue));
			}
			else {
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0008"), toStr("LIB"), toStr("%01%.%02% returns false; vcStackValue:= %03%"), VCCURRPROGUNIT, VCCURRSUBPROG, vcstackvalue));
			}
			return bolreturn;
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfCurrentActivityJob()
		{

			final NString VCCURRSUBPROG = toStr("IS_WF_CURRENT_ACTIVITY_JOB");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isWfActivity().getValue() && isProcess().getValue() && isNull(getCurrentTaskName(), "NONE").equals(GWfHeader.JOBSUB_FORM)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfCurrentActivityQf()
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_CURRENT_ACTIVITY_QF");
			NString vcstackvalue= NString.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			return toBool((substring(vcstackvalue, -1)).equals("Q"));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isWfedApplyActivity()
		{
			final NString VCCURRSUBPROG = toStr("IS_WFED_APPLY_ACTIVITY");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(length(getNameIn("GLOBAL.WF_APPL_TRANS_NO")), 0).greater(0)));
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool contextExists()
		{
			//

			final NString VCCURRSUBPROG = toStr("CONTEXT_EXISTS");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getNameIn("GLOBAL.WF_CONTEXT_EXISTS"), "N").equals("Y")));

			
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isContextPopulated()
		{
			
			final NString VCCURRSUBPROG = toStr("IS_CONTEXT_POPULATED");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getNameIn("GLOBAL.WF_CONTEXT_POPULATED"), "N").equals("Y")));

			
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockIn
		*/
		public NBool isKeyBlock(NString blockIn)
		{
			final NString VCCURRSUBPROG = toStr("IS_KEY_BLOCK");
			BlockDescriptor blockid= null;
			NBool biskeyblk = toBool(NBool.False);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			//  If the default where clause of the block is set equal
			//  to the same "signature" value that can be found in
			//  every Banner form's Key Block, then the block
			//  is considered to be the Key Block of the form.
			if ( !blockIn.isNull() )
			{
				blockid = findBlock(blockIn);
				if ( !(blockid == null) )
				{
					//MORPHIS: This info in the where clause was not migrated
					//if ( isNull(upper(getBlockWhereClause(blockid)), "NONE").equals(GWfHeader.KEY_BLOCK_ID) )
					if ( BannerServices.isKeyBlock(blockid) )
					{
						biskeyblk = toBool(NBool.True);
					}
				}
			}
			return biskeyblk;

		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itmIn
		* @param errTypeOut
		*/
		public NBool isItemValid(NString itmIn, Ref<NString> errTypeOut)
		{
			final NString VCCURRSUBPROG = toStr("IS_ITEM_VALID");
			NString vcitmblock= NString.getNull();
			ItemDescriptor itmid= null;
			NString vcitmtype= NString.getNull();
			NBool bitmisvalid = toBool(NBool.False);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			if ( !itmIn.isNull() )
			{
				vcitmblock = substring(itmIn, toInt(1), inStr(itmIn, toStr(".")).subtract(1));
				if ( vcitmblock.isNull() )
				{
					errTypeOut.val = toStr("BLOCK_NOT_GIVEN");
				}
				else {
					itmid = findItem(itmIn);
					if ( (itmid == null) )
					{
						errTypeOut.val = toStr("ITEM_NOT_FOUND");
					}
					else {
						vcitmtype = toStr(getItemType(itmid));
						if ( !in(vcitmtype, "TEXT ITEM", "CHECKBOX", "LIST", "RADIO GROUP").getValue() )
						{
							errTypeOut.val = toStr("INVALID_TYPE");
						}
						else {
							bitmisvalid = toBool(NBool.True);
							errTypeOut.val = toStr("NONE");
						}
					}
				}
			}
			return bitmisvalid;
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itmIn
		* @param timeframeIn
		* @param errTypeOut
		*/
		public NBool canPopulateItem(NString itmIn, NString timeframeIn, Ref<NString> errTypeOut)
		{
			final NString VCCURRSUBPROG = toStr("CAN_POPULATE_ITEM");
			NString vcitmerrtype= NString.getNull();
			NString vcitmblock= NString.getNull();
			NString vcitmcanvas= NString.getNull();
			NString vcerrstring= NString.getNull();
			NInteger ierrcount = toInt(0);
			NString vcerrstack= NString.getNull();
			NBool bcanpopulitm = toBool(NBool.False);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			if ( isItemValid(itmIn, errTypeOut).getValue() )
			{
				vcitmblock = substring(itmIn, toInt(1), inStr(itmIn, toStr(".")).subtract(1));
				vcitmcanvas = getItemCanvas(itmIn);
				if ( timeframeIn.equals("EVER") )
				{
					if ( vcitmcanvas.isNull() )
					{
						vcerrstring = toStr("NO_CANVAS");
						ierrcount = ierrcount.add(1);
						vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
					}
					if ( isKeyBlock(vcitmblock).not() )
					{
						vcerrstring = toStr("NOT_KEY_BLOCK");
						ierrcount = ierrcount.add(1);
						vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
					}
					if ( ierrcount.equals(0) )
					{
						bcanpopulitm = toBool(NBool.True);
						errTypeOut.val = toStr("NONE");
					}
					else {
						errTypeOut.val = vcerrstack;
					}
				}
				else if ( timeframeIn.equals("NOW") ) {
					if ( !vcitmcanvas.isNull() && isKeyBlock(vcitmblock).getValue() )
					{
						if ( getViewVisible(vcitmcanvas).equals("FALSE") )
						{
							vcerrstring = toStr("CANVAS_NOT_VISIBLE");
							ierrcount = ierrcount.add(1);
							vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
						}
						if ( getItemVisible(itmIn).equals("FALSE") )
						{
							vcerrstring = toStr("ITEM_NOT_DISPLAYED");
							ierrcount = ierrcount.add(1);
							vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
						}
						if ( getItemEnabled(itmIn).equals("FALSE") )
						{
							vcerrstring = toStr("ITEM_NOT_ENABLED");
							ierrcount = ierrcount.add(1);
							vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
						}
						if ( getItemNavigable(itmIn).equals("FALSE") )
						{
							vcerrstring = toStr("ITEM_NOT_NAVIGABLE");
							ierrcount = ierrcount.add(1);
							vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
						}
						if ( getItemInsertAllowed(itmIn).equals("FALSE") )
						{
							vcerrstring = toStr("INSERT_NOT_ALLOWED");
							ierrcount = ierrcount.add(1);
							vcerrstack = getContainer().getGWfDelimitedString().buildstring(vcerrstring, vcerrstack, ierrcount, ierrcount, toBool(NBool.True), toStr(","));
						}
						if ( ierrcount.equals(0) )
						{
							bcanpopulitm = toBool(NBool.True);
							errTypeOut.val = toStr("NONE");
						}
						else {
							errTypeOut.val = vcerrstack;
						}
					}
				}
			}
			return bcanpopulitm;
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trgNameIn
		*/
		public NBool localTrgExists(NString trgNameIn)
		{
			final NString VCCURRSUBPROG = toStr("LOCAL_TRG_EXISTS");
			NString vcglobalname= NString.getNull();
			NBool blocalexists = toBool(NBool.False);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			if ( trgNameIn.equals("WF_RELEASE") )
			{
				vcglobalname = toStr("WF_LOCAL_RELEASE_EXISTS");
			}
			else if ( trgNameIn.equals("WF_SUBMIT") ) {
				vcglobalname = toStr("WF_LOCAL_SUBMIT_EXISTS");
			}
			if ( !vcglobalname.isNull() && isNull(getNameIn(toStr("GLOBAL.").append(vcglobalname)), "N").equals("Y") )
			{
				blocalexists = toBool(NBool.True);
			}
			return blocalexists;
		}
/* <p>
		* ------------------------
		* ------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isEnterQueryMode()
		{
			final NString VCCURRSUBPROG = toStr("IS_ENTER_QUERY_MODE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getMode(), "NONE").equals("ENTER-QUERY")));
		}

		

		public NBool isCommitOverride()
		{
			final NString VCCURRSUBPROG = toStr("IS_COMMIT_OVERRIDE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getNameIn("GLOBAL.WF_PERFORM_COMMIT"), "Y").equals("N")));
		}

		
		public NBool isInquiryForm()
		{
			final NString VCCURRSUBPROG = toStr("IS_INQUIRY_FORM");
			NString vccurrform= NString.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vccurrform = isNull(getCurrentTaskName(), "NONE");
			return toBool((in(substring(vccurrform, toInt(3), toInt(1)), "C", "I").getValue() || substring(vccurrform, toInt(1), toInt(3)).equals("FTV")));
		}

		
		public NBool isQueryOnlyRole()
		{
			final NString VCCURRSUBPROG = toStr("IS_QUERY_ONLY_ROLE");
			NString vccurrform= NString.getNull();
			NString vccurruser= NString.getNull();
			NString vccurrrole= NString.getNull();
			NBool bisqueryonly = toBool(NBool.False);
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			vccurrform = getCurrentTaskName();
			vccurruser = getNameIn("GLOBAL.CURRENT_USER");
			if ( !vccurrform.isNull() && !vccurruser.isNull() )
			{
				vccurrrole = isNull(GSecurity.FgGetRoleForObjectFnc(vccurrform, vccurruser), "NONE");
				if ( substring(vccurrrole, - (2), toInt(2)).equals("_Q") )
				{
					bisqueryonly = toBool(NBool.True);
				}
			}
			return bisqueryonly;

		}

		
		public NBool areChangesToSave()
		{
			final NString VCCURRSUBPROG = toStr("ARE_CHANGES_TO_SAVE");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getTaskStatus(), "NONE").notEquals("QUERY")));
		}

		
		public NBool isWfSubmitted()
		{
			final NString VCCURRSUBPROG = toStr("IS_WF_SUBMITTED");
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			return toBool((isNull(getNameIn("GLOBAL.WF_SUBMITTED"), "N").equals("Y")));
		}
		
	
	
}
