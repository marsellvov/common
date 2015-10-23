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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FormHeaderController extends DefaultBlockController {


	
	public FormHeaderController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-CLRBLK
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void formHeader_keyClearBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-CLRREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void formHeader_ClearRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-COMMIT
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void formHeader_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-CREREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void formHeader_CreateRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-DELREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void formHeader_DeleteRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-DOWN
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void formHeader_MoveDown()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-DUPREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void formHeader_CopyRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-DUP-ITEM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void formHeader_KeyDupItem()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-ENTQRY
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void formHeader_Search()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-EXEQRY
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void formHeader_ExecuteQuery()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-NXTBLK
		 BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
--
  NEXT_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void formHeader_NextBlock()
		{
			
				executeAction("CHECK_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-NXTKEY
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void formHeader_KeyNxtkey()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-NXTREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void formHeader_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-NXTSET
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void formHeader_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-PRVBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void formHeader_PreviousBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-PRVREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void formHeader_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-SCRDOWN
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void formHeader_KeyScrdown()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-SCRUP
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void formHeader_KeyScrup()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-UP
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void formHeader_MoveUp()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER FORM_HEADER.KEY-UPDREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORM_HEADER.KEY-UPDREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UPDREC")
		public void formHeader_KeyUpdrec()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER CUST_USER_ID.WHEN-NEW-ITEM-INSTANCE
		 DECLARE
  V_NAME VARCHAR2(30);
BEGIN
  USER_ECM_GROUP;
  HIDE_VIEW('USER_VIEW');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CUST_USER_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CUST_USER_ID", function=KeyFunction.ITEM_CHANGE)
		public void custUserId_itemChange()
		{
			
				{
					NString vName= NString.getNull();
					this.getTask().getServices().userEcmGroup();
				//	hideView("USER_VIEW");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER CUST_USER_ID.KEY-NXTBLK
		   IF :FORM_HEADER.CUST_USER_ID IS NULL THEN
  	MESSAGE( G$_NLS.Get('GUTPMNU-0006', 'FORM','*ERROR* User menu has not been queried, invalid function.') );
    GO_ITEM('FORM_HEADER.CUST_USER_ID');
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  GO_BLOCK('GURMENU');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CUST_USER_ID.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="CUST_USER_ID", function=KeyFunction.NEXT_BLOCK)
		public void custUserId_NextBlock()
		{
			
				if ( getFormModel().getFormHeader().getCustUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0006"), toStr("FORM"), toStr("*ERROR* User menu has not been queried, invalid function.")));
					goItem(toStr("FORM_HEADER.CUST_USER_ID"));
					throw new ApplicationException();
				}
				// 
				goBlock(toStr("GURMENU"));
			}

		
		/* Original PL/SQL code code for TRIGGER CUST_USER_ID.WHEN-LIST-CHANGED
		 IF :CUST_USER_ID IS NULL THEN
  MESSAGE( G$_NLS.Get('GUTPMNU-0007', 'FORM','*ERROR* User name must be entered.') );
  RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('GURMENU');
  EXECUTE_QUERY;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CUST_USER_ID.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="CUST_USER_ID")
		public void custUserId_listChange()
		{
//			if(getCurrentBlock().equals("ALL_USERS_BLOCK") || getCurrentBlock().equals("ALL_USERS_BLOCK") ){
//				
//			}else{	
				if ( getFormModel().getFormHeader().getCustUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0007"), toStr("FORM"), toStr("*ERROR* User name must be entered.")));
					throw new ApplicationException();
				}
				else {
					
					goBlock(toStr("GURMENU"));
					executeQuery();
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER USER_SEARCH.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_SEARCH.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="USER_SEARCH")
		public void userSearch_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER USER_SEARCH.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  :SEARCH_CR := :USER_SEARCH;
--
  SET_ITEM_PROPERTY('ALL_USERS_BTN', ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('INSERT_BTN',    ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('DELETE_BTN',    ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('INSERT_ALL_BTN',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('DELETE_ALL_BTN',ENABLED,PROPERTY_FALSE);
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_SEARCH.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="USER_SEARCH", function=KeyFunction.ITEM_CHANGE)
		public void userSearch_itemChange()
		{
			
				getFormModel().getFormHeader().setSearchCr(getFormModel().getFormHeader().getUserSearch());
				// 
				setItemEnabled("ALL_USERS_BTN", false);
				setItemEnabled("INSERT_BTN", false);
				setItemEnabled("DELETE_BTN", false);
				setItemEnabled("INSERT_ALL_BTN", false);
				setItemEnabled("DELETE_ALL_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER USER_SEARCH.KEY-NEXT-ITEM
		 GO_BLOCK('ALL_USERS_BLOCK');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_SEARCH.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="USER_SEARCH", function=KeyFunction.NEXT_ITEM)
		public void userSearch_keyNexItem()
		{
			
				goBlock(toStr("ALL_USERS_BLOCK"));
			}

		
		/* Original PL/SQL code code for TRIGGER USER_SEARCH.POST-TEXT-ITEM
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
		 * USER_SEARCH.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="USER_SEARCH", function=KeyFunction.ITEM_OUT)
		public void userSearch_itemOut()
		{
			
				setItemEnabled("ALL_USERS_BTN", true);
				setItemEnabled("INSERT_BTN", true);
				setItemEnabled("DELETE_BTN", true);
				setItemEnabled("INSERT_ALL_BTN", true);
				setItemEnabled("DELETE_ALL_BTN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER OBJECT_TYPE.WHEN-LIST-CHANGED
		 EXECUTE_TRIGGER('QUERY_DATA');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJECT_TYPE.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="OBJECT_TYPE")
		public void objectType_listChange()
		{
			
//			{
//				NString whichSort = getBlockOrderByClause("GUBOBJS");
//				if ( whichSort.equals("GUBOBJS_DESC") )
//				{
//					setBlockOrderByClause("GUBOBJS", "GUBOBJS_NAME");
//				}
//				else {
//					setBlockOrderByClause("GUBOBJS", "GUBOBJS_DESC");
//				}
//				// 
//				//  1-HBN4V
//				getFormModel().getFormHeader().setInitialQuery(toStr("Y"));
//				executeAction("QUERY_DATA");
//			}
//				
			getFormModel().getFormHeader().setInitialQuery(toStr("Y"));
				
			executeAction("QUERY_DATA");
			}

		
	
	
}

