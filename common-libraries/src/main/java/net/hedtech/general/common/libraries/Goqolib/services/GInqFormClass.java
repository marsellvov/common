package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

public class GInqFormClass extends AbstractSupportCodeObject {

	public GInqFormClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.CHECK_KEYS BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_KEYS")
	public void checkKeys() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-CLRREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void clearRecord() {

		//
		getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-COMMIT BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void save() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
		//

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-CREREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void createRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
		//

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DELREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void deleteRecord() {

		 getContainer().getGoqrpls().gInvalidFunctionMsg();
		
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DUP-ITEM
	 * BEGIN G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-DUP-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DUP-ITEM")
	public void keyDupItem() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_KeyDupItem is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DUPREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void copyRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_CopyRecord is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_INQ_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE -- 741-1
	 * G$_SD.p_when_new_rec_inst; -- 80-19
	 * G$_GOQOLIB_USER_TRIGGER.WHEN_NEW_REC_INST; G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_INQ_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE")
	public void whenNewRecordInstance() {

		// 741-1
		getContainer().getGoqrpls().getGSd().pWhenNewRecInst();
		// 80-19
		getContainer().getGoqrpls().getGGoqolibUserTrigger().whenNewRecInst();

	}

	public void recordChange() {
		whenNewRecordInstance();
	}
}
