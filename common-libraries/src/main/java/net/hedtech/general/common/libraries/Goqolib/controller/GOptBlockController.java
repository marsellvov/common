package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;

import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;

		
public class GOptBlockController extends AbstractSupportCodeObject {

	public GOptBlockController(ISupportCodeContainer container) {
		super(container);
	}			
		
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.WHEN_OPT_BLOCK_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gOptBlock_blockChange()
		{
			
			getContainer().getGoqrpls().getGGoqolibOptBlock().whenOptBlockInst();

				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-PRVREC
		 G$_GOQOLIB_OPT_BLOCK.KEY_NXT_PRV_REC;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gOptBlock_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().keyNxtPrvRec();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-NXTREC
		 G$_GOQOLIB_OPT_BLOCK.KEY_NXT_PRV_REC;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gOptBlock_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().keyNxtPrvRec();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.POST-TEXT-ITEM
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void gOptBlock_itemOut()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_itemOut is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.PRE-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gOptBlock_blockIn()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_blockIn is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.POST-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gOptBlock_blockOut()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_blockOut is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-DOWN
		 DO_KEY('NEXT_ITEM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gOptBlock_MoveDown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				executeAction("NEXT_ITEM");
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_MoveDown is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-UP
		 DO_KEY('PREVIOUS_ITEM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gOptBlock_MoveUp()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				executeAction("PREVIOUS_ITEM");
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_MoveUp is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-NXTBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gOptBlock_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_OPT_BLOCK.KEY-PRVBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_OPT_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gOptBlock_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().gInvalidFunctionMsg();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.gOptBlock_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_A_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_A_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_A_DESC")
		public void selectADesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectADesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_A_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_A_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_A_DESC")
		public void selectADesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectADesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_A_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_A_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_A_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectADesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectADesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_B_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_B_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_B_DESC")
		public void selectBDesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectBDesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_B_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_B_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_B_DESC")
		public void selectBDesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectBDesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_B_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_B_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_B_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectBDesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectBDesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_C_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_C_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_C_DESC")
		public void selectCDesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectCDesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_C_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_C_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_C_DESC")
		public void selectCDesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectCDesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_C_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_C_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_C_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectCDesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectCDesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_D_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_D_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_D_DESC")
		public void selectDDesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectDDesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_D_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_D_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_D_DESC")
		public void selectDDesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectDDesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_D_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_D_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_D_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectDDesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectDDesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_E_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_E_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_E_DESC")
		public void selectEDesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectEDesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_E_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_E_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_E_DESC")
		public void selectEDesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectEDesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_E_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_E_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_E_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectEDesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectEDesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_F_DESC.WHEN-MOUSE-CLICK
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_MOUSE_CLICKED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_F_DESC.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_F_DESC")
		public void selectFDesc_click()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenMouseClicked();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectFDesc_click is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_F_DESC.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_BTN_PRESSED;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_F_DESC.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_F_DESC")
		public void selectFDesc_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenBtnPressed();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectFDesc_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_F_DESC.WHEN-NEW-ITEM-INSTANCE
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_F_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SELECT_F_DESC", function=KeyFunction.ITEM_CHANGE)
		public void selectFDesc_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkWhenNewItemInst();
//
//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.selectFDesc_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER OPT_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 G$_GOQOLIB_OPT_BLOCK.HYPERLINK_CANCEL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OPT_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OPT_CANCEL_BTN")
		public void optCancelBtn_buttonClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
				//Morphis TODO edited by jpb 
				getContainer().getGoqrpls().getGGoqolibOptBlock().hyperlinkCancel();

//				System.err.println("F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GOptBlockController.optCancelBtn_buttonClick is not completely migrated yet. Please read the Migration Guide.");
				
			}

		
	
	
}

