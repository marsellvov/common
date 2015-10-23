package net.hedtech.banner.alumni.common.Aoqrpls;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 


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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;


public class AoqrplsServices extends AbstractLibrary{
		
	public AoqrplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
	
	//Original PL/SQL code for Prog Unit AOQRPLS.F_SELECT_DONOR_CATG
	/*
	FUNCTION F_SELECT_DONOR_CATG ( PIDM_IN IN  NUMBER)
<multilinecomment>        </multilinecomment>
  RETURN VARCHAR2 IS
    donor_catg atvdonr.atvdonr_code%type := '';
   CURSOR catg_cur IS
---
      SELECT ATVDONR_CODE
      FROM   APRCATG B, ATVDONR Y
      WHERE  APRCATG_PIDM = PIDM_IN
      AND    APRCATG_DONR_CODE = Y.ATVDONR_CODE
      AND    ATVDONR_RPT_SEQ_IND =
             (SELECT MIN(X.ATVDONR_RPT_SEQ_IND)
              FROM   ATVDONR X
              WHERE  EXISTS
             (SELECT 'X'
              FROM   APRCATG
              WHERE  APRCATG_PIDM = PIDM_IN
              AND    APRCATG_DONR_CODE = X.ATVDONR_CODE ));

---
    BEGIN
    OPEN CATG_CUR;
    FETCH catg_cur into donor_catg ;
    CLOSE CATG_CUR ;
    RETURN (donor_catg);
   END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		*/
		public NString fSelectDonorCatg(NNumber pidmIn)
		{
			int rowCount = 0;
			NString donorCatg = toStr("");
			String sqlcatgCur = "SELECT ATVDONR_CODE " +
	" FROM APRCATG B, ATVDONR Y " +
	" WHERE APRCATG_PIDM = :P_PIDM_IN AND APRCATG_DONR_CODE = Y.ATVDONR_CODE AND ATVDONR_RPT_SEQ_IND = (SELECT MIN(X.ATVDONR_RPT_SEQ_IND) " +
		" FROM ATVDONR X " +
		" WHERE  EXISTS(SELECT 'X' " +
			" FROM APRCATG " +
			" WHERE APRCATG_PIDM = :P_PIDM_IN AND APRCATG_DONR_CODE = X.ATVDONR_CODE ) ) ";
			DataCursor catgCur = new DataCursor(sqlcatgCur);
			try {
				//Setting query parameters
				catgCur.addParameter("P_PIDM_IN", pidmIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable catgCur.
				catgCur.open();
				ResultSet catgCurResults = catgCur.fetchInto();
				if ( catgCurResults != null ) {
					donorCatg = catgCurResults.getStr(0);
				}
				catgCur.close();
				return ((donorCatg));
				}finally{
					catgCur.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
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
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : AOQRPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Apr 19 03:48:07 2012
-- MSGSIGN : #5c5287557509ef77
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_8_5_1
	/*
	PROCEDURE AUDIT_TRAIL_8_5_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.5.1
1. Defect#1-14C1U47                       Venkat Krishna   04/19/2012
   Problem: 8.5 release of Banner Advancement updates ADBDESG_ACTIVITY_DATE when key ADBDESG fields
            have been modified via ADADESG form.This is correct. However that field is also updated
            when a new gift/payment/pledge is booked against the designation and should not be.
  Solution: Commented part of update statement (all occurences of 'adbdesg_activity_date = sysdate').
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail851()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_8_4_2
	/*
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.4.2
1. Defect#1-M05LDQ                       Venkat Krishna   06/30/2011
   Problem: The Alert box pop-up is displayed when the form with the alert is the first 
            form accessed for this Userid.  If other forms are accessed prior to the alert
            form then the alert does not pop up, even though the alert icon is illuminated.

  Solution: Added code in A$_SEL_ID_INFO trigger to set Global to N whenever ID changed.
  					IF lv_id <> NAME_IN('GLOBAL.KEY_IDNO') THEN 
    						copy('N','GLOBAL.FORM_USER_ALERTS_IND');
  					END IF; 
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail842()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_8_2
	/*
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2
1. I18N - Phase II                                                        Heidi Dombroski 02/02/2009
   Changed A$_SEL_ID_INFO to use the new Surname Prefix field when calling G$_BUILD_FULL_NAME 
   to build the spouse name.
          
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_8_0_AOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_0_AOQRPLS IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Heidi Dombroski 10/09/2007
   Release number update per minimal inclusion in release.   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Aoqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_8_0_0_1_AOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_0_0_1_AOQRPLS IS
<multilinecomment> 
AUDIT TRAIL: 8.0.0.1
1. Defect 1-3W52QN                                                                     Heidi Dombroski 08/22/2008
   Problem: The two fields for name and spouse name in aoqrpls.pll have a length of 200 and they should have a length of
            230 each. A length of 201 produces an interrupt on 'VALIDATE_ID TRIGGER'. Changing the length of the full name
            and spouse name in library aoqrpls to 230 characters resolves this problem. The program unit to be modified 
            is A$_SEL_ID_INFO and the fields are lv_full_name and lv_sps_full_name.
   Solution: Changed the length of the lv_full_name and lv_sps_full_name fields in A$_SEL_ID_INFO to be 230 instead of 200.
          
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8001Aoqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_7_0_AOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_AOQRPLS IS
<multilinecomment>
**   AUDIT TRAIL: 7.0
1. TGKinderman 11/19/2003
   Converted to Forms9i
2. TGKinderman 12/11/2003
   Per Banner7.0 UI requirements, modified A$_SEL_ID_INFO and A$_SEL_ID_PERS_INFO to return
   Confidentail instead of *CONFIDENTIAL* and Deceased instead of DECEASED.  IF tests and decode
   also modified per changing these two pl/sql units.    

3. Defect 70-0044, LN 28-Sep-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for program unit a$_sel_id_info.
   Technical Fix:
     Modified a$_sel_id_info to call g$_valid_all_id and g$_build_full_name.
     Modified a$_sel_id_pers_info to call a$_sel_id_info.

** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Aoqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
**   AUDIT TRAIL: 6.0
1.  Copy 5.4 version to 6.0.                    Scott Geiser 03/25/2003       
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_5_0_AOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_AOQRPLS IS
<multilinecomment>
**   AUDIT TRAIL: 5.0
1. TGKinderman 06/13/2000
   Dev6.0 Upgrade.	
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Aoqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL_5_0
	/*
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
**   AUDIT TRAIL: 5.0
1.  Defect #45038: Modified in A$_SEL_ID_INFO and A$_SEL_ID_PERS_INFO
    procedures. Changed code to test for SPBPERS_CONFID_IND = 'Y'.
    KM 09/18/00
**   AUDIT TRAIL: 5.4
1. Confidentiality Indicator RPE.                   CE 7/08/02
   Removed lines of code which were commented out in the
     A$_SEL_ID_INFO and A$_SEL_ID_PERS_INFO program units
     to correct Defect #45038, for release 5.0.    
2. Programs with Owner Names RPE.                   CE 7/08/02
   Removed table owner from DUAL in PROCEDURE A$_CTYP_CODE_OK_2_DEL.       
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.AUDIT_TRAIL
	/*
	PROCEDURE AUDIT_TRAIL IS
<multilinecomment>
** AUDIT TRAIL: 2.1.11                                          INIT   DATE
** 1. Create Library Module for Generic Alumni PL/SQL Units. FHL 2/8/96
** 2. Add new version of A$_SEL_ID_INFO to this library.
** 3. Add new A$_DECEASED_WARNING & A$_CONFIDENTIAL_WARNING to this library. FHL 2/9/96 ** 4. Add A$_CTYP_CODE_OK_2_DEL to this Library. FHL 2/9/96 
** 5. Add A$_CURRENT_SCREEN_LINE. FHL 2/9/96
** 6. Add A$_SEL_ID_PERS_INFO. FHL 2/12/96
** 7. Add A$_DISPLAY_APRCATG_LOV. FHL 2/12/96
** 8. Added A$_PCAT_CODE_OK_2_DEL. FHL 4/1/96
** 9. Added 'ADISAWD' to A$_SEL... procedures. FHL 8/8/96
** 10. Added Function F_SELECT_DONOR_CATG. FHL 8/8/96
** 11. Correct A$_SEL_ID+PERS_INFO. FHL 9/24/96
**
** AUDIT TRAIL: 3.0
** 1. Added AOAEMAL to A$_SEL_ID_INFO & A$_SEL_PERS_INFO. FHL 1/31/97
** 2. Modified A$_SEL_ID_INFO and A$_SEL_ID_PERS_INFO to display spouse
** deceased ind if spouse has no ID.  JB  08/19/97
**
** AUDIT TRAIL: 3.0.1
** 1. Added procedures and Functions for Third Party Payment processing.
**    FHL 10/1/97
** 2. Added A$_CALC_APRCHIS & A$_CALC_APRDHIS procedures that recalculate
**    a persons giving history for a Campaign or Desgination respectively.
**    These are invoked from forms AGAPIDS and AGAGIDS because we have made
**    the detail credit columns AGRPMLT_CREDIT & AGRGMLT_CREDIT updateable.
**    FHL 10/23/97
** 3. Add new Function A$_3RD_PARTY_CREDIT to return total of all Third
**    party payments for the passed Pledge number argument. Second argument
**    of HARD_OR_SOFT allows for selection of 3rd party credit by type.
**    FHL 1/12/98
** 4. Add new Function A$_PERSON_3RD_PARTY_CREDIT to return total of all Third
**    party payments for the passed CREDIT_PIDM argument. Optionally,
**    arguments of Pledge number, Campaign and Designation may be specified. Last
**    argument of HARD_OR_SOFT allows for selection of 3rd party credit by type.
**    FHL 1/12/98
** 5. Added new procedures to update the amt_pledged_paid and amt_gift columns
**    in the three institution tables ADBDESG, ADRSUMM and AFRDESG. These
**    6 procedures are invoked from forms AGATPAY, AGAGIDS and AGAGMEM because
**    the entry (or modification) of third party credit affects these columns.
**    FHL 5/29/98
**   AUDIT TRAIL: 4.0
** 1. Compile the library
**    GD 07-08-98  	
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail()
		{
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_PLEDGE_VEHICLE
	/*
	PROCEDURE A$_UPDATE_PLEDGE_VEHICLE ( PIDM_IN      IN NUMBER,
                                     PLDG_NO_IN   IN VARCHAR2,
                                     PGVE_CODE_IN IN VARCHAR2 ) IS
<multilinecomment> This Procedure will Update the Vehicle code with the argument
   vehicle code for the PIDM and Pledge No. arguments passed . 
   FHL 10/01/97
</multilinecomment>
  BEGIN
     UPDATE AGBPLDG
      SET   AGBPLDG_PGVE_CODE = PGVE_CODE_IN
     WHERE  AGBPLDG_PIDM      = PIDM_IN
      AND   AGBPLDG_PLEDGE_NO = PLDG_NO_IN ;
  END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param pldgNoIn
		* @param pgveCodeIn
		*/
		public void aUpdatePledgeVehicle(NNumber pidmIn, NString pldgNoIn, NString pgveCodeIn)
		{
			int rowCount = 0;
			String sql1 = "UPDATE AGBPLDG " +
	"SET AGBPLDG_PGVE_CODE = :P_PGVE_CODE_IN " +
	" WHERE AGBPLDG_PIDM = :P_PIDM_IN AND AGBPLDG_PLEDGE_NO = :P_PLDG_NO_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_PGVE_CODE_IN", pgveCodeIn);
			command1.addParameter("P_PIDM_IN", pidmIn);
			command1.addParameter("P_PLDG_NO_IN", pldgNoIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_GIFT_VEHICLE
	/*
	PROCEDURE A$_UPDATE_GIFT_VEHICLE ( PIDM_IN      IN NUMBER,
                                   GIFT_NO_IN   IN VARCHAR2,
                                   PGVE_CODE_IN IN VARCHAR2 ) IS
<multilinecomment> This Procedure will Update the Vehicle code with the argument
   vehicle code for the PIDM and Gift No. arguments passed . 
   FHL 10/01/97
</multilinecomment>
  BEGIN
     UPDATE AGBGIFT
      SET   AGBGIFT_PGVE_CODE = PGVE_CODE_IN
     WHERE  AGBGIFT_PIDM      = PIDM_IN
      AND   AGBGIFT_GIFT_NO   = GIFT_NO_IN ;
  END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param giftNoIn
		* @param pgveCodeIn
		*/
		public void aUpdateGiftVehicle(NNumber pidmIn, NString giftNoIn, NString pgveCodeIn)
		{
			int rowCount = 0;
			String sql1 = "UPDATE AGBGIFT " +
	"SET AGBGIFT_PGVE_CODE = :P_PGVE_CODE_IN " +
	" WHERE AGBGIFT_PIDM = :P_PIDM_IN AND AGBGIFT_GIFT_NO = :P_GIFT_NO_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_PGVE_CODE_IN", pgveCodeIn);
			command1.addParameter("P_PIDM_IN", pidmIn);
			command1.addParameter("P_GIFT_NO_IN", giftNoIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_AFRDESG_AMT_PAID
	/*
	PROCEDURE A$_UPDATE_AFRDESG_AMT_PAID (CAMP_IN IN VARCHAR2,
                                      DESG_IN IN VARCHAR2,
                                      AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total amount pledged paid for the camp/designation.
   The invoking procedure determines the amount of the third party
   gift applied to each camp/designation and adds to that the amount of 
   third party credit (both hard & soft) applied to that camp/designation. </multilinecomment>
BEGIN
--
  update afrdesg
  set    afrdesg_activity_date = sysdate,
         afrdesg_amt_pledged_paid = nvl(afrdesg_amt_pledged_paid,0) + nvl(amt_in,0)
  where afrdesg_campaign = camp_in
  and   afrdesg_desg = desg_in ;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param campIn
		* @param desgIn
		* @param amtIn
		*/
		public void aUpdateAfrdesgAmtPaid(NString campIn, NString desgIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE afrdesg " +
	"SET afrdesg_activity_date = sysdate, afrdesg_amt_pledged_paid = nvl(afrdesg_amt_pledged_paid, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE afrdesg_campaign = :P_CAMP_IN AND afrdesg_desg = :P_DESG_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_CAMP_IN", campIn);
			command1.addParameter("P_DESG_IN", desgIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_AFRDESG_AMT_GIFT
	/*
	PROCEDURE A$_UPDATE_AFRDESG_AMT_GIFT (CAMP_IN IN VARCHAR2,
                                      DESG_IN IN VARCHAR2,
                                      AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total gift amount for the camp/designation.
   The invoking procedure determines the amount of the third party
   gift applied to each camp/designation and reduces that by the amount of 
   third party credit (both hard & soft) applied to that camp/designation. </multilinecomment>
BEGIN
--
  update afrdesg
  set    afrdesg_activity_date = sysdate,
         afrdesg_amt_gift = nvl(afrdesg_amt_gift,0) + nvl(amt_in,0)
  where afrdesg_campaign = camp_in
  and   afrdesg_desg     = desg_in ;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param campIn
		* @param desgIn
		* @param amtIn
		*/
		public void aUpdateAfrdesgAmtGift(NString campIn, NString desgIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE afrdesg " +
	"SET afrdesg_activity_date = sysdate, afrdesg_amt_gift = nvl(afrdesg_amt_gift, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE afrdesg_campaign = :P_CAMP_IN AND afrdesg_desg = :P_DESG_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_CAMP_IN", campIn);
			command1.addParameter("P_DESG_IN", desgIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_ADRSUMM_AMT_PAID
	/*
	PROCEDURE A$_UPDATE_ADRSUMM_AMT_PAID (DESG_IN IN VARCHAR2,
                                      FISC_IN IN NUMBER,
                                      AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total amount pledged paid for the designation/fisc.
   The invoking procedure determines the amount of the third party
   gift applied to each designation and adds to that the amount of 
   third party credit (both hard & soft) applied to that designation/fisc. </multilinecomment>
BEGIN
--
  update adrsumm
  set    adrsumm_activity_date = sysdate,
         adrsumm_amt_pledged_paid = nvl(adrsumm_amt_pledged_paid,0) + nvl(amt_in,0)
  where adrsumm_desg = desg_in 
  and   adrsumm_fisc_code = fisc_in;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param desgIn
		* @param fiscIn
		* @param amtIn
		*/
		public void aUpdateAdrsummAmtPaid(NString desgIn, NNumber fiscIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE adrsumm " +
	"SET adrsumm_activity_date = sysdate, adrsumm_amt_pledged_paid = nvl(adrsumm_amt_pledged_paid, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE adrsumm_desg = :P_DESG_IN AND adrsumm_fisc_code = :P_FISC_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_DESG_IN", desgIn);
			command1.addParameter("P_FISC_IN", fiscIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_ADRSUMM_AMT_GIFT
	/*
	PROCEDURE A$_UPDATE_ADRSUMM_AMT_GIFT (DESG_IN IN VARCHAR2,
                                      FISC_IN IN NUMBER,
                                      AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total gift amount for the designation/fisc.
   The invoking procedure determines the amount of the third party
   gift applied to each designation and reduces that by the amount of 
   third party credit (both hard & soft) applied to that designation. </multilinecomment>
BEGIN
--
  update adrsumm
  set    adrsumm_activity_date = sysdate,
         adrsumm_amt_gift = nvl(adrsumm_amt_gift,0) + nvl(amt_in,0)
  where adrsumm_desg = desg_in 
  and   adrsumm_fisc_code = fisc_in;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param desgIn
		* @param fiscIn
		* @param amtIn
		*/
		public void aUpdateAdrsummAmtGift(NString desgIn, NNumber fiscIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE adrsumm " +
	"SET adrsumm_activity_date = sysdate, adrsumm_amt_gift = nvl(adrsumm_amt_gift, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE adrsumm_desg = :P_DESG_IN AND adrsumm_fisc_code = :P_FISC_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_DESG_IN", desgIn);
			command1.addParameter("P_FISC_IN", fiscIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_ADBDESG_AMT_PAID
	/*
	PROCEDURE A$_UPDATE_ADBDESG_AMT_PAID (DESG_IN IN VARCHAR2,
                                      AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total amount pledged paid for the designation.
   The invoking procedure determines the amount of the third party
   gift applied to each designation and adds to that the amount of 
   third party credit (both hard & soft) applied to that designation. </multilinecomment>
BEGIN
--
  update adbdesg
  set    --adbdesg_activity_date = sysdate, -- Defect 1-14C1U47 commented
         adbdesg_amt_pledged_paid = nvl(adbdesg_amt_pledged_paid,0) + nvl(amt_in,0)
  where adbdesg_desg = desg_in ;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param desgIn
		* @param amtIn
		*/
		public void aUpdateAdbdesgAmtPaid(NString desgIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE adbdesg " +
	"SET adbdesg_amt_pledged_paid = nvl(adbdesg_amt_pledged_paid, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE adbdesg_desg = :P_DESG_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_DESG_IN", desgIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_UPDATE_ADBDESG_AMT_GIFT
	/*
	PROCEDURE A$_UPDATE_ADBDESG_AMT_GIFT (DESG_IN IN VARCHAR2,
                                     AMT_IN  IN NUMBER) IS
<multilinecomment> This procedure adjusts the total gift amount for the designation.
   The invoking procedure determines the amount of the third party
   gift applied to each designation and reduces that by the amount of 
   third party credit (both hard & soft) applied to that designation. </multilinecomment>
BEGIN
--
  update adbdesg
  set    --adbdesg_activity_date = sysdate,  -- Defect 1-14C1U47 commented
         adbdesg_amt_gift = nvl(adbdesg_amt_gift,0) + nvl(amt_in,0)
  where adbdesg_desg = desg_in ;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param desgIn
		* @param amtIn
		*/
		public void aUpdateAdbdesgAmtGift(NString desgIn, NNumber amtIn)
		{
			int rowCount = 0;
			// 
			String sql1 = "UPDATE adbdesg " +
	"SET adbdesg_amt_gift = nvl(adbdesg_amt_gift, 0) + nvl(:P_AMT_IN, 0) " +
	" WHERE adbdesg_desg = :P_DESG_IN";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_AMT_IN", amtIn);
			command1.addParameter("P_DESG_IN", desgIn);
			rowCount = command1.execute();
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_SEL_ID_PERS_INFO
	/*
	PROCEDURE A$_SEL_ID_PERS_INFO IS
<multilinecomment> Set :PIDM to NULL if :ID is null. FHL 2/16/95 </multilinecomment>
<multilinecomment> Raise FORM_TRIGGER_FAILUE & MESSAGE if :ID is null . FHL 3/20/95 </multilinecomment>
<multilinecomment> Added Indirect references to items to make compile. FHL 5/8/95 </multilinecomment>
<multilinecomment> Also added Local variables preceeded with "L_" & KEY_ID. FHL 5/8/95 </multilinecomment>
<multilinecomment> Put this procedure in new Alumni COMmoN Library AOQCOMN.pll FHL 2/12/96 </multilinecomment>
<multilinecomment> Add new version of A$_DECEASED_WARNING & A$_CONFIDENTIAL_WARNING to this library
   so this procedure would compile. FHL 2/12/96 </multilinecomment>
<multilinecomment> New function F_SELECT_DONOR_CAT added 8/8/96 FHL 
   to eliminate access to APVDPRI. </multilinecomment>
<multilinecomment> Added line for ID copy. 9/24/96 FHL </multilinecomment>
<multilinecomment> Added AOAEMAL below to WARN user if ID is not Constituent. FHL 1/31/97 </multilinecomment>
<multilinecomment> Change AOAEMAL to APAEMAL to Warn user that ID is not a Constituent. FHL 3/13/97 </multilinecomment>
<multilinecomment> add APASBIO to list below that gets a warning if not a Constituent. FHL 5/6/97 </multilinecomment>
<multilinecomment> modified to display spouse deceased ind for spouse with no ID  JB  08/19/97   </multilinecomment>
<multilinecomment> Modified to navigate to the Name with no ID entered for ID/Name search functionality  GD 07-30-98</multilinecomment>
<multilinecomment> LN 09/29/2004: modified to call a$_sel_id_info. </multilinecomment>
BEGIN
	A$_SEL_ID_INFO('P');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aSelIdPersInfo()
		{
			aSelIdInfo(toStr("P"));
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_SEL_ID_INFO
	/*
	PROCEDURE A$_SEL_ID_INFO(p_ID_TYPE IN VARCHAR2 DEFAULT 'ANY') IS
<multilinecomment> Check entity_ind & give different error message. FHL 2/15/95 </multilinecomment>
<multilinecomment> Set :PIDM to NULL if :ID is null. FHL 2/16/95 </multilinecomment>
<multilinecomment> Raise FORM_TRIGGER_FAILUE & MESSAGE if :ID is null . FHL 3/20/95 </multilinecomment>
<multilinecomment> Added Indirect references to items to make compile. FHL 5/4/95 </multilinecomment>
<multilinecomment> Also added Local variables preceeded with "L_" & KEY_ID. FHL 5/8/95 </multilinecomment>
<multilinecomment> Put this procedure in new Alumni COMmoN Library AOQCOMN.pll FHL 2/9/96 </multilinecomment>
<multilinecomment> Add new version of A$_DECEASED_WARNING & A$_CONFIDENTIAL_WARNING to this library
   so this procedure would compile. FHL 2/9/96 </multilinecomment>
<multilinecomment> New function F_SELECT_DONOR_CAT added 8/8/96 FHL 
   to eliminate access to APVDPRI. </multilinecomment>
<multilinecomment> Add AOAEMAL below to only Warn user that ID is not a Constituent. FHL 1/31/97 </multilinecomment>
<multilinecomment> Change AOAEMAL to APAEMAL to Warn user that ID is not a Constituent. FHL 3/13/97 </multilinecomment>
<multilinecomment> add APASBIO to list below that gets a warning if not a Constituent. FHL 5/6/97 </multilinecomment>
<multilinecomment> modified to display deceased ind for spouse with no ID  JB  08/19/97   </multilinecomment>
<multilinecomment> Modified to navigate to the Name with no ID entered for  ID/Name search functionality  GD 07-30-98</multilinecomment>
<multilinecomment> LN 09/29/2004: modified to call g$ routine for ID validation </multilinecomment>
--
  -- ID variables
  lv_id          SPRIDEN.SPRIDEN_ID%TYPE := NULL;
  lv_pidm        SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  lv_entity_ind  SPRIDEN.SPRIDEN_ENTITY_IND%TYPE := NULL;
  lv_full_name   VARCHAR2(230):= NULL;
  lv_confid_ind  VARCHAR2(30):= NULL;
  lv_dcsd_ind    VARCHAR2(30):= NULL;
  lv_not_cons_id BOOLEAN := FALSE;
  
  -- Spouse variables
  lv_sps_id          SPRIDEN.SPRIDEN_ID%TYPE := NULL;
  lv_sps_pidm        SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  lv_sps_full_name   VARCHAR2(230):= NULL;
  lv_sps_dcsd_ind    VARCHAR2(30):= NULL;
  lv_sps_confid_ind  VARCHAR2(30):= NULL; 
  lv_sps_surname_prefix SPRIDEN.SPRIDEN_SURNAME_PREFIX%TYPE := NULL;
  lv_sps_last_name   SPRIDEN.SPRIDEN_LAST_NAME%TYPE := NULL;
  lv_sps_first_name  SPRIDEN.SPRIDEN_FIRST_NAME%TYPE := NULL;
  lv_sps_mi_name     SPRIDEN.SPRIDEN_MI%TYPE := NULL;
  lv_sps_name_prefix SPBPERS.SPBPERS_NAME_PREFIX%TYPE := NULL;
  lv_sps_name_suffix SPBPERS.SPBPERS_NAME_SUFFIX%TYPE := NULL;
  lv_not_cons_sps_id BOOLEAN := FALSE;
  
  --
  lv_curr_form GUROPTM.GUROPTM_FORM_NAME%TYPE := TRIM(NAME_IN('SYSTEM.CURRENT_FORM'));
  lv_found  BOOLEAN := FALSE;
       
  -- Cursors
  -- Get spouse info from spriden
  CURSOR SEL_SPRIDEN_SPS_ID(p_pidm SPRIDEN.SPRIDEN_PIDM%TYPE) IS
    SELECT SPRIDEN_ID
    FROM   SPBPERS, APRCSPS, SPRIDEN
    WHERE  APRCSPS_MARS_IND = 'A'
      AND  APRCSPS_PIDM = p_pidm
      AND  SPRIDEN_PIDM = APRCSPS_SPS_PIDM
      AND  SPRIDEN_CHANGE_IND IS NULL
      AND  SPBPERS_PIDM (+) = APRCSPS_SPS_PIDM;

  -- Get non-constituent spouse info from aprcsps
  CURSOR SEL_NOT_CONS_SPS(p_pidm SPRIDEN.SPRIDEN_PIDM%TYPE) IS
    SELECT APRCSPS_LAST_NAME, APRCSPS_FIRST_NAME, APRCSPS_MI,
           APRCSPS_NAME_PREFIX, APRCSPS_NAME_SUFFIX,
           APRCSPS_SURNAME_PREFIX,
           DECODE(APRCSPS_DEAD_IND,
                  '','', 
                  G$_NLS.Get('AOQRPLS-0005', 'LIB','Deceased'))
    FROM   APRCSPS
    WHERE  APRCSPS_MARS_IND = 'A'
      AND  APRCSPS_PIDM = p_pidm;

  -- Functions/Procedures
  -- Populate the Category and Class of the given pidm.
  FUNCTION F_SEL_DONR_CAT_AND_CLASS(p_pidm       SPRIDEN.SPRIDEN_PIDM%TYPE,
                                    p_donr_cat   VARCHAR2,
                                    p_pref_class VARCHAR2) RETURN BOOLEAN IS
    lv_donr_cat   ATVDONR.ATVDONR_CODE%TYPE := NULL;
    lv_pref_class APBCONS.APBCONS_PREF_CLAS%TYPE := NULL;

    CURSOR PTI_CURSOR IS
      SELECT APBCONS_PREF_CLAS
      FROM   APBCONS
      WHERE  APBCONS_PIDM = p_pidm;
  BEGIN
    -- Get Category
    lv_donr_cat := SUBSTR(F_SELECT_DONOR_CATG(p_pidm), 1, 4);
    IF lv_donr_cat IS NOT NULL THEN
      COPY(lv_donr_cat, p_donr_cat);
    END IF;

    -- Get Class year
    IF lv_entity_ind = 'P' THEN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO lv_pref_class;
      IF lv_pref_class IS NOT NULL THEN
        COPY(lv_pref_class, p_pref_class);
      END IF;
      CLOSE PTI_CURSOR;
    ELSIF lv_entity_ind = 'C' THEN
      lv_pref_class := '@@@@';
    END IF;
    
    RETURN (lv_donr_cat IS NULL OR lv_pref_class IS NULL);
  END F_SEL_DONR_CAT_AND_CLASS;
  
  -- Display a not null deceased/confidential indicator
  PROCEDURE P_DISPLAY_ID_IND(p_item  VARCHAR2,
                             p_value VARCHAR2) IS
  BEGIN                               
    IF p_value IS NOT NULL THEN    
      SET_ITEM_PROPERTY(p_item, DISPLAYED, PROPERTY_ON);
      COPY(p_value, p_item);
    END IF;  
  END P_DISPLAY_ID_IND;
  
  -- Enable/disable the Spouse ID field and button.
  -- If Spouse ID is null, disable spouse ID field and button, else enable.
  PROCEDURE P_SET_SPS_ID_ITEMS IS
  BEGIN
    IF NAME_IN('SPS_IDNO') IS NULL THEN
    	-- Spouse ID is null, disable spouse ID field and button
      SET_ITEM_PROPERTY('SPS_IDNO', ENABLED, PROPERTY_OFF);
      SET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED,PROPERTY_OFF);
    ELSE
  	  -- Spouse ID is not null, enable spouse ID field and button
      IF GET_ITEM_PROPERTY('SPS_IDNO', ENABLED) = 'FALSE' THEN
        SET_ITEM_PROPERTY('SPS_IDNO', ENABLED, PROPERTY_ON);
        SET_ITEM_PROPERTY('SPS_IDNO', NAVIGABLE, PROPERTY_ON);
      END IF;
    
      IF GET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED) = 'FALSE' THEN
        SET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED, PROPERTY_ON);
      END IF;
    END IF;
  END P_SET_SPS_ID_ITEMS;	  
BEGIN
  -- Initialize ID and Spouse ID fields  	
  COPY('', 'FULL_NAME');
  COPY('', 'CONFID_IND');
  COPY('', 'DECEASED_IND');
  COPY('', 'DONR_CAT');
  COPY('', 'PREF_CLASS');
  SET_ITEM_PROPERTY('CONFID_IND',DISPLAYED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('DECEASED_IND',DISPLAYED,PROPERTY_OFF);
  --
  COPY('', 'SPS_IDNO');
  COPY('', 'SPS_PIDM');
  COPY('', 'SPS_NAME');
  COPY('', 'SPS_DECEASED_IND');
  COPY('', 'SPS_DONR_CAT');
  COPY('', 'SPS_PREF_CLASS');
  SET_ITEM_PROPERTY('SPS_DECEASED_IND',DISPLAYED,PROPERTY_OFF);

  -- Get the given ID
  lv_id := NAME_IN('ID'); 
  
  -- defect#1-M05LDQ set Global to N if ID changed
  IF lv_id <> NAME_IN('GLOBAL.KEY_IDNO') THEN 
    copy('N','GLOBAL.FORM_USER_ALERTS_IND');
  END IF; 

  IF lv_id IS NULL THEN
    -- ID is null
    COPY('', 'GLOBAL.KEY_IDNO');
    COPY('', 'PIDM');
    P_SET_SPS_ID_ITEMS; 
    RETURN;
  END IF;
  --
  IF lv_id = 'GENERATED' THEN
  	-- Attempt generating a new ID
    RETURN;
  END IF;
  
  -- Validate the given ID.
  G$_VALID_ALL_ID(lv_id, lv_pidm, lv_full_name, lv_confid_ind, lv_dcsd_ind, 
                  NULL, p_ID_TYPE, GET_ITEM_PROPERTY('FULL_NAME', MAX_LENGTH));

  IF lv_pidm IS NULL THEN   
  	-- ID is not found               
    RETURN;
  END IF;
  
	-- ID is found, populate its associated data.
	IF lv_id <> NAME_IN('ID') THEN
    COPY(lv_id, 'ID');
	END IF;
	
  COPY(lv_pidm, 'PIDM');
  COPY(lv_full_name, 'FULL_NAME');

  -- ID's entity indicator  
  lv_entity_ind := gb_identification.f_get_entity(lv_pidm);
  COPY(lv_entity_ind, 'ENTITY_IND');

  IF lv_entity_ind = 'P' THEN
    -- Person ID, display not null confidential and deceased indicators
    P_DISPLAY_ID_IND('CONFID_IND', lv_confid_ind);
    P_DISPLAY_ID_IND('DECEASED_IND', lv_dcsd_ind);
  END IF;  

  -- ID's Category and Class
  lv_not_cons_id := F_SEL_DONR_CAT_AND_CLASS(lv_pidm, 'DONR_CAT', 'PREF_CLASS');

  IF lv_not_cons_id AND lv_curr_form <> 'ASICONT' THEN
    -- Not a constituent ID  
    IF lv_curr_form IN ('ADISAWD', 'APACONS', 'APAEMAL', 'APAIDEN', 
    	                  'APANAME', 'APAPERS', 'APASBIO', 'APATELE', 
    	                  'APAXREF', 'APCADDR', 'AUAMAIL') THEN
      MESSAGE(G$_NLS.Get('AOQRPLS-0006', 'LIB', '*WARNING* Not a constituent.'), 
              NO_ACKNOWLEDGE);
    ELSE
      IF lv_entity_ind = 'C' THEN
        MESSAGE(G$_NLS.Get('AOQRPLS-0007', 'LIB','*ERROR* Not an Advancement organization.'));
      ELSE
        MESSAGE(G$_NLS.Get('AOQRPLS-0008', 'LIB','*ERROR* Not a constituent.'));
      END IF;

      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
    END IF; 
  END IF;  

  IF lv_entity_ind = 'P' THEN
    -- Valid constituent ID, get spouse information.
    OPEN SEL_SPRIDEN_SPS_ID(lv_pidm);
    FETCH SEL_SPRIDEN_SPS_ID INTO lv_sps_id;
    lv_found := SEL_SPRIDEN_SPS_ID%FOUND; 
	  CLOSE SEL_SPRIDEN_SPS_ID;
	
    IF lv_found THEN
      -- Spouse is a constituent and exists in spriden, get its associated information
	    G$_VALID_ALL_ID(lv_sps_id, lv_sps_pidm, lv_sps_full_name, 
	                    lv_sps_confid_ind, lv_sps_dcsd_ind, 
	                    'YYNNN', NULL, GET_ITEM_PROPERTY('SPS_NAME', MAX_LENGTH));
      COPY(TO_CHAR(lv_sps_pidm), 'SPS_PIDM');
      COPY(lv_sps_id, 'SPS_IDNO');
      COPY(lv_sps_full_name, 'SPS_NAME');
      P_DISPLAY_ID_IND('SPS_DECEASED_IND', lv_sps_dcsd_ind);

      -- Spouse's donor Category and class
      lv_not_cons_sps_id := F_SEL_DONR_CAT_AND_CLASS(lv_sps_pidm, 
                                                     'SPS_DONR_CAT', 
                                                     'SPS_PREF_CLASS');
    ELSE	
    	-- Spouse is not a constituent and does not exit in spriden
      OPEN SEL_NOT_CONS_SPS(lv_pidm);
      FETCH SEL_NOT_CONS_SPS INTO lv_sps_last_name, lv_sps_first_name, lv_sps_mi_name,
                                  lv_sps_name_prefix, lv_sps_name_suffix, lv_sps_surname_prefix,
                                  lv_sps_dcsd_ind;
      lv_found := SEL_NOT_CONS_SPS%FOUND;
    	CLOSE SEL_NOT_CONS_SPS;   	
                                      
      IF lv_found THEN
      	G$_BUILD_FULL_NAME(lv_sps_full_name, 
      	                   lv_sps_last_name, lv_sps_first_name, lv_sps_mi_name,
                           lv_sps_name_prefix, lv_sps_name_suffix, 
                           GET_ITEM_PROPERTY('SPS_NAME', MAX_LENGTH),
                           lv_sps_surname_prefix);
        COPY(lv_sps_full_name, 'SPS_NAME');
        COPY('', 'SPS_IDNO');
      	COPY('', 'SPS_PIDM');
        P_DISPLAY_ID_IND('SPS_DECEASED_IND', lv_sps_dcsd_ind);
      END IF;
    END IF;
  END IF;
  
  IF lv_id <> NAME_IN('GLOBAL.KEY_IDNO') THEN 
    COPY(lv_id, 'GLOBAL.KEY_IDNO');
  END IF;

  -- If Spouse ID is null, disable spouse ID field and button, else enable.
  P_SET_SPS_ID_ITEMS;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aSelIdInfo() {
			aSelIdInfo(toStr("ANY"));
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pIdType
		*/
		public void aSelIdInfo(NString pIdType)
		{
			int rowCount = 0;
			//  Check entity_ind & give different error message. FHL 2/15/95 
			//  Set :PIDM to NULL if :ID is null. FHL 2/16/95 
			//  Raise FORM_TRIGGER_FAILUE & MESSAGE if :ID is null . FHL 3/20/95 
			//  Added Indirect references to items to make compile. FHL 5/4/95 
			//  Also added Local variables preceeded with "L_" & KEY_ID. FHL 5/8/95 
			//  Put this procedure in new Alumni COMmoN Library AOQCOMN.pll FHL 2/9/96 
			//  Add new version of A$_DECEASED_WARNING & A$_CONFIDENTIAL_WARNING to this library
			// so this procedure would compile. FHL 2/9/96 
			//  New function F_SELECT_DONOR_CAT added 8/8/96 FHL
			// to eliminate access to APVDPRI. 
			//  Add AOAEMAL below to only Warn user that ID is not a Constituent. FHL 1/31/97 
			//  Change AOAEMAL to APAEMAL to Warn user that ID is not a Constituent. FHL 3/13/97 
			//  add APASBIO to list below that gets a warning if not a Constituent. FHL 5/6/97 
			//  modified to display deceased ind for spouse with no ID  JB  08/19/97   
			//  Modified to navigate to the Name with no ID entered for  ID/Name search functionality  GD 07-30-98
			//  LN 09/29/2004: modified to call g$ routine for ID validation 
			// 
			//  ID variables
			NString lvId = NString.getNull();
			NNumber lvPidm = NNumber.getNull();
			NString lvEntityInd = NString.getNull();
			NString lvFullName = NString.getNull();
			NString lvConfidInd = NString.getNull();
			NString lvDcsdInd = NString.getNull();
			NBool lvNotConsId = toBool(NBool.False);
			//  Spouse variables
			NString lvSpsId = NString.getNull();
			NNumber lvSpsPidm = NNumber.getNull();
			NString lvSpsFullName = NString.getNull();
			NString lvSpsDcsdInd = NString.getNull();
			NString lvSpsConfidInd = NString.getNull();
			NString lvSpsSurnamePrefix = NString.getNull();
			NString lvSpsLastName = NString.getNull();
			NString lvSpsFirstName = NString.getNull();
			NString lvSpsMiName = NString.getNull();
			NString lvSpsNamePrefix = NString.getNull();
			NString lvSpsNameSuffix = NString.getNull();
			NBool lvNotConsSpsId = toBool(NBool.False);
			// 
			NString lvCurrForm = trim(getCurrentTaskName());
			NBool lvFound = toBool(NBool.False);
			String sqlselSpridenSpsId = "SELECT SPRIDEN_ID " +
	" FROM SPBPERS, APRCSPS, SPRIDEN " +
	" WHERE APRCSPS_MARS_IND = 'A' AND APRCSPS_PIDM = :P_P_PIDM AND SPRIDEN_PIDM = APRCSPS_SPS_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND SPBPERS_PIDM(+) = APRCSPS_SPS_PIDM ";
			DataCursor selSpridenSpsId = new DataCursor(sqlselSpridenSpsId);
			String sqlselNotConsSps = "SELECT APRCSPS_LAST_NAME, APRCSPS_FIRST_NAME, APRCSPS_MI, APRCSPS_NAME_PREFIX, APRCSPS_NAME_SUFFIX, APRCSPS_SURNAME_PREFIX, DECODE(APRCSPS_DEAD_IND, '', '', G$_NLS.Get('AOQRPLS-0005', 'LIB', 'Deceased')) " +
	" FROM APRCSPS " +
	" WHERE APRCSPS_MARS_IND = 'A' AND APRCSPS_PIDM = :P_P_PIDM ";
			DataCursor selNotConsSps = new DataCursor(sqlselNotConsSps);
			NString pPidm = NString.getNull();
			try {
				//  Initialize ID and Spouse ID fields  	
				copy("","FULL_NAME");
				copy("","CONFID_IND");
				copy("","DECEASED_IND");
				copy("","DONR_CAT");
				copy("","PREF_CLASS");
				setItemVisible("CONFID_IND", false);
				setItemVisible("DECEASED_IND", false);
				// 
				copy("","SPS_IDNO");
				copy("","SPS_PIDM");
				copy("","SPS_NAME");
				copy("","SPS_DECEASED_IND");
				copy("","SPS_DONR_CAT");
				copy("","SPS_PREF_CLASS");
				setItemVisible("SPS_DECEASED_IND", false);
				//  Get the given ID
				lvId = getNameIn("ID");
				//  defect#1-M05LDQ set Global to N if ID changed
				if ( lvId.notEquals(getNameIn("GLOBAL.KEY_IDNO")) )
				{
					copy("N","GLOBAL.FORM_USER_ALERTS_IND");
				}
				if ( lvId.isNull() )
				{
					//  ID is null
					copy("","GLOBAL.KEY_IDNO");
					copy("","PIDM");
					ASelIdInfo_pSetSpsIdItems_Local();
					return ;
				}
				// 
				if ( lvId.equals("GENERATED") )
				{
					//  Attempt generating a new ID
					return ;
				}
				//  Validate the given ID.
				// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
								Ref<NString> pId_ref = new Ref<NString>(lvId);
								Ref<NNumber> pPidm_ref = new Ref<NNumber>(lvPidm);
								Ref<NString> pFullName_ref = new Ref<NString>(lvFullName);
								Ref<NString> pConfidInd_ref = new Ref<NString>(lvConfidInd);
								Ref<NString> pDcsdInd_ref = new Ref<NString>(lvDcsdInd);
								getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, toStr(null), pIdType, toInt(90));
								lvId = pId_ref.val;
								lvPidm = pPidm_ref.val;
								lvFullName = pFullName_ref.val;
								lvConfidInd = pConfidInd_ref.val;
								lvDcsdInd = pDcsdInd_ref.val;
				
				
				if ( lvPidm.isNull() )
				{
					//  ID is not found               
					return ;
				}
				//  ID is found, populate its associated data.
				if ( lvId.notEquals(getNameIn("ID")) )
				{
					copy(lvId,"ID");
				}
				copy(lvPidm,"PIDM");
				copy(lvFullName,"FULL_NAME");
				//  ID's entity indicator  
				lvEntityInd = GbIdentification.fGetEntity(lvPidm);
				copy(lvEntityInd,"ENTITY_IND");
				if ( lvEntityInd.equals("P") )
				{
					//  Person ID, display not null confidential and deceased indicators
					ASelIdInfo_pDisplayIdInd_Local(toStr("CONFID_IND"), lvConfidInd);
					ASelIdInfo_pDisplayIdInd_Local(toStr("DECEASED_IND"), lvDcsdInd);
				}
				//  ID's Category and Class
				lvNotConsId = ASelIdInfo_fSelDonrCatAndClass_Local(lvPidm, toStr("DONR_CAT"), toStr("PREF_CLASS"), lvEntityInd);
				if ( lvNotConsId.getValue() && lvCurrForm.notEquals("ASICONT"))
				{
					//  Not a constituent ID  
					if ( in(lvCurrForm, "ADISAWD", "APACONS", "APAEMAL", "APAIDEN", "APANAME", "APAPERS", "APASBIO", "APATELE", "APAXREF", "APCADDR", "AUAMAIL").getValue() )
					{
						warningMessage(GNls.Fget(toStr("AOQRPLS-0006"), toStr("LIB"), toStr("*WARNING* Not a constituent.")));
					}
					else {
						if ( lvEntityInd.equals("C") )
						{
							errorMessage(GNls.Fget(toStr("AOQRPLS-0007"), toStr("LIB"), toStr("*ERROR* Not an Advancement organization.")));
						}
						else {
							errorMessage(GNls.Fget(toStr("AOQRPLS-0008"), toStr("LIB"), toStr("*ERROR* Not a constituent.")));
						}
						throw new ApplicationException();
					}
				}
				if ( lvEntityInd.equals("P") )
				{
					//  Valid constituent ID, get spouse information.
					pPidm=toStr(lvPidm);
					//Setting query parameters
					selSpridenSpsId.addParameter("P_P_PIDM", pPidm);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable selSpridenSpsId.
					selSpridenSpsId.open();
					ResultSet selSpridenSpsIdResults = selSpridenSpsId.fetchInto();
					if ( selSpridenSpsIdResults != null ) {
						lvSpsId = selSpridenSpsIdResults.getStr(0);
					}
					lvFound = toBool(selSpridenSpsId.found());
					selSpridenSpsId.close();
					if ( lvFound.getValue() )
					{
						//  Spouse is a constituent and exists in spriden, get its associated information
						// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
												pId_ref = new Ref<NString>(lvSpsId);
												pPidm_ref = new Ref<NNumber>(lvSpsPidm);
												pFullName_ref = new Ref<NString>(lvSpsFullName);
												pConfidInd_ref = new Ref<NString>(lvSpsConfidInd);
												pDcsdInd_ref = new Ref<NString>(lvSpsDcsdInd);
												getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, toStr("YYNNN"), toStr(null), toInt(90));
												lvSpsId = pId_ref.val;
												lvSpsPidm = pPidm_ref.val;
												lvSpsFullName = pFullName_ref.val;
												lvSpsConfidInd = pConfidInd_ref.val;
												lvSpsDcsdInd = pDcsdInd_ref.val;
						//System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
						
						copy(toChar(lvSpsPidm),"SPS_PIDM");
						copy(lvSpsId,"SPS_IDNO");
						copy(lvSpsFullName,"SPS_NAME");
						ASelIdInfo_pDisplayIdInd_Local(toStr("SPS_DECEASED_IND"), lvSpsDcsdInd);
						//  Spouse's donor Category and class
						lvNotConsSpsId = ASelIdInfo_fSelDonrCatAndClass_Local(lvSpsPidm, toStr("SPS_DONR_CAT"), toStr("SPS_PREF_CLASS"), lvEntityInd);
					}
					else {
						//  Spouse is not a constituent and does not exit in spriden
						pPidm=toStr(lvPidm);
						//Setting query parameters
						selNotConsSps.addParameter("P_P_PIDM", pPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable selNotConsSps.
						selNotConsSps.open();
						ResultSet selNotConsSpsResults = selNotConsSps.fetchInto();
						if ( selNotConsSpsResults != null ) {
							lvSpsLastName = selNotConsSpsResults.getStr(0);
							lvSpsFirstName = selNotConsSpsResults.getStr(1);
							lvSpsMiName = selNotConsSpsResults.getStr(2);
							lvSpsNamePrefix = selNotConsSpsResults.getStr(3);
							lvSpsNameSuffix = selNotConsSpsResults.getStr(4);
							lvSpsSurnamePrefix = selNotConsSpsResults.getStr(5);
							lvSpsDcsdInd = selNotConsSpsResults.getStr(6);
						}
						lvFound = toBool(selNotConsSps.found());
						selNotConsSps.close();
						if ( lvFound.getValue() )
						{
							// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
							//							pFullName_ref = new Ref<NString>(lvSpsFullName);
							//							getGoqrpls().gBuildFullName(pFullName_ref, lvSpsLastName, lvSpsFirstName, lvSpsMiName, lvSpsNamePrefix, lvSpsNameSuffix, toInt(SupportClasses.FORMS40.GetItemProperty("SPS_NAME", SupportClasses.Property.MAX_LENGTH)), lvSpsSurnamePrefix);
							//							lvSpsFullName = pFullName_ref.val;
							//System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
							
							pFullName_ref = new Ref<NString>(lvSpsFullName);
							getGoqrpls().gBuildFullName(pFullName_ref, lvSpsLastName, lvSpsFirstName, lvSpsMiName, lvSpsNamePrefix, lvSpsNameSuffix, toInt(90), lvSpsSurnamePrefix);
							lvSpsFullName = pFullName_ref.val;
							
							copy(lvSpsFullName,"SPS_NAME");
							copy("","SPS_IDNO");
							copy("","SPS_PIDM");
							ASelIdInfo_pDisplayIdInd_Local(toStr("SPS_DECEASED_IND"), lvSpsDcsdInd);
						}
					}
				}
				if ( lvId.notEquals(getNameIn("GLOBAL.KEY_IDNO")) )
				{
					copy(lvId,"GLOBAL.KEY_IDNO");
				}
				//  If Spouse ID is null, disable spouse ID field and button, else enable.
				ASelIdInfo_pSetSpsIdItems_Local();
				}finally{
					selSpridenSpsId.close();
					selNotConsSps.close();
				}
		}
/* <p>
		*  Display a not null deceased/confidential indicator
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItem
		* @param pValue
		*/
		public void ASelIdInfo_pDisplayIdInd_Local(NString pItem, NString pValue)
		{
			if ( !pValue.isNull() )
			{
				setItemVisible(pItem, true);
				copy(pValue,pItem);
			}
		}
/* <p>
		*  Enable/disable the Spouse ID field and button.
		*  If Spouse ID is null, disable spouse ID field and button, else enable.
		* F2J_PURE_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void ASelIdInfo_pSetSpsIdItems_Local()
		{
			if ( getNameIn("SPS_IDNO").isNull() )
			{
				//  Spouse ID is null, disable spouse ID field and button
				setItemEnabled("SPS_IDNO", false);
				setItemEnabled("SPS_IDNO_LBT", false);
			}
			else {
				//  Spouse ID is not null, enable spouse ID field and button
				if ( getItemEnabled("SPS_IDNO").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO", true);
					setItemNavigable("SPS_IDNO", true);
				}
				if ( getItemEnabled("SPS_IDNO_LBT").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO_LBT", true);
				}
			}
		}
/* <p>
		*  Functions/Procedures
		*  Populate the Category and Class of the given pidm.
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pDonrCat
		* @param pPrefClass
		*/
		public NBool ASelIdInfo_fSelDonrCatAndClass_Local(NNumber pPidm, NString pDonrCat, NString pPrefClass, NString lvEntityInd)
		{
			NString lvDonrCat = NString.getNull();
			NString lvPrefClass = NString.getNull();
			String sqlptiCursor = "SELECT APBCONS_PREF_CLAS " +
	" FROM APBCONS " +
	" WHERE APBCONS_PIDM = :P_P_PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//  Get Category
				lvDonrCat = substring(fSelectDonorCatg(pPidm), toInt(1), toInt(4));
				if ( !lvDonrCat.isNull() )
				{
					copy(lvDonrCat,pDonrCat);
				}
				//  Get Class year
				if ( lvEntityInd.equals("P") )
				{
					//Setting query parameters
					ptiCursor.addParameter("P_P_PIDM", pPidm);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						lvPrefClass = ptiCursorResults.getStr(0);
					}
					if ( !lvPrefClass.isNull() )
					{
						copy(lvPrefClass,pPrefClass);
					}
					ptiCursor.close();
				}
				else if ( lvEntityInd.equals("C") ) {
					lvPrefClass = toStr("@@@@");
				}
				return toBool((lvDonrCat.isNull() || lvPrefClass.isNull()));
				}finally{
					ptiCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_PLEDGE_VEHICLE
	/*
	FUNCTION A$_PLEDGE_VEHICLE ( PIDM_IN      IN NUMBER,
                             PLDG_NO_IN   IN VARCHAR2 )
   RETURN VARCHAR2 IS
<multilinecomment> This Procedure (Function) will return the Vehicle code for the PIDM and
   Pledge No. arguments passed . 
   FHL 10/01/97
</multilinecomment>
      CURSOR PLDG_CURSOR IS
         SELECT AGBPLDG_PGVE_CODE
         FROM   AGBPLDG
         WHERE  AGBPLDG_PIDM      = PIDM_IN
         AND    AGBPLDG_PLEDGE_NO = PLDG_NO_IN ;
      PGVE_CODE VARCHAR2(5);
   BEGIN
     OPEN    PLDG_CURSOR ;
     FETCH   PLDG_CURSOR INTO PGVE_CODE ;
     RETURN (PGVE_CODE) ;
     CLOSE   PLDG_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param pldgNoIn
		*/
		public NString aPledgeVehicle(NNumber pidmIn, NString pldgNoIn)
		{
			int rowCount = 0;
			String sqlpldgCursor = "SELECT AGBPLDG_PGVE_CODE " +
	" FROM AGBPLDG " +
	" WHERE AGBPLDG_PIDM = :P_PIDM_IN AND AGBPLDG_PLEDGE_NO = :P_PLDG_NO_IN ";
			DataCursor pldgCursor = new DataCursor(sqlpldgCursor);
			NString pgveCode= NString.getNull();
			try {
				//Setting query parameters
				pldgCursor.addParameter("P_PIDM_IN", pidmIn);
				pldgCursor.addParameter("P_PLDG_NO_IN", pldgNoIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pldgCursor.
				pldgCursor.open();
				ResultSet pldgCursorResults = pldgCursor.fetchInto();
				if ( pldgCursorResults != null ) {
					pgveCode = pldgCursorResults.getStr(0);
				}
				return ((pgveCode));
			}finally{
				pldgCursor.close();
			}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_PERSON_3RD_PARTY_CREDIT
	/*
	FUNCTION A$_PERSON_3RD_PARTY_CREDIT(CREDIT_PIDM    IN NUMBER,
                                    THIRD_P_PLEDGE IN VARCHAR2,
                                    CAMP           IN VARCHAR2,
                                    DESG           IN VARCHAR2,
                                    HARD_OR_SOFT   IN VARCHAR2 ) 
 RETURN NUMBER IS
--
 tot_hard_3p_credit     NUMBER := 0;
 tot_soft_3p_credit     NUMBER := 0;
--
 cursor TOTAL_HARD_3P_AMT is
        SELECT NVL(SUM(AGRGMLT_3PP_AMT),0)
        FROM   AGRGMLT
        WHERE  AGRGMLT_XREF_PIDM       = CREDIT_PIDM
        AND   (( AGRGMLT_3PP_PLEDGE_NO = THIRD_P_PLEDGE and
                 THIRD_P_PLEDGE is not null)
              or THIRD_P_PLEDGE is null)
        AND   (( AGRGMLT_CAMPAIGN = CAMP and CAMP is not null )
                 or CAMP is null )
        AND   (( AGRGMLT_DESG = DESG and DESG is not null )
                 or DESG is null );
 cursor TOTAL_SOFT_3P_AMT is
        SELECT NVL(SUM(AGRGMMO_3PP_AMT),0)
        FROM   AGRGMMO
        WHERE  AGRGMMO_XREF_PIDM       = CREDIT_PIDM
        AND   (( AGRGMMO_3PP_PLEDGE_NO = THIRD_P_PLEDGE and
                 THIRD_P_PLEDGE is not null)
              or THIRD_P_PLEDGE is null)
        AND   (( AGRGMMO_CAMPAIGN = CAMP and CAMP is not null )
                 or CAMP is null )
        AND   (( AGRGMMO_DESG = DESG and DESG is not null )
                 or DESG is null );
BEGIN
   OPEN  TOTAL_HARD_3P_AMT;
   FETCH TOTAL_HARD_3P_AMT into tot_hard_3p_credit;
   CLOSE TOTAL_HARD_3P_AMT;
   OPEN  TOTAL_SOFT_3P_AMT;
   FETCH TOTAL_SOFT_3P_AMT into tot_soft_3p_credit;
   CLOSE TOTAL_SOFT_3P_AMT;
--
  IF HARD_OR_SOFT = 'SOFT' THEN
     RETURN TRUNC(tot_soft_3p_credit, 2);
    ELSIF HARD_OR_SOFT = 'HARD' THEN
     RETURN TRUNC(tot_hard_3p_credit, 2);
    ELSE
     RETURN TRUNC(tot_hard_3p_credit + tot_soft_3p_credit, 2);
   END IF;
--
RETURN NULL; END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param creditPidm
		* @param thirdPPledge
		* @param camp
		* @param desg
		* @param hardOrSoft
		*/
		public NNumber aPerson3rdPartyCredit(NNumber creditPidm, NString thirdPPledge, NString camp, NString desg, NString hardOrSoft)
		{
			int rowCount = 0;
			// 
			NNumber totHard3pCredit = toNumber(0);
			NNumber totSoft3pCredit = toNumber(0);
			String sqltotalHard3pAmt = "SELECT NVL(SUM(AGRGMLT_3PP_AMT), 0) " +
	" FROM AGRGMLT " +
	" WHERE AGRGMLT_XREF_PIDM = :P_CREDIT_PIDM AND ((AGRGMLT_3PP_PLEDGE_NO = :P_THIRD_P_PLEDGE AND :P_THIRD_P_PLEDGE IS NOT NULL) OR :P_THIRD_P_PLEDGE IS NULL) AND ((AGRGMLT_CAMPAIGN = :P_CAMP AND :P_CAMP IS NOT NULL) OR :P_CAMP IS NULL) AND ((AGRGMLT_DESG = :P_DESG AND :P_DESG IS NOT NULL) OR :P_DESG IS NULL) ";
			DataCursor totalHard3pAmt = new DataCursor(sqltotalHard3pAmt);
			String sqltotalSoft3pAmt = "SELECT NVL(SUM(AGRGMMO_3PP_AMT), 0) " +
	" FROM AGRGMMO " +
	" WHERE AGRGMMO_XREF_PIDM = :P_CREDIT_PIDM AND ((AGRGMMO_3PP_PLEDGE_NO = :P_THIRD_P_PLEDGE AND :P_THIRD_P_PLEDGE IS NOT NULL) OR :P_THIRD_P_PLEDGE IS NULL) AND ((AGRGMMO_CAMPAIGN = :P_CAMP AND :P_CAMP IS NOT NULL) OR :P_CAMP IS NULL) AND ((AGRGMMO_DESG = :P_DESG AND :P_DESG IS NOT NULL) OR :P_DESG IS NULL) ";
			DataCursor totalSoft3pAmt = new DataCursor(sqltotalSoft3pAmt);
			try {
				//Setting query parameters
				totalHard3pAmt.addParameter("P_CREDIT_PIDM", creditPidm);
				totalHard3pAmt.addParameter("P_THIRD_P_PLEDGE", thirdPPledge);
				totalHard3pAmt.addParameter("P_CAMP", camp);
				totalHard3pAmt.addParameter("P_DESG", desg);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalHard3pAmt.
				totalHard3pAmt.open();
				ResultSet totalHard3pAmtResults = totalHard3pAmt.fetchInto();
				if ( totalHard3pAmtResults != null ) {
					totHard3pCredit = totalHard3pAmtResults.getNumber(0);
				}
				totalHard3pAmt.close();
				//Setting query parameters
				totalSoft3pAmt.addParameter("P_CREDIT_PIDM", creditPidm);
				totalSoft3pAmt.addParameter("P_THIRD_P_PLEDGE", thirdPPledge);
				totalSoft3pAmt.addParameter("P_CAMP", camp);
				totalSoft3pAmt.addParameter("P_DESG", desg);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalSoft3pAmt.
				totalSoft3pAmt.open();
				ResultSet totalSoft3pAmtResults = totalSoft3pAmt.fetchInto();
				if ( totalSoft3pAmtResults != null ) {
					totSoft3pCredit = totalSoft3pAmtResults.getNumber(0);
				}
				totalSoft3pAmt.close();
				// 
				if ( hardOrSoft.equals("SOFT") )
				{
					return trunc(totSoft3pCredit, 2);
				}
				else if ( hardOrSoft.equals("HARD") ) {
					return trunc(totHard3pCredit, 2);
				}
				else {
					return trunc(totHard3pCredit.add(totSoft3pCredit), 2);
				}
				}finally{
					totalHard3pAmt.close();
					totalSoft3pAmt.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_PCAT_CODE_OK_2_DEL
	/*
	PROCEDURE A$_PCAT_CODE_OK_2_DEL ( CODE_IN IN VARCHAR2) IS
<multilinecomment> This Procedure will determine if the Pledge Category Code passed when invoked
   is OK to Delete. This Procedure will produce an error message and raise
   FORM_TRIGGER_FAILURE if the pledge category code should NOT be deleted
   because of Referential Integrity Constraints.

IE:  Create a KEY-DELREC Trigger in ATVPCAT block of Module ATVPCAT that looks like:

    A$_PCAT_CODE_OK_2_DEL(:atvpcat_code);
    G$_CHECK_FAILURE;
    DELETE_RECORD;
</multilinecomment>
      CURSOR PCAT_CURSOR IS
         SELECT 'TRUE'
         FROM   DUAL
         WHERE  NOT EXISTS
                ( SELECT *
                  FROM   AUBINST
                  WHERE  AUBINST_DEF_UNCOND_PCAT_CODE = CODE_IN )
         AND    NOT EXISTS
                ( SELECT *
                  FROM   AGBPDEF
                  WHERE  AGBPDEF_USER <> ' '
                  AND    AGBPDEF_PCAT_CODE = CODE_IN )
         AND    NOT EXISTS
                ( SELECT *
                  FROM   AGBPLDG
                  WHERE  AGBPLDG_PIDM > 0
                  AND    AGBPLDG_PLEDGE_NO <> ' '
                  AND    AGBPLDG_PCAT_CODE = CODE_IN )
         AND    NOT EXISTS
                ( SELECT *
                  FROM   AGRAPLG
                  WHERE  AGRAPLG_PIDM > 0
                  AND    AGRAPLG_PLEDGE_NO <> ' '
                  AND   ( AGRAPLG_PCAT_CODE     = CODE_IN
                      OR  AGRAPLG_PCAT_CODE_ADJ = CODE_IN ) );
     MY_AREA VARCHAR2(4);
   BEGIN
      OPEN PCAT_CURSOR ;
      FETCH PCAT_CURSOR INTO MY_AREA ;
      IF NOT (PCAT_CURSOR%FOUND) THEN
         MESSAGE( G$_NLS.Get('AOQRPLS-0004', 'LIB','*ERROR* Invalid Delete; This Pledge Category code is currently in use.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public void aPcatCodeOk2Del(NString codeIn)
		{
			int rowCount = 0;
			String sqlpcatCursor = "SELECT 'TRUE' " +
	" FROM DUAL " +
	" WHERE  NOT EXISTS(SELECT * " +
		" FROM AUBINST " +
		" WHERE AUBINST_DEF_UNCOND_PCAT_CODE = :P_CODE_IN ) AND  NOT EXISTS(SELECT * " +
		" FROM AGBPDEF " +
		" WHERE AGBPDEF_USER <> ' ' AND AGBPDEF_PCAT_CODE = :P_CODE_IN ) AND  NOT EXISTS(SELECT * " +
		" FROM AGBPLDG " +
		" WHERE AGBPLDG_PIDM > 0 AND AGBPLDG_PLEDGE_NO <> ' ' AND AGBPLDG_PCAT_CODE = :P_CODE_IN ) AND  NOT EXISTS(SELECT * " +
		" FROM AGRAPLG " +
		" WHERE AGRAPLG_PIDM > 0 AND AGRAPLG_PLEDGE_NO <> ' ' AND (AGRAPLG_PCAT_CODE = :P_CODE_IN OR AGRAPLG_PCAT_CODE_ADJ = :P_CODE_IN) ) ";
			DataCursor pcatCursor = new DataCursor(sqlpcatCursor);
			NString myArea= NString.getNull();
			try {
				//Setting query parameters
				pcatCursor.addParameter("P_CODE_IN", codeIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pcatCursor.
				pcatCursor.open();
				ResultSet pcatCursorResults = pcatCursor.fetchInto();
				if ( pcatCursorResults != null ) {
					myArea = pcatCursorResults.getStr(0);
				}
				if ( !(pcatCursor.found()) )
				{
					errorMessage(GNls.Fget(toStr("AOQRPLS-0004"), toStr("LIB"), toStr("*ERROR* Invalid Delete; This Pledge Category code is currently in use.")));
					throw new ApplicationException();
				}
				}finally{
					pcatCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_NAV_TO_REQUESTED_OBJECT
	/*
	PROCEDURE A$_NAV_TO_REQUESTED_OBJECT IS
BEGIN
  IF NAME_IN('GLOBAL.OBJECT_CALLED') IS NULL THEN
      RETURN;
  END IF;
  IF NAME_IN('GLOBAL.OBJECT_CALLED_TYPE') = 'ITEM' THEN
     GO_ITEM(NAME_IN('GLOBAL.OBJECT_CALLED'));
  ELSIF NAME_IN('GLOBAL.OBJECT_CALLED_TYPE') = 'BLOCK' THEN
     GO_BLOCK(NAME_IN('GLOBAL.OBJECT_CALLED'));
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aNavToRequestedObject()
		{
			if ( getNameIn("GLOBAL.OBJECT_CALLED").isNull() )
			{
				return ;
			}
			if ( getNameIn("GLOBAL.OBJECT_CALLED_TYPE").equals("ITEM") )
			{
				goItem(getNameIn("GLOBAL.OBJECT_CALLED"));
			}
			else if ( getNameIn("GLOBAL.OBJECT_CALLED_TYPE").equals("BLOCK") ) {
				goBlock(getNameIn("GLOBAL.OBJECT_CALLED"));
			}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_GIFT_VEHICLE
	/*
	FUNCTION A$_GIFT_VEHICLE ( PIDM_IN      IN NUMBER,
                           GIFT_NO_IN   IN VARCHAR2 )
   RETURN VARCHAR2 IS
<multilinecomment> This Procedure (Function) will return the Vehicle code for the PIDM and
   Gift No. arguments passed . 
   FHL 10/01/97
</multilinecomment>
      CURSOR GIFT_CURSOR IS
         SELECT AGBGIFT_PGVE_CODE
         FROM   AGBGIFT
         WHERE  AGBGIFT_PIDM    = PIDM_IN
         AND    AGBGIFT_GIFT_NO = GIFT_NO_IN ;
      PGVE_CODE VARCHAR2(5);
   BEGIN
     OPEN    GIFT_CURSOR ;
     FETCH   GIFT_CURSOR INTO PGVE_CODE ;
     RETURN (PGVE_CODE) ;
     CLOSE   GIFT_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param giftNoIn
		*/
		public NString aGiftVehicle(NNumber pidmIn, NString giftNoIn)
		{
			int rowCount = 0;
			String sqlgiftCursor = "SELECT AGBGIFT_PGVE_CODE " +
	" FROM AGBGIFT " +
	" WHERE AGBGIFT_PIDM = :P_PIDM_IN AND AGBGIFT_GIFT_NO = :P_GIFT_NO_IN ";
			DataCursor giftCursor = new DataCursor(sqlgiftCursor);
			NString pgveCode= NString.getNull();
			try {
				//Setting query parameters
				giftCursor.addParameter("P_PIDM_IN", pidmIn);
				giftCursor.addParameter("P_GIFT_NO_IN", giftNoIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable giftCursor.
				giftCursor.open();
				ResultSet giftCursorResults = giftCursor.fetchInto();
				if ( giftCursorResults != null ) {
					pgveCode = giftCursorResults.getStr(0);
				}
				return ((pgveCode));
				}finally{
					giftCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_DISPLAY_APRCATG_LOV
	/*
	Procedure A$_DISPLAY_APRCATG_LOV IS
<multilinecomment> This procedure will display the appropriate LOV of Donor Categories for either the ID or the Spouse ID </multilinecomment>
   a_value_chosen BOOLEAN;
BEGIN
  IF name_in('system.cursor_item') = 'KEY_BLOCK.ID' THEN
    a_value_chosen := SHOW_LOV('APRCATG_LOV',345,111);
   ELSIF name_in('system.cursor_item') = 'KEY_BLOCK.SPS_IDNO' THEN
    a_value_chosen := SHOW_LOV('APRCATG_SPS_LOV',345,128);
   ELSE
    IF GET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED) = 'TRUE' THEN
      GO_ITEM('KEY_BLOCK.ID');
      a_value_chosen := SHOW_LOV('APRCATG_LOV',345,111);
     ELSE
      MESSAGE( G$_NLS.Get('AOQRPLS-0003', 'LIB','*ERROR* This function is not available') );
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aDisplayAprcatgLov()
		{
			//  This procedure will display the appropriate LOV of Donor Categories for either the ID or the Spouse ID 
			NBool aValueChosen= NBool.getNull();
			if ( getCursorItem().equals("KEY_BLOCK.ID") )
			{
				aValueChosen = showLov("APRCATG_LOV");
			}
			else if ( getCursorItem().equals("KEY_BLOCK.SPS_IDNO") ) {
				aValueChosen = showLov("APRCATG_SPS_LOV");
			}
			else {
				if ( getItemEnabled("KEY_BLOCK.ID").equals("TRUE") )
				{
					goItem(toStr("KEY_BLOCK.ID"));
					aValueChosen = showLov("APRCATG_LOV");
				}
				else {
					errorMessage(GNls.Fget(toStr("AOQRPLS-0003"), toStr("LIB"), toStr("*ERROR* This function is not available")));
				}
			}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_DECEASED_WARNING
	/*
	PROCEDURE A$_DECEASED_WARNING IS

--  Code modified by the Forms Migration Assistant
--  19-Nov-2003 09:51 PM

ALERT_BUT   NUMBER;
ALERT_ID    ALERT;
BEGIN
 ALERT_ID := FIND_ALERT('G$_CAUTION_OK_ALERT');
 IF ID_NULL(ALERT_ID) THEN
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
 SET_ALERT_PROPERTY(ALERT_ID, ALERT_MESSAGE_TEXT, G$_NLS.Get('AOQRPLS-0002', 'LIB','Warning: This person is deceased.') );
 ALERT_BUT := SHOW_ALERT(ALERT_ID);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aDeceasedWarning()
		{
			//   Code modified by the Forms Migration Assistant
			//   19-Nov-2003 09:51 PM
			NNumber alertBut= NNumber.getNull();
			AlertDescriptor alertId= null;
			alertId = findAlert("G$_CAUTION_OK_ALERT");
			if ( (alertId == null) )
			{
				throw new ApplicationException();
			}
			setAlertMessageText(alertId, GNls.Fget(toStr("AOQRPLS-0002"), toStr("LIB"), toStr("Warning: This person is deceased.")));
			alertBut = toNumber(showAlert(alertId));
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_CURRENT_SCREEN_LINE
	/*
	FUNCTION A$_CURRENT_SCREEN_LINE 
RETURN NUMBER IS
 cur_blk VARCHAR2(40) := NAME_IN('SYSTEM.CURSOR_BLOCK');
 cur_rec NUMBER;
 top_rec NUMBER;
 itm_lin NUMBER;
 cur_lin NUMBER;
 bk_id Block;
BEGIN
 bk_id := FIND_BLOCK(cur_blk);
 cur_rec := GET_BLOCK_PROPERTY(bk_id, CURRENT_RECORD);
 top_rec := GET_BLOCK_PROPERTY(bk_id, TOP_RECORD);
 itm_lin := GET_ITEM_PROPERTY(GET_BLOCK_PROPERTY(bk_id, FIRST_ITEM),Y_POS);
 cur_lin := itm_lin + (cur_rec - top_rec);
 RETURN cur_lin;
END;
	*/
	/* <p>
/* </p>
		*/
		public NNumber aCurrentScreenLine()
		{
			NString curBlk = getCursorBlock();
			NNumber curRec= NNumber.getNull();
			NNumber topRec= NNumber.getNull();
			NNumber itmLin= NNumber.getNull();
			NNumber curLin= NNumber.getNull();
			BlockDescriptor bkId= null;
			bkId = findBlock(curBlk);
			curRec = getBlockCurrentRecord(bkId.getId());
			// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
			//			topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty(bkId, SupportClasses.Property.TOP_RECORD));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
			
			
			itmLin = toNumber(getItemYPos(getBlockFirstItem(bkId)));
			curLin = itmLin.add((curRec.subtract(topRec)));
			return curLin;
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_CTYP_CODE_OK_2_DEL
	/*
	PROCEDURE A$_CTYP_CODE_OK_2_DEL ( CODE_IN      IN VARCHAR2) IS
<multilinecomment> This Procedure will determine if the Condition Type Code passed when invoked
   is OK to Delete. This Procedure will produce an error message and raise
   FORM_TRIGGER_FAILURE if the condition type code should NOT be deleted
   because of Referential Integrity Constraints.

IE:  Create a KEY-DELREC Trigger in ATVCTYP block of Module ATVCTYP that looks like:

    A$_CTYP_CODE_OK_2_DEL(:atvctyp_code);
    G$_CHECK_FAILURE;
    DELETE_RECORD;
</multilinecomment>
      CURSOR CTYP_CURSOR IS
         SELECT 'TRUE'
         FROM   DUAL
         WHERE  NOT EXISTS
                ( SELECT *
                  FROM   AGRPCON
                  WHERE  AGRPCON_PIDM > 0
                  AND    AGRPCON_PLEDGE_NO <> ' '
                  AND    AGRPCON_CTYP_CODE = CODE_IN );
     TEMP_AREA VARCHAR2(4);
   BEGIN
      OPEN CTYP_CURSOR ;
      FETCH CTYP_CURSOR INTO TEMP_AREA ;
      IF NOT (CTYP_CURSOR%FOUND) THEN
         MESSAGE( G$_NLS.Get('AOQRPLS-0001', 'LIB','*ERROR* Invalid Delete; This Condition type code is currently in use.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public void aCtypCodeOk2Del(NString codeIn)
		{
			int rowCount = 0;
			String sqlctypCursor = "SELECT 'TRUE' " +
	" FROM DUAL " +
	" WHERE  NOT EXISTS(SELECT * " +
		" FROM AGRPCON " +
		" WHERE AGRPCON_PIDM > 0 AND AGRPCON_PLEDGE_NO <> ' ' AND AGRPCON_CTYP_CODE = :P_CODE_IN ) ";
			DataCursor ctypCursor = new DataCursor(sqlctypCursor);
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				ctypCursor.addParameter("P_CODE_IN", codeIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ctypCursor.
				ctypCursor.open();
				ResultSet ctypCursorResults = ctypCursor.fetchInto();
				if ( ctypCursorResults != null ) {
					tempArea = ctypCursorResults.getStr(0);
				}
				if ( !(ctypCursor.found()) )
				{
					errorMessage(GNls.Fget(toStr("AOQRPLS-0001"), toStr("LIB"), toStr("*ERROR* Invalid Delete; This Condition type code is currently in use.")));
					throw new ApplicationException();
				}
				}finally{
					ctypCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_CONFIDENTIAL_WARNING
	/*
	PROCEDURE A$_CONFIDENTIAL_WARNING IS

--  Code modified by the Forms Migration Assistant
--  19-Nov-2003 09:51 PM

ALERT_BUT   NUMBER;
ALERT_ID    ALERT;
BEGIN
 ALERT_ID := FIND_ALERT('G$_CAUTION_OK_ALERT');
 IF ID_NULL(ALERT_ID) THEN
    RAISE FORM_TRIGGER_FAILURE;
 END IF;
 SET_ALERT_PROPERTY(ALERT_ID, ALERT_MESSAGE_TEXT, G$_NLS.Get('AOQRPLS-0000', 'LIB','Warning: Information about this person is confidential.') );
 ALERT_BUT := SHOW_ALERT(ALERT_ID);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aConfidentialWarning()
		{
			//   Code modified by the Forms Migration Assistant
			//   19-Nov-2003 09:51 PM
			NNumber alertBut= NNumber.getNull();
			AlertDescriptor alertId= null;
			alertId = findAlert("G$_CAUTION_OK_ALERT");
			if ( (alertId == null) )
			{
				throw new ApplicationException();
			}
			setAlertMessageText(alertId, GNls.Fget(toStr("AOQRPLS-0000"), toStr("LIB"), toStr("Warning: Information about this person is confidential.")));
			alertBut = toNumber(showAlert(alertId));
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_CALC_APRDHIS
	/*
	PROCEDURE A$_CALC_APRDHIS(PIDM       IN NUMBER,
                          XREF_PIDM  IN NUMBER,
                          DESG       IN VARCHAR2,
                          FISC_CODE  IN NUMBER) IS
--
 tot_credit_pmlt_xref        NUMBER := 0;
 tot_credit_pmlt_xref_given  NUMBER := 0;
 tot_desg_credit_key         NUMBER := 0;
--
 tot_credit_pmlt       NUMBER := 0;
 tot_credit_pmlt_given NUMBER := 0;
 tot_desg_credit_xref  NUMBER := 0;
--
 cursor CREDIT_PMLT_XREF is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_PIDM      = PIDM
        AND    AGRPMLT_DESG      = DESG 
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor CREDIT_PMLT_XREF_GIVEN is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_XREF_PIDM = PIDM
        AND    AGRPMLT_DESG      = DESG 
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor TOTAL_DESG_CREDIT_KEYPIDM is
        SELECT NVL(SUM(AGRPDES_AMT),0)
        FROM   AGBPLDG, AGRPDES
        WHERE  AGBPLDG_PIDM      = PIDM
        AND    AGBPLDG_PIDM      =  AGRPDES_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPDES_PLEDGE_NO
        AND    AGRPDES_DESG      = DESG 
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
--
 cursor CREDIT_PMLT is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_XREF_PIDM = XREF_PIDM
        AND    AGRPMLT_DESG      = DESG 
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor CREDIT_PMLT_GIVEN is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_PIDM      = XREF_PIDM
        AND    AGRPMLT_DESG      = DESG 
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor TOTAL_DESG_CREDIT_XREF is
        SELECT NVL(SUM(AGRPDES_AMT),0)
        FROM   AGBPLDG, AGRPDES
        WHERE  AGBPLDG_PIDM      = XREF_PIDM
        AND    AGBPLDG_PIDM      =  AGRPDES_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPDES_PLEDGE_NO
        AND    AGRPDES_DESG      = DESG
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
BEGIN
   OPEN  CREDIT_PMLT_XREF;
   FETCH CREDIT_PMLT_XREF into tot_credit_pmlt_xref;
   CLOSE CREDIT_PMLT_XREF;
   OPEN  CREDIT_PMLT_XREF_GIVEN;
   FETCH CREDIT_PMLT_XREF_GIVEN into tot_credit_pmlt_xref_given;
   CLOSE CREDIT_PMLT_XREF_GIVEN;
   OPEN  TOTAL_DESG_CREDIT_KEYPIDM;
   FETCH TOTAL_DESG_CREDIT_KEYPIDM into tot_desg_credit_key;
   CLOSE TOTAL_DESG_CREDIT_KEYPIDM;
--
   UPDATE APRDHIS
   SET    APRDHIS_ACTIVITY_DATE = SYSDATE,
          APRDHIS_AMT_PLEDGED = TRUNC( ( tot_desg_credit_key - tot_credit_pmlt_xref) +
                                         tot_credit_pmlt_xref_given, 2)
   WHERE  APRDHIS_PIDM      = PIDM
     AND  APRDHIS_DESG      = DESG
     AND  APRDHIS_FISC_CODE = FISC_CODE ;
--
   IF XREF_PIDM IS NULL THEN
      RETURN;
   END IF;
--
   OPEN  CREDIT_PMLT;
   FETCH CREDIT_PMLT into tot_credit_pmlt;
   CLOSE CREDIT_PMLT;
   OPEN  CREDIT_PMLT_GIVEN;
   FETCH CREDIT_PMLT_GIVEN into tot_credit_pmlt_given;
   CLOSE CREDIT_PMLT_GIVEN;
   OPEN  TOTAL_DESG_CREDIT_XREF;
   FETCH TOTAL_DESG_CREDIT_XREF into tot_desg_credit_xref;
   CLOSE TOTAL_DESG_CREDIT_XREF;
--
   UPDATE APRDHIS
   SET    APRDHIS_ACTIVITY_DATE = SYSDATE,
          APRDHIS_AMT_PLEDGED = TRUNC( tot_credit_pmlt + 
                ( tot_desg_credit_xref - tot_credit_pmlt_given), 2)
   WHERE  APRDHIS_PIDM      = XREF_PIDM
     AND  APRDHIS_DESG      = DESG
     AND  APRDHIS_FISC_CODE = FISC_CODE;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidm
		* @param xrefPidm
		* @param desg
		* @param fiscCode
		*/
		public void aCalcAprdhis(NNumber pidm, NNumber xrefPidm, NString desg, NNumber fiscCode)
		{
			int rowCount = 0;
			// 
			NNumber totCreditPmltXref = toNumber(0);
			NNumber totCreditPmltXrefGiven = toNumber(0);
			NNumber totDesgCreditKey = toNumber(0);
			// 
			NNumber totCreditPmlt = toNumber(0);
			NNumber totCreditPmltGiven = toNumber(0);
			NNumber totDesgCreditXref = toNumber(0);
			String sqlcreditPmltXref = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_PIDM = :P_PIDM AND AGRPMLT_DESG = :P_DESG AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltXref = new DataCursor(sqlcreditPmltXref);
			String sqlcreditPmltXrefGiven = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_XREF_PIDM = :P_PIDM AND AGRPMLT_DESG = :P_DESG AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltXrefGiven = new DataCursor(sqlcreditPmltXrefGiven);
			String sqltotalDesgCreditKeypidm = "SELECT NVL(SUM(AGRPDES_AMT), 0) " +
	" FROM AGBPLDG, AGRPDES " +
	" WHERE AGBPLDG_PIDM = :P_PIDM AND AGBPLDG_PIDM = AGRPDES_PIDM AND AGBPLDG_PLEDGE_NO = AGRPDES_PLEDGE_NO AND AGRPDES_DESG = :P_DESG AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor totalDesgCreditKeypidm = new DataCursor(sqltotalDesgCreditKeypidm);
			String sqlcreditPmlt = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_XREF_PIDM = :P_XREF_PIDM AND AGRPMLT_DESG = :P_DESG AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmlt = new DataCursor(sqlcreditPmlt);
			String sqlcreditPmltGiven = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_PIDM = :P_XREF_PIDM AND AGRPMLT_DESG = :P_DESG AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltGiven = new DataCursor(sqlcreditPmltGiven);
			String sqltotalDesgCreditXref = "SELECT NVL(SUM(AGRPDES_AMT), 0) " +
	" FROM AGBPLDG, AGRPDES " +
	" WHERE AGBPLDG_PIDM = :P_XREF_PIDM AND AGBPLDG_PIDM = AGRPDES_PIDM AND AGBPLDG_PLEDGE_NO = AGRPDES_PLEDGE_NO AND AGRPDES_DESG = :P_DESG AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor totalDesgCreditXref = new DataCursor(sqltotalDesgCreditXref);
			try {
				//Setting query parameters
				creditPmltXref.addParameter("P_PIDM", pidm);
				creditPmltXref.addParameter("P_DESG", desg);
				creditPmltXref.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltXref.
				creditPmltXref.open();
				ResultSet creditPmltXrefResults = creditPmltXref.fetchInto();
				if ( creditPmltXrefResults != null ) {
					totCreditPmltXref = creditPmltXrefResults.getNumber(0);
				}
				creditPmltXref.close();
				//Setting query parameters
				creditPmltXrefGiven.addParameter("P_PIDM", pidm);
				creditPmltXrefGiven.addParameter("P_DESG", desg);
				creditPmltXrefGiven.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltXrefGiven.
				creditPmltXrefGiven.open();
				ResultSet creditPmltXrefGivenResults = creditPmltXrefGiven.fetchInto();
				if ( creditPmltXrefGivenResults != null ) {
					totCreditPmltXrefGiven = creditPmltXrefGivenResults.getNumber(0);
				}
				creditPmltXrefGiven.close();
				//Setting query parameters
				totalDesgCreditKeypidm.addParameter("P_PIDM", pidm);
				totalDesgCreditKeypidm.addParameter("P_DESG", desg);
				totalDesgCreditKeypidm.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalDesgCreditKeypidm.
				totalDesgCreditKeypidm.open();
				ResultSet totalDesgCreditKeypidmResults = totalDesgCreditKeypidm.fetchInto();
				if ( totalDesgCreditKeypidmResults != null ) {
					totDesgCreditKey = totalDesgCreditKeypidmResults.getNumber(0);
				}
				totalDesgCreditKeypidm.close();
				// 
				String sql1 = "UPDATE APRDHIS " +
	"SET APRDHIS_ACTIVITY_DATE = SYSDATE, APRDHIS_AMT_PLEDGED = TRUNC((:P_TOT_DESG_CREDIT_KEY - :P_TOT_CREDIT_PMLT_XREF) + :P_TOT_CREDIT_PMLT_XREF_GIVEN, 2) " +
	" WHERE APRDHIS_PIDM = :P_PIDM AND APRDHIS_DESG = :P_DESG AND APRDHIS_FISC_CODE = :P_FISC_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("P_TOT_DESG_CREDIT_KEY", totDesgCreditKey);
				command1.addParameter("P_TOT_CREDIT_PMLT_XREF", totCreditPmltXref);
				command1.addParameter("P_TOT_CREDIT_PMLT_XREF_GIVEN", totCreditPmltXrefGiven);
				command1.addParameter("P_PIDM", pidm);
				command1.addParameter("P_DESG", desg);
				command1.addParameter("P_FISC_CODE", fiscCode);
				rowCount = command1.execute();
				// 
				if ( xrefPidm.isNull() )
				{
					return ;
				}
				// 
				//Setting query parameters
				creditPmlt.addParameter("P_XREF_PIDM", xrefPidm);
				creditPmlt.addParameter("P_DESG", desg);
				creditPmlt.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmlt.
				creditPmlt.open();
				ResultSet creditPmltResults = creditPmlt.fetchInto();
				if ( creditPmltResults != null ) {
					totCreditPmlt = creditPmltResults.getNumber(0);
				}
				creditPmlt.close();
				//Setting query parameters
				creditPmltGiven.addParameter("P_XREF_PIDM", xrefPidm);
				creditPmltGiven.addParameter("P_DESG", desg);
				creditPmltGiven.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltGiven.
				creditPmltGiven.open();
				ResultSet creditPmltGivenResults = creditPmltGiven.fetchInto();
				if ( creditPmltGivenResults != null ) {
					totCreditPmltGiven = creditPmltGivenResults.getNumber(0);
				}
				creditPmltGiven.close();
				//Setting query parameters
				totalDesgCreditXref.addParameter("P_XREF_PIDM", xrefPidm);
				totalDesgCreditXref.addParameter("P_DESG", desg);
				totalDesgCreditXref.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalDesgCreditXref.
				totalDesgCreditXref.open();
				ResultSet totalDesgCreditXrefResults = totalDesgCreditXref.fetchInto();
				if ( totalDesgCreditXrefResults != null ) {
					totDesgCreditXref = totalDesgCreditXrefResults.getNumber(0);
				}
				totalDesgCreditXref.close();
				// 
				String sql2 = "UPDATE APRDHIS " +
	"SET APRDHIS_ACTIVITY_DATE = SYSDATE, APRDHIS_AMT_PLEDGED = TRUNC(:P_TOT_CREDIT_PMLT + (:P_TOT_DESG_CREDIT_XREF - :P_TOT_CREDIT_PMLT_GIVEN), 2) " +
	" WHERE APRDHIS_PIDM = :P_XREF_PIDM AND APRDHIS_DESG = :P_DESG AND APRDHIS_FISC_CODE = :P_FISC_CODE";
				DataCommand command2 = new DataCommand(sql2);
				//Setting query parameters
				command2.addParameter("P_TOT_CREDIT_PMLT", totCreditPmlt);
				command2.addParameter("P_TOT_DESG_CREDIT_XREF", totDesgCreditXref);
				command2.addParameter("P_TOT_CREDIT_PMLT_GIVEN", totCreditPmltGiven);
				command2.addParameter("P_XREF_PIDM", xrefPidm);
				command2.addParameter("P_DESG", desg);
				command2.addParameter("P_FISC_CODE", fiscCode);
				rowCount = command2.execute();
				}finally{
					creditPmltXref.close();
					creditPmltXrefGiven.close();
					totalDesgCreditKeypidm.close();
					creditPmlt.close();
					creditPmltGiven.close();
					totalDesgCreditXref.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_CALC_APRCHIS
	/*
	PROCEDURE A$_CALC_APRCHIS( PIDM       IN NUMBER,
                           XREF_PIDM  IN NUMBER,
                           CAMP       IN VARCHAR2,
                           FISC_CODE  IN NUMBER) IS
--
 tot_credit_pmlt_xref        NUMBER := 0;
 tot_credit_pmlt_xref_given  NUMBER := 0;
 tot_camp_credit_key         NUMBER := 0;
--
 tot_credit_pmlt       NUMBER := 0;
 tot_credit_pmlt_given NUMBER := 0;
 tot_camp_credit_xref  NUMBER := 0;
--
 cursor CREDIT_PMLT_XREF is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_PIDM      = PIDM
        AND    AGRPMLT_CAMPAIGN  = CAMP
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor CREDIT_PMLT_XREF_GIVEN is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_XREF_PIDM = PIDM
        AND    AGRPMLT_CAMPAIGN  = CAMP
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
 cursor TOTAL_CAMP_CREDIT_KEYPIDM is
        SELECT NVL(SUM(AGRPDES_AMT),0)
        FROM   AGBPLDG, AGRPDES
        WHERE  AGBPLDG_PIDM      = PIDM
        AND    AGBPLDG_PIDM      =  AGRPDES_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPDES_PLEDGE_NO
        AND    AGRPDES_CAMPAIGN  = CAMP
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
--
 cursor CREDIT_PMLT is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_XREF_PIDM = XREF_PIDM
        AND    AGRPMLT_CAMPAIGN  = CAMP
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE;
 cursor CREDIT_PMLT_GIVEN is
        SELECT NVL(SUM(AGRPMLT_CREDIT),0)
        FROM   AGRPMLT, AGBPLDG
        WHERE  AGRPMLT_PIDM      = XREF_PIDM
        AND    AGRPMLT_CAMPAIGN  = CAMP
        AND    AGBPLDG_PIDM      =  AGRPMLT_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPMLT_PLEDGE_NO
        AND    AGBPLDG_FISC_CODE = FISC_CODE;
 cursor TOTAL_CAMP_CREDIT_XREF is
        SELECT NVL(SUM(AGRPDES_AMT),0)
        FROM   AGBPLDG, AGRPDES
        WHERE  AGBPLDG_PIDM      = XREF_PIDM
        AND    AGBPLDG_PIDM      =  AGRPDES_PIDM
        AND    AGBPLDG_PLEDGE_NO =  AGRPDES_PLEDGE_NO
        AND    AGRPDES_CAMPAIGN  = CAMP
        AND    AGBPLDG_FISC_CODE = FISC_CODE ;
BEGIN
   OPEN  CREDIT_PMLT_XREF;
   FETCH CREDIT_PMLT_XREF into tot_credit_pmlt_xref;
   CLOSE CREDIT_PMLT_XREF;
   OPEN  CREDIT_PMLT_XREF_GIVEN;
   FETCH CREDIT_PMLT_XREF_GIVEN into tot_credit_pmlt_xref_given;
   CLOSE CREDIT_PMLT_XREF_GIVEN;
   OPEN  TOTAL_CAMP_CREDIT_KEYPIDM;
   FETCH TOTAL_CAMP_CREDIT_KEYPIDM into tot_camp_credit_key;
   CLOSE TOTAL_CAMP_CREDIT_KEYPIDM;
--
   UPDATE APRCHIS
   SET    APRCHIS_ACTIVITY_DATE = SYSDATE,
          APRCHIS_AMT_PLEDGED = TRUNC( ( tot_camp_credit_key - tot_credit_pmlt_xref) +
                                         tot_credit_pmlt_xref_given, 2)
   WHERE  APRCHIS_PIDM      = PIDM
     AND  APRCHIS_CAMPAIGN  = CAMP
     AND  APRCHIS_FISC_CODE = FISC_CODE ;
--
   IF XREF_PIDM IS NULL THEN
      RETURN;
   END IF;
--
   OPEN  CREDIT_PMLT;
   FETCH CREDIT_PMLT into tot_credit_pmlt;
   CLOSE CREDIT_PMLT;
   OPEN  CREDIT_PMLT_GIVEN;
   FETCH CREDIT_PMLT_GIVEN into tot_credit_pmlt_given;
   CLOSE CREDIT_PMLT_GIVEN;
   OPEN  TOTAL_CAMP_CREDIT_XREF;
   FETCH TOTAL_CAMP_CREDIT_XREF into tot_camp_credit_xref;
   CLOSE TOTAL_CAMP_CREDIT_XREF;
--
   UPDATE APRCHIS
   SET    APRCHIS_ACTIVITY_DATE = SYSDATE,
          APRCHIS_AMT_PLEDGED = TRUNC( tot_credit_pmlt + 
                ( tot_camp_credit_xref - tot_credit_pmlt_given), 2)
   WHERE  APRCHIS_PIDM      = XREF_PIDM
     AND  APRCHIS_CAMPAIGN  = CAMP
     AND  APRCHIS_FISC_CODE = FISC_CODE;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidm
		* @param xrefPidm
		* @param camp
		* @param fiscCode
		*/
		public void aCalcAprchis(NNumber pidm, NNumber xrefPidm, NString camp, NNumber fiscCode)
		{
			int rowCount = 0;
			// 
			NNumber totCreditPmltXref = toNumber(0);
			NNumber totCreditPmltXrefGiven = toNumber(0);
			NNumber totCampCreditKey = toNumber(0);
			// 
			NNumber totCreditPmlt = toNumber(0);
			NNumber totCreditPmltGiven = toNumber(0);
			NNumber totCampCreditXref = toNumber(0);
			String sqlcreditPmltXref = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_PIDM = :P_PIDM AND AGRPMLT_CAMPAIGN = :P_CAMP AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltXref = new DataCursor(sqlcreditPmltXref);
			String sqlcreditPmltXrefGiven = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_XREF_PIDM = :P_PIDM AND AGRPMLT_CAMPAIGN = :P_CAMP AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltXrefGiven = new DataCursor(sqlcreditPmltXrefGiven);
			String sqltotalCampCreditKeypidm = "SELECT NVL(SUM(AGRPDES_AMT), 0) " +
	" FROM AGBPLDG, AGRPDES " +
	" WHERE AGBPLDG_PIDM = :P_PIDM AND AGBPLDG_PIDM = AGRPDES_PIDM AND AGBPLDG_PLEDGE_NO = AGRPDES_PLEDGE_NO AND AGRPDES_CAMPAIGN = :P_CAMP AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor totalCampCreditKeypidm = new DataCursor(sqltotalCampCreditKeypidm);
			String sqlcreditPmlt = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_XREF_PIDM = :P_XREF_PIDM AND AGRPMLT_CAMPAIGN = :P_CAMP AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmlt = new DataCursor(sqlcreditPmlt);
			String sqlcreditPmltGiven = "SELECT NVL(SUM(AGRPMLT_CREDIT), 0) " +
	" FROM AGRPMLT, AGBPLDG " +
	" WHERE AGRPMLT_PIDM = :P_XREF_PIDM AND AGRPMLT_CAMPAIGN = :P_CAMP AND AGBPLDG_PIDM = AGRPMLT_PIDM AND AGBPLDG_PLEDGE_NO = AGRPMLT_PLEDGE_NO AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor creditPmltGiven = new DataCursor(sqlcreditPmltGiven);
			String sqltotalCampCreditXref = "SELECT NVL(SUM(AGRPDES_AMT), 0) " +
	" FROM AGBPLDG, AGRPDES " +
	" WHERE AGBPLDG_PIDM = :P_XREF_PIDM AND AGBPLDG_PIDM = AGRPDES_PIDM AND AGBPLDG_PLEDGE_NO = AGRPDES_PLEDGE_NO AND AGRPDES_CAMPAIGN = :P_CAMP AND AGBPLDG_FISC_CODE = :P_FISC_CODE ";
			DataCursor totalCampCreditXref = new DataCursor(sqltotalCampCreditXref);
			try {
				//Setting query parameters
				creditPmltXref.addParameter("P_PIDM", pidm);
				creditPmltXref.addParameter("P_CAMP", camp);
				creditPmltXref.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltXref.
				creditPmltXref.open();
				ResultSet creditPmltXrefResults = creditPmltXref.fetchInto();
				if ( creditPmltXrefResults != null ) {
					totCreditPmltXref = creditPmltXrefResults.getNumber(0);
				}
				creditPmltXref.close();
				//Setting query parameters
				creditPmltXrefGiven.addParameter("P_PIDM", pidm);
				creditPmltXrefGiven.addParameter("P_CAMP", camp);
				creditPmltXrefGiven.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltXrefGiven.
				creditPmltXrefGiven.open();
				ResultSet creditPmltXrefGivenResults = creditPmltXrefGiven.fetchInto();
				if ( creditPmltXrefGivenResults != null ) {
					totCreditPmltXrefGiven = creditPmltXrefGivenResults.getNumber(0);
				}
				creditPmltXrefGiven.close();
				//Setting query parameters
				totalCampCreditKeypidm.addParameter("P_PIDM", pidm);
				totalCampCreditKeypidm.addParameter("P_CAMP", camp);
				totalCampCreditKeypidm.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalCampCreditKeypidm.
				totalCampCreditKeypidm.open();
				ResultSet totalCampCreditKeypidmResults = totalCampCreditKeypidm.fetchInto();
				if ( totalCampCreditKeypidmResults != null ) {
					totCampCreditKey = totalCampCreditKeypidmResults.getNumber(0);
				}
				totalCampCreditKeypidm.close();
				// 
				String sql1 = "UPDATE APRCHIS " +
	"SET APRCHIS_ACTIVITY_DATE = SYSDATE, APRCHIS_AMT_PLEDGED = TRUNC((:P_TOT_CAMP_CREDIT_KEY - :P_TOT_CREDIT_PMLT_XREF) + :P_TOT_CREDIT_PMLT_XREF_GIVEN, 2) " +
	" WHERE APRCHIS_PIDM = :P_PIDM AND APRCHIS_CAMPAIGN = :P_CAMP AND APRCHIS_FISC_CODE = :P_FISC_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("P_TOT_CAMP_CREDIT_KEY", totCampCreditKey);
				command1.addParameter("P_TOT_CREDIT_PMLT_XREF", totCreditPmltXref);
				command1.addParameter("P_TOT_CREDIT_PMLT_XREF_GIVEN", totCreditPmltXrefGiven);
				command1.addParameter("P_PIDM", pidm);
				command1.addParameter("P_CAMP", camp);
				command1.addParameter("P_FISC_CODE", fiscCode);
				rowCount = command1.execute();
				// 
				if ( xrefPidm.isNull() )
				{
					return ;
				}
				// 
				//Setting query parameters
				creditPmlt.addParameter("P_XREF_PIDM", xrefPidm);
				creditPmlt.addParameter("P_CAMP", camp);
				creditPmlt.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmlt.
				creditPmlt.open();
				ResultSet creditPmltResults = creditPmlt.fetchInto();
				if ( creditPmltResults != null ) {
					totCreditPmlt = creditPmltResults.getNumber(0);
				}
				creditPmlt.close();
				//Setting query parameters
				creditPmltGiven.addParameter("P_XREF_PIDM", xrefPidm);
				creditPmltGiven.addParameter("P_CAMP", camp);
				creditPmltGiven.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable creditPmltGiven.
				creditPmltGiven.open();
				ResultSet creditPmltGivenResults = creditPmltGiven.fetchInto();
				if ( creditPmltGivenResults != null ) {
					totCreditPmltGiven = creditPmltGivenResults.getNumber(0);
				}
				creditPmltGiven.close();
				//Setting query parameters
				totalCampCreditXref.addParameter("P_XREF_PIDM", xrefPidm);
				totalCampCreditXref.addParameter("P_CAMP", camp);
				totalCampCreditXref.addParameter("P_FISC_CODE", fiscCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalCampCreditXref.
				totalCampCreditXref.open();
				ResultSet totalCampCreditXrefResults = totalCampCreditXref.fetchInto();
				if ( totalCampCreditXrefResults != null ) {
					totCampCreditXref = totalCampCreditXrefResults.getNumber(0);
				}
				totalCampCreditXref.close();
				// 
				String sql2 = "UPDATE APRCHIS " +
	"SET APRCHIS_ACTIVITY_DATE = SYSDATE, APRCHIS_AMT_PLEDGED = TRUNC(:P_TOT_CREDIT_PMLT + (:P_TOT_CAMP_CREDIT_XREF - :P_TOT_CREDIT_PMLT_GIVEN), 2) " +
	" WHERE APRCHIS_PIDM = :P_XREF_PIDM AND APRCHIS_CAMPAIGN = :P_CAMP AND APRCHIS_FISC_CODE = :P_FISC_CODE";
				DataCommand command2 = new DataCommand(sql2);
				//Setting query parameters
				command2.addParameter("P_TOT_CREDIT_PMLT", totCreditPmlt);
				command2.addParameter("P_TOT_CAMP_CREDIT_XREF", totCampCreditXref);
				command2.addParameter("P_TOT_CREDIT_PMLT_GIVEN", totCreditPmltGiven);
				command2.addParameter("P_XREF_PIDM", xrefPidm);
				command2.addParameter("P_CAMP", camp);
				command2.addParameter("P_FISC_CODE", fiscCode);
				rowCount = command2.execute();
				}finally{
					creditPmltXref.close();
					creditPmltXrefGiven.close();
					totalCampCreditKeypidm.close();
					creditPmlt.close();
					creditPmltGiven.close();
					totalCampCreditXref.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_AUBINST_PGVE
	/*
	FUNCTION A$_AUBINST_PGVE
   RETURN VARCHAR2 IS
<multilinecomment> This Procedure (Function) will return the default Matching Gift
   Vehicle Code as identified in table AUBINST (Form AGACTRL). 
   FHL 9/26/97
</multilinecomment>
    TEMP_AREA VARCHAR2(5);
   BEGIN
     SELECT AUBINST_DEF_MG_PGVE_CODE 
     INTO   TEMP_AREA
     FROM   AUBINST;
     RETURN TEMP_AREA ;
   END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString aAubinstPgve()
		{
			int rowCount = 0;
			//  This Procedure (Function) will return the default Matching Gift
			// Vehicle Code as identified in table AUBINST (Form AGACTRL).
			// FHL 9/26/97
			NString tempArea= NString.getNull();
			String sql1 = "SELECT AUBINST_DEF_MG_PGVE_CODE " +
	" FROM AUBINST ";
			DataCommand command1 = new DataCommand(sql1);
			ResultSet results1 = command1.executeQuery();
			rowCount = command1.getRowCount();
			if ( results1.hasData() ) {
				tempArea = results1.getStr(0);
			}
			results1.close();
			return tempArea;
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_AUBINST_DEF_MG_PGVE
	/*
	FUNCTION A$_AUBINST_DEF_MG_PGVE ( CODE_IN IN VARCHAR2 )
   RETURN BOOLEAN IS
<multilinecomment> This Procedure (Function) will determine if the Vehicle Code passed in
   as an argument is the Default Matching Gift Vehicle Code as identified
   in table AUBINST (Form AGACTRL). 
   This Procedure (Function) will return a boolean cursor attribute indicating
   TRUE if the Vehicle Code is the Default Matching Gift Vehicle Code
   and FALSE if it is not.
   FHL 9/26/97

   IE:  IF A$_AUBINST_DEF_MG_PGVE(:code_no) THEN
           < Vehicle Code is the Default Matching Gift Vehicle Code > ;
         ELSE
           < Vehicle Code is not the Default Matching Gift Vehicle Code > ;
        END IF;
</multilinecomment>
      CURSOR INST_CURSOR IS
         SELECT 'TRUE'
         FROM   AUBINST
         WHERE  AUBINST_DEF_MG_PGVE_CODE = CODE_IN;
      TEMP_AREA VARCHAR2(5);
   BEGIN
     OPEN    INST_CURSOR ;
     FETCH   INST_CURSOR INTO TEMP_AREA ;
     RETURN (INST_CURSOR%FOUND) ;
     CLOSE   INST_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public NBool aAubinstDefMgPgve(NString codeIn)
		{
			int rowCount = 0;
			String sqlinstCursor = "SELECT 'TRUE' " +
	" FROM AUBINST " +
	" WHERE AUBINST_DEF_MG_PGVE_CODE = :P_CODE_IN ";
			DataCursor instCursor = new DataCursor(sqlinstCursor);
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				instCursor.addParameter("P_CODE_IN", codeIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable instCursor.
				instCursor.open();
				ResultSet instCursorResults = instCursor.fetchInto();
				if ( instCursorResults != null ) {
					tempArea = instCursorResults.getStr(0);
				}
				return toBool((instCursor.found()));
				}finally{
					instCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_3RD_PARTY_PCREDIT
	/*
	FUNCTION A$_3RD_PARTY_PCREDIT( PLEDGE_NO    IN VARCHAR2,
                               HARD_OR_SOFT IN VARCHAR2 ) 
 RETURN NUMBER IS
--
 tot_hard_3p_amt     NUMBER := 0;
 tot_soft_3p_amt     NUMBER := 0;
 cursor TOTAL_HARD_3P_CREDIT is
        SELECT NVL(SUM(AGRPIDS_3PP_AMT),0)
        FROM   AGRPIDS
        WHERE  AGRPIDS_PIDM > 0
        AND    AGRPIDS_PLEDGE_NO = PLEDGE_NO ;
 cursor TOTAL_SOFT_3P_CREDIT is
        SELECT NVL(SUM(AGRPMEM_3PP_AMT),0)
        FROM   AGRPMEM
        WHERE  AGRPMEM_PIDM > 0
        AND    AGRPMEM_PLEDGE_NO = PLEDGE_NO ;
BEGIN
   OPEN  TOTAL_HARD_3P_CREDIT;
   FETCH TOTAL_HARD_3P_CREDIT into tot_hard_3p_amt;
   CLOSE TOTAL_HARD_3P_CREDIT;
   OPEN  TOTAL_SOFT_3P_CREDIT;
   FETCH TOTAL_SOFT_3P_CREDIT into tot_soft_3p_amt;
   CLOSE TOTAL_SOFT_3P_CREDIT;
--
   IF HARD_OR_SOFT = 'SOFT' THEN
     RETURN TRUNC(tot_soft_3p_amt, 2);
    ELSIF HARD_OR_SOFT = 'HARD' THEN
     RETURN TRUNC(tot_hard_3p_amt, 2);
    ELSE
     RETURN TRUNC(tot_hard_3p_amt + tot_soft_3p_amt, 2);
   END IF;
--
RETURN NULL; END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pledgeNo
		* @param hardOrSoft
		*/
		public NNumber a3rdPartyPcredit(NString pledgeNo, NString hardOrSoft)
		{
			int rowCount = 0;
			// 
			NNumber totHard3pAmt = toNumber(0);
			NNumber totSoft3pAmt = toNumber(0);
			String sqltotalHard3pCredit = "SELECT NVL(SUM(AGRPIDS_3PP_AMT), 0) " +
	" FROM AGRPIDS " +
	" WHERE AGRPIDS_PIDM > 0 AND AGRPIDS_PLEDGE_NO = :P_PLEDGE_NO ";
			DataCursor totalHard3pCredit = new DataCursor(sqltotalHard3pCredit);
			String sqltotalSoft3pCredit = "SELECT NVL(SUM(AGRPMEM_3PP_AMT), 0) " +
	" FROM AGRPMEM " +
	" WHERE AGRPMEM_PIDM > 0 AND AGRPMEM_PLEDGE_NO = :P_PLEDGE_NO ";
			DataCursor totalSoft3pCredit = new DataCursor(sqltotalSoft3pCredit);
			try {
				//Setting query parameters
				totalHard3pCredit.addParameter("P_PLEDGE_NO", pledgeNo);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalHard3pCredit.
				totalHard3pCredit.open();
				ResultSet totalHard3pCreditResults = totalHard3pCredit.fetchInto();
				if ( totalHard3pCreditResults != null ) {
					totHard3pAmt = totalHard3pCreditResults.getNumber(0);
				}
				totalHard3pCredit.close();
				//Setting query parameters
				totalSoft3pCredit.addParameter("P_PLEDGE_NO", pledgeNo);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalSoft3pCredit.
				totalSoft3pCredit.open();
				ResultSet totalSoft3pCreditResults = totalSoft3pCredit.fetchInto();
				if ( totalSoft3pCreditResults != null ) {
					totSoft3pAmt = totalSoft3pCreditResults.getNumber(0);
				}
				totalSoft3pCredit.close();
				// 
				if ( hardOrSoft.equals("SOFT") )
				{
					return trunc(totSoft3pAmt, 2);
				}
				else if ( hardOrSoft.equals("HARD") ) {
					return trunc(totHard3pAmt, 2);
				}
				else {
					return trunc(totHard3pAmt.add(totSoft3pAmt), 2);
				}
				}finally{
					totalHard3pCredit.close();
					totalSoft3pCredit.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_3RD_PARTY_CREDIT
	/*
	FUNCTION A$_3RD_PARTY_CREDIT( PLEDGE_NO    IN VARCHAR2,
                              HARD_OR_SOFT IN VARCHAR2 ) 
 RETURN NUMBER IS
--
 tot_hard_3p_amt     NUMBER := 0;
 tot_soft_3p_amt     NUMBER := 0;
 cursor TOTAL_HARD_3P_CREDIT is
        SELECT NVL(SUM(AGRGIDS_3PP_AMT),0)
        FROM   AGRGIDS
        WHERE  AGRGIDS_3PP_PLEDGE_NO = PLEDGE_NO ;
 cursor TOTAL_SOFT_3P_CREDIT is
        SELECT NVL(SUM(AGRGMEM_3PP_AMT),0)
        FROM   AGRGMEM
        WHERE  AGRGMEM_3PP_PLEDGE_NO = PLEDGE_NO ;
BEGIN
   OPEN  TOTAL_HARD_3P_CREDIT;
   FETCH TOTAL_HARD_3P_CREDIT into tot_hard_3p_amt;
   CLOSE TOTAL_HARD_3P_CREDIT;
   OPEN  TOTAL_SOFT_3P_CREDIT;
   FETCH TOTAL_SOFT_3P_CREDIT into tot_soft_3p_amt;
   CLOSE TOTAL_SOFT_3P_CREDIT;
--
   IF HARD_OR_SOFT = 'SOFT' THEN
     RETURN TRUNC(tot_soft_3p_amt, 2);
    ELSIF HARD_OR_SOFT = 'HARD' THEN
     RETURN TRUNC(tot_hard_3p_amt, 2);
    ELSE
     RETURN TRUNC(tot_hard_3p_amt + tot_soft_3p_amt, 2);
   END IF;
--
RETURN NULL; END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pledgeNo
		* @param hardOrSoft
		*/
		public NNumber a3rdPartyCredit(NString pledgeNo, NString hardOrSoft)
		{
			int rowCount = 0;
			// 
			NNumber totHard3pAmt = toNumber(0);
			NNumber totSoft3pAmt = toNumber(0);
			String sqltotalHard3pCredit = "SELECT NVL(SUM(AGRGIDS_3PP_AMT), 0) " +
	" FROM AGRGIDS " +
	" WHERE AGRGIDS_3PP_PLEDGE_NO = :P_PLEDGE_NO ";
			DataCursor totalHard3pCredit = new DataCursor(sqltotalHard3pCredit);
			String sqltotalSoft3pCredit = "SELECT NVL(SUM(AGRGMEM_3PP_AMT), 0) " +
	" FROM AGRGMEM " +
	" WHERE AGRGMEM_3PP_PLEDGE_NO = :P_PLEDGE_NO ";
			DataCursor totalSoft3pCredit = new DataCursor(sqltotalSoft3pCredit);
			try {
				//Setting query parameters
				totalHard3pCredit.addParameter("P_PLEDGE_NO", pledgeNo);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalHard3pCredit.
				totalHard3pCredit.open();
				ResultSet totalHard3pCreditResults = totalHard3pCredit.fetchInto();
				if ( totalHard3pCreditResults != null ) {
					totHard3pAmt = totalHard3pCreditResults.getNumber(0);
				}
				totalHard3pCredit.close();
				//Setting query parameters
				totalSoft3pCredit.addParameter("P_PLEDGE_NO", pledgeNo);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable totalSoft3pCredit.
				totalSoft3pCredit.open();
				ResultSet totalSoft3pCreditResults = totalSoft3pCredit.fetchInto();
				if ( totalSoft3pCreditResults != null ) {
					totSoft3pAmt = totalSoft3pCreditResults.getNumber(0);
				}
				totalSoft3pCredit.close();
				// 
				if ( hardOrSoft.equals("SOFT") )
				{
					return trunc(totSoft3pAmt, 2);
				}
				else if ( hardOrSoft.equals("HARD") ) {
					return trunc(totHard3pAmt, 2);
				}
				else {
					return trunc(totHard3pAmt.add(totSoft3pAmt), 2);
				}
				}finally{
					totalHard3pCredit.close();
					totalSoft3pCredit.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_3PP_VEHICLE
	/*
	FUNCTION A$_3PP_VEHICLE ( CODE_IN IN VARCHAR2 )
   RETURN BOOLEAN IS
<multilinecomment> This Procedure (Function) will determine if the Vehicle Code passed
   in as an argument is a Third Party Payment vehicle. This Procedure (Function)
   will return a boolean cursor attribute indicating TRUE if the Code is
   a Third Party Payment, and FALSE if it is not.
   FHL 9/26/97

   IE:  IF A$_3PP_VEHICLE(:atvpgve_code) THEN
           < Code is a Third Party Payment > ;
         ELSE
           < Code is not a Third Party Payment > ;
        END IF;
</multilinecomment>
      CURSOR PGVE_CURSOR IS
         SELECT 'TRUE'
         FROM   ATVPGVE
         WHERE  ATVPGVE_CODE = CODE_IN
         AND    ATVPGVE_3PP_IND = 'Y' ;
      TEMP_AREA VARCHAR2(4);
   BEGIN
     OPEN    PGVE_CURSOR ;
     FETCH   PGVE_CURSOR INTO TEMP_AREA ;
     RETURN (PGVE_CURSOR%FOUND) ;
     CLOSE   PGVE_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public NBool a3ppVehicle(NString codeIn)
		{
			int rowCount = 0;
			String sqlpgveCursor = "SELECT 'TRUE' " +
	" FROM ATVPGVE " +
	" WHERE ATVPGVE_CODE = :P_CODE_IN AND ATVPGVE_3PP_IND = 'Y' ";
			DataCursor pgveCursor = new DataCursor(sqlpgveCursor);
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				pgveCursor.addParameter("P_CODE_IN", codeIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pgveCursor.
				pgveCursor.open();
				ResultSet pgveCursorResults = pgveCursor.fetchInto();
				if ( pgveCursorResults != null ) {
					tempArea = pgveCursorResults.getStr(0);
				}
				return toBool((pgveCursor.found()));
				}finally{
					pgveCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_3PP_PLEDGE
	/*
	FUNCTION A$_3PP_PLEDGE ( PIDM_IN      IN NUMBER,
                         PLDG_NO_IN   IN VARCHAR2 )
   RETURN BOOLEAN IS
<multilinecomment> This Procedure (Function) will determine if the Pledge for the
   PIDM argument passed is a Third Party Payment. This Procedure (Function)
   will return a boolean cursor attribute indicating TRUE if the Pledge is
   a Third Party Payment, and FALSE if it is not.
   FHL 9/26/97

   IE:  IF A$_3PP_PLEDGE(:pidm,:pledge_no) THEN
           < Pledge is a Third Party Payment > ;
         ELSE
           < Pledge is not a Third Party Payment > ;
        END IF;
</multilinecomment>
      CURSOR PLDG_CURSOR IS
         SELECT 'TRUE'
         FROM   AGBPLDG
         WHERE  AGBPLDG_PIDM      = PIDM_IN
         AND    AGBPLDG_PLEDGE_NO = PLDG_NO_IN 
         AND    EXISTS
                ( SELECT 'X'
                  FROM   ATVPGVE
                  WHERE  ATVPGVE_CODE = AGBPLDG_PGVE_CODE
                  AND    ATVPGVE_3PP_IND = 'Y' );
      TEMP_AREA VARCHAR2(4);
   BEGIN
     OPEN    PLDG_CURSOR ;
     FETCH   PLDG_CURSOR INTO TEMP_AREA ;
     RETURN (PLDG_CURSOR%FOUND) ;
     CLOSE   PLDG_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param pldgNoIn
		*/
		public NBool a3ppPledge(NNumber pidmIn, NString pldgNoIn)
		{
			int rowCount = 0;
			String sqlpldgCursor = "SELECT 'TRUE' " +
	" FROM AGBPLDG " +
	" WHERE AGBPLDG_PIDM = :P_PIDM_IN AND AGBPLDG_PLEDGE_NO = :P_PLDG_NO_IN AND  EXISTS(SELECT 'X' " +
		" FROM ATVPGVE " +
		" WHERE ATVPGVE_CODE = AGBPLDG_PGVE_CODE AND ATVPGVE_3PP_IND = 'Y' ) ";
			DataCursor pldgCursor = new DataCursor(sqlpldgCursor);
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				pldgCursor.addParameter("P_PIDM_IN", pidmIn);
				pldgCursor.addParameter("P_PLDG_NO_IN", pldgNoIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pldgCursor.
				pldgCursor.open();
				ResultSet pldgCursorResults = pldgCursor.fetchInto();
				if ( pldgCursorResults != null ) {
					tempArea = pldgCursorResults.getStr(0);
				}
				return toBool((pldgCursor.found()));
				}finally{
					pldgCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit AOQRPLS.A$_3PP_GIFT
	/*
	FUNCTION A$_3PP_GIFT ( PIDM_IN      IN NUMBER,
                       GIFT_NO_IN   IN VARCHAR2 )
   RETURN BOOLEAN IS
<multilinecomment> This Procedure (Function) will determine if the Gift for the
   PIDM argument passed is a Third Party Payment. This Procedure (Function)
   will return a boolean cursor attribute indicating TRUE if the Gift is
   a Third Party Payment, and FALSE if it is not.
   FHL 9/26/97

   IE:  IF A$_3PP_GIFT(:pidm,:gift_no) THEN
           < Gift is a Third Party Payment > ;
         ELSE
           < Gift is not a Third Party Payment > ;
        END IF;
</multilinecomment>
      CURSOR GIFT_CURSOR IS
         SELECT 'TRUE'
         FROM   AGBGIFT
         WHERE  AGBGIFT_PIDM    = PIDM_IN
         AND    AGBGIFT_GIFT_NO = GIFT_NO_IN 
         AND    EXISTS
                ( SELECT 'X'
                  FROM   ATVPGVE
                  WHERE  ATVPGVE_CODE = AGBGIFT_PGVE_CODE
                  AND    ATVPGVE_3PP_IND = 'Y' );
      TEMP_AREA VARCHAR2(4);
   BEGIN
     OPEN    GIFT_CURSOR ;
     FETCH   GIFT_CURSOR INTO TEMP_AREA ;
     RETURN (GIFT_CURSOR%FOUND) ;
     CLOSE   GIFT_CURSOR ;
   RETURN NULL; END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param giftNoIn
		*/
		public NBool a3ppGift(NNumber pidmIn, NString giftNoIn)
		{
			int rowCount = 0;
			String sqlgiftCursor = "SELECT 'TRUE' " +
	" FROM AGBGIFT " +
	" WHERE AGBGIFT_PIDM = :P_PIDM_IN AND AGBGIFT_GIFT_NO = :P_GIFT_NO_IN AND  EXISTS(SELECT 'X' " +
		" FROM ATVPGVE " +
		" WHERE ATVPGVE_CODE = AGBGIFT_PGVE_CODE AND ATVPGVE_3PP_IND = 'Y' ) ";
			DataCursor giftCursor = new DataCursor(sqlgiftCursor);
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				giftCursor.addParameter("P_PIDM_IN", pidmIn);
				giftCursor.addParameter("P_GIFT_NO_IN", giftNoIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable giftCursor.
				giftCursor.open();
				ResultSet giftCursorResults = giftCursor.fetchInto();
				if ( giftCursorResults != null ) {
					tempArea = giftCursorResults.getStr(0);
				}
				return toBool((giftCursor.found()));
				}finally{
					giftCursor.close();
				}
		}

}
