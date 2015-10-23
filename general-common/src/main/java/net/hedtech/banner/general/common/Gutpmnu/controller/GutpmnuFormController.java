package net.hedtech.banner.general.common.Gutpmnu.controller;
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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.MenuType;	
		

public class GutpmnuFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private MenuType getMenuType() {
		return (net.hedtech.general.common.libraries.Goqolib.services.MenuType) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("MENU_TYPE");
	}	
		
	
	
	public GutpmnuFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GutpmnuTask getTask() {
		return (GutpmnuTask)super.getTask();
	}
	
	
	public GutpmnuModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Gutpmnu_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Gutpmnu_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Gutpmnu_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Gutpmnu_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Gutpmnu_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Gutpmnu_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Gutpmnu_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Gutpmnu_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Gutpmnu_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Gutpmnu_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Gutpmnu_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Gutpmnu_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Gutpmnu_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Gutpmnu_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Gutpmnu_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Gutpmnu_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.POST_FORMS_COMMIT_TRG
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Gutpmnu_PostFormsCommitTrg()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Gutpmnu_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Gutpmnu_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Gutpmnu_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Gutpmnu_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Gutpmnu_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Gutpmnu_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Gutpmnu_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Gutpmnu_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Gutpmnu_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Gutpmnu_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Gutpmnu_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Gutpmnu_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Gutpmnu_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Gutpmnu_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Gutpmnu_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Gutpmnu_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Gutpmnu_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-NXTKEY
		 BEGIN
  IF :SYSTEM.CURSOR_BLOCK = 'ALL_USERS_BLOCK' OR
     :SYSTEM.CURSOR_ITEM  = 'FORM_HEADER1.USER_SEARCH' THEN
    CHECK_CUSTOM;
    G$_CHECK_FAILURE;
