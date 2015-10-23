package net.hedtech.banner.general.common.Gutpmnu.controller;
 
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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class AllUsersBlockController extends DefaultBlockController {

	//Cabanas
	public AllUsersBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GutpmnuTask getTask() {
		return (GutpmnuTask)super.getTask();
	}

	public GutpmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.PRE-BLOCK
		 BEGIN 
  SET_ITEM_PROPERTY('ALL_USERS_BTN', ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('INSERT_BTN',    ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('DELETE_BTN',    ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('INSERT_ALL_BTN',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('DELETE_ALL_BTN',ENABLED,PROPERTY_FALSE);
--
  SET_ITEM_PROPERTY('USER_SEARCH',VISIBLE,PROPERTY_TRUE); 
  SET_ITEM_PROPERTY('USER_SEARCH',ENABLED,PROPERTY_TRUE); 
  SET_ITEM_PROPERTY('USER_SEARCH',NAVIGABLE,PROPERTY_TRUE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void allUsersBlock_blockIn()
		{
			
				setItemEnabled("ALL_USERS_BTN", false);
				setItemEnabled("INSERT_BTN", false);
				setItemEnabled("DELETE_BTN", false);
				setItemEnabled("INSERT_ALL_BTN", false);
				setItemEnabled("DELETE_ALL_BTN", false);
			
				setItemVisible("USER_SEARCH", true);
				setItemEnabled("USER_SEARCH", true);
				setItemNavigable("USER_SEARCH", true);
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 DECLARE
  RG_NAME     VARCHAR2(10):= 'USER_RG';
  RG_ID       RECORDGROUP := FIND_GROUP(RG_NAME);
BEGIN
  IF NOT ID_NULL(RG_ID) THEN
    DELETE_GROUP(RG_ID);
  END IF;
  CLEAR_BLOCK;
  USER_REC_GROUP;
--
-- This logic is used only when the show user button is pressed.  It is intended to navigate
-- to the user search item.
--
  IF NVL(:NAVIGATE_FLAG,'N') = 'Y' THEN
    :NAVIGATE_FLAG := 'N';
    GO_ITEM('USER_SEARCH');
  END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void allUsersBlock_blockChange()
		{
			

			
				AllUsersBlockAdapter allUsersBlockElement = (AllUsersBlockAdapter)this.getFormModel().getAllUsersBlock().getRowAdapter(true);

				if(allUsersBlockElement!=null){

				{
					NString rgName = toStr("USER_RG");
					ValueSet rgId = findGroup(rgName);
					if ( !(rgId == null) )
					{
						deleteGroup(rgId);
					}
					clearBlock();
					this.getTask().getServices().userRecGroup(allUsersBlockElement);
					// 
					//  This logic is used only when the show user button is pressed.  It is intended to navigate
					//  to the user search item.
					// 
					if ( isNull(getFormModel().getFormHeader().getNavigateFlag(), "N").equals("Y") )
					{
						getFormModel().getFormHeader().setNavigateFlag(toStr("N"));
						goItem(toStr("USER_SEARCH"));
					}
				}
			}
		}
		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK")
		public void allUsersBlock_click()
		{
		
		}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.WHEN-MOUSE-DOUBLECLICK
		 DECLARE
  AL_BUTTON NUMBER;
  AL_MSG    VARCHAR2(80);
  RG_NAME   VARCHAR2(10):= 'USER_RG';
  RG_ID     RECORDGROUP := FIND_GROUP(RG_NAME);
  RC_ID     GROUPCOLUMN;
BEGIN
  IF NOT ID_NULL(RG_ID) THEN
    IF :SYSTEM.CURSOR_VALUE IS NOT NULL THEN
      IF NVL(GET_GROUP_CHAR_CELL('USER_RG.FLAG',:SYSTEM.TRIGGER_RECORD),'N')= 'N' THEN
        IF :CUST_USER_ID = GET_GROUP_CHAR_CELL('USER_RG.USER_NAME',:SYSTEM.TRIGGER_RECORD) THEN
          AL_MSG := G$_NLS.Get('GUTPMNU-0035','FORM','*ERROR* You can not copy menu to itself!');
          SET_ALERT_PROPERTY('ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
          AL_BUTTON := SHOW_ALERT('ALERT');
        ELSE
          SET_GROUP_CHAR_CELL('USER_RG.FLAG',:SYSTEM.TRIGGER_RECORD,'Y');
          SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_TEXT');
          NEXT_ITEM;
          SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_TEXT');
          NEXT_ITEM;
        END IF;
      ELSE
        SET_GROUP_CHAR_CELL('USER_RG.FLAG',:SYSTEM.TRIGGER_RECORD,'N');
        SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
        NEXT_ITEM;
        SET_ITEM_INSTANCE_PROPERTY(:SYSTEM.CURRENT_ITEM,CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
        NEXT_ITEM;
      END IF;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void allUsersBlock_doubleClick()
		{
			
				{
					NNumber alButton= NNumber.getNull();
					NString alMsg= NString.getNull();
					NString rgName = toStr("USER_RG");
					ValueSet rgId = findGroup(rgName);
					ValueSetColumn rcId= null;
					if ( !(rgId == null) )
					{
						if ( getCursorValue() != null )
						{
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							if ( isNull(getGroupCharCell("USER_RG.FLAG", toInt(getTriggerRecord())), "N").equals("N") )
							{
								if ( getFormModel().getFormHeader().getCustUserId().equals(getGroupCharCell("USER_RG.USER_NAME", toInt(getTriggerRecord()))) )
								{
									alMsg = GNls.Fget(toStr("GUTPMNU-0035"), toStr("FORM"), toStr("*ERROR* You can not copy menu to itself!"));
									setAlertMessageText("ALERT", alMsg);
									alButton = toNumber(showAlert("ALERT"));
								}
								else {
									setGroupCharCell("USER_RG.FLAG", toInt(getTriggerRecord()), toStr("Y"));
									setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_TEXT");
									setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
									nextItem();
									setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_TEXT");
									setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
									nextItem();
								}
							}
							else {
								setGroupCharCell("USER_RG.FLAG", toInt(getTriggerRecord()), toStr("N"));
								setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
								nextItem();
								setItemStyleClass(getCurrentItem(), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
								nextItem();
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.POST-BLOCK
		 BEGIN
  SET_ITEM_PROPERTY('ALL_USERS_BTN', ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('INSERT_BTN',    ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('DELETE_BTN',    ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('INSERT_ALL_BTN',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('DELETE_ALL_BTN',ENABLED,PROPERTY_TRUE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void allUsersBlock_blockOut()
		{
			
				setItemEnabled("ALL_USERS_BTN", true);
				setItemEnabled("INSERT_BTN", true);
				setItemEnabled("DELETE_BTN", true);
				setItemEnabled("INSERT_ALL_BTN", true);
				setItemEnabled("DELETE_ALL_BTN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-CLRBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void allUsersBlock_keyClearBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-CLRREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void allUsersBlock_ClearRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-COMMIT
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void allUsersBlock_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-CREREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void allUsersBlock_CreateRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-DELREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void allUsersBlock_DeleteRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-ENTER
		 USER_REC_GROUP;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER")
		public void allUsersBlock_KeyEnter()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AllUsersBlockAdapter allUsersBlockElement = (AllUsersBlockAdapter)this.getFormModel().getAllUsersBlock().getRowAdapter(true);

				if(allUsersBlockElement!=null){

				this.getTask().getServices().userRecGroup(allUsersBlockElement);
			}
		}
		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BLOCK.KEY-UPDREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BLOCK.KEY-UPDREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UPDREC")
		public void allUsersBlock_KeyUpdrec()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ID.KEY-NEXT-ITEM
		 BEGIN
  GO_ITEM('USER_SEARCH');
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="USER_ID", function=KeyFunction.NEXT_ITEM)
		public void userId_keyNexItem()
		{
			
				goItem(toStr("USER_SEARCH"));
			}

		
	
	
}

