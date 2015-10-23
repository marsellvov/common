package net.hedtech.banner.general.common.Goaintl.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Goaintl.model.*;
import net.hedtech.banner.general.common.Goaintl.*;
import net.hedtech.banner.general.common.Goaintl.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.services.OracleMessagesLevel;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GorvisaController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	


	
	public GorvisaController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoaintlTask getTask() {
		return (GoaintlTask)super.getTask();
	}

	public GoaintlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-NXTBLK
		 
if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0052', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
:system.message_level := 5;
go_block('gordocm');
execute_query;
:system.message_level := 0;
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gorvisa_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0052"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				try{
					// 
					this.getTask().setValidationEnabled(false);
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					goBlock(toStr("gordocm"));
					executeQuery();
				} finally {
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
					this.getTask().setValidationEnabled(true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-PRVBLK
		 if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0053', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_block('gobintl');
go_item('GOBINTL_NATN_CODE_BIRTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gorvisa_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0053"), toStr("FORM"), toStr("*ERROR* Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("gobintl"));
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEYNXTREC
		 :system.message_level := 5;
next_record;
if :gorvisa_seq_no is null then
	  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
	 :seqno := :system.trigger_record;
	  go_block('gordocm');
	  clear_block;
	  go_block('gorvisa');
	  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
else
    go_block('gordocm');
    clear_record;
    execute_query;
    go_block('gorvisa');
end if;
:system.message_level := 0;	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEYNXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYNXTREC")
		public void gorvisa_Keynxtrec()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					nextRecord();
					if ( gorvisaElement.getGorvisaSeqNo().isNull() )
					{
						try {
							this.getTask().setValidationEnabled(false);
							gorvisaElement.setSeqno(toNumber(getTriggerRecord()));
							goBlock(toStr("gordocm"));
							clearBlock();
							goBlock(toStr("gorvisa"));
						} finally {
							this.getTask().setValidationEnabled(true);
						}
					}
					else {
						goBlock(toStr("gordocm"));
						clearRecord();
						executeQuery();
						goBlock(toStr("gorvisa"));
					}
				}
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-NXTREC
		 
if :system.record_status <> 'QUERY' then
	  message( G$_NLS.Get('GOAINTL-0054', 'FORM','Please Enter/Save Visa Information before Creating Another Record') );
	  raise form_trigger_failure;
end if;
--	  
:system.message_level := 5;
next_record;
if :gorvisa_seq_no is null then
	  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
	 :seqno := :system.trigger_record;
	  go_block('gordocm');
	  clear_block;
	  go_block('gorvisa');
	  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
else
    go_block('gordocm');
    clear_record;
    execute_query;
    go_block('gorvisa');
end if;
:system.message_level := 0;	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gorvisa_NextRecord()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( !getRecordStatus().equals("QUERY") )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0054"), toStr("FORM"), toStr("*ERROR* Please Enter/Save Visa Information before Creating Another Record")));
						throw new ApplicationException();
					}
					// 	  
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					nextRecord();
					if ( gorvisaElement.getGorvisaSeqNo().isNull() )
					{
						try{
							this.getTask().setValidationEnabled(false);
							gorvisaElement.setSeqno(toNumber(getTriggerRecord()));
							goBlock(toStr("gordocm"));
							clearBlock();
							goBlock(toStr("gorvisa"));
						} finally {
							this.getTask().setValidationEnabled(true);
						}
					}
					else {
						goBlock(toStr("gordocm"));
						clearRecord();
						executeQuery();
						goBlock(toStr("gorvisa"));
					}
				}
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-PRVREC
		 if :system.trigger_record = '1' then
	  message( G$_NLS.Get('GOAINTL-0055', 'FORM','First Record Reached') );
	  return;
end if;
--
if :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0056', 'FORM','Please Enter/Save Visa Information before Creating Another Record') );
	  raise form_trigger_failure;
end if;
--	  
:system.message_level := 5;
previous_record;
:seqno := :gorvisa_seq_no;
go_block('gordocm');
clear_record;
execute_query;
go_block('gorvisa');
:system.message_level := 0;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gorvisa_PreviousRecord()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					//if ( getTriggerRecord().equals("1") )
					if(isInFirstRecord())
					{
						infoMessage(GNls.Fget(toStr("GOAINTL-0055"), toStr("FORM"), toStr("First Record Reached")));
						return ;
					}
					// 
					if ( getBlockStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0056"), toStr("FORM"), toStr("*ERROR* Please Enter/Save Visa Information before Creating Another Record")));
						throw new ApplicationException();
					}
					// 	  
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					previousRecord();
					gorvisaElement.setSeqno(gorvisaElement.getGorvisaSeqNo());
					goBlock(toStr("gordocm"));
					clearRecord();
					executeQuery();
					goBlock(toStr("gorvisa"));
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
			}
		}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-DELREC
		 declare
		Alert_Info_ID            ALERT           := FIND_ALERT( 'G$_INFO_ALERT'  ) ;
    Alert_Result             NUMBER ;
begin
if Check_GORVISA_DELETE (:gorvisa.gorvisa_Pidm,:gorvisa.gorvisa_seq_no) then
		SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT,  G$_NLS.Get('GOAINTL-0057', 'FORM','Please delete document information before deleting Visa information.')   ) ;        	
		Alert_Result := SHOW_ALERT ( Alert_Info_ID ) ;
	  raise form_trigger_failure; 
else
	:form_action := 'DELETE';
	delete_Record;
