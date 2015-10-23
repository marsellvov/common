package net.hedtech.banner.general.common.Goamtch.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Goamtch.model.*;
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.banner.general.common.Goamtch.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoamtchTask getTask() {
		return (GoamtchTask)super.getTask();
	}

	public GoamtchModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CREATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CREATE_BTN")
		public void createBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CREATE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  CHECK_FIRST_NAME;
  G$_CHECK_FAILURE;
-- 73-5
-- basic validtation checks to save API calls
  EXECUTE_TRIGGER('CM_CREATE_NEW_ID_1');
  G$_CHECK_FAILURE;
  -- if basic data entry missing, do not rollback
  --IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
  --    RETURN;
  --END IF;
  -- attempt create using API calls
  EXECUTE_TRIGGER('CM_CREATE_NEW_ID_2');
  G$_CHECK_FAILURE;
  -- if no API errors, after acknowledge, rollback 
  IF  :FORM_HEADER.API_FAILURE = 'Y' 
 	AND :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND = 'Y' THEN
      RETURN;
  ELSE
  	  CLEAN_UP_AND_EXIT;
  END IF;
  --
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CREATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CREATE_BTN")
		public void createBtn_buttonClick()
		{
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				if(gotcmmeElement == null) return;

				this.getTask().getServices().checkFirstName(gotcmmeElement);
				getTask().getGoqrpls().gCheckFailure();
				//  73-5
				//  basic validtation checks to save API calls
				executeAction("CM_CREATE_NEW_ID_1");
				getTask().getGoqrpls().gCheckFailure();
				//  if basic data entry missing, do not rollback
				// IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
				//     RETURN;
				// END IF;
				//  attempt create using API calls
				executeAction("CM_CREATE_NEW_ID_2");
				getTask().getGoqrpls().gCheckFailure();
				//  if no API errors, after acknowledge, rollback 
				if ( getFormModel().getFormHeader().getApiFailure().equals("Y") && getFormModel().getKeyBlock().getKeyblockApiFailureInd().equals("Y") )
				{
					return ;
				}
				else {
					this.getTask().getServices().cleanUpAndExit();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SELECT_BTN")
		public void selectBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SELECT_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  SELECT_ID_AND_EXIT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SELECT_BTN")
		public void selectBtn_buttonClick()
		{
			
				this.getTask().getServices().selectIdAndExit();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * UPDATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="UPDATE_BTN")
		public void updateBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER UPDATE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  CM_UPDATE_EXISTING_ID;
  G$_CHECK_FAILURE;
--
  CLEAN_UP_AND_EXIT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * UPDATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="UPDATE_BTN")
		public void updateBtn_buttonClick()
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				if(gotcmmeElement == null) return;

				this.getTask().getServices().cmUpdateExistingId(gotcmmeElement);
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().cleanUpAndExit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DETAILS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DETAILS_BTN")
		public void detailsBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DETAILS_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  :FORM_HEADER.CALLED_FORM   := 0;
  :FORM_HEADER.HOLD_BLK_ITEM := :SYSTEM.CURSOR_ITEM;
--
	GO_BLOCK('GORCMDO');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DETAILS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DETAILS_BTN")
		public void detailsBtn_buttonClick()
		{
			
				getFormModel().getFormHeader().setCalledForm(toInt(0));
				getFormModel().getFormHeader().setHoldBlkItem(toStr(getCursorItem()));
				// 
				goBlock(toStr("GORCMDO"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CHECK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CHECK_BTN")
		public void checkBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CHECK_BTN.WHEN-BUTTON-PRESSED
		 START_MATCHING_PROCESS;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CHECK_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CHECK_BTN")
		public void checkBtn_buttonClick()
		{
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				if(gotcmmeElement==null) return;

				this.getTask().getServices().startMatchingProcess(gotcmmeElement);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_COMMENT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOURCE_COMMENT_BTN")
		public void sourceCommentBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SOURCE_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 -- 73-1
BEGIN
  IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0063','FORM','Button is outside the current block'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :FORM_HEADER.HOLD_BLK_ITEM := :SYSTEM.CURSOR_ITEM;
--
	GO_BLOCK('GTVCMSC');
END;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOURCE_COMMENT_BTN")
		public void sourceCommentBtn_buttonClick()
		{
			
				//  73-1
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0063"), toStr("FORM"), toStr("*ERROR* Button is outside the current block")));
					throw new ApplicationException();
				}
				// 
				getFormModel().getFormHeader().setHoldBlkItem(toStr(getCursorItem()));
				// 
				goBlock(toStr("GTVCMSC"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CLEAR_MATCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CLEAR_MATCH_BTN")
		public void clearMatchBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CLEAR_MATCH_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  CLEAR_MATCH_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CLEAR_MATCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CLEAR_MATCH_BTN")
		public void clearMatchBtn_buttonClick()
		{
			
				this.getTask().getServices().clearMatchBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CLEAR_SUSPENSE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CLEAR_SUSPENSE_BTN")
		public void clearSuspenseBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CLEAR_SUSPENSE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  CLEAR_SUSPENSE_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CLEAR_SUSPENSE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CLEAR_SUSPENSE_BTN")
		public void clearSuspenseBtn_buttonClick()
		{
			
				this.getTask().getServices().clearSuspenseBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER SORT_ID_BTN.WHEN-IMAGE-PRESSED
		 DECLARE
	current_txt VARCHAR2(100) := GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_ID_BTN',TOOLTIP_TEXT);
	switch_desc_txt varchar2(100) := G$_NLS.Get('GOAMTCH-0064','FORM','Switch sort High to Low');
	switch_asc_txt  varchar2(100) := G$_NLS.Get('GOAMTCH-0065','FORM','Switch sort Low to High');
BEGIN
  IF current_txt = switch_desc_txt THEN
    READ_IMAGE_FILE('down.gif','URL','BUTTON_CONTROL_BLOCK.SORT_ID_BTN');
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_ID_BTN',TOOLTIP_TEXT,switch_asc_txt);
    SET_BLOCK_PROPERTY('GOVCMID',ORDER_BY,'GOVCMID_ID DESC');
    GO_BLOCK('GOVCMID');
    EXECUTE_QUERY;
  ELSE
    READ_IMAGE_FILE('up.gif','URL','BUTTON_CONTROL_BLOCK.SORT_ID_BTN');
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_ID_BTN',TOOLTIP_TEXT,switch_desc_txt);
    SET_BLOCK_PROPERTY('GOVCMID',ORDER_BY,'GOVCMID_ID ASC');
    GO_BLOCK('GOVCMID');
    EXECUTE_QUERY;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORT_ID_BTN.WHEN-IMAGE-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-IMAGE-PRESSED", item="SORT_ID_BTN")
		public void sortIdBtn_buttonClick()
		{
			
				{
					NString currentTxt = getItemToolTip(toStr("BUTTON_CONTROL_BLOCK.SORT_ID_BTN"));
					NString switchDescTxt = GNls.Fget(toStr("GOAMTCH-0064"), toStr("FORM"), toStr("Switch sort High to Low"));
					NString switchAscTxt = GNls.Fget(toStr("GOAMTCH-0065"), toStr("FORM"), toStr("Switch sort Low to High"));
					if ( currentTxt.equals(switchDescTxt) )
					{
						readImageFile("BUTTON_CONTROL_BLOCK.SORT_ID_BTN", "down.gif",  "URL");
						setItemToolTip("BUTTON_CONTROL_BLOCK.SORT_ID_BTN", switchAscTxt);
						setBlockOrderByClause("GOVCMID", "GOVCMID_ID DESC");
						goBlock(toStr("GOVCMID"));
						executeQuery();
					}
					else {
						readImageFile("BUTTON_CONTROL_BLOCK.SORT_ID_BTN", "up.gif",  "URL");
						setItemToolTip("BUTTON_CONTROL_BLOCK.SORT_ID_BTN", switchDescTxt);
						setBlockOrderByClause("GOVCMID", "GOVCMID_ID ASC");
						goBlock(toStr("GOVCMID"));
						executeQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORT_ID_BTN.WHEN-MOUSE-DOUBLECLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORT_ID_BTN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORT_ID_BTN")
		public void sortIdBtn_doubleClick()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER SORT_NAME_BTN.WHEN-IMAGE-PRESSED
		 DECLARE
	current_txt VARCHAR2(100) := GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_NAME_BTN',TOOLTIP_TEXT);
	switch_desc_txt varchar2(100) := G$_NLS.Get('GOAMTCH-0066','FORM','Switch sort Z to A');
	switch_asc_txt  varchar2(100) := G$_NLS.Get('GOAMTCH-0067','FORM','Switch sort A to Z');
BEGIN
  IF current_txt = switch_desc_txt THEN
    READ_IMAGE_FILE('down.gif','URL','BUTTON_CONTROL_BLOCK.SORT_NAME_BTN');
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_NAME_BTN',TOOLTIP_TEXT,switch_asc_txt);
    SET_BLOCK_PROPERTY('GOVCMID',ORDER_BY,'GOVCMID_NAME DESC');
    GO_BLOCK('GOVCMID');
    EXECUTE_QUERY;
  ELSE
    READ_IMAGE_FILE('up.gif','URL','BUTTON_CONTROL_BLOCK.SORT_NAME_BTN');
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SORT_NAME_BTN',TOOLTIP_TEXT,switch_desc_txt);
    SET_BLOCK_PROPERTY('GOVCMID',ORDER_BY,'GOVCMID_NAME ASC');
    GO_BLOCK('GOVCMID');
    EXECUTE_QUERY;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORT_NAME_BTN.WHEN-IMAGE-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-IMAGE-PRESSED", item="SORT_NAME_BTN")
		public void sortNameBtn_buttonClick()
		{
			
				{
					NString currentTxt = getItemToolTip(toStr("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN"));
					NString switchDescTxt = GNls.Fget(toStr("GOAMTCH-0066"), toStr("FORM"), toStr("Switch sort Z to A"));
					NString switchAscTxt = GNls.Fget(toStr("GOAMTCH-0067"), toStr("FORM"), toStr("Switch sort A to Z"));
					if ( currentTxt.equals(switchDescTxt) )
					{
						readImageFile("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN", "down.gif",  "URL");
						setItemToolTip("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN", switchAscTxt);
						setBlockOrderByClause("GOVCMID", "GOVCMID_NAME DESC");
						goBlock(toStr("GOVCMID"));
						executeQuery();
					}
					else {
						readImageFile("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN", "up.gif",  "URL");
						setItemToolTip("BUTTON_CONTROL_BLOCK.SORT_NAME_BTN", switchDescTxt);
						setBlockOrderByClause("GOVCMID", "GOVCMID_NAME ASC");
						goBlock(toStr("GOVCMID"));
						executeQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SORT_NAME_BTN.WHEN-MOUSE-DOUBLECLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORT_NAME_BTN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORT_NAME_BTN")
		public void sortNameBtn_doubleClick()
		{
			
			}

		
	
	
}

