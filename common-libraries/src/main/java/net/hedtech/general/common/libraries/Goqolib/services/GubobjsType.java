package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.model.IFormModelObject;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NNumber;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;


public class GubobjsType extends AbstractSupportCodeObject{

	public GubobjsType(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.PRE-BLOCK
	 * SET_BLOCK_PROPERTY('GUBOBJS',OPTIMIZER_HINT,'RULE');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.PRE-BLOCK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "PRE-BLOCK")
	public void preBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		// // F2J_NOT_SUPPORTED : The property "BLOCK's OPTIMIZER_HINT" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
		
//		SupportClasses.FORMS40.SetBlockProperty("GUBOBJS", SupportClasses.Property.OPTIMIZER_HINT, "RULE");
		
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's OPTIMIZER_HINT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
		//
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_PreBlock is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.POST-QUERY NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.POST-QUERY
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
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_AfterQuery is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-LISTVAL DECLARE
	 * qk_height number(2); row_count number(5); cur_pos number(5); row_pos
	 * number(5); top_rec number(5):= GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD);
	 * cur_rec number(5):= :SYSTEM.TRIGGER_RECORD; BEGIN IF
	 * :FORM_HEADER.OBJECT_TYPE = 'MENU' THEN
	 * SET_ITEM_PROPERTY('QK_FLOW.GURCALL_CALL_CODE',DISPLAYED,PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY('QK_FLOW.GURCALL_FORM' ,DISPLAYED,PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY('QK_FLOW.QK_DESC' ,DISPLAYED,PROPERTY_FALSE); --
	 * SET_ITEM_PROPERTY('QK_MENU.GURMENU_OBJ_NAME' ,DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_MENU.GURMENU_NAME' ,DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_MENU.QK_DESC' ,DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_MENU.QK_DESC' ,ENABLED ,PROPERTY_TRUE); --
	 * qk_height := GET_ITEM_PROPERTY('QK_MENU.QK_DESC',HEIGHT); cur_pos :=
	 * (cur_rec - top_rec)*qk_height +39 -15; GO_ITEM('QK_MENU.QK_DESC');
	 * EXECUTE_QUERY; row_count := GET_BLOCK_PROPERTY('QK_MENU',QUERY_HITS); IF
	 * row_count = 0 THEN GO_BLOCK('GUBOBJS'); RETURN; END IF; -- IF cur_rec -
	 * top_rec + row_count > 20 THEN GO_BLOCK('GUBOBJS'); FOR c1_rec IN
	 * 1..row_count + 2 LOOP DOWN; END LOOP; top_rec :=
	 * GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD); cur_pos := (cur_rec -
	 * top_rec)*qk_height +38 ; GO_ITEM('QK_MENU.QK_DESC'); END IF;
	 * SET_VIEW_PROPERTY('MENU_ENTIRE',HEIGHT,row_count*qk_height +15);
	 * SET_VIEW_PROPERTY('MENU_ENTIRE',DISPLAY_Y_POS,cur_pos); -- ELSIF
	 * :FORM_HEADER.OBJECT_TYPE = 'QUICKFLOW' THEN
	 * SET_ITEM_PROPERTY('QK_FLOW.GURCALL_CALL_CODE',DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_FLOW.GURCALL_FORM' ,DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_FLOW.QK_DESC' ,DISPLAYED,PROPERTY_TRUE);
	 * SET_ITEM_PROPERTY('QK_FLOW.QK_DESC' ,ENABLED ,PROPERTY_TRUE); --
	 * SET_ITEM_PROPERTY('QK_MENU.GURMENU_OBJ_NAME' ,DISPLAYED,PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY('QK_MENU.GURMENU_NAME' ,DISPLAYED,PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY('QK_MENU.QK_DESC' ,DISPLAYED,PROPERTY_FALSE); --
	 * qk_height := GET_ITEM_PROPERTY('QK_FLOW.QK_DESC',HEIGHT); cur_pos :=
	 * (cur_rec - top_rec)*qk_height +39 -15; GO_ITEM('QK_FLOW.QK_DESC');
	 * EXECUTE_QUERY; row_count := GET_BLOCK_PROPERTY('QK_FLOW',QUERY_HITS); IF
	 * row_count = 0 THEN GO_BLOCK('GUBOBJS'); RETURN; END IF; -- IF cur_rec -
	 * top_rec + row_count > 20 THEN GO_BLOCK('GUBOBJS'); FOR c1_rec IN
	 * 1..row_count + 2 LOOP DOWN; END LOOP; top_rec :=
	 * GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD); cur_pos := (cur_rec -
	 * top_rec)*qk_height +38 ; GO_ITEM('QK_FLOW.QK_DESC'); END IF;
	 * SET_VIEW_PROPERTY('MENU_ENTIRE',HEIGHT,row_count*qk_height +15);
	 * SET_VIEW_PROPERTY('MENU_ENTIRE',DISPLAY_Y_POS,cur_pos); ELSE RETURN; END
	 * IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-LISTVAL", function = KeyFunction.LIST_VALUES)
	public void listValues() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NNumber qkHeight= NNumber.getNull();
		 NNumber rowCount= NNumber.getNull();
		 NNumber curPos= NNumber.getNull();
		 NNumber rowPos= NNumber.getNull();
//		 NNumber topRec = SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD);
		 NNumber topRec = null;
		 NNumber curRec = toNumber(getTriggerRecord());
		 if ( getFormModel().getBusinessObject("FORM_HEADER").getValue("OBJECT_TYPE").equals("MENU") )
		 {
		 setItemVisible("QK_FLOW.GURCALL_CALL_CODE", false);
		 setItemVisible("QK_FLOW.GURCALL_FORM", false);
		 setItemVisible("QK_FLOW.QK_DESC", false);
		 //
		 setItemVisible("QK_MENU.GURMENU_OBJ_NAME", true);
		 setItemVisible("QK_MENU.GURMENU_NAME", true);
		 setItemVisible("QK_MENU.QK_DESC", true);
		 setItemEnabled("QK_MENU.QK_DESC", true);
		// //
		 qkHeight = toNumber(getItemHeight("QK_MENU.QK_DESC"));
		 curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(39).subtract(15);
		 goItem(toStr("QK_MENU.QK_DESC"));
		 executeQuery();
		 rowCount = toNumber(getBlockQueryHits("QK_MENU"));
		 if ( rowCount.equals(0) )
		 {
		 goBlock(toStr("GUBOBJS"));
		 return ;
		 }
		// //
		 if ( curRec.subtract(topRec).add(rowCount).greater(20) )
		 {
		 goBlock(toStr("GUBOBJS"));
		 for ( int c1Rec = 1; c1Rec <= rowCount.add(2).toInt32(); c1Rec++ )
		 {
		 down();
		 }
		// // F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//		topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD));
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
		//
//		 curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(38);
		 goItem(toStr("QK_MENU.QK_DESC"));
		 }
		// // F2J_NOT_SUPPORTED : The property "VIEW's HEIGHT" is not supported.
		// See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//		SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Property.HEIGHT, rowCount.multiply(qkHeight).add(15));
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
		//
		// // F2J_NOT_SUPPORTED : The property "VIEW's DISPLAY_Y_POS" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//		SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Constants.DISPLAY_Y_POS, curPos);
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's DISPLAY_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
		//
		 }
		 else if (
				 getFormModel().getBusinessObject("FORM_HEADER").getValue("OBJECT_TYPE").equals("QUICKFLOW") )
		 {
		 setItemVisible("QK_FLOW.GURCALL_CALL_CODE", true);
		 setItemVisible("QK_FLOW.GURCALL_FORM", true);
		 setItemVisible("QK_FLOW.QK_DESC", true);
		 setItemEnabled("QK_FLOW.QK_DESC", true);
		 //
		 setItemVisible("QK_MENU.GURMENU_OBJ_NAME", false);
		 setItemVisible("QK_MENU.GURMENU_NAME", false);
		 setItemVisible("QK_MENU.QK_DESC", false);
		 //
		 qkHeight = toNumber(getItemHeight("QK_FLOW.QK_DESC"));
		 curPos =
		 (curRec.subtract(topRec)).multiply(qkHeight).add(39).subtract(15);
		 goItem(toStr("QK_FLOW.QK_DESC"));
		 executeQuery();
		 rowCount = toNumber(getBlockQueryHits("QK_FLOW"));
		 if ( rowCount.equals(0) )
		 {
		 goBlock(toStr("GUBOBJS"));
		 return ;
		 }
		 //
		 if ( curRec.subtract(topRec).add(rowCount).greater(20) )
		 {
		 goBlock(toStr("GUBOBJS"));
		 for ( int c1Rec = 1; c1Rec <= rowCount.add(2).toInt32(); c1Rec++ )
		 {
		 down();
		 }
		// // F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//		  topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD));
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
		//
//		 curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(38);
		 goItem(toStr("QK_FLOW.QK_DESC"));
		 }
		// // F2J_NOT_SUPPORTED : The property "VIEW's HEIGHT" is not supported.
		// See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//		  SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Property.HEIGHT, rowCount.multiply(qkHeight).add(15));
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
		//
		// // F2J_NOT_SUPPORTED : The property "VIEW's DISPLAY_Y_POS" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//		  SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Constants.DISPLAY_Y_POS, curPos);
		// ////
		// System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's DISPLAY_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
		//
		 }
		 else {
		 return ;
		 }
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_ListValues is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-NXTBLK
	 * PREVIOUS_BLOCK;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void nextBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		goItem(toStr("GURMENU.GURMENU_OBJ_NAME"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_NextBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-PRVBLK
	 * GO_ITEM('FORM_HEADER.OBJECT_TYPE');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void previousBlock() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 goItem(toStr("FORM_HEADER.OBJECT_TYPE"));
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-ENTQRY BEGIN
	 * ENTER_QUERY; -- 1-HBN4V :FORM_HEADER.INITIAL_QUERY := 'N'; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void search() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 enterQuery();
		// // 1-HBN4V
		 
//		 getFormModel().getFormHeader().setInitialQuery(toStr("N"));
		 getFormModel().getBusinessObject("FORM_HEADER").setValue("INITIAL_QUERY","N");

		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_Search is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-EXEQRY BEGIN
	 * EXECUTE_QUERY; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GUBOBJS_TYPE.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void executeQuery() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 TaskServices.executeQuery();
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");

	}

}
