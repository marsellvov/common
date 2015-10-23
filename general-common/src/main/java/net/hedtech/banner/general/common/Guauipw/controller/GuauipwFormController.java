package net.hedtech.banner.general.common.Guauipw.controller;
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
import net.hedtech.banner.general.common.Guauipw.model.*;
import net.hedtech.banner.general.common.Guauipw.*;
import net.hedtech.banner.general.common.Guauipw.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GuauipwFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GuauipwFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuauipwTask getTask() {
		return (GuauipwTask)super.getTask();
	}
	
	
	public GuauipwModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guauipw_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guauipw_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guauipw_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guauipw_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guauipw_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guauipw_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guauipw_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guauipw_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guauipw_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guauipw_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guauipw_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guauipw_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guauipw_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guauipw_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guauipw_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guauipw_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guauipw_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guauipw_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guauipw_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guauipw_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guauipw_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guauipw_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guauipw_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guauipw_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guauipw_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guauipw_ClearTask()
		{
			
				getGFormClass().clearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guauipw_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guauipw_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guauipw_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guauipw_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guauipw_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guauipw_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guauipw_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guauipw_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guauipw_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guauipw_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guauipw_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guauipw_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guauipw_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guauipw_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guauipw_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guauipw_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guauipw_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guauipw_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guauipw_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guauipw_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guauipw_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guauipw_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guauipw_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guauipw_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guauipw_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guauipw_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guauipw_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.2';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guauipw_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.WHEN-WINDOW-CLOSED
		 BEGIN
IF :SYSTEM.EVENT_WINDOW = 'GUAUIPW_WINDOW' THEN
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guauipw_WhenWindowClosed()
		{
			
				if ( getCurrentWindow().equals("GUAUIPW_WINDOW") )
				{
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
IF :SYSTEM.EVENT_WINDOW = 'GUAUIPW_WINDOW' THEN 
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
   IF :GLOBAL.WIN_TITLE IS NOT NULL THEN
      SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,:GLOBAL.WIN_TITLE);
   END IF;
ELSE
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guauipw_WhenWindowActivatedTrg()
		{
			
				if ( getCurrentWindow().equals("GUAUIPW_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
					if ( !getGlobal("WIN_TITLE").isNull() )
					{
						setWindowTitle("MAIN_WINDOW", getGlobal("WIN_TITLE"));
					}
				}
				else {
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.RESET_VALUES
		    :GLOBAL.ALT_USER_ID := :HOLD_ALT_USER_ID ;
   :GLOBAL.ALT_PASSWORD := :HOLD_ALT_PASSWORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.RESET_VALUES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="RESET_VALUES")
		public void Guauipw_ResetValues()
		{
			
				setGlobal("ALT_USER_ID", getFormModel().getFormHeader().getHoldAltUserId());
				setGlobal("ALT_PASSWORD", getFormModel().getFormHeader().getHoldAltPassword());
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.GLOBAL_COPY
		    :CURR_ALT_USER_ID := :GLOBAL.ALT_USER_ID ;
   :CURR_ALT_PASSWORD := :GLOBAL.ALT_PASSWORD ;
   :HOLD_ALT_USER_ID := :GLOBAL.ALT_USER_ID ;
   :HOLD_ALT_PASSWORD := :GLOBAL.ALT_PASSWORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guauipw_GlobalCopy()
		{
			
				getFormModel().getCurrentValues().setCurrAltUserId(getGlobal("ALT_USER_ID"));
				getFormModel().getCurrentValues().setCurrAltPassword(getGlobal("ALT_PASSWORD"));
				getFormModel().getFormHeader().setHoldAltUserId(getGlobal("ALT_USER_ID"));
				getFormModel().getFormHeader().setHoldAltPassword(getGlobal("ALT_PASSWORD"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('CURR_ALT_PASSWORD',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('CURR_ALT_PASSWORD',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('CURR_ALT_PASSWORD',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('CURR_ALT_USER_ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('CURR_ALT_USER_ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('CURR_ALT_USER_ID',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guauipw_EnableKeys()
		{
			
				if ( getItemEnabled("CURR_ALT_PASSWORD").equals("FALSE") )
				{
					setItemEnabled("CURR_ALT_PASSWORD", true);
					setItemNavigable("CURR_ALT_PASSWORD", true);
				}
				if ( getItemEnabled("CURR_ALT_USER_ID").equals("FALSE") )
				{
					setItemEnabled("CURR_ALT_USER_ID", true);
					setItemNavigable("CURR_ALT_USER_ID", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.DISPLAY_ERROR_MSG
		   IF G$_DISPLAY_ALERT('',
 G$_NLS.Get('GUAUIPW-0000', 'FORM','*ERROR* Invalid User ID/Password, Password cleared, retry or EXIT') ) IS NOT NULL
THEN RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.DISPLAY_ERROR_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISPLAY_ERROR_MSG")
		public void Guauipw_DisplayErrorMsg()
		{
			
				if ( !getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GUAUIPW-0000"), toStr("FORM"), toStr("*ERROR* Invalid User ID/Password, Password cleared, retry or EXIT"))).isNull() )
				{
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.DISABLE_KEYS
		    SET_ITEM_PROPERTY('CURR_ALT_PASSWORD',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('CURR_ALT_USER_ID',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guauipw_DisableKeys()
		{
			
				setItemEnabled("CURR_ALT_PASSWORD", false);
				setItemEnabled("CURR_ALT_USER_ID", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.COPY_VALUES
		    :GLOBAL.ALT_USER_ID := :CURR_ALT_USER_ID ;
   :GLOBAL.ALT_PASSWORD := :CURR_ALT_PASSWORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.COPY_VALUES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COPY_VALUES")
		public void Guauipw_CopyValues()
		{
			
				setGlobal("ALT_USER_ID", getFormModel().getCurrentValues().getCurrAltUserId());
				setGlobal("ALT_PASSWORD", getFormModel().getCurrentValues().getCurrAltPassword());
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.CLR_VALUES
		    :GLOBAL.ALT_USER_ID := '' ;
   :GLOBAL.ALT_PASSWORD := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.CLR_VALUES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_VALUES")
		public void Guauipw_ClrValues()
		{
			
				setGlobal("ALT_USER_ID", toStr(""));
				setGlobal("ALT_PASSWORD", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.CLR_PASSWORD
		    :CURR_ALT_PASSWORD := '' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.CLR_PASSWORD
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_PASSWORD")
		public void Guauipw_ClrPassword()
		{
			
				getFormModel().getCurrentValues().setCurrAltPassword(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ; 
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('GUAUIPW-0001', 'FORM','*ERROR* Occurred during KEY-STARTUP procedure') , TRUE);
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('GUAUIPW-0002', 'FORM','*ERROR* Occurred during KEY-STARTUP procedure') , TRUE);
   G$_SET_INST_PROPERTY;
  -- SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,:GLOBAL.WIN_TITLE);
   G$_SET_WIN_PROPERTY;
   SET_MENU_ITEM_PROPERTY('Action.Rollback',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guauipw_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				setMenuItemEnabled("Action.Rollback", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.KEY-OTHERS
		    MESSAGE (
 G$_NLS.Get('GUAUIPW-0003', 'FORM','Undefined function key. Press <Show Keys> for list of valid keys.')  ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-OTHERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-OTHERS")
		public void Guauipw_KeyOthers()
		{
			
				errorMessage(GNls.Fget(toStr("GUAUIPW-0003"), toStr("FORM"), toStr("*ERROR* Undefined Function Key. Press <Show Keys> for list of valid keys.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.KEY-EXIT
		    EXECUTE_TRIGGER( 'RESET_VALUES' ) ;
   G$_CHECK_FAILURE ;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guauipw_Exit()
		{
			
				executeAction("RESET_VALUES");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.KEY-COMMIT
		    IF :CURR_ALT_USER_ID IS NULL  THEN
      MESSAGE(  G$_NLS.Get('GUAUIPW-0004', 'FORM','*ERROR* Alternate User ID and Password must be entered to use this function.')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   ELSE 
   	IF SUBSTR(:CURR_ALT_USER_ID, 1, 4) = 'OPS$' THEN
       MESSAGE(  G$_NLS.Get('GUAUIPW-0005', 'FORM','*ERROR* Cannot enter alternate user id''s that begin with ''OPS$''')   
         );
       RAISE FORM_TRIGGER_FAILURE;
    ELSE
      IF :CURR_ALT_PASSWORD IS NULL  THEN
         MESSAGE(  G$_NLS.Get('GUAUIPW-0006', 'FORM','*ERROR* Alternate User ID and Password must be entered to use this function.')  
             ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      ELSE
         NULL ;
      END IF ;
    END IF;
   END IF ; 
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GJBPSEQ.NEXTVAL
         FROM   DUAL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ONE_UP_NO ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('GUAUIPW-0007', 'FORM','*ERROR* Could not generate sequence number') , TRUE);
   END ;
--
   :GLOBAL.CALL_FORM := '' ;
   :GLOBAL.CALL_DISPLAY_MSG := '' ;
   :GLOBAL.JOB_ID := 'GUAVRFY' ;
   :GLOBAL.ALT_USER_ID := :CURR_ALT_USER_ID ;
-- -- -- --
-- -- -- --
   IF (NAME_IN('GLOBAL.FORMS_USERNAME_CASESENSI') = '1') THEN
     :GLOBAL.ALT_PASSWORD := :CURR_ALT_PASSWORD ;
   ELSE
     :GLOBAL.ALT_PASSWORD := UPPER(:CURR_ALT_PASSWORD) ;
   END IF;
-- -- -- --
-- -- -- --
   :GLOBAL.ONE_UP_NO := :ONE_UP_NO ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'GUQINTF','QUERY');
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('GUAUIPW-0008', 'FORM','*ERROR* Occurred during verification process') , TRUE);
--
   IF :GLOBAL.CALL_ERROR = 'Y' THEN
      EXECUTE_TRIGGER( 'CLR_PASSWORD' ) ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'DISPLAY_ERROR_MSG' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      :UIPW_VALIDATED := 'Y' ;
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Guauipw_Save()
		{
			
				int rowCount = 0;
				if ( getFormModel().getCurrentValues().getCurrAltUserId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUAUIPW-0004"), toStr("FORM"), toStr("*ERROR* Alternate User ID and Password must be entered to use this function.")));
					throw new ApplicationException();
				}
				else {
					if ( substring(getFormModel().getCurrentValues().getCurrAltUserId(), toInt(1), toInt(4)).equals("OPS$") )
					{
						errorMessage(GNls.Fget(toStr("GUAUIPW-0005"), toStr("FORM"), toStr("*ERROR* Cannot enter alternate user id's that begin with 'OPS$'")));
						throw new ApplicationException();
					}
					else {
						if ( getFormModel().getCurrentValues().getCurrAltPassword().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GUAUIPW-0006"), toStr("FORM"), toStr("*ERROR* Alternate User ID and Password must be entered to use this function.")));
							throw new ApplicationException();
						}
						else {
						}
					}
				}
				{
					String sqlptiCursor = "SELECT GJBPSEQ.NEXTVAL " +
	" FROM DUAL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getFormHeader().setOneUpNo(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAUIPW-0007"), toStr("FORM"), toStr("*ERROR* Could not generate sequence number")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				setGlobal("CALL_FORM", toStr(""));
				setGlobal("CALL_DISPLAY_MSG", toStr(""));
				setGlobal("JOB_ID", toStr("GUAVRFY"));
				setGlobal("ALT_USER_ID", getFormModel().getCurrentValues().getCurrAltUserId());
				if ((getNameIn("GLOBAL.FORMS_USERNAME_CASESENSI").equals("1")))
				{
					setGlobal("ALT_PASSWORD", getFormModel().getCurrentValues().getCurrAltPassword());
				}
				else {
					setGlobal("ALT_PASSWORD", upper(getFormModel().getCurrentValues().getCurrAltPassword()));
				}
				setGlobal("ONE_UP_NO", toStr(getFormModel().getFormHeader().getOneUpNo()));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUQINTF"), toStr("QUERY"));
				if ( getGlobal("CALL_ERROR").equals("Y") )
				{
					executeAction("CLR_PASSWORD");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("DISPLAY_ERROR_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					getFormModel().getFormHeader().setUipwValidated(toStr("Y"));
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAUIPW.POST_FORM_TRG
		 BEGIN
   IF :CURR_ALT_USER_ID IS NULL  THEN
      IF :CURR_ALT_PASSWORD IS NULL  THEN
         EXECUTE_TRIGGER( 'RESET_VALUES' ) ;
         G$_CHECK_FAILURE ;
      ELSE
         EXECUTE_TRIGGER( 'CLR_VALUES' ) ;
         G$_CHECK_FAILURE ;
      END IF ;
   ELSE
      IF :CURR_ALT_PASSWORD IS NULL  THEN
         EXECUTE_TRIGGER( 'CLR_VALUES' ) ;
         G$_CHECK_FAILURE ;
      ELSE
         IF :UIPW_VALIDATED = 'Y' THEN
            EXECUTE_TRIGGER( 'COPY_VALUES' ) ;
            G$_CHECK_FAILURE ;
         ELSE
            EXECUTE_TRIGGER( 'CLR_VALUES' ) ;
            G$_CHECK_FAILURE ;
         END IF ;
      END IF ;
   END IF ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAUIPW.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guauipw_PostFormTrg()
		{
			
				if ( getFormModel().getCurrentValues().getCurrAltUserId().isNull() )
				{
					if ( getFormModel().getCurrentValues().getCurrAltPassword().isNull() )
					{
						executeAction("RESET_VALUES");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("CLR_VALUES");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				else {
					if ( getFormModel().getCurrentValues().getCurrAltPassword().isNull() )
					{
						executeAction("CLR_VALUES");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						if ( getFormModel().getFormHeader().getUipwValidated().equals("Y") )
						{
							executeAction("COPY_VALUES");
							getTask().getGoqrpls().gCheckFailure();
						}
						else {
							executeAction("CLR_VALUES");
							getTask().getGoqrpls().gCheckFailure();
						}
					}
				}
			}

		
	
}
	
