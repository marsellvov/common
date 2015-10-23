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
		
public class SorlcurController extends AbstractSupportCodeObject {

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

	
	public SorlcurController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-PRVBLK
		 DECLARE
	lv_block BLOCK;
BEGIN
	lv_block := FIND_BLOCK('SOVLCUR');

  if  get_block_property('SORLCUR',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS',STATUS) = 'CHANGED'
			OR :s$_curricula.curricula_dup_inprogress = 'Y' THEN
			message( G$_NLS.Get('SOQOLIB-0176', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
  end if; 
  if get_item_property(:return_from_sorlcur,ENABLED) = 'FALSE' 
  	Then 
  	message( G$_NLS.Get('SOQOLIB-0177', 'FORM','Invalid option for query only.') );
	
  else 
   hide_view('curricula_canvas');
   IF ID_NULL(lv_block) THEN 
     go_item(:return_from_sorlcur);
     g$_check_failure;
   ELSE
   	IF :sorlcur.sovlcur_rowid is NULL THEN 
       go_item(:return_from_sorlcur);
       g$_check_failure;
   	ELSE
   		 go_item(:return_from_sorlcur);
   		 g$_check_failure;
   		 show_view('curricula_summary_tab');
   		 :system.message_level := '5'; 
   		 go_block('SOVLCUR');
   		 execute_query;
   		 go_block('SOVLFOS'); 
   		 execute_query;
       g$_check_failure;
       :system.message_level := '0';
   	END IF;  
  end if;
 END IF;
END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sorlcur_PreviousBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					BlockDescriptor lvBlock= null;
					lvBlock = findBlock("SOVLCUR");
					if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") || getFormModel().getSCurricula().getCurriculaDupInprogress().equals("Y") )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0176"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
						throw new ApplicationException();
					}
					if ( getItemEnabled(getFormModel().getSCurricula().getReturnFromSorlcur()).equals(NBool.False))
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0177"), toStr("FORM"), toStr("Invalid option for query only.")));
					}
					else {
						hideView("curricula_canvas");
						if ( (lvBlock == null) )
						{
							goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							if ( sorlcurElement.getSovlcurRowid().isNull() )
							{
								goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								goItem(getFormModel().getSCurricula().getReturnFromSorlcur());
								getContainer().getGoqrpls().gCheckFailure();
								showView("curricula_summary_tab");
								// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
								goBlock(toStr("SOVLCUR"));
								executeQuery();
								goBlock(toStr("SOVLFOS"));
								executeQuery();
								getContainer().getGoqrpls().gCheckFailure();
								// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-CLRBLK
		 if nvl(:deactivate_ind,'N') = 'I' then 
		message( G$_NLS.Get('SOQOLIB-0178', 'FORM','Invalid option after deactivation and insert, you must rollback changes.') );
    raise form_trigger_failure;
end if;

:system.message_level := '5'; 
go_block('sorlfos');
clear_block(no_validate);
go_block('sorlcur');
clear_block(no_validate);
execute_query;
go_block('SORLFOS');
execute_query;
go_block('SORLCUR'); 
:s$_curricula.curricula_updated := 'N';
:system.message_level := '0'; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sorlcur_keyClearBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( isNull(sorlcurElement.getDeactivateInd(), "N").equals("I") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0178"), toStr("FORM"), toStr("Invalid option after deactivation and insert, you must rollback changes.")));
					throw new ApplicationException();
				}
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				goBlock(toStr("sorlfos"));
				clearBlock(TaskServices.NO_VALIDATE);
				goBlock(toStr("sorlcur"));
				clearBlock(TaskServices.NO_VALIDATE);
				executeQuery();
				goBlock(toStr("SORLFOS"));
				executeQuery();
				goBlock(toStr("SORLCUR"));
				getFormModel().getSCurricula().setCurriculaUpdated(toStr("N"));
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-CLRFRM
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

    IF ( get_block_property('SORLCUR',STATUS) = 'CHANGED' OR  
       get_block_property('SORLFOS',STATUS) = 'CHANGED' 
       OR nvl(:s$_curricula.curricula_dup_inprogress,'N') = 'Y' ) AND
       :system.current_form <> 'SOILCUR' THEN 
      alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	    if alert_button = ALERT_BUTTON1 then
	       execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
         g$_check_failure;

         if not form_success then
       	    message( G$_NLS.Get('SOQOLIB-0179', 'FORM','There were errors and your changes could not be saved.') );  
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
           Go_block('SORLFOS');
           CLEAR_BLOCK(NO_VALIDATE);

        END IF;
	    end if;
    ELSE 
       IF :s$_curricula.exit_from_sorlcur IS NULL THEN 	 
         CLEAR_FORM(NO_VALIDATE) ;
         G$_CHECK_FAILURE ;
       ELSE
         CLEAR_BLOCK(NO_VALIDATE);
         Go_block('SORLFOS');
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
       end if; 
       G$_CHECK_FAILURE ;
       if :system.current_form <> 'SOILCUR' THEN 
         hide_view('curricula_canvas');
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
		 * SORLCUR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void sorlcur_ClearTask()
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
								errorMessage(GNls.Fget(toStr("SOQOLIB-0179"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
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
								goBlock(toStr("SORLFOS"));
								clearBlock(TaskServices.NO_VALIDATE);
							}
						}
					}
					else {
						if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
						{
							clearTask(TaskServices.NO_VALIDATE);
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							clearBlock(TaskServices.NO_VALIDATE);
							goBlock(toStr("SORLFOS"));
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
						}
						getContainer().getGoqrpls().gCheckFailure();
						if ( getCurrentTaskName().notEquals("SOILCUR") )
						{
							hideView("curricula_canvas");
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-CLRREC
		  
if get_block_property('SORLCUR',DELETE_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0180', 'FORM','Invalid option for query only.') );
	return;
end if;
if 	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0181', 'FORM',
	'Commit or rollback curriculum data changes before clearing the curriculum record.') );
	raise form_trigger_failure;
end if; 
if nvl(:deactivate_ind,'N') = 'I' then 
		message( G$_NLS.Get('SOQOLIB-0182', 'FORM','Invalid option after deactivation and insert, you must rollback changes.') );
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
 
:sorlfos_del_ind := 'N';
:dup_create_ind := 'N'; 

Clear_Record;

g$_check_failure;


if :sovlcur_rowid is null then 
 :s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 1;
	execute_trigger('new_sorlcur');
	g$_check_failure;
end if;

  





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sorlcur_ClearRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getBlockDeleteAllowed("SORLCUR").equals(NBool.False))
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0180"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0181"), toStr("FORM"), toStr("Commit or rollback curriculum data changes before clearing the curriculum record.")));
					throw new ApplicationException();
				}
				if ( isNull(sorlcurElement.getDeactivateInd(), "N").equals("I") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0182"), toStr("FORM"), toStr("Invalid option after deactivation and insert, you must rollback changes.")));
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
				getFormModel().getSCurricula().setSorlfosDelInd(toStr("N"));
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				clearRecord();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sorlcurElement.getSovlcurRowid().isNull() )
				{
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(1));
					executeAction("new_sorlcur");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-COMMIT
		 if :system.current_form = 'SOILCUR' THEN 
  return;
end if;

:dup_create_ind := 'N'; 
:s$_curricula.commit_inprogress := 'Y'; 

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

-- validate number of curriculum and fields of sutdy 
execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
g$_check_failure;

if not form_success then
	message( G$_NLS.Get('SOQOLIB-0183', 'FORM','There were errors and your changes could not be saved.') );  
	raise form_trigger_failure;
end if; 
commit_form;
g$_check_failure;
 
:s$_curricula.commit_inprogress := 'N'; 
:s$_curricula.curricula_dup_inprogress := 'N';

execute_trigger('check_studypath_count');
g$_check_failure; 

execute_trigger('lcur_record_cnt');
g$_check_failure;

:s$_curricula.evaluate_courses := 'Y';  
execute_trigger('curriculum_commplan_check');
g$_check_failure; 



 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sorlcur_Save()
		{
			
				if ( getCurrentTaskName().equals("SOILCUR") )
				{
					return ;
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				getFormModel().getSCurricula().setCommitInprogress(toStr("Y"));
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
				//  validate number of curriculum and fields of sutdy 
				executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
				try{
					getContainer().getGoqrpls().gCheckFailure();
				}catch(Exception e){
					errorMessage(GNls.Fget(toStr("SOQOLIB-0183"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
					throw new ApplicationException();
				}
				commitTask();
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCurricula().setCommitInprogress(toStr("N"));
				getFormModel().getSCurricula().setCurriculaDupInprogress(toStr("N"));
				executeAction("check_studypath_count");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("lcur_record_cnt");
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
				executeAction("curriculum_commplan_check");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-CREREC
		 execute_trigger('query_only');
g$_check_failure;
  
if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0184', 'FORM','Invalid option for query only.') );
	return;
end if;
if -- :sovlcur_rowid is not null and   
	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0185', 'FORM',
	'Commit curriculum data changes before navigation to the next curriculum.') );
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
:system.message_level := '5'; 
:save_priority_no := :sorlcur.sorlcur_priority_no; 
next_block;
clear_block;
g$_check_failure;
previous_block;
create_record;
g$_check_failure;
:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 1;
:system.message_level := '0'; 
:dup_create_ind := 'Y'; 
:deactivate_ind := null;
execute_trigger('NEW_SORLCUR');
G$_CHECK_FAILURE; 


 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sorlcur_CreateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0184"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0185"), toStr("FORM"), toStr("Commit curriculum data changes before navigation to the next curriculum.")));
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
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				getFormModel().getSCurricula().setSavePriorityNo(sorlcurElement.getSorlcurPriorityNo());
				nextBlock();
				clearBlock();
				getContainer().getGoqrpls().gCheckFailure();
				previousBlock();
				createRecord();
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(1));
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
				sorlcurElement.setDeactivateInd(toStr(null));
				executeAction("NEW_SORLCUR");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-EDIT
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
		 * SORLCUR.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sorlcur_KeyEdit()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOACURR"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-ENTQRY
		 if  :sovlcur_rowid is not null and   
	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0186', 'FORM','Commit or rollback curriculum data changes before entering query.') );
	raise form_trigger_failure;
end if; 

:lcur_rec_cnt := 0;
:lcur_rec_num := 0;
go_block('SORLFOS');
clear_block;
go_block('SORLCUR');

if get_item_property('sorlcur_lmod_code_lbt',visible) = 'TRUE' THEN 
	set_curric_properties('sorlcur_lmod_code_lbt','enabled','property_true');
end if; 
 
set_curric_properties('sorlcur_degc_code_lbt','enabled','property_true');
set_curric_properties('sorlcur_coll_code_lbt','enabled','property_true');
set_curric_properties('sorlcur_camp_code_lbt','enabled','property_true');
set_curric_properties('sorlcur_levl_code_lbt','enabled','property_true');
set_curric_properties('sorlcur_program_lbt','enabled','property_true');
set_curric_properties('SORLCUR_TERM_CODE','enabled','property_true');
set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_true');
set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_true');
set_curric_properties('sorlcur_cact_code_lbt','enabled','property_true');
set_curric_properties('sorlcur_start_date_dbt','enabled','property_true');
set_curric_properties('sorlcur_end_date_dbt','enabled','property_true');
IF  get_block_property('SORLCUR',INSERT_ALLOWED) = 'TRUE' THEN
  if :s$_curricula.module_code = sb_curriculum_str.f_learner THEN 
  	set_curric_properties('SORLCUR_TERM_CODE_END','enabled','property_true');
	  set_curric_properties('sorlcur_term_code_end_lbt','enabled','property_true');
		set_curric_properties('sorlcur_term_code_admit_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_term_code_matric_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_admt_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_rate_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_site_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_styp_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_acyr_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_term_code_grad_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_from_date_dbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_to_date_dbt','enabled','property_true');
	  set_curric_properties('sorlcur_exp_grad_date_dbt','enabled','property_true');

  END IF;
ELSE
	  set_curric_properties('sorlcur_term_code_end_lbt','enabled','property_true');
		set_curric_properties('sorlcur_term_code_admit_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_term_code_matric_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_admt_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_rate_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_site_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_styp_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_acyr_code_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_term_code_grad_lbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_from_date_dbt','enabled','property_true');
	  set_curric_properties('sorlcur_leav_to_date_dbt','enabled','property_true');
	  set_curric_properties('sorlcur_exp_grad_date_dbt','enabled','property_true');

end if;
 
enter_query;
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sorlcur_Search()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( !sorlcurElement.getSovlcurRowid().isNull() && (getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")) )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0186"), toStr("FORM"), toStr("Commit or rollback curriculum data changes before entering query.")));
					throw new ApplicationException();
				}
				getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(0));
				getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(0));
				goBlock(toStr("SORLFOS"));
				clearBlock();
				goBlock(toStr("SORLCUR"));
				if ( getItemVisible("sorlcur_lmod_code_lbt").equals("TRUE") )
				{
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_lmod_code_lbt"), toStr("enabled"), toStr("property_true"));
				}
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_cact_code_lbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_start_date_dbt"), toStr("enabled"), toStr("property_true"));
				this.getContainer().getServices().setCurricProperties(toStr("sorlcur_end_date_dbt"), toStr("enabled"), toStr("property_true"));
				if ( getBlockInsertAllowed("SORLCUR").equals("TRUE") )
				{
					if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_END"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_end_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_admit_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_matric_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_admt_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("enabled"), toStr("property_true"));
					}
				}
				else {
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_end_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_admit_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_matric_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_admt_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("enabled"), toStr("property_true"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("enabled"), toStr("property_true"));
				}
				enterQuery();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-EXIT
		 -- exit from sorlcur variable is used for sfaregs since the clear form & exit have to return
-- to the course block.
-- all other forms use the return from sorlcur 

DECLARE
    alert_button number;
    alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
      
BEGIN     
--
    
   IF get_block_property('SORLCUR',STATUS) = 'CHANGED' OR  
   	 get_block_property('SORLFOS',STATUS) = 'CHANGED' OR 
   	 nvl(:s$_curricula.curricula_dup_inprogress,'N') = 'Y' THEN 
        alert_button := show_alert('CURRICULUM_COMMIT_ALERT');
	      if alert_button = ALERT_BUTTON1 then
	       	  execute_trigger('VALIDATE_CURRICULUM_AT_COMMIT');
            g$_check_failure;

            if not form_success then
              	message( G$_NLS.Get('SOQOLIB-0187', 'FORM','There were errors and your changes could not be saved.') );  
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
       	       GO_BLOCK('SORLFOS');    
       	       G$_CHECK_FAILURE ;
       	       CLEAR_BLOCK(NO_VALIDATE);
       	       G$_CHECK_FAILURE ;

            END IF;

	      end if;
    
   END IF;
   
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
		 * SORLCUR.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sorlcur_Exit()
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
					if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") || isNull(getFormModel().getSCurricula().getCurriculaDupInprogress(), "N").equals("Y") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							executeAction("VALIDATE_CURRICULUM_AT_COMMIT");
							try{
								getContainer().getGoqrpls().gCheckFailure();
							} catch(Exception e){
								errorMessage(GNls.Fget(toStr("SOQOLIB-0187"), toStr("FORM"), toStr("There were errors and your changes could not be saved.")));
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
								goBlock(toStr("SORLFOS"));
								getContainer().getGoqrpls().gCheckFailure();
								clearBlock(TaskServices.NO_VALIDATE);
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
					}
					if ( getFormModel().getSCurricula().getExitFromSorlcur().isNull() )
					{
						getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						goItem(getFormModel().getSCurricula().getExitFromSorlcur());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-EXEQRY
		   execute_query;
  g$_check_failure;
  :system.message_level := '5';
  if :sovlcur_rowid is not null then 
	   go_block('sorlfos');
	   g$_check_failure;
	   execute_query;
	   g$_check_failure;
	   go_block('sorlcur');
	   g$_check_failure;
	   last_record;
	   g$_check_failure;
	   :lcur_rec_cnt := :system.cursor_record;
	   first_record;
	   g$_check_failure;
	   :system.message_level := '0';
  end if; 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sorlcur_ExecuteQuery()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				executeQuery();
				getContainer().getGoqrpls().gCheckFailure();
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					goBlock(toStr("sorlfos"));
					getContainer().getGoqrpls().gCheckFailure();
					executeQuery();
					getContainer().getGoqrpls().gCheckFailure();
					goBlock(toStr("sorlcur"));
					getContainer().getGoqrpls().gCheckFailure();
					lastRecord();
					getContainer().getGoqrpls().gCheckFailure();
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(getCursorRecord()));
					firstRecord();
					getContainer().getGoqrpls().gCheckFailure();
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-DELREC
		 execute_trigger('query_only');
g$_check_failure;

if get_block_property('SORLCUR',DELETE_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0188', 'FORM','Invalid option for query only.') );
	return;
end if;
--
:lcur_delete_error := 'N';
--
IF :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
	 :s$_curricula.learner_eff_term IS NOT NULL and    -- Call is from SFAREGS. Other forms pass NULL.
	 :sorlcur_term_code <> :s$_curricula.module_term_code  
THEN
 	 MESSAGE( G$_NLS.Get('SOQOLIB-0189', 'FORM','*ERROR* Cannot delete curriculum unless curriculum term equals key-block term.') );
   RAISE form_trigger_failure;
END IF; 
--
-- do not allow the deletion of learner curriculum if it's current
-- in another term 
if :s$_curricula.module_code = sb_curriculum_str.f_learner  and  
---	and nvl(:sovlcur_current_ind,'x') = 'N' and 
  sb_learnercurricstatus.f_is_active(:sorlcur_cact_code) = 'Y' then 
  declare 
    cntact pls_integer := 0; 
    cursor cnt_active_c is 
      select nvl(count(*),0)
      from sgvccur
      where sgvccur_pidm = :s$_curricula.module_pidm
      and sgvccur_order > 0 
      and sgvccur_seqno = :sorlcur_seqno
      and sgvccur_stdn_term_code_eff = :s$_curricula.module_term_code
      and sgvccur_term_code <> :s$_curricula.module_term_code;
   begin 
    open cnt_active_c;
	  fetch cnt_active_c into cntact;
	  close cnt_active_c;
	  if cntact > 0 then 
	 		message( G$_NLS.Get('SOQOLIB-0190', 'FORM','*ERROR* Curriculum is active for another term and must be deleted from that effective term.') );
     raise form_trigger_failure;
 	  end if; 
   end ; 
end if; 



--
-- If fee assessment was run against this study path, issue alert 
-- and give the user the option to back out of the delete-record
--
DECLARE
  alert_button           NUMBER;
  alert_id               ALERT := FIND_ALERT('CURRICULUM_ALERT'); 
  dummy_var              VARCHAR2(1) := 'N';  
   
  CURSOR sfrfaud_lcur_c IS
  select 'Y' from sfrfaud
  WHERE  sfrfaud_pidm = :sorlcur_pidm
  AND    sfrfaud_lcur_seqno = :sorlcur_seqno;
   
BEGIN
	IF :s$_curricula.module_code = sb_curriculum_str.f_learner AND
	   :sorlcur_key_seqno <> 99   
	THEN
	   :ACTIVE_REG_IND := 'Y';
	   IF (:SYSTEM.CURRENT_FORM = 'SGASTDN') THEN
	   	 EXECUTE_TRIGGER('SET_ACTIVE_REG_IND');
	   	 G$_CHECK_FAILURE;
	   END IF;
	   IF (:ACTIVE_REG_IND = 'N') OR (:SYSTEM.CURRENT_FORM = 'SFAREGS') THEN 
	   	 OPEN sfrfaud_lcur_c;
 	     FETCH sfrfaud_lcur_c INTO dummy_var;
 	     CLOSE sfrfaud_lcur_c;
--
 	     IF dummy_var = 'Y' THEN
	       SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,G$_NLS.Get('SOQOLIB-0191','FORM','*WARNING* This curriculum record was used for fee assessment. Do you want to delete it?') ); 
		     alert_button := SHOW_ALERT('CURRICULUM_ALERT');  	 
		     IF alert_button = ALERT_BUTTON2 THEN  
		  	    RETURN;
		     END IF; 
		   END IF;
		 END IF;
	END IF;	    
END;
   
   
   
-- do not allow the deletion of learner curriculum if it has an stsp in this term
-- in another term 
if :s$_curricula.module_code = sb_curriculum_str.f_learner and
	 :sorlcur_key_seqno <> 99   then 
  declare 
    cntstsp pls_integer := 0; 
    cntotherstsp pls_integer := 0; 
    cntotheract pls_integer := 0;
    cntcurr pls_integer := 0; 
    active_ind  sobcact.sobcact_active_ind%type; 
    cursor cnt_other_lcur_c is 
      select nvl(count(*),0)
      from  sorlcur
      where sorlcur_lmod_code = sb_curriculum_str.f_learner
      and sorlcur_pidm = :s$_curricula.module_pidm
      and sorlcur_key_seqno = :sorlcur_key_seqno 
      and sorlcur_term_code = :sorlcur_term_code 
      and sorlcur_seqno <> :sorlcur_seqno; 
    
    cursor cnt_stsp_c is 
      select nvl(count(*),0)
      from sgrstsp
      where sgrstsp_pidm = :s$_curricula.module_pidm
      and sgrstsp_key_seqno = :sorlcur_key_seqno 
      and sgrstsp_term_code_eff = :s$_curricula.module_term_code;

  
	   dummy   varchar2(1) := ''; 
	   cursor reg_c is 
	   select 'Y'
	   from sfrstcr 
	   where sfrstcr_term_code between
	           :sorlcur_term_code and 
	           sb_studypath.f_end_term(:sorlcur_pidm,:sorlcur_term_code,
	             :sorlcur_key_seqno)
	   and SFRSTCR_STSP_KEY_SEQUENCE =  :sorlcur_key_seqno
	   and sfrstcr_pidm = :sorlcur_pidm;
  begin 
  	IF :SORLCUR.ROWID IS NOT NULL THEN
  	   :SYSTEM.MESSAGE_LEVEL := '5';   
       POST;   
       :SYSTEM.MESSAGE_LEVEL := '0';   
    END IF;
    open cnt_stsp_c;
	  fetch cnt_stsp_c into cntstsp;
	  close cnt_stsp_c;
	  if cntstsp > 0 then --- study path with term exists 
	  	open cnt_other_lcur_c;
	    fetch cnt_other_lcur_c into cntotheract;
	    close cnt_other_lcur_c;
	    --- if no other lcur then we'll be deleting the stsp 
	    if cntotheract = 0 then 
	     ---  cannot delete lcur if the stsp is last one on a degree
	     	if sb_studypath.f_degree_exists(p_pidm => :sorlcur_pidm,
          	  p_term_code_eff => :sorlcur_term_code,
          	  p_key_seqno => :sorlcur_key_seqno) = 'Y' 
        then 
          :lcur_delete_error := 'Y';    
	       	message(g$_nls.get('SOQOLIB-0192','FORM','*ERROR* Delete not allowed. Study path has degree.'));
          raise form_trigger_failure;	
	       end if;
	    
	     
	     --  cannot delete lcur if the stsp is on a sfrstcr 
	    open reg_c;
	    fetch reg_c into dummy;
  	  if reg_c%found then 
	      close reg_c;
	      :lcur_delete_error := 'Y';    
	  	  message(g$_nls.get('SOQOLIB-0193','FORM','*ERROR* Delete not allowed. Registration exists for the study path.'));
        raise form_trigger_failure;	
	    else
	  	 close reg_c;
	    end if;		
   
	     end if; -- only one exits for key 
	   end if; --- study path exists 
   end ; 
end if; 

-- do not allow deletion of an outcome if it has a grad app ,and the original learner
-- record is not  attached to the grad app 
if :s$_curricula.module_code = sb_curriculum_str.f_outcome THEN 

  declare 
    cntact pls_integer := 0;
    alert_id               ALERT := FIND_ALERT('CURRICULUM_ERROR');
    alert_button    number; 
    cntroll pls_integer := 0; 
    cursor cnt_rolled_grad_c is 
      select nvl(count(*),0)
      from sorlcur
      where sorlcur_pidm = :s$_curricula.module_pidm 
      and sorlcur_gapp_seqno is not null 
      and sorlcur_rolled_seqno = :sorlcur_seqno 
      and sorlcur_lmod_code = sb_curriculum_str.f_learner;
      
     cursor cnt_rolled_c is 
      select nvl(count(*),0)
      from sorlcur
      where sorlcur_pidm = :s$_curricula.module_pidm  
      and sorlcur_rolled_seqno = :sorlcur_seqno 
      and sorlcur_lmod_code = sb_curriculum_str.f_learner;
  begin 
   if nvl(:sovlcur_current_ind,'x') = 'Y' and 
	  sb_learnercurricstatus.f_is_active(:sorlcur_cact_code) = 'Y'   then 
    open cnt_rolled_grad_c;
	  fetch cnt_rolled_grad_c into cntact;
	  close cnt_rolled_grad_c;
	   
	  if cntact > 0 then 
	  		set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,
	  		G$_NLS.Get('SOQOLIB-0194', 'FORM','*WARNING* The originating learner curriculum may re-roll to a new degree because of the existing graduation application on the outcome.')); 
			  alert_button := show_alert('CURRICULUM_ERROR');
			  if alert_button = ALERT_BUTTON1 then
				     null;
 				end if;
	  end if;
   end if; 
   if cntact = 0 then 
   	
   	 open cnt_rolled_c;
	   fetch cnt_rolled_c into cntroll;
	   close cnt_rolled_c;
	   
	   if cntroll > 0 then 
	  		set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,
	  		G$_NLS.Get('SOQOLIB-0195', 'FORM','*WARNING* Deleting the Outcome Curriculum may result in an earlier unrolled learner curriculum rolling to outcome.')); 
			  alert_button := show_alert('CURRICULUM_ERROR');
			  if alert_button = ALERT_BUTTON1 then
				     null;
 				end if;
	  end if;
   end if; 
   	
  end; 
end if; 
 
  
if :sorlcur.sorlcur_gapp_seqno is not null and 
   :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then
  	message( G$_NLS.Get('SOQOLIB-0196', 'FORM','*ERROR* Learner curriculum with graduation application cannot be deleted.') );
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

if nvl(:deactivate_ind,'N') = 'I' then 
		message( G$_NLS.Get('SOQOLIB-0197', 'FORM','Invalid option after deactivation and insert, you must rollback changes.') );
    raise form_trigger_failure;
end if;

--
-- End default relation program section
--

soklcur.p_delete_sotlcur(p_pidm => :s$_curricula.module_pidm,
   p_seqno => nvl(:sorlcur_seqno,999));
soklcur.p_delete_sotlfos(p_pidm => :s$_curricula.module_pidm,
  p_lcur_seqno => nvl(:sorlcur_seqno,999));

 
if :sovlcur_rowid is not null then
	 :commplan_delete_trigger := 'Y'; 
end if; 

if :system.last_record = 'TRUE' and 
	:system.cursor_record = 1 then 
  :sorlcur_del_ind := 'Y'; -- set flag so new record inst doesnt try to query non exit row
else
	:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt - 1; 
	if :s$_curricula_traditional.lcur_rec_cnt = 0 then 
		:s$_curricula_traditional.lcur_rec_cnt := 1;
	end if;
	:sorlcur_del_ind := 'N';
end if;
:sorlfos_del_ind := 'N';
:dup_create_ind := 'N'; 
:delete_inprogress := 'Y';
go_block('sorlfos');
g$_check_failure;
clear_block(no_validate);
g$_check_failure;
go_block('sorlcur');
DELETE_RECORD;
g$_check_failure;
-- 
IF :lcur_delete_error = 'Y' THEN
	:prompt_lcur_commit := 'Y';
END IF;
-- 
:lfos_rec_num := 0;
:delete_inprogress := 'N';
:commplan_delete_trigger := 'Y'; 
IF :sovlcur_rowid IS NULL THEN
	execute_trigger('NEW_SORLCUR');
  G$_CHECK_FAILURE; 
END IF; 

  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sorlcur_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockDeleteAllowed("SORLCUR").equals(NBool.False))
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0188"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				// 
				getFormModel().getSCurriculaTraditional().setLcurDeleteError(toStr("N"));
				// 
				if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && !getFormModel().getSCurricula().getLearnerEffTerm().isNull() && sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0189"), toStr("FORM"), toStr("*ERROR* Cannot delete curriculum unless curriculum term equals key-block term.")));
					throw new ApplicationException();
				}
				// 
				//  do not allow the deletion of learner curriculum if it's current
				//  in another term 
				if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).equals("Y") )
				{
					{
						NInteger cntact = toInt(0);
						String sqlcntActiveC = "SELECT nvl(count(*), 0) " +
	" FROM sgvccur " +
	" WHERE sgvccur_pidm = :S___CURRICULA_MODULE_PIDM AND sgvccur_order > 0 AND sgvccur_seqno = :SORLCUR_SEQNO AND sgvccur_stdn_term_code_eff = :S___CURRICULA_MODULE_TERM_CODE AND sgvccur_term_code <> :S___CURRICULA_MODULE_TERM_CODE ";
						DataCursor cntActiveC = new DataCursor(sqlcntActiveC);
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
						cntActiveC.close();
						if ( cntact.greater(0) )
						{
							errorMessage(GNls.Fget(toStr("SOQOLIB-0190"), toStr("FORM"), toStr("*ERROR* Curriculum is active for another term and must be deleted from that effective term.")));
							throw new ApplicationException();
						}
					}
				}
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ALERT");
					NString dummyVar = toStr("N");
					String sqlsfrfaudLcurC = "SELECT 'Y' " +
	" FROM sfrfaud " +
	" WHERE sfrfaud_pidm = :SORLCUR_PIDM AND sfrfaud_lcur_seqno = :SORLCUR_SEQNO ";
					DataCursor sfrfaudLcurC = new DataCursor(sqlsfrfaudLcurC);
					if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && sorlcurElement.getSorlcurKeySeqno().notEquals(99) )
					{
						getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("Y"));
						if ((getCurrentTaskName().equals("SGASTDN")))
						{
							executeAction("SET_ACTIVE_REG_IND");
							getContainer().getGoqrpls().gCheckFailure();
						}
						if ( (getFormModel().getSCurriculaTraditional().getActiveRegInd().equals("N")) || (getCurrentTaskName().equals("SFAREGS")) )
						{
							//Setting query parameters
							sfrfaudLcurC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							sfrfaudLcurC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable sfrfaudLcurC.
							sfrfaudLcurC.open();
							ResultSet sfrfaudLcurCResults = sfrfaudLcurC.fetchInto();
							if ( sfrfaudLcurCResults != null ) {
								dummyVar = sfrfaudLcurCResults.getStr(0);
							}
							sfrfaudLcurC.close();
							// 
							if ( dummyVar.equals("Y") )
							{
								setAlertMessageText(alertId, GNls.Fget(toStr("SOQOLIB-0191"), toStr("FORM"), toStr("*WARNING* This curriculum record was used for fee assessment. Do you want to delete it?")));
								alertButton = toNumber(showAlert("CURRICULUM_ALERT"));
								if ( alertButton.equals(MessageServices.BUTTON2) )
								{
									return ;
								}
							}
						}
					}
				}
				//  do not allow the deletion of learner curriculum if it has an stsp in this term
				//  in another term 
				if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) && sorlcurElement.getSorlcurKeySeqno().notEquals(99) )
				{
					{
						NInteger cntstsp = toInt(0);
						NInteger cntotherstsp = toInt(0);
						NInteger cntotheract = toInt(0);
						NInteger cntcurr = toInt(0);
						NString activeInd= NString.getNull();
						String sqlcntOtherLcurC = "SELECT nvl(count(*), 0) " +
	" FROM sorlcur " +
	" WHERE sorlcur_lmod_code = sb_curriculum_str.f_learner AND sorlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sorlcur_key_seqno = :SORLCUR_KEY_SEQNO AND sorlcur_term_code = :SORLCUR_TERM_CODE AND sorlcur_seqno <> :SORLCUR_SEQNO ";
						DataCursor cntOtherLcurC = new DataCursor(sqlcntOtherLcurC);
						String sqlcntStspC = "SELECT nvl(count(*), 0) " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :S___CURRICULA_MODULE_PIDM AND sgrstsp_key_seqno = :SORLCUR_KEY_SEQNO AND sgrstsp_term_code_eff = :S___CURRICULA_MODULE_TERM_CODE ";
						DataCursor cntStspC = new DataCursor(sqlcntStspC);
						NString dummy = toStr("");
						String sqlregC = "SELECT 'Y' " +
	" FROM sfrstcr " +
	" WHERE sfrstcr_term_code BETWEEN :SORLCUR_TERM_CODE AND sb_studypath.f_end_term(:SORLCUR_PIDM, :SORLCUR_TERM_CODE, :SORLCUR_KEY_SEQNO) AND SFRSTCR_STSP_KEY_SEQUENCE = :SORLCUR_KEY_SEQNO AND sfrstcr_pidm = :SORLCUR_PIDM ";
						DataCursor regC = new DataCursor(sqlregC);
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						if ( !sorlcurElement.getRowState().equals(DataRowStatus.INSERTED) )
						{
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
							post();
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						}
						//Setting query parameters
						cntStspC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						cntStspC.addParameter("SORLCUR_KEY_SEQNO", sorlcurElement.getSorlcurKeySeqno());
						cntStspC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntStspC.
						cntStspC.open();
						ResultSet cntStspCResults = cntStspC.fetchInto();
						if ( cntStspCResults != null ) {
							cntstsp = cntStspCResults.getInteger(0);
						}
						cntStspC.close();
						if ( cntstsp.greater(0) )
						{
							// - study path with term exists 
							//Setting query parameters
							cntOtherLcurC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							cntOtherLcurC.addParameter("SORLCUR_KEY_SEQNO", sorlcurElement.getSorlcurKeySeqno());
							cntOtherLcurC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
							cntOtherLcurC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntOtherLcurC.
							cntOtherLcurC.open();
							ResultSet cntOtherLcurCResults = cntOtherLcurC.fetchInto();
							if ( cntOtherLcurCResults != null ) {
								cntotheract = cntOtherLcurCResults.getInteger(0);
							}
							cntOtherLcurC.close();
							// - if no other lcur then we'll be deleting the stsp 
							if ( cntotheract.equals(0) )
							{
								// -  cannot delete lcur if the stsp is last one on a degree
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								if ( SbStudypath.fDegreeExists(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/sorlcurElement.getSorlcurTermCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).equals("Y") )
								{
									getFormModel().getSCurriculaTraditional().setLcurDeleteError(toStr("Y"));
									errorMessage(GNls.Fget(toStr("SOQOLIB-0192"), toStr("FORM"), toStr("*ERROR* Delete not allowed. Study path has degree.")));
									throw new ApplicationException();
								}
								//   cannot delete lcur if the stsp is on a sfrstcr 
								//Setting query parameters
								regC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
								regC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
								regC.addParameter("SORLCUR_KEY_SEQNO", sorlcurElement.getSorlcurKeySeqno());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable regC.
								regC.open();
								ResultSet regCResults = regC.fetchInto();
								if ( regCResults != null ) {
									dummy = regCResults.getStr(0);
								}
								if ( regC.found() )
								{
									regC.close();
									getFormModel().getSCurriculaTraditional().setLcurDeleteError(toStr("Y"));
									errorMessage(GNls.Fget(toStr("SOQOLIB-0193"), toStr("FORM"), toStr("*ERROR* Delete not allowed. Registration exists for the study path.")));
									throw new ApplicationException();
								}
								else {
									regC.close();
								}
							}
						}
					}
				}
				//  do not allow deletion of an outcome if it has a grad app ,and the original learner
				//  record is not  attached to the grad app 
				if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()) )
				{
					{
						NInteger cntact = toInt(0);
						AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
						NNumber alertButton= NNumber.getNull();
						NInteger cntroll = toInt(0);
						String sqlcntRolledGradC = "SELECT nvl(count(*), 0) " +
	" FROM sorlcur " +
	" WHERE sorlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sorlcur_gapp_seqno IS NOT NULL AND sorlcur_rolled_seqno = :SORLCUR_SEQNO AND sorlcur_lmod_code = sb_curriculum_str.f_learner ";
						DataCursor cntRolledGradC = new DataCursor(sqlcntRolledGradC);
						String sqlcntRolledC = "SELECT nvl(count(*), 0) " +
	" FROM sorlcur " +
	" WHERE sorlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sorlcur_rolled_seqno = :SORLCUR_SEQNO AND sorlcur_lmod_code = sb_curriculum_str.f_learner ";
						DataCursor cntRolledC = new DataCursor(sqlcntRolledC);
						if ( isNull(sorlcurElement.getSovlcurCurrentInd(), "x").equals("Y") && SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).equals("Y") )
						{
							//Setting query parameters
							cntRolledGradC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							cntRolledGradC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntRolledGradC.
							cntRolledGradC.open();
							ResultSet cntRolledGradCResults = cntRolledGradC.fetchInto();
							if ( cntRolledGradCResults != null ) {
								cntact = cntRolledGradCResults.getInteger(0);
							}
							cntRolledGradC.close();
							if ( cntact.greater(0) )
							{
								setAlertMessageText(alertId, GNls.Fget(toStr("SOQOLIB-0194"), toStr("FORM"), toStr("*WARNING* The originating learner curriculum may re-roll to a new degree because of the existing graduation application on the outcome.")));
								alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
							}
						}
						if ( cntact.equals(0) )
						{
							//Setting query parameters
							cntRolledC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							cntRolledC.addParameter("SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntRolledC.
							cntRolledC.open();
							ResultSet cntRolledCResults = cntRolledC.fetchInto();
							if ( cntRolledCResults != null ) {
								cntroll = cntRolledCResults.getInteger(0);
							}
							cntRolledC.close();
							if ( cntroll.greater(0) )
							{
								setAlertMessageText(alertId, GNls.Fget(toStr("SOQOLIB-0195"), toStr("FORM"), toStr("*WARNING* Deleting the Outcome Curriculum may result in an earlier unrolled learner curriculum rolling to outcome.")));
								alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
							}
						}
					}
				}
				if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0196"), toStr("FORM"), toStr("*ERROR* Learner curriculum with graduation application cannot be deleted.")));
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
				if ( isNull(sorlcurElement.getDeactivateInd(), "N").equals("I") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0197"), toStr("FORM"), toStr("Invalid option after deactivation and insert, you must rollback changes.")));
					throw new ApplicationException();
				}
				// 
				//  End default relation program section
				// 
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				}
				if ( isInLastRecord() && getCursorRecord().equals(1) )
				{
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("Y"));
				}
				else {
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().subtract(1));
					if ( getFormModel().getSCurriculaTraditional().getLcurRecCnt().equals(0) )
					{
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(toInt(1));
					}
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
				}
				getFormModel().getSCurricula().setSorlfosDelInd(toStr("N"));
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				getFormModel().getSCurricula().setDeleteInprogress(toStr("Y"));
				goBlock(toStr("sorlfos"));
				getContainer().getGoqrpls().gCheckFailure();
				clearBlock(TaskServices.NO_VALIDATE);
				getContainer().getGoqrpls().gCheckFailure();
				goBlock(toStr("sorlcur"));
				deleteRecord();
				getContainer().getGoqrpls().gCheckFailure();
				//  
				if ( getFormModel().getSCurriculaTraditional().getLcurDeleteError().equals("Y") )
				{
					getFormModel().getSCurriculaTraditional().setPromptLcurCommit(toStr("Y"));
				}
				//  
				getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
				getFormModel().getSCurricula().setDeleteInprogress(toStr("N"));
				getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("Y"));
				if ( sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("NEW_SORLCUR");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-DUPREC
		 execute_trigger('query_only');
g$_check_failure;

if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0198', 'FORM','Invalid option for query only.') );
	return;
end if;

if nvl(:dup_create_ind,'N') <>  'Y' then 
	message( G$_NLS.Get('SOQOLIB-0199', 'FORM','Insert record to duplicate record into.') );
	raise form_trigger_failure;
end if; 



declare 
	save_lcur  sorlcur.sorlcur_seqno%TYPE := null;
	save_current  varchar2(1) := NULL; 
	loop_cnt    number := 1; 
	count_lfos  number := 0; 
	CURSOR sorlfos_cnt_c IS
	  select nvl(count(*),0)
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and ( ( save_current = 'Y' and sovlfos_current_ind = 'Y')
	     or save_current = 'N')
	  and sovlfos_active_ind = 'Y';
	  
	CURSOR sorlfos_c IS
	  select sovlfos_lfst_code, sovlfos_majr_code,
	     sovlfos_term_code,  sovlfos_priority_no,
	     sovlfos_conc_attach_rule,  sovlfos_lfos_rule ,
	     sovlfos_dept_code, sovlfos_majr_code_attach,
	     sovlfos_cact_code, sovlfos_csts_code,
	     sovlfos_term_code_ctlg 
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and sovlfos_active_ind = 'Y'
	  and ( ( save_current = 'Y' and sovlfos_current_ind = 'Y')
	     or save_current = 'N')
	  order by decode(sovlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', 
	     sb_fieldofstudy_str.f_minor, '3',
	     sb_fieldofstudy_str.f_concentration, '3', 4),
	     sovlfos_priority_no;
	     
 	  save_priority_no        sorlcur.sorlcur_priority_no%type; 
	  alert_button  number := 0;
	  lv_gapp_seqno sorlcur.sorlcur_gapp_seqno%type := null; 
begin 
-- save the priority no 
--- duplicate the record   
duplicate_record;
 
:dup_create_ind := 'N';
 
 
--- process grad app 
 if :sorlcur.sorlcur_gapp_seqno is not null and 
  	:sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner and 
    	:sorlcur.sorlcur_rolled_seqno is null and 
    	 sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
    	    p_seqno => :sorlcur.sorlcur_gapp_seqno) = 'Y'   then 
    	   
       	alert_button := show_alert('CURRICULUM_COPY_GAPP_ALERT');
        if alert_button = ALERT_BUTTON1 then
          lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
        elsif alert_button = ALERT_BUTTON2 then  
          lv_gapp_seqno := null;
          sb_gradapp.p_update 
   	       (p_pidm => :sorlcur.sorlcur_pidm,
   	        p_seqno => :sorlcur.sorlcur_gapp_seqno,
   	        p_gast_code => sb_gradapp_strings.f_inactive,  
   	        p_USER_ID                => gb_common.f_sct_user,
            p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ); 
        else 
          :save_priority_no  := null; 
       end if;
 --- copy the grad app if this is an outcome 
 elsif :sorlcur.sorlcur_gapp_seqno is not null and 
   	  :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_outcome then  
   	   if soklcur.f_rolled_awarded (p_pidm => :sorlcur.sorlcur_pidm,
           P_lmod_code =>  :sorlcur.sorlcur_lmod_code, 
           P_key_seqno => :sorlcur.sorlcur_key_seqno) <> 'Y' then  
   	     lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
   	   else
   	   	 lv_gapp_seqno := null;
   	   end if; 
  end if; 

