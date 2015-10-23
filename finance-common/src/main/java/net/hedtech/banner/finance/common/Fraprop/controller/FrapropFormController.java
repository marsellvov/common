package net.hedtech.banner.finance.common.Fraprop.controller;
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.util.globals.Globals.removeGlobal;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;
import net.hedtech.general.common.forms.controller.DefaultFormController;

public class FrapropFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public FrapropFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}
	
	
	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Fraprop_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Fraprop_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Fraprop_BannerXeSendContext()
		{
			
				getGFormClass().bannerXeSendContext();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Fraprop_WhenCustomJavascriptEvent()
		{
			
				getGFormClass().WhenCustomJavascriptEvent(); //.whenCustomJavascriptEvent();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Fraprop_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Fraprop_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Fraprop_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Fraprop_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Fraprop_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Fraprop_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Fraprop_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Fraprop_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Fraprop_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Fraprop_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Fraprop_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Fraprop_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Fraprop_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ON-ROLLBACK
		 -- sq Added this trigger for messaging.
DECLARE
  lv_role  VARCHAR2(30) := '';
BEGIN 
--
-- Attempt to determine current role to know whether or not to call the discard.
-- If the user has pressed the exit key, then when the user reaches this point,
-- they have completed the G$_REVOKE_ACCESS routine which revoked all privileges.
--
  BEGIN
	  SELECT ROLE
	    INTO lv_role
	    FROM SESSION_ROLES;
	EXCEPTION
	  WHEN OTHERS THEN
	    NULL;
	END;
--
-- Call the discard method and then issue a rollback.
--
  IF NVL(lv_role,'NONE') <> 'NONE' THEN
    GB_COMMON.P_ROLLBACK('NO ROLLBACK');
    ISSUE_ROLLBACK('');
--
    EXECUTE_TRIGGER('ON_ROLLBACK_TRG');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Fraprop_OnRollback()
		{
			
				//  sq Added this trigger for messaging.
				int rowCount = 0;
				{
					NString lvRole = toStr("");
					try
					{
						String sql1 = "SELECT ROLE " +
	" FROM SESSION_ROLES ";
						DataCommand command1 = new DataCommand(sql1);
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							lvRole = results1.getStr(0);
						}
						results1.close();
					}
					catch(Exception  e)
					{
					}
					// 
					//  Call the discard method and then issue a rollback.
					// 
					if ( isNull(lvRole, "NONE").notEquals("NONE") )
					{
						GbCommon.pRollback(toStr("NO ROLLBACK"));
						issueRollback("");
						// 
						executeAction("ON_ROLLBACK_TRG");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Fraprop_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Fraprop_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Fraprop_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Fraprop_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Fraprop_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN-NEW-BLOCK-INSTANCE
		 BEGIN
  G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
  G$_CHECK_FAILURE;
--
  IF G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED = 'N' THEN
    G$_DO_NEW_MESSAGES_EXIST;
    G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED := 'Y';
  END IF;
--
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to control the 
--         behavior of the Key Block when the current form has been invoked as part of
--         a Workflow activity.
--
--         If Workflow is not installed or is not enabled at a client site, or if the current 
--         form has not been invoked as part of a Workflow activity, the G$_WF_DRIVER.WF_EXECUTE
--         procedure will not perform any Workflow function.
--
  G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_KEY_BLOCK');

  EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Fraprop_blockChange()
		{
			
				getTask().getGoqrpls().getGNavigationFrame().populateGuroptm();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed.equals("N") )
				{
					getTask().getGoqrpls().gDoNewMessagesExist();
					getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed = toStr("Y");
				}
				// 
				// 
				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to control the 
				//          behavior of the Key Block when the current form has been invoked as part of
				//          a Workflow activity.
				// 
				//          If Workflow is not installed or is not enabled at a client site, or if the current 
				//          form has not been invoked as part of a Workflow activity, the G$_WF_DRIVER.WF_EXECUTE
				//          procedure will not perform any Workflow function.
				// 
				getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_KEY_BLOCK"));
				executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Fraprop_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Fraprop_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Fraprop_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN-WINDOW-CLOSED
		 DECLARE
		alert_button NUMBER;
BEGIN
		execute_trigger('get_percentage_total');
		g$_check_failure;
		execute_trigger('check_duplicate_agency_code');
		g$_check_failure;
	IF :SYSTEM.BLOCK_STATUS = 'CHANGED'  THEN 			
		alert_button := Show_Alert('G$_EXIT_FORM_ALERT');
		IF alert_button = ALERT_BUTTON1 THEN
			go_block('frrprpt');
			execute_trigger('key-commit');
			g$_check_failure;
		END IF;
		IF alert_button = ALERT_BUTTON2 THEN
			NULL;
		END IF;
		IF alert_button = ALERT_BUTTON3 THEN
			RAISE form_trigger_failure;
		END IF;
		
		go_block('frrprpt');
		g$_check_failure;
		clear_block(no_validate);
		:form_header.total := '';
		g$_check_failure;
		IF :frbprop.display_pass_thru_ind = 'Y' THEN
				execute_trigger('one_record_mandatory');
				G$_CHECK_FAILURE;
				execute_trigger('get_percentage_total');
				G$_CHECK_FAILURE;
		END IF;
	END IF;

		G$_WIN_CLOSED;     
  	G$_CHECK_FAILURE;
  	IF name_in('SYSTEM.EVENT_WINDOW') = 'PASS_THRU_IND_INFO' THEN
    		go_block('FRBPROP');
    		G$_CHECK_FAILURE;
  	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Fraprop_WhenWindowClosed()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				{
					NNumber alertButton= NNumber.getNull();
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("check_duplicate_agency_code");
					getTask().getGoqrpls().gCheckFailure();
					if ( getBlockStatus().equals("CHANGED") )
					{
						alertButton = toNumber(showAlert("G$_EXIT_FORM_ALERT"));
						if ( alertButton.equals(MessageServices.BUTTON1) )
						{
							goBlock(toStr("frrprpt"));
							executeAction("key-commit");
							getTask().getGoqrpls().gCheckFailure();
						}
						if ( alertButton.equals(MessageServices.BUTTON2) )
						{
						}
						if ( alertButton.equals(MessageServices.BUTTON2) )
						{
							throw new ApplicationException();
						}
						goBlock(toStr("frrprpt"));
						getTask().getGoqrpls().gCheckFailure();
						clearBlock(TaskServices.NO_VALIDATE);
						getFormModel().getFormHeader().setTotal(toNumber(""));
						getTask().getGoqrpls().gCheckFailure();
						if ( frbpropElement.getDisplayPassThruInd().equals("Y") )
						{
							executeAction("one_record_mandatory");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("get_percentage_total");
							getTask().getGoqrpls().gCheckFailure();
						}
					}
					getTask().getGoqrpls().gWinClosed();
					getTask().getGoqrpls().gCheckFailure();
					if ( getCurrentWindow().equals("PASS_THRU_IND_INFO") )
					{
						goBlock(toStr("FRBPROP"));
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Fraprop_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Fraprop_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Fraprop_F6()
		{
			
				getGFormClass().f6();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Fraprop_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Fraprop_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Fraprop_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Fraprop_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Fraprop_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Fraprop_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Fraprop_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Fraprop_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Fraprop_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Fraprop_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Fraprop_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Fraprop_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Fraprop_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Fraprop_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Fraprop_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Fraprop_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Fraprop_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance(); //.recordChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.LOAD_FORM_HEADER
		    :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
--
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
--
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
--
   :CURRENT_USER1 := :GLOBAL.USER_ID ;
   EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE'); 
   EXECUTE_TRIGGER('GLOBAL_COPY'); 
   :from_new_item := 'I';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Fraprop_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				// 
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				// 
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				// 
				getFormModel().getFormHeader().setCurrentUser1(getGlobal("USER_ID"));
				executeAction("LOAD_CURRENT_RELEASE");
				executeAction("GLOBAL_COPY");
				getFormModel().getFormHeader().setFromNewItem(toStr("I"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.LIST_VALUES_COPY
		   COPY( :GLOBAL.VALUE, :SYSTEM.CURRENT_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Fraprop_ListValuesCopy()
		{
			
				copy(getGlobal("VALUE"), getCurrentField());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-HELP
		 help;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Fraprop_Help()
		{
			
				// F2J_NOT_SUPPORTED *: Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.SQLFORMS.Help();
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-NXTKEY
		 EXECUTE_TRIGGER('GET_ITEM_NAME');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Fraprop_KeyNxtkey()
		{
			
				executeAction("GET_ITEM_NAME");
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.COPY_GLOBALS
		 :GOT_PIDM := :GLOBAL.AGCY_PRED_PIDM ;
--
   IF :GOT_PIDM = :FRBPROP_AGENCY_PRED_PIDM OR ( :GOT_PIDM IS
       NULL AND :FRBPROP_AGENCY_PRED_PIDM  IS NULL ) THEN
      EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         GOTO SAME ;
      END IF ;
   END IF ;
--
   << DIFF >>
   :FRBPROP_AGENCY_PRED_PIDM := :GLOBAL.AGCY_PRED_PIDM ;
   :FRBPROP_agency_pred_name := :GLOBAL.AGCY_PRED_NAME ;
   :FRBPROP_agency_pred_code := :GLOBAL.AGCY_PRED_ID ;
   :HOLD_PRED := :GLOBAL.AGCY_PRED_ID ;
--
   << SAME >>
    ERASE( 'GLOBAL.AGCY_NAME' ) ;
--
   ERASE( 'GLOBAL.AGCY_PRED_NAME' ) ;
--
   ERASE( 'GLOBAL.AGCY_PRED_ID' ) ;
--
   ERASE( 'GLOBAL.AGCY_ID' ) ;
   ERASE( 'GLOBAL.AGCY_PRED_PIDM' ) ;
--
   ERASE( 'GLOBAL.AGCY_PIDM' ) ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.COPY_GLOBALS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COPY_GLOBALS")
		public void Fraprop_CopyGlobals()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getFormModel().getFormHeader().setGotPidm(getGlobal("AGCY_PRED_PIDM"));
				// 
				if ( getFormModel().getFormHeader().getGotPidm().equals(frbpropElement.getFrbpropAgencyPredPidm()) || (getFormModel().getFormHeader().getGotPidm().isNull() && frbpropElement.getFrbpropAgencyPredPidm().isNull()) )
				{
					try {
						executeAction("TRG_FAIL");
//						if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							 goto SAME;
//						}
					} catch (Exception e) {
						removeGlobal("GLOBAL.AGCY_NAME");
						//
						removeGlobal("GLOBAL.AGCY_PRED_NAME");
						//
						removeGlobal("GLOBAL.AGCY_PRED_ID");
						//
						removeGlobal("GLOBAL.AGCY_ID");
						removeGlobal("GLOBAL.AGCY_PRED_PIDM");
						//
						removeGlobal("GLOBAL.AGCY_PIDM");
						return;
					}
				}
//				 DIFF:;
				frbpropElement.setFrbpropAgencyPredPidm(toNumber(getGlobal("AGCY_PRED_PIDM")));
				frbpropElement.setFrbpropAgencyPredName(getGlobal("AGCY_PRED_NAME"));
				frbpropElement.setFrbpropAgencyPredCode(getGlobal("AGCY_PRED_ID"));
				getFormModel().getFormHeader().setHoldPred(getGlobal("AGCY_PRED_ID"));
//				 SAME:;
				removeGlobal("GLOBAL.AGCY_NAME");
				// 
				removeGlobal("GLOBAL.AGCY_PRED_NAME");
				// 
				removeGlobal("GLOBAL.AGCY_PRED_ID");
				// 
				removeGlobal("GLOBAL.AGCY_ID");
				removeGlobal("GLOBAL.AGCY_PRED_PIDM");
				// 
				removeGlobal("GLOBAL.AGCY_PIDM");
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.TRG_FAIL
		    NULL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.TRG_FAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TRG_FAIL")
		public void Fraprop_TrgFail()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.SET_FIELDS
		    IF :FRBPROP.FRBPROP_LONG_TITLE IS NULL THEN
      MESSAGE( G$_NLS.Get('FRAPROP-0000', 'FORM','The Title of the Proposal must be entered.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
   IF :FRBPROP_PROJECT_START_DATE IS NULL THEN
      MESSAGE( G$_NLS.Get('FRAPROP-0001', 'FORM','The proposed Start Date of the grant must be entered.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.SET_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_FIELDS")
		public void Fraprop_SetFields()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropLongTitle().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0000"), toStr("FORM"), toStr("The Title of the Proposal must be entered.")));
					throw new ApplicationException();
				}
				if ( frbpropElement.getFrbpropProjectStartDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0001"), toStr("FORM"), toStr("The proposed Start Date of the grant must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_OPT_1
		 declare
 temp_var  varchar2(1);
 cursor c1 is 
  select 'x'
   from frvsdat
     where frvsdat_sdat_code_attr = :FRRPUSN_SDAT_CODE_ATTR
       and frvsdat_sdat_code_opt_1 = :frrpusn_sdat_code_opt_1;
 
begin
 open c1;
   fetch c1 into temp_var;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0002', 'FORM','Value Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_OPT_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_OPT_1")
		public void Fraprop_CheckOpt1()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);


				int rowCount = 0;
				{
					NString tempVar= NString.getNull();
					String sqlc1 = "SELECT 'x' " +
	" FROM frvsdat " +
	" WHERE frvsdat_sdat_code_attr = :FRRPUSN_SDAT_CODE_ATTR AND frvsdat_sdat_code_opt_1 = :FRRPUSN_SDAT_CODE_OPT_1 ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRRPUSN_SDAT_CODE_ATTR", frrpusnElement.getFrrpusnSdatCodeAttr());
						c1.addParameter("FRRPUSN_SDAT_CODE_OPT_1", frrpusnElement.getFrrpusnSdatCodeOpt1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							tempVar = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0002"), toStr("FORM"), toStr("Value Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.COPY_TO_GLOBALS
		    :GLOBAL.AGCY_ID := :frbprop_agency_code_2 ;
   :GLOBAL.AGCY_PRED_ID := :frbprop_agency_pred_code ;
   :GLOBAL.AGCY_PIDM := :frbprop_agency_pidm;
   :GLOBAL.AGCY_PRED_PIDM := :frbprop_agency_pred_pidm ;
   :GLOBAL.AGCY_NAME := :frbprop_agency_name_2 ;
   :GLOBAL.AGCY_PRED_NAME := :frbprop_agency_pred_name ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.COPY_TO_GLOBALS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COPY_TO_GLOBALS")
		public void Fraprop_CopyToGlobals()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				setGlobal("AGCY_ID", getFormModel().getFormHeader().getFrbpropAgencyCode2());
				setGlobal("AGCY_PRED_ID", frbpropElement.getFrbpropAgencyPredCode());
				setGlobal("AGCY_PIDM", toStr(frbpropElement.getFrbpropAgencyPidm()));
				setGlobal("AGCY_PRED_PIDM", toStr(frbpropElement.getFrbpropAgencyPredPidm()));
				setGlobal("AGCY_NAME", getFormModel().getFormHeader().getFrbpropAgencyName2());
				setGlobal("AGCY_PRED_NAME", frbpropElement.getFrbpropAgencyPredName());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_PREP_$_DUE_DATES
		    G$_CHECK_VALUE ((TRUNC(:FRBPROP_DUE_DATE) < TRUNC(:FRBPROP_ORIG_PREP_DATE)
      AND  :FRBPROP_DUE_DATE IS NOT NULL),
 G$_NLS.Get('FRAPROP-0003', 'FORM','The due date must be greater than/equal to proposal original date') , TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_PREP_$_DUE_DATES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PREP_$_DUE_DATES")
		public void Fraprop_CheckPrepDueDates()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getTask().getGoqrpls().gCheckValue(
						toBool(((trunc(frbpropElement.getFrbpropDueDate()).lesser(trunc(frbpropElement.getFrbpropOrigPrepDate())) && !frbpropElement.getFrbpropDueDate().isNull())))
						, GNls.Fget(toStr("FRAPROP-0003"), toStr("FORM"), toStr("The due date must be greater than/equal to proposal original date"))
						, toBool(NBool.True)
						);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.SET_REQUIRED_OFF
		 IF GET_ITEM_PROPERTY('FRBPROP_COAS_CODE',REQUIRED) = 'TRUE' THEN
    SET_ITEM_PROPERTY('FRBPROP_COAS_CODE',REQUIRED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_LONG_TITLE',REQUIRED) = 'TRUE' THEN
    SET_ITEM_PROPERTY('FRBPROP_LONG_TITLE',REQUIRED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_TITLE',REQUIRED) = 'TRUE' THEN
    SET_ITEM_PROPERTY('FRBPROP_TITLE',REQUIRED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PROJECT_START_DATE',REQUIRED) = 'TRUE' THEN
    SET_ITEM_PROPERTY('FRBPROP_PROJECT_START_DATE',REQUIRED,PROPERTY_OFF);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.SET_REQUIRED_OFF
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_REQUIRED_OFF")
		public void Fraprop_SetRequiredOff()
		{
			
				if ( getItemRequired("FRBPROP_COAS_CODE").equals("TRUE") )
				{
					setItemRequired("FRBPROP_COAS_CODE", false);
				}
				// 
				if ( getItemRequired("FRBPROP_LONG_TITLE").equals("TRUE") )
				{
					setItemRequired("FRBPROP_LONG_TITLE", false);
				}
				// 
				if ( getItemRequired("FRBPROP_TITLE").equals("TRUE") )
				{
					setItemRequired("FRBPROP_TITLE", false);
				}
				// 
				if ( getItemRequired("FRBPROP_PROJECT_START_DATE").equals("TRUE") )
				{
					setItemRequired("FRBPROP_PROJECT_START_DATE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.SET_REQUIRED_ON
		 IF GET_ITEM_PROPERTY('FRBPROP_COAS_CODE',REQUIRED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('FRBPROP_COAS_CODE',REQUIRED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_LONG_TITLE',REQUIRED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('FRBPROP_LONG_TITLE',REQUIRED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_TITLE',REQUIRED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('FRBPROP_TITLE',REQUIRED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PROJECT_START_DATE',REQUIRED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('FRBPROP_PROJECT_START_DATE',REQUIRED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.SET_REQUIRED_ON
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_REQUIRED_ON")
		public void Fraprop_SetRequiredOn()
		{
			
				if ( getItemRequired("FRBPROP_COAS_CODE").equals("FALSE") )
				{
					setItemRequired("FRBPROP_COAS_CODE", true);
				}
				// 
				if ( getItemRequired("FRBPROP_LONG_TITLE").equals("FALSE") )
				{
					setItemRequired("FRBPROP_LONG_TITLE", true);
				}
				// 
				if ( getItemRequired("FRBPROP_TITLE").equals("FALSE") )
				{
					setItemRequired("FRBPROP_TITLE", true);
				}
				// 
				if ( getItemRequired("FRBPROP_PROJECT_START_DATE").equals("FALSE") )
				{
					setItemRequired("FRBPROP_PROJECT_START_DATE", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_FROM_TO_INFO
		     IF SELECT_FRBPROP_1(:COPY_PROP_CODE) THEN
       EDIT_ORGN_SEQURITY_AFTER_QUERY(:COPY_PROP_CODE);
       IF NOT FORM_SUCCESS THEN
          :CHECK_KEYS := 'N';              
          RAISE FORM_TRIGGER_FAILURE;
       END IF;
       HIDE_WINDOW('COPY_PROP');
       GO_BLOCK('FRBPROP'); 
       CLEAR_BLOCK(NO_VALIDATE);
       SET_BLOCK_PROPERTY('FRBPROP',DEFAULT_WHERE,'FRBPROP_CODE = :COPY_PROP_CODE');
       EXECUTE_QUERY;
       CREATE_RECORD;
       DUPLICATE_RECORD;
       PREVIOUS_RECORD;
       CLEAR_RECORD;
       :FRBPROP_PROP_CODE_RELATED := :COPY_PROP_CODE;
declare
 cursor c1 is 
  select frbprop_title
   from frbprop
     where frbprop_code = :frbprop_prop_code_related;
begin
 open c1;
   fetch c1 into :related_prop_descr;
         close c1;
end; 

       :COPY_FUNCT_PROCESS := 'Y';
       SET_BLOCK_PROPERTY('FRBPROP',DEFAULT_WHERE,'');
    ELSE
      MESSAGE( G$_NLS.Get('FRAPROP-0004', 'FORM','Invalid Proposal Code; Use LIST.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_FROM_TO_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_FROM_TO_INFO")
		public void Fraprop_EditFromToInfo()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( this.getTask().getServices().selectFrbprop1(getFormModel().getCopyBlock().getCopyPropCode()).getValue() )
				{
					try {
						this.getTask().getServices().editOrgnSequrityAfterQuery(getFormModel().getCopyBlock().getCopyPropCode());
					}
					catch(Exception e) {
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						getFormModel().getFormHeader().setCheckKeys(toStr("N"));
						throw new ApplicationException();
					}
					
					hideWindow("COPY_PROP");
					goBlock(toStr("FRBPROP"));
					clearBlock(TaskServices.NO_VALIDATE);
					setBlockWhereClause("FRBPROP", "FRBPROP_CODE = :COPY_PROP_CODE");
					executeQuery();
					createRecord();
					duplicateRecord();
					previousRecord();
					clearRecord();
					frbpropElement.setFrbpropPropCodeRelated(getFormModel().getCopyBlock().getCopyPropCode());
					{
						String sqlc1 = "SELECT frbprop_title " +
	" FROM frbprop " +
	" WHERE frbprop_code = :FRBPROP_PROP_CODE_RELATED ";
						DataCursor c1 = new DataCursor(sqlc1);
						try {
							//Setting query parameters
							c1.addParameter("FRBPROP_PROP_CODE_RELATED", frbpropElement.getFrbpropPropCodeRelated());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								frbpropElement.setRelatedPropDescr(c1Results.getStr(0));
							}
							c1.close();
						}
						finally{
							c1.close();
						}
					}
					getFormModel().getFormHeader().setCopyFunctProcess(toStr("Y"));
					setBlockWhereClause("FRBPROP", "");
				}
				else {
					errorMessage(GNls.Fget(toStr("FRAPROP-0004"), toStr("FORM"), toStr("Invalid Proposal Code; Use LIST.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.LIST_VALUES_COPY_TWO
		      COPY( :GLOBAL.SDAT_ATTR, 'frrpusn_sdat_code_attr');
     COPY( :GLOBAL.VALUE, 'frrpusn_sdat_code_opt_1');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.LIST_VALUES_COPY_TWO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY_TWO")
		public void Fraprop_ListValuesCopyTwo()
		{
			
				copy(getGlobal("SDAT_ATTR"),"frrpusn_sdat_code_attr");
				copy(getGlobal("VALUE"),"frrpusn_sdat_code_opt_1");
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-NXTBLK
		 :del_ready := 'N';
IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
   NEXT_BLOCK;
   RETURN;
END IF;

EXECUTE_TRIGGER('GET_ITEM_NAME'); 
IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'HEADER_INFORMATION' THEN	--FOR TAB CANVAS
   EXECUTE_TRIGGER('SET_FIELDS');
   G$_CHECK_FAILURE;
     IF :FRBPROP_AGENCY_CODE IS NULL THEN
         EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO');
         G$_CHECK_FAILURE;
         RETURN;
     ELSE
         EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO');
         G$_CHECK_FAILURE;
         RETURN;
    END IF; 
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'COST_CODE_INFORMATION' THEN--for tab canvas
     EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO');
     G$_CHECK_FAILURE;
     RETURN; 
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PERSONNEL_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'USER_DEFINED_DATA' THEN--for tab canvas
     EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO'); --RPE# 1-19V7ZZD
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'LOCATION_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

--RPE# 1-19V7ZZD
IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PASSTHROUGH_AGENCY' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;


IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PROPOSAL_AGENCY_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;



<multilinecomment> The order of tab pages: header->Proposal Agency->Location->Cost Code->Personnel->User Defined Data->Pass Through Agency->Header</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Fraprop_NextBlock()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					nextBlock();
					return ;
				}

				executeAction("GET_ITEM_NAME");
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("HEADER_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("HEADER_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// FOR TAB CANVAS
					executeAction("SET_FIELDS");
					getTask().getGoqrpls().gCheckFailure();
					if ( frbpropElement.getFrbpropAgencyCode().isNull() )
					{
						executeAction("MNU_OPT_LOCATION_INFO");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
					else {
						executeAction("MNU_OPT_AGENCY_INFO");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("COST_CODE_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("COST_CODE_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas
					executeAction("MNU_OPT_PERSONNEL_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PERSONNEL_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PERSONNEL_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_USER_CODES_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("USER_DEFINED_DATA") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("USER_DEFINED_DATA") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas
					executeAction("MNU_OPT_PASS_THRU_INFO");
					// RPE# 1-19V7ZZD
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("LOCATION_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("LOCATION_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_COST_SHARE_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				// RPE# 1-19V7ZZD
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PASSTHROUGH_AGENCY") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PASSTHROUGH_AGENCY") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_HEADER_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PROPOSAL_AGENCY_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PROPOSAL_AGENCY_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_LOCATION_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-PRVBLK
		 :del_ready := 'N';
IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
   EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
   RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'HEADER_INFORMATION' THEN--FOR TAB CANVAS	
     EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO');  --RPE# 1-19V7ZZD
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'COST_CODE_INFORMATION' THEN--for tab canvas
     EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PERSONNEL_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'USER_DEFINED_DATA' THEN--for tab canvas
     EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'LOCATION_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;

--RPE# 1-19V7ZZD
IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PASSTHROUGH_AGENCY' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;


IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'PROPOSAL_AGENCY_INFORMATION' THEN--for tab canvas	
     EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO');
     G$_CHECK_FAILURE;
     RETURN;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Fraprop_PreviousBlock()
		{
			
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("HEADER_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("HEADER_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// FOR TAB CANVAS	
					executeAction("MNU_OPT_PASS_THRU_INFO");
					// RPE# 1-19V7ZZD
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("COST_CODE_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("COST_CODE_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas
					executeAction("MNU_OPT_LOCATION_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PERSONNEL_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PERSONNEL_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_COST_SHARE_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("USER_DEFINED_DATA") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("USER_DEFINED_DATA") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas
					executeAction("MNU_OPT_PERSONNEL_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("LOCATION_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("LOCATION_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_AGENCY_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				// RPE# 1-19V7ZZD
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PASSTHROUGH_AGENCY") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PASSTHROUGH_AGENCY") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_USER_CODES_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
//				if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("PROPOSAL_AGENCY_INFORMATION") )
				if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("PROPOSAL_AGENCY_INFORMATION") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// for tab canvas	
					executeAction("MNU_OPT_HEADER_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_CFDA_CODE
		 declare
 cursor get_cfda_code is
   select frvcfda_cfda_code
     from  frvcfda
     where frvcfda_internal_id_no = :frbprop_cfda_internal_id_no;
begin
  open get_cfda_code;
  fetch get_cfda_code into :frbprop_cfda_code;
   if get_cfda_code%NOTFOUND then
      :frbprop_cfda_code := '';
   end if;
  close get_cfda_code;
end; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_CFDA_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_CFDA_CODE")
		public void Fraprop_GetCfdaCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlgetCfdaCode = "SELECT frvcfda_cfda_code " +
	" FROM frvcfda " +
	" WHERE frvcfda_internal_id_no = :FRBPROP_CFDA_INTERNAL_ID_NO ";
					DataCursor getCfdaCode = new DataCursor(sqlgetCfdaCode);
					try {
						//Setting query parameters
						getCfdaCode.addParameter("FRBPROP_CFDA_INTERNAL_ID_NO", frbpropElement.getFrbpropCfdaInternalIdNo());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getCfdaCode.
						getCfdaCode.open();
						ResultSet getCfdaCodeResults = getCfdaCode.fetchInto();
						if ( getCfdaCodeResults != null ) {
							frbpropElement.setFrbpropCfdaCode(getCfdaCodeResults.getStr(0));
						}
						if ( getCfdaCode.notFound() )
						{
							frbpropElement.setFrbpropCfdaCode(toStr(""));
						}
						getCfdaCode.close();
					}
					finally{
						getCfdaCode.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_EMPLOYEE
		 declare
  pti_temp_1  varchar2(1);
  pti_temp_2  varchar2(1);
--
  cursor check_emp is
  select 'X'
   from nbrjobs, nbrbjob
   where nbrbjob_pidm = :frrprpi_id_pidm
   and nbrbjob_contract_type = 'P'
   and (nbrbjob_end_date is null or
         nbrbjob_end_date > sysdate)
   and nbrjobs_pidm = nbrbjob_pidm
   AND nbrjobs_posn = nbrbjob_posn
   AND nbrjobs_suff = nbrbjob_suff
   AND nbrjobs_effective_date =
              (select max(nbrjobs_effective_date)
                 from nbrjobs
                where nbrjobs_pidm = nbrbjob_pidm
                  and nbrjobs_posn = nbrbjob_posn
                  and nbrjobs_suff = nbrbjob_suff
                  and nbrjobs_effective_date <= sysdate);
--
  cursor check_hr_installed is
   select 'X'
     from gubinst
     where gubinst_humanre_installed = 'Y';

begin
--  open check_hr_installed;
--  fetch check_hr_installed into pti_temp_1;
--   if check_hr_installed%FOUND then
      open check_emp;
      fetch check_emp into pti_temp_2;
       if check_emp%FOUND then
          :frrprpi_employee_ind := 'Y';
       else
          :frrprpi_employee_ind := 'N';
       end if;
--   end if;
--   close check_hr_installed;
   close check_emp;
end;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_EMPLOYEE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_EMPLOYEE")
		public void Fraprop_CheckEmployee()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				int rowCount = 0;
				{
					NString ptiTemp1= NString.getNull();
					NString ptiTemp2= NString.getNull();
					String sqlcheckEmp = "SELECT 'X' " +
	" FROM nbrjobs, nbrbjob " +
	" WHERE nbrbjob_pidm = :FRRPRPI_ID_PIDM AND nbrbjob_contract_type = 'P' AND (nbrbjob_end_date IS NULL OR nbrbjob_end_date > sysdate) AND nbrjobs_pidm = nbrbjob_pidm AND nbrjobs_posn = nbrbjob_posn AND nbrjobs_suff = nbrbjob_suff AND nbrjobs_effective_date = (SELECT max(nbrjobs_effective_date) " +
		" FROM nbrjobs " +
		" WHERE nbrjobs_pidm = nbrbjob_pidm AND nbrjobs_posn = nbrbjob_posn AND nbrjobs_suff = nbrbjob_suff AND nbrjobs_effective_date <= sysdate ) ";
					DataCursor checkEmp = new DataCursor(sqlcheckEmp);
					String sqlcheckHrInstalled = "SELECT 'X' " +
	" FROM gubinst " +
	" WHERE gubinst_humanre_installed = 'Y' ";
					DataCursor checkHrInstalled = new DataCursor(sqlcheckHrInstalled);
					try {
						//   open check_hr_installed;
						//   fetch check_hr_installed into pti_temp_1;
						//    if check_hr_installed%FOUND then
						//Setting query parameters
						checkEmp.addParameter("FRRPRPI_ID_PIDM", frrprpiElement.getFrrprpiIdPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkEmp.
						checkEmp.open();
						ResultSet checkEmpResults = checkEmp.fetchInto();
						if ( checkEmpResults != null ) {
							ptiTemp2 = checkEmpResults.getStr(0);
						}
						if ( checkEmp.found() )
						{
							frrprpiElement.setFrrprpiEmployeeInd(toStr("Y"));
						}
						else {
							frrprpiElement.setFrrprpiEmployeeInd(toStr("N"));
						}
						//    end if;
						//    close check_hr_installed;
						checkEmp.close();
					}
					finally{
						checkEmp.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_ORGN_CODE_FRRPRPI
		 <multilinecomment>  1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;

	 If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
	   Search for the latest terminated/inactive record to get the organzation title.
	   If no past (terminated) records, then search for the first future dated records to retrieve the title.
	   
</multilinecomment>
   -- 1-BMV7IL  Start
   IF :FRRPRPI_ORGN_CODE IS NULL THEN  
      RETURN ;
   END IF ;     
   DECLARE
      hold_orgn_code_descr     varchar2(35);
      lv_holder                varchar2(1);											
      --
      CURSOR FTVORGN_C IS
         SELECT 'Y'																		 
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE;
       --
      CURSOR FTVORGN_CURR_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_NCHG_DATE >  SYSDATE  
           AND  FTVORGN_EFF_DATE <=  SYSDATE
           AND  (FTVORGN_TERM_DATE > SYSDATE
            OR  FTVORGN_TERM_DATE IS NULL)
           AND  FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FTVORGN_STATUS_IND= 'A';
           --
	    CURSOR FTVORGN_PAST_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_EFF_DATE <  SYSDATE
           AND  FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
		   ORDER BY FTVORGN_EFF_DATE DESC;
         --
	    CURSOR FTVORGN_FUT_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_EFF_DATE >  SYSDATE
           AND  FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE; 
        --  		   
           ALERT_BUTTON NUMBER;
           ALERT_ID     ALERT;
           warn_mes     VARCHAR2(500) := G$_NLS.GET('FRAPROP-0005','FORM',
                       'The Organization code entered is currently Terminated or Inactive. Do you want to update the Organization?');           
   BEGIN
      :FRRPRPI_ORGN_CODE_NAME := '';
      OPEN FTVORGN_C ;
      FETCH FTVORGN_C INTO lv_holder;																								<multilinecomment>1-HWCBIO</multilinecomment>
      IF FTVORGN_C%NOTFOUND THEN
      	CLOSE FTVORGN_C;
      	
      	MESSAGE( G$_NLS.Get('FRAPROP-0006', 'FORM','Organization is invalid. Use LIST.') ,NO_ACKNOWLEDGE);
      	RAISE FORM_TRIGGER_FAILURE;
      END IF;
      CLOSE FTVORGN_C;

	  OPEN FTVORGN_CURR_REC_C;
	  FETCH FTVORGN_CURR_REC_C INTO hold_orgn_code_descr;
	  IF FTVORGN_CURR_REC_C%NOTFOUND THEN
	    IF :SYSTEM.FORM_STATUS = 'QUERY' OR NVL(:FORM_HEADER.ORG_P_VALIDATE_FLAG,'Y') = 'N' THEN		   
		    :FORM_HEADER.ORG_P_VALIDATE_FLAG := 'Y';		   
		  ELSE
            ALERT_ID := FIND_ALERT('G$_PIPE_MESSAGE_ALERT');
            SET_ALERT_PROPERTY(alert_id, alert_message_text, warn_mes  );
            alert_button := SHOW_ALERT(alert_id);
            IF alert_button = ALERT_BUTTON2 THEN
              CLOSE FTVORGN_CURR_REC_C;
              MESSAGE( G$_NLS.Get('FRAPROP-0007', 'FORM','Organization is invalid. Use LIST.') ,NO_ACKNOWLEDGE);
              RAISE FORM_TRIGGER_FAILURE;
            END IF;
			
	    END IF;
		-- Either Past (Terminated) or future records exist
		OPEN FTVORGN_PAST_REC_C;
		FETCH FTVORGN_PAST_REC_C INTO hold_orgn_code_descr;
		IF FTVORGN_PAST_REC_C%NOTFOUND THEN
		   OPEN FTVORGN_FUT_REC_C;
		   FETCH FTVORGN_FUT_REC_C INTO hold_orgn_code_descr;
		   CLOSE FTVORGN_FUT_REC_C;
		END IF;
		CLOSE FTVORGN_PAST_REC_C;
	  END IF;
	  CLOSE FTVORGN_CURR_REC_C;

	  EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ;
      G$_CHECK_FAILURE ; 
   
     :FRRPRPI_ORGN_CODE_NAME := hold_orgn_code_descr;  	  	  
	         
   END;
   --1-BMV7IL End 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_ORGN_CODE_FRRPRPI
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_ORGN_CODE_FRRPRPI")
		public void Fraprop_EditOrgnCodeFrrprpi()
		{
			
				//   1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;
				// If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
				// Search for the latest terminated/inactive record to get the organzation title.
				// If no past (terminated) records, then search for the first future dated records to retrieve the title.
				//  1-BMV7IL  Start

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				//   1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;
				// If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
				// Search for the latest terminated/inactive record to get the organzation title.
				// If no past (terminated) records, then search for the first future dated records to retrieve the title.
				//  1-BMV7IL  Start
				if ( frrprpiElement.getFrrprpiOrgnCode().isNull() )
				{
					return ;
				}
				{
					NString holdOrgnCodeDescr= NString.getNull();
					NString lvHolder= NString.getNull();
					String sqlftvorgnC = "SELECT 'Y' " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE ";
					DataCursor ftvorgnC = new DataCursor(sqlftvorgnC);
					String sqlftvorgnCurrRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE AND FTVORGN_STATUS_IND = 'A' ";
					DataCursor ftvorgnCurrRecC = new DataCursor(sqlftvorgnCurrRecC);
					String sqlftvorgnPastRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_EFF_DATE < SYSDATE AND FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE " +
	" ORDER BY FTVORGN_EFF_DATE DESC";
					DataCursor ftvorgnPastRecC = new DataCursor(sqlftvorgnPastRecC);
					String sqlftvorgnFutRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE = :FRRPRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE ";
					DataCursor ftvorgnFutRecC = new DataCursor(sqlftvorgnFutRecC);
					//   		   
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId= null;
					NString warnMes = GNls.Fget(toStr("FRAPROP-0005"), toStr("FORM"), toStr("The Organization code entered is currently Terminated or Inactive. Do you want to update the Organization?"));
					try {
						frrprpiElement.setFrrprpiOrgnCodeName(toStr(""));
						//Setting query parameters
						ftvorgnC.addParameter("FRRPRPI_ORGN_CODE", frrprpiElement.getFrrprpiOrgnCode());
						ftvorgnC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnC.
						ftvorgnC.open();
						ResultSet ftvorgnCResults = ftvorgnC.fetchInto();
						if ( ftvorgnCResults != null ) {
							lvHolder = ftvorgnCResults.getStr(0);
						}
						// 1-HWCBIO
						if ( ftvorgnC.notFound() )
						{
							ftvorgnC.close();
							errorMessage(GNls.Fget(toStr("FRAPROP-0006"), toStr("FORM"), toStr("Organization is invalid. Use LIST.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
						ftvorgnC.close();
						//Setting query parameters
						ftvorgnCurrRecC.addParameter("FRRPRPI_ORGN_CODE", frrprpiElement.getFrrprpiOrgnCode());
						ftvorgnCurrRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnCurrRecC.
						ftvorgnCurrRecC.open();
						ResultSet ftvorgnCurrRecCResults = ftvorgnCurrRecC.fetchInto();
						if ( ftvorgnCurrRecCResults != null ) {
							holdOrgnCodeDescr = ftvorgnCurrRecCResults.getStr(0);
						}
						if ( ftvorgnCurrRecC.notFound() )
						{
							if ( getTaskStatus().equals("QUERY") || isNull(getFormModel().getFormHeader().getOrgPValidateFlag(), "Y").equals("N") )
							{
								getFormModel().getFormHeader().setOrgPValidateFlag(toStr("Y"));
							}
							else {
								alertId = findAlert("G$_PIPE_MESSAGE_ALERT");
								setAlertMessageText(alertId, warnMes);
								alertButton = toNumber(showAlert(alertId));
								if ( alertButton.equals(MessageServices.BUTTON2) )
								{
									ftvorgnCurrRecC.close();
									errorMessage(GNls.Fget(toStr("FRAPROP-0007"), toStr("FORM"), toStr("Organization is invalid. Use LIST.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
									throw new ApplicationException();
								}
							}
							//  Either Past (Terminated) or future records exist
							//Setting query parameters
							ftvorgnPastRecC.addParameter("FRRPRPI_ORGN_CODE", frrprpiElement.getFrrprpiOrgnCode());
							ftvorgnPastRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnPastRecC.
							ftvorgnPastRecC.open();
							ResultSet ftvorgnPastRecCResults = ftvorgnPastRecC.fetchInto();
							if ( ftvorgnPastRecCResults != null ) {
								holdOrgnCodeDescr = ftvorgnPastRecCResults.getStr(0);
							}
							if ( ftvorgnPastRecC.notFound() )
							{
								//Setting query parameters
								ftvorgnFutRecC.addParameter("FRRPRPI_ORGN_CODE", frrprpiElement.getFrrprpiOrgnCode());
								ftvorgnFutRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnFutRecC.
								ftvorgnFutRecC.open();
								ResultSet ftvorgnFutRecCResults = ftvorgnFutRecC.fetchInto();
								if ( ftvorgnFutRecCResults != null ) {
									holdOrgnCodeDescr = ftvorgnFutRecCResults.getStr(0);
								}
								ftvorgnFutRecC.close();
							}
							ftvorgnPastRecC.close();
						}
						ftvorgnCurrRecC.close();
						executeAction("EDIT_ORGN_SECURITY");
						getTask().getGoqrpls().gCheckFailure();
						frrprpiElement.setFrrprpiOrgnCodeName(holdOrgnCodeDescr);
					}
					finally{
						ftvorgnC.close();
						ftvorgnCurrRecC.close();
						ftvorgnPastRecC.close();
						ftvorgnFutRecC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_ID_CODE
		 :frrprpi_id := NULL;
:frrprpi_id_name := NULL;
g$_sel_spriden_id_name(:frrprpi_id_pidm , 'FRRPRPI_ID_NAME', 'Y', :frrprpi_id);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_ID_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_ID_CODE")
		public void Fraprop_GetIdCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				frrprpiElement.setFrrprpiId(toStr(null));
				frrprpiElement.setFrrprpiIdName(toStr(null));
				Ref<NString> pId_ref = new Ref<NString>(frrprpiElement.getFrrprpiId());
				getTask().getGoqrpls().gSelSpridenIdName(frrprpiElement.getFrrprpiIdPidm(), toStr("FRRPRPI_ID_NAME"), toStr("Y"), pId_ref);
				frrprpiElement.setFrrprpiId(pId_ref.val);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.POST-DATABASE-COMMIT
		    :HOLD_STATUS_CODE := :FRBPROP_STATUS_CODE;
   :HOLD_PI_ID_CODE  := :FRBPROP_PI_ID_CODE;
   :HOLD_STATUS_DATE := :FRBPROP_status_date;
	 :form_header.hold_alt_status_desc := :frbprop.frbprop_alternate_status_desc;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.POST-DATABASE-COMMIT
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="POST-DATABASE-COMMIT")
		@AfterDatabaseCommit
		public void Fraprop_PostDatabaseCommit(EventObject args)
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getFormModel().getFormHeader().setHoldStatusCode(frbpropElement.getFrbpropStatusCode());
				getFormModel().getFormHeader().setHoldPiIdCode(frbpropElement.getFrbpropPiIdCode());
				getFormModel().getFormHeader().setHoldStatusDate(frbpropElement.getFrbpropStatusDate());
				getFormModel().getFormHeader().setHoldAltStatusDesc(frbpropElement.getFrbpropAlternateStatusDesc());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DELETE_FRVPRST
		 --dbms package issue
DELETE FROM FRVPRST WHERE FRVPRST_PROP_CODE = :DISPLAY_FRBPROP_CODE ;
--commit;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DELETE_FRVPRST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_FRVPRST")
		public void Fraprop_DeleteFrvprst()
		{
			
				// dbms package issue
				int rowCount = 0;
				// dbms package issue
				String sql1 = "DELETE FROM FRVPRST " +
	" WHERE FRVPRST_PROP_CODE = :DISPLAY_FRBPROP_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DELETE_FRRPRPI
		 --dbms package issue
DELETE FROM FRRPRPI WHERE FRRPRPI_PROP_CODE = :DISPLAY_FRBPROP_CODE ;
--commit;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DELETE_FRRPRPI
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_FRRPRPI")
		public void Fraprop_DeleteFrrprpi()
		{
			
				// dbms package issue
				int rowCount = 0;
				// dbms package issue
				String sql1 = "DELETE FROM FRRPRPI " +
	" WHERE FRRPRPI_PROP_CODE = :DISPLAY_FRBPROP_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DELETE_FRRPUSN
		 --dbms package issue
DELETE FROM FRRPUSN WHERE FRRPUSN_PROP_CODE = :DISPLAY_FRBPROP_CODE ;
--commit;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DELETE_FRRPUSN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_FRRPUSN")
		public void Fraprop_DeleteFrrpusn()
		{
			
				// dbms package issue
				int rowCount = 0;
				// dbms package issue
				String sql1 = "DELETE FROM FRRPUSN " +
	" WHERE FRRPUSN_PROP_CODE = :DISPLAY_FRBPROP_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DELETE_LOCN
		 --dbms package issue
DELETE FROM FRRPLOC WHERE FRRPLOC_PROP_CODE = :DISPLAY_FRBPROP_CODE ;
--commit;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DELETE_LOCN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_LOCN")
		public void Fraprop_DeleteLocn()
		{
			
				// dbms package issue
				int rowCount = 0;
				// dbms package issue
				String sql1 = "DELETE FROM FRRPLOC " +
	" WHERE FRRPLOC_PROP_CODE = :DISPLAY_FRBPROP_CODE";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_ITEM_NAME
		 :HOLD_ITEM_NAME := :SYSTEM.CURSOR_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_ITEM_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_ITEM_NAME")
		public void Fraprop_GetItemName()
		{
			
				getFormModel().getFormHeader().setHoldItemName(toStr(getCursorItem()));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_ADDR_TYPE_SEQ_NUM
		 BEGIN 
  IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT FTVAGCY_ADDR_TYPE, FTVAGCY_ADDR_SEQNO
         FROM   FTVAGCY
         WHERE  FTVAGCY_AGCY_CODE_PIDM = :FRBPROP_AGENCY_PIDM;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :FRBPROP_AGENCY_ADDR_CODE,
         :FRBPROP_AGENCY_ADDR_SEQ_NUM ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL, TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_ADDR_TYPE_SEQ_NUM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_ADDR_TYPE_SEQ_NUM")
		public void Fraprop_GetAddrTypeSeqNum()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//						 PTI_END_TRIGGER:;
							setGlobal("QUERY_MODE", toStr("0"));
							return;
					}
					{
						String sqlptiCursor = "SELECT FTVAGCY_ADDR_TYPE, FTVAGCY_ADDR_SEQNO " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :FRBPROP_AGENCY_PIDM ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								frbpropElement.setFrbpropAgencyAddrCode(ptiCursorResults.getStr(0));
								frbpropElement.setFrbpropAgencyAddrSeqNum(ptiCursorResults.getNumber(1));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), toStr(null), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
//					 PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CLR_ADDR
		 :address_house_number := '';
:address_line_1       := '';
:address_line_2       := '';
:address_line_4       := '';
:address_line_3       := '';
:city                 := '';
:state                := '';
:zip_code             := '';
:phone_type           := '';
:area_code            := '';
:ctry_code_phone      := '';
:phone_number         := '';
:extension            := '';
:phone_exists         := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CLR_ADDR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_ADDR")
		public void Fraprop_ClrAddr()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setAddressHouseNumber(toStr(""));
				frbpropElement.setAddressLine1(toStr(""));
				frbpropElement.setAddressLine2(toStr(""));
				frbpropElement.setAddressLine4(toStr(""));
				frbpropElement.setAddressLine3(toStr(""));
				frbpropElement.setCity(toStr(""));
				frbpropElement.setState(toStr(""));
				frbpropElement.setZipCode(toStr(""));
				frbpropElement.setPhoneType(toStr(""));
				frbpropElement.setAreaCode(toStr(""));
				frbpropElement.setCtryCodePhone(toStr(""));
				frbpropElement.setPhoneNumber(toStr(""));
				frbpropElement.setExtension(toStr(""));
				frbpropElement.setPhoneExists(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CLR_ATYP
		    :FRBPROP_AGENCY_ADDR_CODE := '' ;
--
   :FRBPROP_AGENCY_ADDR_SEQ_NUM := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CLR_ATYP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_ATYP")
		public void Fraprop_ClrAtyp()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setFrbpropAgencyAddrCode(toStr(""));
				// 
				frbpropElement.setFrbpropAgencyAddrSeqNum(toNumber(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_SPRADDR
		 DECLARE
  CURSOR pti_cursor IS
     SELECT spraddr_house_number, 
            spraddr_street_line1, 
            spraddr_street_line2,
            spraddr_street_line3, 
            spraddr_street_line4, 
            spraddr_city,
            spraddr_stat_code, 
            spraddr_zip
     FROM   spraddr
     WHERE  spraddr_pidm = :frbprop_agency_pidm
     	 AND  spraddr_atyp_code = :frbprop_agency_addr_code
       AND  spraddr_seqno = :frbprop_agency_addr_seq_num 
       AND  NVL(SPRADDR_STATUS_IND,'A') != 'I';			<multilinecomment>added this line to fetch all addresses other than inactive-'I'</multilinecomment>
BEGIN
  OPEN pti_cursor;
  FETCH pti_cursor INTO
    :address_house_number, 
    :address_line_1, 
    :address_line_2,
    :address_line_3, 
    :address_line_4, 
    :city, 
    :state, 
    :zip_code;
  G$_CHECK_VALUE (pti_cursor%NOTFOUND,  G$_NLS.Get('FRAPROP-0008', 'FORM','The Address Type and Sequence Number combination is invalid or inactive'), TRUE); <multilinecomment>changed error msg: "Address does not exist" to "The Address Type and Sequence Number combination is invalid or inactive"</multilinecomment>
  CLOSE pti_cursor;
END;
--
DECLARE
  CURSOR pti_cursor IS
    SELECT sprtele_ctry_code_phone,
           sprtele_phone_area, 
           sprtele_phone_number,
           sprtele_phone_ext, 
           sprtele_tele_code
    FROM   sprtele
    WHERE  sprtele_pidm        = :frbprop_agency_pidm
      AND  sprtele_addr_seqno  = :frbprop_agency_addr_seq_num
      AND  sprtele_primary_ind = 'Y'
      AND  sprtele_atyp_code = :frbprop_agency_addr_code;
BEGIN
  OPEN pti_cursor;
  FETCH pti_cursor INTO 
    :ctry_code_phone,
    :area_code, 
    :phone_number,
    :extension, 
    :phone_type;
  CLOSE pti_cursor;  
END;
--
DECLARE
  CURSOR pti_cursor IS
     SELECT 'Y'
     FROM   SPRTELE
     WHERE  SPRTELE_PIDM = :FRBPROP_AGENCY_PIDM;
BEGIN
  OPEN pti_cursor;
  FETCH pti_cursor INTO :PHONE_EXISTS;
  CLOSE pti_cursor;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_SPRADDR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_SPRADDR")
		public void Fraprop_EditSpraddr()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT spraddr_house_number, spraddr_street_line1, spraddr_street_line2, spraddr_street_line3, spraddr_street_line4, spraddr_city, spraddr_stat_code, spraddr_zip " +
	" FROM spraddr " +
	" WHERE spraddr_pidm = :FRBPROP_AGENCY_PIDM AND spraddr_atyp_code = :FRBPROP_AGENCY_ADDR_CODE AND spraddr_seqno = :FRBPROP_AGENCY_ADDR_SEQ_NUM AND NVL(SPRADDR_STATUS_IND, 'A') != 'I' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
						ptiCursor.addParameter("FRBPROP_AGENCY_ADDR_CODE", frbpropElement.getFrbpropAgencyAddrCode());
						ptiCursor.addParameter("FRBPROP_AGENCY_ADDR_SEQ_NUM", frbpropElement.getFrbpropAgencyAddrSeqNum());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setAddressHouseNumber(ptiCursorResults.getStr(0));
							frbpropElement.setAddressLine1(ptiCursorResults.getStr(1));
							frbpropElement.setAddressLine2(ptiCursorResults.getStr(2));
							frbpropElement.setAddressLine3(ptiCursorResults.getStr(3));
							frbpropElement.setAddressLine4(ptiCursorResults.getStr(4));
							frbpropElement.setCity(ptiCursorResults.getStr(5));
							frbpropElement.setState(ptiCursorResults.getStr(6));
							frbpropElement.setZipCode(ptiCursorResults.getStr(7));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0008"), toStr("FORM"), toStr("The Address Type and Sequence Number combination is invalid or inactive")), toBool(NBool.True));
						// changed error msg: "Address does not exist" to "The Address Type and Sequence Number combination is invalid or inactive"
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT sprtele_ctry_code_phone, sprtele_phone_area, sprtele_phone_number, sprtele_phone_ext, sprtele_tele_code " +
	" FROM sprtele " +
	" WHERE sprtele_pidm = :FRBPROP_AGENCY_PIDM AND sprtele_addr_seqno = :FRBPROP_AGENCY_ADDR_SEQ_NUM AND sprtele_primary_ind = 'Y' AND sprtele_atyp_code = :FRBPROP_AGENCY_ADDR_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
						ptiCursor.addParameter("FRBPROP_AGENCY_ADDR_SEQ_NUM", frbpropElement.getFrbpropAgencyAddrSeqNum());
						ptiCursor.addParameter("FRBPROP_AGENCY_ADDR_CODE", frbpropElement.getFrbpropAgencyAddrCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setCtryCodePhone(ptiCursorResults.getStr(0));
							frbpropElement.setAreaCode(ptiCursorResults.getStr(1));
							frbpropElement.setPhoneNumber(ptiCursorResults.getStr(2));
							frbpropElement.setExtension(ptiCursorResults.getStr(3));
							frbpropElement.setPhoneType(ptiCursorResults.getStr(4));
						}
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_PIDM = :FRBPROP_AGENCY_PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setPhoneExists(ptiCursorResults.getStr(0));
						}
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_FRRPLOC
		 IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
    RETURN;
END IF;
--
IF :FRBPROP_CODE IS NULL THEN
    RETURN;
END IF;
--
DECLARE
   hold_locn_code  ftvlocn.ftvlocn_locn_code%type;
   hold_var        varchar2(1);
   switch          number := 0;
--
   CURSOR CHECK_FTVLOCN IS
         SELECT DISTINCT 'X'
         FROM   FTVLOCN
         WHERE  FTVLOCN_COAS_CODE IN (:FRBPROP_COAS_CODE,:FRBPROP_COAS_CODE_IC_CS)
           AND  FTVLOCN_LOCN_CODE = hold_locn_code
           AND  FTVLOCN_EFF_DATE <= SYSDATE
           AND  FTVLOCN_NCHG_DATE > SYSDATE
           AND  (FTVLOCN_TERM_DATE IS NULL
            OR  FTVLOCN_TERM_DATE > SYSDATE) ;
--
   CURSOR CHECK_FTVLOCN_1 IS
         SELECT DISTINCT 'X'
         FROM   FTVLOCN
         WHERE  FTVLOCN_COAS_CODE IN (:FRBPROP_COAS_CODE,:FRBPROP_COAS_CODE_IC_CS)
           AND  FTVLOCN_LOCN_CODE = :FRRPLOC_LOCN_CODE
           AND  FTVLOCN_EFF_DATE <= SYSDATE
           AND  FTVLOCN_NCHG_DATE > SYSDATE
           AND  (FTVLOCN_TERM_DATE IS NULL
            OR  FTVLOCN_TERM_DATE > SYSDATE) ;
--
   CURSOR CHECK_FRRPLOC IS
        SELECT FRRPLOC_LOCN_CODE
        FROM FRRPLOC
        WHERE FRRPLOC_PROP_CODE = :FRBPROP_CODE;
--

BEGIN
 IF :FRRPLOC.ROWID IS NULL THEN
    OPEN CHECK_FRRPLOC;
    LOOP
    FETCH CHECK_FRRPLOC INTO hold_locn_code;
      EXIT WHEN CHECK_FRRPLOC%NOTFOUND;
        OPEN CHECK_FTVLOCN;
        FETCH CHECK_FTVLOCN INTO hold_var;
            IF CHECK_FTVLOCN%NOTFOUND THEN
               CLOSE CHECK_FTVLOCN;
               GOTO ERR;
            END IF;
        CLOSE CHECK_FTVLOCN;
    END LOOP;
      :LOCN_ERROR_IND := 'N';
      RETURN;
 ELSE
  GO_BLOCK('FRRPLOC');
  FIRST_RECORD;
       IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
          switch := -1;
       END IF;
    LOOP
        OPEN CHECK_FTVLOCN_1;
        FETCH CHECK_FTVLOCN_1 INTO hold_var;
            IF CHECK_FTVLOCN_1%NOTFOUND THEN
               CLOSE CHECK_FTVLOCN_1;
               GOTO ERR;
            END IF;
        CLOSE CHECK_FTVLOCN_1;
        EXIT WHEN switch = -1;
        NEXT_RECORD; 
       IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
          switch := -1;
       END IF;
   END LOOP;
      :LOCN_ERROR_IND := 'N';
      GO_ITEM(NAME_IN('HOLD_ITEM_NAME'));
      RETURN;
 END IF;

<<ERR>>
              :LOCN_ERROR_IND := 'Y';
                MESSAGE
   ( G$_NLS.Get('FRAPROP-0009', 'FORM','Location(s) must be valid for COA on the Header or Cost Information Windows.') );
            RAISE FORM_TRIGGER_FAILURE;
END;
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_FRRPLOC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_FRRPLOC")
		public void Fraprop_CheckFrrploc()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrplocAdapter frrplocElement = (FrrplocAdapter)this.getFormModel().getFrrploc().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCoasCodeIcCs().isNull() )
				{
					return ;
				}
				// 
				if ( frbpropElement.getFrbpropCode().isNull() )
				{
					return ;
				}
				{
					NString holdLocnCode= NString.getNull();
					NString holdVar= NString.getNull();
					NNumber _switch = toNumber(0);
					String sqlcheckFtvlocn = "SELECT DISTINCT 'X' " +
	" FROM FTVLOCN " +
	" WHERE (FTVLOCN_COAS_CODE) IN (:FRBPROP_COAS_CODE, :FRBPROP_COAS_CODE_IC_CS) AND FTVLOCN_LOCN_CODE = :P_HOLD_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
					DataCursor checkFtvlocn = new DataCursor(sqlcheckFtvlocn);
					String sqlcheckFtvlocn1 = "SELECT DISTINCT 'X' " +
	" FROM FTVLOCN " +
	" WHERE (FTVLOCN_COAS_CODE) IN (:FRBPROP_COAS_CODE, :FRBPROP_COAS_CODE_IC_CS) AND FTVLOCN_LOCN_CODE = :FRRPLOC_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
					DataCursor checkFtvlocn1 = new DataCursor(sqlcheckFtvlocn1);
					String sqlcheckFrrploc = "SELECT FRRPLOC_LOCN_CODE " +
	" FROM FRRPLOC " +
	" WHERE FRRPLOC_PROP_CODE = :FRBPROP_CODE ";
					DataCursor checkFrrploc = new DataCursor(sqlcheckFrrploc);
					try {
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						if ( frrplocElement.getRowState().equals(DataRowStatus.INSERTED))   //if ( frrplocElement.getROWID().isNull() )
						{
							//Setting query parameters
							checkFrrploc.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkFrrploc.
							checkFrrploc.open();
							while (true) {
								ResultSet checkFrrplocResults = checkFrrploc.fetchInto();
								if ( checkFrrplocResults != null ) {
									holdLocnCode = checkFrrplocResults.getStr(0);
								}
								if ( checkFrrploc.notFound() ) 
									break;
								//Setting query parameters
								checkFtvlocn.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
								checkFtvlocn.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
								checkFtvlocn.addParameter("P_HOLD_LOCN_CODE", holdLocnCode);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkFtvlocn.
								checkFtvlocn.open();
								ResultSet checkFtvlocnResults = checkFtvlocn.fetchInto();
								if ( checkFtvlocnResults != null ) {
									holdVar = checkFtvlocnResults.getStr(0);
								}
								if ( checkFtvlocn.notFound() )
								{
									checkFtvlocn.close();
//									 goto ERR;
//									 ERR:;
										getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
										errorMessage(GNls.Fget(toStr("FRAPROP-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
										throw new ApplicationException();
								}
								checkFtvlocn.close();
							}
							getFormModel().getFormHeader().setLocnErrorInd(toStr("N"));
							return ;
						}
						else {
							goBlock(toStr("FRRPLOC"));
							firstRecord();
							if ( isInLastRecord() )
							{
								_switch = toNumber(- (1));
							}
							while (true) {
								//Setting query parameters
								checkFtvlocn1.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
								checkFtvlocn1.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
								checkFtvlocn1.addParameter("FRRPLOC_LOCN_CODE", frrplocElement.getFrrplocLocnCode());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkFtvlocn1.
								checkFtvlocn1.open();
								ResultSet checkFtvlocn1Results = checkFtvlocn1.fetchInto();
								if ( checkFtvlocn1Results != null ) {
									holdVar = checkFtvlocn1Results.getStr(0);
								}
								if ( checkFtvlocn1.notFound() )
								{
									checkFtvlocn1.close();
//									 goto ERR;
//									 ERR:;
										getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
										errorMessage(GNls.Fget(toStr("FRAPROP-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
										throw new ApplicationException();
								}
								checkFtvlocn1.close();
								if ( _switch.equals(- (1)) ) 
									break;
								nextRecord();
								if ( isInLastRecord() )
								{
									_switch = toNumber(- (1));
								}
							}
							getFormModel().getFormHeader().setLocnErrorInd(toStr("N"));
							goItem(getNameIn("HOLD_ITEM_NAME"));
							return ;
						}
//						 ERR:;
//						getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
//						message(GNls.Fget(toStr("FRAPROP-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
//						throw new ApplicationException();
					}
					finally{
						checkFrrploc.close();
						checkFtvlocn.close();
						checkFtvlocn1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_IC_CS
		 if :frbprop_basi_code_ic is not null then
   if :frbprop_indr_code_rate is null then
      message( G$_NLS.Get('FRAPROP-0010', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') );
      Raise Form_Trigger_Failure;
   end if;
   if :frbprop_inda_code_charge is null then
      message( G$_NLS.Get('FRAPROP-0011', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') );
      Raise Form_Trigger_Failure;
   end if;
   if :frbprop_indd_code_distr is null then
      message( G$_NLS.Get('FRAPROP-0012', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') );
      Raise Form_Trigger_Failure;
   end if;
end if;
--
if :frbprop_basi_code_cs is not null then
   if :frbprop_cstr_code_rate is null then
      message( G$_NLS.Get('FRAPROP-0013', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') );
      Raise Form_Trigger_Failure;
   end if;
   if :frbprop_csta_code_charge is null then
      message( G$_NLS.Get('FRAPROP-0014', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') ); 
       Raise Form_Trigger_Failure;
   end if;
   if :frbprop_cstd_code_distr is null then
       message( G$_NLS.Get('FRAPROP-0015', 'FORM','All IC/CS Codes must be entered when some IC/CS Information is present.') );
      Raise Form_Trigger_Failure;
   end if;
end if;     
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_IC_CS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_IC_CS")
		public void Fraprop_EditBasiCodeIcCs()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropBasiCodeIc().isNull() )
				{
					if ( frbpropElement.getFrbpropIndrCodeRate().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0010"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
					if ( frbpropElement.getFrbpropIndaCodeCharge().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0011"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
					if ( frbpropElement.getFrbpropInddCodeDistr().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0012"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !frbpropElement.getFrbpropBasiCodeCs().isNull() )
				{
					if ( frbpropElement.getFrbpropCstrCodeRate().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0013"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
					if ( frbpropElement.getFrbpropCstaCodeCharge().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0014"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
					if ( frbpropElement.getFrbpropCstdCodeDistr().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0015"), toStr("FORM"), toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ENABLE_BUTTONS_AFTER_PASSW
		 IF GET_ITEM_PROPERTY('FRBPROP_STATUS_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_STATUS_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PROPOSAL_TYPE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_PROPOSAL_TYPE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_CATEGORY_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_CATEGORY_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_SUB_CATEGORY_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_SUB_CATEGORY_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_CFDA_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_CFDA_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('COPY_PROP',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('COPY_PROP',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('RATE_DOWN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('RATE_DOWN',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('RATE_UP',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('RATE_UP',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PI_ID_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_PI_ID_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_AGENCY_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_AGENCY_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED,PROPERTY_ON);
END IF;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ENABLE_BUTTONS_AFTER_PASSW
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_BUTTONS_AFTER_PASSW")
		public void Fraprop_EnableButtonsAfterPassw()
		{
			
				if ( getItemEnabled("FRBPROP_STATUS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_STATUS_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_PROPOSAL_TYPE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_PROPOSAL_TYPE_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_CATEGORY_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_CATEGORY_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_SUB_CATEGORY_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_SUB_CATEGORY_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_CFDA_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_CFDA_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("COPY_PROP").equals("FALSE") )
				{
					setItemEnabled("COPY_PROP", true);
				}
				// 
				if ( getItemEnabled("RATE_DOWN").equals("FALSE") )
				{
					setItemEnabled("RATE_DOWN", true);
				}
				// 
				if ( getItemEnabled("RATE_UP").equals("FALSE") )
				{
					setItemEnabled("RATE_UP", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_PI_ID_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_PI_ID_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_AGENCY_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_AGENCY_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("NAVIGATE_TO_BTN").equals("FALSE") )
				{
					setItemEnabled("NAVIGATE_TO_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_STATUS_CODE_DATE
		 if :frbprop_status_code is not null and :frbprop_status_date is null then
   message( G$_NLS.Get('FRAPROP-0016', 'FORM','Proposal Status Date must be entered.') );
   Raise Form_Trigger_Failure;
end if;
--
if :frbprop_status_code is null and :frbprop_status_date is not null then
   message( G$_NLS.Get('FRAPROP-0017', 'FORM','Proposal Status Code must be entered.') );
   Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_STATUS_CODE_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_STATUS_CODE_DATE")
		public void Fraprop_CheckStatusCodeDate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropStatusCode().isNull() && frbpropElement.getFrbpropStatusDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0016"), toStr("FORM"), toStr("Proposal Status Date must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropStatusCode().isNull() && !frbpropElement.getFrbpropStatusDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0017"), toStr("FORM"), toStr("Proposal Status Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_HISTORY
		 IF :FRBPROP_STATUS_CODE IS NULL THEN
   GOTO TRIG_EXIT;
END IF;
--
 <multilinecomment>  IF SELECT_FRVPRST_2 THEN
      GOTO ins_ftvprst ;
   END IF ;
   GOTO trig_exit ; </multilinecomment>
--
   << ins_ftvprst >>
--
   INSERT_FRVPRST_1;
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, TRUE);
--
   << TRIG_EXIT >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_HISTORY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_HISTORY")
		public void Fraprop_GetHistory()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropStatusCode().isNull() )
				{
//					 goto TRIG_EXIT;
					 return;
				}
				 INS_FTVPRST:;
				// 
				this.getTask().getServices().insertFrvprst1(frbpropElement);
				getTask().getGoqrpls().gCheckValue( toBool(NBool.False), toStr(null), toBool(NBool.True));
//				getTask().getGoqrpls().gCheckValue( rowCount == 0, toStr(null), toBool(NBool.True));
				 TRIG_EXIT:;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.VALIDATE_USER_FIELDS
		 declare
 hold_title    frvsdat.frvsdat_title%type;
 field_value   frvsdat.frvsdat_sdat_code_opt_1%type;
 value_to      varchar2(50);
 cursor c1 is 
  select frvsdat_title
   from frvsdat
     where frvsdat_sdat_code_attr = :FRRPUSN_SDAT_CODE_ATTR
       and frvsdat_sdat_code_opt_1 = field_value;
 
begin
 field_value := NAME_IN(:SYSTEM.TRIGGER_ITEM);
 open c1;
   fetch c1 into hold_title;
   value_to := GET_ITEM_PROPERTY(:SYSTEM.TRIGGER_ITEM,NEXTITEM);
    COPY(hold_title,value_to);
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0018', 'FORM','Value Code is invalid. LIST is available.') );
         close c1;
      raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.VALIDATE_USER_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_USER_FIELDS")
		public void Fraprop_ValidateUserFields()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);


				int rowCount = 0;
				{
					NString holdTitle= NString.getNull();
					NString fieldValue= NString.getNull();
					NString valueTo= NString.getNull();
					String sqlc1 = "SELECT frvsdat_title " +
	" FROM frvsdat " +
	" WHERE frvsdat_sdat_code_attr = :FRRPUSN_SDAT_CODE_ATTR AND frvsdat_sdat_code_opt_1 = :P_FIELD_VALUE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						fieldValue = getNameIn(getTriggerItem());
						//Setting query parameters
						c1.addParameter("FRRPUSN_SDAT_CODE_ATTR", frrpusnElement.getFrrpusnSdatCodeAttr());
						c1.addParameter("P_FIELD_VALUE", fieldValue);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							holdTitle = c1Results.getStr(0);
						}
						valueTo = toStr(getItemNextItem(getTriggerItem()));
						copy(holdTitle,valueTo);
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0018"), toStr("FORM"), toStr("Value Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_USER_FIELDS
		 declare
 val varchar2(50);
begin
 for i in 1..10 loop
   val := 'FRBPROP_USER_CODE_'||to_char(i)||'_LIT';
   if NAME_IN(val) is not null then 
      exit;
   end if;
 end loop; 
end;
--
declare
 cursor get_user_fields is
   select ftvsdat_title
     from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBPROP'
       and ftvsdat_sdat_code_attr = 'USER_CODE_LITERALS'
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or   ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
--
       counter     number := 0;
       title       ftvsdat.ftvsdat_title%type;
       field_name  varchar2(50) := '';
begin
     open get_user_fields;
     loop
     fetch get_user_fields into title;
        if get_user_fields%notfound then
           exit;
        else
           counter := counter +1;
              if counter > 10 then
                 exit;
              end if;
           field_name := 'FRBPROP_USER_CODE_'||to_char(counter)||'_LIT';
           COPY(title,field_name);
        end if;
     end loop;
     close get_user_fields;
end;
  
      
 
      
        
 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_USER_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_USER_FIELDS")
		public void Fraprop_GetUserFields()
		{
			
				int rowCount = 0;
				{
					NString val= NString.getNull();
					for ( int i = 1; i <= 10; i++ )
					{
						val = toStr("FRBPROP_USER_CODE_").append(toChar(i)).append("_LIT");
						if ( !getNameIn(val).isNull() )
						{
								break;
						}
					}
				}
				{
					String sqlgetUserFields = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'USER_CODE_LITERALS' AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor getUserFields = new DataCursor(sqlgetUserFields);
					// 
					NNumber counter = toNumber(0);
					NString title= NString.getNull();
					NString fieldName = toStr("");
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getUserFields.
						getUserFields.open();
						while (true) {
							ResultSet getUserFieldsResults = getUserFields.fetchInto();
							if ( getUserFieldsResults != null ) {
								title = getUserFieldsResults.getStr(0);
							}
							if ( getUserFields.notFound() )
							{
									break;
							}
							else {
								counter = counter.add(1);
								if ( counter.greater(10) )
								{
										break;
								}
								fieldName = toStr("FRBPROP_USER_CODE_").append(toChar(counter)).append("_LIT");
								copy(title,fieldName);
							}
						}
						getUserFields.close();
					}
					finally{
						getUserFields.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_CSTA_CODE_CHARGE
		 BEGIN
   IF :FRBPROP_CSTA_CODE_CHARGE IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVCSTA_DESC
   FROM   FRVCSTA
   WHERE  FRVCSTA_CODE = :FRBPROP_CSTA_CODE_CHARGE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_CSTA_CODE_CHARGE_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0019', 'FORM',' Cost Share Credit Account Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBCSTA
   WHERE  FRBCSTA_EFF_DATE <= SYSDATE
     AND (FRBCSTA_NCHG_DATE IS NULL
      OR  FRBCSTA_NCHG_DATE > SYSDATE)
     AND (FRBCSTA_TERM_DATE IS NULL
      OR  FRBCSTA_TERM_DATE > SYSDATE)
     AND  FRBCSTA_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS
     AND  FRBCSTA_CODE =      :FRBPROP_CSTA_CODE_CHARGE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0020', 'FORM',' Cost Share Credit Account Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_CSTA_CODE_CHARGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_CSTA_CODE_CHARGE")
		public void Fraprop_EditCstaCodeCharge()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCstaCodeCharge().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVCSTA_DESC " +
	" FROM FRVCSTA " +
	" WHERE FRVCSTA_CODE = :FRBPROP_CSTA_CODE_CHARGE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_CSTA_CODE_CHARGE", frbpropElement.getFrbpropCstaCodeCharge());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropCstaCodeChargeName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0019"), toStr("FORM"), toStr(" Cost Share Credit Account Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBCSTA " +
	" WHERE FRBCSTA_EFF_DATE <= SYSDATE AND (FRBCSTA_NCHG_DATE IS NULL OR FRBCSTA_NCHG_DATE > SYSDATE) AND (FRBCSTA_TERM_DATE IS NULL OR FRBCSTA_TERM_DATE > SYSDATE) AND FRBCSTA_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS AND FRBCSTA_CODE = :FRBPROP_CSTA_CODE_CHARGE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						ptiCursor.addParameter("FRBPROP_CSTA_CODE_CHARGE", frbpropElement.getFrbpropCstaCodeCharge());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0020"), toStr("FORM"), toStr(" Cost Share Credit Account Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_CSTD_CODE_DISTR
		 BEGIN
   IF :FRBPROP_CSTD_CODE_DISTR IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVCSTD_DESC
   FROM   FRVCSTD
   WHERE  FRVCSTD_CODE = :FRBPROP_CSTD_CODE_DISTR;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_CSTD_CODE_DISTR_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0021', 'FORM',' Cost Share Distribution Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBCSTD
   WHERE  FRBCSTD_EFF_DATE <= SYSDATE
     AND (FRBCSTD_NCHG_DATE IS NULL
      OR  FRBCSTD_NCHG_DATE > SYSDATE)
     AND (FRBCSTD_TERM_DATE IS NULL
      OR  FRBCSTD_TERM_DATE > SYSDATE)
     AND  FRBCSTD_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS
     AND  FRBCSTD_CODE =      :FRBPROP_CSTD_CODE_DISTR;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0022', 'FORM',' Cost Share Distribution Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_CSTD_CODE_DISTR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_CSTD_CODE_DISTR")
		public void Fraprop_EditCstdCodeDistr()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCstdCodeDistr().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVCSTD_DESC " +
	" FROM FRVCSTD " +
	" WHERE FRVCSTD_CODE = :FRBPROP_CSTD_CODE_DISTR ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_CSTD_CODE_DISTR", frbpropElement.getFrbpropCstdCodeDistr());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropCstdCodeDistrName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0021"), toStr("FORM"), toStr(" Cost Share Distribution Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBCSTD " +
	" WHERE FRBCSTD_EFF_DATE <= SYSDATE AND (FRBCSTD_NCHG_DATE IS NULL OR FRBCSTD_NCHG_DATE > SYSDATE) AND (FRBCSTD_TERM_DATE IS NULL OR FRBCSTD_TERM_DATE > SYSDATE) AND FRBCSTD_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS AND FRBCSTD_CODE = :FRBPROP_CSTD_CODE_DISTR ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						ptiCursor.addParameter("FRBPROP_CSTD_CODE_DISTR", frbpropElement.getFrbpropCstdCodeDistr());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0022"), toStr("FORM"), toStr(" Cost Share Distribution Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_COAS_CODE_IC_CS_SOFT
		 IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
     IF :FRBPROP_BASI_CODE_IC IS NOT NULL OR :FRBPROP_BASI_CODE_CS IS NOT NULL THEN
        MESSAGE( G$_NLS.Get('FRAPROP-0023', 'FORM','Chart of Accounts must be entered for Proposal I/C Information.') );
        Raise Form_Trigger_Failure;
     END IF;
END IF;
--
IF :FRBPROP_COAS_CODE_IC_CS IS NOT NULL THEN
     IF (:FRBPROP_BASI_CODE_IC IS  NULL AND :FRBPROP_BASI_CODE_CS IS NULL) THEN
        MESSAGE
 ( G$_NLS.Get('FRAPROP-0024', 'FORM','I/C or C/S Information must be entered when I/C & C/S Chart of Accounts is entered.') );
        Raise Form_Trigger_Failure;
     END IF;
END IF;
         
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_COAS_CODE_IC_CS_SOFT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_COAS_CODE_IC_CS_SOFT")
		public void Fraprop_EditCoasCodeIcCsSoft()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCoasCodeIcCs().isNull() )
				{
					if ( !frbpropElement.getFrbpropBasiCodeIc().isNull() || !frbpropElement.getFrbpropBasiCodeCs().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0023"), toStr("FORM"), toStr("Chart of Accounts must be entered for Proposal I/C Information.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !frbpropElement.getFrbpropCoasCodeIcCs().isNull() )
				{
					if ((frbpropElement.getFrbpropBasiCodeIc().isNull() && frbpropElement.getFrbpropBasiCodeCs().isNull()))
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0024"), toStr("FORM"), toStr("I/C or C/S Information must be entered when I/C & C/S Chart of Accounts is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_COST_SHARE_ITEMS
		 IF :FRBPROP_BASI_CODE_CS IS NOT NULL THEN
    IF :FRBPROP_CSTR_CODE_RATE IS NULL AND
       :FRBPROP_CSTA_CODE_CHARGE IS  NULL OR :FRBPROP_CSTD_CODE_DISTR IS NULL THEN
       GO_ITEM('FRBPROP_CSTR_CODE_RATE');
       Message( G$_NLS.Get('FRAPROP-0025', 'FORM','Cost Share Rate Code must be entered.') );
       Raise Form_Trigger_Failure;
    END IF;
END IF;
--
IF :FRBPROP_INDR_CODE_RATE IS NULL AND
 (:FRBPROP_CSTA_CODE_CHARGE IS NOT NULL OR :FRBPROP_CSTD_CODE_DISTR IS NOT NULL) THEN
   GO_ITEM('FRBPROP_CSTR_CODE_RATE');
   Message( G$_NLS.Get('FRAPROP-0026', 'FORM','Cost Share Rate Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
--
IF :FRBPROP_CSTA_CODE_CHARGE IS NULL AND
 (:FRBPROP_CSTR_CODE_RATE IS NOT NULL OR :FRBPROP_CSTD_CODE_DISTR IS NOT NULL) THEN
   GO_ITEM('FRBPROP_CSTA_CODE_CHARGE');
   Message( G$_NLS.Get('FRAPROP-0027', 'FORM','Cost Share Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
--
IF :FRBPROP_CSTD_CODE_DISTR IS NULL AND
 (:FRBPROP_CSTA_CODE_CHARGE IS NOT NULL OR :FRBPROP_CSTR_CODE_RATE IS NOT NULL) THEN
   GO_ITEM('FRBPROP_CSTD_CODE_DISTR');
   Message( G$_NLS.Get('FRAPROP-0028', 'FORM','Cost Share Distribution Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_COST_SHARE_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_COST_SHARE_ITEMS")
		public void Fraprop_CheckCostShareItems()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropBasiCodeCs().isNull() )
				{
					if ( frbpropElement.getFrbpropCstrCodeRate().isNull() && frbpropElement.getFrbpropCstaCodeCharge().isNull() || frbpropElement.getFrbpropCstdCodeDistr().isNull() )
					{
						goItem(toStr("FRBPROP_CSTR_CODE_RATE"));
						errorMessage(GNls.Fget(toStr("FRAPROP-0025"), toStr("FORM"), toStr("Cost Share Rate Code must be entered.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( frbpropElement.getFrbpropIndrCodeRate().isNull() && (!frbpropElement.getFrbpropCstaCodeCharge().isNull() || !frbpropElement.getFrbpropCstdCodeDistr().isNull()) )
				{
					goItem(toStr("FRBPROP_CSTR_CODE_RATE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0026"), toStr("FORM"), toStr("Cost Share Rate Code must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropCstaCodeCharge().isNull() && (!frbpropElement.getFrbpropCstrCodeRate().isNull() || !frbpropElement.getFrbpropCstdCodeDistr().isNull()) )
				{
					goItem(toStr("FRBPROP_CSTA_CODE_CHARGE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0027"), toStr("FORM"), toStr("Cost Share Code must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropCstdCodeDistr().isNull() && (!frbpropElement.getFrbpropCstaCodeCharge().isNull() || !frbpropElement.getFrbpropCstrCodeRate().isNull()) )
				{
					goItem(toStr("FRBPROP_CSTD_CODE_DISTR"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0028"), toStr("FORM"), toStr("Cost Share Distribution Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_INDIRECT_COST_ITEMS
		 IF :FRBPROP_BASI_CODE_IC IS NOT NULL THEN
    IF :FRBPROP_INDR_CODE_RATE IS NULL AND
       :FRBPROP_INDA_CODE_CHARGE IS  NULL OR :FRBPROP_INDD_CODE_DISTR IS NULL THEN
       GO_ITEM('FRBPROP_INDR_CODE_RATE');
       Message( G$_NLS.Get('FRAPROP-0029', 'FORM','Indirect Cost Rate Code must be entered.') );
       Raise Form_Trigger_Failure;
    END IF;
END IF;
--
IF :FRBPROP_INDR_CODE_RATE IS NULL AND
 (:FRBPROP_INDA_CODE_CHARGE IS NOT NULL OR :FRBPROP_INDD_CODE_DISTR IS NOT NULL) THEN
   GO_ITEM('FRBPROP_INDR_CODE_RATE');
   Message( G$_NLS.Get('FRAPROP-0030', 'FORM','Indirect Cost Rate Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
--
IF :FRBPROP_INDA_CODE_CHARGE IS NULL AND
 (:FRBPROP_INDR_CODE_RATE IS NOT NULL OR :FRBPROP_INDD_CODE_DISTR IS NOT NULL) THEN
   GO_ITEM('FRBPROP_INDA_CODE_CHARGE');
   Message( G$_NLS.Get('FRAPROP-0031', 'FORM','Indirect Cost Charge Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
--
IF :FRBPROP_INDD_CODE_DISTR IS NULL AND
 (:FRBPROP_INDA_CODE_CHARGE IS NOT NULL OR :FRBPROP_INDR_CODE_RATE IS NOT NULL) THEN
   GO_ITEM('FRBPROP_INDD_CODE_DISTR');
   Message( G$_NLS.Get('FRAPROP-0032', 'FORM','Indirect Cost Distribution Code must be entered.') );
   Raise Form_Trigger_Failure;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_INDIRECT_COST_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_INDIRECT_COST_ITEMS")
		public void Fraprop_CheckIndirectCostItems()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropBasiCodeIc().isNull() )
				{
					if ( frbpropElement.getFrbpropIndrCodeRate().isNull() && frbpropElement.getFrbpropIndaCodeCharge().isNull() || frbpropElement.getFrbpropInddCodeDistr().isNull() )
					{
						goItem(toStr("FRBPROP_INDR_CODE_RATE"));
						errorMessage(GNls.Fget(toStr("FRAPROP-0029"), toStr("FORM"), toStr("Indirect Cost Rate Code must be entered.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( frbpropElement.getFrbpropIndrCodeRate().isNull() && (!frbpropElement.getFrbpropIndaCodeCharge().isNull() || !frbpropElement.getFrbpropInddCodeDistr().isNull()) )
				{
					goItem(toStr("FRBPROP_INDR_CODE_RATE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0030"), toStr("FORM"), toStr("Indirect Cost Rate Code must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropIndaCodeCharge().isNull() && (!frbpropElement.getFrbpropIndrCodeRate().isNull() || !frbpropElement.getFrbpropInddCodeDistr().isNull()) )
				{
					goItem(toStr("FRBPROP_INDA_CODE_CHARGE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0031"), toStr("FORM"), toStr("Indirect Cost Charge Code must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropInddCodeDistr().isNull() && (!frbpropElement.getFrbpropIndaCodeCharge().isNull() || !frbpropElement.getFrbpropIndrCodeRate().isNull()) )
				{
					goItem(toStr("FRBPROP_INDD_CODE_DISTR"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0032"), toStr("FORM"), toStr("Indirect Cost Distribution Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_INDD_CODE_DISTR
		 BEGIN
   IF :FRBPROP_INDD_CODE_DISTR IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVINDD_DESC
   FROM   FRVINDD
   WHERE  FRVINDD_CODE = :FRBPROP_INDD_CODE_DISTR;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_INDD_CODE_DISTR_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0033', 'FORM','Indirect Cost Distribution Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBINDD
   WHERE  FRBINDD_EFF_DATE <= SYSDATE
     AND (FRBINDD_NCHG_DATE IS NULL
      OR  FRBINDD_NCHG_DATE > SYSDATE)
     AND (FRBINDD_TERM_DATE IS NULL
      OR  FRBINDD_TERM_DATE > SYSDATE)
     AND  FRBINDD_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS
     AND  FRBINDD_CODE = :FRBPROP_INDD_CODE_DISTR;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0034', 'FORM','Indirect Cost Distribution Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_INDD_CODE_DISTR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_INDD_CODE_DISTR")
		public void Fraprop_EditInddCodeDistr()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropInddCodeDistr().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVINDD_DESC " +
	" FROM FRVINDD " +
	" WHERE FRVINDD_CODE = :FRBPROP_INDD_CODE_DISTR ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_INDD_CODE_DISTR", frbpropElement.getFrbpropInddCodeDistr());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropInddCodeDistrName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0033"), toStr("FORM"), toStr("Indirect Cost Distribution Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBINDD " +
	" WHERE FRBINDD_EFF_DATE <= SYSDATE AND (FRBINDD_NCHG_DATE IS NULL OR FRBINDD_NCHG_DATE > SYSDATE) AND (FRBINDD_TERM_DATE IS NULL OR FRBINDD_TERM_DATE > SYSDATE) AND FRBINDD_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS AND FRBINDD_CODE = :FRBPROP_INDD_CODE_DISTR ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						ptiCursor.addParameter("FRBPROP_INDD_CODE_DISTR", frbpropElement.getFrbpropInddCodeDistr());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0034"), toStr("FORM"), toStr("Indirect Cost Distribution Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_INDA_CODE_CHARGE
		 BEGIN
   IF :FRBPROP_INDA_CODE_CHARGE IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVINDA_DESC
   FROM   FRVINDA
   WHERE  FRVINDA_CODE = :FRBPROP_INDA_CODE_CHARGE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_INDA_CODE_CHARGE_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0035', 'FORM','Indirect Cost Charge Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBINDA
   WHERE  FRBINDA_EFF_DATE <= SYSDATE
     AND (FRBINDA_NCHG_DATE IS NULL
      OR  FRBINDA_NCHG_DATE > SYSDATE)
     AND (FRBINDA_TERM_DATE IS NULL
      OR  FRBINDA_TERM_DATE > SYSDATE)
     AND  FRBINDA_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS
     AND  FRBINDA_CODE = :FRBPROP_INDA_CODE_CHARGE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0036', 'FORM','Indirect Cost Charge Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_INDA_CODE_CHARGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_INDA_CODE_CHARGE")
		public void Fraprop_EditIndaCodeCharge()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropIndaCodeCharge().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVINDA_DESC " +
	" FROM FRVINDA " +
	" WHERE FRVINDA_CODE = :FRBPROP_INDA_CODE_CHARGE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_INDA_CODE_CHARGE", frbpropElement.getFrbpropIndaCodeCharge());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropIndaCodeChargeName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0035"), toStr("FORM"), toStr("Indirect Cost Charge Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBINDA " +
	" WHERE FRBINDA_EFF_DATE <= SYSDATE AND (FRBINDA_NCHG_DATE IS NULL OR FRBINDA_NCHG_DATE > SYSDATE) AND (FRBINDA_TERM_DATE IS NULL OR FRBINDA_TERM_DATE > SYSDATE) AND FRBINDA_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS AND FRBINDA_CODE = :FRBPROP_INDA_CODE_CHARGE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						ptiCursor.addParameter("FRBPROP_INDA_CODE_CHARGE", frbpropElement.getFrbpropIndaCodeCharge());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0036"), toStr("FORM"), toStr("Indirect Cost Charge Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_CSTR_CODE_RATE
		 BEGIN
   IF :FRBPROP_CSTR_CODE_RATE IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVCSTR_DESC
   FROM   FRVCSTR
   WHERE  FRVCSTR_CODE = :FRBPROP_CSTR_CODE_RATE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_CSTR_CODE_RATE_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0037', 'FORM',' Cost Share Rate Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRRCSTR
   WHERE  FRRCSTR_EFF_DATE <= SYSDATE
     AND (FRRCSTR_NCHG_DATE IS NULL
      OR  FRRCSTR_NCHG_DATE > SYSDATE)
     AND (FRRCSTR_TERM_DATE IS NULL
      OR  FRRCSTR_TERM_DATE > SYSDATE)
     AND  FRRCSTR_CODE = :FRBPROP_CSTR_CODE_RATE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0038', 'FORM',' Cost Share Rate Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_CSTR_CODE_RATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_CSTR_CODE_RATE")
		public void Fraprop_EditCstrCodeRate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCstrCodeRate().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVCSTR_DESC " +
	" FROM FRVCSTR " +
	" WHERE FRVCSTR_CODE = :FRBPROP_CSTR_CODE_RATE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_CSTR_CODE_RATE", frbpropElement.getFrbpropCstrCodeRate());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropCstrCodeRateName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0037"), toStr("FORM"), toStr(" Cost Share Rate Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRRCSTR " +
	" WHERE FRRCSTR_EFF_DATE <= SYSDATE AND (FRRCSTR_NCHG_DATE IS NULL OR FRRCSTR_NCHG_DATE > SYSDATE) AND (FRRCSTR_TERM_DATE IS NULL OR FRRCSTR_TERM_DATE > SYSDATE) AND FRRCSTR_CODE = :FRBPROP_CSTR_CODE_RATE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_CSTR_CODE_RATE", frbpropElement.getFrbpropCstrCodeRate());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0038"), toStr("FORM"), toStr(" Cost Share Rate Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.RE_EDIT
		 BEGIN
	--1-BMV7IL
	:FORM_HEADER.ORG_VALIDATE_FLAG := 'N';  
	:FORM_HEADER.ORG_P_VALIDATE_FLAG := 'N';
	--
	 EXECUTE_TRIGGER('EDIT_COAS_CODE');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_ORGN_CODE');
   G$_CHECK_FAILURE;
	-- 1-BMV7IL
		EXECUTE_TRIGGER('EDIT_PERSON_ID');
		G$_CHECK_FAILURE;
	--
   EXECUTE_TRIGGER('EDIT_COAS_CODE_IC_CS_SOFT');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_COAS_CODE_IC_CS');
   G$_CHECK_FAILURE;
--
   EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_CS');
   G$_CHECK_FAILURE;
--
   EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_1');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_2');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_3');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_IC');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_INDR_CODE_RATE');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_INDA_CODE_CHARGE');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_INDD_CODE_DISTR');
   G$_CHECK_FAILURE;
--
   EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_1');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_2');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_3');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_BASI_CODE_CS');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_CSTR_CODE_RATE');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_CSTA_CODE_CHARGE');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('EDIT_CSTD_CODE_DISTR');
   G$_CHECK_FAILURE;
--
   EXECUTE_TRIGGER('CHECK_STATUS_CODE_DATE');
   G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('CHECK_PREP_$_DUE_DATES');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.RE_EDIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="RE_EDIT")
		public void Fraprop_ReEdit()
		{
			
				// 1-BMV7IL
				getFormModel().getFormHeader().setOrgValidateFlag(toStr("N"));
				getFormModel().getFormHeader().setOrgPValidateFlag(toStr("N"));
				// 
				executeAction("EDIT_COAS_CODE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_ORGN_CODE");
				getTask().getGoqrpls().gCheckFailure();
				//  1-BMV7IL
				executeAction("EDIT_PERSON_ID");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("EDIT_COAS_CODE_IC_CS_SOFT");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_COAS_CODE_IC_CS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("EDIT_BASI_CODE_IC_CS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("EDIT_BASI_CODE_IC_SOFT_1");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_IC_SOFT_2");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_IC_SOFT_3");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_IC");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_INDR_CODE_RATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_INDA_CODE_CHARGE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_INDD_CODE_DISTR");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("EDIT_BASI_CODE_CS_SOFT_1");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_CS_SOFT_2");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_CS_SOFT_3");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_BASI_CODE_CS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_CSTR_CODE_RATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_CSTA_CODE_CHARGE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("EDIT_CSTD_CODE_DISTR");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_STATUS_CODE_DATE");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_PREP_$_DUE_DATES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_IC_SOFT_1
		 BEGIN
   IF :FRBPROP_INDR_CODE_RATE IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_IC IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0039', 'FORM','I/C Basis Code is required if a I/C Rate Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_IC_SOFT_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_IC_SOFT_1")
		public void Fraprop_EditBasiCodeIcSoft1()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropIndrCodeRate().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeIc().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0039"), toStr("FORM"), toStr("I/C Basis Code is required if a I/C Rate Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_CS_SOFT_1
		 BEGIN
   IF :FRBPROP_CSTR_CODE_RATE IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_CS IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0040', 'FORM','C/S Basis Code is required if a C/S Rate Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_CS_SOFT_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_CS_SOFT_1")
		public void Fraprop_EditBasiCodeCsSoft1()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropCstrCodeRate().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeCs().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0040"), toStr("FORM"), toStr("C/S Basis Code is required if a C/S Rate Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_CS_SOFT_2
		 BEGIN
   IF :FRBPROP_CSTA_CODE_CHARGE IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_CS IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0041', 'FORM','C/S Basis Code is required if a C/S Credit Account Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_CS_SOFT_2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_CS_SOFT_2")
		public void Fraprop_EditBasiCodeCsSoft2()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropCstaCodeCharge().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeCs().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0041"), toStr("FORM"), toStr("C/S Basis Code is required if a C/S Credit Account Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_CS_SOFT_3
		 BEGIN
   IF :FRBPROP_CSTD_CODE_DISTR IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_CS IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0042', 'FORM','C/S Basis Code is required if a C/S Distribution Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_CS_SOFT_3
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_CS_SOFT_3")
		public void Fraprop_EditBasiCodeCsSoft3()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropCstdCodeDistr().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeCs().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0042"), toStr("FORM"), toStr("C/S Basis Code is required if a C/S Distribution Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_IC_SOFT_2
		 BEGIN
   IF :FRBPROP_INDA_CODE_CHARGE IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_IC IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0043', 'FORM','I/C Basis Code is required if a I/C Charge Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_IC_SOFT_2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_IC_SOFT_2")
		public void Fraprop_EditBasiCodeIcSoft2()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropIndaCodeCharge().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeIc().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0043"), toStr("FORM"), toStr("I/C Basis Code is required if a I/C Charge Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_IC_SOFT_3
		 BEGIN
   IF :FRBPROP_INDD_CODE_DISTR IS NOT NULL THEN
      IF :FRBPROP_BASI_CODE_IC IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0044', 'FORM','I/C Basis Code is required if a I/C Distribution Code is entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_IC_SOFT_3
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_IC_SOFT_3")
		public void Fraprop_EditBasiCodeIcSoft3()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropInddCodeDistr().isNull() )
				{
					if ( frbpropElement.getFrbpropBasiCodeIc().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0044"), toStr("FORM"), toStr("I/C Basis Code is required if a I/C Distribution Code is entered.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_INDR_CODE_RATE
		 BEGIN
   IF :FRBPROP_INDR_CODE_RATE IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   CURSOR PTI_CURSOR IS
   SELECT FRVINDR_DESC
   FROM   FRVINDR
   WHERE  FRVINDR_CODE = :FRBPROP_INDR_CODE_RATE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_INDR_CODE_RATE_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0045', 'FORM','Indirect Cost Rate Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRRINDR
   WHERE  FRRINDR_EFF_DATE <= SYSDATE
     AND (FRRINDR_NCHG_DATE IS NULL
      OR  FRRINDR_NCHG_DATE > SYSDATE)
     AND (FRRINDR_TERM_DATE IS NULL
      OR  FRRINDR_TERM_DATE > SYSDATE)
     AND  FRRINDR_CODE = :FRBPROP_INDR_CODE_RATE;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE
  (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0046', 'FORM','Indirect Cost Rate Code is invalid;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_INDR_CODE_RATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_INDR_CODE_RATE")
		public void Fraprop_EditIndrCodeRate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropIndrCodeRate().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT FRVINDR_DESC " +
	" FROM FRVINDR " +
	" WHERE FRVINDR_CODE = :FRBPROP_INDR_CODE_RATE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_INDR_CODE_RATE", frbpropElement.getFrbpropIndrCodeRate());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropIndrCodeRateName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0045"), toStr("FORM"), toStr("Indirect Cost Rate Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRRINDR " +
	" WHERE FRRINDR_EFF_DATE <= SYSDATE AND (FRRINDR_NCHG_DATE IS NULL OR FRRINDR_NCHG_DATE > SYSDATE) AND (FRRINDR_TERM_DATE IS NULL OR FRRINDR_TERM_DATE > SYSDATE) AND FRRINDR_CODE = :FRBPROP_INDR_CODE_RATE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_INDR_CODE_RATE", frbpropElement.getFrbpropIndrCodeRate());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0046"), toStr("FORM"), toStr("Indirect Cost Rate Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_CS
		 BEGIN
   IF :FRBPROP_BASI_CODE_CS IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT FRVBASI_DESC
   FROM   FRVBASI
   WHERE  FRVBASI_CODE = :FRBPROP_BASI_CODE_CS
     AND  FRVBASI_TYPE = 'C';
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_BASI_CODE_CS_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0047', 'FORM','Cost Share Basis Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBBASI
   WHERE  FRBBASI_EFF_DATE <= SYSDATE
     AND (FRBBASI_NCHG_DATE IS NULL
      OR  FRBBASI_NCHG_DATE > SYSDATE)
     AND (FRBBASI_TERM_DATE IS NULL
      OR  FRBBASI_TERM_DATE > SYSDATE)
     AND  FRBBASI_CODE = :FRBPROP_BASI_CODE_CS
     AND  FRBBASI_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0048', 'FORM','Cost Share Basis Code is not effective;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_CS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_CS")
		public void Fraprop_EditBasiCodeCs()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropBasiCodeCs().isNull() )
				{
					return ;
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT FRVBASI_DESC " +
	" FROM FRVBASI " +
	" WHERE FRVBASI_CODE = :FRBPROP_BASI_CODE_CS AND FRVBASI_TYPE = 'C' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_BASI_CODE_CS", frbpropElement.getFrbpropBasiCodeCs());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropBasiCodeCsName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0047"), toStr("FORM"), toStr("Cost Share Basis Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBBASI " +
	" WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE IS NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :FRBPROP_BASI_CODE_CS AND FRBBASI_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_BASI_CODE_CS", frbpropElement.getFrbpropBasiCodeCs());
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0048"), toStr("FORM"), toStr("Cost Share Basis Code is not effective;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_BASI_CODE_IC
		 BEGIN
   IF :FRBPROP_BASI_CODE_IC IS NULL THEN
      RETURN;
   END IF;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT FRVBASI_DESC
   FROM   FRVBASI
   WHERE  FRVBASI_CODE = :FRBPROP_BASI_CODE_IC
     AND  FRVBASI_TYPE = 'I';
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :FRBPROP_BASI_CODE_IC_NAME;
      G$_CHECK_VALUE
 (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0049', 'FORM','Indirect Cost Basis Code is invalid;  LIST is available.') , TRUE);
   END;
--
   DECLARE
   PTI_TEMP VARCHAR2(1);
   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM   FRBBASI
   WHERE  FRBBASI_EFF_DATE <= SYSDATE
     AND (FRBBASI_NCHG_DATE IS NULL
      OR  FRBBASI_NCHG_DATE > SYSDATE)
     AND (FRBBASI_TERM_DATE IS NULL
      OR  FRBBASI_TERM_DATE > SYSDATE)
     AND  FRBBASI_CODE = :FRBPROP_BASI_CODE_IC
     AND  FRBBASI_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_TEMP;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAPROP-0050', 'FORM','Indirect Cost Basis Code is not effective;  LIST is available.') , TRUE);
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_BASI_CODE_IC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_BASI_CODE_IC")
		public void Fraprop_EditBasiCodeIc()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropBasiCodeIc().isNull() )
				{
					return ;
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT FRVBASI_DESC " +
	" FROM FRVBASI " +
	" WHERE FRVBASI_CODE = :FRBPROP_BASI_CODE_IC AND FRVBASI_TYPE = 'I' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_BASI_CODE_IC", frbpropElement.getFrbpropBasiCodeIc());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frbpropElement.setFrbpropBasiCodeIcName(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0049"), toStr("FORM"), toStr("Indirect Cost Basis Code is invalid;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					NString ptiTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBBASI " +
	" WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE IS NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :FRBPROP_BASI_CODE_IC AND FRBBASI_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_BASI_CODE_IC", frbpropElement.getFrbpropBasiCodeIc());
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0050"), toStr("FORM"), toStr("Indirect Cost Basis Code is not effective;  LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_COAS_CODE_IC_CS
		 IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
    RETURN;
END IF;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'),
            FTVCOAS_STATUS_IND
         FROM   FTVCOAS
         WHERE  FTVCOAS_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS
           AND  FTVCOAS_EFF_DATE <= SYSDATE              
           AND  FTVCOAS_NCHG_DATE > SYSDATE     
           AND  (FTVCOAS_TERM_DATE IS NULL
            OR  FTVCOAS_TERM_DATE > SYSDATE);     
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :WORKFLD, :WORK_STATUS_IND ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAPROP-0051', 'FORM','Chart of Accounts is invalid; LIST is available.') ,
          TRUE);
   END ;
--
   EXECUTE_TRIGGER( 'TEST_TABLE_STATUS' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('FRAPROP-0052', 'FORM','Chart of Accounts is not Active.') , TRUE);
   :WORK_STATUS_IND := '';
--
   EXECUTE_TRIGGER( 'TEST_TABLE_TERM' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('FRAPROP-0053', 'FORM','Chart of Accounts is Terminated.') , TRUE);
   :WORKFLD := ''; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_COAS_CODE_IC_CS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_COAS_CODE_IC_CS")
		public void Fraprop_EditCoasCodeIcCs()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCoasCodeIcCs().isNull() )
				{
					return ;
				}
				{
					String sqlptiCursor = "SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVCOAS_STATUS_IND " +
	" FROM FTVCOAS " +
	" WHERE FTVCOAS_COAS_CODE = :FRBPROP_COAS_CODE_IC_CS AND FTVCOAS_EFF_DATE <= SYSDATE AND FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR FTVCOAS_TERM_DATE > SYSDATE) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE_IC_CS", frbpropElement.getFrbpropCoasCodeIcCs());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setWorkfld(ptiCursorResults.getStr(0));
							getFormModel().getFormHeader().setWorkStatusInd(ptiCursorResults.getStr(1));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0051"), toStr("FORM"), toStr("Chart of Accounts is invalid; LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				executeAction("TEST_TABLE_STATUS");
				// F2J_TO_REMOVE *: Call to built-in "FORM_SUCCESS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getTask().getGoqrpls().gCheckValue(SupportClasses.SQLFORMS.FormSuccess().not(), GNls.Fget(toStr("FRAPROP-0052"), toStr("FORM"), toStr("Chart of Accounts is not Active.")), toBool(NBool.True));
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'FORM_SUCCESS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
				// 
				executeAction("TEST_TABLE_TERM");
				// F2J_TO_REMOVE *: Call to built-in "FORM_SUCCESS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getTask().getGoqrpls().gCheckValue(SupportClasses.SQLFORMS.FormSuccess().not(), GNls.Fget(toStr("FRAPROP-0053"), toStr("FORM"), toStr("Chart of Accounts is Terminated.")), toBool(NBool.True));
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'FORM_SUCCESS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				getFormModel().getFormHeader().setWorkfld(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN_WINDOW_ACTIVATED_TRG
		 
--Defect 1-12RYE9 Begins
IF nvl(:SYSTEM.EVENT_WINDOW,'x') in('COPY_PROP','x') and
   :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
   G$_SET_WIN_PROPERTY;
   G$_SET_INST_PROPERTY;
END IF;


if :system.current_item='copy_block.copy_prop_code' or :SYSTEM.EVENT_WINDOW ='COPY_PROP' then
	G$_DETERMINE_CURSOR_LOCATION ('copy_block.copy_prop_code');
else
IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN
   IF GET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE', ENABLED) = 'FALSE' THEN
      G$_DETERMINE_CURSOR_LOCATION ('FRBPROP.FRBPROP_COAS_CODE');
   END IF;
END IF;  
end if;
--Defect 1-12RYE9 Ends

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Fraprop_WhenWindowActivatedTrg()
		{
			
				// Defect 1-12RYE9 Begins
				// Defect 1-12RYE9 Begins
				if ( in(isNull(getCurrentWindow(), "x"), "COPY_PROP", "x").getValue() && getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetWinProperty();
					getTask().getGoqrpls().gSetInstProperty();
				}
				if ( getCurrentItem().equals("copy_block.copy_prop_code") || getCurrentWindow().equals("COPY_PROP") )
				{
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("copy_block.copy_prop_code"));
				}
				else {
					if ( getCurrentWindow().equals("MAIN_WINDOW") )
					{
						if ( getItemEnabled("DISPLAY_FRBPROP_CODE").equals("FALSE") )
						{
							getTask().getGoqrpls().gDetermineCursorLocation(toStr("FRBPROP.FRBPROP_COAS_CODE"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CLOSE_WINDOWS
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Fraprop_CloseWindows()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_LOCN_CODE
		    IF :FRRPLOC_LOCN_CODE IS NULL  THEN
      EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         RETURN ;
      END IF ;
   END IF ;
--
   << R >>
   DECLARE
      coas_code  frbprop.frbprop_coas_code%type;
      CURSOR PTI_CURSOR IS
         SELECT FTVLOCN_TITLE, FTVLOCN_STATUS_IND
         FROM   FTVLOCN
         WHERE  FTVLOCN_COAS_CODE IN (:FRBPROP_COAS_CODE, coas_code)
           AND  FTVLOCN_LOCN_CODE = :FRRPLOC_LOCN_CODE
           AND  FTVLOCN_EFF_DATE <= SYSDATE
           AND  FTVLOCN_NCHG_DATE > SYSDATE
           AND  (FTVLOCN_TERM_DATE IS NULL
            OR  FTVLOCN_TERM_DATE > SYSDATE) ;
   BEGIN
      coas_code := NVL(:FRBPROP_COAS_CODE_IC_CS,:FRBPROP_COAS_CODE);

      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :FRRPLOC_LOCN_TITLE, :FORM_HEADER.WORK_STATUS_IND ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO F_LOCN_1 ;
      ELSE
         GOTO S_LOCN_1 ;
      END IF ;
   END ;
--
   << F_LOCN_1 >>
      MESSAGE (  G$_NLS.Get('FRAPROP-0054', 'FORM','Location Code is invalid; LIST is available.')  );
      :FORM_HEADER.WORK_STATUS_IND := '';
      RAISE FORM_TRIGGER_FAILURE ;
--
   << S_LOCN_1 >>
   IF G$_NCHK(:FORM_HEADER.WORK_STATUS_IND <> 'A') THEN
      MESSAGE (
          G$_NLS.Get('FRAPROP-0055', 'FORM','Location entered is not active. LIST is available.')  );
      :FORM_HEADER.WORK_STATUS_IND := '';
      RAISE FORM_TRIGGER_FAILURE ; 
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_LOCN_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_LOCN_CODE")
		public void Fraprop_EditLocnCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrplocAdapter frrplocElement = (FrrplocAdapter)this.getFormModel().getFrrploc().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frrplocElement.getFrrplocLocnCode().isNull() )
				{
					try {
						executeAction("TRG_FAIL");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						return ;
//					}
					}
					catch(Exception e) {
						return;
					}
				}
				 R:;
				{
					NString coasCode= NString.getNull();
					String sqlptiCursor = "SELECT FTVLOCN_TITLE, FTVLOCN_STATUS_IND " +
	" FROM FTVLOCN " +
	" WHERE (FTVLOCN_COAS_CODE) IN (:FRBPROP_COAS_CODE, :P_COAS_CODE) AND FTVLOCN_LOCN_CODE = :FRRPLOC_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						coasCode = isNull(frbpropElement.getFrbpropCoasCodeIcCs(), frbpropElement.getFrbpropCoasCode());
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						ptiCursor.addParameter("P_COAS_CODE", coasCode);
						ptiCursor.addParameter("FRRPLOC_LOCN_CODE", frrplocElement.getFrrplocLocnCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							frrplocElement.setFrrplocLocnTitle(ptiCursorResults.getStr(0));
							getFormModel().getFormHeader().setWorkStatusInd(ptiCursorResults.getStr(1));
						}
						if ( ptiCursor.notFound() )
						{
//							 goto F_LOCN_1;
//							 F_LOCN_1:;
								errorMessage(GNls.Fget(toStr("FRAPROP-0054"), toStr("FORM"), toStr("Location Code is invalid; LIST is available.")));
								getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
								throw new ApplicationException();
						}
						else {
//							 goto S_LOCN_1;
//							 S_LOCN_1:;
								if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A"))).getValue() )
								{
									errorMessage(GNls.Fget(toStr("FRAPROP-0055"), toStr("FORM"), toStr("Location entered is not active. LIST is available.")));
									getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
									throw new ApplicationException();
								}
						}
					}
					finally{
						ptiCursor.close();
					}
				}
//				 F_LOCN_1:;
//				message(GNls.Fget(toStr("FRAPROP-0054"), toStr("FORM"), toStr("Location Code is invalid; LIST is available.")));
//				getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//				throw new ApplicationException();
//				 S_LOCN_1:;
//				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A"))).getValue() )
//				{
//					message(GNls.Fget(toStr("FRAPROP-0055"), toStr("FORM"), toStr("Location entered is not active. LIST is available.")));
//					getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//					throw new ApplicationException();
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_AGENCY_CODE
		 :frbprop_agency_code := NULL;
:frbprop_agency_name := NULL;
g$_sel_spriden_id_name(:frbprop_agency_pidm, 'FRBPROP_AGENCY_NAME', 'Y', :frbprop_agency_code);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_AGENCY_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_AGENCY_CODE")
		public void Fraprop_GetAgencyCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setFrbpropAgencyCode(toStr(null));
				frbpropElement.setFrbpropAgencyName(toStr(null));
				Ref<NString> pId_ref = new Ref<NString>(frbpropElement.getFrbpropAgencyCode());
				getTask().getGoqrpls().gSelSpridenIdName(frbpropElement.getFrbpropAgencyPidm(), toStr("FRBPROP_AGENCY_NAME"), toStr("Y"), pId_ref);
				frbpropElement.setFrbpropAgencyCode(pId_ref.val);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_PI_ID_CODE
		 :frbprop_pi_id_code := NULL;
:frbprop_pi_id_name := NULL;
g$_sel_spriden_id_name(:frbprop_pi_pidm, 'FRBPROP_PI_ID_NAME', 'Y', :frbprop_pi_id_code);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_PI_ID_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_PI_ID_CODE")
		public void Fraprop_GetPiIdCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setFrbpropPiIdCode(toStr(null));
				frbpropElement.setFrbpropPiIdName(toStr(null));
				Ref<NString> pId_ref = new Ref<NString>(frbpropElement.getFrbpropPiIdCode());
				getTask().getGoqrpls().gSelSpridenIdName(frbpropElement.getFrbpropPiPidm(), toStr("FRBPROP_PI_ID_NAME"), toStr("Y"), pId_ref);
				frbpropElement.setFrbpropPiIdCode(pId_ref.val);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_AGENCY_CONTACT
		 DECLARE
     cursor get_agency_contact is
        select ftvagcy_contact 
        from ftvagcy
        where ftvagcy_agcy_code_pidm = :frbprop_agency_pidm;
BEGIN
   open get_agency_contact;
   fetch get_agency_contact into :frbprop_agency_contact;
    if get_agency_contact%NOTFOUND then
       close get_agency_contact;
       return;
    end if;
     close get_agency_contact;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_AGENCY_CONTACT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_AGENCY_CONTACT")
		public void Fraprop_GetAgencyContact()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlgetAgencyContact = "SELECT ftvagcy_contact " +
	" FROM ftvagcy " +
	" WHERE ftvagcy_agcy_code_pidm = :FRBPROP_AGENCY_PIDM ";
					DataCursor getAgencyContact = new DataCursor(sqlgetAgencyContact);
					try {
						//Setting query parameters
						getAgencyContact.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getAgencyContact.
						getAgencyContact.open();
						ResultSet getAgencyContactResults = getAgencyContact.fetchInto();
						if ( getAgencyContactResults != null ) {
							frbpropElement.setFrbpropAgencyContact(getAgencyContactResults.getStr(0));
						}
						if ( getAgencyContact.notFound() )
						{
							getAgencyContact.close();
							return ;
						}
						getAgencyContact.close();
					}
					finally{
						getAgencyContact.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GEN_FOBSEQN_NUMBER
		 DECLARE
   hold_frbprop_code   frbprop.frbprop_code%type;
--
   CURSOR PTI_CURSOR IS
    SELECT FOBSEQN_SEQNO_PREFIX || LPAD(TO_CHAR(
      FOBSEQN_MAXSEQNO), 8, '0')
      FROM   FOBSEQN
      WHERE  FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE ;
BEGIN
   << GEN_DOC_CODE >>
   UPDATE FOBSEQN
   SET    FOBSEQN_MAXSEQNO = (NVL(FOBSEQN_MAXSEQNO, 0) + 1)
   WHERE  FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE ;
   G$_CHECK_VALUE (SQL%NOTFOUND,
        G$_NLS.Get('FRAPROP-0056', 'FORM','Could not update FOBSEQN table for newly generated document code') , TRUE);
--
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO hold_frbprop_code ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAPROP-0057', 'FORM','Could not generate new document number') , TRUE);
      CLOSE PTI_CURSOR;
--
    IF SELECT_FRBPROP_1(hold_frbprop_code) THEN
         GOTO GEN_DOC_CODE ;
    END IF ;
--
   :display_frbprop_code := hold_frbprop_code;
   :frbprop_code := hold_frbprop_code;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GEN_FOBSEQN_NUMBER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GEN_FOBSEQN_NUMBER")
		public void Fraprop_GenFobseqnNumber()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					NString holdFrbpropCode= NString.getNull();
					String sqlptiCursor = "SELECT FOBSEQN_SEQNO_PREFIX || LPAD(TO_CHAR(FOBSEQN_MAXSEQNO), 8, '0') " +
	" FROM FOBSEQN " +
	" WHERE FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
//						 GEN_DOC_CODE:;
						while(true) {
							String sql1 = "UPDATE FOBSEQN " +
		"SET FOBSEQN_MAXSEQNO = (NVL(FOBSEQN_MAXSEQNO, 0) + 1) " +
		" WHERE FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("HOLD_FOBSEQN_TYPE", getFormModel().getFormHeader().getHoldFobseqnType());
							rowCount = command1.execute();
							getTask().getGoqrpls().gCheckValue(toBool(rowCount == 0), GNls.Fget(toStr("FRAPROP-0056"), toStr("FORM"), toStr("Could not update FOBSEQN table for newly generated document code")), toBool(NBool.True));
							// 
							//Setting query parameters
							ptiCursor.addParameter("HOLD_FOBSEQN_TYPE", getFormModel().getFormHeader().getHoldFobseqnType());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								holdFrbpropCode = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0057"), toStr("FORM"), toStr("Could not generate new document number")), toBool(NBool.True));
							ptiCursor.close();
							// 
							if ( !(this.getTask().getServices().selectFrbprop1(holdFrbpropCode).getValue()) )
							{
//								 goto GEN_DOC_CODE;
								 break;
							}
						}
						// 
						getFormModel().getKeyBlock().setDisplayFrbpropCode(holdFrbpropCode);
						frbpropElement.setFrbpropCode(holdFrbpropCode);
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GEN_DOC_NUMBER
		 :HOLD_FOBSEQN_TYPE := 'S';
EXECUTE_TRIGGER('GEN_FOBSEQN_NUMBER');
 IF NOT FORM_SUCCESS THEN 
    RETURN;
 END IF;
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GEN_DOC_NUMBER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GEN_DOC_NUMBER")
		public void Fraprop_GenDocNumber()
		{
			
				getFormModel().getFormHeader().setHoldFobseqnType(toStr("S"));
				executeAction("GEN_FOBSEQN_NUMBER");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					return ;
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_AGCY_CODE_PRED_PIDM
		 DECLARE
  lv_agency_pred_pidm  spriden.spriden_pidm%type := NULL;

  cursor get_agency_pred_pidm is
    select ftvagcy_agcy_code_pred_pidm 
    from   ftvagcy
    where  ftvagcy_agcy_code_pidm = :frbprop_agency_pidm;

BEGIN
  :frbprop_agency_pred_code := NULL;
  :frbprop_agency_pred_name := NULL;
  
  OPEN get_agency_pred_pidm;
  FETCH get_agency_pred_pidm INTO lv_agency_pred_pidm;
  IF get_agency_pred_pidm%NOTFOUND THEN
    close get_agency_pred_pidm;
    RETURN;
  END IF;  
  close get_agency_pred_pidm;  
  g$_sel_spriden_id_name(lv_agency_pred_pidm, 'FRBPROP_AGENCY_PRED_NAME', 'Y', :frbprop_agency_pred_code);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_AGCY_CODE_PRED_PIDM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_AGCY_CODE_PRED_PIDM")
		public void Fraprop_GetAgcyCodePredPidm()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber lvAgencyPredPidm = NNumber.getNull();
					String sqlgetAgencyPredPidm = "SELECT ftvagcy_agcy_code_pred_pidm " +
	" FROM ftvagcy " +
	" WHERE ftvagcy_agcy_code_pidm = :FRBPROP_AGENCY_PIDM ";
					DataCursor getAgencyPredPidm = new DataCursor(sqlgetAgencyPredPidm);
					try {
						frbpropElement.setFrbpropAgencyPredCode(toStr(null));
						frbpropElement.setFrbpropAgencyPredName(toStr(null));
						//Setting query parameters
						getAgencyPredPidm.addParameter("FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getAgencyPredPidm.
						getAgencyPredPidm.open();
						ResultSet getAgencyPredPidmResults = getAgencyPredPidm.fetchInto();
						if ( getAgencyPredPidmResults != null ) {
							lvAgencyPredPidm = getAgencyPredPidmResults.getNumber(0);
						}
						if ( getAgencyPredPidm.notFound() )
						{
							getAgencyPredPidm.close();
							return ;
						}
						getAgencyPredPidm.close();
						Ref<NString> pId_ref = new Ref<NString>(frbpropElement.getFrbpropAgencyPredCode());
						getTask().getGoqrpls().gSelSpridenIdName(lvAgencyPredPidm, toStr("FRBPROP_AGENCY_PRED_NAME"), toStr("Y"), pId_ref);
						frbpropElement.setFrbpropAgencyPredCode(pId_ref.val);
					}
					finally{
						getAgencyPredPidm.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DELETE_TEXT
		 --dbms package issue
DELETE FROM FOBTEXT 
WHERE  FOBTEXT_CODE = :DISPLAY_FRBPROP_CODE
AND    FOBTEXT_DTYP_SEQ_NUM = 30 
AND    FOBTEXT_CHG_SEQ_NUM IS NULL 
AND    FOBTEXT_ITEM IS NULL;
 
           
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DELETE_TEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_TEXT")
		public void Fraprop_DeleteText()
		{
			
				// dbms package issue
				int rowCount = 0;
				// dbms package issue
				String sql1 = "DELETE FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :DISPLAY_FRBPROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 30 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				rowCount = command1.execute();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ENABLE_BUTTONS
		 
IF GET_ITEM_PROPERTY('FRBPROP_COAS_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_COAS_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_ORGN_CODE_RESP_OFF',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_ORGN_CODE_RESP_OFF',ENABLED,PROPERTY_ON);
END IF;
--
--
IF GET_ITEM_PROPERTY('FRBPROP_GRNT_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FRBPROP_GRNT_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;









		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ENABLE_BUTTONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_BUTTONS")
		public void Fraprop_EnableButtons()
		{
			
				if ( getItemEnabled("FRBPROP_COAS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_COAS_CODE_LBT", true);
				}
				// 
				if ( getItemEnabled("FRBPROP_ORGN_CODE_RESP_OFF").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_ORGN_CODE_RESP_OFF", true);
				}
				// 
				// 
				if ( getItemEnabled("FRBPROP_GRNT_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("FRBPROP_GRNT_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.UPDATE_USER_ID
		    :WORKUSER := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKUSER := SUBSTR(:WORKUSER, 1, 7) ;
--
   :WORKUSER := RPAD(:WORKUSER, 15, '_USER_ID') ;
--
   COPY( :CURRENT_USER1, :WORKUSER ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.UPDATE_USER_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_USER_ID")
		public void Fraprop_UpdateUserId()
		{
			
				getFormModel().getFormHeader().setWorkuser(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkuser(substring(getFormModel().getFormHeader().getWorkuser(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkuser(toStr(rpad(getFormModel().getFormHeader().getWorkuser(), 15, "_USER_ID")));
				// 
				copy(getFormModel().getFormHeader().getCurrentUser1(),getFormModel().getFormHeader().getWorkuser());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DISABLE_BUTTONS
		 IF GET_ITEM_PROPERTY('FRBPROP_STATUS_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_STATUS_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PROPOSAL_TYPE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_PROPOSAL_TYPE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_CATEGORY_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_CATEGORY_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_SUB_CATEGORY_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_SUB_CATEGORY_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_CFDA_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_CFDA_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('COPY_PROP',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('COPY_PROP',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('RATE_DOWN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('RATE_DOWN',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('RATE_UP',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('RATE_UP',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_PI_ID_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_PI_ID_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_AGENCY_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_AGENCY_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_COAS_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_COAS_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_ORGN_CODE_RESP_OFF',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_ORGN_CODE_RESP_OFF',ENABLED,PROPERTY_OFF);
END IF;
--
IF GET_ITEM_PROPERTY('FRBPROP_GRNT_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('FRBPROP_GRNT_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;






		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DISABLE_BUTTONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_BUTTONS")
		public void Fraprop_DisableButtons()
		{
			
				if ( getItemEnabled("FRBPROP_STATUS_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_STATUS_CODE_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_PROPOSAL_TYPE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_PROPOSAL_TYPE_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_CATEGORY_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_CATEGORY_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_SUB_CATEGORY_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_SUB_CATEGORY_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_CFDA_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_CFDA_CODE_LBT", false);
				}
				// 
				if ( getItemEnabled("COPY_PROP").equals("TRUE") )
				{
					setItemEnabled("COPY_PROP", false);
				}
				// 
				if ( getItemEnabled("RATE_DOWN").equals("TRUE") )
				{
					setItemEnabled("RATE_DOWN", false);
				}
				// 
				if ( getItemEnabled("RATE_UP").equals("TRUE") )
				{
					setItemEnabled("RATE_UP", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_PI_ID_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_PI_ID_CODE_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_AGENCY_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_AGENCY_CODE_LBT", false);
				}
				// 
				if ( getItemEnabled("NAVIGATE_TO_BTN").equals("TRUE") )
				{
					setItemEnabled("NAVIGATE_TO_BTN", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_COAS_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_COAS_CODE_LBT", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_ORGN_CODE_RESP_OFF").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_ORGN_CODE_RESP_OFF", false);
				}
				// 
				if ( getItemEnabled("FRBPROP_GRNT_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("FRBPROP_GRNT_CODE_LBT", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_SECURITY_ENTERED
		   IF :FRBPROP_COAS_CODE IS NULL THEN
     GO_ITEM('FRBPROP_COAS_CODE');
     MESSAGE( G$_NLS.Get('FRAPROP-0058', 'FORM','Chart of Accounts Code must be entered.') );
     Raise Form_Trigger_Failure;
  END IF;
--
 IF :FRBPROP_ORGN_CODE_RESP_OFFICE IS NULL THEN
     GO_ITEM('FRBPROP_ORGN_CODE_RESP_OFFICE');
     MESSAGE( G$_NLS.Get('FRAPROP-0059', 'FORM','Organization Code must be entered.') );
     Raise Form_Trigger_Failure;
 END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_SECURITY_ENTERED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_SECURITY_ENTERED")
		public void Fraprop_CheckSecurityEntered()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCoasCode().isNull() )
				{
					goItem(toStr("FRBPROP_COAS_CODE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0058"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
				{
					goItem(toStr("FRBPROP_ORGN_CODE_RESP_OFFICE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0059"), toStr("FORM"), toStr("Organization Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.TRIG_FAIL
		    NULL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.TRIG_FAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TRIG_FAIL")
		public void Fraprop_TrigFail()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.UPDATE_ACTIVITY_DATE
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
		 * FRAPROP.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Fraprop_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.INVALID_FUNCTION_MSG
		    MESSAGE(  G$_NLS.Get('FRAPROP-0060', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Fraprop_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FRAPROP-0060"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DISABLE_KEYS
		    SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE_LBT',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Fraprop_DisableKeys()
		{
			
				setItemEnabled("DISPLAY_FRBPROP_CODE", false);
				setItemEnabled("DISPLAY_FRBPROP_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',UPDATEABLE,PROPERTY_ON);
--   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',REQUIRED,PROPERTY_ON);
   SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
--


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Fraprop_EnableKeys()
		{
			
				if ( getItemEnabled("DISPLAY_FRBPROP_CODE").equals("FALSE") )
				{
					setItemEnabled("DISPLAY_FRBPROP_CODE", true);
					setItemNavigable("DISPLAY_FRBPROP_CODE", true);
					setItemUpdateAllowed("DISPLAY_FRBPROP_CODE", true);
					//    SET_ITEM_PROPERTY('DISPLAY_FRBPROP_CODE',REQUIRED,PROPERTY_ON);
					setItemEnabled("DISPLAY_FRBPROP_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.SAVE_KEYS
		 :GLOBAL.PROP_CODE := :DISPLAY_FRBPROP_CODE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Fraprop_SaveKeys()
		{
			
				setGlobal("PROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-LISTVAL
		 G$_DISPLAY_LOV('','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Fraprop_ListValues()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.9';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Fraprop_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN-NEW-FORM-INSTANCE
		 G$_SET_WIN_PROPERTY;
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
G$_CHECK_FAILURE ;
G$_SET_INST_PROPERTY;
--
EXECUTE_TRIGGER('DISABLE_BUTTONS');
G$_CHECK_FAILURE;

EXECUTE_TRIGGER('DISABLE_PAGES');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DISABLE_I18N_FIELDS');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Fraprop_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				// 
				executeAction("DISABLE_BUTTONS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISABLE_PAGES");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DISABLE_I18N_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GLOBAL_COPY
		 if :GLOBAL.prop_code is not null then
 :display_frbprop_code := :GLOBAL.prop_code;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Fraprop_GlobalCopy()
		{
			
				if ( !getGlobal("PROP_CODE").isNull() )
				{
					getFormModel().getKeyBlock().setDisplayFrbpropCode(getGlobal("PROP_CODE"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.TEST_TABLE_STATUS
		    IF G$_NCHK(:WORK_STATUS_IND <> 'A') THEN
      EXECUTE_TRIGGER( 'TRIG_FAIL' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.TEST_TABLE_STATUS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TEST_TABLE_STATUS")
		public void Fraprop_TestTableStatus()
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A"))).getValue() )
				{
					executeAction("TRIG_FAIL");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.TEST_TABLE_TERM
		    IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      RETURN ;
   END IF ;
   G$_CHECK_VALUE (NOT ((TO_DATE(:WORKFLD,'YYYYMMDDHH24MISS') >= SYSDATE) OR  (:WORKFLD IS NULL)), NULL, TRUE, TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.TEST_TABLE_TERM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TEST_TABLE_TERM")
		public void Fraprop_TestTableTerm()
		{
			
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
					return ;
				}
				getTask().getGoqrpls().gCheckValue(toBool(!((toDate(getFormModel().getFormHeader().getWorkfld(), "YYYYMMDDHH24MISS").greaterOrEquals(NDate.getNow())) || (getFormModel().getFormHeader().getWorkfld().isNull()))), toStr(null), toBool(NBool.True), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_TEXT
		 
DECLARE
   CURSOR PTI_CURSOR IS
   SELECT 'Y'
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :DISPLAY_FRBPROP_CODE 
     AND FOBTEXT_DTYP_SEQ_NUM = 29
     AND FOBTEXT_CHG_SEQ_NUM IS NULL
     AND FOBTEXT_ITEM IS NULL;
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO :DISPLAY_TEXT_IND;
    IF PTI_CURSOR%NOTFOUND THEN 
       :DISPLAY_TEXT_IND := 'N';
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_TEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TEXT")
		public void Fraprop_CheckText()
		{
			
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :DISPLAY_FRBPROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setDisplayTextInd(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
							getFormModel().getKeyBlock().setDisplayTextInd(toStr("N"));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_COAS_CODE
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'),
            FTVCOAS_STATUS_IND
         FROM   FTVCOAS
         WHERE  FTVCOAS_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FTVCOAS_EFF_DATE <= SYSDATE           
           AND  FTVCOAS_NCHG_DATE > SYSDATE
           AND  (FTVCOAS_TERM_DATE IS NULL
            OR  FTVCOAS_TERM_DATE > SYSDATE);
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :WORKFLD, :WORK_STATUS_IND ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAPROP-0061', 'FORM','Chart of Accounts is invalid; LIST is available.') ,
          TRUE);
   END ;
--
   EXECUTE_TRIGGER( 'TEST_TABLE_STATUS' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('FRAPROP-0062', 'FORM','Chart of Accounts is not Active.') , TRUE);
   :WORK_STATUS_IND := '';
--
   EXECUTE_TRIGGER( 'TEST_TABLE_TERM' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('FRAPROP-0063', 'FORM','Chart of Accounts is Terminated.') , TRUE);
   :WORKFLD := ''; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_COAS_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_COAS_CODE")
		public void Fraprop_EditCoasCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVCOAS_STATUS_IND " +
	" FROM FTVCOAS " +
	" WHERE FTVCOAS_COAS_CODE = :FRBPROP_COAS_CODE AND FTVCOAS_EFF_DATE <= SYSDATE AND FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR FTVCOAS_TERM_DATE > SYSDATE) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setWorkfld(ptiCursorResults.getStr(0));
							getFormModel().getFormHeader().setWorkStatusInd(ptiCursorResults.getStr(1));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0061"), toStr("FORM"), toStr("Chart of Accounts is invalid; LIST is available.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				executeAction("TEST_TABLE_STATUS");
				// F2J_TO_REMOVE : Call to built-in "FORM_SUCCESS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getTask().getGoqrpls().gCheckValue(SupportClasses.SQLFORMS.FormSuccess().not(), GNls.Fget(toStr("FRAPROP-0062"), toStr("FORM"), toStr("Chart of Accounts is not Active.")), toBool(NBool.True));
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FORM_SUCCESS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
				// 
				executeAction("TEST_TABLE_TERM");
				// F2J_TO_REMOVE *: Call to built-in "FORM_SUCCESS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getTask().getGoqrpls().gCheckValue(SupportClasses.SQLFORMS.FormSuccess().not(), GNls.Fget(toStr("FRAPROP-0063"), toStr("FORM"), toStr("Chart of Accounts is Terminated.")), toBool(NBool.True));
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'FORM_SUCCESS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				getFormModel().getFormHeader().setWorkfld(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_ORGN_SECURITY
		    IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO TRIG_EXIT ;
   END IF ;
--
 IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
     NULL;
 ELSIF :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN
       EXECUTE_TRIGGER('TRIG_FAIL');
       IF NOT FORM_SUCCESS THEN
          GOTO TRIG_EXIT;
       END IF;
 END IF;
--
   DECLARE
      PTI_INTO_TEMP        varchar2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = :CURRENT_USER1
           AND  FOBPROF_MASTER_ORGN_IND IN ('B','P','Q') ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHK_ORGN_SEC ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
   END ;

   
--
   << CHK_ORGN_SEC >>
   DECLARE
      RETRIEVED_ORGN_CODE  varchar2(6);
      CURSOR PTI_CURSOR IS
         SELECT FTVORGN_ORGN_CODE
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE IN  (
               SELECT FORUSOR_ORGN_CODE
               FROM   FORUSOR
               WHERE  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1
                 AND  FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE )
         CONNECT BY FTVORGN_ORGN_CODE = PRIOR
            FTVORGN_ORGN_CODE_PRED
           AND  FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE
         START WITH FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :RETRIEVED_ORGN_CODE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      END IF ;
   END ;
   
--
   << CHK_ORGN_ALLOWED >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO TRIG_EXIT ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FORUSOR
         WHERE  FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE
           AND  FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FORUSOR_ACCESS_IND IN ('B', 'P','Q')
           AND  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
   END ;
--
   << ORGN_NOT_ALLOWED >>
   MESSAGE(
         G$_NLS.Get('FRAPROP-0064', 'FORM','User is not authorized to query or post with the entered Organization.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << TRIG_EXIT >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_ORGN_SECURITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_ORGN_SECURITY")
		public void Fraprop_EditOrgnSecurity()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
//					 goto TRIG_EXIT;
					 return;
				}
				// 
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						 goto TRIG_EXIT;
//					}
					}
					catch(Exception e) {
						return;
					}
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER1 AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto CHK_ORGN_SEC;
						}
						else {
//							 goto TRIG_EXIT;
							 return;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 CHK_ORGN_SEC:;
				{
					NString retrievedOrgnCode= NString.getNull();
					String sqlptiCursor = "SELECT FTVORGN_ORGN_CODE " +
	" FROM FTVORGN " +
	" WHERE (FTVORGN_ORGN_CODE) IN ((SELECT FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 AND FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE )) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								errorMessage(GNls.Fget(toStr("FRAPROP-0064"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
								throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 CHK_ORGN_ALLOWED:;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
//					 goto TRIG_EXIT;
					 return;
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								errorMessage(GNls.Fget(toStr("FRAPROP-0064"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
								throw new ApplicationException();
						}
						else {
//							 goto TRIG_EXIT;
							 return;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
//				 ORGN_NOT_ALLOWED:;
//				message(GNls.Fget(toStr("FRAPROP-0064"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
//				throw new ApplicationException();
//				 TRIG_EXIT:;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_ORGN_SEC_FOR_COMMIT
		 
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO TRIG_EXIT ;
   END IF ;
--
 IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
     NULL;
 ELSIF :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN
       EXECUTE_TRIGGER('TRIG_FAIL');
       IF NOT FORM_SUCCESS THEN
          GOTO TRIG_EXIT;
       END IF;
 END IF;
--
   DECLARE
      PTI_INTO_TEMP        varchar2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = :CURRENT_USER1
           AND  FOBPROF_MASTER_ORGN_IND IN ('B','P') ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHK_ORGN_SEC ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
   END ;
--
   << CHK_ORGN_SEC >>
   DECLARE
      RETRIEVED_ORGN_CODE  varchar2(6);
      CURSOR PTI_CURSOR IS
         SELECT FTVORGN_ORGN_CODE
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE IN  (
               SELECT FORUSOR_ORGN_CODE
               FROM   FORUSOR
               WHERE  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1
                 AND  FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE )
         CONNECT BY FTVORGN_ORGN_CODE = PRIOR
            FTVORGN_ORGN_CODE_PRED
           AND  FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE
         START WITH FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :RETRIEVED_ORGN_CODE ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      END IF ;
   END ;
--
   << CHK_ORGN_ALLOWED >>
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO TRIG_EXIT ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FORUSOR
         WHERE  FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE
           AND  FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FORUSOR_ACCESS_IND IN ('B', 'P')
           AND  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
   END ;
--
   << ORGN_NOT_ALLOWED >>
   if :from_new_item = 'Y' then
       :from_new_item := 'N';
   else
   MESSAGE(
         G$_NLS.Get('FRAPROP-0065', 'FORM','User is not authorized to post with the entered Organization.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
   end if;
--
   << TRIG_EXIT >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_ORGN_SEC_FOR_COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_ORGN_SEC_FOR_COMMIT")
		public void Fraprop_EditOrgnSecForCommit()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
//					 goto TRIG_EXIT;
					 return;
				}
				// 
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						 goto TRIG_EXIT;
//					}
					}
					catch(Exception e) {
						return;
					}
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER1 AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto CHK_ORGN_SEC;
						}
						else {
//							 goto TRIG_EXIT;
							 return;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 CHK_ORGN_SEC:;
				{
					NString retrievedOrgnCode= NString.getNull();
					String sqlptiCursor = "SELECT FTVORGN_ORGN_CODE " +
	" FROM FTVORGN " +
	" WHERE (FTVORGN_ORGN_CODE) IN ((SELECT FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 AND FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE )) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								if ( getFormModel().getFormHeader().getFromNewItem().equals("Y") )
								{
									getFormModel().getFormHeader().setFromNewItem(toStr("N"));
									return;
								}
								else {
									errorMessage(GNls.Fget(toStr("FRAPROP-0065"), toStr("FORM"), toStr("User is not authorized to post with the entered Organization.")));
									throw new ApplicationException();
								}
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 CHK_ORGN_ALLOWED:;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
//					 goto TRIG_EXIT;
					 return;
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :FRBPROP_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
						ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								if ( getFormModel().getFormHeader().getFromNewItem().equals("Y") )
								{
									getFormModel().getFormHeader().setFromNewItem(toStr("N"));
									return;
								}
								else {
									errorMessage(GNls.Fget(toStr("FRAPROP-0065"), toStr("FORM"), toStr("User is not authorized to post with the entered Organization.")));
									throw new ApplicationException();
								}
						}
						else {
//							 goto TRIG_EXIT;
							 return;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
//				 ORGN_NOT_ALLOWED:;
//				if ( getFormModel().getFormHeader().getFromNewItem().equals("Y") )
//				{
//					getFormModel().getFormHeader().setFromNewItem(toStr("N"));
//				}
//				else {
//					message(GNls.Fget(toStr("FRAPROP-0065"), toStr("FORM"), toStr("User is not authorized to post with the entered Organization.")));
//					throw new ApplicationException();
//				}
//				 TRIG_EXIT:;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_ORGN_CODE
		 <multilinecomment>  1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;

	 If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
	   Search for the latest terminated/inactive record to get the organzation title.
	   If no past (terminated) records, then search for the first future dated records to retrieve the title.
	   
</multilinecomment>
   -- 1-BMV7IL  Start
   IF :FRBPROP_ORGN_CODE_RESP_OFFICE IS NULL THEN  
      RETURN ;
   END IF ;   
   DECLARE
      hold_orgn_code_descr     varchar2(35);
      lv_holder                varchar2(1);												
      --
	  CURSOR FTVORGN_C IS
         SELECT 'Y'																							
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE; 
      --
      CURSOR FTVORGN_CURR_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_NCHG_DATE >  SYSDATE  
           AND  FTVORGN_EFF_DATE <=  SYSDATE
           AND  (FTVORGN_TERM_DATE > SYSDATE
            OR  FTVORGN_TERM_DATE IS NULL)
           AND  FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FTVORGN_STATUS_IND= 'A';
           --
	    CURSOR FTVORGN_PAST_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_EFF_DATE <  SYSDATE
           AND  FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE
		   ORDER BY FTVORGN_EFF_DATE DESC;
         --
	    CURSOR FTVORGN_FUT_REC_C IS
         SELECT FTVORGN_TITLE
         FROM   FTVORGN
         WHERE  FTVORGN_EFF_DATE >  SYSDATE
           AND  FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE
           AND  FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE;
		 --		   
           ALERT_BUTTON NUMBER;
           ALERT_ID     ALERT;
           warn_mes     VARCHAR2(500) := G$_NLS.GET('FRAPROP-0066','FORM',
                       'The Organization code entered is currently Terminated or Inactive. Do you want to update the Responsible Organization?');           
           lv_err_msg VARCHAR2(200);                       
   BEGIN
      :ORGN_CODE_DESCR := '';
      OPEN FTVORGN_C ;
      FETCH FTVORGN_C INTO lv_holder; 										<multilinecomment>1-HWCBIO</multilinecomment>
      IF FTVORGN_C%NOTFOUND THEN
      	CLOSE FTVORGN_C;
	      lv_err_msg := G$_NLS.Get('FRAPROP-0067','FORM','*ERROR* %01% is invalid. LIST for valid choices.',
                 :frbprop_ORGN_CODE_RESP_OFFICE);
        MESSAGE(lv_err_msg, NO_ACKNOWLEDGE);  
      	RAISE FORM_TRIGGER_FAILURE;
      END IF;
      CLOSE FTVORGN_C;
	  
	  OPEN FTVORGN_CURR_REC_C;
	  FETCH FTVORGN_CURR_REC_C INTO hold_orgn_code_descr;
	  IF FTVORGN_CURR_REC_C%NOTFOUND THEN
	    IF :SYSTEM.FORM_STATUS = 'QUERY' OR NVL(:FORM_HEADER.ORG_VALIDATE_FLAG,'Y') = 'N' THEN		   
		   :FORM_HEADER.ORG_VALIDATE_FLAG := 'Y';		   
		  ELSE
            ALERT_ID := FIND_ALERT('G$_PIPE_MESSAGE_ALERT');
            SET_ALERT_PROPERTY(alert_id, alert_message_text, warn_mes  );
            alert_button := SHOW_ALERT(alert_id);
            IF alert_button = ALERT_BUTTON2 THEN
              CLOSE FTVORGN_CURR_REC_C;
              MESSAGE( G$_NLS.Get('FRAPROP-0068', 'FORM','Organization is invalid. Use LIST.') ,NO_ACKNOWLEDGE);
              RAISE FORM_TRIGGER_FAILURE;
            END IF;
			
	    END IF;
		-- Either Past (Terminated) or future records exist
		OPEN FTVORGN_PAST_REC_C;
		FETCH FTVORGN_PAST_REC_C INTO hold_orgn_code_descr;
		IF FTVORGN_PAST_REC_C%NOTFOUND THEN
		   OPEN FTVORGN_FUT_REC_C;
		   FETCH FTVORGN_FUT_REC_C INTO hold_orgn_code_descr;
		   CLOSE FTVORGN_FUT_REC_C;
		END IF;
		CLOSE FTVORGN_PAST_REC_C;
	  END IF;
	  CLOSE FTVORGN_CURR_REC_C;

      :ORGN_CODE_DESCR := hold_orgn_code_descr;  	  

   END;
   --1-BMV7IL End 
   


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_ORGN_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_ORGN_CODE")
		public void Fraprop_EditOrgnCode()
		{
			
				//   1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;
				// If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
				// Search for the latest terminated/inactive record to get the organzation title.
				// If no past (terminated) records, then search for the first future dated records to retrieve the title.
				//  1-BMV7IL  Start

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				//   1-113DE2A : Rewrite the Organization Title retrieval logic to handle past(terminated) and future records;
				// If user selects an inactive/terminated Org code and bypasses the warning alert OR if user queries an inactive/terminated org code;
				// Search for the latest terminated/inactive record to get the organzation title.
				// If no past (terminated) records, then search for the first future dated records to retrieve the title.
				//  1-BMV7IL  Start
				if ( frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
				{
					return ;
				}
				{
					NString holdOrgnCodeDescr= NString.getNull();
					NString lvHolder= NString.getNull();
					String sqlftvorgnC = "SELECT 'Y' " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE ";
					DataCursor ftvorgnC = new DataCursor(sqlftvorgnC);
					String sqlftvorgnCurrRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE AND FTVORGN_STATUS_IND = 'A' ";
					DataCursor ftvorgnCurrRecC = new DataCursor(sqlftvorgnCurrRecC);
					String sqlftvorgnPastRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_EFF_DATE < SYSDATE AND FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE " +
	" ORDER BY FTVORGN_EFF_DATE DESC";
					DataCursor ftvorgnPastRecC = new DataCursor(sqlftvorgnPastRecC);
					String sqlftvorgnFutRecC = "SELECT FTVORGN_TITLE " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE = :FRBPROP_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBPROP_COAS_CODE ";
					DataCursor ftvorgnFutRecC = new DataCursor(sqlftvorgnFutRecC);
					// 		   
					NNumber alertButton= NNumber.getNull();
					AlertDescriptor alertId= null;
					NString warnMes = GNls.Fget(toStr("FRAPROP-0066"), toStr("FORM"), toStr("The Organization code entered is currently Terminated or Inactive. Do you want to update the Responsible Organization?"));
					NString lvErrMsg= NString.getNull();
					try {
						frbpropElement.setOrgnCodeDescr(toStr(""));
						//Setting query parameters
						ftvorgnC.addParameter("FRBPROP_ORGN_CODE_RESP_OFFICE", frbpropElement.getFrbpropOrgnCodeRespOffice());
						ftvorgnC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnC.
						ftvorgnC.open();
						ResultSet ftvorgnCResults = ftvorgnC.fetchInto();
						if ( ftvorgnCResults != null ) {
							lvHolder = ftvorgnCResults.getStr(0);
						}
						// 1-HWCBIO
						if ( ftvorgnC.notFound() )
						{
							ftvorgnC.close();
							lvErrMsg = GNls.Fget(toStr("FRAPROP-0067"), toStr("FORM"), toStr("*ERROR* %01% is invalid. LIST for valid choices."), frbpropElement.getFrbpropOrgnCodeRespOffice());
							errorMessage(lvErrMsg, OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
						ftvorgnC.close();
						//Setting query parameters
						ftvorgnCurrRecC.addParameter("FRBPROP_ORGN_CODE_RESP_OFFICE", frbpropElement.getFrbpropOrgnCodeRespOffice());
						ftvorgnCurrRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnCurrRecC.
						ftvorgnCurrRecC.open();
						ResultSet ftvorgnCurrRecCResults = ftvorgnCurrRecC.fetchInto();
						if ( ftvorgnCurrRecCResults != null ) {
							holdOrgnCodeDescr = ftvorgnCurrRecCResults.getStr(0);
						}
						if ( ftvorgnCurrRecC.notFound() )
						{
							if ( getTaskStatus().equals("QUERY") || isNull(getFormModel().getFormHeader().getOrgValidateFlag(), "Y").equals("N") )
							{
								getFormModel().getFormHeader().setOrgValidateFlag(toStr("Y"));
							}
							else {
								alertId = findAlert("G$_PIPE_MESSAGE_ALERT");
								setAlertMessageText(alertId, warnMes);
								alertButton = toNumber(showAlert(alertId));
								if ( alertButton.equals(MessageServices.BUTTON2) )
								{
									ftvorgnCurrRecC.close();
									errorMessage(GNls.Fget(toStr("FRAPROP-0068"), toStr("FORM"), toStr("Organization is invalid. Use LIST.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
									throw new ApplicationException();
								}
							}
							//  Either Past (Terminated) or future records exist
							//Setting query parameters
							ftvorgnPastRecC.addParameter("FRBPROP_ORGN_CODE_RESP_OFFICE", frbpropElement.getFrbpropOrgnCodeRespOffice());
							ftvorgnPastRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnPastRecC.
							ftvorgnPastRecC.open();
							ResultSet ftvorgnPastRecCResults = ftvorgnPastRecC.fetchInto();
							if ( ftvorgnPastRecCResults != null ) {
								holdOrgnCodeDescr = ftvorgnPastRecCResults.getStr(0);
							}
							if ( ftvorgnPastRecC.notFound() )
							{
								//Setting query parameters
								ftvorgnFutRecC.addParameter("FRBPROP_ORGN_CODE_RESP_OFFICE", frbpropElement.getFrbpropOrgnCodeRespOffice());
								ftvorgnFutRecC.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvorgnFutRecC.
								ftvorgnFutRecC.open();
								ResultSet ftvorgnFutRecCResults = ftvorgnFutRecC.fetchInto();
								if ( ftvorgnFutRecCResults != null ) {
									holdOrgnCodeDescr = ftvorgnFutRecCResults.getStr(0);
								}
								ftvorgnFutRecC.close();
							}
							ftvorgnPastRecC.close();
						}
						ftvorgnCurrRecC.close();
						frbpropElement.setOrgnCodeDescr(holdOrgnCodeDescr);
					}
					finally{
						ftvorgnC.close();
						ftvorgnCurrRecC.close();
						ftvorgnPastRecC.close();
						ftvorgnFutRecC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_ORGN_SECURITY_AFTER_QUERY
		  IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
     NULL;
 ELSIF :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN
       EXECUTE_TRIGGER('TRIG_FAIL');
       IF NOT FORM_SUCCESS THEN
          RETURN;
       END IF;
 END IF;
--
   DECLARE
      PTI_INTO_TEMP        varchar2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = :CURRENT_USER1
           AND  FOBPROF_MASTER_ORGN_IND IN ('B', 'P', 'Q') ;

   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHK_ORGN_SEC ;
      ELSE
         RETURN;
      END IF ;
   END ;
--
   << CHK_ORGN_SEC >>
   
   DECLARE
     CURSOR PTI_CURSOR_1 IS 
         SELECT FRBPROP_COAS_CODE, FRBPROP_ORGN_CODE_RESP_OFFICE
           FROM FRBPROP
         WHERE FRBPROP_CODE = :DISPLAY_FRBPROP_CODE;
--
      hold_frbprop_coas_code    frbprop.frbprop_coas_code%type;
      hold_frbprop_orgn_code    frbprop.frbprop_orgn_code_resp_office%type;	
--
      RETRIEVED_ORGN_CODE  varchar2(6);
--
      CURSOR PTI_CURSOR_2 IS
         SELECT FTVORGN_ORGN_CODE
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE IN  (
               SELECT FORUSOR_ORGN_CODE
               FROM   FORUSOR
               WHERE  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1
                 AND  FORUSOR_COAS_CODE = hold_frbprop_coas_code )
         CONNECT BY FTVORGN_ORGN_CODE = PRIOR
            FTVORGN_ORGN_CODE_PRED
           AND  FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE
         START WITH FTVORGN_ORGN_CODE = hold_frbprop_orgn_code
           AND  FTVORGN_COAS_CODE = hold_frbprop_coas_code
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE ;
--
      PTI_INTO_TEMP_1        VARCHAR2(255);
      CURSOR PTI_CURSOR_3 IS
         SELECT 'Y'
         FROM   FORUSOR
         WHERE  FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE
           AND  FORUSOR_COAS_CODE = hold_frbprop_coas_code
           AND  FORUSOR_ACCESS_IND IN ('B','P','Q')
           AND  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ;
   BEGIN
      OPEN PTI_CURSOR_1;
        FETCH PTI_CURSOR_1 INTO hold_frbprop_coas_code, hold_frbprop_orgn_code;
        IF PTI_CURSOR_1%NOTFOUND THEN 
           GOTO TRIG_EXIT;
        END IF;
--
      OPEN PTI_CURSOR_2 ;
      FETCH PTI_CURSOR_2 INTO :RETRIEVED_ORGN_CODE ;
      IF PTI_CURSOR_2%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      END IF ;
--
   << CHK_ORGN_ALLOWED >>

      OPEN PTI_CURSOR_3 ;
      FETCH PTI_CURSOR_3 INTO PTI_INTO_TEMP_1 ;
      IF PTI_CURSOR_3%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
--
   << ORGN_NOT_ALLOWED >>
   MESSAGE(
         G$_NLS.Get('FRAPROP-0069', 'FORM','User is not authorized to query or post with the entered Organization.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;

--
   << TRIG_EXIT >>
   NULL ;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_ORGN_SECURITY_AFTER_QUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_ORGN_SECURITY_AFTER_QUERY")
		public void Fraprop_EditOrgnSecurityAfterQuery()
		{
			
				int rowCount = 0;
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						return ;
//					}
					}
					catch(Exception e) {
						return;
					}
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER1 AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto CHK_ORGN_SEC;
						}
						else {
							return ;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 CHK_ORGN_SEC:;
				{
					String sqlptiCursor1 = "SELECT FRBPROP_COAS_CODE, FRBPROP_ORGN_CODE_RESP_OFFICE " +
	" FROM FRBPROP " +
	" WHERE FRBPROP_CODE = :DISPLAY_FRBPROP_CODE ";
					DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
					// 
					NString holdFrbpropCoasCode= NString.getNull();
					NString holdFrbpropOrgnCode= NString.getNull();
					// 
					NString retrievedOrgnCode= NString.getNull();
					String sqlptiCursor2 = "SELECT FTVORGN_ORGN_CODE " +
	" FROM FTVORGN " +
	" WHERE (FTVORGN_ORGN_CODE) IN ((SELECT FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 AND FORUSOR_COAS_CODE = :P_HOLD_FRBPROP_COAS_CODE )) ";
					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
					// 
					NString ptiIntoTemp1= NString.getNull();
					String sqlptiCursor3 = "SELECT 'Y' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :P_HOLD_FRBPROP_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ";
					DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
					try {
						//Setting query parameters
						ptiCursor1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor1.
						ptiCursor1.open();
						ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
						if ( ptiCursor1Results != null ) {
							holdFrbpropCoasCode = ptiCursor1Results.getStr(0);
							holdFrbpropOrgnCode = ptiCursor1Results.getStr(1);
						}
						if ( ptiCursor1.notFound() )
						{
//							 goto TRIG_EXIT;
							 return;
						}
						// 
						//Setting query parameters
						ptiCursor2.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						ptiCursor2.addParameter("P_HOLD_FRBPROP_COAS_CODE", holdFrbpropCoasCode);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
						ptiCursor2.open();
						ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
						if ( ptiCursor2Results != null ) {
							getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursor2Results.getStr(0));
						}
						if ( ptiCursor2.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								errorMessage(GNls.Fget(toStr("FRAPROP-0069"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
								throw new ApplicationException();
						}
						 CHK_ORGN_ALLOWED:;
						//Setting query parameters
						ptiCursor3.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
						ptiCursor3.addParameter("P_HOLD_FRBPROP_COAS_CODE", holdFrbpropCoasCode);
						ptiCursor3.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor3.
						ptiCursor3.open();
						ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
						if ( ptiCursor3Results != null ) {
							ptiIntoTemp1 = ptiCursor3Results.getStr(0);
						}
						if ( ptiCursor3.notFound() )
						{
//							 goto ORGN_NOT_ALLOWED;
//							 ORGN_NOT_ALLOWED:;
								errorMessage(GNls.Fget(toStr("FRAPROP-0069"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
								throw new ApplicationException();
						}
						else {
//							 goto TRIG_EXIT;
							 return;
						}
//						 ORGN_NOT_ALLOWED:;
//						message(GNls.Fget(toStr("FRAPROP-0069"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
//						throw new ApplicationException();
//						 TRIG_EXIT:;
					}
					finally{
						ptiCursor1.close();
						ptiCursor2.close();
						ptiCursor3.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-COMMIT
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
--
IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAPROP_1_CANVAS' THEN
   NEXT_ITEM;
   PREVIOUS_ITEM;
END IF;
EXECUTE_TRIGGER('CHECK_FRRPLOC');
G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--
 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    EXECUTE_TRIGGER('EDIT_ORGN_SEC_for_commit');
    G$_CHECK_FAILURE;
    :COMMIT_IND := 'Y';
    COMMIT_FORM;
    G$_CHECK_FAILURE;
    IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
       :COMMIT_IND := 'N';
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
    :COMMIT_IND := 'N';
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Fraprop_Save()
		{
			
				executeAction("GET_ITEM_NAME");
				// 
				if ( getItemCanvas(getCursorItem()).equals("FRAPROP_1_CANVAS") )
				{
					nextItem();
					previousItem();
				}
				executeAction("CHECK_FRRPLOC");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					executeAction("EDIT_ORGN_SEC_for_commit");
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getFormHeader().setCommitInd(toStr("Y"));
					commitTask();
					getTask().getGoqrpls().gCheckFailure();
					if ( !getTaskStatus().equals("QUERY") )
					{
						getFormModel().getFormHeader().setCommitInd(toStr("N"));
						throw new ApplicationException();
					}
					getFormModel().getFormHeader().setCommitInd(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_EVENT
		 DECLARE
  --var_user_id fobprof.FOBPROF_USER_ID%type;
    var_user_id gobeacc.gobeacc_username%TYPE;
  CURSOR C1 IS
    --SELECT fobprof_user_id
      --FROM fobprof
     --WHERE  fobprof_pidm  = :frrprpi_id_pidm;
      SELECT gobeacc_username
      FROM gobeacc
     WHERE  gobeacc_pidm  = :frrprpi_id_pidm; 
   BEGIN
   IF :FRRPRPI_ID IS NULL THEN
    MESSAGE( G$_NLS.Get('FRAPROP-0070', 'FORM','The ID of an individual associated with the proposal must be entered in order to navigate to FRIEVNP.') );
             
             go_item('frrprpi_id');
    return;
END IF;
   OPEN C1;
   FETCH C1 INTO var_user_id;
   IF C1%NOTFOUND THEN
      MESSAGE( G$_NLS.Get('FRAPROP-0071', 'FORM',
	'No User ID Found for ID: %01%' 
	, :frrprpi_id));
      RAISE FORM_TRIGGER_FAILURE;
      CLOSE C1;
   ELSE
     :GLOBAL.form_was_called := 'Y';
     :global.prop_code := :frbprop_code;
     :global.event_userid := var_user_id;
     EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
     G$_CHECK_FAILURE;
     G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FRIEVNP', ' ');
    :GLOBAL.form_was_called := '';
     CLOSE C1;
  end if;
  END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_EVENT")
		public void Fraprop_CallFormEvent()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					// var_user_id fobprof.FOBPROF_USER_ID%type;
					NString varUserId= NString.getNull();
					String sqlc1 = "SELECT gobeacc_username " +
	" FROM gobeacc " +
	" WHERE gobeacc_pidm = :FRRPRPI_ID_PIDM ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						if ( frrprpiElement.getFrrprpiId().isNull() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0070"), toStr("FORM"), toStr("The ID of an individual associated with the proposal must be entered in order to navigate to FRIEVNP.")));
							goItem(toStr("frrprpi_id"));
							return ;
						}
						//Setting query parameters
						c1.addParameter("FRRPRPI_ID_PIDM", frrprpiElement.getFrrprpiIdPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							varUserId = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0071"), toStr("FORM"), toStr("No User ID Found for ID: %01%"), frrprpiElement.getFrrprpiId()));
							throw new ApplicationException();
//							c1.close();
						}
						else {
							setGlobal("FORM_WAS_CALLED", toStr("Y"));
							setGlobal("PROP_CODE", frbpropElement.getFrbpropCode());
							setGlobal("EVENT_USERID", varUserId);
							executeAction("G$_REVOKE_ACCESS");
							getTask().getGoqrpls().gCheckFailure();
							getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIEVNP"), toStr(" "));
							setGlobal("FORM_WAS_CALLED", toStr(""));
//							c1.close();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FRIPRST
		   EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
  G$_CHECK_FAILURE;

  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--  
      execute_trigger('check_frrploc');
      g$_check_failure;
--    
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;
      HIDE_WINDOW('NAVIGATE_TO');
      :GLOBAL.FORM_WAS_CALLED := 'Y';
      :GLOBAL.PROP_CODE := :FRBPROP_CODE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FRIPRST','');
      :GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FRIPRST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FRIPRST")
		public void Fraprop_CallFormFriprst()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				//   
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				//     
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				hideWindow("NAVIGATE_TO");
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("PROP_CODE", frbpropElement.getFrbpropCode());
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIPRST"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FRAEVNP
		    EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
   G$_CHECK_FAILURE;

  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--
      execute_trigger('check_frrploc');
      g$_check_failure;
--
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;
      :GLOBAL.FORM_WAS_CALLED := 'Y';
      :GLOBAL.PROP_CODE := :FRBPROP_CODE;
      HIDE_WINDOW('NAVIGATE_TO');
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FRAEVNP','');
      :GLOBAL.FORM_WAS_CALLED := 'N';
      :GLOBAL.PROP_CODE := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FRAEVNP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FRAEVNP")
		public void Fraprop_CallFormFraevnp()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("PROP_CODE", frbpropElement.getFrbpropCode());
				hideWindow("NAVIGATE_TO");
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRAEVNP"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				setGlobal("PROP_CODE", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FRIEVNP
		    EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
   G$_CHECK_FAILURE;

  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--
      execute_trigger('check_frrploc');
      g$_check_failure;
--
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FRIEVNP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FRIEVNP")
		public void Fraprop_CallFormFrievnp()
		{
			
				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FOAETXT
		    IF :FRRPRPI_ID IS NULL THEN
    MESSAGE( G$_NLS.Get('FRAPROP-0072', 'FORM','The ID of an individual associated with the proposal must be entered in order to navigate to FOAETXT.') );
             
             go_item('frrprpi_id');
    return;
END IF;

   EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
   G$_CHECK_FAILURE;
  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
-- 
      execute_trigger('check_frrploc');
      g$_check_failure;
--
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;
      :GLOBAL.KEY_IDNO := :FRRPRPI_ID;
      :GLOBAL.PRIMARY_DOC_NUM := :DISPLAY_FRBPROP_CODE;
      :GLOBAL.PRIMARY_DOC_SEQ := '29';
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FOAETXT','');
      G$_CHECK_FAILURE;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FOAETXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FOAETXT")
		public void Fraprop_CallFormFoaetxt()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				if ( frrprpiElement.getFrrprpiId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0072"), toStr("FORM"), toStr("The ID of an individual associated with the proposal must be entered in order to navigate to FOAETXT.")));
					goItem(toStr("frrprpi_id"));
					return ;
				}
				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				//  
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("KEY_IDNO", frrprpiElement.getFrrprpiId());
				setGlobal("PRIMARY_DOC_NUM", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				setGlobal("PRIMARY_DOC_SEQ", toStr("29"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOAETXT"), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FRABUDP
		  EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
 G$_CHECK_FAILURE;

  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--  
      execute_trigger('check_frrploc');
      g$_check_failure;
--   
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;
      HIDE_WINDOW('NAVIGATE_TO');
      :GLOBAL.FORM_WAS_CALLED := 'Y';
      :GLOBAL.PROP_CODE := :FRBPROP_CODE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FRABUDP','');
      :GLOBAL.FORM_WAS_CALLED := 'N';
      :GLOBAL.PROP_CODE := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FRABUDP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FRABUDP")
		public void Fraprop_CallFormFrabudp()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				//   
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				//    
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				hideWindow("NAVIGATE_TO");
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("PROP_CODE", frbpropElement.getFrbpropCode());
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRABUDP"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				setGlobal("PROP_CODE", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CALL_FORM_FOATEXT
		    EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
   G$_CHECK_FAILURE;

  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
-- 
      execute_trigger('check_frrploc');
      g$_check_failure;
--
      execute_trigger('re_edit');
      g$_check_failure;
--
      EXECUTE_TRIGGER('FORCE_COMMIT');
      G$_CHECK_FAILURE;
      :GLOBAL.DOC_NUM := :DISPLAY_FRBPROP_CODE;
      :GLOBAL.DOC_SEQ := '29';
      HIDE_WINDOW('NAVIGATE_TO');
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FOATEXT','');
      EXECUTE_TRIGGER('CHECK_TEXT');
      G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CALL_FORM_FOATEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM_FOATEXT")
		public void Fraprop_CallFormFoatext()
		{
			
				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				//  
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("DOC_NUM", getFormModel().getKeyBlock().getDisplayFrbpropCode());
				setGlobal("DOC_SEQ", toStr("29"));
				hideWindow("NAVIGATE_TO");
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOATEXT"), toStr(""));
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_FRM_HIERARCHY
		 IF :SYSTEM.TAB_NEW_PAGE <> 'PROPOSAL_AGENCY_INFORMATION' THEN
   message( G$_NLS.Get('FRAPROP-0073', 'FORM','This Option is not available at this time.') );
ELSE
   EXECUTE_TRIGGER( 'COPY_TO_GLOBALS' ) ;
   G$_CHECK_FAILURE ;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FGQAGYH','QUERY');
   EXECUTE_TRIGGER( 'COPY_GLOBALS' ) ;
   G$_CHECK_FAILURE ;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_FRM_HIERARCHY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_FRM_HIERARCHY")
		public void Fraprop_MnuOptFrmHierarchy()
		{
			
				if ( !getTabNewPage().equals("PROPOSAL_AGENCY_INFORMATION") )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0073"), toStr("FORM"), toStr("This Option is not available at this time.")));
				}
				else {
					executeAction("COPY_TO_GLOBALS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FGQAGYH"), toStr("QUERY"));
					executeAction("COPY_GLOBALS");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_PERSONNEL_INFO
		 if :global.fund_org_security_ind = 'Y' then
 execute_trigger('check_security_entered');
 g$_check_failure;
end if;
--
execute_trigger('re_edit');
g$_check_failure;
--check locn codes
execute_trigger('check_frrploc');
g$_check_failure;
--
if :locn_error_ind = 'N' or :locn_error_ind is null then
  execute_trigger('force_commit');
  g$_check_failure;
end if;
--
 go_item('frrprpi.frrprpi_id');
 g$_check_failure;
 :SYSTEM.MESSAGE_LEVEL := '5';
clear_block(NO_VALIDATE);
-- If :frbprop_pi_id_code is Not Null Then
if f_frrprpi_exists then
  execute_query;
End If;
 :SYSTEM.MESSAGE_LEVEL := '0';
return;













		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_PERSONNEL_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_PERSONNEL_INFO")
		public void Fraprop_MnuOptPersonnelInfo()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// check locn codes
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getFormModel().getFormHeader().getLocnErrorInd().equals("N") || getFormModel().getFormHeader().getLocnErrorInd().isNull() )
				{
					executeAction("force_commit");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				goItem(toStr("frrprpi.frrprpi_id"));
				getTask().getGoqrpls().gCheckFailure();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				clearBlock(TaskServices.NO_VALIDATE);
				//  If :frbprop_pi_id_code is Not Null Then
				if ( this.getTask().getServices().fFrrprpiExists(frbpropElement).getValue() )
				{
					executeQuery();
				}
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
							
				} finally {
							
				MessageServices.resetMessageLevel();
							
				}
							
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_AGENCY_INFO
		  if :frbprop_agency_code is null then
    go_item('FRBPROP_AGENCY_CODE');
    g$_check_failure;
    Message( G$_NLS.Get('FRAPROP-0074', 'FORM','Agency Code must be entered to view Agency Information.') );
    Raise Form_Trigger_Failure;
 end if;
-- 
  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--
   execute_trigger('check_frrploc'); 
   g$_check_failure;
   execute_trigger('re_edit');
   g$_check_failure;
   execute_trigger('force_commit');
   g$_check_failure;
   :frbprop_agency_code_2 := :frbprop_agency_code;
   :frbprop_agency_name_2 := :frbprop_agency_name;
   go_item('frbprop.frbprop_agency_contact');
   g$_check_failure;
   return;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_AGENCY_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_AGENCY_INFO")
		public void Fraprop_MnuOptAgencyInfo()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropAgencyCode().isNull() )
				{
					goItem(toStr("FRBPROP_AGENCY_CODE"));
					getTask().getGoqrpls().gCheckFailure();
					errorMessage(GNls.Fget(toStr("FRAPROP-0074"), toStr("FORM"), toStr("Agency Code must be entered to view Agency Information.")));
					throw new ApplicationException();
				}
				//  
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("force_commit");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setFrbpropAgencyCode2(frbpropElement.getFrbpropAgencyCode());
				getFormModel().getFormHeader().setFrbpropAgencyName2(frbpropElement.getFrbpropAgencyName());
				goItem(toStr("frbprop.frbprop_agency_contact"));
				getTask().getGoqrpls().gCheckFailure();
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_COST_SHARE_INFO
		   if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;

   execute_trigger('re_edit');
   g$_check_failure;
--
   if :locn_error_ind = 'N' or :locn_error_ind is null then
      execute_trigger('force_commit');
      g$_check_failure;
   end if;
   go_item('frbprop.frbprop_coas_code_ic_cs');
   g$_check_failure;
   return;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_COST_SHARE_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_COST_SHARE_INFO")
		public void Fraprop_MnuOptCostShareInfo()
		{
			
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getFormModel().getFormHeader().getLocnErrorInd().equals("N") || getFormModel().getFormHeader().getLocnErrorInd().isNull() )
				{
					executeAction("force_commit");
					getTask().getGoqrpls().gCheckFailure();
				}
				goItem(toStr("frbprop.frbprop_coas_code_ic_cs"));
				getTask().getGoqrpls().gCheckFailure();
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_USER_CODES_INFO
		   if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--
   execute_trigger('check_frrploc');
   g$_check_failure;
--
   execute_trigger('re_edit');
   g$_check_failure;
   execute_trigger('force_commit');
   g$_check_failure;
   go_item('FRRPUSN_SDAT_CODE_ATTR');
   g$_check_failure;
   :SYSTEM.MESSAGE_LEVEL := '5';
   clear_block(NO_VALIDATE);
   execute_query;
   :SYSTEM.MESSAGE_LEVEL := '0';
   return;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_USER_CODES_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_USER_CODES_INFO")
		public void Fraprop_MnuOptUserCodesInfo()
		{
			
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("force_commit");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("FRRPUSN_SDAT_CODE_ATTR"));
				getTask().getGoqrpls().gCheckFailure();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					clearBlock(TaskServices.NO_VALIDATE);
					executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
					MessageServices.resetMessageLevel();
				}
							
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_HEADER_INFO
		   if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--
   execute_trigger('check_frrploc');
   g$_check_failure;
--
   execute_trigger('re_edit');
   g$_check_failure;
   execute_trigger('force_commit');
   g$_check_failure;
   go_item('FRBPROP.FRBPROP_COAS_CODE');
   g$_check_failure;
   return;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_HEADER_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_HEADER_INFO")
		public void Fraprop_MnuOptHeaderInfo()
		{
			
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				executeAction("check_frrploc");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("force_commit");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("FRBPROP.FRBPROP_COAS_CODE"));
				getTask().getGoqrpls().gCheckFailure();
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_BILLING_INFO
		 
Begin
NULL;
End;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_BILLING_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_BILLING_INFO")
		public void Fraprop_MnuOptBillingInfo()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_LOCATION_INFO
		 --
  if :global.fund_org_security_ind = 'Y' then
     execute_trigger('check_security_entered');
     g$_check_failure;
  end if;
--check locn codes

   execute_trigger('re_edit');
   g$_check_failure;
--
   if :locn_error_ind = 'N' or :locn_error_ind is null then
      execute_trigger('force_commit');
      g$_check_failure;
   end if;
--
   go_item('frrploc.frrploc_locn_code');
   g$_check_failure;
   :SYSTEM.MESSAGE_LEVEL := '5';
   clear_block(NO_VALIDATE);
   execute_query;
   :SYSTEM.MESSAGE_LEVEL := '0';
   return;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_LOCATION_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_LOCATION_INFO")
		public void Fraprop_MnuOptLocationInfo()
		{
			
				// 
				// 
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					executeAction("check_security_entered");
					getTask().getGoqrpls().gCheckFailure();
				}
				// check locn codes
				executeAction("re_edit");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getFormModel().getFormHeader().getLocnErrorInd().equals("N") || getFormModel().getFormHeader().getLocnErrorInd().isNull() )
				{
					executeAction("force_commit");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				goItem(toStr("frrploc.frrploc_locn_code"));
				getTask().getGoqrpls().gCheckFailure();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					clearBlock(TaskServices.NO_VALIDATE);
					executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
					MessageServices.resetMessageLevel();
				}
							
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.FORCE_COMMIT
		 IF G$_QUERY_ONLY_ROLE THEN RETURN; END IF;
-- IF F_FRBPROF_ORGN_SEC_IND NOT IN ('P','B') THEN RETURN; END IF;

IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN 
     EXECUTE_TRIGGER( 'EDIT_ORGN_SEC_for_commit' ) ;
  IF Form_Success THEN 
    :COMMIT_IND := 'Y';
    :SYSTEM.MESSAGE_LEVEL := '5';  
    COMMIT_FORM;
    G$_CHECK_FAILURE;  
    :SYSTEM.MESSAGE_LEVEL := '0';
    IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
       :COMMIT_IND := 'N';
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
    :COMMIT_IND := 'N';
END IF;
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.FORCE_COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORCE_COMMIT")
		public void Fraprop_ForceCommit()
		{
			
				if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
				{
					return ;
				}
				//  IF F_FRBPROF_ORGN_SEC_IND NOT IN ('P','B') THEN RETURN; END IF;
				if ( getTaskStatus().equals("CHANGED") )
				{
					try{
						executeAction("EDIT_ORGN_SEC_for_commit");
//						if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
//						{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						getFormModel().getFormHeader().setCommitInd(toStr("Y"));
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
							MessageServices.setMessageLevel(MessageLevel.NONE);
							commitTask();
							getTask().getGoqrpls().gCheckFailure();
							// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
							MessageServices.resetMessageLevel();
						}
									
						if ( !getTaskStatus().equals("QUERY") )
						{
							getFormModel().getFormHeader().setCommitInd(toStr("N"));
							throw new ApplicationException();
						}
						getFormModel().getFormHeader().setCommitInd(toStr("N"));
					}
					catch(Exception e) {
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.MNU_OPT_PASS_THRU_INFO
		 DECLARE
	 	temp_var  varchar2(1);
	 	CURSOR c1 IS
		SELECT 'X'
		FROM FRRPRPT
		WHERE frrprpt_prop_code = :key_block.display_frbprop_code;
BEGIN
    execute_trigger('force_commit');
    g$_check_failure;
    
		OPEN c1;
   	FETCH c1 INTO temp_var;
    IF c1%NOTFOUND THEN
    		 	go_block('FRRPRPT');
    		 	<multilinecomment>clear_block('FRRPRPT');
    		 	:form_header.total := '';
    		 	g$_check_failure;</multilinecomment>
         	CLOSE c1;
         	RETURN;
         	RAISE form_trigger_failure;
    ELSE
    			:form_header.from_execute_query := 'Y';
					execute_trigger('get_pass_thru_details');
					g$_check_failure;
					go_block('FRRPRPT');
    			clear_block(no_validate);
					execute_query;
					enter;
					g$_check_failure;
					execute_trigger('get_percentage_total');
					g$_check_failure;
					:form_header.from_execute_query := 'N';
		END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.MNU_OPT_PASS_THRU_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_PASS_THRU_INFO")
		public void Fraprop_MnuOptPassThruInfo()
		{
			
				int rowCount = 0;
				{
					NString tempVar= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_FRBPROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						executeAction("force_commit");
						getTask().getGoqrpls().gCheckFailure();
						//Setting query parameters
						c1.addParameter("KEY_BLOCK_DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							tempVar = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							goBlock(toStr("FRRPRPT"));
							// clear_block('FRRPRPT');
							// :form_header.total := '';
							// g$_check_failure;
							c1.close();
							return ;
//							throw new ApplicationException();
						}
						else {
							getFormModel().getFormHeader().setFromExecuteQuery(toStr("Y"));
							executeAction("get_pass_thru_details");
							getTask().getGoqrpls().gCheckFailure();
							goBlock(toStr("FRRPRPT"));
							clearBlock(TaskServices.NO_VALIDATE);
							executeQuery();
							// F2J_NOT_SUPPORTED *: Call to built-in "ENTER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
							//							SupportClasses.SQLFORMS.Enter();
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ENTER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
							
							getTask().getGoqrpls().gCheckFailure();
							executeAction("get_percentage_total");
							getTask().getGoqrpls().gCheckFailure();
							getFormModel().getFormHeader().setFromExecuteQuery(toStr("N"));
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_PASS_THRU_DETAILS
		 DECLARE
  l_data_exists varchar2(1)	:= 'N';
  lv_pidm       SPRIDEN.SPRIDEN_PIDM%TYPE := NULL; 
  lv_id         SPRIDEN.SPRIDEN_ID%TYPE := NULL; 

  CURSOR c1 IS
    SELECT frrprpt_agcy_pidm, frrprpt_federal_fund_percent
    FROM   frrprpt
    WHERE  frrprpt_prop_code = :key_block.display_frbprop_code;

  CURSOR c2 IS
    SELECT spriden_pidm
	  FROM   spriden s, ftvagcy f
	  WHERE  f.ftvagcy_agcy_code_pidm = s.spriden_pidm 
	    and  spriden_entity_ind = 'C'
	    and  f.ftvagcy_agcy_code_pidm = :frrprpt.frrprpt_agcy_pidm;
BEGIN
  OPEN c1;
  LOOP
		FETCH c1 INTO :frrprpt.frrprpt_agcy_pidm, :frrprpt.frrprpt_federal_fund_percent;
		IF c1%FOUND THEN
			l_data_exists := 'Y';
			OPEN c2;
			FETCH c2 INTO lv_pidm; 
			--1-19V7ZZD: The word "Agent" modified to "Agency" in the below message.
			G$_CHECK_VALUE(lv_pidm IS NULL, G$_NLS.Get('FRAPROP-0075', 'FORM','Agency Name not Found'), TRUE);
			g$_sel_spriden_id_name(lv_pidm, 'FRRPRPT.FRRPRPT_AGCY_NAME', 'Y', lv_id);
		ELSE 
			IF c1%NOTFOUND THEN
				l_data_exists := 'N';
				EXIT;
			END IF;
		END IF;
		CLOSE c2;
		IF l_data_exists = 'Y' THEN
			:frbprop.display_pass_thru_ind := 'Y';
		ELSE 
			IF l_data_exists = 'N' THEN
				:frbprop.display_pass_thru_ind := 'N';
			END IF;
		END IF;
  END LOOP;
  CLOSE c1;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_PASS_THRU_DETAILS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_PASS_THRU_DETAILS")
		public void Fraprop_GetPassThruDetails()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					NString lDataExists = toStr("N");
					NNumber lvPidm = NNumber.getNull();
					NString lvId = NString.getNull();
					String sqlc1 = "SELECT frrprpt_agcy_pidm, frrprpt_federal_fund_percent " +
	" FROM frrprpt " +
	" WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_FRBPROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					String sqlc2 = "SELECT spriden_pidm " +
	" FROM spriden s, ftvagcy f " +
	" WHERE f.ftvagcy_agcy_code_pidm = s.spriden_pidm AND spriden_entity_ind = 'C' AND f.ftvagcy_agcy_code_pidm = :FRRPRPT_FRRPRPT_AGCY_PIDM ";
					DataCursor c2 = new DataCursor(sqlc2);
					try {
						//Setting query parameters
						c1.addParameter("KEY_BLOCK_DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						while (true) {
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								frrprptElement.setFrrprptAgcyPidm(c1Results.getNumber(0));
								frrprptElement.setFrrprptFederalFundPercent(c1Results.getNumber(1));
							}
							if ( c1.found() )
							{
								lDataExists = toStr("Y");
								//Setting query parameters
								c2.addParameter("FRRPRPT_FRRPRPT_AGCY_PIDM", frrprptElement.getFrrprptAgcyPidm());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable c2.
								c2.open();
								ResultSet c2Results = c2.fetchInto();
								if ( c2Results != null ) {
									lvPidm = c2Results.getNumber(0);
								}
								// 1-19V7ZZD: The word "Agent" modified to "Agency" in the below message.
								getTask().getGoqrpls().gCheckValue(toBool(lvPidm.isNull()), GNls.Fget(toStr("FRAPROP-0075"), toStr("FORM"), toStr("Agency Name not Found")), toBool(NBool.True));
								Ref<NString> pId_ref = new Ref<NString>(lvId);
								getTask().getGoqrpls().gSelSpridenIdName(lvPidm, toStr("FRRPRPT.FRRPRPT_AGCY_NAME"), toStr("Y"), pId_ref);
								lvId = pId_ref.val;
							}
							else {
								if ( c1.notFound() )
								{
									lDataExists = toStr("N");
										break;
								}
							}
							c2.close();
							if ( lDataExists.equals("Y") )
							{
								frbpropElement.setDisplayPassThruInd(toStr("Y"));
							}
							else {
								if ( lDataExists.equals("N") )
								{
									frbpropElement.setDisplayPassThruInd(toStr("N"));
								}
							}
						}
						c1.close();
					}
					finally{
						c1.close();
						c2.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_PERCENTAGE_TOTAL
		 DECLARE
		l_total number :=0;
BEGIN
	  :System.Message_Level := '15'; <multilinecomment> 54-0001 </multilinecomment>
		go_block('frrprpt');
		enter;
		g$_check_failure;
		:SYSTEM.MESSAGE_LEVEL := '5';
		first_record;
		:SYSTEM.MESSAGE_LEVEL := '0';
		LOOP
				--IF  :system.record_status in ('NEW','INSERT','CHANGED') THEN
						l_total := l_total + NVL(:frrprpt.frrprpt_federal_fund_percent,0);
						:form_header.total := l_total;
						IF (l_total > 100) THEN
								message( G$_NLS.Get('FRAPROP-0076', 'FORM','Percentage exceeds 100!') );
								RAISE form_trigger_failure;
						END IF;
				--END IF;
				IF :SYSTEM.last_record = 'TRUE' THEN
						EXIT;
				ELSE
	    			next_record;
				END IF;
		END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_PERCENTAGE_TOTAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_PERCENTAGE_TOTAL")
		public void Fraprop_GetPercentageTotal()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				{
					NNumber lTotal = toNumber(0);
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '15'
					try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						//  54-0001 
						goBlock(toStr("frrprpt"));
						// F2J_NOT_SUPPORTED *: Call to built-in "ENTER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
						//					SupportClasses.SQLFORMS.Enter();
	//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ENTER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
						
						getTask().getGoqrpls().gCheckFailure();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						MessageServices.setMessageLevel(MessageLevel.NONE);
						firstRecord();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
									
						MessageServices.resetMessageLevel();
					}
								
					while (true) {
						// IF  :system.record_status in ('NEW','INSERT','CHANGED') THEN
						lTotal = lTotal.add(isNull(frrprptElement.getFrrprptFederalFundPercent(), 0));
						getFormModel().getFormHeader().setTotal(lTotal);
						if ((lTotal.greater(100)))
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0076"), toStr("FORM"), toStr("Percentage exceeds 100!")));
							throw new ApplicationException();
						}
						// END IF;
						if ( isInLastRecord() )
						{
								break;
						}
						else {
							nextRecord();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ONE_RECORD_MANDATORY
		 <multilinecomment>
IF :system.cursor_record = 1 THEN
		IF :frrprpt.frrprpt_agcy_pidm IS NULL AND :frrprpt.frrprpt_federal_fund_percent IS NULL THEN
   			message('At least one record is Mandatory');
   			RAISE form_trigger_failure;
   	END IF;
END IF;
</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ONE_RECORD_MANDATORY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ONE_RECORD_MANDATORY")
		public void Fraprop_OneRecordMandatory()
		{
			
				// IF :system.cursor_record = 1 THEN
				// IF :frrprpt.frrprpt_agcy_pidm IS NULL AND :frrprpt.frrprpt_federal_fund_percent IS NULL THEN
				// message('At least one record is Mandatory');
				// RAISE form_trigger_failure;
				// END IF;
				// END IF;
				// IF :system.cursor_record = 1 THEN
				// IF :frrprpt.frrprpt_agcy_pidm IS NULL AND :frrprpt.frrprpt_federal_fund_percent IS NULL THEN
				// message('At least one record is Mandatory');
				// RAISE form_trigger_failure;
				// END IF;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ID_TO_PIDM
		 DECLARE
		hold_pidm    number(9);
		CURSOR s_pidm IS
    SELECT SPRIDEN_PIDM
    FROM   SPRIDEN
    WHERE  SPRIDEN_ID = :frrprpt.frrprpt_agency_code ;
BEGIN
		OPEN s_pidm;
		FETCH s_pidm INTO hold_pidm;
		:frrprpt.frrprpt_agcy_pidm := hold_pidm;
		CLOSE s_pidm;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ID_TO_PIDM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ID_TO_PIDM")
		public void Fraprop_IdToPidm()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber holdPidm= NNumber.getNull();
					String sqlsPidm = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :FRRPRPT_FRRPRPT_AGENCY_CODE ";
					DataCursor sPidm = new DataCursor(sqlsPidm);
					try {
						//Setting query parameters
						sPidm.addParameter("FRRPRPT_FRRPRPT_AGENCY_CODE", frrprptElement.getFrrprptAgencyCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sPidm.
						sPidm.open();
						ResultSet sPidmResults = sPidm.fetchInto();
						if ( sPidmResults != null ) {
							holdPidm = sPidmResults.getNumber(0);
						}
						frrprptElement.setFrrprptAgcyPidm(holdPidm);
						sPidm.close();
					}
					finally{
						sPidm.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.GET_STATUS_DESC
		 declare
 			cursor c1 is 
  		select ftvsdat_title
   		from ftvsdat
     	where ftvsdat_sdat_code_entity = 'FRBPROP'
      and ftvsdat_sdat_code_attr = 'STATUS_CODE'
      and ftvsdat_sdat_code_opt_1 = :frbprop_status_code
      and ftvsdat_eff_date <= sysdate
      and (ftvsdat_nchg_date is null
      or ftvsdat_nchg_date > sysdate)
      and ftvsdat_status_ind = 'A';
begin
 			open c1;
   		fetch c1 into :status_descr;
   		:form_header.store_org_status_desc := :frbprop.status_descr;
      if c1%notfound then
         	message( G$_NLS.Get('FRAPROP-0077', 'FORM','Status is invalid. LIST is available.') );
         	close c1;
         	raise form_trigger_failure;
      end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.GET_STATUS_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_STATUS_DESC")
		public void Fraprop_GetStatusDesc()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBPROP_STATUS_CODE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_STATUS_CODE", frbpropElement.getFrbpropStatusCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setStatusDescr(c1Results.getStr(0));
						}
						getFormModel().getFormHeader().setStoreOrgStatusDesc(frbpropElement.getStatusDescr());
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0077"), toStr("FORM"), toStr("Status is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.CHECK_DUPLICATE_AGENCY_CODE
		 DECLARE
	 	cur_agency_code varchar2(9);
	 	total_rec number(2);
	 	cur_record_no number(2);
	 	i number(2) := 1;
BEGIN
		:SYSTEM.MESSAGE_LEVEL := '5';
		last_record;
		total_rec := :system.cursor_record;
		if total_rec = 1 then 
			return;
		end if;
		for i in 1..total_rec loop
		go_record(i);
		cur_agency_code := :frrprpt.frrprpt_agency_code;
		first_record; 
		LOOP
						if :system.cursor_record = i then
							next_record;
						else
							IF :frrprpt.frrprpt_agency_code = cur_agency_code THEN
									message( G$_NLS.Get('FRAPROP-0078', 'FORM','Duplicate Agency Code') );
									RAISE form_trigger_failure;
							END IF;
							IF :system.last_record = 'TRUE' THEN
										EXIT;
							ELSE
	    						next_record;                   
							END IF;
						end if;
		END LOOP;
		end loop;
		go_record(total_rec);
		:SYSTEM.MESSAGE_LEVEL := '0';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.CHECK_DUPLICATE_AGENCY_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_DUPLICATE_AGENCY_CODE")
		public void Fraprop_CheckDuplicateAgencyCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				{
					NString curAgencyCode= NString.getNull();
					NNumber totalRec= NNumber.getNull();
					NNumber curRecordNo= NNumber.getNull();
					NNumber i = toNumber(1);
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						lastRecord();
						totalRec = getCursorRecord();
						if ( totalRec.equals(1) )
						{
							return ;
						}
	//					for ( i = 1; i <= totalRec; i+= 1 )
						for (i.equals(1); i.lesserOrEquals(totalRec); i.add(1)) 
						{
							setCurrentRecord(i);
							curAgencyCode = frrprptElement.getFrrprptAgencyCode();
							firstRecord();
							while (true) {
								if ( getCursorRecord().equals(i) )
								{
									nextRecord();
								}
								else {
									if ( frrprptElement.getFrrprptAgencyCode().equals(curAgencyCode) )
									{
										errorMessage(GNls.Fget(toStr("FRAPROP-0078"), toStr("FORM"), toStr("Duplicate Agency Code")));
										throw new ApplicationException();
									}
									if ( isInLastRecord() )
									{
											break;
									}
									else {
										nextRecord();
									}
								}
							}
						}
						setCurrentRecord(totalRec);
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
						MessageServices.resetMessageLevel();
					}
								
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.FETCH_AGENCY_NAME
		 DECLARE
  lv_pidm        SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  lv_agency_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  
   CURSOR s_pidm IS
     SELECT SPRIDEN_PIDM
     FROM   SPRIDEN
     WHERE  SPRIDEN_ID = :frrprpt.frrprpt_AGENCY_code;

   cursor VALIDATE_PIDM is
     select ftvagcy_agcy_code_pidm 
     from   ftvagcy
     where  ftvagcy_agcy_code_pidm = lv_pidm;
BEGIN
  :frrprpt_agcy_name := NULL;
	OPEN s_pidm;
  FETCH s_pidm INTO lv_pidm;
  close s_pidm;

  open VALIDATE_PIDM;
  fetch VALIDATE_PIDM into lv_agency_pidm;
  IF VALIDATE_PIDM%NOTFOUND THEN
    MESSAGE(G$_NLS.Get('FRAPROP-0079', 'FORM','Agency ID is new; please create Agency using FTMAGCY.'));
    close VALIDATE_PIDM;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  close VALIDATE_PIDM;

  g$_sel_spriden_id_name(lv_pidm, 'FRRPRPT_AGCY_NAME', 'Y', :frrprpt.frrprpt_agency_code);
END;      
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.FETCH_AGENCY_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FETCH_AGENCY_NAME")
		public void Fraprop_FetchAgencyName()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber lvPidm = NNumber.getNull();
					NNumber lvAgencyPidm = NNumber.getNull();
					String sqlsPidm = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :FRRPRPT_FRRPRPT_AGENCY_CODE ";
					DataCursor sPidm = new DataCursor(sqlsPidm);
					String sqlvalidatePidm = "SELECT ftvagcy_agcy_code_pidm " +
	" FROM ftvagcy " +
	" WHERE ftvagcy_agcy_code_pidm = :P_LV_PIDM ";
					DataCursor validatePidm = new DataCursor(sqlvalidatePidm);
					try {
						frrprptElement.setFrrprptAgcyName(toStr(null));
						//Setting query parameters
						sPidm.addParameter("FRRPRPT_FRRPRPT_AGENCY_CODE", frrprptElement.getFrrprptAgencyCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sPidm.
						sPidm.open();
						ResultSet sPidmResults = sPidm.fetchInto();
						if ( sPidmResults != null ) {
							lvPidm = sPidmResults.getNumber(0);
						}
						sPidm.close();
						//Setting query parameters
						validatePidm.addParameter("P_LV_PIDM", lvPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable validatePidm.
						validatePidm.open();
						ResultSet validatePidmResults = validatePidm.fetchInto();
						if ( validatePidmResults != null ) {
							lvAgencyPidm = validatePidmResults.getNumber(0);
						}
						if ( validatePidm.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0079"), toStr("FORM"), toStr("Agency ID is new; please create Agency using FTMAGCY.")));
							validatePidm.close();
							throw new ApplicationException();
						}
						validatePidm.close();
						Ref<NString> pId_ref = new Ref<NString>(frrprptElement.getFrrprptAgencyCode());
						getTask().getGoqrpls().gSelSpridenIdName(lvPidm, toStr("FRRPRPT_AGCY_NAME"), toStr("Y"), pId_ref);
						frrprptElement.setFrrprptAgencyCode(pId_ref.val);
					}
					finally{
						sPidm.close();
						validatePidm.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.ENABLE_PAGES
		 IF GET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED, PROPERTY_TRUE);
END IF;
IF GET_TAB_PAGE_PROPERTY('PROPOSAL_AGENCY_INFORMATION', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('PROPOSAL_AGENCY_INFORMATION', ENABLED, PROPERTY_TRUE);
END IF;
IF GET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION', ENABLED, PROPERTY_TRUE);
END IF;
IF GET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED, PROPERTY_TRUE);
END IF;
IF GET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED, PROPERTY_TRUE);
END IF;
IF GET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED, PROPERTY_TRUE);
END IF;
--RPE# 1-19V7ZZD
IF GET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY', ENABLED) = 'FALSE' THEN
	 SET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY', ENABLED, PROPERTY_TRUE);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.ENABLE_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_PAGES")
		public void Fraprop_EnablePages()
		{
			
				if ( getTabPageEnabled("HEADER_INFORMATION") == false )
				{
					setTabPageEnabled("HEADER_INFORMATION", true);
				}
				if ( getTabPageEnabled("PROPOSAL_AGENCY_INFORMATION") == false )
				{
					setTabPageEnabled("PROPOSAL_AGENCY_INFORMATION", true);
				}
				if ( getTabPageEnabled("LOCATION_INFORMATION") == false )
				{
					setTabPageEnabled("LOCATION_INFORMATION", true);
				}
				if ( getTabPageEnabled("COST_CODE_INFORMATION") == false)
				{
					setTabPageEnabled("COST_CODE_INFORMATION", true);
				}
				if ( getTabPageEnabled("PERSONNEL_INFORMATION") == false )
				{
					setTabPageEnabled("PERSONNEL_INFORMATION", true);
				}
				if ( getTabPageEnabled("USER_DEFINED_DATA") == false )
				{
					setTabPageEnabled("USER_DEFINED_DATA", true);
				}
				// RPE# 1-19V7ZZD
				if ( getTabPageEnabled("PASSTHROUGH_AGENCY") == false )
				{
					setTabPageEnabled("PASSTHROUGH_AGENCY", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DISABLE_PAGES
		 IF GET_TAB_PAGE_PROPERTY('PROPOSAL_AGENCY_INFORMATION', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('PROPOSAL_AGENCY_INFORMATION', ENABLED, PROPERTY_FALSE);
END IF;
IF GET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION', ENABLED, PROPERTY_FALSE);
END IF;
IF GET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED, PROPERTY_FALSE);
END IF;
IF GET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED, PROPERTY_FALSE);
END IF;
IF GET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED, PROPERTY_FALSE);
END IF;
--RPE# 1-19V7ZZD
IF GET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY', ENABLED) = 'TRUE' THEN
	 SET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY', ENABLED, PROPERTY_FALSE);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DISABLE_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_PAGES")
		public void Fraprop_DisablePages()
		{
			
				if ( getTabPageEnabled("PROPOSAL_AGENCY_INFORMATION") == true )
				{
					setTabPageEnabled("PROPOSAL_AGENCY_INFORMATION", false);
				}
				if ( getTabPageEnabled("LOCATION_INFORMATION") == true )
				{
					setTabPageEnabled("LOCATION_INFORMATION", false);
				}
				if ( getTabPageEnabled("COST_CODE_INFORMATION") == true )
				{
					setTabPageEnabled("COST_CODE_INFORMATION", false);
				}
				if ( getTabPageEnabled("PERSONNEL_INFORMATION") == true )
				{
					setTabPageEnabled("PERSONNEL_INFORMATION", false);
				}
				if ( getTabPageEnabled("USER_DEFINED_DATA") == true )
				{
					setTabPageEnabled("USER_DEFINED_DATA", false);
				}
				// RPE# 1-19V7ZZD
				if ( getTabPageEnabled("PASSTHROUGH_AGENCY") == true )
				{
					setTabPageEnabled("PASSTHROUGH_AGENCY", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN-TAB-PAGE-CHANGED
		 :del_ready := 'N';
IF :SYSTEM.TAB_NEW_PAGE = 'HEADER_INFORMATION' THEN
	 execute_trigger('MNU_OPT_HEADER_INFO'); --103108
	 G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'PROPOSAL_AGENCY_INFORMATION' THEN
	 execute_trigger('MNU_OPT_AGENCY_INFO'); --103108
	 G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'LOCATION_INFORMATION' THEN
	execute_trigger('MNU_OPT_LOCATION_INFO');
	G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'COST_CODE_INFORMATION' THEN
	 execute_trigger('MNU_OPT_COST_SHARE_INFO'); --103108
	 G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'PERSONNEL_INFORMATION' THEN
	 execute_trigger('MNU_OPT_PERSONNEL_INFO'); --103108
	 G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'USER_DEFINED_DATA' THEN
	 execute_trigger('MNU_OPT_USER_CODES_INFO');
	 G$_CHECK_FAILURE;
ELSIF :SYSTEM.TAB_NEW_PAGE = 'PASSTHROUGH_AGENCY' THEN  --RPE# 1-19V7ZZD
	 execute_trigger('MNU_OPT_PASS_THRU_INFO');
	 G$_CHECK_FAILURE;	 	 
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Fraprop_tabChange()
		{
			
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( getTabNewPage().equals("HEADER_INFORMATION") )
				{
					executeAction("MNU_OPT_HEADER_INFO");
					// 103108
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("PROPOSAL_AGENCY_INFORMATION") ) {
					executeAction("MNU_OPT_AGENCY_INFO");
					// 103108
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("LOCATION_INFORMATION") ) {
					executeAction("MNU_OPT_LOCATION_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("COST_CODE_INFORMATION") ) {
					executeAction("MNU_OPT_COST_SHARE_INFO");
					// 103108
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("PERSONNEL_INFORMATION") ) {
					executeAction("MNU_OPT_PERSONNEL_INFO");
					// 103108
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("USER_DEFINED_DATA") ) {
					executeAction("MNU_OPT_USER_CODES_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getTabNewPage().equals("PASSTHROUGH_AGENCY") ) {
					// RPE# 1-19V7ZZD
					executeAction("MNU_OPT_PASS_THRU_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-CLRFRM
		 DECLARE
	HOLDER VARCHAR2(1) := 'N';
	v_mess VARCHAR2(500);
BEGIN
	v_mess := G$_NLS.Get('FRAPROP-0080', 'FORM', 'User is not authorized to query or post with the entered Organization.'); --87303
	IF GET_MESSAGE = v_mess AND   
		 :SYSTEM.TRIGGER_ITEM = 'FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE' THEN
		 CLEAR_MESSAGE;
		 :FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE := '';
	END IF;

	IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM, ITEM_CANVAS) = 'FFRAPROP_1_TAB_CANVAS' AND 
  	 GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM, ITEM_TAB_PAGE) <> 'HEADER_INFORMATION' THEN
     HOLDER := 'Y';
  END IF;

   EXECUTE_TRIGGER('SET_REQUIRED_OFF');
--
   EXECUTE_TRIGGER('SAVE_KEYS'); 
<multilinecomment>
   IF :SYSTEM.FORM_STATUS <> 'NEW' THEN
      RETURN;
   END IF;
</multilinecomment>
   IF NOT FORM_SUCCESS THEN 
      RAISE FORM_TRIGGER_FAILURE;
   END IF;

   EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   
   IF (G$_QUERY_ONLY_ROLE  -- OR (F_FRBPROF_ORGN_SEC_IND NOT IN ('P','B'))
   	) THEN 
     CLEAR_FORM(NO_VALIDATE); 
   ELSE
   	 CLEAR_FORM;
   END IF; 

   IF HOLDER = 'Y' THEN
   	  :FORM_CLEARED := 'Y';
   END IF;

   SET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED, PROPERTY_TRUE);
   EXECUTE_TRIGGER('DISABLE_PAGES'); --FOR TAB CANVAS
   G$_CHECK_FAILURE;

  EXECUTE_TRIGGER('DISABLE_BUTTONS');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
  G$_CHECK_FAILURE ;
  
  :FORM_HEADER.NEXT_DOC_NUM := fokutil.f_next_display;
  
  EXECUTE_TRIGGER('CLOSE_WINDOWS');
--
  go_item('DISPLAY_frbprop_CODE');
  :frbprop.display_pass_thru_ind := 'N';
--
  EXECUTE_TRIGGER('SET_REQUIRED_ON');
  :COPY_FUNCT_PROCESS := '';
END;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Fraprop_ClearTask()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				{
					NString holder = toStr("N");
					NString vMess= NString.getNull();
					vMess = GNls.Fget(toStr("FRAPROP-0080"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization."));
					// 87303
					//Morphis TODO - validate 
					Boolean msgValidation = false;
					if(Task.getCurrent().getMessages().size() > 0)  {
						msgValidation = Task.getCurrent().getMessages().get(Task.getCurrent().getMessages().size() - 1).equals(vMess);
					}
					if ( 
							//Morphis TODO - validate 
							msgValidation &&
//							SupportClasses.FORMS40.GetMessage().equals(vMess) && 
							getTriggerItem().equals("FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						clearMessage();
						frbpropElement.setFrbpropOrgnCodeRespOffice(toStr(""));
					}
					if ( getItemCanvas(getCursorItem()).equals("FFRAPROP_1_TAB_CANVAS") && 
//							SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).notEquals("HEADER_INFORMATION") 
							!getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("HEADER_INFORMATION") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						holder = toStr("Y");
					}
					executeAction("SET_REQUIRED_OFF");
					// 
					try {
						executeAction("SAVE_KEYS");
					// IF :SYSTEM.FORM_STATUS <> 'NEW' THEN
					// RETURN;
					// END IF;
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						throw new ApplicationException();
//					}
					}
					catch(Exception e) {
						throw new ApplicationException();
					}
					executeAction("ENABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					if ((getTask().getGoqrpls().gQueryOnlyRole()).toBoolean())
					{
						clearTask(TaskServices.NO_VALIDATE);
					}
					else {
						clearTask();
					}
					if ( holder.equals("Y") )
					{
						getFormModel().getFormHeader().setFormCleared(toStr("Y"));
					}
					setTabPageEnabled("HEADER_INFORMATION", true);
					executeAction("DISABLE_PAGES");
					// FOR TAB CANVAS
					getTask().getGoqrpls().gCheckFailure();
					executeAction("DISABLE_BUTTONS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					executeAction("LOAD_FORM_HEADER");
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getFormHeader().setNextDocNum(Fokutil.fNextDisplay());
					executeAction("CLOSE_WINDOWS");
					// 
					goItem(toStr("DISPLAY_frbprop_CODE"));
					frbpropElement.setDisplayPassThruInd(toStr("N"));
					// 
					executeAction("SET_REQUIRED_ON");
					getFormModel().getFormHeader().setCopyFunctProcess(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
	 :del_ready := 'N';
   IF :HOLD_PRESS = 'Y' THEN
      :HOLD_PRESS := 'N';
      RETURN;
   END IF; 

   IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
   	  :frbprop.display_pass_thru_ind := 'N';

   	  :FORM_HEADER.NEXT_DOC_NUM := fokutil.f_next_display;
   	  
   	  SET_ITEM_PROPERTY('KEY_BLOCK.DISPLAY_FRBPROP_CODE',HINT_TEXT,
   	                    g$_nls.get('FRAPROP-0081','FORM','Enter the Proposal Code or use %01% for an automatic number generation',:FORM_HEADER.NEXT_DOC_NUM));
   	  RETURN;
   END IF;

  IF :CHECK_KEYS = 'Y' THEN
      CLEAR_BLOCK(NO_VALIDATE);
      GO_BLOCK('KEY_BLOCK');
      G$_CHECK_FAILURE;
      IF :DISPLAY_FRBPROP_CODE IS NULL THEN
         MESSAGE( G$_NLS.Get('FRAPROP-0082', 'FORM','Proposal Code must be entered.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
      NEXT_BLOCK;
      G$_CHECK_FAILURE;
    IF SELECT_FRBPROP_1(:DISPLAY_FRBPROP_CODE) THEN
           IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
                 EXECUTE_TRIGGER('EDIT_ORGN_SECURITY_AFTER_QUERY'); 
              IF NOT FORM_SUCCESS THEN
                :CHECK_KEYS := 'N';
                GO_ITEM('DISPLAY_FRBPROP_CODE');                
                 RAISE FORM_TRIGGER_FAILURE;
              END IF; 
           END IF;     
       CLEAR_BLOCK;
       EXECUTE_QUERY;
    END IF;
--
    EXECUTE_TRIGGER('DISABLE_KEYS');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('ENABLE_PAGES');--FOR TAB CANVAS
    G$_CHECK_FAILURE;
--
    IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
       EXECUTE_TRIGGER('ENABLE_BUTTONS');
       G$_CHECK_FAILURE;
    ELSE
       EXECUTE_TRIGGER('ENABLE_BUTTONS');
       G$_CHECK_FAILURE;
       EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
       G$_CHECK_FAILURE;
    END IF; 
--
  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
    :CHECK_KEYS := 'N';
--
  END IF;
  
  IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM, ITEM_TAB_PAGE) = 'HEADER_INFORMATION' AND :FORM_CLEARED = 'Y' THEN
  	 :FORM_CLEARED := 'N';
  	 EXECUTE_TRIGGER('KEY-CLRFRM');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Fraprop_WhenNewBlockInstanceTrg()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( getFormModel().getFormHeader().getHoldPress().equals("Y") )
				{
					getFormModel().getFormHeader().setHoldPress(toStr("N"));
					return ;
				}
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					frbpropElement.setDisplayPassThruInd(toStr("N"));
					getFormModel().getFormHeader().setNextDocNum(Fokutil.fNextDisplay());
					setItemHint("KEY_BLOCK.DISPLAY_FRBPROP_CODE", GNls.Fget(toStr("FRAPROP-0081"), toStr("FORM"), toStr("Enter the Proposal Code or use %01% for an automatic number generation"), getFormModel().getFormHeader().getNextDocNum()));
					return ;
				}
				if ( getFormModel().getFormHeader().getCheckKeys().equals("Y") )
				{
					clearBlock(TaskServices.NO_VALIDATE);
					goBlock(toStr("KEY_BLOCK"));
					getTask().getGoqrpls().gCheckFailure();
					if ( getFormModel().getKeyBlock().getDisplayFrbpropCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0082"), toStr("FORM"), toStr("Proposal Code must be entered.")));
						throw new ApplicationException();
					}
					nextBlock();
					getTask().getGoqrpls().gCheckFailure();
					if ( this.getTask().getServices().selectFrbprop1(getFormModel().getKeyBlock().getDisplayFrbpropCode()).getValue() )
					{
						if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
						{
							try {
							executeAction("EDIT_ORGN_SECURITY_AFTER_QUERY");
							}
							catch(Exception e) {
//							if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								getFormModel().getFormHeader().setCheckKeys(toStr("N"));
								goItem(toStr("DISPLAY_FRBPROP_CODE"));
								throw new ApplicationException();
							}
						}
						clearBlock();
						executeQuery();
					}
					// 
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("ENABLE_PAGES");
					// FOR TAB CANVAS
					getTask().getGoqrpls().gCheckFailure();
					// 
					if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
					{
						executeAction("ENABLE_BUTTONS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("ENABLE_BUTTONS");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("ENABLE_BUTTONS_AFTER_PASSW");
						getTask().getGoqrpls().gCheckFailure();
					}
					// 
					executeAction("CHECK_TEXT");
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getFormHeader().setCheckKeys(toStr("N"));
				}
				if ( 	
//						SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("HEADER_INFORMATION") 
						getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("HEADER_INFORMATION") 
						&& getFormModel().getFormHeader().getFormCleared().equals("Y") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					getFormModel().getFormHeader().setFormCleared(toStr("N"));
					executeAction("KEY-CLRFRM");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.KEY-EXIT
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_EXIT;
  G$_CHECK_FAILURE;
END;
<multilinecomment>
BEGIN
   :GLOBAL.VALUE := '' ;
--
  G$_DETERMINE_ERASE_GLOBAL;

--  EXIT_FORM ;
		:SYSTEM.MESSAGE_LEVEL := '5';
    go_block('frrprpt');
    g$_check_failure;
  	execute_trigger('get_percentage_total');
		g$_check_failure;
		execute_trigger('check_duplicate_agency_code');
		g$_check_failure;
		G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    G$_CHECK_FAILURE ;
  	:SYSTEM.MESSAGE_LEVEL := '0';
--
END;</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Fraprop_Exit()
		{
			
				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyExit();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.VALIDATE_AGENCY_CODE
		 -- Fix for defect # 1-8KTK2 begins
-- Checks whether the agency code is new or is inactive.

IF :FRBPROP_AGENCY_CODE IS NULL THEN
  RETURN;
END IF;

DECLARE
  hold_pidm   SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  agency_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  status      VARCHAR2(1);

  CURSOR S_PIDM IS
    SELECT SPRIDEN_PIDM
    FROM   SPRIDEN
    WHERE  SPRIDEN_ID = :FRBPROP.FRBPROP_AGENCY_CODE;

  CURSOR VALIDATE_AGCY IS
    SELECT FTVAGCY_AGCY_CODE_PIDM 
    FROM FTVAGCY
    WHERE FTVAGCY_AGCY_CODE_PIDM = hold_pidm;
    
  CURSOR AGCY_STATUS IS
    SELECT 'X' 
    FROM   FTVAGCY
    WHERE  FTVAGCY_AGCY_CODE_PIDM = hold_pidm
    AND    FTVAGCY_STATUS_IND = 'A';
    
BEGIN
	OPEN S_PIDM;
    FETCH S_PIDM INTO hold_pidm;
  CLOSE S_PIDM;

  OPEN VALIDATE_AGCY;
    FETCH VALIDATE_AGCY INTO agency_pidm;
    G$_CHECK_VALUE(VALIDATE_AGCY%NOTFOUND, G$_NLS.Get('FRAPROP-0083', 'FORM', 'Agency ID is new; please create Agency using FTMAGCY.'), TRUE);
  CLOSE VALIDATE_AGCY;

  OPEN AGCY_STATUS;
    FETCH AGCY_STATUS INTO status;
    G$_CHECK_VALUE(AGCY_STATUS%NOTFOUND, G$_NLS.Get('FRAPROP-0084', 'FORM', 'Agency is not active.'), TRUE);
  CLOSE AGCY_STATUS;
END;
-- Fix for defect # 1-8KTK2 ends

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.VALIDATE_AGENCY_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_AGENCY_CODE")
		public void Fraprop_ValidateAgencyCode()
		{
			
				//  Fix for defect # 1-8KTK2 begins
				//  Checks whether the agency code is new or is inactive.

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				//  Fix for defect # 1-8KTK2 begins
				//  Checks whether the agency code is new or is inactive.
				if ( frbpropElement.getFrbpropAgencyCode().isNull() )
				{
					return ;
				}
				{
					NNumber holdPidm = NNumber.getNull();
					NNumber agencyPidm = NNumber.getNull();
					NString status= NString.getNull();
					String sqlsPidm = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :FRBPROP_FRBPROP_AGENCY_CODE ";
					DataCursor sPidm = new DataCursor(sqlsPidm);
					String sqlvalidateAgcy = "SELECT FTVAGCY_AGCY_CODE_PIDM " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM ";
					DataCursor validateAgcy = new DataCursor(sqlvalidateAgcy);
					String sqlagcyStatus = "SELECT 'X' " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM AND FTVAGCY_STATUS_IND = 'A' ";
					DataCursor agcyStatus = new DataCursor(sqlagcyStatus);
					try {
						//Setting query parameters
						sPidm.addParameter("FRBPROP_FRBPROP_AGENCY_CODE", frbpropElement.getFrbpropAgencyCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sPidm.
						sPidm.open();
						ResultSet sPidmResults = sPidm.fetchInto();
						if ( sPidmResults != null ) {
							holdPidm = sPidmResults.getNumber(0);
						}
						sPidm.close();
						//Setting query parameters
						validateAgcy.addParameter("P_HOLD_PIDM", holdPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable validateAgcy.
						validateAgcy.open();
						ResultSet validateAgcyResults = validateAgcy.fetchInto();
						if ( validateAgcyResults != null ) {
							agencyPidm = validateAgcyResults.getNumber(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(validateAgcy.notFound()), GNls.Fget(toStr("FRAPROP-0083"), toStr("FORM"), toStr("Agency ID is new; please create Agency using FTMAGCY.")), toBool(NBool.True));
						validateAgcy.close();
						//Setting query parameters
						agcyStatus.addParameter("P_HOLD_PIDM", holdPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable agcyStatus.
						agcyStatus.open();
						ResultSet agcyStatusResults = agcyStatus.fetchInto();
						if ( agcyStatusResults != null ) {
							status = agcyStatusResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(agcyStatus.notFound()), GNls.Fget(toStr("FRAPROP-0084"), toStr("FORM"), toStr("Agency is not active.")), toBool(NBool.True));
						agcyStatus.close();
					}
					finally{
						sPidm.close();
						validateAgcy.close();
						agcyStatus.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.VALIDATE_CFDA_CODE
		 -- Fix for defect # 1-8KTK2 begins
-- Checks whether the CFDA code is inactive.
IF :FRBPROP_CFDA_CODE IS NULL THEN
  RETURN;
END IF;

DECLARE
  hold_cfda_int_id   frbgrnt.frbgrnt_cfda_internal_id_no%type; 
 
  CURSOR CFDA_STATUS IS 
    SELECT DISTINCT FRVCFDA_INTERNAL_ID_NO
    FROM FRVCFDA
    WHERE FRVCFDA_CFDA_CODE = :FRBPROP_CFDA_CODE
    AND FRVCFDA_STATUS = 'A';
  
BEGIN
  OPEN CFDA_STATUS;
    FETCH CFDA_STATUS INTO hold_cfda_int_id;
    IF CFDA_STATUS%NOTFOUND THEN
      MESSAGE(G$_NLS.Get('FRAPROP-0085', 'FORM','Category of Federal Domestic Assistance Number is invalid. LIST is available.') );
    END IF;
  CLOSE CFDA_STATUS;
END;
-- Fix for defect # 1-8KTK2 ends

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.VALIDATE_CFDA_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_CFDA_CODE")
		public void Fraprop_ValidateCfdaCode()
		{
			
				//  Fix for defect # 1-8KTK2 begins
				//  Checks whether the CFDA code is inactive.

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				//  Fix for defect # 1-8KTK2 begins
				//  Checks whether the CFDA code is inactive.
				if ( frbpropElement.getFrbpropCfdaCode().isNull() )
				{
					return ;
				}
				{
					NNumber holdCfdaIntId= NNumber.getNull();
					String sqlcfdaStatus = "SELECT DISTINCT FRVCFDA_INTERNAL_ID_NO " +
	" FROM FRVCFDA " +
	" WHERE FRVCFDA_CFDA_CODE = :FRBPROP_CFDA_CODE AND FRVCFDA_STATUS = 'A' ";
					DataCursor cfdaStatus = new DataCursor(sqlcfdaStatus);
					try {
						//Setting query parameters
						cfdaStatus.addParameter("FRBPROP_CFDA_CODE", frbpropElement.getFrbpropCfdaCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cfdaStatus.
						cfdaStatus.open();
						ResultSet cfdaStatusResults = cfdaStatus.fetchInto();
						if ( cfdaStatusResults != null ) {
							holdCfdaIntId = cfdaStatusResults.getNumber(0);
						}
						if ( cfdaStatus.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0085"), toStr("FORM"), toStr("Category of Federal Domestic Assistance Number is invalid. LIST is available.")));
						}
						cfdaStatus.close();
					}
					finally{
						cfdaStatus.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.DISABLE_I18N_FIELDS
		 IF GET_ITEM_PROPERTY('FRBPROP.ADDRESS_HOUSE_NUMBER',VISIBLE) = 'TRUE' THEN
  SET_ITEM_PROPERTY('FRBPROP.ADDRESS_HOUSE_NUMBER',ENABLED,PROPERTY_OFF);
END IF;

IF GET_ITEM_PROPERTY('FRBPROP.ADDRESS_LINE_4',VISIBLE) = 'TRUE' THEN
  SET_ITEM_PROPERTY('FRBPROP.ADDRESS_LINE_4',ENABLED,PROPERTY_OFF);
END IF;

IF GET_ITEM_PROPERTY('FRBPROP.CTRY_CODE_PHONE',VISIBLE) = 'TRUE' THEN
  SET_ITEM_PROPERTY('FRBPROP.CTRY_CODE_PHONE',ENABLED,PROPERTY_OFF);
ELSE  
  SET_ITEM_PROPERTY('FRBPROP.AREA_CODE'   , X_POS, 129);
  SET_ITEM_PROPERTY('FRBPROP.PHONE_NUMBER', X_POS, 188);
  SET_ITEM_PROPERTY('FRBPROP.EXTENSION'   , X_POS, 297);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.DISABLE_I18N_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_I18N_FIELDS")
		public void Fraprop_DisableI18nFields()
		{
			
				if ( getItemVisible("FRBPROP.ADDRESS_HOUSE_NUMBER").equals("TRUE") )
				{
					setItemEnabled("FRBPROP.ADDRESS_HOUSE_NUMBER", false);
				}
				if ( getItemVisible("FRBPROP.ADDRESS_LINE_4").equals("TRUE") )
				{
					setItemEnabled("FRBPROP.ADDRESS_LINE_4", false);
				}
				if ( getItemVisible("FRBPROP.CTRY_CODE_PHONE").equals("TRUE") )
				{
					setItemEnabled("FRBPROP.CTRY_CODE_PHONE", false);
				}
				else {
					setItemXPos("FRBPROP.AREA_CODE", 129);
					setItemXPos("FRBPROP.PHONE_NUMBER", 188);
					setItemXPos("FRBPROP.EXTENSION", 297);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRAPROP.EDIT_PERSON_ID
		 -- 1-BMV7IL
IF :FRRPRPI_ID IS NULL AND :FRRPRPI_ID_IND IS NOT NULL THEN
	GO_BLOCK('FRRPRPI');
	GO_ITEM('FRRPRPI_ID');
	MESSAGE(G$_NLS.GET('FRAPROP-0086','FORM','Field must be entered.'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRAPROP.EDIT_PERSON_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_PERSON_ID")
		public void Fraprop_EditPersonId()
		{
			
				//  1-BMV7IL

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				//  1-BMV7IL
				if ( frrprpiElement.getFrrprpiId().isNull() && !frrprpiElement.getFrrprpiIdInd().isNull() )
				{
					goBlock(toStr("FRRPRPI"));
					goItem(toStr("FRRPRPI_ID"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0086"), toStr("FORM"), toStr("Field must be entered.")));
					throw new ApplicationException();
				}
			}

		
	
}
	
