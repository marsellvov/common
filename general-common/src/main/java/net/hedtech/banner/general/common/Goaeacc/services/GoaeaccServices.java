package net.hedtech.banner.general.common.Goaeacc.services;

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


import net.hedtech.banner.general.common.Goaeacc.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Goaeacc.model.*;



public class GoaeaccServices extends AbstractSupportCodeObject{
	
	
	public GoaeaccServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoaeaccTask  getTask() {
		return (GoaeaccTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Goaeacc.model.GoaeaccModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1_1
	
	PROCEDURE AUDIT_TRAIL_3_1_1 IS
begin
<multilinecomment>
AUDIT TRAIL: 3.1.1
1. Initial release of form to construct relationship between PIDM and
Oracle ID.
                                              NMCKINNE 06/06/99
AUDIT TRAIL END
</multilinecomment>
   null;
END;
	*/
	//ID:1058
	/* <p>
/* </p>
		*/
		public void auditTrail311()
		{
			// AUDIT TRAIL: 3.1.1
			// 1. Initial release of form to construct relationship between PIDM and
			// Oracle ID.
			// NMCKINNE 06/06/99
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit P_CHECKUSERNAME
	
	procedure P_CheckUsername
      (username_in  in  varchar2,
       id        in out varchar2,
--       vusr_rec  in  out varchar2,
       iden_reccnt  in  out number,
       err_code  in  out varchar2)
is
  user_ind         varchar2(1);
--  vbs_state        varchar2(1);
--  vusr_recind      varchar2(1);
  username_recind  varchar2(1);
<multilinecomment>
  Cursor CheckGobvusrC is
    select 'Y'
    from gobvusr
    where gobvusr_user_id = username_in;
</multilinecomment>
  Cursor GuridenC is
   select count(*) reccnt
    from guriden
    where guriden_user_id  = username_in
    group by guriden_user_id;
  cursor CheckUsernameC is
    select *
    from all_users
    where all_users.username = username_in;
  user_rec     CheckUsernameC%rowtype;
begin
  err_code := '0';
--  vusr_rec := '';
  iden_reccnt := 0;
  id := '';
  open CheckUsernameC;
  fetch CheckUsernameC into user_rec;
  if CheckUsernameC%notfound then
        user_ind := 'N';
        err_code := '1';
  else
        user_ind := 'Y';
  end if;
  if user_ind = 'Y' then
<multilinecomment>
     vbs_state := nvl(substr(F_CheckVBSState,1,1),'0');
     if vbs_state = '3' then
        open CheckGobvusrC;
        fetch CheckGobvusrC into vusr_recind;
        if CheckGobvusrC%notfound then
           vusr_rec := 'N';
        else
           vusr_rec := 'Y';
        end if;
        close CheckGobvusrC;
     end if;
</multilinecomment>
     iden_reccnt := 0;
     open GuridenC;
     fetch GuridenC into iden_reccnt;
     	if GuridenC%NOTFOUND then 
	null;
        end if;
     close GuridenC;
 end if;
end P_CheckUsername;
	*/
	//ID:1059
	/* <p>
/* </p>
		* @param usernameIn
		* @param id
		* @param idenReccnt
		* @param errCode
		*/
		public void pCheckusername(NString usernameIn, Ref<NString> id, Ref<NNumber> idenReccnt, Ref<NString> errCode)
		{
			int rowCount = 0;
			NString userInd= NString.getNull();
			//   vbs_state        varchar2(1);
			//   vusr_recind      varchar2(1);
			NString usernameRecind= NString.getNull();
			String sqlguridenc = "SELECT count(*) reccnt " +
	" FROM guriden " +
	" WHERE guriden_user_id = :P_USERNAME_IN " +
	" GROUP BY guriden_user_id ";
			DataCursor guridenc = new DataCursor(sqlguridenc);
			String sqlcheckusernamec = "SELECT * " +
	" FROM all_users " +
	" WHERE all_users.username = :P_USERNAME_IN ";
			DataCursor checkusernamec = new DataCursor(sqlcheckusernamec);
			TableRow userRec= null;
			try {
				errCode.val = toStr("0");
				//   vusr_rec := '';
				idenReccnt.val = toNumber(0);
				id.val = toStr("");
				//Setting query parameters
				checkusernamec.addParameter("P_USERNAME_IN", usernameIn);
				checkusernamec.open();
				userRec = checkusernamec.fetchRow();
				if ( checkusernamec.notFound() )
				{
					userInd = toStr("N");
					errCode.val = toStr("1");
				}
				else {
					userInd = toStr("Y");
				}
				if ( userInd.equals("Y") )
				{
					// vbs_state := nvl(substr(F_CheckVBSState,1,1),'0');
					// if vbs_state = '3' then
					// open CheckGobvusrC;
					// fetch CheckGobvusrC into vusr_recind;
					// if CheckGobvusrC%notfound then
					// vusr_rec := 'N';
					// else
					// vusr_rec := 'Y';
					// end if;
					// close CheckGobvusrC;
					// end if;
					idenReccnt.val = toNumber(0);
					//Setting query parameters
					guridenc.addParameter("P_USERNAME_IN", usernameIn);
					guridenc.open();
					ResultSet guridencResults = guridenc.fetchInto();
					if ( guridencResults != null ) {
						idenReccnt.val = guridencResults.getNumber(0);
					}
					if ( guridenc.notFound() )
					{
					}
					guridenc.close();
				}
				}finally{
					checkusernamec.close();
					guridenc.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0.1
1. AC  07/29/99
   New Form for Banner General. Enhancements for Banner2000 4.0 upgrade.  
   These include replacing the toolbar object group which contains the new horizontal 
   and vertical toolbars, the navigational frame.  Also changes the coordinate system 
   to REAL and resizes the windows and canvases.  Changes to name visual attributes, 
   many new property classes and reduced number of redundant triggers.  
AUDIT TRAIL: 4.1
2. AC	11/24/1999
   Remove check on Username that errors when username entered has multiple GURIDEN records.  
   This check no longer needs to be in this form.  This corrects internal defect 31485.  
   Deleted guriden code from when-validate-item trigger on item GOBEACC_USERNAME. 
3. AC   1/18/2000
   Added a RAISE FORM_TRIGGER_FAILURE in the WHEN-VALIDATE-ITEM trigger at the GOBEACC_USERNAME
   item level to disable a user to enter an invalid username and navigate to the next field. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1060
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_CHECKUSERPIDM
	
	FUNCTION F_CheckUserPIDM 
     (user_name varchar2,
      pidm number)
RETURN varchar2 IS
 eacc_username    varchar2(30);
 eacc_pidm        number(8);
 error_ind        varchar2(1);
 cursor GobeaccUserC is
   select '1'
    from gobeacc
    where gobeacc_username = user_name;
 cursor GobeaccPIDMC is
   select '2'
    from gobeacc
    where gobeacc_pidm = pidm;
BEGIN
  error_ind := '0';
  open GobeaccUserC;
  fetch GobeaccUserC into error_ind;
  if GobeaccUserC%notfound then
     null;
  else
      close GobeaccUserC;
      return error_ind;
  end if;
  open GobeaccPIDMC;
  fetch GobeaccPIDMC into error_ind;
  if GobeaccPIDMC%notfound then
     null;
  else
      close GobeaccPIDMC;
      return error_ind;
  end if;
  close GobeaccUserC;
  close GobeaccPIDMC;
  return error_ind;
END;
	*/
	//ID:1061
	/* <p>
/* </p>
		* @param userName
		* @param pidm
		*/
		public NString fCheckuserpidm(NString userName, NNumber pidm)
		{
			int rowCount = 0;
			NString eaccUsername= NString.getNull();
			NNumber eaccPidm= NNumber.getNull();
			NString errorInd= NString.getNull();
			String sqlgobeaccuserc = "SELECT '1' " +
	" FROM gobeacc " +
	" WHERE gobeacc_username = :P_USER_NAME ";
			DataCursor gobeaccuserc = new DataCursor(sqlgobeaccuserc);
			String sqlgobeaccpidmc = "SELECT '2' " +
	" FROM gobeacc " +
	" WHERE gobeacc_pidm = :P_PIDM ";
			DataCursor gobeaccpidmc = new DataCursor(sqlgobeaccpidmc);
			try {
				errorInd = toStr("0");
				//Setting query parameters
				gobeaccuserc.addParameter("P_USER_NAME", userName);
				gobeaccuserc.open();
				ResultSet gobeaccusercResults = gobeaccuserc.fetchInto();
				if ( gobeaccusercResults != null ) {
					errorInd = gobeaccusercResults.getStr(0);
				}
				if ( gobeaccuserc.notFound() )
				{
				}
				else {
					gobeaccuserc.close();
					return errorInd;
				}
				//Setting query parameters
				gobeaccpidmc.addParameter("P_PIDM", pidm);
				gobeaccpidmc.open();
				ResultSet gobeaccpidmcResults = gobeaccpidmc.fetchInto();
				if ( gobeaccpidmcResults != null ) {
					errorInd = gobeaccpidmcResults.getStr(0);
				}
				if ( gobeaccpidmc.notFound() )
				{
				}
				else {
					gobeaccpidmc.close();
					return errorInd;
				}
				gobeaccuserc.close();
				gobeaccpidmc.close();
				return errorInd;
				}finally{
					gobeaccuserc.close();
					gobeaccpidmc.close();
				}
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
	//ID:1062
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
1. NL 01/08/2000
   Problem: The form does not allow to query on ID number; all records are 
   					returned when performing this action.
   Functional Impact: User now can query on ID number.
   Technical Fix: Added PRE-QUERY trigger and created 'QUERY_ID' trigger in 
   					GOBEACC block.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1063
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_2
	
	PROCEDURE AUDIT_TRAIL_5_2 IS
<multilinecomment>
AUDIT TRAIL: 5.2
1. Defect #48033                                         XL 03/12/01
Title:    Wrong error message when insert new record and Spelling error of word 'associated'.
Problem:  1) Item GOBEACC.GOBEACC_PIDM is not updated properly when KEYBLOCK.KEYBLOCK_ID
		         changes at the time record is being inserted.  
          2) spelling error for word 'associated' in the message
              "*ERROR* The individual is already assocaited with an Oracle Username"
Solution: 1) in trigger pre_insert under the GOBEACC of Data Block, add the following code:
             SELECT SPRIDEN_PIDM 
             into :gobeacc.gobeacc_pidm
             FROM   SPRIDEN 
             WHERE  SPRIDEN_CHANGE_IND IS NULL
             AND   SPRIDEN_ID = :GOBEACC.WACS_ID;
             
             to let the form pick the correct SPRIDEN PIDM that associated with a maybe 
             already changed GOBEACC.WACS_ID when insert a record.
           2) change the word from 'assocaited' into 'associated'
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1064
	/* <p>
/* </p>
		*/
		public void auditTrail52()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
BEGIN
<multilinecomment>
AUDIT TRAIL: 5.4
1. George Shalovka  15 November2001  GUIALTI Mod
   Add code to GOBEACC.WACS_ID.Key-CQuery to call GUIALTI form.
   Change item name BUTTON_CONTROL_BLOCK.WACS_ID_BTN to WACS_ID_LBT 
     to meet Banner standards.  This allows standard triggers for 
     Option List Window presentation to work properly.
   Modify code in BUTTON_CONTROL_BLOCK.WACS_ID_LBT.When-Button-Pressed
      to display Option List Window.
   Modified associated AutoHint text.
Audit Trail End
</multilinecomment>
null;
END;
	*/
	//ID:1065
	/* <p>
/* </p>
		*/
		public void auditTrail54()
		{
			// AUDIT TRAIL: 5.4
			// 1. George Shalovka  15 November2001  GUIALTI Mod
			// Add code to GOBEACC.WACS_ID.Key-CQuery to call GUIALTI form.
			// Change item name BUTTON_CONTROL_BLOCK.WACS_ID_BTN to WACS_ID_LBT
			// to meet Banner standards.  This allows standard triggers for
			// Option List Window presentation to work properly.
			// Modify code in BUTTON_CONTROL_BLOCK.WACS_ID_LBT.When-Button-Pressed
			// to display Option List Window.
			// Modified associated AutoHint text.
			// Audit Trail End
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
BEGIN
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/21/2003
   Corrected broken link of g$_icon_button class that was holding onto g$_hint obsolete routine

2. Defect 70-0108, LN 13-Apr-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routine for ID item in the detailed block.  
   Technical Fix:
     Modified trigger GOBEACC.POST-QUERY to call g$_sel_spriden_id_name.
     
3. FGAC project      WG  6/24/04
   Removed refereces to VBS from the GOBEACC_USERNAME button and validation.
4. VBS Error         Michael Hitrik 09/10/2004
   Added VBS Error Message to ON-ERROR trigger
Audit Trail End
</multilinecomment>
null;
END;
	*/
	//ID:1066
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
			// AUDIT TRAIL: 7.0
			// 1. TGKinderman 11/21/2003
			// Corrected broken link of g$_icon_button class that was holding onto g$_hint obsolete routine
			// 2. Defect 70-0108, LN 13-Apr-2004
			// Problem:
			// ID validation has local logic when should use g$/product$ routine(s).
			// Functional Impact:
			// Replaced local ID logic with g$ routine for ID item in the detailed block.
			// Technical Fix:
			// Modified trigger GOBEACC.POST-QUERY to call g$_sel_spriden_id_name.
			// 3. FGAC project      WG  6/24/04
			// Removed refereces to VBS from the GOBEACC_USERNAME button and validation.
			// 4. VBS Error         Michael Hitrik 09/10/2004
			// Added VBS Error Message to ON-ERROR trigger
			// Audit Trail End
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
	//ID:1067
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
BEGIN
<multilinecomment>
AUDIT TRAIL: 7.2
1. G Shalovka  20 September 2005
   Correct 72-0050: form failing to find objects referenced
     from GOQOLIB when opened in Forms Builder.
   Delete GTVVAPP_APPLICATION_LOV, GOVVRAC_VOBJ_LOV, GOBVUSR_LOV,
     GTVVAPP_APPLICATION_RG, GOVVRAC_VOBJ_RG, GOBVUSR_RG.
AUDIT TRAIL END
</multilinecomment>
null;
END;
	*/
	//ID:1068
	/* <p>
/* </p>
		*/
		public void auditTrail72()
		{
			// AUDIT TRAIL: 7.2
			// 1. G Shalovka  20 September 2005
			// Correct 72-0050: form failing to find objects referenced
			// from GOQOLIB when opened in Forms Builder.
			// Delete GTVVAPP_APPLICATION_LOV, GOVVRAC_VOBJ_LOV, GOBVUSR_LOV,
			// GTVVAPP_APPLICATION_RG, GOVVRAC_VOBJ_RG, GOBVUSR_RG.
			// AUDIT TRAIL END
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
	//ID:1069
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
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1070
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
BEGIN
<multilinecomment>
AUDIT TRAIL: 8.2
1.  LVH 01-05-2009 1-4B5A6W
    Added KEY-DELREC trigger to GOBEACC to create errors with dynamic validation for users 
    defined in NTRPROX and NTRPRXY.
AUDIT TRAIL END
</multilinecomment>
  NULL;
END;

	*/
	//ID:1071
	/* <p>
/* </p>
		*/
		public void auditTrail82()
		{
			// AUDIT TRAIL: 8.2
			// 1.  LVH 01-05-2009 1-4B5A6W
			// Added KEY-DELREC trigger to GOBEACC to create errors with dynamic validation for users
			// defined in NTRPROX and NTRPRXY.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOAEACC
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Mar 03 10:45:21 2009
-- MSGSIGN : #53a09be1cf97d5df
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1072
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_1
	
	PROCEDURE AUDIT_TRAIL_8_3_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.1
1. LVH 01/08/2010 Defect 1-9DM0XN
   Trying to delete a user on GOAEACC or GSASECR does a check for NTRPROX and NTRPRXY 
   tables if Position Control is installed. However, those two tables were created 
   in 8.1 so any client with HR prior to 8.1 will receive an error message when 
   trying to delete.  Added EXCEPTION BLOCK processing to GOBEACC trigger KEY-DELREC
   to bypass pre 8.1 situtations.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1073
	/* <p>
/* </p>
		*/
		public void auditTrail8301()
		{
		}

	
	

}