-- set up fields for duplicate 
:sorlcur.sorlcur_duplicate_ind := 'Y';
--if :sorlcur.sorlcur_priority_no is null then 
:sorlcur.sorlcur_priority_no := save_priority_no;
  --- execute_trigger('calc_new_priority');
--end if; 
save_current := :sovlcur_current_ind;
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 
save_lcur := :sorlcur.sorlcur_seqno;
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
:sorlcur.sorlcur_rolled_seqno := null;
:sorlcur.LCUR_ROLLED_KEY_SEQNO := null; 
:sorlcur.sovlcur_appl_seqno := null;
:sorlcur.sorlcur_gapp_seqno := lv_gapp_seqno;
:sorlcur.sovlcur_appl_key_seqno := null; 
:sorlcur.sovlcur_current_ind := null;
:sorlcur.sorlcur_priority_no := :save_priority_no; 
-- RPE to not clear out status when dup record occurs 1-410eo
--:sorlcur.sorlcur_cact_code := null; 

:sovlcur_rowid := NULL; 
:sorlcur_term_code := :s$_curricula.module_term_code;
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
       :sorlfos.sorlfos_lfst_code, :sorlfos.sorlfos_majr_code,
	     :sorlfos.sorlfos_term_code,  :sorlfos.sorlfos_priority_no,
	     :sorlfos.sorlfos_conc_attach_rule,  :sorlfos.sorlfos_lfos_rule,
	     :sorlfos_dept_code, :sorlfos_majr_code_attach,
	     :sorlfos_cact_code, :sorlfos_csts_code,
	     :sorlfos_term_code_ctlg ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code; 
	:sovlfos_rowid := null;
	:sorlfos_current_ind := null; 
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
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 
go_block('sorlcur');
:system.message_level := '0'; 
:sorlcur_duplicate_ind := 'N'; 
end; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sorlcur_CopyRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0198"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ( isNull(getFormModel().getSCurricula().getDupCreateInd(), "N").notEquals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0199"), toStr("FORM"), toStr("Insert record to duplicate record into.")));
					throw new ApplicationException();
				}
				{
					NNumber saveLcur = NNumber.getNull();
					NString saveCurrent = NString.getNull();
					NNumber loopCnt = toNumber(1);
					NNumber countLfos = toNumber(0);
					String sqlsorlfosCntC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND ((:P_SAVE_CURRENT = 'Y' AND sovlfos_current_ind = 'Y') OR :P_SAVE_CURRENT = 'N') AND sovlfos_active_ind = 'Y' ";
					DataCursor sorlfosCntC = new DataCursor(sqlsorlfosCntC);
					String sqlsorlfosC = "SELECT sovlfos_lfst_code, sovlfos_majr_code, sovlfos_term_code, sovlfos_priority_no, sovlfos_conc_attach_rule, sovlfos_lfos_rule, sovlfos_dept_code, sovlfos_majr_code_attach, sovlfos_cact_code, sovlfos_csts_code, sovlfos_term_code_ctlg " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND sovlfos_active_ind = 'Y' AND ((:P_SAVE_CURRENT = 'Y' AND sovlfos_current_ind = 'Y') OR :P_SAVE_CURRENT = 'N') " +
	" ORDER BY decode(sovlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sovlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					NNumber savePriorityNo= NNumber.getNull();
					NNumber alertButton = toNumber(0);
					NNumber lvGappSeqno = NNumber.getNull();
					//  save the priority no 
					// - duplicate the record   
					duplicateRecord();
					getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
					// - process grad app 
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && sorlcurElement.getSorlcurRolledSeqno().isNull() && SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("Y") )
					{
						alertButton = toNumber(showAlert("CURRICULUM_COPY_GAPP_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
						}
						else if ( alertButton.equals(MessageServices.BUTTON2) ) {
							lvGappSeqno = toNumber(null);
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							SbGradapp.pUpdate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno(), toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
						}
						else {
							getFormModel().getSCurricula().setSavePriorityNo(toNumber(null));
						}
					}
					else if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) ) {
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						if ( Soklcur.fRolledAwarded(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).notEquals("Y") )
						{
							lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
						}
						else {
							lvGappSeqno = toNumber(null);
						}
					}
					//  set up fields for duplicate 
					sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
					// if :sorlcur.sorlcur_priority_no is null then 
					sorlcurElement.setSorlcurPriorityNo(savePriorityNo);
					// - execute_trigger('calc_new_priority');
					// end if; 
					saveCurrent = sorlcurElement.getSovlcurCurrentInd();
					getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
					saveLcur = sorlcurElement.getSorlcurSeqno();
					sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
					sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
					sorlcurElement.setSorlcurRolledSeqno(toNumber(null));
					sorlcurElement.setLcurRolledKeySeqno(toNumber(null));
					sorlcurElement.setSovlcurApplSeqno(toNumber(null));
					sorlcurElement.setSorlcurGappSeqno(lvGappSeqno);
					sorlcurElement.setSovlcurApplKeySeqno(toNumber(null));
					sorlcurElement.setSovlcurCurrentInd(toStr(null));
					sorlcurElement.setSorlcurPriorityNo(getFormModel().getSCurricula().getSavePriorityNo());
					//  RPE to not clear out status when dup record occurs 1-410eo
					// :sorlcur.sorlcur_cact_code := null; 
					sorlcurElement.setSovlcurRowid(toStr(null));
					sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					nextBlock();
					clearBlock();
					// - count number of sorlfos there are to copy 
					//Setting query parameters
					sorlfosCntC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
					sorlfosCntC.addParameter("P_SAVE_LCUR", saveLcur);
					sorlfosCntC.addParameter("P_SAVE_CURRENT", saveCurrent);
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
						sorlfosC.addParameter("P_SAVE_CURRENT", saveCurrent);
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
								sorlfosElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
								sorlfosElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
								sorlfosElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
								sorlfosElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
								sorlfosElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
								sorlfosElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
								sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(6));
								sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(7));
								sorlfosElement.setSorlfosCactCode(sorlfosCResults.getStr(8));
								sorlfosElement.setSorlfosCstsCode(sorlfosCResults.getStr(9));
								sorlfosElement.setSorlfosTermCodeCtlg(sorlfosCResults.getStr(10));
							}
							if ( sorlfosC.notFound() ) 
								break;
							sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
							sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
							sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSovlfosRowid(toStr(null));
							sorlfosElement.setSorlfosCurrentInd(toStr(null));
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
						}
						sorlfosC.close();
						firstRecord();
					}
					goBlock(toStr("sorlcur"));
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-NXTBLK
		 
if :sorlcur_del_ind = 'Y' then 
	return;
end if; 
if :sorlcur.sovlcur_rowid is null then 
	-- test the commit for nulls and other errors 
  IF :sorlcur_priority_no  IS NULL THEN
	  go_item('SORLCUR_PRIORITY_NO');
  	message( G$_NLS.Get('SOQOLIB-0200', 'FORM','*Error* Enter required priority number before navigating to fields of study.') ); 
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
  IF :sorlcur_term_code  IS NULL THEN
    go_item('SORLCUR_TERM_CODE');
	  message( G$_NLS.Get('SOQOLIB-0201', 'FORM','*Error* Enter required term code.') ); 
	  RAISE FORM_TRIGGER_FAILURE;
  END IF;
	next_block;
	if :s$_curricula.default_major = '' then 
  	:sorlfos.sorlfos_cact_code := :s$_curricula.default_cact;
    :sorlfos.sorlfos_term_code := :sorlcur.sorlcur_term_code;
    :sorlfos.sorlfos_csts_code := :s$_curricula.default_csts; 
  end if; 
