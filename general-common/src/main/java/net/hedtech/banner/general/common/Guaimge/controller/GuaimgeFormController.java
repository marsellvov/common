package net.hedtech.banner.general.common.Guaimge.controller;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.configuration.AppSupportLibSettings;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guaimge.model.*;
import net.hedtech.banner.general.common.Guaimge.*;
import net.hedtech.banner.general.common.Guaimge.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GuaimgeFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GuaimgeFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuaimgeTask getTask() {
		return (GuaimgeTask)super.getTask();
	}
	
	
	public GuaimgeModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guaimge_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guaimge_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guaimge_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guaimge_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guaimge_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guaimge_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guaimge_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guaimge_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guaimge_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guaimge_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guaimge_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guaimge_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guaimge_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guaimge_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guaimge_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guaimge_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guaimge_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guaimge_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guaimge_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guaimge_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guaimge_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guaimge_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guaimge_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guaimge_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guaimge_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guaimge_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guaimge_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guaimge_ClearTask()
		{
			
				getGFormClass().clearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guaimge_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guaimge_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guaimge_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guaimge_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guaimge_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guaimge_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guaimge_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guaimge_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guaimge_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guaimge_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guaimge_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guaimge_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guaimge_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guaimge_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guaimge_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guaimge_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guaimge_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAIMGE.KEY-EXIT
		 BEGIN
  :GLOBAL.IMAGE_NAME := '';
  G$_GOQOLIB_KEY_TRIGGER.KEY_EXIT;
  G$_CHECK_FAILURE;
--
  IF NAME_IN('G$_VPDI_BLOCK.VPDI_CODE') IS NOT NULL THEN
    COPY( NAME_IN('G$_VPDI_BLOCK.VPDI_CODE'),'GLOBAL.INSTITUTION_CODE');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guaimge_Exit()
		{
			
				setGlobal("IMAGE_NAME", toStr(""));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().keyExit();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( !getNameIn("G$_VPDI_BLOCK.VPDI_CODE").isNull() )
				{
					copy(getNameIn("G$_VPDI_BLOCK.VPDI_CODE"),"GLOBAL.INSTITUTION_CODE");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guaimge_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guaimge_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guaimge_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guaimge_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guaimge_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guaimge_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guaimge_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guaimge_EnableKeys()
		{
			
				getGFormClass().enableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guaimge_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guaimge_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guaimge_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guaimge_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guaimge_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAIMGE.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guaimge_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAIMGE.PRE_FORM_TRG
		 BEGIN
  DEFAULT_VALUE('','GLOBAL.RW_X');
  DEFAULT_VALUE('','GLOBAL.RW_Y');
  DEFAULT_VALUE('','GLOBAL.RW_W');
  DEFAULT_VALUE('','GLOBAL.RW_H');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guaimge_PreFormTrg()
		{
			
				setDefaultValue("", "GLOBAL.RW_X");
				setDefaultValue("", "GLOBAL.RW_Y");
				setDefaultValue("", "GLOBAL.RW_W");
				setDefaultValue("", "GLOBAL.RW_H");
			}

		
		/* Original PL/SQL code code for TRIGGER GUAIMGE.WHEN-NEW-FORM-INSTANCE
		 DECLARE
  ITEM_ID ITEM;
--
  RW_ID WINDOW;
  RW_X  NUMBER;
  RW_Y  NUMBER;
  RW_W  NUMBER;
  RW_H  NUMBER;
--
  lv_image_extension VARCHAR2(4) := '';
--
BEGIN
  G$_SET_WIN_PROPERTY;
  RW_X  := TO_NUMBER( :GLOBAL.RW_X );
  RW_Y  := TO_NUMBER( :GLOBAL.RW_Y );
  RW_W  := TO_NUMBER( :GLOBAL.RW_W );
  RW_H  := TO_NUMBER( :GLOBAL.RW_H );
--
  RW_ID := FIND_WINDOW( 'MAIN_WINDOW' );
  SET_WINDOW_PROPERTY( RW_ID, POSITION, RW_X, RW_Y );
  SET_WINDOW_PROPERTY( RW_ID, WINDOW_SIZE, RW_W, RW_H );
--
  ITEM_ID := FIND_ITEM( 'EXIT_BTN' );
  SET_ITEM_PROPERTY( ITEM_ID, LABEL, 'Working...' );
  SYNCHRONIZE;
--
  INIT_GLOBAL_ID_RANGE;
  INIT_GLOBAL_EXTENSION;
--
  CASE UPPER(NAME_IN('GLOBAL.BAN_GUAIMGE_EXTENSION'))
    WHEN 'BMP' THEN
      lv_image_extension := 'BMP';
    WHEN 'JPG' THEN
      lv_image_extension := 'JFIF';
    WHEN 'GIF' THEN
      lv_image_extension := 'GIF';
    WHEN 'TIF' THEN
      lv_image_extension := 'TIFF';
    ELSE
      lv_image_extension := 'BMP';
  END CASE;
-- --
  :SYSTEM.MESSAGE_LEVEL := '25';
-- --
  IF :GLOBAL.IMAGE_NAME IS NOT NULL THEN
    READ_IMAGE_FILE( :GLOBAL.IMAGE_NAME, lv_image_extension, 'PERSON_IMAGE');  
    IF NOT FORM_SUCCESS THEN
       IF :GLOBAL.BAN_GUAIMGE_DUAL_SEARCH = 'N' THEN
         MESSAGE( G$_NLS.Get('GUAIMGE-0000','FORM','*ERROR* Cannot locate image file %01%.', :GLOBAL.IMAGE_NAME) );
       ELSE
         READ_IMAGE_FILE( :GLOBAL.BAN_GUAIMGE_DUAL_SEARCH, lv_image_extension, 'PERSON_IMAGE');
         IF NOT FORM_SUCCESS THEN
           MESSAGE( G$_NLS.Get('GUAIMGE-0001','FORM','*ERROR* Image files not found %01% %02%.', 
                    :GLOBAL.IMAGE_NAME, :GLOBAL.BAN_GUAIMGE_DUAL_SEARCH));         
         END IF;
       END IF;
    END IF;
  ELSE
    MESSAGE( G$_NLS.Get('GUAIMGE-0002','FORM','*ERROR* No Image filename provided. Form is to be run using "Help/Display ID Image" from the menu.'));	
  END IF;  	
-- --
  :SYSTEM.MESSAGE_LEVEL := '0';
--
  SET_ITEM_PROPERTY( ITEM_ID, LABEL, 'Exit' );
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAIMGE.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guaimge_TaskStarted(EventObject args)
		{
			
				{
					ItemDescriptor itemId= null;
					// 
					WindowDescriptor rwId= null;
					NNumber rwX= NNumber.getNull();
					NNumber rwY= NNumber.getNull();
					NNumber rwW= NNumber.getNull();
					NNumber rwH= NNumber.getNull();
					// 
					NString lvImageExtension = toStr("");
					getTask().getGoqrpls().gSetWinProperty();
					rwX = toNumber(getGlobal("RW_X"));
					rwY = toNumber(getGlobal("RW_Y"));
					rwW = toNumber(getGlobal("RW_W"));
					rwH = toNumber(getGlobal("RW_H"));
					// 
					rwId = findWindow("MAIN_WINDOW");

					itemId = findItem(toStr("EXIT_BTN"));
					// 
					this.getTask().getServices().initGlobalIdRange();
					this.getTask().getServices().initGlobalExtension();
					// 
					if (upper(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")).equals("BMP"))
					{
						lvImageExtension = toStr("BMP");
					}
					else if (upper(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")).equals("JPG"))
					{
						lvImageExtension = toStr("JFIF");
					}
					else if (upper(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")).equals("GIF"))
					{
						lvImageExtension = toStr("GIF");
					}
					else if (upper(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")).equals("TIF"))
					{
						lvImageExtension = toStr("TIFF");
					}
					else {
						lvImageExtension = toStr("BMP");
					}
					//  --
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '25'
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					//  --
					if ( !getGlobal("IMAGE_NAME").isNull() )
					{
						try{
							this.getTask().getServices().checkImageExists(getGlobal("IMAGE_NAME"));
							readImageFile("PERSON_IMAGE", getGlobal("IMAGE_NAME"),  (lvImageExtension).toString());	
						}catch(Exception e){
							 //F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							if ( getGlobal("BAN_GUAIMGE_DUAL_SEARCH").equals("N") )
							{
								errorMessage(GNls.Fget(toStr("GUAIMGE-0000"), toStr("FORM"), toStr("*ERROR* Cannot locate image file %01%."), getGlobal("IMAGE_NAME")));
							}
							else {
								try{
									this.getTask().getServices().checkImageExists(getGlobal("BAN_GUAIMGE_DUAL_SEARCH"));
									readImageFile("PERSON_IMAGE", getGlobal("BAN_GUAIMGE_DUAL_SEARCH"),  (lvImageExtension).toString());
								}catch(Exception ex){
									errorMessage(GNls.Fget(toStr("GUAIMGE-0001"), toStr("FORM"), toStr("*ERROR* Image files not found %01% %02%."), getGlobal("IMAGE_NAME"), getGlobal("BAN_GUAIMGE_DUAL_SEARCH")));
									throw new ApplicationException();
								}
							}
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("GUAIMGE-0002"), toStr("FORM"), toStr("*ERROR* No Image filename provided. Form is to be run using \"Help/Display ID Image\" from the menu.")));
					}
					//  --
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					// 
					setItemLabel(itemId, "Exit");
				}
			}

		
		
	
}
	