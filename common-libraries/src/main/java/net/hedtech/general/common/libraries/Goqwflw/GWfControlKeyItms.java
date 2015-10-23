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

public class GWfControlKeyItms extends AbstractSupportCodeObject {
	

	public GWfControlKeyItms(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_CONTROL_KEY_ITMS
	/*
	PACKAGE G$_WF_CONTROL_KEY_ITMS IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_CONTROL_KEY_ITMS provides the interfaces
  needed to control the behavior and appearance of a form's
  Key Block items that are populated with input action parameter
  values from Workflow.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure PROTECT_KEY_ITMS protects from insert or update
  those Key Block items that have been populated with action
  parameter values.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE PROTECT_KEY_ITMS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure UNPROTECT_KEY_ITMS unprotects from insert or
  update any Key Block items that were previously protected
  by PROTECT_KEY_ITMS.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE UNPROTECT_KEY_ITMS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure HIGHLIGHT_KEY_ITMS stores off the name of the
  visual attribute that is currently applied, if any, to every
  Key Block item that has been populated with an action parameter
  value, and highlights each item using a named visual attribute
  that should be available via reference from within every form.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE HIGHLIGHT_KEY_ITMS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure UNHIGHLIGHT_KEY_ITMS removes the highlight from
  all Key Block items that were previously highlighted via
  HIGHLIGHT_KEY_ITMS by either re-applying to an item its original
  named visual attribute (should one exist), or by restoring the
  item to its Default attributes via the application of a NULL
  visual attribute.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE UNHIGHLIGHT_KEY_ITMS;

END G$_WF_CONTROL_KEY_ITMS;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_CONTROL_KEY_ITMS
		/*
		PACKAGE BODY G$_WF_CONTROL_KEY_ITMS IS

--*
--* Declare private variables
--*

  vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_CONTROL_KEY_ITMS';

--*
--* Declare private subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure PROTECT_ITM turns the INSERT_ALLOWED property
  on a given item to FALSE if it is currently TRUE.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE PROTECT_ITM                  (itm_in                VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\
  The procedure UNPROTECT_ITM turns the INSERT_ALLOWED property
  on a given item to TRUE if it is currently FALSE.
\*--------------------------------------------------------------</multilinecomment>

  PROCEDURE UNPROTECT_ITM                (itm_in                VARCHAR2);

--*
--* Define public subprogram bodies
--*

  PROCEDURE PROTECT_KEY_ITMS IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)   := 'PROTECT_KEY_ITMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   vcItmNewValue                 VARCHAR2(1938);
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0171','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName     := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',     iParamRgCurrentRow);
         vcItmNewValue := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iParamRgCurrentRow);

         IF vcItmNewValue IS NOT NULL THEN
           PROTECT_ITM(vcItmName);
           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED',iParamRgCurrentRow,'Y');
         END IF;

         vcItmName     := NULL;
         vcItmNewValue := NULL;

     END LOOP;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0172','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END PROTECT_KEY_ITMS;

-----------------------------
-----------------------------

  PROCEDURE UNPROTECT_KEY_ITMS IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)  := 'UNPROTECT_KEY_ITMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   bItmIsProtected               BOOLEAN       := FALSE;
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0173','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName       := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',iParamRgCurrentRow);
         bItmIsProtected := (NVL(GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED',iParamRgCurrentRow),'N') = 'Y');

         IF bItmIsProtected THEN
           UNPROTECT_ITM(vcItmName);
           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_PROTECTED',iParamRgCurrentRow,'N');
         END IF;

         vcItmName       := NULL;
         bItmIsProtected := FALSE;

     END LOOP;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0174','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

  END UNPROTECT_KEY_ITMS;

-----------------------------
-----------------------------

  PROCEDURE HIGHLIGHT_KEY_ITMS IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)   := 'HIGHLIGHT_KEY_ITMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   vcItmNewValue                 VARCHAR2(1938);
   vcItmVisAttrib                VARCHAR2(2000);
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0175','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName      := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',     iParamRgCurrentRow);
         vcItmNewValue  := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL',iParamRgCurrentRow);

         IF vcItmNewValue IS NOT NULL THEN

           vcItmVisAttrib := GET_ITEM_PROPERTY(vcItmName,VISUAL_ATTRIBUTE);

           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_VIS_ATTRIB',    iParamRgCurrentRow,vcItmVisAttrib);

           SET_ITEM_PROPERTY(vcItmName,VISUAL_ATTRIBUTE,G$_WF_HEADER.CONTEXT_HIGHLIGHT_VIS_ATTRIB);

           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED',iParamRgCurrentRow,'Y');
         
         END IF;

         vcItmName      := NULL;
         vcItmNewValue  := NULL;
         vcItmVisAttrib := NULL;

     END LOOP;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0176','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END HIGHLIGHT_KEY_ITMS;

-----------------------------
-----------------------------

  PROCEDURE UNHIGHLIGHT_KEY_ITMS IS
   vcCurrSubprog       CONSTANT  VARCHAR2(30)   := 'UNHIGHLIGHT_KEY_ITMS';
   rgParamRgID                   RECORDGROUP;
   iParamRgRowCount              PLS_INTEGER;
   iParamRgCurrentRow            PLS_INTEGER;
   vcItmName                     VARCHAR2(61);
   bItmIsHighlighted             BOOLEAN        := FALSE;
   vcItmVisAttrib                VARCHAR2(2000);
  
  BEGIN
   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0177','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

   rgParamRgID := FIND_GROUP(G$_WF_HEADER.PARAM_RG_NAME);

   IF NOT ID_NULL(rgParamRgID) THEN

     iParamRgRowCount := GET_GROUP_ROW_COUNT(rgParamRgID);
  
     FOR iParamRgCurrentRow IN 1..iParamRgRowCount LOOP
         vcItmName         := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_NAME',iParamRgCurrentRow);
         bItmIsHighlighted := (NVL(GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED',iParamRgCurrentRow),'N') = 'Y');

         IF bItmIsHighlighted THEN

           vcItmVisAttrib := GET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_VIS_ATTRIB',iParamRgCurrentRow);

           IF vcItmVisAttrib IN ('DEFAULT','CUSTOM') THEN
             vcItmVisAttrib := NULL;
           END IF;

           SET_ITEM_PROPERTY(vcItmName,VISUAL_ATTRIBUTE,vcItmVisAttrib);

           SET_GROUP_CHAR_CELL(G$_WF_HEADER.PARAM_RG_NAME || '.PARAM_INPUT_VAL_IS_HIGHLIGHTED',iParamRgCurrentRow,'N');

         END IF;

         vcItmName         := NULL;
         bItmIsHighlighted := FALSE;
         vcItmVisAttrib    := NULL;

     END LOOP;

   END IF;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0178','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  EXCEPTION
    WHEN OTHERS THEN
      G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,TRUE,FALSE);

  END UNHIGHLIGHT_KEY_ITMS;

--*
--* Define private subprogram bodies
--*

  PROCEDURE PROTECT_ITM(itm_in VARCHAR2) IS
   vcItmErrType  VARCHAR2(30);
  BEGIN
   IF G$_WF_CONDITIONS.IS_ITEM_VALID(itm_in,vcItmErrType) THEN

     IF GET_ITEM_PROPERTY(itm_in,INSERT_ALLOWED) = 'TRUE' THEN
       SET_ITEM_PROPERTY(itm_in,INSERT_ALLOWED,PROPERTY_FALSE);
     END IF;

   END IF;

  END PROTECT_ITM;

-----------------------------
-----------------------------

  PROCEDURE UNPROTECT_ITM(itm_in VARCHAR2) IS
   vcItmErrType  VARCHAR2(30);

  BEGIN
   IF G$_WF_CONDITIONS.IS_ITEM_VALID(itm_in,vcItmErrType) THEN

     IF GET_ITEM_PROPERTY(itm_in,INSERT_ALLOWED) = 'FALSE' THEN
       SET_ITEM_PROPERTY(itm_in,INSERT_ALLOWED,PROPERTY_TRUE);
     END IF;

   END IF;

  END UNPROTECT_ITM;

END G$_WF_CONTROL_KEY_ITMS;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_CONTROL_KEY_ITMS");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void protectKeyItms()
		{

			final NString VCCURRSUBPROG = toStr("PROTECT_KEY_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmnewvalue= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0171"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
							protectItm(vcitmname);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"), toInt(iparamrgcurrentrow), toStr("Y"));
						}
						vcitmname = toStr(null);
						vcitmnewvalue = toStr(null);
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0172"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void unprotectKeyItms()
		{

			final NString VCCURRSUBPROG = toStr("UNPROTECT_KEY_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NBool bitmisprotected = toBool(NBool.False);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0173"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						bitmisprotected = toBool(((isNull(getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"), iparamrgcurrentrow), "N").equals("Y"))));
						if ( bitmisprotected.getValue() )
						{
							unprotectItm(vcitmname);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_PROTECTED"), toInt(iparamrgcurrentrow), toStr("N"));
						}
						vcitmname = toStr(null);
						bitmisprotected = toBool(NBool.False);
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0174"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}

			this.getLogger().trace(this, "F2J : unprotectKeyItms procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void highlightKeyItms()
		{

			final NString VCCURRSUBPROG = toStr("HIGHLIGHT_KEY_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NString vcitmnewvalue= NString.getNull();
			NString vcitmvisattrib= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0175"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
							vcitmvisattrib = getItemStyleClass(vcitmname);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_VIS_ATTRIB"), toInt(iparamrgcurrentrow), vcitmvisattrib);
							setItemStyleClass(vcitmname, GWfHeader.CONTEXT_HIGHLIGHT_VIS_ATTRIB);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"), toInt(iparamrgcurrentrow), toStr("Y"));
						}
						vcitmname = toStr(null);
						vcitmnewvalue = toStr(null);
						vcitmvisattrib = toStr(null);
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0176"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
		* ---------------------------
		* ---------------------------
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void unhighlightKeyItms()
		{

			final NString VCCURRSUBPROG = toStr("UNHIGHLIGHT_KEY_ITMS");
			ValueSet rgparamrgid= null;
			int iparamrgrowcount;
			int iparamrgcurrentrow;
			NString vcitmname= NString.getNull();
			NBool bitmishighlighted = toBool(NBool.False);
			NString vcitmvisattrib= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0177"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				rgparamrgid = findGroup(GWfHeader.PARAM_RG_NAME);
				if ( !(rgparamrgid == null) )
				{
					iparamrgrowcount = getGroupRowCount(rgparamrgid);
					for ( iparamrgcurrentrow = 1; iparamrgcurrentrow <= iparamrgrowcount; iparamrgcurrentrow+= 1 )
					{
						vcitmname = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_NAME"), iparamrgcurrentrow);
						bitmishighlighted = toBool(((isNull(getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"), iparamrgcurrentrow), "N").equals("Y"))));
						if ( bitmishighlighted.getValue() )
						{
							vcitmvisattrib = getGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_VIS_ATTRIB"), iparamrgcurrentrow);
							if ( in(vcitmvisattrib, "DEFAULT", "CUSTOM").getValue() )
							{
								vcitmvisattrib = toStr(null);
							}
							setItemStyleClass(vcitmname, vcitmvisattrib);
							setGroupCharCell(GWfHeader.PARAM_RG_NAME.append(".PARAM_INPUT_VAL_IS_HIGHLIGHTED"), toInt(iparamrgcurrentrow), toStr("N"));
						}
						vcitmname = toStr(null);
						bitmishighlighted = toBool(NBool.False);
						vcitmvisattrib = toStr(null);
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0178"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
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
		* *
		* * Define private subprogram bodies
		* *
/* </p>
		* @param itmIn
		*/
		public void protectItm(NString itmIn)
		{

			NString vcitmerrtype= NString.getNull();
			Ref<NString> errTypeOut_ref = new Ref<NString>();
			if ( getContainer().getGWfConditions().isItemValid(itmIn, errTypeOut_ref).getValue() )
			{
				if ( getItemInsertAllowed(itmIn).equals("TRUE") )
				{
					setItemInsertAllowed(itmIn, false);
				}
			}

			
		}
/* <p>
		* ---------------------------
		* ---------------------------
/* </p>
		* @param itmIn
		*/
		public void unprotectItm(NString itmIn)
		{
			
			NString vcitmerrtype= NString.getNull();
			Ref<NString> errTypeOut_ref = new Ref<NString>();
			if ( getContainer().getGWfConditions().isItemValid(itmIn, errTypeOut_ref ).getValue() )
			{
				if ( getItemInsertAllowed(itmIn).equals("FALSE") )
				{
					setItemInsertAllowed(itmIn, true);
				}
			}
		}
		
	
	
}
