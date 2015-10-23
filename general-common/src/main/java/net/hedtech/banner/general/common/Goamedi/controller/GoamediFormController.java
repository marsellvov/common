package net.hedtech.banner.general.common.Goamedi.controller;

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
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goamedi.model.*;
import net.hedtech.banner.general.common.Goamedi.*;
import net.hedtech.banner.general.common.Goamedi.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;

public class GoamediFormController extends DefaultFormController {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_FORM_CLASS");
	}

	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_APPL_FORM_CLASS");
	}

	public GoamediFormController(ITask task) {
		super(task);
	}

	@Override
	public GoamediTask getTask() {
		return (GoamediTask) super.getTask();
	}

	public GoamediModel getFormModel() {
		return this.getTask().getModel();
	}

	// action methods generated from triggers
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.G$_VERIFY_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_VERIFY_ACCESS")
	public void Goamedi_GVerifyAccess() {

		getGFormClass().gVerifyAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void Goamedi_GRevokeAccess() {

		getGFormClass().gRevokeAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void Goamedi_TaskStartedPre(EventObject args) {

		getGFormClass().taskStartedPre(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void Goamedi_PreFormTrg() {

		getGFormClass().preFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskEnded
	public void Goamedi_TaskEnded(EventObject args) {

		getGFormClass().taskEnded(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void Goamedi_PostFormTrg() {

		getGFormClass().postFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void Goamedi_blockIn() {

		getGFormClass().blockIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void Goamedi_PreBlockTrg() {

		getGFormClass().preBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void Goamedi_blockOut() {

		getGFormClass().blockOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void Goamedi_PostBlockTrg() {

		getGFormClass().postBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void Goamedi_BeforeCommit(CancelEvent args) {

		getGFormClass().beforeCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void Goamedi_PreCommitTrg() {

		getGFormClass().preCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void Goamedi_BeforeRowInsert(RowAdapterEvent args) {

		getGFormClass().beforeRowInsert(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void Goamedi_BeforeRowUpdate(RowAdapterEvent args) {

		getGFormClass().beforeRowUpdate(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void Goamedi_OnError(EventObject args) {

		getGFormClass().onError(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void Goamedi_OnRollback() {

		getGFormClass().onRollback();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void Goamedi_OnRollbackTrg() {

		getGFormClass().onRollbackTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void Goamedi_OnSelect() {

		getGFormClass().onSelect();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void Goamedi_AfterCommit(EventObject args) {

		getGFormClass().afterCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void Goamedi_PostFormsCommitTrg() {

		getGFormClass().postFormsCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void Goamedi_buttonClick() {

		getGFormClass().click();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void Goamedi_blockChange() {

		getGFormClass().blockChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void Goamedi_doubleClick() {

		getGFormClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void Goamedi_WhenTimerExpired(NString timerName) {

		getGFormClass().whenTimerExpired(timerName);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void Goamedi_WhenWindowActivated() {

		getGFormClass().whenWindowActivated();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void Goamedi_WhenWindowActivatedTrg() {

		getGFormClass().whenWindowActivatedTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void Goamedi_WhenWindowClosed() {

		getGFormClass().whenWindowClosed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void Goamedi_Help() {

		getGFormClass().help();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void Goamedi_F0() {

		getGFormClass().f0();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void Goamedi_F2() {

		getGFormClass().f2();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void Goamedi_MoveDown() {

		getGFormClass().moveDown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void Goamedi_MoveUp() {

		getGFormClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void Goamedi_ListValues() {

		getGFormClass().listValues();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void Goamedi_KeyMenu() {

		getGFormClass().keyMenu();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void Goamedi_NextRecord() {

		getGFormClass().nextRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void Goamedi_PreviousRecord() {

		getGFormClass().previousRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void Goamedi_KeyNxtset() {

		getGFormClass().keyNxtset();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void Goamedi_KeyScrup() {

		getGFormClass().keyScrup();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void Goamedi_KeyScrdown() {

		getGFormClass().keyScrdown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void Goamedi_KeyPrint() {

		getGFormClass().keyPrint();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void Goamedi_Search() {

		getGFormClass().search();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void Goamedi_ExecuteQuery() {

		getGFormClass().executeQuery();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void Goamedi_Exit() {

		getGFormClass().exit();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void Goamedi_KeyExitTrg() {

		getGFormClass().keyExitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void Goamedi_KeyNxtkey() {

		copy(((SprmediAdapter)this.getFormModel().getSprmedi().getRowAdapter()).getSprmediMediCode(),"GLOBAL.VALUE");
		getGFormClass().keyNxtkey();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void Goamedi_KeyNxtkeyTrg() {

		getGFormClass().keyNxtkeyTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void Goamedi_ListValuesCopy() {

		getGFormClass().listValuesCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Goamedi_LoadFormHeader() {

		getGFormClass().loadFormHeader();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void Goamedi_InvalidOptionMsg() {

		getGFormClass().invalidOptionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void Goamedi_UpdateActivity() {

		getGFormClass().updateActivity();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_KEYS")
	public void Goamedi_CheckKeys() {

		getGApplFormClass().checkKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE", function = KeyFunction.RECORD_CHANGE)
	public void Goamedi_recordChange() {

		getGApplFormClass().whenNewRecordInstance();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.1';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Goamedi_LoadCurrentRelease() {

		getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * IF :CHECK_KEYS = 'Y' THEN GO_BLOCK('KEY_BLOCK'); EXECUTE_TRIGGER(
	 * 'CHECK_KEYS' ) ; G$_CHECK_FAILURE; G$_CHECK_VALUE (NOT (:KEY_BLOCK.PIDM
	 * IS NOT NULL AND :KEY_BLOCK.ID IS NOT NULL), G$_NLS.Get('GOAMEDI-0001',
	 * 'FORM','*ERROR* An existing person ID number must be entered for this
	 * function.') , TRUE, TRUE); -- NEXT_BLOCK ; EXECUTE_QUERY ; :CHECK_KEYS :=
	 * 'N'; EXECUTE_TRIGGER('DISABLE_KEYS'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void Goamedi_WhenNewBlockInstanceTrg() {

		if (getFormModel().getButtonControlBlock().getCheckKeys().equals("Y")) {
			goBlock(toStr("KEY_BLOCK"));
			executeAction("CHECK_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			getTask()
					.getGoqrpls()
					.gCheckValue(
							toBool(!(getFormModel().getKeyBlock().getPidm().isNotNull() && getFormModel()
									.getKeyBlock().getId().isNotNull())),
							GNls.Fget(
									toStr("GOAMEDI-0001"),
									toStr("FORM"),
									toStr("*ERROR* An existing person ID number must be entered for this function.")),
							toBool(NBool.True), toBool(NBool.True));
			//
			nextBlock();
			executeQuery();
			getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			executeAction("DISABLE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.SAVE_KEYS :GLOBAL.KEY_IDNO
	 * := :KEY_BLOCK.ID ; :GLOBAL.VALUE := :SPRMEDI.SPRMEDI_MEDI_CODE;
	 */
	/*
	 * <p>This trigger will copy the keys back to the global area.<b>Migration
	 * Comments</b> Generated from trigger: GOAMEDI.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void Goamedi_SaveKeys() {

		
//		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
//				.getSprmedi().getRowAdapter(true);

		setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
		setGlobal("NAME", getFormModel().getKeyBlock().getNname());
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.INVALID_FUNCTION_MSG NULL ;
	 * MESSAGE( G$_NLS.Get('GOAMEDI-0003', 'FORM','*ERROR* Invalid function;
	 * press SHOW KEYS for valid functions') ) ;
	 */
	/*
	 * <p>This trigger will display the invalid function message. It will be
	 * executed
	 * 
	 * from every block that has disabled function keys.<b>Migration
	 * Comments</b> Generated from trigger: GOAMEDI.INVALID_FUNCTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_FUNCTION_MSG")
	public void Goamedi_InvalidFunctionMsg() {

		errorMessage(GNls
				.Fget(toStr("GOAMEDI-0003"),
						toStr("FORM"),
						toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.GLOBAL_COPY :KEY_BLOCK.ID
	 * := :GLOBAL.KEY_IDNO ; -- IF :KEY_BLOCK.ID IS NOT NULL THEN NEXT_FIELD ;
	 * END IF ;
	 */
	/*
	 * <p>This trigger will copy the key information from the global area.
	 * <b>Migration Comments</b> Generated from trigger: GOAMEDI.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void Goamedi_GlobalCopy() {
		
		getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
		//
		if (!getFormModel().getKeyBlock().getId().isNull()) {
			validateItem("KEY_BLOCK.ID");
			nextItem();
			goItem("KEY_BLOCK.ID");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.ENABLE_KEYS IF
	 * GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON); END IF; IF
	 * GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void Goamedi_EnableKeys() {

		if (getItemEnabled("ID").equals("FALSE")) {
			setItemEnabled("ID", true);
			setItemNavigable("ID", true);
		}
		if (getItemEnabled("ID_LBT").equals("FALSE")) {
			setItemEnabled("ID_LBT", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.DISABLE_KEYS
	 * SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void Goamedi_DisableKeys() {

		setItemEnabled("ID", false);
		setItemEnabled("ID_LBT", false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.CLRFRM_TRIGGER
	 * EXECUTE_TRIGGER( 'SAVE_KEYS' ) ; G$_CHECK_FAILURE ; EXECUTE_TRIGGER(
	 * 'ENABLE_KEYS' ) ; G$_CHECK_FAILURE ; CLEAR_FORM ; G$_CHECK_FAILURE ;
	 * EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ; G$_CHECK_FAILURE ;
	 * EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p>This trigger will copy the current keys to the global area, clear the
	 * form,
	 * 
	 * fill in the header information, and return to the key block with the
	 * current
	 * 
	 * key values.<b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.CLRFRM_TRIGGER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CLRFRM_TRIGGER")
	public void Goamedi_ClrfrmTrigger() {

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
		goBlock("KEY_BLOCK");
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.WHEN-NEW-FORM-INSTANCE
	 * G$_SET_WIN_PROPERTY; EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
	 * G$_CHECK_FAILURE ; EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ; G$_CHECK_FAILURE ;
	 * G$_SET_INST_PROPERTY;
	 * 
	 * ---- IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN NEXT_BLOCK; G$_CHECK_FAILURE;
	 * END IF ; --- :GLOBAL.FORM_WAS_CALLED := '' ;
	 */
	/*
	 * <p>This trigger will fill in the header information, copy the keys in
	 * from the
	 * 
	 * global area, and move to the key block.<b>Migration Comments</b>
	 * Generated from trigger: GOAMEDI.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void Goamedi_TaskStarted(EventObject args) {

		getTask().getGoqrpls().gSetWinProperty();
		executeAction("LOAD_FORM_HEADER");
		getTask().getGoqrpls().gCheckFailure();
		executeAction("GLOBAL_COPY");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSetInstProperty();
		// --
		if (getGlobal("FORM_WAS_CALLED").equals("Y")) {
			nextBlock();
			getTask().getGoqrpls().gCheckFailure();
		}
		// -
		setGlobal("FORM_WAS_CALLED", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.KEY-PRVBLK PREVIOUS_BLOCK ;
	 * EXECUTE_QUERY ;
	 */
	/*
	 * <p>This trigger will cause an automatic query upon execution of PREVIOUS
	 * BLOCK.<b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void Goamedi_PreviousBlock() {

		previousBlock();
		executeQuery();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.KEY-NXTBLK NEXT_BLOCK ;
	 * EXECUTE_QUERY ;
	 */
	/*
	 * <p>This trigger will cause an automatic query upon execution of a NEXT
	 * BLOCK.<b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void Goamedi_NextBlock() {

		nextBlock();
		executeQuery();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.KEY-CLRFRM EXECUTE_TRIGGER(
	 * 'CLRFRM_TRIGGER' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOAMEDI.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void Goamedi_ClearTask() {

		executeAction("CLRFRM_TRIGGER");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.UPDATE_ACTIVITY_DATE
	 * :WORKDATE := :SYSTEM.CURRENT_BLOCK ; -- :WORKDATE := SUBSTR(:WORKDATE, 1,
	 * 7) ; -- :WORKDATE := LPAD(:WORKDATE, 15, :WORKDATE || '.') ; -- :WORKDATE
	 * := RPAD(:WORKDATE, 29, '_ACTIVITY_DATE') ; -- COPY( :CURRENT_DATE,
	 * :WORKDATE ) ;
	 */
	/*
	 * <p>This trigger will update the activity date with the current date for
	 * the
	 * 
	 * current block and row.<b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.UPDATE_ACTIVITY_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Goamedi_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(lpad(getFormModel().getFormHeader().getWorkdate(), 15, getFormModel().getFormHeader().getWorkdate().append(".").toString()));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 29, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

	/*
	 * Original PL/SQL code code for TRIGGER GOAMEDI.MNU_CALL_GORMEDR
	 * 
	 * :GLOBAL.FORM_WAS_CALLED := 'Y'; EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:global.current_user,'GORMEDR','');
	 * :GLOBAL.FORM_WAS_CALLED := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOAMEDI.MNU_CALL_GORMEDR
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_CALL_GORMEDR")
	public void Goamedi_MnuCallGormedr() {

		setGlobal("FORM_WAS_CALLED", toStr("Y"));
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("GORMEDR"), toStr(""));
		setGlobal("FORM_WAS_CALLED", toStr(""));
	}

}
