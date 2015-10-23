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
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
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
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getGKeyBlockClass().postBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-COMMIT
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-UP
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_MoveUp()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-DOWN
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_MoveDown()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CREREC
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-DELREC
		 BEGIN
  
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-ENTQRY
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-EXEQRY
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTREC
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTSET
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
--
  NEXT_BLOCK;
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				executeAction("CHECK_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				nextBlock();
				
				keyBlock_PostBlockTrg();
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeQuery();
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-PRVBLK
		 BEGIN
 
  G$_INVALID_FUNCTION_MSG;          
  
END;
		*/
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous

		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-PRVREC
		 BEGIN
  
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST_BLOCK_TRG
		 BEGIN
-- 73-5 reset API failure indicators
  :FORM_HEADER.API_FAILURE := 'N';
	:FORM_HEADER.F_CREATE_ADDRESS_ERR := 'N';
	:FORM_HEADER.F_CREATE_BIO_ERR := 'N';
	:FORM_HEADER.F_CREATE_EMAIL_ERR := 'N';
	:FORM_HEADER.F_CREATE_ADDID_ERR := 'N';
	:FORM_HEADER.F_CREATE_TELEPHONE_ERR := 'N';
	-- -- -- 
  IF NVL(:CHECK_KEYS,'X') = 'E' THEN
  	RETURN;
  END IF;
--
  PURGE_TEMP_RECORDS;
  G$_CHECK_FAILURE;
--
  ENABLE_DISABLE_NAME_ITEMS;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_BLOCK_TRG")
		public void keyBlock_PostBlockTrg()
		{
			
				//  73-5 reset API failure indicators
				getFormModel().getFormHeader().setApiFailure(toStr("N"));
				getFormModel().getFormHeader().setFCreateAddressErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateBioErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateEmailErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateAddidErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateTelephoneErr(toStr("N"));
				//  -- -- 
				if ( isNull(getFormModel().getFormHeader().getCheckKeys(), "X").equals("E") )
				{
					return ;
				}
				// 
				this.getTask().getServices().purgeTempRecords();
				getTask().getGoqrpls().gCheckFailure();
				// 
				this.getTask().getServices().enableDisableNameItems();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 DECLARE
  lv_valid_ind VARCHAR2(1) := '';
--
  CURSOR valid_id_c IS
    SELECT 'X'
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :KEY_BLOCK.ID
       AND ROWNUM = 1;
  CURSOR valid_ssn_c IS
     SELECT 'X'
       FROM SPBPERS
      WHERE SPBPERS_SSN = :KEY_BLOCK.ID;
--     
BEGIN
--
-- Verify the ID entered does not exist.
--
 	IF :FORM_HEADER.CALLING_FORM = 'RCRSUSP' THEN
 		RETURN;
 	END IF;
--
  OPEN valid_id_c;
  FETCH valid_id_c INTO lv_valid_ind;
  CLOSE valid_id_c;
--

  IF lv_valid_ind IS NOT NULL THEN
    IF :KEY_BLOCK.ID = :global.created_id THEN
      MESSAGE(G$_NLS.Get('GOAMTCH-0031','FORM','*WARNING* This ID was just created. Please go to a new form or change ID before continuing on this form.'));
    	RAISE FORM_TRIGGER_FAILURE;
    ELSE
      MESSAGE(G$_NLS.Get('GOAMTCH-0032','FORM','*ERROR* This ID is valid, use of this form is not allowed for valid IDs.'));
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;


--
  IF lv_valid_ind IS NOT NULL THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0033','FORM','*ERROR* This ID is valid, use of this form is not allowed for valid IDs.'));
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
-- -- --
-- -- --
  IF :GLOBAL.SSN_SEARCH_ENABLED_IND = 'Y' THEN
    OPEN valid_ssn_c;
    FETCH valid_ssn_c INTO lv_valid_ind;
    CLOSE valid_ssn_c;
--
    IF lv_valid_ind IS NOT NULL THEN
      MESSAGE(G$_NLS.Get('GOAMTCH-0034','FORM','*ERROR* This ID already exists as an SSN/SIN/TIN.'));
  	  RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
-- -- --
-- -- --
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ID")
		public void id_validate()
		{
			
				int rowCount = 0;
				{
					NString lvValidInd = toStr("");
					String sqlvalidIdC = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :KEY_BLOCK_ID AND ROWNUM = 1 ";
					DataCursor validIdC = new DataCursor(sqlvalidIdC);
					String sqlvalidSsnC = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :KEY_BLOCK_ID ";
					DataCursor validSsnC = new DataCursor(sqlvalidSsnC);
					try {
						// 
						//  Verify the ID entered does not exist.
						// 
						if ( getFormModel().getFormHeader().getCallingForm().equals("RCRSUSP") )
						{
							return ;
						}
						// 
						//Setting query parameters
						validIdC.addParameter("KEY_BLOCK_ID", getFormModel().getKeyBlock().getId());
						validIdC.open();
						ResultSet validIdCResults = validIdC.fetchInto();
						if ( validIdCResults != null ) {
							lvValidInd = validIdCResults.getStr(0);
						}
						validIdC.close();
						// 
						if ( !lvValidInd.isNull() )
						{
							if ( getFormModel().getKeyBlock().getId().equals(getGlobal("CREATED_ID")) )
							{
								warningMessage(GNls.Fget(toStr("GOAMTCH-0031"), toStr("FORM"), toStr("*WARNING* This ID was just created. Please go to a new form or change ID before continuing on this form.")));
								throw new ApplicationException();
							}
							else {
								errorMessage(GNls.Fget(toStr("GOAMTCH-0032"), toStr("FORM"), toStr("*ERROR* This ID is valid, use of this form is not allowed for valid IDs.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !lvValidInd.isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAMTCH-0033"), toStr("FORM"), toStr("*ERROR* This ID is valid, use of this form is not allowed for valid IDs.")));
							throw new ApplicationException();
						}
						//  -- --
						//  -- --
						if ( getGlobal("SSN_SEARCH_ENABLED_IND").equals("Y") )
						{
							//Setting query parameters
							validSsnC.addParameter("KEY_BLOCK_ID", getFormModel().getKeyBlock().getId());
							validSsnC.open();
							ResultSet validSsnCResults = validSsnC.fetchInto();
							if ( validSsnCResults != null ) {
								lvValidInd = validSsnCResults.getStr(0);
							}
							validSsnC.close();
							// 
							if ( !lvValidInd.isNull() )
							{
								errorMessage(GNls.Fget(toStr("GOAMTCH-0034"), toStr("FORM"), toStr("*ERROR* This ID already exists as an SSN/SIN/TIN.")));
								throw new ApplicationException();
							}
						}
					}
					finally{
						validIdC.close();
						validSsnC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="KEYBLOCK_SOURCE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void keyblockSourceCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="KEYBLOCK_SOURCE_CODE", function=KeyFunction.NEXT_ITEM)
		public void keyblockSourceCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="KEYBLOCK_SOURCE_CODE", function=KeyFunction.ITEM_OUT)
		public void keyblockSourceCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER KEYBLOCK_SOURCE_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
	lv_desc         VARCHAR2(60);
  lv_details_ind  VARCHAR2(1);
--
  CURSOR src_defaults_c IS
    SELECT GORCMSC_ATYP_CODE,
           GORCMSC_TELE_CODE,
           GORCMSC_EMAL_CODE,
           GORCMSC_ENTITY_CDE,
           GORCMSC_API_FAILURE_IND
      FROM GORCMSC
     WHERE GORCMSC_CMSC_CODE = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
--
  CURSOR dtl_exists_c IS
    SELECT 'Y'
      FROM DUAL
     WHERE EXISTS
           (SELECT 'X'
              FROM GORCMDO
             WHERE GORCMDO_CMSC_CODE = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
--
BEGIN
  IF :KEY_BLOCK.KEYBLOCK_SOURCE_CODE IS NULL THEN
 		:KEY_BLOCK.KEYBLOCK_SOURCE_DESC := '';
    RETURN;
  END IF;
--
	lv_desc := gb_gtvcmsc.f_get_description(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
  IF lv_desc IS NULL THEN
    MESSAGE(G$_NLS.GET('GOAMTCH-0035','FORM','*ERROR* Invalid Matching Source Code, press LIST for Valid Codes'));
		:KEY_BLOCK.KEYBLOCK_SOURCE_DESC := '';
		:GLOBAL.CM_SOURCE_CODE := '';
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
-- 73-1
	:KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT := gb_gtvcmsc.f_get_long_desc(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE);
--
  :KEY_BLOCK.KEYBLOCK_SOURCE_DESC := lv_desc;
	:GLOBAL.CM_SOURCE_CODE := :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
--
  OPEN src_defaults_c;
  FETCH src_defaults_c INTO :KEY_BLOCK.KEYBLOCK_ATYP_CODE, :KEY_BLOCK.KEYBLOCK_TELE_CODE, 
                            :KEY_BLOCK.KEYBLOCK_EMAL_CODE, :KEY_BLOCK.KEYBLOCK_ENTITY_CDE,
                            :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND;
  CLOSE src_defaults_c;
--
  IF NOT gokcmpk.f_rules_exists(:KEY_BLOCK.KEYBLOCK_SOURCE_CODE) THEN
   	MESSAGE(G$_NLS.GET('GOAMTCH-0036','FORM','*ERROR* Rules do not exist for this source code: %01%',  :KEY_BLOCK.KEYBLOCK_SOURCE_CODE));
   	RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
-- Determine if any detail records exist for this source code.
--
  OPEN dtl_exists_c;
  FETCH dtl_exists_c INTO lv_details_ind;
  CLOSE dtl_exists_c;
--
  :FORM_HEADER.DETAILS_EXIST := NVL(lv_details_ind,'N');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_validate()
		{
			
				int rowCount = 0;
			this.keyblockSourceCode_PostChange();

				{
					NString lvDesc= NString.getNull();
					NString lvDetailsInd= NString.getNull();
					String sqlsrcDefaultsC = "SELECT GORCMSC_ATYP_CODE, GORCMSC_TELE_CODE, GORCMSC_EMAL_CODE, GORCMSC_ENTITY_CDE, GORCMSC_API_FAILURE_IND " +
	" FROM GORCMSC " +
	" WHERE GORCMSC_CMSC_CODE = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE ";
					DataCursor srcDefaultsC = new DataCursor(sqlsrcDefaultsC);
					String sqldtlExistsC = "SELECT 'Y' " +
	" FROM DUAL " +
	" WHERE  EXISTS(SELECT 'X' " +
		" FROM GORCMDO " +
		" WHERE GORCMDO_CMSC_CODE = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE ) ";
					DataCursor dtlExistsC = new DataCursor(sqldtlExistsC);
					try {
						if ( getFormModel().getKeyBlock().getKeyblockSourceCode().isNull() )
						{
							getFormModel().getKeyBlock().setKeyblockSourceDesc(toStr(""));
							return ;
						}
						// 
						lvDesc = GbGtvcmsc.fGetDescription(getFormModel().getKeyBlock().getKeyblockSourceCode());
						if ( lvDesc.isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAMTCH-0035"), toStr("FORM"), toStr("*ERROR* Invalid Matching Source Code, press LIST for Valid Codes")));
							getFormModel().getKeyBlock().setKeyblockSourceDesc(toStr(""));
							setGlobal("CM_SOURCE_CODE", toStr(""));
							throw new ApplicationException();
						}
						//  73-1
						getFormModel().getKeyBlock().setKeyblockSourceComment(GbGtvcmsc.fGetLongDesc(getFormModel().getKeyBlock().getKeyblockSourceCode()));
						// 
						getFormModel().getKeyBlock().setKeyblockSourceDesc(lvDesc);
						setGlobal("CM_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
						// 
						//Setting query parameters
						srcDefaultsC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
						srcDefaultsC.open();
						ResultSet srcDefaultsCResults = srcDefaultsC.fetchInto();
						if ( srcDefaultsCResults != null ) {
							getFormModel().getKeyBlock().setKeyblockAtypCode(srcDefaultsCResults.getStr(0));
							getFormModel().getKeyBlock().setKeyblockTeleCode(srcDefaultsCResults.getStr(1));
							getFormModel().getKeyBlock().setKeyblockEmalCode(srcDefaultsCResults.getStr(2));
							getFormModel().getKeyBlock().setKeyblockEntityCde(srcDefaultsCResults.getStr(3));
							getFormModel().getKeyBlock().setKeyblockApiFailureInd(srcDefaultsCResults.getStr(4));
						}
						//srcDefaultsC.close();
						// 
						if ( Gokcmpk.fRulesExists(getFormModel().getKeyBlock().getKeyblockSourceCode()).not() )
						{
							errorMessage(GNls.Fget(toStr("GOAMTCH-0036"), toStr("FORM"), toStr("*ERROR* Rules do not exist for this source code: %01%"), getFormModel().getKeyBlock().getKeyblockSourceCode()));
							throw new ApplicationException();
						}
						// 
						//  Determine if any detail records exist for this source code.
						// 
						//Setting query parameters
						dtlExistsC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
						dtlExistsC.open();
						ResultSet dtlExistsCResults = dtlExistsC.fetchInto();
						if ( dtlExistsCResults != null ) {
							lvDetailsInd = dtlExistsCResults.getStr(0);
						}
						//dtlExistsC.close();
						// 
						getFormModel().getFormHeader().setDetailsExist(isNull(lvDetailsInd, "N"));
					}
					finally{
						srcDefaultsC.close();
						dtlExistsC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEYBLOCK_SOURCE_CODE.POST-CHANGE
		 IF :KEY_BLOCK.KEYBLOCK_SOURCE_CODE IS NULL THEN
  :KEY_BLOCK.KEYBLOCK_SOURCE_DESC := '';
  :GLOBAL.CM_SOURCE_CODE := '';
--
  :KEY_BLOCK.KEYBLOCK_ATYP_CODE := '';
  :KEY_BLOCK.KEYBLOCK_EMAL_CODE := '';
  :KEY_BLOCK.KEYBLOCK_TELE_CODE := '';
  :KEY_BLOCK.KEYBLOCK_ENTITY_CDE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_PostChange()
		{
			
				KeyBlock keyBlockElement = this.getFormModel().getKeyBlock();
				
				if(keyBlockElement .getKeyblockSourceCode().isNull())
		return;
				if ( getFormModel().getKeyBlock().getKeyblockSourceCode().isNull() )
				{
					getFormModel().getKeyBlock().setKeyblockSourceDesc(toStr(""));
					setGlobal("CM_SOURCE_CODE", toStr(""));
					// 
					getFormModel().getKeyBlock().setKeyblockAtypCode(toStr(""));
					getFormModel().getKeyBlock().setKeyblockEmalCode(toStr(""));
					getFormModel().getKeyBlock().setKeyblockTeleCode(toStr(""));
					getFormModel().getKeyBlock().setKeyblockEntityCde(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEYBLOCK_SOURCE_CODE.KEY_LISTVAL
		 G$_DISPLAY_LOV('','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE.KEY_LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY_LISTVAL", item="KEYBLOCK_SOURCE_CODE")
		public void keyblockSourceCode_KeyListval()
		{
			
				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KEYBLOCK_SOURCE_CODE_LBT")
		public void keyblockSourceCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="KEYBLOCK_SOURCE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void keyblockSourceDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_SOURCE_COMMENT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KEYBLOCK_SOURCE_COMMENT_BTN")
		public void keyblockSourceCommentBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER KEYBLOCK_SOURCE_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0037','FORM','Button is outside the current block'));
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
		 * KEYBLOCK_SOURCE_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="KEYBLOCK_SOURCE_COMMENT_BTN")
		public void keyblockSourceCommentBtn_buttonClick()
		{
			
				if ( getCursorBlock().notEquals("KEY_BLOCK") )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0037"), toStr("FORM"), toStr("Button is outside the current block")));
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
		 * GENERATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GENERATE_BTN")
		public void generateBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GENERATE_BTN.WHEN-BUTTON-PRESSED
		 :ID := 'GENERATED';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GENERATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GENERATE_BTN")
		public void generateBtn_buttonClick()
		{
			
				getFormModel().getKeyBlock().setId(toStr("GENERATED"));
			}

	
	
}

