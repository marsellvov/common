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
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.Exceptions.*;


public class GWfControlForm extends AbstractSupportCodeObject {
	

	public GWfControlForm(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONTROL_FORM
	/*
	PACKAGE G$_WF_CONTROL_FORM IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONTROL_FORM provides the interfaces needed
  to control the behavior of a form that has been launched as a
  workflow task or activity.

  Specifically, this package controls the behavior of a form
  when:

  1) a form is entered (PRE-FORM trigger has fired),
  2) a block is entered (WHEN-NEW-BLOCK-INSTANCE trigger
     has fired),
  3) the Workflow Release function is executed
     (G$_WF_BUTTON_PRESSED_TRG trigger has fired),
  4) the Workflow Submit function is executed
     (G$_WF_BUTTON_PRESSED_TRG trigger has fired), or
  5) a form is exited (POST-FORM trigger has fired).
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_CONTROL_ENTRY controls the behavior of a form
  when it is entered.  This behavior differs depending upon
  whether the current form is:

  1) a workflow task (launched from the Task List of
     Workflow),
  2) a workflow activity (launched from the Work List of
     Workflow), or
  3) a workflow Electronic Documents apply activity (launched
     from the Workflow Electronic Documents Form in Banner).
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_CONTROL_ENTRY;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_CONTROL_NEW_BLOCK controls the behavior of
  a form when one of its blocks is entered.  This exercise of
  this control been limited to when the current form is a
  workflow activity (or has been released from being a workflow
  activity), and the current block is the Key Block of the form.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_CONTROL_NEW_BLOCK;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_SET_LOCAL_TRG_EXISTS sets the value of a
  variable that indicates that a given local trigger exists
  in the current scope.

  For example, to indicate to Banner that a local
  WF_RELEASE_TRG should be executed whenever a user executes
  the Workflow Release function in the current scope of a form
  that has been launched as a workflow activity, the form
  would invoke:

  G$_WF_CONTROL_FORM.WF_SET_LOCAL_TRG_EXISTS('WF_RELEASE');
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_SET_LOCAL_TRG_EXISTS  (trg_name_in           VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_RESET_LOCAL_TRG_EXISTS sets the value of a
  variable that indicates that a given local trigger does not
  exist in the current scope. This is the default value for
  that variable.

  The execution of this procedure is therefore only necessary
  in a form if:

  1) that form had previously communicated to Banner
  that a local trigger exists in a specific scope using
  the WF_SET_LOCAL_TRG_EXISTS procedure, and

  2) the user has left the scope in which the local trigger
     is defined.

  For example, to indicate to Banner that a local
  WF_RELEASE_TRG should not be executed whenever a user
  executes the Workflow Release function in the current scope
  of a form that has been launched as a workflow activity,
  the form would invoke:

  G$_WF_CONTROL_FORM.WF_RESET_LOCAL_TRG_EXISTS('WF_RELEASE');

  If the WF_RELEASE_TRG was defined at the Form level because
  it should always be executed without exception, then the form
  should not execute WF_RESET_LOCAL_TRG_EXISTS at any time.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_RESET_LOCAL_TRG_EXISTS(trg_name_in           VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_RELEASE, invoked when a user selects the
  Workflow Release function on a form launched as a workflow
  activity, executes a local WF_RELEASE_TRG should it exist
  in the current scope, unregisters the form as a workflow
  activity to Banner, and resets all visual cues that
  indicated that the form was a workflow activity.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_RELEASE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_SET_COMMIT_OVERRIDE sets the value of a
  variable that indicates that Banner should not perform a
  Commit when the user selects the Workflow Submit function
  in the current scope of a form launched as a workflow activity.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_SET_COMMIT_OVERRIDE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_RESET_COMMIT_OVERRIDE sets the value of a
  variable that indicates that Banner should perform a
  Commit when the user selects the Workflow Submit function
  in the current scope of a form launched as a workflow activity.
  This is the default value for that variable.

  The execution of this procedure is therefore only necessary
  in a form if:

  1) that form had previously communicated to Banner
  that a Commit should not be performed in a specific scope
  using the WF_SET_COMMIT_OVERRIDE procedure, and

  2) the user has left the scope in which the Commit should
     not be performed.

  If the WF_SET_COMMIT_OVERRIDE procedure was executed at the
  Form level because a Commit should never be performed without
  exception, then the form should not execute
  WF_RESET_COMMIT_OVERRIDE at any time.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_RESET_COMMIT_OVERRIDE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_SUBMIT, invoked when a user selects the
  Workflow Submit function on a form launched as a workflow
  activity, performs a Commit if there are any changes to save
  and the appropriate conditions are met, executes a local
  WF_SUBMIT_TRG should it exist in the current scope, extracts
  any and all updated action parameter values from the form
  and returns them to Workflow, declares the workflow
  activity complete to Workflow, unregisters the form
  as a workflow activity to Banner, resets all visual
  cues that indicated that the form was a workflow activity,
  and attempts to exit the form.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_SUBMIT;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_CONTROL_EXIT, invoked after a user or
  Banner itself has attempted to exit a form, unregisters
  the form as a workflow activity to Banner and resets visual
  cues that indicated that the form was a workflow activity if
  the user has not already performed a Workflow Submit or
  a Workflow Release on that form.

  This ensures that Workflow treats an exit from a form
  exactly the same as a Workflow Release and then an exit from
  that form.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_CONTROL_EXIT;

END G$_WF_CONTROL_FORM;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONTROL_FORM
		/*
		PACKAGE BODY G$_WF_CONTROL_FORM IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONTROL_FORM';

--*
--* Declare private subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure INSERT_WF_ACTIVITY_STACK inserts a value at
  the end of a variable that acts like a stack which reflects
  whether the current form is a workflow task, a workflow
  activity, or neither.

  This procedure operates on the premise that if the stack
  already contains a value which indicates that a workflow
  task or activity is already in progress, it is not
  possible for any other form that is opened to be treated
  like a workflow task or activity until the in-progress
  activity is terminated (the form that represents the activity
  is exited and the appropriate value is deleted from the stack).
 
  Additional logic for the future support of the treatment
  of QuickFlows as workflow activites is also present, but is
  not currently used or supported.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE INSERT_WF_ACTIVITY_STACK;

<multilinecomment>--------------------------------------------------------------*\
  The procedure RESET_WF_ACTIVITY_STACK resets the appropriate
  values within a variable that acts like a stack which reflects
  whether the current form is a workflow task, a workflow
  activity, or neither.  By resetting the stack, any future
  inquiries into whether the current form is a workflow
  activity will return FALSE instead of TRUE.  Thus, this
  procedure has the effect of unregistering the current
  form as a workflow activity.

  Additional logic for the future support of the treatment
  of QuickFlows as workflow activities is also present, but is
  not currently used or supported.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RESET_WF_ACTIVITY_STACK;

<multilinecomment>--------------------------------------------------------------*\
  The procedure DELETE_WF_ACTIVITY_STACK deletes a value from
  the end of a variable that acts like a stack which reflects
  whether the current form is a workflow task, a workflow
  activity, or neither.  This ensures that when the form that
  represents a workflow task or activity is exited, the
  appropriate value is deleted from the stack so that any future
  insertions into the stack will first successfully recognize
  that no workflow task or activity is currently active and thus
  that the current form could become a task or activity if
  the user has requested this.

  As evident from the above, this procedure operates on the
  premise that if the stack already contains a value which
  indicates that a workflow task or activity is already in
  progress, it is not possible for any other form that is
  opened to be treated like a workflow task or activity
  until the in-progress activity is terminated.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE DELETE_WF_ACTIVITY_STACK;

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_RESET_FORM_STATUS forces validation
  to ensure that any subsequent inquiries into a form's status
  will accurately reflect whether there are any changes to
  save on the current form.

  This procedure additionally returns as an output parameter
  a Boolean success indicator.  If any errors are encountered
  in forcing validation on the current form, this success
  indicator should be FALSE.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_RESET_FORM_STATUS    (success_ind_out  OUT  BOOLEAN);

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_WF_SUBMITTED sets to a given 'Y' or 'N' value
  a variable which indicates whether a user has successfully
  performed the Workflow Submit function.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_WF_SUBMITTED        (submitted_ind_in      VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure DECLARE_WORK_COMPLETE notifies Workflow that
  a workflow activity is complete given its workflow activity ID.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE DECLARE_WORK_COMPLETE   (work_id               VARCHAR2);

--*
--* Define public subprogram bodies
--*


 PROCEDURE WF_CONTROL_ENTRY IS
  vcCurrSubprog CONSTANT VARCHAR2(30) := 'WF_CONTROL_ENTRY';
  vcDebugHeader CONSTANT VARCHAR2(100) := vcCurrProgUnit || '.' || vcCurrSubprog;

 BEGIN
    G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0110','LIB','%01% BEGIN',vcDebugHeader));

		-- Regardless of how the current form was launched, insert a value into
		-- the workflow activity stack variable to enable the determination of
		-- how the form was launched and disable all iconic toolbar buttons
		-- that relate to Workflow or Workflow Electronic Documents.

		INSERT_WF_ACTIVITY_STACK;

		G$_WF_ICONS.WF_DISABLE_ICONS;

		-- If the current form is a workflow activity, bring the form into focus,
		-- append the activity name to the MDI application window title, enable
		-- the Workflow Submit and Workflow Release iconic buttons, and extract
		-- from Workflow and validate the action parameter names and values
		-- associated with the workflow activity.

		IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN
  		G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0111','LIB','%01%: The current form is considered a Workflow activity.',vcDebugHeader));
  		G$_WF_SET_FOCUS.SET_FOCUS;
  		G$_WF_SET_FOCUS.SET_WIN_TITLE;  

			G$_WF_ICONS.WF_ENABLE_ICONS;
  		  
  		G$_WF_CONTEXT_PROCESS_IN.EXTRACT_PARAMS(G$_WF_WAIT_FOR_WORK.GET_CURR_WF_WORK_ID);

  		G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0112','LIB','%01%: Parameters (if any) have been extracted.',vcDebugHeader));

  		IF G$_WF_CONDITIONS.CONTEXT_EXISTS THEN    	
					G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0113','LIB','%01%: Context exists.',vcDebugHeader));			
					IF G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(TRUE) THEN      	
							G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0114','LIB','%01%: Parameters have been located.',vcDebugHeader));
      				IF G$_WF_CONTEXT_VALIDATE.ALL_PARAM_NAMES_ARE_VALID_ITMS THEN
									G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0115','LIB','%01%: All parameter names are valid form items.',vcDebugHeader));
        					IF NOT G$_WF_CONTEXT_VALIDATE.NO_PARAMS_HAVE_INPUT_VALS THEN
          						G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0116','LIB','%01%: One or more parameters have an input value.',vcDebugHeader));
          						IF G$_WF_CONTEXT_VALIDATE.CAN_POPULATE_ALL_ITMS THEN
            							G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0117','LIB','%01%: All items can be populated.',vcDebugHeader));
          						END IF;
        					END IF;
      				END IF;
    			END IF;
  		END IF;

		-- If the current form is a workflow task, then simply bring
		-- the form into focus.

		ELSIF G$_WF_CONDITIONS.IS_WF_TASK THEN
  			G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0118','LIB','%01% : The current form is considered a Workflow task.',vcDebugHeader));
  			G$_WF_SET_FOCUS.SET_FOCUS;

				-- If the current form is a workflow passthrough form, then only
        -- spool a debug message acknowledging this fact (should tracing
				-- be enabled).

		ELSIF G$_WF_CONDITIONS.IS_WF_PASSTHROUGH_FORM THEN
  			G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0119','LIB','%01%: The current form is considered a Workflow pass-through form.',vcDebugHeader));

				-- If the current form is a workflow Electronic Documents
				-- apply activity, then enable the Open Electronic Document
				-- iconic button.
				
-- 80-4 remove Electronic Documents module references
--		ELSIF G$_WF_CONDITIONS.IS_WFED_APPLY_ACTIVITY THEN
--  			G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || ': The current form is considered a Workflow Electronic Documents apply activity.');
  
				-- G$_TOOLBAR.ENABLE(G$_WF_HEADER.APPLY_ICONAME);    
				-- TODO:  Figure out what the APPLY icon is and what it is in the ICONS and WORKFLOW context.
				-- SET_MENU_ITEM_PROPERTY('ICONS.WF_OPEN'       ,ENABLED ,PROPERTY_TRUE);    
				-- SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_OPEN'    ,ENABLED ,PROPERTY_TRUE);
      

	  -- If the current form is none of the above, then only spool
    -- a debug message acknowledging this fact (should tracing
	  -- be enabled).
	  
	  ELSIF G$_WF_CONDITIONS.IS_MATCHING_FORM THEN
				G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0120','LIB','%01%: The current form is a matching form and will be ignored.',vcDebugHeader));		
	  
	  ELSE
	    	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0121','LIB','%01%: The current form is not considered a Workflow task, activity, pass-through form, or Electronic Documents apply activity.',vcDebugHeader));
	  END IF;
-- -- --
-- -- --
    IF NAME_IN('GLOBAL.WF_ARGS') IS NOT NULL THEN
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS'   ,ENABLED ,PROPERTY_FALSE);
      SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS'   ,LABEL   ,G$_NLS.Get('GOQWFLW-0122','LIB','Multi-Entity Processing not enabled'));
    END IF;
-- -- --
-- -- --	
  	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0123','LIB','%01% END',vcDebugHeader));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

 END WF_CONTROL_ENTRY;

----------------------
----------------------

 PROCEDURE WF_CONTROL_NEW_BLOCK IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'WF_CONTROL_NEW_BLOCK';
  vcTrgBlock               VARCHAR2(30);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0124','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  vcTrgBlock := NAME_IN('SYSTEM.TRIGGER_BLOCK');

  IF G$_WF_CONDITIONS.IS_KEY_BLOCK(vcTrgBlock) THEN

    G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0125','LIB','%01%.%02%: The trigger block is the Key Block.',vcCurrProgUnit,vcCurrSubprog));

    -- If the current form is a workflow activity, then evaluate whether any Key Block items
    -- have already been populated with input action parameter values.

    IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN
				G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0126','LIB','%01%.%02%: Form is an activity.',vcCurrProgUnit,vcCurrSubprog));

      	IF G$_WF_CONDITIONS.CONTEXT_EXISTS THEN
						G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0127','LIB','%01%.%02%: Context exists.',vcCurrProgUnit,vcCurrSubprog));

        		IF G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(TRUE) THEN
								G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0128','LIB','%01%.%02%: Can locate context parameters.',vcCurrProgUnit,vcCurrSubprog));
 
          			-- If Key Block items have already been populated, then repopulate them now that input
          			-- focus has been placed again into the Key Block.          
          			IF G$_WF_CONDITIONS.IS_CONTEXT_POPULATED THEN
            				G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0129','LIB','%01%.%02%: Context has already been populated.',vcCurrProgUnit,vcCurrSubprog));                    			
            				G$_WF_CONTEXT_PROCESS_IN.REPOPULATE_CONTEXT;                                   
            				G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0130','LIB','%01%.%02%: Context has been repopulated.',vcCurrProgUnit,vcCurrSubprog));

				          	-- If Key Block items have not been populated, then determine whether there are any
				          	-- items to populate, validate that no input action parameter values exceed maximum
				          	-- item length, and populate the Key Block items with the appropriate parameter values.

		          	ELSIF NOT G$_WF_CONTEXT_VALIDATE.NO_PARAMS_HAVE_INPUT_VALS THEN		
		            		G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0131','LIB','%01%.%02%: One or more parameters have an input value.',vcCurrProgUnit,vcCurrSubprog));

            				IF G$_WF_CONTEXT_VALIDATE.NO_KEY_ITM_MAX_LN_EXCEEDED THEN
              					G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0132','LIB','%01%.%02%: No Key Block item has exceeded max length.',vcCurrProgUnit,vcCurrSubprog));
              					G$_WF_CONTEXT_PROCESS_IN.POPULATE_CONTEXT;                           				
	              				G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0133','LIB','%01%.%02%: Context has been populated.',vcCurrProgUnit,vcCurrSubprog));
  	          			END IF;
			          END IF;
      	  	END IF;
				END IF;
          			
        -- Since context has now been passed in enable the icons.
        G$_WF_ICONS.WF_ENABLE_ICONS;

    ELSIF G$_WF_CONDITIONS.CONTEXT_EXISTS THEN

      -- If the form is not considered a workflow activity
      -- but there are still Key Block items that are protected
      -- from insert or update, then unprotect those items
      -- now that input focus has returned to the Key Block
      -- so that the user can update the Key Block as necessary
      -- to use the form in a non-Workflow context.
      --
      -- Additionally delete the construct that holds
      -- action parameter names, values, and attributes
      -- and their associations with form items since
      -- this information is no longer needed.

      IF G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(FALSE) THEN

        IF NOT G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_PROTECTED THEN
          G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0134','LIB','%01%.%02%: The current form is no longer a Workflow activity, but its Key Block items have not yet been unprotected.',vcCurrProgUnit,vcCurrSubprog));

          G$_WF_CONTROL_KEY_ITMS.UNPROTECT_KEY_ITMS;

          G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0135','LIB','%01%.%02%: Key Block items have been unprotected.',vcCurrProgUnit,vcCurrSubprog));

          G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;

          G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0136','LIB','%01%.%02%: The parameters have now been deleted.',vcCurrProgUnit,vcCurrSubprog));

        END IF;

      END IF;
 
    END IF;
 
  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0137','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

 END WF_CONTROL_NEW_BLOCK;

----------------------
----------------------

 PROCEDURE WF_SET_LOCAL_TRG_EXISTS(trg_name_in  VARCHAR2) IS
  vcCurrSubprog   CONSTANT  VARCHAR2(30) := 'WF_SET_LOCAL_TRG_EXISTS';
  vcGlobalName              VARCHAR2(30);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0138','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN
    IF trg_name_in = 'WF_RELEASE' THEN
      vcGlobalName := 'WF_LOCAL_RELEASE_EXISTS';
    ELSIF trg_name_in = 'WF_SUBMIT' THEN
      vcGlobalName := 'WF_LOCAL_SUBMIT_EXISTS';
    END IF;

    IF vcGlobalName IS NOT NULL THEN
      COPY('Y', 'GLOBAL.' || vcGlobalName);
    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0139','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

 END WF_SET_LOCAL_TRG_EXISTS;

----------------------
----------------------

 PROCEDURE WF_RESET_LOCAL_TRG_EXISTS(trg_name_in  VARCHAR2) IS
  vcCurrSubprog   CONSTANT  VARCHAR2(30) := 'WF_RESET_LOCAL_TRG_EXISTS';
  vcGlobalName              VARCHAR2(30);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0140','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN
    IF trg_name_in = 'WF_RELEASE' THEN
      vcGlobalName := 'WF_LOCAL_RELEASE_EXISTS';
    ELSIF trg_name_in = 'WF_SUBMIT' THEN
      vcGlobalName := 'WF_LOCAL_SUBMIT_EXISTS';
    END IF;

    IF vcGlobalName IS NOT NULL THEN
      COPY('N', 'GLOBAL.' || vcGlobalName);
    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0141','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_RESET_LOCAL_TRG_EXISTS;

----------------------
----------------------

 PROCEDURE WF_RELEASE IS
  vcCurrSubprog            CONSTANT  VARCHAR2(30) := 'WF_RELEASE';
  vcCursorBlk                        VARCHAR2(30);
  excLocalReleaseFailure             EXCEPTION;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0142','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN

    -- Execute a local WF_RELEASE_TRG if it has been
    -- identified to exist in the current scope.

    IF G$_WF_CONDITIONS.LOCAL_TRG_EXISTS('WF_RELEASE') THEN
      EXECUTE_TRIGGER('WF_RELEASE_TRG');

      -- If the execution of the WF_RELEASE_TRG fails
      -- or specifically raises FORM_TRIGGER_FAILURE
      -- to indicate failure, present the user
      -- with an appropriate error message.

      IF NOT FORM_SUCCESS THEN
        RAISE excLocalReleaseFailure;
      END IF;

    END IF;

    -- Unregister the form as a workflow activity.

    RESET_WF_ACTIVITY_STACK;
    G$_WF_WAIT_FOR_WORK.SET_CURR_WF_REQUEST_TYPE(NULL);

    -- Disable the Workflow iconic buttons to prevent
    -- the execution of any further Workflow functions.

	  G$_WF_ICONS.WF_DISABLE_ICONS;
    
    -- Strip the name of the workflow activity
    -- from the MDI window title bar.

    G$_WF_SET_FOCUS.RESET_WIN_TITLE;

    IF G$_WF_CONDITIONS.CONTEXT_EXISTS AND
       G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(TRUE) THEN

      -- If any Key Block items are highlighted,
      -- remove the highlight.

      IF NOT G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_HIGHLIGHTED THEN
        G$_WF_CONTROL_KEY_ITMS.UNHIGHLIGHT_KEY_ITMS;
      END IF;

      -- If no Key Block items potentially need to be
      -- unprotected later if the user navigates back
      -- to the Key Block, then it is safe to delete
      -- the construct that identifies the Key Block
      -- items that are currently protected along
      -- with the action parameter name and value info, etc.

      IF G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_PROTECTED THEN
        G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;

      ELSE
        vcCursorBlk := NAME_IN('SYSTEM.CURSOR_BLOCK');

        -- If one or more Key Block items are protected from
        -- insert or update and the user is currently placed
        -- in the Key Block, unprotect those items so that
        -- the user can update the Key Block as necessary
        -- to use the form in a non-Workflow context.
        --
        -- Additionally delete the construct that holds
        -- action parameter names, values, and attributes
        -- and their associations with form items since
        -- this information is no longer needed.

        IF G$_WF_CONDITIONS.IS_KEY_BLOCK(vcCursorBlk) THEN
          G$_WF_CONTROL_KEY_ITMS.UNPROTECT_KEY_ITMS;
          G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;
        END IF;

      END IF;

    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0143','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN excLocalReleaseFailure THEN

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0144','LIB','*ERROR* The Workflow Release logic that is local to this form has encountered an error.'),
                               'MESSAGE',FALSE,FALSE);

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0145','LIB','Please resolve the errors encountered before submitting or re-releasing the activity.'),
                               'MESSAGE',FALSE,FALSE);

   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_RELEASE;

----------------------
----------------------

 PROCEDURE WF_SET_COMMIT_OVERRIDE IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'WF_SET_COMMIT_OVERRIDE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0146','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY THEN
    COPY('N', 'GLOBAL.WF_PERFORM_COMMIT');
  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0147','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 END WF_SET_COMMIT_OVERRIDE;

----------------------
----------------------

 PROCEDURE WF_RESET_COMMIT_OVERRIDE IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'WF_RESET_COMMIT_OVERRIDE';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0148','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  COPY('Y', 'GLOBAL.WF_PERFORM_COMMIT');

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0149','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 END WF_RESET_COMMIT_OVERRIDE;

----------------------
----------------------

 PROCEDURE WF_SUBMIT IS
  vcCurrSubprog        CONSTANT  VARCHAR2(30)   := 'WF_SUBMIT';
  bCanCommitForm                 BOOLEAN        := TRUE;
  bResetSuccess                  BOOLEAN        := FALSE;
  vcCursorBlk                    VARCHAR2(30);
  vcParamString                  VARCHAR2(2000);
  excFormModeFailure             EXCEPTION;
  excResetFormFailure            EXCEPTION;
  excCommitFormFailure           EXCEPTION;
  excLocalSubmitFailure          EXCEPTION;
  excExtractOutFailure           EXCEPTION;
  excExitFormFailure             EXCEPTION;
 
 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0150','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY AND
     NOT G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN

    SET_WF_SUBMITTED('Y');

    -- If the current form is in Enter Query mode,
    -- present the user with the appropriate error message.

    IF G$_WF_CONDITIONS.IS_ENTER_QUERY_MODE THEN
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0151','LIB','%01%.%02%: The current form is in enter query mode.',vcCurrProgUnit,vcCurrSubprog));
      RAISE excFormModeFailure;
    END IF;

    -- If any of the following conditions are not met, then set
    -- to FALSE the variable that determines whether a Commit
    -- will be performed.

    IF G$_WF_CONDITIONS.IS_COMMIT_OVERRIDE THEN
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0152','LIB','%01%.%02%: The commit override has been set.',vcCurrProgUnit,vcCurrSubprog));
      bCanCommitForm := FALSE;

    ELSIF G$_WF_CONDITIONS.IS_INQUIRY_FORM THEN
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0153','LIB','%01%.%02%: The current form is considered an inquiry form.',vcCurrProgUnit,vcCurrSubprog));
      bCanCommitForm := FALSE;

    ELSIF G$_WF_CONDITIONS.IS_QUERY_ONLY_ROLE THEN
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0154','LIB','%01%.%02%: The current form is associated with a query only role.',vcCurrProgUnit,vcCurrSubprog));
      bCanCommitForm := FALSE;

    ELSE

      -- Force validation to reset the form's status.

      WF_RESET_FORM_STATUS(bResetSuccess);

      -- If any errors result from the force of validation,
      -- present the user with an error message.

      IF NOT bResetSuccess THEN
        bCanCommitForm := FALSE;
        RAISE excResetFormFailure;
      END IF;

      -- If there are no changes to save on the current form,
      -- then set to FALSE the variable that determines whether
      -- a Commit will be performed.

      IF NOT G$_WF_CONDITIONS.ARE_CHANGES_TO_SAVE THEN
        G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0155','LIB','%01%.%02%: The current form contains no changes to save.',vcCurrProgUnit,vcCurrSubprog));
        bCanCommitForm := FALSE;

      END IF;
         
    END IF; 

    -- Perform a Commit if conditions allow.

    IF bCanCommitForm THEN

      COPY('5', 'SYSTEM.MESSAGE_LEVEL');
      DO_KEY('COMMIT_FORM');
      COPY('0', 'SYSTEM.MESSAGE_LEVEL');

      -- If the Commit has resulted in errors or has otherwise failed, present the user
      -- with an error message.

      IF NOT FORM_SUCCESS OR G$_WF_CONDITIONS.ARE_CHANGES_TO_SAVE THEN
        RAISE excCommitFormFailure;
      END IF;

    END IF;

    -- Execute a local WF_SUBMIT_TRG if it has been
    -- identified to exist in the current scope.

    IF G$_WF_CONDITIONS.LOCAL_TRG_EXISTS('WF_SUBMIT') THEN
      EXECUTE_TRIGGER('WF_SUBMIT_TRG');

      IF NOT FORM_SUCCESS THEN
        RAISE excLocalSubmitFailure;
      END IF;

    END IF;

    -- If action parameters have been defined for this workflow activity,
    -- extract from this form any and all updated action parameter values.

    IF G$_WF_CONDITIONS.CONTEXT_EXISTS AND
       G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(TRUE) THEN
      vcParamString := G$_WF_CONTEXT_PROCESS_OUT.EXTRACT_OUT_PARAMS;

      -- If the parameter extraction fails, present the user with an
      -- error message.

      IF vcParamString IS NULL THEN
        RAISE excExtractOutFailure;
      END IF;

      -- Return the extracted action parameter values to Workflow.

      G$_WF_CONTEXT_PROCESS_OUT.RETURN_CONTEXT(G$_WF_WAIT_FOR_WORK.GET_CURR_WF_WORK_ID,vcParamString);

    END IF;

    -- Declare the current workflow activity complete to Workflow.

    DECLARE_WORK_COMPLETE(G$_WF_WAIT_FOR_WORK.GET_CURR_WF_WORK_ID);

    -- Unregister the form as a workflow activity.

    RESET_WF_ACTIVITY_STACK;
    G$_WF_WAIT_FOR_WORK.SET_CURR_WF_REQUEST_TYPE(NULL);

    -- Disable the Workflow iconic buttons to prevent
    -- the execution of any further Workflow functions.    
    
    G$_WF_ICONS.WF_DISABLE_ICONS;
    
    -- Strip the name of the workflow activity
    -- from the MDI window title bar.

    G$_WF_SET_FOCUS.RESET_WIN_TITLE;

    -- If any Key Block items are highlighted,
    -- remove the highlight.

    IF G$_WF_CONDITIONS.CONTEXT_EXISTS AND
       G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(TRUE) THEN

      IF NOT G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_HIGHLIGHTED THEN
        G$_WF_CONTROL_KEY_ITMS.UNHIGHLIGHT_KEY_ITMS;
      END IF;

    -- If no Key Block items potentially need to be
    -- unprotected later if the user navigates back
    -- to the Key Block, then it is safe to delete
    -- the construct that identifies the Key Block
    -- items that are currently protected along
    -- with the action parameter name and value info, etc.

      IF G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_PROTECTED THEN
        G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;

      ELSE

      -- If one or more Key Block items are protected from
      -- insert or update and the user is currently placed
      -- in the Key Block, unprotect those items so that
      -- the user can update the Key Block as necessary
      -- to use the form in a non-Workflow context.
      --
      -- Additionally delete the construct that holds
      -- action parameter names, values, and attributes
      -- and their associations with form items since
      -- this information is no longer needed.

        vcCursorBlk := NAME_IN('SYSTEM.CURSOR_BLOCK');

        IF G$_WF_CONDITIONS.IS_KEY_BLOCK(vcCursorBlk) THEN
          G$_WF_CONTROL_KEY_ITMS.UNPROTECT_KEY_ITMS;
          G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;
        END IF;

      END IF;

    END IF;

    -- Attempt to exit the current form.
    
    COPY('Y','GLOBAL.WF_SUBMIT_EXIT_IND');    
    DO_KEY('EXIT_FORM');

    -- If the attempt to exit has resulted in errors,
    -- present the user with an error message.

    IF NOT FORM_SUCCESS THEN
      RAISE excExitFormFailure;
    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0156','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN excFormModeFailure THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0157','LIB','*ERROR* Unable to perform a Workflow Submit while in Enter Query mode.'),
                               'MESSAGE',FALSE,FALSE);

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0158','LIB','To submit this activity, you must either cancel or execute the current query.'),
                               'MESSAGE',FALSE,FALSE);

   WHEN excResetFormFailure THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0159','LIB','*ERROR* Unable to determine whether there are changes to save on this form.'),
                               'MESSAGE',FALSE,FALSE);

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0160','LIB','You may either release this activity or resolve the errors encountered before re-submitting the activity.'),
                               'MESSAGE',FALSE,FALSE);

   WHEN excCommitFormFailure THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0161','LIB','*ERROR* Unable to save the changes made to this form.'),
                               'MESSAGE',FALSE,FALSE);

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0162','LIB','You may either release this activity or resolve the errors encountered before re-submitting the activity.'),
                               'MESSAGE',FALSE,FALSE);

   WHEN excLocalSubmitFailure THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0163','LIB','*ERROR* The Workflow Submit logic that is local to this form has encountered an error.'),'MESSAGE',FALSE,FALSE);

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0164','LIB','You may either release this activity or resolve the errors encountered before re-submitting the activity.'),
                               'MESSAGE',FALSE,FALSE);

   WHEN excExtractOutFailure THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0165','LIB','No activity parameters could be identified for extraction.'),
                               'MESSAGE',TRUE,FALSE);

   WHEN excExitFormFailure THEN

     G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0166','LIB','*WARNING* If the failure to exit this form affects the submitted activity or the workflow as a whole, please contact your Workflow Administrator.'),'MESSAGE',FALSE,FALSE);

   WHEN OTHERS THEN

     SET_WF_SUBMITTED('N');

     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END WF_SUBMIT;

----------------------
----------------------

 PROCEDURE WF_CONTROL_EXIT IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'WF_CONTROL_EXIT';

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0167','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));
  -- If the current activity has not already been released or
  -- submitted, then...

  IF G$_WF_CONDITIONS.IS_WF_ACTIVITY AND
     NOT G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN
    -- Unregister the form as a workflow activity.

    RESET_WF_ACTIVITY_STACK;
    G$_WF_WAIT_FOR_WORK.SET_CURR_WF_REQUEST_TYPE(NULL);

    -- Disable the Workflow iconic buttons to prevent
    -- the execution of any further Workflow functions.	
    G$_WF_ICONS.WF_DISABLE_ICONS;
    
    -- Strip the name of the workflow activity
    -- from the MDI window title bar.
    G$_WF_SET_FOCUS.RESET_WIN_TITLE;

  END IF;

  -- If action parameters have been defined for this
  -- workflow activity, delete the construct that holds
  -- action parameter names, values, and attributes
  -- and their associations with form items since
  -- this information is no longer needed.

  IF G$_WF_CONDITIONS.CONTEXT_EXISTS AND
     G$_WF_CONTEXT_VALIDATE.CAN_LOCATE_PARAMS(FALSE) THEN
    G$_WF_CONTEXT_PROCESS_IN.DELETE_PARAMS;
  END IF;

  -- Regardless of whether the current form is or was
  -- a workflow task or activity, ensure that subsequent
  -- attempts to register forms as workflow tasks and
  -- activities are not prevented.
  DELETE_WF_ACTIVITY_STACK;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0168','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

 END WF_CONTROL_EXIT;

--*
--* Define private subprogram bodies
--*

 PROCEDURE INSERT_WF_ACTIVITY_STACK IS
  vcStackValue VARCHAR2(256);

 BEGIN
  
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0169','LIB','%01%.INSERT_WF_ACTIVITY_STACK - Begin',vcCurrProgUnit));
  
  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');

  IF INSTR(vcStackValue,'W') > 0 THEN

    IF G$_WF_CONDITIONS.IS_CURR_WF_REQUEST_TYPE('W') AND
       G$_WF_CONDITIONS.IS_QUICKFLOW THEN
      G$_WF_WAIT_FOR_WORK.SET_QF_FORMS(G$_WF_WAIT_FOR_WORK.GET_CURR_B2K_OBJT_NAME);

      IF G$_WF_CONDITIONS.IS_CURRENT_FORM_QF THEN

        IF SUBSTR(vcStackValue,-1) = 'W' THEN
          vcStackValue := vcStackValue || 'Q';
        ELSE
          vcStackValue := vcStackValue || 'N';
        END IF;

      ELSE
        vcStackValue := vcStackValue || 'N';
      END IF;

    ELSE
      vcStackValue := vcStackValue || 'N';
    END IF;

  ELSIF G$_WF_CONDITIONS.IS_CURR_WF_REQUEST_TYPE('W') AND
        G$_WF_CONDITIONS.IS_FORM THEN

    IF G$_WF_CONDITIONS.IS_CURRENT_FORM THEN 
      vcStackValue := vcStackValue || 'W';
    ELSE
      vcStackValue := vcStackValue || 'N';
    END IF;

  ELSIF INSTR(vcStackValue,'T') > 0 THEN
    vcStackValue := vcStackValue || 'N';

  ELSIF G$_WF_CONDITIONS.IS_CURR_WF_REQUEST_TYPE('T') AND
        G$_WF_CONDITIONS.IS_FORM THEN

    IF G$_WF_CONDITIONS.IS_CURRENT_FORM THEN 
      vcStackValue := vcStackValue || 'T';
    ELSE
      vcStackValue := vcStackValue || 'N';
    END IF;

  ELSE
    vcStackValue := vcStackValue || NVL(G$_WF_WAIT_FOR_WORK.GET_CURR_WF_REQUEST_TYPE,'N');

  END IF;

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0170','LIB','%01%.INSERT_WF_ACTIVITY_STACK - vcStackValue := %02%',vcCurrProgUnit,vcStackValue ));

  COPY(vcStackValue,'GLOBAL.WF_ACTIVITY');

 END INSERT_WF_ACTIVITY_STACK;

------------------------
------------------------

 PROCEDURE RESET_WF_ACTIVITY_STACK IS
  vcStackValue VARCHAR2(256);

 BEGIN
  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');

  vcStackValue := TRANSLATE(vcStackValue,'WQ','NN');

  COPY(vcStackValue,'GLOBAL.WF_ACTIVITY');

 END RESET_WF_ACTIVITY_STACK;

------------------------
------------------------

 PROCEDURE DELETE_WF_ACTIVITY_STACK IS
  vcStackValue VARCHAR2(256);
  nStackLength NUMBER(3);

 BEGIN
  vcStackValue := NVL(NAME_IN('GLOBAL.WF_ACTIVITY'),'N');
  nStackLength := NVL(LENGTH(vcStackValue), 0);

  vcStackValue := NVL( SUBSTR(vcStackValue,1,(nStackLength - 1)) , 'N');

  COPY(vcStackValue,'GLOBAL.WF_ACTIVITY');

 END DELETE_WF_ACTIVITY_STACK;

----------------------
----------------------

 PROCEDURE WF_RESET_FORM_STATUS(success_ind_out  OUT  BOOLEAN) IS
  vcCurrForm                VARCHAR2(30);
  bNoResetErrors            BOOLEAN      := TRUE;

 BEGIN
  vcCurrForm := NAME_IN('SYSTEM.CURRENT_FORM');

  IF vcCurrForm IS NULL THEN
    bNoResetErrors := FALSE;
  --
  -- Reset the form validation
  --
  ELSE

    IF GET_FORM_PROPERTY(vcCurrForm,VALIDATION) = 'FALSE' THEN
      SET_FORM_PROPERTY(vcCurrForm,VALIDATION,PROPERTY_TRUE);
    END IF;
    --
    -- Force block level validation
    --
    VALIDATE(BLOCK_SCOPE);
    --
    -- If validation fails, then set the success indicator to false
    -- and display an error message
    --
    IF NOT FORM_SUCCESS THEN
      bNoResetErrors := FALSE;
    END IF;

  END IF;

  success_ind_out := bNoResetErrors;

 EXCEPTION
   WHEN OTHERS THEN
     success_ind_out := FALSE;
     G$_WF_ERROR.DISPLAY_ERROR(NVL(ERROR_TEXT,SQLERRM),'MESSAGE',FALSE,FALSE);

 END WF_RESET_FORM_STATUS;

----------------------
----------------------

 PROCEDURE SET_WF_SUBMITTED(submitted_ind_in VARCHAR2) IS
 BEGIN
  COPY(submitted_ind_in,'GLOBAL.WF_SUBMITTED');

 END SET_WF_SUBMITTED;

---------------------
---------------------

 PROCEDURE DECLARE_WORK_COMPLETE(work_id  VARCHAR2) IS
 BEGIN
   G$_WF_BA.DECLARE_WORK_COMPLETE(work_id);
  
 END DECLARE_WORK_COMPLETE;

END G$_WF_CONTROL_FORM;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONTROL_FORM");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
/* </p>
		*/
		public void wfControlEntry()
		{
			final NString VCCURRSUBPROG = toStr("WF_CONTROL_ENTRY");
			NString VCDEBUGHEADER = VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0110"), toStr("LIB"), toStr("%01% BEGIN"), VCDEBUGHEADER));
				//  Regardless of how the current form was launched, insert a value into
				//  the workflow activity stack variable to enable the determination of
				//  how the form was launched and disable all iconic toolbar buttons
				//  that relate to Workflow or Workflow Electronic Documents.
				insertWfActivityStack();
				getContainer().getGWfIcons().wfDisableIcons();
				//  If the current form is a workflow activity, bring the form into focus,
				//  append the activity name to the MDI application window title, enable
				//  the Workflow Submit and Workflow Release iconic buttons, and extract
				//  from Workflow and validate the action parameter names and values
				//  associated with the workflow activity.
				if ( getContainer().getGWfConditions().isWfActivity().getValue() )
				{
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0111"), toStr("LIB"), toStr("%01%: The current form is considered a Workflow activity."), VCDEBUGHEADER));
					getContainer().getGWfSetFocus().setFocus();
					//getContainer().getGWfSetFocus().setWinTitle();
					getContainer().getGWfIcons().wfEnableIcons();				
					
					getContainer().getGWfContextProcessIn().extractParams(getContainer().getGWfWaitForWork().getCurrWfWorkId());
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0112"), toStr("LIB"), toStr("%01%: Parameters (if any) have been extracted."), VCDEBUGHEADER));
					if ( getContainer().getGWfConditions().contextExists().getValue() )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0113"), toStr("LIB"), toStr("%01%: Context exists."), VCDEBUGHEADER));
						if ( getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.True)).getValue() )
						{
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0114"), toStr("LIB"), toStr("%01%: Parameters have been located."), VCDEBUGHEADER));
							if ( getContainer().getGWfContextValidate().allParamNamesAreValidItms().getValue() )
							{
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0115"), toStr("LIB"), toStr("%01%: All parameter names are valid form items."), VCDEBUGHEADER));
								if ( getContainer().getGWfContextValidate().noParamsHaveInputVals().not() )
								{
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0116"), toStr("LIB"), toStr("%01%: One or more parameters have an input value."), VCDEBUGHEADER));
									if ( getContainer().getGWfContextValidate().canPopulateAllItms().getValue() )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0117"), toStr("LIB"), toStr("%01%: All items can be populated."), VCDEBUGHEADER));
									}
								}
							}
						}
					}
				}
				else if ( getContainer().getGWfConditions().isWfTask().getValue() ) {
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0118"), toStr("LIB"), toStr("%01% : The current form is considered a Workflow task."), VCDEBUGHEADER));
					getContainer().getGWfSetFocus().setFocus();
				}
				else if ( getContainer().getGWfConditions().isWfPassthroughForm().getValue() ) {
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0119"), toStr("LIB"), toStr("%01%: The current form is considered a Workflow pass-through form."), VCDEBUGHEADER));
				}
				else if ( getContainer().getGWfConditions().isMatchingForm().getValue() ) {
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0120"), toStr("LIB"), toStr("%01%: The current form is a matching form and will be ignored."), VCDEBUGHEADER));
				}
				else {
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0121"), toStr("LIB"), toStr("%01%: The current form is not considered a Workflow task, activity, pass-through form, or Electronic Documents apply activity."), VCDEBUGHEADER));
				}
				//  -- --
				//  -- --
				if ( !getNameIn("GLOBAL.WF_ARGS").isNull() )
				{
					((BaseTask)TaskServices.getCurrentTask()).getMenuServices().setMenuItemEnabled("ICONS.VPDI_EXISTS", false);
					//MORPHIS: Menu logic manipulation
					// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin22".
					//					SupportClasses.FORMS40.SetMenuItemProperty("ICONS.VPDI_EXISTS", SupportClasses.Property.LABEL, GNls.Fget(toStr("GOQWFLW-0122"), toStr("LIB"), toStr("Multi-Entity Processing not enabled")));
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin22'.");
					
					
				}
				
				//MORPHIS: Stop pooling
				//30/05/2015 - Stop was removed following Ellucian instructions (AppNav can switch between open forms)
				//getContainer().getGWfDriver().setWorkspaceReuse(false);
				
				//  -- --
				//  -- --	
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0123"), toStr("LIB"), toStr("%01% END"), VCDEBUGHEADER));
			}
			catch(Exception  e)
			{
				
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				
				
			}

			
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfControlNewBlock()
		{
	
			final NString VCCURRSUBPROG = toStr("WF_CONTROL_NEW_BLOCK");
			NString vctrgblock= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0124"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				vctrgblock = getTriggerBlock();
				if ( getContainer().getGWfConditions().isKeyBlock(vctrgblock).getValue() )
				{
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0125"), toStr("LIB"), toStr("%01%.%02%: The trigger block is the Key Block."), VCCURRPROGUNIT, VCCURRSUBPROG));
					//  If the current form is a workflow activity, then evaluate whether any Key Block items
					//  have already been populated with input action parameter values.
					if ( getContainer().getGWfConditions().isWfActivity().getValue() )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0126"), toStr("LIB"), toStr("%01%.%02%: Form is an activity."), VCCURRPROGUNIT, VCCURRSUBPROG));
						if ( getContainer().getGWfConditions().contextExists().getValue() )
						{
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0127"), toStr("LIB"), toStr("%01%.%02%: Context exists."), VCCURRPROGUNIT, VCCURRSUBPROG));
							if ( getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.True)).getValue() )
							{
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0128"), toStr("LIB"), toStr("%01%.%02%: Can locate context parameters."), VCCURRPROGUNIT, VCCURRSUBPROG));
								//  If Key Block items have already been populated, then repopulate them now that input
								//  focus has been placed again into the Key Block.          
								if ( getContainer().getGWfConditions().isContextPopulated().getValue() )
								{
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0129"), toStr("LIB"), toStr("%01%.%02%: Context has already been populated."), VCCURRPROGUNIT, VCCURRSUBPROG));
									getContainer().getGWfContextProcessIn().repopulateContext();
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0130"), toStr("LIB"), toStr("%01%.%02%: Context has been repopulated."), VCCURRPROGUNIT, VCCURRSUBPROG));
								}
								else if ( getContainer().getGWfContextValidate().noParamsHaveInputVals().not() ) {
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0131"), toStr("LIB"), toStr("%01%.%02%: One or more parameters have an input value."), VCCURRPROGUNIT, VCCURRSUBPROG));
									if ( getContainer().getGWfContextValidate().noKeyItmMaxLnExceeded().getValue() )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0132"), toStr("LIB"), toStr("%01%.%02%: No Key Block item has exceeded max length."), VCCURRPROGUNIT, VCCURRSUBPROG));
										getContainer().getGWfContextProcessIn().populateContext();
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0133"), toStr("LIB"), toStr("%01%.%02%: Context has been populated."), VCCURRPROGUNIT, VCCURRSUBPROG));
									}
								}
							}
						}
						//  Since context has now been passed in enable the icons.
						getContainer().getGWfIcons().wfEnableIcons();
					}
					else if ( getContainer().getGWfConditions().contextExists().getValue() ) {
						//  If the form is not considered a workflow activity
						//  but there are still Key Block items that are protected
						//  from insert or update, then unprotect those items
						//  now that input focus has returned to the Key Block
						//  so that the user can update the Key Block as necessary
						//  to use the form in a non-Workflow context.
						// 
						//  Additionally delete the construct that holds
						//  action parameter names, values, and attributes
						//  and their associations with form items since
						//  this information is no longer needed.
						if ( getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.False)).getValue() )
						{
							if ( getContainer().getGWfContextValidate().noKeyItmsAreProtected().not() )
							{
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0134"), toStr("LIB"), toStr("%01%.%02%: The current form is no longer a Workflow activity, but its Key Block items have not yet been unprotected."), VCCURRPROGUNIT, VCCURRSUBPROG));
								getContainer().getGWfControlKeyItms().unprotectKeyItms();
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0135"), toStr("LIB"), toStr("%01%.%02%: Key Block items have been unprotected."), VCCURRPROGUNIT, VCCURRSUBPROG));
								getContainer().getGWfContextProcessIn().deleteParams();
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0136"), toStr("LIB"), toStr("%01%.%02%: The parameters have now been deleted."), VCCURRPROGUNIT, VCCURRSUBPROG));
							}
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0137"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				//
			}

			
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trgNameIn
		*/
		public void wfSetLocalTrgExists(NString trgNameIn)
		{

			final NString VCCURRSUBPROG = toStr("WF_SET_LOCAL_TRG_EXISTS");
			NString vcglobalname= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0138"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( getContainer().getGWfConditions().isWfActivity().getValue() )
				{
					if ( trgNameIn.equals("WF_RELEASE") )
					{
						vcglobalname = toStr("WF_LOCAL_RELEASE_EXISTS");
					}
					else if ( trgNameIn.equals("WF_SUBMIT") ) {
						vcglobalname = toStr("WF_LOCAL_SUBMIT_EXISTS");
					}
					if ( !vcglobalname.isNull() )
					{
						copy("Y",toStr("GLOBAL.").append(vcglobalname));
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0139"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trgNameIn
		*/
		public void wfResetLocalTrgExists(NString trgNameIn)
		{

			final NString VCCURRSUBPROG = toStr("WF_RESET_LOCAL_TRG_EXISTS");
			NString vcglobalname= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0140"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( getContainer().getGWfConditions().isWfActivity().getValue() )
				{
					if ( trgNameIn.equals("WF_RELEASE") )
					{
						vcglobalname = toStr("WF_LOCAL_RELEASE_EXISTS");
					}
					else if ( trgNameIn.equals("WF_SUBMIT") ) {
						vcglobalname = toStr("WF_LOCAL_SUBMIT_EXISTS");
					}
					if ( !vcglobalname.isNull() )
					{
						copy("N",toStr("GLOBAL.").append(vcglobalname));
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0141"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
		public void wfRelease()
		{

			final NString VCCURRSUBPROG = toStr("WF_RELEASE");
			NString vccursorblk= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0142"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( getContainer().getGWfConditions().isWfActivity().getValue() )
				{
					//  Execute a local WF_RELEASE_TRG if it has been
					//  identified to exist in the current scope.
					if ( getContainer().getGWfConditions().localTrgExists(toStr("WF_RELEASE")).getValue() )
					{
						try {
							executeAction("WF_RELEASE_TRG");
							//  If the execution of the WF_RELEASE_TRG fails
							//  or specifically raises FORM_TRIGGER_FAILURE
							//  to indicate failure, present the user
							//  with an appropriate error message.
						}
						catch(Exception ex) {
							throw new Exclocalreleasefailure();
						}
					}
					//  Unregister the form as a workflow activity.
					resetWfActivityStack();
					getContainer().getGWfWaitForWork().setCurrWfRequestType(toStr(null));
					//  Disable the Workflow iconic buttons to prevent
					//  the execution of any further Workflow functions.
					getContainer().getGWfIcons().wfDisableIcons();
					//  Strip the name of the workflow activity
					//  from the MDI window title bar.
					getContainer().getGWfSetFocus().resetWinTitle();
					if ( getContainer().getGWfConditions().contextExists().getValue() && getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.True)).getValue() )
					{
						//  If any Key Block items are highlighted,
						//  remove the highlight.
						if ( getContainer().getGWfContextValidate().noKeyItmsAreHighlighted().not() )
						{
							getContainer().getGWfControlKeyItms().unhighlightKeyItms();
						}
						//  If no Key Block items potentially need to be
						//  unprotected later if the user navigates back
						//  to the Key Block, then it is safe to delete
						//  the construct that identifies the Key Block
						//  items that are currently protected along
						//  with the action parameter name and value info, etc.
						if ( getContainer().getGWfContextValidate().noKeyItmsAreProtected().getValue() )
						{
							getContainer().getGWfContextProcessIn().deleteParams();
						}
						else {
							vccursorblk = getCursorBlock();
							//  If one or more Key Block items are protected from
							//  insert or update and the user is currently placed
							//  in the Key Block, unprotect those items so that
							//  the user can update the Key Block as necessary
							//  to use the form in a non-Workflow context.
//
							//  Additionally delete the construct that holds
							//  action parameter names, values, and attributes
							//  and their associations with form items since
							//  this information is no longer needed.
							if ( getContainer().getGWfConditions().isKeyBlock(vccursorblk).getValue() )
							{
								getContainer().getGWfControlKeyItms().unprotectKeyItms();
								getContainer().getGWfContextProcessIn().deleteParams();
							}
						}
					}
										
					//MORPHIS - Mark this session as reusable, ie, signal the client to start the timer loop
					getContainer().getGWfDriver().setWorkspaceReuse();
					
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0143"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exclocalreleasefailure e)
			{
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0144"), toStr("LIB"), toStr("*ERROR* The Workflow Release logic that is local to this form has encountered an error.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0145"), toStr("LIB"), toStr("Please resolve the errors encountered before submitting or re-releasing the activity.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
				
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
		public void wfSetCommitOverride()
		{

			final NString VCCURRSUBPROG = toStr("WF_SET_COMMIT_OVERRIDE");
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0146"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			if ( getContainer().getGWfConditions().isWfActivity().getValue() )
			{
				copy("N","GLOBAL.WF_PERFORM_COMMIT");
			}
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0147"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfResetCommitOverride()
		{

			final NString VCCURRSUBPROG = toStr("WF_RESET_COMMIT_OVERRIDE");
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0148"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
			copy("Y","GLOBAL.WF_PERFORM_COMMIT");
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0149"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void wfSubmit()
		{

			final NString VCCURRSUBPROG = toStr("WF_SUBMIT");
			NBool bcancommitform = toBool(NBool.True);
			NBool bresetsuccess = toBool(NBool.False);
			NString vccursorblk= NString.getNull();
			NString vcparamstring= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0150"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( getContainer().getGWfConditions().isWfActivity().getValue() && getContainer().getGWfConditions().isWfSubmitted().not() )
				{
					setWfSubmitted(toStr("Y"));
					//  If the current form is in Enter Query mode,
					//  present the user with the appropriate error message.
					if ( getContainer().getGWfConditions().isEnterQueryMode().getValue() )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0151"), toStr("LIB"), toStr("%01%.%02%: The current form is in enter query mode."), VCCURRPROGUNIT, VCCURRSUBPROG));
						throw new Excformmodefailure();
					}
					//  If any of the following conditions are not met, then set
					//  to FALSE the variable that determines whether a Commit
					//  will be performed.
					if ( getContainer().getGWfConditions().isCommitOverride().getValue() )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0152"), toStr("LIB"), toStr("%01%.%02%: The commit override has been set."), VCCURRPROGUNIT, VCCURRSUBPROG));
						bcancommitform = toBool(NBool.False);
					}
					else if ( getContainer().getGWfConditions().isInquiryForm().getValue() ) {
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0153"), toStr("LIB"), toStr("%01%.%02%: The current form is considered an inquiry form."), VCCURRPROGUNIT, VCCURRSUBPROG));
						bcancommitform = toBool(NBool.False);
					}
					else if ( getContainer().getGWfConditions().isQueryOnlyRole().getValue() ) {
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0154"), toStr("LIB"), toStr("%01%.%02%: The current form is associated with a query only role."), VCCURRPROGUNIT, VCCURRSUBPROG));
						bcancommitform = toBool(NBool.False);
					}
					else {
						//  Force validation to reset the form's status.
						Ref<NBool> successIndOut_ref = new Ref<NBool>(bresetsuccess);
						wfResetFormStatus(successIndOut_ref);
						bresetsuccess = successIndOut_ref.val;
						//  If any errors result from the force of validation,
						//  present the user with an error message.
						if ( bresetsuccess.not() )
						{
							bcancommitform = toBool(NBool.False);
							throw new Excresetformfailure();
						}
						//  If there are no changes to save on the current form,
						//  then set to FALSE the variable that determines whether
						//  a Commit will be performed.
						if ( getContainer().getGWfConditions().areChangesToSave().not() )
						{
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0155"), toStr("LIB"), toStr("%01%.%02%: The current form contains no changes to save."), VCCURRPROGUNIT, VCCURRSUBPROG));
							bcancommitform = toBool(NBool.False);
						}
					}
					//  Perform a Commit if conditions allow.
					if ( bcancommitform.getValue() )
					{
						boolean failed = false;
						try {
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL. (5)
							MessageServices.setMessageLevel(MessageLevel.USER);
							executeAction("SAVE");
						}
						catch(Exception ex) {
							failed = true;
						}
						finally {
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL. (0)
							MessageServices.resetMessageLevel();
						}
						
						//  If the Commit has resulted in errors or has otherwise failed, present the user
						//  with an error message.
						if ( failed || getContainer().getGWfConditions().areChangesToSave().getValue() )
						{
							throw new Exccommitformfailure();
						}
					}
					//  Execute a local WF_SUBMIT_TRG if it has been
					//  identified to exist in the current scope.
					if ( getContainer().getGWfConditions().localTrgExists(toStr("WF_SUBMIT")).getValue() )
					{
						try {
							executeAction("WF_SUBMIT_TRG");
						}
						catch(Exception ex)
						{
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							throw new Exclocalsubmitfailure();
						}
					}
					//  If action parameters have been defined for this workflow activity,
					//  extract from this form any and all updated action parameter values.
					if ( getContainer().getGWfConditions().contextExists().getValue() && getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.True)).getValue() )
					{
						vcparamstring = getContainer().getGWfContextProcessOut().extractOutParams();
						//  If the parameter extraction fails, present the user with an
						//  error message.
						if ( vcparamstring.isNull() )
						{
							throw new Excextractoutfailure();
						}
						//  Return the extracted action parameter values to Workflow.
						getContainer().getGWfContextProcessOut().returnContext(getContainer().getGWfWaitForWork().getCurrWfWorkId(), vcparamstring);
					}
					//  Declare the current workflow activity complete to Workflow.
					declareWorkComplete(getContainer().getGWfWaitForWork().getCurrWfWorkId());
					//  Unregister the form as a workflow activity.
					resetWfActivityStack();
					getContainer().getGWfWaitForWork().setCurrWfRequestType(toStr(null));
					//  Disable the Workflow iconic buttons to prevent
					//  the execution of any further Workflow functions.    
					getContainer().getGWfIcons().wfDisableIcons();
					//  Strip the name of the workflow activity
					//  from the MDI window title bar.
					getContainer().getGWfSetFocus().resetWinTitle();
					//  If any Key Block items are highlighted,
					//  remove the highlight.
					if ( getContainer().getGWfConditions().contextExists().getValue() && getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.True)).getValue() )
					{
						if ( getContainer().getGWfContextValidate().noKeyItmsAreHighlighted().not() )
						{
							getContainer().getGWfControlKeyItms().unhighlightKeyItms();
						}
						//  If no Key Block items potentially need to be
						//  unprotected later if the user navigates back
						//  to the Key Block, then it is safe to delete
						//  the construct that identifies the Key Block
						//  items that are currently protected along
						//  with the action parameter name and value info, etc.
						if ( getContainer().getGWfContextValidate().noKeyItmsAreProtected().getValue() )
						{
							getContainer().getGWfContextProcessIn().deleteParams();
						}
						else {
							//  If one or more Key Block items are protected from
							//  insert or update and the user is currently placed
							//  in the Key Block, unprotect those items so that
							//  the user can update the Key Block as necessary
							//  to use the form in a non-Workflow context.
//
							//  Additionally delete the construct that holds
							//  action parameter names, values, and attributes
							//  and their associations with form items since
							//  this information is no longer needed.
							vccursorblk = getCursorBlock();
							if ( getContainer().getGWfConditions().isKeyBlock(vccursorblk).getValue() )
							{
								getContainer().getGWfControlKeyItms().unprotectKeyItms();
								getContainer().getGWfContextProcessIn().deleteParams();
							}
						}
					}
					
					
					//MORPHIS - Mark this session as reusable, ie, signal the client to start the timer loop
					//getContainer().getGWfWaitForWork().wfCreateSessionReusableTimerJob(GWfHeader.TM_NAME, GWfHeader.TIME_INTERVAL);
					
					//MORPHIS - Mark this session as reusable directly using the new SP
					getContainer().getGWfBa().updateClientId();
					
					getContainer().getGWfDriver().setWorkspaceReuse();
					
					//  Attempt to exit the current form.
					copy("Y","GLOBAL.WF_SUBMIT_EXIT_IND");
					try {
						executeAction("EXIT");
					}
					catch(Throwable ex)
					{
						Throwable tex = SystemUtils.getThrowableCause(ex);
						if ( !(tex instanceof TaskExitException) ) {
							if (tex instanceof TaskControlException)
								throw (TaskControlException)tex;
						
							//  If the attempt to exit has resulted in errors,
							//  present the user with an error message.
							getContainer().getGWfLogging().debugMsg(toStr(ex.getMessage()));
							throw new Excexitformfailure();
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0156"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Excformmodefailure e)
			{
				setWfSubmitted(toStr("N"));
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0157"), toStr("LIB"), toStr("*ERROR* Unable to perform a Workflow Submit while in Enter Query mode.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0158"), toStr("LIB"), toStr("To submit this activity, you must either cancel or execute the current query.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
				
			}
			catch(Excresetformfailure e)
			{
				setWfSubmitted(toStr("N"));
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0159"), toStr("LIB"), toStr("*ERROR* Unable to determine whether there are changes to save on this form.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));			
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0160"), toStr("LIB"), toStr("You may either release this activity or resolve the errors encountered before re-submitting the activity.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
				
			}
			catch(Exccommitformfailure e)
			{
				setWfSubmitted(toStr("N"));
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0161"), toStr("LIB"), toStr("*ERROR* Unable to save the changes made to this form.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0162"), toStr("LIB"), toStr("You may either release this activity or resolve the errors encountered before re-submitting the activity.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
			}
			catch(Exclocalsubmitfailure e)
			{
				setWfSubmitted(toStr("N"));
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0163"), toStr("LIB"), toStr("*ERROR* The Workflow Submit logic that is local to this form has encountered an error.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0164"), toStr("LIB"), toStr("You may either release this activity or resolve the errors encountered before re-submitting the activity.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
			}
			catch(Excextractoutfailure e)
			{
				setWfSubmitted(toStr("N"));
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0165"), toStr("LIB"), toStr("No activity parameters could be identified for extraction.")), toStr("MESSAGE"), toBool(NBool.True), toBool(NBool.False));
				
			}
			catch(Excexitformfailure e)
			{
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0166"), toStr("LIB"), toStr("*WARNING* If the failure to exit this form affects the submitted activity or the workflow as a whole, please contact your Workflow Administrator.")), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
			}
			catch(Exception  e)
			{
				setWfSubmitted(toStr("N"));
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
		public void wfControlExit()
		{

			final NString VCCURRSUBPROG = toStr("WF_CONTROL_EXIT");
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0167"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				//  If the current activity has not already been released or
				//  submitted, then...
				if ( getContainer().getGWfConditions().isWfActivity().getValue() && getContainer().getGWfConditions().isWfSubmitted().not())
				{
					//  Unregister the form as a workflow activity.
					resetWfActivityStack();
					getContainer().getGWfWaitForWork().setCurrWfRequestType(toStr(null));
					//  Disable the Workflow iconic buttons to prevent
					//  the execution of any further Workflow functions.	
					getContainer().getGWfIcons().wfDisableIcons();
					//  Strip the name of the workflow activity
					//  from the MDI window title bar.
					getContainer().getGWfSetFocus().resetWinTitle();
				}
				//  If action parameters have been defined for this
				//  workflow activity, delete the construct that holds
				//  action parameter names, values, and attributes
				//  and their associations with form items since
				//  this information is no longer needed.
				if ( getContainer().getGWfConditions().contextExists().getValue() && getContainer().getGWfContextValidate().canLocateParams(toBool(NBool.False)).getValue() )
				{
					getContainer().getGWfContextProcessIn().deleteParams();
				}
				//  Regardless of whether the current form is or was
				//  a workflow task or activity, ensure that subsequent
				//  attempts to register forms as workflow tasks and
				//  activities are not prevented.
				deleteWfActivityStack();
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0168"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				
				//MORPHIS - After removing the current from the activity, check if items should be enabled
				if ( getContainer().getGWfConditions().isWfActivity().getValue() )
					getContainer().getGWfIcons().wfEnableIcons();
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				
			}
			
		}
/* <p>
		* *
		* * Define private subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void insertWfActivityStack()
		{


			NString vcstackvalue= NString.getNull();
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0169"), toStr("LIB"), toStr("%01%.INSERT_WF_ACTIVITY_STACK - Begin"), VCCURRPROGUNIT));
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			if ( inStr(vcstackvalue, toStr("W")).greater(0) )
			{
				if ( getContainer().getGWfConditions().isCurrWfRequestType(toStr("W")).getValue() && getContainer().getGWfConditions().isQuickflow().getValue() )
				{
					getContainer().getGWfWaitForWork().setQfForms(getContainer().getGWfWaitForWork().getCurrB2kObjtName());
					if ( getContainer().getGWfConditions().isCurrentFormQf().getValue() )
					{
						if ( substring(vcstackvalue, - (1)).equals("W") )
						{
							vcstackvalue = vcstackvalue.append("Q");
						}
						else {
							vcstackvalue = vcstackvalue.append("N");
						}
					}
					else {
						vcstackvalue = vcstackvalue.append("N");
					}
				}
				else {
					vcstackvalue = vcstackvalue.append("N");
				}
			}
			else if ( getContainer().getGWfConditions().isCurrWfRequestType(toStr("W")).getValue() && getContainer().getGWfConditions().isForm().getValue() ) {
				if ( getContainer().getGWfConditions().isCurrentForm().getValue() )
				{
					vcstackvalue = vcstackvalue.append("W");
				}
				else {
					vcstackvalue = vcstackvalue.append("N");
				}
			}
			else if ( inStr(vcstackvalue, toStr("T")).greater(0) ) {
				vcstackvalue = vcstackvalue.append("N");
			}
			else if ( getContainer().getGWfConditions().isCurrWfRequestType(toStr("T")).getValue() && getContainer().getGWfConditions().isForm().getValue() ) {
				if ( getContainer().getGWfConditions().isCurrentForm().getValue() )
				{
					vcstackvalue = vcstackvalue.append("T");
				}
				else {
					vcstackvalue = vcstackvalue.append("N");
				}
			}
			else {
				vcstackvalue = vcstackvalue.append(isNull(getContainer().getGWfWaitForWork().getCurrWfRequestType(), "N"));
			}
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0170"), toStr("LIB"), toStr("%01%.INSERT_WF_ACTIVITY_STACK - vcStackValue := %02%"), VCCURRPROGUNIT, vcstackvalue));
			copy(vcstackvalue,"GLOBAL.WF_ACTIVITY");
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void resetWfActivityStack()
		{

			NString vcstackvalue= NString.getNull();
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			vcstackvalue = translate(vcstackvalue, "WQ", "NN");
			copy(vcstackvalue,"GLOBAL.WF_ACTIVITY");
			
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void deleteWfActivityStack()
		{
			NString vcstackvalue= NString.getNull();
			NNumber nstacklength= NNumber.getNull();
			vcstackvalue = isNull(getNameIn("GLOBAL.WF_ACTIVITY"), "N");
			nstacklength = toNumber(isNull(length(vcstackvalue), 0));
			vcstackvalue = isNull(substring(vcstackvalue, toInt(1), toInt(((nstacklength.subtract(1))))), "N");
			copy(vcstackvalue,"GLOBAL.WF_ACTIVITY");


			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param successIndOut
		*/
		public void wfResetFormStatus(Ref<NBool> successIndOut)
		{

			NString vccurrform= NString.getNull();
			NBool bnoreseterrors = toBool(NBool.True);
			try
			{
				vccurrform = getCurrentTaskName();
				if ( vccurrform.isNull() )
				{
					bnoreseterrors = toBool(NBool.False);
				}
				else {
					if ( !getCurrentTask().getValidationEnabled() )  //vccurrform is the current
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
						//						SupportClasses.FORMS40.SetFormProperty(vccurrform, SupportClasses.Property.VALIDATION, true);
						////
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
						
						
					}
//
					//  Force block level validation
//						
					boolean blockValid = false;
					try {					
						blockValid = validateCurrentBlock();
					} 
					catch(Exception ex) {
						blockValid = false;
					}
//				
					//  If validation fails, then set the success indicator to false
					//  and display an error message
//
					if ( !blockValid )
					{
						bnoreseterrors = toBool(NBool.False);
					}
				}
				successIndOut.val = bnoreseterrors;
			}
			catch(Exception  e)
			{
				successIndOut.val = toBool(NBool.False);
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().displayError(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* --------------------
		* --------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param submittedIndIn
		*/
		public void setWfSubmitted(NString submittedIndIn)
		{

			copy(submittedIndIn,"GLOBAL.WF_SUBMITTED");
			
		}
/* <p>
		* -------------------
		* -------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		*/
		public void declareWorkComplete(NString workId)
		{

			getContainer().getGWfBa().declareWorkComplete(workId);
			
		}
		
	
	
}
