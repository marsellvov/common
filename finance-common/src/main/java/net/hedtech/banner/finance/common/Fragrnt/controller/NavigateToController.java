package net.hedtech.banner.finance.common.Fragrnt.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Fragrnt.model.*;
import net.hedtech.banner.finance.common.Fragrnt.*;
import net.hedtech.banner.finance.common.Fragrnt.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class NavigateToController extends DefaultBlockController {


	
	public NavigateToController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FragrntTask getTask() {
		return (FragrntTask)super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO.KEY-OTHERS
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void navigateTo_KeyOthers()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO.KEY-EXIT
		 :NAVIGATE_TO_LIST := 'N';
--
GO_ITEM(NAME_IN('HOLD_ITEM_NAME'));
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void navigateTo_Exit()
		{
			
				getFormModel().getNavigateTo().setNavigateToList(toStr("N"));
				// 
				goItem(getNameIn("HOLD_ITEM_NAME"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO.KEY-PREV-ITEM
		 previous_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void navigateTo_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO.KEY-NEXT-ITEM
		 next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void navigateTo_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_LIST.WHEN-LIST-CHANGED
		 BEGIN
  IF :NAVIGATE_TO_LIST = 'B'  THEN
      HIDE_WINDOW('NAVIGATE_TO');
      EXECUTE_TRIGGER('CALL_FORM_FRABUDG');
      G$_CHECK_FAILURE;
   ELSIF
     :NAVIGATE_TO_LIST = 'C'  THEN
      HIDE_WINDOW('NAVIGATE_TO');
      HIDE_WINDOW('PERSONNEL_INFO');
      EXECUTE_TRIGGER('CALL_FORM_FRIGRST');
      G$_CHECK_FAILURE;
   ELSIF
      :NAVIGATE_TO_LIST = 'D' THEN
      HIDE_WINDOW('NAVIGATE_TO');
      EXECUTE_TRIGGER('CALL_FORM_FOATEXT');
      G$_CHECK_FAILURE;
    ELSIF
     :NAVIGATE_TO_LIST = 'E'  THEN
      EXECUTE_TRIGGER('MNU_OPT_AGENCY_INFO');
      G$_CHECK_FAILURE;
   ELSIF
     :NAVIGATE_TO_LIST = 'L' THEN
     EXECUTE_TRIGGER('MNU_OPT_LOCATION_INFO');
     G$_CHECK_FAILURE;
   ELSIF
     :NAVIGATE_TO_LIST = 'H' THEN
      EXECUTE_TRIGGER('MNU_OPT_BILLING_INFO');
      G$_CHECK_FAILURE;
   ELSIF
     :NAVIGATE_TO_LIST = 'K' THEN
      EXECUTE_TRIGGER('MNU_OPT_HEADER_INFO');
   ELSIF
     :NAVIGATE_TO_LIST = 'F' THEN
      EXECUTE_TRIGGER('MNU_OPT_COST_SHARE_INFO');
      G$_CHECK_FAILURE; 
   ELSIF
     :NAVIGATE_TO_LIST = 'I' THEN
      EXECUTE_TRIGGER('MNU_OPT_USER_CODES_INFO');
      G$_CHECK_FAILURE; 
   ELSIF
     :NAVIGATE_TO_LIST = 'G' THEN
      EXECUTE_TRIGGER('MNU_OPT_PERSONNEL_INFO');
      G$_CHECK_FAILURE;    
   ELSIF
     :NAVIGATE_TO_LIST = 'P' THEN
      EXECUTE_TRIGGER('MNU_OPT_PASS_THRU_INFO');
      G$_CHECK_FAILURE;         
  END IF;
  :NAVIGATE_TO_LIST := 'N';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_LIST.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="NAVIGATE_TO_LIST")
		public void navigateToList_listChange()
		{
			
				if ( getFormModel().getNavigateTo().getNavigateToList().equals("B") )
				{
					hideWindow("NAVIGATE_TO");
					executeAction("CALL_FORM_FRABUDG");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("C") ) {
					hideWindow("NAVIGATE_TO");
					hideWindow("PERSONNEL_INFO");
					executeAction("CALL_FORM_FRIGRST");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("D") ) {
					hideWindow("NAVIGATE_TO");
					executeAction("CALL_FORM_FOATEXT");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("E") ) {
					executeAction("MNU_OPT_AGENCY_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("L") ) {
					executeAction("MNU_OPT_LOCATION_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("H") ) {
					executeAction("MNU_OPT_BILLING_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("K") ) {
					executeAction("MNU_OPT_HEADER_INFO");
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("F") ) {
					executeAction("MNU_OPT_COST_SHARE_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("I") ) {
					executeAction("MNU_OPT_USER_CODES_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("G") ) {
					executeAction("MNU_OPT_PERSONNEL_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getNavigateTo().getNavigateToList().equals("P") ) {
					executeAction("MNU_OPT_PASS_THRU_INFO");
					getTask().getGoqrpls().gCheckFailure();
				}
				getFormModel().getNavigateTo().setNavigateToList(toStr("N"));
			}

		
	
	
}

