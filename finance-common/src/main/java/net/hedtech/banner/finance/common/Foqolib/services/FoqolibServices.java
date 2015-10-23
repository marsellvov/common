package net.hedtech.banner.finance.common.Foqolib.services;

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

import net.hedtech.banner.finance.common.Foqolib.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqolib.model.*;



public class FoqolibServices extends AbstractSupportCodeObject{
	
	
	public FoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FoqolibTaskPart  getTask() {
		return (FoqolibTaskPart )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Foqolib.model.FoqolibModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS

<multilinecomment>
Audit Trail: 3.0
1) Defect#....4987
   Signoff....Anand Mouny  12/12/1996
   Problem....FTVEVNT_LOV has Auto-Confirm property turned "ON". Clients did not want to see LOV being populated
              automatically(without LOV showing up) when the record group retrieves only one record.
   Fix........Turned "Auto-Confirm" property "OFF" on FTVEVNT_LOV.
Audit Trail End

2. Defect.....None
   Signoff....Michael Hitrik 03/10/97
   Problem....Year 2000 - Full Complience
</multilinecomment>

BEGIN
  null;
END;
	*/
	//ID:1002
	/* <p>
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>
   AUDIT TRAIL: 3.1
 
1. SIGNOFF..Lakshmi Radhakrishnan 03-OCT-1997
   MODS....Abal rewrite enhancement
   1.  Deleted all abal related blocks and program unit, canvases, windows and triggers
   2.  Created trigger ABAL_ERASE_NSF_GLOBALS that will be referenced by all forms.

2. DEFECT...NONE
   SIGNOFF..TGKinderman           22-OCT-1997
   MODS.....Added frbbudg_lov and frbbudg_rg used in the Grant/Budget module.

3. DEFECT...NONE
   SIGNOFF..Anandhi Pitchai        18-NOV-1997
   MODS.....Removed record groups & LOVs to tables FTVTTST, FTVACON, FTVACQM
            and FTVDISP since the tables are becoming obsolete in 3.1 release.


AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1003
	/* <p>
/* </p>
		*/
		public void auditTrail31()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
BEGIN
  <multilinecomment>
   AUDIT TRAIL: 4.0 
1. DEFECT.....8905
   SIGNOFF....Christine Liu	   08-MAY-1998
   PROBLEM....LOV for tax group does not show tax groups marked as non-taxable
              on ftmtgrp, fpapurr, foasysc, and faainve.
   FIXED......Corrected the select statement on ftvtgrp record group.
2. Enhancement for Purchasing Project
   SIGNOFF....Hanh Tran            21-MAY-1998
   Added ftvship_floor column to ftvship_lov and ftvship_rg. 
3. Enhancement for Purchasing Project
   SIGNOFF....W. Bishop            09-DEC-1998
   Added record group and LOV for freight terms table (FTVFTRM). 
4. Enhancement for Selected Finance Forms
   SIGNOFF....R. Rullo		   23-DEC-1998
   Added Format Numbers block, canvas, window for formatting items on some selected
   Finance forms.
5. DEFECT.....NONE
   SIGNOFF....TGKindemran          22-JAN-1999
   Removed F$_FORMAT_NUMBER_WINDOW, ORIGINAL_COMMODITY_DESC_WINDOW AND RQPO_SUSPENSE_WINDOW
   form respective object group for PhaseII Web-enabling modifications.
AUDIT TRAIL END;
</multilinecomment>
NULL;
END;
	*/
	//ID:1004
	/* <p>
/* </p>
		*/
		public void auditTrail40()
		{
			// AUDIT TRAIL: 4.0
			// 1. DEFECT.....8905
			// SIGNOFF....Christine Liu	   08-MAY-1998
			// PROBLEM....LOV for tax group does not show tax groups marked as non-taxable
			// on ftmtgrp, fpapurr, foasysc, and faainve.
			// FIXED......Corrected the select statement on ftvtgrp record group.
			// 2. Enhancement for Purchasing Project
			// SIGNOFF....Hanh Tran            21-MAY-1998
			// Added ftvship_floor column to ftvship_lov and ftvship_rg.
			// 3. Enhancement for Purchasing Project
			// SIGNOFF....W. Bishop            09-DEC-1998
			// Added record group and LOV for freight terms table (FTVFTRM).
			// 4. Enhancement for Selected Finance Forms
			// SIGNOFF....R. Rullo		   23-DEC-1998
			// Added Format Numbers block, canvas, window for formatting items on some selected
			// Finance forms.
			// 5. DEFECT.....NONE
			// SIGNOFF....TGKindemran          22-JAN-1999
			// Removed F$_FORMAT_NUMBER_WINDOW, ORIGINAL_COMMODITY_DESC_WINDOW AND RQPO_SUSPENSE_WINDOW
			// form respective object group for PhaseII Web-enabling modifications.
			// AUDIT TRAIL END;
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_2
	
	PROCEDURE AUDIT_TRAIL_4_2 IS
<multilinecomment>
  Audit Trail: 4.2

  1. Added procedure to call the FTMFATA form from all the foapal
     maintenance forms.  LR 1/12/00
  2. Deleted FTVUNIT_RG and FTVUNIT_LOV( ftvunit table does not exist).   GA  02/28/00
  3. Defect.......12667
     Signoff......Tatyana Ispas     03/23/2000
     Problem......In FTMFSYr form added records with ftvfspd_prd_status_ind = to 'Not open'
                  was not shown on List of system control fiscal year (FTVFSYR_LOV).
     Fix..........Modified FTVFSYR_RG to change where clause to b.ftvfspd_prd_status_ind<>'C'
                  and c.ftvfspd_prd_status_ind<>'C' to pick up all records where
                  _prd_status equal to 'Open' and 'Not Open'.

  Audit Trail end;

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1005
	/* <p>
/* </p>
		*/
		public void auditTrail42()
		{
		}

	
	/* Original PL/SQL code for Prog Unit FTMFATA_CALL
	
	PROCEDURE FTMFATA_CALL (CHART_CODE   VARCHAR2,
                        FOAPAL_CODE  VARCHAR2,
                        FOAPAL_TITLE VARCHAR2,
                        FOAPAL_TYPE  VARCHAR2 )
IS

BEGIN

    IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
       MESSAGE ( G$_NLS.Get('FOQOLIB-0002', 'FORM','Commit the record before calling form FTMFATA to assign attributes.') );
       RAISE FORM_TRIGGER_FAILURE;
    ELSE
       :GLOBAL.COAS_CODE := chart_code;
       :GLOBAL.FOAPAL_CODE := foapal_code;
       :GLOBAL.FOAPAL_TITLE := foapal_title;
       :GLOBAL.FOAPAL_TYPE := foapal_type;
       :GLOBAL.FORM_WAS_CALLED := 'Y' ;

       EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
       G$_CHECK_FAILURE;

       G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTMFATA','');
       G$_RESET_GLOBAL;
       G$_CHECK_FAILURE ;
       :global.form_was_called := 'N';
       :global.foapal_type := '';
       :global.foapal_code := '';
       :global.foapal_title := '';
   END IF;
  
END;

	*/
	//ID:1006
	/* <p>
/* </p>
		* @param chartCode
		* @param foapalCode
		* @param foapalTitle
		* @param foapalType
		*/
		public void ftmfataCall(NString chartCode, NString foapalCode, NString foapalTitle, NString foapalType)
		{
			if ( getTaskStatus().equals("CHANGED") )
			{
				errorMessage(GNls.Fget(toStr("FOQOLIB-0002"), toStr("FORM"), toStr("*ERROR* Commit the record before calling form FTMFATA to assign attributes.")));
				throw new ApplicationException();
			}
			else {
				setGlobal("COAS_CODE", chartCode);
				setGlobal("FOAPAL_CODE", foapalCode);
				setGlobal("FOAPAL_TITLE", foapalTitle);
				setGlobal("FOAPAL_TYPE", foapalType);
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTMFATA"), toStr(""));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				setGlobal("FOAPAL_TYPE", toStr(""));
				setGlobal("FOAPAL_CODE", toStr(""));
				setGlobal("FOAPAL_TITLE", toStr(""));
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
  Audit Trail: 5.0
1. TGKinderman 06/14/2000
   Dev6.0 Upgrade.
 AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1007
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2
	
	PROCEDURE AUDIT_TRAIL_5_2 IS

<multilinecomment>
  Audit Trail: 5.2
  
  1. GASB enhancement.
     Add LOV's for FGARCLE to get document number.  SP - 4/24/01
     
  2. GASB enhancement.    LR - 5/6/01
     Change LOVs attribute types and values to include atyps and ftyps
     
  Audit Trail end;
</multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:1008
	/* <p>
/* </p>
		*/
		public void auditTrail52()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
BEGIN
  <multilinecomment>
  Audit Trail: 5.3
  
  1. Defect - 50196
     Modify ftvfsyr_LOV  to show all years inclding closed fiscal years
    Also remove the period start date, end date columns from the select.
              AP 21-sep-01
     
  Audit Trail end;
</multilinecomment>
NULL;
END;
	*/
	//ID:1009
	/* <p>
/* </p>
		*/
		public void auditTrail53()
		{
			// Audit Trail: 5.3
			// 1. Defect - 50196
			// Modify ftvfsyr_LOV  to show all years inclding closed fiscal years
			// Also remove the period start date, end date columns from the select.
			// AP 21-sep-01
			// Audit Trail end;
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
  Audit Trail: 7.0
1. TGKinderman 11/20/2003
   Converted to Forms9i
   
2. LRadhakrishnan  5/24/04
   1.  Added subclass G$_NVA_LOV to F$_NVA_LOV.  Only 5 forms use f$_NVA_LOV. 
   fiaspnd.fmb
   fiiphis.fmb
   fiipool.fmb
   fpircvd.fmb
   fpirqst.fmb.
   
   2. Added G$_NVA_CANVAS and G$_NVA_WINDOW visual attributes to the canvases and windows to 
      conform with Banner 7 UI methodology.
      
 AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1010
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
	//ID:1011
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment>
  Audit Trail: 7.3
1. SaurabhA 09/28/2009
   Changed the order by clause in record group FTVAGCY_RG from "ftvagcy_agcy_code_pidm" to "spriden_id asc".
      
 AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1012
	/* <p>
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> Audit Trail: 8.0
1. BGourlie 03-JUL-2007
   On F$_FORMAT_NUMBER_CANVAS, add 4 significant comma option to radio group.
   Added LOAD_CURRENT_RELEASE trigger to hold current version of library,
     and changed the LOAD_FORM_HEADER trigger to call it, in case this is referenced.
AUDIT TRAIL END;
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1013
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_9_1
	
	PROCEDURE AUDIT_TRAIL_8_9_1 IS
<multilinecomment>
AUDIT TRAIL: 8.9.1

1. Change Req..CR-000106833
   Signoff.....Pradeep Kumar Mallapuram      24-Feb-2014
   Problem.....Update the options with Banner Finance GASB reports to accommodate 
               changes in presentation concepts from Net Assets to Net Position as 
               outlined in GASB Statement No. 63 for Deferred Outflows 
               and Deferred Inflows.           
   Fix.........Modified FTVATTT_RG record group to add validation to filter
               active records, so that in FTVATTT_LOV shows 
               Attribute records with only active status.

AUDIT TRAIL END
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1014
	/* <p>
/* </p>
		*/
		public void auditTrail891()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment> 
Copyright 1996-2014 Ellucian Company L.P. and its affiliates.
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1015
	/* <p>
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FOQOLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Feb 24 03:48:22 2014
-- MSGSIGN : #9c54a24768d933e4
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1016
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
