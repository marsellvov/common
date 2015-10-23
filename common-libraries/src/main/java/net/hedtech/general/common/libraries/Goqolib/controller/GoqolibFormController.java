package net.hedtech.general.common.libraries.Goqolib.controller;
import java.util.EventObject;

import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.CancelEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.model.AfterCommit;
import morphis.foundations.core.appsupportlib.model.BeforeCommit;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractFormController;
import morphis.foundations.core.appsupportlib.runtime.events.OnError;
import morphis.foundations.core.appsupportlib.runtime.events.TaskEnded;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStarted;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStartedPre;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NString;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;


public class GoqolibFormController extends AbstractSupportCodeObject {

	public GoqolibFormController(ISupportCodeContainer container) {
		super(container);
	}
	
	
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GOQOLIB.LOAD_CURRENT_RELEASE
		 BEGIN
  :CURRENT_RELEASE := '8.6.4';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQOLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goqolib_LoadCurrentRelease()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getFormModel().getLibFormHeader().setCurrentRelease(toStr("9.0"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.Goqolib_LoadCurrentRelease is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOQOLIB.WHEN-NEW-RECORD-INSTANCE
		 -- 741-1
G$_SD.p_when_new_rec_inst;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOQOLIB.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Goqolib_recordChange()
		{
			
				//  741-1
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				//  741-1

			this.getContainer().getGoqrpls().getGSd().pWhenNewRecInst();
//
//				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.Goqolib_recordChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		public void recordChange() {
			Goqolib_recordChange();
		}
		/* Original PL/SQL code code for TRIGGER G$_APPL_FORM_CLASS.CHECK_KEYS
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_APPL_FORM_CLASS.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void gApplFormClass_CheckKeys()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gApplFormClass_CheckKeys is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_APPL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 -- 741-1
G$_SD.p_when_new_rec_inst;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_APPL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE")
		public void gApplFormClass_WhenNewRecordInstance()
		{
			
				//  741-1
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				//  741-1
//				getTask().getGoqrpls().getGSd().pWhenNewRecInst();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gApplFormClass_WhenNewRecordInstance is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CALENDAR_BTN_CLASS.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CALENDAR_BTN_CLASS.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-CLICK")
		public void gCalendarBtnClass_WhenMouseClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCalendarBtnClass_WhenMouseClick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CALENDAR_BTN_CLASS.WHEN-BUTTON-PRESSED
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
    MESSAGE(G$_NLS.Get('GOQOLIB-0029','FORM','*ERROR* Date button is outside the current block.'));
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
    MESSAGE(G$_NLS.Get('GOQOLIB-0030','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CALENDAR_BTN_CLASS.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void gCalendarBtnClass_WhenButtonPressed()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					ItemDescriptor itemId= null;
//					NNumber alBut= NNumber.getNull();
//					NString curItem = getTriggerItem();
//					NString currentBlockFld= NString.getNull();
//					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
//					if ( (itemId == null) )
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0029"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
//						throw new ApplicationException();
//					}
//					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
//					// 
//					//  If calculate item is not visible, exit.
//					// 
//					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
//					{
//						return ;
//					}
//					// 
//					//  Check if item is protected or not.  If not, launch the form.
//					// 
//					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
//					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						// 
//						//  Not protected, so call the form.
//						//  
//						goItem(currentBlockFld);
//						getTask().getGoqrpls().gCheckFailure();
//						copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
//						executeAction("G$_REVOKE_ACCESS");
//						getTask().getGoqrpls().gCheckFailure();
//						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
//						// 
//						if ( !getNameIn("GLOBAL.VALUE").isNull() )
//						{
//							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
//							copy("","GLOBAL.VALUE");
//							executeAction("NEXT_ITEM");
//						}
//					}
//					else {
//						message(GNls.Fget(toStr("GOQOLIB-0030"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCalendarBtnClass_WhenButtonPressed is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void gCodeClass_WhenMouseDoubleclick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGSearch().whenMouseClick();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_WhenMouseDoubleclick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void gCodeClass_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('','','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void gCodeClass_GSearchParameters()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_GSearchParameters is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void gCodeClass_GSearchOptions()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				executeAction("LIST_VALUES");
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_GSearchOptions is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gCodeClass_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
//				getTask().getGoqrpls().gCheckFailure();
//				nextItem();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_CODE_CLASS.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_CODE_CLASS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void gCodeClass_itemOut()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGSearch().postTextCode();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gCodeClass_itemOut is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_DATE_CLASS.KEY-NEXT-ITEM
		 BEGIN
  G$_DATE_NEXT_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_DATE_CLASS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gDateClass_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gDateNextItem();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gDateClass_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_DATE_CLASS.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_DATE_WHEN_NEW_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_DATE_CLASS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void gDateClass_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gDateWhenNewItem();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gDateClass_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_DATE_CLASS.POST-TEXT-ITEM
		 BEGIN
  G$_DATE_POST_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_DATE_CLASS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void gDateClass_itemOut()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gDatePostItem();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gDateClass_itemOut is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_DESC_CLASS.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_DESC_CLASS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void gDescClass_itemChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				previousItem();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gDescClass_itemChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.G$_VERIFY_ACCESS
		 DECLARE
--
-- Character string variables.
--
  ERR_MSG                VARCHAR(190);
  HOLD_CMD               VARCHAR2(240);
  FORM_FILE_NAME         VARCHAR2(30);
  FORM_MOD_NAME          VARCHAR2(30);
  OBJECT                 VARCHAR2(30);
  PASSWORD               VARCHAR2(30);
  PASSWORD1              VARCHAR2(30);
  ROLE_NAME              VARCHAR2(30);
  VERSION                VARCHAR2(10);
--
-- Number variables.
--
  ERR_NO                 NUMBER;
  SEED1                  NUMBER := 12345678;
  SEED3                  NUMBER := 87651234;
--
  FORM_ID                FORMMODULE;
--
-- Exceptions.
--
  NO_OBJECT              EXCEPTION;
  NO_INST                EXCEPTION;
  NO_ACCESS              EXCEPTION;
  NO_PASSWORD            EXCEPTION;
  INVALID_VERSION        EXCEPTION;
  INVALID_ACCESS         EXCEPTION;
  NAME_MISMATCH          EXCEPTION;
--
-- Exception pragmas.
--
  PRAGMA EXCEPTION_INIT(NO_OBJECT,-20100);
  PRAGMA EXCEPTION_INIT(NO_INST,-20101);
  PRAGMA EXCEPTION_INIT(NO_ACCESS,-20102);
  PRAGMA EXCEPTION_INIT(NO_PASSWORD,-20103);
  PRAGMA EXCEPTION_INIT(INVALID_VERSION,-20104);
  PRAGMA EXCEPTION_INIT(INVALID_ACCESS,-20105);
  PRAGMA EXCEPTION_INIT(NAME_MISMATCH,-20106);
--
-- Begin main logic.
--
BEGIN
  OBJECT  := NAME_IN('SYSTEM.CURRENT_FORM');
  VERSION := NAME_IN('CURRENT_RELEASE');
--
-- Obtain the internal and file name for form.  Remove extension if present.
--
  FORM_FILE_NAME := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM));
  FORM_MOD_NAME  := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
--
  IF INSTR(FORM_FILE_NAME,'.') > 0 THEN
  	FORM_FILE_NAME := SUBSTR(FORM_FILE_NAME,1,INSTR(FORM_FILE_NAME,'.')-1);
  END IF;
--
-- Obtain encrypted password.
--
  G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
-- If security is turned off, quit.
--
  IF PASSWORD = 'INSECURED' THEN
    GOTO CHK_FORM_CNT;
  END IF;
--
-- Check that file system name matches the internal module name.
--
  IF FORM_FILE_NAME <> FORM_MOD_NAME THEN
  	ERR_MSG :=  G$_NLS.Get('GOQOLIB-0031', 'FORM',
      	'*ERROR* User attempted to run %01% but the internal name (%02%) does not match.',
  	    FORM_FILE_NAME, FORM_MOD_NAME);
--
  	G$_SECURITY.G$_CREATE_LOG_RECORD(USER, OBJECT, ERR_MSG);
    RAISE NAME_MISMATCH;
  END IF;
--
-- Call for second phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED3);
  PASSWORD := PASSWORD1;
--
-- Call for third phase processing.
--
  G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
-- Call for fourth phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED1);
  PASSWORD := '"' || PASSWORD1 || '"';
--
-- Invoke needed role.
--
  HOLD_CMD := ROLE_NAME || ' IDENTIFIED BY ' || PASSWORD; 
  G$_TRACE_PKG.DO_EXEC_SQL('SET ROLE ' || HOLD_CMD);
--
  G$_VPDI.SET_VPDI_ON_ACCESS;
--
-- Clear variables.
--
  HOLD_CMD := '';
  OBJECT := '';
  PASSWORD := '';
  ROLE_NAME := '';
  SEED1 := '';
  SEED3 := '';
--
<<CHK_FORM_CNT>>
--
-- Update form count and listing.
--
  IF NVL(:GLOBAL.SKIP_FORM_CNT,'N') = 'Y' OR
     NVL(:GLOBAL.SKIP_DECR_CNT,'N') = 'Y' OR
     :SYSTEM.TRIGGER_BLOCK IS NOT NULL THEN
    RETURN;
  END IF;
--
--
--  FORM_ID := FIND_FORM(:SYSTEM.CURRENT_FORM);
  :GLOBAL.CURR_NO_FORMS := TO_CHAR(TO_NUMBER(:GLOBAL.CURR_NO_FORMS) + 1);
--  IF :GLOBAL.CURR_OPEN_FORMS IS NULL THEN
--    :GLOBAL.CURR_OPEN_FORMS := :SYSTEM.CURRENT_FORM || '-' || TO_CHAR(FORM_ID.ID);
--  ELSE
--    :GLOBAL.CURR_OPEN_FORMS := :GLOBAL.CURR_OPEN_FORMS || ',' || :SYSTEM.CURRENT_FORM || '-' 
--             || TO_CHAR(FORM_ID.ID);
--  END IF;

--
-- Exception handling.
--
  EXCEPTION
    WHEN NO_OBJECT THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0032','FORM','*ERROR* No parameters were passed.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_INST THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0033','FORM','*ERROR* No records found on GUBIPRF.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_ACCESS THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0034','FORM','*ERROR* User %01% not authorized to access %02%',
                USER,OBJECT),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_PASSWORD THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0035','FORM','*ERROR* No password found on GUBROLE.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN INVALID_VERSION THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0036','FORM','*ERROR* Invalid version of %01%.',
                OBJECT ),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN INVALID_ACCESS THEN
      MESSAGE(G$_NLS.Get('GOQOLIB-0037','FORM','*ERROR* Invalid password tried.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NAME_MISMATCH THEN
      MESSAGE(ERR_MSG,ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN OTHERS THEN
      ERR_MSG := SUBSTR(SQLERRM,1,190);
      MESSAGE('SQLERRM: ' || ERR_MSG);
      RAISE FORM_TRIGGER_FAILURE;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void gFormClass_GVerifyAccess()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					// 
//					//  Character string variables.
//					// 
//					NString errMsg= NString.getNull();
//					NString holdCmd= NString.getNull();
//					NString formFileName= NString.getNull();
//					NString formModName= NString.getNull();
//					NString _object= NString.getNull();
//					NString password= NString.getNull();
//					NString password1= NString.getNull();
//					NString roleName= NString.getNull();
//					NString version= NString.getNull();
//					// 
//					//  Number variables.
//					// 
//					NNumber errNo= NNumber.getNull();
//					NNumber seed1 = toNumber(12345678);
//					NNumber seed3 = toNumber(87651234);
//					// 
//					UnknownTypes.Formmodule formId= null;
//					// 
//					//  Exceptions.
//					// 
//					try
//					{
//						_object = getCurrentTaskName();
//						version = getNameIn("CURRENT_RELEASE");
//						// 
//						//  Obtain the internal and file name for form.  Remove extension if present.
//						// 
//						formFileName = upper(getCurrentTaskName());
//						formModName = upper(getCurrentTaskName());
//						// 
//						if ( inStr(formFileName, toStr(".")).greater(0) )
//						{
//							formFileName = substring(formFileName, toInt(1), inStr(formFileName, toStr(".")).subtract(1));
//						}
//						// 
//						//  Obtain encrypted password.
//						// 
//						GSecurity.gVerifyPassword1Prd(_object, version, password, roleName);
//						// 
//						//  If security is turned off, quit.
//						// 
//						if ( password.equals("INSECURED") )
//						{
//							 goto CHK_FORM_CNT;
//						}
//						// 
//						//  Check that file system name matches the internal module name.
//						// 
//						if ( formFileName.notEquals(formModName) )
//						{
//							errMsg = GNls.Fget(toStr("GOQOLIB-0031"), toStr("FORM"), toStr("*ERROR* User attempted to run %01% but the internal name (%02%) does not match."), formFileName, formModName);
//							// 
//							GSecurity.gCreateLogRecord(getUser(), _object, errMsg);
//							throw new NameMismatch();
//						}
//						// 
//						//  Call for second phase processing.
//						// 
//						password1 = GSecurity.gDecryptFnc(password, seed3);
//						password = password1;
//						// 
//						//  Call for third phase processing.
//						// 
//						GSecurity.gVerifyPassword1Prd(_object, version, password, roleName);
//						// 
//						//  Call for fourth phase processing.
//						// 
//						password1 = GSecurity.gDecryptFnc(password, seed1);
//						password = toStr("\"").append(password1).append("\"");
//						// 
//						//  Invoke needed role.
//						// 
//						holdCmd = roleName.append(" IDENTIFIED BY ").append(password);
//						getTask().getGoqrpls().getGTracePkg().doExecSql(toStr("SET ROLE ").append(holdCmd));
//						// 
//						getTask().getGoqrpls().getGVpdi().setVpdiOnAccess();
//						// 
//						//  Clear variables.
//						// 
//						holdCmd = toStr("");
//						_object = toStr("");
//						password = toStr("");
//						roleName = toStr("");
//						seed1 = toNumber("");
//						seed3 = toNumber("");
//						 CHK_FORM_CNT:;
//						// 
//						//  Update form count and listing.
//						// 
//						if ( isNull(getGlobal("SKIP_FORM_CNT"), "N").equals("Y") || isNull(getGlobal("SKIP_DECR_CNT"), "N").equals("Y") || (getTriggerBlock()) != null )
//						{
//							return ;
//						}
//						// 
//						// 
//						//   FORM_ID := FIND_FORM(:SYSTEM.CURRENT_FORM);
//						setGlobal("CURR_NO_FORMS", toChar(toNumber(getGlobal("CURR_NO_FORMS")).add(1)));
//					}
//					catch(NoObject e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0032"), toStr("FORM"), toStr("*ERROR* No parameters were passed.")), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(NoInst e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0033"), toStr("FORM"), toStr("*ERROR* No records found on GUBIPRF.")), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(NoAccess e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0034"), toStr("FORM"), toStr("*ERROR* User %01% not authorized to access %02%"), getUser(), _object), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(NoPassword e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0035"), toStr("FORM"), toStr("*ERROR* No password found on GUBROLE.")), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(InvalidVersion e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0036"), toStr("FORM"), toStr("*ERROR* Invalid version of %01%."), _object), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(InvalidAccess e)
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0037"), toStr("FORM"), toStr("*ERROR* Invalid password tried.")), SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(NameMismatch e)
//					{
//						message(errMsg, SupportClasses.Constants.ACKNOWLEDGE);
//						throw new ApplicationException();
//					}
//					catch(Exception  e)
//					{
//						errMsg = substring(errorMessage(), toInt(1), toInt(190));
//						message(toStr("SQLERRM: ").append(errMsg));
//						throw new ApplicationException();
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_GVerifyAccess is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.G$_REVOKE_ACCESS
		 DECLARE
  CURR_FORMS VARCHAR2(2000);
  THIS_FORM  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  TEMP_NO    NUMBER(4);
  START_POS  NUMBER(4);
  STRING_LEN NUMBER(4);
  FORM_ID    FORMMODULE;
--
BEGIN
  G$_VPDI.REVOKE_ACCESS;
--
-- Check security status and turn off role if security
-- is on.
--
  IF G$_SECURITY.G$_CHECK_SECURITY_FNC THEN
    G$_TRACE_PKG.DO_EXEC_SQL('SET ROLE NONE');
  END IF;
--
  IF NAME_IN('GLOBAL.SKIP_FORM_CNT') = 'Y' OR
     NAME_IN('GLOBAL.SKIP_DECR_CNT') = 'Y' OR
     NAME_IN('SYSTEM.CURRENT_FORM') = 'GUAMENU' OR
     NAME_IN('SYSTEM.CURRENT_FORM') = 'GUAGMNU' OR
     :SYSTEM.TRIGGER_BLOCK IS NOT NULL THEN
    COPY('N','GLOBAL.SKIP_DECR_CNT');
    RETURN;
  END IF;
--
--
--  FORM_ID := FIND_FORM(THIS_FORM);
--  CURR_FORMS := NAME_IN('GLOBAL.CURR_OPEN_FORMS');
--  CURR_FORMS := REPLACE(CURR_FORMS,THIS_FORM || '-' || TO_CHAR(FORM_ID.ID));
--  CURR_FORMS := RTRIM(LTRIM(REPLACE(CURR_FORMS, ',,', ','), ','), ',');  
--  COPY(CURR_FORMS,'GLOBAL.CURR_OPEN_FORMS');
--  
  TEMP_NO := TO_NUMBER(NAME_IN('GLOBAL.CURR_NO_FORMS')) - 1;
  COPY(TO_CHAR(TEMP_NO),'GLOBAL.CURR_NO_FORMS');
--  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void gFormClass_GRevokeAccess()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString currForms= NString.getNull();
//					NString thisForm = getCurrentTaskName();
//					NNumber tempNo= NNumber.getNull();
//					NNumber startPos= NNumber.getNull();
//					NNumber stringLen= NNumber.getNull();
//					UnknownTypes.Formmodule formId= null;
//					getTask().getGoqrpls().getGVpdi().revokeAccess();
//					// 
//					//  Check security status and turn off role if security
//					//  is on.
//					// 
//					if ( GSecurity.gCheckSecurityFnc() )
//					{
//						getTask().getGoqrpls().getGTracePkg().doExecSql(toStr("SET ROLE NONE"));
//					}
//					// 
//					if ( getNameIn("GLOBAL.SKIP_FORM_CNT").equals("Y") || getNameIn("GLOBAL.SKIP_DECR_CNT").equals("Y") || getCurrentTaskName().equals("GUAMENU") || getCurrentTaskName().equals("GUAGMNU") || (getTriggerBlock()) != null )
//					{
//						copy("N","GLOBAL.SKIP_DECR_CNT");
//						return ;
//					}
//					// 
//					// 
//					//   FORM_ID := FIND_FORM(THIS_FORM);
//					//   CURR_FORMS := NAME_IN('GLOBAL.CURR_OPEN_FORMS');
//					//   CURR_FORMS := REPLACE(CURR_FORMS,THIS_FORM || '-' || TO_CHAR(FORM_ID.ID));
//					//   CURR_FORMS := RTRIM(LTRIM(REPLACE(CURR_FORMS, ',,', ','), ','), ',');  
//					//   COPY(CURR_FORMS,'GLOBAL.CURR_OPEN_FORMS');
//					//   
//					tempNo = toNumber(toNumber(getNameIn("GLOBAL.CURR_NO_FORMS")).subtract(1));
//					copy(toChar(tempNo),"GLOBAL.CURR_NO_FORMS");
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_GRevokeAccess is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.BANNER_XE_SEND_CONTEXT
		  G$_XE.JSON_OUT(name_in('GLOBAL.'||name_in('SYSTEM.CURRENT_FORM')||'_XE_CONTEXT'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void gFormClass_BannerXeSendContext()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGXe().jsonOut(getNameIn(toStr("GLOBAL.").append(getCurrentTaskName()).append("_XE_CONTEXT")));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_BannerXeSendContext is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 G$_XE.XE_CONTROLLER;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void gFormClass_WhenCustomJavascriptEvent()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGXe().xeController();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenCustomJavascriptEvent is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-FORM
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.PRE_FORM;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to prevent navigation outside of the current
--         form if that form has been invoked as a Workflow activity.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has not been
--         invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_EXT_NAVIGATION');
  END IF; 
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to create a timer that will poll for valid
--         tasks and activities sent from Workflow.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has already
--         been invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_MAKE_TIMER');
  END IF; 
--  
-- 6100-01 Add the call to E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER.
--         
  E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER;
--
-- Set the user's preferences for the various newly added NVAs.
--
  G$_SET_USER_PREFERENCES;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void gFormClass_TaskStartedPre(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().preForm();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to prevent navigation outside of the current
//				//          form if that form has been invoked as a Workflow activity.
//				// 
//				//          If Workflow is not installed or is not enabled at
//				//          a client site, or if the current form has not been
//				//          invoked as part of a Workflow activity, the
//				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
//				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
//				{
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_EXT_NAVIGATION"));
//				}
//				// 
//				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to create a timer that will poll for valid
//				//          tasks and activities sent from Workflow.
//				// 
//				//          If Workflow is not installed or is not enabled at
//				//          a client site, or if the current form has already
//				//          been invoked as part of a Workflow activity, the
//				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
//				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
//				{
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_MAKE_TIMER"));
//				}
//				//   
//				//  6100-01 Add the call to E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER.
//				//          
//				getTask().getEoqrpls().getEImgUtil().pPreFormTriggerDriver();
//				// 
//				//  Set the user's preferences for the various newly added NVAs.
//				// 
//				getTask().getGoqrpls().gSetUserPreferences();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_TaskStartedPre is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_FORM_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void gFormClass_PreFormTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreFormTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-FORM
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.POST_FORM;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to control the behavior of the current form
--         when it has been invoked as part of a Workflow activity
--         and a user attempts to exit the form.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has not
--         been invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_EXIT');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void gFormClass_TaskEnded(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().postForm();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to control the behavior of the current form
//				//          when it has been invoked as part of a Workflow activity
//				//          and a user attempts to exit the form.
//				// 
//				//          If Workflow is not installed or is not enabled at
//				//          a client site, or if the current form has not
//				//          been invoked as part of a Workflow activity, the
//				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
//				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
//				{
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_EXIT"));
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_TaskEnded is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_FORM_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void gFormClass_PostFormTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PostFormTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-BLOCK
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.PRE_BLOCK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK")
		public void gFormClass_PreBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().preBlock();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_BLOCK_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void gFormClass_PreBlockTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreBlockTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-BLOCK
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.POST_BLOCK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK")
		public void gFormClass_PostBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().postBlock();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PostBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_BLOCK_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void gFormClass_PostBlockTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PostBlockTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-COMMIT
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.PRE_COMMIT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void gFormClass_BeforeCommit(CancelEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().preCommit();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_BeforeCommit is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE_COMMIT_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void gFormClass_PreCommitTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreCommitTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-INSERT
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.PRE_INSERT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void gFormClass_BeforeRowInsert(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().preInsert();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_BeforeRowInsert is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.PRE-UPDATE
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.PRE_UPDATE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void gFormClass_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().preUpdate();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_BeforeRowUpdate is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-ERROR
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.ON_ERROR;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void gFormClass_OnError(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().onError();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnError is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-ROLLBACK
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.ON_ROLLBACK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void gFormClass_OnRollback()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().onRollback();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnRollback is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON_ROLLBACK_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void gFormClass_OnRollbackTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnRollbackTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ON-SELECT
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.ON_SELECT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void gFormClass_OnSelect()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().onSelect();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_OnSelect is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST-FORMS-COMMIT
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.POST_FORMS_COMMIT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void gFormClass_AfterCommit(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().postFormsCommit();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_AfterCommit is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.POST_FORMS_COMMIT_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void gFormClass_PostFormsCommitTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PostFormsCommitTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_BTN_PRESSED;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void gFormClass_WhenButtonPressed()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gBtnPressed();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenButtonPressed is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  G$_SET_INST_PROPERTY;
  G$_CHECK_FAILURE;
--
  G$_STARTUP;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void gFormClass_TaskStarted(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gSetInstProperty();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				getTask().getGoqrpls().gStartup();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_TaskStarted is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-NEW-BLOCK-INSTANCE
		 DECLARE
	lv_item ITEM;
BEGIN
  G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
  G$_CHECK_FAILURE;
--
  IF G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED = 'N' THEN
    G$_DO_NEW_MESSAGES_EXIST;
    G$_NAVIGATION_FRAME.MESSAGE_WAS_DISPLAYED := 'Y';
  END IF;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to control the 
--         behavior of the Key Block when the current form has been invoked as part of
--         a Workflow activity.
--
--         If Workflow is not installed or is not enabled at a client site, or if the current 
--         form has not been invoked as part of a Workflow activity, the G$_WF_DRIVER.WF_EXECUTE
--         procedure will not perform any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_KEY_BLOCK');
  END IF;
--
  lv_item := FIND_ITEM('G$_NAV_BLOCK.LEAVING_BLK_IND');
  IF NOT ID_NULL(lv_item) THEN
	  IF NAME_IN('G$_NAV_BLOCK.LEAVING_BLK_IND') IS NOT NULL THEN
      COPY('','G$_NAV_BLOCK.LEAVING_BLK_IND');
    ELSE
      SET_VIEW_PROPERTY('G$_NAV_CANVAS',VISIBLE,PROPERTY_FALSE);
      EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG');
      G$_CHECK_FAILURE;
    END IF;
  ELSE
    EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE")
		public void gFormClass_WhenNewBlockInstance()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					ItemDescriptor lvItem= null;
//					getTask().getGoqrpls().getGNavigationFrame().populateGuroptm();
//					getTask().getGoqrpls().gCheckFailure();
//					// 
//					if ( getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed.equals("N") )
//					{
//						getTask().getGoqrpls().gDoNewMessagesExist();
//						getTask().getGoqrpls().getGNavigationFrame().messageWasDisplayed = toStr("Y");
//					}
//					// 
//					//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to control the 
//					//          behavior of the Key Block when the current form has been invoked as part of
//					//          a Workflow activity.
//					// 
//					//          If Workflow is not installed or is not enabled at a client site, or if the current 
//					//          form has not been invoked as part of a Workflow activity, the G$_WF_DRIVER.WF_EXECUTE
//					//          procedure will not perform any Workflow function.
//					// 
//					if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
//					{
//						getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_KEY_BLOCK"));
//					}
//					// 
//					lvItem = findItem(toStr("G$_NAV_BLOCK.LEAVING_BLK_IND"));
//					if ( !(lvItem == null) )
//					{
//						if ( !getNameIn("G$_NAV_BLOCK.LEAVING_BLK_IND").isNull() )
//						{
//							copy("","G$_NAV_BLOCK.LEAVING_BLK_IND");
//						}
//						else {
//							setViewVisible("G$_NAV_CANVAS", false);
//							executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
//							getTask().getGoqrpls().gCheckFailure();
//						}
//					}
//					else {
//						executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
//						getTask().getGoqrpls().gCheckFailure();
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenNewBlockInstance is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void gFormClass_WhenNewBlockInstanceTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenNewBlockInstanceTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_MOUSE_DOUBLECLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void gFormClass_WhenMouseDoubleclick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gMouseDoubleclick();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenMouseDoubleclick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-TIMER-EXPIRED
		 BEGIN
  G$_TIMER_EXP;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to check for a valid task or activity sent via Workflow
--         and, if found, launch the Banner2000 object associated with that task
--         or activity.
--
--         If Workflow is not installed or enabled at a client site,
--         the G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF GET_APPLICATION_PROPERTY(TIMER_NAME) = G$_WF_DRIVER.WF_TIMER_NAME THEN
     G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void gFormClass_WhenTimerExpired(NString timerName)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gTimerExp();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				//  4000-32 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to check for a valid task or activity sent via Workflow
//				//          and, if found, launch the Banner2000 object associated with that task
//				//          or activity.
//				// 
//				//          If Workflow is not installed or enabled at a client site,
//				//          the G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
//				if ( SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.TIMER_NAME).equals(GWfDriver.wfTimerName) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CHECK_MSG"));
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenTimerExpired is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-WINDOW-ACTIVATED
		 BEGIN
  G$_WIN_ACTIVATED;
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('WHEN_WINDOW_ACTIVATED_TRG');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void gFormClass_WhenWindowActivated()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gWinActivated();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				executeAction("WHEN_WINDOW_ACTIVATED_TRG");
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenWindowActivated is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void gFormClass_WhenWindowActivatedTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenWindowActivatedTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.WHEN-WINDOW-CLOSED
		 BEGIN
  G$_WIN_CLOSED;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void gFormClass_WhenWindowClosed()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gWinClosed();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_WhenWindowClosed is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-CLRFRM
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_CLRFRM;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to control the behavior of the current form
--         when it has been invoked as part of a Workflow activity
--         and a user attempts to rollback the form.
--
--         If Workflow is not installed or is not enabled at
--         a client site, or if the current form has not
--         been invoked as part of a Workflow activity, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform
--         any Workflow function.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CONTROL_ROLLBACK');
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gFormClass_ClearTask()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyClrfrm();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				//  4000-32 Add the following call to the G$_WF_DRIVER.WF_EXECUTE
//				//          procedure to control the behavior of the current form
//				//          when it has been invoked as part of a Workflow activity
//				//          and a user attempts to rollback the form.
//				// 
//				//          If Workflow is not installed or is not enabled at
//				//          a client site, or if the current form has not
//				//          been invoked as part of a Workflow activity, the
//				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform
//				//          any Workflow function.
//				// 
//				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
//				{
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CONTROL_ROLLBACK"));
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_ClearTask is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-HELP
		 HELP;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void gFormClass_Help()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				// F2J_NOT_SUPPORTED : Call to built-in "HELP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.SQLFORMS.Help();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'HELP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_Help is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F0
		 G$_VPDI.CALL_VPDI_COMPONENT;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void gFormClass_F0()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGVpdi().callVpdiComponent();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F0 is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F2
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_F2;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void gFormClass_F2()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyF2();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F2 is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-F6
		 G$_XE.GOTO_XE_MENU;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void gFormClass_F6()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGXe().gotoXeMenu();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_F6 is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-DOWN
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_DOWN;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gFormClass_MoveDown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyDown();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_MoveDown is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-UP
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_UP;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gFormClass_MoveUp()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyUp();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_MoveUp is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-LISTVAL
		 BEGIN
  G$_DISPLAY_LOV('','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void gFormClass_ListValues()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gDisplayLov(toStr(""), toStr(""));
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_ListValues is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-MENU
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_MENU;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void gFormClass_KeyMenu()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyMenu();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyMenu is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTBLK
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gFormClass_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyNxtblk();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRVBLK
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_PRVBLK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gFormClass_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyPrvblk();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTREC
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTREC;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gFormClass_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyNxtrec();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRVREC
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_PRVREC;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gFormClass_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyPrvrec();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTSET
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTSET;
  G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void gFormClass_KeyNxtset()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyNxtset();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyNxtset is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-SCRUP
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_SCRUP;
  G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void gFormClass_KeyScrup()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyScrup();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyScrup is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-SCRDOWN
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_SCRDOWN;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void gFormClass_KeyScrdown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyScrdown();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyScrdown is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-PRINT
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void gFormClass_KeyPrint()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyPrint();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyPrint is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-ENTQRY
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gFormClass_Search()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyEntqry();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_Search is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-EXEQRY
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_EXEQRY;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gFormClass_ExecuteQuery()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyExeqry();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-EXIT
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_EXIT;
  G$_CHECK_FAILURE;
--
  IF NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NOT NULL THEN
    COPY( NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'),'GLOBAL.INSTITUTION_CODE');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gFormClass_Exit()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyExit();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				if ( !getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull() )
//				{
//					copy(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"),"GLOBAL.INSTITUTION_CODE");
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_Exit is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY_EXIT_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void gFormClass_KeyExitTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyExitTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY-NXTKEY
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTKEY;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void gFormClass_KeyNxtkey()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyNxtkey();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyNxtkey is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.KEY_NXTKEY_TRG
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void gFormClass_KeyNxtkeyTrg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_KeyNxtkeyTrg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.GLOBAL_COPY
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void gFormClass_GlobalCopy()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_GlobalCopy is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LIST_VALUES_COPY
		 BEGIN
  G$_LIST_VALUES_COPY;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void gFormClass_ListValuesCopy()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gListValuesCopy();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_ListValuesCopy is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LOAD_FORM_HEADER
		 BEGIN
  G$_LOAD_FORM_HEADER;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void gFormClass_LoadFormHeader()
		{
			
				getContainer().getGoqrpls().gLoadFormHeader();
				getContainer().getGoqrpls().gCheckFailure();
			
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.LOAD_CURRENT_RELEASE
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void gFormClass_LoadCurrentRelease()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_LoadCurrentRelease is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.SAVE_KEYS
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void gFormClass_SaveKeys()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_SaveKeys is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.ENABLE_KEYS
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void gFormClass_EnableKeys()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_EnableKeys is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.DISABLE_KEYS
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void gFormClass_DisableKeys()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_DisableKeys is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.INVALID_OPTION_MSG
		 BEGIN
  MESSAGE( G$_NLS.Get('GOQOLIB-0038', 'FORM','*ERROR* Selected Option not available from this block.') );
  RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void gFormClass_InvalidOptionMsg()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				message(GNls.Fget(toStr("GOQOLIB-0038"), toStr("FORM"), toStr("*ERROR* Selected Option not available from this block.")));
//				throw new ApplicationException();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_InvalidOptionMsg is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FORM_CLASS.UPDATE_ACTIVITY
		 BEGIN
  G$_UPDATE_ACTIVITY_DATE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FORM_CLASS.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void gFormClass_UpdateActivity()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gUpdateActivityDate();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gFormClass_UpdateActivity is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-CLICK")
		public void gIconBtnClass_WhenMouseClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIconBtnClass_WhenMouseClick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.PRE-TEXT-ITEM
		 BEGIN
  G$_IDNAME_SEARCH.DISABLE_NAME_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-TEXT-ITEM", function=KeyFunction.ITEM_IN)
		public void gIdClass_itemIn()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGIdnameSearch().disableNameItem();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_itemIn is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-NEXT-ITEM
		 BEGIN
  G$_IDNAME_SEARCH.ID_SEARCH('ID','','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gIdClass_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGIdnameSearch().idSearch(toStr("ID"), toStr(""), toStr(""));
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-LISTVAL
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void gIdClass_ListValues()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_ListValues is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.KEY-CQUERY
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.KEY-CQUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void gIdClass_TotalResults()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_TotalResults is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.WHEN-VALIDATE-ITEM
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/
		@ValidationTrigger(item="G$_ID_CLASS")
		public void gIdClass_validate()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_validate is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_ID_CLASS.POST-CHANGE
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_ID_CLASS.POST-CHANGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-CHANGE")
		public void gIdClass_PostChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gIdClass_PostChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.CHECK_KEYS
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void gInqFormClass_CheckKeys()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_CheckKeys is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-CLRREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gInqFormClass_ClearRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_ClearRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gInqFormClass_Save()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_Save is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-CREREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gInqFormClass_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DELREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gInqFormClass_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DUP-ITEM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void gInqFormClass_KeyDupItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_KeyDupItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.KEY-DUPREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gInqFormClass_CopyRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_CopyRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_INQ_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 -- 741-1
G$_SD.p_when_new_rec_inst;
-- 80-19
G$_GOQOLIB_USER_TRIGGER.WHEN_NEW_REC_INST;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_INQ_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE")
		public void gInqFormClass_WhenNewRecordInstance()
		{
			
				//  741-1
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				//  741-1
//				getTask().getGoqrpls().getGSd().pWhenNewRecInst();
//				//  80-19
//				getTask().getGoqrpls().getGGoqolibUserTrigger().whenNewRecInst();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gInqFormClass_WhenNewRecordInstance is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.POST-BLOCK
		 BEGIN
  G$_GOQOLIB_PP_TRIGGER.POST_BLOCK;
  G$_CHECK_FAILURE;
  G$_GOQOLIB_USER_TRIGGER.CHECK_KEYS;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK")
		public void gKeyBlockClass_PostBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGGoqolibPpTrigger().postBlock();
//				getTask().getGoqrpls().gCheckFailure();
//				getTask().getGoqrpls().getGGoqolibUserTrigger().checkKeys();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_PostBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gKeyBlockClass_Save()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_Save is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-UP
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gKeyBlockClass_MoveUp()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_MoveUp is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-DOWN
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gKeyBlockClass_MoveDown()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_MoveDown is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-CREREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gKeyBlockClass_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-DELREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gKeyBlockClass_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-ENTQRY
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gKeyBlockClass_Search()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_Search is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-EXEQRY
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gKeyBlockClass_ExecuteQuery()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gKeyBlockClass_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTSET
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void gKeyBlockClass_KeyNxtset()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_KeyNxtset is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-NXTBLK
		 BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gKeyBlockClass_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				executeAction("CHECK_KEYS");
//				getTask().getGoqrpls().gCheckFailure();
//				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyNxtblk();
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-PRVBLK
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
		 * G$_KEY_BLOCK_CLASS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gKeyBlockClass_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_KEY_BLOCK_CLASS.KEY-PRVREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_KEY_BLOCK_CLASS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gKeyBlockClass_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gKeyBlockClass_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_NAME_CLASS.KEY-NEXT-ITEM
		 BEGIN
  G$_IDNAME_SEARCH.ID_SEARCH('NAME','','');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAME_CLASS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gNameClass_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGIdnameSearch().idSearch(toStr("NAME"), toStr(""), toStr(""));
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gNameClass_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_NON_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NON_ICON_BTN_CLASS.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-CLICK")
		public void gNonIconBtnClass_WhenMouseClick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gNonIconBtnClass_WhenMouseClick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_VAL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 -- 741-1
G$_SD.p_when_new_rec_inst;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VAL_FORM_CLASS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE")
		public void gValFormClass_WhenNewRecordInstance()
		{
			
				//  741-1
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				//  741-1
//				getTask().getGoqrpls().getGSd().pWhenNewRecInst();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gValFormClass_WhenNewRecordInstance is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.PRE-BLOCK
		 SET_BLOCK_PROPERTY('GUBOBJS',OPTIMIZER_HINT,'RULE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK")
		public void gubobjsType_PreBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				// F2J_NOT_SUPPORTED : The property "BLOCK's OPTIMIZER_HINT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//				//				SupportClasses.FORMS40.SetBlockProperty("GUBOBJS", SupportClasses.Property.OPTIMIZER_HINT, "RULE");
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's OPTIMIZER_HINT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//				
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_PreBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.POST-QUERY
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterQuery
		public void gubobjsType_AfterQuery(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_AfterQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-LISTVAL
		 DECLARE
  qk_height number(2);
  row_count number(5);
  cur_pos   number(5);
  row_pos   number(5);
  top_rec   number(5):= GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD);
  cur_rec   number(5):= :SYSTEM.TRIGGER_RECORD;
BEGIN
  IF :FORM_HEADER.OBJECT_TYPE = 'MENU' THEN
    SET_ITEM_PROPERTY('QK_FLOW.GURCALL_CALL_CODE',DISPLAYED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('QK_FLOW.GURCALL_FORM'     ,DISPLAYED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('QK_FLOW.QK_DESC'          ,DISPLAYED,PROPERTY_FALSE);
--
    SET_ITEM_PROPERTY('QK_MENU.GURMENU_OBJ_NAME' ,DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_MENU.GURMENU_NAME'     ,DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_MENU.QK_DESC'          ,DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_MENU.QK_DESC'          ,ENABLED  ,PROPERTY_TRUE);
--    
    qk_height := GET_ITEM_PROPERTY('QK_MENU.QK_DESC',HEIGHT); 
    cur_pos := (cur_rec - top_rec)*qk_height +39 -15;
    GO_ITEM('QK_MENU.QK_DESC');
    EXECUTE_QUERY;
    row_count  := GET_BLOCK_PROPERTY('QK_MENU',QUERY_HITS);
    IF row_count = 0 THEN
      GO_BLOCK('GUBOBJS');
	    RETURN;
    END IF;
--    
    IF cur_rec - top_rec + row_count > 20 THEN
      GO_BLOCK('GUBOBJS');
      FOR c1_rec IN 1..row_count + 2 LOOP
        DOWN;
      END LOOP;
      top_rec := GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD);
      cur_pos := (cur_rec - top_rec)*qk_height +38 ;
      GO_ITEM('QK_MENU.QK_DESC');
    END IF;
    SET_VIEW_PROPERTY('MENU_ENTIRE',HEIGHT,row_count*qk_height +15);
    SET_VIEW_PROPERTY('MENU_ENTIRE',DISPLAY_Y_POS,cur_pos);
--
  ELSIF :FORM_HEADER.OBJECT_TYPE = 'QUICKFLOW' THEN
    SET_ITEM_PROPERTY('QK_FLOW.GURCALL_CALL_CODE',DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_FLOW.GURCALL_FORM'     ,DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_FLOW.QK_DESC'          ,DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('QK_FLOW.QK_DESC'          ,ENABLED  ,PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('QK_MENU.GURMENU_OBJ_NAME' ,DISPLAYED,PROPERTY_FALSE); 
    SET_ITEM_PROPERTY('QK_MENU.GURMENU_NAME'     ,DISPLAYED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('QK_MENU.QK_DESC'          ,DISPLAYED,PROPERTY_FALSE);
--       
    qk_height := GET_ITEM_PROPERTY('QK_FLOW.QK_DESC',HEIGHT);
    cur_pos := (cur_rec - top_rec)*qk_height +39 -15;
    GO_ITEM('QK_FLOW.QK_DESC');
    EXECUTE_QUERY;
    row_count  := GET_BLOCK_PROPERTY('QK_FLOW',QUERY_HITS);
    IF row_count = 0 THEN
      GO_BLOCK('GUBOBJS');
	    RETURN;
    END IF;
--
    IF cur_rec - top_rec + row_count > 20 THEN
      GO_BLOCK('GUBOBJS');
      FOR c1_rec IN 1..row_count + 2 LOOP
        DOWN;
      END LOOP;
      top_rec := GET_BLOCK_PROPERTY('GUBOBJS',TOP_RECORD);
      cur_pos := (cur_rec - top_rec)*qk_height +38 ;
    GO_ITEM('QK_FLOW.QK_DESC');
    END IF;
    SET_VIEW_PROPERTY('MENU_ENTIRE',HEIGHT,row_count*qk_height +15);
    SET_VIEW_PROPERTY('MENU_ENTIRE',DISPLAY_Y_POS,cur_pos);
  ELSE
    RETURN;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void gubobjsType_ListValues()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NNumber qkHeight= NNumber.getNull();
//					NNumber rowCount= NNumber.getNull();
//					NNumber curPos= NNumber.getNull();
//					NNumber rowPos= NNumber.getNull();
//					NNumber topRec = SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD);
//					NNumber curRec = getTriggerRecord();
//					if ( getFormModel().getFormHeader().getObjectType().equals("MENU") )
//					{
//						setItemVisible("QK_FLOW.GURCALL_CALL_CODE", false);
//						setItemVisible("QK_FLOW.GURCALL_FORM", false);
//						setItemVisible("QK_FLOW.QK_DESC", false);
//						// 
//						setItemVisible("QK_MENU.GURMENU_OBJ_NAME", true);
//						setItemVisible("QK_MENU.GURMENU_NAME", true);
//						setItemVisible("QK_MENU.QK_DESC", true);
//						setItemEnabled("QK_MENU.QK_DESC", true);
//						//     
//						qkHeight = toNumber(getItemHeight("QK_MENU.QK_DESC"));
//						curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(39).subtract(15);
//						goItem(toStr("QK_MENU.QK_DESC"));
//						executeQuery();
//						rowCount = toNumber(getBlockQueryHits("QK_MENU"));
//						if ( rowCount.equals(0) )
//						{
//							goBlock(toStr("GUBOBJS"));
//							return ;
//						}
//						//     
//						if ( curRec.subtract(topRec).add(rowCount).greater(20) )
//						{
//							goBlock(toStr("GUBOBJS"));
//							for ( int c1Rec = 1; c1Rec <= rowCount.add(2); c1Rec++ )
//							{
//								down();
//							}
//							// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//							//							topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD));
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//							
//							curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(38);
//							goItem(toStr("QK_MENU.QK_DESC"));
//						}
//						// F2J_NOT_SUPPORTED : The property "VIEW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//						//						SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Property.HEIGHT, rowCount.multiply(qkHeight).add(15));
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//						
//						// F2J_NOT_SUPPORTED : The property "VIEW's DISPLAY_Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//						//						SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Constants.DISPLAY_Y_POS, curPos);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's DISPLAY_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//						
//					}
//					else if ( getFormModel().getFormHeader().getObjectType().equals("QUICKFLOW") ) {
//						setItemVisible("QK_FLOW.GURCALL_CALL_CODE", true);
//						setItemVisible("QK_FLOW.GURCALL_FORM", true);
//						setItemVisible("QK_FLOW.QK_DESC", true);
//						setItemEnabled("QK_FLOW.QK_DESC", true);
//						// 
//						setItemVisible("QK_MENU.GURMENU_OBJ_NAME", false);
//						setItemVisible("QK_MENU.GURMENU_NAME", false);
//						setItemVisible("QK_MENU.QK_DESC", false);
//						//        
//						qkHeight = toNumber(getItemHeight("QK_FLOW.QK_DESC"));
//						curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(39).subtract(15);
//						goItem(toStr("QK_FLOW.QK_DESC"));
//						executeQuery();
//						rowCount = toNumber(getBlockQueryHits("QK_FLOW"));
//						if ( rowCount.equals(0) )
//						{
//							goBlock(toStr("GUBOBJS"));
//							return ;
//						}
//						// 
//						if ( curRec.subtract(topRec).add(rowCount).greater(20) )
//						{
//							goBlock(toStr("GUBOBJS"));
//							for ( int c1Rec = 1; c1Rec <= rowCount.add(2); c1Rec++ )
//							{
//								down();
//							}
//							// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//							//							topRec = toNumber(SupportClasses.FORMS40.GetBlockProperty("GUBOBJS", SupportClasses.Property.TOP_RECORD));
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//							
//							curPos = (curRec.subtract(topRec)).multiply(qkHeight).add(38);
//							goItem(toStr("QK_FLOW.QK_DESC"));
//						}
//						// F2J_NOT_SUPPORTED : The property "VIEW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//						//						SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Property.HEIGHT, rowCount.multiply(qkHeight).add(15));
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//						
//						// F2J_NOT_SUPPORTED : The property "VIEW's DISPLAY_Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//						//						SupportClasses.FORMS4W.SetViewProperty("MENU_ENTIRE", SupportClasses.Constants.DISPLAY_Y_POS, curPos);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's DISPLAY_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//						
//					}
//					else {
//						return ;
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_ListValues is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-NXTBLK
		 PREVIOUS_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gubobjsType_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				previousBlock();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-PRVBLK
		 GO_ITEM('FORM_HEADER.OBJECT_TYPE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gubobjsType_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				goItem(toStr("FORM_HEADER.OBJECT_TYPE"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-ENTQRY
		 BEGIN
  ENTER_QUERY;
-- 1-HBN4V
  :FORM_HEADER.INITIAL_QUERY := 'N';
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gubobjsType_Search()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				enterQuery();
//				//  1-HBN4V
//				getFormModel().getFormHeader().setInitialQuery(toStr("N"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_Search is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_TYPE.KEY-EXEQRY
		 BEGIN
  EXECUTE_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_TYPE.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gubobjsType_ExecuteQuery()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				executeQuery();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gubobjsType_ExecuteQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.WHEN-MOUSE-DOUBLECLICK
		 DECLARE
  lv_block_name VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK;
BEGIN
  IF NAME_IN(lv_block_name||'.DISPLAY_DESC') IS NOT NULL AND 
     NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME')IS NOT NULL THEN
    IF :SYSTEM.MOUSE_BUTTON_SHIFT_STATE = 'Ctrl+' THEN
      NULL;
    ELSE
      G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE('DELETE',
                               lv_block_name||'.GURMENU_OBJ_NAME',
                               lv_block_name||'.GURMENU_COUNT');
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void gurmenuType_WhenMouseDoubleclick()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCursorBlock();
//					if ( !getNameIn(lvBlockName.append(".DISPLAY_DESC")).isNull() && !getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
//					{
//						if ( SupportClasses.AppContext.MouseButtonShiftState.equals("Ctrl+") )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						}
//						else {
//							getTask().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(toStr("DELETE"), lvBlockName.append(".GURMENU_OBJ_NAME"), lvBlockName.append(".GURMENU_COUNT"));
//						}
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_WhenMouseDoubleclick is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.PRE-UPDATE
		 DECLARE
  lv_block_name VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK;
BEGIN
  COPY(NAME_IN('SYSTEM.TRIGGER_RECORD'),lv_block_name||'.GURMENU_SORT_SEQ ');
  COPY(NAME_IN('USER'),lv_block_name||'.GURMENU_USER_ID');
  COPY(NAME_IN('SYSDATE'),lv_block_name||'.GURMENU_ACTIVITY_DATE');
--
  EXECUTE_TRIGGER('CHK_DESC');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('SET_DESC');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void gurmenuType_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCurrentBlock();
//					copy(getTriggerRecord(),lvBlockName.append(".GURMENU_SORT_SEQ "));
//					copy(getNameIn("USER"),lvBlockName.append(".GURMENU_USER_ID"));
//					copy(getNameIn("SYSDATE"),lvBlockName.append(".GURMENU_ACTIVITY_DATE"));
//					// 
//					executeAction("CHK_DESC");
//					getTask().getGoqrpls().gCheckFailure();
//					executeAction("SET_DESC");
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_BeforeRowUpdate is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-CREREC
		 DECLARE
  lv_block_name VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK;
BEGIN
  CREATE_RECORD;
  COPY('',lv_block_name||'.DISPLAY_DESC');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gurmenuType_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCursorBlock();
//					createRecord();
//					copy("",lvBlockName.append(".DISPLAY_DESC"));
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-DELREC
		 DELETE_RECORD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gurmenuType_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				deleteRecord();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-NEXT-ITEM
		 NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gurmenuType_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				nextItem();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-NXTREC
		 DOWN;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gurmenuType_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				down();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-PREV-ITEM
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void gurmenuType_PreviousItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				previousItem();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_PreviousItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.KEY-PRVREC
		 BEGIN
  IF :SYSTEM.CURSOR_RECORD = '1' THEN
    MESSAGE(G$_NLS.Get('GOQOLIB-0039','FORM','*WARNING* At first record.'));
  ELSE
    UP;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gurmenuType_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				if ( getCursorRecord().equals("1") )
//				{
//					message(GNls.Fget(toStr("GOQOLIB-0039"), toStr("FORM"), toStr("*WARNING* At first record.")));
//				}
//				else {
//					up();
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.CHK_DESC
		 DECLARE
  lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK;
BEGIN
  IF NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME') IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQOLIB-0040','FORM','*ERROR* Object name must be entered.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF NAME_IN(lv_block_name||'.DISPLAY_DESC') IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQOLIB-0041','FORM','*ERROR* Description must be entered.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.CHK_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHK_DESC")
		public void gurmenuType_ChkDesc()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCurrentBlock();
//					if ( getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0040"), toStr("FORM"), toStr("*ERROR* Object name must be entered.")));
//						throw new ApplicationException();
//					}
//					// 
//					if ( getNameIn(lvBlockName.append(".DISPLAY_DESC")).isNull() )
//					{
//						message(GNls.Fget(toStr("GOQOLIB-0041"), toStr("FORM"), toStr("*ERROR* Description must be entered.")));
//						throw new ApplicationException();
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ChkDesc is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.CLEAR_GROUP
		 DECLARE
  rg_name  VARCHAR2(20):= 'DELETE';
  rg_id    RECORDGROUP := FIND_GROUP(rg_name);
--
  lv_block_name VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK; 
BEGIN
  IF NOT ID_NULL(rg_id) THEN
    IF TO_NUMBER(Get_Group_Row_Count(rg_id)) > 0 THEN
      DELETE_GROUP_ROW(rg_id,ALL_ROWS);
    END IF;
--
    FIRST_RECORD;
    LOOP
      SET_ITEM_INSTANCE_PROPERTY(lv_block_name||'.GURMENU_OBJ_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
      SET_ITEM_INSTANCE_PROPERTY(lv_block_name||'.DISPLAY_DESC',    CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
      EXIT WHEN :SYSTEM.LAST_RECORD = 'TRUE';
      NEXT_RECORD;
    END LOOP;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.CLEAR_GROUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLEAR_GROUP")
		public void gurmenuType_ClearGroup()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString rgName = toStr("DELETE");
//					ValueSet rgId = findGroup(rgName);
//					// 
//					NString lvBlockName = getCurrentBlock();
//					if ( !(rgId == null) )
//					{
//						if ( toNumber(getGroupRowCount(rgId)).greater(0) )
//						{
//							deleteGroupRow(rgId, ValueSet.ALL_ROWS);
//						}
//						// 
//						firstRecord();
//						while (true) {
//							setItemStyleClass(lvBlockName.append(".GURMENU_OBJ_NAME"), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
//							setItemStyleClass(lvBlockName.append(".DISPLAY_DESC"), ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
//							if ( isInLastRecord() ) 
//								break;
//							nextRecord();
//						}
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ClearGroup is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.OBJ_DESC
		 DECLARE
  lv_block_name  VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK;
  hold_desc      VARCHAR2(100);
  hold_menu_desc VARCHAR2(100);
  obj_type       VARCHAR2(30);
  menu_obj_name  VARCHAR2(61) := NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME');
--
  CURSOR obj_desc_c (p_obj VARCHAR2) IS
    SELECT GUBOBJS_DESC,
           GUBOBJS_OBJT_CODE
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = p_obj;
--
BEGIN
  OPEN obj_desc_c(menu_obj_name);
  FETCH obj_desc_c INTO hold_desc, obj_type;
  CLOSE obj_desc_c;
--
  IF NAME_IN(lv_block_name||'.GURMENU_DESC') IS NOT NULL THEN
    COPY(NAME_IN(lv_block_name||'.GURMENU_DESC'),lv_block_name||'.DISPLAY_DESC');
    hold_menu_desc := NAME_IN(lv_block_name||'.GURMENU_DESC');
  END IF;
--
  IF hold_desc IS NOT NULL THEN
    COPY(hold_desc,lv_block_name||'.HOLD_DESC');
    COPY(obj_type ,lv_block_name||'.OBJ_TYPE');
    IF hold_menu_desc IS NULL THEN
      COPY(hold_desc,lv_block_name||'.DISPLAY_DESC');
      COPY(hold_desc,lv_block_name||'.GURMENU_DESC');
    END IF;
  ELSE
    COPY('** Invalid object **',lv_block_name||'.HOLD_DESC');
    COPY('** Invalid object **',lv_block_name||'.DISPLAY_DESC');
    COPY('',lv_block_name||'.OBJ_TYPE');
    COPY('',lv_block_name||'.GURMENU_DESC');
  END IF;
--
  IF NAME_IN(lv_block_name||'.GURMENU_DESC') IS NULL THEN
    COPY(NAME_IN(lv_block_name||'.HOLD_DESC'),lv_block_name||'.DISPLAY_DESC');
    IF :SYSTEM.MODE <> 'QUERY' THEN
      COPY('',lv_block_name||'.GURMENU_DESC');
    END IF;
  END IF;
--
  COPY(TO_CHAR(G$_MULTI_REC_SELECTION.Unique_Counter),lv_block_name||'.GURMENU_COUNT');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.OBJ_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OBJ_DESC")
		public void gurmenuType_ObjDesc()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				int rowCount = 0;
//				{
//					NString lvBlockName = getCurrentBlock();
//					NString holdDesc= NString.getNull();
//					NString holdMenuDesc= NString.getNull();
//					NString objType= NString.getNull();
//					NString menuObjName = getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME"));
//					String sqlobjDescC = "SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE " +
//	" FROM GUBOBJS " +
//	" WHERE GUBOBJS_NAME = :P_P_OBJ ";
//					DataCursor objDescC = new DataCursor(sqlobjDescC);
//					NString pObj = NString.getNull();
//					try {
//						pObj=menuObjName;
//						//Setting query parameters
//						objDescC.addParameter("P_P_OBJ", pObj);
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable objDescC.
//						objDescC.open();
//						ResultSet objDescCResults = objDescC.fetchInto();
//						if ( objDescCResults != null ) {
//							holdDesc = objDescCResults.getStr(0);
//							objType = objDescCResults.getStr(1);
//						}
//						objDescC.close();
//						// 
//						if ( !getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
//						{
//							copy(getNameIn(lvBlockName.append(".GURMENU_DESC")),lvBlockName.append(".DISPLAY_DESC"));
//							holdMenuDesc = getNameIn(lvBlockName.append(".GURMENU_DESC"));
//						}
//						// 
//						if ( !holdDesc.isNull() )
//						{
//							copy(holdDesc,lvBlockName.append(".HOLD_DESC"));
//							copy(objType,lvBlockName.append(".OBJ_TYPE"));
//							if ( holdMenuDesc.isNull() )
//							{
//								copy(holdDesc,lvBlockName.append(".DISPLAY_DESC"));
//								copy(holdDesc,lvBlockName.append(".GURMENU_DESC"));
//							}
//						}
//						else {
//							copy("** Invalid object **",lvBlockName.append(".HOLD_DESC"));
//							copy("** Invalid object **",lvBlockName.append(".DISPLAY_DESC"));
//							copy("",lvBlockName.append(".OBJ_TYPE"));
//							copy("",lvBlockName.append(".GURMENU_DESC"));
//						}
//						// 
//						if ( getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
//						{
//							copy(getNameIn(lvBlockName.append(".HOLD_DESC")),lvBlockName.append(".DISPLAY_DESC"));
//							if ( !getMode().equals("QUERY") )
//							{
//								copy("",lvBlockName.append(".GURMENU_DESC"));
//							}
//						}
//						// 
//						copy(toChar(getTask().getGoqgmnu().getGMultiRecSelection().uniqueCounter()),lvBlockName.append(".GURMENU_COUNT"));
//					}
//					finally{
//						objDescC.close();
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_ObjDesc is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.SET_DESC
		 DECLARE
 lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK;
BEGIN
  IF NAME_IN(lv_block_name||'.HOLD_DESC') IS NOT NULL THEN
    IF NAME_IN(lv_block_name||'.HOLD_DESC') <> NAME_IN(lv_block_name||'.DISPLAY_DESC') THEN
      COPY(NAME_IN(lv_block_name||'.DISPLAY_DESC'),lv_block_name||'.GURMENU_DESC');
    ELSE
      COPY('',lv_block_name||'.GURMENU_DESC');
    END IF;
  ELSE
    COPY(NAME_IN(lv_block_name||'.DISPLAY_DESC'),lv_block_name||'.GURMENU_DESC');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.SET_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_DESC")
		public void gurmenuType_SetDesc()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCurrentBlock();
//					if ( !getNameIn(lvBlockName.append(".HOLD_DESC")).isNull() )
//					{
//						if ( getNameIn(lvBlockName.append(".HOLD_DESC")).notEquals(getNameIn(lvBlockName.append(".DISPLAY_DESC"))) )
//						{
//							copy(getNameIn(lvBlockName.append(".DISPLAY_DESC")),lvBlockName.append(".GURMENU_DESC"));
//						}
//						else {
//							copy("",lvBlockName.append(".GURMENU_DESC"));
//						}
//					}
//					else {
//						copy(getNameIn(lvBlockName.append(".DISPLAY_DESC")),lvBlockName.append(".GURMENU_DESC"));
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_SetDesc is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_TYPE.SORT_SEQ
		 DECLARE
  lv_block_name VARCHAR2(30):= :SYSTEM.CURRENT_BLOCK;
  -- 81-1 increase size of two local variables below from INTEGER(2)
  -- 81-1 to INTEGER(4) to handle up to 10,000 menu entries
  lv_seq        INTEGER(4) := 1;
  lv_cur_rec    INTEGER(4) := :SYSTEM.CURSOR_RECORD;
BEGIN
  IF :SYSTEM.CURSOR_RECORD = '1' AND
     :SYSTEM.LAST_RECORD = 'TRUE' AND
     NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME') IS NULL THEN 
    NULL;
  ELSE
    FIRST_RECORD;
    LOOP
      COPY(lv_seq,lv_block_name||'.GURMENU_SORT_SEQ');
      IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
        GO_RECORD(lv_cur_rec);
        EXIT;
      ELSE
        lv_seq := lv_seq + 1;
        NEXT_RECORD;
      END IF;
    END LOOP;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_TYPE.SORT_SEQ
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SORT_SEQ")
		public void gurmenuType_SortSeq()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString lvBlockName = getCurrentBlock();
//					//  81-1 increase size of two local variables below from INTEGER(2)
//					//  81-1 to INTEGER(4) to handle up to 10,000 menu entries
//					NInteger lvSeq = toInt(1);
//					NInteger lvCurRec = getCursorRecord();
//					if ( getCursorRecord().equals("1") && isInLastRecord() && getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME")).isNull() )
//					{
//					}
//					else {
//						firstRecord();
//						while (true) {
//							copy(lvSeq,lvBlockName.append(".GURMENU_SORT_SEQ"));
//							if ( isInLastRecord() )
//							{
//								setCurrentRecord(lvCurRec);
//									break;
//							}
//							else {
//								lvSeq = lvSeq.add(1);
//								nextRecord();
//							}
//						}
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.gurmenuType_SortSeq is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.POST-BLOCK
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK")
		public void menuType_PostBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.PRE-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK")
		public void menuType_PreBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_PreBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.QUERY_DATA
		 -- 1-HBN4V
DECLARE
  HOLD_POS VARCHAR2(80) := :SYSTEM.CURSOR_ITEM;
BEGIN
  GO_BLOCK('GUBOBJS');
  IF NVL(:FORM_HEADER.INITIAL_QUERY,'Y') = 'Y' THEN
    EXECUTE_QUERY;
  END IF;
  :FORM_HEADER.INITIAL_QUERY := 'N';
  GO_ITEM(HOLD_POS);
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.QUERY_DATA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QUERY_DATA")
		public void menuType_QueryData()
		{
			
				//  1-HBN4V
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NString holdPos = getCursorItem();
//					goBlock(toStr("GUBOBJS"));
//					if ( isNull(getFormModel().getFormHeader().getInitialQuery(), "Y").equals("Y") )
//					{
//						executeQuery();
//					}
//					getFormModel().getFormHeader().setInitialQuery(toStr("N"));
//					goItem(holdPos);
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_QueryData is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.WHEN-WINDOW-DEACTIVATED
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.WHEN-WINDOW-DEACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-DEACTIVATED")
		public void menuType_WhenWindowDeactivated()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_WhenWindowDeactivated is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
		 BEGIN
	G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('WHEN_NEW_BLOCK_INSTANCE_TRG');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE")
		public void menuType_WhenNewBlockInstance()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().getGNavigationFrame().populateGuroptm();
//				getTask().getGoqrpls().gCheckFailure();
//				// 
//				executeAction("WHEN_NEW_BLOCK_INSTANCE_TRG");
//				getTask().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.menuType_WhenNewBlockInstance is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.POST-QUERY
		 DECLARE
  HOLD_DESC VARCHAR2(80);
BEGIN
  SELECT GUBOBJS_DESC,
         GUBOBJS_OBJT_CODE
    INTO HOLD_DESC,
         :QK_MENU.QK_TYPE
    FROM GUBOBJS
   WHERE GUBOBJS_NAME = :QK_MENU.GURMENU_OBJ_NAME
     AND ROWNUM = 1;
--
  IF NVL(LENGTH(HOLD_DESC), 0) > 45 THEN
    :QK_MENU.QK_DESC := SUBSTR(HOLD_DESC,1,40)||'...';
  ELSE
    :QK_MENU.QK_DESC := HOLD_DESC;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterQuery
		public void qkMenuType_AfterQuery(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				QkMenuAdapter qkMenuElement = (QkMenuAdapter)this.getFormModel().getQkMenu().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NString holdDesc= NString.getNull();
//					String sql1 = "SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE " +
//	" FROM GUBOBJS " +
//	" WHERE GUBOBJS_NAME = :QK_MENU_GURMENU_OBJ_NAME AND ROWNUM = 1 ";
//					DataCommand command1 = new DataCommand(sql1);
//					//Setting query parameters
//					command1.addParameter("QK_MENU_GURMENU_OBJ_NAME", qkMenuElement.getGurmenuObjName());
//					ResultSet results1 = command1.executeQuery();
//					rowCount = command1.getRowCount();
//					if ( results1.hasData() ) {
//						holdDesc = results1.getStr(0);
//						qkMenuElement.setQkType(results1.getStr(1));
//					}
//					results1.close();
//					// 
//					if ( isNull(length(holdDesc), 0).greater(45) )
//					{
//						qkMenuElement.setQkDesc(substring(holdDesc, toInt(1), toInt(40)).append("..."));
//					}
//					else {
//						qkMenuElement.setQkDesc(holdDesc);
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_AfterQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.ON-ERROR
		 DECLARE 
  lv_errcod  NUMBER       := ERROR_CODE; 
  lv_errtyp  VARCHAR2(3)  := ERROR_TYPE; 
  lv_errtxt  VARCHAR2(80) := ERROR_TEXT; 
BEGIN 
  IF DBMS_ERROR_CODE = -1403 THEN
  	NULL;
  ELSE
  	IF (lv_errcod = 40102) THEN 
      NULL;
    ELSE 
      MESSAGE(lv_errtyp||'-'||to_char(lv_errcod)||': '||lv_errtxt); 
      RAISE Form_Trigger_Failure; 
    END IF; 
  END IF; 
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void qkMenuType_OnError(EventObject args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				{
//					NNumber lvErrcod = SupportClasses.SQLFORMS.ErrorCode();
//					NString lvErrtyp = SupportClasses.SQLFORMS.ErrorType();
//					NString lvErrtxt = SupportClasses.SQLFORMS.ErrorText();
//					if ( errorCode().equals(- (1403)) )
//					{
//					}
//					else {
//						if ((lvErrcod.equals(40102)))
//						{
//						}
//						else {
//							message(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
//							throw new ApplicationException();
//						}
//					}
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_OnError is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.POST-BLOCK
		 HIDE_VIEW('MENU_ENTIRE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK")
		public void qkMenuType_PostBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				hideView("MENU_ENTIRE");
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-CREREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void qkMenuType_CreateRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-DELREC
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void qkMenuType_DeleteRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NXTBLK
		 GO_BLOCK('GUBOBJS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void qkMenuType_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				goBlock(toStr("GUBOBJS"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NXTREC
		 BEGIN
  IF :SYSTEM.LAST_RECORD <> 'TRUE' THEN
    NEXT_RECORD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void qkMenuType_NextRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				if ( !isInLastRecord() )
//				{
//					nextRecord();
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PRVBLK
		 GO_BLOCK('GUBOBJS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void qkMenuType_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				goBlock(toStr("GUBOBJS"));
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PRVREC
		 BEGIN
  IF :SYSTEM.CURSOR_RECORD <> '1' THEN
    PREVIOUS_RECORD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void qkMenuType_PreviousRecord()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				if ( getCursorRecord().notEquals("1") )
//				{
//					previousRecord();
//				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-NEXT-ITEM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void qkMenuType_keyNexItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_keyNexItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER QK_MENU_TYPE.KEY-PREV-ITEM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU_TYPE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void qkMenuType_PreviousItem()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//				getTask().getGoqrpls().gInvalidFunctionMsg();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousItem is not completely migrated yet. Please read the Migration Guide.");
				
				
			}


		public void gFlashliteBtnClass_click() {
			// TODO Auto-generated method stub
			
		}


		public void LoadFormHeader() {
			gFormClass_LoadFormHeader();
			
		}	
	
}
	
