package net.hedtech.banner.finance.common.Foqaddr.services;

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


import net.hedtech.banner.finance.common.Foqaddr.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqaddr.model.*;



public class FoqaddrServices extends AbstractSupportCodeObject{
	
	
	public FoqaddrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FoqaddrTask  getTask() {
		return (FoqaddrTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Foqaddr.model.FoqaddrModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_9
	
	PROCEDURE AUDIT_TRAIL_8_9 IS
<multilinecomment> 
AUDIT TRAIL: 8.9
1. Defect....1-1FBZVCL
   Signoff...Babu Dominic  27-JUN-2013
   Problem...FOQADDR after access does not subtract from the number
             of open forms (maximum from GUAINST).
   Fix.......Modified the form level trigger PRE_FORM_TRG to delete
             the extra call to the trigger G$_VERIFY_ACCESS, which
             increments the global counter GLOBAL.CURR_NO_FORMS of
             currently open forms. This trigger has been called by
             the G$_GOQOLIB_PP_TRIGGER.PRE_FORM procedure in the 
             standard pre-form trigger already.

AUDIT TRAIL END
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1179
	/* <p>
/* </p>
		*/
		public void auditTrail89()
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
	//ID:1180
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
1. Robert Rullo 9/21/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. Scott Freeman 1/28/99
   Phase II UI Changes
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1181
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Pat Lawler  01/28/98
   Defect 9863.  Changed form level key-exit trigger to reset
global.seqno to null when leaving the form without selecting a
record.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1182
	/* <p>
/* </p>
		*/
		public void auditTrail40()
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
	//ID:1183
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
	//ID:1184
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
1. Lakshmi Radhakrishnan 9-FEB-2004
  Application of enhanced UI methodology. Please refer to the SCT Banner 7.0 User
  Interface Technical Methodology for more details.
  
2. Removed insert and update property from SPRADDR block since this is a query form. 
   This will result in the form not appearing in a cast report for links to the spraddr table.

3. Defect 70-0125, LN 22-Jul-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for key block ID.  
   Technical Fix:
     Modified trigger LOAD_FORM_HEADER to call g$_sel_spriden_id_name.

4. Ruth Perez   08/13/2004
   Application of enhanced UI methodology. Please refer to the SCT Banner 7.0 User Interface Technical Methodology for more details.

AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1185
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1
	
	PROCEDURE AUDIT_TRAIL_7_1 IS
<multilinecomment>AUDIT TRAIL: 7.1
1. Raji Venkatesan
   Problem - The address type LOV is enabled all the time. 
   Fix - THe Address type LOV will be enabled when user does an Enter Query.  Triggers KEY-ENTQRY and 
         KEY-EXEQRY are added for this.
AUDIT TRAIL END  
 </multilinecomment> 
BEGIN
  null;
END;
	*/
	//ID:1186
	/* <p>
/* </p>
		*/
		public void auditTrail71()
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
	//ID:1187
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 1997-2013 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
NULL;
END;


	*/
	//ID:1188
	/* <p>
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_0_1
	
	PROCEDURE AUDIT_TRAIL_7_3_0_1 IS
<multilinecomment>AUDIT TRAIL: 7.3.0.1
1. LvH   06/20/2007  Defect CMS-DFCT106047
   Problem - The address type and sequence number was not being returned when a double click was issued. 
   Fix - The KEY-NXTKEY trigger was modified to load the GLOBAL.VALUE and GLOBAL.SEQNO. 
AUDIT TRAIL END  
 </multilinecomment> 
BEGIN
  null;
END;
	*/
	//ID:1189
	/* <p>
/* </p>
		*/
		public void auditTrail7301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>AUDIT TRAIL: 8.0
1. Apply 7.3.0.1 modifications to 8.0.

AUDIT TRAIL END  
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1190
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
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
2. Sivanath Peddakotla 08/22/2007
   Manual changes to 8.0. Adjusted spacing of resized fields.
3. Signoff.... Sivanath Peddakotla 02/11/2008
   Defect#.... 1-3D9ML9
   Problem.... 8.0 internal - modify FOQADDR to increase display space for Street line 1, 2, & 3
   Fix........ The Width of address fields are increased. The G$_CHAR_FIELD class property is added to display tool tip.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1191
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/29/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1192
	/* <p>
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
BEGIN
  NULL;
END;
<multilinecomment>
AUDIT TRAIL: 8.3                                
1. Lan Nguyen 03/31/2009
   RPE# 1-4US9HN - Expose I8N Fields.
   Items SPRADDR_HOUSE_NUMBER and SPRADDR_STREET_LINE4 are added. 
AUDIT TRAIL END
</multilinecomment>

	*/
	//ID:1193
	/* <p>
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FOQADDR
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Jun 27 16:06:41 2013
-- MSGSIGN : #da39477e47df64af
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1194
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
