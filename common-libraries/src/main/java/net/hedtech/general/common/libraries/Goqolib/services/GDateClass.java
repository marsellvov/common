package net.hedtech.general.common.libraries.Goqolib.services;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

public class GDateClass extends AbstractSupportCodeObject {

	public GDateClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_DATE_CLASS.KEY-NEXT-ITEM BEGIN
	 * G$_DATE_NEXT_ITEM; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_DATE_CLASS.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void nextItem() {

		getContainer().getGoqrpls().gDateNextItem();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_DATE_CLASS.WHEN-NEW-ITEM-INSTANCE BEGIN G$_DATE_WHEN_NEW_ITEM;
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_DATE_CLASS.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", function = KeyFunction.ITEM_CHANGE)
	public void itemChange() {

		getContainer().getGoqrpls().gDateWhenNewItem();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_DATE_CLASS.POST-TEXT-ITEM BEGIN
	 * G$_DATE_POST_ITEM; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_DATE_CLASS.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-TEXT-ITEM", function = KeyFunction.ITEM_OUT)
	public void itemOut() {

		getContainer().getGoqrpls().gDatePostItem();
		getContainer().getGoqrpls().gCheckFailure();

	}

}