else 
		
	next_block;
  g$_check_failure;
 
	if get_block_property('SORLFOS',STATUS) <> 'CHANGED' THEN 
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
		 * SORLCUR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sorlcur_NextBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getFormModel().getSCurricula().getSorlcurDelInd().equals("Y") )
				{
					return ;
				}
				if ( sorlcurElement.getSovlcurRowid().isNull() )
				{
					//  test the commit for nulls and other errors 
					if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
					{
						goItem(toStr("SORLCUR_PRIORITY_NO"));
						errorMessage(GNls.Fget(toStr("SOQOLIB-0200"), toStr("FORM"), toStr("*Error* Enter required priority number before navigating to fields of study.")));
						throw new ApplicationException();
					}
					if ( sorlcurElement.getSorlcurTermCode().isNull() )
					{
						goItem(toStr("SORLCUR_TERM_CODE"));
						errorMessage(GNls.Fget(toStr("SOQOLIB-0201"), toStr("FORM"), toStr("*Error* Enter required term code.")));
						throw new ApplicationException();
					}
					nextBlock();
					if ( getFormModel().getSCurricula().getDefaultMajor().equals("") )
					{
						sorlfosElement.setSorlfosCactCode(getFormModel().getSCurricula().getDefaultCact());
						sorlfosElement.setSorlfosTermCode(sorlcurElement.getSorlcurTermCode());
						sorlfosElement.setSorlfosCstsCode(getFormModel().getSCurricula().getDefaultCsts());
					}
				}
				else {
					nextBlock();
					getContainer().getGoqrpls().gCheckFailure();
					if (!getBlockStatus("SORLFOS").equals("CHANGED") )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						executeQuery();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-NXTREC
		 	-- stop then if outstanding changes 
	if  get_block_property('SORLCUR',STATUS) = 'CHANGED' OR 
			get_block_property('SORLFOS',STATUS) = 'CHANGED' THEN
			message( G$_NLS.Get('SOQOLIB-0202', 'FORM','Commit changes for this curriculum.') );
			raise form_trigger_failure;
	end if; 
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 
	IF :System.Last_Record <> 'TRUE' THEN
	  
		next_Record;
		g$_check_failure;
		if :sovlcur_rowid is not null then  
			:system.message_level := '5';
	  	next_block;
		  clear_block;
		  execute_query;
		  previous_block;
		 	:system.message_level := '0';
		end if;
		
 ELSE 
			execute_trigger('query_only');
      g$_check_failure;
			IF get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
		     then Message( G$_NLS.Get('SOQOLIB-0203', 'FORM','At last record.') );
			else 
				
			  if :s$_curricula.module_insert_restriction is not null then 
	         message(:s$_curricula.module_insert_restriction);

	      else 
	        if :s$_curricula.module_insert_warning is not null then 
          	message(:s$_curricula.module_insert_warning);
	        end if;
	        :save_priority_no := :sorlcur.sorlcur_priority_no;
			    next_record; 
			    g$_check_failure;
			    :system.message_level := '5';
	        next_block;
		      clear_block;
		      previous_block;
		 	    :system.message_level := '0';
		 	    :dup_create_ind := 'Y'; 
		 	    :deactivate_ind := null;
		 	    :s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 1;
		 	    execute_trigger('NEW_SORLCUR');
		 	    G$_CHECK_FAILURE; 
        end if;
	    end if;
  END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sorlcur_NextRecord()
		{
			
				//  stop then if outstanding changes 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				//  stop then if outstanding changes 
				if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0202"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
					throw new ApplicationException();
				}
				//  ** If we're not at the bottom, then go to the last record 
				if ( !isInLastRecord() )
				{
					nextRecord();
					getContainer().getGoqrpls().gCheckFailure();
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						executeQuery();
						previousBlock();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
				else {
					executeAction("query_only");
					getContainer().getGoqrpls().gCheckFailure();
					if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
					{
						infoMessage(GNls.Fget(toStr("SOQOLIB-0203"), toStr("FORM"), toStr("At last record.")));
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
							getFormModel().getSCurricula().setSavePriorityNo(sorlcurElement.getSorlcurPriorityNo());
							nextRecord();
							getContainer().getGoqrpls().gCheckFailure();
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
							nextBlock();
							clearBlock();
							previousBlock();
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
							getFormModel().getSCurricula().setDupCreateInd(toStr("Y"));
							sorlcurElement.setDeactivateInd(toStr(null));
							getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(1));
							executeAction("NEW_SORLCUR");
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-PRVREC
		 
  
		   
	     IF :SYSTEM.LAST_RECORD = 'TRUE' AND 
         get_block_property('SORLCUR',INSERT_ALLOWED) = 'TRUE' AND
          :sovlcur_rowid is null and 
          :sorlcur_priority_no is null and 
          :sorlcur_levl_code  is null and 
          :sorlcur_coll_code  is null and 
          :sorlcur_degc_code  is null and 
			  	:system.record_status <> 'CHANGED' then 
			  	delete_record;
			  	:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt - 1; 

			  	if :sovlcur_rowid is not null then 
		      	 :system.message_level := '5';  
		  	     next_block;
			       clear_block;
			       execute_query;
			       previous_block;
			     	 :system.message_level := '0'; 
		     	end if;
	     else 
	       if  get_block_property('SORLCUR',STATUS) = 'CHANGED' OR 
			    	get_block_property('SORLFOS',STATUS) = 'CHANGED' THEN
			  	  message( G$_NLS.Get('SOQOLIB-0204', 'FORM','Commit changes for this curriculum.') );
			  	  raise form_trigger_failure;
		     end if;

	  	  	previous_Record;
	  	  	g$_check_failure;
		     	if :sovlcur_rowid is not null then 
		      	 :system.message_level := '5';  
		  	     next_block;
			       clear_block;
			       execute_query;
			       previous_block;
			     	 :system.message_level := '0'; 
		     	end if;
		    end if; 
	       
 
 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sorlcur_PreviousRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( isInLastRecord() && getBlockInsertAllowed("SORLCUR").equals("TRUE") && sorlcurElement.getSovlcurRowid().isNull() && sorlcurElement.getSorlcurPriorityNo().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurDegcCode().isNull() && !getRecordStatus().equals("CHANGED") )
				{
					deleteRecord();
					getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().subtract(1));
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						executeQuery();
						previousBlock();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
				else {
					if ( getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED") )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0204"), toStr("FORM"), toStr("Commit changes for this curriculum.")));
						throw new ApplicationException();
					}
					previousRecord();
					getContainer().getGoqrpls().gCheckFailure();
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						executeQuery();
						previousBlock();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-SCRUP
		 do_key('previous_record'); 
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void sorlcur_KeyScrup()
		{
			
				executeAction("PREVIOUS_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.KEY-SCRDOWN
		 

do_key('NEXT_RECORD');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void sorlcur_KeyScrdown()
		{
			
				executeAction("NEXT_RECORD");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.POST-INSERT
		 --
-- Enable study path tab only if student has existing study paths.  
--

DECLARE
	lv_found     VARCHAR2(1)  := 'N';
  page_id      TAB_PAGE;

  CURSOR sp_exists IS
     SELECT 'Y' 
     FROM  sgrstsp
     WHERE sgrstsp_pidm = :sorlcur.sorlcur_pidm; 
--     
BEGIN
	page_id := FIND_TAB_PAGE( 'STUDY_PATH' );
	IF NOT ID_NULL(page_id) THEN
  	IF :SYSTEM.CURRENT_FORM IN ('SGASTDN','SFAREGS') THEN  
	    OPEN sp_exists;
	    FETCH sp_exists INTO lv_found;
	    CLOSE sp_exists;   
  	  IF lv_found = 'Y' THEN
       	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
           G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_TRUE','STUDY_PATH');
       	END IF;
      ELSE
         IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
            G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_FALSE','STUDY_PATH');
	       END IF;
	    END IF;
   	END IF; 
  END IF;
END;


	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void sorlcur_AfterRowInsert(RowAdapterEvent args)
		{
			
				// 
				//  Enable study path tab only if student has existing study paths.  
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				int rowCount = 0;
				{
					NString lvFound = toStr("N");
					TabPageDescriptor pageId= null;
					String sqlspExists = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_SORLCUR_PIDM ";
					DataCursor spExists = new DataCursor(sqlspExists);
					pageId = findTabPage("STUDY_PATH");
					if ( !(pageId == null) )
					{
						if ( in(getCurrentTaskName(), "SGASTDN", "SFAREGS").getValue() )
						{
							//Setting query parameters
							spExists.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable spExists.
							spExists.open();
							ResultSet spExistsResults = spExists.fetchInto();
							if ( spExistsResults != null ) {
								lvFound = spExistsResults.getStr(0);
							}
							spExists.close();
							if ( lvFound.equals("Y") )
							{
								if ( getTabPageEnabled(pageId)==false )
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("STUDY_PATH"));
								}
							}
							else {
								if ( getTabPageEnabled(pageId)==true )
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("STUDY_PATH"));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.POST-DELETE
		 --
-- Enable study path tab only if student has existing study paths.  
--

DECLARE
	lv_found     VARCHAR2(1)  := 'N';
  page_id      TAB_PAGE;

  CURSOR sp_exists IS
     SELECT 'Y' 
     FROM  sgrstsp
     WHERE sgrstsp_pidm = :sorlcur.sorlcur_pidm; 
--     
BEGIN
	page_id := FIND_TAB_PAGE( 'STUDY_PATH' );
	IF NOT ID_NULL(page_id) THEN
  	IF :SYSTEM.CURRENT_FORM IN ('SGASTDN','SFAREGS') THEN  
	    OPEN sp_exists;
	    FETCH sp_exists INTO lv_found;
	    CLOSE sp_exists;   
  	  IF lv_found = 'Y' THEN
       	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
           G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_TRUE','STUDY_PATH');
       	END IF;
      ELSE
         IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
            G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_FALSE','STUDY_PATH');
	       END IF;
	    END IF;
   	END IF; 
  END IF;
END;



	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void sorlcur_AfterRowDelete(RowAdapterEvent args)
		{
			
				// 
				//  Enable study path tab only if student has existing study paths.  
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				int rowCount = 0;
				{
					NString lvFound = toStr("N");
					TabPageDescriptor pageId= null;
					String sqlspExists = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_SORLCUR_PIDM ";
					DataCursor spExists = new DataCursor(sqlspExists);
					pageId = findTabPage("STUDY_PATH");
					if ( !(pageId == null) )
					{
						if ( in(getCurrentTaskName(), "SGASTDN", "SFAREGS").getValue() )
						{
							//Setting query parameters
							spExists.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable spExists.
							spExists.open();
							ResultSet spExistsResults = spExists.fetchInto();
							if ( spExistsResults != null ) {
								lvFound = spExistsResults.getStr(0);
							}
							spExists.close();
							if ( lvFound.equals("Y") )
							{
								if ( getTabPageEnabled(pageId).equals(NBool.False))
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("STUDY_PATH"));
								}
							}
							else {
								if ( getTabPageEnabled(pageId)==true )
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("STUDY_PATH"));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.POST-UPDATE
		 --
-- Enable study path tab only if student has existing study paths.  
--

DECLARE
	lv_found     VARCHAR2(1)  := 'N';
  page_id      TAB_PAGE;

  CURSOR sp_exists IS
     SELECT 'Y' 
     FROM  sgrstsp
     WHERE sgrstsp_pidm = :sorlcur.sorlcur_pidm; 
--     
BEGIN
	page_id := FIND_TAB_PAGE( 'STUDY_PATH' );
	IF NOT ID_NULL(page_id) THEN
  	IF :SYSTEM.CURRENT_FORM IN ('SGASTDN','SFAREGS') THEN  
	    OPEN sp_exists;
	    FETCH sp_exists INTO lv_found;
	    CLOSE sp_exists;   
  	  IF lv_found = 'Y' THEN
       	IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'FALSE' THEN
           G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_TRUE','STUDY_PATH');
       	END IF;
      ELSE
         IF GET_TAB_PAGE_PROPERTY(page_id, ENABLED) = 'TRUE' THEN
            G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(page_id,'ENABLED','PROPERTY_FALSE','STUDY_PATH');
	       END IF;
	    END IF;
   	END IF; 
  END IF;
END;



	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void sorlcur_AfterRowUpdate(RowAdapterEvent args)
		{
			
				// 
				//  Enable study path tab only if student has existing study paths.  
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				int rowCount = 0;
				{
					NString lvFound = toStr("N");
					TabPageDescriptor pageId= null;
					String sqlspExists = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_SORLCUR_PIDM ";
					DataCursor spExists = new DataCursor(sqlspExists);
					pageId = findTabPage("STUDY_PATH");
					if ( !(pageId == null) )
					{
						if ( in(getCurrentTaskName(), "SGASTDN", "SFAREGS").getValue() )
						{
							//Setting query parameters
							spExists.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable spExists.
							spExists.open();
							ResultSet spExistsResults = spExists.fetchInto();
							if ( spExistsResults != null ) {
								lvFound = spExistsResults.getStr(0);
							}
							spExists.close();
							if ( lvFound.equals("Y") )
							{
								if ( getTabPageEnabled(pageId).equals(NBool.False))
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("STUDY_PATH"));
								}
							}
							else {
								if ( getTabPageEnabled(pageId)==true)
								{
									getContainer().getGoqrpls().getGTabSecurity().gSetTabPageProperty(pageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("STUDY_PATH"));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.PRE-DELETE
		 --
-- Begin default relation program section
--
BEGIN
  --
  -- Begin SORLFOS detail program section
  --
   DELETE FROM sovlfos s
   WHERE s.SOVLFOS_PIDM = :SORLCUR.SORLCUR_PIDM and s.SOVLFOS_LCUR_SEQNO = :SORLCUR.SORLCUR_SEQNO;
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
		 * SORLCUR.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void sorlcur_BeforeRowDelete(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation program section
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				int rowCount = 0;
				// 
				//  Begin SORLFOS detail program section
				// 
				String sql1 = "DELETE FROM sovlfos s" +
	" WHERE s.SOVLFOS_PIDM = :SORLCUR_SORLCUR_PIDM AND s.SOVLFOS_LCUR_SEQNO = :SORLCUR_SORLCUR_SEQNO";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
				command1.addParameter("SORLCUR_SORLCUR_SEQNO", sorlcurElement.getSorlcurSeqno());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.PRE-INSERT
		 if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    raise form_trigger_failure;
	 end if; 
end if;

if :sorlcur.sorlcur_cact_code is null then
  :sorlcur.sorlcur_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlcur.sorlcur_term_code is null then 
  :sorlcur.sorlcur_term_code := :s$_curricula.module_term_code;
  :sorlcur.sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur.sorlcur_term_code);
end if; 
if sb_learnercurricstatus.f_is_active(p_cact_code => :sorlcur.sorlcur_cact_code) = 'N' then 
	 :commplan_delete_trigger := 'I';
end if; 
 --F2J_TODO: Change global current_user01 to current_user
:sorlcur_user_id := :global.current_user01; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sorlcur_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


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
					sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				if ( SbLearnercurricstatus.fIsActive(/*pCactCode=>*/sorlcurElement.getSorlcurCactCode()).equals("N") )
				{
					getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("I"));
				}
				// F2J_TODO: Change global current_user01 to current_user
				sorlcurElement.setSorlcurUserId(getGlobal("CURRENT_USER01"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.PRE-BLOCK
		  set_item_property('NEXT_REC_BTN',ENABLED, property_true); 
 set_item_property('PREV_RECORD_BTN',ENABLED, property_true); 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void sorlcur_blockIn()
		{
			
				setItemEnabled("NEXT_REC_BTN", true);
				setItemEnabled("PREV_RECORD_BTN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.ONLOCK
		 BEGIN
  SB_CURRICULUM.P_LOCK(
     p_PIDM                   =>:SORLCUR.SORLCUR_PIDM,
     p_SEQNO                  =>:SORLCUR.SORLCUR_SEQNO,
     p_ROWID_INOUT            =>:SORLCUR.ROWID);
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
		 * SORLCUR.ONLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ONLOCK")
		public void sorlcur_Onlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<NString> p_rowid_inout_ref = new Ref<NString>();
					SbCurriculum.pLock(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), p_rowid_inout_ref);
					sorlcurElement.setROWID(p_rowid_inout_ref.val);
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.ON-INSERT
		 
-- ON-INSERT Trigger
--
DECLARE
  alert_button number;
  alert_id  ALERT := FIND_ALERT('CURRICULUM_ERROR');
  cem_msg varchar2(2000) := ''; 
  curr_rec sorlcur%rowtype;
  lv_learner_seqno  sorlcur.sorlcur_key_seqno%type; 
  lvrowid                varchar2(18);  
BEGIN
	--- record is in insert mode but no data was entered 
	if :sorlcur_degc_code is null and :sorlcur_coll_code is null and 
		:sorlcur_camp_code is null and :sorlcur_levl_code is null and 
		:sorlcur_program is null and :sorlcur_priority_no is null   
		 then 
		   return;
	end if;
	
	if :sorlcur_program = '************' then 
   	 :sorlcur_program := '';
	end if;
	
  IF :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
		( :s$_curricula.learner_eff_term IS NOT NULL and 
		   :s$_curricula.learner_eff_term <> :s$_curricula.module_term_code) 
		THEN
		  sb_learner.p_copy_learner
		    (p_pidm =>  :sorlcur_pidm,
		     p_term_code_old => :s$_curricula.learner_eff_term,
		     p_term_code_new => :s$_curricula.module_term_code); 
		  :s$_curricula.learner_eff_term := :s$_curricula.module_term_code; 
      :s$_curricula.module_end_term := sb_learner.f_query_end(:sorlcur_pidm, :s$_curricula.module_term_code);
        soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
        p_term_code =>  :s$_curricula.module_term_code,
        p_lmod_code => :s$_curricula.module_code);
  END IF; 
  IF :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
  	  :SORLCUR.SORLCUR_KEY_SEQNO <> 99 and :global.study_path = 'Y' then 
  	 
  	 soklcur.p_copy_studypath 
     (  p_pidm        => :sorlcur_pidm ,
         p_term_code_old   => :s$_curricula.module_term_code,
         p_term_code_new   => :sorlcur_term_code,
         p_keyseqno    => :sorlcur_key_seqno) ; 
     :sorlcur.sorlcur_seqno := ''; 
 
  	end if; 
  	-- create the study path 
   	
   IF :sorlcur_lmod_code = sb_curriculum_str.f_learner and 
  	  nvl(:SORLCUR.SORLCUR_KEY_SEQNO,99) = 99 and :global.study_path = 'Y' then 
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
                  p_user_id                   => gb_common.f_sct_user,
                  p_rowid_out             =>  lvrowid ) ;
          
         :sorlcur_key_seqno := lv_learner_seqno; 
      end if; 	    
  
   end if; 
  SB_curriculum.P_CREATE(
     p_PIDM                   =>:SORLCUR.SORLCUR_PIDM,
     p_SEQNO                  => :sorlcur.sorlcur_seqno,
     p_LMOD_CODE              =>:SORLCUR.SORLCUR_LMOD_CODE,
     p_TERM_CODE              =>:SORLCUR.SORLCUR_TERM_CODE,
     p_KEY_SEQNO              => nvl(:SORLCUR.SORLCUR_KEY_SEQNO,:s$_curricula.MODULE_KEY_SEQNO), 
     p_PRIORITY_NO            =>:SORLCUR.SORLCUR_PRIORITY_NO,
     p_ROLL_IND               =>:SORLCUR.SORLCUR_ROLL_IND,
     p_CACT_CODE              =>:SORLCUR.SORLCUR_CACT_CODE,
     p_USER_ID                => :sorlcur.sorlcur_user_id,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_LEVL_CODE              =>:SORLCUR.SORLCUR_LEVL_CODE,
     p_COLL_CODE              =>:SORLCUR.SORLCUR_COLL_CODE,
     p_DEGC_CODE              =>:SORLCUR.SORLCUR_DEGC_CODE,
     p_TERM_CODE_CTLG         =>:SORLCUR.SORLCUR_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLCUR.SORLCUR_TERM_CODE_END,
     p_TERM_CODE_MATRIC       =>:SORLCUR.SORLCUR_TERM_CODE_MATRIC,
     p_TERM_CODE_ADMIT        =>:SORLCUR.SORLCUR_TERM_CODE_ADMIT,
     p_ADMT_CODE              =>:SORLCUR.SORLCUR_ADMT_CODE,
     p_CAMP_CODE              =>:SORLCUR.SORLCUR_CAMP_CODE,
     p_PROGRAM                =>:SORLCUR.SORLCUR_PROGRAM,
     p_START_DATE             =>:SORLCUR.SORLCUR_START_DATE,
     p_END_DATE               =>:SORLCUR.SORLCUR_END_DATE,
     p_CURR_RULE              =>:SORLCUR.SORLCUR_CURR_RULE,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              =>:SOVLCUR_ROWID,
     p_seqno_out              => :sorlcur.sorlcur_seqno, 
     p_curr_error_out         => :sorlcur.curr_error,
     p_override_severity      => 'N',
     p_severity_out           => :sorlcur.severity_out ,
     p_site_code              => :sorlcur.sorlcur_site_code,
     p_rate_code              => :sorlcur.sorlcur_rate_code,
     p_acyr_code              => :sorlcur.sorlcur_acyr_code,
     p_styp_code              => :sorlcur.sorlcur_styp_code,
     p_leav_code              => :sorlcur.sorlcur_leav_code,
     p_leav_from_date         => :sorlcur.sorlcur_leav_from_date,
     p_leav_to_date           => :sorlcur.sorlcur_leav_to_date,
     p_exp_grad_date          => :sorlcur.sorlcur_exp_grad_date,
     p_term_code_grad         => :sorlcur.sorlcur_term_code_grad ,
     p_gapp_seqno             => :SORLCUR.SORLCUR_GAPP_SEQNO,
     p_user_id_update         => :sorlcur.sorlcur_user_id      );
     -- application numbers are only inserted in sakdcsn when decision is confirmed and
     -- application curriculum moved to the learner
    
    -- select the curriculum record to refresh the activity date
    -- and other fields calculated by the api
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
	  
    -- show curriculum warning only once
      if :lcur_sobctrl_curr_rule_ind = 'Y' and 
     	:global.init_curr_term <  :s$_curricula.module_term_code   and 
     ( :sorlcur.curr_error is not null and :sorlcur.curr_error > 0 )
   	 and ( (:curric_warning = 0 or :curric_warning is null and :sorlcur.severity_out = 'W' )
   	    OR :sorlcur.severity_out = 'F' )  then 
    	   cem_msg := substr(sokcmsg.F_SorlcurErrorMsg(:sorlcur.severity_out, 'V',
 	   	                          :sorlcur.curr_error),1,75);
	       Set_Alert_Property(alert_id, ALERT_MESSAGE_TEXT,cem_msg); 
 	       alert_button := show_alert('CURRICULUM_ERROR');
 	   	 
	       if alert_button = ALERT_BUTTON1 then
	          null;
	       end if;
	       if :sorlcur.severity_out = 'F' then 
	       	 gb_common.p_rollback;
	       	 raise form_trigger_failure;
	       else 
	       	 :curric_warning := :sorlcur.curr_error;
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
		 * SORLCUR.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sorlcur_RowInsert(RowAdapterEvent args)
		{
			
				//  ON-INSERT Trigger
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				int rowCount = 0;
				{
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId = findAlert("CURRICULUM_ERROR");
					NString cemMsg = toStr("");
					SorlcurRow currRec= null;
					NNumber lvLearnerSeqno= NNumber.getNull();
					NString lvrowid= NString.getNull();
					try
					{
						// - record is in insert mode but no data was entered 
						if ( sorlcurElement.getSorlcurDegcCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurCampCode().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurProgram().isNull() && sorlcurElement.getSorlcurPriorityNo().isNull() )
						{
							return ;
						}
						if ( sorlcurElement.getSorlcurProgram().equals("************") )
						{
							sorlcurElement.setSorlcurProgram(toStr(""));
						}
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && (!getFormModel().getSCurricula().getLearnerEffTerm().isNull() && getFormModel().getSCurricula().getLearnerEffTerm().notEquals(getFormModel().getSCurricula().getModuleTermCode())) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							SbLearner.pCopyLearner(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeOld=>*/getFormModel().getSCurricula().getLearnerEffTerm(), /*pTermCodeNew=>*/getFormModel().getSCurricula().getModuleTermCode());
							getFormModel().getSCurricula().setLearnerEffTerm(getFormModel().getSCurricula().getModuleTermCode());
							getFormModel().getSCurricula().setModuleEndTerm(SbLearner.fQueryEnd(sorlcurElement.getSorlcurPidm(), getFormModel().getSCurricula().getModuleTermCode()));
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
						}
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && sorlcurElement.getSorlcurKeySeqno().notEquals(99) && getGlobal("STUDY_PATH").equals("Y") )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCopyStudypath(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeOld=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pTermCodeNew=>*/sorlcurElement.getSorlcurTermCode(), /*pKeyseqno=>*/sorlcurElement.getSorlcurKeySeqno());
							sorlcurElement.setSorlcurSeqno(toNumber(""));
						}
						//  create the study path 
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && isNull(sorlcurElement.getSorlcurKeySeqno(), 99).equals(99) && getGlobal("STUDY_PATH").equals("Y") )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( Sokcurr.fStudypath(/*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule()).equals("Y") )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Ref<NNumber> p_key_seqno_ref = new Ref<NNumber>(lvLearnerSeqno);
								SbStudypath.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/sorlcurElement.getSorlcurTermCode(), p_key_seqno_ref, /*pStspCode=>*/"AS", /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/GbCommon.fSctUser(), /*pRowidOut=>*/lvrowid);
								lvLearnerSeqno = p_key_seqno_ref.val;
								sorlcurElement.setSorlcurKeySeqno(lvLearnerSeqno);
							}
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>();
						Ref<NNumber> p_seqno_out_ref = new Ref<NNumber>();
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>(sorlcurElement.getSorlcurGappSeqno());
						Ref<NString> p_severity_out_ref = new Ref<NString>(sorlcurElement.getSorlcurUserId());
						SbCurriculum.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pTermCode=>*/sorlcurElement.getSorlcurTermCode(), /*pKeySeqno=>*/isNull(sorlcurElement.getSorlcurKeySeqno(), getFormModel().getSCurricula().getModuleKeySeqno()), /*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), /*pRollInd=>*/sorlcurElement.getSorlcurRollInd(), /*pCactCode=>*/sorlcurElement.getSorlcurCactCode(), /*pUserId=>*/sorlcurElement.getSorlcurUserId(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pTermCodeCtlg=>*/sorlcurElement.getSorlcurTermCodeCtlg(), /*pTermCodeEnd=>*/sorlcurElement.getSorlcurTermCodeEnd(), /*pTermCodeMatric=>*/sorlcurElement.getSorlcurTermCodeMatric(), /*pTermCodeAdmit=>*/sorlcurElement.getSorlcurTermCodeAdmit(), /*pAdmtCode=>*/sorlcurElement.getSorlcurAdmtCode(), /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pStartDate=>*/sorlcurElement.getSorlcurStartDate(), /*pEndDate=>*/sorlcurElement.getSorlcurEndDate(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/sorlcurElement.getSovlcurRowid(), toStr(/*pSeqnoOut=>*/sorlcurElement.getSorlcurSeqno()), toDate(/*pCurrErrorOut=>*/sorlcurElement.getCurrError()), /*pOverrideSeverity=>*/"N", toDate(/*pSeverityOut=>*/sorlcurElement.getSeverityOut()), toDate(/*pSiteCode=>*/sorlcurElement.getSorlcurSiteCode()), /*pRateCode=>*/sorlcurElement.getSorlcurRateCode(), /*pAcyrCode=>*/sorlcurElement.getSorlcurAcyrCode(), /*pStypCode=>*/sorlcurElement.getSorlcurStypCode(), /*pLeavCode=>*/sorlcurElement.getSorlcurLeavCode(), toNumber(/*pLeavFromDate=>*/sorlcurElement.getSorlcurLeavFromDate()), toNumber(/*pLeavToDate=>*/sorlcurElement.getSorlcurLeavToDate()), p_rowid_out_ref, p_seqno_out_ref, p_curr_error_out_ref, p_severity_out_ref);
						sorlcurElement.setSorlcurExpGradDate(p_rowid_out_ref.val);
						sorlcurElement.setSorlcurTermCodeGrad(p_seqno_out_ref.val);
						sorlcurElement.setSorlcurGappSeqno(p_curr_error_out_ref.val);
						sorlcurElement.setSorlcurUserId(p_severity_out_ref.val);
						//  application numbers are only inserted in sakdcsn when decision is confirmed and
						//  application curriculum moved to the learner
						//  select the curriculum record to refresh the activity date
						//  and other fields calculated by the api
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
						//  show curriculum warning only once
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") && getGlobal("INIT_CURR_TERM").lesser(getFormModel().getSCurricula().getModuleTermCode()) && (!sorlcurElement.getCurrError().isNull() && sorlcurElement.getCurrError().greater(0)) && ((sorlcurElement.getCurricWarning().equals(0) || sorlcurElement.getCurricWarning().isNull() && sorlcurElement.getSeverityOut().equals("W")) || sorlcurElement.getSeverityOut().equals("F")) )
						{
							cemMsg = substring(Sokcmsg.fSorlcurerrormsg(sorlcurElement.getSeverityOut(), toStr("V"), sorlcurElement.getCurrError()), toInt(1), toInt(75));
							setAlertMessageText(alertId, cemMsg);
							alertButton = toNumber(showAlert("CURRICULUM_ERROR"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
							}
							if ( sorlcurElement.getSeverityOut().equals("F") )
							{
								GbCommon.pRollback();
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.ON-DELETE
		 --
-- ON-DELETE Trigger
--
BEGIN
	-- exit delete if its already been deleted by host api 
	IF (sb_curriculum.f_exists(:sorlcur.SORLCUR_PIDM,
		  :sorlCUR.SORLCUR_SEQNO) ='N' ) THEN
		  RETURN;
  END IF;
  sb_curriculum.P_DELETE(
     p_PIDM                   =>:sorlcur.SORLCUR_PIDM,
     p_SEQNO                  =>:sorlcur.SORLCUR_SEQNO,
     p_ROWID                  =>:sorlcur.ROWID);
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
		 * SORLCUR.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void sorlcur_RowDelete(RowAdapterEvent args)
		{
			
				// 
				//  ON-DELETE Trigger
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				try
				{
					//  exit delete if its already been deleted by host api 
					if ((SbCurriculum.fExists(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()).equals("N")))
					{
						return ;
					}
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					SbCurriculum.pDelete(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pRowid=>*/sorlcurElement.getROWID());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.POST-QUERY
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
	:sorlcur_admt_desc := sb_stvadmt.f_get_description(:sorlcur_admt_code);
 	:sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
 	:sorlcur_lmod_code_desc := sb_stvlmod.f_get_description(:sorlcur_lmod_code);
  :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
  :sorlcur_admt_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_admit);
  :sorlcur_matric_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_matric);
  :sorlcur_end_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_end);
  :sorlcur_rate_code_desc := sb_stvrate.f_get_description(:sorlcur_rate_code);
  :sorlcur_site_code_desc := gb_stvsite.f_get_description(:sorlcur_site_code);
  :sorlcur_leav_code_desc := sb_stvleav.f_get_description(:sorlcur_leav_code);
  :sorlcur_acyr_code_desc := gb_stvacyr.f_get_description(:sorlcur_acyr_code);
  :sorlcur_term_code_grad_desc := gb_stvterm.f_get_description(:sorlcur_term_code_grad);
  :sorlcur_program_desc := sb_smrprle.f_get_description(:sorlcur_program);
  :deactivate_ind := null;
  open sel_maxlfos_c;
  fetch sel_maxlfos_c into :sorlfos_seqno_cnt;
  if sel_maxlfos_c%notfound then
  	 :sorlfos_seqno_cnt := 0;
  end if;
  close sel_maxlfos_c;
  --:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
  --  :sorlcur_seqno); 
  :prompt_lcur_commit := 'N';
 
end;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sorlcur_AfterQuery(RowAdapterEvent args)
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sorlcurElement.setLockDbValues(true);
								this.sorlcurAcyrCode_PostChange();
			this.sorlcurTermCodeGrad_PostChange();
			this.sorlcurLeavToDate_PostChange();
			this.sorlcurLeavFromDate_PostChange();
			this.sorlcurLeavCode_PostChange();
			this.sorlcurRateCode_PostChange();
			this.sorlcurSiteCode_PostChange();
			this.sorlcurStypCode_PostChange();
			this.sorlcurEndDate_PostChange();
			this.sorlcurStartDate_PostChange();
			this.sorlcurAdmtCode_PostChange();
			this.sorlcurPriorityNo_PostChange();
			this.sorlcurTermCode_PostChange();
			this.sorlcurKeySeqno_PostChange();

				} finally { 
					sorlcurElement.setLockDbValues(false);
				}
				{
					String sqlselMaxlfosC = "SELECT max(sorlfos_seqno) " +
	" FROM sorlfos " +
	" WHERE sorlfos_pidm = :SORLCUR_PIDM AND sorlfos_lcur_seqno = :SORLCUR_SEQNO ";
					DataCursor selMaxlfosC = new DataCursor(sqlselMaxlfosC);
					sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
					sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
					sorlcurElement.setSorlcurCollDesc(GbStvcoll.fGetDescription(sorlcurElement.getSorlcurCollCode()));
					sorlcurElement.setSorlcurLevlDesc(GbStvlevl.fGetDescription(sorlcurElement.getSorlcurLevlCode()));
					sorlcurElement.setSorlcurAdmtDesc(SbStvadmt.fGetDescription(sorlcurElement.getSorlcurAdmtCode()));
					sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
					sorlcurElement.setSorlcurLmodCodeDesc(SbStvlmod.fGetDescription(sorlcurElement.getSorlcurLmodCode()));
					sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
					sorlcurElement.setSorlcurAdmtTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeAdmit()));
					sorlcurElement.setSorlcurMatricTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeMatric()));
					sorlcurElement.setSorlcurEndTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeEnd()));
					sorlcurElement.setSorlcurRateCodeDesc(SbStvrate.fGetDescription(sorlcurElement.getSorlcurRateCode()));
					sorlcurElement.setSorlcurSiteCodeDesc(GbStvsite.fGetDescription(sorlcurElement.getSorlcurSiteCode()));
					sorlcurElement.setSorlcurLeavCodeDesc(SbStvleav.fGetDescription(sorlcurElement.getSorlcurLeavCode()));
					sorlcurElement.setSorlcurAcyrCodeDesc(GbStvacyr.fGetDescription(sorlcurElement.getSorlcurAcyrCode()));
					sorlcurElement.setSorlcurTermCodeGradDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeGrad()));
					sorlcurElement.setSorlcurProgramDesc(SbSmrprle.fGetDescription(sorlcurElement.getSorlcurProgram()));
					sorlcurElement.setDeactivateInd(toStr(null));
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
					selMaxlfosC.close();
					// :sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
					//   :sorlcur_seqno); 
					getFormModel().getSCurriculaTraditional().setPromptLcurCommit(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.POST-BLOCK
		  if :system.block_status in ('CHANGED','NEW') then 
 	  :s$_curricula.curricula_updated := 'Y';  
 end if;
 
  
:dup_create_ind := 'N'; 

 set_item_property('NEXT_REC_BTN',ENABLED, property_false); 
 set_item_property('PREV_RECORD_BTN',ENABLED, property_false); 
 
 set_curric_properties('DEACTIVE_BTN', 'enabled', 'property_false'); 
 set_curric_properties('DEACTIVE_DUPLICATE_BTN', 'enabled', 'property_false'); 
 set_curric_properties('DUPLICATE_BTN', 'enabled', 'property_false'); 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sorlcur_blockOut()
		{
			
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
				setItemEnabled("NEXT_REC_BTN", false);
				setItemEnabled("PREV_RECORD_BTN", false);
				this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_BTN"), toStr("enabled"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_DUPLICATE_BTN"), toStr("enabled"), toStr("property_false"));
				this.getContainer().getServices().setCurricProperties(toStr("DUPLICATE_BTN"), toStr("enabled"), toStr("property_false"));
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.WHEN-NEW-RECORD-INSTANCE
		   
 if :system.mode = 'ENTER-QUERY' 
 	 	  then return;
 end if; 
 if :default_options_ind = 'Y' then 
 	  :default_options_ind := 'N';
    return;
 end if; 
 if :system.block_status in ('CHANGED','NEW') OR
 	get_block_property('SORLFOS',STATUS) = 'CHANGED' 
 	 then 
 	  :s$_curricula.curricula_updated := 'Y'; 
 else
 	if :system.block_status = 'QUERY' and 
 		get_block_property('SORLFOS',STATUS) in ( 'QUERY', 'NEW')   then 
 		  :s$_curricula.curricula_updated := 'N';
 	end if;
 end if; 

 :lcur_rec_num := :system.cursor_record; 
 --- set up the help hint for the rolled seq 
 declare 
	toolmsg varchar2(200) := NULL;
	lv_curr_ref sb_curriculum.curriculum_ref;
	lv_curr_rec sb_curriculum.curriculum_rec;
 begin
  if get_item_property('lcur_rolled_key_seqno',visible) = 'TRUE' then 
  if :sorlcur_rolled_seqno is not null and :lcur_rolled_key_seqno IS NULL then
  	  lv_curr_ref := sb_curriculum.f_query_one
  	     (p_pidm => :sorlcur_pidm, p_seqno => :sorlcur_rolled_seqno); 
  	  fetch lv_curr_ref into lv_curr_rec;
  	  if lv_curr_ref%notfound then
  	  	 :lcur_rolled_key_seqno  := null;
  	  else 
  	  	 :lcur_rolled_key_seqno := lv_curr_rec.r_key_seqno;
  	  end if; 
  	  close lv_curr_ref;
  else
  	null;
  end if;
  end if; 
 end;
 
 IF get_block_property('SORLCUR',INSERT_ALLOWED) = 'TRUE' THEN
   if :sovlcur_rowid is not null then 
	
		set_curric_properties('sorlcur_degc_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_coll_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_camp_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_levl_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_program_lbt','enabled','property_false');
		set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_false');
		set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_false');
		set_curric_properties('sorlcur_cact_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_start_date_dbt','enabled','property_false');
		set_curric_properties('sorlcur_end_date_dbt','enabled','property_false');
		IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' then 
		  set_curric_properties('lfos_deactive_btn','enabled','property_false');
		END IF;
		IF :s$_curricula.module_code = sb_curriculum_str.f_learner THEN
	  	set_curric_properties('sorlcur_term_code_end_lbt','enabled','property_false');
	  	set_curric_properties('sorlcur_term_code_admit_lbt','enabled','property_false');
	  	set_curric_properties('sorlcur_term_code_matric_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_admt_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_rate_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_site_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_styp_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_leav_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_acyr_code_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_term_code_grad_lbt','enabled','property_false');
		  set_curric_properties('sorlcur_leav_from_date_dbt','enabled','property_false');
		  set_curric_properties('sorlcur_leav_to_date_dbt','enabled','property_false');
		  set_curric_properties('sorlcur_exp_grad_date_dbt','enabled','property_false');
		  set_curric_properties('apply_to_graduate_btn','enabled','property_true');
		  set_curric_properties('roll_to_outcome_btn','enabled','property_true');
		  if :sorlcur_key_seqno = 99 and :global.study_path = 'Y' then 
         set_curric_properties('sorlcur_key_seqno_lbt','enabled','property_true');
         set_curric_properties('sorlcur_key_seqno','enabled','property_true');
         set_curric_properties('sorlcur_key_seqno','navigable','property_true');
         set_curric_properties('sorlcur_key_seqno','UPDATE_ALLOWED','property_false');
         set_curric_properties('sorlcur_key_seqno','INSERT_ALLOWED','property_false');
         
		  else
         set_curric_properties('sorlcur_key_seqno_lbt','enabled','property_false');
         set_curric_properties('sorlcur_key_seqno','enabled','property_false');
         set_curric_properties('sorlcur_key_seqno','navigable','property_false');
		  end if; 
		END IF;
		-- when do you want to requery the lfos data ?
		-- coming into lcur record:  lcur has status of query, lfos new 
		-- coming into lcur record:  lcur has status of query and lfos is new 
		-- coming into lcur record and the lfos cnt is 0
    if   ( nvl(:s$_curricula.curricula_updated,'N') <> 'Y'  AND 
    	nvl(:sorlcur_del_ind, 'N') <> 'Y'  AND  nvl(:s$_curricula.sorlfos_del_ind,'N') <> 'Y' )
    	OR (:lfos_rec_num = 0) 
    	then 
    	:system.message_level := '5';
	  	next_block;
	  	clear_block;
	    execute_query;
	    last_record;
	    :lfos_rec_num := :system.cursor_record;
	    first_record;
	  	previous_block;
 	  	:system.message_level := '0';
    END IF; 
		
		:sorlcur_query_ind := 'Y'; 
		:s$_curricula.sorlcur_del_ind := 'N'; 
	  :s$_curricula.sorlfos_del_ind := 'N'; 
	
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

	  	set_curric_properties('sorlfos_csts_code','enabled','property_false');
	  	set_curric_properties('sorlfos_term_code_ctlg','enabled','property_false');
	  	set_curric_properties('sorlfos_term_code_end','enabled','property_false');
	  	set_curric_properties('sorlfos_majr_code','enabled','property_false');
	  	set_curric_properties('sorlfos_dept_code','enabled','property_false');
	  	set_curric_properties('sorlfos_tmst_code','enabled','property_false');
	  	set_curric_properties('sorlfos_start_date','enabled','property_false');
	  	set_curric_properties('sorlfos_end_date','enabled','property_false');
	  	set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');
		  set_curric_properties('lfos_deactive_btn','enabled','property_false');


	else  -- new record sovlcur rowid is null
	 		
		set_curric_properties('sorlcur_degc_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_coll_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_camp_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_levl_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_program_lbt','enabled','property_true');
		set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_true');
		set_curric_properties('sorlcur_cact_code_lbt','enabled','property_true');
		set_curric_properties('sorlcur_start_date_dbt','enabled','property_true');
		set_curric_properties('sorlcur_end_date_dbt','enabled','property_true');
		if :s$_curricula.module_code = sb_curriculum_str.f_outcome then 
      	set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_true');
   			set_curric_properties('sorlfos_term_code_lbt','enabled','property_true');
    end if; 
		if :s$_curricula.module_code = sb_curriculum_str.f_LEARNER then
		 	set_curric_properties('sorlcur_term_code_admit_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_term_code_matric_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_admt_code_lbt','enabled','property_true');
		 
	    set_curric_properties('sorlcur_rate_code_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_site_code_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_styp_code_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_leav_code_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_acyr_code_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_term_code_grad_lbt','enabled','property_true');
		  set_curric_properties('sorlcur_leav_from_date_dbt','enabled','property_true');
		  set_curric_properties('sorlcur_leav_to_date_dbt','enabled','property_true');
		  set_curric_properties('sorlcur_exp_grad_date_dbt','enabled','property_true');
		  set_curric_properties('sorlcur_rate_code','enabled','property_true');
		  set_curric_properties('sorlcur_site_code','enabled','property_true');
		  set_curric_properties('sorlcur_styp_code','enabled','property_true');
		  set_curric_properties('sorlcur_leav_code','enabled','property_true');
		  set_curric_properties('sorlcur_acyr_code','enabled','property_true');
		  set_curric_properties('sorlcur_term_code_grad','enabled','property_true');
		  set_curric_properties('sorlcur_leav_from_date','enabled','property_true');
		  set_curric_properties('sorlcur_leav_to_date','enabled','property_true');
		  set_curric_properties('sorlcur_exp_grad_date','enabled','property_true');
		   
      if :global.study_path = 'Y' and nvl(:sorlcur_key_seqno,99) = 99  then 
         set_curric_properties('sorlcur_key_seqno','enabled','property_true');
		   	 set_curric_properties('sorlcur_key_seqno','navigable','property_true');
         set_curric_properties('sorlcur_key_seqno_lbt','enabled','property_true');
         set_curric_properties('sorlcur_key_seqno','UPDATE_ALLOWED','property_true');
         set_curric_properties('sorlcur_key_seqno','INSERT_ALLOWED','property_true');

      end if; 
		  --- do not allow access to these unless record has been saved
		  set_curric_properties('apply_to_graduate_btn','enabled','property_false');
		  set_curric_properties('roll_to_outcome_btn','enabled','property_false');
		 
		end if;
  
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
	  set_curric_properties('sorlfos_csts_code','enabled','property_false');
	  set_curric_properties('sorlfos_term_code','enabled','property_false');
	  set_curric_properties('sorlfos_term_code_ctlg','enabled','property_false');
	  set_curric_properties('sorlfos_term_code_end','enabled','property_false');
		set_curric_properties('sorlfos_majr_code','enabled','property_false');
	  set_curric_properties('sorlfos_dept_code','enabled','property_false');
	  set_curric_properties('sorlfos_tmst_code','enabled','property_false');
	  set_curric_properties('sorlfos_start_date','enabled','property_false');
	  set_curric_properties('sorlfos_end_date','enabled','property_false');

	  set_curric_properties('sorlfos_majr_code_attach','enabled','property_false');
		set_curric_properties('lfos_deactive_btn','enabled','property_false');


    if :sorlcur_priority_no is null then 
    	execute_trigger('NEW_SORLCUR');
      G$_CHECK_FAILURE; 
      :lfos_rec_num := 0; 
    end if; 
    
	end if; -- new record, rowid is null 
	:s$_curricula.sorlcur_del_ind := 'N';
  :s$_curricula.sorlfos_del_ind := 'N'; 
  IF :sovlcur_current_ind = 'Y' AND sb_learnercurricstatus.f_is_active(:sorlcur_cact_code) = 'Y' then 
	  	  set_curric_properties('DEACTIVE_BTN','enabled', 'PROPERTY_TRUE'); 
 	  	  set_curric_properties('DEACTIVE_DUPLICATE_BTN','enabled', 'PROPERTY_TRUE'); 
 	  	  set_curric_properties('DUPLICATE_BTN','enabled', 'PROPERTY_TRUE'); 
 	  	  if :s$_curricula.module_code = sb_curriculum_str.f_LEARNER then  
 	  	    if :sorlcur.sorlcur_rolled_seqno is null and 
 	  	   	:sorlcur.sorlcur_gapp_seqno is null then 
 	  	   	 set_curric_properties('roll_to_outcome_btn','enabled','property_true');
 	  	    else 
 	  	     	set_curric_properties('roll_to_outcome_btn','enabled','property_false');
 	  	    end if; 
 	  	    if :sorlcur.sorlcur_gapp_seqno is  null then 
 	  	   	  set_curric_properties('apply_to_graduate_btn','enabled','property_true');
 	  	      if :sorlcur.sorlcur_rolled_seqno is not null then 
 	  	    	 set_curric_properties('apply_to_graduate_btn','enabled','property_false');
 	  	      end if ; 
 	  	    else 
 	  	      if sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
 	  	     	  p_seqno => :sorlcur.sorlcur_gapp_seqno ) = 'N' then 
 	  	  	   set_curric_properties('apply_to_graduate_btn','enabled','property_false');
 	  	      else 
 	  	      	 set_curric_properties('apply_to_graduate_btn','enabled','property_true');
 	  	         if :sorlcur.sorlcur_rolled_seqno is not null then 
 	  	        	 set_curric_properties('apply_to_graduate_btn','enabled','property_false');
 	  	         end if ; 
 	  	      end if; 
 	  	    end if; 
 	  	  end if;
		else
	  	  set_curric_properties('DEACTIVE_BTN','enabled', 'PROPERTY_FALSE');
	  	  set_curric_properties('DEACTIVE_DUPLICATE_BTN','enabled', 'PROPERTY_FALSE');
	  	  -- duplicate button is available even if record is inactive or not current
	  	  set_curric_properties('DUPLICATE_BTN','enabled', 'PROPERTY_TRUE');
	  	  --- roll to outcome is available if lcur is current but not active 
	  	  if :s$_curricula.module_code = sb_curriculum_str.f_LEARNER  then 	  	   
	 	     set_curric_properties('roll_to_outcome_btn','enabled','property_false');
	  	   set_curric_properties('apply_to_graduate_btn','enabled','property_false');
	  	  -- set_curric_properties('sorlcur_key_seqno_lbt','enabled', 'PROPERTY_FALSE');
		    end if; 

	 end if;
	 --  roll and apply to grduate are not available if record has been rolled already
	 if :sorlcur.sorlcur_rolled_seqno is not null and 
	 	  :s$_curricula.module_code = sb_curriculum_str.f_LEARNER then 
			     set_curric_properties('roll_to_outcome_btn','enabled','property_false');
			     set_curric_properties('apply_to_graduate_btn','enabled','property_false'); 
	 end if; 
	  

  
 ELSE  -- query only form 
  	set_curric_properties('sorlcur_lmod_code_lbt','enabled','property_false');
   	set_curric_properties('sorlcur_degc_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_coll_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_camp_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_levl_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_program_lbt','enabled','property_false');
		set_curric_properties('SORLCUR_TERM_CODE_LBT','enabled','property_false');
		set_curric_properties('sorlcur_term_code_ctlg_lbt','enabled','property_false');
		set_curric_properties('sorlcur_cact_code_lbt','enabled','property_false');
		set_curric_properties('sorlcur_start_date_dbt','enabled','property_false');
		set_curric_properties('sorlcur_end_date_dbt','enabled','property_false');
  	set_curric_properties('sorlcur_term_code_end_lbt','enabled','property_false');
  	set_curric_properties('sorlcur_term_code_admit_lbt','enabled','property_false');
  	set_curric_properties('sorlcur_term_code_matric_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_admt_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_rate_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_site_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_styp_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_leav_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_acyr_code_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_term_code_grad_lbt','enabled','property_false');
	  set_curric_properties('sorlcur_leav_from_date_dbt','enabled','property_false');
	  set_curric_properties('sorlcur_leav_to_date_dbt','enabled','property_false');
	  set_curric_properties('sorlcur_exp_grad_date_dbt','enabled','property_false');
		set_curric_properties('apply_to_graduate_btn','enabled','property_false');
		set_curric_properties('roll_to_outcome_btn','enabled','property_false');
    set_curric_properties('sorlcur_key_seqno_lbt','visible','property_false');
  
 
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
 	--	set_curric_properties('sorlcur_key_seqno_lbt', 'enabled', 'property_false');
		set_curric_properties('DEACTIVE_BTN', 'enabled', 'property_false'); 
  	set_curric_properties('DEACTIVE_DUPLICATE_BTN', 'enabled', 'property_false'); 
  	set_curric_properties('DUPLICATE_BTN', 'enabled', 'property_false'); 
    set_curric_properties('roll_to_outcome_btn','enabled','property_false');
    set_curric_properties('apply_to_graduate_btn','enabled','property_false');
		IF GET_item_property('lfos_deactive_btn',visible) = 'TRUE' then 
		  set_curric_properties('lfos_deactive_btn','enabled','property_false');
		END IF;



end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sorlcur_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				if ( getFormModel().getSCurricula().getDefaultOptionsInd().equals("Y") )
				{
					getFormModel().getSCurricula().setDefaultOptionsInd(toStr("N"));
					return ;
				}
				if ( (getBlockStatus().equals("CHANGED") || getBlockStatus().equals("NEW")) || getBlockStatus("SORLFOS").equals("CHANGED") )
				{
					getFormModel().getSCurricula().setCurriculaUpdated(toStr("Y"));
				}
				else {
					// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#FunctionUsedInIn".
					if ( getBlockStatus().equals("QUERY") && in(getBlockStatus("SORLFOS"), "QUERY", "NEW").getValue() )
					{
						getFormModel().getSCurricula().setCurriculaUpdated(toStr("N"));
					}
				}
				getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord()));
				{
					NString toolmsg = NString.getNull();
					UnknownTypes.SbCurriculumCurriculumRef lvCurrRef= null;
					SbCurriculum.CurriculumRecRow lvCurrRec= null;
					if ( getItemVisible("lcur_rolled_key_seqno").equals("TRUE") )
					{
						if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() && sorlcurElement.getLcurRolledKeySeqno().isNull() )
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
						else {
						}
					}
				}
				if ( getBlockInsertAllowed("SORLCUR").equals("TRUE") )
				{
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_cact_code_lbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_start_date_dbt"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_end_date_dbt"), toStr("enabled"), toStr("property_false"));
						if ( getItemVisible("lfos_deactive_btn").equals("TRUE") )
						{
							this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_false"));
						}
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
						{
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_end_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_admit_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_matric_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_admt_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_true"));
							if ( sorlcurElement.getSorlcurKeySeqno().equals(99) && getGlobal("STUDY_PATH").equals("Y") )
							{
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("enabled"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("enabled"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("navigable"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("UPDATE_ALLOWED"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("INSERT_ALLOWED"), toStr("property_false"));
							}
							else {
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("enabled"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("enabled"), toStr("property_false"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("navigable"), toStr("property_false"));
							}
						}
						//  when do you want to requery the lfos data ?
						//  coming into lcur record:  lcur has status of query, lfos new 
						//  coming into lcur record:  lcur has status of query and lfos is new 
						//  coming into lcur record and the lfos cnt is 0
						if ( (isNull(getFormModel().getSCurricula().getCurriculaUpdated(), "N").notEquals("Y") && isNull(getFormModel().getSCurricula().getSorlcurDelInd(), "N").notEquals("Y") && isNull(getFormModel().getSCurricula().getSorlfosDelInd(), "N").notEquals("Y")) || (getFormModel().getSCurriculaTraditional().getLfosRecNum().equals(0)) )
						{
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
							nextBlock();
							clearBlock();
							executeQuery();
							lastRecord();
							getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(getCursorRecord()));
							firstRecord();
							previousBlock();
							// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						}
						sorlcurElement.setSorlcurQueryInd(toStr("Y"));
						getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
						getFormModel().getSCurricula().setSorlfosDelInd(toStr("N"));
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
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_false"));
					}
					else {
						//  new record sovlcur rowid is null
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_cact_code_lbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_start_date_dbt"), toStr("enabled"), toStr("property_true"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlcur_end_date_dbt"), toStr("enabled"), toStr("property_true"));
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fOutcome()) )
						{
							this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_lbt"), toStr("enabled"), toStr("property_true"));
						}
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
						{
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_admit_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_matric_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_admt_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date"), toStr("enabled"), toStr("property_true"));
							this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date"), toStr("enabled"), toStr("property_true"));
							if ( getGlobal("STUDY_PATH").equals("Y") && isNull(sorlcurElement.getSorlcurKeySeqno(), 99).equals(99) )
							{
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("enabled"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("navigable"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("enabled"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("UPDATE_ALLOWED"), toStr("property_true"));
								this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno"), toStr("INSERT_ALLOWED"), toStr("property_true"));
							}
							// - do not allow access to these unless record has been saved
							this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
						}
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
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_csts_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_ctlg"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_term_code_end"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_dept_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_tmst_code"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_start_date"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_end_date"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("sorlfos_majr_code_attach"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_false"));
						if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
						{
							executeAction("NEW_SORLCUR");
							getContainer().getGoqrpls().gCheckFailure();
							getFormModel().getSCurriculaTraditional().setLfosRecNum(toInt(0));
						}
					}
					//  new record, rowid is null 
					getFormModel().getSCurricula().setSorlcurDelInd(toStr("N"));
					getFormModel().getSCurricula().setSorlfosDelInd(toStr("N"));
					if ( sorlcurElement.getSovlcurCurrentInd().equals("Y") && SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).equals("Y") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_BTN"), toStr("enabled"), toStr("PROPERTY_TRUE"));
						this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_DUPLICATE_BTN"), toStr("enabled"), toStr("PROPERTY_TRUE"));
						this.getContainer().getServices().setCurricProperties(toStr("DUPLICATE_BTN"), toStr("enabled"), toStr("PROPERTY_TRUE"));
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
						{
							if ( sorlcurElement.getSorlcurRolledSeqno().isNull() && sorlcurElement.getSorlcurGappSeqno().isNull() )
							{
								this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_true"));
							}
							else {
								this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
							}
							if ( sorlcurElement.getSorlcurGappSeqno().isNull() )
							{
								this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_true"));
								if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() )
								{
									this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
								}
							}
							else {
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								if ( SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("N") )
								{
									this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
								}
								else {
									this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_true"));
									if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() )
									{
										this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
									}
								}
							}
						}
					}
					else {
						this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_BTN"), toStr("enabled"), toStr("PROPERTY_FALSE"));
						this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_DUPLICATE_BTN"), toStr("enabled"), toStr("PROPERTY_FALSE"));
						//  duplicate button is available even if record is inactive or not current
						this.getContainer().getServices().setCurricProperties(toStr("DUPLICATE_BTN"), toStr("enabled"), toStr("PROPERTY_TRUE"));
						// - roll to outcome is available if lcur is current but not active 
						if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
						{
							this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
							this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
						}
					}
					//   roll and apply to grduate are not available if record has been rolled already
					if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() && getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
					{
						this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
						this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
					}
				}
				else {
					//  query only form 
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_lmod_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_degc_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_coll_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_camp_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_levl_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_program_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("SORLCUR_TERM_CODE_LBT"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_ctlg_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_cact_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_start_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_end_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_end_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_admit_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_matric_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_admt_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_rate_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_site_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_styp_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_acyr_code_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_term_code_grad_lbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_from_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_leav_to_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_exp_grad_date_dbt"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("sorlcur_key_seqno_lbt"), toStr("visible"), toStr("property_false"));
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
					// 	set_curric_properties('sorlcur_key_seqno_lbt', 'enabled', 'property_false');
					this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_BTN"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("DEACTIVE_DUPLICATE_BTN"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("DUPLICATE_BTN"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("roll_to_outcome_btn"), toStr("enabled"), toStr("property_false"));
					this.getContainer().getServices().setCurricProperties(toStr("apply_to_graduate_btn"), toStr("enabled"), toStr("property_false"));
					if ( getItemVisible("lfos_deactive_btn").equals("TRUE") )
					{
						this.getContainer().getServices().setCurricProperties(toStr("lfos_deactive_btn"), toStr("enabled"), toStr("property_false"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.WHEN-VALIDATE-RECORD
		 if :system.mode = 'NORMAL' and 
	:system.block_status = 'QUERY' then 
	return;
end if;
 
if :sorlcur_priority_no is null and 
	 :sorlcur_levl_code is null and 
	 :sorlcur_coll_code is null and 
	 :sorlcur_degc_code is null and
 	 :sorlcur_term_code_ctlg is null and
	 :sovlcur_rowid is null 	   
	then return;
end if;

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
		 * SORLCUR.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void sorlcur_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("NORMAL") && getBlockStatus().equals("QUERY") )
				{
					return ;
				}
				if ( sorlcurElement.getSorlcurPriorityNo().isNull() && sorlcurElement.getSorlcurLevlCode().isNull() && sorlcurElement.getSorlcurCollCode().isNull() && sorlcurElement.getSorlcurDegcCode().isNull() && sorlcurElement.getSorlcurTermCodeCtlg().isNull() && sorlcurElement.getSovlcurRowid().isNull() )
				{
					return ;
				}
				if ( sorlcurElement.getSovlcurRowid().isNull() && isNull(getFormModel().getSCurricula().getDeleteInprogress(), "N").equals("N") )
				{
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Soklcur.\(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.ON-POPULATE-DETAILS
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
  -- Begin SORLFOS detail program section
  --
  IF ( (:SORLCUR.SORLCUR_PIDM is not null) or (:SORLCUR.SORLCUR_SEQNO is not null) ) THEN   
    rel_id := Find_Relation('SORLCUR.SORLCUR_SORLFOS');   
    Query_Master_Details(rel_id, 'SORLFOS');   
  END IF;
  --
  -- End SORLFOS detail program section
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
		 * SORLCUR.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void sorlcur_PopulateDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)args.getRow();


				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					NString recstat = toStr(getRecordStatus());
					NString startitm = getCursorItem();
					org.jdesktop.databuffer.DataRelation relId= null;
					if ((recstat.equals("NEW") || recstat.equals("INSERT")))
					{
						return ;
					}
					// 
					//  Begin SORLFOS detail program section
					// 
					if (((!sorlcurElement.getSorlcurPidm().isNull()) || (!sorlcurElement.getSorlcurSeqno().isNull())))
					{
						// F2J_TO_REMOVE : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins".
						//						relId = SupportClasses.FORMS40.FindRelation("SORLCUR.SORLCUR_SORLFOS");
						System.err.println("// F2J_TO_REMOVE : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins'.");
						
						this.getContainer().getServices().queryMasterDetails(relId, toStr("SORLFOS"));
					}
					// 
					//  End SORLFOS detail program section
					// 
					if ((getCursorItem().notEquals(startitm)))
					{
						goItem(startitm);
						this.getContainer().getServices().checkPackageFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.DUP_CLEAR_STATUS
		 execute_trigger('query_only');
g$_check_failure;

if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' THEN 
	message( G$_NLS.Get('SOQOLIB-0205', 'FORM','Invalid option for query only.') );
	return;
end if;

if nvl(:dup_create_ind,'N') <>  'Y' then 
	message( G$_NLS.Get('SOQOLIB-0206', 'FORM','Insert record to duplicate record into.') );
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
	     sovlfos_conc_attach_rule,  sovlfos_lfos_rule ,
	     sovlfos_dept_code, sovlfos_majr_code_attach 
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
-- insert record for the duplicate 
create_record;
-- duplicate the record and make status blank
duplicate_record;
:dup_create_ind := 'N';
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 
save_lcur := :sorlcur.sorlcur_seqno;
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
:sorlcur.sorlcur_rolled_seqno := null;
:sorlcur.sovlcur_current_ind := null;
:sorlcur.sorlcur_cact_code := null; 
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
       :sorlfos.sorlfos_lfst_code, :sorlfos.sorlfos_majr_code,
	     :sorlfos.sorlfos_term_code,  :sorlfos.sorlfos_priority_no,
	     :sorlfos.sorlfos_conc_attach_rule,  :sorlfos.sorlfos_lfos_rule,
	     :sorlfos_dept_code, :sorlfos_majr_code_attach ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code; 
	:sorlfos.sorlfos_cact_code := null;
	:sorlfos.sorlfos_csts_code := null; 
	:sovlfos_rowid := null;
	:sorlfos_current_ind := null; 
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 
go_block('sorlcur');
:system.message_level := '0'; 
:sorlcur_duplicate_ind := 'N'; 
end; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.DUP_CLEAR_STATUS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DUP_CLEAR_STATUS")
		public void sorlcur_DupClearStatus()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0205"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ( isNull(getFormModel().getSCurricula().getDupCreateInd(), "N").notEquals("Y") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0206"), toStr("FORM"), toStr("Insert record to duplicate record into.")));
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
					String sqlsorlfosC = "SELECT sovlfos_lfst_code, sovlfos_majr_code, sovlfos_term_code, sovlfos_priority_no, sovlfos_conc_attach_rule, sovlfos_lfos_rule, sovlfos_dept_code, sovlfos_majr_code_attach " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND sovlfos_current_ind = 'Y' AND sovlfos_active_ind = 'Y' " +
	" ORDER BY decode(sovlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sovlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					//  insert record for the duplicate 
					createRecord();
					//  duplicate the record and make status blank
					duplicateRecord();
					getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
					getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
					saveLcur = sorlcurElement.getSorlcurSeqno();
					sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
					sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
					sorlcurElement.setSorlcurRolledSeqno(toNumber(null));
					sorlcurElement.setSovlcurCurrentInd(toStr(null));
					sorlcurElement.setSorlcurCactCode(toStr(null));
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
								sorlfosElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
								sorlfosElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
								sorlfosElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
								sorlfosElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
								sorlfosElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
								sorlfosElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
								sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(6));
								sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(7));
							}
							if ( sorlfosC.notFound() ) 
								break;
							sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
							sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
							sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
							sorlfosElement.setSorlfosCactCode(toStr(null));
							sorlfosElement.setSorlfosCstsCode(toStr(null));
							sorlfosElement.setSovlfosRowid(toStr(null));
							sorlfosElement.setSorlfosCurrentInd(toStr(null));
						}
						sorlfosC.close();
						firstRecord();
					}
					goBlock(toStr("sorlcur"));
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.DEACTIVE_CREATE_NEW
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' or 
	nvl(:global.curriculum_query, 'N') = 'Y'  THEN 
	message( G$_NLS.Get('SOQOLIB-0207', 'FORM','Invalid option for query only.') );
	return;
