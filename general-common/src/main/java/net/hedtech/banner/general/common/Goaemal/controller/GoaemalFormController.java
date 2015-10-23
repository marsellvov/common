package net.hedtech.banner.general.common.Goaemal.controller;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goaemal.model.*;
import net.hedtech.banner.general.common.Goaemal.*;
import net.hedtech.banner.general.common.Goaemal.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GoaemalFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GoaemalFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GoaemalTask getTask() {
		return (GoaemalTask)super.getTask();
	}
	
	
	public GoaemalModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Goaemal_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Goaemal_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Goaemal_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Goaemal_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Goaemal_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Goaemal_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Goaemal_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Goaemal_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Goaemal_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Goaemal_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Goaemal_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Goaemal_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Goaemal_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Goaemal_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Goaemal_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Goaemal_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Goaemal_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Goaemal_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Goaemal_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Goaemal_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Goaemal_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Goaemal_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Goaemal_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Goaemal_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Goaemal_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Goaemal_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Goaemal_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Goaemal_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-CLRFRM
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_CLRFRM;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to control the behavior of the current form
--         when it has been invoked as part of a Workflow activity
--         and a user attempts to rollback the form.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has not
--         been invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_ROLLBACK');
--
  EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Goaemal_ClearTask()
		{
			
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyClrfrm();
//				getTask().getGoqrpls().gCheckFailure();
			
			executeAction("SAVE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("ENABLE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			clearTask();
			if ( getTaskStatus().equals("CHANGED") )
			{
				executeAction("DISABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				return ;
			}
			executeAction("LOAD_FORM_HEADER");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("GLOBAL_COPY");
			getTask().getGoqrpls().gCheckFailure();
			
//				// 
//				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to control the behavior of the current form
//				//          when it has been invoked as part of a Workflow activity
//				//          and a user attempts to rollback the form.
//				// 
//				//          If Workflow is not installed or is not enabled at
//				//          a client site, or if the current form has not
//				//          been invoked as part of a Workflow activity, the
//				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
				getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_ROLLBACK"));
				// 
				executeAction("DISABLE_TAB_PAGES");
				getTask().getGoqrpls().gCheckFailure();
				
				goBlock(toStr("KEY_BLOCK"));	
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Goaemal_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Goaemal_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Goaemal_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Goaemal_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaemal_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Goaemal_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Goaemal_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Goaemal_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaemal_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Goaemal_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Goaemal_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Goaemal_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Goaemal_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Goaemal_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Goaemal_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Goaemal_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Goaemal_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Goaemal_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Goaemal_SaveKeys()
		{
			
//				getGFormClass().saveKeys();
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				setGlobal("KEY_NAME", getFormModel().getKeyBlock().getKeyblockName());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Goaemal_EnableKeys()
		{
			/*getGFormClass().enableKeys();*/
				
			setItemEnabled("ID", true);
			setItemNavigable("ID", true);
			setItemEnabled("ID_LBT", true);
			setItemEnabled("KEYBLOCK_NAME", true);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Goaemal_DisableKeys()
		{
			/*getGFormClass().disableKeys();*/
				
			setItemEnabled("ID", false);
			setItemEnabled("ID_LBT", false);
			setItemEnabled("KEYBLOCK_NAME", false);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Goaemal_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Goaemal_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Goaemal_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Goaemal_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.2.0.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goaemal_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.LOAD_FORM_HEADER
		 BEGIN
  :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
  :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
  :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
  :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
  :CURRENT_USER := :GLOBAL.CURRENT_USER;
  EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
END;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Goaemal_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getGlobal("CURRENT_USER"));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  SHOW_VIEW('G$_IDEN_TAB_CANVAS');
--
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GLOBAL_COPY');
  G$_CHECK_FAILURE;
--
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
  SET_MENU_ITEM_PROPERTY('Main.Block',ENABLED,PROPERTY_ON);
  :email_ind := 'Y';
--
  EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Goaemal_TaskStarted(EventObject args)
		{
			
				showView("G$_IDEN_TAB_CANVAS");
				// 
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				setMenuItemEnabled("Main.Block", true);
				getFormModel().getFormHeader().setEmailInd(toStr("Y"));
				// 
				executeAction("DISABLE_TAB_PAGES");
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.WHEN-TAB-PAGE-CHANGED
		 DECLARE
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN
  IF tab_topmost = 'EMAIL_TAB' THEN
  	GO_BLOCK('GOREMAL');
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Goaemal_tabChange()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					if ( tabTopmost.equals("EMAIL_TAB") )
					{
						goBlock(toStr("GOREMAL"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.DISABLE_TAB_PAGES
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.DISABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TAB_PAGES")
		public void Goaemal_DisableTabPages()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.ENABLE_TAB_PAGES
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.ENABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TAB_PAGES")
		public void Goaemal_EnableTabPages()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.GLOBAL_COPY
		 IF :GLOBAL.KEY_IDNO IS NOT NULL THEN
  :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO;
  NEXT_FIELD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Goaemal_GlobalCopy()
		{
					
			
			if ( !getGlobal("KEY_IDNO").isNull() )
			{
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				getFormModel().getKeyBlock().setKeyblockName(getGlobal("KEY_NAME"));
			}
		}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-EXIT
		 -- 301-3
:GLOBAL.PIDM := :KEY_BLOCK.PIDM;
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
:GLOBAL.VALUE := '';
--
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Goaemal_Exit()
		{
			
				//  301-3
				//  301-3
				setGlobal("PIDM", toStr(getFormModel().getKeyBlock().getPidm()));
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				setGlobal("VALUE", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-PRVBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Goaemal_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-NXTSET
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Goaemal_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-NXTBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Goaemal_NextBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAEMAL.KEY-DUP-ITEM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAEMAL.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Goaemal_KeyDupItem()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
	
}
	
