package net.hedtech.banner.finance.common.Foaiden.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;

import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FoaidenTask getTask() {
		return (FoaidenTask)super.getTask();
	}

	public FoaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_FIRST_NAME_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PERS_FIRST_NAME_BTN")
		public void persFirstNameBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER PERS_FIRST_NAME_BTN.WHEN-BUTTON-PRESSED
		 :WHICH_NAME_SEARCH := 'PERSON';
GO_ITEM('SPRIDEN_CURRENT.PERS_FIRST_NAME'); 
DO_KEY ('COUNT_QUERY');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_FIRST_NAME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PERS_FIRST_NAME_BTN")
		public void persFirstNameBtn_buttonClick()
		{
			
				getFormModel().getFormHeader().setWhichNameSearch(toStr("PERSON"));
				goItem(toStr("SPRIDEN_CURRENT.PERS_FIRST_NAME"));
				executeAction("COUNT_QUERY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LAST_NAME_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PERS_LAST_NAME_BTN")
		public void persLastNameBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER PERS_LAST_NAME_BTN.WHEN-BUTTON-PRESSED
		 :WHICH_NAME_SEARCH := 'PERSON';
GO_ITEM('SPRIDEN_CURRENT.PERS_LAST_NAME'); 
DO_KEY ('COUNT_QUERY');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LAST_NAME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PERS_LAST_NAME_BTN")
		public void persLastNameBtn_buttonClick()
		{
			
				getFormModel().getFormHeader().setWhichNameSearch(toStr("PERSON"));
				goItem(toStr("SPRIDEN_CURRENT.PERS_LAST_NAME"));
				executeAction("COUNT_QUERY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
		
		/* Original PL/SQL code code for TRIGGER ADDRESS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('ADDRESS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADDRESS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADDRESS_BTN")
		public void addressBtn_buttonClick()
		{
			
				executeAction("ADDRESS");
			}

		
		/* Original PL/SQL code code for TRIGGER PREVIOUS_NAME_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('PREVIOUS_NAME');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_NAME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREVIOUS_NAME_BTN")
		public void previousNameBtn_buttonClick()
		{
			
				executeAction("PREVIOUS_NAME");
			}

		
		/* Original PL/SQL code code for TRIGGER SOURCE_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('SOURCE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOURCE_BTN")
		public void sourceBtn_buttonClick()
		{
			
				executeAction("SOURCE");
			}

		
		/* Original PL/SQL code code for TRIGGER PREVIOUS_SOURCE_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('SOURCE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_SOURCE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREVIOUS_SOURCE_BTN")
		public void previousSourceBtn_buttonClick()
		{
			
				executeAction("SOURCE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_REMOVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PREVIOUS_REMOVE_BTN")
		public void previousRemoveBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER PREVIOUS_REMOVE_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('PREVIOUS_REMOVE');


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_REMOVE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREVIOUS_REMOVE_BTN")
		public void previousRemoveBtn_buttonClick()
		{
			
				executeAction("PREVIOUS_REMOVE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PHONE_BTN")
		public void phoneBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER PHONE_BTN.WHEN-BUTTON-PRESSED
		 :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
IF :HOLD_BLOCK_FIELD IN ('SPRADDR.PHONE_AREA', 'SPRADDR.PHONE_NUMBER', 
   'SPRADDR.PHONE_EXT') THEN
   EXECUTE_TRIGGER ('SHOW_PHONES');
   G$_CHECK_FAILURE;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PHONE_BTN")
		public void phoneBtn_buttonClick()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				if ( in(getFormModel().getFormHeader().getHoldBlockField(), "SPRADDR.PHONE_AREA", "SPRADDR.PHONE_NUMBER", "SPRADDR.PHONE_EXT").getValue() )
				{
					executeAction("SHOW_PHONES");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_6_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 GO_FIELD('SPRADDR_ZIP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_6_CANCEL_BTN")
		public void spraddr6CancelBtn_buttonClick()
		{
			
				goItem(toStr("SPRADDR_ZIP"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELIVERY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DELIVERY_BTN")
		public void deliveryBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DELIVERY_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('DELIVERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELIVERY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DELIVERY_BTN")
		public void deliveryBtn_buttonClick()
		{
			
				executeAction("DELIVERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ID_LBT")
		public void idLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ID_LBT.WHEN-BUTTON-PRESSED
		 set_window_property ('G$_OPT_WINDOW', POSITION,102,28);--17, 4);
G$_KEY_OPT_MENU ('KEY_BLOCK.ID',
                  G$_NLS.Get('FOAIDEN-0021', 'FORM','Person Search (FOIIDEN)') , 'LIST_VALUES',
                  G$_NLS.Get('FOAIDEN-0022', 'FORM','Non-Person Search (FOICOMP)') , 'COUNT_QUERY',
                  G$_NLS.Get('FOAIDEN-0023', 'FORM','Alternate ID Search (GUIALTI)') , 'DUPLICATE_ITEM',
                 '','', 
                 '','',
                 '','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ID_LBT")
		public void idLbt_buttonClick()
		{

				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("FOAIDEN-0021"), toStr("FORM"), toStr("Person Search (FOIIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FOAIDEN-0022"), toStr("FORM"), toStr("Non-Person Search (FOICOMP)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("FOAIDEN-0023"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("DUPLICATE_ITEM"), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_STAT_CODE_LBT")
		public void spraddrStatCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_NATN_CODE_LBT")
		public void spraddrNatnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ZIP_LBT")
		public void spraddrZipLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_CNTY_CODE_LBT")
		public void spraddrCntyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TELE_CODE_LBT")
		public void teleCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 SET_WINDOW_PROPERTY ('G$_OPT_WINDOW', POSITION, 33, 8);
G$_KEY_OPT_MENU ('SPRADDR.SPRADDR_ATYP_CODE',
                  G$_NLS.Get('FOAIDEN-0024', 'FORM','Address Types') , 'LIST_VALUES',
                  G$_NLS.Get('FOAIDEN-0025', 'FORM','Addresses (FOQADDR)') , 'COUNT_QUERY',
                 '', '', '', '');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_buttonClick()
		{
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("SPRADDR.SPRADDR_ATYP_CODE"), GNls.Fget(toStr("FOAIDEN-0024"), toStr("FORM"), toStr("Address Types")), toStr("LIST_VALUES"), GNls.Fget(toStr("FOAIDEN-0025"), toStr("FORM"), toStr("Addresses (FOQADDR)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ASRC_CODE_LBT")
		public void spraddrAsrcCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT_2_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 GO_FIELD(NAME_IN('HOLD_BLOCK_FIELD'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_CURRENT_2_CANCEL_BTN")
		public void spridenCurrent2CancelBtn_buttonClick()
		{
			
				goItem(getNameIn("HOLD_BLOCK_FIELD"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_PREV_4_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 GO_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_ID');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_PREV_4_CANCEL_BTN")
		public void spridenPrev4CancelBtn_buttonClick()
		{
			
				goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ID"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_FROM_DATE_DBT")
		public void spraddrFromDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_FROM_DATE_DBT")
		public void spraddrFromDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_TO_DATE_DBT")
		public void spraddrToDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_TO_DATE_DBT")
		public void spraddrToDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
	
	
}

