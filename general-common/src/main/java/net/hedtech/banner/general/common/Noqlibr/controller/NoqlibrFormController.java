package net.hedtech.banner.general.common.Noqlibr.controller;
import java.util.*;

import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;

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
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.banner.general.common.Noqlibr.model.*;
import net.hedtech.banner.general.common.Noqlibr.*;
import net.hedtech.banner.general.common.Noqlibr.services.*;



public class NoqlibrFormController extends AbstractSupportCodeObject  {
	
	
	public NoqlibrFormController (ITask task) {
		super(task);
	}
	
	public NoqlibrFormController(ISupportCodeContainer container) 
	{
		super(container);
	}
	
	@Override
	public NoqlibrTaskPart getContainer() {
		return (NoqlibrTaskPart)super.getContainer();
	}
	
	public NoqlibrModel getFormModel() {
		return getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NOQLIBR.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.7.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQLIBR.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		
		public void Noqlibr_LoadCurrentRelease()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NoqlibrFormController.Noqlibr_LoadCurrentRelease is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER NOQLIBR.PRE-FORM
		 EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQLIBR.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		
		public void Noqlibr_TaskStartedPre(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				executeAction("LOAD_CURRENT_RELEASE");
//				executeAction("G$_VERIFY_ACCESS");
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NoqlibrFormController.Noqlibr_TaskStartedPre is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER NOQLIBR.POST-FORM
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQLIBR.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		
		public void Noqlibr_TaskEnded(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();

				this.getLogger().trace(this, "F2J :  trigger net.hedtech.banner.general.common.Noqlibr.controller.NoqlibrFormController.Noqlibr_TaskEnded is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER NOQLIBR.N$_GUROPTM_CALL_FORM
		 <multilinecomment> This trigger will call a form specified in the GUROPTM table.  It uses the logic from 
    G$_secured_form_call to check security. </multilinecomment>
  
DECLARE 

FORM_TO_CALL VARCHAR2 (30);
TYPE_IND VARCHAR2(1);
CAPACITY VARCHAR2(1);
CURRENT_FORM VARCHAR2(10);
USER_NAME VARCHAR2(30);

CURSOR GET_CAPACITY IS
SELECT GUROPTM_CAPACITY
FROM GUROPTM
WHERE GUROPTM_FORM_NAME = CURRENT_FORM
AND GUROPTM_NAME1 = FORM_TO_CALL
AND GUROPTM_TYPE_IND = TYPE_IND;

<multilinecomment> GOT_PERMISSION    CHAR(1);


CURSOR SECURITY_CURSOR IS
         SELECT GURSECR_CAPACITY_IND
         FROM   GURSECR
         WHERE  GURSECR_TYPE_IND     = 'F'
           AND  GURSECR_PROCESS_NAME = FORM_TO_CALL
           AND  (GURSECR_USER_NAME   = USER_NAME
             OR  GURSECR_USER_NAME   = 'PUBLIC')
         ORDER BY DECODE(GURSECR_USER_NAME, 'PUBLIC', 2, 1) ; </multilinecomment>

BEGIN
  CURRENT_FORM := GET_APPLICATION_PROPERTY (CURRENT_FORM_NAME);
  EXECUTE_TRIGGER ('SAVE_KEYS');
  FORM_TO_CALL:= :GLOBAL.GUROPTM_NAME1;
  TYPE_IND := :GLOBAL.GUROPTM_TYPE_IND;
  USER_NAME := :GLOBAL.CURRENT_USER;

<multilinecomment>  IF :GLOBAL.SECRSYS = 'Y'  THEN
    OPEN SECURITY_CURSOR ;
    FETCH SECURITY_CURSOR INTO GOT_PERMISSION ;
  END IF; </multilinecomment>

  OPEN GET_CAPACITY;
  FETCH GET_CAPACITY INTO CAPACITY;
<multilinecomment>  IF GOT_PERMISSION = 'Q' AND :GLOBAL.SECRSYS = 'Y' THEN 
     G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
     G$_CHECK_FAILURE ;
  ELSIF GOT_PERMISSION NOT IN ('Q','M') AND :GLOBAL.SECRSYS = 'Y' THEN 
     MESSAGE('*ERROR* User does not have permission for requested form' ) ;
     RAISE FORM_TRIGGER_FAILURE; </multilinecomment>
  IF CAPACITY = 'Q'  THEN 
     EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
     G$_CHECK_FAILURE ;
     G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
     G$_CHECK_FAILURE ;
  ELSE 
     EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
     G$_CHECK_FAILURE ;
     G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'');
     G$_CHECK_FAILURE ;
  END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQLIBR.N$_GUROPTM_CALL_FORM
		 *
		 *
		 *</p>
		*/
		public void Noqlibr_NGuroptmCallForm()
		{
			
				//  This trigger will call a form specified in the GUROPTM table.  It uses the logic from
				// G$_secured_form_call to check security. 

				int rowCount = 0;
				{
					NString formToCall= NString.getNull();
					NString typeInd= NString.getNull();
					NString capacity= NString.getNull();
					NString currentForm= NString.getNull();
					NString userName= NString.getNull();
					String sqlgetCapacity = "SELECT GUROPTM_CAPACITY " +
	" FROM GUROPTM " +
	" WHERE GUROPTM_FORM_NAME = :P_CURRENT_FORM AND GUROPTM_NAME1 = :P_FORM_TO_CALL AND GUROPTM_TYPE_IND = :P_TYPE_IND ";
					DataCursor getCapacity = new DataCursor(sqlgetCapacity);
					try {
						currentForm = toStr(getCurrentTaskName());
						executeAction("SAVE_KEYS");
						formToCall = getGlobal("GUROPTM_NAME1");
						typeInd = getGlobal("GUROPTM_TYPE_IND");
						userName = getGlobal("CURRENT_USER");
						//   IF :GLOBAL.SECRSYS = 'Y'  THEN
						// OPEN SECURITY_CURSOR ;
						// FETCH SECURITY_CURSOR INTO GOT_PERMISSION ;
						// END IF; 
						//Setting query parameters
						getCapacity.addParameter("P_CURRENT_FORM", currentForm);
						getCapacity.addParameter("P_FORM_TO_CALL", formToCall);
						getCapacity.addParameter("P_TYPE_IND", typeInd);
						getCapacity.open();
						ResultSet getCapacityResults = getCapacity.fetchInto();
						if ( getCapacityResults != null ) {
							capacity = getCapacityResults.getStr(0);
						}
						//   IF GOT_PERMISSION = 'Q' AND :GLOBAL.SECRSYS = 'Y' THEN
						// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
						// G$_CHECK_FAILURE ;
						// ELSIF GOT_PERMISSION NOT IN ('Q','M') AND :GLOBAL.SECRSYS = 'Y' THEN
						// MESSAGE('*ERROR* User does not have permission for requested form' ) ;
						// RAISE FORM_TRIGGER_FAILURE; 
						if ( capacity.equals("Q") )
						{
							executeAction("G$_REVOKE_ACCESS");
							
							getContainer().getGoqrpls().gCheckFailure();
							getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), formToCall, toStr("QUERY"));
							getContainer().getGoqrpls().gCheckFailure();
						}
						else {
							executeAction("G$_REVOKE_ACCESS");
							getContainer().getGoqrpls().gCheckFailure();
							getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), formToCall, toStr(""));
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
					finally{
						getCapacity.close();
					}
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER N$_COMMENTS_EDITOR_CLASS.KEY-EDIT
		 DECLARE
  ed_ok           BOOLEAN;
  comment_out     VARCHAR2(2000);
  comment_in		  VARCHAR2(2000);
BEGIN
	 comment_in := NAME_IN(NAME_IN('SYSTEM.CURSOR_ITEM'));
   SHOW_EDITOR('N$_COMMENTS_EDITOR',comment_in,30,32,comment_out,ed_ok);
-- User accepts the change from the editor window by clicking on the OK button
   IF ed_ok THEN
  	  COPY(comment_out, NAME_IN('SYSTEM.CURSOR_ITEM'));
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * N$_COMMENTS_EDITOR_CLASS.KEY-EDIT
		 *
		 *
		 *</p>
		*/
		
		public void nCommentsEditorClass_KeyEdit()
		{
			editTextitem();							
		}	
		
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER NOQLIBR.CHECK_TO_SAVE_NORCMNT
		-- This trigger prompts user to commit if changes are made in the current block that they are on.
IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
  GO_ITEM(:SYSTEM.CURSOR_ITEM);
  IF :SYSTEM.CURRENT_BLOCK = 'NORCMNT'THEN
    message(G$_NLS.Get('NOQLIBR-0000','FORM', 'Comments changed, press SAVE before leaving current window.'));
    RAISE FORM_TRIGGER_FAILURE;
	END IF;		  
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NOQLIBR.CHECK_TO_SAVE_NORCMNT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TO_SAVE_NORCMNT")
		public void Noqlibr_CheckToSaveNorcmnt()
		{
			
				//  This trigger prompts user to commit if changes are made in the current block that they are on.
				if ( getBlockStatus().equals("CHANGED") )
				{
					goItem(toStr(getCursorItem()));
					if ( getCurrentBlock().equals("NORCMNT") )
					{
						errorMessage(GNls.Fget(toStr("NOQLIBR-0000"), toStr("FORM"), toStr("*ERROR* Comments changed, press SAVE before leaving current window.")));
						throw new ApplicationException();
					}
				}
			}
}
	
