package net.hedtech.banner.general.common.Guamesg.services;

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


import net.hedtech.banner.general.common.Guamesg.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guamesg.model.*;



public class GuamesgServices extends AbstractSupportCodeObject{
	
	
	public GuamesgServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuamesgTask  getTask() {
		return (GuamesgTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guamesg.model.GuamesgModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. NR  07/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. EPM 05/20/99
   Copied over changes from 3.0 that corrected defect 12639.

AUDIT TRAIL: 4.1

1. EPM 10/22/99
   Changed the gurtklr_system_ind item from a pulldown list to
   a g$_code_class item.  Also had to add a gurtklr_system_desc
   field to show the sysi_desc.  This was done so that when a person
   entered a message in geatask through an event that was in 
   a system code that wasn't one of the main 6 product groups, it 
   would show up in guamesg when you navigated there.  Defect 14414.
   Previously you would navigate to the guamesg form when you 
   received an error message but it did not query your message since
   it didn't have all the system code values. 

2. AC 11/02/1999
   Deleted the form level trigger key-nxtkey which resolves the issue
   of doubleclicking on GURTKLR_TODO_DATE item when the select is enabled, 
   and getting the FRM-40105 error of unable to resolve reference of 
   GURTKLR_CODE.  Set the GURTKLR_SYSTEM_IND back true for the required 
   property.  Corrected internal defect 14447.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1164
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ 02/11/99
   Modify the activity date item to be datetime instead of just date.  Add a
   format mask to make the time not display and update the commit logic to 
   append the current time to the date.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1165
		public void auditTrail40()
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

AUDIT TRAIL: 3.1.1
1. EPM 5/14/99
   Added trigger enable_disable_idno to the gurtklr block that enables or disables the ref id 
   item and button based on whether the source field is null or not.  Added trigger 
   when-new-record-instance to the gurtklr block that calls enable_disable_idno trigger and 
   makes sure that the cursor isn't in the ref id field when it is being dynamically 
   enabled/disabled.  Deleted the enable/disable ref id field logic from the post-query trigger
   since it would now be redundant.  
  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1166
		public void auditTrail30B2k()
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
	//ID:1167
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>
AUDIT TRAIL: 5.3
1. Defect 66234. Rewrite V2 style POST-UPDATE trigger. EFD 8/7/2001
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL; 
END;
	*/
	//ID:1168
		public void auditTrail53()
		{
		}

	
	/* Original PL/SQL code for Prog Unit P_UPDATE_AMRCONT
	
	Procedure P_Update_Amrcont(PIDM_IN NUMBER, ITEM_IN VARCHAR2) IS
<multilinecomment> New function 8/6/2001 to replace V2 style trigger to
   update the ALUMNI contact table using dynamic sql EFD </multilinecomment>

  D_SQL VARCHAR2(2000);
  TKLR_SEQNO GURTKLR.GURTKLR_SEQNO%TYPE;

BEGIN
  D_SQL := 
    'SELECT MAX(GURTKLR_SEQNO) '||
    '  FROM GURTKLR '||
    ' WHERE (GURTKLR_SOURCE = ''AMACONT'' OR  '||
    '        GURTKLR_SOURCE = ''BWDKPCNT'')     '||
    '   AND GURTKLR_PIDM   = ' || PIDM_IN   ||  
    '   AND GURTKLR_ITEM_REFNO = ''' || ITEM_IN ||'''';
--
  GOKDBMS.DYNAMIC_SQL(D_SQL,TKLR_SEQNO);
  IF TKLR_SEQNO <> :GURTKLR_SEQNO THEN
  	 RETURN;
  END IF;
--    
  D_SQL := 
    'UPDATE AMRCONT                               '||
    'SET  (AMRCONT_TICK_STATUS,                   '||
    '      AMRCONT_TICK_DATE,                     '||
    '      AMRCONT_ACTIVITY_DATE) =               '||
    '      (SELECT GURTKLR_STATUS,                '||
    '              GURTKLR_TODO_DATE, SYSDATE     '||
    '         FROM GURTKLR                        '||
    '        WHERE (GURTKLR_SOURCE = ''AMACONT'' OR  '||
    '               GURTKLR_SOURCE = ''BWDKPCNT'')     '||
    '          AND GURTKLR_PIDM   = AMRCONT_PIDM  '||
    '          AND (GURTKLR_USER_ID  = '|| ''''||USER||'''' ||
    '             OR GURTKLR_CREATOR = '|| ''''||USER||'''' || ')' ||
    '          AND GURTKLR_SEQNO  = '|| :GURTKLR_SEQNO ||
    '          AND GURTKLR_ITEM_REFNO =           '||
    '              TO_CHAR(AMRCONT_ITEM_REFNO)    '||
    '          AND ROWNUM = 1)'                    ||
    'WHERE TO_CHAR(AMRCONT_ITEM_REFNO)='|| ITEM_IN ||
    '  AND AMRCONT_PIDM =' || PIDM_IN ;
--   
  GOKDBMS.DYNAMIC_SQL(D_SQL);
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    NULL;
END;
    
	*/
	//ID:1169
		public void pUpdateAmrcont(GurtklrAdapter gurtklrElement, NNumber pidmIn, NString itemIn)
		{
			NString dSql= NString.getNull();
			//NNumber tklrSeqno= NNumber.getNull();
			NString tklrSeqno= NString.getNull();
			try
			{
				dSql = toStr("SELECT MAX(GURTKLR_SEQNO) ").append("  FROM GURTKLR ").append(" WHERE (GURTKLR_SOURCE = 'AMACONT' OR  ").append("        GURTKLR_SOURCE = 'BWDKPCNT')     ").append("   AND GURTKLR_PIDM   = ").append(pidmIn).append("   AND GURTKLR_ITEM_REFNO = '").append(itemIn).append("'");
				// 
				Ref<NString> p_return_value1_ref = new Ref<NString>(tklrSeqno);
				Gokdbms.dynamicSql(dSql, p_return_value1_ref);
				tklrSeqno = p_return_value1_ref.val;
				if ( tklrSeqno.notEquals(gurtklrElement.getGurtklrSeqno()) )
				{
					return ;
				}
				dSql = toStr("UPDATE AMRCONT                               ").append("SET  (AMRCONT_TICK_STATUS,                   ").append("      AMRCONT_TICK_DATE,                     ").append("      AMRCONT_ACTIVITY_DATE) =               ").append("      (SELECT GURTKLR_STATUS,                ").append("              GURTKLR_TODO_DATE, SYSDATE     ").append("         FROM GURTKLR                        ").append("        WHERE (GURTKLR_SOURCE = 'AMACONT' OR  ").append("               GURTKLR_SOURCE = 'BWDKPCNT')     ").append("          AND GURTKLR_PIDM   = AMRCONT_PIDM  ").append("          AND (GURTKLR_USER_ID  = ").append("'").append(getUser()).append("'").append("             OR GURTKLR_CREATOR = ").append("'").append(getUser()).append("'").append(")").append("          AND GURTKLR_SEQNO  = ").append(gurtklrElement.getGurtklrSeqno()).append("          AND GURTKLR_ITEM_REFNO =           ").append("              TO_CHAR(AMRCONT_ITEM_REFNO)    ").append("          AND ROWNUM = 1)").append("WHERE TO_CHAR(AMRCONT_ITEM_REFNO)=").append(itemIn).append("  AND AMRCONT_PIDM =").append(pidmIn);
				Gokdbms.dynamicSql(dSql);
			}
			catch(NoDataFoundException e)
			{
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>
AUDIT TRAIL: 5.4
1. TGKinderman  11/06/2001
   Defect.......70763
   Problem......Getting ORA-936 on GUAMESG form when trying to update an existing
                record. On GUAMESG may get an error: FRM-40735 POST-UPDATE trigger
                raised unhandled exception ORA-00936.
   Resolution...The rewrite of V2 style POST-UPDATE trigger (defect 66234) was 
                incomplete.  Step 2 of the V2 style trigger was missed.
                   #EXEMACRO NOFAIL CASE :GURTKLR_SOURCE IS
                   WHEN 'AMACONT' THEN NULL;
                   WHEN OTHERS THEN ENDTRIG;
                   END CASE; 
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL; 
END;
	*/
	//ID:1170
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
	//ID:1171
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS 
<multilinecomment> 
AUDIT TRAIL: 7.0
1.  Michael Hitrik 02/06/2004
    Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface 
    Technical  Methodology for more details. 
2.  SJQ 03/18/2004
    Regenerated to pick up the new user preference settings.
3.  Defect 70-0141, LN 09-Jul-2004
    Problem:
      ID validation has local logic when should use g$/product$ routine(s).
    Functional Impact:
      Replaced local ID logic with g$ routine for item Reference ID.  
    Technical Fix:
      Modified triggers GURTKLR.IDNO.POST-CHANGE and GURTKLR.GURTKLR_PIDM.POST-CHANGE 
      to call g$_valid_all_id and g$_sel_spriden_id.
4.  SJQ 08/17/2004
    Add logic to the GURTKLR_USER_ID.POST-CHANGE to check if the recipient is 'BASELINE'.
    If it is, check to see if the user is authorized via security to access the 'BROADCAST'
    object.  This is the method by which users could generate broadcast messages on the
    main menu.  They must be authorized to access this object.

AUDIT TRAIL: 7.2
1.  SJQ 05/16/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
    
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1172
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
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	
	PROCEDURE AUDIT_TRAIL_7_4 IS
<multilinecomment>
AUDIT TRAIL: 7.4
1.  G Shalovka  12 July 2006
		Correct defect 1-N54W0:Query on field 'Reference ID' does not return all values.
		Modify form item GURTKLR.IDNO Property Database.Query Allowed to 'No', Database.Query Length to '0'.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;
	*/
	//ID:1174
		public void auditTrail74()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4_1_1
	
	PROCEDURE AUDIT_TRAIL_7_4_1_1 IS
<multilinecomment>
AUDIT TRAIL: 7.4.1.1
1.  Scott Geiser  27 April 2007
		Correct defect 1-2A3RTD
		Problem:  GUAMESG needs to be able to handle multiple messages when 
		          generated from the Advancement AMACONT form.
		Solution: Changed the P_Update_Amrcont program unit to select the maximum 
		          sequence number from the GURTKLR table.  If the record with the
		          maximum sequence number is not being updated, the AMRCONT record 
		          does not get updated. 
		     Code added:
		       D_SQL := 
                 'SELECT MAX(GURTKLR_SEQNO) '||
                 '  FROM GURTKLR '||
                 ' WHERE (GURTKLR_SOURCE = ''AMACONT'' OR  '||
                 '        GURTKLR_SOURCE = ''BWDKPCNT'')     '||
                 '   AND GURTKLR_PIDM   = ' || PIDM_IN   ||  
                 '   AND GURTKLR_ITEM_REFNO = ''' || ITEM_IN ||'''';
       --
         GOKDBMS.DYNAMIC_SQL(D_SQL,TKLR_SEQNO);    
         IF TKLR_SEQNO <> :GURTKLR_SEQNO THEN
  	        RETURN;
         END IF;
         
2.  Scott Geiser  02 May 2007
		Correct defect 1-2AFIIN
		Problem:  The problem is that the auto date population feature doesn't work 
		          in the date field after you get the" field is required message" on 
		          the field. It works the first time, it just doesn't work if you try 
		          to skip the field and them try to enter the date.        
    Solution:
       1. Changed the Required attribute of the GURTKLY_TODO_DATE to 'No'. 
       2. Added a WHEN-VALIDATE-ITEM trigger to GURTKLR_TODO_DATE to provide proper
          validation of the date.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;
	*/
	//ID:1175
		public void auditTrail7411()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1.  Scott Geiser  02 May 2007
		Correct defect 1-2AE2KD
		Migrating 7.4.1.1 defect 1-2A3RTD to 8.0
         
2.  Scott Geiser  02 May 2007
		Correct defect 1-2AGN12
		Migrating 7.4.1.1 defect 1-2AFIIN to 8.0

3. Eapen Mani 30 October 2007
	 Increased the length of name field for SSN Changes.
	
4. LVH 08-Mar-2008
   Defect 1-1MI6S0
   Created new USER_ID_LOV and USER_ID_RG that displays user id and name to be used instead of link to
   GUAIDEN for the LOV on the User ID. The user name will now also display on the form.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;

	*/
	//ID:1176
		public void auditTrail80()
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
	//ID:1177
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
	//ID:1178
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1.  Pavadeppa SM  10 Apr 2009
    Defect 1-4TQT8D
    For item WORKUSER in block FORM_HEADER the maximum length property is changed to 30.
		
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
	NULL;
END;

	*/
	//ID:1179
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAMESG
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Aug 14 13:35:31 2009
-- MSGSIGN : #14b1df137b23b2a5
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1180
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2_0_1
	
	PROCEDURE AUDIT_TRAIL_8_2_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.2.0.1
1.  Eapen Mani  14 August 2009
		Defect#: 1-6AM0XV
		Problem: While updating the record , following  error will occur in post update trigger, 
	         	'FRM-40735: POST-UPDATE trigger raised unhandled exception  ORA-01427'.
		Solution:Added condition in SQL select sub query statement to check the user logged in is same as the GURTKLR_USER_ID 
		         while doing the update operation on amacont table in procedure P_Update_Amrcont to avoid the multiple row returns error.
		         GURTKLR_USER_ID  = '|| ''''||USER||'''' ||
         

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1181
		public void auditTrail8201()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1.  Defect#: 1-B84O4I
    LVH 09/20/2010
    Modified p_update_amrcont so that the update can be performed by either the
    recipient or sender.         

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1182
		public void auditTrail84()
		{
		}

	
	

}
