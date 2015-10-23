package net.hedtech.banner.general.common.BannerMain.controller;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.core.utils.behavior.annotations.Before;
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
import morphis.foundations.core.appsupportlib.runtime.web.message.CallFormData;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageRequestHelper;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.commands.CommandScope;
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
import morphis.foundations.core.util.profile.UserProfileServices;
import morphis.workspace.forms.main.controller.MainFormController;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.BannerMain.model.*;
import net.hedtech.banner.general.common.BannerMain.*;
import net.hedtech.banner.general.common.BannerMain.services.*;
import net.hedtech.banner.general.common.Guagmnu.model.MessagesAdapter;
import net.hedtech.banner.general.common.Guagmnu.services.UnknownTypes;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class BannerMainFormController extends MainFormController {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
//	}
	
	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}

	public BannerMainFormController(ITask task) {
		super(task);

	}

	@Override
	public BannerMainTask getTask() {
		return (BannerMainTask) super.getTask();
	}

	public BannerMainModel getFormModel() {
		return this.getTask().getModel();
	}

	//Actions to start forms
	@ActionTrigger(action="FORM_EVENT")
	public void formEvent(String name, String value)
	{
		
		String eventName = name.toUpperCase();
		((net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getLibrary("GOQRPLS")).getGXe().xeController(toStr(eventName), toStr(value));
	}
	
	// action methods generated from triggers
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.G$_VERIFY_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_VERIFY_ACCESS")
	public void Guainit_GVerifyAccess() {

		getGFormClass().gVerifyAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void Guainit_GRevokeAccess() {

		getGFormClass().gRevokeAccess();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.BANNER_XE_SEND_CONTEXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "BANNER_XE_SEND_CONTEXT")
	public void Guainit_BannerXeSendContext() {

		getGFormClass().bannerXeSendContext();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void Guainit_PreFormTrg() {

		getGFormClass().preFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void Guainit_PostFormTrg() {

		getGFormClass().postFormTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void Guainit_blockIn() {

		getGFormClass().blockIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void Guainit_PreBlockTrg() {

		getGFormClass().preBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void Guainit_blockOut() {

		getGFormClass().blockOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void Guainit_PostBlockTrg() {

		getGFormClass().postBlockTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void Guainit_BeforeCommit(CancelEvent args) {

		getGFormClass().beforeCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void Guainit_PreCommitTrg() {

		getGFormClass().preCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void Guainit_BeforeRowInsert(RowAdapterEvent args) {

		getGFormClass().beforeRowInsert(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void Guainit_BeforeRowUpdate(RowAdapterEvent args) {

		getGFormClass().beforeRowUpdate(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void Guainit_OnError(EventObject args) {

		getGFormClass().onError(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void Guainit_OnRollback() {

		getGFormClass().onRollback();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void Guainit_OnRollbackTrg() {

		getGFormClass().onRollbackTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void Guainit_OnSelect() {

		getGFormClass().onSelect();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void Guainit_AfterCommit(EventObject args) {

		getGFormClass().afterCommit(args);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void Guainit_PostFormsCommitTrg() {

		getGFormClass().postFormsCommitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void Guainit_buttonClick() {

		getGFormClass().click();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	@Before
	public void Guainit_blockChange() {

		getGFormClass().blockChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void Guainit_WhenNewBlockInstanceTrg() {

		getGFormClass().whenNewBlockInstanceTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void Guainit_doubleClick() {

		getGFormClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void Guainit_WhenWindowActivated() {

		getGFormClass().whenWindowActivated();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void Guainit_WhenWindowActivatedTrg() {

		getGFormClass().whenWindowActivatedTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void Guainit_WhenWindowClosed() {

		getGFormClass().whenWindowClosed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void Guainit_ClearTask() {

		getGFormClass().clearTask();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void Guainit_Help() {

		getGFormClass().help();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void Guainit_F0() {

		getGFormClass().f0();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void Guainit_F2() {

		getGFormClass().f2();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-F6
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F6", function = KeyFunction.KEY_F6)
	public void Guainit_F6() {

		getGFormClass().f6();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void Guainit_MoveDown() {

		getGFormClass().moveDown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void Guainit_MoveUp() {

		getGFormClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void Guainit_ListValues() {

		getGFormClass().listValues();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void Guainit_KeyMenu() {

		getGFormClass().keyMenu();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void Guainit_NextBlock() {

		getGFormClass().nextBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void Guainit_PreviousBlock() {

		getGFormClass().previousBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void Guainit_NextRecord() {

		getGFormClass().nextRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void Guainit_PreviousRecord() {

		getGFormClass().previousRecord();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void Guainit_KeyNxtset() {

		getGFormClass().keyNxtset();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void Guainit_KeyScrup() {

		getGFormClass().keyScrup();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void Guainit_KeyScrdown() {

		getGFormClass().keyScrdown();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void Guainit_KeyPrint() {

		getGFormClass().keyPrint();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void Guainit_Search() {

		getGFormClass().search();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void Guainit_ExecuteQuery() {

		getGFormClass().executeQuery();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void Guainit_Exit() {

		getGFormClass().exit();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void Guainit_KeyExitTrg() {

		getGFormClass().keyExitTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void Guainit_KeyNxtkey() {

		getGFormClass().keyNxtkey();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void Guainit_KeyNxtkeyTrg() {

		getGFormClass().keyNxtkeyTrg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void Guainit_GlobalCopy() {

		getGFormClass().globalCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void Guainit_ListValuesCopy() {

		getGFormClass().listValuesCopy();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Guainit_LoadFormHeader() {

		getGFormClass().loadFormHeader();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void Guainit_SaveKeys() {

		getGFormClass().saveKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void Guainit_EnableKeys() {

		getGFormClass().enableKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void Guainit_DisableKeys() {

		getGFormClass().disableKeys();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void Guainit_InvalidOptionMsg() {

		getGFormClass().invalidOptionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void Guainit_UpdateActivity() {

		getGFormClass().updateActivity();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.6.4';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Guainit_LoadCurrentRelease() {

		getFormModel().getDisplay().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.ON-LOGON BEGIN -- -- Add
	 * the following for International Calendar support --
	 * :GLOBAL.NLS_DATE_FORMAT := 'DD-MON-YYYY';
	 * TOOL_ENV.GETVAR('NLS_DATE_FORMAT', :GLOBAL.NLS_DATE_FORMAT); -- -- 5000-2
	 * Add the following call to the G$_WF_DRIVER.WF_EXECUE procedure to
	 * initialize -- globals that will enable the launch of a form from Workflow
	 * and, if the form has -- been invoked as part o a Workflow activity,
	 * control its behavior as needed. -- -- Note that this call has been
	 * migrated from the WHEN-NEW-FORM-INSTANCE trigger. -- :GLOBAL.WF_LOG_FILE
	 * := ''; G$_WF_DRIVER.WF_EXECUTE('WF_INIT_GLOBALS'); -- -- 5000-2 Add the
	 * following call to the G$_WF_DRIVER.WF_EXECUTE procedure to automatically
	 * -- log a Workflow user into a SCT Banner session using his/her SCT
	 * Workflow -- userid and password. -- -- If the SCT Banner session has not
	 * been launched via SCT Workflow, default logon -- processing should occur.
	 * G$_WF_DRIVER.WF_EXECUTE('WF_PERFORM_AUTO_LOGON'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.ON-LOGON
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-LOGON")
	public void Guainit_OnLogon() {
	
		//
		// Add the following for International Calendar support
		//
		setGlobal("NLS_DATE_FORMAT", toStr("DD-MON-YYYY"));
		GNlsUtility.pSetNls(toStr(UserProfileServices.getProvider()
				.getCurrentUserProfile().getCanonicalLanguage()));
//		
//		 setGlobal("NLS_DATE_FORMAT", isNull(getEnvVar("NLS_DATE_FORMAT"), getGlobal("NLS_DATE_FORMAT")));
		//
		// 5000-2 Add the following call to the G$_WF_DRIVER.WF_EXECUE procedure
		// to initialize
		// globals that will enable the launch of a form from Workflow and, if
		// the form has
		// been invoked as part o a Workflow activity, control its behavior as
		// needed.
		//
		// Note that this call has been migrated from the WHEN-NEW-FORM-INSTANCE
		// trigger.
		//
		setGlobal("WF_LOG_FILE", toStr(""));
		getTask().getGoqwflw().getGWfDriver()
				.wfExecute(toStr("WF_INIT_GLOBALS"));
		//
		// 5000-2 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
		// procedure to automatically
		// log a Workflow user into a SCT Banner session using his/her SCT
		// Workflow
		// userid and password.
		//
		// If the SCT Banner session has not been launched via SCT Workflow,
		// default logon
		// processing should occur.
		
		//MORPHIS - Removed for now
		getTask().getGoqwflw().getGWfDriver()
				.wfExecute(toStr("WF_PERFORM_AUTO_LOGON"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.POST-LOGON -- -- This
	 * trigger was added to ensure that the LOGON process was successful. If
	 * not, -- raise an error condition to cause the form to shut down. --
	 * DECLARE dummy VARCHAR2(1); db_errnum NUMBER; db_errnum_db NUMBER; db_text
	 * varchar2(150); -- al_id ALERT; al_button PLS_INTEGER; lv_date
	 * gurlogn.gurlogn_inb_last_logon_date%type; lv_user varchar2(30); --
	 * 
	 * BEGIN -- SELECT 'X' INTO dummy FROM DUAL; -- lv_user :=
	 * SYS_CONTEXT('USERENV','SESSION_USER'); lv_date :=
	 * g$_security.g$_get_last_login_time(lv_user); -- --Get the last logon date
	 * and time. pkg_timestamp_format.pk_timestamp := NVL(lv_date,SYSDATE); --
	 * -- :GLOBAL.LOGON_GREETING_NAME :=
	 * NVL(g$_security.g$_get_username_name(lv_user),lv_user); --
	 * G$_SECURITY.g$_audit_banner_logon(p_source => 'INB', p_comment => 'Logon
	 * to Banner Forms'); -- EXCEPTION WHEN OTHERS THEN al_id :=
	 * FIND_ALERT('G$_WARNING_ALERT'); -- -- This error logic is for the case
	 * when Banner security refuses logon at this time -- db_errnum := SQLCODE;
	 * db_errnum_db := DBMS_ERROR_CODE; db_text :=
	 * substr(dbms_error_text,1,150); -- IF db_errnum = -20001 THEN
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,'*ERROR* You are not
	 * authorized to logon at this time based on Banner security rules.');
	 * al_button := SHOW_ALERT(al_id); RAISE FORM_TRIGGER_FAILURE; END IF; -- --
	 * This error logic is for the case when the user cancels at the login
	 * window. -- IF (db_errnum = -3114) and (db_errnum_db = 0) THEN
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,'*ERROR* You did not connect
	 * successfully; exiting.'); al_button := SHOW_ALERT(al_id); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- -- This error logic is for the case when
	 * the user enters invalid user id/passwords. -- IF (db_errnum = -3114) and
	 * (db_errnum_db = -1017) THEN
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,'*ERROR* You did not connect
	 * successfully; exiting.'); al_button := SHOW_ALERT(al_id); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- -- This error logic is for other case
	 * when the user enters invalid login info. -- IF (db_errnum = -3114) THEN
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,'*ERROR* You did not connect
	 * successfully; exiting.'); al_button := SHOW_ALERT(al_id); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.POST-LOGON
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-LOGON")
	public void Guainit_PostLogon() {

		//
		// This trigger was added to ensure that the LOGON process was
		// successful. If not,
		// raise an error condition to cause the form to shut down.
		//
		int rowCount = 0;
		{
			NString dummy = NString.getNull();
			NNumber dbErrnum = NNumber.getNull();
			NNumber dbErrnumDb = NNumber.getNull();
			NString dbText = NString.getNull();
			//
			AlertDescriptor alId = null;
			NInteger alButton = NInteger.getNull();
			NDate lvDate = NDate.getNull();
			NString lvUser = NString.getNull();
			try {
				//
				String sql1 = "SELECT 'X' " + " FROM DUAL ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if (results1.hasData()) {
					dummy = results1.getStr(0);
				}
				results1.close();
				//
				lvUser = toStr(DbManager.getDataBaseFactory().getUser());
				lvDate = GSecurity.FgGetLastLoginTime(lvUser);
				//
				// Get the last logon date and time.
				getTask().getPkgTimestampFormat().pkTimestamp = isNull(lvDate,
						NDate.getNow());
				//
				//
				setGlobal("LOGON_GREETING_NAME",
						isNull(GSecurity.FgGetUsernameName(lvUser), lvUser));
				//
				// F2J_WARNING : Passing parameters by name is not supported.
				// Please check that the parameters are in the correct order.
				GSecurity.gAuditBannerLogon(/* pSource=> */toStr("INB"), /*
																		 * pComment=
																		 * >
																		 */
						toStr("Logon to Banner Forms"));
			} catch (Exception e) {
				alId = findAlert("G$_WARNING_ALERT");
				//
				// This error logic is for the case when Banner security refuses
				// logon at this time
				//
				dbErrnum = toNumber(errorCode());
				dbErrnumDb = toNumber(errorCode());
				dbText = substring(errorMessage(), toInt(1), toInt(150));
				//
				if (dbErrnum.equals(-(20001))) {
					setAlertMessageText(
							alId,
							"*ERROR* You are not authorized to logon at this time based on Banner security rules.");
					alButton = toInt(showAlert(alId));
					throw new ApplicationException();
				}
				//
				// This error logic is for the case when the user cancels at the
				// login window.
				//
				if ((dbErrnum.equals(-(3114))) && (dbErrnumDb.equals(0))) {
					setAlertMessageText(alId,
							"*ERROR* You did not connect successfully; exiting.");
					alButton = toInt(showAlert(alId));
					throw new ApplicationException();
				}
				//
				// This error logic is for the case when the user enters invalid
				// user id/passwords.
				//
				if ((dbErrnum.equals(-(3114))) && (dbErrnumDb.equals(-(1017)))) {
					setAlertMessageText(alId,
							"*ERROR* You did not connect successfully; exiting.");
					alButton = toInt(showAlert(alId));
					throw new ApplicationException();
				}
				//
				// This error logic is for other case when the user enters
				// invalid login info.
				//
				if ((dbErrnum.equals(-(3114)))) {
					setAlertMessageText(alId,
							"*ERROR* You did not connect successfully; exiting.");
					alButton = toInt(showAlert(alId));
					throw new ApplicationException();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.PRE-FORM DECLARE al_id
	 * ALERT; al_button NUMBER; BEGIN :PARAMETER.LAUNCH_FORM :=
	 * UPPER(NVL(:PARAMETER.LAUNCH_FORM,'GUAGMNU')); :PARAMETER.KEEP_ALIVE :=
	 * UPPER(NVL(:PARAMETER.KEEP_ALIVE,'NO')); :PARAMETER.START_TRACE :=
	 * UPPER(NVL(:PARAMETER.START_TRACE,'NO')); :PARAMETER.VPDI_CODE :=
	 * UPPER(:PARAMETER.VPDI_CODE); -- :GLOBAL.BANNER_XE := '';
	 * :GLOBAL.BANNER_XE_MODE := ''; -- :GLOBAL.VPDI_CODE := '';
	 * :GLOBAL.CURR_OPEN_FORMS := ''; :GLOBAL.CURR_NO_FORMS := '0';
	 * :GLOBAL.MAX_NO_FORMS := '0'; :GLOBAL.SKIP_FORM_CNT := 'N';
	 * :GLOBAL.SKIP_DECR_CNT := 'N'; :GLOBAL.MENU_FORM := 'GUAGMNU';
	 * :GLOBAL.CURRENT_USER := USER; :GLOBAL.FORMNAME_DISPLAY_IND := 'N'; -- --
	 * Set the global to be valued with N this one time through guainit's
	 * pre-form. -- The exit of the GUQSETI form (if called per VPD) relaunches
	 * GUAINIT with -- the global equal to Y. It is this value of Y that
	 * prevents -- a looping condition from occurring through the LEAVE_INIT
	 * trigger. -- DEFAULT_VALUE('N','GLOBAL.SET_INST');
	 * :GLOBAL.INSTITUTION_CODE :=
	 * NVL(:PARAMETER.VPDI_CODE,g$_vpdi_security.g$_vpdi_get_inst_code_fnc);
	 * :GLOBAL.DEFAULT_INSTITUTION_CODE := :GLOBAL.INSTITUTION_CODE;
	 * 
	 * -- Set the default value for Terms of Usage intially in case MEP exits
	 * prematurally DEFAULT_VALUE('?', 'GLOBAL.TOFU_OK');
	 * 
	 * -- Check Systems (Banner and Workflow) configured for MIF
	 * 
	 * -- Workflow passes a VPD code to a Banner session that is not MIF enabled
	 * IF (((:PARAMETER.VPDI_CODE IS NOT NULL) AND
	 * (g$_vpdi_security.g$_vpdi_get_inst_code_fnc IS NULL)) OR
	 * ((NAME_IN('GLOBAL.WF_VPDI_HOME_CODE') IS NOT NULL) AND
	 * (g$_vpdi_security.g$_vpdi_get_inst_code_fnc IS NULL))) THEN al_id :=
	 * FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GUAINIT-0000','FORM','*ERROR* MIF enabled application tried
	 * to run against a non-MIF enabled Banner session. Please contact your
	 * System Administrator.')); al_button := SHOW_ALERT(al_id); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- -- If the call is made from Workflow
	 * check if the MIF code value is not missing -- -- IF
	 * ((:PARAMETER.VPDI_CODE IS NULL) AND (:GLOBAL.WF_VPDI_ON = 'Y')) THEN
	 * al_id := FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GUAINIT-0001','FORM','*ERROR* Unable to log into Banner
	 * without a MIF code specified. Please contact your Workflow System
	 * Administrator.')); al_button := SHOW_ALERT(al_id); RAISE
	 * FORM_TRIGGER_FAILURE; END IF;
	 * 
	 * -- End Check Systems (Banner and Workflow) configured for MIF
	 * 
	 * -- -- If the vpdi code is passed as a parameter, verify the user is
	 * authorized -- to use it and if so, set the user home context, otherwise
	 * raise error and exit. -- IF ((:PARAMETER.VPDI_CODE IS NOT NULL) AND
	 * (:GLOBAL.INSTITUTION_CODE IS NOT NULL)) THEN IF (NOT
	 * gokvpda.f_is_vpdi_code_valid(:GLOBAL.CURRENT_USER,
	 * :PARAMETER.VPDI_CODE))THEN al_id := FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GUAINIT-0002','FORM','*ERROR* You do not have permission to
	 * logon to the selected institution, exiting.')); al_button :=
	 * SHOW_ALERT(al_id); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * g$_vpdi_security.g$_vpdi_set_home_context(:GLOBAL.INSTITUTION_CODE); END
	 * IF; -- EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
	 * EXECUTE_TRIGGER('G$_VERIFY_ACCESS'); G$_CHECK_FAILURE; -- -- The follow
	 * item is only used in this form and only used if the TIMING parameter is
	 * YES. -- IF UPPER(NVL(:PARAMETER.TIMING,'NO')) = 'YES' THEN :DATE_TIME :=
	 * TO_CHAR(SYSDATE,'DD-MON-YYYY HH24:MI:SS'); END IF;
	 * CAPTURE_TIMINGS.SET_TIME('TIME1'); -- -- Added for use by all systems
	 * utilizing either the Alternate -- User-ID/Password (GUAUIPW) Form or the
	 * External Program Interface Form (GUQINTF). -- :GLOBAL.ALT_USER_ID :=
	 * NVL(GET_APPLICATION_PROPERTY(USERNAME),:GLOBAL.CURRENT_USER);
	 * :GLOBAL.ALT_PASSWORD := NVL(GET_APPLICATION_PROPERTY(PASSWORD),'/');
	 * :GLOBAL.OS_IND := GET_APPLICATION_PROPERTY(OPERATING_SYSTEM);
	 * :GLOBAL.USER_INTERFACE := GET_APPLICATION_PROPERTY(USER_INTERFACE);
	 * :GLOBAL.QUERY_MODE := '0'; -- -- This tests if the START_TRACE command
	 * line parameter is set and if so, turns on SQL Trace. -- IF
	 * :PARAMETER.START_TRACE = 'YES' THEN G$_TRACE_PKG.TURN_SQL_TRACE_ON;
	 * G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	//JOG 06/01/2015 - Banner Guainit replacement
	//@TaskStartedPre
	public void Guainit_TaskStartedPre() {
		// MORPHIS: This block must be handled by the login
		//this.Guainit_OnLogon();
		//this.Guainit_PostLogon();
		// MORPHIS: End block
		{
			initGlobals();
			//
			executeAction("LOAD_CURRENT_RELEASE");
			executeAction("G$_VERIFY_ACCESS");
			getTask().getGoqrpls().gCheckFailure();
			//
			// The follow item is only used in this form and only used if the
			// TIMING parameter is YES.
			//
			if (upper(
					isNull(this.getFormModel()
							.getParam("TIMING", NString.class), "NO")).equals(
					"YES")) {
				getFormModel().getDisplay().setDateTime(
						toChar(NDate.getNow(), "DD-MON-YYYY HH24:MI:SS"));
			}
			getTask().getCaptureTimings().setTime(toStr("TIME1"));
			//
			// Added for use by all systems utilizing either the Alternate
			// User-ID/Password (GUAUIPW) Form or the External Program Interface
			// Form (GUQINTF).
			//
			setGlobal("ALT_USER_ID",
					isNull(getUser(), getGlobal("CURRENT_USER")));
			setGlobal("ALT_PASSWORD", isNull(getPassword(), "/"));
			// F2J_NOT_SUPPORTED : The property "APPLICATION's OPERATING_SYSTEM"
			// is not supported. See documentation for details
			// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			// setGlobal("OS_IND",
			// SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.OPERATING_SYSTEM));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'APPLICATION's OPERATING_SYSTEM' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			

			setGlobal("USER_INTERFACE", toStr(getUserInterface()));
			setGlobal("QUERY_MODE", toStr("0"));
			//
			// This tests if the START_TRACE command line parameter is set and
			// if so, turns on SQL Trace.
			//
			if (this.getFormModel().getParam("START_TRACE", NString.class)
					.equals("YES")) {
				getTask().getGoqrpls().getGTracePkg().turnSqlTraceOn();
				getTask().getGoqrpls().gCheckFailure();
			}
		}
	}

	public void initGlobals() {
		AlertDescriptor alId = null;
		NNumber alButton = NNumber.getNull();
		this.getFormModel().setParam(
				"LAUNCH_FORM",
				upper(isNull(
						this.getFormModel().getParam("LAUNCH_FORM",
								NString.class), "GUAGMNU")));
		this.getFormModel().setParam(
				"KEEP_ALIVE",
				upper(isNull(
						this.getFormModel().getParam("KEEP_ALIVE",
								NString.class), "NO")));
		this.getFormModel().setParam(
				"START_TRACE",
				upper(isNull(
						this.getFormModel().getParam("START_TRACE",
								NString.class), "NO")));
		this.getFormModel().setParam(
				"VPDI_CODE",
				upper(this.getFormModel().getParam("VPDI_CODE",
						NString.class)));
		//
		setGlobal("BANNER_XE", toStr(""));
		setGlobal("BANNER_XE_MODE", toStr(""));
		//
		setGlobal("VPDI_CODE", toStr(""));
		setGlobal("CURR_OPEN_FORMS", toStr(""));
		setGlobal("CURR_NO_FORMS", toStr("0"));
		setGlobal("MAX_NO_FORMS", toStr("0"));
		setGlobal("SKIP_FORM_CNT", toStr("N"));
		setGlobal("SKIP_DECR_CNT", toStr("N"));
		setGlobal("MENU_FORM", toStr("GUAGMNU"));
		setGlobal("CURRENT_USER", getUser());
		setGlobal("FORMNAME_DISPLAY_IND", ("N"));

		// Set the global to be valued with N this one time through
		// guainit's pre-form.
		// The exit of the GUQSETI form (if called per VPD) relaunches
		// GUAINIT with
		// the global equal to Y. It is this value of Y that prevents
		// a looping condition from occurring through the LEAVE_INIT
		// trigger.
		//
		setDefaultValue("N", "GLOBAL.SET_INST");
		setGlobal(
				"INSTITUTION_CODE",
				isNull(this.getFormModel().getParam("VPDI_CODE",
						NString.class),
						GVpdiSecurity.FgVpdiGetInstCodeFnc()));
		setGlobal("DEFAULT_INSTITUTION_CODE", getGlobal("INSTITUTION_CODE"));
		// Set the default value for Terms of Usage intially in case MEP
		// exits prematurally
		setDefaultValue("?", "GLOBAL.TOFU_OK");
		// Check Systems (Banner and Workflow) configured for MIF
		// Workflow passes a VPD code to a Banner session that is not MIF
		// enabled
		if ((((!this.getFormModel().getParam("VPDI_CODE", NString.class)
				.isNull()) && (GVpdiSecurity.FgVpdiGetInstCodeFnc()
				.isNull())) || ((!getNameIn("GLOBAL.WF_VPDI_HOME_CODE")
				.isNull()) && (GVpdiSecurity.FgVpdiGetInstCodeFnc()
				.isNull())))) {
			alId = findAlert("G$_WARNING_ALERT");
			setAlertMessageText(
					alId,
					GNls.Fget(
							toStr("GUAINIT-0000"),
							toStr("FORM"),
							toStr("*ERROR* MIF enabled application tried to run against a non-MIF enabled Banner session. Please contact your System Administrator.")));
			alButton = toNumber(showAlert(alId));
			throw new ApplicationException();
		}
		//
		// If the call is made from Workflow check if the MIF code value is
		// not missing
		//
		//
		if (((this.getFormModel().getParam("VPDI_CODE", NString.class)
				.isNull()) && (getGlobal("WF_VPDI_ON").equals("Y")))) {
			alId = findAlert("G$_WARNING_ALERT");
			setAlertMessageText(
					alId,
					GNls.Fget(
							toStr("GUAINIT-0001"),
							toStr("FORM"),
							toStr("*ERROR* Unable to log into Banner without a MIF code specified. Please contact your Workflow System Administrator.")));
			alButton = toNumber(showAlert(alId));
			throw new ApplicationException();
		}
		// End Check Systems (Banner and Workflow) configured for MIF
		//
		// If the vpdi code is passed as a parameter, verify the user is
		// authorized
		// to use it and if so, set the user home context, otherwise raise
		// error and exit.
		//
		if (((!this.getFormModel().getParam("VPDI_CODE", NString.class)
				.isNull()) && (!getGlobal("INSTITUTION_CODE").isNull()))) {
			if ((Gokvpda.fIsVpdiCodeValid(getGlobal("CURRENT_USER"), this
					.getFormModel().getParam("VPDI_CODE", NString.class))
					.not())) {
				alId = findAlert("G$_WARNING_ALERT");
				setAlertMessageText(
						alId,
						GNls.Fget(
								toStr("GUAINIT-0002"),
								toStr("FORM"),
								toStr("*ERROR* You do not have permission to logon to the selected institution, exiting.")));
				alButton = toNumber(showAlert(alId));
				throw new ApplicationException();
			}
			//
			GVpdiSecurity
					.gVpdiSetHomeContext(getGlobal("INSTITUTION_CODE"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.WHEN-NEW-FORM-INSTANCE
	 * DECLARE al_id ALERT; al_button PLS_INTEGER; do_sleep CHAR(1) := 'Y';
	 * l_nls_date_format VARCHAR2(30); l_forms_username_casesensi VARCHAR2(30);
	 * BEGIN IF (:PARAMETER.LAUNCH_FORM IS NOT NULL AND :PARAMETER.BAN_MODE IS
	 * NOT NULL) THEN :GLOBAL.BANNER_XE_MODE := 'Y'; do_sleep := 'N'; IF
	 * NVL(:GLOBAL.SET_INST,'N') = 'N' THEN
	 * web.javascript_eval_expr('startMagellan();'); END IF; END IF; -- -- Only
	 * display the logo screen if not going directly to a form other than the
	 * menu. -- IF :PARAMETER.LAUNCH_FORM IS NOT NULL THEN do_sleep := 'N'; END
	 * IF; -- IF :PARAMETER.LAUNCH_FORM = 'GUAINIT' THEN :PARAMETER.LAUNCH_FORM
	 * := 'GUAGMNU'; END IF; -- :GLOBAL.KEEP_ALIVE := :PARAMETER.KEEP_ALIVE; --
	 * -- Internal pl/sql to trap any errors when reading file and then to
	 * continue. -- IF :PARAMETER.LAUNCH_FORM = :GLOBAL.MENU_FORM THEN BEGIN
	 * SYNCHRONIZE; READ_IMAGE_FILE('banner.gif','URL','DISPLAY.LOGO_IMAGE');
	 * :GLOBAL.KEEP_ALIVE := 'YES'; EXCEPTION WHEN OTHERS THEN NULL; END;
	 * SHOW_VIEW('DESKTOP_CANVAS'); SYNCHRONIZE; END IF; --
	 * BAN_PREFERENCES.PARM_PREFS; BAN_PREFERENCES.UI_PREFS; --
	 * :GLOBAL.HELP_CALL_FORM := 'GUAHELP'; :GLOBAL.FORM_TYPE := '';
	 * :GLOBAL.SELECT := ''; :GLOBAL.LAST_TEN_CALL := 'N';
	 * :GLOBAL.NAV_FRAME_CALL := 'N'; -- :GLOBAL.INITA := 'N'; :GLOBAL.INITB :=
	 * 'N'; :GLOBAL.INITC := 'N'; :GLOBAL.INITD := 'N'; :GLOBAL.INITE := 'N';
	 * :GLOBAL.INITF := 'N'; :GLOBAL.INITG := 'Y'; :GLOBAL.INITH := 'N';
	 * :GLOBAL.INITI := 'N'; :GLOBAL.INITJ := 'N'; :GLOBAL.INITK := 'N';
	 * :GLOBAL.INITL := 'N'; :GLOBAL.INITM := 'N'; :GLOBAL.INITN := 'N';
	 * :GLOBAL.INITO := 'N'; :GLOBAL.INITP := 'N'; :GLOBAL.INITQ := 'N';
	 * :GLOBAL.INITR := 'N'; :GLOBAL.INITS := 'N'; :GLOBAL.INITT := 'N';
	 * :GLOBAL.INITU := 'N'; :GLOBAL.INITV := 'N'; :GLOBAL.INITW := 'N';
	 * :GLOBAL.INITX := 'N'; :GLOBAL.INITY := 'N'; :GLOBAL.INITZ := 'N';
	 * :GLOBAL.GURJOBS_DIRECTORY := ''; :GLOBAL.KEY_JOB_NAME := '';
	 * :GLOBAL.KEY_IDNO := ''; :GLOBAL.KEY_PARA := ''; :GLOBAL.KEY_LETR := '';
	 * :GLOBAL.SECR_USER := ''; :GLOBAL.SECRFRM := ''; :GLOBAL.NEW_FORM := '';
	 * :GLOBAL.NEW_ID := ''; :GLOBAL.ZIP_DEFAULT_LENGTH := ''; :GLOBAL.INST :=
	 * ''; -- -- -- -- -- -- -- -- :GLOBAL.FORMS_USERNAME_CASESENSI := '';
	 * tool_env.getvar('FORMS_USERNAME_CASESENSITIVE',
	 * l_forms_username_casesensi); IF l_forms_username_casesensi IS NULL THEN
	 * l_forms_username_casesensi := '0'; ELSE l_forms_username_casesensi :=
	 * '1'; END IF; -- -- -- With initial testing of
	 * FORMS_USERNAME_CASESENSITIVE in this General8.2 modification, -- -- --
	 * any non-null value enables the case sensitive password processing. Our
	 * Banner documentation -- -- -- indicates, as does Ncles documentation,
	 * that '1' should be used. However, the above IF will -- -- -- set the
	 * gloabl for any non-null value provided with the
	 * FORMS_USERNAME_CASESENSITIVE env variable.
	 * COPY(l_forms_username_casesensi,'GLOBAL.FORMS_USERNAME_CASESENSI'); -- --
	 * -- -- -- -- -- -- -- 7.3 - Moved from goqrpls.g$_forms_nls main begin-end
	 * to here, -- Added for International Calendar SCB. --
	 * tool_env.getvar('NLS_DATE_FORMAT', l_nls_date_format); IF
	 * l_nls_date_format IS NOT NULL THEN
	 * G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format); ELSE SELECT VALUE INTO
	 * l_nls_date_format FROM NLS_SESSION_PARAMETERS WHERE PARAMETER =
	 * 'NLS_DATE_FORMAT'; -- IF INSTR(l_nls_date_format,'YYYY') > 0 OR
	 * INSTR(l_nls_date_format,'RRRR') > 0 THEN
	 * G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format); ELSE IF
	 * INSTR(l_nls_date_format,'YY') > 0 THEN l_nls_date_format :=
	 * REPLACE(l_nls_date_format,'YY','RRRR'); ELSIF
	 * INSTR(l_nls_date_format,'RR') > 0 THEN l_nls_date_format :=
	 * REPLACE(l_nls_date_format,'RR','RRRR'); END IF; --
	 * G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format);
	 * G$_TRACE_PKG.DO_EXEC_SQL('ALTER SESSION SET NLS_DATE_FORMAT =
	 * '||''''||l_nls_date_format||''''); END IF; END IF; --
	 * COPY(GET_APPLICATION_PROPERTY
	 * (BUILTIN_DATE_FORMAT),'GLOBAL.BUILTIN_DATE_FORMAT');
	 * SET_APPLICATION_PROPERTY
	 * (BUILTIN_DATE_FORMAT,G$_DATE.GET_NLS_DATE_FORMAT);
	 * SET_APPLICATION_PROPERTY(PLSQL_DATE_FORMAT,G$_DATE.GET_NLS_DATE_FORMAT);
	 * -- -- Call the packaged procedure inorder to format the last logon date
	 * and time according to -- -- NLS settings and assign this value to
	 * :GLOBAL.LAST_LOGON_TIME pkg_timestamp_format.p_format_timestamp; -- -- --
	 * --
	 * 
	 * DECLARE CURSOR PTI_CURSOR_INIT IS SELECT GUBINST_NAME,
	 * GUBINST_OPERATING_SYSTEM_IND,
	 * TO_CHAR(SYSDATE,G$_DATE.GET_NLS_DATE_FORMAT), TO_CHAR(SYSDATE,
	 * 'HH24:MI:SS'), NVL(GUBINST_FINAID_INSTALLED,'N'),
	 * NVL(GUBINST_FINAID_IND,'N'), NVL(GUBINST_STUDENT_INSTALLED,'N'),
	 * NVL(GUBINST_ALUMNI_INSTALLED,'N'), NVL(GUBINST_FINANCE_INSTALLED,'N'),
	 * NVL(GUBINST_HUMANRE_INSTALLED,'N'), NVL(GUBINST_POSBUD_INSTALLED,'N'),
	 * NVL(GUBINST_BILCSH_INSTALLED,'N'), SYS_CONTEXT('USERENV','SESSIONID'),
	 * NVL(GUBINST_ZIP_DEFAULT_LENGTH,0), GUBINST_CENTURY_PIVOT,
	 * GUBINST_DATE_DEFAULT_FORMAT, GUBINST_INSTANCE_NAME,
	 * NVL(GUBINST_MAX_OPEN_FORMS,0), GUBINST_HIGHED_GOVT_IND,
	 * GUBINST_SQLTRACE_ENABLED_IND, SYS_CONTEXT('USERENV','OS_USER'),
	 * GUBINST_WF_ENABLED_IND, GUBINST_SSN_SEARCH_ENABLED_IND,
	 * GUBINST_SSN_MAX_LENGTH FROM GUBINST WHERE UPPER(GUBINST_KEY) = 'INST'; --
	 * CURSOR GET_USER_ID (p_USER VARCHAR2) IS SELECT USER_ID FROM ALL_USERS
	 * WHERE USERNAME = p_USER; -- BEGIN OPEN PTI_CURSOR_INIT; FETCH
	 * PTI_CURSOR_INIT INTO :GLOBAL.INSTITUTION, :GLOBAL.OPSYS,
	 * :GLOBAL.CURRENT_DATE, :GLOBAL.CURRENT_TIME, :GLOBAL.RESSYS,
	 * :GLOBAL.SAMSYS, :GLOBAL.STUSYS, :GLOBAL.ALUSYS, :GLOBAL.FINSYS,
	 * :GLOBAL.HRESYS, :GLOBAL.POSBUD, :GLOBAL.BILCSH, :GLOBAL.SESSION_ID,
	 * :GLOBAL.ZIP_DEFAULT_LENGTH, :GLOBAL.CENTURY_PIVOT,
	 * :GLOBAL.DATE_DEFAULT_FORMAT, :GLOBAL.INST, :GLOBAL.MAX_NO_FORMS,
	 * :GLOBAL.HIGHED_GOVT_IND, :GLOBAL.SQLTRACE_ENABLED_IND,
	 * :GLOBAL.OS_USER_ID, :GLOBAL.WF_ENABLED_IND,
	 * :GLOBAL.SSN_SEARCH_ENABLED_IND, :GLOBAL.GUBINST_SSN_MAX_LENGTH; -- IF
	 * PTI_CURSOR_INIT%NOTFOUND THEN al_id := FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GUAINIT-0003','FORM','*ERROR* Control record with KEY = INST
	 * not found in GUBINST table.')); al_button := SHOW_ALERT(al_id); CLOSE
	 * PTI_CURSOR_INIT; RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE
	 * PTI_CURSOR_INIT; -- OPEN GET_USER_ID(:GLOBAL.CURRENT_USER); FETCH
	 * GET_USER_ID INTO :GLOBAL.NUMERIC_USER_ID; IF GET_USER_ID%NOTFOUND THEN
	 * al_id := FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT
	 * ,G$_NLS.Get('GUAINIT-0004','FORM','*ERROR* Unable to obtain user info
	 * from database.')); al_button := SHOW_ALERT(al_id); CLOSE GET_USER_ID;
	 * RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE GET_USER_ID; -- END; --
	 * :GLOBAL.CALL_ERROR := ''; :GLOBAL.CALLFRM := ''; :GLOBAL.CALL_FORM := '';
	 * :GLOBAL.CALLING_FORM := ''; :GLOBAL.JOB_ID := ''; :GLOBAL.CALL_STATUS_MSG
	 * := ''; :GLOBAL.CALL_DISPLAY_MSG := ''; :GLOBAL.PRODUCT_IND := '';
	 * :GLOBAL.GEOR_CODE := ''; :GLOBAL.GEOD_CODE := ''; :GLOBAL.KEY_CALL_CODE
	 * := ''; :GLOBAL.VALIDATION_VALUE := ''; :GLOBAL.VALIDATION_LABEL := '';
	 * :GLOBAL.VALIDATION_ERROR_IND := ''; :GLOBAL.VALIDATION_ERROR_MSG := '';
	 * :GLOBAL.ONE_UP_NO := ''; :GLOBAL.JOB_TYPE_IND := ''; :GLOBAL.PRNT_CODE :=
	 * ''; :GLOBAL.PRNT_FORM := ''; :GLOBAL.OBJT_CODE := ''; :GLOBAL.VRBL_CODE
	 * := ''; :GLOBAL.APPL_CODE := ''; :GLOBAL.SLCT_CODE := '';
	 * :GLOBAL.ITEM_REFNO := ''; :GLOBAL.MESSAGE_ID := '';
	 * :GLOBAL.ADDR_ATYP_CODE := ''; :GLOBAL.ADDR_SEQNO := ''; :GLOBAL.KEY_TERM
	 * := ''; :GLOBAL.KEY_SESSION_NUMBER := ''; :GLOBAL.KEY_SESSION_USER := '';
	 * :GLOBAL.FORM_WAS_CALLED := ''; :GLOBAL.KEY_ID := '';
	 * :GLOBAL.EVENT_FUNC_CODE := ''; :GLOBAL.ALUM_CALLED_FORM := '';
	 * :GLOBAL.ANC_X := ''; :GLOBAL.ANC_Y := ''; :GLOBAL.BEGIN_TIME := '';
	 * :GLOBAL.BLDG_CODE := ''; :GLOBAL.BLDG_CODE2 := ''; :GLOBAL.CAMPUS := '';
	 * :GLOBAL.CAMP_CODE := ''; :GLOBAL.CBIL_PRNTR := ''; :GLOBAL.DAYS_CODE_1 :=
	 * ''; :GLOBAL.DAYS_CODE_2 := ''; :GLOBAL.DAYS_CODE_3 := '';
	 * :GLOBAL.DAYS_CODE_4 := ''; :GLOBAL.DAYS_CODE_5 := ''; :GLOBAL.DAYS_CODE_6
	 * := ''; :GLOBAL.DAYS_CODE_7 := ''; :GLOBAL.END_DATE := '';
	 * :GLOBAL.END_TIME := ''; :GLOBAL.FIRST_NAME := ''; :GLOBAL.HELP_BLOCK :=
	 * ''; :GLOBAL.HELP_FIELD := ''; :GLOBAL.HELP_FORM := ''; :GLOBAL.HOLD_TYPE
	 * := ''; :GLOBAL.KEY_EVENT := ''; :GLOBAL.LAST_NAME := ''; :GLOBAL.MOVE_X
	 * := ''; :GLOBAL.MOVE_Y := ''; :GLOBAL.NUMB1 := ''; :GLOBAL.NUMB2 := '';
	 * :GLOBAL.POS_X := ''; :GLOBAL.POS_Y := ''; :GLOBAL.ROOM_CODE := '';
	 * :GLOBAL.RTYPE := ''; :GLOBAL.SCHD_PRNTR := ''; :GLOBAL.SITE := '';
	 * :GLOBAL.SIZE_X := ''; :GLOBAL.SIZE_Y := ''; :GLOBAL.SRCE_IND := '';
	 * :GLOBAL.START_DATE := ''; :GLOBAL.TYPE_IND := ''; :GLOBAL.VALUE := '';
	 * :GLOBAL.VALUE_2 := ''; :GLOBAL.VALUE_DESC := ''; :GLOBAL.GEOR_CODE := '';
	 * :GLOBAL.USER_ID := :GLOBAL.CURRENT_USER; :GLOBAL.CREATOR_ID :=
	 * :GLOBAL.CURRENT_USER; :GLOBAL.CURRENT_RELEASE := ''; :GLOBAL.PREV_BLOCK
	 * := ''; :GLOBAL.CUR_BLOCK := ''; :GLOBAL.PREV_RECORD := '';
	 * :GLOBAL.CUR_RECORD := ''; :GLOBAL.PREV_ITEM := ''; :GLOBAL.CUR_ITEM :=
	 * ''; :GLOBAL.WIN_TITLE := ''; :GLOBAL.WIN_X_POS := ''; :GLOBAL.WIN_Y_POS
	 * := ''; :GLOBAL.HELP_UPD := 'Y'; :GLOBAL.GUROPTM_TYPE_IND := '';
	 * :GLOBAL.GUROPTM_NAME1 := ''; :GLOBAL.CURRENT_FORM := '';
	 * :GLOBAL.CURRENT_BLOCK := ''; :GLOBAL.WAIT_UNTIL_DONE := '';
	 * :GLOBAL.CALL_IND := ''; :GLOBAL.PIPE_TIMED_OUT := ''; :GLOBAL.IMAGE_NAME
	 * := ''; :GLOBAL.JPRM_CODE := ''; :GLOBAL.WF_SUBMIT_EXIT_IND := 'N';
	 * :GLOBAL.MORE_THAN_ONE_SSN := 'N'; -- -- 4.1 New globals Set For Events --
	 * :GLOBAL.EQTS_CODE := ''; :GLOBAL.EQNM_CODE := ''; :GLOBAL.EQPG_CODE :=
	 * ''; -- -- New global for WF electronic documents -- :GLOBAL.WFED_CODE :=
	 * ''; :GLOBAL.WFED_TRANS_NO := ''; :GLOBAL.WFED_ORACLE_USER_ID:=''; -- --
	 * New globals for modified menus. -- :GLOBAL.LAST10_1 := '';
	 * :GLOBAL.LAST10_2 := ''; :GLOBAL.LAST10_3 := ''; :GLOBAL.LAST10_4 := '';
	 * :GLOBAL.LAST10_5 := ''; :GLOBAL.LAST10_6 := ''; :GLOBAL.LAST10_7 := '';
	 * :GLOBAL.LAST10_8 := ''; :GLOBAL.LAST10_9 := ''; :GLOBAL.LAST10_10 := '';
	 * :GLOBAL.MENU_NAME_PARM := ''; :GLOBAL.DISPLAY_FORM_NAME := ''; -- -- Set
	 * up maximum number of open forms. -- IF TO_NUMBER(:GLOBAL.MAX_NO_FORMS) =
	 * 0 THEN :GLOBAL.SKIP_FORM_CNT := 'Y'; END IF; -- :GLOBAL.CURR_OPEN_FORMS
	 * := ''; :GLOBAL.CURR_NO_FORMS := '0'; :GLOBAL.SKIP_DECR_CNT := 'N';
	 * :GLOBAL.MAX_WAIT_TIME := '15'; -- -- New globals for extended search. --
	 * :GLOBAL.MID_NAME := ''; :GLOBAL.SEARCH_ID := ''; -- -- 4.0 --
	 * :GLOBAL.G_LIST_VALUES_MODE := ''; :GLOBAL.EXP_END_POST_AUTH_IND := 'Y';
	 * -- -- 4.0.1 Desktop Tools Globals -- :GLOBAL.DSKT_ADDIN_CODE := '';
	 * :GLOBAL.DSKT_WIZARD_NAME := ''; :GLOBAL.DSKT_PROPERTY_CODE := '';
	 * :GLOBAL.DSKT_STEPTYPE_CODE := ''; :GLOBAL.DSKT_RECIPIENT_USER_ID := '';
	 * -- -- 4100-7 Initialize the new global variable GLOBAL.MSWINDOWS_VERSION.
	 * -- -- This global is currently updated by functions like
	 * G$_ENV_IS_WINDOWS98 -- to reflect the exact version of a Windows
	 * environment (e.g., 'WINDOWS 98') -- so that subsequent calls to such
	 * functions do not have to -- re-interrogate the environment. --
	 * DEFAULT_VALUE('??', 'GLOBAL.MSWINDOWS_VERSION'); :GLOBAL.COAS_CODE := '';
	 * <multilinecomment> 40524 </multilinecomment> -- -- 6.2 -- :GLOBAL.MOD_ID
	 * := ''; -- -- 7.0 -- :GLOBAL.DATA_ORIGIN := 'Banner'; :GLOBAL.QF_STATUS :=
	 * ''; :GLOBAL.EXIT_TO_MENU := 'N'; :GLOBAL.EXIT_BANNER := 'N';
	 * :GLOBAL.CM_SOURCE_CODE := ''; :GLOBAL.JOB_FILENAME := ''; --
	 * DEFAULT_VALUE('','GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID'); --
	 * :GLOBAL.DISABLE_EXTQRY := ''; :GLOBAL.INST_CALL_QUERY := ''; -- 80-6 add
	 * following one GLOBAL to support LOV/RG for ALL_TAB_COLUMNS -- 80-6 return
	 * values for Data Length to compensate for -- 80-6 column level Data Length
	 * Semantics -- 80-6 add two other GLOBAls for future use :GLOBAL.VALUE_3 :=
	 * ''; :GLOBAL.VALUE_4 := ''; :GLOBAL.VALUE_5 := '';
	 * 
	 * -- Set the default value for Terms of Usage intially in case MEP exits
	 * prematurally DEFAULT_VALUE('?', 'GLOBAL.TOFU_OK');
	 * 
	 * -- -- NOTE: IMPORTANT - All globals being added should be added before
	 * the logic which follows. -- EXECUTE_TRIGGER('SYSTEM_GLOBAL_INIT'); -- --
	 * Get new context parameters. -- IF :PARAMETER.BAN_ARGS IS NOT NULL AND
	 * :PARAMETER.BAN_MODE IS NULL THEN POPULATE_CONTEXT_GLOBALS; END IF; -- IF
	 * (:PARAMETER.BAN_ARGS IS NOT NULL AND :PARAMETER.BAN_MODE IS NOT NULL)
	 * THEN :GLOBAL.BANNER_XE_MODE := 'Y'; POPULATE_CONTEXT_GLOBALS_XE; END IF;
	 * -- EXECUTE_TRIGGER('LEAVE_INIT'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	//JOG 06/01/2015 - Banner Guainit replacement
	//@TaskStarted
	@ActionTrigger(action = "START")
	public void Guainit_TaskStarted() {
		
		Guainit_TaskStartedPre();

		int rowCount = 0;
		{
			AlertDescriptor alId = null;
			NInteger alButton = NInteger.getNull();
			NString doSleep = toStr("Y");
			NString lNlsDateFormat = NString.getNull();
			NString lFormsUsernameCasesensi = toStr("Y");//NString.getNull();
			if ((!this.getFormModel().getParam("LAUNCH_FORM", NString.class).isNull() && 
					!this.getFormModel().getParam("BAN_MODE", NString.class).isNull())) {
				setGlobal("BANNER_XE_MODE", toStr("Y"));
				doSleep = toStr("N");
				if (isNull(getGlobal("SET_INST"), "N").equals("N")) {
					TaskServices.addGenericCommand("XE", CommandScope.Global,
							new SimpleEntry<String, String>("COMMAND",
									"startMagellan();"));
				}
			}
			
			//JOG 06/01/2015 - Banner Guainit replacement
			//Force this global to Y
			setDefaultValue("Y", "GLOBAL.BANNER_XE_MODE");
			

			
			
			//
			// Only display the logo screen if not going directly to a form
			// other than the menu.
			//
			if (!this.getFormModel().getParam("LAUNCH_FORM", NString.class)
					.isNull()) {
				doSleep = toStr("N");
			}
			//
			if (this.getFormModel().getParam("LAUNCH_FORM", NString.class)
					.equals("GUAINIT")) {
				this.getFormModel().setParam("LAUNCH_FORM", toStr("GUAGMNU"));
			}
			//
			setGlobal("KEEP_ALIVE",
					this.getFormModel().getParam("KEEP_ALIVE", NString.class));
			//
			// Internal pl/sql to trap any errors when reading file and then to
			// continue.
			//
			if (this.getFormModel().getParam("LAUNCH_FORM", NString.class)
					.equals(getGlobal("MENU_FORM"))) {
				try {
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was
					// removed because it is not supported. See documentation
					// for details
					// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAINITF2NMigrationGuide.xml#ExcludeSynchronize".
					// SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAINITF2NMigrationGuide.xml#ExcludeSynchronize'.");
					

					readImageFile("DISPLAY.LOGO_IMAGE", "banner.gif", "URL");
					setGlobal("KEEP_ALIVE", toStr("YES"));
				} catch (Exception e) {
				}
				showView("DESKTOP_CANVAS");
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed
				// because it is not supported. See documentation for details
				// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAINITF2NMigrationGuide.xml#ExcludeSynchronize".
				// SupportClasses.SQLFORMS.Synchronize();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAINITF2NMigrationGuide.xml#ExcludeSynchronize'.");
				

			}
			//
			getTask().getBanPreferences().parmPrefs();
			getTask().getBanPreferences().uiPrefs();
			//
			setGlobal("HELP_CALL_FORM", toStr("GUAHELP"));
			setGlobal("FORM_TYPE", toStr(""));
			setGlobal("SELECT", toStr(""));
			setGlobal("LAST_TEN_CALL", toStr("N"));
			setGlobal("NAV_FRAME_CALL", toStr("N"));
			//
			setGlobal("INITA", toStr("N"));
			setGlobal("INITB", toStr("N"));
			setGlobal("INITC", toStr("N"));
			setGlobal("INITD", toStr("N"));
			setGlobal("INITE", toStr("N"));
			setGlobal("INITF", toStr("N"));
			setGlobal("INITG", toStr("Y"));
			setGlobal("INITH", toStr("N"));
			setGlobal("INITI", toStr("N"));
			setGlobal("INITJ", toStr("N"));
			setGlobal("INITK", toStr("N"));
			setGlobal("INITL", toStr("N"));
			setGlobal("INITM", toStr("N"));
			setGlobal("INITN", toStr("N"));
			setGlobal("INITO", toStr("N"));
			setGlobal("INITP", toStr("N"));
			setGlobal("INITQ", toStr("N"));
			setGlobal("INITR", toStr("N"));
			setGlobal("INITS", toStr("N"));
			setGlobal("INITT", toStr("N"));
			setGlobal("INITU", toStr("N"));
			setGlobal("INITV", toStr("N"));
			setGlobal("INITW", toStr("N"));
			setGlobal("INITX", toStr("N"));
			setGlobal("INITY", toStr("N"));
			setGlobal("INITZ", toStr("N"));
			setGlobal("GURJOBS_DIRECTORY", toStr(""));
			setGlobal("KEY_JOB_NAME", toStr(""));
			setGlobal("KEY_IDNO", toStr(""));
			setGlobal("KEY_PARA", toStr(""));
			setGlobal("KEY_LETR", toStr(""));
			setGlobal("SECR_USER", toStr(""));
			setGlobal("SECRFRM", toStr(""));
			setGlobal("NEW_FORM", toStr(""));
			setGlobal("NEW_ID", toStr(""));
			setGlobal("ZIP_DEFAULT_LENGTH", toStr(""));
			setGlobal("INST", toStr(""));
			// -- -- --
			// -- -- --
			setGlobal("FORMS_USERNAME_CASESENSI", toStr(""));
			// MORPHIS: Removed from code as it doesn't make sense in a web app
			// lFormsUsernameCasesensi =
			// isNull(getEnvVar("FORMS_USERNAME_CASESENSITIVE"),
			// lFormsUsernameCasesensi);
			if (lFormsUsernameCasesensi.isNull()) {
				lFormsUsernameCasesensi = toStr("0");
			} else {
				lFormsUsernameCasesensi = toStr("1");
			}
			// -- -- With initial testing of FORMS_USERNAME_CASESENSITIVE in
			// this General8.2 modification,
			// -- -- any non-null value enables the case sensitive password
			// processing. Our Banner documentation
			// -- -- indicates, as does Ncles documentation, that '1' should be
			// used. However, the above IF will
			// -- -- set the gloabl for any non-null value provided with the
			// FORMS_USERNAME_CASESENSITIVE env variable.
			copy(lFormsUsernameCasesensi, "GLOBAL.FORMS_USERNAME_CASESENSI");
			// -- -- --
			// -- -- --
			// 7.3 - Moved from goqrpls.g$_forms_nls main begin-end to here,
			// Added for International Calendar SCB.
			//
			 lNlsDateFormat = isNull(getEnvVar("NLS_DATE_FORMAT"),lNlsDateFormat);
			if (!lNlsDateFormat.isNull()) {
				GDate.setNlsDateFormat(lNlsDateFormat);
			} else {
				String sql1 = "SELECT VALUE " + " FROM NLS_SESSION_PARAMETERS "
						+ " WHERE PARAMETER = 'NLS_DATE_FORMAT' ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if (results1.hasData()) {
					lNlsDateFormat = results1.getStr(0);
				}
				results1.close();
				//
				if (inStr(lNlsDateFormat, toStr("YYYY")).greater(0)
						|| inStr(lNlsDateFormat, toStr("RRRR")).greater(0)) {
					GDate.setNlsDateFormat(lNlsDateFormat);
				} else {
					if (inStr(lNlsDateFormat, toStr("YY")).greater(0)) {
						lNlsDateFormat = replace(lNlsDateFormat, "YY", "RRRR");
					} else if (inStr(lNlsDateFormat, toStr("RR")).greater(0)) {
						lNlsDateFormat = replace(lNlsDateFormat, "RR", "RRRR");
					}
					//
					GDate.setNlsDateFormat(lNlsDateFormat);
					getTask().getGoqrpls().getGTracePkg().doExecSql(toStr("ALTER SESSION SET NLS_DATE_FORMAT = ").append("'").append(lNlsDateFormat).append("'"));
				}
			}
			//
			copy(getDateFormat(), "GLOBAL.BUILTIN_DATE_FORMAT");
			setDateFormat(GDate.getNlsDateFormat());
			// F2J_NOT_SUPPORTED : The property
			// "APPLICATION's PLSQL_DATE_FORMAT" is not supported. See
			// documentation for details
			// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
			// SupportClasses.FORMS40.SetApplicationProperty(SupportClasses.Property.PLSQL_DATE_FORMAT,
			// GDate.getNlsDateFormat());
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'APPLICATION's PLSQL_DATE_FORMAT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
			

			// -- Call the packaged procedure inorder to format the last logon
			// date and time according to
			// -- NLS settings and assign this value to :GLOBAL.LAST_LOGON_TIME
			getTask().getPkgTimestampFormat().pFormatTimestamp();
			{
				String sqlptiCursorInit = "SELECT GUBINST_NAME, GUBINST_OPERATING_SYSTEM_IND, TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT), TO_CHAR(SYSDATE, 'HH24:MI:SS'), NVL(GUBINST_FINAID_INSTALLED, 'N'), NVL(GUBINST_FINAID_IND, 'N'), NVL(GUBINST_STUDENT_INSTALLED, 'N'), NVL(GUBINST_ALUMNI_INSTALLED, 'N'), NVL(GUBINST_FINANCE_INSTALLED, 'N'), NVL(GUBINST_HUMANRE_INSTALLED, 'N'), NVL(GUBINST_POSBUD_INSTALLED, 'N'), NVL(GUBINST_BILCSH_INSTALLED, 'N'), SYS_CONTEXT('USERENV', 'SESSIONID'), NVL(GUBINST_ZIP_DEFAULT_LENGTH, 0), GUBINST_CENTURY_PIVOT, GUBINST_DATE_DEFAULT_FORMAT, GUBINST_INSTANCE_NAME, NVL(GUBINST_MAX_OPEN_FORMS, 0), GUBINST_HIGHED_GOVT_IND, GUBINST_SQLTRACE_ENABLED_IND, SYS_CONTEXT('USERENV', 'OS_USER'), GUBINST_WF_ENABLED_IND, GUBINST_SSN_SEARCH_ENABLED_IND, GUBINST_SSN_MAX_LENGTH "
						+ " FROM GUBINST "
						+ " WHERE UPPER(GUBINST_KEY) = 'INST' ";
				DataCursor ptiCursorInit = new DataCursor(sqlptiCursorInit);
				String sqlgetUserId = "SELECT USER_ID " + " FROM ALL_USERS "
						+ " WHERE USERNAME = :P_P_USER ";
				DataCursor getUserId = new DataCursor(sqlgetUserId);
				NString pUser = NString.getNull();
				try {
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursorInit.
					ptiCursorInit.open();
					ResultSet ptiCursorInitResults = ptiCursorInit.fetchInto();
					if (ptiCursorInitResults != null) {
						setGlobal("INSTITUTION", ptiCursorInitResults.getStr(0));
						setGlobal("OPSYS", ptiCursorInitResults.getStr(1));
						setGlobal("CURRENT_DATE",
								ptiCursorInitResults.getStr(2));
						setGlobal("CURRENT_TIME",
								ptiCursorInitResults.getStr(3));
						setGlobal("RESSYS", ptiCursorInitResults.getStr(4));
						setGlobal("SAMSYS", ptiCursorInitResults.getStr(5));
						setGlobal("STUSYS", ptiCursorInitResults.getStr(6));
						setGlobal("ALUSYS", ptiCursorInitResults.getStr(7));
						setGlobal("FINSYS", ptiCursorInitResults.getStr(8));
						setGlobal("HRESYS", ptiCursorInitResults.getStr(9));
						setGlobal("POSBUD", ptiCursorInitResults.getStr(10));
						setGlobal("BILCSH", ptiCursorInitResults.getStr(11));
						setGlobal("SESSION_ID", ptiCursorInitResults.getStr(12));
						setGlobal("ZIP_DEFAULT_LENGTH",
								ptiCursorInitResults.getStr(13));
						setGlobal("CENTURY_PIVOT",
								ptiCursorInitResults.getStr(14));
						setGlobal("DATE_DEFAULT_FORMAT",
								ptiCursorInitResults.getStr(15));
						setGlobal("INST", ptiCursorInitResults.getStr(16));
						setGlobal("MAX_NO_FORMS",
								ptiCursorInitResults.getStr(17));
						setGlobal("HIGHED_GOVT_IND",
								ptiCursorInitResults.getStr(18));
						setGlobal("SQLTRACE_ENABLED_IND",
								ptiCursorInitResults.getStr(19));
						setGlobal("OS_USER_ID", ptiCursorInitResults.getStr(20));
						setGlobal("WF_ENABLED_IND",
								ptiCursorInitResults.getStr(21));
						setGlobal("SSN_SEARCH_ENABLED_IND",
								ptiCursorInitResults.getStr(22));
						setGlobal("GUBINST_SSN_MAX_LENGTH",
								ptiCursorInitResults.getStr(23));
					}
					//
					if (ptiCursorInit.notFound()) {
						alId = findAlert("G$_WARNING_ALERT");
						setAlertMessageText(
								alId,
								GNls.Fget(
										toStr("GUAINIT-0003"),
										toStr("FORM"),
										toStr("*ERROR* Control record with KEY = INST not found in GUBINST table.")));
						alButton = toInt(showAlert(alId));
						ptiCursorInit.close();
						throw new ApplicationException();
					}
					ptiCursorInit.close();
					//
					pUser = getGlobal("CURRENT_USER");
					// Setting query parameters
					getUserId.addParameter("P_P_USER", pUser);
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable getUserId.
					getUserId.open();
					ResultSet getUserIdResults = getUserId.fetchInto();
					if (getUserIdResults != null) {
						setGlobal("NUMERIC_USER_ID", getUserIdResults.getStr(0));
					}
					if (getUserId.notFound()) {
						alId = findAlert("G$_WARNING_ALERT");
						setAlertMessageText(
								alId,
								GNls.Fget(
										toStr("GUAINIT-0004"),
										toStr("FORM"),
										toStr("*ERROR* Unable to obtain user info from database.")));
						alButton = toInt(showAlert(alId));
						getUserId.close();
						throw new ApplicationException();
					}
					getUserId.close();
				} finally {
					ptiCursorInit.close();
					getUserId.close();
				}
			}
			//
			
			//Added by dghant (5.6.2015)==================================================================
			//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)
			
			setGlobal("JS_PRXY_USER_IND", GSecurity.gGetJsPrxyUserIndFnc(getGlobal("ALT_USER_ID")));
			setGlobal("JS_PRXY_SID", GSecurity.gGetJsPrxySidFnc());
			setGlobal("JS_PRXY_ENFORCED", GSecurity.gGetJsPrxyEnforcedFnc());
			
			if ( getGlobal("JS_PRXY_ENFORCED").isNull()){
				setGlobal("JS_PRXY_ENFORCED", toStr("N"));
			}			
			//Add ended ===================================================================================
			
			setGlobal("CALL_ERROR", toStr(""));
			setGlobal("CALLFRM", toStr(""));
			setGlobal("CALL_FORM", toStr(""));
			setGlobal("CALLING_FORM", toStr(""));
			setGlobal("JOB_ID", toStr(""));
			setGlobal("CALL_STATUS_MSG", toStr(""));
			setGlobal("CALL_DISPLAY_MSG", toStr(""));
			setGlobal("PRODUCT_IND", toStr(""));
			setGlobal("GEOR_CODE", toStr(""));
			setGlobal("GEOD_CODE", toStr(""));
			setGlobal("KEY_CALL_CODE", toStr(""));
			setGlobal("VALIDATION_VALUE", toStr(""));
			setGlobal("VALIDATION_LABEL", toStr(""));
			setGlobal("VALIDATION_ERROR_IND", toStr(""));
			setGlobal("VALIDATION_ERROR_MSG", toStr(""));
			setGlobal("ONE_UP_NO", toStr(""));
			setGlobal("JOB_TYPE_IND", toStr(""));
			setGlobal("PRNT_CODE", toStr(""));
			setGlobal("PRNT_FORM", toStr(""));
			setGlobal("OBJT_CODE", toStr(""));
			setGlobal("VRBL_CODE", toStr(""));
			setGlobal("APPL_CODE", toStr(""));
			setGlobal("SLCT_CODE", toStr(""));
			setGlobal("ITEM_REFNO", toStr(""));
			setGlobal("MESSAGE_ID", toStr(""));
			setGlobal("ADDR_ATYP_CODE", toStr(""));
			setGlobal("ADDR_SEQNO", toStr(""));
			setGlobal("KEY_TERM", toStr(""));
			setGlobal("KEY_SESSION_NUMBER", toStr(""));
			setGlobal("KEY_SESSION_USER", toStr(""));
			setGlobal("FORM_WAS_CALLED", toStr(""));
			setGlobal("KEY_ID", toStr(""));
			setGlobal("EVENT_FUNC_CODE", toStr(""));
			setGlobal("ALUM_CALLED_FORM", toStr(""));
			setGlobal("ANC_X", toStr(""));
			setGlobal("ANC_Y", toStr(""));
			setGlobal("BEGIN_TIME", toStr(""));
			setGlobal("BLDG_CODE", toStr(""));
			setGlobal("BLDG_CODE2", toStr(""));
			setGlobal("CAMPUS", toStr(""));
			setGlobal("CAMP_CODE", toStr(""));
			setGlobal("CBIL_PRNTR", toStr(""));
			setGlobal("DAYS_CODE_1", toStr(""));
			setGlobal("DAYS_CODE_2", toStr(""));
			setGlobal("DAYS_CODE_3", toStr(""));
			setGlobal("DAYS_CODE_4", toStr(""));
			setGlobal("DAYS_CODE_5", toStr(""));
			setGlobal("DAYS_CODE_6", toStr(""));
			setGlobal("DAYS_CODE_7", toStr(""));
			setGlobal("END_DATE", toStr(""));
			setGlobal("END_TIME", toStr(""));
			setGlobal("FIRST_NAME", toStr(""));
			setGlobal("HELP_BLOCK", toStr(""));
			setGlobal("HELP_FIELD", toStr(""));
			setGlobal("HELP_FORM", toStr(""));
			setGlobal("HOLD_TYPE", toStr(""));
			setGlobal("KEY_EVENT", toStr(""));
			setGlobal("LAST_NAME", toStr(""));
			setGlobal("MOVE_X", toStr(""));
			setGlobal("MOVE_Y", toStr(""));
			setGlobal("NUMB1", toStr(""));
			setGlobal("NUMB2", toStr(""));
			setGlobal("POS_X", toStr(""));
			setGlobal("POS_Y", toStr(""));
			setGlobal("ROOM_CODE", toStr(""));
			setGlobal("RTYPE", toStr(""));
			setGlobal("SCHD_PRNTR", toStr(""));
			setGlobal("SITE", toStr(""));
			setGlobal("SIZE_X", toStr(""));
			setGlobal("SIZE_Y", toStr(""));
			setGlobal("SRCE_IND", toStr(""));
			setGlobal("START_DATE", toStr(""));
			setGlobal("TYPE_IND", toStr(""));
			setGlobal("VALUE", toStr(""));
			setGlobal("VALUE_2", toStr(""));
			setGlobal("VALUE_DESC", toStr(""));
			setGlobal("GEOR_CODE", toStr(""));
			setGlobal("USER_ID", getGlobal("CURRENT_USER"));
			setGlobal("CREATOR_ID", getGlobal("CURRENT_USER"));
			setGlobal("CURRENT_RELEASE", toStr(""));
			setGlobal("PREV_BLOCK", toStr(""));
			setGlobal("CUR_BLOCK", toStr(""));
			setGlobal("PREV_RECORD", toStr(""));
			setGlobal("CUR_RECORD", toStr(""));
			setGlobal("PREV_ITEM", toStr(""));
			setGlobal("CUR_ITEM", toStr(""));
			setGlobal("WIN_TITLE", toStr(""));
			setGlobal("WIN_X_POS", toStr(""));
			setGlobal("WIN_Y_POS", toStr(""));
			setGlobal("HELP_UPD", toStr("Y"));
			setGlobal("GUROPTM_TYPE_IND", toStr(""));
			setGlobal("GUROPTM_NAME1", toStr(""));
			setGlobal("CURRENT_FORM", toStr(""));
			setGlobal("CURRENT_BLOCK", toStr(""));
			setGlobal("WAIT_UNTIL_DONE", toStr(""));
			setGlobal("CALL_IND", toStr(""));
			setGlobal("PIPE_TIMED_OUT", toStr(""));
			setGlobal("IMAGE_NAME", toStr(""));
			setGlobal("JPRM_CODE", toStr(""));
			setGlobal("WF_SUBMIT_EXIT_IND", toStr("N"));
			setGlobal("MORE_THAN_ONE_SSN", toStr("N"));
			//
			// 4.1 New globals Set For Events
			//
			setGlobal("EQTS_CODE", toStr(""));
			setGlobal("EQNM_CODE", toStr(""));
			setGlobal("EQPG_CODE", toStr(""));
			//
			// New global for WF electronic documents
			//
			setGlobal("WFED_CODE", toStr(""));
			setGlobal("WFED_TRANS_NO", toStr(""));
			setGlobal("WFED_ORACLE_USER_ID", toStr(""));
			//
			// New globals for modified menus.
			//
			setGlobal("LAST10_1", toStr(""));
			setGlobal("LAST10_2", toStr(""));
			setGlobal("LAST10_3", toStr(""));
			setGlobal("LAST10_4", toStr(""));
			setGlobal("LAST10_5", toStr(""));
			setGlobal("LAST10_6", toStr(""));
			setGlobal("LAST10_7", toStr(""));
			setGlobal("LAST10_8", toStr(""));
			setGlobal("LAST10_9", toStr(""));
			setGlobal("LAST10_10", toStr(""));
			setGlobal("MENU_NAME_PARM", toStr(""));
			setGlobal("DISPLAY_FORM_NAME", toStr(""));
			//
			// Set up maximum number of open forms.
			//
			if (toNumber(getGlobal("MAX_NO_FORMS")).equals(0)) {
				setGlobal("SKIP_FORM_CNT", toStr("Y"));
			}
			//
			setGlobal("CURR_OPEN_FORMS", toStr(""));
			setGlobal("CURR_NO_FORMS", toStr("0"));
			setGlobal("SKIP_DECR_CNT", toStr("N"));
			setGlobal("MAX_WAIT_TIME", toStr("15"));
			//
			// New globals for extended search.
			//
			setGlobal("MID_NAME", toStr(""));
			setGlobal("SEARCH_ID", toStr(""));
			//
			// 4.0
			//
			setGlobal("G_LIST_VALUES_MODE", toStr(""));
			setGlobal("EXP_END_POST_AUTH_IND", toStr("Y"));
			//
			// 4.0.1 Desktop Tools Globals
			//
			setGlobal("DSKT_ADDIN_CODE", toStr(""));
			setGlobal("DSKT_WIZARD_NAME", toStr(""));
			setGlobal("DSKT_PROPERTY_CODE", toStr(""));
			setGlobal("DSKT_STEPTYPE_CODE", toStr(""));
			setGlobal("DSKT_RECIPIENT_USER_ID", toStr(""));
			//
			// 4100-7 Initialize the new global variable
			// GLOBAL.MSWINDOWS_VERSION.
			//
			// This global is currently updated by functions like
			// G$_ENV_IS_WINDOWS98
			// to reflect the exact version of a Windows environment (e.g.,
			// 'WINDOWS 98')
			// so that subsequent calls to such functions do not have to
			// re-interrogate the environment.
			//
			setDefaultValue("??", "GLOBAL.MSWINDOWS_VERSION");
			setGlobal("COAS_CODE", toStr(""));
			// 40524
			//
			// 6.2
			//
			setGlobal("MOD_ID", toStr(""));
			//
			// 7.0
			//
			setGlobal("DATA_ORIGIN", toStr("Banner"));
			setGlobal("QF_STATUS", toStr(""));
			setGlobal("EXIT_TO_MENU", toStr("N"));
			setGlobal("EXIT_BANNER", toStr("N"));
			setGlobal("CM_SOURCE_CODE", toStr(""));
			setGlobal("JOB_FILENAME", toStr(""));
			//
			setDefaultValue("", "GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID");
			//
			setGlobal("DISABLE_EXTQRY", toStr(""));
			setGlobal("INST_CALL_QUERY", toStr(""));
			// 80-6 add following one GLOBAL to support LOV/RG for
			// ALL_TAB_COLUMNS
			// 80-6 return values for Data Length to compensate for
			// 80-6 column level Data Length Semantics
			// 80-6 add two other GLOBAls for future use
			setGlobal("VALUE_3", toStr(""));
			setGlobal("VALUE_4", toStr(""));
			setGlobal("VALUE_5", toStr(""));
			// Set the default value for Terms of Usage intially in case MEP
			// exits prematurally
			setDefaultValue("?", "GLOBAL.TOFU_OK");
			//
			// NOTE: IMPORTANT - All globals being added should be added before
			// the logic which follows.
			//
			executeAction("SYSTEM_GLOBAL_INIT");
			//
			// Get new context parameters.
			//
			if (!this.getFormModel().getParam("BAN_ARGS", NString.class)
					.isNull()
					&& this.getFormModel().getParam("BAN_MODE", NString.class)
							.isNull()) {
				this.getTask().getServices().populateContextGlobals();
			}
			//
			if ((!this.getFormModel().getParam("BAN_ARGS", NString.class)
					.isNull() && !this.getFormModel()
					.getParam("BAN_MODE", NString.class).isNull())) {
				setGlobal("BANNER_XE_MODE", toStr("Y"));
				this.getTask().getServices().populateContextGlobalsXe();
			}
			//
			executeAction("LEAVE_INIT");
		}
		
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.POST-FORM BEGIN
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE; -- If the terms of
	 * usage were not agreed to, then log off if :global.tofu_ok = 'N' then
	 * logout; end if; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	//JOG
	//@TaskEnded
	public void Guainit_TaskEnded(EventObject args) {

		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		// If the terms of usage were not agreed to, then log off
		if (getGlobal("TOFU_OK").equals("N")) {
			// F2J_NOT_SUPPORTED : Call to built-in "LOGOUT" was removed because
			// it is not supported. See documentation for details
			// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
			// SupportClasses.FORMS40.Logout();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGOUT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAINITF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
			

		}
		
		//MORPHIS - Workflow
		getTask().getServices().endWorkflow();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.WHEN-TIMER-EXPIRED BEGIN --
	 * -- 4.1 -- added the following code below from the when-timer-expired
	 * trigger in goqolib -- to this local version of when-timer-expired --
	 * G$_TIMER_EXP; G$_CHECK_FAILURE; -- IF
	 * GET_APPLICATION_PROPERTY(TIMER_NAME) = G$_WF_DRIVER.WF_TIMER_NAME THEN
	 * G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG'); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void Guainit_WhenTimerExpired(NString timerName) {

		//
		// 4.1
		// added the following code below from the when-timer-expired trigger in
		// goqolib
		// to this local version of when-timer-expired
		//
		getTask().getGoqrpls().gTimerExp(timerName);
		getTask().getGoqrpls().gCheckFailure();
		//
		// MORPHIS: Check this code
		// if (
		// SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.TIMER_NAME).equals(GWfDriver.wfTimerName)
		// )
		{
			// F2N_TODO: The above condition uses unsupported features. You
			// should eliminate all references to SupportClasses.
			getTask().getGoqwflw().getGWfDriver()
					.wfExecute(toStr("WF_CHECK_MSG"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.WHEN-MOUSE-CLICK BEGIN
	 * EXECUTE_TRIGGER('LEAVE_INIT'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-CLICK")
	public void Guainit_click() {

		executeAction("LEAVE_INIT");
	}

	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.LEAVE_INIT DECLARE pl_name
	 * VARCHAR2(30) := 'PREFERENCES'; pl_id PARAMLIST :=
	 * GET_PARAMETER_LIST(pl_name); -- -- 54-1 Startup menu variable, set to
	 * Banner default. -- If found, user default will replace institution
	 * default. -- startup_default VARCHAR2(30) := '*MENU'; al_id ALERT;
	 * al_button PLS_INTEGER; inst_count PLS_INTEGER;
	 * 
	 * lv_tofu_opt number; lv_tofu_date date; cursor tofu_date_c is select
	 * gurlogn_last_tofu_date from gurlogn where gurlogn_user = USER; -- BEGIN
	 * -- -- Check if command line parameter for start up form is set. If equal
	 * to the -- menu, set the keep alive option to no. -- IF
	 * :PARAMETER.LAUNCH_FORM = :GLOBAL.MENU_FORM THEN :PARAMETER.KEEP_ALIVE :=
	 * 'NO'; END IF; -- -- If parameter list doesn't exist, create it. -- IF
	 * ID_NULL(pl_id) THEN pl_id := CREATE_PARAMETER_LIST(pl_name); END IF; --
	 * -- Added the following code to check to see if the user has access to
	 * more than -- one institution, and if the user does, bring up GUQSETI form
	 * and allow them -- to choose one. -- IF NVL(:GLOBAL.SET_INST,'N') = 'N'
	 * THEN g$_vpdi_security.g$_vpdi_get_user_inst_count(inst_count); -- IF
	 * ((inst_count > 1) AND (:PARAMETER.VPDI_CODE IS NULL) AND
	 * (:PARAMETER.WF_ACTIONQUEUE_IOR IS NULL)) THEN -- DEFAULT_VALUE('',
	 * 'GLOBAL.LAST_TEN_CALL'); DEFAULT_VALUE('', 'GLOBAL.NAV_FRAME_CALL'); --
	 * ADD_PARAMETER(pl_id,'LAUNCH_FORM',TEXT_PARAMETER,:PARAMETER.LAUNCH_FORM);
	 * ADD_PARAMETER(pl_id,'KEEP_ALIVE',TEXT_PARAMETER,:PARAMETER.KEEP_ALIVE);
	 * ADD_PARAMETER(pl_id,'TIMING',TEXT_PARAMETER,:PARAMETER.TIMING); -- --
	 * Banner XE Parameters
	 * ADD_PARAMETER(pl_id,'BAN_MODE',TEXT_PARAMETER,:PARAMETER.BAN_MODE);
	 * ADD_PARAMETER(pl_id,'BAN_ARGS',TEXT_PARAMETER,:PARAMETER.BAN_ARGS); -- --
	 * G$_SECURED_FORM_CALL_PL
	 * (:GLOBAL.CURRENT_USER,'GUQSETI',pl_id,'NEW_QUERY'); END IF; -- END IF;
	 * 
	 * -- -- Check the Terms of Usage -- DEFAULT_VALUE('?', 'GLOBAL.TOFU_OK');
	 * 
	 * if :GLOBAL.TOFU_OK = '?' then lv_tofu_opt :=
	 * g$_security.g$_f_get_tofu_opt; -- open tofu_date_c; fetch tofu_date_c
	 * into lv_tofu_date; close tofu_date_c; -- if nvl(lv_tofu_opt,0) > 0 then
	 * if lv_tofu_date is null or trunc(lv_tofu_date) + lv_tofu_opt <=
	 * trunc(sysdate) then :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GSQTOFU',''); if
	 * :global.tofu_ok = 'N' then
	 * message(G$_NLS.Get('GUAINIT-0005','FORM','*ERROR* You did not accept the
	 * terms of Usage - Logging Off.')); G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
	 * G$_CHECK_FAILURE ; end if; end if; end if; end if; -- -- -- -- -- -- --
	 * -- IF :GLOBAL.BANNER_XE_MODE = 'Y' THEN G$_LAST_TEN.SET_LAST_TEN; END IF;
	 * -- -- -- -- -- -- -- -- -- -- Call form. -- :GLOBAL.SET_INST := 'N'; --
	 * -- Call other form if the menu will be displayed afterwards. --
	 * CAPTURE_TIMINGS.SET_TIME('TIME2'); -- -- sq WHAT IF GUAINIT IS THE LAUNCH
	 * FORM? IF :PARAMETER.LAUNCH_FORM <> :GLOBAL.MENU_FORM THEN
	 * LAUNCH_FORM_LOGIC(:PARAMETER.LAUNCH_FORM); END IF; -- -- If the starting
	 * form is the menu or keep alive was yes or running from XE_MODE, set the
	 * parameter and call the menu. -- IF :PARAMETER.LAUNCH_FORM =
	 * :GLOBAL.MENU_FORM OR :PARAMETER.KEEP_ALIVE = 'YES' OR
	 * :GLOBAL.BANNER_XE_MODE = 'Y' THEN -- -- Find default starting menu. --
	 * BEGIN :STARTUP_MENU := G$_GET_UPRF_STARTUP_MENU; EXCEPTION WHEN OTHERS
	 * THEN IF :STARTUP_MENU IS NULL THEN al_id :=
	 * FIND_ALERT('G$_WARNING_ALERT');
	 * SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GUAINIT-0006','FORM','*ERROR* No default Banner Startup Menu
	 * found. Use the GUAUPRF form to set one.')); al_button :=
	 * SHOW_ALERT(al_id); :STARTUP_MENU := startup_default; END IF; END; --
	 * ADD_PARAMETER(pl_id,'VALUE',TEXT_PARAMETER,:STARTUP_MENU); -- -- Add the
	 * following calls to populate the temporary tables for the user with the --
	 * menu entries they are authorized to access. -- GUKMENU.P_BLD_PROD_MENU;
	 * CAPTURE_TIMINGS.SET_TIME('TIME3'); GUKMENU.P_BLD_PERS_MENU;
	 * CAPTURE_TIMINGS.SET_TIME('TIME4'); -- CAPTURE_TIMINGS.SAVE_INFO( 'User
	 * connected: ' || :DATE_TIME || ' Start: ' || TO_CHAR(:TIME1) || ' Time
	 * from start of GUAINIT to before building product menu: ' ||
	 * TO_CHAR(:TIME2 - :TIME1) || ' Time to build product menu: ' ||
	 * TO_CHAR(:TIME3 - :TIME2) || ' Time to build personal menu: ' ||
	 * TO_CHAR(:TIME4 - :TIME3) || ' Last time: ' || TO_CHAR(:TIME4) || ' Total
	 * GUAINIT Time: ' || TO_CHAR(:TIME4 - :TIME1)); --
	 * G$_SECURED_FORM_CALL_PL(:
	 * GLOBAL.CURRENT_USER,:GLOBAL.MENU_FORM,pl_id,'NEW'); -- -- Just call other
	 * form. -- ELSE EXIT_FORM; END IF; -- END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GUAINIT.LEAVE_INIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LEAVE_INIT")
	public void Guainit_LeaveInit() {

		int rowCount = 0;
		{
			NString plName = toStr("PREFERENCES");
			Hashtable plId = getParameterList(plName);
			//
			// 54-1 Startup menu variable, set to Banner default.
			// If found, user default will replace institution default.
			//
			//NString startupDefault = toStr("*MENU");
			//AlertDescriptor alId = null;
			//NInteger alButton = NInteger.getNull();
			NInteger instCount = NInteger.getNull();
			NNumber lvTofuOpt = NNumber.getNull();
			NDate lvTofuDate = NDate.getNull();
			String sqltofuDateC = "SELECT gurlogn_last_tofu_date "
					+ " FROM gurlogn " + " WHERE gurlogn_user = USER ";
			DataCursor tofuDateC = new DataCursor(sqltofuDateC);
			try {
				//
				// Check if command line parameter for start up form is set. If
				// equal to the
				// menu, set the keep alive option to no.
				//
				if (this.getFormModel().getParam("LAUNCH_FORM", NString.class)
						.equals(getGlobal("MENU_FORM"))) {
					this.getFormModel().setParam("KEEP_ALIVE", toStr("NO"));
				}
				//
				// If parameter list doesn't exist, create it.
				//
				if ((plId == null)) {
					plId = createParameterList(plName);
				}
				//
				// Added the following code to check to see if the user has
				// access to more than
				// one institution, and if the user does, bring up GUQSETI form
				// and allow them
				// to choose one.
				//
				if (isNull(getGlobal("SET_INST"), "N").equals("N")) {
					Ref<NNumber> inst_count_ref = new Ref<NNumber>(
							toNumber(instCount));
					GVpdiSecurity.gVpdiGetUserInstCount(inst_count_ref);
					instCount = toInt(inst_count_ref.val);
					//
					if (((instCount.greater(1))
							&& (this.getFormModel().getParam("VPDI_CODE",
									NString.class).isNull()) && (this
							.getFormModel().getParam("WF_ACTIONQUEUE_IOR",
									NString.class).isNull()))) {
						//
						setDefaultValue("", "GLOBAL.LAST_TEN_CALL");
						setDefaultValue("", "GLOBAL.NAV_FRAME_CALL");
						/*
						addParameter(plId, "LAUNCH_FORM", this.getFormModel()
								.getParam("LAUNCH_FORM", NString.class));
						addParameter(plId, "KEEP_ALIVE", this.getFormModel()
								.getParam("KEEP_ALIVE", NString.class));
						addParameter(plId, "TIMING", this.getFormModel()
								.getParam("TIMING", NString.class));
						// -- Banner XE Parameters
						addParameter(plId, "BAN_MODE", this.getFormModel()
								.getParam("BAN_MODE", NString.class));
						addParameter(plId, "BAN_ARGS", this.getFormModel()
								.getParam("BAN_ARGS", NString.class));
						*/
						/*getTask().getGoqrpls().gSecuredFormCallPl(
								getGlobal("CURRENT_USER"), toStr("GUQSETI"),
								plId, toStr("NEW_QUERY"));*/
						
						setGlobal("MEP_INIT_RETURN", toStr(""));
						setGlobal("MEP_INIT", toStr("Y"));
						goBlock("GUISETI");
						executeQuery();
						return;
					}
				}
				//
				// Check the Terms of Usage
				//
				setDefaultValue("?", "GLOBAL.TOFU_OK");
				if (getGlobal("TOFU_OK").equals("?")) {
					lvTofuOpt = GSecurity.gFGetTofuOpt();
					//
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable tofuDateC.
					tofuDateC.open();
					ResultSet tofuDateCResults = tofuDateC.fetchInto();
					if (tofuDateCResults != null) {
						lvTofuDate = tofuDateCResults.getDate(0);
					}
					tofuDateC.close();
					//
					if (isNull(lvTofuOpt, 0).greater(0)) {
						if (lvTofuDate.isNull()
								|| trunc(lvTofuDate).add(lvTofuOpt)
										.lesserOrEquals(trunc(NDate.getNow()))) {
							setGlobal("FORM_WAS_CALLED", toStr("Y"));
							getTask().getGoqrpls().gSecuredFormCall(
									getGlobal("CURRENT_USER"),
									toStr("GSQTOFU"), toStr(""));
							if (getGlobal("TOFU_OK").equals("N")) {
								errorMessage(GNls
										.Fget(toStr("GUAINIT-0005"),
												toStr("FORM"),
												toStr("*ERROR* You did not accept the terms of Usage - Logging Off.")));
								getTask().getGoqrpls().getGGoqolibKeyTrigger()
										.b2kExitForm();
								getTask().getGoqrpls().gCheckFailure();
							}
						}
					}
				}
				// -- -- --
				// -- -- --
				if (getGlobal("BANNER_XE_MODE").equals("Y")) {
					getTask().getGoqrpls().getGLastTen().setLastTen();
				}
				// -- -- --
				// -- -- --
				//
				// Call form.
				//
				setGlobal("SET_INST", toStr("N"));
				//
				// Call other form if the menu will be displayed afterwards.
				//
				getTask().getCaptureTimings().setTime(toStr("TIME2"));
				
				//JOG 06/01/2015 - Banner Guainit replacement
				//TODO: Should this call happen in some situation? LAUNCH_FORM is not present anymore.
				
				//
				// sq WHAT IF GUAINIT IS THE LAUNCH FORM?
				if (this.getFormModel().getParam("LAUNCH_FORM", NString.class)
						.notEquals(getGlobal("MENU_FORM"))) {
					this.getTask()
							.getServices()
							.launchFormLogic(this.getFormModel().getParam("LAUNCH_FORM",NString.class), false);
				}
				//
				// If the starting form is the menu or keep alive was yes or
				// running from XE_MODE, set the parameter and call the menu.
				//

				// MORPHIS: currently avoid opening the menu form
				/*
				boolean callMenu = false;
				if (callMenu
						&& (this.getFormModel()
								.getParam("LAUNCH_FORM", NString.class)
								.equals(getGlobal("MENU_FORM"))
								|| this.getFormModel()
										.getParam("KEEP_ALIVE", NString.class)
										.equals("YES") || getGlobal(
									"BANNER_XE_MODE").equals("Y"))) {
					try {
						getFormModel().getDisplay().setStartupMenu(
								getTask().getGoqrpls().gGetUprfStartupMenu());
					} catch (Exception e) {
						if (getFormModel().getDisplay().getStartupMenu()
								.isNull()) {
							alId = findAlert("G$_WARNING_ALERT");
							setAlertMessageText(
									alId,
									GNls.Fget(
											toStr("GUAINIT-0006"),
											toStr("FORM"),
											toStr("*ERROR* No default Banner Startup Menu found.  Use the GUAUPRF form to set one.")));
							alButton = toInt(showAlert(alId));
							getFormModel().getDisplay().setStartupMenu(
									startupDefault);
						}
					}
					//
					addParameter(plId, "VALUE", getFormModel().getDisplay()
							.getStartupMenu());
					//
					// Add the following calls to populate the temporary tables
					// for the user with the
					// menu entries they are authorized to access.
					//
					Gukmenu.pBldProdMenu();
					getTask().getCaptureTimings().setTime(toStr("TIME3"));
					Gukmenu.pBldPersMenu();
					getTask().getCaptureTimings().setTime(toStr("TIME4"));
					//
					getTask()
							.getCaptureTimings()
							.saveInfo(
									toStr("User connected: ")
											.append(getFormModel().getDisplay()
													.getDateTime())
											.append(" Start: ")
											.append(toChar(getFormModel()
													.getDisplay().getTime1()))
											.append("  Time from start of GUAINIT to before building product menu: ")
											.append(toChar(getFormModel()
													.getDisplay()
													.getTime2()
													.subtract(
															getFormModel()
																	.getDisplay()
																	.getTime1())))
											.append("  Time to build product menu: ")
											.append(toChar(getFormModel()
													.getDisplay()
													.getTime3()
													.subtract(
															getFormModel()
																	.getDisplay()
																	.getTime2())))
											.append("  Time to build personal menu: ")
											.append(toChar(getFormModel()
													.getDisplay()
													.getTime4()
													.subtract(
															getFormModel()
																	.getDisplay()
																	.getTime3())))
											.append("  Last time: ")
											.append(toChar(getFormModel()
													.getDisplay().getTime4()))
											.append("  Total GUAINIT Time: ")
											.append(toChar(getFormModel()
													.getDisplay()
													.getTime4()
													.subtract(
															getFormModel()
																	.getDisplay()
																	.getTime1()))));
					//
					getTask().getGoqrpls().gSecuredFormCallPl(
							getGlobal("CURRENT_USER"), getGlobal("MENU_FORM"),
							plId, toStr("NEW"));
				} else {
					exitTask();
				}
				*/
			} finally {
				tofuDateC.close();
			}
		}
	}
	
	@ActionTrigger(action = "LEAVE_INIT_END")
	public void Guainit_LeaveInit2() {
		//NOTE
		//this is the part of LeaveInit after the call form
		//TODO: Is this code relevant ? Where should be called ?
		
		NString plName = toStr("PREFERENCES");
		Hashtable plId = getParameterList(plName);

		NString startupDefault = toStr("*MENU");
		AlertDescriptor alId = null;
		NInteger alButton = NInteger.getNull();
//		NInteger instCount = NInteger.getNull();
//		NNumber lvTofuOpt = NNumber.getNull();
//		NDate lvTofuDate = NDate.getNull();
		
		//TODO: this should be repeated here ?
		//
		// If parameter list doesn't exist, create it.
		//
		if ((plId == null)) {
			plId = createParameterList(plName);
		}

		boolean callMenu = false;
		if (callMenu
				&& (this.getFormModel()
						.getParam("LAUNCH_FORM", NString.class)
						.equals(getGlobal("MENU_FORM"))
						|| this.getFormModel()
								.getParam("KEEP_ALIVE", NString.class)
								.equals("YES") || getGlobal(
							"BANNER_XE_MODE").equals("Y"))) {
			try {
				getFormModel().getDisplay().setStartupMenu(
						getTask().getGoqrpls().gGetUprfStartupMenu());
			} catch (Exception e) {
				if (getFormModel().getDisplay().getStartupMenu()
						.isNull()) {
					alId = findAlert("G$_WARNING_ALERT");
					setAlertMessageText(
							alId,
							GNls.Fget(
									toStr("GUAINIT-0006"),
									toStr("FORM"),
									toStr("*ERROR* No default Banner Startup Menu found.  Use the GUAUPRF form to set one.")));
					alButton = toInt(showAlert(alId));
					getFormModel().getDisplay().setStartupMenu(
							startupDefault);
				}
			}
			//
			addParameter(plId, "VALUE", getFormModel().getDisplay()
					.getStartupMenu());
			//
			// Add the following calls to populate the temporary tables
			// for the user with the
			// menu entries they are authorized to access.
			//
			Gukmenu.pBldProdMenu();
			getTask().getCaptureTimings().setTime(toStr("TIME3"));
			Gukmenu.pBldPersMenu();
			getTask().getCaptureTimings().setTime(toStr("TIME4"));
			//
			getTask()
					.getCaptureTimings()
					.saveInfo(
							toStr("User connected: ")
									.append(getFormModel().getDisplay()
											.getDateTime())
									.append(" Start: ")
									.append(toChar(getFormModel()
											.getDisplay().getTime1()))
									.append("  Time from start of GUAINIT to before building product menu: ")
									.append(toChar(getFormModel()
											.getDisplay()
											.getTime2()
											.subtract(
													getFormModel()
															.getDisplay()
															.getTime1())))
									.append("  Time to build product menu: ")
									.append(toChar(getFormModel()
											.getDisplay()
											.getTime3()
											.subtract(
													getFormModel()
															.getDisplay()
															.getTime2())))
									.append("  Time to build personal menu: ")
									.append(toChar(getFormModel()
											.getDisplay()
											.getTime4()
											.subtract(
													getFormModel()
															.getDisplay()
															.getTime3())))
									.append("  Last time: ")
									.append(toChar(getFormModel()
											.getDisplay().getTime4()))
									.append("  Total GUAINIT Time: ")
									.append(toChar(getFormModel()
											.getDisplay()
											.getTime4()
											.subtract(
													getFormModel()
															.getDisplay()
															.getTime1()))));
			//
			getTask().getGoqrpls().gSecuredFormCallPl(
					getGlobal("CURRENT_USER"), getGlobal("MENU_FORM"),
					plId, toStr("NEW"));
		} else {
			exitTask();
		}		
	}



	/*
	 * Original PL/SQL code code for TRIGGER GUAINIT.SYSTEM_GLOBAL_INIT BEGIN
	 * :SYSTEM.MESSAGE_LEVEL := '25'; -- IF :GLOBAL.ALUSYS = 'Y' THEN AOQINIT;
	 * END IF; -- IF :GLOBAL.FINSYS = 'Y' THEN FOQINIT; END IF; -- IF
	 * :GLOBAL.POSBUD = 'Y' THEN NOQINIT; END IF; -- IF :GLOBAL.HRESYS = 'Y'
	 * THEN POQINIT; END IF; -- IF :GLOBAL.RESSYS = 'Y' THEN ROQINIT; END IF; --
	 * IF :GLOBAL.STUSYS = 'Y' THEN SOQINIT; END IF; -- IF :GLOBAL.BILCSH = 'Y'
	 * THEN TOQINIT; END IF; -- :SYSTEM.MESSAGE_LEVEL := '0'; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUAINIT.SYSTEM_GLOBAL_INIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SYSTEM_GLOBAL_INIT")
	public void Guainit_SystemGlobalInit() {

		// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
		//
		if (getGlobal("ALUSYS").equals("Y")) {
			this.getTask().getServices().aoqinit();
		}
		//
		if (getGlobal("FINSYS").equals("Y")) {
			this.getTask().getServices().foqinit();
		}
		//
		if (getGlobal("POSBUD").equals("Y")) {
			this.getTask().getServices().noqinit();
		}
		//
		if (getGlobal("HRESYS").equals("Y")) {
			this.getTask().getServices().poqinit();
		}
		//
		if (getGlobal("RESSYS").equals("Y")) {
			this.getTask().getServices().roqinit();
		}
		//
		if (getGlobal("STUSYS").equals("Y")) {
			this.getTask().getServices().soqinit();
		}
		//
		if (getGlobal("BILCSH").equals("Y")) {
			this.getTask().getServices().toqinit();
		}
		//
		// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
	}
	
	@Override
	public void callForm()
	{
		CallFormData callFormData = MessageRequestHelper.getCallFormData();
		if(callFormData != null)
		{
			Hashtable<String, String> params = new Hashtable<String, String>();
			for(CallFormData.CallFormParameter p : callFormData.getParameters())
			{
				params.put(p.getName(), p.getValue());
			}
			String taskName = callFormData.getTaskName();
			
			String launch = params.get("launch_form");
			if ( launch != null && taskName.equals(getTask().getName()) )
				taskName = launch;
			
			this.getTask().getServices().callForm(null, taskName, params, false);			
		}
	}
	
	@ActionTrigger(action = "CALL_FORM_BY_NAME")
	public void callFormAction(String taskName, boolean sync)
	{
		this.getTask().getServices().callForm(null, taskName, null, sync);	
	}
	
	@ActionTrigger(action = "EXEC_WORKFLOW")
	public void execWorkflow(String args)
	{
		if ( args != null && args.startsWith("?") )
			args = args.substring(1);
		
		if ( args == null ) {
			//do nothing, it will use the existing GLOBAL.WF_CLIENT_ID
		}
		//backdoor
		/*
		else if ( args.contains("continue") ) {
			//it's a continue operation
			NString username = getNameIn("GLOBAL.CURRENT_USER");
				//GLOBAL.CURRENT_USER
			
			Ref<NString> clientId_ref = new Ref<NString>();
			getTask().getGoqwflw().getGWfBa().getUserClientId(username, clientId_ref );
			NString wfClientIdParam = clientId_ref.val;
			copy(wfClientIdParam,"GLOBAL.WF_CLIENT_ID");

			if ( wfClientIdParam.isNull() )
			{
				//TODO: localize
				message("No pending workflow activity");
				return;
			}
		}
		*/
		else if ( args.toLowerCase().contains("wf_actionqueue_ior" )) {
			this.getTask().getModel().setParam("WF_ACTIONQUEUE_IOR", args);
			//Compatibility
			this.getTask().getModel().setParam("WF_ARGS", args);
			getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_INIT_GLOBALS"));
		}
		else {
			String wfClientIdParam = args;
			copy(wfClientIdParam,"GLOBAL.WF_CLIENT_ID");			
		}
		
		getTask().getServices().initWorkflow();
		getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CHECK_MSG"));	
	}
	
	
	
	//MORPHIS
	//**** Functions from GUAGMENU ****/
	
	//These methods are the original response to the KEY-ENTER trigger on the menu for calling a form
	
	/*
	@ActionTrigger(action="CHECK_TYPE")
	public void Guagmnu_CheckType()
	{
		
			int rowCount = 0;
			{
				NString lvFirstChar= NString.getNull();
				NString lvSelection = getFormModel().getKeyBlock().getNextSelection();
				NString lvValidMenu= NString.getNull();
				String sqlvalidPersMenuC = "SELECT 'Y' " +
" FROM GUTPMNU " +
" WHERE GUTPMNU_VALUE = 'MENU|' || :P_P_VALUE ";
				DataCursor validPersMenuC = new DataCursor(sqlvalidPersMenuC);
				String sqlvalidProdMenuC = "SELECT 'Y' " +
" FROM GUTMENU " +
" WHERE GUTMENU_VALUE = :P_P_VALUE ";
				DataCursor validProdMenuC = new DataCursor(sqlvalidProdMenuC);
				String sqlvalidProcMenuC = "SELECT 'Y' " +
" FROM GURMENU " +
" WHERE GURMENU_NAME = :P_P_VALUE AND ROWNUM = 1 ";
				DataCursor validProcMenuC = new DataCursor(sqlvalidProcMenuC);
				NString pValue = NString.getNull();
				try {
					if ( lvSelection.isNull() )
					{
						return ;
					}
					// 
					//  Determine what was entered and what to do with it.
					// 
					if (in(lvSelection, "EXIT", "QUIT").getValue() ==(lvSelection.equals("GUAINIT")))
					{
						errorMessage(GNls.Fget(toStr("GUAGMNU-0008"), toStr("FORM"), toStr(" GUAINIT has already been run for this Banner session.")));
						throw new ApplicationException();
					}
					else if (in(lvSelection, "EXIT", "QUIT").getValue() ==(in(lvSelection, "GUAGMNU", "*MAIN").getValue()))
					{
						errorMessage(GNls.Fget(toStr("GUAGMNU-0009"), toStr("FORM"), toStr(" Menu is already running; cannot start up another copy.")));
						throw new ApplicationException();
					}
					else if (in(lvSelection, "EXIT", "QUIT").getValue() ==(in(lvSelection, "*PROCESS", "*PROCESS1", "*PROCESS2", "*PROCESS3", "*PROCESS4").getValue()))
					{
						executeAction("WAS_PROCESS_MENU_LOADED");
						// 
						if ( lvSelection.equals("*PROCESS") )
						{
							this.getTask().getServices().navigateTree(toStr(""), lvSelection);
						}
						else {
							this.getTask().getServices().navigateTree(lvSelection, toStr("*PROCESS"));
						}
						// 
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						goBlock(toStr("TREE"));
						return ;
					}
					else {
						getFormModel().getKeyBlock().setCallfld(lvSelection);
						setGlobal("SELECTFRM", lvSelection);
						// 
						//  Find product code for object called
						// 
						if (length(lvSelection).equals(7))
						{
							getFormModel().getKeyBlock().setFormLeadingEdge(substring(lvSelection, toInt(1), toInt(1)));
						}
						else {
							getFormModel().getKeyBlock().setFormLeadingEdge(substring(lvSelection, toInt(1), toInt(2)));
						}
						// 
						//  If not a menu, verify valid character
						// 
						lvFirstChar = substring(getFormModel().getKeyBlock().getFormLeadingEdge(), toInt(1), toInt(1));
						if ( lvFirstChar.notEquals("*") )
						{
							if ( !between(lvFirstChar, "A", "Z") )
							{
								errorMessage(GNls.Fget(toStr("GUAGMNU-0010"), toStr("FORM"), toStr(" Objects must begin with a letter.")));
								throw new ApplicationException();
							}
						}
						else {
							// 
							if ( lvSelection.equals("*SECURITY") )
							{
								if ( substring(getUser(), toInt(1), toInt(7)).notEquals("BANSECR") )
								{
									errorMessage(GNls.Fget(toStr("GUAGMNU-0011"), toStr("FORM"), toStr(" The menu entered is not valid for this user.")));
									throw new ApplicationException();
								}
							}
							// 
							if ( !in(lvSelection, "*PERSONAL", "*MENU", "*SECURITY").getValue() )
							{
								// 
								//  Personal menu check
								// 
								pValue=lvSelection;
								//Setting query parameters
								validPersMenuC.addParameter("P_P_VALUE", pValue);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable validPersMenuC.
								validPersMenuC.open();
								ResultSet validPersMenuCResults = validPersMenuC.fetchInto();
								if ( validPersMenuCResults != null ) {
									lvValidMenu = validPersMenuCResults.getStr(0);
								}
								validPersMenuC.close();
								// 
								//  Product menu check
								// 
								if ( isNull(lvValidMenu, "N").notEquals("Y") )
								{
									pValue=lvSelection;
									//Setting query parameters
									validProdMenuC.addParameter("P_P_VALUE", pValue);
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable validProdMenuC.
									validProdMenuC.open();
									ResultSet validProdMenuCResults = validProdMenuC.fetchInto();
									if ( validProdMenuCResults != null ) {
										lvValidMenu = validProdMenuCResults.getStr(0);
									}
									validProdMenuC.close();
									// 
									//  Any valid menu check, probably a process menu
									// 
									if ( isNull(lvValidMenu, "N").notEquals("Y") )
									{
										pValue=lvSelection;
										//Setting query parameters
										validProcMenuC.addParameter("P_P_VALUE", pValue);
										//F2J_WARNING : Make sure that the method "Close" is being called over the variable validProcMenuC.
										validProcMenuC.open();
										ResultSet validProcMenuCResults = validProcMenuC.fetchInto();
										if ( validProcMenuCResults != null ) {
											lvValidMenu = validProcMenuCResults.getStr(0);
										}
										validProcMenuC.close();
										// 
										//  Not found
										// 
										if ( isNull(lvValidMenu, "N").notEquals("Y") )
										{
											errorMessage(GNls.Fget(toStr("GUAGMNU-0012"), toStr("FORM"), toStr(" %01% is an invalid menu."), lvSelection));
											throw new ApplicationException();
										}
										else {
											if ( inStr(lvSelection, toStr(".")).greater(0) )
											{
												executeAction("WAS_PROCESS_MENU_LOADED");
											}
											else {
												warningMessage(GNls.Fget(toStr("GUAGMNU-0013"), toStr("FORM"), toStr(" The menu entered is valid but is not included as part of a personal or product menu.")));
												throw new ApplicationException();
											}
										}
									}
								}
							}
						}
						// 
						try{
						executeAction("CALL_ROUTINE");
						getTask().getGoqrpls().gCheckFailure();
						// 
						executeAction("INIT_NEXT_SELECTION");
						//if ( SupportClasses.SQLFORMS.FormSuccess().not() )
						//{
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						//}
					}catch(Exception e){
						
						throw new ApplicationException();
						}
				
				
					}
				}
				
				finally {
					validPersMenuC.close();
					validProdMenuC.close();
					validProcMenuC.close();
				}
			}
	}
	
	@ActionTrigger(action="CALL_ROUTINE")
	public void Guagmnu_CallRoutine()
	{
		

			//F2J_WARNING : Caution, the variable may be null.
			MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


			int rowCount = 0;
			{
				NString wrkObjt= NString.getNull();
				NInteger alButton= NInteger.getNull();
				UnknownTypes.Timer idOfTimer= null;
				NInteger currWfTaskId= NInteger.getNull();
				String sqlfindObjtC = "SELECT GUBOBJS_OBJT_CODE " +
" FROM GUBOBJS " +
" WHERE GUBOBJS_NAME = :P_P_OBJ ";
				DataCursor findObjtC = new DataCursor(sqlfindObjtC);
				NString pObj = NString.getNull();
				try {
					// INIT_CALL:;
					setGlobal("NEW_FORM", getFormModel().getKeyBlock().getCallfld());
					// 
					pObj=getGlobal("NEW_FORM");
					//Setting query parameters
					findObjtC.addParameter("P_P_OBJ", pObj);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findObjtC.
					findObjtC.open();
					ResultSet findObjtCResults = findObjtC.fetchInto();
					if ( findObjtCResults != null ) {
						wrkObjt = findObjtCResults.getStr(0);
					}
					findObjtC.close();
					// 
					//  If nothing is returned, check if the object is valid.  Could be the user is not authorized.
					// 
					if ( wrkObjt.isNull() )
					{
						if (! GChkAuth.gCheckValidObjFnc(getGlobal("NEW_FORM")).toBoolean() )
						{
							errorMessage(GNls.Fget(toStr("GUAGMNU-0014"), toStr("FORM"), toStr(" Invalid object name entered.")));
							throw new ApplicationException();
						}
						else {
							wrkObjt = toStr("FORM");
						}
					}
					// 
					if ( in(wrkObjt, "FORM", "JOB").getValue() )
					{
						executeAction("GLO_INIT_ROUTINE");
						getTask().getGoqrpls().gCheckFailure();
						// 
						if ( getFormModel().getKeyBlock().getFormTypeInd().equals("Q") && wrkObjt.equals("FORM") )
						{
							errorMessage(GNls.Fget(toStr("GUAGMNU-0015"), toStr("FORM"), toStr(" Invalid form name entered.")));
							throw new ApplicationException();
						}
					}
					// 
					setGlobal("CALLING_FORM", toStr("GUAGMNU"));
					// 
					//  This step will execute either a call form or a newform for the requested form if 
					//  global.callfrm is null.  The null check allows this step to be bypassed in the event that
					//  the product initialization form (?OQMENU) has requested that control be passed to another form.
					//  If this is the case the trigger will cycle around one more time and pass control to the form 
					//  that the initialization routine requested.
					// 
					if ( getGlobal("CALLFRM").isNull() )
					{
						// 
						//  Check whether or not the user is running a Payroll or a Position control form.  If so, check 
						//  to see if the initialization form has been run.  If not, skip logic otherwise call routine 
						//  to check for electronic approvals.
						// 
						if ( wrkObjt.equals("FORM") && !getFormModel().getKeyBlock().getFormInitInd().isNull() )
						{
							if ( in(substring(getFormModel().getKeyBlock().getFormLeadingEdge(), toInt(1), toInt(1)), "N", "P").getValue() )
							{
								if ( isNull(getNameIn(getNameIn("KEY_BLOCK.FORM_INIT_IND")), "N").equals("Y") )
								{
									this.getTask().getServices().gGetPipeMessages();
									this.getTask().getServices().getEawteMessages(messagesElement);
								}
							}
						}
						// 
						//  Determine the type of object we are about to call.
						// 
						if (wrkObjt.equals("JOBS"))
						{
							setGlobal("KEY_JOB_NAME", getGlobal("NEW_FORM"));
							setGlobal("NEW_FORM", toStr("GJAPCTL"));
						}
						else if (wrkObjt.equals("QUICKFLOW"))
						{
							setMenuItemEnabled("Action.ExitQuickflow", true);
							getTask().getGoqrpls().gQuickflow(getGlobal("NEW_FORM"));
							return ;
						}
						else if (wrkObjt.equals("MENU"))
						{
							this.getTask().getServices().navigateTree(getGlobal("NEW_FORM"), toStr(""));
							goBlock(toStr("TREE"));
							return ;
						}
						else if (wrkObjt.equals("MESSAGE"))
						{
							setAlertMessageText("G$_BANNER_ALERT", GNls.Fget(toStr("GUAGMNU-0016"), toStr("FORM"), toStr("Please use desktop or web application to complete ").append("this activity.  These applications may be accessible through your ").append("Banner toolbar.")));
							alButton = toInt(showAlert("G$_BANNER_ALERT"));
							return ;
						}
						else {
						}
						// 
						//  Form call logic.
						// 
						this.getTask().getServices().guagMenu_doFormCall(messagesElement, getGlobal("NEW_FORM"));
						// 
						//this.getTask().getServices().setCanvasColors();
						setGlobal("KEY_CALL_CODE", toStr(""));
						setGlobal("WIN_TITLE", toStr(""));
						setGlobal("WIN_X_POS", toStr(""));
						setGlobal("WIN_Y_POX", toStr(""));
						// 
						//  4100-3 Add logic to only notify a user of pending messages if the session is not 
						//         listening for Workflow tasks or activities, if the user has not just returned
						//         from performing a Workflow task or activity, or if the user has just returned 
						//         from performing a Workflow activity that he or she has not submitted.
						// 
						// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
						//							idOfTimer = SupportClasses.FORMS40.FindTimer(GWfDriver.wfTimerName);
						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
						
						// 
						if ( (idOfTimer == null) && getTask().getGoqwflw().getGWfConditions().isWfSubmitted().not() )
						{
							this.getTask().getServices().doNewMessagesExist(getGlobal("CURRENT_USER1"));
						}
					}
					// 
					//  This step checks to see if a form name has been placed in the GLOBAL.CALLFRM field.  
					//  If not, the trigger exits.  If there is a value, then copy the form name to 
					//  :KEY_BLOCK.callfld and wipe out the global value.  Then restart the logic in this 
					//  trigger over which will pass control directly to the requested form.
					// 
					if ( !getGlobal("CALLFRM").isNull() )
					{
						getFormModel().getKeyBlock().setCallfld(getGlobal("CALLFRM"));
						setGlobal("CALLFRM", toStr(""));
						// goto INIT_CALL;
						 
						// INIT_CALL:;
							setGlobal("NEW_FORM", getFormModel().getKeyBlock().getCallfld());
							// 
						
					}
				}
				finally{
					findObjtC.close();
				}
			}
		}
	*/
}
