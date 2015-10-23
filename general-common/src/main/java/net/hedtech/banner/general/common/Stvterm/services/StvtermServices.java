package net.hedtech.banner.general.common.Stvterm.services;

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


import net.hedtech.banner.general.common.Stvterm.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Stvterm.model.*;



public class StvtermServices extends AbstractSupportCodeObject{
	
	
	public StvtermServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public StvtermTask  getTask() {
		return (StvtermTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Stvterm.model.StvtermModel getFormModel() {
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
	//ID:798
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
1. TJH 11/13/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

AUDIT TRAIL: 4.1				ALD 03/26/1999
1. Defect #11071: add When-validate-item trigger under items of term/housing 
   end date in order to have End_date > Start_date.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:799
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
	//ID:800
	/* <p>
		
/* </p>
		*/
		public void auditTrail50Apiconvert()
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
	//ID:801
	/* <p>
		
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE audit_trail_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1. P Lawler 07/15/04
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical 
    Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  null;
END ;
	*/
	//ID:802
	/* <p>
		
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment> 
AUDIT TRAIL: 7.2.0.1
1. Defect 105930                                   JKP  10/14/2005
   Problem: Testing for DateRipper enhancement revealed two 
     issues: 1)Housing End Date can be less than Housing Start 
     Date, 2)Pressing F10 to save without tabbing out of Term 
     Start Date when updating the record can result in 
     FRM-92101: There was a failure in the Form
   Solution: For issue 1) Added When-Validate-Item trigger on
     STVTERM Block STVTERM_HOUSING_START_DATE and STVTERM_
     HOUSING_END_DATE (similar to STVTERM_START_DATE and 
     STVTERM_END_DATE) to verify that the Housing End Date is
     not before the Housing Start Date.
     For issue 2) resubclassed STVTERM_START_DATE, STVTERM_END_
     DATE, STVTERM_HOUSING_START_DATE, STVTERM_HOUSING_END_DATE
     items with G$_DATE_CLASS to bring in the Subclassed Key-Next-
     Item, When-New-Item-Instance, and Post-Text-Item triggers (had
     to delete the non-subclassed version of these triggers first).
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:803
	/* <p>
		
/* </p>
		*/
		public void auditTrail72()
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
	//ID:804
	/* <p>
		
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> 
AUDIT TRAIL: 7.3.3.1
1.  Defect 1-1AXSSU                             CLF  02/19/07
    Problem:   Housing Start Date 'Calendar' iconic Button creeps up as 
        you get lower on the canvas, and encroaches text on lowest record.
    Technical:  On Property Palette, change Distance between rows from 80 to 81 for
        STVTERM_HOUSING_START_DATE_DBT.
        
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:805
	/* <p>
		
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. WG 05/07/07
   Migrate 7.3.3 to 8.0. 
2. WG 07/05/07
   Problem: Multiple UI issues.
   Fix: Made distance between records 68 for text items, 70 for buttons.
        Gave Term code a height of 17 instead of 18.
        Lengthened scrollbar to 374.
        Increased the number of rows displayed to 5.
        Made prompt offset = 15.
3. ES 10/31/07  Defect 1-2YKMTI
   Problem:  'Positions' is spelled incorrectly (postitions)
   Solution: Corrected the spelling of the word in two error messages 
             and a similar misspelling in an audit trail.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  null;
END ;
	*/
	//ID:806
	/* <p>
		
/* </p>
		*/
		public void auditTrail80()
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
	//ID:807
	/* <p>
		
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1 
1. George Shalovka   20 October 2008
   Tracking: 1-42Z4JT
   Resolve reference to form-level trigger When-New-Record-Instance
     for SDE Next Record funcitonality.
   Open, Save, Close, Open and Re-Compile in path of static component library GOQOLIB.
AUDIT TRAIL: 8.2
1. Ruth Kevitch      3 March 2009
   Added STVTERM_FA_SUMMER_IND Indicator. Look for --80200-1 mark mod.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:808
	/* <p>
		
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : STVTERM
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Aug 13 15:49:34 2010
-- MSGSIGN : #c22bb3b631075476
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:809
	/* <p>
		
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2 

1. Ruth Kevitch      3 March 2009
   Added STVTERM_FA_SUMMER_IND Indicator. Look for --80200-1 mark mod.
2. Ran re-key utility tool.   AK 04/14/2009
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:810
	/* <p>
		
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_2
	
	PROCEDURE AUDIT_TRAIL_8_3_0_2 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.2
1. Defect 1-5RHALH                              MB 01/25/2010
   Problem: Unhandled exception errors in STVTERM
   Solution: Removed the exception block in on-error trigger of stvterm block.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:811
	/* <p>
		
/* </p>
		*/
		public void auditTrail8302()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_1
	
	PROCEDURE AUDIT_TRAIL_8_4_1 IS
<multilinecomment>
AUDIT TRAIL: 8.4.1
1. Defect 1-42Z4JT                    MB 08/13/2010
   Problem: When associating SDE with a repeating table the data is only linked to the first record.
   Solution: For the trigger WHEN-NEW-RECORD-INSTANCE at the block level of stvterm made the execution hierarchy as after.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:812
	/* <p>
		
/* </p>
		*/
		public void auditTrail841()
		{
		}

	
	

}
