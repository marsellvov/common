package net.hedtech.banner.finance.common.Ftvfsyr.services;

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


import net.hedtech.banner.finance.common.Ftvfsyr.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Ftvfsyr.model.*;



public class FtvfsyrServices extends AbstractSupportCodeObject{
	
	
	public FtvfsyrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FtvfsyrTask  getTask() {
		return (FtvfsyrTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Ftvfsyr.model.FtvfsyrModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit SELECT_FTVFSPD_1
	
	   FUNCTION SELECT_FTVFSPD_1 (IVAR_1 VARCHAR2, OVAR_1 IN OUT VARCHAR2)
   RETURN BOOLEAN IS
      CURSOR PTI_CURSOR IS
         SELECT MIN(FTVFSPD_FSPD_CODE)
         FROM   FTVFSPD
         WHERE  FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE
           AND  FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE
           AND  FTVFSPD_PRD_STATUS_IND = IVAR_1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO OVAR_1 ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:662
	/* <p>
/* </p>
		* @param ivar1
		* @param ovar1
		*/
		public NBool selectFtvfspd1(FtvfsyrAdapter ftvfsyrElement, NString ivar1, Ref<NString> ovar1)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT MIN(FTVFSPD_FSPD_CODE) " +
	" FROM FTVFSPD " +
	" WHERE FTVFSPD_COAS_CODE = :FTVFSYR_COAS_CODE AND FTVFSPD_FSYR_CODE = :FTVFSYR_FSYR_CODE AND FTVFSPD_PRD_STATUS_IND = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("FTVFSYR_COAS_CODE", ftvfsyrElement.getFtvfsyrCoasCode());
				ptiCursor.addParameter("FTVFSYR_FSYR_CODE", ftvfsyrElement.getFtvfsyrFsyrCode());
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ovar1.val = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.notFound()));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1
  1. Changes for Forms 4.0                     TJY 04/29/94
  2. Added G$_GUAMENU related items 
           RVG 05/27/95 
  3.More changes for FORMS 4.0. Referenced
    KEY-0, KEY-1, GUROPTM_RG, CUROPTM_LOV.     NR  10/18/94
  4.Put format mask for Date items.            NR  11/18/94
AUDIT TRAIL: 2.1.1
  1.MAC/CHARACTER-UPDATE.                      ET   04/25/95  
AUDIT TRAIL: 2.1.5
1. DEFECT.....NONE
   SIGNOFF....TGKINDERMAN    08-25-1995
   PROBLEM....Role Security
2. DEFECT.....NONE
   SIGNOFF....TGKINDERMAN    04-23-1996
   PROBLEM....Forms45 conversion.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:663
	/* <p>
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. DEFECT.....None
   SIGNOFF....Nonna Reznik   25-FEB-1997
   PROBLEM....Year 2000 - Full Compliance.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:664
	/* <p>
/* </p>
		*/
		public void auditTrail30()
		{
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
	//ID:665
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
1. Christine Liu  08/10/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. Pritee Shah 01/29/99
   Phase II UI Changes
3. Defect....None
   Signoff...Chester Tsui 02/08/99
   Problem...Users can insert/update data in a protected field.
   Fix.......Changed INSERT ALLOWED attribute at block level to FALSE.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:666
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
	//ID:667
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS 
<multilinecomment>
AUDIT TRAIL: 5.0 
1. Defect..........None
   Signoff.........Tatyana Ispas  08/03/2000
   Problem.........Enter Query function does not work for 'No' item and '1st Open/Prd' item.
   Fix.............Created 2  the same item in Header block on NULL canvas.
                   Added logic for Post-query trigger. Created Pre-Query trigger to perform enter query function.
AUDIT TRAIL END                   
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:668
	/* <p>
/* </p>
		*/
		public void auditTrail50()
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
	//ID:669
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
1. Gladys Rocher 08/04/2004
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment> 
 
BEGIN 
  NULL; 
END;
	*/
	//ID:670
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
	//ID:671
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
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:672
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	

}
