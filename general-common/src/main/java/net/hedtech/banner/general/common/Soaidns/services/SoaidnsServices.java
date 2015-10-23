package net.hedtech.banner.general.common.Soaidns.services;

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


import net.hedtech.banner.general.common.Soaidns.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Soqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaidns.model.*;



public class SoaidnsServices extends AbstractSupportCodeObject{
	
	
	public SoaidnsServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SoaidnsTask  getTask() {
		return (SoaidnsTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Soaidns.model.SoaidnsModel getFormModel() {
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
2. Set Menu Module to GUMEVAL.                           TI 06/20/97
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1167
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
1. CLF   07/22/98
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
	//ID:1168
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
	//ID:1169
	/* <p>
		
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2_B2K
	
	PROCEDURE AUDIT_TRAIL_5_2_B2K IS
<multilinecomment>
AUDIT TRAIL: 5.2
1. Defect 47240                                        MW  02/09/2001
   Problem: The SOAIDNS form is not displaying the correct phone number
      in the section of the screen that displays address information.
      The code is selecting the first phone number it can find for an
      address, rather than displaying the primary phone number, which
      is how SPAIDEN works.

      SOAIDNS should select phone data the same way that SPAIDEN does.
   Technical Fix: Modified the POST-QUERY trigger in the SPRADDR block
      to use the primary indicator in the select statement.
      
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1170
	/* <p>
		
/* </p>
		*/
		public void auditTrail52B2k()
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
	//ID:1171
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
1. P Lawler 05/26/04
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical 
    Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL ;
END;
	*/
	//ID:1172
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
	//ID:1173
	/* <p>
		
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> 
AUDIT TRAIL: 7.3 Conc. Curr. 
1. Don Amyx  12FEB2006 
This will show the curriculum summary for the learner module with an effective based on the 
registration term displayed.  Most of the spec as described was dependent on the form having 
a key block.  This form does not, and the population of the sovlcur, sovlfos will happen 
when the person' sgbstdn record is queried.

2. Don Amyx 06MAR2006 Defect CMS-DFCT104372
Problem:Tthe sort order of records in the Address Details block of SOAIDNS should be the same 
as they display in the Address Tab of SPAIDEN.  
Resolution: Copied the code from the SPAIDEN address SPRADDR block Property Palette's
Order By Section:
decode(spraddr_status_ind, 'I',-2, decode(to_number(to_char(nvl(spraddr_to_date,
GREATEST(nvl(spraddr_from_date+1,sysdate+1),sysdate+1)),'J')) - to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')),0,1, 
        (to_number(to_char(nvl(spraddr_to_date,
GREATEST(nvl(spraddr_from_date+1,sysdate+1),sysdate+1)),'J')) - to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')))) / 
             decode(abs(to_number(to_char(nvl(spraddr_to_date,
GREATEST(nvl(spraddr_from_date+1,sysdate+1),sysdate+1)),'J')) - to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J'))),0,1, 
            (abs(to_number(to_char(nvl(spraddr_to_date,
GREATEST(nvl(spraddr_from_date+1,sysdate+1),sysdate+1)),'J')) - to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')))))) * (decode(to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')) - 
             to_number(to_char(nvl(spraddr_from_date,sysdate-1),'J')),0,1, (to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')) - 
             to_number(to_char(nvl(spraddr_from_date,sysdate-1),'J')))) / 
             decode(abs(to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')) - 
             to_number(to_char(nvl(spraddr_from_date,sysdate-1),'J'))),0,1, 
             (abs(to_number(to_char(
GREATEST(nvl(spraddr_from_date,sysdate),sysdate),'J')) - 
         to_number(to_char(nvl(spraddr_from_date,sysdate-1),'J')))))) 
         desc, spraddr_atyp_code, spraddr_to_date desc, spraddr_from_date desc, spraddr_seqno
3. Don Amyx 06MAR2006 Defect CMS-DFCT105105
Problem: When SPAIDEN called SOAIDNS (Advanced Form) to select an ID to be returned to
SPAIDEN to be looked populate the Keyblock ID Feild the selection of the ID from A-SOAIDNS
failed to process the request.
Resolution: In the trigger, CALL_SPAIDEN, located at the FORM level changed the following line 
of code from: :GLOBAL.VALUE := :SPRIDEN.SPRIDEN_ID ; 
to: :GLOBAL.KEY_IDNO := :SPRIDEN.SPRIDEN_ID. 	

AUDIT TRAIL: 7.3.0.1
1.	Defect 1-HQ6OT							CLF  06/12/06
		Problem:  Under certain conditions you may not be able to perform a next-block from the 
			Registration Terms block to the Curricula Summary block.
		Fix:  If the SFBETRM_TERM_CODE is null the cursor goes back to the ID/Name block.  It
			should go to Curriculum block if there is curriculum data
		Technical:  In SFBETRM block level trogger KEY-NXTBLK, change
			IF :SFBETRM_TERM_CODE IS NULL THEN 
				to
			IF :sovlcur_prioroty_no IS NULL THEN 

AUDIT TRAIL: 7.3.2
Recompile for new soqolib to correct class on when new block trigger on the sovlcur block.
                  
AUDIT TRAIL END 
</multilinecomment>
BEGIN
NULL;  
END;
	*/
	//ID:1176
	/* <p>
		
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
BEGIN
  NULL;
<multilinecomment> AUDIT TRAIL: 8.0 
1.  Migrate 7.3.2 changes to 8.0   MAH 12/14/06
2.  ISC Defect 1-1ADDBT                   PK  10/15/2007
    Added the missing G$_NLS.Get to the message, Refer
    Siebel for more information.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:1177
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
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1178
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
	//ID:1179
	/* <p>
		
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.1  
1. mah 5/27/08 
  Recompile for new library soqolib, and changes to the curriculum summary
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
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SOAIDNS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Sep 01 12:17:43 2009
-- MSGSIGN : #ec5811d4bc3f920c
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1181
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
1. ST  04/09/2009
   Ran Re-Key utility for this form
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
null;
END;
	*/
	//ID:1182
	/* <p>
		
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
BEGIN
 
<multilinecomment> 
AUDIT TRAIL: 8.3  
1. Study Paths MAH 8/18/09 
  execute new learner summary trigger in when new form instance trigger that displays 
  the study path name if study paths is enabled. 

 
AUDIT TRAIL END
</multilinecomment> 
 
  NULL; 
END;
	*/
	//ID:1183
	/* <p>
		
/* </p>
		*/
		public void auditTrail83()
		{
			// AUDIT TRAIL: 8.3
			// 1. Study Paths MAH 8/18/09
			// execute new learner summary trigger in when new form instance trigger that displays
			// the study path name if study paths is enabled.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_6
	
	PROCEDURE AUDIT_TRAIL_8_5_6 IS
BEGIN
<multilinecomment> AUDIT TRAIL: 8.5.6                             AS 11/19/2012
 1.Defect 1-Z507V5
   Problem:Once on SOAIDNS,  the third icon from the left  ("Select") is grayed  out.
   Solution: Modified When-New-Form-Instance trigger to enable the select icon. 
AUDIT TRAIL END
</multilinecomment> 
 
  NULL; 
END;
	*/
	//ID:1184
	/* <p>
		
/* </p>
		*/
		public void auditTrail856()
		{
			//  AUDIT TRAIL: 8.5.6                             AS 11/19/2012
			// 1.Defect 1-Z507V5
			// Problem:Once on SOAIDNS,  the third icon from the left  ("Select") is grayed  out.
			// Solution: Modified When-New-Form-Instance trigger to enable the select icon.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 1994-2012 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:1185
	/* <p>
		
/* </p>
		*/
		public void copyright()
		{
		}

	
	

}
