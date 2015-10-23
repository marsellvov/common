package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import morphis.foundations.core.appsupportlib.model.IFormModelObject;

public class MenuType extends AbstractSupportCodeObject{

	
	public MenuType(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}
	
	public IFormModelObject getFormModel() {
		return this.getContainer().getModel();
	}

	
	/*
	 * Original PL/SQL code code for TRIGGER MENU_TYPE.POST-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: MENU_TYPE.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "POST-BLOCK")
	public void postBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER MENU_TYPE.PRE-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: MENU_TYPE.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK")
	public void preBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_PreBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER MENU_TYPE.QUERY_DATA -- 1-HBN4V
	 * DECLARE HOLD_POS VARCHAR2(80) := :SYSTEM.CURSOR_ITEM; BEGIN
	 * GO_BLOCK('GUBOBJS'); IF NVL(:FORM_HEADER.INITIAL_QUERY,'Y') = 'Y' THEN
	 * EXECUTE_QUERY; END IF; :FORM_HEADER.INITIAL_QUERY := 'N';
	 * GO_ITEM(HOLD_POS); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: MENU_TYPE.QUERY_DATA
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "QUERY_DATA")
	public void queryData() {

		// 1-HBN4V
		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// {
		 NString holdPos = getCursorItem();
		 goBlock(toStr("GUBOBJS"));
		 if ( getFormModel().getBusinessObject("FORM_HEADER").getValue("INITIAL_QUERY").equals("Y") )
		 {
		 executeQuery();
		 }
		 getFormModel().getBusinessObject("FORM_HEADER").setValue("INITIAL_QUERY","N");
		 goItem(holdPos);
		// }
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_QueryData is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER MENU_TYPE.WHEN-WINDOW-DEACTIVATED
	 * BEGIN NULL; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MENU_TYPE.WHEN-WINDOW-DEACTIVATED
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-WINDOW-DEACTIVATED")
	public void whenWindowDeactivated() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_WhenWindowDeactivated is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
	 * BEGIN G$_NAVIGATION_FRAME.POPULATE_GUROPTM; G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG'); G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE")
	public void whenNewBlockInstance() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 getContainer().getGoqrpls().getGNavigationFrame().populateGuroptm();
		 getContainer().getGoqrpls().gCheckFailure();
		 //
		 executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
		 getContainer().getGoqrpls().gCheckFailure();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_WhenNewBlockInstance is not completely migrated yet. Please read the Migration Guide.");
		

	}

}
