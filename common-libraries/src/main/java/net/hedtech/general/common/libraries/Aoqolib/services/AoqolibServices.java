package net.hedtech.general.common.libraries.Aoqolib.services;

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


import net.hedtech.general.common.libraries.Aoqolib.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Aoqolib.model.*;



public class AoqolibServices extends AbstractSupportCodeObject{
	
	
	public AoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public AoqolibTaskPart  getContainer() {
		return (AoqolibTaskPart )super.getContainer();
	}

	
	public net.hedtech.general.common.libraries.Aoqolib.model.AoqolibModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment> AUDIT TRAIL BEGIN                         
AUDIT TRAIL: 2.1.5
1. Removed owner names from Record Groups. FHL 9/25/95
2. Added 'NO_ACKNOWLEDGE' to warning message about not being a Constituent
   in PL/SQL units A$_SEL_ID_INFO & A$_SEL_ID_PERS_INFO. FHL 9/25/95
3. Changed LOV title on ATVASSC_LOV. FHL 10/27/95
AUDIT TRAIL: 2.1.11                           
1. Added RGs and LOVs for ATVDGRP, ATVDITP,  
   ATVDATR, ATVDSTA, ATVDIST tables.       
                                            SCG 02/05/96 
2. Increase the length of the Designation field in the ADBDESG_RG SCG 02/07/96
3. Added Alerts A$_SUPERVISOR_OVERRIDE_ALERT, 
                A$_INACT_DESG_WARN_ALERT, 
                A$_INACT_DESG_ERROR_ALERT. FHL 2/9/96
4. Added right Paren to ATVCFAE LOV Title. FHL 2/12/96
5. Duplicated each A$_... PL/SQL unit in this form and created them in AOQRPLS.pll.
   Please note that any changes made to PL/SQL units in this form, 
   may also need to be made to the corresponding unit in AOQRPLS. FHL 2/13/96
6. Changed Designation from 5 to 10 in APRDHIS_RG. FHL 2/23/96
7. Changed LOV title of "Prospect Status Code Validation" to "Prospect/Project 
Status Code Validation" for Multi Projects on Prospect Enhancement. FHL 2/23/96
8. Added ATVPROP_RG & ATVPROP_LOV for new Proposal Code validation. FHL 4/24/96
9. Added ATVSSTA_RG & ATVSSTA_LOV for new Status Code validation. FHL 4/25/96
10. Added AMBPROP_RG & AMBPROP_LOV for Proposal Mod. FHL 5/10/96
11. Changed SOLC code from 4 to 8 in ATVSOLC_RG & LOV. FHL 6/4/96
    Added Record Group AFRCTYP_RG & LOV AFRCTYP_LOV. FHL 6/5/96 
12. Removed "Prospect" from ATVRATE_LOV window title bar. FHL 6/18/96
13. Added new form 'ADISAWD' to A$_SEL_... procedures. FHL 6/19/96 
14. Changed description column from 30 to 60 in ATVDATR_RG/LOV. FHL 6/21/96
15. Refreased version of AFRCTYP_RG & LOV. FHL 6/21/96
16. Refreased version of AFRCTYP_RG again & added title to AFRCTYP_LOV. FHL 6/26/96
17. Changed ASCCSLT_RG & LOV. FHL 7/10/96
18. Changed order by in atvdcyr_rg to desc. FHL 7/31/96
19. Convert to Forms 4.5 FHL 8/8/96
20. Added A$_NVA_LOV to AFRCTYP_LOV. FHL 9/3/96
21. Added A$_NVA_LOV to AMBPROP_LOV. FHL 9/4/96
22. Added GTVNTYP_RG & GTVNTYP_LOV & G$_NVA_LOV Temporarily
    until General delivers these objects. FHL 9/6/96
23. Applied A$_NVA_LOV to LOV that needed it. 
    ATVDGRP,ATVDSTA,ATVDITP,ATVDIST,ATVDATR. FHL 9/12/96
24. Added "(ATVXREF)" to ATVXREF_LOV title. FHL 9/18/96
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL;
END ;
	*/
	//ID:895
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit A$_CURRENT_SCREEN_LINE
	
