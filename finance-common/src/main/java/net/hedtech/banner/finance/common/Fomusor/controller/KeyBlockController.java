package net.hedtech.banner.finance.common.Fomusor.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fomusor.model.*;
import net.hedtech.banner.finance.common.Fomusor.*;
import net.hedtech.banner.finance.common.Fomusor.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FomusorTask getTask() {
		return (FomusorTask)super.getTask();
	}

	public FomusorModel getFormModel() {
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
				getGKeyBlockClass().nextBlock();
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-DELREC
		    IF INSTR(:SYSTEM.TRIGGER_ITEM,'DELETE') > 0
    THEN
      EXECUTE_TRIGGER( 'CHECK_KEYS_DELETE') ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'COMMIT_DUMMY') ;
      G$_CHECK_FAILURE ;
      GO_BLOCK( 'FORUSOR' ) ;
     G$_CHECK_FAILURE ;
   END IF; 

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
			
				if ( inStr(toStr(getTriggerItem()), toStr("DELETE")).greater(0) )
				{
					executeAction("CHECK_KEYS_DELETE");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("COMMIT_DUMMY");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("FORUSOR"));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-MENU
		    EXECUTE_TRIGGER( 'CHECK_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   EXECUTE_TRIGGER( 'KEY_MENU' ) ;
   G$_CHECK_FAILURE ;
--
   IF :GLOBAL.CALLFRM IS NULL  THEN
      EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         GOTO END_TRIG ;
      END IF ;
   END IF ;
--
   << DO_EXIT >>
   EXIT_FORM ;
--
   << END_TRIG >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void keyBlock_KeyMenu()
		{
			
				executeAction("CHECK_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("KEY_MENU");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getGlobal("CALLFRM").isNull() )
				{
					try{
						executeAction("TRG_FAIL");
					}
					catch(Exception e) {
//						if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							 goto END_TRIG;
//						}
						return;
					}
				}
				 DO_EXIT:;
				exitTask();
				 END_TRIG:;
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
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
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		    IF :USER_ID IS NULL THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0001', 'FORM','*ERROR* User ID must be entered.')  
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF NVL(:USER_ID,'*') =
      NVL(:COPY_USER_ID,'*') THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0002', 'FORM','*ERROR* User ID cannot be the same as Copy User ID.')  
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF :EXCLUDE_COAS_CODE IS NOT NULL THEN
      IF :EXCLUDE_COAS_CODE <> '%'
       AND :EXCLUDE_ORGN_CODE IS NULL THEN
         MESSAGE(  G$_NLS.Get('FOMUSOR-0003', 'FORM','*ERROR* Exclude Organization Code must be entered when an Exclude COA exists.')  
                   
                 ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.CHECK_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_KEYS")
		public void keyBlock_CheckKeys()
		{
			
				if ( getFormModel().getKeyBlock().getUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0001"), toStr("FORM"), toStr("*ERROR* User ID must be entered.")));
					throw new ApplicationException();
				}
				// 
				if ( isNull(getFormModel().getKeyBlock().getUserId(), "*").equals(isNull(getFormModel().getKeyBlock().getCopyUserId(), "*")) )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0002"), toStr("FORM"), toStr("*ERROR* User ID cannot be the same as Copy User ID.")));
					throw new ApplicationException();
				}
				// 
				if ( !getFormModel().getKeyBlock().getExcludeCoasCode().isNull() )
				{
					if ( getFormModel().getKeyBlock().getExcludeCoasCode().notEquals("%") && getFormModel().getKeyBlock().getExcludeOrgnCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FOMUSOR-0003"), toStr("FORM"), toStr("*ERROR* Exclude Organization Code must be entered when an Exclude COA exists.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS_DELETE
		    IF :USER_ID IS NULL THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0004', 'FORM','*ERROR* User ID must be entered for delete.')  
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF :COPY_USER_ID IS NOT NULL THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0005', 'FORM','*ERROR* Copy User ID must be blank for delete.')  
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF NOT SELECT_FORUSOR_1 (:USER_ID) THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0006', 'FORM','*ERROR* Cannot delete; User ID does not exist.') 
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF :EXCLUDE_COAS_CODE IS NOT NULL THEN
      IF :EXCLUDE_COAS_CODE <> '%'
       AND :EXCLUDE_ORGN_CODE IS NULL THEN
         MESSAGE(  G$_NLS.Get('FOMUSOR-0007', 'FORM','*ERROR* Exclude Organization Code must be entered when an Exclude COA exists.')  
                   
                 ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      END IF ;
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.CHECK_KEYS_DELETE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_KEYS_DELETE")
		public void keyBlock_CheckKeysDelete()
		{
			
				if ( getFormModel().getKeyBlock().getUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0004"), toStr("FORM"), toStr("*ERROR* User ID must be entered for delete.")));
					throw new ApplicationException();
				}
				// 
				if ( !getFormModel().getKeyBlock().getCopyUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0005"), toStr("FORM"), toStr("*ERROR* Copy User ID must be blank for delete.")));
					throw new ApplicationException();
				}
				// 
				if ( this.getTask().getServices().selectForusor1(getFormModel().getKeyBlock().getUserId()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0006"), toStr("FORM"), toStr("*ERROR* Cannot delete; User ID does not exist.")));
					throw new ApplicationException();
				}
				// 
				if ( !getFormModel().getKeyBlock().getExcludeCoasCode().isNull() )
				{
					if ( getFormModel().getKeyBlock().getExcludeCoasCode().notEquals("%") && getFormModel().getKeyBlock().getExcludeOrgnCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FOMUSOR-0007"), toStr("FORM"), toStr("*ERROR* Exclude Organization Code must be entered when an Exclude COA exists.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.COMMIT_DUMMY
		 --
--  This commit of the dummy row forces the
--  POST-INSERT to copy the security data.
--
   GO_BLOCK( 'FORUSOR_DUMMY' ) ;
--
   :FORUSOR_DUMMY.FORUSOR_USER_ID_ENTERED :=
                       :KEY_BLOCK.USER_ID ;
   :FORUSOR_DUMMY.FORUSOR_COAS_CODE := '#' ;
   :FORUSOR_DUMMY.FORUSOR_ORGN_CODE := '######' ;
   :FORUSOR_DUMMY.FORUSOR_USER_ID :=
                    :CURRENT_USER1 ;
   :FORUSOR_DUMMY.FORUSOR_ACTIVITY_DATE :=
      TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
--
   :SYSTEM.MESSAGE_LEVEL := '8' ;
   COMMIT_FORM ;
   :SYSTEM.MESSAGE_LEVEL := '0' ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.COMMIT_DUMMY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COMMIT_DUMMY")
		public void keyBlock_CommitDummy()
		{
			
				// 
				//   This commit of the dummy row forces the
				//   POST-INSERT to copy the security data.
				// 

				ForusorDummyAdapter forusorDummyElement = (ForusorDummyAdapter)this.getFormModel().getForusorDummy().getRowAdapter(true);

				if(forusorDummyElement!=null){
				// 
				//   This commit of the dummy row forces the
				//   POST-INSERT to copy the security data.
				// 
				goBlock(toStr("FORUSOR_DUMMY"));
				// 
				forusorDummyElement.setForusorUserIdEntered(getFormModel().getKeyBlock().getUserId());
				forusorDummyElement.setForusorCoasCode(toStr("#"));
				forusorDummyElement.setForusorOrgnCode(toStr("######"));
				forusorDummyElement.setForusorUserId(getFormModel().getFormHeader().getCurrentUser1());
				forusorDummyElement.setForusorActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				commitTask();
				} finally {
							
				MessageServices.resetMessageLevel();
				}
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.WHEN-BUTTON-PRESSED
		    IF INSTR(:SYSTEM.TRIGGER_ITEM,'DELETE') > 0
    THEN
      EXECUTE_TRIGGER( 'CHECK_KEYS_DELETE') ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'COMMIT_DUMMY') ;
      G$_CHECK_FAILURE ;
      GO_BLOCK( 'FORUSOR' ) ;
     G$_CHECK_FAILURE ;
   END IF; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void keyBlock_buttonClick()
		{
			
				if ( inStr(toStr(getTriggerItem()), toStr("DELETE")).greater(0) )
				{
					executeAction("CHECK_KEYS_DELETE");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("COMMIT_DUMMY");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("FORUSOR"));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="USER_ID")
		public void userId_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="USER_ID", function=KeyFunction.ITEM_CHANGE)
		public void userId_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void userId_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="USER_ID", function=KeyFunction.NEXT_ITEM)
		public void userId_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="USER_ID", function=KeyFunction.ITEM_OUT)
		public void userId_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ID.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FOBPROF_USER_ID','FOBPROF_USER_NAME','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void userId_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FOBPROF_USER_ID"), toStr("FOBPROF_USER_NAME"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ID.POST-CHANGE
		    IF NOT SELECT_FOBPROF_1 (:USER_ID) THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0008', 'FORM','*ERROR* User must be established on the User Profile Maintenance form.')  
                
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="USER_ID")
		public void userId_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getUserId().isNull())
		return;
				if ( this.getTask().getServices().selectFobprof1(getFormModel().getKeyBlock().getUserId()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0008"), toStr("FORM"), toStr("*ERROR* User must be established on the User Profile Maintenance form.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="COPY_USER_ID")
		public void copyUserId_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="COPY_USER_ID", function=KeyFunction.ITEM_CHANGE)
		public void copyUserId_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void copyUserId_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="COPY_USER_ID", function=KeyFunction.NEXT_ITEM)
		public void copyUserId_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="COPY_USER_ID", function=KeyFunction.ITEM_OUT)
		public void copyUserId_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_USER_ID.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FOBPROF_USER_ID','FOBPROF_USER_NAME','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void copyUserId_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FOBPROF_USER_ID"), toStr("FOBPROF_USER_NAME"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_USER_ID.POST-CHANGE
		    IF NOT SELECT_FOBPROF_1 (:COPY_USER_ID) THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0009', 'FORM','*ERROR* Invalid Copy User ID; Press List of Values for valid IDs.')  
                
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   IF NOT SELECT_FORUSOR_1 (:COPY_USER_ID) THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0010', 'FORM','*ERROR* Organization data does not exist for this Copy User ID.')  
                
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="COPY_USER_ID")
		public void copyUserId_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getCopyUserId().isNull())
		return;
				if ( this.getTask().getServices().selectFobprof1(getFormModel().getKeyBlock().getCopyUserId()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0009"), toStr("FORM"), toStr("*ERROR* Invalid Copy User ID; Press List of Values for valid IDs.")));
					throw new ApplicationException();
				}
				// 
				if ( this.getTask().getServices().selectForusor1(getFormModel().getKeyBlock().getCopyUserId()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0010"), toStr("FORM"), toStr("*ERROR* Organization data does not exist for this Copy User ID.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="INCLUDE_COAS_CODE")
		public void includeCoasCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="INCLUDE_COAS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void includeCoasCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void includeCoasCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="INCLUDE_COAS_CODE", function=KeyFunction.NEXT_ITEM)
		public void includeCoasCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="INCLUDE_COAS_CODE", function=KeyFunction.ITEM_OUT)
		public void includeCoasCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER INCLUDE_COAS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE','FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_KEY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void includeCoasCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasKey(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER INCLUDE_COAS_CODE.POST-CHANGE
		    IF :INCLUDE_COAS_CODE IS NULL THEN
      RETURN ;
   END IF ;
   IF :INCLUDE_COAS_CODE = '%' THEN
      RETURN ;
   END IF ;
--
   IF NOT SELECT_FTVCOAS_1 (:INCLUDE_COAS_CODE)
    THEN
      MESSAGE ( G$_NLS.Get('FOMUSOR-0011', 'FORM','*ERROR* Invalid Excluded Chart of Accounts; Press List of Values for valid COA.')  
                 
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="INCLUDE_COAS_CODE")
		public void includeCoasCode_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getIncludeCoasCode().isNull())
		return;
				if ( getFormModel().getKeyBlock().getIncludeCoasCode().isNull() )
				{
					return ;
				}
				if ( getFormModel().getKeyBlock().getIncludeCoasCode().equals("%") )
				{
					return ;
				}
				// 
				if ( this.getTask().getServices().selectFtvcoas1(getFormModel().getKeyBlock().getIncludeCoasCode()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0011"), toStr("FORM"), toStr("*ERROR* Invalid Excluded Chart of Accounts; Press List of Values for valid COA.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER INCLUDE_ORGN_CODE.POST-CHANGE
		 DECLARE
   PTI_INTO_TEMP        VARCHAR2(2);
   CURSOR PTI_CURSOR IS
      SELECT 'X'
        FROM  FTVORGN
       WHERE FTVORGN_ORGN_CODE = :INCLUDE_ORGN_CODE
         AND FTVORGN_EFF_DATE <= SYSDATE
         AND FTVORGN_NCHG_DATE > SYSDATE
         AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL);

   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         MESSAGE( G$_NLS.Get('FOMUSOR-0012', 'FORM','*ERROR* Invalid Orgn Code; Press List of Values for valid Orgn.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_ORGN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="INCLUDE_ORGN_CODE")
		public void includeOrgnCode_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				int rowCount = 0;
				if(keyBlockElement.getIncludeOrgnCode().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_ORGN_CODE = :INCLUDE_ORGN_CODE AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("INCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getIncludeOrgnCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FOMUSOR-0012"), toStr("FORM"), toStr("*ERROR* Invalid Orgn Code; Press List of Values for valid Orgn.")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER INCLUDE_ORGN_CODE.KEY-LISTVAL
		 g$_list_values_call;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_ORGN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="INCLUDE_ORGN_CODE", function=KeyFunction.LIST_VALUES)
		public void includeOrgnCode_ListValues()
		{
			
				getTask().getGoqrpls().gListValuesCall();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="EXCLUDE_COAS_CODE")
		public void excludeCoasCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="EXCLUDE_COAS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void excludeCoasCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void excludeCoasCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="EXCLUDE_COAS_CODE", function=KeyFunction.NEXT_ITEM)
		public void excludeCoasCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="EXCLUDE_COAS_CODE", function=KeyFunction.ITEM_OUT)
		public void excludeCoasCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER EXCLUDE_COAS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE','FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_KEY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void excludeCoasCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasKey(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER EXCLUDE_COAS_CODE.POST-CHANGE
		    IF :EXCLUDE_COAS_CODE IS NULL THEN
      RETURN ;
   END IF ;
   IF :EXCLUDE_COAS_CODE = '%' THEN
      RETURN ;
   END IF ;
--
   IF NOT SELECT_FTVCOAS_1 (:EXCLUDE_COAS_CODE)
    THEN
      MESSAGE ( G$_NLS.Get('FOMUSOR-0013', 'FORM','*ERROR* Invalid Excluded Chart of Accounts; Press List of Values for valid COA.')  
                 
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="EXCLUDE_COAS_CODE")
		public void excludeCoasCode_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getExcludeCoasCode().isNull())
		return;
				if ( getFormModel().getKeyBlock().getExcludeCoasCode().isNull() )
				{
					return ;
				}
				if ( getFormModel().getKeyBlock().getExcludeCoasCode().equals("%") )
				{
					return ;
				}
				// 
				if ( this.getTask().getServices().selectFtvcoas1(getFormModel().getKeyBlock().getExcludeCoasCode()).not() )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0013"), toStr("FORM"), toStr("*ERROR* Invalid Excluded Chart of Accounts; Press List of Values for valid COA.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER EXCLUDE_ORGN_CODE.POST-CHANGE
		 DECLARE
   PTI_INTO_TEMP        VARCHAR2(2);
   CURSOR PTI_CURSOR IS
      SELECT 'X'
        FROM  FTVORGN
       WHERE FTVORGN_ORGN_CODE = :EXCLUDE_ORGN_CODE
         AND FTVORGN_EFF_DATE <= SYSDATE
         AND FTVORGN_NCHG_DATE > SYSDATE
         AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL);

   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         MESSAGE( G$_NLS.Get('FOMUSOR-0014', 'FORM','*ERROR* Invalid Orgn Code; Press List of Values for valid Orgn.') );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_ORGN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="EXCLUDE_ORGN_CODE")
		public void excludeOrgnCode_PostChange()
		{
			KeyBlock keyBlockElement = (KeyBlock)this.getFormModel().getKeyBlock();
			
				int rowCount = 0;
				if(keyBlockElement.getExcludeOrgnCode().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM FTVORGN " +
	" WHERE FTVORGN_ORGN_CODE = :EXCLUDE_ORGN_CODE AND FTVORGN_EFF_DATE <= SYSDATE AND FTVORGN_NCHG_DATE > SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("EXCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getExcludeOrgnCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FOMUSOR-0014"), toStr("FORM"), toStr("*ERROR* Invalid Orgn Code; Press List of Values for valid Orgn.")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER EXCLUDE_ORGN_CODE.KEY-LISTVAL
		 g$_list_values_call;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_ORGN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="EXCLUDE_ORGN_CODE", function=KeyFunction.LIST_VALUES)
		public void excludeOrgnCode_ListValues()
		{
			
				getTask().getGoqrpls().gListValuesCall();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="USER_ID")
		public void userId_validate()
		{
			

							this.userId_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_USER_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="COPY_USER_ID")
		public void copyUserId_validate()
		{
			

							this.copyUserId_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_COAS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="INCLUDE_COAS_CODE")
		public void includeCoasCode_validate()
		{
			

							this.includeCoasCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INCLUDE_ORGN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="INCLUDE_ORGN_CODE")
		public void includeOrgnCode_validate()
		{
			

							this.includeOrgnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_COAS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="EXCLUDE_COAS_CODE")
		public void excludeCoasCode_validate()
		{
			

							this.excludeCoasCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXCLUDE_ORGN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="EXCLUDE_ORGN_CODE")
		public void excludeOrgnCode_validate()
		{
			

							this.excludeOrgnCode_PostChange();

			}

		
	
	
}

