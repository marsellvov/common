package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.types.Types.toStr;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

public class GIdClass extends AbstractSupportCodeObject {

	public GIdClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.PRE-TEXT-ITEM BEGIN
	 * G$_IDNAME_SEARCH.DISABLE_NAME_ITEM; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.PRE-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-TEXT-ITEM", function = KeyFunction.ITEM_IN)
	public void itemIn() {

		getContainer().getGoqrpls().getGIdnameSearch().disableNameItem();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-NEXT-ITEM BEGIN
	 * G$_IDNAME_SEARCH.ID_SEARCH('ID','',''); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void keyNexItem() {
		getContainer().getGoqrpls().getGIdnameSearch()
				.idSearch(toStr("ID"), toStr(""), toStr(""));
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-LISTVAL BEGIN NULL;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void listValues() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-CQUERY BEGIN NULL;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CQUERY", function = KeyFunction.COUNT_QUERY)
	public void totalResults() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.WHEN-VALIDATE-ITEM
	 * BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ValidationTrigger(item = "G$_ID_CLASS")
	public void validate() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_ID_CLASS.POST-CHANGE BEGIN NULL;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_ID_CLASS.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-CHANGE")
	public void postChange() {

		//

	}

	public void nextItem() {
		keyNexItem();
		
	}

}
