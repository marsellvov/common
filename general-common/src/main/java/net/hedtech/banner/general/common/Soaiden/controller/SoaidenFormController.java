package net.hedtech.banner.general.common.Soaiden.controller;
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
import net.hedtech.banner.general.common.Soaiden.model.*;
import net.hedtech.banner.general.common.Soaiden.*;
import net.hedtech.banner.general.common.Soaiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class SoaidenFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public SoaidenFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SoaidenTask getTask() {
		return (SoaidenTask)super.getTask();
	}
	
	
	public SoaidenModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Soaiden_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Soaiden_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Soaiden_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Soaiden_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Soaiden_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Soaiden_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Soaiden_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Soaiden_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Soaiden_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Soaiden_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Soaiden_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Soaiden_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Soaiden_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Soaiden_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Soaiden_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Soaiden_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Soaiden_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Soaiden_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Soaiden_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Soaiden_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Soaiden_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Soaiden_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Soaiden_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Soaiden_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Soaiden_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Soaiden_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Soaiden_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Soaiden_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Soaiden_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Soaiden_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Soaiden_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Soaiden_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Soaiden_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Soaiden_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Soaiden_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Soaiden_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Soaiden_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Soaiden_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Soaiden_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Soaiden_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Soaiden_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Soaiden_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Soaiden_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Soaiden_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Soaiden_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Soaiden_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Soaiden_EnableKeys()
		{
			
				getGFormClass().enableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Soaiden_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Soaiden_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Soaiden_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Soaiden_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Soaiden_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Soaiden_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Soaiden_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Soaiden_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Soaiden_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Soaiden_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Soaiden_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Soaiden_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.DETAIL_BTN_TRIG
		    :GLOBAL.KEY_IDNO := :SPRIDEN_ID ;
--
   DEFAULT_VALUE( 'S', 'GLOBAL.PRODUCT_IND' ) ;
--
 :GLOBAL.SECRFRM := NAME_IN('GLOBAL.GUROPTM_NAME1') ; --1-4717WA added
 --  IF :GLOBAL.PRODUCT_IND = 'A' THEN
 	IF :GLOBAL.SECRFRM ='APASBIO' THEN
      --:GLOBAL.SECRFRM := 'APASBIO';  
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:global.current_user, :global.secrfrm, 'QUERY');
   ELSIF :GLOBAL.SECRFRM = 'SOAIDNS' THEN
      GOTO CALL_SOAIDNS ;
   ELSE
      MESSAGE (  G$_NLS.Get('SOAIDEN-0000', 'FORM','No Additional Information available.')  ) ;
      RETURN ;
   END IF ;
--
   RETURN ;
