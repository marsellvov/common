package net.hedtech.banner.general.common.Guiobjs.services;

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


import net.hedtech.banner.general.common.Guiobjs.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guiobjs.model.*;



public class GuiobjsServices extends AbstractSupportCodeObject{
	
	
	public GuiobjsServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuiobjsTask  getTask() {
		return (GuiobjsTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guiobjs.model.GuiobjsModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
BEGIN
  NULL;
<multilinecomment>
AUDIT TRAIL: 3.0                                            INIT      DATE
1. New form providing object search and execution.           GS     05/27/97
2. SJQ 07/08/97
   Clean up.  Modify for consistency, the up and down record function,
   Remove duplicate triggers, obsolete triggers and syntax errors which
   caused the menu in character mode to not work, add more friendly 
   warning message when on last record.
AUDIT TRAIL: 3.1
1. SJQ 11/11/97
   Drop and reattach library in uppercase.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:316
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
	//ID:317
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
BEGIN
  NULL;
<multilinecomment>
AUDIT TRAIL: 4.0
1. EPM 6/2/98
   In the pre_form_trg added code to make sure the "menu" option on the pull down list
   was not deleted when guiobjs was being called from guaparm.  Also removed the obsolete 
   procedures G$_SET_TOOLBAR and G$_SET_TOOLBAR_GLOBALS in the call_routine trigger.  
2. EPM 6/3/99
   Code added to call_routine trigger that checks to make sure the user does not
   try and run GUAGMNU and GUAINIT.
3. SJQ 07/13/99
   Remove obsolete references to character mode and removed unused triggers.
AUDIT TRAIL: 4.0.1
1. AC 11/05/1999
   Modified the WHEN-MOUSE-DOUBLECLICK triggers on the GUBOBJS_DESC and GUBOBJS_NAME
   items.  This fixes when you double click on these items you get a FRM-40738:  Agrument 
   1 to builtin CALL_FORM cannot be null error.  Added code when the items where null
   to return, and not give you the error.  Fixed defect 14548.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:318
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. TGKinderman 06/06/2000
   Removed G$_OPT_WINDOW.
2.  Message Change Banner2000 to SCT Banner					MS 10/23/2000
    Changed the message from Banner2000 to SCT Banner 
    in CALL_ROUTINE Trigger.   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:319
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4
1. GShalovka 03 December 2001  
   Add code to handle new block on GUAUPRF form to 
   Form Level triggers Pre_Form_Trg and Key-ExeQry. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:320
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
	//ID:321
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
2. TGKinderman 02/17/2004
   Increased the width of the Name and Description fields (resized window/canvas and x,y accordingly)
   to display more data of these text items.  Set the MAIN_WINDOW closable property to TRUE.

AUDIT TRAIL: 7.2
1.  SJQ 06/02/2005
    Update the button logic at form start up so that the start button is disabled.  Update the
    button logic so that when a query is canceled or cleared that the start button is disabled.
    Update the button logic so that when a query is canceled that the record status is reset
    to query and not new.  That was causing the exit form logic to think that a record had been
    created and needed to be saved.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:322
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
	//ID:323
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
	//ID:324
		public void auditTrail80I18n()
		{
		}

	
	

}
