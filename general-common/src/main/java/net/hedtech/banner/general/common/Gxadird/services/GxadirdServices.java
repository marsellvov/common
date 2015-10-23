package net.hedtech.banner.general.common.Gxadird.services;

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


import net.hedtech.banner.general.common.Gxadird.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gxadird.model.*;



public class GxadirdServices extends AbstractSupportCodeObject{
	
	
	public GxadirdServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GxadirdTask  getTask() {
		return (GxadirdTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Gxadird.model.GxadirdModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
BEGIN
  NULL;
<multilinecomment>AUDIT TRAIL: 2.1
1. Forms 4.0 conversion.                                     MK     07-15-94
2. Defect #: 1559                                            MK     08-12-94
   Added an edit to not allow records to be committed for
   person not added to PEAEMPL.  The edit checks to see that
   the person has been added as an employee.
AUDIT TRAIL: 2.1.1
1. VGA modifications.                                        RLP    03-20-95
2. Added one more element 'Inactive' with value 'I'          AA     03-30-95
   to pop-list item PERDIRD_STATUS. This choice allows
   to define the Direct Deposit Status as "Inactive' for
   some person.                      
3. Corrected Dynamic Help on item PERDIRD_STATUS.
4. Character mode and Mac modifications.                     VM     04-26-95
5. A. Character mode corrections:                            RLP    05-16-95
      Last digit of the 'Direct Deposit Detail Amount', 
      'Per Pay Recovery Amount' and 'Advance Balance' 
      fields was not being displayed, therefore I increased
      the size of all three fields by 1 character.
   B. Repositioned the 'Bank Code' field, it was overlaying    
      the 'Bank Code Description' field.
   C. Modified the POST-CHANGE trigger of the ID field to use 
      referenced procedure 'G$_SEL_SPRIDEN_ID_NAME' instead 
      of referenced procedure 'G$_SEL_SPRIDEN_PIDM_NAME', 
      because 'G$_SEL_SPRIDEN_PIDM_NAME' does not return the
      current ID when a previous ID is entered.
AUDIT TRAIL: 2.1.5
1. Enhancement - Role Based Security.                         SG     09-07-95
   Functional Impact - Users must have been granted access to appropriate
                       role in order to use form. Enforces more robust 
                       security throughout Banner applications.
   Technical Modification - Attached GOQRPLS library. Various changes 
                       centered around the Pre-form and post-form triggers.
                       Also modified syntax for calling other forms.
2. Changed default of status from Active to Pre-note.         SG     09-07-95
   Functional Impact - New records will have a pre-note default status.
   Technical Modification - Modified Status field.
3.  Enhancement - Default Date and Time   PC  10-18-95
    Functional Impact - To ensure the default date
                 and time are ascertained from
                 the database date/time values 
                 and not obtained from the
                 the end user's personal computer
                 date/time values (setting).
    Technical Mods.   - Changed the variable 
                 from $$DATE$$ to $$DBDATE$$; 
                 $$TIME$$ TO $$DBTIME$$; 
                 $$DATETIME$$ TO $$DBDATETIME$$.
AUDIT TRAIL: 2.1.11
1. RPM 1125
   Problem: User should be able to query     AY 03/22/1996
            data on deceased or terminated person.
   Function Impact:  When a person was deceased or                     terminated a user could no longer go back and look at an 
employee's record. In some instances there may be a need 
to go back and look at an employee's past history.
   Solution: Create a procedure N$_CHECK_PIDM(:PIDM) to
             check deceased or terminated person, and make
             the data blocks query-only mode.
2. Forms 4.5 Conversion SLM 08-22-96
3. Modify RPM 1125 and allow user to update deceased     LB 10-11-96
   or terminated employees, just provide a warning.
4.MIS Defect #5293                                       DF 10-29-96
  Problem - Users cannot toggle between the checking and saving accounts.
  Functional Impact - Whenever users tried to navigate from the checking
                      and saving accounts the cursor would not toggle between
                      item as it should have.
  Technical Modification - Removed the old radio buttons for both checking and saving
                           accounts and replaced/renamed them by using an existing
                           radio button that worked properly.
5. Removed character mode logik from When_New_Form_Inst trigger.
  Added G$_Check_Failure after G$_Verify_Access in Pre_Form trigger.
  Removed form name & release from windows titles.
  Moved Audit trail to new program_unit.
                                                E.T  01/24/97 
AUDIT TRAIL END</multilinecomment>
END;
	*/
	//ID:1412
		public void auditTrail21()
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
2. Problem - Terminated/deceased check not working properly. AY 06-23-97
   Technical Fix -  Moved N$_CHECK_PIDM from POST-CHANGE trigger of KEY_BLOCK.ID
   to the CHECK_KEYS trigger.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1413
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
 AUDIT TRAIL: 3.1					              GK  10/24/97 
 1. Defect# 7897
    Problem - When Orgn security turned on in PTRINST go to PEAPAYR and when
             next block from the pull down menu the authorization check is done
             along with information where the user is not supposed to look
             at. The information should not be displayed as a result of security check.
             It works fine when you mouse to the next block and you will see
             security check error without any information.
    Functional Impact - When Orgn security is turned on and going to PEAPAYR does not
             display any information now for which the user do not have permission to.
             This  will be true if doing next block from pull down menu or
             mouse to the next block.

   Tech. Fix - Removed the "EXECUTE_QUERY" procedure from KEY-NXT-BLK trigger on 
             KEY-BLOCK.
             And also disabled KEY-NXT-BLK at form level as it has written at
             key-block level with the same logic.
  2.Defect# 8149   							GK  11/04/97 
    Problem - The name is not redefaulting, on occasion, when the ID field is changed.
    Functional Impact - The name will be redefaulted now when the ID field is
               changed.
    Tech. Fix - Instead of "G$_check_failure" used the following logic in
             WHEN-NEW-BLOCK-INSTANCE trigger.
                 IF NOT FORM_SUCCESS THEN
                   SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
                   RAISE FORM_TRIGGER_FAILURE;
                 END IF;
 
 AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1414
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. AA  09/08/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers. 
2. SF 10/23/98
   Added ACH Enhancements to Form.

3. Scott Freeman 1/25/99
   Phase II UI Changes

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1415
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
	//ID:1416
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4 
1.  GShalovka  15 January 2002 
    Add GUIALTI form to Option List window.
    Add code to KEY_BLOCK.ID.Key-Dup-Item to call GUIALTI form.
      Modified associated AutoHint text.
    Modify code in BUTTON_CONTROL_BLOCK.ID_LBT.When-Button-Pressed
      to display Option List Window call to GUIALTI.
    Modify form level triggers ENABLE_KEYS and DISABLE_KEYS
      to add ID_LBT.
AUDIT TRAIL END
</multilinecomment> 
BEGIN
NULL;
END;
	*/
	//ID:1417
		public void auditTrail54()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3_0_1
	
	PROCEDURE AUDIT_TRAIL_5_3_0_1 IS
<multilinecomment>
AUDIT TRAIL: 5.3.0.1 
1.  GShalovka  06 January 2002 
    Correct 66160: unable to save multiple rows; messages not displaying.
    Modify triggers GXRDIRD.CHECK_PRIORITY and GXRDIRD.CHECK_PRIORITY2
      to add gxrdird_priority to WHERE clause in cursor HR_EDIT.
    Comment out code in trigger GXRDIRD.GXRDIRD_BANK_ROUT_NUM Pre-Text-Item
      to prevent message from being cleared before it is displayed to the user.
2.
    Correct 38845, 43142, 66988: invalid Priority edits; data entry edit errors
                                 for AP and Payroll users.
    Modify trigger GXRDIRD.GET_PRIORITY to use valid checkbox values.
    Modify item GXRDIRD.GXRDIRD_PRIORITY to be not required.
    Modify trigger GXRDIRD.Pre-Update to execute trigger GET_PRIORITY if required.
    Modify trigger GXRDIRD.GXRDIRD_ATYP_CODE Key-Next-Item 
    	to null out GXRDIRD_ADDR_SEQNO if GXRDIRD_ATYP_CODE is null.
    Create trigger GXRDIRD.CHECK_DATA_ENTRY to ensure correct data entry edits
      occur based on type of user.
    Modify triggers GXRDIRD.Pre-Update and Pre-Insert to check AP data entry
      criteria based on type of user;  
      call triggers GXRDIRD.CHECK_DIRD and CHECK_DIRD2 only if row is a Payroll transaction;
      call trigger GXRDIRD.CHECK_DATA_ENTRY and CHECK_DIRD2 only if row is a Payroll transaction.
    Modify trigger GXRDIRD.CHECK_PRIORITY an CHECK_PRIORITY2 to use checkbox values 
      instead of HOLD_SECURITY value; 
      modify cursor WHERE clauses.
3. 
    Correct 61985: Extended ID/Name Search does not work properly in Key Block 
                   after ClearForm/RollBack is executed.  Name item is not enterable.
    Modify trigger ENABLE_KEYS to set form item KEY_BLOCK.ID attributes to original values.
			This allows proper navigation to KEY_BLOCK.NAME is ID is null.
</multilinecomment> 
BEGIN
NULL;
END;
	*/
	//ID:1418
		public void auditTrail5301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4_0_1
	
	PROCEDURE AUDIT_TRAIL_5_4_0_1 IS
<multilinecomment>
AUDIT TRAIL: 5.4.0.1 
1.  Correct defect 77946   GShalovka  26 April 2002 
    Problem: No rows are displayed for ID.
    Impact:  Information is not automatically displayed;
               Execute Query must be performed to view data.
    Solution: In WHEN_NEW_BLOCK_INSTANCE_TRG un-comment MESSAGE_LEVEL commands
                and EXECUTE_QUERY command.
AUDIT TRAIL END
</multilinecomment> 
BEGIN
NULL;
END;
	*/
	//ID:1419
		public void auditTrail5401()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_5
	
	PROCEDURE AUDIT_TRAIL_5_5 IS
<multilinecomment>
AUDIT TRAIL: 5.5 
1.  Correct defect 78310   GShalovka  04 June 2002 
    Problem: LOV for Address Type is not returning Address Seq value.
    Impact:  User must manually research and enter sequence number.
    Solution: Add code to GXRDIRD.GXRDIRD_ATYP_CODE Key-Listval 
              to return GLOBAL.SEQNO.
AUDIT TRAIL END
</multilinecomment> 
BEGIN
NULL;
END;
	*/
	//ID:1420
		public void auditTrail55()
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
	//ID:1421
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1. G Shalovka   19 February 2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details.
2. G Shalovka   19 February 2004
   Modify code that hides form items by placing blank canvases over
   form items with code in WHEN-NEW-FORM-INSTANCE trigger
   to modify form item properties instead.
3. G Shalovka   20 February 2004
   Modify WHEN_NEW_BLOCK_INSTANCE_TRG, ENABLE_KEYS and DISABLE_KEYS 
   to handle LOV buttons added to data block.
4. Defect 70-0239, LN 01-Nov-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Local ID logic is replaced with g$ routine for the key-block ID.
   Technical Fix:
     Modified trigger KEY_BLOCK.ID.POST-CHANGE to call G$_SEL_SPRIDEN_PIDM_NAME.  

AUDIT TRAIL: 7.2
1.  SJQ 05/17/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
    
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1422
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
	//ID:1423
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_5
	
	PROCEDURE AUDIT_TRAIL_7_5 IS
<multilinecomment> 
AUDIT TRAIL: 7.5
1. LVH 05/15/07 
   Defect 1-1OSTUJ
   Added a new trigger (CHECK_ACTIVE) to the pre-insert and pre-update triggers to display a warning
   message if the record is active, but neither the Accounts Payable nor Payroll indicators were checked.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1424
		public void auditTrail75()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Apply 7.5 modifications to 8.0

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1425
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   This form has been modified to increase the currency fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1426
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit P_CHECK_ADDR_INFO
	
	PROCEDURE p_check_addr_info 
IS
  HOLD_VALUE VARCHAR2(1);
  CURSOR CHK_ADDR_SEQNO IS SELECT 'Y' FROM SPRADDR
                            WHERE SPRADDR_PIDM=:PIDM
														  AND SPRADDR_ATYP_CODE=:GXRDIRD_ATYP_CODE
														  AND SPRADDR_SEQNO=:GXRDIRD_ADDR_SEQNO;
BEGIN
	
  IF (:GXRDIRD_ADDR_SEQNO IS NULL) AND
		 (:GXRDIRD_ATYP_CODE IS NOT NULL) THEN
			 
	  MESSAGE( G$_NLS.Get('GXADIRD-0051', 'FORM','*ERROR* Address Sequence Number is required when Vendor Address Type is entered.') );
	  RAISE FORM_TRIGGER_FAILURE;
  
	ELSIF (:GXRDIRD_ADDR_SEQNO IS NOT NULL) AND
		    (:GXRDIRD_ATYP_CODE IS NULL) THEN	
		    
		MESSAGE( G$_NLS.Get('GXADIRD-0052', 'FORM','*ERROR* Vendor Address Type is required when Address Sequence Number is entered.') );
	  RAISE FORM_TRIGGER_FAILURE;	
	  
	ELSIF (:GXRDIRD_ADDR_SEQNO IS NOT NULL) AND
		 (:GXRDIRD_ATYP_CODE IS NOT NULL) THEN
		 
		 OPEN CHK_ADDR_SEQNO;
		 FETCH CHK_ADDR_SEQNO INTO HOLD_VALUE;
		 IF CHK_ADDR_SEQNO%NOTFOUND THEN
		    MESSAGE( G$_NLS.Get('GXADIRD-0053', 'FORM','Address Information is invalid.') );
		    RAISE FORM_TRIGGER_FAILURE;
		 END IF;
		 
	END IF; 
END;
	*/
	//ID:1427
		public void pCheckAddrInfo(GxrdirdAdapter gxrdirdElement)
		{
			int rowCount = 0;
			NString holdValue= NString.getNull();
			String sqlchkAddrSeqno = "SELECT 'Y' FROM SPRADDR WHERE SPRADDR_PIDM = :PIDM AND SPRADDR_ATYP_CODE = :GXRDIRD_ATYP_CODE AND SPRADDR_SEQNO = :GXRDIRD_ADDR_SEQNO ";
			DataCursor chkAddrSeqno = new DataCursor(sqlchkAddrSeqno);
			try {
				if ( (gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (!gxrdirdElement.getGxrdirdAtypCode().isNull()) )
				{
					errorMessage(GNls.Fget(toStr("GXADIRD-0058"), toStr("FORM"), toStr("*ERROR* Address Sequence Number is required when Vendor Address Type is entered.")));
					throw new ApplicationException();
				}
				else if ( (!gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (gxrdirdElement.getGxrdirdAtypCode().isNull()) ) {
					errorMessage(GNls.Fget(toStr("GXADIRD-0059"), toStr("FORM"), toStr("*ERROR* Vendor Address Type is required when Address Sequence Number is entered.")));
					throw new ApplicationException();
				}
				else if ( (!gxrdirdElement.getGxrdirdAddrSeqno().isNull()) && (!gxrdirdElement.getGxrdirdAtypCode().isNull()) ) {
					chkAddrSeqno.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
					chkAddrSeqno.addParameter("GXRDIRD_ATYP_CODE", gxrdirdElement.getGxrdirdAtypCode());
					chkAddrSeqno.addParameter("GXRDIRD_ADDR_SEQNO", gxrdirdElement.getGxrdirdAddrSeqno());
					chkAddrSeqno.open();
					ResultSet chkAddrSeqnoResults = chkAddrSeqno.fetchInto();
					if ( chkAddrSeqnoResults != null ) {
						holdValue = chkAddrSeqnoResults.getStr(0);
					}
					if ( chkAddrSeqno.notFound() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0060"), toStr("FORM"), toStr("*ERROR* Address Information is invalid.")));
						throw new ApplicationException();
					}
				}
				}finally{
					chkAddrSeqno.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2
1. PSM 01/02/09
   Defect 1-3VP2NR
   
   a. New procedure p_check_addr_info is created and is called from  pre-insert and pre-update triggers 
      inorder to check both Address Type and Address Sequence Number or present.
      
   b. Trigger WHEN-VALIDATE-ITEM is added to item GXRDIRD_ADDR_SEQNO (Address Sequence Number) inorder to clear
      the value of item GXRDIRD_ATYP_CODE (Address Type), whenever value of item GXRDIRD_ADDR_SEQNO 
      (Address Sequence Number) is deleted.
      
   c. Trigger WHEN-VALIDATE-ITEM is added to item GXRDIRD_ADDR_SEQNO (Address Sequence Number) inorder to clear
      value of item GXRDIRD_ADDR_SEQNO (Address Sequence Number), whenever value of item GXRDIRD_ADDR_SEQNO 
      (Address Sequence Number) is deleted. 

1. PSM 05/18/09
   Defect 1-59M66Q
   Form is run through rekey.    
        
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1428
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GXADIRD
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Sep 18 17:28:42 2009
-- MSGSIGN : #a94397a9a41fccc2
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1429
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2_1
	
	PROCEDURE AUDIT_TRAIL_8_2_1 IS
<multilinecomment>
AUDIT TRAIL: 8.2.1
1. International ACH Transactions (IAT) Regulatory Changes             PM 09/01/2009

   GXRDIRD_ACH_IAT_IND, GXRDIRD_SCOD_CODE_ISO, SCOD_CODE_DESC,
   GXRDIRD_ACHT_CODE, GXRDIRD_ATYP_CODE_IAT, GXRDIRD_ADDR_SEQNO_IAT,
   GXRDIRD_SCOD_CODE_ISO_LBT, GXRDIRD_ACHT_CODE_LBT and GXRDIRD_ATYP_CODE_IAT_LBT 
   fields were added to the GXRDIRD block. The WHEN-NEW-INSTANCE-FORM
   trigger was modified to enable/disable these new fields.
   Created new trigger CHECK_IAT_REQ_PROPERTIES for validating 
   the IAT fields. Modified the PRE-INSERT and PRE-UPDATE of GXRDIRD 
   block triggers to call this new trigger. Also new trigger CHECK_INACTIVE_ADDRESS
   is created in the GXRDIRD block. This trigger is called in KEY-LISTVAL and
   WHEN-VALIDATE-ITEM trigger of the item GXRDIRD_ATYP_CODE_IAT.
    
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1430
		public void auditTrail821()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment> 
AUDIT TRAIL: 8.4
1. LVH 09/16/2010
   Defect 1-BCDDUQ
   Increased the length of SCOD_CODE_DESC from 30 to 80
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1431
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_2
	
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.4.2
1. LVH 05/16/2011
   Defect 1-B196B3
   Updated the hint text for IAT fields to indicate they are required when IAT is checked.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1432
		public void auditTrail842()
		{
		}

	
	

}