--
   << CALL_SOAIDNS >>
   :GLOBAL.LAST_NAME := :SPRIDEN_LAST_NAME ;
   :GLOBAL.FIRST_NAME := :SPRIDEN_FIRST_NAME;
   :GLOBAL.SECRFRM := 'SOAIDNS';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   :GLOBAL.SOAIDNS_CALL := 'Y' ; <multilinecomment>Defect 1-Z507V5 </multilinecomment>
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:global.current_user, :global.secrfrm, 'QUERY');
   G$_CHECK_FAILURE ;
   :GLOBAL.SOAIDNS_CALL := '' ; <multilinecomment>Defect 1-Z507V5 </multilinecomment>
   IF :GLOBAL.VALUE IS NOT NULL THEN
 --     EXIT_FORM;
      :GLOBAL.LAST_NAME := '';
      :GLOBAL.FIRST_NAME := '';
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
   END IF;
   :GLOBAL.LAST_NAME := '';
   :GLOBAL.FIRST_NAME := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.DETAIL_BTN_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DETAIL_BTN_TRIG")
		public void Soaiden_DetailBtnTrig()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){
					setGlobal("KEY_IDNO", spridenElement.getSpridenId());
					// 
					setDefaultValue("S", "GLOBAL.PRODUCT_IND");
					// 
					setGlobal("SECRFRM", getNameIn("GLOBAL.GUROPTM_NAME1"));
					// 1-4717WA added
					//   IF :GLOBAL.PRODUCT_IND = 'A' THEN
					if ( getGlobal("SECRFRM").equals("APASBIO") )
					{
						// :GLOBAL.SECRFRM := 'APASBIO';  
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr("QUERY"));
					}
					else if ( getGlobal("SECRFRM").equals("SOAIDNS") ) {
						goto_Call_Soaidns(spridenElement);
					}
					else {
						infoMessage(GNls.Fget(toStr("SOAIDEN-0000"), toStr("FORM"), toStr("No Additional Information available.")));
						return ;
					}
					// 
				}
				return ;
			}
		
		private void goto_Call_Soaidns(SpridenAdapter spridenElement) {
			//CALL_SOAIDNS:;
			setGlobal("LAST_NAME", spridenElement.getSpridenLastName());
			setGlobal("FIRST_NAME", spridenElement.getSpridenFirstName());
			setGlobal("SECRFRM", toStr("SOAIDNS"));
			executeAction("G$_REVOKE_ACCESS");
			setGlobal("SOAIDNS_CALL", toStr("Y"));
			// Defect 1-Z507V5 
			getTask().getGoqrpls().gCheckFailure();
			getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr("QUERY"));
			getTask().getGoqrpls().gCheckFailure();
			setGlobal("SOAIDNS_CALL", toStr(""));
			// Defect 1-Z507V5 
			if ( !getGlobal("VALUE").isNull() )
			{
				//      EXIT_FORM;
				setGlobal("LAST_NAME", toStr(""));
				setGlobal("FIRST_NAME", toStr(""));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}
			setGlobal("LAST_NAME", toStr(""));
			setGlobal("FIRST_NAME", toStr(""));
		}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-ENTQRY
		 G$_IDNAME_SEARCH.ENTER_QUERY_STATUS;
