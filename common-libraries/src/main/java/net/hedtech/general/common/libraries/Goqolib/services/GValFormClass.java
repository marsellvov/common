package net.hedtech.general.common.libraries.Goqolib.services;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

public class GValFormClass extends AbstractSupportCodeObject {

	public GValFormClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_VAL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE -- 741-1
	 * G$_SD.p_when_new_rec_inst;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VAL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE")
	public void whenNewRecordInstance() {
		getContainer().getGoqrpls().getGSd().pWhenNewRecInst();
		
	}

	public void recordChange() {
		whenNewRecordInstance();
		
	}

}
