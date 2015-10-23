package net.hedtech.banner.student.common.Soisbgi.controller;

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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.student.common.Soisbgi.model.*;
import net.hedtech.banner.student.common.Soisbgi.*;
import net.hedtech.banner.student.common.Soisbgi.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class SoisbgiFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public SoisbgiFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SoisbgiTask getTask() {
		return (SoisbgiTask)super.getTask();
	}
	
	
	public SoisbgiModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Soisbgi_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Soisbgi_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Soisbgi_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Soisbgi_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Soisbgi_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Soisbgi_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Soisbgi_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Soisbgi_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Soisbgi_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Soisbgi_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Soisbgi_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Soisbgi_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Soisbgi_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Soisbgi_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Soisbgi_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Soisbgi_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Soisbgi_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Soisbgi_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Soisbgi_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Soisbgi_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Soisbgi_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Soisbgi_WhenNewBlockInstanceTrg()
		{
			
			getGFormClass().whenNewBlockInstanceTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Soisbgi_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Soisbgi_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Soisbgi_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Soisbgi_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Soisbgi_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Soisbgi_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Soisbgi_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Soisbgi_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Soisbgi_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Soisbgi_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Soisbgi_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Soisbgi_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Soisbgi_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Soisbgi_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Soisbgi_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Soisbgi_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Soisbgi_GlobalCopy()
		{
			
			getGFormClass().globalCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Soisbgi_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Soisbgi_LoadFormHeader()
		{
			
			getGFormClass().loadFormHeader();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Soisbgi_SaveKeys()
		{
			
			getGFormClass().saveKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Soisbgi_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Soisbgi_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Soisbgi_CheckKeys()
		{
			
			getGInqFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Soisbgi_ClearRecord()
		{
			
			getGInqFormClass().clearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Soisbgi_Save()
		{
			
			getGInqFormClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Soisbgi_CreateRecord()
		{
			
			getGInqFormClass().createRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Soisbgi_DeleteRecord()
		{
			
			getGInqFormClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Soisbgi_KeyDupItem()
		{
			
			getGInqFormClass().keyDupItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Soisbgi_CopyRecord()
		{
			
			getGInqFormClass().copyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Soisbgi_recordChange()
		{
			
			getGInqFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Soisbgi_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-CLRFRM
		 :GLOBAL.VALUE := 'KEY-CLRFRM';
   EXECUTE_TRIGGER('SAVE_KEYS');
   G$_CHECK_FAILURE;
 --  EXECUTE_TRIGGER('ENABLE_KEYS');
 --  G$_CHECK_FAILURE;
   CLEAR_FORM;
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('LOAD_FORM_HEADER');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('GLOBAL_COPY');
   G$_CHECK_FAILURE;
SET_WINDOW_PROPERTY('MAIN_WINDOW',VISIBLE,PROPERTY_ON);
   ENTER_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Soisbgi_ClearTask()
		{
			
				setGlobal("VALUE", toStr("KEY-CLRFRM"));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				//   EXECUTE_TRIGGER('ENABLE_KEYS');
				//   G$_CHECK_FAILURE;
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("MAIN_WINDOW", SupportClasses.Property.VISIBLE, true);
				//System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-HELP
		 DECLARE
	curr_item varchar2(100);
BEGIN	
	curr_item := :SYSTEM.CURRENT_ITEM;
	IF :system.current_item = 'SOVSBGV_TYPE_IND' THEN
		next_item;
	END IF;
	IF :SOVSBGV_code is null THEN
    message( G$_NLS.Get('SOISBGI-0002', 'FORM','No Source/Background Code was Retrieved') ); 
  ELSE
    :GLOBAL.KEY_SBGI := :SOVSBGV_CODE ;
    G$_COPY_FLD_ATTR;
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOASBGI','QUERY');
    G$_RESET_GLOBAL;
  END IF;
 GO_ITEM(curr_item);
END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Soisbgi_Help()
		{
				SovsbgvAdapter sovsbgvElement = (SovsbgvAdapter)this.getFormModel().getSovsbgv().getRowAdapter(true);
				if(sovsbgvElement == null)return;

				{
					NString currItem= NString.getNull();
					currItem = toStr(getCurrentItem());
					if ( getCurrentItem().equals("SOVSBGV_TYPE_IND") )
					{
						nextItem();
					}
					if ( sovsbgvElement.getSovsbgvCode().isNull() )
					{
						warningMessage(GNls.Fget(toStr("SOISBGI-0002"), toStr("FORM"), toStr("No Source/Background Code was Retrieved")));
					}
					else {
						setGlobal("KEY_SBGI", sovsbgvElement.getSovsbgvCode());
						getTask().getGoqrpls().gCopyFldAttr();
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOASBGI"), toStr("QUERY"));
						getTask().getGoqrpls().gResetGlobal();
					}
					goItem(currItem);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.GOTO_FORM
		 

do_key('HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.GOTO_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GOTO_FORM")
		public void Soisbgi_GotoForm()
		{
			
				executeAction(KeyFunction.HELP);
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.ENABLE_KEYS
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Soisbgi_EnableKeys()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.DISABLE_KEYS
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Soisbgi_DisableKeys()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-SCRUP
		    SCROLL_UP ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Soisbgi_KeyScrup()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "SCROLL_UP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
				//				SupportClasses.SQLFORMS.ScrollUp();
				//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'SCROLL_UP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-SCRDOWN
		    SCROLL_DOWN ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Soisbgi_KeyScrdown()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "SCROLL_DOWN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.ScrollDown();
				//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'SCROLL_DOWN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-PRVREC
		    PREVIOUS_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Soisbgi_PreviousRecord()
		{
			
				previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-NXTSET
		    NEXT_SET ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Soisbgi_KeyNxtset()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "NEXT_SET" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.SQLFORMS.NextSet();
				//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'NEXT_SET' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOISBGIF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-NXTREC
		    NEXT_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Soisbgi_NextRecord()
		{
			
				nextRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-NXTKEY
		    :GLOBAL.VALUE := :SOVSBGV.SOVSBGV_CODE ;
   :GLOBAL.VALUE_DESC := :SOVSBGV.SOVSBGV_DESC ;
   :GLOBAL.TYPE_IND := '' ;
   :GLOBAL.SRCE_IND := '' ;
--
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
		*/
		/*
		 *<p>
		 *This key will exit the form and pass back the key value for the row
		 *that the cursor is on.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Soisbgi_KeyNxtkey()
		{
				SovsbgvAdapter sovsbgvElement = (SovsbgvAdapter)this.getFormModel().getSovsbgv().getRowAdapter(true);
				if(sovsbgvElement == null)return;

				setGlobal("VALUE", sovsbgvElement.getSovsbgvCode());
				setGlobal("VALUE_DESC", sovsbgvElement.getSovsbgvDesc());
				setGlobal("TYPE_IND", toStr(""));
				setGlobal("SRCE_IND", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
   :GLOBAL.TYPE_IND := '' ;
   :GLOBAL.SRCE_IND := '' ;
--
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
		*/
		/*
		 *<p>
		 *The exit key will exit the validation form without passing a value to the
		 *global value for the calling form.  In stand-alone mode the exit performs
		 *normally.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Soisbgi_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				setGlobal("TYPE_IND", toStr(""));
				setGlobal("SRCE_IND", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-EXEQRY
		 --:mode_ind := '';
   EXECUTE_QUERY ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Soisbgi_ExecuteQuery()
		{
			
				// :mode_ind := '';
				// :mode_ind := '';
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.KEY-ENTQRY
		 set_item_property('stvsbgi_1_soasbgi_btn',enabled,property_off);
set_item_property('sovsbgv_stat_code_lbt',enabled,property_on);
set_item_property('sovsbgv_admr_code_lbt',enabled,property_on);
   ENTER_QUERY ;

   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Soisbgi_Search()
		{
			
				setItemEnabled("stvsbgi_1_soasbgi_btn", false);
				setItemEnabled("sovsbgv_stat_code_lbt", true);
				setItemEnabled("sovsbgv_admr_code_lbt", true);
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.PRE-UPDATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKDATE := SUBSTR(:WORKDATE, 1, 7) ;
--
   :WORKDATE := RPAD(:WORKDATE, 21, '_ACTIVITY_DATE') ;
--
   COPY( :CURRENT_DATE, :WORKDATE ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Soisbgi_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('SOISBGI-0008', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Soisbgi_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("SOISBGI-0008"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOISBGI.WHEN-NEW-FORM-INSTANCE
		    :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
--
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
--
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
   EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE') ;
--
   g$_set_inst_property;
   G$_SET_WIN_PROPERTY;
--
   :TYPE_IND := :GLOBAL.TYPE_IND ;
--
   :SRCE_IND := :GLOBAL.SRCE_IND ;
--
IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAMENU' THEN
      SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED, PROPERTY_FALSE);
ELSE 
  IF  GET_MENU_ITEM_PROPERTY('Action.Select',ENABLED) = 'FALSE' THEN
      SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED, PROPERTY_TRUE);
  END IF;
END IF;

set_item_property('stvsbgi_1_soasbgi_btn',enabled,property_off);  
set_item_property('sovsbgv_stat_code_lbt',enabled,property_on);
set_item_property('sovsbgv_admr_code_lbt',enabled,property_on);
    ENTER_QUERY ;

		*/
		/*
		 *<p>
		 *The KEY-STARTUP trigger loads the form header information goes to the next
		 *block and executes it.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOISBGI.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Soisbgi_TaskStarted(EventObject args)
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				// 
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				// 
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				executeAction("LOAD_CURRENT_RELEASE");
				// 
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				// 
				getFormModel().getFormHeader().setTypeInd(getGlobal("TYPE_IND"));
				// 
				getFormModel().getFormHeader().setSrceInd(getGlobal("SRCE_IND"));
				// 
				if ( getParentTaskName().equals("GUAMENU") )
				{
					setMenuItemEnabled("Action.Select", false);
				}
				else {
					if ( !getMenuItemEnabled("Action.Select") )
					{
						setMenuItemEnabled("Action.Select", true);
					}
				}
				setItemEnabled("stvsbgi_1_soasbgi_btn", false);
				setItemEnabled("sovsbgv_stat_code_lbt", true);
				setItemEnabled("sovsbgv_admr_code_lbt", true);
				enterQuery();
			}

		
	
}
	
