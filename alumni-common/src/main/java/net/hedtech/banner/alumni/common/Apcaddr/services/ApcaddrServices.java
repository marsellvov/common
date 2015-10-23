package net.hedtech.banner.alumni.common.Apcaddr.services;

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


import net.hedtech.banner.alumni.common.Apcaddr.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.alumni.common.Apcaddr.model.*;



public class ApcaddrServices extends AbstractSupportCodeObject{
	
	
	public ApcaddrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public ApcaddrTask  getTask() {
		return (ApcaddrTask )super.getContainer();
	}

	
	public net.hedtech.banner.alumni.common.Apcaddr.model.ApcaddrModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1
1. Complete and verify Forms40 conversion.   SG 09/23/94
AUDIT TRAIL: 2.1.1
1. Added Spouse donor category logic. FHL 3/7/95
2. Post 2.1 cleanup. FHL 3/20/95
3. Made items enabled for mouse navigation. FHL 3/20/95
4. MAC & CHAR mode mods. FHL 4/20/95
AUDIT TRAIL: 2.1.5
1. Security Mods. FHL 8/22/95
2. Convert for Forms 4.5. 5/2/96
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:1269
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. Add E-mail button (EMAL_BTN). FHL 1/29/97
2. Changed AOAEMAL to APAEMAL. FHL 2/4/97 
3. Modified when-new-form-instance for B2K doubleclick.
JB 05/06/97
4. Removed 'SYNCHRONIZE; G$_SET_INST_PROPERTY;' from all triggers that call
other forms. JB  05/06/97
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:1270
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:1271
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SAM  08/12/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. Added MNU_CALL_GUASYST trigger to call GUASYST form
   GD 12-15-98
AUDIT TRAIL: 4.2
1. Changed form title on MAIN_WINDOW to Alumni/Development Address List Form from
   Address List Form so as not to conflict with other forms in the WorkFlow BCC.
   SCG 10/13/1999
AUDIT TRAIL: 4.3.1
1. Defect #38886: Getting error message box without entering any ID in the Key block and navigate
   to the second block. Modified block level trigger When_New_Block_Instance_Trg.
   KM     06/07/00
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1272
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:1273
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4
1. RPE# Confidentiality Indicator																KM  07/08/02 
   Nothing to be changed in this program. Only deleted A$_SEL_ID_INFO_235 procedure
   under program unit is duplicate from the library and not using anywhere
   in the program. spbpers_confid_ind is equal to 'Y' is already changed in
   the library. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1274
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail54()
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
	//ID:1275
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS

<multilinecomment> 

AUDIT TRAIL: 7.0

1. Nuñez Eduardo 14/06/2004
   Application of enhanced UI methodology. Please refer to the SCT Banner 
   7.0 User Interface Technical Methodology for more details.
2. Scott Geiser 07/21/2004
   Changed calls to the APAEMAL and APATELE forms to call APAIDEN.
3. Defect 70-0120    Scott Geiser   11/05/2004
   Problems:
     UI: Block: KEY_BLOCK Item: DONR_CAT_LBT Font is not DEFAULT 
     UI: Block: KEY_BLOCK Item: DONR_CAT_LBT Background Color is not DEFAULT 
     UI: Block: KEY_BLOCK Item: DONR_CAT_LBT Font Size is not DEFAULT 
   Solution:  Reinherited visual attributes.
4. Defect 70-0168    Scott Geiser 11/19/2004
   Problem: We attempted to update telephone and address information in APAIDEN.  On the telephone tab, 
            we hit the dropdown arrow next to Address Type, which threw us into APCADDR.  In Banner 6.x 
            this form is automatically populated with the Addresses.  In Banner 7, you have to do a next 
            block function to retrieve the data. 
   Solution:
     Changed the code in the GLOBAL_COPY trigger as follows...
     Before:
          IF (:GLOBAL.FORM_WAS_CALLED = 'Y' AND
              :KEY_BLOCK.ID IS NOT NULL THEN
            DO_KEY('NEXT_BLOCK');
          END IF;
     After:
          IF (:GLOBAL.FORM_WAS_CALLED = 'Y' OR
   	          GET_APPLICATION_PROPERTY(CALLING_FORM) = 'APAIDEN') 
   	        AND
              :KEY_BLOCK.ID IS NOT NULL THEN
            DO_KEY('NEXT_BLOCK');
          END IF;
AUDIT TRAIL END

</multilinecomment>

BEGIN 
  NULL;
END;
	*/
	//ID:1276
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:1277
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1278
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. I18N Project                                                  Scott Geiser 07/27/2007
   Increased display length of Street Line 1, 2, 3 and Zip Code.
   
2. Key Block Tooltip issue.                                      Scott Geiser 10/16/2007
   a. Change SPS_NAME from Display Item to Text Item.
   b. Add G$_NAME_CLASS to SPS_NAME
AUDIT TRAIL END
</multilinecomment>
BEGIN 
  NULL;
END;
	*/
	//ID:1279
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.2
1. I18N Changes                                          Heidi Dombroski  11/25/2008
   Added House number and Street line to the form. Changed the number of records that display on the
   form from 3 to 2.
      
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1280
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : APCADDR
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Jan 14 12:15:59 2009
-- MSGSIGN : #6a04073a673f4b52
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1281
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_1
	
	PROCEDURE AUDIT_TRAIL_8_6_1  IS
<multilinecomment> 
AUDIT TRAIL: 8.6.1
1. RPE CMS-RPE2540                                Heidi Dombroski 02/26/2013
   Description: Need to provide a method to identify a pref address for an 
                organizational constituent. 
   Solution: Made changes to APCADDR so that only active addresses display
             on APCADDR when called from the organization's preferred address 
             field on the AOAORGN form.
</multilinecomment>
BEGIN
	NULL;
END;
	*/
	//ID:1282
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail861()
		{
		}

	
	

}
