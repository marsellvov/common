package net.hedtech.banner.general.common.Guainst.services;

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


import net.hedtech.banner.general.common.Guainst.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guainst.model.*;



public class GuainstServices extends AbstractSupportCodeObject{
	
	
	public GuainstServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuainstTask  getTask() {
		return (GuainstTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guainst.model.GuainstModel getFormModel() {
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
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1017
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment> AUDIT TRAIL: 3.0
1. TAM 05/14/97
   Added new value of WNT to operating system indicators to support
   NT platforms.
2. SJQ 06/13/97
   Added new column on screen for job submissing.  It allows the user
   to decide whether to use GURJOBS or HOST commands for jobsubmission
   in character mode.
3. NR 06/18/97
    1. Changed GUBINST_HIGHED_GOVT_IND to required
       (fix required to eliminate blanck line)
    2. Add line :GLOBAL.CURRENT_ITEM := '';
       in key-clrform to insure that GUBINST_2_window
       is broght up with no problem.
4. JC 07/01/97
   Added field for 'Alumni' release information. Added ON-ERROR trigger 
   in GUBINST block.Changed WHEN-WINDOW-ACTIVATED trigger to disable 
   'Show_Whats_Installed' button when GUBINST_2_WINDOW is open.  
5. GS 07/30/97
   Changed 'Installation Control' button size and various boilerplate 
   to correct character mode truncation problem.

AUDIT TRAIL: 3.1.1
1. EPM 04/23/99 Deleted an on-error trigger in the gubinst block
   because if an error occurred it would not display it due to this
   trigger. This corrected defect 10398.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1018
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. JC  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. EPM 02/12/99
   Added functionality so when you left the first canvas to travel
   to the second one, you saved the item you left from so you can 
   return to that specific item.  This had to be done with the 
   form level triggers when-new-item-instance and post-text-item
   and the addition of an item :save_item in the form header block
3. SJQ 03/15/99
   Moved the gubinst_gurjobs_charmode_ind off of the main canvas and not navigable
   since character mode is no longer supported.
4. EPM 6/22/99
   Made the dialog window smaller as well as the canvas on it so that
   the phone number fields could be viewed while the dialog window
   was opened.  
5. SJQ 07/17/99
   Modify the pivot field so that it is display only.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1019
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_1_B2K
	
	PROCEDURE AUDIT_TRAIL_4_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.1
1. Added new column GUBINST_WF_ENABLED_IND. 
   Also, added new alert G$_WF_EXIT_BANNER_ALERT to come
    up if GUBINST_WF_ENABLED_IND is set to 'Y'
 					NMCKINNE 09/18/99
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1020
		public void auditTrail41B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_MANUAL
	
	PROCEDURE AUDIT_TRAIL_5_0_MANUAL IS
<multilinecomment>
AUDIT TRAIL: 5.0 
1. 	Dev 6 Manual Conversion    			NL 09/18/2000
 		Do not modify this program unit.
2.  Message Change Banner2000 to SCT Banner					MS 10/23/2000
    Changed the message from Banner2000 to SCT Banner 
    in G$_WF_EXIT_BANNER_ALERT. 		
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1021
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_2
	
	PROCEDURE AUDIT_TRAIL_4_2 IS
<multilinecomment>
AUDIT TRAIL: 4.2.0.1
1. Defect# 45048					NL 18-SEP-2000
   Problem: Getting Oracle errors on Oracle 8.1.6, because of multiple
	    calls to trigger G$_REVOKE_ACCESS.
   Functional Impact: Users with version 8.1.6 of Oracle will not get
	    error messages.
   Technical Fix: Removed logic that executes trigger G$_REVOKE_ACCESS
	    from POST_FORM_TRG trigger.

AUDIT TRAIL: 4.2.0.2
1. ED Defect# 49918					NL 01-DEC-2000
   Problem: Form aborts and Banner session hangs when NLS_LANG setting
	    is FRENCH.FRANCE. This is a Oracle bug corrected in Developer 6.0.
   Functional Impact: User will be able to open form successfully.
   Technical Fix: Trigger POST_QUERY in GUBINST block has been renamed to
	    POST_QUERY_TRG.	    
AUDIT TRAIL END	    
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1022
		public void auditTrail42()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  SJQ 01/21/2003
    Add support for two new columns added to the GUBINST table.  A new option which controls
    whether or not the sqltrace option on the menu is enabled.  A new option which identifies
    whether or not Banner is message enabled.  Removed the Government and Utilities products
    from the Installation window.  Added Next Block and Previous Block logic to navigate 
    between the windows.

AUDIT TRAIL END	    
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1023
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit DISPLAY_ENABLED_IND_ALERT
	
	PROCEDURE DISPLAY_ENABLED_IND_ALERT (p_msg VARCHAR2) IS
  alert_id     ALERT;
	alert_button NUMBER;
	lv_item_name VARCHAR2(61) := :SYSTEM.TRIGGER_ITEM;
BEGIN
	alert_id := FIND_ALERT('G$_EXIT_BANNER_ALERT');
	SET_ALERT_PROPERTY(alert_id,ALERT_MESSAGE_TEXT,p_msg);
  alert_button := SHOW_ALERT(alert_id);
--
  IF alert_button = ALERT_BUTTON1 THEN
    NULL;
  ELSE
  	IF NAME_IN(lv_item_name) = 'Y' THEN
      COPY('N',lv_item_name);
    ELSE
      COPY('Y',lv_item_name);
    END IF;
  END IF;
END;
	*/
	//ID:1024
		public void displayEnabledIndAlert(NString pMsg)
		{
			AlertDescriptor alertId= null;
			NNumber alertButton= NNumber.getNull();
			NString lvItemName = getTriggerItem();
			alertId = findAlert("G$_EXIT_BANNER_ALERT");
			setAlertMessageText(alertId, pMsg);
			alertButton = toNumber(showAlert(alertId));
			// 
			if ( alertButton.equals(MessageServices.BUTTON1) )
			{
			}
			else {
				if ( getNameIn(lvItemName).equals("Y") )
				{
					copy("N",lvItemName);
				}
				else {
					copy("Y",lvItemName);
				}
			}
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
	//ID:1025
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0 
1. G Shalovka  02/06/2004 
   Add new checkbox form item GUBINST.GUBINST_ONLINE_MATCH_IND
   to support Common Mathcing modifications.
2. TGKinderman 02/17/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner7.0 User Interface
   Technical Methodology for more details.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:1026
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
	//ID:1027
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_5
	
	PROCEDURE AUDIT_TRAIL_7_5 IS
<multilinecomment> 
AUDIT TRAIL: 7.5 
1. LVH  05/10/2007 
   Defect LN70-0165-1738. Change the format of the General product
   checkbox to match the format of the other products.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:1028
		public void auditTrail75()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0 
1. Apply 7.5 modifications to 8.0
2. TGKinderman  10/18/2007
   Add logic in support of column GUBINST_SSN_SEARCH_ENABLED_IND.
3. TGKinderman  10/24/2007
   Add logic in support of column GUBINST_SSN_MAX_LENGTH.
4. George Shalovka  07 January 2008
		Tracking:	1-2CZ9ZY
		Problem:	Form will not automaticaly position cursor 
							to allow data entry in SDE Window.
		Solution: Modify form-level trigger WHEN_WINDOW_ACTIVATED_TRG 
							to handle navigation to SDE Window.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1029
		public void auditTrail80()
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
	//ID:1030
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2 
1. LVH 01-10-2009
   Add House Number, street line 4, and telephone country code
2. LVH 02-28-2009
   Add button to display patch information
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1031
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAINST
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Jun 04 14:26:10 2012
-- MSGSIGN : #7684e404bdc1a83f
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1032
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_2
	
	PROCEDURE AUDIT_TRAIL_8_5_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.5.2
1. Defect 1-ZS5P5L
   LVH 06-04-2012
   Replaced the word 'affect' with 'effect' in multiple messages.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1033
		public void auditTrail852()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment> 
AUDIT TRAIL: 8.6
1. Defect 1-1BDCM84
   LVH 01/25/2013
   Reset the :GLOBAL.FORM_WAS_CALLED in the PATCHES_BTN.WHEN-BUTTON-PRESSED after the call
 
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1034
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>
  Copyright 1997-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1035
		public void copyright()
		{
		}

	
	

}
