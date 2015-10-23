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

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
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
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRAGPT_AGENCY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRAGPT_AGENCY_CODE_LBT")
		public void frragptAgencyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CALL_FRAEVGA_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CALL_FRAEVGA_BTN")
		public void callFraevgaBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CALL_FRAEVGA_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_FORM_FRAEVGA');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CALL_FRAEVGA_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CALL_FRAEVGA_BTN")
		public void callFraevgaBtn_buttonClick()
		{
			
				executeAction("CALL_FORM_FRAEVGA");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_PROP_CODE_LBT")
		public void frbgrntPropCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_TELE_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_TELE_SEQNO_LBT")
		public void frrgrpiTeleSeqnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_TELE_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_AGENCY_TELE_SEQNO_LBT")
		public void frbgrntAgencyTeleSeqnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_ADDR_SEQNO_LBT")
		public void frrgrpiAddrSeqnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_BFRM_CODE_LBT")
		public void frrgrpiBfrmCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_PHONE_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_AGENCY_PHONE_TYPE_LBT")
		public void frbgrntAgencyPhoneTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_BFRM_CODE_1034_EXT_LBT")
		public void frbgbilBfrmCode1034ExtLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_CLEARING_ACCT_CODE_LBT")
		public void frbgbilClearingAcctCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_ADDR_TYPE_LBT")
		public void frrgrpiAddrTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_ADDR_SEQNO_LBT")
		public void frbgbilAddrSeqnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_PHONE_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_PHONE_TYPE_LBT")
		public void frrgrpiPhoneTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_PAYMENT_FUND_CODE_LBT")
		public void frbgbilPaymentFundCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_BECL_CODE_LBT")
		public void frbgbilBeclCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_ADDR_TYPE_LBT")
		public void frbgbilAddrTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_DEFERRED_ACCT_CODE_LBT")
		public void frbgbilDeferredAcctCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_PMSC_CODE_LBT")
		public void frbgbilPmscCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VIEW_HIER_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="VIEW_HIER_BTN")
		public void viewHierBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER VIEW_HIER_BTN.WHEN-BUTTON-PRESSED
		 execute_trigger ('MNU_OPT_FRM_HIERARCHY');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VIEW_HIER_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="VIEW_HIER_BTN")
		public void viewHierBtn_buttonClick()
		{
			
				executeAction("MNU_OPT_FRM_HIERARCHY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DISPLAY_PROP_CODE_LBT")
		public void displayPropCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 :HOLD_PRESS := 'Y';
:GLOBAL.FORM_WAS_CALLED := 'Y';
g$_key_opt_menu('KEY_BLOCK.DISPLAY_PROP_CODE',
                 G$_NLS.Get('FRAGRNT-0232', 'FORM','List of Proposal Codes (FRIPROP)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAGRNT-0233', 'FORM','Proposal Title Search Form (FRIKPRO)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DISPLAY_PROP_CODE_LBT")
		public void displayPropCodeLbt_buttonClick()
		{
			
				getFormModel().getFormHeader().setHoldPress(toStr("Y"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.DISPLAY_PROP_CODE"), GNls.Fget(toStr("FRAGRNT-0232"), toStr("FORM"), toStr("List of Proposal Codes (FRIPROP)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FRAGRNT-0233"), toStr("FORM"), toStr("Proposal Title Search Form (FRIKPRO)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_ATTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGUSN_SDAT_CODE_ATTR_LBT")
		public void frrgusnSdatCodeAttrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_ATTR_LBT.WHEN_BUTTON_PRESSED
		 go_item('FRRGUSN_SDAT_CODE_ATTR');
do_key('LIST_VALUES');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_ATTR_LBT.WHEN_BUTTON_PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_BUTTON_PRESSED", item="FRRGUSN_SDAT_CODE_ATTR_LBT")
		public void frrgusnSdatCodeAttrLbt_WhenButtonPressed()
		{
			
				goItem(toStr("FRRGUSN_SDAT_CODE_ATTR"));
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_COPY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CANCEL_COPY_BTN")
		public void cancelCopyBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CANCEL_COPY_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('EXIT_FORM');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_COPY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CANCEL_COPY_BTN")
		public void cancelCopyBtn_buttonClick()
		{
			
				executeAction("EXIT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OK_COPY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OK_COPY_BTN")
		public void okCopyBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER OK_COPY_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
	--COPY_INSERT_FRBGRNT.COPY_INSERT_FRRAGPT;
  DO_KEY('COMMIT_FORM');
  G$_CHECK_FAILURE;
END;
DECLARE
		temp varchar2(1)	:= 'N';
		CURSOR c1 IS
		SELECT 'x'
		FROM frragpt
		WHERE frragpt_grnt_code = :copy_block.copy_grnt_code;
BEGIN
		OPEN c1;
		FETCH c1 INTO temp;
		IF c1%FOUND THEN 
				:frbgrnt.display_pass_thru_ind := 'Y';
		ELSE
				:frbgrnt.display_pass_thru_ind := 'N';
		END IF;
		CLOSE c1;	
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OK_COPY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OK_COPY_BTN")
		public void okCopyBtn_buttonClick()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement == null)
					return;

				int rowCount = 0;
				// COPY_INSERT_FRBGRNT.COPY_INSERT_FRRAGPT;
				executeAction("SAVE");
				getTask().getGoqrpls().gCheckFailure();
				{
					NString temp = toStr("N");
					String sqlc1 = "SELECT 'x' " +
	" FROM frragpt " +
	" WHERE frragpt_grnt_code = :COPY_BLOCK_COPY_GRNT_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("COPY_BLOCK_COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							frbgrntElement.setDisplayPassThruInd(toStr("Y"));
						}
						else {
							frbgrntElement.setDisplayPassThruInd(toStr("N"));
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="COPY_GRNT_CODE_LBT")
		public void copyGrntCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT_CODE_LBT.WHEN-BUTTON-PRESSED
		 HIDE_WINDOW('COPY_grnt');
:GLOBAL.FORM_WAS_CALLED := 'Y';
g$_key_opt_menu('COPY_BLOCK.COPY_GRNT_CODE',
                 G$_NLS.Get('FRAGRNT-0234', 'FORM','List of Grant Codes (FRIGRNT)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAGRNT-0235', 'FORM','Grant Title Search Form (FRIKGNT)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COPY_GRNT_CODE_LBT")
		public void copyGrntCodeLbt_buttonClick()
		{
			
				hideWindow("COPY_grnt");
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("COPY_BLOCK.COPY_GRNT_CODE"), GNls.Fget(toStr("FRAGRNT-0234"), toStr("FORM"), toStr("List of Grant Codes (FRIGRNT)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FRAGRNT-0235"), toStr("FORM"), toStr("Grant Title Search Form (FRIKGNT)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PUSH_BUTTON314.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PUSH_BUTTON314")
		public void pushButton314_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER PUSH_BUTTON314.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
--
GO_ITEM('NAVIGATE_TO_LIST');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PUSH_BUTTON314.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PUSH_BUTTON314")
		public void pushButton314_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				// 
				goItem(toStr("NAVIGATE_TO_LIST"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_6_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_6_BTN")
		public void navigateTo6Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_6_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
--
GO_ITEM('DUMMY_LIST');
--GO_ITEM('NAVIGATE_TO_LIST');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_6_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_6_BTN")
		public void navigateTo6Btn_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				// 
				goItem(toStr("DUMMY_LIST"));
				// GO_ITEM('NAVIGATE_TO_LIST');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AGENCY_ADDR_SEQ_NUM.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="AGENCY_ADDR_SEQ_NUM")
		public void agencyAddrSeqNum_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER AGENCY_ADDR_SEQ_NUM.WHEN-BUTTON-PRESSED
		 GO_ITEM('frbgrnt_AGENCY_ADDR_SEQ_NUM');
G$_CHECK_FAILURE;
DO_KEY('LIST_VALUES');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AGENCY_ADDR_SEQ_NUM.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="AGENCY_ADDR_SEQ_NUM")
		public void agencyAddrSeqNum_buttonClick()
		{
			
				goItem(toStr("frbgrnt_AGENCY_ADDR_SEQ_NUM"));
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_5_BTN")
		public void navigateTo5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_5_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
--
GO_ITEM('DUMMY_LIST');
--go_item('navigate_to_list');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_5_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_5_BTN")
		public void navigateTo5Btn_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				// 
				goItem(toStr("DUMMY_LIST"));
				// go_item('navigate_to_list');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGUSN_SDAT_CODE_OPT_1_LBT")
		public void frrgusnSdatCodeOpt1Lbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_OPT_1_LBT.WHEN-BUTTON-PRESSED
		 if :FRRGUSN_SDAT_CODE_ATTR is null then
	 go_item('FRRGUSN_SDAT_CODE_ATTR');
else
   go_item('FRRGUSN_SDAT_CODE_OPT_1');
end if;
do_key('LIST_VALUES');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRRGUSN_SDAT_CODE_OPT_1_LBT")
		public void frrgusnSdatCodeOpt1Lbt_buttonClick()
		{
			
				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);

				if(frrgusnElement == null)
					return;

				if ( frrgusnElement.getFrrgusnSdatCodeAttr().isNull() )
				{
					goItem(toStr("FRRGUSN_SDAT_CODE_ATTR"));
				}
				else {
					goItem(toStr("FRRGUSN_SDAT_CODE_OPT_1"));
				}
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_4_BTN")
		public void navigateTo4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_4_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
--
EXECUTE_TRIGGER('RE_EDIT');
G$_CHECK_FAILURE;
--
GO_ITEM('DUMMY_LIST');
--go_item('navigate_to_list');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_4_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_4_BTN")
		public void navigateTo4Btn_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goItem(toStr("DUMMY_LIST"));
				// go_item('navigate_to_list');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_3_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_3_BTN")
		public void navigateTo3Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_3_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
GO_ITEM('DUMMY_LIST');
--go_item('navigate_to_list');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_3_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_3_BTN")
		public void navigateTo3Btn_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				goItem(toStr("DUMMY_LIST"));
				// go_item('navigate_to_list');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXIT_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXIT_1_BTN")
		public void frbgrntExit1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ROLLBACK_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ROLLBACK_1_BTN")
		public void frbgrntRollback1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SAVE_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SAVE_1_BTN")
		public void frbgrntSave1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_STATUS_CODE_LBT")
		public void frbgrntStatusCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFF.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ORGN_CODE_RESP_OFF")
		public void frbgrntOrgnCodeRespOff_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFF.WHEN-BUTTON-PRESSED
		 GO_ITEM('frbgrnt_ORGN_CODE_RESP_OFFICE');
G$_CHECK_FAILURE;
DO_KEY('LIST_VALUES');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFF.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_ORGN_CODE_RESP_OFF")
		public void frbgrntOrgnCodeRespOff_buttonClick()
		{
			
				goItem(toStr("frbgrnt_ORGN_CODE_RESP_OFFICE"));
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_GRANT_TYPE_LBT")
		public void frbgrntGrantTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DISPLAY_FRBGRNT_CODE_LBT")
		public void displayFrbgrntCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE_LBT.WHEN-BUTTON-PRESSED
		 :HOLD_PRESS := 'Y';
:GLOBAL.FORM_WAS_CALLED := 'Y';
g$_key_opt_menu('KEY_BLOCK.DISPLAY_FRBGRNT_CODE',
                 G$_NLS.Get('FRAGRNT-0236', 'FORM','List of Grant Codes (FRIGRNT)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAGRNT-0237', 'FORM','Grant Title Search Form (FRIKGNT)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DISPLAY_FRBGRNT_CODE_LBT")
		public void displayFrbgrntCodeLbt_buttonClick()
		{			
			getFormModel().getFormHeader().setHoldPress(toStr("Y"));
			setGlobal("FORM_WAS_CALLED", toStr("Y"));
			getTask().getGoqrpls().gKeyOptMenu(
					toStr("KEY_BLOCK.DISPLAY_FRBGRNT_CODE"),
					GNls.Fget(toStr("FRAGRNT-0236"), toStr("FORM"),
							toStr("List of Grant Codes (FRIGRNT)")),
					toStr("LIST_VALUES"),
					GNls.Fget(toStr("FRAGRNT-0237"), toStr("FORM"),
							toStr("Grant Title Search Form (FRIKGNT)")),
					toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""),
					toStr(""));
			setGlobal("FORM_WAS_CALLED", toStr("N"));
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_CATEGORY_LBT")
		public void frbgrntCategoryLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SUB_CATEGORY_LBT")
		public void frbgrntSubCategoryLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_CFDA_CODE_LBT")
		public void frbgrntCfdaCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGLOC_LOCN_CODE_LBT")
		public void frrglocLocnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="COPY_GRNT")
		public void copyGrnt_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT.WHEN-BUTTON-PRESSED
		 
DO_KEY('DUPLICATE_ITEM');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COPY_GRNT")
		public void copyGrnt_buttonClick()
		{
			
				executeAction(KeyFunction.DUPLICATE_ITEM);				
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_BTN")
		public void navigateToBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_BTN.WHEN-BUTTON-PRESSED
		 next_item;
EXECUTE_TRIGGER('GET_ITEM_NAME');

EXECUTE_TRIGGER('SET_FIELDS');
G$_CHECK_FAILURE;
--
GO_ITEM('DUMMY_LIST');
--GO_ITEM('NAVIGATE_TO_LIST');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_BTN")
		public void navigateToBtn_buttonClick()
		{
			
				nextItem();
				executeAction("GET_ITEM_NAME");
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goItem(toStr("DUMMY_LIST"));
				// GO_ITEM('NAVIGATE_TO_LIST');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAVIGATE_TO_1_BTN")
		public void navigateTo1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER NAVIGATE_TO_1_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GET_ITEM_NAME');
GO_ITEM('DUMMY_LIST');
--GO_ITEM('NAVIGATE_TO_LIST');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAVIGATE_TO_1_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAVIGATE_TO_1_BTN")
		public void navigateTo1Btn_buttonClick()
		{
			
				executeAction("GET_ITEM_NAME");
				goItem(toStr("DUMMY_LIST"));
				// GO_ITEM('NAVIGATE_TO_LIST');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_NAVIGATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CANCEL_NAVIGATE_BTN")
		public void cancelNavigateBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CANCEL_NAVIGATE_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('EXIT_FORM');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_NAVIGATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CANCEL_NAVIGATE_BTN")
		public void cancelNavigateBtn_buttonClick()
		{
			
				executeAction("EXIT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXIT_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXIT_2_BTN")
		public void frbgrntExit2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SAVE_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SAVE_2_BTN")
		public void frbgrntSave2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ROLLBACK_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ROLLBACK_2_BTN")
		public void frbgrntRollback2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ROLLBACK_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ROLLBACK_5_BTN")
		public void frbgrntRollback5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SAVE_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SAVE_5_BTN")
		public void frbgrntSave5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXIT_6_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="EXIT_6_BTN")
		public void exit6Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SAVE_6_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SAVE_6_BTN")
		public void save6Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ROLLBACK_6_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ROLLBACK_6_BTN")
		public void rollback6Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXIT_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXIT_5_BTN")
		public void frbgrntExit5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXIT_3_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXIT_3_BTN")
		public void frbgrntExit3Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SAVE_3_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SAVE_3_BTN")
		public void frbgrntSave3Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXIT_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXIT_4_BTN")
		public void frbgrntExit4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ROLLBACK_3_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ROLLBACK_3_BTN")
		public void frbgrntRollback3Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDR_CODE_RATE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_INDR_CODE_RATE_LBT")
		public void frbgrntIndrCodeRateLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_IC_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_BASI_CODE_IC_LBT")
		public void frbgrntBasiCodeIcLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_COAS_CODE_IC_CS_LBT")
		public void frbgrntCoasCodeIcCsLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDA_CODE_CHARGE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_INDA_CODE_CHARGE_LBT")
		public void frbgrntIndaCodeChargeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SAVE_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_SAVE_4_BTN")
		public void frbgrntSave4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ROLLBACK_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_ROLLBACK_4_BTN")
		public void frbgrntRollback4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDD_CODE_DISTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_INDD_CODE_DISTR_LBT")
		public void frbgrntInddCodeDistrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_BASI_CODE_CS_LBT")
		public void frbgrntBasiCodeCsLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTR_CODE_RATE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_CSTR_CODE_RATE_LBT")
		public void frbgrntCstrCodeRateLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTD_CODE_DISTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_CSTD_CODE_DISTR_LBT")
		public void frbgrntCstdCodeDistrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTA_CODE_CHARGE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_CSTA_CODE_CHARGE_LBT")
		public void frbgrntCstaCodeChargeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRRRAS_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRRRAS_1_SAVE_BTN")
		public void tbrrras1SaveBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRRRAS_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRRRAS_1_EXIT_BTN")
		public void tbrrras1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRRRAS_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRRRAS_1_ROLLBACK_BTN")
		public void tbrrras1RollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_PI_ID_CODE_LBT")
		public void frbgrntPiIdCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_COAS_CODE_LBT")
		public void frbgrntCoasCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_AGENCY_CODE_LBT")
		public void frbgrntAgencyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_AGENCY_ADDR_CODE_LBT")
		public void frbgrntAgencyAddrCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_PROJECT_START_DATE_DBT")
		public void frbgrntProjectStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_PROJECT_START_DATE_DBT")
		public void frbgrntProjectStartDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_PROJECT_END_DATE_DBT")
		public void frbgrntProjectEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_PROJECT_END_DATE_DBT")
		public void frbgrntProjectEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_TERM_DATE_DBT")
		public void frbgrntTermDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_TERM_DATE_DBT")
		public void frbgrntTermDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_EXPEND_END_DATE_DBT")
		public void frbgrntExpendEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_EXPEND_END_DATE_DBT")
		public void frbgrntExpendEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGRNT_STATUS_DATE_DBT")
		public void frbgrntStatusDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRNT_STATUS_DATE_DBT")
		public void frbgrntStatusDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_BILLING_START_DATE_DBT")
		public void frbgbilBillingStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGBIL_BILLING_START_DATE_DBT")
		public void frbgbilBillingStartDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBGBIL_BILLING_END_DATE_DBT")
		public void frbgbilBillingEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGBIL_BILLING_END_DATE_DBT")
		public void frbgbilBillingEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenButtonPressed();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRECC_ECCG_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('FRRGREC_ECCG_CODE');
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRECC_ECCG_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBGRECC_ECCG_CODE_LBT")
		public void frbgreccEccgCodeLbt_buttonClick()
		{
			
				goItem(toStr("FRRGREC_ECCG_CODE"));
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ACCT_ELEMENT_VALUE_LBT.WHEN-BUTTON-PRESSED
		 
:CHECK_KEYS := 'N';
DECLARE
	lv1 VARCHAR2(200);
	lv2 VARCHAR2(200);
BEGIN
	 IF :FRRGREC_ACCT_ELEMENT = 'O' THEN 
	 		lv1 := G$_NLS.Get('FRAGRNT-0238','FORM','Organization Validation (FTVORGN)');
	    lv2 := G$_NLS.Get('FRAGRNT-0239','FORM','View Organization Codes');
	 ELSIF  :FRRGREC_ACCT_ELEMENT = 'F' THEN    
	 		lv1 := G$_NLS.Get('FRAGRNT-0240','FORM','Fund Code Validation (FTVFUND)');
	    lv2 := G$_NLS.Get('FRAGRNT-0241','FORM','View Fund Codes');
	 ELSIF  :FRRGREC_ACCT_ELEMENT = 'P' THEN    
	 		lv1 := G$_NLS.Get('FRAGRNT-0242','FORM','Program Code Validation (FTVPROG)');
	    lv2 := G$_NLS.Get('FRAGRNT-0243','FORM','View Program Codes');
	 ELSIF  :FRRGREC_ACCT_ELEMENT = 'L' THEN    
	 		lv1 := G$_NLS.Get('FRAGRNT-0244','FORM','Location Code Validation (FTVLOCN)');
	    lv2 := G$_NLS.Get('FRAGRNT-0245','FORM','View Location Codes');
	 ELSIF  :FRRGREC_ACCT_ELEMENT = 'A' THEN    
	 		lv1 := G$_NLS.Get('FRAGRNT-0246','FORM','Activity Code Validation (FTVACTV)');
	    lv2 := G$_NLS.Get('FRAGRNT-0247','FORM','View Activity Codes');
   END IF;

g$_key_opt_menu('FRRGREC.FRRGREC_ACCT_ELEMENT_VALUE',
                 G$_NLS.FormatMsg('x', 'FORM',lv1) ,'LIST_VALUES',
                 G$_NLS.FormatMsg('x', 'FORM',lv2) ,'COUNT_QUERY',
                '','',
                '','');

G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ACCT_ELEMENT_VALUE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRRGREC_ACCT_ELEMENT_VALUE_LBT")
		public void frrgrecAcctElementValueLbt_buttonClick()
		{

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frrgrecElement != null) {
	

				getFormModel().getFormHeader().setCheckKeys(toStr("N"));
				{
					NString lv1= NString.getNull();
					NString lv2= NString.getNull();
					if ( frrgrecElement.getFrrgrecAcctElement().equals("O") )
					{
						lv1 = GNls.Fget(toStr("FRAGRNT-0238"), toStr("FORM"), toStr("Organization Validation (FTVORGN)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0239"), toStr("FORM"), toStr("View Organization Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("F") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0240"), toStr("FORM"), toStr("Fund Code Validation (FTVFUND)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0241"), toStr("FORM"), toStr("View Fund Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("P") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0242"), toStr("FORM"), toStr("Program Code Validation (FTVPROG)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0243"), toStr("FORM"), toStr("View Program Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("L") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0244"), toStr("FORM"), toStr("Location Code Validation (FTVLOCN)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0245"), toStr("FORM"), toStr("View Location Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("A") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0246"), toStr("FORM"), toStr("Activity Code Validation (FTVACTV)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0247"), toStr("FORM"), toStr("View Activity Codes"));
					}
					getTask().getGoqrpls().gKeyOptMenu(toStr("FRRGREC.FRRGREC_ACCT_ELEMENT_VALUE"), GNls.formatmsg(toStr("x"), toStr("FORM"), lv2, toStr(""), toStr(""), toStr(""), NString.getNull(), NString.getNull(),toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""),toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr("")), toStr("LIST_VALUES"), GNls.formatmsg(toStr("x"), toStr("FORM"), lv2, toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr("")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
					getTask().getGoqrpls().gCheckFailure();
				}
}
			}

		
	
	
}

