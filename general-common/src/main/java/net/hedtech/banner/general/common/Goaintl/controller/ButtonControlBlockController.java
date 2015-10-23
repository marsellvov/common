package net.hedtech.banner.general.common.Goaintl.controller;
 
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

import net.hedtech.banner.general.common.Goaintl.model.*;
import net.hedtech.banner.general.common.Goaintl.*;
import net.hedtech.banner.general.common.Goaintl.services.*;

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
	public GoaintlTask getTask() {
		return (GoaintlTask)super.getTask();
	}

	public GoaintlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
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
		    G$_KEY_OPT_MENU('KEY_BLOCK.ID',
                    G$_NLS.Get('GOAINTL-0157', 'FORM','List for Person (SOAIDEN)') ,'LIST_VALUES',
                    G$_NLS.Get('GOAINTL-0158', 'FORM','Alternate ID Search (GUIALTI)') , 'DUPLICATE_ITEM',
                   '','','','');
   G$_CHECK_FAILURE;
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
			
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("GOAINTL-0157"), toStr("FORM"), toStr("List for Person (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAINTL-0158"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("DUPLICATE_ITEM"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADDTL_INFO_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ADDTL_INFO_BTN")
		public void addtlInfoBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ADDTL_INFO_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('OPTM_WIN_ADDTL_INFO');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADDTL_INFO_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADDTL_INFO_BTN")
		public void addtlInfoBtn_buttonClick()
		{
			
				executeAction("OPTM_WIN_ADDTL_INFO");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORVISA_VTYP_CODE_LBT")
		public void gorvisaVtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORVISA_VISS_CODE_LBT")
		public void gorvisaVissCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_PENT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORVISA_PENT_CODE_LBT")
		public void gorvisaPentCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_NATN_CODE_ISSUE_LBT.WHEN-BUTTON-PRESSED
		 Go_Item ('GORVISA_NATN_CODE_ISSUE');
Execute_Trigger ('KEY-LISTVAL');
G$_Check_Failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_NATN_CODE_ISSUE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORVISA_NATN_CODE_ISSUE_LBT")
		public void gorvisaNatnCodeIssueLbt_buttonClick()
		{
			
				goItem(toStr("GORVISA_NATN_CODE_ISSUE"));
				executeAction("KEY-LISTVAL");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_DOCM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORDOCM_DOCM_CODE_LBT")
		public void gordocmDocmCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_ISSUE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_NATN_CODE_ISSUE_LBT")
		public void gobintlNatnCodeIssueLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CELG_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_CELG_CODE_LBT")
		public void gobintlCelgCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_ADMR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_ADMR_CODE_LBT")
		public void gobintlAdmrCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_BIRTH_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_NATN_CODE_BIRTH_LBT")
		public void gobintlNatnCodeBirthLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_NATN_CODE_LEGAL_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_NATN_CODE_LEGAL_LBT")
		public void gobintlNatnCodeLegalLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_LANG_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_LANG_CODE_LBT")
		public void gobintlLangCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_SPON_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_SPON_CODE_LBT")
		public void gobintlSponCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_EMPT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_EMPT_CODE_LBT")
		public void gobintlEmptCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORVISA_VISA_REQ_DATE_DBT")
		public void gorvisaVisaReqDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_REQ_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORVISA_VISA_REQ_DATE_DBT")
		public void gorvisaVisaReqDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORVISA_VISA_ISSUE_DATE_DBT")
		public void gorvisaVisaIssueDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ISSUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORVISA_VISA_ISSUE_DATE_DBT")
		public void gorvisaVisaIssueDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORDOCM_REQUEST_DATE_DBT")
		public void gordocmRequestDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_REQUEST_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORDOCM_REQUEST_DATE_DBT")
		public void gordocmRequestDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_PASSPORT_EXP_DATE_DBT")
		public void gobintlPassportExpDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_PASSPORT_EXP_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GOBINTL_PASSPORT_EXP_DATE_DBT")
		public void gobintlPassportExpDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_I94_DATE_DBT")
		public void gobintlI94DateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_I94_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GOBINTL_I94_DATE_DBT")
		public void gobintlI94DateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_CERT_DATE_ISSUE_DBT")
		public void gobintlCertDateIssueDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_ISSUE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GOBINTL_CERT_DATE_ISSUE_DBT")
		public void gobintlCertDateIssueDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBINTL_CERT_DATE_RECEIPT_DBT")
		public void gobintlCertDateReceiptDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBINTL_CERT_DATE_RECEIPT_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GOBINTL_CERT_DATE_RECEIPT_DBT")
		public void gobintlCertDateReceiptDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GORDOCM_RECEIVED_DATE_DBT.WHEN-BUTTON-PRESSED
		 G$_DATE_CALL_GUACALN('GORDOCM_RECEIVED_DATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORDOCM_RECEIVED_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORDOCM_RECEIVED_DATE_DBT")
		public void gordocmReceivedDateDbt_buttonClick()
		{
			
				getTask().getGoqrpls().gDateCallGuacaln(toStr("GORDOCM_RECEIVED_DATE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_ST_DT_DBT.WHEN-BUTTON-PRESSED
		 G$_DATE_CALL_GUACALN('GORVISA_VISA_START_DATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_ST_DT_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORVISA_VISA_ST_DT_DBT")
		public void gorvisaVisaStDtDbt_buttonClick()
		{
			
				getTask().getGoqrpls().gDateCallGuacaln(toStr("GORVISA_VISA_START_DATE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GORVISA_VISA_EXP_DT_DBT.WHEN-BUTTON-PRESSED
		 G$_DATE_CALL_GUACALN('GORVISA_VISA_EXPIRE_DATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORVISA_VISA_EXP_DT_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GORVISA_VISA_EXP_DT_DBT")
		public void gorvisaVisaExpDtDbt_buttonClick()
		{
			
				getTask().getGoqrpls().gDateCallGuacaln(toStr("GORVISA_VISA_EXPIRE_DATE"));
			}

		
	
	
}

