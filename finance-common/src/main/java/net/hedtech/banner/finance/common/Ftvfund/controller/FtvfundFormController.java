package net.hedtech.banner.finance.common.Ftvfund.controller;
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Ftvfund.model.*;
import net.hedtech.banner.finance.common.Ftvfund.*;
import net.hedtech.banner.finance.common.Ftvfund.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class FtvfundFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public FtvfundFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FtvfundTask getTask() {
		return (FtvfundTask)super.getTask();
	}
	
	
	public FtvfundModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Ftvfund_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Ftvfund_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Ftvfund_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Ftvfund_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Ftvfund_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Ftvfund_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Ftvfund_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Ftvfund_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Ftvfund_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Ftvfund_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Ftvfund_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Ftvfund_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Ftvfund_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Ftvfund_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Ftvfund_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Ftvfund_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Ftvfund_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Ftvfund_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Ftvfund_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Ftvfund_TaskStarted(EventObject args)
		{
			
				getGFormClass().taskStarted(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Ftvfund_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Ftvfund_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Ftvfund_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Ftvfund_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Ftvfund_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Ftvfund_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Ftvfund_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Ftvfund_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Ftvfund_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Ftvfund_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Ftvfund_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Ftvfund_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Ftvfund_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Ftvfund_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Ftvfund_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Ftvfund_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Ftvfund_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Ftvfund_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Ftvfund_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Ftvfund_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Ftvfund_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Ftvfund_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Ftvfund_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Ftvfund_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Ftvfund_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Ftvfund_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Ftvfund_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Ftvfund_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Ftvfund_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Ftvfund_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Ftvfund_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Ftvfund_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Ftvfund_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Ftvfund_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Ftvfund_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
				
				//////////
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Ftvfund_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-LISTVAL
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Ftvfund_ListValues()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Ftvfund_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-CLRBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void Ftvfund_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Ftvfund_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.UPDATE_USER_ID
		    :WORKUSER := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKUSER := SUBSTR(:WORKUSER, 1, 7) ;
--
   :WORKUSER := RPAD(:WORKUSER, 15, '_USER_ID') ;
--
   COPY( :CURRENT_USER, :WORKUSER ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.UPDATE_USER_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_USER_ID")
		public void Ftvfund_UpdateUserId()
		{
			
				getFormModel().getFormHeader().setWorkuser(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkuser(substring(getFormModel().getFormHeader().getWorkuser(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkuser(toStr(rpad(getFormModel().getFormHeader().getWorkuser(), 15, "_USER_ID")));
				// 
				copy(getFormModel().getFormHeader().getCurrentUser(),getFormModel().getFormHeader().getWorkuser());
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.UPDATE_ACTIVITY_DATE
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
		 * FTVFUND.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Ftvfund_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.INVALID_FUNCTION_MSG
		    MESSAGE(
    G$_NLS.Get('FTVFUND-0003', 'FORM','Invalid function; press SHOW KEYS for valid functions.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Ftvfund_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FTVFUND-0003"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('FTVFUND_COAS_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_COAS_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_COAS_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_DATA_ENTRY_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_DATA_ENTRY_IND',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_DATA_ENTRY_IND',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_EFF_DATE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_EFF_DATE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_EFF_DATE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_FTYP_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_FUND_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_FUND_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_FUND_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_STATUS_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_STATUS_IND',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_STATUS_IND',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_TERM_DATE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_TERM_DATE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_TERM_DATE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_TITLE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_TITLE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_TITLE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_COAS_CODE_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('FTVFUND_COAS_CODE_LBT',ENABLED,PROPERTY_ON);
SET_ITEM_PROPERTY('FTVFUND_COAS_CODE_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_FTYP_CODE_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE_LBT',ENABLED,PROPERTY_ON);
SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_FUND_CODE_LBT',ENABLED) = 'FALSE' THEN
SET_ITEM_PROPERTY('FTVFUND_FUND_CODE_LBT',ENABLED,PROPERTY_ON);
SET_ITEM_PROPERTY('FTVFUND_FUND_CODE_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FTVFUND_GRNT_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FTVFUND_GRNT_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('FTVFUND_GRNT_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Ftvfund_EnableKeys()
		{
			
				if ( getItemEnabled("FTVFUND_COAS_CODE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_COAS_CODE", true);
					setItemNavigable("FTVFUND_COAS_CODE", true);
				}
				if ( getItemEnabled("FTVFUND_DATA_ENTRY_IND").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_DATA_ENTRY_IND", true);
					setItemNavigable("FTVFUND_DATA_ENTRY_IND", true);
				}
				if ( getItemEnabled("FTVFUND_EFF_DATE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_EFF_DATE", true);
					setItemNavigable("FTVFUND_EFF_DATE", true);
				}
				if ( getItemEnabled("FTVFUND_FTYP_CODE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_FTYP_CODE", true);
					setItemNavigable("FTVFUND_FTYP_CODE", true);
				}
				if ( getItemEnabled("FTVFUND_FUND_CODE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_FUND_CODE", true);
					setItemNavigable("FTVFUND_FUND_CODE", true);
				}
				if ( getItemEnabled("FTVFUND_STATUS_IND").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_STATUS_IND", true);
					setItemNavigable("FTVFUND_STATUS_IND", true);
				}
				if ( getItemEnabled("FTVFUND_TERM_DATE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_TERM_DATE", true);
					setItemNavigable("FTVFUND_TERM_DATE", true);
				}
				if ( getItemEnabled("FTVFUND_TITLE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_TITLE", true);
					setItemNavigable("FTVFUND_TITLE", true);
				}
				if ( getItemEnabled("FTVFUND_COAS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_COAS_CODE_LBT", true);
//					setItemNavigable("FTVFUND_COAS_CODE_LBT", true);
				}
				if ( getItemEnabled("FTVFUND_FTYP_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_FTYP_CODE_LBT", true);
//					setItemNavigable("FTVFUND_FTYP_CODE_LBT", true);
				}
				if ( getItemEnabled("FTVFUND_FUND_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_FUND_CODE_LBT", true);
//					setItemNavigable("FTVFUND_FUND_CODE_LBT", true);
				}
				if ( getItemEnabled("FTVFUND_GRNT_CODE").equals("FALSE") )
				{
					setItemEnabled("FTVFUND_GRNT_CODE", true);
					setItemNavigable("FTVFUND_GRNT_CODE", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.DISABLE_KEYS
		    SET_ITEM_PROPERTY('FTVFUND_COAS_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_DATA_ENTRY_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_EFF_DATE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_FUND_CODE',ENABLED,PROPERTY_OFF);   
   SET_ITEM_PROPERTY('FTVFUND_STATUS_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_TERM_DATE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_TITLE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_COAS_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_FTYP_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_FUND_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FTVFUND_GRNT_CODE',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Ftvfund_DisableKeys()
		{
			
				setItemEnabled("FTVFUND_COAS_CODE", false);
				setItemEnabled("FTVFUND_DATA_ENTRY_IND", false);
				setItemEnabled("FTVFUND_EFF_DATE", false);
				setItemEnabled("FTVFUND_FTYP_CODE", false);
				setItemEnabled("FTVFUND_FUND_CODE", false);
				setItemEnabled("FTVFUND_STATUS_IND", false);
				setItemEnabled("FTVFUND_TERM_DATE", false);
				setItemEnabled("FTVFUND_TITLE", false);
				setItemEnabled("FTVFUND_COAS_CODE_LBT", false);
				setItemEnabled("FTVFUND_FTYP_CODE_LBT", false);
				setItemEnabled("FTVFUND_FUND_CODE_LBT", false);
				setItemEnabled("FTVFUND_GRNT_CODE", false);
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-NXTREC
		    NEXT_RECORD ;
--
   IF :FTVFUND.ROWID IS NULL  THEN
      PREVIOUS_RECORD ;
      MESSAGE( G$_NLS.Get('FTVFUND-0016', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Ftvfund_NextRecord()
		{
			

				FtvfundAdapter ftvfundElement = (FtvfundAdapter)this.getFormModel().getFtvfund().getRowAdapter(true);
				if(ftvfundElement != null)
				{
					nextRecord();
					// 
					if ( ftvfundElement.getRowState().equals(DataRowStatus.INSERTED) )
					{
						previousRecord();
						infoMessage(GNls.Fget(toStr("FTVFUND-0016"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY_NXTKEY_TRG
		    :WORKFLD := :SYSTEM.CURRENT_FIELD ;
--
   :WORKFLD := SUBSTR(:WORKFLD, 1, 8) ;
--
   :WORKFLD := RPAD(:WORKFLD, 13, SUBSTR(:WORKFLD, 4, 5)) ;
--
   :WORKFLD := RPAD(:WORKFLD, 17, 'CODE') ;
--
   :GLOBAL.VALUE := NAME_IN( NAME_IN( 'WORKFLD' ) ) ;
--
--   EXIT_FORM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Ftvfund_KeyNxtkeyTrg()
		{
				//adicionado por mim
				FtvfundAdapter ftvfundElement = (FtvfundAdapter) this.getFormModel().getFtvfund().getRowAdapter(true); 
			
				getFormModel().getFormHeader().setWorkfld(toStr(getCurrentField()));
				// 
				getFormModel().getFormHeader().setWorkfld(substring(getFormModel().getFormHeader().getWorkfld(), toInt(1), toInt(8)));
				// 
				getFormModel().getFormHeader().setWorkfld(toStr(rpad(getFormModel().getFormHeader().getWorkfld(), 13, substring(getFormModel().getFormHeader().getWorkfld(), toInt(4), toInt(5)).getValue())));
				// 
				getFormModel().getFormHeader().setWorkfld(toStr(rpad(getFormModel().getFormHeader().getWorkfld(), 17, "CODE")));
				// 
				setGlobal("VALUE", ftvfundElement.getValue("FTVFUND_FUND_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY_EXIT_TRG
		    :GLOBAL.VALUE := '' ;
--
--   EXIT_FORM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Ftvfund_KeyExitTrg()
		{
			
				setGlobal("VALUE", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-DELREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Ftvfund_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-CLRFRM
		    CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Ftvfund_ClearTask()
		{
			
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
--
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Ftvfund_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
--
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Ftvfund_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
