package net.hedtech.banner.finance.common.Foqolib.controller;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqolib.model.*;
import net.hedtech.banner.finance.common.Foqolib.*;
import net.hedtech.banner.finance.common.Foqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;

public class FFormatNumbersController extends AbstractSupportCodeObject {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this
				.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_NON_ICON_BTN_CLASS");
	}

	public FFormatNumbersController(ISupportCodeContainer parentController) {
		super(parentController);
	}

	@Override
	public FoqolibTaskPart getContainer() {
		return (FoqolibTaskPart) super.getContainer();
	}

	public FoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER
	 * F$_FORMAT_NUMBERS.WHEN-NEW-BLOCK-INSTANCE NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void fFormatNumbers_blockChange() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * F$_FORMAT_NUMBERS.WHEN-RADIO-CHANGED
	 * F$_FORMAT_NUMBER.WHEN_RADIO_CHANGED_TRG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.WHEN-RADIO-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-RADIO-CHANGED")
	public void fFormatNumbers_radioGroupChange() {

		getContainer().getFoqrpls().getFFormatNumber().whenRadioChangedTrg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.PRE-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void fFormatNumbers_blockIn() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.POST-BLOCK
	 * F$_FORMAT_NUMBER.POST_BLOCK_TRG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void fFormatNumbers_blockOut() {

		getContainer().getFoqrpls().getFFormatNumber().postBlockTrg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-COMMIT BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void fFormatNumbers_Save() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-CLRREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void fFormatNumbers_ClearRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-CREREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void fFormatNumbers_CreateRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-DELREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void fFormatNumbers_DeleteRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-EXEQRY BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void fFormatNumbers_ExecuteQuery() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-ENTQRY BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void fFormatNumbers_Search() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-NXTREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void fFormatNumbers_NextRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-NXTSET BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void fFormatNumbers_KeyNxtset() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-NXTBLK BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void fFormatNumbers_NextBlock() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-PRVBLK BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void fFormatNumbers_PreviousBlock() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-PRVREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void fFormatNumbers_PreviousRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-DOWN BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void fFormatNumbers_MoveDown() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_FORMAT_NUMBERS.KEY-UP BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_FORMAT_NUMBERS.KEY-UP
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void fFormatNumbers_MoveUp() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_OK_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "F$_OK_BTN")
	public void fOkBtn_click() {

		getGNonIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_OK_BTN.WHEN-BUTTON-PRESSED
	 * F$_FORMAT_NUMBER.APPLY_FORMAT; F$_FORMAT_NUMBER.CLOSE_FORMAT;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_OK_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "F$_OK_BTN")
	public void fOkBtn_buttonClick() {

		getContainer().getFoqrpls().getFFormatNumber().applyFormat();
		getContainer().getFoqrpls().getFFormatNumber().closeFormat();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_CANCEL_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "F$_CANCEL_BTN")
	public void fCancelBtn_click() {

		getGNonIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_CANCEL_BTN.WHEN-BUTTON-PRESSED
	 * F$_FORMAT_NUMBER.CLOSE_FORMAT;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_CANCEL_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "F$_CANCEL_BTN")
	public void fCancelBtn_buttonClick() {

		getContainer().getFoqrpls().getFFormatNumber().closeFormat();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_APPLY_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "F$_APPLY_BTN")
	public void fApplyBtn_click() {

		getGNonIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER F$_APPLY_BTN.WHEN-BUTTON-PRESSED
	 * F$_FORMAT_NUMBER.APPLY_FORMAT;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * F$_APPLY_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "F$_APPLY_BTN")
	public void fApplyBtn_buttonClick() {

		getContainer().getFoqrpls().getFFormatNumber().applyFormat();
	}
}
