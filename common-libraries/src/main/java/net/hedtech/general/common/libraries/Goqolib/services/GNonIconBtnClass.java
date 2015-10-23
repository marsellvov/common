package net.hedtech.general.common.libraries.Goqolib.services;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

public class GNonIconBtnClass extends AbstractSupportCodeObject {

	public GNonIconBtnClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_NON_ICON_BTN_CLASS.WHEN-MOUSE-CLICK BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NON_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-CLICK")
	public void whenMouseClick() {

	}

	// CAS cc
	public void click() {
		whenMouseClick();
	}
}
