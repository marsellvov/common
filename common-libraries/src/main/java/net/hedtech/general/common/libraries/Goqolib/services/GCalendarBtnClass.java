package net.hedtech.general.common.libraries.Goqolib.services;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

public class GCalendarBtnClass extends AbstractSupportCodeObject {

	public GCalendarBtnClass(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_CALENDAR_BTN_CLASS.WHEN-BUTTON-PRESSED DECLARE ITEM_ID ITEM; AL_BUT
	 * NUMBER; CUR_ITEM VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
	 * CURRENT_BLOCK_FLD VARCHAR2(61); BEGIN ITEM_ID :=
	 * FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
	 * SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'), INSTR(CUR_ITEM,'_DBT') - 1 -
	 * INSTR(CUR_ITEM,'.') + 1)); IF ID_NULL(ITEM_ID) THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0029','FORM','*ERROR* Date button is outside
	 * the current block.')); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
	 * SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'), INSTR(CUR_ITEM,'_DBT') - 1 -
	 * INSTR(CUR_ITEM,'.') + 1); -- -- If calculate item is not visible, exit.
	 * -- IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN RETURN;
	 * END IF; -- -- Check if item is protected or not. If not, launch the form.
	 * -- IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
	 * (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
	 * NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR (NAME_IN('SYSTEM.MODE') <>
	 * 'NORMAL' AND GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
	 * (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
	 * GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
	 * (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
	 * GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN -- --
	 * Not protected, so call the form. -- GO_ITEM(CURRENT_BLOCK_FLD);
	 * G$_CHECK_FAILURE; COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE'); -- IF
	 * NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
	 * COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD); COPY('','GLOBAL.VALUE');
	 * DO_KEY('NEXT_ITEM'); END IF; -- -- Protected, don't launch form. -- ELSE
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0030','FORM','*ERROR* Item is protected
	 * against update.')); NULL; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CALENDAR_BTN_CLASS.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-BUTTON-PRESSED")
	public void whenButtonPressed() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		// ItemDescriptor itemId= null;
		// NNumber alBut= NNumber.getNull();
		// NString curItem = getTriggerItem();
		// NString currentBlockFld= NString.getNull();
		// itemId = findItem(getCursorBlock().append(substring(curItem,
		// inStr(curItem, toStr(".")), inStr(curItem,
		// toStr("_DBT")).subtract(1).subtract(inStr(curItem,
		// toStr("."))).add(1))));
		// if ( (itemId == null) )
		// {
		// message(GNls.Fget(toStr("GOQOLIB-0029"), toStr("FORM"),
		// toStr("*ERROR* Date button is outside the current block.")));
		// throw new ApplicationException();
		// }
		// currentBlockFld = getCursorBlock().append(substring(curItem,
		// inStr(curItem, toStr(".")), inStr(curItem,
		// toStr("_DBT")).subtract(1).subtract(inStr(curItem,
		// toStr("."))).add(1)));
		// //
		// // If calculate item is not visible, exit.
		// //
		// if ( getItemEnabled(currentBlockFld).equals("FALSE") )
		// {
		// return ;
		// }
		// //
		// // Check if item is protected or not. If not, launch the form.
		// //
		// // F2J_WARNING : The built-in call was converted but there can be
		// semantic differences in the resulting code.
		// if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") ||
		// (SupportClasses.FORMS40.GetItemProperty(currentBlockFld,
		// SupportClasses.Property.UPDATE_NULL).equals("TRUE") &&
		// SupportClasses.AppContext.CursorValue.isNull()) ||
		// (getMode().notEquals("NORMAL") &&
		// getItemQueryAllowed(currentBlockFld).equals("TRUE")) ||
		// (getRecordStatus().equals("NEW") &&
		// getItemInsertAllowed(currentBlockFld).equals("TRUE")) ||
		// (getRecordStatus().equals("INSERT") &&
		// getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
		// {
		// // F2N_TODO: The above condition uses unsupported features. You
		// should eliminate all references to SupportClasses.
		// //
		// // Not protected, so call the form.
		// //
		// goItem(currentBlockFld);
		// getContainer().getGoqrpls().gCheckFailure();
		// copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
		// executeAction("G$_REVOKE_ACCESS");
		// getContainer().getGoqrpls().gCheckFailure();
		// getContainer().getGoqrpls().gSecuredFormCall(getUser(),
		// toStr("GUACALN"), toStr("QUERY_NOHIDE"));
		// //
		// if ( !getNameIn("GLOBAL.VALUE").isNull() )
		// {
		// copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
		// copy("","GLOBAL.VALUE");
		// executeAction("NEXT_ITEM");
		// }
		// }
		// else {
		// message(GNls.Fget(toStr("GOQOLIB-0030"), toStr("FORM"),
		// toStr("*ERROR* Item is protected against update.")));
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCalendarBtnClass_WhenButtonPressed is not completely migrated yet. Please read the Migration Guide.");
		

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

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().getGSearch().whenMouseClick();
		// getContainer().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_WhenMouseDoubleclick is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_CALENDAR_BTN_CLASS.WHEN-MOUSE-CLICK BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_CALENDAR_BTN_CLASS.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-CLICK")
	public void whenMouseClick() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCalendarBtnClass_WhenMouseClick is not completely migrated yet. Please read the Migration Guide.");
		

	}
	
	// cas cc
	public void click() {
		whenMouseClick();
	}

}