--
    SET_ITEM_PROPERTY('OBJECT_TYPE',VISIBLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('OBJECT_TYPE',DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('OBJECT_TYPE',ENABLED,PROPERTY_TRUE);
  ELSE
    MESSAGE(G$_NLS.Get('GUTPMNU-0000','FORM','*ERROR* This function currently not available.'));
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Gutpmnu_KeyNxtkey()
		{
			
				if ( getCursorBlock().equals("ALL_USERS_BLOCK") || getCursorItem().equals("FORM_HEADER1.USER_SEARCH") )
				{
					this.getTask().getServices().checkCustom();
					getTask().getGoqrpls().gCheckFailure();
					// 
					setItemVisible("OBJECT_TYPE", true);
					setItemVisible("OBJECT_TYPE", true);
					setItemEnabled("OBJECT_TYPE", true);
				}
				else {
					errorMessage(GNls.Fget(toStr("GUTPMNU-0000"), toStr("FORM"), toStr("*ERROR* This function currently not available.")));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Gutpmnu_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Gutpmnu_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Gutpmnu_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Gutpmnu_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Gutpmnu_EnableKeys()
		{
			
				getGFormClass().enableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Gutpmnu_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Gutpmnu_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Gutpmnu_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Gutpmnu_blockOut()
		{
			
				getMenuType().postBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Gutpmnu_blockIn()
		{
			
				getMenuType().preBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.QUERY_DATA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QUERY_DATA")
		public void Gutpmnu_QueryData()
		{
			
				getMenuType().queryData();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-WINDOW-DEACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-DEACTIVATED")
		public void Gutpmnu_WhenWindowDeactivated()
		{
			
				getMenuType().whenWindowDeactivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Gutpmnu_blockChange()
		{
			
				getMenuType().whenNewBlockInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.PRE_FORM_TRG
		 BEGIN
--
-- Determine whether or not to display the form name in the object block.
--
  IF :GLOBAL.FORMNAME_DISPLAY_IND <> 'N' THEN
  	SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.OBJECT_SORT_BTN',VISIBLE,PROPERTY_TRUE);
  	SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.OBJECT_SORT_BTN',ENABLED,PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_NAME',VISIBLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_NAME',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_NAME',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_NAME',QUERYABLE,PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_DESC',WIDTH,180);
    SET_ITEM_PROPERTY('GUBOBJS.GUBOBJS_DESC',POSITION,51,43);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Gutpmnu_PreFormTrg()
		{
			
				// 
				//  Determine whether or not to display the form name in the object block.
				// 
				if ( getGlobal("FORMNAME_DISPLAY_IND").notEquals("N") )
				{
					setItemVisible("BUTTON_CONTROL_BLOCK.OBJECT_SORT_BTN", true);
					setItemEnabled("BUTTON_CONTROL_BLOCK.OBJECT_SORT_BTN", true);
					
					setItemVisible("GUBOBJS.GUBOBJS_NAME", true);
					setItemEnabled("GUBOBJS.GUBOBJS_NAME", true);
					setItemNavigable("GUBOBJS.GUBOBJS_NAME", true);
	
					setItemQueryAllowed("GUBOBJS.GUBOBJS_NAME", true);
				
					
					// 
					setItemWidth("GUBOBJS.GUBOBJS_DESC", 180);
					// F2J_NOT_SUPPORTED : The property "ITEM's POSITION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.FORMS40.SetItemProperty("GUBOBJS.GUBOBJS_DESC", SupportClasses.Property.POSITION, 51, 43);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's POSITION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
--
  SHOW_VIEW('GUBOBJS_CANVAS');
  SHOW_VIEW('GURMENU_CANVAS');
--
  POPULATE_LIST_OF_CODES;
  EXECUTE_TRIGGER('QUERY_DATA');
--
  GO_ITEM('FORM_HEADER.CUST_USER_ID');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Gutpmnu_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				// 
				showView("GUBOBJS_CANVAS");
				showView("GURMENU_CANVAS");
				
				
				//MORPHIS TODO
				//francisco carvalho
				showView("GURMENU2_CANVAS");
				// 
				this.getTask().getServices().populateListOfCodes();
				executeAction("QUERY_DATA");
				// 
				
				goItem(toStr("FORM_HEADER.CUST_USER_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.WHEN-TIMER-EXPIRED
		 BEGIN
  G$_TIMER_EXP;
  G$_CHECK_FAILURE;
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
		 * GUTPMNU.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Gutpmnu_WhenTimerExpired(NString timerName)
		{
			
				getTask().getGoqrpls().gTimerExp(timerName);
				getTask().getGoqrpls().gCheckFailure();
				// 
//				if ( SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.TIMER_NAME).equals(GWfDriver.wfTimerName) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CHECK_MSG"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.LOAD_CURRENT_RELEASE
		 BEGIN
  :CURRENT_RELEASE := '8.2';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Gutpmnu_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.LOAD_FORM_HEADER
		 BEGIN
  :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
  :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
  :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
  :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
  :current_user1 := :GLOBAL.current_user1;
  :WORK_CR := 'Y';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Gutpmnu_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentUser1(getGlobal("CURRENT_USER1"));
				getFormModel().getFormHeader().setWorkCr(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.CHECK_KEYS
		 BEGIN
  IF :FORM_HEADER.CUST_USER_ID IS NULL THEN
    MESSAGE(G$_NLS.Get('GUTPMNU-0001','FORM','*ERROR* User name must be entered.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Gutpmnu_CheckKeys()
		{
			
				if ( getFormModel().getFormHeader().getCustUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0001"), toStr("FORM"), toStr("*ERROR* User name must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-COMMIT
		 DECLARE
  cursor_block    VARCHAR2(30) := :SYSTEM.CURSOR_BLOCK;
BEGIN
  IF :SYSTEM.CURSOR_RECORD = '1' AND
     :SYSTEM.LAST_RECORD = 'TRUE' AND
     NAME_IN(cursor_block || '.GURMENU_OBJ_NAME') IS NULL THEN 
    NULL;
  ELSE
    NEXT_ITEM;
    G$_CHECK_FAILURE;
    PREVIOUS_ITEM;
  END IF;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    EXECUTE_TRIGGER('COMMIT_LOGIC');
    G$_CHECK_FAILURE;
  ELSE
    MESSAGE(G$_NLS.Get('GUTPMNU-0002','FORM','Warning: No Changes to Save.')); 
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Gutpmnu_Save()
		{
			
				{
					NString cursorBlock = getCursorBlock();
					if ( getCursorRecord().equals("1") && isInLastRecord() && getNameIn(cursorBlock.append(".GURMENU_OBJ_NAME")).isNull() )
					{
					}
					else {
						nextItem();
						getTask().getGoqrpls().gCheckFailure();
						previousItem();
					}
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						executeAction("COMMIT_LOGIC");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						warningMessage(GNls.Fget(toStr("GUTPMNU-0002"), toStr("FORM"), toStr("Warning: No Changes to Save.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-CLRFRM
		 BEGIN
  CLEAR_FORM(NO_VALIDATE);
--
  DESTROY_RECORD_GROUP('GUBOBJS_OBJT_CODE');
--
  IF GET_ITEM_PROPERTY('OBJECT_TYPE',DISPLAYED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('OBJECT_TYPE',DISPLAYED,PROPERTY_TRUE); 
    SET_ITEM_PROPERTY('OBJECT_TYPE',ENABLED,PROPERTY_TRUE); 
    SET_ITEM_PROPERTY('OBJECT_TYPE',NAVIGABLE,PROPERTY_TRUE); 
  END IF;
--
  HIDE_VIEW('USER_VIEW');
  HIDE_VIEW('GURMENU2_CANVAS');
--
  SHOW_VIEW('GUBOBJS_CANVAS');
  SHOW_VIEW('GURMENU_CANVAS');
--
  POPULATE_LIST_OF_CODES;
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
--
  GO_ITEM('CUST_USER_ID');
  :CUST_USER_ID := '';
--
  :FORM_HEADER.OBJECT_TYPE := 'FORM';
-- 1-HBN4V
  :FORM_HEADER.INITIAL_QUERY := 'Y';  
  EXECUTE_TRIGGER('QUERY_DATA');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Gutpmnu_ClearTask()
		{
			
				clearTask(TaskServices.NO_VALIDATE);
				// 
				this.getTask().getServices().destroyRecordGroup(toStr("GUBOBJS_OBJT_CODE"));
				// 
				if ( getItemVisible("OBJECT_TYPE").equals("FALSE") )
				{
					setItemVisible("OBJECT_TYPE", true);
					setItemEnabled("OBJECT_TYPE", true);
					setItemNavigable("OBJECT_TYPE", true);
				}
				// 
				hideView("USER_VIEW");
				//MORPHIS TODO
				//Francisco Carvalho
				showView("GURMENU2_CANVAS");
				//hideView("GURMENU2_CANVAS");
				//
				// 
				
				showView("GUBOBJS_CANVAS");
				showView("GURMENU_CANVAS");
				// 
				this.getTask().getServices().populateListOfCodes();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goItem(toStr("CUST_USER_ID"));
				getFormModel().getFormHeader().setCustUserId(toStr(""));
				// 
				getFormModel().getFormHeader().setObjectType(toStr("FORM"));
				//  1-HBN4V
				getFormModel().getFormHeader().setInitialQuery(toStr("Y"));
				executeAction("QUERY_DATA");
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-CQUERY
		 BEGIN
  IF :SYSTEM.BLOCK_STATUS = 'CHANGED' AND 
     INSTR(:SYSTEM.CURSOR_BLOCK,'GURMENU') > 0 THEN
    EXECUTE_TRIGGER('SORT_SEQ');
    GO_BLOCK(:SYSTEM.CURSOR_BLOCK);
    EXECUTE_QUERY;
  END IF;
--
  IF :GURMENU.GURMENU_OBJ_NAME IS NOT NULL THEN
    SET_ITEM_PROPERTY('USER_SEARCH',DISPLAYED,PROPERTY_TRUE); 
    SET_ITEM_PROPERTY('USER_SEARCH',ENABLED,PROPERTY_TRUE); 
    SET_ITEM_PROPERTY('USER_SEARCH',NAVIGABLE,PROPERTY_TRUE);   
--
    IF :USER_SEARCH IS NOT NULL THEN
      :USER_SEARCH :='';
    END IF;
    :SEARCH_CR := 'NO';
    GO_BLOCK('ALL_USERS_BLOCK');
  ELSE
    MESSAGE(G$_NLS.Get('GUTPMNU-0003','FORM','*ERROR* You are not able to copy this menu. Make some entries.'));
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-CQUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void Gutpmnu_TotalResults()
		{
			

				
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){
				
				if(getBlockStatus().equals("CHANGED") && inStr(getCurrentBlock(), toStr("GURMENU")).greater(toInt(0)) )
				{
					executeAction("SORT_SEQ");
					goBlock(toStr(getCursorBlock()));
					executeQuery();
				}
				 
				if ( !gurmenuElement.getGurmenuObjName().isNull() )
				{
					setItemVisible("USER_SEARCH", true);
					setItemEnabled("USER_SEARCH", true);
					setItemNavigable("USER_SEARCH", true);
					// 
					if ( !getFormModel().getFormHeader().getUserSearch().isNull() )
					{
						getFormModel().getFormHeader().setUserSearch(toStr(""));
					}
					getFormModel().getFormHeader().setSearchCr(toStr("NO"));
					
				
					setViewVisible("USER_VIEW", true);
					showView("USER_VIEW");
					setViewVisible("GURMENU2_CANVAS", false);
					hideView("GURMENU2_CANVAS");
				
					goBlock(toStr("ALL_USERS_BLOCK"));
				}
				else {
					errorMessage(GNls.Fget(toStr("GUTPMNU-0003"), toStr("FORM"), toStr("*ERROR* You are not able to copy this menu. Make some entries.")));
				}
			}
		}
		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-DUP-ITEM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Gutpmnu_KeyDupItem()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

	
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-EDIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-EDIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EDIT")
		public void Gutpmnu_KeyEdit()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-ENTQRY
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Gutpmnu_Search()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-EXEQRY
		 BEGIN
 IF :SYSTEM.CURSOR_ITEM = 'GUBOBJS' THEN
   EXECUTE_TRIGGER('QUERY_DATA');
 ELSE
   EXECUTE_QUERY;
 END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Gutpmnu_ExecuteQuery()
		{
			
				if ( getCursorItem().equals("GUBOBJS") )
				{
					executeAction("QUERY_DATA");
				}
				else {
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-EXIT
		 BEGIN
--
-- Prompt to save or rollback if form is changed so record sequences are correct.
--
  IF :SYSTEM.FORM_STATUS = 'NEW' OR 
     :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('GUTPMNU-0004','FORM','Commit or Rollback before exiting.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Gutpmnu_Exit()
		{
			
				// 
				//  Prompt to save or rollback if form is changed so record sequences are correct.
				// 
				if ( getTaskStatus().equals("NEW") || getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0004"), toStr("FORM"), toStr("*ERROR* Commit or Rollback before exiting.")));
					throw new ApplicationException();
				}
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-NXTSET
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Gutpmnu_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-PRVBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Gutpmnu_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-NXTBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Gutpmnu_NextBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-SCRDOWN
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Gutpmnu_KeyScrdown()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.KEY-SCRUP
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Gutpmnu_KeyScrup()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.COMMIT_LOGIC
		 DECLARE
	cursor_location VARCHAR2(61) := :SYSTEM.CURSOR_ITEM;
BEGIN
  :COMMIT_FLAG := 'Y';  
--
  EXECUTE_TRIGGER('SORT_SEQ'); 
  G$_CHECK_FAILURE;
  GO_ITEM(cursor_location);
--
  COMMIT_FORM;
  IF FORM_SUCCESS THEN
    :COMMIT_FLAG := 'N';  
  ELSE
    :COMMIT_FLAG := 'N';  
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.COMMIT_LOGIC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COMMIT_LOGIC")
		public void Gutpmnu_CommitLogic()
		{
			
				{
					NString cursorLocation = getCursorItem();
					getFormModel().getFormHeader().setCommitFlag(toStr("Y"));
					// 
					executeAction("SORT_SEQ");
					getTask().getGoqrpls().gCheckFailure();
					goItem(cursorLocation);				
					commitTask();
//					if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
					if(getFormSucess().getValue())
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						getFormModel().getFormHeader().setCommitFlag(toStr("N"));
					}
					else {
						getFormModel().getFormHeader().setCommitFlag(toStr("N"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.COMMIT_STATUS
		 IF NVL(:COMMIT_FLAG,'N') = 'N' THEN
  MESSAGE(G$_NLS.Get('GUTPMNU-0005','FORM','*ERROR* You must press the COMMIT key to save your changes.'));
  RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.COMMIT_STATUS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COMMIT_STATUS")
		public void Gutpmnu_CommitStatus()
		{
			
				if ( isNull(getFormModel().getFormHeader().getCommitFlag(), "N").equals("N") )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0005"), toStr("FORM"), toStr("*ERROR* You must press the COMMIT key to save your changes.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.OPTION_MAIN
		 BEGIN
  IF :SYSTEM.CURSOR_BLOCK = 'ALL_USERS_BLOCK' OR
    :SYSTEM.CURSOR_ITEM  = 'FORM_HEADER.USER_SEARCH' THEN
    GO_BLOCK('GURMENU');
    HIDE_VIEW('USER_VIEW');
    SET_ITEM_PROPERTY('OBJECT_TYPE',VISIBLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('OBJECT_TYPE',DISPLAYED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('OBJECT_TYPE',ENABLED,PROPERTY_TRUE);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.OPTION_MAIN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTION_MAIN")
		public void Gutpmnu_OptionMain()
		{
			
				if ( getCursorBlock().equals("ALL_USERS_BLOCK") || getCursorItem().equals("FORM_HEADER.USER_SEARCH") )
				{
					goBlock(toStr("GURMENU"));
					hideView("USER_VIEW");
					
					//MORPHIS TODO
					//FRANCISOC CARVALHO					
					showView("GURMENU2_CANVAS");
					
					setItemVisible("OBJECT_TYPE", true);
					setItemVisible("OBJECT_TYPE", true);
					setItemEnabled("OBJECT_TYPE", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUTPMNU.USER_OBJ_DESC
		 DECLARE
  lv_block_name    VARCHAR2(30) := :SYSTEM.CURSOR_BLOCK;
  hold_desc        VARCHAR2(100);
  lv_menu          VARCHAR2(30);
  lv_obj_name      VARCHAR2(30) := NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME');
  lv_sort_seq      INTEGER := NAME_IN(lv_block_name||'.GURMENU_SORT_SEQ');
--
  CURSOR get_user_desc_c (p_menu VARCHAR2) IS
    SELECT GURMENU_DESC
      FROM GURMENU
     WHERE GURMENU_NAME = p_menu
       AND GURMENU_OBJ_NAME = lv_obj_name
       AND GURMENU_USER_ID = :CUST_USER_ID
       AND GURMENU_SORT_SEQ = lv_sort_seq;
--
  CURSOR get_local_desc_c (p_menu VARCHAR2) IS
    SELECT GURMENU_DESC
      FROM GURMENU
     WHERE GURMENU_NAME = p_menu
       AND GURMENU_OBJ_NAME = lv_obj_name
       AND GURMENU_USER_ID IN ('BASELINE','LOCAL')
       AND GURMENU_SORT_SEQ = lv_sort_seq;
--
BEGIN
  IF lv_block_name = 'GURMENU' THEN
  	lv_menu := '*PERSONAL';
  ELSE
  	lv_menu := :GURMENU.GURMENU_OBJ_NAME;
  END IF;
--
  OPEN get_user_desc_c(lv_menu);
  FETCH get_user_desc_c INTO hold_desc;
  CLOSE get_user_desc_c;
--
  IF hold_desc IS NOT NULL THEN
    COPY(hold_desc,lv_block_name||'.DISPLAY_DESC');
    COPY(hold_desc,lv_block_name||'.GURMENU_DESC');
--
  ELSE
    OPEN get_local_desc_c(lv_menu);
    FETCH get_local_desc_c INTO hold_desc;
    CLOSE get_local_desc_c;
--
    IF hold_desc IS NOT NULL THEN
      COPY(hold_desc,lv_block_name||'.DISPLAY_DESC');
      COPY(hold_desc,lv_block_name||'.GURMENU_DESC');
    END IF;
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUTPMNU.USER_OBJ_DESC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="USER_OBJ_DESC")
		public void Gutpmnu_UserObjDesc()
		{
			Gutpmnu_UserObjDesc((GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true));
		}
		
		public void Gutpmnu_UserObjDesc(GurmenuAdapter gurmenuElement)
		{
			

				if(gurmenuElement!=null){

				int rowCount = 0;
				{
					NString lvBlockName = getCursorBlock();
					NString holdDesc= NString.getNull();
					NString lvMenu= NString.getNull();
					NString lvObjName = getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME"));
					NInteger lvSortSeq = toInt(getNameIn(lvBlockName.append(".GURMENU_SORT_SEQ")));
					String sqlgetUserDescC = "SELECT GURMENU_DESC " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_P_MENU AND GURMENU_OBJ_NAME = :P_LV_OBJ_NAME AND GURMENU_USER_ID = :CUST_USER_ID AND GURMENU_SORT_SEQ = :P_LV_SORT_SEQ ";
					DataCursor getUserDescC = new DataCursor(sqlgetUserDescC);
					String sqlgetLocalDescC = "SELECT GURMENU_DESC " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_P_MENU AND GURMENU_OBJ_NAME = :P_LV_OBJ_NAME AND (GURMENU_USER_ID) IN ('BASELINE', 'LOCAL') AND GURMENU_SORT_SEQ = :P_LV_SORT_SEQ ";
					DataCursor getLocalDescC = new DataCursor(sqlgetLocalDescC);
					NString pMenu = NString.getNull();
					try {
						if ( lvBlockName.equals("GURMENU") )
						{
							lvMenu = toStr("*PERSONAL");
						}
						else {
							lvMenu = gurmenuElement.getGurmenuObjName();
						}
						// 
						pMenu=lvMenu;
						//Setting query parameters
						getUserDescC.addParameter("P_P_MENU", pMenu);
						getUserDescC.addParameter("P_LV_OBJ_NAME", lvObjName);
						getUserDescC.addParameter("CUST_USER_ID", getFormModel().getFormHeader().getCustUserId());
						getUserDescC.addParameter("P_LV_SORT_SEQ", lvSortSeq);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getUserDescC.
						getUserDescC.open();
						ResultSet getUserDescCResults = getUserDescC.fetchInto();
						if ( getUserDescCResults != null ) {
							holdDesc = getUserDescCResults.getStr(0);
						}
						// 
						if ( !holdDesc.isNull() )
						{
							gurmenuElement.setDisplayDesc(holdDesc);
							gurmenuElement.setGurmenuDesc(holdDesc);
//							copy(holdDesc,lvBlockName.append(".DISPLAY_DESC"));
//							copy(holdDesc,lvBlockName.append(".GURMENU_DESC"));
						}
						else {
							pMenu=lvMenu;
							//Setting query parameters
							getLocalDescC.addParameter("P_P_MENU", pMenu);
							getLocalDescC.addParameter("P_LV_OBJ_NAME", lvObjName);
							getLocalDescC.addParameter("P_LV_SORT_SEQ", lvSortSeq);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable getLocalDescC.
							getLocalDescC.open();
							ResultSet getLocalDescCResults = getLocalDescC.fetchInto();
							if ( getLocalDescCResults != null ) {
								holdDesc = getLocalDescCResults.getStr(0);
							}
							// 
							if ( !holdDesc.isNull() )
							{
								gurmenuElement.setDisplayDesc(holdDesc);
								gurmenuElement.setGurmenuDesc(holdDesc);

//								copy(holdDesc,lvBlockName.append(".DISPLAY_DESC"));
//								copy(holdDesc,lvBlockName.append(".GURMENU_DESC"));
							}
						}
					}
					finally{
						getUserDescC.close();
						getLocalDescC.close();
					}
				}
			}

		}
	
}
	
