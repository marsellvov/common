package net.hedtech.banner.general.common.Goaemal.services;

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


import net.hedtech.banner.general.common.Goaemal.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goaemal.model.*;



public class GoaemalServices extends AbstractSupportCodeObject{
	
	
	public GoaemalServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoaemalTask  getTask() {
		return (GoaemalTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Goaemal.model.GoaemalModel getFormModel() {
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
2. Corrected defect number 6594.  Description no longer  BR  07/01/97
   causes truncation message. 
3. Field CONF_INFO and DECEASED_INFO puted on NULL       JC  07/09/97
   canvas.Character mode changes.                                 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1306
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.1
1. SJQ 11/13/97
   Modify PRE-INSERT logic to handle null user id for ops$accounts.
2. RLH 02/13/98
   Remove security global.  Defect 8657.
3. GS  03/05/98
   Resolve defect 8653.
   Add code to the KEY-EXIT trigger to value GLOBAL.PIDM & KEY_IDNO.
4. SCG 03/06/98
   Added GOREMAL_DISP_WEB_IND to the form.
5. SCG 03/26/98
   Added GTVEMAL_URL_IND to the form.
6. RLH 04/28/98
   Moved gtvemal_lov and _rg to GOQOLIB. Then referenced the _lov
   and _rg from GOQOLIB in form goaemal.

AUDIT TRAIL: 3.1.1
1. EPM 4/13/99 Changing the forms so that non-persons can have email
   accounts.  First added opt_window, opt_block, and opt_canvas.
   Added two triggers key-listval (to call soaiden form) and
   key-cquery (to call soacomp form).  When button pressed trigger
   for the id button has code that calls the options window.  
   The id and name are selected used G$_valid_all_id which replaced
   G$_valid_id.  This was put into a post change trigger which replaced 
   the when-validate-item trigger where it previously resided.
2. EPM 4/16/99
   Changed the when-validate-trigger of the status_ind checkbox
   to a when-checkbox-changed trigger so the functionality would occur
   immediately after the box was changed not when you left the box.
   Also made the preferred ind disabled as well as unchecked
   if you made the status inactive.

AUDIT TRAIL: 4.0
1. EPM 4/14/99 Copied Audit trail 3.1.1 (4/13/99) changes to 4.0.
   Appropriate changes between 3.0 and 4.0 G$_OPT objects were
   made.
AUDIT TRAIL: 4.0.1
1. GS 11/16/99 
   CSR 14610
   Problem: When ID is changed to one which is "Confidential",
            no information is retrieved for the Name item and a
            "no such trigger - disable keys" error displays.
   Impact:  User cannot change ID's on the form to one which is 
            "Confidential"; user must exit form and re-enter.
   Solution:Added referenced Alert item G$_CAUTION_OK_ALERT
            from goqolib.fmb which is required by goqrpls.pll 
            procedure G$_VALID_ALL_ID.  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1307
	/* <p>
/* </p>
		*/
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
	//ID:1308
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
	//ID:1309
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
1. Defect #50-0016																										MS 1/9/2001
   Problem:	When checking for Preferred email address only one record can have it 
   					checked at one time. User cannot uncheck 1 record and then check another 
   					without having to save the uncheck action and resave the check action.
   Technical Fix: Created a new item email_ind to be set to Y in WHEN-NEW-FORM-INSTANCE
   							  as a default, modified PRE-UPDATE, PRE-INSERT triggers and 
   							  WHEN-VALIDATE-ITEM trigger on GOREMAL_PREFERRED_IND item to check for 
   							  the email_ind value.
   								  					
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1310
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2
	
	PROCEDURE AUDIT_TRAIL_5_2 IS
<multilinecomment>
AUDIT TRAIL: 5.2
1. TGKinderman 04/18/2001
   DEFECT: 45567
   Problem: Updates on GOAEMAL do not change column GOREMAL_USER_ID.  It is keeping the
   initial user_id. Need to have the USER_ID field updated with the user_id which updates.
   Solution: Added logic to update the goremal_user_id to the pre_update trigger on the
   goremal block.
2. TGKinderman 04/18/2001
   DEFECT: 60865
   Problem: The GOAEMAL form needs to be updated to display email records according to
   these rules; Preferred Email should be the first entry viewed, then all of the active
   emails (listed in ascending TYPE order) and followed by the inactive emails (also listed
   in ascending TYPE order)
   Solution: Enhanced logic in the order by clause of the goremal block.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1311
	/* <p>
/* </p>
		*/
		public void auditTrail52()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4
1. HCheng 10/04/2001
   DEFECT: 68974
   Problem:  No fields at top of form "GOAEMAL" displaying *CONFIDENTIAL* 
             and *DECEASED*, when displaying info for an ID in GOAEMAL that
             has SPBPERS_DEAD_IND or SPBPERS_CONFID_IND set to "Y".
   Solution: Added logic to update items' display property to on/off to 
             the post_change trigger of ID field in the
             KEY block. In both confidential and deceased indicators' property
             palette, updated canvas attribute from NULL to GOAEMAL_1_CANVAS. 
2. George Shalovka  15 November 2001  GUIALTI Mod
   Add trigger KEY_BLOCK.KEYBLCK_GRTVEMAL_CODE.Key-Dup-Item to call GUIALTI form.
      Modified associated AutoHint text. 
   Modify code in KEY_BLOCK.KEYBLCK_GRTVEMAL_CODE_LBT.When-Button-Pressed
      to display Option List Window and allow call to GUIALTI.  
3. HCheng 12/03/2001
   DEFECT: 61519
   Problem:  Enable and disable of PREFERRED check box is flawed. Once any email
             address is checked as inactive, you can not check any email as 
             preferred without first unchecking at least one inactive box.
   Solution: Added logic to pre-insert and pre-update triggers in block GOREMAL.
             Added new item level trigger WHEN-CHECKBOX-CHANGED in 
             GOREMAL.GOREMAL_PREFERRED_IND to take place of WHEN-VALIDATE-ITEM,
             allow it to check preferred checkbox and set inactive checkbox 
             immediately. Did the similar work for item GOREMAL.GOREMAL_STATUS_IND
             on WHEN-CHECKBOX-CHANGED and WHEN-VALIDATE-ITEM triggers.
4. HCheng 01/10/2002
   DEFECT: 68494
   Problem:  Cannot update a record on GOAEMAL when using OPS$USER with / as 
             username and password to login to Banner.
   Solution: Modified block level trigger GOREMAL.PRE_UPDATE by adding logic to
             handle OPS$ account.

5. HCheng 01/10/2002
   DEFECT: 71009
   Problem: Allow to save the email address with embedded spaces. But this is an
            invalid e-mail address.
   Solution: Added item level trigger GOREMAL.GOREMAL_EMAIL_ADDRESS.WHEN-VALIDATE-ITEM
             to remove all spaces from current email address as needed. And displaying
             a message to remind user that embeded spaces have been removed.             

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1312
	/* <p>
/* </p>
		*/
		public void auditTrail54()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_API
	
	PROCEDURE AUDIT_TRAIL_7_0_API IS 
<multilinecomment> 
AUDIT TRAIL: 7.0.API 
1. Michael Hitrik  11/24/2003 
   Enhancements for 9i UI. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1313
	/* <p>
/* </p>
		*/
		public void auditTrail70Api()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1.  SJQ  11/24/2003 
    Implement modifications to the form to remove the GOREMAL block and reference in a common
    version of this block from GOQOLIB. 
    Over-ridden form level CHECK_TO_SAVE, KEY_NXTBLCK_TRG,KEY_PRVBLCK_TRG triggers from goqclib.

AUDIT TRAIL: 7.2
1.  SJQ  07/28/2005
    Update the CHECK_TO_SAVE trigger to implement the I18N standards.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1314
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
	//ID:1315
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	
	PROCEDURE AUDIT_TRAIL_7_4 IS
<multilinecomment> 
AUDIT TRAIL: 7.4
1.  G Shalovka  15 May 2006
		Resolve defect CMS-DFCT103001.
    Modify form-level trigger CHECK_TO_SAVE to simplify code 
    	and change error message assignment for TranMan 
    	to properly handle string.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1316
	/* <p>
/* </p>
		*/
		public void auditTrail74()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1317
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2_0_1
	
	PROCEDURE AUDIT_TRAIL_8_2_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.2.0.1
1.  LvH 07/15/2009
		Defect 1-66Z8VF
    Modified WHEN-BUTTON-PRESSED for internationalization.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1318
	/* <p>
/* </p>
		*/
		public void auditTrail8201()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOAEMAL
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Aug 18 09:26:45 2009
-- MSGSIGN : #44c108c3c397d9a8
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1319
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
