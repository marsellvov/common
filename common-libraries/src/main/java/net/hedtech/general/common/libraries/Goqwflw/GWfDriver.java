package net.hedtech.general.common.libraries.Goqwflw;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.commands.CommandScope;
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

public class GWfDriver extends AbstractSupportCodeObject {
	

	public GWfDriver(ISupportCodeContainer container) {
		super(container);
		// 5000-1 Add the following calls to set a default value for the global variables
		//        that indicate the current user, operating system and user interface.  This
		//        will enable the subprograms of this library to execute even if these
		//        globals do not yet exist.
		setDefaultValue(getUser(), "GLOBAL.CURRENT_USER");
		
//		MORPHIS TODO <DO>: Case sensitive
//		setDefaultValue(System.getProperty("OS.NAME"), "GLOBAL.OS_IND");
		setDefaultValue(System.getProperty("os.name"), "GLOBAL.OS_IND");
				
		setDefaultValue(getUserInterface(), "GLOBAL.USER_INTERFACE");
		
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_DRIVER
	/*
	PACKAGE G$_WF_DRIVER IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_DRIVER provides the interface needed to
  serve as the gateway by which all Workflow-specific procedures
  and functions that need to be consistently called outside
  of the GOQWFLW library were implemented for the 4.0 release.

  This was done to reduce the possibility of having to regenerate
  all forms upon delivery of the full Workflow support release
  of Banner.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public variables
--*

--  The WF_TIMER_NAME constant holds the name of the timer
--  that polls for valid Workflow tasks and activities to perform
--  in Banner.

--  4100-1 Modify initialization clause to use the actual value
--         of the Workflow timer name instead of NULL.

  WF_TIMER_NAME   CONSTANT  VARCHAR2(30) := 'WORKFLOW';

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_EXECUTE will execute one of the public
  packaged procedures or functions of this library given a
  specific command as an argument.

  If a form is modified to use this procedure and it sends an
  invalid command, the user will be notified at runtime.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE WF_EXECUTE(p_command IN VARCHAR2);

END G$_WF_DRIVER;
	*/
	
			// --------------------------------------------------------------*\
		// The package G$_WF_DRIVER provides the interface needed to
		// serve as the gateway by which all Workflow-specific procedures
		// and functions that need to be consistently called outside
		// of the GOQWFLW library were implemented for the 4.0 release.
		// This was done to reduce the possibility of having to regenerate
		// all forms upon delivery of the full Workflow support release
		// of Banner.
		// \*--------------------------------------------------------------
		// *
		// * Declare public variables
		// *
		//   The WF_TIMER_NAME constant holds the name of the timer
		//   that polls for valid Workflow tasks and activities to perform
		//   in Banner.
		//   4100-1 Modify initialization clause to use the actual value
		//          of the Workflow timer name instead of NULL.
		public final NString WF_TIMER_NAME = toStr("WORKFLOW");

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_DRIVER
		/*
		PACKAGE BODY G$_WF_DRIVER IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_DRIVER';

--*
--* Define public subprogram bodies
--*

 PROCEDURE WF_EXECUTE(p_command IN VARCHAR2) IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'WF_EXECUTE';

 BEGIN
-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
  G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' BEGIN - COMMAND:' || p_command);

  CASE p_command
    WHEN 'WF_INIT_GLOBALS' THEN

    -- This command is sent to this procedure at the start-up of forms
    -- (e.g., GUAINIT, GSASECR) to ensure that the appropriate
    -- Workflow-specific globals are initialized.

      G$_WF_WAIT_FOR_WORK.WF_INIT_GLOBALS;

    WHEN 'WF_SET_ACTIONQUEUE_IOR' THEN

    -- 5000-1 Added support for indirectly calling this new procedure.
    --
    -- This command is sent to this procedure at the start-up of forms
    -- (e.g., GUAINIT, GSASECR) to ensure that communication between
    -- Workflow and a Banner session is established.
		
    -- Deprecated... similar functionality now takes place durring wf_init_globals
      NULL;

    WHEN 'WF_PERFORM_AUTO_LOGON' THEN

    -- 5000-1 Added support for indirectly calling this new procedure.
    --
    -- This command is sent to this procedure at the start-up of forms
    -- (e.g., GUAINIT, GSASECR) to automatically log a user into
    -- a Banner session with his/her userid and password
    -- from Workflow if no other userid and password is specified.

      G$_WF_WAIT_FOR_WORK.WF_PERFORM_AUTO_LOGON;

    WHEN 'WF_MAKE_TIMER' THEN

    -- This command is sent to this procedure at the start-up of a form
    -- (e.g., GUAGMNU) to create the timer that will listen for workflow
    -- tasks and activities to launch.

      G$_WF_WAIT_FOR_WORK.WF_MAKE_TIMER;

    WHEN 'WF_CHECK_MSG' THEN

    -- This command is sent to this procedure at the expiration of a
    -- timer in a form (e.g., GUAGMNU) to check to see if there are
    -- any requests to launch a workflow task or activity.

      G$_WF_WAIT_FOR_WORK.WF_CHECK_MSG;

    WHEN 'WF_DISCONNECT_B2K' THEN

    -- This command is sent to this procedure at the exiting of
    -- a Banner session to sever communications between
    -- that session and Workflow, and to notify Workflow
    -- that the severing has taken place.

      G$_WF_WAIT_FOR_WORK.WF_DISCONNECT_B2K;

    WHEN 'WF_CONTROL_EXT_NAVIGATION' THEN

    -- This command is sent to this procedure at the start-up
    -- of each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- This command was initially intended to prevent navigation
    -- outside of a form that has been launched as a workflow activity.
    -- It was revised to more generically control the behavior
    -- of a form that has been launched as a workflow task, activity,
    -- or Workflow Electronic Documents apply activity when it is
    -- entered.  See the documentation in this library for the following
    -- invoked procedure for more details.

      G$_WF_CONTROL_FORM.WF_CONTROL_ENTRY;

    WHEN 'WF_CONTROL_KEY_BLOCK' THEN

    -- This command is sent to this procedure whenever a block
    -- is entered in each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- However, the procedure this command invokes is limited
    -- to controlling the behavior of the Key Block of a form
    -- that has been launched as a workflow activity.  See the
    -- documentation in this library for the following invoked
    -- procedure for more details.

      G$_WF_CONTROL_FORM.WF_CONTROL_NEW_BLOCK;

    WHEN 'WF_CONTROL_ROLLBACK' THEN

    -- This command is sent to this procedure whenever a rollback
    -- is performed on a form that doesn't contain its own
    -- KEY-CLRFRM trigger.
    --
    -- Because the KEY-CLRFRM trigger, though, was not included
    -- as part of the conversion to Banner release 4.0, it
    -- could not be relied on as a trigger that wouldn't exist
    -- locally in many forms.  Thus, this command executes no
    -- logic.  The logic that controls what occurs in the
    -- the Key Block when a rollback is performed is contained
    -- within the G$_WF_CONTROL_FORM.CONTROL_NEW_BLOCK procedure.

      NULL;

    WHEN 'WF_SET_COMMIT_OVERRIDE' THEN

    -- This command is sent to this procedure by forms that
    -- have been modified to programmatically prevent the
    -- execution of Commit logic when a Workflow Submit
    -- is performed.  Forms can also invoke the following
    -- procedure directly.

      G$_WF_CONTROL_FORM.WF_SET_COMMIT_OVERRIDE;

    WHEN G$_WF_HEADER.SUBMIT_ICONAME THEN

    -- This command is sent to this procedure whenever
    -- a user invokes the Workflow Submit function
    -- in each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- Specifically, if the trigger that is executed
    -- when the Workflow Submit button is pressed successfully
    -- sends the name of the Workflow Submit icon to this
    -- procedure, the appropriate Workflow Submit logic
    -- will be performed.  See the documentation
    -- in this library for the following invoked
    -- procedure for more details on what occurs when
    -- a Workflow Submit is performed.

      G$_WF_CONTROL_FORM.WF_SUBMIT;

    WHEN G$_WF_HEADER.CONTINUE_ICONAME THEN

    -- This command is sent to this procedure whenever
    -- a user invokes the Workflow Continue function
    -- in each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- Specifically, if the trigger that is executed
    -- when the Workflow Continue button is pressed successfully
    -- sends the name of the Workflow Continue icon to this
    -- procedure, the appropriate Workflow Continue logic
    -- will be performed.
    --
    -- This conditional branch is being used as a placeholder
    -- for the logic that will be performed when support
    -- for the Workflow Continue function is provided in a
    -- future release that is expected to support the
    -- execution of QuickFlows as workflow activities.
    -- Before that time, the Workflow Continue button
    -- will continue to be disabled.

      NULL;

    WHEN G$_WF_HEADER.RELEASE_ICONAME THEN

    -- This command is sent to this procedure whenever
    -- a user invokes the Workflow Release function
    -- in each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- Specifically, if the trigger that is executed
    -- when the Workflow Release button is pressed successfully
    -- sends the name of the Workflow Release icon to this
    -- procedure, the appropriate Workflow Release logic
    -- will be performed.  See the documentation
    -- in this library for the following invoked
    -- procedure for more details on what occurs when
    -- a Workflow Release is performed.

      G$_WF_CONTROL_FORM.WF_RELEASE;
-- 80-4 remove Electronic Documents module references
--    WHEN G$_WF_HEADER.APPLY_ICONAME THEN

    -- This command is sent to this procedure whenever
    -- a user invokes the Workflow (Electronic Documents)
    -- Apply function in each form that has been appropriately
    -- converted to use the new user interface and programming
    -- standards of Banner release 4.0.
    --
    -- Specifically, if the trigger that is executed
    -- when the Workflow Apply button is pressed successfully
    -- sends the name of the Workflow Apply icon to this
    -- procedure, the appropriate Workflow Apply logic
    -- will be performed.
    --
    -- The purpose of the Workflow Apply (i.e., "Open Electronic
    -- Document") button is to call the Workflow Electronic
    -- Documents Data Form in Open mode so that a user
    -- can toggle back and forth between that form and
    -- the form on which the Workflow Apply was invoked and
    -- can therefore apply the appropriate data to the form.

--      G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),G$_WF_HEADER.WFED_DATA_FORM,'OPEN');

    WHEN G$_WF_HEADER.DEBUG_ICONAME THEN

    -- This command is sent to this procedure whenever
    -- a user invokes the Workflow Debug function
    -- in each form that has been appropriately converted
    -- to use the new user interface and programming standards
    -- of Banner release 4.0.
    --
    -- Specifically, if the trigger that is executed
    -- when the Workflow Debug button is pressed successfully
    -- sends the name of the Workflow Debug icon to this
    -- procedure, the appropriate Workflow Debug logic
    -- will be performed.  See the documentation
    -- in this library for the following invoked
    -- procedure for more details on what occurs when
    -- a Workflow Debug is performed.

      G$_WF_ERROR.WF_CAPTURE_CURRENT_STATE;

    WHEN 'WF_CONTROL_EXIT' THEN

    -- This command is sent to this procedure whenever an exit
    -- has been performed on each form that has been appropriately
    -- converted to use the new user interface and programming
    -- standards of Banner release 4.0.
    --
    -- This command specifically controls the behavior of a form
    -- that was a workflow activity and that has been exited.
    -- See the documentation in this library for the following
    -- invoked procedure for more details on what occurs when
    -- a form is exited.

      G$_WF_CONTROL_FORM.WF_CONTROL_EXIT;

    ELSE

    -- Notify the user that an invalid command has been sent to this procedure by an
    -- Oracle Forms module so that the appropriate corrective action can be taken by
    -- the designer of the module.

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0187','LIB','*ERROR* An undefined Workflow function has been executed.'),'MESSAGE',FALSE,FALSE);
      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0188','LIB','''%01%'' is not a valid argument to %02%.%03%.',p_command,vcCurrProgUnit,vcCurrSubprog),'MESSAGE',FALSE,TRUE);
  END CASE;

-- Note:  The following string is not wrappered with G$_NLS.Get function because at this point
-- there is no connection to the database to be able to use the function.
   G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ' END');

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,TRUE);

 END WF_EXECUTE;

BEGIN
 
 --5000-1 Add the following calls to set a default value for the global variables
 --       that indicate the current user, operating system and user interface.  This
 --       will enable the subprograms of this library to execute even if these
 --       globals do not yet exist.

 DEFAULT_VALUE(GET_APPLICATION_PROPERTY(USERNAME),         'GLOBAL.CURRENT_USER');
 DEFAULT_VALUE(GET_APPLICATION_PROPERTY(OPERATING_SYSTEM), 'GLOBAL.OS_IND');
 DEFAULT_VALUE(GET_APPLICATION_PROPERTY(USER_INTERFACE),   'GLOBAL.USER_INTERFACE');

END G$_WF_DRIVER;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_DRIVER");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pCommand
		*/
		public void wfExecute(NString pCommand)
		{

			final NString VCCURRSUBPROG = toStr("WF_EXECUTE");
			try
			{
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" BEGIN - COMMAND:").append(pCommand));
				if (pCommand.equals("WF_INIT_GLOBALS"))
				{
					//  This command is sent to this procedure at the start-up of forms
					//  (e.g., GUAINIT, GSASECR) to ensure that the appropriate
					//  Workflow-specific globals are initialized.
					getContainer().getGWfWaitForWork().wfInitGlobals();
				}
				else if (pCommand.equals("WF_SET_ACTIONQUEUE_IOR"))
				{
					//  5000-1 Added support for indirectly calling this new procedure.
					// 
					//  This command is sent to this procedure at the start-up of forms
					//  (e.g., GUAINIT, GSASECR) to ensure that communication between
					//  Workflow and a Banner session is established.
					//  Deprecated... similar functionality now takes place durring wf_init_globals
				}
				else if (pCommand.equals("WF_PERFORM_AUTO_LOGON"))
				{
					//  5000-1 Added support for indirectly calling this new procedure.
					// 
					//  This command is sent to this procedure at the start-up of forms
					//  (e.g., GUAINIT, GSASECR) to automatically log a user into
					//  a Banner session with his/her userid and password
					//  from Workflow if no other userid and password is specified.
					getContainer().getGWfWaitForWork().wfPerformAutoLogon();
				}
				else if (pCommand.equals("WF_MAKE_TIMER"))
				{
					//  This command is sent to this procedure at the start-up of a form
					//  (e.g., GUAGMNU) to create the timer that will listen for workflow
					//  tasks and activities to launch.
					getContainer().getGWfWaitForWork().wfMakeTimer();
				}
				else if (pCommand.equals("WF_CHECK_MSG"))
				{
					//  This command is sent to this procedure at the expiration of a
					//  timer in a form (e.g., GUAGMNU) to check to see if there are
					//  any requests to launch a workflow task or activity.
					getContainer().getGWfWaitForWork().wfCheckMsg();
				}
				else if (pCommand.equals("WF_DISCONNECT_B2K"))
				{
					//  This command is sent to this procedure at the exiting of
					//  a Banner session to sever communications between
					//  that session and Workflow, and to notify Workflow
					//  that the severing has taken place.
					getContainer().getGWfWaitForWork().wfDisconnectB2k();
				}
				else if (pCommand.equals( "WF_CONTROL_EXT_NAVIGATION"))
				{
					//  This command is sent to this procedure at the start-up
					//  of each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  This command was initially intended to prevent navigation
					//  outside of a form that has been launched as a workflow activity.
					//  It was revised to more generically control the behavior
					//  of a form that has been launched as a workflow task, activity,
					//  or Workflow Electronic Documents apply activity when it is
					//  entered.  See the documentation in this library for the following
					//  invoked procedure for more details.
					getContainer().getGWfControlForm().wfControlEntry();
				}
				else if (pCommand.equals("WF_CONTROL_KEY_BLOCK"))
				{
					//  This command is sent to this procedure whenever a block
					//  is entered in each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  However, the procedure this command invokes is limited
					//  to controlling the behavior of the Key Block of a form
					//  that has been launched as a workflow activity.  See the
					//  documentation in this library for the following invoked
					//  procedure for more details.
					getContainer().getGWfControlForm().wfControlNewBlock();
				}
				else if (pCommand.equals("WF_CONTROL_ROLLBACK"))
				{
					//  This command is sent to this procedure whenever a rollback
					//  is performed on a form that doesn't contain its own
					//  KEY-CLRFRM trigger.
					// 
					//  Because the KEY-CLRFRM trigger, though, was not included
					//  as part of the conversion to Banner release 4.0, it
					//  could not be relied on as a trigger that wouldn't exist
					//  locally in many forms.  Thus, this command executes no
					//  logic.  The logic that controls what occurs in the
					//  the Key Block when a rollback is performed is contained
					//  within the G$_WF_CONTROL_FORM.CONTROL_NEW_BLOCK procedure.
				}
				else if (pCommand.equals("WF_SET_COMMIT_OVERRIDE"))
				{
					//  This command is sent to this procedure by forms that
					//  have been modified to programmatically prevent the
					//  execution of Commit logic when a Workflow Submit
					//  is performed.  Forms can also invoke the following
					//  procedure directly.
					getContainer().getGWfControlForm().wfSetCommitOverride();
				}
				else if (pCommand.equals(GWfHeader.SUBMIT_ICONAME))
				{
					//  This command is sent to this procedure whenever
					//  a user invokes the Workflow Submit function
					//  in each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  Specifically, if the trigger that is executed
					//  when the Workflow Submit button is pressed successfully
					//  sends the name of the Workflow Submit icon to this
					//  procedure, the appropriate Workflow Submit logic
					//  will be performed.  See the documentation
					//  in this library for the following invoked
					//  procedure for more details on what occurs when
					//  a Workflow Submit is performed.
					getContainer().getGWfControlForm().wfSubmit();
				}
				else if (pCommand.equals(GWfHeader.CONTINUE_ICONAME))
				{
					//  This command is sent to this procedure whenever
					//  a user invokes the Workflow Continue function
					//  in each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  Specifically, if the trigger that is executed
					//  when the Workflow Continue button is pressed successfully
					//  sends the name of the Workflow Continue icon to this
					//  procedure, the appropriate Workflow Continue logic
					//  will be performed.
					// 
					//  This conditional branch is being used as a placeholder
					//  for the logic that will be performed when support
					//  for the Workflow Continue function is provided in a
					//  future release that is expected to support the
					//  execution of QuickFlows as workflow activities.
					//  Before that time, the Workflow Continue button
					//  will continue to be disabled.
				}
				else if (pCommand.equals(GWfHeader.RELEASE_ICONAME))
				{
					//  This command is sent to this procedure whenever
					//  a user invokes the Workflow Release function
					//  in each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  Specifically, if the trigger that is executed
					//  when the Workflow Release button is pressed successfully
					//  sends the name of the Workflow Release icon to this
					//  procedure, the appropriate Workflow Release logic
					//  will be performed.  See the documentation
					//  in this library for the following invoked
					//  procedure for more details on what occurs when
					//  a Workflow Release is performed.
					getContainer().getGWfControlForm().wfRelease();
				}
				else if (pCommand.equals(GWfHeader.DEBUG_ICONAME))
				{
					//  This command is sent to this procedure whenever
					//  a user invokes the Workflow Debug function
					//  in each form that has been appropriately converted
					//  to use the new user interface and programming standards
					//  of Banner release 4.0.
					// 
					//  Specifically, if the trigger that is executed
					//  when the Workflow Debug button is pressed successfully
					//  sends the name of the Workflow Debug icon to this
					//  procedure, the appropriate Workflow Debug logic
					//  will be performed.  See the documentation
					//  in this library for the following invoked
					//  procedure for more details on what occurs when
					//  a Workflow Debug is performed.
					getContainer().getGWfError().wfCaptureCurrentState();
				}
				else if (pCommand.equals("WF_CONTROL_EXIT"))
				{
					//  This command is sent to this procedure whenever an exit
					//  has been performed on each form that has been appropriately
					//  converted to use the new user interface and programming
					//  standards of Banner release 4.0.
					// 
					//  This command specifically controls the behavior of a form
					//  that was a workflow activity and that has been exited.
					//  See the documentation in this library for the following
					//  invoked procedure for more details on what occurs when
					//  a form is exited.
					getContainer().getGWfControlForm().wfControlExit();
				}
				else {
					//  Notify the user that an invalid command has been sent to this procedure by an
					//  Oracle Forms module so that the appropriate corrective action can be taken by
					//  the designer of the module.
					getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0187"), toStr("LIB"), toStr("*ERROR* An undefined Workflow function has been executed.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
					getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0188"), toStr("LIB"), toStr("'%01%' is not a valid argument to %02%.%03%."), pCommand, VCCURRPROGUNIT, VCCURRSUBPROG), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.True));
						
				}
				//  Note:  The following string is not wrappered with G$_NLS.Get function because at this point
				//  there is no connection to the database to be able to use the function.
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(" END"));
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.True));
				
			}
//
			
		}
		
		public boolean getWorkspaceMode() {
			Object val = Globals.getObject("WF_MODE");
			return val != null && val.equals("Y");
		}
		
		public void setWorkspaceMode(boolean mode, NString activity) {
			SimpleEntry<String, String> param1 = new SimpleEntry<String, String>("show", mode ? "true" : "false");
			SimpleEntry<String, String> param2 = new SimpleEntry<String, String>("id", activity != null && activity.isNotNull() ? activity.getValue() : null);
			TaskServices.addGenericCommand("WORKFLOW", CommandScope.Global, param1, param2);	
			
			Globals.setGlobal("WF_MODE", mode ? "Y" : "N");
		}
		
		public void setWorkspaceReuse() {
			setWorkspaceReuse(true);		
		}
		
		public void setWorkspaceReuse(boolean reuse) {
			SimpleEntry<String, String> param1 = new SimpleEntry<String, String>("reuse", reuse ? "true" : "false");
			TaskServices.addGenericCommand("WORKFLOW", CommandScope.Global, param1);			
		}
	
}
