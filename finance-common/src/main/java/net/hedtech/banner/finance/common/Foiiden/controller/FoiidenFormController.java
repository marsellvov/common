package net.hedtech.banner.finance.common.Foiiden.controller;
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foiiden.model.*;
import net.hedtech.banner.finance.common.Foiiden.*;
import net.hedtech.banner.finance.common.Foiiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass;	
		

public class FoiidenFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GInqFormClass getGInqFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GInqFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_INQ_FORM_CLASS");
	}	
		
	
	
	public FoiidenFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FoiidenTask getTask() {
		return (FoiidenTask)super.getTask();
	}
	
	
	public FoiidenModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Foiiden_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Foiiden_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Foiiden_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.PRE_FORM_TRG
		 IF GET_ITEM_PROPERTY('SPRIDEN.SPRIDEN_SURNAME_PREFIX',VISIBLE) = 'FALSE' THEN
  SET_ITEM_PROPERTY('SPRIDEN.SPRIDEN_LAST_NAME' , X_POS,  99);
  SET_ITEM_PROPERTY('SPRIDEN.SPRIDEN_FIRST_NAME', X_POS, 302);
  SET_ITEM_PROPERTY('SPRIDEN.SPRIDEN_MI'        , X_POS, 464);
  SET_ITEM_PROPERTY('SPRIDEN.SPRIDEN_CHANGE_IND', X_POS, 553);
  SET_ITEM_PROPERTY('SPRIDEN.BIRTHDATE'         , X_POS, 589);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Foiiden_PreFormTrg()
		{
			
				if ( getItemVisible("SPRIDEN.SPRIDEN_SURNAME_PREFIX").equals("FALSE") )
				{
					setItemXPos("SPRIDEN.SPRIDEN_LAST_NAME", 99);
					setItemXPos("SPRIDEN.SPRIDEN_FIRST_NAME", 302);
					setItemXPos("SPRIDEN.SPRIDEN_MI", 464);
					setItemXPos("SPRIDEN.SPRIDEN_CHANGE_IND", 553);
					setItemXPos("SPRIDEN.BIRTHDATE", 589);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Foiiden_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Foiiden_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Foiiden_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Foiiden_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Foiiden_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Foiiden_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Foiiden_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Foiiden_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Foiiden_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Foiiden_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Foiiden_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Foiiden_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Foiiden_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Foiiden_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Foiiden_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Foiiden_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Foiiden_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Foiiden_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Foiiden_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Foiiden_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Foiiden_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Foiiden_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Foiiden_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Foiiden_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Foiiden_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Foiiden_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Foiiden_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Foiiden_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Foiiden_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Foiiden_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Foiiden_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Foiiden_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Foiiden_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Foiiden_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Foiiden_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Foiiden_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Foiiden_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Foiiden_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Foiiden_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Foiiden_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Foiiden_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Foiiden_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Foiiden_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Foiiden_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Foiiden_CheckKeys()
		{
			
				getGInqFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Foiiden_ClearRecord()
		{
			
				getGInqFormClass().clearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Foiiden_Save()
		{
			
				getGInqFormClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Foiiden_CreateRecord()
		{
			
				getGInqFormClass().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Foiiden_DeleteRecord()
		{
			
				getGInqFormClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Foiiden_KeyDupItem()
		{
			
				getGInqFormClass().keyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Foiiden_CopyRecord()
		{
			
				getGInqFormClass().copyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Foiiden_recordChange()
		{
			
				getGInqFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-EXEQRY
		 SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',DISPLAYED,PROPERTY_OFF);
SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED,PROPERTY_OFF);

EXECUTE_QUERY;
 
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
-- Display Name Type button.
   IF GET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',DISPLAYED,PROPERTY_ON);
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED,PROPERTY_ON);
   
  END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Foiiden_ExecuteQuery()
		{
			
				setItemVisible("SPRIDEN_NTYP_LBT", false);
				setItemEnabled("SPRIDEN_NTYP_LBT", false);
				executeQuery();
				if ( getMode().equals("ENTER-QUERY") )
				{
					//  Display Name Type button.
					if ( getItemEnabled("SPRIDEN_NTYP_LBT").equals("FALSE") )
					{
						setItemVisible("SPRIDEN_NTYP_LBT", true);
						setItemEnabled("SPRIDEN_NTYP_LBT", true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.3';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Foiiden_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.CLOSE_WINDOW
		   SET_WINDOW_PROPERTY('SOUNDEX_WINDOW',VISIBLE,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.CLOSE_WINDOW
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOW")
		public void Foiiden_CloseWindow()
		{
			
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-ENTQRY
		 G$_IDNAME_SEARCH.ENTER_QUERY_STATUS;
--SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
G$_NAVIGATION_FRAME.DISABLE_OPTION('SOUNDEX','B');

IF GET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',DISPLAYED,PROPERTY_ON);
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED,PROPERTY_ON);
END IF;
ENTER_QUERY;
<multilinecomment>IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
END IF;</multilinecomment>
IF G$_NAVIGATION_FRAME.GET_DESCRIPTION('SOUNDEX','B') = G$_NLS.Get('FOIIDEN-0000', 'FORM','Name Search by Soundex')  THEN
    G$_NAVIGATION_FRAME.ENABLE_OPTION('SOUNDEX','B');
 END IF;
IF :SYSTEM.MODE = 'ENTER-QUERY' THEN
-- Display Name Type button.
    IF GET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',DISPLAYED,PROPERTY_ON);
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED,PROPERTY_ON);
   ENTER_QUERY;
   END IF;
 END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Foiiden_Search()
		{
			
				getTask().getGoqrpls().getGIdnameSearch().enterQueryStatus();
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SOUNDEX"), toStr("B"));
				if ( getItemEnabled("SPRIDEN_NTYP_LBT").equals("FALSE") )
				{
					setItemVisible("SPRIDEN_NTYP_LBT", true);
					setItemEnabled("SPRIDEN_NTYP_LBT", true);
				}
				enterQuery();
				// IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				if ( getTask().getGoqrpls().getGNavigationFrame().getDescription(toStr("SOUNDEX"), toStr("B")).equals(GNls.Fget(toStr("FOIIDEN-0000"), toStr("FORM"), toStr("Name Search by Soundex"))) )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOUNDEX"), toStr("B"));
				}
				if ( getMode().equals("ENTER-QUERY") )
				{
					//  Display Name Type button.
					if ( getItemEnabled("SPRIDEN_NTYP_LBT").equals("FALSE") )
					{
						setItemVisible("SPRIDEN_NTYP_LBT", true);
						setItemEnabled("SPRIDEN_NTYP_LBT", true);
						enterQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.WHEN_WINDOW_ACTIVATED_TRG
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
		 * FOIIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Foiiden_WhenWindowActivatedTrg()
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

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.DISABLE_SOUNDEX_BTN_TRIG
		 <multilinecomment>IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
END IF;</multilinecomment>
 IF G$_NAVIGATION_FRAME.GET_DESCRIPTION('SOUNDEX','B') = G$_NLS.Get('FOIIDEN-0001', 'FORM','Name Search by Soundex')  THEN
    G$_NAVIGATION_FRAME.DISABLE_OPTION('SOUNDEX','B');
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.DISABLE_SOUNDEX_BTN_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_SOUNDEX_BTN_TRIG")
		public void Foiiden_DisableSoundexBtnTrig()
		{
			
				// IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'TRUE' THEN
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
				// END IF;
				// IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'TRUE' THEN
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_OFF);
				// END IF;
				if ( getTask().getGoqrpls().getGNavigationFrame().getDescription(toStr("SOUNDEX"), toStr("B")).equals(GNls.Fget(toStr("FOIIDEN-0001"), toStr("FORM"), toStr("Name Search by Soundex"))) )
				{
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SOUNDEX"), toStr("B"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.ENABLE_SOUNDEX_BTN_TRIG
		 <multilinecomment>IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
 END IF;</multilinecomment>

IF G$_NAVIGATION_FRAME.GET_DESCRIPTION('SOUNDEX','B') = G$_NLS.Get('FOIIDEN-0002', 'FORM','Name Search by Soundex')  THEN
    G$_NAVIGATION_FRAME.ENABLE_OPTION('SOUNDEX','B');
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ENABLE_SOUNDEX_BTN_TRIG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_SOUNDEX_BTN_TRIG")
		public void Foiiden_EnableSoundexBtnTrig()
		{
			
				// IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('SOUNDEX_BTN',ENABLED,PROPERTY_ON);
				// END IF;
				if ( getTask().getGoqrpls().getGNavigationFrame().getDescription(toStr("SOUNDEX"), toStr("B")).equals(GNls.Fget(toStr("FOIIDEN-0002"), toStr("FORM"), toStr("Name Search by Soundex"))) )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SOUNDEX"), toStr("B"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-CQUERY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-CQUERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void Foiiden_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.INVALID_FUNCTION_MSG
		    MESSAGE( G$_NLS.Get('FOIIDEN-0003', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.') );
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Foiiden_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FOIIDEN-0003"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPRIDEN_CHANGE_IND',NAVIGABLE,PROPERTY_OFF);
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
 IF GET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',DISPLAYED,PROPERTY_ON);
      SET_ITEM_PROPERTY('SPRIDEN_NTYP_LBT',ENABLED,PROPERTY_ON);
 
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Foiiden_EnableKeys()
		{
			
				if ( getItemEnabled("SPRIDEN_CHANGE_IND").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CHANGE_IND", false);
					setItemNavigable("SPRIDEN_CHANGE_IND", false);
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
				if ( getItemEnabled("SPRIDEN_NTYP_LBT").equals("FALSE") )
				{
					setItemVisible("SPRIDEN_NTYP_LBT", true);
					setItemEnabled("SPRIDEN_NTYP_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.DISABLE_KEYS
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
		 * FOIIDEN.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Foiiden_DisableKeys()
		{
			
				setItemEnabled("SPRIDEN_CHANGE_IND", false);
				setItemEnabled("SPRIDEN_FIRST_NAME", false);
				setItemEnabled("SPRIDEN_ID", false);
				setItemEnabled("SPRIDEN_LAST_NAME", false);
				setItemEnabled("SPRIDEN_MI", false);
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.WHEN-NEW-FORM-INSTANCE
		 <multilinecomment>   EXECUTE_TRIGGER('DISABLE_SOUNDEX_BTN_TRIG');
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
   g$_set_win_property;
   G$_SETMENU('main.block',1);
   GO_BLOCK('SPRIDEN');
   ENTER_QUERY ;
   EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');</multilinecomment>

   EXECUTE_TRIGGER('DISABLE_SOUNDEX_BTN_TRIG');
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   G$_SET_INST_PROPERTY;
   g$_set_win_property;
   G$_SETMENU('main.block',1);
   GO_BLOCK('SPRIDEN');
  -- ENTER_QUERY ;
   --EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');
 
   IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN
    	IF :GLOBAL.CALLING_FORM = 'IDNAME_SEARCH' THEN
         G$_IDNAME_SEARCH.FORM_INST_QUERY_STATUS;
		     EXECUTE_QUERY;
	    ELSIF :GLOBAL.CALLING_FORM = 'NAME_SEARCH' THEN
        		:SOUNDEX_LAST_NAME := :GLOBAL.LAST_NAME;
		        :SOUNDEX_FIRST_NAME := :GLOBAL.FIRST_NAME;
		        EXECUTE_QUERY;
	    END IF;
   ELSE
      :GLOBAL.SEARCH_ID := '';
      :GLOBAL.LAST_NAME := '';
      :GLOBAL.FIRST_NAME := '';
      :GLOBAL.MID_NAME := ''; 		
		   ENTER_QUERY;
		   EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');
	END IF;   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Foiiden_TaskStarted(EventObject args)
		{
			
				//    EXECUTE_TRIGGER('DISABLE_SOUNDEX_BTN_TRIG');
				// EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
				// G$_CHECK_FAILURE ;
				// G$_SET_INST_PROPERTY;
				// g$_set_win_property;
				// G$_SETMENU('main.block',1);
				// GO_BLOCK('SPRIDEN');
				// ENTER_QUERY ;
				// EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');
				//    EXECUTE_TRIGGER('DISABLE_SOUNDEX_BTN_TRIG');
				// EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
				// G$_CHECK_FAILURE ;
				// G$_SET_INST_PROPERTY;
				// g$_set_win_property;
				// G$_SETMENU('main.block',1);
				// GO_BLOCK('SPRIDEN');
				// ENTER_QUERY ;
				// EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');
				executeAction("DISABLE_SOUNDEX_BTN_TRIG");
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
				goBlock(toStr("SPRIDEN"));
				//  ENTER_QUERY ;
				// EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');
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
				}
				else {
					setGlobal("SEARCH_ID", toStr(""));
					setGlobal("LAST_NAME", toStr(""));
					setGlobal("FIRST_NAME", toStr(""));
					setGlobal("MID_NAME", toStr(""));
					enterQuery();
					executeAction("ENABLE_SOUNDEX_BTN_TRIG");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-SCRUP
		    SCROLL_UP ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Foiiden_KeyScrup()
		{
	
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-SCRDOWN
		    SCROLL_DOWN ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Foiiden_KeyScrdown()
		{
		
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-NXTKEY
		    :GLOBAL.VALUE := :SPRIDEN.SPRIDEN_ID ;
   
-- for PII, save selected pidm in temp. variable if user has cross domain search
gokfgac.p_search_form_update_temp_pidm(:spriden.spriden_pidm); 
--
--12699   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *The exit key has been redefined to pass the id from the name search form

		 *to the calling form and exit.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Foiiden_KeyNxtkey()
		{
			
				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){
				setGlobal("VALUE", spridenElement.getSpridenId());
				//  for PII, save selected pidm in temp. variable if user has cross domain search
				Gokfgac.pSearchFormUpdateTempPidm(spridenElement.getSpridenPidm());
				// 
				// 12699   EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}
		}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Foiiden_FormKeyMenu()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
--12699   EXIT_FORM ;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Foiiden_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				// 12699   EXIT_FORM ;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER FOIIDEN.KEY-CLRFRM
		    EXECUTE_TRIGGER('DISABLE_SOUNDEX_BTN_TRIG');
   EXECUTE_TRIGGER('ENABLE_KEYS');
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CLOSE_WINDOW');
   ENTER_QUERY ;
   EXECUTE_TRIGGER('ENABLE_SOUNDEX_BTN_TRIG');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOIIDEN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Foiiden_ClearTask()
		{
			
				executeAction("DISABLE_SOUNDEX_BTN_TRIG");
				executeAction("ENABLE_KEYS");
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CLOSE_WINDOW");
				enterQuery();
				executeAction("ENABLE_SOUNDEX_BTN_TRIG");
			}

		
	
}
	
