package net.hedtech.banner.general.common.Soaiden.controller;
 
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

import net.hedtech.banner.general.common.Soaiden.model.*;
import net.hedtech.banner.general.common.Soaiden.*;
import net.hedtech.banner.general.common.Soaiden.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoaidenTask getTask() {
		return (SoaidenTask)super.getTask();
	}

	public SoaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER CASE_INSENSITIVE_RG.WHEN-RADIO-CHANGED
		 --
 IF :CASE_INSENSITIVE_RG = 'T' THEN
    SET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('SPRIDEN_MI',CASE_INSENSITIVE_QUERY,PROPERTY_TRUE);
  ELSE
    SET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('SPRIDEN_MI',CASE_INSENSITIVE_QUERY,PROPERTY_FALSE);
END IF;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CASE_INSENSITIVE_RG.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="CASE_INSENSITIVE_RG")
		public void caseInsensitiveRg_radioGroupChange()
		{
			
				// 
				// 
				if ( getFormModel().getButtonControlBlock().getCaseInsensitiveRg().equals("T") )
				{
					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_LAST_NAME", true);
					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_FIRST_NAME", true);
					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_MI", true);
				}
				else {

					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_LAST_NAME", false);
					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_FIRST_NAME", false);
					ItemServices.setItemCaseInsensitiveQuery("SPRIDEN_MI", false);
				}
				if(getCursorBlock().notEquals("KEY_BLOCK")){
					goBlock("SPRIDEN");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DETAIL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DETAIL_BTN")
		public void detailBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DETAIL_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('DETAIL_BTN_TRIG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DETAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DETAIL_BTN")
		public void detailBtn_buttonClick()
		{
			
				executeAction("DETAIL_BTN_TRIG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SEARCH_BTN")
		public void searchBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SEARCH_BTN.WHEN-BUTTON-PRESSED
		    DO_KEY('EXECUTE_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SEARCH_BTN")
		public void searchBtn_buttonClick()
		{
			
				executeAction("EXECUTE_QUERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOUNDEX_BTN")
		public void soundexBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX_BTN.WHEN-BUTTON-PRESSED
		 GO_BLOCK('SOUNDEX');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOUNDEX_BTN")
		public void soundexBtn_buttonClick()
		{
			
				goBlock(toStr("SOUNDEX"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_SEARCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOUNDEX_SEARCH_BTN")
		public void soundexSearchBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SOUNDEX_SEARCH_BTN.WHEN-BUTTON-PRESSED
		    DO_KEY('EXECUTE_QUERY');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_SEARCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOUNDEX_SEARCH_BTN")
		public void soundexSearchBtn_buttonClick()
		{
			
				executeAction("EXECUTE_QUERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_1_EXITVALUE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_1_EXITVALUE_BTN")
		public void spriden1ExitvalueBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_1_ROLLBACK_BTN")
		public void spriden1RollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOUNDEX_ROLLBACK_BTN")
		public void soundexRollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_1_EXIT_BTN")
		public void spriden1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOUNDEX_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOUNDEX_EXIT_BTN")
		public void soundexExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_NTYP_CODE_LBT")
		public void spridenNtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
	
	
}

