package net.hedtech.general.common.libraries.Goqwflw;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.core.utils.misc.RefObject;
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

public class GWfContextValidate extends AbstractSupportCodeObject {
	

	public GWfContextValidate(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONTEXT_VALIDATE
	/*
	PACKAGE G$_WF_CONTEXT_VALIDATE IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONTEXT_VALIDATE contains functions that
  return Boolean values to indicate the status of:

  1) the names or values of the action parameters for a workflow
     activity,

  2) the Key Block items of a form that have been or will be
     populated with input action parameter values.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function CAN_LOCATE_PARAMS returns TRUE if the construct
  which holds the action parameter names and values for the
  current workflow activity can be located.

  If the construct cannot be located and the given display error
  indicator is TRUE, the user is presented with an error message.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  CAN_LOCATE_PARAMS             (display_err_in  BOOLEAN) RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function ALL_PARAM_NAMES_ARE_VALID_ITMS returns TRUE if
  each of the action parameter names for the current workflow
  activity are valid items of the appropriate syntax and type
  on the current form.

  If any action parameter is not a valid form item, the user
  is presented with an error message.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  ALL_PARAM_NAMES_ARE_VALID_ITMS                          RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function NO_PARAMS_HAVE_INPUT_VALS returns TRUE if
  none of the action parameters for the current workflow activity
  has an associated input value.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  NO_PARAMS_HAVE_INPUT_VALS                               RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function CAN_POPULATE_ALL_ITMS returns TRUE if all form
  items that are action parameters for the current workflow
  activity can ever be populated by their associated input value.

  If any item can never be populated with an input action
  parameter value, the user is presented with an error message.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  CAN_POPULATE_ALL_ITMS                                   RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function NO_KEY_ITM_MAX_LN_EXCEEDED returns TRUE if none
  of the input action parameter values exceed the maximum length
  of their associated Key Block items.
  
  If any input action parameter value exceeds the maximum
  allowable length, the user is presented with an error message.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  NO_KEY_ITM_MAX_LN_EXCEEDED                              RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function NO_KEY_ITMS_ARE_PROTECTED returns TRUE if the
  values of none of the Key Block items that are associated with
  action parameters are currently protected from insert or update.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  NO_KEY_ITMS_ARE_PROTECTED                               RETURN BOOLEAN;

<multilinecomment>--------------------------------------------------------------*\
  The function NO_KEY_ITMS_ARE_HIGHLIGHTED returns TRUE if the
  values of none of the Key Block items that are associated with
  action parameters are currently highlighted.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  NO_KEY_ITMS_ARE_HIGHLIGHTED                             RETURN BOOLEAN;

END G$_WF_CONTEXT_VALIDATE;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONTEXT_VALIDATE
		/*
		PACKAGE BODY G$_WF_CONTEXT_VALIDATE IS

--*
--* Declare private variables
--*

  vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONTEXT_VALIDATE';

--*
--* Declare private subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function EXCEEDS_MAX_LENGTH_BY returns a positive integer
  representing the number of characters by which a given value
  exceeds the maximum length of a given item.

  If the maximum length is not exceeded, the function returns 0.
\*--------------------------------------------------------------</multilinecomment>

  FUNCTION  EXCEEDS_MAX_LENGTH_BY        (itm_in        VARCHAR2,
                                          itm_value_in  VARCHAR2) RETURN PLS_INTEGER;

--*
--* Define public subprogram bodies
--*
  
  FUNCTION CAN_LOCATE_PARAMS(display_err_in  BOOLEAN) RETURN BOOLEAN IS

   vcCurrSubprog    CONSTANT  VARCHAR2(30) := 'CAN_LOCATE_PARAMS';
   rgParamRgID                RECORDGROUP;
   bCanLocateParams           BOOLEAN      := TRUE;

  BEGIN

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0085','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF ID_NULL(rgParamRgID) THEN
     bCanLocateParams := FALSE;

     IF display_err_in = TRUE THEN
       G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0086','LIB','No activity parameters could be identified.'),'MESSAGE',G$_WF_CONDITIONS.IS_WF_ACTIVITY,FALSE);
     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0087','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bCanLocateParams;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

    RETURN NULL; 
  END CAN_LOCATE_PARAMS;

-----------------------------
-----------------------------

  FUNCTION ALL_PARAM_NAMES_ARE_VALID_ITMS RETURN BOOLEAN IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)    := 'ALL_PARAM_NAMES_ARE_VALID_ITMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   vcItmErrType                  VARCHAR2(30);
   vcItmErrMsg                   VARCHAR2(2000);
   bAllItmsAreValid              BOOLEAN         := TRUE;
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0088','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN
     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);

     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',iParamRgCurrentRow);

         IF NOT G$_WF_CONDITIONS.IS_ITEM_VALID(vcItmName,vcItmErrType) THEN

           bAllItmsAreValid := FALSE;

           IF vcItmErrType = 'BLOCK_NOT_GIVEN' THEN
             vcItmErrMsg := '*ERROR* The parameter ' || vcItmName || ' must be provided in <block>.<item> format.';
           ELSIF vcItmErrType = 'ITEM_NOT_FOUND' THEN
             vcItmErrMsg := '*ERROR* The parameter ' || vcItmName || ' is not a valid item.';
           ELSIF vcItmErrType = 'INVALID_TYPE' THEN
             vcItmErrMsg := '*ERROR* The parameter ' || vcItmName || ' is an item of an invalid type.';
           END IF;

           IF vcItmErrMsg IS NOT NULL THEN
             G$_WF_ERROR.SET_TRIGGER_TRACE;
             G$_WF_LOGGING.DEBUG_MSG(vcItmErrMsg);
             G$_WF_ERROR.RESET_TRIGGER_TRACE;
           END IF;

         END IF;

         vcItmName    := NULL;
         vcItmErrType := NULL;
         vcItmErrMsg  := NULL;

     END LOOP;

     IF NOT bAllItmsAreValid THEN

       G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0089','LIB','One or more parameters are invalid form items.'),'MESSAGE',TRUE,FALSE);
    
       IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' AND
          G$_WF_LOGGING.FILE_NAME IS NOT NULL THEN
         G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0090','LIB','See %01% for details.',G$_WF_LOGGING.FILE_NAME),'MESSAGE',FALSE,FALSE);
       END IF;

     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0091','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bAllItmsAreValid;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

      RETURN NULL; 
  END ALL_PARAM_NAMES_ARE_VALID_ITMS;
-----------------------------
-----------------------------

  FUNCTION NO_PARAMS_HAVE_INPUT_VALS RETURN BOOLEAN IS
   vcCurrSubprog         CONSTANT  VARCHAR2(30) := 'NO_PARAMS_HAVE_INPUT_VALS';
   rgParamRgID                     RECORDGROUP;
   iParamCount                     PLS_INTEGER  := 0;
   gcParamGcID                     GROUPCOLUMN;
   iNullParamValueCount            PLS_INTEGER  := 0;
   bAllInputNull                   BOOLEAN      := FALSE;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0092','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN
     iParamCount := GET_GROUP_ROW_COUNT(rgParamRgID);
     gcParamGcID := FIND_COLUMN(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL');

     IF NOT ID_NULL(gcParamGcID) THEN
       iNullParamValueCount := G$_WF_RECGRP.FIND_RG_ROWCOUNT_FOR_COLVAL(G$_WF_HEADER.PARAM_RG_NAME,'PARAM_INPUT_VAL',NULL);

       IF iNullParamValueCount = iParamCount THEN
         bAllInputNull := TRUE;
       END IF;

     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0093','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bAllInputNull;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

      RETURN NULL; 
  END NO_PARAMS_HAVE_INPUT_VALS;

-----------------------------
-----------------------------

  FUNCTION CAN_POPULATE_ALL_ITMS RETURN BOOLEAN IS
   vcCurrSubprog         CONSTANT  VARCHAR2(30)    := 'CAN_POPULATE_ALL_ITMS';
   rgParamRgID                     RECORDGROUP;
   iParamRgRowCount                PLS_INTEGER;
   iParamRgCurrentRow              PLS_INTEGER;
   vcItmName                       VARCHAR2(61);
   vcItmNewValue                   VARCHAR2(1938);
   vcItmErrStack                   VARCHAR2(2000);
   vcItmErrType                    VARCHAR2(30);
   iItmErrCount                    PLS_INTEGER     := 0;
   vcItmErrMsg                     VARCHAR2(2000);
   bCanPopulateAllItms             BOOLEAN         := TRUE;
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0094','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName     := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',     iParamRgCurrentRow);
         vcItmNewValue := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iParamRgCurrentRow);
     
         IF vcItmNewValue IS NOT NULL THEN

           IF NOT G$_WF_CONDITIONS.CAN_POPULATE_ITEM(vcItmName,'EVER',vcItmErrStack) THEN

             bCanPopulateAllItms := FALSE;

             G$_WF_ERROR.SET_TRIGGER_TRACE;
             G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0095','LIB','*ERROR* %01% cannot be populated, as the population of this item with a value from Workflow cannot be guaranteed to not cause errors.',vcItmName));
             G$_WF_ERROR.RESET_TRIGGER_TRACE;

             FOR iItmErrCount IN 1..G$_WF_Delimited_String.Counter(vcItmErrStack,TRUE,',') LOOP

                 vcItmErrType := G$_WF_Delimited_String.GetString(vcItmErrStack,iItmErrCount,TRUE,',');

                 IF vcItmErrType = 'NO_CANVAS' THEN
                   vcItmErrMsg := G$_NLS.Get('GOQWFLW-0096','LIB',' -> The item %01% is not associated with a canvas.',vcItmName);
                 ELSIF vcItmErrType = 'NOT_KEY_BLOCK' THEN
                   vcItmErrMsg := G$_NLS.Get('GOQWFLW-0097','LIB',' -> The item %01% does not exist on the Key Block.',vcItmName);
                 END IF;

                 IF vcItmErrMsg IS NOT NULL THEN
                   G$_WF_ERROR.SET_TRIGGER_TRACE;
                   G$_WF_LOGGING.DEBUG_MSG(vcItmErrMsg);
                   G$_WF_ERROR.RESET_TRIGGER_TRACE;
                 END IF;

                 vcItmErrType := NULL;
                 vcItmErrMsg  := NULL;

             END LOOP;

           END IF;

         END IF;

         vcItmName     := NULL;
         vcItmNewValue := NULL;
         vcItmErrStack := NULL;
         iItmErrCount  := 0;

     END LOOP;

     IF NOT bCanPopulateAllItms THEN

       G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0098','LIB','One or more items cannot be populated.'),'MESSAGE',TRUE,FALSE);
    
       IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' AND
          G$_WF_LOGGING.FILE_NAME IS NOT NULL THEN
         G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0099','LIB','See %01% for details.',G$_WF_LOGGING.FILE_NAME),'MESSAGE',FALSE,FALSE);
       END IF;

     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0100','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bCanPopulateAllItms;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

      RETURN NULL; 
  END CAN_POPULATE_ALL_ITMS;

-----------------------------
-----------------------------

  FUNCTION NO_KEY_ITM_MAX_LN_EXCEEDED RETURN BOOLEAN IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)    := 'NO_KEY_ITM_MAX_LN_EXCEEDED';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   vcItmNewValue                 VARCHAR2(1938);
   nItmNewValueOverBy            NUMBER;
   bAllItmsCorrectLn             BOOLEAN         := TRUE;
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0101','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName          := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',     iParamRgCurrentRow);
         vcItmNewValue      := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iParamRgCurrentRow);
     
         IF vcItmNewValue IS NOT NULL AND
            vcItmNewValue <> G$_WF_HEADER.NULL_STRING THEN

           nItmNewValueOverBy := EXCEEDS_MAX_LENGTH_BY(vcItmName,vcItmNewValue);

           IF nItmNewValueOverBy > 0 THEN

             bAllItmsCorrectLn := FALSE;

             G$_WF_ERROR.SET_TRIGGER_TRACE;
             G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0102','LIB','*ERROR* The value of %01%,''%02%'', exceeds its maximum length by %03% characters.',vcItmName,vcItmNewValue,vcItmNewValue));
             G$_WF_ERROR.RESET_TRIGGER_TRACE;

           END IF;

         END IF;

         vcItmName          := NULL;
         vcItmNewValue      := NULL;
         nItmNewValueOverBy := NULL;

     END LOOP;

     IF NOT bAllItmsCorrectLn THEN

       G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0103','LIB','One or more item values exceed maximum length.'),'MESSAGE',TRUE,FALSE);
    
       IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' AND
          G$_WF_LOGGING.FILE_NAME IS NOT NULL THEN
         G$_WF_ERROR.DISPLAY_ERROR(G$_NLS.Get('GOQWFLW-0104','LIB','See %01% for details.',G$_WF_LOGGING.FILE_NAME),'MESSAGE',FALSE,FALSE);
       END IF;
    
     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0105','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bAllItmsCorrectLn;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

      RETURN NULL; 
  END NO_KEY_ITM_MAX_LN_EXCEEDED;

-----------------------------
-----------------------------

  FUNCTION NO_KEY_ITMS_ARE_PROTECTED RETURN BOOLEAN IS
   vcCurrSubprog        CONSTANT  VARCHAR2(30) := 'NO_KEY_ITMS_ARE_PROTECTED';
   rgParamRgID                    RECORDGROUP;
   gcParamGcID                    GROUPCOLUMN;
   bNoKeyItmsProtected            BOOLEAN      := TRUE;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0106','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN
     gcParamGcID := FIND_COLUMN(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED');

     IF NOT ID_NULL(gcParamGcID) THEN
       bNoKeyItmsProtected := (G$_WF_RECGRP.FIND_RG_FIRSTROW_FOR_COLVAL(G$_WF_HEADER.PARAM_RG_NAME,'PARAM_INPUT_VAL_IS_PROTECTED','Y',TRUE) = 0);
     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0107','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bNoKeyItmsProtected;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

      RETURN NULL; 
  END NO_KEY_ITMS_ARE_PROTECTED;

-----------------------------
-----------------------------

  FUNCTION NO_KEY_ITMS_ARE_HIGHLIGHTED RETURN BOOLEAN IS
   vcCurrSubprog        CONSTANT  VARCHAR2(30) := 'NO_KEY_ITMS_ARE_HIGHLIGHTED';
   rgParamRgID                    RECORDGROUP;
   gcParamGcID                    GROUPCOLUMN;
   bNoKeyItmsHighlighted          BOOLEAN      := TRUE;

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0108','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN
     gcParamGcID := FIND_COLUMN(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED');

     IF NOT ID_NULL(gcParamGcID) THEN
       bNoKeyItmsHighlighted := (G$_WF_RECGRP.FIND_RG_FIRSTROW_FOR_COLVAL(G$_WF_HEADER.PARAM_RG_NAME,'PARAM_INPUT_VAL_IS_HIGHLIGHTED','Y',TRUE) = 0);
     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0109','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

   RETURN bNoKeyItmsHighlighted;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

      RETURN NULL; 
  END NO_KEY_ITMS_ARE_HIGHLIGHTED;

--*
--* Define private subprogram bodies
--*

  FUNCTION EXCEEDS_MAX_LENGTH_BY(itm_in       VARCHAR2,
                                 itm_value_in VARCHAR2) RETURN PLS_INTEGER IS
   vcItmErrType      VARCHAR2(30);
   vcItmDtype        VARCHAR2(30);
   iLnOfItmValue     PLS_INTEGER := 0;
   iMaxLnOfItmValue  PLS_INTEGER := 0;
   iValueMinusMax    PLS_INTEGER := 0;
   iMaxLnExceededBy  PLS_INTEGER := 0;

  BEGIN
   IF G$_WF_CONDITIONS.IS_ITEM_VALID(itm_in,vcItmErrType) THEN
     IF itm_value_in IS NOT NULL THEN
       vcItmDtype := GET_ITEM_PROPERTY(itm_in,DATATYPE);

       -- If the datatype of the item is Date or Datetime,
       -- skip the evaluation of whether the given value exceeds
       -- the maximum item length.
       --
       -- The values for items of these datatypes are already
       -- specially formatted before they are copied into any item.

       IF vcItmDtype NOT IN ('DATE','DATETIME') THEN
         iLnOfItmValue    := NVL(LENGTH(itm_value_in), 0);
         iMaxLnOfItmValue := GET_ITEM_PROPERTY(itm_in,MAX_LENGTH);
         iValueMinusMax   := iLnOfItmValue - iMaxLnOfItmValue;

         IF iValueMinusMax > 0 THEN
           iMaxLnExceededBy := iValueMinusMax;
         END IF;

       END IF;

     END IF;

   END IF;

   RETURN iMaxLnExceededBy;

  END EXCEEDS_MAX_LENGTH_BY;

END G$_WF_CONTEXT_VALIDATE;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONTEXT_VALIDATE");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param displayErrIn
		*/
		public NBool canLocateParams(NBool displayErrIn)
		{


			final NString VCCURRSUBPROG = toStr("CAN_LOCATE_PARAMS");
			ValueSet rgparamrgid= null;
			NBool bcanlocateparams = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0085"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( (rgparamrgid == null) )
				{
					bcanlocateparams = toBool(NBool.False);
					if ( displayErrIn.equals(NBool.True) )
					{
						
						getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0086"), toStr("LIB"), toStr("No activity parameters could be identified.")), toStr("MESSAGE"), getContainer().getGWfConditions().isWfActivity(), toBool(NBool.False));						
						
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0087"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return bcanlocateparams;
			}
			catch(Exception  e)
			{
				
				getContainer().getGWfError().showException(toStr(isNull(e.getMessage(), errorMessage())), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
							
				return NBool.getNull();
			}
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool allParamNamesAreValidItms()
		{

			final NString VCCURRSUBPROG = toStr("ALL_PARAM_NAMES_ARE_VALID_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmerrtype= NString.getNull();
			NString vcitmerrmsg= NString.getNull();
			NBool ballitmsarevalid = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0088"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						Ref<NString> errTypeOut_ref = new Ref<NString>();
						if ( getContainer().getGWfConditions().isItemValid(vcitmname, errTypeOut_ref).not() )
						{
							vcitmerrtype = errTypeOut_ref.getValue();
							ballitmsarevalid = toBool(NBool.False);
							if ( vcitmerrtype.equals("BLOCK_NOT_GIVEN") )
							{
								vcitmerrmsg = toStr("*ERROR* The parameter ").append(vcitmname).append(" must be provided in <block>.<item> format.");
							}
							else if ( vcitmerrtype.equals("ITEM_NOT_FOUND") ) {
								vcitmerrmsg = toStr("*ERROR* The parameter ").append(vcitmname).append(" is not a valid item.");
							}
							else if ( vcitmerrtype.equals("INVALID_TYPE") ) {
								vcitmerrmsg = toStr("*ERROR* The parameter ").append(vcitmname).append(" is an item of an invalid type.");
							}
							if ( !vcitmerrmsg.isNull() )
							{
								getContainer().getGWfError().setTriggerTrace();
								getContainer().getGWfLogging().debugMsg(vcitmerrmsg);
								getContainer().getGWfError().resetTriggerTrace();
							}
						}
						vcitmname = toStr(null);
						vcitmerrtype = toStr(null);
						vcitmerrmsg = toStr(null);
					}
					if ( ballitmsarevalid.not() )
					{
						getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0089"), toStr("LIB"), toStr("One or more parameters are invalid form items.")), toStr("MESSAGE"), toBool(NBool.True), toBool(NBool.False));
						
						if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") && !getContainer().getGWfLogging().fileName.isNull() )
						{
							getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0090"), toStr("LIB"), toStr("See %01% for details."), getContainer().getGWfLogging().fileName), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0091"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return ballitmsarevalid;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}

		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool noParamsHaveInputVals()
		{

			final NString VCCURRSUBPROG = toStr("NO_PARAMS_HAVE_INPUT_VALS");
			ValueSet rgparamrgid= null;
			int iparamcount = 0;
			ValueSetColumn gcparamgcid= null;
			NInteger inullparamvaluecount = toInt(0);
			NBool ballinputnull = toBool(NBool.False);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0092"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamcount = getGroupRowCount(rgparamrgid);
					gcparamgcid = findColumn(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"));
					if ( !(gcparamgcid == null) )
					{
						inullparamvaluecount = getContainer().getGWfRecgrp().findRgRowcountForColval(GWfHeader.PARAM_RG_NAME, toStr("PARAM_INPUT_VAL"), toStr(null));
						if ( inullparamvaluecount.equals(iparamcount) )
						{
							ballinputnull = toBool(NBool.True);
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0093"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return ballinputnull;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool canPopulateAllItms()
		{

			final NString VCCURRSUBPROG = toStr("CAN_POPULATE_ALL_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmnewvalue= NString.getNull();
			NString vcitmerrstack= NString.getNull();
			NString vcitmerrtype= NString.getNull();
			int iitmerrcount = 0;
			NString vcitmerrmsg= NString.getNull();
			NBool bcanpopulateallitms = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0094"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						vcitmnewvalue = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), iparamrgcurrentrow);
						if ( !vcitmnewvalue.isNull() )
						{
							Ref<NString> errTypeOut_ref = new Ref<NString>();
							if ( getContainer().getGWfConditions().canPopulateItem(vcitmname, toStr("EVER"), errTypeOut_ref).not() )
							{
								bcanpopulateallitms = toBool(NBool.False);
								getContainer().getGWfError().setTriggerTrace();
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0095"), toStr("LIB"), toStr("*ERROR* %01% cannot be populated, as the population of this item with a value from Workflow cannot be guaranteed to not cause errors."), vcitmname));
								getContainer().getGWfError().resetTriggerTrace();
								NInteger counter = getContainer().getGWfDelimitedString().counter(vcitmerrstack, toBool(NBool.True), toStr(","));
								if ( !counter.isNull() ) {
									for ( iitmerrcount = 1; iitmerrcount <= counter.getValue(); iitmerrcount+= 1 )
									{
										vcitmerrtype = getContainer().getGWfDelimitedString().getstring(vcitmerrstack, toInt(iitmerrcount), toBool(NBool.True), toStr(","));
										if ( vcitmerrtype.equals("NO_CANVAS") )
										{
											vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0096"), toStr("LIB"), toStr(" -> The item %01% is not associated with a canvas."), vcitmname);
										}
										else if ( vcitmerrtype.equals("NOT_KEY_BLOCK") ) {
											vcitmerrmsg = GNls.Fget(toStr("GOQWFLW-0097"), toStr("LIB"), toStr(" -> The item %01% does not exist on the Key Block."), vcitmname);
										}
										if ( !vcitmerrmsg.isNull() )
										{
											getContainer().getGWfError().setTriggerTrace();
											getContainer().getGWfLogging().debugMsg(vcitmerrmsg);
											getContainer().getGWfError().resetTriggerTrace();
										}
										vcitmerrtype = toStr(null);
										vcitmerrmsg = toStr(null);
									}
								}
							}
						}
						vcitmname = toStr(null);
						vcitmnewvalue = toStr(null);
						vcitmerrstack = toStr(null);
						iitmerrcount = 0;
					}
					if ( bcanpopulateallitms.not() )
					{
						getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0098"), toStr("LIB"), toStr("One or more items cannot be populated.")), toStr("MESSAGE"), toBool(NBool.True), toBool(NBool.False));
						
						if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") && !getContainer().getGWfLogging().fileName.isNull() )
						{
							getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0099"), toStr("LIB"), toStr("See %01% for details."), getContainer().getGWfLogging().fileName), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));//							
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0100"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return bcanpopulateallitms;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool noKeyItmMaxLnExceeded()
		{
			final NString VCCURRSUBPROG = toStr("NO_KEY_ITM_MAX_LN_EXCEEDED");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmnewvalue= NString.getNull();
			NNumber nitmnewvalueoverby= NNumber.getNull();
			NBool ballitmscorrectln = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0101"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow += 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						vcitmnewvalue = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL"), iparamrgcurrentrow);
						if ( !vcitmnewvalue.isNull() && vcitmnewvalue.notEquals(GWfHeader.NULL_STRING) )
						{
							nitmnewvalueoverby = toNumber(exceedsMaxLengthBy(vcitmname, vcitmnewvalue));
							if ( nitmnewvalueoverby.greater(0) )
							{
								ballitmscorrectln = toBool(NBool.False);
								getContainer().getGWfError().setTriggerTrace();
								getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0102"), toStr("LIB"), toStr("*ERROR* The value of %01%,'%02%', exceeds its maximum length by %03% characters."), vcitmname, vcitmnewvalue, vcitmnewvalue));
								getContainer().getGWfError().resetTriggerTrace();
							}
						}
						vcitmname = toStr(null);
						vcitmnewvalue = toStr(null);
						nitmnewvalueoverby = toNumber(null);
					}
					if ( ballitmscorrectln.not() )
					{
						getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0103"), toStr("LIB"), toStr("One or more item values exceed maximum length.")), toStr("MESSAGE"), toBool(NBool.True), toBool(NBool.False));
						
						if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") && !getContainer().getGWfLogging().fileName.isNull() )
						{
							getContainer().getGWfError().displayError(GNls.Fget(toStr("GOQWFLW-0104"), toStr("LIB"), toStr("See %01% for details."), getContainer().getGWfLogging().fileName), toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0105"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return ballitmscorrectln;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool noKeyItmsAreProtected()
		{

			final NString VCCURRSUBPROG = toStr("NO_KEY_ITMS_ARE_PROTECTED");
			ValueSet rgparamrgid= null;
			ValueSetColumn gcparamgcid= null;
			NBool bnokeyitmsprotected = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0106"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					gcparamgcid = findColumn(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"));
					if ( !(gcparamgcid == null) )
					{
						bnokeyitmsprotected = toBool( ((getContainer().getGWfRecgrp().findRgFirstrowForColval(GWfHeader.PARAM_RG_NAME, toStr("PARAM_INPUT_VAL_IS_PROTECTED"), toStr("Y"), toBool(NBool.True)) == 0)) );
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0107"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return bnokeyitmsprotected;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool noKeyItmsAreHighlighted()
		{

			final NString VCCURRSUBPROG = toStr("NO_KEY_ITMS_ARE_HIGHLIGHTED");
			ValueSet rgparamrgid= null;
			ValueSetColumn gcparamgcid= null;
			NBool bnokeyitmshighlighted = toBool(NBool.True);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0108"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					gcparamgcid = findColumn(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"));
					if ( !(gcparamgcid == null) )
					{
						bnokeyitmshighlighted = toBool(((getContainer().getGWfRecgrp().findRgFirstrowForColval(GWfHeader.PARAM_RG_NAME, toStr("PARAM_INPUT_VAL_IS_HIGHLIGHTED"), toStr("Y"), toBool(NBool.True)) == 0)));
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0109"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return bnokeyitmshighlighted;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NBool.getNull();
			}

		}
/* <p>
		* *
		* * Define private subprogram bodies
		* *
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itmIn
		* @param itmValueIn
		*/
		public NInteger exceedsMaxLengthBy(NString itmIn, NString itmValueIn)
		{

			NString vcitmerrtype= NString.getNull();
			NString vcitmdtype= NString.getNull();
			NInteger ilnofitmvalue = toInt(0);
			NInteger imaxlnofitmvalue = toInt(0);
			NInteger ivalueminusmax = toInt(0);
			NInteger imaxlnexceededby = toInt(0);
			Ref<NString> errTypeOut_ref = new Ref<NString>();
			if ( getContainer().getGWfConditions().isItemValid(itmIn, errTypeOut_ref).getValue() )
			{
				vcitmerrtype = errTypeOut_ref.getValue();
				if ( !itmValueIn.isNull() )
				{
					vcitmdtype = getItemDataType(itmIn);
					//  If the datatype of the item is Date or Datetime,
					//  skip the evaluation of whether the given value exceeds
					//  the maximum item length.
					// 
					//  The values for items of these datatypes are already
					//  specially formatted before they are copied into any item.
					if ( !in(vcitmdtype, "DATE", "DATETIME").getValue() )
					{
						ilnofitmvalue = isNull(length(itmValueIn), 0);					
						imaxlnofitmvalue = ItemServices.getItemMaxLength(itmIn);
						
						ivalueminusmax = ilnofitmvalue.subtract(imaxlnofitmvalue);
						if ( ivalueminusmax.greater(0) )
						{
							imaxlnexceededby = ivalueminusmax;
						}
					}
				}
			}
			return imaxlnexceededby;

		}
		
	
	
}
