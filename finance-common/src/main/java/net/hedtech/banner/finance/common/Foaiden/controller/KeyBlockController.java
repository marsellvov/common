package net.hedtech.banner.finance.common.Foaiden.controller;
 
import java.util.*;

import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			


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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	private net.hedtech.banner.finance.common.Foaiden.controller.KeyBlockController getFoaidenKeyBlockController() {
		return (net.hedtech.banner.finance.common.Foaiden.controller.KeyBlockController) this.getTask().getTaskPart("FOAIDEN").getSupportCodeManager().getPackage("KEY_BLOCK");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}
	
	public KeyBlockController(IFormController parentController, String name) 
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
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
				getGKeyBlockClass().save();
			}

		
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
			
				getGKeyBlockClass().moveUp();
			}

		
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
			
				getGKeyBlockClass().moveDown();
			}

		
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
			
				getGKeyBlockClass().createRecord();
			}

		
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
			
				getGKeyBlockClass().deleteRecord();
			}

		
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
			
				getGKeyBlockClass().search();
			}

		
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
			
				getGKeyBlockClass().executeQuery();
			}

		
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
			
				getGKeyBlockClass().nextRecord();
			}

		
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
			
				getGKeyBlockClass().keyNxtset();
			}

		
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
			
				getGKeyBlockClass().previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *This trigger will check if an id number or 'GENERATED' was entered.  If it

		 *was, then advance to next block. If not, display error message.
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
			
				nextBlock();
			}

		
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
			
				getGKeyBlockClass().previousBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'Y';
:GLOBAL.VALUE := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
				setGlobal("VALUE", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.MNU_OPT_PRO_GENERATE_ID
		 :ID := 'GENERATED';
:FULL_NAME := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.MNU_OPT_PRO_GENERATE_ID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="MNU_OPT_PRO_GENERATE_ID")
		public void keyBlock_MnuOptProGenerateId()
		{
			
				getFormModel().getKeyBlock().setId(toStr("GENERATED"));
				getFormModel().getKeyBlock().setFullName(toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="ID", function=KeyFunction.ITEM_IN)
		public void id_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-NEXT-ITEM
		 DECLARE
  CURSOR PTI_CURSOR IS
    SELECT 'X'
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :KEY_BLOCK.ID;
     
	lv_exists  VARCHAR2(1);   
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO lv_exists;
  IF PTI_CURSOR%NOTFOUND THEN	
	  IF  :ID = :FORM_HEADER.NEXT_DOC_NUM THEN
	    :ID := 'GENERATED';       
	  END IF;  
  END IF;
  CLOSE PTI_CURSOR;
  G$_IDNAME_SEARCH.ID_SEARCH('ID','','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ID", function=KeyFunction.NEXT_ITEM)
		public void id_keyNexItem()
		{
			
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :KEY_BLOCK_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					NString lvExists= NString.getNull();
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_ID", getFormModel().getKeyBlock().getId());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							lvExists = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							if ( getFormModel().getKeyBlock().getId().equals(getFormModel().getFormHeader().getNextDocNum()) )
							{
								getFormModel().getKeyBlock().setId(toStr("GENERATED"));
							}
						}
						ptiCursor.close();
						getTask().getGoqrpls().getGIdnameSearch().idSearch(toStr("ID"), toStr(""), toStr(""));
						getTask().getGoqrpls().gCheckFailure();
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ID")
		public void id_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOICOMP','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOICOMP"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					if(!getFormModel().getKeyBlock().getId().isEmpty()){
						this.id_validate();
					}
					//
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOIIDEN','QUERY');
G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER('LIST_VALUES_COPY');
      G$_CHECK_FAILURE;
      NEXT_FIELD;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ID", function=KeyFunction.LIST_VALUES)
		public void id_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOIIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					if(!getFormModel().getKeyBlock().getId().isEmpty()){
						this.id_validate();
					}
					//
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 <multilinecomment>
:FULL_NAME := '';  </multilinecomment>
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER, 'GUIALTI', 'QUERY');

