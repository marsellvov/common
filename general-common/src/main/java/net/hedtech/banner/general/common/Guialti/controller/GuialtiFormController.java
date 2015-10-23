package net.hedtech.banner.general.common.Guialti.controller;

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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guialti.model.*;
import net.hedtech.banner.general.common.Guialti.*;
import net.hedtech.banner.general.common.Guialti.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;

public class GuialtiFormController extends DefaultFormController {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_FORM_CLASS");
	}

	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_INQ_FORM_CLASS");
	}

	public GuialtiFormController(ITask task) {
		super(task);
	}

	@Override
	public GuialtiTask getTask() {
		return (GuialtiTask) super.getTask();
	}

	public GuialtiModel getFormModel() {
		return this.getTask().getModel();
	}

	// action methods generated from triggers
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.G$_VERIFY_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_VERIFY_ACCESS")
	public void Guialti_GVerifyAccess() {

		getGFormClass().gVerifyAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void Guialti_GRevokeAccess() {

		getGFormClass().gRevokeAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void Guialti_TaskStartedPre(EventObject args) {

		getGFormClass().taskStartedPre(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void Guialti_PreFormTrg() {

		getGFormClass().preFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskEnded
	public void Guialti_TaskEnded(EventObject args) {

		getGFormClass().taskEnded(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void Guialti_PostFormTrg() {

		getGFormClass().postFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void Guialti_blockIn() {

		getGFormClass().blockIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void Guialti_PreBlockTrg() {

		getGFormClass().preBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void Guialti_blockOut() {

		getGFormClass().blockOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void Guialti_PostBlockTrg() {

		getGFormClass().postBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void Guialti_BeforeCommit(CancelEvent args) {

		getGFormClass().beforeCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void Guialti_PreCommitTrg() {

		getGFormClass().preCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void Guialti_BeforeRowInsert(RowAdapterEvent args) {

		getGFormClass().beforeRowInsert(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void Guialti_BeforeRowUpdate(RowAdapterEvent args) {

		getGFormClass().beforeRowUpdate(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void Guialti_OnError(EventObject args) {

		getGFormClass().onError(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void Guialti_OnRollback() {

		getGFormClass().onRollback();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void Guialti_OnRollbackTrg() {

		getGFormClass().onRollbackTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void Guialti_OnSelect() {

		getGFormClass().onSelect();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void Guialti_AfterCommit(EventObject args) {

		getGFormClass().afterCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void Guialti_PostFormsCommitTrg() {

		getGFormClass().postFormsCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void Guialti_buttonClick() {

		getGFormClass().click();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void Guialti_blockChange() {

		getGFormClass().blockChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void Guialti_WhenNewBlockInstanceTrg() {

		getGFormClass().whenNewBlockInstanceTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void Guialti_doubleClick() {

		getGFormClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void Guialti_WhenTimerExpired(NString timerName) {

		getGFormClass().whenTimerExpired(timerName);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void Guialti_WhenWindowActivated() {

		getGFormClass().whenWindowActivated();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void Guialti_WhenWindowClosed() {

		getGFormClass().whenWindowClosed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void Guialti_Help() {

		getGFormClass().help();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void Guialti_F0() {

		getGFormClass().f0();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void Guialti_F2() {

		getGFormClass().f2();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void Guialti_MoveDown() {
		if (isInLastRecord(true))

		{
			warningMessage(GNls.Fget(toStr("GUIALTI-0004"), toStr("FORM"),
					toStr("*WARNING* At last record.")));
			return;
		}
		getGFormClass().moveDown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void Guialti_MoveUp() {

		getGFormClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void Guialti_ListValues() {

		getGFormClass().listValues();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void Guialti_KeyMenu() {

		getGFormClass().keyMenu();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void Guialti_NextBlock() {

		getGFormClass().nextBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void Guialti_PreviousBlock() {

		getGFormClass().previousBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void Guialti_NextRecord() {

		getGFormClass().nextRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void Guialti_PreviousRecord() {
		if (isInFirstRecord())

		{
			warningMessage(GNls.Fget(toStr("GUIALTI-0004"), toStr("FORM"),
					toStr("*WARNING* At first record.")));
			return;
		}

		getGFormClass().previousRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void Guialti_KeyNxtset() {

		getGFormClass().keyNxtset();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void Guialti_KeyPrint() {

		getGFormClass().keyPrint();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-EXEQRY BEGIN
	 * MESSAGE('begin form level key-exeqry');pause;
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_EXEQRY; MESSAGE('end form level
	 * key-exeqry');pause; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void Guialti_ExecuteQuery() {

		getTask().getGoqrpls().getGGoqolibKeyTrigger().keyExeqry();
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void Guialti_KeyExitTrg() {

		getGFormClass().keyExitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void Guialti_KeyNxtkeyTrg() {

		getGFormClass().keyNxtkeyTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void Guialti_GlobalCopy() {

		getGFormClass().globalCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void Guialti_ListValuesCopy() {

		getGFormClass().listValuesCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Guialti_LoadFormHeader() {

		getGFormClass().loadFormHeader();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void Guialti_EnableKeys() {

		getGFormClass().enableKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void Guialti_DisableKeys() {

		getGFormClass().disableKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void Guialti_InvalidOptionMsg() {

		getGFormClass().invalidOptionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void Guialti_UpdateActivity() {

		getGFormClass().updateActivity();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_KEYS")
	public void Guialti_CheckKeys() {

		getGInqFormClass().checkKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void Guialti_ClearRecord() {

		getGInqFormClass().clearRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void Guialti_Save() {

		getGInqFormClass().save();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void Guialti_CreateRecord() {

		getGInqFormClass().createRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void Guialti_DeleteRecord() {

		getGInqFormClass().deleteRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-DUP-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DUP-ITEM")
	public void Guialti_KeyDupItem() {

		getGInqFormClass().keyDupItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void Guialti_CopyRecord() {

		getGInqFormClass().copyRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE", function = KeyFunction.RECORD_CHANGE)
	public void Guialti_recordChange() {

		getGInqFormClass().whenNewRecordInstance();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.3.1';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Guialti_LoadCurrentRelease() {

		getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.DETAIL_BTN_TRIG NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.DETAIL_BTN_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DETAIL_BTN_TRIG")
	public void Guialti_DetailBtnTrig() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-ENTQRY
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY; G$_CHECK_FAILURE; --ENTER_QUERY;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void Guialti_Search() {

		getTask().getGoqrpls().getGGoqolibKeyTrigger().keyEntqry();
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.WHEN_WINDOW_ACTIVATED_TRG
	 * G$_SET_WIN_PROPERTY; IF :SYSTEM.EVENT_WINDOW IS NULL OR
	 * :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN G$_SET_INST_PROPERTY; END
	 * IF; IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN -- GO_BLOCK('GUVALTI');
	 * IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GUVALTI',
	 * 'GUVALTI_SSN') = 'N' THEN GO_ITEM('GUVALTI.GUVALTI_SSN'); ELSE
	 * GO_ITEM('GUVALTI.GUVALTI_ID'); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void Guialti_WhenWindowActivatedTrg() {

		getTask().getGoqrpls().gSetWinProperty();
		if ((getCurrentWindow()) == null
				|| getCurrentWindow().notEquals("G$_OPT_WINDOW")) {
			getTask().getGoqrpls().gSetInstProperty();
		}
		if (getCurrentWindow().equals("MAIN_WINDOW")) {
			if (getTask()
					.getGoqrpls()
					.getGMasks()
					.gDidMaskRestrict(toStr(getCurrentTaskName()),
							toStr("GUVALTI"), toStr("GUVALTI_SSN")).equals("N")) {
				goItem(toStr("GUVALTI.GUVALTI_SSN"));
			} else {
				goItem(toStr("GUVALTI.GUVALTI_ID"));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.DISABLE_DETAIL_BTN_TRIG
	 * null;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.DISABLE_DETAIL_BTN_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_DETAIL_BTN_TRIG")
	public void Guialti_DisableDetailBtnTrig() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.ENABLE_DETAIL_BTN_TRIG
	 * null;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.ENABLE_DETAIL_BTN_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_DETAIL_BTN_TRIG")
	public void Guialti_EnableDetailBtnTrig() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.ENABLE_NO_DETAIL_TRIG null;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.ENABLE_NO_DETAIL_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_NO_DETAIL_TRIG")
	public void Guialti_EnableNoDetailTrig() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-CQUERY EXECUTE_TRIGGER(
	 * 'INVALID_FUNCTION_MSG' ); G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CQUERY", function = KeyFunction.COUNT_QUERY)
	public void Guialti_TotalResults() {

		executeAction("INVALID_FUNCTION_MSG");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.INVALID_FUNCTION_MSG
	 * MESSAGE( G$_NLS.Get('GUIALTI-0000', 'FORM','*ERROR* Invalid function;
	 * press SHOW KEYS key for valid functions.') ) ; RAISE FORM_TRIGGER_FAILURE
	 * ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.INVALID_FUNCTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_FUNCTION_MSG")
	public void Guialti_InvalidFunctionMsg() {

		errorMessage(GNls
				.Fget(toStr("GUIALTI-0000"),
						toStr("FORM"),
						toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.WHEN-NEW-FORM-INSTANCE --
	 * :CASE_INSENSITIVE_RG := 'T'; -- enable Select in called form GUIALTI IF
	 * :GLOBAL.FORM_WAS_CALLED = 'Y' THEN IF
	 * Get_Menu_Item_Property('Action.Select', ENABLED) = 'FALSE' THEN
	 * SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE); END IF;
	 * END IF; -- G$_SET_WIN_PROPERTY ; EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
	 * G$_CHECK_FAILURE ; G$_SET_INST_PROPERTY; :CASE_INSENSITIVE_RG := 'T';
	 * GO_BLOCK('GUVALTI');
	 * SET_ITEM_PROPERTY('GUVALTI_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY
	 * ('GUVALTI_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('GUVALTI_MI',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * 
	 * -- -- Added the following six lines to allow another form to call this
	 * form, -- pass it a last_name and first_name and automatically do a
	 * SOUNDEX name search. -- The calling program must value
	 * GLOBAL.FORM_WAS_CALLED to 'Y', GLOBAL.LAST_NAME, -- GLOBAL.FIRST_NAME,
	 * AND GLOBAL.CALLING_FORM to 'NAME_SEARCH'. Also added the END IF; -- after
	 * ENTER_QUERY ; Scott Geiser 04/10/96 -- IF :GLOBAL.FORM_WAS_CALLED = 'Y'
	 * THEN -- Clear globals Defect 46744 :GLOBAL.SEARCH_ID := '';
	 * :GLOBAL.LAST_NAME := ''; :GLOBAL.FIRST_NAME := ''; :GLOBAL.MID_NAME :=
	 * ''; -- End clear globals ENTER_QUERY; ELSE -- Clear globals Defect 46744
	 * :GLOBAL.SEARCH_ID := ''; :GLOBAL.LAST_NAME := ''; :GLOBAL.FIRST_NAME :=
	 * ''; :GLOBAL.MID_NAME := ''; -- End clear globals ENTER_QUERY ; END IF ;
	 * G$_SETMENU('main.block',1); G$_SSN_SET_ITEM_HINT('GUVALTI.GUVALTI_SSN');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void Guialti_TaskStarted(EventObject args) {

		if (getGlobal("FORM_WAS_CALLED").equals("Y")) {
			if (getMenuItemEnabled("Action.Select") == false)

			{
				setMenuItemEnabled("Action.Select", true);
			}
		}
		getTask().getGoqrpls().gSetWinProperty();
		executeAction("LOAD_FORM_HEADER");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSetInstProperty();
		getFormModel().getButtonControlBlock().setCaseInsensitiveRg(toStr("T"));
		goBlock(toStr("GUVALTI"));
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_LAST_NAME", true);
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_FIRST_NAME", true);
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_FIRST_NAME", true);

		if (getGlobal("FORM_WAS_CALLED").equals("Y")) {
			setGlobal("SEARCH_ID", toStr(""));
			setGlobal("LAST_NAME", toStr(""));
			setGlobal("FIRST_NAME", toStr(""));
			setGlobal("MID_NAME", toStr(""));
			enterQuery();
		} else {
			setGlobal("SEARCH_ID", toStr(""));
			setGlobal("LAST_NAME", toStr(""));
			setGlobal("FIRST_NAME", toStr(""));
			setGlobal("MID_NAME", toStr(""));
			enterQuery();
		}
		getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
		getTask().getGoqrpls().gSsnSetItemHint(toStr("GUVALTI.GUVALTI_SSN"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-SCRUP SCROLL_UP ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void Guialti_KeyScrup() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-SCRDOWN SCROLL_DOWN ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void Guialti_KeyScrdown() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-NXTKEY :GLOBAL.VALUE :=
	 * :GUVALTI.GUVALTI_ID ;
	 * 
	 * gokfgac.p_search_form_update_temp_pidm(:guvalti.guvalti_pidm); --
	 * G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
	 */
	/*
	 * <p>The exit key has been redefined to pass the id from the name search
	 * form
	 * 
	 * to the calling form and exit.<b>Migration Comments</b> Generated from
	 * trigger: GUIALTI.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void Guialti_KeyNxtkey() {

		GuvaltiAdapter guvaltiElement = (GuvaltiAdapter) this.getFormModel()
				.getGuvalti().getRowAdapter(true);
		if(guvaltiElement == null){
			return;
		}
		setGlobal("VALUE", guvaltiElement.getGuvaltiId());
		Gokfgac.pSearchFormUpdateTempPidm(guvaltiElement.getGuvaltiPidm());
		getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.FORM_KEY_MENU
	 * EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUIALTI.FORM_KEY_MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "FORM_KEY_MENU")
	public void Guialti_FormKeyMenu() {

		executeAction("INVALID_FUNCTION_MSG");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-EXIT -- 61-1 --
	 * :GLOBAL.VALUE := :GUVALTI.GUVALTI_ID; -- -- SET_FORM_PROPERTY(NAME_IN(
	 * 'SYSTEM.CURRENT_FORM'),DEFER_REQUIRED_ENFORCEMENT,PROPERTY_TRUE); --
	 * SET_FORM_PROPERTY
	 * (NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION_UNIT,FORM_SCOPE); --
	 * SET_FORM_PROPERTY
	 * (NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_FALSE); --
	 * EXIT_FORM(NO_VALIDATE); G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void Guialti_Exit() {
		getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.KEY-CLRFRM CLEAR_FORM;
	 * G$_CHECK_FAILURE; EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
	 * G$_CHECK_FAILURE; --message('clr-form trigger');pause;
	 * :CASE_INSENSITIVE_RG := 'T';
	 * SET_ITEM_PROPERTY('GUVALTI_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY
	 * ('GUVALTI_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('GUVALTI_MI',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
	 * ENTER_QUERY;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void Guialti_ClearTask() {

		clearTask();
		getTask().getGoqrpls().gCheckFailure();
		executeAction("LOAD_FORM_HEADER");
		getTask().getGoqrpls().gCheckFailure();
		getFormModel().getButtonControlBlock().setCaseInsensitiveRg(toStr("T"));
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_LAST_NAME", true);
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_FIRST_NAME", true);
		ItemServices.setItemCaseInsensitiveQuery("GUVALTI_MI", true);
		enterQuery();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUIALTI.SAVE_KEYS :GLOBAL.KEY_IDNO
	 * := :GUVALTI.GUVALTI_ID ;
	 * gokfgac.p_search_form_update_temp_pidm(:guvalti.guvalti_pidm);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUIALTI.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void Guialti_SaveKeys() {

		GuvaltiAdapter guvaltiElement = (GuvaltiAdapter) this.getFormModel()
				.getGuvalti().getRowAdapter(true);
		if(guvaltiElement == null){
			return;
		}
		setGlobal("KEY_IDNO", guvaltiElement.getGuvaltiId());
		Gokfgac.pSearchFormUpdateTempPidm(guvaltiElement.getGuvaltiPidm());
	}

}
