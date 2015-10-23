package net.hedtech.banner.alumni.common.Apcaddr.controller;

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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.alumni.common.Apcaddr.model.*;
import net.hedtech.banner.alumni.common.Apcaddr.*;
import net.hedtech.banner.alumni.common.Apcaddr.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class ApcaddrFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public ApcaddrFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public ApcaddrTask getTask() {
		return (ApcaddrTask)super.getTask();
	}
	
	
	public ApcaddrModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Apcaddr_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Apcaddr_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Apcaddr_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Apcaddr_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Apcaddr_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Apcaddr_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Apcaddr_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Apcaddr_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Apcaddr_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Apcaddr_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Apcaddr_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Apcaddr_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Apcaddr_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Apcaddr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Apcaddr_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Apcaddr_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Apcaddr_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Apcaddr_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Apcaddr_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Apcaddr_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Apcaddr_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Apcaddr_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Apcaddr_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Apcaddr_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Apcaddr_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Apcaddr_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Apcaddr_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Apcaddr_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Apcaddr_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Apcaddr_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Apcaddr_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Apcaddr_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Apcaddr_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Apcaddr_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Apcaddr_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Apcaddr_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Apcaddr_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Apcaddr_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Apcaddr_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Apcaddr_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Apcaddr_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Apcaddr_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Apcaddr_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Apcaddr_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Apcaddr_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Apcaddr_LoadFormHeader()
		{
			
			getGFormClass().loadFormHeader();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Apcaddr_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Apcaddr_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Apcaddr_CheckKeys()
		{
			
			getGInqFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Apcaddr_Save()
		{
			
			getGInqFormClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Apcaddr_CreateRecord()
		{
			
			getGInqFormClass().createRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Apcaddr_DeleteRecord()
		{
			
			getGInqFormClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Apcaddr_KeyDupItem()
		{
			
			getGInqFormClass().keyDupItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Apcaddr_CopyRecord()
		{
			
			getGInqFormClass().copyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Apcaddr_recordChange()
		{
			
			getGInqFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.MNU_CALL_GUASYST
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'GUASYST','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.MNU_CALL_GUASYST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_GUASYST")
		public void Apcaddr_MnuCallGuasyst()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUASYST"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.INVALID_KEY
		    MESSAGE(  G$_NLS.Get('APCADDR-0000', 'FORM','*ERROR* A valid ID number must be entered for this function.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.INVALID_KEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_KEY")
		public void Apcaddr_InvalidKey()
		{
			
				errorMessage(GNls.Fget(toStr("APCADDR-0000"), toStr("FORM"), toStr("*ERROR* A valid ID number must be entered for this function.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.MNU_CALL_APAEMAL
		 :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
:GLOBAL.FORM_WAS_CALLED := 'Y' ;
:GLOBAL.SECRFRM := 'APAIDEN' ;
:GLOBAL.ALUM_CALLED_FORM := 'Y';
:GLOBAL.ALUM_CALLED_BLOCK := 'GOREMAL';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APAIDEN','');
:GLOBAL.ALUM_CALLED_FORM := '';
:GLOBAL.ALUM_CALLED_BLOCK := '';
:GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.MNU_CALL_APAEMAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_APAEMAL")
		public void Apcaddr_MnuCallApaemal()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("SECRFRM", toStr("APAIDEN"));
				setGlobal("ALUM_CALLED_FORM", toStr("Y"));
				setGlobal("ALUM_CALLED_BLOCK", toStr("GOREMAL"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APAIDEN"), toStr(""));
				setGlobal("ALUM_CALLED_FORM", toStr(""));
				setGlobal("ALUM_CALLED_BLOCK", toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Apcaddr_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-CLRREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Apcaddr_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';		--added for defect #38886
   GO_BLOCK('KEY_BLOCK');
   IF :ID IS NULL  THEN
      MESSAGE (
 G$_NLS.Get('APCADDR-0001', 'FORM','*ERROR* AN EXISTING ID NUMBER MUST BE ENTERED FOR THIS FUNCTION.')  ) ;
      RAISE FORM_TRIGGER_FAILURE;                        -- Added to return back to :ID on KEY_BLOCK and have buttons enabled GD 11-11-98
   ELSE
      NEXT_BLOCK ;
      EXECUTE_QUERY ;
   END IF ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Apcaddr_WhenNewBlockInstanceTrg()
		{
			
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					// added for defect #38886
					goBlock(toStr("KEY_BLOCK"));
					if ( getFormModel().getKeyBlock().getId().isNull() )
					{
						errorMessage(GNls.Fget(toStr("APCADDR-0001"), toStr("FORM"), toStr("*ERROR* AN EXISTING ID NUMBER MUST BE ENTERED FOR THIS FUNCTION.")));
						throw new ApplicationException();
					}
					else {
						nextBlock();
						executeQuery();
					}
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Apcaddr_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Nov-2003 11:04 PM
 ******************************************</multilinecomment>

   null ;   -- BLOCK_MENU ;
--
   IF :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
      EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
      G$_CHECK_FAILURE ;
      CLEAR_FORM ;
      G$_CHECK_FAILURE ;
      NEXT_BLOCK ;
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
		 * APCADDR.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER")
		public void Apcaddr_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 11:04 PM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 11:04 PM
				// ******************************************
				//  BLOCK_MENU ;
				// 
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					executeAction("SAVE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					clearTask();
					getTask().getGoqrpls().gCheckFailure();
					nextBlock();
					executeAction("LOAD_FORM_HEADER");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("GLOBAL_COPY");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.INVALID_FUNCTION_MSG
		    MESSAGE(  G$_NLS.Get('APCADDR-0002', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Apcaddr_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("APCADDR-0002"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.GLOBAL_COPY
		    :KEY_BLOCK.PIDM := :GLOBAL.KEY_PIDM ;
--
   :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
--
   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
--
   GO_ITEM('KEY_BLOCK.ID');
--
   IF (:GLOBAL.FORM_WAS_CALLED = 'Y' OR
   	   GET_APPLICATION_PROPERTY(CALLING_FORM) = 'APAIDEN') 
   	AND
      :KEY_BLOCK.ID IS NOT NULL THEN
      DO_KEY('NEXT_BLOCK');
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Apcaddr_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setPidm(toNumber(getGlobal("KEY_PIDM")));
				// 
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				// 
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
				// 
				goItem(toStr("KEY_BLOCK.ID"));
				// 
				if ( (getGlobal("FORM_WAS_CALLED").equals("Y") || getParentTaskName().equals("APAIDEN")) && !getFormModel().getKeyBlock().getId().isNull() )
				{
					executeAction(KeyFunction.NEXT_BLOCK);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPS_IDNO',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPS_IDNO',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPS_IDNO',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED) = 'FALSE' THEN
   IF :SPS_IDNO IS NOT NULL THEN
      SET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED,PROPERTY_ON);
   END IF;
END IF;
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
END IF;
--
SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
--
SET_ITEM_PROPERTY('EMAL_BTN',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Apcaddr_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("SPS_IDNO").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO", true);
					setItemNavigable("SPS_IDNO", true);
				}
				if ( getItemEnabled("DONR_CAT_LBT").equals("FALSE") )
				{
					setItemEnabled("DONR_CAT_LBT", true);
				}
				if ( getItemEnabled("SPS_IDNO_LBT").equals("FALSE") )
				{
					if ( !getFormModel().getKeyBlock().getSpsIdno().isNull() )
					{
						setItemEnabled("SPS_IDNO_LBT", true);
					}
				}
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
				}
				// 
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", false);
				setItemEnabled("SPRADDR_ATYP_CODE_LBT", false);
				// 
				setItemEnabled("EMAL_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPS_IDNO',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF);
--
IF GET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('EMAL_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('EMAL_BTN',ENABLED,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Apcaddr_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("SPS_IDNO", false);
				setItemEnabled("DONR_CAT_LBT", false);
				setItemEnabled("SPS_IDNO_LBT", false);
				setItemEnabled("ID_LBT", false);
				// 
				if ( getItemEnabled("SPRADDR_ASRC_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("SPRADDR_ASRC_CODE_LBT", true);
				}
				if ( getItemEnabled("SPRADDR_ATYP_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("SPRADDR_ATYP_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("EMAL_BTN").equals("FALSE") )
				{
					setItemEnabled("EMAL_BTN", true);
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.WHEN-NEW-FORM-INSTANCE
		 -- Added lines below for B2K doubleclick.
G$_GUAMENU_CHECK_SET('SPRADDR_1_EXITVALUE_BTN');
--
G$_SET_WIN_PROPERTY;
G$_SET_INST_PROPERTY;
--
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
G$_CHECK_FAILURE ;
EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
G$_CHECK_FAILURE ;
--
G$_SETMENU('Main.Block','1');
--
SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Apcaddr_TaskStarted(EventObject args)
		{
			
				//  Added lines below for B2K doubleclick.
				//  Added lines below for B2K doubleclick.
				getTask().getGoqrpls().gGuamenuCheckSet(toStr("SPRADDR_1_EXITVALUE_BTN"));
				// 
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
				// 
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().gSetmenu(toStr("Main.Block"), toNumber("1"));
				// 
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", false);
				setItemEnabled("SPRADDR_ATYP_CODE_LBT", false);
				if(getFormModel().getKeyBlock().getSpsIdno().isNull())
				{
					setItemVisible("SPS_IDNO_LBT", false);
					
				}
				if(getFormModel().getKeyBlock().getSpsIdno().isNotNull())
				{
					setItemVisible("SPS_IDNO_LBT", true);
				}
				
				if(getFormModel().getKeyBlock().getDonrCat().isNull())
				{
					setItemVisible("DONR_CAT_LBT", false);
					
				}
				if(getFormModel().getKeyBlock().getDonrCat().isNotNull())
				{
					setItemVisible("DONR_CAT_LBT", true);
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Apcaddr_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-NXTKEY
		    :GLOBAL.ADDRESS_TYPE := '' ;
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
 G$_NLS.Get('APCADDR-0003', 'FORM','*WARNING* ADDRESS SELECTION HAS INACTIVE STATUS OR NON-EFFECTIVE DATES.') 
       ) ;
   GOTO OK_DRAG_BACK ;
--
   << OK_DRAG_BACK >>
   :GLOBAL.ADDRESS_TYPE := :SPRADDR_ATYP_CODE ;
   :GLOBAL.VALUE := :SPRADDR_ATYP_CODE ;
--
   :GLOBAL.SEQNO := :SPRADDR_SEQNO ;
--
   -- 021099 EXIT_FORM ;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Apcaddr_KeyNxtkey()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
				if(spraddrElement != null){

					setGlobal("ADDRESS_TYPE", toStr(""));
					// 
					setGlobal("SEQNO", toStr(""));
					// 
					if ( spraddrElement.getSpraddrStatusInd().equals("I") )
					{
						 produceError(spraddrElement);
						 return;
					}
					// 
					if ((spraddrElement.getSpraddrFromDate().isNull() && spraddrElement.getSpraddrToDate().isNull()))
					{
						 okDragBack(spraddrElement);
						 return;
					}
					
					if ( spraddrElement.getSpraddrFromDate().isNull() )
					{
						if ((NDate.getNow().lesserOrEquals(spraddrElement.getSpraddrToDate())))
						{
							 okDragBack(spraddrElement);
							 return;
						}
						else {
							 produceError(spraddrElement);
							 return;
						}
					}
					else {
						if ( spraddrElement.getSpraddrToDate().isNull() )
						{
							if ((NDate.getNow().greaterOrEquals(spraddrElement.getSpraddrFromDate())))
							{
								 okDragBack(spraddrElement);
								 return;
							}
							produceError(spraddrElement);
							return;
						}
						else {
							if ((between(NDate.getNow(), spraddrElement.getSpraddrFromDate(), spraddrElement.getSpraddrToDate())))
							{
								 okDragBack(spraddrElement);
								 return;
							}
							else {
								 produceError(spraddrElement);
								 return;
							}
						}
					}
					 
				}
		}

		public void produceError(SpraddrAdapter spraddrElement){
			warningMessage(GNls.Fget(toStr("APCADDR-0003"), toStr("FORM"), toStr("*WARNING* ADDRESS SELECTION HAS INACTIVE STATUS OR NON-EFFECTIVE DATES.")));
			
			setGlobal("ADDRESS_TYPE", spraddrElement.getSpraddrAtypCode());
			setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
			// 
			setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
			// 
			//  021099 EXIT_FORM ;
			getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
		}
		
		public void okDragBack(SpraddrAdapter spraddrElement){
			setGlobal("ADDRESS_TYPE", spraddrElement.getSpraddrAtypCode());
			setGlobal("VALUE", spraddrElement.getSpraddrAtypCode());
			// 
			setGlobal("SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
			// 
			//  021099 EXIT_FORM ;
			getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
		}
		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *The next block key has been disabled.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Apcaddr_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Apcaddr_FormKeyMenu()
		{
			
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   -- 021099 EXIT_FORM ;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APCADDR.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Apcaddr_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  021099 EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER APCADDR.KEY-CLRFRM
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'ENABLE_KEYS' ) ;
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
		 * APCADDR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Apcaddr_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