	FUNCTION A$_CURRENT_SCREEN_LINE 
RETURN NUMBER IS
 cur_blk VARCHAR2(40) := :SYSTEM.CURSOR_BLOCK;
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
	//ID:896
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
			curRec = getBlockCurrentRecord(curBlk);
			// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
			//			topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty(bkId, SupportClasses.Property.TOP_RECORD));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
			
			
			itmLin = toNumber(getItemYPos(getBlockFirstItem(bkId)));
			curLin = itmLin.add((curRec.subtract(topRec)));
			return curLin;
		}

	
	/* Original PL/SQL code for Prog Unit A$_PCAT_CODE_OK_2_DEL
	
	PROCEDURE A$_PCAT_CODE_OK_2_DEL ( CODE_IN      IN VARCHAR2) IS
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
         FROM   SYS.DUAL
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
     TEMP_AREA VARCHAR2(4);
   BEGIN
      OPEN PCAT_CURSOR ;
      FETCH PCAT_CURSOR INTO TEMP_AREA ;
      IF NOT (PCAT_CURSOR%FOUND) THEN
         MESSAGE( G$_NLS.Get('AOQOLIB-0001', 'FORM','*ERROR* Invalid Delete; This Pledge Category code is currently in use.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END ;
	*/
	//ID:897
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public void aPcatCodeOk2Del(NString codeIn)
		{
			int rowCount = 0;
			String sqlpcatCursor = "SELECT 'TRUE' " +
	" FROM SYS.DUAL " +
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
			NString tempArea= NString.getNull();
			try {
				//Setting query parameters
				pcatCursor.addParameter("P_CODE_IN", codeIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pcatCursor.
				pcatCursor.open();
				ResultSet pcatCursorResults = pcatCursor.fetchInto();
				if ( pcatCursorResults != null ) {
					tempArea = pcatCursorResults.getStr(0);
				}
				if ( !(pcatCursor.found()) )
				{
					errorMessage(GNls.Fget(toStr("AOQOLIB-0001"), toStr("FORM"), toStr("*ERROR* Invalid Delete; This Pledge Category code is currently in use.")));
					throw new ApplicationException();
				}
				}finally{
					pcatCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit A$_CTYP_CODE_OK_2_DEL
	
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
         FROM   SYS.DUAL
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
         MESSAGE( G$_NLS.Get('AOQOLIB-0002', 'FORM','*ERROR* Invalid Delete; This Condition type code is currently in use.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END ;
	*/
	//ID:898
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param codeIn
		*/
		public void aCtypCodeOk2Del(NString codeIn)
		{
			int rowCount = 0;
			String sqlctypCursor = "SELECT 'TRUE' " +
	" FROM SYS.DUAL " +
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
					errorMessage(GNls.Fget(toStr("AOQOLIB-0002"), toStr("FORM"), toStr("*ERROR* Invalid Delete; This Condition type code is currently in use.")));
					throw new ApplicationException();
				}
				}finally{
					ctypCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit A$_DISPLAY_APRCATG_LOV
	
	Procedure A$_DISPLAY_APRCATG_LOV IS
<multilinecomment> This procedure will display the appropriate LOV of Donor Categories for either the ID or the Spouse ID </multilinecomment>
   a_value_chosen BOOLEAN;
BEGIN
  IF :system.cursor_item = 'KEY_BLOCK.ID' THEN
    a_value_chosen := SHOW_LOV('APRCATG_LOV',58,6);
   ELSIF :system.cursor_item = 'KEY_BLOCK.SPS_IDNO' THEN
    a_value_chosen := SHOW_LOV('APRCATG_SPS_LOV',58,7);
   ELSE
    IF GET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED) = 'TRUE' THEN
      GO_ITEM('KEY_BLOCK.ID');
      a_value_chosen := SHOW_LOV('APRCATG_LOV',58,6);
     ELSE
      MESSAGE( G$_NLS.Get('AOQOLIB-0003', 'FORM','*ERROR* This function is not available') );
    END IF;
  END IF;
END;
	*/
	//ID:899
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
					errorMessage(GNls.Fget(toStr("AOQOLIB-0003"), toStr("FORM"), toStr("*ERROR* This function is not available")));
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit A$_DECEASED_WARNING
	
	PROCEDURE A$_DECEASED_WARNING IS
ALERT_BUT   NUMBER;
BEGIN
    ALERT_BUT := G$_DISPLAY_ALERT('G$_CAUTION_OK_ALERT',
        G$_NLS.Get('AOQOLIB-0004', 'FORM','Warning: This person is deceased.') );
END;
	*/
	//ID:900
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aDeceasedWarning()
		{
			NNumber alertBut= NNumber.getNull();
			alertBut = getContainer().getGoqrpls().gDisplayAlert(toStr("G$_CAUTION_OK_ALERT"), GNls.Fget(toStr("AOQOLIB-0004"), toStr("FORM"), toStr("Warning: This person is deceased.")));
		}

	
	/* Original PL/SQL code for Prog Unit A$_CONFIDENTIAL_WARNING
	
	PROCEDURE A$_CONFIDENTIAL_WARNING IS
ALERT_BUT   NUMBER;
BEGIN
    ALERT_BUT := G$_DISPLAY_ALERT('G$_CAUTION_OK_ALERT',
        G$_NLS.Get('AOQOLIB-0005', 'FORM','Warning: Information about this person is confidential.') );
END;
	*/
	//ID:901
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void aConfidentialWarning()
		{
			NNumber alertBut= NNumber.getNull();
			alertBut = getContainer().getGoqrpls().gDisplayAlert(toStr("G$_CAUTION_OK_ALERT"), GNls.Fget(toStr("AOQOLIB-0005"), toStr("FORM"), toStr("Warning: Information about this person is confidential.")));
		}

	
	/* Original PL/SQL code for Prog Unit NCHK
	
	FUNCTION NCHK (CONDITION BOOLEAN) RETURN BOOLEAN IS
BEGIN
   RETURN NVL(CONDITION, TRUE);
END ;
	*/
	//ID:902
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		*/
		public NBool nchk(NBool condition)
		{
			return isNull(condition, NBool.True);
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_VALUE
	
	PROCEDURE CHECK_VALUE
(CONDITION BOOLEAN, STRING VARCHAR2, RAISE_BOOL BOOLEAN, CHKNULL
   BOOLEAN := FALSE) IS
BEGIN
   IF NVL(CONDITION, CHKNULL) THEN
      IF STRING IS NOT NULL THEN
         MESSAGE(STRING) ;
      END IF ;
      IF RAISE_BOOL THEN
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;
END ;
	*/
	//ID:903
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		* @param _string
		* @param raiseBool
		*/
		public void checkValue(NBool condition, NString _string, NBool raiseBool) {
			checkValue(condition, _string, raiseBool, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		* @param _string
		* @param raiseBool
		* @param chknull
		*/
		public void checkValue(NBool condition, NString _string, NBool raiseBool, NBool chknull)
		{
			if ( isNull(condition, chknull).getValue() )
			{
				if ( !_string.isNull() )
				{
					message(_string);
				}
				if ( raiseBool.getValue() )
				{
					throw new ApplicationException();
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_QUERY_MODE
	
	PROCEDURE CHECK_QUERY_MODE IS
BEGIN
   IF (:SYSTEM.RECORD_STATUS = 'NEW') THEN
      :GLOBAL.QUERY_MODE := '1' ;
   ELSE
      :GLOBAL.QUERY_MODE := '0' ;
   END IF ;
END ;
	*/
	//ID:904
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkQueryMode()
		{
			// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
			if ((getRecordStatus().equals("NEW")))
			{
				setGlobal("QUERY_MODE", toStr("1"));
			}
			else {
				setGlobal("QUERY_MODE", toStr("0"));
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_FAILURE
	
	PROCEDURE CHECK_FAILURE IS
BEGIN
   IF NOT FORM_SUCCESS THEN
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
END ;
	*/
	//ID:905
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkFailure()
		{
			if ( SupportClasses.SQLFORMS.FormSuccess().not() )
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment> AUDIT TRAIL BEGIN 
AUDIT TRAIL: 3.0
1. Correct spelling of Designation in ADBDESG_LOV. FHL 2/12/97  
2. Added ATVMEDU_RG and ATVMEDU_LOV. FHL 4/2/97 
3. Corrected column mapping of ATVMEDU_LOV. FHL 4/11/97
4. Added ADBDESG columns to ADBDESG_RG & LOV. FHL 6/2/97
5. Corrected column specification of ATVSSTA_RG and column mapping of ATVSSTA_LOV.
   FHL 8/6/97
AUDIT TRAIL: 3.0.1
1. Created AFRCSOL_RG and LOV for Contact Assignment mods. Copied ASRSSAG, ASRSORG,
and ASRSOAG_RGs and LOVs from ASAASCT to use in other forms.  Modified copied RGs 
to use globals instead of form items.  Created CAMP_ORG_SOL_RG/LOV and 
ORG_YR_SOL_RG/LOV to display pre-assigned solicitors based on globals passed.  
JVB 08/29/97
2. Modified afrclst_rg/lov to be more user-friendly.  JVB 09/09/97
3. Increased size of current_release item to 10 chars.  JVB 09/09/97
4. Added ATVPGVE_RG and ATVPGVE_LOV. FHL 9/29/97
5. Added POP_SEL_RG and APPLICATION_LOV and SELECTION_LOV to be used in the APIBRWS
   and ASASIGN forms.  The record group uses the GLVSLCT view to bring back Population
   Selection Populations.
   SCG 10/08/1997
6. Increased size of code items in atcprcd_rg/lov and atvprtp_rg/lov. JVB 10/17/97
7. Added TYPE_ORG_SOL_4_CAMP_RG/LOV and YEAR_SOL_4_ORG_RG/LOV. Created 2 alerts used 
in several forms for displaying inactive status for a solicitor.  JVB  10/28/97
8. Modified TYPE_ORG_SOL_4_CAMP_LOV to return :global.solicitation_type instead of 
:global.solc_code.  Also modified tags of LOV.  JVB  11/12/97
9. Created A$_CONTACT_EXISTS_ALERT for use by solicitation forms where user is attempting
to assign a contact to a combo where the contact is already assigned.  JVB  11/19/97
10. Added ATVIGRP_RG and ATVIGRP_LOV for the Web for Alumni enhancments.  SCG 12/08/1997
11. Year 2K mods. Modified all record groups/LOVs that displayed dates to use to_char
formatting on dates to display centuries.   JVB  05/05/1998
12. Corrected column widths in LOVs to allow display of titles.   JVB  05/06/1998
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL;
END ;
	*/
	//ID:906
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
   GD 08-07-98
2. VSE Report mods. Modified ATVCFAE_LOV, ATVGIFT_LOV and ATVPLDG_LOV to display
   VSE instead of CFAE.
   JVB  09/09/1998 
AUDIT TRAIL: 4.1
1. To apply Wayne State Modifications -
   (1) Added ATVDNAM_RG, ATVDNAM_LOV, AGBPDEF_RG, AGBPDEF_LOV.  
   PLIN 04/16/99
2. Modified ATVDONR_LOV to display VSE_1 and VSE_2 instead of CFAE_1 and CFAE_2.
   YGUO   04/27/99
3. Modified ATVCFAE_LOV  to display ATVVSER in title bar.
   JVB  08/25/1999
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:907
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
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
	//ID:908
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 1995-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:909
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
**   AUDIT TRAIL: 6.0
1. Web for Friends Enhancement                              Scott Geiser 01/28/2003
   a. Added ATVDONR_FRND_IND to the ATVDONR_RG	
   b. Added ATVDONR_FRND_IND to the ATVDONR_LOV
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:910
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
**   AUDIT TRAIL: 7.0
1. TGKinderman 11/19/2003
   Converted to Forms9i	
2. Scott Geiser  03/08/2004
   Changed Visual Attributes of A$_NVA_LOV to set font to Verdana 9.
3. Scott Geiser 07/20/2004
   Remove references to APAPERS and APATELE.  These forms have been made
   obsolete.
4. Defect 70-0044, LN 04-Oct-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     None.
   Technical Fix:
     Removed unused program units a$_sel_id_info and a$_sel_id_pers_info.
5. Defect 70-0188     Scott Geiser
   Problem:
     UI: Canvas: PAGE_2 Visual Attribute G$_NVA_CANVAS is not assigned. 
     UI: Canvas: PAGE_2 Pop-Up Menu G$_DEFAULT_PM is not assigned. 
     UI: Canvas: PAGE_1 Visual Attribute G$_NVA_CANVAS is not assigned. 
     UI: Canvas: PAGE_1 Pop-Up Menu G$_DEFAULT_PM is not assigned
   Solutions:
     UI: Canvas: PAGE_2 Visual Attribute G$_NVA_CANVAS is not assigned. Attribute assigned.
     UI: Canvas: PAGE_2 Pop-Up Menu G$_DEFAULT_PM is not assigned. - Pop-up Menu assigned.
     UI: Canvas: PAGE_1 Visual Attribute G$_NVA_CANVAS is not assigned. Attribute assigned.
     UI: Canvas: PAGE_1 Pop-Up Menu G$_DEFAULT_PM is not assigned. Pop-up Menu assigned.
    
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:911
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:912
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	
	PROCEDURE AUDIT_TRAIL_7_4 IS
<multilinecomment>
**   AUDIT TRAIL: 7.4
1. Advancement Officer Search Enhancement              Scott Geiser 08/09/2006
   a. Added ATVDOSR_RG record group
   b. Added ATVDOSR_LOV List of Values
** AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:913
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail74()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Heidi Dombroski 10/08/2007
   Release number update per minimal inclusion in release.   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:914
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1
1. Enhanced Proposal/Strategy                          Scott Geiser 07/15/2008
   Added ambprop_prop_seq_no to the AMBPROP_RG and AMBPROP_LOV. 
2. Enhanced Proposal/Strategy                       Heidi Dombroski 09/16/2008
   Added where clause to select statement in the ATVPRST_RG to select appropriate status codes
   based on the new validation form columns where status codes are assiged to a specific status type.
3. Enhanced Proposal/Strategy                       Heidi Dombroski 09/22/2008   
   - Increased the size of ATVPRST_CODE in ATVPRST_RG from 1 to 6.  Also updated the width of 
     ATVPRST_CODE in the ATVPRST_LOV to accomodate the increase in size from 1 to 6.
   - Increased the size of AMBPROP_PRST_CODE in AMBPROP_RG from 1 to 6.  Also added a title
     to the Status Code column in the AMBPROP_LOV.  
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:915
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.2
1. I18N Changes
      Updated ORG_YR_SOL_RG, TYPE_ORG_SOL_4_CAMP_RG, CAMP_ORG_SOL_RG, AFRCSLT_RG, ASRSSAG_RG, ASCCSLT_RG &
      corresponding LOV's to accomodate Last Name Prefix.
2. Add display of AMBPROP_ASK_AMOUNT to AMBPROP_RG & AMBPROP_LOV.       
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:916
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : AOQOLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Oct 04 02:24:17 2013
-- MSGSIGN : #4387f8b7d92229a2
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:917
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_1
	
	PROCEDURE AUDIT_TRAIL_8_3_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.3.1
1. Solicitation Code Expansion Project                        Scott Geiser 12/09/2009
   a. Expanded solc_code in the ATVSOLC_LOV/RG.       
   b. Expanded solc_code in the AFRCTYP_LOV/RG.        
   c. Expanded solc_code in the AFRCSOL_LOV/RG.         
   d. Expanded solc_code in the TYPE_ORG_SOL_4_CAMP_LOV/RG.    
   
2. Add a void comment for gifts/pledges enhancement           Scott Geiser 01/21/2010
   a. Add ATVCCLS_LOV/RG. 

3. Gift Society Description Enhancement                       Heidi Dombroski 01/22/2010
   a. Expanded dcnp_desc in the ATVDCNP_LOV/RG.          
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:918
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail831()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_2
	
	PROCEDURE AUDIT_TRAIL_8_3_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.3.2
1. Uaer Alert Project                        Scott Geiser 05/06/2009
   a. Create the ATVALRT_LOV/RG.       
   a. Create the ATVACAT_LOV/RG.       
         
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:919
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail832()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS 
<multilinecomment> 
AUDIT TRAIL: 8.4
1. Planned Giving Enhancement                 Scott Geiser 10/08/2010
   a. Modify the ATVGIFT_LOV/RG to add new indicators.       
   b. Modify the ATVPLDG_LOV/RG to add new indicators.      
   c. Add ATVADTL_RG and ATVADTL_LOV 
         
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:920
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_1
	
	PROCEDURE AUDIT_TRAIL_8_5_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.5.1
1. Solicitation Appeal Code Enhancement       Scott Geiser 01/03/2012
   a. Added the ATVSGRP_LOV/RG used by ATVSOLC.       
   b. Added the ATVSCTG_LOV/RG used by ATVSOLC. 
   
2. iModules Gift Integration Enhancement       Scott Geiser 01/23/2012
   a. Added the ATVPFTP_LOV/RG used by AUACMAP.       
   b. Added the ATVPFTP_LOV/RG used by AUACMAP.   
         
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:921
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail851()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS 
<multilinecomment> 
AUDIT TRAIL: 8.6
1. OBUG Prospect Status Change Enhancement       Scott Geiser 07/31/2012
   a. Added AUBINST_DFLT_PRST_CODE to the where clause of the ATVPRST_RG.
        
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:922
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_7
	
	PROCEDURE AUDIT_TRAIL_8_7  IS
<multilinecomment> 
AUDIT TRAIL: 8.7
1. RPE - Designation Name field is too short on ADADESG.             Heidi Dombroski 06/19/2013
   Change the ADBDESG_NAME field on ADADESG (and all affected objects) from 60 characters to 120 characters. 
  
2. RPE - Enhancing atvxref lookup list                               Venkata Krishna 01/10/2013
   Modified ATVXREF_LOV and ATVXREF_RG  
   1. Added Household column 
   2. Added Associated Pledges column
   3. Renamed column entitled Split to Hard or Soft
   4. Renamed column entitled PRI to Split.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:923
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail87()
		{
		}

	
	

}
