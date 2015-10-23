package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;

public class GIconBtnClass extends AbstractSupportCodeObject {

	public GIconBtnClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
	 * BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-CLICK")
	public void whenMouseClick() {

	}
	
	public void click() {
		whenMouseClick();
	}

}
