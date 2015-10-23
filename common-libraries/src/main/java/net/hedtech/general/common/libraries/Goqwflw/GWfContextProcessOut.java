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

public class GWfContextProcessOut extends AbstractSupportCodeObject {
	

	public GWfContextProcessOut(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONTEXT_PROCESS_OUT
	/*
	PACKAGE G$_WF_CONTEXT_PROCESS_OUT IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONTEXT_PROCESS_OUT provides the interfaces
  needed to extract action parameter names and (potentially
  updated) values from Banner, and to communicate any updated
  action parameter values to Workflow.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function EXTRACT_OUT_PARAMS returns the names and
  appropriately reformatted values of all action parameters
  that are associated with the current form or process that
  is the workflow activity in progress.  The names and values
  are returned as a delimited string of the following format:
  <name_1>="<value_1>",<name_2>="<value_2>",...<name_n>="<value_n>"
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  EXTRACT_OUT_PARAMS                                RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  The procedure RETURN_CONTEXT returns to Workflow the action
  parameter values for a workflow activity given its associated
  workflow activity ID and a delimited string of action parameter
  names and values in the following format:
  <name_1>="<value_1>",<name_2>="<value_2>",...<name_n>="<value_n>"
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RETURN_CONTEXT        (work_id_in       VARCHAR2,
                                  Param_String_in  VARCHAR2);

END G$_WF_CONTEXT_PROCESS_OUT;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONTEXT_PROCESS_OUT
		/*
		PACKAGE BODY G$_WF_CONTEXT_PROCESS_OUT IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONTEXT_PROCESS_OUT';

--*
--* Define public subprogram bodies
--*

  FUNCTION EXTRACT_OUT_PARAMS RETURN VARCHAR2 IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30) := 'EXTRACT_OUT_PARAMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   vcItmErrType                  VARCHAR2(30);
   vcItmCurrValue                VARCHAR2(1938);
   vcItmDtype                    VARCHAR2(30);
   dItmCurrValue                 DATE;
   vcParamName		               VARCHAR2(61);
   vcParamOutValue               VARCHAR2(1938);
   vcParamPair		               VARCHAR2(2000);
   vcParamString                 VARCHAR2(2000);
 
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0069','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));
 
   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);
 
   IF NOT ID_NULL(rgParamRgID) THEN
 
     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
   
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',iParamRgCurrentRow);

         IF G$_WF_CONDITIONS.IS_ITEM_VALID(vcItmName,vcItmErrType) THEN 
           vcItmCurrValue := NAME_IN(vcItmName);
           vcItmDtype     := GET_ITEM_PROPERTY(vcItmName,DATATYPE);

           IF vcItmDType = 'DATETIME' THEN
             dItmCurrValue   := TO_DATE(vcItmCurrValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT);
             vcParamOutValue := TO_CHAR(dItmCurrValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT);

           ELSIF vcItmDType = 'DATE' THEN
             dItmCurrValue   := TO_DATE(vcItmCurrValue,G$_WF_HEADER.DATE_FORMAT_DEFAULT);
             vcParamOutValue := TO_CHAR(dItmCurrValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT);

           ELSE
             vcParamOutValue := vcItmCurrValue;

           END IF;

           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_OUTPUT_VAL',iParamRgCurrentRow,vcParamOutValue);
 
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0070','LIB','--------------------------------'));
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0071','LIB','vcItmName      = %01%', vcItmName ));
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0072','LIB','vcItmDtype     = %01%', vcItmDtype ));
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0073','LIB','vcItmCurrValue = %01%', vcItmCurrValue ));
           G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0074','LIB','dItmCurrValue  = %01%', TO_CHAR(dItmCurrValue,G$_WF_HEADER.DATETIME_FORMAT_DEFAULT) ));

           vcItmCurrValue  := NULL;
           vcItmDtype      := NULL;
           dItmCurrValue   := NULL;
 
         END IF;

         vcParamName := vcItmName;
         vcItmName   := NULL;

         vcParamPair     := vcParamName || '="' || vcParamOutValue;

         vcParamString   := G$_WF_Delimited_String.BuildString(vcParamPair,vcParamString,iParamRgCurrentRow,iParamRgRowCount,TRUE);
 
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0075','LIB','--------------------------------'));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0076','LIB','vcParamName      = %01%', vcParamName ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0077','LIB','vcParamOutValue  = %01%', vcParamOutValue ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0078','LIB','vcParamPair      = %01%', vcParamPair ));
         G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0079','LIB','vcParamString    = %01%', vcParamString ));
 
         vcParamName     := NULL;
         vcParamOutValue := NULL;
         vcParamPair     := NULL;

     END LOOP;
 
     IF vcParamString IS NOT NULL THEN
       vcParamString := vcParamString || '"';
       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0080','LIB','********************************'));
       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0081','LIB','Complete vcParamString  = %01%', vcParamString  ));
     END IF;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0082','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));
 
   RETURN vcParamString;

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

      RETURN NULL; 
  END EXTRACT_OUT_PARAMS;

---------------------
---------------------

  PROCEDURE RETURN_CONTEXT(work_id_in       VARCHAR2,
                           Param_String_in  VARCHAR2) IS
   vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RETURN_CONTEXT';

  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0083','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   G$_WF_BA.SET_WORK_PARAMETERS(work_id_in,Param_String_in);

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0084','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END RETURN_CONTEXT;

END G$_WF_CONTEXT_PROCESS_OUT;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONTEXT_PROCESS_OUT");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
/* </p>
		*/
		public NString extractOutParams()
		{

			final NString VCCURRSUBPROG = toStr("EXTRACT_OUT_PARAMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmerrtype= NString.getNull();
			NString vcitmcurrvalue= NString.getNull();
			NString vcitmdtype= NString.getNull();
			NDate ditmcurrvalue= NDate.getNull();
			NString vcparamname= NString.getNull();
			NString vcparamoutvalue= NString.getNull();
			NString vcparampair= NString.getNull();
			NString vcparamstring= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0069"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						Ref<NString> errTypeOut_ref = new Ref<NString>();
						if ( getContainer().getGWfConditions().isItemValid(vcitmname, errTypeOut_ref ).getValue() )
						{
							vcitmcurrvalue = getNameIn(vcitmname);
							vcitmdtype = getItemDataType(vcitmname);
							if ( vcitmdtype.equals("DATETIME") )
							{
								ditmcurrvalue = toDate(vcitmcurrvalue, GWfHeader.DATETIME_FORMAT_DEFAULT);
								vcparamoutvalue = toChar(ditmcurrvalue, GWfHeader.DATETIME_FORMAT_DEFAULT);
							}
							else if ( vcitmdtype.equals("DATE") ) {
								ditmcurrvalue = toDate(vcitmcurrvalue, GWfHeader.DATE_FORMAT_DEFAULT);
								vcparamoutvalue = toChar(ditmcurrvalue, GWfHeader.DATETIME_FORMAT_DEFAULT);
							}
							else {
								vcparamoutvalue = vcitmcurrvalue;
							}
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_OUTPUT_VAL"), toInt(iparamrgcurrentrow), vcparamoutvalue);
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0070"), toStr("LIB"), toStr("--------------------------------")));
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0071"), toStr("LIB"), toStr("vcItmName      = %01%"), vcitmname));
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0072"), toStr("LIB"), toStr("vcItmDtype     = %01%"), vcitmdtype));
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0073"), toStr("LIB"), toStr("vcItmCurrValue = %01%"), vcitmcurrvalue));
							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0074"), toStr("LIB"), toStr("dItmCurrValue  = %01%"), toChar(ditmcurrvalue, GWfHeader.DATETIME_FORMAT_DEFAULT)));
							vcitmcurrvalue = toStr(null);
							vcitmdtype = toStr(null);
							ditmcurrvalue = toDate(null);
						}
						vcparamname = vcitmname;
						vcitmname = toStr(null);
						vcparampair = vcparamname.append("=\"").append(vcparamoutvalue);
						vcparamstring = getContainer().getGWfDelimitedString().buildstring(vcparampair, vcparamstring, toInt(iparamrgcurrentrow), toInt(iparamrgrowcount), toBool(NBool.True));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0075"), toStr("LIB"), toStr("--------------------------------")));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0076"), toStr("LIB"), toStr("vcParamName      = %01%"), vcparamname));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0077"), toStr("LIB"), toStr("vcParamOutValue  = %01%"), vcparamoutvalue));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0078"), toStr("LIB"), toStr("vcParamPair      = %01%"), vcparampair));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0079"), toStr("LIB"), toStr("vcParamString    = %01%"), vcparamstring));
						vcparamname = toStr(null);
						vcparamoutvalue = toStr(null);
						vcparampair = toStr(null);
					}
					if ( !vcparamstring.isNull() )
					{
						vcparamstring = vcparamstring.append("\"");
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0080"), toStr("LIB"), toStr("********************************")));
						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0081"), toStr("LIB"), toStr("Complete vcParamString  = %01%"), vcparamstring));
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0082"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return vcparamstring;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
			
			return NString.getNull();
		}

		}
/* <p>
		* -------------------
		* -------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workIdIn
		* @param paramStringIn
		*/
		public void returnContext(NString workIdIn, NString paramStringIn)
		{

			final NString VCCURRSUBPROG = toStr("RETURN_CONTEXT");
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0083"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				getContainer().getGWfBa().setWorkParameters(workIdIn, paramStringIn);
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0084"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.True), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}
			
		}
		
	
	
}