--
SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
ENTER_QUERY;
IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Soaiden_Search()
		{
			
				getTask().getGoqrpls().getGIdnameSearch().enterQueryStatus();
				// 
				setItemEnabled("SOUNDEX_BTN", false);
				enterQuery();
				if ( getItemEnabled("SOUNDEX_BTN").equals("FALSE") )
				{
					setItemEnabled("SOUNDEX_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		    G$_SET_WIN_PROPERTY;
IF :SYSTEM.EVENT_WINDOW IS NULL OR
   :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
   G$_SET_INST_PROPERTY;
END IF;
IF :SYSTEM.EVENT_WINDOW = 'SOUNDEX_WINDOW' THEN
   GO_ITEM('SOUNDEX_LAST_NAME');
END IF;
IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN
   GO_ITEM('SPRIDEN_ID');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Soaiden_WhenWindowActivatedTrg()
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				if ( (getCurrentWindow()) == null || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
				}
				if ( getCurrentWindow().equals("SOUNDEX_WINDOW") )
				{
					goItem(toStr("SOUNDEX_LAST_NAME"));
				}
				if ( getCurrentWindow().equals("MAIN_WINDOW") )
				{
					goItem(toStr("SPRIDEN_ID"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.DISABLE_DETAIL_BTN_TRIG
		 IF GET_ITEM_PROPERTY('DETAIL_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('DETAIL_BTN',ENABLED,PROPERTY_OFF);
   G$_NAVIGATION_FRAME.DISABLE_OPTION('SOAIDNS','P');
   G$_NAVIGATION_FRAME.DISABLE_OPTION('APASBIO','P');  --Added for Defect 1-E0RB0
END IF;
IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
   G$_NAVIGATION_FRAME.DISABLE_OPTION('SOUNDEX','B');
END IF;
--
IF GET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED,PROPERTY_OFF);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED,PROPERTY_OFF);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.DISABLE_DETAIL_BTN_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_DETAIL_BTN_TRIG")
		public void Soaiden_DisableDetailBtnTrig()
		{
			
				if ( getItemEnabled("DETAIL_BTN").equals("TRUE") )
				{
					setItemEnabled("DETAIL_BTN", false);
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SOAIDNS"), toStr("P"));
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APASBIO"), toStr("P"));
				}
				if ( getItemEnabled("SOUNDEX_BTN").equals("TRUE") )
				{
					setItemEnabled("SOUNDEX_BTN", false);
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SOUNDEX"), toStr("B"));
				}
				// 
				if ( getItemEnabled("SPRIDEN_1_EXITVALUE_BTN").equals("TRUE") )
				{
					setItemEnabled("SPRIDEN_1_EXITVALUE_BTN", false);
				}
				if ( getItemEnabled("SPRIDEN_1_ROLLBACK_BTN").equals("TRUE") )
				{
					setItemEnabled("SPRIDEN_1_ROLLBACK_BTN", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.ENABLE_DETAIL_BTN_TRIG
		  IF GET_ITEM_PROPERTY('DETAIL_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('DETAIL_BTN',ENABLED,PROPERTY_ON);
   IF :GLOBAL.PRODUCT_IND = 'S' THEN
      G$_NAVIGATION_FRAME.ENABLE_OPTION('SOAIDNS','P');
   ELSIF :GLOBAL.PRODUCT_IND = 'A' THEN
      G$_NAVIGATION_FRAME.ENABLE_OPTION('APASBIO','P');  -- Added for Defect 1-E0RB0
      G$_NAVIGATION_FRAME.ENABLE_OPTION('SOAIDNS','P');  -- Added 1-4717WA
   END IF;
   
  
 END IF;
 IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
   G$_NAVIGATION_FRAME.ENABLE_OPTION('SOUNDEX','B');
 END IF;
--
IF GET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED,PROPERTY_ON);
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ENABLE_DETAIL_BTN_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_DETAIL_BTN_TRIG")
		public void Soaiden_EnableDetailBtnTrig()
		{
			
				if ( getItemEnabled("DETAIL_BTN").equals("FALSE") )
				{
					setItemEnabled("DETAIL_BTN", true);
					if ( getGlobal("PRODUCT_IND").equals("S") )
					{
						getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOAIDNS"), toStr("P"));
					}
					else if ( getGlobal("PRODUCT_IND").equals("A") ) {
						getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("APASBIO"), toStr("P"));
						//  Added for Defect 1-E0RB0
						getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOAIDNS"), toStr("P"));
					}
				}
				if ( getItemEnabled("SOUNDEX_BTN").equals("FALSE") )
				{
					setItemEnabled("SOUNDEX_BTN", true);
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOUNDEX"), toStr("B"));
				}
				// 
				if ( getItemEnabled("SPRIDEN_1_EXITVALUE_BTN").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_1_EXITVALUE_BTN", true);
				}
				if ( getItemEnabled("SPRIDEN_1_ROLLBACK_BTN").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_1_ROLLBACK_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.ENABLE_NO_DETAIL_TRIG
		 IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
   G$_NAVIGATION_FRAME.ENABLE_OPTION('SOUNDEX','B');
END IF;
--
IF GET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_EXITVALUE_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_1_ROLLBACK_BTN',ENABLED,PROPERTY_ON);
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.ENABLE_NO_DETAIL_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_NO_DETAIL_TRIG")
		public void Soaiden_EnableNoDetailTrig()
		{
			
				if ( getItemEnabled("SOUNDEX_BTN").equals("FALSE") )
				{
					setItemEnabled("SOUNDEX_BTN", true);
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOUNDEX"), toStr("B"));
				}
				// 
				if ( getItemEnabled("SPRIDEN_1_EXITVALUE_BTN").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_1_EXITVALUE_BTN", true);
				}
				if ( getItemEnabled("SPRIDEN_1_ROLLBACK_BTN").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_1_ROLLBACK_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-CQUERY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-CQUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void Soaiden_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.INVALID_FUNCTION_MSG
		    MESSAGE(  G$_NLS.Get('SOAIDEN-0001', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Soaiden_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("SOAIDEN-0001"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.WHEN-NEW-FORM-INSTANCE
		 <multilinecomment> MW 04/17/2002 Make "Case Sensitive Query?" radio button
                 default to No on SOAIDEN.. </multilinecomment>
--:CASE_INSENSITIVE_RG := 'F';

  :CASE_INSENSITIVE_RG := 'T';
--
   G$_SET_WIN_PROPERTY ;
   EXECUTE_TRIGGER('DISABLE_DETAIL_BTN_TRIG');
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
   
   GO_BLOCK('SPRIDEN');
--
--  Added the following six lines to allow another form to call this form, 
--  pass it a last_name and first_name and automatically do a SOUNDEX name search.
--  The calling program must value GLOBAL.FORM_WAS_CALLED to 'Y', GLOBAL.LAST_NAME, 
--  GLOBAL.FIRST_NAME, AND GLOBAL.CALLING_FORM to 'NAME_SEARCH'.  Also added the END IF;
--  after ENTER_QUERY ;                                          Scott Geiser 04/10/96
--
IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN
   IF :GLOBAL.CALLING_FORM = 'IDNAME_SEARCH' THEN
        G$_IDNAME_SEARCH.FORM_INST_QUERY_STATUS;
	EXECUTE_QUERY ;
   ELSIF :GLOBAL.CALLING_FORM = 'NAME_SEARCH' THEN
          :SOUNDEX_LAST_NAME := :GLOBAL.LAST_NAME;
          :SOUNDEX_FIRST_NAME := :GLOBAL.FIRST_NAME;
          EXECUTE_QUERY;
   ELSE
-- Clear globals Defect 46744
       :GLOBAL.SEARCH_ID := ''; 
       :GLOBAL.LAST_NAME := ''; 
       :GLOBAL.FIRST_NAME := ''; 
       :GLOBAL.MID_NAME := ''; 
-- End clear globals
       ENTER_QUERY;
   END IF ;
ELSE
-- Clear globals Defect 46744
       :GLOBAL.SEARCH_ID := ''; 
       :GLOBAL.LAST_NAME := ''; 
       :GLOBAL.FIRST_NAME := ''; 
       :GLOBAL.MID_NAME := ''; 
-- End clear globals
   ENTER_QUERY ;
END IF ;

   IF STUDENT_INSTALLED
   THEN
 		  DEFAULT_VALUE( 'S', 'GLOBAL.PRODUCT_IND' ) ; <multilinecomment> 1-4717WA added</multilinecomment>
      EXECUTE_TRIGGER('ENABLE_DETAIL_BTN_TRIG');
   ELSE
      EXECUTE_TRIGGER('ENABLE_NO_DETAIL_TRIG');      
   END IF;
   G$_SETMENU('main.block',1); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Soaiden_TaskStarted(EventObject args)
		{
			
				//  MW 04/17/2002 Make "Case Sensitive Query?" radio button
				// default to No on SOAIDEN.. 
				// :CASE_INSENSITIVE_RG := 'F';
				//  MW 04/17/2002 Make "Case Sensitive Query?" radio button
				// default to No on SOAIDEN.. 
				// :CASE_INSENSITIVE_RG := 'F';
				getFormModel().getButtonControlBlock().setCaseInsensitiveRg(toStr("T"));
				// MORPHIS TODO: Fix ELLBHR-17963
				executeAction("WHEN-RADIO-CHANGED", "BUTTON_CONTROL_BLOCK", "CASE_INSENSITIVE_RG");
				// 
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("DISABLE_DETAIL_BTN_TRIG");
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				goBlock(toStr("SPRIDEN"));
				// 
				//   Added the following six lines to allow another form to call this form, 
				//   pass it a last_name and first_name and automatically do a SOUNDEX name search.
				//   The calling program must value GLOBAL.FORM_WAS_CALLED to 'Y', GLOBAL.LAST_NAME, 
				//   GLOBAL.FIRST_NAME, AND GLOBAL.CALLING_FORM to 'NAME_SEARCH'.  Also added the END IF;
				//   after ENTER_QUERY ;                                          Scott Geiser 04/10/96
				// 
				if ( getGlobal("FORM_WAS_CALLED").equals("Y") )
				{
					if ( getGlobal("CALLING_FORM").equals("IDNAME_SEARCH") )
					{
						getTask().getGoqrpls().getGIdnameSearch().formInstQueryStatus();
						executeQuery();
					}
					else if ( getGlobal("CALLING_FORM").equals("NAME_SEARCH") ) {
						getFormModel().getSoundex().setSoundexLastName(getGlobal("LAST_NAME"));
						getFormModel().getSoundex().setSoundexFirstName(getGlobal("FIRST_NAME"));
						executeQuery();
					}
					else {
						//  Clear globals Defect 46744
						setGlobal("SEARCH_ID", toStr(""));
						setGlobal("LAST_NAME", toStr(""));
						setGlobal("FIRST_NAME", toStr(""));
						setGlobal("MID_NAME", toStr(""));
						//  End clear globals
						enterQuery();
					}
				}
				else {
					//  Clear globals Defect 46744
					setGlobal("SEARCH_ID", toStr(""));
					setGlobal("LAST_NAME", toStr(""));
					setGlobal("FIRST_NAME", toStr(""));
					setGlobal("MID_NAME", toStr(""));
					//  End clear globals
					enterQuery();
				}
				if ( this.getTask().getServices().studentInstalled().getValue() )
				{
					setDefaultValue("S", "GLOBAL.PRODUCT_IND");
					//  1-4717WA added
					executeAction("ENABLE_DETAIL_BTN_TRIG");
				}
				else {
					executeAction("ENABLE_NO_DETAIL_TRIG");
				}
				getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-SCRUP
		    SCROLL_UP ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Soaiden_KeyScrup()
		{
			
				
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-SCRDOWN
		    SCROLL_DOWN ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Soaiden_KeyScrdown()
		{
		
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-NXTKEY
		 :GLOBAL.VALUE := :SPRIDEN.SPRIDEN_ID ;
   
-- for PII, save selected pidm in temp. variable if user has cross domain search
gokfgac.p_search_form_update_temp_pidm(:spriden.spriden_pidm); 
--
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *The exit key has been redefined to pass the id from the name search form

		 *to the calling form and exit.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Soaiden_KeyNxtkey()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){
					setGlobal("VALUE", spridenElement.getSpridenId());
					//  for PII, save selected pidm in temp. variable if user has cross domain search
					Gokfgac.pSearchFormUpdateTempPidm(spridenElement.getSpridenPidm());
					// 
				}
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Soaiden_FormKeyMenu()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-EXIT
		 
   :GLOBAL.VALUE := '' ;
--
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Soaiden_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.KEY-CLRFRM
		    SET_WINDOW_PROPERTY('SOUNDEX_WINDOW',VISIBLE,PROPERTY_OFF);
   EXECUTE_TRIGGER('DISABLE_DETAIL_BTN_TRIG');
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
<multilinecomment> MW 04/17/2002 Make "Case Sensitive Query?" radio button
                 default to No on SOAIDEN. </multilinecomment>
--:CASE_INSENSITIVE_RG := 'F';
   :CASE_INSENSITIVE_RG := 'T';
--
   ENTER_QUERY ;
   EXECUTE_TRIGGER('ENABLE_DETAIL_BTN_TRIG');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Soaiden_ClearTask()
		{
			
				ViewServices.hideWindow("SOUNDEX_WINDOW");
				executeAction("DISABLE_DETAIL_BTN_TRIG");
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				//  MW 04/17/2002 Make "Case Sensitive Query?" radio button
				// default to No on SOAIDEN. 
				// :CASE_INSENSITIVE_RG := 'F';
				getFormModel().getButtonControlBlock().setCaseInsensitiveRg(toStr("T"));
				// 
				enterQuery();
				executeAction("ENABLE_DETAIL_BTN_TRIG");
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDEN.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :SPRIDEN.SPRIDEN_ID ;
   
   -- for PII, save selected pidm in temp. variable if user has cross domain search
  gokfgac.p_search_form_update_temp_pidm(:spriden.spriden_pidm); 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDEN.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Soaiden_SaveKeys()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if (spridenElement == null) {return;}

				setGlobal("KEY_IDNO", spridenElement.getSpridenId());
				//  for PII, save selected pidm in temp. variable if user has cross domain search
				Gokfgac.pSearchFormUpdateTempPidm(spridenElement.getSpridenPidm());
			}

		
	
}
	
