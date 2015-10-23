package net.hedtech.banner.finance.common.Frikgnt.services;

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


import net.hedtech.banner.finance.common.Frikgnt.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Frikgnt.model.*;



public class FrikgntServices extends AbstractSupportCodeObject{
	
	
	public FrikgntServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FrikgntTask  getTask() {
		return (FrikgntTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Frikgnt.model.FrikgntModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1_B2K
	
	PROCEDURE AUDIT_TRAIL_3_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.1                                        
1. New form for the Grant Module.
   SIGNOFF...Eric Tarantul  08-11-97

AUDIT TRAIL END </multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:649
	/* <p>
/* </p>
		*/
		public void auditTrail31B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
1. AUDIT TRAIL: 4.0
   DEFECT# : NONE (Tested before UI Changes and found the problem).
   SIGNOFF : SRILAKSHMI BAISETTY      03-SEP-1998.
   Problem : When you go to the next block PROP CODE BTN was disabled.
   Fix     : Commented CHECK_BUTTONS trigger. Modified WHEN-NEW-BLOCK-INSTANCE 
             trigger,ENABLE_KEYS and DISABLE_KEYS triggers at form level.
 AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:650
	/* <p>
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SRILAKSHMI BAISETTY    16-NOV-1998
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. Tom Mack	1/28/99
   Phase II UI Changes
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:651
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
	//ID:652
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
1.Defect........None
  Signoff.......Tatyana Ispas  08/07/2000
  Problem.......The Grant item is not long enought to fit value like G00000012 and so on.
  Fix...........Extended  Grant item in layout editor.
AUDIT TRAIL END
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:653
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
	//ID:654
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
1. Ruth Perez   07/14/2004
   Application of enhanced UI methodology. Please refer to the SCT Banner 7.0 User Interface Technical Methodology for more details.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:655
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
	//ID:656
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
	//ID:657
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
	//ID:658
	/* <p>
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	

}
