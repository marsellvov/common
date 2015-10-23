package net.hedtech.banner.general.common.Guiobjs.controller;
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
import net.hedtech.banner.general.common.Guiobjs.model.*;
import net.hedtech.banner.general.common.Guiobjs.*;
import net.hedtech.banner.general.common.Guiobjs.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class GuiobjsFormController<MenuItemDescriptor> extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public GuiobjsFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuiobjsTask getTask() {
		return (GuiobjsTask)super.getTask();
	}
	
	
	public GuiobjsModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guiobjs_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guiobjs_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guiobjs_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guiobjs_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guiobjs_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guiobjs_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guiobjs_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guiobjs_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guiobjs_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guiobjs_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guiobjs_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guiobjs_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guiobjs_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guiobjs_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guiobjs_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guiobjs_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guiobjs_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guiobjs_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guiobjs_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guiobjs_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guiobjs_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guiobjs_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guiobjs_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.WHEN-TIMER-EXPIRED
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
		 * GUIOBJS.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guiobjs_WhenTimerExpired(NString timerName)
		{
			
				getTask().getGoqrpls().gTimerExp(timerName);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guiobjs_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guiobjs_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guiobjs_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guiobjs_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guiobjs_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guiobjs_MoveDown()
		{
			
				getGFormClass().moveDown();
				
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guiobjs_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guiobjs_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guiobjs_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guiobjs_NextRecord()
		{
			
				getGFormClass().nextRecord();
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guiobjs_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guiobjs_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guiobjs_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guiobjs_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guiobjs_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guiobjs_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guiobjs_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guiobjs_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guiobjs_EnableKeys()
		{
			
				getGFormClass().enableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guiobjs_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guiobjs_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guiobjs_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guiobjs_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Guiobjs_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Guiobjs_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Guiobjs_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Guiobjs_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Guiobjs_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Guiobjs_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guiobjs_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guiobjs_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.WHEN_WINDOW_ACTIVATED_TRG
		 IF :SYSTEM.EVENT_WINDOW IS NOT NULL AND
   :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guiobjs_WhenWindowActivatedTrg()
		{
			
				if ( (getCurrentWindow()) != null && getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-NXTKEY
		 :GLOBAL.VALUE := :GUBOBJS_NAME;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guiobjs_KeyNxtkey()
		{
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);
				if(gubobjsElement == null){
					return;
				}

				setGlobal("VALUE", gubobjsElement.getGubobjsName());
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-EXIT
		 :GLOBAL.VALUE := '';
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guiobjs_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
  GO_BLOCK('GUBOBJS');
  DO_KEY('ENTER_QUERY');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guiobjs_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				goBlock(toStr("GUBOBJS"));
				executeAction("SEARCH");
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-CLRFRM
		 BEGIN
  CLEAR_FORM;
  ENTER_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guiobjs_ClearTask()
		{
			
				clearTask();
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-CQUERY
		 BEGIN
  EXECUTE_TRIGGER('EXIT_WITH_VALUE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-CQUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void Guiobjs_TotalResults()
		{
			
				executeAction("EXIT_WITH_VALUE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-ENTQRY
		 BEGIN
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN',Enabled,Property_False);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN',Enabled,Property_False);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN',Enabled,Property_False);
  ENTER_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guiobjs_Search()
		{
			
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN", false);
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-EXEQRY
		 DECLARE
  MI_ID MENUITEM;
BEGIN 
  EXECUTE_QUERY;
  IF FORM_SUCCESS THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN',Enabled,Property_True);
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN',Enabled,Property_True);
    G$_GUAMENU_CHECK_SET('');
--
    IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAPMNU' OR
       GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUTPMNU' OR
       GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUTGMNU' OR
       GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAQUIK' OR
-- 54-1 added following form to allow return of user startup menu
       GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAUPRF' OR
       GET_APPLICATION_PROPERTY(CALLING_FORM) IS NULL THEN
      MI_ID := FIND_MENU_ITEM('Action.Select');
      IF NOT ID_NULL(MI_ID) THEN
        SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE);
      END IF;
--
      G$_SETITEM('BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN',0);
      G$_SETITEM('BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN',1);
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public <MenuItemDescriptor> void Guiobjs_ExecuteQuery()
		{
			
				
					MenuItemDescriptor miId= null;
					executeQuery();
					try{
					
						setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN", true);
						setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN", true);
						getTask().getGoqrpls().gGuamenuCheckSet(toStr(""));
						if ( getParentTaskName().equals("GUAPMNU") || getParentTaskName().equals("GUTPMNU") || getParentTaskName().equals("GUTGMNU") || getParentTaskName().equals("GUAQUIK") || getParentTaskName().equals("GUAUPRF") || (getParentTaskName()) == null )
						{
							if ( !(miId == null) )
							{
								setMenuItemEnabled("Action.Select", true);
							}
							// 
							getTask().getGoqrpls().gSetitem(toStr("BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN"), toNumber(0));
							getTask().getGoqrpls().gSetitem(toStr("BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN"), toNumber(1));
						}
					}
					catch (ApplicationException e)
					{ 
						throw new ApplicationException();
					}
					    
			
				}
		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-NXTSET
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guiobjs_KeyNxtset()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-PRVBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guiobjs_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-NXTBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guiobjs_NextBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-SCRDOWN
		 SCROLL_DOWN;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guiobjs_KeyScrdown()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.KEY-SCRUP
		 SCROLL_UP;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guiobjs_KeyScrup()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.CALL_ROUTINE
		 DECLARE
  AL_BUTTON number;
  OBJS_DESC varchar2(80);
  CHAR1     VARCHAR2(1);
  WRK_FLD   VARCHAR2(1);
BEGIN
  :GLOBAL.NEW_FORM := :GUBOBJS_NAME;
  :GLOBAL.FORM_NAME := :GUBOBJS_NAME;
  :GLOBAL.MENU_NAME_PARM := '';
--
  :GLOBAL.CALLING_FORM := 'GUIOBJS';
--
-- Make sure a form with a Q in the third position isn't called.
--
  IF :GUBOBJS_OBJT_CODE = 'FORM' THEN
    WRK_FLD := SUBSTR(:GUBOBJS_NAME,1,1);
    IF NVL(LENGTH(:GUBOBJS_NAME), 0) = 8 THEN
      CHAR1 := SUBSTR(:GUBOBJS_NAME,4,1);
    ELSE
      CHAR1 := SUBSTR(:GUBOBJS_NAME,3,1);
    END IF;
--
    IF CHAR1 = 'Q' THEN
      MESSAGE(G$_NLS.Get('GUIOBJS-0009','FORM','*ERROR* Invalid form name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
-- Do not allow calls to GUAINIT AND GUAGMNU since they are already running
--
   IF :GLOBAL.NEW_FORM = 'GUAGMNU' THEN
      MESSAGE(G$_NLS.Get('GUIOBJS-0011','FORM','*ERROR* GUAGMNU is already running, exit GUIOBJS to view this Menu.'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
   IF :GLOBAL.NEW_FORM = 'GUAINIT' THEN
      MESSAGE(G$_NLS.Get('GUIOBJS-0013','FORM','*ERROR* GUAINIT has already been run for this session of Banner.'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
--
  IF :GLOBAL.CALLFRM IS NULL THEN
--
-- Determine the type of object we are about to call.
--
    IF :GUBOBJS_OBJT_CODE = 'JOBS' THEN
      :GLOBAL.KEY_JOB_NAME := :GLOBAL.NEW_FORM;
      :GLOBAL.NEW_FORM := 'GJAPCTL';
    ELSIF :GUBOBJS_OBJT_CODE = 'QUICKFLOW' THEN
      :GLOBAL.KEY_CALL_CODE := :GLOBAL.NEW_FORM;
      :GLOBAL.NEW_FORM := 'GUAQFLW';
    ELSIF :GUBOBJS_OBJT_CODE = 'MENU' THEN
      :GLOBAL.MENU_NAME_PARM := :GUBOBJS_NAME;
      RETURN;
    ELSIF :GUBOBJS_OBJT_CODE = 'MESSAGE' THEN
      SET_ALERT_PROPERTY('G$_BANNER_ALERT',ALERT_MESSAGE_TEXT,
          G$_NLS.Get('GUIOBJS-0020','FORM','Please use desktop or web application to complete this activity.  These applications may be accessible through your SCT Banner toolbar.'));
      AL_BUTTON := SHOW_ALERT('G$_BANNER_ALERT');
      RETURN;
    ELSE
      NULL;
    END IF;
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:global.current_user,:global.NEW_FORM,'');
--
    :GLOBAL.KEY_CALL_CODE := '';
    :GLOBAL.WIN_TITLE := '';
    :GLOBAL.WIN_X_POS := '';
    :GLOBAL.WIN_Y_POX := '';
--
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.CALL_ROUTINE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_ROUTINE")
		public void Guiobjs_CallRoutine()
		{
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);
				if(gubobjsElement == null){
					return;
				}
				{
					NNumber alButton= NNumber.getNull();
					NString objsDesc= NString.getNull();
					NString char1= NString.getNull();
					NString wrkFld= NString.getNull();
					setGlobal("NEW_FORM", gubobjsElement.getGubobjsName());
					setGlobal("FORM_NAME", gubobjsElement.getGubobjsName());
					setGlobal("MENU_NAME_PARM", toStr(""));
					setGlobal("CALLING_FORM", toStr("GUIOBJS"));
					if ( gubobjsElement.getGubobjsObjtCode().equals("FORM") )
					{
						wrkFld = substring(gubobjsElement.getGubobjsName(), toInt(1), toInt(1));
						if ( isNull(length(gubobjsElement.getGubobjsName()), 0).equals(8) )
						{
							char1 = substring(gubobjsElement.getGubobjsName(), toInt(4), toInt(1));
						}
						else {
							char1 = substring(gubobjsElement.getGubobjsName(), toInt(3), toInt(1));
						}
						if ( char1.equals("Q") )
						{
							errorMessage(GNls.Fget(toStr("GUIOBJS-0009"), toStr("FORM"), toStr("*ERROR* Invalid form name entered.")));
							throw new ApplicationException();
						}
					}
					if ( getGlobal("NEW_FORM").equals("GUAGMNU") )
					{
						errorMessage(GNls.Fget(toStr("GUIOBJS-0011"), toStr("FORM"), toStr("*ERROR* GUAGMNU is already running, exit GUIOBJS to view this Menu.")));
						throw new ApplicationException();
					}
					if ( getGlobal("NEW_FORM").equals("GUAINIT") )
					{
						errorMessage(GNls.Fget(toStr("GUIOBJS-0013"), toStr("FORM"), toStr("*ERROR* GUAINIT has already been run for this session of Banner.")));
						throw new ApplicationException();
					}
					if ( getGlobal("CALLFRM").isNull() )
					{
						if ( gubobjsElement.getGubobjsObjtCode().equals("JOBS") )
						{
							setGlobal("KEY_JOB_NAME", getGlobal("NEW_FORM"));
							setGlobal("NEW_FORM", toStr("GJAPCTL"));
						}
						else if ( gubobjsElement.getGubobjsObjtCode().equals("QUICKFLOW") ) {
							setGlobal("KEY_CALL_CODE", getGlobal("NEW_FORM"));
							setGlobal("NEW_FORM", toStr("GUAQFLW"));
						}
						else if ( gubobjsElement.getGubobjsObjtCode().equals("MENU") ) {
							setGlobal("MENU_NAME_PARM", gubobjsElement.getGubobjsName());
							return ;
						}
						else if ( gubobjsElement.getGubobjsObjtCode().equals("MESSAGE") ) {
							setAlertMessageText("G$_BANNER_ALERT", GNls.Fget(toStr("GUIOBJS-0020"), toStr("FORM"), toStr("Please use desktop or web application to complete this activity.  These applications may be accessible through your SCT Banner toolbar.")));
							alButton = toNumber(showAlert("G$_BANNER_ALERT"));
							return ;
						}
						else {
						}
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("NEW_FORM"), toStr(""));
						setGlobal("KEY_CALL_CODE", toStr(""));
						setGlobal("WIN_TITLE", toStr(""));
						setGlobal("WIN_X_POS", toStr(""));
						setGlobal("WIN_Y_POX", toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUIOBJS.EXIT_WITH_VALUE
		 DECLARE
  MI_ID MENUITEM;
BEGIN 
  MI_ID := FIND_MENU_ITEM('Action.Select');
  IF NOT ID_NULL(MI_ID) THEN
    IF GET_MENU_ITEM_PROPERTY(MI_ID,ENABLED) = 'TRUE' THEN
      -- exit with value logic
      :GLOBAL.VALUE := :GUBOBJS_NAME;
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    END IF;
  END IF;
--
  MI_ID := FIND_MENU_ITEM('Action.Object_Search');
  IF NOT ID_NULL(MI_ID) THEN
    IF GET_MENU_ITEM_PROPERTY(MI_ID,ENABLED) = 'TRUE' THEN
      -- start logic
      HIDE_WINDOW('MAIN_WINDOW');
      EXECUTE_TRIGGER('CALL_ROUTINE');
      G$_CHECK_FAILURE;
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.EXIT_WITH_VALUE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EXIT_WITH_VALUE")
		public void Guiobjs_ExitWithValue()
		{
			
				GubobjsAdapter gubobjsElement = (GubobjsAdapter)this.getFormModel().getGubobjs().getRowAdapter(true);
				if(gubobjsElement == null){
					return;
				}
				if (gubobjsElement==null) 
					return;
				
				
				if ( ! getGlobal("SELECTFRM").equals("GUIOBJS") )
				{
					setGlobal("VALUE", gubobjsElement.getGubobjsName());
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}else{
					hideWindow("MAIN_WINDOW");
					executeAction("CALL_ROUTINE");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
				
				
				
			}

//		
//		private Object getMenuItemEnabled(MenuItemDescriptor miId) {
//			// TODO Auto-generated method stub
//			return null;
//		}
		/* Original PL/SQL code code for TRIGGER GUIOBJS.PRE_FORM_TRG
		 DECLARE
  MI_ID MENUITEM;
  hold varchar(20);
BEGIN 
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN',Enabled,Property_False);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN',Enabled,Property_False);
--
  IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUTPMNU' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUTGMNU' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAQUIK' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAPMNU' OR
     -- 54-1
     GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAUPRF' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) IS NULL THEN
    MI_ID := FIND_MENU_ITEM('Action.Select');
    IF NOT ID_NULL(MI_ID) THEN
      SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE);
    END IF;
--
    MI_ID := FIND_MENU_ITEM('Action.Object_Search');
    IF NOT ID_NULL(MI_ID) THEN
      SET_MENU_ITEM_PROPERTY('Action.Object_Search',ENABLED,PROPERTY_FALSE);
    END IF;
--
  ELSE
    SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_FALSE);
    IF GET_APPLICATION_PROPERTY(CALLING_FORM) <> 'GUAGMNU' AND 
       GET_APPLICATION_PROPERTY(CALLING_FORM) <> 'GUAPARM' THEN
         DELETE_LIST_ELEMENT('GUBOBJS.GUBOBJS_OBJT_CODE',5);
    END IF; 
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUIOBJS.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guiobjs_PreFormTrg()
		{
			
				{
					MenuItemDescriptor miId= null;
					NString hold= NString.getNull();
					setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN", false);
					setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN", false);
					if ( getParentTaskName().equals("GUTPMNU") || getParentTaskName().equals("GUTGMNU") || getParentTaskName().equals("GUAQUIK") || getParentTaskName().equals("GUAPMNU") || getParentTaskName().equals("GUAUPRF") || (getParentTaskName()) == null )
					{
						if ( !(miId == null) )
						{
							setMenuItemEnabled("Action.Select", true);
						}
						if ( !(miId == null) )
						{
							setMenuItemEnabled("Action.Object_Search", false);
						}
					}
					else {
						setMenuItemEnabled("Action.Select", false);
						if ( getParentTaskName().notEquals("GUAGMNU") && getParentTaskName().notEquals("GUAPARM") )
						{
							deleteListElement("GUBOBJS.GUBOBJS_OBJT_CODE", 5);
						}
					}
				}
			}

		
	
}
	
