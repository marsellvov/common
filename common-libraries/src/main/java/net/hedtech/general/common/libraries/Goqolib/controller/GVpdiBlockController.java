package net.hedtech.general.common.libraries.Goqolib.controller;

import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;

public class GVpdiBlockController extends AbstractSupportCodeObject {

	public GVpdiBlockController(ISupportCodeContainer container) {
		super(container);
	}	

	public GoqolibTaskPart getContainer() {
		 return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
	

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER
	 * G$_VPDI_BLOCK.WHEN-NEW-BLOCK-INSTANCE
	 * G$_GOQOLIB_OPT_BLOCK.WHEN_OPT_BLOCK_INST;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void gVpdiBlock_blockChange() {

		 getContainer().getGoqrpls().getGGoqolibOptBlock().whenOptBlockInst();
				

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.PRE-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-BLOCK", function = KeyFunction.BLOCK_IN)
	public void gVpdiBlock_blockIn() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_blockIn is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.POST-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void gVpdiBlock_blockOut() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_blockOut is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-CLRBLK
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-CLRBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRBLK", function = KeyFunction.CLEAR_BLOCK)
	public void gVpdiBlock_keyClearBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_keyClearBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-CLRFRM
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void gVpdiBlock_ClearTask() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_ClearTask is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-CLRREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void gVpdiBlock_ClearRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_ClearRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-COMMIT
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void gVpdiBlock_Save() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_Save is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-CQUERY
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", function = KeyFunction.COUNT_QUERY)
	public void gVpdiBlock_TotalResults() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_TotalResults is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-CREREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void gVpdiBlock_CreateRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-DELREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void gVpdiBlock_DeleteRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-DUP-ITEM
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-DUP-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUP-ITEM")
	public void gVpdiBlock_KeyDupItem() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_KeyDupItem is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-DUPREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void gVpdiBlock_CopyRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_CopyRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-ENTQRY
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void gVpdiBlock_Search() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_Search is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-EXEQRY
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void gVpdiBlock_ExecuteQuery() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-NXTBLK
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void gVpdiBlock_NextBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_NextBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-NXTREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void gVpdiBlock_NextRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_NextRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-OTHERS
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-OTHERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-OTHERS")
	public void gVpdiBlock_KeyOthers() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_KeyOthers is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-PRVBLK
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void gVpdiBlock_PreviousBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER G$_VPDI_BLOCK.KEY-PRVREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * G$_VPDI_BLOCK.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void gVpdiBlock_PreviousRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().gInvalidFunctionMsg();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.gVpdiBlock_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_CODE.KEY-CQUERY
	 * G$_VPDI.P_SELECT_VPDI_DATA;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: VPDI_CODE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "VPDI_CODE", function = KeyFunction.COUNT_QUERY)
	public void vpdiCode_TotalResults() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// getTask().getGoqrpls().getGVpdi().pSelectVpdiData();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.vpdiCode_TotalResults is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_CODE.PRE-TEXT-ITEM IF
	 * NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NULL AND
	 * NAME_IN('GLOBAL.INSTITUTION_CODE') IS NOT NULL THEN
	 * COPY(NAME_IN('GLOBAL.INSTITUTION_CODE'),'G$_VPDI_BLOCK.VPDI_CODE'); END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_CODE.PRE-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-TEXT-ITEM", item = "VPDI_CODE", function = KeyFunction.ITEM_IN)
	public void vpdiCode_itemIn() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// if ( getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull() &&
		// !getNameIn("GLOBAL.INSTITUTION_CODE").isNull() )
		// {
		// copy(getNameIn("GLOBAL.INSTITUTION_CODE"),"G$_VPDI_BLOCK.VPDI_CODE");
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.vpdiCode_itemIn is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_CODE.POST-CHANGE DECLARE
	 * CURSOR PTI_CURSOR IS SELECT GTVVPDI_DESC FROM GTVVPDI WHERE GTVVPDI_CODE
	 * = :G$_VPDI_BLOCK.VPDI_CODE; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :G$_VPDI_BLOCK.VPDI_DESC; G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND, '*ERROR*
	 * Invalid code, press LIST for valid codes.', TRUE); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "VPDI_CODE")
	public void vpdiCode_PostChange() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// int rowCount = 0;
		// {
		// String sqlptiCursor = "SELECT GTVVPDI_DESC " +
		// " FROM GTVVPDI " +
		// " WHERE GTVVPDI_CODE = :G___VPDI_BLOCK_VPDI_CODE ";
		// DataCursor ptiCursor = new DataCursor(sqlptiCursor);
		// try {
		// //Setting query parameters
		// ptiCursor.addParameter("G___VPDI_BLOCK_VPDI_CODE",
		// getFormModel().getGVpdiBlock().getVpdiCode());
		// //F2J_WARNING : Make sure that the method "Close" is being called
		// over the variable ptiCursor.
		// ptiCursor.open();
		// ResultSet ptiCursorResults = ptiCursor.fetchInto();
		// if ( ptiCursorResults != null ) {
		// getFormModel().getGVpdiBlock().setVpdiDesc(ptiCursorResults.getStr(0));
		// }
		// getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(),
		// toStr("*ERROR* Invalid code, press LIST for valid codes."),
		// toBool(NBool.True));
		// }
		// finally{
		// ptiCursor.close();
		// }
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.vpdiCode_PostChange is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_CODE.WHEN-VALIDATE-ITEM IF
	 * :G$_VPDI_BLOCK.VPDI_CODE IS NULL THEN :G$_VPDI_BLOCK.VPDI_DESC := ''; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "VPDI_CODE")
	public void vpdiCode_validate() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// this.vpdiCode_PostChange();

