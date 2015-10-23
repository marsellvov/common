package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.appsupportlib.runtime.ItemServices.nextItem;
import static morphis.foundations.core.types.Types.toStr;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

public class GCodeClass extends AbstractSupportCodeObject {

	public GCodeClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_CODE_CLASS.WHEN-MOUSE-DOUBLECLICK BEGIN G$_SEARCH.WHEN_MOUSE_CLICK;
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void whenMouseDoubleclick() {

		 getContainer().getGoqrpls().getGSearch().whenMouseClick();
		 getContainer().getGoqrpls().gCheckFailure();

	}

	public void doubleClick() {
		whenMouseDoubleclick();
	}
	
	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_CODE_CLASS.WHEN-NEW-ITEM-INSTANCE BEGIN
	 * G$_SEARCH.CODE_WHEN_NEW_ITEM_INST; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", function = KeyFunction.ITEM_CHANGE)
	public void itemChange() {

		getContainer().getGoqrpls().getGSearch().codeWhenNewItemInst();
		getContainer().getGoqrpls().gCheckFailure();

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_CODE_CLASS.G$_SEARCH_PARAMETERS
	 * BEGIN G$_SEARCH.PARAMETERS('','',''); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_SEARCH_PARAMETERS")
	public void gSearchParameters() {

		getContainer().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_CODE_CLASS.G$_SEARCH_OPTIONS
	 * BEGIN DO_KEY('LIST_VALUES'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "G$_SEARCH_OPTIONS")
	public void gSearchOptions() {
		executeAction("LIST_VALUES");
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_CODE_CLASS.KEY-NEXT-ITEM BEGIN
	 * G$_SEARCH.CODE_KEY_NEXT_ITEM; G$_CHECK_FAILURE; NEXT_ITEM; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void keyNexItem() {

		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		getContainer().getGoqrpls().gCheckFailure();
		morphis.foundations.core.appsupportlib.runtime.ItemServices.nextItem();
		doNavigation();

	}
	
	public void nextItem() {
		keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_CODE_CLASS.POST-TEXT-ITEM BEGIN
	 * G$_SEARCH.POST_TEXT_CODE; G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CODE_CLASS.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-TEXT-ITEM", function = KeyFunction.ITEM_OUT)
	public void itemOut() {

		getContainer().getGoqrpls().getGSearch().postTextCode();
		getContainer().getGoqrpls().gCheckFailure();

	}

}
