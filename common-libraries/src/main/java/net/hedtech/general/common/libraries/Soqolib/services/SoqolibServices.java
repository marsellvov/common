package net.hedtech.general.common.libraries.Soqolib.services;

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
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;



public class SoqolibServices extends AbstractSupportCodeObject{
	
	
	public SoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SoqolibTaskPart  getTask() {
		return (SoqolibTaskPart )super.getContainer();
	}

	
	public net.hedtech.general.common.libraries.Soqolib.model.SoqolibModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
BEGIN
  NULL;
<multilinecomment> AUDIT TRAIL: 8.0 
1.  3/30/07  MAH Migrate 7.3.3 changes to 8.0
2. 	3/9/07  MAH 
  add columns to the stvcast and stvastd lov and rg for minimum hours 
3.  3/30/07  MAH
  Add new lov and rg for validation table STVMECL
4. 09/20/2007  JRE
   Added new LOV and RG for table SHRGRDE (SHRGRDE_INCMP_LOV and SHRGRDE_INCMP_RG).
5. MAH  9/2007 and 10/2007 Concurrent Curricula Enhancments for manual roll and graduation application: 
  a.  Add the rolled to outcome on the curriculum summary that will be 
    viewable for learner, and on the new grad app form shagapp.
  b. Add new icons for manually rolling the learner curriculum to the outcome. 
  c. Add new icon to create the graduation application on the learner curriculum.
  d. Revise the summary lcur view to show the lmod and the outcome keyseqno for the grad app
   form
  3. Revise the selection of conc attached to majors for the lov that displays on the 
  summary lfos block, to include non current lfos if the lcur is not current.  Add same condition
  to the sovlfos_attach_majr_rg to select non current lfos if the lcur is not current
6. Display warning if insert into sorlcur, learner module will add current/active curricuolum in
future. this could impact fee assessment. 
7. Defect 1-2D5Z0S (delivered with 7.4.0.1 and 8.0)  MAH 3/14/08 
This patch will include the objects: soqolib.fmb, sokb_fieldstudy_r1.sql, saaadms.fmb,saaquik.fmb, 
sraquik.fmb,srarecr.fmb, sgastdn.fmb, sfaregs.fmb,shadegr.fmb.

Solutions to issues 2 and 3:  The curriculum rule for the attached major is being blanked out or set to 0. 
Changes to sokb_fieldstudy_r1.sql.    Retrieve the department of the major so that the correct 
match to  sorcmjr is found, and do not perform the lookup if the attached major rule  is already filled in.  
Changes to SOQOLIB.fmb: Form level trigger ALIDATE_BASE_LFOS_CURRICULUM.  
Do not fill in the attached major rule if it is already filled in, 
and also fill in the database column when it is successfully retrieved from sokcurr.

Solutions to issue 1:  the wrong major is filling in when a concentration code is entered 
and it is attached to multiple majors. 
Changes to SOQOLIB.fmb.  Form level trigger LFOS_MAJR_POST_TEXT.  
Add line to the conc_c cursor to select the maximum term for the rules attached to the major.  
It was selecting the maximum term for all concentrations on the curriculum rule.
8.  Display warning for outcome curriculum key delete, if the outcome originated from a roll that the 
learner curriculum will reroll.  MAH  3/14/08
AUDIT TRAIL END 
</multilinecomment>
END;
	*/
	//ID:7983
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
   AUDIT TRAIL: 2.1.15
    1. Made correction to Record Group       VB  10/25/96
       STVTERM_CTLG_RG.  Comma was missing
       from the query.
   AUDIT TRAIL: 2.1.20
    1. Added new rg and lov stvmajr_curr_conc_rg and
       stvmajr_curr_conc_lov. This show conc attach to
       both base and majors.                 NM  10/31/96
    2. Added new STVACTN_RG and STVACTN_LOV.  AG 12/04/96
    3. Added new RG's and LOV's for student adjustements:
       ADJ_TERM_RG, ADJ_PROG_RG, ADJ_GROUP_RG, ADJ_AREA_RG
       ADJ_TERM_LOV, ADJ_PROG_LOV, ADJ_GROUP_LOV, ADJ_AREA_LOV.
                                             NM 01/09/97
    4. Changed title of stvccsl lov to       JWF 02/13/97
       "Classification Validation (STVCCSL)".
    5. Changed title of stvrslt lov to       JWF 02/13/97
       "Appointment Result Validation (STVRSLT)".
    6. Modified Record Groups for Curriculum displays.
                                             TJH 04/15/97
    7. Added Record groups and LOV's for Student Adjustment Term and
       Area, Group, or Program displays.
                                             TJH 04/15/97
   AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:7984
	/* <p>
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0

  1. DEFECT#:6928                                     BY: JWF 08/05/97
     FIX: Added the validation form name to all stv.... lov titles.
  2. DEFECT#:7184                                     BY: JWF 08/08/97
     FIX: Fixed typo in stvvoed lov title.

AUDIT TRAIL: 3.0.0.1

  1. Defect 7724                                           AT 09/05/97
     Fix: Form name (STVMAJR) added in STVMAJR_MAJR_LOV title.

  2. Defect 7653                                           AT 09/15/97
     Fix: In STVTMST_LOV, default visual attribute replaced 
          by S$_NVA_LOV.
  3. Corrected Title for STVTERM_CATALOG LOV for defect
     7172.            					   MS 10/14/97	
  
  4. In STVSUDD_LOV, default visual attribute replaced     AT 10/17/97
     by S$_NVA_LOV.

AUDIT TRAIL: 3.1
1. Defect 7367
     Fix: Added the validation form name(STVQPTP) to       TK 11/24/97
          STVQPTP_LOV title.
          Modified Named Visual Attribute for LOV.         TJH 01/20/98
2. Modified STVRESD_RG to select individual items from the
   table. Re-Created STVRESD_LOV to reflect the revised
   Record Group select list.
                                                           TJH 03/07/98
3. Added Curriculum Reference Items/Triggers for SRARECR.
                                                           TJH 04/13/98
4. Changed Records Groups and LOV by removed Activity_date
   from SQL statment also Order by statment changed from relative 
   operated to actual column name.                         MS  04/20/98
AUDIT TRAIL: 3.2
1. Defect # 9803, Modified the STVMAJR_MAJR_RG, STVMAJR_CONC_RG,
   and STVMAJR_MINR_RG Record Groups to correct an invalid
   date format on STVMAJR_ACTIVITY_DATE.
                                                           TJH 08/08/98
AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:7985
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
1. NDM  08/20/98
   Enhancements for Banner2000 4.0 upgrade. 
2.  CLF   08/24/98
   Expand CAMP, PTRM, and SCHD fields to 3 characters:
	S$_CURR_PROC_BLOCK.CCNG_CAMP_CODE
	S$_CURR_PROC_BLOCK.CURR_CAMP_CODE
	S$_SRBRECR_CURR_BLOCK.SRBRECR_CAMP_CODE
3. Apply Banner 4.0 Methodology to PAGE_50
AUDIT TRAIL: 4.1.1                                      INIT     DATE
1. Enhanced Co-ops Tracking                              MMW   04-20-1999
   Increased the STVCOPC_CODE from 2 to 6 characters wide in the
   STVCOPC_RG.  Increased the STVCOPC_CODE column from 24 to 55
   characters wide in the STVCOPC_LOV.
2. Add new curr check processing triggers which were part of the
   Admissions reassessment project.  All curriculum triggers were 
   moved from the application forms to group object.     MAH  10-19-99
3. Revised comm plan window to new window.  Part of the Admissions
   Reassessment project delivered with 3.3.               MAH 10-19-99
4. Add the lovs developed for the selective admissions 3.3   MAH 10-19-99
5. Add the administrator window group object, delivered with the
   selective admissions 3.3 project.                      MAH  10-19-99
AUDIT TRAIL: 4.3
1. Added stvwdrl lov for Title IV project                 ALD 01-20-00
2. Defect 14433 with the Curriculum Check Major Help Trigger:
  Problem:  when you first query an existing appliction/recruit or
  student record and press f1 (help) on the major, you get the
  lov for all major codes.  You should get the lov for attached lovs.
  solution: modify the curr-help triggers (major, conc, dept, minor)
  so they always execute the checkbase procedure.  This verifies if
  the curriculum has attached majors,conc, dept or minors.  MAH 1/27/00
3. Defect 35-079 
  Problem:  Have two curriculums that are identical except the campus is different,
  if you enter one of these curriculum then change the campus code, the program
  was changing to ********.
  Solution:  Modify select in check_program and check_program2. Revise select so it checks
  the incoming rule is null, and all incoming curr rule fields are null except program
  or if incoming rule is null and incoming rule fields are not null or equal to 
  curr rule values.                                        MAH 2/1/00
4. Added two new LOV's/RG's STVACT_SUB_LOV/RG and STVACTN_WAV_LOV/RG. WG 02/29/00
5. Defect 36777
  Problem with commplan - able to add multiple comm plans with same cpln code 
  Solution:  correct group by in the insert comm plan trigger by 
  splitting the select for student, admssn and recruit into separate
  queries.     MAH 3/29/00

6.  Add stvprel_web_lov and stvprel_web_rg for Web for 
  Prospects forms.  Add lov stvwack_lov for the prospect 
  acknowledgment letter. Add the lov stvlend_lov for the how I
  learned about on the recruit form.  MAH  4/27/00

AUDIT TRAIL: 4.3.3
1. Defect 41070 Curriculum Checking:  On sgastdn:  If the curriculum is
 not valid and curriculum rule is set to null.  The options list for the
 depts will include the item for attached majors/departments if the 
 major is null. 
 Solution:  change the two cursors in check_dept_attached and check_dept2_attached
  to include 'and temp_curr_rule is null'.       MAH  7/10/00
2. Added On-Error trigger.
3. Added VBS_ACCESS_ALERT, VBS_TRANSFER_ALERT.
4. Added VBS_INDICATORS block with appropriate items.
                                                       THAVENS 08/03/2000
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:7986
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. Add STVWAPP_LOV, SORELTM_LOV for Admission Enhancement     HT 09/15/00

AUDIT TRAIL: 5.3
WG  08/01/2001
1. Added STVPREV_LOV/RG and STVCAST_LOV/RG for Progress Evaluation.

AUDIT TRAIL: 5.4                                              BAG 09/18/2001
1. Added STVAFCT_RG and STVAFCT_LOV for Admissions Rating Factor Codes.
   RPE #25670.
2. Added STVAPLS_RG and STVAPLS_LOV for QuickStart project.  WG 10/29/01
3. Added STVWLTT_RG and STVWLTT_LOV for QuickStart Project.  WG 11/01/01
4. Added STVSTAT_RG/LOV and STVEAPL_RG/LOV for Quickstart.   WG 11/29/01
5. Added STVSBGI_RG/LOV Quickstart.   WG 1/10/02
6. Added STVWSSO_RG and STVWSSO_LOV for Web Transcript Request Project GMW 01/16/2002
7. Added STVWYPO_RG and STVWPYO_LOV for Web Transcript Request Project GMW 01/16/2002

AUDIT TRAIL: 5.5
1. Defect 67903                                              WG 05/21/02
   Problem: Default Majors aren't defaulting in in srarecr.fmb and sraquik.fmb
   Fix: in the CHECK_PROGRAM trigger 
        Replace :
     if name_in(:curr_rule_1_field) is not null and
        name_in(:curr_rule_1_field) <> 0 and 
        name_in(:curr_majr_1_field) is null then 
          execute_trigger('curr_default_major');
     end if;
         with :
     if name_in(:curr_rule_1_field) is not null and
        name_in(:curr_rule_1_field) <> 0 and 
        (name_in(:curr_majr_1_field) is null or 
         name_in(:curr_majr_1_field) = ¿0000¿) then
          execute_trigger('curr_default_major');
     end if;
     
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:7987
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit S$_TEST_COMM_PLAN
	
	PROCEDURE S$_TEST_COMM_PLAN 
IS
  
  KEY_FUNCTION    VARCHAR2(1);
 
--
BEGIN
  
  :new_cpln_desc := '';
  :old_cpln_desc := '';
  :new_cpln_code := '';
  :old_cpln_code := '';
  :call_commplan := 'N';
  if :key_function = 'Q' then 
    GOTO DISPLAY_WINDOW;
  end if;
  :comm_RESULT := 'N';
  execute_trigger('test_comm_process');
 
--
--  If no action needs to be taken, return to calling program.
--
  IF :COMM_RESULT = 'N' THEN
     GOTO EXIT_PROCEDURE;
  END IF;
--  display comm plan codes and other fields in pop-up window

 
  IF :comm_ACTION = '2' THEN
    :S$_COMM_PLAN_BLOCK.old_CPLN_DESC :=  
     'Delete Plan:' || 
     :S$_COMM_PLAN_BLOCK.old_CPLN_code  || ' Term:' || 
     :cpln_term_code || ' Seq:' || 
     to_char(:cpln_seqno);
     GOTO DISPLAY_WINDOW;
  ELSIF :comm_ACTION = '3' THEN
     GOTO MESSAGE_3;
  END IF;
  IF :new_cpln_code IS NULL THEN
     COPY( G$_NLS.Get('SOQOLIB-0498', 'FORM','No plan found for curriculum') ,':S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC');
  END IF;
  GOTO DISPLAY_WINDOW;
<<MESSAGE_3>>
  IF :cpln_TYPE_IND = 'S' THEN
     GOTO MESSAGE_S;
  END IF;
  IF :comm_RECRUIT_EXISTS = 'Y' THEN
     COPY( G$_NLS.Get('SOQOLIB-0499', 'FORM','Recruiting communication plan(s) exist') ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC');
  END IF;
  IF :new_cpln_code IS NULL THEN
     COPY( G$_NLS.Get('SOQOLIB-0500', 'FORM','No plan found for curriculum') ,'S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC');
  END IF;
  GOTO DISPLAY_WINDOW;
<<MESSAGE_S>>
  IF :comm_RECRUIT_EXISTS = 'N' AND
     :comm_ADMIT_EXISTS   = 'N' THEN
     NULL;
  ELSIF :comm_RECRUIT_EXISTS = 'Y' AND
        :comm_ADMIT_EXISTS   = 'N' THEN
     COPY( G$_NLS.Get('SOQOLIB-0501', 'FORM','Recruiting communication plan(s) exist') ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC');
  ELSIF :comm_RECRUIT_EXISTS = 'N' AND
        :comm_ADMIT_EXISTS   = 'Y' THEN
     COPY( G$_NLS.Get('SOQOLIB-0502', 'FORM','Admissions communication plan(s) exist') ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC');
  ELSE
     COPY( G$_NLS.Get('SOQOLIB-0503', 'FORM','Recruit, Admissions communication plans exist ') ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC');
  END IF;
  IF :new_cpln_code IS NULL THEN
     COPY( G$_NLS.Get('SOQOLIB-0504', 'FORM','No plan found for curriculum.') ,'S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC');
  END IF;
<<DISPLAY_WINDOW>>
---  change this line to goto the new block 
  if :comm_action is null then 
    :comm_action := '1';
  end if;
 :call_commplan := 'Y';
  if :sobcpln_return_object is not null and 
    :sobcpln_return_item is not null then
    g$_navigation_frame.disable_option(:sobcpln_return_object,
       :sobcpln_return_item);
   end if;
  GO_BLOCK('SOBCPLN');
  RAISE FORM_TRIGGER_FAILURE;
<<EXIT_PROCEDURE>>
  RETURN;
END;
	*/
	//ID:7988
	/* <p>
/* </p>
		*/
		public void sTestCommPlan()
		{
			NString keyFunction= NString.getNull();
			getFormModel().getSCommPlanBlock().setNewCplnDesc(toStr(""));
			getFormModel().getSCommPlanBlock().setOldCplnDesc(toStr(""));
			getFormModel().getSCommPlanBlock().setNewCplnCode(toStr(""));
			getFormModel().getSCommPlanBlock().setOldCplnCode(toStr(""));
			getFormModel().getSCommPlanBlock().setCallCommplan(toStr("N"));
			if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("Q") )
			{
				 displayWindow();
			}
			getFormModel().getSCommPlanBlock().setCommResult(toStr("N"));
			executeAction("test_comm_process");
			// 
			//   If no action needs to be taken, return to calling program.
			// 
			if ( getFormModel().getSCommPlanBlock().getCommResult().equals("N") )
			{
				 return;
			}
			//   display comm plan codes and other fields in pop-up window
			if ( getFormModel().getSCommPlanBlock().getCommAction().equals("2") )
			{
				getFormModel().getSCommPlanBlock().setOldCplnDesc(toStr("Delete Plan:").append(getFormModel().getSCommPlanBlock().getOldCplnCode()).append(" Term:").append(getFormModel().getSCommPlanBlock().getCplnTermCode()).append(" Seq:").append(toChar(getFormModel().getSCommPlanBlock().getCplnSeqno())));
				 displayWindow();
			}
			else if ( getFormModel().getSCommPlanBlock().getCommAction().equals("3") ) {
				 message3();
			}
			if ( getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
			{
				copy(GNls.Fget(toStr("SOQOLIB-0498"), toStr("FORM"), toStr("No plan found for curriculum")),":S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
			}
			 displayWindow();
		}
		
		void displayWindow(){
			// DISPLAY_WINDOW:;
			// -  change this line to goto the new block 
			if ( getFormModel().getSCommPlanBlock().getCommAction().isNull() )
			{
				getFormModel().getSCommPlanBlock().setCommAction(toStr("1"));
			}
			getFormModel().getSCommPlanBlock().setCallCommplan(toStr("Y"));
			if ( !getFormModel().getSCommPlanBlock().getSobcplnReturnObject().isNull() && !getFormModel().getSCommPlanBlock().getSobcplnReturnItem().isNull() )
			{
				getTask().getGoqrpls().getGNavigationFrame().disableOption(getFormModel().getSCommPlanBlock().getSobcplnReturnObject(), getFormModel().getSCommPlanBlock().getSobcplnReturnItem());
			}
			goBlock(toStr("SOBCPLN"));
			throw new ApplicationException();
		}
		
		void message3(){
			//MESSAGE_3:;
			if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("S") )
			{
				messageS();
			}
			if ( getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("Y") )
			{
				copy(GNls.Fget(toStr("SOQOLIB-0499"), toStr("FORM"), toStr("Recruiting communication plan(s) exist")),"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
			}
			if ( getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
			{
				copy(GNls.Fget(toStr("SOQOLIB-0500"), toStr("FORM"), toStr("No plan found for curriculum")),"S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
			}
			 displayWindow();
		}
		
		void messageS(){
			//MESSAGE_S:;
			if ( getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("N") && getFormModel().getSCommPlanBlock().getCommAdmitExists().equals("N") )
			{
			}
			else if ( getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("Y") && getFormModel().getSCommPlanBlock().getCommAdmitExists().equals("N") ) {
				copy(GNls.Fget(toStr("SOQOLIB-0501"), toStr("FORM"), toStr("Recruiting communication plan(s) exist")),"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
			}
			else if ( getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("N") && getFormModel().getSCommPlanBlock().getCommAdmitExists().equals("Y") ) {
				copy(GNls.Fget(toStr("SOQOLIB-0502"), toStr("FORM"), toStr("Admissions communication plan(s) exist")),"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
			}
			else {
				copy(GNls.Fget(toStr("SOQOLIB-0503"), toStr("FORM"), toStr("Recruit, Admissions communication plans exist ")),"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
			}
			if ( getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
			{
				copy(GNls.Fget(toStr("SOQOLIB-0504"), toStr("FORM"), toStr("No plan found for curriculum.")),"S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_MANUAL
	
	PROCEDURE AUDIT_TRAIL_5_0_MANUAL IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  Regen form to keep Baneer 5.0 version in sync with 4.3.3 changes
                                                  CLF  08/15/00
                                                  

AUDIT TRAIL: 5.1.1
1. wtsui 2/26/01
Editted key-commit trigger in S$_COMM_PLAN block for null value in implicit insert.

AUDIT TRAIL: 5.2
1. Defect 46413                                    MW  03/14/2001
   Problem: Item (3) of this defect says,
      3) In Comm Plan window, when you have an existing 'S'
         type row, if you tab through the fields, specifically
         past the Term field, you must COMMIT to get out of
         this window, even though you haven't made any changes.
         Also, no Autohelp on Term field in this window.
   Technical Fix: Modified the WHEN-VALIDATE-ITEM and the
      KEY-NEXT-ITEM trigger of the SOBCPLN_TYPE_IND item in the
      SOBCPLN block to set the :SOBCPLN_TERM_CODE and the
      :sobcpln_seqno to NULL only when a change has been made
      to the SOBCPLN block.  Set the Display Hint Automatically
      item property from 'N'o to 'Y'es for the Term field,
      SOBCPLN_TERM_CODE, in this window.
      
2. Added STVWAIV_LOV, STVWAIV_RG.								ALD  04/27/2001
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:7989
	/* <p>
/* </p>
		*/
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit EXECUTE_A_QUERY
	
	PROCEDURE EXECUTE_A_QUERY IS
BEGIN
  IF :SYSTEM.BLOCK_STATUS IN ('NEW', 'QUERY')
  THEN 
    :system.message_level := '5'; 
    EXECUTE_QUERY ;
    :system.message_level := '0'; 
  END IF;
END;
	*/
	//ID:7990
	/* <p>
/* </p>
		*/
		public void executeAQuery()
		{
			if ( (getBlockStatus().equals("NEW") || getBlockStatus().equals("QUERY")) )
			{
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeQuery();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
BEGIN
  <multilinecomment>
AUDIT TRAIL: 6.0
1. Altered STVSCHD_RG; replaced stvschd_instruct_method     PJL 05/30/02
   with stvschd_insm_code.  Added STVFTYP_RG and _LOV.
   
2. MW 10/18/2002
   Expanded Credit Hours Project:
     Modified the display width of the STVRSTS_AUTO_GRADE column
     from 60 to 80 in STVRSTS_LOV and changed the Length (from 3
     to 6) of STVRSTS_AUTO_GRADE's Column Specification in
     STVRSTS_RG for proper display in the pop-up window.
   
     Modified the following Record Group Query for SMBPOGN_REQ_RG.
       select smbpogn_program, to_char(round(smbpogn_act_credits_overall,2),'9999.99')
       actual_credits, to_char(round(smbpogn_act_courses_overall,2),'9999.99')
       actual_courses, to_char(smbpogn_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) smbpogn_activity_date,
       smbpogn_request_no
       from smbpogn 
       where smbpogn_pidm = :pidm 
       order by smbpogn_activity_date desc, smbpogn_program,smbpogn_request_no

     Changed the above to_char(round(smbpogn_act_credits_overall,2),'9999.99') to
                       to_char(round(smbpogn_act_credits_overall,3),'99999999.999').
     Modified the display width of the ACTUAL_CREDITS column from 72 to 100
     in SMBPOGN_REQ_LOV.
                       
3. WG 10/21/02
   Added STVVTAB_RG and _LOV for OLR project.
   
4. Defect 81298/68513                            WG  01/07/02
   Problem: forms srarecr,sraquik,saaadms,saaackl are being
        exited when navigating to SOAINFR block.
   Fix: deleted WHEN_NEW_BLOCK_INSTANCE_TRG from SOAINF block
      and moved logic to form level WHEN_NEW_BLOCK_INSTANCE_TRG.
      Added IF clause in POST-QUERY trigger on SORAINF block:
       IF c_select_id%FOUND THEN
         :admin_name := name.spriden_last_name||', '||name.spriden_first_name;
         :admin_id := name.spriden_id;
       END IF;
      Modified PRE-TEXT-ITEM trigger on ADMIN_ID.
      Added EXECUTE_A_QUERY to program units for use with SORAINF.
AUDIT TRAIL END
</multilinecomment>
NULL ;
END;
	*/
	//ID:7991
	/* <p>
/* </p>
		*/
		public void auditTrail60()
		{
			// AUDIT TRAIL: 6.0
			// 1. Altered STVSCHD_RG; replaced stvschd_instruct_method     PJL 05/30/02
			// with stvschd_insm_code.  Added STVFTYP_RG and _LOV.
			// 2. MW 10/18/2002
			// Expanded Credit Hours Project:
			// Modified the display width of the STVRSTS_AUTO_GRADE column
			// from 60 to 80 in STVRSTS_LOV and changed the Length (from 3
			// to 6) of STVRSTS_AUTO_GRADE's Column Specification in
			// STVRSTS_RG for proper display in the pop-up window.
			// Modified the following Record Group Query for SMBPOGN_REQ_RG.
			// select smbpogn_program, to_char(round(smbpogn_act_credits_overall,2),'9999.99')
			// actual_credits, to_char(round(smbpogn_act_courses_overall,2),'9999.99')
			// actual_courses, to_char(smbpogn_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) smbpogn_activity_date,
			// smbpogn_request_no
			// from smbpogn
			// where smbpogn_pidm = :pidm
			// order by smbpogn_activity_date desc, smbpogn_program,smbpogn_request_no
			// Changed the above to_char(round(smbpogn_act_credits_overall,2),'9999.99') to
			// to_char(round(smbpogn_act_credits_overall,3),'99999999.999').
			// Modified the display width of the ACTUAL_CREDITS column from 72 to 100
			// in SMBPOGN_REQ_LOV.
			// 3. WG 10/21/02
			// Added STVVTAB_RG and _LOV for OLR project.
			// 4. Defect 81298/68513                            WG  01/07/02
			// Problem: forms srarecr,sraquik,saaadms,saaackl are being
			// exited when navigating to SOAINFR block.
			// Fix: deleted WHEN_NEW_BLOCK_INSTANCE_TRG from SOAINF block
			// and moved logic to form level WHEN_NEW_BLOCK_INSTANCE_TRG.
			// Added IF clause in POST-QUERY trigger on SORAINF block:
			// IF c_select_id%FOUND THEN
			// :admin_name := name.spriden_last_name||', '||name.spriden_first_name;
			// :admin_id := name.spriden_id;
			// END IF;
			// Modified PRE-TEXT-ITEM trigger on ADMIN_ID.
			// Added EXECUTE_A_QUERY to program units for use with SORAINF.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_1
	
	PROCEDURE AUDIT_TRAIL_6_1 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1. Defect 88184                       PL 09/23/2003
   Problem: stvftyp_lov and stvftyp_rg verified.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL ;
END;
	*/
	//ID:7992
	/* <p>
/* </p>
		*/
		public void auditTrail61()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Corrected format of call to form for Oracle 9i    PL 01/22/2004
   in S$_COMM_PLAN block triggers key-cquery and key-listval.
2. Changed S$_NVA_LOV visual attribute to match settings PL 01/26/2004
   in GOQOLIB G$_NVA_LOV.
3. Converted ADMIN_ASSIGN_CANVAS, ADMIN_ASSIGN_WINDOW to conform with     PL 01/26/2004
   Banner 7.0 UI. 
4. Converted COMM_PLAN_CANVAS, COMM_PLAN_WINDOW to conform with        PL 01/26/2004
   Banner 7.0 UI.
5. Removed the old vbs on error,  vbs alerts.  The VBS is replaced with General New VBS using
  FGAC.        MAH  3/2004
    
6.  Implement concurrent curricula group objects   MHockett Feb-May 2004
    a.  Create new blocks 
         s$_curricula :  similar to form_header, to store common variables for sorlcur and sorlfos blocks 
         sorlcur : curricula block used on the curricula_canvas, and for data entry 
         sorlfos : fields of study block, used with sorlcur block 
         sorlcur_lite : curricula block used on the small canvas used for data entry on the quik forms 
         sorlfos_lite : fields of study block used on the small canvas used for data entry on  the quik forms
         s$_curricula_summary  : used to store common variables for sovlcur and sovlfos blocks 
         s$_curricula_traditional  : used to store common variables for sorlcur and sorlfos and curricula canvas blocks 
         s$_curricula_lite  : used to store common variables for sorlcur_lte and sorlfos_lite and curricula lite canvas blocks 
         sovlfos : query only blocks shown on summary view 
         sovlcur : query only curricula block shown on summary view 
    b.  Create new canvas 
         curricula_canvas : stacked canvas shown on curricula tab 
         curricula_summary_tab :  stacked canvas to show query only view 
         curricula_lite_canvas : stacked canvas for quick forms
    c.  RGs and LOVs 
 	       stvcact_rg and stvcact_lov 
 	       stvcact_rg and stvcact_lov 
 	       stvlmod_rg and stvlmod_rg  
 	       sorlfos_majr_rg and sorlfos_majr_lov
 	       stvmajr_lfos_conc_rg and stvmajr_lfos_conc_lov 
 	       gtvlfst_rg and gtvlfst_lov
 	       sobcact_rg and sobcact_lov
 	       sotlfos_rg and sotlfos_lov 
    d.  Group objects 
         s$_curricula  :  for data entry tab, includes blocks s$_curricula, sorlfos, sorlcur 
         s$_curricula_summary :  for view version, includes blocks sovlcur, sovlfos, 
            s$_curriula_summary and the curricula_sumamry_tab.  This is usually shown on
            first tab of sgastdn, shadegr, saaadms, srarecr 
         s$_curricula_lite : for data entry on quick forms, has smaller space and not all fields are 
            available for data etnry
   e. form level triggers 
         on-clear-details (used for sorlcur / sorlfos relationship)
         curriculum_commit
         new_sorlcur_inst
         query_sorlcur_lite
         default_curricula 
         validate_curriculum_at_commit (validates at key commit)
         populate_sotlcur (copies curric to temp tables for commit evaluation)
         curriculum check triggers  : these are coded so that the curriculum and lite blocks can share the code
   f. Procedures 
        these are all used for the sorlcur and sorlfos relationship.  These are part of the s$_curricula
        and s$_curricula_summary and s$_curricula_lite group objects. 
           check_package_failure
           clear_all_master_details
           execute_a_query
           query_master_details.                    	     

7.  Add extension ind to stvrsts_rg and stvrsts_lov 
8.  Add cmsc (common matching source) code to stvinfc_rg and stvinfc_lov 
9.  Add order to clause to comm plan selects. 
10. Lov stvcald has typo in title :  defect 59376  
11. Change sort order in smbpogn_req_rg to program, request number desc PL 11/04/04         
         
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL ;
END;
	*/
	//ID:7993
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PACKAGE_FAILURE
	
	Procedure Check_Package_Failure IS
BEGIN
  IF NOT ( Form_Success ) THEN
    RAISE Form_Trigger_Failure;
  END IF;
END;
	*/
	//ID:7994
	/* <p>
/* </p>
		*/
		public void checkPackageFailure()
		{
//			if ( (SupportClasses.SQLFORMS.FormSuccess()).not() )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				throw new ApplicationException();
//			}
		}

	
	/* Original PL/SQL code for Prog Unit QUERY_MASTER_DETAILS
	
	PROCEDURE Query_Master_Details(rel_id Relation,detail VARCHAR2) IS
  oldmsg VARCHAR2(2);  -- Old Message Level Setting
  reldef VARCHAR2(5);  -- Relation Deferred Setting
BEGIN
  --
  -- Initialize Local Variable(s)
  --
  reldef := Get_Relation_Property(rel_id, DEFERRED_COORDINATION);
  oldmsg := :System.Message_Level;
  --
  -- If NOT Deferred, Goto detail and execute the query.
  --
  IF reldef = 'FALSE' THEN
    Go_Block(detail);
    Check_Package_Failure;
    :System.Message_Level := '10';
    Execute_Query;
    :System.Message_Level := oldmsg;
  ELSE
    --
    -- Relation is deferred, mark the detail block as un-coordinated
    --
    Set_Block_Property(detail, COORDINATION_STATUS, NON_COORDINATED);
  END IF;

EXCEPTION
    WHEN Form_Trigger_Failure THEN
      :System.Message_Level := oldmsg;
      RAISE;
END Query_Master_Details;

	*/
	//ID:7995
	/* <p>
/* </p>
		* @param relId
		* @param detail
		*/
		public void queryMasterDetails(org.jdesktop.databuffer.DataRelation relId, NString detail)
		{
			NString oldmsg= NString.getNull();
			//  Old Message Level Setting
			NString reldef= NString.getNull();
			try
			{
				// 
				//  Initialize Local Variable(s)
				// 
				// F2J_NOT_SUPPORTED : The property "RELATION's DEFERRED_COORDINATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
				//				reldef = SupportClasses.FORMS40.GetRelationProperty(relId, SupportClasses.Property.DEFERRED_COORDINATION);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DEFERRED_COORDINATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
				
				
				oldmsg = toStr(SupportClasses.AppContext.MessageLevel);
				// 
				//  If NOT Deferred, Goto detail and execute the query.
				// 
				if ( reldef.equals("FALSE") )
				{
					goBlock(detail);
					checkPackageFailure();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				}
				else {
					// 
					//  Relation is deferred, mark the detail block as un-coordinated
					// 
					// F2J_NOT_SUPPORTED : The property "BLOCK's COORDINATION_STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
					//					SupportClasses.FORMS40.SetBlockProperty(detail, SupportClasses.Property.COORDINATION_STATUS, SupportClasses.Constants.NON_COORDINATED);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's COORDINATION_STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
					
					
				}
			}
			catch(ApplicationException e)
			{
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				MessageServices.resetMessageLevel();
				throw  e;
			}
		}

	
	/* Original PL/SQL code for Prog Unit CLEAR_ALL_MASTER_DETAILS
	
	PROCEDURE Clear_All_Master_Details IS
  mastblk  VARCHAR2(30);  -- Initial Master Block Causing Coord
  coordop  VARCHAR2(30);  -- Operation Causing the Coord
  trigblk  VARCHAR2(30);  -- Cur Block On-Clear-Details Fires On
  startitm VARCHAR2(61);  -- Item in which cursor started
  frmstat  VARCHAR2(15);  -- Form Status
  curblk   VARCHAR2(30);  -- Current Block
  currel   VARCHAR2(30);  -- Current Relation
  curdtl   VARCHAR2(30);  -- Current Detail Block

  FUNCTION First_Changed_Block_Below(Master VARCHAR2)
  RETURN VARCHAR2 IS
    curblk VARCHAR2(30);  -- Current Block
    currel VARCHAR2(30);  -- Current Relation
    retblk VARCHAR2(30);  -- Return Block
  BEGIN
    --
    -- Initialize Local Vars
    --
    curblk := Master;
    currel := Get_Block_Property(curblk,  FIRST_MASTER_RELATION);
    --
    -- While there exists another relation for this block
    --
    WHILE currel IS NOT NULL LOOP
      --
      -- Get the name of the detail block
      --
      curblk := Get_Relation_Property(currel, DETAIL_NAME);
      --
      -- If this block has changes, return its name
      --
      IF ( Get_Block_Property(curblk, STATUS) = 'CHANGED' ) THEN
        RETURN curblk;
      ELSE
        --
        -- No changes, recursively look for changed blocks below
        --
        retblk := First_Changed_Block_Below(curblk);
        --
        -- If some block below is changed, return its name
        --
        IF retblk IS NOT NULL THEN
          RETURN retblk;
        ELSE
          --
          -- Consider the next relation
          --
          currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
        END IF;
      END IF;
    END LOOP;

    --
    -- No changed blocks were found
    --
    RETURN NULL;
  END First_Changed_Block_Below;

BEGIN
  --
  -- Init Local Vars
  --
  mastblk  := :System.Master_Block;
  coordop  := :System.Coordination_Operation;
  trigblk  := :System.Trigger_Block;
  startitm := :System.Cursor_Item;
  frmstat  := :System.Form_Status;

  --
  -- If the coordination operation is anything but CLEAR_RECORD or
  -- SYNCHRONIZE_BLOCKS, then continue checking.
  --
  IF coordop NOT IN ('CLEAR_RECORD', 'SYNCHRONIZE_BLOCKS') THEN
    --
    -- If we're processing the driving master block...
    --
    IF mastblk = trigblk THEN
      --
      -- If something in the form is changed, find the
      -- first changed block below the master
      --
      IF frmstat = 'CHANGED' THEN
        curblk := First_Changed_Block_Below(mastblk);
        --
        -- If we find a changed block below, go there
        -- and Ask to commit the changes.
        --
        IF curblk IS NOT NULL THEN
          Go_Block(curblk);
          Check_Package_Failure;
          Clear_Block(ASK_COMMIT);
          --
          -- If user cancels commit dialog, raise error
          --
          IF NOT ( :System.Form_Status = 'QUERY'
                   OR :System.Block_Status = 'NEW' ) THEN
            RAISE Form_Trigger_Failure;
          END IF;
        END IF;
      END IF;
    END IF;
  END IF;

  --
  -- Clear all the detail blocks for this master without
  -- any further asking to commit.
  --
  currel := Get_Block_Property(trigblk, FIRST_MASTER_RELATION);
  WHILE currel IS NOT NULL LOOP
    curdtl := Get_Relation_Property(currel, DETAIL_NAME);
    IF Get_Block_Property(curdtl, STATUS) <> 'NEW'  THEN
      Go_Block(curdtl);
      Check_Package_Failure;
      Clear_Block(NO_VALIDATE);
      IF :System.Block_Status <> 'NEW' THEN
        RAISE Form_Trigger_Failure;
      END IF;
    END IF;
    currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
  END LOOP;

  --
  -- Put cursor back where it started
  --
  IF :System.Cursor_Item <> startitm THEN
    Go_Item(startitm);
    Check_Package_Failure;
  END IF;

EXCEPTION
  WHEN Form_Trigger_Failure THEN
    IF :System.Cursor_Item <> startitm THEN
      Go_Item(startitm);
    END IF;
    RAISE;

END Clear_All_Master_Details;

	*/
	//ID:7996
	/* <p>
/* </p>
		*/
		public void clearAllMasterDetails()
		{
			NString mastblk= NString.getNull();
			//  Initial Master Block Causing Coord
			NString coordop= NString.getNull();
			//  Operation Causing the Coord
			NString trigblk= NString.getNull();
			//  Cur Block On-Clear-Details Fires On
			NString startitm= NString.getNull();
			//  Item in which cursor started
			NString frmstat= NString.getNull();
			//  Form Status
			NString curblk= NString.getNull();
			//  Current Block
			NString currel= NString.getNull();
			//  Current Relation
			NString curdtl= NString.getNull();
			try
			{
				// 
				//  Init Local Vars
				// 
				mastblk = toStr(SupportClasses.AppContext.MasterBlock);
				coordop = toStr(SupportClasses.AppContext.CoordinationOperation);
				trigblk = toStr(getTriggerBlock());
				startitm = toStr(getCursorItem());
				frmstat = toStr(getTaskStatus());
				// 
				//  If the coordination operation is anything but CLEAR_RECORD or
				//  SYNCHRONIZE_BLOCKS, then continue checking.
				// 
				if ( !in(coordop, "CLEAR_RECORD", "SYNCHRONIZE_BLOCKS").getValue() )
				{
					// 
					//  If we're processing the driving master block...
					// 
					if ( mastblk.equals(trigblk) )
					{
						// 
						//  If something in the form is changed, find the
						//  first changed block below the master
						// 
						if ( frmstat.equals("CHANGED") )
						{
							curblk = ClearAllMasterDetails_firstChangedBlockBelow_Local(mastblk);
							// 
							//  If we find a changed block below, go there
							//  and Ask to commit the changes.
							// 
							if ( !curblk.isNull() )
							{
								goBlock(curblk);
								checkPackageFailure();
								clearBlock(TaskServices.ASK_COMMIT);
								// 
								//  If user cancels commit dialog, raise error
								// 
								if ( !(getTaskStatus().equals("QUERY") || getBlockStatus().equals("NEW")) )
								{
									throw new ApplicationException();
								}
							}
						}
					}
				}
				// 
				//  Clear all the detail blocks for this master without
				//  any further asking to commit.
				// 
				// F2J_NOT_SUPPORTED : The property "BLOCK's FIRST_MASTER_RELATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
				//				currel = SupportClasses.FORMS40.GetBlockProperty(trigblk, SupportClasses.Property.FIRST_MASTER_RELATION);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's FIRST_MASTER_RELATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
				
				
				while ( !currel.isNull() ) {
					// F2J_NOT_SUPPORTED : The property "RELATION's DETAIL_NAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
					//					curdtl = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.DETAIL_NAME);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DETAIL_NAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
					
					
					if ( getBlockStatus(curdtl).notEquals("NEW") )
					{
						goBlock(curdtl);
						checkPackageFailure();
						clearBlock(TaskServices.NO_VALIDATE);
						if ( !getBlockStatus().equals("NEW") )
						{
							throw new ApplicationException();
						}
					}
					// F2J_NOT_SUPPORTED : The property "RELATION's NEXT_MASTER_RELATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
					//					currel = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.NEXT_MASTER_RELATION);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's NEXT_MASTER_RELATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
					
					
				}
				// 
				//  Put cursor back where it started
				// 
				if ( getCursorItem().notEquals(startitm) )
				{
					goItem(startitm);
					checkPackageFailure();
				}
			}
			catch(ApplicationException e)
			{
				if ( getCursorItem().notEquals(startitm) )
				{
					goItem(startitm);
				}
				throw  e;
			}
		}
/* <p>
		*  Current Detail Block
/* </p>
		* @param master
		*/
		public NString ClearAllMasterDetails_firstChangedBlockBelow_Local(NString master)
		{
			NString curblk= NString.getNull();
			//  Current Block
			NString currel= NString.getNull();
			//  Current Relation
			NString retblk= NString.getNull();
			// 
			//  Initialize Local Vars
			// 
			curblk = master;
			// F2J_NOT_SUPPORTED : The property "BLOCK's FIRST_MASTER_RELATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
			//			currel = SupportClasses.FORMS40.GetBlockProperty(curblk, SupportClasses.Property.FIRST_MASTER_RELATION);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's FIRST_MASTER_RELATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
			
			
			// 
			//  While there exists another relation for this block
			// 
			while ( !currel.isNull() ) {
				// 
				//  Get the name of the detail block
				// 
				// F2J_NOT_SUPPORTED : The property "RELATION's DETAIL_NAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
				//				curblk = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.DETAIL_NAME);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DETAIL_NAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
				
				
				// 
				//  If this block has changes, return its name
				// 
				if ((getBlockStatus(curblk).equals("CHANGED")))
				{
					return curblk;
				}
				else {
					// 
					//  No changes, recursively look for changed blocks below
					// 
					retblk = ClearAllMasterDetails_firstChangedBlockBelow_Local(curblk);
					// 
					//  If some block below is changed, return its name
					// 
					if ( !retblk.isNull() )
					{
						return retblk;
					}
					else {
						// 
						//  Consider the next relation
						// 
						// F2J_NOT_SUPPORTED : The property "RELATION's NEXT_MASTER_RELATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
						//						currel = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.NEXT_MASTER_RELATION);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's NEXT_MASTER_RELATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
						
						
					}
				}
			}
			// 
			//  No changed blocks were found
			// 
			return NString.getNull();
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1
	
	PROCEDURE AUDIT_TRAIL_7_1 IS
BEGIN
	NULL;
	<multilinecomment>
AUDIT TRAIL: 7.1
1.  Internal Defeect  MH 1/20/05
     Admissions Term Lov renamed from sorlcur_term_code_admt_lov to
     sorlcur_term_code_admit_lov.  Problem was code class not finding 
     since the name of the column and the lbt were not identical.
2.  Defect 100821 MH 1/28/05
     Problem:  Inconsistent roll indicator between the learner modules. 
     Solution:  Add new roll ind. radio button to have values N, Y and a Default. 
     Default that field to a value D.  The curriculum API will make the roll 
     ind a value of N for recruit, admissions and the outcome modules. If its N or 
     Y and for a learner, the value will not change. If its a D, get the value from
     soacurr or soactrl.
3.  Defect 100823  MH 1/28/05
     Problem:  Learner curriculum are not assigned the current correctly if entered out of 
     term sequence. Example:  admit student for 200520.  then quick admit for 200443.  The 
     200443 is always current even when the 200520 sgbstdn record is in focus. 
     Solution:  Update the sotvcur row with the sgbstdn term eff, not the end term. Change the 
     sort order on sorlcur and sovlcur blocks to include the term.  Change the selects from sorlcur
     lmod lerners to include new >= curricula module term and < curricula module term. 
     Delete sotvcur in the curriculum_commit trigger to clear out entry for pidm and next
     calculation of the effective term.
4.  Defect 101957  MH 2/19/05
    Problem:  Using the inactive and change curriculum button on a learner record that has been 
    rolled causes API error with invalid rolled sequence number.
    Solution: send the api a null for the roll seqno
5.  Defect 102295 MH 3/14/05
    Problem:  if other lfst than major, minor or concentration are used the list of values does not work.
    Solution:  the do key for the list of values had a typo
6.  Sort order on curriculum and field of study:  3/16/05 MAH 
    Sort current & active before non current so all current are sorted together
7.  Add g$_check_failure after all go_block statements in trigger new_sorlcur_inst and 
    query_sorlcur_lite. 
8.  Defect 103168  MH 4/27/05
    Problem:  Using the change curriculum ICON on sfaregs or sgastdn does not copy the
    admit term, code, catlg term and matric term over like it does in 6.x.
    Solution:  Update the trigger deactivate_create_new on sorlcur block to save the admit
    code, term, catlg term and matric term and then copy these to the newly created record. This is only
    done for the learner type curriculum except catlg term is copied on all.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:7997
	/* <p>
/* </p>
		*/
		public void auditTrail71()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
 
BEGIN
	NULL;
	<multilinecomment>
AUDIT TRAIL: 7.2
1. MAHockett 6/27/05
  Implement using sorlmfs to check for max field of study allowed in form level trigger
  validate curriculum on commit. 
2. Defect 104042 MAHockett 6/26/05
  Problem:  User receives error on new_sorlcur_inst if they are running one of the 
  curriculum forms in query only 
  Solution: Move all inserts,updates,deletes of the temp table sotvcur, sotlcur and sotlfos
  to soklcur package procedures so when form runs as query only the user has permission
  to execute those db commands.
  Add triggers query_only to sorlcur, sorlfos_lite, sorlcur_lite and sorlfos and execute in key-delrec, key-crerec, key-duprec
  and key-nxtrec.  This displays an error if the form is running with role ban_default_q. Execute query_only trigger
  in sorlcur on the change curriculum button.
3.  MAHockett 6/27/05
  Add rg and lovs for STVTRNS and STVTSPT.
4.  MAHockett 7/21/05
  Update the rg stvmajr_lfos_conc_rg to account for conc value and the cmjr
  rule in the subquery for effective term.
5.  MAHockett 9/6/05 
  Defect 103934
  Problem:  If user enters invalid code in the major code in the sorlfos or sorlfos_lite and commits,
  the invalid code message appears multiple times.
  SOlution:  In the key-commit,  put a g$_check_failure after the validate block command.
AUDIT TRAIL END 
</multilinecomment>

END;
	*/
	//ID:7998
	/* <p>
/* </p>
		*/
		public void auditTrail72()
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
	//ID:7999
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
 BEGIN
	NULL;
	<multilinecomment>
AUDIT TRAIL: 7.3 
1. Defect 105953  MAHockett 11/23/05  
  Problem:  Curriculum error message appears on sraquik and saaquik
  even though the curriculum checking is turned off for that module. 
  Solution:  Update the on-insert in the sorlcur_lite block to check
   the severity out:
      if :lcur_sobctrl_curr_rule_ind = 'Y' and 
      ( :curr_error is not null and :curr_error > 0 )
   	    and (:curric_warning = 0 or :curric_warning is null) 
    ==>	    and  ( :severity_out in ('W', 'F') ) then 
2. Defect 106058 
 Problem:  sorlfos catalog term is not defaulting to sorlcur catalog term 
 Solution: Update all places the sorlfos catalog term is assigned or referred to:
       nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)
3. RPE to not clear out status when dup record occurs on SORLCUR,
RPE 1-410EQ.  Also default in the catalog term at the start of the new record.
4. RPE to add visual cue to SOVLFOS block on if concentrations are attached to
the major, RPE 48723
5. Add new learner status codes to the sovlcur summary block (rate, styp, admissions
code and term) 
6. Make curriculum canvas have two separate tabs for lcur and lfos.
7. Remove the synchronize from the administrator pre text item trigger
8. Add new LOV and RG for new validation tables STVCKSR and STVCKST 
9. Defect 105894 MAH 1/17/06
  Problem:  If you select a program from the all programs list, which is from smrprle,
   and the program is defined on soacurr with one major,  the major is not defaulting into
   the field of study record. 
  Solution: Cannot recreate since the redesign of the curriculum tab.
10. Defect 105894  MAH 1/18/06 
  Problem:  If user uses the All Programs to select a program,  that has exactly one
  major defined on soacurr,  the field of study record is not created. 
  Solution: Add at the conclusion of the key-listval for the sorlcur_lite and sorlcur
  blocks sorlcur_program  next_item;  previous_item;  This will cause the post text item
  trigger to execute which has the logic to execute triggers lcur_check_program and 
  lcur_default_major which fill in the curriculum rule and the field of study. 
11.  Add new view_current global to control if current and active
curricula and field of study are displayed.  Select current and active in sorlcur and sorlfos
blocks if this is Y. 
12.  Add sotlcur_rg and sotlcur_lov for saadcrv and saadcbt to show the current,active learner  
13.  Call soklcur.f_event_status in change curriculum and inactivate lfos buttons.
14.  In curriculum_commplan_check call the comm plan check trigger for any curricula change.
It previously called only if the primary curriculum changes. 
15.  In sorlcur, key duprec,  duplicate the active field of study if the curriculum is not current.
16.  stvstst_rg and stvstst_lov add the csts code value 
17.  Comm plan window changes:  Change form trigger for commplan to call sokcomm for the test and insert;  Change 
test comm plan to process type 4, which is new and added for when a curricuum or lfos
is inactivated. 
18.  Defect 1-C3HXV  2/21/06 MAH
Changes to SOQOLIB in the forms trigger validate_lfos_curriculum_rules.
Recompile SAAADMS, SRARECR, SGASTDN, SFAREGS, SHADEGR.

Refresh the major rule for the attached major before validating the concentration. The issue was the major rule reflected the rule effective for the term on the original catalog term.  When the user changed the catalog term the major rule changed.

Add this function call for concentrations that have a filled in attached major 
Call before the the call to sokcurr.p_checklfos

  	-- update the major rule in conc attach rule 
      IF  :lcur_temp_rule_ind  ='Y'
     	cmjr_rule := sokcurr.F_SorcmjrRule
             (curr_rule => :sorlcur_curr_rule,
              majr_attach_ind => 'Y',
              major => :sorlfos_majr_code_attach,
              dept => dept_cd,
              term => nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code)),
              module => :module_ind);
           if cmjr_rule <> :sorlfos_conc_attach_rule and
            	cmjr_rule is not null then 
            	:sorlfos_conc_attach_rule := cmjr_rule;
           end if; 
         end if;  

19.  Defect 1-E0JDS  3/16/06  MAH
  Problem:  Curriculum checking should not done if the student record term
   is less than the lowest effective term in SOBCURR
  Solution: 
   In the sorlcur, sorlfos, sorlcur_lite, sorlfos_lite on-insert blocks do not 
   process curriculum errors or warnings that come back from the API if:  
   if :lcur_sobctrl_curr_rule_ind = 'Y' and :lcur_temp_rule_ind = 'Y'  
   UPdate the form level trigger validate base curriculum to also check the
   lcur temp rule ind = Y.
20.  Change order by in stvwapp_rg 1-E3QUM
21.  Curriculum defect 1-FSTCJ
  Problem:  Ended concentrations are appearing in the list of values of attached concentrations 
  Solution:  Correct the logic in the subquery to find max concentration group in the rg 
    stvmajr_lfos_conc_rg. 
    and sorccon_term_code_eff = 
  ( select max(m.sorccon_term_code_eff) 
   from sorccon m
   where  
   ((m.sorccon_curr_rule = sorccon.sorccon_curr_rule 
        and sorccon.sorccon_cmjr_rule = m.sorccon_cmjr_rule)
   or (m.sorccon_curr_rule = sorccon.sorccon_curr_rule and m.sorccon_cmjr_rule is null)) 
   and m.sorccon_term_code_eff <= :hold_term_ctlg )
22. Curriculum defect 1-E9HJ9
  Problem:  you can navigate to the field of study code before entering a field of study type
  and press the list of values 
  Solution:  when you first enter the field of study code display eerror  if the type is blank
  Check for existence of the field of study type in the when new instance trigger on the sorlfos.sorlfos_majr_code and sorlfos_lite.sorlfos_majr_code.

Add the following to the case statement checking for field of study type 
else 
	==> if :sorlfos_lfst_code is null then 
	==>	message( G$_NLS.Get('SOQOLIB-0656', 'FORM','Enter field of study type before selecting field of study.') );
	==>  raise form_trigger_failure;
	==> end if;
	 set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_lov');
23.  If conversion to lcur, lfos is run with curriculum checking off,  and user tries to add 
lfos, the ones for the curriculum rule will not be available.  Change check_lfos_base to store the
curr rule in new non database field temp_sorlcur_curr_rule.  Previously since the curr rule is null,
the process was trying to update it. The field is protected from update once the record is inserted and 
saved.

AUDIT TRAIL END 
</multilinecomment>
 
END;
	*/
	//ID:8000
	/* <p>
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit RETRIEVE_DEFAULTS
	
	PROCEDURE retrieve_defaults (p_lmod_code stvlmod.stvlmod_code%TYPE) IS

 
 --F2J_TODO: Change global current_user01 to current_user
 cursor lv_curric_default_cur is 
   select * from sorlcdf
   where sorlcdf_lmod_code = p_lmod_code
   and sorlcdf_user_id = :global.current_user01;
   
 lv_curric_default_rec  sorlcdf%ROWTYPE; 

Begin 
---- if we already read the default record than exist 
If  p_lmod_code = sb_curriculum_str.f_recruit and 
   :global.recruit_lmod_code is not null then 
	return;
elsif p_lmod_code = sb_curriculum_str.f_admissions and 
   :global.admissions_lmod_code is not null then 
	return;
elsif p_lmod_code = sb_curriculum_str.f_learner and 
   :global.learner_lmod_code is not null then 
	return;
elsif p_lmod_code = sb_curriculum_str.f_outcome and 
   :global.outcome_lmod_code is not null then 
	return;
else null;
end if; 

---- read the user's default values 
  open lv_curric_default_cur;
--  Lv_curric_default_cur := sb_curriculum_default.f_query_one(p_user_id => user, p_lmod_code => p_lmod_code);
  Fetch lv_curric_default_cur into lv_curric_default_rec; 
  If lv_curric_default_cur%notfound then 
    Close lv_curric_default_cur;
    Case p_lmod_code
     	When sb_curriculum_str.f_recruit then
	     	:global.recruit_lmod_code := p_lmod_code;
     	When sb_curriculum_str.f_admissions then
	    	:global.admissions_lmod_code := p_lmod_code;
     	When sb_curriculum_str.f_learner then
	     	:global.learner_lmod_code := p_lmod_code;
     	When sb_curriculum_str.f_outcome then 
	    	:global.outcome_lmod_code := p_lmod_code;
    	else
	     	null;
      end case;
      return;
  end if; 

  Case p_lmod_code
  	When sb_curriculum_str.f_recruit then
		:global.recruit_lmod_code := p_lmod_code;
		:global.recruit_levl_code := lv_curric_default_rec.sorlcdf_levl_code;
		:global.recruit_camp_code := lv_curric_default_rec.sorlcdf_camp_code;
		:global.recruit_coll_code := lv_curric_default_rec.sorlcdf_coll_code;
		:global.recruit_degc_code := lv_curric_default_rec.sorlcdf_degc_code;
		:global.recruit_dept_code := lv_curric_default_rec.sorlcdf_dept_code;
		:global.recruit_majr_code := lv_curric_default_rec.sorlcdf_majr_code;
		:global.recruit_program := lv_curric_default_rec.sorlcdf_program;

  	When sb_curriculum_str.f_admissions then 
		:global.admissions_lmod_code := p_lmod_code;
		:global.admissions_levl_code := lv_curric_default_rec.sorlcdf_levl_code;
		:global.admissions_camp_code := lv_curric_default_rec.sorlcdf_camp_code;
		:global.admissions_coll_code := lv_curric_default_rec.sorlcdf_coll_code;
		:global.admissions_degc_code := lv_curric_default_rec.sorlcdf_degc_code;
		:global.admissions_dept_code := lv_curric_default_rec.sorlcdf_dept_code;
		:global.admissions_majr_code := lv_curric_default_rec.sorlcdf_majr_code;
		:global.admissions_program := lv_curric_default_rec.sorlcdf_program;

  	When sb_curriculum_str.f_learner then
		:global.learner_lmod_code := p_lmod_code;
		:global.learner_levl_code := lv_curric_default_rec.sorlcdf_levl_code;
		:global.learner_camp_code := lv_curric_default_rec.sorlcdf_camp_code;
		:global.learner_coll_code := lv_curric_default_rec.sorlcdf_coll_code;
		:global.learner_degc_code := lv_curric_default_rec.sorlcdf_degc_code;
		:global.learner_dept_code := lv_curric_default_rec.sorlcdf_dept_code;
		:global.learner_majr_code := lv_curric_default_rec.sorlcdf_majr_code;
		:global.learner_program := lv_curric_default_rec.sorlcdf_program;

  	When sb_curriculum_str.f_outcome then
		:global.outcome_lmod_code := p_lmod_code;
		:global.outcome_levl_code := lv_curric_default_rec.sorlcdf_levl_code;
		:global.outcome_camp_code := lv_curric_default_rec.sorlcdf_camp_code;
		:global.outcome_coll_code := lv_curric_default_rec.sorlcdf_coll_code;
		:global.outcome_degc_code := lv_curric_default_rec.sorlcdf_degc_code;
		:global.outcome_dept_code := lv_curric_default_rec.sorlcdf_dept_code;
		:global.outcome_majr_code := lv_curric_default_rec.sorlcdf_majr_code;
		:global.outcome_program := lv_curric_default_rec.sorlcdf_program;

	else
		null;
	end case;
  Close lv_curric_default_cur;

  return;

END;
	*/
	//ID:8001
	/* <p>
/* </p>
		* @param pLmodCode
		*/
		public void retrieveDefaults(NString pLmodCode)
		{
			int rowCount = 0;
			String sqllvCurricDefaultCur = "SELECT * " +
	" FROM sorlcdf " +
	" WHERE sorlcdf_lmod_code = :P_P_LMOD_CODE AND sorlcdf_user_id = :GLOBAL_CURRENT_USER01 ";
			DataCursor lvCurricDefaultCur = new DataCursor(sqllvCurricDefaultCur);
			try {
				SorlcdfRow lvCurricDefaultRec= null;
				// -- if we already read the default record than exist 
				if ( pLmodCode.equals(SbCurriculumStr.fRecruit()) && !getGlobal("RECRUIT_LMOD_CODE").isNull() )
				{
					return ;
				}
				else if ( pLmodCode.equals(SbCurriculumStr.fAdmissions()) && !getGlobal("ADMISSIONS_LMOD_CODE").isNull() ) {
					return ;
				}
				else if ( pLmodCode.equals(SbCurriculumStr.fLearner()) && !getGlobal("LEARNER_LMOD_CODE").isNull() ) {
					return ;
				}
				else if ( pLmodCode.equals(SbCurriculumStr.fOutcome()) && !getGlobal("OUTCOME_LMOD_CODE").isNull() ) {
					return ;
				}
				else {
				}
				// -- read the user's default values 
				//Setting query parameters
				lvCurricDefaultCur.addParameter("P_P_LMOD_CODE", pLmodCode);
				lvCurricDefaultCur.addParameter("GLOBAL_CURRENT_USER01", getGlobal("CURRENT_USER01"));
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable lvCurricDefaultCur.
				lvCurricDefaultCur.open();
				//   Lv_curric_default_cur := sb_curriculum_default.f_query_one(p_user_id => user, p_lmod_code => p_lmod_code);
				lvCurricDefaultRec = lvCurricDefaultCur.fetchRow();
				if ( lvCurricDefaultCur.notFound() )
				{
					lvCurricDefaultCur.close();
					if (pLmodCode.equals(SbCurriculumStr.fRecruit()))
					{
						setGlobal("RECRUIT_LMOD_CODE", pLmodCode);
					}
					else if (pLmodCode.equals(SbCurriculumStr.fAdmissions()))
					{
						setGlobal("ADMISSIONS_LMOD_CODE", pLmodCode);
					}
					else if (pLmodCode.equals(SbCurriculumStr.fLearner()))
					{
						setGlobal("LEARNER_LMOD_CODE", pLmodCode);
					}
					else if (pLmodCode.equals(SbCurriculumStr.fOutcome()))
					{
						setGlobal("OUTCOME_LMOD_CODE", pLmodCode);
					}
					else {
					}
					return ;
				}
				if (pLmodCode.equals(SbCurriculumStr.fRecruit()))
				{
					setGlobal("RECRUIT_LMOD_CODE", pLmodCode);
					setGlobal("RECRUIT_LEVL_CODE", lvCurricDefaultRec.SorlcdfLevlCode);
					setGlobal("RECRUIT_CAMP_CODE", lvCurricDefaultRec.SorlcdfCampCode);
					setGlobal("RECRUIT_COLL_CODE", lvCurricDefaultRec.SorlcdfCollCode);
					setGlobal("RECRUIT_DEGC_CODE", lvCurricDefaultRec.SorlcdfDegcCode);
					setGlobal("RECRUIT_DEPT_CODE", lvCurricDefaultRec.SorlcdfDeptCode);
					setGlobal("RECRUIT_MAJR_CODE", lvCurricDefaultRec.SorlcdfMajrCode);
					setGlobal("RECRUIT_PROGRAM", lvCurricDefaultRec.SorlcdfProgram);
				}
				else if (pLmodCode.equals(SbCurriculumStr.fAdmissions()))
				{
					setGlobal("ADMISSIONS_LMOD_CODE", pLmodCode);
					setGlobal("ADMISSIONS_LEVL_CODE", lvCurricDefaultRec.SorlcdfLevlCode);
					setGlobal("ADMISSIONS_CAMP_CODE", lvCurricDefaultRec.SorlcdfCampCode);
					setGlobal("ADMISSIONS_COLL_CODE", lvCurricDefaultRec.SorlcdfCollCode);
					setGlobal("ADMISSIONS_DEGC_CODE", lvCurricDefaultRec.SorlcdfDegcCode);
					setGlobal("ADMISSIONS_DEPT_CODE", lvCurricDefaultRec.SorlcdfDeptCode);
					setGlobal("ADMISSIONS_MAJR_CODE", lvCurricDefaultRec.SorlcdfMajrCode);
					setGlobal("ADMISSIONS_PROGRAM", lvCurricDefaultRec.SorlcdfProgram);
				}
				else if (pLmodCode.equals(SbCurriculumStr.fLearner()))
				{
					setGlobal("LEARNER_LMOD_CODE", pLmodCode);
					setGlobal("LEARNER_LEVL_CODE", lvCurricDefaultRec.SorlcdfLevlCode);
					setGlobal("LEARNER_CAMP_CODE", lvCurricDefaultRec.SorlcdfCampCode);
					setGlobal("LEARNER_COLL_CODE", lvCurricDefaultRec.SorlcdfCollCode);
					setGlobal("LEARNER_DEGC_CODE", lvCurricDefaultRec.SorlcdfDegcCode);
					setGlobal("LEARNER_DEPT_CODE", lvCurricDefaultRec.SorlcdfDeptCode);
					setGlobal("LEARNER_MAJR_CODE", lvCurricDefaultRec.SorlcdfMajrCode);
					setGlobal("LEARNER_PROGRAM", lvCurricDefaultRec.SorlcdfProgram);
				}
				else if (pLmodCode.equals(SbCurriculumStr.fOutcome()))
				{
					setGlobal("OUTCOME_LMOD_CODE", pLmodCode);
					setGlobal("OUTCOME_LEVL_CODE", lvCurricDefaultRec.SorlcdfLevlCode);
					setGlobal("OUTCOME_CAMP_CODE", lvCurricDefaultRec.SorlcdfCampCode);
					setGlobal("OUTCOME_COLL_CODE", lvCurricDefaultRec.SorlcdfCollCode);
					setGlobal("OUTCOME_DEGC_CODE", lvCurricDefaultRec.SorlcdfDegcCode);
					setGlobal("OUTCOME_DEPT_CODE", lvCurricDefaultRec.SorlcdfDeptCode);
					setGlobal("OUTCOME_MAJR_CODE", lvCurricDefaultRec.SorlcdfMajrCode);
					setGlobal("OUTCOME_PROGRAM", lvCurricDefaultRec.SorlcdfProgram);
				}
				else {
				}
			} finally {
				lvCurricDefaultCur.close();
			}

			return ;
		}

	
	/* Original PL/SQL code for Prog Unit SET_CURRIC_PROPERTIES
	
	PROCEDURE set_curric_properties (p_column varchar2,
  p_item VARCHAR2,  p_attribute VARCHAR2) IS
BEGIN
	 -- program unit to ease some of the coding around setting the attribute
	IF get_item_property(p_column,visible) = 'TRUE' THEN

	 IF upper(p_attribute) = 'PROPERTY_FALSE' OR
	 	 upper(p_attribute) = 'PROPERTY_OFF' then 

     case upper(p_item)
       when 'ENABLED' THEN
        IF get_item_property(p_column,enabled) = 'TRUE' THEN 
     	    set_item_property(p_column, enabled, property_false);
     	  END IF;
    	 when 'NAVIGABLE' THEN
        IF get_item_property(p_column,navigable) = 'TRUE' THEN 
    	    set_item_property(p_column, navigable, property_false);
    	  END IF;
    	 when 'UPDATE_ALLOWED' THEN
    	  set_item_property(p_column, update_allowed, property_false);
     	 when 'INSERT_ALLOWED' THEN
    	  set_item_property(p_column, insert_allowed, property_false);
    	 when 'UPDATABLE' THEN
    	  set_item_property(p_column, update_allowed, property_false);
    	 when 'UPDATEABLE' THEN
    	  set_item_property(p_column, update_allowed, property_false);
     	 when 'VISIBLE' THEN
    	  set_item_property(p_column, visible, property_false);

       else 
    	  null; 
       end case; 
	 else 
     case upper(p_item)
       when 'ENABLED' THEN
        IF get_item_property(p_column,enabled) = 'FALSE' THEN 
      	  set_item_property(p_column, enabled, property_true);
        END IF;
     	 when 'NAVIGABLE' THEN
        IF get_item_property(p_column,navigable) = 'FALSE' THEN 
    	    set_item_property(p_column, navigable, property_true);
    	  END IF;
    	 when 'UPDATE_ALLOWED' THEN
    	  set_item_property(p_column, update_allowed, property_true);
    	 when 'INSERT_ALLOWED' THEN
    	  set_item_property(p_column, insert_allowed, property_true);
    	 when 'UPDATABLE' THEN
    	  set_item_property(p_column, update_allowed, property_true);
    	 when 'UPDATEABLE' THEN
    	  set_item_property(p_column, update_allowed, property_true);
    	 -- do not set the item to visible true 
    	 -- it may have been set to invisible in masking 
    	 --when 'VISIBLE' THEN
    	 -- set_item_property(p_column, visible, property_true);
      else 
    	  null; 
       end case; 

   end if; -- p attribute is false or true 
  end if; -- the column is visible 
EXCEPTION 
	WHEN OTHERS then 
	message(p_column || ' type ' || p_item || ' value ' || p_attribute || 
	  'error message ' || error_text); 
	  raise form_trigger_failure;
END;
	*/
	//ID:8002
	/* <p>
/* </p>
		* @param pColumn
		* @param pItem
		* @param pAttribute
		*/
		public void setCurricProperties(NString pColumn, NString pItem, NString pAttribute)
		{
			try
			{
				//  program unit to ease some of the coding around setting the attribute
				if ( getItemVisible(pColumn).equals("TRUE") )
				{
					if ( upper(pAttribute).equals("PROPERTY_FALSE") || upper(pAttribute).equals("PROPERTY_OFF") )
					{
						if (upper(pItem).equals("ENABLED"))
						{
							if ( getItemEnabled(pColumn).equals("TRUE") )
							{
								setItemEnabled(pColumn, false);
							}
						}
						else if (upper(pItem).equals("NAVIGABLE"))
						{
							if ( getItemNavigable(pColumn).equals("TRUE") )
							{
								setItemNavigable(pColumn, false);
							}
						}
						else if (upper(pItem).equals("UPDATE_ALLOWED"))
						{
							setItemUpdateAllowed(pColumn, false);
						}
						else if (upper(pItem).equals("INSERT_ALLOWED"))
						{
							setItemInsertAllowed(pColumn, false);
						}
						else if (upper(pItem).equals("UPDATABLE"))
						{
							setItemUpdateAllowed(pColumn, false);
						}
						else if (upper(pItem).equals("UPDATEABLE"))
						{
							setItemUpdateAllowed(pColumn, false);
						}
						else if (upper(pItem).equals("VISIBLE"))
						{
							setItemVisible(pColumn, false);
						}
						else {
						}
					}
					else {
						if (upper(pItem).equals("ENABLED"))
						{
							if ( getItemEnabled(pColumn).equals("FALSE") )
							{
								setItemEnabled(pColumn, true);
							}
						}
						else if (upper(pItem).equals("NAVIGABLE"))
						{
							if ( getItemNavigable(pColumn).equals("FALSE") )
							{
								setItemNavigable(pColumn, true);
							}
						}
						else if (upper(pItem).equals("UPDATE_ALLOWED"))
						{
							setItemUpdateAllowed(pColumn, true);
						}
						else if (upper(pItem).equals("INSERT_ALLOWED"))
						{
							setItemInsertAllowed(pColumn, true);
						}
						else if (upper(pItem).equals("UPDATABLE"))
						{
							setItemUpdateAllowed(pColumn, true);
						}
						else if (upper(pItem).equals("UPDATEABLE"))
						{
							setItemUpdateAllowed(pColumn, true);
						}
						else {
						}
					}
				}
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				message(pColumn.append(" type ").append(pItem).append(" value ").append(pAttribute).append("error message ").append(SupportClasses.SQLFORMS.ErrorText()));
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_1
	
	PROCEDURE AUDIT_TRAIL_7_3_1 IS
BEGIN
  null;
  <multilinecomment>
AUDIT TRAIL: 7.3.1
1. In sorlfos block, the deactivate button,  set the user ID and activity date to null
AFTER the duplicate record. 
2. Add new icons to the sorlcur block:  new buttons  deactivate_duplicate.
This button does the non destructive update like the change curriculum icon, but it also duplicates the curriculum and field
of study so the user does not have to retype all the data. 
The next new button is the duplicate. This one inserts/copies the curriculum.
3. Add triggers and new logic for user defaults. 
	Changes to the following triggers: new_sorlcur_inst,  query_sorlcur_lite, default_curricula and
	default_tab_curricula;  sorlcur, sorlcur_lite, sorlfos, sorlfos_lite
	triggers key-crecrec and key-nxtrec;  sorlfos and sorlfos_lite post change
	trigger on the lfst code. 
	Addition of new program unit retrieve_defaults and form level triggers 
	new_sorlcur and new_sorlfos. 
	These changes default values into the new curriculum or field of study
	records.  New institutional values for initial priority, and increment
	value on SOACTRL;  user preferences for curriculum and field of study values 
	on new form SOACLDF. 
4. Change references to cact ACTIVE and INACTIVE to soklcur.f_default_cact('ACTIVE'
and soklcur.f_event_status('INACTIVE'); 

5.  Defect 1-PWQSN  MAH  8/9/06
 Problem:  attributes are set on the lfos block without looking at visible property
 Solution:  change all set_item_properties call new program unit set_curric_properties
 with the column name, item type and attribute.  The process checks to verify the
 item is visibile, and if so it set the new attribute.

6. dEFECT 1-MR8IP  mah 8/9/06
  Problem:  Users received an invalid trigger call to clear_currlov_items when selecting the program
  on saaquik and sraquik.
  Solution:  removed the execution of this trigger, it was a carry over from the old pre 7.0 code

7. Defect 99543   MAH 8/16/06
Problem:  when SGASTDN is called in query mode, the maintenance buttons on the curriculum tab are 
still enabled and if pushed, will cause error messages. 
Solution: There is no way to tell if the form is called as query only,
please refer to oracle Note:118449.1, Subject: How To Detect Whether a Form is called in 
query-only mode ?   
Add new global :global.curriculum_query := 'Y'; before the call.
before the call.  Update the incns in SOQOLIB to issue error if this global is set to Y.

8. Defect 1-QCUFN  MAH  8/16/06
 Problem:  the lfos rule is not being cleared when a record duplicate occurs 
 Solution:  set the sorlfos_lfos_rule to null after the duplicate record in the 
   sorlfos and sorlfos_lite blocks.

9. Defect1-QA3QH MAH 8/17/06
problem: the attached concentration lov is empty if you add a new curriculum with a defaulting
curriculm and major, and you try to enter the concentration before saving. 
Solution:
Set the counter sorlfos_seqno_cnt to 1 in the form level trigger LCUR_DEFAULT_MAJOR.  
This trigger defaults in the major based on the program.  
The counter sorlfos_seqno_cnt is used to calculate the next field of study sequence number.  
The new concentration was set to 1, which was the number of the major.  
The major was overwritten in temporary areas because of the duplicate sequence number.

10.  put min / max values on priorirties 1-999

11.  1-SLWUW  - 8/23/06  MAH
  sobcact rg needs to have the nls date in the to_char(sobcact_activity_date)

12. Change lov sobcact_lov title to include form name (SORCACT) not table (SOBCACT)
change smrplre_proram_lov to include form  name (SMAPRLE)

13.  1-TPDTG   9/5/06  MAH
  Problem:  if major occurs more than once on SOACURR, each with a different dept. The 
   auto populate of the dept picks random occurence.  The department should not
   auto populate.
  Solution:  In lfos_majr_post_text trigger, check for occurences of the major in
   soacurr and only fill in the dept if it occurs once

14. 1-SEI3Z  9/5/06  MAH
 Problem:  delete last adminstrator in list yields error that role must be entered 
 Solution:  Remove the key-commit on the sorainf block. Add when-record-validate trigger
 to verify that the role has been entered for the administrator. 

15. The record count was not being incremented and decreased consistently on sorlcur and sorlcur_lite
blocks when you do a key-nxtrec, and key-clrrec. Add 1 to record counter in key-crecrec,key-nxtrec
and decrease by 1 in key-clrrec and key-delrec.  If the decrease results in <=0, set to 1.

16.  Add the current and active ind to sovlfos_attach_majr_lov and sorlfos_attach_majr_lov.
Select all records and not just current and active.

17.  change all on-insert for the sorlcur,sorlcur_lite,sorlfos, sorlfos_lite to select the 
record after the p_create. The g$_resych_record uses the data sourse which is the view
and cannot find the record to update the activity date.  The new select gets the updated
activity date.

18.  In sorlfos_lite and sorlcur_lite, when a dup record occurs copy the csts code. This 
was done for 7.3 on the sorlfos and sorlcur blocks but not to these blocks.
AUDIT TRAIL END 

19. 1-UV6O0  9/13/06  MAH
Problem:  the attached to major persists if you try to  remove it 
Solution:  Set the conc attach rule to null in the sorlfos_attach_conc_rule
post text and when validate item triggers. 
if :sorlfos_majr_code_attach is null then 
	:sorlfos_attach_conc_desc := null;
	:sorlfos_conc_attach_rule := null;
	return;
end if;

20. 1-O53AN  MAH 9/13/06
1.  add g$_after_trg_class to the post-block trigger on sovlfos
2.  move inactivate button on sorlfos block to top of canvas and display only
one occurence. This will remove possibility for client to click on button
while cursor is on another lfos record.
3.  do not insert sotvcur  in the sorlcur when validate record trigger if 
the record was just deleted
4.  change error message in check for lfos nulls to a generic enter required values, and
verify the item being navigated to is enabled.

21.  Add the following STVLEAV_THIRD_PARTY_REPORT_IND to stvleav_rg and stvleav_lov
Add the STVESTS_WDRL_CODE_DEF, STVESTS_WD_IND,   STVESTS_THIRD_PARTY_WD_IND  to stvests_rg
and stvests_lov

22.  1-10XDG7   9/25/06 MAH 
Problem:  Get max curriculum exceeded when you have two curriculum when you use the
  change curriculum button to make primary curriculum have different number. 
Test case:  set soactrl max curriculum for learner to 2.  Create learner with 2 curriculum,
  priority 1 and 2.  Press change curriculum button on priority 1 and 
  make it priority 3 and save.  
Solution: In the change and replace curriculum button insert inactive curriculum into
 sotlcur.  In validate curriculum on commit trigger, select only priorities where the max
 seqno is active.
 
23.  1-10XDG7  10/1/06  MAH
2nd Problem to defect:  Get invalid curriculum or message you cannot update the lfos if 
  you delete the last lfos that happens to be a conentration and it's attached to a major. 
Solution:  Add check to validate_lfos_curriculum_rules to not execute update to the lfos if the
  rowid is not null.

24. 1-10XDG7  10/1/06  MAH
3rd problem to defect:  Get curriculum error if you try to inactivate the last field of study and it happens
  to be a concentration attached to a major. 
Solution: Put in check that in validate_lfos_curriculum_rules to not execute check on concentration or the 
 curriculum rules check if the status is inactive.  Put similar check in the on-insert on the sorlfos blocks. 


AUDIT TRAIL END 
</multilinecomment>

END; 
	*/
	//ID:8003
	/* <p>
/* </p>
		*/
		public void auditTrail731()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_2
	
	PROCEDURE AUDIT_TRAIL_7_3_2 IS
BEGIN
  null;
  <multilinecomment>
AUDIT TRAIL: 7.3.2
1.  Defect 1-1A1XOL  MAH
 Problem:  when you delete the last curriculum the priority is always the initial priority + the increment value
 not the initial priority 

2.  Defect 1-10EC07 MAH
 Problem:  using the key-clrrec on the curriculum tab deletes the curriculum 
 Solution:  the key-clrrec trigger was issuing a delete_record, and it should have
 issued a clear_record.
 Include the on-clear-details form level trigger in both curricula lite and curriculum group 
 objects.
 
3.  Defect 1-1ADX6J MAH
 Problem:  the calendar icons return the date to the wrong column 
 Solution: the two calenar buttons were switched, the end date calednar was next to the
 start date and the start date calendar was next to the end date.

4.  Defect 1-18IT85 MAH
 Problem:  if you enter just the program on the curriculum tab, and save before pressing
 tab, you get an error that the level must be required.
 Solution:  add  the following lines to top of the key-commit in sorlcur and sorlcur_lite blocks 
    next_item;
    previous_item;
    validate(record_scope);

5. Defect 1-197XRC MAH
 Problem:  default catalog term on sraquik default tab was not being used to fill in the 
 curriculum catalog term.
 Solution:  a.  add new column default_term_code_ctlg to s$_curricula block
 b.  In default_curricula form level trigger fill in the sorlcur and sorlfos catalog 
  terms if the default tab options are used.
  
6.  Defect 1-1FYJ48 MAH
 Problem:  problem reported on defect is major with attached concentration can be inactivated, then the active
 duplicated and the save does not present errors about the attached conc not having a major. 
 The problem was the seqno calculation for the sorlfos_seqno.  It was not being assigned
 through the form so the number was not sequential to how data entry occured.  The on-commit and on
 insert processed records based on their record number, not based on the order in which data entry
 occured.  This was causing the wrong lfos record to be current, namely the inactive one.
 The process to check for inactive concentrations was using the data entry sequence, not the 
 rownumber. 
 Solution:  change the on insert to use pass the sorlfos_seqno and not a null to the api.  
 Add code in the key delrec, key prvrec to subtract one from the one up counter.  Change the
 post query on sorlcur to select the max sorlfos seqno, and not use the max function from the api.
 That function adds 1 to it.
   
AUDIT TRAIL END 
</multilinecomment>

END; 
	*/
	//ID:8004
	/* <p>
/* </p>
		*/
		public void auditTrail732()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_3
	
	PROCEDURE AUDIT_TRAIL_7_3_3 IS
BEGIN
  NULL;
  <multilinecomment>
AUDIT TRAIL: 7.3.3
1.  2/9/07  MAH 
  Change the current indicator to be a checkbox for ISC standards
  Change the pending mail and delete mail indicators on the commplan window 
  to be checkboxes. 
  
2.  1-1MNQ2Z  Curriculum checking not looking at the min term in sorlcur
   1. Copy the initial term found in the new-sorlcur-inst and query-new-sorlcur
   to save the initial term in a new global variable 
   2. Change the conditional logic to include the term comparison 
   	  IF sobctrl_row.sobctrl_curr_rule_ind  ='Y' and :lcur_temp_rule_ind = 'Y' and 
		   	 :global.init_curr_term <  :s$_curricula.module_term_code THEN


3.  1-1QDLJG MAH 2/28/07
Problem:  get error message on saaquik at save lcur_rec_cnt error. 
Solution:  Set the lcur_rec_cnt to 1 if it's null in the query_sorlcur_lite trigger. 

4.  1-ZLYUY  MAH 2/28/07
 Problem:  if you did a rollback after entering a new curriculum and one field of study,
 and select yes to save changes, the curriculum summary window was displayed on top
 of the curriculum or field of study block.
 Solution:  in the sorlcur and sorlfos key-clrfrm trigger do not show the summary canvas
 if the block is sorlfos or sorlcur.
 
5.  1-1R1ZPQ MAH 2/28/07 
 Problem:  the attached major does not populate the form field after selecting a concentration
 that has an attached major, and is attached to the base program.  
 Solution:  In the form level trigger, lfos_majr_post_text trigger do not execute
 the cursor to find the concentration attached to the base if the returned attached
 major code is not null.

6.  1-1FYIYB MAH 2/28/07
 Problem:  cannot attempt to attach a concentration to a major if the major exists as a non current, or
 not active.
 Solution:  In the form level trigger,  validate_attached_major
add logic to find max sotlfos for the major and priority to validate if there are active majors.
Recompile all forms using the curriculum. 

cursor max_tfos is 	
  select sotlfos_seqno, sotlfos_priority_no
  from  sobcact, sotlfos
  where sotlfos_lcur_seqno = :sorlcur_seqno
  and sotlfos_lfst_code = sb_fieldofstudy_str.f_major
  and sobcact_cact_code = sotlfos_cact_code
  and sobcact_active_ind = 'Y'
  and sotlfos_pidm = :sorlcur_pidm
  and sotlfos_majr_code = :sorlfos_majr_code_attach
 ==> and sotlfos_seqno = ( select max(m.sotlfos_seqno)
     from sotlfos m
     where m.sotlfos_pidm = :sorlfos_pidm
     and m.sotlfos_lcur_seqno = :sorlcur_seqno
     and m.sotlfos_lfst_code = sb_fieldofstudy_str.f_major
==>     and m.sotlfos_priority_no = sotlfos.sotlfos_priority_no)
  order by sotlfos_seqno desc;

7.  Defect 1-1MNHP3  MAH 2.28.07 
Problem:  all user defaults from sorlcdf, and those read from saaqker and sraquik 
do not fill in the department automatically if there is a valid curriculum and major.  
Solution:  add the following lines of code to the soqolib default_curricula 
and default_tab_curricula form level triggers.  This will find the department from the 
major rule on soacurr and populate the department code.

 if :sorlfos_majr_code is not null and :sorlfos_dept_code is null then 
     	    execute_trigger('LFOS_CHECK_PROGRAM_MAJOR');
   end if;

8.   Defect 1-1S19JK on srarecr  MAH 3/12/07 
  Problem:  back fill problems associated with deletion of srbrecr, sgbstdn, saradap and shrdgmr.
  Solution: Do not allow deletion of active learner curriculum if it's current for 
   another effective term.  Do not allow deletion of active field of study if it's current for
   a curriculum thats current and active for another efffective term. 
   Add logic to the key delete triggers in sorlcur and sorlfos to check for this condition and
   raise an error if this is true. 
   
9.  Defect 1-17Z41O  MAH  3/15/07 
 Problem:  The commplan materials for major, dept and styp may not always be created
 Solution:  Add new logic in the sobcpln post insert trigger, and the curriculum commplan
 commit trigger to execute the new sokcomm procedure p_insert_curricmaterials. 

10. Execute 	sokccur.p_delete_tabs;  from the validate_curriculum_at_commit trigger 
to force repopulation of cached table data 

11. Defect 1-23Q2VM MAH 4/11/07 
  Problem:  if the catalog term is changed on the lcur lite block, the fields of study
  may not be updated. 
  Solution: update the field of study catalog term if there is only one lfos (usually as 
   a result of a defaulted in record), else display a warning.  

12. MAH  4/12/07 
  Add STVFTYP to the title of the lov.
  
13.  Add lov and RG for STVCUDF   MAH 4/16/07

AUDIT TRAIL END
</multilinecomment>  
END;
	*/
	//ID:8005
	/* <p>
/* </p>
		*/
		public void auditTrail733()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1
1.  Added end term to curricula_summary_tab, curricula_canvas canvases. PL 05/21/2008
    Added sovlcur_term_code_end to sovlcur block. Add logic to manipulate 
    visible propertly of end term in form triggers new_sorlcur_inst,
    summary_block_preform, and query_form_visible.  Corrected display of 
    sorlcur_gapp_seqno to learner module only.
    Make the end term not enterable, as it has new functionality that is tied to the
    sgbstdn effective term.
2.  UI Enhancements to show descriptions  MAH  6/9/08 
   Solution: 1) Added the lfst description and rearranged the field of study canvas so it fits. 
     2) Added the learner module description to the curriculum canvas and again rearranged
     so it fits.   
     3) Display the program description on the curriculum tab and summary canvas 
     4) Display the campus, level, degree, program description in the tooltip on the 
     lfos canvas in the lcur summary     
3.  Athletic Compliance                        JKP 06/11/2008
    Added Record Groups and LOVs needed to support
    Athletic Compliance (ATHL) 8.1:  STVSAEL, STVSARE,
    STVSAAT, STVSAQS, STVSATR.
4. Defect 1-3T8IWB                                        JC  07/30/2008
   Problem: When deleting a Curriculum record from SFAREGS using a term 
            greater than that of the Effective Term of the Curriculum record, 
            the backfill does not recognize the deletion.
   Fix: Added the following code to the KEY-DELREC trigger in block SORLCUR. 
        When deleting Curriculum from SFAREGS, delete will not be allowed if 
        key-block term does not equal SORLCUR term.      
          IF :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
	 					 :s$_curricula.learner_eff_term IS NOT NULL and    -- Call is from SFAREGS.  Other forms pass NULL.
	 					 :sorlcur_term_code <> :s$_curricula.module_term_code  
          THEN
 	           MESSAGE( G$_NLS.Get('x', 'FORM','*ERROR* Cannot delete curriculum unless curriculum term equals key-block term.') );
             RAISE form_trigger_failure;
          END IF;
5.  Defect 1-3VADFB  MAH  8/4/08 
  Problem:  Set the recruit max curricula to 2 and admissions max curricula to 1 on SOACTRL. 
  Create an application with 1 curricula and a recruit with 2.  On Srarecr or sraquik, update 
  one of the columns on the recruit block and commit, do not include any updates to the 
  curriculum.  An erroneous error message occurs for invalid number of curricula.  This occurs
  on saaadms too if you reverse the situation.
  Solution: Update form level trigger populate_sotlcur to select the module being processed
  in the cursor sorlcur_c.  This line was accidently omitted from the select. 
  
AUDIT TRAIL: 8.1.1
1.  Fixed label alignment on Curricula tab.                JC  09/29/2008
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:8006
	/* <p>
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
2.  Fix rekey issues                                       PL  10/14/2008
    Fix:  Corrected error message format in VALIDATE_LFOS_CURRICULUM_RULES
    to replace concatenated codes with proper g$_nls.get format.

3.  Defect 1-3Y7WSZ  MAH  12/5/08 
    Problem: Receive curriculum failure if you enter a concentration, that is 
    attached to a major on SOACURR and you type in the attached major. Does not
    exists if you use the List of Values to select the concentration. 
    Solution:  In  the form trigger validate_lfos_curriculum_rules the 
    cmjr_rule was found correctly which is used to validate the concentration,
    but it was not used when sokcurr.p_checklfos.   

3. Defect 1-4FTPF8  MAH  1/6/09 
   Correct auto hint on attached to major on sorlfos_lite.  Major code the concentration is attached 'too'. 
   (should be 'to')

AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:8007
	/* <p>
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SOQOLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Jul 20 13:26:11 2010
-- MSGSIGN : #02cd6b7f8ac70c7f
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:8008
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
BEGIN
  NULL; 
<multilinecomment> 
 AUDIT TRAIL: 8.3 
 1. Study Paths   MAH  Sept 2009:
    a. Add new lov/rg for STVSTSP and SGBSTSP
    b. Display sovlcur_key_seqno for the learner on the curriculum summary 
    c. New global.study_path initalized from sobctrl in new_sorlcur_inst and query_sorlcur_lite.
    d. Add new sorlcur_key_seqno_lbt on the curriculum tab, sorlcur block. Make it invisible if not a learner
    module in new_sorlcur_inst, and make it invisible if learner but sobctrl_study_path_ind = N. 
    e. Allow rate,leave,site,session,grad enabled on curriculum tab only if learner key seq is 99 
    change the when-new-record-instance on sorlcur block
    f. Move the sb_learner.p_copy from the sorlcur on-insert trigger to the new_sorlcur trigger. 
     We need to execute that code which copies the sgbstdn and study paths before the record
     insert on sfaregs. 
    g. Add new block sgrstsp and s$_studypath, and new group object that is referenced in
    sgastdn and sfaregs.  The columns are placed on a canvas local to soqolib, and once referenced
    in sgastdn and sfaregs, the canvas and tab need to be changed to the one in those forms.
    h. Create study path on sorlcur_lite insert if its a student quick admit.  Do not allow delete
    on the sorlcur_lite if the lcur belongs to a learenr or study path.
    i. Add new form level trigger for the learner summary block forms to hide the study path information
    if study paths is not enabled. 
    j.  Do not allow deletion of the sorlcur_lite if the lmod is learner because of possible study
    path and registration restrictions 
    k.  change all selections of sovlcur or sorlcur to not compare the module_key_seqno to the 
     sorlcur_key_seqno if its a learner lmod 
    l.  add check if tab is updateable in sorlcur, sorlfos query_only triggers 
 AUDIT TRAIL END;
</multilinecomment> 
END;
	*/
	//ID:8009
	/* <p>
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. Updated release number to 8.4                   MB 12/01/2009
2. Student Centric Periods                         JO 12/23/2009
   a. added new LOV/RG for STVSCPC.
3. Defect 1-AUMH2N                                 JC 02/09/2010
   Problem: On SGASTDN, cannot always update fields on Study Path tab 
            when they should be updateable
   Fix: Modified procedure SET_CURRICULUM_PROPERTIES.  Added logic
        to check for p_item = 'UPDATABLE' and 'UPDATEABLE', because
        either value may be passed into this procedure, and both
        values were not being handled. 
4. Defect 1-ANHKR9                                 JC 02/10/2010
   Problem: When student has no study paths, the Study Paths tab is 
            disabled. However, next-blocking through the form 
            attempts to query the study paths for the student.
   Fix: Modified KEY-NXTBLK trigger on SORLFOS block.  
5. Study Path changes                              JC 02/11/2010
   Modified labels on Study Path tab so that they match labels on
   the Learner tab, for fields that are the same in SGBSTDN and
   SGRSTSP.  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:8010
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_0_1
	
	PROCEDURE AUDIT_TRAIL_8_4_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.4.0.1
1. Defect 1-4UT5FA                                            JC 05/10/2010
   Problem: Curricula with attached majors are flagged as invalid when they
            are valid, per SOACURR.
   Fix: Modified form-level trigger VALIDATE_ATTACHED_MAJOR.
        Modified WHEN-VALIDATE-ITEM trigger on :sorlcur_majr_code. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:8011
	/* <p>
/* </p>
		*/
		public void auditTrail8401()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment>
AUDIT TRAIL: 8.5
1. Study Paths for Fee Assessment project                         JC 07/07/2010
   1) Modified SORLCUR KEY-DELREC trigger, to issue warning if the
      curriculum record being deleted has been used for fee assessment.
   2) Modified warning message generated by form-level CHECK_STUDYPATH_COUNT
      trigger.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:8012
	/* <p>
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_0_3
	
	PROCEDURE AUDIT_TRAIL_8_5_0_3 IS
BEGIN
  NULL;
 <multilinecomment>
 AUDIT TRAIL: 8.5.0.3   
  1.Defect: 1-FSS07X                     AS 01/11/2011
    Problem:Fix for 1-CZNUX5 incorrectly done in SFAREGS and SGASTDN for 8.5.0.1. Fix should have been done in SOQOLIB.
    Solution: Changed post text item of SORLFOS_LFST_CODE to have single quotes around property_false in call to set_curric_properties.
    Changed from:
         set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled',property_false);
     To:
         set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
    
  2.Also changed When button pressed trigger of SORFLOS_LITE.SORLFOS_MAJR_CODE_ATTACH_LBT item
    FROM:    GO_ITEM('SORLFOS.SORLFOS_MAJR_CODE_ATTACH');
    To:      GO_ITEM('SORLFOS_LITE.SORLFOS_MAJR_CODE_ATTACH');   
    Reason being in SAAQUIK and SARQUIK the block used is SORFLOS_LITE. Due to which user is
    getting 'FRM-40105:Unable to resolve reference for item SORLFOS_MAJR_CODE_ATTACH' error.
  
  3. Changed trigger LFOS_CURR_CONC_HELP.Added the following line of code:
      :global.attached_major :=null;
 AUDIT TRAIL END 
 </multilinecomment> 
END;
	*/
	//ID:8013
	/* <p>
/* </p>
		*/
		public void auditTrail8503()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_3
	
	PROCEDURE AUDIT_TRAIL_8_5_3 IS
<multilinecomment>
AUDIT TRAIL: 8.5.3   
1.Defect: 1-I3KCAT                                                      JC  10/05/2011
  PROBLEM: Truncation errors occur because fields are defined as BYTE instead of CHAR.
  FIX: Changed 'Data Length Semantics' from BYTE to CHAR on a number of field property 
       sheets in the following blocks:
       - SORLCUR
       - SORLFOS
       - SORLCUR_LITE
       - SORLFOS_LITE
       - SOVLCUR
       - SOVLFOS
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL; 
END;
	*/
	//ID:8014
	/* <p>
/* </p>
		*/
		public void auditTrail853()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 2013 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:8015
	/* <p>
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_2
	
	PROCEDURE AUDIT_TRAIL_8_6_2 IS
<multilinecomment>
AUDIT TRAIL: 8.6.2   
1. eTranscript Project                                              AP 23-SEP-2013
	CREATED 4 NEW RECORD GROUPS AND 4 NEW LOVs FOR THE ETRANSCRIPT VALIDATION TABLES:
	STVETME
	STVETPU
	STVETTP
	STVETST
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL; 
END;
	*/
	//ID:8016
	/* <p>
/* </p>
		*/
		public void auditTrail862()
		{
		}
		
		public void sDeleteMaterials(NNumber pidm, NString planCode,
				NString typeInd, NString termCode, NNumber seqno) {
			int rowCount = 0;
			if (typeInd.equals("S")) {
				try {
					String sql1 = "DELETE FROM GURMAIL "
							+ " WHERE GURMAIL_PIDM = :P_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :P_TYPE_IND AND GURMAIL_TERM_CODE = '999999' AND GURMAIL_ADMIN_IDENTIFIER IS NULL AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :P_PLAN_CODE";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("P_PIDM", pidm);
					command1.addParameter("P_TYPE_IND", typeInd);
					command1.addParameter("P_PLAN_CODE", planCode);
					rowCount = command1.execute();
				} catch (NoDataFoundException e) {
				}
			} else {
				try {
					String sql2 = "DELETE FROM GURMAIL "
							+ " WHERE GURMAIL_PIDM = :P_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :P_TYPE_IND AND GURMAIL_TERM_CODE = :P_TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = :P_SEQNO AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :P_PLAN_CODE";
					DataCommand command2 = new DataCommand(sql2);
					// Setting query parameters
					command2.addParameter("P_PIDM", pidm);
					command2.addParameter("P_TYPE_IND", typeInd);
					command2.addParameter("P_TERM_CODE", termCode);
					command2.addParameter("P_SEQNO", seqno);
					command2.addParameter("P_PLAN_CODE", planCode);
					rowCount = command2.execute();
				} catch (NoDataFoundException e) {
				}
			}
		}

	
	

}
