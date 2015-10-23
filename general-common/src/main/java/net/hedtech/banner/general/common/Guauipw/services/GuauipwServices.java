package net.hedtech.banner.general.common.Guauipw.services;

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


import net.hedtech.banner.general.common.Guauipw.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guauipw.model.*;



public class GuauipwServices extends AbstractSupportCodeObject{
	
	
	public GuauipwServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuauipwTask  getTask() {
		return (GuauipwTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guauipw.model.GuauipwModel getFormModel() {
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
2. Fix unit testing problems.                            AP 06/11/97
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:296
		public void auditTrail30B2k()
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
	//ID:297
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
	//ID:298
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  TGKinderman 06/06/2000
    Changed declaration of pos variable from varchar2 to number so as to match
    the usage within the body of the package POSITION_UP and procedure TOOL_BTN.
    Changed the first go_item in the when-button-pressed on DISP_CALL_BTN from
    DATE_TIME_CB to FORMNAME_CB such that canvas comes into focus when trying to
    navigate back to the first window.
2.  GShalovka  07 July 2000
    Change GOQRPLS library attachment from lower to upper case.   
3.  SJQ 08/25/2000
    Removed all of the WIN_API routines which are duplicated in the GOQRPLS
    library.  Changed all calls to the G$_WIN_API routines to use the WIN_API
    routines.  Removed SIZE_RG and FONTS_RG since these were not used.
4.  TGKinderman 09/28/2000
    Removed local pl/sql unit package and spec G$_DRAG_DROP.  Was causing 
    when-mouse-enter failure when form was first accessed and custom buttons were
    moused over.  Package and spec were redundant in that they were also in attached
    library goqgmnu.
5.  SJQ 10/13/2000
    Changed all occurrences of Banner2000 to SCT Banner.
6.  FHL 10/16/2000
    Modified GURUPRF block to allow specification of data extract directory.
7.  GShalovka  09 November 2000
    Add DISPLAY_OPTIONS.GURTPRF_FORMNAME_DISPLAY_IND to allow specification 
    of 7/8-character form name appended to menu item display in Menu Bar Options,
    Navigation Frame, both, or neither.
8.  TGKinderman 11/14/2000
    TOOLTIP_TEXT Changes: 1)Modified the custom_button items visual attribute from
    DEFAULT to G$_NVA_BUTTON_ITEM. 2)Added line to set TOOLTIP_TEXT for the items
    in block CUSTOM_BUTTONS in the local procedure IO.SET_BTN 
9.  NLopez 12/07/2000
    Enabled access on web by modifiying PRE_FORM_TRG.
    Additional logic included in WHEN-BUTTON-PRESSED trigger of TBAR_CALL_BTN so the 
    Customize Toolbar option is diabled on the web.
    Removed RECORD_COUNT item from Directory Options canvas.    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:299
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4
1.  HCheng 12/28/2001
    Defect #37037
    Problem: The verify button shouldn't validate an OPS$ account.
    Solution:Added logic in form level KEY-COMMIT to not allow OPS$ 
             accounts.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:300
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
	//ID:301
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 02/17/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner7.0 User Interface
   Technical Methodology for more details.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:302
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
	//ID:303
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
	//ID:304
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. TGKinderman 04/03/2009
   Modify property of CURRENT_VALUES.CURR_ALT_PASSWORD from UPPER to mixed such that the proper case can be entered; if needed.
   In the KEY-COMMIT (where the validation passes off to GUQINTF) modify to look at global variable GLOBAL.FORMS_USERNAME_CASESENSI.
   If global is '1' then pass as is (as mixed case; just as entered in the field) otherwise pass as upper.  This is in support of
   the optional case sensitive password feature within Database 11g.
   
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:305
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAUIPW
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Apr 09 11:23:59 2009
-- MSGSIGN : #8128bdb4cd1f6456
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:306
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
