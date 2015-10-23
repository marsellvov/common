package net.hedtech.banner.general.common.Soaidns.controller;
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
import net.hedtech.general.common.libraries.Soqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaidns.model.*;
import net.hedtech.banner.general.common.Soaidns.*;
import net.hedtech.banner.general.common.Soaidns.services.*;
import net.hedtech.general.common.libraries.Soqolib.controller.SoqolibFormController;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;
import net.hedtech.general.common.services.OracleMessagesLevel;
		

public class SoaidnsFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	private SoqolibFormController getSoqolibFormController() {
		return (net.hedtech.general.common.libraries.Soqolib.controller.SoqolibFormController) this.getTask().getTaskPart("SOQOLIB").getSupportCodeManager().getPackage("SOQOLIB");
	}	
	
	
	public SoaidnsFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SoaidnsTask getTask() {
		return (SoaidnsTask)super.getTask();
	}
	
	
	public SoaidnsModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Soaidns_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Soaidns_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Soaidns_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Soaidns_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Soaidns_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Soaidns_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Soaidns_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Soaidns_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Soaidns_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Soaidns_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Soaidns_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Soaidns_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Soaidns_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Soaidns_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Soaidns_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Soaidns_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Soaidns_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Soaidns_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Soaidns_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Soaidns_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Soaidns_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Soaidns_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Soaidns_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Soaidns_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Soaidns_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Soaidns_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Soaidns_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Soaidns_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Soaidns_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Soaidns_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Soaidns_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Soaidns_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Soaidns_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Soaidns_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Soaidns_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Soaidns_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Soaidns_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Soaidns_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Soaidns_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Soaidns_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Soaidns_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Soaidns_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Soaidns_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Soaidns_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Soaidns_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Soaidns_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Soaidns_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Soaidns_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Soaidns_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Soaidns_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Soaidns_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Soaidns_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Soaidns_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Soaidns_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Soaidns_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Soaidns_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Soaidns_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Soaidns_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Soaidns_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.CALL_SPAIDEN
		    :GLOBAL.KEY_IDNO := :SPRIDEN.SPRIDEN_ID ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
     G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SPAIDEN','') ; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.CALL_SPAIDEN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPAIDEN")
		public void Soaidns_CallSpaiden()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){

				setGlobal("KEY_IDNO", spridenElement.getSpridenId());
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SPAIDEN"), toStr(""));
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Soaidns_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-EXEQRY
		 IF :SYSTEM.CURSOR_BLOCK = 'SPRIDEN' THEN
   EXECUTE_QUERY ;
   IF NOT FORM_SUCCESS THEN
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
--
   NEXT_BLOCK ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
--
   :SYSTEM.MESSAGE_LEVEL := '0' ;
--
ELSE 
   IF :SYSTEM.CURSOR_BLOCK = 'SOUNDEX' THEN
      :FORM_HEADER.LAST_NAME := '' ;
      :FORM_HEADER.FIRST_NAME := '' ;
      PREVIOUS_BLOCK ;
      G$_CHECK_FAILURE ;
      EXECUTE_QUERY ;
--
      :SYSTEM.MESSAGE_LEVEL := '5' ;
--
      NEXT_BLOCK ;
      NEXT_BLOCK ;
      EXECUTE_QUERY ;
      NEXT_BLOCK ;
      EXECUTE_QUERY ;
      NEXT_BLOCK ;
      EXECUTE_QUERY ;
      PREVIOUS_BLOCK ;
      PREVIOUS_BLOCK ;
      PREVIOUS_BLOCK ;
      PREVIOUS_BLOCK ;
      :SOUNDEX_LAST_NAME := '';
      :SOUNDEX_FIRST_NAME := '';
--
      :SYSTEM.MESSAGE_LEVEL := '0' ;
--
   END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Soaidns_ExecuteQuery()
		{
			
				if ( getCursorBlock().equals("SPRIDEN") )
				{
					try{executeQuery();}
					catch(Exception e){
						throw new ApplicationException();
					
					}
					// 
					
					try { 
						MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					// 
					nextBlock();
					nextBlock();
					executeQuery();
					nextBlock();
					executeQuery();
					nextBlock();
					executeQuery();
					previousBlock();
					previousBlock();
					previousBlock();
					previousBlock();
					// 
					
					} finally {
								
						MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
					}
								
				}
				else {
					if ( getCursorBlock().equals("SOUNDEX") )
					{
						getFormModel().getFormHeader().setLastName(toStr(""));
						getFormModel().getFormHeader().setFirstName(toStr(""));
						previousBlock();
						getTask().getGoqrpls().gCheckFailure();
						executeQuery();
						// 
						
						try { 
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
						// 
						nextBlock();
						nextBlock();
						executeQuery();
						nextBlock();
						executeQuery();
						nextBlock();
						executeQuery();
						previousBlock();
						previousBlock();
						previousBlock();
						previousBlock();
						getFormModel().getSoundex().setSoundexLastName(toStr(""));
						getFormModel().getSoundex().setSoundexFirstName(toStr(""));
						// 
						
						} finally {
									
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
						}
									
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.INVALID_FUNCTION_MSG
		    MESSAGE(  G$_NLS.Get('SOAIDNS-0000', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Soaidns_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("SOAIDNS-0000"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_MI',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_MI',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_MI',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Soaidns_EnableKeys()
		{
			
				if ( getItemEnabled("SPRIDEN_CHANGE_IND").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CHANGE_IND", true);
					setItemNavigable("SPRIDEN_CHANGE_IND", true);
				}
				if ( getItemEnabled("SPRIDEN_FIRST_NAME").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_FIRST_NAME", true);
					setItemNavigable("SPRIDEN_FIRST_NAME", true);
				}
				if ( getItemEnabled("SPRIDEN_ID").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_ID", true);
					setItemNavigable("SPRIDEN_ID", true);
				}
				if ( getItemEnabled("SPRIDEN_LAST_NAME").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_LAST_NAME", true);
					setItemNavigable("SPRIDEN_LAST_NAME", true);
				}
				if ( getItemEnabled("SPRIDEN_MI").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_MI", true);
					setItemNavigable("SPRIDEN_MI", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.DISABLE_KEYS
		    SET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPRIDEN_FIRST_NAME',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPRIDEN_ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPRIDEN_LAST_NAME',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPRIDEN_MI',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Soaidns_DisableKeys()
		{
			
				setItemEnabled("SPRIDEN_CHANGE_IND", false);
				setItemEnabled("SPRIDEN_FIRST_NAME", false);
				setItemEnabled("SPRIDEN_ID", false);
				setItemEnabled("SPRIDEN_LAST_NAME", false);
				setItemEnabled("SPRIDEN_MI", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.WHEN-NEW-FORM-INSTANCE
		 G$_SET_WIN_PROPERTY;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
--   G$_SETMENU('main.block',1);
--
   DEFAULT_VALUE( '', 'GLOBAL.LAST_NAME' ) ;
--
   DEFAULT_VALUE( '', 'GLOBAL.FIRST_NAME' ) ;
--
   :FORM_HEADER.LAST_NAME := :GLOBAL.LAST_NAME ;
--
   :FORM_HEADER.FIRST_NAME := :GLOBAL.FIRST_NAME ;
--
   
   <multilinecomment>Defect 1-Z507V5 Start</multilinecomment>   
  IF :GLOBAL.SOAIDNS_CALL = 'Y' THEN
    IF GET_MENU_ITEM_PROPERTY('ACTION.SELECT',ENABLED) = 'FALSE' THEN
			 SET_MENU_ITEM_PROPERTY('ACTION.SELECT',ENABLED,PROPERTY_TRUE);
   		 SET_MENU_ITEM_PROPERTY('ICONS.SELECT', ENABLED,PROPERTY_TRUE);
   	END IF;
  END IF;
  <multilinecomment>Defect 1-Z507V5 End </multilinecomment>
-- set up summary to display styp/rate or study path name 
   execute_trigger('LEARNER_SUMMARY_BLOCK_PREFORM');

   :s$_curricula_summary.return_from_sovlcur := 'SFBETRM_TERM_CODE';   
   show_view('curricula_summary_tab');
   
   EXECUTE_TRIGGER( 'QUERY' ) ;
   G$_CHECK_FAILURE ;



   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Soaidns_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				//    G$_SETMENU('main.block',1);
				// 
				setDefaultValue("", "GLOBAL.LAST_NAME");
				// 
				setDefaultValue("", "GLOBAL.FIRST_NAME");
				// 
				getFormModel().getFormHeader().setLastName(getGlobal("LAST_NAME"));
				// 
				getFormModel().getFormHeader().setFirstName(getGlobal("FIRST_NAME"));
				// 
				// Defect 1-Z507V5 Start
				if ( getGlobal("SOAIDNS_CALL").equals("Y") )
				{
					if ( !getMenuItemEnabled("ACTION.SELECT") )
					{
						setMenuItemEnabled("ACTION.SELECT", true);
						setMenuItemEnabled("ICONS.SELECT", true);
					}
				}
				// Defect 1-Z507V5 End 
				//  set up summary to display styp/rate or study path name 
				executeAction("LEARNER_SUMMARY_BLOCK_PREFORM");
				getFormModel().getSCurriculaSummary().setReturnFromSovlcur(toStr("SFBETRM_TERM_CODE"));
				showView("curricula_summary_tab");
				executeAction("QUERY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-NXTKEY
		    :GLOBAL.VALUE := :SPRIDEN.SPRIDEN_ID ;
--
--   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *The exit key has been redefined to pass the id from the name search form

		 *to the calling form and exit.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Soaidns_KeyNxtkey()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){

				setGlobal("VALUE", spridenElement.getSpridenId());
				// 
				//    EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
--   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Soaidns_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				//    EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Soaidns_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-CLRFRM
		    EXECUTE_TRIGGER('ENABLE_KEYS');
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   ENTER_QUERY ;
   show_view('curricula_summary_tab');
   G$_CHECK_FAILURE ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
--
   NEXT_BLOCK ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
--
   :SYSTEM.MESSAGE_LEVEL := '0' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Soaidns_ClearTask()
		{
			
				executeAction("ENABLE_KEYS");
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				enterQuery();
				showView("curricula_summary_tab");
				getTask().getGoqrpls().gCheckFailure();
				// 
				
				try { 
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
				// 
				nextBlock();
				nextBlock();
				executeQuery();
				nextBlock();
				executeQuery();
				nextBlock();
				executeQuery();
				previousBlock();
				previousBlock();
				previousBlock();
				previousBlock();
				// 
				
				} finally {
							
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void Soaidns_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOAIDNS.CALL_CURRICULUM
		 go_block('spriden');
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOAIDNS.CALL_CURRICULUM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_CURRICULUM")
		public void Soaidns_CallCurriculum()
		{
			
				goBlock(toStr("spriden"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
