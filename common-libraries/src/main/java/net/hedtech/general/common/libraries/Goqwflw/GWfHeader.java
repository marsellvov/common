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

public class GWfHeader extends AbstractSupportCodeObject {
	

	public GWfHeader(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_HEADER
	/*
	PACKAGE G$_WF_HEADER IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_HEADER declares the values of all public
  constants that may be used by the other packages of this
  library and by other Banner Oracle Forms modules as
  appropriate.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public variables
--*

-- The name of the Banner Workflow-Awareness Library

 MODULE_NAME                      CONSTANT VARCHAR2(30) := 'GOQWFLW';

-- The name of the General System Global Establishment Form

 INIT_FORM                        CONSTANT VARCHAR2(30) := 'GUAINIT';

-- 5000-1 The name of the General Menu Application Form is being
--        defined here because the value of GLOBAL.MENU_FORM
--        may not yet be defined.

 MENU_FORM                        CONSTANT VARCHAR2(30) := 'GUAGMNU';

-- The default error message returned by error handling routines
-- should no specific error be detected

 ERR_MSG_DEFAULT                  CONSTANT VARCHAR2(40) := 'An unknown error has been encountered.';

-- The name of the icon associated with the Workflow Submit button

 SUBMIT_ICONAME                   CONSTANT VARCHAR2(30) := 'WF_SUBMIT';

-- The name of the icon associated with the Workflow Continue button

 CONTINUE_ICONAME                 CONSTANT VARCHAR2(30) := 'WF_CONTINUE';

-- The name of the icon associated with the Workflow Release button

 RELEASE_ICONAME                  CONSTANT VARCHAR2(30) := 'WF_RELEASE';

-- The name of the icon associated with the Workflow (Electronic Documents)
-- Apply button
-- 80-4 remove Electronic Documents module references
-- APPLY_ICONAME                  CONSTANT VARCHAR2(30) := 'WF_APPLY';

-- The name of the icon associated with the Workflow Debug button

 DEBUG_ICONAME                    CONSTANT VARCHAR2(30) := 'WF_DEBUG';

-- The name of the object which serves as the Banner Adapter
-- to Workflow

 INTERFACE_OBJECT_NAME            CONSTANT VARCHAR2(30) := 'wfban32.dll';

-- The name of the object which provides the interface necessary
-- to ensure that a Workflow-aware application comes into focus
-- on all Windows 32-bit operating systems.

 SETFOCUS_OBJECT_NAME             CONSTANT VARCHAR2(30) := 'wfsetfocus.dll';

-- The name of the timer that polls for workflow tasks and activities
-- to perform 

 TM_NAME                          CONSTANT VARCHAR2(30) := 'WORKFLOW';

-- The time interval (in milliseconds) at which the timer
-- that polls for workflow tasks and activities expires

 TIME_INTERVAL                    CONSTANT NUMBER       := 3000;

-- The name of the Key Block item on the General Menu Application Form
-- in which the name of a Banner object should be placed to launch
-- that object as a workflow task or activity

 MENU_FORM_KEY_ITM                CONSTANT VARCHAR2(30) := 'KEY_BLOCK.NEXT_SELECTION';

-- The name of the alert on the General Menu Application Form
-- that should be used to ask a user if he or she wants to
-- exit Banner if Workflow is logged off or exited

 MENU_FORM_QUIT_ALERT             CONSTANT VARCHAR2(30) := 'QUIT_ALERT';

-- The code that is used to indicate that a given Banner object
-- is an Oracle Forms module (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
-- column)

 FORM_ID                          CONSTANT VARCHAR2(30) := 'FORM';

-- The code that is used to indicate that a given Banner object
-- is a QuickFlow object (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
-- column)

 QUICKFLOW_ID                     CONSTANT VARCHAR2(30) := 'QUICKFLOW';

-- The code that is used to indicate that a given Banner object
-- is an Job Submission object (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
-- column)

 JOBS_ID                          CONSTANT VARCHAR2(30) := 'JOBS';

-- The name of the Process Submission Control Form

 JOBSUB_FORM                      CONSTANT VARCHAR2(30) := 'GJAPCTL';

-- The name of the Workflow Electronic Documents Data Form

-- 80-4 remove Electronic Documents module references
-- WFED_DATA_FORM                   CONSTANT VARCHAR2(30) := 'GOQWFED';

-- The character string that was placed in the Default Where Clause
-- property of the Key Block of every Banner form as part of the
-- conversion to use the new user interface and programming standards
-- of Banner release 4.0
--
-- This update was applied so that a module could determine at runtime
-- whether a given block is the Key Block of a form

 KEY_BLOCK_ID                     CONSTANT VARCHAR2(30) := 'KEY-BLOCK';

-- The name of the record group that is created when a form has been
-- launched as a workflow activity and that activity has one or
-- more associated action parameters

 PARAM_RG_NAME                    CONSTANT VARCHAR2(30) := 'WF_PARAMS';

-- The character representation of NULL that is used by the action
-- parameter record group to differentiate between a parameter
-- that has no input value (e.g., an action parameter for output only)
-- and one whose value was sent to Banner as NULL so that the
-- appropriate form item is updated to that value.

 NULL_STRING                      CONSTANT VARCHAR2(30) := '\000';

-- The name of the visual attribute that should be available via reference
-- from within every form to highlight every Key Block item that has been
-- populated with an action parameter value

 CONTEXT_HIGHLIGHT_VIS_ATTRIB     CONSTANT VARCHAR2(30) := 'G$_NVA_ITEM_REQUIRED';

-- The name of the date format string that is used to convert the character
-- value of an action parameter of type Date if its associated item
-- is of datatype DATE 

 DATE_FORMAT_DEFAULT              CONSTANT VARCHAR2(30) := NAME_IN('GLOBAL.NLS_DATE_FORMAT');

-- The name of the date format string that is used to convert the character
-- value of an action parameter of type Date if its associated item
-- is of datatype DATETIME 

 DATETIME_FORMAT_DEFAULT          CONSTANT VARCHAR2(30) := DATE_FORMAT_DEFAULT || ' HH24:MI:SS';

END G$_WF_HEADER;
	*/
	
			// --------------------------------------------------------------*\
		// The package G$_WF_HEADER declares the values of all public
		// constants that may be used by the other packages of this
		// library and by other Banner Oracle Forms modules as
		// appropriate.
		// \*--------------------------------------------------------------
		// *
		// * Declare public variables
		// *
		//  The name of the Banner Workflow-Awareness Library
		public static final NString MODULE_NAME = toStr("GOQWFLW");
		//  The name of the General System Global Establishment Form
		public static final NString INIT_FORM = toStr("GUAINIT");
		//  5000-1 The name of the General Menu Application Form is being
		//         defined here because the value of GLOBAL.MENU_FORM
		//         may not yet be defined.
		public static final NString MENU_FORM = toStr("GUAGMNU");
		//  The default error message returned by error handling routines
		//  should no specific error be detected
		public static final NString ERR_MSG_DEFAULT = toStr("An unknown error has been encountered.");
		//  The name of the icon associated with the Workflow Submit button
		public static final NString SUBMIT_ICONAME = toStr("WF_SUBMIT");
		//  The name of the icon associated with the Workflow Continue button
		public static final NString CONTINUE_ICONAME = toStr("WF_CONTINUE");
		//  The name of the icon associated with the Workflow Release button
		public static final NString RELEASE_ICONAME = toStr("WF_RELEASE");
		//  The name of the icon associated with the Workflow (Electronic Documents)
		//  Apply button
		//  80-4 remove Electronic Documents module references
		//  APPLY_ICONAME                  CONSTANT VARCHAR2(30) := 'WF_APPLY';
		//  The name of the icon associated with the Workflow Debug button
		public static final NString DEBUG_ICONAME = toStr("WF_DEBUG");
		//  The name of the object which serves as the Banner Adapter
		//  to Workflow
		public static final NString INTERFACE_OBJECT_NAME = toStr("wfban32.dll");
		//  The name of the object which provides the interface necessary
		//  to ensure that a Workflow-aware application comes into focus
		//  on all Windows 32-bit operating systems.
		public static final NString SETFOCUS_OBJECT_NAME = toStr("wfsetfocus.dll");
		//  The name of the timer that polls for workflow tasks and activities
		//  to perform 
		public static final NString TM_NAME = toStr("WORKFLOW");
		//  The time interval (in milliseconds) at which the timer
		//  that polls for workflow tasks and activities expires
		public static final NNumber TIME_INTERVAL = toNumber(3000);
		//  The name of the Key Block item on the General Menu Application Form
		//  in which the name of a Banner object should be placed to launch
		//  that object as a workflow task or activity
		public static final NString MENU_FORM_KEY_ITM = toStr("KEY_BLOCK.NEXT_SELECTION");
		//  The name of the alert on the General Menu Application Form
		//  that should be used to ask a user if he or she wants to
		//  exit Banner if Workflow is logged off or exited
		public static final NString MENU_FORM_QUIT_ALERT = toStr("QUIT_ALERT");
		//  The code that is used to indicate that a given Banner object
		//  is an Oracle Forms module (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
		//  column)
		public static final NString FORM_ID = toStr("FORM");
		//  The code that is used to indicate that a given Banner object
		//  is a QuickFlow object (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
		//  column)
		public static final NString QUICKFLOW_ID = toStr("QUICKFLOW");
		//  The code that is used to indicate that a given Banner object
		//  is an Job Submission object (as stored in the GUBOBJS.GUBOBJS_OBJT_CODE
		//  column)
		public static final NString JOBS_ID = toStr("JOBS");
		//  The name of the Process Submission Control Form
		public static final NString JOBSUB_FORM = toStr("GJAPCTL");
		//  The name of the Workflow Electronic Documents Data Form
		//  80-4 remove Electronic Documents module references
		//  WFED_DATA_FORM                   CONSTANT VARCHAR2(30) := 'GOQWFED';
		//  The character string that was placed in the Default Where Clause
		//  property of the Key Block of every Banner form as part of the
		//  conversion to use the new user interface and programming standards
		//  of Banner release 4.0
		// 
		//  This update was applied so that a module could determine at runtime
		//  whether a given block is the Key Block of a form
		public static final NString KEY_BLOCK_ID = toStr("KEY-BLOCK");
		//  The name of the record group that is created when a form has been
		//  launched as a workflow activity and that activity has one or
		//  more associated action parameters
		public static final NString PARAM_RG_NAME = toStr("WF_PARAMS");
		//  The character representation of NULL that is used by the action
		//  parameter record group to differentiate between a parameter
		//  that has no input value (e.g., an action parameter for output only)
		//  and one whose value was sent to Banner as NULL so that the
		//  appropriate form item is updated to that value.
		public static final NString NULL_STRING = toStr("\\000");
		//  The name of the visual attribute that should be available via reference
		//  from within every form to highlight every Key Block item that has been
		//  populated with an action parameter value
		public static final NString CONTEXT_HIGHLIGHT_VIS_ATTRIB = toStr("G$_NVA_ITEM_REQUIRED");
		//  The name of the date format string that is used to convert the character
		//  value of an action parameter of type Date if its associated item
		//  is of datatype DATE 
		public static final NString DATE_FORMAT_DEFAULT = getNameIn("GLOBAL.NLS_DATE_FORMAT");
		//  The name of the date format string that is used to convert the character
		//  value of an action parameter of type Date if its associated item
		//  is of datatype DATETIME 
		public static final NString DATETIME_FORMAT_DEFAULT = DATE_FORMAT_DEFAULT.append(" HH24:MI:SS");

			
	
	
}
