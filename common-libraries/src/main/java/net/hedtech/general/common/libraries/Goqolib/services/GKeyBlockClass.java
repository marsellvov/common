package net.hedtech.general.common.libraries.Goqolib.services;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

public class GKeyBlockClass extends AbstractSupportCodeObject {

	public GKeyBlockClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.POST-BLOCK BEGIN
	 * G$_GOQOLIB_PP_TRIGGER.POST_BLOCK; G$_CHECK_FAILURE;
	 * G$_GOQOLIB_USER_TRIGGER.CHECK_KEYS; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK")
	public void postBlock() {
		getContainer().getGoqrpls().getGGoqolibPpTrigger().postBlock();

		getContainer().getGoqrpls().getGGoqolibUserTrigger().checkKeys();

	}

	public void blockOut() {
		postBlock();
	}
	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-COMMIT BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void save() {

		//

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-UP BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-UP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void moveUp() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-DOWN BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void moveDown() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-CREREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void createRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-DELREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void deleteRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-ENTQRY BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void search() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-EXEQRY BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void executeQuery() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void nextRecord() {
		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTSET BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTSET")
	public void keyNxtset() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTBLK BEGIN
	 * EXECUTE_TRIGGER('CHECK_KEYS'); G$_CHECK_FAILURE;
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void nextBlock() {

//		executeAction("CHECK_KEYS") can not change NEXT_BLOCK. keyNxtblk() will do.
		 executeAction("CHECK_KEYS");
		 getContainer().getGoqrpls().gCheckFailure();
		 getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyNxtblk();
		 getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-PRVBLK BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>This trigger checks if a valid PIDM exists. If it does, perform
	 * previous
	 * 
	 * block and execute query. If not, display error message.<b>Migration
	 * Comments</b> Generated from trigger: G$_KEY_BLOCK_CLASS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void previousBlock() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-PRVREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * G$_KEY_BLOCK_CLASS.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void previousRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();

	}

}
