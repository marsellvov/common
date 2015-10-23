package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;

public class GApplFormClass extends AbstractSupportCodeObject {

	public GApplFormClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_APPL_FORM_CLASS.CHECK_KEYS BEGIN
	 * NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_APPL_FORM_CLASS.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHECK_KEYS")
	public void checkKeys() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		//System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gApplFormClass_CheckKeys is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_APPL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE -- 741-1
	 * G$_SD.p_when_new_rec_inst;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_APPL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE")
	public void whenNewRecordInstance() {

		// 741-1
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// // 741-1
		getContainer().getGoqrpls().getGSd().pWhenNewRecInst();

	}

	public void recordChange() {
		whenNewRecordInstance();
	}
}
