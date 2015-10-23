package net.hedtech.general.common.libraries.Goqolib.services;

import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.model.ValueSet;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.BlockServices;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.web.message.BlockRecord;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;


public class GurmenuType extends AbstractSupportCodeObject{

	public GurmenuType(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart) super.getContainer();
	}
	
	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.WHEN-MOUSE-DOUBLECLICK
	 * DECLARE lv_block_name VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK; BEGIN IF
	 * NAME_IN(lv_block_name||'.DISPLAY_DESC') IS NOT NULL AND
	 * NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME')IS NOT NULL THEN IF
	 * :SYSTEM.MOUSE_BUTTON_SHIFT_STATE = 'Ctrl+' THEN NULL; ELSE
	 * G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE('DELETE',
	 * lv_block_name||'.GURMENU_OBJ_NAME', lv_block_name||'.GURMENU_COUNT'); END
	 * IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK")
	public void whenMouseDoubleclick() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCursorBlock();
		 if ( !getNameIn(lvBlockName.append(".DISPLAY_DESC")).isNull() && !getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
		 {
//		 if ( SupportClasses.AppContext.MouseButtonShiftState.equals("Ctrl+")
//		 )
//		 {
		 // F2N_TODO: The above condition uses unsupported features. You
//		 should eliminate all references to SupportClasses.
//		 }
//		 else {
		 getContainer().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(toStr("DELETE"),
		 lvBlockName.append(".GURMENU_OBJ_NAME"),
		 lvBlockName.append(".GURMENU_COUNT"));
		 }
		 }
