package net.hedtech.banner.finance.common.Frikgnt.controller;
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.banner.finance.common.Frikgnt.model.*;
import net.hedtech.banner.finance.common.Frikgnt.*;
import net.hedtech.banner.finance.common.Frikgnt.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class FrikgntFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public FrikgntFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FrikgntTask getTask() {
		return (FrikgntTask)super.getTask();
	}
	
	
	public FrikgntModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Frikgnt_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Frikgnt_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Frikgnt_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Frikgnt_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Frikgnt_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Frikgnt_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Frikgnt_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Frikgnt_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Frikgnt_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Frikgnt_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Frikgnt_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Frikgnt_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Frikgnt_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Frikgnt_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Frikgnt_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Frikgnt_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Frikgnt_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Frikgnt_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Frikgnt_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Frikgnt_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Frikgnt_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Frikgnt_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Frikgnt_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Frikgnt_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Frikgnt_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Frikgnt_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Frikgnt_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Frikgnt_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Frikgnt_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Frikgnt_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Frikgnt_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Frikgnt_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Frikgnt_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Frikgnt_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Frikgnt_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Frikgnt_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Frikgnt_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Frikgnt_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Frikgnt_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Frikgnt_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Frikgnt_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Frikgnt_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Frikgnt_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Frikgnt_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Frikgnt_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Frikgnt_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Frikgnt_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Frikgnt_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Frikgnt_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Frikgnt_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Frikgnt_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Frikgnt_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Frikgnt_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Frikgnt_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Frikgnt_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Frikgnt_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Frikgnt_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.CHECK_BUTTONS
		 <multilinecomment>
  IF :FRBGRNT_CODE IS NULL THEN
     SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_OFF);
   ELSE
     SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_ON);
   END IF;

 
  IF :FRBGRNT_PROP_CODE IS NULL THEN
    SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
   ELSE
    SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON);
  END IF;

</multilinecomment>
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.CHECK_BUTTONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BUTTONS")
		public void Frikgnt_CheckButtons()
		{
			
				// IF :FRBGRNT_CODE IS NULL THEN
				// SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				// IF :FRBGRNT_PROP_CODE IS NULL THEN
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				// IF :FRBGRNT_CODE IS NULL THEN
				// SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				// IF :FRBGRNT_PROP_CODE IS NULL THEN
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON);
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.DISABLE_KEYS
		 BEGIN    
  SET_ITEM_PROPERTY('KEY_BLOCK.TITLE',ENABLED,PROPERTY_OFF);
 -- SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON);
  SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_ON);
