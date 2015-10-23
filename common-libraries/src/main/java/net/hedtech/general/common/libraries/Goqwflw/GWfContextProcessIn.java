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
import net.hedtech.general.common.libraries.Goqwflw.Exceptions.*;

public class GWfContextProcessIn extends AbstractSupportCodeObject {
	

	public GWfContextProcessIn(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONTEXT_PROCESS_IN
	/*
	PACKAGE G$_WF_CONTEXT_PROCESS_IN IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONTEXT_PROCESS_IN provides the interfaces
  needed to obtain action parameter names and values from
  Workflow, the populate and repopulate the items of a form
  with action parameter values as appropriate, and to delete
  the action parameter names and values when they are no longer
  needed.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure EXTRACT_PARAMS extracts from Workflow
  the action parameter names and values associated with a
  workflow activity given its workflow activity ID into a
  construct that is resident within the current form that is
  the workflow activity in progress.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE EXTRACT_PARAMS     (work_id_in  VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure POPULATE_CONTEXT populates the Key Block items
  of a form that is the workflow activity in progress with
  the appropriate input action parameter values, protects the
  items from insert or update, and highlights them to distinguish
  them from any Key Block items that have not been populated
  and protected.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE POPULATE_CONTEXT;

<multilinecomment>--------------------------------------------------------------*\
  The procedure REPOPULATE_CONTEXT temporarily turns off
  protection on those Key Block items which have been populated
  with action parameter values, repopulates those items with
  the appropriate input action parameter values, and reprotects
  those items from insert or update.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE REPOPULATE_CONTEXT;

<multilinecomment>--------------------------------------------------------------*\
  The procedure DELETE_PARAMS deletes the construct that holds
  the names and values of the action parameters associated with
  a workflow activity when this information is no longer
  needed.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE DELETE_PARAMS;

END G$_WF_CONTEXT_PROCESS_IN;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONTEXT_PROCESS_IN
		/*
		PACKAGE BODY G$_WF_CONTEXT_PROCESS_IN IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONTEXT_PROCESS_IN';

--*
--* Declare private subprogam specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  If logging is enabled will display the location to the end user.
\*--------------------------------------------------------------</multilinecomment>
PROCEDURE DISPLAY_LOG_LOCATION;  

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_WF_CONTEXT_EXISTS sets to a given 'Y'
  or 'N' value a variable which indicates whether Banner
  was able to extract from Workflow the names and values
  of all action parameters that are associated with the current
  workflow activity.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE SET_WF_CONTEXT_EXISTS        (exist_ind_in          VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure COPY_INPUT_VALS_INTO_KEY_ITMS loops through
  each of the items in the Key Block of a form and, if that item
  matches an action parameter that has an input action parameter
  value,

  1) validates that the item can indeed be populated with
     a value given its current properties,

  2) reformats the value as appropriate for the item,

  3) ensures that input focus is placed in the item,

  4) populates the item with the appropriate value, and

  5) validates the item.

  This procedure additionally returns as an output parameter
  a Boolean success indicator.  If the navigation to, population
  of, or validation of any of the Key Block items encountered
  errors, this success indicator should be FALSE.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE COPY_INPUT_VALS_INTO_KEY_ITMS(success_ind_out  OUT  BOOLEAN);

<multilinecomment>--------------------------------------------------------------*\
  The procedure DEFER_REQ_ENFORCEMENT stores in a variable the
  indicator of whether a given form allows navigation out
  of required items without entering a value, and then forces
  the given form to defer enforcement of the Required Item
  attribute until the record is validated.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE DEFER_REQ_ENFORCEMENT        (form_name_in          VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure UNDEFER_REQ_ENFORCEMENT restores a given form
  to whatever level of Required Item attribute enforcement it was
  following at the time the procedure DEFER_REQ_ENFORCEMENT was
  last executed in the form, using the value of a variable that
  was stored off by the latter procedure.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE UNDEFER_REQ_ENFORCEMENT      (form_name_in          VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure DEFER_FORM_VALIDATION stores in a variable the
  indicator of whether a given form has enabled or disabled
  Oracle Forms validation processing, and then forces
  the given form to disable validation processing.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE DEFER_FORM_VALIDATION        (form_name_in          VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure UNDEFER_FORM_VALIDATION restores a given form
  to whatever state it was in in terms of the ability to perform
  Oracle Forms validation processing at the time the procedure
  DEFER_FORM_VALIDATION was last executed in the form, using the
  value of a variable that was stored off by the latter procedure.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE UNDEFER_FORM_VALIDATION      (form_name_in          VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_WF_CONTEXT_POPULATED sets to a given 'Y' or
  'N' value a variable to indicate if Banner was already able
  to update the appropriate items of a form with their
  corresponding input action parameter values for the current
  workflow activity.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE SET_WF_CONTEXT_POPULATED     (popul_ind_in          VARCHAR2);

--*
--* Define public subprogram bodies
--*

  PROCEDURE EXTRACT_PARAMS(work_id_in VARCHAR2) IS
   vcCurrSubprog         CONSTANT  VARCHAR2(30) := 'EXTRACT_PARAMS';
   vcParamNameString               VARCHAR2(2000);
   rgParamRgID                     RECORDGROUP;
   gcParamGcID                     GROUPCOLUMN;
   iCounter                        PLS_INTEGER;
   vcParamNameValString            VARCHAR2(2000);
   vcParamPair		                 VARCHAR2(2000);
   vcParamName		                 VARCHAR2(61);
   vcParamValue		                 VARCHAR2(1938);
   iRgRowForParamName              PLS_INTEGER;

  BEGIN
    G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0009','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

    G$_WF_BA.GET_WORK_PARAMETERS(work_id_in,vcParamNameString,vcParamNameValString);
    
    IF vcParamNameString IS NOT NULL THEN
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0010','LIB','********************************'));
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0011','LIB','vcParamNameString  = %01%',vcParamNameString));
      SET_WF_CONTEXT_EXISTS('Y');
      rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

      IF ID_NULL(rgParamRgID) THEN

        rgParamRgID := CREATE_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_NAME',                      CHAR_COLUMN,61);
        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_INPUT_VAL',                 CHAR_COLUMN,1938);
        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_INPUT_VAL_IS_PROTECTED',    CHAR_COLUMN,1);
        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_INPUT_VAL_VIS_ATTRIB',      CHAR_COLUMN,2000);
        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_INPUT_VAL_IS_HIGHLIGHTED',  CHAR_COLUMN,1);
        gcParamGcID := ADD_GROUP_COLUMN(rgParamRgID,'PARAM_OUTPUT_VAL',                CHAR_COLUMN,1938);

        FOR iCounter IN 1..G$_WF_Delimited_String.Counter(vcParamNameString,TRUE,',') LOOP

            vcParamName  := G$_WF_Delimited_String.GetString(vcParamNameString,iCounter,TRUE,',');

            ADD_GROUP_ROW(rgParamRgID,END_OF_GROUP);

            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',                      iCounter,vcParamName);
            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',                 iCounter,NULL);
            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED',    iCounter,NULL);
            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_VIS_ATTRIB',      iCounter,NULL);
            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED',  iCounter,NULL);
            SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_OUTPUT_VAL',                iCounter,NULL);

            vcParamName  := NULL;

        END LOOP;

--  Taken out to get all at once so we are not contacting the server too many times
--        vcParamNameValString := G$_WF_BA.GET_WORK_INPUTS(work_id_in);

        IF vcParamNameValString IS NOT NULL THEN
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0012','LIB','********************************'));
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0013','LIB','vcParamNameValString  = %01%', vcParamNameValString));

           FOR iCounter IN 1..G$_WF_Delimited_String.Counter(vcParamNameValString,TRUE) LOOP

               vcParamPair  := G$_WF_Delimited_String.GetString(vcParamNameValString,iCounter,TRUE);

               IF iCounter = G$_WF_Delimited_String.Counter(vcParamNameValString,TRUE) THEN
                 vcParamPair := SUBSTR(vcParamPair,1,INSTR(vcParamPair,'"',-1) - 1);
               END IF;
 
               vcParamName  := SUBSTR(vcParamPair,1,( INSTR(vcParamPair,'="') - 1));
               vcParamValue := SUBSTR(vcParamPair,( INSTR(vcParamPair,'="') + 2));

               IF vcParamValue IS NULL THEN
                 vcParamValue := G$_WF_HEADER.NULL_STRING;
               END IF;

               iRgRowForParamName := G$_WF_RECGRP.FIND_RG_FIRSTROW_FOR_COLVAL(G$_WF_HEADER.PARAM_RG_NAME,'PARAM_NAME',vcParamName,TRUE);

               IF iRgRowForParamName IS NOT NULL THEN
                 SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iRgRowForParamName,vcParamValue);
               END IF;

               G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0014','LIB','++++++++++++++++++++++++++++++++'));
               G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0015','LIB','vcParamPair  = %01%', vcParamPair ));
               G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0016','LIB','vcParamName  = %01%', vcParamName ));
               G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0017','LIB','vcParamValue = %01%', vcParamValue ));

               vcParamPair        := NULL;
               vcParamName        := NULL;
               vcParamValue       := NULL;
               iRgRowForParamName := NULL;

           END LOOP;

        END IF;

      END IF;

    END IF;

    G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0018','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END EXTRACT_PARAMS;

-----------------------------
-----------------------------

  PROCEDURE POPULATE_CONTEXT IS
   vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'POPULATE_CONTEXT';
   bCopySuccess             BOOLEAN      := TRUE;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0019','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   COPY_INPUT_VALS_INTO_KEY_ITMS(bCopySuccess);

   IF bCopySuccess THEN
     G$_WF_CONTROL_KEY_ITMS.PROTECT_KEY_ITMS;
     G$_WF_CONTROL_KEY_ITMS.HIGHLIGHT_KEY_ITMS;
     SET_WF_CONTEXT_POPULATED('Y');
   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0020','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END POPULATE_CONTEXT;

-----------------------------
-----------------------------

  PROCEDURE REPOPULATE_CONTEXT IS
   vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'REPOPULATE_CONTEXT';
   bCopySuccess             BOOLEAN      := TRUE;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0021','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   IF NOT G$_WF_CONTEXT_VALIDATE.NO_KEY_ITMS_ARE_PROTECTED THEN
     G$_WF_CONTROL_KEY_ITMS.UNPROTECT_KEY_ITMS;
   END IF;

   COPY_INPUT_VALS_INTO_KEY_ITMS(bCopySuccess);

   IF bCopySuccess THEN
     G$_WF_CONTROL_KEY_ITMS.PROTECT_KEY_ITMS;
   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0022','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END REPOPULATE_CONTEXT;

-----------------------------
-----------------------------

  PROCEDURE DELETE_PARAMS IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'DELETE_PARAMS';
   rgParamRgID           RECORDGROUP;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0023','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN
     DELETE_GROUP(rgParamRgID);
   END IF;

   SET_WF_CONTEXT_EXISTS('N');

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0024','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

  END DELETE_PARAMS;

--*
--* Define private subprogram bodies
--*

  PROCEDURE SET_WF_CONTEXT_EXISTS(exist_ind_in VARCHAR2) IS
 
  BEGIN

   COPY(exist_ind_in,'GLOBAL.WF_CONTEXT_EXISTS');

  END SET_WF_CONTEXT_EXISTS;

-----------------------------
-----------------------------

  PROCEDURE COPY_INPUT_VALS_INTO_KEY_ITMS(success_ind_out  OUT  BOOLEAN) IS
   vcDebugHeader CONSTANT  VARCHAR2(100) := vcCurrProgUnit || '.COPY_INPUT_VALS_INTO_KEY_ITMS';   
   rgParamRgID             RECORDGROUP;
   vcFormName              VARCHAR2(30);
   vcItmOrig               VARCHAR2(61);
   vcBlkName               VARCHAR2(30);
   vcItmFirst              VARCHAR2(61);
   vcItmName               VARCHAR2(61);
   bFirstItmProcessed      BOOLEAN;
   iParamRgCurrentRow      PLS_INTEGER;
   bItmIsParam             BOOLEAN := FALSE;
   vcItmNewValue           VARCHAR2(1938);
   excCantPopulItmNow      EXCEPTION;
   vcItmErrStack           VARCHAR2(2000);
   bNoCopiesFailed         BOOLEAN := TRUE;
   vcItmErrType            VARCHAR2(30);
   iItmErrCount            PLS_INTEGER := 0;
   vcItmErrMsg             VARCHAR2(2000);
   vcItmDtype              VARCHAR2(30);
   vcItmType               VARCHAR2(30);
   vcItmRestrictCase       VARCHAR2(30);
   dItmNewValue            DATE;
   bFirstCopyPerformed     BOOLEAN := FALSE;
   vcItmCurrent            VARCHAR2(61);
   excGoItmFailure         EXCEPTION;
   excCopyItmFailure       EXCEPTION;
   excValItmFailure        EXCEPTION;
   excLeaveLastItmFailure  EXCEPTION;
  
  BEGIN
   
   G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || ' BEGIN' );
   
   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     vcFormName          := NAME_IN('SYSTEM.CURRENT_FORM');
     vcBlkName           := NAME_IN('SYSTEM.TRIGGER_BLOCK');
     vcItmOrig           := NAME_IN('SYSTEM.CURSOR_ITEM');
     vcItmFirst          := vcBlkName || '.' || GET_BLOCK_PROPERTY(vcBlkName,FIRST_ITEM);
     vcItmName           := vcItmFirst;
     bFirstItmProcessed  := FALSE;
  
     G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0025','LIB','%01% The SYSTEM.CURSOR item before any items are populated = %02%.',vcDebugHeader,vcItmOrig));

     WHILE ( (vcItmName <> vcItmFirst) OR NOT bFirstItmProcessed ) LOOP

           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0026','LIB','%01% The current item being examined by the population routine = %02%.',vcDebugHeader,vcItmName));

           iParamRgCurrentRow := G$_WF_RECGRP.FIND_RG_FIRSTROW_FOR_COLVAL(G$_WF_HEADER.PARAM_RG_NAME,'PARAM_NAME',vcItmName,TRUE);

           bItmIsParam        := (iParamRgCurrentRow > 0);

           IF bItmIsParam THEN

             G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0027','LIB','%01% The item %02% is considered a parameter.',vcDebugHeader,vcItmName));

             vcItmNewValue := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iParamRgCurrentRow);

             IF vcItmNewValue IS NOT NULL THEN

               G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0028','LIB','%01% The item %02% has an associated parameter value of %03%.',vcDebugHeader,vcItmName,vcItmNewValue));

               IF NOT G$_WF_CONDITIONS.CAN_POPULATE_ITEM(vcItmName,'NOW',vcItmErrStack) THEN
                 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0029','LIB','%01% The item %02% cannot be populated with the value %03%',vcDebugHeader,vcItmName,vcItmNewValue) );                 
               ELSE
                 IF vcItmNewValue = G$_WF_HEADER.NULL_STRING THEN
                   vcItmNewValue := NULL;
                 END IF;

                 vcItmDtype     := GET_ITEM_PROPERTY(vcItmName,DATATYPE);

                 IF vcItmDtype = 'DATETIME' THEN

                   IF goklibs.F_IsExactDate(vcItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT) THEN
                     dItmNewValue  := TO_DATE(vcItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT);
                     vcItmNewValue := TO_CHAR(dItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT);
                   END IF;

                 ELSIF vcItmDtype = 'DATE' THEN

                   IF goklibs.F_IsExactDate(vcItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT) THEN
                     dItmNewValue  := TRUNC(TO_DATE(vcItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT));
                     vcItmNewValue := TO_CHAR(dItmNewValue,G$_WF_HEADER.DATE_FORMAT_DEFAULT);
                   END IF;

                 END IF;

                 vcItmType := GET_ITEM_PROPERTY(vcItmName,ITEM_TYPE);

                 IF vcItmType = 'TEXT ITEM' THEN

                   vcItmRestrictCase := GET_ITEM_PROPERTY(vcItmName,CASE_RESTRICTION);

                   IF vcItmNewValue IS NOT NULL THEN

                     IF vcItmRestrictCase = 'UPPERCASE' THEN
                       vcItmNewValue := UPPER(vcItmNewValue);
                     ELSIF vcItmRestrictCase = 'LOWERCASE' THEN
                       vcItmNewValue := LOWER(vcItmNewValue);
                     END IF;

                   END IF;

                 END IF;

                 IF NOT bFirstCopyPerformed THEN
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0030','LIB','%01% It is FALSE that the first copy has been performed.',vcDebugHeader));
                 ELSE
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0031','LIB','%01% It is TRUE that the first copy has been performed.',vcDebugHeader));
                 END IF;

                 -- If the first item to be populated does not match the original
                 -- item which had input focus before any items were populated,
                 -- then temporarily defer required enforcement and form validation.
                 --
                 -- The deferment is needed to prevent the user from receiving
                 -- error messages for not entering a value for the original item
                 -- when he or she never had an opportunity to enter a value.

                 IF NOT bFirstCopyPerformed AND
                    vcItmName <> vcItmOrig THEN
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0032','LIB','%01% About to defer required enforcement.',vcDebugHeader));
                   DEFER_REQ_ENFORCEMENT(vcFormName);
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0033','LIB','%01% About to defer form validation.',vcDebugHeader));
                   DEFER_FORM_VALIDATION(vcFormName);
                 END IF;

                 IF bFirstCopyPerformed OR
                    (NOT bFirstCopyPerformed AND
                     vcItmName <> vcItmOrig) THEN
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0034','LIB','%01% About to go to item to be populated.',vcDebugHeader));
                   GO_ITEM(vcItmName);
                 END IF;

                 IF NOT FORM_SUCCESS THEN
                   RAISE excGoItmFailure;
                 END IF;

                 IF NOT bFirstCopyPerformed AND
                    vcItmName <> vcItmOrig THEN

                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0035','LIB','%01% About to un-defer required enforcement.',vcDebugHeader));
                   UNDEFER_REQ_ENFORCEMENT(vcFormName);
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0036','LIB','%01% It is currently %02% that required enforcement is deferred.',vcDebugHeader,GET_FORM_PROPERTY(vcFormName,DEFER_REQUIRED_ENFORCEMENT)));

                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0037','LIB','%01% About to un-defer form validation.',vcDebugHeader));
                   UNDEFER_FORM_VALIDATION(vcFormName);
                   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0038','LIB','%01% It is currently %02% that form validation is active.',vcDebugHeader,GET_FORM_PROPERTY(vcFormName,VALIDATION)));
                 END IF;

                 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0039','LIB','%01% About to copy value into item.',vcDebugHeader));
                 COPY(vcItmNewValue,vcItmName);

                 IF NOT FORM_SUCCESS THEN
                   RAISE excCopyItmFailure;
                 END IF;

                 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0040','LIB','%01% About to validate populated item.',vcDebugHeader));
                 VALIDATE(ITEM_SCOPE);

                 IF NOT FORM_SUCCESS THEN
                   RAISE excValItmFailure;
                 END IF;

                 IF NOT bFirstCopyPerformed THEN
                   bFirstCopyPerformed := TRUE;
                 END IF;

                 vcItmDtype          := NULL;
                 vcItmType           := NULL;
                 vcItmRestrictCase   := NULL;
                 dItmNewValue        := NULL;

               END IF;
             END IF;

           END IF;
        
           IF vcItmName = vcItmFirst THEN
             bFirstItmProcessed := TRUE;
           END IF;

           IF GET_ITEM_PROPERTY(vcItmName,NEXTITEM) IS NOT NULL THEN
             vcItmName := vcBlkName || '.' || GET_ITEM_PROPERTY(vcItmName,NEXTITEM);
           ELSE
             vcItmName := vcItmFirst;
           END IF;

           iParamRgCurrentRow := NULL;
           bItmIsParam        := FALSE;
           vcItmNewValue      := NULL;

     END LOOP;

     vcItmCurrent := NAME_IN('SYSTEM.CURSOR_ITEM');

     -- If the last item to be populated does not match the original
     -- item which had input focus before any items were populated,
     -- then return input focus to the original item.

     IF vcItmCurrent <> vcItmOrig THEN
       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0041','LIB','%01% About to return to original item before any items were populated.',vcDebugHeader));
       GO_ITEM(vcItmOrig);

       IF NOT FORM_SUCCESS THEN
         RAISE excLeaveLastItmFailure;
       END IF;

     END IF;

   END IF;

   success_ind_out := bNoCopiesFailed;

  EXCEPTION
    WHEN excCantPopulItmNow THEN

      success_ind_out := FALSE;

      G$_WF_ERROR.SET_TRIGGER_TRACE;
      G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0042','LIB','%01% *ERROR* %02% cannot be populated, as the population of this item with a value from Workflow cannot be guaranteed to not cause errors.',vcDebugHeader,vcItmName));
      G$_WF_ERROR.RESET_TRIGGER_TRACE;

      FOR iItmErrCount IN 1..G$_WF_Delimited_String.Counter(vcItmErrStack,TRUE,',') LOOP

          vcItmErrType := G$_WF_Delimited_String.GetString(vcItmErrStack,iItmErrCount,TRUE,',');

          IF vcItmErrType = 'CANVAS_NOT_VISIBLE' THEN
            vcItmErrMsg := G$_NLS.Get('GOQWFLW-0043','LIB',' -> The item %01% does not exist on a visible canvas.',vcItmName);
          ELSIF vcItmErrType = 'ITEM_NOT_DISPLAYED' THEN
            vcItmErrMsg := G$_NLS.Get('GOQWFLW-0044','LIB',' -> The item %01% is not displayed.',vcItmName);
          ELSIF vcItmErrType = 'ITEM_NOT_ENABLED' THEN
            vcItmErrMsg := G$_NLS.Get('GOQWFLW-0045','LIB',' -> The item %01% is not enabled.',vcItmName);
          ELSIF vcItmErrType = 'ITEM_NOT_NAVIGABLE' THEN
            vcItmErrMsg := G$_NLS.Get('GOQWFLW-0046','LIB',' -> The item %01% is not navigable.',vcItmName);
          ELSIF vcItmErrType = 'INSERT_NOT_ALLOWED' THEN
            vcItmErrMsg := G$_NLS.Get('GOQWFLW-0047','LIB',' -> The item %01% does not allow inserts.',vcItmName);
          END IF;

          IF vcItmErrMsg IS NOT NULL THEN
            G$_WF_ERROR.SET_TRIGGER_TRACE;
            G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || ' - ' || vcItmErrMsg);
            G$_WF_ERROR.RESET_TRIGGER_TRACE;
          END IF;

          vcItmErrType := NULL;
          vcItmErrMsg  := NULL;

      END LOOP;

      vcItmErrStack      := NULL;
      iItmErrCount       := 0;

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0048','LIB','The following item could not be populated: %01%',vcItmName),'MESSAGE',TRUE,FALSE);

      DISPLAY_LOG_LOCATION;

    WHEN excGoItmFailure THEN

      success_ind_out := FALSE;

      IF NOT bFirstCopyPerformed AND vcItmName <> vcItmOrig THEN
        UNDEFER_REQ_ENFORCEMENT(vcFormName);
        UNDEFER_FORM_VALIDATION(vcFormName);
      END IF;

      vcItmCurrent  := NAME_IN('SYSTEM.CURSOR_ITEM');

      G$_WF_ERROR.SET_TRIGGER_TRACE;
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0049','LIB',' ++++++++++++++++++++++++++++++++'));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0050','LIB',' Name of Current Item              = %01%', vcItmCurrent));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0051','LIB',' Name of Next Item to be Populated = %01%', vcItmName ));
      G$_WF_ERROR.RESET_TRIGGER_TRACE;

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0052','LIB','An error was encountered in navigating to an item to be populated.'),'MESSAGE',TRUE,FALSE);

      DISPLAY_LOG_LOCATION;

    WHEN excCopyItmFailure THEN

      success_ind_out := FALSE;

      G$_WF_ERROR.SET_TRIGGER_TRACE;
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0053','LIB',' ++++++++++++++++++++++++++++++++'));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0054','LIB',' Item Name                                              = %01%', vcItmName ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0055','LIB',' Item Datatype                                          = %01%', vcItmDtype ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0056','LIB',' Character Representation of Item Value (if applicable) = %01%', vcItmNewValue ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0057','LIB',' Date Representation of Item Value      (if applicable) = %01%', TO_CHAR(dItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT) ));
      G$_WF_ERROR.RESET_TRIGGER_TRACE;

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0058','LIB','An error was encountered in item population.'),'MESSAGE',TRUE,FALSE);
  
      DISPLAY_LOG_LOCATION;

    WHEN excValItmFailure THEN

      success_ind_out := FALSE;

      G$_WF_ERROR.SET_TRIGGER_TRACE;
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0059','LIB',' ++++++++++++++++++++++++++++++++'));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0060','LIB',' Item Name                                              = %01%', vcItmName ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0061','LIB',' Item Datatype                                          = %01%', vcItmDtype ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0062','LIB',' Character Representation of Item Value (if applicable) = %01%', vcItmNewValue ));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0063','LIB',' Date Representation of Item Value      (if applicable) = %01%', TO_CHAR(dItmNewValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT)) );
      G$_WF_ERROR.RESET_TRIGGER_TRACE;

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0064','LIB','An error was encountered in item validation.'),'MESSAGE',TRUE,FALSE);

      DISPLAY_LOG_LOCATION;

    WHEN excLeaveLastItmFailure THEN

      success_ind_out := FALSE;

      G$_WF_ERROR.SET_TRIGGER_TRACE;
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0065','LIB',' ++++++++++++++++++++++++++++++++'));
      G$_WF_LOGGING.DEBUG_MSG(vcDebugHeader || G$_NLS.Get('GOQWFLW-0066','LIB',' Name of Last Item to be Populated = %01%', vcItmCurrent));
      G$_WF_ERROR.RESET_TRIGGER_TRACE;

      G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0067','LIB','An error was encountered in navigating out of the last item to be populated.'),'MESSAGE',TRUE,FALSE);

      DISPLAY_LOG_LOCATION;

  END COPY_INPUT_VALS_INTO_KEY_ITMS;

-----------------------------
-----------------------------

  PROCEDURE DEFER_REQ_ENFORCEMENT    (form_name_in          VARCHAR2) IS
   vcDeferReqCurr  VARCHAR2(5);

  BEGIN
   vcDeferReqCurr := GET_FORM_PROPERTY(form_name_in,DEFER_REQUIRED_ENFORCEMENT);

   COPY(vcDeferReqCurr,'GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE');

   IF vcDeferReqCurr = 'FALSE' THEN
     SET_FORM_PROPERTY(form_name_in,DEFER_REQUIRED_ENFORCEMENT,PROPERTY_TRUE);
   END IF;

  END DEFER_REQ_ENFORCEMENT;

-----------------------------
-----------------------------

  PROCEDURE UNDEFER_REQ_ENFORCEMENT    (form_name_in         VARCHAR2) IS
   vcDeferReqOrig  VARCHAR2(5);
   vcDeferReqCurr  VARCHAR2(5);

  BEGIN
   vcDeferReqOrig := NVL(NAME_IN('GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE'),'FALSE');

   vcDeferReqCurr := GET_FORM_PROPERTY(form_name_in,DEFER_REQUIRED_ENFORCEMENT);

   IF vcDeferReqCurr <> vcDeferReqOrig THEN

     IF vcDeferReqOrig = 'TRUE' THEN
       SET_FORM_PROPERTY(form_name_in,DEFER_REQUIRED_ENFORCEMENT,PROPERTY_TRUE);
     ELSIF vcDeferReqOrig = 'FALSE' THEN
       SET_FORM_PROPERTY(form_name_in,DEFER_REQUIRED_ENFORCEMENT,PROPERTY_FALSE);
     END IF;

   END IF;

  END UNDEFER_REQ_ENFORCEMENT;

-----------------------------
-----------------------------

  PROCEDURE DEFER_FORM_VALIDATION    (form_name_in          VARCHAR2) IS
   vcValidateFormCurr  VARCHAR2(5);

  BEGIN
   vcValidateFormCurr := GET_FORM_PROPERTY(form_name_in,VALIDATION);

   COPY(vcValidateFormCurr,'GLOBAL.WF_ORIG_FORM_VALIDATION');

   IF vcValidateFormCurr = 'TRUE' THEN
     SET_FORM_PROPERTY(form_name_in,VALIDATION,PROPERTY_FALSE);
   END IF;

  END DEFER_FORM_VALIDATION;

-----------------------------
-----------------------------

  PROCEDURE UNDEFER_FORM_VALIDATION    (form_name_in         VARCHAR2) IS
   vcValidateFormOrig  VARCHAR2(5);
   vcValidateFormCurr  VARCHAR2(5);

  BEGIN
   vcValidateFormOrig := NVL(NAME_IN('GLOBAL.WF_ORIG_FORM_VALIDATION'),'TRUE');

   vcValidateFormCurr := GET_FORM_PROPERTY(form_name_in,VALIDATION);

   IF vcValidateFormCurr <> vcValidateFormOrig THEN

     IF vcValidateFormOrig = 'TRUE' THEN
       SET_FORM_PROPERTY(form_name_in,VALIDATION,PROPERTY_TRUE);
     ELSIF vcValidateFormOrig = 'FALSE' THEN
       SET_FORM_PROPERTY(form_name_in,VALIDATION,PROPERTY_FALSE);
     END IF;

   END IF;

  END UNDEFER_FORM_VALIDATION;

-----------------------------
-----------------------------

  PROCEDURE SET_WF_CONTEXT_POPULATED(popul_ind_in VARCHAR2) IS
 
  BEGIN
   COPY(popul_ind_in,'GLOBAL.WF_CONTEXT_POPULATED');

  END SET_WF_CONTEXT_POPULATED;


-----------------------------
-----------------------------

PROCEDURE DISPLAY_LOG_LOCATION IS 
BEGIN
  IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' AND G$_WF_LOGGING.FILE_NAME IS NOT NULL THEN
    G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0068','LIB','See %01% for details.',G$_WF_LOGGING.FILE_NAME),'MESSAGE',FALSE,FALSE);
  END IF;
END;

END G$_WF_CONTEXT_PROCESS_IN;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONTEXT_PROCESS_IN");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workIdIn
		*/
		public void extractParams(NString workIdIn)
		{

			final NString VCCURRSUBPROG = toStr("EXTRACT_PARAMS");
			NString vcparamnamestring= NString.getNull();
			ValueSet rgparamrgid= null;
			ValueSetColumn gcparamgcid= null;
			int icounter;
			NString vcparamnamevalstring= NString.getNull();
			NString vcparampair= NString.getNull();
			NString vcparamname= NString.getNull();
			NString vcparamvalue= NString.getNull();
			NInteger irgrowforparamname= NInteger.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0009"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				Ref<NString> parameternames_ref = new Ref<NString>(vcparamnamestring);
				Ref<NString> parametervalues_ref = new Ref<NString>(vcparamnamevalstring);
				getContainer().getGWfBa().getWorkParameters(workIdIn, parameternames_ref, parametervalues_ref);
				vcparamnamestring = parameternames_ref.val;
				vcparamnamevalstring = parametervalues_ref.val;
				if ( !vcparamnamestring.isNull() )
				{
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0010"), toStr("LIB"), toStr("********************************")));
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0011"), toStr("LIB"), toStr("vcParamNameString  = %01%"), vcparamnamestring));
					setWfContextExists(toStr("Y"));
					rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
					if ( (rgparamrgid == null) )
					{
						rgparamrgid = createGroup(GWfHeader.PARAM_RG_NAME);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_NAME", ValueSetColumn.CHAR_COL, 61);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_INPUT_VAL", ValueSetColumn.CHAR_COL, 1938);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_INPUT_VAL_IS_PROTECTED", ValueSetColumn.CHAR_COL, 1);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_INPUT_VAL_VIS_ATTRIB", ValueSetColumn.CHAR_COL, 2000);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_INPUT_VAL_IS_HIGHLIGHTED", ValueSetColumn.CHAR_COL, 1);
						gcparamgcid = addGroupColumn(rgparamrgid, "PARAM_OUTPUT_VAL", ValueSetColumn.CHAR_COL, 1938);
						for ( icounter = 1; icounter <= getContainer().getGWfDelimitedString().counter(vcparamnamestring, NBool.True, toStr(",")).getValue(); icounter+= 1 )
						{
							NInteger incounter = toInt(icounter);
							vcparamname = getContainer().getGWfDelimitedString().getstring(vcparamnamestring, toInt(icounter), NBool.True, toStr(","));
							//WARNING: only adding rows at the end is supported
							addGroupRow(rgparamrgid);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), incounter, vcparamname);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), incounter, null);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"), incounter, null);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_VIS_ATTRIB"), incounter, null);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"), incounter, null);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_OUTPUT_VAL"), incounter, null);
							vcparamname = toStr(null);
						}
						//   Taken out to get all at once so we are not contacting the server too many times
						//         vcParamNameValString := G$_WF_BA.GET_WORK_INPUTS(work_id_in);
						if ( !vcparamnamevalstring.isNull() )
						{
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0012"), toStr("LIB"), toStr("********************************")));
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0013"), toStr("LIB"), toStr("vcParamNameValString  = %01%"), vcparamnamevalstring));
							for ( icounter = 1; icounter <= getContainer().getGWfDelimitedString().counter(vcparamnamevalstring, NBool.True).getValue(); icounter++ )
							{
								vcparampair = getContainer().getGWfDelimitedString().getstring(vcparamnamevalstring, toInt(icounter), NBool.True);
								if ( icounter == getContainer().getGWfDelimitedString().counter(vcparamnamevalstring, NBool.True).getValue() )
								{
									vcparampair = substring(vcparampair, toInt(1), inStr(vcparampair, toStr("\""), - (1)).subtract(1));
								}
								vcparamname = substring(vcparampair, toInt(1), ((inStr(vcparampair, toStr("=\"")).subtract(1))));
								vcparamvalue = substring(vcparampair, ((inStr(vcparampair, toStr("=\"")).add(2))));
								if ( vcparamvalue.isNull() )
								{
									vcparamvalue = GWfHeader.NULL_STRING;
								}
								irgrowforparamname = toInt(getContainer().getGWfRecgrp().findRgFirstrowForColval(GWfHeader.PARAM_RG_NAME, toStr("PARAM_NAME"), vcparamname, NBool.True));
								//MORPHIS: should this check be nul or > 0 ?
								if ( !irgrowforparamname.isNull() )
								{
									setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), irgrowforparamname, vcparamvalue);
								}
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0014"), toStr("LIB"), toStr("++++++++++++++++++++++++++++++++")));
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0015"), toStr("LIB"), toStr("vcParamPair  = %01%"), vcparampair));
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0016"), toStr("LIB"), toStr("vcParamName  = %01%"), vcparamname));
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0017"), toStr("LIB"), toStr("vcParamValue = %01%"), vcparamvalue));
								vcparampair = toStr(null);
								vcparamname = toStr(null);
								vcparamvalue = toStr(null);
								irgrowforparamname = toInt(null);
							}
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0018"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, NBool.True, toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateContext()
		{

			final NString VCCURRSUBPROG = toStr("POPULATE_CONTEXT");
			NBool bcopysuccess = NBool.True;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0019"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				Ref<NBool> successIndOut_ref = new Ref<NBool>(bcopysuccess);
				copyInputValsIntoKeyItms(successIndOut_ref);
				bcopysuccess = successIndOut_ref.val;
				if ( bcopysuccess.getValue() )
				{
					getContainer().getGWfControlKeyItms().protectKeyItms();
					getContainer().getGWfControlKeyItms().highlightKeyItms();
					setWfContextPopulated(toStr("Y"));
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0020"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, NBool.True, toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void repopulateContext()
		{

			final NString VCCURRSUBPROG = toStr("REPOPULATE_CONTEXT");
			NBool bcopysuccess = NBool.True;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0021"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( getContainer().getGWfContextValidate().noKeyItmsAreProtected().not() )
				{
					getContainer().getGWfControlKeyItms().unprotectKeyItms();
				}
				Ref<NBool> successIndOut_ref = new Ref<NBool>(bcopysuccess);
				copyInputValsIntoKeyItms(successIndOut_ref);
				bcopysuccess = successIndOut_ref.val;
				if ( bcopysuccess.getValue() )
				{
					getContainer().getGWfControlKeyItms().protectKeyItms();
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0022"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, NBool.True, toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void deleteParams()
		{

			final NString VCCURRSUBPROG = toStr("DELETE_PARAMS");
			ValueSet rgparamrgid= null;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0023"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					deleteGroup(rgparamrgid);
				}
				setWfContextExists(toStr("N"));
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0024"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
		* @param existIndIn
		*/
		public void setWfContextExists(NString existIndIn)
		{
			copy(existIndIn,"GLOBAL.WF_CONTEXT_EXISTS");
			
		}
/* <p>
		* ---------------------------
		* ---------------------------
/* </p>
		* @param successIndOut
		*/
		public void copyInputValsIntoKeyItms(Ref<NBool> successIndOut)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString VCDEBUGHEADER = VCCURRPROGUNIT.append(".COPY_INPUT_VALS_INTO_KEY_ITMS");
			ValueSet rgparamrgid= null;
			NString vcformname= NString.getNull();
			NString vcitmorig= NString.getNull();
			NString vcblkname= NString.getNull();
			NString vcitmfirst= NString.getNull();
			NString vcitmname= NString.getNull();
			NBool bfirstitmprocessed= NBool.getNull();
			int iparamrgcurrentrow;
			NBool bitmisparam = toBool(NBool.False);
			NString vcitmnewvalue= NString.getNull();
			NString vcitmerrstack= NString.getNull();
			NBool bnocopiesfailed = NBool.True;
			NString vcitmerrtype= NString.getNull();
			int iitmerrcount = 0;
			NString vcitmerrmsg= NString.getNull();
			NString vcitmdtype= NString.getNull();
			NString vcitmtype= NString.getNull();
			NString vcitmrestrictcase= NString.getNull();
			NDate ditmnewvalue= NDate.getNull();
			NBool bfirstcopyperformed = toBool(NBool.False);
			NString vcitmcurrent= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(" BEGIN"));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					vcformname = getCurrentTaskName();
					vcblkname = getTriggerBlock();
					vcitmorig = getCursorItem();
					vcitmfirst = vcblkname.append(".").append(getBlockFirstItem(vcblkname));
					vcitmname = vcitmfirst;
					bfirstitmprocessed = toBool(NBool.False);
					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0025"), toStr("LIB"), toStr("%01% The SYSTEM.CURSOR item before any items are populated = %02%."), VCDEBUGHEADER, vcitmorig));
					while (((vcitmname.notEquals(vcitmfirst)) || bfirstitmprocessed.not())) {
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0026"), toStr("LIB"), toStr("%01% The current item being examined by the population routine = %02%."), VCDEBUGHEADER, vcitmname));
						iparamrgcurrentrow = getContainer().getGWfRecgrp().findRgFirstrowForColval(GWfHeader.PARAM_RG_NAME, toStr("PARAM_NAME"), toStr(vcitmname), NBool.True);
						bitmisparam = toBool(iparamrgcurrentrow > 0);
						if ( bitmisparam.getValue() )
						{
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0027"), toStr("LIB"), toStr("%01% The item %02% is considered a parameter."), VCDEBUGHEADER, vcitmname));
							vcitmnewvalue = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), iparamrgcurrentrow);
							if ( !vcitmnewvalue.isNull() )
							{
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0028"), toStr("LIB"), toStr("%01% The item %02% has an associated parameter value of %03%."), VCDEBUGHEADER, vcitmname, vcitmnewvalue));
								Ref<NString> errTypeOut_ref = new Ref<NString>();
								if ( getContainer().getGWfConditions().canPopulateItem(vcitmname, toStr("NOW"), errTypeOut_ref ).not() )
								{
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0029"), toStr("LIB"), toStr("%01% The item %02% cannot be populated with the value %03%"), VCDEBUGHEADER, vcitmname, vcitmnewvalue));
								}
								else {
									if ( vcitmnewvalue.equals(GWfHeader.NULL_STRING) )
									{
										vcitmnewvalue = toStr(null);
									}
									vcitmdtype = getItemDataType(vcitmname);
									if ( vcitmdtype.equals("DATETIME") )
									{
										if ( Goklibs.fIsexactdate(vcitmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT).getValue() )
										{
											ditmnewvalue = toDate(vcitmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT);
											vcitmnewvalue = toChar(ditmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT);
										}
									}
									else if ( vcitmdtype.equals("DATE") ) {
										if ( Goklibs.fIsexactdate(vcitmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT).getValue() )
										{
											ditmnewvalue = trunc(toDate(vcitmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT));
											vcitmnewvalue = toChar(ditmnewvalue, GWfHeader.DATE_FORMAT_DEFAULT);
										}
									}
									vcitmtype = getItemType(vcitmname);
									if ( vcitmtype.equals("TEXT ITEM") )
									{
										// F2J_NOT_SUPPORTED : The property "ITEM's CASE_RESTRICTION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin24".
										//										vcitmrestrictcase = SupportClasses.FORMS40.GetItemProperty(vcitmname, SupportClasses.Property.CASE_RESTRICTION);
										////
										this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's CASE_RESTRICTION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin24'.");
										
										
										if ( !vcitmnewvalue.isNull() )
										{
											if ( vcitmrestrictcase.equals("UPPERCASE") )
											{
												vcitmnewvalue = upper(vcitmnewvalue);
											}
											else if ( vcitmrestrictcase.equals("LOWERCASE") ) {
												vcitmnewvalue = lower(vcitmnewvalue);
											}
										}
									}
									if ( bfirstcopyperformed.not() )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0030"), toStr("LIB"), toStr("%01% It is FALSE that the first copy has been performed."), VCDEBUGHEADER));
									}
									else {
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0031"), toStr("LIB"), toStr("%01% It is TRUE that the first copy has been performed."), VCDEBUGHEADER));
									}
									//  If the first item to be populated does not match the original
									//  item which had input focus before any items were populated,
									//  then temporarily defer required enforcement and form validation.
//
									//  The deferment is needed to prevent the user from receiving
									//  error messages for not entering a value for the original item
									//  when he or she never had an opportunity to enter a value.
									if ( bfirstcopyperformed.not() && vcitmname.notEquals(vcitmorig) )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0032"), toStr("LIB"), toStr("%01% About to defer required enforcement."), VCDEBUGHEADER));
										deferReqEnforcement(vcformname);
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0033"), toStr("LIB"), toStr("%01% About to defer form validation."), VCDEBUGHEADER));
										deferFormValidation(vcformname);
									}
									if ( bfirstcopyperformed.getValue() || (bfirstcopyperformed.not() && vcitmname.notEquals(vcitmorig)) )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0034"), toStr("LIB"), toStr("%01% About to go to item to be populated."), VCDEBUGHEADER));
										//MORPHIS: goitem has failure in all situations ?
										try {
											goItem(vcitmname);
										}
										catch(Exception ex) {											
											// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
											throw new Excgoitmfailure();
										}
									}

									if ( bfirstcopyperformed.not() && vcitmname.notEquals(vcitmorig) )
									{
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0035"), toStr("LIB"), toStr("%01% About to un-defer required enforcement."), VCDEBUGHEADER));
										undeferReqEnforcement(vcformname);
										// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
										//										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0036"), toStr("LIB"), toStr("%01% It is currently %02% that required enforcement is deferred."), VCDEBUGHEADER, SupportClasses.FORMS40.GetFormProperty(vcformname, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT)));
										////
										this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
										
										
										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0037"), toStr("LIB"), toStr("%01% About to un-defer form validation."), VCDEBUGHEADER));
										undeferFormValidation(vcformname);
										// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
										//										getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0038"), toStr("LIB"), toStr("%01% It is currently %02% that form validation is active."), VCDEBUGHEADER, SupportClasses.FORMS40.GetFormProperty(vcformname, SupportClasses.Property.VALIDATION)));
										////
										this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
										
										
									}
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0039"), toStr("LIB"), toStr("%01% About to copy value into item."), VCDEBUGHEADER));
									try {
										copy(vcitmnewvalue,vcitmname);
									}
									catch(Exception ex) {
										// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
										throw new Exccopyitmfailure();
									}
									getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0040"), toStr("LIB"), toStr("%01% About to validate populated item."), VCDEBUGHEADER));
									
									boolean success = validateCurrentItem();
									if ( !success )
									{
										// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
										throw new Excvalitmfailure();
									}
									if ( bfirstcopyperformed.not() )
									{
										bfirstcopyperformed = NBool.True;
									}
									vcitmdtype = toStr(null);
									vcitmtype = toStr(null);
									vcitmrestrictcase = toStr(null);
									ditmnewvalue = toDate(null);
								}
							}
						}
						if ( vcitmname.equals(vcitmfirst) )
						{
							bfirstitmprocessed = NBool.True;
						}
						if ( !getItemNextItem(vcitmname).isNull() )
						{
							vcitmname = vcblkname.append(".").append(getItemNextItem(vcitmname));
						}
						else {
							vcitmname = vcitmfirst;
						}
						iparamrgcurrentrow = 0;
						bitmisparam = toBool(NBool.False);
						vcitmnewvalue = toStr(null);
					}
					vcitmcurrent = getCursorItem();
					//  If the last item to be populated does not match the original
					//  item which had input focus before any items were populated,
					//  then return input focus to the original item.
					if ( vcitmcurrent.notEquals(vcitmorig) )
					{
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0041"), toStr("LIB"), toStr("%01% About to return to original item before any items were populated."), VCDEBUGHEADER));
						try {
							goItem(vcitmorig);
						} 
						catch (Exception e) {

							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							throw new Excleavelastitmfailure();
						}
					}
				}
				successIndOut.val = bnocopiesfailed;
			}
			//MORPHIS: This exception is never raise
			/*
			catch(Exccantpopulitmnow e)
			{
				successIndOut.val = toBool(NBool.False);
				getContainer().getGWfError().setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0042"), toStr("LIB"), toStr("%01% *ERROR* %02% cannot be populated, as the population of this item with a value from Workflow cannot be guaranteed to not cause errors."), VCDEBUGHEADER, vcitmname));
				getContainer().getGWfError().resetTriggerTrace();
				for ( iitmerrcount = 1; iitmerrcount <= getContainer().getGWfDelimitedString().counter(vcitmerrstack, NBool.True, toStr(",")).getValue(); iitmerrcount+= 1 )
				{
					vcitmerrtype = getContainer().getGWfDelimitedString().getstring(vcitmerrstack, toInt(iitmerrcount), NBool.True, toStr(","));
					if ( vcitmerrtype.equals("CANVAS_NOT_VISIBLE") )
					{
						vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0043"), toStr("LIB"), toStr(" -> The item %01% does not exist on a visible canvas."), vcitmname);
					}
					else if ( vcitmerrtype.equals("ITEM_NOT_DISPLAYED") ) {
						vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0044"), toStr("LIB"), toStr(" -> The item %01% is not displayed."), vcitmname);
					}
					else if ( vcitmerrtype.equals("ITEM_NOT_ENABLED") ) {
						vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0045"), toStr("LIB"), toStr(" -> The item %01% is not enabled."), vcitmname);
					}
					else if ( vcitmerrtype.equals("ITEM_NOT_NAVIGABLE") ) {
						vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0046"), toStr("LIB"), toStr(" -> The item %01% is not navigable."), vcitmname);
					}
					else if ( vcitmerrtype.equals("INSERT_NOT_ALLOWED") ) {
						vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0047"), toStr("LIB"), toStr(" -> The item %01% does not allow inserts."), vcitmname);
					}
					if ( !vcitmerrmsg.isNull() )
					{
						getContainer().getGWfError().setTriggerTrace();
						getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(" - ").append(vcitmerrmsg));
						getContainer().getGWfError().resetTriggerTrace();
					}
					vcitmerrtype = toStr(null);
					vcitmerrmsg = toStr(null);
				}
				vcitmerrstack = toStr(null);
				iitmerrcount = 0;
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0048"), toStr("LIB"), toStr("The following item could not be populated: %01%"), vcitmname), toStr("MESSAGE"), NBool.True, toBool(NBool.False));
				
				displayLogLocation();
			}
			*/
			catch(Excgoitmfailure e)
			{
				successIndOut.val = toBool(NBool.False);
				if ( bfirstcopyperformed.not() && vcitmname.notEquals(vcitmorig) )
				{
					undeferReqEnforcement(vcformname);
					undeferFormValidation(vcformname);
				}
				vcitmcurrent = getCursorItem();
				getContainer().getGWfError().setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0049"), toStr("LIB"), toStr(" ++++++++++++++++++++++++++++++++"))));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0050"), toStr("LIB"), toStr(" Name of Current Item              = %01%"), vcitmcurrent)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0051"), toStr("LIB"), toStr(" Name of Next Item to be Populated = %01%"), vcitmname)));
				getContainer().getGWfError().resetTriggerTrace();
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0052"), toStr("LIB"), toStr("An error was encountered in navigating to an item to be populated.")), toStr("MESSAGE"), NBool.True, toBool(NBool.False));
				
				displayLogLocation();
			}
			catch(Exccopyitmfailure e)
			{
				successIndOut.val = toBool(NBool.False);
				getContainer().getGWfError().setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0053"), toStr("LIB"), toStr(" ++++++++++++++++++++++++++++++++"))));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0054"), toStr("LIB"), toStr(" Item Name                                              = %01%"), vcitmname)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0055"), toStr("LIB"), toStr(" Item Datatype                                          = %01%"), vcitmdtype)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0056"), toStr("LIB"), toStr(" Character Representation of Item Value (if applicable) = %01%"), vcitmnewvalue)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0057"), toStr("LIB"), toStr(" Date Representation of Item Value      (if applicable) = %01%"), toChar(ditmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT))));
				getContainer().getGWfError().resetTriggerTrace();
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0058"), toStr("LIB"), toStr("An error was encountered in item population.")), toStr("MESSAGE"), NBool.True, toBool(NBool.False));
				
				displayLogLocation();
			}
			catch(Excvalitmfailure e)
			{
				successIndOut.val = toBool(NBool.False);
				getContainer().getGWfError().setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0059"), toStr("LIB"), toStr(" ++++++++++++++++++++++++++++++++"))));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0060"), toStr("LIB"), toStr(" Item Name                                              = %01%"), vcitmname)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0061"), toStr("LIB"), toStr(" Item Datatype                                          = %01%"), vcitmdtype)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0062"), toStr("LIB"), toStr(" Character Representation of Item Value (if applicable) = %01%"), vcitmnewvalue)));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0063"), toStr("LIB"), toStr(" Date Representation of Item Value      (if applicable) = %01%"), toChar(ditmnewvalue, GWfHeader.DATETIME_FORMAT_DEFAULT))));
				getContainer().getGWfError().resetTriggerTrace();
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0064"), toStr("LIB"), toStr("An error was encountered in item validation.")), toStr("MESSAGE"), NBool.True, toBool(NBool.False));
				
				displayLogLocation();
			}
			catch(Excleavelastitmfailure e)
			{
				successIndOut.val = toBool(NBool.False);
				getContainer().getGWfError().setTriggerTrace();
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0065"), toStr("LIB"), toStr(" ++++++++++++++++++++++++++++++++"))));
				getContainer().getGWfLogging().debugMsg(VCDEBUGHEADER.append(GNls.Fget(toStr("GOQWFLW-0066"), toStr("LIB"), toStr(" Name of Last Item to be Populated = %01%"), vcitmcurrent)));
				getContainer().getGWfError().resetTriggerTrace();
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0067"), toStr("LIB"), toStr("An error was encountered in navigating out of the last item to be populated.")), toStr("MESSAGE"), NBool.True, toBool(NBool.False));
				
				displayLogLocation();
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formNameIn
		*/
		public void deferReqEnforcement(NString formNameIn)
		{

			NString vcdeferreqcurr= NString.getNull();
			// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
			//			vcdeferreqcurr = SupportClasses.FORMS40.GetFormProperty(formNameIn, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
			
			
			copy(vcdeferreqcurr,"GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE");
			if ( vcdeferreqcurr.equals("FALSE") )
			{
				// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
				//				SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT, true);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
				
				
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formNameIn
		*/
		public void undeferReqEnforcement(NString formNameIn)
		{

			NString vcdeferreqorig= NString.getNull();
			NString vcdeferreqcurr= NString.getNull();
			vcdeferreqorig = isNull(getNameIn("GLOBAL.WF_ORIG_DEFER_REQ_ENFORCE"), "FALSE");
			// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
			//			vcdeferreqcurr = SupportClasses.FORMS40.GetFormProperty(formNameIn, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
			
			
			if ( vcdeferreqcurr.notEquals(vcdeferreqorig) )
			{
				if ( vcdeferreqorig.equals("TRUE") )
				{
					// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
					//					SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT, true);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
					
					
				}
				else if ( vcdeferreqorig.equals("FALSE") ) {
					// F2J_NOT_SUPPORTED : The property "FORM's DEFER_REQUIRED_ENFORCEMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
					//					SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.DEFER_REQUIRED_ENFORCEMENT, false);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's DEFER_REQUIRED_ENFORCEMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
					
					
				}
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formNameIn
		*/
		public void deferFormValidation(NString formNameIn)
		{

			NString vcvalidateformcurr= NString.getNull();
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
			//			vcvalidateformcurr = SupportClasses.FORMS40.GetFormProperty(formNameIn, SupportClasses.Property.VALIDATION);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
			
			
			copy(vcvalidateformcurr,"GLOBAL.WF_ORIG_FORM_VALIDATION");
			if ( vcvalidateformcurr.equals("TRUE") )
			{
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
				//				SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.VALIDATION, false);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
				
				
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formNameIn
		*/
		public void undeferFormValidation(NString formNameIn)
		{

			NString vcvalidateformorig= NString.getNull();
			NString vcvalidateformcurr= NString.getNull();
			vcvalidateformorig = isNull(getNameIn("GLOBAL.WF_ORIG_FORM_VALIDATION"), "TRUE");
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
			//			vcvalidateformcurr = SupportClasses.FORMS40.GetFormProperty(formNameIn, SupportClasses.Property.VALIDATION);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
			
			
			if ( vcvalidateformcurr.notEquals(vcvalidateformorig) )
			{
				if ( vcvalidateformorig.equals("TRUE") )
				{
					// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
					//					SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.VALIDATION, true);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
					
					
				}
				else if ( vcvalidateformorig.equals("FALSE") ) {
					// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
					//					SupportClasses.FORMS40.SetFormProperty(formNameIn, SupportClasses.Property.VALIDATION, false);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
					
					
				}
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param populIndIn
		*/
		public void setWfContextPopulated(NString populIndIn)
		{

			copy(populIndIn,"GLOBAL.WF_CONTEXT_POPULATED");

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void displayLogLocation()
		{

			if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") && !getContainer().getGWfLogging().fileName.isNull() )
			{
				getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0068"), toStr("LIB"), toStr("See %01% for details."), getContainer().getGWfLogging().fileName), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));				
			}
			
		}
		
	
	
}
