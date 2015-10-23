package net.hedtech.general.common.libraries.Goqclib.controller;
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqclib.model.*;
import net.hedtech.general.common.libraries.Goqclib.*;
import net.hedtech.general.common.libraries.Goqclib.services.*;
import net.hedtech.general.common.libraries.Goqclib.services.UnknownTypes;


public class GoqclibFormController extends AbstractSupportCodeObject  {
	
	
	public GoqclibFormController (ISupportCodeContainer container) {
		super(container);
	}
	
	
	@Override
	public GoqclibTaskPart getContainer() {
		return (GoqclibTaskPart)super.getContainer();
	}
	
	
	public GoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GOQCLIB.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.3.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQCLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goqclib_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOQCLIB.CHECK_TO_SAVE
		 -- This trigger prompts user to commit if changes are made in the current block that they are on.
--
DECLARE
	TEMP_STRING     VARCHAR2(255);
	TEMP_CHANGE_IND VARCHAR2(8);
BEGIN
	IF :SYSTEM.CURRENT_BLOCK = 'SPRIDEN_CURRENT' THEN 
	  TEMP_CHANGE_IND := F_IS_ID_CHANGE;
--
	  IF TEMP_CHANGE_IND = 'CREATE' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0000','FORM','Enter Current identification information before leaving current window.');
	  ELSIF TEMP_CHANGE_IND = 'NEW' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0001','FORM','Current identification added, press SAVE before leaving current window.');
	  ELSIF TEMP_CHANGE_IND = 'CHANGE' THEN
	  	TEMP_STRING := G$_NLS.Get('GOQCLIB-0002','FORM','Current identification changed, press SAVE before leaving current window.');
	  END IF;
--
	ELSIF :SYSTEM.CURRENT_BLOCK = 'SPRADDR' THEN
		IF F_IS_PHONE_CHANGE = 'Y' THEN
			TEMP_STRING := G$_NLS.Get('GOQCLIB-0003','FORM','Address information changed, press SAVE before leaving current window.');
		END IF;
	END IF;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN 
	  GO_ITEM(:SYSTEM.CURSOR_ITEM);
	  IF :SYSTEM.CURRENT_BLOCK = 'SPRIDEN_CURRENT'THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0004','FORM','Current identification changed, press SAVE before leaving current window.');
	  ELSIF :SYSTEM.CURRENT_BLOCK = 'SPRADDR' THEN
	  	TEMP_STRING := G$_NLS.Get('GOQCLIB-0005','FORM','Address information changed, press SAVE before leaving current window.');
	  ELSIF :SYSTEM.CURRENT_BLOCK = 'SPRIDEN_PREVIOUS' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0006','FORM','Alternate information changed, press SAVE before leaving current window.');
	  ELSIF :SYSTEM.CURRENT_BLOCK = 'SPRTELE' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0007','FORM','Telephone information changed, press SAVE before leaving current window.');
	  ELSIF :SYSTEM.CURRENT_BLOCK = 'GOREMAL' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0008','FORM','Email information changed, press SAVE before leaving current window.');	
		ELSIF :SYSTEM.CURRENT_BLOCK = 'SPBPERS' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0009','FORM','Biographic or Race information changed, press SAVE before leaving current window.');
		ELSIF :SYSTEM.CURRENT_BLOCK = 'SPREMRG' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0010','FORM','Emergency Contact information changed, press SAVE before leaving current window.');
		ELSIF :SYSTEM.CURRENT_BLOCK = 'GORPRAC' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0011','FORM','Biographic or Race information changed, press SAVE before leaving current window.');
		ELSIF :SYSTEM.CURRENT_BLOCK = 'GORADID' THEN
	    TEMP_STRING := G$_NLS.Get('GOQCLIB-0012','FORM','Additional Identification information changed, press SAVE before leaving current window.');
		END IF;		  
  END IF;
--
  IF TEMP_STRING IS NOT NULL THEN
-- -- --	  MESSAGE(G$_NLS.Get('X','FORM',TEMP_STRING));
	  MESSAGE(TEMP_STRING);
	  RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQCLIB.CHECK_TO_SAVE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TO_SAVE")
		public void Goqclib_CheckToSave()
		{
			
				//  This trigger prompts user to commit if changes are made in the current block that they are on.
				// 

				//F2J_WARNING : Caution, the variable may be null.
				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				{
					NString tempString= NString.getNull();
					NString tempString1= NString.getNull();
					NString tempChangeInd= NString.getNull();
					if ( getCurrentBlock().equals("SPRIDEN_CURRENT") )
					{
						tempChangeInd = this.getContainer().getServices().fIsIdChange(spridenCurrentElement);
						// 
						if ( tempChangeInd.equals("CREATE") )
						{
							tempString1 = GNls.Fget(toStr("GOQCLIB-0000"), toStr("FORM"), toStr("Enter Current identification information before leaving current window."));
						}
						else if ( tempChangeInd.equals("NEW") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0001"), toStr("FORM"), toStr("Current identification added, press SAVE before leaving current window."));
						}
						else if ( tempChangeInd.equals("CHANGE") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0002"), toStr("FORM"), toStr("Current identification changed, press SAVE before leaving current window."));
						}
					}
					else if ( getCurrentBlock().equals("SPRADDR") ) {
						if ( this.getContainer().getServices().fIsPhoneChange(spraddrElement).equals("Y") )
						{
							tempString = GNls.Fget(toStr("GOQCLIB-0003"), toStr("FORM"), toStr("Address information changed, press SAVE before leaving current window."));
						}
					}
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						goItem(toStr(getCursorItem()));
						if ( getCurrentBlock().equals("SPRIDEN_CURRENT") )
						{
							tempString = GNls.Fget(toStr("GOQCLIB-0004"), toStr("FORM"), toStr("Current identification changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("SPRADDR") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0005"), toStr("FORM"), toStr("Address information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("SPRIDEN_PREVIOUS") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0006"), toStr("FORM"), toStr("Alternate information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("SPRTELE") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0007"), toStr("FORM"), toStr("Telephone information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("GOREMAL") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0008"), toStr("FORM"), toStr("Email information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("SPBPERS") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0009"), toStr("FORM"), toStr("Biographic or Race information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("SPREMRG") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0010"), toStr("FORM"), toStr("Emergency Contact information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("GORPRAC") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0011"), toStr("FORM"), toStr("Biographic or Race information changed, press SAVE before leaving current window."));
						}
						else if ( getCurrentBlock().equals("GORADID") ) {
							tempString = GNls.Fget(toStr("GOQCLIB-0012"), toStr("FORM"), toStr("Additional Identification information changed, press SAVE before leaving current window."));
						}
					}
					// 
					if ( !tempString.isNull() )
					{
						//  -- --	  MESSAGE(G$_NLS.Get('X','FORM',TEMP_STRING));
						warningMessage(tempString);
						throw new ApplicationException();
					}
					else if ( !tempString1.isNull() )
					{
						errorMessage(tempString1);
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOQCLIB.KEY_NXTBLOCK_TRG
		 DECLARE
	lv_cur_blk   VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK;
  lv_query_re  VARCHAR2(1)  := 'N';
BEGIN
-- -- -- -- 
-- -- -- -- General7.5 (TabSecurity): These changes are in association with GOQOLIB changes.
-- -- -- -- This change basically allows Oracle-default-NEXT_BLOCK navigation take you to the
-- -- -- -- appropriate next block.
-- -- -- -- The GOQOLIB change is to remove the static-key-navigable state of g$_extended block
-- -- -- -- items.  When on the last block and issuing Oracle-default-NEXT_BLOCK you would end
-- -- -- -- up in the G$_EXTEND or others blocks (or form would fail)
-- -- -- --
-- --
-- --
    IF GET_BLOCK_PROPERTY(lv_cur_blk,NEXT_NAVIGATION_BLOCK) = 'SPRIDEN_CURRENT' AND
    	lv_cur_blk = 'SPRIDEN_CURRENT' THEN
      G$_INVALID_FUNCTION_MSG;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
-- --
-- --
-- -- --    IF GET_BLOCK_PROPERTY(lv_cur_blk,NEXTBLOCK) = 'SPBPERS' THEN
    IF GET_BLOCK_PROPERTY(lv_cur_blk,NEXT_NAVIGATION_BLOCK) = 'SPBPERS' THEN
      IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
        lv_query_re  := 'Y';
      END IF;
    END IF;
--
    :SYSTEM.MESSAGE_LEVEL := '5';
    NEXT_BLOCK;
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL := '0';
--
-- 	Query race/ethnicity data on same canvas
--
    IF lv_query_re  = 'Y' THEN
      :SYSTEM.MESSAGE_LEVEL := '5';
      NEXT_BLOCK;
      EXECUTE_QUERY;
      :SYSTEM.MESSAGE_LEVEL := '0';
      PREVIOUS_BLOCK;
    END IF;
-- -- -- --  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQCLIB.KEY_NXTBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTBLOCK_TRG")
		public void Goqclib_KeyNxtblockTrg()
		{
			
				{
					NString lvCurBlk = getCurrentBlock();
					NString lvQueryRe = toStr("N");
					//  -- -- -- 
					//  -- -- -- General7.5 (TabSecurity): These changes are in association with GOQOLIB changes.
					//  -- -- -- This change basically allows Oracle-default-NEXT_BLOCK navigation take you to the
					//  -- -- -- appropriate next block.
					//  -- -- -- The GOQOLIB change is to remove the static-key-navigable state of g$_extended block
					//  -- -- -- items.  When on the last block and issuing Oracle-default-NEXT_BLOCK you would end
					//  -- -- -- up in the G$_EXTEND or others blocks (or form would fail)
					//  -- -- --
					//  --
					//  --
					if ( getBlockNextBlock(lvCurBlk).equals("SPRIDEN_CURRENT") && lvCurBlk.equals("SPRIDEN_CURRENT") )
					{
						getContainer().getGoqrpls().gInvalidFunctionMsg();
						throw new ApplicationException();
					}
					//  --
					//  --
					//  -- --    IF GET_BLOCK_PROPERTY(lv_cur_blk,NEXTBLOCK) = 'SPBPERS' THEN
					if ( getBlockNextBlock(lvCurBlk).equals("SPBPERS") )
					{
						if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
						{
							lvQueryRe = toStr("Y");
						}
					}
					// 
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					nextBlock();
					this.getContainer().getServices().executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					// 
					//  	Query race/ethnicity data on same canvas
					// 
					if ( lvQueryRe.equals("Y") )
					{
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						nextBlock();
						this.getContainer().getServices().executeQuery();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						previousBlock();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOQCLIB.KEY_PRVBLOCK_TRG
		 DECLARE
	lv_cur_blk   VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK;
  lv_query_re  VARCHAR2(1)  := 'N';
BEGIN
-- -- -- -- 
-- -- -- -- General7.5 (TabSecurity): These changes are in association with GOQOLIB changes.
-- -- -- -- This change basically allows Oracle-default-PREVIOUS_BLOCK navigation take you to the
-- -- -- -- appropriate previous block.
-- -- -- -- The GOQOLIB change is to remove the static-key-navigable state of g$_extended block
-- -- -- -- items.  When the first navigable block is issuing Oracle-default-PREVIOUS_BLOCK you
-- -- -- -- would end up in the G$_EXTEND or others blocks (or form would fail)
-- -- -- --
-- --
    IF GET_BLOCK_PROPERTY(lv_cur_blk,PREVIOUS_NAVIGATION_BLOCK) = 'SPRIDEN_CURRENT' AND
    	lv_cur_blk = 'SPRIDEN_CURRENT' THEN
      G$_INVALID_FUNCTION_MSG;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
-- --
-- --
--
-- -- --    IF GET_BLOCK_PROPERTY(lv_cur_blk,PREVIOUSBLOCK) = 'GORPRAC' THEN
    IF GET_BLOCK_PROPERTY(lv_cur_blk,PREVIOUS_NAVIGATION_BLOCK) = 'GORPRAC' THEN
      IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
        lv_query_re  := 'Y';
      END IF;
    END IF;
--
    :SYSTEM.MESSAGE_LEVEL := '5';
    PREVIOUS_BLOCK;
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL := '0';
--
-- 	Query spbpers data on same canvas
--
    IF lv_query_re  = 'Y' THEN
      :SYSTEM.MESSAGE_LEVEL := '5';
      PREVIOUS_BLOCK;
      EXECUTE_QUERY;
      :SYSTEM.MESSAGE_LEVEL := '0';
      NEXT_BLOCK;
    END IF;
-- -- -- --  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQCLIB.KEY_PRVBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_PRVBLOCK_TRG")
		public void Goqclib_KeyPrvblockTrg()
		{
			
				{
					NString lvCurBlk = getCurrentBlock();
					NString lvQueryRe = toStr("N");
					//  -- -- -- 
					//  -- -- -- General7.5 (TabSecurity): These changes are in association with GOQOLIB changes.
					//  -- -- -- This change basically allows Oracle-default-PREVIOUS_BLOCK navigation take you to the
					//  -- -- -- appropriate previous block.
					//  -- -- -- The GOQOLIB change is to remove the static-key-navigable state of g$_extended block
					//  -- -- -- items.  When the first navigable block is issuing Oracle-default-PREVIOUS_BLOCK you
					//  -- -- -- would end up in the G$_EXTEND or others blocks (or form would fail)
					//  -- -- --
					//  --
					if ( getBlockPreviousBlock(lvCurBlk).equals("SPRIDEN_CURRENT") && lvCurBlk.equals("SPRIDEN_CURRENT") )
					{
						getContainer().getGoqrpls().gInvalidFunctionMsg();
						throw new ApplicationException();
					}
					//  --
					//  --
					// 
					//  -- --    IF GET_BLOCK_PROPERTY(lv_cur_blk,PREVIOUSBLOCK) = 'GORPRAC' THEN
					if ( getBlockPreviousBlock(lvCurBlk).equals("GORPRAC") )
					{
						if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
						{
							lvQueryRe = toStr("Y");
						}
					}
					// 
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					previousBlock();
					this.getContainer().getServices().executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					// 
					//  	Query spbpers data on same canvas
					// 
					if ( lvQueryRe.equals("Y") )
					{
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						previousBlock();
						this.getContainer().getServices().executeQuery();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						nextBlock();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOQCLIB.GO_ADDR_FORM
		 DECLARE
	lv_form_to_call VARCHAR2(30);
  lv_this_product VARCHAR2(1) := SUBSTR(:SYSTEM.CURRENT_FORM,1,1);
	tab_page_id TAB_PAGE;
BEGIN
  lv_form_to_call := 
    CASE lv_this_product
      WHEN 'A' THEN 'APCADDR'
      WHEN 'F' THEN 'FOQADDR'
      WHEN 'P' THEN 'PPIADDR'
      ELSE 'SOADDRQ'
    END;
--
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, lv_form_to_call,'QUERY');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQCLIB.GO_ADDR_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_ADDR_FORM")
		public void Goqclib_GoAddrForm()
		{
			
				String caseExpressionResult = null;
				{
					NString lvFormToCall= NString.getNull();
					NString lvThisProduct = substring(toStr(getCurrentTaskName()), toInt(1), toInt(1));
					UnknownTypes.TabPage tabPageId= null;
					if (lvThisProduct.equals("A"))
					{
						caseExpressionResult = "APCADDR";
					}
					else if (lvThisProduct.equals("F"))
					{
						caseExpressionResult = "FOQADDR";
					}
					else if (lvThisProduct.equals("P"))
					{
						caseExpressionResult = "PPIADDR";
					}
					// MORPHIS TODO GEN-DC- ADDED TO OPEN FORM SOADDRQ IN SPAIDEN
					else if (lvThisProduct.equals("S"))
					{
						caseExpressionResult = "SOADDRQ";
					}
					
					lvFormToCall = toStr(caseExpressionResult);
					// 
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), lvFormToCall, toStr("QUERY"));
				}
			}


		public void KeyNxtblockTrg() {
			Goqclib_KeyNxtblockTrg();
		}


		public void KeyPrvblockTrg() {
			Goqclib_KeyPrvblockTrg();
		}


		public void CheckToSave() {
			Goqclib_CheckToSave();
		}


		public void GoAddrForm() {
			Goqclib_GoAddrForm();
		}

		
	
}
	
