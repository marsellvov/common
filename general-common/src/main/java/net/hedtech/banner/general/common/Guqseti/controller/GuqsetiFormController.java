package net.hedtech.banner.general.common.Guqseti.controller;

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
import net.hedtech.banner.general.common.Guqseti.model.*;
import net.hedtech.banner.general.common.Guqseti.*;
import net.hedtech.banner.general.common.Guqseti.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GValFormClass;	
		

public class GuqsetiFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GValFormClass getGValFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GValFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_VAL_FORM_CLASS");
	}	
		
	
	
	public GuqsetiFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuqsetiTask getTask() {
		return (GuqsetiTask)super.getTask();
	}
	
	
	public GuqsetiModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guqseti_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guqseti_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guqseti_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guqseti_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guqseti_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guqseti_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Guqseti_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guqseti_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Guqseti_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guqseti_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guqseti_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guqseti_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guqseti_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guqseti_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guqseti_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guqseti_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guqseti_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guqseti_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guqseti_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Guqseti_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
  EXECUTE_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guqseti_WhenNewBlockInstanceTrg()
		{
			
				executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guqseti_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guqseti_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guqseti_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guqseti_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guqseti_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.KEY-CLRFRM
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
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guqseti_ClearTask()
		{
			
				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyClrfrm();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
				//          procedure to control the behavior of the current form
				//          when it has been invoked as part of a Workflow activity
				//          and a user attempts to rollback the form.
				// 
				//          If Workflow is not installed or is not enabled at
				//          a client site, or if the current form has not
				//          been invoked as part of a Workflow activity, the
				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
				//          any Workflow function.
				// 
				getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_ROLLBACK"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guqseti_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guqseti_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guqseti_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Guqseti_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Guqseti_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guqseti_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guqseti_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guqseti_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guqseti_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guqseti_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guqseti_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guqseti_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guqseti_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guqseti_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guqseti_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guqseti_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guqseti_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.KEY-EXIT
		 BEGIN
  EXECUTE_TRIGGER('EXIT_PROCEDURE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guqseti_Exit()
		{
			
				executeAction("EXIT_PROCEDURE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guqseti_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.KEY-NXTKEY
		 BEGIN
  EXECUTE_TRIGGER('EXIT_PROCEDURE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guqseti_KeyNxtkey()
		{
			
				executeAction("EXIT_PROCEDURE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guqseti_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guqseti_GlobalCopy()
		{
			
			getGFormClass().globalCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guqseti_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guqseti_LoadFormHeader()
		{
			
			getGFormClass().loadFormHeader();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guqseti_SaveKeys()
		{
			
			getGFormClass().saveKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guqseti_EnableKeys()
		{
			
			getGFormClass().enableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guqseti_DisableKeys()
		{
			
			getGFormClass().disableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guqseti_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guqseti_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guqseti_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guqseti_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Guqseti_recordChange()
		{
			
			getGValFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6.4';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guqseti_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
--   
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  G$_MENU_BAR.SET_FGAC_NOTICE;
END;
		*/
		/*
		 *<p>
		 *The KEY-STARTUP trigger loads the form header information and goes to the
		 *next block.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guqseti_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				//    
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().getGMenuBar().setFgacNotice();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQSETI.EXIT_PROCEDURE
		 DECLARE
  pl_name VARCHAR2(30) := 'PREFERENCES'; 
  pl_id   PARAMLIST    := GET_PARAMETER_LIST(pl_name);
BEGIN
  :GLOBAL.SET_INST := 'Y';
--
  g$_vpdi_security.g$_vpdi_set_home_context(:GUISETI.VPDI_CODE);
  g$_vpdi_security.g$_vpdi_set_user_default(:GUISETI.VPDI_CODE);
--
  pl_id := GET_PARAMETER_LIST(pl_name); 
  IF ID_NULL(pl_id) THEN 
    pl_id := CREATE_PARAMETER_LIST(pl_name); 
  END IF;
--
  ADD_PARAMETER(pl_id,'LAUNCH_FORM',TEXT_PARAMETER,:PARAMETER.LAUNCH_FORM);  
  ADD_PARAMETER(pl_id,'KEEP_ALIVE',TEXT_PARAMETER,:PARAMETER.KEEP_ALIVE);  
  ADD_PARAMETER(pl_id,'TIMING',TEXT_PARAMETER,:PARAMETER.TIMING);  
-- -- Banner XE Parameters
  ADD_PARAMETER(pl_id,'BAN_MODE',TEXT_PARAMETER,:PARAMETER.BAN_MODE); 
  ADD_PARAMETER(pl_id,'BAN_ARGS',TEXT_PARAMETER,:PARAMETER.BAN_ARGS);  
--
  G$_SECURED_FORM_CALL_PL(USER,'GUAINIT',pl_id,'NEW');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQSETI.EXIT_PROCEDURE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EXIT_PROCEDURE")
		public void Guqseti_ExitProcedure()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GuisetiAdapter guisetiElement = (GuisetiAdapter)this.getFormModel().getGuiseti().getRowAdapter(true);


				{
					NString plName = toStr("PREFERENCES");
					Hashtable plId = getParameterList(plName);
					setGlobal("SET_INST", toStr("Y"));
					// 
					GVpdiSecurity.gVpdiSetHomeContext(guisetiElement.getVpdiCode());
					GVpdiSecurity.gVpdiSetUserDefault(guisetiElement.getVpdiCode());
					// 
					plId = getParameterList(plName);
					if ( (plId == null) )
					{
						plId = createParameterList(plName);
					}
					// 
					addParameter(plId, "LAUNCH_FORM", this.getFormModel().getParam("LAUNCH_FORM", NString.class));
					addParameter(plId, "KEEP_ALIVE", this.getFormModel().getParam("KEEP_ALIVE", NString.class));
					addParameter(plId, "TIMING", this.getFormModel().getParam("TIMING", NString.class));
					//  -- Banner XE Parameters
					addParameter(plId, "BAN_MODE", this.getFormModel().getParam("BAN_MODE", NString.class));
					addParameter(plId, "BAN_ARGS", this.getFormModel().getParam("BAN_ARGS", NString.class));
					// 
					getTask().getGoqrpls().gSecuredFormCallPl(getUser(), toStr("GUAINIT"), plId, toStr("NEW"));
				}
			}

		
	
}
	