end if;
end;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gorvisa_DeleteRecord()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					AlertDescriptor alertInfoId = findAlert("G$_INFO_ALERT");
					NNumber alertResult= NNumber.getNull();
					if ( this.getTask().getServices().checkGorvisaDelete(gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() )
					{
						setAlertMessageText(alertInfoId, GNls.Fget(toStr("GOAINTL-0057"), toStr("FORM"), toStr("Please delete document information before deleting Visa information.")));
						alertResult = toNumber(showAlert(alertInfoId));
						throw new ApplicationException();
					}
					else {
						getFormModel().getFormHeader().setFormAction(toStr("DELETE"));
						deleteRecord();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.PRE-UPDATE
		 --execute_trigger('check_visa_dates_1');
--g$_check_failure;
--
:form_action := 'UPDATE';
:gorvisa_user_id := user;
:gorvisa_activity_date := sysdate;

-- 71-2 remove duplicate execution of date checking; Key-Commit handles these tests.
--execute_trigger('check_visa_dates_c');
--g$_check_failure;
--
execute_trigger('check_gorvisa_c');
g$_check_failure;
 
execute_trigger('VALIDATE_ENTRY_IND');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gorvisa_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// execute_trigger('check_visa_dates_1');
				// g$_check_failure;
				// 
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)args.getRow();


				// execute_trigger('check_visa_dates_1');
				// g$_check_failure;
				// 
				getFormModel().getFormHeader().setFormAction(toStr("UPDATE"));
				gorvisaElement.setGorvisaUserId(getUser());
				gorvisaElement.setGorvisaActivityDate(NDate.getNow());
				//  71-2 remove duplicate execution of date checking; Key-Commit handles these tests.
				// execute_trigger('check_visa_dates_c');
				// g$_check_failure;
				// 
				executeAction("check_gorvisa_c");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("VALIDATE_ENTRY_IND");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.PRE-INSERT
		 --execute_trigger('check_visa_dates_1');
--g$_check_failure;
--
:form_action := 'INSERT';
:gorvisa_user_id := user;
:gorvisa_activity_date := sysdate;

if not isVisaRecords then
	:seqno := 1;
end if;
--
:gorvisa_seq_no := :seqno;


-- 71-2 remove duplicate execution of date checking; Key-Commit handles these tests.
--execute_trigger('check_visa_dates_c');
--g$_check_failure;
--
execute_trigger('check_gorvisa_c');
g$_check_failure;

execute_trigger('VALIDATE_ENTRY_IND');
g$_check_failure;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gorvisa_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// execute_trigger('check_visa_dates_1');
				// g$_check_failure;
				// 
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)args.getRow();


				// execute_trigger('check_visa_dates_1');
				// g$_check_failure;
				// 
				getFormModel().getFormHeader().setFormAction(toStr("INSERT"));
				gorvisaElement.setGorvisaUserId(getUser());
				gorvisaElement.setGorvisaActivityDate(NDate.getNow());
				if ( this.getTask().getServices().isvisarecords(gorvisaElement).not() )
				{
					gorvisaElement.setSeqno(toNumber(1));
				}
				// 
				gorvisaElement.setGorvisaSeqNo(gorvisaElement.getSeqno());
				//  71-2 remove duplicate execution of date checking; Key-Commit handles these tests.
				// execute_trigger('check_visa_dates_c');
				// g$_check_failure;
				// 
				executeAction("check_gorvisa_c");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("VALIDATE_ENTRY_IND");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.POST-INSERT
		 execute_trigger('get_max_seqno');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void gorvisa_AfterRowInsert(RowAdapterEvent args)
		{
			
				executeAction("get_max_seqno");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.PRE-BLOCK
		 
execute_trigger('get_max_seqno');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gorvisa_blockIn()
		{
			
				executeAction("get_max_seqno");
				getTask().getGoqrpls().gCheckFailure();				
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-CREREC
		 --message('key-crerec system.record_status ==> ' || :system.record_status);
--pause;

if :system.record_status <> 'QUERY' then
	  message( G$_NLS.Get('GOAINTL-0058', 'FORM','Please Enter/Save Visa Information before Creating Another Record') );
	  raise form_trigger_failure;
end if;
--
--if :system.trigger_record = '1' and :max_seqno > 2 then
--	  next_record;
--end if;
--
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
go_block('gordocm');
clear_block;
go_block('gorvisa');
create_record;
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gorvisa_CreateRecord()
		{
			
				// message('key-crerec system.record_status ==> ' || :system.record_status);
				// pause;
				// message('key-crerec system.record_status ==> ' || :system.record_status);
				// pause;
				if ( !getRecordStatus().equals("QUERY") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0058"), toStr("FORM"), toStr("*ERROR* Please Enter/Save Visa Information before Creating Another Record")));
					throw new ApplicationException();
				}
				// 
				// if :system.trigger_record = '1' and :max_seqno > 2 then
				// 	  next_record;
				// end if;
				// 
				try{
					this.getTask().setValidationEnabled(false);
					goBlock(toStr("gordocm"));
					getTask().getNavigationModel().doNavigation();
					clearBlock();
					goBlock(toStr("gorvisa"));
					getTask().getNavigationModel().doNavigation();
					createRecord();
				} finally {
					this.getTask().setValidationEnabled(true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-EXIT
		 
--execute_trigger('ASSIGN_GORVISA_VALUES'); 
execute_trigger('check_gordocm');
g$_check_failure;
exit_form;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gorvisa_Exit()
		{
			
				// execute_trigger('ASSIGN_GORVISA_VALUES'); 
				// execute_trigger('ASSIGN_GORVISA_VALUES'); 
				executeAction("check_gordocm");
				getTask().getGoqrpls().gCheckFailure();
				exitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-EXEQRY
		 declare recno number := 1;
begin
	execute_query;
	g$_check_failure;
	execute_trigger('get_record_number');
  g$_check_failure;
--  if :record_number > 0 then 
	go_record(recno);
  while :gorvisa_visa_start_date > sysdate and recno < :record_number loop
  	     recno := recno + 1;
  	     go_record(recno);
  end loop;
--  end if; --82380
end;       
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gorvisa_ExecuteQuery()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)

				{
					NNumber recno = toNumber(1);
					executeQuery();
					getTask().getGoqrpls().gCheckFailure();
					executeAction("get_record_number");
					getTask().getGoqrpls().gCheckFailure();
					//   if :record_number > 0 then 
					setCurrentRecord(recno);
					while ( gorvisaElement.getGorvisaVisaStartDate().greater(NDate.getNow()) && recno.lesser(getFormModel().getFormHeader().getRecordNumber()) ) {
						recno = recno.add(1);
						setCurrentRecord(recno);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.WHEN-NEW-RECORD-INSTANCE
		 declare 
	tmp number := :system.cursor_record;
  Alert_Info_ID            ALERT           := FIND_ALERT( 'G$_WARNING_ALERT'  ) ;
  Alert_Result             NUMBER ;

begin
	
  --IF NAME_IN('SYSTEM.MODE')<> 'ENTER-QUERY' THEN
  	IF :SYSTEM.BLOCK_STATUS <> 'NEW' THEN
    BEGIN
      if :system.block_status = 'CHANGED' then
	      go_record(tmp);
      else
--
        execute_trigger('get_max_seqno');
        if :gorvisa_vtyp_code is null then
          :seqno := :max_seqno;
        end if;
        :system.message_level := 5;
        if :gorvisa_seq_no is null then
          SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
 		      :seqno := :max_seqno;
          if check_null_dates (:GORVISA.GORVISA_PIDM, :SEQNO) then
 	      	 -- delete_record;
 	      	 	 					SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT,  G$_NLS.Get('GOAINTL-0059', 'FORM','Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.')   ) ;        	
						Alert_Result := SHOW_ALERT ( Alert_Info_ID ) ;
	-- 					raise form_trigger_failure;
          end if;
          go_block('gordocm');
          clear_record;
          go_block('gorvisa');
          SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
        else
          go_block('gordocm');
          clear_record;
          execute_query;
          go_block('gorvisa');
        end if;
        :system.message_level := 0;
      end if;
    END;
  END IF;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void gorvisa_recordChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)

				{
					NNumber tmp = toNumber(getCursorRecord());
					AlertDescriptor alertInfoId = findAlert("G$_WARNING_ALERT");
					NNumber alertResult= NNumber.getNull();
					// IF NAME_IN('SYSTEM.MODE')<> 'ENTER-QUERY' THEN
					if ( !getBlockStatus().equals("NEW") )
					{
						if ( getBlockStatus().equals("CHANGED") )
						{
							setCurrentRecord(tmp);
						}
						else {
							// 
							executeAction("get_max_seqno");
							if ( gorvisaElement.getGorvisaVtypCode().isNull() )
							{
								gorvisaElement.setSeqno(getFormModel().getFormHeader().getMaxSeqno());
							}
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
							if ( gorvisaElement.getGorvisaSeqNo().isNull() )
							{
								try{
								
									this.getTask().setValidationEnabled(false);
									gorvisaElement.setSeqno(getFormModel().getFormHeader().getMaxSeqno());
									if ( this.getTask().getServices().checkNullDates(gorvisaElement.getGorvisaPidm(), gorvisaElement.getSeqno()).getValue() )
									{
										//  delete_record;
										setAlertMessageText(alertInfoId, GNls.Fget(toStr("GOAINTL-0059"), toStr("FORM"), toStr("Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.")));
										alertResult = toNumber(showAlert(alertInfoId));
									}
									goBlock(toStr("gordocm"));
									doNavigation();
									clearRecord();
									doNavigation();
									goBlock(toStr("gorvisa"));
									doNavigation();
								} finally {
									this.getTask().setValidationEnabled(true);
								}
							}
							else {
								goBlock(toStr("gordocm"));
								doNavigation();
								clearRecord();
								doNavigation();
								executeQuery();
								doNavigation();
								goBlock(toStr("gorvisa"));
								doNavigation();
							}
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.POST-QUERY
		 :seqno := :gorvisa_seq_no;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gorvisa_AfterQuery(RowAdapterEvent args)
		{

			GorvisaAdapter gorvisaElement = (GorvisaAdapter) args.getRow();
	
			try {
				gorvisaElement.setLockDbValues(true);
                                 try {  
                                this.gorvisaVtypCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gorvisaNatnCodeIssue_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gorvisaVissCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gorvisaPentCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gorvisaVisaReqDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gorvisaVisaIssueDate_PostChange(); 
                                } catch(Exception ex) { 
                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
	
			} finally {
				gorvisaElement.setLockDbValues(false);
			}
			gorvisaElement.setSeqno(gorvisaElement.getGorvisaSeqNo());
		}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-COMMIT
		 IF :form_action = 'DELETE' then
	commit_form;
ELSE
  execute_trigger('check_visa_dates');
  g$_check_failure;
--
  execute_trigger('check_gorvisa');
  g$_check_failure;
  execute_trigger('commit_gorvisa');
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gorvisa_Save()
		{
			
				if ( getFormModel().getFormHeader().getFormAction().equals("DELETE") )
				{
					commitTask();
				}
				else {
					executeAction("check_visa_dates");
					getTask().getGoqrpls().gCheckFailure();
					// 
					executeAction("check_gorvisa");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("commit_gorvisa");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.POST-BLOCK
		 --message('post-block system.current_block ==> ' || :system.current_block || ' system.cursor_block ==> ' || :system.cursor_block || ' system.trigger_block ==> ' || :system.trigger_block);
--pause;
:error_item := '';
:previous_block := '';
--if :system.block_status = 'CHANGED' then
--	  message('Please Save Information before Leaving Current Block.');
--	  raise form_trigger_failure;
--end if;
<multilinecomment>
message ('Status is ..'||:system.block_status);
if :system.block_status = 'CHANGED' then
	  message('Please Save Information before Leaving Current Block.');
	  raise form_trigger_failure;
end if;
--
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
:system.message_level := 5;
go_block('gordocm');
execute_query;
:system.message_level := 0;
SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gorvisa_blockOut()
		{
			// message('post-block system.current_block ==> ' || :system.current_block || ' system.cursor_block ==> ' || :system.cursor_block || ' system.trigger_block ==> ' || :system.trigger_block);
			// pause;
			// message('post-block system.current_block ==> ' || :system.current_block || ' system.cursor_block ==> ' || :system.cursor_block || ' system.trigger_block ==> ' || :system.trigger_block);
			// pause;
			getFormModel().getFormHeader().setErrorItem(toStr(""));
			getFormModel().getFormHeader().setPreviousBlock(toStr(""));
				
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.KEY-ENTQRY
		 begin
  go_block('gordocm');
  clear_block;
  go_block('gorvisa');
  clear_block;
  enter_query;
  g$_check_failure;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gorvisa_Search()
		{
			
				goBlock(toStr("gordocm"));
				clearBlock();
				goBlock(toStr("gorvisa"));
				clearBlock();
				enterQuery();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.PRE-QUERY
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeQuery
		
		
		public void gorvisa_BeforeQuery(QueryEvent args)
		{
			setBlockWhereClause("GORVISA", toStr("(GORVISA_PIDM=:PIDM)"));
			
			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));
		}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.ON-DELETE
		 --
-- ON-DELETE Trigger
--
BEGIN
 gb_visa.p_delete(
     p_pidm                   =>:gorvisa.gorvisa_pidm,
     p_seq_no                 =>:gorvisa.gorvisa_seq_no,
     p_vtyp_code              =>:gorvisa.gorvisa_vtyp_code,
     p_rowid                  =>:gorvisa.rowid);
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
		 * GORVISA.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void gorvisa_RowDelete(RowAdapterEvent args)
		{
			
				// 
				//  ON-DELETE Trigger
				// 
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)args.getRow();


				try
				{
					
					GbVisa.pDelete(/*pPidm=>*/gorvisaElement.getGorvisaPidm(), /*pSeqNo=>*/gorvisaElement.getGorvisaSeqNo(), /*pVtypCode=>*/gorvisaElement.getGorvisaVtypCode(), /*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(gorvisaElement.getROWID())));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.ON-INSERT
		 --
-- ON-INSERT Trigger
--
BEGIN
  gb_visa.p_create(
     p_pidm                   =>:gorvisa.gorvisa_pidm,
     p_seq_no_inout           =>:gorvisa.gorvisa_seq_no,
     p_vtyp_code              =>:gorvisa.gorvisa_vtyp_code,
     p_visa_number            =>:gorvisa_visa_number,
     p_natn_code_issue        =>:gorvisa.gorvisa_natn_code_issue,
     p_viss_code              =>:gorvisa.gorvisa_viss_code,
     p_visa_start_date        =>:gorvisa.gorvisa_visa_start_date,
     p_visa_expire_date       =>:gorvisa.gorvisa_visa_expire_date,
     p_entry_ind              =>:gorvisa.gorvisa_entry_ind,
     p_user_id                =>:gorvisa.gorvisa_user_id,
     p_visa_req_date          =>:gorvisa.gorvisa_visa_req_date,
     p_visa_issue_date        =>:gorvisa.gorvisa_visa_issue_date,
     p_pent_code              =>:gorvisa.gorvisa_pent_code,
     p_no_entries             =>:gorvisa.gorvisa_no_entries,
     p_data_origin            =>:global.data_origin,
     p_rowid_out              =>:gorvisa.rowid);
--
  :GORVISA.GORVISA_ACTIVITY_DATE :=
     TO_DATE(G$_RESYNCH_RECORD(:GORVISA.ROWID),'DDMONYYYYHH24MISS');
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
		 * GORVISA.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void gorvisa_RowInsert(RowAdapterEvent args)
		{
			
				// 
				//  ON-INSERT Trigger
				// 
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)args.getRow();


				try
				{					
					Ref<NNumber> p_seq_no_inout_ref = new Ref<NNumber>(gorvisaElement.getGorvisaSeqNo());
//					Ref<NString> p_rowid_out_ref = new Ref<NString>(toStr(gorvisaElement.getROWID()));
					Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
					GbVisa.pCreate(/*pPidm=>*/gorvisaElement.getGorvisaPidm(), p_seq_no_inout_ref, /*pVtypCode=>*/gorvisaElement.getGorvisaVtypCode(), /*pVisaNumber=>*/gorvisaElement.getGorvisaVisaNumber(), /*pNatnCodeIssue=>*/gorvisaElement.getGorvisaNatnCodeIssue(), /*pVissCode=>*/gorvisaElement.getGorvisaVissCode(), /*pVisaStartDate=>*/gorvisaElement.getGorvisaVisaStartDate(), /*pVisaExpireDate=>*/gorvisaElement.getGorvisaVisaExpireDate(), /*pEntryInd=>*/gorvisaElement.getGorvisaEntryInd(), /*pUserId=>*/gorvisaElement.getGorvisaUserId(), /*pVisaReqDate=>*/gorvisaElement.getGorvisaVisaReqDate(), /*pVisaIssueDate=>*/gorvisaElement.getGorvisaVisaIssueDate(), /*pPentCode=>*/gorvisaElement.getGorvisaPentCode(), /*pNoEntries=>*/gorvisaElement.getGorvisaNoEntries(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), p_rowid_out_ref);
					gorvisaElement.setGorvisaSeqNo(p_seq_no_inout_ref.val);
					gorvisaElement.setROWID(p_rowid_out_ref.val);
					// 
					gorvisaElement.setGorvisaActivityDate(toDate(getTask().getGoqrpls().gResynchRecord(gorvisaElement.getROWID()), "DDMONYYYYHH24MISS"));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.ON-UPDATE
		 --
-- ON-UPDATE Trigger
--
BEGIN

   gb_visa.p_update(
     p_pidm                   =>:gorvisa.gorvisa_pidm,
     p_seq_no                 =>:gorvisa.gorvisa_seq_no,
     p_vtyp_code              =>:gorvisa.gorvisa_vtyp_code,
     p_visa_number            =>:gorvisa_visa_number,
     p_natn_code_issue        =>:gorvisa.gorvisa_natn_code_issue,
     p_viss_code              =>:gorvisa.gorvisa_viss_code,
     p_visa_start_date        =>:gorvisa.gorvisa_visa_start_date,
     p_visa_expire_date       =>:gorvisa.gorvisa_visa_expire_date,
     p_entry_ind              =>:gorvisa.gorvisa_entry_ind,
     p_user_id                =>:global.current_user,
     p_visa_req_date          =>:gorvisa.gorvisa_visa_req_date,
     p_visa_issue_date        =>:gorvisa.gorvisa_visa_issue_date,
     p_pent_code              =>:gorvisa.gorvisa_pent_code,
     p_no_entries             =>:gorvisa.gorvisa_no_entries,
     p_data_origin            =>:global.data_origin,
     p_rowid                  =>:gorvisa.rowid);
--
  :GORVISA.GORVISA_ACTIVITY_DATE :=
     TO_DATE(G$_RESYNCH_RECORD(:GORVISA.ROWID),'DDMONYYYYHH24MISS');
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
		 * GORVISA.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void gorvisa_RowUpdate(RowAdapterEvent args)
		{
			
				// 
				//  ON-UPDATE Trigger
				// 
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)args.getRow();


				try
				{
					GbVisa.pUpdate(/*pPidm=>*/gorvisaElement.getGorvisaPidm(), /*pSeqNo=>*/gorvisaElement.getGorvisaSeqNo(), /*pVtypCode=>*/gorvisaElement.getGorvisaVtypCode(), /*pVisaNumber=>*/gorvisaElement.getGorvisaVisaNumber(), /*pNatnCodeIssue=>*/gorvisaElement.getGorvisaNatnCodeIssue(), /*pVissCode=>*/gorvisaElement.getGorvisaVissCode(), /*pVisaStartDate=>*/gorvisaElement.getGorvisaVisaStartDate(), /*pVisaExpireDate=>*/gorvisaElement.getGorvisaVisaExpireDate(), /*pEntryInd=>*/gorvisaElement.getGorvisaEntryInd(), /*pUserId=>*/getGlobal("CURRENT_USER"), /*pVisaReqDate=>*/gorvisaElement.getGorvisaVisaReqDate(), /*pVisaIssueDate=>*/gorvisaElement.getGorvisaVisaIssueDate(), /*pPentCode=>*/gorvisaElement.getGorvisaPentCode(), /*pNoEntries=>*/gorvisaElement.getGorvisaNoEntries(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(gorvisaElement.getROWID())));
					gorvisaElement.setGorvisaActivityDate(toDate(getTask().getGoqrpls().gResynchRecord(gorvisaElement.getROWID()), "DDMONYYYYHH24MISS"));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA.VALIDATE_ENTRY_IND
		 if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0060', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  raise form_trigger_failure;
    else
     if :gorvisa_no_entries<> 'S' and :gorvisa_no_entries<> 'M' then
    	 if substr(:gorvisa_no_entries,1,1) > '9' or substr(:gorvisa_no_entries,1,1) < '0'
    	 or substr(:gorvisa_no_entries,2,1) > '9' or substr(:gorvisa_no_entries,2,1) < '0' then
    	 	   message( G$_NLS.Get('GOAINTL-0061', 'FORM','M, S, or Number(1-99) Only when Entry Indicator is Checked') );
    	 	   raise form_trigger_failure;
    	 end if;
    	 --
    	 if :gorvisa_no_entries = '00' or :gorvisa_no_entries = '0' then
    	 	   message( G$_NLS.Get('GOAINTL-0062', 'FORM','M, S, or Number(1-99) Only when Entry Indicator is Checked') );
    	     raise form_trigger_failure;
       end if;
     end if;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0063', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  raise form_trigger_failure;
    end if;
end if;
--
if substr(:gorvisa_no_entries,1,1) = '0' then
	:gorvisa_no_entries := substr(:gorvisa_no_entries,2,1);
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA.VALIDATE_ENTRY_IND
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="VALIDATE_ENTRY_IND")
		public void gorvisa_ValidateEntryInd()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
					{
						if ( gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0060"), toStr("FORM"), toStr("*ERROR* Number of Entries is Required When Entry Indicator is Checked")));
							throw new ApplicationException();
						}
						else {
							if ( gorvisaElement.getGorvisaNoEntries().notEquals("S") && gorvisaElement.getGorvisaNoEntries().notEquals("M") )
							{
								if ( substring(gorvisaElement.getGorvisaNoEntries(), toInt(1), toInt(1)).greater("9") || substring(gorvisaElement.getGorvisaNoEntries(), toInt(1), toInt(1)).lesser("0") || substring(gorvisaElement.getGorvisaNoEntries(), toInt(2), toInt(1)).greater("9") || substring(gorvisaElement.getGorvisaNoEntries(), toInt(2), toInt(1)).lesser("0") )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0061"), toStr("FORM"), toStr("*ERROR* M, S, or Number(1-99) Only when Entry Indicator is Checked")));
									throw new ApplicationException();
								}
								// 
								if ( gorvisaElement.getGorvisaNoEntries().equals("00") || gorvisaElement.getGorvisaNoEntries().equals("0") )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0062"), toStr("FORM"), toStr("*ERROR* M, S, or Number(1-99) Only when Entry Indicator is Checked")));
									throw new ApplicationException();
								}
							}
						}
					}
					else {
						if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0063"), toStr("FORM"), toStr("*ERROR* Number of Entries Must be Null When Entry Indicator is Not Checked")));
							throw new ApplicationException();
						}
					}
					// 
					if ( substring(gorvisaElement.getGorvisaNoEntries(), toInt(1), toInt(1)).equals("0") )
					{
						gorvisaElement.setGorvisaNoEntries(substring(gorvisaElement.getGorvisaNoEntries(), toInt(2), toInt(1)));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORVISA_VTYP_CODE")
		public void gorvisaVtypCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVtypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORVISA_VTYP_CODE")
		public void gorvisaVtypCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORVISA_VTYP_CODE")
		public void gorvisaVtypCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVtypCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVtypCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VTYP_CODE.POST-CHANGE
		 if :gorvisa_vtyp_code is null then
	 :VTYP_DESC := '';
	  return;
end if;
--
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVVTYP_DESC
         FROM   STVVTYP
         WHERE  STVVTYP_CODE = :GORVISA_VTYP_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :VTYP_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0064', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
      if :gorvisa_seq_no is null then
  			 execute_trigger('get_max_seqno');
      	 :gorvisa_seq_no := :max_seqno;
      end if;
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_VTYP_CODE")
		public void gorvisaVtypCode_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
//					if(gorvisaElement.getGorvisaVtypCode().isNull())
//						return;
					if ( gorvisaElement.getGorvisaVtypCode().isNull() )
					{
						gorvisaElement.setVtypDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVVTYP_DESC " +
		" FROM STVVTYP " +
		" WHERE STVVTYP_CODE = :GORVISA_VTYP_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORVISA_VTYP_CODE", gorvisaElement.getGorvisaVtypCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gorvisaElement.setVtypDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0064"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
								if ( gorvisaElement.getGorvisaSeqNo().isNull() )
								{
									executeAction("get_max_seqno");
									gorvisaElement.setGorvisaSeqNo(getFormModel().getFormHeader().getMaxSeqno());
								}
							}
							finally{
								ptiCursor.close();
							}
						}
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="VTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void vtypDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORVISA_NATN_CODE_ISSUE")
		public void gorvisaNatnCodeIssue_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_NATN_CODE_ISSUE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaNatnCodeIssue_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORVISA_NATN_CODE_ISSUE")
		public void gorvisaNatnCodeIssue_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_NATN_CODE_ISSUE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaNatnCodeIssue_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_NATN_CODE_ISSUE.G$_SEARCH_PARAMETERS
		 G$_Search.Parameters('STVNATN_CODE','STVNATN_NATION','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORVISA_NATN_CODE_ISSUE")
		public void gorvisaNatnCodeIssue_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_NATN_CODE_ISSUE.POST-TEXT-ITEM
		 G$_Search.Post_Text_Code;
IF :GORVISA_NATN_CODE_ISSUE IS NULL THEN
   :GORVISA.ISSUE_NATN_DESC := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_NATN_CODE_ISSUE", function=KeyFunction.ITEM_OUT)
		public void gorvisaNatnCodeIssue_itemOut()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					getTask().getGoqrpls().getGSearch().postTextCode();
					if ( gorvisaElement.getGorvisaNatnCodeIssue().isNull() )
					{
						gorvisaElement.setIssueNatnDesc(toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_NATN_CODE_ISSUE.POST-CHANGE
		 if :GORVISA_NATN_CODE_ISSUE is null then
	 :GORVISA.ISSUE_NATN_DESC := '';
	  return;
end if;
--

BEGIN
   G$_CHECK_QUERY_MODE;
--
   DECLARE
   
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_NATION
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GORVISA_NATN_CODE_ISSUE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :GORVISA.ISSUE_NATN_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0065', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
--
   :GLOBAL.QUERY_MODE := '0';
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_NATN_CODE_ISSUE")
		public void gorvisaNatnCodeIssue_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					if(gorvisaElement.getGorvisaNatnCodeIssue().isNull())
						return;
					if ( gorvisaElement.getGorvisaNatnCodeIssue().isNull() )
					{
						gorvisaElement.setIssueNatnDesc(toStr(""));
						return ;
					}
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT STVNATN_NATION " +
		" FROM STVNATN " +
		" WHERE STVNATN_CODE = :GORVISA_NATN_CODE_ISSUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORVISA_NATN_CODE_ISSUE", gorvisaElement.getGorvisaNatnCodeIssue());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gorvisaElement.setIssueNatnDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0065"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						// 
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ISSUE_NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ISSUE_NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void issueNatnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORVISA_VISS_CODE")
		public void gorvisaVissCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VISS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVissCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORVISA_VISS_CODE")
		public void gorvisaVissCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORVISA_VISS_CODE")
		public void gorvisaVissCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VISS_CODE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVissCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VISS_CODE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVissCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISS_CODE.POST-CHANGE
		 
BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GTVVISS_DESC
         FROM   GTVVISS
         WHERE  GTVVISS_CODE = :GORVISA_VISS_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :VISS_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0066', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_VISS_CODE")
		public void gorvisaVissCode_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
					{
					int rowCount = 0;
					if(gorvisaElement.getGorvisaVissCode().isNull())
			return;
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT GTVVISS_DESC " +
		" FROM GTVVISS " +
		" WHERE GTVVISS_CODE = :GORVISA_VISS_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORVISA_VISS_CODE", gorvisaElement.getGorvisaVissCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gorvisaElement.setVissDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0066"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISS_CODE.WHEN-VALIDATE-ITEM
		 if :GORVISA_VISS_CODE is null then
	 :VISS_DESC := '';
	  return;
end if;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VISS_CODE")
		public void gorvisaVissCode_validate()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					this.gorvisaVissCode_PostChange();
	
					if ( gorvisaElement.getGorvisaVissCode().isNull() )
					{
						gorvisaElement.setVissDesc(toStr(""));
						return ;
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VISS_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="VISS_DESC", function=KeyFunction.ITEM_CHANGE)
		public void vissDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORVISA_PENT_CODE")
		public void gorvisaPentCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_PENT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaPentCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORVISA_PENT_CODE")
		public void gorvisaPentCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORVISA_PENT_CODE")
		public void gorvisaPentCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_PENT_CODE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaPentCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_PENT_CODE", function=KeyFunction.ITEM_OUT)
		public void gorvisaPentCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_PENT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT stvpent_DESC
         FROM   stvpent
         WHERE  stvpent_CODE = :GORVISA_PENT_CODE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :PENT_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAINTL-0067', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END;
   :GLOBAL.QUERY_MODE := '0';
   EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0';
      RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_PENT_CODE")
		public void gorvisaPentCode_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					if(gorvisaElement.getGorvisaPentCode().isNull())
			return;
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						{
							String sqlptiCursor = "SELECT stvpent_DESC " +
		" FROM stvpent " +
		" WHERE stvpent_CODE = :GORVISA_PENT_CODE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("GORVISA_PENT_CODE", gorvisaElement.getGorvisaPentCode());
								
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									gorvisaElement.setPentDesc(ptiCursorResults.getStr(0));
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GOAINTL-0067"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_PENT_CODE.WHEN-VALIDATE-ITEM
		 if :GORVISA_PENT_CODE is null then
	 :PENT_DESC := '';
	  return;
end if;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_PENT_CODE")
		public void gorvisaPentCode_validate()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
				this.gorvisaPentCode_PostChange();
	
					if ( gorvisaElement.getGorvisaPentCode().isNull() )
					{
						gorvisaElement.setPentDesc(toStr(""));
						return ;
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PENT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PENT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pentDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_ENTRY_IND.WHEN-CHECKBOX-CHANGED
		 IF NAME_IN('SYSTEM.MODE') <> 'ENTER-QUERY' THEN
  if :gorvisa_entry_ind <> 'Y' then
	  if :GORVISA_NO_ENTRIES is not null then
	     :GORVISA_NO_ENTRIES := '';
	  end if;
  end if;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_ENTRY_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GORVISA_ENTRY_IND")
		public void gorvisaEntryInd_checkBoxChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( getMode().notEquals("ENTER-QUERY") )
					{
						if ( gorvisaElement.getGorvisaEntryInd().notEquals("Y") )
						{
							if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
							{
								gorvisaElement.setGorvisaNoEntries(toStr(""));
							}
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VISA_REQ_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVisaReqDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VISA_REQ_DATE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVisaReqDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_REQ_DATE.POST-CHANGE
		 if :gorvisa_visa_issue_date is null then
	 :gorvisa_visa_issue_date := :gorvisa_visa_req_date;
else
	  if to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD') then
	 	    message( G$_NLS.Get('GOAINTL-0068', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	    raise form_trigger_failure;
	 end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_VISA_REQ_DATE")
		public void gorvisaVisaReqDate_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if(gorvisaElement.getGorvisaVisaReqDate().isNull())
						return;
					if ( gorvisaElement.getGorvisaVisaIssueDate().isNull() )
					{
						gorvisaElement.setGorvisaVisaIssueDate(gorvisaElement.getGorvisaVisaReqDate());
					}
					else {
						if ( toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0068"), toStr("FORM"), toStr("*ERROR* Visa Request Date Can Not Be Later Than Visa Issued Date")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_REQ_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VISA_REQ_DATE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVisaReqDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_REQ_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORVISA_VISA_REQ_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gorvisaVisaReqDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VISA_ISSUE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVisaIssueDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VISA_ISSUE_DATE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVisaIssueDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_ISSUE_DATE.POST-CHANGE
		 if :GORVISA_VISA_START_DATE is null then
	 :GORVISA_VISA_START_DATE := :GORVISA_VISA_ISSUE_DATE;
else
	  if to_char(:gorvisa.GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:gorvisa.GORVISA_VISA_ISSUE_DATE,'YYYYMMDD') then
	  	 message( G$_NLS.Get('GOAINTL-0069', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Issued Date.') );
	  	 raise form_trigger_failure;
	  end if;
	  --
	  if   to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') is not null 
	  and (to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD')) then
	  	   message( G$_NLS.Get('GOAINTL-0070', 'FORM','Visa End Date Can Not Be Earlier Than Visa Issued Date.') );
	  	   raise form_trigger_failure;
	  end if;
end if;
--
if  :gorvisa_visa_issue_date is not null 
and (to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD')) then
	   message( G$_NLS.Get('GOAINTL-0071', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	 raise form_trigger_failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GORVISA_VISA_ISSUE_DATE")
		public void gorvisaVisaIssueDate_PostChange()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
					{
					if(gorvisaElement.getGorvisaVisaIssueDate().isNull())
						return;
					if ( gorvisaElement.getGorvisaVisaStartDate().isNull() )
					{
						gorvisaElement.setGorvisaVisaStartDate(gorvisaElement.getGorvisaVisaIssueDate());
					}
					else {
						if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0069"), toStr("FORM"), toStr("*ERROR* Visa Start Date Can Not Be Earlier Than Visa Issued Date.")));
							throw new ApplicationException();
						}
						// 
						if ( !toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").isNull() && (toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD"))) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0070"), toStr("FORM"), toStr("*ERROR* Visa End Date Can Not Be Earlier Than Visa Issued Date.")));
							throw new ApplicationException();
						}
					}
					// 
					if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() && (toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD"))) )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0071"), toStr("FORM"), toStr("*ERROR* Visa Request Date Can Not Be Later Than Visa Issued Date")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_ISSUE_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VISA_ISSUE_DATE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVisaIssueDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_ISSUE_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORVISA_VISA_ISSUE_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gorvisaVisaIssueDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VISA_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVisaStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VISA_START_DATE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVisaStartDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_START_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VISA_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVisaStartDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_START_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_START_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORVISA_VISA_START_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gorvisaVisaStartDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_START_DATE.WHEN-VALIDATE-ITEM
		 declare
	tmp1  varchar2(1) :='';
	cursor OtherGorvisa  is select 'x' from gorvisa 
					where gorvisa_pidm = :gorvisa_pidm and
								gorvisa_seq_no <> :gorvisa_seq_no;
	
begin
	

if :GORVISA_VISA_START_DATE is null or :system.block_status = 'QUERY' then
	  return;
end if;
--
  
if :gorvisa_visa_issue_date is not null then
    if TO_CHAR(:GORVISA_VISA_START_date,'YYYYMMDD') < TO_CHAR(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD') then
	     message( G$_NLS.Get('GOAINTL-0072', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Issue Date.') );
	     raise form_trigger_failure;
	  end if;
end if;
--
if :gorvisa_visa_req_date is not null then
	  if to_char(:GORVISA_VISA_START_date,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0073', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
    end if;
end if;
--
if  :GORVISA_VISA_EXPIRE_date is not null 
and TO_CHAR(:GORVISA_VISA_START_date,'YYYYMMDD') > TO_CHAR(:GORVISA_VISA_EXPIRE_date,'YYYYMMDD') then
	  message( G$_NLS.Get('GOAINTL-0074', 'FORM','Visa Start Date Can Not Be Later Than Visa End Date.') );
	  raise form_trigger_failure;
end if;
--

if check_null_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO)  and 
													(  :gorvisa.gorvisa_visa_start_date is null) then
													message('in when validate item 1');
														message('in when validate item 1');
	 message( G$_NLS.Get('GOAINTL-0075', 'FORM','Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.') );
	 raise form_trigger_failure;	 
end if;
--



if check_expire_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO) and :system.block_status <> 'QUERY' then
    message( G$_NLS.Get('GOAINTL-0076', 'FORM','Visa Start Date overlaps with another Visa record.') );
end if;

--

end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VISA_START_DATE")
		public void gorvisaVisaStartDate_validate()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					{
						NString tmp1 = toStr("");
						String sqlothergorvisa = "SELECT 'x' " +
		" FROM gorvisa " +
		" WHERE gorvisa_pidm = :GORVISA_PIDM AND gorvisa_seq_no <> :GORVISA_SEQ_NO ";
						DataCursor othergorvisa = new DataCursor(sqlothergorvisa);
						if ( gorvisaElement.getGorvisaVisaStartDate().isNull() || getBlockStatus().equals("QUERY") )
						{
							return ;
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0072"), toStr("FORM"), toStr("*ERROR* Visa Start Date Can Not Be Earlier Than Visa Issue Date.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0073"), toStr("FORM"), toStr("*ERROR* Visa Start Date Can Not Be Earlier Than Visa Request Date.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaExpireDate().isNull() && toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").greater(toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0074"), toStr("FORM"), toStr("*ERROR* Visa Start Date Can Not Be Later Than Visa End Date.")));
							throw new ApplicationException();
						}
						// 
						if ( this.getTask().getServices().checkNullDates(gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && (gorvisaElement.getGorvisaVisaStartDate().isNull()) )
						{
							message("in when validate item 1");
							message("in when validate item 1");
							errorMessage(GNls.Fget(toStr("GOAINTL-0075"), toStr("FORM"), toStr("*ERROR* Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.")));
							throw new ApplicationException();
						}
						// 
						if ( this.getTask().getServices().checkExpireDates(gorvisaElement, gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && !getBlockStatus().equals("QUERY") )
						{
							warningMessage(GNls.Fget(toStr("GOAINTL-0076"), toStr("FORM"), toStr("Visa Start Date overlaps with another Visa record.")));
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXPIRE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_VISA_EXPIRE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaVisaExpireDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXPIRE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_VISA_EXPIRE_DATE", function=KeyFunction.ITEM_OUT)
		public void gorvisaVisaExpireDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_EXPIRE_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXPIRE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_VISA_EXPIRE_DATE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaVisaExpireDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_EXPIRE_DATE.KEY-PREV-ITEM
		    G$_DATE_REFORMAT ('','');
   G$_CHECK_FAILURE;
   PREVIOUS_FIELD;
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXPIRE_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GORVISA_VISA_EXPIRE_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void gorvisaVisaExpireDate_PreviousItem()
		{

				previousItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_EXPIRE_DATE.WHEN-VALIDATE-ITEM
		 declare

	tmp1  varchar2(1) :='';
	cursor OtherGorvisa  is select 'x' from gorvisa 
					where gorvisa_pidm = :gorvisa_pidm and
								gorvisa_seq_no <> :gorvisa_seq_no;
begin
  	
--
if :GORVISA_VISA_EXPIRE_DATE is null or :system.block_status = 'QUERY' then
	  return;
end if;
--
if :gorvisa_visa_issue_date is not null then
    if TO_CHAR(:GORVISA_VISA_EXPIRE_date,'YYYYMMDD') < TO_CHAR(:GORVISA_VISA_ISSUE_date,'YYYYMMDD') then
	     message( G$_NLS.Get('GOAINTL-0077', 'FORM','Visa End date Can Not Be Earlier Than Visa Issue Date.') );
	     raise form_trigger_failure;
	  end if;
end if;
--
if :gorvisa_visa_req_date is not null then
	  if to_char(:GORVISA_VISA_EXPIRE_date,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_date,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0078', 'FORM','Visa End Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
    end if;
end if;
--
if TO_CHAR(:GORVISA_VISA_START_date,'YYYYMMDD') > TO_CHAR(:GORVISA_VISA_EXPIRE_date,'YYYYMMDD') then
	 message( G$_NLS.Get('GOAINTL-0079', 'FORM','Visa End Date Must be Later than or Equal to Visa Start Date.') );
	 raise form_trigger_failure;
end if;
--

if check_null_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO)  and 
													(:gorvisa.gorvisa_visa_expire_date is null) then
														message('in when validate item 2');
															message('in when validate item 2');
	 message( G$_NLS.Get('GOAINTL-0080', 'FORM','Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.') );
	 raise form_trigger_failure;	 
end if;

--
if check_expire_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO) and :system.block_status <> 'QUERY' then
    message( G$_NLS.Get('GOAINTL-0081', 'FORM','Visa end date overlaps with another Visa record.') );
    
end if;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXPIRE_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VISA_EXPIRE_DATE")
		public void gorvisaVisaExpireDate_validate()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					{
						NString tmp1 = toStr("");
						String sqlothergorvisa = "SELECT 'x' " +
		" FROM gorvisa " +
		" WHERE gorvisa_pidm = :GORVISA_PIDM AND gorvisa_seq_no <> :GORVISA_SEQ_NO ";
						DataCursor othergorvisa = new DataCursor(sqlothergorvisa);
						// 
						if ( gorvisaElement.getGorvisaVisaExpireDate().isNull() || getBlockStatus().equals("QUERY") )
						{
							return ;
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0077"), toStr("FORM"), toStr("*ERROR* Visa End date Can Not Be Earlier Than Visa Issue Date.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0078"), toStr("FORM"), toStr("*ERROR* Visa End Date Can Not Be Earlier Than Visa Request Date.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").greater(toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0079"), toStr("FORM"), toStr("*ERROR* Visa End Date Must be Later than or Equal to Visa Start Date.")));
							throw new ApplicationException();
						}
						// 
						if ( this.getTask().getServices().checkNullDates(gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && (gorvisaElement.getGorvisaVisaExpireDate().isNull()) )
						{
							message("in when validate item 2");
							message("in when validate item 2");
							errorMessage(GNls.Fget(toStr("GOAINTL-0080"), toStr("FORM"), toStr("*ERROR* Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.")));
							throw new ApplicationException();
						}
						// 
						if ( this.getTask().getServices().checkExpireDates(gorvisaElement, gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && !getBlockStatus().equals("QUERY") )
						{
							message(GNls.Fget(toStr("GOAINTL-0081"), toStr("FORM"), toStr("Visa end date overlaps with another Visa record.")));
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORVISA_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gorvisaActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORVISA_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gorvisaActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORVISA_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gorvisaActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VTYP_CODE")
		public void gorvisaVtypCode_validate()
		{
			
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				this.gorvisaVtypCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_NATN_CODE_ISSUE")
		public void gorvisaNatnCodeIssue_validate()
		{
			
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				this.gorvisaNatnCodeIssue_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VISA_REQ_DATE")
		public void gorvisaVisaReqDate_validate()
		{
			
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				this.gorvisaVisaReqDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORVISA_VISA_ISSUE_DATE")
		public void gorvisaVisaIssueDate_validate()
		{
			
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				this.gorvisaVisaIssueDate_PostChange();

			}

		
	
	
}

