package net.hedtech.general.common.libraries.Goqolib.controller;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;

public class GNavBlockController extends AbstractSupportCodeObject {

	public GNavBlockController(ISupportCodeContainer container) {
		super(container);
	}

	private GoqolibFormController goqolibFormController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController) this
				.getContainer().getSupportCodeManager().getPackage("GOQOLIB");
	}

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this
				.getContainer().getSupportCodeManager()
				.getPackage("G$_CODE_CLASS");
	}

	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.PRE-BLOCK BEGIN NULL;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void gNavBlock_blockIn() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_blockIn is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_NAV_BLOCK.WHEN-NEW-BLOCK-INSTANCE DECLARE lv_url VARCHAR2(60) :=
	 * G$_GET_UPRF_LINKS_MY_INST; BEGIN
	 * SET_ITEM_PROPERTY('G$_NAV_BLOCK.URL_MY_INSTITUTION',LABEL,lv_url);
	 * SET_ITEM_PROPERTY('G$_NAV_BLOCK.URL_MY_INSTITUTION',TOOLTIP_TEXT,lv_url);
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void gNavBlock_blockChange() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		// NString lvUrl = getTask().getGoqrpls().gGetUprfLinksMyInst();
		// setItemLabel("G$_NAV_BLOCK.URL_MY_INSTITUTION", lvUrl);
		// setItemToolTip("G$_NAV_BLOCK.URL_MY_INSTITUTION", lvUrl);
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_blockChange is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.CHECK_TYPE BEGIN IF
	 * :G$_NAV_BLOCK.GO_ITEM IS NOT NULL THEN -- IF :G$_NAV_BLOCK.GO_ITEM IN
	 * ('EXIT','QUIT') THEN G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM; -- ELSIF
	 * :G$_NAV_BLOCK.GO_ITEM = 'GUAGMNU' THEN
	 * DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE'); IF :GLOBAL.BANNER_XE_MODE =
	 * 'Y' THEN MESSAGE(G$_NLS.Get('GOQOLIB-0002','FORM','*ERROR* GUAGMNU is not
	 * accessible when running from the unified menu.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0003','FORM','*ERROR* Menu is already
	 * running; cannot start up another copy.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- ELSIF :G$_NAV_BLOCK.GO_ITEM = 'GUAINIT' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0004','FORM','*ERROR* GUAINIT has already
	 * been run for this Banner session.')); RAISE FORM_TRIGGER_FAILURE; -- ELSE
	 * :G$_NAV_BLOCK.CALL_FLD := :G$_NAV_BLOCK.GO_ITEM; :GLOBAL.SELECTFRM :=
	 * :G$_NAV_BLOCK.GO_ITEM; -- IF SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,1) = 'V'
	 * THEN IF NVL(LENGTH(:G$_NAV_BLOCK.GO_ITEM), 0) = 8 THEN
	 * :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,2,2);
	 * ELSE :G$_NAV_BLOCK.FORM_LEADING_EDGE :=
	 * SUBSTR(:G$_NAV_BLOCK.CALL_FLD,2,1); END IF; ELSE IF
	 * NVL(LENGTH(:G$_NAV_BLOCK.GO_ITEM), 0) = 8 THEN
	 * :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,2);
	 * ELSE :G$_NAV_BLOCK.FORM_LEADING_EDGE :=
	 * SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,1); END IF; END IF; -- IF
	 * SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) <> '*' THEN IF
	 * (SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) NOT BETWEEN 'A' AND 'Z')
	 * THEN MESSAGE(G$_NLS.Get('GOQOLIB-0005','FORM','*ERROR* Objects must begin
	 * with a letter.')); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; --
	 * EXECUTE_TRIGGER('CALL_ROUTINE'); G$_CHECK_FAILURE;
	 * 
	 * EXECUTE_TRIGGER('INIT_NEXT_SELECTION'); IF NOT FORM_SUCCESS THEN NULL;
	 * END IF; -- END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.CHECK_TYPE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_TYPE")
	public void gNavBlock_CheckType() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( !getFormModel().getGNavBlock().getGoItem().isNull() )
		// {
		// //
		// if ( in(getFormModel().getGNavBlock().getGoItem(), "EXIT",
		// "QUIT").getValue() )
		// {
		// getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
		// }
		// else if ( getFormModel().getGNavBlock().getGoItem().equals("GUAGMNU")
		// ) {
		// setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
		// if ( getGlobal("BANNER_XE_MODE").equals("Y") )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0002"), toStr("FORM"),
		// toStr("*ERROR* GUAGMNU is not accessible when running from the unified menu.")));
		// }
		// else {
		// message(GNls.Fget(toStr("GOQOLIB-0003"), toStr("FORM"),
		// toStr("*ERROR* Menu is already running; cannot start up another copy.")));
		// }
		// throw new ApplicationException();
		// }
		// else if ( getFormModel().getGNavBlock().getGoItem().equals("GUAINIT")
		// ) {
		// message(GNls.Fget(toStr("GOQOLIB-0004"), toStr("FORM"),
		// toStr("*ERROR* GUAINIT has already been run for this Banner session.")));
		// throw new ApplicationException();
		// }
		// else {
		// getFormModel().getGNavBlock().setCallFld(getFormModel().getGNavBlock().getGoItem());
		// setGlobal("SELECTFRM", getFormModel().getGNavBlock().getGoItem());
		// //
		// if ( substring(getFormModel().getGNavBlock().getCallFld(), toInt(1),
		// toInt(1)).equals("V") )
		// {
		// if ( isNull(length(getFormModel().getGNavBlock().getGoItem()),
		// 0).equals(8) )
		// {
		// getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(2), toInt(2)));
		// }
		// else {
		// getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(2), toInt(1)));
		// }
		// }
		// else {
		// if ( isNull(length(getFormModel().getGNavBlock().getGoItem()),
		// 0).equals(8) )
		// {
		// getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(1), toInt(2)));
		// }
		// else {
		// getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(1), toInt(1)));
		// }
		// }
		// //
		// if ( substring(getFormModel().getGNavBlock().getFormLeadingEdge(),
		// toInt(1), toInt(1)).notEquals("*") )
		// {
		// if
		// ((!between(substring(getFormModel().getGNavBlock().getFormLeadingEdge(),
		// toInt(1), toInt(1)), "A", "Z")))
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0005"), toStr("FORM"),
		// toStr("*ERROR* Objects must begin with a letter.")));
		// throw new ApplicationException();
		// }
		// }
		// //
		// executeAction("CALL_ROUTINE");
		// getTask().getGoqrpls().gCheckFailure();
		// executeAction("INIT_NEXT_SELECTION");
		// if ( SupportClasses.SQLFORMS.FormSuccess().not() )
		// {
		// // F2N_TODO: The above condition uses unsupported features. You
		// should eliminate all references to SupportClasses.
		// }
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_CheckType is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.CALL_ROUTINE DECLARE
	 * WRK_OBJT VARCHAR2(10); AL_BUTTON NUMBER; BEGIN << INIT_CALL >>
	 * :GLOBAL.NEW_FORM := :G$_NAV_BLOCK.CALL_FLD; -- SELECT GUBOBJS_OBJT_CODE
	 * INTO WRK_OBJT FROM GUBOBJS WHERE GUBOBJS_NAME = :G$_NAV_BLOCK.CALL_FLD;
	 * -- IF WRK_OBJT NOT IN ('MENU','MESSAGE') THEN
	 * EXECUTE_TRIGGER('GLO_INIT_ROUTINE'); G$_CHECK_FAILURE; -- IF
	 * :G$_NAV_BLOCK.FORM_TYPE_IND = 'Q' AND WRK_OBJT = 'FORM' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0006','FORM','*ERROR* Invalid form name
	 * entered.')); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; --
	 * :GLOBAL.CALLING_FORM := :SYSTEM.CURRENT_FORM; -- -- This step will
	 * execute either a call form or a newform for the -- requested form if
	 * global.callfrm is null. -- The null check allows this step to be bypassed
	 * in the event that -- the product initialization form (?OQMENU) has
	 * requested that control -- be passed to another form. -- If this is the
	 * case the trigger will cycle around one more time -- and pass control to
	 * the form that the initialization routine -- requested. -- IF
	 * :GLOBAL.CALLFRM IS NULL THEN -- -- Check whether or not the user is
	 * running a Payroll or a -- Position control form. If so, check to see if
	 * the -- initialization form has been run. If not, skip logic -- otherwise
	 * call routine to check for electronic approvals. -- IF
	 * SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) IN ('N','P') THEN IF
	 * NVL(NAME_IN(NAME_IN('G$_NAV_BLOCK.FORM_INIT_IND')),'N') = 'Y' THEN
	 * G$_GET_PIPE_MESSAGES; EXECUTE_TRIGGER('GET_EAWTE_MESSAGES'); END IF; END
	 * IF; -- -- Determine the type of object we are about to call. -- IF
	 * WRK_OBJT = 'JOBS' THEN :GLOBAL.KEY_JOB_NAME := :GLOBAL.NEW_FORM;
	 * :GLOBAL.NEW_FORM := 'GJAPCTL'; ELSIF WRK_OBJT = 'QUICKFLOW' THEN
	 * G$_QUICKFLOW(:GLOBAL.NEW_FORM); RETURN; ELSIF WRK_OBJT = 'MESSAGE' THEN
	 * SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
	 * G$_NLS.Get('GOQOLIB-0007','FORM','Please use desktop or web application
	 * to complete this activity. ' || 'These applications may be accessible
	 * through your Banner toolbar.')); AL_BUTTON :=
	 * SHOW_ALERT('G$_INFO_ALERT'); RETURN; ELSIF WRK_OBJT = 'MENU' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0008','FORM','*ERROR* Menu objects cannot be
	 * called from here.')); RETURN; ELSE NULL; END IF; -- -- Form call logic.
	 * -- COPY('Y','GLOBAL.NAV_FRAME_CALL'); COPY('','GLOBAL.FORM_WAS_CALLED');
	 * -- -- EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),:GLOBAL.NEW_FORM,'');
	 * -- :GLOBAL.KEY_CALL_CODE := ''; :GLOBAL.WIN_TITLE := '';
	 * :GLOBAL.WIN_X_POS := ''; :GLOBAL.WIN_Y_POX := ''; -- END IF; -- -- This
	 * step checks to see if a form name has been placed in the --
	 * GLOBAL.CALLFRM field. If not, the trigger exits. -- If there is a value,
	 * then copy the form name to :KEY_BLOCK.callfld -- and wipe out the global
	 * value. THEN restart the logic in this -- trigger over which will pass
	 * control directly to the requested form. -- IF :GLOBAL.CALLFRM IS NOT NULL
	 * THEN :G$_NAV_BLOCK.CALL_FLD := :GLOBAL.CALLFRM; :GLOBAL.CALLFRM := '';
	 * GOTO INIT_CALL; END IF; -- EXCEPTION WHEN NO_DATA_FOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0009','FORM','*ERROR* Invalid object name
	 * entered.')); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.CALL_ROUTINE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CALL_ROUTINE")
	public void gNavBlock_CallRoutine() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// int rowCount = 0;
		// {
		// NString wrkObjt= NString.getNull();
		// NNumber alButton= NNumber.getNull();
		// try
		// {
		// INIT_CALL:;
		// setGlobal("NEW_FORM", getFormModel().getGNavBlock().getCallFld());
		// //
		// String sql1 = "SELECT GUBOBJS_OBJT_CODE " +
		// " FROM GUBOBJS " +
		// " WHERE GUBOBJS_NAME = :G___NAV_BLOCK_CALL_FLD ";
		// DataCommand command1 = new DataCommand(sql1);
		// //Setting query parameters
		// command1.addParameter("G___NAV_BLOCK_CALL_FLD",
		// getFormModel().getGNavBlock().getCallFld());
		// ResultSet results1 = command1.executeQuery();
		// rowCount = command1.getRowCount();
		// if ( results1.hasData() ) {
		// wrkObjt = results1.getStr(0);
		// }
		// results1.close();
		// //
		// if ( !in(wrkObjt, "MENU", "MESSAGE").getValue() )
		// {
		// executeAction("GLO_INIT_ROUTINE");
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// if ( getFormModel().getGNavBlock().getFormTypeInd().equals("Q") &&
		// wrkObjt.equals("FORM") )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0006"), toStr("FORM"),
		// toStr("*ERROR* Invalid form name entered.")));
		// throw new ApplicationException();
		// }
		// }
		// //
		// setGlobal("CALLING_FORM", toStr(getCurrentTaskName()));
		// //
		// // This step will execute either a call form or a newform for the
		// // requested form if global.callfrm is null.
		// // The null check allows this step to be bypassed in the event that
		// // the product initialization form (?OQMENU) has requested that
		// control
		// // be passed to another form.
		// // If this is the case the trigger will cycle around one more time
		// // and pass control to the form that the initialization routine
		// // requested.
		// //
		// if ( getGlobal("CALLFRM").isNull() )
		// {
		// //
		// // Check whether or not the user is running a Payroll or a
		// // Position control form. If so, check to see if the
		// // initialization form has been run. If not, skip logic
		// // otherwise call routine to check for electronic approvals.
		// //
		// if ( in(substring(getFormModel().getGNavBlock().getFormLeadingEdge(),
		// toInt(1), toInt(1)), "N", "P").getValue() )
		// {
		// if ( isNull(getNameIn(getNameIn("G$_NAV_BLOCK.FORM_INIT_IND")),
		// "N").equals("Y") )
		// {
		// getTask().getGoqrpls().gGetPipeMessages();
		// executeAction("GET_EAWTE_MESSAGES");
		// }
		// }
		// //
		// // Determine the type of object we are about to call.
		// //
		// if ( wrkObjt.equals("JOBS") )
		// {
		// setGlobal("KEY_JOB_NAME", getGlobal("NEW_FORM"));
		// setGlobal("NEW_FORM", toStr("GJAPCTL"));
		// }
		// else if ( wrkObjt.equals("QUICKFLOW") ) {
		// getTask().getGoqrpls().gQuickflow(getGlobal("NEW_FORM"));
		// return ;
		// }
		// else if ( wrkObjt.equals("MESSAGE") ) {
		// setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("GOQOLIB-0007"),
		// toStr("FORM"),
		// toStr("Please use desktop or web application to complete this activity. ").append("These applications may be accessible through your Banner toolbar.")));
		// alButton = toNumber(showAlert("G$_INFO_ALERT"));
		// return ;
		// }
		// else if ( wrkObjt.equals("MENU") ) {
		// message(GNls.Fget(toStr("GOQOLIB-0008"), toStr("FORM"),
		// toStr("*ERROR* Menu objects cannot be called from here.")));
		// return ;
		// }
		// else {
		// }
		// //
		// // Form call logic.
		// //
		// copy("Y","GLOBAL.NAV_FRAME_CALL");
		// copy("","GLOBAL.FORM_WAS_CALLED");
		// // --
		// executeAction("G$_REVOKE_ACCESS");
		// getTask().getGoqrpls().gCheckFailure();
		// getTask().getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"),
		// getGlobal("NEW_FORM"), toStr(""));
		// //
		// setGlobal("KEY_CALL_CODE", toStr(""));
		// setGlobal("WIN_TITLE", toStr(""));
		// setGlobal("WIN_X_POS", toStr(""));
		// setGlobal("WIN_Y_POX", toStr(""));
		// }
		// //
		// // This step checks to see if a form name has been placed in the
		// // GLOBAL.CALLFRM field. If not, the trigger exits.
		// // If there is a value, then copy the form name to :KEY_BLOCK.callfld
		// // and wipe out the global value. THEN restart the logic in this
		// // trigger over which will pass control directly to the requested
		// form.
		// //
		// if ( !getGlobal("CALLFRM").isNull() )
		// {
		// getFormModel().getGNavBlock().setCallFld(getGlobal("CALLFRM"));
		// setGlobal("CALLFRM", toStr(""));
		// goto INIT_CALL;
		// }
		// }
		// catch(NoDataFoundException e)
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0009"), toStr("FORM"),
		// toStr("*ERROR* Invalid object name entered.")));
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_CallRoutine is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.INIT_NEXT_SELECTION
	 * BEGIN -- 3.0-5 IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
	 * :G$_NAV_BLOCK.CALL_FLD := :GLOBAL.MENU_NAME_PARM; :GLOBAL.MENU_NAME_PARM
	 * := ''; EXECUTE_TRIGGER('CALL_ROUTINE'); END IF; :G$_NAV_BLOCK.GO_ITEM :=
	 * ''; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.INIT_NEXT_SELECTION
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "INIT_NEXT_SELECTION")
	public void gNavBlock_InitNextSelection() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// // 3.0-5
		// if ( !getGlobal("MENU_NAME_PARM").isNull() )
		// {
		// getFormModel().getGNavBlock().setCallFld(getGlobal("MENU_NAME_PARM"));
		// setGlobal("MENU_NAME_PARM", toStr(""));
		// executeAction("CALL_ROUTINE");
		// }
		// getFormModel().getGNavBlock().setGoItem(toStr(""));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_InitNextSelection is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.GET_EAWTE_MESSAGES
	 * DECLARE VAR1 VARCHAR2(1); -- CURSOR GURTKLR_EAWTE_INFO IS SELECT 'X' FROM
	 * GURTKLR WHERE GURTKLR_USER_ID = USER AND GURTKLR_CREATOR = 'EAWTE'; --
	 * BEGIN <multilinecomment> IF NAME_IN('GLOBAL.APPROVAL_MSG_IND') = 'Y' THEN
	 * OPEN GURTKLR_EAWTE_INFO; FETCH GURTKLR_EAWTE_INFO INTO VAR1; -- IF
	 * GURTKLR_EAWTE_INFO%FOUND THEN COPY('TIME','GLOBAL.ALERT_GLOBAL');
	 * COPY('Time transaction(s) exist. Do you wish to view them
	 * now?','FORM_HEADER.ALERT_MSG'); SHOW_WINDOW('ALERT_WINDOW');
	 * GO_ITEM('button_control_block.alert_btn2'); -- END IF; CLOSE
	 * GURTKLR_EAWTE_INFO; END IF; </multilinecomment> NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.GET_EAWTE_MESSAGES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_EAWTE_MESSAGES")
	public void gNavBlock_GetEawteMessages() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// int rowCount = 0;
		// {
		// NString var1= NString.getNull();
		// String sqlgurtklrEawteInfo = "SELECT 'X' " +
		// " FROM GURTKLR " +
		// " WHERE GURTKLR_USER_ID = USER AND GURTKLR_CREATOR = 'EAWTE' ";
		// DataCursor gurtklrEawteInfo = new DataCursor(sqlgurtklrEawteInfo);
		// // IF NAME_IN('GLOBAL.APPROVAL_MSG_IND') = 'Y' THEN
		// // OPEN GURTKLR_EAWTE_INFO;
		// // FETCH GURTKLR_EAWTE_INFO INTO VAR1;
		// // --
		// // IF GURTKLR_EAWTE_INFO%FOUND THEN
		// // COPY('TIME','GLOBAL.ALERT_GLOBAL');
		// // COPY('Time transaction(s) exist. Do you wish to view them
		// now?','FORM_HEADER.ALERT_MSG');
		// // SHOW_WINDOW('ALERT_WINDOW');
		// // GO_ITEM('button_control_block.alert_btn2');
		// // --
		// // END IF;
		// // CLOSE GURTKLR_EAWTE_INFO;
		// // END IF;
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_GetEawteMessages is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.GLO_INIT_ROUTINE BEGIN
	 * :G$_NAV_BLOCK.FORM_INIT_IND := 'GLOBAL.INIT' ||
	 * RTRIM(:G$_NAV_BLOCK.FORM_LEADING_EDGE); -- IF
	 * NVL(LENGTH(:G$_NAV_BLOCK.FORM_LEADING_EDGE), 0) = 1 THEN
	 * :G$_NAV_BLOCK.FORM_TYPE_IND := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,3,1); ELSE
	 * :G$_NAV_BLOCK.FORM_TYPE_IND := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,4,1); END
	 * IF; -- DEFAULT_VALUE('N','GLOBAL.INIT' ||
	 * RTRIM(:G$_NAV_BLOCK.FORM_LEADING_EDGE)); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.GLO_INIT_ROUTINE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GLO_INIT_ROUTINE")
	public void gNavBlock_GloInitRoutine() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getFormModel().getGNavBlock().setFormInitInd(toStr("GLOBAL.INIT").append(rtrim(getFormModel().getGNavBlock().getFormLeadingEdge())));
		// //
		// if (
		// isNull(length(getFormModel().getGNavBlock().getFormLeadingEdge()),
		// 0).equals(1) )
		// {
		// getFormModel().getGNavBlock().setFormTypeInd(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(3), toInt(1)));
		// }
		// else {
		// getFormModel().getGNavBlock().setFormTypeInd(substring(getFormModel().getGNavBlock().getCallFld(),
		// toInt(4), toInt(1)));
		// }
		// //
		// setDefaultValue("N",
		// toStr("GLOBAL.INIT").append(rtrim(getFormModel().getGNavBlock().getFormLeadingEdge())));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_GloInitRoutine is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-CLRFRM
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void gNavBlock_ClearTask() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_ClearTask is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-CLRREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void gNavBlock_ClearRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_ClearRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-COMMIT
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void gNavBlock_Save() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_Save is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-CREREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void gNavBlock_CreateRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-DELREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void gNavBlock_DeleteRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-DOWN
	 * DO_KEY('NEXT_RECORD');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void gNavBlock_MoveDown() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("NEXT_RECORD");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_MoveDown is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-MENU BEGIN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_MENU; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-MENU
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-MENU")
	public void gNavBlock_KeyMenu() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGGoqolibKeyTrigger().keyMenu();
		// getTask().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_KeyMenu is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-NXTBLK IF
	 * :G$_NAV_BLOCK.HOLD_CURSOR_LOCATION IS NOT NULL THEN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_MENU; G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void gNavBlock_NextBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