//		 }
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_WhenMouseDoubleclick is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.PRE-UPDATE DECLARE
	 * lv_block_name VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK; BEGIN
	 * COPY(NAME_IN('SYSTEM.TRIGGER_RECORD'),lv_block_name||'.GURMENU_SORT_SEQ
	 * '); COPY(NAME_IN('USER'),lv_block_name||'.GURMENU_USER_ID');
	 * COPY(NAME_IN('SYSDATE'),lv_block_name||'.GURMENU_ACTIVITY_DATE'); --
	 * EXECUTE_TRIGGER('CHK_DESC'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('SET_DESC'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@BeforeRowUpdate
	public void beforeRowUpdate(RowAdapterEvent args) {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCurrentBlock();
		 copy(getTriggerRecord(),lvBlockName.append(".GURMENU_SORT_SEQ "));
		 copy(getNameIn("USER"),lvBlockName.append(".GURMENU_USER_ID"));
		 copy(getNameIn("SYSDATE"),lvBlockName.append(".GURMENU_ACTIVITY_DATE"));
		 //
		 executeAction("CHK_DESC");
		 getContainer().getGoqrpls().gCheckFailure();
		 executeAction("SET_DESC");
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_BeforeRowUpdate is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-CREREC DECLARE
	 * lv_block_name VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK; BEGIN CREATE_RECORD;
	 * COPY('',lv_block_name||'.DISPLAY_DESC'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void createRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCursorBlock();
		 BlockServices.createRecord();
		 copy("",lvBlockName.append(".DISPLAY_DESC"));
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-DELREC
	 * DELETE_RECORD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void deleteRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 BlockServices.deleteRecord();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-NEXT-ITEM
	 * NEXT_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NEXT-ITEM", function = KeyFunction.NEXT_ITEM)
	public void keyNexItem() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 nextItem();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-NXTREC DOWN;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void nextRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 down();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_NextRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-PREV-ITEM
	 * PREVIOUS_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PREV-ITEM", function = KeyFunction.PREVIOUS_ITEM)
	public void previousItem() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 previousItem();
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_PreviousItem is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-PRVREC BEGIN IF
	 * :SYSTEM.CURSOR_RECORD = '1' THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0039','FORM','*WARNING* At first record.'));
	 * ELSE UP; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void previousRecord() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 if ( getCursorRecord().equals("1") )
		 {
		 warningMessage(GNls.Fget(toStr("GOQOLIB-0039"), toStr("FORM"),
		 toStr("*WARNING* At first record.")));
		 }
		 else {
		 up();
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.CHK_DESC DECLARE
	 * lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK; BEGIN IF
	 * NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME') IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0040','FORM','*ERROR* Object name must be
	 * entered.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * NAME_IN(lv_block_name||'.DISPLAY_DESC') IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQOLIB-0041','FORM','*ERROR* Description must be
	 * entered.')); RAISE FORM_TRIGGER_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.CHK_DESC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CHK_DESC")
	public void chkDesc() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCurrentBlock();
		 if ( getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
		 {
			 errorMessage(GNls.Fget(toStr("GOQOLIB-0040"), toStr("FORM"),
		 toStr("*ERROR* Object name must be entered.")));
		 throw new ApplicationException();
		 }
		 //
		 if ( getNameIn(lvBlockName.append(".DISPLAY_DESC")).isNull() )
		 {
			 errorMessage(GNls.Fget(toStr("GOQOLIB-0041"), toStr("FORM"),
		 toStr("*ERROR* Description must be entered.")));
		 throw new ApplicationException();
		 }
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ChkDesc is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.CLEAR_GROUP DECLARE
	 * rg_name VARCHAR2(20):= 'DELETE'; rg_id RECORDGROUP :=
	 * FIND_GROUP(rg_name); -- lv_block_name VARCHAR2(30) :=
	 * :SYSTEM.CURRENT_BLOCK; BEGIN IF NOT ID_NULL(rg_id) THEN IF
	 * TO_NUMBER(Get_Group_Row_Count(rg_id)) > 0 THEN
	 * DELETE_GROUP_ROW(rg_id,ALL_ROWS); END IF; -- FIRST_RECORD; LOOP
	 * SET_ITEM_INSTANCE_PROPERTY(lv_block_name||
	 * '.GURMENU_OBJ_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
	 * SET_ITEM_INSTANCE_PROPERTY(lv_block_name||'.DISPLAY_DESC',
	 * CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT'); EXIT WHEN
	 * :SYSTEM.LAST_RECORD = 'TRUE'; NEXT_RECORD; END LOOP; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.CLEAR_GROUP
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "CLEAR_GROUP")
	public void clearGroup() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString rgName = toStr("DELETE");
		 ValueSet rgId = findGroup(rgName);
		 //
		 NString lvBlockName = getCurrentBlock();
		 if ( !(rgId == null) )
		 {
		 if ( toNumber(getGroupRowCount(rgId)).greater(0) )
		 {
		 deleteGroupRow(rgId, ValueSet.ALL_ROWS);
		 }
		 //
		 firstRecord();
		 while (true) {
		 setItemStyleClass(lvBlockName.append(".GURMENU_OBJ_NAME"),
		 ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
		 setItemStyleClass(lvBlockName.append(".DISPLAY_DESC"),
		 ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
		 if ( isInLastRecord() )
		 break;
		 nextRecord();
		 }
		 }
		 }
		//
		this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ClearGroup is not completely migrated yet. Please read the Migration Guide.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.OBJ_DESC DECLARE
	 * lv_block_name VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK; hold_desc
	 * VARCHAR2(100); hold_menu_desc VARCHAR2(100); obj_type VARCHAR2(30);
	 * menu_obj_name VARCHAR2(61) :=
	 * NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME'); -- CURSOR obj_desc_c (p_obj
	 * VARCHAR2) IS SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE FROM GUBOBJS WHERE
	 * GUBOBJS_NAME = p_obj; -- BEGIN OPEN obj_desc_c(menu_obj_name); FETCH
	 * obj_desc_c INTO hold_desc, obj_type; CLOSE obj_desc_c; -- IF
	 * NAME_IN(lv_block_name||'.GURMENU_DESC') IS NOT NULL THEN
	 * COPY(NAME_IN(lv_block_name
	 * ||'.GURMENU_DESC'),lv_block_name||'.DISPLAY_DESC'); hold_menu_desc :=
	 * NAME_IN(lv_block_name||'.GURMENU_DESC'); END IF; -- IF hold_desc IS NOT
	 * NULL THEN COPY(hold_desc,lv_block_name||'.HOLD_DESC'); COPY(obj_type
	 * ,lv_block_name||'.OBJ_TYPE'); IF hold_menu_desc IS NULL THEN
	 * COPY(hold_desc,lv_block_name||'.DISPLAY_DESC');
	 * COPY(hold_desc,lv_block_name||'.GURMENU_DESC'); END IF; ELSE COPY('**
	 * Invalid object **',lv_block_name||'.HOLD_DESC'); COPY('** Invalid object
	 * **',lv_block_name||'.DISPLAY_DESC'); COPY('',lv_block_name||'.OBJ_TYPE');
	 * COPY('',lv_block_name||'.GURMENU_DESC'); END IF; -- IF
	 * NAME_IN(lv_block_name||'.GURMENU_DESC') IS NULL THEN
	 * COPY(NAME_IN(lv_block_name
	 * ||'.HOLD_DESC'),lv_block_name||'.DISPLAY_DESC'); IF :SYSTEM.MODE <>
	 * 'QUERY' THEN COPY('',lv_block_name||'.GURMENU_DESC'); END IF; END IF; --
	 * COPY(TO_CHAR(G$_MULTI_REC_SELECTION.Unique_Counter),lv_block_name||
	 * '.GURMENU_COUNT'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.OBJ_DESC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "OBJ_DESC")
	public void objDesc() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 int rowCount = 0;
		 {
		 NString lvBlockName = getCurrentBlock();
		 NString holdDesc= NString.getNull();
		 NString holdMenuDesc= NString.getNull();
		 NString objType= NString.getNull();
		 NString menuObjName =
		 getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME"));
		 String sqlobjDescC = "SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE " +
		 " FROM GUBOBJS " +
		 " WHERE GUBOBJS_NAME = :P_P_OBJ ";
		 DataCursor objDescC = new DataCursor(sqlobjDescC);
		 NString pObj = NString.getNull();
		 try {
		 pObj=menuObjName;
		 //Setting query parameters
		 objDescC.addParameter("P_P_OBJ", pObj);
		 //F2J_WARNING : Make sure that the method "Close" is being called
//		 over the variable objDescC.
		 objDescC.open();
		 ResultSet objDescCResults = objDescC.fetchInto();
		 if ( objDescCResults != null ) {
		 holdDesc = objDescCResults.getStr(0);
		 objType = objDescCResults.getStr(1);
		 }
		 objDescC.close();
		 //
		 if ( !getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
		 {
		 copy(getNameIn(lvBlockName.append(".GURMENU_DESC")),lvBlockName.append(".DISPLAY_DESC"));
		 holdMenuDesc = getNameIn(lvBlockName.append(".GURMENU_DESC"));
		 }
		 //
		 if ( !holdDesc.isNull() )
		 {
		 copy(holdDesc,lvBlockName.append(".HOLD_DESC"));
		 copy(objType,lvBlockName.append(".OBJ_TYPE"));
		 if ( holdMenuDesc.isNull() )
		 {
		 copy(holdDesc,lvBlockName.append(".DISPLAY_DESC"));
		 copy(holdDesc,lvBlockName.append(".GURMENU_DESC"));
		 }
		 }
		 else {
		 copy("** Invalid object **",lvBlockName.append(".HOLD_DESC"));
		 copy("** Invalid object **",lvBlockName.append(".DISPLAY_DESC"));
		 copy("",lvBlockName.append(".OBJ_TYPE"));
		 copy("",lvBlockName.append(".GURMENU_DESC"));
		 }
		 //
		 if ( getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
		 {
		 copy(getNameIn(lvBlockName.append(".HOLD_DESC")),lvBlockName.append(".DISPLAY_DESC"));
		 if ( !getMode().equals("QUERY") )
		 {
		 copy("",lvBlockName.append(".GURMENU_DESC"));
		 }
		 }
		 //
		 copy(toChar(getContainer().getGoqgmnu().getGMultiRecSelection().uniqueCounter()),lvBlockName.append(".GURMENU_COUNT"));
		 }
		 finally{
		 objDescC.close();
		 }
		 }
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ObjDesc is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.SET_DESC DECLARE
	 * lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK; BEGIN IF
	 * NAME_IN(lv_block_name||'.HOLD_DESC') IS NOT NULL THEN IF
	 * NAME_IN(lv_block_name||'.HOLD_DESC') <>
	 * NAME_IN(lv_block_name||'.DISPLAY_DESC') THEN
	 * COPY(NAME_IN(lv_block_name||'.DISPLAY_DESC'),lv_block_name||'.GURMENU_DESC');
	 * ELSE COPY('',lv_block_name||'.GURMENU_DESC'); END IF; ELSE
	 * COPY(NAME_IN(lv_block_name
	 * ||'.DISPLAY_DESC'),lv_block_name||'.GURMENU_DESC'); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.SET_DESC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SET_DESC")
	public void setDesc() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCurrentBlock();
		 if ( !getNameIn(lvBlockName.append(".HOLD_DESC")).isNull() )
		 {
		 if (
		 getNameIn(lvBlockName.append(".HOLD_DESC")).notEquals(getNameIn(lvBlockName.append(".DISPLAY_DESC")))
		 )
		 {
		 copy(getNameIn(lvBlockName.append(".DISPLAY_DESC")),lvBlockName.append(".GURMENU_DESC"));
		 }
		 else {
		 copy("",lvBlockName.append(".GURMENU_DESC"));
		 }
		 }
		 else {
		 copy(getNameIn(lvBlockName.append(".DISPLAY_DESC")),lvBlockName.append(".GURMENU_DESC"));
		 }
		 }
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_SetDesc is not completely migrated yet. Please read the Migration Guide.");

	}

	/*
	 * Original PL/SQL code code for TRIGGER GURMENU_TYPE.SORT_SEQ DECLARE
	 * lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK; -- 81-1 increase size
	 * of two local variables below from INTEGER(2) -- 81-1 to INTEGER(4) to
	 * handle up to 10,000 menu entries lv_seq INTEGER(4) := 1; lv_cur_rec
	 * INTEGER(4) := :SYSTEM.CURSOR_RECORD; BEGIN IF :SYSTEM.CURSOR_RECORD = '1'
	 * AND :SYSTEM.LAST_RECORD = 'TRUE' AND
	 * NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME') IS NULL THEN NULL; ELSE
	 * FIRST_RECORD; LOOP COPY(lv_seq,lv_block_name||'.GURMENU_SORT_SEQ'); IF
	 * :SYSTEM.LAST_RECORD = 'TRUE' THEN GO_RECORD(lv_cur_rec); EXIT; ELSE
	 * lv_seq := lv_seq + 1; NEXT_RECORD; END IF; END LOOP; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GURMENU_TYPE.SORT_SEQ
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "SORT_SEQ")
	public void sortSeq() {

		// F2J_WRAPPED_CODE : The code of this Trigger was commented out so that
		// you can migrate, compile and check your code in an iterative way.
		//
		 {
		 NString lvBlockName = getCurrentBlock();
		 // 81-1 increase size of two local variables below from INTEGER(2)
		 // 81-1 to INTEGER(4) to handle up to 10,000 menu entries
		 NInteger lvSeq = toInt(1);
		 NInteger lvCurRec = toInt(getCursorRecord());
		 if ( getCursorRecord().equals("1") && isInLastRecord() &&
		 getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
		 {
		 }
		 else {
		 firstRecord();
		 while (true) {
		 copy(lvSeq,lvBlockName.append(".GURMENU_SORT_SEQ"));
		 if ( isInLastRecord() )
		 {
		 setCurrentRecord(lvCurRec);
		 break;
		 }
		 else {
		 lvSeq = lvSeq.add(1);
		 nextRecord();
		 }
		 }
		 }
		 }
		//
//		System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_SortSeq is not completely migrated yet. Please read the Migration Guide.");

	}

}
