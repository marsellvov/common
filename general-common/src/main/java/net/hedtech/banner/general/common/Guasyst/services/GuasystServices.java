package net.hedtech.banner.general.common.Guasyst.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.banner.general.common.Guasyst.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guasyst.model.*;



public class GuasystServices extends AbstractSupportCodeObject{
	
	
	public GuasystServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuasystTask  getTask() {
		return (GuasystTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guasyst.model.GuasystModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL: 3.1                                        INIT   DATE
1.  Changed the library references from lower to upper
    case for use in charactor mode.                      GS  05/11/98
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1135
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment> AUDIT TRAIL: 3.0
   1. Changed check boxes to be enabled.  Set all other  RH  05/23/97 
      properties to false.  Same change for _lit items.  
      Defect 6411.
 AUDIT TRAIL: 3.0.1
   1. Corrected item name in DISPLAY_HEADINGS form level GS  01/27/98 
      tirgger.  
      Defect 7922.
   AUDIT TRAIL END;
</multilinecomment>                                  
BEGIN
  NULL;
END;
	*/
	//ID:1136
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1137
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:1138
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2
	
	PROCEDURE AUDIT_TRAIL_5_2 IS
<multilinecomment>
Audit Trail: 5.2 
1. Defect # 54701   UMA  03/01/01 
If you change an ID for a NON-Person and log into GUASYST
and place in old ID the GUASYST form will not populate ID and Name
with current ID info.  It will do this fine for Person related ID's
Do not modify this program unit.
Resolution:
Deleted the Item ID, recreated the ID Item and reset its properties 
to G$_ID_CLASS. Looks like during conversion from 3.0 to 4.0 some of 
the properties were not changed correctly.
2. GShalovka 23 May 2001
   Problem: KEY_BLOCK.ID hint text was missing.
   Solution: Added hint text.
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END; 
	*/
	//ID:1139
		public void auditTrail52()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>
Audit Trail: 5.3
1. Defect # 66324  EFD 8/2/2001 
Rewrite V2 triggers. Created a new function f_IsPidmInTable using NDS
and rewrote key block trigger DISPLAY_DATA.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END; 
	*/
	//ID:1140
		public void auditTrail53()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
Audit Trail: 5.4
  1. George Shalovka  19 November 2001  GUIALTI Mod
     Add code to KEY_BLOCK.ID.Key-Dup-Item to call GUIALTI form.
        Modified associated AutoHint text.
     Modify code in BUTTON_CONTROL_BLOCK.ID_LBT.When-Button-Pressed
        to display add call to GUIALTI. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	//ID:1141
	/* <p>
		public void auditTrail54()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
Audit Trail: 6.0
1. G Shalovka  13 february 2003  GUIALTI Mod
   Delete obsolete items related to GLOBALS XRISYS, CRTSYS, BPISYS, LIMSYS
      from GUASYST_1_CANVAS and form level triggers DISPLAY_HEADINGS and DISPLAY_DATA.
   Change product header from 'ALUMNI' to 'ADVANCEMENT'.  
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	//ID:1142
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1143
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 02/09/2004
    Application of enhanced UI methodology.  Please refer to the "SCT Banner 7.0 User Interface
    Technical Methodology" for more details.
2.  SJQ 08/11/2004
    Change the visual attribute of the headings since they weren't picking up the correct
    background color.
3.  SJQ 08/25/2004
    Change the labels for general student and financial manager to spell out the words instead
    of using abbreviations.
4.  SJQ 10/15/2004
    Adjust position of column labels to be on the same line.

AUDIT TRAIL: 7.1
1.  Scott Geiser 01/24/2005
    Applied changes for Advancement RPE #2701, 26275.
    A. Added 3 Display Text Item to KEY_BLOCK:
       ADV_INDIV_DONR_CATG
       ADV_INDIV_PREF_CLAS
       ADV_ORGN_DONR_CAT
    B. Added 2 new procedures:
       GET_DONOR_CATEGORY
       GET_PREF_CLAS
    C. Modified KEY_BLOCK.DISPLAY_DATA trigger to call the new procedures to 
       populate the new Advancament items.

AUDIT TRAIL: 7.2
1.  SJQ 05/13/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1144
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit GET_DONOR_CATEGORY
	
	PROCEDURE GET_DONOR_CATEGORY(pidm_in       IN  NUMBER,
                             donr_catg_out OUT VARCHAR2) IS
  CHECK_TABLE       VARCHAR2(30);
  DONR_CATG         VARCHAR2(4); 
  FOUND             VARCHAR2(1);
  err_num           NUMBER;
  err_msg           VARCHAR2(1000);
  sql_stmt          VARCHAR2(500);
--
  CURSOR CHECK_TAB IS
    SELECT 'Y' FROM DUAL
     WHERE EXISTS
          (SELECT 'X' FROM ALL_TABLES WHERE TABLE_NAME = CHECK_TABLE);
BEGIN
  CHECK_TABLE := 'APRCATG';
  OPEN CHECK_TAB;
  FETCH CHECK_TAB INTO FOUND;
  IF CHECK_TAB%FOUND THEN
    sql_stmt := 
             'SELECT ATVDONR_CODE FROM APRCATG B, ATVDONR Y
              WHERE  APRCATG_PIDM = ' || pidm_in ||
             ' AND   APRCATG_DONR_CODE = Y.ATVDONR_CODE
              AND    ATVDONR_RPT_SEQ_IND =
             (SELECT MIN(X.ATVDONR_RPT_SEQ_IND)
              FROM   ATVDONR X
              WHERE  EXISTS
             (SELECT APRCATG_DONR_CODE
              FROM   APRCATG
              WHERE  APRCATG_PIDM = ' || pidm_in ||
             ' AND   APRCATG_DONR_CODE = X.ATVDONR_CODE ))';
    GOKDBMS.DYNAMIC_SQL(sql_stmt,DONR_CATG);
--
    donr_catg_out := DONR_CATG;
  END IF;
  CLOSE CHECK_TAB;
EXCEPTION
  WHEN OTHERS THEN
     err_num := SQLCODE;
     err_msg := to_char(err_num) || substr(SQLERRM,1,80);
END;
	*/
	//ID:1145
		public void getDonorCategory(NNumber pidmIn, Ref<NString> donrCatgOut)
		{
			int rowCount = 0;
			NString checkTable= NString.getNull();
			NString donrCatg= NString.getNull();
			NString found= NString.getNull();
			NNumber errNum= NNumber.getNull();
			NString errMsg= NString.getNull();
			NString sqlStmt= NString.getNull();
			String sqlcheckTab = "SELECT 'Y' " +
	" FROM DUAL " +
	" WHERE  EXISTS(SELECT 'X' " +
		" FROM ALL_TABLES " +
		" WHERE TABLE_NAME = :P_CHECK_TABLE ) ";
			DataCursor checkTab = new DataCursor(sqlcheckTab);
			try {
				try
				{
					checkTable = toStr("APRCATG");
					checkTab.addParameter("P_CHECK_TABLE", checkTable);
					checkTab.open();
					ResultSet checkTabResults = checkTab.fetchInto();
					if ( checkTabResults != null ) {
						found = checkTabResults.getStr(0);
					}
					if ( checkTab.found() )
					{
						sqlStmt = toStr("SELECT ATVDONR_CODE FROM APRCATG B, ATVDONR Y\n              WHERE  APRCATG_PIDM = ").append(pidmIn).append(" AND   APRCATG_DONR_CODE = Y.ATVDONR_CODE\n              AND    ATVDONR_RPT_SEQ_IND =\n             (SELECT MIN(X.ATVDONR_RPT_SEQ_IND)\n              FROM   ATVDONR X\n              WHERE  EXISTS\n             (SELECT APRCATG_DONR_CODE\n              FROM   APRCATG\n              WHERE  APRCATG_PIDM = ").append(pidmIn).append(" AND   APRCATG_DONR_CODE = X.ATVDONR_CODE ))");
						Ref<NString> p_return_value1_ref = new Ref<NString>(donrCatg);
						Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
						donrCatg = p_return_value1_ref.val;
						donrCatgOut.val = donrCatg;
					}
				}
				catch(Exception  e)
				{
					errNum = toNumber(errorCode());
					errMsg = toChar(errNum).append(substring(errorMessage(), toInt(1), toInt(80)));
				}
				}finally{
					checkTab.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit GET_PREF_CLAS
	
	PROCEDURE GET_PREF_CLAS(pidm_in       IN  NUMBER,
                        pref_clas_out OUT VARCHAR2) IS
  CHECK_TABLE       VARCHAR2(30);
  PREF_CLAS         VARCHAR2(4); 
  FOUND             VARCHAR2(1);
  err_num           NUMBER;
  err_msg           VARCHAR2(1000);
  sql_stmt          VARCHAR2(200);
--
  CURSOR CHECK_TAB IS
    SELECT 'Y' FROM DUAL
     WHERE EXISTS
           (SELECT 'X' FROM ALL_TABLES WHERE TABLE_NAME = CHECK_TABLE);
--
BEGIN
  CHECK_TABLE := 'APBCONS';
  OPEN CHECK_TAB;
  FETCH CHECK_TAB INTO FOUND;
  IF CHECK_TAB%FOUND THEN
    sql_stmt := 'SELECT APBCONS_PREF_CLAS FROM APBCONS' ||
                ' WHERE APBCONS_PIDM = ' || pidm_in;
    GOKDBMS.DYNAMIC_SQL(sql_stmt,PREF_CLAS);
--
    PREF_CLAS_OUT := PREF_CLAS;
  END IF;
  CLOSE CHECK_TAB;
--
EXCEPTION
  WHEN OTHERS THEN
    err_num := SQLCODE;
    err_msg := to_char(err_num) || substr(SQLERRM,1,80);
END;
	*/
	//ID:1146
		public void getPrefClas(NNumber pidmIn, Ref<NString> prefClasOut)
		{
			int rowCount = 0;
			NString checkTable= NString.getNull();
			NString prefClas= NString.getNull();
			NString found= NString.getNull();
			NNumber errNum= NNumber.getNull();
			NString errMsg= NString.getNull();
			NString sqlStmt= NString.getNull();
			String sqlcheckTab = "SELECT 'Y' " +
	" FROM DUAL " +
	" WHERE  EXISTS(SELECT 'X' " +
		" FROM ALL_TABLES " +
		" WHERE TABLE_NAME = :P_CHECK_TABLE ) ";
			DataCursor checkTab = new DataCursor(sqlcheckTab);
			try {
				try
				{
					checkTable = toStr("APBCONS");
					checkTab.addParameter("P_CHECK_TABLE", checkTable);
					checkTab.open();
					ResultSet checkTabResults = checkTab.fetchInto();
					if ( checkTabResults != null ) {
						found = checkTabResults.getStr(0);
					}
					if ( checkTab.found() )
					{
						sqlStmt = toStr("SELECT APBCONS_PREF_CLAS FROM APBCONS").append(" WHERE APBCONS_PIDM = ").append(pidmIn);
						Ref<NString> p_return_value1_ref = new Ref<NString>(prefClas);
						Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
						prefClas = p_return_value1_ref.val;
						prefClasOut.val = prefClas;
					}
				}
				catch(Exception  e)
				{
					errNum = toNumber(errorCode());
					errMsg = toChar(errNum).append(substring(errorMessage(), toInt(1), toInt(80)));
				}
				}finally{
					checkTab.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:1147
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1148
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
Audit Trail: 8.2
1. Defect # 1-4DGR05  EM 03/06/2009 
   ISC defect- Added G$_NLS.Get function in trigger DISPLAY_HEADINGS.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1149
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUASYST
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Mar 06 11:04:52 2009
-- MSGSIGN : #9dc95699406fb9c6
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1150
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
