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
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
		
public class SorlcurLiteController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public SorlcurLiteController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-CLRBLK
		 :system.message_level := '5'; 
go_block('sorlfos_lite');
clear_block(no_validate);
go_block('sorlcur_lite');
clear_block(no_validate);
execute_query;
go_block('SORLFOS_lite');
execute_query;
go_block('SORLCUR_lite'); 
:system.message_level := '0'; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sorlcurLite_keyClearBlock()
		{
			
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				goBlock(toStr("sorlfos_lite"));
				clearBlock(TaskServices.NO_VALIDATE);
				goBlock(toStr("sorlcur_lite"));
				clearBlock(TaskServices.NO_VALIDATE);
				executeQuery();
				goBlock(toStr("SORLFOS_lite"));
				executeQuery();
				goBlock(toStr("SORLCUR_lite"));
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-CLRREC
		 
if 	( get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0344', 'FORM',
	'Commit or rollback curriculum data changes before clearing the curriculum record.') );
	raise form_trigger_failure;
end if; 
if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;
--
 
:dup_create_ind := 'N'; 
go_block('sorlfos_lite');
g$_check_failure;
clear_block(no_validate);
g$_check_failure;
go_block('sorlcur_lite');
clear_record;
g$_check_failure;
if :sovlcur_rowid is null then 
	:s$_curricula_lite.lcur_rec_cnt := :s$_curricula_lite.lcur_rec_cnt + 1;
	execute_trigger('new_sorlcur');
	g$_check_failure;
end if;


  
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sorlcurLite_ClearRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ((getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0344"), toStr("FORM"), toStr("Commit or rollback curriculum data changes before clearing the curriculum record.")));
					throw new ApplicationException();
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						throw new ApplicationException();
					}
				}
				// 
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				goBlock(toStr("sorlfos_lite"));
				getContainer().getGoqrpls().gCheckFailure();
				clearBlock(TaskServices.NO_VALIDATE);
				getContainer().getGoqrpls().gCheckFailure();
				goBlock(toStr("sorlcur_lite"));
				clearRecord();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sorlcurElement.getSovlcurRowid().isNull() )
				{
					getFormModel().getSCurriculaLite().setLcurRecCnt(getFormModel().getSCurriculaLite().getLcurRecCnt().add(1));
					executeAction("new_sorlcur");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-CLRFRM
		 DECLARE
    alert_button number;
    alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
    save_return varchar2(30) := null; 
      
BEGIN    
	:GLOBAL.VALUE := 'KEY-CLRFRM';
 save_return := :return_from_sorlcur; 
--
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   
   IF get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR  
   	 get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN 
        alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	      if alert_button = ALERT_BUTTON1 then
	          execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
            g$_check_failure;

            if not form_success then
              	message( G$_NLS.Get('SOQOLIB-0345', 'FORM','There were errors and your changes could not be saved.') );  
              	raise form_trigger_failure;
            end if; 
            do_key('commit_form');
            g$_check_failure;
	      Else 
	      	 CLEAR_FORM(no_validate) ;
           G$_CHECK_FAILURE ;
	      end if;
    ELSE  	 
      CLEAR_FORM(NO_VALIDATE) ;
      G$_CHECK_FAILURE ;
    END IF;
   :GLOBAL.VALUE := 'KEY-CLRFRM';       
   execute_trigger('enable_curriculum'); 
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   execute_trigger('enable_curriculum'); 
   g$_check_failure;	
   EXECUTE_TRIGGER('DISABLE_TABS');
   G$_CHECK_FAILURE ;

    
END; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void sorlcurLite_ClearTask()
		{
			
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString saveReturn = NString.getNull();
					setGlobal("VALUE", toStr("KEY-CLRFRM"));
					saveReturn = getFormModel().getSCurricula().getReturnFromSorlcur();
					// 
					executeAction("SAVE_KEYS");
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("ENABLE_KEYS");
					getContainer().getGoqrpls().gCheckFailure();
					if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
							try {
								getContainer().getGoqrpls().gCheckFailure();
							} catch (Exception e) {
								errorMessage(GNls.Fget(toStr("SOQOLIB-0345"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
								throw new ApplicationException();
							}
							executeAction("SAVE");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							clearTask(TaskServices.NO_VALIDATE);
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
					else {
						clearTask(TaskServices.NO_VALIDATE);
						getContainer().getGoqrpls().gCheckFailure();
					}
					setGlobal("VALUE", toStr("KEY-CLRFRM"));
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("LOAD_FORM_HEADER");
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("GLOBAL_COPY");
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("DISABLE_TABS");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-COMMIT
		 :dup_create_ind := 'N'; 
:default_options_ind := 'N';

-- force all validation to occur at the field level 
next_item;
previous_item;
validate(record_scope);
g$_check_failure;

-- test the commit for nulls and other errors 
execute_trigger('CHECK_FOR_LCUR_NULLS');
g$_check_failure; 
 -- test base curriculum 
execute_trigger('VALIDATE_BASE_CURRICULUM_RULES');
g$_check_failure;

-- test the lfos curriculum 
execute_trigger('VALIDATE_LFOS_CURRICULUM_RULES');
g$_check_failure;

execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
g$_check_failure;


if not form_success then
	message( G$_NLS.Get('SOQOLIB-0346', 'FORM','There were errors and your changes could not be saved.') );  
	raise form_trigger_failure;
end if;  
commit_form;
g$_check_failure;

execute_trigger('enable_curriculum'); 
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
		 * SORLCUR_LITE.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sorlcurLite_Save()
		{
			
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				getFormModel().getSCurricula().setDefaultOptionsInd(toStr("N"));
				//  force all validation to occur at the field level 
				nextItem();
				previousItem();
				validateTask(SupportClasses.Constants.RECORD_SCOPE);
				getContainer().getGoqrpls().gCheckFailure();
				//  test the commit for nulls and other errors 
				executeAction("CHECK_FOR_LCUR_NULLS");
				getContainer().getGoqrpls().gCheckFailure();
				//  test base curriculum 
				executeAction("VALIDATE_BASE_CURRICULUM_RULES");
				getContainer().getGoqrpls().gCheckFailure();
				//  test the lfos curriculum 
				executeAction("VALIDATE_LFOS_CURRICULUM_RULES");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
				try {
					getContainer().getGoqrpls().gCheckFailure();
				} catch (Exception e) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0346"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
					throw new ApplicationException();
				}
				commitTask();
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("enable_curriculum");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("lcur_record_cnt");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("curriculum_commplan_check");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-CREREC
		 
execute_trigger('query_only');
g$_check_failure;
if -- :sovlcur_rowid is not null and   
	( get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0347', 'FORM','Commit curriculum data changes before inserting new curriculum.') );
	raise form_trigger_failure;
end if; 

if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;
next_block;
clear_block;
previous_block;
create_record;
:dup_create_ind := 'Y'; 
:s$_curricula_lite.lcur_rec_cnt := :s$_curricula_lite.lcur_rec_cnt + 1; 
execute_trigger('NEW_SORLCUR');
G$_CHECK_FAILURE; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sorlcurLite_CreateRecord()
		{
			
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ((getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0347"), toStr("FORM"), toStr("Commit curriculum data changes before inserting new curriculum.")));
					throw new ApplicationException();
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						throw new ApplicationException();
					}
				}
				nextBlock();
				clearBlock();
				previousBlock();
				createRecord();
				getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
				getFormModel().getSCurriculaLite().setLcurRecCnt(getFormModel().getSCurriculaLite().getLcurRecCnt().add(1));
				executeAction("NEW_SORLCUR");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-DELREC
		 execute_trigger('query_only');
g$_check_failure;
if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;
if :sorlcur_lmod_code = sb_curriculum_str.f_learner then  
 	message( G$_NLS.Get('SOQOLIB-0348', 'FORM','Delete is not allowed for learner curriculum. ') );
	raise form_trigger_failure;
end if; 
 
soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm,
   p_seqno =>   nvl(:sorlcur_seqno,999));
soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
   p_lcur_seqno =>   nvl(:sorlcur_seqno,999));
  
 
if :system.last_record = 'TRUE' and 
	:system.cursor_record = 1 then 
  :sorlcur_del_ind := 'Y'; -- set flag so new record inst doesnt try to query non exit row
else
	:s$_curricula_lite.lcur_rec_cnt := :s$_curricula_lite.lcur_rec_cnt - 1; 
	if 	:s$_curricula_lite.lcur_rec_cnt <= 0 then 
		:s$_curricula_lite.lcur_rec_cnt := 1;
	end if;
	:sorlcur_del_ind := 'N';
end if; 
if :sovlcur_rowid is not null then
	 :commplan_delete_trigger := 'Y'; 
end if; 
  
:dup_create_ind := 'N'; 
:delete_inprogress := 'Y';
go_block('sorlfos_lite');
g$_check_failure;
clear_block(no_validate);
g$_check_failure;
go_block('sorlcur_lite');
g$_check_failure;
DELETE_RECORD;
g$_check_failure;
:lfos_rec_num := 0;
:delete_inprogress := 'N';
:commplan_delete_trigger := 'Y'; 
 

IF :sovlcur_rowid IS NULL and :system.cursor_record = 1 THEN
	execute_trigger('NEW_SORLCUR');
  G$_CHECK_FAILURE; 
END IF; 




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sorlcurLite_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						throw new ApplicationException();
					}
				}
				if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0348"), toStr("FORM"), toStr("Delete is not allowed for learner curriculum. ")));
					throw new ApplicationException();
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
				if ( isInLastRecord() && getCursorRecord().equals(1) )
				{
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("Y"));
				}
				else {
					getFormModel().getSCurriculaLite().setLcurRecCnt(getFormModel().getSCurriculaLite().getLcurRecCnt().subtract(1));
					if ( getFormModel().getSCurriculaLite().getLcurRecCnt().lesserOrEquals(0) )
					{
						getFormModel().getSCurriculaLite().setLcurRecCnt(toInt(1));
					}
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
				}
				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				getFormModel().getSCurricula().setDeleteInprogress(toStr("Y"));
				goBlock(toStr("sorlfos_lite"));
				getContainer().getGoqrpls().gCheckFailure();
				clearBlock(TaskServices.NO_VALIDATE);
				getContainer().getGoqrpls().gCheckFailure();
				goBlock(toStr("sorlcur_lite"));
				getContainer().getGoqrpls().gCheckFailure();
				deleteRecord();
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
				getFormModel().getSCurricula().setDeleteInprogress(toStr("N"));
				getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				if ( sorlcurElement.getSovlcurRowid().isNull() && getCursorRecord().equals(1) )
				{
					executeAction("NEW_SORLCUR");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-DUPREC
		  execute_trigger('query_only');
g$_check_failure;
if nvl(:dup_create_ind,'N') <>  'Y' then 
 	message( G$_NLS.Get('SOQOLIB-0349', 'FORM','Insert record to duplicate record into.') );
	raise form_trigger_failure;
end if; 

declare 
	save_lcur  sorlcur.sorlcur_seqno%TYPE := null;
	loop_cnt    number := 1; 
	count_lfos  number := 0; 
	CURSOR sorlfos_cnt_c IS
	  select nvl(count(*),0)
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and sovlfos_current_ind = 'Y'
	  and sovlfos_active_ind = 'Y';
	  
	CURSOR sorlfos_c IS
	  select sovlfos_lfst_code, sovlfos_majr_code,
	     sovlfos_term_code,  sovlfos_priority_no,
	     sovlfos_conc_attach_rule,  sovlfos_lfos_rule,
	     sovlfos_cact_code , sovlfos_dept_code, sovlfos_majr_code_attach ,
	     sovlfos_csts_code
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and sovlfos_current_ind = 'Y'
	  and sovlfos_active_ind = 'Y'
	  order by decode(sovlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', 
	     sb_fieldofstudy_str.f_minor, '3',
	     sb_fieldofstudy_str.f_concentration, '3', 4),
	     sovlfos_priority_no;
	     
	
begin 
 
duplicate_record;
:dup_create_ind := 'N'; 
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 

save_lcur := :sorlcur_lite.sorlcur_seqno;
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
:sorlcur_lite.sorlcur_rolled_seqno := null;
:sorlcur_lite.sovlcur_current_ind := null;
---:sorlcur_lite.sorlcur_cact_code := null; 
:sorlcur_duplicate_ind := 'Y';
:sovlcur_rowid := NULL; 
:sorlcur_term_code := :s$_curricula.module_term_code;
 
:system.message_level := '5'; 
next_block;
clear_block;
--- count number of sorlfos there are to copy 
OPEN sorlfos_cnt_c;
fetch sorlfos_cnt_c into count_lfos;
close sorlfos_cnt_c;

if count_lfos > 0 then 
	

OPEN sorlfos_c;
LOOP
	
	if loop_cnt <> 1 and loop_cnt <= count_lfos then
		next_record;
	end if;
	loop_cnt := loop_cnt + 1; 
	fetch sorlfos_c into 
       :sorlfos_lite.sorlfos_lfst_code, :sorlfos_lite.sorlfos_majr_code,
	     :sorlfos_lite.sorlfos_term_code,  :sorlfos_lite.sorlfos_priority_no,
	     :sorlfos_lite.sorlfos_conc_attach_rule,  :sorlfos_lite.sorlfos_lfos_rule,
	     :sorlfos_lite.sorlfos_cact_code, :sorlfos_dept_code, :sorlfos_majr_code_attach,
	     :sorlfos_lite.sorlfos_csts_code ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code;
  :sovlfos_rowid := null;
  :sorlfos_current_ind := null;

--	:sorlfos_lite.sorlfos_cact_code := null;
--	:sorlfos_lite.sorlfos_csts_code := null;  
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 
go_block('sorlcur_lite');
:system.message_level := '0'; 
:sorlcur_duplicate_ind := 'N'; 
end; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sorlcurLite_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( isNull(getFormModel().getSCurricula().getDupCreateInd(), "N").notEquals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0349"), toStr("FORM"), toStr("Insert record to duplicate record into.")));
					throw new ApplicationException();
				}
				{
					NNumber saveLcur = NNumber.getNull();
					NNumber loopCnt = toNumber(1);
					NNumber countLfos = toNumber(0);
					String sqlsorlfosCntC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND sovlfos_current_ind = 'Y' AND sovlfos_active_ind = 'Y' ";
					DataCursor sorlfosCntC = new DataCursor(sqlsorlfosCntC);
					String sqlsorlfosC = "SELECT sovlfos_lfst_code, sovlfos_majr_code, sovlfos_term_code, sovlfos_priority_no, sovlfos_conc_attach_rule, sovlfos_lfos_rule, sovlfos_cact_code, sovlfos_dept_code, sovlfos_majr_code_attach, sovlfos_csts_code " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND sovlfos_current_ind = 'Y' AND sovlfos_active_ind = 'Y' " +
	" ORDER BY decode(sovlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sovlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					try {
						duplicateRecord();
						getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						saveLcur = sorlcurLiteElement.getSorlcurSeqno();
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
						sorlcurLiteElement.setSorlcurRolledSeqno(toNumber(null));
						sorlcurLiteElement.setSovlcurCurrentInd(toStr(null));
						// -:sorlcur_lite.sorlcur_cact_code := null; 
						sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
						sorlcurElement.setSovlcurRowid(toStr(null));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						// - count number of sorlfos there are to copy 
						//Setting query parameters
						sorlfosCntC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						sorlfosCntC.addParameter("P_SAVE_LCUR", saveLcur);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosCntC.
						sorlfosCntC.open();
						ResultSet sorlfosCntCResults = sorlfosCntC.fetchInto();
						if ( sorlfosCntCResults != null ) {
							countLfos = sorlfosCntCResults.getNumber(0);
						}
						sorlfosCntC.close();
						if ( countLfos.greater(0) )
						{
							//Setting query parameters
							sorlfosC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							sorlfosC.addParameter("P_SAVE_LCUR", saveLcur);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosC.
							sorlfosC.open();
							while (true) {
								if ( loopCnt.notEquals(1) && loopCnt.lesserOrEquals(countLfos) )
								{
									nextRecord();
								}
								loopCnt = loopCnt.add(1);
								ResultSet sorlfosCResults = sorlfosC.fetchInto();
								if ( sorlfosCResults != null ) {
									sorlfosLiteElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
									sorlfosLiteElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
									sorlfosLiteElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
									sorlfosLiteElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
									sorlfosLiteElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
									sorlfosLiteElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
									sorlfosLiteElement.setSorlfosCactCode(sorlfosCResults.getStr(6));
									sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(7));
									sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(8));
									sorlfosLiteElement.setSorlfosCstsCode(sorlfosCResults.getStr(9));
								}
								if ( sorlfosC.notFound() ) 
									break;
								sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
								sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
								sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
								sorlfosElement.setSovlfosRowid(toStr(null));
								sorlfosElement.setSorlfosCurrentInd(toStr(null));
							}
							sorlfosC.close();
							firstRecord();
						}
						goBlock(toStr("sorlcur_lite"));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
					} finally{
						sorlfosCntC.close();
						sorlfosC.close();
					}
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-ENTQRY
		 if  :sovlcur_rowid is not null and   
	( get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0350', 'FORM','Commit or rollback curriculum data changes before entering query.') );
	raise form_trigger_failure;
end if; 

:lcur_rec_cnt := 0;
:lcur_rec_num := 0;
go_block('SORLFOS_LITE');
clear_block;
go_block('SORLCUR_LITE'); 
enter_query;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sorlcurLite_Search()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && (getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED")) )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0350"), toStr("FORM"), toStr("Commit or rollback curriculum data changes before entering query.")));
					throw new ApplicationException();
				}
				getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(0));
				getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(0));
				goBlock(toStr("SORLFOS_LITE"));
				clearBlock();
				goBlock(toStr("SORLCUR_LITE"));
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-EXEQRY
		   
 execute_query;
  go_block('sorlfos_lite');
  execute_query;
  go_block('sorlcur_lite');
  last_record;
  :lcur_rec_cnt := :system.cursor_record;
  first_record;
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sorlcurLite_ExecuteQuery()
		{
			
				executeQuery();
				goBlock(toStr("sorlfos_lite"));
				executeQuery();
				goBlock(toStr("sorlcur_lite"));
				lastRecord();
				getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(getCursorRecord()));
				firstRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-EXIT
		 DECLARE
    alert_button number;
    alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
      
