package net.hedtech.banner.general.common.Guahelp.services;

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


import net.hedtech.banner.general.common.Guahelp.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guahelp.model.*;



public class GuahelpServices extends AbstractSupportCodeObject{
	
	
	public GuahelpServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuahelpTask  getTask() {
		return (GuahelpTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guahelp.model.GuahelpModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL
	
	PROCEDURE AUDIT_TRAIL IS
<multilinecomment>
AUDIT TRAIL: 2.0                                     INIT    DATE
1. Rewritten for 2.0                                  SRS 06/18/93
2. Capitalize the word BANNER.                        SRS 10/14/93
3. Change trigger FIELDLEVEL to return error          SRS 11/15/93
   message if all_col_comments returns multiple rows.

AUDIT TRAIL: 2.1
1. Forms 4.0 Conversion                                BG 07-08-94

AUDIT TRAIL: 2.1.1 
1. VGA changes. Increased display length of BANNER     TM 03/15/95
   to 11.

AUDIT TRAIL: 2.1.5
1. Add new security logic.                             SQ 09/13/95
2. Change the sequence of the items in the             SQ 10/27/95
display block so that the radio group is not the first
navigable item.  This caused problems on the mac.
3. Conversion to forms 4.5.                            SQ 03/20/96

AUDIT TRAIL: 2.1.11
1. Modifications to support 2 char product             SQ 09/04/96
identifier and 7 or 8 character form names.
2. Make form to be modal in style.                     SQ 10/18/96
3. Change form-level trigger FIELD_HELP to use         TK 01/07/97
   specified owner for "FX" forms in finance;Otherwise
   determine the owner based upon the table name. This
   is relative to the implementation of Archive/Purge
   in bfinance.

AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:349
	/* <p>
/* </p>
		*/
		public void auditTrail()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_OWNER_NAME
	
	FUNCTION SELECT_OWNER_NAME (IN_TABLE VARCHAR2)
RETURN VARCHAR2 IS
X_TEMP VARCHAR2(30);
CURSOR X_CURSOR IS
   SELECT OWNER
     FROM ALL_TABLES
    WHERE TABLE_NAME = IN_TABLE;
BEGIN
   OPEN X_CURSOR;
   FETCH X_CURSOR INTO X_TEMP;
   IF X_CURSOR%NOTFOUND THEN
      RETURN('');
   ELSE
      RETURN(X_TEMP);
   END IF;
RETURN NULL; END;

	*/
	//ID:350
	/* <p>
/* </p>
		* @param inTable
		*/
		public NString selectOwnerName(NString inTable)
		{
			int rowCount = 0;
			NString xTemp= NString.getNull();
			String sqlxCursor = "SELECT OWNER " +
	" FROM ALL_TABLES " +
	" WHERE TABLE_NAME = :P_IN_TABLE ";
			DataCursor xCursor = new DataCursor(sqlxCursor);
			try {
				//Setting query parameters
				xCursor.addParameter("P_IN_TABLE", inTable);
				xCursor.open();
				ResultSet xCursorResults = xCursor.fetchInto();
				if ( xCursorResults != null ) {
					xTemp = xCursorResults.getStr(0);
				}
				if ( xCursor.notFound() )
				{
					return  toStr((("")));
				}
				else {
					return ((xTemp));
				}
				}finally{
					xCursor.close();
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
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:351
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0                                               INIT   DATE
1. Change BANNER to Banner2000.                                 SQ  06/18/97
2. TAM 07/01/97
   Defect-4796. Moved buttons from button_control_block to the
   display_help block and made them navigable so chrmode users
   can use the form. Also had to increase the height of the
   guahelp_window from 9 to 10.
3. SJQ 08/01/97
   Modify to enlarge window for character mode by 2 lines.  Also
   modify to change window to non-modal so menu can be accessed.
   Made the buttons non-navigable again.
4. Key_NxtBlk modificatons to show editor with help or without.  JC 08/15/97
   Modifications of triggers: FORMLEVEL, FIELEVEL, BLOCKLEVEL to
   indicate existing help in HELP_IND check box.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:352
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
2. SJQ 03/24/99
   Modify the logic which launches the editor.  This routine was repositioning the
   window out in space.  Clean up some of the trigger logic.
AUDIT TRAIL: 4.0.3
1. AC 11/30/1999
   Removed VALUE_ERROR exception messages in form level FORM_HELP trigger.  They are not 
   necessary any more.  
AUDIT TRAIL: 4.1
1. KPATKAR 01/21/00
   Corrected the release number to 4.1

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:353
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT TRAIL: 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit.
2. SJQ 11/14/2000
   Change the label text from Banner2000 to SCT Banner.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:354
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2
	
	PROCEDURE AUDIT_TRAIL_5_2 IS
<multilinecomment>
AUDIT TRAIL: 5.2
1. Defect #48346                                     XL 03/12/01
Title:    Spelling error
Problem:  Error spelling of word 'successfully' in the message
          "One Record processed sucessfully"
Solution: In form level trigger form-commit, change word 'sucessfully' into 'successfully'.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:355
	/* <p>
/* </p>
		*/
		public void auditTrail52()
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
	//ID:356
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
1. Michael Hitrik 02/06/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 
   1.1 Set HELP_COMMENT Enabled = Yes
   
AUDIT TRAIL: 7.3
1. TGKinderman 03/06/2006
   Modify HELP_TYPE_RBT1 radio button label per branding modifications.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:357
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
	//ID:358
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
1. George Shalovka  25 August 2006
	Correct defect 96663.
	Problem: Oracle error ORA-06502 occurring on help text that is
						very long or contains special characters.
	Solution:Modify trigger Form.FIELD_HELP to expand size of local variable
						COL_COMMENT from 355 to 4000 to  match database column size.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:359
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
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:360
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
1. Defect # 1-1ADJKV
   ShylajaS  10/16/2007
   Added G$_NLS.Get to support 
   internationalisation requirements. 
   
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:361
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1

1.Harish Suratkal  15 July 2008

  Defect  : 1-3PGX35
	Problem : Screen freezing when accessing 'Dynamic Help Query' on GSASECR 
	Solution: Changed the MODAL property of window GUAHELP_WINDOW to YES.
AUDIT TRAIL END
</multilinecomment>
BEGIN
	NULL;
 
END;
	*/
	//ID:362
	/* <p>
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAHELP
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Dec 05 15:52:10 2012
-- MSGSIGN : #1e5fbe1a82aa8a01
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:363
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment>
AUDIT TRAIL: 8.6
1.Defect 1-1AGHCOB
	LVH 12/05/2012
	Ran re-key for internationalization.
AUDIT TRAIL END
</multilinecomment>
BEGIN
	NULL;
END;
	*/
	//ID:364
	/* <p>
/* </p>
		*/
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>
  Copyright 1993-2012 Ellucian Company L.P. and its affiliates.
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:365
	/* <p>
/* </p>
		*/
		public void copyright()
		{
		}

	
	

}
