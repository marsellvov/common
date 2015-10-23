package net.hedtech.banner.general.common.Goaeacc.controller;
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
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Goaeacc.model.*;
import net.hedtech.banner.general.common.Goaeacc.*;
import net.hedtech.banner.general.common.Goaeacc.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GoaeaccFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GoaeaccFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GoaeaccTask getTask() {
		return (GoaeaccTask)super.getTask();
	}
	
	
	public GoaeaccModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Goaeacc_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Goaeacc_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Goaeacc_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Goaeacc_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Goaeacc_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Goaeacc_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Goaeacc_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Goaeacc_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Goaeacc_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Goaeacc_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Goaeacc_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Goaeacc_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Goaeacc_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Goaeacc_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Goaeacc_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Goaeacc_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Goaeacc_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Goaeacc_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Goaeacc_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Goaeacc_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Goaeacc_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Goaeacc_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Goaeacc_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Goaeacc_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Goaeacc_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Goaeacc_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Goaeacc_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Goaeacc_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Goaeacc_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaeacc_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Goaeacc_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Goaeacc_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Goaeacc_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Goaeacc_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Goaeacc_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Goaeacc_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Goaeacc_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Goaeacc_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Goaeacc_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Goaeacc_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Goaeacc_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Goaeacc_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Goaeacc_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Goaeacc_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Goaeacc_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Goaeacc_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Goaeacc_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.ON-ERROR
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Nov-2003 01:11 PM
 ******************************************</multilinecomment>


declare
   lv_errcod   number  := ERROR_CODE;
   lv_errtype  varchar2(3) := ERROR_TYPE;
   lv_errtxt   varchar2(80) := ERROR_TEXT;
   db_errcod   number  := DBMS_ERROR_CODE;
   db_errtxt   varchar2(512) := DBMS_ERROR_TEXT;
   alert_button number;
   alert_id  ALERT := FIND_ALERT('USER_ALERT');
    user_msg varchar2(80);
begin
	G$_ERRORS.POPULATE_VARIABLES;
	IF DBMS_ERROR_CODE = G$_ERRORS.CHECK_POLICY_VIOLATION THEN
		 MESSAGE(G$_ERRORS.CHECK_POLICY_MESSAGE);
		 RAISE FORM_TRIGGER_FAILURE;
	elsif lv_errcod = 40508 then
         user_msg :=  G$_NLS.Get('GOAEACC-0000', 'FORM','*ERROR* The Username and ID MUST be Unique.') ;
  else
         user_msg := lv_errtxt;
  end if;
  SET_ALERT_PROPERTY(alert_id, ALERT_MESSAGE_TEXT,user_msg);
               alert_button := show_alert('USER_ALERT');
               if alert_button = ALERT_BUTTON1 then
                       null;
               end if;
          raise form_trigger_failure;
end;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Goaeacc_OnError(EventObject args)
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 01:11 PM
				// ******************************************
