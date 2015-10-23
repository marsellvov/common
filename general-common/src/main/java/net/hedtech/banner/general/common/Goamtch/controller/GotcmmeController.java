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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GotcmmeController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public GotcmmeController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER GOTCMME.PRE-BLOCK
		 BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
--
  :FORM_HEADER.HOLD_BLK_ITEM := :SYSTEM.CURSOR_ITEM;
  :FORM_HEADER.ADDR_FAILED_LIT := G$_NLS.Get('GOAMTCH-0038','FORM',' Address record create failed;');
  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gotcmme_blockIn()
		{
			
				executeAction("CHECK_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getFormModel().getFormHeader().setHoldBlkItem(toStr(getCursorItem()));
				getFormModel().getFormHeader().setAddrFailedLit(GNls.Fget(toStr("GOAMTCH-0038"), toStr("FORM"), toStr(" Address record create failed;")));
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.WHEN-NEW-BLOCK-INSTANCE
		 DECLARE
	lv_item VARCHAR2(61) := :SYSTEM.CURSOR_ITEM;
BEGIN
  SET_GOVCMID_COUNT('');
--
  EXECUTE_TRIGGER('DISABLE_KEYS');
	G$_CHECK_FAILURE;
-- 
  IF NVL(:FORM_HEADER.QUERIED_DETAIL,'N') = 'Y' THEN
    :COMMIT_COMPLETED := 'Y';
    REMOVE_CMRT_RECORDS;
--
    ENABLE_MATCH_TAB;
--
    GO_BLOCK('GOVCMRT_MATCH');
    SYNCHRONIZE;
    IF :GOVCMRT_MATCH.ROWID IS NOT NULL THEN
      CLEAR_BLOCK;
    END IF;
    :FORM_HEADER.QUERIED_DETAIL := 'N';
    :FORM_HEADER.READ_IMAGES := 'N';
--
    IF lv_item IS NOT NULL THEN
    	GO_ITEM(lv_item);
    ELSE
      GO_BLOCK('GOTCMME');
    END IF;
  END IF;
--
  EXECUTE_TRIGGER('RESET_TAB_PAGES');
	G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('DISABLE_LOCAL_BTNS');
	G$_CHECK_FAILURE;
--
  IF :GOTCMME.ROWID IS NULL THEN
    :SYSTEM.MESSAGE_LEVEL := '5';
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL := '0';
    CLEAR_MESSAGE;
  END IF;
--
  IF :GOTCMME.ROWID IS NULL THEN
  	IF :KEY_BLOCK.KEYBLOCK_ATYP_CODE IS NOT NULL THEN
  		:GOTCMME.GOTCMME_ATYP_CODE := :KEY_BLOCK.KEYBLOCK_ATYP_CODE;
  		GO_ITEM('GOTCMME.GOTCMME_ATYP_CODE');
  		NEXT_ITEM;
  	END IF;
--
  	IF :KEY_BLOCK.KEYBLOCK_EMAL_CODE IS NOT NULL THEN
  	  :GOTCMME.GOTCMME_EMAL_CODE := :KEY_BLOCK.KEYBLOCK_EMAL_CODE;
  		GO_ITEM('GOTCMME.GOTCMME_EMAL_CODE');
  		NEXT_ITEM;
  	END IF;
--
  	IF :KEY_BLOCK.KEYBLOCK_TELE_CODE IS NOT NULL THEN
  		:GOTCMME.GOTCMME_TELE_CODE := :KEY_BLOCK.KEYBLOCK_TELE_CODE;
  		GO_ITEM('GOTCMME.GOTCMME_TELE_CODE');
  		NEXT_ITEM;
  	END IF;
--
-- Navigate to the appropriate item based on source code type.
--
    IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'C' THEN
      GO_ITEM('GOTCMME.NONPERSON_NAME');
    ELSE
      GO_ITEM('GOTCMME.LAST_NAME');
    END IF;
--
  END IF;
--
  :COMMIT_COMPLETED := 'N';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gotcmme_blockChange()
		{
			

				GovcmrtMatchAdapter govcmrtMatchElement = (GovcmrtMatchAdapter)this.getFormModel().getGovcmrtMatch().getRowAdapter(true);
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				
                if(govcmrtMatchElement==null){
                	return;
                }
                if(gotcmmeElement==null){
                	return;
                }


				{
					NString lvItem = getCursorItem();
					this.getTask().getServices().setGovcmidCount(toInt(""));
					// 
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					//  
					if ( isNull(getFormModel().getFormHeader().getQueriedDetail(), "N").equals("Y") )
					{
						getFormModel().getFormHeader().setCommitCompleted(toStr("Y"));
						this.getTask().getServices().removeCmrtRecords();
						// 
						this.getTask().getServices().enableMatchTab();
						// 
						goBlock(toStr("GOVCMRT_MATCH"));
						
						
						if ( !govcmrtMatchElement.getRowState().equals(DataRowStatus.INSERTED))
						{
							clearBlock();
						}
						getFormModel().getFormHeader().setQueriedDetail(toStr("N"));
						getFormModel().getFormHeader().setReadImages(toStr("N"));
						// 
						if ( !lvItem.isNull() )
						{
							goItem(lvItem);
						}
						else {
							goBlock(toStr("GOTCMME"));
						}
					}
					// 
					executeAction("RESET_TAB_PAGES");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("DISABLE_LOCAL_BTNS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					if ( gotcmmeElement.getRowState().equals(DataRowStatus.INSERTED) )
					{
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						executeQuery();
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						clearMessage();
					}
					// 
					if ( gotcmmeElement.getRowState().equals(DataRowStatus.INSERTED))
					{
						if ( !getFormModel().getKeyBlock().getKeyblockAtypCode().isNull() )
						{
							gotcmmeElement.setGotcmmeAtypCode(getFormModel().getKeyBlock().getKeyblockAtypCode());
							goItem(toStr("GOTCMME.GOTCMME_ATYP_CODE"));
							nextItem();
						}
						// 
						if ( !getFormModel().getKeyBlock().getKeyblockEmalCode().isNull() )
						{
							gotcmmeElement.setGotcmmeEmalCode(getFormModel().getKeyBlock().getKeyblockEmalCode());
							goItem(toStr("GOTCMME.GOTCMME_EMAL_CODE"));
							nextItem();
						}
						// 
						if ( !getFormModel().getKeyBlock().getKeyblockTeleCode().isNull() )
						{
							gotcmmeElement.setGotcmmeTeleCode(getFormModel().getKeyBlock().getKeyblockTeleCode());
							goItem(toStr("GOTCMME.GOTCMME_TELE_CODE"));
							nextItem();
						}
						// 
						//  Navigate to the appropriate item based on source code type.
						// 
						if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("C") )
						{
							goItem(toStr("GOTCMME.NONPERSON_NAME"));
						}
						else {
							goItem(toStr("GOTCMME.LAST_NAME"));
						}
					}
					// 
					getFormModel().getFormHeader().setCommitCompleted(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.POST-QUERY
		 IF :GOTCMME.GOTCMME_ENTITY_CDE = 'C' THEN
  :GOTCMME.NONPERSON_NAME := :GOTCMME.GOTCMME_LAST_NAME;
ELSE
  :GOTCMME.LAST_NAME := :GOTCMME.GOTCMME_LAST_NAME;
END IF;
-- -- -- --
-- -- -- --
:GOTCMME.HOLD_GOTCMME_SSN := :GOTCMME.GOTCMME_SSN;
-- -- -- --
-- -- -- --
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gotcmme_AfterQuery(RowAdapterEvent args)
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)args.getRow();


				try
				{
					gotcmmeElement.setLockDbValues(true);
                                                                 try {  
                        this.gotcmmeStatCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gotcmmeCntyCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.gotcmmeNatnCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

			if ( gotcmmeElement.getGotcmmeEntityCde().equals("C") )
			{
				gotcmmeElement.setNonpersonName(gotcmmeElement.getGotcmmeLastName());
			}
			else {
				gotcmmeElement.setLastName(gotcmmeElement.getGotcmmeLastName());
			}
			//  -- -- --
			//  -- -- --
			gotcmmeElement.setHoldGotcmmeSsn(gotcmmeElement.getGotcmmeSsn());
			

				} finally { 
					gotcmmeElement.setLockDbValues(false);
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-CLRBLK
		 BEGIN
  IF :FORM_HEADER.ALLOW_CLEAR_BLOCK = 'N' THEN
    G$_INVALID_FUNCTION_MSG;
  ELSE
  	CLEAR_BLOCK;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void gotcmme_keyClearBlock()
		{
			
				if ( getFormModel().getFormHeader().getAllowClearBlock().equals("N") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					clearBlock();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-CLRFRM
		 BEGIN
	IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN        
  --G$_INVALID_FUNCTION_MSG;  --commented for defect 1-1V1V4D
    MESSAGE(G$_NLS.GET('GOAMTCH-0039','FORM','*ERROR* ID and Source cannot be changed.'),no_acknowledge); --Added for defect 1-1V1V4D
    RAISE FORM_TRIGGER_FAILURE;
  END IF;  
--
	-- 74-G
  --CHECK_CLRFRM;
  --G$_CHECK_FAILURE;
--
  IF :SYSTEM.RECORD_STATUS IN ('INSERT','NEW') THEN
  	DELETE_RECORD;
  ELSE
  	IF :SYSTEM.RECORD_STATUS = 'CHANGED' THEN
      :SYSTEM.MESSAGE_LEVEL := '5';
      COMMIT_FORM;
      :SYSTEM.MESSAGE_LEVEL := '0';
  	END IF;
--
    REMOVE_CMME_RECORDS;
  END IF;
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CHECK_BTN',ENABLED,PROPERTY_FALSE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gotcmme_ClearTask()
		{
			
				if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
				{
					// G$_INVALID_FUNCTION_MSG;  --commented for defect 1-1V1V4D
					errorMessage(GNls.Fget(toStr("GOAMTCH-0039"), toStr("FORM"), toStr("*ERROR* ID and Source cannot be changed.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					// Added for defect 1-1V1V4D
					throw new ApplicationException();
				}
				// 
				//  74-G
				// CHECK_CLRFRM;
				// G$_CHECK_FAILURE;
				// 
				if ( (getRecordStatus().equals("INSERT") || getRecordStatus().equals("NEW")) )
				{
					deleteRecord();
				}
				else {
					if ( getRecordStatus().equals("CHANGED") )
					{
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						commitTask();
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
					}
					// 
					this.getTask().getServices().removeCmmeRecords();
				}
				setItemEnabled("BUTTON_CONTROL_BLOCK.CHECK_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-CLRREC
		 BEGIN
  IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN
    
    G$_INVALID_FUNCTION_MSG;
  ELSE
  	CLEAR_RECORD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gotcmme_ClearRecord()
		{
			
				if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					clearRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-COMMIT
		 START_MATCHING_PROCESS;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gotcmme_Save()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				this.getTask().getServices().startMatchingProcess(gotcmmeElement);
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-DELREC
		 BEGIN
  IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN
    
    G$_INVALID_FUNCTION_MSG;
  ELSE
  	DELETE_RECORD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gotcmme_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					deleteRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-NXTBLK
		 START_MATCHING_PROCESS;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gotcmme_NextBlock()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				this.getTask().getServices().startMatchingProcess(gotcmmeElement);
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-NXTKEY
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void gotcmme_KeyNxtkey()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-NXTREC
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gotcmme_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-NXTSET
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void gotcmme_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.KEY-PRVREC
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gotcmme_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.ADDR_DEFAULT_NXTFLD
		 IF G$_CITY_STATE_NATN(:GOTCMME.GOTCMME_ZIP,
                      :GOTCMME.GOTCMME_CITY,
                      :GOTCMME.GOTCMME_STAT_CODE,
                      :GOTCMME.GOTCMME_NATN_CODE,
                      :GOTCMME.GOTCMME_CNTY_CODE) THEN
  GO_ITEM('GOTCMME.GOTCMME_STAT_CODE');
ELSE
  NEXT_ITEM;
  NEXT_ITEM;
  PREVIOUS_ITEM;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.ADDR_DEFAULT_NXTFLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADDR_DEFAULT_NXTFLD")
		public void gotcmme_AddrDefaultNxtfld()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }
				Ref<NString> zipIn_ref = new Ref<NString>(gotcmmeElement.getGotcmmeZip());
				Ref<NString> cityOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeCity());
				Ref<NString> stateOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeStatCode());
				Ref<NString> natnOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeNatnCode());
				Ref<NString> cntyOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeCntyCode());


				if ( getTask().getGoqrpls().gCityStateNatn(zipIn_ref, cityOut_ref, stateOut_ref, natnOut_ref, cntyOut_ref).getValue() )
				{
					goItem(toStr("GOTCMME.GOTCMME_STAT_CODE"));
				}
				else {
					nextItem();
					nextItem();
					previousItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.CHECK_ADDRESS_EXISTS
		 BEGIN
  IF (:GOTCMME.GOTCMME_CITY IS NULL) AND
     (:GOTCMME.GOTCMME_STAT_CODE IS NULL) AND
     (:GOTCMME.GOTCMME_CNTY_CODE IS NULL) AND
     (:GOTCMME.GOTCMME_NATN_CODE IS NULL) THEN
    :GOTCMME.NO_ADDR_INFO := 1;
  ELSE
    :GOTCMME.NO_ADDR_INFO := 0;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.CHECK_ADDRESS_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS_EXISTS")
		public void gotcmme_CheckAddressExists()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( (gotcmmeElement.getGotcmmeCity().isNull()) && (gotcmmeElement.getGotcmmeStatCode().isNull()) && (gotcmmeElement.getGotcmmeCntyCode().isNull()) && (gotcmmeElement.getGotcmmeNatnCode().isNull()) )
				{
					gotcmmeElement.setNoAddrInfo(toNumber(1));
				}
				else {
					gotcmmeElement.setNoAddrInfo(toNumber(0));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME.CHECK_MULTIPLE_ZIPS
		 --
-- Added the following procedure to check for Multiple cities which 
-- have the same zip code and displays a message.
--
DECLARE
	lv_cnt PLS_INTEGER;
  CURSOR PTI_CURSOR IS
    SELECT COUNT(*)
      FROM GTVZIPC
     WHERE GTVZIPC_CODE = :GOTCMME.GOTCMME_ZIP;
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO lv_cnt;
  CLOSE PTI_CURSOR;
--
  IF lv_cnt > 1 THEN 
    MESSAGE(G$_NLS.Get('GOAMTCH-0040','FORM','*WARNING* Multiple Cities exist for this ZIP/Postal code; press LIST to select one.'));
  END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME.CHECK_MULTIPLE_ZIPS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MULTIPLE_ZIPS")
		public void gotcmme_CheckMultipleZips()
		{
			
				// 
				//  Added the following procedure to check for Multiple cities which 
				//  have the same zip code and displays a message.
				// 

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				int rowCount = 0;
				{
					NInteger lvCnt= NInteger.getNull();
					String sqlptiCursor = "SELECT COUNT(*) " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :GOTCMME_GOTCMME_ZIP ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("GOTCMME_GOTCMME_ZIP", gotcmmeElement.getGotcmmeZip());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							lvCnt = ptiCursorResults.getInteger(0);
						}
						ptiCursor.close();
						// 
						if ( lvCnt.greater(1) )
						{
							warningMessage(GNls.Fget(toStr("GOAMTCH-0040"), toStr("FORM"), toStr("*WARNING* Multiple Cities exist for this ZIP/Postal code; press LIST to select one.")));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER LAST_NAME.WHEN-VALIDATE-ITEM
		 IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'B' THEN
  IF :GOTCMME.LAST_NAME IS NOT NULL THEN
    :GOTCMME.GOTCMME_LAST_NAME := :GOTCMME.LAST_NAME;
  END IF;
  --
  IF :GOTCMME.LAST_NAME IS NOT NULL OR
  	 :GOTCMME.GOTCMME_FIRST_NAME IS NOT NULL OR
  	 :GOTCMME.GOTCMME_MI IS NOT NULL THEN
    DISABLE_NONPERSON;
  ELSE
    ENABLE_NONPERSON;
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LAST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="LAST_NAME")
		public void lastName_validate()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }

				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("B") )
				{
					if ( !gotcmmeElement.getLastName().isNull() )
					{
						gotcmmeElement.setGotcmmeLastName(gotcmmeElement.getLastName());
					}
					// 
					if ( !gotcmmeElement.getLastName().isNull() || !gotcmmeElement.getGotcmmeFirstName().isNull() || !gotcmmeElement.getGotcmmeMi().isNull() )
					{
						this.getTask().getServices().disableNonperson();
					}
					else {
						this.getTask().getServices().enableNonperson();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER LAST_NAME.POST-TEXT-ITEM
		 -- 73-1
IF  :GOTCMME.LAST_NAME IS    NULL 
AND NVL(:GOTCMME.LAST_NAME,'X') <> NVL(:GOTCMME.GOTCMME_LAST_NAME,'X') THEN
    :GOTCMME.GOTCMME_LAST_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LAST_NAME.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="LAST_NAME", function=KeyFunction.ITEM_OUT)
		public void lastName_itemOut()
		{
			
				//  73-1

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				//  73-1
				if ( gotcmmeElement.getLastName().isNull() && isNull(gotcmmeElement.getLastName(), "X").notEquals(isNull(gotcmmeElement.getGotcmmeLastName(), "X")) )
				{
					gotcmmeElement.setGotcmmeLastName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_FIRST_NAME.WHEN-VALIDATE-ITEM
		 IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'B' THEN
  IF :GOTCMME.LAST_NAME IS NOT NULL OR
	   :GOTCMME.GOTCMME_FIRST_NAME IS NOT NULL OR
 	   :GOTCMME.GOTCMME_MI IS NOT NULL THEN
    DISABLE_NONPERSON;
  ELSE
    ENABLE_NONPERSON;
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_FIRST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_FIRST_NAME")
		public void gotcmmeFirstName_validate()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("B") )
				{
					if ( !gotcmmeElement.getLastName().isNull() || !gotcmmeElement.getGotcmmeFirstName().isNull() || !gotcmmeElement.getGotcmmeMi().isNull() )
					{
						this.getTask().getServices().disableNonperson();
					}
					else {
						this.getTask().getServices().enableNonperson();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_MI.WHEN-VALIDATE-ITEM
		 IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'B' THEN
  IF :GOTCMME.LAST_NAME IS NOT NULL OR
	   :GOTCMME.GOTCMME_FIRST_NAME IS NOT NULL OR
 	   :GOTCMME.GOTCMME_MI IS NOT NULL THEN
    DISABLE_NONPERSON;
  ELSE
    ENABLE_NONPERSON;
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_MI.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_MI")
		public void gotcmmeMi_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("B") )
				{
					if ( !gotcmmeElement.getLastName().isNull() || !gotcmmeElement.getGotcmmeFirstName().isNull() || !gotcmmeElement.getGotcmmeMi().isNull() )
					{
						this.getTask().getServices().disableNonperson();
					}
					else {
						this.getTask().getServices().enableNonperson();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_ATYP_CODE")
		public void gotcmmeAtypCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_ATYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeAtypCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOTCMME_ATYP_CODE")
		public void gotcmmeAtypCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOTCMME_ATYP_CODE")
		public void gotcmmeAtypCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_ATYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeAtypCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ATYP_CODE.POST-TEXT-ITEM
		 BEGIN
  IF :GOTCMME.GOTCMME_ATYP_CODE IS NULL THEN
  	:GOTCMME.ATYP_DESCRIPTION := '';
  END IF;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeAtypCode_itemOut()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeAtypCode().isNull() )
				{
					gotcmmeElement.setAtypDescription(toStr(""));
				}
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ATYP_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_atyp_desc STVATYP.STVATYP_DESC%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_ATYP_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_atyp_desc := GB_STVATYP.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_ATYP_CODE);
  IF lv_atyp_desc IS NULL THEN
    :GOTCMME.ATYP_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0041','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.ATYP_DESCRIPTION := lv_atyp_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_ATYP_CODE")
		public void gotcmmeAtypCode_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
	
                if(gotcmmeElement==null){
                	return;
                }


				{
					NString lvAtypDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeAtypCode().isNull() )
					{
						return ;
					}
					// 
					lvAtypDesc = GbStvatyp.fGetDescription(gotcmmeElement.getGotcmmeAtypCode());
					if ( lvAtypDesc.isNull() )
					{
						gotcmmeElement.setAtypDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0041"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setAtypDescription(lvAtypDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_ATYP_CODE_LBT")
		public void gotcmmeAtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ATYP_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ATYP_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void atypDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_STAT_CODE")
		public void gotcmmeStatCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeStatCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOTCMME_STAT_CODE")
		public void gotcmmeStatCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOTCMME_STAT_CODE")
		public void gotcmmeStatCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeStatCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_STAT_CODE.POST-TEXT-ITEM
		 BEGIN
  IF :GOTCMME.GOTCMME_STAT_CODE IS NULL THEN
  	:GOTCMME.STAT_DESCRIPTION := '';
  END IF;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeStatCode_itemOut()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
	
                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeStatCode().isNull() )
				{
					gotcmmeElement.setStatDescription(toStr(""));
				}
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_STAT_CODE.POST-CHANGE
		 DECLARE
	lv_stat_desc STVSTAT.STVSTAT_DESC%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_STAT_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_stat_desc := GB_STVSTAT.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_STAT_CODE);
  IF lv_stat_desc IS NULL THEN
    :GOTCMME.STAT_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0042','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.STAT_DESCRIPTION := lv_stat_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOTCMME_STAT_CODE")
		public void gotcmmeStatCode_PostChange()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if(gotcmmeElement.getGotcmmeStatCode().isNull())
		return;
				{
					NString lvStatDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeStatCode().isNull() )
					{
						return ;
					}
					// 
					lvStatDesc = GbStvstat.fGetDescription(gotcmmeElement.getGotcmmeStatCode());
					if ( lvStatDesc.isNull() )
					{
						gotcmmeElement.setStatDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0042"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setStatDescription(lvStatDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_STAT_CODE_LBT")
		public void gotcmmeStatCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STAT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STAT_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void statDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ZIP.KEY-LISTVAL
		 BEGIN
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GTVZIPC','QUERY');
--
  IF :GLOBAL.VALUE IS NULL THEN
    RETURN;
  ELSE
    :GOTCMME.GOTCMME_ZIP  := :GLOBAL.VALUE;
    :GOTCMME.GOTCMME_CITY := :GLOBAL.VALUE_2;
    IF G$_CITY_STATE_NATN3(:GOTCMME.GOTCMME_ZIP,
                           :GOTCMME.GOTCMME_CITY,
                           :GOTCMME.GOTCMME_STAT_CODE,
                           :GOTCMME.GOTCMME_NATN_CODE,
                           :GOTCMME.GOTCMME_CNTY_CODE) THEN
      IF :GOTCMME.GOTCMME_NATN_CODE IS NULL THEN
         :GOTCMME.NATN_DESCRIPTION := NULL;
      END IF;
      -- added GO_ITEM, replacing PREVIOUS_ITEM
      --PREVIOUS_ITEM;
      GO_ITEM('GOTCMME.GOTCMME_STAT_CODE');
      NEXT_ITEM;
      NEXT_ITEM;
      NEXT_ITEM;
      PREVIOUS_ITEM;
    ELSE
      PREVIOUS_ITEM;
      PREVIOUS_ITEM;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GOTCMME_ZIP", function=KeyFunction.LIST_VALUES)
		public void gotcmmeZip_ListValues()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }
				Ref<NString> zipIn_ref = new Ref<NString>(gotcmmeElement.getGotcmmeZip());
				Ref<NString> cityIn_ref = new Ref<NString>(gotcmmeElement.getGotcmmeCity());
				Ref<NString> stateOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeStatCode());
				Ref<NString> natnOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeNatnCode());
				Ref<NString> cntyOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeCntyCode());
				
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GTVZIPC"), toStr("QUERY"));
				// 
				if ( getGlobal("VALUE").isNull() )
				{
					return ;
				}
				else {
					gotcmmeElement.setGotcmmeZip(getGlobal("VALUE"));
					gotcmmeElement.setGotcmmeCity(getGlobal("VALUE_2"));
//					zipIn_ref.val = gotcmmeElement.getGotcmmeZip();
//					cityIn_ref.val = gotcmmeElement.getGotcmmeCity();
					if ( getTask().getGoqrpls().gCityStateNatn3(zipIn_ref, cityIn_ref, stateOut_ref, natnOut_ref, cntyOut_ref).getValue() )
					{
						if ( gotcmmeElement.getGotcmmeNatnCode().isNull() )
						{
							gotcmmeElement.setNatnDescription(toStr(null));
						}
						//  added GO_ITEM, replacing PREVIOUS_ITEM
						// PREVIOUS_ITEM;
						goItem(toStr("GOTCMME.GOTCMME_STAT_CODE"));
						nextItem();
						nextItem();
						nextItem();
						previousItem();
					}
					else {
						previousItem();
						previousItem();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ZIP.KEY-NEXT-ITEM
		 IF :GOTCMME.GOTCMME_ZIP IS NULL THEN
  NEXT_ITEM;
ELSE
  EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS');
  IF (:GOTCMME.NO_ADDR_INFO = 1) THEN
    EXECUTE_TRIGGER('ADDR_DEFAULT_NXTFLD');
    EXECUTE_TRIGGER('CHECK_MULTIPLE_ZIPS');
  END IF;
  NEXT_FIELD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ZIP.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_ZIP", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeZip_keyNexItem()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeZip().isNull() )
				{
					nextItem();
				}
				else {
					executeAction("CHECK_ADDRESS_EXISTS");
					if ((gotcmmeElement.getNoAddrInfo().equals(1)))
					{
						executeAction("ADDR_DEFAULT_NXTFLD");
						executeAction("CHECK_MULTIPLE_ZIPS");
					}
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ZIP.KEY-PREV-ITEM
		 IF :GOTCMME.GOTCMME_ZIP IS NULL THEN
  PREVIOUS_ITEM;
ELSE
  EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS');
  IF (:GOTCMME.NO_ADDR_INFO = 1) THEN
    EXECUTE_TRIGGER('ADDR_DEFAULT_NXTFLD');
    EXECUTE_TRIGGER('CHECK_MULTIPLE_ZIPS');
  END IF;
  PREVIOUS_ITEM;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ZIP.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GOTCMME_ZIP", function=KeyFunction.PREVIOUS_ITEM)
		public void gotcmmeZip_PreviousItem()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeZip().isNull() )
				{
					previousItem();
				}
				else {
					executeAction("CHECK_ADDRESS_EXISTS");
					if ((gotcmmeElement.getNoAddrInfo().equals(1)))
					{
						executeAction("ADDR_DEFAULT_NXTFLD");
						executeAction("CHECK_MULTIPLE_ZIPS");
					}
					previousItem();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ZIP_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_ZIP_LBT")
		public void gotcmmeZipLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_CNTY_CODE")
		public void gotcmmeCntyCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_CNTY_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeCntyCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOTCMME_CNTY_CODE")
		public void gotcmmeCntyCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOTCMME_CNTY_CODE")
		public void gotcmmeCntyCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_CNTY_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeCntyCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_CNTY_CODE.POST-TEXT-ITEM
		 BEGIN
  IF :GOTCMME.GOTCMME_CNTY_CODE IS NULL THEN
  	:GOTCMME.CNTY_DESCRIPTION := '';
  END IF;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_CNTY_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeCntyCode_itemOut()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeCntyCode().isNull() )
				{
					gotcmmeElement.setCntyDescription(toStr(""));
				}
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_CNTY_CODE.POST-CHANGE
		 DECLARE
	lv_cnty_desc STVCNTY.STVCNTY_DESC%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_CNTY_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_cnty_desc := GB_STVCNTY.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_CNTY_CODE);
  IF lv_cnty_desc IS NULL THEN
    :GOTCMME.CNTY_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0043','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.CNTY_DESCRIPTION := lv_cnty_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOTCMME_CNTY_CODE")
		public void gotcmmeCntyCode_PostChange()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if(gotcmmeElement.getGotcmmeCntyCode().isNull())
		return;
				{
					NString lvCntyDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeCntyCode().isNull() )
					{
						return ;
					}
					// 
					lvCntyDesc = GbStvcnty.fGetDescription(gotcmmeElement.getGotcmmeCntyCode());
					if ( lvCntyDesc.isNull() )
					{
						gotcmmeElement.setCntyDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0043"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setCntyDescription(lvCntyDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_CNTY_CODE_LBT")
		public void gotcmmeCntyCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CNTY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CNTY_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void cntyDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_NATN_CODE")
		public void gotcmmeNatnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeNatnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_NATN_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('STVNATN_CODE', 'STVNATN_NATION', '');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOTCMME_NATN_CODE")
		public void gotcmmeNatnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOTCMME_NATN_CODE")
		public void gotcmmeNatnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeNatnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_NATN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
--
  IF :GOTCMME.GOTCMME_NATN_CODE IS NULL THEN
  	:GOTCMME.NATN_DESCRIPTION := '';
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeNatnCode_itemOut()
		{
			

	
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( gotcmmeElement.getGotcmmeNatnCode().isNull() )
				{
					gotcmmeElement.setNatnDescription(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_NATN_CODE.POST-CHANGE
		 DECLARE
	lv_natn_desc STVNATN.STVNATN_NATION%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_NATN_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_natn_desc := GB_STVNATN.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_NATN_CODE);
  IF lv_natn_desc IS NULL THEN
    :GOTCMME.NATN_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0044','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.NATN_DESCRIPTION := lv_natn_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GOTCMME_NATN_CODE")
		public void gotcmmeNatnCode_PostChange()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if(gotcmmeElement.getGotcmmeNatnCode().isNull())
		return;
				{
					NString lvNatnDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeNatnCode().isNull() )
					{
						return ;
					}
					// 
					lvNatnDesc = GbStvnatn.fGetDescription(gotcmmeElement.getGotcmmeNatnCode());
					if ( lvNatnDesc.isNull() )
					{
						gotcmmeElement.setNatnDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0044"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setNatnDescription(lvNatnDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_NATN_CODE_LBT")
		public void gotcmmeNatnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NATN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void natnDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER NONPERSON_NAME.WHEN-VALIDATE-ITEM
		 IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'B' THEN
  IF :GOTCMME.NONPERSON_NAME IS NOT NULL THEN
  	DISABLE_PERSON;
  ELSE
  	ENABLE_PERSON;
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NONPERSON_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="NONPERSON_NAME")
		public void nonpersonName_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("B") )
				{
					if ( !gotcmmeElement.getNonpersonName().isNull() )
					{
						this.getTask().getServices().disablePerson();
					}
					else {
						this.getTask().getServices().enablePerson();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_SSN.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_error_msg  VARCHAR2(200);
	alert_btn     PLS_INTEGER;
  pii_active    VARCHAR2(1) := 'N';
  pti_into_temp VARCHAR2(1);
  CURSOR PTI_CURSOR IS
    SELECT 'X'
      FROM SPBPERS
     WHERE SPBPERS_SSN = :gotcmme_ssn ;
BEGIN
	lv_error_msg := G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.TRIGGER_ITEM);
  IF lv_error_msg IS NOT NULL THEN
    MESSAGE(lv_error_msg);
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
-- -- 
-- --
-- --
  pii_active := gokfgac.f_spriden_pii_active;
--
-- If the SSN changes, turn off PII, verify it's unique, if not, give warning.
--
  IF (NVL(:GOTCMME.HOLD_GOTCMME_SSN, '!!!') <> NVL(:GOTCMME.GOTCMME_SSN, '!!!')) THEN
--
-- Turn off PII, if active, and test for existance of same SSN.
--
    IF pii_active = 'Y' THEN
      gokfgac.p_turn_fgac_off;
    END IF;
--
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO pti_into_temp;
    IF PTI_CURSOR%FOUND THEN
  	  alert_btn := G$_DISPLAY_ALERT('G$_INFO_ALERT', G$_NLS.Get('GOAMTCH-0045','FORM',
                      '*WARNING* SSN/SIN/TIN already assigned to another record.'));
    END IF;
    CLOSE PTI_CURSOR;
--
-- Turn PII back on if active.
--
    IF pii_active = 'Y' THEN
      gokfgac.p_turn_fgac_on;
    END IF;
--
  END IF;
-- --
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
--
-- Turn PII back on if active.
--
    IF pii_active = 'Y' THEN
      gokfgac.p_turn_fgac_on;
    END IF;
--
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
END;


  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_SSN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_SSN")
		public void gotcmmeSsn_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				int rowCount = 0;
				{
					NString lvErrorMsg= NString.getNull();
					NInteger alertBtn= NInteger.getNull();
					NString piiActive = toStr("N");
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :GOTCMME_SSN ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						try
						{
							lvErrorMsg = getTask().getGoqrpls().gSsnValidateMaxLength(toStr(getTriggerItem()));
							if ( !lvErrorMsg.isNull() )
							{
								errorMessage(lvErrorMsg);
								throw new ApplicationException();
							}
							//  -- 
							//  --
							//  --
							piiActive = Gokfgac.fSpridenPiiActive();
							// 
							//  If the SSN changes, turn off PII, verify it's unique, if not, give warning.
							// 
							if ((isNull(gotcmmeElement.getHoldGotcmmeSsn(), "!!!").notEquals(isNull(gotcmmeElement.getGotcmmeSsn(), "!!!"))))
							{
								// 
								//  Turn off PII, if active, and test for existance of same SSN.
								// 
								if ( piiActive.equals("Y") )
								{
									Gokfgac.pTurnFgacOff();
								}
								// 
								//Setting query parameters
								ptiCursor.addParameter("GOTCMME_SSN", gotcmmeElement.getGotcmmeSsn());
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								if ( ptiCursor.found() )
								{
									alertBtn = toInt(getTask().getGoqrpls().gDisplayAlert(toStr("G$_WARNING_ALERT"), GNls.Fget(toStr("GOAMTCH-0045"), toStr("FORM"), toStr("*WARNING* SSN/SIN/TIN already assigned to another record."))));
								}
								ptiCursor.close();
								// 
								//  Turn PII back on if active.
								// 
								if ( piiActive.equals("Y") )
								{
									Gokfgac.pTurnFgacOn();
								}
							}
						}
						catch(ApplicationException e)
						{
							// 
							//  Turn PII back on if active.
							// 
							if ( piiActive.equals("Y") )
							{
								Gokfgac.pTurnFgacOn();
							}
							// 
							setGlobal("QUERY_MODE", toStr("0"));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_BIRTH_DAY.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_day        DATE;
  lv_day_number INTEGER;
BEGIN
  IF :GOTCMME.GOTCMME_BIRTH_DAY IS NOT NULL THEN
    lv_day_number := TO_NUMBER(:GOTCMME.GOTCMME_BIRTH_DAY);
    IF lv_day_number NOT BETWEEN 1 AND 31 THEN
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
    IF lv_day_number < 10 THEN
    	:GOTCMME.GOTCMME_BIRTH_DAY := '0' || TO_CHAR(lv_day_number);
    END IF;
  END IF;
--  
EXCEPTION
  WHEN OTHERS THEN
    MESSAGE(G$_NLS.GET('GOAMTCH-0046','FORM','*ERROR* Invalid value was entered for the birth day.'));
    RAISE FORM_TRIGGER_FAILURE;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_BIRTH_DAY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_BIRTH_DAY")
		public void gotcmmeBirthDay_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				{
					NDate lvDay= NDate.getNull();
					NInteger lvDayNumber= NInteger.getNull();
					try
					{
						if ( !gotcmmeElement.getGotcmmeBirthDay().isNull() )
						{
							lvDayNumber = toInt(gotcmmeElement.getGotcmmeBirthDay());
							if ( !between(lvDayNumber.toInt32(), 1, 31) )
							{
								throw new ApplicationException();
							}
							// 
							if ( lvDayNumber.lesser(10) )
							{
								gotcmmeElement.setGotcmmeBirthDay(toStr("0").append(toChar(lvDayNumber)));
							}
						}
					}
					catch(Exception  e)
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0046"), toStr("FORM"), toStr("*ERROR* Invalid value was entered for the birth day.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_BIRTH_MON.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_date DATE;
BEGIN
  IF :GOTCMME.GOTCMME_BIRTH_MON IS NOT NULL THEN
	  lv_date := TO_DATE(:GOTCMME.GOTCMME_BIRTH_MON,'MM');
    :GOTCMME.GOTCMME_BIRTH_MON := TO_CHAR(lv_date,'MM');
  END IF;
--  
EXCEPTION
  WHEN OTHERS THEN
    MESSAGE(G$_NLS.GET('GOAMTCH-0047','FORM','*ERROR* Invalid value was entered for the birth month.'));
    RAISE FORM_TRIGGER_FAILURE;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_BIRTH_MON.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_BIRTH_MON")
		public void gotcmmeBirthMon_validate()
		{
			

	
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				{
					NDate lvDate= NDate.getNull();
					NInteger lvMonthNumber= NInteger.getNull();
					try
					{
						if ( !gotcmmeElement.getGotcmmeBirthMon().isNull() )
						{
							lvDate = toDate(gotcmmeElement.getGotcmmeBirthMon(), "MM");
							lvMonthNumber = toInt(gotcmmeElement.getGotcmmeBirthMon());
							if ( !between(lvMonthNumber.toInt32(), 1, 12) )
							{
								throw new ApplicationException();
							}
							gotcmmeElement.setGotcmmeBirthMon(toChar(lvDate, "MM"));
						}
					}
					catch(Exception  e)
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0047"), toStr("FORM"), toStr("*ERROR* Invalid value was entered for the birth month.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_BIRTH_YEAR.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_date     DATE;
  lv_cur_year VARCHAR2(4) := TO_CHAR(TO_DATE(:GLOBAL.CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT),'YYYY');
  lv_skip_err VARCHAR2(1) := 'N';
BEGIN
  IF :GOTCMME.GOTCMME_BIRTH_YEAR IS NOT NULL THEN
	  lv_date := TO_DATE(:GOTCMME.GOTCMME_BIRTH_YEAR,'RRRR');
    :GOTCMME.GOTCMME_BIRTH_YEAR := TO_CHAR(lv_date,'YYYY');
  END IF;
--
  IF TO_NUMBER(:GOTCMME.GOTCMME_BIRTH_YEAR) NOT BETWEEN 1880 AND TO_NUMBER(lv_cur_year) THEN
    MESSAGE(G$_NLS.GET('GOAMTCH-0048','FORM','*ERROR* Year range must be between 1880 and the current year.'));
    lv_skip_err := 'Y';
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--  
EXCEPTION
  WHEN OTHERS THEN
    IF lv_skip_err = 'N' THEN
      MESSAGE(G$_NLS.GET('GOAMTCH-0049','FORM','*ERROR* Invalid value was entered for the birth year.'));
    END IF;
    RAISE FORM_TRIGGER_FAILURE;
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_BIRTH_YEAR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_BIRTH_YEAR")
		public void gotcmmeBirthYear_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }

				if(gotcmmeElement != null)
				{
					NDate lvDate= NDate.getNull();
					NString lvCurYear = toChar(toDate(getGlobal("CURRENT_DATE"), GDate.getNlsDateFormat()), "YYYY");
					NString lvSkipErr = toStr("N");
					NInteger lvYearNumber= NInteger.getNull();
					try
					{
						if ( !gotcmmeElement.getGotcmmeBirthYear().isNull() )
							lvYearNumber = toInt(gotcmmeElement.getGotcmmeBirthYear());
						if ( !between(lvYearNumber.toInt32(),0000, 9999) )
						{
							throw new ApplicationException();
						}
						{
							lvDate = toDate(gotcmmeElement.getGotcmmeBirthYear(), Lib.lpad("", gotcmmeElement.getGotcmmeBirthYear().trim().getLength(), "R").getValue());
							
							gotcmmeElement.setGotcmmeBirthYear(toChar(lvDate, "YYYY"));
						}
						// 
						if ( !between(toNumber(gotcmmeElement.getGotcmmeBirthYear()), toNumber(1880), toNumber(lvCurYear))  && gotcmmeElement.getGotcmmeBirthYear().isNotNull())
						{
							errorMessage(GNls.Fget(toStr("GOAMTCH-0048"), toStr("FORM"), toStr("*ERROR* Year range must be between 1880 and the current year.")));
							lvSkipErr = toStr("Y");
							throw new ApplicationException();
						}
					}
					catch(Exception  e)
					{
						if ( lvSkipErr.equals("N") )
						{
							errorMessage(GNls.Fget(toStr("GOAMTCH-0049"), toStr("FORM"), toStr("*ERROR* Invalid value was entered for the birth year.")));
						}
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_TELE_CODE")
		public void gotcmmeTeleCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_TELE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeTeleCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item="GOTCMME_TELE_CODE")
		public void gotcmmeTeleCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS" , item="GOTCMME_TELE_CODE")
		public void gotcmmeTeleCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_TELE_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeTeleCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_TELE_CODE.POST-TEXT-ITEM
		 BEGIN
  IF :GOTCMME.GOTCMME_TELE_CODE IS NULL THEN
  	:GOTCMME.TELE_DESCRIPTION := '';
  END IF;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_TELE_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeTeleCode_itemOut()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeTeleCode().isNull() )
				{
					gotcmmeElement.setTeleDescription(toStr(""));
				}
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_TELE_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_tele_desc STVTELE.STVTELE_DESC%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_TELE_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_tele_desc := GB_STVTELE.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_TELE_CODE);
  IF lv_tele_desc IS NULL THEN
    :GOTCMME.TELE_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0050','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.TELE_DESCRIPTION := lv_tele_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_TELE_CODE")
		public void gotcmmeTeleCode_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				{
					NString lvTeleDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeTeleCode().isNull() )
					{
						return ;
					}
					// 
					lvTeleDesc = GbStvtele.fGetDescription(gotcmmeElement.getGotcmmeTeleCode());
					if ( lvTeleDesc.isNull() )
					{
						gotcmmeElement.setTeleDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0050"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setTeleDescription(lvTeleDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_TELE_CODE_LBT")
		public void gotcmmeTeleCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TELE_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void teleDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOTCMME_EMAL_CODE")
		public void gotcmmeEmalCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOTCMME_EMAL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gotcmmeEmalCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item="GOTCMME_EMAL_CODE")
		public void gotcmmeEmalCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOTCMME_EMAL_CODE")
		public void gotcmmeEmalCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOTCMME_EMAL_CODE", function=KeyFunction.NEXT_ITEM)
		public void gotcmmeEmalCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_EMAL_CODE.POST-TEXT-ITEM
		 BEGIN
  IF :GOTCMME.GOTCMME_EMAL_CODE IS NULL THEN
  	:GOTCMME.EMAL_DESCRIPTION := '';
  END IF;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOTCMME_EMAL_CODE", function=KeyFunction.ITEM_OUT)
		public void gotcmmeEmalCode_itemOut()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeEmalCode().isNull() )
				{
					gotcmmeElement.setEmalDescription(toStr(""));
				}
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_EMAL_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_emal_desc GTVEMAL.GTVEMAL_DESC%TYPE;
BEGIN
  IF :GOTCMME.GOTCMME_EMAL_CODE IS NULL THEN
    RETURN;
  END IF;
--
	lv_emal_desc := GB_GTVEMAL.F_GET_DESCRIPTION(:GOTCMME.GOTCMME_EMAL_CODE);
  IF lv_emal_desc IS NULL THEN
    :GOTCMME.EMAL_DESCRIPTION := '';
    MESSAGE(G$_NLS.Get('GOAMTCH-0051','FORM','*ERROR* Invalid code; press LIST for valid codes'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GOTCMME.EMAL_DESCRIPTION := lv_emal_desc;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_EMAL_CODE")
		public void gotcmmeEmalCode_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				{
					NString lvEmalDesc= NString.getNull();
					if ( gotcmmeElement.getGotcmmeEmalCode().isNull() )
					{
						return ;
					}
					// 
					lvEmalDesc = GbGtvemal.fGetDescription(gotcmmeElement.getGotcmmeEmalCode());
					if ( lvEmalDesc.isNull() )
					{
						gotcmmeElement.setEmalDescription(toStr(""));
						errorMessage(GNls.Fget(toStr("GOAMTCH-0051"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					// 
					gotcmmeElement.setEmalDescription(lvEmalDesc);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_EMAL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOTCMME_EMAL_CODE_LBT")
		public void gotcmmeEmalCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EMAL_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="EMAL_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void emalDescription_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GOTCMME_ADID_CODE.WHEN-VALIDATE-ITEM
		 IF	:GOTCMME.GOTCMME_ADID_CODE IS NULL THEN
		:GOTCMME.ADID_DESC := '';
  	RETURN;
END IF;
--
:GOTCMME.ADID_DESC := GB_GTVADID.f_get_description(p_code => :GOTCMME.GOTCMME_ADID_CODE);
IF  :GOTCMME.ADID_DESC is NULL THEN
		MESSAGE(G$_NLS.Get('GOAMTCH-0052','FORM','*ERROR* Invalid ID Type code; press LIST for valid code.'));
  	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_ADID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_ADID_CODE")
		public void gotcmmeAdidCode_validate()
		{
			


				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);

                if(gotcmmeElement==null){
                	return;
                }


				if ( gotcmmeElement.getGotcmmeAdidCode().isNull() )
				{
					gotcmmeElement.setAdidDesc(toStr(""));
					return ;
				}
				// 

				gotcmmeElement.setAdidDesc(GbGtvadid.fGetDescription(/*pCode=>*/gotcmmeElement.getGotcmmeAdidCode()));
				if ( gotcmmeElement.getAdidDesc().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0052"), toStr("FORM"), toStr("*ERROR* Invalid ID Type code; press LIST for valid code.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOURCE_COMMENT.KEY-EDIT
		 -- 73-1
DECLARE
  ed_ok      BOOLEAN;
  commentval varchar2(24765) := '';
BEGIN
  SHOW_EDITOR('MATCHING_SOURCE_COMMENT_ED',
               :GOTCMME.SOURCE_COMMENT,
               200,40,commentval,ed_ok);
  --
	IF  ED_OK and
	    commentval <> :GOTCMME.SOURCE_COMMENT THEN
  	  message( G$_NLS.Get('GOAMTCH-0053','FORM',
		  '*WARNING* No updates are allowed to Matching Source Comment.  Changes to Matching Source Comments must be made on form GTVCMSC.'));
	END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_COMMENT.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT", item="SOURCE_COMMENT")
		public void sourceComment_KeyEdit()
		{
			
				//  73-1
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
                if(gotcmmeElement==null){
                	return;
                }


				{
					NBool edOk= NBool.getNull();
					NString commentval = toStr("");
						editTextitem();
					
					
					// 
					if ( edOk.getValue() && commentval.notEquals(gotcmmeElement.getSourceComment()) )
					{
						warningMessage(GNls.Fget(toStr("GOAMTCH-0053"), toStr("FORM"), toStr("*WARNING* No updates are allowed to Matching Source Comment.  Changes to Matching Source Comments must be made on form GTVCMSC.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_STAT_CODE")
		public void gotcmmeStatCode_validate()
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
							this.gotcmmeStatCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_CNTY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_CNTY_CODE")
		public void gotcmmeCntyCode_validate()
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
							this.gotcmmeCntyCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOTCMME_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOTCMME_NATN_CODE")
		public void gotcmmeNatnCode_validate()
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
							this.gotcmmeNatnCode_PostChange();

			}

		
	
	
}

