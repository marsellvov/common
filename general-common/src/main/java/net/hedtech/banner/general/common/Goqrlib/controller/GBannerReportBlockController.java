package net.hedtech.banner.general.common.Goqrlib.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.banner.general.common.Goqrlib.model.*;
import net.hedtech.banner.general.common.Goqrlib.*;
import net.hedtech.banner.general.common.Goqrlib.services.*;

		
public class GBannerReportBlockController extends AbstractSupportCodeObject  {


	
	public GBannerReportBlockController(ISupportCodeContainer container) {
		super(container);
	}
		
		
		
	@Override
	public GoqrlibTaskPart getContainer() {
		return (GoqrlibTaskPart)super.getContainer();
	}

	public GoqrlibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gBannerReportBlock_Save()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-UP
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void gBannerReportBlock_MoveUp()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-DOWN
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void gBannerReportBlock_MoveDown()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-CREREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gBannerReportBlock_CreateRecord()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-DELREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gBannerReportBlock_DeleteRecord()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-ENTER
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER")
		public void gBannerReportBlock_KeyEnter()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-EXEQRY
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gBannerReportBlock_ExecuteQuery()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-NXTREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gBannerReportBlock_NextRecord()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-NXTSET
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void gBannerReportBlock_KeyNxtset()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-NXTBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gBannerReportBlock_NextBlock()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-PRVBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gBannerReportBlock_PreviousBlock()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-PRVREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gBannerReportBlock_PreviousRecord()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-CLRBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void gBannerReportBlock_keyClearBlock()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER G$_BANNER_REPORT_BLOCK.KEY-CLRFRM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_BANNER_REPORT_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gBannerReportBlock_ClearTask()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_DESFORMAT.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_DESFORMAT(:OREP_DESFORMAT,
	                                        :OREP_DESTYPE,
	                                        :OREP_DESNAME,
	                                        :OREP_EXECUTION_MODE,
	                                        :OREP_COMM_MODE,
	                                        :OREP_PARAMFORM_DESIGNATION,
	                                        lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;

      

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_DESFORMAT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_DESFORMAT")
		public void orepDesformat_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editDesformat(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_DESTYPE.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_DESTYPE(:OREP_DESFORMAT,
	                                      :OREP_DESTYPE,
	                                      :OREP_DESNAME,
	                                      :OREP_EXECUTION_MODE,
	                                      :OREP_COMM_MODE,
	                                      :OREP_PARAMFORM_DESIGNATION,
	                                      lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_DESTYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_DESTYPE")
		public void orepDestype_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editDestype(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_DESTYPE.WHEN-LIST-CHANGED
		 BEGIN
	IF :OREP_DESTYPE IN ('FILE','MAIL','PRINTER') THEN
		:OREP_EXECUTION_MODE        := 'BATCH';
		:OREP_COMM_MODE             := 'ASYNC';
		:OREP_PARAMFORM_DESIGNATION := 'NO';
	END IF;
	IF :OREP_DESTYPE = 'CACHE' THEN
		:OREP_EXECUTION_MODE        := 'RUNTIME';
		:OREP_COMM_MODE             := 'SYNC';
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_DESTYPE.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="OREP_DESTYPE")
		public void orepDestype_listChange()
		{
			
				if ( in(getFormModel().getGBannerReportBlock().getOrepDestype(), "FILE", "MAIL", "PRINTER").getValue() )
				{
					getFormModel().getGBannerReportBlock().setOrepExecutionMode(toStr("BATCH"));
					getFormModel().getGBannerReportBlock().setOrepCommMode(toStr("ASYNC"));
					getFormModel().getGBannerReportBlock().setOrepParamformDesignation(toStr("NO"));
				}
				if ( getFormModel().getGBannerReportBlock().getOrepDestype().equals("CACHE") )
				{
					getFormModel().getGBannerReportBlock().setOrepExecutionMode(toStr("RUNTIME"));
					getFormModel().getGBannerReportBlock().setOrepCommMode(toStr("SYNC"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_DESNAME.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_DESNAME(:OREP_DESFORMAT,
	                                      :OREP_DESTYPE,
	                                      :OREP_DESNAME,
	                                      :OREP_EXECUTION_MODE,
	                                      :OREP_COMM_MODE,
	                                      :OREP_PARAMFORM_DESIGNATION,
	                                      lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_DESNAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_DESNAME")
		public void orepDesname_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editDesname(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_EXECUTION_MODE.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_EXECUTION_MODE(:OREP_DESFORMAT,
	                                             :OREP_DESTYPE,
       	                                       :OREP_DESNAME,
	                                             :OREP_EXECUTION_MODE,
	                                             :OREP_COMM_MODE,
	                                             :OREP_PARAMFORM_DESIGNATION,
	                                             lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_EXECUTION_MODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_EXECUTION_MODE")
		public void orepExecutionMode_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editExecutionMode(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_COMM_MODE.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_COMM_MODE(:OREP_DESFORMAT,
	                                        :OREP_DESTYPE,
	                                        :OREP_DESNAME,
	                                        :OREP_EXECUTION_MODE,
	                                        :OREP_COMM_MODE,
	                                        :OREP_PARAMFORM_DESIGNATION,
	                                        lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_COMM_MODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_COMM_MODE")
		public void orepCommMode_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editCommMode(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_PARAMFORM_DESIGNATION.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_PARAMFORM_DESIG(:OREP_DESFORMAT,
	                                              :OREP_DESTYPE,
	                                              :OREP_DESNAME,
	                                              :OREP_EXECUTION_MODE,
	                                              :OREP_COMM_MODE,
	                                              :OREP_PARAMFORM_DESIGNATION,
	                                              lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_PARAMFORM_DESIGNATION.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="OREP_PARAMFORM_DESIGNATION")
		public void orepParamformDesignation_validate()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editParamformDesig(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_SUBMIT_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
  lv_message VARCHAR2(255) := '';
BEGIN
	G$_BANNER_REPORT_EDITING.EDIT_OREP_ROW(:OREP_DESFORMAT,
	                                       :OREP_DESTYPE,
	                                       :OREP_DESNAME,
	                                       :OREP_EXECUTION_MODE,
	                                       :OREP_COMM_MODE,
	                                       :OREP_PARAMFORM_DESIGNATION,
	                                       lv_message);
	IF lv_message IS NOT NULL THEN
	  MESSAGE(lv_message);
	  RAISE FORM_TRIGGER_FAILURE;
	END IF;
-- --
-- --
  IF NOT G$_BANNER_REPORT_PROCESSING.PROCESS_REPORT(NAME_IN('G$_BANNER_REPORT_HEADER.OREP_NAME'),
  	                                                NAME_IN('G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME'),
  	                                                NAME_IN('G$_BANNER_REPORT_HEADER.OREP_SERVICE'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_DESFORMAT'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_DESTYPE'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_DESNAME'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE'),
  	                                                NAME_IN('G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION'),
  	                                                NAME_IN('G$_BANNER_REPORT_HEADER.LIST_PARAM_NAMES')) THEN
    MESSAGE(G$_NLS.GET('GOQRLIB-0000','FORM','*ERROR* Report Failed to Run'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
	CLEAR_BLOCK(NO_VALIDATE);
	GO_ITEM(NAME_IN('G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM'));
	G$_BANNER_REPORT_PROCESSING.DISABLE_REPORT_BLOCK_ITEMS;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_SUBMIT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OREP_SUBMIT_BTN")
		public void orepSubmitBtn_buttonClick()
		{
			
				{
					Ref<NString> lvMessage = new Ref<NString>(toStr(""));
					getContainer().getGoqorep().getGBannerReportEditing().editOrepRow(getFormModel().getGBannerReportBlock().getOrepDesformat(), getFormModel().getGBannerReportBlock().getOrepDestype(), getFormModel().getGBannerReportBlock().getOrepDesname(), getFormModel().getGBannerReportBlock().getOrepExecutionMode(), getFormModel().getGBannerReportBlock().getOrepCommMode(), getFormModel().getGBannerReportBlock().getOrepParamformDesignation(), lvMessage);
					if ( !lvMessage.val.isNull() )
					{
						errorMessage(lvMessage.val);
						throw new ApplicationException();
					}
					//  --
					//  --
					if ( getContainer().getGoqorep().getGBannerReportProcessing().processReport(getNameIn("G$_BANNER_REPORT_HEADER.OREP_NAME"), getNameIn("G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME"), getNameIn("G$_BANNER_REPORT_HEADER.OREP_SERVICE"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_DESFORMAT"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_DESTYPE"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_DESNAME"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE"), getNameIn("G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION"), getNameIn("G$_BANNER_REPORT_HEADER.LIST_PARAM_NAMES")).not() )
					{
						errorMessage(GNls.Fget(toStr("GOQRLIB-0000"), toStr("FORM"), toStr("*ERROR* Report Failed to Run")));
						throw new ApplicationException();
					}
					clearBlock(TaskServices.NO_VALIDATE);
					goItem(getNameIn("G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM"));
					getContainer().getGoqorep().getGBannerReportProcessing().disableReportBlockItems();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OREP_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
	CLEAR_BLOCK(NO_VALIDATE);
	GO_ITEM(NAME_IN('G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM'));
  G$_BANNER_REPORT_PROCESSING.DISABLE_REPORT_BLOCK_ITEMS;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OREP_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OREP_CANCEL_BTN")
		public void orepCancelBtn_buttonClick()
		{
			
				clearBlock(TaskServices.NO_VALIDATE);
				goItem(getNameIn("G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM"));
				getContainer().getGoqorep().getGBannerReportProcessing().disableReportBlockItems();
			}

		
	
	
}

