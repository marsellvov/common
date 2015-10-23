package net.hedtech.banner.finance.common.Fomusor.services;

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


import net.hedtech.banner.finance.common.Fomusor.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fomusor.model.*;



public class FomusorServices extends AbstractSupportCodeObject{
	
	
	public FomusorServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FomusorTask  getTask() {
		return (FomusorTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fomusor.model.FomusorModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit SELECT_FORUSOR_1
	
	   FUNCTION SELECT_FORUSOR_1 (IVAR_1 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FORUSOR
         WHERE  FORUSOR_USER_ID_ENTERED = IVAR_1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;
	*/
	//ID:970
	/* <p>
/* </p>
		* @param ivar1
		*/
		public NBool selectForusor1(NString ivar1)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_USER_ID_ENTERED = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FTVCOAS_1
	
	   FUNCTION SELECT_FTVCOAS_1 (IVAR_1 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FTVCOAS
         WHERE  FTVCOAS_COAS_CODE = IVAR_1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;
	*/
	//ID:971
	/* <p>
/* </p>
		* @param ivar1
		*/
		public NBool selectFtvcoas1(NString ivar1)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FTVCOAS " +
	" WHERE FTVCOAS_COAS_CODE = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FOBPROF_1
	
	   FUNCTION SELECT_FOBPROF_1 (IVAR_1 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = IVAR_1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;
	*/
	//ID:972
	/* <p>
/* </p>
		* @param ivar1
		*/
		public NBool selectFobprof1(NString ivar1)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_FORUORH_1
	
	   PROCEDURE INSERT_FORUORH_1
   IS
   BEGIN
      INSERT INTO FORUORH
             ( FORUORH_USER_ID_ENTERED,
               FORUORH_COAS_CODE,
               FORUORH_ORGN_CODE,
               FORUORH_ACCESS_IND,
               FORUORH_ACTIVITY_DATE,
               FORUORH_USER_ID,
               FORUORH_END_DATE,
               FORUORH_WBUD_ACCESS_IND )
      VALUES ( :FORUSOR.FORUSOR_USER_ID_ENTERED,
               :FORUSOR.FORUSOR_COAS_CODE,
               :FORUSOR.FORUSOR_ORGN_CODE,
               :FORUSOR.FORUSOR_ACCESS_IND,
               :FORUSOR.FORUSOR_ACTIVITY_DATE,
               :FORUSOR.FORUSOR_USER_ID,
               SYSDATE,
               :FORUSOR.FORUSOR_WBUD_ACCESS_IND ) ;
   END ;
	*/
	//ID:973
	/* <p>
/* </p>
		*/
		public void insertForuorh1(ForusorAdapter forusorElement)
		{
			int rowCount = 0;
			String sql1 = "INSERT INTO FORUORH " +
	"(FORUORH_USER_ID_ENTERED, FORUORH_COAS_CODE, FORUORH_ORGN_CODE, FORUORH_ACCESS_IND, FORUORH_ACTIVITY_DATE, FORUORH_USER_ID, FORUORH_END_DATE, FORUORH_WBUD_ACCESS_IND)" +
	"VALUES (:FORUSOR_FORUSOR_USER_ID_ENTERED, :FORUSOR_FORUSOR_COAS_CODE, :FORUSOR_FORUSOR_ORGN_CODE, :FORUSOR_FORUSOR_ACCESS_IND, :FORUSOR_FORUSOR_ACTIVITY_DATE, :FORUSOR_FORUSOR_USER_ID, SYSDATE, :FORUSOR_FORUSOR_WBUD_ACCESS_IND)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FORUSOR_FORUSOR_USER_ID_ENTERED", forusorElement.getForusorUserIdEntered());
			command1.addParameter("FORUSOR_FORUSOR_COAS_CODE", forusorElement.getForusorCoasCode());
			command1.addParameter("FORUSOR_FORUSOR_ORGN_CODE", forusorElement.getForusorOrgnCode());
			command1.addParameter("FORUSOR_FORUSOR_ACCESS_IND", forusorElement.getForusorAccessInd());
			command1.addParameter("FORUSOR_FORUSOR_ACTIVITY_DATE", forusorElement.getForusorActivityDate());
			command1.addParameter("FORUSOR_FORUSOR_USER_ID", forusorElement.getForusorUserId());
			command1.addParameter("FORUSOR_FORUSOR_WBUD_ACCESS_IND", forusorElement.getForusorWbudAccessInd());
			rowCount = command1.execute();
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
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:974
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Robert Rullo 8/10/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. Kayur Patel 1/12/99
   Where Clause Methodology applied.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:975
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:976
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>
Audit Trail: 5.3
  
     1. Defect #.....54478
        Signoff......LRadhakrishnan 9/21/01
        problem......Updating a record causes history records to become wrong
        Fix..........A current record can only be deleted.  It should not be updateable.
                      Change property of detail items to non-updateable.
                      
  Audit Trail end;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:977
	/* <p>
/* </p>
		*/
		public void auditTrail53()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
  AUDIT TRAIL: 6.0
  1.  Signoff....Christine Liu           10-29-2002
      Mods.......Modifications for Budget Preparation Enhancement. 
                 A. The following new items have been added:
                    1. New Item on FORUSOR block: FORUSOR_WBUD_ACCESS_IND
                    2. New Item on FORUSOR_DUMMY block: FORUSOR_WBUD_ACCESS_IND
                    2. New Form Level trigger: CHECK_WEB_BUDGET_ENABLING 
                                  
                 B. The following triggers have been modified:
                    1. Form Level: WHEN-NEW-FORM-INSTANCE
                    2. FORUSOR_DUMMY block: INSERT_HISTORY and COPY_SECURITY_DATA
                    3. PROCEDURE: INSERT_FORUORH_1
  AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:978
	/* <p>
/* </p>
		*/
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
	//ID:979
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Lakshmi Radhakrishnan 9-FEB-2004
  Application of enhanced UI methodology. Please refer to the SCT Banner 7.0
  User Interface Technical Methodology for more details.

AUDIT TRAIL END;
</multilinecomment> 
BEGIN
  null;
END;
	*/
	//ID:980
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
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
	//ID:981
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1_0_1
	
	PROCEDURE AUDIT_TRAIL_7_1_0_1 IS
<multilinecomment>AUDIT TRAIL: 7.1.0.1
   
1. Defect.....1-BGAL9
   SIGNOFF....wei zhang    13-FEB-2006
   problem....Form can not compile in a VPD environment.
   fix........Modify for VPD.
              Change all the occurrences of "insert in FORUORH values select ..."  to 
              "insert in FORUORH(column names) values select ...".
              Change all the occurrences of "insert in FORUSOR values select ..."  to 
              "insert in FORUSOR(column names) values select ...".
              
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;

	*/
	//ID:982
	/* <p>
/* </p>
		*/
		public void auditTrail7101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:983
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4

1. Defect#.....1-1UHODB
   Signoff.....Pradeep Kumar Mallapuram    21-Aug-2009
   Problem.....Limited space for prompts/labels
   Fix.........Modified the hint of the INCLUDE_ORGN_CODE,EXCLUDE_ORGN_CODE in KEY_BLOCK
               modified 'orgns' as 'organization' in the hint text
AUDIT TRAIL END
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:984
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FOMUSOR
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Oct 23 19:14:42 2009
-- MSGSIGN : #2d44826e61cacf46
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:985
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
