package net.hedtech.banner.general.common.Stvmajr.services;

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


import net.hedtech.banner.general.common.Stvmajr.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Stvmajr.model.*;



public class StvmajrServices extends AbstractSupportCodeObject{
	
	
	public StvmajrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public StvmajrTask  getTask() {
		return (StvmajrTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Stvmajr.model.StvmajrModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_1
	
	PROCEDURE AUDIT_TRAIL_8_4_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.4.1 SDE 
1. Defect :1-3Q8VZN
   Sign off: Shalini Jha   12-Aug-2010
   Modified form-level trigger WHEN_WINDOW_ACTIVATED_TRG
   to handle navigation to SDE window. 
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
		public void auditTrail841()
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
	//ID:639
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
1. TJH 08/10/98
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
	//ID:640
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
	//ID:641
	/* <p>
		
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment> 
AUDIT TRAIL: 5.4.2
1. SEVIS RPE                          CLF  08/08/02
   Add SEVIS Equiv field to form
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:642
	/* <p>
		
/* </p>
		*/
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
	//ID:643
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
1. P Lawler 06/10/04
   Application of enhanced UI methodology.  
   Please refer to the SCT Banner 7.0 User Interface Technical 
    Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL ;
END;
	*/
	//ID:644
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
	//ID:645
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
	//ID:646
	/* <p>
		
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : STVMAJR
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Aug 12 13:04:45 2010
-- MSGSIGN : #7b248e272c8ca9b0
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:647
	/* <p>
		
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
