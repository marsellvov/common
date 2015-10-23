package net.hedtech.banner.general.common.Guqintf.controller;
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
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsMessageLevel;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guqintf.model.*;
import net.hedtech.banner.general.common.Guqintf.*;
import net.hedtech.banner.general.common.Guqintf.services.*;
import net.hedtech.banner.general.common.Guqintf.services.Exceptions.NoUpdatePermission;
import net.hedtech.banner.general.common.Guqintf.services.Exceptions.SeqDoesNotExist;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
import net.hedtech.general.common.services.OracleMessagesLevel;
		

public class GuqintfFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public GuqintfFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuqintfTask getTask() {
		return (GuqintfTask)super.getTask();
	}
	
	
	public GuqintfModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guqintf_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guqintf_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guqintf_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guqintf_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guqintf_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guqintf_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guqintf_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guqintf_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guqintf_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guqintf_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guqintf_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guqintf_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guqintf_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guqintf_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guqintf_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guqintf_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guqintf_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guqintf_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guqintf_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guqintf_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guqintf_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guqintf_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guqintf_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guqintf_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guqintf_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guqintf_ClearTask()
		{
			
				getGFormClass().clearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guqintf_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guqintf_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guqintf_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guqintf_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guqintf_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guqintf_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guqintf_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guqintf_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guqintf_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guqintf_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guqintf_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guqintf_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guqintf_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guqintf_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guqintf_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guqintf_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guqintf_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guqintf_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guqintf_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guqintf_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guqintf_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guqintf_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guqintf_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guqintf_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guqintf_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Guqintf_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Guqintf_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Guqintf_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Guqintf_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Guqintf_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Guqintf_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guqintf_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.BLD_HOST_COMMAND_SMRCMPL
		 --
-- Special processing required here. The user can specify a printer destination
-- on the SOADEST form. But since smrcmpl is submitted from an application form
-- and not gjapctl, the normal passing of parameters to the shl/com file needs to be
-- adjusted. In this case, if a printer desination was entered, we modify parm 4
-- to be that printer name. Otherwise, we pass in the name of the job. When the
-- shl/com file runs, it checks parm 4. If it's not smrcmpl, it will use it (parm 4)
-- as the name of the printer.
--
DECLARE
  MY_JOB_ID VARCHAR2(30);
BEGIN
  IF  :GLOBAL.CMPL_PRNTR IS NULL THEN
      MY_JOB_ID := 'SMRCMPL';
  ELSE
      MY_JOB_ID := :GLOBAL.CMPL_PRNTR;
  END IF;
--
  :COMMAND_STRING := :COMMAND_NAME||' '||:ALT_USER_ID||' '||
                     :ALT_PASSWORD||' '||:GLOBAL.ONE_UP_NO||' '||
                     MY_JOB_ID||' '||:GLOBAL.GURJOBS_DIRECTORY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.BLD_HOST_COMMAND_SMRCMPL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BLD_HOST_COMMAND_SMRCMPL")
		public void Guqintf_BldHostCommandSmrcmpl()
		{
			
				// 
				//  Special processing required here. The user can specify a printer destination
				//  on the SOADEST form. But since smrcmpl is submitted from an application form
				//  and not gjapctl, the normal passing of parameters to the shl/com file needs to be
				//  adjusted. In this case, if a printer desination was entered, we modify parm 4
				//  to be that printer name. Otherwise, we pass in the name of the job. When the
				//  shl/com file runs, it checks parm 4. If it's not smrcmpl, it will use it (parm 4)
				//  as the name of the printer.
				// 
				{
					NString myJobId= NString.getNull();
					if ( getGlobal("CMPL_PRNTR").isNull() )
					{
						myJobId = toStr("SMRCMPL");
					}
					else {
						myJobId = getGlobal("CMPL_PRNTR");
					}

					
					//Added by dghant (5.6.2015)==================================================================
					//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)		
					//Morphis implementation below
					if (getGlobal("JS_PRXY_SID").isNotNull() && getGlobal("JS_PRXY_USER_IND").equals("Y")){
						if (getGlobal("CURRENT_USER").toString().length() < 29){
							setGlobal("ALT_USER_ID", "["+getGlobal("CURRENT_USER").toString()+"]");
						}
						setGlobal("ALT_PASSWORD", getGlobal("JS_PRXY_SID").toString());
					}
					
					//This line below may need to change
					//getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getFormModel().getDummy().getAltUserId()).append(" ").append(getFormModel().getDummy().getAltPassword()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(myJobId).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));
					getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getGlobal("ALT_USER_ID").toString()).append(" ").append(getGlobal("ALT_PASSWORD").toString()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(myJobId).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));

				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.BLD_HOST_COMMAND_RPOVLDT
		 -- 71-1
DECLARE
  Seq_Does_Not_Exist	Exception;
	No_Update_Permission	Exception;
	PRAGMA Exception_Init (Seq_Does_Not_Exist, -02289);
	PRAGMA Exception_Init (No_Update_Permission, -01031);
--
-- 21-1
--
BEGIN
  SELECT GJBPSEQ.NEXTVAL
    INTO :ONE_UP_NO
    FROM DUAL;
--
   :COMMAND_STRING := :COMMAND_NAME || ' ' || :ALT_USER_ID || '='
      || :ALT_PASSWORD || '=' || :GLOBAL.PARM_FIELD || '=' 
      || TO_CHAR(:ONE_UP_NO)||' '||:GLOBAL.GURJOBS_DIRECTORY;
-- 71-1
EXCEPTION
  WHEN No_Update_Permission THEN
      MESSAGE(G$_NLS.GET('GUQINTF-0000','FORM','*Error* You do not have permission to perform these updates.  Processing may be incomplete.'));
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
  WHEN Seq_Does_Not_Exist THEN
      MESSAGE(G$_NLS.GET('GUQINTF-0001','FORM','*Error* You do not have permission to perform these updates.  Processing may be incomplete.'));
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
  WHEN OTHERS THEN
      MESSAGE(G$_NLS.GET('GUQINTF-0002','FORM','*Error*%01%%02%', SQLCODE, SQLERRM));
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.BLD_HOST_COMMAND_RPOVLDT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BLD_HOST_COMMAND_RPOVLDT")
		public void Guqintf_BldHostCommandRpovldt()
		{
			
				//  71-1
				int rowCount = 0;
				{
					try
					{
						String sql1 = "SELECT GJBPSEQ.NEXTVAL " + " FROM DUAL ";
						DataCommand command1 = new DataCommand(sql1);
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							getFormModel().getDummy().setOneUpNo(results1.getNumber(0));
						}
						results1.close();
						//
						//Added by dghant (5.6.2015)==================================================================
						//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)		
						//Morphis implementation below
						
						if (getGlobal("JS_PRXY_SID").isNotNull() && getGlobal("JS_PRXY_USER_IND").equals("Y")){
							if (getGlobal("CURRENT_USER").toString().length() < 29){
								setGlobal("ALT_USER_ID", "["+getGlobal("CURRENT_USER").toString()+"]");
							}
							setGlobal("ALT_PASSWORD", getGlobal("JS_PRXY_SID").toString());
						}

						//This linen below may need to be re-adjusted.
						//getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getFormModel().getDummy().getAltUserId()).append("=").append(getFormModel().getDummy().getAltPassword()).append("=").append(getGlobal("PARM_FIELD")).append("=").append(toChar(getFormModel().getDummy().getOneUpNo())).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));
						getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getGlobal("ALT_USER_ID").toString()).append("=").append(getGlobal("ALT_PASSWORD").toString()).append("=").append(getGlobal("PARM_FIELD")).append("=").append(toChar(getFormModel().getDummy().getOneUpNo())).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));
					}
