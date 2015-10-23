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
import net.hedtech.general.common.libraries.Soqolib.services.Exceptions.InvalidCurriculum;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SorlfosLiteController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SorlfosLiteController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-CLRBLK
		 :system.message_level := '5'; 

clear_block(no_validate);
execute_query;
 
:system.message_level := '0'; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sorlfosLite_keyClearBlock()
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-EXIT
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
              	message( G$_NLS.Get('SOQOLIB-0390', 'FORM','There were errors and your changes could not be saved.') );  
              	raise form_trigger_failure;
            end if; 
            do_key('commit_form');
            g$_check_failure;
        Else 
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
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    
END; 


 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sorlfosLite_Exit()
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
							getContainer().getGoqrpls().gCheckFailure();
							if ( SupportClasses.SQLFORMS.FormSuccess().not() )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								errorMessage(GNls.Fget(toStr("SOQOLIB-0390"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
								throw new ApplicationException();
							}
							executeAction("SAVE");
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
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
					getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-CLRFRM
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
              	message( G$_NLS.Get('SOQOLIB-0391', 'FORM','There were errors and your changes could not be saved.') );  
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
   G$_CHECK_FAILURE ;
   execute_trigger('enable_curriculum'); 
   g$_check_failure;
   EXECUTE_TRIGGER('DISABLE_TABS');
   G$_CHECK_FAILURE ;
	
--   go_item(save_return);
    
END; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void sorlfosLite_ClearTask()
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
							getContainer().getGoqrpls().gCheckFailure();
							if ( SupportClasses.SQLFORMS.FormSuccess().not() )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								errorMessage(GNls.Fget(toStr("SOQOLIB-0391"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
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
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
					executeAction("DISABLE_TABS");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-COMMIT
		 :dup_create_ind := 'N'; 

if :system.current_item like '%SORLFOS_MAJR_CODE'
	THEN 
	next_item;
end if; 
validate(block_scope); 
g$_check_failure;
-- test the commit for nulls and other errors 
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

-- validate primary major exists and number does not exceed whats on soblmod
execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
g$_check_failure;

if not form_success then
	message( G$_NLS.Get('SOQOLIB-0392', 'FORM','There were errors and your changes could not be saved.') );  
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
		 * SORLFOS_LITE.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sorlfosLite_Save()
		{
			
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				if ( like(getCurrentItem(), "%SORLFOS_MAJR_CODE") )
				{
					nextItem();
				}
				validateTask(SupportClasses.Constants.BLOCK_SCOPE);
				getContainer().getGoqrpls().gCheckFailure();
				//  test the commit for nulls and other errors 
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
				//  validate primary major exists and number does not exceed whats on soblmod
				executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
				getContainer().getGoqrpls().gCheckFailure();
				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					errorMessage(GNls.Fget(toStr("SOQOLIB-0392"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-NXTBLK
		 
if  get_block_property('SORLCUR_LITE',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS_LITE',STATUS) = 'CHANGED' THEN
			message( G$_NLS.Get('SOQOLIB-0393', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
end if; 
hide_view('curricula_lite_canvas');
execute_trigger('enable_curriculum'); 
g$_check_failure;
go_item(:return_from_sorlcur); 
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sorlfosLite_NextBlock()
		{
			
				if ( getBlockStatus("SORLCUR_LITE").equals("CHANGED") || getBlockStatus("SORLFOS_LITE").equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0393"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
					throw new ApplicationException();
				}
				hideView("curricula_lite_canvas");
				executeAction("enable_curriculum");
				getContainer().getGoqrpls().gCheckFailure();
				goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-EDIT
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
		 * SORLFOS_LITE.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sorlfosLite_KeyEdit()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOACURR"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-CREREC
		 execute_trigger('query_only');
g$_check_failure;
if :sorlcur_lite.sovlcur_current_ind = 'N' then 
	message( G$_NLS.Get('SOQOLIB-0394', 'FORM','Insert not allowed for non current base curriculum.') );
	return;
end if;

if :sorlcur_lite.sorlcur_term_code <> :s$_curricula.module_term_code 
	and :sorlcur_lite.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
	 message(G$_NLS.Get('SOQOLIB-0395', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
else
 if :s$_curricula.module_insert_restriction is not null then 
	         message(:s$_curricula.module_insert_restriction);
 else 
	if :s$_curricula.module_insert_warning is not null then 
	         message(:s$_curricula.module_insert_warning);
	end if; 
  create_record;
  :dup_create_ind := 'Y'; 
  execute_trigger('new_sorlfos');
  g$_check_failure;
  end if; 
 end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sorlfosLite_CreateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( sorlcurLiteElement.getSovlcurCurrentInd().equals("N") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0394"), toStr("FORM"), toStr("Insert not allowed for non current base curriculum.")));
					return ;
				}
				if ( sorlcurLiteElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurLiteElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0395"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
					}
					else {
						if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
						{
							warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
						}
						createRecord();
						getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
						executeAction("new_sorlfos");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-NXTREC
		  
	
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 

	IF :System.Last_Record <> 'TRUE' THEN 
 	  execute_trigger('check_for_lfos_nulls');
   g$_check_failure;
	 next_Record;
 	 g$_check_failure;
	ELSE 
		 execute_trigger('query_only');
    g$_check_failure;
		if :sorlcur_lite.sovlcur_current_ind = 'N'    	then  
	  	Message( G$_NLS.Get('SOQOLIB-0396', 'FORM','At last record.') ); 
		else
			if :sorlcur_lite.sorlcur_term_code <> :s$_curricula.module_term_code 
       	and :sorlcur_lite.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
     		 message(G$_NLS.Get('SOQOLIB-0397', 'FORM','Insert not allowed for this term, create new base curriculum with current term.') );
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
		    :dup_create_ind := 'Y'; 
		    execute_trigger('new_sorlfos');
		    g$_check_failure;
	   end if; 
	  end if;
	END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sorlfosLite_NextRecord()
		{
			
				//  ** If we're not at the bottom, then go to the last record 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);


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
					if ( sorlcurLiteElement.getSovlcurCurrentInd().equals("N") )
					{
						infoMessage(GNls.Fget(toStr("SOQOLIB-0396"), toStr("FORM"), toStr("At last record.")));
					}
					else {
						if ( sorlcurLiteElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) && sorlcurLiteElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0397"), toStr("FORM"), toStr("Insert not allowed for this term, create new base curriculum with current term.")));
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
							getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
							executeAction("new_sorlfos");
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-DUPREC
		 
if nvl(:dup_create_ind,'N') <>  'Y' then 
	message( G$_NLS.Get('SOQOLIB-0398', 'FORM','Insert record to duplicate record into.') );
	raise form_trigger_failure;
end if; 


 
duplicate_record;

--:sorlfos_cact_code := null;
--:sorlfos_csts_code := null;
:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
:sorlfos_seqno :=  :sorlfos_seqno_cnt;
:sorlfos_rolled_seqno := null;
:sorlfos_current_ind := null;
:sovlfos_rowid := null;
:dup_create_ind := 'N'; 
:sorlfos_lfos_rule := null; 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sorlfosLite_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( isNull(getFormModel().getSCurricula().getDupCreateInd(), "N").notEquals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0398"), toStr("FORM"), toStr("Insert record to duplicate record into.")));
					throw new ApplicationException();
				}
				duplicateRecord();
				// :sorlfos_cact_code := null;
				// :sorlfos_csts_code := null;
				sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
				sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
				sorlfosElement.setSorlfosRolledSeqno(toNumber(null));
				sorlfosElement.setSorlfosCurrentInd(toStr(null));
				sorlfosElement.setSovlfosRowid(toStr(null));
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				sorlfosElement.setSorlfosLfosRule(toNumber(null));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-DELREC
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

delete sotlfos 
 where sotlfos_pidm =   :s$_curricula.module_pidm
       and sotlfos_lcur_seqno = nvl(:sorlcur_seqno,999)
       and sotlfos_seqno = nvl(:sorlfos_seqno,999);
       
:lfos_delete_ind := 'Y'; 
if :sovlfos_rowid is not null then
	 :commplan_delete_trigger := 'Y'; 
end if; 
IF :System.Last_Record <> 'TRUE' THEN 
	if :sovlfos_rowid is null then 
	  :sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt - 1;
	end if;
  delete_record;
else
	if :system.cursor_record = 1 then 
   :s$_curricula.sorlfos_del_ind := 'Y'; 
   :dup_create_ind := 'N'; 
   :sorlfos_seqno_cnt := 1;
 	 delete_record;
   go_block('sorlcur_lite');
   g$_check_failure;
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
		 * SORLFOS_LITE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sorlfosLite_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
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
				String sql1 = "DELETE FROM sotlfos " +
	" WHERE sotlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sotlfos_lcur_seqno = nvl(:SORLCUR_SEQNO, 999) AND sotlfos_seqno = nvl(:SORLFOS_SEQNO, 999)";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
				command1.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
				command1.addParameter("SORLFOS_SEQNO", sorlfosElement.getSorlfosSeqno());
				rowCount = command1.execute();
				sorlfosElement.setLfosDeleteInd(toStr("Y"));
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				}
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
						sorlcurElement.setSorlfosSeqnoCnt(toNumber(1));
						deleteRecord();
						goBlock(toStr("sorlcur_lite"));
						getContainer().getGoqrpls().gCheckFailure();
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-PRVBLK
		  if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;
 execute_trigger('check_for_lfos_nulls');
 g$_check_failure;
go_block('SORLCUR_LITE'); 
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sorlfosLite_PreviousBlock()
		{
			
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				executeAction("check_for_lfos_nulls");
				getContainer().getGoqrpls().gCheckFailure();
				goBlock(toStr("SORLCUR_LITE"));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.KEY-PRVREC
		  
  IF :SYSTEM.LAST_RECORD = 'TRUE' AND 
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
		 * SORLFOS_LITE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sorlfosLite_PreviousRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( isInLastRecord() && sorlfosElement.getSovlfosRowid().isNull() && sorlfosElement.getSorlfosPriorityNo().isNull() && sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSorlfosLfstCode().isNull() && !getRecordStatus().equals("CHANGED") )
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.PRE-INSERT
		 if :sorlfos_cact_code is  null then 
   :sorlfos_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlfos_term_code is null then 
  :sorlfos_term_code := :sorlcur_term_code;
end if; 
if :sorlfos_csts_code is null then 
  :sorlfos_csts_code := :s$_curricula.default_csts;
end if; 
--if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlfos_cact_code) = 'N' then
--	 :commplan_delete_trigger := 'I';
--end if; 
 --F2J_TODO: Change global current_user01 to current_user
:sorlfos_user_id := :global.current_user01; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sorlfosLite_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
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
				// if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlfos_cact_code) = 'N' then
				// 	 :commplan_delete_trigger := 'I';
				// end if; 
				// F2J_TODO: Change global current_user01 to current_user
				sorlfosElement.setSorlfosUserId(getGlobal("CURRENT_USER01"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.ON-INSERT
		  
--
-- ON-INSERT Trigger
--
DECLARE
	  alert_button number;
   alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
   cem_msg varchar2(2000) := ''; 
   lfos_seqno  sorlfos.sorlfos_seqno%TYPE := 0; 

   invalid_curriculum EXCEPTION;
   major_dept_msg   varchar2(200) := null; 
   lfos_rec    sorlfos%rowtype;
   BEGIN
  SB_FIELDOFSTUDY.P_CREATE(
     p_PIDM                   =>:SORLCUR_PIDM,
     p_LCUR_SEQNO             =>:SORLCUR_SEQNO,
     p_SEQNO                  => :sorlfos_seqno, ---- NULL,
     p_LFST_CODE              =>:SORLFOS_LFST_CODE,
     p_TERM_CODE              =>:SORLFOS_TERM_CODE,
     p_PRIORITY_NO            =>:SORLFOS_PRIORITY_NO,
     p_CSTS_CODE              =>:SORLFOS_CSTS_CODE,
     p_CACT_CODE              =>:SORLFOS_CACT_CODE,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_USER_ID                => :sorlfos_user_id,
     p_MAJR_CODE              =>:SORLFOS_MAJR_CODE,
     p_TERM_CODE_CTLG         =>:SORLFOS_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLFOS_TERM_CODE_END,
     p_DEPT_CODE              =>:SORLFOS_DEPT_CODE,
     p_LFOS_RULE              =>:SORLFOS_LFOS_RULE,
     p_CONC_ATTACH_RULE       =>:SORLFOS_CONC_ATTACH_RULE,
     p_START_DATE             =>:SORLFOS_START_DATE,
     p_END_DATE               =>:SORLFOS_END_DATE,
     p_TMST_CODE              =>:SORLFOS_TMST_CODE,
     P_MAJR_CODE_ATTACH       => :sorlfos_majr_code_attach,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              =>:sorlfos_lite.ROWID,
     p_curr_error_out          => :lfos_curr_error,
     p_override_severity      => 'F',
     p_severity_out           => :lfos_severity_out,
     p_lfos_seqno_out         => lfos_seqno,
     p_USER_ID_UPDATE         => :sorlfos_user_id);
--

	 :SORLFOS_ACTIVITY_DATE := 
				TO_DATE(G$_RESYNCH_RECORD(:SORLFOS_LITE.ROWID),'DDMONYYYYHH24MISS');
   select * into lfos_rec from sorlfos
   where  sorlfos.rowid = :sorlfos_lite.rowid;
   if sql%notfound then 
   	 null;
   end if;
   :SORLFOS_ACTIVITY_DATE := lfos_rec.sorlfos_activity_date;
   :sovlfos_rowid := :sorlfos_lite.rowid;
  -- show curriculum warning only once
   if :lcur_sobctrl_curr_rule_ind = 'Y' and :lcur_temp_rule_ind = 'Y' and 
      (:sorlfos_lite.lfos_curr_error is not null 
      and :sorlfos_lite.lfos_curr_error > 0 )   
      and  (( :curric_warning is null and :sorlfos_lite.lfos_severity_out = 'W' ) OR 
   	    :sorlfos_lite.lfos_severity_out = 'F' )  then 
	   
  
	   major_dept_msg := ': ' || :sorlfos_majr_code;
	   if :sorlfos_dept_code is not null then 
	   	 major_dept_msg := major_dept_msg || ' Department: ' || :sorlfos_dept_code;
	   end if; 
	   cem_msg :=  sokcmsg.F_SorlcurErrorMsg(:sorlfos_lite.lfos_severity_out, 'V',
	   	                          :sorlfos_lite.lfos_curr_error)   || major_dept_msg ;

	  	   
	   if :lfos_severity_out = 'F' then 
	   	 raise invalid_curriculum;
	   elsif :lfos_severity_out = 'W' then  
	    	Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	      alert_button := show_alert('CURRICULUM_ERROR');
	 
	      if alert_button = ALERT_BUTTON1 then
	        null;
	      end if;
	   	 :lfos_warning := :lfos_curr_error;
	   end if;
   end if;  
   
EXCEPTION
  WHEN invalid_curriculum then
       Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	     alert_button := show_alert('CURRICULUM_ERROR');
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
		 * SORLFOS_LITE.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sorlfosLite_RowInsert(RowAdapterEvent args)
		{
			
				// 
				//  ON-INSERT Trigger
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)args.getRow();


				int rowCount = 0;
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString cemMsg = toStr("");
					NNumber lfosSeqno = toNumber(0);
					NString majorDeptMsg = NString.getNull();
					SorlfosRow lfosRec= null;
					try
					{
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>(sorlfosLiteElement.getLfosCurrError());
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>(toNumber("F"));
						Ref<NString> p_severity_out_ref = new Ref<NString>(sorlfosLiteElement.getLfosSeverityOut());
						Ref<NNumber> p_lfos_seqno_out_ref = new Ref<NNumber>(lfosSeqno);
						SbFieldofstudy.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pTermCode=>*/sorlfosElement.getSorlfosTermCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pCstsCode=>*/sorlfosElement.getSorlfosCstsCode(), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/sorlfosElement.getSorlfosUserId(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg(), /*pTermCodeEnd=>*/sorlfosElement.getSorlfosTermCodeEnd(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(), /*pLfosRule=>*/sorlfosElement.getSorlfosLfosRule(), /*pConcAttachRule=>*/sorlfosElement.getSorlfosConcAttachRule(), /*pStartDate=>*/sorlfosElement.getSorlfosStartDate(), /*pEndDate=>*/sorlfosElement.getSorlfosEndDate(), /*pTmstCode=>*/sorlfosElement.getSorlfosTmstCode(), /*pMajrCodeAttach=>*/sorlfosElement.getSorlfosMajrCodeAttach(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/sorlfosLiteElement.getROWID(), p_rowid_out_ref, p_curr_error_out_ref, p_severity_out_ref, p_lfos_seqno_out_ref, /*pUserIdUpdate=>*/sorlfosElement.getSorlfosUserId());
						sorlfosLiteElement.setLfosCurrError(p_rowid_out_ref.val);
						"F" = p_curr_error_out_ref.val;
						sorlfosLiteElement.setLfosSeverityOut(p_severity_out_ref.val);
						lfosSeqno = p_lfos_seqno_out_ref.val;
						// 
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						sorlfosElement.setSorlfosActivityDate(toDate(getContainer().getGoqrpls().gResynchRecord(sorlfosLiteElement.getROWID()), "DDMONYYYYHH24MISS"));
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						String sql1 = "SELECT * " +
	" FROM sorlfos " +
	" WHERE sorlfos.rowid = :SORLFOS_LITE_ROWID ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SORLFOS_LITE_ROWID", sorlfosLiteElement.getROWID());
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
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						sorlfosElement.setSovlfosRowid(sorlfosLiteElement.getROWID());
						//  show curriculum warning only once
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && getFormModel().getSCurricula().getLcurTempRuleInd().equals("Y") && (!sorlfosLiteElement.getLfosCurrError().isNull() && sorlfosLiteElement.getLfosCurrError().greater(0)) && ((sorlcurElement.getCurricWarning().isNull() && sorlfosLiteElement.getLfosSeverityOut().equals("W")) || sorlfosLiteElement.getLfosSeverityOut().equals("F")) )
						{
							majorDeptMsg = toStr(": ").append(sorlfosElement.getSorlfosMajrCode());
							if ( !sorlfosElement.getSorlfosDeptCode().isNull() )
							{
								majorDeptMsg = majorDeptMsg.append(" Department: ").append(sorlfosElement.getSorlfosDeptCode());
							}
							cemMsg = Sokcmsg.fSorlcurerrormsg(sorlfosLiteElement.getLfosSeverityOut(), toStr("V"), sorlfosLiteElement.getLfosCurrError()).append(majorDeptMsg);
							if ( sorlfosLiteElement.getLfosSeverityOut().equals("F") )
							{
								throw new InvalidCurriculum();
							}
							else if ( sorlfosLiteElement.getLfosSeverityOut().equals("W") ) {
								setAlertMessageText(alertId, cemMsg);
								alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
								sorlfosElement.setLfosWarning(sorlfosLiteElement.getLfosCurrError());
							}
						}
					}
					catch(InvalidCurriculum e)
					{
						setAlertMessageText(alertId, cemMsg);
						alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.ON-DELETE
		 --
-- ON-DELETE Trigger
--
	
BEGIN
	-- check if record still exists.  user may have deleted this,then
	-- deleted the sorlcur.  The sorlcur api will delete all its sorlfos
	-- children.
	IF (sb_fieldofstudy.f_exists(:SORLFOS_PIDM,
		  :SORLFOS_LCUR_SEQNO, :SORLFOS_SEQNO) ='N' ) THEN
		  RETURN;
  END IF;
	
  SB_FIELDOFSTUDY.P_DELETE(
     p_PIDM                   =>:SORLFOS_PIDM,
     p_LCUR_SEQNO             =>:SORLFOS_LCUR_SEQNO,
     p_SEQNO                  =>:SORLFOS_SEQNO,
     p_ROWID                  =>:sorlfos_lite.ROWID);
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
		 * SORLFOS_LITE.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void sorlfosLite_RowDelete(RowAdapterEvent args)
		{
			
				// 
				//  ON-DELETE Trigger
				// 
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);

				try
				{
					//  check if record still exists.  user may have deleted this,then
					//  deleted the sorlcur.  The sorlcur api will delete all its sorlfos
					//  children.
					if ((SbFieldofstudy.fExists(sorlfosElement.getSorlfosPidm(), sorlfosElement.getSorlfosLcurSeqno(), sorlfosElement.getSorlfosSeqno(),toStr(DbManager.getDataBaseFactory().rowidToString(sorlfosLiteElement.getROWID()))).equals("N")))
					{
						return ;
					}
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					SbFieldofstudy.pDelete(/*pPidm=>*/sorlfosElement.getSorlfosPidm(), /*pLcurSeqno=>*/sorlfosElement.getSorlfosLcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), /*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(sorlfosLiteElement.getROWID())));
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.ONLOCK
		 --  remove and use oracle locking
BEGIN
  SB_FIELDOFSTUDY.P_LOCK(
     p_PIDM                   =>:SORLFOS_PIDM,
     p_LCUR_SEQNO             =>:SORLFOS_LCUR_SEQNO,
     p_SEQNO                  =>:SORLFOS_SEQNO,
     p_ROWID_INOUT            =>:sorlfos_lite.ROWID);
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
		 * SORLFOS_LITE.ONLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ONLOCK")
		public void sorlfosLite_Onlock()
		{
			
				//   remove and use oracle locking

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlfosLiteAdapter  sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);

				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_rowid_inout_ref = new Ref<NString>(toStr(DbManager.getDataBaseFactory().rowidToString(sorlfosLiteElement.getROWID())));
					SbFieldofstudy.pLock(/*pPidm=>*/sorlfosElement.getSorlfosPidm(), /*pLcurSeqno=>*/sorlfosElement.getSorlfosLcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno(), p_rowid_inout_ref);
//					sorlfosLiteElement.getROWID();
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.POST-QUERY
		 begin
	:sorlfos_majr_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code);
	:sorlfos_dept_desc := gb_stvdept.f_get_description(:sorlfos_dept_code);
  :sorlfos_attach_conc_desc := gb_stvmajr.f_get_description(:sorlfos_majr_code_attach);

end;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sorlfosLite_AfterQuery(RowAdapterEvent args)
		{
			
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sorlfosLiteElement.setLockDbValues(true);
								this.sorlfosLfstCode_PostChange();

				} finally { 
					sorlfosLiteElement.setLockDbValues(false);
				}
				sorlfosElement.setSorlfosMajrDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCode()));
				sorlfosElement.setSorlfosDeptDesc(GbStvdept.fGetDescription(sorlfosElement.getSorlfosDeptCode()));
				sorlfosElement.setSorlfosAttachConcDesc(GbStvmajr.fGetDescription(sorlfosElement.getSorlfosMajrCodeAttach()));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.POST-BLOCK
		 
 :dup_create_ind := 'N'; 

 if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sorlfosLite_blockOut()
		{
			
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.WHEN-NEW-RECORD-INSTANCE
		  g$_check_query_mode;

if :system.current_item not like '%SORLFOS_%'
	and get_item_property(:system.current_item,enabled) = 'TRUE' then 
	  		null;
else 
			set_curric_properties('sorlfos_csts_code','enabled','property_true');
			set_curric_properties('sorlfos_majr_code','enabled','property_true');
			set_curric_properties('sorlfos_dept_code','enabled','property_true');
  --			set_curric_properties('sorlfos_priority_no','enabled','property_true');
	--		set_curric_properties('sorlfos_lfst_code','enabled','property_true');
 		  if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then  
  	 		set_curric_properties('sorlfos_majr_code_attach','enabled','property_true');
  	  end if;
			
			set_curric_properties('sorlfos_csts_code','navigable','property_true');
			set_curric_properties('sorlfos_majr_code','navigable','property_true');
			set_curric_properties('sorlfos_dept_code','navigable','property_true');
			set_curric_properties('sorlfos_priority_no','navigable','property_true');
			if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration then  
  	   	set_curric_properties('sorlfos_majr_code_attach','navigable','property_true');
  	  end if;
end if; 
if :sorlfos_lite.rowid is not null then 
	set_curric_properties('sorlfos_csts_code_lbt','enabled','property_false');
	set_curric_properties('sorlfos_majr_code_lbt','enabled','property_false');
	set_curric_properties('sorlfos_dept_code_lbt','enabled','property_false');
	set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_false');
	set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');

else
	set_curric_properties('sorlfos_csts_code_lbt','enabled','property_true');
	set_curric_properties('sorlfos_majr_code_lbt','enabled','property_true');
	set_curric_properties('sorlfos_dept_code_lbt','enabled','property_true');
	set_curric_properties('sorlfos_lfst_code_lbt','enabled','property_true');
	if :sorlfos_lfst_code = sb_fieldofstudy_str.f_concentration or 
		 :sorlfos_lfst_code is null then 
			  set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_true');
	else 
			  set_curric_properties('sorlfos_majr_code_attach_lbt','enabled','property_false');
			  set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');
	end if; 
 
  :sorlfos_pidm := :sorlcur_pidm;
  :sorlfos_lcur_seqno := :sorlcur_seqno;
  if :sorlfos_seqno is null then
     if :sorlfos_seqno_cnt is null then
		   	  :sorlfos_seqno_cnt := 1;
  	 else   
	    :sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
	   end if;  
     :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
   end if; -- lfos seqno is null 

 
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
      	  if :sorlfos_priority_no is null then 
		  	    :sorlfos_priority_no := :global.sobctrl_priority_no;
		      end if; 
    end if;
   if :sorlfos_majr_code is null and :sorlfos_lfst_code = sb_fieldofstudy_str.f_major then 
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
     end if; 

   if :sorlfos_term_code is null then 
      :sorlfos_term_code := :sorlcur_term_code;
   end if;
  
	end if; -- rowid is null 


 :default_options_ind := 'N';

 if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sorlfosLite_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( !like(getCurrentItem(), "%SORLFOS_%") && getItemEnabled(getCurrentItem()).equals("TRUE") )
				{
				}
				else {
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_true"));
					// 			set_curric_properties('sorlfos_priority_no','enabled','property_true');
					// 		set_curric_properties('sorlfos_lfst_code','enabled','property_true');
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_true"));
					}
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("navigable"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_priority_no"), toStr("navigable"), toStr("property_true"));
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("navigable"), toStr("property_true"));
					}
				}
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( !sorlfosLiteElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
				}
				else {
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlfos_lfst_code_lbt"), toStr("enabled"), toStr("property_true"));
					if ( sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()) || sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_true"));
					}
					else {
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
					}
					sorlfosElement.setSorlfosPidm(sorlcurElement.getSorlcurPidm());
					sorlfosElement.setSorlfosLcurSeqno(sorlcurElement.getSorlcurSeqno());
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
					//  lfos seqno is null 
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
						if ( sorlfosElement.getSorlfosPriorityNo().isNull() )
						{
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
						}
					}
					if ( sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMajor()) )
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
					if ( sorlfosElement.getSorlfosTermCode().isNull() )
					{
						sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
					}
				}
				//  rowid is null 
				getFormModel().getSCurricula().setDefaultOptionsInd(toStr("N"));
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.WHEN-VALIDATE-RECORD
		 --if :system.current_block = 'G$_OPT_BLOCK' OR
--	 :system.mode = 'ENTER-QUERY' OR  
--	:s$_curricula.options_ind = 'Y' THEN
--	:s$_curricula.options_ind := NULL; 
--	return;
--end if;
	
G$_CHECK_QUERY_MODE;

--message('in when validate record on lfos lite' || :system.mode 
-- || ' block ' || :system.block_status || ' rec ' || 
-- :system.record_status || ' seq ' || :sorlfos_seqno);
if :sorlcur_lite.sorlcur_duplicate_ind = 'Y' then
	return;
end if;
IF ( :sorlfos_priority_no is  NULL and
	:sorlfos_csts_code is  NULL and
	:sorlfos_cact_code is  NULL and 
	:sorlfos_lfst_code is  NULL and
	:sorlfos_majr_code is  NULL and
	:sovlfos_rowid is null )
	then return;
end if; 

IF	( :sorlfos_priority_no is not NULL OR
	:sorlfos_csts_code is not NULL OR
	:sorlfos_cact_code is not NULL or 
	:sorlfos_lfst_code is not NULL OR
	:sorlfos_majr_code is not NULL) THEN
	
if :sorlfos_priority_no is null then 
		message( G$_NLS.Get('SOQOLIB-0399', 'FORM',
		 '*ERROR* Enter priority number.') );
	 	raise form_trigger_failure;
	end if; 
	if :sorlfos_lfst_code is null then 
		message( G$_NLS.Get('SOQOLIB-0400', 'FORM',
		 '*ERROR* Enter field of study type code.') );
	 	raise form_trigger_failure;
	end if; 
	if :sorlfos_csts_code is null then 
		message( G$_NLS.Get('SOQOLIB-0401', 'FORM',
		 '*ERROR* Enter curriculum status code.') );
	 	raise form_trigger_failure;
	end if;
	if :sorlfos_cact_code is null then 
		message( G$_NLS.Get('SOQOLIB-0402', 'FORM',
		 '*ERROR* Enter curriculum activity code.') );
	 	raise form_trigger_failure;
	end if;
	if :sorlfos_majr_code is null then 
		message( G$_NLS.Get('SOQOLIB-0403', 'FORM',
		 '*ERROR* Enter field of study code.') );
	 	raise form_trigger_failure;
	end if;
 
END IF;

-- only insert if new row,  this trigger also executes for key delete 
--message('before record validate insert into sotlfos  lcur:' || 
--:sorlcur_seqno || ' cact: ' || :sorlfos_cact_code || ' lfst: ' || :sorlfos_lfst_code || ' prio:' 
--|| :sorlfos_priority_no || ' mgr: ' || :sorlfos_majr_code || ' seq: ' || :sorlfos_seqno ); 
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
		 * SORLFOS_LITE.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void sorlfosLite_WhenValidateRecord()
		{
			
				// if :system.current_block = 'G$_OPT_BLOCK' OR
				// 	 :system.mode = 'ENTER-QUERY' OR  
				// 	:s$_curricula.options_ind = 'Y' THEN
				// 	:s$_curricula.options_ind := NULL; 
				// 	return;
				// end if;

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurLiteAdapter sorlcurLiteElement = (SorlcurLiteAdapter)this.getFormModel().getSorlcurLite().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// if :system.current_block = 'G$_OPT_BLOCK' OR
				// 	 :system.mode = 'ENTER-QUERY' OR  
				// 	:s$_curricula.options_ind = 'Y' THEN
				// 	:s$_curricula.options_ind := NULL; 
				// 	return;
				// end if;
				getContainer().getGoqrpls().gCheckQueryMode();
				// message('in when validate record on lfos lite' || :system.mode 
				//  || ' block ' || :system.block_status || ' rec ' || 
				//  :system.record_status || ' seq ' || :sorlfos_seqno);
				if ( sorlcurLiteElement.getSorlcurDuplicateInd().equals("Y") )
				{
					return ;
				}
				if ((sorlfosElement.getSorlfosPriorityNo().isNull() && sorlfosElement.getSorlfosCstsCode().isNull() && sorlfosElement.getSorlfosCactCode().isNull() && sorlfosElement.getSorlfosLfstCode().isNull() && sorlfosElement.getSorlfosMajrCode().isNull() && sorlfosElement.getSovlfosRowid().isNull()))
				{
					return ;
				}
				if ((!sorlfosElement.getSorlfosPriorityNo().isNull() || !sorlfosElement.getSorlfosCstsCode().isNull() || !sorlfosElement.getSorlfosCactCode().isNull() || !sorlfosElement.getSorlfosLfstCode().isNull() || !sorlfosElement.getSorlfosMajrCode().isNull()))
				{
					if ( sorlfosElement.getSorlfosPriorityNo().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0399"), toStr("FORM"), toStr("*ERROR* Enter priority number.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0400"), toStr("FORM"), toStr("*ERROR* Enter field of study type code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosCstsCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0401"), toStr("FORM"), toStr("*ERROR* Enter curriculum status code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosCactCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0402"), toStr("FORM"), toStr("*ERROR* Enter curriculum activity code.")));
						throw new ApplicationException();
					}
					if ( sorlfosElement.getSorlfosMajrCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0403"), toStr("FORM"), toStr("*ERROR* Enter field of study code.")));
						throw new ApplicationException();
					}
				}
				//  only insert if new row,  this trigger also executes for key delete 
				// message('before record validate insert into sotlfos  lcur:' || 
				// :sorlcur_seqno || ' cact: ' || :sorlfos_cact_code || ' lfst: ' || :sorlfos_lfst_code || ' prio:' 
				// || :sorlfos_priority_no || ' mgr: ' || :sorlfos_majr_code || ' seq: ' || :sorlfos_seqno ); 
				if ( sorlfosElement.getSovlfosRowid().isNull() )
				{
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode(),/*pTermCodeCtlg=>*/sorlfosElement.getSorlfosTermCodeCtlg());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.WHEN-NEW-BLOCK-INSTANCE
		 if :s$_curricula.module_term_code is null then 
	go_item(:return_from_sorlcur); 
  g$_check_failure;
END IF; 

execute_trigger('lfos_check_base');
:s$_curricula.default_major := '';
:s$_curricula.default_dept := '';
:s$_curricula.default_cmjr_rule := ''; 


if :system.current_item like 'SORLFOS%' then
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
		 * SORLFOS_LITE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sorlfosLite_blockChange()
		{
			
				if ( getFormModel().getSCurricula().getModuleTermCode().isNull() )
				{
					goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
					getContainer().getGoqrpls().gCheckFailure();
				}
				executeAction("lfos_check_base");
				getFormModel().getSCurricula().setDefaultMajor(toStr(""));
				getFormModel().getSCurricula().setDefaultDept(toStr(""));
				getFormModel().getSCurricula().setDefaultCmjrRule(toNumber(""));
				if ( like(getCurrentItem(), "SORLFOS%") )
				{
					executeAction("disable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("enable_curriculum");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LITE.QUERY_ONLY
		 DECLARE
    lv_what_obj  VARCHAR2(30);
    lv_what_role VARCHAR2(30);
  BEGIN
    GOKDBMS.APPLICATION_INFO_READ_MODULE(lv_what_obj, lv_what_role);
    IF lv_what_role IS NOT NULL AND SUBSTR(lv_what_role,-2,2) = '_Q' THEN
       MESSAGE(g$_nls.get('SOQOLIB-0404','FORM','*ERROR* You are running with a query only role, this function is not allowed.'));
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.QUERY_ONLY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_ONLY")
		public void sorlfosLite_QueryOnly()
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0404"), toStr("FORM"), toStr("*ERROR* You are running with a query only role, this function is not allowed.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_LITE.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sorlfosLite_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

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
		 * SORLFOS_LFST_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_LFST_CODE")
		public void sorlfosLfstCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_lfst_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_gtvlfst.f_code_exists(:sorlfos_lfst_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0405', 'FORM','*ERROR* Invalid learner field of study type code, press LIST for values.') );
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
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);


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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0405"), toStr("FORM"), toStr("*ERROR* Invalid learner field of study type code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_LFST_CODE.POST-CHANGE
		 g$_check_query_mode;

if :sovlfos_rowid is not null then
	return;
end if; 
if :global.query_mode = '1' or :system.block_status in ('QUERY', 'NEW' ) then 
	return;
end if; 
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

-- update temp file for attached major lov
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
				SorlfosLiteAdapter sorlfosLiteElement = (SorlfosLiteAdapter)this.getFormModel().getSorlfosLite().getRowAdapter(true);


				int rowCount = 0;
				if(sorlfosLiteElement.getSorlfosLfstCode().isNull())
		return;
				getContainer().getGoqrpls().gCheckQueryMode();
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( getGlobal("QUERY_MODE").equals("1") || (getBlockStatus().equals("QUERY") || getBlockStatus().equals("NEW")) )
				{
					return ;
				}
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
						} finally {
							maxPriorityC.close();							
						}

						if ( initialPriority.equals(0) )
						{
							sorlfosElement.setSorlfosPriorityNo(toNumber(getGlobal("SOBCTRL_PRIORITY_NO")));
						}
						else {
							sorlfosElement.setSorlfosPriorityNo(initialPriority.add(toNumber(getGlobal("SOBCTRL_PRIORITY_INCR"))));
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
					} finally {
						tfosC.close();
					}
				}
			}

		
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
		public void sorlfosCactCode_WhenMouseDoubleclick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CACT_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_cact_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcact.f_code_exists(:sorlfos_cact_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0406', 'FORM','*ERROR* Invalid curriculum activity status code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0406"), toStr("FORM"), toStr("*ERROR* Invalid curriculum activity status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
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
		public void sorlfosTermCode_WhenMouseDoubleclick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_TERM_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_term_code is null then
	return;
end if;
<multilinecomment> comment out,  term not displayed on canvas with 7.0 release
declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlfos_term_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0843', 'FORM','*ERROR* Invalid term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;
if :sorlfos_term_code <> :s$_curricula.module_term_code then 
	message(G$_NLS.Get('x', 'FORM','*ERROR* term code must be equal to module term.') );
	raise form_trigger_failure;
end if;
</multilinecomment>

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


				if ( sorlfosElement.getSorlfosTermCode().isNull() )
				{
					return ;
				}
			}

		
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
			
				getGCodeClass().whenMouseDoubleclick();
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.G$_SEARCH_OPTIONS
		 if :sorlfos_lfst_code is null then 
	message( G$_NLS.Get('SOQOLIB-0407', 'FORM','Enter field of study type before selecting field of study.') );
  raise form_trigger_failure;
end if;
if :sovlfos_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
ELSE 

	:s$_curricula.options_ind := 'Y'; 
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


				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0407"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
					throw new ApplicationException();
				}
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
					getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.PRE-TEXT-ITEM
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
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


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
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
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
		message( G$_NLS.Get('SOQOLIB-0408', 'FORM','Enter field of study type before selecting field of study.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0408"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
						throw new ApplicationException();
					}
					setItemLovName("sorlfos_majr_code", "stvmajr_lov");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_majr_code is null then
	return;
end if;
if :sovlfos_rowid is not null then
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
		    message( G$_NLS.Get('SOQOLIB-0409', 'FORM','*ERROR* Invalid major code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
	when sb_fieldofstudy_str.f_minor  then 
	   	test_code := gb_stvmajr.f_minor_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0410', 'FORM','*ERROR* Invalid minor code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;	 
	when sb_fieldofstudy_str.f_concentration then 
	   	test_code := gb_stvmajr.f_concentration_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0411', 'FORM','*ERROR* Invalid concentration code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
  Else 
    		
     if :sorlfos_lfst_code is null then 
   		message( G$_NLS.Get('SOQOLIB-0412', 'FORM','Enter field of study type before selecting field of study.') );
	    raise form_trigger_failure;
	   end if;
	   	test_code := gb_stvmajr.f_code_exists(:sorlfos_majr_code);
    	if test_code = 'N' then 
		    message( G$_NLS.Get('SOQOLIB-0413', 'FORM','*ERROR* Invalid major code, press LIST for values.') );
	   	  raise form_trigger_failure;
    	end if;
	end case;
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


				if ( sorlfosElement.getSorlfosMajrCode().isNull() )
				{
					return ;
				}
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
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
							errorMessage(GNls.Fget(toStr("SOQOLIB-0409"), toStr("FORM"), toStr("*ERROR* Invalid major code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fMinor()))
					{
						testCode = GbStvmajr.fMinorCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0410"), toStr("FORM"), toStr("*ERROR* Invalid minor code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else if (sorlfosElement.getSorlfosLfstCode().equals(SbFieldofstudyStr.fConcentration()))
					{
						testCode = GbStvmajr.fConcentrationCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0411"), toStr("FORM"), toStr("*ERROR* Invalid concentration code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
					else {
						if ( sorlfosElement.getSorlfosLfstCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0412"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
							throw new ApplicationException();
						}
						testCode = GbStvmajr.fCodeExists(sorlfosElement.getSorlfosMajrCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0413"), toStr("FORM"), toStr("*ERROR* Invalid major code, press LIST for values.")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.KEY-LISTVAL
		 :global.value := '';
if :sorlfos_lfst_code is null then 
	message( G$_NLS.Get('SOQOLIB-0414', 'FORM','Enter field of study type before selecting field of study.') );
  raise form_trigger_failure;
end if;
if :sovlfos_rowid is not null and 
	:system.mode <> 'ENTER-QUERY' then
  execute_trigger('lfos_lov_error_msg');
else 
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
				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0414"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
					throw new ApplicationException();
				}
				if ( !sorlfosElement.getSovlfosRowid().isNull() && !getMode().equals("ENTER-QUERY") )
				{
					executeAction("lfos_lov_error_msg");
				}
				else {
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
	:sorlfos_majr_code_attach := '';
	:sorlfos_attach_conc_desc := '';
	return;
end if;

if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlfos_term_code_ctlg is null then
      :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, :sorlfos_term_code);
   end if;
end if; 

execute_trigger('LFOS_MAJR_POST_TEXT');
g$_check_failure;

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
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( !sorlfosElement.getSovlfosRowid().isNull() )
				{
					return ;
				}
				if ( sorlfosElement.getSorlfosMajrCode().isNull() )
				{
					sorlfosElement.setSorlfosMajrDesc(toStr(""));
					sorlfosElement.setSorlfosMajrCodeAttach(toStr(""));
					sorlfosElement.setSorlfosAttachConcDesc(toStr(""));
					return ;
				}
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlfosElement.getSorlfosTermCode()));
					}
				}
				executeAction("LFOS_MAJR_POST_TEXT");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE.KEY-HELP
		 IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlfos_rowid is not null THEN
	HELP;
ELSE 

if :sorlfos_lfst_code is null then 
	message( G$_NLS.Get('SOQOLIB-0415', 'FORM','Enter field of study type before selecting field of study.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0415"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
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
		 * SORLFOS_CSTS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_CSTS_CODE")
		public void sorlfosCstsCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CSTS_CODE.WHEN-VALIDATE-ITEM
		 if :sorlfos_csts_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcsts.f_code_exists(:sorlfos_csts_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0416', 'FORM','*ERROR* Invalid curriculum status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	
	if :sorlcur_lmod_code = sb_curriculum_str.f_outcome then 
		 test_code := '';
		 test_code := soklcur.f_validate_degs_csts(:sorlfos_csts_code, :s$_curricula.module_degs_code);
		 if test_code = 'N' then 
		 	 message( G$_NLS.Get('SOQOLIB-0417', 'FORM','*ERROR* Invalid curriculum status code for non awarded degree status.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0416"), toStr("FORM"), toStr("*ERROR* Invalid curriculum status code, press LIST for values.")));
						throw new ApplicationException();
					}
					if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) )
					{
						testCode = toStr("");
						testCode = Soklcur.fValidateDegsCsts(sorlfosElement.getSorlfosCstsCode(), getFormModel().getSCurricula().getModuleDegsCode());
						if ( testCode.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0417"), toStr("FORM"), toStr("*ERROR* Invalid curriculum status code for non awarded degree status.")));
							throw new ApplicationException();
						}
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
		message( G$_NLS.Get('SOQOLIB-0418', 'FORM','*ERROR* Invalid department code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0418"), toStr("FORM"), toStr("*ERROR* Invalid department code, press LIST for values.")));
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
BREAK;
:CHECK_KEYS := 'N';
:s$_curricula.options_ind := 'Y'; 
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));
if :sorlfos_lfst_code <> sb_fieldofstudy_str.f_major 
	then 
	  :lfos_option_key1 := 'LIST_VALUES';
    :lfos_option_title1 :=  G$_NLS.Get('SOQOLIB-0419', 'FORM','All Department Codes') ;
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
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				if ( sorlfosElement.getSorlfosLfstCode().notEquals(SbFieldofstudyStr.fMajor()) )
				{
					sorlfosElement.setLfosOptionKey1(toStr("LIST_VALUES"));
					sorlfosElement.setLfosOptionTitle1(GNls.Fget(toStr("SOQOLIB-0419"), toStr("FORM"), toStr("All Department Codes")));
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
	:sovlcur_rowid is not null THEN
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
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") || !sorlcurElement.getSovlcurRowid().isNull() )
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.G$_SEARCH_OPTIONS
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE 
 	if :sovlfos_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
	ELSE 
			DO_KEY('LIST_VALUES');
	end if; 
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_MAJR_CODE_ATTACH.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlfosMajrCodeAttach_GSearchOptions()
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
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_ATTACH.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlfos_term_code_ctlg is null then
      :sorlfos_term_code_ctlg := nvl(:sorlcur_term_code_ctlg, :sorlfos_term_code);
   end if;
end if;

if :sorlfos_majr_code_attach is null then 
	:sorlfos_attach_conc_desc := null;
	:sorlfos_conc_attach_rule := null;
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
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
				{
					if ( sorlfosElement.getSorlfosTermCodeCtlg().isNull() )
					{
						sorlfosElement.setSorlfosTermCodeCtlg(isNull(sorlcurElement.getSorlcurTermCodeCtlg(), sorlfosElement.getSorlfosTermCode()));
					}
				}
				if ( sorlfosElement.getSorlfosMajrCodeAttach().isNull() )
				{
					sorlfosElement.setSorlfosAttachConcDesc(toStr(null));
					sorlfosElement.setSorlfosConcAttachRule(toNumber(null));
					return ;
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_DEPT_CODE_LBT.WHEN-BUTTON-PRESSED
		 IF :system.current_block <> 'SORLFOS_LITE' THEN
	RETURN;
END IF;

GO_ITEM('SORLFOS_DEPT_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
	if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0420', 'FORM','Enter field of study type before selecting department.') );
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


				if ( getCurrentBlock().notEquals("SORLFOS_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLFOS_DEPT_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0420"), toStr("FORM"), toStr("Enter field of study type before selecting department.")));
						throw new ApplicationException();
					}
					executeAction("dept_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_MAJR_CODE_LBT.WHEN-BUTTON-PRESSED
		 IF :system.current_block <> 'SORLFOS_LITE' THEN
	RETURN;
END IF;

GO_ITEM('SORLFOS_MAJR_CODE');
if :sorlfos_lfst_code is null then 
	message( G$_NLS.Get('SOQOLIB-0421', 'FORM','Enter field of study type before selecting field of study.') );
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


				if ( getCurrentBlock().notEquals("SORLFOS_LITE") )
				{
					return ;
				}
				goItem(toStr("SORLFOS_MAJR_CODE"));
				if ( sorlfosElement.getSorlfosLfstCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0421"), toStr("FORM"), toStr("Enter field of study type before selecting field of study.")));
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
		 IF :system.current_block <> 'SORLFOS_LITE' THEN
	RETURN;
END IF;


If get_item_property('sorlfos_majr_code_attach',enabled) = 'TRUE' then
	GO_ITEM('SORLFOS_LITE.SORLFOS_MAJR_CODE_ATTACH');
	IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
		DO_KEY('LIST_VALUES');
	ELSE
		if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0422', 'FORM','Enter field of study type before selecting attached major.') );
		  raise form_trigger_failure;
		end if;
	  do_key('list_values'); 
	END IF;
else 
	if :sorlfos_lfst_code is null then 
			message( G$_NLS.Get('SOQOLIB-0423', 'FORM','Enter field of study type before selecting attached major.') );
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


				if ( getCurrentBlock().notEquals("SORLFOS_LITE") )
				{
					return ;
				}
				if ( getItemEnabled("sorlfos_majr_code_attach").equals("TRUE") )
				{
					goItem(toStr("SORLFOS_LITE.SORLFOS_MAJR_CODE_ATTACH"));
					if ( getMode().equals("ENTER-QUERY") )
					{
						executeAction("LIST_VALUES");
					}
					else {
						if ( sorlfosElement.getSorlfosLfstCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0422"), toStr("FORM"), toStr("Enter field of study type before selecting attached major.")));
							throw new ApplicationException();
						}
						executeAction("LIST_VALUES");
					}
				}
				else {
					if ( sorlfosElement.getSorlfosLfstCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0423"), toStr("FORM"), toStr("Enter field of study type before selecting attached major.")));
						throw new ApplicationException();
					}
				}
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

		
	
	
}

