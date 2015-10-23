package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

public class GNameClass extends AbstractSupportCodeObject {

	public GNameClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_NAME_CLASS.KEY-NEXT-ITEM BEGIN
	 * G$_IDNAME_SEARCH.ID_SEARCH('NAME','',''); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_NAME_CLASS.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void keyNexItem() {

		getContainer().getGoqrpls().getGIdnameSearch().idSearch(toStr("NAME"), toStr(""), toStr(""));
		getContainer().getGoqrpls().gCheckFailure();

	}

	public void nextItem() {
		 keyNexItem() ;
		
	}

}
