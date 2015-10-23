package net.hedtech.banner.finance.common.Fraprop.controller;
 
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
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;
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
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}

	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPT_AGENCY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPRPT_AGENCY_CODE_LBT")
		public void frrprptAgencyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_GRNT_CODE_LBT")
		public void frbpropGrntCodeLbt_click()
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
		 * FRRPUSN_SDAT_CODE_OPT_1_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPUSN_SDAT_CODE_OPT_1_LBT")
		public void frrpusnSdatCodeOpt1Lbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_OPT_1_LBT.WHEN_BUTTON_PRESSED
		 go_item(NAME_IN('SYSTEM.CURSOR_ITEM'));
do_key('LIST_VALUES');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_OPT_1_LBT.WHEN_BUTTON_PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_BUTTON_PRESSED")
		public void frrpusnSdatCodeOpt1Lbt_WhenButtonPressed()
		{
			
				goItem(getCursorItem());
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_ATTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPUSN_SDAT_CODE_ATTR_LBT")
		public void frrpusnSdatCodeAttrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_ATTR_LBT.WHEN_BUTTON_PRESSED
		 go_item(NAME_IN('SYSTEM.CURSOR_ITEM'));
do_key('LIST_VALUES');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_ATTR_LBT.WHEN_BUTTON_PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_BUTTON_PRESSED")
		public void frrpusnSdatCodeAttrLbt_WhenButtonPressed()
		{
			
				goItem(getCursorItem());
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
 -- COPY_INSERT_FRBPROP.COPY_INSERT_FRRPRPT;   
  DO_KEY('COMMIT_FORM');
  G$_CHECK_FAILURE;
END;
DECLARE
		temp varchar2(1)	:= 'N';
		CURSOR c1 IS
		SELECT 'x'
		FROM frrprpt
		WHERE frrprpt_prop_code = :copy_block.copy_prop_code;
BEGIN
		OPEN c1;
		FETCH c1 INTO temp;
		IF c1%FOUND THEN
				:frbprop.display_pass_thru_ind := 'Y';
		ELSE
				:frbprop.display_pass_thru_ind := 'N';
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
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				//  COPY_INSERT_FRBPROP.COPY_INSERT_FRRPRPT;   
				executeAction("SAVE");
				getTask().getGoqrpls().gCheckFailure();
				{
					NString temp = toStr("N");
					String sqlc1 = "SELECT 'x' " +
	" FROM frrprpt " +
	" WHERE frrprpt_prop_code = :COPY_BLOCK_COPY_PROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("COPY_BLOCK_COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							frbpropElement.setDisplayPassThruInd(toStr("Y"));
						}
						else {
							frbpropElement.setDisplayPassThruInd(toStr("N"));
						}
						c1.close();
					}
					finally{
						c1.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="COPY_PROP_CODE_LBT")
		public void copyPropCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_PROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 --HIDE_WINDOW('COPY_PROP'); Defect #43559
:GLOBAL.FORM_WAS_CALLED := 'Y';
g$_key_opt_menu('COPY_BLOCK.COPY_PROP_CODE',
                G$_NLS.Get('FRAPROP-0155', 'FORM','List of Proposal Codes (FRIPROP)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAPROP-0156', 'FORM','Proposal Title Search Form (FRIKPRO)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COPY_PROP_CODE_LBT")
		public void copyPropCodeLbt_buttonClick()
		{
			
				// HIDE_WINDOW('COPY_PROP'); Defect #43559
				// HIDE_WINDOW('COPY_PROP'); Defect #43559
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("COPY_BLOCK.COPY_PROP_CODE"), GNls.Fget(toStr("FRAPROP-0155"), toStr("FORM"), toStr("List of Proposal Codes (FRIPROP)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FRAPROP-0156"), toStr("FORM"), toStr("Proposal Title Search Form (FRIKPRO)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
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
		 GO_ITEM('FRBPROP_AGENCY_ADDR_SEQ_NUM');
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
			
				goItem(toStr("FRBPROP_AGENCY_ADDR_SEQ_NUM"));
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
		 * FRBPROP_EXIT_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_EXIT_1_BTN")
		public void frbpropExit1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ROLLBACK_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ROLLBACK_1_BTN")
		public void frbpropRollback1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SAVE_1_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SAVE_1_BTN")
		public void frbpropSave1Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_STATUS_CODE_LBT")
		public void frbpropStatusCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFF.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ORGN_CODE_RESP_OFF")
		public void frbpropOrgnCodeRespOff_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFF.WHEN-BUTTON-PRESSED
		 GO_ITEM('FRBPROP_ORGN_CODE_RESP_OFFICE');
G$_CHECK_FAILURE;
DO_KEY('LIST_VALUES');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFF.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_ORGN_CODE_RESP_OFF")
		public void frbpropOrgnCodeRespOff_buttonClick()
		{
			
				goItem(toStr("FRBPROP_ORGN_CODE_RESP_OFFICE"));
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_PROPOSAL_TYPE_LBT")
		public void frbpropProposalTypeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_CATEGORY_LBT")
		public void frbpropCategoryLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBPROP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DISPLAY_FRBPROP_CODE_LBT")
		public void displayFrbpropCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBPROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 :HOLD_PRESS := 'Y';
:GLOBAL.FORM_WAS_CALLED := 'Y';
g$_key_opt_menu('KEY_BLOCK.DISPLAY_FRBPROP_CODE',
                 G$_NLS.Get('FRAPROP-0157', 'FORM','List of Proposal Codes (FRIPROP)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAPROP-0158', 'FORM','Proposal Title Search Form (FRIKPRO)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBPROP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DISPLAY_FRBPROP_CODE_LBT")
		public void displayFrbpropCodeLbt_buttonClick()
		{
			
				getFormModel().getFormHeader().setHoldPress(toStr("Y"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(
						toStr("KEY_BLOCK.DISPLAY_FRBPROP_CODE"), 
						GNls.Fget(toStr("FRAPROP-0157"), toStr("FORM"), 
								toStr("List of Proposal Codes (FRIPROP)")), 
						toStr("LIST_VALUES"), 
						GNls.Fget(toStr("FRAPROP-0158"), toStr("FORM"), 
								toStr("Proposal Title Search Form (FRIKPRO)")), 
						toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SUB_CATEGORY_LBT")
		public void frbpropSubCategoryLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_CFDA_CODE_LBT")
		public void frbpropCfdaCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPLOC_LOCN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPLOC_LOCN_CODE_LBT")
//		public void frrplocLocnCodeLbt_click()
//		{
//			
//				getGIconBtnClass().whenMouseClick();
//			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="COPY_PROP")
		public void copyProp_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_PROP.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_ITEM');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COPY_PROP")
		public void copyProp_buttonClick()
		{
			
				// F2J_NOT_SUPPORTED *: Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER RATE_DOWN.WHEN-BUTTON-PRESSED
		 IF (:FRBPROP_PROBABILITY_RATE IS NOT NULL AND :FRBPROP_PROBABILITY_RATE <> 0) THEN
   :FRBPROP_PROBABILITY_RATE := :FRBPROP_PROBABILITY_RATE -1;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RATE_DOWN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="RATE_DOWN")
		public void rateDown_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ((!frbpropElement.getFrbpropProbabilityRate().isNull() && frbpropElement.getFrbpropProbabilityRate().notEquals(0)))
				{
					frbpropElement.setFrbpropProbabilityRate(frbpropElement.getFrbpropProbabilityRate().subtract(1));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RATE_UP.WHEN-BUTTON-PRESSED
		 IF (:FRBPROP_PROBABILITY_RATE IS NOT NULL AND :FRBPROP_PROBABILITY_RATE < 100) THEN
   :FRBPROP_PROBABILITY_RATE := :FRBPROP_PROBABILITY_RATE +1;
ElSIF :FRBPROP_PROBABILITY_RATE IS NULL THEN
   :FRBPROP_PROBABILITY_RATE := 1;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RATE_UP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="RATE_UP")
		public void rateUp_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ((!frbpropElement.getFrbpropProbabilityRate().isNull() && frbpropElement.getFrbpropProbabilityRate().lesser(100)))
				{
					frbpropElement.setFrbpropProbabilityRate(frbpropElement.getFrbpropProbabilityRate().add(1));
				}
				else if ( frbpropElement.getFrbpropProbabilityRate().isNull() ) {
					frbpropElement.setFrbpropProbabilityRate(toNumber(1));
				}
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
		 * FRBPROP_EXIT_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_EXIT_2_BTN")
		public void frbpropExit2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SAVE_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SAVE_2_BTN")
		public void frbpropSave2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ROLLBACK_2_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ROLLBACK_2_BTN")
		public void frbpropRollback2Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ROLLBACK_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ROLLBACK_5_BTN")
		public void frbpropRollback5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SAVE_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SAVE_5_BTN")
		public void frbpropSave5Btn_click()
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
		 * FRBPROP_EXIT_5_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_EXIT_5_BTN")
		public void frbpropExit5Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXIT_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_EXIT_4_BTN")
		public void frbpropExit4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_IC_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_BASI_CODE_IC_LBT")
		public void frbpropBasiCodeIcLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDR_CODE_RATE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_INDR_CODE_RATE_LBT")
		public void frbpropIndrCodeRateLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_COAS_CODE_IC_CS_LBT")
		public void frbpropCoasCodeIcCsLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_INDA_CODE_CHARGE_LBT")
		public void frbpropIndaCodeChargeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SAVE_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SAVE_4_BTN")
		public void frbpropSave4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ROLLBACK_4_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ROLLBACK_4_BTN")
		public void frbpropRollback4Btn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_INDD_CODE_DISTR_LBT")
		public void frbpropInddCodeDistrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_CS_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_BASI_CODE_CS_LBT")
		public void frbpropBasiCodeCsLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTR_CODE_RATE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_CSTR_CODE_RATE_LBT")
		public void frbpropCstrCodeRateLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTD_CODE_DISTR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_CSTD_CODE_DISTR_LBT")
		public void frbpropCstdCodeDistrLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTA_CODE_CHARGE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_CSTA_CODE_CHARGE_LBT")
		public void frbpropCstaCodeChargeLbt_click()
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
		 * FRBPROP_PI_ID_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_PI_ID_CODE_LBT")
		public void frbpropPiIdCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_COAS_CODE_LBT")
		public void frbpropCoasCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_AGENCY_CODE_LBT")
		public void frbpropAgencyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_AGENCY_ADDR_CODE_LBT")
		public void frbpropAgencyAddrCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_ORIG_PREP_DATE_DBT")
		public void frbpropOrigPrepDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_ORIG_PREP_DATE_DBT")
		public void frbpropOrigPrepDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_DUE_DATE_DBT")
		public void frbpropDueDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_DUE_DATE_DBT")
		public void frbpropDueDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_SUBMITTED_DATE_DBT")
		public void frbpropSubmittedDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_SUBMITTED_DATE_DBT")
		public void frbpropSubmittedDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_STATUS_DATE_DBT")
		public void frbpropStatusDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_STATUS_DATE_DBT")
		public void frbpropStatusDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_PROJECT_START_DATE_DBT")
		public void frbpropProjectStartDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('FRAPROP-0159','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('FRAPROP-0160','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_PROJECT_START_DATE_DBT")
		public void frbpropProjectStartDateDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0159"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || 
							(
//							SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") &&
							(INullable)getItemValue(getCursorItem())).isNull() || //SupportClasses.AppContext.CursorValue.isNull()) || 
							(getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
//						copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
						copy(getItemValue(getCursorItem()),"GLOBAL.VALUE");						
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction("NEXT_ITEM");
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0160"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_PROJECT_END_DATE_DBT")
		public void frbpropProjectEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_PROJECT_END_DATE_DBT")
		public void frbpropProjectEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_BUDG_PRD_START_DAT_DBT")
		public void frbpropBudgPrdStartDatDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_START_DAT_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('FRAPROP-0161','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('FRAPROP-0162','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_BUDG_PRD_START_DAT_DBT")
		public void frbpropBudgPrdStartDatDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0161"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || 
							(
//								SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") &&
								(INullable)getItemValue(getCursorItem())).isNull() //SupportClasses.AppContext.CursorValue.isNull()) 
								|| (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) 
								|| (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) 
								|| (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE"))
							)
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
//						copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
						copy(getItemValue(getCursorItem()),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction("NEXT_ITEM");
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0162"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_BUDG_PRD_END_DATE_DBT")
		public void frbpropBudgPrdEndDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_BUDG_PRD_END_DATE_DBT")
		public void frbpropBudgPrdEndDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRBPROP_EXPECTED_GRANT_DAT_DBT")
		public void frbpropExpectedGrantDatDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRBPROP_EXPECTED_GRANT_DAT_DBT")
		public void frbpropExpectedGrantDatDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
	
	
}