end if;
IF	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0208', 'FORM','Commit curriculum data changes before inactivating and inserting new.') );
	return; -- raise form_trigger_failure;
end if; 
	
if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	   	return; -- raise form_trigger_failure;
	 end if; 
end if;

 if	:sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner and  
      :sorlcur.sorlcur_gapp_seqno is not null and 
    	:sorlcur.sorlcur_rolled_seqno is null and 
    	 sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
    	    p_seqno => :sorlcur.sorlcur_gapp_seqno) = 'Y'   then 
  declare  
	 alert_button  number; 
  begin 
  	alert_button := show_alert('CURRICULUM_INACT_GRDAPP_ALERT');
    if alert_button = ALERT_BUTTON1 then
       null;
    else 
    	message( G$_NLS.Get('SOQOLIB-0209', 'FORM','The replace curriculum was cancelled.') );
    	return;
		  raise form_trigger_failure;
    end if;
  end; 
end if; 


declare 
	lv_seqno                sorlcur.sorlcur_seqno%type; 
	lv_new_seqno            sorlcur.sorlcur_seqno%type; 
	lv_severity_out         varchar2(1) := NULL;
	lv_rowid                gb_common.internal_record_id_type; 
 	lv_fieldofstudy_rec     sb_fieldofstudy.fieldofstudy_rec;
  lv_fieldofstudy_cur     sb_fieldofstudy.fieldofstudy_ref;
  lv_save_priority        sorlcur.sorlcur_priority_no%TYPE;
  lv_gapp_seqno           sorlcur.sorlcur_gapp_seqno%TYPE := null; 
begin 

:save_admit_code := :SORLCUR.SORLCUR_ADMT_CODE;
:save_admit_term := :SORLCUR.SORLCUR_TERM_CODE_ADMIT; 
:save_matric_term := :SORLCUR.SORLCUR_TERM_CODE_MATRIC;
:save_catlg_term  := :SORLCUR.SORLCUR_TERM_CODE_CTLG; 
lv_save_priority  := :sorlcur.sorlcur_priority_no;


   --- inactivate grad app because the curriculum is being made
   --- inactive 
  
  if	:sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner and  
      :sorlcur.sorlcur_gapp_seqno is not null and 
    	:sorlcur.sorlcur_rolled_seqno is null and 
    	 sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
    	    p_seqno => :sorlcur.sorlcur_gapp_seqno) = 'Y'   then 
   	  sb_gradapp.p_update 
   	    (p_pidm => :sorlcur.sorlcur_pidm,
   	     p_seqno => :sorlcur.sorlcur_gapp_seqno,
   	     p_gast_code => sb_gradapp_strings.f_inactive,
   	     p_USER_ID                => gb_common.f_sct_user,
         p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ) ;  	
   	
   end if;
   if :sorlcur.sorlcur_gapp_seqno is not null and 
   	  :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_outcome then  
   	   if soklcur.f_rolled_awarded (p_pidm => :sorlcur.sorlcur_pidm,
           P_lmod_code =>  :sorlcur.sorlcur_lmod_code, 
           P_key_seqno => :sorlcur.sorlcur_key_seqno) = 'N' then  
   	     lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
   	   else
   	   	 lv_gapp_seqno := null;
   	   end if; 
   else
   	   	 lv_gapp_seqno := null; 
   end if; 
   --- duplicate the current lcur and change the cact to deactivate 

	  lv_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
    :lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind;
   SB_curriculum.P_CREATE(
     p_PIDM                   =>:SORLCUR.SORLCUR_PIDM,
     p_SEQNO                  => lv_seqno,
     p_LMOD_CODE              =>:SORLCUR.SORLCUR_LMOD_CODE,
     p_TERM_CODE              =>:s$_curricula.module_term_code,
     p_KEY_SEQNO              => :SORLCUR.SORLCUR_KEY_SEQNO, 
     p_PRIORITY_NO            =>:SORLCUR.SORLCUR_PRIORITY_NO,
     p_ROLL_IND               =>:SORLCUR.SORLCUR_ROLL_IND,
     p_CACT_CODE              => soklcur.f_default_cact('INACTIVE'),
     p_USER_ID                => gb_common.f_sct_user,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_LEVL_CODE              =>:SORLCUR.SORLCUR_LEVL_CODE,
     p_COLL_CODE              =>:SORLCUR.SORLCUR_COLL_CODE,
     p_DEGC_CODE              =>:SORLCUR.SORLCUR_DEGC_CODE,
     p_TERM_CODE_CTLG         =>:SORLCUR.SORLCUR_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLCUR.SORLCUR_TERM_CODE_END,
     p_TERM_CODE_MATRIC       =>:SORLCUR.SORLCUR_TERM_CODE_MATRIC,
     p_TERM_CODE_ADMIT        =>:SORLCUR.SORLCUR_TERM_CODE_ADMIT,
     p_ADMT_CODE              =>:SORLCUR.SORLCUR_ADMT_CODE,
     p_CAMP_CODE              =>:SORLCUR.SORLCUR_CAMP_CODE,
     p_PROGRAM                =>:SORLCUR.SORLCUR_PROGRAM,
     p_START_DATE             =>:SORLCUR.SORLCUR_START_DATE,
     p_END_DATE               =>:SORLCUR.SORLCUR_END_DATE,
     p_CURR_RULE              =>:SORLCUR.SORLCUR_CURR_RULE,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              => lv_rowid,
     p_seqno_out              => lv_new_seqno, 
     p_curr_error_out         => :sorlcur.curr_error,
     p_override_severity      => 'N',
     p_severity_out           => :sorlcur.severity_out, 
     p_site_code              => :sorlcur.sorlcur_site_code,
     p_rate_code              => :sorlcur.sorlcur_rate_code,
     p_acyr_code              => :sorlcur.sorlcur_acyr_code,
     p_styp_code              => :sorlcur.sorlcur_styp_code,
     p_leav_code              => :sorlcur.sorlcur_leav_code,
     p_leav_from_date         => :sorlcur.sorlcur_leav_from_date,
     p_leav_to_date           => :sorlcur.sorlcur_leav_to_date,
     p_exp_grad_date          => :sorlcur.sorlcur_exp_grad_date,
     p_term_code_grad         => :sorlcur.sorlcur_term_code_grad,
     p_appl_key_seqno         => NULL,
     p_appl_seqno             => NULL,
     p_gapp_seqno             => NULL,
     p_user_id_update         => gb_common.f_sct_user );
     
     soklcur.p_create_sotlcur(
	     p_pidm =>:s$_curricula.module_pidm, 
	     p_seqno => lv_seqno,
	     p_cact_code => soklcur.f_default_cact('INACTIVE'),
	     p_priority_no => :sorlcur_priority_no,
	     p_term_code => :sorlcur_term_code, 
	     p_key_seqno => :sorlcur_key_seqno,
	     p_lmod_code => :s$_curricula.module_code); 
 
     lv_fieldofstudy_cur := sb_fieldofstudy.f_query_current
         (p_pidm => :sorlcur_pidm, 
          p_lcur_seqno => :sorlcur_seqno);  
      LOOP 
        FETCH lv_fieldofstudy_cur INTO lv_fieldofstudy_rec;
        EXIT WHEN lv_fieldofstudy_cur%NOTFOUND  ;
    
         SB_FIELDOFSTUDY.P_CREATE(P_PIDM   => :SORLCUR.SORLCUR_PIDM,
               P_LCUR_SEQNO     => lv_seqno,
               P_SEQNO          => NULL,
               P_LFST_CODE      => lv_fieldofstudy_rec.r_lfst_code,
               P_TERM_CODE      => :s$_curricula.module_term_code,
               P_PRIORITY_NO    => lv_fieldofstudy_rec.r_priority_no,
               P_CSTS_CODE      => soklcur.f_event_status('CHANGED'),
               P_CACT_CODE      => soklcur.f_default_cact('INACTIVE'),
               p_USER_ID        => gb_common.f_sct_user,
               p_DATA_ORIGIN    =>:GLOBAL.DATA_ORIGIN,
               P_MAJR_CODE      => lv_fieldofstudy_rec.r_majr_code,
               P_DEPT_CODE      => lv_fieldofstudy_rec.r_dept_code,
               P_TERM_CODE_CTLG => lv_fieldofstudy_rec.r_term_code_ctlg,
               P_LFOS_RULE      => lv_fieldofstudy_rec.r_lfos_rule,
               P_CONC_ATTACH_RULE  => lv_fieldofstudy_rec.r_conc_attach_rule,
               p_rolled_seqno   => NULL,
               p_term_code_end   => lv_fieldofstudy_rec.r_term_code_end,
               p_start_date     => lv_fieldofstudy_rec.r_start_date,
               p_end_date       => lv_fieldofstudy_rec.r_end_date,
               p_tmst_code      => lv_fieldofstudy_rec.r_tmst_code,
               p_majr_code_attach => lv_fieldofstudy_rec.r_majr_code_attach, 
               P_ROWID_OUT      => lv_rowid,
               P_CURR_ERROR_OUT     => :sorlcur.curr_error,
               P_override_severity => 'N',
               p_severity_out => :sorlcur.severity_out ,
               p_lfos_seqno_out => lv_new_seqno,
               p_user_id_update   => gb_common.f_sct_user); 
            
            soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
                    p_lcur_seqno => lv_seqno,
                    p_seqno => lv_new_seqno,
                    p_cact_code => soklcur.f_default_cact('INACTIVE'),
                    p_lfst_code => :sorlfos_lfst_code,
                    p_priority_no => :sorlfos_priority_no ,
                    p_majr_code => :sorlfos_majr_code,
                    p_dept_code => :sorlfos_dept_code);

          
       END LOOP;
       CLOSE lv_fieldofstudy_cur;
   


:system.message_level := '5';
go_block('sorlfos'); 
clear_block;
go_block('sorlcur');
create_record;
:system.message_level := '0'; 
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
if :sorlcur_cact_code is null then 
  :sorlcur_cact_code := :s$_curricula.default_cact;
end if; 
if :sorlcur_term_code is null then 
 :sorlcur_term_code := :s$_curricula.module_term_code;
 :sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
end if; 
:deactivate_ind := 'I';   -- mark it as insert to prevent delete, which will not cover the dup'd recs
:commplan_delete_trigger := 'I';  --- set comm plan to come up even if no changes
:sovlcur_current_ind := NULL;
:sorlcur_gapp_seqno := lv_gapp_seqno; 
:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 2; 
:lcur_rec_num := :system.cursor_record + 1; 
-- copy original values to new record 
if :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then
	:SORLCUR.SORLCUR_ADMT_CODE := :save_admit_code;
	:SORLCUR.SORLCUR_TERM_CODE_ADMIT := :save_admit_term;
	:SORLCUR.SORLCUR_TERM_CODE_MATRIC := :save_matric_term;
end if; 
:SORLCUR.SORLCUR_TERM_CODE_CTLG := :save_catlg_term; 
execute_trigger('NEW_SORLCUR');
G$_CHECK_FAILURE;
:sorlcur_priority_no := lv_save_priority; 

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
		 * SORLCUR.DEACTIVE_CREATE_NEW
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DEACTIVE_CREATE_NEW")
		public void sorlcur_DeactiveCreateNew()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False)|| isNull(getGlobal("CURRICULUM_QUERY"), "N").equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0207"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0208"), toStr("FORM"), toStr("Commit curriculum data changes before inactivating and inserting new.")));
					return ;
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						return ;
					}
				}
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurRolledSeqno().isNull() && SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("Y") )
				{
					{
						NNumber alertButton= NNumber.getNull();
						alertButton = toNumber(showAlert("CURRICULUM_INACT_GRDAPP_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
						else {
							warningMessage(GNls.Fget(toStr("SOQOLIB-0209"), toStr("FORM"), toStr("The replace curriculum was cancelled.")));
							return ;
							throw new ApplicationException();
						}
					}
				}
				{
					NNumber lvSeqno= NNumber.getNull();
					NNumber lvNewSeqno= NNumber.getNull();
					NString lvSeverityOut = NString.getNull();
					UnknownTypes.GbCommonInternalRecordIdType lvRowid= null;
					SbFieldofstudy.FieldofstudyRecRow lvFieldofstudyRec= null;
					UnknownTypes.SbFieldofstudyFieldofstudyRef lvFieldofstudyCur= null;
					NNumber lvSavePriority= NNumber.getNull();
					NNumber lvGappSeqno = NNumber.getNull();
					try
					{
						getFormModel().getSCurricula().setSaveAdmitCode(sorlcurElement.getSorlcurAdmtCode());
						getFormModel().getSCurricula().setSaveAdmitTerm(sorlcurElement.getSorlcurTermCodeAdmit());
						getFormModel().getSCurricula().setSaveMatricTerm(sorlcurElement.getSorlcurTermCodeMatric());
						getFormModel().getSCurricula().setSaveCatlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
						lvSavePriority = sorlcurElement.getSorlcurPriorityNo();
						// - inactivate grad app because the curriculum is being made
						// - inactive 
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) && !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurRolledSeqno().isNull() && SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("Y") )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							SbGradapp.pUpdate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno(), toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
						}
						if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( Soklcur.fRolledAwarded(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).equals("N") )
							{
								lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
							}
							else {
								lvGappSeqno = toNumber(null);
							}
						}
						else {
							lvGappSeqno = toNumber(null);
						}
						// - duplicate the current lcur and change the cact to deactivate 
						lvSeqno = SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm());
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>();
						Ref<NNumber> p_seqno_out_ref = new Ref<NNumber>();
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>(null);
						Ref<NString> p_severity_out_ref = new Ref<NString>(null);
						SbCurriculum.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/lvSeqno, /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno(), /*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), /*pRollInd=>*/sorlcurElement.getSorlcurRollInd(), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pTermCodeCtlg=>*/sorlcurElement.getSorlcurTermCodeCtlg(), /*pTermCodeEnd=>*/sorlcurElement.getSorlcurTermCodeEnd(), /*pTermCodeMatric=>*/sorlcurElement.getSorlcurTermCodeMatric(), /*pTermCodeAdmit=>*/sorlcurElement.getSorlcurTermCodeAdmit(), /*pAdmtCode=>*/sorlcurElement.getSorlcurAdmtCode(), /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pStartDate=>*/sorlcurElement.getSorlcurStartDate(), /*pEndDate=>*/sorlcurElement.getSorlcurEndDate(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/lvRowid, toStr(/*pSeqnoOut=>*/lvNewSeqno), toDate(/*pCurrErrorOut=>*/sorlcurElement.getCurrError()), /*pOverrideSeverity=>*/"N", toDate(/*pSeverityOut=>*/sorlcurElement.getSeverityOut()), toDate(/*pSiteCode=>*/sorlcurElement.getSorlcurSiteCode()), /*pRateCode=>*/sorlcurElement.getSorlcurRateCode(), /*pAcyrCode=>*/sorlcurElement.getSorlcurAcyrCode(), /*pStypCode=>*/sorlcurElement.getSorlcurStypCode(), /*pLeavCode=>*/sorlcurElement.getSorlcurLeavCode(), toNumber(/*pLeavFromDate=>*/sorlcurElement.getSorlcurLeavFromDate()), toNumber(/*pLeavToDate=>*/sorlcurElement.getSorlcurLeavToDate()), p_rowid_out_ref, p_seqno_out_ref, p_curr_error_out_ref, p_severity_out_ref, toStr(/*pGappSeqno=>*/null), toNumber(/*pUserIdUpdate=>*/GbCommon.fSctUser()));
						sorlcurElement.setSorlcurExpGradDate(p_rowid_out_ref.val);
						sorlcurElement.setSorlcurTermCodeGrad(p_seqno_out_ref.val);
						null = p_curr_error_out_ref.val;
						null = p_severity_out_ref.val;
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/lvSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), toStr(/*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo()), toNumber(/*pTermCode=>*/sorlcurElement.getSorlcurTermCode()), toStr(/*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						lvFieldofstudyCur = SbFieldofstudy.fQueryCurrent(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno());
						while (true) {
							ResultSet lvFieldofstudyCurResults = lvFieldofstudyCur.fetchInto();
							if ( lvFieldofstudyCurResults != null ) {
								lvFieldofstudyRec =  new SbFieldofstudy.FieldofstudyRecRow(lvFieldofstudyCurResults);
							}
							if ( lvFieldofstudyCur.notFound() ) 
								break;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							p_rowid_out_ref = new Ref<NString>(sorlcurElement.getCurrError());
							p_curr_error_out_ref = new Ref<NNumber>("N");
							p_severity_out_ref = new Ref<NString>(sorlcurElement.getSeverityOut());
							Ref<NNumber> p_lfos_seqno_out_ref = new Ref<NNumber>(lvNewSeqno);
							SbFieldofstudy.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/lvSeqno, toNumber(/*pSeqno=>*/null), /*pLfstCode=>*/lvFieldofstudyRec.RLfstCode, /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pPriorityNo=>*/lvFieldofstudyRec.RPriorityNo, /*pCstsCode=>*/Soklcur.fEventStatus(toStr("CHANGED")), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pMajrCode=>*/lvFieldofstudyRec.RMajrCode, /*pDeptCode=>*/lvFieldofstudyRec.RDeptCode, /*pTermCodeCtlg=>*/lvFieldofstudyRec.RTermCodeCtlg, /*pLfosRule=>*/lvFieldofstudyRec.RLfosRule, /*pConcAttachRule=>*/lvFieldofstudyRec.RConcAttachRule, toNumber(/*pRolledSeqno=>*/null), /*pTermCodeEnd=>*/lvFieldofstudyRec.RTermCodeEnd, /*pStartDate=>*/lvFieldofstudyRec.RStartDate, /*pEndDate=>*/lvFieldofstudyRec.REndDate, /*pTmstCode=>*/lvFieldofstudyRec.RTmstCode, /*pMajrCodeAttach=>*/lvFieldofstudyRec.RMajrCodeAttach, /*pRowidOut=>*/lvRowid, p_rowid_out_ref, p_curr_error_out_ref, p_severity_out_ref, p_lfos_seqno_out_ref, /*pUserIdUpdate=>*/GbCommon.fSctUser());
							sorlcurElement.setCurrError(p_rowid_out_ref.val);
							"N" = p_curr_error_out_ref.val;
							sorlcurElement.setSeverityOut(p_severity_out_ref.val);
							lvNewSeqno = p_lfos_seqno_out_ref.val;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/lvSeqno, /*pSeqno=>*/lvNewSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
						}
						lvFieldofstudyCur.close();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						goBlock(toStr("sorlfos"));
						clearBlock();
						goBlock(toStr("sorlcur"));
						createRecord();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						if ( sorlcurElement.getSorlcurCactCode().isNull() )
						{
							sorlcurElement.setSorlcurCactCode(getFormModel().getSCurricula().getDefaultCact());
						}
						if ( sorlcurElement.getSorlcurTermCode().isNull() )
						{
							sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
							sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
						}
						sorlcurElement.setDeactivateInd(toStr("I"));
						//  mark it as insert to prevent delete, which will not cover the dup'd recs
						getFormModel().getSCurricula().setCommplanDeleteTrigger(toStr("I"));
						// - set comm plan to come up even if no changes
						sorlcurElement.setSovlcurCurrentInd(toStr(null));
						sorlcurElement.setSorlcurGappSeqno(lvGappSeqno);
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(2));
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord().add(1)));
						//  copy original values to new record 
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							sorlcurElement.setSorlcurAdmtCode(getFormModel().getSCurricula().getSaveAdmitCode());
							sorlcurElement.setSorlcurTermCodeAdmit(getFormModel().getSCurricula().getSaveAdmitTerm());
							sorlcurElement.setSorlcurTermCodeMatric(getFormModel().getSCurricula().getSaveMatricTerm());
						}
						sorlcurElement.setSorlcurTermCodeCtlg(getFormModel().getSCurricula().getSaveCatlgTerm());
						executeAction("NEW_SORLCUR");
						getContainer().getGoqrpls().gCheckFailure();
						sorlcurElement.setSorlcurPriorityNo(lvSavePriority);
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.QUERY_ONLY
		 DECLARE
    lv_what_obj  VARCHAR2(30);
    lv_what_role VARCHAR2(30);
BEGIN
	
 	
    GOKDBMS.APPLICATION_INFO_READ_MODULE(lv_what_obj, lv_what_role);
    IF ( lv_what_role IS NOT NULL AND SUBSTR(lv_what_role,-2,2) = '_Q' ) 
    	 OR    INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(:system.current_form,USER),           
                  'CURRICULUM:F') =  0  
    	 THEN
       MESSAGE(g$_nls.get('SOQOLIB-0210','FORM','*ERROR* You are running with a query only role, this function is not allowed.'));
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.QUERY_ONLY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_ONLY")
		public void sorlcur_QueryOnly()
		{
			
				{
					NString lvWhatObj= NString.getNull();
					NString lvWhatRole= NString.getNull();
					Ref<NString> p_module_name_ref = new Ref<NString>(lvWhatObj);
					Ref<NString> p_action_name_ref = new Ref<NString>(lvWhatRole);
					Gokdbms.applicationInfoReadModule(p_module_name_ref, p_action_name_ref);
					lvWhatObj = p_module_name_ref.val;
					lvWhatRole = p_action_name_ref.val;
					if ( (!lvWhatRole.isNull() && substring(lvWhatRole, - (2), toInt(2)).equals("_Q")) || inStr(GSecurity.FgGetTabSecurityFnc(getCurrentTaskName(), getUser()), toStr("CURRICULUM:F")).equals(0) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0210"), toStr("FORM"), toStr("*ERROR* You are running with a query only role, this function is not allowed.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.DEACTIVE_DUPLICATE
		 --- trigger behind the update icon 
:save_admit_code := :SORLCUR.SORLCUR_ADMT_CODE;
:save_admit_term := :SORLCUR.SORLCUR_TERM_CODE_ADMIT; 
:save_matric_term := :SORLCUR.SORLCUR_TERM_CODE_MATRIC;
:save_catlg_term  := :SORLCUR.SORLCUR_TERM_CODE_CTLG; 
if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' or 
	nvl(:global.curriculum_query, 'N') = 'Y' THEN 
	message( G$_NLS.Get('SOQOLIB-0211', 'FORM','Invalid option for query only.') );
	return;
end if;
IF	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0212', 'FORM','Commit curriculum data changes before inactivating and inserting new.') );
  return; -- 	raise form_trigger_failure;
end if; 
	
if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    return; --  raise form_trigger_failure;
	 end if; 
end if;


-- duplicate the current lcur and change the cact to deactivate 
declare 
	lv_seqno                sorlcur.sorlcur_seqno%type; 
	lv_new_seqno            sorlcur.sorlcur_seqno%type; 
	lv_severity_out         varchar2(1) := NULL;
	lv_rowid                gb_common.internal_record_id_type; 
 	lv_fieldofstudy_rec     sb_fieldofstudy.fieldofstudy_rec;
  lv_fieldofstudy_cur     sb_fieldofstudy.fieldofstudy_ref;
  
  save_priority_no        sorlcur.sorlcur_priority_no%type := :sorlcur.sorlcur_priority_no; 

	save_lcur  sorlcur.sorlcur_seqno%TYPE := null;
	save_current  varchar2(1) := NULL; 
	save_roll        sorlcur.sorlcur_rolled_seqno%type := null; 
	loop_cnt    number := 1; 
	count_lfos  number := 0; 
	CURSOR sorlfos_cnt_c IS
	  select nvl(count(*),0)
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and ( ( save_current = 'Y' and sovlfos_current_ind = 'Y')
	     or save_current = 'N')
	  and sovlfos_active_ind = 'Y';
	  
	CURSOR sorlfos_c IS
	  select sorlfos_lfst_code, sorlfos_majr_code,
	     sorlfos_term_code,  sorlfos_priority_no,
	     sorlfos_conc_attach_rule,  sorlfos_lfos_rule ,
	     sorlfos_dept_code, sorlfos_majr_code_attach,
	     sorlfos_cact_code, sorlfos_csts_code,
	     sorlfos_term_code_ctlg 
	  from sobcact, sorlfos
	  where sorlfos_pidm = :s$_curricula.module_pidm
	  and sorlfos_lcur_seqno = save_lcur 
	  and sobcact_cact_code = sorlfos_cact_code
	  and sobcact_active_ind = 'Y' 
	  and sorlfos_seqno = ( select max(m.sorlfos_seqno)
	       from sorlfos m
	       where sorlfos.sorlfos_pidm = m.sorlfos_pidm
	       and sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno
	       and sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code
	       and sorlfos.sorlfos_priority_no = m.sorlfos_priority_no)
	  order by decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', 
	     sb_fieldofstudy_str.f_minor, '3',
	     sb_fieldofstudy_str.f_concentration, '3', 4),
	     sorlfos_priority_no;
	     
 	 alert_button  number; 
 	 lv_gapp_seqno  sorlcur.sorlcur_gapp_seqno%type; 
begin 
   	save_lcur := :sorlcur.sorlcur_seqno;
    save_current := :sorlcur.sovlcur_current_ind;
    save_priority_no     := :sorlcur.sorlcur_priority_no;
    save_roll := null; 
    
   if	:sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then  
     if :sorlcur.sorlcur_gapp_seqno is not null and 
    	:sorlcur.sorlcur_rolled_seqno is null and 
    	 sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
    	    p_seqno => :sorlcur.sorlcur_gapp_seqno) = 'Y'   then 
       	alert_button := show_alert('CURRIC_COPY_INACT_GAPP_ALERT');
        
        if alert_button = ALERT_BUTTON1 then
          lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
        elsif alert_button = ALERT_BUTTON2 then  
          lv_gapp_seqno := null;
          sb_gradapp.p_update 
   	       (p_pidm => :sorlcur.sorlcur_pidm,
   	        p_seqno => :sorlcur.sorlcur_gapp_seqno,
   	        p_gast_code => sb_gradapp_strings.f_inactive,  
   	        p_USER_ID                => gb_common.f_sct_user,
            p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ); 
        else 
        	save_priority_no := null; 
          lv_gapp_seqno := null;
          sb_gradapp.p_update 
   	       (p_pidm => :sorlcur.sorlcur_pidm,
   	        p_seqno => :sorlcur.sorlcur_gapp_seqno,
   	        p_gast_code => sb_gradapp_strings.f_inactive,  
   	        p_USER_ID                => gb_common.f_sct_user,
            p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ); 
        end if;
      else
        	lv_gapp_seqno := null; 
      end if; 
   elsif :sorlcur.sorlcur_gapp_seqno is not null and 
   	  :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_outcome then  
   	   if soklcur.f_rolled_awarded (p_pidm => :sorlcur.sorlcur_pidm,
           P_lmod_code =>  :sorlcur.sorlcur_lmod_code, 
           P_key_seqno => :sorlcur.sorlcur_key_seqno) <> 'Y' then  
   	     lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
   	   else
   	   	 lv_gapp_seqno := null;
   	   end if; 
   	 end if;  	
    

  	OPEN sorlfos_cnt_c;
    fetch sorlfos_cnt_c into count_lfos;
    close sorlfos_cnt_c;
	  lv_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
    :lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind;
    SB_curriculum.P_CREATE(
     p_PIDM                   =>:SORLCUR.SORLCUR_PIDM,
     p_SEQNO                  => lv_seqno,
     p_LMOD_CODE              => :SORLCUR.SORLCUR_LMOD_CODE,
     p_TERM_CODE              => :s$_curricula.module_term_code,
     p_KEY_SEQNO              => :SORLCUR.SORLCUR_KEY_SEQNO, 
     p_PRIORITY_NO            =>:SORLCUR.SORLCUR_PRIORITY_NO,
     p_ROLL_IND               =>:SORLCUR.SORLCUR_ROLL_IND,
     p_CACT_CODE              =>soklcur.f_default_cact('INACTIVE'),
     p_USER_ID                => gb_common.f_sct_user,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_LEVL_CODE              =>:SORLCUR.SORLCUR_LEVL_CODE,
     p_COLL_CODE              =>:SORLCUR.SORLCUR_COLL_CODE,
     p_DEGC_CODE              =>:SORLCUR.SORLCUR_DEGC_CODE,
     p_TERM_CODE_CTLG         =>:SORLCUR.SORLCUR_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLCUR.SORLCUR_TERM_CODE_END,
     p_TERM_CODE_MATRIC       =>:SORLCUR.SORLCUR_TERM_CODE_MATRIC,
     p_TERM_CODE_ADMIT        =>:SORLCUR.SORLCUR_TERM_CODE_ADMIT,
     p_ADMT_CODE              =>:SORLCUR.SORLCUR_ADMT_CODE,
     p_CAMP_CODE              =>:SORLCUR.SORLCUR_CAMP_CODE,
     p_PROGRAM                =>:SORLCUR.SORLCUR_PROGRAM,
     p_START_DATE             =>:SORLCUR.SORLCUR_START_DATE,
     p_END_DATE               =>:SORLCUR.SORLCUR_END_DATE,
     p_CURR_RULE              =>:SORLCUR.SORLCUR_CURR_RULE,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              => lv_rowid,
     p_seqno_out              => lv_new_seqno, 
     p_curr_error_out         => :sorlcur.curr_error,
     p_override_severity      => 'N',
     p_severity_out           => :sorlcur.severity_out, 
     p_site_code              => :sorlcur.sorlcur_site_code,
     p_rate_code              => :sorlcur.sorlcur_rate_code,
     p_acyr_code              => :sorlcur.sorlcur_acyr_code,
     p_styp_code              => :sorlcur.sorlcur_styp_code,
     p_leav_code              => :sorlcur.sorlcur_leav_code,
     p_leav_from_date         => :sorlcur.sorlcur_leav_from_date,
     p_leav_to_date           => :sorlcur.sorlcur_leav_to_date,
     p_exp_grad_date          => :sorlcur.sorlcur_exp_grad_date,
     p_term_code_grad         => :sorlcur.sorlcur_term_code_grad,
     p_appl_key_seqno         => NULL,
     p_appl_seqno             => NULL ,
     p_gapp_seqno             => NULL,
     p_user_id_update         => gb_common.f_sct_user);
     
     soklcur.p_create_sotlcur(
	     p_pidm =>:s$_curricula.module_pidm, 
	     p_seqno => lv_seqno,
	     p_cact_code => soklcur.f_default_cact('INACTIVE'),
	     p_priority_no => :sorlcur.sorlcur_priority_no,
	     p_term_code => :sorlcur.sorlcur_term_code, 
	     p_key_seqno => :sorlcur.sorlcur_key_seqno,
	     p_lmod_code => :s$_curricula.module_code); 
 
     lv_fieldofstudy_cur := sb_fieldofstudy.f_query_current
         (p_pidm => :sorlcur.sorlcur_pidm, 
          p_lcur_seqno => :sorlcur.sorlcur_seqno);  
      LOOP 
        FETCH lv_fieldofstudy_cur INTO lv_fieldofstudy_rec;
        EXIT WHEN lv_fieldofstudy_cur%NOTFOUND  ;
    
         SB_FIELDOFSTUDY.P_CREATE(P_PIDM   => :SORLCUR.SORLCUR_PIDM,
               P_LCUR_SEQNO     => lv_seqno,
               P_SEQNO          => NULL,
               P_LFST_CODE      => lv_fieldofstudy_rec.r_lfst_code,
               P_TERM_CODE      => :s$_curricula.module_term_code,
               P_PRIORITY_NO    => lv_fieldofstudy_rec.r_priority_no,
               P_CSTS_CODE      => soklcur.f_event_status('CHANGED'),
               P_CACT_CODE      => soklcur.f_default_cact('INACTIVE'),
               p_USER_ID        => gb_common.f_sct_user,
               p_DATA_ORIGIN    =>:GLOBAL.DATA_ORIGIN,
               P_MAJR_CODE      => lv_fieldofstudy_rec.r_majr_code,
               P_DEPT_CODE      => lv_fieldofstudy_rec.r_dept_code,
               P_TERM_CODE_CTLG => lv_fieldofstudy_rec.r_term_code_ctlg,
               P_LFOS_RULE      => lv_fieldofstudy_rec.r_lfos_rule,
               P_CONC_ATTACH_RULE  => lv_fieldofstudy_rec.r_conc_attach_rule,
               p_rolled_seqno   => NULL,
               p_term_code_end   => lv_fieldofstudy_rec.r_term_code_end,
               p_start_date     => lv_fieldofstudy_rec.r_start_date,
               p_end_date       => lv_fieldofstudy_rec.r_end_date,
               p_tmst_code      => lv_fieldofstudy_rec.r_tmst_code,
               p_majr_code_attach => lv_fieldofstudy_rec.r_majr_code_attach, 
               P_ROWID_OUT      => lv_rowid,
               P_CURR_ERROR_OUT     => :sorlcur.curr_error,
               P_override_severity => 'N',
               p_severity_out => :sorlcur.severity_out ,
               p_lfos_seqno_out => lv_new_seqno,
               p_user_id_update   => gb_common.f_sct_user); 
               
               soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
                    p_lcur_seqno => lv_seqno,
                    p_seqno => lv_new_seqno,
                    p_cact_code => soklcur.f_default_cact('INACTIVE'),
                    p_lfst_code => :sorlfos.sorlfos_lfst_code,
                    p_priority_no => :sorlfos.sorlfos_priority_no ,
                    p_majr_code => :sorlfos.sorlfos_majr_code,
                    p_dept_code => :sorlfos.sorlfos_dept_code);
          
       END LOOP;
       CLOSE lv_fieldofstudy_cur;
   

--- insert the new record 
create_record;
g$_check_failure; 
--- copy 
	
duplicate_record;
g$_check_failure; 

:dup_create_ind := 'N';
:lcur_rec_num := :system.cursor_record + 1; 
:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 2; 
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
g$_check_failure; 

:sorlcur.sorlcur_rolled_seqno := null;
:sorlcur.LCUR_ROLLED_KEY_SEQNO := null;  
:sorlcur.sovlcur_appl_seqno := null;
:sorlcur.sorlcur_gapp_seqno := lv_gapp_seqno;
:sorlcur.sovlcur_appl_key_seqno := null; 
:sorlcur.sovlcur_current_ind := null;
:sorlcur.sorlcur_priority_no := save_priority_no; 
:deactivate_ind := 'I';   -- mark it as insert to prevent delete, which will not cover the dup'd recs
-- RPE to not clear out status when dup record occurs 1-410eo
--:sorlcur.sorlcur_cact_code := null; 
:sorlcur_duplicate_ind := 'Y';
:sorlcur_activity_date := null;
:sorlcur_user_id := null; 
:sovlcur_rowid := NULL; 
:sorlcur_term_code := :s$_curricula.module_term_code;
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
 
:system.message_level := '5'; 
next_block;
clear_block;
--- count number of sorlfos there are to copy 
if count_lfos > 0 then 
	

