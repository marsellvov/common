package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.ValueSetServices;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;

public class GExtendedSearchBlockController extends AbstractSupportCodeObject {

	public GExtendedSearchBlockController(ISupportCodeContainer container) {
		super(container);
	}
	
	private GoqolibFormController goqolibFormController(){
		return (net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController) this.getContainer().getSupportCodeManager().getPackage("GOQOLIB");
	}
	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this
				.getContainer().getSupportCodeManager()
				.getPackage("G$_CODE_CLASS");
	}
		
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
	@ActionTrigger(action="LIST_VALUES", item="IDNAME_EXTSEARCH_LIST", function=KeyFunction.LIST_VALUES)
	public void idExtSearchList(){		
		if (Task.getCurrent().showLov("G$_EXT_SEARCH_LOV"))
			getContainer().getGoqrpls().getGIdnameSearch().copySelectedId();
	}
	
	
	@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="IDNAME_EXTSEARCH_BTN")
	public void idExtSearchListBtn_WhenButtonPressed(){
		goItem("G$_EXTENDED_SEARCH_BLOCK", "IDNAME_EXTSEARCH_LIST");
		TaskServices.getCurrentTask().getNavigationModel().doNavigation();
		if (Task.getCurrent().showLov("G$_EXT_SEARCH_LOV"))
			getContainer().getGoqrpls().getGIdnameSearch().copySelectedId();
	}
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.PRE-BLOCK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gExtendedSearchBlock_blockIn()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gExtendedSearchBlock_blockOut()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				ItemServices.setItemValue("CHECK_KEYS", toStr("N"));
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_blockOut is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_NEW_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gExtendedSearchBlock_blockChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenNewBlock();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_blockChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_NEW_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void gExtendedSearchBlock_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenNewItem();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_BUTTON_PRESSED;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void gExtendedSearchBlock_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenButtonPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-CLRBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void gExtendedSearchBlock_keyClearBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_keyClearBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-CLRREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gExtendedSearchBlock_ClearRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_ClearRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-COMMIT
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gExtendedSearchBlock_Save()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_Save is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-CQUERY
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void gExtendedSearchBlock_TotalResults()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_TotalResults is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-CREREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gExtendedSearchBlock_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-DELREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gExtendedSearchBlock_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-DOWN
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gExtendedSearchBlock_MoveDown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_MoveDown is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-DUP-ITEM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void gExtendedSearchBlock_KeyDupItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyDupItem is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-DUPREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gExtendedSearchBlock_CopyRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_CopyRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-ENTQRY
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_CLEAR_BUTTON_PRESSED;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gExtendedSearchBlock_Search()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenClearButtonPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_Search is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-EXEQRY
		 BEGIN
  G$_IDNAME_SEARCH.NARROW_SEARCH_GROUP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gExtendedSearchBlock_ExecuteQuery()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().narrowSearchGroup();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-EXIT
		 G$_IDNAME_SEARCH.COPY_SELECTED_ID;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gExtendedSearchBlock_Exit()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().copySelectedId();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_Exit is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-F0
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-F0
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void gExtendedSearchBlock_F0()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_F0 is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-MENU
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void gExtendedSearchBlock_KeyMenu()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyMenu is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-NXTBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gExtendedSearchBlock_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-NXTKEY
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void gExtendedSearchBlock_KeyNxtkey()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyNxtkey is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-NXTSET
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void gExtendedSearchBlock_KeyNxtset()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyNxtset is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-NXTREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gExtendedSearchBlock_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-PRVBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gExtendedSearchBlock_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-PRVREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gExtendedSearchBlock_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-SCRDOWN
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void gExtendedSearchBlock_KeyScrdown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyScrdown is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-SCRUP
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void gExtendedSearchBlock_KeyScrup()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyScrup is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-UP
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gExtendedSearchBlock_MoveUp()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_MoveUp is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_EXTENDED_SEARCH_BLOCK.KEY-UPDREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-UPDREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UPDREC")
		public void gExtendedSearchBlock_KeyUpdrec()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.gExtendedSearchBlock_KeyUpdrec is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER IDNAME_EXTSEARCH_LIST.WHEN-LIST-CHANGED
		 BEGIN
  G$_IDNAME_SEARCH.COPY_SELECTED_ID;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNAME_EXTSEARCH_LIST.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="IDNAME_EXTSEARCH_LIST")
		public void idnameExtsearchList_listChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().copySelectedId();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.idnameExtsearchList_listChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER IDNAME_EXTSEARCH_LIST.KEY-PREV-ITEM
		 BEGIN
  GO_ITEM('SR_SPBPERS_SEX');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNAME_EXTSEARCH_LIST.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="IDNAME_EXTSEARCH_LIST", function=KeyFunction.PREVIOUS_ITEM)
		public void idnameExtsearchList_PreviousItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				goItem(toStr("SR_SPBPERS_SEX"));
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.idnameExtsearchList_PreviousItem is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER PERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_IDNAME_SEARCH.DETAIL_BTN_PRESSED;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PERSON_DETAIL_BTN")
		public void personDetailBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
			getContainer().getGoqrpls().getGIdnameSearch().detailBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.personDetailBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER NPERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_IDNAME_SEARCH.DETAIL_BTN_PRESSED;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NPERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NPERSON_DETAIL_BTN")
		public void npersonDetailBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().detailBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.npersonDetailBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SEARCH_GROUP.WHEN-RADIO-CHANGED
		 BEGIN
 G$_IDNAME_SEARCH.NARROW_SEARCH_GROUP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_GROUP.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="SEARCH_GROUP")
		public void searchGroup_radioGroupChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().narrowSearchGroup();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.searchGroup_radioGroupChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SR_SPRADDR_STAT_CODE")
		public void srSpraddrStatCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void srSpraddrStatCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void srSpraddrStatCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void srSpraddrStatCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void srSpraddrStatCode_keyNexItem()
		{
			
			getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void srSpraddrStatCode_itemOut()
		{
			
			getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPRADDR_ZIP.KEY-LISTVAL
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_BUTTON_PRESSED;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SR_SPRADDR_ZIP", function=KeyFunction.LIST_VALUES)
		public void srSpraddrZip_ListValues()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenButtonPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpraddrZip_ListValues is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SR_SPRIDEN_NTYP_CODE")
		public void srSpridenNtypCode_doubleClick()
		{
			
			getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void srSpridenNtypCode_itemChange()
		{
			
			getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void srSpridenNtypCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void srSpridenNtypCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void srSpridenNtypCode_keyNexItem()
		{
			
			getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void srSpridenNtypCode_itemOut()
		{
			
			getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_NEW_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPBPERS_SSN", function=KeyFunction.ITEM_CHANGE)
		public void srSpbpersSsn_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenNewItem();
				getContainer().getGoqrpls().gCheckFailure();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpbpersSsn_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPBPERS_BIRTH_DATE.KEY-NEXT-ITEM
		 BEGIN
  IF INSTR(:SR_SPBPERS_BIRTH_DATE,'%') > 0 OR
     INSTR(:SR_SPBPERS_BIRTH_DATE,'_') > 0 THEN
    NULL;
  ELSE
    G$_DATE_REFORMAT('','');
    G$_CHECK_FAILURE;
  END IF;
--
  NEXT_FIELD;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPBPERS_BIRTH_DATE", function=KeyFunction.NEXT_ITEM)
		public void srSpbpersBirthDate_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				if ( inStr(getFormModel().getGExtendedSearchBlock().getSrSpbpersBirthDate(), toStr("%")).greater(0) || inStr(getFormModel().getGExtendedSearchBlock().getSrSpbpersBirthDate(), toStr("_")).greater(0) )
				{
				}
				else {

					getContainer().getGoqrpls().gCheckFailure();
				}
				// 
				nextItem();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpbpersBirthDate_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPBPERS_BIRTH_DATE.POST-CHANGE
		 BEGIN
  IF INSTR(:SR_SPBPERS_BIRTH_DATE,'%') > 0 OR
     INSTR(:SR_SPBPERS_BIRTH_DATE,'_') > 0 THEN
    RETURN;
  END IF;
--
  G$_DATE_REFORMAT('','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SR_SPBPERS_BIRTH_DATE")
		public void srSpbpersBirthDate_PostChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				if ( inStr(getFormModel().getGExtendedSearchBlock().getSrSpbpersBirthDate(), toStr("%")).greater(0) || inStr(getFormModel().getGExtendedSearchBlock().getSrSpbpersBirthDate(), toStr("_")).greater(0) )
				{
					return ;
				}
				// 

				getContainer().getGoqrpls().gCheckFailure();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpbpersBirthDate_PostChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPBPERS_SEX.WHEN-VALIDATE-ITEM
		 G$_IDNAME_SEARCH.WHEN_NEW_ITEM;
IF :SR_SPBPERS_SEX NOT IN ('M','F','N','m','f','n') THEN
   MESSAGE( G$_NLS.Get('GOQOLIB-0000', 'FORM','*ERROR* Invalid code. Valid values are (M)ale, (F)emale, (N)ot available.') ); 
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SEX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SR_SPBPERS_SEX")
		public void srSpbpersSex_validate()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenNewItem();
				if (notIn(getFormModel().getGExtendedSearchBlock().getSrSpbpersSex(), "M", "F", "N", "m", "f", "n").getValue() )
				{
					errorMessage(GNls.Fget(toStr("GOQOLIB-0000"), toStr("FORM"), toStr("*ERROR* Invalid code. Valid values are (M)ale, (F)emale, (N)ot available.")));
					throw new ApplicationException();
				}
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpbpersSex_validate is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPBPERS_SEX.KEY-NEXT-ITEM
		 BEGIN
  GO_ITEM('IDNAME_EXTSEARCH_LIST');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SEX.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPBPERS_SEX", function=KeyFunction.NEXT_ITEM)
		public void srSpbpersSex_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				goItem(toStr("EXTSEARCH_CLEAR_BTN"));
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpbpersSex_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SR_SPRADDR_ZIP_BTN")
		public void srSpraddrZipBtn_click()
		{
			
//				getGoqolibFormController.gFlashliteBtnClass_click();
			goqolibFormController().gFlashliteBtnClass_click();
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPRADDR_ZIP_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_IDNAME_SEARCH.WHEN_BUTTON_PRESSED;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRADDR_ZIP_BTN")
		public void srSpraddrZipBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().whenButtonPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpraddrZipBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPRADDR_STAT_CODE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  GO_ITEM('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE');
  G$_CHECK_FAILURE;
  G$_DISPLAY_LOV('','');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRADDR_STAT_CODE_BTN")
		public void srSpraddrStatCodeBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				goItem(toStr("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE"));
				getContainer().getGoqrpls().gCheckFailure();
				getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpraddrStatCodeBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SR_SPRIDEN_NTYP_CODE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  GO_ITEM('G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE');
  G$_CHECK_FAILURE;
  G$_DISPLAY_LOV('','');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRIDEN_NTYP_CODE_BTN")
		public void srSpridenNtypCodeBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				goItem(toStr("G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE"));
				getContainer().getGoqrpls().gCheckFailure();
				getContainer().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.srSpridenNtypCodeBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NARROW_SEARCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NARROW_SEARCH_BTN")
		public void narrowSearchBtn_click()
		{
			
			goqolibFormController().gFlashliteBtnClass_click();
			}

		
		/* Original PL/SQL code code for TRIGGER NARROW_SEARCH_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_IDNAME_SEARCH.NARROW_SEARCH_GROUP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NARROW_SEARCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NARROW_SEARCH_BTN")
		public void narrowSearchBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGIdnameSearch().narrowSearchGroup();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.narrowSearchBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER EXTSEARCH_CLEAR_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  DO_KEY('ENTER_QUERY');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXTSEARCH_CLEAR_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EXTSEARCH_CLEAR_BTN")
		public void extsearchClearBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				executeAction("SEARCH");
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController.extsearchClearBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SR_SPBPERS_BIRTH_DATE")
		public void srSpbpersBirthDate_validate()
		{
			

							this.srSpbpersBirthDate_PostChange();

			}

		public void srSpridenNtypCodeBtn_click() {
			// TODO Auto-generated method stub
			
		}

		public void extsearchClearBtn_click() {
			// TODO Auto-generated method stub
			
		}

		public void personDetailBtn_click() {
			// TODO Auto-generated method stub
			
		}

		public void npersonDetailBtn_click() {
			// TODO Auto-generated method stub
			
		}

		public void srSpraddrStatCodeBtn_click() {
			// TODO Auto-generated method stub
			
		}

		
	
	
}

