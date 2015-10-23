package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.appsupportlib.runtime.ItemServices.previousItem;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

public class GDescClass extends AbstractSupportCodeObject {

	public GDescClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_DESC_CLASS.WHEN-NEW-ITEM-INSTANCE PREVIOUS_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_DESC_CLASS.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", function = KeyFunction.ITEM_CHANGE)
	public void itemChange() {

		previousItem();

	}

}