IF :GLOBAL.VALUE IS NOT NULL THEN
	 EXECUTE_TRIGGER('LIST_VALUES_COPY');
	 G$_CHECK_FAILURE;
	 NEXT_FIELD;
	 G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_ITEM)
		public void id_KeyDupItem()
		{
			
				// :FULL_NAME := '';  
				// :FULL_NAME := '';  
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUIALTI"), toStr("QUERY"));
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					if(!getFormModel().getKeyBlock().getId().isEmpty()){
						this.id_validate();
					}
					//
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 DECLARE
	
	lv_id	SPRIDEN.SPRIDEN_ID%TYPE;
	lv_cm_status  VARCHAR2(4);
	
  CURSOR PTI_CURSOR IS
    SELECT SPRIDEN_PIDM, SPRIDEN_ENTITY_IND
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :KEY_BLOCK.ID;
BEGIN
--
-- Determine if the id number is to be generated.
-- If it is, no further id checking is necessary.
--
  :DCSD_IND := '';
  IF :ID IS NULL THEN
  	RETURN;
  END IF;
--
  IF (:ID = 'GENERATED') THEN
    :ENTITY_IND := '';
    :FULL_NAME := '';
    lv_cm_status := G$_INVOKE_CM;
    IF lv_cm_status <> 'DONE' AND lv_cm_status <> 'SKIP' THEN
    	MESSAGE(G$_NLS.Get('FOAIDEN-0011','FORM','*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching',USER));
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
    IF lv_cm_status = 'SKIP' THEN
      RETURN;
    END IF;
  END IF;
--
-- Initialize the PIDM to null to ensure that a
-- previous PIDM does not get used for a different (changed) ID.
-- Check for an id change.
--
  IF (NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND 
  	  G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'YES') AND
  	  G$_VERIFY_ID_AS_SSN(:ID) THEN
-- -- ID is found as an SSN and want to perform the G$_VALID_ALL_ID (and then get out)
    G$_VALID_ALL_ID (:ID, :PIDM, :FULL_NAME, :CONFID_IND, :DCSD_IND);
    G$_CHECK_FAILURE;  
    RETURN;
  ELSE
    :KEY_BLOCK.PIDM :=  NULL;
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO :PIDM,:ENTITY_IND;
    IF PTI_CURSOR%FOUND THEN
  	  CLOSE PTI_CURSOR;
      G$_VALID_ALL_ID (:ID, :PIDM, :FULL_NAME, :CONFID_IND, :DCSD_IND);
      G$_CHECK_FAILURE;  
      RETURN;
    ELSE
  	  CLOSE PTI_CURSOR;
  	  IF G$_VERIFY_ID_EXISTS(:ID) THEN
        message(G$_NLS.Get('FOAIDEN-0012','FORM','*ERROR* You do not have permission to view this ID'));
  		  RAISE FORM_TRIGGER_FAILURE;
  	  ELSE
        IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND
    	     gokfgac.f_spriden_pii_active = 'Y'             AND
    	     gokfgac.f_is_user_exempt = 'N'                 AND
        	 G$_VERIFY_SSN_EXISTS(:ID)                      THEN
          MESSAGE(G$_NLS.Get('FOAIDEN-0013','FORM','*ERROR* You do not have permission to view this ID.'));
          RAISE FORM_TRIGGER_FAILURE;
        ELSE
        	IF :ID = :FORM_HEADER.NEXT_DOC_NUM THEN
        	   :ID := 'GENERATED';	
        	END IF;
          lv_cm_status := G$_INVOKE_CM;    
          IF lv_cm_status <> 'DONE' AND lv_cm_status <> 'SKIP' THEN
      	    MESSAGE(G$_NLS.Get('FOAIDEN-0014','FORM','*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching',USER));
    	      RAISE FORM_TRIGGER_FAILURE;
          END IF;
          :FULL_NAME := '';        
        END IF;
  	  END IF;
  	  
  	  IF lv_cm_status = 'DONE' THEN
        G$_SEL_SPRIDEN_PIDM_NAME(:ID,'FULL_NAME','Y',:PIDM);
        G$_CHECK_FAILURE; 
  	  END IF;
    END IF;
--
    :ENTITY_IND := '';
  END IF;  
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
			this.id_PostChange();

				{
					NString lvId= NString.getNull();
					NString lvCmStatus= NString.getNull();
					String sqlptiCursor = "SELECT SPRIDEN_PIDM, SPRIDEN_ENTITY_IND " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :KEY_BLOCK_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						// 
						//  Determine if the id number is to be generated.
						//  If it is, no further id checking is necessary.
						// 
						getFormModel().getKeyBlock().setDcsdInd(toStr(""));
						if ( getFormModel().getKeyBlock().getId().isNull() )
						{
							return ;
						}
						// 
						if ((getFormModel().getKeyBlock().getId().equals("GENERATED")))
						{
							getFormModel().getKeyBlock().setEntityInd(toStr(""));
							getFormModel().getKeyBlock().setFullName(toStr(""));
							lvCmStatus = getTask().getGoqrpls().gInvokeCm();
							if ( lvCmStatus.notEquals("DONE") && lvCmStatus.notEquals("SKIP") )
							{
								errorMessage(GNls.Fget(toStr("FOAIDEN-0011"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching"), getUser()));
								throw new ApplicationException();
							}
							if ( lvCmStatus.equals("SKIP") )
							{
								return ;
							}
						}
						// 
						//  Initialize the PIDM to null to ensure that a
						//  previous PIDM does not get used for a different (changed) ID.
						//  Check for an id change.
						// 
						if ( (getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("YES")) && getTask().getGoqrpls().gVerifyIdAsSsn(getFormModel().getKeyBlock().getId()).toBoolean() )
						{
							//  -- ID is found as an SSN and want to perform the G$_VALID_ALL_ID (and then get out)
							Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
							Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
							Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getFullName());
							Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfidInd());
							Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDcsdInd());
							getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
							getFormModel().getKeyBlock().setId(pId_ref.val);
							getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
							getFormModel().getKeyBlock().setFullName(pFullName_ref.val);
							getFormModel().getKeyBlock().setConfidInd(pConfidInd_ref.val);
							getFormModel().getKeyBlock().setDcsdInd(pDcsdInd_ref.val);
							getTask().getGoqrpls().gCheckFailure();
							return ;
						}
						else {
							getFormModel().getKeyBlock().setPidm(toNumber(null));
							//Setting query parameters
							ptiCursor.addParameter("KEY_BLOCK_ID", getFormModel().getKeyBlock().getId());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								getFormModel().getKeyBlock().setPidm(ptiCursorResults.getNumber(0));
								getFormModel().getKeyBlock().setEntityInd(ptiCursorResults.getStr(1));
							}
							if ( ptiCursor.found() )
							{
								ptiCursor.close();
								Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
								Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
								Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getFullName());
								Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfidInd());
								Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDcsdInd());
								getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
								getFormModel().getKeyBlock().setId(pId_ref.val);
								getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
								getFormModel().getKeyBlock().setFullName(pFullName_ref.val);
								getFormModel().getKeyBlock().setConfidInd(pConfidInd_ref.val);
								getFormModel().getKeyBlock().setDcsdInd(pDcsdInd_ref.val);
								getTask().getGoqrpls().gCheckFailure();
								return ;
							}
							else {
								ptiCursor.close();
								if ( getTask().getGoqrpls().gVerifyIdExists(getFormModel().getKeyBlock().getId()).getValue() )
								{
									errorMessage(GNls.Fget(toStr("FOAIDEN-0012"), toStr("FORM"), toStr("*ERROR* You do not have permission to view this ID")));
									throw new ApplicationException();
								}
								else {
									if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && Gokfgac.fSpridenPiiActive().equals("Y") && Gokfgac.fIsUserExempt().equals("N") && getTask().getGoqrpls().gVerifySsnExists(getFormModel().getKeyBlock().getId()).toBoolean() )
									{
										errorMessage(GNls.Fget(toStr("FOAIDEN-0013"), toStr("FORM"), toStr("*ERROR* You do not have permission to view this ID.")));
										throw new ApplicationException();
									}
									else {
										if ( getFormModel().getKeyBlock().getId().equals(getFormModel().getFormHeader().getNextDocNum()) )
										{
											getFormModel().getKeyBlock().setId(toStr("GENERATED"));
										}
										lvCmStatus = getTask().getGoqrpls().gInvokeCm();
										if ( lvCmStatus.notEquals("DONE") && lvCmStatus.notEquals("SKIP") )
										{
											errorMessage(GNls.Fget(toStr("FOAIDEN-0014"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching"), getUser()));
											throw new ApplicationException();
										}
										getFormModel().getKeyBlock().setFullName(toStr(""));
									}
								}
								if ( lvCmStatus.equals("DONE") )
								{
									Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
									Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
									getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FULL_NAME"), toStr("Y"), pPidm_ref);
									getFormModel().getKeyBlock().setId(pId_ref.val);
									getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
									getTask().getGoqrpls().gCheckFailure();
								}
							}
							// 
							getFormModel().getKeyBlock().setEntityInd(toStr(""));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FULL_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FULL_NAME", function=KeyFunction.NEXT_ITEM)
		public void fullName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
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
		 DECLARE
	lv_cm_status	varchar2(4);
BEGIN
	IF :SYSTEM.CURSOR_ITEM <> 'KEY_BLOCK.ID' THEN
	   GO_ITEM('KEY_BLOCK.ID');
	END IF;
	
	:ID := 'GENERATED';
	:FULL_NAME := '';
--
	:CONFID_IND := '';
	:global.key_idno := 'GENERATED';
	lv_cm_status := G$_INVOKE_CM;
	IF lv_cm_status <> 'DONE' AND lv_cm_status <> 'SKIP' THEN
	  MESSAGE(G$_NLS.Get('FOAIDEN-0020','FORM','*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching',USER));
		raise form_trigger_failure;
	END IF;
	 IF lv_cm_status = 'DONE' THEN
     	G$_SEL_SPRIDEN_PIDM_NAME(:ID,'FULL_NAME','Y',:PIDM);
      G$_CHECK_FAILURE; 
  END IF;
END;


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
			
				{
					NString lvCmStatus= NString.getNull();
					if ( getCursorItem().notEquals("KEY_BLOCK.ID") )
					{
						goItem(toStr("KEY_BLOCK.ID"));
					}
					getFormModel().getKeyBlock().setId(toStr("GENERATED"));
					getFormModel().getKeyBlock().setFullName(toStr(""));
					// 
					getFormModel().getKeyBlock().setConfidInd(toStr(""));
					setGlobal("KEY_IDNO", toStr("GENERATED"));
					lvCmStatus = getTask().getGoqrpls().gInvokeCm();
					if ( lvCmStatus.notEquals("DONE") && lvCmStatus.notEquals("SKIP") )
					{
						errorMessage(GNls.Fget(toStr("FOAIDEN-0020"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and %01% is set up to run Common Matching"), getUser()));
						throw new ApplicationException();
					}
					if ( lvCmStatus.equals("DONE") )
					{
						Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
						getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FULL_NAME"), toStr("Y"), pPidm_ref);
						getFormModel().getKeyBlock().setId(pId_ref.val);
						getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}
	
}

