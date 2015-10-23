package net.hedtech.general.common.libraries.Goqolib.services;

import static morphis.foundations.core.types.Types.toStr;

import java.util.EventObject;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;

import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.events.OnError;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

public class QkMenuType extends AbstractSupportCodeObject {

	public QkMenuType(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.POST-QUERY DECLARE
	 * HOLD_DESC VARCHAR2(80); BEGIN SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE INTO
	 * HOLD_DESC, :QK_MENU.QK_TYPE FROM GUBOBJS WHERE GUBOBJS_NAME =
	 * :QK_MENU.GURMENU_OBJ_NAME AND ROWNUM = 1; -- IF NVL(LENGTH(HOLD_DESC), 0)
	 * > 45 THEN :QK_MENU.QK_DESC := SUBSTR(HOLD_DESC,1,40)||'...'; ELSE
	 * :QK_MENU.QK_DESC := HOLD_DESC; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@AfterQuery
	public void afterQuery(RowAdapterEvent args) {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// QkMenuAdapter qkMenuElement =
		// (QkMenuAdapter)this.getFormModel().getQkMenu().getRowAdapter(true);
		//
		//
		// int rowCount = 0;
		// {
		// NString holdDesc= NString.getNull();
		// String sql1 = "SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE " +
		// " FROM GUBOBJS " +
		// " WHERE GUBOBJS_NAME = :QK_MENU_GURMENU_OBJ_NAME AND ROWNUM = 1 ";
		// DataCommand command1 = new DataCommand(sql1);
		// //Setting query parameters
		// command1.addParameter("QK_MENU_GURMENU_OBJ_NAME",
		// qkMenuElement.getGurmenuObjName());
		// ResultSet results1 = command1.executeQuery();
		// rowCount = command1.getRowCount();
		// if ( results1.hasData() ) {
		// holdDesc = results1.getStr(0);
		// qkMenuElement.setQkType(results1.getStr(1));
		// }
		// results1.close();
		// //
		// if ( isNull(length(holdDesc), 0).greater(45) )
		// {
		// qkMenuElement.setQkDesc(substring(holdDesc, toInt(1),
		// toInt(40)).append("..."));
		// }
		// else {
		// qkMenuElement.setQkDesc(holdDesc);
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_AfterQuery is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.ON-ERROR DECLARE
	 * lv_errcod NUMBER := ERROR_CODE; lv_errtyp VARCHAR2(3) := ERROR_TYPE;
	 * lv_errtxt VARCHAR2(80) := ERROR_TEXT; BEGIN IF DBMS_ERROR_CODE = -1403
	 * THEN NULL; ELSE IF (lv_errcod = 40102) THEN NULL; ELSE
	 * MESSAGE(lv_errtyp||'-'||to_char(lv_errcod)||': '||lv_errtxt); RAISE
	 * Form_Trigger_Failure; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@OnError
	public void onError(EventObject args) {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		// NNumber lvErrcod = SupportClasses.SQLFORMS.ErrorCode();
		// NString lvErrtyp = SupportClasses.SQLFORMS.ErrorType();
		// NString lvErrtxt = SupportClasses.SQLFORMS.ErrorText();
		// if ( errorCode().equals(- (1403)) )
		// {
		// }
		// else {
		// if ((lvErrcod.equals(40102)))
		// {
		// }
		// else {
		// message(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
		// throw new ApplicationException();
		// }
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_OnError is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.POST-BLOCK
	 * HIDE_VIEW('MENU_ENTIRE');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK")
	public void postBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// hideView("MENU_ENTIRE");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-CREREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void createRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-DELREC BEGIN
	 * G$_INVALID_FUNCTION_MSG; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void deleteRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NXTBLK
	 * GO_BLOCK('GUBOBJS');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void nextBlock() {

		TaskServices.goBlock(toStr("GUBOBJS"));

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NXTREC BEGIN IF
	 * :SYSTEM.LAST_RECORD <> 'TRUE' THEN NEXT_RECORD; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void nextRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( !isInLastRecord() )
		// {
		// nextRecord();
		// }
		//

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PRVBLK
	 * GO_BLOCK('GUBOBJS');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void previousBlock() {

		TaskServices.goBlock(toStr("GUBOBJS"));
		//

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PRVREC BEGIN IF
	 * :SYSTEM.CURSOR_RECORD <> '1' THEN PREVIOUS_RECORD; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void previousRecord() {

		if (TaskServices.getCursorRecord().notEquals("1")) {
			BlockServices.previousRecord();
		}

	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NEXT-ITEM
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void keyNexItem() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
	}

	/*
	 * Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PREV-ITEM
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * QK_MENU_TYPE.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PREV-ITEM", function = KeyFunction.PREVIOUS_ITEM)
	public void previousItem() {
		getContainer().getGoqrpls().gInvalidFunctionMsg();
		//
	}

}