//					catch(NoUpdatePermission e)
//					{
//						errorMessage(GNls.Fget(toStr("GUQINTF-0000"), toStr("FORM"), toStr(" You do not have permission to perform these updates.  Processing may be incomplete.")));
//						throw new ApplicationException();
//					}
//					catch(SeqDoesNotExist e)
//					{
//						errorMessage(GNls.Fget(toStr("GUQINTF-0001"), toStr("FORM"), toStr(" You do not have permission to perform these updates.  Processing may be incomplete.")));
//						throw new ApplicationException();
//					}
					
					catch(DataLayerException e){
						
						if(e.getCode() == -2289 || e.getCode() == -1031){
							errorMessage(GNls.Fget(toStr("GUQINTF-0000"), toStr("FORM"), toStr("*ERROR* You do not have permission to perform these updates.  Processing may be incomplete.")));
							throw new ApplicationException();
						}
						
					}
					catch(Exception  e)
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0002"), toStr("FORM"), toStr("%01%%02%"), toStr(errorCode()), errorMessage()));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.CLR_CALLING_FORM
		    :GLOBAL.CALLING_FORM := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.CLR_CALLING_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_CALLING_FORM")
		public void Guqintf_ClrCallingForm()
		{
			
				setGlobal("CALLING_FORM", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.CLR_ERROR
		    :GLOBAL.CALL_ERROR := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.CLR_ERROR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLR_ERROR")
		public void Guqintf_ClrError()
		{
			
				setGlobal("CALL_ERROR", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.DISABLE_KEYS
		    SET_ITEM_PROPERTY('GJBPRUN_DUMMY',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guqintf_DisableKeys()
		{
			
				setItemEnabled("GJBPRUN_DUMMY", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.DO_NEWFRM
		 BEGIN
  IF G$_NCHK(:GLOBAL.CALL_ERROR <> 'Y') THEN
    IF (:GLOBAL.CALL_FORM = 'TSASPAY' AND 
          :GLOBAL.JOB_ID = 'RPEDISB') THEN
      EXECUTE_TRIGGER( 'CLR_CALLING_FORM' );
      G$_CHECK_FAILURE;
    ELSIF :GLOBAL.CALL_FORM = 'SMARQCM' THEN
      EXECUTE_TRIGGER( 'CLR_CALLING_FORM' );
      G$_CHECK_FAILURE;
      MESSAGE( G$_NLS.Get('GUQINTF-0003', 'FORM','Processing complete.') );
    ELSIF :GLOBAL.CALL_FORM IS NULL THEN
      EXECUTE_TRIGGER( 'CLR_CALLING_FORM' );
      G$_CHECK_FAILURE;
    ELSE
      EXECUTE_TRIGGER( 'SET_CALLING_FORM' );
      G$_CHECK_FAILURE;
      NEW_FORM( :GLOBAL.CALL_FORM );
      G$_CHECK_FAILURE;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.DO_NEWFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DO_NEWFRM")
		public void Guqintf_DoNewfrm()
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getGlobal("CALL_ERROR").notEquals("Y"))).getValue())
				{
					if ((getGlobal("CALL_FORM").equals("TSASPAY") && getGlobal("JOB_ID").equals("RPEDISB")))
					{
						executeAction("CLR_CALLING_FORM");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( getGlobal("CALL_FORM").equals("SMARQCM") ) {
						executeAction("CLR_CALLING_FORM");
						getTask().getGoqrpls().gCheckFailure();
						message(GNls.Fget(toStr("GUQINTF-0003"), toStr("FORM"), toStr("Processing complete.")));
					}
					else if ( getGlobal("CALL_FORM").isNull() ) {
						executeAction("CLR_CALLING_FORM");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("SET_CALLING_FORM");
						getTask().getGoqrpls().gCheckFailure();
						newTask(getGlobal("CALL_FORM").toString());
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('GJBPRUN_DUMMY',ENABLED) = 'FALSE' THEN
  SET_ITEM_PROPERTY('GJBPRUN_DUMMY',ENABLED,PROPERTY_ON);
  SET_ITEM_PROPERTY('GJBPRUN_DUMMY',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guqintf_EnableKeys()
		{
			
				if ( getItemEnabled("GJBPRUN_DUMMY").equals("FALSE") )
				{
					setItemEnabled("GJBPRUN_DUMMY", true);
					setItemNavigable("GJBPRUN_DUMMY", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.GET_COMMAND_NAME
		 DECLARE
  CURSOR PTI_CURSOR IS
    SELECT GJBJOBS_COMMAND_NAME
      FROM GJBJOBS
     WHERE GJBJOBS_JOB_TYPE_IND <> 'F'
       AND GJBJOBS_NAME = :JOB_ID;
BEGIN
  :COMMAND_NAME := '';
--
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO :COMMAND_NAME;
  CLOSE PTI_CURSOR;
--
  IF :COMMAND_NAME IS NULL THEN
    :COMMAND_NAME := :JOB_ID;
  END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.GET_COMMAND_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_COMMAND_NAME")
		public void Guqintf_GetCommandName()
		{
			
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT GJBJOBS_COMMAND_NAME " +
	" FROM GJBJOBS " +
	" WHERE GJBJOBS_JOB_TYPE_IND <> 'F' AND GJBJOBS_NAME = :JOB_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						getFormModel().getDummy().setCommandName(toStr(""));
						// 
						//Setting query parameters
						ptiCursor.addParameter("JOB_ID", getFormModel().getDummy().getJobId());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getDummy().setCommandName(ptiCursorResults.getStr(0));
						}
						ptiCursor.close();
						// 
						if ( getFormModel().getDummy().getCommandName().isNull() )
						{
							getFormModel().getDummy().setCommandName(getFormModel().getDummy().getJobId());
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.GET_STATUS
		 DECLARE
  CURSOR PTI_CURSOR IS
    SELECT GJBRSLT_STATUS_IND,
           GJBRSLT_MESSAGE
      FROM GJBRSLT
     WHERE GJBRSLT_ONE_UP_NO = :ONE_UP_NO
       AND GJBRSLT_JOB = :JOB_ID;
BEGIN
  :STATUS_IND := '';
  :GLOBAL.CALL_ERROR := '';
  :MESSAGE_TEXT := '';
  :GLOBAL.CALL_STATUS_MSG := '';
--
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO :STATUS_IND, :MESSAGE_TEXT;
  CLOSE PTI_CURSOR;
--
-- 1.11-2
--
  :GLOBAL.CALL_STATUS_MSG := :MESSAGE_TEXT;    
  IF :JOB_ID = 'GUAVRFY' THEN
    IF :STATUS_IND = 'C' THEN
      EXECUTE_TRIGGER( 'CLR_ERROR' );
      G$_CHECK_FAILURE;
    ELSE
      EXECUTE_TRIGGER( 'SET_ERROR' );
      G$_CHECK_FAILURE;
    END IF;
  ELSE
    IF :STATUS_IND = 'S' THEN
      EXECUTE_TRIGGER( 'CLR_ERROR' );
      G$_CHECK_FAILURE;
    ELSIF :STATUS_IND = 'I' THEN
      EXECUTE_TRIGGER( 'SET_INFO' );
      G$_CHECK_FAILURE;
    ELSE
      EXECUTE_TRIGGER( 'SET_ERROR' );
      G$_CHECK_FAILURE;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.GET_STATUS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_STATUS")
		public void Guqintf_GetStatus()
		{
			
				int rowCount = 0;
				int counter = 50;
				{
					
					String sqlptiCursor = "SELECT GJBRSLT_STATUS_IND, GJBRSLT_MESSAGE " +
	" FROM GJBRSLT " +
	" WHERE GJBRSLT_ONE_UP_NO = :ONE_UP_NO AND GJBRSLT_JOB = :JOB_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					getFormModel().getDummy().setStatusInd(toStr(""));
					setGlobal("CALL_ERROR", toStr(""));
					getFormModel().getDummy().setMessageText(toStr(""));
					setGlobal("CALL_STATUS_MSG", toStr(""));
					// 
					//Setting query parameters
					ptiCursor.addParameter("ONE_UP_NO", getFormModel().getDummy().getOneUpNo());
					ptiCursor.addParameter("JOB_ID", getFormModel().getDummy().getJobId());
					try {
						while (counter > 0)
						{
							
								
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									getFormModel().getDummy().setStatusInd(ptiCursorResults.getStr(0));
									getFormModel().getDummy().setMessageText(ptiCursorResults.getStr(1));
									ptiCursor.close();
									break;
								}
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
								}
								ptiCursor.close();
								--counter;
						}
						// 
						//  1.11-2
						// 
						setGlobal("CALL_STATUS_MSG", getFormModel().getDummy().getMessageText());
						if ( getFormModel().getDummy().getJobId().equals("GUAVRFY") )
						{
							if ( getFormModel().getDummy().getStatusInd().equals("C") )
							{
								executeAction("CLR_ERROR");
								getTask().getGoqrpls().gCheckFailure();
							}
							else {
								executeAction("SET_ERROR");
								getTask().getGoqrpls().gCheckFailure();
							}
						}
						else {
							if ( getFormModel().getDummy().getStatusInd().equals("S") )
							{
								executeAction("CLR_ERROR");
								getTask().getGoqrpls().gCheckFailure();
							}
							else if ( getFormModel().getDummy().getStatusInd().equals("I") ) {
								executeAction("SET_INFO");
								getTask().getGoqrpls().gCheckFailure();
							}
							else {
								executeAction("SET_ERROR");
								getTask().getGoqrpls().gCheckFailure();
							}
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.GET_USER_ID
		 BEGIN
  :ALT_USER_ID := SUBSTR(USER, 5);
  :ALT_PASSWORD := '/';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.GET_USER_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_USER_ID")
		public void Guqintf_GetUserId()
		{
			
				getFormModel().getDummy().setAltUserId(substring(getUser(), toInt(5)));
				getFormModel().getDummy().setAltPassword(toStr("/"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.GLOBAL_COPY
		 BEGIN
  :JOB_ID    := :GLOBAL.JOB_ID;
  :ONE_UP_NO := :GLOBAL.ONE_UP_NO;
--
  IF :GLOBAL.PRNT_CODE IS NULL THEN
    :PRNT_CODE := 'default';
  ELSE
    :PRNT_CODE := :GLOBAL.PRNT_CODE;
  END IF;
--
  IF :IS_AUTO_LOGIN = 'Y' THEN
    IF :GLOBAL.ALT_USER_ID IS NULL THEN
      EXECUTE_TRIGGER( 'GET_USER_ID' );
      G$_CHECK_FAILURE;
      RETURN;
    END IF;
  END IF;
--
  :ALT_USER_ID  := :GLOBAL.ALT_USER_ID;
  :ALT_PASSWORD := :GLOBAL.ALT_PASSWORD;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guqintf_GlobalCopy()
		{
			
				getFormModel().getDummy().setJobId(getGlobal("JOB_ID"));
				getFormModel().getDummy().setOneUpNo(toNumber(getGlobal("ONE_UP_NO")));
				// 
				if ( getGlobal("PRNT_CODE").isNull() )
				{
					getFormModel().getDummy().setPrntCode(toStr("default"));
				}
				else {
					getFormModel().getDummy().setPrntCode(getGlobal("PRNT_CODE"));
				}
				// 
				if ( getFormModel().getDummy().getIsAutoLogin().equals("Y") )
				{
					if ( getGlobal("ALT_USER_ID").isNull() )
					{
						executeAction("GET_USER_ID");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				// TODO: Temporary solution for SSO job user submission
				
				if (!StringHelper.isNullOrEmpty(getGlobal("ALT_USER_ID").getValue()) && !StringHelper.isNullOrEmpty(getGlobal("ALT_USER_ID").getValue()))
				{
					getFormModel().getDummy().setAltUserId(getGlobal("ALT_USER_ID"));
					getFormModel().getDummy().setAltPassword(getGlobal("ALT_PASSWORD"));
				}
				else
				{	
					if (StringHelper.isNullOrEmpty(getEnvVar("jobSubUser").getValue())) 				{
						getFormModel().getDummy().setAltUserId(getGlobal("ALT_USER_ID"));				
					}
					else{
						getFormModel().getDummy().setAltUserId(getEnvVar("jobSubUser"));
					}
					if (StringHelper.isNullOrEmpty(getEnvVar("jobSubPwd").getValue())) {
						getFormModel().getDummy().setAltPassword(getGlobal("ALT_PASSWORD"));
					}
					else {
						getFormModel().getDummy().setAltPassword(getEnvVar("jobSubPwd"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.HOST_COMMANDS
		 BEGIN
  EXECUTE_TRIGGER( 'GET_COMMAND_NAME' );
  G$_CHECK_FAILURE;
-- 
  IF :GLOBAL.OPSYS IS NULL THEN
    MESSAGE( G$_NLS.Get('GUQINTF-0004', 'FORM','*ERROR* Your operating system has not been established on GUAINST') );
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  END IF;
--
  :SYSTEM.MESSAGE_LEVEL := '5';
  IF :GLOBAL.OPSYS = 'AOS' THEN
     :COMMAND_NAME := :COMMAND_NAME || '.CLI';
  ELSIF :GLOBAL.OPSYS = 'CMS' THEN
     :COMMAND_NAME := 'EXEC ' || :COMMAND_NAME;
  ELSIF :GLOBAL.OPSYS = 'WNT' THEN
     :COMMAND_NAME := 'perl ' || LOWER(:COMMAND_NAME);
  ELSIF :GLOBAL.OPSYS = 'UNX' THEN
     :COMMAND_NAME := LOWER(:COMMAND_NAME) || '.shl';
  ELSE
     NULL;
  END IF;
--
  EXECUTE_TRIGGER( 'STANDARD_CALL' );
  G$_CHECK_FAILURE;
  :SYSTEM.MESSAGE_LEVEL := '0';
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.HOST_COMMANDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="HOST_COMMANDS")
		public void Guqintf_HostCommands()
		{
			
				executeAction("GET_COMMAND_NAME");
				getTask().getGoqrpls().gCheckFailure();
				//  
				if ( getGlobal("OPSYS").isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUQINTF-0004"), toStr("FORM"), toStr("*ERROR* Your operating system has not been established on GUAINST")));
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
				// 
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try{
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(5));
				if ( getGlobal("OPSYS").equals("AOS") )
				{
					getFormModel().getDummy().setCommandName(getFormModel().getDummy().getCommandName().append(".CLI"));
				}
				else if ( getGlobal("OPSYS").equals("CMS") ) {
					getFormModel().getDummy().setCommandName(toStr("EXEC ").append(getFormModel().getDummy().getCommandName()));
				}
				else if ( getGlobal("OPSYS").equals("WNT") ) {
					getFormModel().getDummy().setCommandName(toStr("perl ").append(lower(getFormModel().getDummy().getCommandName())));
				}
				else if ( getGlobal("OPSYS").equals("UNX") ) {
					getFormModel().getDummy().setCommandName(lower(getFormModel().getDummy().getCommandName()).append(".shl"));
				}
				else {
				}
				// 
				executeAction("STANDARD_CALL");
				getTask().getGoqrpls().gCheckFailure();
				} finally {
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					MessageServices.resetMessageLevel();
				}
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.JS_HOST_COMMANDS
		 -- 75-1  add DECLARE for calls to new GJRINVC table for prohibited characters
DECLARE
	lv_parm_type GJRINVC.GJRINVC_PARM_TYPE%TYPE;
BEGIN
  IF :GLOBAL.OPSYS IS NULL THEN
    MESSAGE( G$_NLS.Get('GUQINTF-0005', 'FORM','*ERROR* Your operating system has not been established on GUAINST') );
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  END IF;
--
  :SYSTEM.MESSAGE_LEVEL := '5';
  IF :GLOBAL.OPSYS = 'AOS' THEN
    :HOST_PREFIX := 'GJAJOBS.CLI ';
  ELSIF :GLOBAL.OPSYS = 'WNT' THEN
    :HOST_PREFIX := 'perl gjajobs.pl';
  ELSIF :GLOBAL.OPSYS = 'CMS' THEN
    :HOST_PREFIX := 'EXEC GJAJOBS ';
  ELSIF :GLOBAL.OPSYS = 'MPE' THEN
    :HOST_PREFIX := 'GJAJOBS ';
  ELSIF :GLOBAL.OPSYS = 'NVE' THEN
    :HOST_PREFIX := 'GJAJOBS ';
  ELSIF :GLOBAL.OPSYS = 'UNX' THEN
    :HOST_PREFIX := 'gjajobs.shl ';
  ELSIF :GLOBAL.OPSYS = 'VMS' THEN
    :HOST_PREFIX := 'GJAJOBS ';
  END IF;
--
  IF :GLOBAL.PRNT_FORM IS NULL  THEN
    :GLOBAL.PRNT_FORM := 'LANDSCAPE';
  END IF;
    
-- 75-1 modify code to access new Character Validation table once per parameter type
      lv_parm_type := 'UID';
      IF  NOT GOKPVAL.F_VALID_JOBSUB_PARM(lv_parm_type,:ALT_USER_ID) THEN
 					MESSAGE(G$_NLS.Get('GUQINTF-0006','FORM','*ERROR* Unsupported character detected in your User ID.  Job not submitted.') );
   				:GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
   				G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
     	END IF;
    	--
   		lv_parm_type := 'PWD';
   		IF  NOT GOKPVAL.F_VALID_JOBSUB_PARM(lv_parm_type,:ALT_PASSWORD) THEN
    			MESSAGE(G$_NLS.Get('GUQINTF-0007','FORM','*ERROR* Unsupported character detected in your password.  Job not submitted.') );
        	:GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
        	G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      END IF;
    	--
    	lv_parm_type := 'PRT';
    	IF  NOT GOKPVAL.F_VALID_JOBSUB_PARM(lv_parm_type,:GLOBAL.PRNT_FORM) THEN
 					MESSAGE(G$_NLS.Get('GUQINTF-0008','FORM','*ERROR* Unsupported character detected in your Special Print field.  Job not submitted.') );
   				:GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
   				G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
   		END IF;
-- 75-1
--
  IF :GLOBAL.OPSYS = 'MPE' THEN
    :COMMAND_STRING := :HOST_PREFIX || ',' || :GLOBAL.JOB_ID ||
         ',' || :GLOBAL.JOB_TYPE_IND || ',' || :ALT_USER_ID || ','
         || :ALT_PASSWORD || ',' || :GLOBAL.ONE_UP_NO || ',' ||
         :PRNT_CODE || ',' || :GLOBAL.PRNT_FORM || ',' ||
         :GLOBAL.SUBMIT_TIME;
  ELSE
    :COMMAND_STRING := :HOST_PREFIX || ' ' || :GLOBAL.JOB_ID ||
         ' ' || :GLOBAL.JOB_TYPE_IND || ' ' ||LOWER( :ALT_USER_ID) || ' '
         || :ALT_PASSWORD || ' ' || :GLOBAL.ONE_UP_NO || ' ' ||
         :PRNT_CODE || ' ' || :GLOBAL.PRNT_FORM || ' ' ||
         :GLOBAL.SUBMIT_TIME;
  END IF;
--
-- --
-- --
  IF (GB_ADVQ_UTIL.F_USE_AQ_AND_NOT_PIPES('AQ4PIPES','GURJOBS') AND
  	  GB_ADVQ_UTIL.F_USE_AQ_AND_NOT_PIPES('AQ4PIPES','GURJOBS_RTN')) THEN
    AQIT;
  ELSE
    EXECUTE_TRIGGER('PIPEIT');
  END IF;
-- --
-- --
--
  :SYSTEM.MESSAGE_LEVEL := '0';
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END;
		*/
		/*
		 *<p>
		 *1.11-3
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.JS_HOST_COMMANDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="JS_HOST_COMMANDS")
		public void Guqintf_JsHostCommands()
		{
			
				//  75-1  add DECLARE for calls to new GJRINVC table for prohibited characters
				{
					NString lvParmType= NString.getNull();
					if ( getGlobal("OPSYS").isNull() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0005"), toStr("FORM"), toStr("*ERROR* Your operating system has not been established on GUAINST")));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					// 
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
					try { 
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(5));
					if ( getGlobal("OPSYS").equals("AOS") )
					{
						getFormModel().getDummy().setHostPrefix(toStr("GJAJOBS.CLI "));
					}
					else if ( getGlobal("OPSYS").equals("WNT") ) {
						getFormModel().getDummy().setHostPrefix(toStr("perl gjajobs.pl"));
					}
					else if ( getGlobal("OPSYS").equals("CMS") ) {
						getFormModel().getDummy().setHostPrefix(toStr("EXEC GJAJOBS "));
					}
					else if ( getGlobal("OPSYS").equals("MPE") ) {
						getFormModel().getDummy().setHostPrefix(toStr("GJAJOBS "));
					}
					else if ( getGlobal("OPSYS").equals("NVE") ) {
						getFormModel().getDummy().setHostPrefix(toStr("GJAJOBS "));
					}
					else if ( getGlobal("OPSYS").equals("UNX") ) {
						getFormModel().getDummy().setHostPrefix(toStr("gjajobs.shl "));
					}
					else if ( getGlobal("OPSYS").equals("VMS") ) {
						getFormModel().getDummy().setHostPrefix(toStr("GJAJOBS "));
					}
					// 
					if ( getGlobal("PRNT_FORM").isNull() )
					{
						setGlobal("PRNT_FORM", toStr("LANDSCAPE"));
					}
					//  75-1 modify code to access new Character Validation table once per parameter type
					lvParmType = toStr("UID");
					if ( Gokpval.fValidJobsubParm(lvParmType, getFormModel().getDummy().getAltUserId()).not() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0006"), toStr("FORM"), toStr("*ERROR* Unsupported character detected in your User ID.  Job not submitted.")));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					// 
					lvParmType = toStr("PWD");
					if ( Gokpval.fValidJobsubParm(lvParmType, getFormModel().getDummy().getAltPassword()).not() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0007"), toStr("FORM"), toStr("*ERROR* Unsupported character detected in your password.  Job not submitted.")));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					// 
					lvParmType = toStr("PRT");
					if ( Gokpval.fValidJobsubParm(lvParmType, getGlobal("PRNT_FORM")).not() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0008"), toStr("FORM"), toStr("*ERROR* Unsupported character detected in your Special Print field.  Job not submitted.")));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					//  75-1
					// 

					//Added by dghant (5.6.2015)==================================================================
					//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)
					//Morphis implementation below
					if (getGlobal("JS_PRXY_SID").isNotNull()){
						if (getGlobal("JS_PRXY_ENFORCED").equals("Y") && getGlobal("JS_PRXY_USER_IND").equals("N")){
							errorMessage(GNls.Fget(toStr("GUQINTF-0040"), toStr("FORM"), toStr("*ERROR* Job Submission Proxy enforced and User ID not granted proxy access.  Job not submitted.")));
							setGlobal("GURJOBS_PIPE_FAILED", "Y");
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						}
						if (getGlobal("JS_PRXY_USER_IND").equals("Y") && (getGlobal("CURRENT_USER").toString().length() > 28) ){
							errorMessage(GNls.Fget(toStr("GUQINTF-0041"), toStr("FORM"), toStr("*ERROR* Job Submission Proxy in use. Length of User ID must be less than 29 characters.  Job not submitted.")));
							setGlobal("GURJOBS_PIPE_FAILED", "Y");
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						}
					}
					
					if ( getGlobal("OPSYS").equals("MPE") )
					{
						getFormModel().getDummy().setCommandString(getFormModel().getDummy().getHostPrefix().append(",").append(getGlobal("JOB_ID")).append(",").append(getGlobal("JOB_TYPE_IND")).append(",").append(getFormModel().getDummy().getAltUserId()).append(",").append(getFormModel().getDummy().getAltPassword()).append(",").append(getGlobal("ONE_UP_NO")).append(",").append(getFormModel().getDummy().getPrntCode()).append(",").append(getGlobal("PRNT_FORM")).append(",").append(getGlobal("SUBMIT_TIME")));
					}
					else {
						
						//Added by dghant (5.6.2015)==================================================================
						//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)						
						//Morphis implementation below
						if (getGlobal("JS_PRXY_SID").isNotNull() && getGlobal("JS_PRXY_USER_IND").equals("Y")){
								setGlobal("ALT_USER_ID", "["+getGlobal("CURRENT_USER").toString()+"]");
								setGlobal("ALT_PASSWORD", getGlobal("JS_PRXY_SID").toString());
						}
						//This linen below needed to be re-adjusted.
						//getFormModel().getDummy().setCommandString(getFormModel().getDummy().getHostPrefix().append(" ").append(getGlobal("JOB_ID")).append(" ").append(getGlobal("JOB_TYPE_IND")).append(" ").append(lower(getFormModel().getDummy().getAltUserId())).append(" ").append(getFormModel().getDummy().getAltPassword()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(getFormModel().getDummy().getPrntCode()).append(" ").append(getGlobal("PRNT_FORM")).append(" ").append(getGlobal("SUBMIT_TIME")));
						getFormModel().getDummy().setCommandString(getFormModel().getDummy().getHostPrefix().append(" ").append(getGlobal("JOB_ID")).append(" ").append(getGlobal("JOB_TYPE_IND")).append(" ").append(lower(getGlobal("ALT_USER_ID").toString())).append(" ").append(getGlobal("ALT_PASSWORD").toString()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(getFormModel().getDummy().getPrntCode()).append(" ").append(getGlobal("PRNT_FORM")).append(" ").append(getGlobal("SUBMIT_TIME")));
						
					}
					// 
					//  --
					//  --
					if ((GbAdvqUtil.fUseAqAndNotPipes(toStr("AQ4PIPES"), toStr("GURJOBS")).getValue() && GbAdvqUtil.fUseAqAndNotPipes(toStr("AQ4PIPES"), toStr("GURJOBS_RTN")).getValue()))
					{
						this.getTask().getServices().aqit();
					}
					else {
						executeAction("PIPEIT");
					}
					//  --
					//  --
					// 
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {							
						//morphis.foundations.core.appsupportlib.runtime.ItemServices.log();
						
						//MessageServices.errorMessage(log.toString());
						MessageServices.resetMessageLevel();
						//Logger log = log(GuqintfFormController.class.getName());
						//Logger log =  Logger.getLogger(PtvsmplFormController.class.getName());
					}
								
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.KEY-OTHERS
		    MESSAGE( G$_NLS.Get('GUQINTF-0009', 'FORM','Undefined function key. Press <Show Keys> for list of valid keys.')  ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-OTHERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-OTHERS")
		public void Guqintf_KeyOthers()
		{
			
				errorMessage(GNls.Fget(toStr("GUQINTF-0009"), toStr("FORM"), toStr("*ERROR* Undefined Function Key. Press <Show Keys> for list of valid keys.")));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.KEY-EXIT
		 BEGIN
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guqintf_Exit()
		{
			
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.LIST_VALUES_COPY
		 G$_LIST_VALUES_COPY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guqintf_ListValuesCopy()
		{
			
				getTask().getGoqrpls().gListValuesCopy();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guqintf_LoadCurrentRelease()
		{
			
				getFormModel().getDummy().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.PRE_FORM_TRG
		 BEGIN
  IF (SUBSTR(USER, 1, 4) = 'OPS$') THEN
    :IS_AUTO_LOGIN := 'Y';
    RETURN;
  END IF;
--
  IF :GLOBAL.ALT_USER_ID IS NOT NULL AND
     :GLOBAL.ALT_PASSWORD IS NOT NULL THEN
    RETURN;
  END IF;
--
  :HOLD_JOB_ID       := :GLOBAL.JOB_ID;
  :HOLD_CALL_FORM    := :GLOBAL.CALL_FORM;
  :HOLD_ONE_UP_NO    := :GLOBAL.ONE_UP_NO;
  :HOLD_DISPLAY_MSG  := :GLOBAL.CALL_DISPLAY_MSG;
  :GLOBAL.CALL_ERROR := 'N';
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'GUAUIPW','QUERY');
  IF NOT FORM_SUCCESS THEN
    :GLOBAL.CALL_ERROR := 'Y';
    MESSAGE( G$_NLS.Get('GUQINTF-0010', 'FORM','*ERROR* Occurred during call to Alternate User-ID/Password form.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :GLOBAL.ALT_USER_ID IS NULL OR
     :GLOBAL.ALT_PASSWORD IS NULL THEN
    :GLOBAL.CALL_ERROR := 'Y';
    MESSAGE( G$_NLS.Get('GUQINTF-0011', 'FORM','*ERROR* Alternate User-ID and Password missing, aborting program')  );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GLOBAL.JOB_ID           := :HOLD_JOB_ID;
  :GLOBAL.CALL_FORM        := :HOLD_CALL_FORM;
  :GLOBAL.ONE_UP_NO        := :HOLD_ONE_UP_NO;
  :GLOBAL.CALL_DISPLAY_MSG := :HOLD_DISPLAY_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guqintf_PreFormTrg()
		{
			
				if ((substring(getUser(), toInt(1), toInt(4)).equals("OPS$")))
				{
					getFormModel().getDummy().setIsAutoLogin(toStr("Y"));
					return ;
				}
				// 
				if ( !getGlobal("ALT_USER_ID").isNull() && !getGlobal("ALT_PASSWORD").isNull() )
				{
					return ;
				}
				// 
				getFormModel().getDummy().setHoldJobId(getGlobal("JOB_ID"));
				getFormModel().getDummy().setHoldCallForm(getGlobal("CALL_FORM"));
				getFormModel().getDummy().setHoldOneUpNo(toNumber(getGlobal("ONE_UP_NO")));
				getFormModel().getDummy().setHoldDisplayMsg(getGlobal("CALL_DISPLAY_MSG"));
				setGlobal("CALL_ERROR", toStr("N"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				try{
					getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUAUIPW"), toStr("QUERY"));
				}catch(Exception e){
					setGlobal("CALL_ERROR", toStr("Y"));
					errorMessage(GNls.Fget(toStr("GUQINTF-0010"), toStr("FORM"), toStr("*ERROR* Occurred during call to Alternate User-ID/Password form.")));
					throw new ApplicationException();
				} 
				if ( getGlobal("ALT_USER_ID").isNull() || getGlobal("ALT_PASSWORD").isNull() )
				{
					setGlobal("CALL_ERROR", toStr("Y"));
					errorMessage(GNls.Fget(toStr("GUQINTF-0011"), toStr("FORM"), toStr("*ERROR* Alternate User-ID and Password missing, aborting program")));
					throw new ApplicationException();
				}
				// 
				setGlobal("JOB_ID", getFormModel().getDummy().getHoldJobId());
				setGlobal("CALL_FORM", getFormModel().getDummy().getHoldCallForm());
				setGlobal("ONE_UP_NO", toStr(getFormModel().getDummy().getHoldOneUpNo()));
				setGlobal("CALL_DISPLAY_MSG", getFormModel().getDummy().getHoldDisplayMsg());
			}
		
		/*Metodo para controlar se se mostra a mensagem a processar ou n pois n sabemos o impacto que poderá ter no projecto 04-05-2015 Luis Luz*/
		boolean showCallForm(String str){
			
			switch(str){
				case "GJAPCTL":
				{
					return false;
				}
				default:
				{
					return true;
				}
			}
		}
		

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.PIPEIT
		 DECLARE
  STATUS         NUMBER;
  MAX_WAIT       INTEGER := 15;
  MAX_SIZE       INTEGER := 8192;
  LOOP_NUM       INTEGER;
  LOOP_CNT       INTEGER := 0;
  X_POS          INTEGER := -2;
  COMMAND_TYPE   VARCHAR2(30) := 'WAIT';
  WHAT_PIPE      VARCHAR2(30) := 'GURJOBS';
  RETURN_PIPE    VARCHAR2(30);
  RETURN_MESSAGE VARCHAR2(200);
  SEND_REC_IND   VARCHAR2(1) := 'S';
  SHOW_STAT_IND  VARCHAR2(1) := 'N';
--
BEGIN
  DEFAULT_VALUE('15','GLOBAL.MAX_WAIT_TIME');
-- 5.5 START
  DEFAULT_VALUE('NONE','GLOBAL.ALT_PIPE_NAME');
  IF :GLOBAL.ALT_PIPE_NAME <> 'NONE' THEN
     WHAT_PIPE := :GLOBAL.ALT_PIPE_NAME;
  END IF;
-- 5.5 END
  IF :GLOBAL.CALL_FORM = 'GJAPCTL' THEN
    COMMAND_TYPE := 'HOST';
    LOOP_NUM := 4;
  ELSE
    COMMAND_TYPE := 'WAIT';
    LOOP_NUM := TO_NUMBER(:GLOBAL.MAX_WAIT_TIME) * 4;
    SHOW_STAT_IND := 'Y';
  END IF;
--
  IF :GLOBAL.WAIT_UNTIL_DONE = 'Y' THEN
    LOOP_NUM := TO_NUMBER(:GLOBAL.MAX_WAIT_TIME) * 4;
    :GLOBAL.WAIT_UNTIL_DONE := 'N';
    SHOW_STAT_IND := 'Y';
  END IF;
--
  IF SHOW_STAT_IND = 'Y' THEN
    :PROCESS_STATUS :=  G$_NLS.Get('GUQINTF-0012', 'FORM','Status: Sending request.') ;
    SET_ITEM_PROPERTY('DUMMY.PROCESS_STATUS',DISPLAYED,PROPERTY_TRUE);
    SYNCHRONIZE;
  END IF;
--
-- Begin send logic.
--
  :GLOBAL.PIPE_TIMED_OUT := 'N';
  :GLOBAL.GURJOBS_PIPE_FAILED := 'N';
  RETURN_PIPE := GOKDBMS.PIPE_UNIQUE_SESSION_NAME;
  GOKDBMS.PIPE_PURGE(RETURN_PIPE);
--
-- Check for MIF and pass campus code as part of COMMAND_TYPE. i.e. HOST::CAMP1 or
-- WAIT::CAMP1. gurjobs will parse the mif-code for later job execution.
--
  IF G$_VPDI_SECURITY.G$_IS_MIF_ENABLED THEN
  	COMMAND_TYPE := COMMAND_TYPE || '::' || G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC;
  END IF;
  GOKDBMS.PIPE_PACK_MESSAGE(COMMAND_TYPE);
  GOKDBMS.PIPE_PACK_MESSAGE(:COMMAND_STRING);
  GOKDBMS.PIPE_PACK_MESSAGE(RETURN_PIPE);
--
  IF SUBSTR(COMMAND_TYPE,5,2) = '::' THEN
  	COMMAND_TYPE := SUBSTR(COMMAND_TYPE,1,4);
  END IF;
--
  IF :GLOBAL.GURJOBS_DIRECTORY IS NOT NULL THEN
    IF :GLOBAL.GURJOBS_DIRECTORY <> 'UNKNOWN' THEN
      GOKDBMS.PIPE_PACK_MESSAGE(:GLOBAL.GURJOBS_DIRECTORY);
    END IF;
  END IF;
--
  STATUS := GOKDBMS.PIPE_SEND_MESSAGE(WHAT_PIPE,30,MAX_SIZE);
  IF STATUS <> 0 THEN 
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    IF STATUS = 1 THEN
      MESSAGE(G$_NLS.Get('GUQINTF-0013','FORM','*ERROR* Unable to submit job. Verify that the gurjobs program is running.') );
    ELSE
      MESSAGE(G$_NLS.Get('GUQINTF-0014','FORM','*ERROR* The process has been interrupted, please try again.') );
    END IF;
    RETURN;
  END IF;
--
-- Begin receive logic.
--
  IF SHOW_STAT_IND = 'Y' THEN
    IF G$_ENV_IS_WINDOWS THEN
      :PROCESS_IND := 'v';
    END IF;
    :PROCESS_STATUS := G$_NLS.Get('GUQINTF-0015','FORM','Status: Waiting for completion.');
    SYNCHRONIZE;
  END IF;
--
  SEND_REC_IND := 'R';
  FOR I IN 1..LOOP_NUM LOOP
    STATUS := 0;
    STATUS := GOKDBMS.PIPE_RECEIVE_MESSAGE(RETURN_PIPE,MAX_WAIT);
--
    IF STATUS = 0 THEN 
      GOKDBMS.PIPE_UNPACK_MESSAGE(RETURN_MESSAGE);
      IF COMMAND_TYPE <> 'WAIT' THEN
        MESSAGE(RETURN_MESSAGE,NO_ACKNOWLEDGE);
      END IF;
      EXIT;
    ELSIF STATUS = 1 THEN
      IF SHOW_STAT_IND = 'Y' THEN
        IF LOOP_CNT = 10 THEN
          LOOP_CNT := 0;
          X_POS := -2;
        END IF;
--
        LOOP_CNT := LOOP_CNT + 1;
        X_POS := X_POS + 7;
        SET_ITEM_PROPERTY('DUMMY.PROCESS_IND',DISPLAYED,PROPERTY_TRUE);
        SET_ITEM_PROPERTY('DUMMY.PROCESS_IND',POSITION,X_POS,4);
        SYNCHRONIZE;
      END IF;
    ELSE
      EXIT;
    END IF;
  END LOOP;
--
  IF STATUS = 0 THEN
    RETURN;
  ELSIF STATUS = 1 THEN
    :GLOBAL.PIPE_TIMED_OUT := 'Y';
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    MESSAGE(G$_NLS.Get('GUQINTF-0016','FORM','*Warning* Timed out waiting for response from job submission program.') );
  ELSIF STATUS = 2 THEN
    :GLOBAL.PIPE_TIMED_OUT := 'Y';
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    MESSAGE(G$_NLS.Get('GUQINTF-0017','FORM','*ERROR* An internal error has occurred. Contact tech support.') );
  ELSIF STATUS = 3 THEN
    :GLOBAL.PIPE_TIMED_OUT := 'Y';
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    MESSAGE(G$_NLS.Get('GUQINTF-0018','FORM','*ERROR* An interrupt has occurred. Contact tech support.') );
  ELSE
    :GLOBAL.PIPE_TIMED_OUT := 'Y';
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    MESSAGE(G$_NLS.Get('GUQINTF-0019','FORM','*ERROR* The process has aborted while waiting for a response from Job Submission.') );
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    :GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
    IF SEND_REC_IND = 'S' THEN
      MESSAGE(G$_NLS.Get('GUQINTF-0020','FORM','*ERROR* Sending request caused: %01% %02%',
              TO_CHAR(SQLCODE), SUBSTR(SQLERRM,1,150)));
    ELSE
      MESSAGE(G$_NLS.Get('GUQINTF-0021','FORM','*ERROR* Receiving results caused: %01% %02%',
              TO_CHAR(SQLCODE), SUBSTR(SQLERRM,1,150)));
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.PIPEIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PIPEIT")
		public void Guqintf_Pipeit()
		{


				{
					NNumber status= NNumber.getNull();
					NInteger maxWait = toInt(15);
					NInteger maxSize = toInt(8192);
					NInteger loopNum= NInteger.getNull();
					NInteger loopCnt = toInt(0);
					NInteger xPos = new NInteger(-2);
					NString commandType = toStr("WAIT");
					NString whatPipe = toStr("GURJOBS");
					NString returnPipe= NString.getNull();
					NString returnMessage= NString.getNull();
					NString sendRecInd = toStr("S");
					NString showStatInd = toStr("N");
					try
					{
						setDefaultValue("15", "GLOBAL.MAX_WAIT_TIME");
						//  5.5 START
						setDefaultValue("NONE", "GLOBAL.ALT_PIPE_NAME");
						if ( getGlobal("ALT_PIPE_NAME").notEquals("NONE") )
						{
							whatPipe = getGlobal("ALT_PIPE_NAME");
						}
						//  5.5 END
						if ( getGlobal("CALL_FORM").equals("GJAPCTL") )
						{
							commandType = toStr("HOST");
							loopNum = toInt(4);
						}
						else {
							commandType = toStr("WAIT");
							loopNum = toInt(getGlobal("MAX_WAIT_TIME")).multiply(4);
							showStatInd = toStr("Y");
						}
						// 
						if ( getGlobal("WAIT_UNTIL_DONE").equals("Y") )
						{
							loopNum = toInt(getGlobal("MAX_WAIT_TIME")).multiply(4);
							setGlobal("WAIT_UNTIL_DONE", toStr("N"));
							showStatInd = toStr("Y");
						}
						// 
						if ( showStatInd.equals("Y") )
						{
							getFormModel().getDummy().setProcessStatus(GNls.Fget(toStr("GUQINTF-0012"), toStr("FORM"), toStr("Status: Sending request.")));
							setItemVisible("DUMMY.PROCESS_STATUS", true);
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
							//							SupportClasses.SQLFORMS.Synchronize();
							//System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
							doFullNavigation();
						}
						// 
						//  Begin send logic.
						// 
						setGlobal("PIPE_TIMED_OUT", toStr("N"));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("N"));
						returnPipe = Gokdbms.FpipeUniqueSessionName();
						Gokdbms.pipePurge(returnPipe);
						// 
						//  Check for MIF and pass campus code as part of COMMAND_TYPE. i.e. HOST::CAMP1 or
						//  WAIT::CAMP1. gurjobs will parse the mif-code for later job execution.
						// 
						if ( GVpdiSecurity.FgIsMifEnabled().getValue() )
						{
							commandType = commandType.append("::").append(GVpdiSecurity.FgVpdiGetInstCodeFnc());
						}
						Gokdbms.pipePackMessage(commandType);
						Gokdbms.pipePackMessage(getFormModel().getDummy().getCommandString());
						Gokdbms.pipePackMessage(returnPipe);
						// 
						if ( substring(commandType, toInt(5), toInt(2)).equals("::") )
						{
							commandType = substring(commandType, toInt(1), toInt(4));
						}
						// 
						if ( !getGlobal("GURJOBS_DIRECTORY").isNull() )
						{
							if ( getGlobal("GURJOBS_DIRECTORY").notEquals("UNKNOWN") )
							{
								Gokdbms.pipePackMessage(getGlobal("GURJOBS_DIRECTORY"));
							}
						}
						// 
						status = Gokdbms.FpipeSendMessage(whatPipe, toNumber(30), toNumber(maxSize));
						if ( status.notEquals(0) )
						{
							setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
							if ( status.equals(1) )
							{
								errorMessage(GNls.Fget(toStr("GUQINTF-0013"), toStr("FORM"), toStr("*ERROR* Unable to submit job. Verify that the gurjobs program is running.")));
							}
							else {
								errorMessage(GNls.Fget(toStr("GUQINTF-0014"), toStr("FORM"), toStr("*ERROR* The process has been interrupted, please try again.")));
							}
							return ;
						}
						// 
						//  Begin receive logic.
						// 
						if ( showStatInd.equals("Y") )
						{
							if ( getTask().getGoqrpls().gEnvIsWindows().getValue() )
							{
								getFormModel().getDummy().setProcessInd(toStr("v"));
							}
							getFormModel().getDummy().setProcessStatus(GNls.Fget(toStr("GUQINTF-0015"), toStr("FORM"), toStr("Status: Waiting for completion.")));
							doFullNavigation();
						}
						// 
						sendRecInd = toStr("R");
						for ( int i = 1; i <= loopNum.toInt32(); i++ )
						{
							status = toNumber(0);
							status = Gokdbms.FpipeReceiveMessage(returnPipe, toNumber(maxWait));
							// 
							if ( status.equals(0) )
							{
								Ref<NString> p_item_ref = new Ref<NString>(returnMessage);
								Gokdbms.pipeUnpackMessage(p_item_ref);
								returnMessage = p_item_ref.val;
								if ( commandType.notEquals("WAIT") )
								{
									/*
									 *  MORPHIS TODO GEN JM: fix for #ELLBHR-17843, added form name check to avoid showing message in GJAPCTL, due to GUQINTF canvas
									 *  not showing. 
									 */
									//if(!getGlobal("CALL_FORM").equals("GJAPCTL")){	
									if(showCallForm("GJAPCTL")){
										message(returnMessage, OutputMessageUserResponse.NO_ACKNOWLEDGE);
									}
								}
									break;
							}
							else if ( status.equals(1) ) {
								if ( showStatInd.equals("Y") )
								{
									if ( loopCnt.equals(10) )
									{
										loopCnt = toInt(0);
										xPos = new NInteger(-2);
									}
									// 
									loopCnt = loopCnt.add(1);
									xPos = xPos.add(7);
									setItemVisible("DUMMY.PROCESS_IND", true);
									// F2J_NOT_SUPPORTED : The property "ITEM's POSITION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
									//									SupportClasses.FORMS40.SetItemProperty("DUMMY.PROCESS_IND", SupportClasses.Property.POSITION, xPos, 4);
									//System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's POSITION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
									
									// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
									//									SupportClasses.SQLFORMS.Synchronize();
									//System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
									doFullNavigation();
								}
							}
							else {
									break;
							}
						}
						// 
						if ( status.equals(0) )
						{
							return ;
						}
						else if ( status.equals(1) ) {
							setGlobal("PIPE_TIMED_OUT", toStr("Y"));
							setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
							warningMessage(GNls.Fget(toStr("GUQINTF-0016"), toStr("FORM"), toStr("*WARNING* Timed out waiting for response from job submission program.")));
						}
						else if ( status.equals(2) ) {
							setGlobal("PIPE_TIMED_OUT", toStr("Y"));
							setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
							errorMessage(GNls.Fget(toStr("GUQINTF-0017"), toStr("FORM"), toStr("*ERROR* An internal error has occurred. Contact tech support.")));
						}
						else if ( status.equals(3) ) {
							setGlobal("PIPE_TIMED_OUT", toStr("Y"));
							setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
							errorMessage(GNls.Fget(toStr("GUQINTF-0018"), toStr("FORM"), toStr("*ERROR* An interrupt has occurred. Contact tech support.")));
						}
						else {
							setGlobal("PIPE_TIMED_OUT", toStr("Y"));
							setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
							errorMessage(GNls.Fget(toStr("GUQINTF-0019"), toStr("FORM"), toStr("*ERROR* The process has aborted while waiting for a response from Job Submission.")));
						}
					}
					catch(Exception  e)
					{
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						if ( sendRecInd.equals("S") )
						{
							errorMessage(GNls.Fget(toStr("GUQINTF-0020"), toStr("FORM"), toStr("*ERROR* Sending request caused: %01% %02%"), toChar(errorCode()), substring(errorMessage(), toInt(1), toInt(150))));
						}
						else {
							errorMessage(GNls.Fget(toStr("GUQINTF-0021"), toStr("FORM"), toStr("*ERROR* Receiving results caused: %01% %02%"), toChar(errorCode()), substring(errorMessage(), toInt(1), toInt(150))));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.REQUEST_COMPLIANCE
		 BEGIN
  :SYSTEM.MESSAGE_LEVEL := '5';
  GO_BLOCK( 'GJBPRUN' );
  EXECUTE_QUERY;
  EXECUTE_TRIGGER('CALC_ONE_UP_NO');
  IF NOT FORM_SUCCESS THEN
    RETURN;
  END IF;
  :GLOBAL.ONE_UP_NO := :HOLD_ONE_UP_NO;
  EXECUTE_TRIGGER( 'COPY_RQCM_PRUN' );
  G$_CHECK_FAILURE;
  COMMIT_FORM;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.REQUEST_COMPLIANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="REQUEST_COMPLIANCE")
		public void Guqintf_RequestCompliance()
		{
			
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(5));
				goBlock(toStr("GJBPRUN"));
				executeQuery();
				try{
					executeAction("CALC_ONE_UP_NO");	
				}catch(Exception e){
					return ;	
				}
				setGlobal("ONE_UP_NO", toStr(getFormModel().getDummy().getHoldOneUpNo()));
				executeAction("COPY_RQCM_PRUN");
				getTask().getGoqrpls().gCheckFailure();
				commitTask();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.SET_CALLING_FORM
		    :GLOBAL.CALLING_FORM := 'GUQINTF';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.SET_CALLING_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_CALLING_FORM")
		public void Guqintf_SetCallingForm()
		{
			
				setGlobal("CALLING_FORM", toStr("GUQINTF"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.SET_ERROR
		 BEGIN
  :GLOBAL.CALL_ERROR := 'Y';
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.SET_ERROR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_ERROR")
		public void Guqintf_SetError()
		{
			
				setGlobal("CALL_ERROR", toStr("Y"));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.SET_INFO
		    :GLOBAL.CALL_ERROR := 'I';
		*/
		/*
		 *<p>
		 *1.11-2
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.SET_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SET_INFO")
		public void Guqintf_SetInfo()
		{
			
				setGlobal("CALL_ERROR", toStr("I"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.STANDARD_CALL
		 -- 75-1  add DECLARE for calls to new GJRINVC table for prohibited characters
DECLARE
	lv_parm_type GJRINVC.GJRINVC_PARM_TYPE%TYPE;
BEGIN
  IF :GLOBAL.JOB_ID = 'RPOVLDT' THEN
    EXECUTE_TRIGGER( 'BLD_HOST_COMMAND_RPOVLDT' );
    IF NOT FORM_SUCCESS THEN
      RETURN;
    END IF;
  ELSIF :GLOBAL.JOB_ID = 'SMRCMPL' OR :GLOBAL.JOB_ID = 'smrcmpl' THEN
     EXECUTE_TRIGGER( 'BLD_HOST_COMMAND_SMRCMPL' );
     IF NOT FORM_SUCCESS THEN
        RETURN;
     END IF;
     ELSE
    :COMMAND_STRING := :COMMAND_NAME||' '||:ALT_USER_ID||' '||
                       :ALT_PASSWORD||' '||:GLOBAL.ONE_UP_NO||' '||
                       :JOB_ID||' '||:GLOBAL.GURJOBS_DIRECTORY;
     END IF;
--
  IF :GLOBAL.CALL_DISPLAY_MSG IS NOT NULL THEN
    :PROCESS_MSG := LTRIM(RTRIM(:GLOBAL.CALL_DISPLAY_MSG));
    SYNCHRONIZE;
  END IF;
-- 75-1
-- 75-1 modify code to access new Character Validation table once per parameter type
      lv_parm_type := 'UID';
      IF  NOT GOKPVAL.F_VALID_JOBSUB_PARM(lv_parm_type,:ALT_USER_ID) THEN
 					MESSAGE(G$_NLS.Get('GUQINTF-0022','FORM','*ERROR* Unsupported character detected in your User ID.  Job not submitted.') );
   				:GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
   				:GLOBAL.CALL_ERROR := 'Y';
     	END IF;
    	--
   		lv_parm_type := 'PWD';
   		IF  NOT GOKPVAL.F_VALID_JOBSUB_PARM(lv_parm_type,:ALT_PASSWORD) THEN
    			MESSAGE(G$_NLS.Get('GUQINTF-0023','FORM','*ERROR* Unsupported character detected in your password.  Job not submitted.') );
        	:GLOBAL.GURJOBS_PIPE_FAILED := 'Y';
        	:GLOBAL.CALL_ERROR := 'Y';
      END IF;
--
-- 75-1 end
  IF :GLOBAL.CALL_DISPLAY_MSG IS NOT NULL THEN
    :PROCESS_MSG := LTRIM(RTRIM(:GLOBAL.CALL_DISPLAY_MSG));
    SYNCHRONIZE;
  END IF;
--
-- -- 
-- --
  IF (GB_ADVQ_UTIL.F_USE_AQ_AND_NOT_PIPES('AQ4PIPES','GURJOBS') AND
  	  GB_ADVQ_UTIL.F_USE_AQ_AND_NOT_PIPES('AQ4PIPES','GURJOBS_RTN')) THEN
    AQIT;
  ELSE
    EXECUTE_TRIGGER('PIPEIT');
  END IF;
-- --
-- --
--
  IF NOT FORM_SUCCESS THEN
    RETURN;
  END IF;
--
  EXECUTE_TRIGGER( 'GET_STATUS' );
  IF NOT FORM_SUCCESS THEN
    RETURN;
  END IF;
  IF :JOB_ID = 'GUAVRFY' THEN
    RETURN;
  ELSE
    EXECUTE_TRIGGER( 'DO_NEWFRM' );
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.STANDARD_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="STANDARD_CALL")
		public void Guqintf_StandardCall()
		{
			
				//  75-1  add DECLARE for calls to new GJRINVC table for prohibited characters
				{
					NString lvParmType= NString.getNull();
					
					//Added by dghant (5.6.2015)==================================================================
					//-- Following globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)						
					NString lv_error_found = toStr("N");
					
					if ( getGlobal("JOB_ID").equals("RPOVLDT") )
					{
						try {
							executeAction("BLD_HOST_COMMAND_RPOVLDT");
						} catch (Exception e) {
							InteractionManager.getInteractionState().addAttribute(Task.TASK_EVENT_FAILURE, true);
							return;
						}
					}
					else if ( getGlobal("JOB_ID").equals("SMRCMPL") || getGlobal("JOB_ID").equals("smrcmpl") ) {
						try {
							executeAction("BLD_HOST_COMMAND_SMRCMPL");
						} catch (Exception e) {
							InteractionManager.getInteractionState().addAttribute(Task.TASK_EVENT_FAILURE, true);
							return ;
						}
					}
					else {

					//Added by dghant (5.6.2015)==================================================================
					//-- Following globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)						
					//Morphis implementation below							
						
						if (getGlobal("JS_PRXY_SID").isNotNull() && getGlobal("JS_PRXY_USER_IND").equals("Y")){
							if (getGlobal("CURRENT_USER").toString().length() < 29){
								setGlobal("ALT_USER_ID", "["+getGlobal("CURRENT_USER").toString()+"]");
							}
							setGlobal("ALT_PASSWORD", getGlobal("JS_PRXY_SID").toString());
						}
						
						
						//Set command line for PIPE OR QUE
						//getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getFormModel().getDummy().getAltUserId()).append(" ").append(getFormModel().getDummy().getAltPassword()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(getFormModel().getDummy().getJobId()).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));

						//Set command line for PIPE OR QUE
						//The Command String setting below will be replacing the the default command.
						getFormModel().getDummy().setCommandString(getFormModel().getDummy().getCommandName().append(" ").append(getGlobal("ALT_USER_ID").toString()).append(" ").append(getGlobal("ALT_PASSWORD").toString()).append(" ").append(getGlobal("ONE_UP_NO")).append(" ").append(getFormModel().getDummy().getJobId()).append(" ").append(getGlobal("GURJOBS_DIRECTORY")));
							
					//Add ended by dghant (5.6.2015)==================================================================
						
					}
					// 
					if ( !getGlobal("CALL_DISPLAY_MSG").isNull() )
					{
						getFormModel().getDummy().setProcessMsg(ltrim(rtrim(getGlobal("CALL_DISPLAY_MSG"))));
						// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
						//						SupportClasses.SQLFORMS.Synchronize();
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
						
						
					}
					//  75-1
					//  75-1 modify code to access new Character Validation table once per parameter type
					lvParmType = toStr("UID");
					if ( Gokpval.fValidJobsubParm(lvParmType, getFormModel().getDummy().getAltUserId()).not() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0022"), toStr("FORM"), toStr("*ERROR* Unsupported character detected in your User ID.  Job not submitted.")));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						setGlobal("CALL_ERROR", toStr("Y"));
					}
					// 
					lvParmType = toStr("PWD");
					if ( Gokpval.fValidJobsubParm(lvParmType, getFormModel().getDummy().getAltPassword()).not() )
					{
						errorMessage(GNls.Fget(toStr("GUQINTF-0023"), toStr("FORM"), toStr("*ERROR* Unsupported character detected in your password.  Job not submitted.")));
						setGlobal("GURJOBS_PIPE_FAILED", toStr("Y"));
						setGlobal("CALL_ERROR", toStr("Y"));
					}
					
					//Added by dghant (5.6.2015)==================================================================
					//-- Following globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)						
					
					//Morphis implementation below	
					if (getGlobal("JS_PRXY_SID").isNotNull()){
						if (getGlobal("JS_PRXY_ENFORCED").equals("Y") && getGlobal("JS_PRXY_USER_IND").equals("N")){
							
							errorMessage(GNls.Fget(toStr("GUQINTF-0042"), toStr("FORM"), toStr("*ERROR* Job Submission Proxy enforced and User ID not granted proxy access.  Job not submitted.")));
							setGlobal("GURJOBS_PIPE_FAILED", "Y");
							setGlobal("CALL_ERROR", "N");
							lv_error_found = toStr("Y");
						}
						if (getGlobal("JS_PRXY_USER_IND").equals("Y") && (getGlobal("CURRENT_USER").toString().length() > 28) ){
							errorMessage(GNls.Fget(toStr("GUQINTF-0043"), toStr("FORM"), toStr("*ERROR* Job Submission Proxy in use. Length of User ID must be less than 29 characters.  Job not submitted.")));
							setGlobal("GURJOBS_PIPE_FAILED", "Y");
							setGlobal("CALL_ERROR", "N");
							lv_error_found = toStr("Y");
						}
					}
					//Add ended by dghant (5.6.2015)==================================================================
					
					// 
					//  75-1 end
					if ( !getGlobal("CALL_DISPLAY_MSG").isNull() )
					{
						getFormModel().getDummy().setProcessMsg(ltrim(rtrim(getGlobal("CALL_DISPLAY_MSG"))));
						// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
						//						SupportClasses.SQLFORMS.Synchronize();
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
						
					}
					// 
					//  -- 
					//  --
					//Added by dghant (5.6.2015)==================================================================
					//-- Following 'transformed' globals loaded per support of JobSub proxy wallet (enhancement CR-000128147)							
					//Morphis implementation below
					if (lv_error_found.equals("Y")){
						return; 
					}
					//Add ended by dghant (5.6.2015)==================================================================
					if ((GbAdvqUtil.fUseAqAndNotPipes(toStr("AQ4PIPES"), toStr("GURJOBS")).getValue() && GbAdvqUtil.fUseAqAndNotPipes(toStr("AQ4PIPES"), toStr("GURJOBS_RTN")).getValue()))
					{
						this.getTask().getServices().aqit();
					}
					else {
						try {
							executeAction("PIPEIT");
						} catch (Exception e) {
							InteractionManager.getInteractionState().addAttribute(Task.TASK_EVENT_FAILURE, true);
							return;
						}
					}
					try {
						executeAction("GET_STATUS");
					} catch (TaskExitException e){
						throw e;
					} catch (Exception e) {
						InteractionManager.getInteractionState().addAttribute(Task.TASK_EVENT_FAILURE, true);
						return;
					}
					if ( getFormModel().getDummy().getJobId().equals("GUAVRFY") )
					{
						return ;
					}
					else {
						executeAction("DO_NEWFRM");
					}
				}
			}
		
		/* Original PL/SQL code code for TRIGGER GUQINTF.STUDENT_PAYMENT
		 BEGIN
  :SYSTEM.MESSAGE_LEVEL := '5';
  GO_BLOCK( 'GJBPRUN' );
  EXECUTE_QUERY;
  EXECUTE_TRIGGER( 'COPY_DEFAULTS' );
  G$_CHECK_FAILURE;
  COMMIT_FORM;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.STUDENT_PAYMENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="STUDENT_PAYMENT")
		public void Guqintf_StudentPayment()
		{
			
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(5));
				goBlock(toStr("GJBPRUN"));
				executeQuery();
				executeAction("COPY_DEFAULTS");
				getTask().getGoqrpls().gCheckFailure();
				commitTask();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  :GLOBAL.GURJOBS_PIPE_FAILED := 'N';
  :GLOBAL.PIPE_TIMED_OUT := 'N';
--
  EXECUTE_TRIGGER( 'GLOBAL_COPY' );
  G$_CHECK_FAILURE;
  GO_ITEM('PROCESS_MSG');
  G$_SET_WIN_PROPERTY;
  G$_SET_INST_PROPERTY;
--
-- 71-2
--IF NVL(:GLOBAL.GURJOBS_DIRECTORY,'UNKNOWN') IS NULL THEN
  IF :GLOBAL.GURJOBS_DIRECTORY IS NULL THEN
    GET_HOME;
  END IF;
--
  IF :GLOBAL.CALL_FORM = 'GJAPCTL' THEN
    EXECUTE_TRIGGER( 'JS_HOST_COMMANDS' );
    G$_CHECK_FAILURE;
  ELSIF (:GLOBAL.CALL_FORM = 'TSASPAY' AND 
          :GLOBAL.JOB_ID = 'RPEDISB') THEN
    EXECUTE_TRIGGER( 'STUDENT_PAYMENT' );
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER( 'HOST_COMMANDS' );
    G$_CHECK_FAILURE;
  ELSIF :GLOBAL.CALL_FORM = 'SMARQCM' THEN
    :GLOBAL.JOB_TYPE_IND := 'P';
    EXECUTE_TRIGGER('STUDENT_PAYMENT');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER( 'HOST_COMMANDS' );
    G$_CHECK_FAILURE;
  ELSIF :GLOBAL.CALL_FORM IS NULL THEN
    EXECUTE_TRIGGER( 'HOST_COMMANDS' );
    G$_CHECK_FAILURE;
  ELSE
    EXECUTE_TRIGGER( 'HOST_COMMANDS' );
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guqintf_TaskStarted(EventObject args)
		{
			// MORPHIS TODO GEN JM: removed try catch statements to allow form to return to calling form
			//try{
				setGlobal("GURJOBS_PIPE_FAILED", toStr("N"));
				setGlobal("PIPE_TIMED_OUT", toStr("N"));
				// 
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("PROCESS_MSG"));
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
				// 
				//  71-2
				// IF NVL(:GLOBAL.GURJOBS_DIRECTORY,'UNKNOWN') IS NULL THEN
				if ( getGlobal("GURJOBS_DIRECTORY").isNull() )
				{
					this.getTask().getServices().getHome();
				}
				// 
				if ( getGlobal("CALL_FORM").equals("GJAPCTL") )
				{
					executeAction("JS_HOST_COMMANDS");
					getTask().getGoqrpls().gCheckFailure();
				}
				
				else if ((getGlobal("CALL_FORM").equals("TSASPAY") && getGlobal("JOB_ID").equals("RPEDISB"))) {
					executeAction("STUDENT_PAYMENT");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("HOST_COMMANDS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getGlobal("CALL_FORM").equals("SMARQCM") ) {
					setGlobal("JOB_TYPE_IND", toStr("P"));
					executeAction("STUDENT_PAYMENT");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("HOST_COMMANDS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getGlobal("CALL_FORM").isNull() ) {
					executeAction("HOST_COMMANDS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("HOST_COMMANDS");
					getTask().getGoqrpls().gCheckFailure();
				}
				// MORPHIS TODO GEN JM: removed try catch statements to allow form to return to calling form
			//} catch(Exception e){
			//	getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			//}
		}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
  G$_SET_WIN_PROPERTY;
  G$_SET_INST_PROPERTY;
  IF :SYSTEM.EVENT_WINDOW = 'GUQINTF_WINDOW' THEN
    G$_SET_INST_PROPERTY;
    IF :GLOBAL.WIN_TITLE IS NOT NULL THEN
      SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,:GLOBAL.WIN_TITLE);
      SYNCHRONIZE;
    END IF;
  ELSE
    DO_KEY('G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guqintf_WhenWindowActivatedTrg()
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
				if ( getCurrentWindow().equals("GUQINTF_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					if ( !getGlobal("WIN_TITLE").isNull() )
					{
						setWindowTitle("MAIN_WINDOW", getGlobal("WIN_TITLE"));
						// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize".
						//						SupportClasses.SQLFORMS.Synchronize();
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#ExcludeSynchronize'.");
						
						
					}
				}
				else {
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
					//					SupportClasses.SQLFORMS.DoKey("G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
					
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUQINTF.WHEN-WINDOW-CLOSED
		 BEGIN
  IF :SYSTEM.EVENT_WINDOW = 'GUQINTF_WINDOW' THEN
    DO_KEY('G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUQINTF.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guqintf_WhenWindowClosed()
		{
			
				if ( getCurrentWindow().equals("GUQINTF_WINDOW") )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
					//					SupportClasses.SQLFORMS.DoKey("G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQINTFF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
					
					
				}
			}

		
	
}
	
