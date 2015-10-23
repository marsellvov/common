package net.hedtech.banner.general.common.Goaintl.services;

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


import net.hedtech.banner.general.common.Goaintl.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Goaintl.model.*;



public class GoaintlServices extends AbstractSupportCodeObject{
	
	
	public GoaintlServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoaintlTask  getTask() {
		return (GoaintlTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Goaintl.model.GoaintlModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS 
<multilinecomment> 
AUDIT TRAIL: 7.0
1. RK  2/17/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details.
2. Michael Hitrik 05/27/2004
   Added Tab Pages
3. Michael Hitrik 11/02/2004 
   Defect 70-0101
   Modified Trigger Pre-Insert on GORDOCM block.
4. Michael Hitrik 11/03/2004
   Defect 70-0254
   1. Modified KEY-CLRREC, KEY-DELREC, KEY-CLRBLK to adjust the value for
      :GOBINTL_SPOUSE_IND := 'T';
      :GOBINTL_SIGNATURE_IND := 'T';
   2. Added $$DBDATE$$ for GORDOCM_REQUEST_DATE Initial Value to default the Sysdate
   3.       Created check_visa_dates_c and check_gorvisa_c triggers to be used on Rollback and Save Actions
            Added execute_trigger('check_visa_dates_c');
            execute_trigger('check_gorvisa_c');
            in PRE-INSERT and PRE-UPDATE on GORVISA block to validate data ( the code is in KEY-COMMIT )
5. Michael Hitrik 11/16/2004
   Defect 70-0273
   1. Created isVisaRecords function and added the call to PRE-INSERT Trigger on GORVISA block
6. Michael Hitrik 11/23/2004
   Defect 70-0328
   1. Modified PRE-INSERT and PRE-UPDATE triggers on GORDOCM.

AUDIT TRAIL: 7.1
1. G Shalovka  31 December 2004
   Correcr 99290: incorrect GTVSDAX variable named in error message.
   Modified error message in LOAD_FORM_HEADER from 'VISADATEDEF' to 'VISADATDEF'. 
2. G Shalovka  15 April 2005
   Correct 71-0048: Overlapping dates warning prevents rows from being saved.
   Modified GORVISA block Pre-Update and Pre-Insert triggers to remove execution
     of form-level CHECK_VISA_DATES_C trigger which was causing duplicate alert
     to appear and prevented rows from being commited after warning was displayed
     because of a 'RAISE FORM_TRIGGER_FAILURE' command. 
3. G Shalovka  15 April 2005
   Correct 71-0049: F5 function does not close navigation block when cursor into
     Document Information block.
   Renamed GORVISA block When-New-Block-Instance trigger to WHEN_NEW_BLOCK_INSTANCE_TRG
   Added execution of G$_SET_INST_PROPERTY routine at beginning of both GORDOCM
     block and form-level WHEN_NEW_BLOCK_INSTANCE_TRG so that the G$ routine
     will close the F5 window when appropriate. 

AUDIT TRAIL: 7.2
1.  SJQ 05/13/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
2.  SJQ 07/25/2005
    Reset the inherited size dimensions of the extended search window.  The values were
    changed and causing the window to sized incorrectly.
    
AUDIT TRAIL: 7.3    
1.  TFH 02/15/2006
    Modified block GORVISA to implement calls to the
    GB_VISA API.  This required adding new ON-INSERT,
    ON-DELETE and ON-UPDATE triggers. The form is also executing
    new ON-ROLLBACK and POST-FORM-COMMIT triggers to make this
    block message aware.   
2.  TFH 02/15/2006
    Removed the following items related to the defaulting of certain values from GTVSDAX
      and all references to them:
      GORVISA_VISA_NUMBER_DISP
      GORVISA_NATN_CODE_ISSUE_DISP
      GORVISA_VISS_CODE_DISP
      GORVISA_VISA_START_DATE_DISP
      GORVISA_VISA_EXPIRE_DATE_DISP
3.  TFH 02/15/2006
    Modified GORDOCM_VISA_NUMBER item Required Property to No.
4.  TFH 02/15/2006
    Modified PRE-INSERT trigger on GORDOCM block to remove GORDOCM_VISA_NUMBER from the cursor.  
5.  TFH 02/15/2006    
    Modfied Where clause on GORDOCM block to remove Visa Number.
    
AUDIT TRAIL: 7.4
1.  SJQ 05/25/2006
    Restore all broken subclassing for all of the item level triggers in the extended search
    block.
2.  Defect ...... CMS-DFCT88331
    Signoff.... Shriya Naidu, Sanjib Panda      Octber 07,2006 
    Problem...... 
    Entering a country name with 5 or fewer letters will convert to the country code value in STVNATN.A longer country
    name will not convert to the country code value in STVNATN.This is inconsistent with Nation of Issue in the Visa 
    Information block which allows 30 characters 
    and retrieves matching STVNATN values.
    Fix..........In property pallet of items GOBINTL_NATN_CODE_LEGAL  and GOBINTL_NATN_CODE_BIRTH of block GOBINTL
    changed maxium length to 30 and  query length to 0.
3.  Defect ...... CMS-DFCT95036
    Signoff.... Shriya Naidu, Sanjib Panda      Octber 07,2006 
    Problem...... 
    In the Document block of GOAINTL, there is space to accommodate 4 document codes. If there is a need to enter more 
    than 4, and the user attempts to do Record-Insert from the pulldown menu bar, or use the Insert Record toolbar
    button, or keystroke (F6) the error
    *ERROR* Invalid Function
    displays.
    However, if the down arrow is used, or Ctrl+l,  a new field will open for a new document code.
    (Help/Show Keys shows Down function for both Ctrl+l and Down).  
    Fix..........A block level trigger KEY-CREREC is added in block GORDOCM.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2245
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_STVVTYP_1
	
	   FUNCTION SELECT_STVVTYP_1 (IVAR_1 VARCHAR2, OVAR_1 IN OUT VARCHAR2)
   RETURN BOOLEAN IS
      CURSOR PTI_CURSOR IS
         SELECT STVVTYP_DESC
         FROM   STVVTYP
         WHERE  STVVTYP_CODE = IVAR_1;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO OVAR_1;
      RETURN (PTI_CURSOR%NOTFOUND);
   END;
	*/
	//ID:2246
	/* <p>
/* </p>
		* @param ivar1
		* @param ovar1
		*/
		public NBool selectStvvtyp1(NString ivar1, Ref<NString> ovar1)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT STVVTYP_DESC " +
	" FROM STVVTYP " +
	" WHERE STVVTYP_CODE = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ovar1.val = ptiCursorResults.getStr(0);
				}
				return ((toBool(ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_STVNATN_2
	
	   FUNCTION SELECT_STVNATN_2 (IVAR_1 VARCHAR2, OVAR_1 IN OUT VARCHAR2)
   RETURN BOOLEAN IS
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = IVAR_1;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO OVAR_1;
      RETURN (PTI_CURSOR%NOTFOUND);
   END;
	*/
	//ID:2247
	/* <p>
/* </p>
		* @param ivar1
		* @param ovar1
		*/
		public NBool selectStvnatn2(NString ivar1, Ref<NString> ovar1)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT STVNATN_NATION " +
	" FROM STVNATN " +
	" WHERE STVNATN_CODE = :P_IVAR_1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ovar1.val = ptiCursorResults.getStr(0);
				}
				return ((toBool(ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_5
	
	PROCEDURE AUDIT_TRAIL_5_5 IS
<multilinecomment>
Audit Trail: 5.5
1. Remove calls to Payroll, HR reference Libraries.     AY 04/23/2002
2. Added GUIALTI Query Form Call for ID.                AY 05/23/2002
3. New Form for Visa Enhanced Tracking.                 AY 08/16/2001
4. Add ADMR/Checklist processing                       CLF 07/11/02
5. Add CONFIDENTIAL/DECEASED                           CLF 07/11/02
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:2248
	/* <p>
/* </p>
		*/
		public void auditTrail55()
		{
		}

	
	/* Original PL/SQL code for Prog Unit UPD_CHKL_DATE
	
	PROCEDURE UPD_CHKL_DATE (pidm_in  IN number) IS
   stmt_string       VARCHAR2(200);                                           
BEGIN  
  stmt_string := 'BEGIN sakchkb.P_intl_UpdChecklist(' || pidm_in || ', ''NULL''); END;';
  GOKDBMS.DYNAMIC_SQL(stmt_string);
END;

	*/
	//ID:2249
	/* <p>
/* </p>
		* @param pidmIn
		*/
		public void updChklDate(NNumber pidmIn)
		{
			NString stmtString= NString.getNull();
			stmtString = toStr("BEGIN sakchkb.P_intl_UpdChecklist(").append(pidmIn).append(", 'NULL'); END;");
			Gokdbms.dynamicSql(stmtString);
		}

	
	/* Original PL/SQL code for Prog Unit UPD_APP_STATUS
	
	PROCEDURE UPD_APP_STATUS(pidm_in  IN number) IS
   stmt_string       VARCHAR2(200);                                           
BEGIN 
   stmt_string := 'BEGIN sakchkb.P_UpdAppStatus(' || pidm_in || ', ''NULL''); END;';             
   GOKDBMS.DYNAMIC_SQL(stmt_string);
END;
	*/
	//ID:2250
	/* <p>
/* </p>
		* @param pidmIn
		*/
		public void updAppStatus(NNumber pidmIn)
		{
			NString stmtString= NString.getNull();
			stmtString = toStr("BEGIN sakchkb.P_UpdAppStatus(").append(pidmIn).append(", 'NULL'); END;");
			Gokdbms.dynamicSql(stmtString);
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. HCheng          01-OCT-2002         
   Applied 5.5 system test defect correction.
2. HCheng          24-OCT-2002
   Defect#: 81119
   Problem: Some objects's triggers referred to local version 
            of GOQOLIB. As a result the generated goaintl.fmx
            didn't work with a database that has non-baseline
            seed numbers.
   Resolution: Modified property of related objects' triggers
               to make them re-inherit trigger's text from GOQOLIB.
3. HCheng          06-DEC-2002
   Defect#: 82380
   Problem: Infinite loop occured when enter-query in block GORVISA.
   Solution: In order to have original code not processed in enter-query mode, 
             added IF-logic (IF NAME_IN('SYSTEM.MODE') <> 'ENTER-QUERY') to 
             GORVISA.WHEN-NEW-RECORD-INSTANCE, GORVISA.GORVISA_NO_ENTRIES.POST-CHANGE, 
             POST-TEXT-ITEM, and GORVISA.GORVISA_ENTRY_IND.WHEN-CHECKBOX-CHANGED.
             Created new trigger GORVISA.KEY-ENTQRY.
4. HCheng          16-APR-2003
   Modified error message to 'Certification Receipt Date Can Not be Earlier Than 
   Issue Date' in Trigger GOBINTL.GOBINTL_CERT_DATE_RECEIPT.WHEN-VALIDATE-ITEM.

AUDIT TRAIL: 6.0.0.1
1. HCheng          03/14/2003
   Defect#: 82315
   Problem: It is possible for GLOBAL ID not to get updated when exiting from GOAINTL.
   Solution: Modified trigger KEY_BLOCK.POST_BLOCK to assign current KEY-BLOCK.ID to
             GLOBAL.KEY_IDNO.
2. HCheng          03/14/2003
   Defect#: 84188
   Problem: Limited valid data for GORVISA_NO_ENTRIES to number(0-9) only, but 'M' and
            'S' should be valid also.
   Solution: Modified IF logic to make 'M' & 'S' to be valid data in triggers 
             GORVISA_NO_ENTRIES.POST-CHANGE and GORVISA_NO_ENTRIES.POST-TEXT-ITEM. 
3. HCheng         03/14/2003
   Defect#: 80984
   Problem: The new SEVIS code field does not display on STVVTYP_LOV.
   Solution: Added the new SEVIS code field on local STVVTYP_RG and STVVTYP_LOV.
4. HCheng         03/14/2003
   Defect#: 84571   
   Problem: The new SEVIS Equiv field does not display on STVNATN_LOV.
   Solution: Added the new SEVIS Equiv field on local STVNATN_RG and STVNATN_LOV.
5. Rk							04/17/2003
	 Defect#: 84313
	 Problem with Visa data entry/update/delete in GOAINTL Gen55 defect
	 Solution: Created default values in GTVSDAX for GORVISA_NATN_CODE_ISSUE, 
	 GORVISA_VISA_NUMBER, Start and Expire date. Assign  default values to GORVISA
	 fields if these values are null. 
	 On display hide these values.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2251
	/* <p>
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_GORVISA_DELETE
	
	FUNCTION Check_GORVISA_DELETE (pidm_in number,seq_no_in number) RETURN BOOLEAN IS

    l_value varchar2(20);
    CURSOR rec_exists IS
      SELECT 'x'
        FROM gordocm
       WHERE gordocm_PIDM = pidm_in and
       	     gordocm_seq_no = seq_no_in;
         
begin
	
	open rec_exists;
	fetch rec_exists into l_value;
	close rec_exists;
	if l_value is null then
		return false;
	else 
		return true;
	end if;
	
END;
	*/
	//ID:2252
	/* <p>
/* </p>
		* @param pidmIn
		* @param seqNoIn
		*/
		public NBool checkGorvisaDelete(NNumber pidmIn, NNumber seqNoIn)
		{
			int rowCount = 0;
			NString lValue= NString.getNull();
			String sqlrecExists = "SELECT 'x' " +
	" FROM gordocm " +
	" WHERE gordocm_PIDM = :P_PIDM_IN AND gordocm_seq_no = :P_SEQ_NO_IN ";
			DataCursor recExists = new DataCursor(sqlrecExists);
			try {
				//Setting query parameters
				recExists.addParameter("P_PIDM_IN", pidmIn);
				recExists.addParameter("P_SEQ_NO_IN", seqNoIn);
				
				recExists.open();
				ResultSet recExistsResults = recExists.fetchInto();
				if ( recExistsResults != null ) {
					lValue = recExistsResults.getStr(0);
				}
				if ( lValue.isNull() )
				{
					return  toBool(NBool.False);
				}
				else {
					return  toBool(NBool.True);
				}
				}finally{
					recExists.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_NULL_DATES
	
	FUNCTION check_null_dates (pidm_in number, seqno_in number)
		 RETURN boolean IS
	     ret_val boolean;
       tmp1		number;
       CURSOR CURSOR_NULLDATE IS
         SELECT GORVISA_SEQ_NO
         FROM   GORVISA
         WHERE  GORVISA_PIDM = pidm_in
         AND    GORVISA_SEQ_NO <> seqno_in
         AND    GORVISA_VISA_EXPIRE_date is null
         AND    GORVISA_VISA_START_date  is null ;
BEGIN


         OPEN CURSOR_NULLDATE;
         FETCH CURSOR_NULLDATE INTO tmp1; 
         if tmp1 is not null then
						ret_val := true;
         else
         		ret_val :=False;
         end if;
         close CURSOR_NULLDATE;
         return ret_val;

END;
	*/
	//ID:2253
	/* <p>
/* </p>
		* @param pidmIn
		* @param seqnoIn
		*/
		public NBool checkNullDates(NNumber pidmIn, NNumber seqnoIn)
		{
			int rowCount = 0;
			NBool retVal= NBool.getNull();
			NNumber tmp1= NNumber.getNull();
			String sqlcursorNulldate = "SELECT GORVISA_SEQ_NO " +
	" FROM GORVISA " +
	" WHERE GORVISA_PIDM = :P_PIDM_IN AND GORVISA_SEQ_NO <> :P_SEQNO_IN AND GORVISA_VISA_EXPIRE_date IS NULL AND GORVISA_VISA_START_date IS NULL ";
			DataCursor cursorNulldate = new DataCursor(sqlcursorNulldate);
			try {
				//Setting query parameters
				cursorNulldate.addParameter("P_PIDM_IN", pidmIn);
				cursorNulldate.addParameter("P_SEQNO_IN", seqnoIn);
				
				cursorNulldate.open();
				ResultSet cursorNulldateResults = cursorNulldate.fetchInto();
				if ( cursorNulldateResults != null ) {
					tmp1 = cursorNulldateResults.getNumber(0);
				}
				if ( !tmp1.isNull() )
				{
					retVal = toBool(NBool.True);
				}
				else {
					retVal = toBool(NBool.False);
				}
				return retVal;
				}finally{
					cursorNulldate.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_EXPIRE_DATES
	
	FUNCTION Check_Expire_Dates(pidm_in number, seqno_in number) RETURN boolean IS

		   tmp1 date := '';
       tmp2 date := '';
       tmp3 number := '';
       ret_val boolean;
       CURSOR PTI_CURSOR IS
         SELECT GORVISA_VISA_START_DATE,GORVISA_VISA_EXPIRE_DATE,GORVISA_SEQ_NO
         FROM   GORVISA
         WHERE  GORVISA_PIDM = pidm_in
         AND    GORVISA_SEQ_NO <> seqno_in
         AND  ((:GORVISA_VISA_EXPIRE_date BETWEEN GORVISA_VISA_START_date
         AND    GORVISA_VISA_EXPIRE_date)
         OR     (:GORVISA_VISA_START_date BETWEEN GORVISA_VISA_START_date
         AND    GORVISA_VISA_EXPIRE_date));

       BEGIN
--       	message ('New Expire date disp ' ||TO_CHAR(:GORVISA_VISA_EXPIRE_date_disp,'YYYYMMDD') ||' Expire date '||:GORVISA_VISA_EXPIRE_date);
--       	message ('Start date disp ' ||TO_CHAR(:GORVISA_VISA_START_date_disp,'YYYYMMDD') ||' Start date '||:GORVISA_VISA_START_date);
       	
         OPEN PTI_CURSOR;
         FETCH PTI_CURSOR INTO tmp1, tmp2, tmp3; 
         close  PTI_CURSOR;
       
--       message('tmp1 ==> ' || tmp1 || ' tmp2 ==> ' || tmp2 || ' tmp3 ==> ' || tmp3);
--       message('GORVISA_VISA_EXPIRE_DATE ==> ' || :GORVISA_VISA_EXPIRE_DATE || ' gorvisa_seq_no ==> ' || :gorvisa_seq_no);
--       pause;
       
         if tmp1 is not null then
						ret_val := true;
         else
         		ret_val :=false;
         end if;
	       return ret_val;
END;
	*/
	//ID:2254
	/* <p>
/* </p>
		* @param pidmIn
		* @param seqnoIn
		*/
		public NBool checkExpireDates(GorvisaAdapter gorvisaElement, NNumber pidmIn, NNumber seqnoIn)
		{
			int rowCount = 0;
			NDate tmp1 = toDate("");
			NDate tmp2 = toDate("");
			NNumber tmp3 = toNumber("");
			NBool retVal= NBool.getNull();
			String sqlptiCursor = "SELECT GORVISA_VISA_START_DATE, GORVISA_VISA_EXPIRE_DATE, GORVISA_SEQ_NO " +
	" FROM GORVISA " +
	" WHERE GORVISA_PIDM = :P_PIDM_IN AND GORVISA_SEQ_NO <> :P_SEQNO_IN AND ((:GORVISA_VISA_EXPIRE_DATE BETWEEN GORVISA_VISA_START_date AND GORVISA_VISA_EXPIRE_date) OR (:GORVISA_VISA_START_DATE BETWEEN GORVISA_VISA_START_date AND GORVISA_VISA_EXPIRE_date)) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//        	message ('New Expire date disp ' ||TO_CHAR(:GORVISA_VISA_EXPIRE_date_disp,'YYYYMMDD') ||' Expire date '||:GORVISA_VISA_EXPIRE_date);
				//        	message ('Start date disp ' ||TO_CHAR(:GORVISA_VISA_START_date_disp,'YYYYMMDD') ||' Start date '||:GORVISA_VISA_START_date);
				//Setting query parameters
				ptiCursor.addParameter("P_PIDM_IN", pidmIn);
				ptiCursor.addParameter("P_SEQNO_IN", seqnoIn);
				ptiCursor.addParameter("GORVISA_VISA_EXPIRE_DATE", gorvisaElement.getGorvisaVisaExpireDate());
				ptiCursor.addParameter("GORVISA_VISA_START_DATE", gorvisaElement.getGorvisaVisaStartDate());
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					tmp1 = ptiCursorResults.getDate(0);
					tmp2 = ptiCursorResults.getDate(1);
					tmp3 = ptiCursorResults.getNumber(2);
				}
				
				//        message('tmp1 ==> ' || tmp1 || ' tmp2 ==> ' || tmp2 || ' tmp3 ==> ' || tmp3);
				//        message('GORVISA_VISA_EXPIRE_DATE ==> ' || :GORVISA_VISA_EXPIRE_DATE || ' gorvisa_seq_no ==> ' || :gorvisa_seq_no);
				//        pause;
				if ( !tmp1.isNull() )
				{
					retVal = toBool(NBool.True);
				}
				else {
					retVal = toBool(NBool.False);
				}
				return retVal;
				}finally{
					ptiCursor.close();
				}
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
	//ID:2255
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit ISVISARECORDS
	
	FUNCTION isVisaRecords RETURN BOOLEAN IS

    CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   GORVISA
         WHERE  GORVISA_PIDM = :GORVISA_PIDM;
     hold_var varchar2(1);
BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO hold_var;
      
      if PTI_CURSOR%FOUND then
      	 close PTI_CURSOR;
      	 return true;
      else
      	 close PTI_CURSOR;
      	 return false;
      end if;
END;
	*/
	//ID:2256
	/* <p>
/* </p>
		*/
		public NBool isvisarecords(GorvisaAdapter gorvisaElement)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT 'X' " +
	" FROM GORVISA " +
	" WHERE GORVISA_PIDM = :GORVISA_PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			NString holdVar= NString.getNull();
			try {
				//Setting query parameters
				ptiCursor.addParameter("GORVISA_PIDM", gorvisaElement.getGorvisaPidm());
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					holdVar = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.found() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
				}finally{
					ptiCursor.close();
				}
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
	//ID:2257
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
1. Michael Hitrik  06/28/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2258
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
1. Michael Hitrik  06/28/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2259
	/* <p>
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>AUDIT TRAIL: 8.0
1.  Defect.......1-2PYWJK
    Signoff....Shriya Naidu           Oct 18,2007
    Problem...
    The use of Shift F6 or the delete button on GOAINTL automatically saves a record.
    Fix....Added code in When-tab-page-changed trigger not to change the tab before saving the data.
    In GORVISA block added code in Key-Commit to commit the for when delete is pressed.
    
2.  SSN changes
    Signoff      Shriya Naidu	       Oct 22,2007
    changed the width of item GOBINTL_FOREIGN_SSN from 80 to 134. Created new trigger When-Validate-Item for the item 
    GOBINTL_FOREIGN_SSN to check for the length of SSN and ammended code in when-new-form-instance for dynamic hint.
    
    
3. Defect....1-2TFT2K
   Signoff... Shriya            OCt 29,2007
   Problem :GOAINTL stuck in infinite processing loop - Another Visa with unspecified dates exists
   Fix: :  Changed to check for :SYSTEM.BLOCK_STATUS not equal to NEW and then proceeded to check for the
   record in WHEN-NEW-RECORD-INSTANCE of GORSIVA. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:2260
	/* <p>
/* </p>
		*/
		public void auditTrail80()
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
   --
   Update block Property Palette Database.Query Data Source Name
     from lower case "gorvisa" to upper case "GORVISA".
   Update block Property Palette Database.Query Data Source Name
     from lower case "gordocm" to upper case "GORDOCM".
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2261
	/* <p>
/* </p>
		*/
		public void auditTrail8101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOAINTL
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Sep 24 10:01:40 2010
-- MSGSIGN : #d0e2ce18dc9c24b8
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:2262
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
1. Eapen Mani   23 February 2009
   Defect:1-4FLWX5
   Problem : Deletion of an ID's detail on GOAINTL doesn't delete from the table GOBINTL.
   Fix: Add a user defined trigger DELETE_GOBINTL to delete the record from GOBINTL 
        if the details for the pidm delete.
        
2. Eapen Mani 04 March 2009
   Execute the rekey against the object goaintl.fmb. 
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2263
	/* <p>
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_1
	
	PROCEDURE AUDIT_TRAIL_8_3_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.3.1
1. LVH 07/10/2010
   RPE 1-9GR9HN
   Changed the Data Length property from 15 to 25 for GOBINTL_PASSPORT_ID to enable the
   full 25 characters as defined in the database to be used.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;


	*/
	//ID:2264
	/* <p>
/* </p>
		*/
		public void auditTrail831()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment> 
AUDIT TRAIL: 8.4
1. LVH 09/22/2010
   Defect 1-7VHKPR
   Moved the logic for Entry and Number of Entries out of field validation to
   calls in pre-update and pre-insert to the new trigger VALIDATE_ENTRY_IND so 
   that the user was not trapped into entering invalid data if the entry was 
   accidentally checked.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;


	*/
	//ID:2265
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	

}
