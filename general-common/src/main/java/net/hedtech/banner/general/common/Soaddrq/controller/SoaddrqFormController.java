package net.hedtech.banner.general.common.Soaddrq.controller;
import java.util.*;

import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			




import org.apache.tools.ant.taskdefs.War;
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
import net.hedtech.banner.general.common.Soaddrq.model.*;
import net.hedtech.banner.general.common.Soaddrq.*;
import net.hedtech.banner.general.common.Soaddrq.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class SoaddrqFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public SoaddrqFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SoaddrqTask getTask() {
		return (SoaddrqTask)super.getTask();
	}
	
	
	public SoaddrqModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Soaddrq_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Soaddrq_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Soaddrq_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Soaddrq_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Soaddrq_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Soaddrq_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Soaddrq_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Soaddrq_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Soaddrq_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Soaddrq_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Soaddrq_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Soaddrq_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Soaddrq_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Soaddrq_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Soaddrq_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Soaddrq_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Soaddrq_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Soaddrq_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Soaddrq_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Soaddrq_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Soaddrq_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Soaddrq_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Soaddrq_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Soaddrq_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Soaddrq_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Soaddrq_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Soaddrq_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Soaddrq_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Soaddrq_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-UP
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
//		public void Soaddrq_MoveUp()
//		{
//			
//				getGFormClass().moveUp();
//			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Soaddrq_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Soaddrq_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Soaddrq_NextRecord()
		{
			
//			if(!isInLastRecord())
				getGFormClass().nextRecord();
//			else
//				warningMessage(toStr("At last record."));
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Soaddrq_PreviousRecord()
		{
			
//				if(!isInFirstRecord())
					getGFormClass().previousRecord();
//				else
//					warningMessage(toStr("At first record."));
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Soaddrq_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Soaddrq_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Soaddrq_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Soaddrq_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Soaddrq_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Soaddrq_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Soaddrq_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Soaddrq_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Soaddrq_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Soaddrq_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Soaddrq_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Soaddrq_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Soaddrq_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Soaddrq_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Soaddrq_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Soaddrq_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Soaddrq_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Soaddrq_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Soaddrq_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Soaddrq_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Soaddrq_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.GOTO_FORM
		 BEGIN
IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
   MESSAGE( G$_NLS.Get('SOADDRQ-0000', 'FORM','*ERROR* Must Save changes before performing this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
<multilinecomment> Options have been disabled in key_block.POST-BLOCK trigger
IF  :global.form_was_called = 'Y' and NAME_IN('GLOBAL.GUROPTM_NAME1') = 'SPAIDEN' then
    if :global.call_form = 'SPAIDEN' then
      message('Form was called from SPAIDEN');
    end if;
ELSIF :global.form_was_called = 'Y' and NAME_IN('GLOBAL.GUROPTM_NAME1') = 'SPATELE' then
    if :global.call_form = 'SPATELE' then
      message('Form was called from SPATELE');
    end if;
ELSE
</multilinecomment>
    :GLOBAL.KEY_PIDM := :SPRADDR_PIDM;
    :HOLD_CURRENT_FIELD := :SYSTEM.CURSOR_ITEM;
    EXECUTE_TRIGGER('SAVE_KEYS');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, NAME_IN('GLOBAL.GUROPTM_NAME1'),'');
    GO_ITEM('HOLD_CURRENT_FIELD');
-- END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.GOTO_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GOTO_FORM")
		public void Soaddrq_GotoForm()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if (spraddrElement == null) {return;}

				if ( !getTaskStatus().equals("QUERY") )
				{
					errorMessage(GNls.Fget(toStr("SOADDRQ-0000"), toStr("FORM"), toStr("*ERROR* Must Save changes before performing this function.")));
					throw new ApplicationException();
				}
				//  Options have been disabled in key_block.POST-BLOCK trigger
				// IF  :global.form_was_called = 'Y' and NAME_IN('GLOBAL.GUROPTM_NAME1') = 'SPAIDEN' then
				// if :global.call_form = 'SPAIDEN' then
				// message('Form was called from SPAIDEN');
				// end if;
				// ELSIF :global.form_was_called = 'Y' and NAME_IN('GLOBAL.GUROPTM_NAME1') = 'SPATELE' then
				// if :global.call_form = 'SPATELE' then
				// message('Form was called from SPATELE');
				// end if;
				// ELSE
				setGlobal("KEY_PIDM", toStr(spraddrElement.getSpraddrPidm()));
				getFormModel().getFormHeader().setHoldCurrentField(toStr(getCursorItem()));
				executeAction("SAVE_KEYS");
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getNameIn("GLOBAL.GUROPTM_NAME1"), toStr(""));
				goItem(toStr("HOLD_CURRENT_FIELD"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.2';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Soaddrq_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.WHEN_NEW_BLOCK_INSTANCE_TRG
		 IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK('KEY_BLOCK');
   NEXT_ITEM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CHECK_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   NEXT_BLOCK ;
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   EXECUTE_QUERY ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Soaddrq_WhenNewBlockInstanceTrg()
		{
			if ( getCursorBlock().notEquals("KEY_BLOCK") )
			{
			
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					goBlock(toStr("KEY_BLOCK"));
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
					executeAction("CHECK_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					//
					nextBlock();
					if(getCurrentBlock().isIn("G$_EXTENDED_SEARCH_BLOCK"))
						goBlock("KEY_BLOCK");
				
					
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.UPDATE_ACTIVITY_DATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKDATE := SUBSTR(:WORKDATE, 1, 7) ;
--
   :WORKDATE := RPAD(:WORKDATE, 21, '_ACTIVITY_DATE') ;
--
   COPY( :CURRENT_DATE, :WORKDATE ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Soaddrq_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Soaddrq_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   20-Nov-2003 06:29 PM
 ******************************************</multilinecomment>

   null ;   -- BLOCK_MENU ;
--
   IF :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
      EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
      G$_CHECK_FAILURE ;
      CLEAR_FORM ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      :SYSTEM.MESSAGE_LEVEL := '5' ;
      EXECUTE_QUERY ;
      :SYSTEM.MESSAGE_LEVEL := '0' ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER")
		public void Soaddrq_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 06:29 PM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 06:29 PM
				// ******************************************
				//  BLOCK_MENU ;
				// 
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					executeAction("SAVE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					clearTask();
					getTask().getGoqrpls().gCheckFailure();
					executeAction("LOAD_FORM_HEADER");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("GLOBAL_COPY");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('SOADDRQ-0001', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Soaddrq_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("SOADDRQ-0001"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.GLOBAL_COPY
		    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
--
   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Soaddrq_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				// 
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Soaddrq_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
					//**Morphis GOTO
					//**Francisco Carvalho
					//**Para que o bot�o funcione depois do start Over
					//setItemNavigable("ID_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Soaddrq_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("ID_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.WHEN-NEW-FORM-INSTANCE
		 begin
	SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED, PROPERTY_FALSE);
  DEFAULT_VALUE('1','GLOBAL.ADDRESS_SEQN');
   G$_SET_WIN_PROPERTY ;
   G$_SETMENU('main.block',1);
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
   IF GET_APPLICATION_PROPERTY(CALLING_FORM) <> 'GUAMENU' THEN
    IF GET_APPLICATION_PROPERTY(CALLING_FORM) <> 'GUAGMNU' THEN
      IF :KEY_BLOCK.ID IS NOT NULL THEN
        NEXT_BLOCK;
      END IF;
    END IF;
   END IF;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Soaddrq_TaskStarted(EventObject args)
		{
			
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", false);
				setDefaultValue("1", "GLOBAL.ADDRESS_SEQN");
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				if ( getParentTaskName().notEquals("GUAMENU") )
				{
					if ( getParentTaskName().notEquals("GUAGMNU") )
					{
						if ( !getFormModel().getKeyBlock().getId().isNull() )
						{
							//**MORPHIS TODO
							//**Francisco Carvalho
							//**Para for�ar a post change do key-block quando o form � chamada de outro form 
							//nextBlock();
							goItem("ID");
							executeAction("POST-CHANGE");
							executeAction("KEY-NXTBLK");
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.KEY-PRVBLK
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Soaddrq_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.KEY-NXTKEY
		    :GLOBAL.VALUE := '' ;
--
   :GLOBAL.SEQNO := '' ;
--
   IF :SPRADDR_STATUS_IND = 'I' THEN
      GOTO PRODUCE_ERROR ;
   END IF ;
--
   IF (:SPRADDR_FROM_DATE IS NULL
     AND  :SPRADDR_TO_DATE IS NULL) THEN
      GOTO OK_DRAG_BACK ;
   ELSE
      GOTO CHECK_DATES ;
   END IF ;
--
   << CHECK_DATES >>
   IF :SPRADDR_FROM_DATE IS NULL  THEN
      GOTO NULL_FROM_DATE ;
   ELSE
      IF :SPRADDR_TO_DATE IS NULL  THEN
         GOTO NULL_TO_DATE ;
      ELSE
         GOTO CHECK_BOTH_DATES ;
      END IF ;
   END IF ;
--
   << CHECK_BOTH_DATES >>
   IF (SYSDATE BETWEEN :SPRADDR_FROM_DATE AND :SPRADDR_TO_DATE)
      THEN
      GOTO OK_DRAG_BACK ;
   ELSE
      GOTO PRODUCE_ERROR ;
   END IF ;
--
   << NULL_FROM_DATE >>
   IF (SYSDATE <= :SPRADDR_TO_DATE) THEN
      GOTO OK_DRAG_BACK ;
   ELSE
      GOTO PRODUCE_ERROR ;
   END IF ;
--
   << NULL_TO_DATE >>
   IF (SYSDATE >= :SPRADDR_FROM_DATE) THEN
      GOTO OK_DRAG_BACK ;
   ELSE
      GOTO PRODUCE_ERROR ;
   END IF ;
--
   << PRODUCE_ERROR >>
   MESSAGE (
 G$_NLS.Get('SOADDRQ-0002', 'FORM','*WARNING* Address selection has inactive status or non-effective dates') 
      ) ;
   GOTO OK_DRAG_BACK ;
--
   << OK_DRAG_BACK >>
   :GLOBAL.VALUE := :SPRADDR_ATYP_CODE ;
--
   :GLOBAL.SEQNO := :SPRADDR_SEQNO ;
--
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Soaddrq_KeyNxtkey()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if (spraddrElement == null) return;
				
				setGlobal("VALUE", toStr(""));
				// 
				setGlobal("SEQNO", toStr(""));
				// 
				if ( spraddrElement.getSpraddrStatusInd().equals("I") )
				{
					warningMessage(GNls.Fget(toStr("SOADDRQ-0002"), toStr("FORM"),toStr("*WARNING* Address selection has inactive status or non-effective dates")));
					setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
					setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					return;
				}
				// 
				if ((spraddrElement.getSpraddrFromDate().isNull() && spraddrElement.getSpraddrToDate().isNull()))
				{
					setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
					setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					return;
				}
				
				if ( spraddrElement.getSpraddrFromDate().isNull() )
				{
					if ((NDate.getNow().lesserOrEquals(spraddrElement.getSpraddrToDate())))
					{
						setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
						setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						return;
					}
					else 
					{
						warningMessage(GNls.Fget(toStr("SOADDRQ-0002"), toStr("FORM"),toStr("*WARNING* Address selection has inactive status or non-effective dates")));
						setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
						setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						return;
					}
				}
				else 
				{
					if ( spraddrElement.getSpraddrToDate().isNull() )
					{
						if ((NDate.getNow().greaterOrEquals(spraddrElement.getSpraddrFromDate())))
						{
							setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
							setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							return;
						}
						else 
						{
							warningMessage(GNls.Fget(toStr("SOADDRQ-0002"), toStr("FORM"),toStr("*WARNING* Address selection has inactive status or non-effective dates")));
							setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
							setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							return;
						}
					}
					else 
					{
						if ((between(NDate.getNow(), spraddrElement.getSpraddrFromDate(), spraddrElement.getSpraddrToDate())))
						{
							setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
							setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							return;
						}
						else 
						{
							warningMessage(GNls.Fget(toStr("SOADDRQ-0002"), toStr("FORM"),toStr("*WARNING* Address selection has inactive status or non-effective dates")));
							setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
							setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							return; 
						}
					}
				}
				
				
				
				
				
				 
				
				 
				// PRODUCE_ERROR:;
				//message(GNls.Fget(toStr("SOADDRQ-0002"), toStr("FORM"), toStr("*WARNING* Address selection has inactive status or non-effective dates")));
				// goto OK_DRAG_BACK;
				// OK_DRAG_BACK:;
				//setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
				// 
				//setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
				// 
				//getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.KEY-NXTBLK
		    NEXT_BLOCK ;
   :SYSTEM.MESSAGE_LEVEL := '5' ;
   EXECUTE_QUERY ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Soaddrq_NextBlock()
		{
			
				nextBlock();
				
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeQuery();
				
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Soaddrq_FormKeyMenu()
		{
			
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.KEY-CLRFRM
		    EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Soaddrq_ClearTask()
		{
			
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				
				//*MORPHIS TODO Francisco Carvalho
				//*Para preencher apos o star over
				//*
				validateItem("ID");
				//*
				
				getTask().getGoqrpls().gCheckFailure();
				
				goBlock("KEY_BLOCK");
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Soaddrq_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOADDRQ.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOADDRQ.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Soaddrq_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
