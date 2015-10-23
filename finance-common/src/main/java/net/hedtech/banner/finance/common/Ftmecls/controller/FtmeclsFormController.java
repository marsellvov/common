package net.hedtech.banner.finance.common.Ftmecls.controller;

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
import net.hedtech.banner.finance.common.Ftmecls.model.*;
import net.hedtech.banner.finance.common.Ftmecls.*;
import net.hedtech.banner.finance.common.Ftmecls.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;

public class FtmeclsFormController extends DefaultFormController {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_FORM_CLASS");
	}

	public FtmeclsFormController(ITask task) {
		super(task);
	}

	@Override
	public FtmeclsTask getTask() {
		return (FtmeclsTask) super.getTask();
	}

	public FtmeclsModel getFormModel() {
		return this.getTask().getModel();
	}

	// action methods generated from triggers
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.G$_VERIFY_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_VERIFY_ACCESS")
	public void Ftmecls_GVerifyAccess() {

		getGFormClass().gVerifyAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void Ftmecls_GRevokeAccess() {

		getGFormClass().gRevokeAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void Ftmecls_TaskStartedPre(EventObject args) {

		getGFormClass().taskStartedPre(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void Ftmecls_PreFormTrg() {

		getGFormClass().preFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskEnded
	public void Ftmecls_TaskEnded(EventObject args) {

		getGFormClass().taskEnded(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void Ftmecls_PostFormTrg() {

		getGFormClass().postFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void Ftmecls_blockIn() {

		getGFormClass().blockIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void Ftmecls_PreBlockTrg() {

		getGFormClass().preBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void Ftmecls_blockOut() {

		getGFormClass().blockOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void Ftmecls_PostBlockTrg() {

		getGFormClass().postBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void Ftmecls_BeforeCommit(CancelEvent args) {

		getGFormClass().beforeCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void Ftmecls_PreCommitTrg() {

		getGFormClass().preCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void Ftmecls_OnError(EventObject args) {

		getGFormClass().onError(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void Ftmecls_OnRollback() {

		getGFormClass().onRollback();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void Ftmecls_OnRollbackTrg() {

		getGFormClass().onRollbackTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void Ftmecls_OnSelect() {

		getGFormClass().onSelect();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void Ftmecls_AfterCommit(EventObject args) {

		getGFormClass().afterCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void Ftmecls_PostFormsCommitTrg() {

		getGFormClass().postFormsCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void Ftmecls_buttonClick() {

		getGFormClass().click();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@Before
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void Ftmecls_blockChange() {

		getGFormClass().blockChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void Ftmecls_WhenNewBlockInstanceTrg() {

		getGFormClass().whenNewBlockInstanceTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void Ftmecls_doubleClick() {

		getGFormClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void Ftmecls_WhenTimerExpired(NString timerName) {

		getGFormClass().whenTimerExpired(timerName);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void Ftmecls_WhenWindowActivated() {

		getGFormClass().whenWindowActivated();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void Ftmecls_WhenWindowActivatedTrg() {

		getGFormClass().whenWindowActivatedTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void Ftmecls_WhenWindowClosed() {

		getGFormClass().whenWindowClosed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void Ftmecls_ClearTask() {
		
		clearTask();
		getTask().getGoqrpls().gCheckFailure();
		executeAction("LOAD_FORM_HEADER");
		getTask().getGoqrpls().gCheckFailure();
		executeQuery();
		getTask().getGoqrpls().gCheckFailure();
//		getGFormClass().clearTask();
		
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void Ftmecls_Help() {

		getGFormClass().help();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void Ftmecls_F0() {

		getGFormClass().f0();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void Ftmecls_F2() {

		getGFormClass().f2();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void Ftmecls_MoveDown() {

		getGFormClass().moveDown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void Ftmecls_MoveUp() {

		getGFormClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void Ftmecls_ListValues() {

		getGFormClass().listValues();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void Ftmecls_KeyMenu() {

		getGFormClass().keyMenu();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void Ftmecls_NextBlock() {

		getGFormClass().nextBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void Ftmecls_PreviousBlock() {

		getGFormClass().previousBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void Ftmecls_NextRecord() {

		getGFormClass().nextRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void Ftmecls_PreviousRecord() {

		getGFormClass().previousRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void Ftmecls_KeyNxtset() {

		getGFormClass().keyNxtset();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void Ftmecls_KeyScrup() {

		getGFormClass().keyScrup();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void Ftmecls_KeyScrdown() {

		getGFormClass().keyScrdown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void Ftmecls_KeyPrint() {

		getGFormClass().keyPrint();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void Ftmecls_Search() {

		getGFormClass().search();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void Ftmecls_ExecuteQuery() {

		getGFormClass().executeQuery();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void Ftmecls_Exit() {

		getGFormClass().exit();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void Ftmecls_KeyExitTrg() {

		getGFormClass().keyExitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void Ftmecls_KeyNxtkey() {

		getGFormClass().keyNxtkey();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void Ftmecls_KeyNxtkeyTrg() {

		getGFormClass().keyNxtkeyTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void Ftmecls_GlobalCopy() {

		getGFormClass().globalCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void Ftmecls_ListValuesCopy() {

		getGFormClass().listValuesCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void Ftmecls_SaveKeys() {

		getGFormClass().saveKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void Ftmecls_InvalidOptionMsg() {

		getGFormClass().invalidOptionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void Ftmecls_UpdateActivity() {

		getGFormClass().updateActivity();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.DISABLE_KEYS
	 * SET_ITEM_PROPERTY('FTVECLS_BUDGET_ROLL_IND',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_CONTRACT_IND',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_DESC',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_DAY',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_PAY',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_PAYS_PER_YEAR',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE_LBT',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE_LBT',ENABLED,PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE_LBT',ENABLED,PROPERTY_OFF);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void Ftmecls_DisableKeys() {

		setItemEnabled("FTVECLS_BUDGET_ROLL_IND", false);
		setItemEnabled("FTVECLS_CONTRACT_IND", false);
		setItemEnabled("FTVECLS_DESC", false);
		setItemEnabled("FTVECLS_ECLS_CODE", false);
		setItemEnabled("FTVECLS_HOURS_PER_DAY", false);
		setItemEnabled("FTVECLS_HOURS_PER_PAY", false);
		setItemEnabled("FTVECLS_PAYS_PER_YEAR", false);
		setItemEnabled("FTVECLS_PICT_CODE", false);
		setItemEnabled("FTVECLS_WKSH_CODE", false);
		setItemEnabled("FTVECLS_ECLS_CODE_LBT", false);
		setItemEnabled("FTVECLS_PICT_CODE_LBT", false);
		setItemEnabled("FTVECLS_WKSH_CODE_LBT", false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.EDIT_HOURS_PAY IF (
	 * :GLOBAL.QUERY_MODE = '1' ) THEN RETURN ; END IF ; G$_CHECK_VALUE
	 * ((:FTVECLS_HOURS_PER_PAY <= 0), G$_NLS.Get('FTMECLS-0000',
	 * 'FORM','*ERROR* Hours per pay must be greater than zero.') , TRUE, TRUE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.EDIT_HOURS_PAY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_HOURS_PAY")
	public void Ftmecls_EditHoursPay() {

		FtveclsAdapter ftveclsElement = (FtveclsAdapter) this.getFormModel()
				.getFtvecls().getRowAdapter(true);
		if(ftveclsElement!=null){
		if ((getGlobal("QUERY_MODE").equals("1"))) {
			return;
		}
		getTask()
				.getGoqrpls()
				.gCheckValue(toBool(
						((ftveclsElement.getFtveclsHoursPerPay()
								.lesserOrEquals(0)))),
						GNls.Fget(
								toStr("FTMECLS-0000"),
								toStr("FORM"),
								toStr("*ERROR* Hours per pay must be greater than zero.")),
						toBool(NBool.True), toBool(NBool.True));
	}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.ENABLE_KEYS IF
	 * GET_ITEM_PROPERTY('FTVECLS_BUDGET_ROLL_IND',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_BUDGET_ROLL_IND',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_BUDGET_ROLL_IND',NAVIGABLE,PROPERTY_ON); END
	 * IF; IF GET_ITEM_PROPERTY('FTVECLS_CONTRACT_IND',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_CONTRACT_IND',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_CONTRACT_IND',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_DESC',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_DESC',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_DESC',NAVIGABLE,PROPERTY_ON); END IF; IF
	 * GET_ITEM_PROPERTY('FTVECLS_ECLS_CODE',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE',NAVIGABLE,PROPERTY_ON); END IF; IF
	 * GET_ITEM_PROPERTY('FTVECLS_HOURS_PER_DAY',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_DAY',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_DAY',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_HOURS_PER_PAY',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_PAY',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_HOURS_PER_PAY',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_PAYS_PER_YEAR',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_PAYS_PER_YEAR',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_PAYS_PER_YEAR',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_PICT_CODE',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE',NAVIGABLE,PROPERTY_ON); END IF; IF
	 * GET_ITEM_PROPERTY('FTVECLS_WKSH_CODE',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE',NAVIGABLE,PROPERTY_ON); END IF; IF
	 * GET_ITEM_PROPERTY('FTVECLS_ECLS_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE_LBT',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_ECLS_CODE_LBT',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_PICT_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE_LBT',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_PICT_CODE_LBT',NAVIGABLE,PROPERTY_ON); END IF;
	 * IF GET_ITEM_PROPERTY('FTVECLS_WKSH_CODE_LBT',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE_LBT',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('FTVECLS_WKSH_CODE_LBT',NAVIGABLE,PROPERTY_ON); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void Ftmecls_EnableKeys() {

		if (getItemEnabled("FTVECLS_BUDGET_ROLL_IND").equals("FALSE")) {
			setItemEnabled("FTVECLS_BUDGET_ROLL_IND", true);
			setItemNavigable("FTVECLS_BUDGET_ROLL_IND", true);
		}
		if (getItemEnabled("FTVECLS_CONTRACT_IND").equals("FALSE")) {
			setItemEnabled("FTVECLS_CONTRACT_IND", true);
			setItemNavigable("FTVECLS_CONTRACT_IND", true);
		}
		if (getItemEnabled("FTVECLS_DESC").equals("FALSE")) {
			setItemEnabled("FTVECLS_DESC", true);
			setItemNavigable("FTVECLS_DESC", true);
		}
		if (getItemEnabled("FTVECLS_ECLS_CODE").equals("FALSE")) {
			setItemEnabled("FTVECLS_ECLS_CODE", true);
			setItemNavigable("FTVECLS_ECLS_CODE", true);
		}
		if (getItemEnabled("FTVECLS_HOURS_PER_DAY").equals("FALSE")) {
			setItemEnabled("FTVECLS_HOURS_PER_DAY", true);
			setItemNavigable("FTVECLS_HOURS_PER_DAY", true);
		}
		if (getItemEnabled("FTVECLS_HOURS_PER_PAY").equals("FALSE")) {
			setItemEnabled("FTVECLS_HOURS_PER_PAY", true);
			setItemNavigable("FTVECLS_HOURS_PER_PAY", true);
		}
		if (getItemEnabled("FTVECLS_PAYS_PER_YEAR").equals("FALSE")) {
			setItemEnabled("FTVECLS_PAYS_PER_YEAR", true);
			setItemNavigable("FTVECLS_PAYS_PER_YEAR", true);
		}
		if (getItemEnabled("FTVECLS_PICT_CODE").equals("FALSE")) {
			setItemEnabled("FTVECLS_PICT_CODE", true);
			setItemNavigable("FTVECLS_PICT_CODE", true);
		}
		if (getItemEnabled("FTVECLS_WKSH_CODE").equals("FALSE")) {
			setItemEnabled("FTVECLS_WKSH_CODE", true);
			setItemNavigable("FTVECLS_WKSH_CODE", true);
		}
		if (getItemEnabled("FTVECLS_ECLS_CODE_LBT").equals("FALSE")) {
			setItemEnabled("FTVECLS_ECLS_CODE_LBT", true);
//			setItemNavigable("FTVECLS_ECLS_CODE_LBT", true);
		}
		if (getItemEnabled("FTVECLS_PICT_CODE_LBT").equals("FALSE")) {
			setItemEnabled("FTVECLS_PICT_CODE_LBT", true);
//			setItemNavigable("FTVECLS_PICT_CODE_LBT", true);
		}
		if (getItemEnabled("FTVECLS_WKSH_CODE_LBT").equals("FALSE")) {
			setItemEnabled("FTVECLS_WKSH_CODE_LBT", true);
//			setItemNavigable("FTVECLS_WKSH_CODE_LBT", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.EDIT_HOURS_DAY IF (
	 * :GLOBAL.QUERY_MODE = '1' ) THEN RETURN ; END IF ; G$_CHECK_VALUE
	 * ((:FTVECLS_HOURS_PER_DAY NOT BETWEEN 1 AND 24),
	 * G$_NLS.Get('FTMECLS-0013', 'FORM','*ERROR* Hours per day must be between
	 * 1 and 24.') , TRUE, TRUE );
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.EDIT_HOURS_DAY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "EDIT_HOURS_DAY")
	public void Ftmecls_EditHoursDay() {

		FtveclsAdapter ftveclsElement = (FtveclsAdapter) this.getFormModel()
				.getFtvecls().getRowAdapter(true);
		if(ftveclsElement!=null){
		if ((getGlobal("QUERY_MODE").equals("1"))) {
			return;
		}
		getTask()
				.getGoqrpls()
				.gCheckValue(
						(toBool(!(between((ftveclsElement.getFtveclsHoursPerDay()), toNumber(1),
								toNumber(24))))),
						GNls.Fget(
								toStr("FTMECLS-0013"),
								toStr("FORM"),
								toStr("*ERROR* Hours per day must be between 1 and 24.")),
						toBool(NBool.True), toBool(NBool.True));
	}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.INVALID_FUNCTION_MSG
	 * MESSAGE( G$_NLS.Get('FTMECLS-0014', 'FORM','Invalid function; press SHOW
	 * KEYS for valid functions.') ) ; RAISE FORM_TRIGGER_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.INVALID_FUNCTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_FUNCTION_MSG")
	public void Ftmecls_InvalidFunctionMsg() {

		errorMessage(GNls
				.Fget(toStr("FTMECLS-0014"),
						toStr("FORM"),
						toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.0';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Ftmecls_LoadCurrentRelease() {

		getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.LOAD_FORM_HEADER
	 * :CURRENT_FORM := :SYSTEM.CURRENT_FORM ; -- :CURRENT_DATE :=
	 * TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ; :CURRENT_TIME :=
	 * TO_CHAR(SYSDATE, 'HH24:MI:SS') ; -- :CURRENT_INSTITUTION :=
	 * :GLOBAL.INSTITUTION ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Ftmecls_LoadFormHeader() {

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
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.PRE-UPDATE EXECUTE_TRIGGER(
	 * 'UPDATE_ACTIVITY_DATE' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void Ftmecls_BeforeRowUpdate(RowAdapterEvent args) {

		
		executeAction("UPDATE_ACTIVITY_DATE");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.PRE-INSERT EXECUTE_TRIGGER(
	 * 'UPDATE_ACTIVITY_DATE' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FTMECLS.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void Ftmecls_BeforeRowInsert(RowAdapterEvent args) {

		executeAction("UPDATE_ACTIVITY_DATE");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.UPDATE_ACTIVITY_DATE
	 * :WORKDATE := :SYSTEM.CURRENT_BLOCK ; -- :WORKDATE := SUBSTR(:WORKDATE, 1,
	 * 7) ; -- :WORKDATE := RPAD(:WORKDATE, 21, '_ACTIVITY_DATE') ; -- COPY(
	 * :CURRENT_DATE, :WORKDATE ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.UPDATE_ACTIVITY_DATE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY_DATE")
	public void Ftmecls_UpdateActivityDate() {

		getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
		//
		getFormModel().getFormHeader().setWorkdate(
				substring(getFormModel().getFormHeader().getWorkdate(),
						toInt(1), toInt(7)));
		//
		getFormModel().getFormHeader().setWorkdate(toStr(
				rpad(getFormModel().getFormHeader().getWorkdate(), 21,
						"_ACTIVITY_DATE")));
		//
		copy(getFormModel().getFormHeader().getCurrentDate(), getFormModel()
				.getFormHeader().getWorkdate());
	}

	/*
	 * Original PL/SQL code code for TRIGGER FTMECLS.WHEN-NEW-FORM-INSTANCE
	 * G$_SET_WIN_PROPERTY; EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
	 * G$_CHECK_FAILURE ; EXECUTE_QUERY ; G$_SET_INST_PROPERTY;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FTMECLS.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void Ftmecls_TaskStarted(EventObject args) {

		getTask().getGoqrpls().gSetWinProperty();
		executeAction("LOAD_FORM_HEADER");
		getTask().getGoqrpls().gCheckFailure();
		executeQuery();
		getTask().getGoqrpls().gSetInstProperty();
	}

}
