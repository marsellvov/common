package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;

import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GGoqolibPpTrigger extends AbstractSupportCodeObject {
	

	public GGoqolibPpTrigger(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GOQOLIB_PP_TRIGGER
	/*
	PACKAGE G$_GOQOLIB_PP_TRIGGER IS
  PROCEDURE PRE_FORM;
  PROCEDURE PRE_BLOCK;
  PROCEDURE PRE_INSERT;
  PROCEDURE PRE_UPDATE;
  PROCEDURE PRE_DELETE;
--
  PROCEDURE POST_FORM;
  PROCEDURE POST_BLOCK;
  PROCEDURE POST_INSERT;
  PROCEDURE POST_UPDATE;
  PROCEDURE POST_DELETE;
--
  PROCEDURE POST_FORMS_COMMIT;
  PROCEDURE PRE_COMMIT;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GOQOLIB_PP_TRIGGER
		/*
		PACKAGE BODY G$_GOQOLIB_PP_TRIGGER IS
--
-- 4-0-2 Pre_Block and Post_Block modified to incorporate 
--     G$_Required_Item to apply appropriate Named Visual 
--     Attributes.
--
  PROCEDURE PRE_FORM IS
  BEGIN
    EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
    G$_FORM_STARTUP;
    G$_CHECK_FAILURE;     
--
    G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
--
    EXECUTE_TRIGGER('PRE_FORM_TRG');
    G$_CHECK_FAILURE;
    -- 80-3
    G$_SD.p_pre_form;
    --
  END;
--
  PROCEDURE PRE_BLOCK IS
    Curr_Block_Name         VARCHAR2(60) := NAME_IN('SYSTEM.TRIGGER_BLOCK');
    Cursor_Item_Name        VARCHAR2(60) := NAME_IN('SYSTEM.CURSOR_ITEM');
  BEGIN 
--
-- fhl 05/15/2000 add condition below.
--
    IF GET_BLOCK_PROPERTY(Curr_Block_Name,RECORDS_DISPLAYED) > 1 THEN
      IF Cursor_Item_Name IS NOT NULL AND
         GET_ITEM_PROPERTY(Cursor_Item_Name,VISUAL_ATTRIBUTE) ='G$_NVA_FIXED_TEXT_ITEM' THEN
        SET_BLOCK_PROPERTY(Curr_Block_Name,CURRENT_RECORD_ATTRIBUTE,'G$_NVA_HIGHLITE_FIXED_TEXT');	  
      ELSE 
        SET_BLOCK_PROPERTY(Curr_Block_Name,CURRENT_RECORD_ATTRIBUTE,'G$_NVA_HIGHLITE_TEXT');
      END IF;
    ELSE
  	  SET_BLOCK_PROPERTY(Curr_Block_Name,CURRENT_RECORD_ATTRIBUTE,'');
    END IF;
--
    -- 80-3
    G$_SD.p_pre_block;
--
    EXECUTE_TRIGGER('PRE_BLOCK_TRG');
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE PRE_INSERT IS
  BEGIN
    G$_UPDATE_ACTIVITY_DATE;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE PRE_UPDATE IS
  BEGIN
    G$_UPDATE_ACTIVITY_DATE;
    G$_CHECK_FAILURE;
  END;
--
  PROCEDURE PRE_DELETE IS
  BEGIN
    NULL;
  END;
--
-- POST routines.
--
  PROCEDURE POST_FORM IS
  BEGIN
    EXECUTE_TRIGGER('SAVE_KEYS');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('POST_FORM_TRG');
    G$_CHECK_FAILURE;
    G$_FORM_SHUTDOWN;
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    -- 80-3
    G$_SD.p_pst_form;
    --
  END;
--
  PROCEDURE POST_BLOCK IS
    Curr_Block_Name        VARCHAR2(60):= NAME_IN('SYSTEM.TRIGGER_BLOCK');
  BEGIN
--
-- fhl 5/15/2000 Add condition below.
--
    IF GET_BLOCK_PROPERTY(Curr_Block_Name,RECORDS_DISPLAYED) > 1 
    	-- 80-3
    AND (NOT g$_sd.f_sdisp_win_visible OR Curr_Block_Name=g$_sd.C_SDISP_BLOCK)
    -- Don't remove the current record attribute when sd is visible
    	THEN
      SET_BLOCK_PROPERTY(Curr_Block_Name,CURRENT_RECORD_ATTRIBUTE,'');
    END IF;
-- 80-3
-- 
    g$_sd.p_pst_block;
--
    EXECUTE_TRIGGER('POST_BLOCK_TRG');
    G$_CHECK_FAILURE;
  END; 
--
  PROCEDURE POST_INSERT IS
  BEGIN
    NULL;
  END;
--
  PROCEDURE POST_UPDATE IS
  BEGIN
    NULL;
  END;
--
  PROCEDURE POST_DELETE IS
  BEGIN
    NULL;
  END;
--
  PROCEDURE POST_FORMS_COMMIT IS
  BEGIN
    IF NAME_IN('SYSTEM.FORM_STATUS') <> 'QUERY' THEN
      EXECUTE_TRIGGER('POST_FORMS_COMMIT_TRG');
      G$_CHECK_FAILURE;
--
      BEGIN
        GB_COMMON.P_COMMIT('NO COMMIT');
      EXCEPTION
        WHEN OTHERS THEN
          MESSAGE(SUBSTR(SQLERRM,1,255));
          RAISE FORM_TRIGGER_FAILURE;
      END;
--
    END IF;
  END;
--
--
  PROCEDURE PRE_COMMIT IS
  BEGIN
    IF NAME_IN('SYSTEM.FORM_STATUS') <> 'QUERY' THEN
      IF G$_QUERY_ONLY_ROLE THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0048','LIB','*ERROR* You are running with a query only role, this function is not allowed.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
--
      EXECUTE_TRIGGER('PRE_COMMIT_TRG');
      G$_CHECK_FAILURE;
    END IF;
  END;
END;
		*/
		/* <p>
		* 
		*  4-0-2 Pre_Block and Post_Block modified to incorporate 
		*      G$_Required_Item to apply appropriate Named Visual 
		*      Attributes.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preForm()
		{
			try {
				executeAction("LOAD_CURRENT_RELEASE");
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
			try {
				executeAction("G$_VERIFY_ACCESS");
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
			try {
				getContainer().gFormStartup();
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
			try {
				getContainer().getGNavigationFrame().populateGuroptm();
			} catch (Exception e) {
				throw new ApplicationException(e);
			} 
			try {
				executeAction("PRE_FORM_TRG");
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
		}
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preBlock()
		{
		
			
			try {
				executeAction("PRE_BLOCK_TRG");
			} catch (Exception e) {
				throw new ApplicationException();
			}
			
		}
		
		public void blockInSetupSDE (){
			//  80-3
			getContainer().getGSd().pPreBlock();
			// 
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preInsert()
		{
			getContainer().gUpdateActivityDate();
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preUpdate()
		{
			getContainer().gUpdateActivityDate();
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preDelete()
		{
		}
/* <p>
		* 
		*  POST routines.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postForm()
		{
			executeAction("SAVE_KEYS");
			getContainer().gCheckFailure();
			executeAction("POST_FORM_TRG");
			getContainer().gCheckFailure();
			getContainer().gFormShutdown();
			getContainer().gCheckFailure();
			executeAction("G$_REVOKE_ACCESS");
		}
/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postBlock()
		{
			NString currBlockName = getTriggerBlock();
			// 
			//  fhl 5/15/2000 Add condition below.
			// 
			if ( findBlock(currBlockName).isMultiRecord() && (getContainer().getGSd().fSdispWinVisible().not() || currBlockName.equals(GSd.C_SDISP_BLOCK)) )
			{
				setBlockCurrentRecordStyleClass(currBlockName, "");
			}
			//  80-3
			//  
			getContainer().getGSd().pPstBlock();
			// 
			executeAction("POST_BLOCK_TRG");
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postInsert()
		{
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postUpdate()
		{
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postDelete()
		{
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postFormsCommit()
		{
			if ( !getTaskStatus().equals("QUERY") )
			{
				executeAction("POST_FORMS_COMMIT_TRG");
				getContainer().gCheckFailure();
				try
				{
					GbCommon.pCommit(toStr("NO COMMIT"));
				}
				catch(Exception  e)
				{
					errorMessage(substring(errorMessage(), toInt(1), toInt(255)));
					throw new ApplicationException();
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preCommit()
		{
			if ( !getTaskStatus().equals("QUERY") )
			{
				if ( getContainer().gQueryOnlyRole().getValue() )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0048"), toStr("LIB"), toStr("*ERROR* You are running with a query only role, this function is not allowed.")));
					throw new ApplicationException();
				}
				// 
				executeAction("PRE_COMMIT_TRG");
			}
		}
		
	
	
}