OPEN sorlfos_c;
LOOP
	if loop_cnt <> 1 and loop_cnt <= count_lfos then
		next_record;
	end if;
	loop_cnt := loop_cnt + 1; 
	fetch sorlfos_c into 
       :sorlfos.sorlfos_lfst_code, :sorlfos.sorlfos_majr_code,
	     :sorlfos.sorlfos_term_code,  :sorlfos.sorlfos_priority_no,
	     :sorlfos.sorlfos_conc_attach_rule,  :sorlfos.sorlfos_lfos_rule,
	     :sorlfos_dept_code, :sorlfos_majr_code_attach,
	     :sorlfos_cact_code, :sorlfos_csts_code,
	     :sorlfos_term_code_ctlg ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code; 
	:sovlfos_rowid := null;
	:sorlfos_current_ind := null; 
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
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 
go_block('sorlcur');
:system.message_level := '0'; 
:sorlcur_duplicate_ind := 'N'; 
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
		 * SORLCUR.DEACTIVE_DUPLICATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DEACTIVE_DUPLICATE")
		public void sorlcur_DeactiveDuplicate()
		{
			
				// - trigger behind the update icon 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				// - trigger behind the update icon 
				getFormModel().getSCurricula().setSaveAdmitCode(sorlcurElement.getSorlcurAdmtCode());
				getFormModel().getSCurricula().setSaveAdmitTerm(sorlcurElement.getSorlcurTermCodeAdmit());
				getFormModel().getSCurricula().setSaveMatricTerm(sorlcurElement.getSorlcurTermCodeMatric());
				getFormModel().getSCurricula().setSaveCatlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False)|| isNull(getGlobal("CURRICULUM_QUERY"), "N").equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0211"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0212"), toStr("FORM"), toStr("Commit curriculum data changes before inactivating and inserting new.")));
					return ;
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						return ;
					}
				}
				{
					NNumber lvSeqno= NNumber.getNull();
					NNumber lvNewSeqno= NNumber.getNull();
					NString lvSeverityOut = NString.getNull();
					UnknownTypes.GbCommonInternalRecordIdType lvRowid= null;
					SbFieldofstudy.FieldofstudyRecRow lvFieldofstudyRec= null;
					UnknownTypes.SbFieldofstudyFieldofstudyRef lvFieldofstudyCur= null;
					NNumber savePriorityNo = sorlcurElement.getSorlcurPriorityNo();
					NNumber saveLcur = NNumber.getNull();
					NString saveCurrent = NString.getNull();
					NNumber saveRoll = NNumber.getNull();
					NNumber loopCnt = toNumber(1);
					NNumber countLfos = toNumber(0);
					String sqlsorlfosCntC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND ((:P_SAVE_CURRENT = 'Y' AND sovlfos_current_ind = 'Y') OR :P_SAVE_CURRENT = 'N') AND sovlfos_active_ind = 'Y' ";
					DataCursor sorlfosCntC = new DataCursor(sqlsorlfosCntC);
					String sqlsorlfosC = "SELECT sorlfos_lfst_code, sorlfos_majr_code, sorlfos_term_code, sorlfos_priority_no, sorlfos_conc_attach_rule, sorlfos_lfos_rule, sorlfos_dept_code, sorlfos_majr_code_attach, sorlfos_cact_code, sorlfos_csts_code, sorlfos_term_code_ctlg " +
	" FROM sobcact, sorlfos " +
	" WHERE sorlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sorlfos_lcur_seqno = :P_SAVE_LCUR AND sobcact_cact_code = sorlfos_cact_code AND sobcact_active_ind = 'Y' AND sorlfos_seqno = (SELECT max(m.sorlfos_seqno) " +
		" FROM sorlfos m " +
		" WHERE sorlfos.sorlfos_pidm = m.sorlfos_pidm AND sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno AND sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code AND sorlfos.sorlfos_priority_no = m.sorlfos_priority_no ) " +
	" ORDER BY decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sorlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					NNumber alertButton= NNumber.getNull();
					NNumber lvGappSeqno= NNumber.getNull();
					try
					{
						saveLcur = sorlcurElement.getSorlcurSeqno();
						saveCurrent = sorlcurElement.getSovlcurCurrentInd();
						savePriorityNo = sorlcurElement.getSorlcurPriorityNo();
						saveRoll = toNumber(null);
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurRolledSeqno().isNull() && SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("Y") )
							{
								alertButton = toNumber(showAlert("CURRIC_COPY_INACT_GAPP_ALERT"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
									lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
								}
								else if ( alertButton.equals(MessageServices.BUTTON2) ) {
									lvGappSeqno = toNumber(null);
									// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
									SbGradapp.pUpdate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno(), toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
								}
								else {
									savePriorityNo = toNumber(null);
									lvGappSeqno = toNumber(null);
									// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
									SbGradapp.pUpdate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno(), toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
								}
							}
							else {
								lvGappSeqno = toNumber(null);
							}
						}
						else if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) ) {
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( Soklcur.fRolledAwarded(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).notEquals("Y") )
							{
								lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
							}
							else {
								lvGappSeqno = toNumber(null);
							}
						}
						//Setting query parameters
						sorlfosCntC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						sorlfosCntC.addParameter("P_SAVE_LCUR", saveLcur);
						sorlfosCntC.addParameter("P_SAVE_CURRENT", saveCurrent);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosCntC.
						sorlfosCntC.open();
						ResultSet sorlfosCntCResults = sorlfosCntC.fetchInto();
						if ( sorlfosCntCResults != null ) {
							countLfos = sorlfosCntCResults.getNumber(0);
						}
						sorlfosCntC.close();
						lvSeqno = SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm());
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>();
						Ref<NNumber> p_seqno_out_ref = new Ref<NNumber>(sorlcurElement.getSorlcurTermCodeGrad());
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>(null);
						Ref<NString> p_severity_out_ref = new Ref<NString>(null);
						SbCurriculum.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/lvSeqno, /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno(), /*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), /*pRollInd=>*/sorlcurElement.getSorlcurRollInd(), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pTermCodeCtlg=>*/sorlcurElement.getSorlcurTermCodeCtlg(), /*pTermCodeEnd=>*/sorlcurElement.getSorlcurTermCodeEnd(), /*pTermCodeMatric=>*/sorlcurElement.getSorlcurTermCodeMatric(), /*pTermCodeAdmit=>*/sorlcurElement.getSorlcurTermCodeAdmit(), /*pAdmtCode=>*/sorlcurElement.getSorlcurAdmtCode(), /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pStartDate=>*/sorlcurElement.getSorlcurStartDate(), /*pEndDate=>*/sorlcurElement.getSorlcurEndDate(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/lvRowid, toStr(/*pSeqnoOut=>*/lvNewSeqno), toDate(/*pCurrErrorOut=>*/sorlcurElement.getCurrError()), /*pOverrideSeverity=>*/"N", toDate(/*pSeverityOut=>*/sorlcurElement.getSeverityOut()), toDate(/*pSiteCode=>*/sorlcurElement.getSorlcurSiteCode()), /*pRateCode=>*/sorlcurElement.getSorlcurRateCode(), /*pAcyrCode=>*/sorlcurElement.getSorlcurAcyrCode(), /*pStypCode=>*/sorlcurElement.getSorlcurStypCode(), /*pLeavCode=>*/sorlcurElement.getSorlcurLeavCode(), toNumber(/*pLeavFromDate=>*/sorlcurElement.getSorlcurLeavFromDate()), toNumber(/*pLeavToDate=>*/sorlcurElement.getSorlcurLeavToDate()), p_rowid_out_ref, p_seqno_out_ref, p_curr_error_out_ref, p_severity_out_ref, toStr(/*pGappSeqno=>*/null), toNumber(/*pUserIdUpdate=>*/GbCommon.fSctUser()));
						sorlcurElement.setSorlcurExpGradDate(p_rowid_out_ref.val);
						sorlcurElement.setSorlcurTermCodeGrad(p_seqno_out_ref.val);
						null = p_curr_error_out_ref.val;
						null = p_severity_out_ref.val;
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/lvSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), toStr(/*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo()), toNumber(/*pTermCode=>*/sorlcurElement.getSorlcurTermCode()), toStr(/*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						lvFieldofstudyCur = SbFieldofstudy.fQueryCurrent(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno());
						while (true) {
							ResultSet lvFieldofstudyCurResults = lvFieldofstudyCur.fetchInto();
							if ( lvFieldofstudyCurResults != null ) {
								lvFieldofstudyRec =  new SbFieldofstudy.FieldofstudyRecRow(lvFieldofstudyCurResults);
							}
							if ( lvFieldofstudyCur.notFound() ) 
								break;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							p_rowid_out_ref = new Ref<NString>(sorlcurElement.getCurrError());
							p_curr_error_out_ref = new Ref<NNumber>();
							p_severity_out_ref = new Ref<NString>(sorlcurElement.getSeverityOut());
							Ref<NNumber> p_lfos_seqno_out_ref = new Ref<NNumber>(lvNewSeqno);
							SbFieldofstudy.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/lvSeqno, toNumber(/*pSeqno=>*/null), /*pLfstCode=>*/lvFieldofstudyRec.RLfstCode, /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pPriorityNo=>*/lvFieldofstudyRec.RPriorityNo, /*pCstsCode=>*/Soklcur.fEventStatus(toStr("CHANGED")), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pMajrCode=>*/lvFieldofstudyRec.RMajrCode, /*pDeptCode=>*/lvFieldofstudyRec.RDeptCode, /*pTermCodeCtlg=>*/lvFieldofstudyRec.RTermCodeCtlg, /*pLfosRule=>*/lvFieldofstudyRec.RLfosRule, /*pConcAttachRule=>*/lvFieldofstudyRec.RConcAttachRule, toNumber(/*pRolledSeqno=>*/null), /*pTermCodeEnd=>*/lvFieldofstudyRec.RTermCodeEnd, /*pStartDate=>*/lvFieldofstudyRec.RStartDate, /*pEndDate=>*/lvFieldofstudyRec.REndDate, /*pTmstCode=>*/lvFieldofstudyRec.RTmstCode, /*pMajrCodeAttach=>*/lvFieldofstudyRec.RMajrCodeAttach, /*pRowidOut=>*/lvRowid, p_rowid_out_ref, p_curr_error_out_ref, p_severity_out_ref, p_lfos_seqno_out_ref, /*pUserIdUpdate=>*/GbCommon.fSctUser());
							sorlcurElement.setCurrError(p_rowid_out_ref.val);
							"N" = p_curr_error_out_ref.val;
							sorlcurElement.setSeverityOut(p_severity_out_ref.val);
							lvNewSeqno = p_lfos_seqno_out_ref.val;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/lvSeqno, /*pSeqno=>*/lvNewSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
						}
						lvFieldofstudyCur.close();
						// - insert the new record 
						createRecord();
						getContainer().getGoqrpls().gCheckFailure();
						// - copy 
						duplicateRecord();
						getContainer().getGoqrpls().gCheckFailure();
						getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord().add(1)));
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(2));
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
						getContainer().getGoqrpls().gCheckFailure();
						sorlcurElement.setSorlcurRolledSeqno(toNumber(null));
						sorlcurElement.setLcurRolledKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurApplSeqno(toNumber(null));
						sorlcurElement.setSorlcurGappSeqno(lvGappSeqno);
						sorlcurElement.setSovlcurApplKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurCurrentInd(toStr(null));
						sorlcurElement.setSorlcurPriorityNo(savePriorityNo);
						sorlcurElement.setDeactivateInd(toStr("I"));
						//  mark it as insert to prevent delete, which will not cover the dup'd recs
						//  RPE to not clear out status when dup record occurs 1-410eo
						// :sorlcur.sorlcur_cact_code := null; 
						sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
						sorlcurElement.setSorlcurActivityDate(toDate(null));
						sorlcurElement.setSorlcurUserId(toStr(null));
						sorlcurElement.setSovlcurRowid(toStr(null));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						// - count number of sorlfos there are to copy 
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
									sorlfosElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
									sorlfosElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
									sorlfosElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
									sorlfosElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
									sorlfosElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
									sorlfosElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
									sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(6));
									sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(7));
									sorlfosElement.setSorlfosCactCode(sorlfosCResults.getStr(8));
									sorlfosElement.setSorlfosCstsCode(sorlfosCResults.getStr(9));
									sorlfosElement.setSorlfosTermCodeCtlg(sorlfosCResults.getStr(10));
								}
								if ( sorlfosC.notFound() ) 
									break;
								sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
								sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
								sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
								sorlfosElement.setSovlfosRowid(toStr(null));
								sorlfosElement.setSorlfosCurrentInd(toStr(null));
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
							}
							sorlfosC.close();
							firstRecord();
						}
						goBlock(toStr("sorlcur"));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.DUPLICATE_CURRIC
		 --- this is called from the duplicate record icon
--- it's different then key-duprec becuase it does not get the values from the 
--  default table sorlcdf 
--message('at start of duplicate icon'); 
if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE' or 
	nvl(:global.curriculum_query, 'N') = 'Y' THEN 
	message( G$_NLS.Get('SOQOLIB-0213', 'FORM','Invalid option for query only.') );
	return;
end if;
IF	( get_block_property('SORLCUR',STATUS) = 'CHANGED'
  OR	get_block_property('SORLFOS',STATUS) = 'CHANGED' ) 
	then 
	message( G$_NLS.Get('SOQOLIB-0214', 'FORM','Commit curriculum data changes before inactivating and inserting new.') );
  return; --  raise form_trigger_failure;
end if; 
	
if :s$_curricula.module_insert_warning is not null then 
	message(:s$_curricula.module_insert_warning);
else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    message(:s$_curricula.module_insert_restriction);
	    return; -- raise form_trigger_failure;
	 end if; 
end if;


declare 
	lv_seqno                sorlcur.sorlcur_seqno%type; 
	lv_new_seqno            sorlcur.sorlcur_seqno%type; 
	lv_severity_out         varchar2(1) := NULL;
	lv_rowid                gb_common.internal_record_id_type; 
 	lv_fieldofstudy_rec     sb_fieldofstudy.fieldofstudy_rec;
  lv_fieldofstudy_cur     sb_fieldofstudy.fieldofstudy_ref;
  save_priority_no        sorlcur.sorlcur_priority_no%type; 
  save_active   varchar2(1) := null; 
	save_lcur  sorlcur.sorlcur_seqno%TYPE := null;
	save_current  varchar2(1) := NULL; 
	loop_cnt    number := 1; 
	count_lfos  number := 0; 
	CURSOR sorlfos_cnt_c IS
	  select nvl(count(*),0)
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and ( ( save_current = 'Y' and sovlfos_current_ind = 'Y')
	     or save_current = 'N')
	  and ( (sovlfos_active_ind = 'Y') and save_active = 'Y' OR 
	         (save_active = 'N'));
	  
	CURSOR sorlfos_c IS
	  select sorlfos_lfst_code, sorlfos_majr_code,
	     sorlfos_term_code,  sorlfos_priority_no,
	     sorlfos_conc_attach_rule,  sorlfos_lfos_rule ,
	     sorlfos_dept_code, sorlfos_majr_code_attach,
	     sorlfos_cact_code, sorlfos_csts_code,
	     sorlfos_term_code_ctlg 
	  from sobcact, sorlfos
	  where sorlfos_pidm = :s$_curricula.module_pidm
	  and sorlfos_lcur_seqno = save_lcur 
	  and sobcact_cact_code = sorlfos_cact_code
	  and ( (sobcact_active_ind = 'Y') and save_active = 'Y' OR 
	         (save_active = 'N'))
	  and sorlfos_seqno = ( select max(m.sorlfos_seqno)
	       from sorlfos m
	       where sorlfos.sorlfos_pidm = m.sorlfos_pidm
	       and sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno
	       and sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code
	       and sorlfos.sorlfos_priority_no = m.sorlfos_priority_no)
	  order by decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', 
	     sb_fieldofstudy_str.f_minor, '3',
	     sb_fieldofstudy_str.f_concentration, '3', 4),
	     sorlfos_priority_no;
	 
	 alert_button  number; 
 	 lv_gapp_seqno  sorlcur.sorlcur_gapp_seqno%type := null; 
begin 
	save_priority_no := :sorlcur.sorlcur_priority_no;
	:sorlcur.sorlcur_duplicate_ind := 'Y'; 
--	message('save priority: ' || save_priority_no); 
  if 	:sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_learner then 
     if :sorlcur.sorlcur_gapp_seqno is not null and 
    	:sorlcur.sorlcur_rolled_seqno is null and 
    	 sb_gradapp.f_isactive(p_pidm => :sorlcur.sorlcur_pidm,
    	    p_seqno => :sorlcur.sorlcur_gapp_seqno) = 'Y'   then 
    	    
       	alert_button := show_alert('CURRICULUM_COPY_GAPP_ALERT');
        if alert_button = ALERT_BUTTON1 then
          lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
        elsif alert_button = ALERT_BUTTON2 then  
          lv_gapp_seqno := null;
          sb_gradapp.p_update 
   	       (p_pidm => :sorlcur.sorlcur_pidm,
   	        p_seqno => :sorlcur.sorlcur_gapp_seqno,
   	        p_gast_code => sb_gradapp_strings.f_inactive,  
   	        p_USER_ID                => gb_common.f_sct_user,
            p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ); 
        else 
        
        	save_priority_no := null; 
        end if;
      else
        	lv_gapp_seqno := null; 
        --	save_priority_no := null;
      end if; 
  elsif :sorlcur.sorlcur_gapp_seqno is not null and 
   	  :sorlcur.sorlcur_lmod_code = sb_curriculum_str.f_outcome then  
   	   if soklcur.f_rolled_awarded (p_pidm => :sorlcur.sorlcur_pidm,
           P_lmod_code =>  :sorlcur.sorlcur_lmod_code, 
           P_key_seqno => :sorlcur.sorlcur_key_seqno) <> 'Y' then  
   	     lv_gapp_seqno := :sorlcur.sorlcur_gapp_seqno;
   	   else
   	   	 lv_gapp_seqno := null;
   	   end if; 
  end if; 
-- save the priority no 

:save_admit_code := :SORLCUR.SORLCUR_ADMT_CODE;
:save_admit_term := :SORLCUR.SORLCUR_TERM_CODE_ADMIT; 
:save_matric_term := :SORLCUR.SORLCUR_TERM_CODE_MATRIC;
:save_catlg_term  := :SORLCUR.SORLCUR_TERM_CODE_CTLG; 
save_lcur := :sorlcur.sorlcur_seqno;
save_current := :sorlcur.sovlcur_current_ind;
save_active := sb_learnercurricstatus.f_is_active(:sorlcur.sorlcur_cact_code);

OPEN sorlfos_cnt_c;
fetch sorlfos_cnt_c into count_lfos;
close sorlfos_cnt_c;


--- insert the new record 
create_record;
g$_check_failure; 
-- message('before dup, save prior: ' || save_priority_no); 
--- copy 
	
duplicate_record;
g$_check_failure;

:dup_create_ind := 'N';
:lcur_rec_num := :system.cursor_record + 1; 
:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 1; 
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
:sorlcur.sorlcur_rolled_seqno := null;
:sorlcur.LCUR_ROLLED_KEY_SEQNO := null; 
:sorlcur.sovlcur_appl_seqno := null;
:sorlcur.sorlcur_gapp_seqno := lv_gapp_seqno;
:sorlcur.sovlcur_appl_key_seqno := null; 
:sorlcur.sovlcur_current_ind := null;
:sorlcur.sorlcur_priority_no := save_priority_no; 
 
-- RPE to not clear out status when dup record occurs 1-410eo
--:sorlcur.sorlcur_cact_code := null; 
:sorlcur_duplicate_ind := 'Y';
:sorlcur_activity_date := null;
:sorlcur_user_id := null; 
:sovlcur_rowid := NULL; 
:sorlcur_term_code := :s$_curricula.module_term_code;
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
 
:system.message_level := '5'; 
next_block;
clear_block;
--- count number of sorlfos there are to copy 
if count_lfos > 0 then 
	

OPEN sorlfos_c;
LOOP
	if loop_cnt <> 1 and loop_cnt <= count_lfos then
		next_record;
	end if;
	loop_cnt := loop_cnt + 1; 
	fetch sorlfos_c into 
       :sorlfos.sorlfos_lfst_code, :sorlfos.sorlfos_majr_code,
	     :sorlfos.sorlfos_term_code,  :sorlfos.sorlfos_priority_no,
	     :sorlfos.sorlfos_conc_attach_rule,  :sorlfos.sorlfos_lfos_rule,
	     :sorlfos_dept_code, :sorlfos_majr_code_attach,
	     :sorlfos_cact_code, :sorlfos_csts_code,
	     :sorlfos_term_code_ctlg ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code; 
	:sovlfos_rowid := null;
	:sorlfos_current_ind := null; 
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
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 
go_block('sorlcur');
:system.message_level := '0'; 
:sorlcur_duplicate_ind := 'N'; 
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
		 * SORLCUR.DUPLICATE_CURRIC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DUPLICATE_CURRIC")
		public void sorlcur_DuplicateCurric()
		{
			
				// - this is called from the duplicate record icon
				// - it's different then key-duprec becuase it does not get the values from the 
				//   default table sorlcdf 
				// message('at start of duplicate icon'); 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				// - this is called from the duplicate record icon
				// - it's different then key-duprec becuase it does not get the values from the 
				//   default table sorlcdf 
				// message('at start of duplicate icon'); 
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False)|| isNull(getGlobal("CURRICULUM_QUERY"), "N").equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0213"), toStr("FORM"), toStr("Invalid option for query only.")));
					return ;
				}
				if ((getBlockStatus("SORLCUR").equals("CHANGED") || getBlockStatus("SORLFOS").equals("CHANGED")))
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0214"), toStr("FORM"), toStr("Commit curriculum data changes before inactivating and inserting new.")));
					return ;
				}
				if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
				{
					warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
				}
				else {
					if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
					{
						errorMessage(getFormModel().getSCurricula().getModuleInsertRestriction());
						return ;
					}
				}
				{
					NNumber lvSeqno= NNumber.getNull();
					NNumber lvNewSeqno= NNumber.getNull();
					NString lvSeverityOut = NString.getNull();
					UnknownTypes.GbCommonInternalRecordIdType lvRowid= null;
					SbFieldofstudy.FieldofstudyRecRow lvFieldofstudyRec= null;
					UnknownTypes.SbFieldofstudyFieldofstudyRef lvFieldofstudyCur= null;
					NNumber savePriorityNo= NNumber.getNull();
					NString saveActive = NString.getNull();
					NNumber saveLcur = NNumber.getNull();
					NString saveCurrent = NString.getNull();
					NNumber loopCnt = toNumber(1);
					NNumber countLfos = toNumber(0);
					String sqlsorlfosCntC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND ((:P_SAVE_CURRENT = 'Y' AND sovlfos_current_ind = 'Y') OR :P_SAVE_CURRENT = 'N') AND ((sovlfos_active_ind = 'Y') AND :P_SAVE_ACTIVE = 'Y' OR (:P_SAVE_ACTIVE = 'N')) ";
					DataCursor sorlfosCntC = new DataCursor(sqlsorlfosCntC);
					String sqlsorlfosC = "SELECT sorlfos_lfst_code, sorlfos_majr_code, sorlfos_term_code, sorlfos_priority_no, sorlfos_conc_attach_rule, sorlfos_lfos_rule, sorlfos_dept_code, sorlfos_majr_code_attach, sorlfos_cact_code, sorlfos_csts_code, sorlfos_term_code_ctlg " +
	" FROM sobcact, sorlfos " +
	" WHERE sorlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sorlfos_lcur_seqno = :P_SAVE_LCUR AND sobcact_cact_code = sorlfos_cact_code AND ((sobcact_active_ind = 'Y') AND :P_SAVE_ACTIVE = 'Y' OR (:P_SAVE_ACTIVE = 'N')) AND sorlfos_seqno = (SELECT max(m.sorlfos_seqno) " +
		" FROM sorlfos m " +
		" WHERE sorlfos.sorlfos_pidm = m.sorlfos_pidm AND sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno AND sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code AND sorlfos.sorlfos_priority_no = m.sorlfos_priority_no ) " +
	" ORDER BY decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sorlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					NNumber alertButton= NNumber.getNull();
					NNumber lvGappSeqno = NNumber.getNull();
					try
					{
						savePriorityNo = sorlcurElement.getSorlcurPriorityNo();
						sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
						// 	message('save priority: ' || save_priority_no); 
						if ( sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurRolledSeqno().isNull() && SbGradapp.fIsactive(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno()).equals("Y") )
							{
								alertButton = toNumber(showAlert("CURRICULUM_COPY_GAPP_ALERT"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
									lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
								}
								else if ( alertButton.equals(MessageServices.BUTTON2) ) {
									lvGappSeqno = toNumber(null);
									// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
									SbGradapp.pUpdate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno(), toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
								}
								else {
									savePriorityNo = toNumber(null);
								}
							}
							else {
								lvGappSeqno = toNumber(null);
							}
						}
						else if ( !sorlcurElement.getSorlcurGappSeqno().isNull() && sorlcurElement.getSorlcurLmodCode().equals(SbCurriculumStr.fOutcome()) ) {
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							if ( Soklcur.fRolledAwarded(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()).notEquals("Y") )
							{
								lvGappSeqno = sorlcurElement.getSorlcurGappSeqno();
							}
							else {
								lvGappSeqno = toNumber(null);
							}
						}
						//  save the priority no 
						getFormModel().getSCurricula().setSaveAdmitCode(sorlcurElement.getSorlcurAdmtCode());
						getFormModel().getSCurricula().setSaveAdmitTerm(sorlcurElement.getSorlcurTermCodeAdmit());
						getFormModel().getSCurricula().setSaveMatricTerm(sorlcurElement.getSorlcurTermCodeMatric());
						getFormModel().getSCurricula().setSaveCatlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
						saveLcur = sorlcurElement.getSorlcurSeqno();
						saveCurrent = sorlcurElement.getSovlcurCurrentInd();
						saveActive = SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode());
						//Setting query parameters
						sorlfosCntC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						sorlfosCntC.addParameter("P_SAVE_LCUR", saveLcur);
						sorlfosCntC.addParameter("P_SAVE_CURRENT", saveCurrent);
						sorlfosCntC.addParameter("P_SAVE_ACTIVE", saveActive);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosCntC.
						sorlfosCntC.open();
						ResultSet sorlfosCntCResults = sorlfosCntC.fetchInto();
						if ( sorlfosCntCResults != null ) {
							countLfos = sorlfosCntCResults.getNumber(0);
						}
						sorlfosCntC.close();
						// - insert the new record 
						createRecord();
						getContainer().getGoqrpls().gCheckFailure();
						//  message('before dup, save prior: ' || save_priority_no); 
						// - copy 
						duplicateRecord();
						getContainer().getGoqrpls().gCheckFailure();
						getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord().add(1)));
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(1));
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
						sorlcurElement.setSorlcurRolledSeqno(toNumber(null));
						sorlcurElement.setLcurRolledKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurApplSeqno(toNumber(null));
						sorlcurElement.setSorlcurGappSeqno(lvGappSeqno);
						sorlcurElement.setSovlcurApplKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurCurrentInd(toStr(null));
						sorlcurElement.setSorlcurPriorityNo(savePriorityNo);
						//  RPE to not clear out status when dup record occurs 1-410eo
						// :sorlcur.sorlcur_cact_code := null; 
						sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
						sorlcurElement.setSorlcurActivityDate(toDate(null));
						sorlcurElement.setSorlcurUserId(toStr(null));
						sorlcurElement.setSovlcurRowid(toStr(null));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						// - count number of sorlfos there are to copy 
						if ( countLfos.greater(0) )
						{
							//Setting query parameters
							sorlfosC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
							sorlfosC.addParameter("P_SAVE_LCUR", saveLcur);
							sorlfosC.addParameter("P_SAVE_ACTIVE", saveActive);
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
									sorlfosElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
									sorlfosElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
									sorlfosElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
									sorlfosElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
									sorlfosElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
									sorlfosElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
									sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(6));
									sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(7));
									sorlfosElement.setSorlfosCactCode(sorlfosCResults.getStr(8));
									sorlfosElement.setSorlfosCstsCode(sorlfosCResults.getStr(9));
									sorlfosElement.setSorlfosTermCodeCtlg(sorlfosCResults.getStr(10));
								}
								if ( sorlfosC.notFound() ) 
									break;
								sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
								sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
								sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
								sorlfosElement.setSovlfosRowid(toStr(null));
								sorlfosElement.setSorlfosCurrentInd(toStr(null));
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
							}
							sorlfosC.close();
							firstRecord();
						}
						goBlock(toStr("sorlcur"));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.CALC_NEW_PRIORITY
		 	-- find max priority so we can set the new records priority 
declare 
 initial_priority  sorlcur.sorlcur_priority_no%type := 0;
 lcur_seqno sorlcur.sorlcur_seqno%type := 0; 
CURSOR group_priority_curr_c IS
   SELECT sotlcur_priority_no, sotlcur_seqno  
    FROM sotlcur 
    WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y'
    and sotlcur_key_seqno = :s$_curricula.module_key_seqno
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
        and m.sotlcur_key_seqno = sotlcur.sotlcur_key_seqno
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
 fetch group_priority_curr_c into initial_priority, lcur_seqno;
 if group_priority_curr_c%notfound then 
 	 initial_priority := 0;
 end if;  
 close group_priority_curr_c;
 if initial_priority = 0 then
	  initial_priority := :global.sobctrl_priority_no;
 else

	  initial_priority := initial_priority + :global.sobctrl_priority_incr;
 		 	
 end if;
 :sorlcur.sorlcur_priority_no := initial_priority;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.CALC_NEW_PRIORITY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALC_NEW_PRIORITY")
		public void sorlcur_CalcNewPriority()
		{
			
				//  find max priority so we can set the new records priority 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber initialPriority = toNumber(0);
					NNumber lcurSeqno = toNumber(0);
					String sqlgroupPriorityCurrC = "SELECT sotlcur_priority_no, sotlcur_seqno " +
	" FROM sotlcur " +
	" WHERE sb_learnercurricstatus.f_is_active(sotlcur_cact_code) = 'Y' AND sotlcur_key_seqno = :S___CURRICULA_MODULE_KEY_SEQNO AND ((sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (sotlcur_lmod_code = sb_curriculum_str.f_learner AND sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (sotlcur_lmod_code = sb_curriculum_str.f_outcome)) AND sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sotlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND sotlcur_seqno = (SELECT max(m.sotlcur_seqno) " +
		" FROM sotlcur m " +
		" WHERE m.sotlcur_priority_no = sotlcur.sotlcur_priority_no AND m.sotlcur_key_seqno = sotlcur.sotlcur_key_seqno AND m.sotlcur_lmod_code = sotlcur.sotlcur_lmod_code AND m.sotlcur_pidm = :S___CURRICULA_MODULE_PIDM AND ((m.sotlcur_term_code = :S___CURRICULA_MODULE_TERM_CODE AND (m.sotlcur_lmod_code) IN (sb_curriculum_str.f_recruit, sb_curriculum_str.f_admissions)) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_learner AND m.sotlcur_term_code < :S___CURRICULA_MODULE_END_TERM) OR (m.sotlcur_lmod_code = sb_curriculum_str.f_outcome)) ) " +
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
						lcurSeqno = groupPriorityCurrCResults.getNumber(1);
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
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.CREATE_STUDY_PATH
		 :save_admit_code := :SORLCUR.SORLCUR_ADMT_CODE;
:save_admit_term := :SORLCUR.SORLCUR_TERM_CODE_ADMIT; 
:save_matric_term := :SORLCUR.SORLCUR_TERM_CODE_MATRIC;
:save_catlg_term  := :SORLCUR.SORLCUR_TERM_CODE_CTLG; 

--- create study path for unassigned lcur  
execute_trigger('query_only');
g$_check_failure;

if :system.form_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0215','FORM','Commit changes on form.'));
	raise form_trigger_failure;
end if; 

DECLARE 
	err_msg      varchar2(4000);
	
  
  sp_exception        EXCEPTION;
  sp_rowid            varchar2(30);
  alert_button          number;
  
  lv_study_path       sgrstsp.sgrstsp_key_seqno%type; 
  
  -- for the non destructive update 
  lv_seqno                sorlcur.sorlcur_seqno%type; 
	lv_new_seqno            sorlcur.sorlcur_seqno%type; 
	lv_severity_out         varchar2(1) := NULL;
	lv_rowid                gb_common.internal_record_id_type; 
 	lv_fieldofstudy_rec     sb_fieldofstudy.fieldofstudy_rec;
  lv_fieldofstudy_cur     sb_fieldofstudy.fieldofstudy_ref;
  
  save_priority_no        sorlcur.sorlcur_priority_no%type := :sorlcur.sorlcur_priority_no; 

	save_lcur  sorlcur.sorlcur_seqno%TYPE := null;
	save_current  varchar2(1) := NULL; 
	save_roll        sorlcur.sorlcur_rolled_seqno%type := null; 
	loop_cnt    number := 1; 
	count_lfos  number := 0; 
	CURSOR sorlfos_cnt_c IS
	  select nvl(count(*),0)
	  from sovlfos
	  where sovlfos_pidm = :s$_curricula.module_pidm
	  and sovlfos_lcur_seqno = save_lcur 
	  and ( ( save_current = 'Y' and sovlfos_current_ind = 'Y')
	     or save_current = 'N')
	  and sovlfos_active_ind = 'Y';
	  
	CURSOR sorlfos_c IS
	  select sorlfos_lfst_code, sorlfos_majr_code,
	     sorlfos_term_code,  sorlfos_priority_no,
	     sorlfos_conc_attach_rule,  sorlfos_lfos_rule ,
	     sorlfos_dept_code, sorlfos_majr_code_attach,
	     sorlfos_cact_code, sorlfos_csts_code,
	     sorlfos_term_code_ctlg 
	  from sobcact, sorlfos
	  where sorlfos_pidm = :s$_curricula.module_pidm
	  and sorlfos_lcur_seqno = save_lcur 
	  and sobcact_cact_code = sorlfos_cact_code
	  and sobcact_active_ind = 'Y' 
	  and sorlfos_seqno = ( select max(m.sorlfos_seqno)
	       from sorlfos m
	       where sorlfos.sorlfos_pidm = m.sorlfos_pidm
	       and sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno
	       and sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code
	       and sorlfos.sorlfos_priority_no = m.sorlfos_priority_no)
	  order by decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', 
	     sb_fieldofstudy_str.f_minor, '3',
	     sb_fieldofstudy_str.f_concentration, '3', 4),
	     sorlfos_priority_no;
	     
 	    
  BEGIN 
  	
  
	if :sorlcur.sorlcur_lmod_code <> sb_curriculum_str.f_learner then 
	  err_msg :=  G$_NLS.Get('SOQOLIB-0216', 'FORM','*ERROR* This functionality is available only on the learner curriculum.') ;
		raise sp_exception;
	end if; 
  if nvl(:sorlcur.sovlcur_current_ind,'N') <> 'Y'  then 
	  err_msg :=   G$_NLS.Get('SOQOLIB-0217', 'FORM','*ERROR* This functionality is available only on current learner curriculum.') ;
			raise sp_exception;
  end if;	
  if sb_learnercurricstatus.f_is_active(:sorlcur.sorlcur_cact_code) <> 'Y'  then 
	  err_msg :=  G$_NLS.Get('SOQOLIB-0218', 'FORM','*ERROR* This functionality is available only on current learner curriculum.') ;
		raise sp_exception;
  end if;	
  if :sorlcur.sorlcur_key_seqno <> 99  then 
	  err_msg :=  G$_NLS.Get('SOQOLIB-0219', 'FORM','*ERROR* This functionality is available only on unassigned learner curriculum.') ;
		raise sp_exception;
  end if;
  if :sorlcur.sorlcur_gapp_seqno is not null   then 
	  err_msg :=   G$_NLS.Get('SOQOLIB-0220', 'FORM','*ERROR* A graduation application exists for the learner, this functionality is not available.') ;
	  raise sp_exception;
  end if;
  if :sorlcur.sorlcur_rolled_seqno is not null   then 
	  err_msg :=   G$_NLS.Get('SOQOLIB-0221', 'FORM','*ERROR* The learner has been rolled, this functionality is not available.') ;
	  raise sp_exception;
  end if;
  if :s$_curricula.module_insert_warning is not null then 
      	message(:s$_curricula.module_insert_warning);
   else 
	 if :s$_curricula.module_insert_restriction is not null then 
	    err_msg := :s$_curricula.module_insert_restriction ;
	    raise sp_exception;
	 end if; 
  end if;
 
   -- show alert, creating the study path cannot be undone 
  alert_button := show_alert('COMMIT_STOP_STUDY_PATH_ALERT');
  if alert_button = ALERT_BUTTON1 then
       null;
  else 
  	message( G$_NLS.Get('SOQOLIB-0222', 'FORM','Creation of the study path was cancelled.') );
  	return;
		raise form_trigger_failure;
  end if;
  
       
   sb_studypath.p_create
                 (p_pidm                     => :sorlcur.sorlcur_pidm ,
                  p_term_code_eff            => :s$_curricula.module_term_code,
                  p_key_seqno                => lv_study_path,
                  p_stsp_code                => 'AS' ,
                  p_data_origin              => :GLOBAL.DATA_ORIGIN,
                  p_user_id                  =>  gb_common.f_sct_user,
                 p_rowid_out                 =>  sp_rowid ) ;

      
  --- non destructive update to the lcur so it now has the study path 
  
    
 
   	save_lcur := :sorlcur.sorlcur_seqno;
    save_current := :sorlcur.sovlcur_current_ind;
    save_priority_no     := :sorlcur.sorlcur_priority_no;
    save_roll := null; 
 
  	OPEN sorlfos_cnt_c;
    fetch sorlfos_cnt_c into count_lfos;
    close sorlfos_cnt_c;
	  lv_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
    :lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind;
    SB_curriculum.P_CREATE(
     p_PIDM                   =>:SORLCUR.SORLCUR_PIDM,
     p_SEQNO                  => lv_seqno,
     p_LMOD_CODE              => :SORLCUR.SORLCUR_LMOD_CODE,
     p_TERM_CODE              => :s$_curricula.module_term_code,
     p_KEY_SEQNO              => :SORLCUR.SORLCUR_KEY_SEQNO, 
     p_PRIORITY_NO            =>:SORLCUR.SORLCUR_PRIORITY_NO,
     p_ROLL_IND               =>:SORLCUR.SORLCUR_ROLL_IND,
     p_CACT_CODE              =>soklcur.f_default_cact('INACTIVE'),
     p_USER_ID                => gb_common.f_sct_user,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_LEVL_CODE              =>:SORLCUR.SORLCUR_LEVL_CODE,
     p_COLL_CODE              =>:SORLCUR.SORLCUR_COLL_CODE,
     p_DEGC_CODE              =>:SORLCUR.SORLCUR_DEGC_CODE,
     p_TERM_CODE_CTLG         =>:SORLCUR.SORLCUR_TERM_CODE_CTLG,
     p_TERM_CODE_END          =>:SORLCUR.SORLCUR_TERM_CODE_END,
     p_TERM_CODE_MATRIC       =>:SORLCUR.SORLCUR_TERM_CODE_MATRIC,
     p_TERM_CODE_ADMIT        =>:SORLCUR.SORLCUR_TERM_CODE_ADMIT,
     p_ADMT_CODE              =>:SORLCUR.SORLCUR_ADMT_CODE,
     p_CAMP_CODE              =>:SORLCUR.SORLCUR_CAMP_CODE,
     p_PROGRAM                =>:SORLCUR.SORLCUR_PROGRAM,
     p_START_DATE             =>:SORLCUR.SORLCUR_START_DATE,
     p_END_DATE               =>:SORLCUR.SORLCUR_END_DATE,
     p_CURR_RULE              =>:SORLCUR.SORLCUR_CURR_RULE,
     p_ROLLED_SEQNO           => NULL,
     p_ROWID_OUT              => lv_rowid,
     p_seqno_out              => lv_new_seqno, 
     p_curr_error_out         => :sorlcur.curr_error,
     p_override_severity      => 'N',
     p_severity_out           => :sorlcur.severity_out, 
     p_site_code              => :sorlcur.sorlcur_site_code,
     p_rate_code              => :sorlcur.sorlcur_rate_code,
     p_acyr_code              => :sorlcur.sorlcur_acyr_code,
     p_styp_code              => :sorlcur.sorlcur_styp_code,
     p_leav_code              => :sorlcur.sorlcur_leav_code,
     p_leav_from_date         => :sorlcur.sorlcur_leav_from_date,
     p_leav_to_date           => :sorlcur.sorlcur_leav_to_date,
     p_exp_grad_date          => :sorlcur.sorlcur_exp_grad_date,
     p_term_code_grad         => :sorlcur.sorlcur_term_code_grad,
     p_appl_key_seqno         => NULL,
     p_appl_seqno             => NULL ,
     p_gapp_seqno             => NULL,
     p_user_id_update         => gb_common.f_sct_user);
     
     soklcur.p_create_sotlcur(
	     p_pidm =>:s$_curricula.module_pidm, 
	     p_seqno => lv_seqno,
	     p_cact_code => soklcur.f_default_cact('INACTIVE'),
	     p_priority_no => :sorlcur.sorlcur_priority_no,
	     p_term_code => :sorlcur.sorlcur_term_code, 
	     p_key_seqno => :sorlcur.sorlcur_key_seqno,
	     p_lmod_code => :s$_curricula.module_code); 
 
     lv_fieldofstudy_cur := sb_fieldofstudy.f_query_current
         (p_pidm => :sorlcur.sorlcur_pidm, 
          p_lcur_seqno => :sorlcur.sorlcur_seqno);  
      LOOP 
        FETCH lv_fieldofstudy_cur INTO lv_fieldofstudy_rec;
        EXIT WHEN lv_fieldofstudy_cur%NOTFOUND  ;
    
         SB_FIELDOFSTUDY.P_CREATE(P_PIDM   => :SORLCUR.SORLCUR_PIDM,
               P_LCUR_SEQNO     => lv_seqno,
               P_SEQNO          => NULL,
               P_LFST_CODE      => lv_fieldofstudy_rec.r_lfst_code,
               P_TERM_CODE      => :s$_curricula.module_term_code,
               P_PRIORITY_NO    => lv_fieldofstudy_rec.r_priority_no,
               P_CSTS_CODE      => soklcur.f_event_status('STUDYPATH'),
               P_CACT_CODE      => soklcur.f_default_cact('INACTIVE'),
               p_USER_ID        => gb_common.f_sct_user,
               p_DATA_ORIGIN    =>:GLOBAL.DATA_ORIGIN,
               P_MAJR_CODE      => lv_fieldofstudy_rec.r_majr_code,
               P_DEPT_CODE      => lv_fieldofstudy_rec.r_dept_code,
               P_TERM_CODE_CTLG => lv_fieldofstudy_rec.r_term_code_ctlg,
               P_LFOS_RULE      => lv_fieldofstudy_rec.r_lfos_rule,
               P_CONC_ATTACH_RULE  => lv_fieldofstudy_rec.r_conc_attach_rule,
               p_rolled_seqno   => NULL,
               p_term_code_end   => lv_fieldofstudy_rec.r_term_code_end,
               p_start_date     => lv_fieldofstudy_rec.r_start_date,
               p_end_date       => lv_fieldofstudy_rec.r_end_date,
               p_tmst_code      => lv_fieldofstudy_rec.r_tmst_code,
               p_majr_code_attach => lv_fieldofstudy_rec.r_majr_code_attach, 
               P_ROWID_OUT      => lv_rowid,
               P_CURR_ERROR_OUT     => :sorlcur.curr_error,
               P_override_severity => 'N',
               p_severity_out => :sorlcur.severity_out ,
               p_lfos_seqno_out => lv_new_seqno,
               p_user_id_update   => gb_common.f_sct_user); 
               
               soklcur.p_create_sotlfos(p_pidm => :s$_curricula.module_pidm,
                    p_lcur_seqno => lv_seqno,
                    p_seqno => lv_new_seqno,
                    p_cact_code => soklcur.f_default_cact('INACTIVE'),
                    p_lfst_code => :sorlfos.sorlfos_lfst_code,
                    p_priority_no => :sorlfos.sorlfos_priority_no ,
                    p_majr_code => :sorlfos.sorlfos_majr_code,
                    p_dept_code => :sorlfos.sorlfos_dept_code);
          
       END LOOP;
       CLOSE lv_fieldofstudy_cur;
   