BEGIN    
 
--
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
  
   
   IF get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR  
   	 get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN 
        alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	      if alert_button = ALERT_BUTTON1 then
	       	  execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
            g$_check_failure;

            if not form_success then
              	message( G$_NLS.Get('SOQOLIB-0351', 'FORM','There were errors and your changes could not be saved.') );  
              	raise form_trigger_failure;
            end if; 
            do_key('commit_form');
            g$_check_failure;
        Else 
           execute_trigger('enable_curriculum'); 
           G$_CHECK_FAILURE ;
           EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
           G$_CHECK_FAILURE ;
   	       CLEAR_FORM(no_validate) ;
           G$_CHECK_FAILURE ;
           EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
           G$_CHECK_FAILURE ;
           EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
           G$_CHECK_FAILURE ;
	      end if;
    
   END IF; 
  	execute_trigger('enable_curriculum'); 
   g$_check_failure;	

   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    
END; 


 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sorlcurLite_Exit()
		{
			
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					// 
					executeAction("SAVE_KEYS");
					getContainer().getGoqrpls().gCheckFailure();
					if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
							try {
								getContainer().getGoqrpls().gCheckFailure();
							} catch (Exception e) {
								errorMessage(GNls.Fget(toStr("SOQOLIB-0351"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
								throw new ApplicationException();
							}
							executeAction("SAVE");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							executeAction("enable_curriculum");
							getContainer().getGoqrpls().gCheckFailure();
							executeAction("SAVE_KEYS");
							getContainer().getGoqrpls().gCheckFailure();
							clearTask(TaskServices.NO_VALIDATE);
							getContainer().getGoqrpls().gCheckFailure();
							executeAction("LOAD_FORM_HEADER");
							getContainer().getGoqrpls().gCheckFailure();
							executeAction("GLOBAL_COPY");
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-EDIT
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
		 * SORLCUR_LITE.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sorlcurLite_KeyEdit()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOACURR"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-NXTBLK
		 if :sorlcur_del_ind = 'Y' then 
	return;
end if; 
if :sorlcur_lite.rowid is null then 
	IF :sorlcur_priority_no  IS NULL THEN
	  go_item('sorlcur_priority_no');
  	message( G$_NLS.Get('SOQOLIB-0352', 'FORM','*Error* Enter required priority number before navigating to fields of study.') ); 
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;

	next_block;
  
--	if :s$_curricula.default_major is null then 
--  	:sorlfos_cact_code := :s$_curricula.default_cact;
--    :sorlfos_term_code := :sorlcur_term_code;
--    :sorlfos_csts_code := :s$_curricula.default_csts; 
--  end if; 

else 
	next_block; 
	if get_block_property('SORLFOS_LITE',STATUS) <> 'CHANGED' THEN
  	:system.message_level := '5';
  	execute_query;
    :system.message_level := '0';
  end if; 

end if;
  
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sorlcurLite_NextBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


				if ( getFormModel().getSCurricula().getSorlcurDelInd().equals("Y") )
				{
					return ;
				}
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( sorlcurLiteElement.getRowState().equals(DataRowStatus.INSERTED))
				{
					if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
					{
						goItem(toStr("sorlcur_priority_no"));
						errorMessage(GNls.Fget(toStr("SOQOLIB-0352"), toStr("FORM"), toStr("*ERROR* Enter required priority number before navigating to fields of study.")));
						throw new ApplicationException();
					}
					nextBlock();
				}
				else {
					nextBlock();
					if (!getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						executeQuery();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-PRVBLK
		 
if  get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN
			message( G$_NLS.Get('SOQOLIB-0353', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
end if; 
execute_trigger('enable_curriculum'); 
g$_check_failure;
go_item(:return_from_sorlcur); 

g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sorlcurLite_PreviousBlock()
		{
			
				if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0353"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
					throw new ApplicationException();
				}
				executeAction("enable_curriculum");
				getContainer().getGoqrpls().gCheckFailure();
				goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-NXTREC
		 
  	-- stop then if outstanding changes 
	if  get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN
			message( G$_NLS.Get('SOQOLIB-0354', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
	end if; 
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 
	IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
		if :sovlcur_rowid is not null then  
			:system.message_level := '5';
	      go_block('sorlfos_lite');
		    g$_check_failure;
			  clear_block;
 		    g$_check_failure;
			  execute_query;
 		    g$_check_failure;
			  go_block('sorlcur_lite');
 		    g$_check_failure;
		 	:system.message_level := '0';
	  end if;  
		ELSE 
			 execute_trigger('query_only');
       g$_check_failure;
	     if :s$_curricula.module_insert_restriction is not null then 
	         message(:s$_curricula.module_insert_restriction);

	      else 
	        if :s$_curricula.module_insert_warning is not null then 
          	message(:s$_curricula.module_insert_warning);
	        end if;
			    next_record; 

			    :system.message_level := '5';
	        go_block('sorlfos_lite');
		  	  g$_check_failure;
			    clear_block;
 		  	  g$_check_failure;
  	      go_block('sorlcur_lite');
 	  	    g$_check_failure;
		 	    :system.message_level := '0';
		 	    :dup_create_ind := 'Y'; 
          :s$_curricula_lite.lcur_rec_cnt := :s$_curricula_lite.lcur_rec_cnt + 1; 
          execute_trigger('NEW_SORLCUR');
          G$_CHECK_FAILURE;
        end if;

  END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sorlcurLite_NextRecord()
		{
			
				//  stop then if outstanding changes 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				//  stop then if outstanding changes 
				if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0354"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
					throw new ApplicationException();
				}
				//  ** If we're not at the bottom, then go to the last record 
				if ( !isInLastRecord() )
				{
					nextRecord();
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("sorlfos_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						goBlock(toStr("sorlcur_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
				else {
					executeAction("query_only");
					getContainer().getGoqrpls().gCheckFailure();
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
					}
					else {
						if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
						{
							warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
						}
						nextRecord();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("sorlfos_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						goBlock(toStr("sorlcur_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
						getFormModel().getSCurriculaLite().setLcurRecCnt(getFormModel().getSCurriculaLite().getLcurRecCnt().add(1));
						executeAction("NEW_SORLCUR");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-PRVREC
		 	     IF :SYSTEM.LAST_RECORD = 'TRUE'  AND
          :sovlcur_rowid is null and 
          :sorlcur_priority_no is null and 
          :sorlcur_levl_code  is null and 
          :sorlcur_coll_code  is null and 
          :sorlcur_degc_code  is null and 
			  	:system.record_status <> 'CHANGED' then 
			  	delete_record;
			  	:s$_curricula_lite.lcur_rec_cnt := :s$_curricula_lite.lcur_rec_cnt - 1; 
			  	if :sovlcur_rowid is not null then 
		      	 :system.message_level := '5';  
		  	     go_block('sorlfos_lite');
		  	     g$_check_failure;
			       clear_block;
 		  	     g$_check_failure;
			       execute_query;
 		  	     g$_check_failure;
			       go_block('sorlcur_lite');
 		  	     g$_check_failure;
			     	 :system.message_level := '0'; 
		     	end if;
	     else 
	       if  get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR 
			    	get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN
			  	  message( G$_NLS.Get('SOQOLIB-0355', 'FORM','Commit changes for this curriculum.') );
			  	  raise form_trigger_failure;
		     end if;

	  	  	previous_Record;
	  	  	g$_check_failure;
		     	if :sovlcur_rowid is not null then 
		      	 :system.message_level := '5';  
		  	     go_block('sorlfos_lite');
		  	     g$_check_failure;
			       clear_block;
 		  	     g$_check_failure;
			       execute_query;
 		  	     g$_check_failure;
			       go_block('sorlcur_lite');
 		  	     g$_check_failure;
			     	 :system.message_level := '0'; 
		     	end if;
		    end if; 
	       
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sorlcurLite_PreviousRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( isInLastRecord() && sorlcurElement.getSovlcurRowid().isNull() && sorlcurElement.getSorlcurPriorityNo().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurDegcCode().isNull() && !getRecordStatus().equals("CHANGED") )
				{
					deleteRecord();
					getFormModel().getSCurriculaLite().setLcurRecCnt(getFormModel().getSCurriculaLite().getLcurRecCnt().subtract(1));
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("sorlfos_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						goBlock(toStr("sorlcur_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
				else {
					if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0355"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
						throw new ApplicationException();
					}
					previousRecord();
					getContainer().getGoqrpls().gCheckFailure();
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("sorlfos_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						clearBlock();
						getContainer().getGoqrpls().gCheckFailure();
						executeQuery();
						getContainer().getGoqrpls().gCheckFailure();
						goBlock(toStr("sorlcur_lite"));
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-SCRUP
		 do_key('PREVIOUS_RECORD');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void sorlcurLite_KeyScrup()
		{
			
				executeAction("PREVIOUS_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.KEY-SCRDOWN
		 do_key('NEXT_RECORD');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void sorlcurLite_KeyScrdown()
		{
			
				executeAction("NEXT_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.PRE-INSERT
		 if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;

if :sorlcur_cact_code is null then
  :sorlcur_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlcur_term_code is null then 
  :sorlcur_term_code := :s$_curricula.module_term_code;
end if; 
--if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlcur_cact_code) = 'N' then
--	 :commplan_delete_trigger := 'I';
--end if; 
 --F2J_TODO: Change global current_user01 to current_user
:sorlcur_user_id := :global.current_user01; 
  

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sorlcurLite_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						throw new ApplicationException();
					}
				}
				if ( sorlcurElement.getSorlcurCactCode().isNull() )
				{
					sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
				}
				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
				}
				// if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlcur_cact_code) = 'N' then
				// 	 :commplan_delete_trigger := 'I';
				// end if; 
				// F2J_TODO: Change global current_user01 to current_user
				sorlcurElement.setSorlcurUserId(getGlobal("CURRENT_USER01"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.PRE-DELETE
		 --
-- Begin default relation program section
--
BEGIN
  --
  -- Begin SORLFOS detail program section
  --
   DELETE FROM sovlfos s
   WHERE s.SOVLFOS_PIDM = :SORLCUR_LITE.SORLCUR_PIDM and s.SOVLFOS_LCUR_SEQNO = :SORLCUR_LITE.SORLCUR_SEQNO;
  --
  -- End SORLFOS detail program section
  --
END;
--
-- End default relation program section
--


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void sorlcurLite_BeforeRowDelete(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation program section
				// 
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)args.getRow();


				int rowCount = 0;
				// 
				//  Begin SORLFOS detail program section
				// 
				String sql1 = "DELETE FROM sovlfos s" +
	" WHERE s.SOVLFOS_PIDM = :SORLCUR_LITE_SORLCUR_PIDM AND s.SOVLFOS_LCUR_SEQNO = :SORLCUR_LITE_SORLCUR_SEQNO";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("SORLCUR_LITE_SORLCUR_PIDM", sorlcurLiteElement.getSorlcurPidm());
				command1.addParameter("SORLCUR_LITE_SORLCUR_SEQNO", sorlcurLiteElement.getSorlcurSeqno());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.PRE-BLOCK
		  set_item_property('NEXT_REC_BTN',ENABLED, property_true); 
 set_item_property('PREV_RECORD_BTN',ENABLED, property_true); 
 

 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void sorlcurLite_blockIn()
		{
			
				setItemEnabled("NEXT_REC_BTN", true);
				setItemEnabled("PREV_RECORD_BTN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.ONLOCK
		 BEGIN
  SB_CURRICULUM.P_LOCK(
     p_PIDM                   =>:SORLCUR_PIDM,
     p_SEQNO                  =>:SORLCUR_SEQNO,
     p_ROWID_INOUT            =>:sorlcur_lite.ROWID);
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
		 * SORLCUR_LITE.ONLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ONLOCK")
		public void sorlcurLite_Onlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);

				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_rowid_inout_ref = new Ref<NString>();
					SbCurriculum.pLock(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), p_rowid_inout_ref);
					sorlcurLiteElement.setROWID(p_rowid_inout_ref.val);
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.ON-INSERT
		 
-- ON-INSERT Trigger
--
DECLARE
  alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
   cem_msg varchar2(2000) := ''; 
   curr_rec  sorlcur%rowtype;
   lv_rowid  varchar2(18); 
   lv_learner_seqno  sorlcur.sorlcur_key_seqno%type := null; 
BEGIN
	if :sorlcur_degc_code is null and :sorlcur_coll_code is null and 
		:sorlcur_camp_code is null and :sorlcur_levl_code is null and 
		:sorlcur_program is null and :sorlcur_priority_no is null   
		 then 
		   return;
	end if; 
	if :sorlcur_program = '************' then 
   	 :sorlcur_program := '';
	end if;
	if :s$_curricula.default_admt is not null and 
		( :sorlcur_admt_code is null OR 
		:s$_curricula.default_admt <> :sorlcur_admt_code ) then 
		   :sorlcur_admt_code := :s$_curricula.default_admt;
	end if;  
	--- create study path for each new lcur global.study_path
 	if :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
	    :global.study_path = 'Y' then 

		if  nvl(:sorlcur_key_seqno,99)  = 99  then  		
	     if  sokcurr.F_StudyPath 
                (p_camp_code         =>  :sorlcur_camp_code, 
                 p_coll_code         =>  :sorlcur_coll_code, 
                 p_degc_code     =>  :sorlcur_degc_code,  
                 p_levl_code          =>  :sorlcur_levl_code, 
                 p_program     =>  :sorlcur_program ,
                 p_curr_rule  => :sorlcur_curr_rule) = 'Y' then 
             
         sb_studypath.p_create
                 (p_pidm                     => :SORLCUR_PIDM,
                  p_term_code_eff          => :SORLCUR_TERM_CODE,
                  p_key_seqno                => lv_learner_seqno,
                  p_stsp_code                => 'AS' ,
                  p_data_origin              => :GLOBAL.DATA_ORIGIN,
                  p_user_id                   =>  :sorlcur_user_id,                  
                  p_resd_code => :s$_curricula_lite.sorlcur_lite_resd_code , 
                  p_egol_code => :s$_curricula_lite.sorlcur_lite_egol_code ,
                  p_edlv_code =>  :s$_curricula_lite.sorlcur_lite_edlv_code ,
                  p_full_part_ind => :s$_curricula_lite.sorlcur_lite_full_part_ind ,
                  p_rowid_out             =>  lv_rowid ) ;
          
         :sorlcur_key_seqno := lv_learner_seqno; 
	     end if; 
 	else 
	  	 soklcur.p_copy_studypath 
         (  p_pidm        => :sorlcur_pidm ,
         p_term_code_old   => :SORLCUR_TERM_CODE,
         p_term_code_new   => :sorlcur_term_code,
         p_keyseqno    => :sorlcur_key_seqno) ; 
   end if; 
		 
	end if; 
  SB_curriculum.P_CREATE(
     p_PIDM                   =>:SORLCUR_PIDM,
     p_SEQNO                  => '',
     p_LMOD_CODE              =>:SORLCUR_LMOD_CODE,
     p_TERM_CODE              =>:SORLCUR_TERM_CODE,
     p_KEY_SEQNO              => nvl(:SORLCUR_KEY_SEQNO,:s$_curricula.MODULE_KEY_SEQNO), 
     p_PRIORITY_NO            =>:SORLCUR_PRIORITY_NO,
     p_ROLL_IND               =>:SORLCUR_ROLL_IND,
     p_CACT_CODE              =>:SORLCUR_CACT_CODE,
     p_USER_ID                => :sorlcur_user_id,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_LEVL_CODE              =>:SORLCUR_LEVL_CODE,
     p_COLL_CODE              =>:SORLCUR_COLL_CODE,
     p_DEGC_CODE              =>:SORLCUR_DEGC_CODE,
     p_TERM_CODE_CTLG         =>:SORLCUR_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLCUR_TERM_CODE_END,
     p_TERM_CODE_MATRIC       =>:SORLCUR_TERM_CODE_MATRIC,
     p_TERM_CODE_ADMIT        =>:SORLCUR_TERM_CODE_ADMIT,
     p_ADMT_CODE              =>:SORLCUR_ADMT_CODE,
     p_CAMP_CODE              =>:SORLCUR_CAMP_CODE,
     p_PROGRAM                =>:SORLCUR_PROGRAM,
     p_START_DATE             =>:SORLCUR_START_DATE,
     p_END_DATE               =>:SORLCUR_END_DATE,
     p_rate_code               => :s$_curricula_lite.sorlcur_lite_rate_code,
     p_styp_code               => :s$_curricula_lite.sorlcur_lite_styp_code,
     p_CURR_RULE              =>:SORLCUR_CURR_RULE,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              =>:SORLCUR_LITE.ROWID,
     p_seqno_out              => :sorlcur_seqno, 
     p_curr_error_out         => :curr_error,
     p_override_severity      => 'F',
     p_severity_out           => :severity_out,
     p_USER_ID_UPDATE         => :sorlcur_user_id,
     p_gapp_seqno             => null);
     
     -- new learner status columns are only inserted on maintenance curriculum tab, not 
     -- during quick admit
 	  select * into curr_rec 
	  from sorlcur where sorlcur_pidm = :sorlcur_pidm
	    and sorlcur_seqno = :sorlcur_seqno;
	  if sql%notfound then 
   	  null;
    end if;
	  :sorlcur_activity_date := curr_rec.sorlcur_activity_date;
	  :sorlcur_roll_ind := curr_rec.sorlcur_roll_ind;
	  if :sorlcur_curr_rule <> curr_rec.sorlcur_curr_rule 
	  	then :sorlcur_curr_rule := curr_rec.sorlcur_curr_rule;
	  end if;
	  
	  select sovlcur_current_ind into :sovlcur_current_ind
	  from sovlcur
	  where sovlcur_rowid = :sorlcur_lite.rowid;
	  
<multilinecomment>	  	message('pidm ' || :sorlcur_pidm || ' ' || curr_rec.sorlcur_pidm || 
	' seqno ' || :sorlcur_seqno || ' ' || curr_rec.sorlcur_seqno || 
	' prior ' || :sorlcur_priority_no || ' ' || curr_rec.sorlcur_priority_no || 
	' adate ' || to_char(:sorlcur_activity_date,'DDMMYYYY HH24MISS') 
	   || ' lcur date ' || to_char(curr_rec.sorlcur_activity_date,'DDMMYYYY HH24MISS')
	  || ' user ' || :sorlcur_user_id || ' lcur ' || curr_rec.sorlcur_user_id
	  || ' curr rule ' || :sorlcur_curr_rule || ' db ' || curr_rec.sorlcur_curr_rule );
message( ' lmod ' || 	:SORLCUR_LMOD_CODE                         	|| ' ' || 	curr_rec.sorLCUR_LMOD_CODE                         
|| ' term ' || 	 :SORLCUR_TERM_CODE        	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE                                             
|| ' key ' || 	 :SORLCUR_KEY_SEQNO          	|| ' ' || 	 curr_rec.sorLCUR_KEY_SEQNO                                             
|| ' prior ' || 	 :SORLCUR_PRIORITY_NO             	|| ' ' || 	 curr_rec.sorLCUR_PRIORITY_NO                                           
|| ' roll ' ||	 :SORLCUR_ROLL_IND                    	|| ' ' || 	 curr_rec.sorLCUR_ROLL_IND                                              
|| ' cact ' || 	 :SORLCUR_CACT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_CACT_CODE                                             
|| ' user ' ||	 :SORLCUR_USER_ID                        	|| ' ' || 	 curr_rec.sorLCUR_USER_ID                                               
|| ' lvl ' ||	:SORLCUR_LEVL_CODE                	|| ' ' || 	curr_rec.sorLCUR_LEVL_CODE                                             
|| ' col ' ||	 :SORLCUR_COLL_CODE        	|| ' ' || 	 curr_rec.sorLCUR_COLL_CODE                                             
|| ' degc '  ||	 :SORLCUR_DEGC_CODE             	|| ' ' || 	 curr_rec.sorLCUR_DEGC_CODE                                             
|| ' ctlg ' || 	 :SORLCUR_TERM_CODE_CTLG                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_CTLG                                                 
|| ' end ' || 	 :SORLCUR_TERM_CODE_END            	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_END                                                  
|| ' matr ' || 	 :SORLCUR_TERM_CODE_MATRIC                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_MATRIC                                               
|| ' admt ' || 	 :SORLCUR_TERM_CODE_ADMIT                  	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_ADMIT                                                
|| ' admt ' || 	 :SORLCUR_ADMT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_ADMT_CODE                                                      
|| ' camp ' ||	 :SORLCUR_CAMP_CODE                           	|| ' ' || 	 curr_rec.sorLCUR_CAMP_CODE                                                      
|| ' pgm ' || 	 :SORLCUR_PROGRAM                       	|| ' ' || 	 curr_rec.sorLCUR_PROGRAM                                                        
|| ' str ' || 	 :SORLCUR_START_DATE            	|| ' ' || 	 curr_rec.sorLCUR_START_DATE                                                     
|| ' end ' || 	 :SORLCUR_END_DATE                   	|| ' ' || 	 curr_rec.sorLCUR_END_DATE                                                       
|| ' curr ' || 	 :SORLCUR_CURR_RULE                      	|| ' ' || 	 curr_rec.sorLCUR_CURR_RULE                                                      
|| ' roll ' ||	 :SORLCUR_ROLLED_SEQNO || ' ' || curr_rec.sorlcur_rolled_seqno);
 </multilinecomment>
 
   -- show curriculum warning only once
    :sovlcur_rowid := :sorlcur_lite.rowid;
    if :lcur_sobctrl_curr_rule_ind = 'Y' and :lcur_temp_rule_ind = 'Y' and 
    ( :curr_error is not null and :curr_error > 0 )
   	 and (:curric_warning = 0 or :curric_warning is null) 
   	    and  ( :severity_out in ('W', 'F') ) then 
	   cem_msg := substr(sokcmsg.F_SorlcurErrorMsg(:severity_out, 'V',
	   	                          :curr_error),1,75);
	   Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	   alert_button := show_alert('CURRICULUM_ERROR');
 	   	 
	   if alert_button = ALERT_BUTTON1 then
	       null;
	   end if;
	   if :severity_out = 'F' then 
	   	 raise form_trigger_failure;
	   else 
	   	 :curric_warning := :curr_error;
	   end if;
   end if;  
 
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
		 * SORLCUR_LITE.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sorlcurLite_RowInsert(RowAdapterEvent args)
		{
			
				//  ON-INSERT Trigger
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString cemMsg = toStr("");
					SorlcurRow currRec= null;
					NString lvRowid= NString.getNull();
					NNumber lvLearnerSeqno = NNumber.getNull();
					try
					{
						if ( sorlcurElement.getSorlcurDegcCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurCampCode().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurProgram().isNull() && sorlcurElement.getSorlcurPriorityNo().isNull() )
						{
							return ;
						}
						if ( sorlcurElement.getSorlcurProgram().equals("************") )
						{
							sorlcurElement.setSorlcurProgram(toStr(""));
						}
						if ( !getFormModel().getSCurricula().getDefaultAdmt().isNull() && (sorlcurElement.getSorlcurAdmtCode().isNull() || getFormModel().getSCurricula().getDefaultAdmt().notEquals(sorlcurElement.getSorlcurAdmtCode())) )
						{
							sorlcurElement.setSorlcurAdmtCode(getFormModel().getSCurricula().getDefaultAdmt());
						}
						// - create study path for each new lcur global.study_path
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && getGlobal("STUDY_PATH").equals("Y") )
						{
							if ( isNull(sorlcurElement.getSorlcurKeySeqno(), 99).equals(99) )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								if ( Sokcurr.fStudypath(/*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule()).equals("Y") )
								{
									// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
									Ref<NNumber> p_key_seqno_ref = new Ref<NNumber>(lvLearnerSeqno);
									SbStudypath.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/sorlcurElement.getSorlcurTermCode(), p_key_seqno_ref, /*pStspCode=>*/"AS", /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/sorlcurElement.getSorlcurUserId(), /*pResdCode=>*/getFormModel().getSCurriculaLite().getSorlcurLiteResdCode(), /*pEgolCode=>*/getFormModel().getSCurriculaLite().getSorlcurLiteEgolCode(), /*pEdlvCode=>*/getFormModel().getSCurriculaLite().getSorlcurLiteEdlvCode(), /*pFullPartInd=>*/getFormModel().getSCurriculaLite().getSorlcurLiteFullPartInd(), /*pRowidOut=>*/lvRowid);
									lvLearnerSeqno = p_key_seqno_ref.val;
									sorlcurElement.setSorlcurKeySeqno(lvLearnerSeqno);
								}
							}
							else {
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pCopyStudypath(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeOld=>*/sorlcurElement.getSorlcurTermCode(), /*pTermCodeNew=>*/sorlcurElement.getSorlcurTermCode(), /*pKeyseqno=>*/sorlcurElement.getSorlcurKeySeqno());
							}
						}
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						SbCurriculum.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), toNumber(/*pSeqno=>*/""), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pTermCode=>*/sorlcurElement.getSorlcurTermCode(), /*pKeySeqno=>*/isNull(sorlcurElement.getSorlcurKeySeqno(), getFormModel().getSCurricula().getModuleKeySeqno()), /*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), /*pRollInd=>*/sorlcurElement.getSorlcurRollInd(), /*pCactCode=>*/sorlcurElement.getSorlcurCactCode(), /*pUserId=>*/sorlcurElement.getSorlcurUserId(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pTermCodeCtlg=>*/sorlcurElement.getSorlcurTermCodeCtlg(), /*pTermCodeEnd=>*/sorlcurElement.getSorlcurTermCodeEnd(), /*pTermCodeMatric=>*/sorlcurElement.getSorlcurTermCodeMatric(), /*pTermCodeAdmit=>*/sorlcurElement.getSorlcurTermCodeAdmit(), /*pAdmtCode=>*/sorlcurElement.getSorlcurAdmtCode(), /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pStartDate=>*/sorlcurElement.getSorlcurStartDate(), /*pEndDate=>*/sorlcurElement.getSorlcurEndDate(), toNumber(/*pRateCode=>*/getFormModel().getSCurriculaLite().getSorlcurLiteRateCode()), toNumber(/*pStypCode=>*/getFormModel().getSCurriculaLite().getSorlcurLiteStypCode()), toStr(/*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule()), toStr(/*pRolledSeqno=>*/null), /*pRowidOut=>*/sorlcurLiteElement.getROWID(), toStr(/*pSeqnoOut=>*/sorlcurElement.getSorlcurSeqno()), toDate(/*pCurrErrorOut=>*/sorlcurElement.getCurrError()), toDate(/*pOverrideSeverity=>*/"F"), /*pSeverityOut=>*/sorlcurElement.getSeverityOut(), /*pUserIdUpdate=>*/sorlcurElement.getSorlcurUserId(), toStr(/*pGappSeqno=>*/null));
						//  new learner status columns are only inserted on maintenance curriculum tab, not 
						//  during quick admit
						String sql1 = "SELECT * " +
	" FROM sorlcur " +
	" WHERE sorlcur_pidm = :SORLCUR_PIDM AND sorlcur_seqno = :SORLCUR_SEQNO ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						command1.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							currRec = new SorlcurRow(results1);
						}
						results1.close();
						if ( rowCount == 0 )
						{
						}
						sorlcurElement.setSorlcurActivityDate(currRec.SorlcurActivityDate);
						sorlcurElement.setSorlcurRollInd(currRec.SorlcurRollInd);
						if ( sorlcurElement.getSorlcurCurrRule().notEquals(currRec.SorlcurCurrRule) )
						{
							sorlcurElement.setSorlcurCurrRule(currRec.SorlcurCurrRule);
						}
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						String sql2 = "SELECT sovlcur_current_ind " +
	" FROM sovlcur " +
	" WHERE sovlcur_rowid = :SORLCUR_LITE_ROWID ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SORLCUR_LITE_ROWID", sorlcurLiteElement.getROWID());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							sorlcurElement.setSovlcurCurrentInd(results2.getStr(0));
						}
						results2.close();
						// 	  	message('pidm ' || :sorlcur_pidm || ' ' || curr_rec.sorlcur_pidm ||
						// ' seqno ' || :sorlcur_seqno || ' ' || curr_rec.sorlcur_seqno ||
						// ' prior ' || :sorlcur_priority_no || ' ' || curr_rec.sorlcur_priority_no ||
						// ' adate ' || to_char(:sorlcur_activity_date,'DDMMYYYY HH24MISS')
						// || ' lcur date ' || to_char(curr_rec.sorlcur_activity_date,'DDMMYYYY HH24MISS')
						// || ' user ' || :sorlcur_user_id || ' lcur ' || curr_rec.sorlcur_user_id
						// || ' curr rule ' || :sorlcur_curr_rule || ' db ' || curr_rec.sorlcur_curr_rule );
						// message( ' lmod ' || 	:SORLCUR_LMOD_CODE                         	|| ' ' || 	curr_rec.sorLCUR_LMOD_CODE
						// || ' term ' || 	 :SORLCUR_TERM_CODE        	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE
						// || ' key ' || 	 :SORLCUR_KEY_SEQNO          	|| ' ' || 	 curr_rec.sorLCUR_KEY_SEQNO
						// || ' prior ' || 	 :SORLCUR_PRIORITY_NO             	|| ' ' || 	 curr_rec.sorLCUR_PRIORITY_NO
						// || ' roll ' ||	 :SORLCUR_ROLL_IND                    	|| ' ' || 	 curr_rec.sorLCUR_ROLL_IND
						// || ' cact ' || 	 :SORLCUR_CACT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_CACT_CODE
						// || ' user ' ||	 :SORLCUR_USER_ID                        	|| ' ' || 	 curr_rec.sorLCUR_USER_ID
						// || ' lvl ' ||	:SORLCUR_LEVL_CODE                	|| ' ' || 	curr_rec.sorLCUR_LEVL_CODE
						// || ' col ' ||	 :SORLCUR_COLL_CODE        	|| ' ' || 	 curr_rec.sorLCUR_COLL_CODE
						// || ' degc '  ||	 :SORLCUR_DEGC_CODE             	|| ' ' || 	 curr_rec.sorLCUR_DEGC_CODE
						// || ' ctlg ' || 	 :SORLCUR_TERM_CODE_CTLG                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_CTLG
						// || ' end ' || 	 :SORLCUR_TERM_CODE_END            	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_END
						// || ' matr ' || 	 :SORLCUR_TERM_CODE_MATRIC                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_MATRIC
						// || ' admt ' || 	 :SORLCUR_TERM_CODE_ADMIT                  	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_ADMIT
						// || ' admt ' || 	 :SORLCUR_ADMT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_ADMT_CODE
						// || ' camp ' ||	 :SORLCUR_CAMP_CODE                           	|| ' ' || 	 curr_rec.sorLCUR_CAMP_CODE
						// || ' pgm ' || 	 :SORLCUR_PROGRAM                       	|| ' ' || 	 curr_rec.sorLCUR_PROGRAM
						// || ' str ' || 	 :SORLCUR_START_DATE            	|| ' ' || 	 curr_rec.sorLCUR_START_DATE
						// || ' end ' || 	 :SORLCUR_END_DATE                   	|| ' ' || 	 curr_rec.sorLCUR_END_DATE
						// || ' curr ' || 	 :SORLCUR_CURR_RULE                      	|| ' ' || 	 curr_rec.sorLCUR_CURR_RULE
						// || ' roll ' ||	 :SORLCUR_ROLLED_SEQNO || ' ' || curr_rec.sorlcur_rolled_seqno);
						//  show curriculum warning only once
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						sorlcurElement.setSovlcurRowid(sorlcurLiteElement.getROWID());
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") && (!sorlcurElement.getCurrError().isNull() && sorlcurElement.getCurrError().greater(0)) && (sorlcurElement.getCurricWarning().equals(0) || sorlcurElement.getCurricWarning().isNull()) && (in(sorlcurElement.getSeverityOut(), "W", "F").getValue()) )
						{
							cemMsg = substring(Sokcmsg.fSorlcurerrormsg(sorlcurElement.getSeverityOut(), toStr("V"), sorlcurElement.getCurrError()), toInt(1), toInt(75));
							setAlertMessageText(alertId, cemMsg);
							alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
							}
							if ( sorlcurElement.getSeverityOut().equals("F") )
							{
								throw new ApplicationException();
							}
							else {
								sorlcurElement.setCurricWarning(sorlcurElement.getCurrError());
							}
						}
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.ON-DELETE
		 --
-- ON-DELETE Trigger
--
BEGIN
	-- exit delete if its already been deleted by host api 
	IF (sb_curriculum.f_exists(:sorlcur_lite.SORLCUR_PIDM,
		  :sorlCUR_lite.SORLCUR_SEQNO) ='N' ) THEN
		  RETURN;
  END IF;
  sb_curriculum.P_DELETE(
     p_PIDM                   =>:SORLCUR_PIDM,
     p_SEQNO                  =>:SORLCUR_SEQNO,
     p_ROWID                  =>:sorlcur_lite.ROWID);
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
		 * SORLCUR_LITE.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void sorlcurLite_RowDelete(RowAdapterEvent args)
		{
			
				// 
				//  ON-DELETE Trigger
				// 
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)args.getRow();
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				try
				{
					//  exit delete if its already been deleted by host api 
					if ((SbCurriculum.fExists(sorlcurLiteElement.getSorlcurPidm(), sorlcurLiteElement.getSorlcurSeqno()).equals("N")))
					{
						return ;
					}
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					SbCurriculum.pDelete(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pRowid=>*/sorlcurLiteElement.getROWID());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.POST-QUERY
		 declare 
		cursor sel_maxlfos_c is 
	  select max(sorlfos_seqno)
	  from sorlfos
	  where sorlfos_pidm = :sorlcur_pidm
	  and sorlfos_lcur_seqno = :sorlcur_seqno;

begin
	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
  :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
	:sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
	:sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
  open sel_maxlfos_c;
  fetch sel_maxlfos_c into :sorlfos_seqno_cnt;
  if sel_maxlfos_c%notfound then
  	 :sorlfos_seqno_cnt := 0;
  end if;
  close sel_maxlfos_c;
end;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sorlcurLite_AfterQuery(RowAdapterEvent args)
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)args.getRow();


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sorlcurLiteElement.setLockDbValues(true);
								this.sorlcurAdmtCode_PostChange();
			this.sorlcurKeySeqno_PostChange();

				} finally { 
					sorlcurLiteElement.setLockDbValues(false);
				}
				{
					String sqlselMaxlfosC = "SELECT max(sorlfos_seqno) " +
	" FROM sorlfos " +
	" WHERE sorlfos_pidm = :SORLCUR_PIDM AND sorlfos_lcur_seqno = :SORLCUR_SEQNO ";
					DataCursor selMaxlfosC = new DataCursor(sqlselMaxlfosC);
					try{
						sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
						sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
						sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
						sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
						sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
						//Setting query parameters
						selMaxlfosC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						selMaxlfosC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable selMaxlfosC.
						selMaxlfosC.open();
						ResultSet selMaxlfosCResults = selMaxlfosC.fetchInto();
						if ( selMaxlfosCResults != null ) {
							sorlcurElement.setSorlfosSeqnoCnt(selMaxlfosCResults.getNumber(0));
						}
						if ( selMaxlfosC.notFound() )
						{
							sorlcurElement.setSorlfosSeqnoCnt(toNumber(0));
						}
					} finally {
						selMaxlfosC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.POST-BLOCK
		  if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;
 :dup_create_ind := 'N'; 

 set_item_property('NEXT_REC_BTN',ENABLED, property_false); 
 set_item_property('PREV_RECORD_BTN',ENABLED, property_false); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sorlcurLite_blockOut()
		{
			
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				setItemEnabled("NEXT_REC_BTN", false);
				setItemEnabled("PREV_RECORD_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.ON-POPULATE-DETAILS
		 --
-- Begin default relation declare section
--
DECLARE
  recstat     VARCHAR2(20) := :System.record_status;   
  startitm    VARCHAR2(61) := :System.cursor_item;   
  rel_id      Relation;
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  IF ( recstat = 'NEW' or recstat = 'INSERT' ) THEN   
    RETURN;
  END IF;
  --
  -- Begin SORLFOS_LITE detail program section
  --
  IF ( (:SORLCUR_LITE.SORLCUR_PIDM is not null) or (:SORLCUR_LITE.SORLCUR_SEQNO is not null) ) THEN   
    rel_id := Find_Relation('SORLCUR_LITE.SORLCUR_SORLFOS');   
    Query_Master_Details(rel_id, 'SORLFOS_LITE');   
  END IF;
  --
  -- End SORLFOS_LITE detail program section
  --

  IF ( :System.cursor_item <> startitm ) THEN     
     Go_Item(startitm);     
     Check_Package_Failure;     
  END IF;
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void sorlcurLite_PopulateDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)args.getRow();


				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					NString recstat = getRecordStatus();
					NString startitm = getCursorItem();
					org.jdesktop.databuffer.DataRelation relId= null;
					if ((recstat.equals("NEW") || recstat.equals("INSERT")))
					{
						return ;
					}
					// 
					//  Begin SORLFOS_LITE detail program section
					// 
					if (((!sorlcurLiteElement.getSorlcurPidm().isNull()) || (!sorlcurLiteElement.getSorlcurSeqno().isNull())))
					{
						// F2J_TO_REMOVE : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins".
						//						relId = SupportClasses.FORMS40.FindRelation("SORLCUR_LITE.SORLCUR_SORLFOS");
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins'.");
						
						
						this.getContainer().getServices().queryMasterDetails(relId, toStr("SORLFOS_LITE"));
					}
					// 
					//  End SORLFOS_LITE detail program section
					// 
					if ((getCursorItem().notEquals(startitm)))
					{
						goItem(startitm);
						this.getContainer().getServices().checkPackageFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.WHEN-NEW-RECORD-INSTANCE
		  if :system.mode = 'ENTER-QUERY' 
 	  then return;
 end if; 
 if :default_options_ind = 'Y' then 
 	  :default_options_ind := 'N';
    return;
 end if; 
 
  if :system.block_status in ('CHANGED','NEW') OR
 	get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' 
 	 then 
 	  :s$_curricula.curricula_updated := 'Y'; 
 else
 	if :system.block_status = 'QUERY' and 
 		get_block_property('SORLFOS_LITE',STATUS) = 'QUERY'  then 
 		  :s$_curricula.curricula_updated := 'N';
 	end if;
 end if; 
 
 :lcur_rec_num := :system.cursor_record; 

 
 
  if :sovlcur_rowid is not null then 
	
		set_curric_properties('sorlcur_degc_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_coll_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_camp_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_levl_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_program_lbt','enabled','property_false');
		set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_false');
		set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_false');
		set_curric_properties('sorlcur_key_seqno_lbt','enabled','property_false');


    if   ( nvl(:s$_curricula.curricula_updated,'N') <> 'Y'  AND 
    	nvl(:sorlcur_del_ind, 'N') <> 'Y'  AND  nvl(:s$_curricula.sorlfos_del_ind,'N') <> 'Y' )
    	OR ( :sovlfos_rowid is null ) then 
    	:system.message_level := '5';
	  	next_block;
	  	clear_block;
		  execute_query;
	  	previous_block;
 	  	:system.message_level := '0';
    END IF; 
		
		:sorlcur_query_ind := 'Y'; 
		:s$_curricula.sorlcur_del_ind := 'N'; 
	  :s$_curricula.sorlfos_del_ind := 'N'; 
		
 		set_curric_properties('sorlfos_csts_code_lbt','enabled','property_false');
 		set_curric_properties('sorlfos_majr_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_dept_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_false');
 		set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');

		set_curric_properties('sorlfos_csts_code','enabled','property_false');
		set_curric_properties('sorlfos_majr_code','enabled','property_false');
		set_curric_properties('sorlfos_dept_code','enabled','property_false');
		set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');

	
	else 
	 		
		set_curric_properties('sorlcur_degc_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_coll_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_camp_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_levl_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_program_lbt','enabled','property_true');
		set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_true');
		if :global.study_path = 'Y' and :s$_curricula.module_code = sb_curriculum_str.f_learner
			then 
			set_curric_properties('sorlcur_key_seqno_lbt','enabled','property_true');
		end if; 
	 
 		set_curric_properties('sorlfos_csts_code_lbt','enabled','property_false');
 		set_curric_properties('sorlfos_majr_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_dept_code_lbt','enabled','property_false');
		set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_false');
 		set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');

		set_curric_properties('sorlfos_csts_code','enabled','property_false');
		set_curric_properties('sorlfos_majr_code','enabled','property_false');
		set_curric_properties('sorlfos_dept_code','enabled','property_false');
		set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');

		set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_false');
		if :sorlcur_priority_no is null then 		
      execute_trigger('NEW_SORLCUR');
      G$_CHECK_FAILURE; 
    end if;
  
	  :lfos_rec_num := 0; 

	end if;
	
 :sorlcur_del_ind := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sorlcurLite_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				if ( getFormModel().getSCurricula().getDefaultOptionsInd().equals("Y") )
				{
					getFormModel().getSCurricula().setDefaultOptionsInd(toStr("N"));
					return ;
				}
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				else {
					if ( getBlockStatus().equals("QUERY") && getBlockStatus("SORLFOS_LITE").equals("QUERY") )
					{
						getFormModel().getSCurricula().setCurriculaUpdated(toStr("N"));
					}
				}
				getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord()));
				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("enabled"), toStr("property_false"));
					if ( (isNull(getFormModel().getSCurricula().getCurriculaUpdated(), "N").notEquals("Y") && isNull(getFormModel().getSCurricula().getSorlcurDelInd(), "N").notEquals("Y") && isNull(getFormModel().getSCurricula().getSorlfosDelInd(), "N").notEquals("Y")) || (sorlfosElement.getSovlfosRowid().isNull()) )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						executeQuery();
						previousBlock();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
					sorlcurElement.setSorlcurQueryInd(toStr("Y"));
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
					getFormModel().getSCurricula().setSorlfosDelInd(toStr("N"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
				}
				else {
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_true"));
					if ( getGlobal("STUDY_PATH").equals("Y") && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("enabled"), toStr("property_true"));
					}
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_false"));
					if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
					{
						executeAction("NEW_SORLCUR");
						getContainer().getGoqrpls().gCheckFailure();
					}
					getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
				}
				getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.WHEN-VALIDATE-RECORD
		 
if :system.mode = 'NORMAL' and 
	:system.block_status = 'QUERY' then 
	return;
end if;
--if :system.current_block = 'G$_OPT_BLOCK' OR
--	 :system.mode IN ( 'ENTER-QUERY', 'QUERY')  OR  
--	:s$_curricula.options_ind = 'Y' THEN
--	:s$_curricula.options_ind := NULL; 
--	return;
--end if;

if :sorlcur_priority_no is null and 
	 :sorlcur_levl_code is null and 
	 :sorlcur_coll_code is null and 
	 :sorlcur_degc_code is null and
	 :sorlcur_term_code_ctlg is null and
	 :sovlcur_rowid is null 	   
	then return;
end if;
  
 -- only insert into sotlcur if rowid is null,  this trigger also executes for 
 -- key delete 

if :sovlcur_rowid is null and nvl(:delete_inprogress,'N') = 'N' then 
	 soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm,
	    p_seqno => nvl(:sorlcur_seqno,999));
 
  	soklcur.p_create_sotlcur(
	  p_pidm =>:s$_curricula.module_pidm, 
	  p_seqno => :sorlcur_seqno,
	  p_cact_code => nvl(:sorlcur_cact_code,:s$_curricula.default_cact), 
	  p_priority_no => NVL(:sorlcur_priority_no,1),
	  p_term_code => :s$_curricula.module_term_code, 
	  p_key_seqno => :s$_curricula.module_key_seqno,
	  p_lmod_code => :s$_curricula.module_code); 
   
end if; 
  

 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void sorlcurLite_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("NORMAL") && getBlockStatus().equals("QUERY") )
				{
					return ;
				}
				// if :system.current_block = 'G$_OPT_BLOCK' OR
				// 	 :system.mode IN ( 'ENTER-QUERY', 'QUERY')  OR  
				// 	:s$_curricula.options_ind = 'Y' THEN
				// 	:s$_curricula.options_ind := NULL; 
				// 	return;
				// end if;
				if ( sorlcurElement.getSorlcurPriorityNo().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurDegcCode().isNull() && sorlcurElement.getSorlcurTermCodeCtlg().isNull() && sorlcurElement.getSovlcurRowid().isNull() )
				{
					return ;
				}
				//  only insert into sotlcur if rowid is null,  this trigger also executes for 
				//  key delete 
				if ( sorlcurElement.getSovlcurRowid().isNull() && isNull(getFormModel().getSCurricula().getDeleteInprogress(), "N").equals("N") )
				{
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.WHEN-NEW-BLOCK-INSTANCE
		 if :s$_curricula.module_term_code is null then 
	go_item(:return_from_sorlcur); 
  g$_check_failure;
END IF; 
if :system.mode = 'ENTER-QUERY' then 
 	execute_trigger('enable_curriculum'); 
  g$_check_failure;	
  return;
end if;
if :system.current_item like 'SORLCUR%' then
	execute_trigger('disable_curriculum'); 
  g$_check_failure;
else 
	execute_trigger('enable_curriculum'); 
  g$_check_failure;	
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sorlcurLite_blockChange()
		{
			
				if ( getFormModel().getSCurricula().getModuleTermCode().isNull() )
				{
					goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
					getContainer().getGoqrpls().gCheckFailure();
				}
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					return ;
				}
				if ( like(getCurrentItem(), "SORLCUR%") )
				{
					executeAction("disable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.QUERY_ONLY
		 DECLARE
    lv_what_obj  VARCHAR2(30);
    lv_what_role VARCHAR2(30);
  BEGIN
    GOKDBMS.APPLICATION_INFO_READ_MODULE(lv_what_obj, lv_what_role);
    IF lv_what_role IS NOT NULL AND SUBSTR(lv_what_role,-2,2) = '_Q' THEN
       MESSAGE(g$_nls.get('SOQOLIB-0356','FORM','*ERROR* You are running with a query only role, this function is not allowed.'));
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.QUERY_ONLY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_ONLY")
		public void sorlcurLite_QueryOnly()
		{
			
				{
					NString lvWhatObj= NString.getNull();
					NString lvWhatRole= NString.getNull();
					Ref<NString> p_module_name_ref = new Ref<NString>(lvWhatObj);
					Ref<NString> p_action_name_ref = new Ref<NString>(lvWhatRole);
					Gokdbms.applicationInfoReadModule(p_module_name_ref, p_action_name_ref);
					lvWhatObj = p_module_name_ref.val;
					lvWhatRole = p_action_name_ref.val;
					if ( !lvWhatRole.isNull() && substring(lvWhatRole, - (2), toInt(2)).equals("_Q") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0356"), toStr("FORM"), toStr("*ERROR* You are running with a query only role, this function is not allowed.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LITE.FINDCHANGES
		 <multilinecomment>
declare 
	
	
	curr_rec  sorlcur%rowtype;

begin 
	select * into curr_rec from sorlcur
	where sorlcur_pidm = :sorlcur_pidm and sorlcur_seqno = :sorlcur_seqno;
 
 
	message('pidm ' || :sorlcur_pidm || ' ' || curr_rec.sorlcur_pidm || 
	' seqno ' || :sorlcur_seqno || ' ' || curr_rec.sorlcur_seqno || 
	' prior ' || :sorlcur_priority_no || ' ' || curr_rec.sorlcur_priority_no || 
	' adate ' || to_char(:sorlcur_activity_date,'DDMMYYYY HH24MISS') 
	   || ' lcur date ' || to_char(curr_rec.sorlcur_activity_date,'DDMMYYYY HH24MISS')
	  || ' user ' || :sorlcur_user_id || ' lcur ' || curr_rec.sorlcur_user_id
	  || ' curr rule ' || :sorlcur_curr_rule || ' db ' || curr_rec.sorlcur_curr_rule );
message( ' lmod ' || 	:SORLCUR_LMOD_CODE                         	|| ' ' || 	curr_rec.sorLCUR_LMOD_CODE                         
|| ' term ' || 	 :SORLCUR_TERM_CODE        	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE                                             
|| ' key ' || 	 :SORLCUR_KEY_SEQNO          	|| ' ' || 	 curr_rec.sorLCUR_KEY_SEQNO                                             
|| ' prior ' || 	 :SORLCUR_PRIORITY_NO             	|| ' ' || 	 curr_rec.sorLCUR_PRIORITY_NO                                           
|| ' roll ' ||	 :SORLCUR_ROLL_IND                    	|| ' ' || 	 curr_rec.sorLCUR_ROLL_IND                                              
|| ' cact ' || 	 :SORLCUR_CACT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_CACT_CODE                                             
|| ' user ' ||	 :SORLCUR_USER_ID                        	|| ' ' || 	 curr_rec.sorLCUR_USER_ID                                               
|| ' lvl ' ||	:SORLCUR_LEVL_CODE                	|| ' ' || 	curr_rec.sorLCUR_LEVL_CODE                                             
|| ' col ' ||	 :SORLCUR_COLL_CODE        	|| ' ' || 	 curr_rec.sorLCUR_COLL_CODE                                             
|| ' degc '  ||	 :SORLCUR_DEGC_CODE             	|| ' ' || 	 curr_rec.sorLCUR_DEGC_CODE                                             
|| ' ctlg ' || 	 :SORLCUR_TERM_CODE_CTLG                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_CTLG                                                 
|| ' end ' || 	 :SORLCUR_TERM_CODE_END            	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_END                                                  
|| ' matr ' || 	 :SORLCUR_TERM_CODE_MATRIC                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_MATRIC                                               
|| ' admt ' || 	 :SORLCUR_TERM_CODE_ADMIT                  	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_ADMIT                                                
|| ' admt ' || 	 :SORLCUR_ADMT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_ADMT_CODE                                                      
|| ' camp ' ||	 :SORLCUR_CAMP_CODE                           	|| ' ' || 	 curr_rec.sorLCUR_CAMP_CODE                                                      
|| ' pgm ' || 	 :SORLCUR_PROGRAM                       	|| ' ' || 	 curr_rec.sorLCUR_PROGRAM                                                        
|| ' str ' || 	 :SORLCUR_START_DATE            	|| ' ' || 	 curr_rec.sorLCUR_START_DATE                                                     
|| ' end ' || 	 :SORLCUR_END_DATE                   	|| ' ' || 	 curr_rec.sorLCUR_END_DATE                                                       
|| ' curr ' || 	 :SORLCUR_CURR_RULE                      	|| ' ' || 	 curr_rec.sorLCUR_CURR_RULE                                                      
|| ' roll ' ||	 :SORLCUR_ROLLED_SEQNO || ' ' || curr_rec.sorlcur_rolled_seqno);
 
	   
end; </multilinecomment>

NULL;
		*/
		/*
		 *<p>
		 *not used, but has commented out code to find diff between db and form values
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.FINDCHANGES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FINDCHANGES")
		public void sorlcurLite_Findchanges()
		{
			
				// declare
				// curr_rec  sorlcur%rowtype;
				// begin
				// select * into curr_rec from sorlcur
				// where sorlcur_pidm = :sorlcur_pidm and sorlcur_seqno = :sorlcur_seqno;
				// message('pidm ' || :sorlcur_pidm || ' ' || curr_rec.sorlcur_pidm ||
				// ' seqno ' || :sorlcur_seqno || ' ' || curr_rec.sorlcur_seqno ||
				// ' prior ' || :sorlcur_priority_no || ' ' || curr_rec.sorlcur_priority_no ||
				// ' adate ' || to_char(:sorlcur_activity_date,'DDMMYYYY HH24MISS')
				// || ' lcur date ' || to_char(curr_rec.sorlcur_activity_date,'DDMMYYYY HH24MISS')
				// || ' user ' || :sorlcur_user_id || ' lcur ' || curr_rec.sorlcur_user_id
				// || ' curr rule ' || :sorlcur_curr_rule || ' db ' || curr_rec.sorlcur_curr_rule );
				// message( ' lmod ' || 	:SORLCUR_LMOD_CODE                         	|| ' ' || 	curr_rec.sorLCUR_LMOD_CODE
				// || ' term ' || 	 :SORLCUR_TERM_CODE        	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE
				// || ' key ' || 	 :SORLCUR_KEY_SEQNO          	|| ' ' || 	 curr_rec.sorLCUR_KEY_SEQNO
				// || ' prior ' || 	 :SORLCUR_PRIORITY_NO             	|| ' ' || 	 curr_rec.sorLCUR_PRIORITY_NO
				// || ' roll ' ||	 :SORLCUR_ROLL_IND                    	|| ' ' || 	 curr_rec.sorLCUR_ROLL_IND
				// || ' cact ' || 	 :SORLCUR_CACT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_CACT_CODE
				// || ' user ' ||	 :SORLCUR_USER_ID                        	|| ' ' || 	 curr_rec.sorLCUR_USER_ID
				// || ' lvl ' ||	:SORLCUR_LEVL_CODE                	|| ' ' || 	curr_rec.sorLCUR_LEVL_CODE
				// || ' col ' ||	 :SORLCUR_COLL_CODE        	|| ' ' || 	 curr_rec.sorLCUR_COLL_CODE
				// || ' degc '  ||	 :SORLCUR_DEGC_CODE             	|| ' ' || 	 curr_rec.sorLCUR_DEGC_CODE
				// || ' ctlg ' || 	 :SORLCUR_TERM_CODE_CTLG                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_CTLG
				// || ' end ' || 	 :SORLCUR_TERM_CODE_END            	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_END
				// || ' matr ' || 	 :SORLCUR_TERM_CODE_MATRIC                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_MATRIC
				// || ' admt ' || 	 :SORLCUR_TERM_CODE_ADMIT                  	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_ADMIT
				// || ' admt ' || 	 :SORLCUR_ADMT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_ADMT_CODE
				// || ' camp ' ||	 :SORLCUR_CAMP_CODE                           	|| ' ' || 	 curr_rec.sorLCUR_CAMP_CODE
				// || ' pgm ' || 	 :SORLCUR_PROGRAM                       	|| ' ' || 	 curr_rec.sorLCUR_PROGRAM
				// || ' str ' || 	 :SORLCUR_START_DATE            	|| ' ' || 	 curr_rec.sorLCUR_START_DATE
				// || ' end ' || 	 :SORLCUR_END_DATE                   	|| ' ' || 	 curr_rec.sorLCUR_END_DATE
				// || ' curr ' || 	 :SORLCUR_CURR_RULE                      	|| ' ' || 	 curr_rec.sorLCUR_CURR_RULE
				// || ' roll ' ||	 :SORLCUR_ROLLED_SEQNO || ' ' || curr_rec.sorlcur_rolled_seqno);
				// end; 
				// declare
				// curr_rec  sorlcur%rowtype;
				// begin
				// select * into curr_rec from sorlcur
				// where sorlcur_pidm = :sorlcur_pidm and sorlcur_seqno = :sorlcur_seqno;
				// message('pidm ' || :sorlcur_pidm || ' ' || curr_rec.sorlcur_pidm ||
				// ' seqno ' || :sorlcur_seqno || ' ' || curr_rec.sorlcur_seqno ||
				// ' prior ' || :sorlcur_priority_no || ' ' || curr_rec.sorlcur_priority_no ||
				// ' adate ' || to_char(:sorlcur_activity_date,'DDMMYYYY HH24MISS')
				// || ' lcur date ' || to_char(curr_rec.sorlcur_activity_date,'DDMMYYYY HH24MISS')
				// || ' user ' || :sorlcur_user_id || ' lcur ' || curr_rec.sorlcur_user_id
				// || ' curr rule ' || :sorlcur_curr_rule || ' db ' || curr_rec.sorlcur_curr_rule );
				// message( ' lmod ' || 	:SORLCUR_LMOD_CODE                         	|| ' ' || 	curr_rec.sorLCUR_LMOD_CODE
				// || ' term ' || 	 :SORLCUR_TERM_CODE        	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE
				// || ' key ' || 	 :SORLCUR_KEY_SEQNO          	|| ' ' || 	 curr_rec.sorLCUR_KEY_SEQNO
				// || ' prior ' || 	 :SORLCUR_PRIORITY_NO             	|| ' ' || 	 curr_rec.sorLCUR_PRIORITY_NO
				// || ' roll ' ||	 :SORLCUR_ROLL_IND                    	|| ' ' || 	 curr_rec.sorLCUR_ROLL_IND
				// || ' cact ' || 	 :SORLCUR_CACT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_CACT_CODE
				// || ' user ' ||	 :SORLCUR_USER_ID                        	|| ' ' || 	 curr_rec.sorLCUR_USER_ID
				// || ' lvl ' ||	:SORLCUR_LEVL_CODE                	|| ' ' || 	curr_rec.sorLCUR_LEVL_CODE
				// || ' col ' ||	 :SORLCUR_COLL_CODE        	|| ' ' || 	 curr_rec.sorLCUR_COLL_CODE
				// || ' degc '  ||	 :SORLCUR_DEGC_CODE             	|| ' ' || 	 curr_rec.sorLCUR_DEGC_CODE
				// || ' ctlg ' || 	 :SORLCUR_TERM_CODE_CTLG                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_CTLG
				// || ' end ' || 	 :SORLCUR_TERM_CODE_END            	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_END
				// || ' matr ' || 	 :SORLCUR_TERM_CODE_MATRIC                    	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_MATRIC
				// || ' admt ' || 	 :SORLCUR_TERM_CODE_ADMIT                  	|| ' ' || 	 curr_rec.sorLCUR_TERM_CODE_ADMIT
				// || ' admt ' || 	 :SORLCUR_ADMT_CODE                          	|| ' ' || 	 curr_rec.sorLCUR_ADMT_CODE
				// || ' camp ' ||	 :SORLCUR_CAMP_CODE                           	|| ' ' || 	 curr_rec.sorLCUR_CAMP_CODE
				// || ' pgm ' || 	 :SORLCUR_PROGRAM                       	|| ' ' || 	 curr_rec.sorLCUR_PROGRAM
				// || ' str ' || 	 :SORLCUR_START_DATE            	|| ' ' || 	 curr_rec.sorLCUR_START_DATE
				// || ' end ' || 	 :SORLCUR_END_DATE                   	|| ' ' || 	 curr_rec.sorLCUR_END_DATE
				// || ' curr ' || 	 :SORLCUR_CURR_RULE                      	|| ' ' || 	 curr_rec.sorLCUR_CURR_RULE
				// || ' roll ' ||	 :SORLCUR_ROLLED_SEQNO || ' ' || curr_rec.sorlcur_rolled_seqno);
				// end; 
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LITE.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sorlcurLite_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_CODE", this.getFormModel().getSCurricula().getModuleCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_KEY_SEQNO", this.getFormModel().getSCurricula().getModuleKeySeqno()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_TERM_CODE", this.getFormModel().getSCurricula().getModuleTermCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_END_TERM", this.getFormModel().getSCurricula().getModuleEndTerm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE")
		public void sorlcurTermCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurTermCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_TERM_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurTermCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_TERM_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurTermCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0357', 'FORM','*ERROR* Invalid term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

--if :sorlcur_term_code <> :s$_curricula.module_term_code then 
--	message(G$_NLS.Get('x', 'FORM','*ERROR* term code must be equal to module term.') );
--	raise form_trigger_failure;
--end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE")
		public void sorlcurTermCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0357"), toStr("FORM"), toStr("*ERROR* Invalid term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE_CTLG")
		public void sorlcurTermCodeCtlg_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE_CTLG", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCodeCtlg_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCodeCtlg_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_CTLG.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_ctlg is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_ctlg);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0358', 'FORM','*ERROR* Invalid catalog term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
  if :sorlfos_seqno_cnt = 1 and :sorlcur_term_code_ctlg <> 
	  :sorlfos_term_code_ctlg and :sorlfos_term_code_ctlg is not null then
	  :sorlfos_term_code_ctlg := :sorlcur_term_code_ctlg;
  elsif :sorlfos_seqno_cnt > 1 then 
  	 		message( G$_NLS.Get('SOQOLIB-0359', 'FORM','*WARNING* The field of study catalog term code will not be updated with the new value.') );
  end if; 
	:sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE_CTLG")
		public void sorlcurTermCodeCtlg_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeCtlg());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0358"), toStr("FORM"), toStr("*ERROR* Invalid catalog term code, press LIST for values.")));
						throw new ApplicationException();
					}
					if ( sorlcurElement.getSorlfosSeqnoCnt().equals(1) && sorlcurElement.getSorlcurTermCodeCtlg().notEquals(sorlfosElement.getSorlfosTermCodeCtlg()) && !sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(sorlcurElement.getSorlcurTermCodeCtlg());
					}
					else if ( sorlcurElement.getSorlfosSeqnoCnt().greater(1) ) {
						warningMessage(GNls.Fget(toStr("SOQOLIB-0359"), toStr("FORM"), toStr("*WARNING* The field of study catalog term code will not be updated with the new value.")));
					}
					sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_PROGRAM")
		public void sorlcurProgram_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_PROGRAM", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurProgram_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_PROGRAM", function=KeyFunction.NEXT_ITEM)
		public void sorlcurProgram_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('SMRPRLE_PROGRAM',
                     'SMRPRLE_PROGRAM_DESC',
                     '');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurProgram_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("SMRPRLE_PROGRAM"), toStr("SMRPRLE_PROGRAM_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.G$_SEARCH_OPTIONS
		 if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 

  execute_trigger('program_options');
end if;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurProgram_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					executeAction("program_options");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.PROGRAM_OPTIONS
		 GO_ITEM('SORLCUR_LITE.SORLCUR_PROGRAM');
BREAK;
:s$_curricula.options_ind := 'Y'; 

:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 

G$_KEY_OPT_MENU('SORLCUR_PROGRAM',
                 G$_NLS.Get('SOQOLIB-0360', 'FORM','All Program Codes') ,'LIST_VALUES',
                 G$_NLS.Get('SOQOLIB-0361', 'FORM','Base Curriculum Rules by Program') ,'HELP',
                 G$_NLS.Get('SOQOLIB-0362', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                 G$_NLS.Get('SOQOLIB-0363', 'FORM','Curriculum Rules') ,'EDIT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.PROGRAM_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PROGRAM_OPTIONS")
		public void sorlcurProgram_ProgramOptions()
		{
			
				goItem(toStr("SORLCUR_LITE.SORLCUR_PROGRAM"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_PROGRAM"), GNls.Fget(toStr("SOQOLIB-0360"), toStr("FORM"), toStr("All Program Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0361"), toStr("FORM"), toStr("Base Curriculum Rules by Program")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0362"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), GNls.Fget(toStr("SOQOLIB-0363"), toStr("FORM"), toStr("Curriculum Rules")), toStr("EDIT"));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.PRE-TEXT-ITEM
		 :change_program := :sorlcur_program;
set_item_property('SORLCUR_PROGRAM',LOV_NAME,'SMRPRLE_PROGRAM_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
   end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_PROGRAM", function=KeyFunction.ITEM_IN)
		public void sorlcurProgram_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurricula().setChangeProgram(sorlcurElement.getSorlcurProgram());
				setItemLovName("SORLCUR_PROGRAM", "SMRPRLE_PROGRAM_LOV");
				// 
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.WHEN-VALIDATE-ITEM
		  
if :sorlcur_program is null or
   :sorlcur_program = '************'  then
          return;
end if;
begin
declare
	hold_curr_rule varchar2(1) := '';
	hold_curr_ind varchar2(1) := ''; 
	smrprle_curr_ind  varchar2(1) := ''; 
  cursor smrprle_check is 
     select  smrprle_camp_code, smrprle_levl_code_stu,
             smrprle_coll_code, smrprle_degc_code, 
             smrprle_curr_ind
     from smrprle
     where nvl(smrprle_pidm, :s$_curricula.module_pidm) = :s$_curricula.module_pidm
     and smrprle_program = :sorlcur_program     ;
              
begin
	hold_curr_ind := :lcur_original_curr_ind;

  open smrprle_check;
  fetch smrprle_check into  :lcur_camp_code, :lcur_levl_code,
              :lcur_coll_code, :lcur_degc_code, 
               smrprle_curr_ind;
  if smrprle_check%notfound then
     if :sorlcur_program = '************' then
            null;
     else
          message( G$_NLS.Get('SOQOLIB-0364', 'FORM','*ERROR* Invalid Program Code; Press LIST for Valid Codes.') );
          raise form_trigger_failure;
          close smrprle_check;
          return;
     end if;
  end if;
 
     if :lcur_camp_code is null then
             null;
     else
         :sorlcur_camp_code := :lcur_camp_code;
         :sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
     end if;
     if :lcur_levl_code is null then
             null;
     else
       :sorlcur_levl_code := :lcur_levl_code;
       :sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
     end if;
       if :lcur_coll_code is null then
                null;
       else
             :sorlcur_coll_code := :lcur_coll_code;
             :sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
      end if;
      if :lcur_degc_code is null then
                 null;
      else
           :sorlcur_degc_code := :lcur_degc_code;
           :sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
      end if;
--
     if hold_curr_ind = 'Y' then
         if smrprle_curr_ind = 'Y' then
         	 --- only override the curriculum checking if the term is < initial curric term
         	 if :global.init_curr_term > :s$_curricula.module_term_code then
            :lcur_temp_rule_ind := hold_curr_ind;
            :lcur_sobctrl_curr_rule_ind := hold_curr_ind;
           end if;
         else
         	  if :lcur_sobctrl_curr_rule_ind = 'Y' then
               execute_trigger('curr_ind_message');
            end if;
            :lcur_sobctrl_curr_rule_ind := smrprle_curr_ind;
         end if;
    	 else
       	 --- only override the curriculum checking if the term is < initial curric term
       	 if :global.init_curr_term > :s$_curricula.module_term_code then
           :lcur_temp_rule_ind := hold_curr_ind;
           :lcur_sobctrl_curr_rule_ind := hold_curr_ind;
         end if;
      end if;
       
end;
end;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_PROGRAM")
		public void sorlcurProgram_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				if ( sorlcurElement.getSorlcurProgram().isNull() || sorlcurElement.getSorlcurProgram().equals("************") )
				{
					return ;
				}
				{
					NString holdCurrRule = toStr("");
					NString holdCurrInd = toStr("");
					NString smrprleCurrInd = toStr("");
					String sqlsmrprleCheck = "SELECT smrprle_camp_code, smrprle_levl_code_stu, smrprle_coll_code, smrprle_degc_code, smrprle_curr_ind " +
	" FROM smrprle " +
	" WHERE nvl(smrprle_pidm, :S___CURRICULA_MODULE_PIDM) = :S___CURRICULA_MODULE_PIDM AND smrprle_program = :SORLCUR_PROGRAM ";
					DataCursor smrprleCheck = new DataCursor(sqlsmrprleCheck);
					try {
						holdCurrInd = getFormModel().getSCurricula().getLcurOriginalCurrInd();
						//Setting query parameters
						smrprleCheck.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						smrprleCheck.addParameter("SORLCUR_PROGRAM", sorlcurElement.getSorlcurProgram());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable smrprleCheck.
						smrprleCheck.open();
						ResultSet smrprleCheckResults = smrprleCheck.fetchInto();
						if ( smrprleCheckResults != null ) {
							getFormModel().getSCurricula().setLcurCampCode(smrprleCheckResults.getStr(0));
							getFormModel().getSCurricula().setLcurLevlCode(smrprleCheckResults.getStr(1));
							getFormModel().getSCurricula().setLcurCollCode(smrprleCheckResults.getStr(2));
							getFormModel().getSCurricula().setLcurDegcCode(smrprleCheckResults.getStr(3));
							smrprleCurrInd = smrprleCheckResults.getStr(4);
						}
						if ( smrprleCheck.notFound() )
						{
							if ( sorlcurElement.getSorlcurProgram().equals("************") )
							{
							}
							else {
								errorMessage(GNls.Fget(toStr("SOQOLIB-0364"), toStr("FORM"), toStr("*ERROR* Invalid Program Code; Press LIST for Valid Codes.")));
								throw new ApplicationException();
//								smrprleCheck.close();
//								return ;
							}
						}
						if ( getFormModel().getSCurricula().getLcurCampCode().isNull() )
						{
						}
						else {
							sorlcurElement.setSorlcurCampCode(getFormModel().getSCurricula().getLcurCampCode());
							sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
						}
						if ( getFormModel().getSCurricula().getLcurLevlCode().isNull() )
						{
						}
						else {
							sorlcurElement.setSorlcurLevlCode(getFormModel().getSCurricula().getLcurLevlCode());
							sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
						}
						if ( getFormModel().getSCurricula().getLcurCollCode().isNull() )
						{
						}
						else {
							sorlcurElement.setSorlcurCollCode(getFormModel().getSCurricula().getLcurCollCode());
							sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
						}
						if ( getFormModel().getSCurricula().getLcurDegcCode().isNull() )
						{
						}
						else {
							sorlcurElement.setSorlcurDegcCode(getFormModel().getSCurricula().getLcurDegcCode());
							sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
						}
						// 
						if ( holdCurrInd.equals("Y") )
						{
							if ( smrprleCurrInd.equals("Y") )
							{
								// - only override the curriculum checking if the term is < initial curric term
								if ( getGlobal("INIT_CURR_TERM").greater(getFormModel().getSCurricula().getModuleTermCode()) )
								{
									getFormModel().getSCurricula().setLcurTempRuleInd(holdCurrInd);
									getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(holdCurrInd);
								}
							}
							else {
								if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
								{
									executeAction("curr_ind_message");
								}
								getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(smrprleCurrInd);
							}
						}
						else {
							// - only override the curriculum checking if the term is < initial curric term
							if ( getGlobal("INIT_CURR_TERM").greater(getFormModel().getSCurricula().getModuleTermCode()) )
							{
								getFormModel().getSCurricula().setLcurTempRuleInd(holdCurrInd);
								getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(holdCurrInd);
							}
						}
					} finally {
						smrprleCheck.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
g$_check_failure;
--
 IF NVL(:sorlcur_program,'%') <> NVL(:change_program,'%') THEN
   
   if :lcur_sobctrl_curr_rule_ind = 'Y' then
    
      :sorlcur_curr_rule := null; 
       execute_trigger('lcur_check_program'); 
   
   end if;
    
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_PROGRAM", function=KeyFunction.ITEM_OUT)
		public void sorlcurProgram_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				// 
				if ( isNull(sorlcurElement.getSorlcurProgram(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeProgram(), "%")) )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						executeAction("lcur_check_program");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.KEY-LISTVAL
		  
if :sovlcur_rowid is not null 
	and :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
   set_item_property('SORLCUR_PROGRAM', LOV_NAME, 'SMRPRLE_PROGRAM_LOV');
   g$_display_lov('','');
   if :global.sel_ind = 'Y' then
      :sorlcur_program := :global.program;
      :sorlcur_levl_code := :global.level_code;
      :sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
 
      if :global.campus is null then
          null;
      else
          :sorlcur_camp_code := :global.campus;
          :sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
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
      next_item;
      previous_item;
    :global.level_code := '';
    :global.college := '';
    :global.degree_code := '';
    :global.program := '';
    :global.campus := '';
      
   end if;
end if;
  


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_PROGRAM", function=KeyFunction.LIST_VALUES)
		public void sorlcurProgram_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					setItemLovName("SORLCUR_PROGRAM", "SMRPRLE_PROGRAM_LOV");
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
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
						nextItem();
						previousItem();
						setGlobal("LEVEL_CODE", toStr(""));
						setGlobal("COLLEGE", toStr(""));
						setGlobal("DEGREE_CODE", toStr(""));
						setGlobal("PROGRAM", toStr(""));
						setGlobal("CAMPUS", toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.KEY-HELP
		 IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
	:global.sel_ind := '';
	:lcur_process := 'SORLCUR_PROGRAM';
	execute_trigger('lcur_program_help');
	g$_check_failure;
	GO_ITEM('SORLCUR_PROGRAM');
	next_item;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_PROGRAM", function=KeyFunction.HELP)
		public void sorlcurProgram_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_PROGRAM"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR_PROGRAM"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.KEY-CQUERY
		 if :sovlcur_rowid is not null 
	OR :SYSTEM.MODE = 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else  

	:lcur_process := 'SORLCUR_PROGRAM';
	execute_trigger('lcur_sorcurr_change');
	g$_check_failure;
	GO_ITEM('SORLCUR_PROGRAM');
	next_item;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_PROGRAM", function=KeyFunction.COUNT_QUERY)
		public void sorlcurProgram_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() || getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_PROGRAM"));
					executeAction("lcur_sorcurr_change");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR_PROGRAM"));
					nextItem();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_LEVL_CODE")
		public void sorlcurLevlCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LEVL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLevlCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurLevlCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_LEVL_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurLevlCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.G$_SEARCH_OPTIONS
		 if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 
  execute_trigger('level_options');
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurLevlCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					executeAction("level_options");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.LEVEL_OPTIONS
		 GO_ITEM('SORLCUR_LEVL_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 


G$_KEY_OPT_MENU('SORLCUR_LEVL_CODE', G$_NLS.Get('SOQOLIB-0365', 'FORM','All Level Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0366', 'FORM','Base Curriculum Rules by Level') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0367', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                                    '','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.LEVEL_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="LEVEL_OPTIONS")
		public void sorlcurLevlCode_LevelOptions()
		{
			
				goItem(toStr("SORLCUR_LEVL_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_LEVL_CODE"), GNls.Fget(toStr("SOQOLIB-0365"), toStr("FORM"), toStr("All Level Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0366"), toStr("FORM"), toStr("Base Curriculum Rules by Level")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0367"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.PRE-TEXT-ITEM
		 :change_levl_code := :sorlcur_levl_code;
set_item_property('SORLCUR_LEVL_CODE',LOV_NAME,'STVLEVL_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
   end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_LEVL_CODE", function=KeyFunction.ITEM_IN)
		public void sorlcurLevlCode_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurricula().setChangeLevlCode(sorlcurElement.getSorlcurLevlCode());
				setItemLovName("SORLCUR_LEVL_CODE", "STVLEVL_LOV");
				// 
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_levl_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvlevl.f_code_exists(:sorlcur_levl_code);
 	:sorlcur_levl_desc := gb_stvlevl.f_get_description(:sorlcur_levl_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0368', 'FORM','*ERROR* Invalid level code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_LEVL_CODE")
		public void sorlcurLevlCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurLevlCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvlevl.fCodeExists(sorlcurElement.getSorlcurLevlCode());
					sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0368"), toStr("FORM"), toStr("*ERROR* Invalid level code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
if :sorlcur_levl_code is null then 
	:sorlcur_levl_desc := '';
end if;
--
IF nvl(:sorlcur_levl_code,'%') <> nvl(:change_levl_code,'%') THEN
    

    if :lcur_sobctrl_curr_rule_ind = 'Y' then
    	 :sorlcur_curr_rule := null;
    	 execute_trigger('lcur_check_program');
    
    end if;
end if;  

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_LEVL_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurLevlCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				if ( sorlcurElement.getSorlcurLevlCode().isNull() )
				{
					sorlcurElement.setSorlcurLevlDesc(toStr(""));
				}
				// 
				if ( isNull(sorlcurElement.getSorlcurLevlCode(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeLevlCode(), "%")) )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						executeAction("lcur_check_program");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.KEY-HELP
		 IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
:global.sel_ind := '';
:lcur_process := 'SORLCUR_LEVL_CODE';
execute_trigger('lcur_program_help');
g$_check_failure;
GO_ITEM('SORLCUR_LEVL_CODE');
next_item;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_LEVL_CODE", function=KeyFunction.HELP)
		public void sorlcurLevlCode_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_LEVL_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR_LEVL_CODE"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.KEY-LISTVAL
		 if :sovlcur_rowid is not null 
	and :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
  set_item_property('SORLCUR_LEVL_CODE', LOV_NAME, 'STVLEVL_LOV');
  g$_display_lov('','');
  if :global.value is not null then 
	 :sorlcur_levl_code := :global.value;
  end if;
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_LEVL_CODE", function=KeyFunction.LIST_VALUES)
		public void sorlcurLevlCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					setItemLovName("SORLCUR_LEVL_CODE", "STVLEVL_LOV");
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !getGlobal("VALUE").isNull() )
					{
						sorlcurElement.setSorlcurLevlCode(getGlobal("VALUE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.KEY-CQUERY
		 if :sovlcur_rowid is not null 
	OR :SYSTEM.MODE = 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg'); 
else 
  :lcur_process := 'SORLCUR_LEVL_CODE';
 execute_trigger('lcur_sorcurr_change');
  g$_check_failure;
  GO_ITEM('SORLCUR_LEVL_CODE');
  next_item;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_LEVL_CODE", function=KeyFunction.COUNT_QUERY)
		public void sorlcurLevlCode_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() || getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_LEVL_CODE"));
					executeAction("lcur_sorcurr_change");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR_LEVL_CODE"));
					nextItem();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_CAMP_CODE")
		public void sorlcurCampCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_CAMP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurCampCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_CAMP_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurCampCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.G$_SEARCH_OPTIONS
		 if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 

  execute_trigger('campus_options');
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurCampCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					executeAction("campus_options");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.CAMPUS_OPTIONS
		 
GO_ITEM('SORLCUR_CAMP_CODE');
BREAK;
:CHECK_KEYS := 'N';

copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 

 
G$_KEY_OPT_MENU('SORLCUR_CAMP_CODE', G$_NLS.Get('SOQOLIB-0369', 'FORM','All Campus Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0370', 'FORM','Base Curriculum Rules by Campus') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0371', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                                    '','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.CAMPUS_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CAMPUS_OPTIONS")
		public void sorlcurCampCode_CampusOptions()
		{
			
				goItem(toStr("SORLCUR_CAMP_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_CAMP_CODE"), GNls.Fget(toStr("SOQOLIB-0369"), toStr("FORM"), toStr("All Campus Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0370"), toStr("FORM"), toStr("Base Curriculum Rules by Campus")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0371"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
if :sorlcur_camp_code is null then 
	:sorlcur_camp_desc := '';
end if;
--
IF nvl(:sorlcur_camp_code,'%') <> nvl(:change_camp_code,'%') THEN
  

    if :lcur_sobctrl_curr_rule_ind = 'Y' then
    	 :sorlcur_curr_rule := null;
    	 execute_trigger('lcur_check_program');
    
    end if;
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_CAMP_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurCampCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				if ( sorlcurElement.getSorlcurCampCode().isNull() )
				{
					sorlcurElement.setSorlcurCampDesc(toStr(""));
				}
				// 
				if ( isNull(sorlcurElement.getSorlcurCampCode(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeCampCode(), "%")) )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						executeAction("lcur_check_program");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.KEY-HELP
		  IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
--
:global.sel_ind := '';
:lcur_process := 'SORLCUR_CAMP_CODE';
execute_trigger('lcur_program_help');
g$_check_failure;

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_CAMP_CODE", function=KeyFunction.HELP)
		public void sorlcurCampCode_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					// 
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_CAMP_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.KEY-LISTVAL
		  
if :sovlcur_rowid is not null 
 and :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
  set_item_property('SORLCUR_CAMP_CODE', LOV_NAME, 'STVCAMP_LOV');
  g$_display_lov('','');

  if :global.value is not null then 
	 :sorlcur_camp_code := :global.value;
  end if;
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_CAMP_CODE", function=KeyFunction.LIST_VALUES)
		public void sorlcurCampCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					setItemLovName("SORLCUR_CAMP_CODE", "STVCAMP_LOV");
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !getGlobal("VALUE").isNull() )
					{
						sorlcurElement.setSorlcurCampCode(getGlobal("VALUE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.KEY-CQUERY
		 if :sovlcur_rowid is not null 
	OR :SYSTEM.MODE = 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
ELSE 
  :lcur_process := 'SORLCUR_CAMP_CODE';
  execute_trigger('lcur_sorcurr_change');
  g$_check_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_CAMP_CODE", function=KeyFunction.COUNT_QUERY)
		public void sorlcurCampCode_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() || getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_CAMP_CODE"));
					executeAction("lcur_sorcurr_change");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.PRE-TEXT-ITEM
		 :change_camp_code := :sorlcur_camp_code;
set_item_property('SORLCUR_CAMP_CODE',LOV_NAME,'STVCAMP_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
   end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_CAMP_CODE", function=KeyFunction.ITEM_IN)
		public void sorlcurCampCode_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurricula().setChangeCampCode(sorlcurElement.getSorlcurCampCode());
				setItemLovName("SORLCUR_CAMP_CODE", "STVCAMP_LOV");
				// 
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_camp_code is null then 
	 return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvcamp.f_code_exists(:sorlcur_camp_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0372', 'FORM','*ERROR* Invalid campus code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
 	:sorlcur_camp_desc := gb_stvcamp.f_get_description(:sorlcur_camp_code);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_CAMP_CODE")
		public void sorlcurCampCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurCampCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvcamp.fCodeExists(sorlcurElement.getSorlcurCampCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0372"), toStr("FORM"), toStr("*ERROR* Invalid campus code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_COLL_CODE")
		public void sorlcurCollCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_COLL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurCollCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurCollCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_COLL_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurCollCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.G$_SEARCH_OPTIONS
		 if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 

  execute_trigger('college_options');
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurCollCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					executeAction("college_options");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.COLLEGE_OPTIONS
		 GO_ITEM('SORLCUR_COLL_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 


G$_KEY_OPT_MENU('SORLCUR_COLL_CODE', G$_NLS.Get('SOQOLIB-0373', 'FORM','All College Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0374', 'FORM','Base Curriculum Rules by College') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0375', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                                    '','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.COLLEGE_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COLLEGE_OPTIONS")
		public void sorlcurCollCode_CollegeOptions()
		{
			
				goItem(toStr("SORLCUR_COLL_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_COLL_CODE"), GNls.Fget(toStr("SOQOLIB-0373"), toStr("FORM"), toStr("All College Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0374"), toStr("FORM"), toStr("Base Curriculum Rules by College")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0375"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
if :sorlcur_coll_code is null then 
	:sorlcur_coll_desc := '';
end if;
--
IF nvl(:sorlcur_coll_code,'%') <> nvl(:change_coll_code,'%') THEN

    if :lcur_sobctrl_curr_rule_ind = 'Y' then
    	 :sorlcur_curr_rule := null;
    	 execute_trigger('lcur_check_program');
    
    end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_COLL_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurCollCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				if ( sorlcurElement.getSorlcurCollCode().isNull() )
				{
					sorlcurElement.setSorlcurCollDesc(toStr(""));
				}
				// 
				if ( isNull(sorlcurElement.getSorlcurCollCode(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeCollCode(), "%")) )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						executeAction("lcur_check_program");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.KEY-HELP
		 IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
:global.sel_ind := '';
:lcur_process := 'SORLCUR_COLL_CODE';
execute_trigger('lcur_program_help');
g$_check_failure;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_COLL_CODE", function=KeyFunction.HELP)
		public void sorlcurCollCode_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_COLL_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.KEY-LISTVAL
		  
--execute_trigger('check_reg_ind');
--g$_check_failure;
--
if :sovlcur_rowid is not null 
 AND :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
  set_item_property('SORLCUR_COLL_CODE', LOV_NAME, 'STVCOLL_LOV');
  g$_display_lov('','');
  if :global.value is not null then 
	 :sorlcur_coll_code := :global.value;
  end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_COLL_CODE", function=KeyFunction.LIST_VALUES)
		public void sorlcurCollCode_ListValues()
		{
			
				// execute_trigger('check_reg_ind');
				// g$_check_failure;
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// execute_trigger('check_reg_ind');
				// g$_check_failure;
				// 
				if ( !sorlcurElement.getSovlcurRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					setItemLovName("SORLCUR_COLL_CODE", "STVCOLL_LOV");
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !getGlobal("VALUE").isNull() )
					{
						sorlcurElement.setSorlcurCollCode(getGlobal("VALUE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.KEY-CQUERY
		 if :sovlcur_rowid is not null 
	OR :SYSTEM.MODE = 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
ELSE  
  :lcur_process := 'SORLCUR_COLL_CODE';
  execute_trigger('lcur_sorcurr_change');
  g$_check_failure;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_COLL_CODE", function=KeyFunction.COUNT_QUERY)
		public void sorlcurCollCode_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() || getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_COLL_CODE"));
					executeAction("lcur_sorcurr_change");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.PRE-TEXT-ITEM
		 :change_coll_code := :sorlcur_coll_code;
set_item_property('SORLCUR_COLL_CODE',LOV_NAME,'STVCOLL_LOV');
--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
   end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_COLL_CODE", function=KeyFunction.ITEM_IN)
		public void sorlcurCollCode_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurricula().setChangeCollCode(sorlcurElement.getSorlcurCollCode());
				setItemLovName("SORLCUR_COLL_CODE", "STVCOLL_LOV");
				// 
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_coll_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvcoll.f_code_exists(:sorlcur_coll_code);
	:sorlcur_coll_desc := gb_stvcoll.f_get_description(:sorlcur_coll_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0376', 'FORM','*ERROR* Invalid college code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_COLL_CODE")
		public void sorlcurCollCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurCollCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvcoll.fCodeExists(sorlcurElement.getSorlcurCollCode());
					sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0376"), toStr("FORM"), toStr("*ERROR* Invalid college code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_DEGC_CODE")
		public void sorlcurDegcCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_DEGC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurDegcCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_DEGC_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurDegcCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.G$_SEARCH_OPTIONS
		 if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 
  execute_trigger('degree_options');
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurDegcCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					executeAction("degree_options");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.DEGREE_OPTIONS
		 
GO_ITEM('SORLCUR_DEGC_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));

G$_KEY_OPT_MENU('SORLCUR_DEGC_CODE', G$_NLS.Get('SOQOLIB-0377', 'FORM','All Degree Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0378', 'FORM','Base Curriculum Rules by Degree') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0379', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                                    '','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.DEGREE_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DEGREE_OPTIONS")
		public void sorlcurDegcCode_DegreeOptions()
		{
			
				goItem(toStr("SORLCUR_DEGC_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_DEGC_CODE"), GNls.Fget(toStr("SOQOLIB-0377"), toStr("FORM"), toStr("All Degree Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0378"), toStr("FORM"), toStr("Base Curriculum Rules by Degree")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0379"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
if :sorlcur_degc_code is null then 
	:sorlcur_degc_desc := '';
end if;

--
IF nvl(:sorlcur_degc_code,'%') <> nvl(:change_degc_code,'%') THEN
   

    if :lcur_sobctrl_curr_rule_ind = 'Y' then
    	 :sorlcur_curr_rule := null;
    	 execute_trigger('lcur_check_program');
    
    end if;
end if;  

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_DEGC_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurDegcCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				if ( sorlcurElement.getSorlcurDegcCode().isNull() )
				{
					sorlcurElement.setSorlcurDegcDesc(toStr(""));
				}
				// 
				if ( isNull(sorlcurElement.getSorlcurDegcCode(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeDegcCode(), "%")) )
				{
					if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
					{
						sorlcurElement.setSorlcurCurrRule(toNumber(null));
						executeAction("lcur_check_program");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.KEY-HELP
		  --
IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
:global.sel_ind := '';
:lcur_process := 'SORLCUR_DEGC_CODE';
execute_trigger('lcur_program_help');
g$_check_failure;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_DEGC_CODE", function=KeyFunction.HELP)
		public void sorlcurDegcCode_Help()
		{
			
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// 
				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.Help();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else {
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_DEGC_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.KEY-LISTVAL
		  
 if :sovlcur_rowid is not null 
	AND :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
ELSE 
  set_item_property('SORLCUR_DEGC_CODE', LOV_NAME, 'STVDEGC_LOV');
  g$_display_lov('','');
  if :global.value is not null then 
	 :sorlcur_degc_code := :global.value;
  end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_DEGC_CODE", function=KeyFunction.LIST_VALUES)
		public void sorlcurDegcCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					setItemLovName("SORLCUR_DEGC_CODE", "STVDEGC_LOV");
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					if ( !getGlobal("VALUE").isNull() )
					{
						sorlcurElement.setSorlcurDegcCode(getGlobal("VALUE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.KEY-CQUERY
		 if :sovlcur_rowid is not null 
	OR :SYSTEM.MODE = 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
  :lcur_process := 'SORLCUR_DEGC_CODE';
  execute_trigger('lcur_sorcurr_change');
  g$_check_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_DEGC_CODE", function=KeyFunction.COUNT_QUERY)
		public void sorlcurDegcCode_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() || getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_DEGC_CODE"));
					executeAction("lcur_sorcurr_change");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.PRE-TEXT-ITEM
		 :change_degc_code := :sorlcur_degc_code;
set_item_property('SORLCUR_DEGC_CODE',LOV_NAME,'STVDEGC_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
   end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_DEGC_CODE", function=KeyFunction.ITEM_IN)
		public void sorlcurDegcCode_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getFormModel().getSCurricula().setChangeDegcCode(sorlcurElement.getSorlcurDegcCode());
				setItemLovName("SORLCUR_DEGC_CODE", "STVDEGC_LOV");
				// 
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
					{
						sorlcurElement.setSorlcurTermCodeCtlg(sorlcurElement.getSorlcurTermCode());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_degc_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvdegc.f_code_exists(:sorlcur_degc_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0380', 'FORM','*ERROR* Invalid degree code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	 	:sorlcur_degc_desc := gb_stvdegc.f_get_description(:sorlcur_degc_code);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_DEGC_CODE")
		public void sorlcurDegcCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurDegcCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvdegc.fCodeExists(sorlcurElement.getSorlcurDegcCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0380"), toStr("FORM"), toStr("*ERROR* Invalid degree code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_KEY_SEQNO")
		public void sorlcurKeySeqno_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_KEY_SEQNO", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurKeySeqno_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurKeySeqno_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_KEY_SEQNO", function=KeyFunction.NEXT_ITEM)
		public void sorlcurKeySeqno_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_KEY_SEQNO", function=KeyFunction.ITEM_OUT)
		public void sorlcurKeySeqno_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('sgvstsp_key_seqno','sgvstsp_name',  
     ' where sgvstsp_pidm = :pidm
        and sgvstsp_enroll_ind =  ''Y''  
        and sgvstsp_term_code_eff = ( select max(m.sgrstsp_term_code_eff)
     from sgrstsp m
     where m.sgrstsp_pidm = sgvstsp_pidm 
      and m.sgrstsp_key_seqno = sgvstsp_key_seqno 
      and m.sgrstsp_term_code_eff <=  :global.term_code )');  
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurKeySeqno_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("sgvstsp_key_seqno"), toStr("sgvstsp_name"), toStr(" where sgvstsp_pidm = :pidm\n        and sgvstsp_enroll_ind =  'Y'  \n        and sgvstsp_term_code_eff = ( select max(m.sgrstsp_term_code_eff)\n     from sgrstsp m\n     where m.sgrstsp_pidm = sgvstsp_pidm \n      and m.sgrstsp_key_seqno = sgvstsp_key_seqno \n      and m.sgrstsp_term_code_eff <=  :global.term_code )"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.POST-CHANGE
		 
if :sorlcur_lmod_code <> sb_curriculum_str.f_learner or 
 :sorlcur_key_seqno is null or :sorlcur_key_seqno = 99 
  or :sovlcur_rowid is not null 
	then return;
end if;
declare 
	lv_study_paths_exists varchar2(1) := 'n'; 
	cursor find_sp_c is 
	   select 'Y' 
	   from  sgrstsp 
	   where sgrstsp_pidm = :sorlcur_pidm
	   and sgrstsp_key_seqno = :sorlcur_key_seqno 
	   and sgrstsp_term_code_eff = ( select max(m.sgrstsp_term_code_eff)
	       from sgrstsp m where m.sgrstsp_pidm = sgrstsp.sgrstsp_pidm
	          and m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno
	          and m.sgrstsp_term_code_eff <= :sorlcur_term_code) ;
begin 

   open find_sp_c;
   fetch find_sp_c into lv_study_paths_exists;
   if find_sp_c%notfound then 
   	  close find_sp_c;
   		message( G$_NLS.Get('SOQOLIB-0381', 'FORM','*ERROR* Invalid study path key sequence.') );
    	raise form_trigger_failure;
   end if;
   close find_sp_c;
end; 
 
 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_KEY_SEQNO")
		public void sorlcurKeySeqno_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


				int rowCount = 0;
				if(sorlcurLiteElement.getSorlcurKeySeqno().isNull())
		return;
				if ( sorlcurElement.getSorlcurLmodCode().notEquals(SbCurriculumStr.fLearner()) || sorlcurElement.getSorlcurKeySeqno().isNull() || sorlcurElement.getSorlcurKeySeqno().equals(99) || !sorlcurElement.getSovlcurRowid().isNull() )
				{
					return ;
				}
				{
					NString lvStudyPathsExists = toStr("n");
					String sqlfindSpC = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_PIDM AND sgrstsp_key_seqno = :SORLCUR_KEY_SEQNO AND sgrstsp_term_code_eff = (SELECT max(m.sgrstsp_term_code_eff) " +
		" FROM sgrstsp m " +
		" WHERE m.sgrstsp_pidm = sgrstsp.sgrstsp_pidm AND m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno AND m.sgrstsp_term_code_eff <= :SORLCUR_TERM_CODE ) ";
					DataCursor findSpC = new DataCursor(sqlfindSpC);
					try {
						//Setting query parameters
						findSpC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						findSpC.addParameter("SORLCUR_KEY_SEQNO", sorlcurElement.getSorlcurKeySeqno());
						findSpC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findSpC.
						findSpC.open();
						ResultSet findSpCResults = findSpC.fetchInto();
						if ( findSpCResults != null ) {
							lvStudyPathsExists = findSpCResults.getStr(0);
						}
						if ( findSpC.notFound() )
						{
							findSpC.close();
							errorMessage(GNls.Fget(toStr("SOQOLIB-0381"), toStr("FORM"), toStr("*ERROR* Invalid study path key sequence.")));
							throw new ApplicationException();
						}
					} finally {
						findSpC.close();						
					}

				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.KEY-LISTVAL
		 --- list values 
:global.value := ''; 
   
if get_block_property('SORLCUR_LITE',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
end if;	
:global.term_code := :sorlcur_term_code;

declare  
	lv_study_paths_exists varchar2(1) := 'n'; 
	cursor find_sp_c is 
	   select 'Y' 
	   from sgrstsp 
	   where sgrstsp_pidm = :sorlcur_pidm
	     and sgrstsp_term_code_eff = ( select max(m.sgrstsp_term_code_eff)
	       from sgrstsp m where m.sgrstsp_pidm = sgrstsp.sgrstsp_pidm
	          and m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno
	          and m.sgrstsp_term_code_eff <= :sorlcur_term_code) ;
begin 
   :global.value := ''; 
   open find_sp_c;
   fetch find_sp_c into lv_study_paths_exists;
   if find_sp_c%notfound then 
   	   lv_study_paths_exists := 'N'; 
   end if;
   close find_sp_c;
 
 
  
   if :sovlcur_rowid is null and ( :sorlcur_key_seqno is null or :sorlcur_key_seqno = 99 ) and
   	   lv_study_paths_exists = 'Y'   then 

      G$_DISPLAY_LOV('','');
      G$_CHECK_FAILURE;
--
      IF :GLOBAL.VALUE IS NOT NULL  THEN
         :sorlcur_key_seqno := :global.value; 
      END IF ;
   
   else 
   	 	message( G$_NLS.Get('SOQOLIB-0382', 'FORM','*ERROR* Study paths do not exist to attach the new learner curriculum.') );
    	raise form_trigger_failure;

   end if; 

end; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SORLCUR_KEY_SEQNO", function=KeyFunction.LIST_VALUES)
		public void sorlcurKeySeqno_ListValues()
		{
			
				// - list values 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				// - list values 
				setGlobal("VALUE", toStr(""));
				if ( getBlockInsertAllowed("SORLCUR_LITE").equals("FALSE") )
				{
					return ;
				}
				setGlobal("TERM_CODE", sorlcurElement.getSorlcurTermCode());
				{
					NString lvStudyPathsExists = toStr("n");
					String sqlfindSpC = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_PIDM AND sgrstsp_term_code_eff = (SELECT max(m.sgrstsp_term_code_eff) " +
		" FROM sgrstsp m " +
		" WHERE m.sgrstsp_pidm = sgrstsp.sgrstsp_pidm AND m.sgrstsp_key_seqno = sgrstsp.sgrstsp_key_seqno AND m.sgrstsp_term_code_eff <= :SORLCUR_TERM_CODE ) ";
					DataCursor findSpC = new DataCursor(sqlfindSpC);
					try {
						setGlobal("VALUE", toStr(""));
						//Setting query parameters
						findSpC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						findSpC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findSpC.
						findSpC.open();
						ResultSet findSpCResults = findSpC.fetchInto();
						if ( findSpCResults != null ) {
							lvStudyPathsExists = findSpCResults.getStr(0);
						}
						if ( findSpC.notFound() )
						{
							lvStudyPathsExists = toStr("N");
						}
					} finally {
						findSpC.close();
					}
					if ( sorlcurElement.getSovlcurRowid().isNull() && (sorlcurElement.getSorlcurKeySeqno().isNull() || sorlcurElement.getSorlcurKeySeqno().equals(99)) && lvStudyPathsExists.equals("Y") )
					{
						getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						getContainer().getGoqrpls().gCheckFailure();
						// 
						if ( !getGlobal("VALUE").isNull() )
						{
							sorlcurElement.setSorlcurKeySeqno(toNumber(getGlobal("VALUE")));
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("SOQOLIB-0382"), toStr("FORM"), toStr("*ERROR* Study paths do not exist to attach the new learner curriculum.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_CACT_CODE")
		public void sorlcurCactCode_WhenMouseDoubleclick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_CACT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurCactCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_CACT_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurCactCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_CACT_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurCactCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CACT_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('STVCACT_CODE','STVCACT_DESC','');
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurCactCode_GSearchParameters()
		{
			
				getContainer().getGoqrpls().getGSearch().parameters(toStr("STVCACT_CODE"), toStr("STVCACT_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CACT_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_cact_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcact.f_code_exists(:sorlcur_cact_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0383', 'FORM','*ERROR* Invalid curriculum activity status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CACT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_CACT_CODE")
		public void sorlcurCactCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurCactCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvcact.fCodeExists(sorlcurElement.getSorlcurCactCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0383"), toStr("FORM"), toStr("*ERROR* Invalid curriculum activity status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ADMT_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_admt_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvadmt.f_code_exists(:sorlcur_admt_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0384', 'FORM','*ERROR* Invalid admissions type code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_ADMT_CODE")
		public void sorlcurAdmtCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


			this.sorlcurAdmtCode_PostChange();

				if ( sorlcurElement.getSorlcurAdmtCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvadmt.fCodeExists(sorlcurElement.getSorlcurAdmtCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0384"), toStr("FORM"), toStr("*ERROR* Invalid admissions type code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ADMT_CODE.POST-CHANGE
		 if :sorlcur_admt_desc is not null then 
	:sorlcur_admt_desc := sb_stvadmt.f_get_description(:sorlcur_admt_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_ADMT_CODE")
		public void sorlcurAdmtCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


				if(sorlcurLiteElement.getSorlcurAdmtCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurAdmtDesc().isNull() )
				{
					sorlcurElement.setSorlcurAdmtDesc(SbStvadmt.fGetDescription(sorlcurElement.getSorlcurAdmtCode()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_ADMIT.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_admit is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_admit);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0385', 'FORM','*ERROR* Invalid admissions term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_ADMIT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE_ADMIT")
		public void sorlcurTermCodeAdmit_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurTermCodeAdmit().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeAdmit());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0385"), toStr("FORM"), toStr("*ERROR* Invalid admissions term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_MATRIC.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_matric is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_matric);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0386', 'FORM','*ERROR* Invalid matriculation term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_MATRIC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE_MATRIC")
		public void sorlcurTermCodeMatric_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurTermCodeMatric().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeMatric());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0386"), toStr("FORM"), toStr("*ERROR* Invalid matriculation term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_end is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_end);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0387', 'FORM','*ERROR* Invalid end term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE_END")
		public void sorlcurTermCodeEnd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( sorlcurElement.getSorlcurTermCodeEnd().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeEnd());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0387"), toStr("FORM"), toStr("*ERROR* Invalid end term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_KEY_SEQNO_LBT")
		public void sorlcurKeySeqnoLbt_click()
		{
			
				getGIconBtnClass().click();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM_LBT.WHEN-BUTTON-PRESSED
		 IF :system.current_block <> 'SORLCUR_LITE' THEN
	RETURN;
END IF;

GO_ITEM('SORLCUR_PROGRAM');
execute_trigger('program_options');
g$_check_failure;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_PROGRAM_LBT")
		public void sorlcurProgramLbt_buttonClick()
		{
			
				if ( getCurrentBlock().notEquals("SORLCUR_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLCUR_PROGRAM"));
				executeAction("program_options");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE_LBT.WHEN-BUTTON-PRESSED
		 
IF :system.current_block <> 'SORLCUR_LITE' THEN
	RETURN;
END IF;

GO_ITEM('SORLCUR_LEVL_CODE');
execute_trigger('level_options');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_LEVL_CODE_LBT")
		public void sorlcurLevlCodeLbt_buttonClick()
		{
			
				if ( getCurrentBlock().notEquals("SORLCUR_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLCUR_LEVL_CODE"));
				executeAction("level_options");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE_LBT.WHEN-BUTTON-PRESSED
		 
IF :system.current_block <> 'SORLCUR_LITE' THEN
	RETURN;
END IF;
GO_ITEM('SORLCUR_COLL_CODE');
execute_trigger('college_options');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_COLL_CODE_LBT")
		public void sorlcurCollCodeLbt_buttonClick()
		{
			
				if ( getCurrentBlock().notEquals("SORLCUR_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLCUR_COLL_CODE"));
				executeAction("college_options");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE_LBT.WHEN-MOUSE-CLICK
		 begin
	null; 
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_DEGC_CODE_LBT")
		public void sorlcurDegcCodeLbt_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE_LBT.WHEN-BUTTON-PRESSED
		 
IF :system.current_block <> 'SORLCUR_LITE' THEN
	RETURN;
END IF;
GO_ITEM('SORLCUR_DEGC_CODE');
execute_trigger('degree_options');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_DEGC_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_DEGC_CODE_LBT")
		public void sorlcurDegcCodeLbt_buttonClick()
		{
			
				if ( getCurrentBlock().notEquals("SORLCUR_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLCUR_DEGC_CODE"));
				executeAction("degree_options");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE_LBT.WHEN-BUTTON-PRESSED
		 IF :system.current_block <> 'SORLCUR_LITE' THEN
	RETURN;
END IF;
GO_ITEM('SORLCUR_CAMP_CODE');
execute_trigger('campus_options');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_CAMP_CODE_LBT")
		public void sorlcurCampCodeLbt_buttonClick()
		{
			
				if ( getCurrentBlock().notEquals("SORLCUR_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLCUR_CAMP_CODE"));
				executeAction("campus_options");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0388', 'FORM','*ERROR* Date button is outside the current block.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
  GO_ITEM(CURRENT_BLOCK_FLD);
  G$_CHECK_FAILURE; 
--
  COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
  IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
    IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
       (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
        NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
       (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    ELSE
      MESSAGE( G$_NLS.Get('SOQOLIB-0389', 'FORM','*ERROR* Item is protected against update.') );              
    END IF;  
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_START_DATE_DBT")
		public void sorlcurStartDateDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0388"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					goItem(currentBlockFld);
					getContainer().getGoqrpls().gCheckFailure();
					// 
					copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
					executeAction("G$_REVOKE_ACCESS");
					getContainer().getGoqrpls().gCheckFailure();
					getContainer().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
					if ( !getNameIn("GLOBAL.VALUE").isNull() )
					{
						// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
						if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
						{
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction("NEXT_ITEM");
						}
						else {
							errorMessage(GNls.Fget(toStr("SOQOLIB-0389"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_END_DATE_DBT")
		public void sorlcurEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_END_DATE_DBT")
		public void sorlcurEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_REC_BTN.WHEN-BUTTON-PRESSED
		 do_key('next_record'); 
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_REC_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NEXT_REC_BTN")
		public void nextRecBtn_buttonClick()
		{
			
				executeAction("NEXT_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PREV_RECORD_BTN.WHEN-BUTTON-PRESSED
		 do_key('previous_record'); 
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREV_RECORD_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREV_RECORD_BTN")
		public void prevRecordBtn_buttonClick()
		{
			
				executeAction("PREVIOUS_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_KEY_SEQNO")
		public void sorlcurKeySeqno_validate()
		{
			
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);
							this.sorlcurKeySeqno_PostChange();

			}

		
	
	
}

