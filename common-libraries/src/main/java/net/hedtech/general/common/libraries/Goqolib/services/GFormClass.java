package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.appsupportlib.Globals.getGlobal;
import static morphis.foundations.core.appsupportlib.Globals.setGlobal;
import static morphis.foundations.core.appsupportlib.Lib.copy;
import static morphis.foundations.core.appsupportlib.Lib.errorMessage;
import static morphis.foundations.core.appsupportlib.Lib.inStr;
import static morphis.foundations.core.appsupportlib.Lib.isNull;
import static morphis.foundations.core.appsupportlib.Lib.substring;
import static morphis.foundations.core.appsupportlib.Lib.toChar;
import static morphis.foundations.core.appsupportlib.Lib.upper;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.findItem;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.message;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.clearTask;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCurrentTaskName;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getNameIn;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getTriggerBlock;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getUser;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.setViewVisible;
import static morphis.foundations.core.types.Types.toInt;
import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.EventObject;

import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.NoDataFoundException;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.TooManyRowsException;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.CancelEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.model.AfterCommit;
import morphis.foundations.core.appsupportlib.model.BeforeCommit;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.appsupportlib.runtime.events.OnError;
import morphis.foundations.core.appsupportlib.runtime.events.TaskEnded;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStarted;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStartedPre;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.dbservices.GSecurity;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.InvalidAccess;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.InvalidVersion;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.NameMismatch;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.NoAccess;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.NoInst;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.NoObject;
import net.hedtech.general.common.libraries.Goqolib.services.Exceptions.NoPassword;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;

public class GFormClass extends AbstractSupportCodeObject {

