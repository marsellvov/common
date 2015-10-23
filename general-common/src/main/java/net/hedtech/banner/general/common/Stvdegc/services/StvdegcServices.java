package net.hedtech.banner.general.common.Stvdegc.services;

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


import net.hedtech.banner.general.common.Stvdegc.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Stvdegc.model.*;



public class StvdegcServices extends AbstractSupportCodeObject{
	
	
	public StvdegcServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public StvdegcTask  getTask() {
		return (StvdegcTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Stvdegc.model.StvdegcModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
BEGIN
  <multilinecomment>
AUDIT TRAIL: 2.1
1. Modified for Forms 4.0.                      PL 04/20/94


AUDIT TRAIL: 2.1.1
1. VGA conversion.                              VB   03/16/95
2. Updates for MAC and CHAR mode.               CE 04/25/95
AUDIT TRAIL: 2.1.5
1. Implement role-based security.               CE 08/24/95
AUDIT TRAIL: 2.1.8
1. Remove default date from Activity Date field and create
   ON-UPDATE trigger to prevent updating of STVDEGC_CODE
   field in database.                           AK  12/27/95   
AUDIT TRAIL: 2.1.10
1. Added Web display indicator.                 CE 04/02/96

AUDIT TRAIL: 2.1.11
1. Convert to forms 4.5.                        JL 08/26/96

AUDIT TRAIL: 2.1.20
 1.Defect 5690 Web indicator not updated.       
   Add STVDEGC_DISP_WEB_IND =: STVDEGC_DISP_WEB_IND
   to ON UPDATE Trigger.                        DDM 02/11/97

AUDIT TRAIL END
</multilinecomment>
NULL;
END;
	*/
	//ID:675
	/* <p>
		
/* </p>
		*/
		public void auditTrail21()
		{
			// AUDIT TRAIL: 2.1
			// 1. Modified for Forms 4.0.                      PL 04/20/94
			// AUDIT TRAIL: 2.1.1
			// 1. VGA conversion.                              VB   03/16/95
			// 2. Updates for MAC and CHAR mode.               CE 04/25/95
			// AUDIT TRAIL: 2.1.5
			// 1. Implement role-based security.               CE 08/24/95
			// AUDIT TRAIL: 2.1.8
			// 1. Remove default date from Activity Date field and create
			// ON-UPDATE trigger to prevent updating of STVDEGC_CODE
			// field in database.                           AK  12/27/95
			// AUDIT TRAIL: 2.1.10
			// 1. Added Web display indicator.                 CE 04/02/96
			// AUDIT TRAIL: 2.1.11
			// 1. Convert to forms 4.5.                        JL 08/26/96
			// AUDIT TRAIL: 2.1.20
			// 1.Defect 5690 Web indicator not updated.
			// Add STVDEGC_DISP_WEB_IND =: STVDEGC_DISP_WEB_IND
			// to ON UPDATE Trigger.                        DDM 02/11/97
			// AUDIT TRAIL END
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

2. Defect ..... 7198                                     AT  08/06/97
   Problem .... LOV "Degree Award Category Code Validation Form"
                does not display form name. 
   Fix ........ STVACAT form name added to STVACAT_LOV title.

3. Defect ..... 6969                                     AT  08/12/97
   Problem .... The list of values from the CAT field has
                the incorrect fonts (unable to read).
   Fix ........ STVACAT_LOV default Visual Attribute Name
                replaced by G$_NVA_LOV. 

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:676
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
1. PS  07/09/98
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
	//ID:677
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
	//ID:678
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
	//ID:679
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
1. P Lawler 06/09/04
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical 
    Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  null ;
END;
	*/
	//ID:680
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
	//ID:681
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
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:682
	/* <p>
		
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1_0_1
	
	PROCEDURE AUDIT_TRAIL_8_1_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1.0.1
1. George Shalovka   05 November 2008
   Tracking: 1-46509B
   Resolve reference to form-level trigger When-New-Record-Instance
     for SDE Next Record funcitonality.
   Open, Save, Close, Open and Re-Compile in path of static component library GOQOLIB.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:683
	/* <p>
		
/* </p>
		*/
		public void auditTrail8101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_1
	
	PROCEDURE AUDIT_TRAIL_8_3_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.1
1. Defect 1-8BE50B                                                 MB 12/15/2009
   Ran Rekey 2.2

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:684
	/* <p>
		
/* </p>
		*/
		public void auditTrail8301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : STVDEGC
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Jan 20 15:03:42 2010
-- MSGSIGN : #7fc0fc72c0b3cddb
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:685
	/* <p>
		
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. Ran rekey 2.2                        MB 01/20/2010

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:686
	/* <p>
		
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	

}