IF G$_NAVIGATION_FRAME.GET_DESCRIPTION('FRAPROP','L')= 'Proposal(FRAPROP)' then
   G$_NAVIGATION_FRAME.ENABLE_OPTION('FRAPROP','L');
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Frikgnt_DisableKeys()
		{
			
				setItemEnabled("KEY_BLOCK.TITLE", false);
				//  SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON);
				setItemEnabled("FRBGRNT_GRANT_BTN", true);
				if ( getTask().getGoqrpls().getGNavigationFrame().getDescription(toStr("FRAPROP"), toStr("L")).equals("Proposal(FRAPROP)") )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("FRAPROP"), toStr("L"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('KEY_BLOCK.TITLE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KEY_BLOCK.TITLE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KEY_BLOCK.TITLE',NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('KEY_BLOCK.TITLE',UPDATEABLE,PROPERTY_ON);
     
END IF;
<multilinecomment>
IF GET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',NAVIGABLE,PROPERTY_OFF);
END IF;
</multilinecomment>
G$_NAVIGATION_FRAME.DISABLE_OPTION('FRAPROP','L');

IF GET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',NAVIGABLE,PROPERTY_OFF);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Frikgnt_EnableKeys()
		{
			
				if ( getItemEnabled("KEY_BLOCK.TITLE").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.TITLE", true);
					setItemNavigable("KEY_BLOCK.TITLE", true);
					setItemUpdateAllowed("KEY_BLOCK.TITLE", true);
				}
				// IF GET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED) = 'TRUE' THEN
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',NAVIGABLE,PROPERTY_OFF);
				// END IF;
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("FRAPROP"), toStr("L"));
				if ( getItemEnabled("FRBGRNT_GRANT_BTN").equals("TRUE") )
				{
					setItemEnabled("FRBGRNT_GRANT_BTN", false);
					setItemNavigable("FRBGRNT_GRANT_BTN", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.INVALID_FUNCTION_MSG
		    MESSAGE( 
    G$_NLS.Get('FRIKGNT-0005', 'FORM','Invalid function; press SHOW KEYS for valid functions.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Frikgnt_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FRIKGNT-0005"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Frikgnt_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Frikgnt_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.KEY-CLRFRM
		    CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER ('ENABLE_KEYS');
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;   
   GO_BLOCK('KEY_BLOCK');
   SET_BLOCK_PROPERTY('FRBGRNT',DEFAULT_WHERE,PROPERTY_ON);
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Frikgnt_ClearTask()
		{
			
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				goBlock(toStr("KEY_BLOCK"));
//				setBlockWhereClause("FRBGRNT", true);
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
--012899   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Frikgnt_Exit()
		{
				setGlobal("VALUE", toStr(""));
				// 
				// 012899   EXIT_FORM ;
//				clearTask();
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.KEY-NXTKEY
		    :WORKFLD := :SYSTEM.CURRENT_FIELD ;
--
   :WORKFLD := SUBSTR(:WORKFLD, 1, 8) ;
--
 
   :WORKFLD := RPAD(:WORKFLD, 12, 'CODE') ;
--
   :GLOBAL.VALUE := NAME_IN( NAME_IN( 'WORKFLD' ) ) ;


  
--   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Frikgnt_KeyNxtkey()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				setGlobal("VALUE", frbgrntElement.getFrbgrntCode());
				//    EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Frikgnt_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.LOAD_FORM_HEADER
		    EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
   :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
--
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
--
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
--
   :CURRENT_USER := :GLOBAL.USER_ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Frikgnt_LoadFormHeader()
		{
			
				executeAction("LOAD_CURRENT_RELEASE");
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				// 
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				// 
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				// 
				getFormModel().getFormHeader().setCurrentUser(getGlobal("USER_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.MNU_OPT_FOR_PROPOSAL
		 :global.prop_code := :frbgrnt_prop_code;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
IF :FRBGRNT_PROP_CODE IS NOT NULL THEN
g$_secured_form_call(:global.current_user,'FRAPROP','QUERY');
ELSE
MESSAGE( G$_NLS.Get('FRIKGNT-0010', 'FORM','Proposal Form can be accessed only when there is a valid Proposal Code.') ,NO_ACKNOWLEDGE);
END IF;

IF :FRBGRNT_PROP_CODE IS NOT NULL THEN
G$_NAVIGATION_FRAME.ENABLE_OPTION('FRAPROP','L');
ELSE
G$_NAVIGATION_FRAME.DISABLE_OPTION('FRAPROP','L');
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.MNU_OPT_FOR_PROPOSAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_FOR_PROPOSAL")
		public void Frikgnt_MnuOptForProposal()
		{
			

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement == null)
					return;
				
				setGlobal("PROP_CODE", frbgrntElement.getFrbgrntPropCode());
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				if ( !frbgrntElement.getFrbgrntPropCode().isNull() )
				{
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRAPROP"), toStr("QUERY"));
				}
				else {
					warningMessage(GNls.Fget(toStr("FRIKGNT-0010"), toStr("FORM"), toStr("Proposal Form can be accessed only when there is a valid Proposal Code.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
				if ( !frbgrntElement.getFrbgrntPropCode().isNull() )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("FRAPROP"), toStr("L"));
				}
				else {
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("FRAPROP"), toStr("L"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.MNU_OPT_FOR_GRANT
		 :global.grnt_code := :frbgrnt_code;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
IF :FRBGRNT_CODE IS NOT NULL THEN
g$_secured_form_call(:global.current_user,'FRAGRNT','QUERY');
ELSE
MESSAGE( G$_NLS.Get('FRIKGNT-0013', 'FORM','Grant Form can be accessed only when there is a valid Grant Code.') ,NO_ACKNOWLEDGE);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.MNU_OPT_FOR_GRANT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_FOR_GRANT")
		public void Frikgnt_MnuOptForGrant()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if(frbgrntElement == null)
					return;

				setGlobal("GRNT_CODE", frbgrntElement.getFrbgrntCode());
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				if ( !frbgrntElement.getFrbgrntCode().isNull() )
				{
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRAGRNT"), toStr("QUERY"));
				}
				else {
					warningMessage(GNls.Fget(toStr("FRIKGNT-0013"), toStr("FORM"), toStr("Grant Form can be accessed only when there is a valid Grant Code.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.WHEN-NEW-FORM-INSTANCE
		    G$_SET_WIN_PROPERTY;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
  -- G$_SETMENU('MAIN.BLOCK',1);
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Frikgnt_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER FRIKGNT.WHEN_NEW_BLOCK_INSTANCE_TRG
		 

 IF  :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
     SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_OFF);
     SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_OFF);
   
   --  SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON); 
     SET_ITEM_PROPERTY('FRBGRNT_GRANT_BTN',ENABLED,PROPERTY_ON);
 END IF; 
--

IF :CHECK_KEYS = 'Y' then
   :check_keys := 'N';
   IF :TITLE = '%'  THEN
     EXECUTE_QUERY;
     EXECUTE_TRIGGER('DISABLE_KEYS');
 ELSE  
    go_block('KEY_BLOCK');
     next_block; 
     execute_query;
     --EXECUTE_TRIGGER('DISABLE_KEYS');
   END IF;
 END IF;


IF :SYSTEM.CURSOR_BLOCK = 'FRBGRNT' THEN
     EXECUTE_QUERY;
     EXECUTE_TRIGGER('DISABLE_KEYS');
     G$_CHECK_FAILURE;
 ELSE
         EXECUTE_TRIGGER('ENABLE_KEYS');
     G$_CHECK_FAILURE;
      
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRIKGNT.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Frikgnt_WhenNewBlockInstanceTrg()
		{
			
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					setItemEnabled("FRBGRNT_PROPOSAL_BTN", false);
					setItemEnabled("FRBGRNT_GRANT_BTN", false);
					//   SET_ITEM_PROPERTY('FRBGRNT_PROPOSAL_BTN',ENABLED,PROPERTY_ON); 
					setItemEnabled("FRBGRNT_GRANT_BTN", true);
				}
				// 
				if ( getFormModel().getFormHeader().getCheckKeys().equals("Y") )
				{
					getFormModel().getFormHeader().setCheckKeys(toStr("N"));
					if ( getFormModel().getKeyBlock().getTitle().equals("%") )
					{
						executeQuery();
						executeAction("DISABLE_KEYS");
					}
					else {
						goBlock(toStr("KEY_BLOCK"));
						nextBlock();
						executeQuery();
					}
				}
				if ( getCursorBlock().equals("FRBGRNT") )
				{
					executeQuery();
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("ENABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
	
}
	