//		 if ( !getFormModel().getGNavBlock().getHoldCursorLocation().isNull()
//		 )
//		 {
//		 getTask().getGoqrpls().getGGoqolibKeyTrigger().keyMenu();
//		 getTask().getGoqrpls().gCheckFailure();
//		 }
		
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_NextBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-NXTREC DECLARE
	 * last_menu_no INTEGER(2) := NVL(:G$_NAV_BLOCK.LAST_MENU_ITEM,0);
	 * menu_item_name VARCHAR2(30); menu_item_value VARCHAR2(30); BEGIN IF
	 * last_menu_no < 1 THEN last_menu_no := 10; ELSE last_menu_no :=
	 * last_menu_no - 1; END IF; -- IF last_menu_no = 0 THEN
	 * :G$_NAV_BLOCK.LAST_MENU_ITEM := ''; :G$_NAV_BLOCK.GO_ITEM := ''; RETURN;
	 * END IF; -- FOR i IN REVERSE 1..last_menu_no LOOP menu_item_name :=
	 * 'ACTION.LAST10_' || TO_CHAR(i); IF
	 * GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
	 * menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i)); -- IF
	 * menu_item_value IS NOT NULL THEN :G$_NAV_BLOCK.LAST_MENU_ITEM := i;
	 * :G$_NAV_BLOCK.GO_ITEM := menu_item_value; EXIT; END IF; -- END IF; END
	 * LOOP; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void gNavBlock_NextRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		// NInteger lastMenuNo =
		// isNull(getFormModel().getGNavBlock().getLastMenuItem(), 0);
		// NString menuItemName= NString.getNull();
		// NString menuItemValue= NString.getNull();
		// if ( lastMenuNo.lesser(1) )
		// {
		// lastMenuNo = toInt(10);
		// }
		// else {
		// lastMenuNo = lastMenuNo.subtract(1);
		// }
		// //
		// if ( lastMenuNo.equals(0) )
		// {
		// getFormModel().getGNavBlock().setLastMenuItem(toInt(""));
		// getFormModel().getGNavBlock().setGoItem(toStr(""));
		// return ;
		// }
		// //
		// for ( int i = 1; i <= lastMenuNo; i++ )
		// {
		// menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
		// if ( getMenuItemVisible(menuItemName).equals("TRUE") )
		// {
		// menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
		// //
		// if ( !menuItemValue.isNull() )
		// {
		// getFormModel().getGNavBlock().setLastMenuItem(i);
		// getFormModel().getGNavBlock().setGoItem(menuItemValue);
		// break;
		// }
		// }
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_NextRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-OTHERS
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-OTHERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-OTHERS")
	public void gNavBlock_KeyOthers() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_KeyOthers is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-PRVBLK IF
	 * :G$_NAV_BLOCK.HOLD_CURSOR_LOCATION IS NOT NULL THEN
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_MENU; G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void gNavBlock_PreviousBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( !getFormModel().getGNavBlock().getHoldCursorLocation().isNull()
		// )
		// {
		// getTask().getGoqrpls().getGGoqolibKeyTrigger().keyMenu();
		// getTask().getGoqrpls().gCheckFailure();
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-PRVREC DECLARE
	 * last_menu_no INTEGER(2) := NVL(:G$_NAV_BLOCK.LAST_MENU_ITEM,0);
	 * menu_item_name VARCHAR2(30); menu_item_value VARCHAR2(30); BEGIN IF
	 * last_menu_no >= 10 THEN last_menu_no := 1; ELSE last_menu_no :=
	 * last_menu_no + 1; END IF; -- FOR i IN last_menu_no..10 LOOP
	 * menu_item_name := 'ACTION.LAST10_' || TO_CHAR(i); IF
	 * GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
	 * menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i)); -- IF
	 * menu_item_value IS NOT NULL THEN :G$_NAV_BLOCK.LAST_MENU_ITEM := i;
	 * :G$_NAV_BLOCK.GO_ITEM := menu_item_value; EXIT; END IF; -- ELSE
	 * :G$_NAV_BLOCK.LAST_MENU_ITEM := 0; :G$_NAV_BLOCK.GO_ITEM := ''; END IF;
	 * END LOOP; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAV_BLOCK.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void gNavBlock_PreviousRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		// NInteger lastMenuNo =
		// isNull(getFormModel().getGNavBlock().getLastMenuItem(), 0);
		// NString menuItemName= NString.getNull();
		// NString menuItemValue= NString.getNull();
		// if ( lastMenuNo.greaterOrEquals(10) )
		// {
		// lastMenuNo = toInt(1);
		// }
		// else {
		// lastMenuNo = lastMenuNo.add(1);
		// }
		// //
		// for ( int i = lastMenuNo; i <= 10; i++ )
		// {
		// menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
		// if ( getMenuItemVisible(menuItemName).equals("TRUE") )
		// {
		// menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
		// //
		// if ( !menuItemValue.isNull() )
		// {
		// getFormModel().getGNavBlock().setLastMenuItem(i);
		// getFormModel().getGNavBlock().setGoItem(menuItemValue);
		// break;
		// }
		// }
		// else {
		// getFormModel().getGNavBlock().setLastMenuItem(toInt(0));
		// getFormModel().getGNavBlock().setGoItem(toStr(""));
		// }
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.KEY-UP
	 * DO_KEY('PREVIOUS_RECORD');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: G$_NAV_BLOCK.KEY-UP
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void gNavBlock_MoveUp() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("PREVIOUS_RECORD");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.gNavBlock_MoveUp is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "GO_ITEM")
	public void goItem_doubleClick() {

		goqolibFormController().gCodeClass_WhenMouseDoubleclick();
	}


	public void goItem_WhenMouseDoubleclick() {

		goItem_doubleClick();
	}
	
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "GO_ITEM", function = KeyFunction.ITEM_CHANGE)
	public void goItem_itemChange() {

		getGCodeClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS")
	public void goItem_GSearchParameters() {

		goqolibFormController().gCodeClass_GSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS")
	public void goItem_GSearchOptions() {

		goqolibFormController().gCodeClass_GSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "GO_ITEM", function = KeyFunction.NEXT_ITEM)
	public void goItem_keyNexItem() {

		goqolibFormController().gCodeClass_keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "GO_ITEM", function = KeyFunction.ITEM_OUT)
	public void goItem_itemOut() {

		goqolibFormController().gCodeClass_itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GO_ITEM.KEY-ENTER BEGIN
	 * G$_RECONNECT; G$_CHECK_FAILURE; -- IF :SYSTEM.FORM_STATUS = 'CHANGED'
	 * THEN MESSAGE( G$_NLS.Get('GOQOLIB-0011', 'FORM','*ERROR* There are
	 * pending form changes; Commit or Rollback.') ); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- IF INSTR(:G$_NAV_BLOCK.GO_ITEM,'%') >= 1
	 * THEN :G$_NAV_BLOCK.GO_ITEM := ''; RETURN; END IF; --
	 * EXECUTE_TRIGGER('CHECK_TYPE'); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GO_ITEM.KEY-ENTER
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTER")
	public void goItem_KeyEnter() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gReconnect();
		// getTask().getGoqrpls().gCheckFailure();
		// //
		// if ( getTaskStatus().equals("CHANGED") )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0011"), toStr("FORM"),
		// toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
		// throw new ApplicationException();
		// }
		// //
		// if ( inStr(getFormModel().getGNavBlock().getGoItem(),
		// toStr("%")).greaterOrEquals(1) )
		// {
		// getFormModel().getGNavBlock().setGoItem(toStr(""));
		// return ;
		// }
		// //
		// executeAction("CHECK_TYPE");
		// getTask().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.goItem_KeyEnter is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GO_ITEM.KEY-LISTVAL BEGIN IF
	 * :SYSTEM.FORM_STATUS = 'CHANGED' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0012','FORM','*ERROR* There are pending form
	 * changes; Commit or Rollback.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIOBJS',''); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GO_ITEM.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-LISTVAL", item = "GO_ITEM", function = KeyFunction.LIST_VALUES)
	public void goItem_ListValues() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( getTaskStatus().equals("CHANGED") )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0012"), toStr("FORM"),
		// toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
		// throw new ApplicationException();
		// }
		// //
		// executeAction("G$_REVOKE_ACCESS");
		// getTask().getGoqrpls().gCheckFailure();
		// getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
		// toStr("GUIOBJS"), toStr(""));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.goItem_ListValues is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GO_ITEM_BTN.WHEN-BUTTON-PRESSED
	 * BEGIN IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0013','FORM','*ERROR* There are pending form
	 * changes; Commit or Rollback.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIOBJS',''); -- IF
	 * :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
	 * COPY(:GLOBAL.MENU_NAME_PARM,'G$_NAV_BLOCK.GO_ITEM');
	 * :GLOBAL.MENU_NAME_PARM := ''; GO_ITEM('G$_NAV_BLOCK.GO_ITEM');
	 * DO_KEY('ENTER'); G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GO_ITEM_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "GO_ITEM_BTN")
	public void goItemBtn_buttonClick() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( getTaskStatus().equals("CHANGED") )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0013"), toStr("FORM"),
		// toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
		// throw new ApplicationException();
		// }
		// //
		// executeAction("G$_REVOKE_ACCESS");
		// getTask().getGoqrpls().gCheckFailure();
		// getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
		// toStr("GUIOBJS"), toStr(""));
		// //
		// if ( !getGlobal("MENU_NAME_PARM").isNull() )
		// {
		// copy(getGlobal("MENU_NAME_PARM"),"G$_NAV_BLOCK.GO_ITEM");
		// setGlobal("MENU_NAME_PARM", toStr(""));
		// goItem(toStr("G$_NAV_BLOCK.GO_ITEM"));
		// // F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because
		// it is not supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
		// // SupportClasses.SQLFORMS.DoKey("ENTER");
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
		//
		// getTask().getGoqrpls().gCheckFailure();
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.goItemBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * URL_MY_INSTITUTION.WHEN-BUTTON-PRESSED
	 * WEB.SHOW_DOCUMENT(G$_GET_UPRF_LINKS_MY_INST,'_blank');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * URL_MY_INSTITUTION.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "URL_MY_INSTITUTION")
	public void urlMyInstitution_buttonClick() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// showDocument(getTask().getGoqrpls().gGetUprfLinksMyInst(), "_blank");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController.urlMyInstitution_buttonClick is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/* Original PL/SQL code code for TRIGGER GO_ITEM_BTN.WHEN-MOUSE-CLICK
	 * BEGIN
	 *  NULL;
	 * END;
	 */			
	@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GO_ITEM_BTN")
	public void goItemBtn_click() {

	}	
}