		// if ( getFormModel().getGVpdiBlock().getVpdiCode().isNull() )
		// {
		// getFormModel().getGVpdiBlock().setVpdiDesc(toStr(""));
		// }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.vpdiCode_validate is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * VPDI_OTHER_INSTITUTIONS.WHEN-BUTTON-PRESSED DO_KEY('COUNT_QUERY');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_OTHER_INSTITUTIONS.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "VPDI_OTHER_INSTITUTIONS")
	public void vpdiOtherInstitutions_buttonClick() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// executeAction("COUNT_QUERY");
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController.vpdiOtherInstitutions_buttonClick is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_CANCEL_BTN.WHEN-BUTTON-PRESSED
	 * G$_VPDI.CANCEL_VPDI_SELECTION;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_CANCEL_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "VPDI_CANCEL_BTN")
	public void vpdiCancelBtn_buttonClick() {

		getContainer().getGoqrpls().getGVpdi().cancelVpdiSelection();

	}

	/*
	 * Original PL/SQL code code for TRIGGER VPDI_OK_BTN.WHEN-BUTTON-PRESSED
	 * G$_VPDI.SAVE_VPDI_SELECTION;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * VPDI_OK_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "VPDI_OK_BTN")
	public void vpdiOkBtn_buttonClick() {

		 getContainer().getGoqrpls().getGVpdi().saveVpdiSelection();
	}

	// cas ???
	
	/* Original PL/SQL code code for TRIGGER VPDI_CODE_LBT.WHEN_BUTTON_PRESSED
	 BEGIN
DO_KEY('LIST_VALUES');
END;
	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE_LBT.WHEN_BUTTON_PRESSED
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="WHEN_BUTTON_PRESSED", item="VPDI_CODE_LBT")
	public void vpdiCodeLbt_WhenButtonPressed()
	{
		
			executeAction("LIST_VALUES");
		}
		
	/* Original PL/SQL code code for TRIGGER VPDI_CODE.POST-TEXT-ITEM
	 BEGIN
G$_SEARCH.POST_TEXT_CODE;
G$_CHECK_FAILURE;
END;
	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE.POST-TEXT-ITEM
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="POST-TEXT-ITEM", item="VPDI_CODE", function=KeyFunction.ITEM_OUT)
	public void vpdiCode_itemOut()
	{
		
			getContainer().getGoqrpls().getGSearch().postTextCode();
			getContainer().getGoqrpls().gCheckFailure();
		}



	
	/* Original PL/SQL code code for TRIGGER VPDI_CODE.KEY-NEXT-ITEM
	 BEGIN
G$_SEARCH.CODE_KEY_NEXT_ITEM;
G$_CHECK_FAILURE;
NEXT_ITEM;
END;
	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE.KEY-NEXT-ITEM
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="KEY-NEXT-ITEM", item="VPDI_CODE", function=KeyFunction.NEXT_ITEM)
	public void vpdiCode_keyNexItem()
	{
		
			getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
			getContainer().getGoqrpls().gCheckFailure();
			nextItem();
		}


	
	/* Original PL/SQL code code for TRIGGER VPDI_CODE.G$_SEARCH_OPTIONS
	 BEGIN
DO_KEY('LIST_VALUES');
END;

	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE.G$_SEARCH_OPTIONS
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="G$_SEARCH_OPTIONS", item="VPDI_CODE")
	public void vpdiCode_GSearchOptions()
	{
		
			executeAction("LIST_VALUES");
		}


	
	/* Original PL/SQL code code for TRIGGER VPDI_CODE.G$_SEARCH_PARAMETERS
	 BEGIN
G$_SEARCH.PARAMETERS('','','');
END;

	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE.G$_SEARCH_PARAMETERS
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="VPDI_CODE")
	public void vpdiCode_GSearchParameters()
	{
		
		getContainer().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
		}


	/* Original PL/SQL code code for TRIGGER VPDI_CODE.WHEN-NEW-ITEM-INSTANCE
	 DECLARE
CURSOR PTI_CURSOR IS
SELECT GTVVPDI_DESC
  FROM GTVVPDI
 WHERE GTVVPDI_CODE = :G$_VPDI_BLOCK.VPDI_CODE;
BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
--
IF :G$_VPDI_BLOCK.VPDI_CODE IS NULL THEN
:G$_VPDI_BLOCK.VPDI_CODE := G$_VPDI.FIND_VPDI(:SYSTEM.CURRENT_FORM);
END IF;
--  
IF :G$_VPDI_BLOCK.VPDI_DESC IS NULL THEN  	
OPEN PTI_CURSOR;
FETCH PTI_CURSOR INTO :G$_VPDI_BLOCK.VPDI_DESC;
CLOSE PTI_CURSOR;
END IF;
END;
	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * VPDI_CODE.WHEN-NEW-ITEM-INSTANCE
	 *
	 *
	 *</p>
	*/

	@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="VPDI_CODE", function=KeyFunction.ITEM_CHANGE)
	public void vpdiCode_itemChange()
	{
		
			int rowCount = 0;
			{
				String sqlptiCursor = "SELECT GTVVPDI_DESC " +
" FROM GTVVPDI " +
" WHERE GTVVPDI_CODE = :G___VPDI_BLOCK_VPDI_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					getContainer().getGoqrpls().getGSearch().codeWhenNewItemInst();
					getContainer().getGoqrpls().gCheckFailure();
					// 
					if ( getFormModel().getGVpdiBlock().getVpdiCode().isNull() )
					{
						getFormModel().getGVpdiBlock().setVpdiCode(getContainer().getGoqrpls().getGVpdi().findVpdi(toStr(getCurrentTaskName())));
					}
					//   
					if ( getFormModel().getGVpdiBlock().getVpdiDesc().isNull() )
					{
						//Setting query parameters
						ptiCursor.addParameter("G___VPDI_BLOCK_VPDI_CODE", getFormModel().getGVpdiBlock().getVpdiCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getGVpdiBlock().setVpdiDesc(ptiCursorResults.getStr(0));
						}
						ptiCursor.close();
					}
				}
				finally{
					ptiCursor.close();
				}
			}
		}

	
	
	// cas cc
	public void vpdiCode_doubleClick() {
		// TODO MORPHIS : need to import original method
	}
	
	// cas cc
	public void vpdiDesc_itemChange() {
		// TODO MORPHIS : need to import original method
		
	}
	
	//pg general cc
	public void vpdiCode_WhenMouseDoubleclick() {
		vpdiCode_doubleClick();
	}
}
