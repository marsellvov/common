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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SorlfosController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SorlfosController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-CLRBLK
		 :system.message_level := '5'; 

clear_block(no_validate);
execute_query;
 
:system.message_level := '0'; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sorlfos_keyClearBlock()
		{
			
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				clearBlock(TaskServices.NO_VALIDATE);
				executeQuery();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-CLRFRM
		 -- exit from sorlcur variable is used for sfaregs since the clear form has to return
-- to the course block.
-- all other forms use the return from sorlcur 
DECLARE
    alert_button number;
    alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
    save_return varchar2(30) := null; 
    lv_canvas CANVAS := FIND_CANVAS('curricula_summary_tab');   
BEGIN  
    :GLOBAL.VALUE := 'KEY-CLRFRM';
    IF :s$_curricula.exit_from_sorlcur IS NULL THEN
        save_return := :return_from_sorlcur;  
    ELSE
        save_return := :exit_from_sorlcur;
    END IF;
 --
    IF :s$_curricula.exit_from_sorlcur IS NULL THEN
        EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
        G$_CHECK_FAILURE ;
        EXECUTE_TRIGGER('ENABLE_KEYS');
        G$_CHECK_FAILURE; 
    END IF;
   
    IF (get_block_property('SORLCUR',STATUS) = 'CHANGED' OR  
       get_block_property('SORLFOS',STATUS) = 'CHANGED' OR 
       nvl(:s$_curricula.curricula_dup_inprogress,'N') = 'Y') AND
       :system.current_form <> 'SOILCUR' THEN 
       alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	    if alert_button = ALERT_BUTTON1 then
	        execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
          g$_check_failure;

          if not form_success then
           	    message( G$_NLS.Get('SOQOLIB-0288', 'FORM','There were errors and your changes could not be saved.') );  
           	    raise form_trigger_failure;
          end if;  
          do_key('commit_form');
          g$_check_failure;
          :s$_curricula.evaluate_courses := 'Y';
          return;
      Else 
     	    :s$_curricula.evaluate_courses := 'N';  
     	    
         IF :exit_from_sorlcur IS NULL THEN
	          CLEAR_FORM(NO_VALIDATE) ;
           G$_CHECK_FAILURE ;
         ELSE
         
         	  if nvl(:deactivate_ind,'N') = 'I' then
               	 gb_common.p_rollback;
            end if; 
            CLEAR_BLOCK(NO_VALIDATE);
            GO_BLOCK('SORLCUR');
            CLEAR_BLOCK(NO_VALIDATE);

         END IF;
	    end if;
   ELSE <multilinecomment> no change to the blocks </multilinecomment> 
	    	
         IF :s$_curricula.exit_from_sorlcur IS NULL THEN 	 
           CLEAR_FORM(NO_VALIDATE) ;
           G$_CHECK_FAILURE ;
        ELSE
          CLEAR_BLOCK(NO_VALIDATE);
          GO_BLOCK('SORLCUR');
          CLEAR_BLOCK(NO_VALIDATE);
        END IF;
   END IF; 
   IF :s$_curricula.exit_from_sorlcur IS NULL THEN 
      :GLOBAL.VALUE := 'KEY-CLRFRM';       
       EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
       G$_CHECK_FAILURE ;
       EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
       G$_CHECK_FAILURE ;
       if :system.current_form <> 'SOILCUR' THEN 
         EXECUTE_TRIGGER('DISABLE_TABS');
         G$_CHECK_FAILURE ;
         hide_view('curricula_canvas');
         G$_CHECK_FAILURE ;
       end if; 
       IF ID_NULL(lv_canvas) THEN
       	null;
       ELSE
       	 if :system.cursor_block like 'SORLCUR%' OR 
       	 	 :system.cursor_block like 'SORLFOS%' THEN
       	 	  null;
       	 else 
           show_view('curricula_summary_tab');
           G$_CHECK_FAILURE ;
         end if; 
       END IF;
   ELSE 
      if :system.current_form <> 'SOILCUR' THEN 
        hide_view('curricula_canvas');
      end if; 
       go_item(save_return);
   END IF;  
   

END;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void sorlfos_ClearTask()
		{
			
				//  exit from sorlcur variable is used for sfaregs since the clear form has to return
				//  to the course block.
				//  all other forms use the return from sorlcur 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString saveReturn = NString.getNull();
					CanvasDescriptor lvCanvas = findCanvas("curricula_summary_tab");
					setGlobal("VALUE", toStr("KEY-CLRFRM"));
					if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
					{
						saveReturn = getFormModel().getSCurricula().getReturnFromSorlcur();
					}
					else {
						saveReturn = getFormModel().getSCurricula().getExitFromSorlcur();
					}
					// 
					if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
					{
						executeAction("SAVE_KEYS");
						getContainer().getGoqrpls().gCheckFailure();
						executeAction("ENABLE_KEYS");
						getContainer().getGoqrpls().gCheckFailure();
					}
					if ( (getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") || isNull(getFormModel().getSCurricula().getCurriculaDupInprogress(), "N").equals("Y")) && getCurrentTaskName().notEquals("SOILCUR") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
							try {
								getContainer().getGoqrpls().gCheckFailure();
							} catch (Exception e) {
								errorMessage(GNls.Fget(toStr("SOQOLIB-0288"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
								throw new ApplicationException();
							}
							executeAction("SAVE");
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
							return ;
						}
						else {
							getFormModel().getSCurricula().setEvaluateCourses(toStr("N"));
							if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
							{
								clearTask(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								if ( isNull(sorlcurElement.getDeactivateInd(), "N").equals("I") )
								{
									GbCommon.pRollback();
								}
								clearBlock(TaskServices.NO_VALIDATE);
								goBlock(toStr("SORLCUR"));
								clearBlock(TaskServices.NO_VALIDATE);
							}
						}
					}
					else {
						//  no change to the blocks 
						if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
						{
							clearTask(TaskServices.NO_VALIDATE);
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							clearBlock(TaskServices.NO_VALIDATE);
							goBlock(toStr("SORLCUR"));
							clearBlock(TaskServices.NO_VALIDATE);
						}
					}
					if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
					{
						setGlobal("VALUE", toStr("KEY-CLRFRM"));
						executeAction("LOAD_FORM_HEADER");
						getContainer().getGoqrpls().gCheckFailure();
						executeAction("GLOBAL_COPY");
						getContainer().getGoqrpls().gCheckFailure();
						if ( getCurrentTaskName().notEquals("SOILCUR") )
						{
							executeAction("DISABLE_TABS");
							getContainer().getGoqrpls().gCheckFailure();
							hideView("curricula_canvas");
							getContainer().getGoqrpls().gCheckFailure();
						}
						if ( (lvCanvas == null) )
						{
						}
						else {
							if ( like(getCursorBlock(), "SORLCUR%") || like(getCursorBlock(), "SORLFOS%") )
							{
							}
							else {
								showView("curricula_summary_tab");
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
					}
					else {
						if ( getCurrentTaskName().notEquals("SOILCUR") )
						{
							hideView("curricula_canvas");
						}
						goItem(saveReturn);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-COMMIT
		 if :system.current_form = 'SOILCUR' THEN 
  return;
end if;

:dup_create_ind := 'N'; 
:s$_curricula.commit_inprogress := 'Y'; 
if :system.current_item like '%SORLFOS_MAJR_CODE'
	THEN 
	next_item;
end if; 
validate(block_scope); 
g$_check_failure;
-- test the commit for missing data
execute_trigger('check_for_lfos_nulls');
g$_check_failure;

execute_trigger('CHECK_FOR_LCUR_NULLS');
g$_check_failure;

-- test base curriculum 
execute_trigger('VALIDATE_BASE_CURRICULUM_RULES');
g$_check_failure;
-- test the lfos curriculum 
execute_trigger('VALIDATE_LFOS_CURRICULUM_RULES');
g$_check_failure;

--  test the number of valid curriculum and fields of study
execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
g$_check_failure;



if not form_success then
	message( G$_NLS.Get('SOQOLIB-0289', 'FORM','There were errors and your changes could not be saved.') );  
	raise form_trigger_failure;
end if; 
commit_form;

:s$_curricula.evaluate_courses := 'Y';
:s$_curricula.commit_inprogress := 'N'; 
:s$_curricula.curricula_dup_inprogress := 'N';

execute_trigger('check_studypath_count');
g$_check_failure; 

execute_trigger('lcur_record_cnt');
g$_check_failure;

execute_trigger('curriculum_commplan_check');
g$_check_failure; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sorlfos_Save()
		{
			
				if ( getCurrentTaskName().equals("SOILCUR") )
				{
					return ;
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				getFormModel().getSCurricula().setCommitInprogress(toStr("Y"));
				if ( like(getCurrentItem(), "%SORLFOS_MAJR_CODE") )
				{
					nextItem();
				}
				validateTask(SupportClasses.Constants.BLOCK_SCOPE);
				getContainer().getGoqrpls().gCheckFailure();
				//  test the commit for missing data
				executeAction("check_for_lfos_nulls");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("CHECK_FOR_LCUR_NULLS");
				getContainer().getGoqrpls().gCheckFailure();
				//  test base curriculum 
				executeAction("VALIDATE_BASE_CURRICULUM_RULES");
				getContainer().getGoqrpls().gCheckFailure();
				//  test the lfos curriculum 
				executeAction("VALIDATE_LFOS_CURRICULUM_RULES");
				getContainer().getGoqrpls().gCheckFailure();
				//   test the number of valid curriculum and fields of study
				executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
				try {
					getContainer().getGoqrpls().gCheckFailure();
				} catch (Exception e) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0289"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
					throw new ApplicationException();
				}
				commitTask();
				getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
				getFormModel().getSCurricula().setCommitInprogress(toStr("N"));
				getFormModel().getSCurricula().setCurriculaDupInprogress(toStr("N"));
				executeAction("check_studypath_count");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("lcur_record_cnt");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("curriculum_commplan_check");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-CREREC
		  execute_trigger('query_only');
g$_check_failure;

if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0290', 'FORM','Invalid option for query only.') );
	return;
end if;

if :sorlcur.sovlcur_current_ind = 'N' then 
	message( G$_NLS.Get('SOQOLIB-0291', 'FORM','Insert not allowed for non current base curriculum.') );
	return;
end if;

if :sorlcur.sorlcur_term_code <> :s$_curricula.module_term_code 
	and :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
	 message(G$_NLS.Get('SOQOLIB-0292', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
elsif :s$_curricula.module_insert_restriction is not null then 
	  message(:s$_curricula.module_insert_restriction);
else 
	if :s$_curricula.module_insert_warning is not null then 
	      message(:s$_curricula.module_insert_warning);
	end if; 
  create_record;
  execute_trigger('new_sorlfos');
  g$_check_failure; 
  :dup_create_ind := 'Y'; 
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sorlfos_CreateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockInsertAllowed("SORLCUR").equals("FALSE") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0290"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ( sorlcurElement.getSovlcurCurrentInd().equals("N") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0291"), toStr("FORM"), toStr("Insert not allowed for non current base curriculum.")));
					return ;
				}
				if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0292"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
				}
				else if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() ) {
					errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
					{
						warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
					}
					createRecord();
					executeAction("new_sorlfos");
					getContainer().getGoqrpls().gCheckFailure();
					getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-DELREC
		 execute_trigger('query_only');
g$_check_failure;
if get_block_property('SORLFOS',DELETE_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0293', 'FORM','Invalid option for query only.') );
	return;
end if;

-- do not allow the deletion of an active field of study if the curriculum
-- is current for another term, is active  
if :s$_curricula.module_code = sb_curriculum_str.f_learner 
	and nvl(:sovlcur_current_ind,'x') = 'N' and 
	  sb_learnercurricstatus.f_is_active(:sorlcur_cact_code) = 'Y' 
 	  and  sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y' then 
  declare 
   cntact pls_integer := 0; 
   cursor cnt_active_c is 
     select nvl(count(*),0)
     from sgvccur
     where sgvccur_pidm = :s$_curricula.module_pidm
     and sgvccur_order > 0 
     and sgvccur_seqno = :sorlcur_seqno
     and sgvccur_stdn_term_code_eff <> :s$_curricula.module_term_code;
  begin 
	 open cnt_active_c;
	 fetch cnt_active_c into cntact;
	 close cnt_active_c;
	 if cntact > 0 then 
	 		message( G$_NLS.Get('SOQOLIB-0294', 'FORM','*ERROR* Curriculum is active for another term and must be deleted from that effective term.') );
     raise form_trigger_failure;
	 end if; 
  end;
end if; 

if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
elsif :sorlcur.sorlcur_term_code <> :s$_curricula.module_term_code 
	and :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then 
	 message(G$_NLS.Get('SOQOLIB-0295', 'FORM','Delete not allowed for this term, create new base curriculum with current term.') );
  raise form_trigger_failure;
elsif :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
else 
  null;
end if;

soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
 p_lcur_seqno => :sorlcur_seqno, p_seqno => :sorlfos_seqno);

:lfos_delete_ind := 'Y'; 
if :sovlfos_rowid is not null then
	 :commplan_delete_trigger := 'Y'; 
end if; 
default_value('','GLOBAL.ATTACHED_MAJOR'); 
IF :System.Last_Record <> 'TRUE' THEN 
	if :sovlfos_rowid is null then 
		  :sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt - 1;
	end if;
  delete_record;
else
	if :system.cursor_record = 1 then 
   :s$_curricula.sorlfos_del_ind := 'Y';
   :dup_create_ind := 'N'; 
   :sorlfos_seqno_cnt := 0;  
 		delete_record;
   previous_block;
	else 
		if :sovlfos_rowid is null then 
		  :sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt - 1;
		end if; 
		delete_record;
  end if;
end if;
 




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sorlfos_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockDeleteAllowed("SORLFOS").equals("FALSE") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0293"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				//  do not allow the deletion of an active field of study if the curriculum
				//  is current for another term, is active  
				if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && isNull(sorlcurElement.getSovlcurCurrentInd(), "x").equals("N") && SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).equals("Y") && SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") )
				{
					{
						NInteger cntact = toInt(0);
						String sqlcntActiveC = "SELECT nvl(count(*), 0) " +
	" FROM sgvccur " +
	" WHERE sgvccur_pidm = :S___CURRICULA_MODULE_PIDM AND sgvccur_order > 0 AND sgvccur_seqno = :SORLCUR_SEQNO AND sgvccur_stdn_term_code_eff <> :S___CURRICULA_MODULE_TERM_CODE ";
						DataCursor cntActiveC = new DataCursor(sqlcntActiveC);
						try {
							//Setting query parameters
							cntActiveC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							cntActiveC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							cntActiveC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntActiveC.
							cntActiveC.open();
							ResultSet cntActiveCResults = cntActiveC.fetchInto();
							if ( cntActiveCResults != null ) {
								cntact = cntActiveCResults.getInteger(0);
							}
						} finally {
							cntActiveC.close();							
						}

						if ( cntact.greater(0) )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0294"), toStr("FORM"), toStr("*ERROR* Curriculum is active for another term and must be deleted from that effective term.")));
							throw new ApplicationException();
						}
					}
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) ) {
					warningMessage(GNls.Fget(toStr("SOQOLIB-0295"), toStr("FORM"), toStr("Delete not allowed for this term, create new base curriculum with current term.")));
					throw new ApplicationException();
				}
				else if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() ) {
					errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
					throw new ApplicationException();
				}
				else {
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
				sorlfosElement.setLfosDeleteInd(toStr("Y"));
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				}
				setDefaultValue("", "GLOBAL.ATTACHED_MAJOR");
				if ( !isInLastRecord() )
				{
					if ( sorlfosElement.getSovlfosRowid().isNull() )
					{
						sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().subtract(1));
					}
					deleteRecord();
				}
				else {
					if ( getCursorRecord().equals(1) )
					{
						getFormModel().getSCurricula().setSorlfosDelInd(toStr("Y"));
						getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
						sorlcurElement.setSorlfosSeqnoCnt(toNumber(0));
						deleteRecord();
						previousBlock();
					}
					else {
						if ( sorlfosElement.getSovlfosRowid().isNull() )
						{
							sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().subtract(1));
						}
						deleteRecord();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-DUPREC
		 execute_trigger('query_only');
g$_check_failure;
if get_block_property('SORLFOS',INSERT_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0296', 'FORM','Invalid option for query only.') );
	return;
end if;

if nvl(:dup_create_ind,'N') <>  'Y' then 
	message( G$_NLS.Get('SOQOLIB-0297', 'FORM','Insert record to duplicate record into.') );
	raise form_trigger_failure;
	return;
end if; 

duplicate_record;
:dup_create_ind := 'N';  
:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
:sorlfos_seqno :=  :sorlfos_seqno_cnt; 
--:sorlfos_csts_code := null ;
--:sorlfos_cact_code := null; 
:sorlfos_rolled_seqno := null;
:sorlfos_current_ind := null; 
:sovlfos_rowid := null;
-- defect 1-qcufn
:sorlfos_lfos_rule := NULL; 



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sorlfos_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockInsertAllowed("SORLFOS").equals("FALSE") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0296"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ( isNull(getFormModel().getSCurricula().getDupCreateInd(), "N").notEquals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0297"), toStr("FORM"), toStr("Insert record to duplicate record into.")));
					throw new ApplicationException();
				}
				duplicateRecord();
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
				sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
				// :sorlfos_csts_code := null ;
				// :sorlfos_cact_code := null; 
				sorlfosElement.setSorlfosRolledSeqno(toNumber(null));
				sorlfosElement.setSorlfosCurrentInd(toStr(null));
				sorlfosElement.setSovlfosRowid(toStr(null));
				//  defect 1-qcufn
				sorlfosElement.setSorlfosLfosRule(toNumber(null));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-EDIT
		 :global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
 --F2J_TODO: Change global current_user01 to current_user
