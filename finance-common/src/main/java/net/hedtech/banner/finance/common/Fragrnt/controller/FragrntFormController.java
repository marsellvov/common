package net.hedtech.banner.finance.common.Fragrnt.controller;

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
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsMessageLevel;
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
import net.hedtech.banner.finance.common.Fragrnt.model.*;
import net.hedtech.banner.finance.common.Fragrnt.*;
import net.hedtech.banner.finance.common.Fragrnt.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;
import net.hedtech.general.common.services.OracleMessagesLevel;


public class FragrntFormController extends DefaultFormController {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_FORM_CLASS");
	}

	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_APPL_FORM_CLASS");
	}

	public FragrntFormController(ITask task) {
		super(task);
	}

	@Override
	public FragrntTask getTask() {
		return (FragrntTask) super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}

	// action methods generated from triggers
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.G$_VERIFY_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_VERIFY_ACCESS")
	public void Fragrnt_GVerifyAccess() {

		getGFormClass().gVerifyAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void Fragrnt_GRevokeAccess() {

		getGFormClass().gRevokeAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void Fragrnt_TaskStartedPre(EventObject args) {

		getGFormClass().taskStartedPre(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void Fragrnt_PreFormTrg() {

		getGFormClass().preFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskEnded
	public void Fragrnt_TaskEnded(EventObject args) {

		getGFormClass().taskEnded(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void Fragrnt_PostFormTrg() {

		getGFormClass().postFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void Fragrnt_blockIn() {

		getGFormClass().blockIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void Fragrnt_PreBlockTrg() {

		getGFormClass().preBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void Fragrnt_blockOut() {

		getGFormClass().blockOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void Fragrnt_PostBlockTrg() {

		getGFormClass().postBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void Fragrnt_BeforeCommit(CancelEvent args) {

		getGFormClass().beforeCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void Fragrnt_PreCommitTrg() {

		getGFormClass().preCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void Fragrnt_BeforeRowInsert(RowAdapterEvent args) {

		getGFormClass().beforeRowInsert(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void Fragrnt_BeforeRowUpdate(RowAdapterEvent args) {

		getGFormClass().beforeRowUpdate(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void Fragrnt_OnError(EventObject args) {

		getGFormClass().onError(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void Fragrnt_OnRollback() {

		getGFormClass().onRollback();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void Fragrnt_OnRollbackTrg() {

		getGFormClass().onRollbackTrg();
		goBlock("KEY_BLOCK");
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void Fragrnt_OnSelect() {

		getGFormClass().onSelect();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void Fragrnt_AfterCommit(EventObject args) {

		getGFormClass().afterCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void Fragrnt_PostFormsCommitTrg() {

		getGFormClass().postFormsCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void Fragrnt_buttonClick() {

		getGFormClass().click();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN-NEW-BLOCK-INSTANCE
	 * DECLARE lv_item ITEM; BEGIN :del_ready := 'N';
	 * G$_NAVIGATION_FRAME.POPULATE_GUROPTM; G$_CHECK_FAILURE; -- IF
	 * G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED = 'N' THEN
	 * G$_DO_NEW_MESSAGES_EXIST; G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED :=
	 * 'Y'; END IF; -- -- 4000-32 Add the following call to the
	 * G$_WF_DRIVER.WF_EXECUTE procedure to control the -- behavior of the Key
	 * Block when the current form has been invoked as part of -- a Workflow
	 * activity. -- -- If Workflow is not installed or is not enabled at a
	 * client site, or if the current -- form has not been invoked as part of a
	 * Workflow activity, the G$_WF_DRIVER.WF_EXECUTE -- procedure will not
	 * perform any Workflow function. --
	 * G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_KEY_BLOCK'); -- lv_item :=
	 * FIND_ITEM('G$_NAV_BLOCK.LEAVING_BLK_IND'); IF NOT ID_NULL(lv_item) THEN
	 * IF NAME_IN('G$_NAV_BLOCK.LEAVING_BLK_IND') IS NOT NULL THEN
	 * COPY('','G$_NAV_BLOCK.LEAVING_BLK_IND'); ELSE
	 * SET_VIEW_PROPERTY('G$_NAV_CANVAS',VISIBLE,PROPERTY_FALSE);
	 * EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG'); G$_CHECK_FAILURE; END IF;
	 * ELSE EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG'); G$_CHECK_FAILURE;
	 * END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void Fragrnt_blockChange() {

		{
			ItemDescriptor lvItem = null;
			getFormModel().getFormHeader().setDelReady(toStr("N"));
			getTask().getGoqrpls().getGNavigationFrame().populateGuroptm();
			getTask().getGoqrpls().gCheckFailure();
			//
			if (getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed
					.equals("N")) {
				getTask().getGoqrpls().gDoNewMessagesExist();
				getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed = toStr("Y");
			}
			//
			// 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
			// procedure to control the
			// behavior of the Key Block when the current form has been invoked
			// as part of
			// a Workflow activity.
			//
			// If Workflow is not installed or is not enabled at a client site,
			// or if the current
			// form has not been invoked as part of a Workflow activity, the
			// G$_WF_DRIVER.WF_EXECUTE
			// procedure will not perform any Workflow function.
			//
			getTask().getGoqwflw().getGWfDriver()
					.wfExecute(toStr("WF_CONTROL_KEY_BLOCK"));
			//
			lvItem = findItem(toStr("G$_NAV_BLOCK.LEAVING_BLK_IND"));
			if (!(lvItem == null)) {
				if (!getNameIn("G$_NAV_BLOCK.LEAVING_BLK_IND").isNull()) {
					copy("", "G$_NAV_BLOCK.LEAVING_BLK_IND");
				} else {
					setViewVisible("G$_NAV_CANVAS", false);
					executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
					getTask().getGoqrpls().gCheckFailure();
				}
			} else {
				executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
				getTask().getGoqrpls().gCheckFailure();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void Fragrnt_doubleClick() {

		getGFormClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void Fragrnt_WhenTimerExpired(NString timerName) {

		getGFormClass().whenTimerExpired(timerName);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void Fragrnt_WhenWindowActivated() {

		getGFormClass().whenWindowActivated();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN-WINDOW-CLOSED DECLARE
	 * alert_button NUMBER; BEGIN IF G$_QUERY_ONLY_ROLE THEN GOTO CLOSE_WINDOW;
	 * END IF;
	 * 
	 * execute_trigger('get_percentage_total'); g$_check_failure;
	 * execute_trigger('check_duplicate_agency_code'); g$_check_failure; IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN alert_button :=
	 * Show_Alert('G$_EXIT_FORM_ALERT'); IF alert_button = ALERT_BUTTON1 THEN
	 * go_block('frragpt'); execute_trigger('key-commit'); g$_check_failure; END
	 * IF; IF alert_button = ALERT_BUTTON2 THEN NULL; END IF; IF alert_button =
	 * ALERT_BUTTON3 THEN RAISE form_trigger_failure; END IF;
	 * 
	 * go_block('frragpt'); clear_block(no_validate); :form_header.total := '';
	 * g$_check_failure; IF :frbgrnt.display_pass_thru_ind = 'Y' THEN
	 * execute_trigger('one_record_mandatory'); G$_CHECK_FAILURE;
	 * execute_trigger('get_percentage_total'); G$_CHECK_FAILURE; END IF; END
	 * IF;
	 * 
	 * << CLOSE_WINDOW >> G$_WIN_CLOSED; G$_CHECK_FAILURE; IF
	 * name_in('SYSTEM.EVENT_WINDOW') = 'PASS_THRU_IND_INFO' THEN
	 * go_block('FRBGRNT'); G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void Fragrnt_WhenWindowClosed() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	
		{
			NNumber alertButton= NNumber.getNull();
			
			if(getCurrentBlock().equals("G$_EXTENDED_SEARCH_BLOCK")){
				goItem("FRRGRPI_ID_IND");
				getGFormClass().whenWindowClosed();
				return;
			}
			if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
			{
				// goto CLOSE_WINDOW;
				getTask().getGoqrpls().gWinClosed();
				getTask().getGoqrpls().gCheckFailure();
				if ( getCurrentWindow().equals("PASS_THRU_IND_INFO") )
				{
					goBlock(toStr("FRBGRNT"));
					getTask().getGoqrpls().gCheckFailure();
				}
				return;
			}
			if ( getCurrentWindow().equals("COPY_GRNT") )
			{
				goBlock(toStr("FRBGRNT"));
				getTask().getGoqrpls().gCheckFailure();
			}
			executeAction("get_percentage_total");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("check_duplicate_agency_code");
			getTask().getGoqrpls().gCheckFailure();
			if ( getBlockStatus().equals("CHANGED") )
			{
				alertButton = toNumber(showAlert("G$_EXIT_FORM_ALERT"));
				if ( alertButton.equals(MessageServices.BUTTON1) )
				{
					goBlock(toStr("frragpt"));
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
				goBlock(toStr("frragpt"));
				clearBlock(TaskServices.NO_VALIDATE);
				getFormModel().getFormHeader().setTotal(toNumber(""));
				getTask().getGoqrpls().gCheckFailure();
				if ( frbgrntElement.getDisplayPassThruInd().equals("Y") )
				{
					executeAction("one_record_mandatory");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
				}
			}
			// CLOSE_WINDOW:;
			getTask().getGoqrpls().gWinClosed();
			getTask().getGoqrpls().gCheckFailure();
			if ( getCurrentWindow().equals("PASS_THRU_IND_INFO") )
			{
				goBlock(toStr("FRBGRNT"));
				getTask().getGoqrpls().gCheckFailure();
			}
		}
}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void Fragrnt_F0() {

		getGFormClass().f0();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void Fragrnt_F2() {

		getGFormClass().f2();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void Fragrnt_MoveDown() {

		getGFormClass().moveDown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void Fragrnt_MoveUp() {

		getGFormClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void Fragrnt_KeyMenu() {

		getGFormClass().keyMenu();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void Fragrnt_NextRecord() {

		getGFormClass().nextRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void Fragrnt_PreviousRecord() {

		getGFormClass().previousRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void Fragrnt_KeyNxtset() {

		getGFormClass().keyNxtset();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void Fragrnt_KeyScrup() {

		getGFormClass().keyScrup();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void Fragrnt_KeyScrdown() {

		getGFormClass().keyScrdown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void Fragrnt_KeyPrint() {

		getGFormClass().keyPrint();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void Fragrnt_Search() {

		getGFormClass().search();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void Fragrnt_ExecuteQuery() {

		getGFormClass().executeQuery();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void Fragrnt_Exit() {

		getGFormClass().exit();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void Fragrnt_KeyNxtkeyTrg() {

		getGFormClass().keyNxtkeyTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void Fragrnt_InvalidOptionMsg() {

		getGFormClass().invalidOptionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void Fragrnt_UpdateActivity() {

		getGFormClass().updateActivity();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_KEYS")
	public void Fragrnt_CheckKeys() {
		
	
		if (getFormModel().getKeyBlock().getDisplayFrbgrntCode().isNull()) 
		{

			errorMessage(GNls.Fget(toStr("FRAGRNT-0088"), toStr("FORM"),toStr("Grant Code must be entered.")));
			throw new ApplicationException();
		}

		
		
		getGApplFormClass().checkKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE", function = KeyFunction.RECORD_CHANGE)
	public void Fragrnt_recordChange() {

		getGApplFormClass().whenNewRecordInstance();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.LIST_VALUES_COPY COPY(
	 * :GLOBAL.VALUE, :SYSTEM.CURRENT_FIELD ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void Fragrnt_ListValuesCopy() {

		copy(getGlobal("VALUE"), getCurrentField());
		findItem(getCurrentField()).setValid(false);
		validateItem(getCurrentField());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.LOAD_FORM_HEADER
	 * :CURRENT_FORM := :SYSTEM.CURRENT_FORM ; -- :CURRENT_DATE :=
	 * TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ; :CURRENT_TIME :=
	 * TO_CHAR(SYSDATE, 'HH24:MI:SS') ; -- :CURRENT_INSTITUTION :=
	 * :GLOBAL.INSTITUTION ; -- :CURRENT_USER := :GLOBAL.USER_ID ;
	 * EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE'); EXECUTE_TRIGGER('GLOBAL_COPY');
	 * :from_new_item := 'I';
	 * 
	 * IF NVL(GET_APPLICATION_PROPERTY(CALLING_FORM),'~') IN
	 * ('FRACOLL','FRIASTG','FRIASTP','FRIKGNT',
	 * 'FRIKPRO','FRIORGH','FRIPSTG','FRIPSTP', 'FTMBECL','FTMFUND') THEN
	 * :CALLED_FROM_INQUIRY :=1; ELSE :CALLED_FROM_INQUIRY :=0; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Fragrnt_LoadFormHeader() {

		getFormModel().getFormHeader().setCurrentForm(
				toStr(getCurrentTaskName()));
		//
		getFormModel().getFormHeader().setCurrentDate(
				toChar(NDate.getNow(), GDate.getNlsDateFormat()));
		getFormModel().getFormHeader().setCurrentTime(
				toChar(NDate.getNow(), "HH24:MI:SS"));
		//
		getFormModel().getFormHeader().setCurrentInstitution(
				getGlobal("INSTITUTION"));
		//
		getFormModel().getFormHeader().setCurrentUser(getGlobal("USER_ID"));
		executeAction("LOAD_CURRENT_RELEASE");
		executeAction("GLOBAL_COPY");
		getFormModel().getFormHeader().setFromNewItem(toStr("I"));
		if (in(isNull(getParentTaskName(), "~"), "FRACOLL", "FRIASTG",
				"FRIASTP", "FRIKGNT", "FRIKPRO", "FRIORGH", "FRIPSTG",
				"FRIPSTP", "FTMBECL", "FTMFUND").getValue()) {
			getFormModel().getFormHeader().setCalledFromInquiry(toInt(1));
		} else {
			getFormModel().getFormHeader().setCalledFromInquiry(toInt(0));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_FRRGUSN --dbms
	 * package issue DELETE FROM FRRGUSN WHERE FRRGUSN_GRNT_CODE =
	 * :DISPLAY_frbgrnt_CODE ; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DELETE_FRRGUSN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_FRRGUSN")
	public void Fragrnt_DeleteFrrgusn() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FRRGUSN "
				+ " WHERE FRRGUSN_GRNT_CODE = :DISPLAY_FRBGRNT_CODE";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_FRBGBIL --dbms
	 * package issue DELETE FROM FRBGBIL WHERE FRBGBIL_GRNT_CODE =
	 * :DISPLAY_frbgrnt_CODE; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DELETE_FRBGBIL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_FRBGBIL")
	public void Fragrnt_DeleteFrbgbil() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FRBGBIL "
				+ " WHERE FRBGBIL_GRNT_CODE = :DISPLAY_FRBGRNT_CODE";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TRG_FAIL NULL ; RAISE
	 * FORM_TRIGGER_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.TRG_FAIL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TRG_FAIL")
	public void Fragrnt_TrgFail() {

		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-HELP help;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void Fragrnt_Help() {


	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.SET_FIELDS IF
	 * :frbgrnt_LONG_TITLE IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0000',
	 * 'FORM','The Title of the Grant must be entered.') ); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; IF :frbgrnt_PROJECT_START_DATE IS NULL THEN
	 * MESSAGE( G$_NLS.Get('FRAGRNT-0001', 'FORM','The Start Date of the grant
	 * must be entered.') ); RAISE FORM_TRIGGER_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.SET_FIELDS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SET_FIELDS")
	public void Fragrnt_SetFields() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frbgrntElement==null)
			return;
		
		if (frbgrntElement.getFrbgrntLongTitle().isNull()) {
//			message(GNls.Fget(toStr("FRAGRNT-0000"), toStr("FORM"),
//					toStr("The Title of the Grant must be entered.")));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0000"), toStr("FORM"),
					toStr("The Title of the Grant must be entered.")));
			throw new ApplicationException();
		}
		if (frbgrntElement.getFrbgrntProjectStartDate().isNull()) {
//			message(GNls.Fget(toStr("FRAGRNT-0001"), toStr("FORM"),
//					toStr("The Start Date of the grant must be entered.")));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0001"), toStr("FORM"),
					toStr("The Start Date of the grant must be entered.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.COPY_TO_GLOBALS
	 * :GLOBAL.AGCY_ID := :frbgrnt_agency_code_2 ; :GLOBAL.AGCY_PRED_ID :=
	 * :frbgrnt_agency_pred_code ; :GLOBAL.AGCY_PIDM := :frbgrnt_agency_pidm;
	 * :GLOBAL.AGCY_PRED_PIDM := :frbgrnt_agency_pred_pidm ; :GLOBAL.AGCY_NAME
	 * := :frbgrnt_agency_name_2 ; :GLOBAL.AGCY_PRED_NAME :=
	 * :frbgrnt_agency_pred_name ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.COPY_TO_GLOBALS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "COPY_TO_GLOBALS")
	public void Fragrnt_CopyToGlobals() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frbgrntElement!=null){
		
		setGlobal("AGCY_ID", frbgrntElement.getFrbgrntAgencyCode2());
		setGlobal("AGCY_PRED_ID", getFormModel().getFormHeader()
				.getFrbgrntAgencyPredCode());
		setGlobal("AGCY_PIDM", toStr(frbgrntElement.getFrbgrntAgencyPidm()));
		setGlobal("AGCY_PRED_PIDM",
				toStr(frbgrntElement.getFrbgrntAgencyPredPidm()));
		setGlobal("AGCY_NAME", frbgrntElement.getFrbgrntAgencyName2());
		setGlobal("AGCY_PRED_NAME", getFormModel().getFormHeader()
				.getFrbgrntAgencyPredName());
	}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.COPY_GLOBALS 
	 * :GOT_PIDM := :GLOBAL.AGCY_PRED_PIDM ;
	 *  -- IF :GOT_PIDM = :FRBGRNT_AGENCY_PRED_PIDM OR ( :GOT_PIDM IS NULL AND :FRBGRNT_AGENCY_PRED_PIDM IS NULL ) THEN
	 * EXECUTE_TRIGGER( 'TRG_FAIL' ) ; 
	 * IF NOT FORM_SUCCESS THEN GOTO SAME ; END
	 * IF ; END IF ; -- << DIFF >> :FRBGRNT_AGENCY_PRED_PIDM :=
	 * :GLOBAL.AGCY_PRED_PIDM ; :Frbgrnt_agency_pred_name :=
	 * :GLOBAL.AGCY_PRED_NAME ; :frbgrnt_agency_pred_code :=
	 * :GLOBAL.AGCY_PRED_ID ; :HOLD_PRED := :GLOBAL.AGCY_PRED_ID ; 
	 * -- << SAME >>
	 * ERASE( 'GLOBAL.AGCY_NAME' ) ; -- ERASE( 'GLOBAL.AGCY_PRED_NAME' ) ; --
	 * ERASE( 'GLOBAL.AGCY_PRED_ID' ) ; -- ERASE( 'GLOBAL.AGCY_ID' ) ; ERASE(
	 * 'GLOBAL.AGCY_PRED_PIDM' ) ; -- ERASE( 'GLOBAL.AGCY_PIDM' ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.COPY_GLOBALS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "COPY_GLOBALS")
	public void Fragrnt_CopyGlobals() {

		
		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement!=null){
		getFormModel().getFormHeader().setGotPidm(getGlobal("AGCY_PRED_PIDM"));

		if (getFormModel().getFormHeader().getGotPidm()
				.equals(frbgrntElement.getFrbgrntAgencyPredPidm())
				|| (getFormModel().getFormHeader().getGotPidm().isNull() && frbgrntElement
						.getFrbgrntAgencyPredPidm().isNull())) {
			try {
				executeAction("TRG_FAIL");
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
		// DIFF:;
		frbgrntElement.setFrbgrntAgencyPredPidm(toNumber(getGlobal("AGCY_PRED_PIDM")));
		getFormModel().getFormHeader().setFrbgrntAgencyPredName(getGlobal("AGCY_PRED_NAME"));
		getFormModel().getFormHeader().setFrbgrntAgencyPredCode(getGlobal("AGCY_PRED_ID"));
		getFormModel().getFormHeader().setHoldPred(getGlobal("AGCY_PRED_ID"));
		// SAME:;
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
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_OPT_1 declare
	 * temp_var varchar2(1); cursor c1 is select 'x' from frvsdat where
	 * frvsdat_sdat_code_attr = :FRRgusn_SDAT_CODE_ATTR and
	 * frvsdat_sdat_code_opt_1 = :frrgusn_sdat_code_opt_1;
	 * 
	 * begin open c1; fetch c1 into temp_var; if c1%notfound then message(
	 * G$_NLS.Get('FRAGRNT-0002', 'FORM','User Code is invalid. LIST is
	 * available.') ); close c1; raise form_trigger_failure; end if; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.CHECK_OPT_1
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_OPT_1")
	public void Fragrnt_CheckOpt1() {

		FrrgusnAdapter frrgusnElement = (FrrgusnAdapter) this.getFormModel()
				.getFrrgusn().getRowAdapter(true);

		if(frrgusnElement==null)
			return;
		
		int rowCount = 0;
		{
			NString tempVar = NString.getNull();
			String sqlc1 = "SELECT 'x' "
					+ " FROM frvsdat "
					+ " WHERE frvsdat_sdat_code_attr = :FRRGUSN_SDAT_CODE_ATTR AND frvsdat_sdat_code_opt_1 = :FRRGUSN_SDAT_CODE_OPT_1 ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				// Setting query parameters
				c1.addParameter("FRRGUSN_SDAT_CODE_ATTR",
						frrgusnElement.getFrrgusnSdatCodeAttr());
				c1.addParameter("FRRGUSN_SDAT_CODE_OPT_1",
						frrgusnElement.getFrrgusnSdatCodeOpt1());
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					tempVar = c1Results.getStr(0);
				}
				if (c1.notFound()) {
//					message(GNls.Fget(toStr("FRAGRNT-0002"), toStr("FORM"),
//							toStr("User Code is invalid. LIST is available.")));
					errorMessage(GNls.Fget(toStr("FRAGRNT-0002"), toStr("FORM"),
							toStr("User Code is invalid. LIST is available.")));
					throw new ApplicationException();
				}
			} finally {
				c1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.SET_REQUIRED_OFF
	 * 
	 * IF GET_ITEM_PROPERTY('frbgrnt_COAS_CODE',REQUIRED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_COAS_CODE',REQUIRED,PROPERTY_OFF); END IF; 
	 * --
	 * IF GET_ITEM_PROPERTY('frbgrnt_LONG_TITLE',REQUIRED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_LONG_TITLE',REQUIRED,PROPERTY_OFF); END IF; 
	 * --
	 * IF GET_ITEM_PROPERTY('frbgrnt_TITLE',REQUIRED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_TITLE',REQUIRED,PROPERTY_OFF); END IF; 
	 * -- 
	 * IF GET_ITEM_PROPERTY('frbgrnt_PROJECT_START_DATE',REQUIRED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_PROJECT_START_DATE',REQUIRED,PROPERTY_OFF);
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.SET_REQUIRED_OFF
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SET_REQUIRED_OFF")
	public void Fragrnt_SetRequiredOff() {

		if (getItemRequired("frbgrnt_COAS_CODE").equals("TRUE")) {
			setItemRequired("frbgrnt_COAS_CODE", false);
		}
		//
		if (getItemRequired("frbgrnt_LONG_TITLE").equals("TRUE")) {
			setItemRequired("frbgrnt_LONG_TITLE", false);
		}
		//
		if (getItemRequired("frbgrnt_TITLE").equals("TRUE")) {
			setItemRequired("frbgrnt_TITLE", false);
		}
		//
		if (getItemRequired("frbgrnt_PROJECT_START_DATE").equals("TRUE")) {
			setItemRequired("frbgrnt_PROJECT_START_DATE", false);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.SET_REQUIRED_ON IF
	 * GET_ITEM_PROPERTY('frbgrnt_COAS_CODE',REQUIRED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_COAS_CODE',REQUIRED,PROPERTY_ON); END IF; --
	 * IF GET_ITEM_PROPERTY('frbgrnt_LONG_TITLE',REQUIRED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_LONG_TITLE',REQUIRED,PROPERTY_ON); END IF; --
	 * IF GET_ITEM_PROPERTY('frbgrnt_TITLE',REQUIRED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_TITLE',REQUIRED,PROPERTY_ON); END IF; -- IF
	 * GET_ITEM_PROPERTY('frbgrnt_PROJECT_START_DATE',REQUIRED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_PROJECT_START_DATE',REQUIRED,PROPERTY_ON); END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.SET_REQUIRED_ON
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SET_REQUIRED_ON")
	public void Fragrnt_SetRequiredOn() {

		if (getItemRequired("frbgrnt_COAS_CODE").equals("FALSE")) {
			setItemRequired("frbgrnt_COAS_CODE", true);
		}
		//
		if (getItemRequired("frbgrnt_LONG_TITLE").equals("FALSE")) {
			setItemRequired("frbgrnt_LONG_TITLE", true);
		}
		//
		if (getItemRequired("frbgrnt_TITLE").equals("FALSE")) {
			setItemRequired("frbgrnt_TITLE", true);
		}
		//
		if (getItemRequired("frbgrnt_PROJECT_START_DATE").equals("FALSE")) {
			setItemRequired("frbgrnt_PROJECT_START_DATE", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_FROM_TO_INFO IF
	 * SELECT_frbgrnt_1(:COPY_grnt_CODE) THEN
	 * EDIT_ORGN_SEQURITY_AFTER_QUERY(:COPY_grnt_CODE); IF NOT FORM_SUCCESS THEN
	 * :CHECK_KEYS := 'N'; RAISE FORM_TRIGGER_FAILURE; END IF;
	 * HIDE_WINDOW('COPY_grnt'); GO_BLOCK('frbgrnt'); CLEAR_BLOCK(NO_VALIDATE);
	 * SET_BLOCK_PROPERTY('frbgrnt',DEFAULT_WHERE,'FRBGRNT_CODE =
	 * :COPY_grnt_CODE'); EXECUTE_QUERY; CREATE_RECORD; DUPLICATE_RECORD;
	 * PREVIOUS_RECORD; CLEAR_RECORD; :FRBGRNT_GRNT_CODE_RELATED :=
	 * :COPY_grnt_CODE; declare cursor c1 is select frbgrnt_title from frbgrnt
	 * where frbgrnt_code = :frbgrnt_grnt_code_related; begin open c1; fetch c1
	 * into :related_grnt_descr; close c1; end;
	 * 
	 * :COPY_FUNCT_PROCESS := 'Y';
	 * SET_BLOCK_PROPERTY('frbgrnt',DEFAULT_WHERE,''); MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0003', 'FORM','"WARNING", Effort Reporting entries
	 * will not be copied.') );
	 * 
	 * ELSE MESSAGE( G$_NLS.Get('FRAGRNT-0004', 'FORM','Invalid Grant Code; Use
	 * LIST.') ); RAISE FORM_TRIGGER_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_FROM_TO_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_FROM_TO_INFO")
	public void Fragrnt_EditFromToInfo() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		if (this.getTask()
				.getServices()
				.selectFrbgrnt1(getFormModel().getCopyBlock().getCopyGrntCode())
				.getValue()) {
			// EditOrgnSequrityAfterQuery(getFormModel().getCopyBlock().getCopyGrntCode());
			try {
				Fragrnt_EditOrgnSecurityAfterQuery();
				// if ( SupportClasses.SQLFORMS.FormSuccess().not() )
				// {
			} catch (Exception e) {
				getFormModel().getFormHeader().setCheckKeys(toStr("N"));
				throw new ApplicationException();
			}
			hideWindow("COPY_grnt");
			goBlock(toStr("frbgrnt"));
			clearBlock(TaskServices.NO_VALIDATE);
			setBlockWhereClause("frbgrnt", "FRBGRNT_CODE = :COPY_grnt_CODE");             
			executeQuery();
//			createRecord();
			duplicateRecord();
			previousRecord();
			clearRecord();
			frbgrntElement.setFrbgrntGrntCodeRelated(getFormModel()
					.getCopyBlock().getCopyGrntCode());
			{
				String sqlc1 = "SELECT frbgrnt_title " + " FROM frbgrnt "
						+ " WHERE frbgrnt_code = :FRBGRNT_GRNT_CODE_RELATED ";
				DataCursor c1 = new DataCursor(sqlc1);
				try {
					// Setting query parameters
					c1.addParameter("FRBGRNT_GRNT_CODE_RELATED",
							frbgrntElement.getFrbgrntGrntCodeRelated());
					c1.open();
					ResultSet c1Results = c1.fetchInto();
					if (c1Results != null) {
						frbgrntElement.setRelatedGrntDescr(c1Results.getStr(0));
					}
				} finally {
					c1.close();					
				}

			}
			getFormModel().getFormHeader().setCopyFunctProcess(toStr("Y"));
			setBlockWhereClause("frbgrnt", "");
			warningMessage(GNls
					.Fget(toStr("FRAGRNT-0003"),
							toStr("FORM"),
							toStr("\"WARNING\", Effort Reporting entries will not be copied.")));
		} else {
			errorMessage(GNls.Fget(toStr("FRAGRNT-0004"), toStr("FORM"),
					toStr("Invalid Grant Code; Use LIST.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_CFDA_CODE declare
	 * cursor get_cfda_code is select frvcfda_cfda_code from frvcfda where
	 * frvcfda_internal_id_no = :frbgrnt_cfda_internal_id_no; begin open
	 * get_cfda_code; fetch get_cfda_code into :frbgrnt_cfda_code; if
	 * get_cfda_code%NOTFOUND then :frbgrnt_cfda_code := ''; end if; close
	 * get_cfda_code; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_CFDA_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_CFDA_CODE")
	public void Fragrnt_GetCfdaCode() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frbgrntElement==null)
			return;
		
		int rowCount = 0;
		{
			String sqlgetCfdaCode = "SELECT frvcfda_cfda_code "
					+ " FROM frvcfda "
					+ " WHERE frvcfda_internal_id_no = :FRBGRNT_CFDA_INTERNAL_ID_NO ";
			DataCursor getCfdaCode = new DataCursor(sqlgetCfdaCode);
			try {
				// Setting query parameters
				getCfdaCode.addParameter("FRBGRNT_CFDA_INTERNAL_ID_NO",
						frbgrntElement.getFrbgrntCfdaInternalIdNo());
				getCfdaCode.open();
				ResultSet getCfdaCodeResults = getCfdaCode.fetchInto();
				if (getCfdaCodeResults != null) {
					frbgrntElement.setFrbgrntCfdaCode(getCfdaCodeResults.getStr(0));
				}
				if (getCfdaCode.notFound()) {
					frbgrntElement.setFrbgrntCfdaCode(toStr(""));
				}
			} finally {
				getCfdaCode.close();
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_EMPLOYEE declare
	 * pti_temp_1 varchar2(1); pti_temp_2 varchar2(1); -- cursor check_emp is
	 * select 'X' from nbrjobs, nbrbjob where nbrbjob_pidm = :frrgrpi_id_pidm
	 * and nbrbjob_contract_type = 'P' and (nbrbjob_end_date is null or
	 * nbrbjob_end_date > sysdate) and nbrjobs_pidm = nbrbjob_pidm AND
	 * nbrjobs_posn = nbrbjob_posn AND nbrjobs_suff = nbrbjob_suff AND
	 * nbrjobs_effective_date = (select max(nbrjobs_effective_date) from nbrjobs
	 * where nbrjobs_pidm = nbrbjob_pidm and nbrjobs_posn = nbrbjob_posn and
	 * nbrjobs_suff = nbrbjob_suff and nbrjobs_effective_date <= sysdate); --
	 * cursor check_hr_installed is select 'X' from gubinst where
	 * gubinst_humanre_installed = 'Y';
	 * 
	 * begin -- open check_hr_installed; -- fetch check_hr_installed into
	 * pti_temp_1; -- if check_hr_installed%FOUND then open check_emp; fetch
	 * check_emp into pti_temp_2; if check_emp%FOUND then :frrgrpi_employee_ind
	 * := 'Y'; else :frrgrpi_employee_ind := 'N'; end if; -- end if; -- close
	 * check_hr_installed; close check_emp; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_EMPLOYEE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_EMPLOYEE")
	public void Fragrnt_CheckEmployee() {

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);

		if(frrgrpiElement==null)
			return;
		
		int rowCount = 0;
		{
			NString ptiTemp1 = NString.getNull();
			NString ptiTemp2 = NString.getNull();
			String sqlcheckEmp = "SELECT 'X' "
					+ " FROM nbrjobs, nbrbjob "
					+ " WHERE nbrbjob_pidm = :FRRGRPI_ID_PIDM AND nbrbjob_contract_type = 'P' AND (nbrbjob_end_date IS NULL OR nbrbjob_end_date > sysdate) AND nbrjobs_pidm = nbrbjob_pidm AND nbrjobs_posn = nbrbjob_posn AND nbrjobs_suff = nbrbjob_suff AND nbrjobs_effective_date = (SELECT max(nbrjobs_effective_date) "
					+ " FROM nbrjobs "
					+ " WHERE nbrjobs_pidm = nbrbjob_pidm AND nbrjobs_posn = nbrbjob_posn AND nbrjobs_suff = nbrbjob_suff AND nbrjobs_effective_date <= sysdate ) ";
			DataCursor checkEmp = new DataCursor(sqlcheckEmp);
			
			String sqlcheckHrInstalled = "SELECT 'X' " + " FROM gubinst "
					+ " WHERE gubinst_humanre_installed = 'Y' ";
			DataCursor checkHrInstalled = new DataCursor(sqlcheckHrInstalled);
			
			try { 
				// open check_hr_installed;
				// fetch check_hr_installed into pti_temp_1;
				// if check_hr_installed%FOUND then
				// Setting query parameters
				checkEmp.addParameter("FRRGRPI_ID_PIDM",
						frrgrpiElement.getFrrgrpiIdPidm());
				checkEmp.open();
				ResultSet checkEmpResults = checkEmp.fetchInto();
				if (checkEmpResults != null) {
					ptiTemp2 = checkEmpResults.getStr(0);
				}
				if (checkEmp.found()) {
					frrgrpiElement.setFrrgrpiEmployeeInd(toStr("Y"));
				} else {
					frrgrpiElement.setFrrgrpiEmployeeInd(toStr("N"));
				}
				// end if;
				// close check_hr_installed;
			} finally {
				checkEmp.close();
				checkHrInstalled.close();
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_ORGN_CODE_FRRGRPI
	 * <multilinecomment> 1-113DE2A : Rewrite the Organization Title retrieval
	 * logic to handle past(terminated) and future records;
	 * 
	 * If user selects an inactive/terminated Org code and bypasses the warning
	 * alert OR if user queries an inactive/terminated org code; Search for the
	 * latest terminated/inactive record to get the organzation title. If no
	 * past (terminated) records, then search for the first future dated records
	 * to retrieve the title.
	 * 
	 * </multilinecomment> IF :FRRgrpi_ORGN_CODE IS NULL THEN RETURN ; END IF ;
	 * -- 1-BMV7IL Start DECLARE hold_orgn_code_descr varchar2(35); lv_holder
	 * varchar2(1); -- CURSOR FTVORGN_C IS SELECT 'Y' FROM FTVORGN WHERE
	 * FTVORGN_ORGN_CODE = :FRRgrpi_ORGN_CODE AND FTVORGN_COAS_CODE =
	 * :frbgrnt_COAS_CODE; -- CURSOR FTVORGN_CURR_REC_C IS SELECT FTVORGN_TITLE
	 * FROM FTVORGN WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <=
	 * SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL)
	 * AND FTVORGN_ORGN_CODE = :FRRgrpi_ORGN_CODE AND FTVORGN_COAS_CODE =
	 * :frbgrnt_COAS_CODE AND FTVORGN_STATUS_IND= 'A'; -- CURSOR
	 * FTVORGN_PAST_REC_C IS SELECT FTVORGN_TITLE FROM FTVORGN WHERE
	 * FTVORGN_EFF_DATE < SYSDATE AND FTVORGN_ORGN_CODE = :FRRgrpi_ORGN_CODE AND
	 * FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE ORDER BY FTVORGN_EFF_DATE DESC; --
	 * CURSOR FTVORGN_FUT_REC_C IS SELECT FTVORGN_TITLE FROM FTVORGN WHERE
	 * FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE = :FRRgrpi_ORGN_CODE AND
	 * FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE; -- ALERT_BUTTON NUMBER; ALERT_ID
	 * ALERT; warn_mes VARCHAR2(500) := G$_NLS.GET('FRAGRNT-0005','FORM', 'The
	 * Organization code entered is currently Terminated or Inactive. Do you
	 * want to update the Organization?'); BEGIN :FRRgrpi_ORGN_CODE_NAME := '';
	 * OPEN FTVORGN_C ; FETCH FTVORGN_C INTO lv_holder; IF FTVORGN_C%NOTFOUND
	 * THEN CLOSE FTVORGN_C; MESSAGE( G$_NLS.Get('FRAGRNT-0006',
	 * 'FORM','Organization is invalid. Use LIST.') ,NO_ACKNOWLEDGE); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE FTVORGN_C;
	 * 
	 * OPEN FTVORGN_CURR_REC_C; FETCH FTVORGN_CURR_REC_C INTO
	 * hold_orgn_code_descr; IF FTVORGN_CURR_REC_C%NOTFOUND THEN IF
	 * :SYSTEM.FORM_STATUS = 'QUERY' OR
	 * NVL(:FORM_HEADER.ORG_P_VALIDATE_FLAG,'Y') = 'N' THEN
	 * :FORM_HEADER.ORG_P_VALIDATE_FLAG := 'Y'; ELSE ALERT_ID :=
	 * FIND_ALERT('G$_PIPE_MESSAGE_ALERT'); SET_ALERT_PROPERTY(alert_id,
	 * alert_message_text, warn_mes ); alert_button := SHOW_ALERT(alert_id); IF
	 * alert_button = ALERT_BUTTON2 THEN CLOSE FTVORGN_CURR_REC_C; MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0007', 'FORM','Organization is invalid. Use LIST.')
	 * ,NO_ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * 
	 * END IF; -- Either Past (Terminated) or future records exist OPEN
	 * FTVORGN_PAST_REC_C; FETCH FTVORGN_PAST_REC_C INTO hold_orgn_code_descr;
	 * IF FTVORGN_PAST_REC_C%NOTFOUND THEN OPEN FTVORGN_FUT_REC_C; FETCH
	 * FTVORGN_FUT_REC_C INTO hold_orgn_code_descr; CLOSE FTVORGN_FUT_REC_C; END
	 * IF; CLOSE FTVORGN_PAST_REC_C; END IF; CLOSE FTVORGN_CURR_REC_C;
	 * 
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * :FRRgrpi_ORGN_CODE_NAME := hold_orgn_code_descr; END; --1-BMV7IL End
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_ORGN_CODE_FRRGRPI
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_ORGN_CODE_FRRGRPI")
	public void Fragrnt_EditOrgnCodeFrrgrpi() {

		// 1-113DE2A : Rewrite the Organization Title retrieval logic to handle
		// past(terminated) and future records;
		// If user selects an inactive/terminated Org code and bypasses the
		// warning alert OR if user queries an inactive/terminated org code;
		// Search for the latest terminated/inactive record to get the
		// organzation title.
		// If no past (terminated) records, then search for the first future
		// dated records to retrieve the title.

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frrgrpiElement==null || frbgrntElement==null)
			return;

		int rowCount = 0;
		// 1-113DE2A : Rewrite the Organization Title retrieval logic to handle
		// past(terminated) and future records;
		// If user selects an inactive/terminated Org code and bypasses the
		// warning alert OR if user queries an inactive/terminated org code;
		// Search for the latest terminated/inactive record to get the
		// organzation title.
		// If no past (terminated) records, then search for the first future
		// dated records to retrieve the title.
		if (frrgrpiElement.getFrrgrpiOrgnCode().isNull()) {
			return;
		}
		{
			NString holdOrgnCodeDescr = NString.getNull();
			NString lvHolder = NString.getNull();
			String sqlftvorgnC = "SELECT 'Y' "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_ORGN_CODE = :FRRGRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE ";
			DataCursor ftvorgnC = new DataCursor(sqlftvorgnC);
			String sqlftvorgnCurrRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE = :FRRGRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVORGN_STATUS_IND = 'A' ";
			DataCursor ftvorgnCurrRecC = new DataCursor(sqlftvorgnCurrRecC);
			String sqlftvorgnPastRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_EFF_DATE < SYSDATE AND FTVORGN_ORGN_CODE = :FRRGRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE "
					+ " ORDER BY FTVORGN_EFF_DATE DESC";
			DataCursor ftvorgnPastRecC = new DataCursor(sqlftvorgnPastRecC);
			String sqlftvorgnFutRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE = :FRRGRPI_ORGN_CODE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE ";
			DataCursor ftvorgnFutRecC = new DataCursor(sqlftvorgnFutRecC);
			//
			try {
				NNumber alertButton = NNumber.getNull();
				AlertDescriptor alertId = null;
				NString warnMes = GNls
						.Fget(toStr("FRAGRNT-0005"),
								toStr("FORM"),
								toStr("The Organization code entered is currently Terminated or Inactive. Do you want to update the Organization?"));
				frrgrpiElement.setFrrgrpiOrgnCodeName(toStr(""));
				// Setting query parameters
				ftvorgnC.addParameter("FRRGRPI_ORGN_CODE",
						frrgrpiElement.getFrrgrpiOrgnCode());
				ftvorgnC.addParameter("FRBGRNT_COAS_CODE",
						frbgrntElement.getFrbgrntCoasCode());
				ftvorgnC.open();
				ResultSet ftvorgnCResults = ftvorgnC.fetchInto();
				if (ftvorgnCResults != null) {
					lvHolder = ftvorgnCResults.getStr(0);
				}
				if (ftvorgnC.notFound()) {
//					message(GNls.Fget(toStr("FRAGRNT-0006"), toStr("FORM"),
//							toStr("Organization is invalid. Use LIST.")),
//							OutputMessageUserResponse.NO_ACKNOWLEDGE);
					errorMessage(GNls.Fget(toStr("FRAGRNT-0006"), toStr("FORM"),
							toStr("Organization is invalid. Use LIST.")),
							OutputMessageUserResponse.NO_ACKNOWLEDGE);
					throw new ApplicationException();
				}
				// Setting query parameters
				ftvorgnCurrRecC.addParameter("FRRGRPI_ORGN_CODE",
						frrgrpiElement.getFrrgrpiOrgnCode());
				ftvorgnCurrRecC.addParameter("FRBGRNT_COAS_CODE",
						frbgrntElement.getFrbgrntCoasCode());
				ftvorgnCurrRecC.open();
				ResultSet ftvorgnCurrRecCResults = ftvorgnCurrRecC.fetchInto();
				if (ftvorgnCurrRecCResults != null) {
					holdOrgnCodeDescr = ftvorgnCurrRecCResults.getStr(0);
				}
				if (ftvorgnCurrRecC.notFound()) {
					if (getTaskStatus().equals("QUERY")
							|| isNull(
									getFormModel().getFormHeader()
											.getOrgPValidateFlag(), "Y")
									.equals("N")) {
						getFormModel().getFormHeader().setOrgPValidateFlag(
								toStr("Y"));
					} else {
						alertId = findAlert("G$_PIPE_MESSAGE_ALERT");
						setAlertMessageText(alertId, warnMes);
						alertButton = toNumber(showAlert(alertId));
						if (alertButton.equals(MessageServices.BUTTON2)) {
//							message(GNls.Fget(toStr("FRAGRNT-0007"), toStr("FORM"),
//									toStr("Organization is invalid. Use LIST.")),
//									OutputMessageUserResponse.NO_ACKNOWLEDGE);
							errorMessage(GNls.Fget(toStr("FRAGRNT-0007"), toStr("FORM"),
									toStr("Organization is invalid. Use LIST.")),
									OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					}
					// Either Past (Terminated) or future records exist
					// Setting query parameters
					ftvorgnPastRecC.addParameter("FRRGRPI_ORGN_CODE",
							frrgrpiElement.getFrrgrpiOrgnCode());
					ftvorgnPastRecC.addParameter("FRBGRNT_COAS_CODE",
							frbgrntElement.getFrbgrntCoasCode());
					ftvorgnPastRecC.open();
					ResultSet ftvorgnPastRecCResults = ftvorgnPastRecC.fetchInto();
					if (ftvorgnPastRecCResults != null) {
						holdOrgnCodeDescr = ftvorgnPastRecCResults.getStr(0);
					}
					if (ftvorgnPastRecC.notFound()) {
						// Setting query parameters
						ftvorgnFutRecC.addParameter("FRRGRPI_ORGN_CODE",
								frrgrpiElement.getFrrgrpiOrgnCode());
						ftvorgnFutRecC.addParameter("FRBGRNT_COAS_CODE",
								frbgrntElement.getFrbgrntCoasCode());
						ftvorgnFutRecC.open();
						ResultSet ftvorgnFutRecCResults = ftvorgnFutRecC
								.fetchInto();
						if (ftvorgnFutRecCResults != null) {
							holdOrgnCodeDescr = ftvorgnFutRecCResults.getStr(0);
						}

					}

				}
				ftvorgnCurrRecC.close();
				executeAction("EDIT_ORGN_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				frrgrpiElement.setFrrgrpiOrgnCodeName(holdOrgnCodeDescr);
			} finally {
				ftvorgnC.close();
				ftvorgnCurrRecC.close();
				ftvorgnPastRecC.close();
				ftvorgnFutRecC.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_ID_CODE :frrgrpi_id :=
	 * ''; :frrgrpi_id_name := ''; g$_sel_spriden_id_name(:frrgrpi_id_pidm,
	 * 'FRRGRPI_ID_NAME', 'Y', :frrgrpi_id);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.GET_ID_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_ID_CODE")
	public void Fragrnt_GetIdCode() {

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		if(frrgrpiElement==null)
			return;

		frrgrpiElement.setFrrgrpiId(toStr(""));
		frrgrpiElement.setFrrgrpiIdName(toStr(""));
		Ref<NString> pId_ref = new Ref<NString>(frrgrpiElement.getFrrgrpiId());
		getTask().getGoqrpls().gSelSpridenIdName(
				frrgrpiElement.getFrrgrpiIdPidm(), toStr("FRRGRPI_ID_NAME"),
				toStr("Y"), pId_ref);
		frrgrpiElement.setFrrgrpiId(pId_ref.val);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.POST-DATABASE-COMMIT
	 * :HOLD_STATUS_CODE := :frbgrnt_STATUS_CODE; :HOLD_PI_ID_CODE :=
	 * :frbgrnt_PI_ID_CODE; :HOLD_STATUS_DATE := :frbgrnt_status_date;
	 * :form_header.hold_alt_status_desc :=
	 * :frbgrnt.frbgrnt_alternate_status_desc;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.POST-DATABASE-COMMIT
	 * 
	 * 
	 * </p>
	 */
//	@ActionTrigger(action = "POST-DATABASE-COMMIT")
	@AfterDatabaseCommit
	public void Fragrnt_PostDatabaseCommit(EventObject args) {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement==null)
			return;

		getFormModel().getFormHeader().setHoldStatusCode(
				frbgrntElement.getFrbgrntStatusCode());
		getFormModel().getFormHeader().setHoldPiIdCode(
				frbgrntElement.getFrbgrntPiIdCode());
		getFormModel().getFormHeader().setHoldStatusDate(
				frbgrntElement.getFrbgrntStatusDate());
		getFormModel().getFormHeader().setHoldAltStatusDesc(
				frbgrntElement.getFrbgrntAlternateStatusDesc());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_FRVPRST --dbms
	 * package issue DELETE FROM FRVGRST WHERE FRVGRST_grnt_CODE =
	 * :DISPLAY_frbgrnt_CODE ; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DELETE_FRVPRST
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_FRVPRST")
	public void Fragrnt_DeleteFrvprst() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FRVGRST "
				+ " WHERE FRVGRST_grnt_CODE = :DISPLAY_FRBGRNT_CODE";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_FRRGRPI --dbms
	 * package issue DELETE FROM FRRGRPI WHERE FRRGRPI_grnt_CODE =
	 * :DISPLAY_frbgrnt_CODE ; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DELETE_FRRGRPI
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_FRRGRPI")
	public void Fragrnt_DeleteFrrgrpi() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FRRGRPI "
				+ " WHERE FRRGRPI_grnt_CODE = :DISPLAY_FRBGRNT_CODE";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_LOCN --dbms package
	 * issue DELETE FROM FRRGLOC WHERE FRRGLOC_grnt_CODE = :DISPLAY_frbgrnt_CODE
	 * ; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.DELETE_LOCN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_LOCN")
	public void Fragrnt_DeleteLocn() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FRRGLOC "
				+ " WHERE FRRGLOC_grnt_CODE = :DISPLAY_FRBGRNT_CODE";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_ITEM_NAME
	 * 
	 * :HOLD_ITEM_NAME := :SYSTEM.CURSOR_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_ITEM_NAME
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_ITEM_NAME")
	public void Fragrnt_GetItemName() {

		getFormModel().getFormHeader().setHoldItemName(toStr(getCursorItem()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-NXTKEY
	 * EXECUTE_TRIGGER('GET_ITEM_NAME');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void Fragrnt_KeyNxtkey() {

		executeAction("GET_ITEM_NAME");
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_ADDR_TYPE_SEQ_NUM BEGIN
	 * IF ( :GLOBAL.QUERY_MODE = '1' ) THEN GOTO PTI_END_TRIGGER ; END IF ;
	 * DECLARE CURSOR PTI_CURSOR IS SELECT FTVAGCY_ADDR_TYPE, FTVAGCY_ADDR_SEQNO
	 * FROM FTVAGCY WHERE FTVAGCY_AGCY_CODE_PIDM = :frbgrnt_AGENCY_PIDM; BEGIN
	 * OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO :frbgrnt_AGENCY_ADDR_CODE,
	 * :frbgrnt_AGENCY_ADDR_SEQ_NUM ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL,
	 * TRUE); END ; -- << PTI_END_TRIGGER >> :GLOBAL.QUERY_MODE := '0' ;
	 * EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0' ;
	 * RAISE FORM_TRIGGER_FAILURE ; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_ADDR_TYPE_SEQ_NUM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_ADDR_TYPE_SEQ_NUM")
	public void Fragrnt_GetAddrTypeSeqNum() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		try {
			if (!(getGlobal("QUERY_MODE").equals("1"))) 
			{
				// goto PTI_END_TRIGGER;
		 // }
		 // {
				String sqlptiCursor = "SELECT FTVAGCY_ADDR_TYPE, FTVAGCY_ADDR_SEQNO "
						+ " FROM FTVAGCY "
						+ " WHERE FTVAGCY_AGCY_CODE_PIDM = :FRBGRNT_AGENCY_PIDM ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("FRBGRNT_AGENCY_PIDM",
							frbgrntElement.getFrbgrntAgencyPidm());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						frbgrntElement.setFrbgrntAgencyAddrCode(ptiCursorResults
								.getStr(0));
						frbgrntElement.setFrbgrntAgencyAddrSeqNum(ptiCursorResults
								.getNumber(1));
					}
					getTask().getGoqrpls().gCheckValue(
							toBool(ptiCursor.notFound()), toStr(null),
							toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
			// PTI_END_TRIGGER:;
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CLR_ADDR :house_number :=
	 * ''; :address_line_1 := ''; :address_line_2 := ''; :address_line_3 := '';
	 * :address_line_4 := ''; :city := ''; :state := ''; :zip_code := '';
	 * :frbgrnt_agency_phone_type := ''; :ctry_code_phone := ''; :area_code :=
	 * ''; :phone_number := ''; :extension := ''; :phone_exists := '' ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.CLR_ADDR
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CLR_ADDR")
	public void Fragrnt_ClrAddr() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		frbgrntElement.setHouseNumber(toStr(""));
		frbgrntElement.setAddressLine1(toStr(""));
		frbgrntElement.setAddressLine2(toStr(""));
		frbgrntElement.setAddressLine3(toStr(""));
		frbgrntElement.setAddressLine4(toStr(""));
		frbgrntElement.setCity(toStr(""));
		frbgrntElement.setState(toStr(""));
		frbgrntElement.setZipCode(toStr(""));
		frbgrntElement.setFrbgrntAgencyPhoneType(toStr(""));
		frbgrntElement.setCtryCodePhone(toStr(""));
		frbgrntElement.setAreaCode(toStr(""));
		frbgrntElement.setPhoneNumber(toStr(""));
		frbgrntElement.setExtension(toStr(""));
		frbgrntElement.setPhoneExists(toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CLR_ATYP
	 * :frbgrnt_AGENCY_ADDR_CODE := '' ; -- :frbgrnt_AGENCY_ADDR_SEQ_NUM := '' ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.CLR_ATYP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CLR_ATYP")
	public void Fragrnt_ClrAtyp() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frbgrntElement==null)
			return;
		
		frbgrntElement.setFrbgrntAgencyAddrCode(toStr(""));
		//
		frbgrntElement.setFrbgrntAgencyAddrSeqNum(toNumber(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_SPRADDR DECLARE CURSOR
	 * PTI_CURSOR IS SELECT spraddr_house_number, spraddr_street_line1,
	 * spraddr_street_line2, spraddr_street_line3, spraddr_street_line4,
	 * spraddr_city, spraddr_stat_code, spraddr_zip FROM SPRADDR WHERE
	 * SPRADDR_PIDM = :FRBGRNT.FRBGRNT_AGENCY_PIDM AND SPRADDR_ATYP_CODE =
	 * :FRBGRNT.FRBGRNT_AGENCY_ADDR_CODE AND SPRADDR_SEQNO =
	 * :FRBGRNT.FRBGRNT_AGENCY_ADDR_SEQ_NUM --defect: 1-3V2XSE below line
	 * changed SPRADDR_STATUS_IND = 'A' to NVL(SPRADDR_STATUS_IND,'A') != 'I'
	 * because it wasn't fetching for SPRADDR_STATUS_IND is null AND
	 * NVL(SPRADDR_STATUS_IND,'X') != 'I'; <multilinecomment>Added this line to
	 * fix the defect: 1-3V2XSE and changed the order of SPRADDR_PIDM,
	 * SPRADDR_ATYP_CODE, SPRADDR_SEQNO in where cluase</multilinecomment> BEGIN
	 * OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO :house_number, :address_line_1,
	 * :address_line_2, :address_line_3, :address_line_4, :city, :state,
	 * :zip_code ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0008', 'FORM','The Address Type and Sequence
	 * combination is Invalid or Inactive'), TRUE); <multilinecomment> 1-3V2XSE
	 * Error Msg:"Address does not exist" changed to
	 * "The Address Type and Sequence combination is Invalid or Inactive"
	 * </multilinecomment> CLOSE PTI_CURSOR; END ; -- DECLARE CURSOR PTI_CURSOR
	 * IS SELECT sprtele_ctry_code_phone, sprtele_phone_area,
	 * sprtele_phone_number, sprtele_phone_ext, sprtele_tele_code, sprtele_seqno
	 * --87631 FROM SPRTELE WHERE SPRTELE_PIDM = :frbgrnt_AGENCY_PIDM AND
	 * SPRTELE_ADDR_SEQNO = :frbgrnt_AGENCY_ADDR_SEQ_NUM AND SPRTELE_PRIMARY_IND
	 * = 'Y' AND SPRTELE_ATYP_CODE = :frbgrnt_AGENCY_ADDR_CODE ; BEGIN OPEN
	 * PTI_CURSOR ; FETCH PTI_CURSOR INTO :ctry_code_phone, :area_code,
	 * :phone_number, :extension, :frbgrnt_agency_phone_type,
	 * :frbgrnt_agency_tele_seqno ; CLOSE PTI_CURSOR; END ; -- DECLARE CURSOR
	 * PTI_CURSOR IS SELECT 'Y' FROM SPRTELE WHERE SPRTELE_PIDM =
	 * :frbgrnt_AGENCY_PIDM ; BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO
	 * :PHONE_EXISTS ; CLOSE PTI_CURSOR; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.EDIT_SPRADDR
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_SPRADDR")
	public void Fragrnt_EditSpraddr() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement.equals(null))
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT spraddr_house_number, spraddr_street_line1, spraddr_street_line2, spraddr_street_line3, spraddr_street_line4, spraddr_city, spraddr_stat_code, spraddr_zip "
								+ " FROM SPRADDR "
								+ " WHERE SPRADDR_PIDM   = :FRBGRNT_FRBGRNT_AGENCY_PIDM "
								+ "AND SPRADDR_ATYP_CODE = :FRBGRNT_FRBGRNT_AGENCY_ADDR_CODE "
								+ "AND SPRADDR_SEQNO     = :FRBGRNT_FRBGRNT_AGENCY_ADDR_SEQ_NUM "
								+ "AND NVL(SPRADDR_STATUS_IND, 'X') != 'I' ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//add parametre
				ptiCursor.addParameter("FRBGRNT_FRBGRNT_AGENCY_PIDM"		,frbgrntElement.getFrbgrntAgencyPidm());
				ptiCursor.addParameter("FRBGRNT_FRBGRNT_AGENCY_ADDR_CODE"	,frbgrntElement.getFrbgrntAgencyAddrCode());
				ptiCursor.addParameter("FRBGRNT_FRBGRNT_AGENCY_ADDR_SEQ_NUM",frbgrntElement.getFrbgrntAgencyAddrSeqNum());
				
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setHouseNumber(ptiCursorResults.getStr(0));
					frbgrntElement.setAddressLine1(ptiCursorResults.getStr(1));
					frbgrntElement.setAddressLine2(ptiCursorResults.getStr(2));
					frbgrntElement.setAddressLine3(ptiCursorResults.getStr(3));
					frbgrntElement.setAddressLine4(ptiCursorResults.getStr(4));
					frbgrntElement.setCity(ptiCursorResults.getStr(5));
					frbgrntElement.setState(ptiCursorResults.getStr(6));
					frbgrntElement.setZipCode(ptiCursorResults.getStr(7));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0008"),
										toStr("FORM"),
										toStr("The Address Type and Sequence combination is Invalid or Inactive")),
								toBool(NBool.True));
				// 1-3V2XSE Error Msg:"Address does not exist" changed to
				// "The Address Type and Sequence combination is Invalid or Inactive"
			} finally {
				ptiCursor.close();
			}
		}
		{
			String sqlptiCursor = "SELECT sprtele_ctry_code_phone, sprtele_phone_area, sprtele_phone_number, sprtele_phone_ext, sprtele_tele_code, sprtele_seqno "
								+ " FROM SPRTELE "
								+ " WHERE SPRTELE_PIDM 		= :FRBGRNT_AGENCY_PIDM "
								+ "AND SPRTELE_ADDR_SEQNO 	= :FRBGRNT_AGENCY_ADDR_SEQ_NUM "
								+ "AND SPRTELE_PRIMARY_IND 	= 'Y' "
								+ "AND SPRTELE_ATYP_CODE 	= :FRBGRNT_AGENCY_ADDR_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			
			try {
				//add parametre
				ptiCursor.addParameter("FRBGRNT_AGENCY_PIDM"		,frbgrntElement.getFrbgrntAgencyPidm());
				ptiCursor.addParameter("FRBGRNT_AGENCY_ADDR_CODE"	,frbgrntElement.getFrbgrntAgencyAddrCode());
				ptiCursor.addParameter("FRBGRNT_AGENCY_ADDR_SEQ_NUM",frbgrntElement.getFrbgrntAgencyAddrSeqNum());
				

				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setCtryCodePhone(ptiCursorResults.getStr(0));
					frbgrntElement.setAreaCode(ptiCursorResults.getStr(1));
					frbgrntElement.setPhoneNumber(ptiCursorResults.getStr(2));
					frbgrntElement.setExtension(ptiCursorResults.getStr(3));
					frbgrntElement.setFrbgrntAgencyPhoneType(ptiCursorResults
							.getStr(4));
					frbgrntElement.setFrbgrntAgencyTeleSeqno(ptiCursorResults
							.getNumber(5));
				}
			} finally {
				ptiCursor.close();
			}

		}
		{
			String sqlptiCursor = "SELECT 'Y' " 
								+ " FROM SPRTELE "
								+ " WHERE SPRTELE_PIDM = :FRBGRNT_AGENCY_PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_AGENCY_PIDM",
						frbgrntElement.getFrbgrntAgencyPidm());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setPhoneExists(ptiCursorResults.getStr(0));
				}
			} finally {
				ptiCursor.close();
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_FRRGLOC IF
	 * :FRBGRNT_COAS_CODE_IC_CS IS NULL THEN RETURN; END IF; -- IF :FRBGRNT_CODE
	 * IS NULL THEN RETURN; END IF; -- DECLARE hold_locn_code
	 * ftvlocn.ftvlocn_locn_code%type; hold_var varchar2(1); switch number := 0;
	 * -- CURSOR CHECK_FTVLOCN IS SELECT DISTINCT 'X' FROM FTVLOCN WHERE
	 * FTVLOCN_COAS_CODE IN (:FRBGRNT_COAS_CODE,:FRBGRNT_COAS_CODE_IC_CS) AND
	 * FTVLOCN_LOCN_CODE = hold_locn_code AND FTVLOCN_EFF_DATE <= SYSDATE AND
	 * FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR
	 * FTVLOCN_TERM_DATE > SYSDATE) ; -- CURSOR CHECK_FTVLOCN_1 IS SELECT
	 * DISTINCT 'X' FROM FTVLOCN WHERE FTVLOCN_COAS_CODE IN
	 * (:FRBGRNT_COAS_CODE,:FRBGRNT_COAS_CODE_IC_CS) AND FTVLOCN_LOCN_CODE =
	 * :FRRGLOC_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE
	 * > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE)
	 * ; -- CURSOR CHECK_FRRPLOC IS SELECT FRRGLOC_LOCN_CODE FROM FRRGLOC WHERE
	 * FRRGLOC_GRNT_CODE = :FRBGRNT_CODE; --
	 * 
	 * BEGIN IF :FRRGLOC.ROWID IS NULL THEN OPEN CHECK_FRRPLOC; LOOP FETCH
	 * CHECK_FRRPLOC INTO hold_locn_code; EXIT WHEN CHECK_FRRPLOC%NOTFOUND; OPEN
	 * CHECK_FTVLOCN; FETCH CHECK_FTVLOCN INTO hold_var; IF
	 * CHECK_FTVLOCN%NOTFOUND THEN CLOSE CHECK_FTVLOCN; GOTO ERR; END IF; CLOSE
	 * CHECK_FTVLOCN; END LOOP; :LOCN_ERROR_IND := 'N'; RETURN; ELSE
	 * GO_BLOCK('FRRGLOC'); FIRST_RECORD; IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
	 * switch := -1; END IF; LOOP OPEN CHECK_FTVLOCN_1; FETCH CHECK_FTVLOCN_1
	 * INTO hold_var; IF CHECK_FTVLOCN_1%NOTFOUND THEN CLOSE CHECK_FTVLOCN_1;
	 * GOTO ERR; END IF; CLOSE CHECK_FTVLOCN_1; EXIT WHEN switch = -1;
	 * NEXT_RECORD; IF :SYSTEM.LAST_RECORD = 'TRUE' THEN switch := -1; END IF;
	 * END LOOP; :LOCN_ERROR_IND := 'N'; GO_ITEM(NAME_IN('HOLD_ITEM_NAME'));
	 * RETURN; END IF;
	 * 
	 * <<ERR>> :LOCN_ERROR_IND := 'Y'; MESSAGE ( G$_NLS.Get('FRAGRNT-0009',
	 * 'FORM','Location(s) must be valid for COA on the Header or Cost
	 * Information Windows.') ); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_FRRGLOC
	 * 
	 * 
	 * </p>
	 */
	
	@ActionTrigger(action="CHECK_FRRGLOC")
	public void Fragrnt_CheckFrrgloc()
	{
		

			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
			FrrglocAdapter frrglocElement = (FrrglocAdapter)this.getFormModel().getFrrgloc().getRowAdapter(true);

			if(frbgrntElement==null ||frrglocElement==null)
				return;

			int rowCount = 0;
			if ( frbgrntElement.getFrbgrntCoasCodeIcCs().isNull() )
			{
				return ;
			}
			// 
			if ( frbgrntElement.getFrbgrntCode().isNull() )
			{
				return ;
			}
			{
				NString holdLocnCode= NString.getNull();
				NString holdVar= NString.getNull();
				NNumber _switch = toNumber(0);
				String sqlcheckFtvlocn = "SELECT DISTINCT 'X' " +
										" FROM FTVLOCN " +
										" WHERE (FTVLOCN_COAS_CODE) IN (:FRBGRNT_COAS_CODE, :FRBGRNT_COAS_CODE_IC_CS) "
									   + "AND FTVLOCN_LOCN_CODE = :P_HOLD_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE "
									   + "AND FTVLOCN_NCHG_DATE > SYSDATE "
									   + "AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
				DataCursor checkFtvlocn = new DataCursor(sqlcheckFtvlocn);
				
				String sqlcheckFtvlocn1 = "SELECT DISTINCT 'X' " +
										 " FROM FTVLOCN " +
										 " WHERE (FTVLOCN_COAS_CODE) IN (:FRBGRNT_COAS_CODE, :FRBGRNT_COAS_CODE_IC_CS) "
										+ "AND FTVLOCN_LOCN_CODE = :FRRGLOC_LOCN_CODE "
									    + "AND FTVLOCN_EFF_DATE <= SYSDATE "
									    + "AND FTVLOCN_NCHG_DATE > SYSDATE "
										+ "AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
				DataCursor checkFtvlocn1 = new DataCursor(sqlcheckFtvlocn1);
				
				String sqlcheckFrrploc = "SELECT FRRGLOC_LOCN_CODE " +
										" FROM FRRGLOC " +
										" WHERE FRRGLOC_GRNT_CODE = :FRBGRNT_CODE ";
				DataCursor checkFrrploc = new DataCursor(sqlcheckFrrploc);
				try {
					if ( frrglocElement.getRowState().equals(DataRowStatus.INSERTED))
					{
						//Setting query parameters
						checkFrrploc.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
						checkFrrploc.open();
						while (true) {
							ResultSet checkFrrplocResults = checkFrrploc.fetchInto();
							if ( checkFrrplocResults != null ) {
								holdLocnCode = checkFrrplocResults.getStr(0);
							}
							if ( checkFrrploc.notFound() ) 
								break;
							//Setting query parameters
							checkFtvlocn.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							checkFtvlocn.addParameter("FRBGRNT_COAS_CODE_IC_CS", frbgrntElement.getFrbgrntCoasCodeIcCs());
							checkFtvlocn.addParameter("P_HOLD_LOCN_CODE", holdLocnCode);
							checkFtvlocn.open();
							ResultSet checkFtvlocnResults = checkFtvlocn.fetchInto();
							if ( checkFtvlocnResults != null ) {
								holdVar = checkFtvlocnResults.getStr(0);
							}
							if ( checkFtvlocn.notFound() )
							{
	//							 goto ERR;
								getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
//								message(GNls.Fget(toStr("FRAGRNT-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
								errorMessage(GNls.Fget(toStr("FRAGRNT-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
								throw new ApplicationException();
							}
						}
						getFormModel().getFormHeader().setLocnErrorInd(toStr("N"));
						return ;
					}
					else {
						try{
						goBlock(toStr("FRRGLOC"));
						firstRecord();
						}
						catch(ApplicationException e){}
						if ( isInLastRecord() )
						{
							_switch = toNumber(- (1));
						}
						while (true) {
							
							checkFtvlocn1.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							checkFtvlocn1.addParameter("FRBGRNT_COAS_CODE_IC_CS", frbgrntElement.getFrbgrntCoasCodeIcCs());
							checkFtvlocn1.addParameter("FRRGLOC_LOCN_CODE", frrglocElement.getFrrglocLocnCode());
							checkFtvlocn1.open();
							ResultSet checkFtvlocn1Results = checkFtvlocn1.fetchInto();
							if ( checkFtvlocn1Results != null ) {
								holdVar = checkFtvlocn1Results.getStr(0);
							}
							if ( checkFtvlocn1.notFound() )
							{
								getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
								errorMessage(GNls.Fget(toStr("FRAGRNT-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
								throw new ApplicationException();
							}
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
				} finally {
					checkFtvlocn.close();
					checkFtvlocn1.close();
					checkFrrploc.close();
				}
//				 ERR:;
//				getFormModel().getFormHeader().setLocnErrorInd(toStr("Y"));
//				message(GNls.Fget(toStr("FRAGRNT-0009"), toStr("FORM"), toStr("Location(s) must be valid for COA on the Header or Cost Information Windows.")));
//				throw new ApplicationException();
			}
		}
	
	
	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_IC_CS if
	 * :frbgrnt_basi_code_ic is not null then if :frbgrnt_indr_code_rate is null
	 * then message( G$_NLS.Get('FRAGRNT-0010', 'FORM','All IC/CS Codes must be
	 * entered when some IC/CS Information is present.') ); Raise
	 * Form_Trigger_Failure; end if; if :frbgrnt_inda_code_charge is null then
	 * message( G$_NLS.Get('FRAGRNT-0011', 'FORM','All IC/CS Codes must be
	 * entered when some IC/CS Information is present.') ); Raise
	 * Form_Trigger_Failure; end if; if :frbgrnt_indd_code_distr is null then
	 * message( G$_NLS.Get('FRAGRNT-0012', 'FORM','All IC/CS Codes must be
	 * entered when some IC/CS Information is present.') ); Raise
	 * Form_Trigger_Failure; end if; end if; -- if :frbgrnt_basi_code_cs is not
	 * null then if :frbgrnt_cstr_code_rate is null then message(
	 * G$_NLS.Get('FRAGRNT-0013', 'FORM','All IC/CS Codes must be entered when
	 * some IC/CS Information is present.') ); Raise Form_Trigger_Failure; end
	 * if; if :frbgrnt_csta_code_charge is null then message(
	 * G$_NLS.Get('FRAGRNT-0014', 'FORM','All IC/CS Codes must be entered when
	 * some IC/CS Information is present.') ); Raise Form_Trigger_Failure; end
	 * if; if :frbgrnt_cstd_code_distr is null then message(
	 * G$_NLS.Get('FRAGRNT-0015', 'FORM','All IC/CS Codes must be entered when
	 * some IC/CS Information is present.') ); Raise Form_Trigger_Failure; end
	 * if; end if;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_IC_CS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_IC_CS")
	public void Fragrnt_EditBasiCodeIcCs() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			if (!frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
				if (frbgrntElement.getFrbgrntIndrCodeRate().isNull()) {
//					message(GNls
//							.Fget(toStr("FRAGRNT-0010"),
//									toStr("FORM"),
//									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0010"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
				if (frbgrntElement.getFrbgrntIndaCodeCharge().isNull()) {
//					message(GNls
//							.Fget(toStr("FRAGRNT-0011"),
//									toStr("FORM"),
//									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0011"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
				if (frbgrntElement.getFrbgrntInddCodeDistr().isNull()) {
//					message(GNls
//							.Fget(toStr("FRAGRNT-0012"),
//									toStr("FORM"),
//									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0012"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
			}
			//
			if (!frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
				if (frbgrntElement.getFrbgrntCstrCodeRate().isNull()) {
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0013"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
				if (frbgrntElement.getFrbgrntCstaCodeCharge().isNull()) {
//					message(GNls
//							.Fget(toStr("FRAGRNT-0014"),
//									toStr("FORM"),
//									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0014"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
				if (frbgrntElement.getFrbgrntCstdCodeDistr().isNull()) {
//					message(GNls
//							.Fget(toStr("FRAGRNT-0015"),
//									toStr("FORM"),
//									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0015"),
									toStr("FORM"),
									toStr("All IC/CS Codes must be entered when some IC/CS Information is present.")));
					throw new ApplicationException();
				}
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.FORCE_COMMIT IF
	 * G$_QUERY_ONLY_ROLE THEN RETURN; END IF;
	 * 
	 * IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN EXECUTE_TRIGGER(
	 * 'EDIT_ORGN_SEC_FOR_COMMIT' ) ; IF Form_Success THEN :COMMIT_IND := 'Y';
	 * :SYSTEM.MESSAGE_LEVEL := '5'; COMMIT_FORM; G$_CHECK_FAILURE;
	 * :SYSTEM.MESSAGE_LEVEL := '0'; IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
	 * :COMMIT_IND := 'N'; RAISE FORM_TRIGGER_FAILURE; END IF; :COMMIT_IND :=
	 * 'N'; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.FORCE_COMMIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "FORCE_COMMIT")
	public void Fragrnt_ForceCommit() {

	
		
		
		if (getTask().getGoqrpls().gQueryOnlyRole().getValue()) {
			return;
		}
		if (getTaskStatus().equals("CHANGED")) {
			executeAction("EDIT_ORGN_SEC_FOR_COMMIT");

			try {
				getFormModel().getFormHeader().setCommitInd(toStr("Y"));
				try { 
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					FrrgrpiAdapter frrgrpielement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter();
					if(frrgrpielement.getFrrgrpiIdInd().isNull()){
						return;
					}
					commitTask();
				getTask().getGoqrpls().gCheckFailure();
				} finally {
							
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
							
				if (!getTaskStatus().equals("QUERY")) {
					getFormModel().getFormHeader().setCommitInd(toStr("N"));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setCommitInd(toStr("N"));

			} catch (Exception e) {
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-COMMIT
	 * EXECUTE_TRIGGER('GET_ITEM_NAME');
	 * 
	 * EXECUTE_TRIGGER('CHECK_FRRGLOC'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('RE_EDIT'); G$_CHECK_FAILURE; -- IF
	 * :FRBGRNT_EFF_CERT_REQUIRED_IND = 'Y' AND NAME_IN('GLOBAL.HRESYS') = 'Y'
	 * THEN IF CHECK_ACCT_ELE_VAL = 'N' THEN MESSAGE( G$_NLS.Get('FRAGRNT-0016',
	 * 'FORM','*WARNING* No entries exist for Effort Reporting.') ); END IF;
	 * <multilinecomment>EXECUTE_TRIGGER('CHECK_ACCT_ELMNT_VAL');
	 * G$_CHECK_FAILURE; </multilinecomment> END IF; --
	 * 
	 * IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN EXECUTE_TRIGGER(
	 * 'EDIT_ORGN_SEC_FOR_COMMIT' ) ; G$_CHECK_FAILURE ; :COMMIT_IND := 'Y';
	 * COMMIT_FORM; G$_CHECK_FAILURE; IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
	 * :COMMIT_IND := 'N'; RAISE FORM_TRIGGER_FAILURE; END IF; :COMMIT_IND :=
	 * 'N'; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void Fragrnt_Save() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		FrrgrecAdapter frrgrecElement = (FrrgrecAdapter) this.getFormModel()
				.getFrrgrec().getRowAdapter(true);

		if(frbgrntElement==null || frrgrecElement==null)
			return;
		executeAction("GET_ITEM_NAME");
		
		
		executeAction("CHECK_FRRGLOC");	
		
		
		getTask().getGoqrpls().gCheckFailure();

		
		
		
		//
		executeAction("RE_EDIT");
		getTask().getGoqrpls().gCheckFailure();
		//
		if (frbgrntElement.getFrbgrntEffCertRequiredInd().equals("Y")
				&& getNameIn("GLOBAL.HRESYS").equals("Y")) {
			if (this.getTask().getServices().checkAcctEleVal(frrgrecElement)
					.equals("N")) {
				warningMessage(GNls
						.Fget(toStr("FRAGRNT-0016"),
								toStr("FORM"),
								toStr("*WARNING* No entries exist for Effort Reporting.")));
			}
		}
		//
		if (getTaskStatus().equals("CHANGED")) {
			executeAction("EDIT_ORGN_SEC_FOR_COMMIT");
			getTask().getGoqrpls().gCheckFailure();
			getFormModel().getFormHeader().setCommitInd(toStr("Y"));
			commitTask();
			getTask().getGoqrpls().gCheckFailure();
			if (!getTaskStatus().equals("QUERY")) {
				getFormModel().getFormHeader().setCommitInd(toStr("N"));
				throw new ApplicationException();
			}
			getFormModel().getFormHeader().setCommitInd(toStr("N"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_EVENT DECLARE
	 * --var_user_id fobprof.FOBPROF_USER_ID%type; var_user_id
	 * gobeacc.gobeacc_username%type; CURSOR C1 IS --SELECT fobprof_user_id --
	 * FROM fobprof --WHERE fobprof_pidm = :frrgrpi_id_pidm;
	 * 
	 * SELECT gobeacc_username FROM gobeacc WHERE gobeacc_pidm =
	 * :frrgrpi_id_pidm; BEGIN IF :FRRGRPI_ID IS NULL THEN MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0017', 'FORM','The ID of an individual associated
	 * with the grant must be entered in order to navigate to FRIEVNG.') );
	 * 
	 * go_item('frrgrpi_id'); return; END IF; OPEN C1; FETCH C1 INTO
	 * var_user_id; IF C1%NOTFOUND THEN MESSAGE( G$_NLS.Get('FRAGRNT-0018',
	 * 'FORM', 'No User ID Found for ID: %01%' , :frrgrpi_id)); RAISE
	 * FORM_TRIGGER_FAILURE; CLOSE C1; ELSE :GLOBAL.form_was_called := 'Y';
	 * :global.grnt_code := :frbgrnt_code; :global.event_userid := var_user_id;
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRIEVNG', ' ');
	 * :GLOBAL.form_was_called := ''; CLOSE C1; end if; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_EVENT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_EVENT")
	public void Fragrnt_CallFormEvent() {

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frrgrpiElement==null || frbgrntElement==null)
			return;
		
		int rowCount = 0;
		{
			// var_user_id fobprof.FOBPROF_USER_ID%type;
			NString varUserId = NString.getNull();
			String sqlc1 = "SELECT gobeacc_username " + " FROM gobeacc "
					+ " WHERE gobeacc_pidm = :FRRGRPI_ID_PIDM ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				if (frrgrpiElement.getFrrgrpiId().isNull()) {
					warningMessage(GNls
							.Fget(toStr("FRAGRNT-0017"),
									toStr("FORM"),
									toStr("The ID of an individual associated with the grant must be entered in order to navigate to FRIEVNG.")));
					goItem(toStr("frrgrpi_id"));
					return;
				}
				// Setting query parameters
				c1.addParameter("FRRGRPI_ID_PIDM",
						frrgrpiElement.getFrrgrpiIdPidm());
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					varUserId = c1Results.getStr(0);
				}
				if (c1.notFound()) {
					warningMessage(GNls.Fget(toStr("FRAGRNT-0018"), toStr("FORM"),
							toStr("No User ID Found for ID: %01%"),
							frrgrpiElement.getFrrgrpiId()));
					throw new ApplicationException();
				} else {
					setGlobal("FORM_WAS_CALLED", toStr("Y"));
					setGlobal("GRNT_CODE", frbgrntElement.getFrbgrntCode());
					setGlobal("EVENT_USERID", varUserId);
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls()
							.gSecuredFormCall(getGlobal("CURRENT_USER"),
									toStr("FRIEVNG"), toStr(" "));
					setGlobal("FORM_WAS_CALLED", toStr(""));
				}
			} finally {
				c1.close();
			}
			
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRIEVNP
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * :GLOBAL.FORM_WAS_CALLED := 'Y'; :GLOBAL.grnt_CODE :=
	 * :DISPLAY_FRBGRNT_CODE; :GLOBAL.ID_NO:= :FRRGRPI_ID;
	 * HIDE_WINDOW('NAVIGATE_TO'); EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRIEVNP','');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.ID_NO := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRIEVNP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRIEVNP")
	public void Fragrnt_CallFormFrievnp() {

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		if(frrgrpiElement==null)
			return;

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		setGlobal("ID_NO", frrgrpiElement.getFrrgrpiId());
		hideWindow("NAVIGATE_TO");
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRIEVNP"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr("N"));
		setGlobal("ID_NO", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRAEVNP
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * :GLOBAL.FORM_WAS_CALLED := 'Y'; :GLOBAL.GRNT_CODE :=
	 * :DISPLAY_FRBGRNT_CODE; HIDE_WINDOW('NAVIGATE_TO');
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRAEVNP','');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.grnt_CODE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRAEVNP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRAEVNP")
	public void Fragrnt_CallFormFraevnp() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		hideWindow("NAVIGATE_TO");
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRAEVNP"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr("N"));
		setGlobal("GRNT_CODE", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRABUDG
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * HIDE_WINDOW('NAVIGATE_TO'); :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * :GLOBAL.GRNT_CODE := :DISPLAY_FRBGRNT_CODE;
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRABUDG','');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.grnt_CODE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRABUDG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRABUDG")
	public void Fragrnt_CallFormFrabudg() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		hideWindow("NAVIGATE_TO");
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRABUDG"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr("N"));
		setGlobal("GRNT_CODE", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRIGRST
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * HIDE_WINDOW('NAVIGATE_TO'); :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * :GLOBAL.GRNT_CODE := :DISPLAY_FRBGRNT_CODE;
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRIGRST','');
	 * :GLOBAL.FORM_WAS_CALLED := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRIGRST
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRIGRST")
	public void Fragrnt_CallFormFrigrst() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		hideWindow("NAVIGATE_TO");
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRIGRST"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRMFUND
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * HIDE_WINDOW('NAVIGATE_TO'); :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * :GLOBAL.GRNT_CODE := :DISPLAY_FRBGRNT_CODE;
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRMFUND','');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.grnt_CODE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRMFUND
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRMFUND")
	public void Fragrnt_CallFormFrmfund() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		hideWindow("NAVIGATE_TO");
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRMFUND"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr("N"));
		setGlobal("GRNT_CODE", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FOATEXT
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE; :GLOBAL.DOC_NUM :=
	 * :DISPLAY_FRBGRNT_CODE; :GLOBAL.DOC_SEQ := '51';
	 * HIDE_WINDOW('NAVIGATE_TO'); EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOATEXT','');
	 * EXECUTE_TRIGGER('CHECK_TEXT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FOATEXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FOATEXT")
	public void Fragrnt_CallFormFoatext() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		setGlobal("DOC_NUM", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		setGlobal("DOC_SEQ", toStr("51"));
		hideWindow("NAVIGATE_TO");
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FOATEXT"), toStr(""));
		executeAction("CHECK_TEXT");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FOAETXT IF
	 * :FRRGRPI_ID IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0019', 'FORM','The
	 * ID of an individual associated with the grant must be entered in order to
	 * navigate to FOAETXT.') );
	 * 
	 * go_item('frrgrpi_id'); return; END IF;
	 * 
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE; :GLOBAL.KEY_IDNO :=
	 * :FRRGRPI_ID; :GLOBAL.PRIMARY_DOC_NUM := :DISPLAY_FRBGRNT_CODE;
	 * :GLOBAL.PRIMARY_DOC_SEQ := '51'; EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOAETXT','');
	 * G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FOAETXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FOAETXT")
	public void Fragrnt_CallFormFoaetxt() {

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		if(frrgrpiElement==null)
			return;

		if (frrgrpiElement.getFrrgrpiId().isNull()) {
			warningMessage(GNls
					.Fget(toStr("FRAGRNT-0019"),
							toStr("FORM"),
							toStr("The ID of an individual associated with the grant must be entered in order to navigate to FOAETXT.")));
			goItem(toStr("frrgrpi_id"));
			return;
		}
		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		setGlobal("KEY_IDNO", frrgrpiElement.getFrrgrpiId());
		setGlobal("PRIMARY_DOC_NUM", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		setGlobal("PRIMARY_DOC_SEQ", toStr("51"));
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FOAETXT"), toStr(""));
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRAEVGA
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * :GLOBAL.FORM_WAS_CALLED := 'Y'; :GLOBAL.GRNT_CODE :=
	 * :DISPLAY_FRBGRNT_CODE; EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRAEVGA','');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.grnt_CODE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRAEVGA
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRAEVGA")
	public void Fragrnt_CallFormFraevga() {

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("check_frrgloc");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRAEVGA"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr("N"));
		setGlobal("GRNT_CODE", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ENABLE_BUTTONS_AFTER_PASSW
	 * IF GET_ITEM_PROPERTY('frbgrnt_STATUS_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_STATUS_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_grant_TYPE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_grant_TYPE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_CATEGORY_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_CATEGORY_LBT',ENABLED,PROPERTY_ON); END IF; --
	 * IF GET_ITEM_PROPERTY('frbgrnt_SUB_CATEGORY_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_SUB_CATEGORY_LBT',ENABLED,PROPERTY_ON); END
	 * IF; -- IF GET_ITEM_PROPERTY('frbgrnt_CFDA_CODE_LBT',ENABLED) = 'FALSE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_CFDA_CODE_LBT',ENABLED,PROPERTY_ON); END
	 * IF; -- IF GET_ITEM_PROPERTY('COPY_grnt',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('COPY_grnt',ENABLED,PROPERTY_ON); END IF; --
	 * 
	 * IF GET_ITEM_PROPERTY('frbgrnt_PI_ID_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_PI_ID_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_AGENCY_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_AGENCY_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * -- IF GET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED,PROPERTY_ON); END IF; --
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.ENABLE_BUTTONS_AFTER_PASSW
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_BUTTONS_AFTER_PASSW")
	public void Fragrnt_EnableButtonsAfterPassw() {

		if (getItemEnabled("frbgrnt_STATUS_CODE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_STATUS_CODE_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_grant_TYPE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_grant_TYPE_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_CATEGORY_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_CATEGORY_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_SUB_CATEGORY_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_SUB_CATEGORY_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_CFDA_CODE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_CFDA_CODE_LBT", true);
		}
		//
		if (getItemEnabled("COPY_grnt").equals("FALSE")) {
			setItemEnabled("COPY_grnt", true);
		}
		//
		if (getItemEnabled("frbgrnt_PI_ID_CODE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_PI_ID_CODE_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_AGENCY_CODE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_AGENCY_CODE_LBT", true);
		}
		//
		if (getItemEnabled("NAVIGATE_TO_BTN").equals("FALSE")) {
			setItemEnabled("NAVIGATE_TO_BTN", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_STATUS_CODE_DATE if
	 * :frbgrnt_status_code is not null and :frbgrnt_status_date is null then
	 * message( G$_NLS.Get('FRAGRNT-0020', 'FORM','Grant Status Date must be
	 * entered.') ); Raise Form_Trigger_Failure; end if; -- if
	 * :frbgrnt_status_code is null and :frbgrnt_status_date is not null then
	 * message( G$_NLS.Get('FRAGRNT-0021', 'FORM','Grant Status Code must be
	 * entered.') ); Raise Form_Trigger_Failure; end if;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_STATUS_CODE_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_STATUS_CODE_DATE")
	public void Fragrnt_CheckStatusCodeDate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntStatusCode().isNull()
				&& frbgrntElement.getFrbgrntStatusDate().isNull()) {
			errorMessage(GNls.Fget(toStr("FRAGRNT-0020"), toStr("FORM"),
					toStr("Grant Status Date must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntStatusCode().isNull()
				&& !frbgrntElement.getFrbgrntStatusDate().isNull()) {
			findItem("FRBGRNT_STATUS_DATE").setValid(false);
			errorMessage(GNls.Fget(toStr("FRAGRNT-0021"), toStr("FORM"),
					toStr("Grant Status Code must be entered.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_HISTORY 
	 * IF :frbgrnt_STATUS_CODE IS NULL 
	 * THEN GOTO TRIG_EXIT; 
	 * END IF; -- <<
	 * ins_ftvgrst >> -- INSERT_FRVGRST_1; G$_CHECK_VALUE (SQL%NOTFOUND, NULL,
	 * TRUE); -- << TRIG_EXIT >> NULL ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.GET_HISTORY
	 * 
	 * 
	 * </p>
	 */

	
	@ActionTrigger(action="GET_HISTORY")
	public void Fragrnt_GetHistory()
	{
		

//			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
//
//
//			if ( frbgrntElement.getFrbgrntStatusCode().isNull() )
//			{
//				 goto TRIG_EXIT;
//			}
//			 INS_FTVGRST:;
//			// 
//			this.getTask().getServices().insertFrvgrst1(frbgrntElement);
//			getTask().getGoqrpls().gCheckValue(rowCount == 0, toStr(null), toBool(NBool.True));
//			 TRIG_EXIT:;
		
		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;
		
		int rowCount = 1;
		if ( frbgrntElement.getFrbgrntStatusCode().isNull() )
		{
			// goto TRIG_EXIT;
		}
		// INS_FTVGRST:;
		// 
		else
		{
			this.getTask().getServices().insertFrvgrst1(frbgrntElement);
			getTask().getGoqrpls().gCheckValue(toBool(rowCount == 0), toStr(null), toBool(NBool.True));
		}
		//TRIG_EXIT:;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.VALIDATE_USER_FIELDS
	 * 
	 * declare hold_title frvsdat.frvsdat_title%type; field_value
	 * frvsdat.frvsdat_sdat_code_opt_1%type; value_to varchar2(50); cursor c1 is
	 * select frvsdat_title from frvsdat where frvsdat_sdat_code_attr =
	 * :FRRgusn_SDAT_CODE_ATTR and frvsdat_sdat_code_opt_1 = field_value;
	 * 
	 * begin field_value := NAME_IN(:SYSTEM.TRIGGER_ITEM); open c1; fetch c1
	 * into hold_title; value_to :=
	 * GET_ITEM_PROPERTY(:SYSTEM.TRIGGER_ITEM,NEXTITEM);
	 * COPY(hold_title,value_to); if c1%notfound then message(
	 * G$_NLS.Get('FRAGRNT-0022', 'FORM','Value Code is invalid. LIST is
	 * available.') ); close c1; raise form_trigger_failure; end if; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.VALIDATE_USER_FIELDS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "VALIDATE_USER_FIELDS")
	public void Fragrnt_ValidateUserFields() {

		FrrgusnAdapter frrgusnElement = (FrrgusnAdapter) this.getFormModel()
				.getFrrgusn().getRowAdapter(true);

		if(frrgusnElement == null)
			return;
		
		int rowCount = 0;
		{
			//MORPHIS TODO MP fieldvalue logic removed.. if the trigger item was CodeAttr and not CodeOpt1 (as in the form start) the description field would never be populated giving the error constntly 
			NString holdTitle = NString.getNull();
		//	NString fieldValue = NString.getNull();
			NString valueTo = NString.getNull();
		 	String sqlc1 = "SELECT frvsdat_title "
					+ " FROM frvsdat "
					+ " WHERE frvsdat_sdat_code_attr = :FRRGUSN_SDAT_CODE_ATTR AND frvsdat_sdat_code_opt_1 = :P_FIELD_VALUE ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				//fieldValue = getNameIn(getTriggerItem());
				// Setting query parameters
				c1.addParameter("FRRGUSN_SDAT_CODE_ATTR", frrgusnElement.getFrrgusnSdatCodeAttr());
				c1.addParameter("P_FIELD_VALUE", frrgusnElement.getFrrgusnSdatCodeOpt1());// fieldValue);
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					holdTitle = c1Results.getStr(0);
				}
//				valueTo = toStr(getItemNextItem(getTriggerItem()));
				valueTo=toStr(getItemNextItem(toStr("FRRGUSN_SDAT_CODE_OPT_1")));
 				copy(holdTitle, valueTo);
				if (c1.notFound()) {
//					message(GNls.Fget(toStr("FRAGRNT-0022"), toStr("FORM"),
//							toStr("Value Code is invalid. LIST is available.")));
					errorMessage(GNls.Fget(toStr("FRAGRNT-0022"), toStr("FORM"),
							toStr("Value Code is invalid. LIST is available.")));
					throw new ApplicationException();
				}
			} finally {
				c1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_USER_FIELDS declare val
	 * varchar2(50); begin for i in 1..10 loop val :=
	 * 'frbgrnt_USER_CODE_'||to_char(i)||'_LIT'; if NAME_IN(val) is not null
	 * then exit; end if; end loop; end; -- declare cursor get_user_fields is
	 * select ftvsdat_title from ftvsdat where ftvsdat_sdat_code_entity =
	 * 'frbgrnt' and ftvsdat_sdat_code_attr = 'USER_CODE_LITERALS' and
	 * ftvsdat_eff_date <= sysdate and (ftvsdat_nchg_date is null or
	 * ftvsdat_nchg_date > sysdate) and ftvsdat_status_ind = 'A'; -- counter
	 * number := 0; title ftvsdat.ftvsdat_title%type; field_name varchar2(50) :=
	 * ''; begin open get_user_fields; loop fetch get_user_fields into title; if
	 * get_user_fields%notfound then exit; else counter := counter +1; if
	 * counter > 10 then exit; end if; field_name :=
	 * 'frbgrnt_USER_CODE_'||to_char(counter)||'_LIT'; COPY(title,field_name);
	 * end if; end loop; close get_user_fields; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_USER_FIELDS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_USER_FIELDS")
	public void Fragrnt_GetUserFields() {

		int rowCount = 0;
		{
			NString val = NString.getNull();
			for (int i = 1; i <= 10; i++) {
				val = toStr("frbgrnt_USER_CODE_").append(toChar(i)).append(
						"_LIT");
				if (!getNameIn(val).isNull()) {
					break;
				}
			}
		}
		{
			String sqlgetUserFields = "SELECT ftvsdat_title "
					+ " FROM ftvsdat "
					+ " WHERE ftvsdat_sdat_code_entity = 'frbgrnt' AND ftvsdat_sdat_code_attr = 'USER_CODE_LITERALS' AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
			DataCursor getUserFields = new DataCursor(sqlgetUserFields);
			try {
				//
				NNumber counter = toNumber(0);
				NString title = NString.getNull();
				NString fieldName = toStr("");
				getUserFields.open();
				while (true) {
					ResultSet getUserFieldsResults = getUserFields.fetchInto();
					if (getUserFieldsResults != null) {
						title = getUserFieldsResults.getStr(0);
					}
					if (getUserFields.notFound()) {
						break;
					} else {
						counter = counter.add(1);
						if (counter.greater(10)) {
							break;
						}
						fieldName = toStr("frbgrnt_USER_CODE_").append(
								toChar(counter)).append("_LIT");
						copy(title, fieldName);
					}
				}
			} finally {
				getUserFields.close();
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_CSTA_CODE_CHARGE BEGIN
	 * IF :frbgrnt_CSTA_CODE_CHARGE IS NULL THEN RETURN; END IF; -- DECLARE
	 * CURSOR PTI_CURSOR IS SELECT FRVCSTA_DESC FROM FRVCSTA WHERE FRVCSTA_CODE
	 * = :frbgrnt_CSTA_CODE_CHARGE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :frbgrnt_CSTA_CODE_CHARGE_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0023', 'FORM',' Cost Share Credit Account Code is
	 * invalid; LIST is available.') , TRUE); END; -- DECLARE PTI_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM FRBCSTA WHERE
	 * FRBCSTA_EFF_DATE <= SYSDATE AND (FRBCSTA_NCHG_DATE IS NULL OR
	 * FRBCSTA_NCHG_DATE > SYSDATE) AND (FRBCSTA_TERM_DATE IS NULL OR
	 * FRBCSTA_TERM_DATE > SYSDATE) AND FRBCSTA_COAS_CODE =
	 * :frbgrnt_COAS_CODE_IC_CS AND FRBCSTA_CODE = :frbgrnt_CSTA_CODE_CHARGE;
	 * BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0024', 'FORM',' Cost Share
	 * Credit Account Code is invalid; LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_CSTA_CODE_CHARGE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_CSTA_CODE_CHARGE")
	public void Fragrnt_EditCstaCodeCharge() {


		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			

		int rowCount = 0;
		if (frbgrntElement.getFrbgrntCstaCodeCharge().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT FRVCSTA_DESC " + " FROM FRVCSTA "
					+ " WHERE FRVCSTA_CODE = :FRBGRNT_CSTA_CODE_CHARGE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_CSTA_CODE_CHARGE",frbgrntElement.getFrbgrntCstaCodeCharge());
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setFrbgrntCstaCodeChargeName(ptiCursorResults
							.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0023"),
										toStr("FORM"),
										toStr(" Cost Share Credit Account Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
			
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRBCSTA "
					+ " WHERE FRBCSTA_EFF_DATE <= SYSDATE AND (FRBCSTA_NCHG_DATE IS NULL OR FRBCSTA_NCHG_DATE > SYSDATE) AND (FRBCSTA_TERM_DATE IS NULL OR FRBCSTA_TERM_DATE > SYSDATE) AND FRBCSTA_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS AND FRBCSTA_CODE = :FRBGRNT_CSTA_CODE_CHARGE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
						frbgrntElement.getFrbgrntCoasCodeIcCs());
				ptiCursor.addParameter("FRBGRNT_CSTA_CODE_CHARGE",
						frbgrntElement.getFrbgrntCstaCodeCharge());
	
	
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0024"),
										toStr("FORM"),
										toStr(" Cost Share Credit Account Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_CSTD_CODE_DISTR BEGIN
	 * IF :frbgrnt_CSTD_CODE_DISTR IS NULL THEN RETURN; END IF; -- DECLARE
	 * CURSOR PTI_CURSOR IS SELECT FRVCSTD_DESC FROM FRVCSTD WHERE FRVCSTD_CODE
	 * = :frbgrnt_CSTD_CODE_DISTR; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :frbgrnt_CSTD_CODE_DISTR_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0025', 'FORM',' Cost Share Distribution Code is
	 * invalid; LIST is available.') , TRUE); END; -- DECLARE PTI_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM FRBCSTD WHERE
	 * FRBCSTD_EFF_DATE <= SYSDATE AND (FRBCSTD_NCHG_DATE IS NULL OR
	 * FRBCSTD_NCHG_DATE > SYSDATE) AND (FRBCSTD_TERM_DATE IS NULL OR
	 * FRBCSTD_TERM_DATE > SYSDATE) AND FRBCSTD_COAS_CODE =
	 * :frbgrnt_COAS_CODE_IC_CS AND FRBCSTD_CODE = :frbgrnt_CSTD_CODE_DISTR;
	 * BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0026', 'FORM',' Cost Share
	 * Distribution Code is invalid; LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_CSTD_CODE_DISTR
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_CSTD_CODE_DISTR")
	public void Fragrnt_EditCstdCodeDistr() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if (frbgrntElement==null)
			return;
		
		int rowCount = 0;
		if (frbgrntElement.getFrbgrntCstdCodeDistr().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT FRVCSTD_DESC " + " FROM FRVCSTD "
					+ " WHERE FRVCSTD_CODE = :FRBGRNT_CSTD_CODE_DISTR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_CSTD_CODE_DISTR", frbgrntElement.getFrbgrntCstdCodeDistr());
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setFrbgrntCstdCodeDistrName(ptiCursorResults
							.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0025"),
										toStr("FORM"),
										toStr(" Cost Share Distribution Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRBCSTD "
					+ " WHERE FRBCSTD_EFF_DATE <= SYSDATE AND (FRBCSTD_NCHG_DATE IS NULL OR FRBCSTD_NCHG_DATE > SYSDATE) AND (FRBCSTD_TERM_DATE IS NULL OR FRBCSTD_TERM_DATE > SYSDATE) AND FRBCSTD_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS AND FRBCSTD_CODE = :FRBGRNT_CSTD_CODE_DISTR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
						frbgrntElement.getFrbgrntCoasCodeIcCs());
				ptiCursor.addParameter("FRBGRNT_CSTD_CODE_DISTR",
						frbgrntElement.getFrbgrntCstdCodeDistr());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0026"),
										toStr("FORM"),
										toStr(" Cost Share Distribution Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally{
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_COAS_CODE_IC_CS_SOFT
	 * IF :frbgrnt_COAS_CODE_IC_CS IS NULL THEN IF :frbgrnt_BASI_CODE_IC IS NOT
	 * NULL OR :frbgrnt_BASI_CODE_CS IS NOT NULL THEN MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0027', 'FORM','Chart of Accounts must be entered for
	 * Grant I/C Information.') ); Raise Form_Trigger_Failure; END IF; END IF;
	 * -- IF :frbgrnt_COAS_CODE_IC_CS IS NOT NULL THEN IF (:frbgrnt_BASI_CODE_IC
	 * IS NULL AND :frbgrnt_BASI_CODE_CS IS NULL) THEN MESSAGE (
	 * G$_NLS.Get('FRAGRNT-0028', 'FORM','I/C or C/S Information must be entered
	 * when I/C & C/S Chart of Accounts is entered.') ); Raise
	 * Form_Trigger_Failure; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_COAS_CODE_IC_CS_SOFT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_COAS_CODE_IC_CS_SOFT")
	public void Fragrnt_EditCoasCodeIcCsSoft() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (frbgrntElement.getFrbgrntCoasCodeIcCs().isNull()) 
		{
			if (!frbgrntElement.getFrbgrntBasiCodeIc().isNull()|| !frbgrntElement.getFrbgrntBasiCodeCs().isNull()) 
			{
//				message(GNls
//						.Fget(toStr("FRAGRNT-0027"),
//								toStr("FORM"),
//								toStr("Chart of Accounts must be entered for Grant I/C Information.")));
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0027"),
								toStr("FORM"),
								toStr("Chart of Accounts must be entered for Grant I/C Information.")));
				throw new ApplicationException();
			}
		}
		//
		if (!frbgrntElement.getFrbgrntCoasCodeIcCs().isNull())
		{
			if ((frbgrntElement.getFrbgrntBasiCodeIc().isNull() && frbgrntElement.getFrbgrntBasiCodeCs().isNull())) 
			{
//				message(GNls
//						.Fget(toStr("FRAGRNT-0028"),
//								toStr("FORM"),
//								toStr("I/C or C/S Information must be entered when I/C & C/S Chart of Accounts is entered.")));
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0028"),
								toStr("FORM"),
								toStr("I/C or C/S Information must be entered when I/C & C/S Chart of Accounts is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_COST_SHARE_ITEMS IF
	 * :frbgrnt_BASI_CODE_CS IS NOT NULL THEN IF :frbgrnt_CSTR_CODE_RATE IS NULL
	 * AND :frbgrnt_CSTA_CODE_CHARGE IS NULL OR :frbgrnt_CSTD_CODE_DISTR IS NULL
	 * THEN GO_ITEM('frbgrnt_CSTR_CODE_RATE'); Message(
	 * G$_NLS.Get('FRAGRNT-0029', 'FORM','Cost Share Rate Code must be
	 * entered.') ); Raise Form_Trigger_Failure; END IF; END IF; -- IF
	 * :frbgrnt_INDR_CODE_RATE IS NULL AND (:frbgrnt_CSTA_CODE_CHARGE IS NOT
	 * NULL OR :frbgrnt_CSTD_CODE_DISTR IS NOT NULL) THEN
	 * GO_ITEM('frbgrnt_CSTR_CODE_RATE'); Message( G$_NLS.Get('FRAGRNT-0030',
	 * 'FORM','Cost Share Rate Code must be entered.') ); Raise
	 * Form_Trigger_Failure; END IF; -- IF :frbgrnt_CSTA_CODE_CHARGE IS NULL AND
	 * (:frbgrnt_CSTR_CODE_RATE IS NOT NULL OR :frbgrnt_CSTD_CODE_DISTR IS NOT
	 * NULL) THEN GO_ITEM('frbgrnt_CSTA_CODE_CHARGE'); Message(
	 * G$_NLS.Get('FRAGRNT-0031', 'FORM','Cost Share Code must be entered.') );
	 * Raise Form_Trigger_Failure; END IF; -- IF :frbgrnt_CSTD_CODE_DISTR IS
	 * NULL AND (:frbgrnt_CSTA_CODE_CHARGE IS NOT NULL OR
	 * :frbgrnt_CSTR_CODE_RATE IS NOT NULL) THEN
	 * GO_ITEM('frbgrnt_CSTD_CODE_DISTR'); Message( G$_NLS.Get('FRAGRNT-0032',
	 * 'FORM','Cost Share Distribution Code must be entered.') ); Raise
	 * Form_Trigger_Failure; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_COST_SHARE_ITEMS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_COST_SHARE_ITEMS")
	public void Fragrnt_CheckCostShareItems() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			
		if (!frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
			if (frbgrntElement.getFrbgrntCstrCodeRate().isNull()
					&& frbgrntElement.getFrbgrntCstaCodeCharge().isNull()
					|| frbgrntElement.getFrbgrntCstdCodeDistr().isNull()) {
				goItem(toStr("frbgrnt_CSTR_CODE_RATE"));
//				message(GNls.Fget(toStr("FRAGRNT-0029"), toStr("FORM"),
//						toStr("Cost Share Rate Code must be entered.")));
				errorMessage(GNls.Fget(toStr("FRAGRNT-0029"), toStr("FORM"),
						toStr("Cost Share Rate Code must be entered.")));
				throw new ApplicationException();
			}
		}
		//
		if (frbgrntElement.getFrbgrntIndrCodeRate().isNull()
				&& (!frbgrntElement.getFrbgrntCstaCodeCharge().isNull() || !frbgrntElement
						.getFrbgrntCstdCodeDistr().isNull())) {
			goItem(toStr("frbgrnt_CSTR_CODE_RATE"));
//			message(GNls.Fget(toStr("FRAGRNT-0030"), toStr("FORM"),
//					toStr("Cost Share Rate Code must be entered.")));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0030"), toStr("FORM"),
					toStr("Cost Share Rate Code must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntCstaCodeCharge().isNull()
				&& (!frbgrntElement.getFrbgrntCstrCodeRate().isNull() || !frbgrntElement
						.getFrbgrntCstdCodeDistr().isNull())) {
			goItem(toStr("frbgrnt_CSTA_CODE_CHARGE"));
//			message(GNls.Fget(toStr("FRAGRNT-0031"), toStr("FORM"),
//					toStr("Cost Share Code must be entered.")));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0031"), toStr("FORM"),
					toStr("Cost Share Code must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntCstdCodeDistr().isNull()
				&& (!frbgrntElement.getFrbgrntCstaCodeCharge().isNull() || !frbgrntElement
						.getFrbgrntCstrCodeRate().isNull())) {
			goItem(toStr("frbgrnt_CSTD_CODE_DISTR"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0032"), toStr("FORM"),
					toStr("Cost Share Distribution Code must be entered.")));
			throw new ApplicationException();
		}
		
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_INDIRECT_COST_ITEMS
	 * IF :frbgrnt_BASI_CODE_IC IS NOT NULL THEN IF :frbgrnt_INDR_CODE_RATE IS
	 * NULL AND :frbgrnt_INDA_CODE_CHARGE IS NULL OR :frbgrnt_INDD_CODE_DISTR IS
	 * NULL THEN GO_ITEM('frbgrnt_INDR_CODE_RATE'); Message(
	 * G$_NLS.Get('FRAGRNT-0033', 'FORM','Indirect Cost Rate Code must be
	 * entered.') ); Raise Form_Trigger_Failure; END IF; END IF; -- IF
	 * :frbgrnt_INDR_CODE_RATE IS NULL AND (:frbgrnt_INDA_CODE_CHARGE IS NOT
	 * NULL OR :frbgrnt_INDD_CODE_DISTR IS NOT NULL) THEN
	 * GO_ITEM('frbgrnt_INDR_CODE_RATE'); Message( G$_NLS.Get('FRAGRNT-0034',
	 * 'FORM','Indirect Cost Rate Code must be entered.') ); Raise
	 * Form_Trigger_Failure; END IF; -- IF :frbgrnt_INDA_CODE_CHARGE IS NULL AND
	 * (:frbgrnt_INDR_CODE_RATE IS NOT NULL OR :frbgrnt_INDD_CODE_DISTR IS NOT
	 * NULL) THEN GO_ITEM('frbgrnt_INDA_CODE_CHARGE'); Message(
	 * G$_NLS.Get('FRAGRNT-0035', 'FORM','Indirect Cost Charge Code must be
	 * entered.') ); Raise Form_Trigger_Failure; END IF; -- IF
	 * :frbgrnt_INDD_CODE_DISTR IS NULL AND (:frbgrnt_INDA_CODE_CHARGE IS NOT
	 * NULL OR :frbgrnt_INDR_CODE_RATE IS NOT NULL) THEN
	 * GO_ITEM('frbgrnt_INDD_CODE_DISTR'); Message( G$_NLS.Get('FRAGRNT-0036',
	 * 'FORM','Indirect Cost Distribution Code must be entered.') ); Raise
	 * Form_Trigger_Failure; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_INDIRECT_COST_ITEMS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_INDIRECT_COST_ITEMS")
	public void Fragrnt_CheckIndirectCostItems() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
			if (frbgrntElement.getFrbgrntIndrCodeRate().isNull()
					&& frbgrntElement.getFrbgrntIndaCodeCharge().isNull()
					|| frbgrntElement.getFrbgrntInddCodeDistr().isNull()) {
				goItem(toStr("frbgrnt_INDR_CODE_RATE"));
				errorMessage(GNls.Fget(toStr("FRAGRNT-0033"), toStr("FORM"),
						toStr("Indirect Cost Rate Code must be entered.")));
				throw new ApplicationException();
			}
		}
		//
		if (frbgrntElement.getFrbgrntIndrCodeRate().isNull()
				&& (!frbgrntElement.getFrbgrntIndaCodeCharge().isNull() || !frbgrntElement
						.getFrbgrntInddCodeDistr().isNull())) {
			goItem(toStr("frbgrnt_INDR_CODE_RATE"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0034"), toStr("FORM"),
					toStr("Indirect Cost Rate Code must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntIndaCodeCharge().isNull()
				&& (!frbgrntElement.getFrbgrntIndrCodeRate().isNull() || !frbgrntElement
						.getFrbgrntInddCodeDistr().isNull())) {
			goItem(toStr("frbgrnt_INDA_CODE_CHARGE"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0035"), toStr("FORM"),
					toStr("Indirect Cost Charge Code must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntInddCodeDistr().isNull()
				&& (!frbgrntElement.getFrbgrntIndaCodeCharge().isNull() || !frbgrntElement
						.getFrbgrntIndrCodeRate().isNull())) {
			goItem(toStr("frbgrnt_INDD_CODE_DISTR"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0036"), toStr("FORM"),
					toStr("Indirect Cost Distribution Code must be entered.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_INDD_CODE_DISTR BEGIN
	 * IF :frbgrnt_INDD_CODE_DISTR IS NULL THEN RETURN; END IF; -- DECLARE
	 * CURSOR PTI_CURSOR IS SELECT FRVINDD_DESC FROM FRVINDD WHERE FRVINDD_CODE
	 * = :frbgrnt_INDD_CODE_DISTR; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :frbgrnt_INDD_CODE_DISTR_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0037', 'FORM','Indirect Cost Distribution Code is
	 * invalid; LIST is available.') , TRUE); END; -- DECLARE PTI_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM FRBINDD WHERE
	 * FRBINDD_EFF_DATE <= SYSDATE AND (FRBINDD_NCHG_DATE IS NULL OR
	 * FRBINDD_NCHG_DATE > SYSDATE) AND (FRBINDD_TERM_DATE IS NULL OR
	 * FRBINDD_TERM_DATE > SYSDATE) AND FRBINDD_COAS_CODE =
	 * :frbgrnt_COAS_CODE_IC_CS AND FRBINDD_CODE = :frbgrnt_INDD_CODE_DISTR;
	 * BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0038', 'FORM','Indirect Cost
	 * Distribution Code is invalid; LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_INDD_CODE_DISTR
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_INDD_CODE_DISTR")
	public void Fragrnt_EditInddCodeDistr() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;


		int rowCount = 0;
		if (frbgrntElement.getFrbgrntInddCodeDistr().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT FRVINDD_DESC " + " FROM FRVINDD "
					+ " WHERE FRVINDD_CODE = :FRBGRNT_INDD_CODE_DISTR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_INDD_CODE_DISTR", frbgrntElement.getFrbgrntInddCodeDistr());
				
				ptiCursor.addParameter("FRBGRNT_INDD_CODE_DISTR", frbgrntElement.getFrbgrntInddCodeDistr());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setFrbgrntInddCodeDistrName(ptiCursorResults
							.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0037"),
										toStr("FORM"),
										toStr("Indirect Cost Distribution Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}

		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRBINDD "
					+ " WHERE FRBINDD_EFF_DATE <= SYSDATE AND (FRBINDD_NCHG_DATE IS NULL OR FRBINDD_NCHG_DATE > SYSDATE) AND (FRBINDD_TERM_DATE IS NULL OR FRBINDD_TERM_DATE > SYSDATE) AND FRBINDD_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS AND FRBINDD_CODE = :FRBGRNT_INDD_CODE_DISTR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
						frbgrntElement.getFrbgrntCoasCodeIcCs());
				ptiCursor.addParameter("FRBGRNT_INDD_CODE_DISTR",
						frbgrntElement.getFrbgrntInddCodeDistr());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0038"),
										toStr("FORM"),
										toStr("Indirect Cost Distribution Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_INDA_CODE_CHARGE BEGIN
	 * IF :frbgrnt_INDA_CODE_CHARGE IS NULL THEN RETURN; END IF; -- DECLARE
	 * CURSOR PTI_CURSOR IS SELECT FRVINDA_DESC FROM FRVINDA WHERE FRVINDA_CODE
	 * = :frbgrnt_INDA_CODE_CHARGE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :frbgrnt_INDA_CODE_CHARGE_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0039', 'FORM','Indirect Cost Charge Code is invalid;
	 * LIST is available.') , TRUE); END; -- DECLARE PTI_TEMP VARCHAR2(1);
	 * CURSOR PTI_CURSOR IS SELECT 'X' FROM FRBINDA WHERE FRBINDA_EFF_DATE <=
	 * SYSDATE AND (FRBINDA_NCHG_DATE IS NULL OR FRBINDA_NCHG_DATE > SYSDATE)
	 * AND (FRBINDA_TERM_DATE IS NULL OR FRBINDA_TERM_DATE > SYSDATE) AND
	 * FRBINDA_COAS_CODE = :frbgrnt_COAS_CODE_IC_CS AND FRBINDA_CODE =
	 * :frbgrnt_INDA_CODE_CHARGE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * PTI_TEMP; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0040',
	 * 'FORM','Indirect Cost Charge Code is invalid; LIST is available.') ,
	 * TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_INDA_CODE_CHARGE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_INDA_CODE_CHARGE")
	public void Fragrnt_EditIndaCodeCharge() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		//int rowCount = 0;
		if (frbgrntElement.getFrbgrntIndaCodeCharge().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT FRVINDA_DESC " + " FROM FRVINDA "
					+ " WHERE FRVINDA_CODE = :FRBGRNT_INDA_CODE_CHARGE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_INDA_CODE_CHARGE", frbgrntElement.getFrbgrntIndaCodeCharge());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) 
				{
					frbgrntElement.setFrbgrntIndaCodeChargeName(ptiCursorResults.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0039"),
										toStr("FORM"),
										toStr("Indirect Cost Charge Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRBINDA "
					+ " WHERE FRBINDA_EFF_DATE <= SYSDATE AND (FRBINDA_NCHG_DATE IS NULL OR FRBINDA_NCHG_DATE > SYSDATE) AND (FRBINDA_TERM_DATE IS NULL OR FRBINDA_TERM_DATE > SYSDATE) AND FRBINDA_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS AND FRBINDA_CODE = :FRBGRNT_INDA_CODE_CHARGE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS" , frbgrntElement.getFrbgrntCoasCodeIcCs());
				ptiCursor.addParameter("FRBGRNT_INDA_CODE_CHARGE", frbgrntElement.getFrbgrntIndaCodeCharge());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0040"),
										toStr("FORM"),
										toStr("Indirect Cost Charge Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_CSTR_CODE_RATE BEGIN
	 * IF :FRBGRNT_CSTR_CODE_RATE IS NULL THEN RETURN; END IF; -- DECLARE CURSOR
	 * PTI_CURSOR IS SELECT FRVCSTR_DESC FROM FRVCSTR WHERE FRVCSTR_CODE =
	 * :FRBGRNT_CSTR_CODE_RATE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :FRBGRNT_CSTR_CODE_RATE_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0041', 'FORM',' Cost Share Rate Code is invalid; LIST
	 * is available.') , TRUE); END; -- DECLARE PTI_TEMP VARCHAR2(1); CURSOR
	 * PTI_CURSOR IS SELECT 'X' FROM FRRCSTR WHERE FRRCSTR_EFF_DATE <= SYSDATE
	 * AND (FRRCSTR_NCHG_DATE IS NULL OR FRRCSTR_NCHG_DATE > SYSDATE) AND
	 * (FRRCSTR_TERM_DATE IS NULL OR FRRCSTR_TERM_DATE > SYSDATE) AND
	 * FRRCSTR_CODE = :FRBGRNT_CSTR_CODE_RATE; BEGIN OPEN PTI_CURSOR; FETCH
	 * PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0042', 'FORM',' Cost Share Rate Code is invalid; LIST
	 * is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_CSTR_CODE_RATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_CSTR_CODE_RATE")
	public void Fragrnt_EditCstrCodeRate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			
		}		int rowCount = 0;
		if (frbgrntElement.getFrbgrntCstrCodeRate().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT FRVCSTR_DESC " + " FROM FRVCSTR "
					+ " WHERE FRVCSTR_CODE = :FRBGRNT_CSTR_CODE_RATE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_CSTR_CODE_RATE", frbgrntElement.getFrbgrntCstrCodeRate());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setFrbgrntCstrCodeRateName(ptiCursorResults.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0041"),
										toStr("FORM"),
										toStr(" Cost Share Rate Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRRCSTR "
					+ " WHERE FRRCSTR_EFF_DATE <= SYSDATE AND (FRRCSTR_NCHG_DATE IS NULL OR FRRCSTR_NCHG_DATE > SYSDATE) AND (FRRCSTR_TERM_DATE IS NULL OR FRRCSTR_TERM_DATE > SYSDATE) AND FRRCSTR_CODE = :FRBGRNT_CSTR_CODE_RATE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_CSTR_CODE_RATE",frbgrntElement.getFrbgrntCstrCodeRate());
	
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0042"),
										toStr("FORM"),
										toStr(" Cost Share Rate Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.RE_EDIT BEGIN --1-BMV7IL
	 * :FORM_HEADER.ORG_VALIDATE_FLAG := 'N'; :FORM_HEADER.ORG_P_VALIDATE_FLAG
	 * := 'N'; -- EXECUTE_TRIGGER('EDIT_COAS_CODE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_ORGN_CODE'); G$_CHECK_FAILURE;
	 * 
	 * -- Fix for defect # 1-8KTK2 begins
	 * EXECUTE_TRIGGER('VALIDATE_AGENCY_CODE'); G$_CHECK_FAILURE;
	 * 
	 * IF :SYSTEM.FORM_STATUS = 'QUERY' THEN
	 * EXECUTE_TRIGGER('VALIDATE_CFDA_CODE'); G$_CHECK_FAILURE; END IF; -- Fix
	 * for defect # 1-8KTK2 ends
	 * 
	 * --1-BMV7IL EXECUTE_TRIGGER('EDIT_PERSON_ID'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('EDIT_COAS_CODE_IC_CS_SOFT'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_COAS_CODE_IC_CS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_CS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_1'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_2'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_IC_SOFT_3'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_IC'); -- G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_INDR_CODE_RATE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_INDA_CODE_CHARGE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_INDD_CODE_DISTR'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_1'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_2'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_CS_SOFT_3'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_BASI_CODE_CS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_CSTR_CODE_RATE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_CSTA_CODE_CHARGE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('EDIT_CSTD_CODE_DISTR'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('CHECK_STATUS_CODE_DATE'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('TEST_PROJECT_END_DATE'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('TEST_EXPENDITURE_DATE'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('TEST_TERM_DATE'); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.RE_EDIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "RE_EDIT")
	public void Fragrnt_ReEdit() {

		// 1-BMV7IL
		getFormModel().getFormHeader().setOrgValidateFlag(toStr("N"));
		getFormModel().getFormHeader().setOrgPValidateFlag(toStr("N"));
		//
		executeAction("EDIT_COAS_CODE");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("EDIT_ORGN_CODE");
		getTask().getGoqrpls().gCheckFailure();
		// Fix for defect # 1-8KTK2 begins
		executeAction("VALIDATE_AGENCY_CODE");
		getTask().getGoqrpls().gCheckFailure();
		if (getTaskStatus().equals("QUERY")) {
			executeAction("VALIDATE_CFDA_CODE");
			getTask().getGoqrpls().gCheckFailure();
		}
		// Fix for defect # 1-8KTK2 ends
		// 1-BMV7IL
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
		// G$_CHECK_FAILURE;
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
		executeAction("TEST_PROJECT_END_DATE");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("TEST_EXPENDITURE_DATE");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("TEST_TERM_DATE");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_START_DATE IF
	 * determine_in_budget_table then if :hold_start_date <>
	 * :frbgrnt_project_start_date then message( G$_NLS.Get('FRAGRNT-0043',
	 * 'FORM','Project Start Date cannot be changed when Grant exists in the
	 * Grant Ledger table.') ); raise form_trigger_failure; end if; end if;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_START_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_START_DATE")
	public void Fragrnt_EditStartDate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (this.getTask().getServices().determineInBudgetTable().getValue()) {
			if (frbgrntElement.getHoldStartDate().notEquals(
					frbgrntElement.getFrbgrntProjectStartDate())) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0043"),
								toStr("FORM"),
								toStr("Project Start Date cannot be changed when Grant exists in the Grant Ledger table.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_IC_SOFT_1
	 * BEGIN IF :frbgrnt_INDR_CODE_RATE IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_IC IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0044',
	 * 'FORM','I/C Basis Code is required if a I/C Rate Code is entered.') );
	 * RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_IC_SOFT_1
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_IC_SOFT_1")
	public void Fragrnt_EditBasiCodeIcSoft1() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntIndrCodeRate().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0044"),
								toStr("FORM"),
								toStr("I/C Basis Code is required if a I/C Rate Code is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_CS_SOFT_1
	 * BEGIN IF :frbgrnt_CSTR_CODE_RATE IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_CS IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0045',
	 * 'FORM','C/S Basis Code is required if a C/S Rate Code is entered.') );
	 * RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_CS_SOFT_1
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_CS_SOFT_1")
	public void Fragrnt_EditBasiCodeCsSoft1() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {

		if (!frbgrntElement.getFrbgrntCstrCodeRate().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0045"),
								toStr("FORM"),
								toStr("C/S Basis Code is required if a C/S Rate Code is entered.")));
				throw new ApplicationException();
			}
		}
	}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_CS_SOFT_2
	 * BEGIN IF :frbgrnt_CSTA_CODE_CHARGE IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_CS IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0046',
	 * 'FORM','C/S Basis Code is required if a C/S Credit Account Code is
	 * entered.') ); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_CS_SOFT_2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_CS_SOFT_2")
	public void Fragrnt_EditBasiCodeCsSoft2() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntCstaCodeCharge().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0046"),
								toStr("FORM"),
								toStr("C/S Basis Code is required if a C/S Credit Account Code is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_CS_SOFT_3
	 * BEGIN IF :frbgrnt_CSTD_CODE_DISTR IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_CS IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0047',
	 * 'FORM','C/S Basis Code is required if a C/S Distribution Code is
	 * entered.') ); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_CS_SOFT_3
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_CS_SOFT_3")
	public void Fragrnt_EditBasiCodeCsSoft3() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntCstdCodeDistr().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0047"),
								toStr("FORM"),
								toStr("C/S Basis Code is required if a C/S Distribution Code is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_IC_SOFT_2
	 * BEGIN IF :frbgrnt_INDA_CODE_CHARGE IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_IC IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0048',
	 * 'FORM','I/C Basis Code is required if a I/C Charge Code is entered.') );
	 * RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_IC_SOFT_2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_IC_SOFT_2")
	public void Fragrnt_EditBasiCodeIcSoft2() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntIndaCodeCharge().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0048"),
								toStr("FORM"),
								toStr("I/C Basis Code is required if a I/C Charge Code is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_IC_SOFT_3
	 * BEGIN IF :frbgrnt_INDD_CODE_DISTR IS NOT NULL THEN IF
	 * :frbgrnt_BASI_CODE_IC IS NULL THEN MESSAGE( G$_NLS.Get('FRAGRNT-0049',
	 * 'FORM','I/C Basis Code is required if a I/C Distribution Code is
	 * entered.') ); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_IC_SOFT_3
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_IC_SOFT_3")
	public void Fragrnt_EditBasiCodeIcSoft3() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (!frbgrntElement.getFrbgrntInddCodeDistr().isNull()) {
			if (frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
				errorMessage(GNls
						.Fget(toStr("FRAGRNT-0049"),
								toStr("FORM"),
								toStr("I/C Basis Code is required if a I/C Distribution Code is entered.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_INDR_CODE_RATE BEGIN
	 * IF :frbgrnt_INDR_CODE_RATE IS NULL THEN RETURN; END IF; -- DECLARE CURSOR
	 * PTI_CURSOR IS SELECT FRVINDR_DESC FROM FRVINDR WHERE FRVINDR_CODE =
	 * :frbgrnt_INDR_CODE_RATE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :frbgrnt_INDR_CODE_RATE_NAME; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0050', 'FORM','Indirect Cost Rate Code is invalid;
	 * LIST is available.') , TRUE); END; -- DECLARE PTI_TEMP VARCHAR2(1);
	 * CURSOR PTI_CURSOR IS SELECT 'X' FROM FRRINDR WHERE FRRINDR_EFF_DATE <=
	 * SYSDATE AND (FRRINDR_NCHG_DATE IS NULL OR FRRINDR_NCHG_DATE > SYSDATE)
	 * AND (FRRINDR_TERM_DATE IS NULL OR FRRINDR_TERM_DATE > SYSDATE) AND
	 * FRRINDR_CODE = :frbgrnt_INDR_CODE_RATE; BEGIN OPEN PTI_CURSOR; FETCH
	 * PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0051', 'FORM','Indirect Cost Rate Code is invalid;
	 * LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_INDR_CODE_RATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_INDR_CODE_RATE")
	public void Fragrnt_EditIndrCodeRate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		//int rowCount = 0;
		if (frbgrntElement.getFrbgrntIndrCodeRate().isNull()) 
			return;
		
		{
			String sqlptiCursor = "SELECT FRVINDR_DESC " + " FROM FRVINDR "
					+ " WHERE FRVINDR_CODE = :FRBGRNT_INDR_CODE_RATE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_INDR_CODE_RATE",frbgrntElement.getFrbgrntIndrCodeRate());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) 
				{
					frbgrntElement.setFrbgrntIndrCodeRateName(ptiCursorResults
							.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0050"),
										toStr("FORM"),
										toStr("Indirect Cost Rate Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRRINDR "
					+ " WHERE FRRINDR_EFF_DATE <= SYSDATE AND (FRRINDR_NCHG_DATE IS NULL OR FRRINDR_NCHG_DATE > SYSDATE) AND (FRRINDR_TERM_DATE IS NULL OR FRRINDR_TERM_DATE > SYSDATE) AND FRRINDR_CODE = :FRBGRNT_INDR_CODE_RATE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_INDR_CODE_RATE",
						frbgrntElement.getFrbgrntIndrCodeRate());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0051"),
										toStr("FORM"),
										toStr("Indirect Cost Rate Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_CS BEGIN IF
	 * :frbgrnt_BASI_CODE_CS IS NULL THEN RETURN; END IF; -- DECLARE PTI_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT FRVBASI_DESC FROM FRVBASI WHERE
	 * FRVBASI_CODE = :frbgrnt_BASI_CODE_CS AND FRVBASI_TYPE = 'C'; BEGIN OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO :frbgrnt_BASI_CODE_CS_NAME;
	 * G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0052',
	 * 'FORM','Cost Share Basis Code is invalid; LIST is available.') , TRUE);
	 * END; -- DECLARE PTI_TEMP VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X'
	 * FROM FRBBASI WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE IS
	 * NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR
	 * FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :frbgrnt_BASI_CODE_CS AND
	 * FRBBASI_COAS_CODE = :frbgrnt_COAS_CODE_IC_CS; BEGIN OPEN PTI_CURSOR;
	 * FETCH PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0053', 'FORM','Cost Share Basis Code is not
	 * effective; LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_CS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_CS")
	public void Fragrnt_EditBasiCodeCs() {


		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			

		int rowCount = 0;
		if (frbgrntElement.getFrbgrntBasiCodeCs().isNull()) {
			return;
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT FRVBASI_DESC "
					+ " FROM FRVBASI "
					+ " WHERE FRVBASI_CODE = :FRBGRNT_BASI_CODE_CS AND FRVBASI_TYPE = 'C' ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_BASI_CODE_CS",frbgrntElement.getFrbgrntBasiCodeCs());
	
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					frbgrntElement.setFrbgrntBasiCodeCsName(ptiCursorResults
							.getStr(0));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0052"),
										toStr("FORM"),
										toStr("Cost Share Basis Code is invalid;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		{
			NString ptiTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM FRBBASI "
					+ " WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE IS NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :FRBGRNT_BASI_CODE_CS AND FRBBASI_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_BASI_CODE_CS",
						frbgrntElement.getFrbgrntBasiCodeCs());
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
						frbgrntElement.getFrbgrntCoasCodeIcCs());
	
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0053"),
										toStr("FORM"),
										toStr("Cost Share Basis Code is not effective;  LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_BASI_CODE_IC BEGIN IF
	 * :FRBGRNT_BASI_CODE_IC IS NULL THEN RETURN; END IF; -- DECLARE PTI_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT FRVBASI_DESC FROM FRVBASI WHERE
	 * FRVBASI_CODE = :FRBGRNT_BASI_CODE_IC AND FRVBASI_TYPE = 'I'; BEGIN OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO :FRBGRNT_BASI_CODE_IC_NAME;
	 * G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND, G$_NLS.Get('FRAGRNT-0054',
	 * 'FORM','Indirect Cost Basis Code is invalid; LIST is available.') ,
	 * TRUE); END; -- DECLARE PTI_TEMP VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT
	 * 'X' FROM FRBBASI WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE
	 * IS NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR
	 * FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :frbgrnt_BASI_CODE_IC AND
	 * FRBBASI_COAS_CODE = :frbgrnt_COAS_CODE_IC_CS; BEGIN OPEN PTI_CURSOR;
	 * FETCH PTI_CURSOR INTO PTI_TEMP; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0055', 'FORM','Indirect Cost Basis Code is not
	 * effective; LIST is available.') , TRUE); END; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_BASI_CODE_IC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_BASI_CODE_IC")
	public void Fragrnt_EditBasiCodeIc() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			int rowCount = 0;
			if (frbgrntElement.getFrbgrntBasiCodeIc().isNull()) {
				return;
			}
			{
				NString ptiTemp = NString.getNull();
				String sqlptiCursor = "SELECT FRVBASI_DESC "
						+ " FROM FRVBASI "
						+ " WHERE FRVBASI_CODE = :FRBGRNT_BASI_CODE_IC AND FRVBASI_TYPE = 'I' ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("FRBGRNT_BASI_CODE_IC",
							frbgrntElement.getFrbgrntBasiCodeIc());
					
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						frbgrntElement.setFrbgrntBasiCodeIcName(ptiCursorResults
								.getStr(0));
					}
					getTask()
							.getGoqrpls()
							.gCheckValue(
									toBool(ptiCursor.notFound()),
									GNls.Fget(
											toStr("FRAGRNT-0054"),
											toStr("FORM"),
											toStr("Indirect Cost Basis Code is invalid;  LIST is available.")),
									toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
			{
				NString ptiTemp = NString.getNull();
				String sqlptiCursor = "SELECT 'X' "
						+ " FROM FRBBASI "
						+ " WHERE FRBBASI_EFF_DATE <= SYSDATE AND (FRBBASI_NCHG_DATE IS NULL OR FRBBASI_NCHG_DATE > SYSDATE) AND (FRBBASI_TERM_DATE IS NULL OR FRBBASI_TERM_DATE > SYSDATE) AND FRBBASI_CODE = :FRBGRNT_BASI_CODE_IC AND FRBBASI_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("FRBGRNT_BASI_CODE_IC",
							frbgrntElement.getFrbgrntBasiCodeIc());
					ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
							frbgrntElement.getFrbgrntCoasCodeIcCs());
	
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						ptiTemp = ptiCursorResults.getStr(0);
					}
					getTask()
							.getGoqrpls()
							.gCheckValue(
									toBool(ptiCursor.notFound()),
									GNls.Fget(
											toStr("FRAGRNT-0055"),
											toStr("FORM"),
											toStr("Indirect Cost Basis Code is not effective;  LIST is available.")),
									toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_COAS_CODE_IC_CS IF
	 * :frbgrnt_COAS_CODE_IC_CS IS NULL THEN RETURN; END IF; -- DECLARE CURSOR
	 * PTI_CURSOR IS SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'),
	 * FTVCOAS_STATUS_IND FROM FTVCOAS WHERE FTVCOAS_COAS_CODE =
	 * :frbgrnt_COAS_CODE_IC_CS AND FTVCOAS_EFF_DATE <= SYSDATE AND
	 * FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR
	 * FTVCOAS_TERM_DATE > SYSDATE); BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR
	 * INTO :WORKFLD, :WORK_STATUS_IND ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0056', 'FORM','Chart of Accounts is invalid; LIST is
	 * available.') , TRUE); END ; -- EXECUTE_TRIGGER( 'TEST_TABLE_STATUS' ) ;
	 * G$_CHECK_VALUE (NOT FORM_SUCCESS, G$_NLS.Get('FRAGRNT-0057',
	 * 'FORM','Chart of Accounts is not Active.') , TRUE); :WORK_STATUS_IND :=
	 * ''; -- EXECUTE_TRIGGER( 'TEST_TABLE_TERM' ) ; G$_CHECK_VALUE (NOT
	 * FORM_SUCCESS, G$_NLS.Get('FRAGRNT-0058', 'FORM','Chart of Accounts is
	 * Terminated.') , TRUE); :WORKFLD := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_COAS_CODE_IC_CS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_COAS_CODE_IC_CS")
	public void Fragrnt_EditCoasCodeIcCs() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		if (frbgrntElement.getFrbgrntCoasCodeIcCs().isNull()) {
			return;
		}
		{
			String sqlptiCursor = "SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVCOAS_STATUS_IND "
					+ " FROM FTVCOAS "
					+ " WHERE FTVCOAS_COAS_CODE = :FRBGRNT_COAS_CODE_IC_CS AND FTVCOAS_EFF_DATE <= SYSDATE AND FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR FTVCOAS_TERM_DATE > SYSDATE) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE_IC_CS",
						frbgrntElement.getFrbgrntCoasCodeIcCs());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					getFormModel().getFormHeader().setWorkfld(
							ptiCursorResults.getStr(0));
					getFormModel().getFormHeader().setWorkStatusInd(
							ptiCursorResults.getStr(1));
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0056"),
										toStr("FORM"),
										toStr("Chart of Accounts is invalid; LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
		}
		//
		try {
			executeAction("TEST_TABLE_STATUS");
		} catch (Exception e) {
			
			 errorMessage(GNls.Fget(toStr("FRAGRNT-0057"), toStr("FORM"), toStr("Chart of Accounts is not Active."), toStr(NBool.True)));
			 throw new ApplicationException();
		}
		getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
		//
		try {
			executeAction("TEST_TABLE_TERM");
		} catch (Exception e) {
			 warningMessage(GNls.Fget(toStr("FRAGRNT-0058"), toStr("FORM"), toStr("Chart of Accounts is Terminated."), toStr(NBool.True)));
		}
		getFormModel().getFormHeader().setWorkfld(toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN_WINDOW_ACTIVATED_TRG
	 * IF :SYSTEM.EVENT_WINDOW IS NULL OR :SYSTEM.EVENT_WINDOW <>
	 * 'G$_OPT_WINDOW' THEN G$_SET_WIN_PROPERTY; G$_SET_INST_PROPERTY; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void Fragrnt_WhenWindowActivatedTrg() {

		if (getCurrentWindow() == null
				|| getCurrentWindow().notEquals("G$_OPT_WINDOW")) {
			getTask().getGoqrpls().gSetWinProperty();
			getTask().getGoqrpls().gSetInstProperty();
		}
		if(getCurrentBlock().equals("G$_EXTENDED_SEARCH_BLOCK")){
			findItem("FRRGRPI_ID").setValid(true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CLOSE_WINDOWS
	 * SET_WINDOW_PROPERTY('LOCATION_INFO',VISIBLE,PROPERTY_OFF);
	 * SET_WINDOW_PROPERTY('COST_SHARE_INFO',VISIBLE,PROPERTY_OFF);
	 * SET_WINDOW_PROPERTY('USER_CODES_INFO',VISIBLE,PROPERTY_OFF);
	 * SET_WINDOW_PROPERTY('BILLING_INFO',VISIBLE,PROPERTY_OFF);
	 * SET_WINDOW_PROPERTY('AGENCY_INFO',VISIBLE,PROPERTY_OFF);
	 * SET_WINDOW_PROPERTY('PERSONNEL_INFO',VISIBLE,PROPERTY_OFF);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CLOSE_WINDOWS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CLOSE_WINDOWS")
	public void Fragrnt_CloseWindows() {

		
		ViewServices.hideWindow("LOCATION_INFO");
		
		ViewServices.hideWindow("COST_SHARE_INFO");
		
		ViewServices.hideWindow("USER_CODES_INFO");
		
		ViewServices.hideWindow("BILLING_INFO");

		ViewServices.hideWindow("AGENCY_INFO");
		
		ViewServices.hideWindow("PERSONNEL_INFO");
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_LOCN_CODE << R >>
	 * DECLARE coas_code frbgrnt.frbgrnt_coas_code%type; CURSOR PTI_CURSOR IS
	 * SELECT FTVLOCN_TITLE, FTVLOCN_STATUS_IND FROM FTVLOCN WHERE
	 * FTVLOCN_COAS_CODE IN (:frbgrnt_COAS_CODE, coas_code) AND
	 * FTVLOCN_LOCN_CODE = :FRRgloc_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE
	 * AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR
	 * FTVLOCN_TERM_DATE > SYSDATE) ; BEGIN coas_code :=
	 * NVL(:frbgrnt_COAS_CODE_IC_CS,:frbgrnt_COAS_CODE); OPEN PTI_CURSOR ; FETCH
	 * PTI_CURSOR INTO :FRRgloc_LOCN_TITLE, :FORM_HEADER.WORK_STATUS_IND ; IF
	 * PTI_CURSOR%NOTFOUND THEN GOTO F_LOCN_1 ; ELSE GOTO S_LOCN_1 ; END IF ;
	 * END ; -- << F_LOCN_1 >> MESSAGE ( G$_NLS.Get('FRAGRNT-0059',
	 * 'FORM','Location Code is invalid; LIST is available.') );
	 * :FORM_HEADER.WORK_STATUS_IND := ''; RAISE FORM_TRIGGER_FAILURE ; -- <<
	 * S_LOCN_1 >> IF G$_NCHK(:FORM_HEADER.WORK_STATUS_IND <> 'A') THEN MESSAGE
	 * ( G$_NLS.Get('FRAGRNT-0060', 'FORM','Location entered is not active. LIST
	 * is available.') ); :FORM_HEADER.WORK_STATUS_IND := ''; RAISE
	 * FORM_TRIGGER_FAILURE ; END IF ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_LOCN_CODE
	 * 
	 * 
	 * </p>
	 */
//	@ActionTrigger(action = "EDIT_LOCN_CODE")
//	public void Fragrnt_EditLocnCode() {
//
//		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
//				.getFrbgrnt().getRowAdapter(true);
//		FrrglocAdapter frrglocElement = (FrrglocAdapter) this.getFormModel()
//				.getFrrgloc().getRowAdapter(true);
//
//		int rowCount = 0;
//		R:
//		;
//		{
//			NString coasCode = NString.getNull();
//			String sqlptiCursor = "SELECT FTVLOCN_TITLE, FTVLOCN_STATUS_IND "
//					+ " FROM FTVLOCN "
//					+ " WHERE (FTVLOCN_COAS_CODE) IN (:FRBGRNT_COAS_CODE, :P_COAS_CODE) AND FTVLOCN_LOCN_CODE = :FRRGLOC_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
//			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//			coasCode = isNull(frbgrntElement.getFrbgrntCoasCodeIcCs(),
//					frbgrntElement.getFrbgrntCoasCode());
//			// Setting query parameters
//			ptiCursor.addParameter("FRBGRNT_COAS_CODE",
//					frbgrntElement.getFrbgrntCoasCode());
//			ptiCursor.addParameter("P_COAS_CODE", coasCode);
//			ptiCursor.addParameter("FRRGLOC_LOCN_CODE",
//					frrglocElement.getFrrglocLocnCode());
//			ptiCursor.open();
//			ResultSet ptiCursorResults = ptiCursor.fetchInto();
//			if (ptiCursorResults != null) {
//				frrglocElement.setFrrglocLocnTitle(ptiCursorResults.getStr(0));
//				getFormModel().getFormHeader().setWorkStatusInd(
//						ptiCursorResults.getStr(1));
//			}
//			if (ptiCursor.notFound()) {
//				// goto F_LOCN_1;
//				message(GNls.Fget(toStr("FRAGRNT-0059"), toStr("FORM"),
//						toStr("Location Code is invalid; LIST is available.")));
//				getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//				throw new ApplicationException();
//			} else {
//				// goto S_LOCN_1;
//			}
//		}
//		// F_LOCN_1:;
//		// S_LOCN_1:;
//		if (getTask()
//				.getGoqrpls()
//				.gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd()
//						.notEquals("A"))).getValue()) {
//			message(GNls
//					.Fget(toStr("FRAGRNT-0060"),
//							toStr("FORM"),
//							toStr("Location entered is not active. LIST is available.")));
//			getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//			throw new ApplicationException();
//		}
//	}
	
	@ActionTrigger(action="EDIT_LOCN_CODE")
	public void Fragrnt_EditLocnCode()
	{
		

			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
			FrrglocAdapter frrglocElement = (FrrglocAdapter)this.getFormModel().getFrrgloc().getRowAdapter(true);

			if(frbgrntElement==null || frrglocElement==null)
				return;

			int rowCount = 0;
			 R:;
			{
				NString coasCode= NString.getNull();
				String sqlptiCursor = "SELECT FTVLOCN_TITLE, FTVLOCN_STATUS_IND " +
" FROM FTVLOCN " +
" WHERE (FTVLOCN_COAS_CODE) IN (:FRBGRNT_COAS_CODE, :P_COAS_CODE) AND FTVLOCN_LOCN_CODE = :FRRGLOC_LOCN_CODE AND FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE IS NULL OR FTVLOCN_TERM_DATE > SYSDATE) ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					coasCode = isNull(frbgrntElement.getFrbgrntCoasCodeIcCs(), frbgrntElement.getFrbgrntCoasCode());
					//Setting query parameters
					ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
					ptiCursor.addParameter("P_COAS_CODE", coasCode);
					ptiCursor.addParameter("FRRGLOC_LOCN_CODE", frrglocElement.getFrrglocLocnCode());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						frrglocElement.setFrrglocLocnTitle(ptiCursorResults.getStr(0));
						getFormModel().getFormHeader().setWorkStatusInd(ptiCursorResults.getStr(1));
					}
					if ( ptiCursor.notFound() )
					{
	//					 goto F_LOCN_1;
						errorMessage(GNls.Fget(toStr("FRAGRNT-0059"), toStr("FORM"), toStr("Location Code is invalid; LIST is available.")));
						getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//						throw new ApplicationException();
					}
					else {
	//					 goto S_LOCN_1;
						if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A"))).getValue())
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0060"), toStr("FORM"), toStr("Location entered is not active. LIST is available.")));
							getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
							throw new ApplicationException();
						}
					}
				} finally {
					ptiCursor.close();
				}
			}
//			 F_LOCN_1:;
//			message(GNls.Fget(toStr("FRAGRNT-0059"), toStr("FORM"), toStr("Location Code is invalid; LIST is available.")));
//			getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//			throw new ApplicationException();
//			 S_LOCN_1:;
//			if ( getTask().getGoqrpls().gNchk(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A")).getValue() )
//			{
//				message(GNls.Fget(toStr("FRAGRNT-0060"), toStr("FORM"), toStr("Location entered is not active. LIST is available.")));
//				getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
//				throw new ApplicationException();
//			}
		}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_AGENCY_CODE
	 * :frbgrnt_agency_code := ''; :frbgrnt_agency_name := '';
	 * g$_sel_spriden_id_name(:frbgrnt_agency_pidm, 'FRBGRNT_AGENCY_NAME', 'Y',
	 * :frbgrnt_agency_code);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_AGENCY_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_AGENCY_CODE")
	public void Fragrnt_GetAgencyCode() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		frbgrntElement.setFrbgrntAgencyCode(toStr(""));
		frbgrntElement.setFrbgrntAgencyName(toStr(""));
		Ref<NString> pId_ref = new Ref<NString>(
				frbgrntElement.getFrbgrntAgencyCode());
		getTask().getGoqrpls().gSelSpridenIdName(
				frbgrntElement.getFrbgrntAgencyPidm(),
				toStr("FRBGRNT_AGENCY_NAME"), toStr("Y"), pId_ref);
		frbgrntElement.setFrbgrntAgencyCode(pId_ref.val);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_PI_ID_CODE
	 * :frbgrnt_pi_id_code := ''; :frbgrnt_pi_id_name := '';
	 * g$_sel_spriden_id_name(:frbgrnt_pi_pidm, 'FRBGRNT_PI_ID_NAME', 'Y',
	 * :frbgrnt_pi_id_code);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_PI_ID_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_PI_ID_CODE")
	public void Fragrnt_GetPiIdCode() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		frbgrntElement.setFrbgrntPiIdCode(toStr(""));
		frbgrntElement.setFrbgrntPiIdName(toStr(""));
		Ref<NString> pId_ref = new Ref<NString>(
				frbgrntElement.getFrbgrntPiIdCode());
		getTask().getGoqrpls().gSelSpridenIdName(
				frbgrntElement.getFrbgrntPiPidm(), toStr("FRBGRNT_PI_ID_NAME"),
				toStr("Y"), pId_ref);
		frbgrntElement.setFrbgrntPiIdCode(pId_ref.val);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_AGENCY_CONTACT DECLARE
	 * cursor get_agency_contact is select ftvagcy_contact from ftvagcy where
	 * ftvagcy_agcy_code_pidm = :frbgrnt_agency_pidm; BEGIN open
	 * get_agency_contact; fetch get_agency_contact into
	 * :frbgrnt_agency_contact; if get_agency_contact%NOTFOUND then close
	 * get_agency_contact; return; end if; close get_agency_contact; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_AGENCY_CONTACT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_AGENCY_CONTACT")
	public void Fragrnt_GetAgencyContact() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if(frbgrntElement == null)
			return;
		
		int rowCount = 0;
		{
			String sqlgetAgencyContact = "SELECT ftvagcy_contact "
					+ " FROM ftvagcy "
					+ " WHERE ftvagcy_agcy_code_pidm = :FRBGRNT_AGENCY_PIDM ";
			DataCursor getAgencyContact = new DataCursor(sqlgetAgencyContact);
			try {
				// Setting query parameters
				getAgencyContact.addParameter("FRBGRNT_AGENCY_PIDM",
						frbgrntElement.getFrbgrntAgencyPidm());
				getAgencyContact.open();
				ResultSet getAgencyContactResults = getAgencyContact.fetchInto();
				if (getAgencyContactResults != null) {
					frbgrntElement.setFrbgrntAgencyContact(getAgencyContactResults
							.getStr(0));
				}
				if (getAgencyContact.notFound()) {
					return;
				}
			} finally {
				getAgencyContact.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GEN_FOBSEQN_NUMBER DECLARE
	 * hold_frbgrnt_code frbgrnt.frbgrnt_code%type; -- CURSOR PTI_CURSOR IS
	 * SELECT FOBSEQN_SEQNO_PREFIX || LPAD(TO_CHAR( FOBSEQN_MAXSEQNO), 8, '0')
	 * FROM FOBSEQN WHERE FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE ; BEGIN <<
	 * GEN_DOC_CODE >> UPDATE FOBSEQN SET FOBSEQN_MAXSEQNO =
	 * (NVL(FOBSEQN_MAXSEQNO, 0) + 1) WHERE FOBSEQN_SEQNO_TYPE =
	 * :HOLD_FOBSEQN_TYPE ; G$_CHECK_VALUE (SQL%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0061', 'FORM','Could not update FOBSEQN table for
	 * newly generated document code') , TRUE); -- OPEN PTI_CURSOR ; FETCH
	 * PTI_CURSOR INTO hold_frbgrnt_code ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0062', 'FORM','Could not generate new document
	 * number') , TRUE); CLOSE PTI_CURSOR; -- IF
	 * SELECT_frbgrnt_1(hold_frbgrnt_code) THEN GOTO GEN_DOC_CODE ; END IF ; --
	 * :display_frbgrnt_code := hold_frbgrnt_code; :frbgrnt_code :=
	 * hold_frbgrnt_code; if :frbgrnt_prop_code is not null and
	 * :display_prop_code is null then :display_prop_code := :frbgrnt_prop_code;
	 * end if; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GEN_FOBSEQN_NUMBER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GEN_FOBSEQN_NUMBER")
	public void Fragrnt_GenFobseqnNumber() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		{
			NString holdFrbgrntCode = NString.getNull();
			String sqlptiCursor = "SELECT FOBSEQN_SEQNO_PREFIX || LPAD(TO_CHAR(FOBSEQN_MAXSEQNO), 8, '0') "
					+ " FROM FOBSEQN "
					+ " WHERE FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				do {
					String sql1 = "UPDATE FOBSEQN "
							+ "SET FOBSEQN_MAXSEQNO = (NVL(FOBSEQN_MAXSEQNO, 0) + 1) "
							+ " WHERE FOBSEQN_SEQNO_TYPE = :HOLD_FOBSEQN_TYPE";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("HOLD_FOBSEQN_TYPE", getFormModel()
							.getFormHeader().getHoldFobseqnType());
					rowCount = command1.execute();
					getTask()
							.getGoqrpls()
							.gCheckValue(
									toBool(rowCount == 0),
									GNls.Fget(
											toStr("FRAGRNT-0061"),
											toStr("FORM"),
											toStr("Could not update FOBSEQN table for newly generated document code")),
									toBool(NBool.True));
					//
					// Setting query parameters
					ptiCursor.addParameter("HOLD_FOBSEQN_TYPE", getFormModel()
							.getFormHeader().getHoldFobseqnType());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						holdFrbgrntCode = ptiCursorResults.getStr(0);
					}
					getTask()
							.getGoqrpls()
							.gCheckValue(
									toBool(ptiCursor.notFound()),
									GNls.Fget(
											toStr("FRAGRNT-0062"),
											toStr("FORM"),
											toStr("Could not generate new document number")),
									toBool(NBool.True));
	
	
					//
				} while (this.getTask().getServices().selectFrbgrnt1(holdFrbgrntCode).getValue());

				getFormModel().getKeyBlock().setDisplayFrbgrntCode(holdFrbgrntCode);
				frbgrntElement.setFrbgrntCode(holdFrbgrntCode);
				if (!frbgrntElement.getFrbgrntPropCode().isNull()
						&& getFormModel().getKeyBlock().getDisplayPropCode()
								.isNull()) {
					getFormModel().getKeyBlock().setDisplayPropCode(
							frbgrntElement.getFrbgrntPropCode());
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GEN_DOC_NUMBER
	 * :HOLD_FOBSEQN_TYPE := 'G'; EXECUTE_TRIGGER('GEN_FOBSEQN_NUMBER'); IF NOT
	 * FORM_SUCCESS THEN RETURN; END IF; --
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GEN_DOC_NUMBER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GEN_DOC_NUMBER")
	public void Fragrnt_GenDocNumber() {

		getFormModel().getFormHeader().setHoldFobseqnType(toStr("G"));
		executeAction("GEN_FOBSEQN_NUMBER");
		// if ( SupportClasses.SQLFORMS.FormSuccess().not() )
		// {
		// return ;
		// }
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_AGCY_CODE_PRED_PIDM
	 * DECLARE cursor get_agency_pred_pidm is select ftvagcy_agcy_code_pred_pidm
	 * from ftvagcy where ftvagcy_agcy_code_pidm = :frbgrnt_agency_pidm; BEGIN
	 * :frbgrnt_agency_pred_code := NULL; :frbgrnt_agency_pred_name := NULL;
	 * 
	 * OPEN get_agency_pred_pidm ; FETCH get_agency_pred_pidm INTO
	 * :frbgrnt_agency_pred_pidm; IF get_agency_pred_pidm%NOTFOUND THEN CLOSE
	 * get_agency_pred_pidm; RETURN; END IF; CLOSE get_agency_pred_pidm; --
	 * g$_sel_spriden_id_name(:frbgrnt_agency_pred_pidm,
	 * 'FRBGRNT_AGENCY_PRED_NAME', 'Y', :frbgrnt_agency_pred_code); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_AGCY_CODE_PRED_PIDM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_AGCY_CODE_PRED_PIDM")
	public void Fragrnt_GetAgcyCodePredPidm() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		{
			String sqlgetAgencyPredPidm = "SELECT ftvagcy_agcy_code_pred_pidm "
					+ " FROM ftvagcy "
					+ " WHERE ftvagcy_agcy_code_pidm = :FRBGRNT_AGENCY_PIDM ";
			DataCursor getAgencyPredPidm = new DataCursor(sqlgetAgencyPredPidm);
			try {
				getFormModel().getFormHeader()
						.setFrbgrntAgencyPredCode(toStr(null));
				getFormModel().getFormHeader()
						.setFrbgrntAgencyPredName(toStr(null));
				// Setting query parameters
				getAgencyPredPidm.addParameter("FRBGRNT_AGENCY_PIDM",
						frbgrntElement.getFrbgrntAgencyPidm());
				getAgencyPredPidm.open();
				ResultSet getAgencyPredPidmResults = getAgencyPredPidm.fetchInto();
				if (getAgencyPredPidmResults != null) {
					frbgrntElement
							.setFrbgrntAgencyPredPidm(getAgencyPredPidmResults
									.getNumber(0));
				}
				if (getAgencyPredPidm.notFound()) {
					return;
				}
			} finally {
				getAgencyPredPidm.close();
			}

			//
			Ref<NString> pId_ref = new Ref<NString>(getFormModel()
					.getFormHeader().getFrbgrntAgencyPredCode());
			getTask().getGoqrpls().gSelSpridenIdName(
					frbgrntElement.getFrbgrntAgencyPredPidm(),
					toStr("FRBGRNT_AGENCY_PRED_NAME"), toStr("Y"), pId_ref);
			getFormModel().getFormHeader()
					.setFrbgrntAgencyPredCode(pId_ref.val);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DELETE_TEXT --dbms package
	 * issue DELETE FROM FOBTEXT WHERE FOBTEXT_CODE = :DISPLAY_frbgrnt_CODE AND
	 * FOBTEXT_DTYP_SEQ_NUM = 51 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND
	 * FOBTEXT_ITEM IS NULL ; --commit;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.DELETE_TEXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DELETE_TEXT")
	public void Fragrnt_DeleteText() {

		// dbms package issue
		int rowCount = 0;
		// dbms package issue
		String sql1 = "DELETE FROM FOBTEXT "
				+ " WHERE FOBTEXT_CODE = :DISPLAY_FRBGRNT_CODE AND FOBTEXT_DTYP_SEQ_NUM = 51 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
				.getKeyBlock().getDisplayFrbgrntCode());
		rowCount = command1.execute();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ENABLE_BUTTONS
	 * 
	 * IF GET_ITEM_PROPERTY('frbgrnt_COAS_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_COAS_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_ORGN_CODE_RESP_OFF',ENABLED) = 'FALSE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_ORGN_CODE_RESP_OFF',ENABLED,PROPERTY_ON);
	 * END IF; -- IF GET_ITEM_PROPERTY('FRBGRNT_PROP_CODE_LBT',ENABLED) =
	 * 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FRBGRNT_PROP_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 * --
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.ENABLE_BUTTONS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_BUTTONS")
	public void Fragrnt_EnableButtons() {

		if (getItemEnabled("frbgrnt_COAS_CODE_LBT").equals("FALSE")) {
			setItemEnabled("frbgrnt_COAS_CODE_LBT", true);
		}
		//
		if (getItemEnabled("frbgrnt_ORGN_CODE_RESP_OFF").equals("FALSE")) {
			setItemEnabled("frbgrnt_ORGN_CODE_RESP_OFF", true);
		}
		//
		if (getItemEnabled("FRBGRNT_PROP_CODE_LBT").equals("FALSE")) {
			setItemEnabled("FRBGRNT_PROP_CODE_LBT", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_STATUS_CODE if
	 * :frbgrnt_status_code is null then return; end if; -- declare cursor c1 is
	 * select ftvsdat_title from ftvsdat where ftvsdat_sdat_code_entity =
	 * 'FRBGRNT' and ftvsdat_sdat_code_attr = 'STATUS_CODE' and
	 * ftvsdat_sdat_code_opt_1 = :frbgrnt_status_code and ftvsdat_eff_date <=
	 * sysdate and (ftvsdat_nchg_date is null or ftvsdat_nchg_date > sysdate)
	 * and ftvsdat_status_ind = 'A'; begin open c1; fetch c1 into :status_descr;
	 * if c1%notfound then message( G$_NLS.Get('FRAGRNT-0063', 'FORM','Status is
	 * invalid. LIST is available.') ); close c1; end if; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_STATUS_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_STATUS_CODE")
	public void Fragrnt_EditStatusCode() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		if (frbgrntElement.getFrbgrntStatusCode().isNull()) {
			return;
		}
		{
			String sqlc1 = "SELECT ftvsdat_title "
					+ " FROM ftvsdat "
					+ " WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_STATUS_CODE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				// Setting query parameters
				c1.addParameter("FRBGRNT_STATUS_CODE",
						frbgrntElement.getFrbgrntStatusCode());
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					frbgrntElement.setStatusDescr(c1Results.getStr(0));
				}
				if (c1.notFound()) {
//					message(GNls.Fget(toStr("FRAGRNT-0063"), toStr("FORM"),
//							toStr("Status is invalid. LIST is available.")));
					errorMessage(GNls.Fget(toStr("FRAGRNT-0063"), toStr("FORM"),
					toStr("Status is invalid. LIST is available.")));
				}
			} finally {
				c1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DISABLE_BUTTONS IF
	 * GET_ITEM_PROPERTY('frbgrnt_STATUS_CODE_LBT',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_STATUS_CODE_LBT',ENABLED,PROPERTY_OFF); END
	 * IF; -- IF GET_ITEM_PROPERTY('frbgrnt_grant_TYPE_LBT',ENABLED) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_grant_TYPE_LBT',ENABLED,PROPERTY_OFF);
	 * END IF; -- IF GET_ITEM_PROPERTY('frbgrnt_CATEGORY_LBT',ENABLED) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_CATEGORY_LBT',ENABLED,PROPERTY_OFF); END
	 * IF; -- IF GET_ITEM_PROPERTY('frbgrnt_SUB_CATEGORY_LBT',ENABLED) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_SUB_CATEGORY_LBT',ENABLED,PROPERTY_OFF);
	 * END IF; -- IF GET_ITEM_PROPERTY('frbgrnt_CFDA_CODE_LBT',ENABLED) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('frbgrnt_CFDA_CODE_LBT',ENABLED,PROPERTY_OFF); END
	 * IF; -- IF GET_ITEM_PROPERTY('COPY_grnt',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('COPY_grnt',ENABLED,PROPERTY_OFF); END IF; --
	 * 
	 * IF GET_ITEM_PROPERTY('frbgrnt_PI_ID_CODE_LBT',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_PI_ID_CODE_LBT',ENABLED,PROPERTY_OFF); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_AGENCY_CODE_LBT',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_AGENCY_CODE_LBT',ENABLED,PROPERTY_OFF); END
	 * IF; -- IF GET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('NAVIGATE_TO_BTN',ENABLED,PROPERTY_OFF); END IF; -- IF
	 * GET_ITEM_PROPERTY('frbgrnt_COAS_CODE_LBT',ENABLED) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('frbgrnt_COAS_CODE_LBT',ENABLED,PROPERTY_OFF); END IF;
	 * -- IF GET_ITEM_PROPERTY('frbgrnt_ORGN_CODE_RESP_OFF',ENABLED) = 'TRUE'
	 * THEN
	 * SET_ITEM_PROPERTY('frbgrnt_ORGN_CODE_RESP_OFF',ENABLED,PROPERTY_OFF); END
	 * IF; -- IF GET_ITEM_PROPERTY('FRBGRNT_PROP_CODE_LBT',ENABLED) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('FRBGRNT_PROP_CODE_LBT',ENABLED,PROPERTY_OFF); END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DISABLE_BUTTONS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_BUTTONS")
	public void Fragrnt_DisableButtons() {

		if (getItemEnabled("frbgrnt_STATUS_CODE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_STATUS_CODE_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_grant_TYPE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_grant_TYPE_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_CATEGORY_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_CATEGORY_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_SUB_CATEGORY_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_SUB_CATEGORY_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_CFDA_CODE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_CFDA_CODE_LBT", false);
		}
		//
		if (getItemEnabled("COPY_grnt").equals("TRUE")) {
			setItemEnabled("COPY_grnt", false);
		}
		//
		if (getItemEnabled("frbgrnt_PI_ID_CODE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_PI_ID_CODE_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_AGENCY_CODE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_AGENCY_CODE_LBT", false);
		}
		//
		if (getItemEnabled("NAVIGATE_TO_BTN").equals("TRUE")) {
			setItemEnabled("NAVIGATE_TO_BTN", false);
		}
		//
		if (getItemEnabled("frbgrnt_COAS_CODE_LBT").equals("TRUE")) {
			setItemEnabled("frbgrnt_COAS_CODE_LBT", false);
		}
		//
		if (getItemEnabled("frbgrnt_ORGN_CODE_RESP_OFF").equals("TRUE")) {
			setItemEnabled("frbgrnt_ORGN_CODE_RESP_OFF", false);
		}
		//
		if (getItemEnabled("FRBGRNT_PROP_CODE_LBT").equals("TRUE")) {
			setItemEnabled("FRBGRNT_PROP_CODE_LBT", false);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_SECURITY_ENTERED IF
	 * :frbgrnt_COAS_CODE IS NULL THEN GO_ITEM('frbgrnt_COAS_CODE'); MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0064', 'FORM','Chart of Accounts Code must be
	 * entered.') ); Raise Form_Trigger_Failure; END IF; -- IF
	 * :frbgrnt_ORGN_CODE_RESP_OFFICE IS NULL THEN
	 * GO_ITEM('frbgrnt_ORGN_CODE_RESP_OFFICE'); MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0065', 'FORM','Organization Code must be entered.')
	 * ); Raise Form_Trigger_Failure; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_SECURITY_ENTERED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_SECURITY_ENTERED")
	public void Fragrnt_CheckSecurityEntered() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement==null)
			return;

		if (frbgrntElement.getFrbgrntCoasCode().isNull()) {
			goItem(toStr("frbgrnt_COAS_CODE"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0064"), toStr("FORM"),
					toStr("Chart of Accounts Code must be entered.")));
			throw new ApplicationException();
		}
		//
		if (frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull()) {
			goItem(toStr("frbgrnt_ORGN_CODE_RESP_OFFICE"));
			errorMessage(GNls.Fget(toStr("FRAGRNT-0065"), toStr("FORM"),
					toStr("Organization Code must be entered.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TRIG_FAIL NULL ; RAISE
	 * FORM_TRIGGER_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.TRIG_FAIL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TRIG_FAIL")
	public void Fragrnt_TrigFail() {

		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.UPDATE_ACTIVITY_DATE
	 * :WORKDATE := :SYSTEM.CURRENT_BLOCK ; -- :WORKDATE := SUBSTR(:WORKDATE, 1,
	 * 7) ; -- :WORKDATE := RPAD(:WORKDATE, 21, '_ACTIVITY_DATE') ; -- COPY(
	 * :CURRENT_DATE, :WORKDATE ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.UPDATE_ACTIVITY_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY_DATE")
	public void Fragrnt_UpdateActivityDate() {

		getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
		//
		getFormModel().getFormHeader().setWorkdate(
				substring(getFormModel().getFormHeader().getWorkdate(),
						toInt(1), toInt(7)));
		//
		getFormModel().getFormHeader().setWorkdate(
				toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21,
						"_ACTIVITY_DATE")));
		//
		copy(getFormModel().getFormHeader().getCurrentDate(), getFormModel()
				.getFormHeader().getWorkdate());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.UPDATE_USER_ID :WORKUSER :=
	 * :SYSTEM.CURRENT_BLOCK ; -- :WORKUSER := SUBSTR(:WORKUSER, 1, 7) ; --
	 * :WORKUSER := RPAD(:WORKUSER, 15, '_USER_ID') ; -- COPY( :CURRENT_USER,
	 * :WORKUSER ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.UPDATE_USER_ID
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_USER_ID")
	public void Fragrnt_UpdateUserId() {

		getFormModel().getFormHeader().setWorkuser(toStr(getCurrentBlock()));
		//
		getFormModel().getFormHeader().setWorkuser(
				substring(getFormModel().getFormHeader().getWorkuser(),
						toInt(1), toInt(7)));
		//
		getFormModel().getFormHeader().setWorkuser(
				toStr(rpad(getFormModel().getFormHeader().getWorkuser(), 15,
						"_USER_ID")));
		//
		copy(getFormModel().getFormHeader().getCurrentUser(), getFormModel()
				.getFormHeader().getWorkuser());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.INVALID_FUNCTION_MSG
	 * MESSAGE( G$_NLS.Get('FRAGRNT-0066', 'FORM','*ERROR* Invalid function;
	 * press SHOW KEYS key for valid functions.') ) ; RAISE FORM_TRIGGER_FAILURE
	 * ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.INVALID_FUNCTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_FUNCTION_MSG")
	public void Fragrnt_InvalidFunctionMsg() {

		errorMessage(GNls
				.Fget(toStr("FRAGRNT-0066"),
						toStr("FORM"),
						toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY_EXIT_TRG BEGIN
	 * :GLOBAL.VALUE := '' ; -- G$_DETERMINE_ERASE_GLOBAL; G$_CHECK_FAILURE ; --
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void Fragrnt_KeyExitTrg() {

		setGlobal("VALUE", toStr(""));
		//
		getTask().getGoqrpls().gDetermineEraseGlobal();
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TEST_PROJECT_END_DATE IF
	 * TRUNC(:frbgrnt_project_end_date) < TRUNC(:frbgrnt_project_start_date)
	 * THEN message( G$_NLS.Get('FRAGRNT-0067', 'FORM','Project End date must be
	 * greater or equal to Project Start date') ); RAISE FORM_TRIGGER_FAILURE;
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.TEST_PROJECT_END_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TEST_PROJECT_END_DATE")
	public void Fragrnt_TestProjectEndDate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		if(frbgrntElement==null)
			return;

		if (trunc(frbgrntElement.getFrbgrntProjectEndDate()).lesser(
				trunc(frbgrntElement.getFrbgrntProjectStartDate()))) {
			findItem("FRBGRNT_PROJECT_END_DATE").setValid(false);

			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0067"),
							toStr("FORM"),
							toStr("Project End date must be greater or equal to Project Start date")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TEST_EXPENDITURE_DATE IF
	 * TRUNC(:frbgrnt_expend_end_date) <= TRUNC(:frbgrnt_project_start_date)
	 * THEN message( G$_NLS.Get('FRAGRNT-0068', 'FORM','The Expenditure date
	 * must be greater than Project Start date') ); RAISE FORM_TRIGGER_FAILURE;
	 * END IF; -- IF TRUNC(:frbgrnt_expend_end_date) <
	 * TRUNC(:frbgrnt_project_end_date) THEN message( G$_NLS.Get('FRAGRNT-0069',
	 * 'FORM','The Expenditure date must be greater or equal to Project End
	 * date') ); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * TRUNC(:frbgrnt_expend_end_date) < TRUNC(:frbgrnt_term_date) THEN message(
	 * G$_NLS.Get('FRAGRNT-0070', 'FORM','The Expenditure date must be greater
	 * or equal to Termination date') ); RAISE FORM_TRIGGER_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.TEST_EXPENDITURE_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TEST_EXPENDITURE_DATE")
	public void Fragrnt_TestExpenditureDate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (trunc(frbgrntElement.getFrbgrntExpendEndDate()).lesserOrEquals(
				trunc(frbgrntElement.getFrbgrntProjectStartDate()))) {
//			message(GNls
//					.Fget(toStr("FRAGRNT-0068"),
//							toStr("FORM"),
//							toStr("The Expenditure date must be greater than Project Start date")));
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0068"),
							toStr("FORM"),
							toStr("The Expenditure date must be greater than Project Start date")));
			throw new ApplicationException();
		}
		//
		if (trunc(frbgrntElement.getFrbgrntExpendEndDate()).lesser(
				trunc(frbgrntElement.getFrbgrntProjectEndDate()))) {
//			message(GNls
//					.Fget(toStr("FRAGRNT-0069"),
//							toStr("FORM"),
//							toStr("The Expenditure date must be greater or equal to Project End date")));
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0069"),
							toStr("FORM"),
							toStr("The Expenditure date must be greater or equal to Project End date")));
			throw new ApplicationException();
		}
		//
		if (trunc(frbgrntElement.getFrbgrntExpendEndDate()).lesser(
				trunc(frbgrntElement.getFrbgrntTermDate()))) {
//			message(GNls
//					.Fget(toStr("FRAGRNT-0070"),
//							toStr("FORM"),
//							toStr("The Expenditure date must be greater or equal to Termination date")));
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0070"),
							toStr("FORM"),
							toStr("The Expenditure date must be greater or equal to Termination date")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TEST_TERM_DATE IF
	 * TRUNC(:frbgrnt_term_date) <= TRUNC(:frbgrnt_project_start_date) THEN
	 * message( G$_NLS.Get('FRAGRNT-0071', 'FORM','The Termination date must be
	 * greater than Project Start date') ); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * -- IF TRUNC(:frbgrnt_term_date) < TRUNC(:frbgrnt_project_end_date) THEN
	 * message( G$_NLS.Get('FRAGRNT-0072', 'FORM','The Termination date must be
	 * greater or equal to Project End date') ); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; --
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.TEST_TERM_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TEST_TERM_DATE")
	public void Fragrnt_TestTermDate() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (trunc(frbgrntElement.getFrbgrntTermDate()).lesserOrEquals(
				trunc(frbgrntElement.getFrbgrntProjectStartDate()))) {
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0071"),
							toStr("FORM"),
							toStr("The Termination date must be greater than Project Start date")));
			throw new ApplicationException();
		}
		//
		if (trunc(frbgrntElement.getFrbgrntTermDate()).lesser(
				trunc(frbgrntElement.getFrbgrntProjectEndDate()))) {
//			message(GNls
//					.Fget(toStr("FRAGRNT-0072"),
//							toStr("FORM"),
//							toStr("The Termination date must be greater or equal to Project End date")));
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0072"),
							toStr("FORM"),
							toStr("The Termination date must be greater or equal to Project End date")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DISABLE_KEYS
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE_LBT',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE_LBT',ENABLED,PROPERTY_OFF);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void Fragrnt_DisableKeys() {

		setItemEnabled("DISPLAY_frbgrnt_CODE", false);
		setItemEnabled("DISPLAY_frbgrnt_CODE_LBT", false);
		setItemVisible("DISPLAY_frbgrnt_CODE_LBT", false);

		setItemEnabled("DISPLAY_PROP_CODE", false);
		setItemEnabled("DISPLAY_PROP_CODE_LBT", false);
		setItemVisible("DISPLAY_PROP_CODE_LBT", false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ENABLE_KEYS IF
	 * GET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',UPDATEABLE,PROPERTY_ON); --
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',REQUIRED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE',NAVIGABLE,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_frbgrnt_CODE_LBT',ENABLED,PROPERTY_ON); END
	 * IF; -- IF GET_ITEM_PROPERTY('DISPLAY_PROP_CODE',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE',UPDATEABLE,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE',NAVIGABLE,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('DISPLAY_PROP_CODE_LBT',ENABLED,PROPERTY_ON); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void Fragrnt_EnableKeys() {

		if (getItemEnabled("DISPLAY_frbgrnt_CODE").equals("FALSE")) {
			setItemEnabled("DISPLAY_frbgrnt_CODE", true);
			setItemUpdateAllowed("DISPLAY_frbgrnt_CODE", true);
			setItemNavigable("DISPLAY_frbgrnt_CODE", true);
			setItemEnabled("DISPLAY_frbgrnt_CODE_LBT", true);
			setItemVisible("DISPLAY_frbgrnt_CODE_LBT", true);
			
			
		}
		//
		if (getItemEnabled("DISPLAY_PROP_CODE").equals("FALSE")) {
			setItemEnabled("DISPLAY_PROP_CODE", true);
			setItemUpdateAllowed("DISPLAY_PROP_CODE", true);
			setItemNavigable("DISPLAY_PROP_CODE", true);
			setItemEnabled("DISPLAY_PROP_CODE_LBT", true);
			setItemVisible("DISPLAY_PROP_CODE_LBT", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.SAVE_KEYS :GLOBAL.grnt_CODE
	 * := :DISPLAY_frbgrnt_CODE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void Fragrnt_SaveKeys() {

		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-LISTVAL
	 * G$_DISPLAY_LOV('','');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void Fragrnt_ListValues() {

		getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.LIST_VALUES_COPY_TWO COPY(
	 * :GLOBAL.SDAT_ATTR, 'frrgusn_sdat_code_attr'); COPY( :GLOBAL.VALUE,
	 * 'frrgusn_sdat_code_opt_1');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.LIST_VALUES_COPY_TWO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY_TWO")
	public void Fragrnt_ListValuesCopyTwo() {

		copy(getGlobal("SDAT_ATTR"), "frrgusn_sdat_code_attr");
		copy(getGlobal("VALUE"), "frrgusn_sdat_code_opt_1");
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.9';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Fragrnt_LoadCurrentRelease() {

		getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GLOBAL_COPY if
	 * :GLOBAL.grnt_code is not null then :display_frbgrnt_code :=
	 * :GLOBAL.grnt_code; end if;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void Fragrnt_GlobalCopy() {

		if (!getGlobal("GRNT_CODE").isNull()) {
			getFormModel().getKeyBlock().setDisplayFrbgrntCode(
					getGlobal("GRNT_CODE"));
		}
		if (getGlobal("COAS_CODE").isNull()){
			setGlobal("COAS_CODE","B");
		}
			
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * FRAGRNT.EDIT_ORGN_SECURITY_AFTER_QUERY
	 * 
	 * IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN NULL; ELSIF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN EXECUTE_TRIGGER('TRIG_FAIL'); IF
	 * NOT FORM_SUCCESS THEN RETURN; END IF; END IF; -- DECLARE PTI_INTO_TEMP
	 * varchar2(255); CURSOR PTI_CURSOR IS SELECT 'Y' FROM FOBPROF WHERE
	 * FOBPROF_USER_ID = :CURRENT_USER AND FOBPROF_MASTER_ORGN_IND IN ('B', 'P',
	 * 'Q') ;
	 * 
	 * BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO PTI_INTO_TEMP ; IF
	 * PTI_CURSOR%NOTFOUND THEN GOTO CHK_ORGN_SEC ; ELSE RETURN; END IF ; END ;
	 * -- << CHK_ORGN_SEC >>
	 * 
	 * DECLARE CURSOR PTI_CURSOR_1 IS SELECT FRBGRNT_COAS_CODE,
	 * FRBGRNT_ORGN_CODE_RESP_OFFICE FROM FRBGRNT WHERE FRBGRNT_CODE =
	 * :DISPLAY_FRBGRNT_CODE; -- hold_frbgrnt_coas_code
	 * frbgrnt.frbgrnt_coas_code%type; hold_frbgrnt_orgn_code
	 * frbgrnt.frbgrnt_orgn_code_resp_office%type; -- RETRIEVED_ORGN_CODE
	 * varchar2(6); -- CURSOR PTI_CURSOR_2 IS SELECT FTVORGN_ORGN_CODE FROM
	 * FTVORGN WHERE FTVORGN_ORGN_CODE IN ( SELECT FORUSOR_ORGN_CODE FROM
	 * FORUSOR WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND
	 * FORUSOR_COAS_CODE = hold_frbgrnt_coas_code ) CONNECT BY FTVORGN_ORGN_CODE
	 * = PRIOR FTVORGN_ORGN_CODE_PRED AND FTVORGN_COAS_CODE = PRIOR
	 * FTVORGN_COAS_CODE AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE >
	 * SYSDATE START WITH FTVORGN_ORGN_CODE = hold_frbgrnt_orgn_code AND
	 * FTVORGN_COAS_CODE = hold_frbgrnt_coas_code AND FTVORGN_EFF_DATE <=
	 * SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE ; -- PTI_INTO_TEMP_1
	 * VARCHAR2(255); CURSOR PTI_CURSOR_3 IS SELECT 'Y' FROM FORUSOR WHERE
	 * FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE =
	 * hold_frbgrnt_coas_code AND FORUSOR_ACCESS_IND IN ('B', 'P','Q') AND
	 * FORUSOR_USER_ID_ENTERED = :CURRENT_USER ; BEGIN OPEN PTI_CURSOR_1; FETCH
	 * PTI_CURSOR_1 INTO hold_frbgrnt_coas_code, hold_frbgrnt_orgn_code; IF
	 * PTI_CURSOR_1%NOTFOUND THEN GOTO TRIG_EXIT; END IF; -- OPEN PTI_CURSOR_2 ;
	 * FETCH PTI_CURSOR_2 INTO :RETRIEVED_ORGN_CODE ; IF PTI_CURSOR_2%NOTFOUND
	 * THEN GOTO ORGN_NOT_ALLOWED ; END IF ; -- << CHK_ORGN_ALLOWED >>
	 * 
	 * OPEN PTI_CURSOR_3 ; FETCH PTI_CURSOR_3 INTO PTI_INTO_TEMP_1 ; IF
	 * PTI_CURSOR_3%NOTFOUND THEN GOTO ORGN_NOT_ALLOWED ; ELSE GOTO TRIG_EXIT ;
	 * END IF ; -- << ORGN_NOT_ALLOWED >> MESSAGE(F_GET_ERROR('USER_NOT_AUTH'))
	 * ; RAISE FORM_TRIGGER_FAILURE ;
	 * 
	 * -- << TRIG_EXIT >> NULL ; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_ORGN_SECURITY_AFTER_QUERY
	 * 
	 * 
	 * </p>
	 */
	
	@ActionTrigger(action = "EDIT_ORGN_SECURITY_AFTER_QUERY")
	public void Fragrnt_EditOrgnSecurityAfterQuery() {
			
				int rowCount = 0;
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
					} catch (Exception e) {
						return;
					}
					
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							 this.goToChkOrgnSec();
						}
						else {
							return ;
						}
					} finally {
						ptiCursor.close();
					}
				}
			}

	//CHK_ORGN_SEC
	private void goToChkOrgnSec() {
		
			String sqlptiCursor1 = "SELECT FRBGRNT_COAS_CODE, FRBGRNT_ORGN_CODE_RESP_OFFICE " +
" FROM FRBGRNT " +
" WHERE FRBGRNT_CODE = :DISPLAY_FRBGRNT_CODE ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			// 
			NString holdFrbgrntCoasCode= NString.getNull();
			NString holdFrbgrntOrgnCode= NString.getNull();
			// 
			NString retrievedOrgnCode= NString.getNull();
			String sqlptiCursor2 = "SELECT FTVORGN_ORGN_CODE " +
" FROM FTVORGN " +
" WHERE (FTVORGN_ORGN_CODE) IN (SELECT FORUSOR_ORGN_CODE " +
" FROM FORUSOR " +
" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND FORUSOR_COAS_CODE = :P_HOLD_FRBGRNT_COAS_CODE ) ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			// 
			NString ptiIntoTemp1= NString.getNull();
			String sqlptiCursor3 = "SELECT 'Y' " +
" FROM FORUSOR " +
" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :P_HOLD_FRBGRNT_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER ";
			DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
			try {
				//Setting query parameters
				ptiCursor1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				ptiCursor1.open();
				ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
				if ( ptiCursor1Results != null ) {
					holdFrbgrntCoasCode = ptiCursor1Results.getStr(0);
					holdFrbgrntOrgnCode = ptiCursor1Results.getStr(1);
				}
				if ( ptiCursor1.notFound() )
				{
					 //TRIG_EXIT
					return;
				}
				// 
				//Setting query parameters
				ptiCursor2.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor2.addParameter("P_HOLD_FRBGRNT_COAS_CODE", holdFrbgrntCoasCode);
				ptiCursor2.open();
				ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
				if ( ptiCursor2Results != null ) {
					getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursor2Results.getStr(0));
				}
				if ( ptiCursor2.notFound() )
				{
					this.goToOrgnNotAllowed();
					return;
				}
				 goToChkOrgnAllowed(holdFrbgrntCoasCode, ptiCursor3);
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
				ptiCursor3.close();
			}
		
	}

	//CHK_ORGN_ALLOWED
	private void goToChkOrgnAllowed(NString holdFrbgrntCoasCode, DataCursor ptiCursor3) {
		NString ptiIntoTemp1;
		//Setting query parameters
		try {
			ptiCursor3.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
			ptiCursor3.addParameter("P_HOLD_FRBGRNT_COAS_CODE", holdFrbgrntCoasCode);
			ptiCursor3.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
			ptiCursor3.open();
			ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
			if ( ptiCursor3Results != null ) {
				ptiIntoTemp1 = ptiCursor3Results.getStr(0);
			}
			if ( ptiCursor3.notFound() )
			{
				this.goToOrgnNotAllowed();
				return;
			}
			else {
				 return;
			}
		} catch(Exception e) {
			ptiCursor3.close();
		}
	}

	//ORGN_NOT_ALLOWED
	private void goToOrgnNotAllowed() {
		errorMessage(this.getTask().getServices().fGetError(toStr("USER_NOT_AUTH")));
		throw new ApplicationException();
		//TRIG_EXIT
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_ORGN_CODE
	 * <multilinecomment> 1-113DE2A : Rewrite the Organization Title retrieval
	 * logic to handle past(terminated) and future records;
	 * 
	 * If user selects an inactive/terminated Org code and bypasses the warning
	 * alert OR if user queries an inactive/terminated org code; Search for the
	 * latest terminated/inactive record to get the organzation title. If no
	 * past (terminated) records, then search for the first future dated records
	 * to retrieve the title.
	 * 
	 * </multilinecomment> IF :frbgrnt_ORGN_CODE_RESP_OFFICE IS NULL THEN RETURN
	 * ; END IF ; -- 1-BMV7IL Start DECLARE hold_orgn_code_descr varchar2(35);
	 * lv_holder varchar2(1); -- CURSOR FTVORGN_C IS SELECT 'Y' FROM FTVORGN
	 * WHERE FTVORGN_ORGN_CODE = :frbgrnt_ORGN_CODE_RESP_OFFICE AND
	 * FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE; -- CURSOR FTVORGN_CURR_REC_C IS
	 * SELECT FTVORGN_TITLE FROM FTVORGN WHERE FTVORGN_NCHG_DATE > SYSDATE AND
	 * FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR
	 * FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE =
	 * :frbgrnt_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE
	 * AND FTVORGN_STATUS_IND= 'A'; -- CURSOR FTVORGN_PAST_REC_C IS SELECT
	 * FTVORGN_TITLE FROM FTVORGN WHERE FTVORGN_EFF_DATE < SYSDATE AND
	 * FTVORGN_ORGN_CODE = :frbgrnt_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE
	 * = :frbgrnt_COAS_CODE ORDER BY FTVORGN_EFF_DATE DESC; -- CURSOR
	 * FTVORGN_FUT_REC_C IS SELECT FTVORGN_TITLE FROM FTVORGN WHERE
	 * FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE =
	 * :frbgrnt_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE =
	 * :frbgrnt_COAS_CODE; -- ALERT_BUTTON NUMBER; ALERT_ID ALERT; warn_mes
	 * VARCHAR2(500) := G$_NLS.GET('FRAGRNT-0073','FORM', 'The Organization code
	 * entered is currently Terminated or Inactive. Do you want to update the
	 * Responsible Organization?'); lv_err_msg VARCHAR2(200); BEGIN
	 * :ORGN_CODE_DESCR := ''; OPEN FTVORGN_C ; FETCH FTVORGN_C INTO lv_holder;
	 * IF FTVORGN_C%NOTFOUND THEN CLOSE FTVORGN_C; lv_err_msg :=
	 * G$_NLS.Get('FRAGRNT-0074','FORM','*ERROR* %01% is invalid. LIST for valid
	 * choices.', :frbgrnt_ORGN_CODE_RESP_OFFICE); MESSAGE(lv_err_msg,
	 * NO_ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE FTVORGN_C;
	 * 
	 * OPEN FTVORGN_CURR_REC_C; FETCH FTVORGN_CURR_REC_C INTO
	 * hold_orgn_code_descr; IF FTVORGN_CURR_REC_C%NOTFOUND THEN IF
	 * :SYSTEM.FORM_STATUS = 'QUERY' OR NVL(:FORM_HEADER.ORG_VALIDATE_FLAG,'Y')
	 * = 'N' THEN :FORM_HEADER.ORG_VALIDATE_FLAG := 'Y'; ELSE ALERT_ID :=
	 * FIND_ALERT('G$_PIPE_MESSAGE_ALERT'); SET_ALERT_PROPERTY(alert_id,
	 * alert_message_text, warn_mes ); alert_button := SHOW_ALERT(alert_id); IF
	 * alert_button = ALERT_BUTTON2 THEN CLOSE FTVORGN_CURR_REC_C; MESSAGE(
	 * G$_NLS.Get('FRAGRNT-0075', 'FORM','Organization is invalid. Use LIST.')
	 * ,NO_ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * 
	 * END IF; -- Either Past (Terminated) or future records exist OPEN
	 * FTVORGN_PAST_REC_C; FETCH FTVORGN_PAST_REC_C INTO hold_orgn_code_descr;
	 * IF FTVORGN_PAST_REC_C%NOTFOUND THEN OPEN FTVORGN_FUT_REC_C; FETCH
	 * FTVORGN_FUT_REC_C INTO hold_orgn_code_descr; CLOSE FTVORGN_FUT_REC_C; END
	 * IF; CLOSE FTVORGN_PAST_REC_C; END IF; CLOSE FTVORGN_CURR_REC_C;
	 * 
	 * :ORGN_CODE_DESCR := hold_orgn_code_descr; END; --1-BMV7IL End
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_ORGN_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_ORGN_CODE")
	public void Fragrnt_EditOrgnCode() {

		// 1-113DE2A : Rewrite the Organization Title retrieval logic to handle
		// past(terminated) and future records;
		// If user selects an inactive/terminated Org code and bypasses the
		// warning alert OR if user queries an inactive/terminated org code;
		// Search for the latest terminated/inactive record to get the
		// organzation title.
		// If no past (terminated) records, then search for the first future
		// dated records to retrieve the title.

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		// 1-113DE2A : Rewrite the Organization Title retrieval logic to handle
		// past(terminated) and future records;
		// If user selects an inactive/terminated Org code and bypasses the
		// warning alert OR if user queries an inactive/terminated org code;
		// Search for the latest terminated/inactive record to get the
		// organzation title.
		// If no past (terminated) records, then search for the first future
		// dated records to retrieve the title.
		if (frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull()) {
			return;
		}
		{
			NString holdOrgnCodeDescr = NString.getNull();
			NString lvHolder = NString.getNull();
			String sqlftvorgnC = "SELECT 'Y' "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_ORGN_CODE = :FRBGRNT_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE ";
			DataCursor ftvorgnC = new DataCursor(sqlftvorgnC);
			String sqlftvorgnCurrRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE = :FRBGRNT_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVORGN_STATUS_IND = 'A' ";
			DataCursor ftvorgnCurrRecC = new DataCursor(sqlftvorgnCurrRecC);
			String sqlftvorgnPastRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_EFF_DATE < SYSDATE AND FTVORGN_ORGN_CODE = :FRBGRNT_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE "
					+ " ORDER BY FTVORGN_EFF_DATE DESC";
			DataCursor ftvorgnPastRecC = new DataCursor(sqlftvorgnPastRecC);
			String sqlftvorgnFutRecC = "SELECT FTVORGN_TITLE "
					+ " FROM FTVORGN "
					+ " WHERE FTVORGN_EFF_DATE > SYSDATE AND FTVORGN_ORGN_CODE = :FRBGRNT_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE ";
			DataCursor ftvorgnFutRecC = new DataCursor(sqlftvorgnFutRecC);
			
			try {
				//
				NNumber alertButton = NNumber.getNull();
				AlertDescriptor alertId = null;
				NString warnMes = GNls
						.Fget(toStr("FRAGRNT-0073"),
								toStr("FORM"),
								toStr("The Organization code entered is currently Terminated or Inactive. Do you want to update the Responsible Organization?"));
				NString lvErrMsg = NString.getNull();
				frbgrntElement.setOrgnCodeDescr(toStr(""));
				// Setting query parameters
				ftvorgnC.addParameter("FRBGRNT_ORGN_CODE_RESP_OFFICE",
						frbgrntElement.getFrbgrntOrgnCodeRespOffice());
				ftvorgnC.addParameter("FRBGRNT_COAS_CODE",
						frbgrntElement.getFrbgrntCoasCode());
				ftvorgnC.open();
				ResultSet ftvorgnCResults = ftvorgnC.fetchInto();
				if (ftvorgnCResults != null) {
					lvHolder = ftvorgnCResults.getStr(0);
				}
				if (ftvorgnC.notFound()) {
					lvErrMsg = GNls
							.Fget(toStr("FRAGRNT-0074"),
									toStr("FORM"),
									toStr("*ERROR* %01% is invalid. LIST for valid choices."),
									frbgrntElement.getFrbgrntOrgnCodeRespOffice());
//					message(lvErrMsg, OutputMessageUserResponse.NO_ACKNOWLEDGE);
					errorMessage(lvErrMsg, OutputMessageUserResponse.NO_ACKNOWLEDGE);
					throw new ApplicationException();
				}
				// Setting query parameters
				ftvorgnCurrRecC.addParameter("FRBGRNT_ORGN_CODE_RESP_OFFICE",
						frbgrntElement.getFrbgrntOrgnCodeRespOffice());
				ftvorgnCurrRecC.addParameter("FRBGRNT_COAS_CODE",
						frbgrntElement.getFrbgrntCoasCode());
				ftvorgnCurrRecC.open();
				ResultSet ftvorgnCurrRecCResults = ftvorgnCurrRecC.fetchInto();
				if (ftvorgnCurrRecCResults != null) {
					holdOrgnCodeDescr = ftvorgnCurrRecCResults.getStr(0);
				}
				if (ftvorgnCurrRecC.notFound()) {
					if (getTaskStatus().equals("QUERY")
							|| isNull(
									getFormModel().getFormHeader()
											.getOrgValidateFlag(), "Y").equals("N")) {
						getFormModel().getFormHeader().setOrgValidateFlag(
								toStr("Y"));
					} else {
						alertId = findAlert("G$_PIPE_MESSAGE_ALERT");
						setAlertMessageText(alertId, warnMes);
						alertButton = toNumber(showAlert(alertId));
						if (alertButton.equals(MessageServices.BUTTON2)) {
							errorMessage(GNls.Fget(toStr("FRAGRNT-0075"), toStr("FORM"),
									toStr("Organization is invalid. Use LIST.")),
									OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					}
					// Either Past (Terminated) or future records exist
					// Setting query parameters
					ftvorgnPastRecC.addParameter("FRBGRNT_ORGN_CODE_RESP_OFFICE",
							frbgrntElement.getFrbgrntOrgnCodeRespOffice());
					ftvorgnPastRecC.addParameter("FRBGRNT_COAS_CODE",
							frbgrntElement.getFrbgrntCoasCode());
					ftvorgnPastRecC.open();
					ResultSet ftvorgnPastRecCResults = ftvorgnPastRecC.fetchInto();
					if (ftvorgnPastRecCResults != null) {
						holdOrgnCodeDescr = ftvorgnPastRecCResults.getStr(0);
					}
					if (ftvorgnPastRecC.notFound()) {
						// Setting query parameters
						ftvorgnFutRecC.addParameter(
								"FRBGRNT_ORGN_CODE_RESP_OFFICE",
								frbgrntElement.getFrbgrntOrgnCodeRespOffice());
						ftvorgnFutRecC.addParameter("FRBGRNT_COAS_CODE",
								frbgrntElement.getFrbgrntCoasCode());
						ftvorgnFutRecC.open();
						ResultSet ftvorgnFutRecCResults = ftvorgnFutRecC
								.fetchInto();
						if (ftvorgnFutRecCResults != null) {
							holdOrgnCodeDescr = ftvorgnFutRecCResults.getStr(0);
						}
					}

				}
				frbgrntElement.setOrgnCodeDescr(holdOrgnCodeDescr);
			} finally {
				ftvorgnC.close();
				ftvorgnCurrRecC.close();
				ftvorgnPastRecC.close();
				ftvorgnFutRecC.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_ORGN_SECURITY
	 * 
	 * 
	 * IF ( :GLOBAL.QUERY_MODE = '1' ) THEN GOTO TRIG_EXIT ; END IF ; -- IF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN NULL; ELSIF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN EXECUTE_TRIGGER('TRIG_FAIL'); IF
	 * NOT FORM_SUCCESS THEN GOTO TRIG_EXIT; END IF; END IF; -- DECLARE
	 * PTI_INTO_TEMP varchar2(255); CURSOR PTI_CURSOR IS SELECT 'Y' FROM FOBPROF
	 * WHERE FOBPROF_USER_ID = :CURRENT_USER AND FOBPROF_MASTER_ORGN_IND IN
	 * ('B', 'P', 'Q') ; BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO
	 * PTI_INTO_TEMP ; IF PTI_CURSOR%NOTFOUND THEN GOTO CHK_ORGN_SEC ; ELSE GOTO
	 * TRIG_EXIT ; END IF ; END ; -- << CHK_ORGN_SEC >> DECLARE
	 * RETRIEVED_ORGN_CODE varchar2(6); CURSOR PTI_CURSOR IS SELECT
	 * FTVORGN_ORGN_CODE FROM FTVORGN WHERE FTVORGN_ORGN_CODE IN ( SELECT
	 * FORUSOR_ORGN_CODE FROM FORUSOR WHERE FORUSOR_USER_ID_ENTERED =
	 * :CURRENT_USER AND FORUSOR_COAS_CODE = :frbgrnt_COAS_CODE ) CONNECT BY
	 * FTVORGN_ORGN_CODE = PRIOR FTVORGN_ORGN_CODE_PRED AND FTVORGN_COAS_CODE =
	 * PRIOR FTVORGN_COAS_CODE AND FTVORGN_EFF_DATE <= SYSDATE AND
	 * FTVORGN_NCHG_DATE > SYSDATE START WITH FTVORGN_ORGN_CODE =
	 * :frbgrnt_ORGN_CODE_RESP_OFFICE AND FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE
	 * AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE ; BEGIN
	 * OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO :RETRIEVED_ORGN_CODE ; IF
	 * PTI_CURSOR%NOTFOUND THEN GOTO ORGN_NOT_ALLOWED ; END IF ; END ; -- <<
	 * CHK_ORGN_ALLOWED >> IF ( :GLOBAL.QUERY_MODE = '1' ) THEN GOTO TRIG_EXIT ;
	 * END IF ; DECLARE PTI_INTO_TEMP VARCHAR2(255); CURSOR PTI_CURSOR IS SELECT
	 * 'Y' FROM FORUSOR WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND
	 * FORUSOR_COAS_CODE = :frbgrnt_COAS_CODE AND FORUSOR_ACCESS_IND IN ('B',
	 * 'P','Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER ; BEGIN OPEN
	 * PTI_CURSOR ; FETCH PTI_CURSOR INTO PTI_INTO_TEMP ; IF PTI_CURSOR%NOTFOUND
	 * THEN GOTO ORGN_NOT_ALLOWED ; ELSE GOTO TRIG_EXIT ; END IF ; END ; -- <<
	 * ORGN_NOT_ALLOWED >> MESSAGE(F_GET_ERROR('USER_NOT_AUTH')) ; RAISE
	 * FORM_TRIGGER_FAILURE ; -- << TRIG_EXIT >> NULL ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_ORGN_SECURITY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_ORGN_SECURITY")
	public void Fragrnt_EditOrgnSecurity() {

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				int rowCount = 0;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
					 return;
				}
				// 
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
					} catch (Exception e) {
						return;
					}
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							 this.goToEditOrgnSecurityChkOrgnSec(frbgrntElement);
							 return;
						}
						else {
							 return;
						}
					} finally {
						ptiCursor.close();
					}
				}
			}

	//CHK_ORGN_SEC
	private void goToEditOrgnSecurityChkOrgnSec(FrbgrntAdapter frbgrntElement) {
		{
			NString retrievedOrgnCode= NString.getNull();
			String sqlptiCursor = "SELECT FTVORGN_ORGN_CODE " +
" FROM FTVORGN " +
" WHERE (FTVORGN_ORGN_CODE) IN (SELECT FORUSOR_ORGN_CODE " +
" FROM FORUSOR " +
" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND FORUSOR_COAS_CODE = :FRBGRNT_COAS_CODE ) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursorResults.getStr(0));
				}
				if ( ptiCursor.notFound() )
				{
					 this.goToEditOrgnSecurityOrgnNotAllowed();
					 return;
				}
			} finally {
				ptiCursor.close();
			}
		}
		//CHK_ORGN_ALLOWED
		if ((getGlobal("QUERY_MODE").equals("1")))
		{
			 return;
		}
		{
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'Y' " +
" FROM FORUSOR " +
" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :FRBGRNT_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try
			{
				//Setting query parameters
				ptiCursor.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.notFound() )
				{
					 this.goToEditOrgnSecurityOrgnNotAllowed();
					 return;
				}
				else {
					 return;
				}
			}
			finally
			{
				ptiCursor.close();
			}
		}
	}

	//ORGN_NOT_ALLOWED
	private void goToEditOrgnSecurityOrgnNotAllowed() {
		errorMessage(this.getTask().getServices().fGetError(toStr("USER_NOT_AUTH")));
		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_ORGN_SEC_FOR_COMMIT
	 * 
	 * IF ( :GLOBAL.QUERY_MODE = '1' ) THEN GOTO TRIG_EXIT ; END IF ; -- IF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN NULL; ELSIF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN EXECUTE_TRIGGER('TRIG_FAIL'); IF
	 * NOT FORM_SUCCESS THEN GOTO TRIG_EXIT; END IF; END IF; -- DECLARE
	 * PTI_INTO_TEMP varchar2(255); CURSOR PTI_CURSOR IS SELECT 'Y' FROM FOBPROF
	 * WHERE FOBPROF_USER_ID = :CURRENT_USER AND FOBPROF_MASTER_ORGN_IND IN
	 * ('B', 'P') ; BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO PTI_INTO_TEMP
	 * ; IF PTI_CURSOR%NOTFOUND THEN GOTO CHK_ORGN_SEC ; ELSE GOTO TRIG_EXIT ;
	 * END IF ; END ; -- << CHK_ORGN_SEC >> DECLARE RETRIEVED_ORGN_CODE
	 * varchar2(6); CURSOR PTI_CURSOR IS SELECT FTVORGN_ORGN_CODE FROM FTVORGN
	 * WHERE FTVORGN_ORGN_CODE IN ( SELECT FORUSOR_ORGN_CODE FROM FORUSOR WHERE
	 * FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND FORUSOR_COAS_CODE =
	 * :frbgrnt_COAS_CODE ) CONNECT BY FTVORGN_ORGN_CODE = PRIOR
	 * FTVORGN_ORGN_CODE_PRED AND FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
	 * AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE START
	 * WITH FTVORGN_ORGN_CODE = :frbgrnt_ORGN_CODE_RESP_OFFICE AND
	 * FTVORGN_COAS_CODE = :frbgrnt_COAS_CODE AND FTVORGN_EFF_DATE <= SYSDATE
	 * AND FTVORGN_NCHG_DATE > SYSDATE ; BEGIN OPEN PTI_CURSOR ; FETCH
	 * PTI_CURSOR INTO :RETRIEVED_ORGN_CODE ; IF PTI_CURSOR%NOTFOUND THEN GOTO
	 * ORGN_NOT_ALLOWED ; END IF ; END ; -- << CHK_ORGN_ALLOWED >> IF (
	 * :GLOBAL.QUERY_MODE = '1' ) THEN GOTO TRIG_EXIT ; END IF ; DECLARE
	 * PTI_INTO_TEMP VARCHAR2(255); CURSOR PTI_CURSOR IS SELECT 'Y' FROM FORUSOR
	 * WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE =
	 * :frbgrnt_COAS_CODE AND FORUSOR_ACCESS_IND IN ('B', 'P') AND
	 * FORUSOR_USER_ID_ENTERED = :CURRENT_USER ; BEGIN OPEN PTI_CURSOR ; FETCH
	 * PTI_CURSOR INTO PTI_INTO_TEMP ; IF PTI_CURSOR%NOTFOUND THEN GOTO
	 * ORGN_NOT_ALLOWED ; ELSE GOTO TRIG_EXIT ; END IF ; END ; -- <<
	 * ORGN_NOT_ALLOWED >> if :from_new_item = 'Y' then :from_new_item := 'N';
	 * else MESSAGE(F_GET_ERROR('USER_NOT_AUTH')) ; RAISE FORM_TRIGGER_FAILURE ;
	 * end if; -- << TRIG_EXIT >> NULL ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_ORGN_SEC_FOR_COMMIT
	 * 
	 * 
	 * </p>
	 */
	
	@ActionTrigger(action = "EDIT_ORGN_SEC_FOR_COMMIT")
	public void Fragrnt_EditOrgnSecForCommit() {
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				int rowCount = 0;
				if ((getGlobal("QUERY_MODE").equals("1")))
				{
					 return;
				}
				// 
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
				}
				else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
					try {
						executeAction("TRIG_FAIL");
					} catch (Exception e) {
						return;
					}
				}
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P') ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							 this.goToEditOrgnSecForCommitChkOrgnSec(frbgrntElement);
							 return;
						}
						else {
							 return;
						}
					} finally {
						ptiCursor.close();
					}
				}
			}

	//CHK_ORGN_SEC
	private void goToEditOrgnSecForCommitChkOrgnSec(
			FrbgrntAdapter frbgrntElement) {
		{
			NString retrievedOrgnCode= NString.getNull();
			String sqlptiCursor = "SELECT FTVORGN_ORGN_CODE " +
" FROM FTVORGN " +
" WHERE (FTVORGN_ORGN_CODE) IN (SELECT FORUSOR_ORGN_CODE " +
" FROM FORUSOR " +
" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND FORUSOR_COAS_CODE = :FRBGRNT_COAS_CODE ) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursorResults.getStr(0));
				}
				if ( ptiCursor.notFound() )
				{
					 this.goToEditOrgnSecForCommitOrgnNotAllowed();
					 return;
				}
			} finally {
				ptiCursor.close();
			}
		}
		//CHK_ORGN_ALLOWED
		if ((getGlobal("QUERY_MODE").equals("1")))
		{
			 return;
		}
		{
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'Y' " +
" FROM FORUSOR " +
" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :FRBGRNT_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.notFound() )
				{
					 this.goToEditOrgnSecForCommitOrgnNotAllowed();
					 return;
				}
				else {
					 return;
				}
			} finally {
				ptiCursor.close();
			}
		}
	}
	
	//ORGN_NOT_ALLOWED
	private void goToEditOrgnSecForCommitOrgnNotAllowed() {
		if ( getFormModel().getFormHeader().getFromNewItem().equals("Y") )
		{
			getFormModel().getFormHeader().setFromNewItem(toStr("N"));
		}
		else {
			errorMessage(this.getTask().getServices().fGetError(toStr("USER_NOT_AUTH")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_COAS_CODE DECLARE
	 * CURSOR PTI_CURSOR IS SELECT TO_CHAR(FTVCOAS_TERM_DATE,
	 * 'YYYYMMDDHH24MISS'), FTVCOAS_STATUS_IND FROM FTVCOAS WHERE
	 * FTVCOAS_COAS_CODE = :frbgrnt_COAS_CODE AND FTVCOAS_EFF_DATE <= SYSDATE
	 * AND FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR
	 * FTVCOAS_TERM_DATE > SYSDATE); BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR
	 * INTO :WORKFLD, :WORK_STATUS_IND ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('FRAGRNT-0076', 'FORM','Chart of Accounts is invalid; LIST is
	 * available.') , TRUE); END ; -- EXECUTE_TRIGGER( 'TEST_TABLE_STATUS' ) ;
	 * G$_CHECK_VALUE (NOT FORM_SUCCESS, G$_NLS.Get('FRAGRNT-0077',
	 * 'FORM','Chart of Accounts is not Active.') , TRUE); :WORK_STATUS_IND :=
	 * ''; -- EXECUTE_TRIGGER( 'TEST_TABLE_TERM' ) ; G$_CHECK_VALUE (NOT
	 * FORM_SUCCESS, G$_NLS.Get('FRAGRNT-0078', 'FORM','Chart of Accounts is
	 * Terminated.') , TRUE); :WORKFLD := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_COAS_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_COAS_CODE")
	public void Fragrnt_EditCoasCode() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT TO_CHAR(FTVCOAS_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVCOAS_STATUS_IND "
					+ " FROM FTVCOAS "
					+ " WHERE FTVCOAS_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVCOAS_EFF_DATE <= SYSDATE AND FTVCOAS_NCHG_DATE > SYSDATE AND (FTVCOAS_TERM_DATE IS NULL OR FTVCOAS_TERM_DATE > SYSDATE) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					getFormModel().getFormHeader().setWorkfld(
							ptiCursorResults.getStr(0));
					getFormModel().getFormHeader().setWorkStatusInd(
							ptiCursorResults.getStr(1));
					setGlobal("COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				}
				if(frbgrntElement.getFrbgrntCoasCode().isNull())
				findItem("FRBGRNT_COAS_CODE").setValid(false);
				
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(ptiCursor.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0076"),
										toStr("FORM"),
										toStr("Chart of Accounts is invalid; LIST is available.")),
								toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}
			
		}
		//
		try {
			executeAction("TEST_TABLE_STATUS");
		} catch (Exception e) {
			errorMessage(GNls.Fget(toStr("FRAGRNT-0077"), toStr("FORM"), toStr("Chart of Accounts is not Active."), toStr(NBool.True)));
			throw new ApplicationException();
		}
		getFormModel().getFormHeader().setWorkStatusInd(toStr(""));
		//
		try {
			executeAction("TEST_TABLE_TERM");
		} catch (Exception e) {
			warningMessage(GNls.Fget(toStr("FRAGRNT-0078"), toStr("FORM"), toStr("Chart of Accounts is Terminated."), toStr(NBool.True)));
		}
		getFormModel().getFormHeader().setWorkfld(toStr(""));
		
		
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TEST_TABLE_STATUS IF
	 * G$_NCHK(:WORK_STATUS_IND <> 'A') THEN EXECUTE_TRIGGER( 'TRIG_FAIL' ) ;
	 * G$_CHECK_FAILURE ; END IF ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.TEST_TABLE_STATUS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TEST_TABLE_STATUS")
	public void Fragrnt_TestTableStatus() {

		if (getTask()
				.getGoqrpls()
				.gNchk(toBool(getFormModel().getFormHeader().getWorkStatusInd().notEquals("A"))).getValue()) 
		{
			executeAction("TRIG_FAIL");
			getTask().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.TEST_TABLE_TERM IF (
	 * :GLOBAL.QUERY_MODE = '1' ) THEN RETURN ; END IF ; G$_CHECK_VALUE (NOT
	 * ((TO_DATE(:WORKFLD,'YYYYMMDDHH24MISS') >= SYSDATE) OR (:WORKFLD IS
	 * NULL)), NULL, TRUE, TRUE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.TEST_TABLE_TERM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "TEST_TABLE_TERM")
	public void Fragrnt_TestTableTerm() {

		if ((getGlobal("QUERY_MODE").equals("1"))) {
			return;
		}
//		getTask()
//				.getGoqrpls()
//				.gCheckValue(
//						toBool(!((toDate(getFormModel().getFormHeader()
//								.getWorkfld(), "YYYYMMDDHH24MISS")
//								.greaterOrEquals(NDate.getNow())))
//								|| (getFormModel().getFormHeader().getWorkfld()
//										.isNull())),
//						toStr(null), toBool(NBool.True), toBool(NBool.True));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_TEXT
	 * 
	 * DECLARE CURSOR PTI_CURSOR IS SELECT 'Y' FROM FOBTEXT WHERE FOBTEXT_CODE =
	 * :DISPLAY_frbgrnt_CODE AND FOBTEXT_DTYP_SEQ_NUM = 51 AND
	 * FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL; BEGIN OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO :DISPLAY_TEXT_IND; IF
	 * PTI_CURSOR%NOTFOUND THEN :DISPLAY_TEXT_IND := 'N'; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.CHECK_TEXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_TEXT")
	public void Fragrnt_CheckText() {

		int rowCount = 0;
		{
			String sqlptiCursor =     " SELECT 'Y' "
									+ " FROM FOBTEXT "
									+ " WHERE FOBTEXT_CODE = :DISPLAY_FRBGRNT_CODE "
									+ " AND FOBTEXT_DTYP_SEQ_NUM = 51 "
									+ " AND FOBTEXT_CHG_SEQ_NUM IS NULL "
									+ " AND FOBTEXT_ITEM IS NULL ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) 
				{
					getFormModel().getKeyBlock().setDisplayTextInd(	ptiCursorResults.getStr(0));
				}
				if (ptiCursor.notFound()) 
				{
					getFormModel().getKeyBlock().setDisplayTextInd(toStr("N"));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_COST_SHARE_INFO
	 * BEGIN IF CURSOR_ALREADY_IN_THAT_TABPAGE('COST_CODE_INFORMATION')
	 * THEN--FOR TAB PAGE INVALID_OPTION_SELECTED; G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
	 * EXECUTE_TRIGGER('CHECK_SECURITY_ENTERED'); G$_CHECK_FAILURE; END IF;
	 * 
	 * EXECUTE_TRIGGER('RE_EDIT'); G$_CHECK_FAILURE;
	 * 
	 * IF :LOCN_ERROR_IND = 'N' OR :LOCN_ERROR_IND IS NULL THEN
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE; END IF;
	 * 
	 * IF :DISPLAY_FRBGRNT_CODE = :FORM_HEADER.NEXT_DOC_NUM THEN
	 * :GRNT_CODE_DISPLAY_1 := :FORM_HEADER.NEXT_DOC_NUM; :GRNT_TITLE_DISPLAY_1
	 * := ''; ELSE :GRNT_CODE_DISPLAY_1 := :FRBGRNT_CODE; :GRNT_TITLE_DISPLAY_1
	 * := :FRBGRNT_TITLE; END IF; --Maneesh: Commented the below line for IDC
	 * Encumbrance RPE --GO_ITEM('FRBGRNT.FRBGRNT_COAS_CODE_IC_CS');
	 * GO_ITEM('FRBGRNT.FRBGRNT_IDC_ENC_IND'); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_COST_SHARE_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_COST_SHARE_INFO")
	public void Fragrnt_MnuOptCostShareInfo() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("COST_CODE_INFORMATION"))
				.getValue()) {
			// FOR TAB PAGE
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("CHECK_SECURITY_ENTERED");
			getTask().getGoqrpls().gCheckFailure();
		}
		executeAction("RE_EDIT");
		getTask().getGoqrpls().gCheckFailure();
		if (getFormModel().getFormHeader().getLocnErrorInd().equals("N")
				|| getFormModel().getFormHeader().getLocnErrorInd().isNull()) {
			executeAction("FORCE_COMMIT");
			getTask().getGoqrpls().gCheckFailure();
		}
		if (getFormModel().getKeyBlock().getDisplayFrbgrntCode()
				.equals(getFormModel().getFormHeader().getNextDocNum())) {
			getFormModel().getBlock3().setGrntCodeDisplay1(
					getFormModel().getFormHeader().getNextDocNum());
			getFormModel().getBlock3().setGrntTitleDisplay1(toStr(""));
		} else {
			getFormModel().getBlock3().setGrntCodeDisplay1(
					frbgrntElement.getFrbgrntCode());
			getFormModel().getBlock3().setGrntTitleDisplay1(
					frbgrntElement.getFrbgrntTitle());
		}
		// Maneesh: Commented the below line for IDC Encumbrance RPE
		// GO_ITEM('FRBGRNT.FRBGRNT_COAS_CODE_IC_CS');
		goItem(toStr("FRBGRNT.FRBGRNT_IDC_ENC_IND"));
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_LOCATION_INFO --if
	 * cursor_already_in_that_window ('LOCATION_INFO') then if
	 * cursor_already_in_that_tabpage ('LOCATION_INFORMATION') then--FOR TAB
	 * CANVAS invalid_option_selected; g$_check_failure; return; end if; -- if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if;
	 * 
	 * execute_trigger('re_edit'); g$_check_failure; -- if :locn_error_ind = 'N'
	 * or :locn_error_ind is null then execute_trigger('force_commit');
	 * g$_check_failure; end if; -- go_item('frrgloc.frrgloc_locn_code');
	 * g$_check_failure; :SYSTEM.MESSAGE_LEVEL := '5'; CLEAR_BLOCK(NO_VALIDATE);
	 * EXECUTE_QUERY; :SYSTEM.MESSAGE_LEVEL := '0'; RETURN;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_LOCATION_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_LOCATION_INFO")
	public void Fragrnt_MnuOptLocationInfo() {

		// if cursor_already_in_that_window ('LOCATION_INFO') then
		// if cursor_already_in_that_window ('LOCATION_INFO') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("LOCATION_INFORMATION"))
				.getValue()) {
			// FOR TAB CANVAS
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		//
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		//
		if (getFormModel().getFormHeader().getLocnErrorInd().equals("N")
				|| getFormModel().getFormHeader().getLocnErrorInd().isNull()) {
			executeAction("force_commit");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		goItem(toStr("frrgloc.frrgloc_locn_code"));
		getTask().getGoqrpls().gCheckFailure();
		try { 
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
		clearBlock(TaskServices.NO_VALIDATE);
		executeQuery();
		} finally {
					
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
		}
					
		return;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_FRM_HIERARCHY --IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) <> 'FRAGRNT_2A_CANVAS'
	 * THEN IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) <>
	 * 'GRANT_AGENCY_INFORMATION' THEN MESSAGE( G$_NLS.Get('FRAGRNT-0079',
	 * 'FORM','This Option is not available at this time.') ); ELSE
	 * EXECUTE_TRIGGER('COPY_TO_GLOBALS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FGQAGYH','QUERY');
	 * EXECUTE_TRIGGER('COPY_GLOBALS'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_FRM_HIERARCHY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_FRM_HIERARCHY")
	public void Fragrnt_MnuOptFrmHierarchy() {

		// IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) <>
		// 'FRAGRNT_2A_CANVAS' THEN
		// IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) <>
		// 'FRAGRNT_2A_CANVAS' THEN
		// if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(),
		// SupportClasses.Property.ITEM_TAB_PAGE).notEquals("GRANT_AGENCY_INFORMATION")
		// )
		if (!(getTabNewPage().equals("GRANT_AGENCY_INFORMATION"))) {
			warningMessage(GNls.Fget(toStr("FRAGRNT-0079"), toStr("FORM"),
					toStr("This Option is not available at this time.")));
		} else {
			executeAction("COPY_TO_GLOBALS");
			getTask().getGoqrpls().gCheckFailure();
			getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
					toStr("FGQAGYH"), toStr("QUERY"));
			executeAction("COPY_GLOBALS");
			getTask().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_AGENCY_INFO if
	 * :frbgrnt_agency_code is null then go_item('frbgrnt_AGENCY_CODE');
	 * g$_check_failure; Message( G$_NLS.Get('FRAGRNT-0080', 'FORM','Agency Code
	 * must be entered to view Agency Information.') ); Raise
	 * Form_Trigger_Failure; end if; -- --if cursor_already_in_that_window
	 * ('AGENCY_INFO') then if cursor_already_in_that_tabpage
	 * ('GRANT_AGENCY_INFORMATION') then--FOR TAB CANVAS
	 * invalid_option_selected; g$_check_failure; return; end if; if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if;
	 * 
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); G$_CHECK_FAILURE;
	 * 
	 * -- execute_trigger('check_frrgloc'); g$_check_failure;
	 * execute_trigger('re_edit'); g$_check_failure;
	 * execute_trigger('force_commit'); g$_check_failure; :frbgrnt_agency_code_2
	 * := :frbgrnt_agency_code; :frbgrnt_agency_name_2 := :frbgrnt_agency_name;
	 * go_item('frbgrnt.frbgrnt_agency_contact'); g$_check_failure; return;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_AGENCY_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_AGENCY_INFO")
	public void Fragrnt_MnuOptAgencyInfo() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			

		if (frbgrntElement.getFrbgrntAgencyCode().isNull()) {
			goItem(toStr("frbgrnt_AGENCY_CODE"));
			getTask().getGoqrpls().gCheckFailure();
			errorMessage(GNls
					.Fget(toStr("FRAGRNT-0080"),
							toStr("FORM"),
							toStr("Agency Code must be entered to view Agency Information.")));
			throw new ApplicationException();
		}
		//
		// if cursor_already_in_that_window ('AGENCY_INFO') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("GRANT_AGENCY_INFORMATION"))
				.getValue()) {
			// FOR TAB CANVAS
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
			executeAction("GET_ITEM_NAME");
			getTask().getGoqrpls().gCheckFailure();
			//
			executeAction("CHECK_FRRGLOC");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("re_edit");
			getTask().getGoqrpls().gCheckFailure();
			
			
			executeAction("force_commit");
			
			
			getTask().getGoqrpls().gCheckFailure();
			frbgrntElement.setFrbgrntAgencyCode2(frbgrntElement
					.getFrbgrntAgencyCode());
			frbgrntElement.setFrbgrntAgencyName2(frbgrntElement
					.getFrbgrntAgencyName());
			goItem(toStr("frbgrnt.frbgrnt_agency_contact"));
			getTask().getGoqrpls().gCheckFailure();
			return;
		
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_PERSONNEL_INFO --if
	 * cursor_already_in_that_window ('PERSONNEL_INFO') then IF
	 * cursor_already_in_that_tabpage ('PERSONNEL_INFORMATION') then--FOR TAB
	 * CANVAS invalid_option_selected; g$_check_failure; return; end if; -- if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * execute_trigger('re_edit'); g$_check_failure; --check locn codes
	 * 
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); G$_CHECK_FAILURE;
	 * 
	 * execute_trigger('check_frrgloc'); g$_check_failure; -- if :locn_error_ind
	 * = 'N' or :locn_error_ind is null then execute_trigger('force_commit');
	 * g$_check_failure; end if; -- IF :DISPLAY_FRBGRNT_CODE =
	 * :FORM_HEADER.NEXT_DOC_NUM THEN :GRNT_CODE_DISPLAY_4 :=
	 * :FORM_HEADER.NEXT_DOC_NUM; :GRNT_TITLE_DISPLAY_4 := ''; ELSE
	 * :GRNT_CODE_DISPLAY_4 := :FRBGRNT_CODE; :GRNT_TITLE_DISPLAY_4 :=
	 * :FRBGRNT_TITLE; END IF; go_item('frrgrpi.frrgrpi_id'); g$_check_failure;
	 * :SYSTEM.MESSAGE_LEVEL := '5'; clear_block(NO_VALIDATE); declare var_hold
	 * varchar2(1); cursor get_info_for_query is select 'X' from frrgrpi where
	 * frrgrpi_grnt_code = :frbgrnt_code; begin open get_info_for_query; fetch
	 * get_info_for_query into var_hold; if get_info_for_query%found then
	 * execute_query; g$_check_failure; end if; close get_info_for_query; end;
	 * :SYSTEM.MESSAGE_LEVEL := '0'; return;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_PERSONNEL_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_PERSONNEL_INFO")
	public void Fragrnt_MnuOptPersonnelInfo() {

		// if cursor_already_in_that_window ('PERSONNEL_INFO') then

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		// if cursor_already_in_that_window ('PERSONNEL_INFO') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("PERSONNEL_INFORMATION"))
				.getValue()) {
			// FOR TAB CANVAS
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		//
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		// check locn codes
		executeAction("GET_ITEM_NAME");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("CHECK_FRRGLOC");
		getTask().getGoqrpls().gCheckFailure();
		//
		if (getFormModel().getFormHeader().getLocnErrorInd().equals("N")
				|| getFormModel().getFormHeader().getLocnErrorInd().isNull()) {
			executeAction("force_commit");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		if (getFormModel().getKeyBlock().getDisplayFrbgrntCode()
				.equals(getFormModel().getFormHeader().getNextDocNum())) {
			getFormModel().getBlock3().setGrntCodeDisplay4(
					getFormModel().getFormHeader().getNextDocNum());
			getFormModel().getBlock3().setGrntTitleDisplay4(toStr(""));
		} else {
			getFormModel().getBlock3().setGrntCodeDisplay4(
					frbgrntElement.getFrbgrntCode());
			getFormModel().getBlock3().setGrntTitleDisplay4(
					frbgrntElement.getFrbgrntTitle());
		}
		goItem(toStr("frrgrpi.frrgrpi_id"));
		getTask().getGoqrpls().gCheckFailure();
		try { 
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
		clearBlock(TaskServices.NO_VALIDATE);
		{
			NString varHold = NString.getNull();
			String sqlgetInfoForQuery = "SELECT 'X' " + " FROM frrgrpi "
					+ " WHERE frrgrpi_grnt_code = :FRBGRNT_CODE ";
			DataCursor getInfoForQuery = new DataCursor(sqlgetInfoForQuery);
			try {
				// Setting query parameters
				getInfoForQuery.addParameter("FRBGRNT_CODE",
						frbgrntElement.getFrbgrntCode());
				getInfoForQuery.open();
				ResultSet getInfoForQueryResults = getInfoForQuery.fetchInto();
				if (getInfoForQueryResults != null) {
					varHold = getInfoForQueryResults.getStr(0);
				}
				if (getInfoForQuery.found()) {
					executeQuery();
					getTask().getGoqrpls().gCheckFailure();
				}
			} finally {
				getInfoForQuery.close();
			}

		}
		} finally {
					
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
		}
					
		return;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_USER_CODES_INFO
	 * --if cursor_already_in_that_window ('USER_CODES_INFO') then if
	 * cursor_already_in_that_tabpage ('USER_DEFINED_DATA') then --for tab page
	 * invalid_option_selected; g$_check_failure; return; end if; -- if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); G$_CHECK_FAILURE; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure;
	 * execute_trigger('force_commit'); g$_check_failure; IF
	 * :DISPLAY_FRBGRNT_CODE = :FORM_HEADER.NEXT_DOC_NUM THEN
	 * :GRNT_CODE_DISPLAY_2 := :FORM_HEADER.NEXT_DOC_NUM; :GRNT_TITLE_DISPLAY_2
	 * := ''; ELSE :GRNT_CODE_DISPLAY_2 := :FRBGRNT_CODE; :GRNT_TITLE_DISPLAY_2
	 * := :FRBGRNT_TITLE; END IF; go_item('FRRGUSN_SDAT_CODE_ATTR');
	 * g$_check_failure; :SYSTEM.MESSAGE_LEVEL := '5'; clear_block(NO_VALIDATE);
	 * execute_query; :SYSTEM.MESSAGE_LEVEL := '0'; --
	 * execute_trigger('get_user_fields'); -- g$_check_failure; return;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_USER_CODES_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_USER_CODES_INFO")
	public void Fragrnt_MnuOptUserCodesInfo() {

		// if cursor_already_in_that_window ('USER_CODES_INFO') then

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		// if cursor_already_in_that_window ('USER_CODES_INFO') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("USER_DEFINED_DATA"))
				.getValue()) {
			// for tab page
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		//
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("GET_ITEM_NAME");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_FRRGLOC");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("force_commit");
		getTask().getGoqrpls().gCheckFailure();
		if (getFormModel().getKeyBlock().getDisplayFrbgrntCode()
				.equals(getFormModel().getFormHeader().getNextDocNum())) {
			getFormModel().getBlock3().setGrntCodeDisplay2(
					getFormModel().getFormHeader().getNextDocNum());
			getFormModel().getBlock3().setGrntTitleDisplay2(toStr(""));
		} else {
			getFormModel().getBlock3().setGrntCodeDisplay2(
					frbgrntElement.getFrbgrntCode());
			getFormModel().getBlock3().setGrntTitleDisplay2(
					frbgrntElement.getFrbgrntTitle());
		}
		goItem(toStr("FRRGUSN_SDAT_CODE_ATTR"));
		getTask().getGoqrpls().gCheckFailure();
		try { 
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
		clearBlock(TaskServices.NO_VALIDATE);
		executeQuery();
		} finally {
					
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
		}
					
		// execute_trigger('get_user_fields');
		// g$_check_failure;
		return;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_BILLING_INFO --if
	 * cursor_already_in_that_window ('BILLING_INFO') then if
	 * cursor_already_in_that_tabpage ('BILLING_INFORMATION') then
	 * invalid_option_selected; g$_check_failure; return; end if; if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); G$_CHECK_FAILURE; --
	 * execute_trigger('check_frrgloc'); g$_check_failure;
	 * execute_trigger('re_edit'); g$_check_failure;
	 * execute_trigger('force_commit'); g$_check_failure; -- IF
	 * :DISPLAY_FRBGRNT_CODE = :FORM_HEADER.NEXT_DOC_NUM THEN
	 * :GRNT_CODE_DISPLAY_5 := :FORM_HEADER.NEXT_DOC_NUM; :GRNT_TITLE_DISPLAY_5
	 * := ''; ELSE :GRNT_CODE_DISPLAY_5 := :FRBGRNT_CODE; :GRNT_TITLE_DISPLAY_5
	 * := :FRBGRNT_TITLE; END IF; :AGENCY_CODE_1 :=
	 * :frbgrnt.frbgrnt_AGENCY_code; :AGENCY_NAME_1 :=
	 * :frbgrnt.frbgrnt_AGENCY_name; -- go_item('frbgbil.FRBGBIL_PMSC_CODE');
	 * g$_check_failure; :SYSTEM.MESSAGE_LEVEL := '5'; clear_block(NO_VALIDATE);
	 * execute_query; :SYSTEM.MESSAGE_LEVEL := '0'; return;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_BILLING_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_BILLING_INFO")
	public void Fragrnt_MnuOptBillingInfo() {

		// if cursor_already_in_that_window ('BILLING_INFO') then

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		// if cursor_already_in_that_window ('BILLING_INFO') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("BILLING_INFORMATION"))
				.getValue()) {
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("GET_ITEM_NAME");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_FRRGLOC");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("force_commit");
		getTask().getGoqrpls().gCheckFailure();
		//
		if (getFormModel().getKeyBlock().getDisplayFrbgrntCode()
				.equals(getFormModel().getFormHeader().getNextDocNum())) {
			getFormModel().getBlock3().setGrntCodeDisplay5(
					getFormModel().getFormHeader().getNextDocNum());
			getFormModel().getBlock3().setGrntTitleDisplay5(toStr(""));
		} else {
			getFormModel().getBlock3().setGrntCodeDisplay5(
					frbgrntElement.getFrbgrntCode());
			getFormModel().getBlock3().setGrntTitleDisplay5(
					frbgrntElement.getFrbgrntTitle());
		}
		getFormModel().getBlock3().setAgencyCode1(
				frbgrntElement.getFrbgrntAgencyCode());
		getFormModel().getBlock3().setAgencyName1(
				frbgrntElement.getFrbgrntAgencyName());
		//
		goItem(toStr("frbgbil.FRBGBIL_PMSC_CODE"));
		getTask().getGoqrpls().gCheckFailure();
		try { 
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
		clearBlock(TaskServices.NO_VALIDATE);
		executeQuery();
		} finally {
					
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
		}
					
		return;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_HEADER_INFO --if
	 * cursor_already_in_that_window ('MAIN_WINDOW') then if
	 * cursor_already_in_that_tabpage ('HEADER_INFORMATION') then--for tab
	 * canvas invalid_option_selected; g$_check_failure; return; end if; -- if
	 * :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); G$_CHECK_FAILURE; --
	 * execute_trigger('check_frrgloc'); g$_check_failure; --
	 * execute_trigger('re_edit'); g$_check_failure;
	 * execute_trigger('force_commit'); g$_check_failure;
	 * go_item('frbgrnt.frbgrnt_COAS_CODE'); g$_check_failure; return;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_HEADER_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_HEADER_INFO")
	public void Fragrnt_MnuOptHeaderInfo() {

		// if cursor_already_in_that_window ('MAIN_WINDOW') then
		// if cursor_already_in_that_window ('MAIN_WINDOW') then
		if (this.getTask().getServices()
				.cursorAlreadyInThatTabpage(toStr("HEADER_INFORMATION"))
				.getValue()) {
			// for tab canvas
			this.getTask().getServices().invalidOptionSelected();
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		//
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("GET_ITEM_NAME");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_FRRGLOC");
		getTask().getGoqrpls().gCheckFailure();
		//
		executeAction("re_edit");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("force_commit");
		getTask().getGoqrpls().gCheckFailure();
		goItem(toStr("frbgrnt.frbgrnt_COAS_CODE"));
		getTask().getGoqrpls().gCheckFailure();
		return;
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_PASS_THRU_INFO
	 * DECLARE temp_var1 varchar2(1); temp_var2 varchar2(1); CURSOR c1 IS SELECT
	 * 'X' FROM FRRAGPT WHERE frragpt_grnt_code =
	 * :key_block.display_frbgrnt_code; cursor c2 is select 'x' from frrprpt
	 * where frrprpt_prop_code = :key_block.display_prop_code; BEGIN
	 * execute_trigger('force_commit'); g$_check_failure;
	 * 
	 * OPEN c1; FETCH c1 INTO temp_var1; OPEN c2; FETCH c2 INTO temp_var2;
	 * 
	 * IF ( (c1%NOTFOUND) AND (c2%NOTFOUND) ) THEN go_block('FRRAGPT');
	 * g$_check_failure; RETURN; RAISE form_trigger_failure; ELSIF ( c1%FOUND
	 * AND c2%NOTFOUND ) THEN :form_header.from_execute_query := 'Y';
	 * execute_trigger('get_pass_thru_details'); g$_check_failure;
	 * go_block('FRRAGPT'); clear_block(no_validate); execute_query; enter;
	 * g$_check_failure; execute_trigger('get_percentage_total');
	 * g$_check_failure; :form_header.from_execute_query := 'N'; ELSIF (
	 * (c1%NOTFOUND AND c2%FOUND ) OR ( c1%FOUND AND c2%FOUND ))THEN --
	 * execute_trigger('copy_from_frrprpt_to_frragpt'); g$_check_failure;
	 * execute_trigger('get_pass_thru_details'); g$_check_failure;
	 * go_block('FRRAGPT'); clear_block(no_validate); execute_query; enter;
	 * g$_check_failure; execute_trigger('get_percentage_total');
	 * g$_check_failure; END IF; CLOSE c1; CLOSE c2; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_PASS_THRU_INFO
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_PASS_THRU_INFO")
	public void Fragrnt_MnuOptPassThruInfo() {

		int rowCount = 0;
		{
			NString tempVar1 = NString.getNull();
			NString tempVar2 = NString.getNull();
			String sqlc1 = "SELECT 'X' "
					+ " FROM FRRAGPT "
					+ " WHERE frragpt_grnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE ";
			DataCursor c1 = new DataCursor(sqlc1);
			String sqlc2 = "SELECT 'x' "
					+ " FROM frrprpt "
					+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
			DataCursor c2 = new DataCursor(sqlc2);
			try {
				executeAction("force_commit");
				getTask().getGoqrpls().gCheckFailure();
				// Setting query parameters
				c1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", getFormModel()
						.getKeyBlock().getDisplayFrbgrntCode());
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					tempVar1 = c1Results.getStr(0);
				}
				// Setting query parameters
				c2.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE", getFormModel()
						.getKeyBlock().getDisplayPropCode());
				c2.open();
				ResultSet c2Results = c2.fetchInto();
				if (c2Results != null) {
					tempVar2 = c2Results.getStr(0);
				}
				if (((c1.notFound()) && (c2.notFound()))) {
					goBlock(toStr("FRRAGPT"));
					getTask().getGoqrpls().gCheckFailure();
					return;
					// throw new ApplicationException();
				} else if ((c1.found() && c2.notFound())) {
					getFormModel().getFormHeader().setFromExecuteQuery(toStr("Y"));
					executeAction("get_pass_thru_details");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("FRRAGPT"));
					clearBlock(TaskServices.NO_VALIDATE);
					executeQuery();
	
					getTask().getGoqrpls().gCheckFailure();
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getFormHeader().setFromExecuteQuery(toStr("N"));
				} else if (((c1.notFound() && c2.found()) || (c1.found() && c2
						.found()))) {
					// execute_trigger('copy_from_frrprpt_to_frragpt');
					getTask().getGoqrpls().gCheckFailure();
					executeAction("get_pass_thru_details");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("FRRAGPT"));
					clearBlock(TaskServices.NO_VALIDATE);
					executeQuery();
					
					getTask().getGoqrpls().gCheckFailure();
					executeAction("get_percentage_total");
					getTask().getGoqrpls().gCheckFailure();
				}
			} finally {
				c1.close();
				c2.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_PASS_THRU_DETAILS
	 * DECLARE l_data_exists varchar2(1) := 'N';
	 * 
	 * CURSOR c1 IS SELECT frragpt_agcy_pidm, frragpt_federal_fund_percent FROM
	 * FRRAGPT WHERE frragpt_grnt_code = :key_block.display_frbgrnt_code;
	 * 
	 * CURSOR c2 IS SELECT s.spriden_pidm FROM spriden s, ftvagcy f WHERE
	 * f.ftvagcy_agcy_code_pidm = s.spriden_pidm and spriden_entity_ind = 'C';
	 * 
	 * lv_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL; lv_id SPRIDEN.SPRIDEN_ID%TYPE
	 * := NULL; BEGIN OPEN c1; LOOP FETCH c1 INTO :frragpt.frragpt_agcy_pidm,
	 * :frragpt.frragpt_federal_fund_percent; IF c1%FOUND THEN l_data_exists :=
	 * 'Y'; OPEN c2; FETCH c2 INTO lv_pidm; --RPE# 1-19V7ZZD: All occurances of
	 * the word "Agent" changed to "Agency" G$_CHECK_VALUE(lv_pidm IS NULL,
	 * G$_NLS.Get('FRAGRNT-0081', 'FORM','Agency Name not Found'), TRUE);
	 * g$_sel_spriden_id_name(lv_pidm, 'FRRAGPT.FRRAGPT_AGCY_NAME', 'Y', lv_id);
	 * ELSE l_data_exists := 'N'; EXIT; END IF; CLOSE c2;
	 * 
	 * IF l_data_exists = 'Y' THEN :frbgrnt.display_pass_thru_ind := 'Y'; ELSE
	 * IF l_data_exists = 'N' THEN :frbgrnt.display_pass_thru_ind := 'N'; END
	 * IF; END IF; END LOOP; CLOSE c1; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_PASS_THRU_DETAILS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_PASS_THRU_DETAILS")
	public void Fragrnt_GetPassThruDetails() {

		FrragptAdapter frragptElement = (FrragptAdapter) this.getFormModel()
				.getFrragpt().getRowAdapter(true);
		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frragptElement==null || frbgrntElement==null)
			return;

		int rowCount = 0;
		{
			NString lDataExists = toStr("N");
			String sqlc1 = "SELECT frragpt_agcy_pidm, frragpt_federal_fund_percent "
					+ " FROM FRRAGPT "
					+ " WHERE frragpt_grnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE ";
			DataCursor c1 = new DataCursor(sqlc1);
			String sqlc2 = "SELECT s.spriden_pidm "
					+ " FROM spriden s, ftvagcy f "
					+ " WHERE f.ftvagcy_agcy_code_pidm = s.spriden_pidm AND spriden_entity_ind = 'C' ";
			DataCursor c2 = new DataCursor(sqlc2);
			try {
				NNumber lvPidm = NNumber.getNull();
				NString lvId = NString.getNull();
				// Setting query parameters
				c1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", getFormModel()
						.getKeyBlock().getDisplayFrbgrntCode());
				c1.open();
				while (true) {
					ResultSet c1Results = c1.fetchInto();
					if (c1Results != null) {
						frragptElement.setFrragptAgcyPidm(c1Results.getNumber(0));
						frragptElement.setFrragptFederalFundPercent(c1Results
								.getNumber(1));
					}
					if (c1.found()) {
						lDataExists = toStr("Y");
						c2.open();
						ResultSet c2Results = c2.fetchInto();
						if (c2Results != null) {
							lvPidm = c2Results.getNumber(0);
						}
						// RPE# 1-19V7ZZD: All occurances of the word "Agent"
						// changed to "Agency"
						getTask().getGoqrpls().gCheckValue(
								toBool(lvPidm.isNull()),
								GNls.Fget(toStr("FRAGRNT-0081"), toStr("FORM"),
										toStr("Agency Name not Found")),
								toBool(NBool.True));
						Ref<NString> pId_ref = new Ref<NString>(lvId);
						getTask().getGoqrpls().gSelSpridenIdName(lvPidm,
								toStr("FRRAGPT.FRRAGPT_AGCY_NAME"), toStr("Y"),
								pId_ref);
						lvId = pId_ref.val;
					} else {
						lDataExists = toStr("N");
						break;
					}
					c2.close();
					if (lDataExists.equals("Y")) {
						frbgrntElement.setDisplayPassThruInd(toStr("Y"));
					} else {
						if (lDataExists.equals("N")) {
							frbgrntElement.setDisplayPassThruInd(toStr("N"));
						}
					}
				}
			} finally {
				c1.close();
				c2.close();
			}

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_PERCENTAGE_TOTAL
	 * DECLARE l_total number :=0; BEGIN :SYSTEM.MESSAGE_LEVEL := '20';
	 * <multilinecomment> 54-0001 </multilinecomment> go_block('frragpt');
	 * enter; g$_check_failure; :SYSTEM.MESSAGE_LEVEL := '5'; first_record;
	 * :SYSTEM.MESSAGE_LEVEL := '0'; LOOP l_total := l_total +
	 * NVL(:frragpt.frragpt_federal_fund_percent,0); :form_header.total :=
	 * l_total; IF (l_total > 100) THEN message( G$_NLS.Get('FRAGRNT-0082',
	 * 'FORM','Percentage Exceeds 100!') ); RAISE form_trigger_failure; END IF;
	 * IF :SYSTEM.last_record = 'TRUE' THEN EXIT; ELSE next_record; END IF; END
	 * LOOP; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_PERCENTAGE_TOTAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_PERCENTAGE_TOTAL")
	public void Fragrnt_GetPercentageTotal() {

		FrragptAdapter frragptElement = (FrragptAdapter) this.getFormModel().getFrragpt().getRowAdapter(true);
		
		if(frragptElement==null)
			return;

		{
			NNumber lTotal = toNumber(0);

			try {

				//MessageServices.setMessageLevel(MessageLevel.NONE);
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(20));
				// 54-0001
				//goBlock(toStr("frragpt"));
				if(frragptElement.getIndex()!=0){
					getTask().getGoqrpls().gCheckFailure();
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					firstRecord();	//VEM DAQUI mensagem
				}else{
					getTask().getGoqrpls().gCheckFailure();
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					if(frragptElement.getFrragptFederalFundPercent().isNull()){
						errorMessage(GNls.Fget(toStr("FOAIDEN-0020"), toStr("FORM"), toStr("*ERROR* Percentage Should Be Entered")));
						throw new ApplicationException();
					}
				
				}
				
	
			} finally {
				//MessageServices.resetMessageLevel();
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
			}
						
			while (true) {
				lTotal = lTotal.add(isNull(frragptElement.getFrragptFederalFundPercent(), 0));
				getFormModel().getFormHeader().setTotal(lTotal);
				getFormModel().getFormHeader().setPreTotal(lTotal);
				if ((lTotal.greater(100))) {
					errorMessage(GNls.Fget(toStr("FRAGRNT-0082"), toStr("FORM"),toStr("Percentage Exceeds 100!")));
					throw new ApplicationException();
				}
				if (isInLastRecord()) {
					break;
				} else {
					nextRecord();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ONE_RECORD_MANDATORY NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.ONE_RECORD_MANDATORY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ONE_RECORD_MANDATORY")
	public void Fragrnt_OneRecordMandatory() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ID_TO_PIDM DECLARE
	 * hold_pidm number(9); CURSOR s_pidm IS SELECT SPRIDEN_PIDM FROM SPRIDEN
	 * WHERE SPRIDEN_ID = :frragpt.frragpt_agency_code ; BEGIN OPEN s_pidm;
	 * FETCH s_pidm INTO hold_pidm; :frragpt.frragpt_agcy_pidm := hold_pidm;
	 * CLOSE s_pidm; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ID_TO_PIDM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ID_TO_PIDM")
	public void Fragrnt_IdToPidm() {

		FrragptAdapter frragptElement = (FrragptAdapter) this.getFormModel()
				.getFrragpt().getRowAdapter(true);
		if (frragptElement != null) {
	
			int rowCount = 0;
			{
				NNumber holdPidm = NNumber.getNull();
				String sqlsPidm = "SELECT SPRIDEN_PIDM " + " FROM SPRIDEN "
						+ " WHERE SPRIDEN_ID = :FRRAGPT_FRRAGPT_AGENCY_CODE ";
				DataCursor sPidm = new DataCursor(sqlsPidm);
				try {
					// Setting query parameters
					sPidm.addParameter("FRRAGPT_FRRAGPT_AGENCY_CODE",
							frragptElement.getFrragptAgencyCode());
		
					sPidm.open();
					ResultSet sPidmResults = sPidm.fetchInto();
					if (sPidmResults != null) {
						holdPidm = sPidmResults.getNumber(0);
					}
					frragptElement.setFrragptAgcyPidm(holdPidm);
				} finally {
					sPidm.close();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.GET_STATUS_DESC declare
	 * cursor c1 is select ftvsdat_title from ftvsdat where
	 * ftvsdat_sdat_code_entity = 'FRBGRNT' and ftvsdat_sdat_code_attr =
	 * 'STATUS_CODE' and ftvsdat_sdat_code_opt_1 = :frbgrnt_status_code and
	 * ftvsdat_eff_date <= sysdate and (ftvsdat_nchg_date is null or
	 * ftvsdat_nchg_date > sysdate) and ftvsdat_status_ind = 'A'; begin open c1;
	 * fetch c1 into :status_descr; :form_header.store_org_status_desc :=
	 * :status_descr; if c1%notfound then message( G$_NLS.Get('FRAGRNT-0083',
	 * 'FORM','Status is invalid. LIST is available.') ); close c1; raise
	 * form_trigger_failure; end if; end; :frbgrnt.status_descr :=
	 * :form_header.store_org_status_desc ||' '||
	 * :frbgrnt.frbgrnt_alternate_status_desc;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.GET_STATUS_DESC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GET_STATUS_DESC")
	public void Fragrnt_GetStatusDesc() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		{
			String sqlc1 = "SELECT ftvsdat_title "
					+ " FROM ftvsdat "
					+ " WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_STATUS_CODE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				// Setting query parameters
				c1.addParameter("FRBGRNT_STATUS_CODE",
						frbgrntElement.getFrbgrntStatusCode());
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					frbgrntElement.setStatusDescr(c1Results.getStr(0));
				}
				getFormModel().getFormHeader().setStoreOrgStatusDesc(
						frbgrntElement.getStatusDescr());
				if (c1.notFound()) {
					findItem("FRBGRNT_STATUS_CODE").setValid(false);
					errorMessage(GNls.Fget(toStr("FRAGRNT-0083"), toStr("FORM"),
							toStr("Status is invalid. LIST is available.")));
					throw new ApplicationException();
				}
			} finally {
				c1.close();
			}
		}
		frbgrntElement.setStatusDescr(getFormModel().getFormHeader()
				.getStoreOrgStatusDesc().append(" ")
				.append(frbgrntElement.getFrbgrntAlternateStatusDesc()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_UNCHECK_PT declare
	 * temp1 varchar2(1); temp2 varchar2(1); cursor c1 is select 'x' from
	 * frragpt where frragpt_grnt_code = :key_block.display_frbgrnt_code; cursor
	 * c2 is select 'x' from frrprpt where frrprpt_prop_code =
	 * :key_block.display_prop_code; begin open c1; fetch c1 into temp1; if
	 * c1%found then :frbgrnt.display_pass_thru_ind := 'Y'; else if c1%notfound
	 * then :frbgrnt.display_pass_thru_ind := 'N'; end if; end if; IF
	 * :key_block.display_prop_code IS NOT NULL THEN open c2; fetch c2 into
	 * temp2; if ( ( c1%FOUND AND c2%FOUND ) or ( c1%FOUND AND c2%NOTFOUND ) or
	 * ( c1%NOTFOUND AND c2%FOUND ) ) then :frbgrnt.display_pass_thru_ind :=
	 * 'Y'; else if ( c1%NOTFOUND AND c2%NOTFOUND ) then
	 * :frbgrnt.display_pass_thru_ind := 'N'; end if; end if; close c2; END IF;
	 * close c1; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_UNCHECK_PT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_UNCHECK_PT")
	public void Fragrnt_CheckUncheckPt() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		{
			NString temp1 = NString.getNull();
			NString temp2 = NString.getNull();
			String sqlc1 = "SELECT 'x' "
					+ " FROM frragpt "
					+ " WHERE frragpt_grnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				String sqlc2 = "SELECT 'x' "
						+ " FROM frrprpt "
						+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
				DataCursor c2 = new DataCursor(sqlc2);
				try {
					// Setting query parameters
					c1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", getFormModel()
							.getKeyBlock().getDisplayFrbgrntCode());
					c1.open();
					ResultSet c1Results = c1.fetchInto();
					if (c1Results != null) {
						temp1 = c1Results.getStr(0);
					}
					if (c1.found()) {
						frbgrntElement.setDisplayPassThruInd(toStr("Y"));
					} else {
						if (c1.notFound()) {
							frbgrntElement.setDisplayPassThruInd(toStr("N"));
						}
					}
					if (!getFormModel().getKeyBlock().getDisplayPropCode().isNull()) {
						// Setting query parameters
						c2.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE", getFormModel()
								.getKeyBlock().getDisplayPropCode());
						c2.open();
						ResultSet c2Results = c2.fetchInto();
						if (c2Results != null) {
							temp2 = c2Results.getStr(0);
						}
						if (((c1.found() && c2.found())
								|| (c1.found() && c2.notFound()) || (c1.notFound() && c2
								.found()))) {
							frbgrntElement.setDisplayPassThruInd(toStr("Y"));
						} else {
							if ((c1.notFound() && c2.notFound())) {
								frbgrntElement.setDisplayPassThruInd(toStr("N"));
							}
						}
					}
				} finally {
					c2.close();
				}
			} finally {
				c1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * FRAGRNT.COPY_FROM_FRRPRPT_TO_FRRAGPT DECLARE pti_temp varchar2(1); cursor
	 * check_data is select 'X' from FRRPRPT where frrprpt_prop_code =
	 * :key_block.display_prop_code; cursor c1 is select * from frrprpt where
	 * frrprpt_prop_code = :key_block.display_prop_code; BEGIN
	 * :system.message_level := 10; open check_data; fetch check_data into
	 * pti_temp; if check_data%NOTFOUND then message( G$_NLS.Get('FRAGRNT-0084',
	 * 'FORM','No PT Data for Proposal...') ); close check_data; RETURN; end if;
	 * close check_data;
	 * 
	 * for x in c1 loop --RPE# 1-19V7ZZD : Include the new sponsor Id column
	 * also in the insert list INSERT INTO FRRAGPT ( FRRAGPT_GRNT_CODE,
	 * FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID,
	 * FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID) SELECT
	 * :key_block.display_FRBGRNT_CODE, x.FRRPRPT_AGCY_PIDM, sysdate,
	 * :global.user_id, x.FRRPRPT_FEDERAL_FUND_PERCENT, FRRPRPT_SPONSOR_ID FROM
	 * FRRPRPT WHERE frrprpt_prop_code = :key_block.display_prop_code; end loop;
	 * :SYSTEM.MESSAGE_LEVEL := '5'; commit; :SYSTEM.MESSAGE_LEVEL := '0'; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.COPY_FROM_FRRPRPT_TO_FRRAGPT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "COPY_FROM_FRRPRPT_TO_FRRAGPT")
	public void Fragrnt_CopyFromFrrprptToFrragpt() {

		int rowCount = 0;
		{
			NString ptiTemp = NString.getNull();
			String sqlcheckData = "SELECT 'X' "
					+ " FROM FRRPRPT "
					+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			String sqlc1 = "SELECT * "
					+ " FROM frrprpt "
					+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
			DataCursor c1 = new DataCursor(sqlc1);
			MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(10));
			// Setting query parameters
			try {
				checkData.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE",
						getFormModel().getKeyBlock().getDisplayPropCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if (checkDataResults != null) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if (checkData.notFound()) {
//					message(GNls.Fget(toStr("FRAGRNT-0084"), toStr("FORM"),
//							toStr("No PT Data for Proposal...")));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0084"), toStr("FORM"),
							toStr("No PT Data for Proposal...")));
					return;
				}
			} finally {
				checkData.close();
			}
			

			try {
				// Setting query parameters
				c1.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE", getFormModel()
						.getKeyBlock().getDisplayPropCode());
				c1.open();
				while (true) {
					TableRow x = c1.fetchRow();
					if (c1.notFound())
						break;
					// RPE# 1-19V7ZZD : Include the new sponsor Id column also
					// in the insert list
					String sql1 = "INSERT INTO FRRAGPT "
							+ "(FRRAGPT_GRNT_CODE, FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID)"
							+ "SELECT :KEY_BLOCK_DISPLAY_FRBGRNT_CODE, :P_X_FRRPRPT_AGCY_PIDM, sysdate, :GLOBAL_USER_ID, :P_X_FRRPRPT_FEDERAL_FUND_PERCENT, FRRPRPT_SPONSOR_ID "
							+ " FROM FRRPRPT "
							+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE",
							getFormModel().getKeyBlock()
									.getDisplayFrbgrntCode());
					command1.addParameter("P_X_FRRPRPT_AGCY_PIDM",
							x.getNumber("FRRPRPT_AGCY_PIDM"));
					command1.addParameter("GLOBAL_USER_ID",
							getGlobal("USER_ID"));
					command1.addParameter("P_X_FRRPRPT_FEDERAL_FUND_PERCENT",
							x.getNumber("FRRPRPT_FEDERAL_FUND_PERCENT"));
					command1.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE",
							getFormModel().getKeyBlock().getDisplayPropCode());
					rowCount = command1.execute();
				}
			} finally {
				c1.close();
			}
			try { 
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
			commitTask();
			} finally {
						
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}
						
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_DUPLICATE_AGENCY_CODE
	 * DECLARE cur_agency_code varchar2(9); total_rec number(2); cur_record_no
	 * number(2); i number(2) := 1; BEGIN :SYSTEM.MESSAGE_LEVEL := '5';
	 * last_record; total_rec := :system.cursor_record; if total_rec = 1 then
	 * return; end if; for i in 1..total_rec loop go_record(i); cur_agency_code
	 * := :frragpt.frragpt_agency_code; first_record; LOOP if
	 * :system.cursor_record = i then next_record; else IF
	 * :frragpt.frragpt_agency_code = cur_agency_code THEN message(
	 * G$_NLS.Get('FRAGRNT-0085', 'FORM','Duplicate Agency Code') ); RAISE
	 * form_trigger_failure; END IF; IF :system.last_record = 'TRUE' THEN EXIT;
	 * ELSE next_record; END IF; end if; END LOOP; end loop;
	 * go_record(total_rec); :SYSTEM.MESSAGE_LEVEL := '0'; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_DUPLICATE_AGENCY_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_DUPLICATE_AGENCY_CODE")
	public void Fragrnt_CheckDuplicateAgencyCode() {

		FrragptAdapter frragptElement = (FrragptAdapter) this.getFormModel()
				.getFrragpt().getRowAdapter(true);
		
		if(frragptElement==null)
			return;

		{
			NString curAgencyCode = NString.getNull();
			NNumber totalRec = NNumber.getNull();
			NNumber curRecordNo = NNumber.getNull();
			NNumber i = toNumber(1);
			try { 
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
			lastRecord();
			totalRec = getCursorRecord();
			if (totalRec.equals(1)) {
				return;
			}
			// for ( i = 1; i <= totalRec; i+= 1 )
			for (i.equals(1); i.lesserOrEquals(totalRec); i=i.add(1)) {
				setCurrentRecord(i);
				curAgencyCode = frragptElement.getFrragptAgencyCode();
				firstRecord();
				while (true) {
					if (getCursorRecord().equals(i)) {
						nextRecord();
					} else {
						if (frragptElement.getFrragptAgencyCode().equals(
								curAgencyCode)) {
							errorMessage(GNls.Fget(toStr("FRAGRNT-0085"),
									toStr("FORM"),
									toStr("Duplicate Agency Code")));
							throw new ApplicationException();
						}
						if (isInLastRecord()) {
							break;
						} else {
							nextRecord();
						}
					}
				}
			}
			setCurrentRecord(totalRec);
			} finally {
						
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}
						
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.COPY_PT DECLARE temp
	 * varchar2(1); temp1 varchar2(1); temp2 varchar2(1); CURSOR c1 IS SELECT
	 * 'X' FROM FRRAGPT WHERE frragpt_grnt_code =
	 * :key_block.display_frbgrnt_code; cursor c2 is select 'x' from frrprpt
	 * where frrprpt_prop_code = :key_block.display_prop_code; BEGIN OPEN c1;
	 * OPEN c2; fetch c1 into temp1; fetch c2 into temp2; IF ( (c1%NOTFOUND AND
	 * c2%FOUND ) OR ( c1%FOUND AND c2%FOUND ))THEN begin fetch c1 into temp;
	 * exception when no_data_found then
	 * execute_trigger('copy_from_frrprpt_to_frragpt'); g$_check_failure; when
	 * too_many_rows then null; when others then null; end; END IF; CLOSE c1;
	 * CLOSE c2; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.COPY_PT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "COPY_PT")
	public void Fragrnt_CopyPt() {

		int rowCount = 0;
		{
			NString temp = NString.getNull();
			NString temp1 = NString.getNull();
			NString temp2 = NString.getNull();
			String sqlc1 = "SELECT 'X' "
					+ " FROM FRRAGPT "
					+ " WHERE frragpt_grnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE ";
			DataCursor c1 = new DataCursor(sqlc1);
			String sqlc2 = "SELECT 'x' "
					+ " FROM frrprpt "
					+ " WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_PROP_CODE ";
			DataCursor c2 = new DataCursor(sqlc2);
			try {
				// Setting query parameters
				c1.addParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", getFormModel()
						.getKeyBlock().getDisplayFrbgrntCode());
				c1.open();
				// Setting query parameters
				c2.addParameter("KEY_BLOCK_DISPLAY_PROP_CODE", getFormModel()
						.getKeyBlock().getDisplayPropCode());
				c2.open();
				ResultSet c1Results = c1.fetchInto();
				if (c1Results != null) {
					temp1 = c1Results.getStr(0);
				}
				ResultSet c2Results = c2.fetchInto();
				if (c2Results != null) {
					temp2 = c2Results.getStr(0);
				}
				if (((c1.notFound() && c2.found()) || (c1.found() && c2.found()))) {
					try {
						// ResultSet c1Results = c1.fetchInto();
						ResultSet c1Results_1 = c1.fetchInto();
						if (c1Results_1 != null) {
							temp = c1Results_1.getStr(0);
						}
					} catch (NoDataFoundException e) {
						executeAction("copy_from_frrprpt_to_frragpt");
						getTask().getGoqrpls().gCheckFailure();
					} catch (TooManyRowsException e) {
					} catch (Exception e) {
					}
				}
			} finally {
				c1.close();
				c2.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.FETCH_AGENCY_NAME DECLARE
	 * hold_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL; agency_pidm
	 * SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
	 * 
	 * CURSOR S_PIDM IS SELECT SPRIDEN_PIDM FROM SPRIDEN WHERE SPRIDEN_ID =
	 * :FRRAGPT.FRRAGPT_AGENCY_CODE;
	 * 
	 * CURSOR VALIDATE_AGCY_CODE IS SELECT FTVAGCY_AGCY_CODE_PIDM FROM FTVAGCY
	 * WHERE FTVAGCY_AGCY_CODE_PIDM = hold_pidm; BEGIN :FRRAGPT_AGCY_NAME :=
	 * NULL;
	 * 
	 * OPEN S_PIDM; FETCH S_PIDM INTO HOLD_PIDM; CLOSE S_PIDM;
	 * 
	 * OPEN VALIDATE_AGCY_CODE; FETCH VALIDATE_AGCY_CODE INTO agency_pidm;
	 * G$_CHECK_VALUE(VALIDATE_AGCY_CODE%NOTFOUND, G$_NLS.Get('FRAGRNT-0086',
	 * 'FORM', 'Agency ID is new; please create Agency using FTMAGCY.'), TRUE);
	 * CLOSE VALIDATE_AGCY_CODE;
	 * 
	 * g$_sel_spriden_id_name(hold_pidm, 'FRRAGPT_AGCY_NAME', 'Y',
	 * :FRRAGPT.FRRAGPT_AGENCY_CODE); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.FETCH_AGENCY_NAME
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "FETCH_AGENCY_NAME")
	public void Fragrnt_FetchAgencyName() {

		FrragptAdapter frragptElement = (FrragptAdapter) this.getFormModel()
				.getFrragpt().getRowAdapter(true);

		if(frragptElement==null)
			return;
		
		int rowCount = 0;
		{
			NNumber holdPidm = NNumber.getNull();
			NNumber agencyPidm = NNumber.getNull();
			String sqlsPidm = "SELECT SPRIDEN_PIDM " + " FROM SPRIDEN "
					+ " WHERE SPRIDEN_ID = :FRRAGPT_FRRAGPT_AGENCY_CODE ";
			DataCursor sPidm = new DataCursor(sqlsPidm);
			String sqlvalidateAgcyCode = "SELECT FTVAGCY_AGCY_CODE_PIDM "
					+ " FROM FTVAGCY "
					+ " WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM ";
			DataCursor validateAgcyCode = new DataCursor(sqlvalidateAgcyCode);
			try {
				frragptElement.setFrragptAgcyName(toStr(null));
				// Setting query parameters
				sPidm.addParameter("FRRAGPT_FRRAGPT_AGENCY_CODE",
						frragptElement.getFrragptAgencyCode());
	
				sPidm.open();
				ResultSet sPidmResults = sPidm.fetchInto();
				if (sPidmResults != null) {
					holdPidm = sPidmResults.getNumber(0);
				}
				sPidm.close();
				// Setting query parameters
				validateAgcyCode.addParameter("P_HOLD_PIDM", holdPidm);
	
				validateAgcyCode.open();
				ResultSet validateAgcyCodeResults = validateAgcyCode.fetchInto();
				if (validateAgcyCodeResults != null) {
					agencyPidm = validateAgcyCodeResults.getNumber(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(validateAgcyCode.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0086"),
										toStr("FORM"),
										toStr("Agency ID is new; please create Agency using FTMAGCY.")),
								toBool(NBool.True));
				validateAgcyCode.close();
				Ref<NString> pId_ref = new Ref<NString>(
						frragptElement.getFrragptAgencyCode());
				getTask().getGoqrpls().gSelSpridenIdName(holdPidm,
						toStr("FRRAGPT_AGCY_NAME"), toStr("Y"), pId_ref);
				frragptElement.setFrragptAgencyCode(pId_ref.val);
			} finally {
				sPidm.close();
				validateAgcyCode.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN-NEW-FORM-INSTANCE
	 * G$_SET_WIN_PROPERTY; EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
	 * G$_CHECK_FAILURE ; G$_SET_INST_PROPERTY; --
	 * EXECUTE_TRIGGER('DISABLE_BUTTONS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('DISABLE_PAGES'); :frbgrnt.display_pass_thru_ind := 'N';
	 * 
	 * --
	 * 
	 * EXECUTE_TRIGGER('DISABLE_I18N_FIELDS'); g$_check_failure;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void Fragrnt_TaskStarted(EventObject args) {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			getTask().getGoqrpls().gSetWinProperty();
			executeAction("LOAD_FORM_HEADER");
			getTask().getGoqrpls().gCheckFailure();
			getTask().getGoqrpls().gSetInstProperty();
			//
			executeAction("DISABLE_BUTTONS");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("DISABLE_PAGES");
			frbgrntElement.setDisplayPassThruInd(toStr("N"));
			//
			executeAction("DISABLE_I18N_FIELDS");
			getTask().getGoqrpls().gCheckFailure();
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * BEGIN IF :HOLD_PRESS = 'Y' THEN :HOLD_PRESS := 'N'; RETURN; END IF;
	 * 
	 * IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN :frbgrnt.display_pass_thru_ind
	 * := 'N'; :FORM_HEADER.NEXT_DOC_NUM := fokutil.f_next_display;
	 * 
	 * SET_ITEM_PROPERTY('KEY_BLOCK.DISPLAY_FRBGRNT_CODE',HINT_TEXT,
	 * g$_nls.get('FRAGRNT-0087','FORM','Enter the Grant Code or use %01% for an
	 * automatic number generation.',:FORM_HEADER.NEXT_DOC_NUM)); RETURN; END
	 * IF;
	 * 
	 * IF :CHECK_KEYS = 'Y' THEN CLEAR_BLOCK(NO_VALIDATE);
	 * GO_BLOCK('KEY_BLOCK'); G$_CHECK_FAILURE; IF :DISPLAY_frbgrnt_CODE IS NULL
	 * THEN MESSAGE( G$_NLS.Get('FRAGRNT-0088', 'FORM','Grant Code must be
	 * entered.') ); RAISE FORM_TRIGGER_FAILURE; END IF; NEXT_BLOCK;
	 * G$_CHECK_FAILURE; IF SELECT_frbgrnt_1(:DISPLAY_frbgrnt_CODE) then IF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
	 * EXECUTE_TRIGGER('EDIT_ORGN_SECURITY_AFTER_QUERY'); IF NOT FORM_SUCCESS
	 * THEN :CHECK_KEYS := 'N'; GO_ITEM('DISPLAY_frbgrnt_CODE'); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END IF;
	 * SELECT_FRBGRNT_PROP(:DISPLAY_FRBGRNT_CODE); CLEAR_BLOCK; EXECUTE_QUERY;
	 * ELSIF SELECT_FRAPROP_1(:DISPLAY_PROP_CODE) then IF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
	 * EXECUTE_TRIGGER('EDIT_ORGN_SECURITY_AFTER_QUERY'); IF NOT FORM_SUCCESS
	 * THEN :CHECK_KEYS := 'N'; GO_ITEM('DISPLAY_prop_CODE'); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END IF; ----- CLEAR_BLOCK;
	 * frbprop_is_not_null(:display_prop_code); g$_check_failure;
	 * :copy_from_prop := 'Y'; SET_PIDM_FIELDS; END IF;
	 * EXECUTE_TRIGGER('DISABLE_KEYS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('ENABLE_PAGES');--FOR TAB CANVAS G$_CHECK_FAILURE;
	 * 
	 * IF NAME_IN('GLOBAL.HRESYS')='Y' THEN
	 * G$_NAVIGATION_FRAME.ENABLE_OPTION('3.11','P'); ELSE
	 * G$_NAVIGATION_FRAME.DISABLE_OPTION('3.11','P'); END IF; -- IF
	 * :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
	 * EXECUTE_TRIGGER('ENABLE_BUTTONS'); G$_CHECK_FAILURE; ELSE
	 * EXECUTE_TRIGGER('ENABLE_BUTTONS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW'); G$_CHECK_FAILURE; END IF;
	 * -- EXECUTE_TRIGGER('CHECK_TEXT'); G$_CHECK_FAILURE; :CHECK_KEYS := 'N';
	 * -- END IF;
	 * 
	 * IF G$_QUERY_ONLY_ROLE THEN GOTO END_TRIG; END IF;
	 * 
	 * if :key_block.display_prop_code is not null and :SYSTEM.CURSOR_BLOCK <>
	 * 'FRRGREC' then execute_trigger('key-commit'); execute_trigger('copy_pt');
	 * -- 54-0025 EXECUTE_TRIGGER('CHECK_UNCHECK_PT'); G$_CHECK_FAILURE; end if;
	 * 
	 * <<END_TRIG>> NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void Fragrnt_WhenNewBlockInstanceTrg() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {

			if (getFormModel().getFormHeader().getHoldPress().equals("Y")) {
				getFormModel().getFormHeader().setHoldPress(toStr("N"));
				return;
			}
			if (getCursorBlock().equals("KEY_BLOCK")) {
				frbgrntElement.setDisplayPassThruInd(toStr("N"));
				getFormModel().getFormHeader().setNextDocNum(
						Fokutil.fNextDisplay());
				setItemHint(
						"KEY_BLOCK.DISPLAY_FRBGRNT_CODE",
						GNls.Fget(
								toStr("FRAGRNT-0087"),
								toStr("FORM"),
								toStr("Enter the Grant Code or use %01% for an automatic number generation."),
								getFormModel().getFormHeader().getNextDocNum()));
				return;
			}
			if (getFormModel().getFormHeader().getCheckKeys().equals("Y")) {
				//clearBlock(TaskServices.NO_VALIDATE);
				goBlock(toStr("KEY_BLOCK"));
				getTask().getGoqrpls().gCheckFailure();
				if (getFormModel().getKeyBlock().getDisplayFrbgrntCode().isNull()) 
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0088"), toStr("FORM"),toStr("Grant Code must be entered.")));
					throw new ApplicationException();
				}
				nextBlock();
				getTask().getGoqrpls().gCheckFailure();
				if (this.getTask()
						.getServices()
						.selectFrbgrnt1(
								getFormModel().getKeyBlock()
										.getDisplayFrbgrntCode()).getValue()) {
					if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
						try {
							executeAction("EDIT_ORGN_SECURITY_AFTER_QUERY");		
						} catch (Exception e) {
							getFormModel().getFormHeader().setCheckKeys(
									toStr("N"));
							goItem(toStr("DISPLAY_frbgrnt_CODE"));
							throw new ApplicationException();
						}
					}
					this.getTask()
							.getServices()
							.selectFrbgrntProp(
									getFormModel().getKeyBlock()
											.getDisplayFrbgrntCode());
					clearBlock();
					executeQuery();
				} else if (this
						.getTask()
						.getServices()
						.selectFraprop1(
								getFormModel().getKeyBlock()
										.getDisplayPropCode()).getValue()) {
					if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
						try {
							executeAction("EDIT_ORGN_SECURITY_AFTER_QUERY");
							// if ( SupportClasses.SQLFORMS.FormSuccess().not()
							// )
							// {
						} catch (Exception e) {
							getFormModel().getFormHeader().setCheckKeys(
									toStr("N"));
							goItem(toStr("DISPLAY_prop_CODE"));
							throw new ApplicationException();
						}
					}
					// ---
					clearBlock();
					this.getTask()
							.getServices()
							.frbpropIsNotNull(
									frbgrntElement,
									getFormModel().getKeyBlock()
											.getDisplayPropCode());
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getFormHeader().setCopyFromProp(toStr("Y"));
					this.getTask().getServices().setPidmFields(frbgrntElement);
				}
				executeAction("DISABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_PAGES");
				// FOR TAB CANVAS
				getTask().getGoqrpls().gCheckFailure();
				if (getNameIn("GLOBAL.HRESYS").equals("Y")) {
					getTask().getGoqrpls().getGNavigationFrame()
							.enableOption(toStr("3.11"), toStr("P"));
				} else {
					getTask().getGoqrpls().getGNavigationFrame()
							.disableOption(toStr("3.11"), toStr("P"));
				}
				//
				if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
					executeAction("ENABLE_BUTTONS");
					getTask().getGoqrpls().gCheckFailure();
				} else {
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
			if (getTask().getGoqrpls().gQueryOnlyRole().getValue()) {
				// goto END_TRIG;
				return;
			}
			if (!getFormModel().getKeyBlock().getDisplayPropCode().isNull()
					&& getCursorBlock().notEquals("FRRGREC")) {
				executeAction("key-commit");
				executeAction("copy_pt");
				// 54-0025
				executeAction("CHECK_UNCHECK_PT");
				getTask().getGoqrpls().gCheckFailure();
			}

			// END_TRIG:;
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.ENABLE_PAGES IF
	 * GET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED) = 'FALSE' THEN
	 * SET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED, PROPERTY_TRUE); END
	 * IF; IF GET_TAB_PAGE_PROPERTY('GRANT_AGENCY_INFORMATION', ENABLED) =
	 * 'FALSE' THEN SET_TAB_PAGE_PROPERTY('GRANT_AGENCY_INFORMATION', ENABLED,
	 * PROPERTY_TRUE); END IF; IF GET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION',
	 * ENABLED) = 'FALSE' THEN SET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION',
	 * ENABLED, PROPERTY_TRUE); END IF; IF
	 * GET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED) = 'FALSE' THEN
	 * SET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED, PROPERTY_TRUE);
	 * END IF; IF GET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED) =
	 * 'FALSE' THEN SET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED,
	 * PROPERTY_TRUE); END IF; IF GET_TAB_PAGE_PROPERTY('BILLING_INFORMATION',
	 * ENABLED) = 'FALSE' THEN SET_TAB_PAGE_PROPERTY('BILLING_INFORMATION',
	 * ENABLED, PROPERTY_TRUE); END IF; IF
	 * GET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED) = 'FALSE' THEN
	 * SET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED, PROPERTY_TRUE); END
	 * IF; --RPE# 1-19V7ZZD IF GET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY',
	 * ENABLED) = 'FALSE' THEN SET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY',
	 * ENABLED, PROPERTY_TRUE); END IF; IF NAME_IN('GLOBAL.HRESYS')='Y' THEN IF
	 * GET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED) = 'FALSE' THEN
	 * SET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED, PROPERTY_TRUE); END
	 * IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.ENABLE_PAGES
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_PAGES")
	public void Fragrnt_EnablePages() {
		if (getTabPageEnabled("HEADER_INFORMATION") == false) {
			setTabPageEnabled("HEADER_INFORMATION", true);
		}
		if (getTabPageEnabled("GRANT_AGENCY_INFORMATION") == false) {
			setTabPageEnabled("GRANT_AGENCY_INFORMATION", true);
		}
		if (getTabPageEnabled("LOCATION_INFORMATION") == false) {
			setTabPageEnabled("LOCATION_INFORMATION", true);
		}
		if (getTabPageEnabled("COST_CODE_INFORMATION") == false) {
			setTabPageEnabled("COST_CODE_INFORMATION", true);
		}
		if (getTabPageEnabled("PERSONNEL_INFORMATION") == false) {
			setTabPageEnabled("PERSONNEL_INFORMATION", true);
		}
		if (getTabPageEnabled("BILLING_INFORMATION") == false) {
			setTabPageEnabled("BILLING_INFORMATION", true);
		}
		if (getTabPageEnabled("USER_DEFINED_DATA") == false) {
			setTabPageEnabled("USER_DEFINED_DATA", true);
		}
		// RPE# 1-19V7ZZD
		if (getTabPageEnabled("PASSTHROUGH_AGENCY") == false) {
			setTabPageEnabled("PASSTHROUGH_AGENCY", true);
		}
		if (getNameIn("GLOBAL.HRESYS").equals("Y")) {
			if (getTabPageEnabled("EFFORT_REPORTING") == false) {
				setTabPageEnabled("EFFORT_REPORTING", true);
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DISABLE_PAGES IF
	 * GET_TAB_PAGE_PROPERTY('GRANT_AGENCY_INFORMATION', ENABLED) = 'TRUE' THEN
	 * SET_TAB_PAGE_PROPERTY('GRANT_AGENCY_INFORMATION', ENABLED,
	 * PROPERTY_FALSE); END IF; IF GET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION',
	 * ENABLED) = 'TRUE' THEN SET_TAB_PAGE_PROPERTY('LOCATION_INFORMATION',
	 * ENABLED, PROPERTY_FALSE); END IF; IF
	 * GET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED) = 'TRUE' THEN
	 * SET_TAB_PAGE_PROPERTY('COST_CODE_INFORMATION', ENABLED, PROPERTY_FALSE);
	 * END IF; IF GET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED) =
	 * 'TRUE' THEN SET_TAB_PAGE_PROPERTY('PERSONNEL_INFORMATION', ENABLED,
	 * PROPERTY_FALSE); END IF; IF GET_TAB_PAGE_PROPERTY('BILLING_INFORMATION',
	 * ENABLED) = 'TRUE' THEN SET_TAB_PAGE_PROPERTY('BILLING_INFORMATION',
	 * ENABLED, PROPERTY_FALSE); END IF; IF
	 * GET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED) = 'TRUE' THEN
	 * SET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED, PROPERTY_FALSE); END
	 * IF; IF GET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED) = 'TRUE' THEN
	 * SET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED, PROPERTY_FALSE); END
	 * IF; --RPE# 1-19V7ZZD IF GET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY',
	 * ENABLED) = 'TRUE' THEN SET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY',
	 * ENABLED, PROPERTY_FALSE); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DISABLE_PAGES
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_PAGES")
	public void Fragrnt_DisablePages() {
		if (getTabPageEnabled("GRANT_AGENCY_INFORMATION") == true) {
			setTabPageEnabled("GRANT_AGENCY_INFORMATION", false);
		}
		if (getTabPageEnabled("LOCATION_INFORMATION") == true) {
			setTabPageEnabled("LOCATION_INFORMATION", false);
		}
		if (getTabPageEnabled("COST_CODE_INFORMATION") == true) {
			setTabPageEnabled("COST_CODE_INFORMATION", false);
		}
		if (getTabPageEnabled("PERSONNEL_INFORMATION") == true) {
			setTabPageEnabled("PERSONNEL_INFORMATION", false);
		}
		if (getTabPageEnabled("BILLING_INFORMATION") == true) {
			setTabPageEnabled("BILLING_INFORMATION", false);
		}
		if (getTabPageEnabled("USER_DEFINED_DATA") == true) {
			setTabPageEnabled("USER_DEFINED_DATA", false);
		}
		if (getTabPageEnabled("EFFORT_REPORTING") == true) {
			setTabPageEnabled("EFFORT_REPORTING", false);
		}
		// RPE# 1-19V7ZZD
		if (getTabPageEnabled("PASSTHROUGH_AGENCY") == true) {
			setTabPageEnabled("PASSTHROUGH_AGENCY", false);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-NXTBLK :del_ready :=
	 * 'N'; IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN NEXT_BLOCK; RETURN; END
	 * IF; --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_1_CANVAS' THEN
	 * 
	 * EXECUTE_TRIGGER('GET_ITEM_NAME'); --IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAGRNT_1_CANVAS'
	 * THEN IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'HEADER_INFORMATION' THEN --FOR TAB CANVAS EXECUTE_TRIGGER('SET_FIELDS');
	 * G$_CHECK_FAILURE; IF :frbgrnt_AGENCY_CODE IS NULL THEN
	 * EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO'); G$_CHECK_FAILURE; RETURN; ELSE
	 * EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO'); G$_CHECK_FAILURE; RETURN; END IF;
	 * END IF; --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_2_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'BILLING_INFORMATION' THEN EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO');
	 * G$_CHECK_FAILURE; RETURN; END IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_3_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'COST_CODE_INFORMATION' THEN--for tab canvas
	 * EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_4_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'PERSONNEL_INFORMATION' THEN--for tab canvas
	 * EXECUTE_TRIGGER('MNU_OPT_BILLING_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF; --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_5_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'USER_DEFINED_DATA' THEN--for tab canvas IF
	 * GET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED) = 'TRUE' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_EFFORT_REPORTING'); G$_CHECK_FAILURE; RETURN;
	 * ELSE EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO'); G$_CHECK_FAILURE; RETURN;
	 * END IF; END IF;
	 * 
	 * IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'EFFORT_REPORTING' THEN--for tab canvas
	 * --EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO'); --RPE# 1-19V7ZZD
	 * EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRBGRNT_6_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'LOCATION_INFORMATION' THEN--for tab canvas
	 * EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --RPE# 1-19V7ZZD IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE)
	 * = 'PASSTHROUGH_AGENCY' THEN--for tab canvas
	 * EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO'); G$_CHECK_FAILURE; RETURN; END IF;
	 * <multilinecomment> IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS)
	 * = 'FRBGRNT_7_CANVAS' THEN EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO');
	 * G$_CHECK_FAILURE; RETURN; END IF; </multilinecomment> --IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAGRNT_2A_CANVAS'
	 * THEN IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'GRANT_AGENCY_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void Fragrnt_NextBlock() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			getFormModel().getFormHeader().setDelReady(toStr("N"));
			if (getCursorBlock().equals("KEY_BLOCK")) {
				nextBlock();
				return;
			}
			
			executeAction("GET_ITEM_NAME");
			
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("HEADER_INFORMATION")) {
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				if (frbgrntElement.getFrbgrntAgencyCode().isNull()) {
					executeAction("MNU_OPT_LOCATION_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return;
				} else {
					executeAction("MNU_OPT_AGENCY_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return;
				}
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("BILLING_INFORMATION")) {
				executeAction("MNU_OPT_USER_CODES_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("COST_CODE_INFORMATION")) {
				executeAction("MNU_OPT_PERSONNEL_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("PERSONNEL_INFORMATION")) {
				executeAction("MNU_OPT_BILLING_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("USER_DEFINED_DATA")) {
				if (getTabPageEnabled("EFFORT_REPORTING") == true) {
					executeAction("MNU_OPT_EFFORT_REPORTING");
					getTask().getGoqrpls().gCheckFailure();
					return;
				} else {
					executeAction("MNU_OPT_HEADER_INFO");
					getTask().getGoqrpls().gCheckFailure();
					return;
				}
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("EFFORT_REPORTING")) {
				executeAction("MNU_OPT_PASS_THRU_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("LOCATION_INFORMATION")) {
				executeAction("MNU_OPT_COST_SHARE_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("PASSTHROUGH_AGENCY")) {
				executeAction("MNU_OPT_HEADER_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
			if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("GRANT_AGENCY_INFORMATION")) {
				executeAction("MNU_OPT_LOCATION_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-PRVBLK :del_ready :=
	 * 'N'; IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
	 * EXECUTE_TRIGGER('INVALID_FUNCTION_MSG'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_1_CANVAS' THEN --1-19V7ZZD: prev-blk from Header Information tab
	 * should go back to the new Pass Through Agency tab. IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'HEADER_INFORMATION' THEN --FOR TAB CANVAS IF
	 * GET_TAB_PAGE_PROPERTY('PASSTHROUGH_AGENCY', ENABLED) = 'TRUE' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO');
	 * --EXECUTE_TRIGGER('MNU_OPT_EFFORT_REPORTING'); G$_CHECK_FAILURE; RETURN;
	 * ELSE EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO'); G$_CHECK_FAILURE;
	 * RETURN; END IF; END IF;
	 * 
	 * IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'EFFORT_REPORTING' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_2_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'BILLING_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_3_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'COST_CODE_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_4_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'PERSONNEL_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_5_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'USER_DEFINED_DATA' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_BILLING_INFO'); G$_CHECK_FAILURE; RETURN; END
	 * IF;
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRBGRNT_6_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'LOCATION_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO'); G$_CHECK_FAILURE; RETURN; END IF;
	 * 
	 * --RPE# 1-19V7ZZD IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE)
	 * = 'PASSTHROUGH_AGENCY' THEN --FOR TAB CANVAS IF
	 * GET_TAB_PAGE_PROPERTY('EFFORT_REPORTING', ENABLED) = 'TRUE' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_EFFORT_REPORTING'); G$_CHECK_FAILURE; RETURN;
	 * ELSE EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO'); G$_CHECK_FAILURE;
	 * RETURN; END IF; END IF; <multilinecomment> IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRBGRNT_7_CANVAS'
	 * THEN EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO'); G$_CHECK_FAILURE; RETURN;
	 * END IF; </multilinecomment>
	 * 
	 * --IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) =
	 * 'FRAGRNT_2A_CANVAS' THEN IF
	 * GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) =
	 * 'GRANT_AGENCY_INFORMATION' THEN --FOR TAB CANVAS
	 * EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO'); G$_CHECK_FAILURE; RETURN; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void Fragrnt_PreviousBlock() {

		getFormModel().getFormHeader().setDelReady(toStr("N"));
		if (getCursorBlock().equals("KEY_BLOCK")) {
			executeAction("INVALID_FUNCTION_MSG");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("HEADER_INFORMATION")) {
			if (getTabPageEnabled("PASSTHROUGH_AGENCY") == true) {
				executeAction("MNU_OPT_PASS_THRU_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			} else {
				executeAction("MNU_OPT_USER_CODES_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("EFFORT_REPORTING")) {
			executeAction("MNU_OPT_USER_CODES_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("BILLING_INFORMATION")) {
			executeAction("MNU_OPT_PERSONNEL_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("COST_CODE_INFORMATION")) {
			executeAction("MNU_OPT_LOCATION_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("PERSONNEL_INFORMATION")) {
			executeAction("MNU_OPT_COST_SHARE_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("USER_DEFINED_DATA")) {
			executeAction("MNU_OPT_BILLING_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("LOCATION_INFORMATION")) {
			executeAction("MNU_OPT_AGENCY_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("PASSTHROUGH_AGENCY")) {
			if (getTabPageEnabled("EFFORT_REPORTING") == true) {
				executeAction("MNU_OPT_EFFORT_REPORTING");
				getTask().getGoqrpls().gCheckFailure();
				return;
			} else {
				executeAction("MNU_OPT_USER_CODES_INFO");
				getTask().getGoqrpls().gCheckFailure();
				return;
			}
		}
		if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("GRANT_AGENCY_INFORMATION")) {
			executeAction("MNU_OPT_HEADER_INFO");
			getTask().getGoqrpls().gCheckFailure();
			return;
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.WHEN-TAB-PAGE-CHANGED
	 * :del_ready := 'N'; IF :SYSTEM.TAB_NEW_PAGE = 'HEADER_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'GRANT_AGENCY_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'LOCATION_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'COST_CODE_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'PERSONNEL_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'BILLING_INFORMATION' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_BILLING_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'USER_DEFINED_DATA' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'EFFORT_REPORTING' THEN
	 * EXECUTE_TRIGGER('MNU_OPT_EFFORT_REPORTING'); G$_CHECK_FAILURE; ELSIF
	 * :SYSTEM.TAB_NEW_PAGE = 'PASSTHROUGH_AGENCY' THEN --RPE# 1-19V7ZZD
	 * EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.WHEN-TAB-PAGE-CHANGED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TAB-PAGE-CHANGED")
	public void Fragrnt_tabChange() {

		getFormModel().getFormHeader().setDelReady(toStr("N"));
		if (getTabNewPage().equals("HEADER_INFORMATION")) {
			executeAction("MNU_OPT_HEADER_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("GRANT_AGENCY_INFORMATION")) {
			executeAction("MNU_OPT_AGENCY_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("LOCATION_INFORMATION")) {
			executeAction("MNU_OPT_LOCATION_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("COST_CODE_INFORMATION")) {
			executeAction("MNU_OPT_COST_SHARE_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("PERSONNEL_INFORMATION")) {
			executeAction("MNU_OPT_PERSONNEL_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("BILLING_INFORMATION")) {
			executeAction("MNU_OPT_BILLING_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("USER_DEFINED_DATA")) {
			executeAction("MNU_OPT_USER_CODES_INFO");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("EFFORT_REPORTING")) {
			executeAction("MNU_OPT_EFFORT_REPORTING");
			getTask().getGoqrpls().gCheckFailure();
		} else if (getTabNewPage().equals("PASSTHROUGH_AGENCY")) {
			// RPE# 1-19V7ZZD
			executeAction("MNU_OPT_PASS_THRU_INFO");
			getTask().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.KEY-CLRFRM BEGIN IF
	 * GET_MESSAGE = F_GET_ERROR('USER_NOT_AUTH') AND :SYSTEM.TRIGGER_ITEM =
	 * 'FRBGRNT.FRBGRNT_ORGN_CODE_RESP_OFFICE' THEN CLEAR_MESSAGE;
	 * :FRBGRNT.FRBGRNT_ORGN_CODE_RESP_OFFICE := ''; END IF;
	 * 
	 * EXECUTE_TRIGGER('SET_REQUIRED_OFF'); -- EXECUTE_TRIGGER('SAVE_KEYS'); --
	 * IF G$_QUERY_ONLY_ROLE THEN CLEAR_FORM (NO_VALIDATE); ELSE CLEAR_FORM; END
	 * IF;
	 * 
	 * IF :SYSTEM.FORM_STATUS <> 'NEW' THEN RETURN; END IF;
	 * 
	 * IF NOT FORM_SUCCESS THEN RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * EXECUTE_TRIGGER('ENABLE_KEYS'); G$_CHECK_FAILURE; --
	 * SET_CANVAS_PROPERTY('FRAGRNT_1_TAB_CANVAS', TOPMOST_TAB_PAGE,
	 * 'HEADER_INFORMATION'); EXECUTE_TRIGGER('DISABLE_PAGES');
	 * G$_CHECK_FAILURE; SET_TAB_PAGE_PROPERTY('HEADER_INFORMATION', ENABLED,
	 * PROPERTY_TRUE); IF GET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED) =
	 * 'TRUE' THEN SET_TAB_PAGE_PROPERTY('USER_DEFINED_DATA', ENABLED,
	 * PROPERTY_FALSE); END IF; --
	 * 
	 * EXECUTE_TRIGGER('DISABLE_BUTTONS'); G$_CHECK_FAILURE; -- EXECUTE_TRIGGER(
	 * 'LOAD_FORM_HEADER' ) ; G$_CHECK_FAILURE ; -- :FORM_HEADER.NEXT_DOC_NUM :=
	 * fokutil.f_next_display; EXECUTE_TRIGGER('CLOSE_WINDOWS'); --
	 * GO_ITEM('DISPLAY_frbgrnt_CODE'); :frbgrnt.display_pass_thru_ind := 'N';
	 * -- EXECUTE_TRIGGER('SET_REQUIRED_ON'); :COPY_FUNCT_PROCESS := '';
	 * :COPY_FROM_PROP := '' ; :changed_date := ' '; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FRAGRNT.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void Fragrnt_ClearTask() {


		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			

		

		if (getTriggerItem().equals("FRBGRNT.FRBGRNT_ORGN_CODE_RESP_OFFICE")) {		
			clearMessage();
			frbgrntElement.setFrbgrntOrgnCodeRespOffice(toStr(""));
		}
		executeAction("SET_REQUIRED_OFF");
		//
		executeAction("SAVE_KEYS");
		//
		if (getTask().getGoqrpls().gQueryOnlyRole().getValue()) {
			clearTask(TaskServices.NO_VALIDATE);
		} else {
			clearTask();
		}
	
		try {
			executeAction("ENABLE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			//
			setCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS",
					"HEADER_INFORMATION");
			executeAction("DISABLE_PAGES");
			getTask().getGoqrpls().gCheckFailure();
			setTabPageEnabled("HEADER_INFORMATION", true);
			if (getTabPageEnabled("USER_DEFINED_DATA") == true) {
				setTabPageEnabled("USER_DEFINED_DATA", false);
			}
			//
			executeAction("DISABLE_BUTTONS");
			getTask().getGoqrpls().gCheckFailure();
			//
			executeAction("LOAD_FORM_HEADER");
			getTask().getGoqrpls().gCheckFailure();
			//
			getFormModel().getFormHeader()
					.setNextDocNum(Fokutil.fNextDisplay());
			executeAction("CLOSE_WINDOWS");
			//
			goItem(toStr("DISPLAY_frbgrnt_CODE"));
			frbgrntElement.setDisplayPassThruInd(toStr("N"));
			//
			executeAction("SET_REQUIRED_ON");
			getFormModel().getFormHeader().setCopyFunctProcess(toStr(""));
			getFormModel().getFormHeader().setCopyFromProp(toStr(""));
			getFormModel().getFormHeader().setChangedDate(toStr(" "));		
		} catch (Exception e) {
			goItem(toStr(getCursorItem()));
			throw new ApplicationException();
		}
		
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.VALIDATE_AGENCY_CODE -- Fix
	 * for defect # 1-8KTK2 begins -- Checks whether the agency code is new or
	 * is inactive.
	 * 
	 * IF :FRBGRNT_AGENCY_CODE IS NULL THEN RETURN; END IF;
	 * 
	 * DECLARE hold_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL; agency_pidm
	 * SPRIDEN.SPRIDEN_PIDM%TYPE := NULL; status VARCHAR2(1);
	 * 
	 * CURSOR S_PIDM IS SELECT SPRIDEN_PIDM FROM SPRIDEN WHERE SPRIDEN_ID =
	 * :FRBGRNT.FRBGRNT_AGENCY_CODE;
	 * 
	 * CURSOR VALIDATE_AGCY IS SELECT FTVAGCY_AGCY_CODE_PIDM FROM FTVAGCY WHERE
	 * FTVAGCY_AGCY_CODE_PIDM = hold_pidm;
	 * 
	 * CURSOR AGCY_STATUS IS SELECT 'X' FROM FTVAGCY WHERE
	 * FTVAGCY_AGCY_CODE_PIDM = hold_pidm AND FTVAGCY_STATUS_IND = 'A';
	 * 
	 * BEGIN
	 * 
	 * OPEN S_PIDM; FETCH S_PIDM INTO hold_pidm; CLOSE S_PIDM;
	 * 
	 * OPEN VALIDATE_AGCY; FETCH VALIDATE_AGCY INTO agency_pidm;
	 * G$_CHECK_VALUE(VALIDATE_AGCY%NOTFOUND, G$_NLS.Get('FRAGRNT-0089', 'FORM',
	 * 'Agency ID is new; please create Agency using FTMAGCY.'), TRUE); CLOSE
	 * VALIDATE_AGCY;
	 * 
	 * OPEN AGCY_STATUS; FETCH AGCY_STATUS INTO status;
	 * G$_CHECK_VALUE(AGCY_STATUS%NOTFOUND, G$_NLS.Get('FRAGRNT-0090', 'FORM',
	 * 'Agency is not active.'), TRUE); CLOSE AGCY_STATUS; END; -- Fix for
	 * defect # 1-8KTK2 ends
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.VALIDATE_AGENCY_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "VALIDATE_AGENCY_CODE")
	public void Fragrnt_ValidateAgencyCode() {

		// Fix for defect # 1-8KTK2 begins
		// Checks whether the agency code is new or is inactive.

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);

		if (frbgrntElement != null) {
			
		int rowCount = 0;
		// Fix for defect # 1-8KTK2 begins
		// Checks whether the agency code is new or is inactive.
		if (frbgrntElement.getFrbgrntAgencyCode().isNull()) {
			return;
		}
		{
			NNumber holdPidm = NNumber.getNull();
			NNumber agencyPidm = NNumber.getNull();
			NString status = NString.getNull();
			String sqlsPidm = "SELECT SPRIDEN_PIDM " + " FROM SPRIDEN "
					+ " WHERE SPRIDEN_ID = :FRBGRNT_FRBGRNT_AGENCY_CODE ";
			DataCursor sPidm = new DataCursor(sqlsPidm);
			String sqlvalidateAgcy = "SELECT FTVAGCY_AGCY_CODE_PIDM "
					+ " FROM FTVAGCY "
					+ " WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM ";
			DataCursor validateAgcy = new DataCursor(sqlvalidateAgcy);
			String sqlagcyStatus = "SELECT 'X' "
					+ " FROM FTVAGCY "
					+ " WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM AND FTVAGCY_STATUS_IND = 'A' ";
			DataCursor agcyStatus = new DataCursor(sqlagcyStatus);
			try {
				// Setting query parameters
				sPidm.addParameter("FRBGRNT_FRBGRNT_AGENCY_CODE",
						frbgrntElement.getFrbgrntAgencyCode());

				sPidm.open();
				ResultSet sPidmResults = sPidm.fetchInto();
				if (sPidmResults != null) {
					holdPidm = sPidmResults.getNumber(0);
				}
				sPidm.close();
				
				// Setting query parameters
				validateAgcy.addParameter("P_HOLD_PIDM", holdPidm);
	
	
				validateAgcy.open();
				ResultSet validateAgcyResults = validateAgcy.fetchInto();
				if (validateAgcyResults != null) {
					agencyPidm = validateAgcyResults.getNumber(0);
				}
				getTask()
						.getGoqrpls()
						.gCheckValue(
								toBool(validateAgcy.notFound()),
								GNls.Fget(
										toStr("FRAGRNT-0089"),
										toStr("FORM"),
										toStr("Agency ID is new; please create Agency using FTMAGCY.")),
								toBool(NBool.True));
				validateAgcy.close();
	
	
				agcyStatus.addParameter("P_HOLD_PIDM", holdPidm);
	
	
				agcyStatus.open();
				ResultSet agcyStatusResults = agcyStatus.fetchInto();
				if (agcyStatusResults != null) {
					status = agcyStatusResults.getStr(0);
				}
				getTask().getGoqrpls()
						.gCheckValue(
								toBool(agcyStatus.notFound()),
								GNls.Fget(toStr("FRAGRNT-0090"), toStr("FORM"),
										toStr("Agency is not active.")),
								toBool(NBool.True));
				agcyStatus.close();
			} finally {
				sPidm.close();
				validateAgcy.close();
				agcyStatus.close();
			}
			
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.VALIDATE_CFDA_CODE -- Fix
	 * for defect # 1-8KTK2 begins -- Checks whether the CFDA code is inactive.
	 * 
	 * IF :FRBGRNT_CFDA_CODE IS NULL THEN RETURN; END IF;
	 * 
	 * DECLARE hold_cfda_int_id frbgrnt.frbgrnt_cfda_internal_id_no%type;
	 * 
	 * CURSOR CFDA_STATUS IS SELECT DISTINCT FRVCFDA_INTERNAL_ID_NO FROM FRVCFDA
	 * WHERE FRVCFDA_CFDA_CODE = :FRBGRNT_CFDA_CODE AND FRVCFDA_STATUS = 'A';
	 * 
	 * BEGIN OPEN CFDA_STATUS; FETCH CFDA_STATUS INTO hold_cfda_int_id; IF
	 * CFDA_STATUS%NOTFOUND THEN MESSAGE(G$_NLS.Get('FRAGRNT-0091',
	 * 'FORM','Category of Federal Domestic Assistance Number is invalid. LIST
	 * is available.') ); END IF; CLOSE CFDA_STATUS; END; -- Fix for defect #
	 * 1-8KTK2 ends
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.VALIDATE_CFDA_CODE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "VALIDATE_CFDA_CODE")
	public void Fragrnt_ValidateCfdaCode() {

		// Fix for defect # 1-8KTK2 begins
		// Checks whether the CFDA code is inactive.

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		int rowCount = 0;
		// Fix for defect # 1-8KTK2 begins
		// Checks whether the CFDA code is inactive.
		if (frbgrntElement.getFrbgrntCfdaCode().isNull()) {
			return;
		}
		{
			NNumber holdCfdaIntId = NNumber.getNull();
			String sqlcfdaStatus = "SELECT DISTINCT FRVCFDA_INTERNAL_ID_NO "
					+ " FROM FRVCFDA "
					+ " WHERE FRVCFDA_CFDA_CODE = :FRBGRNT_CFDA_CODE AND FRVCFDA_STATUS = 'A' ";
			DataCursor cfdaStatus = new DataCursor(sqlcfdaStatus);
			try {
				// Setting query parameters
				cfdaStatus.addParameter("FRBGRNT_CFDA_CODE",
						frbgrntElement.getFrbgrntCfdaCode());
				cfdaStatus.open();
				ResultSet cfdaStatusResults = cfdaStatus.fetchInto();
				if (cfdaStatusResults != null) {
					holdCfdaIntId = cfdaStatusResults.getNumber(0);
				}
				if (cfdaStatus.notFound()) {
					findItem("FRBGRNT_CFDA_CODE").setValid(false);
					errorMessage(GNls
							.Fget(toStr("FRAGRNT-0091"),
									toStr("FORM"),
									toStr("Category of Federal Domestic Assistance Number is invalid. LIST is available.")));
				}
			} finally {
				cfdaStatus.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CALL_FORM_FRIGITD
	 * EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ; G$_CHECK_FAILURE ;
	 * 
	 * if :global.fund_org_security_ind = 'Y' then
	 * execute_trigger('check_security_entered'); g$_check_failure; end if; --
	 * EXECUTE_TRIGGER('FORCE_COMMIT'); G$_CHECK_FAILURE;
	 * HIDE_WINDOW('NAVIGATE_TO'); :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * :GLOBAL.GRNT_CODE := :DISPLAY_FRBGRNT_CODE; :GLOBAL.COAS_CODE :=
	 * :FRBGRNT_COAS_CODE; EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRIGITD','');
	 * :GLOBAL.FORM_WAS_CALLED := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CALL_FORM_FRIGITD
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CALL_FORM_FRIGITD")
	public void Fragrnt_CallFormFrigitd() {

		FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel()
				.getFrbgrnt().getRowAdapter(true);
		
		if(frbgrntElement==null)
			return;

		executeAction("EDIT_ORGN_SECURITY");
		getTask().getGoqrpls().gCheckFailure();
		if (getGlobal("FUND_ORG_SECURITY_IND").equals("Y")) {
			executeAction("check_security_entered");
			getTask().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("FORCE_COMMIT");
		getTask().getGoqrpls().gCheckFailure();
		hideWindow("NAVIGATE_TO");
		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		setGlobal("GRNT_CODE", getFormModel().getKeyBlock()
				.getDisplayFrbgrntCode());
		setGlobal("COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("FRIGITD"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.MNU_OPT_EFFORT_REPORTING IF
	 * NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN MESSAGE( G$_NLS.Get('FRAGRNT-0092',
	 * 'FORM','*WARNING* BANNER HR is not installed.') ); ELSE
	 * GO_BLOCK('FRRGREC'); EXECUTE_QUERY; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.MNU_OPT_EFFORT_REPORTING
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPT_EFFORT_REPORTING")
	public void Fragrnt_MnuOptEffortReporting() {

		if (getNameIn("GLOBAL.HRESYS").notEquals("Y")) {
			warningMessage(GNls.Fget(toStr("FRAGRNT-0092"), toStr("FORM"),
					toStr("*WARNING* BANNER HR is not installed.")));
		} else {
			goBlock(toStr("FRRGREC"));
			executeQuery();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.CHECK_ACCT_ELMNT_VAL
	 * DECLARE ITM_NAME VARCHAR2(100); CURSOR FRRGREC_DATA IS SELECT FRRGREC_ID
	 * FROM FRRGREC WHERE FRRGREC_GRNT_CODE = :DISPLAY_FRBGRNT_CODE; lv_id
	 * NUMBER; BEGIN ITM_NAME := :SYSTEM.CURSOR_ITEM; GO_BLOCK('FRRGREC'); --
	 * EXECUTE_QUERY; FIRST_RECORD; IF :FRRGREC_ACCT_ELEMENT_VALUE IS NULL THEN
	 * OPEN FRRGREC_DATA; FETCH FRRGREC_DATA INTO lv_id; IF
	 * FRRGREC_DATA%NOTFOUND THEN MESSAGE( G$_NLS.Get('FRAGRNT-0093',
	 * 'FORM','*WARNING* No entries exist for Effort Reporting.') ); END IF;
	 * CLOSE FRRGREC_DATA; END IF; GO_ITEM(ITM_NAME); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.CHECK_ACCT_ELMNT_VAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_ACCT_ELMNT_VAL")
	public void Fragrnt_CheckAcctElmntVal() {

		FrrgrecAdapter frrgrecElement = (FrrgrecAdapter) this.getFormModel()
				.getFrrgrec().getRowAdapter(true);
		
		if(frrgrecElement==null)
			return;

		int rowCount = 0;
		{
			NString itmName = NString.getNull();
			String sqlfrrgrecData = "SELECT FRRGREC_ID " + " FROM FRRGREC "
					+ " WHERE FRRGREC_GRNT_CODE = :DISPLAY_FRBGRNT_CODE ";
			DataCursor frrgrecData = new DataCursor(sqlfrrgrecData);
			try {
				NNumber lvId = NNumber.getNull();
				itmName = toStr(getCursorItem());
				goBlock(toStr("FRRGREC"));
				// EXECUTE_QUERY;
				firstRecord();
				if (frrgrecElement.getFrrgrecAcctElementValue().isNull()) {
					// Setting query parameters
					frrgrecData.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel()
							.getKeyBlock().getDisplayFrbgrntCode());
					frrgrecData.open();
					ResultSet frrgrecDataResults = frrgrecData.fetchInto();
					if (frrgrecDataResults != null) {
						lvId = frrgrecDataResults.getNumber(0);
					}
					if (frrgrecData.notFound()) {
						warningMessage(GNls
								.Fget(toStr("FRAGRNT-0093"),
										toStr("FORM"),
										toStr("*WARNING* No entries exist for Effort Reporting.")));
					}
				}
				goItem(itmName);
			} finally {
				frrgrecData.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.DISABLE_I18N_FIELDS IF
	 * GET_ITEM_PROPERTY('FRBGRNT.HOUSE_NUMBER',VISIBLE) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('FRBGRNT.HOUSE_NUMBER',ENABLED,PROPERTY_OFF); END IF;
	 * 
	 * IF GET_ITEM_PROPERTY('FRBGRNT.ADDRESS_LINE_4',VISIBLE) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('FRBGRNT.ADDRESS_LINE_4',ENABLED,PROPERTY_OFF); END IF;
	 * 
	 * IF GET_ITEM_PROPERTY('FRBGRNT.CTRY_CODE_PHONE',VISIBLE) = 'TRUE' THEN
	 * SET_ITEM_PROPERTY('FRBGRNT.CTRY_CODE_PHONE',ENABLED,PROPERTY_OFF); END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.DISABLE_I18N_FIELDS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_I18N_FIELDS")
	public void Fragrnt_DisableI18nFields() {

		if (getItemVisible("FRBGRNT.HOUSE_NUMBER").equals("TRUE")) {
			setItemEnabled("FRBGRNT.HOUSE_NUMBER", false);
		}
		if (getItemVisible("FRBGRNT.ADDRESS_LINE_4").equals("TRUE")) {
			setItemEnabled("FRBGRNT.ADDRESS_LINE_4", false);
		}
		if (getItemVisible("FRBGRNT.CTRY_CODE_PHONE").equals("TRUE")) {
			setItemEnabled("FRBGRNT.CTRY_CODE_PHONE", false);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FRAGRNT.EDIT_PERSON_ID -- 1-BMV7IL
	 * IF :FRRGRPI_ID IS NULL AND :FRRGRPI_ID_IND IS NOT NULL THEN
	 * GO_BLOCK('FRRGRPI'); GO_ITEM('FRRGRPI_ID');
	 * MESSAGE(G$_NLS.GET('FRAGRNT-0094','FORM','ID is required.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FRAGRNT.EDIT_PERSON_ID
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_PERSON_ID")
	public void Fragrnt_EditPersonId() {

		// 1-BMV7IL

		FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter) this.getFormModel()
				.getFrrgrpi().getRowAdapter(true);
		
		if(frrgrpiElement==null)
			return;

		// 1-BMV7IL
		if (frrgrpiElement.getFrrgrpiId().isNull()
				&& !frrgrpiElement.getFrrgrpiIdInd().isNull()) {
			goBlock(toStr("FRRGRPI"));
			goItem(toStr("FRRGRPI_ID"));
			findItem(getCurrentItem()).setValid(false);
			errorMessage(GNls.Fget(toStr("FRAGRNT-0094"), toStr("FORM"),
					toStr("ID is required.")));
			throw new ApplicationException();
		}
	}

}