	public GFormClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS. DECLARE -- --
	 * Character string variables. -- ERR_MSG VARCHAR(190); HOLD_CMD
	 * VARCHAR2(240); FORM_FILE_NAME VARCHAR2(30); FORM_MOD_NAME VARCHAR2(30);
	 * OBJECT VARCHAR2(30); PASSWORD VARCHAR2(30); PASSWORD1 VARCHAR2(30);
	 * ROLE_NAME VARCHAR2(30); VERSION VARCHAR2(10); -- -- Number variables. --
	 * ERR_NO NUMBER; SEED1 NUMBER := 12345678; SEED3 NUMBER := 87651234; --
	 * FORM_ID FORMMODULE; -- -- Exceptions. -- NO_OBJECT EXCEPTION; NO_INST
	 * EXCEPTION; NO_ACCESS EXCEPTION; NO_PASSWORD EXCEPTION; INVALID_VERSION
	 * EXCEPTION; INVALID_ACCESS EXCEPTION; NAME_MISMATCH EXCEPTION; -- --
	 * Exception pragmas. -- PRAGMA EXCEPTION_INIT(NO_OBJECT,-20100); PRAGMA
	 * EXCEPTION_INIT(NO_INST,-20101); PRAGMA EXCEPTION_INIT(NO_ACCESS,-20102);
	 * PRAGMA EXCEPTION_INIT(NO_PASSWORD,-20103); PRAGMA
	 * EXCEPTION_INIT(INVALID_VERSION,-20104); PRAGMA
	 * EXCEPTION_INIT(INVALID_ACCESS,-20105); PRAGMA
	 * EXCEPTION_INIT(NAME_MISMATCH,-20106); -- -- Begin main logic. -- BEGIN
	 * OBJECT := NAME_IN('SYSTEM.CURRENT_FORM'); VERSION :=
	 * NAME_IN('CURRENT_RELEASE'); -- -- Obtain the internal and file name for
	 * form. Remove extension if present. -- FORM_FILE_NAME :=
	 * UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM)); FORM_MOD_NAME :=
	 * UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME)); -- IF
	 * INSTR(FORM_FILE_NAME,'.') > 0 THEN FORM_FILE_NAME :=
	 * SUBSTR(FORM_FILE_NAME,1,INSTR(FORM_FILE_NAME,'.')-1); END IF; -- --
	 * Obtain encrypted password. -- G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT,
	 * VERSION, PASSWORD, ROLE_NAME); -- -- If security is turned off, quit. --
	 * IF PASSWORD = 'INSECURED' THEN GOTO CHK_FORM_CNT; END IF; -- -- Check
	 * that file system name matches the internal module name. -- IF
	 * FORM_FILE_NAME <> FORM_MOD_NAME THEN ERR_MSG :=
	 * G$_NLS.Get('GOQOLIB-0031', 'FORM', '*ERROR* User attempted to run %01%
	 * but the internal name (%02%) does not match.', FORM_FILE_NAME,
	 * FORM_MOD_NAME); -- G$_SECURITY.G$_CREATE_LOG_RECORD(USER, OBJECT,
	 * ERR_MSG); RAISE NAME_MISMATCH; END IF; -- -- Call for second phase
	 * processing. -- PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED3);
	 * PASSWORD := PASSWORD1; -- -- Call for third phase processing. --
	 * G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD,
	 * ROLE_NAME); -- -- Call for fourth phase processing. -- PASSWORD1 :=
	 * G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED1); PASSWORD := '"' || PASSWORD1
	 * || '"'; -- -- Invoke needed role. -- HOLD_CMD := ROLE_NAME || '
	 * IDENTIFIED BY ' || PASSWORD; G$_TRACE_PKG.DO_EXEC_SQL('SET ROLE ' ||
	 * HOLD_CMD); -- G$_VPDI.SET_VPDI_ON_ACCESS; -- -- Clear variables. --
	 * HOLD_CMD := ''; OBJECT := ''; PASSWORD := ''; ROLE_NAME := ''; SEED1 :=
	 * ''; SEED3 := ''; -- <<CHK_FORM_CNT>> -- -- Update form count and listing.
	 * -- IF NVL(:GLOBAL.SKIP_FORM_CNT,'N') = 'Y' OR
	 * NVL(:GLOBAL.SKIP_DECR_CNT,'N') = 'Y' OR :SYSTEM.TRIGGER_BLOCK IS NOT NULL
	 * THEN RETURN; END IF; -- -- -- FORM_ID := FIND_FORM(:SYSTEM.CURRENT_FORM);
	 * :GLOBAL.CURR_NO_FORMS := TO_CHAR(TO_NUMBER(:GLOBAL.CURR_NO_FORMS) + 1);
	 * -- IF :GLOBAL.CURR_OPEN_FORMS IS NULL THEN -- :GLOBAL.CURR_OPEN_FORMS :=
	 * :SYSTEM.CURRENT_FORM || '-' || TO_CHAR(FORM_ID.ID); -- ELSE --
	 * :GLOBAL.CURR_OPEN_FORMS := :GLOBAL.CURR_OPEN_FORMS || ',' ||
	 * :SYSTEM.CURRENT_FORM || '-' -- || TO_CHAR(FORM_ID.ID); -- END IF;
	 * 
	 * -- -- Exception handling. -- EXCEPTION WHEN NO_OBJECT THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0032','FORM','*ERROR* No parameters were
	 * passed.'),ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; -- WHEN NO_INST THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0033','FORM','*ERROR* No records found on
	 * GUBIPRF.'),ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; -- WHEN NO_ACCESS
	 * THEN MESSAGE(G$_NLS.Get('GOQOLIB-0034','FORM','*ERROR* User %01% not
	 * authorized to access %02%', USER,OBJECT),ACKNOWLEDGE); RAISE
	 * FORM_TRIGGER_FAILURE; -- WHEN NO_PASSWORD THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0035','FORM','*ERROR* No password found on
	 * GUBROLE.'),ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; -- WHEN
	 * INVALID_VERSION THEN MESSAGE(G$_NLS.Get('GOQOLIB-0036','FORM','*ERROR*
	 * Invalid version of %01%.', OBJECT ),ACKNOWLEDGE); RAISE
	 * FORM_TRIGGER_FAILURE; -- WHEN INVALID_ACCESS THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0037','FORM','*ERROR* Invalid password
	 * tried.'),ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; -- WHEN NAME_MISMATCH
	 * THEN MESSAGE(ERR_MSG,ACKNOWLEDGE); RAISE FORM_TRIGGER_FAILURE; -- WHEN
	 * OTHERS THEN ERR_MSG := SUBSTR(SQLERRM,1,190); MESSAGE('SQLERRM: ' ||
	 * ERR_MSG); RAISE FORM_TRIGGER_FAILURE; -- END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_FORM_CLASS.
	 * 
	 * 
	 * </p>
	 */

	
	
	@ActionTrigger(action = "")
	public void gVerifyAccess() {

		// Character string variables.
		//
		NString errMsg = NString.getNull();
		NString holdCmd = NString.getNull();
		NString formFileName = NString.getNull();
		NString formModName = NString.getNull();
		NString _object = NString.getNull();
		NString password = NString.getNull();
		NString password1 = NString.getNull();
		NString roleName = NString.getNull();
		NString version = NString.getNull();
		//
		// Number variables.
		//
		
		//TCC NSSG get the seed numbers form DB
		
		
		NNumber seed1 = SeedNumbersRetrieval.getSeedNumber1();
		NNumber seed3 = SeedNumbersRetrieval.getSeedNumber3();
		

		//
		// Exceptions.
		//
		try {
			_object = getCurrentTaskName();
			version = getNameIn("CURRENT_RELEASE");
			//
			// Obtain the internal and file name for form. Remove extension if
			// present.
			//
			formFileName = upper(_object);
			formModName = upper(getCurrentTaskName());
			//
			if (inStr(formFileName, toStr(".")).greater(0)) {
				formFileName = substring(formFileName, toInt(1),
						inStr(formFileName, toStr(".")).subtract(1));
			}
			//
			// Obtain encrypted password.
			//
			Ref<NString> refPassword = new Ref<NString>(password);
			Ref<NString> refRoleName = new Ref<NString>(roleName);
			GSecurity.gVerifyPassword1Prd(_object, version, refPassword,
					refRoleName);
			password = refPassword.val;
			roleName = refRoleName.val;
			//
			// If security is turned off, quit.
			//
			if (!password.equals("INSECURED")) {
				//
				// Check that file system name matches the internal module name.
				//
				if (formFileName.notEquals(formModName)) {
					errMsg = GNls
							.Fget(toStr("GOQOLIB-0030"),
									toStr("FORM"),
									toStr("*ERROR* User attempted to run %01% but the internal name (%02%) does not match."),
									formFileName, formModName);
					//
					GSecurity.gCreateLogRecord(getUser(), _object, errMsg);
					throw new NameMismatch();
				}

				//
				// Call for second phase processing.
				//
				password1 = GSecurity.FgDecryptFnc(password, seed3);
				password = password1;
				//
				// Call for third phase processing.
				//
				refPassword.val = password;
				refRoleName.val = roleName;
				GSecurity.gVerifyPassword1Prd(_object, version, refPassword,
						refRoleName);
				password = refPassword.val;
				roleName = refRoleName.val;
				//
				// Call for fourth phase processing.
				//
				password1 = GSecurity.FgDecryptFnc(password, seed1);
				password = toStr("\"").append(password1).append("\"");
				//
				// Invoke needed role.
				//
				holdCmd = roleName.append(" IDENTIFIED BY ").append(password);
				getContainer().getGoqrpls().getGTracePkg()
						.doExecSql(toStr("SET ROLE ").append(holdCmd));
				//
				getContainer().getGoqrpls().getGVpdi().setVpdiOnAccess();
				//
				// Clear variables.
				//
				holdCmd = toStr("");
				_object = toStr("");
				password = toStr("");
				roleName = toStr("");
				seed1 = toNumber("");
				seed3 = toNumber("");
			}
			//
			// Update form count and listing.
			//
			if (isNull(getGlobal("SKIP_FORM_CNT"), "N").equals("Y")
					|| isNull(getGlobal("SKIP_DECR_CNT"), "N").equals("Y")
					|| (getTriggerBlock()) != null) {
				return;
			}
			//
			//
			// FORM_ID := FIND_FORM(:SYSTEM.CURRENT_FORM);
			setGlobal("CURR_NO_FORMS",
					toChar(toNumber(getGlobal("CURR_NO_FORMS")).add(1)));
		} catch (NoObject e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0031"), toStr("FORM"),
					toStr("*ERROR* No parameters were passed.")));
			throw new ApplicationException();
		} catch (NoInst e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0032"), toStr("FORM"),
					toStr("*ERROR* No records found on GUBIPRF.")));
			throw new ApplicationException();
		} catch (NoAccess e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0033"), toStr("FORM"),
					toStr("*ERROR* User %01% not authorized to access %02%"),
					getUser(), _object));
			throw new ApplicationException();
		} catch (NoPassword e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0034"), toStr("FORM"),
					toStr("*ERROR* No password found on GUBROLE.")));
			throw new ApplicationException();
		} catch (InvalidVersion e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0035"), toStr("FORM"),
					toStr("*ERROR* Invalid version of %01%."), _object));
			throw new ApplicationException();
		} catch (InvalidAccess e) {
			errorMessage(GNls.Fget(toStr("GOQOLIB-0036"), toStr("FORM"),
					toStr("*ERROR* Invalid password tried.")));
			throw new ApplicationException();
		} catch (NameMismatch e) {
			errorMessage(errMsg);
			throw new ApplicationException();
		} catch (Exception e) {
			errMsg = substring(errorMessage(), toInt(1), toInt(190));
			errorMessage(errMsg);
			throw new ApplicationException();
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.G$_REVOKE_ACCESS
	 * DECLARE CURR_FORMS VARCHAR2(2000); THIS_FORM VARCHAR2(30) :=
	 * NAME_IN('SYSTEM.CURRENT_FORM'); TEMP_NO NUMBER(4); START_POS NUMBER(4);
	 * STRING_LEN NUMBER(4); FORM_ID FORMMODULE; -- BEGIN G$_VPDI.REVOKE_ACCESS;
	 * -- -- Check security status and turn off role if security -- is on. -- IF
	 * G$_SECURITY.G$_CHECK_SECURITY_FNC THEN G$_TRACE_PKG.DO_EXEC_SQL('SET ROLE
	 * NONE'); END IF; -- IF NAME_IN('GLOBAL.SKIP_FORM_CNT') = 'Y' OR
	 * NAME_IN('GLOBAL.SKIP_DECR_CNT') = 'Y' OR NAME_IN('SYSTEM.CURRENT_FORM') =
	 * 'GUAMENU' OR NAME_IN('SYSTEM.CURRENT_FORM') = 'GUAGMNU' OR
	 * :SYSTEM.TRIGGER_BLOCK IS NOT NULL THEN COPY('N','GLOBAL.SKIP_DECR_CNT');
	 * RETURN; END IF; -- -- -- FORM_ID := FIND_FORM(THIS_FORM); -- CURR_FORMS
	 * := NAME_IN('GLOBAL.CURR_OPEN_FORMS'); -- CURR_FORMS :=
	 * REPLACE(CURR_FORMS,THIS_FORM || '-' || TO_CHAR(FORM_ID.ID)); --
	 * CURR_FORMS := RTRIM(LTRIM(REPLACE(CURR_FORMS, ',,', ','), ','), ','); --
	 * COPY(CURR_FORMS,'GLOBAL.CURR_OPEN_FORMS'); -- TEMP_NO :=
	 * TO_NUMBER(NAME_IN('GLOBAL.CURR_NO_FORMS')) - 1;
	 * COPY(TO_CHAR(TEMP_NO),'GLOBAL.CURR_NO_FORMS'); -- END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.G$_REVOKE_ACCESS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_REVOKE_ACCESS")
	public void gRevokeAccess() {

		{
			getContainer().getGoqrpls().getGVpdi().revokeAccess();
			//
			// Check security status and turn off role if security
			// is on.
			//
			if (GSecurity.FgCheckSecurityFnc().getValue()) {
				getContainer().getGoqrpls().getGTracePkg()
						.doExecSql(toStr("SET ROLE NONE"));
			}
			//
			if (getNameIn("GLOBAL.SKIP_FORM_CNT").equals("Y")
					|| getNameIn("GLOBAL.SKIP_DECR_CNT").equals("Y")
					|| getCurrentTaskName().equals("GUAMENU")
					|| getCurrentTaskName().equals("GUAGMNU")
					|| (getTriggerBlock()) != null) {
				copy("N", "GLOBAL.SKIP_DECR_CNT");
				return;
			}
			//
			//
			// FORM_ID := FIND_FORM(THIS_FORM);
			// CURR_FORMS := NAME_IN('GLOBAL.CURR_OPEN_FORMS');
			// CURR_FORMS := REPLACE(CURR_FORMS,THIS_FORM || '-' ||
			// TO_CHAR(FORM_ID.ID));
			// CURR_FORMS := RTRIM(LTRIM(REPLACE(CURR_FORMS, ',,', ','), ','),
			// ',');
			// COPY(CURR_FORMS,'GLOBAL.CURR_OPEN_FORMS');
			//
			NNumber tempNo = toNumber(toNumber(
					getNameIn("GLOBAL.CURR_NO_FORMS")).subtract(1));
			copy(toChar(tempNo), "GLOBAL.CURR_NO_FORMS");
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.BANNER_XE_SEND_CONTEXT G$_XE.JSON_OUT(name_in(
	 * 'GLOBAL.'||name_in('SYSTEM.CURRENT_FORM')||'_XE_CONTEXT'));
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.BANNER_XE_SEND_CONTEXT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "BANNER_XE_SEND_CONTEXT")
	public void bannerXeSendContext() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGXe().jsonOut(getNameIn(toStr("GLOBAL.").append(getCurrentTaskName()).append("_XE_CONTEXT")));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_BannerXeSendContext is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN-CUSTOM-JAVASCRIPT-EVENT G$_XE.XE_CONTROLLER;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-CUSTOM-JAVASCRIPT-EVENT
	 * 
	 * 
	 * </p>
	 */
	public void whenCustomJavascriptEvent(String eventName,
			String eventValue) {
		// This action is used in the handling of the FORM_EVENT action, that
		// replaces the original WHEN-CUSTOM-JAVASCRIPT-EVENT
		eventName = eventName.toUpperCase();
		getContainer().getGoqrpls().getGXe().xeController(toStr(eventName), toStr(eventValue));

		// System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenCustomJavascriptEvent is not completely migrated yet. Please read the Migration Guide.");
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-FORM BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.PRE_FORM; G$_CHECK_FAILURE; -- -- 4000-32 Add the
	 * following call to the G$_WF_DRIVER.WF_EXECUTE -- procedure to prevent
	 * navigation outside of the current -- form if that form has been invoked
	 * as a Workflow activity. -- -- If Workflow is not installed or is not
	 * enabled at -- a client site, or if the current form has not been --
	 * invoked as part of a Workflow activity, the -- G$_WF_DRIVER.WF_EXECUTE
	 * procedure will not perform -- any Workflow function. -- IF
	 * NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
	 * G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_EXT_NAVIGATION'); END IF; -- --
	 * 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE --
	 * procedure to create a timer that will poll for valid -- tasks and
	 * activities sent from Workflow. -- -- If Workflow is not installed or is
	 * not enabled at -- a client site, or if the current form has already --
	 * been invoked as part of a Workflow activity, the --
	 * G$_WF_DRIVER.WF_EXECUTE procedure will not perform -- any Workflow
	 * function. -- IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
	 * G$_WF_DRIVER.WF_EXECUTE('WF_MAKE_TIMER'); END IF; -- -- 6100-01 Add the
	 * call to E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER. --
	 * E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER; -- -- Set the user's preferences
	 * for the various newly added NVAs. -- G$_SET_USER_PREFERENCES;
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void taskStartedPre(EventObject args) {

		try {
			getContainer().getGoqrpls().getGGoqolibPpTrigger().preForm();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
		//
		// 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
		// procedure to prevent navigation outside of the current
		// form if that form has been invoked as a Workflow activity.
		//
		// If Workflow is not installed or is not enabled at
		// a client site, or if the current form has not been
		// invoked as part of a Workflow activity, the
		// G$_WF_DRIVER.WF_EXECUTE procedure will not perform
		// any Workflow function.
		//
		if (isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y")) {
			getContainer().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_EXT_NAVIGATION"));
		}
		//
		// 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
		// procedure to create a timer that will poll for valid
		// tasks and activities sent from Workflow.
		//
		// If Workflow is not installed or is not enabled at
		// a client site, or if the current form has already
		// been invoked as part of a Workflow activity, the
		// G$_WF_DRIVER.WF_EXECUTE procedure will not perform
		// any Workflow function.
		//
		if (isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y")) {
			getContainer().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_MAKE_TIMER"));
		}
		//
		// 6100-01 Add the call to E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER.
		//
		getContainer().getEoqrpls().getEImgUtil().pPreFormTriggerDriver();
		//
		// Set the user's preferences for the various newly added NVAs.
		//
		try {
			getContainer().getGoqrpls().gSetUserPreferences();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}

		// MORPHIS: Call setup menu logic
		this.getContainer().getGoqrpls().getGMenuBar().setMenuPostForm();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_FORM_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_FORM_TRG")
	public void preFormTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-FORM BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.POST_FORM; G$_CHECK_FAILURE; -- -- 4000-32 Add the
	 * following call to the G$_WF_DRIVER.WF_EXECUTE -- procedure to control the
	 * behavior of the current form -- when it has been invoked as part of a
	 * Workflow activity -- and a user attempts to exit the form. -- -- If
	 * Workflow is not installed or is not enabled at -- a client site, or if
	 * the current form has not -- been invoked as part of a Workflow activity,
	 * the -- G$_WF_DRIVER.WF_EXECUTE procedure will not perform -- any Workflow
	 * function. -- IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
	 * G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_EXIT'); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskEnded
	public void taskEnded(EventObject args) {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.

		getContainer().getGoqrpls().getGGoqolibPpTrigger().postForm();
		getContainer().getGoqrpls().gCheckFailure();
		//
		// 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
		// procedure to control the behavior of the current form
		// when it has been invoked as part of a Workflow activity
		// and a user attempts to exit the form.
		//
		// If Workflow is not installed or is not enabled at
		// a client site, or if the current form has not
		// been invoked as part of a Workflow activity, the
		// G$_WF_DRIVER.WF_EXECUTE procedure will not perform
		// any Workflow function.
		//
		if (isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y")) {
			getContainer().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_EXIT"));
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_FORM_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST_FORM_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORM_TRG")
	public void postFormTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-BLOCK BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.PRE_BLOCK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK")
	public void blockIn() {
		try {
			getContainer().getGoqrpls().getGGoqolibPpTrigger().preBlock();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
	
	public void blockInSetupSDE(){
		try {
			getContainer().getGoqrpls().getGGoqolibPpTrigger().blockInSetupSDE();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_BLOCK_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_BLOCK_TRG")
	public void preBlockTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-BLOCK BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.POST_BLOCK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK")
	public void blockOut() {

		try {
			getContainer().getGoqrpls().getGGoqolibPpTrigger().postBlock();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_BLOCK_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST_BLOCK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_BLOCK_TRG")
	public void postBlockTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-COMMIT BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.PRE_COMMIT; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeCommit
	public void beforeCommit(CancelEvent args) {

		getContainer().getGoqrpls().getGGoqolibPpTrigger().preCommit();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_COMMIT_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE_COMMIT_TRG")
	public void preCommitTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-INSERT BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.PRE_INSERT; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowInsert
	public void beforeRowInsert(RowAdapterEvent args) {

		getContainer().getGoqrpls().getGGoqolibPpTrigger().preInsert();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-UPDATE BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.PRE_UPDATE; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void beforeRowUpdate(RowAdapterEvent args) {

		getContainer().getGoqrpls().getGGoqolibPpTrigger().preUpdate();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-ERROR BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.ON_ERROR; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void onError(EventObject args) {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().onError();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err
			//	.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnError is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-ROLLBACK BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.ON_ROLLBACK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.ON-ROLLBACK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-ROLLBACK")
	public void onRollback() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().onRollback();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON_ROLLBACK_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.ON_ROLLBACK_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON_ROLLBACK_TRG")
	public void onRollbackTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-SELECT BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.ON_SELECT; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.ON-SELECT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ON-SELECT")
	public void onSelect() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().onSelect();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnSelect is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-FORMS-COMMIT
	 * BEGIN G$_GOQOLIB_PP_TRIGGER.POST_FORMS_COMMIT; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST-FORMS-COMMIT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterCommit
	public void afterCommit(EventObject args) {

		//
		getContainer().getGoqrpls().getGGoqolibPpTrigger().postFormsCommit();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_FORMS_COMMIT_TRG
	 * BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.POST_FORMS_COMMIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST_FORMS_COMMIT_TRG")
	public void postFormsCommitTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-BUTTON-PRESSED
	 * BEGIN G$_BTN_PRESSED; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void click() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.

		getContainer().getGoqrpls().gBtnPressed();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN-NEW-FORM-INSTANCE BEGIN G$_SET_INST_PROPERTY;
	 * G$_CHECK_FAILURE; -- G$_STARTUP; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void taskStarted(EventObject args) {
		getContainer().getGoqrpls().gSetInstProperty();
		getContainer().getGoqrpls().gCheckFailure();

		getContainer().getGoqrpls().gStartup();
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN-NEW-BLOCK-INSTANCE DECLARE lv_item ITEM; BEGIN
	 * G$_NAVIGATION_FRAME.POPULATE_GUROPTM; G$_CHECK_FAILURE; -- IF
	 * G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED = 'N' THEN
	 * G$_DO_NEW_MESSAGES_EXIST; G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED :=
	 * 'Y'; END IF; -- -- 4000-32 Add the following call to the
	 * G$_WF_DRIVER.WF_EXECUTE procedure to control the -- behavior of the Key
	 * Block when the current form has been invoked as part of -- a Workflow
	 * activity. -- -- If Workflow is not installed or is not enabled at a
	 * client site, or if the current -- form has not been invoked as part of a
	 * Workflow activity, the G$_WF_DRIVER.WF_EXECUTE -- procedure will not
	 * perform any Workflow function. -- IF NVL(:GLOBAL.WF_ENABLED_IND,'N') =
	 * 'Y' THEN G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_KEY_BLOCK'); END IF; --
	 * lv_item := FIND_ITEM('G$_NAV_BLOCK.LEAVING_BLK_IND'); IF NOT
	 * ID_NULL(lv_item) THEN IF NAME_IN('G$_NAV_BLOCK.LEAVING_BLK_IND') IS NOT
	 * NULL THEN COPY('','G$_NAV_BLOCK.LEAVING_BLK_IND'); ELSE
	 * SET_VIEW_PROPERTY('G$_NAV_CANVAS',VISIBLE,PROPERTY_FALSE);
	 * EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG'); G$_CHECK_FAILURE; END IF;
	 * ELSE EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG'); G$_CHECK_FAILURE;
	 * END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE")
	public void blockChange() {
		//((DefaultFormController)this.getContainer().getTask().getFormController()).GoStartOverButtonsLogic();
		
		if (getContainer().getGoqrpls().getGNavigationFrame().messageWasDisplayed
				.equals("N")) {
			getContainer().getGoqrpls().gDoNewMessagesExist();
			getContainer().getGoqrpls().getGNavigationFrame().messageWasDisplayed = toStr("Y");
		}

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
		if (isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y")) {
			getContainer().getGoqwflw().getGWfDriver()
					.wfExecute(toStr("WF_CONTROL_KEY_BLOCK"));
		}

		ItemDescriptor lvItem = findItem(toStr("G$_NAV_BLOCK.LEAVING_BLK_IND"));
		if (!(lvItem == null)) {
			if (!getNameIn("G$_NAV_BLOCK.LEAVING_BLK_IND").isNull()) {
				copy("", "G$_NAV_BLOCK.LEAVING_BLK_IND");
			} else {
				setViewVisible("G$_NAV_CANVAS", false);
				try {
					executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
				} catch (Exception e) {
					throw new ApplicationException(e);
				}

			}
		} else {
			try {
				executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN_NEW_BLOCK_INSTANCE_TRG BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN_NEW_BLOCK_INSTANCE_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_NEW_BLOCK_INSTANCE_TRG")
	public void whenNewBlockInstanceTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN-MOUSE-DOUBLECLICK BEGIN G$_MOUSE_DOUBLECLICK;
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void whenMouseDoubleclick() {

		getContainer().getGoqrpls().gMouseDoubleclick();
		getContainer().getGoqrpls().gCheckFailure();

	}

	public void doubleClick()
	{
		whenMouseDoubleclick();
	}
	
	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-TIMER-EXPIRED
	 * BEGIN G$_TIMER_EXP; G$_CHECK_FAILURE; -- -- 4000-32 Add the following
	 * conditional call to the G$_WF_DRIVER.WF_EXECUTE -- procedure to check for
	 * a valid task or activity sent via Workflow -- and, if found, launch the
	 * Banner2000 object associated with that task -- or activity. -- -- If
	 * Workflow is not installed or enabled at a client site, -- the
	 * G$_WF_DRIVER.WF_EXECUTE procedure will not perform -- any Workflow
	 * function. -- IF GET_APPLICATION_PROPERTY(TIMER_NAME) =
	 * G$_WF_DRIVER.WF_TIMER_NAME THEN G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG');
	 * END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-TIMER-EXPIRED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-TIMER-EXPIRED")
	public void whenTimerExpired(NString timerName) {
		
		
		 getContainer().getGoqrpls().gTimerExp(timerName);
		 getContainer().getGoqrpls().gCheckFailure();
		 //
		 // 4000-32 Add the following conditional call to the  G$_WF_DRIVER.WF_EXECUTE
		 // procedure to check for a valid task or activity sent via Workflow
		 // and, if found, launch the Banner2000 object associated with that task
		 // or activity.
		 //
		 // If Workflow is not installed or enabled at a client site,
		 // the G$_WF_DRIVER.WF_EXECUTE procedure will not perform
		 // any Workflow function.
		 //
/*		 if ( SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.TIMER_NAME).equals(GWfDriver.wfTimerName) )
		 {
			 // F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
			 getContainer().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CHECK_MSG"));
		 }*/
		
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenTimerExpired is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-WINDOW-ACTIVATED
	 * BEGIN G$_WIN_ACTIVATED; G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('WHEN_WINDOW_ACTIVATED_TRG'); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-WINDOW-ACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-ACTIVATED")
	public void whenWindowActivated() {

		try {
			getContainer().getGoqrpls().gWinActivated();
			//
			executeAction("WHEN_WINDOW_ACTIVATED_TRG");
		} catch (Exception e) {
			throw new ApplicationException(e);
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_FORM_CLASS.WHEN_WINDOW_ACTIVATED_TRG BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN_WINDOW_ACTIVATED_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN_WINDOW_ACTIVATED_TRG")
	public void whenWindowActivatedTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-WINDOW-CLOSED
	 * BEGIN G$_WIN_CLOSED; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.WHEN-WINDOW-CLOSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-CLOSED")
	public void whenWindowClosed() {

		 getContainer().getGoqrpls().gWinClosed();
		 getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-CLRFRM BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_CLRFRM; G$_CHECK_FAILURE; -- -- 4000-32 Add
	 * the following call to the G$_WF_DRIVER.WF_EXECUTE -- procedure to control
	 * the behavior of the current form -- when it has been invoked as part of a
	 * Workflow activity -- and a user attempts to rollback the form. -- -- If
	 * Workflow is not installed or is not enabled at -- a client site, or if
	 * the current form has not -- been invoked as part of a Workflow activity,
	 * the -- G$_WF_DRIVER.WF_EXECUTE procedure will not perform -- any Workflow
	 * function. -- IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
	 * G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_ROLLBACK'); END IF; -- END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void clearTask() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyClrfrm();
		getContainer().getGoqrpls().gCheckFailure();
		//
		// 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
		// procedure to control the behavior of the current form
		// when it has been invoked as part of a Workflow activity
		// and a user attempts to rollback the form.
		//
		// If Workflow is not installed or is not enabled at
		// a client site, or if the current form has not
		// been invoked as part of a Workflow activity, the
		// G$_WF_DRIVER.WF_EXECUTE procedure will not perform
		// any Workflow function.
		//
		if (isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y")) {
			getContainer().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_ROLLBACK"));
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-HELP HELP;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-HELP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-HELP", function = KeyFunction.HELP)
	public void help() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// // F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it
		// is not supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
		// // SupportClasses.SQLFORMS.Help();
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
		//
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_Help is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F0
	 * G$_VPDI.CALL_VPDI_COMPONENT; G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_FORM_CLASS.KEY-F0
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F0", function = KeyFunction.KEY_F0)
	public void f0() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGVpdi().callVpdiComponent();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F0 is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F2 BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_F2; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_FORM_CLASS.KEY-F2
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F2", function = KeyFunction.KEY_F2)
	public void f2() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyF2();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F2 is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F6
	 * G$_XE.GOTO_XE_MENU;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_FORM_CLASS.KEY-F6
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-F6", function = KeyFunction.KEY_F6)
	public void f6() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGXe().gotoXeMenu();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F6 is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-DOWN BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_DOWN; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void moveDown() {
		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyDown();
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-UP BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_UP; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_FORM_CLASS.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void moveUp() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyUp();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-LISTVAL BEGIN
	 * G$_DISPLAY_LOV('',''); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void listValues() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.

		getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-MENU BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_MENU; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-MENU
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-MENU")
	public void keyMenu() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyMenu();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyMenu is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTBLK BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void nextBlock() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyNxtblk();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRVBLK BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_PRVBLK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void previousBlock() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyPrvblk();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTREC BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_NXTREC; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void nextRecord() {
		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyNxtrec();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRVREC BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_PRVREC; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void previousRecord() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyPrvrec();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTSET BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_NXTSET; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void keyNxtset() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyNxtset();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyNxtset is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-SCRUP BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_SCRUP; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRUP")
	public void keyScrup() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyScrup();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyScrup is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-SCRDOWN BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_SCRDOWN; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-SCRDOWN")
	public void keyScrdown() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyScrdown();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyScrdown is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRINT BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-PRINT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRINT")
	public void keyPrint() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyPrint();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyPrint is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-ENTQRY BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void search() {

		try {
			getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyEntqry();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-EXEQRY BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_EXEQRY; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void executeQuery() {

		try {
			getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyExeqry();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-EXIT BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_EXIT; G$_CHECK_FAILURE; -- IF
	 * NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NOT NULL THEN COPY(
	 * NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'),'GLOBAL.INSTITUTION_CODE'); END IF;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-EXIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXIT", function = KeyFunction.EXIT)
	public void exit() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyExit();
		if (findItem("G$_VPDI_BLOCK.VPDI_CODE") != null) {
			//
			if (!getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull()) {
				copy(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"),
						"GLOBAL.INSTITUTION_CODE");
			}
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY_EXIT_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY_EXIT_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_EXIT_TRG")
	public void keyExitTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTKEY BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_NXTKEY; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTKEY")
	public void keyNxtkey() {

		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyNxtkey();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY_NXTKEY_TRG BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.KEY_NXTKEY_TRG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY_NXTKEY_TRG")
	public void keyNxtkeyTrg() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.GLOBAL_COPY NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.GLOBAL_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "GLOBAL_COPY")
	public void globalCopy() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LIST_VALUES_COPY
	 * BEGIN G$_LIST_VALUES_COPY; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LIST_VALUES_COPY")
	public void listValuesCopy() {

		getContainer().getGoqrpls().gListValuesCopy();

		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LOAD_FORM_HEADER
	 * BEGIN G$_LOAD_FORM_HEADER; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void loadFormHeader() {

		try {
			getContainer().getGoqrpls().gLoadFormHeader();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LOAD_CURRENT_RELEASE
	 * BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void loadCurrentRelease() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.SAVE_KEYS BEGIN NULL;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.SAVE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SAVE_KEYS")
	public void saveKeys() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ENABLE_KEYS BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ENABLE_KEYS")
	public void enableKeys() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.DISABLE_KEYS BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "DISABLE_KEYS")
	public void disableKeys() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.INVALID_OPTION_MSG
	 * BEGIN MESSAGE( G$_NLS.Get('GOQOLIB-0038', 'FORM','*ERROR* Selected Option
	 * not available from this block.') ); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.INVALID_OPTION_MSG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "INVALID_OPTION_MSG")
	public void invalidOptionMsg() {

		errorMessage(GNls
				.Fget(toStr("GOQOLIB-0038"),
						toStr("FORM"),
						toStr("*ERROR* Selected Option not available from this block.")));
		throw new ApplicationException();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_FORM_CLASS.UPDATE_ACTIVITY BEGIN
	 * G$_UPDATE_ACTIVITY_DATE; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_FORM_CLASS.UPDATE_ACTIVITY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "UPDATE_ACTIVITY")
	public void updateActivity() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.

		getContainer().getGoqrpls().gUpdateActivityDate();
		getContainer().getGoqrpls().gCheckFailure();

	}

	public void WhenCustomJavascriptEvent() {
		// TODO Auto-generated method stub
		
	}

	public static class SeedNumbersRetrieval{
		private static SeedNumbersRetrieval instance = null;
		
		public static SeedNumbersRetrieval getInstance(){
			if(instance == null){
				instance = new SeedNumbersRetrieval();
			}
			return instance;
		}
		
		private SeedNumbersRetrieval(){
			init();
		}
		
		private NNumber seed1 = NNumber.getNull();
		private NNumber seed3 = NNumber.getNull();

		private void init(){
			try {
				String sql1 = "select gubiprf_seed1, gubiprf_seed3 from bansecr.gubiprf";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				int rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					seed1 = results1.getNumber(0);
					seed3 = results1.getNumber(1);
				}
				results1.close();
			}
			catch(NoDataFoundException e)
			{
				throw new ApplicationException("Cannot retrieve Seed Numbers!", e);
			}
			catch(TooManyRowsException e)
			{
				throw new ApplicationException("Cannot retrieve Seed Numbers!", e);
			}
			catch (Exception e) {
				throw new ApplicationException("Cannot retrieve Seed Numbers!", e);
			}
		}

		
		public static NNumber getSeedNumber1()
		{
			return getInstance().seed1;
		}

		public static NNumber getSeedNumber3()
		{
			return getInstance().seed3;

		}
}

	public void whenCustomJavascriptEvent() {
		this.WhenCustomJavascriptEvent();
		
	}

	public void queryExecute(EventObject args) {
		this.onSelect();
		
	}
}