G$_SECURED_FORM_CALL(:global.current_user01, 'SOACURR','QUERY');
:global.form_was_called := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sorlfos_KeyEdit()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOACURR"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-ENTQRY
		 clear_record;
set_curric_properties('sorlfos_cact_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_csts_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_term_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_term_code_ctlg_lbt','enabled','property_true');
set_curric_properties('sorlfos_term_code_end_lbt','enabled','property_true');
set_curric_properties('sorlfos_majr_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_dept_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_tmst_code_lbt','enabled','property_true');
set_curric_properties('sorlfos_start_date_dbt','enabled','property_true');
set_curric_properties('sorlfos_end_date_dbt','enabled','property_true');
set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_true');
IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' then 
     set_curric_properties('lfos_deactive_btn','enabled',property_false);
END IF;

enter_query; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sorlfos_Search()
		{
			
				clearRecord();
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date_dbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date_dbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_true"));
				if ( getItemVisible("lfos_deactive_btn").equals("TRUE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr(false));
				}
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-EXIT
		 -- exit from sorlcur variable is used for sfaregs since the clear form & exit have to return
-- to the course block.
-- all other forms use the return from sorlcur 

DECLARE
    alert_button number;
    alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
      
BEGIN    
 
--
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
  
   IF get_block_property('SORLCUR',STATUS) = 'CHANGED' OR  
   	 get_block_property('SORLFOS',STATUS) = 'CHANGED' OR 
   	 nvl(:s$_curricula.curricula_dup_inprogress,'N') = 'Y' THEN 
        alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	      if alert_button = ALERT_BUTTON1 then
	       	  execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
            g$_check_failure;

            if not form_success then
              	message( G$_NLS.Get('SOQOLIB-0298', 'FORM','There were errors and your changes could not be saved.') );  
              	raise form_trigger_failure;
            end if; 
            do_key('commit_form');
            g$_check_failure;
            :s$_curricula.evaluate_courses := 'Y';
        Else 
              :s$_curricula.evaluate_courses := 'N';
              IF :exit_from_sorlcur IS NULL THEN    	
                 EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
                 G$_CHECK_FAILURE ;
   	             CLEAR_FORM(no_validate) ;
                 G$_CHECK_FAILURE ;
                 EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
                 G$_CHECK_FAILURE ;
                 EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
                 G$_CHECK_FAILURE ;
              ELSE
                 if nvl(:deactivate_ind,'N') = 'I' then
               	   gb_common.p_rollback;
                 end if; 
         	       CLEAR_BLOCK(NO_VALIDATE);
         	       G$_CHECK_FAILURE ;
         	       GO_BLOCK('SORLCUR');    
         	       G$_CHECK_FAILURE ;
         	       CLEAR_BLOCK(NO_VALIDATE);
         	       G$_CHECK_FAILURE ;

              END IF;
	      end if;
    
   END IF; 
   :s$_curricula.curricula_updated := 'N'; 
   if :exit_from_sorlcur is null then 
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
   else 
   	go_item(:exit_from_sorlcur);
   end if; 
    
END; 


 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sorlfos_Exit()
		{
			
				//  exit from sorlcur variable is used for sfaregs since the clear form & exit have to return
				//  to the course block.
				//  all other forms use the return from sorlcur 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					// 
					executeAction("SAVE_KEYS");
					getContainer().getGoqrpls().gCheckFailure();
					if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") || isNull(getFormModel().getSCurricula().getCurriculaDupInprogress(), "N").equals("Y") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
							try {
								getContainer().getGoqrpls().gCheckFailure();
							} catch (Exception e) {
								errorMessage(GNls.Fget(toStr("SOQOLIB-0298"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
								throw new ApplicationException();
							}
							executeAction("SAVE");
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
						}
						else {
							getFormModel().getSCurricula().setEvaluateCourses(toStr("N"));
							if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
							{
								executeAction("SAVE_KEYS");
								getContainer().getGoqrpls().gCheckFailure();
								clearTask(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
								executeAction("LOAD_FORM_HEADER");
								getContainer().getGoqrpls().gCheckFailure();
								executeAction("GLOBAL_COPY");
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								if ( isNull(sorlcurElement.getDeactivateInd(), "N").equals("I") )
								{
									GbCommon.pRollback();
								}
								clearBlock(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
								goBlock(toStr("SORLCUR"));
								getContainer().getGoqrpls().gCheckFailure();
								clearBlock(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
					}
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("N"));
					if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
					{
						getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						goItem(getFormModel().getSCurricula().getExitFromSorlcur());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-NXTBLK
		 if  get_block_property('SORLCUR',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS',STATUS) = 'CHANGED' OR
			:s$_curricula.curricula_dup_inprogress = 'Y' THEN
			message( G$_NLS.Get('SOQOLIB-0299', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
else 
	if get_item_property(:return_from_sorlcur,ENABLED) = 'FALSE' 
		 OR get_item_property(:return_from_sorlcur, VISIBLE) = 'FALSE'   
	  	Then 
	  	go_block('SORLCUR');
		  g$_check_failure;
	else 
			hide_view('curricula_canvas');
			if :s$_curricula.next_block_sorlfos is null then 
				go_item(:s$_curricula.return_from_sorlcur);
				g$_check_failure;
			else 
					if get_item_property(:s$_curricula.next_block_sorlfos,ENABLED) = 'TRUE' 
	      	 and get_item_property(:s$_curricula.next_block_sorlfos, VISIBLE) = 'TRUE' then  
			     go_item(:s$_curricula.next_block_sorlfos);
					else
						next_block;
						g$_check_failure;
				  end if; 
			end if; 
	end if; 
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sorlfos_NextBlock()
		{
			
				if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") || getFormModel().getSCurricula().getCurriculaDupInprogress().equals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0299"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
					throw new ApplicationException();
				}
				else {
					if ( getItemEnabled(getFormModel().getSCurricula().getReturnFromSorlcur()).equals("FALSE") || getItemVisible(getFormModel().getSCurricula().getReturnFromSorlcur()).equals("FALSE") )
					{
						goBlock(toStr("SORLCUR"));
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						hideView("curricula_canvas");
						if ( getFormModel().getSCurricula().getNextBlockSorlfos().isNull() )
						{
							goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							if ( getItemEnabled(getFormModel().getSCurricula().getNextBlockSorlfos()).equals("TRUE") && getItemVisible(getFormModel().getSCurricula().getNextBlockSorlfos()).equals("TRUE") )
							{
								goItem(getFormModel().getSCurricula().getNextBlockSorlfos());
							}
							else {
								nextBlock();
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-NXTREC
		  
	
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 
	IF :System.Last_Record <> 'TRUE' THEN 
	 execute_trigger('check_for_lfos_nulls');
	 g$_check_failure;
	 next_Record;
 	 g$_check_failure;
	ELSE 
		execute_trigger('query_only');
    g$_check_failure;
		if get_block_property('SORLFOS',INSERT_ALLOWED) = 'FALSE'
			or :sorlcur.sovlcur_current_ind = 'N' 
       	then  
	  	Message( G$_NLS.Get('SOQOLIB-0300', 'FORM','At last record.') ); 
		else
			if :sorlcur.sorlcur_term_code <> :s$_curricula.module_term_code 
       	and :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
     		 message(G$_NLS.Get('SOQOLIB-0301', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
      elsif :s$_curricula.module_insert_restriction is not null then 
	         message(:s$_curricula.module_insert_restriction);
      else 
      	if :s$_curricula.module_insert_warning is not null then 
	         message(:s$_curricula.module_insert_warning);
      	end if; 
     	  execute_trigger('check_for_lfos_nulls');
        g$_check_failure;
	    	next_record;
		    g$_check_failure;
		    execute_trigger('new_sorlfos');
        g$_check_failure; 

		    :dup_create_ind := 'Y';

	   end if; 
	  end if;
	END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sorlfos_NextRecord()
		{
			
				//  ** If we're not at the bottom, then go to the last record 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				//  ** If we're not at the bottom, then go to the last record 
				if ( !isInLastRecord() )
				{
					executeAction("check_for_lfos_nulls");
					getContainer().getGoqrpls().gCheckFailure();
					nextRecord();
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("query_only");
					getContainer().getGoqrpls().gCheckFailure();
					if ( getBlockInsertAllowed("SORLFOS").equals("FALSE") || sorlcurElement.getSovlcurCurrentInd().equals("N") )
					{
						infoMessage(GNls.Fget(toStr("SOQOLIB-0300"), toStr("FORM"), toStr("At last record.")));
					}
					else {
						if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0301"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
						}
						else if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() ) {
							errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						}
						else {
							if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
							{
								warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
							}
							executeAction("check_for_lfos_nulls");
							getContainer().getGoqrpls().gCheckFailure();
							nextRecord();
							getContainer().getGoqrpls().gCheckFailure();
							executeAction("new_sorlfos");
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-PRVBLK
		 execute_trigger('check_for_lfos_nulls');
g$_check_failure;

if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
end if;

GO_BLOCK('SORLCUR');
g$_check_failure;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sorlfos_PreviousBlock()
		{
			
				executeAction("check_for_lfos_nulls");
				getContainer().getGoqrpls().gCheckFailure();
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				goBlock(toStr("SORLCUR"));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.KEY-PRVREC
		 
  IF :SYSTEM.LAST_RECORD = 'TRUE' AND 
    get_block_property('SORLFOS',INSERT_ALLOWED) = 'TRUE' AND
    :sovlfos_rowid is null and 
    :sorlfos_priority_no is null and 
    :sorlfos_majr_code is null and 
    :sorlfos_lfst_code is null and 
  	:system.record_status <> 'CHANGED' then 
  	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt - 1;
  	delete_record;

  else 
    execute_trigger('check_for_lfos_nulls');
    g$_check_failure;
  	previous_record;
    g$_check_failure;
  end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sorlfos_PreviousRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( isInLastRecord() && getBlockInsertAllowed("SORLFOS").equals("TRUE") && sorlfosElement.getSovlfosRowid().isNull() && sorlfosElement.getSorlfosPriorityNo().isNull() && sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSorlfosLfstCode().isNull() && !getRecordStatus().equals("CHANGED") )
				{
					sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().subtract(1));
					deleteRecord();
				}
				else {
					executeAction("check_for_lfos_nulls");
					getContainer().getGoqrpls().gCheckFailure();
					previousRecord();
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.ON-INSERT
		  
--
-- ON-INSERT Trigger
--
 DECLARE
   alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
   cem_msg varchar2(2000) := ''; 
   lfos_seqno  sorlfos.sorlfos_seqno%TYPE := 0; 
   major_dept_msg  varchar2(200) := ''; 
   
   invalid_curriculum EXCEPTION;
   lfos_rec  sorlfos%rowtype; 
   
   BEGIN
   
  SB_FIELDOFSTUDY.P_CREATE(
     p_PIDM                   =>:sorlcur.SORLCUR_PIDM,
     p_LCUR_SEQNO             =>:sorlcur.SORLCUR_SEQNO,
     p_SEQNO                  => :sorlfos_seqno,
     p_LFST_CODE              =>:sorlfos.SORLFOS_LFST_CODE,
     p_TERM_CODE              =>:sorlfos.SORLFOS_TERM_CODE,
     p_PRIORITY_NO            =>:sorlfos.SORLFOS_PRIORITY_NO,
     p_CSTS_CODE              =>:sorlfos.SORLFOS_CSTS_CODE,
     p_CACT_CODE              =>:sorlfos.SORLFOS_CACT_CODE,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_USER_ID                => :sorlfos_user_id,
     p_MAJR_CODE              =>:sorlfos.SORLFOS_MAJR_CODE,
     p_TERM_CODE_CTLG         =>:sorlfos.SORLFOS_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:sorlfos.SORLFOS_TERM_CODE_END,
     p_DEPT_CODE              =>:sorlfos.SORLFOS_DEPT_CODE,
     p_LFOS_RULE              =>:sorlfos.SORLFOS_LFOS_RULE,
     p_CONC_ATTACH_RULE       =>:sorlfos.SORLFOS_CONC_ATTACH_RULE,
     p_START_DATE             =>:sorlfos.SORLFOS_START_DATE,
     p_END_DATE               =>:sorlfos.SORLFOS_END_DATE,
     p_TMST_CODE              =>:sorlfos.SORLFOS_TMST_CODE,
     P_MAJR_CODE_ATTACH       => :sorlfos.sorlfos_majr_code_attach,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              =>:sorlfos.ROWID,
     p_curr_error_out          => :sorlfos.curr_error,
     p_override_severity      => 'N',
     p_severity_out           => :sorlfos.severity_out,
     p_lfos_seqno_out         => lfos_seqno,
     p_USER_ID_UPDATE          => :sorlfos_user_id);

--
	 :SORLFOS_ACTIVITY_DATE := 
				TO_DATE(G$_RESYNCH_RECORD(:SORLFOS.ROWID),'DDMONYYYYHH24MISS');
  
	  -- select the lfos record to refresh the activity date
    -- and other fields calculated by the api
		
   select * into lfos_rec from sorlfos
   where  sorlfos.rowid = :sorlfos.rowid;
   if sql%notfound then 
   	 null;
   end if;
   
   :SORLFOS_ACTIVITY_DATE := lfos_rec.sorlfos_activity_date;
 -- fill in the rowid so the cursor can land on the right record 
   :sorlfos.sovlfos_rowid := :sorlfos.rowid;
 -- show curriculum warning only once
   if sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y' then 
    if :lcur_sobctrl_curr_rule_ind = 'Y' and :lcur_temp_rule_ind = 'Y' and  
     (:sorlfos.curr_error is not null and :sorlfos.curr_error > 0 )   
   	 and ( ( :curric_warning is null and :sorlfos.severity_out = 'W' ) OR 
   	    :sorlfos.severity_out = 'F' )  then 
	   
	   major_dept_msg := ': ' || :sorlfos_majr_code;
	   if :sorlfos_dept_code is not null then 
	   	 major_dept_msg := major_dept_msg || ' Department: ' || :sorlfos_dept_code;
	   end if; 
	   cem_msg :=  sokcmsg.F_SorlcurErrorMsg(:sorlfos.severity_out, 'V',
	   	                          :sorlfos.curr_error)   || major_dept_msg ;


     if :sorlfos.severity_out = 'W' then 
	     Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	     alert_button := show_alert('CURRICULUM_ERROR');
	 
	    if alert_button = ALERT_BUTTON1 then
	       null;
	    end if;
	    :lfos_warning := :sorlfos.curr_error;
	   else
	    	if :sorlfos.severity_out = 'F' then 
	   	    raise invalid_curriculum;
	      end if;
	   end if; 
   else
     	:lfos_warning := 0;
   end if;
  
   end if; -- only check curric if cact is active 
   
EXCEPTION
   WHEN invalid_curriculum then
       Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	     alert_button := show_alert('CURRICULUM_ERROR');
 	     if alert_button = ALERT_BUTTON1 then
	       null;
 	     end if;
 	     gb_common.p_rollback;
 	     return;
       RAISE FORM_TRIGGER_FAILURE  ;  
  WHEN OTHERS THEN
       G$_DISPLAY_ERR_MSG(SQLERRM);
       RAISE FORM_TRIGGER_FAILURE;
 
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sorlfos_RowInsert(RowAdapterEvent args)
		{
			
				// 
				//  ON-INSERT Trigger
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)args.getRow();


				int rowCount = 0;
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString cemMsg = toStr("");
					NNumber lfosSeqno = toNumber(0);
					NString majorDeptMsg = toStr("");
					SorlfosRow lfosRec= null;
					try
					{
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>();
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>();
						Ref<NString> p_severity_out_ref = new Ref<NString>(sorlfosElement.getSeverityOut());
						Ref<NNumber> p_lfos_seqno_out_ref = new Ref<NNumber>(lfosSeqno);
						SbFieldofstudy.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pTermCode=>*/sorlfosElement.getSorlfosTermCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pCstsCode=>*/sorlfosElement.getSorlfosCstsCode(), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/sorlfosElement.getSorlfosUserId(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg(), /*pTermCodeEnd=>*/sorlfosElement.getSorlfosTermCodeEnd(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(), /*pLfosRule=>*/sorlfosElement.getSorlfosLfosRule(), /*pConcAttachRule=>*/sorlfosElement.getSorlfosConcAttachRule(), /*pStartDate=>*/sorlfosElement.getSorlfosStartDate(), /*pEndDate=>*/sorlfosElement.getSorlfosEndDate(), /*pTmstCode=>*/sorlfosElement.getSorlfosTmstCode(), /*pMajrCodeAttach=>*/sorlfosElement.getSorlfosMajrCodeAttach(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/sorlfosElement.getROWID(), p_rowid_out_ref, p_curr_error_out_ref, p_severity_out_ref, p_lfos_seqno_out_ref, /*pUserIdUpdate=>*/sorlfosElement.getSorlfosUserId());
						sorlfosElement.setCurrError(p_rowid_out_ref.val);
						"N" = p_curr_error_out_ref.val;
						sorlfosElement.setSeverityOut(p_severity_out_ref.val);
						lfosSeqno = p_lfos_seqno_out_ref.val;
						// 
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						sorlfosElement.setSorlfosActivityDate(toDate(getContainer().getGoqrpls().gResynchRecord(sorlfosElement.getROWID()), "DDMONYYYYHH24MISS"));
						//  select the lfos record to refresh the activity date
						//  and other fields calculated by the api
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						String sql1 = "SELECT * " +
	" FROM sorlfos " +
	" WHERE sorlfos.rowid = :SORLFOS_ROWID ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORLFOS_ROWID", sorlfosElement.getROWID());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							lfosRec = new SorlfosRow(results1);
						}
						results1.close();
						if ( rowCount == 0 )
						{
						}
						sorlfosElement.setSorlfosActivityDate(lfosRec.SorlfosActivityDate);
						//  fill in the rowid so the cursor can land on the right record 
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						sorlfosElement.setSovlfosRowid(sorlfosElement.getROWID());
						//  show curriculum warning only once
						if ( SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") )
						{
							if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") && (!sorlfosElement.getCurrError().isNull() && sorlfosElement.getCurrError().greater(0)) && ((sorlcurElement.getCurricWarning().isNull() && sorlfosElement.getSeverityOut().equals("W")) || sorlfosElement.getSeverityOut().equals("F")) )
							{
								majorDeptMsg = toStr(": ").append(sorlfosElement.getSorlfosMajrCode());
								if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
								{
									majorDeptMsg = majorDeptMsg.append(" Department: ").append(sorlfosElement.getSorlfosDeptCode());
								}
								cemMsg = Sokcmsg.fSorlcurerrormsg(sorlfosElement.getSeverityOut(), toStr("V"), sorlfosElement.getCurrError()).append(majorDeptMsg);
								if ( sorlfosElement.getSeverityOut().equals("W") )
								{
									setAlertMessageText(alertId, cemMsg);
									alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
									if ( alertButton.equals(MessageServices.BUTTON1) )
									{
									}
									sorlfosElement.setLfosWarning(sorlfosElement.getCurrError());
								}
								else {
									if ( sorlfosElement.getSeverityOut().equals("F") )
									{
										throw new InvalidCurriculum();
									}
								}
							}
							else {
								sorlfosElement.setLfosWarning(toNumber(0));
							}
						}
					}
					catch(InvalidCurriculum e)
					{
						setAlertMessageText(alertId, cemMsg);
						alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
						GbCommon.pRollback();
						return ;
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.ON-DELETE
		 --
-- ON-DELETE Trigger
--
	
BEGIN
	-- check if record still exists.  user may have deleted this,then
	-- deleted the sorlcur.  The sorlcur api will delete all its sorlfos
	-- children.
	IF (sb_fieldofstudy.f_exists(:sorlfos.SORLFOS_PIDM,
		  :sorlfos.SORLFOS_LCUR_SEQNO, :sorlfos.SORLFOS_SEQNO) ='N' ) THEN
		  RETURN;
  END IF;
  SB_FIELDOFSTUDY.P_DELETE(
     p_PIDM                   =>:sorlfos.SORLFOS_PIDM,
     p_LCUR_SEQNO             =>:sorlfos.SORLFOS_LCUR_SEQNO,
     p_SEQNO                  =>:sorlfos.SORLFOS_SEQNO,
     p_ROWID                  =>:sorlfos.ROWID);

--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void sorlfos_RowDelete(RowAdapterEvent args)
		{
			
				// 
				//  ON-DELETE Trigger
				// 
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)args.getRow();


				try
				{
					//  check if record still exists.  user may have deleted this,then
					//  deleted the sorlcur.  The sorlcur api will delete all its sorlfos
					//  children.
					if ((SbFieldofstudy.fExists(sorlfosElement.getSorlfosPidm(), sorlfosElement.getSorlfosLcurSeqno(), sorlfosElement.getSorlfosSeqno()).equals("N")))
					{
						return ;
					}
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					SbFieldofstudy.pDelete(/*pPidm=>*/sorlfosElement.getSorlfosPidm(), /*pLcurSeqno=>*/sorlfosElement.getSorlfosLcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pRowid=>*/sorlfosElement.getROWID());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.ONLOCK
		 --
BEGIN
	
  SB_FIELDOFSTUDY.P_LOCK(
     p_PIDM                   =>:SORLFOS.SORLFOS_PIDM,
     p_LCUR_SEQNO             =>:SORLFOS.SORLFOS_LCUR_SEQNO,
     p_SEQNO                  =>:SORLFOS.SORLFOS_SEQNO,
     p_ROWID_INOUT            =>:SORLFOS.ROWID);

--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.ONLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ONLOCK")
		public void sorlfos_Onlock()
		{
			
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_rowid_inout_ref = new Ref<NString>();
					SbFieldofstudy.pLock(/*pPidm=>*/sorlfosElement.getSorlfosPidm(), /*pLcurSeqno=>*/sorlfosElement.getSorlfosLcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), p_rowid_inout_ref);
					sorlfosElement.setROWID(p_rowid_inout_ref.val);
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.PRE-INSERT
		 if :sorlfos_cact_code is  null then 
   :sorlfos_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlfos_term_code is null then 
  :sorlfos_term_code := :sorlcur_term_code;
end if; 
if :sorlfos_csts_code is null then 
  :sorlfos_csts_code := :s$_curricula.default_csts;
end if; 
if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlfos.sorlfos_cact_code) = 'N' then 
	 :commplan_delete_trigger := 'I';
end if; 
 --F2J_TODO: Change global current_user01 to current_user
:sorlfos_user_id := :global.current_user01; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sorlfos_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)args.getRow();
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosCactCode().isNull() )
				{
					sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
				}
				if ( sorlfosElement.getSorlfosTermCode().isNull() )
				{
					sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
				}
				if ( sorlfosElement.getSorlfosCstsCode().isNull() )
				{
					sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				if ( SbLearnercurricstatus.fIsActive(/*pCactCode=>*/sorlfosElement.getSorlfosCactCode()).equals("N") )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("I"));
				}
				// F2J_TODO: Change global current_user01 to current_user
				sorlfosElement.setSorlfosUserId(getGlobal("CURRENT_USER01"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.POST-QUERY
		 begin
	:sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	:sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
  :sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);
  :sorlfos_tmst_desc := sb_stvtmst.f_get_description(:sorlfos_tmst_code);
  :sorlfos_lfst_code_desc := gb_gtvlfst.f_get_description(:sorlfos_lfst_code);
  if :sorlfos_rolled_seqno is null then
  	  :lfos_rolled_ind := 'N';
  else
  	  :lfos_rolled_ind := 'Y';
  end if; 
    
end;

	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sorlfos_AfterQuery(RowAdapterEvent args)
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)args.getRow();
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sorlfosElement.setLockDbValues(true);
								this.sorlfosEndDate_PostChange();
			this.sorlfosStartDate_PostChange();
			this.sorlfosMajrCodeAttach_PostChange();
			this.sorlfosLfstCode_PostChange();

				} finally { 
					sorlfosElement.setLockDbValues(false);
				}
				sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
				sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
				sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
				sorlfosElement.setSorlfosTmstDesc(SbStvtmst.fGetDescription(sorlfosElement.getSorlfosTmstCode()));
				sorlfosElement.setSorlfosLfstCodeDesc(GbGtvlfst.fGetDescription(sorlfosElement.getSorlfosLfstCode()));
				if ( sorlfosElement.getSorlfosRolledSeqno().isNull() )
				{
					sorlfosElement.setLfosRolledInd(toStr("N"));
				}
				else {
					sorlfosElement.setLfosRolledInd(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.POST-BLOCK
		  if :system.block_status in ('CHANGED') AND
 	nvl(:sorlfos_del_ind,'N') <> 'Y'  then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;
 
 :dup_create_ind := 'N'; 

  
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sorlfos_blockOut()
		{
			
				if ( (getBlockStatus().equals("CHANGED")) && isNull(getFormModel().getSCurricula().getSorlfosDelInd(), "N").notEquals("Y") )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.WHEN-NEW-RECORD-INSTANCE
		 if :system.mode = 'ENTER-QUERY' 
 	  then return;
end if;

--- set up the help hint for the rolled seq 
 declare 
	toolmsg varchar2(200) := NULL; 
	lv_curr_ref sb_curriculum.curriculum_ref;
	lv_curr_rec sb_curriculum.curriculum_rec;

 begin
  if get_item_property('lfos_rolled_ind',visible) = 'TRUE' then 
  if :sorlfos_rolled_seqno is not null then
  	  if :lcur_rolled_key_seqno is null then 
  	  	lv_curr_ref := sb_curriculum.f_query_one
  	     (p_pidm => :sorlcur_pidm, p_seqno => :sorlcur_rolled_seqno); 
    	  fetch lv_curr_ref into lv_curr_rec;
    	  if lv_curr_ref%notfound then
  	  	 :lcur_rolled_key_seqno  := null;
    	  else 
  	  	 :lcur_rolled_key_seqno := lv_curr_rec.r_key_seqno;
  	    end if; 
  	    close lv_curr_ref;
  	  end if;
  	  if :lcur_rolled_key_seqno is null then 
     	  toolmsg := G$_NLS.Get('SOQOLIB-0302','FORM','Outcome field of study rolled to is not found.');
  	  else 
    	  toolmsg := G$_NLS.Get('SOQOLIB-0303','FORM','Rolled to outcome %01%.',
  	       :lcur_rolled_key_seqno);
  	  end if;
  	  set_item_property('LFOS_ROLLED_IND',TOOLTIP_TEXT, toolmsg);
  else
  	  toolmsg := G$_NLS.Get('SOQOLIB-0304','FORM','Not rolled to an outcome.');
  	  set_item_property('LFOS_ROLLED_IND',TOOLTIP_TEXT, toolmsg);
  end if;
  end if; 
 end;
 
 
if get_block_property('SORLFOS',INSERT_ALLOWED) = 'TRUE' THEN
	
	  -- options windows cause this trigger to fire,  reset enable property upon return
	--	if :system.current_item not like '%SORLFOS_CACT%'
	--		and get_item_property(:system.current_item,enabled) = 'TRUE' 
	--		then 
	 -- 		null;
	--	else 
		--		set_curric_properties('sorlfos_cact_code','enabled','property_true');
				set_curric_properties('sorlfos_priority_no','enabled','property_true');
				set_curric_properties('sorlfos_csts_code','enabled','property_true');
				set_curric_properties('sorlfos_term_code_ctlg','enabled','property_true');
				set_curric_properties('sorlfos_term_code_end','enabled','property_true');
				set_curric_properties('sorlfos_majr_code','enabled','property_true');
				set_curric_properties('sorlfos_dept_code','enabled','property_true');
				set_curric_properties('sorlfos_lfst_code','enabled','property_true');
				set_curric_properties('sorlfos_tmst_code','enabled','property_true');
				set_curric_properties('sorlfos_start_date','enabled','property_true');
				set_curric_properties('sorlfos_end_date','enabled','property_true');
				if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then  
				  set_curric_properties('sorlfos_majr_code_attach','enabled','property_true');
				end if;
				set_curric_properties('sorlfos_priority_no','navigable','property_true');
		--		set_curric_properties('sorlfos_cact_code','navigable','property_true');
				set_curric_properties('sorlfos_csts_code','navigable','property_true');
				set_curric_properties('sorlfos_term_code_ctlg','navigable','property_true');
				set_curric_properties('sorlfos_term_code_end','navigable','property_true');
				set_curric_properties('sorlfos_majr_code','navigable','property_true');
				set_curric_properties('sorlfos_dept_code','navigable','property_true');
				set_curric_properties('sorlfos_lfst_code','navigable','property_true');
				set_curric_properties('sorlfos_tmst_code','navigable','property_true');
				set_curric_properties('sorlfos_start_date','navigable','property_true');
				set_curric_properties('sorlfos_end_date','navigable','property_true');
			  if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then  
  				set_curric_properties('sorlfos_majr_code_attach','navigable','property_true');
			  end if;
			  IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' 
			  	 and :sorlfos_current_ind = 'Y' then 
		     set_curric_properties('lfos_deactive_btn','enabled','property_true');
	      END IF;
	--	end if; 
		
   if :sovlfos_rowid is not null then 
			set_curric_properties('sorlfos_cact_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_csts_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_term_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_term_code_ctlg_lbt','enabled','property_false');
			set_curric_properties('sorlfos_term_code_end_lbt','enabled','property_false');
			set_curric_properties('sorlfos_majr_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_dept_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_tmst_code_lbt','enabled','property_false');
			set_curric_properties('sorlfos_start_date_dbt','enabled','property_false');
			set_curric_properties('sorlfos_end_date_dbt','enabled','property_false');
			set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');

   else
   	if :sorlcur.sorlcur_term_code <> :s$_curricula.module_term_code 
       	and :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
     		 message(G$_NLS.Get('SOQOLIB-0305', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
         if :system.cursor_record > 1 then 
         	 previous_record;
         	 g$_check_failure;
         else 
         	 go_block('SORLCUR'); 
         	 g$_check_failure;
         end if; 
    elsif :s$_curricula.module_insert_restriction is not null then 
	       message(:s$_curricula.module_insert_restriction);
  	     if :system.cursor_record > 1 then 
         	 previous_record;
         	 g$_check_failure;
         else 
         	 go_block('SORLCUR'); 
         	 g$_check_failure;
         end if; 
    else 
    	if :s$_curricula.module_insert_warning is not null then 
	        message(:s$_curricula.module_insert_warning);
      end if; 
   	
   	
			set_curric_properties('sorlfos_cact_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_csts_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_term_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_term_code_ctlg_lbt','enabled','property_true');
			set_curric_properties('sorlfos_term_code_end_lbt','enabled','property_true');
			set_curric_properties('sorlfos_majr_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_dept_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_tmst_code_lbt','enabled','property_true');
			set_curric_properties('sorlfos_start_date_dbt','enabled','property_true');
			set_curric_properties('sorlfos_end_date_dbt','enabled','property_true');
			IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' and 
				:sorlfos_current_ind = 'Y' then    
		    set_curric_properties('lfos_deactive_btn','enabled','property_true');
		  END IF;
 			if ( :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration 
				and get_item_property('sorlfos_majr_code_attach',enabled) = 'TRUE' )  
				or :sorlfos_lfst_code is null then 
			  set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_true');
			else 
			  set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');
 			  set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');
			end if; 

			if :sorlcur_lmod_code = sb_curriculum_str.f_outcome then 
 					set_curric_properties('sorlfos_term_code_lbt','enabled','property_true');
			else
					set_curric_properties('sorlfos_term_code_lbt','enabled','property_false');
		  end if;
		 
		  if :sorlfos_seqno is null then 
		   if :sorlfos_seqno_cnt is null then
		   	  :sorlfos_seqno_cnt := 1;
		   else  
			    :sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1; 
			 end if;
		   :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
		  end if;
 		  if :sorlfos_lfst_code is null and :sorlfos_majr_code is null then 
			  if :sorlfos_cact_code is null then 
			  	:sorlfos_cact_code := :s$_curricula.default_cact;
			  end if;
			  if :sorlfos_csts_code is null then 
			    :sorlfos_csts_code := :s$_curricula.default_csts;
			  end if;
		  end if; 
      if :sorlfos_majr_code is null and :sorlfos_seqno_cnt = 1 then 
      	  :sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
      	 	:SORLFOS_LFST_CODE_DESC := gb_gtvlfst.f_get_description(:sorlfos_lfst_code);
      	  if :sorlfos_priority_no is null then 
		  	    :sorlfos_priority_no := :global.sobctrl_priority_no;
		      end if; 
      end if; 
      if :sorlfos_lfst_code = sb_fieldofstudy_str.f_major and 
      	:sorlfos_majr_code is null then 
        Retrieve_defaults(p_lmod_code => :s$_curricula.module_code);
        Case :s$_curricula.module_code
        When  sb_curriculum_str.f_recruit then 
	        :sorlfos_majr_code := :global.recruit_majr_code;
          :sorlfos_dept_code := :global.recruit_dept_code;
        When  sb_curriculum_str.f_admissions then 
     	    :sorlfos_majr_code := :global.admissions_majr_code;
	        :sorlfos_dept_code := :global.admissions_dept_code;
        When  sb_curriculum_str.f_learner then 
	        :sorlfos_majr_code := :global.learner_majr_code;
	        :sorlfos_dept_code := :global.learner_dept_code;
        When  sb_curriculum_str.f_outcome then 
	        :sorlfos_majr_code := :global.outcome_majr_code;
       	  :sorlfos_dept_code := :global.outcome_dept_code;

        else
        	null;
        end case;
      end if; 
		  if :sorlfos_term_code is null then 
		    :sorlfos_term_code := :sorlcur_term_code;
		  end if;
		  if :lcur_sobctrl_curr_rule_ind = 'Y' then
       if :sorlfos_term_code_ctlg is null then
         :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code);
       end if;
		  end if;
		  :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
      :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);

     end if; -- no insert restrictions
  
  END IF;  -- rowid is null 

ELSE -- block is query only
		set_curric_properties('sorlfos_cact_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_csts_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_term_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_term_code_ctlg_lbt','enabled','property_false');
		set_curric_properties('sorlfos_term_code_end_lbt','enabled','property_false');
		set_curric_properties('sorlfos_majr_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_dept_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_tmst_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_start_date_dbt','enabled','property_false');
		set_curric_properties('sorlfos_end_date_dbt','enabled','property_false');
		set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');

		IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' then 
		  set_curric_properties('lfos_deactive_btn','enabled','property_false');
		END IF;
END IF;

if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
    IF GET_ITEM_PROPERTY('SORLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
	 		  set_curric_properties('SORLFOS_CONC_CODE_BTN','enabled',property_false);
 	 	END IF;
ELSE -- allow the button to be shown if there are no outstanding changes 
declare 
	majr_cnt NUMBER := 0; 
	CURSOR find_conc_c IS
	  select nvl(count(*) , 0)
	  from sovlfos attach
	  where attach.sovlfos_pidm = :soRlcur.soRlcur_pidm
	  and attach.sovlfos_lcur_seqno = :soRlcur.soRlcur_seqno
	  and attach.sovlfos_current_ind = 'Y'
	  and attach.sovlfos_active_ind = 'Y'
	  and attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration 
	  and attach.sovlfos_majr_code_attach = :soRlfos_majr_code; 
	  
begin
  IF :sorlfos_lfst_code = sb_fieldofstudy_str.f_major THEN
  	 OPEN find_conc_c;
  	 FETCH find_conc_c into  majr_cnt;
  	 IF find_conc_c%NOTFOUND THEN
  	 	 majr_cnt := 0; 
  	 END IF;
  	 CLOSE find_conc_c; 
  	 IF majr_cnt > 0 THEN 
  	  	IF GET_ITEM_PROPERTY('SORLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
  	 		  set_curric_properties('SORLFOS_CONC_CODE_BTN','enabled',property_true);
  	  	END IF;
  		ELSE 
  	   	IF GET_ITEM_PROPERTY('SORLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
  	 		  set_curric_properties('SORLFOS_CONC_CODE_BTN','enabled',property_false);
  	 	  END IF;

  	 END IF;
  ELSE
  	IF GET_ITEM_PROPERTY('SORLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
	 		  set_curric_properties('SORLFOS_CONC_CODE_BTN','enabled',property_false);
 	 	END IF;
 END IF; 
 
end;

end if;
	



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sorlfos_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				if ( getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				{
					NString toolmsg = NString.getNull();
					UnknownTypes.SbCurriculumCurriculumRef lvCurrRef= null;
					SbCurriculum.CurriculumRecRow lvCurrRec= null;
					if ( getItemVisible("lfos_rolled_ind").equals("TRUE") )
					{
						if ( !sorlfosElement.getSorlfosRolledSeqno().isNull() )
						{
							if ( sorlcurElement.getLcurRolledKeySeqno().isNull() )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								lvCurrRef = SbCurriculum.fQueryOne(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurRolledSeqno());
								ResultSet lvCurrRefResults = lvCurrRef.fetchInto();
								if ( lvCurrRefResults != null ) {
									lvCurrRec =  new SbCurriculum.CurriculumRecRow(lvCurrRefResults);
								}
								if ( lvCurrRef.notFound() )
								{
									sorlcurElement.setLcurRolledKeySeqno(toNumber(null));
								}
								else {
									sorlcurElement.setLcurRolledKeySeqno(lvCurrRec.RKeySeqno);
								}
								lvCurrRef.close();
							}
							if ( sorlcurElement.getLcurRolledKeySeqno().isNull() )
							{
								toolmsg = GNls.Fget(toStr("SOQOLIB-0302"), toStr("FORM"), toStr("Outcome field of study rolled to is not found."));
							}
							else {
								toolmsg = GNls.Fget(toStr("SOQOLIB-0303"), toStr("FORM"), toStr("Rolled to outcome %01%."), toStr(sorlcurElement.getLcurRolledKeySeqno()));
							}
							setItemToolTip("LFOS_ROLLED_IND", toolmsg);
						}
						else {
							toolmsg = GNls.Fget(toStr("SOQOLIB-0304"), toStr("FORM"), toStr("Not rolled to an outcome."));
							setItemToolTip("LFOS_ROLLED_IND", toolmsg);
						}
					}
				}
				if ( getBlockInsertAllowed("SORLFOS").equals("TRUE") )
				{
					//  options windows cause this trigger to fire,  reset enable property upon return
					// 	if :system.current_item not like '%SORLFOS_CACT%'
					// 		and get_item_property(:system.current_item,enabled) = 'TRUE' 
					// 		then 
					//  		null;
					// 	else 
					// 		set_curric_properties('sorlfos_cact_code','enabled','property_true');
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_priority_no"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("enabled"), toStr("property_true"));
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_true"));
					}
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_priority_no"), toStr("navigable"), toStr("property_true"));
					// 		set_curric_properties('sorlfos_cact_code','navigable','property_true');
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("navigable"), toStr("property_true"));
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("navigable"), toStr("property_true"));
					}
					if ( getItemVisible("lfos_deactive_btn").equals("TRUE") && sorlfosElement.getSorlfosCurrentInd().equals("Y") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_true"));
					}
					// 	end if; 
					if ( !sorlfosElement.getSovlfosRowid().isNull() )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date_dbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date_dbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
					}
					else {
						if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0305"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
							if ( getCursorRecord().greater(1) )
							{
								previousRecord();
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								goBlock(toStr("SORLCUR"));
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
						else if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() ) {
							errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
							if ( getCursorRecord().greater(1) )
							{
								previousRecord();
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								goBlock(toStr("SORLCUR"));
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
						else {
							if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
							{
								warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
							}
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date_dbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date_dbt"), toStr("enabled"), toStr("property_true"));
							if ( getItemVisible("lfos_deactive_btn").equals("TRUE") && sorlfosElement.getSorlfosCurrentInd().equals("Y") )
							{
								this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_true"));
							}
							if ( (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) && getItemEnabled("sorlfos_majr_code_attach").equals("TRUE")) || sorlfosElement.getSorlfosLfstCode().isNull() )
							{
								this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_true"));
							}
							else {
								this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
							}
							if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) )
							{
								this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_true"));
							}
							else {
								this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_false"));
							}
							if ( sorlfosElement.getSorlfosSeqno().isNull() )
							{
								if ( sorlcurElement.getSorlfosSeqnoCnt().isNull() )
								{
									sorlcurElement.setSorlfosSeqnoCnt(toNumber(1));
								}
								else {
									sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
								}
								sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
							}
							if ( sorlfosElement.getSorlfosLfstCode().isNull() && sorlfosElement.getSorlfosMajrCode().isNull() )
							{
								if ( sorlfosElement.getSorlfosCactCode().isNull() )
								{
									sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
								}
								if ( sorlfosElement.getSorlfosCstsCode().isNull() )
								{
									sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
								}
							}
							if ( sorlfosElement.getSorlfosMajrCode().isNull() && sorlcurElement.getSorlfosSeqnoCnt().equals(1) )
							{
								sorlfosElement.setSorlfosLfstCode(SbFieldofstudyStr.fMajor());
								sorlfosElement.setSorlfosLfstCodeDesc(GbGtvlfst.fGetDescription(sorlfosElement.getSorlfosLfstCode()));
								if ( sorlfosElement.getSorlfosPriorityNo().isNull() )
								{
									sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
								}
							}
							if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()) && sorlfosElement.getSorlfosMajrCode().isNull() )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								this.getContainer().getServices().retrieveDefaults(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
								if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
								{
									sorlfosElement.setSorlfosMajrCode(getGlobal("RECRUIT_MAJR_CODE"));
									sorlfosElement.setSorlfosDeptCode(getGlobal("RECRUIT_DEPT_CODE"));
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
								{
									sorlfosElement.setSorlfosMajrCode(getGlobal("ADMISSIONS_MAJR_CODE"));
									sorlfosElement.setSorlfosDeptCode(getGlobal("ADMISSIONS_DEPT_CODE"));
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
								{
									sorlfosElement.setSorlfosMajrCode(getGlobal("LEARNER_MAJR_CODE"));
									sorlfosElement.setSorlfosDeptCode(getGlobal("LEARNER_DEPT_CODE"));
								}
								else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
								{
									sorlfosElement.setSorlfosMajrCode(getGlobal("OUTCOME_MAJR_CODE"));
									sorlfosElement.setSorlfosDeptCode(getGlobal("OUTCOME_DEPT_CODE"));
								}
								else {
								}
							}
							if ( sorlfosElement.getSorlfosTermCode().isNull() )
							{
								sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
							}
							if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
							{
								if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
								{
									sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
								}
							}
							sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
							sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
						}
					}
				}
				else {
					//  block is query only
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_cact_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
					if ( getItemVisible("lfos_deactive_btn").equals("TRUE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_false"));
					}
				}
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
					if ( getItemVisible("SORLFOS_CONC_CODE_BTN").equals("TRUE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_CONC_CODE_BTN"), toStr("enabled"), toStr(false));
					}
				}
				else {
					{
						NNumber majrCnt = toNumber(0);
						String sqlfindConcC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos attach " +
	" WHERE attach.sovlfos_pidm = :SORLCUR_SORLCUR_PIDM AND attach.sovlfos_lcur_seqno = :SORLCUR_SORLCUR_SEQNO AND attach.sovlfos_current_ind = 'Y' AND attach.sovlfos_active_ind = 'Y' AND attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration AND attach.sovlfos_majr_code_attach = :SORLFOS_MAJR_CODE ";
						DataCursor findConcC = new DataCursor(sqlfindConcC);
						try {
							if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()) )
							{
								//Setting query parameters
								findConcC.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
								findConcC.addParameter("SORLCUR_SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
								findConcC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable findConcC.
								findConcC.open();
								ResultSet findConcCResults = findConcC.fetchInto();
								if ( findConcCResults != null ) {
									majrCnt = findConcCResults.getNumber(0);
								}
								if ( findConcC.notFound() )
								{
									majrCnt = toNumber(0);
								}
								findConcC.close();
								if ( majrCnt.greater(0) )
								{
									if ( getItemVisible("SORLFOS_CONC_CODE_BTN").equals("TRUE") )
									{
										this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_CONC_CODE_BTN"), toStr("enabled"), toStr(true));
									}
								}
								else {
									if ( getItemVisible("SORLFOS_CONC_CODE_BTN").equals("TRUE") )
									{
										this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_CONC_CODE_BTN"), toStr("enabled"), toStr(false));
									}
								}
							}
							else {
								if ( getItemVisible("SORLFOS_CONC_CODE_BTN").equals("TRUE") )
								{
									this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_CONC_CODE_BTN"), toStr("enabled"), toStr(false));
								}
							}
						} finally {
							findConcC.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.WHEN-NEW-BLOCK-INSTANCE
		 :s$_curricula_traditional.lcur_priority_display := :sorlcur.sorlcur_priority_no;
:s$_curricula_traditional.lcur_program_display := :sorlcur.sorlcur_program;
:s$_curricula_traditional.lcur_level_display := :sorlcur.sorlcur_levl_code;
:s$_curricula_traditional.lcur_college_display := :sorlcur.sorlcur_coll_code;
:s$_curricula_traditional.lcur_campus_display := :sorlcur.sorlcur_camp_code;
:s$_curricula_traditional.lcur_degree_display := :sorlcur.sorlcur_degc_code;
:s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
:s$_curricula_traditional.lcur_key_seqno_display := :sorlcur.sorlcur_key_seqno;
:s$_curricula_traditional.lcur_term_code_display := :sorlcur.sorlcur_term_code;
:s$_curricula_traditional.lcur_term_code_end_display := :sorlcur.sorlcur_term_code_end;
:s$_curricula_traditional.lcur_lmod_code_display := sb_stvlmod.f_get_description(:sorlcur.sorlcur_lmod_code);
:s$_curricula_traditional.lcur_seqno_display := :sorlcur.sorlcur_seqno;
:s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
:s$_curricula_traditional.lcur_cact_code_display := :sorlcur.sorlcur_cact_code;
:s$_curricula_traditional.lcur_current_ind_display := :sorlcur.sovlcur_current_ind;
 
set_item_property('LCUR_PROGRAM_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);   
set_item_property('LCUR_LEVEL_DISPLAY', TOOLTIP_TEXT,:sorlcur_levl_desc);
set_item_property('LCUR_COLLEGE_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);
set_item_property('LCUR_CAMPUS_DISPLAY', TOOLTIP_TEXT,:sorlcur_camp_desc);
set_item_property('LCUR_DEGREE_DISPLAY', TOOLTIP_TEXT,:sorlcur_degc_desc);

:s$_curricula_traditional.lcur_rec_num_lfos := :s$_curricula_traditional.lcur_rec_num;
:s$_curricula_traditional.lcur_rec_cnt_lfos := :s$_curricula_traditional.lcur_rec_cnt; 
if get_block_property('SORLFOS',INSERT_ALLOWED) = 'FALSE' THEN 
	return;
end if;
execute_trigger('lfos_check_base');
:s$_curricula.default_major := '';
:s$_curricula.default_dept := '';
:s$_curricula.default_cmjr_rule := ''; 



    
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sorlfos_blockChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurriculaTraditional().setLcurPriorityDisplay(toStr(sorlcurElement.getSorlcurPriorityNo()));
				getFormModel().getSCurriculaTraditional().setLcurProgramDisplay(sorlcurElement.getSorlcurProgram());
				getFormModel().getSCurriculaTraditional().setLcurLevelDisplay(sorlcurElement.getSorlcurLevlCode());
				getFormModel().getSCurriculaTraditional().setLcurCollegeDisplay(sorlcurElement.getSorlcurCollCode());
				getFormModel().getSCurriculaTraditional().setLcurCampusDisplay(sorlcurElement.getSorlcurCampCode());
				getFormModel().getSCurriculaTraditional().setLcurDegreeDisplay(sorlcurElement.getSorlcurDegcCode());
				getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
				getFormModel().getSCurriculaTraditional().setLcurKeySeqnoDisplay(sorlcurElement.getSorlcurKeySeqno());
				getFormModel().getSCurriculaTraditional().setLcurTermCodeDisplay(sorlcurElement.getSorlcurTermCode());
				getFormModel().getSCurriculaTraditional().setLcurTermCodeEndDisplay(sorlcurElement.getSorlcurTermCodeEnd());
				getFormModel().getSCurriculaTraditional().setLcurLmodCodeDisplay(SbStvlmod.fGetDescription(sorlcurElement.getSorlcurLmodCode()));
				getFormModel().getSCurriculaTraditional().setLcurSeqnoDisplay(sorlcurElement.getSorlcurSeqno());
				getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
				getFormModel().getSCurriculaTraditional().setLcurCactCodeDisplay(sorlcurElement.getSorlcurCactCode());
				getFormModel().getSCurriculaTraditional().setLcurCurrentIndDisplay(sorlcurElement.getSovlcurCurrentInd());
				setItemToolTip("LCUR_PROGRAM_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
				setItemToolTip("LCUR_LEVEL_DISPLAY", sorlcurElement.getSorlcurLevlDesc());
				setItemToolTip("LCUR_COLLEGE_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
				setItemToolTip("LCUR_CAMPUS_DISPLAY", sorlcurElement.getSorlcurCampDesc());
				setItemToolTip("LCUR_DEGREE_DISPLAY", sorlcurElement.getSorlcurDegcDesc());
				getFormModel().getSCurriculaTraditional().setLcurRecNumLfos(getFormModel().getSCurriculaTraditional().getLcurRecNum());
				getFormModel().getSCurriculaTraditional().setLcurRecCntLfos(getFormModel().getSCurriculaTraditional().getLcurRecCnt());
				if ( getBlockInsertAllowed("SORLFOS").equals("FALSE") )
				{
					return ;
				}
				executeAction("lfos_check_base");
				getFormModel().getSCurricula().setDefaultMajor(toStr(""));
				getFormModel().getSCurricula().setDefaultDept(toStr(""));
				getFormModel().getSCurricula().setDefaultCmjrRule(toNumber(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.WHEN-VALIDATE-RECORD
		 G$_CHECK_QUERY_MODE;
if :global.query_mode = '1' then 
	return;
end if;
--
if :sorlcur.sorlcur_duplicate_ind = 'Y' then
	return;
end if;
 
IF	( :sorlfos_priority_no is not NULL OR
	:sorlfos_csts_code is not NULL OR
	:sorlfos_cact_code is not NULL or 
	:sorlfos_lfst_code is not NULL OR
	:sorlfos_majr_code is not NULL ) THEN 
	
	if :sorlfos_priority_no is null then 
		message( G$_NLS.Get('SOQOLIB-0306', 'FORM',
		 '*ERROR* Enter priority number.') );
	 	raise form_trigger_failure;
	end if; 
	if :sorlfos_lfst_code is null then 
		message( G$_NLS.Get('SOQOLIB-0307', 'FORM',
		 '*ERROR* Enter  field of study type code.') );
	 	raise form_trigger_failure;
	end if; 
	if :sorlfos_csts_code is null then 
		message( G$_NLS.Get('SOQOLIB-0308', 'FORM',
		 '*ERROR* Enter  curriculum status code.') );
	 	raise form_trigger_failure;
	end if;
	if :sorlfos_cact_code is null then 
		message( G$_NLS.Get('SOQOLIB-0309', 'FORM',
		 '*ERROR* Enter curriculum activity code.') );
	 	raise form_trigger_failure;
	end if;
	if :sorlfos_majr_code is null then 
		message( G$_NLS.Get('SOQOLIB-0310', 'FORM',
		 '*ERROR* Enter field of study code.') );
	 	raise form_trigger_failure;
	end if;

 END IF;

-- when validate trigger is fired even after key delete, do not reinsert deleted temp record
if :sovlfos_rowid is null then 

 soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
    p_lcur_seqno => :sorlcur_seqno, p_seqno => :sorlfos_seqno); 
 soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
       p_lcur_seqno => nvl(:sorlcur_seqno,999),
       p_seqno => nvl(:sorlfos_seqno,999),
       p_cact_code => :sorlfos_cact_code,
       p_lfst_code => :sorlfos_lfst_code,
       p_priority_no => :sorlfos_priority_no ,
       p_majr_code => :sorlfos_majr_code,
       p_dept_code => :sorlfos_dept_code);
   
   	 
 
end if; 

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void sorlfos_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				// 
				if ( sorlcurElement.getSorlcurDuplicateInd().equals("Y") )
				{
					return ;
				}
				if ((!sorlfosElement.getSorlfosPriorityNo().isNull() || !sorlfosElement.getSorlfosCstsCode().isNull() || !sorlfosElement.getSorlfosCactCode().isNull() || !sorlfosElement.getSorlfosLfstCode().isNull() || !sorlfosElement.getSorlfosMajrCode().isNull()))
				{
					if ( sorlfosElement.getSorlfosPriorityNo().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0306"), toStr("FORM"), toStr("*ERROR* Enter priority number.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0307"), toStr("FORM"), toStr("*ERROR* Enter  field of study type code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosCstsCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0308"), toStr("FORM"), toStr("*ERROR* Enter  curriculum status code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosCactCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0309"), toStr("FORM"), toStr("*ERROR* Enter curriculum activity code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosMajrCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0310"), toStr("FORM"), toStr("*ERROR* Enter field of study code.")));
						throw new ApplicationException();
					}
				}
				//  when validate trigger is fired even after key delete, do not reinsert deleted temp record
				if ( sorlfosElement.getSovlfosRowid().isNull() )
				{
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.DEACTIVE_LFOS_CREATE_NEW
		 declare 
	save_lfst  gtvlfst.gtvlfst_code%type;

begin 

if get_block_property('SORLFOS',INSERT_ALLOWED) = 'FALSE' or 
	nvl(:global.curriculum_query, 'N') = 'Y'  THEN 
	message( G$_NLS.Get('SOQOLIB-0311', 'FORM','Invalid option for query only.') );
	return;
end if;
IF	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0312', 'FORM','Commit curriculum data changes before inactivating and inserting new.') );
	raise form_trigger_failure;
end if; 
	
if :sorlcur.sorlcur_term_code <> :s$_curricula.module_term_code 
	and :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
	 message(G$_NLS.Get('SOQOLIB-0313', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
   raise form_trigger_failure;
elsif :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;

-- duplicate the current lcur and change the cact to deactivate 

:system.message_level := '5';
create_record;
duplicate_record;
:dup_create_ind := 'N'; 
:commplan_delete_trigger := 'I'; -- set commplan to come up if no changes 
:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
:sorlfos_seqno :=  :sorlfos_seqno_cnt; 
:sorlfos_csts_code := soklcur.f_event_status('REMOVED') ;
:sorlfos_cact_code := soklcur.f_default_cact('INACTIVE'); 
:sorlfos_rolled_seqno := null;
:sorlfos_current_ind := null; 
:sovlfos_rowid := null;
:sorlfos_user_id := null;
:sorlfos_activity_date := null; 
save_lfst := :sorlfos_lfst_code; 
soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
    p_lcur_seqno => :sorlcur_seqno, p_seqno => :sorlfos_seqno); 
soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
       p_lcur_seqno => nvl(:sorlcur_seqno,999),
       p_seqno => nvl(:sorlfos_seqno,999),
       p_cact_code => :sorlfos_cact_code,
       p_lfst_code => :sorlfos_lfst_code,
       p_priority_no => :sorlfos_priority_no ,
       p_majr_code => :sorlfos_majr_code,
       p_dept_code => :sorlfos_dept_code);
 
               

:system.message_level := '0'; 


end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.DEACTIVE_LFOS_CREATE_NEW
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DEACTIVE_LFOS_CREATE_NEW")
		public void sorlfos_DeactiveLfosCreateNew()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				{
					NString saveLfst= NString.getNull();
					if ( getBlockInsertAllowed("SORLFOS").equals("FALSE") || isNull(getGlobal("CURRICULUM_QUERY"), "N").equals("Y") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0311"), toStr("FORM"), toStr("Invalid option for query only.")));
						return ;
					}
					if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0312"), toStr("FORM"), toStr("Commit curriculum data changes before inactivating and inserting new.")));
						throw new ApplicationException();
					}
					if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0313"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
						throw new ApplicationException();
					}
					else if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() ) {
						warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
					}
					else {
						if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
						{
							errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
							throw new ApplicationException();
						}
					}
					//  duplicate the current lcur and change the cact to deactivate 
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					createRecord();
					duplicateRecord();
					getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("I"));
					//  set commplan to come up if no changes 
					sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
					sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
					sorlfosElement.setSorlfosCstsCode(Soklcur.fEventStatus(toStr("REMOVED")));
					sorlfosElement.setSorlfosCactCode(Soklcur.fDefaultCact(toStr("INACTIVE")));
					sorlfosElement.setSorlfosRolledSeqno(toNumber(null));
					sorlfosElement.setSorlfosCurrentInd(toStr(null));
					sorlfosElement.setSovlfosRowid(toStr(null));
					sorlfosElement.setSorlfosUserId(toStr(null));
					sorlfosElement.setSorlfosActivityDate(toDate(null));
					saveLfst = sorlfosElement.getSorlfosLfstCode();
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS.QUERY_ONLY
		 DECLARE
    lv_what_obj  VARCHAR2(30);
    lv_what_role VARCHAR2(30);
BEGIN
   
    GOKDBMS.APPLICATION_INFO_READ_MODULE(lv_what_obj, lv_what_role);
    	IF ( lv_what_role IS NOT NULL AND SUBSTR(lv_what_role,-2,2) = '_Q' ) 
    	 OR    INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(:system.current_form,USER),           
                  'CURRICULUM:F') =  0 then 
       MESSAGE(g$_nls.get('SOQOLIB-0314','FORM','*ERROR* You are running with a query only role, this function is not allowed.'));
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.QUERY_ONLY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_ONLY")
		public void sorlfos_QueryOnly()
		{
			
				{
					NString lvWhatObj= NString.getNull();
					NString lvWhatRole= NString.getNull();
					Ref<NString> p_module_name_ref = new Ref<NString>(lvWhatObj);
					Ref<NString> p_action_name_ref = new Ref<NString>(lvWhatRole);
					Gokdbms.applicationInfoReadModule(p_module_name_ref, p_action_name_ref);
					lvWhatObj = p_module_name_ref.val;
					lvWhatRole = p_action_name_ref.val;
					if ( (!lvWhatRole.isNull() && substring(lvWhatRole, - (2), toInt(2)).equals("_Q")) || inStr(GSecurity.gGetTabSecurityFnc(getCurrentTaskName(), getUser()), toStr("CURRICULUM:F")).equals(0) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0314"), toStr("FORM"), toStr("*ERROR* You are running with a query only role, this function is not allowed.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sorlfos_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_VIEW_CURRENT", getGlobal("view_current")));             


                // F2J_WARNING : Caution, the variable may be null.                  
                SorlcurAdapter sorlcurElement = (SorlcurAdapter) this.getFormModel().getSorlcur().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm()));             


                // F2J_WARNING : Caution, the variable may be null.                  
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_CACT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosCactCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_CACT_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosCactCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_CACT_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlfosCactCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CACT_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('STVCACT_CODE','STVCACT_DESC','');
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosCactCode_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("STVCACT_CODE"), toStr("STVCACT_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CACT_CODE.WHEN-MOUSE-DOUBLECLICK
		 
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_CACT_CODE")
		public void sorlfosCactCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CACT_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_cact_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcact.f_code_exists(:sorlfos_cact_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0315', 'FORM','*ERROR* Invalid curriculum activity status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_CACT_CODE")
		public void sorlfosCactCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosCactCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvcact.fCodeExists(sorlfosElement.getSorlfosCactCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0315"), toStr("FORM"), toStr("*ERROR* Invalid curriculum activity status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_CSTS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosCstsCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosCstsCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_CSTS_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosCstsCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_CSTS_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlfosCstsCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CSTS_CODE.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_CSTS_CODE")
		public void sorlfosCstsCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CSTS_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_csts_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcsts.f_code_exists(:sorlfos_csts_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0316', 'FORM','*ERROR* Invalid curriculum status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	
	if :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_outcome then 
		 test_code := '';
		 test_code := soklcur.f_validate_degs_csts(:sorlfos_csts_code, :s$_curricula.module_degs_code);
		 if test_code = 'N' then 
		 	 message( G$_NLS.Get('SOQOLIB-0317', 'FORM','*ERROR* Invalid curriculum status code for non awarded degree status.') );
		 	 raise form_trigger_failure;
		 end if;
  end if;
	
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CSTS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_CSTS_CODE")
		public void sorlfosCstsCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosCstsCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvcsts.fCodeExists(sorlfosElement.getSorlfosCstsCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0316"), toStr("FORM"), toStr("*ERROR* Invalid curriculum status code, press LIST for values.")));
						throw new ApplicationException();
					}
					if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) )
					{
						testCode = toStr("");
						testCode = Soklcur.fValidateDegsCsts(sorlfosElement.getSorlfosCstsCode(), getFormModel().getSCurricula().getModuleDegsCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0317"), toStr("FORM"), toStr("*ERROR* Invalid curriculum status code for non awarded degree status.")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_LFST_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosLfstCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosLfstCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_LFST_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosLfstCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_LFST_CODE")
		public void sorlfosLfstCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_lfst_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_gtvlfst.f_code_exists(:sorlfos_lfst_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0318', 'FORM','*ERROR* Invalid learner field of study type code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_LFST_CODE")
		public void sorlfosLfstCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlfosLfstCode_PostChange();

				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbGtvlfst.fCodeExists(sorlfosElement.getSorlfosLfstCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0318"), toStr("FORM"), toStr("*ERROR* Invalid learner field of study type code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sorlfos_lfst_code is null then 
	 :sorlfos_lfst_code_desc := ''; 
end if; 
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlfos_term_code_ctlg is null then
      :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, :sorlcur_term_code);
   end if;
end if;

IF :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then
	if :sovlfos_rowid is null then 
			execute_trigger('LFOS_CONC_BASE_ATTACHED');
    	g$_check_failure;
    	if :lfos_concmajr_attach_ind is NULL and 
    		 :lfos_concbase_attach_ind is NULL then 
 				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','updateable','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_true');
	    elsif :lfos_concmajr_attach_ind = 'Y' then 
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','updateable','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_true');
				set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_true');
	    else 
	    	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
		  	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_false');
		  	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');
			  set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','updateable','property_false');
      end if; 
	else
			set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_true');
			set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','navigable','property_true');
			set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');
			set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','updateable','property_false');
	end if;
	
ELSE
	if :sovlfos_rowid is   null then 
		:sorlfos_majr_code_attach := null;
		:sorlfos_conc_attach_rule := null;
		:sorlfos_attach_conc_desc := null;
  end if; 
	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH','enabled','property_false');
	set_curric_properties('SORLFOS_MAJR_CODE_ATTACH_LBT','enabled','property_false');
END IF;

IF :sorlfos_lfst_code <> sb_fieldofstudy_str.f_major 
	and :sovlfos_rowid is null then 
	:sorlfos_dept_code := NULL;
	:sorlfos_dept_desc := NULL;
end if; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_LFST_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlfosLfstCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					sorlfosElement.setSorlfosLfstCodeDesc(toStr(""));
				}
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
					}
				}
				if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
				{
					if ( sorlfosElement.getSovlfosRowid().isNull() )
					{
						executeAction("LFOS_CONC_BASE_ATTACHED");
						getContainer().getGoqrpls().gCheckFailure();
						if ( sorlcurElement.getLfosConcmajrAttachInd().isNull() && sorlcurElement.getLfosConcbaseAttachInd().isNull() )
						{
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("updateable"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_true"));
						}
						else if ( sorlcurElement.getLfosConcmajrAttachInd().equals("Y") ) {
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("updateable"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_true"));
						}
						else {
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("updateable"), toStr("property_false"));
						}
					}
					else {
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("navigable"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("updateable"), toStr("property_false"));
					}
				}
				else {
					if ( sorlfosElement.getSovlfosRowid().isNull() )
					{
						sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
						sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
						sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					}
					this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLFOS_MAJR_CODE_ATTACH_LBT"), toStr("enabled"), toStr("property_false"));
				}
				if ( sorlfosElement.getSorlfosLfstCode().notEquals(SbFieldofstudyStr.fMajor()) && sorlfosElement.getSovlfosRowid().isNull() )
				{
					sorlfosElement.setSorlfosDeptCode(toStr(null));
					sorlfosElement.setSorlfosDeptDesc(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.POST-CHANGE
		 if :sovlfos_rowid is not null then 
	  return;
end if; 

:sorlfos_lfst_code_desc := gb_gtvlfst.f_get_description(:sorlfos_lfst_code);
--- figure out the default priority

If :sorlfos_lfst_code is not null and :sorlfos_priority_no is null then 
  Declare 

  Initial_priority  sorlfos.sorlfos_priority_no%type := 0;
  Cursor max_priority_c is 
   Select nvl(max(sotlfos_priority_no),0)
   From sotlfos
    Where sotlfos_pidm = :sorlcur_pidm
    And sotlfos_lcur_seqno = :sorlcur_seqno
    And sotlfos_lfst_code = :sorlfos_lfst_code;
 
  Begin 
    Open max_priority_c; 
    fetch max_priority_c into initial_priority;
    if max_priority_c%notfound then 
      initial_priority := 0;
    end if;  
    close max_priority_c;
    if initial_priority = 0 then 
      :sorlfos_priority_no := :global.sobctrl_priority_no;
    else 
      :sorlfos_priority_no := initial_priority + :global.sobctrl_priority_incr;
    end if;
  end; 

-- only default in the major code if its a MAJOR type 
  if :sorlfos_lfst_code = sb_fieldofstudy_str.f_major then 
    Retrieve_defaults(p_lmod_code => :s$_curricula.module_code);
    Case :s$_curricula.module_code
      When  sb_curriculum_str.f_recruit then 
	     :sorlfos_majr_code := :global.recruit_majr_code;
       :sorlfos_dept_code := :global.recruit_dept_code;
      When  sb_curriculum_str.f_admissions then 
       :sorlfos_majr_code := :global.admissions_majr_code;
	     :sorlfos_dept_code := :global.admissions_dept_code;
      When  sb_curriculum_str.f_learner then 
	     :sorlfos_majr_code := :global.learner_majr_code;
	     :sorlfos_dept_code := :global.learner_dept_code;
      When  sb_curriculum_str.f_outcome then 
	     :sorlfos_majr_code := :global.outcome_majr_code;
    	 :sorlfos_dept_code := :global.outcome_dept_code;
      else
      	null;
    end case;
    :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
    :sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
  end if; -- end of its a major 

end if; ---- lfst code is not null 

--- update the temp file for the attached major lov
declare 
	
lv_tfos_exists varchar2(1) := null;
cursor tfos_c is 
	  select 'x' from sotlfos
	 	  where sotlfos_pidm = :sorlfos_pidm
      and sotlfos_lcur_seqno = :sorlcur_seqno 
	    and sotlfos_seqno = :sorlfos_seqno;
	  
begin
	open tfos_c;
	fetch tfos_c into lv_tfos_exists;
	if tfos_c%notfound then 
		 close tfos_c;
		 return;
	end if;
	-- update the lfst type so attached major lov wont get confused 
	update sotlfos
	set sotlfos_lfst_code = :sorlfos_lfst_code
  where sotlfos_pidm = :sorlfos_pidm
  and sotlfos_lcur_seqno = :sorlcur_seqno 
	and sotlfos_seqno = :sorlfos_seqno;
  close tfos_c;
end ; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLFOS_LFST_CODE")
		public void sorlfosLfstCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				if(sorlfosElement.getSorlfosLfstCode().isNull())
		return;
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				sorlfosElement.setSorlfosLfstCodeDesc(GbGtvlfst.fGetDescription(sorlfosElement.getSorlfosLfstCode()));
				// - figure out the default priority
				if ( !sorlfosElement.getSorlfosLfstCode().isNull() && sorlfosElement.getSorlfosPriorityNo().isNull() )
				{
					{
						NNumber initialPriority = toNumber(0);
						String sqlmaxPriorityC = "SELECT nvl(max(sotlfos_priority_no), 0) " +
	" FROM sotlfos " +
	" WHERE sotlfos_pidm = :SORLCUR_PIDM AND sotlfos_lcur_seqno = :SORLCUR_SEQNO AND sotlfos_lfst_code = :SORLFOS_LFST_CODE ";
						DataCursor maxPriorityC = new DataCursor(sqlmaxPriorityC);
						try {
							//Setting query parameters
							maxPriorityC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							maxPriorityC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							maxPriorityC.addParameter("SORLFOS_LFST_CODE", sorlfosElement.getSorlfosLfstCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxPriorityC.
							maxPriorityC.open();
							ResultSet maxPriorityCResults = maxPriorityC.fetchInto();
							if ( maxPriorityCResults != null ) {
								initialPriority = maxPriorityCResults.getNumber(0);
							}
							if ( maxPriorityC.notFound() )
							{
								initialPriority = toNumber(0);
							}
						} finally{
							maxPriorityC.close();							
						}

						if ( initialPriority.equals(0) )
						{
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
						}
						else {
							sorlfosElement.setSorlfosPriorityNo(initialPriority.add(getGlobal("SOBCTRL_PRIORITY_INCR")));
						}
					}
					//  only default in the major code if its a MAJOR type 
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()) )
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						this.getContainer().getServices().retrieveDefaults(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
						if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fRecruit()))
						{
							sorlfosElement.setSorlfosMajrCode(getGlobal("RECRUIT_MAJR_CODE"));
							sorlfosElement.setSorlfosDeptCode(getGlobal("RECRUIT_DEPT_CODE"));
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fAdmissions()))
						{
							sorlfosElement.setSorlfosMajrCode(getGlobal("ADMISSIONS_MAJR_CODE"));
							sorlfosElement.setSorlfosDeptCode(getGlobal("ADMISSIONS_DEPT_CODE"));
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()))
						{
							sorlfosElement.setSorlfosMajrCode(getGlobal("LEARNER_MAJR_CODE"));
							sorlfosElement.setSorlfosDeptCode(getGlobal("LEARNER_DEPT_CODE"));
						}
						else if (getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()))
						{
							sorlfosElement.setSorlfosMajrCode(getGlobal("OUTCOME_MAJR_CODE"));
							sorlfosElement.setSorlfosDeptCode(getGlobal("OUTCOME_DEPT_CODE"));
						}
						else {
						}
						sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
						sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
					}
				}
				{
					NString lvTfosExists = NString.getNull();
					String sqltfosC = "SELECT 'x' " +
	" FROM sotlfos " +
	" WHERE sotlfos_pidm = :SORLFOS_PIDM AND sotlfos_lcur_seqno = :SORLCUR_SEQNO AND sotlfos_seqno = :SORLFOS_SEQNO ";
					DataCursor tfosC = new DataCursor(sqltfosC);
					try {
						//Setting query parameters
						tfosC.addParameter("SORLFOS_PIDM", sorlfosElement.getSorlfosPidm());
						tfosC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
						tfosC.addParameter("SORLFOS_SEQNO", sorlfosElement.getSorlfosSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable tfosC.
						tfosC.open();
						ResultSet tfosCResults = tfosC.fetchInto();
						if ( tfosCResults != null ) {
							lvTfosExists = tfosCResults.getStr(0);
						}
						if ( tfosC.notFound() )
						{
							tfosC.close();
							return ;
						}
					} finally {
						tfosC.close();
					}
					//  update the lfst type so attached major lov wont get confused 
					String sql1 = "UPDATE sotlfos " +
	"SET sotlfos_lfst_code = :SORLFOS_LFST_CODE " +
	" WHERE sotlfos_pidm = :SORLFOS_PIDM AND sotlfos_lcur_seqno = :SORLCUR_SEQNO AND sotlfos_seqno = :SORLFOS_SEQNO";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("SORLFOS_LFST_CODE", sorlfosElement.getSorlfosLfstCode());
					command1.addParameter("SORLFOS_PIDM", sorlfosElement.getSorlfosPidm());
					command1.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
					command1.addParameter("SORLFOS_SEQNO", sorlfosElement.getSorlfosSeqno());
					rowCount = command1.execute();
					tfosC.close();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_PRIORITY_NO.WHEN-NEW-ITEM-INSTANCE
		 	IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' Then 
		   if	 :sorlfos_current_ind = 'Y' and 
					 sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y' then 
		     set_item_property('lfos_deactive_btn',enabled,property_true);
			  else 	  
		     set_item_property('lfos_deactive_btn',enabled,property_false);
		   end if; 
	END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_PRIORITY_NO.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_PRIORITY_NO", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosPriorityNo_itemChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getItemVisible("lfos_deactive_btn").equals("TRUE") )
				{
					if ( sorlfosElement.getSorlfosCurrentInd().equals("Y") && SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") )
					{
						setItemEnabled("lfos_deactive_btn", true);
					}
					else {
						setItemEnabled("lfos_deactive_btn", false);
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_TERM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosTermCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosTermCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_TERM_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosTermCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE.WHEN-MOUSE-DOUBLECLICK
		  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_TERM_CODE")
		public void sorlfosTermCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE.WHEN-VALIDATE-ITEM
		 g$_check_query_mode;  
if :sorlfos_term_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlfos_term_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0319', 'FORM','*ERROR* Invalid term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

if :global.query_mode = '1' then 
	  return ;
end if;

if :sorlfos_term_code <> :sorlcur_term_code then 
	message(G$_NLS.Get('SOQOLIB-0320', 'FORM','*ERROR* term code must be equal to curriculum term.') );
	raise form_trigger_failure;
end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_TERM_CODE")
		public void sorlfosTermCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( sorlfosElement.getSorlfosTermCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlfosElement.getSorlfosTermCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0319"), toStr("FORM"), toStr("*ERROR* Invalid term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosTermCode().notEquals(sorlcurElement.getSorlcurTermCode()) )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0320"), toStr("FORM"), toStr("*ERROR* term code must be equal to curriculum term.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_TERM_CODE_CTLG", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosTermCodeCtlg_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosTermCodeCtlg_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_TERM_CODE_CTLG", function=KeyFunction.NEXT_ITEM)
		public void sorlfosTermCodeCtlg_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE_CTLG.WHEN-MOUSE-DOUBLECLICK
		  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_TERM_CODE_CTLG")
		public void sorlfosTermCodeCtlg_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE_CTLG.WHEN-VALIDATE-ITEM
		 if :sorlfos_term_code_ctlg is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlfos_term_code_ctlg);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0321', 'FORM','*ERROR* Invalid catalog term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_TERM_CODE_CTLG")
		public void sorlfosTermCodeCtlg_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlfosElement.getSorlfosTermCodeCtlg());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0321"), toStr("FORM"), toStr("*ERROR* Invalid catalog term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE_CTLG.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

g$_check_query_mode;  
if :global.query_mode = '1' then 
	return;
end if; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_CTLG.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_TERM_CODE_CTLG", function=KeyFunction.ITEM_OUT)
		public void sorlfosTermCodeCtlg_itemOut()
		{
			
				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_TERM_CODE_END", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosTermCodeEnd_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosTermCodeEnd_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_TERM_CODE_END", function=KeyFunction.NEXT_ITEM)
		public void sorlfosTermCodeEnd_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_TERM_CODE_END", function=KeyFunction.ITEM_OUT)
		public void sorlfosTermCodeEnd_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		 
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_TERM_CODE_END")
		public void sorlfosTermCodeEnd_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 g$_check_query_mode;
if :sorlfos_term_code_end is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlfos_term_code_end);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0322', 'FORM','*ERROR* Invalid end term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

if :global.query_mode = '1' then
	null;
else 
	if :sorlfos_term_code_end < :sorlfos_term_code then 
		message( G$_NLS.Get('SOQOLIB-0323', 'FORM','*ERROR* End term must be greater or equal to the term code.') );
		raise form_trigger_failure;
	end if;
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_TERM_CODE_END")
		public void sorlfosTermCodeEnd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( sorlfosElement.getSorlfosTermCodeEnd().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlfosElement.getSorlfosTermCodeEnd());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0322"), toStr("FORM"), toStr("*ERROR* Invalid end term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
				}
				else {
					if ( sorlfosElement.getSorlfosTermCodeEnd().lesser(sorlfosElement.getSorlfosTermCode()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0323"), toStr("FORM"), toStr("*ERROR* End term must be greater or equal to the term code.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_MAJR_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosMajrCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.WHEN-MOUSE-DOUBLECLICK
		 
if :sorlfos_lfst_code is null then 
	message( G$_NLS.Get('SOQOLIB-0324', 'FORM','Enter field of study type before selecting field of study.') );
  raise form_trigger_failure;
end if;
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_MAJR_CODE")
		public void sorlfosMajrCode_doubleClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0324"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
					throw new ApplicationException();
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.G$_SEARCH_OPTIONS
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
 	if :sovlfos_rowid is not null then 
      execute_trigger('lfos_lov_error_msg');
		
	ELSE 
    	if :sorlfos_lfst_code is null then 
				message( G$_NLS.Get('SOQOLIB-0325', 'FORM','Enter field of study type before selecting field of study.') );
			  raise form_trigger_failure;
			end if;
			case :sorlfos_lfst_code 
			when sb_fieldofstudy_str.f_major then
			   execute_trigger('major_options');
			   g$_check_failure;
			when sb_fieldofstudy_str.f_minor  then 
			   execute_trigger('minor_options');
			   g$_check_failure;
			when sb_fieldofstudy_str.f_concentration then 
			   execute_trigger('conc_options');
			   g$_check_failure;
			else 
				 do_key('list_values'); 
			end case;
			
			end if; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlfosMajrCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlfosElement.getSovlfosRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						if ( sorlfosElement.getSorlfosLfstCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0325"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
							throw new ApplicationException();
						}
						if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
						{
							executeAction("major_options");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
						{
							executeAction("minor_options");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
						{
							executeAction("conc_options");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							executeAction("LIST_VALUES");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVMAJR_CODE','STVMAJR_DESC','');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosMajrCode_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("STVMAJR_CODE"), toStr("STVMAJR_DESC"), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.PRE-TEXT-ITEM
		 --if :sorlfos_lfst_code is null then 
--	:sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
--	message( G$_NLS.Get('x', 'FORM','Field of study type is blank and required, defaulting type to MAJOR.') );
 -- raise form_trigger_failure;
--end if;
if :sovlfos_rowid is not null then return;
	end if; 

case :sorlfos_lfst_code 
when sb_fieldofstudy_str.f_major then
   set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_majr_lov');
when sb_fieldofstudy_str.f_minor  then 
  set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_minr_lov');
when sb_fieldofstudy_str.f_concentration then 
   set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_conc_lov');
else 
	 set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_lov');
end case;


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
		 * SORLFOS_MAJR_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLFOS_MAJR_CODE", function=KeyFunction.ITEM_IN)
		public void sorlfosMajrCode_itemIn()
		{
			
				// if :sorlfos_lfst_code is null then 
				// 	:sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
				// 	message( G$_NLS.Get('x', 'FORM','Field of study type is blank and required, defaulting type to MAJOR.') );
				//  raise form_trigger_failure;
				// end if;

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// if :sorlfos_lfst_code is null then 
				// 	:sorlfos_lfst_code := sb_fieldofstudy_str.f_major;
				// 	message( G$_NLS.Get('x', 'FORM','Field of study type is blank and required, defaulting type to MAJOR.') );
				//  raise form_trigger_failure;
				// end if;
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_majr_lov");
				}
				else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_minr_lov");
				}
				else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_conc_lov");
				}
				else {
					setItemLovName("sorlfos_majr_code", "stvmajr_lov");
				}
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_majr_code is null OR 
	:sovlfos_rowid is not null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
	
BEGIN
  :sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	case :sorlfos_lfst_code 
	when sb_fieldofstudy_str.f_major then
	   	test_code := gb_stvmajr.f_major_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0326', 'FORM','*ERROR* Invalid major code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
	when sb_fieldofstudy_str.f_minor  then 
	   	test_code := gb_stvmajr.f_minor_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0327', 'FORM','*ERROR* Invalid minor code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;	 
	when sb_fieldofstudy_str.f_concentration then 
	   	test_code := gb_stvmajr.f_concentration_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0328', 'FORM','*ERROR* Invalid concentration code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
  else 
     if :sorlfos_lfst_code is null then 
     		message( G$_NLS.Get('SOQOLIB-0329', 'FORM','Enter field of study type before selecting field of study.') );
	      raise form_trigger_failure;
	    end if;
	   	test_code := gb_stvmajr.f_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0330', 'FORM','*ERROR* Invalid major code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
  end case;


G$_CHECK_QUERY_MODE;
if :global.query_mode = '1' then 
	return;
end if; 
if :sorlcur_duplicate_ind = 'Y' then 
	return;
end if;

  if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then  
  	 if :sorlfos_majr_code_attach is not null then    
       execute_trigger('validate_attached_major');
     end if;
  end if;	

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_MAJR_CODE")
		public void sorlfosMajrCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosMajrCode().isNull() || !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
					if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
					{
						testCode = GbStvmajr.fMajorCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0326"), toStr("FORM"), toStr("*ERROR* Invalid major code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
					{
						testCode = GbStvmajr.fMinorCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0327"), toStr("FORM"), toStr("*ERROR* Invalid minor code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
					{
						testCode = GbStvmajr.fConcentrationCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0328"), toStr("FORM"), toStr("*ERROR* Invalid concentration code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else {
						if ( sorlfosElement.getSorlfosLfstCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0329"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
							throw new ApplicationException();
						}
						testCode = GbStvmajr.fCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0330"), toStr("FORM"), toStr("*ERROR* Invalid major code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					getContainer().getGoqrpls().gCheckQueryMode();
					if ( getGlobal("QUERY_MODE").equals("1") )
					{
						return ;
					}
					if ( sorlcurElement.getSorlcurDuplicateInd().equals("Y") )
					{
						return ;
					}
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
					{
						if ( !sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
						{
							executeAction("validate_attached_major");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
if :sovlfos_rowid is not null then 
	return;
end if; 

case :sorlfos_lfst_code 
when sb_fieldofstudy_str.f_major then
   set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_majr_lov');
when sb_fieldofstudy_str.f_minor  then 
  set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_minr_lov');
when sb_fieldofstudy_str.f_concentration then 
   set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_conc_lov');
else 
	if :sorlfos_lfst_code is null then 
		go_item('SORLFOS_LFST_CODE');
		message( G$_NLS.Get('SOQOLIB-0331', 'FORM','Enter field of study type before selecting field of study.') );
	  raise form_trigger_failure;
	end if;
	 set_item_property('sorlfos_majr_code',LOV_NAME,'stvmajr_lov');
end case;

	
	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_MAJR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosMajrCode_itemChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getContainer().getGoqrpls().gCheckFailure();
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_majr_lov");
				}
				else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_minr_lov");
				}
				else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
				{
					setItemLovName("sorlfos_majr_code", "stvmajr_conc_lov");
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						goItem(toStr("SORLFOS_LFST_CODE"));
						errorMessage(GNls.Fget(toStr("SOQOLIB-0331"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
						throw new ApplicationException();
					}
					setItemLovName("sorlfos_majr_code", "stvmajr_lov");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.KEY-LISTVAL
		 :global.value := '';
if :sovlfos_rowid is not null AND 
 :SYSTEM.MODE <> 'ENTER-QUERY' THEN
 	  execute_trigger('lfos_lov_error_msg');

ELSE

	if :sorlfos_lfst_code is null then 
		go_item('SORLFOS_LFST_CODE'); 
		message( G$_NLS.Get('SOQOLIB-0332', 'FORM','Enter field of study type before selecting field of study.') );
	  raise form_trigger_failure;
	end if;
	list_values;
	if :global.value is not null then 
		:sorlfos_majr_code := :global.value;
		next_item;
	end if;

end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLFOS_MAJR_CODE", function=KeyFunction.LIST_VALUES)
		public void sorlfosMajrCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				setGlobal("VALUE", toStr(""));
				if ( !sorlfosElement.getSovlfosRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						goItem(toStr("SORLFOS_LFST_CODE"));
						errorMessage(GNls.Fget(toStr("SOQOLIB-0332"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
						throw new ApplicationException();
					}
					listValues();
					if ( !getGlobal("VALUE").isNull() )
					{
						sorlfosElement.setSorlfosMajrCode(getGlobal("VALUE"));
						nextItem();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.MINOR_OPTIONS
		 :lfos_option_key1 := '';
:lfos_option_title1 := '';
:lfos_option_key2 := '';
:lfos_option_title2 := '';
GO_ITEM('SORLFOS_MAJR_CODE');
BREAK;
:CHECK_KEYS := 'N';
:s$_curricula.options_ind := 'Y'; 
:opt_ind := 'Y';
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));

<multilinecomment>  referenced trigger to set up option titles</multilinecomment>
execute_trigger('lfos_curr_minor_options');
G$_KEY_OPT_MENU('SORLFOS_MAJR_CODE',:lfos_option_title1, :lfos_option_key1,
                                    :lfos_option_title2,:lfos_option_key2,
                                    '','','','');

G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.MINOR_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="MINOR_OPTIONS")
		public void sorlfosMajrCode_MinorOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				sorlfosElement.setLfosOptionKey1(toStr(""));
				sorlfosElement.setLfosOptionTitle1(toStr(""));
				sorlfosElement.setLfosOptionKey2(toStr(""));
				sorlfosElement.setLfosOptionTitle2(toStr(""));
				goItem(toStr("SORLFOS_MAJR_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getFormModel().getSCurrProcBlock().setOptInd(toStr("Y"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				//   referenced trigger to set up option titles
				executeAction("lfos_curr_minor_options");
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLFOS_MAJR_CODE"), sorlfosElement.getLfosOptionTitle1(), sorlfosElement.getLfosOptionKey1(), sorlfosElement.getLfosOptionTitle2(), sorlfosElement.getLfosOptionKey2(), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.CONC_OPTIONS
		 :lfos_option_key1 := '';
:lfos_option_title1 := '';
:lfos_option_key2 := '';
:lfos_option_title2 := '';
<multilinecomment>  referenced trigger to set up option titles</multilinecomment>
GO_ITEM('SORLFOS_MAJR_CODE');
BREAK;
:CHECK_KEYS := 'N';
:s$_curricula.options_ind := 'Y'; 
:opt_ind := 'Y';
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));
execute_trigger('lfos_curr_conc_options');
G$_KEY_OPT_MENU('SORLFOS_MAJR_CODE',:lfos_option_title1, :lfos_option_key1,
                                    :lfos_option_title2,:lfos_option_key2,
                                    '','','','');

G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.CONC_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CONC_OPTIONS")
		public void sorlfosMajrCode_ConcOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				sorlfosElement.setLfosOptionKey1(toStr(""));
				sorlfosElement.setLfosOptionTitle1(toStr(""));
				sorlfosElement.setLfosOptionKey2(toStr(""));
				sorlfosElement.setLfosOptionTitle2(toStr(""));
				//   referenced trigger to set up option titles
				goItem(toStr("SORLFOS_MAJR_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getFormModel().getSCurrProcBlock().setOptInd(toStr("Y"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				executeAction("lfos_curr_conc_options");
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLFOS_MAJR_CODE"), sorlfosElement.getLfosOptionTitle1(), sorlfosElement.getLfosOptionKey1(), sorlfosElement.getLfosOptionTitle2(), sorlfosElement.getLfosOptionKey2(), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.MAJOR_OPTIONS
		 :lfos_option_key1 := '';
:lfos_option_title1 := '';
:lfos_option_key2 := '';
:lfos_option_title2 := '';
GO_ITEM('SORLFOS_MAJR_CODE');
BREAK;
:CHECK_KEYS := 'N';
:s$_curricula.options_ind := 'Y'; 
:opt_ind := 'Y';

copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));
<multilinecomment>  referenced trigger to set up option titles</multilinecomment>
execute_trigger('lfos_curr_major_options');
g$_check_failure;

G$_KEY_OPT_MENU('SORLFOS_MAJR_CODE',:lfos_option_title1, :lfos_option_key1,
                                    :lfos_option_title2,:lfos_option_key2,
                                    '','','','');

G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.MAJOR_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="MAJOR_OPTIONS")
		public void sorlfosMajrCode_MajorOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				sorlfosElement.setLfosOptionKey1(toStr(""));
				sorlfosElement.setLfosOptionTitle1(toStr(""));
				sorlfosElement.setLfosOptionKey2(toStr(""));
				sorlfosElement.setLfosOptionTitle2(toStr(""));
				goItem(toStr("SORLFOS_MAJR_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getFormModel().getSCurrProcBlock().setOptInd(toStr("Y"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				//   referenced trigger to set up option titles
				executeAction("lfos_curr_major_options");
				getContainer().getGoqrpls().gCheckFailure();
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLFOS_MAJR_CODE"), sorlfosElement.getLfosOptionTitle1(), sorlfosElement.getLfosOptionKey1(), sorlfosElement.getLfosOptionTitle2(), sorlfosElement.getLfosOptionKey2(), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
 
if :sovlfos_rowid is not null then 
	return;
end if; 
if :sorlfos_majr_code is null then
	:sorlfos_majr_desc := '';
	:sorlfos_majr_code_attach := null;
	:sorlfos_attach_conc_desc := null;
	:sorlfos_conc_attach_rule := null; 
	return;
end if;
if get_block_property('SORLFOS',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
end if;	
g$_check_query_mode;  
if :global.query_mode = '1' then 
	return;
end if;
execute_trigger('LFOS_MAJR_POST_TEXT');
g$_check_failure;

--g$_determine_cursor_location(:system.current_item); 
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_MAJR_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlfosMajrCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosMajrCode().isNull() )
				{
					sorlfosElement.setSorlfosMajrDesc(toStr(""));
					sorlfosElement.setSorlfosMajrCodeAttach(toStr(null));
					sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
					return ;
				}
				if ( getBlockInsertAllowed("SORLFOS").equals("FALSE") )
				{
					return ;
				}
				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				executeAction("LFOS_MAJR_POST_TEXT");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.KEY-HELP
		 
IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlfos_rowid is not null   THEN
	HELP;
ELSE 

	if :sorlfos_lfst_code is null then 
		message( G$_NLS.Get('SOQOLIB-0333', 'FORM','Enter field of study type before selecting field of study.') );
	  raise form_trigger_failure;
	end if;
	if :s$_curricula.lcur_sobctrl_curr_rule_ind = 'Y' then 
	  execute_trigger('lfos_check_base');
	end if;
	
	case :sorlfos_lfst_code 
	when sb_fieldofstudy_str.f_major then
	   execute_trigger('lfos_curr_major_help');
	   g$_check_failure;
	when sb_fieldofstudy_str.f_minor  then 
	   execute_trigger('lfos_curr_minor_help');
	   g$_check_failure;
	when sb_fieldofstudy_str.f_concentration then 
	   execute_trigger('lfos_curr_conc_help');
	   g$_check_failure;
	else 
		  DO_KEY('LIST_VALUES');	 
	end case;

END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLFOS_MAJR_CODE", function=KeyFunction.HELP)
		public void sorlfosMajrCode_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlfosElement.getSovlfosRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0333"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
						throw new ApplicationException();
					}
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						executeAction("lfos_check_base");
					}
					if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
					{
						executeAction("lfos_curr_major_help");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
					{
						executeAction("lfos_curr_minor_help");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
					{
						executeAction("lfos_curr_conc_help");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_DEPT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosDeptCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosDeptCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_DEPT_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosDeptCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_DEPT_CODE")
		public void sorlfosDeptCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_dept_code is null then
	return;
end if;
if :sovlfos_rowid is not null then 
	return;
end if; 

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvdept.f_code_exists(:sorlfos_dept_code);
	:sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);

	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0334', 'FORM','*ERROR* Invalid department code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_DEPT_CODE")
		public void sorlfosDeptCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosDeptCode().isNull() )
				{
					return ;
				}
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvdept.fCodeExists(sorlfosElement.getSorlfosDeptCode());
					sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0334"), toStr("FORM"), toStr("*ERROR* Invalid department code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE.DEPT_OPTIONS
		 
:lfos_option_key1 := '';
:lfos_option_title1 := '';
:lfos_option_key2 := '';
:lfos_option_title2 := '';
GO_ITEM('SORLFOS_DEPT_CODE');
:s$_curricula.options_ind := 'Y'; 

BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));
if :sorlfos_lfst_code <> sb_fieldofstudy_str.f_major 
	then 
	  :lfos_option_key1 := 'LIST_VALUES';
    :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0335', 'FORM','All Department Codes') ;
		G$_KEY_OPT_MENU('SORLFOS_DEPT_CODE',:lfos_option_title1, :lfos_option_key1,
		                                    '','','','','','');
		
		G$_CHECK_FAILURE;
else 
		<multilinecomment>  referenced trigger to set up option titles</multilinecomment>
		execute_trigger('lfos_curr_dept_options');
		
		G$_KEY_OPT_MENU('SORLFOS_DEPT_CODE',:lfos_option_title1, :lfos_option_key1,
		                                    :lfos_option_title2,:lfos_option_key2,
		                                    '','','','');
		
		G$_CHECK_FAILURE;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.DEPT_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DEPT_OPTIONS")
		public void sorlfosDeptCode_DeptOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				sorlfosElement.setLfosOptionKey1(toStr(""));
				sorlfosElement.setLfosOptionTitle1(toStr(""));
				sorlfosElement.setLfosOptionKey2(toStr(""));
				sorlfosElement.setLfosOptionTitle2(toStr(""));
				goItem(toStr("SORLFOS_DEPT_CODE"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				if ( sorlfosElement.getSorlfosLfstCode().notEquals(SbFieldofstudyStr.fMajor()) )
				{
					sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
					sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0335"), toStr("FORM"), toStr("All Department Codes")));
					getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLFOS_DEPT_CODE"), sorlfosElement.getLfosOptionTitle1(), sorlfosElement.getLfosOptionKey1(), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""));
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					//   referenced trigger to set up option titles
					executeAction("lfos_curr_dept_options");
					getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLFOS_DEPT_CODE"), sorlfosElement.getLfosOptionTitle1(), sorlfosElement.getLfosOptionKey1(), sorlfosElement.getLfosOptionTitle2(), sorlfosElement.getLfosOptionKey2(), toStr(""), toStr(""), toStr(""), toStr(""));
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE.KEY-HELP
		 
IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlfos_rowid is not null 	then 
	HELP;
ELSE 

execute_trigger('lfos_curr_dept_help');
g$_check_failure;

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLFOS_DEPT_CODE", function=KeyFunction.HELP)
		public void sorlfosDeptCode_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlfosElement.getSovlfosRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					executeAction("lfos_curr_dept_help");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE.PRE-TEXT-ITEM
		 if :sovlfos_rowid is not null then
	return;
end if; 
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
		 * SORLFOS_DEPT_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLFOS_DEPT_CODE", function=KeyFunction.ITEM_IN)
		public void sorlfosDeptCode_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_MAJR_CODE_ATTACH")
		public void sorlfosMajrCodeAttach_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_MAJR_CODE_ATTACH", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosMajrCodeAttach_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_MAJR_CODE_ATTACH", function=KeyFunction.NEXT_ITEM)
		public void sorlfosMajrCodeAttach_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVMAJR_CODE','STVMAJR_DESC','');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosMajrCodeAttach_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("STVMAJR_CODE"), toStr("STVMAJR_DESC"), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sovlfos_rowid is not null then
	return;
end if; 

if :sorlfos_majr_code_attach is null then
	:sorlfos_attach_conc_desc := null;
	return;
end if;
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_MAJR_CODE_ATTACH", function=KeyFunction.ITEM_OUT)
		public void sorlfosMajrCodeAttach_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
				{
					sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.POST-CHANGE
		 if :sovlfos_rowid is not null then
	return;
end if; 

if :sorlfos_majr_code_attach is null then 
	:sorlfos_attach_conc_desc := null;
	:sorlfos_conc_attach_rule := null;
	return;
end if;

:sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);


  

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLFOS_MAJR_CODE_ATTACH")
		public void sorlfosMajrCodeAttach_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if(sorlfosElement.getSorlfosMajrCodeAttach().isNull())
		return;
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
				{
					sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
					return ;
				}
				sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.WHEN-VALIDATE-ITEM
		 if :sovlfos_rowid is not null then
	return;
end if; 

if :sorlfos_majr_code_attach is null then 
	:sorlfos_attach_conc_desc := null;
	:sorlfos_conc_attach_rule := null;
	return;
end if;

G$_CHECK_QUERY_MODE;
if :global.query_mode = '1' then 
	return;
end if; 
if :sorlcur_duplicate_ind = 'Y' 
	then return;
end if; 
execute_trigger('validate_attached_major');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_MAJR_CODE_ATTACH")
		public void sorlfosMajrCodeAttach_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlfosMajrCodeAttach_PostChange();

				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
				{
					sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
					return ;
				}
				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				if ( sorlcurElement.getSorlcurDuplicateInd().equals("Y") )
				{
					return ;
				}
				executeAction("validate_attached_major");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.PRE-TEXT-ITEM
		 if :sovlfos_rowid is not null then
	return;
end if; 

if :sorlfos_lfst_code is null then 
	:sorlfos_lfst_code := sb_fieldofstudy_str.f_concentration;
	message( G$_NLS.Get('SOQOLIB-0336', 'FORM','Field of study type required before attaching major to concentration, defaulting type to CONCENTRATION.') );
 -- raise form_trigger_failure;
end if;


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
		 * SORLFOS_MAJR_CODE_ATTACH.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLFOS_MAJR_CODE_ATTACH", function=KeyFunction.ITEM_IN)
		public void sorlfosMajrCodeAttach_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					sorlfosElement.setSorlfosLfstCode(SbFieldofstudyStr.fConcentration());
					errorMessage(GNls.Fget(toStr("SOQOLIB-0336"), toStr("FORM"), toStr("Field of study type required before attaching major to concentration, defaulting type to CONCENTRATION.")));
				}
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlcurElement.getSorlcurTermCode()));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TMST_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_TMST_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosTmstCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TMST_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlfosTmstCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TMST_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_TMST_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosTmstCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TMST_CODE.WHEN-MOUSE-DOUBLECLICK
		  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TMST_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_TMST_CODE")
		public void sorlfosTmstCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TMST_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_tmst_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvtmst.f_code_exists(:sorlfos_tmst_code);
	:sorlfos_tmst_desc := sb_stvtmst.f_get_description(:sorlfos_tmst_code);

	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0337', 'FORM','*ERROR* Invalid time status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_TMST_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_TMST_CODE")
		public void sorlfosTmstCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlfosElement.getSorlfosTmstCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvtmst.fCodeExists(sorlfosElement.getSorlfosTmstCode());
					sorlfosElement.setSorlfosTmstDesc(SbStvtmst.fGetDescription(sorlfosElement.getSorlfosTmstCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0337"), toStr("FORM"), toStr("*ERROR* Invalid time status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_START_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlfosStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_START_DATE.POST-CHANGE
		 IF :SORLFOS_START_DATE IS NOT NULL
	AND :SORLFOS_END_DATE IS NOT NULL THEN 
	IF :SORLFOS_END_DATE < :SORLFOS_START_DATE THEN 
		message( G$_NLS.Get('SOQOLIB-0338', 'FORM','*ERROR* Start date must be less than end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLFOS_START_DATE")
		public void sorlfosStartDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if(sorlfosElement.getSorlfosStartDate().isNull())
		return;
				if ( !sorlfosElement.getSorlfosStartDate().isNull() && !sorlfosElement.getSorlfosEndDate().isNull() )
				{
					if ( sorlfosElement.getSorlfosEndDate().lesser(sorlfosElement.getSorlfosStartDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0338"), toStr("FORM"), toStr("*ERROR* Start date must be less than end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLFOS_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlfosEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLFOS_END_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlfosEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_END_DATE.POST-CHANGE
		 IF :SORLFOS_START_DATE IS NOT NULL
	AND :SORLFOS_END_DATE IS NOT NULL THEN 
	IF :SORLFOS_END_DATE < :SORLFOS_START_DATE THEN 
		message( G$_NLS.Get('SOQOLIB-0339', 'FORM','*ERROR* Start date must be less than end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLFOS_END_DATE")
		public void sorlfosEndDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if(sorlfosElement.getSorlfosEndDate().isNull())
		return;
				if ( !sorlfosElement.getSorlfosStartDate().isNull() && !sorlfosElement.getSorlfosEndDate().isNull() )
				{
					if ( sorlfosElement.getSorlfosEndDate().lesser(sorlfosElement.getSorlfosStartDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0339"), toStr("FORM"), toStr("*ERROR* Start date must be less than end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CACT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLFOS_CACT_CODE_LBT")
		public void sorlfosCactCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLFOS_START_DATE_DBT")
		public void sorlfosStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLFOS_START_DATE_DBT")
		public void sorlfosStartDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLFOS_END_DATE_DBT")
		public void sorlfosEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLFOS_END_DATE_DBT")
		public void sorlfosEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLFOS_DEPT_CODE_LBT")
		public void sorlfosDeptCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLFOS.SORLFOS_DEPT_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
	if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0340', 'FORM','Enter field of study type before selecting department.') );
		  raise form_trigger_failure;
 	end if;

   execute_trigger('dept_options');
   g$_check_failure;
END IF;

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_DEPT_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLFOS_DEPT_CODE_LBT")
		public void sorlfosDeptCodeLbt_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				goItem(toStr("SORLFOS.SORLFOS_DEPT_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0340"), toStr("FORM"), toStr("Enter field of study type before selecting department.")));
						throw new ApplicationException();
					}
					executeAction("dept_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLFOS.SORLFOS_MAJR_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
	if :sorlfos_lfst_code is null then 
		message( G$_NLS.Get('SOQOLIB-0341', 'FORM','Enter field of study type before selecting field of study.') );
	  raise form_trigger_failure;
	end if;
	case :sorlfos_lfst_code 
	when sb_fieldofstudy_str.f_major then
	   execute_trigger('major_options');
	   g$_check_failure;
	when sb_fieldofstudy_str.f_minor  then 
	   execute_trigger('minor_options');
	   g$_check_failure;
	when sb_fieldofstudy_str.f_concentration then 
	   execute_trigger('conc_options');
	   g$_check_failure;
	else 
		 DO_KEY('LIST_VALUES');
	end case;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLFOS_MAJR_CODE_LBT")
		public void sorlfosMajrCodeLbt_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				goItem(toStr("SORLFOS.SORLFOS_MAJR_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0341"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
						throw new ApplicationException();
					}
					if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()))
					{
						executeAction("major_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
					{
						executeAction("minor_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
					{
						executeAction("conc_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLFOS_MAJR_CODE_ATTACH_LBT")
		public void sorlfosMajrCodeAttachLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH_LBT.WHEN-BUTTON-PRESSED
		 If get_item_property('sorlfos_majr_code_attach',enabled) = 'TRUE' then
  GO_ITEM('SORLFOS.SORLFOS_MAJR_CODE_ATTACH');
	IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
		DO_KEY('LIST_VALUES');
	ELSE
		if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0342', 'FORM','Enter field of study type before selecting attached major.') );
		  raise form_trigger_failure;
		end if;
	  do_key('list_values'); 
	END IF;
else 
	if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0343', 'FORM','Enter field of study type before selecting attached major.') );
		  raise form_trigger_failure;
	end if;

END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLFOS_MAJR_CODE_ATTACH_LBT")
		public void sorlfosMajrCodeAttachLbt_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getItemEnabled("sorlfos_majr_code_attach").equals("TRUE") )
				{
					goItem(toStr("SORLFOS.SORLFOS_MAJR_CODE_ATTACH"));
					if ( getMode().equals("ENTER-QUERY") )
					{
						executeAction("LIST_VALUES");
					}
					else {
						if ( sorlfosElement.getSorlfosLfstCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0342"), toStr("FORM"), toStr("Enter field of study type before selecting attached major.")));
							throw new ApplicationException();
						}
						executeAction("LIST_VALUES");
					}
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0343"), toStr("FORM"), toStr("Enter field of study type before selecting attached major.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_MAJR_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosMajrDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LFST_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLFOS_LFST_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlfosLfstCodeDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_START_DATE")
		public void sorlfosStartDate_validate()
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
							this.sorlfosStartDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLFOS_END_DATE")
		public void sorlfosEndDate_validate()
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
							this.sorlfosEndDate_PostChange();

			}

		
	
	
}

