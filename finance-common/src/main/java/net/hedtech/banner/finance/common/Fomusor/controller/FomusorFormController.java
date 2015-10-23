package net.hedtech.banner.finance.common.Fomusor.controller;
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fomusor.model.*;
import net.hedtech.banner.finance.common.Fomusor.*;
import net.hedtech.banner.finance.common.Fomusor.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class FomusorFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public FomusorFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FomusorTask getTask() {
		return (FomusorTask)super.getTask();
	}
	
	
	public FomusorModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Fomusor_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Fomusor_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Fomusor_BannerXeSendContext()
		{
			
				getGFormClass().bannerXeSendContext();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Fomusor_WhenCustomJavascriptEvent()
		{
				getGFormClass().WhenCustomJavascriptEvent();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Fomusor_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Fomusor_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Fomusor_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Fomusor_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Fomusor_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Fomusor_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Fomusor_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Fomusor_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Fomusor_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Fomusor_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Fomusor_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Fomusor_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Fomusor_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Fomusor_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Fomusor_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Fomusor_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Fomusor_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		
		
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Fomusor_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Fomusor_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Fomusor_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Fomusor_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Fomusor_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Fomusor_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Fomusor_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Fomusor_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Fomusor_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Fomusor_F6()
		{
			
				getGFormClass().f6();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Fomusor_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Fomusor_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Fomusor_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Fomusor_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Fomusor_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Fomusor_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Fomusor_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Fomusor_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Fomusor_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Fomusor_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Fomusor_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Fomusor_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Fomusor_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Fomusor_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Fomusor_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Fomusor_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Fomusor_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Fomusor_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Fomusor_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Fomusor_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Fomusor_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Fomusor_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Fomusor_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.PRE-UPDATE
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Fomusor_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();

		}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.PRE-INSERT
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Fomusor_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();

		}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.4';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Fomusor_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.MNU_DEL_FUND_TYPES
		 EXECUTE_TRIGGER( 'CHECK_KEYS_DELETE') ;
G$_CHECK_FAILURE ;
EXECUTE_TRIGGER( 'COMMIT_DUMMY') ;
G$_CHECK_FAILURE ;
GO_BLOCK( 'FORUSOR' ) ;
G$_CHECK_FAILURE ;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.MNU_DEL_FUND_TYPES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_DEL_FUND_TYPES")
		public void Fomusor_MnuDelFundTypes()
		{
			
				executeAction("CHECK_KEYS_DELETE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("COMMIT_DUMMY");
				getTask().getGoqrpls().gCheckFailure();
				goBlock(toStr("FORUSOR"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DECLARE 
  FIELD_NAME VARCHAR2(45);

BEGIN
IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
   field_name := :system.cursor_item;
END IF ;
--
IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK ('KEY_BLOCK') ;
   EXECUTE_TRIGGER ('CHECK_KEYS') ;
   G$_CHECK_FAILURE ;
   IF :COPY_USER_ID IS NOT NULL THEN
      EXECUTE_TRIGGER ( 'COMMIT_DUMMY' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
   GO_BLOCK( 'FORUSOR' ) ;
   EXECUTE_QUERY ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER ('DISABLE_KEYS');
   G$_CHECK_FAILURE;
   GO_ITEM (FIELD_NAME);
END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Fomusor_WhenNewBlockInstanceTrg()
		{
			
				{
					NString fieldName= NString.getNull();
					if ( getCursorBlock().notEquals("KEY_BLOCK") )
					{
						fieldName = toStr(getCursorItem());
					}
					// 
					if ( getFormModel().getKeyBlock().getCheckKeys().equals("Y") )
					{
						getFormModel().getKeyBlock().setCheckKeys(toStr("N"));
						goBlock(toStr("KEY_BLOCK"));
						executeAction("CHECK_KEYS");
						getTask().getGoqrpls().gCheckFailure();
						if ( !getFormModel().getKeyBlock().getCopyUserId().isNull() )
						{
							executeAction("COMMIT_DUMMY");
							getTask().getGoqrpls().gCheckFailure();
						}
						
						//TODO - erro de hasChanged == true
						goBlock(toStr("FORUSOR"));
						executeQuery();
						
						getFormModel().getKeyBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						getTask().getGoqrpls().gCheckFailure();
						goItem(fieldName);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.TRG_FAIL
		    NULL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.TRG_FAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TRG_FAIL")
		public void Fomusor_TrgFail()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.SAVE_KEYS
		    IF :KEY_BLOCK.USER_ID IS NOT NULL THEN
      :GLOBAL.SECR_USER := :KEY_BLOCK.USER_ID ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Fomusor_SaveKeys()
		{
			
				if ( !getFormModel().getKeyBlock().getUserId().isNull() )
				{
					setGlobal("SECR_USER", getFormModel().getKeyBlock().getUserId());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.LOAD_FORM_HEADER
		    :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
   :CURRENT_USER1 := :GLOBAL.USER_ID ;
    EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE'); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Fomusor_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentUser1(getGlobal("USER_ID"));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.KEY_MENU
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   20-Nov-2003 09:30 AM
 ******************************************</multilinecomment>

   :KEY_MENU_IND := 'Y' ;
--
   :FORM_HEADER.HOLD_CURRENT_BLOCK := :SYSTEM.CURRENT_BLOCK ;
--
   :FORM_HEADER.HOLD_CURRENT_FIELD := :SYSTEM.CURRENT_FIELD ;
--
   :GLOBAL.SECR_USER := :KEY_BLOCK.USER_ID ;
--
   null ;   -- BLOCK_MENU ;
--
   IF :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
      EXECUTE_TRIGGER( 'COPY_NULL' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SYSTEM.CURRENT_BLOCK = 'FORUSOR' THEN
      EXECUTE_TRIGGER( 'COPY_NULL' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      EXECUTE_TRIGGER( 'COPY_BLOCK_NAME' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   :KEY_MENU_IND := '' ;
--
   GO_BLOCK( :FORM_HEADER.HOLD_CURRENT_BLOCK ) ;
--
   GO_FIELD( :FORM_HEADER.HOLD_CURRENT_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_MENU")
		public void Fomusor_KeyMenu2()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 09:30 AM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 20-Nov-2003 09:30 AM
				// ******************************************
				getFormModel().getFormHeader().setKeyMenuInd(toStr("Y"));
				// 
				getFormModel().getFormHeader().setHoldCurrentBlock(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setHoldCurrentField(toStr(getCurrentField()));
				// 
				setGlobal("SECR_USER", getFormModel().getKeyBlock().getUserId());
				// 
				//  BLOCK_MENU ;
				// 
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					executeAction("COPY_NULL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getCurrentBlock().equals("FORUSOR") ) {
					executeAction("COPY_NULL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("COPY_BLOCK_NAME");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				getFormModel().getFormHeader().setKeyMenuInd(toStr(""));
				// 
				goBlock(getFormModel().getFormHeader().getHoldCurrentBlock());
				// 
				goItem(getFormModel().getFormHeader().getHoldCurrentField());
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('FOMUSOR-0000', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Fomusor_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FOMUSOR-0000"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.GLOBAL_COPY
		    :KEY_BLOCK.USER_ID := :GLOBAL.SECR_USER ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Fomusor_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setUserId(getGlobal("SECR_USER"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('KEY_BLOCK.USER_ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KEY_BLOCK.USER_ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KEY_BLOCK.USER_ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('COPY_USER_ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('COPY_USER_ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('COPY_USER_ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('INCLUDE_COAS_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('INCLUDE_COAS_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('INCLUDE_COAS_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('INCLUDE_ORGN_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('INCLUDE_ORGN_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('INCLUDE_ORGN_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('EXCLUDE_COAS_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('EXCLUDE_COAS_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('EXCLUDE_COAS_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('USER_ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('USER_ID_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('COPY_USER_ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('COPY_USER_ID_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('INCLUDE_COAS_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('INCLUDE_COAS_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('INCLUDE_ORGN_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('INCLUDE_ORGN_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('EXCLUDE_COAS_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('EXCLUDE_COAS_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('DELETE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('DELETE_BTN',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('DELETE_BTN',NAVIGABLE,PROPERTY_ON);
   G$_NAVIGATION_FRAME.ENABLE_OPTION('KEY_BLOCK', 'P');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Fomusor_EnableKeys()
		{
			
				if ( getItemEnabled("KEY_BLOCK.USER_ID").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.USER_ID", true);
					setItemNavigable("KEY_BLOCK.USER_ID", true);
				}
				if ( getItemEnabled("COPY_USER_ID").equals("FALSE") )
				{
					setItemEnabled("COPY_USER_ID", true);
					setItemNavigable("COPY_USER_ID", true);
				}
				if ( getItemEnabled("INCLUDE_COAS_CODE").equals("FALSE") )
				{
					setItemEnabled("INCLUDE_COAS_CODE", true);
					setItemNavigable("INCLUDE_COAS_CODE", true);
				}
				if ( getItemEnabled("INCLUDE_ORGN_CODE").equals("FALSE") )
				{
					setItemEnabled("INCLUDE_ORGN_CODE", true);
					setItemNavigable("INCLUDE_ORGN_CODE", true);
				}
				if ( getItemEnabled("EXCLUDE_COAS_CODE").equals("FALSE") )
				{
					setItemEnabled("EXCLUDE_COAS_CODE", true);
					setItemNavigable("EXCLUDE_COAS_CODE", true);
				}
				if ( getItemEnabled("EXCLUDE_ORGN_CODE").equals("FALSE") )
				{
					setItemEnabled("EXCLUDE_ORGN_CODE", true);
					setItemNavigable("EXCLUDE_ORGN_CODE", true);
				}
				// 
				if ( getItemEnabled("USER_ID_LBT").equals("FALSE") )
				{
					setItemEnabled("USER_ID_LBT", true);
				}
				if ( getItemEnabled("COPY_USER_ID_LBT").equals("FALSE") )
				{
					setItemEnabled("COPY_USER_ID_LBT", true);
				}
				if ( getItemEnabled("INCLUDE_COAS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("INCLUDE_COAS_CODE_LBT", true);
				}
				if ( getItemEnabled("INCLUDE_ORGN_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("INCLUDE_ORGN_CODE_LBT", true);
				}
				if ( getItemEnabled("EXCLUDE_COAS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("EXCLUDE_COAS_CODE_LBT", true);
				}
				if ( getItemEnabled("EXCLUDE_ORGN_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("EXCLUDE_ORGN_CODE_LBT", true);
				}
				if ( getItemEnabled("DELETE_BTN").equals("FALSE") )
				{
					setItemEnabled("DELETE_BTN", true);
					setItemNavigable("DELETE_BTN", true);
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("KEY_BLOCK"), toStr("P"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.DISABLE_KEYS
		    SET_ITEM_PROPERTY('KEY_BLOCK.USER_ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('COPY_USER_ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('INCLUDE_COAS_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('INCLUDE_ORGN_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('EXCLUDE_COAS_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE',ENABLED,PROPERTY_OFF);
--
   SET_ITEM_PROPERTY('USER_ID_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('COPY_USER_ID_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('INCLUDE_COAS_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('INCLUDE_ORGN_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('EXCLUDE_COAS_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('EXCLUDE_ORGN_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('DELETE_BTN',ENABLED,PROPERTY_OFF);
   G$_NAVIGATION_FRAME.DISABLE_OPTION('KEY_BLOCK', 'P');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Fomusor_DisableKeys()
		{
			
				setItemEnabled("KEY_BLOCK.USER_ID", false);
				setItemEnabled("COPY_USER_ID", false);
				setItemEnabled("INCLUDE_COAS_CODE", false);
				setItemEnabled("INCLUDE_ORGN_CODE", false);
				setItemEnabled("EXCLUDE_COAS_CODE", false);
				setItemEnabled("EXCLUDE_ORGN_CODE", false);
				// 
				setItemEnabled("USER_ID_LBT", false);
				setItemEnabled("COPY_USER_ID_LBT", false);
				setItemEnabled("INCLUDE_COAS_CODE_LBT", false);
				setItemEnabled("INCLUDE_ORGN_CODE_LBT", false);
				setItemEnabled("EXCLUDE_COAS_CODE_LBT", false);
				setItemEnabled("EXCLUDE_ORGN_CODE_LBT", false);
				setItemEnabled("DELETE_BTN", false);
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("KEY_BLOCK"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.COPY_NULL
		    :GLOBAL.CALLFRM := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.COPY_NULL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COPY_NULL")
		public void Fomusor_CopyNull()
		{
			
				setGlobal("CALLFRM", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.COPY_BLOCK_NAME
		    :GLOBAL.CALLFRM := :SYSTEM.CURRENT_BLOCK ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.COPY_BLOCK_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COPY_BLOCK_NAME")
		public void Fomusor_CopyBlockName()
		{
			
				setGlobal("CALLFRM", toStr(getCurrentBlock()));
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.WHEN-NEW-FORM-INSTANCE
		    G$_SET_WIN_PROPERTY ;
--
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('CHECK_WEB_BUDGET_ENABLING');
   G$_CHECK_FAILURE;
--
   G$_SET_INST_PROPERTY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Fomusor_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				// 
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_WEB_BUDGET_ENABLING");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.KEY-CLRFRM
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'ENABLE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   CLEAR_FORM ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Fomusor_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				goBlock("KEY_BLOCK");
			}

		
		/* Original PL/SQL code code for TRIGGER FOMUSOR.CHECK_WEB_BUDGET_ENABLING
		 DECLARE
	  ENABLE_IND  VARCHAR2(1);
BEGIN
	  ENABLE_IND := fbkbudg.F_CHECK_SYSC_WBUD_ENABLED;
	  IF ENABLE_IND = 'N' THEN
	  	  SET_ITEM_PROPERTY('FORUSOR.FORUSOR_WBUD_ACCESS_IND',ENABLED,PROPERTY_OFF);
	  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOMUSOR.CHECK_WEB_BUDGET_ENABLING
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_WEB_BUDGET_ENABLING")
		public void Fomusor_CheckWebBudgetEnabling()
		{
			
				{
					NString enableInd= NString.getNull();
					enableInd = Fbkbudg.fCheckSyscWbudEnabled();
					if ( enableInd.equals("N") )
					{
						setItemEnabled("FORUSOR.FORUSOR_WBUD_ACCESS_IND", false);
					}
				}
			}

		
	
}
	