--- insert the new record 
create_record;
g$_check_failure; 
--- copy 
	
duplicate_record;
g$_check_failure; 
:sorlcur.sorlcur_key_seqno := lv_study_path; 
:dup_create_ind := 'N';
:lcur_rec_num := :system.cursor_record + 1; 
:s$_curricula_traditional.lcur_rec_cnt := :s$_curricula_traditional.lcur_rec_cnt + 2; 
:lcur_sobctrl_curr_rule_ind := :lcur_original_curr_ind; 
:sorlcur_seqno := sb_curriculum_rules.f_seqno(:s$_curricula.module_pidm);
:sorlfos_seqno_cnt := sb_fieldofstudy_rules.f_seqno(:sorlcur_pidm,
    :sorlcur_seqno);
g$_check_failure; 

:sorlcur.sorlcur_rolled_seqno := null;
:sorlcur.LCUR_ROLLED_KEY_SEQNO := null;  
:sorlcur.sovlcur_appl_seqno := null;
:sorlcur.sorlcur_gapp_seqno := null;
:sorlcur.sovlcur_appl_key_seqno := null; 
:sorlcur.sovlcur_current_ind := null;
:sorlcur.sorlcur_priority_no := save_priority_no; 
:deactivate_ind := 'I';   -- mark it as insert to prevent delete, which will not cover the dup'd recs
-- RPE to not clear out status when dup record occurs 1-410eo
--:sorlcur.sorlcur_cact_code := null; 
:sorlcur_duplicate_ind := 'Y';
:sorlcur_activity_date := null;
:sorlcur_user_id := null; 
:sovlcur_rowid := NULL; 
:sorlcur_term_code := :s$_curricula.module_term_code;
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
 
:system.message_level := '5'; 
next_block;
clear_block;
--- count number of sorlfos there are to copy 
if count_lfos > 0 then 
	

OPEN sorlfos_c;
LOOP
	if loop_cnt <> 1 and loop_cnt <= count_lfos then
		next_record;
	end if;
	loop_cnt := loop_cnt + 1; 
	fetch sorlfos_c into 
       :sorlfos.sorlfos_lfst_code, :sorlfos.sorlfos_majr_code,
	     :sorlfos.sorlfos_term_code,  :sorlfos.sorlfos_priority_no,
	     :sorlfos.sorlfos_conc_attach_rule,  :sorlfos.sorlfos_lfos_rule,
	     :sorlfos_dept_code, :sorlfos_majr_code_attach,
	     :sorlfos_cact_code, :sorlfos_csts_code,
	     :sorlfos_term_code_ctlg ;
	EXIT when sorlfos_c%NOTFOUND;
	:sorlfos_seqno_cnt :=  :sorlfos_seqno_cnt + 1;
  :sorlfos_seqno :=  :sorlfos_seqno_cnt; 
  :sorlfos_term_code := :s$_curricula.module_term_code; 
	:sovlfos_rowid := null;
	:sorlfos_current_ind := null; 
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
   
END LOOP;
CLOSE sorlfos_c; 
first_record;

end if; 

go_block('sorlcur');
:system.message_level := '5';   
commit_form; 
g$_check_failure; 
:system.message_level := '0';
  
:sorlcur_duplicate_ind := 'N'; 
execute_trigger('lcur_record_cnt');
g$_check_failure;

