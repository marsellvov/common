package net.hedtech.banner.finance.common.Frigrnt.services;

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


import net.hedtech.banner.finance.common.Frigrnt.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Frigrnt.model.*;



public class FrigrntServices extends AbstractSupportCodeObject{
	
	
	public FrigrntServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FrigrntTask  getTask() {
		return (FrigrntTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Frigrnt.model.FrigrntModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1_B2K
	
	PROCEDURE AUDIT_TRAIL_3_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.1                                        
1. New form for the Grant Module.
   SIGNOFF...Eric Tarantul  07-11-97
 
AUDIT TRAIL END </multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:637
	/* <p>
/* </p>
		*/
		public void auditTrail31B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SRILAKSHMI BAISETTY       16-NOV-1998
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. Tom Mack	1/27/99
   Phase II UI Changes
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:638
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
	//ID:639
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0

1. Defect ......... #None
   Signoff......... Mario Ceron 12/02/2003
   Problem......... A test link was left in the Options left bar menu
   Fix............. The link was deleted directly from database on table GUROPTM

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:640
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
	//ID:641
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
1. Gladys Rocher 07/14/2004
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 

2. Defect 70-0125, LN 09-Aug-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for Agency item.
   Technical Fix:
     Modified trigger FRBGRNT.POST-QUERY to call g$_sel_spriden_id_name.
3. HAnderson 09/07/2004
   Remove frbgrnt block's on-error trigger 

AUDIT TRAIL END 
</multilinecomment> 
 
BEGIN 
  NULL; 
END;
	*/
	//ID:642
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
	//ID:643
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment> 
AUDIT TRAIL: 7.2
1. Defect....1-6XF5K    HANDERSO    02/14/2006
   Problem...The ability to query on Agency Name has been lost.
   Fix.......Remove g$_name_class for Agency Name to allow query.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:644
	/* <p>
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS

  <multilinecomment> 
AUDIT TRAIL: 7.3
1. Defect....CMS-DFCT82806    MYTHILIN    07/24/2006
   Problem...Error 'Principle Investigator ID is invalid.' pops up while trying to query the records using PI  ID.
   Fix.......The datablock property of FRBGRNT was changed to include a WHERE clause which fetches only those records 
            that have an entry for the PI Id in SPRIDEN with change indicator 'NULL'.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;
	*/
	//ID:645
	/* <p>
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_0_1
	
	PROCEDURE AUDIT_TRAIL_7_3_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.3.0.1
1. Defect....1-1MSUAP    Anandhi Pitchai Jan-25-2006
   Problem...Unable to query on grants which have no PI
   Fix.......The fix added for CMS-DFCT82806 makes it unable to query on grants 
             with no PI. Remove the logic added to FRBGRNT block property where clause.
             Data issue could be a reason for CMS-DFCT82806.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;
	*/
	//ID:646
	/* <p>
/* </p>
		*/
		public void auditTrail7301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIl_8_0 IS
BEGIN
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Migrate from 7.x to 8.0
AUDIT TRAIL END 
</multilinecomment> 
  NULL;
END;
	*/
	//ID:647
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
			// AUDIT TRAIL: 8.0
			// 1. Migrate from 7.x to 8.0
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the currency fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
2. Sivanath Peddakotla 08/09/2007
   Manual changes to 8.0 forms. Adjusted spacing of resized fields.
3. Signoff....Sivanath Peddakotla 11/16/2007
   Defect.... 1-30U1W2
   Problem.....FRIGRNT   Post Query trigger error.
   Fix.........The LastName field's Maximum length value  is set to Database length.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:648
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIl_8_4 IS
BEGIN
<multilinecomment> 
AUDIT TRAIL: 8.4
1. Defect........1-1A1JGI
   Signoff.......Maneesh Mohan  08-Sep-2009
   Issue.........1 or 2 letter abbreviations are not translatable and probably used in logic.
   Fix...........Added non database text item "FRBGRNT_STATUS_DESC" and database item "FRBGRNT_ALTERNATE_STATUS_DESC" in block FRBGRNT for displaying 
                 status code description and added code in trigger POST-QUERY of block "FRBGRNT". Item FORM_HEADER.QUERY_STATUS_DESC is added;
                 triggers FRBGRNT.PRE-QUERY AND FRBGRNT.POST-QUERY are modified.
AUDIT TRAIL END 
</multilinecomment> 
  NULL;
END;
	*/
	//ID:649
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
			// AUDIT TRAIL: 8.4
			// 1. Defect........1-1A1JGI
			// Signoff.......Maneesh Mohan  08-Sep-2009
			// Issue.........1 or 2 letter abbreviations are not translatable and probably used in logic.
			// Fix...........Added non database text item "FRBGRNT_STATUS_DESC" and database item "FRBGRNT_ALTERNATE_STATUS_DESC" in block FRBGRNT for displaying
			// status code description and added code in trigger POST-QUERY of block "FRBGRNT". Item FORM_HEADER.QUERY_STATUS_DESC is added;
			// triggers FRBGRNT.PRE-QUERY AND FRBGRNT.POST-QUERY are modified.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FRIGRNT
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Oct 01 17:32:22 2009
-- MSGSIGN : #ff86adba7b722f1f
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:650
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
