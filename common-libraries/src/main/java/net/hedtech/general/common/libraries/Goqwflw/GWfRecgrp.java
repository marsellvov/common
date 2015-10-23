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

public class GWfRecgrp extends AbstractSupportCodeObject {
	

	public GWfRecgrp(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_RECGRP
	/*
	PACKAGE G$_WF_RECGRP IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_RECGRP provides the interfaces needed to
  readily retrieve information from record groups.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function FIND_RG_FIRSTROW_FOR_COLVAL returns the number
  of the first row in a given record group for which a given
  column contains a given value, and provides a means by
  which to indicate whether the case of the column value
  should be ignored in the evaluation.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  FIND_RG_FIRSTROW_FOR_COLVAL  (rg_name_in     VARCHAR2,
                                         gc_name_in     VARCHAR2,
                                         gc_value_in    VARCHAR2,
                                         ignorecase_in  BOOLEAN   DEFAULT FALSE) RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function FIND_RG_ROWCOUNT_FOR_COLVAL returns the number
  of rows in a given record group for which a given column
  contains a given value, and provides a means by which to
  indicate whether the case of the column value should be
  ignored in the evaluation.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  FIND_RG_ROWCOUNT_FOR_COLVAL  (rg_name_in     VARCHAR2,
                                         gc_name_in     VARCHAR2,
                                         gc_value_in    VARCHAR2,
                                         ignorecase_in  BOOLEAN   DEFAULT FALSE) RETURN PLS_INTEGER;

END G$_WF_RECGRP;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_RECGRP
		/*
		PACKAGE BODY G$_WF_RECGRP IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_RECGRP';

--*
--* Define public subprogram bodies
--*

 FUNCTION FIND_RG_FIRSTROW_FOR_COLVAL(rg_name_in     VARCHAR2,
                                      gc_name_in     VARCHAR2,
                                      gc_value_in    VARCHAR2,
                                      ignorecase_in  BOOLEAN   DEFAULT FALSE)
 RETURN PLS_INTEGER IS
  vcCurrSubprog      CONSTANT  VARCHAR2(30)   := 'FIND_RG_FIRSTROW_FOR_COLVAL';
  rg_id                        RECORDGROUP;
  gc_id                        GROUPCOLUMN;
  row_count                    PLS_INTEGER;
  curr_row                     PLS_INTEGER;
  curr_colval                  VARCHAR2(2000);
  first_match_row              PLS_INTEGER    := 0;
  exit_function                EXCEPTION;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0240','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF rg_name_in IS NOT NULL THEN
    rg_id := FIND_GROUP(rg_name_in);

    IF gc_name_in IS NOT NULL THEN
      gc_id := FIND_COLUMN(rg_name_in||'.'||gc_name_in);

      IF NOT ID_NULL(rg_id) AND
         NOT ID_NULL(gc_id) THEN
        row_count := GET_GROUP_ROW_COUNT(rg_id);

        FOR curr_row IN 1..row_count LOOP
            curr_colval := GET_GROUP_CHAR_CELL(gc_id,curr_row);

            IF curr_colval IS NOT NULL AND
               gc_value_in IS NOT NULL THEN

              IF ignorecase_in THEN

                IF UPPER(curr_colval) = UPPER(gc_value_in) THEN
                  first_match_row := curr_row;
                  RAISE exit_function;
                END IF;

              ELSIF curr_colval = gc_value_in THEN
                first_match_row := curr_row;
                RAISE exit_function;
              END IF;

            ELSIF curr_colval IS NULL AND
                  gc_value_in IS NULL THEN
              first_match_row := curr_row;
              RAISE exit_function;
            END IF;

        END LOOP;

      END IF;
    END IF;
  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0241','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RAISE exit_function;

 EXCEPTION
   WHEN exit_function THEN
     RETURN first_match_row;

   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
     RETURN 0;

 END FIND_RG_FIRSTROW_FOR_COLVAL;

-----------------------------
-----------------------------

 FUNCTION FIND_RG_ROWCOUNT_FOR_COLVAL(rg_name_in     VARCHAR2,
                                      gc_name_in     VARCHAR2,
                                      gc_value_in    VARCHAR2,
                                      ignorecase_in  BOOLEAN   DEFAULT FALSE)
 RETURN PLS_INTEGER IS
  vcCurrSubprog      CONSTANT  VARCHAR2(30)   := 'FIND_RG_ROWCOUNT_FOR_COLVAL';
  rg_id                        RECORDGROUP;
  gc_id                        GROUPCOLUMN;
  row_count                    PLS_INTEGER;
  curr_row                     PLS_INTEGER;
  curr_colval                  VARCHAR2(2000);
  rowcount_match               PLS_INTEGER    := 0;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0242','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF rg_name_in IS NOT NULL THEN
    rg_id := FIND_GROUP(rg_name_in);

    IF gc_name_in IS NOT NULL THEN
      gc_id := FIND_COLUMN(rg_name_in || '.' || gc_name_in);

      IF NOT ID_NULL(rg_id) AND
         NOT ID_NULL(gc_id) THEN
        row_count := GET_GROUP_ROW_COUNT(rg_id);

        FOR curr_row IN 1..row_count LOOP
            curr_colval := GET_GROUP_CHAR_CELL(gc_id,curr_row);

            IF curr_colval IS NOT NULL AND
               gc_value_in IS NOT NULL THEN

              IF ignorecase_in THEN

                IF UPPER(curr_colval) = UPPER(gc_value_in) THEN
                  rowcount_match := rowcount_match + 1;
                END IF;

              ELSIF curr_colval = gc_value_in THEN
                rowcount_match := rowcount_match + 1;
              END IF;

            ELSIF curr_colval IS NULL AND
                  gc_value_in IS NULL THEN
              rowcount_match := rowcount_match + 1;
            END IF;

        END LOOP;

      END IF;

    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0243','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN rowcount_match;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
     RETURN 0;

 END FIND_RG_ROWCOUNT_FOR_COLVAL;

END G$_WF_RECGRP;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_RECGRP");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgNameIn
		* @param gcNameIn
		* @param gcValueIn
		*/
		public int findRgFirstrowForColval(NString rgNameIn, NString gcNameIn, NString gcValueIn) {
			return findRgFirstrowForColval(rgNameIn, gcNameIn, gcValueIn, toBool(NBool.False));
		}

/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgNameIn
		* @param gcNameIn
		* @param gcValueIn
		* @param ignorecaseIn
		*/
		public int findRgFirstrowForColval(NString rgNameIn, NString gcNameIn, NString gcValueIn, NBool ignorecaseIn)
		{
			
			final NString VCCURRSUBPROG = toStr("FIND_RG_FIRSTROW_FOR_COLVAL");
			ValueSet rgId= null;
			ValueSetColumn gcId= null;
			int rowCount;
			int currRow;
			NString currColval= NString.getNull();
			int firstMatchRow = 0;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0240"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( !rgNameIn.isNull() )
				{
					rgId = findGroup(rgNameIn);
					if ( !gcNameIn.isNull() )
					{
						gcId = findColumn(rgNameIn.append(".").append(gcNameIn));
						if ( !(rgId == null) && !(gcId == null) )
						{
							rowCount = getGroupRowCount(rgId);
							for ( currRow = 1; currRow <= rowCount; currRow+= 1 )
							{
								currColval = getGroupCharCell(gcId, currRow);
								if ( !currColval.isNull() && !gcValueIn.isNull() )
								{
									if ( ignorecaseIn.getValue() )
									{
										if ( upper(currColval).equals(upper(gcValueIn)) )
										{
											firstMatchRow = currRow;
											throw new ExitFunction();
										}
									}
									else if ( currColval.equals(gcValueIn) ) {
										firstMatchRow = currRow;
										throw new ExitFunction();
									}
								}
								else if ( currColval.isNull() && gcValueIn.isNull() ) {
									firstMatchRow = currRow;
									throw new ExitFunction();
								}
							}
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0241"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				throw new ExitFunction();
			}
			catch(ExitFunction e)
			{
				return firstMatchRow;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return  0;
			}

		}
/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgNameIn
		* @param gcNameIn
		* @param gcValueIn
		*/
		public NInteger findRgRowcountForColval(NString rgNameIn, NString gcNameIn, NString gcValueIn) {
			return findRgRowcountForColval(rgNameIn, gcNameIn, gcValueIn, toBool(NBool.False));
		}

/* <p>
		* ---------------------------
		* ---------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgNameIn
		* @param gcNameIn
		* @param gcValueIn
		* @param ignorecaseIn
		*/
		public NInteger findRgRowcountForColval(NString rgNameIn, NString gcNameIn, NString gcValueIn, NBool ignorecaseIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("FIND_RG_ROWCOUNT_FOR_COLVAL");
//			ValueSet rgId= null;
//			ValueSetColumn gcId= null;
//			NInteger rowCount= NInteger.getNull();
//			NInteger currRow= NInteger.getNull();
//			NString currColval= NString.getNull();
//			NInteger rowcountMatch = toInt(0);
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0242"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				if ( !rgNameIn.isNull() )
//				{
//					rgId = findGroup(rgNameIn);
//					if ( !gcNameIn.isNull() )
//					{
//						gcId = findColumn(rgNameIn.append(".").append(gcNameIn));
//						if ( !(rgId == null) && !(gcId == null) )
//						{
//							rowCount = getGroupRowCount(rgId);
//							for ( currRow = 1; currRow <= rowCount; currRow+= 1 )
//							{
//								currColval = getGroupCharCell(gcId, currRow);
//								if ( !currColval.isNull() && !gcValueIn.isNull() )
//								{
//									if ( ignorecaseIn.getValue() )
//									{
//										if ( upper(currColval).equals(upper(gcValueIn)) )
//										{
//											rowcountMatch = rowcountMatch.add(1);
//										}
//									}
//									else if ( currColval.equals(gcValueIn) ) {
//										rowcountMatch = rowcountMatch.add(1);
//									}
//								}
//								else if ( currColval.isNull() && gcValueIn.isNull() ) {
//									rowcountMatch = rowcountMatch.add(1);
//								}
//							}
//						}
//					}
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0243"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rowcountMatch;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return  toInt(0);
//			}
//
			this.getLogger().trace(this, "F2J : findRgRowcountForColval function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
		
	
	
}