//				{
//					NNumber lvErrcod = SupportClasses.SQLFORMS.ErrorCode();
//					NString lvErrtype = SupportClasses.SQLFORMS.ErrorType();
//					NString lvErrtxt = SupportClasses.SQLFORMS.ErrorText();
//					NNumber dbErrcod = errorCode();
//					NString dbErrtxt = errorMessage();
//					NNumber alertButton= NNumber.getNull();
//					AlertDescriptor alertId = findAlert("USER_ALERT");
//					NString userMsg= NString.getNull();
//					getTask().getGoqrpls().getGErrors().populateVariables();
//					if ( errorCode().equals(getTask().getGoqrpls().getGErrors().checkPolicyViolation) )
//					{
//						message(getTask().getGoqrpls().getGErrors().checkPolicyMessage);
//						throw new ApplicationException();
//					}
//					else if ( lvErrcod.equals(40508) ) {
//						userMsg = GNls.Fget(toStr("GOAEACC-0000"), toStr("FORM"), toStr("*ERROR* The Username and ID MUST be Unique."));
//					}
//					else {
//						userMsg = lvErrtxt;
//					}
//					setAlertMessageText(alertId, userMsg);
//					alertButton = toNumber(showAlert("USER_ALERT"));
//					if ( alertButton.equals(MessageServices.BUTTON1) )
//					{
//					}
//					throw new ApplicationException();
//				}
				getGFormClass().onError(args);
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-COMMIT
		 commit_form;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Goaeacc_Save()
		{
			
				commitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-NXTKEY
		 BEGIN
  :GLOBAL.VALUE := :GOBEACC_USERNAME ;

  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Goaeacc_KeyNxtkey()
		{
			
				GobeaccAdapter gobeaccElement = (GobeaccAdapter)this.getFormModel().getGobeacc().getRowAdapter(true);

				if(gobeaccElement!=null){
					setGlobal("VALUE", gobeaccElement.getGobeaccUsername());
				}
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-ENTQRY
		 enter_query;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Goaeacc_Search()
		{
			
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-EXEQRY
		 execute_query;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Goaeacc_ExecuteQuery()
		{
			
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-NXTREC
		 next_record;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Goaeacc_NextRecord()
		{
			
				nextRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-PRVREC
		 previous_record;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaeacc_PreviousRecord()
		{
			
				previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.WHEN_WINDOW_ACTIVATED_TRG
		 IF :SYSTEM.EVENT_WINDOW IS NULL OR
   :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
END IF;
--
IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' AND
   :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
     G$_DETERMINE_CURSOR_LOCATION('KB_USER_ID');
     RETURN;
  ELSE
     G$_DETERMINE_CURSOR_LOCATION('GOBVUSR_ACTIVE_IND');
     RETURN;
END IF;
IF :SYSTEM.EVENT_WINDOW = 'GORVRAC_WINDOW' THEN
 G$_DETERMINE_CURSOR_LOCATION('GOVVRAC_VOBJ_CODE');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Goaeacc_WhenWindowActivatedTrg()
		{
			
				if ( (getCurrentWindow()) == null || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
				// 
				if ( getCurrentWindow().equals("MAIN_WINDOW") && getCurrentBlock().equals("KEY_BLOCK") )
				{
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("KB_USER_ID"));
					return ;
				}
				else {
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("GOBVUSR_ACTIVE_IND"));
					return ;
				}
//				if ( getCurrentWindow().equals("GORVRAC_WINDOW") )
//				{
//					getTask().getGoqrpls().gDetermineCursorLocation(toStr("GOVVRAC_VOBJ_CODE"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.3.0.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goaeacc_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.WHEN-NEW-FORM-INSTANCE
		    G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   execute_query;
		*/
		/*
		 *<p>
		 *The KEY-STARTUP trigger loads the form header information and goes to the

		 *next block.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Goaeacc_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.SAVE_KEYS
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Goaeacc_SaveKeys()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY_NULL
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY_NULL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NULL")
		public void Goaeacc_KeyNull()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.ENABLE_KEYS
		 if get_item_property('user_type', enabled) = 'FALSE' then
   set_item_property('user_type', enabled, property_on);
   set_item_property('user_type', navigable, property_on);
   set_item_property('user_type', updateable, property_on);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Goaeacc_EnableKeys()
		{
			
				if ( getItemEnabled("user_type").equals("FALSE") )
				{
					setItemEnabled("user_type", true);
					setItemNavigable("user_type", true);
					setItemUpdateAllowed("user_type", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.DISABLE_KEYS
		 set_item_property('user_type', enabled, property_off);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Goaeacc_DisableKeys()
		{
			
				setItemEnabled("user_type", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-UPDREC
		    LOCK_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-UPDREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UPDREC")
		public void Goaeacc_KeyUpdrec()
		{
			
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-PREV-ITEM
		    PREVIOUS_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void Goaeacc_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-NEXT-ITEM
		    NEXT_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void Goaeacc_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-EXIT
		    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Goaeacc_Exit()
		{
			
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-ENTER
		    ENTER ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-ENTER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTER")
		public void Goaeacc_KeyEnter()
		{
			
			
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.KEY-CLRFRM
		 
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
--
execute_query;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Goaeacc_ClearTask()
		{
			
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEACC.PRE_FORM_TRG
		    EXECUTE_TRIGGER( 'LOAD_CURRENT_RELEASE' ) ;
   EXECUTE_TRIGGER('G$_VERIFY_ACCESS') ;
   G$_CHECK_FAILURE;
   DEFAULT_VALUE( '0', 'global.query_mode' ) ;
   DEFAULT_VALUE( '', 'global.vbs_user' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEACC.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Goaeacc_PreFormTrg()
		{
			
				executeAction("LOAD_CURRENT_RELEASE");
				executeAction("G$_VERIFY_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				setDefaultValue("0", "global.query_mode");
				setDefaultValue("", "global.vbs_user");
			}
		
	
}
	
