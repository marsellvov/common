package net.hedtech.banner.general.common.Guainst.controller;
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guainst.model.*;
import net.hedtech.banner.general.common.Guainst.*;
import net.hedtech.banner.general.common.Guainst.services.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GValFormClass;
		

public class GuainstFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GValFormClass getGValFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GValFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_VAL_FORM_CLASS");
	}	
		
	
	
	public GuainstFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuainstTask getTask() {
		return (GuainstTask)super.getTask();
	}
	
	
	public GuainstModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guainst_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guainst_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Guainst_BannerXeSendContext()
		{
			
				getGFormClass().bannerXeSendContext();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Guainst_WhenCustomJavascriptEvent()
		{
			
				getGFormClass().WhenCustomJavascriptEvent();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guainst_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guainst_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guainst_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guainst_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guainst_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guainst_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guainst_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guainst_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guainst_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guainst_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guainst_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guainst_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guainst_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guainst_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guainst_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guainst_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guainst_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guainst_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guainst_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.WHEN-TIMER-EXPIRED
		 BEGIN
  G$_TIMER_EXP;
  G$_CHECK_FAILURE;
--
-- 4000-32 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE
--         procedure to check for a valid task or activity sent via SCT Workflow
--         and, if found, launch the SCT Banner object associated with that task
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
		 * GUAINST.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guainst_WhenTimerExpired(NString timerName)
		{
			
				getTask().getGoqrpls().gTimerExp(timerName);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guainst_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guainst_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guainst_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guainst_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guainst_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Guainst_F6()
		{
			
				getGFormClass().f6();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guainst_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guainst_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guainst_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guainst_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guainst_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guainst_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guainst_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guainst_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guainst_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guainst_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guainst_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guainst_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guainst_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guainst_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guainst_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guainst_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guainst_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guainst_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guainst_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guainst_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guainst_recordChange()
		{
			
				getGValFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.WHEN-NEW-ITEM-INSTANCE
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'GUBINST_1_CANVAS' THEN
  G$_Navigation_Frame.Disable_Option('MAIN_WINDOW','W');
  G$_Navigation_Frame.Enable_Option('GUBINST','B');
ELSE
  G$_Navigation_Frame.ENABLE_Option('MAIN_WINDOW','W');
  G$_Navigation_Frame.Disable_Option('GUBINST','B');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void Guainst_itemChange()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("GUBINST_1_CANVAS") )
				{
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("MAIN_WINDOW"), toStr("W"));
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUBINST"), toStr("B"));
				}
				else {
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("MAIN_WINDOW"), toStr("W"));
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GUBINST"), toStr("B"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.POST-TEXT-ITEM
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'GUBINST_1_CANVAS' THEN
  :save_item := :system.cursor_item;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void Guainst_itemOut()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("GUBINST_1_CANVAS") )
				{
					getFormModel().getFormHeader().setSaveItem(toStr(getCursorItem()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
 IF :SYSTEM.EVENT_WINDOW IS NULL OR
    :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
    IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN
       GO_ITEM(:save_item);
    -- 80-4  add IF to handle navigation to SDE Window
    ELSIF :SYSTEM.EVENT_WINDOW = 'G$_SDSP_WINDOW' THEN
       NULL;
    ELSE
       GO_ITEM('GUBINST_ALUMNI_INSTALLED');
    END IF;
 END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guainst_WhenWindowActivatedTrg()
		{
			
				if ( (getCurrentWindow()) == null || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					if ( getCurrentWindow().equals("MAIN_WINDOW") )
					{
						goItem(getFormModel().getFormHeader().getSaveItem());
					}
					else if ( getCurrentWindow().equals("G$_SDSP_WINDOW") ) {
					}
					else {
						goItem(toStr("GUBINST_ALUMNI_INSTALLED"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guainst_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.VALIDATE_CURR_CODE
		    :EFFDATE_EFF_DATE_TIME := TO_CHAR(SYSDATE, 'YYYYMMDD') || '235959';
--
   EXECUTE_TRIGGER( 'EDIT_CURR_CODE' );
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.VALIDATE_CURR_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_CURR_CODE")
		public void Guainst_ValidateCurrCode()
		{
				getFormModel().getFormHeader().setEffdateEffDateTime(toChar(NDate.getNow(), "YYYYMMDD").append("235959"));
				executeAction("EDIT_CURR_CODE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.LIST_VALUES_CALL
		    :CALLFLD := :SYSTEM.CURRENT_ITEM ;
--
   :CALLFLD := LPAD(SUBSTR(:CALLFLD, 9, 4), 7, 'STV') ;
--
   G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,:CALLFLD,'QUERY');
   G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.LIST_VALUES_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_CALL")
		public void Guainst_ListValuesCall()
		{
			
				getFormModel().getFormHeader().setCallfld(toStr(getCurrentItem()));
				getFormModel().getFormHeader().setCallfld(lpad(substring(getFormModel().getFormHeader().getCallfld(), toInt(9), toInt(4)), 7, "STV"));
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), getFormModel().getFormHeader().getCallfld(), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('GUBINST_ALUMNI_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_ALUMNI_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_ALUMNI_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_BASE_CURR_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_BASE_CURR_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_BASE_CURR_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_BILCSH_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_BILCSH_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_BILCSH_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_CENTURY_PIVOT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_CENTURY_PIVOT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_CENTURY_PIVOT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_CITY',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_CITY',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_CITY',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_DATE_DEFAULT_FORMAT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_DATE_DEFAULT_FORMAT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_DATE_DEFAULT_FORMAT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_FINAID_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_FINAID_IND',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_FINAID_IND',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_FINAID_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_FINAID_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_FINAID_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_FINANCE_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_FINANCE_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_FINANCE_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_HUMANRE_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_HUMANRE_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_HUMANRE_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_NAME',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_NAME',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_NAME',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_NATN_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_OPERATING_SYSTEM_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_OPERATING_SYSTEM_IND',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_OPERATING_SYSTEM_IND',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_PHONE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_PHONE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_PHONE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_PHONE_AREA',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_PHONE_AREA',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_PHONE_AREA',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_PHONE_EXT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_PHONE_EXT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_PHONE_EXT',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_POSBUD_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_POSBUD_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_POSBUD_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_STAT_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_STAT_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_STAT_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_STREET_LINE1',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE1',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE1',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_STREET_LINE2',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE2',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE2',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_STREET_LINE3',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE3',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE3',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_STUDENT_INSTALLED',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_STUDENT_INSTALLED',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_STUDENT_INSTALLED',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_ZIP',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_ZIP',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_ZIP',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_ZIP_DEFAULT_LENGTH',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_ZIP_DEFAULT_LENGTH',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_ZIP_DEFAULT_LENGTH',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GUBINST_NATN_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guainst_EnableKeys()
		{
			
				if ( getItemEnabled("GUBINST_ALUMNI_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_ALUMNI_INSTALLED", true);
					setItemNavigable("GUBINST_ALUMNI_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_BASE_CURR_CODE").equals("FALSE") )
				{
					setItemEnabled("GUBINST_BASE_CURR_CODE", true);
					setItemNavigable("GUBINST_BASE_CURR_CODE", true);
				}
				if ( getItemEnabled("GUBINST_BILCSH_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_BILCSH_INSTALLED", true);
					setItemNavigable("GUBINST_BILCSH_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_CENTURY_PIVOT").equals("FALSE") )
				{
					setItemEnabled("GUBINST_CENTURY_PIVOT", true);
					setItemNavigable("GUBINST_CENTURY_PIVOT", true);
				}
				if ( getItemEnabled("GUBINST_CITY").equals("FALSE") )
				{
					setItemEnabled("GUBINST_CITY", true);
					setItemNavigable("GUBINST_CITY", true);
				}
				if ( getItemEnabled("GUBINST_DATE_DEFAULT_FORMAT").equals("FALSE") )
				{
					setItemEnabled("GUBINST_DATE_DEFAULT_FORMAT", true);
					setItemNavigable("GUBINST_DATE_DEFAULT_FORMAT", true);
				}
				if ( getItemEnabled("GUBINST_FINAID_IND").equals("FALSE") )
				{
					setItemEnabled("GUBINST_FINAID_IND", true);
					setItemNavigable("GUBINST_FINAID_IND", true);
				}
				if ( getItemEnabled("GUBINST_FINAID_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_FINAID_INSTALLED", true);
					setItemNavigable("GUBINST_FINAID_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_FINANCE_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_FINANCE_INSTALLED", true);
					setItemNavigable("GUBINST_FINANCE_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_HUMANRE_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_HUMANRE_INSTALLED", true);
					setItemNavigable("GUBINST_HUMANRE_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_NAME").equals("FALSE") )
				{
					setItemEnabled("GUBINST_NAME", true);
					setItemNavigable("GUBINST_NAME", true);
				}
				if ( getItemEnabled("GUBINST_NATN_CODE").equals("FALSE") )
				{
					setItemEnabled("GUBINST_NATN_CODE", true);
					setItemNavigable("GUBINST_NATN_CODE", true);
				}
				if ( getItemEnabled("GUBINST_OPERATING_SYSTEM_IND").equals("FALSE") )
				{
					setItemEnabled("GUBINST_OPERATING_SYSTEM_IND", true);
					setItemNavigable("GUBINST_OPERATING_SYSTEM_IND", true);
				}
				if ( getItemEnabled("GUBINST_PHONE").equals("FALSE") )
				{
					setItemEnabled("GUBINST_PHONE", true);
					setItemNavigable("GUBINST_PHONE", true);
				}
				if ( getItemEnabled("GUBINST_PHONE_AREA").equals("FALSE") )
				{
					setItemEnabled("GUBINST_PHONE_AREA", true);
					setItemNavigable("GUBINST_PHONE_AREA", true);
				}
				if ( getItemEnabled("GUBINST_PHONE_EXT").equals("FALSE") )
				{
					setItemEnabled("GUBINST_PHONE_EXT", true);
					setItemNavigable("GUBINST_PHONE_EXT", true);
				}
				if ( getItemEnabled("GUBINST_POSBUD_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_POSBUD_INSTALLED", true);
					setItemNavigable("GUBINST_POSBUD_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_STAT_CODE").equals("FALSE") )
				{
					setItemEnabled("GUBINST_STAT_CODE", true);
					setItemNavigable("GUBINST_STAT_CODE", true);
				}
				if ( getItemEnabled("GUBINST_STREET_LINE1").equals("FALSE") )
				{
					setItemEnabled("GUBINST_STREET_LINE1", true);
					setItemNavigable("GUBINST_STREET_LINE1", true);
				}
				if ( getItemEnabled("GUBINST_STREET_LINE2").equals("FALSE") )
				{
					setItemEnabled("GUBINST_STREET_LINE2", true);
					setItemNavigable("GUBINST_STREET_LINE2", true);
				}
				if ( getItemEnabled("GUBINST_STREET_LINE3").equals("FALSE") )
				{
					setItemEnabled("GUBINST_STREET_LINE3", true);
					setItemNavigable("GUBINST_STREET_LINE3", true);
				}
				if ( getItemEnabled("GUBINST_STUDENT_INSTALLED").equals("FALSE") )
				{
					setItemEnabled("GUBINST_STUDENT_INSTALLED", true);
					setItemNavigable("GUBINST_STUDENT_INSTALLED", true);
				}
				if ( getItemEnabled("GUBINST_ZIP").equals("FALSE") )
				{
					setItemEnabled("GUBINST_ZIP", true);
					setItemNavigable("GUBINST_ZIP", true);
				}
				if ( getItemEnabled("GUBINST_ZIP_DEFAULT_LENGTH").equals("FALSE") )
				{
					setItemEnabled("GUBINST_ZIP_DEFAULT_LENGTH", true);
					setItemNavigable("GUBINST_ZIP_DEFAULT_LENGTH", true);
				}
				if ( getItemEnabled("GUBINST_NATN_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("GUBINST_NATN_CODE_LBT", true);
//					setItemNavigable("GUBINST_NATN_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.EDIT_CURR_CODE
		    IF :GUBINST_BASE_CURR_CODE IS NULL  THEN
      MESSAGE ( 'EDIT CURR CODE FAILED' ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GTVCURR_TITLE
         FROM   GTVCURR
         WHERE  GTVCURR_CURR_CODE = :GUBINST_BASE_CURR_CODE
           AND  TRUNC(GTVCURR_RATE_EFF_DATE) <= TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
           AND  (TRUNC(GTVCURR_RATE_TERM_DATE) > TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
            OR  GTVCURR_RATE_TERM_DATE IS NULL)
           AND  (TRUNC(GTVCURR_RATE_NCHG_DATE) > TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
            OR  GTVCURR_RATE_NCHG_DATE IS NULL)
           AND  GTVCURR_STATUS_IND = 'A' ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :CURR_TITLE ;
      IF PTI_CURSOR%NOTFOUND THEN
         MESSAGE(
 G$_NLS.Get('GUAINST-0000', 'FORM','*ERROR* Currency code is not valid at this point in time.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      ELSE
         GOTO TRIGEND ;
      END IF ;
   END ;
--
-- THIS STEP IS NOT EXECUTED SINCE, CURRENTLY, IT IS NOT NECESSARY FOR
--  THE
-- INSTALLATION TO BUILD THIS INFO. SHOULD IT BECOME NECESSARY, CHANGE
--  THE
-- ERROR MESSAGE OF THIS STEP TO NOT SAY 'SEE COMMENT' AND REMOVE THE
-- SUCCESS LABEL ON THE PREVIOUS STEP.                              TM
--  10/31/91
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT gurcurr_conv_rate
         FROM   gurcurr
         WHERE  gurcurr_curr_code = :GUBINST_BASE_CURR_CODE
           AND  TRUNC(gurcurr_rate_eff_date) <= TRUNC(TO_DATE(
              :effdate_eff_date_time, 'yyyymmddhh24miss'))
           AND  (TRUNC(gurcurr_rate_nchg_date) > TRUNC(TO_DATE(
              :effdate_eff_date_time, 'yyyymmddhh24miss'))
            OR  gurcurr_rate_nchg_date IS NULL) ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :hold_conv_rate ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  G$_NLS.Get('GUAINST-0001', 'FORM','*ERROR* Conversion rate is not effective for the currency code. SEE COMMENT')  
         , TRUE)
         ;
   END ;
--
   << TRIGEND >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.EDIT_CURR_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_CURR_CODE")
		public void Guainst_EditCurrCode()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				int rowCount = 0;
				if ( gubinstElement.getGubinstBaseCurrCode().isNull() )
				{
					message("EDIT CURR CODE FAILED");
					throw new ApplicationException();
				}
				{
					String sqlptiCursor = "SELECT GTVCURR_TITLE " +
	" FROM GTVCURR " +
	" WHERE GTVCURR_CURR_CODE = :GUBINST_BASE_CURR_CODE AND TRUNC(GTVCURR_RATE_EFF_DATE) <= TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) AND (TRUNC(GTVCURR_RATE_TERM_DATE) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) OR GTVCURR_RATE_TERM_DATE IS NULL) AND (TRUNC(GTVCURR_RATE_NCHG_DATE) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) OR GTVCURR_RATE_NCHG_DATE IS NULL) AND GTVCURR_STATUS_IND = 'A' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("GUBINST_BASE_CURR_CODE", gubinstElement.getGubinstBaseCurrCode());
						ptiCursor.addParameter("EFFDATE_EFF_DATE_TIME", getFormModel().getFormHeader().getEffdateEffDateTime());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							gubinstElement.setCurrTitle(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("GUAINST-0000"), toStr("FORM"), toStr("*ERROR* Currency code is not valid at this point in time.")));
							throw new ApplicationException();
						}
						else {
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT gurcurr_conv_rate " +
	" FROM gurcurr " +
	" WHERE gurcurr_curr_code = :GUBINST_BASE_CURR_CODE AND TRUNC(gurcurr_rate_eff_date) <= TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'yyyymmddhh24miss')) AND (TRUNC(gurcurr_rate_nchg_date) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'yyyymmddhh24miss')) OR gurcurr_rate_nchg_date IS NULL) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("GUBINST_BASE_CURR_CODE", gubinstElement.getGubinstBaseCurrCode());
						ptiCursor.addParameter("EFFDATE_EFF_DATE_TIME", getFormModel().getFormHeader().getEffdateEffDateTime());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setHoldConvRate(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAINST-0001"), toStr("FORM"), toStr("*ERROR* Conversion rate is not effective for the currency code. SEE COMMENT")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.DISABLE_KEYS
		    SET_ITEM_PROPERTY('GUBINST_ALUMNI_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_BASE_CURR_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_BILCSH_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_CENTURY_PIVOT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_CITY',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_DATE_DEFAULT_FORMAT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_FINAID_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_FINAID_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_FINANCE_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_HUMANRE_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_NAME',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_OPERATING_SYSTEM_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_PHONE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_PHONE_AREA',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_PHONE_EXT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_POSBUD_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_STAT_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE1',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE2',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_STREET_LINE3',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_STUDENT_INSTALLED',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_ZIP',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_ZIP_DEFAULT_LENGTH',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GUBINST_NATN_CODE_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guainst_DisableKeys()
		{
				setItemEnabled("GUBINST_ALUMNI_INSTALLED", false);
				setItemEnabled("GUBINST_BASE_CURR_CODE", false);
				setItemEnabled("GUBINST_BILCSH_INSTALLED", false);
				setItemEnabled("GUBINST_CENTURY_PIVOT", false);
				setItemEnabled("GUBINST_CITY", false);
				setItemEnabled("GUBINST_DATE_DEFAULT_FORMAT", false);
				setItemEnabled("GUBINST_FINAID_IND", false);
				setItemEnabled("GUBINST_FINAID_INSTALLED", false);
				setItemEnabled("GUBINST_FINANCE_INSTALLED", false);
				setItemEnabled("GUBINST_HUMANRE_INSTALLED", false);
				setItemEnabled("GUBINST_NAME", false);
				setItemEnabled("GUBINST_NATN_CODE", false);
				setItemEnabled("GUBINST_OPERATING_SYSTEM_IND", false);
				setItemEnabled("GUBINST_PHONE", false);
				setItemEnabled("GUBINST_PHONE_AREA", false);
				setItemEnabled("GUBINST_PHONE_EXT", false);
				setItemEnabled("GUBINST_POSBUD_INSTALLED", false);
				setItemEnabled("GUBINST_STAT_CODE", false);
				setItemEnabled("GUBINST_STREET_LINE1", false);
				setItemEnabled("GUBINST_STREET_LINE2", false);
				setItemEnabled("GUBINST_STREET_LINE3", false);
				setItemEnabled("GUBINST_STUDENT_INSTALLED", false);
				setItemEnabled("GUBINST_ZIP", false);
				setItemEnabled("GUBINST_ZIP_DEFAULT_LENGTH", false);
				setItemEnabled("GUBINST_NATN_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.WHEN-NEW-FORM-INSTANCE
		    :GLOBAL.CURRENT_ITEM := '';
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   :QRY_CHG_IND := 'Q' ;
   EXECUTE_QUERY ;
   :QRY_CHG_IND := 'C' ;
   :GUBINST_GENERAL_INSTALLED := 'Y';
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guainst_TaskStarted(EventObject args)
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				setGlobal("CURRENT_ITEM", toStr(""));
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setQryChgInd(toStr("Q"));
				executeQuery();
				getFormModel().getFormHeader().setQryChgInd(toStr("C"));
				gubinstElement.setGubinstGeneralInstalled(toStr("Y"));
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-PRVREC
		   G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guainst_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-PRVBLK
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'GUBINST_1_CANVAS' THEN
	GO_ITEM('GUBINST_ALUMNI_INSTALLED');
ELSE
  GO_ITEM(:save_item);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guainst_PreviousBlock()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("GUBINST_1_CANVAS") )
				{
					goItem(toStr("GUBINST_ALUMNI_INSTALLED"));
				}
				else {
					goItem(getFormModel().getFormHeader().getSaveItem());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-NXTREC
		   G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guainst_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-NXTKEY
		    :WORKFLD := :SYSTEM.CURRENT_ITEM ;
   :WORKFLD := RPAD(SUBSTR(:WORKFLD, 1, 8), 12, 'CODE') ;
--
   :GLOBAL.VALUE := NAME_IN( NAME_IN( 'WORKFLD' ) ) ;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guainst_KeyNxtkey()
		{
				getFormModel().getFormHeader().setWorkfld(toStr(getCurrentItem()));
				getFormModel().getFormHeader().setWorkfld(toStr(rpad(substring(getFormModel().getFormHeader().getWorkfld(), toInt(1), toInt(8)), 12, "CODE")));
				setGlobal("VALUE", getNameIn(getNameIn("WORKFLD")));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-NXTBLK
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'GUBINST_1_CANVAS' THEN
	GO_ITEM('GUBINST_ALUMNI_INSTALLED');
ELSE
  GO_ITEM(:save_item);
END IF;
		*/
		/*
		 *<p>
		 *The next block key has been disabled.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guainst_NextBlock()
		{
				if ( getItemCanvas(getCursorItem()).equals("GUBINST_1_CANVAS") )
				{
					goItem(toStr("GUBINST_ALUMNI_INSTALLED"));
				}
				else {
					goItem(getFormModel().getFormHeader().getSaveItem());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-DELREC
		    IF :GUBINST_KEY = 'INST' THEN
      MESSAGE(  G$_NLS.Get('GUAINST-0002', 'FORM','*ERROR* Cannot delete the INST row.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   ELSE
      DELETE_RECORD ;
      G$_CHECK_VALUE (NOT FORM_SUCCESS, G$_NLS.Get('GUAINST-0003', 'FORM','*ERROR* Cannot delete the INST row.') , TRUE);
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Guainst_DeleteRecord()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				if ( gubinstElement.getGubinstKey().equals("INST") )
				{
					errorMessage(GNls.Fget(toStr("GUAINST-0002"), toStr("FORM"), toStr("*ERROR* Cannot delete the INST row.")));
					throw new ApplicationException();
				}
				else {
					deleteRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guainst_Exit()
		{
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.KEY-CLRFRM
		   GO_ITEM('GUBINST_NAME');
  CLEAR_FORM ;
  EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
  G$_CHECK_FAILURE ;
  :QRY_CHG_IND := 'Q' ;
   EXECUTE_QUERY ;
  G$_CHECK_FAILURE ;
  :QRY_CHG_IND := 'C' ;
  :GUBINST_GENERAL_INSTALLED := 'Y';
  :GLOBAL.CURRENT_ITEM := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guainst_ClearTask()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				goItem(toStr("GUBINST_NAME"));
				clearTask();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setQryChgInd(toStr("Q"));
				executeQuery();
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setQryChgInd(toStr("C"));
				gubinstElement.setGubinstGeneralInstalled(toStr("Y"));
				setGlobal("CURRENT_ITEM", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAINST.POST_FORM_TRG
		 BEGIN
   ERASE('GLOBAL.CURRENT_ITEM');
   :GLOBAL.SECRSYS := 'Y';
   :GLOBAL.ZIP_DEFAULT_LENGTH := :GUBINST_ZIP_DEFAULT_LENGTH ;
   :GLOBAL.CENTURY_PIVOT := :GUBINST_CENTURY_PIVOT ;
   :GLOBAL.DATE_DEFAULT_FORMAT := :GUBINST_DATE_DEFAULT_FORMAT ;
   :GLOBAL.MAX_NO_FORMS := TO_CHAR(:GUBINST_MAX_OPEN_FORMS);
   :GLOBAL.OPSYS := :GUBINST_OPERATING_SYSTEM_IND ;
   :GLOBAL.INSTITUTION := :GUBINST_NAME ;
   :GLOBAL.STUSYS := NVL(:GUBINST_STUDENT_INSTALLED,'N') ;
   :GLOBAL.ALUSYS := NVL(:GUBINST_ALUMNI_INSTALLED,'N') ;
   :GLOBAL.FINSYS := NVL(:GUBINST_FINANCE_INSTALLED,'N') ;
   :GLOBAL.HRESYS := NVL(:GUBINST_HUMANRE_INSTALLED,'N') ;
   :GLOBAL.CRTSYS := NVL(:GUBINST_COURTS_INSTALLED,'N') ;
   :GLOBAL.POSBUD := NVL(:GUBINST_POSBUD_INSTALLED,'N') ;
   :GLOBAL.BILCSH := NVL(:GUBINST_BILCSH_INSTALLED,'N') ;
   :GLOBAL.RESSYS := NVL(:GUBINST_FINAID_INSTALLED,'N') ;
   :GLOBAL.UTLSYS := NVL(:GUBINST_UTILITIES_INSTALLED,'N') ;
   :GLOBAL.BPISYS := NVL(:GUBINST_PTAX_INSTALLED,'N'); 
   :GLOBAL.LIMSYS := NVL(:GUBINST_OCCTAX_INSTALLED,'N'); 
   :GLOBAL.XRISYS := NVL(:GUBINST_RECORDS_INSTALLED,'N'); 
   :GLOBAL.DCRSYS := NVL(:GUBINST_CASHREC_INSTALLED,'N'); 
   :GLOBAL.INST   := :GUBINST_INSTANCE_NAME;
   :GLOBAL.SQLTRACE_ENABLED_IND := :GUBINST_SQLTRACE_ENABLED_IND;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAINST.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guainst_PostFormTrg()
		{
				GubinstAdapter gubinstElement = (GubinstAdapter)this.getFormModel().getGubinst().getRowAdapter(true);
				if (gubinstElement == null) {
					return;
				}
				removeGlobal("GLOBAL.CURRENT_ITEM");
				setGlobal("SECRSYS", toStr("Y"));
				setGlobal("ZIP_DEFAULT_LENGTH", toStr(gubinstElement.getGubinstZipDefaultLength()));
				setGlobal("CENTURY_PIVOT", toStr(gubinstElement.getGubinstCenturyPivot()));
				setGlobal("DATE_DEFAULT_FORMAT", toStr(gubinstElement.getGubinstDateDefaultFormat()));
				setGlobal("MAX_NO_FORMS", toChar(gubinstElement.getGubinstMaxOpenForms()));
				setGlobal("OPSYS", gubinstElement.getGubinstOperatingSystemInd());
				setGlobal("INSTITUTION", gubinstElement.getGubinstName());
				setGlobal("STUSYS", isNull(gubinstElement.getGubinstStudentInstalled(), "N"));
				setGlobal("ALUSYS", isNull(gubinstElement.getGubinstAlumniInstalled(), "N"));
				setGlobal("FINSYS", isNull(gubinstElement.getGubinstFinanceInstalled(), "N"));
				setGlobal("HRESYS", isNull(gubinstElement.getGubinstHumanreInstalled(), "N"));
				setGlobal("CRTSYS", isNull(gubinstElement.getGubinstCourtsInstalled(), "N"));
				setGlobal("POSBUD", isNull(gubinstElement.getGubinstPosbudInstalled(), "N"));
				setGlobal("BILCSH", isNull(gubinstElement.getGubinstBilcshInstalled(), "N"));
				setGlobal("RESSYS", isNull(gubinstElement.getGubinstFinaidInstalled(), "N"));
				setGlobal("UTLSYS", isNull(gubinstElement.getGubinstUtilitiesInstalled(), "N"));
				setGlobal("BPISYS", isNull(gubinstElement.getGubinstPtaxInstalled(), "N"));
				setGlobal("LIMSYS", isNull(gubinstElement.getGubinstOcctaxInstalled(), "N"));
				setGlobal("XRISYS", isNull(gubinstElement.getGubinstRecordsInstalled(), "N"));
				setGlobal("DCRSYS", isNull(gubinstElement.getGubinstCashrecInstalled(), "N"));
				setGlobal("INST", gubinstElement.getGubinstInstanceName());
				setGlobal("SQLTRACE_ENABLED_IND", gubinstElement.getGubinstSqltraceEnabledInd());
			}

		
	
}
	
