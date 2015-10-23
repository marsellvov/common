package net.hedtech.banner.general.common.Soaddrq.services;

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


import net.hedtech.banner.general.common.Soaddrq.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaddrq.model.*;



public class SoaddrqServices extends AbstractSupportCodeObject{
	
	
	public SoaddrqServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SoaddrqTask  getTask() {
		return (SoaddrqTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Soaddrq.model.SoaddrqModel getFormModel() {
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
2. Set Menu Module to GUMAPPL.
3. Changed Visual attribuite on SPRADDR_STATUS_IND to
   G$_NVA_CHECK_BOX.                                     TI 01/18/97
4. Removed all objects referenced from SOQOLIB. 
AUDIT TRAIL: 3.0.0.1                                     DM 09/25/97
1. Added GLOBAL.address_seqn to send the seq number
   back to SFARQST 	TO UPDATE THE ADDRESS.
2. Added an update to :GLOBAL.address_seqn in the
   spraddr.when-new-record-instance. 

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

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1_B2K
	
	PROCEDURE AUDIT_TRAIL_3_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.1                                        INIT   DATE
1. Updated current release to 3.1                      DDM   04/16/1998
2. Defect 7501 added G$_SET_INST_PROPERTY t0           DDM   04/16/1998
   when window activated.

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
		public void auditTrail31B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. CLF   07/10/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. CLF  07/07/99
   Defect #13043
   Problem:  Unable to access Non-person IDs
   Fix:  Change Autohint message in key_block.ID field to say
       COUNT HITS instead of COUNT QUERY HITS

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
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT TRAIL: 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
AUDIT TRAIL END
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

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. Defect 52783																	CLF  12/14/00
   Problem: When called from another form Navigation Frame options do not work
     except that they do work if calledd from SPAIDEN or SPRIDEN
   Fix: Should not work when SOADDRQ is called from SPAIDEN or SPRIDEN and work
      for all others
   Technical: Commented out code in fom level trigger GOTO_FORM and disabled
      appropriate Navigation Frame option in KEY_BLOCK.POST-BLOCK trigger
      
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:1184
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
	//ID:1185
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
1. GS 02-18-2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 

2. Defect 46844   WG  6/29/04
   Problem:  doubleclick does not bring up LOV but F9 does.
   Fix:  Added WHEN-MOUSE-DOUBLECLICK trigger and Button for SPRADDR_ATYP_CODE.
         Added WHEN-MOUSE-DOUBLECLICK trigger and Button for SPRADDR_ASRC_CODE.
         Added KEY-ENTQRY and KEY-EXEQRY triggers and line to WNFI trigger.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1186
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
	//ID:1187
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
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1188
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
	//ID:1189
	/* <p>
		
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.2
1. Ravindra G  11/17/2008
   I18N Changes.
   Added House number and Street line 4 to the form.
   Added SPRADDR_HOUSE_NUMBER and SPRADDR_STREET_LINE4 to the block spraddr.
   Added subclass 'G$_CHAR_FIELD_CLASS' to the above 2 fields.
2. Ran the re-key utility tool.                                AK 04/14/2009   
      
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
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SOADDRQ
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Apr 14 14:42:18 2009
-- MSGSIGN : #3908b428cb5380c2
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1191
	/* <p>
		
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
