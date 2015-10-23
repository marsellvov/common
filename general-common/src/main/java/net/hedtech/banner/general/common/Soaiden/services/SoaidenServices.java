package net.hedtech.banner.general.common.Soaiden.services;

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


import net.hedtech.banner.general.common.Soaiden.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaiden.model.*;



public class SoaidenServices extends AbstractSupportCodeObject{
	
	
	public SoaidenServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SoaidenTask  getTask() {
		return (SoaidenTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Soaiden.model.SoaidenModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> 
AUDIT TRAIL: 7.3.3.1

1. Sanjib Kumar Panda 		8 February 2007
	 Defect  1-7ELIZ 
	 Problem: ID field too narrow - may not display full ID
	 Impact:  Can only see part of the ID when it is displayed (or entered) in this form.
	 		   	  Field width is defined as 54 - should be 60.  Displaying 7.5 characters out of 
	 		   	  possible 9 if characters are 1 em wide.  Inconsistent field width throughout Banner.
   Solution:Increase the field width of the item spriden_id to 81 and adjusted display 
            properties of form and block items to correspond to UI standards Banner 7.0	. 

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:690
	/* <p>
		
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
BEGIN
  <multilinecomment>
AUDIT TRAIL: 2.1.20
F1. Added this procedure.           DDM 03/14/97

2. Updated LOAD_CURRENT_RELEASE
   TO 2.2.20                       DDM 03/14/97

3. Defect 4138	                   DDM 03/24/97
   Add when-new-item-instance
   to control messages in the 
   entry-query mode.
4. Defect 5303			   DDM 03/24/97
   Added the SPRIDEN_1_EXITVALUE_BTN
   to the DISABLE, ENABLE_DETAIL_BTN_TRIG
   Triggers.
5. Defect 5977                     DDM 03/27/97
   Added the SHOW_KEYS trigger.
6. Defect 2889                     DDM 05/07/97
   Added function student_installed 
   to check for student in the GUBINST
   table. Added this function to WHEN-NEW-FORM-INSTANCE
   and KEY-CQUERY triggers.

AUDIT TRAIL END
 </multilinecomment>
NULL;
END;
	*/
	//ID:691
	/* <p>
		
/* </p>
		*/
		public void auditTrail21()
		{
			// AUDIT TRAIL: 2.1.20
			// F1. Added this procedure.           DDM 03/14/97
			// 2. Updated LOAD_CURRENT_RELEASE
			// TO 2.2.20                       DDM 03/14/97
			// 3. Defect 4138	                   DDM 03/24/97
			// Add when-new-item-instance
			// to control messages in the
			// entry-query mode.
			// 4. Defect 5303			   DDM 03/24/97
			// Added the SPRIDEN_1_EXITVALUE_BTN
			// to the DISABLE, ENABLE_DETAIL_BTN_TRIG
			// Triggers.
			// 5. Defect 5977                     DDM 03/27/97
			// Added the SHOW_KEYS trigger.
			// 6. Defect 2889                     DDM 05/07/97
			// Added function student_installed
			// to check for student in the GUBINST
			// table. Added this function to WHEN-NEW-FORM-INSTANCE
			// and KEY-CQUERY triggers.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit STUDENT_INSTALLED
	
	FUNCTION STUDENT_INSTALLED 
RETURN BOOLEAN 
IS
tmp GUBINST.GUBINST_STUDENT_INSTALLED%TYPE;
CURSOR student_cur is
SELECT GUBINST_STUDENT_INSTALLED
FROM GUBINST;
BEGIN
   OPEN student_cur;
   FETCH student_cur INTO tmp;
   IF tmp = 'Y'
   THEN
      RETURN TRUE;
   ELSE
      RETURN FALSE;
   END IF;
RETURN NULL; END;
	*/
	//ID:692
	/* <p>
		
/* </p>
		*/
		public NBool studentInstalled()
		{
			int rowCount = 0;
			NString tmp= NString.getNull();
			String sqlstudentCur = "SELECT GUBINST_STUDENT_INSTALLED " +
	" FROM GUBINST ";
			DataCursor studentCur = new DataCursor(sqlstudentCur);
			try {
				studentCur.open();
				ResultSet studentCurResults = studentCur.fetchInto();
				if ( studentCurResults != null ) {
					tmp = studentCurResults.getStr(0);
				}
				if ( tmp.equals("Y") )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
				}finally{
					studentCur.close();
				}
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
2. Set Menu Module to GUMEVAL.                           TI 06/20/97

AUDIT TRAIL: 3.0.0.1
1. Added code to KEY-EXEQRY, KEY-ENTQRY, and             VB 09/24/97
   Search Button WHEN-BUTTON-PRESSED triggers to give
   error messages when trying to perform an unqualified
   query.  If the form is in Normal Mode, the user must
   go into Enter Query Mode and enter a query.  If the form
   is in Enter Query Mode, there must be query criteria in
   at least one field before a query can be executed.  This
   will prevent the form from trying to query all of the
   database records, which was slow depending on the number
   of SPRIDEN records.

AUDIT TRAIL: 3.1 
1. Release number updated to 3.1.                       AT 05/05/98

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:693
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
1. CLF  07/21/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. CLF  09/29/98
   Added Name Type field.
3. CLF  09/30/98
   Added Case Sensitive Query functionality.
      Added radial buttons and set Radial button YES on in
      when-new-form-instance and key-clrfrm.
4. CLF 05/10/99
   Defect #12240
   Problem:  When entering SOAIDEN from an Extended Search window,
      the original search criteria were not displaying on the form
   Fix:  Corrected the spelling of DISP_QUERY_STATUS
      and added code 
          G$_IDNAME_SEARCH.ENTER_QUERY_STATUS;
      as first line of trigger KEY-ENTQRY

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:694
	/* <p>
		
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_3_B2K
	
	PROCEDURE AUDIT_TRAIL_4_3_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.3
1. CLF 03/01/00
   Defect #36181
   Problem:  After returning a value from SOAIDNS, SOAIDEN could not
      properly execute any more queries.
   Fix:  In form level trigger DETAIL_BTN_TRIG (at end of trigger)
      replaced       EXIT_FORM;
      with
      :GLOBAL.LAST_NAME := '';
      :GLOBAL.FIRST_NAME := '';
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;

AUDIT TRAIL: 4.3.3.1
1. Defect #46744                                                      CLF 09/02/00
   Problem:  Apparently some forms are setting the global name search variables 
      (global.last_name, .first_name, .mid_name) and not clearing them.  
      When that happens, SOAIDEN attempts to use those variables in the name lookup.   
   Fix:  Clear the globals before processing in SOAIDEN where appropriate
   Technical:  In WHEN-NEW-FORM-INSTANCE form level trigger add  in 2 places
       :GLOBAL.SEARCH_ID := ''; 
       :GLOBAL.LAST_NAME := ''; 
       :GLOBAL.FIRST_NAME := ''; 
       :GLOBAL.MID_NAME := ''; 
      

AUDIT TRAIL END
</multilinecomment>


BEGIN
  null;
END;
	*/
	//ID:695
	/* <p>
		
/* </p>
		*/
		public void auditTrail43B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_MANUAL
	
	PROCEDURE AUDIT_TRAIL_5_0_MANUAL IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  Regen form to keep Banner 5.0 in sync with 4.x defect corrections
																										CLF  09/02/00
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:696
	/* <p>
		
/* </p>
		*/
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4_B2K
	
	PROCEDURE AUDIT_TRAIL_5_4_B2K IS
<multilinecomment>
AUDIT TRAIL: 5.4.0.1
1. RPE's 12163, 15794, 17056, and 26394      MW  04/18/2002
   Problem: Make "Case Insensitive Query" default to Yes on SOAIDEN.
     It will increase the chances of finding people, reduce errors.
   Technical Fix: Modified the form-level triggers, KEY-CLRFRM and
     WHEN-NEW-FORM-INSTANCE, to set the :CASE_INSENSITIVE_RG to 'T'
     to make the "Case Sensitive Query?' radio button default to No
     on SOAIDEN.  Set the CASE_INSENSITIVE_QUERY property to
     PROPERTY_TRUE for items: SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME,
     and SPRIDEN_MI.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:697
	/* <p>
		
/* </p>
		*/
		public void auditTrail54B2k()
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
	//ID:698
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
1. P Lawler 04/04/04
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical 
    Methodology for more details. 
    
2.  MHockett 8/31/04 Changes for PII (Personally Identifiable Information) and 
    Protecting Senstive Data masking. 
    a.  Add gokfgac. p_search_form_update_temp_pidm(:spriden.spriden_pidm);  to key-nxtkey
    for saving pidm in PII temp variable.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:699
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
	//ID:700
	/* <p>
		
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
2. 1-3C8410   WG 01/29/08
	 Problem: Name fields do not display tooltip on lengthy names.
	 Fix: Applied G$_CHAR_FIELD_CLASS to the LAST, MIDDLE and FIRST NAMEs.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:701
	/* <p>
		
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. 1-2G1E35        WG 07/05/07
   Migrate 7.3.3.1 work to 8.0

2. 1-E0RB0         SS 10/31/07
    Added if condition in ENABLE_DETAIL_BTN_TRIG to enable APASBIO
    and to disable APASBIO in DISABLE_DETAIL_BTN_TRIG
    3.  George Shalovka  28 November 2007
    Tracking:1-30CTP4
    Problem: soaiden allows entry of SDE data and gives on-update trigger error
    				Additionally, the SDE "lightbulb" icon does not become "bright"
    				when cursor enters a row with SDE data.
    Solution:Problem occurs because form item ROWID in block SPRIDEN is not valued.
    	SDE code looks for non-null ROWID to search for data.
    	By modifying block-level attribute, ROWIDs are populated for SPRIDEN block.
    	Modify block property palette Database.Key Mode from "Non-Updateable" to "Unique".
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:702
	/* <p>
		
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SOAIDEN
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Jan 23 07:10:31 2013
-- MSGSIGN : #eb79b6ceb736db35
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:703
	/* <p>
		
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1_0_1
	
	PROCEDURE AUDIT_TRAIL_8_1_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1.0.1
1. 1-456UGC        LVH 11/01/2008
   Updated soundex.last_name maximum length from 25 to 60 to accomodate long last name
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:704
	/* <p>
		
/* </p>
		*/
		public void auditTrail8101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_1
	
	PROCEDURE AUDIT_TRAIL_8_5_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.5.1

1. Defect:  1-4717WA        Shalini Jha     10-jan-2011
	 Problem: When accessing SOAIDEN directly or from SRARECR (and other forms other than 
	          SPAIDEN), the SOAIDNS option (Options men) is disabled (grayed out).
	          Workaround:
	          When the option is grayed out, the Count Query Hits does work.
	          Additional Comment:
	          SOAIDNS option should be active on SOAIDEN, when user goes to SOAIDEN from 
	          APAIDEN.
   Solution:Enabling and Disabling of Options menu depends on :GLOBAL.PRODUCT_IND. So in
            WHEN-NEW-FORM-INSTANCE added DEFAULT_VALUE( 'S', 'GLOBAL.PRODUCT_IND' ) to
            populate this value with 'S' in case calling form doesn't send this value and
            if "Student" is installed.
            
            When called from APAIDEN, SOAIDNS option should be enabled-
            So under trigger ENABLE_DETAIL_BTN_TRIG added a code to enable option menu for
            SOAIDNS apart from APASBIO.
            G$_NAVIGATION_FRAME.ENABLE_OPTION('SOAIDNS','P');
            Had to modify trigger DETAIL_BTN_TRIG to add a line to fetch :GLOBAL.SECRFRM
            based on option menu selected by user-
            :GLOBAL.SECRFRM := NAME_IN('GLOBAL.GUROPTM_NAME1') ; 
            And also replaced 'IF' clause from
            IF :GLOBAL.PRODUCT_IND = 'A'
            to
            IF :GLOBAL.SECRFRM ='APASBIO'
            and similarly for :GLOBAL.PRODUCT_IND = 'S' to 'SOAIDNS'.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:705
	/* <p>
		
/* </p>
		*/
		public void auditTrail851()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_6
	
	PROCEDURE AUDIT_TRAIL_8_5_6 IS
<multilinecomment> 
AUDIT TRAIL: 8.5.6
1. Defect 1-Z507V5                             AS 11/19/2012
   Problem:Cannot access SOAIDNS from SOAIDEN using Shift + F2.
   Solution: Changed key-cquery trigger to directly call soaidns rather then using DETAIL_BTN_TRIG.
             Reason being GLOBAL.GUROPTM_NAME1 was NULL when called from KEY-CQUERY trigger.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:706
	/* <p>
		
/* </p>
		*/
		public void auditTrail856()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 1994-2012 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:707
	/* <p>
		
/* </p>
		*/
		public void copyright()
		{
		}

	
	

}
