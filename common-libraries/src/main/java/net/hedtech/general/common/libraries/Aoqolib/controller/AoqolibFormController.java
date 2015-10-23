package net.hedtech.general.common.libraries.Aoqolib.controller;

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


import net.hedtech.general.common.libraries.Aoqolib.model.*;
import net.hedtech.general.common.libraries.Aoqolib.*;
import net.hedtech.general.common.libraries.Aoqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class AoqolibFormController extends AbstractSupportCodeObject  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public AoqolibFormController (ISupportCodeContainer container) {
		super(container);
	}
	
	
	@Override
	public AoqolibTaskPart getContainer() {
		return (AoqolibTaskPart)super.getContainer();
	}
	
	
	public AoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Aoqolib_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Aoqolib_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Aoqolib_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Aoqolib_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Aoqolib_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Aoqolib_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Aoqolib_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Aoqolib_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Aoqolib_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Aoqolib_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Aoqolib_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Aoqolib_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Aoqolib_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Aoqolib_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Aoqolib_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Aoqolib_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Aoqolib_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Aoqolib_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Aoqolib_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Aoqolib_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Aoqolib_WhenNewBlockInstanceTrg()
		{
			
			getGFormClass().whenNewBlockInstanceTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Aoqolib_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Aoqolib_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Aoqolib_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Aoqolib_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Aoqolib_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Aoqolib_ClearTask()
		{
			
			getGFormClass().clearTask();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Aoqolib_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Aoqolib_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Aoqolib_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Aoqolib_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Aoqolib_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Aoqolib_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Aoqolib_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Aoqolib_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Aoqolib_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Aoqolib_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Aoqolib_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Aoqolib_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Aoqolib_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Aoqolib_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Aoqolib_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Aoqolib_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Aoqolib_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Aoqolib_Exit()
		{
			
			getGFormClass().exit();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Aoqolib_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Aoqolib_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Aoqolib_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Aoqolib_GlobalCopy()
		{
			
			getGFormClass().globalCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Aoqolib_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.LOAD_CURRENT_RELEASE
		 BEGIN
:CURRENT_RELEASE := '8.7';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Aoqolib_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Aoqolib_SaveKeys()
		{
			
			getGFormClass().saveKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Aoqolib_EnableKeys()
		{
			
			getGFormClass().enableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Aoqolib_DisableKeys()
		{
			
			getGFormClass().disableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Aoqolib_CheckKeys()
		{
			
			getGInqFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Aoqolib_ClearRecord()
		{
			
			getGInqFormClass().clearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Aoqolib_Save()
		{
			
			getGInqFormClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Aoqolib_CreateRecord()
		{
			
			getGInqFormClass().createRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Aoqolib_DeleteRecord()
		{
			
			getGInqFormClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Aoqolib_KeyDupItem()
		{
			
			getGInqFormClass().keyDupItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Aoqolib_CopyRecord()
		{
			
			getGInqFormClass().copyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Aoqolib_recordChange()
		{
			
			getGInqFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.INVALID_OPTION_MSG
		 MESSAGE ( G$_NLS.Get('AOQOLIB-0000', 'FORM','Selected Option not available from this block.')  );
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Aoqolib_InvalidOptionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("AOQOLIB-0000"), toStr("FORM"), toStr("Selected Option not available from this block.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.UPDATE_ACTIVITY
		 :WORKDATE := SUBSTR(:SYSTEM.CURRENT_BLOCK,1,7)||'_ACTIVITY_DATE';
:WORKUSER := SUBSTR(:SYSTEM.CURRENT_BLOCK,1,7)||'_USER_ID';
COPY(:GLOBAL.CURRENT_USER,:WORKUSER);
COPY(TO_CHAR(SYSDATE),:WORKDATE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Aoqolib_UpdateActivity()
		{
			
				getFormModel().getFormHeader().setWorkdate(substring(toStr(getCurrentBlock()), toInt(1), toInt(7)).append("_ACTIVITY_DATE"));
				getFormModel().getFormHeader().setWorkuser(substring(toStr(getCurrentBlock()), toInt(1), toInt(7)).append("_USER_ID"));
				copy(getGlobal("CURRENT_USER"),getFormModel().getFormHeader().getWorkuser());
				copy(toChar(NDate.getNow()),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.SHOW_HEADER
		 SHOW_PAGE(1);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.SHOW_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_HEADER")
		public void Aoqolib_ShowHeader()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "SHOW_PAGE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.SQLFORMS.ShowPage(1);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SHOW_PAGE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.LOAD_FORM_HEADER
		    :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
--
   :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
   :CURRENT_RELEASE := '8.7' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Aoqolib_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				// 
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.CP$_POST
		 post;
if (:system.form_status <> 'QUERY') then
    raise form_trigger_failure;
end if;
:global.u_post_done := 'Y';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.CP$_POST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CP$_POST")
		public void Aoqolib_CpPost()
		{
			
				post();
				if ((!getTaskStatus().equals("QUERY")))
				{
					throw new ApplicationException();
				}
				setGlobal("U_POST_DONE", toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.CP$_EXIT
		 Declare
    function_failed   Boolean;
Begin
if (:global.u_commit_or_post = 'C') then
    if (:cp$_exit_mode = 'C') then exit_form(DO_COMMIT); end if;
    if (:cp$_exit_mode = 'N') then exit_form(NO_COMMIT); end if;
    if (:cp$_exit_mode = 'V') then exit_form(NO_VALIDATE); end if;
    exit_form(ASK_COMMIT);
    function_failed := form_failure;
else
 if (:system.form_status = 'QUERY') then :cp$_exit_mode := 'V'; end if;
 if (:cp$_exit_mode = 'C') then exit_form(DO_COMMIT,no_rollback);
    end if;
 if (:cp$_exit_mode = 'N') then exit_form(NO_COMMIT,no_rollback);
   end if;
 if (:cp$_exit_mode = 'V') then exit_form(NO_VALIDATE,no_rollback);
   end if;
 exit_form(ASK_COMMIT,NO_ROLLBACK);
    function_failed := form_failure;
end if;
if (function_failed) then
   raise form_trigger_failure;
end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.CP$_EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CP$_EXIT")
		public void Aoqolib_CpExit()
		{
			
				{
					NBool functionFailed= NBool.getNull();
					if ((getGlobal("U_COMMIT_OR_POST").equals("C")))
					{
						if ((getFormModel().getCpBlock().getCpExitMode().equals("C")))
						{
							exitTask(TaskServices.DO_COMMIT);
						}
						if ((getFormModel().getCpBlock().getCpExitMode().equals("N")))
						{
							exitTask(TaskServices.NO_COMMIT);
						}
						if ((getFormModel().getCpBlock().getCpExitMode().equals("V")))
						{
							exitTask(TaskServices.NO_VALIDATE);
						}
						exitTask(TaskServices.ASK_COMMIT);
						// F2J_TO_REMOVE : Call to built-in "FORM_FAILURE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins".
						//						functionFailed = SupportClasses.SQLFORMS.FormFailure();
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FORM_FAILURE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
						
						
					}
					else {
						if ((getTaskStatus().equals("QUERY")))
						{
							getFormModel().getCpBlock().setCpExitMode(toStr("V"));
						}
						if ((getFormModel().getCpBlock().getCpExitMode().equals("C")))
						{
							exitTask(TaskServices.DO_COMMIT, TaskServices.NO_ROLLBACK);
						}
						if ((getFormModel().getCpBlock().getCpExitMode().equals("N")))
						{
							exitTask(TaskServices.NO_COMMIT, TaskServices.NO_ROLLBACK);
						}
						if ((getFormModel().getCpBlock().getCpExitMode().equals("V")))
						{
							exitTask(TaskServices.NO_VALIDATE, TaskServices.NO_ROLLBACK);
						}
						exitTask(TaskServices.ASK_COMMIT, TaskServices.NO_ROLLBACK);
						// F2J_TO_REMOVE : Call to built-in "FORM_FAILURE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins".
						//						functionFailed = SupportClasses.SQLFORMS.FormFailure();
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FORM_FAILURE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQOLIBF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
						
						
					}
					if ((SupportClasses.SQLFORMS.FormFailure()))
					{
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.CP$_COMMIT
		 if (:global.u_commit_or_post = 'C') then
    commit_form;
    if (:system.form_status <> 'QUERY') then
        raise form_trigger_failure;
    end if;
    :global.u_post_done := 'N';
else
    post;
    if (:system.form_status <> 'QUERY') then
        raise form_trigger_failure;
    end if;
    :global.u_post_done := 'Y';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.CP$_COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CP$_COMMIT")
		public void Aoqolib_CpCommit()
		{
			
				if ((getGlobal("U_COMMIT_OR_POST").equals("C")))
				{
					commitTask();
					if ((!getTaskStatus().equals("QUERY")))
					{
						throw new ApplicationException();
					}
					setGlobal("U_POST_DONE", toStr("N"));
				}
				else {
					post();
					if ((!getTaskStatus().equals("QUERY")))
					{
						throw new ApplicationException();
					}
					setGlobal("U_POST_DONE", toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.CP$_CALL
		 declare
    orig_commit_or_post VARCHAR2(1);
begin
orig_commit_or_post := :global.u_commit_or_post;
if (:system.form_status = 'CHANGED'
     or orig_commit_or_post = 'P'
     or :cp$_call_mode = 'P'
     or :global.u_post_done = 'Y') then
     :global.u_commit_or_post := 'P';
else
     :global.u_commit_or_post := 'C';
end if;
call(:cp$_form_name, no_hide);
:cp$_call_mode := '';
:global.u_commit_or_post := orig_commit_or_post;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.CP$_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CP$_CALL")
		public void Aoqolib_CpCall()
		{
			
				{
					NString origCommitOrPost= NString.getNull();
					origCommitOrPost = getGlobal("U_COMMIT_OR_POST");
					if ((getTaskStatus().equals("CHANGED") || origCommitOrPost.equals("P") || getFormModel().getCpBlock().getCpCallMode().equals("P") || getGlobal("U_POST_DONE").equals("Y")))
					{
						setGlobal("U_COMMIT_OR_POST", toStr("P"));
					}
					else {
						setGlobal("U_COMMIT_OR_POST", toStr("C"));
					}
					// F2J_NOT_SUPPORTED : Call to built-in "CALL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
					//					SupportClasses.FORMSBC.Call(getFormModel().getCpBlock().getCpFormName(), TaskServices.NO_HIDE);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'CALL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
					
					
					getFormModel().getCpBlock().setCpCallMode(toStr(""));
					setGlobal("U_COMMIT_OR_POST", origCommitOrPost);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Aoqolib_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				this.getContainer().getServices().checkFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY' ) ;
   CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Aoqolib_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				executeAction("UPDATE_ACTIVITY");
				this.getContainer().getServices().checkFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AOQOLIB.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY' ) ;
   CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQOLIB.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Aoqolib_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				executeAction("UPDATE_ACTIVITY");
				this.getContainer().getServices().checkFailure();
			}

		
	
}
	
