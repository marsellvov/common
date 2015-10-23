package net.hedtech.general.common.libraries.Soqolib.controller;
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.SbCurriculum.CurriculumRecRow;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Soqolib.services.UnknownTypes;

		

public class SoqolibFormController extends AbstractSupportCodeObject  {

		
	
	
	public SoqolibFormController (ISupportCodeContainer container) 
	{
		super(container);
	}
	
	
	@Override
	public SoqolibTaskPart getContainer() {
		return (SoqolibTaskPart)super.getContainer();
	}
	
	
	public SoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LOAD_CURRENT_RELEASE
		 :current_release := '8.6.2';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Soqolib_LoadCurrentRelease()
		{
			
				getFormModel().getDummy().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEPT_DESC
		 --- CURR_DEPT_DESC   Trigger
   DECLARE
      temp_dept varchar2(30);
      temp_desc varchar2(100);
      CURSOR PTI_CURSOR IS
         SELECT STVDEPT_DESC
         FROM   STVDEPT
         WHERE  STVDEPT_CODE = temp_dept ;
   BEGIN
      temp_dept := name_in(:curr_dept_field);
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO temp_desc;
      copy(temp_desc,name_in('curr_DEPT_DESC') );
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEPT_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEPT_DESC")
		public void Soqolib_CurrDeptDesc()
		{
			
				// - CURR_DEPT_DESC   Trigger
				int rowCount = 0;
				{
					NString tempDept= NString.getNull();
					NString tempDesc= NString.getNull();
					String sqlptiCursor = "SELECT STVDEPT_DESC " +
	" FROM STVDEPT " +
	" WHERE STVDEPT_CODE = :P_TEMP_DEPT ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					tempDept = getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField());
					//Setting query parameters
					ptiCursor.addParameter("P_TEMP_DEPT", tempDept);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						tempDesc = ptiCursorResults.getStr(0);
					}
					copy(tempDesc,getNameIn("curr_DEPT_DESC"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MAJR_DESC
		 --- CURR_MAJR_DESC   Trigger
   DECLARE
      temp_majr varchar2(30);
      temp_desc varchar2(100);
      CURSOR PTI_CURSOR IS
         SELECT STVMAJR_DESC
         FROM   STVMAJR
         WHERE  STVMAJR_CODE = temp_majr ;
   BEGIN
      temp_majr := name_in(:curr_majr_field);
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO temp_desc;
      copy(temp_desc,name_in('curr_majr_DESC') );
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MAJR_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MAJR_DESC")
		public void Soqolib_CurrMajrDesc()
		{
			
				// - CURR_MAJR_DESC   Trigger
				int rowCount = 0;
				{
					NString tempMajr= NString.getNull();
					NString tempDesc= NString.getNull();
					String sqlptiCursor = "SELECT STVMAJR_DESC " +
	" FROM STVMAJR " +
	" WHERE STVMAJR_CODE = :P_TEMP_MAJR ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					tempMajr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField());
					//Setting query parameters
					ptiCursor.addParameter("P_TEMP_MAJR", tempMajr);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						tempDesc = ptiCursorResults.getStr(0);
					}
					copy(tempDesc,getNameIn("curr_majr_DESC"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM_MAJOR
		 --- CURR_PROGRAM_MAJOR   Trigger
<multilinecomment>  executed in post change of major code to get rule and department code </multilinecomment>
:curr_camp_code := name_in(:curr_camp_1_field);
:curr_coll_code := name_in(:curr_coll_1_field);
:curr_degc_code := name_in(:curr_degc_1_field);
:curr_levl_code := name_in(:curr_levl_1_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));
declare 
   temp_majr varchar2(30);
   temp_rule number;
   temp_rule_in number;
   temp_cmjr_rule number;
   temp_dept varchar2(30);
   temp_program varchar2(30);
begin
   temp_majr := name_in(:curr_majr_field);
   temp_rule_in := name_in(:curr_rule_1_field);
  
  select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code
   into temp_program, temp_rule, temp_cmjr_rule, temp_dept
   from sobcurr x, sorcmjr y
   where 
   ( ( x.sobcurr_curr_rule = temp_rule_in) or 
        (   temp_rule_in is null 
        and x.sobcurr_levl_code = :curr_levl_code
        and ((:curr_coll_code is null)
           or (x.sobcurr_coll_code = :curr_coll_code)) 
        and ((:curr_degc_code is null)
           or (x.sobcurr_degc_code = :curr_degc_code)) 
        and ((nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%') )
           or ( x.sobcurr_camp_code is null and :curr_camp_code is not null)) ))
   and x.sobcurr_term_code_init <= :curr_ctlg_term 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_majr_code = temp_majr
   and y.sorcmjr_term_code_eff  = 
      ( select max(t.sorcmjr_term_code_eff) 
        from sorcmjr t 
         where t.sorcmjr_curr_rule = y.sorcmjr_curr_rule 
         and t.sorcmjr_majr_code = y.sorcmjr_majr_code
         and t.sorcmjr_term_code_eff <= :curr_ctlg_term)
   and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
        or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
        or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
        or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
        or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
        or :module_ind = 'X') 
    and exists         
              (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <=  :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));

 
   if name_in(:curr_rule_field) is null then 
      copy(to_char(temp_rule), name_in('curr_rule_field'));
   end if;
 
 --  if name_in(:curr_program_1_field) <> temp_program then
      copy(temp_program, name_in('curr_program_1_field'));
 --  end if;
   copy(to_char(temp_cmjr_rule), name_in('curr_cmjr_rule_field'));
   if temp_dept is not null then 
     copy(temp_dept, name_in('curr_dept_field'));
     execute_trigger('curr_dept_desc');
   end if;
  
exception
   when no_data_found then
      null;
 -- message('No Program Found');
null;
   when too_many_rows then
 -- message('To Many Programs Found');
       null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM_MAJOR")
		public void Soqolib_CheckProgramMajor()
		{
			
				// - CURR_PROGRAM_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 
				int rowCount = 0;
				// - CURR_PROGRAM_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempMajr= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					NNumber tempRuleIn= NNumber.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NString tempDept= NString.getNull();
					NString tempProgram= NString.getNull();
					try
					{
						tempMajr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField());
						tempRuleIn = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()));
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE_IN) OR (:P_TEMP_RULE_IN IS NULL AND x.sobcurr_levl_code = :CURR_LEVL_CODE AND ((:CURR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :CURR_COLL_CODE)) AND ((:CURR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :CURR_DEGC_CODE)) AND ((nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)))) AND x.sobcurr_term_code_init <= :CURR_CTLG_TERM AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_majr_code = :P_TEMP_MAJR AND y.sorcmjr_term_code_eff = (SELECT max(t.sorcmjr_term_code_eff) " +
		" FROM sorcmjr t " +
		" WHERE t.sorcmjr_curr_rule = y.sorcmjr_curr_rule AND t.sorcmjr_majr_code = y.sorcmjr_majr_code AND t.sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE_IN", tempRuleIn);
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_MAJR", tempMajr);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempDept = results1.getStr(3);
						}
						results1.close();
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							copy(toChar(tempRule),getNameIn("curr_rule_field"));
						}
						//   if name_in(:curr_program_1_field) <> temp_program then
						copy(tempProgram,getNameIn("curr_program_1_field"));
						//   end if;
						copy(toChar(tempCmjrRule),getNameIn("curr_cmjr_rule_field"));
						if ( !tempDept.isNull() )
						{
							copy(tempDept,getNameIn("curr_dept_field"));
							executeAction("curr_dept_desc");
						}
					}
					catch(NoDataFoundException e)
					{
						//  message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						//  message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM_DEPT
		 --- CURR_PROGRAM_DEPT   Trigger
<multilinecomment>  executed in post change of dept code to get rule and major code </multilinecomment>
:curr_camp_code := name_in(:curr_camp_1_field);
:curr_coll_code := name_in(:curr_coll_1_field);
:curr_degc_code := name_in(:curr_degc_1_field);
:curr_levl_code := name_in(:curr_levl_1_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));
declare 
   temp_majr varchar2(30);
   temp_rule number;
   temp_cmjr_rule number;
   temp_dept varchar2(30);
   temp_program varchar2(30);
begin
   temp_dept := name_in(:curr_dept_field);
   temp_rule := name_in(:curr_rule_field);
  
   select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code
   into temp_program, temp_rule, temp_cmjr_rule, temp_majr
   from sobcurr x, sorcmjr y
   where 
   ( (temp_rule = x.sobcurr_curr_rule) or 
   (  (temp_rule is null) 
   and (nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%')) 
           or (x.sobcurr_camp_code is null and :curr_camp_code is not null)) 
   and ((nvl(x.sobcurr_levl_code,'%') = nvl(:curr_levl_code,'%')) 
        or (x.sobcurr_levl_code is null and :curr_levl_code is not null)) 
   and ((nvl(x.sobcurr_degc_code,'%') = nvl(:curr_degc_code,'%')) 
        or (x.sobcurr_degc_code is null and :curr_degc_code is not null)) 
   and ((nvl(x.sobcurr_coll_code,'%') = nvl(:curr_coll_code,'%')) 
       or (x.sobcurr_coll_code is null and :curr_coll_code is not null)) )
   and x.sobcurr_term_code_init <= :curr_ctlg_term 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_dept_code = temp_dept
   and y.sorcmjr_term_code_eff = 
       (select max(sorcmjr_term_code_eff) 
        from sorcmjr 
        where sorcmjr_curr_rule = x.sobcurr_curr_rule 
        and y.sorcmjr_dept_code = sorcmjr_dept_code
        and sorcmjr_term_code_eff <= :curr_ctlg_term 
        and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
             or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
             or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
             or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
             or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'))        
   and exists 
       (select 'x' from sormcrl 
        where sormcrl_curr_rule = x.sobcurr_curr_rule 
        and sormcrl_term_code_eff <= :curr_ctlg_term 
        and (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind 
             or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind 
             or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind 
             or decode(sormcrl_his_ind,'Y','H','N') = :module_ind 
             or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'));

   if name_in(:curr_rule_field) is null then 
      copy(to_char(temp_rule), name_in('curr_rule_field'));
      copy(temp_program, name_in('curr_program_1_field'));
   end if;
   copy(to_char(temp_cmjr_rule), name_in('curr_cmjr_rule_field'));
   copy(temp_majr, name_in('curr_majr_field'));
   execute_trigger('curr_majr_desc');


exception
   when no_data_found then
      null;
----  message('No Program Found');
null;
   when too_many_rows then
----  message('To Many Programs Found');
       null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM_DEPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM_DEPT")
		public void Soqolib_CheckProgramDept()
		{
			
				// - CURR_PROGRAM_DEPT   Trigger
				//   executed in post change of dept code to get rule and major code 
				int rowCount = 0;
				// - CURR_PROGRAM_DEPT   Trigger
				//   executed in post change of dept code to get rule and major code 
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempMajr= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NString tempDept= NString.getNull();
					NString tempProgram= NString.getNull();
					try
					{
						tempDept = getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField());
						tempRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((:P_TEMP_RULE = x.sobcurr_curr_rule) OR ((:P_TEMP_RULE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_levl_code, '%') = nvl(:CURR_LEVL_CODE, '%')) OR (x.sobcurr_levl_code IS NULL AND :CURR_LEVL_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_degc_code, '%') = nvl(:CURR_DEGC_CODE, '%')) OR (x.sobcurr_degc_code IS NULL AND :CURR_DEGC_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_coll_code, '%') = nvl(:CURR_COLL_CODE, '%')) OR (x.sobcurr_coll_code IS NULL AND :CURR_COLL_CODE IS NOT NULL))) AND x.sobcurr_term_code_init <= :CURR_CTLG_TERM AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_dept_code = :P_TEMP_DEPT AND y.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sobcurr_curr_rule AND y.sorcmjr_dept_code = sorcmjr_dept_code AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_DEPT", tempDept);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempMajr = results1.getStr(3);
						}
						results1.close();
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							copy(toChar(tempRule),getNameIn("curr_rule_field"));
							copy(tempProgram,getNameIn("curr_program_1_field"));
						}
						copy(toChar(tempCmjrRule),getNameIn("curr_cmjr_rule_field"));
						copy(tempMajr,getNameIn("curr_majr_field"));
						executeAction("curr_majr_desc");
					}
					catch(NoDataFoundException e)
					{
						// --  message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						// --  message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM_2_MAJOR
		 --- CURR_PROGRAM_2_MAJOR   Trigger
<multilinecomment>  executed in post change of major code to get rule and department code </multilinecomment>
:curr_camp_code := name_in(:curr_camp_2_field);
:curr_coll_code := name_in(:curr_coll_2_field);
:curr_degc_code := name_in(:curr_degc_2_field);
:curr_levl_code := name_in(:curr_levl_2_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));
declare 
   temp_majr varchar2(30);
   temp_rule number;
   temp_rule_in number;
   temp_cmjr_rule number;
   temp_dept varchar2(30);
   temp_program varchar2(30);
begin
   temp_majr := name_in(:curr_majr_field);
   temp_rule_in := name_in(:curr_rule_2_field);
   select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code
   into temp_program, temp_rule, temp_cmjr_rule, temp_dept
   from sobcurr x, sorcmjr y
   where 
   ( ( x.sobcurr_curr_rule = temp_rule_in) or 
        (   temp_rule_in is null 
        and x.sobcurr_levl_code = :curr_levl_code
        and ((:curr_coll_code is null)
           or (x.sobcurr_coll_code = :curr_coll_code)) 
        and ((:curr_degc_code is null)
           or (x.sobcurr_degc_code = :curr_degc_code)) 
        and ((nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%') )
           or ( x.sobcurr_camp_code is null and :curr_camp_code is not null)) ))
   and x.sobcurr_term_code_init <= :curr_ctlg_term 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_majr_code = temp_majr
   and y.sorcmjr_term_code_eff  = 
      ( select max(t.sorcmjr_term_code_eff) 
        from sorcmjr t 
         where t.sorcmjr_curr_rule = y.sorcmjr_curr_rule 
         and t.sorcmjr_majr_code = y.sorcmjr_majr_code
         and t.sorcmjr_term_code_eff <= :curr_ctlg_term)
   and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
        or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
        or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
        or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
        or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
        or :module_ind = 'X') 
    and exists         
              (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <=  :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));


   if name_in(:curr_rule_field) is null then 
      copy(to_char(temp_rule), name_in('curr_rule_field'));
   end if;
 --  if name_in(:curr_program_2_field) <> temp_program then
      copy(temp_program, name_in('curr_program_2_field'));
 --  end if;
   copy(to_char(temp_cmjr_rule), name_in('curr_cmjr_rule_field'));
   if temp_dept is not null then 
     copy(temp_dept, name_in('curr_dept_field'));
     execute_trigger('curr_dept_desc');
   end if;
 
exception
   when no_data_found then
--       message('No Program Found');
null;
   when too_many_rows then
--       message('To Many Programs Found');
         null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM_2_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM_2_MAJOR")
		public void Soqolib_CheckProgram2Major()
		{
			
				// - CURR_PROGRAM_2_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 
				int rowCount = 0;
				// - CURR_PROGRAM_2_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempMajr= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					NNumber tempRuleIn= NNumber.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NString tempDept= NString.getNull();
					NString tempProgram= NString.getNull();
					try
					{
						tempMajr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField());
						tempRuleIn = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()));
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE_IN) OR (:P_TEMP_RULE_IN IS NULL AND x.sobcurr_levl_code = :CURR_LEVL_CODE AND ((:CURR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :CURR_COLL_CODE)) AND ((:CURR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :CURR_DEGC_CODE)) AND ((nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)))) AND x.sobcurr_term_code_init <= :CURR_CTLG_TERM AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_majr_code = :P_TEMP_MAJR AND y.sorcmjr_term_code_eff = (SELECT max(t.sorcmjr_term_code_eff) " +
		" FROM sorcmjr t " +
		" WHERE t.sorcmjr_curr_rule = y.sorcmjr_curr_rule AND t.sorcmjr_majr_code = y.sorcmjr_majr_code AND t.sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE_IN", tempRuleIn);
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_MAJR", tempMajr);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempDept = results1.getStr(3);
						}
						results1.close();
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							copy(toChar(tempRule),getNameIn("curr_rule_field"));
						}
						//   if name_in(:curr_program_2_field) <> temp_program then
						copy(tempProgram,getNameIn("curr_program_2_field"));
						//   end if;
						copy(toChar(tempCmjrRule),getNameIn("curr_cmjr_rule_field"));
						if ( !tempDept.isNull() )
						{
							copy(tempDept,getNameIn("curr_dept_field"));
							executeAction("curr_dept_desc");
						}
					}
					catch(NoDataFoundException e)
					{
						//        message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						//        message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_IND_MESSAGE
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   22-Jan-2004 09:01 PM
 ******************************************</multilinecomment>

--- CURR_IND_MESSAGE   Trigger
declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
   cem_msg varchar2(250); 
begin
   cem_msg :=  G$_NLS.Get('SOQOLIB-0000', 'FORM','Curriculum Independent Program; Curriculum Checking not in Effect') ;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,cem_msg);
   alert_button := show_alert('CURRICULUM_INVALID');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_IND_MESSAGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_IND_MESSAGE")
		public void Soqolib_CurrIndMessage()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 22-Jan-2004 09:01 PM
				// ******************************************
				// - CURR_IND_MESSAGE   Trigger
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
					NString cemMsg= NString.getNull();
					cemMsg = GNls.Fget(toStr("SOQOLIB-0000"), toStr("FORM"), toStr("Curriculum Independent Program; Curriculum Checking not in Effect"));
					setAlertMessageText(alertId, cemMsg);
					alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM_2_DEPT
		 --- CURR_PROGRAM_2_DEPT   Trigger
<multilinecomment>  executed in post change of dept code to get rule and major code </multilinecomment>
:curr_camp_code := name_in(:curr_camp_2_field);
:curr_coll_code := name_in(:curr_coll_2_field);
:curr_degc_code := name_in(:curr_degc_2_field);
:curr_levl_code := name_in(:curr_levl_2_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));
declare 
   temp_majr varchar2(30);
   temp_rule number;
   temp_cmjr_rule number;
   temp_dept varchar2(30);
   temp_program varchar2(30);
begin
   temp_dept := name_in(:curr_dept_field);
   temp_rule := name_in(:curr_rule_field);
  
   select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code
   into temp_program, temp_rule, temp_cmjr_rule, temp_majr
   from sobcurr x, sorcmjr y
   where 
   ( (temp_rule = x.sobcurr_curr_rule) or 
   (  (temp_rule is null) 
   and (nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%')) 
           or (x.sobcurr_camp_code is null and :curr_camp_code is not null)) 
   and ((nvl(x.sobcurr_levl_code,'%') = nvl(:curr_levl_code,'%')) 
        or (x.sobcurr_levl_code is null and :curr_levl_code is not null)) 
   and ((nvl(x.sobcurr_degc_code,'%') = nvl(:curr_degc_code,'%')) 
        or (x.sobcurr_degc_code is null and :curr_degc_code is not null)) 
   and ((nvl(x.sobcurr_coll_code,'%') = nvl(:curr_coll_code,'%')) 
       or (x.sobcurr_coll_code is null and :curr_coll_code is not null)) )
   and x.sobcurr_term_code_init <= :curr_ctlg_term 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_dept_code = temp_dept
   and y.sorcmjr_term_code_eff = 
       (select max(sorcmjr_term_code_eff) 
        from sorcmjr 
        where sorcmjr_curr_rule = x.sobcurr_curr_rule 
        and y.sorcmjr_dept_code = sorcmjr_dept_code
        and sorcmjr_term_code_eff <= :curr_ctlg_term 
        and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
             or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
             or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
             or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
             or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'))        
   and exists 
       (select 'x' from sormcrl 
        where sormcrl_curr_rule = x.sobcurr_curr_rule 
        and sormcrl_term_code_eff <= :curr_ctlg_term 
        and (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind 
             or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind 
             or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind 
             or decode(sormcrl_his_ind,'Y','H','N') = :module_ind 
             or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'));

   if name_in(:curr_rule_field) is null then 
      copy(to_char(temp_rule), name_in('curr_rule_field'));
      copy(temp_program, name_in('curr_program_2_field'));
   end if;
   copy(to_char(temp_cmjr_rule), name_in('curr_cmjr_rule_field'));
   copy(temp_majr, name_in('curr_majr_field'));
   execute_trigger('curr_majr_desc');

exception
   when no_data_found then
      null;
----  message('No Program Found');
null;
   when too_many_rows then
----  message('To Many Programs Found');
       null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM_2_DEPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM_2_DEPT")
		public void Soqolib_CheckProgram2Dept()
		{
			
				// - CURR_PROGRAM_2_DEPT   Trigger
				//   executed in post change of dept code to get rule and major code 
				int rowCount = 0;
				// - CURR_PROGRAM_2_DEPT   Trigger
				//   executed in post change of dept code to get rule and major code 
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempMajr= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NString tempDept= NString.getNull();
					NString tempProgram= NString.getNull();
					try
					{
						tempDept = getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField());
						tempRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((:P_TEMP_RULE = x.sobcurr_curr_rule) OR ((:P_TEMP_RULE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_levl_code, '%') = nvl(:CURR_LEVL_CODE, '%')) OR (x.sobcurr_levl_code IS NULL AND :CURR_LEVL_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_degc_code, '%') = nvl(:CURR_DEGC_CODE, '%')) OR (x.sobcurr_degc_code IS NULL AND :CURR_DEGC_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_coll_code, '%') = nvl(:CURR_COLL_CODE, '%')) OR (x.sobcurr_coll_code IS NULL AND :CURR_COLL_CODE IS NOT NULL))) AND x.sobcurr_term_code_init <= :CURR_CTLG_TERM AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_dept_code = :P_TEMP_DEPT AND y.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sobcurr_curr_rule AND y.sorcmjr_dept_code = sorcmjr_dept_code AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_DEPT", tempDept);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempMajr = results1.getStr(3);
						}
						results1.close();
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							copy(toChar(tempRule),getNameIn("curr_rule_field"));
							copy(tempProgram,getNameIn("curr_program_2_field"));
						}
						copy(toChar(tempCmjrRule),getNameIn("curr_cmjr_rule_field"));
						copy(tempMajr,getNameIn("curr_majr_field"));
						executeAction("curr_majr_desc");
					}
					catch(NoDataFoundException e)
					{
						// --  message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						// --  message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_LOCK_MESSAGE
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   22-Jan-2004 09:01 PM
 ******************************************</multilinecomment>

--- CURR_LOCK_MESSAGE   Trigger
declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
begin
   :cem_msg :=  G$_NLS.Get('SOQOLIB-0001', 'FORM','Curriculum is not locked and will be flagged as invalid') ;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,:cem_msg);
   alert_button := show_alert('CURRICULUM_INVALID');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_LOCK_MESSAGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_LOCK_MESSAGE")
		public void Soqolib_CurrLockMessage()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 22-Jan-2004 09:01 PM
				// ******************************************
				// - CURR_LOCK_MESSAGE   Trigger
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
					getFormModel().getSCurriculumChange().setCemMsg(GNls.Fget(toStr("SOQOLIB-0001"), toStr("FORM"), toStr("Curriculum is not locked and will be flagged as invalid")));
					setAlertMessageText(alertId, getFormModel().getSCurriculumChange().getCemMsg());
					alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM_1_POST_LOV
		 --- CURR_PROGRAM_1_POST_LOV   Trigger
if :global.sel_ind = 'Y' then
      go_item(name_in('curr_program_1_field'));
      copy(:global.program,name_in('curr_program_1_field'));

      go_item(name_in('curr_levl_1_field'));
      copy(:global.level_code,name_in('curr_levl_1_field'));
      next_item;

      if :global.campus is null then
          null;
      else
         go_item(name_in('curr_camp_1_field'));
         copy(:global.campus,name_in('curr_camp_1_field'));
         next_item;
      end if;

      if :global.college is null then
             null;
      else
        go_item(name_in('curr_coll_1_field'));
         copy(:global.college,name_in('curr_coll_1_field'));
         next_item;
      end if;

      if :global.degree_code is null then
            null;
      else
        go_item(name_in('curr_degc_1_field'));
         copy(:global.degree_code,name_in('curr_degc_1_field'));
        next_item;
      end if;
      :smrprle_curr_ind := :global.curr_ind;
   end if;
   go_item(name_in('curr_program_1_field'));
   next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM_1_POST_LOV
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM_1_POST_LOV")
		public void Soqolib_CurrProgram1PostLov()
		{
			
				// - CURR_PROGRAM_1_POST_LOV   Trigger
				// - CURR_PROGRAM_1_POST_LOV   Trigger
				if ( getGlobal("SEL_IND").equals("Y") )
				{
					goItem(getNameIn("curr_program_1_field"));
					copy(getGlobal("PROGRAM"),getNameIn("curr_program_1_field"));
					goItem(getNameIn("curr_levl_1_field"));
					copy(getGlobal("LEVEL_CODE"),getNameIn("curr_levl_1_field"));
					nextItem();
					if ( getGlobal("CAMPUS").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_camp_1_field"));
						copy(getGlobal("CAMPUS"),getNameIn("curr_camp_1_field"));
						nextItem();
					}
					if ( getGlobal("COLLEGE").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_coll_1_field"));
						copy(getGlobal("COLLEGE"),getNameIn("curr_coll_1_field"));
						nextItem();
					}
					if ( getGlobal("DEGREE_CODE").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_degc_1_field"));
						copy(getGlobal("DEGREE_CODE"),getNameIn("curr_degc_1_field"));
						nextItem();
					}
					getFormModel().getSCurriculumChange().setSmrprleCurrInd(getGlobal("CURR_IND"));
				}
				goItem(getNameIn("curr_program_1_field"));
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM_2_POST_TEXT
		 --- CURR_PROGRAM_2_POST_TEXT   Trigger
IF name_in(:curr_PROGRAM_2_field) IS NOT NULL THEN
   IF :CURR_PROGRAM_2_CHANGE IS NULL OR
      :CURR_PROGRAM_2_CHANGE <> name_in(:curr_PROGRAM_2_field) THEN
      :curr_upd_base2 := 'Y';
          execute_trigger('curr_update_indicators');
   END IF;
END IF;

if name_in(:curr_PROGRAM_2_field) is not null and
   :sobctrl_curr_rule_ind = 'Y' then
       begin
          declare
            temp_pidm number;
            temp_program varchar2(30);
            cursor smrprle_check is 
              select smrprle_curr_ind
              from smrprle
              where nvl(smrprle_pidm, temp_pidm) = temp_pidm
              and smrprle_program = temp_program;
           begin
            temp_pidm := :curr_pidm;
            temp_program := name_in(:curr_program_2_field);
            open smrprle_check;
            fetch smrprle_check into :smrprle_curr_2_ind;
            if smrprle_check%notfound then
                  null;
            end if;
            if :smrprle_curr_ind = 'Y' then
                :sobctrl_curr_rule_ind := :hold_curr_rule_ind;
            else
                :sobctrl_curr_rule_ind := :smrprle_curr_2_ind;
            end if;
            close smrprle_check;
         end;
     end;
end if;

if :sobctrl_curr_rule_ind = 'Y'  then 
     execute_trigger('check_lock_2');
     if :curr_lock_ind = 'N' then 
        null;  <multilinecomment> lock check moved to check_program trigger </multilinecomment>
        <multilinecomment> dont show the message twice </multilinecomment>
     --   IF :CURR_PROGRAM_2_CHANGE IS NULL OR
     --      :CURR_PROGRAM_2_CHANGE <> name_in(:curr_PROGRAM_2_field) THEN
     --      execute_trigger('curr_lock_message');
     --    end if;
     elsif name_in(:curr_rule_2_field) is not null and
        name_in(:curr_rule_2_field) <> 0 and 
        name_in(:curr_majr_2_field) is null then 
          execute_trigger('curr_default_2_major');
     end if;
     
  
end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM_2_POST_TEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM_2_POST_TEXT")
		public void Soqolib_CurrProgram2PostText()
		{
			
				// - CURR_PROGRAM_2_POST_TEXT   Trigger
				int rowCount = 0;
				// - CURR_PROGRAM_2_POST_TEXT   Trigger
				if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).isNull() )
				{
					if ( getFormModel().getSCurriculumHoldItems().getCurrProgram2Change().isNull() || getFormModel().getSCurriculumHoldItems().getCurrProgram2Change().notEquals(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field())) )
					{
						getFormModel().getSCurriculumChange().setCurrUpdBase2(toStr("Y"));
						executeAction("curr_update_indicators");
					}
				}
				if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).isNull() && getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					{
						NNumber tempPidm= NNumber.getNull();
						NString tempProgram= NString.getNull();
						String sqlsmrprleCheck = "SELECT smrprle_curr_ind " +
	" FROM smrprle " +
	" WHERE nvl(smrprle_pidm, :P_TEMP_PIDM) = :P_TEMP_PIDM AND smrprle_program = :P_TEMP_PROGRAM ";
						DataCursor smrprleCheck = new DataCursor(sqlsmrprleCheck);
						tempPidm = toNumber(getFormModel().getSCurriculumFields().getCurrPidm());
						tempProgram = getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field());
						//Setting query parameters
						smrprleCheck.addParameter("P_TEMP_PIDM", tempPidm);
						smrprleCheck.addParameter("P_TEMP_PROGRAM", tempProgram);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable smrprleCheck.
						smrprleCheck.open();
						ResultSet smrprleCheckResults = smrprleCheck.fetchInto();
						if ( smrprleCheckResults != null ) {
							getFormModel().getSCurriculumChange().setSmrprleCurr2Ind(smrprleCheckResults.getStr(0));
						}
						if ( smrprleCheck.notFound() )
						{
						}
						if ( getFormModel().getSCurriculumChange().getSmrprleCurrInd().equals("Y") )
						{
							getFormModel().getSSobctrlBlock().setSobctrlCurrRuleInd(getFormModel().getSSobctrlBlock().getHoldCurrRuleInd());
						}
						else {
							getFormModel().getSSobctrlBlock().setSobctrlCurrRuleInd(getFormModel().getSCurriculumChange().getSmrprleCurr2Ind());
						}
						smrprleCheck.close();
					}
				}
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					executeAction("check_lock_2");
					if ( getFormModel().getSCurriculumHoldItems().getCurrLockInd().equals("N") )
					{
					}
					else if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).notEquals(0) && getNameIn(getFormModel().getSCurriculumFields().getCurrMajr2Field()).isNull() ) {
						executeAction("curr_default_2_major");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM_2_POST_LOV
		 --- CURR_PROGRAM_2_POST_LOV   Trigger
if :global.sel_ind = 'Y' then
      go_item(name_in('curr_program_2_field'));
      copy(:global.program,name_in('curr_program_2_field'));

      go_item(name_in('curr_levl_2_field'));
      copy(:global.level_code,name_in('curr_levl_2_field'));
      next_item;

      if :global.campus is null then
          null;
      else
         go_item(name_in('curr_camp_2_field'));
         copy(:global.campus,name_in('curr_camp_2_field'));
         next_item;
      end if;

      if :global.college is null then
             null;
      else
        go_item(name_in('curr_coll_2_field'));
         copy(:global.college,name_in('curr_coll_2_field'));
         next_item;
      end if;

      if :global.degree_code is null then
            null;
      else
        go_item(name_in('curr_degc_2_field'));
         copy(:global.degree_code,name_in('curr_degc_2_field'));
        next_item;
      end if;
      :smrprle_curr_ind := :global.curr_ind;
   end if;
   go_item(name_in('curr_program_2_field'));
   next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM_2_POST_LOV
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM_2_POST_LOV")
		public void Soqolib_CurrProgram2PostLov()
		{
			
				// - CURR_PROGRAM_2_POST_LOV   Trigger
				// - CURR_PROGRAM_2_POST_LOV   Trigger
				if ( getGlobal("SEL_IND").equals("Y") )
				{
					goItem(getNameIn("curr_program_2_field"));
					copy(getGlobal("PROGRAM"),getNameIn("curr_program_2_field"));
					goItem(getNameIn("curr_levl_2_field"));
					copy(getGlobal("LEVEL_CODE"),getNameIn("curr_levl_2_field"));
					nextItem();
					if ( getGlobal("CAMPUS").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_camp_2_field"));
						copy(getGlobal("CAMPUS"),getNameIn("curr_camp_2_field"));
						nextItem();
					}
					if ( getGlobal("COLLEGE").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_coll_2_field"));
						copy(getGlobal("COLLEGE"),getNameIn("curr_coll_2_field"));
						nextItem();
					}
					if ( getGlobal("DEGREE_CODE").isNull() )
					{
					}
					else {
						goItem(getNameIn("curr_degc_2_field"));
						copy(getGlobal("DEGREE_CODE"),getNameIn("curr_degc_2_field"));
						nextItem();
					}
					getFormModel().getSCurriculumChange().setSmrprleCurrInd(getGlobal("CURR_IND"));
				}
				goItem(getNameIn("curr_program_2_field"));
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM_POST_TEXT
		 --- CURR_PROGRAM_POST_TEXT   Trigger
IF :CURR_PROGRAM_1_CHANGE IS NULL OR
   :CURR_PROGRAM_1_CHANGE <> name_in(:curr_PROGRAM_1_field) THEN
      :curr_upd_base1 := 'Y';
      execute_trigger('curr_update_indicators');
END IF;


if name_in(:curr_PROGRAM_1_field) is not null and
   :sobctrl_curr_rule_ind = 'Y' then
       begin
          declare
            temp_pidm number;
            temp_program varchar2(30);
            cursor smrprle_check is 
              select smrprle_curr_ind
              from smrprle
              where nvl(smrprle_pidm, temp_pidm) = temp_pidm
              and smrprle_program = temp_program;
          begin
            temp_pidm := :curr_pidm;
            temp_program := name_in(:curr_program_1_field) ;
            open smrprle_check;
            fetch smrprle_check into :smrprle_curr_ind;
            if smrprle_check%notfound then
                  null;
            end if;
            if :smrprle_curr_ind = 'Y' then
                :sobctrl_curr_rule_ind := :hold_curr_rule_ind;
            else
                :sobctrl_curr_rule_ind := :smrprle_curr_ind;
            end if;
            close smrprle_check;
         end;
     end;
end if;

if :sobctrl_curr_rule_ind = 'Y'  then 
 execute_trigger('check_lock');
  if :curr_lock_ind = 'N' then 
  --  IF :CURR_PROGRAM_1_CHANGE IS NULL OR
  --     :CURR_PROGRAM_1_CHANGE <> name_in(:curr_PROGRAM_1_field) THEN
  --      execute_trigger('curr_lock_message');
  --  end if;
       null;   <multilinecomment> lock is checked in check_program trigger </multilinecomment>  
  else
      if name_in(:curr_rule_1_field) is not null and
        name_in(:curr_rule_1_field) <> 0 and 
        name_in(:curr_majr_1_field) is null then 
          execute_trigger('curr_default_major');
      end if;
  end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM_POST_TEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM_POST_TEXT")
		public void Soqolib_CurrProgramPostText()
		{
			
				// - CURR_PROGRAM_POST_TEXT   Trigger
				int rowCount = 0;
				// - CURR_PROGRAM_POST_TEXT   Trigger
				if ( getFormModel().getSCurriculumHoldItems().getCurrProgram1Change().isNull() || getFormModel().getSCurriculumHoldItems().getCurrProgram1Change().notEquals(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field())) )
				{
					getFormModel().getSCurriculumChange().setCurrUpdBase1(toStr("Y"));
					executeAction("curr_update_indicators");
				}
				if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).isNull() && getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					{
						NNumber tempPidm= NNumber.getNull();
						NString tempProgram= NString.getNull();
						String sqlsmrprleCheck = "SELECT smrprle_curr_ind " +
	" FROM smrprle " +
	" WHERE nvl(smrprle_pidm, :P_TEMP_PIDM) = :P_TEMP_PIDM AND smrprle_program = :P_TEMP_PROGRAM ";
						DataCursor smrprleCheck = new DataCursor(sqlsmrprleCheck);
						tempPidm = toNumber(getFormModel().getSCurriculumFields().getCurrPidm());
						tempProgram = getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field());
						//Setting query parameters
						smrprleCheck.addParameter("P_TEMP_PIDM", tempPidm);
						smrprleCheck.addParameter("P_TEMP_PROGRAM", tempProgram);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable smrprleCheck.
						smrprleCheck.open();
						ResultSet smrprleCheckResults = smrprleCheck.fetchInto();
						if ( smrprleCheckResults != null ) {
							getFormModel().getSCurriculumChange().setSmrprleCurrInd(smrprleCheckResults.getStr(0));
						}
						if ( smrprleCheck.notFound() )
						{
						}
						if ( getFormModel().getSCurriculumChange().getSmrprleCurrInd().equals("Y") )
						{
							getFormModel().getSSobctrlBlock().setSobctrlCurrRuleInd(getFormModel().getSSobctrlBlock().getHoldCurrRuleInd());
						}
						else {
							getFormModel().getSSobctrlBlock().setSobctrlCurrRuleInd(getFormModel().getSCurriculumChange().getSmrprleCurrInd());
						}
						smrprleCheck.close();
					}
				}
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					executeAction("check_lock");
					if ( getFormModel().getSCurriculumHoldItems().getCurrLockInd().equals("N") )
					{
						//   IF :CURR_PROGRAM_1_CHANGE IS NULL OR
						//      :CURR_PROGRAM_1_CHANGE <> name_in(:curr_PROGRAM_1_field) THEN
						//       execute_trigger('curr_lock_message');
						//   end if;
					}
					else {
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).notEquals(0) && getNameIn(getFormModel().getSCurriculumFields().getCurrMajr1Field()).isNull() )
						{
							executeAction("curr_default_major");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_SOBCURR_TERM
		 --- CHECK_SOBCURR_TERM   Trigger
begin
   select nvl(min(sobcurr_term_code_init),'999999')
   into :curr_init_term
   from sobcurr;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_SOBCURR_TERM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_SOBCURR_TERM")
		public void Soqolib_CheckSobcurrTerm()
		{
			
				// - CHECK_SOBCURR_TERM   Trigger
				int rowCount = 0;
				String sql1 = "SELECT nvl(min(sobcurr_term_code_init), '999999') " +
	" FROM sobcurr ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					getFormModel().getSSobctrlBlock().setCurrInitTerm(results1.getStr(0));
				}
				results1.close();
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEPT_HELP
		 --- CURR_DEPT_HELP   Trigger
set_lov_property('STVDEPT_LOV',TITLE,'All Department Codes');
if :temp_rule_ind = 'N' then
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
else
  if :sobctrl_curr_rule_ind = 'Y' then
    if name_in(:curr_rule_1_field) is null then
       message( G$_NLS.Get('SOQOLIB-0002', 'FORM','No Base Curriculum Rule has been Established') );
    else
       execute_trigger('check_base');
       :global.major := '';
       :hold_curr_rule := name_in(:curr_rule_field);
       :hold_term_ctlg := nvl(name_in(:curr_term_catlg_1_field),
                  name_in(:curr_term_field));
       :hold_dept_attach := null;
       if :majr1_attach_ind = 'Y' and name_in(:curr_majr_field) is not null 
        then
          <multilinecomment>  show stvdept lov if the dept for the major is blank   </multilinecomment>
          <multilinecomment>  no dept with the attached major acts like a wild card </multilinecomment>
          <multilinecomment>  any dept is valid with attached major                 </multilinecomment>
           execute_trigger('check_dept_attached');
       end if; 
       if :majr1_attach_ind = 'Y' then 
         if :hold_dept_attach = '2' then
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_LOV');
         else 
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_CURRDEPT_LOV');
         end if;
       else
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_LOV');
       end if;
       g$_display_lov('','');
       if :global.major is null then
          null;
       else
          copy(:global.major,name_in('curr_majr_field'));
          execute_trigger('curr_majr_desc');
       end if;
    end if;
  else
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
 end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEPT_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEPT_HELP")
		public void Soqolib_CurrDeptHelp()
		{
			
				// - CURR_DEPT_HELP   Trigger
				// - CURR_DEPT_HELP   Trigger
				setLovTitle("STVDEPT_LOV", "All Department Codes");
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0002"), toStr("FORM"), toStr("No Base Curriculum Rule has been Established")));
						}
						else {
							executeAction("check_base");
							setGlobal("MAJOR", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr(null));
							if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("Y") && !getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField()).isNull() )
							{
								//   show stvdept lov if the dept for the major is blank   
								//   no dept with the attached major acts like a wild card 
								//   any dept is valid with attached major                 
								executeAction("check_dept_attached");
							}
							if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("Y") )
							{
								if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") )
								{
									setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_LOV");
								}
								else {
									setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_CURRDEPT_LOV");
								}
							}
							else {
								setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("MAJOR").isNull() )
							{
							}
							else {
								copy(getGlobal("MAJOR"),getNameIn("curr_majr_field"));
								executeAction("curr_majr_desc");
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEPT_OPTIONS
		 --- CURR_DEPT_OPTIONS   Trigger
:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0003', 'FORM','All Department Codes') ;
:curr_option_key2 := '';
:curr_option_title2 := '';
 
  if :sobctrl_curr_rule_ind = 'Y' or :temp_rule_ind = 'Y' then
          
       execute_trigger('check_base'); 
       
      
       if :majr1_attach_ind = 'Y'    then
          <multilinecomment>  show stvdept lov if the dept for the major is blank   </multilinecomment>
          <multilinecomment>  no dept with the attached major acts like a wild card </multilinecomment>
          <multilinecomment>  any dept is valid with attached major                 </multilinecomment>
           execute_trigger('check_dept_attached');
        
         if :hold_dept_attach = '1' then
           :curr_option_key1 := 'HELP';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0004', 'FORM','Attached Majors/Departments') ;
         elsif :hold_dept_attach = '2' then
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0005', 'FORM','All Department Codes') ;
         elsif :hold_dept_attach = '3' then
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0006', 'FORM','All Department Codes') ;
           :curr_option_key2 := 'HELP';
           :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0007', 'FORM','Attached Majors/Departments') ;
         else
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0008', 'FORM','All Department Codes') ;
         end if;
       end if;
  end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEPT_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEPT_OPTIONS")
		public void Soqolib_CurrDeptOptions()
		{
			
				// - CURR_DEPT_OPTIONS   Trigger
				// - CURR_DEPT_OPTIONS   Trigger
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0003"), toStr("FORM"), toStr("All Department Codes")));
				getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr(""));
				getFormModel().getSCurriculumFields().setCurrOptionTitle2(toStr(""));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRuleInd().equals("Y") )
				{
					executeAction("check_base");
					if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("Y") )
					{
						//   show stvdept lov if the dept for the major is blank   
						//   no dept with the attached major acts like a wild card 
						//   any dept is valid with attached major                 
						executeAction("check_dept_attached");
						if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("1") )
						{
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0004"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") ) {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0005"), toStr("FORM"), toStr("All Department Codes")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("3") ) {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0006"), toStr("FORM"), toStr("All Department Codes")));
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0007"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0008"), toStr("FORM"), toStr("All Department Codes")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEPT_OPTIONS2
		 --- CURR_DEPT_OPTIONS2   Trigger for secondary curriculum
:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0009', 'FORM','All Department Codes') ;
:curr_option_key2 := '';
:curr_option_title2 := '';

  if :sobctrl_curr_rule_ind = 'Y' or :temp_rule_ind = 'Y'  then
       
       execute_trigger('check_base2');
       
       :hold_dept_attach := '';
       if :majr2_attach_ind = 'Y' 
        then
          <multilinecomment>  show stvdept lov if the dept for the major is blank   </multilinecomment>
          <multilinecomment>  no dept with the attached major acts like a wild card </multilinecomment>
          <multilinecomment>  any dept is valid with attached major                 </multilinecomment>
           execute_trigger('check_dept_2_attached');
      
       
         if :hold_dept_attach = '1' then
           :curr_option_key1 := 'HELP';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0010', 'FORM','Attached Majors/Departments') ;
         elsif :hold_dept_attach = '2' then
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0011', 'FORM','All Department Codes') ;
         elsif :hold_dept_attach = '3' then
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0012', 'FORM','All Department Codes') ;
           :curr_option_key2 := 'HELP';
           :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0013', 'FORM','Attached Majors/Departments') ;
         else
           :curr_option_key1 := 'LIST_VALUES';
           :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0014', 'FORM','All Department Codes') ;
         end if;
       end if;

  end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEPT_OPTIONS2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEPT_OPTIONS2")
		public void Soqolib_CurrDeptOptions2()
		{
			
				// - CURR_DEPT_OPTIONS2   Trigger for secondary curriculum
				// - CURR_DEPT_OPTIONS2   Trigger for secondary curriculum
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0009"), toStr("FORM"), toStr("All Department Codes")));
				getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr(""));
				getFormModel().getSCurriculumFields().setCurrOptionTitle2(toStr(""));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRuleInd().equals("Y") )
				{
					executeAction("check_base2");
					getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr(""));
					if ( getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("Y") )
					{
						//   show stvdept lov if the dept for the major is blank   
						//   no dept with the attached major acts like a wild card 
						//   any dept is valid with attached major                 
						executeAction("check_dept_2_attached");
						if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("1") )
						{
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0010"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") ) {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0011"), toStr("FORM"), toStr("All Department Codes")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("3") ) {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0012"), toStr("FORM"), toStr("All Department Codes")));
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0013"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else {
							getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0014"), toStr("FORM"), toStr("All Department Codes")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEPT_2_HELP
		 --- CURR_DEPT_2_HELP   Trigger
set_lov_property('STVDEPT_LOV',TITLE,'All Department Codes');
if :temp_rule_2_ind = 'N' then
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
else
  if :sobctrl_curr_rule_ind = 'Y' then
    if name_in(:curr_rule_2_field) is null then
       message( G$_NLS.Get('SOQOLIB-0015', 'FORM','No Base Curriculum Rule has been Established') );
    else
       execute_trigger('check_base2');
       :global.major := '';
       :hold_curr_rule := name_in(:curr_rule_field);
       :hold_term_ctlg := nvl(name_in(:curr_term_catlg_2_field),
                  name_in(:curr_term_field));
       :hold_dept_attach := '';
       if :majr2_attach_ind = 'Y' and name_in(:curr_majr_field) is not null 
        then
           execute_trigger('check_dept_2_attached');
       end if; 
       if :majr2_attach_ind = 'Y' then 
         if :hold_dept_attach = '2' then
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_LOV');
         else 
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_CURRDEPT_LOV');
         end if;
       else
           set_item_property(name_in('curr_dept_field'),LOV_NAME,'STVDEPT_LOV');
       end if;
       g$_display_lov('','');
       if :global.major is null then
          null;
       else
          copy(:global.major,name_in('curr_majr_field'));
          execute_trigger('curr_majr_desc');
       end if;
    end if;
  else
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
 end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEPT_2_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEPT_2_HELP")
		public void Soqolib_CurrDept2Help()
		{
			
				// - CURR_DEPT_2_HELP   Trigger
				// - CURR_DEPT_2_HELP   Trigger
				setLovTitle("STVDEPT_LOV", "All Department Codes");
				if ( getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0015"), toStr("FORM"), toStr("No Base Curriculum Rule has been Established")));
						}
						else {
							executeAction("check_base2");
							setGlobal("MAJOR", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr(""));
							if ( getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("Y") && !getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField()).isNull() )
							{
								executeAction("check_dept_2_attached");
							}
							if ( getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("Y") )
							{
								if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") )
								{
									setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_LOV");
								}
								else {
									setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_CURRDEPT_LOV");
								}
							}
							else {
								setItemLovName(getNameIn("curr_dept_field"), "STVDEPT_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("MAJOR").isNull() )
							{
							}
							else {
								copy(getGlobal("MAJOR"),getNameIn("curr_majr_field"));
								executeAction("curr_majr_desc");
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEFAULT_MAJOR
		 --- CURR_DEFAULT_MAJOR   Trigger
<multilinecomment>* curr_default_major routine called after the program *</multilinecomment>
<multilinecomment>* this routine will populate the major & dept code
    if there in only one attached major to the rule     *</multilinecomment>


:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));

declare
  temp_dept varchar2(30);
  temp_curr_rule number;
  temp_major varchar2(30);
  temp_cmjr_rule number;
begin
   temp_curr_rule := name_in(:curr_rule_1_field);
  
   select sorcmjr_majr_code, sorcmjr_dept_code ,
       sorcmjr_cmjr_rule
       into temp_major, temp_dept , temp_cmjr_rule
   from sorcmjr x
   where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
    
     copy(temp_major,name_in('curr_majr_1_field'));
     execute_trigger('curr_majr_desc');
     copy(temp_dept,name_in('curr_dept_1_field'));
     execute_trigger('curr_dept_desc');
     copy(to_char(temp_cmjr_rule),name_in('CURR_CMJR_RULE_1_1_FIELD'));
    
 exception
   when no_data_found then
     null;
   when too_many_rows then
     null;
 end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEFAULT_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEFAULT_MAJOR")
		public void Soqolib_CurrDefaultMajor()
		{
			
				// - CURR_DEFAULT_MAJOR   Trigger
				// * curr_default_major routine called after the program *
				// * this routine will populate the major & dept code
				// if there in only one attached major to the rule     *
				int rowCount = 0;
				// - CURR_DEFAULT_MAJOR   Trigger
				// * curr_default_major routine called after the program *
				// * this routine will populate the major & dept code
				// if there in only one attached major to the rule     *
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempDept= NString.getNull();
					NNumber tempCurrRule= NNumber.getNull();
					NString tempMajor= NString.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					try
					{
						tempCurrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()));
						String sql1 = "SELECT sorcmjr_majr_code, sorcmjr_dept_code, sorcmjr_cmjr_rule " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempMajor = results1.getStr(0);
							tempDept = results1.getStr(1);
							tempCmjrRule = results1.getNumber(2);
						}
						results1.close();
						copy(tempMajor,getNameIn("curr_majr_1_field"));
						executeAction("curr_majr_desc");
						copy(tempDept,getNameIn("curr_dept_1_field"));
						executeAction("curr_dept_desc");
						copy(toChar(tempCmjrRule),getNameIn("CURR_CMJR_RULE_1_1_FIELD"));
					}
					catch(NoDataFoundException e)
					{
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_DEFAULT_2_MAJOR
		 --- CURR_DEFAULT_2_MAJOR   Trigger
<multilinecomment>* curr_default_2_major routine called after the program *</multilinecomment>
<multilinecomment>* this routine will populate the major & dept code
    if there in only one attached major to the rule     *</multilinecomment>


:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));

declare
  temp_dept varchar2(30);
  temp_curr_rule number;
  temp_major varchar2(30);
  temp_cmjr_rule number;
begin
   temp_curr_rule := name_in(:curr_rule_2_field);
  
   select sorcmjr_majr_code, sorcmjr_dept_code ,
       sorcmjr_cmjr_rule
       into temp_major, temp_dept , temp_cmjr_rule
   from sorcmjr x
   where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
         and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
    
     copy(temp_major,name_in('curr_majr_2_field'));
     execute_trigger('curr_majr_desc');
     copy(temp_dept,name_in('curr_dept_2_field'));
     execute_trigger('curr_dept_desc');
     copy(to_char(temp_cmjr_rule),name_in('CURR_CMJR_RULE_2_1_FIELD'));
 exception
   when no_data_found then
     null;
   when too_many_rows then
     null;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_DEFAULT_2_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_DEFAULT_2_MAJOR")
		public void Soqolib_CurrDefault2Major()
		{
			
				// - CURR_DEFAULT_2_MAJOR   Trigger
				// * curr_default_2_major routine called after the program *
				// * this routine will populate the major & dept code
				// if there in only one attached major to the rule     *
				int rowCount = 0;
				// - CURR_DEFAULT_2_MAJOR   Trigger
				// * curr_default_2_major routine called after the program *
				// * this routine will populate the major & dept code
				// if there in only one attached major to the rule     *
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempDept= NString.getNull();
					NNumber tempCurrRule= NNumber.getNull();
					NString tempMajor= NString.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					try
					{
						tempCurrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()));
						String sql1 = "SELECT sorcmjr_majr_code, sorcmjr_dept_code, sorcmjr_cmjr_rule " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempMajor = results1.getStr(0);
							tempDept = results1.getStr(1);
							tempCmjrRule = results1.getNumber(2);
						}
						results1.close();
						copy(tempMajor,getNameIn("curr_majr_2_field"));
						executeAction("curr_majr_desc");
						copy(tempDept,getNameIn("curr_dept_2_field"));
						executeAction("curr_dept_desc");
						copy(toChar(tempCmjrRule),getNameIn("CURR_CMJR_RULE_2_1_FIELD"));
					}
					catch(NoDataFoundException e)
					{
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_DEPT_2_ATTACHED
		 --- CHECK_DEPT_2_ATTACHED   Trigger
<multilinecomment>* check_dept_attached routine called from dept key help *</multilinecomment>
<multilinecomment>* this routine sees if the attached major has a dept     *</multilinecomment>


:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));
declare
  temp_dept varchar2(30);
  temp_curr_rule number;
  temp_major varchar2(30);
  temp_cmjr_rule number;
  cnt_att number;
  cnt_all number;
 
  <multilinecomment>  major was entered and no attached dept exists </multilinecomment>
  cursor show_majr  is 
     select  sum(decode(x.sorcmjr_dept_code,null,1,0)), 
            sum(decode(x.sorcmjr_dept_code,null,0,1))  
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
    and temp_curr_rule is not null 
     and x.sorcmjr_majr_code = temp_major
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);


  <multilinecomment>  major was not entered and no attached dept exists to any major </multilinecomment>
  cursor show_nomajr is 
     select sum(decode(x.sorcmjr_dept_code,null,1,0)), 
            sum(decode(x.sorcmjr_dept_code,null,0,1)) 
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
   and temp_curr_rule is not null 
     and  temp_major is null
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
begin
   temp_curr_rule := name_in(:curr_rule_2_field);
   temp_major := name_in(:curr_majr_field);
   temp_cmjr_rule := name_in(:curr_cmjr_rule_field);
   cnt_all := 0;
   cnt_att := 0;
   if temp_major is not null then 
     open show_majr;
     fetch show_majr into cnt_all, cnt_att;
     if show_majr%notfound then 
       cnt_all := 1;
       cnt_att := 0;
     end if;
     close show_majr;
     if cnt_att >  0 then 
       :curr_majr_code := temp_major;
       :hold_dept_attach := '1';
     else 
       :hold_dept_attach := '2';
     end if;
   else
    if temp_curr_rule is null then 
   
     cnt_all := '1';  
   else
    
     open show_nomajr;
     fetch show_nomajr into cnt_all, cnt_att;
     if show_nomajr%notfound then 
     
        cnt_all := '1';       
       cnt_att := 0; 
     end if;
     close show_nomajr;
    end if;
     if cnt_att > 0 and cnt_all = 0 then 
       :hold_dept_attach := '1';
     elsif cnt_att = 0 and cnt_all > 0 then 
       :hold_dept_attach := '2';
     else
       :hold_dept_attach := '3';
     end if;
     :curr_majr_code := '';
   end if;
  
 end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_DEPT_2_ATTACHED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_DEPT_2_ATTACHED")
		public void Soqolib_CheckDept2Attached()
		{
			
				// - CHECK_DEPT_2_ATTACHED   Trigger
				// * check_dept_attached routine called from dept key help *
				// * this routine sees if the attached major has a dept     *
				int rowCount = 0;
				// - CHECK_DEPT_2_ATTACHED   Trigger
				// * check_dept_attached routine called from dept key help *
				// * this routine sees if the attached major has a dept     *
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempDept= NString.getNull();
					NNumber tempCurrRule= NNumber.getNull();
					NString tempMajor= NString.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NNumber cntAtt= NNumber.getNull();
					NNumber cntAll= NNumber.getNull();
					String sqlshowMajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND :P_TEMP_CURR_RULE IS NOT NULL AND x.sorcmjr_majr_code = :P_TEMP_MAJOR AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showMajr = new DataCursor(sqlshowMajr);
					String sqlshowNomajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND :P_TEMP_CURR_RULE IS NOT NULL AND :P_TEMP_MAJOR IS NULL AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showNomajr = new DataCursor(sqlshowNomajr);
					tempCurrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()));
					tempMajor = getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField());
					tempCmjrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField()));
					cntAll = toNumber(0);
					cntAtt = toNumber(0);
					if ( !tempMajor.isNull() )
					{
						//Setting query parameters
						showMajr.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						showMajr.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
						showMajr.addParameter("P_TEMP_MAJOR", tempMajor);
						showMajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable showMajr.
						showMajr.open();
						ResultSet showMajrResults = showMajr.fetchInto();
						if ( showMajrResults != null ) {
							cntAll = showMajrResults.getNumber(0);
							cntAtt = showMajrResults.getNumber(1);
						}
						if ( showMajr.notFound() )
						{
							cntAll = toNumber(1);
							cntAtt = toNumber(0);
						}
						showMajr.close();
						if ( cntAtt.greater(0) )
						{
							getFormModel().getSCurrProcBlock().setCurrMajrCode(tempMajor);
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
					}
					else {
						if ( tempCurrRule.isNull() )
						{
							cntAll = toNumber("1");
						}
						else {
							//Setting query parameters
							showNomajr.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
							showNomajr.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
							showNomajr.addParameter("P_TEMP_MAJOR", tempMajor);
							showNomajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable showNomajr.
							showNomajr.open();
							ResultSet showNomajrResults = showNomajr.fetchInto();
							if ( showNomajrResults != null ) {
								cntAll = showNomajrResults.getNumber(0);
								cntAtt = showNomajrResults.getNumber(1);
							}
							if ( showNomajr.notFound() )
							{
								cntAll = toNumber("1");
								cntAtt = toNumber(0);
							}
							showNomajr.close();
						}
						if ( cntAtt.greater(0) && cntAll.equals(0) )
						{
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else if ( cntAtt.equals(0) && cntAll.greater(0) ) {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("3"));
						}
						getFormModel().getSCurrProcBlock().setCurrMajrCode(toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_DEPT_ATTACHED
		 --- CHECK_DEPT_ATTACHED   Trigger
<multilinecomment>* check_dept_attached routine called from dept key help *</multilinecomment>
<multilinecomment>* this routine sees if the attached major has a dept     *</multilinecomment>


:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));
declare
  temp_dept varchar2(30);
  temp_curr_rule number;
  temp_major varchar2(30);
  temp_cmjr_rule number;
  cnt_att number;
  cnt_all number;
 
  <multilinecomment>  major was entered and no attached dept exists </multilinecomment>
  cursor show_majr  is 
     select  sum(decode(x.sorcmjr_dept_code,null,1,0)), 
           sum(decode(x.sorcmjr_dept_code,null,0,1))  
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
     and temp_curr_rule is not null 
     and x.sorcmjr_majr_code = temp_major
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);


  <multilinecomment>  major was not entered and no attached dept exists to any major </multilinecomment>
  cursor show_nomajr is 
     select sum(decode(x.sorcmjr_dept_code,null,1,0)), 
            sum(decode(x.sorcmjr_dept_code,null,0,1)) 
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= :curr_ctlg_term)
     and x.sorcmjr_curr_rule = temp_curr_rule
     and  temp_major is null
    and temp_curr_rule is not null 
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
begin
   temp_curr_rule := name_in(:curr_rule_1_field);
   temp_major := name_in(:curr_majr_field);
   temp_cmjr_rule := name_in(:curr_cmjr_rule_field);
   cnt_all := 0;
   cnt_att := 0;
    
 
   if temp_major is not null then 
     open show_majr;
     fetch show_majr into cnt_all, cnt_att;
   
     if show_majr%notfound then 
       cnt_all := 1;
       cnt_att := 0;
     end if;
     close show_majr;
     if cnt_att >  0 then 
       :curr_majr_code := temp_major;
       :hold_dept_attach := '1';
     else 
       :hold_dept_attach := '2';
     end if;
 
   else
   if temp_curr_rule is null then 
   
     cnt_all := '1';  
   else
    
     open show_nomajr;
     fetch show_nomajr into cnt_all, cnt_att;
     if show_nomajr%notfound then 
     
        cnt_all := '1';       
       cnt_att := 0; 
     end if;
     close show_nomajr;
    end if;
     if cnt_att > 0 and cnt_all = 0 then 
       :curr_majr_code := '';
       :hold_dept_attach := '1';
     elsif cnt_att = 0 and cnt_all > 0 then 
       :hold_dept_attach := '2';
     else
       :curr_majr_code := '';
       :hold_dept_attach := '3';
     end if;
 
 
   end if;
  


end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_DEPT_ATTACHED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_DEPT_ATTACHED")
		public void Soqolib_CheckDeptAttached()
		{
			
				// - CHECK_DEPT_ATTACHED   Trigger
				// * check_dept_attached routine called from dept key help *
				// * this routine sees if the attached major has a dept     *
				int rowCount = 0;
				// - CHECK_DEPT_ATTACHED   Trigger
				// * check_dept_attached routine called from dept key help *
				// * this routine sees if the attached major has a dept     *
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NString tempDept= NString.getNull();
					NNumber tempCurrRule= NNumber.getNull();
					NString tempMajor= NString.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NNumber cntAtt= NNumber.getNull();
					NNumber cntAll= NNumber.getNull();
					String sqlshowMajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND :P_TEMP_CURR_RULE IS NOT NULL AND x.sorcmjr_majr_code = :P_TEMP_MAJOR AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showMajr = new DataCursor(sqlshowMajr);
					String sqlshowNomajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= :CURR_CTLG_TERM ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND :P_TEMP_MAJOR IS NULL AND :P_TEMP_CURR_RULE IS NOT NULL AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showNomajr = new DataCursor(sqlshowNomajr);
					tempCurrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()));
					tempMajor = getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField());
					tempCmjrRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField()));
					cntAll = toNumber(0);
					cntAtt = toNumber(0);
					if ( !tempMajor.isNull() )
					{
						//Setting query parameters
						showMajr.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						showMajr.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
						showMajr.addParameter("P_TEMP_MAJOR", tempMajor);
						showMajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable showMajr.
						showMajr.open();
						ResultSet showMajrResults = showMajr.fetchInto();
						if ( showMajrResults != null ) {
							cntAll = showMajrResults.getNumber(0);
							cntAtt = showMajrResults.getNumber(1);
						}
						if ( showMajr.notFound() )
						{
							cntAll = toNumber(1);
							cntAtt = toNumber(0);
						}
						showMajr.close();
						if ( cntAtt.greater(0) )
						{
							getFormModel().getSCurrProcBlock().setCurrMajrCode(tempMajor);
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
					}
					else {
						if ( tempCurrRule.isNull() )
						{
							cntAll = toNumber("1");
						}
						else {
							//Setting query parameters
							showNomajr.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
							showNomajr.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
							showNomajr.addParameter("P_TEMP_MAJOR", tempMajor);
							showNomajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable showNomajr.
							showNomajr.open();
							ResultSet showNomajrResults = showNomajr.fetchInto();
							if ( showNomajrResults != null ) {
								cntAll = showNomajrResults.getNumber(0);
								cntAtt = showNomajrResults.getNumber(1);
							}
							if ( showNomajr.notFound() )
							{
								cntAll = toNumber("1");
								cntAtt = toNumber(0);
							}
							showNomajr.close();
						}
						if ( cntAtt.greater(0) && cntAll.equals(0) )
						{
							getFormModel().getSCurrProcBlock().setCurrMajrCode(toStr(""));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else if ( cntAtt.equals(0) && cntAll.greater(0) ) {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
						else {
							getFormModel().getSCurrProcBlock().setCurrMajrCode(toStr(""));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("3"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.GET_SOBCTRL
		 --- GET_SOBCTRL   Trigger
begin
  select sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind,
          sobctrl_rec_errlvl_ind, sobctrl_adm_errlvl_ind,
          sobctrl_stu_errlvl_ind, sobctrl_his_errlvl_ind,
          sobctrl_dau_errlvl_ind
   into :sobctrl_curr_rule_ind, :sobctrl_program_ind, :sobctrl_conc_ind,
          :sobctrl_rec_errlvl_ind, :sobctrl_adm_errlvl_ind,
          :sobctrl_stu_errlvl_ind, :sobctrl_his_errlvl_ind,
          :sobctrl_dau_errlvl_ind
   from sobctrl;
end;
:HOLD_CURR_RULE_IND := :SOBCTRL_CURR_RULE_IND;
:temp_rule_ind := :sobctrl_curr_rule_ind;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.GET_SOBCTRL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_SOBCTRL")
		public void Soqolib_GetSobctrl()
		{
			
				// - GET_SOBCTRL   Trigger
				int rowCount = 0;
				String sql1 = "SELECT sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind, sobctrl_rec_errlvl_ind, sobctrl_adm_errlvl_ind, sobctrl_stu_errlvl_ind, sobctrl_his_errlvl_ind, sobctrl_dau_errlvl_ind " +
	" FROM sobctrl ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					getFormModel().getSSobctrlBlock().setSobctrlCurrRuleInd(results1.getStr(0));
					getFormModel().getSSobctrlBlock().setSobctrlProgramInd(results1.getStr(1));
					getFormModel().getSSobctrlBlock().setSobctrlConcInd(results1.getStr(2));
					getFormModel().getSSobctrlBlock().setSobctrlRecErrlvlInd(results1.getStr(3));
					getFormModel().getSSobctrlBlock().setSobctrlAdmErrlvlInd(results1.getStr(4));
					getFormModel().getSSobctrlBlock().setSobctrlStuErrlvlInd(results1.getStr(5));
					getFormModel().getSSobctrlBlock().setSobctrlHisErrlvlInd(results1.getStr(6));
					getFormModel().getSSobctrlBlock().setSobctrlDauErrlvlInd(results1.getStr(7));
				}
				results1.close();
				getFormModel().getSSobctrlBlock().setHoldCurrRuleInd(getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd());
				getFormModel().getSCurrProcBlock().setTempRuleInd(getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd());
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CLEAR_CURRMAJOR_ITEMS
		 --- CURR_CLEARMAJOR_ITEMS   Trigger
---- this trigger is called from curc_program_help
---  this clears out the major fields if change curriculum is
---  selected
copy('',name_in('CURR_MAJR_1_FIELD')); 
go_item(name_in('CURR_MAJR_1_FIELD'));
next_item;

copy('',name_in('CURR_DEPT_1_FIELD')); 
go_item(name_in('CURR_DEPT_1_FIELD'));
next_item;
 
if :curr_conc_1_1_field is not null then  
  copy('',name_in('CURR_CONC_1_1_FIELD')); 
  go_item(name_in('CURR_CONC_1_1_FIELD')); 
  next_item;
end if;
if :CURR_CONC_1_2_FIELD is not null then
  copy('',name_in('CURR_CONC_1_2_FIELD')); 
  go_item(name_in('CURR_CONC_1_2_FIELD')); 
  next_item;
end if;

if :CURR_CONC_1_3_FIELD is not null then       
  copy('',name_in('CURR_CONC_1_3_FIELD'));
  go_item(name_in('CURR_CONC_1_3_FIELD')); 
  next_item; 
end if;

if :CURR_MAJR_1_2_FIELD is not null then  
  copy('',name_in('CURR_MAJR_1_2_FIELD')); 
  go_item(name_in('CURR_MAJR_1_2_FIELD')); 
  next_item;   
end if;
if :CURR_DEPT_1_2_FIELD is not null then 
  copy('',name_in('CURR_DEPT_1_2_FIELD'));
  go_item(name_in('CURR_DEPT_1_2_FIELD')); 
  next_item;   
end if;
if :CURR_CONC_121_FIELD is not null then  
  copy('',name_in('CURR_CONC_121_FIELD')); 
  go_item(name_in('CURR_CONC_121_FIELD')); 
  next_item;
end if;
if :CURR_CONC_122_FIELD is not null then   
  copy('',name_in('CURR_CONC_122_FIELD'));
  go_item(name_in('CURR_CONC_122_FIELD')); 
  next_item; 
end if;
if :CURR_CONC_123_FIELD is not null then   
  copy('',name_in('CURR_CONC_123_FIELD')); 
  go_item(name_in('CURR_CONC_123_FIELD')); 
  next_item;
end if;
if :CURR_MINR_1_1_FIELD is not null then    
  copy('',name_in('CURR_MINR_1_1_FIELD'));
  go_item(name_in('CURR_MINR_1_1_FIELD')); 
  next_item; 
end if;
if :CURR_MINR_1_2_FIELD is not null then    
  copy('',name_in('CURR_MINR_1_2_FIELD')); 
  go_item(name_in('CURR_MINR_1_2_FIELD')); 
  next_item; 
end if;
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CLEAR_CURRMAJOR_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLEAR_CURRMAJOR_ITEMS")
		public void Soqolib_ClearCurrmajorItems()
		{
			
				// - CURR_CLEARMAJOR_ITEMS   Trigger
				// -- this trigger is called from curc_program_help
				// -  this clears out the major fields if change curriculum is
				// -  selected
				// - CURR_CLEARMAJOR_ITEMS   Trigger
				// -- this trigger is called from curc_program_help
				// -  this clears out the major fields if change curriculum is
				// -  selected
				copy("",getNameIn("CURR_MAJR_1_FIELD"));
				goItem(getNameIn("CURR_MAJR_1_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_DEPT_1_FIELD"));
				goItem(getNameIn("CURR_DEPT_1_FIELD"));
				nextItem();
				if ( !getFormModel().getSCurriculumFields().getCurrConc11Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_1_1_FIELD"));
					goItem(getNameIn("CURR_CONC_1_1_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrConc12Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_1_2_FIELD"));
					goItem(getNameIn("CURR_CONC_1_2_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrConc13Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_1_3_FIELD"));
					goItem(getNameIn("CURR_CONC_1_3_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrMajr12Field().isNull() )
				{
					copy("",getNameIn("CURR_MAJR_1_2_FIELD"));
					goItem(getNameIn("CURR_MAJR_1_2_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrDept12Field().isNull() )
				{
					copy("",getNameIn("CURR_DEPT_1_2_FIELD"));
					goItem(getNameIn("CURR_DEPT_1_2_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrConc121Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_121_FIELD"));
					goItem(getNameIn("CURR_CONC_121_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrConc122Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_122_FIELD"));
					goItem(getNameIn("CURR_CONC_122_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrConc123Field().isNull() )
				{
					copy("",getNameIn("CURR_CONC_123_FIELD"));
					goItem(getNameIn("CURR_CONC_123_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrMinr11Field().isNull() )
				{
					copy("",getNameIn("CURR_MINR_1_1_FIELD"));
					goItem(getNameIn("CURR_MINR_1_1_FIELD"));
					nextItem();
				}
				if ( !getFormModel().getSCurriculumFields().getCurrMinr12Field().isNull() )
				{
					copy("",getNameIn("CURR_MINR_1_2_FIELD"));
					goItem(getNameIn("CURR_MINR_1_2_FIELD"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CLEAR_CURRMAJOR2_ITEMS
		 --- CURR_CLEARMAJOR2_ITEMS   Trigger
---- this trigger is called from curr_program2_help
---  this clears out the major fields if change curriculum is
---  selected
copy('',name_in('CURR_MAJR_2_FIELD')); 
go_item(name_in('CURR_MAJR_2_FIELD'));
next_item; 

copy('',name_in('CURR_DEPT_2_FIELD'));
go_item(name_in('CURR_DEPT_2_FIELD'));
next_item;
      
copy('',name_in('CURR_CONC_2_1_FIELD'));
go_item(name_in('CURR_CONC_2_1_FIELD'));
next_item;
   
copy('',name_in('CURR_CONC_2_2_FIELD')); 
go_item(name_in('CURR_CONC_2_2_FIELD'));
next_item;
   
copy('',name_in('CURR_CONC_2_3_FIELD')); 
go_item(name_in('CURR_CONC_2_3_FIELD'));
next_item;
  
copy('',name_in('CURR_MAJR_2_2_FIELD')); 
go_item(name_in('CURR_MAJR_2_2_FIELD'));
next_item;
    
copy('',name_in('CURR_DEPT_2_2_FIELD')); 
go_item(name_in('CURR_DEPT_2_2_FIELD'));
next_item;
   
copy('',name_in('CURR_CONC_221_FIELD')); 
go_item(name_in('CURR_CONC_221_FIELD'));
next_item;
   
copy('',name_in('CURR_CONC_222_FIELD')); 
go_item(name_in('CURR_CONC_222_FIELD'));
next_item;
  
copy('',name_in('CURR_CONC_223_FIELD'));
go_item(name_in('CURR_CONC_223_FIELD'));
next_item;
    
copy('',name_in('CURR_MINR_2_1_FIELD'));
go_item(name_in('CURR_MINR_2_1_FIELD'));
next_item;
    
copy('',name_in('CURR_MINR_2_2_FIELD'));
go_item(name_in('CURR_MINR_2_2_FIELD'));
next_item;
    
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CLEAR_CURRMAJOR2_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLEAR_CURRMAJOR2_ITEMS")
		public void Soqolib_ClearCurrmajor2Items()
		{
			
				// - CURR_CLEARMAJOR2_ITEMS   Trigger
				// -- this trigger is called from curr_program2_help
				// -  this clears out the major fields if change curriculum is
				// -  selected
				// - CURR_CLEARMAJOR2_ITEMS   Trigger
				// -- this trigger is called from curr_program2_help
				// -  this clears out the major fields if change curriculum is
				// -  selected
				copy("",getNameIn("CURR_MAJR_2_FIELD"));
				goItem(getNameIn("CURR_MAJR_2_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_DEPT_2_FIELD"));
				goItem(getNameIn("CURR_DEPT_2_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_2_1_FIELD"));
				goItem(getNameIn("CURR_CONC_2_1_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_2_2_FIELD"));
				goItem(getNameIn("CURR_CONC_2_2_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_2_3_FIELD"));
				goItem(getNameIn("CURR_CONC_2_3_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_MAJR_2_2_FIELD"));
				goItem(getNameIn("CURR_MAJR_2_2_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_DEPT_2_2_FIELD"));
				goItem(getNameIn("CURR_DEPT_2_2_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_221_FIELD"));
				goItem(getNameIn("CURR_CONC_221_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_222_FIELD"));
				goItem(getNameIn("CURR_CONC_222_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_CONC_223_FIELD"));
				goItem(getNameIn("CURR_CONC_223_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_MINR_2_1_FIELD"));
				goItem(getNameIn("CURR_MINR_2_1_FIELD"));
				nextItem();
				copy("",getNameIn("CURR_MINR_2_2_FIELD"));
				goItem(getNameIn("CURR_MINR_2_2_FIELD"));
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM2_HELP
		 --- CURR_PROGRAM2_HELP   Trigger
<multilinecomment>  key help for level, degree, college, campus and program   *</multilinecomment>
<multilinecomment>*  show the base rules defined on sobcurr                    *</multilinecomment>

if instr(upper(:curr_program_process),'LEVL',1) > 0 then 
   :curr_process :=  G$_NLS.Get('SOQOLIB-0016', 'FORM','Level') ;
   :curr_lov := 'sobcurr_levl_lov';
elsif instr(upper(:curr_program_process),'COLL',1) > 0 then 
   :curr_process := 'College';
   :curr_lov := 'sobcurr_coll_lov';
elsif instr(upper(:curr_program_process),'CAMP',1) > 0 then 
   :curr_process := 'Campus';
   :curr_lov := 'sobcurr_camp_lov';
elsif instr(upper(:curr_program_process),'DEGC',1) > 0 then 
   :curr_process := 'Degree';
   :curr_lov := 'sobcurr_DEGC_lov';
elsif instr(upper(:curr_program_process),'PROGRAM',1) > 0 then 
   :curr_process :=  G$_NLS.Get('SOQOLIB-0017', 'FORM','Program') ;
   :curr_lov := 'sobcurr_program_lov';
end if;


:global.sel_ind := '';
if :temp_rule_2_ind = 'N' then
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
else
 if :sobctrl_curr_rule_ind = 'Y' or :temp_rule_2_ind = 'Y' then
   <multilinecomment>  save the fields entered on the form to the curr fields </multilinecomment>
  :curr_levl_code := name_in(:curr_levl_2_field); 
  :curr_coll_code := name_in(:curr_coll_2_field);
  :curr_degc_code := name_in(:curr_degc_2_field);
  :curr_camp_code := name_in(:curr_camp_2_field); 
  if instr(name_in('curr_program_2_field'),'*') = 1 then
       :curr_program := '';
   else
       :curr_program := name_in(:curr_program_2_field);
   end if;
   
    
   :curr_eff_term := nvl(name_in(:curr_term_catlg_2_field),
                  name_in(:curr_term_field));
   :curr_ctlg_term := name_in(:curr_term_catlg_2_field);
   if :curr_change_ind = 'Y' then
      set_lov_property(:curr_lov,TITLE,'Change Curriculum');
   else
       set_lov_property(:curr_lov,TITLE,'Base Curriculum Rules by ' || :curr_process);
   end if;
   set_item_property(name_in('curr_program_process'),LOV_NAME,:CURR_LOV);
   G$_display_LOV('','');

   <multilinecomment> no select was made on lov, if curr changes was selected, put back the values </multilinecomment>
   if :global.sel_ind is null then
       if :curr_change_ind = 'Y' then
         go_item(name_in('curr_levl_2_field'));
         copy(:hold_level,name_in('curr_levl_2_field'));
 
         go_item(name_in('curr_camp_2_field'));
         copy(:hold_campus,name_in('curr_camp_2_field'));
     
         go_item(name_in('curr_coll_2_field'));
         copy(:hold_college,name_in('curr_coll_2_field'));
 
         go_item(name_in('curr_degc_2_field'));
         copy(:hold_degree,name_in('curr_degc_2_field'));
   
         go_item(name_in('curr_program_2_field'));
         copy(:hold_program, name_in('curr_program_2_field'));
        
   
       end if;
   <multilinecomment> copy results from select to fields on the form </multilinecomment>
   else
      if :curr_change_ind = 'Y' then 
        execute_trigger('clear_currmajor2_items');
        :curr_change_ind := 'N';
      end if;
      copy(:global.curr_rule,name_in('curr_rule_2_field'));

      go_item(name_in('curr_levl_2_field'));
      copy(:global.level_code,name_in('curr_levl_2_field'));
     
     go_item(name_in('curr_camp_2_field'));
     copy(:global.campus,name_in('curr_camp_2_field'));

      go_item(name_in('curr_coll_2_field'));
      copy(:global.college,name_in('curr_coll_2_field'));

      go_item(name_in('curr_degc_2_field'));
      copy(:global.degree_code,name_in('curr_degc_2_field'));

      if :global.program is null then
          null;
      else
          go_item(name_in('curr_program_2_field'));
          copy(:global.program,name_in('curr_program_2_field'));
          next_item;
      end if;
   
      execute_trigger('clear_currlov_items');
   end if;
 else
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
 end if;
end if;
go_item(name_in('curr_program_process'));
:curr_change_ind := 'N';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM2_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM2_HELP")
		public void Soqolib_CurrProgram2Help()
		{
			
				// - CURR_PROGRAM2_HELP   Trigger
				//   key help for level, degree, college, campus and program   *
				// *  show the base rules defined on sobcurr                    *
				// - CURR_PROGRAM2_HELP   Trigger
				//   key help for level, degree, college, campus and program   *
				// *  show the base rules defined on sobcurr                    *
				if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("LEVL"), toInt(1)).greater(0) )
				{
					getFormModel().getSCurriculumFields().setCurrProcess(GNls.Fget(toStr("SOQOLIB-0016"), toStr("FORM"), toStr("Level")));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_levl_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("COLL"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("College"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_coll_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("CAMP"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("Campus"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_camp_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("DEGC"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("Degree"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_DEGC_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("PROGRAM"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(GNls.Fget(toStr("SOQOLIB-0017"), toStr("FORM"), toStr("Program")));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_program_lov"));
				}
				setGlobal("SEL_IND", toStr(""));
				if ( getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("Y") )
					{
						//   save the fields entered on the form to the curr fields 
						getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
						getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
						getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
						getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
						if ( inStr(getNameIn("curr_program_2_field"), toStr("*")).equals(1) )
						{
							getFormModel().getSCurrProcBlock().setCurrProgram(toStr(""));
						}
						else {
							getFormModel().getSCurrProcBlock().setCurrProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()));
						}
						getFormModel().getSCurrProcBlock().setCurrEffTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
						getFormModel().getSCurrProcBlock().setCurrCtlgTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()));
						if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
						{
							setLovTitle(getFormModel().getSCurriculumFields().getCurrLov(), "Change Curriculum");
						}
						else {
							setLovTitle(getFormModel().getSCurriculumFields().getCurrLov(), toStr("Base Curriculum Rules by ").append(getFormModel().getSCurriculumFields().getCurrProcess()));
						}
						setItemLovName(getNameIn("curr_program_process"), getFormModel().getSCurriculumFields().getCurrLov());
						getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						//  no select was made on lov, if curr changes was selected, put back the values 
						if ( getGlobal("SEL_IND").isNull() )
						{
							if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
							{
								goItem(getNameIn("curr_levl_2_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldLevel(),getNameIn("curr_levl_2_field"));
								goItem(getNameIn("curr_camp_2_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldCampus(),getNameIn("curr_camp_2_field"));
								goItem(getNameIn("curr_coll_2_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldCollege(),getNameIn("curr_coll_2_field"));
								goItem(getNameIn("curr_degc_2_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldDegree(),getNameIn("curr_degc_2_field"));
								goItem(getNameIn("curr_program_2_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldProgram(),getNameIn("curr_program_2_field"));
							}
						}
						else {
							if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
							{
								executeAction("clear_currmajor2_items");
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
							}
							copy(getGlobal("CURR_RULE"),getNameIn("curr_rule_2_field"));
							goItem(getNameIn("curr_levl_2_field"));
							copy(getGlobal("LEVEL_CODE"),getNameIn("curr_levl_2_field"));
							goItem(getNameIn("curr_camp_2_field"));
							copy(getGlobal("CAMPUS"),getNameIn("curr_camp_2_field"));
							goItem(getNameIn("curr_coll_2_field"));
							copy(getGlobal("COLLEGE"),getNameIn("curr_coll_2_field"));
							goItem(getNameIn("curr_degc_2_field"));
							copy(getGlobal("DEGREE_CODE"),getNameIn("curr_degc_2_field"));
							if ( getGlobal("PROGRAM").isNull() )
							{
							}
							else {
								goItem(getNameIn("curr_program_2_field"));
								copy(getGlobal("PROGRAM"),getNameIn("curr_program_2_field"));
								nextItem();
							}
							executeAction("clear_currlov_items");
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				goItem(getNameIn("curr_program_process"));
				getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_PROGRAM_HELP
		 --- CURR_PROGRAM_HELP   Trigger
<multilinecomment>*  key help for level, degree, college, campus and program   *</multilinecomment>
<multilinecomment>*  show the base rules defined on sobcurr                    *</multilinecomment>

if instr(upper(:curr_program_process),'LEVL',1) > 0 then 
   :curr_process :=  G$_NLS.Get('SOQOLIB-0018', 'FORM','Level') ;
   :curr_lov := 'sobcurr_levl_lov';
elsif instr(upper(:curr_program_process),'COLL',1) > 0 then 
   :curr_process := 'College';
   :curr_lov := 'sobcurr_coll_lov';
elsif instr(upper(:curr_program_process),'CAMP',1) > 0 then 
   :curr_process := 'Campus';
   :curr_lov := 'sobcurr_camp_lov';
elsif instr(upper(:curr_program_process),'DEGC',1) > 0 then 
   :curr_process := 'Degree';
   :curr_lov := 'sobcurr_DEGC_lov';
elsif instr(upper(:curr_program_process),'PROGRAM',1) > 0 then 
   :curr_process :=  G$_NLS.Get('SOQOLIB-0019', 'FORM','Program') ;
   :curr_lov := 'sobcurr_program_lov';
end if;

:global.sel_ind := '';

if :temp_rule_ind = 'N' then
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
else
if :sobctrl_curr_rule_ind = 'Y' or :temp_rule_ind = 'Y' then
   <multilinecomment>  save the fields entered on the form to the curr fields </multilinecomment>
  :curr_levl_code := name_in(:curr_levl_1_field); 
  :curr_coll_code := name_in(:curr_coll_1_field);
  :curr_degc_code := name_in(:curr_degc_1_field);
  :curr_camp_code := name_in(:curr_camp_1_field); 
  if instr(name_in('curr_program_1_field'),'*') = 1 then
       :curr_program := '';
   else
       :curr_program := name_in(:curr_program_1_field);
   end if;
 
 
 -- message('module ' || :module_ind || ' lvl=' || :curr_levl_code 
 --  || ' col=' || :curr_coll_code || ' degc= ' || :curr_degc_code 
 --  ||  ' cm=' || :curr_camp_code || ' pg=' ||  :curr_program);

   :curr_eff_term := nvl(name_in(:curr_term_catlg_1_field),
                  name_in(:curr_term_field));
   :curr_ctlg_term := name_in(:curr_term_catlg_1_field);
   if :curr_change_ind = 'Y' then
      set_lov_property(:curr_lov,TITLE,'Change Curriculum');
   else
       set_lov_property(:curr_lov,TITLE,'Base Curriculum Rules by ' || :curr_process);
   end if;
   set_item_property(name_in('curr_program_process'),LOV_NAME,:curr_lov);
   g$_display_lov('',''); 

   <multilinecomment> no select was made on lov, if curr changes was selected, put back the values </multilinecomment>
   if :global.sel_ind is null then
       if :curr_change_ind = 'Y' then
         go_item(name_in('curr_levl_1_field'));
         copy(:hold_level,name_in('curr_levl_1_field'));
 
         go_item(name_in('curr_camp_1_field'));
         copy(:hold_campus,name_in('curr_camp_1_field'));
     
         go_item(name_in('curr_coll_1_field'));
         copy(:hold_college,name_in('curr_coll_1_field'));
 
         go_item(name_in('curr_degc_1_field'));
         copy(:hold_degree,name_in('curr_degc_1_field'));
   
         go_item(name_in('curr_program_1_field'));
         copy(:hold_program, name_in('curr_program_1_field'));
        
       end if;
   <multilinecomment> copy results from select to fields on the form </multilinecomment>
   else
 
      copy(:global.curr_rule,name_in('curr_rule_1_field'));
      if :curr_change_ind = 'Y' then 
 
        execute_trigger('clear_currmajor_items');
        :curr_change_ind := 'N';
      end if;
  
      go_item(name_in('curr_levl_1_field'));
      copy(:global.level_code,name_in('curr_levl_1_field'));
 
      go_item(name_in('curr_camp_1_field'));
      copy(:global.campus,name_in('curr_camp_1_field'));
     
      go_item(name_in('curr_coll_1_field'));
      copy(:global.college,name_in('curr_coll_1_field'));
 
      go_item(name_in('curr_degc_1_field'));
      copy(:global.degree_code,name_in('curr_degc_1_field'));
   
      if :global.program is null then
          null;
      else
          go_item(name_in('curr_program_1_field'));
          copy(:global.program,name_in('curr_program_1_field'));
          next_item;
      end if;
     
      execute_trigger('clear_currlov_items');
  end if;
else
  execute_trigger('invalid_curr_msg');
  do_key('LIST_VALUES');
end if;
end if;

go_item(name_in('curr_program_process'));
:curr_change_ind := 'N';



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_PROGRAM_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_PROGRAM_HELP")
		public void Soqolib_CurrProgramHelp()
		{
			
				// - CURR_PROGRAM_HELP   Trigger
				// *  key help for level, degree, college, campus and program   *
				// *  show the base rules defined on sobcurr                    *
				// - CURR_PROGRAM_HELP   Trigger
				// *  key help for level, degree, college, campus and program   *
				// *  show the base rules defined on sobcurr                    *
				if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("LEVL"), toInt(1)).greater(0) )
				{
					getFormModel().getSCurriculumFields().setCurrProcess(GNls.Fget(toStr("SOQOLIB-0018"), toStr("FORM"), toStr("Level")));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_levl_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("COLL"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("College"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_coll_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("CAMP"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("Campus"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_camp_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("DEGC"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(toStr("Degree"));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_DEGC_lov"));
				}
				else if ( inStr(upper(getFormModel().getSCurriculumFields().getCurrProgramProcess()), toStr("PROGRAM"), toInt(1)).greater(0) ) {
					getFormModel().getSCurriculumFields().setCurrProcess(GNls.Fget(toStr("SOQOLIB-0019"), toStr("FORM"), toStr("Program")));
					getFormModel().getSCurriculumFields().setCurrLov(toStr("sobcurr_program_lov"));
				}
				setGlobal("SEL_IND", toStr(""));
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRuleInd().equals("Y") )
					{
						//   save the fields entered on the form to the curr fields 
						getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
						getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
						getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
						getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
						if ( inStr(getNameIn("curr_program_1_field"), toStr("*")).equals(1) )
						{
							getFormModel().getSCurrProcBlock().setCurrProgram(toStr(""));
						}
						else {
							getFormModel().getSCurrProcBlock().setCurrProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()));
						}
						//  message('module ' || :module_ind || ' lvl=' || :curr_levl_code 
						//   || ' col=' || :curr_coll_code || ' degc= ' || :curr_degc_code 
						//   ||  ' cm=' || :curr_camp_code || ' pg=' ||  :curr_program);
						getFormModel().getSCurrProcBlock().setCurrEffTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
						getFormModel().getSCurrProcBlock().setCurrCtlgTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()));
						if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
						{
							setLovTitle(getFormModel().getSCurriculumFields().getCurrLov(), "Change Curriculum");
						}
						else {
							setLovTitle(getFormModel().getSCurriculumFields().getCurrLov(), toStr("Base Curriculum Rules by ").append(getFormModel().getSCurriculumFields().getCurrProcess()));
						}
						setItemLovName(getNameIn("curr_program_process"), getFormModel().getSCurriculumFields().getCurrLov());
						getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						//  no select was made on lov, if curr changes was selected, put back the values 
						if ( getGlobal("SEL_IND").isNull() )
						{
							if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
							{
								goItem(getNameIn("curr_levl_1_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldLevel(),getNameIn("curr_levl_1_field"));
								goItem(getNameIn("curr_camp_1_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldCampus(),getNameIn("curr_camp_1_field"));
								goItem(getNameIn("curr_coll_1_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldCollege(),getNameIn("curr_coll_1_field"));
								goItem(getNameIn("curr_degc_1_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldDegree(),getNameIn("curr_degc_1_field"));
								goItem(getNameIn("curr_program_1_field"));
								copy(getFormModel().getSSobctrlBlock().getHoldProgram(),getNameIn("curr_program_1_field"));
							}
						}
						else {
							copy(getGlobal("CURR_RULE"),getNameIn("curr_rule_1_field"));
							if ( getFormModel().getSSobctrlBlock().getCurrChangeInd().equals("Y") )
							{
								executeAction("clear_currmajor_items");
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
							}
							goItem(getNameIn("curr_levl_1_field"));
							copy(getGlobal("LEVEL_CODE"),getNameIn("curr_levl_1_field"));
							goItem(getNameIn("curr_camp_1_field"));
							copy(getGlobal("CAMPUS"),getNameIn("curr_camp_1_field"));
							goItem(getNameIn("curr_coll_1_field"));
							copy(getGlobal("COLLEGE"),getNameIn("curr_coll_1_field"));
							goItem(getNameIn("curr_degc_1_field"));
							copy(getGlobal("DEGREE_CODE"),getNameIn("curr_degc_1_field"));
							if ( getGlobal("PROGRAM").isNull() )
							{
							}
							else {
								goItem(getNameIn("curr_program_1_field"));
								copy(getGlobal("PROGRAM"),getNameIn("curr_program_1_field"));
								nextItem();
							}
							executeAction("clear_currlov_items");
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				goItem(getNameIn("curr_program_process"));
				getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CHANGE
		 --- CURR_CHANGE   Trigger
if (:sobctrl_curr_rule_ind = 'Y' and :temp_rule_ind = 'N') or
       :sobctrl_curr_rule_ind = 'N' then
            execute_trigger('invalid_curr_msg');
            do_key('LIST_VALUES');
else
if :sobctrl_curr_rule_ind = 'Y' or :sobctrl_program_ind = 'Y'
 or :temp_rule_ind = 'Y' then
   declare 
      alert_button number;
   begin
      alert_button := show_alert('CURRICULUM_CHANGE');
      if alert_button = ALERT_BUTTON1 then
         :hold_program := name_in(:curr_program_1_field);
         :hold_level := name_in(:curr_levl_1_field);
         :hold_campus := name_in(:curr_camp_1_field);
         :hold_college := name_in(:curr_coll_1_field);
         :hold_degree := name_in(:curr_degc_1_field);
         :curr_change_ind := 'Y';
         copy('',name_in('curr_program_1_field'));
         copy('',name_in('curr_levl_1_field'));
         copy('',name_in('curr_camp_1_field'));
         copy('',name_in('curr_coll_1_field'));
         copy('',name_in('curr_degc_1_field'));
         copy('',name_in('curr_levl_desc'));
         copy('',name_in('curr_camp_desc'));
         copy('',name_in('curr_coll_desc'));
         copy('',name_in('curr_degc_desc'));

         <multilinecomment> this will go execute the trigger 'curr program help' </multilinecomment>
         do_key('HELP');
         :curr_change_ind := 'N';
      end if;
   end;
end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CHANGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CHANGE")
		public void Soqolib_CurrChange()
		{
			
				// - CURR_CHANGE   Trigger
				// - CURR_CHANGE   Trigger
				if ( (getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N")) || getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSSobctrlBlock().getSobctrlProgramInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRuleInd().equals("Y") )
					{
						{
							NNumber alertButton= NNumber.getNull();
							alertButton = toNumber(showAlert("CURRICULUM_CHANGE"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
								getFormModel().getSSobctrlBlock().setHoldProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()));
								getFormModel().getSSobctrlBlock().setHoldLevel(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
								getFormModel().getSSobctrlBlock().setHoldCampus(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
								getFormModel().getSSobctrlBlock().setHoldCollege(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
								getFormModel().getSSobctrlBlock().setHoldDegree(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("Y"));
								copy("",getNameIn("curr_program_1_field"));
								copy("",getNameIn("curr_levl_1_field"));
								copy("",getNameIn("curr_camp_1_field"));
								copy("",getNameIn("curr_coll_1_field"));
								copy("",getNameIn("curr_degc_1_field"));
								copy("",getNameIn("curr_levl_desc"));
								copy("",getNameIn("curr_camp_desc"));
								copy("",getNameIn("curr_coll_desc"));
								copy("",getNameIn("curr_degc_desc"));
								//  this will go execute the trigger 'curr program help' 
								executeAction("HELP");
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CHANGE2
		 --- CURR_CHANGE2   Trigger
if (:sobctrl_curr_rule_ind = 'Y' and :temp_rule_2_ind = 'N') or
       :sobctrl_curr_rule_ind = 'N' then
            execute_trigger('invalid_curr_msg');
            do_key('LIST_VALUES');
else
if :sobctrl_curr_rule_ind = 'Y' or :sobctrl_program_ind = 'Y' 
  or :temp_rule_2_ind = 'Y' then 
   declare 
      alert_button number;
   begin
      alert_button := show_alert('CURRICULUM_CHANGE');
      if alert_button = ALERT_BUTTON1 then
         :hold_program := name_in(:curr_program_2_field);
         :hold_level := name_in(:curr_levl_2_field);
         :hold_campus := name_in(:curr_camp_2_field);
         :hold_college := name_in(:curr_coll_2_field);
         :hold_degree := name_in(:curr_degc_2_field);
         :curr_change_ind := 'Y';
         copy('',name_in('curr_program_2_field'));
         copy('',name_in('curr_levl_2_field'));
         copy('',name_in('curr_camp_2_field'));
         copy('',name_in('curr_coll_2_field'));
         copy('',name_in('curr_degc_2_field'));
         <multilinecomment> this will go execute curr program help 2 trigger </multilinecomment>
         do_key('HELP');
         :curr_change_ind := 'N';
      end if;
   end;
end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CHANGE2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CHANGE2")
		public void Soqolib_CurrChange2()
		{
			
				// - CURR_CHANGE2   Trigger
				// - CURR_CHANGE2   Trigger
				if ( (getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N")) || getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") || getFormModel().getSSobctrlBlock().getSobctrlProgramInd().equals("Y") || getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("Y") )
					{
						{
							NNumber alertButton= NNumber.getNull();
							alertButton = toNumber(showAlert("CURRICULUM_CHANGE"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
								getFormModel().getSSobctrlBlock().setHoldProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()));
								getFormModel().getSSobctrlBlock().setHoldLevel(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
								getFormModel().getSSobctrlBlock().setHoldCampus(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
								getFormModel().getSSobctrlBlock().setHoldCollege(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
								getFormModel().getSSobctrlBlock().setHoldDegree(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("Y"));
								copy("",getNameIn("curr_program_2_field"));
								copy("",getNameIn("curr_levl_2_field"));
								copy("",getNameIn("curr_camp_2_field"));
								copy("",getNameIn("curr_coll_2_field"));
								copy("",getNameIn("curr_degc_2_field"));
								//  this will go execute curr program help 2 trigger 
								executeAction("HELP");
								getFormModel().getSSobctrlBlock().setCurrChangeInd(toStr("N"));
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MINOR_2_HELP
		 --- CURR_MIONOR_2_HELP   Trigger
<multilinecomment>  list attached minors </multilinecomment>
--
if :temp_rule_2_ind = 'N' then
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
else
     if :sobctrl_curr_rule_ind = 'Y' then
        execute_trigger('check_base2');
        if name_in(:curr_rule_2_field) is null then
           message( G$_NLS.Get('SOQOLIB-0020', 'FORM','No Base Curriculum Rule Established') );
        else
          :global.cmnr_rule := '';
          :hold_curr_rule := name_in(:curr_rule_2_field);
          :hold_term_ctlg := nvl(name_in(:curr_term_catlg_2_field),
                  name_in(:curr_term_field));
          if :minr2_attach_ind = 'Y' then
             set_item_property(name_in('curr_minr_field'),LOV_NAME,'STVMAJR_CURRMINR_LOV');
          else
             set_item_property(name_in('curr_minr_field'),LOV_NAME,'STVMAJR_MINR_LOV');
          end if;
          g$_display_lov('','');
          if :global.cmnr_rule is null then
             null;
          else
             if :global.cmnr_rule = name_in(:CURR_CMNR_RULE_FIELD) then
                 null;
             else
                copy(:global.cmnr_rule, name_in('CURR_CMNR_RULE_FIELD'));
             end if;
          end if;
          end if;
     else
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
    end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MINOR_2_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MINOR_2_HELP")
		public void Soqolib_CurrMinor2Help()
		{
			
				// - CURR_MIONOR_2_HELP   Trigger
				//   list attached minors 
				// 
				// - CURR_MIONOR_2_HELP   Trigger
				//   list attached minors 
				// 
				if ( getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						executeAction("check_base2");
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0020"), toStr("FORM"), toStr("No Base Curriculum Rule Established")));
						}
						else {
							setGlobal("CMNR_RULE", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							if ( getFormModel().getSSobctrlBlock().getMinr2AttachInd().equals("Y") )
							{
								setItemLovName(getNameIn("curr_minr_field"), "STVMAJR_CURRMINR_LOV");
							}
							else {
								setItemLovName(getNameIn("curr_minr_field"), "STVMAJR_MINR_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("CMNR_RULE").isNull() )
							{
							}
							else {
								if ( getGlobal("CMNR_RULE").equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmnrRuleField())) )
								{
								}
								else {
									copy(getGlobal("CMNR_RULE"),getNameIn("CURR_CMNR_RULE_FIELD"));
								}
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MINOR_HELP
		 --- CURR_MIONOR_HELP   Trigger
<multilinecomment>  list attached minors for primary curriculum </multilinecomment>
--
if :temp_rule_ind = 'N' then
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
else
     if :sobctrl_curr_rule_ind = 'Y' then

        execute_trigger('check_base');
  
        if name_in(:curr_rule_field) is null then
           message( G$_NLS.Get('SOQOLIB-0021', 'FORM','No Primary Base Curriculum Rule Established') );
        else
          :global.cmnr_rule := '';
          :hold_curr_rule := name_in(:curr_rule_field);
          :hold_term_ctlg := nvl(name_in(:curr_term_catlg_1_field),
                  name_in(:curr_term_field));
          if :minr1_attach_ind = 'Y' then
             set_item_property(name_in('curr_minr_field'),LOV_NAME,'STVMAJR_CURRMINR_LOV');
          else
             set_item_property(name_in('curr_minr_field'),LOV_NAME,'STVMAJR_MINR_LOV');
          end if;
          g$_display_lov('','');
          if :global.cmnr_rule is null then
             null;
          else
             if :global.cmnr_rule = name_in(:CURR_CMNR_RULE_FIELD) then
                 null;
             else
                copy(:global.cmnr_rule, name_in('CURR_CMNR_RULE_FIELD'));
             end if;
          end if;
          end if;
     else
      execute_trigger('invalid_curr_msg');
      do_key('LIST_VALUES');
    end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MINOR_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MINOR_HELP")
		public void Soqolib_CurrMinorHelp()
		{
			
				// - CURR_MIONOR_HELP   Trigger
				//   list attached minors for primary curriculum 
				// 
				// - CURR_MIONOR_HELP   Trigger
				//   list attached minors for primary curriculum 
				// 
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						executeAction("check_base");
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0021"), toStr("FORM"), toStr("No Primary Base Curriculum Rule Established")));
						}
						else {
							setGlobal("CMNR_RULE", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							if ( getFormModel().getSSobctrlBlock().getMinr1AttachInd().equals("Y") )
							{
								setItemLovName(getNameIn("curr_minr_field"), "STVMAJR_CURRMINR_LOV");
							}
							else {
								setItemLovName(getNameIn("curr_minr_field"), "STVMAJR_MINR_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("CMNR_RULE").isNull() )
							{
							}
							else {
								if ( getGlobal("CMNR_RULE").equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmnrRuleField())) )
								{
								}
								else {
									copy(getGlobal("CMNR_RULE"),getNameIn("CURR_CMNR_RULE_FIELD"));
								}
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MINOR_OPTIONS
		 --- CURR_MIONOR_OPTIONS   Trigger
<multilinecomment>  list attached minors for primary curriculum </multilinecomment>
--
:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0022', 'FORM','All Minor Codes') ;

 if :sobctrl_curr_rule_ind = 'Y' then
  
    execute_trigger('check_base');
 
    if name_in(:curr_rule_field) is not null then
     if :minr1_attach_ind = 'Y' then
        :curr_option_key2 := 'HELP';
        :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0023', 'FORM','Attached Minors') ;
     end if;
   end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MINOR_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MINOR_OPTIONS")
		public void Soqolib_CurrMinorOptions()
		{
			
				// - CURR_MIONOR_OPTIONS   Trigger
				//   list attached minors for primary curriculum 
				// 
				// - CURR_MIONOR_OPTIONS   Trigger
				//   list attached minors for primary curriculum 
				// 
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0022"), toStr("FORM"), toStr("All Minor Codes")));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					executeAction("check_base");
					if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
					{
						if ( getFormModel().getSSobctrlBlock().getMinr1AttachInd().equals("Y") )
						{
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0023"), toStr("FORM"), toStr("Attached Minors")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MINOR_OPTIONS2
		 --- CURR_MIONOR_OPTIONS2   Trigger
<multilinecomment>  list attached minors for secondary curriculum </multilinecomment>
--
:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0024', 'FORM','All Minor Codes') ;

 if :sobctrl_curr_rule_ind = 'Y' then
 
       execute_trigger('check_base2');
    
    if name_in(:curr_rule_2_field) is not null then
     if :minr2_attach_ind = 'Y' then
        :curr_option_key2 := 'HELP';
        :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0025', 'FORM','Attached Minors') ;
     end if;
   end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MINOR_OPTIONS2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MINOR_OPTIONS2")
		public void Soqolib_CurrMinorOptions2()
		{
			
				// - CURR_MIONOR_OPTIONS2   Trigger
				//   list attached minors for secondary curriculum 
				// 
				// - CURR_MIONOR_OPTIONS2   Trigger
				//   list attached minors for secondary curriculum 
				// 
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0024"), toStr("FORM"), toStr("All Minor Codes")));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					executeAction("check_base2");
					if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() )
					{
						if ( getFormModel().getSSobctrlBlock().getMinr2AttachInd().equals("Y") )
						{
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0025"), toStr("FORM"), toStr("Attached Minors")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MAJOR_HELP
		 --  CURR_MAJOR_HELP  trigger

G$_CHECK_FAILURE;
if :temp_rule_ind = 'N' then
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
else
   if :sobctrl_curr_rule_ind = 'Y' then
      if name_in(:curr_program_1_field) = '************' then
         null; 
      else
      
         execute_trigger('check_base');
       
      end if;
      
      if name_in(:curr_rule_1_field) is null 
       and name_in(:curr_program_1_field) <> '************' then
          message( G$_NLS.Get('SOQOLIB-0026', 'FORM','No Primary Base Curriculum Rule Established') );
      else
         :global.dept := '';
         :hold_curr_rule := name_in(:curr_rule_1_field);
         :hold_term_ctlg := nvl(name_in(:curr_term_catlg_1_field),
                  name_in(:curr_term_field));
         :hold_dept := name_in(:curr_dept_field);
         if name_in(:curr_program_1_field) =  '************'  then
            :curr_camp_code := name_in(:curr_camp_1_field);
            :curr_coll_code := name_in(:curr_coll_1_field);
            :curr_degc_code := name_in(:curr_degc_1_field);
            :curr_levl_code := name_in(:curr_levl_1_field);
            set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_PROGMAJR_LOV');   
         else   
            if :majr1_attach_ind = 'Y' then
              set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_CURRMAJR_LOV');
            else
              set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_MAJR_LOV');
            end if;
         end if;
         g$_display_lov('','');
     
         if :global.sel_ind = 'Y' and
            :global.curr_rule is not null and
            name_in(:curr_rule_1_field) is null then 
             copy(:global.curr_rule,name_in('curr_rule_1_field'));
             execute_trigger('check_program_major');
         end if;

         if :global.dept is null then
             null;
         else
            copy(:global.dept,name_in('curr_dept_field'));
            execute_trigger('curr_dept_desc');
         end if;   

    end if;
 else
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
 end if;
end if;
execute_trigger('clear_currlov_items');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MAJOR_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MAJOR_HELP")
		public void Soqolib_CurrMajorHelp()
		{
			
				//   CURR_MAJOR_HELP  trigger
				//   CURR_MAJOR_HELP  trigger
				getContainer().getGoqrpls().gCheckFailure();
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).equals("************") )
						{
						}
						else {
							executeAction("check_base");
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).notEquals("************") )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0026"), toStr("FORM"), toStr("No Primary Base Curriculum Rule Established")));
						}
						else {
							setGlobal("DEPT", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldDept(getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField()));
							if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).equals("************") )
							{
								getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
								getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
								getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
								getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
								setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_PROGMAJR_LOV");
							}
							else {
								if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("Y") )
								{
									setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_CURRMAJR_LOV");
								}
								else {
									setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_MAJR_LOV");
								}
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("SEL_IND").equals("Y") && !getGlobal("CURR_RULE").isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() )
							{
								copy(getGlobal("CURR_RULE"),getNameIn("curr_rule_1_field"));
								executeAction("check_program_major");
							}
							if ( getGlobal("DEPT").isNull() )
							{
							}
							else {
								copy(getGlobal("DEPT"),getNameIn("curr_dept_field"));
								executeAction("curr_dept_desc");
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				executeAction("clear_currlov_items");
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MAJOR_OPTIONS
		 --  CURR_MAJOR_OPTIONS  trigger

:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0027', 'FORM','All Major Codes') ;
if :temp_rule_ind <> 'N' then
   
   if :sobctrl_curr_rule_ind = 'Y' then
      if name_in(:curr_program_1_field) = '************' then
         null; 
      else
 
         execute_trigger('check_base');
  
      end if;

      if name_in(:curr_rule_1_field) is null 
       and name_in(:curr_program_1_field) <> '************' then
          null;
      else
         if name_in(:curr_program_1_field) =  '************'  then
            :curr_option_key2 := 'HELP';
            :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0028', 'FORM','Majors Att''d to Multiple Curricula') ;
         else   
            if :majr1_attach_ind = 'Y' then
               :curr_option_key2 := 'HELP';
               :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0029', 'FORM','Attached Majors/Departments') ;
            end if;
         end if;
        

    end if;
 
 end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MAJOR_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MAJOR_OPTIONS")
		public void Soqolib_CurrMajorOptions()
		{
			
				//   CURR_MAJOR_OPTIONS  trigger
				//   CURR_MAJOR_OPTIONS  trigger
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0027"), toStr("FORM"), toStr("All Major Codes")));
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().notEquals("N") )
				{
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).equals("************") )
						{
						}
						else {
							executeAction("check_base");
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).notEquals("************") )
						{
						}
						else {
							if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).equals("************") )
							{
								getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
								getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0028"), toStr("FORM"), toStr("Majors Att'd to Multiple Curricula")));
							}
							else {
								if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("Y") )
								{
									getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
									getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0029"), toStr("FORM"), toStr("Attached Majors/Departments")));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MAJOR_OPTIONS2
		 --  CURR_MAJOR_OPTIONS  trigger


:curr_option_key1 := 'LIST_VALUES';
:curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0030', 'FORM','All Major Codes') ;
if :temp_rule_ind <> 'N' then
   
   if :sobctrl_curr_rule_ind = 'Y' then
      if name_in(:curr_program_1_field) = '************' then
         null; 
      else
   
         execute_trigger('check_base2');
   
      end if;
      
      if name_in(:curr_rule_2_field) is null 
       and name_in(:curr_program_2_field) <> '************' then
          null;
      else
         if name_in(:curr_program_2_field) =  '************'  then
            :curr_option_key2 := 'HELP';
            :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0031', 'FORM','Majors Att''d to Multiple Curricula') ;
         else   
            if :majr2_attach_ind = 'Y' then
               :curr_option_key2 := 'HELP';
               :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0032', 'FORM','Attached Majors/Departments') ;
            end if;
         end if;
        

    end if;
 
 end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MAJOR_OPTIONS2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MAJOR_OPTIONS2")
		public void Soqolib_CurrMajorOptions2()
		{
			
				//   CURR_MAJOR_OPTIONS  trigger
				//   CURR_MAJOR_OPTIONS  trigger
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0030"), toStr("FORM"), toStr("All Major Codes")));
				if ( getFormModel().getSCurrProcBlock().getTempRuleInd().notEquals("N") )
				{
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).equals("************") )
						{
						}
						else {
							executeAction("check_base2");
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).notEquals("************") )
						{
						}
						else {
							if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).equals("************") )
							{
								getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
								getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0031"), toStr("FORM"), toStr("Majors Att'd to Multiple Curricula")));
							}
							else {
								if ( getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("Y") )
								{
									getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
									getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0032"), toStr("FORM"), toStr("Attached Majors/Departments")));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_MAJOR_2_HELP
		 --  CURR_MAJOR_2_HELP  trigger
<multilinecomment>  show attached majors for curriculum #2 </multilinecomment>
if :temp_rule_2_ind = 'N' then
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
else
   if :sobctrl_curr_rule_ind = 'Y' then
      if name_in(:curr_program_2_field) = '************' then
        null;
      else
        execute_trigger('check_base2');
      end if;
      if name_in(:curr_rule_2_field) is null 
       and name_in(:curr_program_2_field) <> '************' then
          message( G$_NLS.Get('SOQOLIB-0033', 'FORM','No Base Curriculum Rule Established') );
      else
         :global.dept := '';
         :hold_curr_rule := name_in(:curr_rule_2_field);
         :hold_term_ctlg := nvl(name_in(:curr_term_catlg_2_field),
                  name_in(:curr_term_field));
         :hold_dept := name_in(:curr_dept_field);
         if name_in(:curr_program_2_field) = '************' then
            :curr_camp_code := name_in(:curr_camp_2_field);
            :curr_coll_code := name_in(:curr_coll_2_field);
            :curr_degc_code := name_in(:curr_degc_2_field);
            :curr_levl_code := name_in(:curr_levl_2_field);
            set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_PROGMAJR_LOV');   
         else   
            if :majr2_attach_ind = 'Y' then
              set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_CURRMAJR_LOV');
            else
              set_item_property(name_in('curr_MAJR_field'),LOV_NAME,'STVMAJR_MAJR_LOV');
            end if;
         end if;
         g$_display_lov('','');
         if :global.sel_ind = 'Y' and
            :global.curr_rule is not null and 
            name_in(:curr_rule_2_field) is null then 
             copy(:global.curr_rule,name_in('curr_rule_2_field'));
             execute_trigger('check_program_2_major');
         end if;
         if :global.dept is null then
             null;
         else
            copy(:global.dept,name_in('curr_dept_field'));
            execute_trigger('curr_dept_desc');
         end if;
   
    end if;
 else
    execute_trigger('invalid_curr_msg');
    do_key('LIST_VALUES');
 end if;
end if;
execute_trigger('clear_currlov_items');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_MAJOR_2_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_MAJOR_2_HELP")
		public void Soqolib_CurrMajor2Help()
		{
			
				//   CURR_MAJOR_2_HELP  trigger
				//   show attached majors for curriculum #2 
				//   CURR_MAJOR_2_HELP  trigger
				//   show attached majors for curriculum #2 
				if ( getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).equals("************") )
						{
						}
						else {
							executeAction("check_base2");
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).notEquals("************") )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0033"), toStr("FORM"), toStr("No Base Curriculum Rule Established")));
						}
						else {
							setGlobal("DEPT", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field())));
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldDept(getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField()));
							if ( getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).equals("************") )
							{
								getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
								getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
								getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
								getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
								setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_PROGMAJR_LOV");
							}
							else {
								if ( getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("Y") )
								{
									setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_CURRMAJR_LOV");
								}
								else {
									setItemLovName(getNameIn("curr_MAJR_field"), "STVMAJR_MAJR_LOV");
								}
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("SEL_IND").equals("Y") && !getGlobal("CURR_RULE").isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() )
							{
								copy(getGlobal("CURR_RULE"),getNameIn("curr_rule_2_field"));
								executeAction("check_program_2_major");
							}
							if ( getGlobal("DEPT").isNull() )
							{
							}
							else {
								copy(getGlobal("DEPT"),getNameIn("curr_dept_field"));
								executeAction("curr_dept_desc");
							}
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				executeAction("clear_currlov_items");
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_MAJOR_RULE
		 --  CHECK_MAJOR_RULE  trigger
<multilinecomment>* check_major_rule routine called from concentration key help *</multilinecomment>
<multilinecomment>* this routine gets the major rule code for attached conc     *</multilinecomment>
declare 
  dept varchar2(30);
  majr varchar2(30);
  rule number;
  term varchar2(30);  

begin

if :majr1_attach_ind = 'N' and
   :majr2_attach_ind = 'N'      then
         return;
end if;

if :curr_upd_majr11 = 'Y' then   <multilinecomment> check for program 1, major 1 </multilinecomment>
       :hold_majr_rule := '';
       dept := name_in(:curr_dept_1_field);
       majr := name_in(:curr_majr_1_field);
       rule := name_in(:curr_rule_field);
       term := nvl(name_in(:curr_term_catlg_1_field),
               name_in(:curr_term_field));
       :hold_majr_rule := sokcurr.F_SorcmjrRule(rule,
                                               :majr1_attach_ind, 
                                               majr,
                                               dept,
                                               term, 
                                               :module_ind);
       if (:hold_majr_rule is not null and :hold_majr_rule > 0 ) then
            if :hold_majr_rule = name_in(:curr_cmjr_rule_field) then
                  null;
            else
                copy(to_char(:hold_majr_rule),name_in('curr_cmjr_rule_field')); 
            end if;
       else
         if :hold_majr_rule = 0 then
            copy('',name_in('curr_cmjr_rule_field'));
         end if;
       end if;
      
elsif :curr_upd_majr12 = 'Y' then   <multilinecomment> check for program 1, major 2 </multilinecomment>
      :hold_majr_rule := '';
       dept := name_in(:curr_dept_1_2_field);
       majr := name_in(:curr_majr_1_2_field);
       rule := name_in(:curr_rule_field);
       term := nvl(name_in(:curr_term_catlg_1_field),
               name_in(:curr_term_field));
       :hold_majr_rule := sokcurr.F_SorcmjrRule(rule,
                                               :majr1_attach_ind, 
                                               majr,
                                               dept,
                                               term, 
                                               :module_ind); 
      if (:hold_majr_rule is not null and :hold_majr_rule > 0 )  then
           if :hold_majr_rule = name_in(:curr_cmjr_rule_field_2) then
              null;
           else
              copy(to_char(:hold_majr_rule),name_in('curr_cmjr_rule_field_2'));
           end if;
       else
         if :hold_majr_rule = 0 then
            copy('',name_in('curr_cmjr_rule_field_2'));
         end if;
       end if;
  
elsif :curr_upd_majr21 = 'Y' then  <multilinecomment> check for program 2, major 1 </multilinecomment>
      :hold_majr_rule := '';
       dept := name_in(:curr_dept_2_field);
       majr := name_in(:curr_majr_2_field);
       rule := name_in(:curr_rule_field);
       term := nvl(name_in(:curr_term_catlg_2_field),
               name_in(:curr_term_field));
       :hold_majr_rule := sokcurr.F_SorcmjrRule(rule,
                                               :majr2_attach_ind, 
                                               majr,
                                               dept,
                                               term, 
                                               :module_ind);             
    if (:hold_majr_rule is not null and :hold_majr_rule > 0 )  then
           if :hold_majr_rule = name_in(:curr_cmjr_rule_field) then
                   null;
           else
                   copy(to_char(:hold_majr_rule),name_in('curr_cmjr_rule_field'));
           end if;
    else 
         if :hold_majr_rule = 0 then
            copy('',name_in('curr_cmjr_rule_field'));
         end if;
    end if;
 
elsif :curr_upd_majr22 = 'Y' then  <multilinecomment> check for program 2, major 2 </multilinecomment>
      :hold_majr_rule := '';
       dept := name_in(:curr_dept_2_2_field);
       majr := name_in(:curr_majr_2_2_field);
       rule := name_in(:curr_rule_field);
       term := nvl(name_in(:curr_term_catlg_2_field),
               name_in(:curr_term_field));
       :hold_majr_rule := sokcurr.F_SorcmjrRule(rule,
                                               :majr2_attach_ind, 
                                               majr,
                                               dept,
                                               term, 
                                               :module_ind);    
    if (:hold_majr_rule is not null and :hold_majr_rule > 0 ) then
          if :hold_majr_rule = name_in(:curr_cmjr_rule_field_2) then
                 null;
          else
                copy(to_char(:hold_majr_rule),name_in('curr_cmjr_rule_field_2'));
           end if;
    else
         if :hold_majr_rule = 0 then
            copy('',name_in('curr_cmjr_rule_field_2'));
         end if;
    end if;
  
end if;

end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_MAJOR_RULE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_MAJOR_RULE")
		public void Soqolib_CheckMajorRule()
		{
			
				//   CHECK_MAJOR_RULE  trigger
				// * check_major_rule routine called from concentration key help *
				// * this routine gets the major rule code for attached conc     *
				{
					NString dept= NString.getNull();
					NString majr= NString.getNull();
					NNumber rule= NNumber.getNull();
					NString term= NString.getNull();
					if ( getFormModel().getSSobctrlBlock().getMajr1AttachInd().equals("N") && getFormModel().getSSobctrlBlock().getMajr2AttachInd().equals("N") )
					{
						return ;
					}
					if ( getFormModel().getSCurriculumChange().getCurrUpdMajr11().equals("Y") )
					{
						//  check for program 1, major 1 
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(""));
						dept = getNameIn(getFormModel().getSCurriculumFields().getCurrDept1Field());
						majr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajr1Field());
						rule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						term = isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldMajrRule(Sokcurr.fSorcmjrrule(rule, getFormModel().getSSobctrlBlock().getMajr1AttachInd(), majr, dept, term, getFormModel().getSCurrProcBlock().getModuleInd()));
						if ((!getFormModel().getSCurrProcBlock().getHoldMajrRule().isNull() && getFormModel().getSCurrProcBlock().getHoldMajrRule().greater(0)))
						{
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())) )
							{
							}
							else {
								copy(toChar(getFormModel().getSCurrProcBlock().getHoldMajrRule()),getNameIn("curr_cmjr_rule_field"));
							}
						}
						else {
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(0) )
							{
								copy("",getNameIn("curr_cmjr_rule_field"));
							}
						}
					}
					else if ( getFormModel().getSCurriculumChange().getCurrUpdMajr12().equals("Y") ) {
						//  check for program 1, major 2 
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(""));
						dept = getNameIn(getFormModel().getSCurriculumFields().getCurrDept12Field());
						majr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajr12Field());
						rule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						term = isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldMajrRule(Sokcurr.fSorcmjrrule(rule, getFormModel().getSSobctrlBlock().getMajr1AttachInd(), majr, dept, term, getFormModel().getSCurrProcBlock().getModuleInd()));
						if ((!getFormModel().getSCurrProcBlock().getHoldMajrRule().isNull() && getFormModel().getSCurrProcBlock().getHoldMajrRule().greater(0)))
						{
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField2())) )
							{
							}
							else {
								copy(toChar(getFormModel().getSCurrProcBlock().getHoldMajrRule()),getNameIn("curr_cmjr_rule_field_2"));
							}
						}
						else {
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(0) )
							{
								copy("",getNameIn("curr_cmjr_rule_field_2"));
							}
						}
					}
					else if ( getFormModel().getSCurriculumChange().getCurrUpdMajr21().equals("Y") ) {
						//  check for program 2, major 1 
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(""));
						dept = getNameIn(getFormModel().getSCurriculumFields().getCurrDept2Field());
						majr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajr2Field());
						rule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						term = isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldMajrRule(Sokcurr.fSorcmjrrule(rule, getFormModel().getSSobctrlBlock().getMajr2AttachInd(), majr, dept, term, getFormModel().getSCurrProcBlock().getModuleInd()));
						if ((!getFormModel().getSCurrProcBlock().getHoldMajrRule().isNull() && getFormModel().getSCurrProcBlock().getHoldMajrRule().greater(0)))
						{
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())) )
							{
							}
							else {
								copy(toChar(getFormModel().getSCurrProcBlock().getHoldMajrRule()),getNameIn("curr_cmjr_rule_field"));
							}
						}
						else {
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(0) )
							{
								copy("",getNameIn("curr_cmjr_rule_field"));
							}
						}
					}
					else if ( getFormModel().getSCurriculumChange().getCurrUpdMajr22().equals("Y") ) {
						//  check for program 2, major 2 
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(""));
						dept = getNameIn(getFormModel().getSCurriculumFields().getCurrDept22Field());
						majr = getNameIn(getFormModel().getSCurriculumFields().getCurrMajr22Field());
						rule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()));
						term = isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldMajrRule(Sokcurr.fSorcmjrrule(rule, getFormModel().getSSobctrlBlock().getMajr2AttachInd(), majr, dept, term, getFormModel().getSCurrProcBlock().getModuleInd()));
						if ((!getFormModel().getSCurrProcBlock().getHoldMajrRule().isNull() && getFormModel().getSCurrProcBlock().getHoldMajrRule().greater(0)))
						{
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField2())) )
							{
							}
							else {
								copy(toChar(getFormModel().getSCurrProcBlock().getHoldMajrRule()),getNameIn("curr_cmjr_rule_field_2"));
							}
						}
						else {
							if ( getFormModel().getSCurrProcBlock().getHoldMajrRule().equals(0) )
							{
								copy("",getNameIn("curr_cmjr_rule_field_2"));
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CONC_OPTIONS
		 --  CURR_CONC_OPTIONS  trigger
--   option titles attached concentrations for first major 
  :curr_option_key1 := 'LIST_VALUES';
  :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0034', 'FORM','All Concentration Codes') ; 
 
  if :sobctrl_curr_rule_ind = 'Y' then
     if :curr_base_check = '1' then 
          execute_trigger('check_base');
    else 
          execute_trigger('check_base2');
    end if;
    execute_trigger('check_major_rule');
   
    if name_in(:curr_rule_field) is not null then
      :hold_term_ctlg := nvl(name_in(:curr_term_catlg_field),name_in(:curr_term_field));
      :hold_eff_term  := name_in(:curr_term_field);
      :hold_curr_rule := name_in(:curr_rule_field);
      :hold_majr_rule := name_in(:curr_cmjr_rule_field);
      :cai := nvl(sokcurr.F_ConcAttach(:hold_curr_rule, :hold_majr_rule,
                                        :hold_term_ctlg,
                                       :module_ind),'NN');
      
      if (substr(:cai,1,1) = 'Y' or substr(:cai,2,1) = 'Y' ) then   
          <multilinecomment> show attached conc to base rule and major </multilinecomment>          
          :curr_option_key2 := 'HELP';
          :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0035', 'FORM','Attached Concentrations') ; 
      end if;
   end if;
  end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CONC_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CONC_OPTIONS")
		public void Soqolib_CurrConcOptions()
		{
			
				//   CURR_CONC_OPTIONS  trigger
				//    option titles attached concentrations for first major 
				//   CURR_CONC_OPTIONS  trigger
				//    option titles attached concentrations for first major 
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0034"), toStr("FORM"), toStr("All Concentration Codes")));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
					{
						executeAction("check_base");
					}
					else {
						executeAction("check_base2");
					}
					executeAction("check_major_rule");
					if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
					{
						getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlgField()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
						getFormModel().getSCurrProcBlock().setHoldEffTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())));
						getFormModel().getSSobctrlBlock().setCai(isNull(Sokcurr.fConcattach(getFormModel().getSCurrProcBlock().getHoldCurrRule(), getFormModel().getSCurrProcBlock().getHoldMajrRule(), getFormModel().getSCurrProcBlock().getHoldTermCtlg(), getFormModel().getSCurrProcBlock().getModuleInd()), "NN"));
						if ((substring(getFormModel().getSSobctrlBlock().getCai(), toInt(1), toInt(1)).equals("Y") || substring(getFormModel().getSSobctrlBlock().getCai(), toInt(2), toInt(1)).equals("Y")))
						{
							//  show attached conc to base rule and major 
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0035"), toStr("FORM"), toStr("Attached Concentrations")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CONC_HELP
		 --  CURR_CONC_OPTIONS  trigger
--   option titles for  concentrations for first major 
if (:temp_rule_ind = 'N' and :curr_base_check = '1' )or
   (:temp_rule_2_ind = 'N' and :curr_base_check = '2' )then
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
else
  if :sobctrl_curr_rule_ind = 'Y' then
    
    if name_in(:curr_majr_field) is null and
       name_in(:curr_dept_field) is null then
       message( G$_NLS.Get('SOQOLIB-0036', 'FORM','You Must Establish a Major/Department Combination.') );
       go_item(name_in('curr_majr_field'));
       do_key('HELP');
       return;
    else
       if :curr_base_check = '1' then 
          execute_trigger('check_base');
       else 
          execute_trigger('check_base2');
       end if;

       execute_trigger('check_major_rule');
    end if;
    
    if name_in(:curr_rule_field) is null then
       message( G$_NLS.Get('SOQOLIB-0037', 'FORM','No Primary Base Curriculum Established.') );
    else
      :hold_term_ctlg := nvl(name_in(:curr_term_catlg_field),name_in(:curr_term_field));
      :hold_eff_term  := name_in(:curr_term_field);
      :hold_curr_rule := name_in(:curr_rule_field);
      :hold_majr_rule := name_in(:curr_cmjr_rule_field);
      :cai := nvl(sokcurr.F_ConcAttach(:hold_curr_rule, :hold_majr_rule,:hold_term_ctlg,
                                       :module_ind),'NN');
      if (substr(:cai,1,1) = 'Y' or substr(:cai,2,1) = 'Y' ) then   
          <multilinecomment> show attached conc to base rule and major </multilinecomment>          
          set_item_property(name_in('CURR_CONC_FIELD'),LOV_NAME,'STVMAJR_CURR_CONC_LOV'); 
      else  
          <multilinecomment> curr rule does not have attached concentrations </multilinecomment>
          set_item_property(name_in('CURR_CONC_FIELD'),LOV_NAME,'STVMAJR_CONC_LOV');
      end if;
      g$_display_lov('','');
   end if;
 else
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
 end if;
end if;
execute_trigger('clear_currlov_items');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CONC_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CONC_HELP")
		public void Soqolib_CurrConcHelp()
		{
			
				//   CURR_CONC_OPTIONS  trigger
				//    option titles for  concentrations for first major 
				//   CURR_CONC_OPTIONS  trigger
				//    option titles for  concentrations for first major 
				if ( (getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") && getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1")) || (getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") && getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("2")) )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField()).isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0036"), toStr("FORM"), toStr("You Must Establish a Major/Department Combination.")));
							goItem(getNameIn("curr_majr_field"));
							executeAction("HELP");
							return ;
						}
						else {
							if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
							{
								executeAction("check_base");
							}
							else {
								executeAction("check_base2");
							}
							executeAction("check_major_rule");
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0037"), toStr("FORM"), toStr("No Primary Base Curriculum Established.")));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlgField()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldEffTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
							getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())));
							getFormModel().getSSobctrlBlock().setCai(isNull(Sokcurr.fConcattach(getFormModel().getSCurrProcBlock().getHoldCurrRule(), getFormModel().getSCurrProcBlock().getHoldMajrRule(), getFormModel().getSCurrProcBlock().getHoldTermCtlg(), getFormModel().getSCurrProcBlock().getModuleInd()), "NN"));
							if ((substring(getFormModel().getSSobctrlBlock().getCai(), toInt(1), toInt(1)).equals("Y") || substring(getFormModel().getSSobctrlBlock().getCai(), toInt(2), toInt(1)).equals("Y")))
							{
								//  show attached conc to base rule and major 
								setItemLovName(getNameIn("CURR_CONC_FIELD"), "STVMAJR_CURR_CONC_LOV");
							}
							else {
								//  curr rule does not have attached concentrations 
								setItemLovName(getNameIn("CURR_CONC_FIELD"), "STVMAJR_CONC_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				executeAction("clear_currlov_items");
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CONC_2_HELP
		 --  CURR_CONC2_HELP  trigger
--   list lov for attached concentrations on second major 
if (:temp_rule_ind = 'N' and :curr_base_check = '1' )or
   (:temp_rule_2_ind = 'N' and :curr_base_check = '2' )then
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
else
  if :sobctrl_curr_rule_ind = 'Y' then
    if name_in(:curr_majr_field_2) is null and
       name_in(:curr_dept_field_2) is null then
      <multilinecomment>  allow concentration to be attached  to major 1 </multilinecomment>
      if name_in(:curr_majr_field) is null and
         name_in(:curr_dept_field) is null then 
          message( G$_NLS.Get('SOQOLIB-0038', 'FORM','You Must Establish a Major/Department Combination.') );
          go_item(name_in('curr_majr_field'));
          do_key('HELP');
          return;
      else 
         <multilinecomment>look up the rules so that we can show correct conc on lov </multilinecomment>
          if :curr_base_check = '1' then 
             execute_trigger('check_base');
          else 
             execute_trigger('check_base2');
          end if;
          copy('Y',name_in('curr_upd_majr_field'));
          execute_trigger('check_major_rule');
          :hold_majr_rule := name_in(:curr_cmjr_rule_field);
       end if;
    else
       if :curr_base_check = '1' then 
          execute_trigger('check_base');
       else 
          execute_trigger('check_base2');
       end if;
       copy('',name_in('curr_upd_majr_field'));
       copy('Y',name_in('curr_upd_majr_field_2'));
       execute_trigger('check_major_rule');
       :hold_majr_rule := name_in(:curr_cmjr_rule_field_2);
    end if;
    if name_in(:curr_rule_field) is null then
       message( G$_NLS.Get('SOQOLIB-0039', 'FORM','No Base Curriculum Established.') );
    else
      :hold_term_ctlg := nvl(name_in(:curr_term_catlg_field),name_in(:curr_term_field));
      :hold_eff_term  := name_in(:curr_term_field);
      :hold_curr_rule := name_in(:curr_rule_field);
      :cai := nvl(sokcurr.F_ConcAttach(:hold_curr_rule, :hold_majr_rule,:hold_term_ctlg,
                                       :module_ind),'NN');
      if (substr(:cai,1,1) = 'Y' or substr(:cai,2,1) = 'Y' ) then             
          set_item_property(name_in('CURR_CONC_FIELD'),LOV_NAME,'STVMAJR_CURR_CONC_LOV'); 
      else  
          set_item_property(name_in('CURR_CONC_FIELD'),LOV_NAME,'STVMAJR_CONC_LOV');
      end if;
      g$_display_lov('','');
   end if;
 else
   execute_trigger('invalid_curr_msg');
   do_key('LIST_VALUES');
 end if;
end if;
execute_trigger('clear_currlov_items');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CONC_2_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CONC_2_HELP")
		public void Soqolib_CurrConc2Help()
		{
			
				//   CURR_CONC2_HELP  trigger
				//    list lov for attached concentrations on second major 
				//   CURR_CONC2_HELP  trigger
				//    list lov for attached concentrations on second major 
				if ( (getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") && getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1")) || (getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") && getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("2")) )
				{
					executeAction("invalid_curr_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
					{
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField2()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField2()).isNull() )
						{
							//   allow concentration to be attached  to major 1 
							if ( getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField()).isNull() )
							{
								errorMessage(GNls.Fget(toStr("SOQOLIB-0038"), toStr("FORM"), toStr("You Must Establish a Major/Department Combination.")));
								goItem(getNameIn("curr_majr_field"));
								executeAction("HELP");
								return ;
							}
							else {
								// look up the rules so that we can show correct conc on lov 
								if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
								{
									executeAction("check_base");
								}
								else {
									executeAction("check_base2");
								}
								copy("Y",getNameIn("curr_upd_majr_field"));
								executeAction("check_major_rule");
								getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())));
							}
						}
						else {
							if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
							{
								executeAction("check_base");
							}
							else {
								executeAction("check_base2");
							}
							copy("",getNameIn("curr_upd_majr_field"));
							copy("Y",getNameIn("curr_upd_majr_field_2"));
							executeAction("check_major_rule");
							getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField2())));
						}
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0039"), toStr("FORM"), toStr("No Base Curriculum Established.")));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlgField()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
							getFormModel().getSCurrProcBlock().setHoldEffTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
							getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
							getFormModel().getSSobctrlBlock().setCai(isNull(Sokcurr.fConcattach(getFormModel().getSCurrProcBlock().getHoldCurrRule(), getFormModel().getSCurrProcBlock().getHoldMajrRule(), getFormModel().getSCurrProcBlock().getHoldTermCtlg(), getFormModel().getSCurrProcBlock().getModuleInd()), "NN"));
							if ((substring(getFormModel().getSSobctrlBlock().getCai(), toInt(1), toInt(1)).equals("Y") || substring(getFormModel().getSSobctrlBlock().getCai(), toInt(2), toInt(1)).equals("Y")))
							{
								setItemLovName(getNameIn("CURR_CONC_FIELD"), "STVMAJR_CURR_CONC_LOV");
							}
							else {
								setItemLovName(getNameIn("CURR_CONC_FIELD"), "STVMAJR_CONC_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						}
					}
					else {
						executeAction("invalid_curr_msg");
						executeAction("LIST_VALUES");
					}
				}
				executeAction("clear_currlov_items");
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_CONC_2_OPTIONS
		 --  CURR_CONC_2_OPTIONS  trigger
--   Option titles for attached concentrations on second major 
  :curr_option_key1 := 'LIST_VALUES';
  :curr_option_title1 :=  G$_NLS.Get('SOQOLIB-0040', 'FORM','All Concentration Codes') ; 
  if :sobctrl_curr_rule_ind = 'Y' then
    if name_in(:curr_majr_field_2) is null and
       name_in(:curr_dept_field_2) is null then
      <multilinecomment>  allow concentration to be attached  to major 1 </multilinecomment>
      if name_in(:curr_majr_field) is null and
         name_in(:curr_dept_field) is null then 
          message( G$_NLS.Get('SOQOLIB-0041', 'FORM','You Must Establish a Major/Department Combination.') );
          go_item(name_in('curr_majr_field'));
      else 
         <multilinecomment>look up the rules so that we can show correct conc on lov </multilinecomment>
          if :curr_base_check = '1' then 
             execute_trigger('check_base');
          else 
             execute_trigger('check_base2');
          end if;
          copy('Y',name_in('curr_upd_majr_field'));
          execute_trigger('check_major_rule');
          :hold_majr_rule := name_in(:curr_cmjr_rule_field);
       end if;
    else
       if :curr_base_check = '1' then 
          execute_trigger('check_base');
       else 
          execute_trigger('check_base2');
       end if;
       copy('',name_in('curr_upd_majr_field'));
       copy('Y',name_in('curr_upd_majr_field_2'));
       execute_trigger('check_major_rule');
       :hold_majr_rule := name_in(:curr_cmjr_rule_field_2);
    end if;
    if name_in(:curr_rule_field) is not null then
      :hold_term_ctlg := nvl(name_in(:curr_term_catlg_field),name_in(:curr_term_field));
      :hold_eff_term  := name_in(:curr_term_field);
      :hold_curr_rule := name_in(:curr_rule_field);
      :cai := nvl(sokcurr.F_ConcAttach(:hold_curr_rule, :hold_majr_rule,:hold_term_ctlg,
                                       :module_ind),'NN');
      if (substr(:cai,1,1) = 'Y' or substr(:cai,2,1) = 'Y' ) then             
         :curr_option_key2 := 'HELP';
         :curr_option_title2 :=  G$_NLS.Get('SOQOLIB-0042', 'FORM','Attached Concentrations') ; 
      end if;
   end if;
 end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_CONC_2_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_CONC_2_OPTIONS")
		public void Soqolib_CurrConc2Options()
		{
			
				//   CURR_CONC_2_OPTIONS  trigger
				//    Option titles for attached concentrations on second major 
				//   CURR_CONC_2_OPTIONS  trigger
				//    Option titles for attached concentrations on second major 
				getFormModel().getSCurriculumFields().setCurrOptionKey1(toStr("LIST_VALUES"));
				getFormModel().getSCurriculumFields().setCurrOptionTitle1(GNls.Fget(toStr("SOQOLIB-0040"), toStr("FORM"), toStr("All Concentration Codes")));
				if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("Y") )
				{
					if ( getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField2()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField2()).isNull() )
					{
						//   allow concentration to be attached  to major 1 
						if ( getNameIn(getFormModel().getSCurriculumFields().getCurrMajrField()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrDeptField()).isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0041"), toStr("FORM"), toStr("You Must Establish a Major/Department Combination.")));
							goItem(getNameIn("curr_majr_field"));
						}
						else {
							// look up the rules so that we can show correct conc on lov 
							if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
							{
								executeAction("check_base");
							}
							else {
								executeAction("check_base2");
							}
							copy("Y",getNameIn("curr_upd_majr_field"));
							executeAction("check_major_rule");
							getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField())));
						}
					}
					else {
						if ( getFormModel().getSCurriculumFields().getCurrBaseCheck().equals("1") )
						{
							executeAction("check_base");
						}
						else {
							executeAction("check_base2");
						}
						copy("",getNameIn("curr_upd_majr_field"));
						copy("Y",getNameIn("curr_upd_majr_field_2"));
						executeAction("check_major_rule");
						getFormModel().getSCurrProcBlock().setHoldMajrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrCmjrRuleField2())));
					}
					if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField()).isNull() )
					{
						getFormModel().getSCurrProcBlock().setHoldTermCtlg(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlgField()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
						getFormModel().getSCurrProcBlock().setHoldEffTerm(getNameIn(getFormModel().getSCurriculumFields().getCurrTermField()));
						getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRuleField())));
						getFormModel().getSSobctrlBlock().setCai(isNull(Sokcurr.fConcattach(getFormModel().getSCurrProcBlock().getHoldCurrRule(), getFormModel().getSCurrProcBlock().getHoldMajrRule(), getFormModel().getSCurrProcBlock().getHoldTermCtlg(), getFormModel().getSCurrProcBlock().getModuleInd()), "NN"));
						if ((substring(getFormModel().getSSobctrlBlock().getCai(), toInt(1), toInt(1)).equals("Y") || substring(getFormModel().getSSobctrlBlock().getCai(), toInt(2), toInt(1)).equals("Y")))
						{
							getFormModel().getSCurriculumFields().setCurrOptionKey2(toStr("HELP"));
							getFormModel().getSCurriculumFields().setCurrOptionTitle2(GNls.Fget(toStr("SOQOLIB-0042"), toStr("FORM"), toStr("Attached Concentrations")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM
		 --  CHECK_PROGRAM  trigger
<multilinecomment> check_program trigger
   this is called the post text triggers on the level,
   campus, college, degree fields.  This trigger tries 
   to derive the program based on codes entered on field.  </multilinecomment>

:curr_camp_code := name_in(:curr_camp_1_field);
:curr_coll_code := name_in(:curr_coll_1_field);
:curr_degc_code := name_in(:curr_degc_1_field);
:curr_levl_code := name_in(:curr_levl_1_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));

declare
  temp_rule number;
  temp_rule_out number;
  temp_program varchar2(30);
  temp_program_in varchar2(30);
  temp_degree varchar2(30);
  temp_campus varchar2(30);
  temp_level  varchar2(30);
  temp_college varchar2(30);
  temp_desc varchar(50);
begin
    if name_in(:curr_rule_1_field) is not null then 
       temp_rule := name_in(:curr_rule_1_field);
    else 
       temp_rule := null;
    end if;
    if name_in(:curr_program_1_field) is not null and 
       name_in(:curr_program_1_field) <> '************' then 
       temp_program_in := name_in(:curr_program_1_field);
    else 
       temp_program_in := null;
    end if;
    select sobcurr_program, sobcurr_levl_code, sobcurr_camp_code,
      sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule
    into temp_program, temp_level, temp_campus, temp_college, 
       temp_degree, temp_rule_out
    from sobcurr x
    where  ( ( x.sobcurr_curr_rule = temp_rule) or
        (   temp_rule is null
         and (( :curr_levl_code is not null
                or :curr_coll_code is not null
                or :curr_camp_code is not null
                or :curr_degc_code is not null)
        and ( x.sobcurr_levl_code = :curr_levl_code
           or :curr_levl_code is null)
        and ((:curr_coll_code is null)
           or (x.sobcurr_coll_code = :curr_coll_code))
        and ((:curr_degc_code is null)
           or (x.sobcurr_degc_code = :curr_degc_code))
        and (( :curr_camp_code is null)
          or (x.sobcurr_camp_code = :curr_camp_code)  )
        and (( temp_program_in is null)
          or (x.sobcurr_program  = temp_program_in)  ) )
        or (x.sobcurr_program = temp_program_in and temp_program_in is not null
           and :curr_levl_code is null and :curr_coll_code is null
           and :curr_camp_code is null and :curr_degc_code is null)  ))
    and sobcurr_lock_ind = 'Y'
    and sobcurr_term_code_init <= :curr_ctlg_term
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));

  
     copy(temp_program,name_in('curr_program_1_field'));
     copy(to_char(temp_rule_out),name_in('curr_rule_1_field'));
  
     if :curr_levl_code is null and temp_level is not null then 
        copy(temp_level,name_in('curr_levl_1_field'));
        select stvlevl_desc into temp_desc
        from stvlevl where stvlevl_code = temp_level;
        copy(temp_desc,name_in('curr_levl_desc'));
     end if;
   
     if :curr_coll_code is null and temp_college is not null then 
        copy(temp_college,name_in('curr_coll_1_field'));
        select stvcoll_desc into temp_desc
        from stvcoll where stvcoll_code = temp_college;
        copy(temp_desc,name_in('curr_coll_desc'));    
     end if;
     
     if :curr_camp_code is null and temp_campus is not null then 
        copy(temp_campus,name_in('curr_camp_1_field'));
        select stvcamp_desc into temp_desc
        from stvcamp where stvcamp_code = temp_campus;
        copy(temp_desc,name_in('curr_camp_desc'));
     end if;
  
     if :curr_degc_code is null and temp_degree is not null then 
        copy(temp_degree,name_in('curr_degc_1_field'));
        select stvdegc_desc into temp_desc
        from stvdegc where stvdegc_code = temp_degree;
        copy(temp_desc,name_in('curr_degc_desc'));
     end if;
    
     if name_in(:curr_rule_1_field) is not null and
        name_in(:curr_rule_1_field) <> 0 and 
       (name_in(:curr_majr_1_field) is null OR 
        name_in(:curr_majr_1_field) = '0000') then         
          execute_trigger('curr_default_major');
      end if;

exception
   when no_data_found then
        execute_trigger('check_lock');
        if :curr_lock_ind = 'N' then 
             execute_trigger('curr_lock_message');
        end if;
   when too_many_rows then

    if :curr_degc_code is null and 
      :curr_camp_code is null and 
      :curr_levl_code  is null and 
      :curr_coll_code is null  then 
       copy('',name_in('curr_program_1_field'));
    else 
        copy('************',name_in('curr_program_1_field'));
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM")
		public void Soqolib_CheckProgram()
		{
			
				//   CHECK_PROGRAM  trigger
				//  check_program trigger
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  
				int rowCount = 0;
				//   CHECK_PROGRAM  trigger
				//  check_program trigger
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NNumber tempRule= NNumber.getNull();
					NNumber tempRuleOut= NNumber.getNull();
					NString tempProgram= NString.getNull();
					NString tempProgramIn= NString.getNull();
					NString tempDegree= NString.getNull();
					NString tempCampus= NString.getNull();
					NString tempLevel= NString.getNull();
					NString tempCollege= NString.getNull();
					NString tempDesc= NString.getNull();
					try
					{
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() )
						{
							tempRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()));
						}
						else {
							tempRule = toNumber(null);
						}
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()).notEquals("************") )
						{
							tempProgramIn = getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field());
						}
						else {
							tempProgramIn = toStr(null);
						}
						String sql1 = "SELECT sobcurr_program, sobcurr_levl_code, sobcurr_camp_code, sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE) OR (:P_TEMP_RULE IS NULL AND ((:CURR_LEVL_CODE IS NOT NULL OR :CURR_COLL_CODE IS NOT NULL OR :CURR_CAMP_CODE IS NOT NULL OR :CURR_DEGC_CODE IS NOT NULL) AND (x.sobcurr_levl_code = :CURR_LEVL_CODE OR :CURR_LEVL_CODE IS NULL) AND ((:CURR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :CURR_COLL_CODE)) AND ((:CURR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :CURR_DEGC_CODE)) AND ((:CURR_CAMP_CODE IS NULL) OR (x.sobcurr_camp_code = :CURR_CAMP_CODE)) AND ((:P_TEMP_PROGRAM_IN IS NULL) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN))) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN AND :P_TEMP_PROGRAM_IN IS NOT NULL AND :CURR_LEVL_CODE IS NULL AND :CURR_COLL_CODE IS NULL AND :CURR_CAMP_CODE IS NULL AND :CURR_DEGC_CODE IS NULL))) AND sobcurr_lock_ind = 'Y' AND sobcurr_term_code_init <= :CURR_CTLG_TERM AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("P_TEMP_PROGRAM_IN", tempProgramIn);
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempLevel = results1.getStr(1);
							tempCampus = results1.getStr(2);
							tempCollege = results1.getStr(3);
							tempDegree = results1.getStr(4);
							tempRuleOut = results1.getNumber(5);
						}
						results1.close();
						copy(tempProgram,getNameIn("curr_program_1_field"));
						copy(toChar(tempRuleOut),getNameIn("curr_rule_1_field"));
						if ( getFormModel().getSCurrProcBlock().getCurrLevlCode().isNull() && !tempLevel.isNull() )
						{
							copy(tempLevel,getNameIn("curr_levl_1_field"));
							String sql2 = "SELECT stvlevl_desc " +
	" FROM stvlevl " +
	" WHERE stvlevl_code = :P_TEMP_LEVEL ";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("P_TEMP_LEVEL", tempLevel);
							ResultSet results2 = command2.executeQuery();
							rowCount = command2.getRowCount();
							if ( results2.hasData() ) {
								tempDesc = results2.getStr(0);
							}
							results2.close();
							copy(tempDesc,getNameIn("curr_levl_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrCollCode().isNull() && !tempCollege.isNull() )
						{
							copy(tempCollege,getNameIn("curr_coll_1_field"));
							String sql3 = "SELECT stvcoll_desc " +
	" FROM stvcoll " +
	" WHERE stvcoll_code = :P_TEMP_COLLEGE ";
							DataCommand command3 = new DataCommand(sql3);
							//Setting query parameters
							command3.addParameter("P_TEMP_COLLEGE", tempCollege);
							ResultSet results3 = command3.executeQuery();
							rowCount = command3.getRowCount();
							if ( results3.hasData() ) {
								tempDesc = results3.getStr(0);
							}
							results3.close();
							copy(tempDesc,getNameIn("curr_coll_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrCampCode().isNull() && !tempCampus.isNull() )
						{
							copy(tempCampus,getNameIn("curr_camp_1_field"));
							String sql4 = "SELECT stvcamp_desc " +
	" FROM stvcamp " +
	" WHERE stvcamp_code = :P_TEMP_CAMPUS ";
							DataCommand command4 = new DataCommand(sql4);
							//Setting query parameters
							command4.addParameter("P_TEMP_CAMPUS", tempCampus);
							ResultSet results4 = command4.executeQuery();
							rowCount = command4.getRowCount();
							if ( results4.hasData() ) {
								tempDesc = results4.getStr(0);
							}
							results4.close();
							copy(tempDesc,getNameIn("curr_camp_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrDegcCode().isNull() && !tempDegree.isNull() )
						{
							copy(tempDegree,getNameIn("curr_degc_1_field"));
							String sql5 = "SELECT stvdegc_desc " +
	" FROM stvdegc " +
	" WHERE stvdegc_code = :P_TEMP_DEGREE ";
							DataCommand command5 = new DataCommand(sql5);
							//Setting query parameters
							command5.addParameter("P_TEMP_DEGREE", tempDegree);
							ResultSet results5 = command5.executeQuery();
							rowCount = command5.getRowCount();
							if ( results5.hasData() ) {
								tempDesc = results5.getStr(0);
							}
							results5.close();
							copy(tempDesc,getNameIn("curr_degc_desc"));
						}
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field()).notEquals(0) && (getNameIn(getFormModel().getSCurriculumFields().getCurrMajr1Field()).isNull() || getNameIn(getFormModel().getSCurriculumFields().getCurrMajr1Field()).equals("0000")) )
						{
							executeAction("curr_default_major");
						}
					}
					catch(NoDataFoundException e)
					{
						executeAction("check_lock");
						if ( getFormModel().getSCurriculumHoldItems().getCurrLockInd().equals("N") )
						{
							executeAction("curr_lock_message");
						}
					}
					catch(TooManyRowsException e)
					{
						if ( getFormModel().getSCurrProcBlock().getCurrDegcCode().isNull() && getFormModel().getSCurrProcBlock().getCurrCampCode().isNull() && getFormModel().getSCurrProcBlock().getCurrLevlCode().isNull() && getFormModel().getSCurrProcBlock().getCurrCollCode().isNull() )
						{
							copy("",getNameIn("curr_program_1_field"));
						}
						else {
							copy("************",getNameIn("curr_program_1_field"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_PROGRAM_2
		 --  CHECK_PROGRAM_2  trigger
<multilinecomment> check_program_2 trigger  for curriculum 2
   this is called the post text triggers on the level,
   campus, college, degree fields.  This trigger tries 
   to derive the program based on codes entered on field.  </multilinecomment>

:curr_camp_code := name_in(:curr_camp_2_field);
:curr_coll_code := name_in(:curr_coll_2_field);
:curr_degc_code := name_in(:curr_degc_2_field);
:curr_levl_code := name_in(:curr_levl_2_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));

declare
  temp_rule number;
  temp_program varchar2(30);
  temp_program_in varchar2(30);
  temp_degree varchar2(30);
  temp_campus varchar2(30);
  temp_level  varchar2(30);
  temp_college varchar2(30);
  temp_desc varchar(30);
  temp_rule_out number;
begin
    if name_in(:curr_rule_2_field) is not null then 
       temp_rule := name_in(:curr_rule_2_field);
    else 
       temp_rule := null;
    end if;
    if name_in(:curr_program_2_field) is not null and 
       name_in(:curr_program_2_field) <> '************' then 
       temp_program_in := name_in(:curr_program_2_field);
    else 
       temp_program_in := null;
    end if;
  select sobcurr_program, sobcurr_levl_code, sobcurr_camp_code,
      sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule
    into temp_program, temp_level, temp_campus, temp_college, 
      temp_degree , temp_rule_out
    from sobcurr x
    where  ( ( x.sobcurr_curr_rule = temp_rule) or
        (   temp_rule is null
         and (( :curr_levl_code is not null
                or :curr_coll_code is not null
                or :curr_camp_code is not null
                or :curr_degc_code is not null)
        and ( x.sobcurr_levl_code = :curr_levl_code
           or :curr_levl_code is null)
        and ((:curr_coll_code is null)
           or (x.sobcurr_coll_code = :curr_coll_code))
        and ((:curr_degc_code is null)
           or (x.sobcurr_degc_code = :curr_degc_code))
        and (( :curr_camp_code is null)
          or (x.sobcurr_camp_code = :curr_camp_code)  )
        and (( temp_program_in is null)
          or (x.sobcurr_program  = temp_program_in)  ) )
        or (x.sobcurr_program = temp_program_in and temp_program_in is not null
           and :curr_levl_code is null and :curr_coll_code is null
           and :curr_camp_code is null and :curr_degc_code is null)  ))
    and sobcurr_lock_ind = 'Y'
    and sobcurr_term_code_init <= :curr_ctlg_term
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));

   
     copy(temp_program,name_in('curr_program_2_field'));
     copy(to_char(temp_rule_out),name_in('curr_rule_2_field'));
     if :curr_levl_code is null and temp_level is not null then 
        copy(temp_level,name_in('curr_levl_2_field'));
        select stvlevl_desc into temp_desc
        from stvlevl where stvlevl_code = temp_level;
        copy(temp_desc,name_in('curr_levl_2_desc'));
     end if;
     if :curr_coll_code is null and temp_college is not null  then 
        copy(temp_college,name_in('curr_coll_2_field'));
        select stvcoll_desc into temp_desc
        from stvcoll where stvcoll_code = temp_college;
        copy(temp_desc,name_in('curr_coll_2_desc'));    
     end if;
     if :curr_camp_code is null and temp_campus is not null then 
        copy(temp_campus,name_in('curr_camp_2_field'));
        select stvcamp_desc into temp_desc
        from stvcamp where stvcamp_code = temp_campus;
        copy(temp_desc,name_in('curr_camp_2_desc'));
     end if;
     if :curr_degc_code is null and temp_degree is not null then 
        copy(temp_degree,name_in('curr_degc_2_field'));
        select stvdegc_desc into temp_desc
        from stvdegc where stvdegc_code = temp_degree;
        copy(temp_desc,name_in('curr_degc_2_desc'));
     end if;
     if name_in(:curr_rule_2_field) is not null and
        name_in(:curr_rule_2_field) <> 0 and 
        name_in(:curr_majr_2_field) is null then 
          execute_trigger('curr_default_2_major');
      end if;

exception
   when no_data_found then
        execute_trigger('check_lock_2');
        if :curr_lock_ind = 'N' then 
             execute_trigger('curr_lock_message');
        end if;
   when too_many_rows then
    if :curr_degc_code is null and 
      :curr_camp_code is null and 
      :curr_levl_code  is null and 
      :curr_coll_code is null  then 
       copy('',name_in('curr_program_2_field'));
    else 
        copy('************',name_in('curr_program_2_field'));
    end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_PROGRAM_2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PROGRAM_2")
		public void Soqolib_CheckProgram2()
		{
			
				//   CHECK_PROGRAM_2  trigger
				//  check_program_2 trigger  for curriculum 2
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  
				int rowCount = 0;
				//   CHECK_PROGRAM_2  trigger
				//  check_program_2 trigger  for curriculum 2
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				{
					NNumber tempRule= NNumber.getNull();
					NString tempProgram= NString.getNull();
					NString tempProgramIn= NString.getNull();
					NString tempDegree= NString.getNull();
					NString tempCampus= NString.getNull();
					NString tempLevel= NString.getNull();
					NString tempCollege= NString.getNull();
					NString tempDesc= NString.getNull();
					NNumber tempRuleOut= NNumber.getNull();
					try
					{
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() )
						{
							tempRule = toNumber(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()));
						}
						else {
							tempRule = toNumber(null);
						}
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()).notEquals("************") )
						{
							tempProgramIn = getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field());
						}
						else {
							tempProgramIn = toStr(null);
						}
						String sql1 = "SELECT sobcurr_program, sobcurr_levl_code, sobcurr_camp_code, sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE) OR (:P_TEMP_RULE IS NULL AND ((:CURR_LEVL_CODE IS NOT NULL OR :CURR_COLL_CODE IS NOT NULL OR :CURR_CAMP_CODE IS NOT NULL OR :CURR_DEGC_CODE IS NOT NULL) AND (x.sobcurr_levl_code = :CURR_LEVL_CODE OR :CURR_LEVL_CODE IS NULL) AND ((:CURR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :CURR_COLL_CODE)) AND ((:CURR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :CURR_DEGC_CODE)) AND ((:CURR_CAMP_CODE IS NULL) OR (x.sobcurr_camp_code = :CURR_CAMP_CODE)) AND ((:P_TEMP_PROGRAM_IN IS NULL) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN))) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN AND :P_TEMP_PROGRAM_IN IS NOT NULL AND :CURR_LEVL_CODE IS NULL AND :CURR_COLL_CODE IS NULL AND :CURR_CAMP_CODE IS NULL AND :CURR_DEGC_CODE IS NULL))) AND sobcurr_lock_ind = 'Y' AND sobcurr_term_code_init <= :CURR_CTLG_TERM AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("P_TEMP_PROGRAM_IN", tempProgramIn);
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempLevel = results1.getStr(1);
							tempCampus = results1.getStr(2);
							tempCollege = results1.getStr(3);
							tempDegree = results1.getStr(4);
							tempRuleOut = results1.getNumber(5);
						}
						results1.close();
						copy(tempProgram,getNameIn("curr_program_2_field"));
						copy(toChar(tempRuleOut),getNameIn("curr_rule_2_field"));
						if ( getFormModel().getSCurrProcBlock().getCurrLevlCode().isNull() && !tempLevel.isNull() )
						{
							copy(tempLevel,getNameIn("curr_levl_2_field"));
							String sql2 = "SELECT stvlevl_desc " +
	" FROM stvlevl " +
	" WHERE stvlevl_code = :P_TEMP_LEVEL ";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("P_TEMP_LEVEL", tempLevel);
							ResultSet results2 = command2.executeQuery();
							rowCount = command2.getRowCount();
							if ( results2.hasData() ) {
								tempDesc = results2.getStr(0);
							}
							results2.close();
							copy(tempDesc,getNameIn("curr_levl_2_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrCollCode().isNull() && !tempCollege.isNull() )
						{
							copy(tempCollege,getNameIn("curr_coll_2_field"));
							String sql3 = "SELECT stvcoll_desc " +
	" FROM stvcoll " +
	" WHERE stvcoll_code = :P_TEMP_COLLEGE ";
							DataCommand command3 = new DataCommand(sql3);
							//Setting query parameters
							command3.addParameter("P_TEMP_COLLEGE", tempCollege);
							ResultSet results3 = command3.executeQuery();
							rowCount = command3.getRowCount();
							if ( results3.hasData() ) {
								tempDesc = results3.getStr(0);
							}
							results3.close();
							copy(tempDesc,getNameIn("curr_coll_2_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrCampCode().isNull() && !tempCampus.isNull() )
						{
							copy(tempCampus,getNameIn("curr_camp_2_field"));
							String sql4 = "SELECT stvcamp_desc " +
	" FROM stvcamp " +
	" WHERE stvcamp_code = :P_TEMP_CAMPUS ";
							DataCommand command4 = new DataCommand(sql4);
							//Setting query parameters
							command4.addParameter("P_TEMP_CAMPUS", tempCampus);
							ResultSet results4 = command4.executeQuery();
							rowCount = command4.getRowCount();
							if ( results4.hasData() ) {
								tempDesc = results4.getStr(0);
							}
							results4.close();
							copy(tempDesc,getNameIn("curr_camp_2_desc"));
						}
						if ( getFormModel().getSCurrProcBlock().getCurrDegcCode().isNull() && !tempDegree.isNull() )
						{
							copy(tempDegree,getNameIn("curr_degc_2_field"));
							String sql5 = "SELECT stvdegc_desc " +
	" FROM stvdegc " +
	" WHERE stvdegc_code = :P_TEMP_DEGREE ";
							DataCommand command5 = new DataCommand(sql5);
							//Setting query parameters
							command5.addParameter("P_TEMP_DEGREE", tempDegree);
							ResultSet results5 = command5.executeQuery();
							rowCount = command5.getRowCount();
							if ( results5.hasData() ) {
								tempDesc = results5.getStr(0);
							}
							results5.close();
							copy(tempDesc,getNameIn("curr_degc_2_desc"));
						}
						if ( !getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).isNull() && getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field()).notEquals(0) && getNameIn(getFormModel().getSCurriculumFields().getCurrMajr2Field()).isNull() )
						{
							executeAction("curr_default_2_major");
						}
					}
					catch(NoDataFoundException e)
					{
						executeAction("check_lock_2");
						if ( getFormModel().getSCurriculumHoldItems().getCurrLockInd().equals("N") )
						{
							executeAction("curr_lock_message");
						}
					}
					catch(TooManyRowsException e)
					{
						if ( getFormModel().getSCurrProcBlock().getCurrDegcCode().isNull() && getFormModel().getSCurrProcBlock().getCurrCampCode().isNull() && getFormModel().getSCurrProcBlock().getCurrLevlCode().isNull() && getFormModel().getSCurrProcBlock().getCurrCollCode().isNull() )
						{
							copy("",getNameIn("curr_program_2_field"));
						}
						else {
							copy("************",getNameIn("curr_program_2_field"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_LOCK
		 --  CHECK_LOCK  trigger
<multilinecomment> check_program trigger
   This is called in the post text field of the program to verifiy
  that the program selected is locked.  </multilinecomment>

:curr_camp_code := name_in(:curr_camp_1_field);
:curr_coll_code := name_in(:curr_coll_1_field);
:curr_degc_code := name_in(:curr_degc_1_field);
:curr_levl_code := name_in(:curr_levl_1_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_1_field), 
                       name_in(:curr_term_field));
:curr_program   := name_in(:curr_program_1_field);
:curr_lock_ind := '';
declare
    temp_lock_ind varchar2(1);
    temp_rule number;
begin
    if :curr_program = '**********' then 
       :curr_lock_ind := '';
       return;
    end if;
    select sobcurr_lock_ind, sobcurr_curr_rule
    into temp_lock_ind, temp_rule
    from sobcurr x
    where (  x.sobcurr_levl_code = :curr_levl_code
        and (x.sobcurr_coll_code = :curr_coll_code or :curr_coll_code is null)
        and (x.sobcurr_degc_code = :curr_degc_code or :curr_degc_code is null)
        and (nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%') 
           or ( x.sobcurr_camp_code is null and :curr_camp_code is not null) ) 
        and (nvl(x.sobcurr_program,'%') = nvl(:curr_program,'%'))  )
    and sobcurr_term_code_init <= :curr_ctlg_term
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));
   
   :curr_lock_ind := temp_lock_ind;
   copy(to_char(temp_rule),name_in('curr_rule_1_field'));
 
exception
   when no_data_found then
        :curr_lock_ind := '';
        copy('',name_in('curr_rule_1_field'));
   when too_many_rows then
        :curr_lock_ind := '';
        copy('',name_in('curr_rule_1_field'));
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_LOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_LOCK")
		public void Soqolib_CheckLock()
		{
			
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  
				int rowCount = 0;
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				getFormModel().getSCurrProcBlock().setCurrProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()));
				getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
				{
					NString tempLockInd= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					try
					{
						if ( getFormModel().getSCurrProcBlock().getCurrProgram().equals("**********") )
						{
							getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
							return ;
						}
						String sql1 = "SELECT sobcurr_lock_ind, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE (x.sobcurr_levl_code = :CURR_LEVL_CODE AND (x.sobcurr_coll_code = :CURR_COLL_CODE OR :CURR_COLL_CODE IS NULL) AND (x.sobcurr_degc_code = :CURR_DEGC_CODE OR :CURR_DEGC_CODE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%') OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)) AND (nvl(x.sobcurr_program, '%') = nvl(:CURR_PROGRAM, '%'))) AND sobcurr_term_code_init <= :CURR_CTLG_TERM AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_PROGRAM", getFormModel().getSCurrProcBlock().getCurrProgram());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempLockInd = results1.getStr(0);
							tempRule = results1.getNumber(1);
						}
						results1.close();
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(tempLockInd);
						copy(toChar(tempRule),getNameIn("curr_rule_1_field"));
					}
					catch(NoDataFoundException e)
					{
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
						copy("",getNameIn("curr_rule_1_field"));
					}
					catch(TooManyRowsException e)
					{
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
						copy("",getNameIn("curr_rule_1_field"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_LOCK_2
		 --  CHECK_LOCK  trigger
<multilinecomment> check_program trigger
   This is called in the post text field of the program to verifiy
  that the program selected is locked.  </multilinecomment>

:curr_camp_code := name_in(:curr_camp_2_field);
:curr_coll_code := name_in(:curr_coll_2_field);
:curr_degc_code := name_in(:curr_degc_2_field);
:curr_levl_code := name_in(:curr_levl_2_field);
:curr_ctlg_term := nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field));
:curr_program   := name_in(:curr_program_2_field);
:curr_lock_ind := '';
declare
    temp_lock_ind varchar2(1);
    temp_rule number;
begin
    if :curr_program = '**********' then 
       :curr_lock_ind := '';
       return;
    end if;
    select sobcurr_lock_ind, sobcurr_curr_rule
    into temp_lock_ind, temp_rule
    from sobcurr x
    where (  x.sobcurr_levl_code = :curr_levl_code
        and (x.sobcurr_coll_code = :curr_coll_code or :curr_coll_code is null)
        and (x.sobcurr_degc_code = :curr_degc_code or :curr_degc_code is null)
        and (nvl(x.sobcurr_camp_code,'%') = nvl(:curr_camp_code,'%') 
           or ( x.sobcurr_camp_code is null and :curr_camp_code is not null) ) 
        and (nvl(x.sobcurr_program,'%') = nvl(:curr_program,'%'))  )
    and sobcurr_term_code_init <= :curr_ctlg_term
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= :curr_ctlg_term)
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));
   
   :curr_lock_ind := temp_lock_ind;
   copy(to_char(temp_rule),name_in('curr_rule_2_field'));
 
exception
   when no_data_found then
        :curr_lock_ind := '';
        copy('',name_in('curr_rule_2_field'));
   when too_many_rows then
        :curr_lock_ind := '';
        copy('',name_in('curr_rule_2_field'));
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_LOCK_2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_LOCK_2")
		public void Soqolib_CheckLock2()
		{
			
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  
				int rowCount = 0;
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  
				getFormModel().getSCurrProcBlock().setCurrCampCode(getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()));
				getFormModel().getSCurrProcBlock().setCurrCollCode(getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())));
				getFormModel().getSCurrProcBlock().setCurrProgram(getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()));
				getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
				{
					NString tempLockInd= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					try
					{
						if ( getFormModel().getSCurrProcBlock().getCurrProgram().equals("**********") )
						{
							getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
							return ;
						}
						String sql1 = "SELECT sobcurr_lock_ind, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE (x.sobcurr_levl_code = :CURR_LEVL_CODE AND (x.sobcurr_coll_code = :CURR_COLL_CODE OR :CURR_COLL_CODE IS NULL) AND (x.sobcurr_degc_code = :CURR_DEGC_CODE OR :CURR_DEGC_CODE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:CURR_CAMP_CODE, '%') OR (x.sobcurr_camp_code IS NULL AND :CURR_CAMP_CODE IS NOT NULL)) AND (nvl(x.sobcurr_program, '%') = nvl(:CURR_PROGRAM, '%'))) AND sobcurr_term_code_init <= :CURR_CTLG_TERM AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= :CURR_CTLG_TERM ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("CURR_LEVL_CODE", getFormModel().getSCurrProcBlock().getCurrLevlCode());
						command1.addParameter("CURR_COLL_CODE", getFormModel().getSCurrProcBlock().getCurrCollCode());
						command1.addParameter("CURR_DEGC_CODE", getFormModel().getSCurrProcBlock().getCurrDegcCode());
						command1.addParameter("CURR_CAMP_CODE", getFormModel().getSCurrProcBlock().getCurrCampCode());
						command1.addParameter("CURR_PROGRAM", getFormModel().getSCurrProcBlock().getCurrProgram());
						command1.addParameter("CURR_CTLG_TERM", getFormModel().getSCurrProcBlock().getCurrCtlgTerm());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempLockInd = results1.getStr(0);
							tempRule = results1.getNumber(1);
						}
						results1.close();
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(tempLockInd);
						copy(toChar(tempRule),getNameIn("curr_rule_2_field"));
					}
					catch(NoDataFoundException e)
					{
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
						copy("",getNameIn("curr_rule_2_field"));
					}
					catch(TooManyRowsException e)
					{
						getFormModel().getSCurriculumHoldItems().setCurrLockInd(toStr(""));
						copy("",getNameIn("curr_rule_2_field"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_BASE
		 --  CHECK_BASE  trigger
<multilinecomment>  check base trigger.  This is called from the major
   key help to list attached majors.  This finds the curriculum
   rule for the curriculum entered.  </multilinecomment>  
 
  :hold_curr_rule := 0;
   sokcurr.P_CheckBase(:module_ind,nvl(name_in(:curr_term_catlg_1_field), 
                                   name_in(:curr_term_field)),
                       name_in(:curr_camp_1_field),
                       name_in(:curr_coll_1_field),
                       name_in(:curr_degc_1_field), 
                       name_in(:curr_levl_1_field),
                       name_in(:curr_program_1_field), :hold_curr_rule,
                       :hold_prim_roll_ind,:hold_secd_roll_ind,:majr1_attach_ind,
                       :cconmajr_attach_ind, :cconbase1_attach_ind, 
                       :minr1_attach_ind,
                       :err_number);

   if :hold_curr_rule is null or :hold_curr_rule = 0 then
       copy('',name_in('curr_rule_1_field'));
   else
      if :hold_curr_rule = name_in(:curr_rule_1_field) then
          null;
      else
          copy(to_char(:hold_curr_rule),name_in('curr_rule_1_field'));
          :CURR_UPD_MAJR11 := 'Y';
          :CURR_UPD_MAJR12 := 'Y';
      end if;
  end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_BASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BASE")
		public void Soqolib_CheckBase()
		{
			
				//   CHECK_BASE  trigger
				//   check base trigger.  This is called from the major
				// key help to list attached majors.  This finds the curriculum
				// rule for the curriculum entered.  
				//   CHECK_BASE  trigger
				//   check base trigger.  This is called from the major
				// key help to list attached majors.  This finds the curriculum
				// rule for the curriculum entered.  
				getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(0));
				Ref<NNumber> base_rule_ref = new Ref<NNumber>(getFormModel().getSCurrProcBlock().getHoldCurrRule());
				Ref<NString> prim_roll_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getHoldPrimRollInd());
				Ref<NString> secd_roll_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getHoldSecdRollInd());
				Ref<NString> majr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getMajr1AttachInd());
				Ref<NString> conc_majr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getCconmajrAttachInd());
				Ref<NString> conc_base_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getCconbase1AttachInd());
				Ref<NString> minr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getMinr1AttachInd());
				Ref<NNumber> error_numb_ref = new Ref<NNumber>(getFormModel().getSCurrProcBlock().getErrNumber());
				Sokcurr.pCheckbase(getFormModel().getSCurrProcBlock().getModuleInd(), isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())), getNameIn(getFormModel().getSCurriculumFields().getCurrCamp1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrColl1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrDegc1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrLevl1Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrProgram1Field()), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
				getFormModel().getSCurrProcBlock().setHoldCurrRule(base_rule_ref.val);
				getFormModel().getSSobctrlBlock().setHoldPrimRollInd(prim_roll_ind_ref.val);
				getFormModel().getSSobctrlBlock().setHoldSecdRollInd(secd_roll_ind_ref.val);
				getFormModel().getSSobctrlBlock().setMajr1AttachInd(majr_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setCconmajrAttachInd(conc_majr_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setCconbase1AttachInd(conc_base_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setMinr1AttachInd(minr_attach_ind_ref.val);
				getFormModel().getSCurrProcBlock().setErrNumber(error_numb_ref.val);
				if ( getFormModel().getSCurrProcBlock().getHoldCurrRule().isNull() || getFormModel().getSCurrProcBlock().getHoldCurrRule().equals(0) )
				{
					copy("",getNameIn("curr_rule_1_field"));
				}
				else {
					if ( getFormModel().getSCurrProcBlock().getHoldCurrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrRule1Field())) )
					{
					}
					else {
						copy(toChar(getFormModel().getSCurrProcBlock().getHoldCurrRule()),getNameIn("curr_rule_1_field"));
						getFormModel().getSCurriculumChange().setCurrUpdMajr11(toStr("Y"));
						getFormModel().getSCurriculumChange().setCurrUpdMajr12(toStr("Y"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_BASE2
		 --  CHECK_BASE2  trigger
<multilinecomment>  check base trigger.  This is called from the major
   key help to list attached majors.  This finds the curriculum
   rule for the curriculum entered.  Curriclum 2  </multilinecomment>   

   :hold_curr_rule := 0;
   sokcurr.P_CheckBase(:module_ind,nvl(name_in(:curr_term_catlg_2_field), 
                       name_in(:curr_term_field)),
                       name_in(:curr_camp_2_field),name_in(:curr_coll_2_field),
                       name_in(:curr_degc_2_field), 
                       name_in(:curr_levl_2_field),
                       name_in(:curr_program_2_field), :hold_curr_rule,
                       :hold_prim_roll_ind,:hold_secd_roll_ind,:majr2_attach_ind,
                       :cconmajr_attach_ind, :cconbase2_attach_ind, 
                       :minr2_attach_ind,
                       :err_number);
  
    if :hold_curr_rule is null or :hold_curr_rule = 0 then
         copy('',name_in('curr_rule_2_field'));
   else
      if :hold_curr_rule = name_in(:curr_rule_2_field) then
          null;
      else
          copy(to_char(:hold_curr_rule),name_in('curr_rule_2_field'));
          :CURR_UPD_MAJR21 := 'Y';
          :CURR_UPD_MAJR22 := 'Y';
      end if;
  end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_BASE2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BASE2")
		public void Soqolib_CheckBase2()
		{
			
				//   CHECK_BASE2  trigger
				//   check base trigger.  This is called from the major
				// key help to list attached majors.  This finds the curriculum
				// rule for the curriculum entered.  Curriclum 2  
				//   CHECK_BASE2  trigger
				//   check base trigger.  This is called from the major
				// key help to list attached majors.  This finds the curriculum
				// rule for the curriculum entered.  Curriclum 2  
				getFormModel().getSCurrProcBlock().setHoldCurrRule(toNumber(0));
				Ref<NNumber> base_rule_ref = new Ref<NNumber>(getFormModel().getSCurrProcBlock().getHoldCurrRule());
				Ref<NString> prim_roll_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getHoldPrimRollInd());
				Ref<NString> secd_roll_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getHoldSecdRollInd());
				Ref<NString> majr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getMajr2AttachInd());
				Ref<NString> conc_majr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getCconmajrAttachInd());
				Ref<NString> conc_base_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getCconbase2AttachInd());
				Ref<NString> minr_attach_ind_ref = new Ref<NString>(getFormModel().getSSobctrlBlock().getMinr2AttachInd());
				Ref<NNumber> error_numb_ref = new Ref<NNumber>(getFormModel().getSCurrProcBlock().getErrNumber());
				Sokcurr.pCheckbase(getFormModel().getSCurrProcBlock().getModuleInd(), isNull(getNameIn(getFormModel().getSCurriculumFields().getCurrTermCatlg2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrTermField())), getNameIn(getFormModel().getSCurriculumFields().getCurrCamp2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrColl2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrDegc2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrLevl2Field()), getNameIn(getFormModel().getSCurriculumFields().getCurrProgram2Field()), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
				getFormModel().getSCurrProcBlock().setHoldCurrRule(base_rule_ref.val);
				getFormModel().getSSobctrlBlock().setHoldPrimRollInd(prim_roll_ind_ref.val);
				getFormModel().getSSobctrlBlock().setHoldSecdRollInd(secd_roll_ind_ref.val);
				getFormModel().getSSobctrlBlock().setMajr2AttachInd(majr_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setCconmajrAttachInd(conc_majr_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setCconbase2AttachInd(conc_base_attach_ind_ref.val);
				getFormModel().getSSobctrlBlock().setMinr2AttachInd(minr_attach_ind_ref.val);
				getFormModel().getSCurrProcBlock().setErrNumber(error_numb_ref.val);
				if ( getFormModel().getSCurrProcBlock().getHoldCurrRule().isNull() || getFormModel().getSCurrProcBlock().getHoldCurrRule().equals(0) )
				{
					copy("",getNameIn("curr_rule_2_field"));
				}
				else {
					if ( getFormModel().getSCurrProcBlock().getHoldCurrRule().equals(getNameIn(getFormModel().getSCurriculumFields().getCurrRule2Field())) )
					{
					}
					else {
						copy(toChar(getFormModel().getSCurrProcBlock().getHoldCurrRule()),getNameIn("curr_rule_2_field"));
						getFormModel().getSCurriculumChange().setCurrUpdMajr21(toStr("Y"));
						getFormModel().getSCurriculumChange().setCurrUpdMajr22(toStr("Y"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CLEAR_CURRLOV_ITEMS
		 --  CLEAR_CURRLOV_ITEMS  trigger
 <multilinecomment>  clear curr lov items   
     this is called after the key help lovs, and at the new
     instance for each curr field  </multilinecomment>

    :global.level_code := '';
    :global.college := '';
    :global.degree_code := '';
    :global.program := '';
    :global.curr_rule := '';
    :global.ccon_rule := '';
    :global.sel_ind := '';
    :curr_camp_code := '';
    :curr_coll_code := '';
    :curr_degc_code := '';
    :curr_levl_code := '';
    :curr_program := '';
    :curr_ctlg_term := '';
    :curr_eff_term := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CLEAR_CURRLOV_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLEAR_CURRLOV_ITEMS")
		public void Soqolib_ClearCurrlovItems()
		{
			
				//   CLEAR_CURRLOV_ITEMS  trigger
				//   clear curr lov items
				// this is called after the key help lovs, and at the new
				// instance for each curr field  
				//   CLEAR_CURRLOV_ITEMS  trigger
				//   clear curr lov items
				// this is called after the key help lovs, and at the new
				// instance for each curr field  
				setGlobal("LEVEL_CODE", toStr(""));
				setGlobal("COLLEGE", toStr(""));
				setGlobal("DEGREE_CODE", toStr(""));
				setGlobal("PROGRAM", toStr(""));
				setGlobal("CURR_RULE", toStr(""));
				setGlobal("CCON_RULE", toStr(""));
				setGlobal("SEL_IND", toStr(""));
				getFormModel().getSCurrProcBlock().setCurrCampCode(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrCollCode(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrDegcCode(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrLevlCode(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrProgram(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrCtlgTerm(toStr(""));
				getFormModel().getSCurrProcBlock().setCurrEffTerm(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_UPDATE_INDICATORS
		 --  CURR_UPDATE_INDICATORS  trigger
if :curr_upd_base1 = 'Y' then
   :curr_upd_majr11 := 'Y';
   :curr_upd_majr12 := 'Y';
end if;
if :curr_upd_base2 = 'Y' then
   :curr_upd_majr21 := 'Y';
   :curr_upd_majr22 := 'Y';
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_UPDATE_INDICATORS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_UPDATE_INDICATORS")
		public void Soqolib_CurrUpdateIndicators()
		{
			
				//   CURR_UPDATE_INDICATORS  trigger
				//   CURR_UPDATE_INDICATORS  trigger
				if ( getFormModel().getSCurriculumChange().getCurrUpdBase1().equals("Y") )
				{
					getFormModel().getSCurriculumChange().setCurrUpdMajr11(toStr("Y"));
					getFormModel().getSCurriculumChange().setCurrUpdMajr12(toStr("Y"));
				}
				if ( getFormModel().getSCurriculumChange().getCurrUpdBase2().equals("Y") )
				{
					getFormModel().getSCurriculumChange().setCurrUpdMajr21(toStr("Y"));
					getFormModel().getSCurriculumChange().setCurrUpdMajr22(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.INVALID_CURR_MSG
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   22-Jan-2004 09:01 PM
 ******************************************</multilinecomment>

--  INVALID_CURR_MSG  trigger
<multilinecomment>* display the invalid curriculum message </multilinecomment>

declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
begin
    :cem_msg := '';
    if :sobctrl_curr_rule_ind = 'N' then
       :cem_msg :=  G$_NLS.Get('SOQOLIB-0043', 'FORM','Curriculum Checking is not in Effect') ;
    else
         if :temp_rule_ind = 'N' or
            :temp_rule_2_ind = 'N'  then
             :cem_msg :=  G$_NLS.Get('SOQOLIB-0044', 'FORM','Catalog Term Precedes Initial Term; Curriculum Checking not in Effect.') ;
         end if;
    end if;
    if :cem_msg is null then 
       :cem_msg :=  G$_NLS.Get('SOQOLIB-0045', 'FORM','Invalid Curriculum.') ;
    end if;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,:cem_msg);
   alert_button := show_alert('CURRICULUM_INVALID');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.INVALID_CURR_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_CURR_MSG")
		public void Soqolib_InvalidCurrMsg()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 22-Jan-2004 09:01 PM
				// ******************************************
				//   INVALID_CURR_MSG  trigger
				// * display the invalid curriculum message 
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
					getFormModel().getSCurriculumChange().setCemMsg(toStr(""));
					if ( getFormModel().getSSobctrlBlock().getSobctrlCurrRuleInd().equals("N") )
					{
						getFormModel().getSCurriculumChange().setCemMsg(GNls.Fget(toStr("SOQOLIB-0043"), toStr("FORM"), toStr("Curriculum Checking is not in Effect")));
					}
					else {
						if ( getFormModel().getSCurrProcBlock().getTempRuleInd().equals("N") || getFormModel().getSCurrProcBlock().getTempRule2Ind().equals("N") )
						{
							getFormModel().getSCurriculumChange().setCemMsg(GNls.Fget(toStr("SOQOLIB-0044"), toStr("FORM"), toStr("Catalog Term Precedes Initial Term; Curriculum Checking not in Effect.")));
						}
					}
					if ( getFormModel().getSCurriculumChange().getCemMsg().isNull() )
					{
						getFormModel().getSCurriculumChange().setCemMsg(GNls.Fget(toStr("SOQOLIB-0045"), toStr("FORM"), toStr("Invalid Curriculum.")));
					}
					setAlertMessageText(alertId, getFormModel().getSCurriculumChange().getCemMsg());
					alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURR_FIELDS
		 --  CURR_FIELDS  trigger
<multilinecomment>*  this should be copied to form level triggers and 
    called from the load_form_header trigger.  This sets
    up the fields used in the curr process so referenced triggers
    can reference fields indirectly.
    The field tablemodule is initialized in the Load_form_header trigger
    It will be the blockname.tablename_  like saradap.saradap_   *</multilinecomment>



:curr_levl_1_field    := :tablemodule || 'LEVL_CODE';
:curr_Term_field      := :tablemodule || 'TERM_CODE_ENTRY';
:curr_term_catlg_1_field := :tablemodule || 'TERM_CODE_CTLG_1';
:CURR_PROGRAM_1_FIELD  := :tablemodule || 'PROGRAM_1';
:CURR_DEGC_1_FIELD   := :tablemodule || 'DEGC_CODE_1';
:CURR_CAMP_1_FIELD   := :tablemodule || 'CAMP_CODE';
:CURR_COLL_1_FIELD   := :tablemodule || 'COLL_CODE_1';
:CURR_MAJR_1_FIELD   := :tablemodule || 'MAJR_CODE_1';
:CURR_DEPT_1_FIELD   := :tablemodule || 'DEPT_CODE';
:CURR_CONC_1_1_FIELD := :tablemodule || 'MAJR_CODE_CONC_1';
:CURR_CONC_1_2_FIELD := :tablemodule || 'MAJR_CODE_CONC_1_2';
:CURR_CONC_1_3_FIELD := :tablemodule || 'MAJR_CODE_CONC_1_3';
:CURR_MAJR_1_2_FIELD   := :tablemodule || 'MAJR_CODE_1_2';
:CURR_DEPT_1_2_FIELD   := :tablemodule || 'DEPT_CODE_1_2';
:CURR_CONC_121_FIELD := :tablemodule || 'MAJR_CODE_CONC_121';
:CURR_CONC_122_FIELD := :tablemodule || 'MAJR_CODE_CONC_122';
:CURR_CONC_123_FIELD := :tablemodule || 'MAJR_CODE_CONC_123';
:CURR_MINR_1_1_FIELD := :tablemodule || 'MAJR_CODE_MINR_1_1';
:CURR_MINR_1_2_FIELD := :tablemodule || 'MAJR_CODE_MINR_1_2';
:curr_rule_1_field   := :tablemodule || 'curr_rule_1';
:curr_cmjr_rule_1_1_field := :tablemodule || 'cmjr_rule_1_1';
:curr_levl_desc := 'STVLEVL_DESC';
:curr_camp_desc := 'STVCAMP_DESC';
:curr_coll_desc := 'STVCOLL_DESC';
:curr_degc_desc := 'STVDEGC_DESC';

:curr_rule_2_field := :tablemodule || 'curr_rule_2';
:curr_term_catlg_2_field := :tablemodule || 'TERM_CODE_CTLG_2';
:CURR_PROGRAM_2_FIELD  := :tablemodule || 'PROGRAM_2';
:CURR_DEGc_2_FIELD   := :tablemodule || 'DEGC_CODE_2';
:CURR_CAMP_2_FIELD   := :tablemodule || 'CAMP_CODE_2';
:CURR_COLL_2_FIELD   := :tablemodule || 'COLL_CODE_2';
:curr_levl_2_field    := :tablemodule || 'LEVL_CODE_2';
:CURR_MAJR_2_FIELD   := :tablemodule || 'MAJR_CODE_2';
:CURR_DEPT_2_FIELD   := :tablemodule || 'DEPT_CODE_2';
:CURR_CONC_2_1_FIELD := :tablemodule || 'MAJR_CODE_CONC_2';
:CURR_CONC_2_2_FIELD := :tablemodule || 'MAJR_CODE_CONC_2_2';
:CURR_CONC_2_3_FIELD := :tablemodule || 'MAJR_CODE_CONC_2_3';
:CURR_MAJR_2_2_FIELD   := :tablemodule || 'MAJR_CODE_2_2';
:CURR_DEPT_2_2_FIELD   := :tablemodule || 'DEPT_CODE_2_2';
:CURR_CONC_221_FIELD := :tablemodule || 'MAJR_CODE_CONC_221';
:CURR_CONC_222_FIELD := :tablemodule || 'MAJR_CODE_CONC_222';
:CURR_CONC_223_FIELD := :tablemodule || 'MAJR_CODE_CONC_223';
:CURR_MINR_2_1_FIELD := :tablemodule || 'MAJR_CODE_MINR_2_1';
:CURR_MINR_2_2_FIELD := :tablemodule || 'MAJR_CODE_MINR_2_2';
:curr_cmjr_rule_2_1_field := :tablemodule || 'cmjr_rule_2_1';
:curr_levl_2_desc := 'STVLEVL_DESC_2';
:curr_camp_2_desc := 'STVCAMP_DESC_2';
:curr_coll_2_desc := 'STVCOLL_DESC_2';
:curr_degc_2_desc := 'STVDEGC_DESC_2';
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURR_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURR_FIELDS")
		public void Soqolib_CurrFields()
		{
			
				//   CURR_FIELDS  trigger
				// *  this should be copied to form level triggers and
				// called from the load_form_header trigger.  This sets
				// up the fields used in the curr process so referenced triggers
				// can reference fields indirectly.
				// The field tablemodule is initialized in the Load_form_header trigger
				// It will be the blockname.tablename_  like saradap.saradap_   *
				//   CURR_FIELDS  trigger
				// *  this should be copied to form level triggers and
				// called from the load_form_header trigger.  This sets
				// up the fields used in the curr process so referenced triggers
				// can reference fields indirectly.
				// The field tablemodule is initialized in the Load_form_header trigger
				// It will be the blockname.tablename_  like saradap.saradap_   *
				getFormModel().getSCurriculumFields().setCurrLevl1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("LEVL_CODE"));
				getFormModel().getSCurriculumFields().setCurrTermField(getFormModel().getSSobctrlBlock().getTablemodule().append("TERM_CODE_ENTRY"));
				getFormModel().getSCurriculumFields().setCurrTermCatlg1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("TERM_CODE_CTLG_1"));
				getFormModel().getSCurriculumFields().setCurrProgram1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("PROGRAM_1"));
				getFormModel().getSCurriculumFields().setCurrDegc1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEGC_CODE_1"));
				getFormModel().getSCurriculumFields().setCurrCamp1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("CAMP_CODE"));
				getFormModel().getSCurriculumFields().setCurrColl1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("COLL_CODE_1"));
				getFormModel().getSCurriculumFields().setCurrMajr1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_1"));
				getFormModel().getSCurriculumFields().setCurrDept1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEPT_CODE"));
				getFormModel().getSCurriculumFields().setCurrConc11Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_1"));
				getFormModel().getSCurriculumFields().setCurrConc12Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_1_2"));
				getFormModel().getSCurriculumFields().setCurrConc13Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_1_3"));
				getFormModel().getSCurriculumFields().setCurrMajr12Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_1_2"));
				getFormModel().getSCurriculumFields().setCurrDept12Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEPT_CODE_1_2"));
				getFormModel().getSCurriculumFields().setCurrConc121Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_121"));
				getFormModel().getSCurriculumFields().setCurrConc122Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_122"));
				getFormModel().getSCurriculumFields().setCurrConc123Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_123"));
				getFormModel().getSCurriculumFields().setCurrMinr11Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_MINR_1_1"));
				getFormModel().getSCurriculumFields().setCurrMinr12Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_MINR_1_2"));
				getFormModel().getSCurriculumFields().setCurrRule1Field(getFormModel().getSSobctrlBlock().getTablemodule().append("curr_rule_1"));
				getFormModel().getSCurriculumFields().setCurrCmjrRule11Field(getFormModel().getSSobctrlBlock().getTablemodule().append("cmjr_rule_1_1"));
				getFormModel().getSCurriculumFields().setCurrLevlDesc(toStr("STVLEVL_DESC"));
				getFormModel().getSCurriculumFields().setCurrCampDesc(toStr("STVCAMP_DESC"));
				getFormModel().getSCurriculumFields().setCurrCollDesc(toStr("STVCOLL_DESC"));
				getFormModel().getSCurriculumFields().setCurrDegcDesc(toStr("STVDEGC_DESC"));
				getFormModel().getSCurriculumFields().setCurrRule2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("curr_rule_2"));
				getFormModel().getSCurriculumFields().setCurrTermCatlg2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("TERM_CODE_CTLG_2"));
				getFormModel().getSCurriculumFields().setCurrProgram2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("PROGRAM_2"));
				getFormModel().getSCurriculumFields().setCurrDegc2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEGC_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrCamp2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("CAMP_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrColl2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("COLL_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrLevl2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("LEVL_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrMajr2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrDept2Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEPT_CODE_2"));
				getFormModel().getSCurriculumFields().setCurrConc21Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_2"));
				getFormModel().getSCurriculumFields().setCurrConc22Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_2_2"));
				getFormModel().getSCurriculumFields().setCurrConc23Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_2_3"));
				getFormModel().getSCurriculumFields().setCurrMajr22Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_2_2"));
				getFormModel().getSCurriculumFields().setCurrDept22Field(getFormModel().getSSobctrlBlock().getTablemodule().append("DEPT_CODE_2_2"));
				getFormModel().getSCurriculumFields().setCurrConc221Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_221"));
				getFormModel().getSCurriculumFields().setCurrConc222Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_222"));
				getFormModel().getSCurriculumFields().setCurrConc223Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_CONC_223"));
				getFormModel().getSCurriculumFields().setCurrMinr21Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_MINR_2_1"));
				getFormModel().getSCurriculumFields().setCurrMinr22Field(getFormModel().getSSobctrlBlock().getTablemodule().append("MAJR_CODE_MINR_2_2"));
				getFormModel().getSCurriculumFields().setCurrCmjrRule21Field(getFormModel().getSSobctrlBlock().getTablemodule().append("cmjr_rule_2_1"));
				getFormModel().getSCurriculumFields().setCurrLevl2Desc(toStr("STVLEVL_DESC_2"));
				getFormModel().getSCurriculumFields().setCurrCamp2Desc(toStr("STVCAMP_DESC_2"));
				getFormModel().getSCurriculumFields().setCurrColl2Desc(toStr("STVCOLL_DESC_2"));
				getFormModel().getSCurriculumFields().setCurrDegc2Desc(toStr("STVDEGC_DESC_2"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.TEST_COMM_PROCESS
		 -- this routine tests to see if the comm plan window should come up
-- tests include:
--  1) if student record is inactivated or deleted, and if there is 
--      a comm plan for that record or there is a comm plan from one of the
--      other modules then the comm plan window should come up. 
--  2) if student, appl or recruit record is new and a new comm plans
--     from soacomm rules  exists.   
--  3) if record is added and comm plan from other module exists, the
--     window will come up; if admin record is added and recruit plan
--     exists, comm plan window comes up.
--  4) if curriculum or field of study is inactivated the window will come up
--     if comm plan exists for that module and record.


declare
  recruit_plan varchar2(30) := null;
  admit_plan varchar2(30) := null;
  student_plan varchar2(30) := null;
  cpln_code varchar2(30) := null;
  new_cpln_cnt number := 0;
--
  CURSOR OLD_COMM_PLAN IS
  SELECT SOBCPLN_CPLN_CODE
  FROM   SOBCPLN
  WHERE  SOBCPLN_PIDM       = :cpln_PIDM
    AND  SOBCPLN_TYPE_IND   = :cpln_TYPE_IND
    AND  SOBCPLN_TERM_CODE  = :cpln_TERM_CODE
    AND  SOBCPLN_SEQNO      = :cpln_seqno
    AND  SOBCPLN_ACTIVE_IND = 'Y'
  UNION
  SELECT SOBCPLN_CPLN_CODE   -- student plans have null term/seqno
  FROM   SOBCPLN
  WHERE  SOBCPLN_PIDM       = :cpln_PIDM
    AND  SOBCPLN_TYPE_IND   = :cpln_TYPE_IND
    AND  SOBCPLN_TERM_CODE  IS NULL
    AND  SOBCPLN_SEQNO      IS NULL
    AND  SOBCPLN_ACTIVE_IND = 'Y';
--
CURSOR FIND_RECRUIT IS
    SELECT 'Y'
    FROM   SOBCPLN
    WHERE  SOBCPLN_PIDM       = :cpln_PIDM
      AND  SOBCPLN_TYPE_IND   = 'R'
      AND  SOBCPLN_ACTIVE_IND = 'Y';
--
CURSOR FIND_ADMIT IS
    SELECT 'Y'
    FROM   SOBCPLN
    WHERE  SOBCPLN_PIDM       = :cpln_PIDM
      AND  SOBCPLN_TYPE_IND   = 'A'
      AND  SOBCPLN_ACTIVE_IND = 'Y';
--
CURSOR FIND_STUDENT IS
    SELECT 'Y'
    FROM   SOBCPLN
    WHERE  SOBCPLN_PIDM       = :cpln_PIDM
      AND  SOBCPLN_TYPE_IND   = 'S'
      AND  SOBCPLN_ACTIVE_IND = 'Y';
--

--
BEGIN
--Actions: 1 = change of comm plan within a specific recr/admt/stdn rec.
--         2 = inactivate comm plan for inactivated recruit/applicant or
--             student.
--         3 = add comm plan for new admit/student rec; inactivate any
--             subordinate comm plans (for recruiting or admissions).
--         4 = bring up comm plan window for module 
--  find existing comm plan
  :old_cpln_code := NULL;
  OPEN  OLD_COMM_PLAN;
  FETCH OLD_COMM_PLAN INTO :old_cpln_code;
  IF OLD_COMM_PLAN%NOTFOUND THEN
        :OLD_cpln_code := null;
  END IF;
  CLOSE OLD_COMM_PLAN;
  <multilinecomment> goto comm plan window if old plan exists and inactive of rec </multilinecomment>
  if :comm_action = '2' then
  	if ( :old_cpln_code is not null ) then 
       goto action_needed;
  	else 
  	   return; -- no need to bring up window if no comm plans for record being
  	   	  -- deleted 
  	 end if;
  	end if;

-- determine if recruiting & admissions comm plans exist
  OPEN FIND_RECRUIT;
  FETCH FIND_RECRUIT INTO :comm_RECRUIT_EXISTS;
  IF FIND_RECRUIT%NOTFOUND THEN
     :comm_RECRUIT_EXISTS := 'N';
  END IF;
  CLOSE FIND_RECRUIT;
--
  OPEN FIND_ADMIT;
  FETCH FIND_ADMIT INTO :comm_ADMIT_EXISTS;
  IF FIND_ADMIT%NOTFOUND THEN
     :comm_ADMIT_EXISTS := 'N';
  END IF;
  CLOSE FIND_ADMIT;
  --
  OPEN FIND_STUDENT;
  FETCH FIND_STUDENT INTO :comm_STUDENT_EXISTS;
  IF FIND_STUDENT%NOTFOUND THEN
     :comm_STUDENT_EXISTS := 'N';
  END IF;
  CLOSE FIND_STUDENT;

--  use comm plan rules to identify new comm plan
--  only one of the new plans is retreived this is
--  just a check to see if there are new plans.  the
--  value retreived is never used
--  use comm plan rules to identify new comm plan
   cpln_code := null; 
   cpln_code := sokcomm.f_testplan( p_pidm => :cpln_pidm,
       p_cpln_type =>  :cpln_type_ind,  
       p_term_code => :cpln_term_code,
       p_seqno => :cpln_seqno) ;
       
 --
    IF :cpln_TYPE_IND = 'R' THEN
       :new_cpln_code := cpln_code;
       recruit_plan := cpln_code;
    ELSIF :cpln_TYPE_IND = 'A' THEN
       :new_cpln_code := cpln_code;
       admit_plan := cpln_code;
    ELSE
       :new_cpln_code := cpln_code;
       student_plan := cpln_code;
    END IF;
    if :comm_action = '2'  then 
      :new_cpln_code := '';
    end if;
    
      
END;
--
--  Find if action required on old plan or on new plan.
--
   if ( :comm_action = '2'   and 
   (( :cpln_type_ind = 'S' and 
    ( :comm_recruit_exists = 'Y' or :comm_admit_exists = 'Y')) or
   ( :cpln_type_ind = 'A' and 
      :comm_recruit_exists = 'Y') or 
   ( :old_cpln_code is not null) ) )  then 
        goto action_needed;
   end if;
   if :comm_action = '4'  and 
   :old_cpln_code is not null  then 
        goto action_needed;
   end if;
  IF :new_cpln_code IS NULL     AND
     :comm_RECRUIT_EXISTS = 'N' AND
     :comm_ADMIT_EXISTS   = 'N' THEN
       execute_trigger('insert_new_comm_plan');
      GOTO EXIT_PROCEDURE;
  END IF;
  IF :cpln_TYPE_IND = 'A'       AND
     :new_cpln_code IS NULL     AND
     :comm_RECRUIT_EXISTS = 'N' THEN
       execute_trigger('insert_new_comm_plan');
      GOTO EXIT_PROCEDURE;
  END IF;
  IF :cpln_TYPE_IND = 'R'       AND
     :new_cpln_code IS NULL       THEN
       execute_trigger('insert_new_comm_plan');
      GOTO EXIT_PROCEDURE;
  END IF;
<<ACTION_NEEDED>>
  -- if ( :new_cpln_code <> '' or :new_cpln_code is not null )
  -- 	or ( :comm_action in ('2', '4')  )  then 
  --  always execute procedure to insert new comm plan so that 
  --  materials for dept, major, learner styp and admit will be 
  --  executed 
  execute_trigger('insert_new_comm_plan');
  -- end if;
  :comm_RESULT := 'Y';
<<EXIT_PROCEDURE>>
 
  null; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.TEST_COMM_PROCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TEST_COMM_PROCESS")
		public void Soqolib_TestCommProcess()
		{
			
				//  this routine tests to see if the comm plan window should come up
				//  tests include:
				//   1) if student record is inactivated or deleted, and if there is 
				//       a comm plan for that record or there is a comm plan from one of the
				//       other modules then the comm plan window should come up. 
				//   2) if student, appl or recruit record is new and a new comm plans
				//      from soacomm rules  exists.   
				//   3) if record is added and comm plan from other module exists, the
				//      window will come up; if admin record is added and recruit plan
				//      exists, comm plan window comes up.
				//   4) if curriculum or field of study is inactivated the window will come up
				//      if comm plan exists for that module and record.
				int rowCount = 0;
				{
					NString recruitPlan = NString.getNull();
					NString admitPlan = NString.getNull();
					NString studentPlan = NString.getNull();
					NString cplnCode = NString.getNull();
					NNumber newCplnCnt = toNumber(0);
					String sqloldCommPlan = "SELECT SOBCPLN_CPLN_CODE " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE = :CPLN_TERM_CODE AND SOBCPLN_SEQNO = :CPLN_SEQNO AND SOBCPLN_ACTIVE_IND = 'Y' " +
	"UNION SELECT SOBCPLN_CPLN_CODE " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE IS NULL AND SOBCPLN_SEQNO IS NULL AND SOBCPLN_ACTIVE_IND = 'Y' ";
					DataCursor oldCommPlan = new DataCursor(sqloldCommPlan);
					String sqlfindRecruit = "SELECT 'Y' " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'R' AND SOBCPLN_ACTIVE_IND = 'Y' ";
					DataCursor findRecruit = new DataCursor(sqlfindRecruit);
					String sqlfindAdmit = "SELECT 'Y' " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'A' AND SOBCPLN_ACTIVE_IND = 'Y' ";
					DataCursor findAdmit = new DataCursor(sqlfindAdmit);
					String sqlfindStudent = "SELECT 'Y' " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'S' AND SOBCPLN_ACTIVE_IND = 'Y' ";
					DataCursor findStudent = new DataCursor(sqlfindStudent);
					// Actions: 1 = change of comm plan within a specific recr/admt/stdn rec.
					//          2 = inactivate comm plan for inactivated recruit/applicant or
					//              student.
					//          3 = add comm plan for new admit/student rec; inactivate any
					//              subordinate comm plans (for recruiting or admissions).
					//          4 = bring up comm plan window for module 
					//   find existing comm plan
					getFormModel().getSCommPlanBlock().setOldCplnCode(toStr(null));
					//Setting query parameters
					oldCommPlan.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					oldCommPlan.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					oldCommPlan.addParameter("CPLN_TERM_CODE", getFormModel().getSCommPlanBlock().getCplnTermCode());
					oldCommPlan.addParameter("CPLN_SEQNO", getFormModel().getSCommPlanBlock().getCplnSeqno());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable oldCommPlan.
					oldCommPlan.open();
					ResultSet oldCommPlanResults = oldCommPlan.fetchInto();
					if ( oldCommPlanResults != null ) {
						getFormModel().getSCommPlanBlock().setOldCplnCode(oldCommPlanResults.getStr(0));
					}
					if ( oldCommPlan.notFound() )
					{
						getFormModel().getSCommPlanBlock().setOldCplnCode(toStr(null));
					}
					oldCommPlan.close();
					//  goto comm plan window if old plan exists and inactive of rec 
					if ( getFormModel().getSCommPlanBlock().getCommAction().equals("2") )
					{
						if ((!getFormModel().getSCommPlanBlock().getOldCplnCode().isNull()))
						{
							executeAction("insert_new_comm_plan");
							getFormModel().getSCommPlanBlock().setCommResult(toStr("Y"));						}
						else {
							return ;
						}
					}
					//  determine if recruiting & admissions comm plans exist
					//Setting query parameters
					findRecruit.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findRecruit.
					findRecruit.open();
					ResultSet findRecruitResults = findRecruit.fetchInto();
					if ( findRecruitResults != null ) {
						getFormModel().getSCommPlanBlock().setCommRecruitExists(findRecruitResults.getStr(0));
					}
					if ( findRecruit.notFound() )
					{
						getFormModel().getSCommPlanBlock().setCommRecruitExists(toStr("N"));
					}
					findRecruit.close();
					// 
					//Setting query parameters
					findAdmit.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findAdmit.
					findAdmit.open();
					ResultSet findAdmitResults = findAdmit.fetchInto();
					if ( findAdmitResults != null ) {
						getFormModel().getSCommPlanBlock().setCommAdmitExists(findAdmitResults.getStr(0));
					}
					if ( findAdmit.notFound() )
					{
						getFormModel().getSCommPlanBlock().setCommAdmitExists(toStr("N"));
					}
					findAdmit.close();
					// 
					//Setting query parameters
					findStudent.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findStudent.
					findStudent.open();
					ResultSet findStudentResults = findStudent.fetchInto();
					if ( findStudentResults != null ) {
						getFormModel().getSCommPlanBlock().setCommStudentExists(findStudentResults.getStr(0));
					}
					if ( findStudent.notFound() )
					{
						getFormModel().getSCommPlanBlock().setCommStudentExists(toStr("N"));
					}
					findStudent.close();
					//   use comm plan rules to identify new comm plan
					//   only one of the new plans is retreived this is
					//   just a check to see if there are new plans.  the
					//   value retreived is never used
					//   use comm plan rules to identify new comm plan
					cplnCode = toStr(null);
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					cplnCode = Sokcomm.fTestplan(/*pPidm=>*/getFormModel().getSCommPlanBlock().getCplnPidm(), /*pCplnType=>*/getFormModel().getSCommPlanBlock().getCplnTypeInd(), /*pTermCode=>*/getFormModel().getSCommPlanBlock().getCplnTermCode(), /*pSeqno=>*/getFormModel().getSCommPlanBlock().getCplnSeqno());
					// 
					if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("R") )
					{
						getFormModel().getSCommPlanBlock().setNewCplnCode(cplnCode);
						recruitPlan = cplnCode;
					}
					else if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") ) {
						getFormModel().getSCommPlanBlock().setNewCplnCode(cplnCode);
						admitPlan = cplnCode;
					}
					else {
						getFormModel().getSCommPlanBlock().setNewCplnCode(cplnCode);
						studentPlan = cplnCode;
					}
					if ( getFormModel().getSCommPlanBlock().getCommAction().equals("2") )
					{
						getFormModel().getSCommPlanBlock().setNewCplnCode(toStr(""));
					}
				}
				// 
				//   Find if action required on old plan or on new plan.
				// 
				if ((getFormModel().getSCommPlanBlock().getCommAction().equals("2") && ((getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("S") && (getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("Y") || getFormModel().getSCommPlanBlock().getCommAdmitExists().equals("Y"))) || (getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") && getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("Y")) || (!getFormModel().getSCommPlanBlock().getOldCplnCode().isNull()))))
				{
					executeAction("insert_new_comm_plan");
					getFormModel().getSCommPlanBlock().setCommResult(toStr("Y"));
				}
				if ( getFormModel().getSCommPlanBlock().getCommAction().equals("4") && !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() )
				{
					executeAction("insert_new_comm_plan");
					getFormModel().getSCommPlanBlock().setCommResult(toStr("Y"));
				}
				if ( getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() && getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("N") && getFormModel().getSCommPlanBlock().getCommAdmitExists().equals("N") )
				{
					executeAction("insert_new_comm_plan");
					 return;
				}
				if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") && getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() && getFormModel().getSCommPlanBlock().getCommRecruitExists().equals("N") )
				{
					executeAction("insert_new_comm_plan");
					return;
				}
				if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("R") && getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
				{
					executeAction("insert_new_comm_plan");
					return;
				}
//				 ACTION_NEEDED:;
//				//  if ( :new_cpln_code <> '' or :new_cpln_code is not null )
//				//  	or ( :comm_action in ('2', '4')  )  then 
//				//   always execute procedure to insert new comm plan so that 
//				//   materials for dept, major, learner styp and admit will be 
//				//   executed 
//				executeAction("insert_new_comm_plan");
//				//  end if;
//				getFormModel().getSCommPlanBlock().setCommResult(toStr("Y"));
//				 EXIT_PROCEDURE:;
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.INSERT_NEW_COMM_PLAN
		 --  this logic first checks to see if the comm plan in the
--  cpln variables already exists.  If not, it will insert the
--  comm plan.  These variables are set in the mod_comm_plan 
--  program unit and the form level trigger test_comm_process

:insert_complete := 'N';
declare 
	insert_cnt NUMBER := 0;
	new_cpln VARCHAR2(200) := NULL; 
BEGIN
-- always execute new comm plan to check for dept, major and learner styp,admit
-- materials
-- IF :NEW_CPLN_CODE is not null then
     insert_cnt :=  sokcomm.f_insert_sobcpln( 
               p_pidm => :cpln_pidm,  
               p_cpln_type =>  :cpln_type_ind,  
               p_seqno =>  :cpln_seqno,
               p_term_code =>  :cpln_term_code, 
               p_initial_date_ind => 'Y', 
               P_new_cpln => new_cpln  ); 
      If insert_cnt > 0 then 
       :insert_complete := 'Y';
     end if; 
-- end if;

END;

  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.INSERT_NEW_COMM_PLAN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INSERT_NEW_COMM_PLAN")
		public void Soqolib_InsertNewCommPlan()
		{
			
				//   this logic first checks to see if the comm plan in the
				//   cpln variables already exists.  If not, it will insert the
				//   comm plan.  These variables are set in the mod_comm_plan 
				//   program unit and the form level trigger test_comm_process
				//   this logic first checks to see if the comm plan in the
				//   cpln variables already exists.  If not, it will insert the
				//   comm plan.  These variables are set in the mod_comm_plan 
				//   program unit and the form level trigger test_comm_process
				getFormModel().getSCommPlanBlock().setInsertComplete(toStr("N"));
				{
					NNumber insertCnt = toNumber(0);
					NString newCpln = NString.getNull();
					Ref<NString> p_new_cpln_ref = new Ref<NString>(newCpln);
					//  always execute new comm plan to check for dept, major and learner styp,admit
					//  materials
					//  IF :NEW_CPLN_CODE is not null then
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					insertCnt = Sokcomm.fInsertSobcpln(
							/*pPidm=>*/getFormModel().getSCommPlanBlock().getCplnPidm(), 
							/*pCplnType=>*/getFormModel().getSCommPlanBlock().getCplnTypeInd(),
							/*pTermCode=>*/getFormModel().getSCommPlanBlock().getCplnTermCode(),
							/*pSeqno=>*/getFormModel().getSCommPlanBlock().getCplnSeqno(), 
							/*pInitialDateInd=>*/toStr("Y"), 
							p_new_cpln_ref);
					
					
					
					if ( insertCnt.greater(0) )
					{
						getFormModel().getSCommPlanBlock().setInsertComplete(toStr("Y"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.KEY-OTHERS
		 MESSAGE
( G$_NLS.Get('SOQOLIB-0046', 'FORM','Undefined function key. Press <Show Keys> for a list of valid keys.') );
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.KEY-OTHERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-OTHERS")
		public void Soqolib_KeyOthers()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0046"), toStr("FORM"), toStr("*Error* Undefined Function Key. Press <Show Keys> for a list of valid keys.")));
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURRICULUM_COMMIT
		 
declare 
	data_check  number := 0; 
	err_number  number := 0;
	error_msg   varchar2(2000) := null;
	module_ind  varchar2(1) := null;
	error_item  varchar2(50) := null;
	p_lcur_rowid_out  varchar2(18) := null;
	p_sorlcur_row_out sb_curriculum.curriculum_rec; 
	p_lfos_rowid_out  varchar2(18) := null;
	p_sorlfos_row_out sb_fieldofstudy.fieldofstudy_rec; 
	d_majr_code   sorlfos.sorlfos_majr_code%type := null;
	d_dept_code   sorlfos.sorlfos_dept_code%type := null;
  d_lfos_rule   sorlfos.sorlfos_lfos_rule%type := null;
  d_attach_rule sorlfos.sorlfos_lfos_rule%type := null;
  d_catlg_term  sorlfos.sorlfos_term_code_ctlg%type := null; 

begin
	

case :s$_curricula.module_code
  when  sb_curriculum_str.f_learner then 
     module_ind := 'S';
  when  sb_curriculum_str.f_admissions then 
     module_ind := 'A';
  when  sb_curriculum_str.f_recruit then 
     module_ind := 'R';
  when  sb_curriculum_str.f_outcome then 
     module_ind := 'H';
  else 
	   module_ind := 'S';
	end case; 

:s$_curricula.CURRIC_COMMIT_ERROR_MSG := ''; 
if :s$_curricula.module_code = sb_curriculum_str.f_learner then 
	soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
	p_term_code =>  :s$_curricula.module_term_code ,
   -- p_term_code => nvl(:s$_curricula.module_end_term, :s$_curricula.module_term_code),
    p_lmod_code => :s$_curricula.module_code); 
end if;

 
soklcur.p_lcur_priority 
 ( p_lmod => :s$_curricula.module_code, 
   p_pidm => :s$_curricula.module_pidm,
   p_term_code => :s$_curricula.module_term_code,
   p_keyseqno => :s$_curricula.module_key_seqno,
   p_act_date => NULL,
   p_priority => 1,
   p_sorlcur_row => p_sorlcur_row_out,
   p_lcur_rowid =>p_lcur_rowid_out);
 
IF p_lcur_rowid_out is null then 
	 :s$_curricula.CURRIC_COMMIT_ERROR_MSG := 
	     G$_NLS.Get('SOQOLIB-0047', 'FORM','*Error* Your changes could not be saved, you must enter a primary curriculum.') ; 
	 gb_common.p_rollback;
	 G$_CHECK_FAILURE;  
   message( :s$_curricula.CURRIC_COMMIT_ERROR_MSG ); 
	 raise form_trigger_failure; 
END IF; 
   
soklcur.p_lfos_priority
  (p_lmod => :s$_curricula.module_code, 
   p_lcur_seqno  => p_sorlcur_row_out.r_seqno,
   p_lfst_code =>  sb_fieldofstudy_str.f_major,
   p_pidm     =>   :s$_curricula.module_pidm,
   p_term_code =>  :s$_curricula.module_term_code,
   p_act_date  =>  NULL,
   p_priority   => 1,
   d_majr_code   => d_majr_code,
   d_dept_code  => d_dept_code, 
   d_lfos_rule   => d_lfos_rule, 
   d_attach_rule => d_attach_rule,
   d_catlg_term  => d_catlg_term, 
   d_lfos_rowid  => p_lfos_rowid_out); 
    
  

sokcurr.P_VerifyData(:s$_curricula.module_code, 
     p_sorlcur_row_out.r_term_code_ctlg , 
     p_sorlcur_row_out.r_camp_code ,
     p_sorlcur_row_out.r_coll_code ,
     p_sorlcur_row_out.r_degc_code ,
     p_sorlcur_row_out.r_levl_code ,
     p_sorlcur_row_out.r_program ,
     d_majr_code,
     d_dept_code,
     data_check); 
    
err_number := sokcurr.F_CheckModuleData(module_ind, data_check);
IF err_number > 0   THEN
    error_item := substr(sokcmsg.F_SORLCURErrorItem( 'D', err_number),1,40);
    error_msg :=  sokcmsg.F_SorlcurErrormsg('F', 'D',  err_number);
    IF error_msg IS NOT NULL THEN 
	    :s$_curricula.CURRIC_COMMIT_ERROR_MSG :=
	       G$_NLS.Get('SOQOLIB-0048', 'FORM',
	'%01%. Your changes could not be saved.' 
	, error_msg ); 
	    :system.message_level := '5';
	    gb_common.p_rollback;
 	    G$_CHECK_FAILURE;
	    :system.message_level := '0';  
      message( :s$_curricula.CURRIC_COMMIT_ERROR_MSG ); 
	    raise form_trigger_failure; 
    END IF;
END IF; 

       
soklcur.p_backload_curr (
          p_lmod      => :s$_curricula.module_code,    
          p_term_code  => :s$_curricula.module_term_code,   
          p_keyseqno  => :s$_curricula.module_key_seqno,   
          p_pidm   =>   :s$_curricula.module_pidm    );

:s$_curricula.sorlcur_block_status := 'N';

soklcur.p_delete_sotvcur(p_pidm =>:s$_curricula.module_pidm);


EXCEPTION
	WHEN OTHERS THEN 
	   IF :s$_curricula.CURRIC_COMMIT_ERROR_MSG IS NOT NULL
	   	 THEN 
	   	 NULL; 
	   else 
	   	 raise;
	   END IF; 

END;
 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURRICULUM_COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURRICULUM_COMMIT")
		public void Soqolib_CurriculumCommit()
		{
			
				{
					NNumber dataCheck = toNumber(0);
					NNumber errNumber = toNumber(0);
					NString errorMsg = NString.getNull();
					NString moduleInd = NString.getNull();
					NString errorItem = NString.getNull();
					NString pLcurRowidOut = NString.getNull();
					SbCurriculum.CurriculumRecRow pSorlcurRowOut= null;
					NString pLfosRowidOut = NString.getNull();
					SbFieldofstudy.FieldofstudyRecRow pSorlfosRowOut= null;
					NString dMajrCode = NString.getNull();
					NString dDeptCode = NString.getNull();
					NNumber dLfosRule = NNumber.getNull();
					NNumber dAttachRule = NNumber.getNull();
					NString dCatlgTerm = NString.getNull();
					try
					{
						if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
						{
							moduleInd = toStr("S");
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
						{
							moduleInd = toStr("A");
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
						{
							moduleInd = toStr("R");
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
						{
							moduleInd = toStr("H");
						}
						else {
							moduleInd = toStr("S");
						}
						getFormModel().getSCurricula().setCurricCommitErrorMsg(toStr(""));
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<Object> p_sorlcur_row_ref = new Ref<Object>(pSorlcurRowOut);
						Ref<NString> p_lcur_rowid_ref = new Ref<NString>(pLcurRowidOut);
						Soklcur.pLcurPriority(/*pLmod=>*/getFormModel().getSCurricula().getModuleCode(), /*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), toDate(/*pActDate=>*/null), toNumber(/*pPriority=>*/1),  new Ref<CurriculumRecRow>(pSorlcurRowOut), p_lcur_rowid_ref);
						
						
						
						pSorlcurRowOut = (CurriculumRecRow) p_sorlcur_row_ref.val;
						pLcurRowidOut = p_lcur_rowid_ref.val;
						if ( pLcurRowidOut.isNull() )
						{
							getFormModel().getSCurricula().setCurricCommitErrorMsg(GNls.Fget(toStr("SOQOLIB-0047"), toStr("FORM"), toStr("*Error* Your changes could not be saved, you must enter a primary curriculum.")));
							GbCommon.pRollback();
							getContainer().getGoqrpls().gCheckFailure();
							errorMessage(getFormModel().getSCurricula().getCurricCommitErrorMsg());
							throw new ApplicationException();
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> d_majr_code_ref = new Ref<NString>(dMajrCode);
						Ref<NString> d_dept_code_ref = new Ref<NString>(dDeptCode);
						Ref<NNumber> d_lfos_rule_ref = new Ref<NNumber>(dLfosRule);
						Ref<NNumber> d_attach_rule_ref = new Ref<NNumber>(dAttachRule);
						Ref<NString> d_catlg_term_ref = new Ref<NString>(dCatlgTerm);
						Ref<NString> d_lfos_rowid_ref = new Ref<NString>(pLfosRowidOut);
						Soklcur.pLfosPriority(/*pLmod=>*/getFormModel().getSCurricula().getModuleCode(), /*pLcurSeqno=>*/pSorlcurRowOut.RSeqno, /*pLfstCode=>*/SbFieldofstudyStr.fMajor(), /*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), toDate(/*pActDate=>*/null), toNumber(/*pPriority=>*/1), d_majr_code_ref, d_dept_code_ref, d_lfos_rule_ref, d_attach_rule_ref, d_catlg_term_ref, d_lfos_rowid_ref);
						dMajrCode = d_majr_code_ref.val;
						dDeptCode = d_dept_code_ref.val;
						dLfosRule = d_lfos_rule_ref.val;
						dAttachRule = d_attach_rule_ref.val;
						dCatlgTerm = d_catlg_term_ref.val;
						pLfosRowidOut = d_lfos_rowid_ref.val;
						Ref<NNumber> data_chk_ref = new Ref<NNumber>(dataCheck);
						Sokcurr.pVerifydata(getFormModel().getSCurricula().getModuleCode(), pSorlcurRowOut.RTermCodeCtlg, pSorlcurRowOut.RCampCode, pSorlcurRowOut.RCollCode, pSorlcurRowOut.RDegcCode, pSorlcurRowOut.RLevlCode, pSorlcurRowOut.RProgram, dMajrCode, dDeptCode, data_chk_ref);
						dataCheck = data_chk_ref.val;
						errNumber = Sokcurr.fCheckmoduledata(moduleInd, dataCheck);
						if ( errNumber.greater(0) )
						{
							errorItem = substring(Sokcmsg.fSorlcurerroritem(toStr("D"), errNumber), toInt(1), toInt(40));
							errorMsg = Sokcmsg.fSorlcurerrormsg(toStr("F"), toStr("D"), errNumber);
							if ( !errorMsg.isNull() )
							{
								getFormModel().getSCurricula().setCurricCommitErrorMsg(GNls.Fget(toStr("SOQOLIB-0048"), toStr("FORM"), toStr("%01%. Your changes could not be saved."), errorMsg));
								// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
								GbCommon.pRollback();
								getContainer().getGoqrpls().gCheckFailure();
								// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
								errorMessage(getFormModel().getSCurricula().getCurricCommitErrorMsg());
								throw new ApplicationException();
							}
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pBackloadCurr(/*pLmod=>*/getFormModel().getSCurricula().getModuleCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), /*pPidm=>*/getFormModel().getSCurricula().getModulePidm());
						getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("N"));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm());
					}
					catch(Exception  e)
					{
						if ( !getFormModel().getSCurricula().getCurricCommitErrorMsg().isNull() )
						{
						}
						else {
							throw  e;
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.NEW_SORLCUR_INST
		 
set_curric_properties('SORLCUR_LMOD_CODE','visible','property_false');
set_curric_properties('SORLCUR_LMOD_CODE_DESC','visible','property_false');
set_curric_properties('SORLCUR_LMOD_CODE_LBT','visible','property_false');
set_curric_properties('LCUR_LMOD_CODE_DISPLAY','visible','property_false');
set_curric_properties('SORLCUR_SEQNO','visible','property_false');
set_curric_properties('SORLFOS_SEQNO','visible','property_false');
set_curric_properties('LCUR_SEQNO_DISPLAY','visible','property_false');


if :s$_curricula.module_code <> sb_curriculum_str.f_learner then 
	set_curric_properties('LCUR_ROLLED_KEY_SEQNO','visible','property_false');
	set_curric_properties('SOVLCUR_APPL_KEY_SEQNO','visible','property_false');
  set_curric_properties('LFOS_ROLLED_IND','visible','property_false');
	set_curric_properties('SORLCUR_TERM_CODE_MATRIC','visible','property_false');
	set_curric_properties('SORLCUR_TERM_CODE_ADMIT','visible','property_false');
	set_curric_properties('SORLCUR_MATRIC_TERM_DESC','visible','property_false');
	set_curric_properties('SORLCUR_ADMT_TERM_DESC','visible','property_false');
	set_curric_properties('SORLCUR_TERM_CODE_END','visible','property_false');
	set_curric_properties('SORLCUR_END_TERM_DESC','visible','property_false');
	set_curric_properties('SORLCUR_ADMT_CODE','visible','property_false');
	set_curric_properties('SORLCUR_ADMT_DESC','visible','property_false');
	set_curric_properties('SORLCUR_TERM_CODE_MATRIC_LBT','visible','property_false');
	set_curric_properties('SORLCUR_TERM_CODE_ADMIT_LBT','visible','property_false');
  set_curric_properties('SORLCUR_TERM_CODE_END_LBT','visible','property_false');
	set_curric_properties('SORLCUR_ADMT_CODE_LBT','visible','property_false');
 	set_curric_properties('SORLCUR_ROLL_IND','visible','property_false');
  set_radio_button_property('SORLCUR_ROLL_IND','YES_ROLL', visible,property_false);
	set_curric_properties('sorlcur_rate_code_lbt','visible','property_false');
	set_curric_properties('sorlcur_rate_code','visible','property_false');
	set_curric_properties('sorlcur_rate_code_desc','visible','property_false');
	set_curric_properties('sorlcur_styp_code_lbt','visible','property_false');
	set_curric_properties('sorlcur_styp_code','visible','property_false');
	set_curric_properties('sorlcur_styp_code_desc','visible','property_false');
	set_curric_properties('sorlcur_site_code','visible','property_false');
	set_curric_properties('sorlcur_site_code_lbt','visible','property_false');
	set_curric_properties('sorlcur_site_code_desc','visible','property_false');
	set_curric_properties('sorlcur_leav_code_lbt','visible','property_false');
	set_curric_properties('sorlcur_acyr_code_lbt','visible','property_false');
	set_curric_properties('sorlcur_term_code_grad_lbt','visible','property_false');
	set_curric_properties('sorlcur_leav_from_date_dbt','visible','property_false');
	set_curric_properties('sorlcur_leav_to_date_dbt','visible','property_false');
	set_curric_properties('sorlcur_exp_grad_date_dbt','visible','property_false');
	set_curric_properties('sorlcur_leav_code','visible','property_false');
	set_curric_properties('sorlcur_acyr_code','visible','property_false');
	set_curric_properties('sorlcur_term_code_grad','visible','property_false');
	set_curric_properties('sorlcur_leav_from_date','visible','property_false');
	set_curric_properties('sorlcur_leav_to_date','visible','property_false');
	set_curric_properties('sorlcur_exp_grad_date','visible','property_false');
	set_curric_properties('sorlcur_leav_code_desc','visible','property_false');
	set_curric_properties('sorlcur_acyr_code_desc','visible','property_false');
	set_curric_properties('sorlcur_term_code_grad_desc','visible','property_false');
  set_curric_properties('apply_to_graduate_btn','visible','property_false');
  set_curric_properties('roll_to_outcome_btn','visible','property_false');
  if :s$_curricula.module_code <>  sb_curriculum_str.f_outcome then 
     set_curric_properties('sorlcur_gapp_seqno','visible','property_false');
  end if; 
  set_curric_properties('sorlcur_key_seqno_lbt','visible','property_false');
 
  	
end if; 
 

default_value('', 'global.curr_rule');
default_value('', 'global.program');
default_value('', 'global.campus');
default_value('', 'global.degree_code');
default_value('', 'global.college');
default_value('', 'global.level_rule');
default_value('', 'global.sel_ind'); 
default_value('','GLOBAL.ATTACHED_MAJOR');
default_value('','GLOBAL.LFOS_CONC_RULE'); 

DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_NO');
DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_INC');

DEFAULT_VALUE('','GLOBAL.RECRUIT_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_PROGRAM');

DEFAULT_VALUE('','GLOBAL.ADMISSIONS_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_PROGRAM');

DEFAULT_VALUE('','GLOBAL.LEARNER_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_PROGRAM');

DEFAULT_VALUE('','GLOBAL.OUTCOME_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_PROGRAM');

DEFAULT_VALUE('','GLOBAL.CURRICULUM_QUERY');
-- save initial sobcurr term so we don't have to keep requering it
DEFAULT_VALUE('','GLOBAL.INIT_CURR_TERM');

-- 8.3 study path
default_value('','global.study_path'); 

:lcur_levl_field := 'SORLCUR_LEVL_CODE';
:lcur_camp_field := 'SORLCUR_CAMP_CODE';
:lcur_coll_field := 'SORLCUR_COLL_CODE';
:lcur_degc_field := 'SORLCUR_DEGC_CODE';
:lcur_program_field := 'SORLCUR_PROGRAM';

case :s$_curricula.module_code 
      when sb_curriculum_str.f_learner then 
         :module_ind := 'S';
      when sb_curriculum_str.f_outcome then 
         :module_ind := 'H';
      when sb_curriculum_str.f_admissions then 
         :module_ind := 'A';
      when sb_curriculum_str.f_recruit then 
         :module_ind := 'R';
      else 
    	   :module_ind := 'X';
end case;

soklcur.p_default_status (
         p_pidm        => :s$_curricula.module_pidm,
         p_lmod_code   => :s$_curricula.module_code,
         p_term_code   => :s$_curricula.module_term_code,
         p_keyseqno    => :s$_curricula.module_key_seqno, 
         p_stst_code   => :s$_curricula.module_stst_code,
         p_degs_code   => :s$_curricula.module_degs_code,
         p_cact_out    => :s$_curricula.default_cact,
         p_csts_out    => :s$_curricula.default_csts );

declare 
	init_term  varchar2(6) := '';
  cursor sobcurr_min_c is 
      select nvl(min(sobcurr_term_code_init),'999999')
      from sobcurr ;
      
begin
  select sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind,
    nvl(sobctrl_priority_no,1), nvl(sobctrl_priority_incr,1),
    sobctrl_study_path_ind
   into :lcur_sobctrl_curr_rule_ind, :lcur_sobctrl_program_ind, :lcur_sobctrl_conc_ind,
     :global.sobctrl_priority_no, :global.sobctrl_priority_incr  ,
     :global.study_path                  
   from sobctrl;
 
  :lcur_temp_rule_ind := :lcur_sobctrl_curr_rule_ind;
  :lcur_original_curr_ind := :lcur_sobctrl_curr_rule_ind;

  if :GLOBAL.init_curr_term IS NULL THEN
  	 open sobcurr_min_c;
  	 fetch sobcurr_min_c into init_term;
  	 if sobcurr_min_c%notfound then 
  	 	  init_term := '999999';
  	 end if;
  	 close sobcurr_min_c;
  	 :global.init_curr_term := init_term;
   end if;
    if  :global.init_curr_term <= :s$_curricula.module_term_code then
      :lcur_temp_rule_ind := 'Y';
   else -- turn curriculum checking off if term is less then the initial sobcurr term
      :lcur_temp_rule_ind := 'N';
   end if; 
end;
if nvl(:global.study_path,'N') = 'N' and get_item_property('sorlcur_key_seqno_lbt',visible) = 'TRUE'  then 
    set_curric_properties('sorlcur_key_seqno_lbt','visible','property_false'); 
end if; 
if nvl(:global.study_path,'N') = 'Y' and get_item_property('sorlcur_key_seqno',visible) = 'TRUE' 
	and :s$_curricula.module_code = sb_curriculum_str.f_learner then 
   set_item_property('sorlcur_key_seqno',PROMPT_TEXT,g$_nls.get('SOQOLIB-0049','FORM','Study Path:')); 
end if; 
if nvl(:global.study_path,'N') = 'Y' and get_item_property('LCUR_KEY_SEQNO_DISPLAY',visible) = 'TRUE' 
	and :s$_curricula.module_code = sb_curriculum_str.f_learner then 
  set_item_property('LCUR_KEY_SEQNO_DISPLAY',PROMPT_TEXT,g$_nls.get('SOQOLIB-0050','FORM','Study Path:')); 
end if; 

 
  
  soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
    p_term_code => :s$_curricula.module_term_code ,
    p_lmod_code => :s$_curricula.module_code);

 if get_block_property('SORLCUR', STATUS) != 'CHANGED'  then 
		  :system.message_level := '5';
		  go_block('SORLCUR');
		  g$_check_failure;
		  clear_block;
		  execute_query;
		  last_record;
		  :lcur_rec_cnt := :system.cursor_record;
		  first_record;
		  -- only goto sorlfos if there are any sorlcur records 
		  if :sovlcur_rowid is not null then 
			  go_block('SORLFOS');
  		  g$_check_failure;
			  clear_block;
			  g$_check_failure;
			  execute_query;
			  g$_check_failure;
			  last_record;
			  g$_check_failure;
			  :lfos_rec_num := :system.cursor_record;
			  go_block('SORLCUR');
  		  g$_check_failure;
		  else 
		  	go_block('SORLFOS');
 			  g$_check_failure;
			  clear_block;
			  :lfos_rec_num := 0; 
			  go_block('SORLCUR');
		  end if;
		  :system.message_level := '0'; 
		 	
		 	-- the following executes if user does a prev block from block beyond 
		 	-- the curriculum window,  the prev block needs to take user to the 
		 	-- sorlfos block
		 	if :s$_curricula.sorlfos_next_block_nav = 'SORLFOS' and 
		 		:lcur_rec_cnt > 0 and :sovlcur_rowid is not null then 
		 		 :s$_curricula.sorlfos_next_block_nav := null;
			   :system.message_level := '5';
				 go_block('SORLFOS');
		 		 g$_check_failure;
		 		 execute_query;
		 		 g$_check_failure;
		 		 :system.message_level := '0';
		 	end if;
 	Else  -- sorlcur was changed 
	 	go_block('SORLCUR');
	 	g$_check_failure;
	 	last_record;
	  g$_check_failure;
	  :lcur_rec_cnt := :system.cursor_record;
	  first_record;
	  g$_check_failure;
	  if :sovlcur_rowid is not null then 
		  go_block('SORLFOS');
	 	  g$_check_failure;
	 	  execute_query;
	 	  g$_check_failure;
		  last_record;
	 	  g$_check_failure;
		  :lfos_rec_num := :system.cursor_record; 
		  go_block('SORLCUR');
	 	 end if;	
 end if; --- sorlcur changed

 if :sovlcur_rowid is null 
  then 
   execute_trigger('default_tab_curricula');
   g$_check_failure;
 else 
  execute_trigger('populate_sotlcur');
  g$_check_failure;
 end if; 

    
:s$_curricula.curricula_updated := null;  
:s$_curricula.sorlcur_block_status := 'Y';
:s$_curricula.default_level := ''; 
:s$_curricula.default_college := '';
:s$_curricula.default_campus := '';
:s$_curricula.default_degree := '';
:s$_curricula.default_program := '';
:s$_curricula.default_major := ''; 
 -- do not reset default major, use it to determine if we need to query the block when we do
 -- next block from sorlcur

set_canvas_property('CURRICULA_CANVAS',TOPMOST_TAB_PAGE,
           'CURRICULUM_TAB');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.NEW_SORLCUR_INST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NEW_SORLCUR_INST")
		public void Soqolib_NewSorlcurInst()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_LMOD_CODE"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_LMOD_CODE_DESC"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_LMOD_CODE_LBT"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("LCUR_LMOD_CODE_DISPLAY"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_SEQNO"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_SEQNO"), toStr("visible"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("LCUR_SEQNO_DISPLAY"), toStr("visible"), toStr("property_false"));
				if ( getFormModel().getSCurricula().getModuleCode().notEquals(SbCurriculumStr.fLearner()) )
				{
					this.getContainer().getServices().setCurricProperties(toStr("LCUR_ROLLED_KEY_SEQNO"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SOVLCUR_APPL_KEY_SEQNO"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("LFOS_ROLLED_IND"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_MATRIC"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_ADMIT"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_MATRIC_TERM_DESC"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_ADMT_TERM_DESC"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_END"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_END_TERM_DESC"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_ADMT_CODE"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_ADMT_DESC"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_MATRIC_LBT"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_ADMIT_LBT"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_END_LBT"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_ADMT_CODE_LBT"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_ROLL_IND"), toStr("visible"), toStr("property_false"));
					setRadioButtonVisible("SORLCUR_ROLL_IND", "YES_ROLL", false);
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_desc"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("visible"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("visible"), toStr("property_false"));
					if ( getFormModel().getSCurricula().getModuleCode().notEquals(SbCurriculumStr.fOutcome()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_gapp_seqno"), toStr("visible"), toStr("property_false"));
					}
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("visible"), toStr("property_false"));
				}
				setDefaultValue("", "global.curr_rule");
				setDefaultValue("", "global.program");
				setDefaultValue("", "global.campus");
				setDefaultValue("", "global.degree_code");
				setDefaultValue("", "global.college");
				setDefaultValue("", "global.level_rule");
				setDefaultValue("", "global.sel_ind");
				setDefaultValue("", "GLOBAL.ATTACHED_MAJOR");
				setDefaultValue("", "GLOBAL.LFOS_CONC_RULE");
				setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_NO");
				setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_INC");
				setDefaultValue("", "GLOBAL.RECRUIT_LMOD_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_CAMP_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_COLL_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_LEVL_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_DEGC_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_MAJR_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_DEPT_CODE");
				setDefaultValue("", "GLOBAL.RECRUIT_PROGRAM");
				setDefaultValue("", "GLOBAL.ADMISSIONS_LMOD_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_CAMP_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_COLL_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_LEVL_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_DEGC_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_MAJR_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_DEPT_CODE");
				setDefaultValue("", "GLOBAL.ADMISSIONS_PROGRAM");
				setDefaultValue("", "GLOBAL.LEARNER_LMOD_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_CAMP_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_COLL_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_LEVL_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_DEGC_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_MAJR_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_DEPT_CODE");
				setDefaultValue("", "GLOBAL.LEARNER_PROGRAM");
				setDefaultValue("", "GLOBAL.OUTCOME_LMOD_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_CAMP_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_COLL_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_LEVL_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_DEGC_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_MAJR_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_DEPT_CODE");
				setDefaultValue("", "GLOBAL.OUTCOME_PROGRAM");
				setDefaultValue("", "GLOBAL.CURRICULUM_QUERY");
				//  save initial sobcurr term so we don't have to keep requering it
				setDefaultValue("", "GLOBAL.INIT_CURR_TERM");
				//  8.3 study path
				setDefaultValue("", "global.study_path");
				getFormModel().getSCurricula().setLcurLevlField(toStr("SORLCUR_LEVL_CODE"));
				getFormModel().getSCurricula().setLcurCampField(toStr("SORLCUR_CAMP_CODE"));
				getFormModel().getSCurricula().setLcurCollField(toStr("SORLCUR_COLL_CODE"));
				getFormModel().getSCurricula().setLcurDegcField(toStr("SORLCUR_DEGC_CODE"));
				getFormModel().getSCurricula().setLcurProgramField(toStr("SORLCUR_PROGRAM"));
				if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
				{
					getFormModel().getSCurrProcBlock().setModuleInd(toStr("S"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
				{
					getFormModel().getSCurrProcBlock().setModuleInd(toStr("H"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
				{
					getFormModel().getSCurrProcBlock().setModuleInd(toStr("A"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
				{
					getFormModel().getSCurrProcBlock().setModuleInd(toStr("R"));
				}
				else {
					getFormModel().getSCurrProcBlock().setModuleInd(toStr("X"));
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Ref<NString> p_cact_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCact());
				Ref<NString> p_csts_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCsts());
				
				Soklcur.pDefaultStatus(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), /*pStstCode=>*/getFormModel().getSCurricula().getModuleStstCode(), /*pDegsCode=>*/getFormModel().getSCurricula().getModuleDegsCode(), /*pCactOut=>*/getFormModel().getSCurricula().getDefaultCact(), p_cact_out_ref,p_csts_out_ref);
				getFormModel().getSCurricula().setDefaultCsts(p_cact_out_ref.val);
				{
					NString initTerm = toStr("");
					String sqlsobcurrMinC = "SELECT nvl(min(sobcurr_term_code_init), '999999') " +
	" FROM sobcurr ";
					DataCursor sobcurrMinC = new DataCursor(sqlsobcurrMinC);
					String sql1 = "SELECT sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind, nvl(sobctrl_priority_no, 1), nvl(sobctrl_priority_incr, 1), sobctrl_study_path_ind " +
	" FROM sobctrl ";
					DataCommand command1 = new DataCommand(sql1);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(results1.getStr(0));
						getFormModel().getSCurricula().setLcurSobctrlProgramInd(results1.getStr(1));
						getFormModel().getSCurricula().setLcurSobctrlConcInd(results1.getStr(2));
						setGlobal("SOBCTRL_PRIORITY_NO", results1.getStr(3));
						setGlobal("SOBCTRL_PRIORITY_INCR", results1.getStr(4));
						setGlobal("STUDY_PATH", results1.getStr(5));
					}
					results1.close();
					getFormModel().getSCurricula().setLcurTempRuleInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
					getFormModel().getSCurricula().setLcurOriginalCurrInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
					if ( getGlobal("INIT_CURR_TERM").isNull() )
					{
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sobcurrMinC.
						sobcurrMinC.open();
						ResultSet sobcurrMinCResults = sobcurrMinC.fetchInto();
						if ( sobcurrMinCResults != null ) {
							initTerm = sobcurrMinCResults.getStr(0);
						}
						if ( sobcurrMinC.notFound() )
						{
							initTerm = toStr("999999");
						}
						sobcurrMinC.close();
						setGlobal("INIT_CURR_TERM", initTerm);
					}
					if ( getGlobal("INIT_CURR_TERM").lesserOrEquals(getFormModel().getSCurricula().getModuleTermCode()) )
					{
						getFormModel().getSCurricula().setLcurTempRuleInd(toStr("Y"));
					}
					else {
						//  turn curriculum checking off if term is less then the initial sobcurr term
						getFormModel().getSCurricula().setLcurTempRuleInd(toStr("N"));
					}
				}
				if ( isNull(getGlobal("STUDY_PATH"), "N").equals("N") && getItemVisible("sorlcur_key_seqno_lbt").equals("TRUE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("visible"), toStr("property_false"));
				}
				if ( isNull(getGlobal("STUDY_PATH"), "N").equals("Y") && getItemVisible("sorlcur_key_seqno").equals("TRUE") && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
				{
					setItemPromptText("sorlcur_key_seqno", (GNls.Fget(toStr("SOQOLIB-0049"), toStr("FORM"), toStr("Study Path:")).toString()));
				}
				if ( isNull(getGlobal("STUDY_PATH"), "N").equals("Y") && getItemVisible("LCUR_KEY_SEQNO_DISPLAY").equals("TRUE") && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
				{
					setItemPromptText("LCUR_KEY_SEQNO_DISPLAY", (GNls.Fget(toStr("SOQOLIB-0050"), toStr("FORM"), toStr("Study Path:")).toString()));
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
				if ( !getBlockStatus("SORLCUR").equals("CHANGED") )
				{
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					goBlock(toStr("SORLCUR"));
					getContainer().getGoqrpls().gCheckFailure();
					clearBlock();
					executeQuery();
					lastRecord();
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(getCursorRecord()));
					firstRecord();
					//  only goto sorlfos if there are any sorlcur records 
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						goBlock(toStr("SORLFOS"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						lastRecord();
						getContainer().getGoqrpls().gCheckFailure();
						getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(getCursorRecord()));
						goBlock(toStr("SORLCUR"));
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						goBlock(toStr("SORLFOS"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
						goBlock(toStr("SORLCUR"));
					}
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					//  the following executes if user does a prev block from block beyond 
					//  the curriculum window,  the prev block needs to take user to the 
					//  sorlfos block
					if ( getFormModel().getSCurricula().getSorlfosNextBlockNav().equals("SORLFOS") && getFormModel().getSCurriculaTraditional().getLcurRecCnt().greater(0) && !sorlcurElement.getSovlcurRowid().isNull() )
					{
						getFormModel().getSCurricula().setSorlfosNextBlockNav(toStr(null));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("SORLFOS"));
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
				else {
					//  sorlcur was changed 
					goBlock(toStr("SORLCUR"));
					getContainer().getGoqrpls().gCheckFailure();
					lastRecord();
					getContainer().getGoqrpls().gCheckFailure();
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(getCursorRecord()));
					firstRecord();
					getContainer().getGoqrpls().gCheckFailure();
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						goBlock(toStr("SORLFOS"));
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						lastRecord();
						getContainer().getGoqrpls().gCheckFailure();
						getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(getCursorRecord()));
						goBlock(toStr("SORLCUR"));
					}
				}
				// - sorlcur changed
				if ( sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("default_tab_curricula");
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("populate_sotlcur");
					getContainer().getGoqrpls().gCheckFailure();
				}
				getFormModel().getSCurricula().setCurriculaUpdated(toStr(null));
				getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("Y"));
				getFormModel().getSCurricula().setDefaultLevel(toStr(""));
				getFormModel().getSCurricula().setDefaultCollege(toStr(""));
				getFormModel().getSCurricula().setDefaultCampus(toStr(""));
				getFormModel().getSCurricula().setDefaultDegree(toStr(""));
				getFormModel().getSCurricula().setDefaultProgram(toStr(""));
				getFormModel().getSCurricula().setDefaultMajor(toStr(""));
				//  do not reset default major, use it to determine if we need to query the block when we do
				//  next block from sorlcur
				setCanvasTopMostTabPage("CURRICULA_CANVAS", "CURRICULUM_TAB");
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.QUERY_SORLCUR_LITE
		 DECLARE
	
	hold_block  varchar2(30) := ''; 
	init_term   varchar2(6) := '';
	lcurcnt     number := 0; 
	tcurcnt     number := 0; 
	
  cursor sobcurr_min_c is 
      select nvl(min(sobcurr_term_code_init),'999999')
      from sobcurr ;

BEGIN 


default_value('', 'global.curr_rule');
default_value('', 'global.program');
default_value('', 'global.campus');
default_value('', 'global.degree_code');
default_value('', 'global.college');
default_value('', 'global.level_rule');
default_value('', 'global.sel_ind'); 
default_value('','GLOBAL.ATTACHED_MAJOR');
default_value('','GLOBAL.LFOS_CONC_RULE'); 
DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_NO');
DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_INC');

DEFAULT_VALUE('','GLOBAL.RECRUIT_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_PROGRAM');

DEFAULT_VALUE('','GLOBAL.ADMISSIONS_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.ADMISSIONS_PROGRAM');

DEFAULT_VALUE('','GLOBAL.LEARNER_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_PROGRAM');

DEFAULT_VALUE('','GLOBAL.OUTCOME_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.OUTCOME_PROGRAM');
-- save initial sobcurr term so we don't have to keep requering it
DEFAULT_VALUE('','GLOBAL.INIT_CURR_TERM');

-- 8.3 study path
default_value('','global.study_path'); 

:lcur_levl_field := 'SORLCUR_LEVL_CODE';
:lcur_camp_field := 'SORLCUR_CAMP_CODE';
:lcur_coll_field := 'SORLCUR_COLL_CODE';
:lcur_degc_field := 'SORLCUR_DEGC_CODE';
:lcur_program_field := 'SORLCUR_PROGRAM';
case :s$_curricula.module_code 
      when sb_curriculum_str.f_learner then 
         :module_ind := 'S';
      when sb_curriculum_str.f_outcome then 
         :module_ind := 'H';
      when sb_curriculum_str.f_admissions then 
         :module_ind := 'A';
      when sb_curriculum_str.f_recruit then 
         :module_ind := 'R';
      else 
    	   :module_ind := 'X';
end case;

soklcur.p_default_status (
         p_pidm        => :s$_curricula.module_pidm,
         p_lmod_code   => :s$_curricula.module_code,
         p_term_code   => :s$_curricula.module_term_code,
         p_keyseqno    => :s$_curricula.module_key_seqno, 
         p_stst_code   => :s$_curricula.module_stst_code,
         p_degs_code   => :s$_curricula.module_degs_code,
         p_cact_out    => :s$_curricula.default_cact,
         p_csts_out    => :s$_curricula.default_csts );

 
  select sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind,
     nvl(sobctrl_priority_no,1), nvl(sobctrl_priority_incr,1),
     sobctrl_study_path_ind 
   into :lcur_sobctrl_curr_rule_ind, :lcur_sobctrl_program_ind, :lcur_sobctrl_conc_ind ,
    :global.sobctrl_priority_no, :global.sobctrl_priority_incr ,
    :global.study_path                   
   from sobctrl;
 
  :lcur_temp_rule_ind := :lcur_sobctrl_curr_rule_ind;
  :lcur_original_curr_ind := :lcur_sobctrl_curr_rule_ind;

  if :GLOBAL.init_curr_term IS NULL THEN
  	 open sobcurr_min_c;
  	 fetch sobcurr_min_c into init_term;
  	 if sobcurr_min_c%notfound then 
  	 	  init_term := '999999';
  	 end if;
  	 close sobcurr_min_c;
  	 :global.init_curr_term := init_term;
   end if;
   
   if  :global.init_curr_term <= :s$_curricula.module_term_code then
      :lcur_temp_rule_ind := 'Y';
   else -- turn curriculum checking off if term is less then the initial sobcurr term
      :lcur_temp_rule_ind := 'N';
   end if; 
   if :global.study_path = 'Y' and :s$_curricula.module_code = sb_curriculum_str.f_learner
   	then
   	  set_curric_properties('SORLCUR_KEY_SEQNO','visible','property_true');
   else
   	  set_curric_properties('SORLCUR_KEY_SEQNO','visible','property_false');
   
   end if; 
  
 if :s$_curricula.module_term_code is not null then 
  soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
    p_term_code => :s$_curricula.module_term_code ,
    p_lmod_code => :s$_curricula.module_code); 
 end if; 
 hold_block := :system.current_block; 

 if (:s$_curricula.module_term_code is not null and 
  	:s$_curricula.module_key_seqno is not null and
  	:s$_curricula.module_code = sb_curriculum_str.f_recruit)
  	or (:s$_curricula.module_term_code is not null and  
  	:s$_curricula.module_code = sb_curriculum_str.f_learner) then 
 
  select nvl(count(*),0) into lcurcnt
  from sovlcur
  where sovlcur_pidm = :s$_curricula.module_pidm
  and sovlcur_lmod_code = :s$_curricula.module_code
  and (( sovlcur_term_code = :s$_curricula.module_term_code
   and sovlcur_key_seqno = :s$_curricula.module_key_seqno
   and sovlcur_lmod_code = sb_curriculum_str.f_recruit )
     or sovlcur_lmod_code = sb_curriculum_str.f_learner)
   and sovlcur_current_ind = 'Y'  
   and sovlcur_active_ind = 'Y'; 
     
  select nvl(count(*),0) into tcurcnt
  from sotlcur
  where sotlcur_pidm = :s$_curricula.module_pidm
  and sotlcur_lmod_code = :s$_curricula.module_code
  and (( sotlcur_term_code = :s$_curricula.module_term_code
  and sotlcur_key_seqno = :s$_curricula.module_key_seqno
  and sotlcur_lmod_code = sb_curriculum_str.f_recruit )
    or sotlcur_lmod_code = sb_curriculum_str.f_learner); 
 
 -- if lcurcnt > 0 then -- and tcurcnt = 0 then 
 if ( lcurcnt > 0 and :s$_curricula.module_code = sb_curriculum_str.f_recruit)
 	OR ( lcurcnt > 0 and  tcurcnt = 0 and :s$_curricula.module_code = sb_curriculum_str.f_learner)
 	then 
 -- :system.message_level := '5';
  go_block('SORLCUR_LITE');
  g$_check_failure;
  clear_block(no_validate);
  execute_query;
  g$_check_failure;
  first_record;
  g$_check_failure;
  last_record;
  g$_check_failure;
  :lcur_rec_cnt := :system.cursor_record;
  first_record;
  g$_check_failure;
    
  if ( :lcur_rec_cnt > 1 ) OR (:lcur_rec_cnt = 1 AND :sovlcur_rowid IS NOT NULL) THEN 
  	set_item_property('sorlfos_lfst_code',enabled, property_true);
  	set_item_property('sorlfos_lfst_code', navigable, property_true);
    go_block('SORLFOS_LITE');
    g$_check_failure;
    clear_block(no_validate);
    g$_check_failure;   
    execute_query;
    g$_check_failure;
    last_record;
    g$_check_failure;
    :lfos_rec_num := :system.cursor_record;
    first_record;
    g$_check_failure;
    go_block('SORLCUR_LITE'); 
    g$_check_failure;
    execute_trigger('populate_sotlcur');
    g$_check_failure;	
  else 
  	go_block('SORLFOS_LITE');
  	g$_check_failure;
  	:lfos_rec_num := 0; 
    clear_block;
    go_block('SORLCUR_LITE'); 
    g$_check_failure;	
  end if; 
 -- :system.message_level := '0'; 
  :s$_curricula.curricula_updated := null;
  :s$_curricula.sorlcur_block_status := 'Y';
 
  
  
  end if;  -- end of if lcurcnt > 0 and tcurcnt = 0
  	 
 --  else 
 --   go_block('SORLCUR_LITE');
 --   g$_check_failure;
 --   :s$_curricula.curricula_updated := null;
 --   :s$_curricula.sorlcur_block_status := 'Y';

end if; 
  

if :lcur_rec_num is null or :lcur_rec_num = 0 then 
	if :lcur_rec_cnt = 0 then 
		:lcur_rec_cnt := 1;
	end if; 
	:lcur_rec_num  := 1;
--	:lcur_rec_cnt  := 1; 
end if;
if :lcur_rec_cnt = 0 or :lcur_rec_cnt is null then
	 :lcur_rec_cnt := 1;
end if;
:s$_curricula.default_level := ''; 
:s$_curricula.default_college := '';
:s$_curricula.default_campus := '';
:s$_curricula.default_degree := '';
:s$_curricula.default_program := '';
:s$_curricula.default_options_ind := ''; 
 -- do not reset default major, use it to determine if we need to query the block when we do
 -- next block from sorlcur
 
 
END; 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.QUERY_SORLCUR_LITE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QUERY_SORLCUR_LITE")
		public void Soqolib_QuerySorlcurLite()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NString holdBlock = toStr("");
					NString initTerm = toStr("");
					NNumber lcurcnt = toNumber(0);
					NNumber tcurcnt = toNumber(0);
					String sqlsobcurrMinC = "SELECT nvl(min(sobcurr_term_code_init), '999999') " +
	" FROM sobcurr ";
					DataCursor sobcurrMinC = new DataCursor(sqlsobcurrMinC);
					setDefaultValue("", "global.curr_rule");
					setDefaultValue("", "global.program");
					setDefaultValue("", "global.campus");
					setDefaultValue("", "global.degree_code");
					setDefaultValue("", "global.college");
					setDefaultValue("", "global.level_rule");
					setDefaultValue("", "global.sel_ind");
					setDefaultValue("", "GLOBAL.ATTACHED_MAJOR");
					setDefaultValue("", "GLOBAL.LFOS_CONC_RULE");
					setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_NO");
					setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_INC");
					setDefaultValue("", "GLOBAL.RECRUIT_LMOD_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_CAMP_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_COLL_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_LEVL_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_DEGC_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_MAJR_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_DEPT_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_PROGRAM");
					setDefaultValue("", "GLOBAL.ADMISSIONS_LMOD_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_CAMP_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_COLL_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_LEVL_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_DEGC_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_MAJR_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_DEPT_CODE");
					setDefaultValue("", "GLOBAL.ADMISSIONS_PROGRAM");
					setDefaultValue("", "GLOBAL.LEARNER_LMOD_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_CAMP_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_COLL_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_LEVL_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_DEGC_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_MAJR_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_DEPT_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_PROGRAM");
					setDefaultValue("", "GLOBAL.OUTCOME_LMOD_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_CAMP_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_COLL_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_LEVL_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_DEGC_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_MAJR_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_DEPT_CODE");
					setDefaultValue("", "GLOBAL.OUTCOME_PROGRAM");
					//  save initial sobcurr term so we don't have to keep requering it
					setDefaultValue("", "GLOBAL.INIT_CURR_TERM");
					//  8.3 study path
					setDefaultValue("", "global.study_path");
					getFormModel().getSCurricula().setLcurLevlField(toStr("SORLCUR_LEVL_CODE"));
					getFormModel().getSCurricula().setLcurCampField(toStr("SORLCUR_CAMP_CODE"));
					getFormModel().getSCurricula().setLcurCollField(toStr("SORLCUR_COLL_CODE"));
					getFormModel().getSCurricula().setLcurDegcField(toStr("SORLCUR_DEGC_CODE"));
					getFormModel().getSCurricula().setLcurProgramField(toStr("SORLCUR_PROGRAM"));
					if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("S"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("H"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("A"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("R"));
					}
					else {
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("X"));
					}
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_cact_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCact());
					Ref<NString> p_csts_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCsts());
					
					Soklcur.pDefaultStatus(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), /*pStstCode=>*/getFormModel().getSCurricula().getModuleStstCode(), /*pDegsCode=>*/getFormModel().getSCurricula().getModuleDegsCode(), /*pCactOut=>*/getFormModel().getSCurricula().getDefaultCact(), p_cact_out_ref, p_csts_out_ref);
					getFormModel().getSCurricula().setDefaultCsts(p_cact_out_ref.val);
					String sql1 = "SELECT sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind, nvl(sobctrl_priority_no, 1), nvl(sobctrl_priority_incr, 1), sobctrl_study_path_ind " +
	" FROM sobctrl ";
					DataCommand command1 = new DataCommand(sql1);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(results1.getStr(0));
						getFormModel().getSCurricula().setLcurSobctrlProgramInd(results1.getStr(1));
						getFormModel().getSCurricula().setLcurSobctrlConcInd(results1.getStr(2));
						setGlobal("SOBCTRL_PRIORITY_NO", results1.getStr(3));
						setGlobal("SOBCTRL_PRIORITY_INCR", results1.getStr(4));
						setGlobal("STUDY_PATH", results1.getStr(5));
					}
					results1.close();
					getFormModel().getSCurricula().setLcurTempRuleInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
					getFormModel().getSCurricula().setLcurOriginalCurrInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
					if ( getGlobal("INIT_CURR_TERM").isNull() )
					{
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sobcurrMinC.
						sobcurrMinC.open();
						ResultSet sobcurrMinCResults = sobcurrMinC.fetchInto();
						if ( sobcurrMinCResults != null ) {
							initTerm = sobcurrMinCResults.getStr(0);
						}
						if ( sobcurrMinC.notFound() )
						{
							initTerm = toStr("999999");
						}
						sobcurrMinC.close();
						setGlobal("INIT_CURR_TERM", initTerm);
					}
					if ( getGlobal("INIT_CURR_TERM").lesserOrEquals(getFormModel().getSCurricula().getModuleTermCode()) )
					{
						getFormModel().getSCurricula().setLcurTempRuleInd(toStr("Y"));
					}
					else {
						//  turn curriculum checking off if term is less then the initial sobcurr term
						getFormModel().getSCurricula().setLcurTempRuleInd(toStr("N"));
					}
					if ( getGlobal("STUDY_PATH").equals("Y") && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_KEY_SEQNO"), toStr("visible"), toStr("property_true"));
					}
					else {
						this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_KEY_SEQNO"), toStr("visible"), toStr("property_false"));
					}
					if ( !getFormModel().getSCurricula().getModuleTermCode().isNull() )
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
					}
					holdBlock = toStr(getCurrentBlock());
					if ( (!getFormModel().getSCurricula().getModuleTermCode().isNull() && !getFormModel().getSCurricula().getModuleKeySeqno().isNull() && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit())) || (!getFormModel().getSCurricula().getModuleTermCode().isNull() && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner())) )
					{
						String sql2 = "SELECT nvl(count(*), 0) " +
	" FROM sovlcur " +
	" WHERE sovlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sovlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sovlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND sovlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND sovlcur_lmod_code = sb_curriculum_str.f_recruit) OR sovlcur_lmod_code = sb_curriculum_str.f_learner) AND sovlcur_current_ind = 'Y' AND sovlcur_active_ind = 'Y' ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						command2.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
						command2.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
						command2.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							lcurcnt = results2.getNumber(0);
						}
						results2.close();
						String sql3 = "SELECT nvl(count(*), 0) " +
	" FROM sotlcur " +
	" WHERE sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND sotlcur_lmod_code = sb_curriculum_str.f_recruit) OR sotlcur_lmod_code = sb_curriculum_str.f_learner) ";
						DataCommand command3 = new DataCommand(sql3);
						//Setting query parameters
						command3.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						command3.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
						command3.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
						command3.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
						ResultSet results3 = command3.executeQuery();
						rowCount = command3.getRowCount();
						if ( results3.hasData() ) {
							tcurcnt = results3.getNumber(0);
						}
						results3.close();
						//  if lcurcnt > 0 then -- and tcurcnt = 0 then 
						if ( (lcurcnt.greater(0) && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit())) || (lcurcnt.greater(0) && tcurcnt.equals(0) && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner())) )
						{
							//  :system.message_level := '5';
							goBlock(toStr("SORLCUR_LITE"));
							getContainer().getGoqrpls().gCheckFailure();
							clearBlock(TaskServices.NO_VALIDATE);
							executeQuery();
							getContainer().getGoqrpls().gCheckFailure();
							firstRecord();
							getContainer().getGoqrpls().gCheckFailure();
							lastRecord();
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(getCursorRecord()));
							firstRecord();
							getContainer().getGoqrpls().gCheckFailure();
							if ( (getFormModel().getSCurriculaTraditional().getLcurRecCnt().greater(1)) || (getFormModel().getSCurriculaTraditional().getLcurRecCnt().equals(1) && !sorlcurElement.getSovlcurRowid().isNull()) )
							{
								setItemEnabled("sorlfos_lfst_code", true);
								setItemNavigable("sorlfos_lfst_code", true);
								goBlock(toStr("SORLFOS_LITE"));
								getContainer().getGoqrpls().gCheckFailure();
								clearBlock(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
								executeQuery();
								getContainer().getGoqrpls().gCheckFailure();
								lastRecord();
								getContainer().getGoqrpls().gCheckFailure();
								getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(getCursorRecord()));
								firstRecord();
								getContainer().getGoqrpls().gCheckFailure();
								goBlock(toStr("SORLCUR_LITE"));
								getContainer().getGoqrpls().gCheckFailure();
								executeAction("populate_sotlcur");
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								goBlock(toStr("SORLFOS_LITE"));
								getContainer().getGoqrpls().gCheckFailure();
								getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
								clearBlock();
								goBlock(toStr("SORLCUR_LITE"));
								getContainer().getGoqrpls().gCheckFailure();
							}
							//  :system.message_level := '0'; 
							getFormModel().getSCurricula().setCurriculaUpdated(toStr(null));
							getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("Y"));
						}
					}
					if ( getFormModel().getSCurriculaTraditional().getLcurRecNum().isNull() || getFormModel().getSCurriculaTraditional().getLcurRecNum().equals(0) )
					{
						if ( getFormModel().getSCurriculaTraditional().getLcurRecCnt().equals(0) )
						{
							getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(1));
						}
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(1));
					}
					if ( getFormModel().getSCurriculaTraditional().getLcurRecCnt().equals(0) || getFormModel().getSCurriculaTraditional().getLcurRecCnt().isNull() )
					{
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(1));
					}
					getFormModel().getSCurricula().setDefaultLevel(toStr(""));
					getFormModel().getSCurricula().setDefaultCollege(toStr(""));
					getFormModel().getSCurricula().setDefaultCampus(toStr(""));
					getFormModel().getSCurricula().setDefaultDegree(toStr(""));
					getFormModel().getSCurricula().setDefaultProgram(toStr(""));
					getFormModel().getSCurricula().setDefaultOptionsInd(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_LOCK_MESSAGE
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   22-Jan-2004 09:01 PM
 ******************************************</multilinecomment>

--- CURR_LOCK_MESSAGE   Trigger
declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
   curr_msg varchar2(100) := ''; 
begin
   curr_msg :=  G$_NLS.Get('SOQOLIB-0051', 'FORM','Curriculum is not locked and will be flagged as invalid') ;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,curr_msg);
   alert_button := show_alert('CURRICULUM_INVALID');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_LOCK_MESSAGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_LOCK_MESSAGE")
		public void Soqolib_LcurLockMessage()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 22-Jan-2004 09:01 PM
				// ******************************************
				// - CURR_LOCK_MESSAGE   Trigger
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
					NString currMsg = toStr("");
					currMsg = GNls.Fget(toStr("SOQOLIB-0051"), toStr("FORM"), toStr("Curriculum is not locked and will be flagged as invalid"));
					setAlertMessageText(alertId, currMsg);
					alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.INVALID_LCUR_MSG
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   22-Jan-2004 09:01 PM
 ******************************************</multilinecomment>

--  INVALID_CURR_MSG  trigger
<multilinecomment>* display the invalid curriculum message </multilinecomment>

declare 
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
   curr_msg  varchar2(100) := '';
begin
    curr_msg := '';
    if :lcur_sobctrl_curr_rule_ind = 'N' then
       curr_msg :=  G$_NLS.Get('SOQOLIB-0052', 'FORM','Curriculum Checking is not in Effect') ;
    else
         if :lcur_temp_rule_ind = 'N' then
             curr_msg :=  G$_NLS.Get('SOQOLIB-0053', 'FORM','Catalog Term Precedes Initial Term; Curriculum Checking not in Effect.') ;
         end if;
    end if;
    if curr_msg is null then 
       curr_msg :=  G$_NLS.Get('SOQOLIB-0054', 'FORM','Invalid Curriculum.') ;
    end if;
   SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,curr_msg);
   alert_button := show_alert('CURRICULUM_INVALID');
   if alert_button = ALERT_BUTTON1 then
       null;
   end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.INVALID_LCUR_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_LCUR_MSG")
		public void Soqolib_InvalidLcurMsg()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 22-Jan-2004 09:01 PM
				// ******************************************
				//   INVALID_CURR_MSG  trigger
				// * display the invalid curriculum message 
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
					NString currMsg = toStr("");
					currMsg = toStr("");
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("N") )
					{
						currMsg = GNls.Fget(toStr("SOQOLIB-0052"), toStr("FORM"), toStr("Curriculum Checking is not in Effect"));
					}
					else {
						if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
						{
							currMsg = GNls.Fget(toStr("SOQOLIB-0053"), toStr("FORM"), toStr("Catalog Term Precedes Initial Term; Curriculum Checking not in Effect."));
						}
					}
					if ( currMsg.isNull() )
					{
						currMsg = GNls.Fget(toStr("SOQOLIB-0054"), toStr("FORM"), toStr("Invalid Curriculum."));
					}
					setAlertMessageText(alertId, currMsg);
					alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
					if ( alertButton.equals(MessageServices.BUTTON1) )
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.DEFAULT_CURRICULA
		 -- this trigger is called in saaquik and sraquik to populate the lite
-- curriculum blocks  
-- this is called before the query-sorlcur-lite block 
-- saaquik and sraquik default only for the learner and recruit 
-- modules 
-- default values may come first from saaqker for saaquik, and the default
-- tab for sraquik.  If those values are null, use the curriculum
-- user preferences 
declare 
	
	save_item varchar2(30) := :system.current_item; 
	default_values_used varchar2(1) := 'N';
	cntsgv  number := 0;
	curric_rec   sb_curriculum.curriculum_rec;
	curric_c     sb_curriculum.curriculum_ref;
begin 

DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_NO');
DEFAULT_VALUE('','GLOBAL.SOBCTRL_PRIORITY_INC');

DEFAULT_VALUE('','GLOBAL.RECRUIT_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.RECRUIT_PROGRAM');

DEFAULT_VALUE('','GLOBAL.LEARNER_LMOD_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_CAMP_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_COLL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_LEVL_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEGC_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_MAJR_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_DEPT_CODE');
DEFAULT_VALUE('','GLOBAL.LEARNER_PROGRAM');
-- save initial sobcurr term so we don't have to keep requering it
DEFAULT_VALUE('','GLOBAL.INIT_CURR_TERM');


Retrieve_defaults(p_lmod_code => :s$_curricula.module_code);

soklcur.p_default_status (
         p_pidm        => :s$_curricula.module_pidm,
         p_lmod_code   => :s$_curricula.module_code,
         p_term_code   => :s$_curricula.module_term_code,
         p_keyseqno    => :s$_curricula.module_key_seqno, 
         p_stst_code   => :s$_curricula.module_stst_code,
         p_degs_code   => :s$_curricula.module_degs_code,
         p_cact_out    => :s$_curricula.default_cact,
         p_csts_out    => :s$_curricula.default_csts );


declare 
	init_term  varchar2(6) := '';
  cursor sobcurr_min_c is 
      select nvl(min(sobcurr_term_code_init),'999999')
      from sobcurr ;
      
begin
  select sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind,
    nvl(sobctrl_priority_no,1), nvl(sobctrl_priority_incr,1)
   into :lcur_sobctrl_curr_rule_ind, :lcur_sobctrl_program_ind, :lcur_sobctrl_conc_ind,
     :global.sobctrl_priority_no, :global.sobctrl_priority_incr                    
   from sobctrl;
 
  :lcur_temp_rule_ind := :lcur_sobctrl_curr_rule_ind;
  :lcur_original_curr_ind := :lcur_sobctrl_curr_rule_ind;

  if :GLOBAL.init_curr_term IS NULL THEN
  	 open sobcurr_min_c;
  	 fetch sobcurr_min_c into init_term;
  	 if sobcurr_min_c%notfound then 
  	 	  init_term := '999999';
  	 end if;
  	 close sobcurr_min_c;
  	 :global.init_curr_term := init_term;
   end if;

   if  :global.init_curr_term <= :s$_curricula.module_term_code then
      :lcur_temp_rule_ind := 'Y';
   else -- turn curriculum checking off if term is less then the initial sobcurr term
      :lcur_temp_rule_ind := 'N';
   end if; 
end;

case :s$_curricula.module_code 
      when sb_curriculum_str.f_learner then 
         :module_ind := 'S';
      when sb_curriculum_str.f_outcome then 
         :module_ind := 'H';
      when sb_curriculum_str.f_admissions then 
         :module_ind := 'A';
      when sb_curriculum_str.f_recruit then 
         :module_ind := 'R';
      else 
    	   :module_ind := 'X';
end case;
if :s$_curricula.module_term_code is not null 
 	and (  :s$_curricula.module_code = sb_curriculum_str.f_learner 
 	  OR (  :s$_curricula.module_code = sb_curriculum_str.f_recruit
 	    and  :s$_curricula.module_key_seqno is not null ) )  THEN 
  -- if this is the learner module, and no defaults exist,  do not default 
  -- the priority, query the existing lcur records 
  if :s$_curricula.module_code = sb_curriculum_str.f_learner and 
  	(:s$_curricula.default_level is  null and
  	:s$_curricula.default_campus is  null and
  	:s$_curricula.default_program is  null and
  	:s$_curricula.default_degree is  null and
  	:s$_curricula.default_college is  null and 
  	:s$_curricula.default_major is  null  and
    :global.learner_levl_code is  null   and
    :global.learner_camp_code is  null  and
    :global.learner_coll_code is  null  and
    :global.learner_degc_code is  null  and
    :global.learner_program is  null ) then 
     return;
  end if; 
 
 	go_block('sorlcur_lite');
 	:s$_curricula.default_options_ind := 'Y'; 
  :sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
  :sorlcur_term_code := :s$_curricula.module_term_code;
  :sorlcur_term_code_ctlg := :s$_curricula.module_term_code;
  :sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
	:sorlcur_catlg_term_desc :=  
                  gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
  :sorlcur_admt_code := :s$_curricula.default_admt; 
  :sorlcur_priority_no := :global.sobctrl_priority_no;
	:sorlcur_cact_code := :s$_curricula.default_cact;
	:sorlcur_pidm := :s$_curricula.module_pidm;
	:sorlcur_key_seqno := :s$_curricula.module_key_seqno;
	:sorlcur_cact_code := :s$_curricula.default_cact;

  :lcur_rec_num  := 1;
  :lcur_rec_cnt  := 1;	 
  if ( (:s$_curricula.default_level is not null or
  	:s$_curricula.default_campus is not null or
  	:s$_curricula.default_program is not null or
  	:s$_curricula.default_degree is not null or
  	:s$_curricula.default_college is not null or 
  	:s$_curricula.default_major is not null or
  	:s$_curricula.DEFAULT_CURRIC_TERM_CTLG is not null  ) or 
        ( :s$_curricula.module_code = sb_curriculum_str.f_recruit 
     and ( :global.recruit_levl_code is not null 
        or :global.recruit_camp_code is not null
       or :global.recruit_coll_code is not null 
       or :global.recruit_degc_code is not null
       or :global.recruit_majr_code is not null 
       or :global.recruit_dept_code is not null  
       or :global.recruit_program is not null ) ) or 
     ( :s$_curricula.module_code = sb_curriculum_str.f_learner 
     and ( :global.learner_levl_code is not null 
     or :global.learner_camp_code is not null
       or :global.learner_coll_code is not null
       or :global.learner_degc_code is not null
       or :global.learner_majr_code is not null
       or :global.learner_dept_code is not null  
       or :global.learner_program is not null ) ) 
             )  then 

--	create_record;
     if (:s$_curricula.default_level is not null or
      	:s$_curricula.default_campus is not null or
      	:s$_curricula.default_program is not null or
      	:s$_curricula.default_degree is not null or
      	:s$_curricula.default_college is not null or
      	:s$_curricula.default_major is not null or
      	:s$_curricula.DEFAULT_CURRIC_TERM_CTLG is not null ) then 
      	
      	-- use defaults from saaqker or quick recruit default 
      	:sorlcur_levl_code := :s$_curricula.default_level;
      	:sorlcur_camp_code := :s$_curricula.default_campus;
      	:sorlcur_coll_code := :s$_curricula.default_college;
      	:sorlcur_degc_code := :s$_curricula.default_degree;
      	:sorlcur_program :=  :s$_curricula.default_program;
      	if :s$_curricula.DEFAULT_CURRIC_TERM_CTLG is not null then 
        	:sorlcur_term_code_ctlg := :s$_curricula.DEFAULT_CURRIC_TERM_CTLG;
      	end if;
      	default_values_used := 'Y';

     else 
     	default_values_used := 'N';
     	 --- defaults not entered on saaqker or recruit default, use user prefer from sorlcdf
      if :s$_curricula.module_code = sb_curriculum_str.f_recruit then 
      	
      	:sorlcur_levl_code := :global.recruit_levl_code;
      	:sorlcur_camp_code := :global.recruit_camp_code;
      	:sorlcur_coll_code :=  :global.recruit_coll_code;
      	:sorlcur_degc_code := :global.recruit_degc_code;
      	:sorlcur_program :=  :global.recruit_program;

       elsif  :s$_curricula.module_code = sb_curriculum_str.f_learner then 
      	:sorlcur_levl_code := :global.learner_levl_code;
      	:sorlcur_camp_code := :global.learner_camp_code;
      	:sorlcur_coll_code :=  :global.learner_coll_code;
      	:sorlcur_degc_code :=:global.learner_degc_code;
      	:sorlcur_program :=  :global.learner_program;
       end if; 
     end if; 
      
    :sorlcur_curr_rule := null;
    :defaultinsert_inprogress := 'Y';
    if :sorlcur_program is not null and 
    	get_item_property('SORLCUR_PROGRAM',VISIBLE) = 'TRUE'  then 
        go_item('sorlcur_program');
        g$_check_failure;
        next_item;
        g$_check_failure;
    end if; 
    if :lcur_sobctrl_curr_rule_ind = 'Y' then
       execute_trigger('lcur_check_program');
       g$_check_failure;
       :defaultinsert_inprogress := 'N';
    end if;
  	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
  	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
    :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
  	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
  	:sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
   end if; -- end of defaulting in the curriculum values 

  soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm);
  soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm);

	soklcur.p_create_sotlcur(
	  p_pidm =>:s$_curricula.module_pidm, 
	  p_seqno => :sorlcur_seqno,
	  p_cact_code => :sorlcur_cact_code, 
	  p_priority_no => :sorlcur_priority_no,
	  p_term_code => :s$_curricula.module_term_code, 
	  p_key_seqno => :s$_curricula.module_key_seqno,
	  p_lmod_code => :s$_curricula.module_code); 
   
  :s$_curricula.original_sorlcur_count :=  1;
  -- only populate if there is a major, else the values will fill in naturally when
 	-- the record is inserted 
  if  (:s$_curricula.module_code = sb_curriculum_str.f_recruit  
         and nvl(:s$_curricula.default_major, :global.recruit_majr_code) is not null ) 
      or (:s$_curricula.module_code = sb_curriculum_str.f_learner 
         and nvl(:s$_curricula.default_major, :global.learner_majr_code) is not null )   
		  or :sorlfos_majr_code is not null then 
		 if default_values_used = 'Y' and 
		 	   :s$_curricula.default_major is null then 
		 	   goto end_defaults;
		 end if; 
	   go_block('sorlfos_lite'); 
	   --- only use the values from saaqker or recruit default if any part of the curriculum is
	   	-- filled in 
	   if default_values_used = 'Y' then 
	   	    :sorlfos_majr_code := :s$_curricula.default_major;
	        :sorlfos_dept_code := :s$_curricula.default_dept;
	        :sorlfos_term_code_ctlg := :s$_curricula.DEFAULT_CURRIC_TERM_CTLG;
	        :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	        :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
	   else 
	   	 -- use the user preferences from sorlcdf if no saaqker or recruit defaults in the curriculum
      if :s$_curricula.module_code = sb_curriculum_str.f_recruit then 
	    	if :sorlfos_majr_code is null then 
	      	:sorlfos_majr_code := :global.recruit_majr_code;
	        :sorlfos_dept_code := :global.recruit_dept_code;
	        :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	        :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
	    	end if; 
      elsif  :s$_curricula.module_code = sb_curriculum_str.f_learner then
      	if :sorlfos_majr_code is null  then 
	      	:sorlfos_majr_code := :global.learner_majr_code;
	        :sorlfos_dept_code := :global.learner_dept_code;
	        :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	        :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
	     	end if; 
      end if; 
	  end if; -- default values used 
	  if :sorlfos_majr_code is not null and :sorlfos_dept_code is null then 
	  	  --- default in the dept if the major is filled in and there
	  	  --- is a curriculum
	    execute_trigger('LFOS_CHECK_PROGRAM_MAJOR');
	  end if; 	 
		:sovlfos_rowid := NULL;
   	:sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
 		:sorlfos_cact_code := :s$_curricula.default_cact;
		:sorlfos_csts_code := :s$_curricula.default_csts;
	  :sorlfos_priority_no := :global.sobctrl_priority_no;
	 	:sorlfos_pidm := :s$_curricula.module_pidm;
		:sorlfos_term_code := :s$_curricula.module_term_code;
		:sorlfos_term_code_ctlg := :s$_curricula.module_term_code;
	  :sorlfos_lcur_seqno := :sorlcur_seqno;
	  :sorlfos_seqno := sb_fieldofstudy_rules.f_seqno(:s$_curricula.module_pidm, :sorlcur_seqno);         
    :sorlfos_seqno_cnt := :sorlfos_seqno;
	  set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
    set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
    set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');
 
    soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
       p_lcur_seqno => :sorlcur_seqno,
       p_seqno => :sorlfos_seqno,
       p_cact_code => :sorlfos_cact_code,
       p_lfst_code => :sorlfos_lfst_code,
       p_priority_no => :sorlfos_priority_no ,
       p_majr_code => :sorlfos_majr_code,
       p_dept_code => :sorlfos_dept_code);
    
 	end if; -- end of filling in the lfos 

  
 -- end if; -- end of insert into sorlcur, keyseqno and term 
end if; --- term must be filled in 
<< end_defaults >>
:s$_curricula.sorlcur_block_status := 'Y';
:s$_curricula.default_level := ''; 
:s$_curricula.default_college := '';
:s$_curricula.default_campus := '';
:s$_curricula.default_degree := '';
:s$_curricula.default_program := '';
:s$_curricula.DEFAULT_CURRIC_TERM_CTLG := '';
execute_trigger('enable_curriculum');
g$_check_failure;
go_item(save_item); 
g$_check_failure;
end; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.DEFAULT_CURRICULA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DEFAULT_CURRICULA")
		public void Soqolib_DefaultCurricula()
		{
			
				//  this trigger is called in saaquik and sraquik to populate the lite
				//  curriculum blocks  
				//  this is called before the query-sorlcur-lite block 
				//  saaquik and sraquik default only for the learner and recruit 
				//  modules 
				//  default values may come first from saaqker for saaquik, and the default
				//  tab for sraquik.  If those values are null, use the curriculum
				//  user preferences 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NString saveItem = getCurrentItem();
					NString defaultValuesUsed = toStr("N");
					NNumber cntsgv = toNumber(0);
					SbCurriculum.CurriculumRecRow curricRec= null;
					UnknownTypes.SbCurriculumCurriculumRef curricC= null;
					setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_NO");
					setDefaultValue("", "GLOBAL.SOBCTRL_PRIORITY_INC");
					setDefaultValue("", "GLOBAL.RECRUIT_LMOD_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_CAMP_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_COLL_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_LEVL_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_DEGC_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_MAJR_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_DEPT_CODE");
					setDefaultValue("", "GLOBAL.RECRUIT_PROGRAM");
					setDefaultValue("", "GLOBAL.LEARNER_LMOD_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_CAMP_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_COLL_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_LEVL_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_DEGC_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_MAJR_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_DEPT_CODE");
					setDefaultValue("", "GLOBAL.LEARNER_PROGRAM");
					//  save initial sobcurr term so we don't have to keep requering it
					setDefaultValue("", "GLOBAL.INIT_CURR_TERM");
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					this.getContainer().getServices().retrieveDefaults(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_cact_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCact());
					Ref<NString> p_csts_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCsts());
					Soklcur.pDefaultStatus(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), /*pStstCode=>*/getFormModel().getSCurricula().getModuleStstCode(), /*pDegsCode=>*/getFormModel().getSCurricula().getModuleDegsCode(), /*pCactOut=>*/getFormModel().getSCurricula().getDefaultCact(), p_cact_out_ref,p_csts_out_ref);
					getFormModel().getSCurricula().setDefaultCsts(p_cact_out_ref.val);
					{
						NString initTerm = toStr("");
						String sqlsobcurrMinC = "SELECT nvl(min(sobcurr_term_code_init), '999999') " +
	" FROM sobcurr ";
						DataCursor sobcurrMinC = new DataCursor(sqlsobcurrMinC);
						String sql1 = "SELECT sobctrl_curr_rule_ind, sobctrl_program_ind, sobctrl_conc_ind, nvl(sobctrl_priority_no, 1), nvl(sobctrl_priority_incr, 1) " +
	" FROM sobctrl ";
						DataCommand command1 = new DataCommand(sql1);
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(results1.getStr(0));
							getFormModel().getSCurricula().setLcurSobctrlProgramInd(results1.getStr(1));
							getFormModel().getSCurricula().setLcurSobctrlConcInd(results1.getStr(2));
							setGlobal("SOBCTRL_PRIORITY_NO", results1.getStr(3));
							setGlobal("SOBCTRL_PRIORITY_INCR", results1.getStr(4));
						}
						results1.close();
						getFormModel().getSCurricula().setLcurTempRuleInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
						getFormModel().getSCurricula().setLcurOriginalCurrInd(getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd());
						if ( getGlobal("INIT_CURR_TERM").isNull() )
						{
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable sobcurrMinC.
							sobcurrMinC.open();
							ResultSet sobcurrMinCResults = sobcurrMinC.fetchInto();
							if ( sobcurrMinCResults != null ) {
								initTerm = sobcurrMinCResults.getStr(0);
							}
							if ( sobcurrMinC.notFound() )
							{
								initTerm = toStr("999999");
							}
							sobcurrMinC.close();
							setGlobal("INIT_CURR_TERM", initTerm);
						}
						if ( getGlobal("INIT_CURR_TERM").lesserOrEquals(getFormModel().getSCurricula().getModuleTermCode()) )
						{
							getFormModel().getSCurricula().setLcurTempRuleInd(toStr("Y"));
						}
						else {
							//  turn curriculum checking off if term is less then the initial sobcurr term
							getFormModel().getSCurricula().setLcurTempRuleInd(toStr("N"));
						}
					}
					if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("S"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("H"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("A"));
					}
					else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
					{
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("R"));
					}
					else {
						getFormModel().getSCurrProcBlock().setModuleInd(toStr("X"));
					}
					if ( !getFormModel().getSCurricula().getModuleTermCode().isNull() && (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) && !getFormModel().getSCurricula().getModuleKeySeqno().isNull())) )
					{
						//  if this is the learner module, and no defaults exist,  do not default 
						//  the priority, query the existing lcur records 
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && (getFormModel().getSCurricula().getDefaultLevel().isNull() && getFormModel().getSCurricula().getDefaultCampus().isNull() && getFormModel().getSCurricula().getDefaultProgram().isNull() && getFormModel().getSCurricula().getDefaultDegree().isNull() && getFormModel().getSCurricula().getDefaultCollege().isNull() && getFormModel().getSCurricula().getDefaultMajor().isNull() && getGlobal("LEARNER_LEVL_CODE").isNull() && getGlobal("LEARNER_CAMP_CODE").isNull() && getGlobal("LEARNER_COLL_CODE").isNull() && getGlobal("LEARNER_DEGC_CODE").isNull() && getGlobal("LEARNER_PROGRAM").isNull()) )
						{
							return ;
						}
						goBlock(toStr("sorlcur_lite"));
						getFormModel().getSCurricula().setDefaultOptionsInd(toStr("Y"));
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						sorlcurElement.setSorlcurTermCodeCtlg(getFormModel().getSCurricula().getModuleTermCode());
						sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
						sorlcurElement.setSorlcurAdmtCode(getFormModel().getSCurricula().getDefaultAdmt());
						sorlcurElement.setSorlcurPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
						sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
						sorlcurElement.setSorlcurPidm(getFormModel().getSCurricula().getModulePidm());
						sorlcurElement.setSorlcurKeySeqno(getFormModel().getSCurricula().getModuleKeySeqno());
						sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(1));
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(1));
						if (((!getFormModel().getSCurricula().getDefaultLevel().isNull() || !getFormModel().getSCurricula().getDefaultCampus().isNull() || !getFormModel().getSCurricula().getDefaultProgram().isNull() || !getFormModel().getSCurricula().getDefaultDegree().isNull() || !getFormModel().getSCurricula().getDefaultCollege().isNull() || !getFormModel().getSCurricula().getDefaultMajor().isNull() || !getFormModel().getSCurricula().getDefaultCurricTermCtlg().isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) && (!getGlobal("RECRUIT_LEVL_CODE").isNull() || !getGlobal("RECRUIT_CAMP_CODE").isNull() || !getGlobal("RECRUIT_COLL_CODE").isNull() || !getGlobal("RECRUIT_DEGC_CODE").isNull() || !getGlobal("RECRUIT_MAJR_CODE").isNull() || !getGlobal("RECRUIT_DEPT_CODE").isNull() || !getGlobal("RECRUIT_PROGRAM").isNull())) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && (!getGlobal("LEARNER_LEVL_CODE").isNull() || !getGlobal("LEARNER_CAMP_CODE").isNull() || !getGlobal("LEARNER_COLL_CODE").isNull() || !getGlobal("LEARNER_DEGC_CODE").isNull() || !getGlobal("LEARNER_MAJR_CODE").isNull() || !getGlobal("LEARNER_DEPT_CODE").isNull() || !getGlobal("LEARNER_PROGRAM").isNull()))))
						{
							// 	create_record;
							if ((!getFormModel().getSCurricula().getDefaultLevel().isNull() || !getFormModel().getSCurricula().getDefaultCampus().isNull() || !getFormModel().getSCurricula().getDefaultProgram().isNull() || !getFormModel().getSCurricula().getDefaultDegree().isNull() || !getFormModel().getSCurricula().getDefaultCollege().isNull() || !getFormModel().getSCurricula().getDefaultMajor().isNull() || !getFormModel().getSCurricula().getDefaultCurricTermCtlg().isNull()))
							{
								//  use defaults from saaqker or quick recruit default 
								sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getDefaultLevel());
								sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getDefaultCampus());
								sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getDefaultCollege());
								sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getDefaultDegree());
								sorlcurElement.setSorlcurProgram(getFormModel().getSCurricula().getDefaultProgram());
								if ( !getFormModel().getSCurricula().getDefaultCurricTermCtlg().isNull() )
								{
									sorlcurElement.setSorlcurTermCodeCtlg(getFormModel().getSCurricula().getDefaultCurricTermCtlg());
								}
								defaultValuesUsed = toStr("Y");
							}
							else {
								defaultValuesUsed = toStr("N");
								// - defaults not entered on saaqker or recruit default, use user prefer from sorlcdf
								if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) )
								{
									sorlcurElement.setSorlcurLevlCode(getGlobal("RECRUIT_LEVL_CODE"));
									sorlcurElement.setSorlcurCampCode(getGlobal("RECRUIT_CAMP_CODE"));
									sorlcurElement.setSorlcurCollCode(getGlobal("RECRUIT_COLL_CODE"));
									sorlcurElement.setSorlcurDegcCode(getGlobal("RECRUIT_DEGC_CODE"));
									sorlcurElement.setSorlcurProgram(getGlobal("RECRUIT_PROGRAM"));
								}
								else if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) ) {
									sorlcurElement.setSorlcurLevlCode(getGlobal("LEARNER_LEVL_CODE"));
									sorlcurElement.setSorlcurCampCode(getGlobal("LEARNER_CAMP_CODE"));
									sorlcurElement.setSorlcurCollCode(getGlobal("LEARNER_COLL_CODE"));
									sorlcurElement.setSorlcurDegcCode(getGlobal("LEARNER_DEGC_CODE"));
									sorlcurElement.setSorlcurProgram(getGlobal("LEARNER_PROGRAM"));
								}
							}
							sorlcurElement.setSorlcurCurrRule(toNumber(null));
							getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("Y"));
							if ( !sorlcurElement.getSorlcurProgram().isNull() && getItemVisible("SORLCUR_PROGRAM").equals("TRUE") )
							{
								goItem(toStr("sorlcur_program"));
								getContainer().getGoqrpls().gCheckFailure();
								nextItem();
								getContainer().getGoqrpls().gCheckFailure();
							}
							if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
							{
								executeAction("lcur_check_program");
								getContainer().getGoqrpls().gCheckFailure();
								getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("N"));
							}
							sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
							sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
							sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
							sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
							sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
						}
						//  end of defaulting in the curriculum values 
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(),/*pSeqno=>*/sorlcurElement.getSorlcurSeqno());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(),/*pLcurSeqno=>*/sorlfosElement.getSorlfosLcurSeqno(),/*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(
								/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), 
								/*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), 
								/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(),
								/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), 
								/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(),
								/*pCactCode=>*/sorlcurElement.getSorlcurCactCode(),
								/*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), 
								/*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(),
								/*pCollCode=>*/sorlcurElement.getSorlcurCollCode(),
								/*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(),
								/*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg(),
								 /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(),
								 /*pProgram=>*/sorlcurElement.getSorlcurProgram());
								
								 
						getFormModel().getSCurricula().setOriginalSorlcurCount(toNumber(1));
						//  only populate if there is a major, else the values will fill in naturally when
						//  the record is inserted 
						if ( (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) && !isNull(getFormModel().getSCurricula().getDefaultMajor(), getGlobal("RECRUIT_MAJR_CODE")).isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && !isNull(getFormModel().getSCurricula().getDefaultMajor(), getGlobal("LEARNER_MAJR_CODE")).isNull()) || !sorlfosElement.getSorlfosMajrCode().isNull() )
						{
							if ( defaultValuesUsed.equals("Y") && getFormModel().getSCurricula().getDefaultMajor().isNull() )
							{
//								goto END_DEFAULTS;
								getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("Y"));
								getFormModel().getSCurricula().setDefaultLevel(toStr(""));
								getFormModel().getSCurricula().setDefaultCollege(toStr(""));
								getFormModel().getSCurricula().setDefaultCampus(toStr(""));
								getFormModel().getSCurricula().setDefaultDegree(toStr(""));
								getFormModel().getSCurricula().setDefaultProgram(toStr(""));
								getFormModel().getSCurricula().setDefaultCurricTermCtlg(toStr(""));
								executeAction("enable_curriculum");
								getContainer().getGoqrpls().gCheckFailure();
								goItem(saveItem);
								getContainer().getGoqrpls().gCheckFailure();
							}
							goBlock(toStr("sorlfos_lite"));
							// - only use the values from saaqker or recruit default if any part of the curriculum is
							//  filled in 
							if ( defaultValuesUsed.equals("Y") )
							{
								sorlfosElement.setSorlfosMajrCode(getFormModel().getSCurricula().getDefaultMajor());
								sorlfosElement.setSorlfosDeptCode(getFormModel().getSCurricula().getDefaultDept());
								sorlfosElement.setSorlfosTermCodeCtlg(getFormModel().getSCurricula().getDefaultCurricTermCtlg());
								sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
								sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
							}
							else {
								//  use the user preferences from sorlcdf if no saaqker or recruit defaults in the curriculum
								if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) )
								{
									if ( sorlfosElement.getSorlfosMajrCode().isNull() )
									{
										sorlfosElement.setSorlfosMajrCode(getGlobal("RECRUIT_MAJR_CODE"));
										sorlfosElement.setSorlfosDeptCode(getGlobal("RECRUIT_DEPT_CODE"));
										sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
										sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
									}
								}
								else if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) ) {
									if ( sorlfosElement.getSorlfosMajrCode().isNull() )
									{
										sorlfosElement.setSorlfosMajrCode(getGlobal("LEARNER_MAJR_CODE"));
										sorlfosElement.setSorlfosDeptCode(getGlobal("LEARNER_DEPT_CODE"));
										sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
										sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
									}
								}
							}
							//  default values used 
							if ( !sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSorlfosDeptCode().isNull() )
							{
								// - default in the dept if the major is filled in and there
								// - is a curriculum
								executeAction("LFOS_CHECK_PROGRAM_MAJOR");
							}
							sorlfosElement.setSovlfosRowid(toStr(null));
							sorlfosElement.setSorlfosLfstCode(SbFieldofstudyStr.fMajor());
							sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
							sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
							sorlfosElement.setSorlfosPidm(getFormModel().getSCurricula().getModulePidm());
							sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSorlfosTermCodeCtlg(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSorlfosLcurSeqno(sorlcurElement.getSorlcurSeqno());
							sorlfosElement.setSorlfosSeqno(SbFieldofstudyRules.fSeqno(getFormModel().getSCurricula().getModulePidm(), sorlcurElement.getSorlcurSeqno()));
							sorlcurElement.setSorlfosSeqnoCnt(sorlfosElement.getSorlfosSeqno());
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(), /*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg());
						}
					}
//					 END_DEFAULTS:;
//					getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("Y"));
//					getFormModel().getSCurricula().setDefaultLevel(toStr(""));
//					getFormModel().getSCurricula().setDefaultCollege(toStr(""));
//					getFormModel().getSCurricula().setDefaultCampus(toStr(""));
//					getFormModel().getSCurricula().setDefaultDegree(toStr(""));
//					getFormModel().getSCurricula().setDefaultProgram(toStr(""));
//					getFormModel().getSCurricula().setDefaultCurricTermCtlg(toStr(""));
//					executeAction("enable_curriculum");
//					getContainer().getGoqrpls().gCheckFailure();
//					goItem(saveItem);
//					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.DEFAULT_TAB_CURRICULA
		 -- this trigger is called by new_sorlcur_inst for saaadms,
-- srarecr, sfaregs, sgastdn and shadegr. 
-- It defaults the initial record with values from default sources.
-- Recruits get all 0 values in level, college, degree, major. 
-- Now all can get initial values from curriculum user preferences 

declare 
	
	save_item varchar2(30) := :system.current_item; 

begin 
soklcur.p_default_status (
         p_pidm        => :s$_curricula.module_pidm,
         p_lmod_code   => :s$_curricula.module_code,
         p_term_code   => :s$_curricula.module_term_code,
         p_keyseqno    => :s$_curricula.module_key_seqno, 
         p_stst_code   => :s$_curricula.module_stst_code,
         p_degs_code   => :s$_curricula.module_degs_code,
         p_cact_out    => :s$_curricula.default_cact,
         p_csts_out    => :s$_curricula.default_csts );

Retrieve_defaults(p_lmod_code => :s$_curricula.module_code);
  
if  (( :s$_curricula.default_level is not null or
	:s$_curricula.default_campus is not null or
	:s$_curricula.default_program is not null or
	:s$_curricula.default_degree is not null or
	:s$_curricula.default_college is not null )   

  OR  ( :s$_curricula.module_code = sb_curriculum_str.f_learner 
    and ( :global.learner_levl_code is not null 
     or :global.learner_camp_code is not null
     or :global.learner_coll_code is not null 
     or :global.learner_degc_code is not null
     or :global.learner_majr_code is not null 
     or :global.learner_dept_code is not null  
     or :global.learner_program is not null  ))

  OR  ( :s$_curricula.module_code = sb_curriculum_str.f_recruit 
    and ( :global.recruit_levl_code is not null 
     or :global.recruit_camp_code is not null
     or :global.recruit_coll_code is not null 
     or :global.recruit_degc_code is not null
     or :global.recruit_majr_code is not null 
     or :global.recruit_dept_code is not null  
     or :global.recruit_program is not null  ))

  OR  ( :s$_curricula.module_code = sb_curriculum_str.f_outcome 
   and ( :global.outcome_levl_code is not null 
   or :global.outcome_camp_code is not null
   or :global.outcome_coll_code is not null 
   or :global.outcome_degc_code is not null
   or :global.outcome_majr_code is not null 
   or :global.outcome_dept_code is not null  
   or :global.outcome_program is not null  ))

  OR  ( :s$_curricula.module_code = sb_curriculum_str.f_admissions 
   and ( :global.admissions_levl_code is not null 
   or :global.admissions_camp_code is not null
   or :global.admissions_coll_code is not null 
   or :global.admissions_degc_code is not null
   or :global.admissions_majr_code is not null 
   or :global.admissions_dept_code is not null  
   or :global.admissions_program is not null  )  ) ) and 

	:s$_curricula.module_term_code is not null and 
	:s$_curricula.module_key_seqno is not null then 
	
	go_block('sorlcur'); 
--	create_record;
  :s$_curricula.default_options_ind := 'Y'; 
 	:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
  :sorlcur_term_code := :s$_curricula.module_term_code;
	:sorlcur_term_code_ctlg := :s$_curricula.module_term_code;
	:sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
	:sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
	:sorlcur_admt_code := :s$_curricula.default_admt; 
	
	 case :s$_curricula.module_code 
	 when sb_curriculum_str.f_learner then 
	 if ( :global.learner_levl_code is not null 
     or :global.learner_camp_code is not null
     or :global.learner_coll_code is not null 
     or :global.learner_degc_code is not null
     or :global.learner_program is not null  ) then 
	       :sorlcur_levl_code := :global.learner_levl_code ;
	       :sorlcur_camp_code := :global.learner_camp_code ;
	       :sorlcur_coll_code := :global.learner_coll_code ;
	       :sorlcur_degc_code := :global.learner_degc_code;
	       :sorlcur_program := :global.learner_program;
	    else 
	   	  :sorlcur_levl_code :=  :s$_curricula.default_level ;
	       :sorlcur_camp_code :=   :s$_curricula.default_campus ;
	       :sorlcur_coll_code :=    :s$_curricula.default_college ;
	       :sorlcur_degc_code :=   :s$_curricula.default_degree ;
	       :sorlcur_program :=   :s$_curricula.default_program ;
	   	end if; 

	 when sb_curriculum_str.f_recruit then 
	   if (:global.recruit_levl_code is not null 
     or :global.recruit_camp_code is not null
     or :global.recruit_coll_code is not null 
     or :global.recruit_degc_code is not null
     or :global.recruit_program is not null ) then 
	       :sorlcur_levl_code := :global.recruit_levl_code ;
	       :sorlcur_camp_code :=  :global.recruit_camp_code ;
	       :sorlcur_coll_code :=  :global.recruit_coll_code ;
	       :sorlcur_degc_code :=  :global.recruit_degc_code;
	       :sorlcur_program :=  :global.recruit_program;
     else 
        :sorlcur_levl_code :=   :s$_curricula.default_level ;
	       :sorlcur_camp_code :=   :s$_curricula.default_campus ;
	       :sorlcur_coll_code :=  :s$_curricula.default_college ;
	       :sorlcur_degc_code :=  :s$_curricula.default_degree ;
	       :sorlcur_program :=   :s$_curricula.default_program ;
	   end if; 
	 when sb_curriculum_str.f_admissions then 
	   if  ( :global.admissions_levl_code is not null 
       or :global.admissions_camp_code is not null
       or :global.admissions_coll_code is not null 
       or :global.admissions_degc_code is not null 
       or :global.admissions_program is not null  ) then 
	       :sorlcur_levl_code := :global.admissions_levl_code ;
	       :sorlcur_camp_code :=  :global.admissions_camp_code ;
	       :sorlcur_coll_code :=  :global.admissions_coll_code ;
	       :sorlcur_degc_code :=  :global.admissions_degc_code;
	       :sorlcur_program :=  :global.admissions_program;
     else 
         :sorlcur_levl_code :=  :s$_curricula.default_level ;
	       :sorlcur_camp_code :=   :s$_curricula.default_campus ;
	       :sorlcur_coll_code :=    :s$_curricula.default_college ;
	       :sorlcur_degc_code :=   :s$_curricula.default_degree ;
	       :sorlcur_program :=   :s$_curricula.default_program ;
	   end if; 
	 when sb_curriculum_str.f_outcome then 
	   if  :global.outcome_levl_code is not null 
        or :global.outcome_camp_code is not null
        or :global.outcome_coll_code is not null 
        or :global.outcome_degc_code is not null
        or :global.outcome_program is not null  then 
	       :sorlcur_levl_code := :global.outcome_levl_code ;
	       :sorlcur_camp_code := :global.outcome_camp_code ;
	       :sorlcur_coll_code := :global.outcome_coll_code ;
	       :sorlcur_degc_code :=  :global.outcome_degc_code;
	       :sorlcur_program := :global.outcome_program;
	    else 
	   	  :sorlcur_levl_code :=  :s$_curricula.default_level ;
	       :sorlcur_camp_code :=   :s$_curricula.default_campus ;
	       :sorlcur_coll_code :=    :s$_curricula.default_college ;
	       :sorlcur_degc_code :=   :s$_curricula.default_degree ;
	       :sorlcur_program :=   :s$_curricula.default_program ;
	   	end if; 
 
   else
      null;
  end case; 

	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
  :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
	:sorlcur_priority_no := :global.sobctrl_priority_no;
	:sorlcur_cact_code := :s$_curricula.default_cact;
	:sorlcur_pidm := :s$_curricula.module_pidm;
	:sorlcur_key_seqno := :s$_curricula.module_key_seqno;
	:sorlcur_cact_code := :s$_curricula.default_cact;
  :lcur_rec_num  := 1;
  :lcur_rec_cnt  := 1;

 
  :sorlcur_curr_rule := null;
  :defaultinsert_inprogress := 'Y';
  if :sorlcur_program is not null and 
   	get_item_property('SORLCUR_PROGRAM',VISIBLE) = 'TRUE' then 
      go_item('sorlcur_program');
      g$_check_failure;
      next_item;
      g$_check_failure;
  end if; 
  if :lcur_sobctrl_curr_rule_ind = 'Y' then
     execute_trigger('lcur_check_program');
     g$_check_failure;
     :defaultinsert_inprogress := 'N';
  end if;

  soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm);
  soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm);
	soklcur.p_create_sotlcur(
	  p_pidm =>:s$_curricula.module_pidm, 
	  p_seqno => :sorlcur_seqno,
	  p_cact_code => :sorlcur_cact_code, 
	  p_priority_no => :sorlcur_priority_no,
	  p_term_code => :s$_curricula.module_term_code, 
	  p_key_seqno => :s$_curricula.module_key_seqno,
	  p_lmod_code => :s$_curricula.module_code); 
	 
 
  :s$_curricula.original_sorlcur_count :=  1;
  if    :s$_curricula.default_major is not null or 
          (      ( :s$_curricula.module_code = sb_curriculum_str.f_admissions 
                       and :global.admissions_majr_code is not null  or 
                     :global.admissions_dept_code is not null) 
              OR  ( :s$_curricula.module_code = sb_curriculum_str.f_learner 
                       and :global.learner_majr_code is not null  or 
                     :global.learner_dept_code is not null) 
              OR  ( :s$_curricula.module_code = sb_curriculum_str.f_recruit 
                       and :global.recruit_majr_code is not null  or 
                     :global.recruit_dept_code is not null)  

              OR  ( :s$_curricula.module_code = sb_curriculum_str.f_outcome 
                       and :global.outcome_majr_code is not null  or 
                     :global.outcome_dept_code is not null)  ) OR 
	     :sorlfos_majr_code is not null then 

		go_block('sorlfos'); 
		if :sorlfos_majr_code is null then 
       case :s$_curricula.module_code 
		       when sb_curriculum_str.f_recruit then 
	           	:sorlfos_majr_code := nvl(:global.recruit_majr_code, 
                                                :s$_curricula.default_major);
	            :sorlfos_dept_code :=   nvl(:global.recruit_dept_code,  
                                               :s$_curricula.default_dept);
  		        :sorlfos_lfos_rule := :s$_curricula.default_cmjr_rule;
          when sb_curriculum_str.f_admissions then 
	           	:sorlfos_majr_code := nvl(:global.admissions_majr_code, 
                                                           :s$_curricula.default_major);
	            :sorlfos_dept_code :=   nvl(:global.admissions_dept_code,  
                                                   :s$_curricula.default_dept);
  		        :sorlfos_lfos_rule := :s$_curricula.default_cmjr_rule;
          when sb_curriculum_str.f_learner then 
	           	:sorlfos_majr_code := nvl(:global.learner_majr_code, 
                                                          :s$_curricula.default_major);
	            :sorlfos_dept_code :=   nvl(:global.learner_dept_code,  
                                                   :s$_curricula.default_dept);
  		        :sorlfos_lfos_rule := :s$_curricula.default_cmjr_rule;
          when sb_curriculum_str.f_outcome then 
	          	:sorlfos_majr_code := nvl(:global.outcome_majr_code, 
                                                           :s$_curricula.default_major);
	            :sorlfos_dept_code :=   nvl(:global.outcome_dept_code,  
                                                   :s$_curricula.default_dept);
  		        :sorlfos_lfos_rule := :s$_curricula.default_cmjr_rule;
          else 
              null;
        end case; 
		end if; 
		:sovlfos_rowid := NULL;
	  :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	  :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
		:sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
	 	:SORLFOS_LFST_CODE_DESC := gb_gtvlfst.f_get_description(:sorlfos_lfst_code);
		:sorlfos_cact_code := :s$_curricula.default_cact;
		:sorlfos_csts_code := :s$_curricula.default_csts;
	  :sorlfos_priority_no := :global.sobctrl_priority_no;
	 	:sorlfos_pidm := :s$_curricula.module_pidm;
		:sorlfos_term_code := :s$_curricula.module_term_code;
		:sorlfos_term_code_ctlg := :s$_curricula.module_term_code;
	  :sorlfos_lcur_seqno := :sorlcur_seqno;
	  :sorlfos_seqno := sb_fieldofstudy_rules.f_seqno(:s$_curricula.module_pidm, :sorlcur_seqno);
    :sorlfos_seqno_cnt := :sorlfos_seqno;
    set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
    set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');

    if :sorlfos_majr_code is not null and :sorlfos_dept_code is null then 
	  	  --- default in the dept if the major is filled in and there
	  	  --- is a curriculum
	    execute_trigger('LFOS_CHECK_PROGRAM_MAJOR');
	  end if; 
    soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
       p_lcur_seqno => :sorlcur_seqno,
       p_seqno => :sorlfos_seqno,
       p_cact_code => :sorlfos_cact_code,
       p_lfst_code => :sorlfos_lfst_code,
       p_priority_no => :sorlfos_priority_no ,
       p_majr_code => :sorlfos_majr_code,
       p_dept_code => :sorlfos_dept_code);
	end if; -- default major is null 

  
end if; -- defaults for curriculum were not null 

:s$_curricula.sorlcur_block_status := 'Y';
:s$_curricula.default_level := ''; 
:s$_curricula.default_college := '';
:s$_curricula.default_campus := '';
:s$_curricula.default_degree := '';
:s$_curricula.default_program := '';
 
go_item(save_item); 

end; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.DEFAULT_TAB_CURRICULA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DEFAULT_TAB_CURRICULA")
		public void Soqolib_DefaultTabCurricula()
		{
			
				//  this trigger is called by new_sorlcur_inst for saaadms,
				//  srarecr, sfaregs, sgastdn and shadegr. 
				//  It defaults the initial record with values from default sources.
				//  Recruits get all 0 values in level, college, degree, major. 
				//  Now all can get initial values from curriculum user preferences 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				NString pApdcCode = NString.getNull();

				{
					NString saveItem = getCurrentItem();
					
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_cact_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCsts());
					Ref<NString> p_csts_out_ref = new Ref<NString>(getFormModel().getSCurricula().getDefaultCact());
					
					Soklcur.pDefaultStatus(
							/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), 
							/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(), 
							/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), 
							/*pKeyseqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), 
							/*pStstCode=>*/getFormModel().getSCurricula().getModuleStstCode(), 
							/*pDegsCode=>*/getFormModel().getSCurricula().getModuleDegsCode(),
							pApdcCode,
							/*pCactOut=>*/p_csts_out_ref, 
							p_cact_out_ref);
					
					
					
					
					
					
					
					
					
					
					getFormModel().getSCurricula().setDefaultCsts(p_cact_out_ref.val);
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					this.getContainer().getServices().retrieveDefaults(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
					if ( ((!getFormModel().getSCurricula().getDefaultLevel().isNull() || !getFormModel().getSCurricula().getDefaultCampus().isNull() || !getFormModel().getSCurricula().getDefaultProgram().isNull() || !getFormModel().getSCurricula().getDefaultDegree().isNull() || !getFormModel().getSCurricula().getDefaultCollege().isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && (!getGlobal("LEARNER_LEVL_CODE").isNull() || !getGlobal("LEARNER_CAMP_CODE").isNull() || !getGlobal("LEARNER_COLL_CODE").isNull() || !getGlobal("LEARNER_DEGC_CODE").isNull() || !getGlobal("LEARNER_MAJR_CODE").isNull() || !getGlobal("LEARNER_DEPT_CODE").isNull() || !getGlobal("LEARNER_PROGRAM").isNull())) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) && (!getGlobal("RECRUIT_LEVL_CODE").isNull() || !getGlobal("RECRUIT_CAMP_CODE").isNull() || !getGlobal("RECRUIT_COLL_CODE").isNull() || !getGlobal("RECRUIT_DEGC_CODE").isNull() || !getGlobal("RECRUIT_MAJR_CODE").isNull() || !getGlobal("RECRUIT_DEPT_CODE").isNull() || !getGlobal("RECRUIT_PROGRAM").isNull())) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()) && (!getGlobal("OUTCOME_LEVL_CODE").isNull() || !getGlobal("OUTCOME_CAMP_CODE").isNull() || !getGlobal("OUTCOME_COLL_CODE").isNull() || !getGlobal("OUTCOME_DEGC_CODE").isNull() || !getGlobal("OUTCOME_MAJR_CODE").isNull() || !getGlobal("OUTCOME_DEPT_CODE").isNull() || !getGlobal("OUTCOME_PROGRAM").isNull())) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()) && (!getGlobal("ADMISSIONS_LEVL_CODE").isNull() || !getGlobal("ADMISSIONS_CAMP_CODE").isNull() || !getGlobal("ADMISSIONS_COLL_CODE").isNull() || !getGlobal("ADMISSIONS_DEGC_CODE").isNull() || !getGlobal("ADMISSIONS_MAJR_CODE").isNull() || !getGlobal("ADMISSIONS_DEPT_CODE").isNull() || !getGlobal("ADMISSIONS_PROGRAM").isNull()))) && !getFormModel().getSCurricula().getModuleTermCode().isNull() && !getFormModel().getSCurricula().getModuleKeySeqno().isNull() )
					{
						goBlock(toStr("sorlcur"));
						// 	create_record;
						getFormModel().getSCurricula().setDefaultOptionsInd(toStr("Y"));
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						sorlcurElement.setSorlcurTermCodeCtlg(getFormModel().getSCurricula().getModuleTermCode());
						sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
						sorlcurElement.setSorlcurAdmtCode(getFormModel().getSCurricula().getDefaultAdmt());
						if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
						{
							if ((!getGlobal("LEARNER_LEVL_CODE").isNull() || !getGlobal("LEARNER_CAMP_CODE").isNull() || !getGlobal("LEARNER_COLL_CODE").isNull() || !getGlobal("LEARNER_DEGC_CODE").isNull() || !getGlobal("LEARNER_PROGRAM").isNull()))
							{
								sorlcurElement.setSorlcurLevlCode(getGlobal("LEARNER_LEVL_CODE"));
								sorlcurElement.setSorlcurCampCode(getGlobal("LEARNER_CAMP_CODE"));
								sorlcurElement.setSorlcurCollCode(getGlobal("LEARNER_COLL_CODE"));
								sorlcurElement.setSorlcurDegcCode(getGlobal("LEARNER_DEGC_CODE"));
								sorlcurElement.setSorlcurProgram(getGlobal("LEARNER_PROGRAM"));
							}
							else {
								sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getDefaultLevel());
								sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getDefaultCampus());
								sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getDefaultCollege());
								sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getDefaultDegree());
								sorlcurElement.setSorlcurProgram(getFormModel().getSCurricula().getDefaultProgram());
							}
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
						{
							if ((!getGlobal("RECRUIT_LEVL_CODE").isNull() || !getGlobal("RECRUIT_CAMP_CODE").isNull() || !getGlobal("RECRUIT_COLL_CODE").isNull() || !getGlobal("RECRUIT_DEGC_CODE").isNull() || !getGlobal("RECRUIT_PROGRAM").isNull()))
							{
								sorlcurElement.setSorlcurLevlCode(getGlobal("RECRUIT_LEVL_CODE"));
								sorlcurElement.setSorlcurCampCode(getGlobal("RECRUIT_CAMP_CODE"));
								sorlcurElement.setSorlcurCollCode(getGlobal("RECRUIT_COLL_CODE"));
								sorlcurElement.setSorlcurDegcCode(getGlobal("RECRUIT_DEGC_CODE"));
								sorlcurElement.setSorlcurProgram(getGlobal("RECRUIT_PROGRAM"));
							}
							else {
								sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getDefaultLevel());
								sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getDefaultCampus());
								sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getDefaultCollege());
								sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getDefaultDegree());
								sorlcurElement.setSorlcurProgram(getFormModel().getSCurricula().getDefaultProgram());
							}
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
						{
							if ((!getGlobal("ADMISSIONS_LEVL_CODE").isNull() || !getGlobal("ADMISSIONS_CAMP_CODE").isNull() || !getGlobal("ADMISSIONS_COLL_CODE").isNull() || !getGlobal("ADMISSIONS_DEGC_CODE").isNull() || !getGlobal("ADMISSIONS_PROGRAM").isNull()))
							{
								sorlcurElement.setSorlcurLevlCode(getGlobal("ADMISSIONS_LEVL_CODE"));
								sorlcurElement.setSorlcurCampCode(getGlobal("ADMISSIONS_CAMP_CODE"));
								sorlcurElement.setSorlcurCollCode(getGlobal("ADMISSIONS_COLL_CODE"));
								sorlcurElement.setSorlcurDegcCode(getGlobal("ADMISSIONS_DEGC_CODE"));
								sorlcurElement.setSorlcurProgram(getGlobal("ADMISSIONS_PROGRAM"));
							}
							else {
								sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getDefaultLevel());
								sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getDefaultCampus());
								sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getDefaultCollege());
								sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getDefaultDegree());
								sorlcurElement.setSorlcurProgram(getFormModel().getSCurricula().getDefaultProgram());
							}
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
						{
							if ( !getGlobal("OUTCOME_LEVL_CODE").isNull() || !getGlobal("OUTCOME_CAMP_CODE").isNull() || !getGlobal("OUTCOME_COLL_CODE").isNull() || !getGlobal("OUTCOME_DEGC_CODE").isNull() || !getGlobal("OUTCOME_PROGRAM").isNull() )
							{
								sorlcurElement.setSorlcurLevlCode(getGlobal("OUTCOME_LEVL_CODE"));
								sorlcurElement.setSorlcurCampCode(getGlobal("OUTCOME_CAMP_CODE"));
								sorlcurElement.setSorlcurCollCode(getGlobal("OUTCOME_COLL_CODE"));
								sorlcurElement.setSorlcurDegcCode(getGlobal("OUTCOME_DEGC_CODE"));
								sorlcurElement.setSorlcurProgram(getGlobal("OUTCOME_PROGRAM"));
							}
							else {
								sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getDefaultLevel());
								sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getDefaultCampus());
								sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getDefaultCollege());
								sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getDefaultDegree());
								sorlcurElement.setSorlcurProgram(getFormModel().getSCurricula().getDefaultProgram());
							}
						}
						else {
						}
						sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
						sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
						sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
						sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
						sorlcurElement.setSorlcurPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
						sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
						sorlcurElement.setSorlcurPidm(getFormModel().getSCurricula().getModulePidm());
						sorlcurElement.setSorlcurKeySeqno(getFormModel().getSCurricula().getModuleKeySeqno());
						sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(1));
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(1));
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("Y"));
						if ( !sorlcurElement.getSorlcurProgram().isNull() && getItemVisible("SORLCUR_PROGRAM").equals("TRUE") )
						{
							goItem(toStr("sorlcur_program"));
							getContainer().getGoqrpls().gCheckFailure();
							nextItem();
							getContainer().getGoqrpls().gCheckFailure();
						}
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
						{
							executeAction("lcur_check_program");
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("N"));
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
						
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(
								/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), 
								/*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), 
								/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(),
								/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), 
								/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(),
								/*pCactCode=>*/sorlcurElement.getSorlcurCactCode(),
								/*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), 
								/*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(),
								/*pCollCode=>*/sorlcurElement.getSorlcurCollCode(),
								/*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(),
								/*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg(),
								 /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(),
								 /*pProgram=>*/sorlcurElement.getSorlcurProgram());
						
						
						getFormModel().getSCurricula().setOriginalSorlcurCount(toNumber(1));
						if ( !getFormModel().getSCurricula().getDefaultMajor().isNull() || ((getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()) && !getGlobal("ADMISSIONS_MAJR_CODE").isNull() || !getGlobal("ADMISSIONS_DEPT_CODE").isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && !getGlobal("LEARNER_MAJR_CODE").isNull() || !getGlobal("LEARNER_DEPT_CODE").isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()) && !getGlobal("RECRUIT_MAJR_CODE").isNull() || !getGlobal("RECRUIT_DEPT_CODE").isNull()) || (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()) && !getGlobal("OUTCOME_MAJR_CODE").isNull() || !getGlobal("OUTCOME_DEPT_CODE").isNull())) || !sorlfosElement.getSorlfosMajrCode().isNull() )
						{
							goBlock(toStr("sorlfos"));
							if ( sorlfosElement.getSorlfosMajrCode().isNull() )
							{
								if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
								{
									sorlfosElement.setSorlfosMajrCode(isNull(getGlobal("RECRUIT_MAJR_CODE"), getFormModel().getSCurricula().getDefaultMajor()));
									sorlfosElement.setSorlfosDeptCode(isNull(getGlobal("RECRUIT_DEPT_CODE"), getFormModel().getSCurricula().getDefaultDept()));
									sorlfosElement.setSorlfosLfosRule(getFormModel().getSCurricula().getDefaultCmjrRule());
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
								{
									sorlfosElement.setSorlfosMajrCode(isNull(getGlobal("ADMISSIONS_MAJR_CODE"), getFormModel().getSCurricula().getDefaultMajor()));
									sorlfosElement.setSorlfosDeptCode(isNull(getGlobal("ADMISSIONS_DEPT_CODE"), getFormModel().getSCurricula().getDefaultDept()));
									sorlfosElement.setSorlfosLfosRule(getFormModel().getSCurricula().getDefaultCmjrRule());
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
								{
									sorlfosElement.setSorlfosMajrCode(isNull(getGlobal("LEARNER_MAJR_CODE"), getFormModel().getSCurricula().getDefaultMajor()));
									sorlfosElement.setSorlfosDeptCode(isNull(getGlobal("LEARNER_DEPT_CODE"), getFormModel().getSCurricula().getDefaultDept()));
									sorlfosElement.setSorlfosLfosRule(getFormModel().getSCurricula().getDefaultCmjrRule());
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
								{
									sorlfosElement.setSorlfosMajrCode(isNull(getGlobal("OUTCOME_MAJR_CODE"), getFormModel().getSCurricula().getDefaultMajor()));
									sorlfosElement.setSorlfosDeptCode(isNull(getGlobal("OUTCOME_DEPT_CODE"), getFormModel().getSCurricula().getDefaultDept()));
									sorlfosElement.setSorlfosLfosRule(getFormModel().getSCurricula().getDefaultCmjrRule());
								}
								else {
								}
							}
							sorlfosElement.setSovlfosRowid(toStr(null));
							sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
							sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
							sorlfosElement.setSorlfosLfstCode(SbFieldofstudyStr.fMajor());
							sorlfosElement.setSorlfosLfstCodeDesc(GbGtvlfst.fGetDescription(sorlfosElement.getSorlfosLfstCode()));
							sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
							sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
							sorlfosElement.setSorlfosPidm(getFormModel().getSCurricula().getModulePidm());
							sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSorlfosTermCodeCtlg(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSorlfosLcurSeqno(sorlcurElement.getSorlcurSeqno());
							sorlfosElement.setSorlfosSeqno(SbFieldofstudyRules.fSeqno(getFormModel().getSCurricula().getModulePidm(), sorlcurElement.getSorlcurSeqno()));
							sorlcurElement.setSorlfosSeqnoCnt(sorlfosElement.getSorlfosSeqno());
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
							if ( !sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSorlfosDeptCode().isNull() )
							{
								// - default in the dept if the major is filled in and there
								// - is a curriculum
								executeAction("LFOS_CHECK_PROGRAM_MAJOR");
							}
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(), /*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg());
						
						}
					}
					//  defaults for curriculum were not null 
					getFormModel().getSCurricula().setSorlcurBlockStatus(toStr("Y"));
					getFormModel().getSCurricula().setDefaultLevel(toStr(""));
					getFormModel().getSCurricula().setDefaultCollege(toStr(""));
					getFormModel().getSCurricula().setDefaultCampus(toStr(""));
					getFormModel().getSCurricula().setDefaultDegree(toStr(""));
					getFormModel().getSCurricula().setDefaultProgram(toStr(""));
					goItem(saveItem);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_DEFAULT_MAJOR
		 --- CURR_DEFAULT_MAJOR   Trigger
<multilinecomment>* curr_default_major routine called after the program *</multilinecomment>
<multilinecomment>* this routine will populate the major & dept code
    if there in only one attached major to the rule     *</multilinecomment>



declare
  temp_dept varchar2(30);
  temp_curr_rule number;
  temp_major varchar2(30);
  temp_cmjr_rule number;
begin
   temp_curr_rule := :sorlcur_curr_rule;
   select sorcmjr_majr_code, sorcmjr_dept_code ,
       sorcmjr_cmjr_rule
       into temp_major, temp_dept , temp_cmjr_rule
   from sorcmjr x
   where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))
     and x.sorcmjr_curr_rule = temp_curr_rule
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
    
     :s$_curricula.default_major := temp_major;
     :s$_curricula.default_dept := temp_dept;
     :s$_curricula.default_cmjr_rule := temp_cmjr_rule; 
     -- only insert new major if no lfos exists 
     -- assumed the sorlfos referenced in the if is the first record 
      if    :sorlfos_majr_code is null OR :sorlfos_majr_code = '0000' 
      	   then 
  		   :sorlfos_cact_code := :s$_curricula.default_cact;
		     :sorlfos_term_code := :sorlcur_term_code;
		     :sorlfos_csts_code := :s$_curricula.default_csts; 
		     :sorlfos_majr_code := :s$_curricula.default_major;
		     :sorlfos_seqno     := 1;
		     :sorlfos_seqno_cnt := 1; 
		     :sorlfos_lfos_rule := :s$_curricula.default_cmjr_rule; 
		     :sorlfos_dept_code := :s$_curricula.default_dept;
		     :sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
		     :SORLFOS_LFST_CODE_DESC := gb_gtvlfst.f_get_description(:sorlfos_lfst_code);
		     :sorlfos_priority_no := :global.sobctrl_priority_no;
		 	   :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
			   :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
			   :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
			   :sorlfos_majr_code_attach := null;
	       :sorlfos_conc_attach_rule := null;
	       :sorlfos_attach_conc_desc := null;
         set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
         set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');

         soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
            p_lcur_seqno =>:sorlcur_seqno, p_seqno => :sorlfos_seqno );
       	 soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
           p_lcur_seqno => nvl(:sorlcur_seqno,999),
           p_seqno => nvl(:sorlfos_seqno,999),
           p_cact_code => :sorlfos_cact_code,
           p_lfst_code => :sorlfos_lfst_code,
           p_priority_no => :sorlfos_priority_no ,
           p_majr_code => :sorlfos_majr_code,
           p_dept_code => :sorlfos_dept_code); 
 		
	   end if; 
    
 exception
   when no_data_found then
      NULL;
   when too_many_rows then
     NULL;
 end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_DEFAULT_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_DEFAULT_MAJOR")
		public void Soqolib_LcurDefaultMajor()
		{
			
				// - CURR_DEFAULT_MAJOR   Trigger
				// * curr_default_major routine called after the program *
				// * this routine will populate the major & dept code
				// if there in only one attached major to the rule     *

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NString tempDept= NString.getNull();
					NNumber tempCurrRule= NNumber.getNull();
					NString tempMajor= NString.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					try
					{
						tempCurrRule = sorlcurElement.getSorlcurCurrRule();
						String sql1 = "SELECT sorcmjr_majr_code, sorcmjr_dept_code, sorcmjr_cmjr_rule " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) ) AND x.sorcmjr_curr_rule = :P_TEMP_CURR_RULE AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						command1.addParameter("P_TEMP_CURR_RULE", tempCurrRule);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempMajor = results1.getStr(0);
							tempDept = results1.getStr(1);
							tempCmjrRule = results1.getNumber(2);
						}
						results1.close();
						getFormModel().getSCurricula().setDefaultMajor(tempMajor);
						getFormModel().getSCurricula().setDefaultDept(tempDept);
						getFormModel().getSCurricula().setDefaultCmjrRule(tempCmjrRule);
						//  only insert new major if no lfos exists 
						//  assumed the sorlfos referenced in the if is the first record 
						if ( sorlfosElement.getSorlfosMajrCode().isNull() || sorlfosElement.getSorlfosMajrCode().equals("0000") )
						{
							sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
							sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
							sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
							sorlfosElement.setSorlfosMajrCode(getFormModel().getSCurricula().getDefaultMajor());
							sorlfosElement.setSorlfosSeqno(toNumber(1));
							sorlcurElement.setSorlfosSeqnoCnt(toNumber(1));
							sorlfosElement.setSorlfosLfosRule(getFormModel().getSCurricula().getDefaultCmjrRule());
							sorlfosElement.setSorlfosDeptCode(getFormModel().getSCurricula().getDefaultDept());
							sorlfosElement.setSorlfosLfstCode(SbFieldofstudyStr.fMajor());
							sorlfosElement.setSorlfosLfstCodeDesc(GbGtvlfst.fGetDescription(sorlfosElement.getSorlfosLfstCode()));
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
							sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
							sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
							sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
							sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
							sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
							sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(), /*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg());
							
						}
					}
					catch(NoDataFoundException e)
					{
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_CHECK_PROGRAM
		 --  CHECK_PROGRAM  trigger
<multilinecomment> check_program trigger
   this is called the post text triggers on the level,
   campus, college, degree fields.  This trigger tries 
   to derive the program based on codes entered on field.  </multilinecomment>

 
:lcur_ctlg_term := nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code); 

declare
  temp_rule number;
  temp_rule_out number;
  temp_program varchar2(30):= '';
  temp_program_in varchar2(30):= '';
  temp_degree varchar2(30):= '';
  temp_campus varchar2(30):= '';
  temp_level  varchar2(30):= '';
  temp_college varchar2(30):= '';
  temp_desc varchar2(50) := '';
  
 
begin
    if :sorlcur_curr_rule is not null then 
       temp_rule := :sorlcur_curr_rule;
    else 
       temp_rule := null;
    end if;
    if :sorlcur_program is not null and 
       :sorlcur_program <> '************' then 
       temp_program_in := :sorlcur_program;
    else 
       temp_program_in := null;
    end if;
     
    select sobcurr_program, sobcurr_levl_code, sobcurr_camp_code,
      sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule
    into temp_program, temp_level, temp_campus, temp_college, 
       temp_degree, temp_rule_out
    from sobcurr x
    where  ( ( x.sobcurr_curr_rule = temp_rule) or
        (   temp_rule is null
         and (( :sorlcur_levl_code is not null
                or :sorlcur_coll_code is not null
                or :sorlcur_camp_code is not null
                or :sorlcur_degc_code is not null)
        and ( x.sobcurr_levl_code = :sorlcur_levl_code
           or :sorlcur_levl_code is null)
        and ((:sorlcur_coll_code is null)
           or (x.sobcurr_coll_code = :sorlcur_coll_code))
        and ((:sorlcur_degc_code is null)
           or (x.sobcurr_degc_code = :sorlcur_degc_code))
        and (( :sorlcur_camp_code is null)
          or (x.sobcurr_camp_code = :sorlcur_camp_code)  )
        and (( temp_program_in is null)
          or (x.sobcurr_program  = temp_program_in)  ) )
        or (x.sobcurr_program = temp_program_in and temp_program_in is not null
           and :sorlcur_levl_code is null and :sorlcur_coll_code is null
           and :sorlcur_camp_code is null and :sorlcur_degc_code is null)  ))
    and sobcurr_lock_ind = 'Y'
    and sobcurr_term_code_init <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code)
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code))
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));


     :sorlcur_curr_rule := temp_rule_out;
     :sorlcur_program := temp_program;
     if :sorlcur_levl_code is null and temp_level is not null then 
        :sorlcur_levl_code := temp_level;
        :sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);

      end if;
   
     if :sorlcur_coll_code is null and temp_college is not null then 
        :sorlcur_coll_code := temp_college;
        :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);

     end if;
     
     if :sorlcur_camp_code is null and temp_campus is not null then 
        :sorlcur_camp_code := temp_campus;
       	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
     end if;
  
     if :sorlcur_degc_code is null and temp_degree is not null then 
     	  :sorlcur_degc_code := temp_degree; 
     	 	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
     end if;
    if :sorlcur_curr_rule is not null and
       :sorlcur_curr_rule <> 0 and 
       nvl(:defaultinsert_inprogress, 'N') = 'N' then  
          execute_trigger('lcur_default_major');
    end if;
--message('after lcur check ' || :sorlcur_levl_code || 
--   ' col ' || :sorlcur_coll_code || ' degr ' || :sorlcur_degc_code 
--   || ' cam ' || :sorlcur_camp_code || ' pgm ' || :sorlcur_program);
exception
   when no_data_found then
 --  message('after lcur check, no records found ' || :sorlcur_levl_code || 
 --  ' col ' || :sorlcur_coll_code || ' degr ' || :sorlcur_degc_code 
 --  || ' cam ' || :sorlcur_camp_code || ' pgm ' || :sorlcur_program);
         execute_trigger('check_lcur_lock');
        if :lcur_lock_ind = 'N' then 
             execute_trigger('lcur_lock_message');
        end if;
   when too_many_rows then
     if :sorlcur_degc_code is null and 
      :sorlcur_camp_code is null and 
      :sorlcur_levl_code  is null and 
      :sorlcur_coll_code is null  then 
          :sorlcur_program  := ''; 
    else 
        :sorlcur_program := '************';
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_CHECK_PROGRAM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_CHECK_PROGRAM")
		public void Soqolib_LcurCheckProgram()
		{
			
				//   CHECK_PROGRAM  trigger
				//  check_program trigger
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				//   CHECK_PROGRAM  trigger
				//  check_program trigger
				// this is called the post text triggers on the level,
				// campus, college, degree fields.  This trigger tries
				// to derive the program based on codes entered on field.  
				getFormModel().getSCurricula().setLcurCtlgTerm(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
				{
					NNumber tempRule= NNumber.getNull();
					NNumber tempRuleOut= NNumber.getNull();
					NString tempProgram = toStr("");
					NString tempProgramIn = toStr("");
					NString tempDegree = toStr("");
					NString tempCampus = toStr("");
					NString tempLevel = toStr("");
					NString tempCollege = toStr("");
					NString tempDesc = toStr("");
					try
					{
						if ( !sorlcurElement.getSorlcurCurrRule().isNull() )
						{
							tempRule = sorlcurElement.getSorlcurCurrRule();
						}
						else {
							tempRule = toNumber(null);
						}
						if ( !sorlcurElement.getSorlcurProgram().isNull() && sorlcurElement.getSorlcurProgram().notEquals("************") )
						{
							tempProgramIn = sorlcurElement.getSorlcurProgram();
						}
						else {
							tempProgramIn = toStr(null);
						}
						String sql1 = "SELECT sobcurr_program, sobcurr_levl_code, sobcurr_camp_code, sobcurr_coll_code, sobcurr_degc_code, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE) OR (:P_TEMP_RULE IS NULL AND ((:SORLCUR_LEVL_CODE IS NOT NULL OR :SORLCUR_COLL_CODE IS NOT NULL OR :SORLCUR_CAMP_CODE IS NOT NULL OR :SORLCUR_DEGC_CODE IS NOT NULL) AND (x.sobcurr_levl_code = :SORLCUR_LEVL_CODE OR :SORLCUR_LEVL_CODE IS NULL) AND ((:SORLCUR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :SORLCUR_COLL_CODE)) AND ((:SORLCUR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :SORLCUR_DEGC_CODE)) AND ((:SORLCUR_CAMP_CODE IS NULL) OR (x.sobcurr_camp_code = :SORLCUR_CAMP_CODE)) AND ((:P_TEMP_PROGRAM_IN IS NULL) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN))) OR (x.sobcurr_program = :P_TEMP_PROGRAM_IN AND :P_TEMP_PROGRAM_IN IS NOT NULL AND :SORLCUR_LEVL_CODE IS NULL AND :SORLCUR_COLL_CODE IS NULL AND :SORLCUR_CAMP_CODE IS NULL AND :SORLCUR_DEGC_CODE IS NULL))) AND sobcurr_lock_ind = 'Y' AND sobcurr_term_code_init <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("SORLCUR_LEVL_CODE", sorlcurElement.getSorlcurLevlCode());
						command1.addParameter("SORLCUR_COLL_CODE", sorlcurElement.getSorlcurCollCode());
						command1.addParameter("SORLCUR_CAMP_CODE", sorlcurElement.getSorlcurCampCode());
						command1.addParameter("SORLCUR_DEGC_CODE", sorlcurElement.getSorlcurDegcCode());
						command1.addParameter("P_TEMP_PROGRAM_IN", tempProgramIn);
						command1.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempLevel = results1.getStr(1);
							tempCampus = results1.getStr(2);
							tempCollege = results1.getStr(3);
							tempDegree = results1.getStr(4);
							tempRuleOut = results1.getNumber(5);
						}
						results1.close();
						sorlcurElement.setSorlcurCurrRule(tempRuleOut);
						sorlcurElement.setSorlcurProgram(tempProgram);
						if ( sorlcurElement.getSorlcurLevlCode().isNull() && !tempLevel.isNull() )
						{
							sorlcurElement.setSorlcurLevlCode(tempLevel);
							sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
						}
						if ( sorlcurElement.getSorlcurCollCode().isNull() && !tempCollege.isNull() )
						{
							sorlcurElement.setSorlcurCollCode(tempCollege);
							sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
						}
						if ( sorlcurElement.getSorlcurCampCode().isNull() && !tempCampus.isNull() )
						{
							sorlcurElement.setSorlcurCampCode(tempCampus);
							sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
						}
						if ( sorlcurElement.getSorlcurDegcCode().isNull() && !tempDegree.isNull() )
						{
							sorlcurElement.setSorlcurDegcCode(tempDegree);
							sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
						}
						if ( !sorlcurElement.getSorlcurCurrRule().isNull() && sorlcurElement.getSorlcurCurrRule().notEquals(0) && isNull(getFormModel().getSCurricula().getDefaultinsertInprogress(), "N").equals("N") )
						{
							executeAction("lcur_default_major");
						}
					}
					catch(NoDataFoundException e)
					{
						//   message('after lcur check, no records found ' || :sorlcur_levl_code || 
						//   ' col ' || :sorlcur_coll_code || ' degr ' || :sorlcur_degc_code 
						//   || ' cam ' || :sorlcur_camp_code || ' pgm ' || :sorlcur_program);
						executeAction("check_lcur_lock");
						if ( getFormModel().getSCurricula().getLcurLockInd().equals("N") )
						{
							executeAction("lcur_lock_message");
						}
					}
					catch(TooManyRowsException e)
					{
						if ( sorlcurElement.getSorlcurDegcCode().isNull() && sorlcurElement.getSorlcurCampCode().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() )
						{
							sorlcurElement.setSorlcurProgram(toStr(""));
						}
						else {
							sorlcurElement.setSorlcurProgram(toStr("************"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_LCUR_LOCK
		 --  CHECK_LOCK  trigger
<multilinecomment> check_program trigger
   This is called in the post text field of the program to verifiy
  that the program selected is locked.  </multilinecomment>
 

:lcur_lock_ind := '';
declare
    temp_lock_ind varchar2(1);
    temp_rule number;

begin
    if :sorlcur_program = '**********' then 
       :lcur_lock_ind := '';
       return;
    end if;
    
    
    select sobcurr_lock_ind, sobcurr_curr_rule
    into temp_lock_ind, temp_rule
    from sobcurr x
    where (  x.sobcurr_levl_code = :sorlcur_levl_code
        and (x.sobcurr_coll_code = :sorlcur_coll_code or :sorlcur_coll_code is null)
        and (x.sobcurr_degc_code = :sorlcur_degc_code or :sorlcur_degc_code is null)
        and (nvl(x.sobcurr_camp_code,'%') = nvl(:sorlcur_camp_code,'%') 
           or ( x.sobcurr_camp_code is null and :sorlcur_camp_code is not null) ) 
        and (nvl(x.sobcurr_program,'%') = nvl(:sorlcur_program,'%'))  )
    and sobcurr_term_code_init <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code)
    and exists
            (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code))
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));
   
   :lcur_lock_ind := temp_lock_ind;
   :sorlcur_curr_rule := temp_rule;
 
exception
   when no_data_found then
        :lcur_lock_ind := '';
        :sorlcur_curr_rule := null;
        
   when too_many_rows then
        :lcur_lock_ind := '';
        :sorlcur_curr_rule := null;
end;

null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_LCUR_LOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_LCUR_LOCK")
		public void Soqolib_CheckLcurLock()
		{
			
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				//   CHECK_LOCK  trigger
				//  check_program trigger
				// This is called in the post text field of the program to verifiy
				// that the program selected is locked.  
				getFormModel().getSCurricula().setLcurLockInd(toStr(""));
				{
					NString tempLockInd= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					try
					{
						if ( sorlcurElement.getSorlcurProgram().equals("**********") )
						{
							getFormModel().getSCurricula().setLcurLockInd(toStr(""));
							return ;
						}
						String sql1 = "SELECT sobcurr_lock_ind, sobcurr_curr_rule " +
	" FROM sobcurr x " +
	" WHERE (x.sobcurr_levl_code = :SORLCUR_LEVL_CODE AND (x.sobcurr_coll_code = :SORLCUR_COLL_CODE OR :SORLCUR_COLL_CODE IS NULL) AND (x.sobcurr_degc_code = :SORLCUR_DEGC_CODE OR :SORLCUR_DEGC_CODE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:SORLCUR_CAMP_CODE, '%') OR (x.sobcurr_camp_code IS NULL AND :SORLCUR_CAMP_CODE IS NOT NULL)) AND (nvl(x.sobcurr_program, '%') = nvl(:SORLCUR_PROGRAM, '%'))) AND sobcurr_term_code_init <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORLCUR_LEVL_CODE", sorlcurElement.getSorlcurLevlCode());
						command1.addParameter("SORLCUR_COLL_CODE", sorlcurElement.getSorlcurCollCode());
						command1.addParameter("SORLCUR_DEGC_CODE", sorlcurElement.getSorlcurDegcCode());
						command1.addParameter("SORLCUR_CAMP_CODE", sorlcurElement.getSorlcurCampCode());
						command1.addParameter("SORLCUR_PROGRAM", sorlcurElement.getSorlcurProgram());
						command1.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempLockInd = results1.getStr(0);
							tempRule = results1.getNumber(1);
						}
						results1.close();
						getFormModel().getSCurricula().setLcurLockInd(tempLockInd);
						sorlcurElement.setSorlcurCurrRule(tempRule);
					}
					catch(NoDataFoundException e)
					{
						getFormModel().getSCurricula().setLcurLockInd(toStr(""));
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
					}
					catch(TooManyRowsException e)
					{
						getFormModel().getSCurricula().setLcurLockInd(toStr(""));
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_PROGRAM_HELP
		 --- program_help   Trigger
<multilinecomment>*  key help for level, degree, college, campus and program   *</multilinecomment>
<multilinecomment>*  show the base rules defined on sobcurr                    *</multilinecomment>
DECLARE
	    lv_blk  BLOCK;

BEGIN
if instr(upper(:lcur_process),'LEVL',1) > 0 then 
   :lcur_program_process :=  G$_NLS.Get('SOQOLIB-0055', 'FORM','Level') ;
   :lcur_lov := 'sobcurr_levl_lov';
elsif instr(upper(:lcur_process),'COLL',1) > 0 then 
   :lcur_program_process := 'College';
   :lcur_lov := 'sobcurr_coll_lov';
elsif instr(upper(:lcur_process),'CAMP',1) > 0 then 
   :lcur_program_process := 'Campus';
   :lcur_lov := 'sobcurr_camp_lov';
elsif instr(upper(:lcur_process),'DEGC',1) > 0 then 
   :lcur_program_process := 'Degree';
   :lcur_lov := 'sobcurr_degc_lov';
elsif instr(upper(:lcur_process),'PROGRAM',1) > 0 then 
   :lcur_program_process :=  G$_NLS.Get('SOQOLIB-0056', 'FORM','Program') ;
   :lcur_lov := 'sobcurr_program_lov';
end if;

:s$_curricula.curr_levl_code := :sorlcur_levl_code;
:s$_curricula.curr_camp_code := :sorlcur_camp_code;
:s$_curricula.curr_degc_code := :sorlcur_degc_code;
:s$_curricula.curr_coll_code := :sorlcur_coll_code;
:s$_curricula.curr_program := :sorlcur_program;
:s$_curricula.curr_ctlg_term := :sorlcur_term_code_ctlg;

:global.sel_ind := '';

if :lcur_temp_rule_ind = 'N' then  
    execute_trigger('invalid_lcur_msg');
    do_key('LIST_VALUES');
else
if :lcur_sobctrl_curr_rule_ind = 'Y' or :lcur_temp_rule_ind = 'Y' then   
 --     save the fields entered on the form to the curr fields  
  :lcur_levl_code := :sorlcur_levl_code; 
  :lcur_coll_code := :sorlcur_coll_code;
  :lcur_degc_code := :sorlcur_degc_code;
  :lcur_camp_code := :sorlcur_camp_code; 
  if instr(:sorlcur_program,'*') = 1 then
       :lcur_program := '';
   else
       :lcur_program := :sorlcur_program;
   end if;

   :lcur_eff_term := nvl(:sorlcur_term_code,:sorlcur_term_code_ctlg);
   :lcur_ctlg_term := :sorlcur_term_code_ctlg;

   if :lcur_change_ind = 'Y' then
      set_lov_property(:lcur_lov,TITLE,'Change Curriculum');
   else
       set_lov_property(:lcur_lov,TITLE,'Base Curriculum Rules by ' || :lcur_program_process);
   end if;
   set_item_property(name_in('lcur_process'),LOV_NAME,:lcur_lov);
   g$_display_lov('',''); 
  
  -- no select was made on lov, if curr changes was selected, put back the values  
   if :global.sel_ind is null then
       if :lcur_change_ind = 'Y' then
         :sorlcur_levl_code := :hold_level;
         if :sorlcur_levl_code is not null then 
         	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
         end if;

           
         :sorlcur_camp_code := :hold_campus;
         if :sorlcur_camp_code is not null then 
         	  	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
         end if;
           
         :sorlcur_coll_code := :hold_college;
         if :sorlcur_coll_code is not null then 
         	  	:sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
         end if;
         
         :sorlcur_degc_code := :hold_degree;
         if :sorlcur_degc_code is not null then 
         	  	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
         end if;
           
         :sorlcur_program := :hold_program;
         :lcur_change_ind := 'N';
       end if;
   -- copy results from select to fields on the form 
   else
   
      
 
    IF :lcur_change_ind = 'Y' THEN
   		lv_blk := find_block('SORLCUR_LITE'); 
      IF ID_NULL(lv_blk) THEN 
      	GO_BLOCK('SORLFOS');
      ELSE 
      	GO_BLOCK('SORLFOS_LITE');
      END IF;
      --  clear lfos block 
      CLEAR_BLOCK(NO_VALIDATE);
      soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
         p_lcur_seqno => :sorlcur_seqno);
       
      -- go back to lcur block 
      IF ID_NULL(lv_blk) THEN 
      	GO_BLOCK('SORLCUR');
      ELSE 
      	GO_BLOCK('SORLCUR_LITE');
      END IF;
      :lcur_change_ind := 'N';
    END IF; 	
    :sorlcur_curr_rule := :global.curr_rule;
    :sorlcur_levl_code := :global.level_code;
    :change_levl_code := :sorlcur_levl_code;
    :sorlcur_camp_code := :global.campus;
    :change_camp_code := :global.campus;
    :sorlcur_coll_code := :global.college;
    :change_coll_code := :global.college;
    :sorlcur_degc_code := :global.degree_code;
    :change_degc_code := :global.degree_code;
    :sorlcur_program := :global.program;
    :change_program := :global.program; 
 	  :sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
	  :sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
    :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
   	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
    execute_trigger('lcur_check_program'); 
    :global.level_code := '';
    :global.college := '';
    :global.campus := '';
    :global.degree_code := '';
    :global.program := '';
    :global.curr_rule := '';
    :global.sel_ind := '';
   -- :sorlcur_curr_rule := null; 
    
    end if;
 else
  execute_trigger('invalid_lcur_msg');
  do_key('LIST_VALUES');
end if;
end if;

END;

 





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_PROGRAM_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_PROGRAM_HELP")
		public void Soqolib_LcurProgramHelp()
		{
			
				// - program_help   Trigger
				// *  key help for level, degree, college, campus and program   *
				// *  show the base rules defined on sobcurr                    *

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					BlockDescriptor lvBlk= null;
					if ( inStr(upper(getFormModel().getSCurricula().getLcurProcess()), toStr("LEVL"), toInt(1)).greater(0) )
					{
						getFormModel().getSCurricula().setLcurProgramProcess(GNls.Fget(toStr("SOQOLIB-0055"), toStr("FORM"), toStr("Level")));
						getFormModel().getSCurricula().setLcurLov(toStr("sobcurr_levl_lov"));
					}
					else if ( inStr(upper(getFormModel().getSCurricula().getLcurProcess()), toStr("COLL"), toInt(1)).greater(0) ) {
						getFormModel().getSCurricula().setLcurProgramProcess(toStr("College"));
						getFormModel().getSCurricula().setLcurLov(toStr("sobcurr_coll_lov"));
					}
					else if ( inStr(upper(getFormModel().getSCurricula().getLcurProcess()), toStr("CAMP"), toInt(1)).greater(0) ) {
						getFormModel().getSCurricula().setLcurProgramProcess(toStr("Campus"));
						getFormModel().getSCurricula().setLcurLov(toStr("sobcurr_camp_lov"));
					}
					else if ( inStr(upper(getFormModel().getSCurricula().getLcurProcess()), toStr("DEGC"), toInt(1)).greater(0) ) {
						getFormModel().getSCurricula().setLcurProgramProcess(toStr("Degree"));
						getFormModel().getSCurricula().setLcurLov(toStr("sobcurr_degc_lov"));
					}
					else if ( inStr(upper(getFormModel().getSCurricula().getLcurProcess()), toStr("PROGRAM"), toInt(1)).greater(0) ) {
						getFormModel().getSCurricula().setLcurProgramProcess(GNls.Fget(toStr("SOQOLIB-0056"), toStr("FORM"), toStr("Program")));
						getFormModel().getSCurricula().setLcurLov(toStr("sobcurr_program_lov"));
					}
					getFormModel().getSCurricula().setCurrLevlCode(sorlcurElement.getSorlcurLevlCode());
					getFormModel().getSCurricula().setCurrCampCode(sorlcurElement.getSorlcurCampCode());
					getFormModel().getSCurricula().setCurrDegcCode(sorlcurElement.getSorlcurDegcCode());
					getFormModel().getSCurricula().setCurrCollCode(sorlcurElement.getSorlcurCollCode());
					getFormModel().getSCurricula().setCurrProgram(sorlcurElement.getSorlcurProgram());
					getFormModel().getSCurricula().setCurrCtlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
					setGlobal("SEL_IND", toStr(""));
					if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
					{
						executeAction("invalid_lcur_msg");
						executeAction("LIST_VALUES");
					}
					else {
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") )
						{
							//      save the fields entered on the form to the curr fields  
							getFormModel().getSCurricula().setLcurLevlCode(sorlcurElement.getSorlcurLevlCode());
							getFormModel().getSCurricula().setLcurCollCode(sorlcurElement.getSorlcurCollCode());
							getFormModel().getSCurricula().setLcurDegcCode(sorlcurElement.getSorlcurDegcCode());
							getFormModel().getSCurricula().setLcurCampCode(sorlcurElement.getSorlcurCampCode());
							if ( inStr(sorlcurElement.getSorlcurProgram(), toStr("*")).equals(1) )
							{
								getFormModel().getSCurricula().setLcurProgram(toStr(""));
							}
							else {
								getFormModel().getSCurricula().setLcurProgram(sorlcurElement.getSorlcurProgram());
							}
							getFormModel().getSCurricula().setLcurEffTerm(isNull(sorlcurElement.getSorlcurTermCode(), sorlcurElement.getSorlcurTermCodeCtlg()));
							getFormModel().getSCurricula().setLcurCtlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
							if ( getFormModel().getSCurricula().getLcurChangeInd().equals("Y") )
							{
								setLovTitle(getFormModel().getSCurricula().getLcurLov(), "Change Curriculum");
							}
							else {
								setLovTitle(getFormModel().getSCurricula().getLcurLov(), toStr("Base Curriculum Rules by ").append(getFormModel().getSCurricula().getLcurProgramProcess()));
							}
							setItemLovName(getNameIn("lcur_process"), getFormModel().getSCurricula().getLcurLov());
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							//  no select was made on lov, if curr changes was selected, put back the values  
							if ( getGlobal("SEL_IND").isNull() )
							{
								if ( getFormModel().getSCurricula().getLcurChangeInd().equals("Y") )
								{
									sorlcurElement.setSorlcurLevlCode(getFormModel().getSSobctrlBlock().getHoldLevel());
									if ( !sorlcurElement.getSorlcurLevlCode().isNull() )
									{
										sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
									}
									sorlcurElement.setSorlcurCampCode(getFormModel().getSSobctrlBlock().getHoldCampus());
									if ( !sorlcurElement.getSorlcurCampCode().isNull() )
									{
										sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
									}
									sorlcurElement.setSorlcurCollCode(getFormModel().getSSobctrlBlock().getHoldCollege());
									if ( !sorlcurElement.getSorlcurCollCode().isNull() )
									{
										sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
									}
									sorlcurElement.setSorlcurDegcCode(getFormModel().getSSobctrlBlock().getHoldDegree());
									if ( !sorlcurElement.getSorlcurDegcCode().isNull() )
									{
										sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
									}
									sorlcurElement.setSorlcurProgram(getFormModel().getSSobctrlBlock().getHoldProgram());
									getFormModel().getSCurricula().setLcurChangeInd(toStr("N"));
								}
							}
							else {
								if ( getFormModel().getSCurricula().getLcurChangeInd().equals("Y") )
								{
									lvBlk = findBlock("SORLCUR_LITE");
									if ( (lvBlk == null) )
									{
										goBlock(toStr("SORLFOS"));
									}
									else {
										goBlock(toStr("SORLFOS_LITE"));
									}
									//   clear lfos block 
									clearBlock(TaskServices.NO_VALIDATE);
									// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
									Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(),null);
									
									//  go back to lcur block 
									if ( (lvBlk == null) )
									{
										goBlock(toStr("SORLCUR"));
									}
									else {
										goBlock(toStr("SORLCUR_LITE"));
									}
									getFormModel().getSCurricula().setLcurChangeInd(toStr("N"));
								}
								sorlcurElement.setSorlcurCurrRule(toNumber(getGlobal("CURR_RULE")));
								sorlcurElement.setSorlcurLevlCode(getGlobal("LEVEL_CODE"));
								getFormModel().getSCurricula().setChangeLevlCode(sorlcurElement.getSorlcurLevlCode());
								sorlcurElement.setSorlcurCampCode(getGlobal("CAMPUS"));
								getFormModel().getSCurricula().setChangeCampCode(getGlobal("CAMPUS"));
								sorlcurElement.setSorlcurCollCode(getGlobal("COLLEGE"));
								getFormModel().getSCurricula().setChangeCollCode(getGlobal("COLLEGE"));
								sorlcurElement.setSorlcurDegcCode(getGlobal("DEGREE_CODE"));
								getFormModel().getSCurricula().setChangeDegcCode(getGlobal("DEGREE_CODE"));
								sorlcurElement.setSorlcurProgram(getGlobal("PROGRAM"));
								getFormModel().getSCurricula().setChangeProgram(getGlobal("PROGRAM"));
								sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
								sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
								sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
								sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
								executeAction("lcur_check_program");
								setGlobal("LEVEL_CODE", toStr(""));
								setGlobal("COLLEGE", toStr(""));
								setGlobal("CAMPUS", toStr(""));
								setGlobal("DEGREE_CODE", toStr(""));
								setGlobal("PROGRAM", toStr(""));
								setGlobal("CURR_RULE", toStr(""));
								setGlobal("SEL_IND", toStr(""));
							}
						}
						else {
							executeAction("invalid_lcur_msg");
							executeAction("LIST_VALUES");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_SORCURR_CHANGE
		 --- CURR_CHANGE   Trigger
 
if (:lcur_sobctrl_curr_rule_ind = 'Y' and :lcur_temp_rule_ind = 'N') or
       :lcur_sobctrl_curr_rule_ind = 'N' then
            execute_trigger('invalid_lcur_msg');
            do_key('LIST_VALUES'); 
else
if :lcur_sobctrl_curr_rule_ind = 'Y' or :lcur_sobctrl_program_ind = 'Y'
 or :lcur_temp_rule_ind = 'Y' then
   declare 
      alert_button number;
   begin
      alert_button := show_alert('CURRICULUM_CHANGE');
      if alert_button = ALERT_BUTTON1 then
         :hold_program := :sorlcur_program;
         :hold_level := :sorlcur_levl_code;
         :hold_campus := :sorlcur_camp_code;
         :hold_college := :sorlcur_coll_code;
         :hold_degree := :sorlcur_degc_code;
         :lcur_change_ind := 'Y';
         :sorlcur_program := '';
         :sorlcur_levl_code := '';
         :sorlcur_camp_code := '';
         :sorlcur_degc_code := '';
         :sorlcur_coll_code := '';
         :sorlcur_levl_desc := '';
         :sorlcur_coll_desc := '';
         :sorlcur_degc_desc := '';
         :sorlcur_camp_desc := '';
         
         <multilinecomment> this will go execute the trigger 'program help' </multilinecomment>
         do_key('HELP');  
      end if;
   end;
end if;
end if;   
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_SORCURR_CHANGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_SORCURR_CHANGE")
		public void Soqolib_LcurSorcurrChange()
		{
			
				// - CURR_CHANGE   Trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - CURR_CHANGE   Trigger
				if ( (getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("N")) || getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("N") )
				{
					executeAction("invalid_lcur_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurricula().getLcurSobctrlProgramInd().equals("Y") || getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") )
					{
						{
							NNumber alertButton= NNumber.getNull();
							alertButton = toNumber(showAlert("CURRICULUM_CHANGE"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
								getFormModel().getSSobctrlBlock().setHoldProgram(sorlcurElement.getSorlcurProgram());
								getFormModel().getSSobctrlBlock().setHoldLevel(sorlcurElement.getSorlcurLevlCode());
								getFormModel().getSSobctrlBlock().setHoldCampus(sorlcurElement.getSorlcurCampCode());
								getFormModel().getSSobctrlBlock().setHoldCollege(sorlcurElement.getSorlcurCollCode());
								getFormModel().getSSobctrlBlock().setHoldDegree(sorlcurElement.getSorlcurDegcCode());
								getFormModel().getSCurricula().setLcurChangeInd(toStr("Y"));
								sorlcurElement.setSorlcurProgram(toStr(""));
								sorlcurElement.setSorlcurLevlCode(toStr(""));
								sorlcurElement.setSorlcurCampCode(toStr(""));
								sorlcurElement.setSorlcurDegcCode(toStr(""));
								sorlcurElement.setSorlcurCollCode(toStr(""));
								sorlcurElement.setSorlcurLevlDesc(toStr(""));
								sorlcurElement.setSorlcurCollDesc(toStr(""));
								sorlcurElement.setSorlcurDegcDesc(toStr(""));
								sorlcurElement.setSorlcurCampDesc(toStr(""));
								//  this will go execute the trigger 'program help' 
								executeAction("HELP");
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_PROGRAM_POST_LOV
		 --- CURR_PROGRAM_1_POST_LOV   Trigger
 if :global.sel_ind = 'Y' then
      :sorlcur_program := :global.program;

      :sorlcur_levl_code := :global.level_code;
     	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);

      if :global.campus is null then
          null;
      else
        :sorlcur_camp_code := :global.campus;
        :sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
        -- next_item;
      end if;

      if :global.college is null then
             null;
      else
        :sorlcur_coll_code := :global.college;
        :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
      end if;

      if :global.degree_code is null then
            null;
      else
        :sorlcur_degc_code := :global.degree_code;
        :sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
      end if;

    :global.level_code := '';
    :global.college := '';
    :global.degree_code := '';
    :global.program := '';
    :global.campus := '';
 
  
   end if;
  
    
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_PROGRAM_POST_LOV
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_PROGRAM_POST_LOV")
		public void Soqolib_LcurProgramPostLov()
		{
			
				// - CURR_PROGRAM_1_POST_LOV   Trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - CURR_PROGRAM_1_POST_LOV   Trigger
				if ( getGlobal("SEL_IND").equals("Y") )
				{
					sorlcurElement.setSorlcurProgram(getGlobal("PROGRAM"));
					sorlcurElement.setSorlcurLevlCode(getGlobal("LEVEL_CODE"));
					sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
					if ( getGlobal("CAMPUS").isNull() )
					{
					}
					else {
						sorlcurElement.setSorlcurCampCode(getGlobal("CAMPUS"));
						sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
					}
					if ( getGlobal("COLLEGE").isNull() )
					{
					}
					else {
						sorlcurElement.setSorlcurCollCode(getGlobal("COLLEGE"));
						sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
					}
					if ( getGlobal("DEGREE_CODE").isNull() )
					{
					}
					else {
						sorlcurElement.setSorlcurDegcCode(getGlobal("DEGREE_CODE"));
						sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
					}
					setGlobal("LEVEL_CODE", toStr(""));
					setGlobal("COLLEGE", toStr(""));
					setGlobal("DEGREE_CODE", toStr(""));
					setGlobal("PROGRAM", toStr(""));
					setGlobal("CAMPUS", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CHECK_BASE
		 --  CHECK_BASE  trigger
<multilinecomment>  check base trigger.  This is called from the major
   key help to list attached majors.  This finds the curriculum
   rule for the curriculum entered.  </multilinecomment>  
declare 
	dummy1  varchar2(1) := '';
	dummy2  varchar2(1) := '';
	err_number number := 0;
	init_term varchar2(6) := ''; 
	base_rule number := 0; 
	
begin	
	 base_rule := :sorlcur_curr_rule; 
   sokcurr.P_CheckBase(:module_ind,nvl( :sorlfos_term_code_ctlg, :sorlfos_term_code), 
                       :sorlcur_camp_code,
                       :sorlcur_coll_code,
                       :sorlcur_degc_code, 
                       :sorlcur_levl_code,
                       :sorlcur_program, base_rule,
                       dummy1,dummy2,:lfos_majr_attach_ind,
                       :lfos_concmajr_attach_ind, :lfos_concbase_attach_ind, 
                       :lfos_minr_attach_ind,
                       err_number);
    if base_rule is not null and :sorlcur_curr_rule is null then 
    	if :sovlcur_rowid is null then 
    	  :sorlcur_curr_rule := base_rule;
    	end if; 
      :temp_sorlcur_curr_rule := base_rule;
     
    end if;                  
    
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CHECK_BASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CHECK_BASE")
		public void Soqolib_LfosCheckBase()
		{
			
				//   CHECK_BASE  trigger
				//   check base trigger.  This is called from the major
				// key help to list attached majors.  This finds the curriculum
				// rule for the curriculum entered.  

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				{
					NString dummy1 = toStr("");
					NString dummy2 = toStr("");
					NNumber errNumber = toNumber(0);
					NString initTerm = toStr("");
					NNumber baseRule = toNumber(0);
					baseRule = sorlcurElement.getSorlcurCurrRule();
					Ref<NNumber> base_rule_ref = new Ref<NNumber>(baseRule);
					Ref<NString> prim_roll_ind_ref = new Ref<NString>(dummy1);
					Ref<NString> secd_roll_ind_ref = new Ref<NString>(dummy2);
					Ref<NString> majr_attach_ind_ref = new Ref<NString>(sorlcurElement.getLfosMajrAttachInd());
					Ref<NString> conc_majr_attach_ind_ref = new Ref<NString>(sorlcurElement.getLfosConcmajrAttachInd());
					Ref<NString> conc_base_attach_ind_ref = new Ref<NString>(sorlcurElement.getLfosConcbaseAttachInd());
					Ref<NString> minr_attach_ind_ref = new Ref<NString>(sorlcurElement.getLfosMinrAttachInd());
					Ref<NNumber> error_numb_ref = new Ref<NNumber>(errNumber);
					Sokcurr.pCheckbase(getFormModel().getSCurrProcBlock().getModuleInd(), isNull(sorlfosElement.getSorlfosTermCodeCtlg(), sorlfosElement.getSorlfosTermCode()), sorlcurElement.getSorlcurCampCode(), sorlcurElement.getSorlcurCollCode(), sorlcurElement.getSorlcurDegcCode(), sorlcurElement.getSorlcurLevlCode(), sorlcurElement.getSorlcurProgram(), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
					baseRule = base_rule_ref.val;
					dummy1 = prim_roll_ind_ref.val;
					dummy2 = secd_roll_ind_ref.val;
					sorlcurElement.setLfosMajrAttachInd(majr_attach_ind_ref.val);
					sorlcurElement.setLfosConcmajrAttachInd(conc_majr_attach_ind_ref.val);
					sorlcurElement.setLfosConcbaseAttachInd(conc_base_attach_ind_ref.val);
					sorlcurElement.setLfosMinrAttachInd(minr_attach_ind_ref.val);
					errNumber = error_numb_ref.val;
					if ( !baseRule.isNull() && sorlcurElement.getSorlcurCurrRule().isNull() )
					{
						if ( sorlcurElement.getSovlcurRowid().isNull() )
						{
							sorlcurElement.setSorlcurCurrRule(baseRule);
						}
						sorlcurElement.setTempSorlcurCurrRule(baseRule);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CHECK_DEPT_ATTACH
		 --- CHECK_DEPT_ATTACHED   Trigger
<multilinecomment>* check_dept_attached routine called from dept key help *</multilinecomment>
<multilinecomment>* this routine sees if the attached major has a dept     *</multilinecomment>


 
declare
  
  cnt_att number;
  cnt_all number;
 
  <multilinecomment>  major was entered and no attached dept exists </multilinecomment>
  cursor show_majr  is 
     select  sum(decode(x.sorcmjr_dept_code,null,1,0)), 
           sum(decode(x.sorcmjr_dept_code,null,0,1))  
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)))
     and x.sorcmjr_curr_rule = nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule)
     and :sorlcur_curr_rule is not null 
     and x.sorcmjr_majr_code = :sorlfos_majr_code
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);


  <multilinecomment>  major was not entered and no attached dept exists to any major </multilinecomment>
  cursor show_nomajr is 
     select sum(decode(x.sorcmjr_dept_code,null,1,0)), 
            sum(decode(x.sorcmjr_dept_code,null,0,1)) 
     from sorcmjr x
    where x.sorcmjr_term_code_eff =
      (select max(sorcmjr_term_code_eff)
        from sorcmjr
        where sorcmjr_curr_rule = x.sorcmjr_curr_rule
        and sorcmjr_term_code_eff <= nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)))
     and x.sorcmjr_curr_rule = nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule)
     and  :sorlfos_majr_code is null
    and :sorlcur_curr_rule is not null 
     and (decode(x.sorcmjr_stu_ind,'Y','S','N') = :module_ind or
          decode(x.sorcmjr_rec_ind,'Y','R','N') = :module_ind or
          decode(x.sorcmjr_adm_ind,'Y','A','N') = :module_ind or
          decode(x.sorcmjr_his_ind,'Y','H','N') = :module_ind or
          decode(x.sorcmjr_dau_ind,'Y','M','N') = :module_ind);
begin
    
   cnt_all := 0;
   cnt_att := 0;
    
 
   if :sorlfos_majr_code is not null then 
     open show_majr;
     fetch show_majr into cnt_all, cnt_att;
   
     if show_majr%notfound then 
       cnt_all := 1;
       cnt_att := 0;
     end if;
     close show_majr;
     if cnt_att >  0 then 
       --:sorlfos_majr_code := temp_major;
       :hold_dept_attach := '1';
     else 
       :hold_dept_attach := '2';
     end if;
 
   else
   if :sorlcur_curr_rule is null then 
   
     cnt_all := '1';  
   else
    
     open show_nomajr;
     fetch show_nomajr into cnt_all, cnt_att;
     if show_nomajr%notfound then 
     
        cnt_all := '1';       
       cnt_att := 0; 
     end if;
     close show_nomajr;
    end if;
     if cnt_att > 0 and cnt_all = 0 then 
       :sorlfos_majr_code := '';
       :hold_dept_attach := '1';
     elsif cnt_att = 0 and cnt_all > 0 then 
       :hold_dept_attach := '2';
     else
       :hold_dept_attach := '3';
     end if;
 
 
   end if;
  


end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CHECK_DEPT_ATTACH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CHECK_DEPT_ATTACH")
		public void Soqolib_LfosCheckDeptAttach()
		{
			
				// - CHECK_DEPT_ATTACHED   Trigger
				// * check_dept_attached routine called from dept key help *
				// * this routine sees if the attached major has a dept     *

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber cntAtt= NNumber.getNull();
					NNumber cntAll= NNumber.getNull();
					String sqlshowMajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) AND x.sorcmjr_curr_rule = nvl(:SORLCUR_CURR_RULE, :TEMP_SORLCUR_CURR_RULE) AND :SORLCUR_CURR_RULE IS NOT NULL AND x.sorcmjr_majr_code = :SORLFOS_MAJR_CODE AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showMajr = new DataCursor(sqlshowMajr);
					String sqlshowNomajr = "SELECT sum(decode(x.sorcmjr_dept_code, NULL, 1, 0)), sum(decode(x.sorcmjr_dept_code, NULL, 0, 1)) " +
	" FROM sorcmjr x " +
	" WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) AND x.sorcmjr_curr_rule = nvl(:SORLCUR_CURR_RULE, :TEMP_SORLCUR_CURR_RULE) AND :SORLFOS_MAJR_CODE IS NULL AND :SORLCUR_CURR_RULE IS NOT NULL AND (decode(x.sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(x.sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ";
					DataCursor showNomajr = new DataCursor(sqlshowNomajr);
					cntAll = toNumber(0);
					cntAtt = toNumber(0);
					if ( !sorlfosElement.getSorlfosMajrCode().isNull() )
					{
						//Setting query parameters
						showMajr.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
						showMajr.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						showMajr.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						showMajr.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
						showMajr.addParameter("TEMP_SORLCUR_CURR_RULE", sorlcurElement.getTempSorlcurCurrRule());
						showMajr.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
						showMajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable showMajr.
						showMajr.open();
						ResultSet showMajrResults = showMajr.fetchInto();
						if ( showMajrResults != null ) {
							cntAll = showMajrResults.getNumber(0);
							cntAtt = showMajrResults.getNumber(1);
						}
						if ( showMajr.notFound() )
						{
							cntAll = toNumber(1);
							cntAtt = toNumber(0);
						}
						showMajr.close();
						if ( cntAtt.greater(0) )
						{
							// :sorlfos_majr_code := temp_major;
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
					}
					else {
						if ( sorlcurElement.getSorlcurCurrRule().isNull() )
						{
							cntAll = toNumber("1");
						}
						else {
							//Setting query parameters
							showNomajr.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
							showNomajr.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
							showNomajr.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
							showNomajr.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
							showNomajr.addParameter("TEMP_SORLCUR_CURR_RULE", sorlcurElement.getTempSorlcurCurrRule());
							showNomajr.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
							showNomajr.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable showNomajr.
							showNomajr.open();
							ResultSet showNomajrResults = showNomajr.fetchInto();
							if ( showNomajrResults != null ) {
								cntAll = showNomajrResults.getNumber(0);
								cntAtt = showNomajrResults.getNumber(1);
							}
							if ( showNomajr.notFound() )
							{
								cntAll = toNumber("1");
								cntAtt = toNumber(0);
							}
							showNomajr.close();
						}
						if ( cntAtt.greater(0) && cntAll.equals(0) )
						{
							sorlfosElement.setSorlfosMajrCode(toStr(""));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("1"));
						}
						else if ( cntAtt.equals(0) && cntAll.greater(0) ) {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("2"));
						}
						else {
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr("3"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CHECK_PROGRAM_MAJOR
		 --- CURR_PROGRAM_MAJOR   Trigger
<multilinecomment>  executed in post change of major code to get rule and department code </multilinecomment>

:lcur_ctlg_term := nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code);
declare 
   temp_majr varchar2(30);
   temp_rule number;
   temp_rule_in number;
   temp_cmjr_rule number;
   temp_dept varchar2(30) := Null;
   temp_program varchar2(30) := Null;
   temp_college varchar2(30) := Null;
   temp_level varchar2(30) := Null;
   temp_campus varchar2(30) := Null;
   temp_degree varchar2(30) := Null;
  
  
begin
   --temp_majr := name_in(:curr_majr_field);
   temp_rule_in := :sorlcur_curr_rule;
   temp_majr := :sorlfos_majr_code;

  
  select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code,
          x.sobcurr_levl_code, x.sobcurr_camp_code, x.sobcurr_degc_code
          , x.sobcurr_coll_code 
   into temp_program, temp_rule, temp_cmjr_rule, temp_dept,
      temp_level, temp_campus, temp_degree, temp_college 
   from sobcurr x, sorcmjr y
   where 
   ( ( x.sobcurr_curr_rule = temp_rule_in) or 
        (   temp_rule_in is null 
        and x.sobcurr_levl_code = :sorlcur_levl_code
        and ((:sorlcur_coll_code is null)
           or (x.sobcurr_coll_code = :sorlcur_coll_code)) 
        and ((:sorlcur_degc_code is null)
           or (x.sobcurr_degc_code = :sorlcur_degc_code)) 
        and ((nvl(x.sobcurr_camp_code,'%') = nvl(:sorlcur_camp_code,'%') )
           or ( x.sobcurr_camp_code is null and :sorlcur_camp_code is not null)) ))
   and x.sobcurr_term_code_init <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code) 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_majr_code = temp_majr
   and y.sorcmjr_term_code_eff  = 
      ( select max(t.sorcmjr_term_code_eff) 
        from sorcmjr t 
         where t.sorcmjr_curr_rule = y.sorcmjr_curr_rule 
         and t.sorcmjr_majr_code = y.sorcmjr_majr_code
         and t.sorcmjr_term_code_eff <= nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code) )
   and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
        or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
        or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
        or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
        or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
        or :module_ind = 'X') 
    and exists         
              (select 'x'
              from sormcrl y
              where sormcrl_curr_rule = x.sobcurr_curr_rule
               and sormcrl_term_code_eff  = 
                      (select max(sormcrl_term_code_eff)
                       from sormcrl
                       where sormcrl_curr_rule = y.sormcrl_curr_rule
                       and sormcrl_term_code_eff <=  nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code) )
               and  (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind
                     or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind
                     or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind
                     or decode(sormcrl_his_ind,'Y','H','N') = :module_ind
                     or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind));

 
   if :sorlcur_curr_rule is null and :sovlcur_rowid is null  then 
      :sorlcur_curr_rule := temp_rule;
   end if;
 
  if :sorlcur_program <> temp_program 
   and ( :sorlcur_program is null 
  	OR :sorlcur_program = '************' )
  	AND :sovlcur_rowid is null
    then
     :sorlcur_program := temp_program;
   end if;
   
   :sorlfos_lfos_rule := temp_cmjr_rule; 
   if :sorlfos_term_code_ctlg is null then 
   	  :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
   end if; 
  
   if temp_dept is not null then
   	 :sorlfos_dept_code := temp_dept; 
   	 :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
   else 
   	 if temp_dept is null and :sorlfos_dept_code is not null then 
   	   	 :sorlfos_dept_code := null; 
      	 :sorlfos_dept_desc := null;
   	 end if; 
   end if;
   
   if temp_college is not null or (:sorlcur_coll_code is null 
   	or :sorlcur_coll_code <> temp_college) then 
   	 :sorlcur_coll_code := temp_college;
 	   :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
   end if;
   if temp_level is not null and ( :sorlcur_levl_code is null 
   	or :sorlcur_levl_code <> temp_level) then 
   	 :sorlcur_levl_code := temp_level;
  	 	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
   end if;
   if temp_campus is not null and ( :sorlcur_camp_code is null 
   	or :sorlcur_camp_code <> temp_campus) then 
   	 :sorlcur_camp_code := temp_campus;
  	 	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
   end if;
   if temp_degree is not null and ( :sorlcur_degc_code is null 
   	   or :sorlcur_degc_code <> temp_degree) then 
   	 :sorlcur_degc_code := temp_degree;
  	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
   end if;
   
  
exception
   when no_data_found then
      null;
 -- message('No Program Found');
null;
   when too_many_rows then
--  message('To Many Programs Found');
       null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CHECK_PROGRAM_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CHECK_PROGRAM_MAJOR")
		public void Soqolib_LfosCheckProgramMajor()
		{
			
				// - CURR_PROGRAM_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				// - CURR_PROGRAM_MAJOR   Trigger
				//   executed in post change of major code to get rule and department code 
				getFormModel().getSCurricula().setLcurCtlgTerm(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
				{
					NString tempMajr= NString.getNull();
					NNumber tempRule= NNumber.getNull();
					NNumber tempRuleIn= NNumber.getNull();
					NNumber tempCmjrRule= NNumber.getNull();
					NString tempDept = NString.getNull();
					NString tempProgram = NString.getNull();
					NString tempCollege = NString.getNull();
					NString tempLevel = NString.getNull();
					NString tempCampus = NString.getNull();
					NString tempDegree = NString.getNull();
					try
					{
						// temp_majr := name_in(:curr_majr_field);
						tempRuleIn = sorlcurElement.getSorlcurCurrRule();
						tempMajr = sorlfosElement.getSorlfosMajrCode();
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_dept_code, x.sobcurr_levl_code, x.sobcurr_camp_code, x.sobcurr_degc_code, x.sobcurr_coll_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((x.sobcurr_curr_rule = :P_TEMP_RULE_IN) OR (:P_TEMP_RULE_IN IS NULL AND x.sobcurr_levl_code = :SORLCUR_LEVL_CODE AND ((:SORLCUR_COLL_CODE IS NULL) OR (x.sobcurr_coll_code = :SORLCUR_COLL_CODE)) AND ((:SORLCUR_DEGC_CODE IS NULL) OR (x.sobcurr_degc_code = :SORLCUR_DEGC_CODE)) AND ((nvl(x.sobcurr_camp_code, '%') = nvl(:SORLCUR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :SORLCUR_CAMP_CODE IS NOT NULL)))) AND x.sobcurr_term_code_init <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_majr_code = :P_TEMP_MAJR AND y.sorcmjr_term_code_eff = (SELECT max(t.sorcmjr_term_code_eff) " +
		" FROM sorcmjr t " +
		" WHERE t.sorcmjr_curr_rule = y.sorcmjr_curr_rule AND t.sorcmjr_majr_code = y.sorcmjr_majr_code AND t.sorcmjr_term_code_eff <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) ) AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl y " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) " +
			" FROM sormcrl " +
			" WHERE sormcrl_curr_rule = y.sormcrl_curr_rule AND sormcrl_term_code_eff <= nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE) ) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND) ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE_IN", tempRuleIn);
						command1.addParameter("SORLCUR_LEVL_CODE", sorlcurElement.getSorlcurLevlCode());
						command1.addParameter("SORLCUR_COLL_CODE", sorlcurElement.getSorlcurCollCode());
						command1.addParameter("SORLCUR_DEGC_CODE", sorlcurElement.getSorlcurDegcCode());
						command1.addParameter("SORLCUR_CAMP_CODE", sorlcurElement.getSorlcurCampCode());
						command1.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						command1.addParameter("P_TEMP_MAJR", tempMajr);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempDept = results1.getStr(3);
							tempLevel = results1.getStr(4);
							tempCampus = results1.getStr(5);
							tempDegree = results1.getStr(6);
							tempCollege = results1.getStr(7);
						}
						results1.close();
						if ( sorlcurElement.getSorlcurCurrRule().isNull() && sorlcurElement.getSovlcurRowid().isNull() )
						{
							sorlcurElement.setSorlcurCurrRule(tempRule);
						}
						if ( sorlcurElement.getSorlcurProgram().notEquals(tempProgram) && (sorlcurElement.getSorlcurProgram().isNull() || sorlcurElement.getSorlcurProgram().equals("************")) && sorlcurElement.getSovlcurRowid().isNull() )
						{
							sorlcurElement.setSorlcurProgram(tempProgram);
						}
						sorlfosElement.setSorlfosLfosRule(tempCmjrRule);
						if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
						{
							sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
							sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
						}
						if ( !tempDept.isNull() )
						{
							sorlfosElement.setSorlfosDeptCode(tempDept);
							sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
						}
						else {
							if ( tempDept.isNull() && !sorlfosElement.getSorlfosDeptCode().isNull() )
							{
								sorlfosElement.setSorlfosDeptCode(toStr(null));
								sorlfosElement.setSorlfosDeptDesc(toStr(null));
							}
						}
						if ( !tempCollege.isNull() || (sorlcurElement.getSorlcurCollCode().isNull() || sorlcurElement.getSorlcurCollCode().notEquals(tempCollege)) )
						{
							sorlcurElement.setSorlcurCollCode(tempCollege);
							sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
						}
						if ( !tempLevel.isNull() && (sorlcurElement.getSorlcurLevlCode().isNull() || sorlcurElement.getSorlcurLevlCode().notEquals(tempLevel)) )
						{
							sorlcurElement.setSorlcurLevlCode(tempLevel);
							sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
						}
						if ( !tempCampus.isNull() && (sorlcurElement.getSorlcurCampCode().isNull() || sorlcurElement.getSorlcurCampCode().notEquals(tempCampus)) )
						{
							sorlcurElement.setSorlcurCampCode(tempCampus);
							sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
						}
						if ( !tempDegree.isNull() && (sorlcurElement.getSorlcurDegcCode().isNull() || sorlcurElement.getSorlcurDegcCode().notEquals(tempDegree)) )
						{
							sorlcurElement.setSorlcurDegcCode(tempDegree);
							sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
						}
					}
					catch(NoDataFoundException e)
					{
						//  message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						//   message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CURRICULUM_COMMPLAN_CHECK
		 DECLARE
	lv_block BLOCK;
	lv_sorlcur_row  sb_curriculum.curriculum_rec;
	lv_rowid VARCHAR2(18);
	lv_type  sobcpln.sobcpln_type_ind%TYPE;
BEGIN
	lv_block := FIND_BLOCK('SOBCPLN');
	-- if comm plan exists on the form, process the comm plan if the 
	-- record saved is the primary curriculum
   IF NOT ID_NULL(lv_block) THEN 
     	  --- check for comm plan changes if any part of the curricula has changed
   	 EXECUTE_TRIGGER('CALL_COMM_PLAN'); 
  	 g$_check_failure;
     :form_header.callfld := :system.cursor_item; 
   END IF;
   

END; 





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CURRICULUM_COMMPLAN_CHECK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CURRICULUM_COMMPLAN_CHECK")
		public void Soqolib_CurriculumCommplanCheck()
		{
			
				{
					BlockDescriptor lvBlock= null;
					SbCurriculum.CurriculumRecRow lvSorlcurRow= null;
					NString lvRowid= NString.getNull();
					NString lvType= NString.getNull();
					lvBlock = findBlock("SOBCPLN");
					//  if comm plan exists on the form, process the comm plan if the 
					//  record saved is the primary curriculum
					if ( !(lvBlock == null) )
					{
						// - check for comm plan changes if any part of the curricula has changed
						executeAction("CALL_COMM_PLAN");
						getContainer().getGoqrpls().gCheckFailure();
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//						this.getModel()setValue(FORM_HEADER,CALLFLD,getCursorItem());
						getFormModel().getBusinessObject("FORM_HEADER").setValue("BLCK_DESC",getCursorItem());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CHECK_PROGRAM_DEPT
		 --- CURR_PROGRAM_DEPT   Trigger
<multilinecomment>  executed in post change of dept code to get rule and major code </multilinecomment>

declare 
   temp_majr varchar2(30) := null;
   temp_rule number := null;
   temp_cmjr_rule number := null;
   temp_dept varchar2(30) := null;
   temp_program varchar2(30) := null;
begin
   temp_dept := :sorlfos_dept_code;
   temp_rule := :sorlcur_curr_rule;
  
   select x.sobcurr_program,  
          y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code
   into temp_program, temp_rule, temp_cmjr_rule, temp_majr
   from sobcurr x, sorcmjr y
   where 
   ( (temp_rule = x.sobcurr_curr_rule) or 
   (  (temp_rule is null) 
   and (nvl(x.sobcurr_camp_code,'%') = nvl(:sorlcur_camp_code,'%')) 
           or (x.sobcurr_camp_code is null and :sorlcur_camp_code is not null)) 
   and ((nvl(x.sobcurr_levl_code,'%') = nvl(:sorlcur_levl_code,'%')) 
        or (x.sobcurr_levl_code is null and :sorlcur_levl_code is not null)) 
   and ((nvl(x.sobcurr_degc_code,'%') = nvl(:sorlcur_degc_code,'%')) 
        or (x.sobcurr_degc_code is null and :sorlcur_degc_code is not null)) 
   and ((nvl(x.sobcurr_coll_code,'%') = nvl(:sorlcur_coll_code,'%')) 
       or (x.sobcurr_coll_code is null and :sorlcur_coll_code is not null)) )
   and x.sobcurr_term_code_init <= nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)) 
   and x.sobcurr_lock_ind = 'Y'
   and x.sobcurr_curr_rule = y.sorcmjr_curr_rule
   and y.sorcmjr_dept_code = temp_dept
   and y.sorcmjr_term_code_eff = 
       (select max(sorcmjr_term_code_eff) 
        from sorcmjr 
        where sorcmjr_curr_rule = x.sobcurr_curr_rule 
        and y.sorcmjr_dept_code = sorcmjr_dept_code
        and sorcmjr_term_code_eff <= nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))
        and (decode(sorcmjr_rec_ind,'Y','R','N') = :module_ind 
             or decode(sorcmjr_adm_ind,'Y','A','N') = :module_ind 
             or decode(sorcmjr_stu_ind,'Y','S','N') = :module_ind 
             or decode(sorcmjr_his_ind,'Y','H','N') = :module_ind 
             or decode(sorcmjr_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'))        
   and exists 
       (select 'x' from sormcrl 
        where sormcrl_curr_rule = x.sobcurr_curr_rule 
        and sormcrl_term_code_eff <= nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))
        and (decode(sormcrl_rec_ind,'Y','R','N') = :module_ind 
             or decode(sormcrl_adm_ind,'Y','A','N') = :module_ind 
             or decode(sormcrl_stu_ind,'Y','S','N') = :module_ind 
             or decode(sormcrl_his_ind,'Y','H','N') = :module_ind 
             or decode(sormcrl_dau_ind,'Y','M','N') = :module_ind
             or :module_ind = 'X'));

   if :sorlcur_curr_rule is null and :sovlcur_rowid is null then 
      :sorlcur_curr_rule := temp_rule;
      :sorlcur_program := temp_program;
   end if;
   :sorlfos_lfos_rule := temp_cmjr_rule;
   :sorlfos_majr_code := temp_majr;
   if :sorlfos_term_code_ctlg is null then 
   	  :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,
   	    nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)));
   end if;
   :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);



exception
   when no_data_found then
      null;
----  message('No Program Found');
null;
   when too_many_rows then
----  message('To Many Programs Found');
       null;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CHECK_PROGRAM_DEPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CHECK_PROGRAM_DEPT")
		public void Soqolib_LfosCheckProgramDept()
		{
			
				// - CURR_PROGRAM_DEPT   Trigger
				//   executed in post change of dept code to get rule and major code 

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NString tempMajr = NString.getNull();
					NNumber tempRule = NNumber.getNull();
					NNumber tempCmjrRule = NNumber.getNull();
					NString tempDept = NString.getNull();
					NString tempProgram = NString.getNull();
					try
					{
						tempDept = sorlfosElement.getSorlfosDeptCode();
						tempRule = sorlcurElement.getSorlcurCurrRule();
						String sql1 = "SELECT x.sobcurr_program, y.sorcmjr_curr_rule, y.sorcmjr_cmjr_rule, y.sorcmjr_majr_code " +
	" FROM sobcurr x, sorcmjr y " +
	" WHERE ((:P_TEMP_RULE = x.sobcurr_curr_rule) OR ((:P_TEMP_RULE IS NULL) AND (nvl(x.sobcurr_camp_code, '%') = nvl(:SORLCUR_CAMP_CODE, '%')) OR (x.sobcurr_camp_code IS NULL AND :SORLCUR_CAMP_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_levl_code, '%') = nvl(:SORLCUR_LEVL_CODE, '%')) OR (x.sobcurr_levl_code IS NULL AND :SORLCUR_LEVL_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_degc_code, '%') = nvl(:SORLCUR_DEGC_CODE, '%')) OR (x.sobcurr_degc_code IS NULL AND :SORLCUR_DEGC_CODE IS NOT NULL)) AND ((nvl(x.sobcurr_coll_code, '%') = nvl(:SORLCUR_COLL_CODE, '%')) OR (x.sobcurr_coll_code IS NULL AND :SORLCUR_COLL_CODE IS NOT NULL))) AND x.sobcurr_term_code_init <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) AND x.sobcurr_lock_ind = 'Y' AND x.sobcurr_curr_rule = y.sorcmjr_curr_rule AND y.sorcmjr_dept_code = :P_TEMP_DEPT AND y.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) " +
		" FROM sorcmjr " +
		" WHERE sorcmjr_curr_rule = x.sobcurr_curr_rule AND y.sorcmjr_dept_code = sorcmjr_dept_code AND sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) AND (decode(sorcmjr_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sorcmjr_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sorcmjr_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sorcmjr_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sorcmjr_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) AND  EXISTS(SELECT 'x' " +
		" FROM sormcrl " +
		" WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) AND (decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :MODULE_IND OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :MODULE_IND OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :MODULE_IND OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :MODULE_IND OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :MODULE_IND OR :MODULE_IND = 'X') ) ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_RULE", tempRule);
						command1.addParameter("SORLCUR_CAMP_CODE", sorlcurElement.getSorlcurCampCode());
						command1.addParameter("SORLCUR_LEVL_CODE", sorlcurElement.getSorlcurLevlCode());
						command1.addParameter("SORLCUR_DEGC_CODE", sorlcurElement.getSorlcurDegcCode());
						command1.addParameter("SORLCUR_COLL_CODE", sorlcurElement.getSorlcurCollCode());
						command1.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						command1.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						command1.addParameter("P_TEMP_DEPT", tempDept);
						command1.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempProgram = results1.getStr(0);
							tempRule = results1.getNumber(1);
							tempCmjrRule = results1.getNumber(2);
							tempMajr = results1.getStr(3);
						}
						results1.close();
						if ( sorlcurElement.getSorlcurCurrRule().isNull() && sorlcurElement.getSovlcurRowid().isNull() )
						{
							sorlcurElement.setSorlcurCurrRule(tempRule);
							sorlcurElement.setSorlcurProgram(tempProgram);
						}
						sorlfosElement.setSorlfosLfosRule(tempCmjrRule);
						sorlfosElement.setSorlfosMajrCode(tempMajr);
						if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
						{
							sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()))));
						}
						sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
					}
					catch(NoDataFoundException e)
					{
						// --  message('No Program Found');
					}
					catch(TooManyRowsException e)
					{
						// --  message('To Many Programs Found');
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_DEPT_HELP
		 --- CURR_DEPT_HELP   Trigger
 
set_lov_property('STVDEPT_LOV',TITLE,'All Department Codes');
if :lcur_temp_rule_ind = 'N' then
      execute_trigger('invalid_lcur_msg');
      do_key('LIST_VALUES');
else
  if :lcur_sobctrl_curr_rule_ind = 'Y'  then
    if :sorlcur_curr_rule is null then
       message( G$_NLS.Get('SOQOLIB-0057', 'FORM','No Base Curriculum Rule has been Established') );
    else
       execute_trigger('lfos_check_base');
       :global.major := '';
       :hold_dept_attach := null;
       if :lfos_majr_attach_ind = 'Y' and :sorlfos_majr_code is not null 
        then
          <multilinecomment>  show stvdept lov if the dept for the major is blank   </multilinecomment>
          <multilinecomment>  no dept with the attached major acts like a wild card </multilinecomment>
          <multilinecomment>  any dept is valid with attached major                 </multilinecomment>
           execute_trigger('lfos_check_dept_attached');
       end if; 
       if :lfos_majr_attach_ind = 'Y' then 
         if :hold_dept_attach = '2' then
           set_item_property('sorlfos_dept_code',LOV_NAME,'STVDEPT_LOV');
         else 
         	 :s$_curricula.hold_curr_rule := nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule);
           :s$_curricula.hold_term_ctlg := nvl(:sorlfos_term_code_ctlg, 
                nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
           set_item_property('sorlfos_dept_code',LOV_NAME,'STVDEPT_CURRDEPT_LOV');
         end if;
       else
           set_item_property('sorlfos_dept_code',LOV_NAME,'STVDEPT_LOV');
       end if;
       g$_display_lov('','');
       if :global.major is null then
          null;
       else
       	  :sorlfos_majr_code := :global.major;
       end if;
    end if;
  else
    execute_trigger('invalid_lcur_msg');
    do_key('LIST_VALUES');
 end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_DEPT_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_DEPT_HELP")
		public void Soqolib_LfosCurrDeptHelp()
		{
			
				// - CURR_DEPT_HELP   Trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				// - CURR_DEPT_HELP   Trigger
				setLovTitle("STVDEPT_LOV", "All Department Codes");
				if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
				{
					executeAction("invalid_lcur_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						if ( sorlcurElement.getSorlcurCurrRule().isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0057"), toStr("FORM"), toStr("No Base Curriculum Rule has been Established")));
						}
						else {
							executeAction("lfos_check_base");
							setGlobal("MAJOR", toStr(""));
							getFormModel().getSCurrProcBlock().setHoldDeptAttach(toStr(null));
							if ( sorlcurElement.getLfosMajrAttachInd().equals("Y") && !sorlfosElement.getSorlfosMajrCode().isNull() )
							{
								//   show stvdept lov if the dept for the major is blank   
								//   no dept with the attached major acts like a wild card 
								//   any dept is valid with attached major                 
								executeAction("lfos_check_dept_attached");
							}
							if ( sorlcurElement.getLfosMajrAttachInd().equals("Y") )
							{
								if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") )
								{
									setItemLovName("sorlfos_dept_code", "STVDEPT_LOV");
								}
								else {
									getFormModel().getSCurricula().setHoldCurrRule(isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()));
									getFormModel().getSCurricula().setHoldTermCtlg(isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
									setItemLovName("sorlfos_dept_code", "STVDEPT_CURRDEPT_LOV");
								}
							}
							else {
								setItemLovName("sorlfos_dept_code", "STVDEPT_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("MAJOR").isNull() )
							{
							}
							else {
								sorlfosElement.setSorlfosMajrCode(getGlobal("MAJOR"));
							}
						}
					}
					else {
						executeAction("invalid_lcur_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_DEPT_OPTIONS
		 --- CURR_DEPT_OPTIONS   Trigger
:lfos_option_key1 := 'LIST_VALUES';
:lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0058', 'FORM','All Department Codes') ;
:lfos_option_key2 := '';
:lfos_option_title2 := '';
  if :lcur_sobctrl_curr_rule_ind = 'Y' or :lcur_temp_rule_ind = 'Y' then
          
       execute_trigger('lfos_check_base');
       g$_check_failure; 
      
       if :lfos_majr_attach_ind = 'Y'    then
          <multilinecomment>  show stvdept lov if the dept for the major is blank   </multilinecomment>
          <multilinecomment>  no dept with the attached major acts like a wild card </multilinecomment>
          <multilinecomment>  any dept is valid with attached major                 </multilinecomment>
           execute_trigger('lfos_check_dept_attach');
  
         if :hold_dept_attach = '1' then
           :lfos_option_key1 := 'HELP';
           :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0059', 'FORM','Attached Majors/Departments') ;
         elsif :hold_dept_attach = '2' then
           :lfos_option_key1 := 'LIST_VALUES';
           :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0060', 'FORM','All Department Codes') ;
         elsif :hold_dept_attach = '3' then
           :lfos_option_key1 := 'LIST_VALUES';
           :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0061', 'FORM','All Department Codes') ;
           :lfos_option_key2 := 'HELP';
           :lfos_option_title2 :=  G$_NLS.Get('SOQOLIB-0062', 'FORM','Attached Majors/Departments') ;
         else
           :lfos_option_key1 := 'LIST_VALUES';
           :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0063', 'FORM','All Department Codes') ;
         end if;
       end if;
  end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_DEPT_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_DEPT_OPTIONS")
		public void Soqolib_LfosCurrDeptOptions()
		{
			
				// - CURR_DEPT_OPTIONS   Trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - CURR_DEPT_OPTIONS   Trigger
				sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
				sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0058"), toStr("FORM"), toStr("All Department Codes")));
				sorlfosElement.setLfosOptionKey2(toStr(""));
				sorlfosElement.setLfosOptionTitle2(toStr(""));
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") || getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") )
				{
					executeAction("lfos_check_base");
					getContainer().getGoqrpls().gCheckFailure();
					if ( sorlcurElement.getLfosMajrAttachInd().equals("Y") )
					{
						//   show stvdept lov if the dept for the major is blank   
						//   no dept with the attached major acts like a wild card 
						//   any dept is valid with attached major                 
						executeAction("lfos_check_dept_attach");
						if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("1") )
						{
							sorlfosElement.setLfosOptionKey1(toStr("HELP"));
							sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0059"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("2") ) {
							sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
							sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0060"), toStr("FORM"), toStr("All Department Codes")));
						}
						else if ( getFormModel().getSCurrProcBlock().getHoldDeptAttach().equals("3") ) {
							sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
							sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0061"), toStr("FORM"), toStr("All Department Codes")));
							sorlfosElement.setLfosOptionKey2(toStr("HELP"));
							sorlfosElement.setLfosOptionTitle2(GNls.Fget(toStr("SOQOLIB-0062"), toStr("FORM"), toStr("Attached Majors/Departments")));
						}
						else {
							sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
							sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0063"), toStr("FORM"), toStr("All Department Codes")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_MINOR_HELP
		 --- CURR_MIONOR_HELP   Trigger
<multilinecomment>  list attached minors for primary curriculum </multilinecomment>
--
if :lcur_temp_rule_ind = 'N' then
      execute_trigger('invalid_lcur_msg');
      do_key('LIST_VALUES');
else
     if :lcur_sobctrl_curr_rule_ind = 'Y' then

        execute_trigger('lfos_check_base');
        g$_check_failure;
  
        if nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule) is null then
           message( G$_NLS.Get('SOQOLIB-0064', 'FORM','No Primary Base Curriculum Rule Established') );
        else
          :global.cmnr_rule := '';
          :s$_curricula.hold_curr_rule := nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule);
          :s$_curricula.hold_term_ctlg := nvl(:sorlfos_term_code_ctlg, 
               nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
          if :lfos_minr_attach_ind = 'Y' then
             set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_CURRMINR_LOV');
          else
             set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_MINR_LOV');
          end if;
          g$_display_lov('','');
          
          if :global.cmnr_rule is null then
             null;
          else
             if :global.cmnr_rule = :sorlfos_lfos_rule then
                 null;
             else
                :sorlfos_lfos_rule := :global.cmnr_rule;
             end if;
          end if;
        end if;
        :global.cmnr_rule := null;
        :global.sel_ind := null; 
     else
      execute_trigger('invalid_lcur_msg');
      do_key('LIST_VALUES');
    end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_MINOR_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_MINOR_HELP")
		public void Soqolib_LfosCurrMinorHelp()
		{
			
				// - CURR_MIONOR_HELP   Trigger
				//   list attached minors for primary curriculum 
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				// - CURR_MIONOR_HELP   Trigger
				//   list attached minors for primary curriculum 
				// 
				if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
				{
					executeAction("invalid_lcur_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						executeAction("lfos_check_base");
						getContainer().getGoqrpls().gCheckFailure();
						if ( isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()).isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0064"), toStr("FORM"), toStr("No Primary Base Curriculum Rule Established")));
						}
						else {
							setGlobal("CMNR_RULE", toStr(""));
							getFormModel().getSCurricula().setHoldCurrRule(isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()));
							getFormModel().getSCurricula().setHoldTermCtlg(isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
							if ( sorlcurElement.getLfosMinrAttachInd().equals("Y") )
							{
								setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_CURRMINR_LOV");
							}
							else {
								setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_MINR_LOV");
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( getGlobal("CMNR_RULE").isNull() )
							{
							}
							else {
								if ( getGlobal("CMNR_RULE").equals(sorlfosElement.getSorlfosLfosRule()) )
								{
								}
								else {
									sorlfosElement.setSorlfosLfosRule(toNumber(getGlobal("CMNR_RULE")));
								}
							}
						}
						setGlobal("CMNR_RULE", toStr(null));
						setGlobal("SEL_IND", toStr(null));
					}
					else {
						executeAction("invalid_lcur_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_MINOR_OPTIONS
		 --- CURR_MIONOR_OPTIONS   Trigger
<multilinecomment>  list attached minors for primary curriculum </multilinecomment>
--
:lfos_option_key1 := 'LIST_VALUES';
:lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0065', 'FORM','All Minor Codes') ;

 if :lcur_sobctrl_curr_rule_ind = 'Y' then
  
    execute_trigger('lfos_check_base');
    g$_check_failure;
 
    if nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule) is not null then
     if :lfos_minr_attach_ind = 'Y' then
        :lfos_option_key2 := 'HELP';
        :lfos_option_title2 :=  G$_NLS.Get('SOQOLIB-0066', 'FORM','Attached Minors') ;
     end if;
   end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_MINOR_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_MINOR_OPTIONS")
		public void Soqolib_LfosCurrMinorOptions()
		{
			
				// - CURR_MIONOR_OPTIONS   Trigger
				//   list attached minors for primary curriculum 
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - CURR_MIONOR_OPTIONS   Trigger
				//   list attached minors for primary curriculum 
				// 
				sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
				sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0065"), toStr("FORM"), toStr("All Minor Codes")));
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					executeAction("lfos_check_base");
					getContainer().getGoqrpls().gCheckFailure();
					if ( !isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()).isNull() )
					{
						if ( sorlcurElement.getLfosMinrAttachInd().equals("Y") )
						{
							sorlfosElement.setLfosOptionKey2(toStr("HELP"));
							sorlfosElement.setLfosOptionTitle2(GNls.Fget(toStr("SOQOLIB-0066"), toStr("FORM"), toStr("Attached Minors")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_MAJOR_HELP
		 --  CURR_MAJOR_HELP  trigger
 
if :lcur_temp_rule_ind = 'N' then
   execute_trigger('invalid_lcur_msg');
   do_key('LIST_VALUES');
else
   if :lcur_sobctrl_curr_rule_ind = 'Y' then
      if :sorlcur_program = '************' then
         null; 
      else
      
         execute_trigger('lfos_check_base');
       
      end if;
      
      if nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule) is null 
       and :sorlcur_program <> '************' then
          message( G$_NLS.Get('SOQOLIB-0067', 'FORM','No Primary Base Curriculum Rule Established') );
      else
         :global.dept := '';
         :s$_curricula.hold_curr_rule := nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule);
         :s$_curricula.hold_term_ctlg := nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
         :s$_curricula.hold_dept := :sorlfos_dept_code;
         if :sorlcur_program =  '************'  then
            :lcur_camp_code := :sorlcur_camp_code;
            :lcur_coll_code := :sorlcur_coll_code;
            :lcur_degc_code := :sorlcur_degc_code;
            :lcur_levl_code := :sorlcur_levl_code;
            :s$_curricula.curr_levl_code := :sorlcur_levl_code;
						:s$_curricula.curr_camp_code := :sorlcur_camp_code;
						:s$_curricula.curr_degc_code := :sorlcur_degc_code;
						:s$_curricula.curr_coll_code := :sorlcur_coll_code;
						:s$_curricula.curr_program := :sorlcur_program;
						:s$_curricula.curr_ctlg_term := :sorlcur_term_code_ctlg;
            set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_PROGMAJR_LOV');   
         else   
            if :lfos_majr_attach_ind = 'Y' then
              set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_CURRMAJR_LOV');
            else
              set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_MAJR_LOV');
            end if;
         end if;
         g$_display_lov('','');
         if :global.value is not null then 
         	 :sorlfos_majr_code := :global.value;
    	  	   :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
         end if;
         
         if :global.sel_ind = 'Y' and
            :global.curr_rule is not null and
            :sorlcur_curr_rule is null then 
             if :sovlcur_rowid is null then 
             :sorlcur_curr_rule := :global.curr_rule;
             else
             :temp_sorlcur_curr_rule := :global.curr_rule;
             end if; 
            
             execute_trigger('lfos_check_program_major');
         end if;

         if :global.dept is null then
             null;
         else
            :sorlfos_dept_code := :global.dept;
      	   :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);

         end if;   
         :global.sel_ind := null;
         :global.dept := null;
         :global.value := null;
         
    end if;
 else
    execute_trigger('invalid_lcur_msg');
    do_key('LIST_VALUES');
 end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_MAJOR_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_MAJOR_HELP")
		public void Soqolib_LfosCurrMajorHelp()
		{
			
				//   CURR_MAJOR_HELP  trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				//   CURR_MAJOR_HELP  trigger
				if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
				{
					executeAction("invalid_lcur_msg");
					executeAction("LIST_VALUES");
				}
				else {
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						if ( sorlcurElement.getSorlcurProgram().equals("************") )
						{
						}
						else {
							executeAction("lfos_check_base");
						}
						if ( isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()).isNull() && sorlcurElement.getSorlcurProgram().notEquals("************") )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0067"), toStr("FORM"), toStr("No Primary Base Curriculum Rule Established")));
						}
						else {
							setGlobal("DEPT", toStr(""));
							getFormModel().getSCurricula().setHoldCurrRule(isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()));
							getFormModel().getSCurricula().setHoldTermCtlg(isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
							getFormModel().getSCurricula().setHoldDept(sorlfosElement.getSorlfosDeptCode());
							if ( sorlcurElement.getSorlcurProgram().equals("************") )
							{
								getFormModel().getSCurricula().setLcurCampCode(sorlcurElement.getSorlcurCampCode());
								getFormModel().getSCurricula().setLcurCollCode(sorlcurElement.getSorlcurCollCode());
								getFormModel().getSCurricula().setLcurDegcCode(sorlcurElement.getSorlcurDegcCode());
								getFormModel().getSCurricula().setLcurLevlCode(sorlcurElement.getSorlcurLevlCode());
								getFormModel().getSCurricula().setCurrLevlCode(sorlcurElement.getSorlcurLevlCode());
								getFormModel().getSCurricula().setCurrCampCode(sorlcurElement.getSorlcurCampCode());
								getFormModel().getSCurricula().setCurrDegcCode(sorlcurElement.getSorlcurDegcCode());
								getFormModel().getSCurricula().setCurrCollCode(sorlcurElement.getSorlcurCollCode());
								getFormModel().getSCurricula().setCurrProgram(sorlcurElement.getSorlcurProgram());
								getFormModel().getSCurricula().setCurrCtlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
								setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_PROGMAJR_LOV");
							}
							else {
								if ( sorlcurElement.getLfosMajrAttachInd().equals("Y") )
								{
									setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_CURRMAJR_LOV");
								}
								else {
									setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_MAJR_LOV");
								}
							}
							getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
							if ( !getGlobal("VALUE").isNull() )
							{
								sorlfosElement.setSorlfosMajrCode(getGlobal("VALUE"));
								sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
							}
							if ( getGlobal("SEL_IND").equals("Y") && !getGlobal("CURR_RULE").isNull() && sorlcurElement.getSorlcurCurrRule().isNull() )
							{
								if ( sorlcurElement.getSovlcurRowid().isNull() )
								{
									sorlcurElement.setSorlcurCurrRule(toNumber(getGlobal("CURR_RULE")));
								}
								else {
									sorlcurElement.setTempSorlcurCurrRule(toNumber(getGlobal("CURR_RULE")));
								}
								executeAction("lfos_check_program_major");
							}
							if ( getGlobal("DEPT").isNull() )
							{
							}
							else {
								sorlfosElement.setSorlfosDeptCode(getGlobal("DEPT"));
								sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
							}
							setGlobal("SEL_IND", toStr(null));
							setGlobal("DEPT", toStr(null));
							setGlobal("VALUE", toStr(null));
						}
					}
					else {
						executeAction("invalid_lcur_msg");
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_MAJOR_OPTIONS
		 --  CURR_MAJOR_OPTIONS  trigger

:lfos_option_key1 := 'LIST_VALUES';
:lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0068', 'FORM','All Major Codes') ;
 
if :lcur_temp_rule_ind <> 'N' then
   
   if :lcur_sobctrl_curr_rule_ind = 'Y' then
      if :sorlcur_program = '************' then
         null; 
      else
 
         execute_trigger('lfos_check_base');
  
      end if;

      if nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule) is null 
       and :sorlcur_program <> '************' then
          null;
       
      else
  
         if :sorlcur_program =  '************'  then
  
            :lfos_option_key2 := 'HELP';
            :lfos_option_title2 :=  G$_NLS.Get('SOQOLIB-0069', 'FORM','Majors Att''d to Multiple Curricula') ;
         else 
  
            if :lfos_majr_attach_ind = 'Y' then
               :lfos_option_key2 := 'HELP';
               :lfos_option_title2 :=  G$_NLS.Get('SOQOLIB-0070', 'FORM','Attached Majors/Departments') ;
            end if;
         end if;
        

    end if;
 
 end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_MAJOR_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_MAJOR_OPTIONS")
		public void Soqolib_LfosCurrMajorOptions()
		{
			
				//   CURR_MAJOR_OPTIONS  trigger

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				//   CURR_MAJOR_OPTIONS  trigger
				sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
				sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0068"), toStr("FORM"), toStr("All Major Codes")));
				if ( getFormModel().getSCurricula().getLcurTempRuleInd().notEquals("N") )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						if ( sorlcurElement.getSorlcurProgram().equals("************") )
						{
						}
						else {
							executeAction("lfos_check_base");
						}
						if ( isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()).isNull() && sorlcurElement.getSorlcurProgram().notEquals("************") )
						{
						}
						else {
							if ( sorlcurElement.getSorlcurProgram().equals("************") )
							{
								sorlfosElement.setLfosOptionKey2(toStr("HELP"));
								sorlfosElement.setLfosOptionTitle2(GNls.Fget(toStr("SOQOLIB-0069"), toStr("FORM"), toStr("Majors Att'd to Multiple Curricula")));
							}
							else {
								if ( sorlcurElement.getLfosMajrAttachInd().equals("Y") )
								{
									sorlfosElement.setLfosOptionKey2(toStr("HELP"));
									sorlfosElement.setLfosOptionTitle2(GNls.Fget(toStr("SOQOLIB-0070"), toStr("FORM"), toStr("Attached Majors/Departments")));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_CONC_OPTIONS
		 --  CURR_CONC_OPTIONS  trigger
--   option titles attached concentrations for first major 
declare 
	test_option varchar2(30) := '';
	
begin 
  :lfos_option_key1 := 'LIST_VALUES';
  :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0071', 'FORM','All Concentration Codes') ; 
 
  if :lcur_sobctrl_curr_rule_ind = 'Y' then
    execute_trigger('lfos_check_base');
   	if :lfos_concmajr_attach_ind = 'Y' or :lfos_concbase_attach_ind = 'Y' then  
          <multilinecomment> show attached conc to base rule and major </multilinecomment>          
          :lfos_option_key2 := 'HELP';
          :lfos_option_title2 :=  G$_NLS.Get('SOQOLIB-0072', 'FORM','Attached Concentrations') ; 
   end if;  
end if;

end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_CONC_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_CONC_OPTIONS")
		public void Soqolib_LfosCurrConcOptions()
		{
			
				//   CURR_CONC_OPTIONS  trigger
				//    option titles attached concentrations for first major 

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					NString testOption = toStr("");
					sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
					sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0071"), toStr("FORM"), toStr("All Concentration Codes")));
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						executeAction("lfos_check_base");
						if ( sorlcurElement.getLfosConcmajrAttachInd().equals("Y") || sorlcurElement.getLfosConcbaseAttachInd().equals("Y") )
						{
							//  show attached conc to base rule and major 
							sorlfosElement.setLfosOptionKey2(toStr("HELP"));
							sorlfosElement.setLfosOptionTitle2(GNls.Fget(toStr("SOQOLIB-0072"), toStr("FORM"), toStr("Attached Concentrations")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.VALIDATE_CURRICULUM_AT_COMMIT
		 --- step thru the curriculum before the commit to verify a primary
---- curriculum and major exists 



DECLARE
	
	lv_lastcnt         NUMBER := 0;
  lv_loop_cnt        NUMBER := 0; 
  lv_lfos_loop_cnt   NUMBER := 0; 
  lv_lfos_lastcnt    NUMBER := 0;
  lv_prior_cnt       NUMBER := 0;
  lv_major_cnt       NUMBER := 0; 
  lv_lfst_cnt        NUMBER := 0;  
  
  lv_lcur_priority   NUMBER := 0;
  lv_lcur_seqno      NUMBER := 0;
  lv_cact_code       stvcact.stvcact_code%TYPE := NULL; 
  lv_lfos_priority   NUMBER := 0;
  lv_lfos_seqno      NUMBER := 0;
  lv_lfst_code       gtvlfst.gtvlfst_code%TYPE := NULL; 
  
  lv_cnt_select_sorlcur NUMBER := 0; 
  lcur_blk          VARCHAR2(30) ; 
  lfos_blk          VARCHAR2(30) ;
  lv_blk            BLOCK; 
  lv_is_valid       VARCHAR2(1) := NULL; 

  save_item         VARCHAR2(30) := NULL;
  soblmod_row       soblmod%ROWTYPE; 
  lfos_row          sotlfos%rowtype;
  lcur_row          sotlcur%rowtype; 
 
  -- 
  CURSOR group_priority_curr_c IS
   SELECT sotlcur_priority_no   
    FROM sotlcur 
    WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y'
     and ( (sotlcur_lmod_code <> sb_curriculum_str.f_learner
        and sotlcur_key_seqno = :s$_curricula.module_key_seqno) 
           or ( sotlcur_lmod_code = sb_curriculum_str.f_learner ) ) 
    and ( ( sotlcur_term_code = :s$_curricula.module_term_code 
       and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
       or ( sotlcur_lmod_code = sb_curriculum_str.f_learner
           and sotlcur_term_code < :s$_curricula.module_end_term)
       or ( sotlcur_lmod_code = sb_curriculum_str.f_outcome ) )
    AND sotlcur_pidm = :s$_curricula.module_pidm 
    and sotlcur_lmod_code = :s$_curricula.module_code
    and sotlcur_seqno = 
      ( select max(m.sotlcur_seqno)
        from sotlcur m
        where m.sotlcur_priority_no = sotlcur.sotlcur_priority_no
        and ( (m.sotlcur_lmod_code <> sb_curriculum_str.f_learner
        and m.sotlcur_key_seqno = sotlcur.sotlcur_key_seqno) 
           or ( m.sotlcur_lmod_code = sb_curriculum_str.f_learner ) )
        and m.sotlcur_lmod_code = sotlcur.sotlcur_lmod_code
        and m.sotlcur_pidm = :s$_curricula.module_pidm 
        and ( ( m.sotlcur_term_code = :s$_curricula.module_term_code 
          and m.sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
          or ( m.sotlcur_lmod_code = sb_curriculum_str.f_learner
           and m.sotlcur_term_code < :s$_curricula.module_end_term)
          or ( m.sotlcur_lmod_code = sb_curriculum_str.f_outcome ) ) )
    GROUP BY sotlcur_priority_no 
    ORDER BY sotlcur_priority_no;
    
  CURSOR check_primary_curr_c IS
    SELECT sotlcur_seqno,  sotlcur_cact_code
    FROM sotlcur
    WHERE sotlcur_priority_no = lv_lcur_priority 
    AND sotlcur_pidm = :s$_curricula.module_pidm 
    and sotlcur_lmod_code = :s$_curricula.module_code
     and ( (sotlcur_lmod_code <> sb_curriculum_str.f_learner
        and sotlcur_key_seqno = :s$_curricula.module_key_seqno) 
           or ( sotlcur_lmod_code = sb_curriculum_str.f_learner ) ) 
    and ( ( sotlcur_term_code = :s$_curricula.module_term_code 
       and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
       or ( sotlcur_lmod_code = sb_curriculum_str.f_learner
          and sotlcur_term_code < :s$_curricula.module_end_term)
         or ( sotlcur_lmod_code = sb_curriculum_str.f_outcome ))
    ORDER BY sotlcur_seqno desc; 
    
  --  7.2 change the following so it returns count of active by lfst 
  CURSOR group_priority_major_c IS 
    SELECT nvl(count(*), 0) , sotlfos_lfst_code  
    FROM   sotlfos 
    WHERE  sotlfos_lcur_seqno = lv_lcur_seqno
    AND sotlfos_pidm = :s$_curricula.module_pidm
    AND sb_learnercurricstatus.f_is_active(sotlfos_cact_code) = 'Y'
    AND sotlfos_seqno = 
       ( select max(high.sotlfos_seqno)
          from sotlfos high
          where high.sotlfos_lfst_code = sotlfos.sotlfos_lfst_code
          and high.sotlfos_lcur_seqno = sotlfos.sotlfos_lcur_seqno
          and high.sotlfos_pidm = sotlfos.sotlfos_pidm
          and high.sotlfos_priority_no = sotlfos.sotlfos_priority_no)
    GROUP by sotlfos_lfst_code;
    
  CURSOR check_primary_major_c IS 
    SELECT  sotlfos_seqno, sotlfos_cact_code 
    FROM  sotlfos 
    WHERE  sotlfos_lcur_seqno = lv_lcur_seqno
    AND sotlfos_priority_no = lv_lfos_priority
    AND sotlfos_lfst_code = lv_lfst_code
    AND sotlfos_pidm = :s$_curricula.module_pidm
    ORDER BY  sotlfos_seqno desc; 
    
    CURSOR cnt_sorlcur_c is
    select nvl(count(*),0) 
    from sorlcur
    where sorlcur_pidm = :s$_curricula.module_pidm
     and ( (sorlcur_lmod_code <> sb_curriculum_str.f_learner
        and sorlcur_key_seqno = :s$_curricula.module_key_seqno) 
           or ( sorlcur_lmod_code = sb_curriculum_str.f_learner ) ) 
    and sorlcur_lmod_code = :s$_curricula.module_code 
    and ( ( sorlcur_term_code = :s$_curricula.module_term_code 
       and sorlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions))
          or ( sorlcur_lmod_code = sb_curriculum_str.f_outcome ) 
       or ( sorlcur_lmod_code = sb_curriculum_str.f_learner
           and sorlcur_term_code < :s$_curricula.module_end_term)) ;
    
    
    cursor sotlfos_query_c is 
    select * from sotlfos
    where sotlfos_pidm = :s$_curricula.module_pidm
    and sotlfos_lcur_seqno = lcur_row.sotlcur_seqno
     order by sotlfos_pidm, sotlfos_lcur_seqno, sotlfos_lfst_code;
     
    cursor sotlcur_query_c is 
    select * from sotlcur
    where sotlcur_pidm = :s$_curricula.module_pidm
    and sotlcur_lmod_code = :s$_curricula.module_code
     and ( (sotlcur_lmod_code <> sb_curriculum_str.f_learner
        and sotlcur_key_seqno = :s$_curricula.module_key_seqno) 
           or ( sotlcur_lmod_code = sb_curriculum_str.f_learner ) ) 
    and ( ( sotlcur_term_code = :s$_curricula.module_term_code 
       and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
       or ( sotlcur_lmod_code = sb_curriculum_str.f_learner
          and sotlcur_term_code < :s$_curricula.module_end_term)
         or ( sotlcur_lmod_code = sb_curriculum_str.f_outcome ))
    order by sotlcur_pidm, sotlcur_priority_no, sotlcur_seqno desc;
   
   
  

    CURSOR soblmod_c IS
       select * from soblmod
       where soblmod_lmod_code = :s$_curricula.module_code;
BEGIN
	-- force re population of cached curriculum table data 
	sokccur.p_delete_tabs;
	
 	validate(form_scope); 
	save_item := :system.current_item; 
	lv_blk := find_block('SORLCUR_LITE'); 
	IF ID_NULL(lv_blk) THEN 
		 lcur_blk := 'SORLCUR';
		 lfos_blk := 'SORLFOS'; 
	ELSE 
		 lcur_blk := 'SORLCUR_LITE';
		 lfos_blk := 'SORLFOS_LITE'; 
	END IF;
	
	-- user has not navigated to the curric blocks, populated the temp tables 
  if nvl(:s$_curricula.original_sorlcur_count,0) = 0 and :sorlcur_priority_no is  null
  	and :sovlcur_rowid is  null 
   	then 
     if :s$_curricula.module_code = sb_curriculum_str.f_learner then 
	    soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
	    p_term_code =>   :s$_curricula.module_term_code,
      p_lmod_code => :s$_curricula.module_code); 
     end if;
   
  end if;
--	open sotlcur_query_c;
--	loop
--		fetch sotlcur_query_c into lcur_row;
--		exit when sotlcur_query_c%notfound;
--		message('lcur ' || lcur_row.sotlcur_seqno || ' term ' || lcur_row.sotlcur_term_code 
--		|| ' prior ' || lcur_row.sotlcur_priority_no || ' cact ' || lcur_row.sotlcur_cact_code ); 
--	open sotlfos_query_c;
--  loop
--	 fetch sotlfos_query_c into lfos_row;
--	 if sotlfos_query_c%notfound then
--	 	  exit;
--	 	end if; 
--	 message(lcur_row.sotlcur_seqno || ' lfos ' || lfos_row.sotlfos_lcur_seqno || ' lfst '  
--	   || lfos_row.sotlfos_lfst_code);
--	end loop;
--	close sotlfos_query_c;
--	end loop;
--	close sotlcur_query_c;
	
	OPEN soblmod_c;
	FETCH soblmod_c INTO soblmod_row;
	CLOSE soblmod_c; 
--  selected the sorlcur with the lowest priority, and its highest seqno that is active.  We want to
--  verify that there is a primary curriculum 
-- 
 
   
   lv_prior_cnt := 0; 
   OPEN  group_priority_curr_c;
   LOOP
   	 FETCH  group_priority_curr_c into lv_lcur_priority; 
   	 EXIT WHEN group_priority_curr_c%NOTFOUND;
   	 -- need to only get first record, since its the one we need to count majors for
     -- 	 message('after fetch lcur prio ' || lv_lcur_priority); 
       OPEN check_primary_curr_c;
       FETCH check_primary_curr_c into lv_lcur_seqno,   lv_cact_code;
      --  message('lcur cact ' || lv_cact_code || ' seq ' || lv_lcur_seqno); 
   	 	 lv_major_cnt := 0;
   
   	 	 IF sb_learnercurricstatus.f_is_active(lv_cact_code) = 'Y' THEN
          lv_prior_cnt := lv_prior_cnt + 1;
     
       --
       --  Verify that each of the active curricula have a primary major 
       --
       --- the following was rewritten for 7.2 and checks that the count of active
 	     -- field of study type has not exceeded the max and that there is at least one 
 	     -- major 
         OPEN group_priority_major_c;
         LOOP 
          Lv_lfst_cnt := 0;
        
          FETCH group_priority_major_c INTO lv_lfst_cnt, lv_lfst_code;
          EXIT WHEN group_priority_major_c%NOTFOUND ;
          If lv_lfst_cnt > sb_fieldofstudy_allowed.f_get_count(
                   P_lmod_code => :s$_curricula.module_code,
                   P_lfst_code => lv_lfst_code) then 
             close group_priority_major_c;
             message( G$_NLS.Get('SOQOLIB-0073', 'FORM',
      '*Error* Invalid number of active field of study type %01% for the curriculum.',  
                 lv_lfst_code )  );
	     	    RAISE FORM_TRIGGER_FAILURE;
           End if;
           If lv_lfst_code = sb_fieldofstudy_str.f_major 
            Then  lv_major_cnt := lv_lfst_cnt;
           End if;  
         END LOOP;
         CLOSe group_priority_major_c;
     -- message('lv major cnt is 0: ' || lv_major_cnt); 
      IF lv_major_cnt = 0 THEN 
 	     	message( G$_NLS.Get('SOQOLIB-0074', 'FORM','*Error* Enter an active primary major for the curriculum.') 
	         	   );
	     	 RAISE FORM_TRIGGER_FAILURE; 
      End if; 
      
      end if; -- curriculum is active
      CLOSE check_primary_curr_c;
    END LOOP;  -- get all curric priorities
    CLOSE group_priority_curr_c;

   --  there were no active lcur stored in the temp tables
   --  message('lv prior cnt ' || lv_prior_cnt || ' max lcur allowed ' || soblmod_row.soblmod_max_curricula); 
   IF lv_prior_cnt = 0 THEN 
   	open cnt_sorlcur_c;
   	fetch cnt_sorlcur_c into lv_cnt_select_sorlcur;
   	close cnt_sorlcur_c;
   	-- the  sorlcur rows were not captured in the temp tables if > 0 
   	--	message('sorlcur cnt ' || lv_cnt_select_sorlcur || ' update ' ||
   --		:s$_curricula.curricula_updated); 
   	if lv_cnt_select_sorlcur > 0 and 
   		 	  nvl(:s$_curricula.curricula_updated,'N') = 'Y'   then 
    	MESSAGE( G$_NLS.Get('SOQOLIB-0075', 'FORM','*Error* Enter at least one active primary curriculum.') ); 
  	  RAISE FORM_TRIGGER_FAILURE;
   	end if;
   	If lv_cnt_select_sorlcur = 0 then 
   	  MESSAGE( G$_NLS.Get('SOQOLIB-0076', 'FORM','*Error* Enter at least one active primary curriculum.') ); 
  	  RAISE FORM_TRIGGER_FAILURE;
   	end if;
 	ELSE 
   	 IF	lv_prior_cnt > soblmod_row.soblmod_max_curricula THEN 
  	 	  MESSAGE( G$_NLS.Get('SOQOLIB-0077', 'FORM','*Error* Invalid number of curricula have been entered.  Refer to SOACTRL for maximum allowed.') ); 
  	     RAISE FORM_TRIGGER_FAILURE;
   	 end if; 
 	END IF; 
 	
 	 
	go_item(save_item); 

END; 
			 
	
   

	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.VALIDATE_CURRICULUM_AT_COMMIT
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="VALIDATE_CURRICULUM_AT_COMMIT")
//		public void Soqolib_ValidateCurriculumAtCommit()
//		{
//			
//				// - step thru the curriculum before the commit to verify a primary
//				// -- curriculum and major exists 
//
//				//F2J_WARNING : Caution, the variable may be null.
//				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber lvLastcnt = toNumber(0);
//					NNumber lvLoopCnt = toNumber(0);
//					NNumber lvLfosLoopCnt = toNumber(0);
//					NNumber lvLfosLastcnt = toNumber(0);
//					NNumber lvPriorCnt = toNumber(0);
//					NNumber lvMajorCnt = toNumber(0);
//					NNumber lvLfstCnt = toNumber(0);
//					NNumber lvLcurPriority = toNumber(0);
//					NNumber lvLcurSeqno = toNumber(0);
//					NString lvCactCode = NString.getNull();
//					NNumber lvLfosPriority = toNumber(0);
//					NNumber lvLfosSeqno = toNumber(0);
//					NString lvLfstCode = NString.getNull();
//					NNumber lvCntSelectSorlcur = toNumber(0);
//					NString lcurBlk= NString.getNull();
//					NString lfosBlk= NString.getNull();
//					BlockDescriptor lvBlk= null;
//					NString lvIsValid = NString.getNull();
//					NString saveItem = NString.getNull();
//					SoblmodRow soblmodRow= null;
//					SotlfosRow lfosRow= null;
//					SotlcurRow lcurRow= null;
//					String sqlgroupPriorityCurrC = "SELECT sotlcur_priority_no " +
//	" FROM sotlcur " +
//	" WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y' AND ((sotlcur_lmod_code <> sb_curriculum_str.f_learner AND sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner AND sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sotlcur_lmod_code = sb_curriculum_str.f_outcome)) AND sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND sotlcur_seqno = (SELECT max(m.sotlcur_seqno) " +
//		" FROM sotlcur m " +
//		" WHERE m.sotlcur_priority_no = sotlcur.sotlcur_priority_no AND ((m.sotlcur_lmod_code <> sb_curriculum_str.f_learner AND m.sotlcur_key_seqno = sotlcur.sotlcur_key_seqno) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND m.sotlcur_lmod_code = sotlcur.sotlcur_lmod_code AND m.sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND ((m.sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (m.sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_learner AND m.sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_outcome)) ) " +
//	" GROUP BY sotlcur_priority_no " +
//	" ORDER BY sotlcur_priority_no";
//					DataCursor groupPriorityCurrC = new DataCursor(sqlgroupPriorityCurrC);
//					String sqlcheckPrimaryCurrC = "SELECT sotlcur_seqno, sotlcur_cact_code " +
//	" FROM sotlcur " +
//	" WHERE sotlcur_priority_no = :P_LV_LCUR_PRIORITY AND sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sotlcur_lmod_code <> sb_curriculum_str.f_learner AND sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner AND sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sotlcur_lmod_code = sb_curriculum_str.f_outcome)) " +
//	" ORDER BY sotlcur_seqno DESC";
//					DataCursor checkPrimaryCurrC = new DataCursor(sqlcheckPrimaryCurrC);
//					String sqlgroupPriorityMajorC = "SELECT nvl(count(*), 0), sotlfos_lfst_code " +
//	" FROM sotlfos " +
//	" WHERE sotlfos_lcur_seqno = :P_LV_LCUR_SEQNO AND sotlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sb_learnercurricstatus.f_is_active(sotlfos_cact_code) = 'Y' AND sotlfos_seqno = (SELECT max(high.sotlfos_seqno) " +
//		" FROM sotlfos high " +
//		" WHERE high.sotlfos_lfst_code = sotlfos.sotlfos_lfst_code AND high.sotlfos_lcur_seqno = sotlfos.sotlfos_lcur_seqno AND high.sotlfos_pidm = sotlfos.sotlfos_pidm AND high.sotlfos_priority_no = sotlfos.sotlfos_priority_no ) " +
//	" GROUP BY sotlfos_lfst_code ";
//					DataCursor groupPriorityMajorC = new DataCursor(sqlgroupPriorityMajorC);
//					String sqlcheckPrimaryMajorC = "SELECT sotlfos_seqno, sotlfos_cact_code " +
//	" FROM sotlfos " +
//	" WHERE sotlfos_lcur_seqno = :P_LV_LCUR_SEQNO AND sotlfos_priority_no = :P_LV_LFOS_PRIORITY AND sotlfos_lfst_code = :P_LV_LFST_CODE AND sotlfos_pidm = :S___CURRICULA_MODULE_PIDM " +
//	" ORDER BY sotlfos_seqno DESC";
//					DataCursor checkPrimaryMajorC = new DataCursor(sqlcheckPrimaryMajorC);
//					String sqlcntSorlcurC = "SELECT nvl(count(*), 0) " +
//	" FROM sorlcur " +
//	" WHERE sorlcur_pidm = :S___CURRICULA_MODULE_PIDM AND ((sorlcur_lmod_code <> sb_curriculum_str.f_learner AND sorlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO) OR (sorlcur_lmod_code = sb_curriculum_str.f_learner)) AND sorlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sorlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sorlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sorlcur_lmod_code = sb_curriculum_str.f_outcome) OR (sorlcur_lmod_code = sb_curriculum_str.f_learner AND sorlcur_term_code < :S___CURRICULA_MODULE_END_TERM)) ";
//					DataCursor cntSorlcurC = new DataCursor(sqlcntSorlcurC);
//					String sqlsotlfosQueryC = "SELECT * " +
//	" FROM sotlfos " +
//	" WHERE sotlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sotlfos_lcur_seqno = :P_LCUR_ROW_SOTLCUR_SEQNO " +
//	" ORDER BY sotlfos_pidm, sotlfos_lcur_seqno, sotlfos_lfst_code";
//					DataCursor sotlfosQueryC = new DataCursor(sqlsotlfosQueryC);
//					String sqlsotlcurQueryC = "SELECT * " +
//	" FROM sotlcur " +
//	" WHERE sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sotlcur_lmod_code <> sb_curriculum_str.f_learner AND sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner AND sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sotlcur_lmod_code = sb_curriculum_str.f_outcome)) " +
//	" ORDER BY sotlcur_pidm, sotlcur_priority_no, sotlcur_seqno DESC";
//					DataCursor sotlcurQueryC = new DataCursor(sqlsotlcurQueryC);
//					String sqlsoblmodC = "SELECT * " +
//	" FROM soblmod " +
//	" WHERE soblmod_lmod_code = :S___CURRICULA_MODULE_CODE ";
//					DataCursor soblmodC = new DataCursor(sqlsoblmodC);
//					//  force re population of cached curriculum table data 
//					Sokccur.pDeleteTabs();
//					validateTask(SupportClasses.Constants.FORM_SCOPE);
//					saveItem = toStr(getCurrentItem());
//					lvBlk = findBlock("SORLCUR_LITE");
//					if ( (lvBlk == null) )
//					{
//						lcurBlk = toStr("SORLCUR");
//						lfosBlk = toStr("SORLFOS");
//					}
//					else {
//						lcurBlk = toStr("SORLCUR_LITE");
//						lfosBlk = toStr("SORLFOS_LITE");
//					}
//					//  user has not navigated to the curric blocks, populated the temp tables 
//					if ( isNull(getFormModel().getSCurricula().getOriginalSorlcurCount(), 0).equals(0) && sorlcurElement.getSorlcurPriorityNo().isNull() && sorlcurElement.getSovlcurRowid().isNull() )
//					{
//						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
//						{
//							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//							Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
//						}
//					}
//					// 	open sotlcur_query_c;
//					// 	loop
//					// 		fetch sotlcur_query_c into lcur_row;
//					// 		exit when sotlcur_query_c%notfound;
//					// 		message('lcur ' || lcur_row.sotlcur_seqno || ' term ' || lcur_row.sotlcur_term_code 
//					// 		|| ' prior ' || lcur_row.sotlcur_priority_no || ' cact ' || lcur_row.sotlcur_cact_code ); 
//					// 	open sotlfos_query_c;
//					//   loop
//					// 	 fetch sotlfos_query_c into lfos_row;
//					// 	 if sotlfos_query_c%notfound then
//					// 	 	  exit;
//					// 	 	end if; 
//					// 	 message(lcur_row.sotlcur_seqno || ' lfos ' || lfos_row.sotlfos_lcur_seqno || ' lfst '  
//					// 	   || lfos_row.sotlfos_lfst_code);
//					// 	end loop;
//					// 	close sotlfos_query_c;
//					// 	end loop;
//					// 	close sotlcur_query_c;
//					//Setting query parameters
//					soblmodC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
//					//F2J_WARNING : Make sure that the method "Close" is being called over the variable soblmodC.
//					soblmodC.open();
//					soblmodRow = soblmodC.fetchRow();
//					soblmodC.close();
//					//   selected the sorlcur with the lowest priority, and its highest seqno that is active.  We want to
//					//   verify that there is a primary curriculum 
//					//  
//					lvPriorCnt = toNumber(0);
//					//Setting query parameters
//					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
//					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
//					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_END_TERM", getFormModel().getSCurricula().getModuleEndTerm());
//					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
//					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
//					//F2J_WARNING : Make sure that the method "Close" is being called over the variable groupPriorityCurrC.
//					groupPriorityCurrC.open();
//					while (true) {
//						ResultSet groupPriorityCurrCResults = groupPriorityCurrC.fetchInto();
//						if ( groupPriorityCurrCResults != null ) {
//							lvLcurPriority = groupPriorityCurrCResults.getNumber(0);
//						}
//						if ( groupPriorityCurrC.notFound() ) 
//							break;
//						//  need to only get first record, since its the one we need to count majors for
//						//  	 message('after fetch lcur prio ' || lv_lcur_priority); 
//						//Setting query parameters
//						checkPrimaryCurrC.addParameter("P_LV_LCUR_PRIORITY", lvLcurPriority);
//						checkPrimaryCurrC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
//						checkPrimaryCurrC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
//						checkPrimaryCurrC.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
//						checkPrimaryCurrC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
//						checkPrimaryCurrC.addParameter("S___CURRICULA_MODULE_END_TERM", getFormModel().getSCurricula().getModuleEndTerm());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkPrimaryCurrC.
//						checkPrimaryCurrC.open();
//						ResultSet checkPrimaryCurrCResults = checkPrimaryCurrC.fetchInto();
//						if ( checkPrimaryCurrCResults != null ) {
//							lvLcurSeqno = checkPrimaryCurrCResults.getNumber(0);
//							lvCactCode = checkPrimaryCurrCResults.getStr(1);
//						}
//						//   message('lcur cact ' || lv_cact_code || ' seq ' || lv_lcur_seqno); 
//						lvMajorCnt = toNumber(0);
//						if ( SbLearnercurricstatus.fIsActive(lvCactCode).equals("Y") )
//						{
//							lvPriorCnt = lvPriorCnt.add(1);
//							// 
//							//   Verify that each of the active curricula have a primary major 
//							// 
//							// - the following was rewritten for 7.2 and checks that the count of active
//							//  field of study type has not exceeded the max and that there is at least one 
//							//  major 
//							//Setting query parameters
//							groupPriorityMajorC.addParameter("P_LV_LCUR_SEQNO", lvLcurSeqno);
//							groupPriorityMajorC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable groupPriorityMajorC.
//							groupPriorityMajorC.open();
//							while (true) {
//								lvLfstCnt = toNumber(0);
//								ResultSet groupPriorityMajorCResults = groupPriorityMajorC.fetchInto();
//								if ( groupPriorityMajorCResults != null ) {
//									lvLfstCnt = groupPriorityMajorCResults.getNumber(0);
//									lvLfstCode = groupPriorityMajorCResults.getStr(1);
//								}
//								if ( groupPriorityMajorC.notFound() ) 
//									break;
//								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//								if ( lvLfstCnt.greater(SbFieldofstudyAllowed.fGetCount(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(), /*pLfstCode=>*/lvLfstCode)) )
//								{
//									groupPriorityMajorC.close();
//									errorMessage(GNls.Fget(toStr("SOQOLIB-0073"), toStr("FORM"), toStr("*Error* Invalid number of active field of study type %01% for the curriculum."), lvLfstCode));
//									throw new ApplicationException();
//								}
//								if ( lvLfstCode.equals(SbFieldofstudyStr.fMajor()) )
//								{
//									lvMajorCnt = lvLfstCnt;
//								}
//							}
//							groupPriorityMajorC.close();
//							//  message('lv major cnt is 0: ' || lv_major_cnt); 
//							if ( lvMajorCnt.equals(0) )
//							{
//								errorMessage(GNls.Fget(toStr("SOQOLIB-0074"), toStr("FORM"), toStr("*Error* Enter an active primary major for the curriculum.")));
//								throw new ApplicationException();
//							}
//						}
//						//  curriculum is active
//						checkPrimaryCurrC.close();
//					}
//					//  get all curric priorities
//					groupPriorityCurrC.close();
//					//   there were no active lcur stored in the temp tables
//					//   message('lv prior cnt ' || lv_prior_cnt || ' max lcur allowed ' || soblmod_row.soblmod_max_curricula); 
//					if ( lvPriorCnt.equals(0) )
//					{
//						//Setting query parameters
//						cntSorlcurC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
//						cntSorlcurC.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
//						cntSorlcurC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
//						cntSorlcurC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
//						cntSorlcurC.addParameter("S___CURRICULA_MODULE_END_TERM", getFormModel().getSCurricula().getModuleEndTerm());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntSorlcurC.
//						cntSorlcurC.open();
//						ResultSet cntSorlcurCResults = cntSorlcurC.fetchInto();
//						if ( cntSorlcurCResults != null ) {
//							lvCntSelectSorlcur = cntSorlcurCResults.getNumber(0);
//						}
//						cntSorlcurC.close();
//						//  the  sorlcur rows were not captured in the temp tables if > 0 
//						// 	message('sorlcur cnt ' || lv_cnt_select_sorlcur || ' update ' ||
//						// 		:s$_curricula.curricula_updated); 
//						if ( lvCntSelectSorlcur.greater(0) && isNull(getFormModel().getSCurricula().getCurriculaUpdated(), "N").equals("Y") )
//						{
//							errorMessage(GNls.Fget(toStr("SOQOLIB-0075"), toStr("FORM"), toStr("*Error* Enter at least one active primary curriculum.")));
//							throw new ApplicationException();
//						}
//						if ( lvCntSelectSorlcur.equals(0) )
//						{
//							errorMessage(GNls.Fget(toStr("SOQOLIB-0076"), toStr("FORM"), toStr("*Error* Enter at least one active primary curriculum.")));
//							throw new ApplicationException();
//						}
//					}
//					else {
//						if ( lvPriorCnt.greater(soblmodRow.SoblmodMaxCurricula) )
//						{
//							errorMessage(GNls.Fget(toStr("SOQOLIB-0077"), toStr("FORM"), toStr("*Error* Invalid number of curricula have been entered.  Refer to SOACTRL for maximum allowed.")));
//							throw new ApplicationException();
//						}
//					}
//					goItem(saveItem);
//				}
//			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.VALIDATE_BASE_CURRICULUM_RULES
		 DECLARE
	lv_block               BLOCK;
  alert_button           number;
  alert_id               ALERT := FIND_ALERT('CURRICULUM_ERROR');
  cem_msg                varchar2(2000) := '';   
  curr_rule_out          sorlcur.sorlcur_curr_rule%TYPE  ;
  module                 VARCHAR2(1) := NULL;
  prim_roll_ind          VARCHAR2(1) := NULL;
  secd_roll_ind          VARCHAR2(1) := NULL;
  majr_attach_ind        VARCHAR2(1) := NULL;
  conc_majr_attach_ind   VARCHAR2(1) := NULL;
  conc_base_attach_ind   VARCHAR2(1) := NULL;
  minr_attach_ind        VARCHAR2(1) := NULL;
  curr_error_level       sobctrl.sobctrl_stu_errlvl_ind%TYPE;
  roll_ind               sorlcur.sorlcur_roll_ind%TYPE;
  sobctrl_row            sobctrl%ROWTYPE;
  
  curr_error             number;
   
  CURSOR sobctrl_c IS
  select * from sobctrl;
   
BEGIN
 	lv_block := find_block('SORLCUR_LITE'); 

   
  
  if :sovlcur_rowid is null and 
  	 :lcur_sobctrl_curr_rule_ind = 'Y'  then 
			if :sorlcur_program = '************' then 
		   	 :sorlcur_program := '';
			end if;
			
		 
		   OPEN sobctrl_c;
		   FETCH sobctrl_c into sobctrl_row;
		   CLOSE sobctrl_c;
		   -- do not check for curriculum rules if it is turned off on soactrl 
		   -- or the term code is less than the minimum term in sobcurrr 
		   -- or the program is specific for the person on smaprle 
			   IF sobctrl_row.sobctrl_curr_rule_ind  ='Y' and :lcur_temp_rule_ind = 'Y' and 
		   	 :global.init_curr_term <  :s$_curricula.module_term_code THEN
		 
		     <multilinecomment> check the curriculum now to populate curr rule and roll ind </multilinecomment>
		        CASE :sorlcur_lmod_code
		         WHEN sb_curriculum_str.f_ADMISSIONS  THEN
		           module := 'A';
		           curr_error_level := sobctrl_row.sobctrl_adm_errlvl_ind;
		         WHEN sb_curriculum_str.f_RECRUIT THEN
		           module := 'R';
		           curr_error_level := sobctrl_row.sobctrl_rec_errlvl_ind;
		         WHEN  sb_curriculum_str.f_LEARNER THEN
		           module := 'S';
		           curr_error_level := sobctrl_row.sobctrl_stu_errlvl_ind;
		         WHEN sb_curriculum_str.f_OUTCOME THEN
		           module := 'H';
		           curr_error_level := sobctrl_row.sobctrl_his_errlvl_ind;
		         else
		           null;
		        END CASE;
		        if curr_error_level = 'F' then 
		        curr_error := 0;
		        sokcurr.P_CheckBase( module,
		          nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code),
		          :sorlcur_camp_code,
		          :sorlcur_coll_code,
		          :sorlcur_degc_code,
		          :sorlcur_levl_code,
		          :sorlcur_program,
		          curr_rule_out ,
		          prim_roll_ind   ,
		          secd_roll_ind   ,
		          majr_attach_ind ,
		          conc_majr_attach_ind ,
		          conc_base_attach_ind,
		          minr_attach_ind  ,
		          curr_error      );
		          
		     -- if :sorlcur_curr_rule is null and curr_rule_out is not null then 
		     --  :sorlcur_curr_rule := curr_rule_out;
		     -- end if;    
		      -- show curriculum warning only once and bomb if fatal error 
		      --	message('curr error ' || curr_error || ' level ' || curr_error_level);
				  if ( curr_error is not null and curr_error > 0 )
				   	 and curr_error_level = 'F'   then 
					   cem_msg :=   substr(sokcmsg.F_SorlcurErrorMsg(curr_error_level, 'V',
					   	                          curr_error),1,75);
					   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
				 	   alert_button := show_alert('CURRICULUM_ERROR');
				    	 
					   if alert_button = ALERT_BUTTON1 then
					       null;
					   end if;
					  	IF ID_NULL(lv_block) THEN
					  		 GO_BLOCK('SORLCUR');
					  	ELSE
					  		 GO_BLOCK('SORLCUR_LITE');
					   END IF;
				   	 raise form_trigger_failure;
				  end if;  
		      end if; -- only do check if severity level is F 
		      
		      -- if the sorlcur lite block,  and its saaquik to also create the adm and recr, validate
		      	-- curriculum
		      if NOT ID_NULL(lv_block) THEN  -- do the following only for sorlcur lite 
		      	if sobctrl_row.sobctrl_adm_errlvl_ind in ('W', 'F') and 
		      		 nvl(:s$_curricula.create_adm, 'N') = 'Y' then 
		      	
		      	 curr_error := 0;
		        sokcurr.P_CheckBase( 'A',
		          nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code),
		          :sorlcur_camp_code,
		          :sorlcur_coll_code,
		          :sorlcur_degc_code,
		          :sorlcur_levl_code,
		          :sorlcur_program,
		          curr_rule_out ,
		          prim_roll_ind   ,
		          secd_roll_ind   ,
		          majr_attach_ind ,
		          conc_majr_attach_ind ,
		          conc_base_attach_ind,
		          minr_attach_ind  ,
		          curr_error      );
		      
		          if :sorlcur_curr_rule is null and curr_rule_out is not null then
		          	  :sorlcur_curr_rule := curr_rule_out;
		          end if;
		      -- show curriculum warning only once and bomb if fatal error 
						  if ( curr_error is not null and curr_error > 0 ) THEN
						  	if sobctrl_row.sobctrl_adm_errlvl_ind = 'F' then
						  		cem_msg := g$_nls.get('SOQOLIB-0078', 'FORM',
						  		  'Fatal curriculum error in creating application, student record not created.');
						  	else 
						  		cem_msg :=  g$_nls.get('SOQOLIB-0079', 'FORM',
						  		'Warning, curriculum error in creating application.');
						  	end if;
							   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
						 	   alert_button := show_alert('CURRICULUM_ERROR');
						    	 
							   if alert_button = ALERT_BUTTON1 then
							       null;
							   end if;
							   if sobctrl_row.sobctrl_adm_errlvl_ind = 'F' then
				    		    GO_BLOCK('SORLCUR_LITE');
							    	 raise form_trigger_failure;
						   	 END IF;
						  end if;
		      	end if;
		      	if sobctrl_row.sobctrl_rec_errlvl_ind in ('W', 'F') and 
		      		 nvl(:s$_curricula.create_recr, 'N') = 'Y' then 
		      	      			      	
		         curr_error := 0;
		        sokcurr.P_CheckBase( 'R',
		          nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code),
		          :sorlcur_camp_code,
		          :sorlcur_coll_code,
		          :sorlcur_degc_code,
		          :sorlcur_levl_code,
		          :sorlcur_program,
		          curr_rule_out ,
		          prim_roll_ind   ,
		          secd_roll_ind   ,
		          majr_attach_ind ,
		          conc_majr_attach_ind ,
		          conc_base_attach_ind,
		          minr_attach_ind  ,
		          curr_error      );
		      
		      -- show curriculum warning only once and bomb if fatal error 
						  if ( curr_error is not null and curr_error > 0 ) THEN
						  	if sobctrl_row.sobctrl_rec_errlvl_ind = 'F' then
						  		cem_msg := g$_nls.get('SOQOLIB-0080', 'FORM',
						  		  'Fatal curriculum error in creating recruit record, student record not created.');
						  	else 
						  		cem_msg :=  g$_nls.get('SOQOLIB-0081', 'FORM',
						  		'Warning, curriculum error in creating recruit record.');
						  	end if;
							   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
						 	   alert_button := show_alert('CURRICULUM_ERROR');
						    	 
							   if alert_button = ALERT_BUTTON1 then
							       null;
							   end if;
							   if sobctrl_row.sobctrl_rec_errlvl_ind = 'F' then
				    		    GO_BLOCK('SORLCUR_LITE');
							    	 raise form_trigger_failure;
						   	 END IF;
						  end if;
		      	end if;  -- recruit record 
		     	end if;  -- sorlcur lite block 

  end if;  -- curriculum turned on 
  end if; -- sorlcur rowid is null 
 
END;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.VALIDATE_BASE_CURRICULUM_RULES
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="VALIDATE_BASE_CURRICULUM_RULES")
//		public void Soqolib_ValidateBaseCurriculumRules()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					BlockDescriptor lvBlock= null;
//					NNumber alertButton= NNumber.getNull();
//					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
//					NString cemMsg = toStr("");
//					NNumber currRuleOut= NNumber.getNull();
//					NString module = NString.getNull();
//					NString primRollInd = NString.getNull();
//					NString secdRollInd = NString.getNull();
//					NString majrAttachInd = NString.getNull();
//					NString concMajrAttachInd = NString.getNull();
//					NString concBaseAttachInd = NString.getNull();
//					NString minrAttachInd = NString.getNull();
//					NString currErrorLevel= NString.getNull();
//					NString rollInd= NString.getNull();
//					SobctrlRow sobctrlRow= null;
//					NNumber currError= NNumber.getNull();
//					String sqlsobctrlC = "SELECT * " +
//	" FROM sobctrl ";
//					DataCursor sobctrlC = new DataCursor(sqlsobctrlC);
//					lvBlock = findBlock("SORLCUR_LITE");
//					if ( sorlcurElement.getSovlcurRowid().isNull() && getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
//					{
//						if ( sorlcurElement.getSorlcurProgram().equals("************") )
//						{
//							sorlcurElement.setSorlcurProgram(toStr(""));
//						}
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sobctrlC.
//						sobctrlC.open();
//						sobctrlRow = sobctrlC.fetchRow();
//						sobctrlC.close();
//						//  do not check for curriculum rules if it is turned off on soactrl 
//						//  or the term code is less than the minimum term in sobcurrr 
//						//  or the program is specific for the person on smaprle 
//						if ( sobctrlRow.SobctrlCurrRuleInd.equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") && getGlobal("INIT_CURR_TERM").lesser(getFormModel().getSCurricula().getModuleTermCode()) )
//						{
//							//  check the curriculum now to populate curr rule and roll ind 
//							if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fAdmissions()))
//							{
//								module = toStr("A");
//								currErrorLevel = sobctrlRow.SobctrlAdmErrlvlInd;
//							}
//							else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fRecruit()))
//							{
//								module = toStr("R");
//								currErrorLevel = sobctrlRow.SobctrlRecErrlvlInd;
//							}
//							else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()))
//							{
//								module = toStr("S");
//								currErrorLevel = sobctrlRow.SobctrlStuErrlvlInd;
//							}
//							else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()))
//							{
//								module = toStr("H");
//								currErrorLevel = sobctrlRow.SobctrlHisErrlvlInd;
//							}
//							else {
//							}
//							if ( currErrorLevel.equals("F") )
//							{
//								currError = toNumber(0);
//								Ref<NNumber> base_rule_ref = new Ref<NNumber>(currRuleOut);
//								Ref<NString> prim_roll_ind_ref = new Ref<NString>(primRollInd);
//								Ref<NString> secd_roll_ind_ref = new Ref<NString>(secdRollInd);
//								Ref<NString> majr_attach_ind_ref = new Ref<NString>(majrAttachInd);
//								Ref<NString> conc_majr_attach_ind_ref = new Ref<NString>(concMajrAttachInd);
//								Ref<NString> conc_base_attach_ind_ref = new Ref<NString>(concBaseAttachInd);
//								Ref<NString> minr_attach_ind_ref = new Ref<NString>(minrAttachInd);
//								Ref<NNumber> error_numb_ref = new Ref<NNumber>(currError);
//								Sokcurr.pCheckbase(module, isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()), sorlcurElement.getSorlcurCampCode(), sorlcurElement.getSorlcurCollCode(), sorlcurElement.getSorlcurDegcCode(), sorlcurElement.getSorlcurLevlCode(), sorlcurElement.getSorlcurProgram(), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
//								currRuleOut = base_rule_ref.val;
//								primRollInd = prim_roll_ind_ref.val;
//								secdRollInd = secd_roll_ind_ref.val;
//								majrAttachInd = majr_attach_ind_ref.val;
//								concMajrAttachInd = conc_majr_attach_ind_ref.val;
//								concBaseAttachInd = conc_base_attach_ind_ref.val;
//								minrAttachInd = minr_attach_ind_ref.val;
//								currError = error_numb_ref.val;
//								//  if :sorlcur_curr_rule is null and curr_rule_out is not null then 
//								//   :sorlcur_curr_rule := curr_rule_out;
//								//  end if;    
//								//  show curriculum warning only once and bomb if fatal error 
//								// 	message('curr error ' || curr_error || ' level ' || curr_error_level);
//								if ( (!currError.isNull() && currError.greater(0)) && currErrorLevel.equals("F") )
//								{
//									cemMsg = substring(Sokcmsg.fSorlcurerrormsg(currErrorLevel, toStr("V"), currError), toInt(1), toInt(75));
//									setAlertMessageText(alertId, cemMsg);
//									alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//									if ( alertButton.equals(MessageServices.BUTTON1) )
//									{
//									}
//									if ( (lvBlock == null) )
//									{
//										goBlock(toStr("SORLCUR"));
//									}
//									else {
//										goBlock(toStr("SORLCUR_LITE"));
//									}
//									throw new ApplicationException();
//								}
//							}
//							//  only do check if severity level is F 
//							//  if the sorlcur lite block,  and its saaquik to also create the adm and recr, validate
//							//  curriculum
//							if ( !(lvBlock == null) )
//							{
//								//  do the following only for sorlcur lite 
//								if ( in(sobctrlRow.SobctrlAdmErrlvlInd, "W", "F").getValue() && isNull(getFormModel().getSCurricula().getCreateAdm(), "N").equals("Y") )
//								{
//									currError = toNumber(0);
//									base_rule_ref = new Ref<NNumber>(currRuleOut);
//									prim_roll_ind_ref = new Ref<NString>(primRollInd);
//									secd_roll_ind_ref = new Ref<NString>(secdRollInd);
//									majr_attach_ind_ref = new Ref<NString>(majrAttachInd);
//									conc_majr_attach_ind_ref = new Ref<NString>(concMajrAttachInd);
//									conc_base_attach_ind_ref = new Ref<NString>(concBaseAttachInd);
//									minr_attach_ind_ref = new Ref<NString>(minrAttachInd);
//									error_numb_ref = new Ref<NNumber>(currError);
//									Sokcurr.pCheckbase(toStr("A"), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()), sorlcurElement.getSorlcurCampCode(), sorlcurElement.getSorlcurCollCode(), sorlcurElement.getSorlcurDegcCode(), sorlcurElement.getSorlcurLevlCode(), sorlcurElement.getSorlcurProgram(), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
//									currRuleOut = base_rule_ref.val;
//									primRollInd = prim_roll_ind_ref.val;
//									secdRollInd = secd_roll_ind_ref.val;
//									majrAttachInd = majr_attach_ind_ref.val;
//									concMajrAttachInd = conc_majr_attach_ind_ref.val;
//									concBaseAttachInd = conc_base_attach_ind_ref.val;
//									minrAttachInd = minr_attach_ind_ref.val;
//									currError = error_numb_ref.val;
//									if ( sorlcurElement.getSorlcurCurrRule().isNull() && !currRuleOut.isNull() )
//									{
//										sorlcurElement.setSorlcurCurrRule(currRuleOut);
//									}
//									//  show curriculum warning only once and bomb if fatal error 
//									if ((!currError.isNull() && currError.greater(0)))
//									{
//										if ( sobctrlRow.SobctrlAdmErrlvlInd.equals("F") )
//										{
//											cemMsg = GNls.Fget(toStr("SOQOLIB-0078"), toStr("FORM"), toStr("Fatal curriculum error in creating application, student record not created."));
//										}
//										else {
//											cemMsg = GNls.Fget(toStr("SOQOLIB-0079"), toStr("FORM"), toStr("Warning, curriculum error in creating application."));
//										}
//										setAlertMessageText(alertId, cemMsg);
//										alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//										if ( alertButton.equals(MessageServices.BUTTON1) )
//										{
//										}
//										if ( sobctrlRow.SobctrlAdmErrlvlInd.equals("F") )
//										{
//											goBlock(toStr("SORLCUR_LITE"));
//											throw new ApplicationException();
//										}
//									}
//								}
//								if ( in(sobctrlRow.SobctrlRecErrlvlInd, "W", "F").getValue() && isNull(getFormModel().getSCurricula().getCreateRecr(), "N").equals("Y") )
//								{
//									currError = toNumber(0);
//									base_rule_ref = new Ref<NNumber>(currRuleOut);
//									prim_roll_ind_ref = new Ref<NString>(primRollInd);
//									secd_roll_ind_ref = new Ref<NString>(secdRollInd);
//									majr_attach_ind_ref = new Ref<NString>(majrAttachInd);
//									conc_majr_attach_ind_ref = new Ref<NString>(concMajrAttachInd);
//									conc_base_attach_ind_ref = new Ref<NString>(concBaseAttachInd);
//									minr_attach_ind_ref = new Ref<NString>(minrAttachInd);
//									error_numb_ref = new Ref<NNumber>(currError);
//									Sokcurr.pCheckbase(toStr("R"), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()), sorlcurElement.getSorlcurCampCode(), sorlcurElement.getSorlcurCollCode(), sorlcurElement.getSorlcurDegcCode(), sorlcurElement.getSorlcurLevlCode(), sorlcurElement.getSorlcurProgram(), base_rule_ref, prim_roll_ind_ref, secd_roll_ind_ref, majr_attach_ind_ref, conc_majr_attach_ind_ref, conc_base_attach_ind_ref, minr_attach_ind_ref, error_numb_ref);
//									currRuleOut = base_rule_ref.val;
//									primRollInd = prim_roll_ind_ref.val;
//									secdRollInd = secd_roll_ind_ref.val;
//									majrAttachInd = majr_attach_ind_ref.val;
//									concMajrAttachInd = conc_majr_attach_ind_ref.val;
//									concBaseAttachInd = conc_base_attach_ind_ref.val;
//									minrAttachInd = minr_attach_ind_ref.val;
//									currError = error_numb_ref.val;
//									//  show curriculum warning only once and bomb if fatal error 
//									if ((!currError.isNull() && currError.greater(0)))
//									{
//										if ( sobctrlRow.SobctrlRecErrlvlInd.equals("F") )
//										{
//											cemMsg = GNls.Fget(toStr("SOQOLIB-0080"), toStr("FORM"), toStr("Fatal curriculum error in creating recruit record, student record not created."));
//										}
//										else {
//											cemMsg = GNls.Fget(toStr("SOQOLIB-0081"), toStr("FORM"), toStr("Warning, curriculum error in creating recruit record."));
//										}
//										setAlertMessageText(alertId, cemMsg);
//										alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//										if ( alertButton.equals(MessageServices.BUTTON1) )
//										{
//										}
//										if ( sobctrlRow.SobctrlRecErrlvlInd.equals("F") )
//										{
//											goBlock(toStr("SORLCUR_LITE"));
//											throw new ApplicationException();
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.VALIDATE_LFOS_CURRICULUM_RULES
		 DECLARE
	lv_block                BLOCK;
  alert_button            number := 0;
  alert_id                ALERT := FIND_ALERT('CURRICULUM_ERROR');
  cem_msg                 varchar2(2000) := '';   
  curr_rule_out           sorlcur.sorlcur_curr_rule%TYPE  ;
  lv_conc_attach_rule_out number; 
  curr_error_level        sobctrl.sobctrl_stu_errlvl_ind%TYPE;
  major_dept_msg          varchar2(100); 
  curr_error              number := 0;
  cmjr_rule               sorlfos.sorlfos_lfos_rule%TYPE := 0;
  
  save_item               varchar2(50);
  save_rec                number := 0;
  rec_cnt                 number := 0;
  recs                    number := 0;
  
  sobctrl_row            sobctrl%ROWTYPE;
  CURSOR sobctrl_c IS
  select * from sobctrl;
  
  majr_cd   sotlfos.sotlfos_majr_code%type;
  seqno_no  sotlfos.sotlfos_seqno%type;
  dept_cd  sotlfos.sotlfos_dept_code%type;
  cursor sotlfos_c (p_lfst_code sorlfos.sorlfos_lfst_code%type, 
       p_priority_no sorlfos.sorlfos_priority_no%type default null,
       p_majr_code sorlfos.sorlfos_majr_code%type default null) is 
    select od.sotlfos_majr_code, od.sotlfos_seqno, od.sotlfos_dept_code
    from  sobcact, sotlfos od
    where sobcact_cact_code = od.sotlfos_cact_code
    and  sobcact_active_ind = 'Y'
    and  od.sotlfos_pidm = :sorlcur_pidm
    and  od.sotlfos_priority_no = nvl(p_priority_no,od.sotlfos_priority_no)
    and  od.sotlfos_majr_code = nvl(p_majr_code,od.sotlfos_majr_code)
    and  od.sotlfos_lfst_code = p_lfst_code 
    and  od.sotlfos_lcur_seqno = :sorlfos_lcur_seqno 
    and  od.sotlfos_seqno = ( select max(mx.sotlfos_seqno) 
      from sotlfos mx 
      where mx.sotlfos_lfst_code = p_lfst_code
      and mx.sotlfos_pidm = :sorlcur_pidm
      and mx.sotlfos_priority_no = od.sotlfos_priority_no 
      and mx.sotlfos_lcur_seqno = :sorlfos_lcur_seqno);
  
BEGIN
  if :lcur_sobctrl_curr_rule_ind <> 'Y' then
  	 return;
  end if; 

 	lv_block := find_block('SORLFOS_LITE');
 	if :system.cursor_item is not null then 
    save_item := :system.cursor_item;  
 	else 
 		save_item := 'sorlfos_lfst_code';
 	end if;
  save_rec := nvl(:system.cursor_record,1);
  
  OPEN sobctrl_c;
  FETCH sobctrl_c into sobctrl_row;
  CLOSE sobctrl_c;

 <multilinecomment> check the curriculum now to populate curr rule and roll ind </multilinecomment>
  CASE :sorlcur_lmod_code
     WHEN sb_curriculum_str.f_ADMISSIONS  THEN 
       curr_error_level := sobctrl_row.sobctrl_adm_errlvl_ind;
     WHEN sb_curriculum_str.f_RECRUIT THEN
       curr_error_level := sobctrl_row.sobctrl_rec_errlvl_ind;
     WHEN  sb_curriculum_str.f_LEARNER THEN
       curr_error_level := sobctrl_row.sobctrl_stu_errlvl_ind;
     WHEN sb_curriculum_str.f_OUTCOME THEN
       curr_error_level := sobctrl_row.sobctrl_his_errlvl_ind;
     else
       null;
   END CASE;
      
   :system.message_level := '5';
   IF ID_NULL(lv_block) THEN
    	 if :system.current_block <> 'SORLFOS' then 
         	 -- go_block('sorlfos');
         	 go_item('sorlfos_lfst_code');
        	 g$_check_failure;
        	 -- execute this trigger here so the defaults will occur before
        	 -- the validation 
        	 
        	 execute_trigger('when-new-record-instance');
       end if;
    else 
   	 	if :system.current_block <> 'SORLFOS_LITE' then 
        	 go_block('sorlfos_lite'); 
        	 g$_check_failure;
       end if;
   end if;
    
   if :system.last_record <> 'TRUE' then 
      last_record;
   end if;
   rec_cnt := :system.cursor_record;
   first_record;
   :system.message_level := '0';
   FOR recs in 1..rec_cnt  LOOP
    	-- first check for nulls 
     	if :sovlfos_rowid is null then 
    		 execute_trigger('check_for_lfos_nulls');
    		 g$_check_failure;
     	end if; 
     	
   
    	-- next make sure concentrations with attached majors, that the major is for real 
	    if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration and 
    	    	:sorlfos_majr_code_attach is not null
    	    	 and sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y' then
    	    	
    	    	-- is the current curriculum for the priority ?
    	    	open sotlfos_c (p_lfst_code => sb_fieldofstudy_str.f_concentration,
    	    	   p_priority_no => :sorlfos_priority_no);
    	    	fetch sotlfos_c into majr_cd, seqno_no, dept_cd;
    	    	if sotlfos_c%notfound then 
    	    		 seqno_no := 0;
    	    		 majr_cd := null;
    	    	end if; 
    	    	close sotlfos_c; 
    	    	if seqno_no = :sorlfos_seqno then  
    	    	
    	    	-- is the attached major current and active
      	    	 
      	    	open sotlfos_c (p_lfst_code => sb_fieldofstudy_str.f_major,
      	    	   p_majr_code => :sorlfos_majr_code_attach);
      	    	fetch sotlfos_c into majr_cd, seqno_no, dept_cd;
      	    	if sotlfos_c%notfound  then 
      	    		close sotlfos_c;
      	    		message(g$_nls.get('SOQOLIB-0082', 'FORM','*ERROR* Major to which the concentration is attached is no longer current and active.'));
      	    		raise form_trigger_failure;
      	    	else 
      	       close sotlfos_c;
      	    	end if;   
    	    	end if;  -- concentration is current 
    	    	
    	    	-- update the major rule in conc attach rule 
    	    
    	     IF :sovlfos_rowid is null  then 
    	      --- 7.4.0.1 check if the rule is blank 
    	     if :sorlfos_conc_attach_rule is null then  
    	      IF :lcur_temp_rule_ind  = 'Y' THEN
    	    	cmjr_rule := sokcurr.F_SorcmjrRule
             (curr_rule => curr_rule_out,
              majr_attach_ind => 'Y',
              major => :sorlfos_majr_code_attach,
              dept => dept_cd,
              term => nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code)),
              module => :module_ind);
           
            if cmjr_rule <> :sorlfos_conc_attach_rule and
            	cmjr_rule is not null   then 
            	:sorlfos_conc_attach_rule := cmjr_rule;
            end if; 
            
           end if; -- temp rule 
    	    end if; --- conc attach rule 
         end if; -- lfos rowid is null 
   	    	
       end if;  -- lfos is for a concentration
        	    
      -- verifiy curriculum rule if curriculum is turned on 
       IF sobctrl_row.sobctrl_curr_rule_ind  ='Y' and :lcur_temp_rule_ind = 'Y' and 
		   	 :global.init_curr_term <  :s$_curricula.module_term_code THEN
  
    ---  IF :lcur_temp_rule_ind  ='Y' THEN
            
		     	if :sovlfos_rowid is null and 
		     		sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y' THEN
		        if curr_error_level in ( 'F','W') then 
				        curr_error := 0;
				        if :sorlfos_conc_attach_rule is not null then
				        	lv_conc_attach_rule_out := :sorlfos_conc_attach_rule;
				        elsif cmjr_rule is not null then
				        	lv_conc_attach_rule_out := cmjr_rule;
				        else 
				        	lv_conc_attach_rule_out := null;
				        end if;
				      
				        sokcurr.P_checklfos (
				          :sorlcur_lmod_code,
				          :sorlcur_curr_rule,
				          :sorlfos_lfst_code,
				          nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)),
				          :sorlfos_majr_code,
				          :sorlfos_dept_code,
				        --   p_lfos_rule => curr_rule_out,
                --   p_conc_attach_rule => cmjr_rule, <multilinecomment> Defect 1-X8RB7: Use new rule. </multilinecomment>
				          curr_rule_out,
				          lv_conc_attach_rule_out,				          			          
				          curr_error);
				       
				       
				       --- 7.4.0.1 only update if its blank 
				       if :sorlfos_lfos_rule is null and curr_rule_out is not null then 
				       	  :sorlfos_lfos_rule := curr_rule_out;
				       end if; 
		     
				    --- show curriculum warning only once and bomb if fatal error 
						   if ( curr_error is not null and curr_error > 0 ) and 
						    	curr_error_level = 'F' then
						   	 	major_dept_msg := ': ' || :sorlfos_majr_code;
					        if :sorlfos_dept_code is not null then 
					        	 major_dept_msg := major_dept_msg || ' Department: ' || :sorlfos_dept_code;
					        end if; 
					        cem_msg :=  sokcmsg.F_SorlcurErrorMsg(curr_error_level, 'V',
					   	                          curr_error)   || major_dept_msg ;
							    Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
						 	    alert_button := show_alert('CURRICULUM_ERROR');
							    if alert_button = ALERT_BUTTON1 then
							       null;
							    end if;
						   	  raise form_trigger_failure;
						   end if;
				  end if; -- severity level is F or W, only display error if F
			   ----- saaquik only 
					if NOT ID_NULL(lv_block) THEN  -- do the following only for sorlcur lite 
		         	if sobctrl_row.sobctrl_adm_errlvl_ind in ('W', 'F') and 
		      		 nvl(:s$_curricula.create_adm, 'N') = 'Y' then 
				        curr_error := 0;
				        if :sorlfos_conc_attach_rule is not null then
				        	lv_conc_attach_rule_out := :sorlfos_conc_attach_rule;
				        else
				        	lv_conc_attach_rule_out := null;
				        end if;
				        sokcurr.P_checklfos (
				          sb_curriculum_str.f_admissions,
				          :sorlcur_curr_rule,
				          :sorlfos_lfst_code,
				          nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)),
				          :sorlfos_majr_code,
				          :sorlfos_dept_code,
				          curr_rule_out,
				          lv_conc_attach_rule_out,
				          curr_error);
				         --- 7.4.0.1 only update if its blank 
		            if :sorlfos_lfos_rule is null and curr_rule_out is not null then 
				       	  :sorlfos_lfos_rule := curr_rule_out;
				        end if; 
		       
				      -- show curriculum warning only once and bomb if fatal error 
						    if ( curr_error is not null and curr_error > 0 ) then 
						   	 	  major_dept_msg := ': ' || :sorlfos_majr_code;
					        if :sorlfos_dept_code is not null then 
					        	 major_dept_msg := major_dept_msg || ' Department: ' || :sorlfos_dept_code;
					        end if; 
					       	if sobctrl_row.sobctrl_adm_errlvl_ind = 'F' then
						  		cem_msg := g$_nls.get('SOQOLIB-0083', 'FORM',
						  		  'Fatal curriculum error with application %01% student record not created.',
						  		   major_dept_msg);
						  	 else 
						  		cem_msg :=  g$_nls.get('SOQOLIB-0084', 'FORM',
						  		'Warning, curriculum error in creating application %01%', major_dept_msg);
						    	end if;
							   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
						 	   alert_button := show_alert('CURRICULUM_ERROR');
						    	 
							   if alert_button = ALERT_BUTTON1 then
							       null;
							   end if;
							   if sobctrl_row.sobctrl_adm_errlvl_ind = 'F' then
							   	   go_block('sorlfos_lite');
							    	 raise form_trigger_failure;
						   	 END IF;
						   end if;
		         	end if; -- check admissions 
		        	if sobctrl_row.sobctrl_rec_errlvl_ind in ('W', 'F') and 
		      		 nvl(:s$_curricula.create_recr, 'N') = 'Y' then 
                curr_error := 0;
                if :sorlfos_conc_attach_rule is not null then
				        	lv_conc_attach_rule_out := :sorlfos_conc_attach_rule;
				        else
				        	lv_conc_attach_rule_out := null;
				        end if;
				        sokcurr.P_checklfos (
				          sb_curriculum_str.f_recruit,
				          :sorlcur_curr_rule,
				          :sorlfos_lfst_code,
				          nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)),
				          :sorlfos_majr_code,
				          :sorlfos_dept_code,
				          curr_rule_out,
				          lv_conc_attach_rule_out,
				          curr_error);
				         --- 7.4.0.1 only update if its blank 
		            if :sorlfos_lfos_rule is null and curr_rule_out is not null then 
				       	  :sorlfos_lfos_rule := curr_rule_out;
				        end if; 

		      
				      -- show curriculum warning only once and bomb if fatal error 
						    if ( curr_error is not null and curr_error > 0 ) then
						   	 	  major_dept_msg := ': ' || :sorlfos_majr_code;
					        if :sorlfos_dept_code is not null then 
					        	 major_dept_msg := major_dept_msg || ' Department: ' || :sorlfos_dept_code;
					        end if; 
					       	if sobctrl_row.sobctrl_rec_errlvl_ind = 'F' then
						  		cem_msg := g$_nls.get('SOQOLIB-0085', 'FORM',
						  		  'Fatal curriculum error with recruit %01% student record not created.',
						  		     major_dept_msg);
						  	 else 
						  		cem_msg :=  g$_nls.get('SOQOLIB-0086', 'FORM',
						  		'Warning, curriculum error in creating recruit %01%', 
						  		   major_dept_msg);
						    	end if;
							   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
						 	   alert_button := show_alert('CURRICULUM_ERROR');
						    	 
							   if alert_button = ALERT_BUTTON1 then
							       null;
							   end if;
							   if sobctrl_row.sobctrl_rec_errlvl_ind = 'F' then
							   	   go_block('sorlfos_lite');
							    	 raise form_trigger_failure;
						   	 END IF;
						   end if;
		         	end if; -- check recruit 

		         	end if; -- sorlfos lite block 
		      	end if; -- new record, rowid is null
					end if; -- curriculum is turned on 
	        IF :System.Last_Record <> 'TRUE' THEN 
           	next_record;
	        end if;
      END LOOP; -- loop thru records 
      
      go_item(save_item);
      if save_item like 'SORLFOS%' then 
        go_record(save_rec);
      end if; 
 END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.VALIDATE_LFOS_CURRICULUM_RULES
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="VALIDATE_LFOS_CURRICULUM_RULES")
//		public void Soqolib_ValidateLfosCurriculumRules()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
//				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					BlockDescriptor lvBlock= null;
//					NNumber alertButton = toNumber(0);
//					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
//					NString cemMsg = toStr("");
//					NNumber currRuleOut= NNumber.getNull();
//					NNumber lvConcAttachRuleOut= NNumber.getNull();
//					NString currErrorLevel= NString.getNull();
//					NString majorDeptMsg= NString.getNull();
//					NNumber currError = toNumber(0);
//					NNumber cmjrRule = toNumber(0);
//					NString saveItem= NString.getNull();
//					NNumber saveRec = toNumber(0);
//					NNumber recCnt = toNumber(0);
//					NNumber recs = toNumber(0);
//					SobctrlRow sobctrlRow= null;
//					String sqlsobctrlC = "SELECT * " +
//	" FROM sobctrl ";
//					DataCursor sobctrlC = new DataCursor(sqlsobctrlC);
//					NString majrCd= NString.getNull();
//					NNumber seqnoNo= NNumber.getNull();
//					NString deptCd= NString.getNull();
//					String sqlsotlfosC = "SELECT od.sotlfos_majr_code, od.sotlfos_seqno, od.sotlfos_dept_code " +
//	" FROM sobcact, sotlfos od " +
//	" WHERE sobcact_cact_code = od.sotlfos_cact_code AND sobcact_active_ind = 'Y' AND od.sotlfos_pidm = :SORLCUR_PIDM AND od.sotlfos_priority_no = nvl(:P_P_PRIORITY_NO, od.sotlfos_priority_no) AND od.sotlfos_majr_code = nvl(:P_P_MAJR_CODE, od.sotlfos_majr_code) AND od.sotlfos_lfst_code = :P_P_LFST_CODE AND od.sotlfos_lcur_seqno = :SORLFOS_LCUR_SEQNO AND od.sotlfos_seqno = (SELECT max(mx.sotlfos_seqno) " +
//		" FROM sotlfos mx " +
//		" WHERE mx.sotlfos_lfst_code = :P_P_LFST_CODE AND mx.sotlfos_pidm = :SORLCUR_PIDM AND mx.sotlfos_priority_no = od.sotlfos_priority_no AND mx.sotlfos_lcur_seqno = :SORLFOS_LCUR_SEQNO ) ";
//					DataCursor sotlfosC = new DataCursor(sqlsotlfosC);
//					NString pLfstCode = NString.getNull();
//					NString pPriorityNo = NString.getNull();
//					NString pMajrCode = NString.getNull();
//					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().notEquals("Y") )
//					{
//						return ;
//					}
//					lvBlock = findBlock("SORLFOS_LITE");
//					if ( (getCursorItem()) != null )
//					{
//						saveItem = toStr(getCursorItem());
//					}
//					else {
//						saveItem = toStr("sorlfos_lfst_code");
//					}
//					saveRec = isNull(getCursorRecord(), 1);
//					//F2J_WARNING : Make sure that the method "Close" is being called over the variable sobctrlC.
//					sobctrlC.open();
//					sobctrlRow = sobctrlC.fetchRow();
//					sobctrlC.close();
//					//  check the curriculum now to populate curr rule and roll ind 
//					if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fAdmissions()))
//					{
//						currErrorLevel = sobctrlRow.SobctrlAdmErrlvlInd;
//					}
//					else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fRecruit()))
//					{
//						currErrorLevel = sobctrlRow.SobctrlRecErrlvlInd;
//					}
//					else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()))
//					{
//						currErrorLevel = sobctrlRow.SobctrlStuErrlvlInd;
//					}
//					else if (sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()))
//					{
//						currErrorLevel = sobctrlRow.SobctrlHisErrlvlInd;
//					}
//					else {
//					}
//					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
//					if ( (lvBlock == null) )
//					{
//						if ( getCurrentBlock().notEquals("SORLFOS") )
//						{
//							//  go_block('sorlfos');
//							goItem(toStr("sorlfos_lfst_code"));
//							getContainer().getGoqrpls().gCheckFailure();
//							//  execute this trigger here so the defaults will occur before
//							//  the validation 
//							executeAction("when-new-record-instance");
//						}
//					}
//					else {
//						if ( getCurrentBlock().notEquals("SORLFOS_LITE") )
//						{
//							goBlock(toStr("sorlfos_lite"));
//							getContainer().getGoqrpls().gCheckFailure();
//						}
//					}
//					if ( !isInLastRecord() )
//					{
//						lastRecord();
//					}
//					recCnt = getCursorRecord();
//					firstRecord();
//					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
//					for ( recs = 1; recs <= recCnt; recs+= 1 )
//					{
//						//  first check for nulls 
//						if ( sorlfosElement.getSovlfosRowid().isNull() )
//						{
//							executeAction("check_for_lfos_nulls");
//							getContainer().getGoqrpls().gCheckFailure();
//						}
//						//  next make sure concentrations with attached majors, that the major is for real 
//						if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) && !sorlfosElement.getSorlfosMajrCodeAttach().isNull() && SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") )
//						{
//							//  is the current curriculum for the priority ?
//							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//							pLfstCode= : SbFieldofstudyStr.fConcentration()SbFieldofstudyStr.fConcentration();
//							pPriorityNo= : sorlfosElement.getSorlfosPriorityNo()sorlfosElement.getSorlfosPriorityNo();
//							pMajrCode=;
//							//Setting query parameters
//							sotlfosC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
//							sotlfosC.addParameter("P_P_PRIORITY_NO", pPriorityNo);
//							sotlfosC.addParameter("P_P_MAJR_CODE", pMajrCode);
//							sotlfosC.addParameter("P_P_LFST_CODE", pLfstCode);
//							sotlfosC.addParameter("SORLFOS_LCUR_SEQNO", sorlfosElement.getSorlfosLcurSeqno());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable sotlfosC.
//							sotlfosC.open();
//							ResultSet sotlfosCResults = sotlfosC.fetchInto();
//							if ( sotlfosCResults != null ) {
//								majrCd = sotlfosCResults.getStr(0);
//								seqnoNo = sotlfosCResults.getNumber(1);
//								deptCd = sotlfosCResults.getStr(2);
//							}
//							if ( sotlfosC.notFound() )
//							{
//								seqnoNo = toNumber(0);
//								majrCd = toStr(null);
//							}
//							sotlfosC.close();
//							if ( seqnoNo.equals(sorlfosElement.getSorlfosSeqno()) )
//							{
//								//  is the attached major current and active
//								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//								pLfstCode= : SbFieldofstudyStr.fMajor()SbFieldofstudyStr.fMajor();
//								pPriorityNo= : sorlfosElement.getSorlfosMajrCodeAttach()sorlfosElement.getSorlfosMajrCodeAttach();
//								pMajrCode=;
//								//Setting query parameters
//								sotlfosC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
//								sotlfosC.addParameter("P_P_PRIORITY_NO", pPriorityNo);
//								sotlfosC.addParameter("P_P_MAJR_CODE", pMajrCode);
//								sotlfosC.addParameter("P_P_LFST_CODE", pLfstCode);
//								sotlfosC.addParameter("SORLFOS_LCUR_SEQNO", sorlfosElement.getSorlfosLcurSeqno());
//								//F2J_WARNING : Make sure that the method "Close" is being called over the variable sotlfosC.
//								sotlfosC.open();
//								ResultSet sotlfosCResults = sotlfosC.fetchInto();
//								if ( sotlfosCResults != null ) {
//									majrCd = sotlfosCResults.getStr(0);
//									seqnoNo = sotlfosCResults.getNumber(1);
//									deptCd = sotlfosCResults.getStr(2);
//								}
//								if ( sotlfosC.notFound() )
//								{
//									sotlfosC.close();
//									errorMessage(GNls.Fget(toStr("SOQOLIB-0082"), toStr("FORM"), toStr("*ERROR* Major to which the concentration is attached is no longer current and active.")));
//									throw new ApplicationException();
//								}
//								else {
//									sotlfosC.close();
//								}
//							}
//							//  concentration is current 
//							//  update the major rule in conc attach rule 
//							if ( sorlfosElement.getSovlfosRowid().isNull() )
//							{
//								// - 7.4.0.1 check if the rule is blank 
//								if ( sorlfosElement.getSorlfosConcAttachRule().isNull() )
//								{
//									if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") )
//									{
//										// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//										cmjrRule = Sokcurr.fSorcmjrrule(/*currRule=>*/currRuleOut, /*majrAttachInd=>*/"Y", /*major=>*/sorlfosElement.getSorlfosMajrCodeAttach(), /*dept=>*/deptCd, /*term=>*/isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())), /*module=>*/getFormModel().getSCurrProcBlock().getModuleInd());
//										if ( cmjrRule.notEquals(sorlfosElement.getSorlfosConcAttachRule()) && !cmjrRule.isNull() )
//										{
//											sorlfosElement.setSorlfosConcAttachRule(cmjrRule);
//										}
//									}
//								}
//							}
//						}
//						//  lfos is for a concentration
//						//  verifiy curriculum rule if curriculum is turned on 
//						if ( sobctrlRow.SobctrlCurrRuleInd.equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") && getGlobal("INIT_CURR_TERM").lesser(getFormModel().getSCurricula().getModuleTermCode()) )
//						{
//							// -  IF :lcur_temp_rule_ind  ='Y' THEN
//							if ( sorlfosElement.getSovlfosRowid().isNull() && SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") )
//							{
//								if ( in(currErrorLevel, "F", "W").getValue() )
//								{
//									currError = toNumber(0);
//									if ( !sorlfosElement.getSorlfosConcAttachRule().isNull() )
//									{
//										lvConcAttachRuleOut = sorlfosElement.getSorlfosConcAttachRule();
//									}
//									else if ( !cmjrRule.isNull() ) {
//										lvConcAttachRuleOut = cmjrRule;
//									}
//									else {
//										lvConcAttachRuleOut = toNumber(null);
//									}
//									Ref<NNumber> p_lfos_rule_ref = new Ref<NNumber>(currRuleOut);
//									Ref<NNumber> p_conc_attach_rule_ref = new Ref<NNumber>(lvConcAttachRuleOut);
//									Ref<NNumber> err_number_ref = new Ref<NNumber>(currError);
//									Sokcurr.pChecklfos(sorlcurElement.getSorlcurLmodCode(), sorlcurElement.getSorlcurCurrRule(), sorlfosElement.getSorlfosLfstCode(), isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())), sorlfosElement.getSorlfosMajrCode(), sorlfosElement.getSorlfosDeptCode(), p_lfos_rule_ref, p_conc_attach_rule_ref, err_number_ref);
//									currRuleOut = p_lfos_rule_ref.val;
//									lvConcAttachRuleOut = p_conc_attach_rule_ref.val;
//									currError = err_number_ref.val;
//									// - 7.4.0.1 only update if its blank 
//									if ( sorlfosElement.getSorlfosLfosRule().isNull() && !currRuleOut.isNull() )
//									{
//										sorlfosElement.setSorlfosLfosRule(currRuleOut);
//									}
//									// - show curriculum warning only once and bomb if fatal error 
//									if ( (!currError.isNull() && currError.greater(0)) && currErrorLevel.equals("F") )
//									{
//										majorDeptMsg = toStr(": ").append(sorlfosElement.getSorlfosMajrCode());
//										if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
//										{
//											majorDeptMsg = majorDeptMsg.append(" Department: ").append(sorlfosElement.getSorlfosDeptCode());
//										}
//										cemMsg = Sokcmsg.fSorlcurerrormsg(currErrorLevel, toStr("V"), currError).append(majorDeptMsg);
//										setAlertMessageText(alertId, cemMsg);
//										alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//										if ( alertButton.equals(MessageServices.BUTTON1) )
//										{
//										}
//										throw new ApplicationException();
//									}
//								}
//								//  severity level is F or W, only display error if F
//								// --- saaquik only 
//								if ( !(lvBlock == null) )
//								{
//									//  do the following only for sorlcur lite 
//									if ( in(sobctrlRow.SobctrlAdmErrlvlInd, "W", "F").getValue() && isNull(getFormModel().getSCurricula().getCreateAdm(), "N").equals("Y") )
//									{
//										currError = toNumber(0);
//										if ( !sorlfosElement.getSorlfosConcAttachRule().isNull() )
//										{
//											lvConcAttachRuleOut = sorlfosElement.getSorlfosConcAttachRule();
//										}
//										else {
//											lvConcAttachRuleOut = toNumber(null);
//										}
//										p_lfos_rule_ref = new Ref<NNumber>(currRuleOut);
//										p_conc_attach_rule_ref = new Ref<NNumber>(lvConcAttachRuleOut);
//										err_number_ref = new Ref<NNumber>(currError);
//										Sokcurr.pChecklfos(SbCurriculumStr.fAdmissions(), sorlcurElement.getSorlcurCurrRule(), sorlfosElement.getSorlfosLfstCode(), isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())), sorlfosElement.getSorlfosMajrCode(), sorlfosElement.getSorlfosDeptCode(), p_lfos_rule_ref, p_conc_attach_rule_ref, err_number_ref);
//										currRuleOut = p_lfos_rule_ref.val;
//										lvConcAttachRuleOut = p_conc_attach_rule_ref.val;
//										currError = err_number_ref.val;
//										// - 7.4.0.1 only update if its blank 
//										if ( sorlfosElement.getSorlfosLfosRule().isNull() && !currRuleOut.isNull() )
//										{
//											sorlfosElement.setSorlfosLfosRule(currRuleOut);
//										}
//										//  show curriculum warning only once and bomb if fatal error 
//										if ((!currError.isNull() && currError.greater(0)))
//										{
//											majorDeptMsg = toStr(": ").append(sorlfosElement.getSorlfosMajrCode());
//											if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
//											{
//												majorDeptMsg = majorDeptMsg.append(" Department: ").append(sorlfosElement.getSorlfosDeptCode());
//											}
//											if ( sobctrlRow.SobctrlAdmErrlvlInd.equals("F") )
//											{
//												cemMsg = GNls.Fget(toStr("SOQOLIB-0083"), toStr("FORM"), toStr("Fatal curriculum error with application %01% student record not created."), majorDeptMsg);
//											}
//											else {
//												cemMsg = GNls.Fget(toStr("SOQOLIB-0084"), toStr("FORM"), toStr("Warning, curriculum error in creating application %01%"), majorDeptMsg);
//											}
//											setAlertMessageText(alertId, cemMsg);
//											alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//											if ( alertButton.equals(MessageServices.BUTTON1) )
//											{
//											}
//											if ( sobctrlRow.SobctrlAdmErrlvlInd.equals("F") )
//											{
//												goBlock(toStr("sorlfos_lite"));
//												throw new ApplicationException();
//											}
//										}
//									}
//									//  check admissions 
//									if ( in(sobctrlRow.SobctrlRecErrlvlInd, "W", "F").getValue() && isNull(getFormModel().getSCurricula().getCreateRecr(), "N").equals("Y") )
//									{
//										currError = toNumber(0);
//										if ( !sorlfosElement.getSorlfosConcAttachRule().isNull() )
//										{
//											lvConcAttachRuleOut = sorlfosElement.getSorlfosConcAttachRule();
//										}
//										else {
//											lvConcAttachRuleOut = toNumber(null);
//										}
//										p_lfos_rule_ref = new Ref<NNumber>(currRuleOut);
//										p_conc_attach_rule_ref = new Ref<NNumber>(lvConcAttachRuleOut);
//										err_number_ref = new Ref<NNumber>(currError);
//										Sokcurr.pChecklfos(SbCurriculumStr.fRecruit(), sorlcurElement.getSorlcurCurrRule(), sorlfosElement.getSorlfosLfstCode(), isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())), sorlfosElement.getSorlfosMajrCode(), sorlfosElement.getSorlfosDeptCode(), p_lfos_rule_ref, p_conc_attach_rule_ref, err_number_ref);
//										currRuleOut = p_lfos_rule_ref.val;
//										lvConcAttachRuleOut = p_conc_attach_rule_ref.val;
//										currError = err_number_ref.val;
//										// - 7.4.0.1 only update if its blank 
//										if ( sorlfosElement.getSorlfosLfosRule().isNull() && !currRuleOut.isNull() )
//										{
//											sorlfosElement.setSorlfosLfosRule(currRuleOut);
//										}
//										//  show curriculum warning only once and bomb if fatal error 
//										if ((!currError.isNull() && currError.greater(0)))
//										{
//											majorDeptMsg = toStr(": ").append(sorlfosElement.getSorlfosMajrCode());
//											if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
//											{
//												majorDeptMsg = majorDeptMsg.append(" Department: ").append(sorlfosElement.getSorlfosDeptCode());
//											}
//											if ( sobctrlRow.SobctrlRecErrlvlInd.equals("F") )
//											{
//												cemMsg = GNls.Fget(toStr("SOQOLIB-0085"), toStr("FORM"), toStr("Fatal curriculum error with recruit %01% student record not created."), majorDeptMsg);
//											}
//											else {
//												cemMsg = GNls.Fget(toStr("SOQOLIB-0086"), toStr("FORM"), toStr("Warning, curriculum error in creating recruit %01%"), majorDeptMsg);
//											}
//											setAlertMessageText(alertId, cemMsg);
//											alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
//											if ( alertButton.equals(MessageServices.BUTTON1) )
//											{
//											}
//											if ( sobctrlRow.SobctrlRecErrlvlInd.equals("F") )
//											{
//												goBlock(toStr("sorlfos_lite"));
//												throw new ApplicationException();
//											}
//										}
//									}
//								}
//							}
//						}
//						//  curriculum is turned on 
//						if ( !isInLastRecord() )
//						{
//							nextRecord();
//						}
//					}
//					//  loop thru records 
//					goItem(saveItem);
//					if ( like(saveItem, "SORLFOS%") )
//					{
//						setCurrentRecord(saveRec);
//					}
//				}
//			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CURR_CONC_HELP
		 --  CURR_CONC_OPTIONS  trigger
--   option titles for  concentrations for first major 
declare 
	test_curr varchar2(30) := '';
	
			-- see if the concentration is attached  to the base
  lv_attach_base varchar2(1) := null; 
	cursor conc_base_c is 
	   select 'Y'
	   from sorccon bs
	   where  bs.sorccon_cmjr_rule is null 
	    and (decode(bs.sorccon_rec_ind,'Y','R') = :module_ind
	     or decode(bs.sorccon_adm_ind,'Y','A') = :module_ind
	     or decode(bs.sorccon_his_ind,'Y','H') = :module_ind
	     or decode(bs.sorccon_stu_ind,'Y','S') = :module_ind
	     or decode(bs.sorccon_dau_ind,'Y','M') = :module_ind) 
	   and bs.sorccon_majr_code_conc = :sorlfos_majr_code 
	   and bs.sorccon_curr_rule = nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule)
	   and bs.sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = bs.sorccon_curr_rule
				 and m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))) ;

   
begin 

if  :lcur_temp_rule_ind = 'N' then
   execute_trigger('invalid_lcur_msg');
   do_key('LIST_VALUES');
else
  if :lcur_sobctrl_curr_rule_ind = 'Y' then

    if nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule) is null then
       message( G$_NLS.Get('SOQOLIB-0087', 'FORM','No Primary Base Curriculum Established.') );
    else
      execute_trigger('lfos_check_base');
      
   	  if :lfos_concmajr_attach_ind = 'Y' or :lfos_concbase_attach_ind = 'Y' then  
          <multilinecomment> show attached conc to base rule and major </multilinecomment>   
          :s$_curricula.hold_curr_rule := nvl(:sorlcur_curr_rule, :temp_sorlcur_curr_rule);
          :s$_curricula.hold_term_ctlg := nvl(:sorlfos_term_code_ctlg, nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code));
                    
          set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_LFOS_CONC_LOV'); 
      else  
          <multilinecomment> curr rule does not have attached concentrations </multilinecomment>
          set_item_property('SORLFOS_MAJR_CODE',LOV_NAME,'STVMAJR_CONC_LOV');
      end if;
      default_value('','GLOBAL.ATTACHED_MAJOR');
      default_value('','GLOBAL.LFOS_CONC_RULE');  
       
      :global.value := null; 
      :global.sel_ind := null; 
      g$_display_lov('','');
      g$_check_failure;
      if :global.value is not null then 
          :sorlfos_majr_code := :global.value;
         	:sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code); 
          :sorlfos_majr_code_attach := :global.attached_major;
          :sorlfos_conc_attach_rule := :global.lfos_conc_rule;
         	if :sorlfos_majr_code_attach is not null  then 
       		 :sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);
         	else 
       
         		open conc_base_c;
			   	  fetch conc_base_c into lv_attach_base;
			   	  -- if conc. is attached to the base then disable the major attach lov and make
			   	  -- it non updateable 
			   	  if conc_base_c%found then 
			   	  	:sorlfos_majr_code_attach := null;
			   	  	:sorlfos_attach_conc_desc := null;
			   	  	set_item_property('SORLFOS_MAJR_CODE_ATTACH',enabled,property_false);
					   	set_item_property('SORLFOS_MAJR_CODE_ATTACH',navigable,property_false);
					   	set_item_property('SORLFOS_MAJR_CODE_ATTACH_LBT',enabled,property_false);
					   	go_item('sorlfos_dept_code'); 
			   	  end if;
			   	  close conc_base_c;
          end if; 
      end if;
      :global.sel_ind := null; 
      :global.value := null;
      :global.attached_major := null;
   end if;
 else
   execute_trigger('invalid_lcur_msg');
   do_key('LIST_VALUES');
 end if;
end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CURR_CONC_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CURR_CONC_HELP")
		public void Soqolib_LfosCurrConcHelp()
		{
			
				//   CURR_CONC_OPTIONS  trigger
				//    option titles for  concentrations for first major 

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NString testCurr = toStr("");
					//  see if the concentration is attached  to the base
					NString lvAttachBase = NString.getNull();
					String sqlconcBaseC = "SELECT 'Y' " +
	" FROM sorccon bs " +
	" WHERE bs.sorccon_cmjr_rule IS NULL AND (decode(bs.sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bs.sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bs.sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bs.sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bs.sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND bs.sorccon_majr_code_conc = :SORLFOS_MAJR_CODE AND bs.sorccon_curr_rule = nvl(:SORLCUR_CURR_RULE, :TEMP_SORLCUR_CURR_RULE) AND bs.sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = bs.sorccon_curr_rule AND m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concBaseC = new DataCursor(sqlconcBaseC);
					if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
					{
						executeAction("invalid_lcur_msg");
						executeAction("LIST_VALUES");
					}
					else {
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
						{
							if ( isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()).isNull() )
							{
								warningMessage(GNls.Fget(toStr("SOQOLIB-0087"), toStr("FORM"), toStr("No Primary Base Curriculum Established.")));
							}
							else {
								executeAction("lfos_check_base");
								if ( sorlcurElement.getLfosConcmajrAttachInd().equals("Y") || sorlcurElement.getLfosConcbaseAttachInd().equals("Y") )
								{
									//  show attached conc to base rule and major 
									getFormModel().getSCurricula().setHoldCurrRule(isNull(sorlcurElement.getSorlcurCurrRule(), sorlcurElement.getTempSorlcurCurrRule()));
									getFormModel().getSCurricula().setHoldTermCtlg(isNull(sorlfosElement.getSorlfosTermCodeCtlg(), isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode())));
									setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_LFOS_CONC_LOV");
								}
								else {
									//  curr rule does not have attached concentrations 
									setItemLovName("SORLFOS_MAJR_CODE", "STVMAJR_CONC_LOV");
								}
								setDefaultValue("", "GLOBAL.ATTACHED_MAJOR");
								setDefaultValue("", "GLOBAL.LFOS_CONC_RULE");
								setGlobal("VALUE", toStr(null));
								setGlobal("SEL_IND", toStr(null));
								getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
								getContainer().getGoqrpls().gCheckFailure();
								if ( !getGlobal("VALUE").isNull() )
								{
									sorlfosElement.setSorlfosMajrCode(getGlobal("VALUE"));
									sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
									sorlfosElement.setSorlfosMajrCodeAttach(getGlobal("ATTACHED_MAJOR"));
									sorlfosElement.setSorlfosConcAttachRule(toNumber(getGlobal("LFOS_CONC_RULE")));
									if ( !sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
									{
										sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
									}
									else {
										//Setting query parameters
										concBaseC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
										concBaseC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
										concBaseC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
										concBaseC.addParameter("TEMP_SORLCUR_CURR_RULE", sorlcurElement.getTempSorlcurCurrRule());
										concBaseC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
										concBaseC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
										concBaseC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
										//F2J_WARNING : Make sure that the method "Close" is being called over the variable concBaseC.
										concBaseC.open();
										ResultSet concBaseCResults = concBaseC.fetchInto();
										if ( concBaseCResults != null ) {
											lvAttachBase = concBaseCResults.getStr(0);
										}
										//  if conc. is attached to the base then disable the major attach lov and make
										//  it non updateable 
										if ( concBaseC.found() )
										{
											sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
											sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
											setItemEnabled("SORLFOS_MAJR_CODE_ATTACH", false);
											setItemNavigable("SORLFOS_MAJR_CODE_ATTACH", false);
											setItemEnabled("SORLFOS_MAJR_CODE_ATTACH_LBT", false);
											goItem(toStr("sorlfos_dept_code"));
										}
										concBaseC.close();
									}
								}
								setGlobal("SEL_IND", toStr(null));
								setGlobal("VALUE", toStr(null));
								setGlobal("ATTACHED_MAJOR", toStr(null));
							}
						}
						else {
							executeAction("invalid_lcur_msg");
							executeAction("LIST_VALUES");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.POPULATE_SOTLCUR
		 declare 
	lv_lcur_seqno sorlfos.sorlfos_lcur_seqno%type := 0;
	lv_lfos_seqno sorlfos.sorlfos_seqno%type := 0;
	lv_prior      sorlfos.sorlfos_priority_no%type := 0; 
	lv_cact_code  sorlfos.sorlfos_cact_code%type := null; 
	lv_lfst_code  sorlfos.sorlfos_lfst_code%type := null; 
	lv_majr_code  sorlfos.sorlfos_majr_code%type := null;
	lv_dept_code  sorlfos.sorlfos_dept_code%type := null;	
	lv_term_code  sorlfos.sorlfos_term_code%type := null; 
	
	CURSOR sorlcur_c is 
	  select  
	  sorlcur_priority_no, sorlcur_seqno, 
	  sorlcur_cact_code , sorlcur_term_code
	  from sorlcur
	  where sorlcur_pidm = :s$_curricula.module_pidm
	  and sorlcur_lmod_code = :s$_curricula.module_code 
	   and ( (sorlcur_key_seqno = :s$_curricula.module_key_seqno
            and sorlcur_lmod_code in ( sb_curriculum_str.f_recruit,
              sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome))
            or ( sorlcur_lmod_code = sb_curriculum_str.f_learner )  ) 
	  and ( ( sorlcur_term_code = :s$_curricula.module_term_code 
	  and sorlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions) ) or 
	  (sorlcur_lmod_code = sb_curriculum_str.f_learner  and
	     sorlcur_term_code < :s$_curricula.module_end_term)
	     or ( sorlcur_lmod_code = sb_curriculum_str.f_outcome )); 
	  
	CURSOR sorlfos_c IS
	  select sorlfos_seqno, sorlfos_priority_no, 
	   sorlfos_cact_code , sorlfos_lfst_code,
	   sorlfos_majr_code, sorlfos_dept_code
	  from sorlfos
	  where sorlfos_pidm = :s$_curricula.module_pidm
	  and sorlfos_lcur_seqno = lv_lcur_seqno; 

begin 
    soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm);
    soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm);
	  :s$_curricula.original_sorlcur_count := 0;  
 
	  
	  open sorlcur_c;
	  loop
	  	fetch sorlcur_c into lv_prior, lv_lcur_seqno, lv_cact_code, lv_term_code;
	  	exit when sorlcur_c%notfound;
	  	
	  	soklcur.p_create_sotlcur(
       p_pidm =>:s$_curricula.module_pidm, 
	     p_seqno => lv_lcur_seqno,
	     p_cact_code => lv_cact_code, 
	     p_priority_no => lv_prior,
	     p_term_code => lv_term_code, 
	     p_key_seqno => :s$_curricula.module_key_seqno,
	     p_lmod_code => :s$_curricula.module_code);
     
  	   :s$_curricula.original_sorlcur_count := :s$_curricula.original_sorlcur_count + 1;
  	   open sorlfos_c;
  	   loop 
  	   	 fetch sorlfos_c into lv_lfos_seqno, lv_prior, lv_cact_code, lv_lfst_code,
  	   	    lv_majr_code, lv_dept_code;
  	   	 exit when sorlfos_c%notfound;
  	   	 soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
          p_lcur_seqno => lv_lcur_seqno,
          p_seqno => lv_lfos_seqno,
          p_cact_code => lv_cact_code,
          p_lfst_code => lv_lfst_code,
          p_priority_no => lv_prior ,
          p_majr_code => lv_majr_code,
          p_dept_code => lv_dept_code);
   	   	  
  	   end loop;
  	   close sorlfos_c;
	  end loop;
	  close sorlcur_c;
end; 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.POPULATE_SOTLCUR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POPULATE_SOTLCUR")
		public void Soqolib_PopulateSotlcur()
		{
			
				int rowCount = 0;
				{
					NNumber lvLcurSeqno = toNumber(0);
					NNumber lvLfosSeqno = toNumber(0);
					NNumber lvPrior = toNumber(0);
					NString lvCactCode = NString.getNull();
					NString lvLfstCode = NString.getNull();
					NString lvMajrCode = NString.getNull();
					NString lvDeptCode = NString.getNull();
					NString lvTermCode = NString.getNull();
					String sqlsorlcurC = "SELECT sorlcur_priority_no, sorlcur_seqno, sorlcur_cact_code, sorlcur_term_code " +
	" FROM sorlcur " +
	" WHERE sorlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sorlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND ((sorlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND (sorlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome)) OR (sorlcur_lmod_code = sb_curriculum_str.f_learner)) AND ((sorlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sorlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sorlcur_lmod_code = sb_curriculum_str.f_learner AND sorlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sorlcur_lmod_code = sb_curriculum_str.f_outcome)) ";
					DataCursor sorlcurC = new DataCursor(sqlsorlcurC);
					String sqlsorlfosC = "SELECT sorlfos_seqno, sorlfos_priority_no, sorlfos_cact_code, sorlfos_lfst_code, sorlfos_majr_code, sorlfos_dept_code " +
	" FROM sorlfos " +
	" WHERE sorlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sorlfos_lcur_seqno = :P_LV_LCUR_SEQNO ";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(),null,null);
					getFormModel().getSCurricula().setOriginalSorlcurCount(toNumber(0));
					//Setting query parameters
					sorlcurC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
					sorlcurC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
					sorlcurC.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
					sorlcurC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
					sorlcurC.addParameter("S___CURRICULA_MODULE_END_TERM", getFormModel().getSCurricula().getModuleEndTerm());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlcurC.
					sorlcurC.open();
					while (true) {
						ResultSet sorlcurCResults = sorlcurC.fetchInto();
						if ( sorlcurCResults != null ) {
							lvPrior = sorlcurCResults.getNumber(0);
							lvLcurSeqno = sorlcurCResults.getNumber(1);
							lvCactCode = sorlcurCResults.getStr(2);
							lvTermCode = sorlcurCResults.getStr(3);
						}
						if ( sorlcurC.notFound() ) 
							break;
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(
								/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), 
								/*pSeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(), 
								/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode(),
								/*pTermCode=>*/lvTermCode, 
								/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno(),
								/*pCactCode=>*/lvCactCode,
								/*pPriorityNo=>*/lvPrior, 
								/*pLevlCode=>*/null,
								/*pCollCode=>*/null,
								/*pDegcCode=>*/null,
								/*pTermCodeCtlg=>*/null,
								 /*pCampCode=>*/null,
								 /*pProgram=>*/null);
						
						
						getFormModel().getSCurricula().setOriginalSorlcurCount(getFormModel().getSCurricula().getOriginalSorlcurCount().add(1));
						//Setting query parameters
						sorlfosC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						sorlfosC.addParameter("P_LV_LCUR_SEQNO", lvLcurSeqno);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosC.
						sorlfosC.open();
						while (true) {
							ResultSet sorlfosCResults = sorlfosC.fetchInto();
							if ( sorlfosCResults != null ) {
								lvLfosSeqno = sorlfosCResults.getNumber(0);
								lvPrior = sorlfosCResults.getNumber(1);
								lvCactCode = sorlfosCResults.getStr(2);
								lvLfstCode = sorlfosCResults.getStr(3);
								lvMajrCode = sorlfosCResults.getStr(4);
								lvDeptCode = sorlfosCResults.getStr(5);
							}
							if ( sorlfosC.notFound() ) 
								break;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), 
									/*pLcurSeqno=>*/null, 
									/*pSeqno=>*/lvLfosSeqno,
									/*pCactCode=>*/lvCactCode, 
									/*pLfstCode=>*/lvLfstCode,
									/*pPriorityNo=>*/lvPrior,
									/*pMajrCode=>*/lvMajrCode,
									/*pDeptCode=>*/lvDeptCode,
									/*pTermCodeCtlg=>*/null);
						
						
						}
						sorlfosC.close();
					}
					sorlcurC.close();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_FOR_LCUR_NULLS
		  
IF :sorlcur_priority_no  IS NULL THEN
  go_item('SORLCUR_PRIORITY_NO');
	message( G$_NLS.Get('SOQOLIB-0088', 'FORM','*Error* Enter required priority number.') ); 
	RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :sorlcur_term_code  IS NULL THEN
  go_item('SORLCUR_TERM_CODE');
	message( G$_NLS.Get('SOQOLIB-0089', 'FORM','*Error* Enter required term code.') ); 
	RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :sorlcur_levl_code  IS NULL THEN
  go_item('SORLCUR_LEVL_CODE');
	message( G$_NLS.Get('SOQOLIB-0090', 'FORM','*Error* Enter required level code.') ); 
	RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :sorlcur_coll_code  IS NULL THEN
  go_item('SORLCUR_COLL_CODE');
	message( G$_NLS.Get('SOQOLIB-0091', 'FORM','*Error* Enter required college code.') ); 
	RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :sorlcur_degc_code  IS NULL THEN
  go_item('SORLCUR_DEGC_CODE');
  message( G$_NLS.Get('SOQOLIB-0092', 'FORM','*Error* Enter required degree code.') ); 
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_FOR_LCUR_NULLS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_FOR_LCUR_NULLS")
		public void Soqolib_CheckForLcurNulls()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
				{
					goItem(toStr("SORLCUR_PRIORITY_NO"));
					errorMessage(GNls.Fget(toStr("SOQOLIB-0088"), toStr("FORM"), toStr("*Error* Enter required priority number.")));
					throw new ApplicationException();
				}
				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					goItem(toStr("SORLCUR_TERM_CODE"));
					errorMessage(GNls.Fget(toStr("SOQOLIB-0089"), toStr("FORM"), toStr("*Error* Enter required term code.")));
					throw new ApplicationException();
				}
				if ( sorlcurElement.getSorlcurLevlCode().isNull() )
				{
					goItem(toStr("SORLCUR_LEVL_CODE"));
					errorMessage(GNls.Fget(toStr("SOQOLIB-0090"), toStr("FORM"), toStr("*Error* Enter required level code.")));
					throw new ApplicationException();
				}
				if ( sorlcurElement.getSorlcurCollCode().isNull() )
				{
					goItem(toStr("SORLCUR_COLL_CODE"));
					errorMessage(GNls.Fget(toStr("SOQOLIB-0091"), toStr("FORM"), toStr("*Error* Enter required college code.")));
					throw new ApplicationException();
				}
				if ( sorlcurElement.getSorlcurDegcCode().isNull() )
				{
					goItem(toStr("SORLCUR_DEGC_CODE"));
					errorMessage(GNls.Fget(toStr("SOQOLIB-0092"), toStr("FORM"), toStr("*Error* Enter required degree code.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_FOR_LFOS_NULLS
		   DECLARE
  	missing_item  varchar2(100) := null; 
  	missing_msg   varchar2(100) := null;
  	
  	lite_blk  BLOCK;
  	
  BEGIN
  lite_blk := find_block('SORLCUR_LITE'); 
 --message('cursor block ' || :system.cursor_block || ' pri ' || 
 --    :sorlfos_priority_no || ' lfst ' || 
 --    :sorlfos_lfst_code || ' csts ' ||
 --    :sorlfos_csts_code || ' cact ' ||
 --    :sorlfos_csts_code || ' maj ' ||
 --    :sorlfos_majr_code ); 
  if :sorlfos_priority_no is null and
     :sorlfos_lfst_code is null and
     :sorlfos_csts_code is null and
     :sorlfos_cact_code is null and
     :sorlfos_majr_code is null  then 
     missing_item := 'SORLFOS_PRIORITY_NO';
     missing_msg := 
	  G$_NLS.Get('SOQOLIB-0093', 'FORM',
		 '*ERROR* Enter missing required data.') ;
	 	goto display_missing_data;
  end if; 

  

	if :sorlfos_lfst_code is null then
	  missing_item := 'sorlfos_lfst_code' ;
		missing_msg :=  G$_NLS.Get('SOQOLIB-0094', 'FORM',
		 '*ERROR* Enter a field of study type code.') ;
	 	goto display_missing_data;
	end if; 

  if :sorlfos_priority_no is null then 
		missing_item := 'SORLFOS_PRIORITY_NO';
		missing_msg := 
	  G$_NLS.Get('SOQOLIB-0095', 'FORM',
		 '*ERROR* Enter a priority number.') ;
	 	goto display_missing_data;
  end if; 

	if :sorlfos_csts_code is null then 
  	  missing_item := 'sorlfos_csts_code' ;
			missing_msg :=  G$_NLS.Get('SOQOLIB-0096', 'FORM',
		 '*ERROR* Enter a curriculum status code.') ;
	 	goto display_missing_data;
	end if;

	if :sorlfos_cact_code is null then 
		  missing_item := 'sorlfos_cact_code' ;
 			missing_msg :=  G$_NLS.Get('SOQOLIB-0097', 'FORM',
		 '*ERROR* Enter a curriculum activity code.') ;
	 	goto display_missing_data;
	end if;

	if :sorlfos_majr_code is null then
		  missing_item := 'sorlfos_majr_code' ;
 			missing_msg :=  G$_NLS.Get('SOQOLIB-0098', 'FORM',
		 '*ERROR* Enter a field of study code.')  ;
	 	goto display_missing_data;
	end if;
	goto end_trigger; 
	
	<<display_missing_data>>
	  if get_item_property('SORLFOS_MAJR_CODE', enabled) = 'FALSE' OR
	  get_item_property('SORLFOS_CSTS_CODE', enabled) = 'FALSE' OR
	  get_item_property('SORLFOS_LFST_CODE', enabled) = 'FALSE' OR
	   get_item_property('SORLFOS_PRIORITY_NO', enabled) = 'FALSE' OR 
	  get_item_property('SORLFOS_CACT_CODE', enabled) = 'FALSE'  
	  	then 
				IF ID_NULL(lite_blk) THEN 
					if :system.cursor_item not like '%SORLFOS_TERM_CODE_END' then 
						set_curric_properties('sorlfos_term_code_end','enabled','property_true');
		 				set_curric_properties('sorlfos_term_code_end','navigable','property_true');
					END IF;
					if :system.cursor_item not like '%SORLFOS_TMST_CODE' then 
  					set_curric_properties('sorlfos_tmst_code','enabled','property_true');
						set_curric_properties('sorlfos_tmst_code','navigable','property_true');
					END IF;
					if :system.cursor_item not like '%SORLFOS_START_DATE' then 
						set_curric_properties('sorlfos_start_date','enabled','property_true');
						set_curric_properties('sorlfos_start_date','navigable','property_true');
					END IF;
					if :system.cursor_item not like '%SORLFOS_END_DATE' then 
						set_curric_properties('sorlfos_end_date','enabled','property_true');
						set_curric_properties('sorlfos_end_date','navigable','property_true');
		   		END IF;
					if :system.cursor_item not like '%SORLFOS_CACT_CODE' then 
      	   	set_curric_properties('sorlfos_cact_code','enabled','property_true');
		   			set_curric_properties('sorlfos_cact_code','navigable','property_true');
		   		END IF;
				  if :system.cursor_item not like '%SORLFOS_TERM_CODE_CTLG' then 
				    set_curric_properties('sorlfos_term_code_ctlg','enabled','property_true');
				    set_curric_properties('sorlfos_term_code_ctlg','navigable','property_true');
		      END IF; 
				END IF; 
				if :system.cursor_item not like '%SORLFOS_CSTS_CODE' then 
				  set_curric_properties('sorlfos_csts_code','enabled','property_true');
				  set_curric_properties('sorlfos_csts_code','navigable','property_true');
		    END IF; 

				if :system.cursor_item not like '%SORLFOS_MAJR_CODE' then 
			  	set_curric_properties('sorlfos_majr_code','enabled','property_true');
			  	set_curric_properties('sorlfos_majr_code','navigable','property_true');
				END IF;

				if :system.cursor_item not like '%SORLFOS_DEPT_CODE' then 
				  set_curric_properties('sorlfos_dept_code','enabled','property_true');
				  set_curric_properties('sorlfos_dept_code','navigable','property_true');
				END IF; 

				if :system.cursor_item not like '%SORLFOS_LFST_CODE' then 
			  	set_curric_properties('sorlfos_lfst_code','enabled','property_true');
		  		set_curric_properties('sorlfos_lfst_code','navigable','property_true');
				END IF; 

				if :system.cursor_item not like '%SORLFOS_MAJR_CODE_ATTACH' then 
	  			set_curric_properties('sorlfos_majr_code_attach','enabled','property_true');
  				set_curric_properties('sorlfos_majr_code_attach','navigable','property_true');
		    END IF; 

	  end if; 
	  IF get_item_property(missing_item,enabled) = 'TRUE' AND 
	  	get_item_property(missing_item,visible) = 'TRUE' THEN 
	    GO_ITEM(missing_item);
	    g$_check_failure; 
	  END IF;
	  message(missing_msg);
 	  raise form_trigger_failure;

 <<end_trigger>> 
 null;
 
 END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_FOR_LFOS_NULLS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_FOR_LFOS_NULLS")
		public void Soqolib_CheckForLfosNulls()
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
					if(sorlfosElement==null)
						return;

				{
					NString missingItem = NString.getNull();
					NString missingMsg = NString.getNull();
//					BlockDescriptor liteBlk= null;
//					liteBlk = findBlock("SORLCUR_LITE");
					// message('cursor block ' || :system.cursor_block || ' pri ' || 
					//     :sorlfos_priority_no || ' lfst ' || 
					//     :sorlfos_lfst_code || ' csts ' ||
					//     :sorlfos_csts_code || ' cact ' ||
					//     :sorlfos_csts_code || ' maj ' ||
					//     :sorlfos_majr_code ); 
					if ( sorlfosElement.getSorlfosPriorityNo().isNull() && sorlfosElement.getSorlfosLfstCode().isNull() && sorlfosElement.getSorlfosCstsCode().isNull() && sorlfosElement.getSorlfosCactCode().isNull() && sorlfosElement.getSorlfosMajrCode().isNull() )
					{
						missingItem = toStr("SORLFOS_PRIORITY_NO");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0093"), toStr("FORM"), toStr("*ERROR* Enter missing required data."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						missingItem = toStr("sorlfos_lfst_code");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0094"), toStr("FORM"), toStr("*ERROR* Enter a field of study type code."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					if ( sorlfosElement.getSorlfosPriorityNo().isNull() )
					{
						missingItem = toStr("SORLFOS_PRIORITY_NO");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0095"), toStr("FORM"), toStr("*ERROR* Enter a priority number."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					if ( sorlfosElement.getSorlfosCstsCode().isNull() )
					{
						missingItem = toStr("sorlfos_csts_code");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0096"), toStr("FORM"), toStr("*ERROR* Enter a curriculum status code."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					if ( sorlfosElement.getSorlfosCactCode().isNull() )
					{
						missingItem = toStr("sorlfos_cact_code");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0097"), toStr("FORM"), toStr("*ERROR* Enter a curriculum activity code."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					if ( sorlfosElement.getSorlfosMajrCode().isNull() )
					{
						missingItem = toStr("sorlfos_majr_code");
						missingMsg = GNls.Fget(toStr("SOQOLIB-0098"), toStr("FORM"), toStr("*ERROR* Enter a field of study code."));
						 
						 Soqolib_goTo_DisplayMissingData();
					}
					return;
					
					
					
				}
			}
		
		public void Soqolib_goTo_DisplayMissingData(){
			
			NString missingItem = NString.getNull();
			NString missingMsg = NString.getNull();
			BlockDescriptor liteBlk= null;
			liteBlk = findBlock("SORLCUR_LITE");
			
			
			if ( getItemEnabled("SORLFOS_MAJR_CODE").equals("FALSE") || getItemEnabled("SORLFOS_CSTS_CODE").equals("FALSE") || getItemEnabled("SORLFOS_LFST_CODE").equals("FALSE") || getItemEnabled("SORLFOS_PRIORITY_NO").equals("FALSE") || getItemEnabled("SORLFOS_CACT_CODE").equals("FALSE") )
			{
				if ( (liteBlk == null) )
				{
					if ( !like(getCursorItem(), "%SORLFOS_TERM_CODE_END") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("navigable"), toStr("property_true"));
					}
					if ( !like(getCursorItem(), "%SORLFOS_TMST_CODE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("navigable"), toStr("property_true"));
					}
					if ( !like(getCursorItem(), "%SORLFOS_START_DATE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("navigable"), toStr("property_true"));
					}
					if ( !like(getCursorItem(), "%SORLFOS_END_DATE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("navigable"), toStr("property_true"));
					}
					if ( !like(getCursorItem(), "%SORLFOS_CACT_CODE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code"), toStr("navigable"), toStr("property_true"));
					}
					if ( !like(getCursorItem(), "%SORLFOS_TERM_CODE_CTLG") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("navigable"), toStr("property_true"));
					}
				}
				if ( !like(getCursorItem(), "%SORLFOS_CSTS_CODE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("navigable"), toStr("property_true"));
				}
				if ( !like(getCursorItem(), "%SORLFOS_MAJR_CODE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("navigable"), toStr("property_true"));
				}
				if ( !like(getCursorItem(), "%SORLFOS_DEPT_CODE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("navigable"), toStr("property_true"));
				}
				if ( !like(getCursorItem(), "%SORLFOS_LFST_CODE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code"), toStr("navigable"), toStr("property_true"));
				}
				if ( !like(getCursorItem(), "%SORLFOS_MAJR_CODE_ATTACH") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("navigable"), toStr("property_true"));
				}
			}
			if ( getItemEnabled(missingItem).equals("TRUE") && getItemVisible(missingItem).equals("TRUE") )
			{
				goItem(missingItem);
				getContainer().getGoqrpls().gCheckFailure();
			}
			errorMessage(missingMsg);
			throw new ApplicationException();
			
			
			
			
		}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_MAJR_POST_TEXT
		 --  post text trigger for sorlfos_majr_code
declare 
	test_code varchar2(1) := '';
	test_term  varchar2(6) := '';
	cnt_dept   number := 0;  
	-- get the department if a major is entered 
	cursor cnt_dept_c is 
	  select nvl(count(*),0)  
	  from sorcmjr bx
	  where bx.sorcmjr_curr_rule = :sorlcur_curr_rule
	  and bx.sorcmjr_majr_code = :sorlfos_majr_code
	  and (decode(bx.sorcmjr_rec_ind,'Y','R') = :module_ind
	     or decode(bx.sorcmjr_adm_ind,'Y','A') = :module_ind
	     or decode(bx.sorcmjr_his_ind,'Y','H') = :module_ind
	     or decode(bx.sorcmjr_stu_ind,'Y','S') = :module_ind
	     or decode(bx.sorcmjr_dau_ind,'Y','M') = :module_ind)
	  and bx.sorcmjr_term_code_eff  = 
				(select max(m.sorcmjr_term_code_eff) from sorcmjr m
				 where m.sorcmjr_curr_rule = bx.sorcmjr_curr_rule
				 and m.sorcmjr_majr_code  = bx.sorcmjr_majr_code  
				 and m.sorcmjr_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)));
				   
	cursor dept_c is 
	  select bx.sorcmjr_dept_code , bx.sorcmjr_cmjr_rule  
	  from sorcmjr bx
	  where bx.sorcmjr_curr_rule = :sorlcur_curr_rule
	  and bx.sorcmjr_majr_code = :sorlfos_majr_code
	  and (decode(bx.sorcmjr_rec_ind,'Y','R') = :module_ind
	     or decode(bx.sorcmjr_adm_ind,'Y','A') = :module_ind
	     or decode(bx.sorcmjr_his_ind,'Y','H') = :module_ind
	     or decode(bx.sorcmjr_stu_ind,'Y','S') = :module_ind
	     or decode(bx.sorcmjr_dau_ind,'Y','M') = :module_ind)
	  and bx.sorcmjr_term_code_eff  = 
				(select max(m.sorcmjr_term_code_eff) from sorcmjr m
				 where m.sorcmjr_curr_rule = bx.sorcmjr_curr_rule
				 and m.sorcmjr_majr_code  = bx.sorcmjr_majr_code  
				 and m.sorcmjr_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)));
 	
		-- see if the concentration is attached  to the base
  lv_attach_base varchar2(1) := null; 
	cursor conc_base_c is 
	   select 'Y'
	   from sorccon bs
	   where  bs.sorccon_cmjr_rule is null 
	    and (decode(bs.sorccon_rec_ind,'Y','R') = :module_ind
	     or decode(bs.sorccon_adm_ind,'Y','A') = :module_ind
	     or decode(bs.sorccon_his_ind,'Y','H') = :module_ind
	     or decode(bs.sorccon_stu_ind,'Y','S') = :module_ind
	     or decode(bs.sorccon_dau_ind,'Y','M') = :module_ind) 
	   and bs.sorccon_majr_code_conc = :sorlfos_majr_code 
	   and bs.sorccon_curr_rule = :sorlcur_curr_rule 
	   and bs.sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = bs.sorccon_curr_rule
				 and m.sorccon_cmjr_rule is null 
				 and m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))) ;

		-- see also if the concentration is attached  to a major
  lv_attach_major varchar2(1) := null; 
	cursor conc_major_c is 
	   select 'Y'
	   from sorccon bs
	   where  bs.sorccon_cmjr_rule is not null 
	    and (decode(bs.sorccon_rec_ind,'Y','R') = :module_ind
	     or decode(bs.sorccon_adm_ind,'Y','A') = :module_ind
	     or decode(bs.sorccon_his_ind,'Y','H') = :module_ind
	     or decode(bs.sorccon_stu_ind,'Y','S') = :module_ind
	     or decode(bs.sorccon_dau_ind,'Y','M') = :module_ind) 
	   and bs.sorccon_majr_code_conc = :sorlfos_majr_code 
	   and bs.sorccon_curr_rule = :sorlcur_curr_rule 
	   and bs.sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = bs.sorccon_curr_rule
				 and m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc 
				 and m.sorccon_cmjr_rule is not null 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))) ;

	-- get the major to which a concentration is attached  
	cursor conc_c is 
	   select bs.sorccon_cmjr_rule, sorcmjr_majr_code,
	     bs.sorccon_term_code_eff 
	   from sorcmjr,  sorccon bs
	   where sorcmjr_cmjr_rule = bs.sorccon_cmjr_rule 
	   and sorcmjr_curr_rule = bs.sorccon_curr_rule 
	   and (decode(bs.sorccon_rec_ind,'Y','R') = :module_ind
	     or decode(bs.sorccon_adm_ind,'Y','A') = :module_ind
	     or decode(bs.sorccon_his_ind,'Y','H') = :module_ind
	     or decode(bs.sorccon_stu_ind,'Y','S') = :module_ind
	     or decode(bs.sorccon_dau_ind,'Y','M') = :module_ind) 
	   and bs.sorccon_majr_code_conc = :sorlfos_majr_code 
	   and bs.sorccon_curr_rule = :sorlcur_curr_rule 
	   and bs.sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = bs.sorccon_curr_rule
				 and m.sorccon_cmjr_rule is not null 
				 and m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc 
				 --- 7.4.0.1 need to find max for the major 
				 and m.sorccon_cmjr_rule = sorcmjr_cmjr_rule 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)));
	 

--  validate that the newly attached major is really a major for the curriculum
--  blank out if it is not 
	lv_current_tfos   sotlfos.sotlfos_majr_code%type;
	
	cursor max_tfos is 	
  select org.sotlfos_majr_code
  from  sobcact, sotlfos org
  where org.sotlfos_lcur_seqno = :sorlcur_seqno
  and org.sotlfos_lfst_code = sb_fieldofstudy_str.f_major
  and sobcact_cact_code = org.sotlfos_cact_code
  and sobcact_active_ind = 'Y'
  and org.sotlfos_majr_code = :sorlfos_majr_code_attach
  and org.sotlfos_pidm = :sorlcur_pidm
  and org.sotlfos_seqno = 
    ( select max(mx.sotlfos_seqno)
      from sotlfos mx
      where mx.sotlfos_lcur_seqno = org.sotlfos_lcur_seqno
      and mx.sotlfos_pidm = :sorlcur_pidm
      and mx.sotlfos_lfst_code = sb_fieldofstudy_str.f_major 
      and mx.sotlfos_priority_no = org.sotlfos_priority_no);
	
BEGIN
	case :sorlfos_lfst_code 
	-- process major type field of study 
	-- fill in curr rule and also dept 
	when sb_fieldofstudy_str.f_major then
 	   if :global.sel_ind = 'Y' and
        :global.curr_rule is not null and
        :sorlcur_curr_rule is null then 
          :sorlcur_curr_rule := :global.curr_rule;
          execute_trigger('lfos_check_program_major');
	   else 
	   if :sorlcur_curr_rule is not null then 
	   	  -- find out if only one of the majors and pull dept if there is only one
	     	open cnt_dept_c;
	    	fetch cnt_dept_c into cnt_dept;
	    	close cnt_dept_c;
	      if cnt_dept = 1 then
	       open dept_c;
	       fetch dept_c into :sorlfos_dept_code, :sorlfos_lfos_rule;
	       close dept_c; 
	      else
	    	 :sorlfos_dept_code := null;
	    	 :sorlfos_lfos_rule := null;
	      end if; 
	      if :sorlfos_dept_code is not null then 
	      	:sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
	      else 
	      	:sorlfos_dept_desc := NULL; 
	      end if; 
	   else  
	   	if :sorlcur_curr_rule is null and :lcur_sobctrl_curr_rule_ind = 'Y' then 
	   		execute_trigger('lfos_check_program_major');
	   		g$_check_failure;
	   	end if;
	   end if; 
	   end if; 
	   
	-- minor type does not have any special processing 
	when sb_fieldofstudy_str.f_minor  then 
	   	 null;
	 
	-- concentration type.  fill in attached major and descriptions   	  
	when sb_fieldofstudy_str.f_concentration then 
	 	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_true');
	 	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_true');
	 	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_true');
	 	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','updateable','property_true');
 	 	if nvl(:global.sel_ind,'N') = 'Y' then
      :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code); 
      :sorlfos_majr_code_attach := :global.attached_major;
      :sorlfos_conc_attach_rule := :global.lfos_conc_rule;
      if :sorlfos_majr_code_attach is not null  then 
       		 :sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);
      else 
      	   :sorlfos_attach_conc_desc := null; 
         	<multilinecomment>	open conc_base_c;
			   	  fetch conc_base_c into lv_attach_base;
			   	  -- if conc. is attached to the base then disable the major attach lov and make
			   	  -- it non updateable 
			   	  if conc_base_c%found then 
			   	  	:sorlfos_majr_code_attach := null;
			   	  	:sorlfos_attach_conc_desc := null;
			   	  	set_item_property('SORLFOS_MAJR_CODE_ATTACH',enabled,property_false);
					   	set_item_property('SORLFOS_MAJR_CODE_ATTACH',navigable,property_false);
					   	set_item_property('SORLFOS_MAJR_CODE_ATTACH_LBT',enabled,property_false);
					   --	go_item('sorlfos_dept_code'); 
			   	  end if;
			   	  close conc_base_c;</multilinecomment>
      end if; 
   ELSE
	  if :sorlfos_majr_code is not null and :sorlcur_curr_rule is not null THEN
	    IF  nvl(:sorlfos_majr_code_attach, :global.attached_major) is null  then 
	      :sorlfos_attach_conc_desc := null;
			  :sorlfos_majr_code_attach := null;
			  :sorlfos_conc_attach_rule := null;

	    	-- get concentrations rule and then the attached major rule 
		    open conc_c;
		    loop 
				     fetch conc_c into :sorlfos_conc_attach_rule, :sorlfos_majr_code_attach, test_term;
				     exit when conc_c%notfound; 
				     if :sorlfos_majr_code_attach is not null then 
				    	  open max_tfos;
				    	  fetch max_tfos into lv_current_tfos;
				    	  if max_tfos%found then 
				    	    close max_tfos;
				    	    :sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);
				    	    exit;
				    	  else
				    	  	close max_tfos;
				    	  end if;
				      else 
				    	  	:sorlfos_majr_code_attach := null;
				     end if;
		    end loop; 
		    close conc_c;
		    
		 
		 end if; -- majr code attach is null 
	  END IF; -- majr code is not null and curr rule is not null 
   END IF; -- global sel <> Y 
   if :sorlcur_curr_rule is not null and :global.attached_major is null then 
   	  open conc_base_c;
   	  fetch conc_base_c into lv_attach_base;
   	  open conc_major_c;
   	  fetch conc_major_c into lv_attach_major;
   	  -- if conc. is attached to the base then disable the major attach lov and make
   	  -- it non updateable 
   	  -- we also need to look to see if the conc is attached to any major that is 
   	  -- present in sotlfos or sorlfos and is current, active.  If it is we should
   	  -- not disable the attached major 
   	  if conc_base_c%found and conc_major_c%notfound then
  	  	:sorlfos_majr_code_attach := null;
   	  	:sorlfos_attach_conc_desc := null;
   	  	:sorlfos_conc_attach_rule := null;
   	  	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
		   	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_false');
		   	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');
   	  end if;
   	  close conc_base_c;
   	  close conc_major_c;
   	end if; -- curr rule is not null  
   	
	else -- end of case statement 
    null; 
	end case;
end;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_MAJR_POST_TEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_MAJR_POST_TEXT")
		public void Soqolib_LfosMajrPostText()
		{
			
				//   post text trigger for sorlfos_majr_code

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NString testCode = toStr("");
					NString testTerm = toStr("");
					NNumber cntDept = toNumber(0);
					String sqlcntDeptC = "SELECT nvl(count(*), 0) " +
	" FROM sorcmjr bx " +
	" WHERE bx.sorcmjr_curr_rule = :SORLCUR_CURR_RULE AND bx.sorcmjr_majr_code = :SORLFOS_MAJR_CODE AND (decode(bx.sorcmjr_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bx.sorcmjr_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bx.sorcmjr_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bx.sorcmjr_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bx.sorcmjr_dau_ind, 'Y', 'M') = :MODULE_IND) AND bx.sorcmjr_term_code_eff = (SELECT max(m.sorcmjr_term_code_eff) " +
		" FROM sorcmjr m " +
		" WHERE m.sorcmjr_curr_rule = bx.sorcmjr_curr_rule AND m.sorcmjr_majr_code = bx.sorcmjr_majr_code AND m.sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor cntDeptC = new DataCursor(sqlcntDeptC);
					String sqldeptC = "SELECT bx.sorcmjr_dept_code, bx.sorcmjr_cmjr_rule " +
	" FROM sorcmjr bx " +
	" WHERE bx.sorcmjr_curr_rule = :SORLCUR_CURR_RULE AND bx.sorcmjr_majr_code = :SORLFOS_MAJR_CODE AND (decode(bx.sorcmjr_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bx.sorcmjr_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bx.sorcmjr_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bx.sorcmjr_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bx.sorcmjr_dau_ind, 'Y', 'M') = :MODULE_IND) AND bx.sorcmjr_term_code_eff = (SELECT max(m.sorcmjr_term_code_eff) " +
		" FROM sorcmjr m " +
		" WHERE m.sorcmjr_curr_rule = bx.sorcmjr_curr_rule AND m.sorcmjr_majr_code = bx.sorcmjr_majr_code AND m.sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor deptC = new DataCursor(sqldeptC);
					//  see if the concentration is attached  to the base
					NString lvAttachBase = NString.getNull();
					String sqlconcBaseC = "SELECT 'Y' " +
	" FROM sorccon bs " +
	" WHERE bs.sorccon_cmjr_rule IS NULL AND (decode(bs.sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bs.sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bs.sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bs.sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bs.sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND bs.sorccon_majr_code_conc = :SORLFOS_MAJR_CODE AND bs.sorccon_curr_rule = :SORLCUR_CURR_RULE AND bs.sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = bs.sorccon_curr_rule AND m.sorccon_cmjr_rule IS NULL AND m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concBaseC = new DataCursor(sqlconcBaseC);
					//  see also if the concentration is attached  to a major
					NString lvAttachMajor = NString.getNull();
					String sqlconcMajorC = "SELECT 'Y' " +
	" FROM sorccon bs " +
	" WHERE bs.sorccon_cmjr_rule IS NOT NULL AND (decode(bs.sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bs.sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bs.sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bs.sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bs.sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND bs.sorccon_majr_code_conc = :SORLFOS_MAJR_CODE AND bs.sorccon_curr_rule = :SORLCUR_CURR_RULE AND bs.sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = bs.sorccon_curr_rule AND m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc AND m.sorccon_cmjr_rule IS NOT NULL AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concMajorC = new DataCursor(sqlconcMajorC);
					String sqlconcC = "SELECT bs.sorccon_cmjr_rule, sorcmjr_majr_code, bs.sorccon_term_code_eff " +
	" FROM sorcmjr, sorccon bs " +
	" WHERE sorcmjr_cmjr_rule = bs.sorccon_cmjr_rule AND sorcmjr_curr_rule = bs.sorccon_curr_rule AND (decode(bs.sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(bs.sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(bs.sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(bs.sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(bs.sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND bs.sorccon_majr_code_conc = :SORLFOS_MAJR_CODE AND bs.sorccon_curr_rule = :SORLCUR_CURR_RULE AND bs.sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = bs.sorccon_curr_rule AND m.sorccon_cmjr_rule IS NOT NULL AND m.sorccon_majr_code_conc = bs.sorccon_majr_code_conc AND m.sorccon_cmjr_rule = sorcmjr_cmjr_rule AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concC = new DataCursor(sqlconcC);
					//   validate that the newly attached major is really a major for the curriculum
					//   blank out if it is not 
					NString lvCurrentTfos= NString.getNull();
					String sqlmaxTfos = "SELECT org.sotlfos_majr_code " +
	" FROM sobcact, sotlfos org " +
	" WHERE org.sotlfos_lcur_seqno = :SORLCUR_SEQNO AND org.sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND sobcact_cact_code = org.sotlfos_cact_code AND sobcact_active_ind = 'Y' AND org.sotlfos_majr_code = :SORLFOS_MAJR_CODE_ATTACH AND org.sotlfos_pidm = :SORLCUR_PIDM AND org.sotlfos_seqno = (SELECT max(mx.sotlfos_seqno) " +
		" FROM sotlfos mx " +
		" WHERE mx.sotlfos_lcur_seqno = org.sotlfos_lcur_seqno AND mx.sotlfos_pidm = :SORLCUR_PIDM AND mx.sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND mx.sotlfos_priority_no = org.sotlfos_priority_no ) ";
					DataCursor maxTfos = new DataCursor(sqlmaxTfos);
					if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
					{
						if ( getGlobal("SEL_IND").equals("Y") && !getGlobal("CURR_RULE").isNull() && sorlcurElement.getSorlcurCurrRule().isNull() )
						{
							sorlcurElement.setSorlcurCurrRule(toNumber(getGlobal("CURR_RULE")));
							executeAction("lfos_check_program_major");
						}
						else {
							if ( !sorlcurElement.getSorlcurCurrRule().isNull() )
							{
								//  find out if only one of the majors and pull dept if there is only one
								//Setting query parameters
								cntDeptC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
								cntDeptC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
								cntDeptC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
								cntDeptC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
								cntDeptC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
								cntDeptC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntDeptC.
								cntDeptC.open();
								ResultSet cntDeptCResults = cntDeptC.fetchInto();
								if ( cntDeptCResults != null ) {
									cntDept = cntDeptCResults.getNumber(0);
								}
								cntDeptC.close();
								if ( cntDept.equals(1) )
								{
									//Setting query parameters
									deptC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
									deptC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
									deptC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
									deptC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
									deptC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
									deptC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable deptC.
									deptC.open();
									ResultSet deptCResults = deptC.fetchInto();
									if ( deptCResults != null ) {
										sorlfosElement.setSorlfosDeptCode(deptCResults.getStr(0));
										sorlfosElement.setSorlfosLfosRule(deptCResults.getNumber(1));
									}
									deptC.close();
								}
								else {
									sorlfosElement.setSorlfosDeptCode(toStr(null));
									sorlfosElement.setSorlfosLfosRule(toNumber(null));
								}
								if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
								{
									sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
								}
								else {
									sorlfosElement.setSorlfosDeptDesc(toStr(null));
								}
							}
							else {
								if ( sorlcurElement.getSorlcurCurrRule().isNull() && getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
								{
									executeAction("lfos_check_program_major");
									getContainer().getGoqrpls().gCheckFailure();
								}
							}
						}
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
					{
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
					{
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("updateable"), toStr("property_true"));
						if ( isNull(getGlobal("SEL_IND"), "N").equals("Y") )
						{
							sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
							sorlfosElement.setSorlfosMajrCodeAttach(getGlobal("ATTACHED_MAJOR"));
							sorlfosElement.setSorlfosConcAttachRule(toNumber(getGlobal("LFOS_CONC_RULE")));
							if ( !sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
							{
								sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
							}
							else {
								sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
							}
						}
						else {
							if ( !sorlfosElement.getSorlfosMajrCode().isNull() && !sorlcurElement.getSorlcurCurrRule().isNull() )
							{
								if ( isNull(sorlfosElement.getSorlfosMajrCodeAttach(), getGlobal("ATTACHED_MAJOR")).isNull() )
								{
									sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
									sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
									sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
									//  get concentrations rule and then the attached major rule 
									//Setting query parameters
									concC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
									concC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
									concC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
									concC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
									concC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
									concC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable concC.
									concC.open();
									while (true) {
										ResultSet concCResults = concC.fetchInto();
										if ( concCResults != null ) {
											sorlfosElement.setSorlfosConcAttachRule(concCResults.getNumber(0));
											sorlfosElement.setSorlfosMajrCodeAttach(concCResults.getStr(1));
											testTerm = concCResults.getStr(2);
										}
										if ( concC.notFound() ) 
											break;
										if ( !sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
										{
											//Setting query parameters
											maxTfos.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
											maxTfos.addParameter("SORLFOS_MAJR_CODE_ATTACH", sorlfosElement.getSorlfosMajrCodeAttach());
											maxTfos.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
											//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxTfos.
											maxTfos.open();
											ResultSet maxTfosResults = maxTfos.fetchInto();
											if ( maxTfosResults != null ) {
												lvCurrentTfos = maxTfosResults.getStr(0);
											}
											if ( maxTfos.found() )
											{
												maxTfos.close();
												sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
													break;
											}
											else {
												maxTfos.close();
											}
										}
										else {
											sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
										}
									}
									concC.close();
								}
							}
						}
						//  global sel <> Y 
						if ( !sorlcurElement.getSorlcurCurrRule().isNull() && getGlobal("ATTACHED_MAJOR").isNull() )
						{
							//Setting query parameters
							concBaseC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							concBaseC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
							concBaseC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
							concBaseC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
							concBaseC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
							concBaseC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable concBaseC.
							concBaseC.open();
							ResultSet concBaseCResults = concBaseC.fetchInto();
							if ( concBaseCResults != null ) {
								lvAttachBase = concBaseCResults.getStr(0);
							}
							//Setting query parameters
							concMajorC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							concMajorC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
							concMajorC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
							concMajorC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
							concMajorC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
							concMajorC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable concMajorC.
							concMajorC.open();
							ResultSet concMajorCResults = concMajorC.fetchInto();
							if ( concMajorCResults != null ) {
								lvAttachMajor = concMajorCResults.getStr(0);
							}
							//  if conc. is attached to the base then disable the major attach lov and make
							//  it non updateable 
							//  we also need to look to see if the conc is attached to any major that is 
							//  present in sotlfos or sorlfos and is current, active.  If it is we should
							//  not disable the attached major 
							if ( concBaseC.found() && concMajorC.notFound() )
							{
								sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
								sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
								sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
								this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
							}
							concBaseC.close();
							concMajorC.close();
						}
					}
					else {
						//  end of case statement 
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LCUR_RECORD_CNT
		 -- update record count after inserting new sorlcur 
-- execute this at key commit on sorlcur or sorlfos blocks 

declare 
	save_item    VARCHAR2(30) := NULL; 
	save_lfos_rowid  VARCHAR2(30) := NULL; 
	save_lcur_rowid  VARCHAR2(30) := NULL; 
  cnt_lfos     NUMBER := 0; 
	save_block   VARCHAR2(30) := NULL;
  lcur_blk     VARCHAR2(30) ; 
  lfos_blk     VARCHAR2(30) ; 
  lv_blk       BLOCK; 
  recs         NUMBER := 0; 
begin 
	save_item := :system.current_item;
		
	lv_blk := find_block('SORLCUR_LITE'); 
	IF ID_NULL(lv_blk) THEN 
		 lcur_blk := 'SORLCUR';
		 lfos_blk := 'SORLFOS';
	ELSE 
		 lcur_blk := 'SORLCUR_LITE';
		 lfos_blk := 'SORLFOS_LITE'; 
	END IF;
	
  :system.message_level := '5';
	if :system.current_block like 'SORLCUR%' then
		save_lcur_rowid := :sovlcur_rowid;
	else 
    save_lfos_rowid := :sovlfos_rowid;
    save_lcur_rowid := :sovlcur_rowid;
	end if;
	-- keep this call to curriculum in the code
	-- it requeries the curriculum records which
	-- refreshes the sovlcur variables 
	-- need this to avoid record locking
  execute_trigger('call_curriculum');
  g$_check_failure;
  first_record;
  g$_check_failure;
 
  -- goto specific record 
  --:lcur_rec_num := :system.cursor_record;
  FOR recs in 1..:lcur_rec_cnt LOOP 
  	if :sovlcur_rowid = save_lcur_rowid then 
  		go_block(lfos_blk);
  		g$_check_failure;
  	--	execute_query;
  		last_record;
  		g$_check_failure;
  	  cnt_lfos := :system.cursor_record;
  	  go_block(lcur_blk); 
  	  g$_check_failure;
  		exit; -- exit loop that goes to the record
  	end if;
  	IF :System.Last_Record <> 'TRUE' THEN 
    	next_record; 
    	g$_check_failure;
    end if; 
  END LOOP;
  IF save_lfos_rowid IS NOT NULL THEN 
    recs := 0;
    go_block(lfos_blk);
    g$_check_failure;
    
    --- add clear block and execute query for 7.3.1
    --- after curric error when cursor is on lfos block
    --- the record is not appearing correctly 
    clear_block;
    g$_check_failure;
    execute_query;
    g$_check_failure;
    if :system.cursor_record > 1 then    
      first_record;
    end if; 
    g$_check_failure;
    IF cnt_lfos > 1 THEN 
     FOR recs in 1..cnt_lfos LOOP
    	if :sovlfos_rowid = save_lfos_rowid THEN
    		exit;
    	end if;
    	IF :System.Last_Record <> 'TRUE' 
    		 THEN 
      	next_record;
      	g$_check_failure;
      end if;
     END LOOP;
    END IF;
    ELSE -- how can the lfos rowid be null?
    	go_block(lfos_blk);
    	g$_check_failure;
    	execute_query;
    	g$_check_failure;
      first_record;
      g$_check_failure;
    END IF;
  
  :system.message_level := '0';
 -- message('message text: ' || message_text); message(' ' );
  if save_item <> :system.current_item then 
     go_item(save_item); 
     --g$_check_failure;
  end if;
   
  
	
end ; 	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LCUR_RECORD_CNT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LCUR_RECORD_CNT")
		public void Soqolib_LcurRecordCnt()
		{
			
				//  update record count after inserting new sorlcur 
				//  execute this at key commit on sorlcur or sorlfos blocks 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				{
					NString saveItem = NString.getNull();
					NString saveLfosRowid = NString.getNull();
					NString saveLcurRowid = NString.getNull();
//					NNumber cntLfos = toNumber(0);
					int cntLfos= 0;
					NString saveBlock = NString.getNull();
					NString lcurBlk= NString.getNull();
					NString lfosBlk= NString.getNull();
					BlockDescriptor lvBlk= null;
//					NNumber recs = toNumber(0);
					int recs = 0;
					
					saveItem = toStr(getCurrentItem());
					lvBlk = findBlock("SORLCUR_LITE");
					if ( (lvBlk == null) )
					{
						lcurBlk = toStr("SORLCUR");
						lfosBlk = toStr("SORLFOS");
					}
					else {
						lcurBlk = toStr("SORLCUR_LITE");
						lfosBlk = toStr("SORLFOS_LITE");
					}
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					if ( like(getCurrentBlock(), "SORLCUR%") )
					{
						saveLcurRowid = sorlcurElement.getSovlcurRowid();
					}
					else {
						saveLfosRowid = sorlfosElement.getSovlfosRowid();
						saveLcurRowid = sorlcurElement.getSovlcurRowid();
					}
					//  keep this call to curriculum in the code
					//  it requeries the curriculum records which
					//  refreshes the sovlcur variables 
					//  need this to avoid record locking
					executeAction("call_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					firstRecord();
					getContainer().getGoqrpls().gCheckFailure();
					//  goto specific record 
					// :lcur_rec_num := :system.cursor_record;
					for ( recs = 1; recs <= getFormModel().getSCurriculaTraditional().getLcurRecCnt().toInt32(); recs+= 1 )
					{
						if ( sorlcurElement.getSovlcurRowid().equals(saveLcurRowid) )
						{
							goBlock(lfosBlk);
							getContainer().getGoqrpls().gCheckFailure();
							// 	execute_query;
							lastRecord();
							getContainer().getGoqrpls().gCheckFailure();
							cntLfos = getCursorRecord().toInt32();
							goBlock(lcurBlk);
							getContainer().getGoqrpls().gCheckFailure();
								break;
						}
						if ( !isInLastRecord() )
						{
							nextRecord();
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
					if ( !saveLfosRowid.isNull() )
					{
						recs = 0;
						goBlock(lfosBlk);
						getContainer().getGoqrpls().gCheckFailure();
						// - add clear block and execute query for 7.3.1
						// - after curric error when cursor is on lfos block
						// - the record is not appearing correctly 
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						if ( getCursorRecord().greater(1) )
						{
							firstRecord();
						}
						getContainer().getGoqrpls().gCheckFailure();
						if ( cntLfos>1 )
						{
							for ( recs = 1; recs <= cntLfos; recs++ )
							{
								if ( sorlfosElement.getSovlfosRowid().equals(saveLfosRowid) )
								{
										break;
								}
								if ( !isInLastRecord() )
								{
									nextRecord();
									getContainer().getGoqrpls().gCheckFailure();
								}
							}
						}
					}
					else {
						//  how can the lfos rowid be null?
						goBlock(lfosBlk);
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						firstRecord();
						getContainer().getGoqrpls().gCheckFailure();
					}
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					//  message('message text: ' || message_text); message(' ' );
					if ( saveItem.notEquals(getCurrentItem()) )
					{
						goItem(saveItem);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.VALIDATE_ATTACHED_MAJOR
		 -- execute_trigger('validate_attached_major');

declare 
lv_majr sorlfos.sorlfos_majr_code%type;
lv_seqno sorlfos.sorlfos_seqno%type; 
lv_max_seqno sorlfos.sorlfos_seqno%type;
lv_prior_no sorlfos.sorlfos_priority_no%type;
 
cursor max_tfos is 	
  select sotlfos_seqno, sotlfos_priority_no
  from  sobcact, sotlfos
  where sotlfos_lcur_seqno = :sorlcur_seqno
  and sotlfos_lfst_code = sb_fieldofstudy_str.f_major
  and sobcact_cact_code = sotlfos_cact_code
  and sobcact_active_ind = 'Y'
  and sotlfos_pidm = :sorlcur_pidm
  and sotlfos_majr_code = :sorlfos_majr_code_attach
  and sotlfos_seqno = ( select max(m.sotlfos_seqno)
     from sotlfos m
     where m.sotlfos_pidm = :sorlfos_pidm
     and m.sotlfos_lcur_seqno = :sorlcur_seqno
     and m.sotlfos_lfst_code = sb_fieldofstudy_str.f_major
     and m.sotlfos_priority_no = sotlfos.sotlfos_priority_no)
  order by sotlfos_seqno desc;

cursor majr_tfos is 
  select max(sotlfos_seqno)
  from sotlfos
  where sotlfos_lcur_seqno = :sorlcur_seqno
  and sotlfos_lfst_code = sb_fieldofstudy_str.f_major 
  and sotlfos_pidm = :sorlcur_pidm
  and sotlfos_priority_no = lv_prior_no;
  
cursor conc_c is 
	   select sorccon_cmjr_rule
	   from   sorcmjr x, sorccon a
	   where  x.sorcmjr_curr_rule = :sorlcur_curr_rule
	   and    x.sorcmjr_majr_code = :sorlfos_majr_code_attach
	   and    x.sorcmjr_cmjr_rule = a.sorccon_cmjr_rule
 	   and    (decode(x.sorcmjr_rec_ind,'Y','R') = :module_ind
	           or decode(x.sorcmjr_adm_ind,'Y','A') = :module_ind
	           or decode(x.sorcmjr_his_ind,'Y','H') = :module_ind
	           or decode(x.sorcmjr_stu_ind,'Y','S') = :module_ind
	           or decode(x.sorcmjr_dau_ind,'Y','M') = :module_ind)      
	   and    x.sorcmjr_term_code_eff = 
	          (select max(y.sorcmjr_term_code_eff) from sorcmjr y
	            where y.sorcmjr_curr_rule = x.sorcmjr_curr_rule
	            and   y.sorcmjr_majr_code = x.sorcmjr_majr_code
	            and   y.sorcmjr_term_code_eff <=
	            nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)))
	   and    a.sorccon_majr_code_conc = :sorlfos_majr_code 
	   and    a.sorccon_curr_rule = :sorlcur_curr_rule 
 	   and    (decode(a.sorccon_rec_ind,'Y','R') = :module_ind
	           or decode(a.sorccon_adm_ind,'Y','A') = :module_ind
	           or decode(a.sorccon_his_ind,'Y','H') = :module_ind
	           or decode(a.sorccon_stu_ind,'Y','S') = :module_ind
	           or decode(a.sorccon_dau_ind,'Y','M') = :module_ind)  
	   and    a.sorccon_term_code_eff  = 
				    (select max(m.sorccon_term_code_eff) from sorccon m
				      where m.sorccon_curr_rule = a.sorccon_curr_rule
				      and   m.sorccon_majr_code_conc = a.sorccon_majr_code_conc
				      and   m.sorccon_cmjr_rule = a.sorccon_cmjr_rule 
				      and   m.sorccon_term_code_eff <= 
				      nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)));
 begin 
 
	
	open max_tfos;
	fetch max_tfos into lv_seqno, lv_prior_no;  -- fetch only one row, the one with the highest seq
	if max_tfos%notfound then 
		message( G$_NLS.Get('SOQOLIB-0099', 'FORM','Attached major is not an active major for the curriculum.') );
    raise form_trigger_failure;
	else
		open majr_tfos;
		fetch majr_tfos into lv_max_seqno;  -- verify that the seqno is the current for the priority
		if lv_max_seqno <> lv_seqno then 
		 	message( G$_NLS.Get('SOQOLIB-0100', 'FORM','Attached major is not a current major for the curriculum.') );
      raise form_trigger_failure;
		end if;
		close majr_tfos;
	end if;
	close max_tfos;
 

    open conc_c;   
    fetch conc_c into :sorlfos_conc_attach_rule;
    close conc_c;

end; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.VALIDATE_ATTACHED_MAJOR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_ATTACHED_MAJOR")
		public void Soqolib_ValidateAttachedMajor()
		{
			
				//  execute_trigger('validate_attached_major');

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NString lvMajr= NString.getNull();
					NNumber lvSeqno= NNumber.getNull();
					NNumber lvMaxSeqno= NNumber.getNull();
					NNumber lvPriorNo= NNumber.getNull();
					String sqlmaxTfos = "SELECT sotlfos_seqno, sotlfos_priority_no " +
	" FROM sobcact, sotlfos " +
	" WHERE sotlfos_lcur_seqno = :SORLCUR_SEQNO AND sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND sobcact_cact_code = sotlfos_cact_code AND sobcact_active_ind = 'Y' AND sotlfos_pidm = :SORLCUR_PIDM AND sotlfos_majr_code = :SORLFOS_MAJR_CODE_ATTACH AND sotlfos_seqno = (SELECT max(m.sotlfos_seqno) " +
		" FROM sotlfos m " +
		" WHERE m.sotlfos_pidm = :SORLFOS_PIDM AND m.sotlfos_lcur_seqno = :SORLCUR_SEQNO AND m.sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND m.sotlfos_priority_no = sotlfos.sotlfos_priority_no ) " +
	" ORDER BY sotlfos_seqno DESC";
					DataCursor maxTfos = new DataCursor(sqlmaxTfos);
					String sqlmajrTfos = "SELECT max(sotlfos_seqno) " +
	" FROM sotlfos " +
	" WHERE sotlfos_lcur_seqno = :SORLCUR_SEQNO AND sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND sotlfos_pidm = :SORLCUR_PIDM AND sotlfos_priority_no = :P_LV_PRIOR_NO ";
					DataCursor majrTfos = new DataCursor(sqlmajrTfos);
					String sqlconcC = "SELECT sorccon_cmjr_rule " +
	" FROM sorcmjr x, sorccon a " +
	" WHERE x.sorcmjr_curr_rule = :SORLCUR_CURR_RULE AND x.sorcmjr_majr_code = :SORLFOS_MAJR_CODE_ATTACH AND x.sorcmjr_cmjr_rule = a.sorccon_cmjr_rule AND (decode(x.sorcmjr_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(x.sorcmjr_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(x.sorcmjr_his_ind, 'Y', 'H') = :MODULE_IND OR decode(x.sorcmjr_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(x.sorcmjr_dau_ind, 'Y', 'M') = :MODULE_IND) AND x.sorcmjr_term_code_eff = (SELECT max(y.sorcmjr_term_code_eff) " +
		" FROM sorcmjr y " +
		" WHERE y.sorcmjr_curr_rule = x.sorcmjr_curr_rule AND y.sorcmjr_majr_code = x.sorcmjr_majr_code AND y.sorcmjr_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) AND a.sorccon_majr_code_conc = :SORLFOS_MAJR_CODE AND a.sorccon_curr_rule = :SORLCUR_CURR_RULE AND (decode(a.sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(a.sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(a.sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(a.sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(a.sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND a.sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = a.sorccon_curr_rule AND m.sorccon_majr_code_conc = a.sorccon_majr_code_conc AND m.sorccon_cmjr_rule = a.sorccon_cmjr_rule AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concC = new DataCursor(sqlconcC);
					//Setting query parameters
					maxTfos.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
					maxTfos.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
					maxTfos.addParameter("SORLFOS_MAJR_CODE_ATTACH", sorlfosElement.getSorlfosMajrCodeAttach());
					maxTfos.addParameter("SORLFOS_PIDM", sorlfosElement.getSorlfosPidm());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxTfos.
					maxTfos.open();
					ResultSet maxTfosResults = maxTfos.fetchInto();
					if ( maxTfosResults != null ) {
						lvSeqno = maxTfosResults.getNumber(0);
						lvPriorNo = maxTfosResults.getNumber(1);
					}
					//  fetch only one row, the one with the highest seq
					if ( maxTfos.notFound() )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0099"), toStr("FORM"), toStr("Attached major is not an active major for the curriculum.")));
						throw new ApplicationException();
					}
					else {
						//Setting query parameters
						majrTfos.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
						majrTfos.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						majrTfos.addParameter("P_LV_PRIOR_NO", lvPriorNo);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable majrTfos.
						majrTfos.open();
						ResultSet majrTfosResults = majrTfos.fetchInto();
						if ( majrTfosResults != null ) {
							lvMaxSeqno = majrTfosResults.getNumber(0);
						}
						//  verify that the seqno is the current for the priority
						if ( lvMaxSeqno.notEquals(lvSeqno) )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0100"), toStr("FORM"), toStr("Attached major is not a current major for the curriculum.")));
							throw new ApplicationException();
						}
						majrTfos.close();
					}
					maxTfos.close();
					//Setting query parameters
					concC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
					concC.addParameter("SORLFOS_MAJR_CODE_ATTACH", sorlfosElement.getSorlfosMajrCodeAttach());
					concC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
					concC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
					concC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
					concC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
					concC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable concC.
					concC.open();
					ResultSet concCResults = concC.fetchInto();
					if ( concCResults != null ) {
						sorlfosElement.setSorlfosConcAttachRule(concCResults.getNumber(0));
					}
					concC.close();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_CONC_BASE_ATTACHED
		 declare 
	
	lv_base_exists varchar2(1) := 'N'; 
	lv_major_attached varchar2(1) := 'N'; 
	lv_any_attached varchar2(1) := null; 
	
cursor conc_cnt_c is 
	   select 'Y' 
	   from  sorccon
	   where  sorccon_curr_rule = :sorlcur_curr_rule 
	   and (decode(sorccon_rec_ind,'Y','R') = :module_ind
			or decode(sorccon_adm_ind,'Y','A') = :module_ind
			or decode(sorccon_his_ind,'Y','H') = :module_ind
			or decode(sorccon_stu_ind,'Y','S') = :module_ind
			or decode(sorccon_dau_ind,'Y','M') = :module_ind)
	   and sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = sorccon_curr_rule
				 and m.sorccon_majr_code_conc = sorccon_majr_code_conc 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))) ;

cursor conc_base_c is 
	   select 'Y' 
	   from  sorccon
	   where  sorccon_cmjr_rule is null  
	   and sorccon_curr_rule = :sorlcur_curr_rule 
	   and (decode(sorccon_rec_ind,'Y','R') = :module_ind
			or decode(sorccon_adm_ind,'Y','A') = :module_ind
			or decode(sorccon_his_ind,'Y','H') = :module_ind
			or decode(sorccon_stu_ind,'Y','S') = :module_ind
			or decode(sorccon_dau_ind,'Y','M') = :module_ind)
	   and sorccon_term_code_eff  = 
				(select max(m.sorccon_term_code_eff) from sorccon m
				 where m.sorccon_curr_rule = sorccon_curr_rule
				 and m.sorccon_majr_code_conc = sorccon_majr_code_conc 
				 and m.sorccon_term_code_eff <= 
				   nvl(:sorlfos_term_code_ctlg,nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code))) ;
				   
	cursor conc_majr_c is 
		select  'Y'
   from    sorccon 
   where  sorccon_curr_rule = :sorlcur_curr_rule
   and (decode(sorccon_rec_ind,'Y','R') = :module_ind
	 or decode(sorccon_adm_ind,'Y','A') = :module_ind
	 or decode(sorccon_his_ind,'Y','H') = :module_ind
	 or decode(sorccon_stu_ind,'Y','S') = :module_ind
	 or decode(sorccon_dau_ind,'Y','M') = :module_ind)
   	and sorccon_term_code_eff = 
		  ( select max(m.sorccon_term_code_eff) 
		   from sorccon m
		   where m.sorccon_curr_rule = :hold_curr_rule
		   and m.sorccon_majr_code_conc =  sorccon_majr_code_conc 
		   and m.sorccon_term_code_eff <= nvl(:sorlfos_term_code_ctlg, 
		        nvl(:sorlcur_term_code_ctlg,:sorlcur_term_code)) )  
    and exists 
		  ( select 'x' 
		  from sorcmjr, sobcact,  sotlfos od
		  where  sorcmjr_curr_rule = :sorlcur_curr_rule
		  and sorcmjr_cmjr_rule = sorccon_cmjr_rule 
		  and od.sotlfos_lfst_code = sb_fieldofstudy_str.f_major
		  and od.sotlfos_lcur_seqno = :sorlcur_seqno
		  and od.sotlfos_pidm = :sorlcur_pidm
		  and sobcact_cact_code = od.sotlfos_cact_code
		  and sobcact_active_ind = 'Y'
		  and sotlfos_seqno =  ( select max(mx.sotlfos_seqno)
		     from sotlfos mx
		     where mx.sotlfos_lfst_code = sb_fieldofstudy_str.f_major
		     and mx.sotlfos_priority_no = od.sotlfos_priority_no 
		     and mx.sotlfos_pidm = :sorlcur_pidm
		     and mx.sotlfos_lcur_seqno = :sorlcur_seqno) )  ;
	
  		   
begin  
	
	--  curriculum checking is not turned on so allow anything 
  if	:lcur_temp_rule_ind = 'N' then 
  	 :lfos_concbase_attach_ind := NULL;
		 :lfos_concmajr_attach_ind := NULL;
  else 
  	
 	
    -- check to see if there are any curriculum defined in the curr rules,
    -- if not, allow anything 
		open conc_cnt_c;
		fetch conc_cnt_c into lv_any_attached;
		if conc_cnt_c%notfound then 
			:lfos_concbase_attach_ind := NULL;
			-- concentrations not allowed to be attached to majors on soactrl
			if :lcur_sobctrl_conc_ind = 'N' then 
  	  	:lfos_concmajr_attach_ind := 'N';
			else 
		  	:lfos_concmajr_attach_ind := NULL;
			end if;
			close conc_cnt_c;
			return; 
		end if;
		close conc_cnt_c;
	
	  -- find out if there are any concentrations attached to the base 
	 	open conc_base_c;
		fetch conc_base_c into :lfos_concbase_attach_ind;
		if conc_base_c%notfound then 
			:lfos_concbase_attach_ind := 'N';
		end if; 
		close conc_base_c;
		
		-- find out if there are concentrations attached to specific majors 
		-- concentrations allowed to be attached to majors on soactrl
	  IF :lcur_sobctrl_conc_ind = 'Y' then  
			open conc_majr_c;
			fetch conc_majr_c into :lfos_concmajr_attach_ind;
			if conc_majr_c%notfound then 
				:lfos_concmajr_attach_ind := 'N';
			end if; 
			close conc_majr_c; 
		else 
			:lfos_concmajr_attach_ind := 'N';
		end if; 
	
	end if; 
end ;

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_CONC_BASE_ATTACHED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_CONC_BASE_ATTACHED")
		public void Soqolib_LfosConcBaseAttached()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NString lvBaseExists = toStr("N");
					NString lvMajorAttached = toStr("N");
					NString lvAnyAttached = NString.getNull();
					String sqlconcCntC = "SELECT 'Y' " +
	" FROM sorccon " +
	" WHERE sorccon_curr_rule = :SORLCUR_CURR_RULE AND (decode(sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = sorccon_curr_rule AND m.sorccon_majr_code_conc = sorccon_majr_code_conc AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concCntC = new DataCursor(sqlconcCntC);
					String sqlconcBaseC = "SELECT 'Y' " +
	" FROM sorccon " +
	" WHERE sorccon_cmjr_rule IS NULL AND sorccon_curr_rule = :SORLCUR_CURR_RULE AND (decode(sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = sorccon_curr_rule AND m.sorccon_majr_code_conc = sorccon_majr_code_conc AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) ";
					DataCursor concBaseC = new DataCursor(sqlconcBaseC);
					String sqlconcMajrC = "SELECT 'Y' " +
	" FROM sorccon " +
	" WHERE sorccon_curr_rule = :SORLCUR_CURR_RULE AND (decode(sorccon_rec_ind, 'Y', 'R') = :MODULE_IND OR decode(sorccon_adm_ind, 'Y', 'A') = :MODULE_IND OR decode(sorccon_his_ind, 'Y', 'H') = :MODULE_IND OR decode(sorccon_stu_ind, 'Y', 'S') = :MODULE_IND OR decode(sorccon_dau_ind, 'Y', 'M') = :MODULE_IND) AND sorccon_term_code_eff = (SELECT max(m.sorccon_term_code_eff) " +
		" FROM sorccon m " +
		" WHERE m.sorccon_curr_rule = :HOLD_CURR_RULE AND m.sorccon_majr_code_conc = sorccon_majr_code_conc AND m.sorccon_term_code_eff <= nvl(:SORLFOS_TERM_CODE_CTLG, nvl(:SORLCUR_TERM_CODE_CTLG, :SORLCUR_TERM_CODE)) ) AND  EXISTS(SELECT 'x' " +
		" FROM sorcmjr, sobcact, sotlfos od " +
		" WHERE sorcmjr_curr_rule = :SORLCUR_CURR_RULE AND sorcmjr_cmjr_rule = sorccon_cmjr_rule AND od.sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND od.sotlfos_lcur_seqno = :SORLCUR_SEQNO AND od.sotlfos_pidm = :SORLCUR_PIDM AND sobcact_cact_code = od.sotlfos_cact_code AND sobcact_active_ind = 'Y' AND sotlfos_seqno = (SELECT max(mx.sotlfos_seqno) " +
			" FROM sotlfos mx " +
			" WHERE mx.sotlfos_lfst_code = sb_fieldofstudy_str.f_major AND mx.sotlfos_priority_no = od.sotlfos_priority_no AND mx.sotlfos_pidm = :SORLCUR_PIDM AND mx.sotlfos_lcur_seqno = :SORLCUR_SEQNO ) ) ";
					DataCursor concMajrC = new DataCursor(sqlconcMajrC);
					//   curriculum checking is not turned on so allow anything 
					if ( getFormModel().getSCurricula().getLcurTempRuleInd().equals("N") )
					{
						sorlcurElement.setLfosConcbaseAttachInd(toStr(null));
						sorlcurElement.setLfosConcmajrAttachInd(toStr(null));
					}
					else {
						//  check to see if there are any curriculum defined in the curr rules,
						//  if not, allow anything 
						//Setting query parameters
						concCntC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
						concCntC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						concCntC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
						concCntC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						concCntC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable concCntC.
						concCntC.open();
						ResultSet concCntCResults = concCntC.fetchInto();
						if ( concCntCResults != null ) {
							lvAnyAttached = concCntCResults.getStr(0);
						}
						if ( concCntC.notFound() )
						{
							sorlcurElement.setLfosConcbaseAttachInd(toStr(null));
							//  concentrations not allowed to be attached to majors on soactrl
							if ( getFormModel().getSCurricula().getLcurSobctrlConcInd().equals("N") )
							{
								sorlcurElement.setLfosConcmajrAttachInd(toStr("N"));
							}
							else {
								sorlcurElement.setLfosConcmajrAttachInd(toStr(null));
							}
							concCntC.close();
							return ;
						}
						concCntC.close();
						//  find out if there are any concentrations attached to the base 
						//Setting query parameters
						concBaseC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
						concBaseC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
						concBaseC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
						concBaseC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
						concBaseC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable concBaseC.
						concBaseC.open();
						ResultSet concBaseCResults = concBaseC.fetchInto();
						if ( concBaseCResults != null ) {
							sorlcurElement.setLfosConcbaseAttachInd(concBaseCResults.getStr(0));
						}
						if ( concBaseC.notFound() )
						{
							sorlcurElement.setLfosConcbaseAttachInd(toStr("N"));
						}
						concBaseC.close();
						//  find out if there are concentrations attached to specific majors 
						//  concentrations allowed to be attached to majors on soactrl
						if ( getFormModel().getSCurricula().getLcurSobctrlConcInd().equals("Y") )
						{
							//Setting query parameters
							concMajrC.addParameter("SORLCUR_CURR_RULE", sorlcurElement.getSorlcurCurrRule());
							concMajrC.addParameter("MODULE_IND", getFormModel().getSCurrProcBlock().getModuleInd());
							concMajrC.addParameter("HOLD_CURR_RULE", getFormModel().getSCurrProcBlock().getHoldCurrRule());
							concMajrC.addParameter("SORLFOS_TERM_CODE_CTLG", sorlfosElement.getSorlfosTermCodeCtlg());
							concMajrC.addParameter("SORLCUR_TERM_CODE_CTLG", sorlcurElement.getSorlcurTermCodeCtlg());
							concMajrC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
							concMajrC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							concMajrC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable concMajrC.
							concMajrC.open();
							ResultSet concMajrCResults = concMajrC.fetchInto();
							if ( concMajrCResults != null ) {
								sorlcurElement.setLfosConcmajrAttachInd(concMajrCResults.getStr(0));
							}
							if ( concMajrC.notFound() )
							{
								sorlcurElement.setLfosConcmajrAttachInd(toStr("N"));
							}
							concMajrC.close();
						}
						else {
							sorlcurElement.setLfosConcmajrAttachInd(toStr("N"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LFOS_LOV_ERROR_MSG
		 message(G$_NLS.Get('SOQOLIB-0101','FORM', 'List of values and search options are not available on existing records.'));
raise form_trigger_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LFOS_LOV_ERROR_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LFOS_LOV_ERROR_MSG")
		public void Soqolib_LfosLovErrorMsg()
		{
			
				warningMessage(GNls.Fget(toStr("SOQOLIB-0101"), toStr("FORM"), toStr("List of values and search options are not available on existing records.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.SUMMARY_BLOCK_PREFORM
		 -- pre form trigger for summary blocks to make 
-- learner specific columns invisible 

set_item_property('sovlcur.sovlcur_stvrate_desc', visible, property_false);
set_item_property('sovlcur.sovlcur_stvstyp_desc', visible, property_false);
set_item_property('sovlcur.sovlcur_term_code_admit', visible, property_false); 
set_item_property('sovlcur.sovlcur_stvadmt_desc', visible, property_false); 
set_item_property('sovlcur.sovlcur_term_code_matric', visible, property_false); 
set_item_property('sovlcur.sovlcur_dgmr_seqno', visible, property_false); 
set_item_property('sovlcur.sovlcur_term_code_end', visible, property_false);
set_item_property('sovlcur.sovlcur_key_seqno', visible, property_false);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.SUMMARY_BLOCK_PREFORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SUMMARY_BLOCK_PREFORM")
		public void Soqolib_SummaryBlockPreform()
		{
			
				//  pre form trigger for summary blocks to make 
				//  learner specific columns invisible 
				//  pre form trigger for summary blocks to make 
				//  learner specific columns invisible 
				setItemVisible("sovlcur.sovlcur_stvrate_desc", false);
				setItemVisible("sovlcur.sovlcur_stvstyp_desc", false);
				setItemVisible("sovlcur.sovlcur_term_code_admit", false);
				setItemVisible("sovlcur.sovlcur_stvadmt_desc", false);
				setItemVisible("sovlcur.sovlcur_term_code_matric", false);
				setItemVisible("sovlcur.sovlcur_dgmr_seqno", false);
				setItemVisible("sovlcur.sovlcur_term_code_end", false);
				setItemVisible("sovlcur.sovlcur_key_seqno", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.QUERY_FORM_VISIBLE
		 if :s$_curricula.module_code <> sb_curriculum_str.f_learner then 
	set_item_property('LCUR_ROLLED_KEY_SEQNO',VISIBLE, PROPERTY_FALSE);
	set_item_property('SOVLCUR_APPL_KEY_SEQNO',VISIBLE, PROPERTY_FALSE);
  set_item_property('lfos_rolled_ind',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_TERM_CODE_MATRIC',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_TERM_CODE_ADMIT',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_MATRIC_TERM_DESC',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_ADMT_TERM_DESC',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_TERM_CODE_END',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_GAPP_SEQNO',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_END_TERM_DESC',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_ADMT_CODE',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_ADMT_DESC',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_TERM_CODE_MATRIC_LBT',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_TERM_CODE_ADMIT_LBT',VISIBLE, PROPERTY_FALSE);
  set_item_property('SORLCUR_TERM_CODE_END_LBT',VISIBLE, PROPERTY_FALSE);
	set_item_property('SORLCUR_ADMT_CODE_LBT',VISIBLE, PROPERTY_FALSE);
 	set_item_property('SORLCUR_ROLL_IND',VISIBLE, PROPERTY_FALSE);
  set_radio_button_property('SORLCUR_ROLL_IND','YES_ROLL', VISIBLE, PROPERTY_FALSE);
	set_item_property('sorlcur_rate_code_lbt',visible,property_false);
	set_item_property('sorlcur_rate_code',visible,property_false);
	set_item_property('sorlcur_rate_code_desc',visible,property_false);
	set_item_property('sorlcur_styp_code_lbt',visible,property_false);
	set_item_property('sorlcur_styp_code',visible,property_false);
	set_item_property('sorlcur_styp_code_desc',visible,property_false);
	set_item_property('sorlcur_site_code',visible,property_false);
	set_item_property('sorlcur_site_code_lbt',visible,property_false);
		set_item_property('sorlcur_site_code_desc',visible,property_false);
	set_item_property('sorlcur_leav_code_lbt',visible,property_false);
	set_item_property('sorlcur_acyr_code_lbt',visible,property_false);
	set_item_property('sorlcur_term_code_grad_lbt',visible,property_false);
	set_item_property('sorlcur_leav_from_date_dbt',visible,property_false);
	set_item_property('sorlcur_leav_to_date_dbt',visible,property_false);
	set_item_property('sorlcur_exp_grad_date_dbt',visible,property_false);
	set_item_property('sorlcur_leav_code',visible,property_false);
	set_item_property('sorlcur_acyr_code',visible,property_false);
	set_item_property('sorlcur_term_code_grad',visible,property_false);
	set_item_property('sorlcur_leav_from_date',visible,property_false);
	set_item_property('sorlcur_leav_to_date',visible,property_false);
	set_item_property('sorlcur_exp_grad_date',visible,property_false);
	set_item_property('sorlcur_leav_code_desc',visible,property_false);
	set_item_property('sorlcur_acyr_code_desc',visible,property_false);
	set_item_property('sorlcur_term_code_grad_desc',visible,property_false);
ELSE 
  if get_item_property('sorlcur_term_code_matric', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_TERM_CODE_MATRIC',VISIBLE, PROPERTY_TRUE);
  end if; 
  if get_item_property('sorlcur_term_code_admit', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_TERM_CODE_ADMIT',VISIBLE, PROPERTY_TRUE);
  end if;
  if get_item_property('sorlcur_term_code_end', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_TERM_CODE_END',VISIBLE, PROPERTY_TRUE);	
  end if;
    if get_item_property('sorlcur_term_code_grad', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_TERM_CODE_grad',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_rate_code', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_rate_CODE',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_styp_code', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_styp_CODE',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_leav_code', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_leav_CODE',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_acyr_code', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_acyr_CODE',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_exp_grad_date', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_TERM_CODE_END',VISIBLE, PROPERTY_TRUE);	
	end if;
  if get_item_property('sorlcur_leav_from_date', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_leav_from_date',VISIBLE, PROPERTY_TRUE);	
  end if;
    if get_item_property('sorlcur_leav_to_date', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_leav_to_date',VISIBLE, PROPERTY_TRUE);	
	end if;
    if get_item_property('sorlcur_gapp_seqno', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_gapp_seqno',VISIBLE, PROPERTY_TRUE);	
	end if;

	set_item_property('SORLCUR_MATRIC_TERM_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_ADMT_TERM_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_END_TERM_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_rate_code_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_acyr_code_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_styp_code_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_term_code_grad_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_leav_code_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_site_code_DESC',VISIBLE, PROPERTY_TRUE);

  if get_item_property('sorlcur_admt_code', visible) = 'FALSE' then 
  	set_item_property('SORLCUR_ADMT_CODE',VISIBLE, PROPERTY_TRUE);
	end if;
	set_item_property('SORLCUR_ADMT_DESC',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_TERM_CODE_MATRIC_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_TERM_CODE_END_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_TERM_CODE_ADMIT_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_ADMT_CODE_LBT',VISIBLE, PROPERTY_TRUE);
 	set_item_property('SORLCUR_rate_CODE_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_site_CODE_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_styp_CODE_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_acyr_CODE_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_term_code_grad_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_leav_CODE_LBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_leav_from_date_dBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_leav_to_date_dBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('SORLCUR_exp_grad_date_dBT',VISIBLE, PROPERTY_TRUE);
	set_item_property('LCUR_ROLLED_KEY_SEQNO',VISIBLE, PROPERTY_TRUE);
  set_item_property('lfos_rolled_ind',VISIBLE, PROPERTY_TRUE);
  	set_item_property('SOVLCUR_APPL_KEY_SEQNO',VISIBLE, PROPERTY_TRUE);


--	set_radio_button_property('SORLCUR.SORLCUR_ROLL_IND', 'YES_ROLL',VISIBLE, PROPERTY_TRUE);
	
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.QUERY_FORM_VISIBLE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QUERY_FORM_VISIBLE")
		public void Soqolib_QueryFormVisible()
		{
			
				if ( getFormModel().getSCurricula().getModuleCode().notEquals(SbCurriculumStr.fLearner()) )
				{
					setItemVisible("LCUR_ROLLED_KEY_SEQNO", false);
					setItemVisible("SOVLCUR_APPL_KEY_SEQNO", false);
					setItemVisible("lfos_rolled_ind", false);
					setItemVisible("SORLCUR_TERM_CODE_MATRIC", false);
					setItemVisible("SORLCUR_TERM_CODE_ADMIT", false);
					setItemVisible("SORLCUR_MATRIC_TERM_DESC", false);
					setItemVisible("SORLCUR_ADMT_TERM_DESC", false);
					setItemVisible("SORLCUR_TERM_CODE_END", false);
					setItemVisible("SORLCUR_GAPP_SEQNO", false);
					setItemVisible("SORLCUR_END_TERM_DESC", false);
					setItemVisible("SORLCUR_ADMT_CODE", false);
					setItemVisible("SORLCUR_ADMT_DESC", false);
					setItemVisible("SORLCUR_TERM_CODE_MATRIC_LBT", false);
					setItemVisible("SORLCUR_TERM_CODE_ADMIT_LBT", false);
					setItemVisible("SORLCUR_TERM_CODE_END_LBT", false);
					setItemVisible("SORLCUR_ADMT_CODE_LBT", false);
					setItemVisible("SORLCUR_ROLL_IND", false);
					setRadioButtonVisible("SORLCUR_ROLL_IND", "YES_ROLL", false);
					setItemVisible("sorlcur_rate_code_lbt", false);
					setItemVisible("sorlcur_rate_code", false);
					setItemVisible("sorlcur_rate_code_desc", false);
					setItemVisible("sorlcur_styp_code_lbt", false);
					setItemVisible("sorlcur_styp_code", false);
					setItemVisible("sorlcur_styp_code_desc", false);
					setItemVisible("sorlcur_site_code", false);
					setItemVisible("sorlcur_site_code_lbt", false);
					setItemVisible("sorlcur_site_code_desc", false);
					setItemVisible("sorlcur_leav_code_lbt", false);
					setItemVisible("sorlcur_acyr_code_lbt", false);
					setItemVisible("sorlcur_term_code_grad_lbt", false);
					setItemVisible("sorlcur_leav_from_date_dbt", false);
					setItemVisible("sorlcur_leav_to_date_dbt", false);
					setItemVisible("sorlcur_exp_grad_date_dbt", false);
					setItemVisible("sorlcur_leav_code", false);
					setItemVisible("sorlcur_acyr_code", false);
					setItemVisible("sorlcur_term_code_grad", false);
					setItemVisible("sorlcur_leav_from_date", false);
					setItemVisible("sorlcur_leav_to_date", false);
					setItemVisible("sorlcur_exp_grad_date", false);
					setItemVisible("sorlcur_leav_code_desc", false);
					setItemVisible("sorlcur_acyr_code_desc", false);
					setItemVisible("sorlcur_term_code_grad_desc", false);
				}
				else {
					if ( getItemVisible("sorlcur_term_code_matric").equals("FALSE") )
					{
						setItemVisible("SORLCUR_TERM_CODE_MATRIC", true);
					}
					if ( getItemVisible("sorlcur_term_code_admit").equals("FALSE") )
					{
						setItemVisible("SORLCUR_TERM_CODE_ADMIT", true);
					}
					if ( getItemVisible("sorlcur_term_code_end").equals("FALSE") )
					{
						setItemVisible("SORLCUR_TERM_CODE_END", true);
					}
					if ( getItemVisible("sorlcur_term_code_grad").equals("FALSE") )
					{
						setItemVisible("SORLCUR_TERM_CODE_grad", true);
					}
					if ( getItemVisible("sorlcur_rate_code").equals("FALSE") )
					{
						setItemVisible("SORLCUR_rate_CODE", true);
					}
					if ( getItemVisible("sorlcur_styp_code").equals("FALSE") )
					{
						setItemVisible("SORLCUR_styp_CODE", true);
					}
					if ( getItemVisible("sorlcur_leav_code").equals("FALSE") )
					{
						setItemVisible("SORLCUR_leav_CODE", true);
					}
					if ( getItemVisible("sorlcur_acyr_code").equals("FALSE") )
					{
						setItemVisible("SORLCUR_acyr_CODE", true);
					}
					if ( getItemVisible("sorlcur_exp_grad_date").equals("FALSE") )
					{
						setItemVisible("SORLCUR_TERM_CODE_END", true);
					}
					if ( getItemVisible("sorlcur_leav_from_date").equals("FALSE") )
					{
						setItemVisible("SORLCUR_leav_from_date", true);
					}
					if ( getItemVisible("sorlcur_leav_to_date").equals("FALSE") )
					{
						setItemVisible("SORLCUR_leav_to_date", true);
					}
					if ( getItemVisible("sorlcur_gapp_seqno").equals("FALSE") )
					{
						setItemVisible("SORLCUR_gapp_seqno", true);
					}
					setItemVisible("SORLCUR_MATRIC_TERM_DESC", true);
					setItemVisible("SORLCUR_ADMT_TERM_DESC", true);
					setItemVisible("SORLCUR_END_TERM_DESC", true);
					setItemVisible("SORLCUR_rate_code_DESC", true);
					setItemVisible("SORLCUR_acyr_code_DESC", true);
					setItemVisible("SORLCUR_styp_code_DESC", true);
					setItemVisible("SORLCUR_term_code_grad_DESC", true);
					setItemVisible("SORLCUR_leav_code_DESC", true);
					setItemVisible("SORLCUR_site_code_DESC", true);
					if ( getItemVisible("sorlcur_admt_code").equals("FALSE") )
					{
						setItemVisible("SORLCUR_ADMT_CODE", true);
					}
					setItemVisible("SORLCUR_ADMT_DESC", true);
					setItemVisible("SORLCUR_TERM_CODE_MATRIC_LBT", true);
					setItemVisible("SORLCUR_TERM_CODE_END_LBT", true);
					setItemVisible("SORLCUR_TERM_CODE_ADMIT_LBT", true);
					setItemVisible("SORLCUR_ADMT_CODE_LBT", true);
					setItemVisible("SORLCUR_rate_CODE_LBT", true);
					setItemVisible("SORLCUR_site_CODE_LBT", true);
					setItemVisible("SORLCUR_styp_CODE_LBT", true);
					setItemVisible("SORLCUR_acyr_CODE_LBT", true);
					setItemVisible("SORLCUR_term_code_grad_LBT", true);
					setItemVisible("SORLCUR_leav_CODE_LBT", true);
					setItemVisible("SORLCUR_leav_from_date_dBT", true);
					setItemVisible("SORLCUR_leav_to_date_dBT", true);
					setItemVisible("SORLCUR_exp_grad_date_dBT", true);
					setItemVisible("LCUR_ROLLED_KEY_SEQNO", true);
					setItemVisible("lfos_rolled_ind", true);
					setItemVisible("SOVLCUR_APPL_KEY_SEQNO", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.NEW_SORLCUR
		 	
-- new trigger to create new sorlcur record and fill in defaults 
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind;
if :sorlcur_cact_code is null then 
  :sorlcur_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlcur_term_code is null then 
 :sorlcur_term_code := :s$_curricula.module_term_code;
 :sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
 if :lcur_sobctrl_curr_rule_ind = 'Y' and
    :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
  end if;
end if;

Retrieve_defaults(p_lmod_code => :s$_curricula.module_code);
Case :s$_curricula.module_code
    When  sb_curriculum_str.f_recruit then 
    	:sorlcur_levl_code := :global.recruit_levl_code;
    	:sorlcur_camp_code := :global.recruit_camp_code;
    	:sorlcur_coll_code := :global.recruit_coll_code;
    	:sorlcur_degc_code := :global.recruit_degc_code;
    	:sorlcur_program := :global.recruit_program; 

    When  sb_curriculum_str.f_admissions then 
    	:sorlcur_levl_code := :global.admissions_levl_code;
    	:sorlcur_camp_code := :global.admissions_camp_code;
    	:sorlcur_coll_code := :global.admissions_coll_code;
    	:sorlcur_degc_code := :global.admissions_degc_code;
    	:sorlcur_program := :global.admissions_program; 
    When  sb_curriculum_str.f_learner  then 
    	:sorlcur_levl_code := :global.learner_levl_code;
    	:sorlcur_camp_code := :global.learner_camp_code;
    	:sorlcur_coll_code := :global.learner_coll_code;
    	:sorlcur_degc_code := :global.learner_degc_code;
    	:sorlcur_program := :global.learner_program; 
    When  sb_curriculum_str.f_outcome then 
    	:sorlcur_levl_code := :global.outcome_levl_code;
    	:sorlcur_camp_code := :global.outcome_camp_code;
    	:sorlcur_coll_code := :global.outcome_coll_code;
    	:sorlcur_degc_code := :global.outcome_degc_code;
	    :sorlcur_program := :global.outcome_program; 

   else
     	null;
   end case;

  :defaultinsert_inprogress := 'Y';
  if :sorlcur_program is not null and 
  	get_item_property('sorlcur_program',visible) = 'TRUE' then 
    go_item('sorlcur_program');
    g$_check_failure;
    next_item;
    g$_check_failure;
  end if; 
  execute_trigger('lcur_check_program');
  g$_check_failure;
  :defaultinsert_inprogress := 'N';
  :sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
  :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
   
-- find max priority so we can set the new records priority 
declare 
 initial_priority  sorlcur.sorlcur_priority_no%type := 0;
 
CURSOR group_priority_curr_c IS
   SELECT sotlcur_priority_no  
    FROM sotlcur 
    WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y'
    and ( (sotlcur_key_seqno = :s$_curricula.module_key_seqno
            and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
              sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome))
            or ( sotlcur_lmod_code = sb_curriculum_str.f_learner )  ) 
    and ( ( sotlcur_term_code = :s$_curricula.module_term_code 
       and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
       or ( sotlcur_lmod_code = sb_curriculum_str.f_learner
           and sotlcur_term_code < :s$_curricula.module_end_term)
       or ( sotlcur_lmod_code = sb_curriculum_str.f_outcome ) )
    AND sotlcur_pidm = :s$_curricula.module_pidm 
    and sotlcur_lmod_code = :s$_curricula.module_code
    and sotlcur_seqno = 
      ( select max(m.sotlcur_seqno)
        from sotlcur m
        where m.sotlcur_priority_no = sotlcur.sotlcur_priority_no
        and ( (sotlcur_key_seqno = :s$_curricula.module_key_seqno
            and sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
             sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome))
            or ( sotlcur_lmod_code = sb_curriculum_str.f_learner )  ) 
        and m.sotlcur_lmod_code = sotlcur.sotlcur_lmod_code
        and m.sotlcur_pidm = :s$_curricula.module_pidm 
        and ( ( m.sotlcur_term_code = :s$_curricula.module_term_code 
          and m.sotlcur_lmod_code in ( sb_curriculum_str.f_recruit,
          sb_curriculum_str.f_admissions)) 
          or ( m.sotlcur_lmod_code = sb_curriculum_str.f_learner
           and m.sotlcur_term_code < :s$_curricula.module_end_term)
          or ( m.sotlcur_lmod_code = sb_curriculum_str.f_outcome ) ) )
    ORDER BY sotlcur_priority_no desc;
begin
 initial_priority := 0; 
 open group_priority_curr_c;
 fetch group_priority_curr_c into initial_priority;
 if group_priority_curr_c%notfound then 
  	 initial_priority := 0;
 end if; 
  close group_priority_curr_c;
 if initial_priority = 0 then
	  initial_priority := :global.sobctrl_priority_no;
 else
	  initial_priority := initial_priority + :global.sobctrl_priority_incr;
 end if;
 :sorlcur_priority_no := initial_priority;
end;

--- fill in the gapp number for outcome 
declare 
	lcur_rec  sb_curriculum.curriculum_rec;
	lcur_ref  sb_curriculum.curriculum_ref;   
  
begin 
 
	 if :sorlcur_lmod_code = sb_curriculum_str.f_outcome then  
   	   if soklcur.f_rolled_awarded (p_pidm => :sorlcur_pidm,
           P_lmod_code =>  :sorlcur_lmod_code, 
           P_key_seqno => :sorlcur_key_seqno) <> 'Y' then  
        lcur_ref := sb_curriculum.f_query_current(p_pidm => :sorlcur_pidm,
           P_lmod_code =>  :sorlcur_lmod_code, 
           P_keyseqno => :sorlcur_key_seqno,
           p_active_ind => 'Y');
       loop
       	  fetch lcur_ref into lcur_rec;
       	  exit when lcur_ref%notfound;
       	  if lcur_rec.r_gapp_seqno is not null then 
   	     	 :sorlcur_gapp_seqno:= lcur_rec.r_gapp_seqno;
   	    	 exit;
   	     end if;
       end loop;
       close lcur_ref;
    else
   	   	 :sorlcur_gapp_seqno := null;
   	   end if; 
	 end if; 
end ; 

if :s$_curricula.module_code = sb_curriculum_str.f_learner   then 
	 
  declare 
  	
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_INVALID');
   cem_msg varchar2(250); 
 
  
    cntact pls_integer := 0; 
    cntfuture pls_integer := 0; 
    cursor cnt_future_c is 
      select nvl(count(*),0)
      from sgbstdn
      where sgbstdn_term_code_eff > :s$_curricula.module_term_code 
      and sgbstdn_pidm = :s$_curricula.module_pidm;
      
    cursor cnt_active_c is 
      select nvl(count(*),0)
      from sgvccur
      where sgvccur_pidm = :s$_curricula.module_pidm
      and sgvccur_order > 0 
      and sgvccur_stdn_term_code_eff > :s$_curricula.module_term_code 
      and sgvccur_priority_no = :sorlcur_priority_no ;
  begin 
  	open cnt_future_c;
  	fetch cnt_future_c into cntfuture; 
  	close cnt_future_c;
  	if cntfuture > 0 then 
  	 
      open cnt_active_c;
	    fetch cnt_active_c into cntact;
	    close cnt_active_c;
	  
	    if cntact = 0 then 
	    	 cem_msg :=  G$_NLS.Get('SOQOLIB-0102', 'FORM','Curriculum will be active in a future term and may impact fee assessment.') ;
          SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,cem_msg);
          alert_button := show_alert('CURRICULUM_INVALID');
         if alert_button = ALERT_BUTTON1 then
             null;
         end if;
	 	  
	    end if; 
	  end if; 
   end ; 
end if; 
  
-- force the when validate on the program so values from smrprle will
-- fill in

if get_item_property('sorlcur_cact_code',visible) = 'TRUE' then
   go_item('sorlcur_cact_code');
   g$_check_failure;
else 
   go_item('sorlcur_priority_no');
   g$_check_failure;
end if;
 

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.NEW_SORLCUR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NEW_SORLCUR")
		public void Soqolib_NewSorlcur()
		{
			
				//  new trigger to create new sorlcur record and fill in defaults 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				//  new trigger to create new sorlcur record and fill in defaults 
				sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
				getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
				if ( sorlcurElement.getSorlcurCactCode().isNull() )
				{
					sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
				}
				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
					sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
					}
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				this.getContainer().getServices().retrieveDefaults(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
				if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
				{
					sorlcurElement.setSorlcurLevlCode(getGlobal("RECRUIT_LEVL_CODE"));
					sorlcurElement.setSorlcurCampCode(getGlobal("RECRUIT_CAMP_CODE"));
					sorlcurElement.setSorlcurCollCode(getGlobal("RECRUIT_COLL_CODE"));
					sorlcurElement.setSorlcurDegcCode(getGlobal("RECRUIT_DEGC_CODE"));
					sorlcurElement.setSorlcurProgram(getGlobal("RECRUIT_PROGRAM"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
				{
					sorlcurElement.setSorlcurLevlCode(getGlobal("ADMISSIONS_LEVL_CODE"));
					sorlcurElement.setSorlcurCampCode(getGlobal("ADMISSIONS_CAMP_CODE"));
					sorlcurElement.setSorlcurCollCode(getGlobal("ADMISSIONS_COLL_CODE"));
					sorlcurElement.setSorlcurDegcCode(getGlobal("ADMISSIONS_DEGC_CODE"));
					sorlcurElement.setSorlcurProgram(getGlobal("ADMISSIONS_PROGRAM"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
				{
					sorlcurElement.setSorlcurLevlCode(getGlobal("LEARNER_LEVL_CODE"));
					sorlcurElement.setSorlcurCampCode(getGlobal("LEARNER_CAMP_CODE"));
					sorlcurElement.setSorlcurCollCode(getGlobal("LEARNER_COLL_CODE"));
					sorlcurElement.setSorlcurDegcCode(getGlobal("LEARNER_DEGC_CODE"));
					sorlcurElement.setSorlcurProgram(getGlobal("LEARNER_PROGRAM"));
				}
				else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
				{
					sorlcurElement.setSorlcurLevlCode(getGlobal("OUTCOME_LEVL_CODE"));
					sorlcurElement.setSorlcurCampCode(getGlobal("OUTCOME_CAMP_CODE"));
					sorlcurElement.setSorlcurCollCode(getGlobal("OUTCOME_COLL_CODE"));
					sorlcurElement.setSorlcurDegcCode(getGlobal("OUTCOME_DEGC_CODE"));
					sorlcurElement.setSorlcurProgram(getGlobal("OUTCOME_PROGRAM"));
				}
				else {
				}
				getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("Y"));
				if ( !sorlcurElement.getSorlcurProgram().isNull() && getItemVisible("sorlcur_program").equals("TRUE") )
				{
					goItem(toStr("sorlcur_program"));
					getContainer().getGoqrpls().gCheckFailure();
					nextItem();
					getContainer().getGoqrpls().gCheckFailure();
				}
				executeAction("lcur_check_program");
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCurricula().setDefaultinsertInprogress(toStr("N"));
				sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
				sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
				sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
				sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
				{
					NNumber initialPriority = toNumber(0);
					String sqlgroupPriorityCurrC = "SELECT sotlcur_priority_no " +
	" FROM sotlcur " +
	" WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y' AND ((sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner AND sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sotlcur_lmod_code = sb_curriculum_str.f_outcome)) AND sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND sotlcur_seqno = (SELECT max(m.sotlcur_seqno) " +
		" FROM sotlcur m " +
		" WHERE m.sotlcur_priority_no = sotlcur.sotlcur_priority_no AND ((sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions, sb_curriculum_str.f_outcome)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner)) AND m.sotlcur_lmod_code = sotlcur.sotlcur_lmod_code AND m.sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND ((m.sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (m.sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_learner AND m.sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_outcome)) ) " +
	" ORDER BY sotlcur_priority_no DESC";
					DataCursor groupPriorityCurrC = new DataCursor(sqlgroupPriorityCurrC);
					initialPriority = toNumber(0);
					//Setting query parameters
					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_KEY_SEQNO", getFormModel().getSCurricula().getModuleKeySeqno());
					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_END_TERM", getFormModel().getSCurricula().getModuleEndTerm());
					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
					groupPriorityCurrC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable groupPriorityCurrC.
					groupPriorityCurrC.open();
					ResultSet groupPriorityCurrCResults = groupPriorityCurrC.fetchInto();
					if ( groupPriorityCurrCResults != null ) {
						initialPriority = groupPriorityCurrCResults.getNumber(0);
					}
					if ( groupPriorityCurrC.notFound() )
					{
						initialPriority = toNumber(0);
					}
					groupPriorityCurrC.close();
					if ( initialPriority.equals(0) )
					{
						initialPriority = toNumber(getGlobal("SOBCTRL_PRIORITY_NO"));
					}
					else {
						initialPriority = initialPriority.add(toNumber(getGlobal("SOBCTRL_PRIORITY_INCR")));
					}
					sorlcurElement.setSorlcurPriorityNo(initialPriority);
				}
				{
					SbCurriculum.CurriculumRecRow lcurRec= null;
					DataCursor lcurRef= null;
					if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) )
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						if ( Soklcur.fRolledAwarded(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(),/*pRolledSeqno=>*/sorlcurElement.getSorlcurRolledSeqno() ,/*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).notEquals("Y") )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							lcurRef = SbCurriculum.fQueryCurrent(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(),/*pTermCode=>*/ sorlcurElement.getSorlcurTermCode(),/*pKeyseqno=>*/sorlcurElement.getSorlcurKeySeqno(),/*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(),/*pActiveInd=>*/toStr("Y"),/*pEffTerm=>*/null);
							
							while (true) {
								ResultSet lcurRefResults = lcurRef.fetchInto();
								if ( lcurRefResults != null ) {
									//Morphis RA: Convert ResultSet to SbCurriculum.CurriculumRecRow without an index
									lcurRec =  new SbCurriculum.CurriculumRecRow();
									lcurRec = (SbCurriculum.CurriculumRecRow)lcurRefResults.getNObject(0);
									 
								}
								if ( lcurRef.notFound() ) 
									break;
								if ( !lcurRec.RGappSeqno.isNull() )
								{
									sorlcurElement.setSorlcurGappSeqno(lcurRec.RGappSeqno);
										break;
								}
							}
							lcurRef.close();
						}
						else {
							sorlcurElement.setSorlcurGappSeqno(toNumber(null));
						}
					}
				}
				if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
				{
					{
						NNumber alertButton= NNumber.getNull();
						AlertDescriptor alertId = findAlert("CURRICULUM_INVALID");
						NString cemMsg= NString.getNull();
						NInteger cntact = toInt(0);
						NInteger cntfuture = toInt(0);
						String sqlcntFutureC = "SELECT nvl(count(*), 0) " +
	" FROM sgbstdn " +
	" WHERE sgbstdn_term_code_eff > :S___CURRICULA_MODULE_TERM_CODE AND sgbstdn_pidm = :S___CURRICULA_MODULE_PIDM ";
						DataCursor cntFutureC = new DataCursor(sqlcntFutureC);
						String sqlcntActiveC = "SELECT nvl(count(*), 0) " +
	" FROM sgvccur " +
	" WHERE sgvccur_pidm = :S___CURRICULA_MODULE_PIDM AND sgvccur_order > 0 AND sgvccur_stdn_term_code_eff > :S___CURRICULA_MODULE_TERM_CODE AND sgvccur_priority_no = :SORLCUR_PRIORITY_NO ";
						DataCursor cntActiveC = new DataCursor(sqlcntActiveC);
						//Setting query parameters
						cntFutureC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
						cntFutureC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntFutureC.
						cntFutureC.open();
						ResultSet cntFutureCResults = cntFutureC.fetchInto();
						if ( cntFutureCResults != null ) {
							cntfuture = cntFutureCResults.getInteger(0);
						}
						cntFutureC.close();
						if ( cntfuture.greater(0) )
						{
							//Setting query parameters
							cntActiveC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							cntActiveC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
							cntActiveC.addParameter("SORLCUR_PRIORITY_NO", sorlcurElement.getSorlcurPriorityNo());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntActiveC.
							cntActiveC.open();
							ResultSet cntActiveCResults = cntActiveC.fetchInto();
							if ( cntActiveCResults != null ) {
								cntact = cntActiveCResults.getInteger(0);
							}
							cntActiveC.close();
							if ( cntact.equals(0) )
							{
								cemMsg = GNls.Fget(toStr("SOQOLIB-0102"), toStr("FORM"), toStr("Curriculum will be active in a future term and may impact fee assessment."));
								setAlertMessageText(alertId, cemMsg);
								alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
							}
						}
					}
				}
				//  force the when validate on the program so values from smrprle will
				//  fill in
				if ( getItemVisible("sorlcur_cact_code").equals("TRUE") )
				{
					goItem(toStr("sorlcur_cact_code"));
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					goItem(toStr("sorlcur_priority_no"));
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.NEW_SORLFOS
		 -- logic for when new sorlfos is created 
-- default in  required fields 
-- priority and major are defaulted in after the lfst code is entered
-- the major and department are only filled in if the lfst is a major type
:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
:sorlfos_pidm := :sorlcur_pidm;
:sorlfos_lcur_seqno := :sorlcur_seqno;
:sorlfos_seqno :=  :sorlfos_seqno_cnt; 
:sorlfos_cact_code := :s$_curricula.default_cact;
:sorlfos_term_code := :sorlcur_term_code;
:sorlfos_csts_code := :s$_curricula.default_csts;
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlfos_term_code_ctlg is null then
      :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code);
   end if;
end if;
 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.NEW_SORLFOS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NEW_SORLFOS")
		public void Soqolib_NewSorlfos()
		{
			
				//  logic for when new sorlfos is created 
				//  default in  required fields 
				//  priority and major are defaulted in after the lfst code is entered
				//  the major and department are only filled in if the lfst is a major type

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				//  logic for when new sorlfos is created 
				//  default in  required fields 
				//  priority and major are defaulted in after the lfst code is entered
				//  the major and department are only filled in if the lfst is a major type
				sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
				sorlfosElement.setSorlfosPidm(sorlcurElement.getSorlcurPidm());
				sorlfosElement.setSorlfosLcurSeqno(sorlcurElement.getSorlcurSeqno());
				sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
				sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
				sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
				sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.LEARNER_SUMMARY_BLOCK_PREFORM
		 --- trigger in pre form to make key seqno invisible if study paths is not enabled 
default_value('','global.study_path'); 
   
begin
  select sobctrl_study_path_ind
   into  :global.study_path                  
   from sobctrl;

if :global.study_path = 'Y' then   	 
  set_item_property('sovlcur.sovlcur_stvrate_desc', visible, property_false);
  set_item_property('sovlcur.sovlcur_stvstyp_desc', visible, property_false); 
  set_item_property('sovlcur.sovlcur_key_seqno', visible, property_true);
else
	set_item_property('sovlcur.sovlcur_stvrate_desc', visible, property_true);
  set_item_property('sovlcur.sovlcur_stvstyp_desc', visible, property_true); 
  set_item_property('sovlcur.sovlcur_key_seqno', visible, property_false);
end if; 

end; 
	
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.LEARNER_SUMMARY_BLOCK_PREFORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LEARNER_SUMMARY_BLOCK_PREFORM")
		public void Soqolib_LearnerSummaryBlockPreform()
		{
			
				// - trigger in pre form to make key seqno invisible if study paths is not enabled 
				int rowCount = 0;
				// - trigger in pre form to make key seqno invisible if study paths is not enabled 
				setDefaultValue("", "global.study_path");
				String sql1 = "SELECT sobctrl_study_path_ind " +
	" FROM sobctrl ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					setGlobal("STUDY_PATH", results1.getStr(0));
				}
				results1.close();
				if ( getGlobal("STUDY_PATH").equals("Y") )
				{
					setItemVisible("sovlcur.sovlcur_stvrate_desc", false);
					setItemVisible("sovlcur.sovlcur_stvstyp_desc", false);
					setItemVisible("sovlcur.sovlcur_key_seqno", true);
				}
				else {
					setItemVisible("sovlcur.sovlcur_stvrate_desc", true);
					setItemVisible("sovlcur.sovlcur_stvstyp_desc", true);
					setItemVisible("sovlcur.sovlcur_key_seqno", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOQOLIB.CHECK_STUDYPATH_COUNT
		 -- show warning if all lcur are made inactive for a study path 
	declare 
	 
	 stsp_key_seqno  sgrstsp.sgrstsp_key_seqno%type; 
    CURSOR  studypath_c is 
      select sgrstsp_key_seqno 
      from stvstsp, sgrstsp
      where sgrstsp_pidm = :s$_curricula.module_pidm
      and sgrstsp_stsp_code = stvstsp_code
      and stvstsp_enroll_ind = 'Y'
      and sgrstsp_term_code_eff = 
        ( select max(m.sgrstsp_term_code_eff)
          from sgrstsp m
          where m.sgrstsp_pidm = :s$_curricula.module_pidm
          and m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno 
          and m.sgrstsp_term_code_eff <= :s$_curricula.module_term_code)  
      and not exists (select 'X' 
         from sovlcur
         where sovlcur_pidm =:s$_curricula.module_pidm
         and sovlcur_current_ind = 'Y'
         and sovlcur_active_ind = 'Y'
         and sovlcur_lmod_code = sb_curriculum_str.f_learner
         and sovlcur_key_seqno = sgrstsp.sgrstsp_key_seqno);
   
   alert_button           number;
   alert_id               ALERT := FIND_ALERT('CURRICULUM_ERROR');
   cem_msg                varchar2(2000) := '';  
	begin 
		
		if :s$_curricula.module_code <> sb_curriculum_str.f_learner then
			 return;
		end if;
	   soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
	    p_term_code =>   :s$_curricula.module_term_code,
      p_lmod_code => :s$_curricula.module_code); 
		
		open studypath_c;
		loop 
			 fetch studypath_c into stsp_key_seqno ;
			 exit when studypath_c%notfound;
		   cem_msg := G$_NLS.Get('SOQOLIB-0103', 'FORM',
        '*Warning* Study path %01% does not have a current and active curriculum. This may affect fee assessment.',  
                 stsp_key_seqno )   ;
        
			 Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
			 alert_button := show_alert('CURRICULUM_ERROR');
						    	 
			 if alert_button = ALERT_BUTTON1 then
			      null;
			 end if;
	   
		end loop;
	  close studypath_c;
	  
	end ;  
    
    
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOQOLIB.CHECK_STUDYPATH_COUNT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_STUDYPATH_COUNT")
		public void Soqolib_CheckStudypathCount()
		{
			
				//  show warning if all lcur are made inactive for a study path 
				int rowCount = 0;
				{
					NNumber stspKeySeqno= NNumber.getNull();
					String sqlstudypathC = "SELECT sgrstsp_key_seqno " +
	" FROM stvstsp, sgrstsp " +
	" WHERE sgrstsp_pidm = :S___CURRICULA_MODULE_PIDM AND sgrstsp_stsp_code = stvstsp_code AND stvstsp_enroll_ind = 'Y' AND sgrstsp_term_code_eff = (SELECT max(m.sgrstsp_term_code_eff) " +
		" FROM sgrstsp m " +
		" WHERE m.sgrstsp_pidm = :S___CURRICULA_MODULE_PIDM AND m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno AND m.sgrstsp_term_code_eff <= :S___CURRICULA_MODULE_TERM_CODE ) AND  NOT EXISTS(SELECT 'X' " +
		" FROM sovlcur " +
		" WHERE sovlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sovlcur_current_ind = 'Y' AND sovlcur_active_ind = 'Y' AND sovlcur_lmod_code = sb_curriculum_str.f_learner AND sovlcur_key_seqno = sgrstsp.sgrstsp_key_seqno ) ";
					DataCursor studypathC = new DataCursor(sqlstudypathC);
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString cemMsg = toStr("");
					if ( getFormModel().getSCurricula().getModuleCode().notEquals(SbCurriculumStr.fLearner()) )
					{
						return ;
					}
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
					//Setting query parameters
					studypathC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
					studypathC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable studypathC.
					studypathC.open();
					while (true) {
						ResultSet studypathCResults = studypathC.fetchInto();
						if ( studypathCResults != null ) {
							stspKeySeqno = studypathCResults.getNumber(0);
						}
						if ( studypathC.notFound() ) 
							break;
						cemMsg = GNls.Fget(toStr("SOQOLIB-0103"), toStr("FORM"), toStr("*Warning* Study path %01% does not have a current and active curriculum. This may affect fee assessment."), toStr(stspKeySeqno));
						setAlertMessageText(alertId, cemMsg);
						alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
					}
					studypathC.close();
				}
			}

		
	
}
	
