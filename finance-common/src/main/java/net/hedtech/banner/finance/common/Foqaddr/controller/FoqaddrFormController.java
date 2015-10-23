package net.hedtech.banner.finance.common.Foqaddr.controller;
import java.util.*;

import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			


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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqaddr.model.*;
import net.hedtech.banner.finance.common.Foqaddr.*;
import net.hedtech.banner.finance.common.Foqaddr.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class FoqaddrFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public FoqaddrFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FoqaddrTask getTask() {
		return (FoqaddrTask)super.getTask();
	}
	
	
	public FoqaddrModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Foqaddr_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Foqaddr_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Foqaddr_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Foqaddr_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Foqaddr_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Foqaddr_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Foqaddr_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Foqaddr_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Foqaddr_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Foqaddr_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Foqaddr_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Foqaddr_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Foqaddr_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Foqaddr_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Foqaddr_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Foqaddr_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Foqaddr_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Foqaddr_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Foqaddr_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Foqaddr_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Foqaddr_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Foqaddr_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Foqaddr_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Foqaddr_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Foqaddr_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Foqaddr_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Foqaddr_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Foqaddr_MoveDown()
		{
			getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Foqaddr_MoveUp()
		{
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Foqaddr_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Foqaddr_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Foqaddr_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Foqaddr_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Foqaddr_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Foqaddr_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Foqaddr_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Foqaddr_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Foqaddr_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Foqaddr_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Foqaddr_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Foqaddr_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Foqaddr_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Foqaddr_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Foqaddr_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Foqaddr_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Foqaddr_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Foqaddr_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Foqaddr_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Foqaddr_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Foqaddr_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Foqaddr_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.9';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Foqaddr_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-CLRREC
		   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Foqaddr_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-CLRBLK
		   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void Foqaddr_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-CLRFRM
		 EXECUTE_TRIGGER('ENABLE_KEYS');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('SAVE_KEYS');
G$_CHECK_FAILURE;
clear_form;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('LOAD_FORM_HEADER');
G$_CHECK_FAILURE;
:ID := :GLOBAL.KEY_IDNO; 
G$_SEL_SPRIDEN_PIDM_NAME(:ID, 'NAME', 'N', :PIDM);
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Foqaddr_ClearTask()
		{
			
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
				Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
				getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("NAME"), toStr("N"), pPidm_ref);
				getFormModel().getKeyBlock().setId(pId_ref.val);
				getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-EXIT
		  ERASE('GLOBAL.PIDM');
 :global.seqno := '' ;
-- erase('global.value');
--12899 EXIT_FORM;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Foqaddr_Exit()
		{
			
				removeGlobal("GLOBAL.PIDM");
				setGlobal("SEQNO", toStr(""));
				//  erase('global.value');
				// 12899 EXIT_FORM;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 --	SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE_LBT',VISIBLE,PROPERTY_OFF);
  SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
  
IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK('KEY_BLOCK');
   NEXT_FIELD ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CHECK_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Foqaddr_WhenNewBlockInstanceTrg()
		{
			
				// 	SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE_LBT',VISIBLE,PROPERTY_OFF);
				// 	SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE_LBT',VISIBLE,PROPERTY_OFF);
				setItemEnabled("SPRADDR.SPRADDR_ATYP_CODE_LBT", false);
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
						executeQuery();
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.UPDATE_ACTIVITY_DATE
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
		 * FOQADDR.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Foqaddr_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Foqaddr_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   20-Nov-2003 09:30 AM
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
      EXECUTE_QUERY ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER")
		public void Foqaddr_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 09:30 AM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 09:30 AM
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
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.LOAD_FORM_HEADER
		 :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
:CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
:CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
:CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
validate(record_scope);
EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
--
:KEY_BLOCK.PIDM := :GLOBAL.PIDM;
:KEY_BLOCK.ID := NULL;
g$_sel_spriden_id_name(:KEY_BLOCK.PIDM, 'KEY_BLOCK.NAME', 'Y', :KEY_BLOCK.ID);
G$_CHECK_VALUE(:KEY_BLOCK.ID IS NULL,
 G$_NLS.Get('FOQADDR-0000', 'FORM', 'Cannot find record on SPRIDEN table'), FALSE);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Foqaddr_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
//				validateTask(SupportClasses.Constants.RECORD_SCOPE);
				executeAction("LOAD_CURRENT_RELEASE");
				// 
				getFormModel().getKeyBlock().setPidm(toNumber(getGlobal("PIDM")));
				getFormModel().getKeyBlock().setId(toStr(null));
				Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
				getTask().getGoqrpls().gSelSpridenIdName(getFormModel().getKeyBlock().getPidm(), toStr("KEY_BLOCK.NAME"), toStr("Y"), pId_ref);
				getFormModel().getKeyBlock().setId(pId_ref.val);
				getTask().getGoqrpls().gCheckValue(toBool(getFormModel().getKeyBlock().getId().isNull()), GNls.Fget(toStr("FOQADDR-0000"), toStr("FORM"), toStr("Cannot find record on SPRIDEN table")), toBool(NBool.False));
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('FOQADDR-0001', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Foqaddr_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FOQADDR-0001"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.GLOBAL_COPY
		           
--  :KEY_BLOCK.PIDM := :GLOBAL.PIDM;
--
   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Foqaddr_GlobalCopy()
		{
			
				//   :KEY_BLOCK.PIDM := :GLOBAL.PIDM;
				// 
				//   :KEY_BLOCK.PIDM := :GLOBAL.PIDM;
				// 
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('NAME', ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('NAME', ENABLED, PROPERTY_ON);
   SET_ITEM_PROPERTY('NAME', NAVIGABLE, PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Foqaddr_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
					//setItemNavigable("ID_LBT", true);
				}
				if ( getItemEnabled("NAME").equals("FALSE") )
				{
					setItemEnabled("NAME", true);
					setItemNavigable("NAME", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('NAME', ENABLED, PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Foqaddr_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("ID_LBT", false);
				setItemEnabled("NAME", false);
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.WHEN-NEW-FORM-INSTANCE
		 G$_SET_WIN_PROPERTY;
G$_SETMENU('main.block',1);   
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
G$_CHECK_FAILURE ;
EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
G$_CHECK_FAILURE ;
G$_SET_INST_PROPERTY;

if :key_block.id is not null then
    next_block;
end if;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Foqaddr_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					this.Foqaddr_NextBlock();
//					nextBlock();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-PRVBLK
		   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Foqaddr_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-NXTKEY
		    :GLOBAL.ATYP_CODE := :SPRADDR.SPRADDR_ATYP_CODE;   
--
   :GLOBAL.SEQNO := :SPRADDR_SEQNO;
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
 G$_NLS.Get('FOQADDR-0002', 'FORM','*WARNING* Address selection has inactive status or non-effective dates') 
      ) ;
   GOTO OK_DRAG_BACK ;
--
   << OK_DRAG_BACK >>
-- CMS-DFCT106047
--  :GLOBAL.VALUE := '';
  :GLOBAL.VALUE :=  NAME_IN('SYSTEM.CURSOR_VALUE') ;
  :GLOBAL.SEQNO := :SPRADDR_SEQNO ;  
  :GLOBAL.ATYP_CODE := :SPRADDR_ATYP_CODE ;
--:system.current_value;
--
--12899    EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Foqaddr_KeyNxtkey()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if(spraddrElement!=null){
				setGlobal("ATYP_CODE", spraddrElement.getSpraddrAtypCode());
				// 
				setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
				// 
				if ( spraddrElement.getSpraddrStatusInd().equals("I") )
				{
					produceError(spraddrElement);
				}
				// 
				if ((spraddrElement.getSpraddrFromDate().isNull() && spraddrElement.getSpraddrToDate().isNull()))
				{
					 okDragBack(spraddrElement);
				}
				else {
					checkDates(spraddrElement);				}
//				 CHECK_DATES:;
				checkDates(spraddrElement);
				 checkBothDates(spraddrElement);
				 nullFromDate(spraddrElement);
				 nullToDate(spraddrElement);
				 produceError(spraddrElement);
				 okDragBack(spraddrElement);
			}
		}
		
		private void checkDates(SpraddrAdapter spraddrElement) {
			if ( spraddrElement.getSpraddrFromDate().isNull() )
			{
				nullFromDate(spraddrElement);
				}
			else {
				if ( spraddrElement.getSpraddrToDate().isNull() )
				{
					nullToDate(spraddrElement);					}
				else {
					checkBothDates(spraddrElement);
					}
			}
		}
		private void nullToDate(SpraddrAdapter spraddrElement) {
//			NULL_TO_DATE:;
			if ((NDate.getNow().greaterOrEquals(spraddrElement.getSpraddrFromDate())))
			{
				okDragBack(spraddrElement);
				}
			else {
				produceError(spraddrElement);
				}
		}
		private void nullFromDate(SpraddrAdapter spraddrElement) {
//			NULL_FROM_DATE:;
			if ((NDate.getNow().lesserOrEquals(spraddrElement.getSpraddrToDate())))
			{
				okDragBack(spraddrElement);
				}
			else {
				produceError(spraddrElement);
				}
		}
		private void checkBothDates(SpraddrAdapter spraddrElement) {
//			CHECK_BOTH_DATES:;
			if ((between(NDate.getNow(), spraddrElement.getSpraddrFromDate(), spraddrElement.getSpraddrToDate())))
			{
				okDragBack(spraddrElement);
				}
			else {
				 produceError(spraddrElement);
			}
		}
		
		private void okDragBack(SpraddrAdapter spraddrElement) {
//			OK_DRAG_BACK:;
			//  CMS-DFCT106047
			//   :GLOBAL.VALUE := '';
			setGlobal("VALUE",  getCursorValue());
//			setGlobal("VALUE", SupportClasses.AppContext.CursorValue);
			setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
			setGlobal("ATYP_CODE", spraddrElement.getSpraddrAtypCode());
			// :system.current_value;
			// 
			// 12899    EXIT_FORM ;
			getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
		}
		
		private void produceError(SpraddrAdapter spraddrElement) {
//			PRODUCE_ERROR:;
			warningMessage(GNls.Fget(toStr("FOQADDR-0002"), toStr("FORM"), toStr("*WARNING* Address selection has inactive status or non-effective dates")));
			okDragBack(spraddrElement);
		}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.KEY-NXTBLK
		    NEXT_BLOCK ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Foqaddr_NextBlock()
		{
			
				nextBlock();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Foqaddr_FormKeyMenu()
		{
			
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Foqaddr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Foqaddr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.PRE_FORM_TRG
		 BEGIN
   --EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE') ;
   --EXECUTE_TRIGGER('G$_VERIFY_ACCESS');Changes done for 1-1FBZVCL
   --G$_CHECK_FAILURE;
G$_GUAMENU_CHECK_SET('BUTTON_CONTROL_BLOCK.SPRADDR_1_EXITVALUE_BTN');
DEFAULT_VALUE( '0', 'global.query_mode' ) ;
END;

EXECUTE_TRIGGER('DISABLE_I18N_FIELDS');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Foqaddr_PreFormTrg()
		{
			
				// EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE') ;
				// EXECUTE_TRIGGER('G$_VERIFY_ACCESS');Changes done for 1-1FBZVCL
				// G$_CHECK_FAILURE;
				getTask().getGoqrpls().gGuamenuCheckSet(toStr("BUTTON_CONTROL_BLOCK.SPRADDR_1_EXITVALUE_BTN"));
				setDefaultValue("0", "global.query_mode");
				executeAction("DISABLE_I18N_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOQADDR.DISABLE_I18N_FIELDS
		 IF GET_ITEM_PROPERTY('SPRADDR.SPRADDR_HOUSE_NUMBER',VISIBLE) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SPRADDR.SPRADDR_HOUSE_NUMBER',ENABLED,PROPERTY_OFF);
END IF;

IF GET_ITEM_PROPERTY('SPRADDR.SPRADDR_STREET_LINE4',VISIBLE) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SPRADDR.SPRADDR_STREET_LINE4',ENABLED,PROPERTY_OFF);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOQADDR.DISABLE_I18N_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_I18N_FIELDS")
		public void Foqaddr_DisableI18nFields()
		{
			
				if ( getItemVisible("SPRADDR.SPRADDR_HOUSE_NUMBER").equals("TRUE") )
				{
					setItemEnabled("SPRADDR.SPRADDR_HOUSE_NUMBER", false);
				}
				if ( getItemVisible("SPRADDR.SPRADDR_STREET_LINE4").equals("TRUE") )
				{
					setItemEnabled("SPRADDR.SPRADDR_STREET_LINE4", false);
				}
			}

		
	
}
	