EXCEPTION
 WHEN SP_EXCEPTION THEN
   G$_DISPLAY_ERR_MSG(err_msg);
   RAISE FORM_TRIGGER_FAILURE;
 WHEN OTHERS THEN
   if sqlcode <> 0  then 
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE;
   end if; 
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.CREATE_STUDY_PATH
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CREATE_STUDY_PATH")
		public void sorlcur_CreateStudyPath()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				getFormModel().getSCurricula().setSaveAdmitCode(sorlcurElement.getSorlcurAdmtCode());
				getFormModel().getSCurricula().setSaveAdmitTerm(sorlcurElement.getSorlcurTermCodeAdmit());
				getFormModel().getSCurricula().setSaveMatricTerm(sorlcurElement.getSorlcurTermCodeMatric());
				getFormModel().getSCurricula().setSaveCatlgTerm(sorlcurElement.getSorlcurTermCodeCtlg());
				// - create study path for unassigned lcur  
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getTaskStatus().equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0215"), toStr("FORM"), toStr("Commit changes on form.")));
					throw new ApplicationException();
				}
				{
					NString errMsg= NString.getNull();
					NString spRowid= NString.getNull();
					NNumber alertButton= NNumber.getNull();
					NNumber lvStudyPath= NNumber.getNull();
					//  for the non destructive update 
					NNumber lvSeqno= NNumber.getNull();
					NNumber lvNewSeqno= NNumber.getNull();
					NString lvSeverityOut = NString.getNull();
					UnknownTypes.GbCommonInternalRecordIdType lvRowid= null;
					SbFieldofstudy.FieldofstudyRecRow lvFieldofstudyRec= null;
					UnknownTypes.SbFieldofstudyFieldofstudyRef lvFieldofstudyCur= null;
					NNumber savePriorityNo = sorlcurElement.getSorlcurPriorityNo();
					NNumber saveLcur = NNumber.getNull();
					NString saveCurrent = NString.getNull();
					NNumber saveRoll = NNumber.getNull();
					NNumber loopCnt = toNumber(1);
					NNumber countLfos = toNumber(0);
					String sqlsorlfosCntC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos " +
	" WHERE sovlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sovlfos_lcur_seqno = :P_SAVE_LCUR AND ((:P_SAVE_CURRENT = 'Y' AND sovlfos_current_ind = 'Y') OR :P_SAVE_CURRENT = 'N') AND sovlfos_active_ind = 'Y' ";
					DataCursor sorlfosCntC = new DataCursor(sqlsorlfosCntC);
					String sqlsorlfosC = "SELECT sorlfos_lfst_code, sorlfos_majr_code, sorlfos_term_code, sorlfos_priority_no, sorlfos_conc_attach_rule, sorlfos_lfos_rule, sorlfos_dept_code, sorlfos_majr_code_attach, sorlfos_cact_code, sorlfos_csts_code, sorlfos_term_code_ctlg " +
	" FROM sobcact, sorlfos " +
	" WHERE sorlfos_pidm = :S___CURRICULA_MODULE_PIDM AND sorlfos_lcur_seqno = :P_SAVE_LCUR AND sobcact_cact_code = sorlfos_cact_code AND sobcact_active_ind = 'Y' AND sorlfos_seqno = (SELECT max(m.sorlfos_seqno) " +
		" FROM sorlfos m " +
		" WHERE sorlfos.sorlfos_pidm = m.sorlfos_pidm AND sorlfos.sorlfos_lcur_seqno = m.sorlfos_lcur_seqno AND sorlfos.sorlfos_lfst_code = m.sorlfos_lfst_code AND sorlfos.sorlfos_priority_no = m.sorlfos_priority_no ) " +
	" ORDER BY decode(sorlfos_lfst_code, sb_fieldofstudy_str.f_major, '1', sb_fieldofstudy_str.f_minor, '3', sb_fieldofstudy_str.f_concentration, '3', 4), sorlfos_priority_no";
					DataCursor sorlfosC = new DataCursor(sqlsorlfosC);
					try
					{
						if ( sorlcurElement.getSorlcurLmodCode().notEquals(SbCurriculumStr.fLearner()) )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0216"), toStr("FORM"), toStr("*ERROR* This functionality is available only on the learner curriculum."));
							throw new SpException();
						}
						if ( isNull(sorlcurElement.getSovlcurCurrentInd(), "N").notEquals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0217"), toStr("FORM"), toStr("*ERROR* This functionality is available only on current learner curriculum."));
							throw new SpException();
						}
						if ( SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).notEquals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0218"), toStr("FORM"), toStr("*ERROR* This functionality is available only on current learner curriculum."));
							throw new SpException();
						}
						if ( sorlcurElement.getSorlcurKeySeqno().notEquals(99) )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0219"), toStr("FORM"), toStr("*ERROR* This functionality is available only on unassigned learner curriculum."));
							throw new SpException();
						}
						if ( !sorlcurElement.getSorlcurGappSeqno().isNull() )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0220"), toStr("FORM"), toStr("*ERROR* A graduation application exists for the learner, this functionality is not available."));
							throw new SpException();
						}
						if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0221"), toStr("FORM"), toStr("*ERROR* The learner has been rolled, this functionality is not available."));
							throw new SpException();
						}
						if ( !getFormModel().getSCurricula().getModuleInsertWarning().isNull() )
						{
							warningMessage(getFormModel().getSCurricula().getModuleInsertWarning());
						}
						else {
							if ( !getFormModel().getSCurricula().getModuleInsertRestriction().isNull() )
							{
								errMsg = getFormModel().getSCurricula().getModuleInsertRestriction();
								throw new SpException();
							}
						}
						//  show alert, creating the study path cannot be undone 
						alertButton = toNumber(showAlert("COMMIT_STOP_STUDY_PATH_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
						else {
							warningMessage(GNls.Fget(toStr("SOQOLIB-0222"), toStr("FORM"), toStr("Creation of the study path was cancelled.")));
							return ;
							throw new ApplicationException();
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NNumber> p_key_seqno_ref = new Ref<NNumber>(lvStudyPath);
						SbStudypath.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/getFormModel().getSCurricula().getModuleTermCode(), p_key_seqno_ref, /*pStspCode=>*/"AS", /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/GbCommon.fSctUser(), /*pRowidOut=>*/spRowid);
						lvStudyPath = p_key_seqno_ref.val;
						// - non destructive update to the lcur so it now has the study path 
						saveLcur = sorlcurElement.getSorlcurSeqno();
						saveCurrent = sorlcurElement.getSovlcurCurrentInd();
						savePriorityNo = sorlcurElement.getSorlcurPriorityNo();
						saveRoll = toNumber(null);
						//Setting query parameters
						sorlfosCntC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						sorlfosCntC.addParameter("P_SAVE_LCUR", saveLcur);
						sorlfosCntC.addParameter("P_SAVE_CURRENT", saveCurrent);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sorlfosCntC.
						sorlfosCntC.open();
						ResultSet sorlfosCntCResults = sorlfosCntC.fetchInto();
						if ( sorlfosCntCResults != null ) {
							countLfos = sorlfosCntCResults.getNumber(0);
						}
						sorlfosCntC.close();
						lvSeqno = SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm());
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NString> p_rowid_out_ref = new Ref<NString>();
						Ref<NNumber> p_seqno_out_ref = new Ref<NNumber>(sorlcurElement.getSorlcurTermCodeGrad());
						Ref<NNumber> p_curr_error_out_ref = new Ref<NNumber>(null);
						Ref<NString> p_severity_out_ref = new Ref<NString>(null);
						SbCurriculum.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/lvSeqno, /*pLmodCode=>*/sorlcurElement.getSorlcurLmodCode(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno(), /*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo(), /*pRollInd=>*/sorlcurElement.getSorlcurRollInd(), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pLevlCode=>*/sorlcurElement.getSorlcurLevlCode(), /*pCollCode=>*/sorlcurElement.getSorlcurCollCode(), /*pDegcCode=>*/sorlcurElement.getSorlcurDegcCode(), /*pTermCodeCtlg=>*/sorlcurElement.getSorlcurTermCodeCtlg(), /*pTermCodeEnd=>*/sorlcurElement.getSorlcurTermCodeEnd(), /*pTermCodeMatric=>*/sorlcurElement.getSorlcurTermCodeMatric(), /*pTermCodeAdmit=>*/sorlcurElement.getSorlcurTermCodeAdmit(), /*pAdmtCode=>*/sorlcurElement.getSorlcurAdmtCode(), /*pCampCode=>*/sorlcurElement.getSorlcurCampCode(), /*pProgram=>*/sorlcurElement.getSorlcurProgram(), /*pStartDate=>*/sorlcurElement.getSorlcurStartDate(), /*pEndDate=>*/sorlcurElement.getSorlcurEndDate(), /*pCurrRule=>*/sorlcurElement.getSorlcurCurrRule(), toNumber(/*pRolledSeqno=>*/null), /*pRowidOut=>*/lvRowid, toStr(/*pSeqnoOut=>*/lvNewSeqno), toDate(/*pCurrErrorOut=>*/sorlcurElement.getCurrError()), /*pOverrideSeverity=>*/"N", toDate(/*pSeverityOut=>*/sorlcurElement.getSeverityOut()), toDate(/*pSiteCode=>*/sorlcurElement.getSorlcurSiteCode()), /*pRateCode=>*/sorlcurElement.getSorlcurRateCode(), /*pAcyrCode=>*/sorlcurElement.getSorlcurAcyrCode(), /*pStypCode=>*/sorlcurElement.getSorlcurStypCode(), /*pLeavCode=>*/sorlcurElement.getSorlcurLeavCode(), toNumber(/*pLeavFromDate=>*/sorlcurElement.getSorlcurLeavFromDate()), toNumber(/*pLeavToDate=>*/sorlcurElement.getSorlcurLeavToDate()), p_rowid_out_ref, p_seqno_out_ref, p_curr_error_out_ref, p_severity_out_ref, toStr(/*pGappSeqno=>*/null), toNumber(/*pUserIdUpdate=>*/GbCommon.fSctUser()));
						sorlcurElement.setSorlcurExpGradDate(p_rowid_out_ref.val);
						sorlcurElement.setSorlcurTermCodeGrad(p_seqno_out_ref.val);
						null = p_curr_error_out_ref.val;
						null = p_severity_out_ref.val;
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/lvSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), toStr(/*pPriorityNo=>*/sorlcurElement.getSorlcurPriorityNo()), toNumber(/*pTermCode=>*/sorlcurElement.getSorlcurTermCode()), toStr(/*pKeySeqno=>*/sorlcurElement.getSorlcurKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						lvFieldofstudyCur = SbFieldofstudy.fQueryCurrent(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno());
						while (true) {
							ResultSet lvFieldofstudyCurResults = lvFieldofstudyCur.fetchInto();
							if ( lvFieldofstudyCurResults != null ) {
								lvFieldofstudyRec =  new SbFieldofstudy.FieldofstudyRecRow(lvFieldofstudyCurResults);
							}
							if ( lvFieldofstudyCur.notFound() ) 
								break;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							p_rowid_out_ref = new Ref<NString>(sorlcurElement.getCurrError());
							p_curr_error_out_ref = new Ref<NNumber>("N");
							p_severity_out_ref = new Ref<NString>(sorlcurElement.getSeverityOut());
							Ref<NNumber> p_lfos_seqno_out_ref = new Ref<NNumber>(lvNewSeqno);
							SbFieldofstudy.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pLcurSeqno=>*/lvSeqno, toNumber(/*pSeqno=>*/null), /*pLfstCode=>*/lvFieldofstudyRec.RLfstCode, /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pPriorityNo=>*/lvFieldofstudyRec.RPriorityNo, /*pCstsCode=>*/Soklcur.fEventStatus(toStr("STUDYPATH")), /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pMajrCode=>*/lvFieldofstudyRec.RMajrCode, /*pDeptCode=>*/lvFieldofstudyRec.RDeptCode, /*pTermCodeCtlg=>*/lvFieldofstudyRec.RTermCodeCtlg, /*pLfosRule=>*/lvFieldofstudyRec.RLfosRule, /*pConcAttachRule=>*/lvFieldofstudyRec.RConcAttachRule, toNumber(/*pRolledSeqno=>*/null), /*pTermCodeEnd=>*/lvFieldofstudyRec.RTermCodeEnd, /*pStartDate=>*/lvFieldofstudyRec.RStartDate, /*pEndDate=>*/lvFieldofstudyRec.REndDate, /*pTmstCode=>*/lvFieldofstudyRec.RTmstCode, /*pMajrCodeAttach=>*/lvFieldofstudyRec.RMajrCodeAttach, /*pRowidOut=>*/lvRowid, p_rowid_out_ref, p_curr_error_out_ref, p_severity_out_ref, p_lfos_seqno_out_ref, /*pUserIdUpdate=>*/GbCommon.fSctUser());
							sorlcurElement.setCurrError(p_rowid_out_ref.val);
							"N" = p_curr_error_out_ref.val;
							sorlcurElement.setSeverityOut(p_severity_out_ref.val);
							lvNewSeqno = p_lfos_seqno_out_ref.val;
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/lvSeqno, /*pSeqno=>*/lvNewSeqno, /*pCactCode=>*/Soklcur.fDefaultCact(toStr("INACTIVE")), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
						}
						lvFieldofstudyCur.close();
						// - insert the new record 
						createRecord();
						getContainer().getGoqrpls().gCheckFailure();
						// - copy 
						duplicateRecord();
						getContainer().getGoqrpls().gCheckFailure();
						sorlcurElement.setSorlcurKeySeqno(lvStudyPath);
						getFormModel().getSCurricula().setDupCreateInd(toStr("N"));
						getFormModel().getSCurriculaTraditional().setLcurRecNum(toInt(getCursorRecord().add(1)));
						getFormModel().getSCurriculaTraditional().setLcurRecCnt(getFormModel().getSCurriculaTraditional().getLcurRecCnt().add(2));
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(getFormModel().getSCurricula().getLcurOriginalCurrInd());
						sorlcurElement.setSorlcurSeqno(SbCurriculumRules.fSeqno(getFormModel().getSCurricula().getModulePidm()));
						sorlcurElement.setSorlfosSeqnoCnt(SbFieldofstudyRules.fSeqno(sorlcurElement.getSorlcurPidm(), sorlcurElement.getSorlcurSeqno()));
						getContainer().getGoqrpls().gCheckFailure();
						sorlcurElement.setSorlcurRolledSeqno(toNumber(null));
						sorlcurElement.setLcurRolledKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurApplSeqno(toNumber(null));
						sorlcurElement.setSorlcurGappSeqno(toNumber(null));
						sorlcurElement.setSovlcurApplKeySeqno(toNumber(null));
						sorlcurElement.setSovlcurCurrentInd(toStr(null));
						sorlcurElement.setSorlcurPriorityNo(savePriorityNo);
						sorlcurElement.setDeactivateInd(toStr("I"));
						//  mark it as insert to prevent delete, which will not cover the dup'd recs
						//  RPE to not clear out status when dup record occurs 1-410eo
						// :sorlcur.sorlcur_cact_code := null; 
						sorlcurElement.setSorlcurDuplicateInd(toStr("Y"));
						sorlcurElement.setSorlcurActivityDate(toDate(null));
						sorlcurElement.setSorlcurUserId(toStr(null));
						sorlcurElement.setSovlcurRowid(toStr(null));
						sorlcurElement.setSorlcurTermCode(getFormModel().getSCurricula().getModuleTermCode());
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pDeleteSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999));
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotlcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pCactCode=>*/isNull(sorlcurElement.getSorlcurCactCode(), getFormModel().getSCurricula().getDefaultCact()), /*pPriorityNo=>*/isNull(sorlcurElement.getSorlcurPriorityNo(), 1), toNumber(/*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode()), toStr(/*pKeySeqno=>*/getFormModel().getSCurricula().getModuleKeySeqno()), toNumber(/*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode()));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						nextBlock();
						clearBlock();
						// - count number of sorlfos there are to copy 
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
									sorlfosElement.setSorlfosLfstCode(sorlfosCResults.getStr(0));
									sorlfosElement.setSorlfosMajrCode(sorlfosCResults.getStr(1));
									sorlfosElement.setSorlfosTermCode(sorlfosCResults.getStr(2));
									sorlfosElement.setSorlfosPriorityNo(sorlfosCResults.getNumber(3));
									sorlfosElement.setSorlfosConcAttachRule(sorlfosCResults.getNumber(4));
									sorlfosElement.setSorlfosLfosRule(sorlfosCResults.getNumber(5));
									sorlfosElement.setSorlfosDeptCode(sorlfosCResults.getStr(6));
									sorlfosElement.setSorlfosMajrCodeAttach(sorlfosCResults.getStr(7));
									sorlfosElement.setSorlfosCactCode(sorlfosCResults.getStr(8));
									sorlfosElement.setSorlfosCstsCode(sorlfosCResults.getStr(9));
									sorlfosElement.setSorlfosTermCodeCtlg(sorlfosCResults.getStr(10));
								}
								if ( sorlfosC.notFound() ) 
									break;
								sorlcurElement.setSorlfosSeqnoCnt(sorlcurElement.getSorlfosSeqnoCnt().add(1));
								sorlfosElement.setSorlfosSeqno(sorlcurElement.getSorlfosSeqnoCnt());
								sorlfosElement.setSorlfosTermCode(getFormModel().getSCurricula().getModuleTermCode());
								sorlfosElement.setSovlfosRowid(toStr(null));
								sorlfosElement.setSorlfosCurrentInd(toStr(null));
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pDeleteSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pSeqno=>*/sorlfosElement.getSorlfosSeqno());
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								Soklcur.pCreateSotlfos(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pLcurSeqno=>*/isNull(sorlcurElement.getSorlcurSeqno(), 999), /*pSeqno=>*/isNull(sorlfosElement.getSorlfosSeqno(), 999), /*pCactCode=>*/sorlfosElement.getSorlfosCactCode(), /*pLfstCode=>*/sorlfosElement.getSorlfosLfstCode(), /*pPriorityNo=>*/sorlfosElement.getSorlfosPriorityNo(), /*pMajrCode=>*/sorlfosElement.getSorlfosMajrCode(), /*pDeptCode=>*/sorlfosElement.getSorlfosDeptCode());
							}
							sorlfosC.close();
							firstRecord();
						}
						goBlock(toStr("sorlcur"));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						commitTask();
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						sorlcurElement.setSorlcurDuplicateInd(toStr("N"));
						executeAction("lcur_record_cnt");
						getContainer().getGoqrpls().gCheckFailure();
					}
					catch(SpException e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errMsg);
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						if ( errorCode().notEquals(0) )
						{
							getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR.SET_ACTIVE_REG_IND
		 DECLARE
  min_term    stvterm.stvterm_code%type;
  max_term    stvterm.stvterm_code%type;
  min_s_term  stvterm.stvterm_code%type; 
  dummy_var   VARCHAR2(1);

  CURSOR min_term_c IS 
     SELECT MIN(sfbetrm_term_code)
     FROM   sfbetrm
     WHERE  sfbetrm_pidm = :sorlcur_pidm;
         
  CURSOR max_term_c IS 
     SELECT MAX(sfbetrm_term_code)
     FROM   sfbetrm
     WHERE  sfbetrm_pidm = :sorlcur_pidm;
      
  CURSOR min_sgbstdn_c IS
     SELECT MIN(sgbstdn_term_code_eff) 
     FROM   sgbstdn
     WHERE  sgbstdn_term_code_eff >= :sorlcur_term_code
     AND    sgbstdn_pidm = :sorlcur_pidm; 
         
BEGIN
   OPEN min_term_c ;
   OPEN max_term_c;
   OPEN min_sgbstdn_c; 
   FETCH min_sgbstdn_c INTO min_s_term; 
   IF min_sgbstdn_c%notfound THEN
   	 min_s_term := :sorlcur_term_code;
   END IF; 
   FETCH min_term_c INTO min_term;
   IF min_term_c%NOTFOUND THEN
   	  min_term := NULL;
   END IF;
   FETCH max_term_c INTO max_term;
   IF max_term_c%NOTFOUND THEN
   	  max_term := NULL;
   END IF;
   CLOSE min_term_c;
   CLOSE max_term_c;
   CLOSE min_sgbstdn_c; 
--  
   IF min_term IS NULL THEN  -- no registration exists 
   	 :active_reg_ind := 'N';
   ELSIf :sorlcur_term_code > max_term THEN -- future sgbstdn term 
   	 :active_reg_ind := 'N'; 
   ELSIF :sorlcur_term_code BETWEEN min_term AND max_term THEN -- in between reg terms 
     :active_reg_ind := 'Y'; 
   ELSIF :sorlcur_term_code <= min_s_term and ( min_s_term <=  min_term) THEN -- past terms 
     :active_reg_ind := 'N';
   ELSE 
 	   :active_reg_ind := 'Y'; 
   END IF;
--
EXCEPTION
   WHEN OTHERS THEN NULL;   	
END;

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.SET_ACTIVE_REG_IND
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_ACTIVE_REG_IND")
		public void sorlcur_SetActiveRegInd()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				{
					NString minTerm= NString.getNull();
					NString maxTerm= NString.getNull();
					NString minSTerm= NString.getNull();
					NString dummyVar= NString.getNull();
					String sqlminTermC = "SELECT MIN(sfbetrm_term_code) " +
	" FROM sfbetrm " +
	" WHERE sfbetrm_pidm = :SORLCUR_PIDM ";
					DataCursor minTermC = new DataCursor(sqlminTermC);
					String sqlmaxTermC = "SELECT MAX(sfbetrm_term_code) " +
	" FROM sfbetrm " +
	" WHERE sfbetrm_pidm = :SORLCUR_PIDM ";
					DataCursor maxTermC = new DataCursor(sqlmaxTermC);
					String sqlminSgbstdnC = "SELECT MIN(sgbstdn_term_code_eff) " +
	" FROM sgbstdn " +
	" WHERE sgbstdn_term_code_eff >= :SORLCUR_TERM_CODE AND sgbstdn_pidm = :SORLCUR_PIDM ";
					DataCursor minSgbstdnC = new DataCursor(sqlminSgbstdnC);
					try
					{
						//Setting query parameters
						minTermC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable minTermC.
						minTermC.open();
						//Setting query parameters
						maxTermC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxTermC.
						maxTermC.open();
						//Setting query parameters
						minSgbstdnC.addParameter("SORLCUR_TERM_CODE", sorlcurElement.getSorlcurTermCode());
						minSgbstdnC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable minSgbstdnC.
						minSgbstdnC.open();
						ResultSet minSgbstdnCResults = minSgbstdnC.fetchInto();
						if ( minSgbstdnCResults != null ) {
							minSTerm = minSgbstdnCResults.getStr(0);
						}
						if ( minSgbstdnC.notFound() )
						{
							minSTerm = sorlcurElement.getSorlcurTermCode();
						}
						ResultSet minTermCResults = minTermC.fetchInto();
						if ( minTermCResults != null ) {
							minTerm = minTermCResults.getStr(0);
						}
						if ( minTermC.notFound() )
						{
							minTerm = toStr(null);
						}
						ResultSet maxTermCResults = maxTermC.fetchInto();
						if ( maxTermCResults != null ) {
							maxTerm = maxTermCResults.getStr(0);
						}
						if ( maxTermC.notFound() )
						{
							maxTerm = toStr(null);
						}
						minTermC.close();
						maxTermC.close();
						minSgbstdnC.close();
						//   
						if ( minTerm.isNull() )
						{
							//  no registration exists 
							getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("N"));
						}
						else if ( sorlcurElement.getSorlcurTermCode().greater(maxTerm) ) {
							//  future sgbstdn term 
							getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("N"));
						}
						else if ( between(sorlcurElement.getSorlcurTermCode(), minTerm, maxTerm) ) {
							//  in between reg terms 
							getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("Y"));
						}
						else if ( sorlcurElement.getSorlcurTermCode().lesserOrEquals(minSTerm) && (minSTerm.lesserOrEquals(minTerm)) ) {
							//  past terms 
							getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("N"));
						}
						else {
							getFormModel().getSCurriculaTraditional().setActiveRegInd(toStr("Y"));
						}
					}
					catch(Exception  e)
					{
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sorlcur_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_VIEW_CURRENT", getGlobal("view_current")));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_CODE", this.getFormModel().getSCurricula().getModuleCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_KEY_SEQNO", this.getFormModel().getSCurricula().getModuleKeySeqno()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_TERM_CODE", this.getFormModel().getSCurricula().getModuleTermCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_MODULE_END_TERM", this.getFormModel().getSCurricula().getModuleEndTerm()));             


           
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CACT_CODE.WHEN-MOUSE-DOUBLECLICK
		  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
		public void sorlcurCactCode_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
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
		message( G$_NLS.Get('SOQOLIB-0223', 'FORM','*ERROR* Invalid curriculum activity status code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0223"), toStr("FORM"), toStr("*ERROR* Invalid curriculum activity status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.KEY-CQUERY
		 DECLARE
	 showlv_ok  boolean; 
BEGIN
   :global.value := ''; 
    --- next execute the lov to bring in the study paths 
 -- showlv_ok :=    SHOW_LOV('SGVSTSP_LOV');
 --  G$_CHECK_FAILURE;
   if :sovlcur_rowid is not null then 
   	   execute_trigger('duplicate_curric'); 
       g$_check_failure;
   end if; 
   go_item('sorlcur_key_seqno'); 
   g$_check_failure; 
   
   G$_DISPLAY_LOV('','');
   G$_CHECK_FAILURE;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN   	  
      :sorlcur_key_seqno := :global.value; 
   END IF ;
   
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ; 
   WHEN OTHERS THEN
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SORLCUR_KEY_SEQNO", function=KeyFunction.COUNT_QUERY)
		public void sorlcurKeySeqno_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				{
					NBool showlvOk= NBool.getNull();
					try
					{
						setGlobal("VALUE", toStr(""));
						// - next execute the lov to bring in the study paths 
						//  showlv_ok :=    SHOW_LOV('SGVSTSP_LOV');
						//   G$_CHECK_FAILURE;
						if ( !sorlcurElement.getSovlcurRowid().isNull() )
						{
							executeAction("duplicate_curric");
							getContainer().getGoqrpls().gCheckFailure();
						}
						goItem(toStr("sorlcur_key_seqno"));
						getContainer().getGoqrpls().gCheckFailure();
						getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
						getContainer().getGoqrpls().gCheckFailure();
						// 
						if ( !getGlobal("VALUE").isNull() )
						{
							sorlcurElement.setSorlcurKeySeqno(toNumber(getGlobal("VALUE")));
						}
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.KEY-HELP
		 BEGIN
   
   -- first duplicate the record 
   execute_trigger('deactivate_duplicate'); 
   
   --- next execute the lov to bring in the study paths 
   
   G$_DISPLAY_LOV('','');
   G$_CHECK_FAILURE;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
   	  go_item('sorlcur_key_seqno'); 
      :sorlcur_key_seqno := :global.value; 
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
   
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ; 
   WHEN OTHERS THEN
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEY-HELP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-HELP", item="SORLCUR_KEY_SEQNO", function=KeyFunction.HELP)
		public void sorlcurKeySeqno_Help()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				try
				{
					//  first duplicate the record 
					executeAction("deactivate_duplicate");
					// - next execute the lov to bring in the study paths 
					getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
					getContainer().getGoqrpls().gCheckFailure();
					// 
					if ( !getGlobal("VALUE").isNull() )
					{
						goItem(toStr("sorlcur_key_seqno"));
						sorlcurElement.setSorlcurKeySeqno(toNumber(getGlobal("VALUE")));
						getContainer().getGoqrpls().gCheckFailure();
						nextItem();
					}
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.KEY-DUP-ITEM
		 ---
  if :sovlcur_rowid is not null then 
     execute_trigger('create_study_path');
     g$_check_failure; 
  
  else 
  
  declare 
   sp_rowid   varchar2(18) ; 
  begin       
   sb_studypath.p_create
                 (p_pidm                     => :sorlcur.sorlcur_pidm ,
                  p_term_code_eff            => :s$_curricula.module_term_code,
                  p_key_seqno                => :sorlcur_key_seqno ,
                  p_stsp_code                => 'AS' ,
                  p_data_origin              => :GLOBAL.DATA_ORIGIN,
                  p_user_id                  =>  gb_common.f_sct_user,
                    p_rowid_out                 =>  sp_rowid ) ;
     end;
    end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sorlcurKeySeqno_KeyDupItem()
		{
			
				// -

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// -
				if ( !sorlcurElement.getSovlcurRowid().isNull() )
				{
					executeAction("create_study_path");
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					{
						NString spRowid= NString.getNull();
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Ref<NNumber> p_key_seqno_ref = new Ref<NNumber>(sorlcurElement.getSorlcurKeySeqno());
						SbStudypath.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/getFormModel().getSCurricula().getModuleTermCode(), p_key_seqno_ref, /*pStspCode=>*/"AS", /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/GbCommon.fSctUser(), /*pRowidOut=>*/spRowid);
						sorlcurElement.setSorlcurKeySeqno(p_key_seqno_ref.val);
					}
				}
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
   		message( G$_NLS.Get('SOQOLIB-0224', 'FORM','*ERROR* Invalid study path key sequence.') );
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


				int rowCount = 0;
				if(sorlcurElement.getSorlcurKeySeqno().isNull())
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0224"), toStr("FORM"), toStr("*ERROR* Invalid study path key sequence.")));
						throw new ApplicationException();
					}
					findSpC.close();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.KEYLISTVAL_OLD
		 --- list values 
   :global.value := ''; 
    
   G$_DISPLAY_LOV('','');
   G$_CHECK_FAILURE;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      :sorlcur_key_seqno := :global.value; 
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.KEYLISTVAL_OLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYLISTVAL_OLD")
		public void sorlcurKeySeqno_KeylistvalOld()
		{
			
				// - list values 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - list values 
				setGlobal("VALUE", toStr(""));
				getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					sorlcurElement.setSorlcurKeySeqno(toNumber(getGlobal("VALUE")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.DO_LISTS
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
end if;	
--if :global.term_code is null then 
  :global.term_code := :s$_curricula.module_term_code;
--end if; 
go_item('sorlcur_key_seqno'); 
g$_check_failure; 
declare  
	lv_study_paths_exists varchar2(1) := 'n'; 
	cursor find_sp_c is 
	   select 'Y' 
	   from sgrstsp 
	   where sgrstsp_pidm = :sorlcur_pidm
	   and sgrstsp_term_code_eff = :s$_curricula.module_term_code ;
begin 

   open find_sp_c;
   fetch find_sp_c into lv_study_paths_exists;
   if find_sp_c%notfound then 
   	   lv_study_paths_exists := 'N'; 
   end if;
   close find_sp_c;
 
   
  if ( :sorlcur_key_seqno is null or :sorlcur_key_seqno = 99 ) then  
   	if    lv_study_paths_exists = 'Y' then 
     if :sovlcur_rowid is null     then 
   	      G$_KEY_OPT_MENU('SORLCUR_KEY_SEQNO',
                 G$_NLS.Get('SOQOLIB-0225', 'FORM','Attach to Existing Study Path') ,'COUNT_QUERY',
                 '','',   '' ,'','','');
          G$_CHECK_FAILURE;
   	
  
      else 

          G$_KEY_OPT_MENU('SORLCUR_KEY_SEQNO',
                 G$_NLS.Get('SOQOLIB-0226', 'FORM','Create New Study Path ') ,'DUPLICATE_ITEM',
                 G$_NLS.Get('SOQOLIB-0227', 'FORM','Attach to Existing Study Path') ,'COUNT_QUERY',
                  '' ,'','','');
          G$_CHECK_FAILURE;
  	
      end if; 
     else 
        	G$_KEY_OPT_MENU('SORLCUR_KEY_SEQNO',
                 G$_NLS.Get('SOQOLIB-0228', 'FORM','Create New Study Path ') ,'DUPLICATE_ITEM',
                  '','',  '' ,'','','');
          G$_CHECK_FAILURE;
     	
     	end if; 
     
  else
     	if lv_study_paths_exists = 'Y' then 
     		   go_item('sorlcur_key_seqno'); 
     		   do_key('LIST_VALUES');
    
     		  
     else 
   		  message( G$_NLS.Get('SOQOLIB-0229', 'FORM','*ERROR* This option is not available.') );
    	  raise form_trigger_failure;	
    	end if; 
   end if; 
end ; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO.DO_LISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DO_LISTS")
		public void sorlcurKeySeqno_DoLists()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				// if :global.term_code is null then 
				setGlobal("TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
				// end if; 
				goItem(toStr("sorlcur_key_seqno"));
				getContainer().getGoqrpls().gCheckFailure();
				{
					NString lvStudyPathsExists = toStr("n");
					String sqlfindSpC = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SORLCUR_PIDM AND sgrstsp_term_code_eff = :S___CURRICULA_MODULE_TERM_CODE ";
					DataCursor findSpC = new DataCursor(sqlfindSpC);
					//Setting query parameters
					findSpC.addParameter("SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
					findSpC.addParameter("S___CURRICULA_MODULE_TERM_CODE", getFormModel().getSCurricula().getModuleTermCode());
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
					findSpC.close();
					if ((sorlcurElement.getSorlcurKeySeqno().isNull() || sorlcurElement.getSorlcurKeySeqno().equals(99)))
					{
						if ( lvStudyPathsExists.equals("Y") )
						{
							if ( sorlcurElement.getSovlcurRowid().isNull() )
							{
								getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_KEY_SEQNO"), GNls.Fget(toStr("SOQOLIB-0225"), toStr("FORM"), toStr("Attach to Existing Study Path")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""));
								getContainer().getGoqrpls().gCheckFailure();
							}
							else {
								getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_KEY_SEQNO"), GNls.Fget(toStr("SOQOLIB-0226"), toStr("FORM"), toStr("Create New Study Path ")), toStr("DUPLICATE_ITEM"), GNls.Fget(toStr("SOQOLIB-0227"), toStr("FORM"), toStr("Attach to Existing Study Path")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
								getContainer().getGoqrpls().gCheckFailure();
							}
						}
						else {
							getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_KEY_SEQNO"), GNls.Fget(toStr("SOQOLIB-0228"), toStr("FORM"), toStr("Create New Study Path ")), toStr("DUPLICATE_ITEM"), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""));
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
					else {
						if ( lvStudyPathsExists.equals("Y") )
						{
							goItem(toStr("sorlcur_key_seqno"));
							executeAction("LIST_VALUES");
						}
						else {
							errorMessage(GNls.Fget(toStr("SOQOLIB-0229"), toStr("FORM"), toStr("*ERROR* This option is not available.")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO.G$_SEARCH_OPTIONS
		 execute_trigger('do_lists'); 
g$_check_failure;
		*/
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
			
				executeAction("do_lists");
				getContainer().getGoqrpls().gCheckFailure();
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.G$_SEARCH_OPTIONS
		  
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE 
 	if :sovlcur_rowid is not null then 
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
		 * SORLCUR_TERM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurTermCode_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("LIST_VALUES");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
 
if :sorlcur_term_code is null then
	:sorlcur_term_desc := null;
	return;
end if;
		*/
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
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					sorlcurElement.setSorlcurTermDesc(toStr(null));
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.WHEN-MOUSE-DOUBLECLICK
		 	  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.WHENVALIDATEITEMOLD
		 g$_check_query_mode;  
if :sorlcur_term_code is null then
	:sorlcur_term_desc := null;
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0230', 'FORM','*ERROR* Invalid term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	
	:sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
 
end;
if :global.query_mode = '1' then 
	return;
end if;

if :sorlcur_term_code <> :s$_curricula.module_term_code then 
	message(G$_NLS.Get('SOQOLIB-0231', 'FORM','*ERROR* term code must be equal to module term.') );
	raise form_trigger_failure;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.WHENVALIDATEITEMOLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHENVALIDATEITEMOLD")
		public void sorlcurTermCode_Whenvalidateitemold()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( sorlcurElement.getSorlcurTermCode().isNull() )
				{
					sorlcurElement.setSorlcurTermDesc(toStr(null));
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0230"), toStr("FORM"), toStr("*ERROR* Invalid term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
				}
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				if ( sorlcurElement.getSorlcurTermCode().notEquals(getFormModel().getSCurricula().getModuleTermCode()) )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0231"), toStr("FORM"), toStr("*ERROR* term code must be equal to module term.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.POST-CHANGE
		 if :save_term is not null and 
	:save_term <> :sorlcur_term_code and 
	:sorlfos_term_code is not null then 
	:sorlcur_term_code := :save_term;
	message(G$_NLS.Get('SOQOLIB-0232', 'FORM','*ERROR* Term cannot be changed once fields of study are added.') );
end if; 

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0233', 'FORM','*ERROR* Invalid term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	
	:sorlcur_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code);
 
end;
 




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_TERM_CODE")
		public void sorlcurTermCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				if(sorlcurElement.getSorlcurTermCode().isNull())
		return;
				if ( !sorlcurElement.getSaveTerm().isNull() && sorlcurElement.getSaveTerm().notEquals(sorlcurElement.getSorlcurTermCode()) && !sorlfosElement.getSorlfosTermCode().isNull() )
				{
					sorlcurElement.setSorlcurTermCode(sorlcurElement.getSaveTerm());
					errorMessage(GNls.Fget(toStr("SOQOLIB-0232"), toStr("FORM"), toStr("*ERROR* Term cannot be changed once fields of study are added.")));
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0233"), toStr("FORM"), toStr("*ERROR* Invalid term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCode()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE.PRE-TEXT-ITEM
		 -- save term code.  If lmod is outcome, the term code is 
-- enabled and they can change it.  We do not want them to
-- change the term if lfos rows exist with the previous term
:save_term := :sorlcur_term_code;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SORLCUR_TERM_CODE", function=KeyFunction.ITEM_IN)
		public void sorlcurTermCode_itemIn()
		{
			
				//  save term code.  If lmod is outcome, the term code is 
				//  enabled and they can change it.  We do not want them to
				//  change the term if lfos rows exist with the previous term

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				//  save term code.  If lmod is outcome, the term code is 
				//  enabled and they can change it.  We do not want them to
				//  change the term if lfos rows exist with the previous term
				sorlcurElement.setSaveTerm(sorlcurElement.getSorlcurTermCode());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_END.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE_END", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCodeEnd_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_END.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCodeEnd_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_END.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_TERM_CODE_END", function=KeyFunction.NEXT_ITEM)
		public void sorlcurTermCodeEnd_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		  	  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_END.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE_END")
		public void sorlcurTermCodeEnd_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 G$_CHECK_QUERY_MODE;
if :sorlcur_term_code_end is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_end);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0234', 'FORM','*ERROR* Invalid end term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	:sorlcur_end_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_end);
end;
if :global.query_mode = '1' then
	null;
else 
	if :sorlcur_term_code_end < :sorlcur_term_code then 
				message( G$_NLS.Get('SOQOLIB-0235', 'FORM','*ERROR* End term must be greater or equal to the term code.') );
		raise form_trigger_failure;
	end if;
end if; 
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


				getContainer().getGoqrpls().gCheckQueryMode();
				if ( sorlcurElement.getSorlcurTermCodeEnd().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeEnd());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0234"), toStr("FORM"), toStr("*ERROR* Invalid end term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurEndTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeEnd()));
				}
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
				}
				else {
					if ( sorlcurElement.getSorlcurTermCodeEnd().lesser(sorlcurElement.getSorlcurTermCode()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0235"), toStr("FORM"), toStr("*ERROR* End term must be greater or equal to the term code.")));
						throw new ApplicationException();
					}
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_CTLG.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
if :sorlcur_term_code_ctlg is null then
	 :sorlcur_catlg_term_desc := null; 
 
end if;
 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_TERM_CODE_CTLG", function=KeyFunction.ITEM_OUT)
		public void sorlcurTermCodeCtlg_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
				{
					sorlcurElement.setSorlcurCatlgTermDesc(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_CTLG.WHEN-MOUSE-DOUBLECLICK
		 	  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_CTLG.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_ctlg is null then
	 :sorlcur_catlg_term_desc := null; 
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_ctlg);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0236', 'FORM','*ERROR* Invalid catalog term code, press LIST for values.') );
		raise form_trigger_failure;
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


				if ( sorlcurElement.getSorlcurTermCodeCtlg().isNull() )
				{
					sorlcurElement.setSorlcurCatlgTermDesc(toStr(null));
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeCtlg());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0236"), toStr("FORM"), toStr("*ERROR* Invalid catalog term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PRIORITY_NO.POST-CHANGE
		 g$_check_query_mode;
 
if :global.query_mode = '1' 
	then return;
end if;

-- warn about the insertion of learner curriculum if it's current
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
	    	 cem_msg :=  G$_NLS.Get('SOQOLIB-0237', 'FORM','Curriculum will be active in a future term and may impact fee assessment.') ;
          SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,cem_msg);
          alert_button := show_alert('CURRICULUM_INVALID');
         if alert_button = ALERT_BUTTON1 then
             null;
         end if;
	 	  
	    end if; 
	  end if; 
   end ; 
end if;  
 

--- if learner curriculum 
-- give warning if record insert of learner will cause curriculum with grad app
-- seq to be non current 
declare 
	 
	 alert_button  number; 
 	 lv_gapp_seqno  sorlcur.sorlcur_gapp_seqno%type := null; 
 	 cursor find_gapp_c is 
 	   select sovlcur_gapp_seqno 
 	   from sovlcur
 	   where sovlcur_pidm = :s$_curricula.module_pidm
 	   and sovlcur_lmod_code = :s$_curricula.module_code
 	   and sovlcur_current_ind = 'Y'
 	   and sovlcur_active_ind = 'Y'
 	   and sovlcur_gapp_seqno is not null
 	   and sovlcur_rolled_seqno is null
 	   and sovlcur_priority_no = :sorlcur.sorlcur_priority_no; 
 	   
begin 

 	
if :s$_curricula.module_code =  sb_curriculum_str.f_learner then 
 
 if :sorlcur.sorlcur_duplicate_ind  = 'Y' then --- and :sorlcur.sorlcur_gapp_seqno is null then
	return;
 end if; 
 

 soklcur.p_create_sotvcur(p_pidm => :s$_curricula.module_pidm,
	    p_term_code =>   :s$_curricula.module_term_code,
      p_lmod_code => :s$_curricula.module_code); 
 
 open find_gapp_c;
 fetch find_gapp_c into lv_gapp_seqno; 
 if find_gapp_c%notfound then 
	 close find_gapp_c;
	 return;
 end if; 
 if sb_gradapp.f_isactive(p_pidm => :s$_curricula.module_pidm,
	 p_seqno => lv_gapp_seqno) = 'N' then 
	 return;
 end if; 
 
 alert_button := show_alert('CURRICULUM_COPY_GAPP_ALERT');
 if alert_button = ALERT_BUTTON1 then
      :sorlcur.sorlcur_gapp_seqno := lv_gapp_seqno;
 elsif alert_button = ALERT_BUTTON2 then 
      sb_gradapp.p_update 
       (p_pidm => :s$_curricula.module_pidm,
        p_seqno => lv_gapp_seqno,
        p_gast_code => sb_gradapp_strings.f_inactive,  
        p_USER_ID                => gb_common.f_sct_user,
        p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN ); 
 else 
  	:sorlcur.sorlcur_priority_no := null;
  	execute_trigger('calc_new_priority'); 
 end if; 
  
 close find_gapp_c;
end if;  -- do the above is the lmod is for learner 
end; 



 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PRIORITY_NO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_PRIORITY_NO")
		public void sorlcurPriorityNo_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				if(sorlcurElement.getSorlcurPriorityNo().isNull())
		return;
				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				//  warn about the insertion of learner curriculum if it's current
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
								cemMsg = GNls.Fget(toStr("SOQOLIB-0237"), toStr("FORM"), toStr("Curriculum will be active in a future term and may impact fee assessment."));
								setAlertMessageText(alertId, cemMsg);
								alertButton = toNumber(showAlert("CURRICULUM_INVALID"));
								if ( alertButton.equals(MessageServices.BUTTON1) )
								{
								}
							}
						}
					}
				}
				{
					NNumber alertButton= NNumber.getNull();
					NNumber lvGappSeqno = NNumber.getNull();
					String sqlfindGappC = "SELECT sovlcur_gapp_seqno " +
	" FROM sovlcur " +
	" WHERE sovlcur_pidm = :S___CURRICULA_MODULE_PIDM AND sovlcur_lmod_code = :S___CURRICULA_MODULE_CODE AND sovlcur_current_ind = 'Y' AND sovlcur_active_ind = 'Y' AND sovlcur_gapp_seqno IS NOT NULL AND sovlcur_rolled_seqno IS NULL AND sovlcur_priority_no = :SORLCUR_SORLCUR_PRIORITY_NO ";
					DataCursor findGappC = new DataCursor(sqlfindGappC);
					if ( getFormModel().getSCurricula().getModuleCode().equals(SbCurriculumStr.fLearner()) )
					{
						if ( sorlcurElement.getSorlcurDuplicateInd().equals("Y") )
						{
							// - and :sorlcur.sorlcur_gapp_seqno is null then
							return ;
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pTermCode=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pLmodCode=>*/getFormModel().getSCurricula().getModuleCode());
						//Setting query parameters
						findGappC.addParameter("S___CURRICULA_MODULE_PIDM", getFormModel().getSCurricula().getModulePidm());
						findGappC.addParameter("S___CURRICULA_MODULE_CODE", getFormModel().getSCurricula().getModuleCode());
						findGappC.addParameter("SORLCUR_SORLCUR_PRIORITY_NO", sorlcurElement.getSorlcurPriorityNo());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findGappC.
						findGappC.open();
						ResultSet findGappCResults = findGappC.fetchInto();
						if ( findGappCResults != null ) {
							lvGappSeqno = findGappCResults.getNumber(0);
						}
						if ( findGappC.notFound() )
						{
							findGappC.close();
							return ;
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						if ( SbGradapp.fIsactive(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/lvGappSeqno).equals("N") )
						{
							return ;
						}
						alertButton = toNumber(showAlert("CURRICULUM_COPY_GAPP_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							sorlcurElement.setSorlcurGappSeqno(lvGappSeqno);
						}
						else if ( alertButton.equals(MessageServices.BUTTON2) ) {
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							SbGradapp.pUpdate(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqno=>*/lvGappSeqno, toDate(/*pGastCode=>*/SbGradappStrings.fInactive()), /*pUserId=>*/GbCommon.fSctUser(), toDate(/*pDataOrigin=>*/getGlobal("DATA_ORIGIN")));
						}
						else {
							sorlcurElement.setSorlcurPriorityNo(toNumber(null));
							executeAction("calc_new_priority");
						}
						findGappC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PRIORITY_NO.WHEN-VALIDATE-ITEM
		 g$_check_query_mode;
if :global.query_mode = '1' 
	then return;
end if; 

 

if :sorlcur.sorlcur_priority_no is null then
	-- find max priority so we can set the new records priority 
  execute_trigger('calc_new_priority');

end if;  
	
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PRIORITY_NO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_PRIORITY_NO")
		public void sorlcurPriorityNo_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurPriorityNo_PostChange();

				getContainer().getGoqrpls().gCheckQueryMode();
				if ( getGlobal("QUERY_MODE").equals("1") )
				{
					return ;
				}
				if ( sorlcurElement.getSorlcurPriorityNo().isNull() )
				{
					//  find max priority so we can set the new records priority 
					executeAction("calc_new_priority");
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
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
		 --execute_trigger('program_options');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE 
 	if :sovlcur_rowid is not null then 
    execute_trigger('lfos_lov_error_msg'); 		
		
	ELSE 
			execute_trigger('program_options');
	end if; 
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
			
				// execute_trigger('program_options');

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// execute_trigger('program_options');
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("program_options");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.PROGRAM_OPTIONS
		 GO_ITEM('SORLCUR.SORLCUR_PROGRAM');
BREAK;

:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD'));
:s$_curricula.options_ind := 'Y'; 
 

G$_KEY_OPT_MENU('SORLCUR.SORLCUR_PROGRAM',
                 G$_NLS.Get('SOQOLIB-0238', 'FORM','All Program Codes') ,'LIST_VALUES',
                 G$_NLS.Get('SOQOLIB-0239', 'FORM','Base Curriculum Rules by Program') ,'HELP',
                 G$_NLS.Get('SOQOLIB-0240', 'FORM','Change Curriculum') ,'COUNT_QUERY',
                 G$_NLS.Get('SOQOLIB-0241', 'FORM','Curriculum Rules') ,'EDIT');
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
			
				goItem(toStr("SORLCUR.SORLCUR_PROGRAM"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR.SORLCUR_PROGRAM"), GNls.Fget(toStr("SOQOLIB-0238"), toStr("FORM"), toStr("All Program Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0239"), toStr("FORM"), toStr("Base Curriculum Rules by Program")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0240"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), GNls.Fget(toStr("SOQOLIB-0241"), toStr("FORM"), toStr("Curriculum Rules")), toStr("EDIT"));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.PRE-TEXT-ITEM
		 :change_program := :sorlcur_program;
set_item_property('SORLCUR_PROGRAM',LOV_NAME,'SMRPRLE_PROGRAM_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
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
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
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
             smrprle_curr_ind, smrprle_program_desc
     from smrprle
     where nvl(smrprle_pidm, :s$_curricula.module_pidm) = :s$_curricula.module_pidm
     and smrprle_program = :sorlcur_program     ;
              
begin
	hold_curr_ind := :lcur_original_curr_ind;

  open smrprle_check;
  fetch smrprle_check into  :lcur_camp_code, :lcur_levl_code,
              :lcur_coll_code, :lcur_degc_code, 
               smrprle_curr_ind, :sorlcur_program_desc;
  if smrprle_check%notfound then
     if :sorlcur_program = '************' then
            null;
     else
          message( G$_NLS.Get('SOQOLIB-0242', 'FORM','*ERROR* Invalid Program Code; Press LIST for Valid Codes.') );
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
         	-- if :global.init_curr_term > :s$_curricula.module_term_code then
            :lcur_temp_rule_ind := hold_curr_ind;
            :lcur_sobctrl_curr_rule_ind := hold_curr_ind;
          -- end if;
         else
         	  if :lcur_sobctrl_curr_rule_ind = 'Y' then
               execute_trigger('curr_ind_message');
            end if;
            :lcur_sobctrl_curr_rule_ind := smrprle_curr_ind;
         end if;
     else
         	 --- only override the curriculum checking if the term is < initial curric term
         	-- if :global.init_curr_term > :s$_curricula.module_term_code then
            :lcur_temp_rule_ind := hold_curr_ind;
            :lcur_sobctrl_curr_rule_ind := hold_curr_ind;
          -- end if;
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
					String sqlsmrprleCheck = "SELECT smrprle_camp_code, smrprle_levl_code_stu, smrprle_coll_code, smrprle_degc_code, smrprle_curr_ind, smrprle_program_desc " +
	" FROM smrprle " +
	" WHERE nvl(smrprle_pidm, :S___CURRICULA_MODULE_PIDM) = :S___CURRICULA_MODULE_PIDM AND smrprle_program = :SORLCUR_PROGRAM ";
					DataCursor smrprleCheck = new DataCursor(sqlsmrprleCheck);
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
						sorlcurElement.setSorlcurProgramDesc(smrprleCheckResults.getStr(5));
					}
					if ( smrprleCheck.notFound() )
					{
						if ( sorlcurElement.getSorlcurProgram().equals("************") )
						{
						}
						else {
							smrprleCheck.close();
							errorMessage(GNls.Fget(toStr("SOQOLIB-0242"), toStr("FORM"), toStr("*ERROR* Invalid Program Code; Press LIST for Valid Codes.")));
							throw new ApplicationException();
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
							//  if :global.init_curr_term > :s$_curricula.module_term_code then
							getFormModel().getSCurricula().setLcurTempRuleInd(holdCurrInd);
							getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(holdCurrInd);
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
						//  if :global.init_curr_term > :s$_curricula.module_term_code then
						getFormModel().getSCurricula().setLcurTempRuleInd(holdCurrInd);
						getFormModel().getSCurricula().setLcurSobctrlCurrRuleInd(holdCurrInd);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
if :sorlcur_program is null then
	:sorlcur_program_desc := null;
end if; 
--
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	RETURN; 
ELSE
IF NVL(:sorlcur_program,'%') <> NVL(:change_program,'%') THEN
   if :lcur_sobctrl_curr_rule_ind = 'Y' then
      :sorlcur_curr_rule := null; 
      execute_trigger('lcur_check_program'); 
   end if;
    
END IF;
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
				if ( sorlcurElement.getSorlcurProgram().isNull() )
				{
					sorlcurElement.setSorlcurProgramDesc(toStr(null));
				}
				// 
				if ( getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				else {
					if ( isNull(sorlcurElement.getSorlcurProgram(), "%").notEquals(isNull(getFormModel().getSCurricula().getChangeProgram(), "%")) )
					{
						if ( getFormModel().getSCurricula().getLcurSobctrlCurrRuleInd().equals("Y") )
						{
							sorlcurElement.setSorlcurCurrRule(toNumber(null));
							executeAction("lcur_check_program");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.KEY-LISTVAL
		  if :sovlcur_rowid is not null 
	and :SYSTEM.MODE <>'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
 else 

   set_item_property('SORLCUR_PROGRAM', LOV_NAME, 'SMRPRLE_PROGRAM_LOV');
   g$_display_lov('','');
   if :global.sel_ind = 'Y' then
      :sorlcur_program := :global.program;
      :sorlcur_program_desc := sb_smrprle.f_get_description(:sorlcur_program);
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
						sorlcurElement.setSorlcurProgramDesc(SbSmrprle.fGetDescription(sorlcurElement.getSorlcurProgram()));
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
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM.KEY-HELP
		 IF :SYSTEM.MODE = 'ENTER-QUERY' OR 
	:sovlcur_rowid is not null THEN
	HELP;
ELSE 
--
:global.sel_ind := '';
:lcur_process := 'SORLCUR_PROGRAM';
execute_trigger('lcur_program_help');
g$_check_failure;
GO_ITEM('SORLCUR.SORLCUR_PROGRAM');
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
					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
				}
				else {
					// 
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_PROGRAM"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR.SORLCUR_PROGRAM"));
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
	GO_ITEM('SORLCUR.SORLCUR_PROGRAM');
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
					goItem(toStr("SORLCUR.SORLCUR_PROGRAM"));
					nextItem();
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.WHEN-MOUSE-DOUBLECLICK
		  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.G$_SEARCH_OPTIONS
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
 	if :sovlcur_rowid is not null then 
    execute_trigger('lfos_lov_error_msg');
		
	ELSE 

	  execute_trigger('level_options');
	  g$_check_failure;
  end if; 
END IF;
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


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("level_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.LEVEL_OPTIONS
		 GO_ITEM('SORLCUR.SORLCUR_LEVL_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 


G$_KEY_OPT_MENU('SORLCUR_LEVL_CODE', G$_NLS.Get('SOQOLIB-0243', 'FORM','All Level Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0244', 'FORM','Base Curriculum Rules by Level') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0245', 'FORM','Change Curriculum') ,'COUNT_QUERY',
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
			
				goItem(toStr("SORLCUR.SORLCUR_LEVL_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_LEVL_CODE"), GNls.Fget(toStr("SOQOLIB-0243"), toStr("FORM"), toStr("All Level Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0244"), toStr("FORM"), toStr("Base Curriculum Rules by Level")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0245"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE.PRE-TEXT-ITEM
		 :change_levl_code := :sorlcur_levl_code;
set_item_property('SORLCUR_LEVL_CODE',LOV_NAME,'STVLEVL_LOV');

--
if :lcur_sobctrl_curr_rule_ind = 'Y' then
   if :sorlcur_term_code_ctlg is null then
      :sorlcur_term_code_ctlg := :sorlcur_term_code;
       :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);
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
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
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
		message( G$_NLS.Get('SOQOLIB-0246', 'FORM','*ERROR* Invalid level code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0246"), toStr("FORM"), toStr("*ERROR* Invalid level code, press LIST for values.")));
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

	--
	:global.sel_ind := '';
	:lcur_process := 'SORLCUR_LEVL_CODE';
	execute_trigger('lcur_program_help');
	g$_check_failure;
	GO_ITEM('SORLCUR.SORLCUR_LEVL_CODE');
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
					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
				}
				else {
					// 
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_LEVL_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
					goItem(toStr("SORLCUR.SORLCUR_LEVL_CODE"));
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
	GO_ITEM('SORLCUR.SORLCUR_LEVL_CODE');
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
					goItem(toStr("SORLCUR.SORLCUR_LEVL_CODE"));
					nextItem();
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.WHEN-MOUSE-DOUBLECLICK
		    
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.G$_SEARCH_OPTIONS
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
 	if :sovlcur_rowid is not null then 
    execute_trigger('lfos_lov_error_msg');
	
  ELSE 
	  execute_trigger('campus_options');
	  g$_check_failure;
  end if; 
END IF;
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


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("campus_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE.CAMPUS_OPTIONS
		 
GO_ITEM('SORLCUR.SORLCUR_CAMP_CODE');
BREAK;
:CHECK_KEYS := 'N';

copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 

 
G$_KEY_OPT_MENU('SORLCUR_CAMP_CODE', G$_NLS.Get('SOQOLIB-0247', 'FORM','All Campus Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0248', 'FORM','Base Curriculum Rules by Campus') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0249', 'FORM','Change Curriculum') ,'COUNT_QUERY',
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
			
				goItem(toStr("SORLCUR.SORLCUR_CAMP_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_CAMP_CODE"), GNls.Fget(toStr("SOQOLIB-0247"), toStr("FORM"), toStr("All Campus Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0248"), toStr("FORM"), toStr("Base Curriculum Rules by Campus")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0249"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
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
	:sovlcur_rowid is not null then 
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
					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
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
	and :SYSTEM.MODE <> 'ENTER-QUERY'  then 
  execute_trigger('lfos_lov_error_msg');
else 
	:global.value := '';
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
					setGlobal("VALUE", toStr(""));
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
else 
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
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);

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
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
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
		message( G$_NLS.Get('SOQOLIB-0250', 'FORM','*ERROR* Invalid campus code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0250"), toStr("FORM"), toStr("*ERROR* Invalid campus code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurCampDesc(GbStvcamp.fGetDescription(sorlcurElement.getSorlcurCampCode()));
				}
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

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.WHEN-MOUSE-DOUBLECLICK
		  	  
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
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
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.G$_SEARCH_OPTIONS
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
 	if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
	ELSE 

	  execute_trigger('college_options');
	  g$_check_failure;
  end if; 
END IF;
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


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("college_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.COLLEGE_OPTIONS
		 GO_ITEM('SORLCUR.SORLCUR_COLL_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('HOST_BLOCK_FIELD')); 
:s$_curricula.options_ind := 'Y'; 

G$_KEY_OPT_MENU('SORLCUR_COLL_CODE', G$_NLS.Get('SOQOLIB-0251', 'FORM','All College Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0252', 'FORM','Base Curriculum Rules by College') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0253', 'FORM','Change Curriculum') ,'COUNT_QUERY',
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
			
				goItem(toStr("SORLCUR.SORLCUR_COLL_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_COLL_CODE"), GNls.Fget(toStr("SOQOLIB-0251"), toStr("FORM"), toStr("All College Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0252"), toStr("FORM"), toStr("Base Curriculum Rules by College")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0253"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
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
	:sovlcur_rowid is not null then 
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
					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
				}
				else {
					setGlobal("SEL_IND", toStr(""));
					getFormModel().getSCurricula().setLcurProcess(toStr("SORLCUR_COLL_CODE"));
					executeAction("lcur_program_help");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE.KEY-LISTVAL
		 if :sovlcur_rowid is not null 
 and :SYSTEM.MODE <> 'ENTER-QUERY'   then 
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
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


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
else 
	:lcur_process := 'SORLCUR_COLL_CODE';
	execute_trigger('lcur_sorcurr_change');
	g$_check_failure;
end if; 
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
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);

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
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
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
		message( G$_NLS.Get('SOQOLIB-0254', 'FORM','*ERROR* Invalid college code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0254"), toStr("FORM"), toStr("*ERROR* Invalid college code, press LIST for values.")));
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
		 IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
 	if :sovlcur_rowid is not null then 
execute_trigger('lfos_lov_error_msg');
		
	ELSE 

    execute_trigger('degree_options');
    G$_CHECK_FAILURE;
  end if; 
END IF; 
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


				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					if ( !sorlcurElement.getSovlcurRowid().isNull() )
					{
						executeAction("lfos_lov_error_msg");
					}
					else {
						executeAction("degree_options");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_DEGC_CODE.DEGREE_OPTIONS
		 
GO_ITEM('SORLCUR_DEGC_CODE');
BREAK;
:CHECK_KEYS := 'N';
copy(:SYSTEM.CURSOR_ITEM, name_in('s$_curricula.HOST_BLOCK_FIELD'));
:s$_curricula.options_ind := 'Y'; 

G$_KEY_OPT_MENU('SORLCUR_DEGC_CODE', G$_NLS.Get('SOQOLIB-0255', 'FORM','All Degree Codes') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0256', 'FORM','Base Curriculum Rules by Degree') ,'HELP',
                                     G$_NLS.Get('SOQOLIB-0257', 'FORM','Change Curriculum') ,'COUNT_QUERY',
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
				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				copy(getCursorItem(),getNameIn("s$_curricula.HOST_BLOCK_FIELD"));
				getFormModel().getSCurricula().setOptionsInd(toStr("Y"));
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SORLCUR_DEGC_CODE"), GNls.Fget(toStr("SOQOLIB-0255"), toStr("FORM"), toStr("All Degree Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0256"), toStr("FORM"), toStr("Base Curriculum Rules by Degree")), toStr("HELP"), GNls.Fget(toStr("SOQOLIB-0257"), toStr("FORM"), toStr("Change Curriculum")), toStr("COUNT_QUERY"), toStr(""), toStr(""));
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
	:sovlcur_rowid is not null then 
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
					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
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
 and :SYSTEM.MODE <> 'ENTER-QUERY'   then 
  execute_trigger('lfos_lov_error_msg');
else 
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
	OR :SYSTEM.MODE = 'ENTER-QUERY'  then 
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
      :sorlcur_catlg_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_ctlg);

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
						sorlcurElement.setSorlcurCatlgTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeCtlg()));
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
		message( G$_NLS.Get('SOQOLIB-0258', 'FORM','*ERROR* Invalid degree code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0258"), toStr("FORM"), toStr("*ERROR* Invalid degree code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurDegcDesc(GbStvdegc.fGetDescription(sorlcurElement.getSorlcurDegcCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_ADMT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurAdmtCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurAdmtCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_ADMT_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurAdmtCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ADMT_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_ADMT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_ADMT_CODE")
		public void sorlcurAdmtCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
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
		message( G$_NLS.Get('SOQOLIB-0259', 'FORM','*ERROR* Invalid admissions type code, press LIST for values.') );
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0259"), toStr("FORM"), toStr("*ERROR* Invalid admissions type code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ADMT_CODE.POST-CHANGE
		 if :sorlcur_admt_code is not null then 
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


				if(sorlcurElement.getSorlcurAdmtCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurAdmtCode().isNull() )
				{
					sorlcurElement.setSorlcurAdmtDesc(SbStvadmt.fGetDescription(sorlcurElement.getSorlcurAdmtCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_ADMIT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE_ADMIT", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCodeAdmit_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_ADMIT.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCodeAdmit_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_ADMIT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_TERM_CODE_ADMIT", function=KeyFunction.NEXT_ITEM)
		public void sorlcurTermCodeAdmit_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_ADMIT.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_ADMIT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE_ADMIT")
		public void sorlcurTermCodeAdmit_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
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
		message( G$_NLS.Get('SOQOLIB-0260', 'FORM','*ERROR* Invalid admissions term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	:sorlcur_admt_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_admit);
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0260"), toStr("FORM"), toStr("*ERROR* Invalid admissions term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurAdmtTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeAdmit()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_MATRIC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE_MATRIC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCodeMatric_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_MATRIC.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCodeMatric_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_MATRIC.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_TERM_CODE_MATRIC", function=KeyFunction.NEXT_ITEM)
		public void sorlcurTermCodeMatric_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_MATRIC.WHEN-MOUSE-DOUBLECLICK
		   
BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_MATRIC.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE_MATRIC")
		public void sorlcurTermCodeMatric_doubleClick()
		{
			
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
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
		message( G$_NLS.Get('SOQOLIB-0261', 'FORM','*ERROR* Invalid matriculation term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
	:sorlcur_matric_term_desc := gb_stvterm.f_get_description(:sorlcur_term_code_matric);
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
						errorMessage(GNls.Fget(toStr("SOQOLIB-0261"), toStr("FORM"), toStr("*ERROR* Invalid matriculation term code, press LIST for values.")));
						throw new ApplicationException();
					}
					sorlcurElement.setSorlcurMatricTermDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeMatric()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_LMOD_CODE")
		public void sorlcurLmodCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LMOD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLmodCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurLmodCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sorlcurLmodCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_LMOD_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurLmodCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_LMOD_CODE", function=KeyFunction.ITEM_OUT)
		public void sorlcurLmodCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_START_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlcurStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_START_DATE.POST-CHANGE
		 IF :SORLCUR_START_DATE IS NOT NULL
	AND :SORLCUR_END_DATE IS NOT NULL THEN 
	IF :SORLCUR_END_DATE < :SORLCUR_START_DATE THEN 
		message( G$_NLS.Get('SOQOLIB-0262', 'FORM','*ERROR* Start date must be less than end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_START_DATE")
		public void sorlcurStartDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurStartDate().isNull())
		return;
				if ( !sorlcurElement.getSorlcurStartDate().isNull() && !sorlcurElement.getSorlcurEndDate().isNull() )
				{
					if ( sorlcurElement.getSorlcurEndDate().lesser(sorlcurElement.getSorlcurStartDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0262"), toStr("FORM"), toStr("*ERROR* Start date must be less than end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_END_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlcurEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_END_DATE.POST-CHANGE
		 IF :SORLCUR_START_DATE IS NOT NULL
	AND :SORLCUR_END_DATE IS NOT NULL THEN 
	IF :SORLCUR_END_DATE < :SORLCUR_START_DATE THEN 
	  message( G$_NLS.Get('SOQOLIB-0263', 'FORM','*ERROR* Start date must be less than end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_END_DATE")
		public void sorlcurEndDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurEndDate().isNull())
		return;
				if ( !sorlcurElement.getSorlcurStartDate().isNull() && !sorlcurElement.getSorlcurEndDate().isNull() )
				{
					if ( sorlcurElement.getSorlcurEndDate().lesser(sorlcurElement.getSorlcurStartDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0263"), toStr("FORM"), toStr("*ERROR* Start date must be less than end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_STYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_STYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurStypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_STYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurStypCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_STYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_STYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurStypCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_STYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_STYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_STYP_CODE")
		public void sorlcurStypCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_STYP_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_styp_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvstyp.f_code_exists(:sorlcur_styp_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0264', 'FORM','*ERROR* Invalid student type code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_STYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_STYP_CODE")
		public void sorlcurStypCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurStypCode_PostChange();

				if ( sorlcurElement.getSorlcurStypCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvstyp.fCodeExists(sorlcurElement.getSorlcurStypCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0264"), toStr("FORM"), toStr("*ERROR* Invalid student type code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_STYP_CODE.POST-CHANGE
		 if :sorlcur_styp_code is not null then 
	:sorlcur_styp_code_desc := sb_stvstyp.f_get_description(:sorlcur_styp_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_STYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_STYP_CODE")
		public void sorlcurStypCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurStypCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurStypCode().isNull() )
				{
					sorlcurElement.setSorlcurStypCodeDesc(SbStvstyp.fGetDescription(sorlcurElement.getSorlcurStypCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_SITE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_SITE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurSiteCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_SITE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurSiteCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_SITE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_SITE_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurSiteCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_SITE_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_SITE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_SITE_CODE")
		public void sorlcurSiteCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_SITE_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_site_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvsite.f_code_exists(:sorlcur_site_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0265', 'FORM','*ERROR* Invalid site code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_SITE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_SITE_CODE")
		public void sorlcurSiteCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurSiteCode_PostChange();

				if ( sorlcurElement.getSorlcurSiteCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvsite.fCodeExists(sorlcurElement.getSorlcurSiteCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0265"), toStr("FORM"), toStr("*ERROR* Invalid site code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_SITE_CODE.POST-CHANGE
		 if :sorlcur_site_code is not null then 
	:sorlcur_site_code_desc := gb_stvsite.f_get_description(:sorlcur_site_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_SITE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_SITE_CODE")
		public void sorlcurSiteCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurSiteCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurSiteCode().isNull() )
				{
					sorlcurElement.setSorlcurSiteCodeDesc(GbStvsite.fGetDescription(sorlcurElement.getSorlcurSiteCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_RATE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_RATE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurRateCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_RATE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurRateCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_RATE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_RATE_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurRateCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_RATE_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_RATE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_RATE_CODE")
		public void sorlcurRateCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_RATE_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_rate_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvrate.f_code_exists(:sorlcur_rate_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0266', 'FORM','*ERROR* Invalid rate code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_RATE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_RATE_CODE")
		public void sorlcurRateCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurRateCode_PostChange();

				if ( sorlcurElement.getSorlcurRateCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvrate.fCodeExists(sorlcurElement.getSorlcurRateCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0266"), toStr("FORM"), toStr("*ERROR* Invalid rate code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_RATE_CODE.POST-CHANGE
		 if :sorlcur_rate_code is not null then 
	:sorlcur_rate_code_desc := sb_stvrate.f_get_description(:sorlcur_rate_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_RATE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_RATE_CODE")
		public void sorlcurRateCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurRateCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurRateCode().isNull() )
				{
					sorlcurElement.setSorlcurRateCodeDesc(SbStvrate.fGetDescription(sorlcurElement.getSorlcurRateCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LEAV_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLeavCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurLeavCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_LEAV_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurLeavCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEAV_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_LEAV_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_LEAV_CODE")
		public void sorlcurLeavCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEAV_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_leav_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvleav.f_code_exists(:sorlcur_leav_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0267', 'FORM','*ERROR* Invalid leave of absence code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_LEAV_CODE")
		public void sorlcurLeavCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurLeavCode_PostChange();

				if ( sorlcurElement.getSorlcurLeavCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvleav.fCodeExists(sorlcurElement.getSorlcurLeavCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0267"), toStr("FORM"), toStr("*ERROR* Invalid leave of absence code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEAV_CODE.POST-CHANGE
		 if :sorlcur_leav_code is not null then 
	:sorlcur_leav_code_desc := sb_stvleav.f_get_description(:sorlcur_leav_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_LEAV_CODE")
		public void sorlcurLeavCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurLeavCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurLeavCode().isNull() )
				{
					sorlcurElement.setSorlcurLeavCodeDesc(SbStvleav.fGetDescription(sorlcurElement.getSorlcurLeavCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_LEAV_FROM_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurLeavFromDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LEAV_FROM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLeavFromDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_LEAV_FROM_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlcurLeavFromDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEAV_FROM_DATE.POST-CHANGE
		 IF :SORLCUR_LEAV_FROM_DATE IS NOT NULL AND
	:SORLCUR_LEAV_CODE IS NULL THEN 
	MESSAGE(G$_NLS.GET('SOQOLIB-0268','FORM','*ERROR* Leave code is required with leave from and to date.'));
	raise form_trigger_failure;
END IF;  

IF :SORLCUR_LEAV_FROM_DATE IS NOT NULL
	AND :SORLCUR_LEAV_TO_DATE IS NOT NULL THEN 
	IF :SORLCUR_LEAV_TO_DATE < :SORLCUR_LEAV_FROM_DATE THEN 
		message( G$_NLS.Get('SOQOLIB-0269', 'FORM','*ERROR* Leave start date must be less than the leave end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_LEAV_FROM_DATE")
		public void sorlcurLeavFromDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurLeavFromDate().isNull())
		return;
				if ( !sorlcurElement.getSorlcurLeavFromDate().isNull() && sorlcurElement.getSorlcurLeavCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0268"), toStr("FORM"), toStr("*ERROR* Leave code is required with leave from and to date.")));
					throw new ApplicationException();
				}
				if ( !sorlcurElement.getSorlcurLeavFromDate().isNull() && !sorlcurElement.getSorlcurLeavToDate().isNull() )
				{
					if ( sorlcurElement.getSorlcurLeavToDate().lesser(sorlcurElement.getSorlcurLeavFromDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0269"), toStr("FORM"), toStr("*ERROR* Leave start date must be less than the leave end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_LEAV_TO_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurLeavToDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LEAV_TO_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLeavToDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_LEAV_TO_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlcurLeavToDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEAV_TO_DATE.POST-CHANGE
		 
IF :SORLCUR_LEAV_TO_DATE IS NOT NULL AND
	:SORLCUR_LEAV_CODE IS NULL THEN 
	MESSAGE(G$_NLS.GET('SOQOLIB-0270','FORM','*ERROR* Leave code is required with leave from and to date.'));
	raise form_trigger_failure;
END IF;

IF :SORLCUR_LEAV_FROM_DATE IS NOT NULL
	AND :SORLCUR_LEAV_TO_DATE IS NOT NULL THEN 
	IF :SORLCUR_LEAV_TO_DATE < :SORLCUR_LEAV_FROM_DATE THEN 
		message( G$_NLS.Get('SOQOLIB-0271', 'FORM','*ERROR* Leave start date must be less than leave end date.') );
		 raise form_trigger_failure;
	END IF;
END IF; 
 
		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_LEAV_TO_DATE")
		public void sorlcurLeavToDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurLeavToDate().isNull())
		return;
				if ( !sorlcurElement.getSorlcurLeavToDate().isNull() && sorlcurElement.getSorlcurLeavCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0270"), toStr("FORM"), toStr("*ERROR* Leave code is required with leave from and to date.")));
					throw new ApplicationException();
				}
				if ( !sorlcurElement.getSorlcurLeavFromDate().isNull() && !sorlcurElement.getSorlcurLeavToDate().isNull() )
				{
					if ( sorlcurElement.getSorlcurLeavToDate().lesser(sorlcurElement.getSorlcurLeavFromDate()) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0271"), toStr("FORM"), toStr("*ERROR* Leave start date must be less than leave end date.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_EXP_GRAD_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_EXP_GRAD_DATE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurExpGradDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_EXP_GRAD_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_EXP_GRAD_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurExpGradDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_EXP_GRAD_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SORLCUR_EXP_GRAD_DATE", function=KeyFunction.ITEM_OUT)
		public void sorlcurExpGradDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_GRAD.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_CODE_GRAD", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermCodeGrad_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_GRAD.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurTermCodeGrad_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_GRAD.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_TERM_CODE_GRAD", function=KeyFunction.NEXT_ITEM)
		public void sorlcurTermCodeGrad_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_GRAD.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_TERM_CODE_GRAD.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_TERM_CODE_GRAD")
		public void sorlcurTermCodeGrad_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR").equals(NBool.False))
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_GRAD.WHEN-VALIDATE-ITEM
		 if :sorlcur_term_code_grad is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvterm.f_code_exists(:sorlcur_term_code_grad);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0272', 'FORM','*ERROR* Invalid graduation term code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_GRAD.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_TERM_CODE_GRAD")
		public void sorlcurTermCodeGrad_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurTermCodeGrad_PostChange();

				if ( sorlcurElement.getSorlcurTermCodeGrad().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvterm.fCodeExists(sorlcurElement.getSorlcurTermCodeGrad());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0272"), toStr("FORM"), toStr("*ERROR* Invalid graduation term code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_TERM_CODE_GRAD.POST-CHANGE
		 if :sorlcur_term_code_grad is not null then 
	:sorlcur_term_code_grad_desc := gb_stvterm.f_get_description(:sorlcur_term_code_grad);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_GRAD.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_TERM_CODE_GRAD")
		public void sorlcurTermCodeGrad_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurTermCodeGrad().isNull())
		return;
				if ( !sorlcurElement.getSorlcurTermCodeGrad().isNull() )
				{
					sorlcurElement.setSorlcurTermCodeGradDesc(GbStvterm.fGetDescription(sorlcurElement.getSorlcurTermCodeGrad()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ACYR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_ACYR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurAcyrCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ACYR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sorlcurAcyrCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ACYR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SORLCUR_ACYR_CODE", function=KeyFunction.NEXT_ITEM)
		public void sorlcurAcyrCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ACYR_CODE.WHEN-MOUSE-DOUBLECLICK
		 if get_block_property('SORLCUR',INSERT_ALLOWED) = 'FALSE'
	then 
	  return;
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
		 * SORLCUR_ACYR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLCUR_ACYR_CODE")
		public void sorlcurAcyrCode_doubleClick()
		{
			
				if ( getBlockInsertAllowed("SORLCUR")== NBool.False)
				{
					return ;
				}
				getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ACYR_CODE.WHEN-VALIDATE-ITEM
		 if :sorlcur_acyr_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := gb_stvacyr.f_code_exists(:sorlcur_acyr_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0273', 'FORM','*ERROR* Invalid graduation year code, press LIST for values.') );
		raise form_trigger_failure;
	end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ACYR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_ACYR_CODE")
		public void sorlcurAcyrCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


			this.sorlcurAcyrCode_PostChange();

				if ( sorlcurElement.getSorlcurAcyrCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = GbStvacyr.fCodeExists(sorlcurElement.getSorlcurAcyrCode());
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0273"), toStr("FORM"), toStr("*ERROR* Invalid graduation year code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_ACYR_CODE.POST-CHANGE
		 if :sorlcur_acyr_code is not null then 
	:sorlcur_acyr_code_desc := gb_stvacyr.f_get_description(:sorlcur_acyr_code);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ACYR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SORLCUR_ACYR_CODE")
		public void sorlcurAcyrCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if(sorlcurElement.getSorlcurAcyrCode().isNull())
		return;
				if ( !sorlcurElement.getSorlcurAcyrCode().isNull() )
				{
					sorlcurElement.setSorlcurAcyrCodeDesc(GbStvacyr.fGetDescription(sorlcurElement.getSorlcurAcyrCode()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_TERM_CODE_LBT")
		public void sorlcurTermCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_CODE_CTLG_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_TERM_CODE_CTLG_LBT")
		public void sorlcurTermCodeCtlgLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_PROGRAM_LBT")
		public void sorlcurProgramLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_PROGRAM_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLCUR.SORLCUR_PROGRAM');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
execute_trigger('program_options');
g$_check_failure;
END IF; 



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
			
				goItem(toStr("SORLCUR.SORLCUR_PROGRAM"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					executeAction("program_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_LEVL_CODE_LBT")
		public void sorlcurLevlCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_LEVL_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLCUR.SORLCUR_LEVL_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
execute_trigger('level_options');
g$_check_failure;
END IF; 
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
			
				goItem(toStr("SORLCUR.SORLCUR_LEVL_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					executeAction("level_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_COLL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_COLL_CODE_LBT")
		public void sorlcurCollCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_COLL_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLCUR.SORLCUR_COLL_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
  execute_trigger('college_options');
  g$_check_failure;
END IF;
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
			
				goItem(toStr("SORLCUR.SORLCUR_COLL_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					executeAction("college_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
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
		 GO_ITEM('SORLCUR.SORLCUR_DEGC_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
  execute_trigger('degree_options');
  g$_check_failure;
END IF;
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
			
				goItem(toStr("SORLCUR.SORLCUR_DEGC_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					executeAction("degree_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CAMP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_CAMP_CODE_LBT")
		public void sorlcurCampCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_CAMP_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORLCUR.SORLCUR_CAMP_CODE');
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
	DO_KEY('LIST_VALUES');
ELSE
  execute_trigger('campus_options');
  g$_check_failure;
END IF;

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
			
				goItem(toStr("SORLCUR.SORLCUR_CAMP_CODE"));
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("LIST_VALUES");
				}
				else {
					executeAction("campus_options");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_START_DATE_DBT")
		public void sorlcurStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
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
			
				getGCalendarBtnClass().whenMouseClick();
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_LEAV_FROM_DATE_DBT")
		public void sorlcurLeavFromDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_LEAV_FROM_DATE_DBT")
		public void sorlcurLeavFromDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_LEAV_TO_DATE_DBT")
		public void sorlcurLeavToDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_LEAV_TO_DATE_DBT")
		public void sorlcurLeavToDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_EXP_GRAD_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_EXP_GRAD_DATE_DBT")
		public void sorlcurExpGradDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_EXP_GRAD_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_EXP_GRAD_DATE_DBT")
		public void sorlcurExpGradDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_TERM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_TERM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurTermDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_CATLG_TERM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_CATLG_TERM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurCatlgTermDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEVL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LEVL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLevlDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_PROGRAM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_PROGRAM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurProgramDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_ADMT_TERM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_ADMT_TERM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurAdmtTermDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_MATRIC_TERM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_MATRIC_TERM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurMatricTermDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_TERM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_END_TERM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurEndTermDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LMOD_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SORLCUR_LMOD_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sorlcurLmodCodeDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_REC_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NEXT_REC_BTN")
		public void nextRecBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREV_RECORD_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PREV_RECORD_BTN")
		public void prevRecordBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
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

		
		/* Original PL/SQL code code for TRIGGER DEACTIVE_BTN.WHEN-BUTTON-PRESSED
		 execute_trigger('query_only');
g$_check_failure;

if :system.cursor_block = 'SORLCUR'	then 
   execute_trigger('deactive_create_new'); 
  g$_check_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DEACTIVE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DEACTIVE_BTN")
		public void deactiveBtn_buttonClick()
		{
			
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getCursorBlock().equals("SORLCUR") )
				{
					executeAction("deactive_create_new");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DEACTIVE_DUPLICATE_BTN.WHEN-BUTTON-PRESSED
		 execute_trigger('query_only');
g$_check_failure;

if :system.cursor_block = 'SORLCUR'	then 
   execute_trigger('deactive_duplicate'); 
  g$_check_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DEACTIVE_DUPLICATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DEACTIVE_DUPLICATE_BTN")
		public void deactiveDuplicateBtn_buttonClick()
		{
			
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getCursorBlock().equals("SORLCUR") )
				{
					executeAction("deactive_duplicate");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DUPLICATE_BTN.WHEN-BUTTON-PRESSED
		 execute_trigger('query_only');
g$_check_failure;

if :system.cursor_block = 'SORLCUR'	then 
   execute_trigger('duplicate_curric'); 
  g$_check_failure;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DUPLICATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DUPLICATE_BTN")
		public void duplicateBtn_buttonClick()
		{
			
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getCursorBlock().equals("SORLCUR") )
				{
					executeAction("duplicate_curric");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APPLY_TO_GRADUATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="APPLY_TO_GRADUATE_BTN")
		public void applyToGraduateBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER APPLY_TO_GRADUATE_BTN.WHEN-BUTTON-PRESSED
		 --- create grad app and open up shagapp 
execute_trigger('query_only');
g$_check_failure;

if :system.form_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0274','FORM','Commit changes on form.'));
	raise form_trigger_failure;
end if; 

DECLARE 
	err_msg      varchar2(4000);
	
	gradapp_rec   sb_gradapp.gradapp_rec;
	gradapp_ref   sb_gradapp.gradapp_ref;
	
	lv_graduation_date    date  ;
  lv_acyr_code          stvacyr.stvacyr_code%type;
  lv_term_code_grad     stvterm.stvterm_code%type ; 
  lv_grst_code          stvgrst.stvgrst_code%type; 
  
  learner_rec           sb_learner.learner_rec;
  learner_ref           sb_learner.learner_ref;
  outcome_rec           sb_learneroutcome.learneroutcome_rec;
  outcome_ref           sb_learneroutcome.learneroutcome_ref;
  
  roll_exception        EXCEPTION;
  gapp_rowid            varchar2(30);
  alert_button          number;
  
  newgapp               shbgapp.shbgapp_seqno%type;
  
    
  BEGIN 
  	
  
	if :sorlcur.sorlcur_lmod_code <> sb_curriculum_str.f_learner then 
	  err_msg :=  G$_NLS.Get('SOQOLIB-0275', 'FORM','*ERROR* This functionality is available only on the learner curriculum.') ;
		raise roll_exception;
	end if; 
  if nvl(:sorlcur.sovlcur_current_ind,'N') <> 'Y'  then 
	  err_msg :=   G$_NLS.Get('SOQOLIB-0276', 'FORM','*ERROR* This functionality is available only on current learner curriculum.') ;
			raise roll_exception;
  end if;	
  if sb_learnercurricstatus.f_is_active(:sorlcur.sorlcur_cact_code) <> 'Y'  then 
	  err_msg :=  G$_NLS.Get('SOQOLIB-0277', 'FORM','*ERROR* This functionality is available only on current learner curriculum.') ;
		raise roll_exception;
  end if;	
  if :sorlcur.lcur_rolled_key_seqno is not null and 
  	sb_learneroutcome_rules.f_degree_awarded
  	  (p_pidm => :S$_CURRICULA.MODULE_PIDM,
	 	     p_seq_no => :sorlcur.lcur_rolled_key_seqno) = 'Y'  then 
	  err_msg :=   G$_NLS.Get('SOQOLIB-0278', 'FORM','*ERROR* The learner outcome has been awarded, this functionality is not available.') ;
	  raise roll_exception;
  end if;
  
  if :sorlcur.sorlcur_gapp_seqno is not null   then 
		execute_trigger('save_keys');
    g$_check_failure;
    :GLOBAL.GAPP_SEQNO := :sorlcur.sorlcur_gapp_seqno; 
    :GLOBAL.FORM_WAS_CALLED := 'Y';
    :GLOBAL.SECRFRM := 'SHAGAPP';
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   	G$_CHECK_FAILURE;
	 --F2J_TODO: Change global current_user01 to current_user
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,:GLOBAL.SECRFRM,'');
	  :GLOBAL.FORM_WAS_CALLED := '';  
	  
	  execute_trigger('lcur_record_cnt');
    g$_check_failure;
    :GLOBAL.GAPP_SEQNO := ''; 
    message(g$_nls.get('SOQOLIB-0279','FORM','Return from graduation application.'));
	  return;
	end if;	
  
   -- show alert, the roll cannot be undone 
  alert_button := show_alert('CURRICULUM_STOP_COMMIT_ALERT');
  if alert_button = ALERT_BUTTON1 then
       null;
  else 
  	message( G$_NLS.Get('SOQOLIB-0280', 'FORM','Creation of the graduation application was cancelled.') );
  	return;
		raise form_trigger_failure;
  end if;
  
  --- send the grad info from first sorlcur; sgbstdn and if the lcur was rolled 
  --- send from the shrdgmr 
  if :sorlcur.sorlcur_exp_grad_date is not null or :sorlcur.sorlcur_term_code_grad is not null
  	or :sorlcur.sorlcur_acyr_code is not null then 
  		lv_graduation_date    := :sorlcur.sorlcur_exp_grad_date  ;
      lv_acyr_code          :=:sorlcur.sorlcur_acyr_code;
      lv_term_code_grad     :=:sorlcur.sorlcur_term_code_grad ; 
      lv_grst_code          := null ;
  else 
  	if :sorlcur.sorlcur_rolled_seqno is null then 
    	learner_ref := sb_learner.f_query_one (p_pidm => :sorlcur.sorlcur_pidm,
  	     p_term_code_eff => :s$_curricula.module_term_code);
     	fetch learner_ref into learner_rec; 
     	close learner_ref; 
     	lv_graduation_date   := learner_rec.r_exp_grad_date  ;
      lv_acyr_code         := learner_rec.r_acyr_code;
      lv_term_code_grad    := learner_rec.r_term_code_grad ; 
      lv_grst_code          := null ;
  	else 
     	outcome_ref := sb_learneroutcome.f_query_one (p_pidm => :sorlcur.sorlcur_pidm,
  	     p_seq_no => :sorlcur.lcur_rolled_key_seqno);
     	fetch outcome_ref into outcome_rec; 
     	close outcome_ref; 
     	lv_graduation_date    := outcome_rec.r_grad_date  ;
      lv_acyr_code          := outcome_rec.r_acyr_code;
      lv_term_code_grad     := outcome_rec.r_term_code_grad ; 
      lv_grst_code          := outcome_rec.r_grst_code ;
  	end if; 
  end if; 
   --F2J_TODO: Change global current_user01 to current_user     
  sb_gradapp.p_create 
    (p_pidm           =>  :sorlcur.sorlcur_pidm,
    p_seqno           => null,            
    p_request_date    => trunc(sysdate),             
    p_gast_code       => sb_gradapp_strings.f_active,      
    p_gast_date       => sysdate,       
    p_user_id         => :global.current_user01,            
    p_gadr_code       => null,            
    p_dgmr_upd_grst_code  =>   lv_grst_code, 
    p_grad_date       => lv_graduation_date,           
    p_grad_term_code  => lv_term_code_grad,           
    p_grad_acyr_code  => lv_acyr_code,        
    p_grad_attend_cde =>  null,        
    p_data_origin     => :global.data_origin,
    p_rowid_out       => gapp_rowid,
    p_seqno_out       => newgapp);
 --- update the seqno on the lcur record 
  soklcur.p_gradapp_seqno
      (p_pidm     =>  :sorlcur.sorlcur_pidm,
      p_seqno    =>  :sorlcur.sorlcur_seqno,
      p_user_id  => gb_common.f_sct_user, 
      p_gapp_seqno  => newgapp,
      p_rowid       => :sorlcur.sovlcur_rowid,
      p_data_origin => :global.data_origin); 
      
  
  :system.message_level := '5';   
  commit_form; 
  g$_check_failure; 
  :system.message_level := '0';
  
  execute_trigger('save_keys');
  g$_check_failure;
  :GLOBAL.GAPP_SEQNO := newgapp; 
  
 	:GLOBAL.FORM_WAS_CALLED := 'Y';
	:GLOBAL.SECRFRM := 'SHAGAPP';
	EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	G$_CHECK_FAILURE;
	 --F2J_TODO: Change global current_user01 to current_user
	G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,:GLOBAL.SECRFRM,'');
	:GLOBAL.FORM_WAS_CALLED := '';   
 
  execute_trigger('lcur_record_cnt');
  g$_check_failure;
  :GLOBAL.GAPP_SEQNO := ''; 
  message(g$_nls.get('SOQOLIB-0281','FORM','Return from graduation application.'));

EXCEPTION
 WHEN ROLL_EXCEPTION THEN
   G$_DISPLAY_ERR_MSG(err_msg);
   RAISE FORM_TRIGGER_FAILURE;
 WHEN OTHERS THEN
   if sqlcode <> 0  then 
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE;
   end if; 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APPLY_TO_GRADUATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APPLY_TO_GRADUATE_BTN")
		public void applyToGraduateBtn_buttonClick()
		{
			
				// - create grad app and open up shagapp 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				// - create grad app and open up shagapp 
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				if ( getTaskStatus().equals("CHANGED") )
				{
					warningMessage(GNls.Fget(toStr("SOQOLIB-0274"), toStr("FORM"), toStr("Commit changes on form.")));
					throw new ApplicationException();
				}
				{
					NString errMsg= NString.getNull();
					SbGradapp.GradappRecRow gradappRec= null;
					UnknownTypes.SbGradappGradappRef gradappRef= null;
					NDate lvGraduationDate= NDate.getNull();
					NString lvAcyrCode= NString.getNull();
					NString lvTermCodeGrad= NString.getNull();
					NString lvGrstCode= NString.getNull();
					SbLearner.LearnerRecRow learnerRec= null;
					UnknownTypes.SbLearnerLearnerRef learnerRef= null;
					SbLearneroutcome.LearneroutcomeRecRow outcomeRec= null;
					UnknownTypes.SbLearneroutcomeLearneroutcomeRef outcomeRef= null;
					NString gappRowid= NString.getNull();
					NNumber alertButton= NNumber.getNull();
					NNumber newgapp= NNumber.getNull();
					try
					{
						if ( sorlcurElement.getSorlcurLmodCode().notEquals(SbCurriculumStr.fLearner()) )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0275"), toStr("FORM"), toStr("*ERROR* This functionality is available only on the learner curriculum."));
							throw new RollException();
						}
						if ( isNull(sorlcurElement.getSovlcurCurrentInd(), "N").notEquals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0276"), toStr("FORM"), toStr("*ERROR* This functionality is available only on current learner curriculum."));
							throw new RollException();
						}
						if ( SbLearnercurricstatus.fIsActive(sorlcurElement.getSorlcurCactCode()).notEquals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0277"), toStr("FORM"), toStr("*ERROR* This functionality is available only on current learner curriculum."));
							throw new RollException();
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						if ( !sorlcurElement.getLcurRolledKeySeqno().isNull() && SbLearneroutcomeRules.fDegreeAwarded(/*pPidm=>*/getFormModel().getSCurricula().getModulePidm(), /*pSeqNo=>*/sorlcurElement.getLcurRolledKeySeqno()).equals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0278"), toStr("FORM"), toStr("*ERROR* The learner outcome has been awarded, this functionality is not available."));
							throw new RollException();
						}
						if ( !sorlcurElement.getSorlcurGappSeqno().isNull() )
						{
							executeAction("save_keys");
							getContainer().getGoqrpls().gCheckFailure();
							setGlobal("GAPP_SEQNO", toStr(sorlcurElement.getSorlcurGappSeqno()));
							setGlobal("FORM_WAS_CALLED", toStr("Y"));
							setGlobal("SECRFRM", toStr("SHAGAPP"));
							executeAction("G$_REVOKE_ACCESS");
							getContainer().getGoqrpls().gCheckFailure();
							// F2J_TODO: Change global current_user01 to current_user
							getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), getGlobal("SECRFRM"), toStr(""));
							setGlobal("FORM_WAS_CALLED", toStr(""));
							executeAction("lcur_record_cnt");
							getContainer().getGoqrpls().gCheckFailure();
							setGlobal("GAPP_SEQNO", toStr(""));
							warningMessage(GNls.Fget(toStr("SOQOLIB-0279"), toStr("FORM"), toStr("Return from graduation application.")));
							return ;
						}
						//  show alert, the roll cannot be undone 
						alertButton = toNumber(showAlert("CURRICULUM_STOP_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
						else {
							warningMessage(GNls.Fget(toStr("SOQOLIB-0280"), toStr("FORM"), toStr("Creation of the graduation application was cancelled.")));
							return ;
							throw new ApplicationException();
						}
						// - send the grad info from first sorlcur; sgbstdn and if the lcur was rolled 
						// - send from the shrdgmr 
						if ( !sorlcurElement.getSorlcurExpGradDate().isNull() || !sorlcurElement.getSorlcurTermCodeGrad().isNull() || !sorlcurElement.getSorlcurAcyrCode().isNull() )
						{
							lvGraduationDate = sorlcurElement.getSorlcurExpGradDate();
							lvAcyrCode = sorlcurElement.getSorlcurAcyrCode();
							lvTermCodeGrad = sorlcurElement.getSorlcurTermCodeGrad();
							lvGrstCode = toStr(null);
						}
						else {
							if ( sorlcurElement.getSorlcurRolledSeqno().isNull() )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								learnerRef = SbLearner.fQueryOne(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCodeEff=>*/getFormModel().getSCurricula().getModuleTermCode());
								ResultSet learnerRefResults = learnerRef.fetchInto();
								if ( learnerRefResults != null ) {
									learnerRec =  new SbLearner.LearnerRecRow(learnerRefResults);
								}
								learnerRef.close();
								lvGraduationDate = learnerRec.RExpGradDate;
								lvAcyrCode = learnerRec.RAcyrCode;
								lvTermCodeGrad = learnerRec.RTermCodeGrad;
								lvGrstCode = toStr(null);
							}
							else {
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								outcomeRef = SbLearneroutcome.fQueryOne(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqNo=>*/sorlcurElement.getLcurRolledKeySeqno());
								ResultSet outcomeRefResults = outcomeRef.fetchInto();
								if ( outcomeRefResults != null ) {
									outcomeRec =  new SbLearneroutcome.LearneroutcomeRecRow(outcomeRefResults);
								}
								outcomeRef.close();
								lvGraduationDate = outcomeRec.RGradDate;
								lvAcyrCode = outcomeRec.RAcyrCode;
								lvTermCodeGrad = outcomeRec.RTermCodeGrad;
								lvGrstCode = outcomeRec.RGrstCode;
							}
						}
						// F2J_TODO: Change global current_user01 to current_user     
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						SbGradapp.pCreate(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), toNumber(/*pSeqno=>*/null), /*pRequestDate=>*/trunc(NDate.getNow()), /*pGastCode=>*/SbGradappStrings.fActive(), /*pGastDate=>*/NDate.getNow(), /*pUserId=>*/getGlobal("CURRENT_USER01"), toStr(/*pGadrCode=>*/null), /*pDgmrUpdGrstCode=>*/lvGrstCode, /*pGradDate=>*/lvGraduationDate, /*pGradTermCode=>*/lvTermCodeGrad, /*pGradAcyrCode=>*/lvAcyrCode, toStr(/*pGradAttendCde=>*/null), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pRowidOut=>*/gappRowid, toStr(/*pSeqnoOut=>*/newgapp));
						// - update the seqno on the lcur record 
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pGradappSeqno(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pUserId=>*/GbCommon.fSctUser(), /*pGappSeqno=>*/newgapp, /*pRowid=>*/sorlcurElement.getSovlcurRowid(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"));
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						commitTask();
						getContainer().getGoqrpls().gCheckFailure();
						// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
						executeAction("save_keys");
						getContainer().getGoqrpls().gCheckFailure();
						setGlobal("GAPP_SEQNO", toStr(newgapp));
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("SECRFRM", toStr("SHAGAPP"));
						executeAction("G$_REVOKE_ACCESS");
						getContainer().getGoqrpls().gCheckFailure();
						// F2J_TODO: Change global current_user01 to current_user
						getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), getGlobal("SECRFRM"), toStr(""));
						setGlobal("FORM_WAS_CALLED", toStr(""));
						executeAction("lcur_record_cnt");
						getContainer().getGoqrpls().gCheckFailure();
						setGlobal("GAPP_SEQNO", toStr(""));
						warningMessage(GNls.Fget(toStr("SOQOLIB-0281"), toStr("FORM"), toStr("Return from graduation application.")));
					}
					catch(RollException e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errMsg);
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						if ( errorCode().notEquals(0) )
						{
							getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
							throw new ApplicationException();
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ROLL_TO_OUTCOME_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ROLL_TO_OUTCOME_BTN")
		public void rollToOutcomeBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ROLL_TO_OUTCOME_BTN.WHEN-BUTTON-PRESSED
		 --- button to roll the learner curriculum to the outcome 
execute_trigger('query_only');
g$_check_failure;

declare 
	shbcgpa_rec  shbcgpa%ROWTYPE;
	cursor shbcgpa_c is 
	  select * from shbcgpa; 
	
	dgmr_seqno   shrdgmr.shrdgmr_seq_no%type;
	err_msg      varchar2(4000);
	
	gradapp_rec   sb_gradapp.gradapp_rec;
	gradapp_ref   sb_gradapp.gradapp_ref;
	
	lv_graduation_date    date  ;
  lv_acyr_code          stvacyr.stvacyr_code%type;
  lv_fee_ind            shrdgmr.shrdgmr_fee_ind%type ; 
  lv_term_code_grad     stvterm.stvterm_code%type ; 
  
  roll_exception        EXCEPTION;
  alert_button number;
 	
begin 
	if :sorlcur.sorlcur_lmod_code <> sb_curriculum_str.f_learner then 
	  err_msg := G$_NLS.Get('SOQOLIB-0282', 'FORM','*ERROR* This functionality is available only on the learner curriculum.') ;
		raise roll_exception;
	end if; 
	if :sorlcur.sorlcur_rolled_seqno is not null then 
	  err_msg := G$_NLS.Get('SOQOLIB-0283', 'FORM','*ERROR* This functionality is available only on unrolled learner curriculum.') ;
		raise roll_exception;
	end if;	
  if nvl(:sorlcur.sovlcur_current_ind,'N') <> 'Y'  then 
    err_msg := G$_NLS.Get('SOQOLIB-0284', 'FORM','*ERROR* This functionality is available only on current learner curriculum.') ;
		raise roll_exception;
  end if;	
  
  
  -- show alert, the roll cannot be undone 
  alert_button := show_alert('CURRICULUM_STOP_COMMIT_ALERT');
  if alert_button = ALERT_BUTTON1 then
       null;
  else 
  	message( G$_NLS.Get('SOQOLIB-0285', 'FORM','The manual roll process was cancelled.') );
  	return;
		raise form_trigger_failure;
  end if;
  
  open shbcgpa_c;
  fetch shbcgpa_c into shbcgpa_rec;
  close shbcgpa_c; 
  
  if :sorlcur.sorlcur_gapp_seqno is not null then 
  	gradapp_ref := sb_gradapp.f_query_one(p_pidm => :sorlcur.sorlcur_pidm,
  	              p_seqno => :sorlcur.sorlcur_gapp_seqno); 
  	fetch gradapp_ref into gradapp_rec;
  	if gradapp_ref%found then 
  		 lv_graduation_date := gradapp_rec.r_grad_date;
  		 lv_acyr_code := gradapp_rec.r_grad_acyr_code; 
  		 lv_term_code_grad := gradapp_rec.r_grad_term_code;
    end if; 
  	close gradapp_ref; 
  	
  else 
  		 lv_graduation_date := :sorlcur.sorlcur_exp_grad_date;
  		 lv_acyr_code := :sorlcur.sorlcur_acyr_code; 
  		 lv_term_code_grad := :sorlcur.sorlcur_term_code_grad;
  end if; 
  
  shkrols.p_roll_manual_degree  
     (    p_pidm             => :sorlcur.sorlcur_pidm,
          P_term_code        => :sorlcur.sorlcur_term_code, 
          P_lcur_seqno       => :sorlcur.sorlcur_seqno,  
          p_term_code_eff    => :s$_curricula.module_term_code,
          p_current_ind      => :sorlcur.sovlcur_current_ind,
          p_user_id          => gb_common.f_sct_user, 
          P_award_courses    => nvl(shbcgpa_rec.SHBCGPA_AWARD_PREV_IND,'N') , 
          P_graduation_date  => lv_graduation_date,    
          P_acyr_code        => lv_acyr_code,        
          P_fee_ind          => lv_fee_ind,    
          p_roll_ind         => 'Y',         
          P_term_code_grad   => lv_term_code_grad,  
          P_degree_seqno   => dgmr_seqno,
          p_err_msg       =>  err_msg); 
  
  if err_msg is not null then 
  	 raise roll_exception;
  end if;         
           
  if dgmr_seqno is not null then 
     message( G$_NLS.Get('SOQOLIB-0286', 'FORM','The curriculum has been rolled to degree %01%',dgmr_seqno)); 
  else 
  	 message( G$_NLS.Get('SOQOLIB-0287', 'FORM','The curriculum was not rolled.')); 
  end if;  
  commit_form; 
  g$_check_failure;
  
  execute_trigger('lcur_record_cnt');
  g$_check_failure;
  
          
EXCEPTION
 WHEN ROLL_EXCEPTION THEN
   G$_DISPLAY_ERR_MSG(err_msg);
   RAISE FORM_TRIGGER_FAILURE;
 WHEN OTHERS THEN
   if sqlcode <> 0   then 
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE;
   end if; 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ROLL_TO_OUTCOME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ROLL_TO_OUTCOME_BTN")
		public void rollToOutcomeBtn_buttonClick()
		{
			
				// - button to roll the learner curriculum to the outcome 

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				int rowCount = 0;
				// - button to roll the learner curriculum to the outcome 
				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				{
					ShbcgpaRow shbcgpaRec= null;
					String sqlshbcgpaC = "SELECT * " +
	" FROM shbcgpa ";
					DataCursor shbcgpaC = new DataCursor(sqlshbcgpaC);
					NNumber dgmrSeqno= NNumber.getNull();
					NString errMsg= NString.getNull();
					SbGradapp.GradappRecRow gradappRec= null;
					UnknownTypes.SbGradappGradappRef gradappRef= null;
					NDate lvGraduationDate= NDate.getNull();
					NString lvAcyrCode= NString.getNull();
					NString lvFeeInd= NString.getNull();
					NString lvTermCodeGrad= NString.getNull();
					NNumber alertButton= NNumber.getNull();
					try
					{
						if ( sorlcurElement.getSorlcurLmodCode().notEquals(SbCurriculumStr.fLearner()) )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0282"), toStr("FORM"), toStr("*ERROR* This functionality is available only on the learner curriculum."));
							throw new RollException();
						}
						if ( !sorlcurElement.getSorlcurRolledSeqno().isNull() )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0283"), toStr("FORM"), toStr("*ERROR* This functionality is available only on unrolled learner curriculum."));
							throw new RollException();
						}
						if ( isNull(sorlcurElement.getSovlcurCurrentInd(), "N").notEquals("Y") )
						{
							errMsg = GNls.Fget(toStr("SOQOLIB-0284"), toStr("FORM"), toStr("*ERROR* This functionality is available only on current learner curriculum."));
							throw new RollException();
						}
						//  show alert, the roll cannot be undone 
						alertButton = toNumber(showAlert("CURRICULUM_STOP_COMMIT_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
						}
						else {
							warningMessage(GNls.Fget(toStr("SOQOLIB-0285"), toStr("FORM"), toStr("The manual roll process was cancelled.")));
							return ;
							throw new ApplicationException();
						}
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable shbcgpaC.
						shbcgpaC.open();
						shbcgpaRec = shbcgpaC.fetchRow();
						shbcgpaC.close();
						if ( !sorlcurElement.getSorlcurGappSeqno().isNull() )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							gradappRef = SbGradapp.fQueryOne(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pSeqno=>*/sorlcurElement.getSorlcurGappSeqno());
							ResultSet gradappRefResults = gradappRef.fetchInto();
							if ( gradappRefResults != null ) {
								gradappRec =  new SbGradapp.GradappRecRow(gradappRefResults);
							}
							if ( gradappRef.found() )
							{
								lvGraduationDate = gradappRec.RGradDate;
								lvAcyrCode = gradappRec.RGradAcyrCode;
								lvTermCodeGrad = gradappRec.RGradTermCode;
							}
							gradappRef.close();
						}
						else {
							lvGraduationDate = sorlcurElement.getSorlcurExpGradDate();
							lvAcyrCode = sorlcurElement.getSorlcurAcyrCode();
							lvTermCodeGrad = sorlcurElement.getSorlcurTermCodeGrad();
						}
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Shkrols.pRollManualDegree(/*pPidm=>*/sorlcurElement.getSorlcurPidm(), /*pTermCode=>*/sorlcurElement.getSorlcurTermCode(), /*pLcurSeqno=>*/sorlcurElement.getSorlcurSeqno(), /*pTermCodeEff=>*/getFormModel().getSCurricula().getModuleTermCode(), /*pCurrentInd=>*/sorlcurElement.getSovlcurCurrentInd(), /*pUserId=>*/GbCommon.fSctUser(), /*pAwardCourses=>*/isNull(shbcgpaRec.ShbcgpaAwardPrevInd, "N"), toStr(/*pGraduationDate=>*/lvGraduationDate), toDate(/*pAcyrCode=>*/lvAcyrCode), /*pFeeInd=>*/lvFeeInd, /*pRollInd=>*/"Y", toDate(/*pTermCodeGrad=>*/lvTermCodeGrad), toStr(/*pDegreeSeqno=>*/dgmrSeqno), toDate(/*pErrMsg=>*/errMsg));
						if ( !errMsg.isNull() )
						{
							throw new RollException();
						}
						if ( !dgmrSeqno.isNull() )
						{
							warningMessage(GNls.Fget(toStr("SOQOLIB-0286"), toStr("FORM"), toStr("The curriculum has been rolled to degree %01%"), toStr(dgmrSeqno)));
						}
						else {
							errorMessage(GNls.Fget(toStr("SOQOLIB-0287"), toStr("FORM"), toStr("The curriculum was not rolled.")));
						}
						commitTask();
						getContainer().getGoqrpls().gCheckFailure();
						executeAction("lcur_record_cnt");
						getContainer().getGoqrpls().gCheckFailure();
					}
					catch(RollException e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errMsg);
						throw new ApplicationException();
					}
					catch(Exception  e)
					{
						if ( errorCode().notEquals(0) )
						{
							getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
							throw new ApplicationException();
						}
					}
				}
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
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurKeySeqno_PostChange();

			}

		
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
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurTermCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_START_DATE")
		public void sorlcurStartDate_validate()
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurStartDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_END_DATE")
		public void sorlcurEndDate_validate()
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurEndDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_FROM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_LEAV_FROM_DATE")
		public void sorlcurLeavFromDate_validate()
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurLeavFromDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_LEAV_TO_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SORLCUR_LEAV_TO_DATE")
		public void sorlcurLeavToDate_validate()
		{
			
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
							this.sorlcurLeavToDate_PostChange();

			}

		
	
	
}

