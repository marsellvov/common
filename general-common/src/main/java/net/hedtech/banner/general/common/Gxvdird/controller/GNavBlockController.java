package net.hedtech.banner.general.common.Gxvdird.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Gxvdird.model.*;
import net.hedtech.banner.general.common.Gxvdird.*;
import net.hedtech.banner.general.common.Gxvdird.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GNavBlockController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController getGoqolibGNavBlockController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAV_BLOCK");
	}	
	
	public GNavBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GxvdirdTask getTask() {
		return (GxvdirdTask)super.getTask();
	}

	public GxvdirdModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gNavBlock_blockIn()
		{
			
				getGoqolibGNavBlockController().gNavBlock_blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gNavBlock_blockChange()
		{
			
				getGoqolibGNavBlockController().gNavBlock_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.CHECK_TYPE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_TYPE")
		public void gNavBlock_CheckType()
		{
			
				getGoqolibGNavBlockController().gNavBlock_CheckType();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.CALL_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_ROUTINE")
		public void gNavBlock_CallRoutine()
		{
			
				getGoqolibGNavBlockController().gNavBlock_CallRoutine();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.INIT_NEXT_SELECTION
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INIT_NEXT_SELECTION")
		public void gNavBlock_InitNextSelection()
		{
			
				getGoqolibGNavBlockController().gNavBlock_InitNextSelection();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GET_EAWTE_MESSAGES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_EAWTE_MESSAGES")
		public void gNavBlock_GetEawteMessages()
		{
			
				getGoqolibGNavBlockController().gNavBlock_GetEawteMessages();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GLO_INIT_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GLO_INIT_ROUTINE")
		public void gNavBlock_GloInitRoutine()
		{
			
				getGoqolibGNavBlockController().gNavBlock_GloInitRoutine();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gNavBlock_ClearTask()
		{
			
				getGoqolibGNavBlockController().gNavBlock_ClearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gNavBlock_ClearRecord()
		{
			
				getGoqolibGNavBlockController().gNavBlock_ClearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gNavBlock_Save()
		{
			
				getGoqolibGNavBlockController().gNavBlock_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gNavBlock_CreateRecord()
		{
			
				getGoqolibGNavBlockController().gNavBlock_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gNavBlock_DeleteRecord()
		{
			
				getGoqolibGNavBlockController().gNavBlock_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gNavBlock_MoveDown()
		{
			
				getGoqolibGNavBlockController().gNavBlock_MoveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void gNavBlock_KeyMenu()
		{
			
				getGoqolibGNavBlockController().gNavBlock_KeyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gNavBlock_NextBlock()
		{
			
				getGoqolibGNavBlockController().gNavBlock_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gNavBlock_NextRecord()
		{
			
				getGoqolibGNavBlockController().gNavBlock_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void gNavBlock_KeyOthers()
		{
			
				getGoqolibGNavBlockController().gNavBlock_KeyOthers();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gNavBlock_PreviousBlock()
		{
			
				getGoqolibGNavBlockController().gNavBlock_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gNavBlock_PreviousRecord()
		{
			
				getGoqolibGNavBlockController().gNavBlock_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gNavBlock_MoveUp()
		{
			
				getGoqolibGNavBlockController().gNavBlock_MoveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GO_ITEM")
		public void goItem_doubleClick()
		{
			
				getGoqolibGNavBlockController().goItem_doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GO_ITEM", function=KeyFunction.ITEM_CHANGE)
		public void goItem_itemChange()
		{
			
				getGoqolibGNavBlockController().goItem_itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('GUBOBJS_NAME','GUBOBJS_DESC');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item = "GO_ITEM")
		public void goItem_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GUBOBJS_NAME"), toStr("GUBOBJS_DESC"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GO_ITEM")
		public void goItem_GSearchOptions()
		{
			
				getGoqolibGNavBlockController().goItem_GSearchOptions();
			}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.KEY-NEXT-ITEM
		 BEGIN
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE( G$_NLS.Get('GXVDIRD-0003', 'FORM','*ERROR* There are pending form changes; Commit or Rollback.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
	IF :G$_NAV_BLOCK.GO_ITEM NOT IN ('EXIT','QUIT') THEN
    G$_SEARCH.CODE_KEY_NEXT_ITEM;
    G$_CHECK_FAILURE;
  END IF;
--
  IF INSTR(:GO_ITEM,'%') >= 1 THEN
    :G$_NAV_BLOCK.GO_ITEM := '';
    RETURN;
  END IF;
--
  :GLOBAL.MENU_NAME_PARM := '';
  EXECUTE_TRIGGER('CHECK_TYPE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GO_ITEM", function=KeyFunction.NEXT_ITEM)
		public void goItem_keyNexItem()
		{
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GXVDIRD-0003"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				if ( !in(getFormModel().getGNavBlock().getGoItem(), "EXIT", "QUIT").getValue() )
				{
					getTask().getGoqrpls().getGSearch().codeKeyNextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
				if ( inStr(getFormModel().getGNavBlock().getGoItem(), toStr("%")).greaterOrEquals(1) )
				{
					getFormModel().getGNavBlock().setGoItem(toStr(""));
					return ;
				}
				setGlobal("MENU_NAME_PARM", toStr(""));
				executeAction("CHECK_TYPE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GO_ITEM", function=KeyFunction.ITEM_OUT)
		public void goItem_itemOut()
		{
			
				getGoqolibGNavBlockController().goItem_itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.KEY-ENTER
		 BEGIN
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE( G$_NLS.Get('GXVDIRD-0004', 'FORM','*ERROR* There are pending form changes; Commit or Rollback.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF INSTR(:G$_NAV_BLOCK.GO_ITEM,'%') >= 1 THEN
    :G$_NAV_BLOCK.GO_ITEM := '';
    RETURN;
  END IF;
--
  EXECUTE_TRIGGER('CHECK_TYPE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER", item="GO_ITEM")
		public void goItem_KeyEnter()
		{
			
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GXVDIRD-0004"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				if ( inStr(getFormModel().getGNavBlock().getGoItem(), toStr("%")).greaterOrEquals(1) )
				{
					getFormModel().getGNavBlock().setGoItem(toStr(""));
					return ;
				}
				executeAction("CHECK_TYPE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GO_ITEM", function=KeyFunction.LIST_VALUES)
		public void goItem_ListValues()
		{
			
				getGoqolibGNavBlockController().goItem_ListValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GO_ITEM_BTN")
		public void goItemBtn_click()
		{
			
				getGoqolibGNavBlockController().goItemBtn_buttonClick();
				
		}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE( G$_NLS.Get('GXVDIRD-0005', 'FORM','*ERROR* There are pending form changes; Commit or Rollback.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIOBJS','');
--
  IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
    COPY(:GLOBAL.MENU_NAME_PARM,'G$_NAV_BLOCK.GO_ITEM');
    :GLOBAL.MENU_NAME_PARM := '';
    GO_ITEM('G$_NAV_BLOCK.GO_ITEM');
    DO_KEY('ENTER');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GO_ITEM_BTN")
		public void goItemBtn_buttonClick()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GXVDIRD-0005"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIOBJS"), toStr(""));
				if ( !getGlobal("MENU_NAME_PARM").isNull() )
				{
					copy(getGlobal("MENU_NAME_PARM"),"G$_NAV_BLOCK.GO_ITEM");
					setGlobal("MENU_NAME_PARM", toStr(""));
					goItem(toStr("G$_NAV_BLOCK.GO_ITEM"));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_MY_INSTITUTION.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_MY_INSTITUTION")
		public void urlMyInstitution_buttonClick()
		{
			
				getGoqolibGNavBlockController().urlMyInstitution_buttonClick();
			}

		
	
	
}
