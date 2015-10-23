package net.hedtech.banner.general.common.Goaintl.controller;
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
import net.hedtech.banner.general.common.Goaintl.model.*;
import net.hedtech.banner.general.common.Goaintl.*;
import net.hedtech.banner.general.common.Goaintl.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
import net.hedtech.general.common.services.OracleMessagesLevel;		

public class GoaintlFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GoaintlFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GoaintlTask getTask() {
		return (GoaintlTask)super.getTask();
	}
	
	
	public GoaintlModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Goaintl_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Goaintl_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Goaintl_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Goaintl_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Goaintl_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Goaintl_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Goaintl_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Goaintl_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Goaintl_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Goaintl_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Goaintl_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Goaintl_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Goaintl_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Goaintl_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Goaintl_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Goaintl_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
				goBlock("KEY_BLOCK");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Goaintl_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Goaintl_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Goaintl_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Goaintl_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Goaintl_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Goaintl_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Goaintl__WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Goaintl_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Goaintl_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Goaintl_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Goaintl_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Goaintl_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Goaintl_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaintl_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Goaintl_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Goaintl_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Goaintl_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Goaintl_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Goaintl_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Goaintl_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Goaintl_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Goaintl_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Goaintl_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Goaintl_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Goaintl_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Goaintl_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Goaintl_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Goaintl_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Goaintl_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Goaintl_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Goaintl_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Goaintl_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Goaintl_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.4';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goaintl_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.OPTM_WIN_PASSPORT_INFO
		 if :system.block_status = 'CHANGED'  then
	  message( G$_NLS.Get('GOAINTL-0000', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_PASSPORT_ID');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.OPTM_WIN_PASSPORT_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTM_WIN_PASSPORT_INFO")
		public void Goaintl_OptmWinPassportInfo()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0000"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_PASSPORT_ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.OPTM_WIN_CERT_INFO
		 if :system.block_status = 'CHANGED'  then
	  message( G$_NLS.Get('GOAINTL-0001', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_CELG_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.OPTM_WIN_CERT_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTM_WIN_CERT_INFO")
		public void Goaintl_OptmWinCertInfo()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0001"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_CELG_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.OPTM_WIN_NATION_INFO
		 if :system.block_status = 'CHANGED'  then
	  message( G$_NLS.Get('GOAINTL-0002', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM('GOBINTL_NATN_CODE_BIRTH');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.OPTM_WIN_NATION_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTM_WIN_NATION_INFO")
		public void Goaintl_OptmWinNationInfo()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0002"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.OPTM_WIN_VISA_INFO
		 if :system.block_status = 'CHANGED' and :system.current_block <> 'GORVISA' then
	  message( G$_NLS.Get('GOAINTL-0003', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
GO_ITEM ('GORVISA.GORVISA_VTYP_CODE');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.OPTM_WIN_VISA_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTM_WIN_VISA_INFO")
		public void Goaintl_OptmWinVisaInfo()
		{
			
				if ( getBlockStatus().equals("CHANGED") && getCurrentBlock().notEquals("GORVISA") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0003"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GORVISA.GORVISA_VTYP_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.OPTM_WIN_DOCM_INFO
		 if :system.block_status = 'CHANGED' and :system.current_block <> 'GORDOCM' then
	  message( G$_NLS.Get('GOAINTL-0004', 'FORM','Please Save Information before Leaving Current Block.') );
	  raise form_trigger_failure;
end if;
--
go_item('GORDOCM_DOCM_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.OPTM_WIN_DOCM_INFO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="OPTM_WIN_DOCM_INFO")
		public void Goaintl_OptmWinDocmInfo()
		{
			
				if ( getBlockStatus().equals("CHANGED") && getCurrentBlock().notEquals("GORDOCM") )
				{
					errorMessage(GNls.Fget(toStr("GOAINTL-0004"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
					throw new ApplicationException();
				}
				// 
				goItem(toStr("GORDOCM_DOCM_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-DUPREC
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Goaintl_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-CLRREC
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-CLRREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void Goaintl_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-CLRBLK
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void Goaintl_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-CREREC
		    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
   G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Goaintl_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CLOSE_WINDOWS
		 SET_WINDOW_PROPERTY('PASSPORT_WINDOW',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('CERTIFICATION_WINDOW',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('NATIONALITY_WINDOW',VISIBLE,PROPERTY_OFF);


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Goaintl_CloseWindows()
		{
			
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DECLARE
   FIELD_NAME  VARCHAR2(70);
   recno number := 1;
BEGIN
	-- 71-3
	G$_SET_INST_PROPERTY;
	--
   IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
      FIELD_NAME := :SYSTEM.CURRENT_ITEM;
      IF :CHECK_KEYS = 'Y' THEN 
      	 :system.message_level := 5;        
         :CHECK_KEYS := 'N';
         CLEAR_BLOCK;
         GO_BLOCK('KEY_BLOCK');
         G$_CHECK_FAILURE;
         EXECUTE_TRIGGER('CHECK_KEYS');
         G$_CHECK_FAILURE;
         SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
         GO_BLOCK('GORVISA');
         EXECUTE_QUERY;
         execute_trigger('get_record_number');
         g$_check_failure;
         GO_BLOCK('GORDOCM');
         execute_query;
         GO_BLOCK('GOBINTL');
         execute_query;
         GO_BLOCK('GORVISA');
         SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
         :CHECK_KEYS := 'N';
         EXECUTE_TRIGGER('DISABLE_KEYS');
         G$_CHECK_FAILURE;
         --
         EXECUTE_TRIGGER('ENABLE_PAGES');
         G$_CHECK_FAILURE;
         --
         GO_ITEM(FIELD_NAME);
      	 :system.message_level := 0; 
      END IF;
   END IF;
   if :system.form_status = 'CHANGED' and :previous_block is not null then
   	   go_block(:previous_block);
   	   if :error_item is not null then
   	   	   go_item(:error_item);
   	   	   raise form_trigger_failure;
   	   end if;
   	   --
   	   message( G$_NLS.Get('GOAINTL-0005', 'FORM','Please Save Information before Leaving Current Block.') );
	     raise form_trigger_failure;
	 end if;
   --	
   if :system.current_block = 'GOBINTL' then
   	  :system.message_level := 5;
       SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
   	   execute_query;
   	   SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
   	   GO_ITEM(FIELD_NAME);
   	  :system.message_level := 0;
   end if;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Goaintl_WhenNewBlockInstanceTrg()
		{
			
				{
					NString fieldName= NString.getNull();
					NNumber recno = toNumber(1);
					//  71-3
					getTask().getGoqrpls().gSetInstProperty();
					// 
					if ( getCursorBlock().notEquals("KEY_BLOCK") )
					{
						fieldName = toStr(getCurrentItem());
						if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
						{
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							clearBlock();
							doNavigation();
							goBlock(toStr("KEY_BLOCK"));
							doNavigation();
							getTask().getGoqrpls().gCheckFailure();
							executeAction("CHECK_KEYS");
							doNavigation();
							getTask().getGoqrpls().gCheckFailure();

							try{
								this.getTask().setValidationEnabled(false);
								goBlock(toStr("GORVISA"));
								doNavigation();
								executeQuery();
								doNavigation();
								executeAction("get_record_number");
								getTask().getGoqrpls().gCheckFailure();
								goBlock(toStr("GORDOCM"));
								doNavigation();
								executeQuery();
								doNavigation();
								goBlock(toStr("GOBINTL"));
								doNavigation();
								executeQuery();
								doNavigation();
								goBlock(toStr("GORVISA"));
								doNavigation();
								
							}finally {
								this.getTask().setValidationEnabled(true);
							}
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							executeAction("DISABLE_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							// 
							executeAction("ENABLE_PAGES");
							getTask().getGoqrpls().gCheckFailure();
							// 
							goItem(fieldName);
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
						}
					}
					if ( getTaskStatus().equals("CHANGED") && !getFormModel().getFormHeader().getPreviousBlock().isNull() )
					{
						goBlock(getFormModel().getFormHeader().getPreviousBlock());
						if ( !getFormModel().getFormHeader().getErrorItem().isNull() )
						{
							goItem(getFormModel().getFormHeader().getErrorItem());
							throw new ApplicationException();
						}
						// 
						errorMessage(GNls.Fget(toStr("GOAINTL-0005"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
						throw new ApplicationException();
					}
					// 	
					if ( getCurrentBlock().equals("GOBINTL") )
					{
						try{
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
							this.getTask().setValidationEnabled(false);
							executeQuery();
							doNavigation();
						} finally {
							this.getTask().setValidationEnabled(true);
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
						}
						goItem(fieldName);
						doNavigation();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.WHEN_WINDOW_ACTIVATED_TRG
		 G$_SET_WIN_PROPERTY;
G$_SET_INST_PROPERTY;
--
declare  tmp char(80) := :system.current_item;
begin
  IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN 
      IF GET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED) = 'TRUE' THEN  
         GO_ITEM ('KEY_BLOCK.ID');
      ELSE
         GO_ITEM (tmp);
      END IF;
  ELSIF :SYSTEM.EVENT_WINDOW = 'PASSPORT_WINDOW' THEN
         GO_ITEM('GOBINTL_PASSPORT_ID');
  ELSIF :SYSTEM.EVENT_WINDOW = 'CERTIFICATION_WINDOW' THEN
         GO_ITEM('GOBINTL_CELG_CODE');
  ELSIF :SYSTEM.EVENT_WINDOW = 'NATIONALITY_WINDOW' THEN
         GO_ITEM('GOBINTL_NATN_CODE_BIRTH');
  END IF;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Goaintl_WhenWindowActivatedTrg()
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
				{
					NString tmp = getCurrentItem();
					if ( getCurrentWindow().equals("MAIN_WINDOW") )
					{
						if ( getItemEnabled("KEY_BLOCK.ID").equals("TRUE") )
						{
							goItem(toStr("KEY_BLOCK.ID"));
						}
						else {
							goItem(tmp);
						}
					}
					else if ( getCurrentWindow().equals("PASSPORT_WINDOW") ) {
						goItem(toStr("GOBINTL_PASSPORT_ID"));
					}
					else if ( getCurrentWindow().equals("CERTIFICATION_WINDOW") ) {
						goItem(toStr("GOBINTL_CELG_CODE"));
					}
					else if ( getCurrentWindow().equals("NATIONALITY_WINDOW") ) {
						goItem(toStr("GOBINTL_NATN_CODE_BIRTH"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
		*/
		/*
		 *<p>
		 *This trigger will copy the keys back to the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Goaintl_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.LOAD_FORM_HEADER
		    :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
   :CURRENT_USER := USER;
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
   EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
   --
   -- SET DEFAULT VALUES IN FORM FOR GOAINTL 
   --
   
 

		*/
		/*
		 *<p>
		 *This trigger will load the standard form header information.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Goaintl_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getUser());
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.INVALID_FUNCTION_MSG
		 MESSAGE(G$_NLS.Get('GOAINTL-0006','FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions'));
		*/
		/*
		 *<p>
		 *This trigger will display the invalid function message.  It will be executed

		 *from every block that has disabled function keys.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Goaintl_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("GOAINTL-0006"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.GLOBAL_COPY
		    IF :GLOBAL.KEY_IDNO IS NOT NULL THEN
      :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO;
      NEXT_FIELD;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Goaintl_GlobalCopy()
		{
			
				if ( !getGlobal("KEY_IDNO").isNull() )
				{
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF); 
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   G$_Navigation_Frame.Enable_option('ADDITIONAL_INFORMATION','P');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Goaintl_DisableKeys()
		{
			
				setItemEnabled("ID_LBT", false);
				setItemEnabled("ID", false);
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("ADDITIONAL_INFORMATION"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER('LOAD_FORM_HEADER');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('GLOBAL_COPY');
   G$_CHECK_FAILURE;
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
   --   
   SHOW_VIEW('GOAINTL_TAB_CANVAS');
   EXECUTE_TRIGGER('DISABLE_PAGES');
   --Added to get dynamic hint for SSN
   G$_SSN_SET_ITEM_HINT('GOBINTL.GOBINTL_FOREIGN_SSN');

   

		*/
		/*
		 *<p>
		 *This trigger will fill in the header information, copy the keys in from the

		 *global area, and move to the key block.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Goaintl_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				//    
				showView("GOAINTL_TAB_CANVAS");
				executeAction("DISABLE_PAGES");
				// Added to get dynamic hint for SSN
				getTask().getGoqrpls().gSsnSetItemHint(toStr("GOBINTL.GOBINTL_FOREIGN_SSN"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-PRVBLK
		    PREVIOUS_BLOCK;
   EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *This trigger will cause an automatic query upon execution of PREVIOUS BLOCK.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Goaintl_PreviousBlock()
		{
			
				previousBlock();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Goaintl_EnableKeys()
		{
			
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
				}
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-NXTBLK
		    NEXT_BLOCK;
   EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *This trigger will cause an automatic query upon execution of a NEXT BLOCK.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Goaintl_NextBlock()
		{
			
				nextBlock();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-CLRFRM
		    EXECUTE_TRIGGER('SAVE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   CLEAR_FORM;
--   
   SET_CANVAS_PROPERTY('GOAINTL_TAB_CANVAS',TOPMOST_TAB_PAGE,'GOAINTL_1_CANVAS');
--     
   IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      EXECUTE_TRIGGER('DISABLE_KEYS');
      G$_CHECK_FAILURE;
      RETURN;
   END IF;
   EXECUTE_TRIGGER('LOAD_FORM_HEADER');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('GLOBAL_COPY');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('CLOSE_WINDOWS');
   --
   EXECUTE_TRIGGER('DISABLE_PAGES');
   

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Goaintl_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				//    
				setCanvasTopMostTabPage("GOAINTL_TAB_CANVAS", "GOAINTL_1_CANVAS");
				//      
				if ( getTaskStatus().equals("CHANGED") )
				{
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				
				validateItem("ID");
				//*
				
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CLOSE_WINDOWS");
				// 
				executeAction("DISABLE_PAGES");
				goItem("ID");
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.PRE-UPDATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK;
--
   :WORKDATE := SUBSTR(:WORKDATE, 1, 7);
--
   :WORKDATE := LPAD(:WORKDATE, 15, :WORKDATE || '.');
--
   :WORKDATE := RPAD(:WORKDATE, 29, '_ACTIVITY_DATE');
--
   COPY(:CURRENT_DATE, :WORKDATE);
		*/
		/*
		 *<p>
		 *This trigger will update the activity date with the current date for the

		 *current block and row.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Goaintl_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(lpad(getFormModel().getFormHeader().getWorkdate(), 15, getFormModel().getFormHeader().getWorkdate().append(".").toString()));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 29, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.GET_MAX_SEQNO
		 BEGIN
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT NVL(MAX(GORVISA_SEQ_NO),0) + 1
         FROM   GORVISA
         WHERE  GORVISA_PIDM = :GORVISA_PIDM;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :MAX_SEQNO;
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.GET_MAX_SEQNO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_MAX_SEQNO")
		public void Goaintl_GetMaxSeqno()
		{
			
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					{
						String sqlptiCursor = "SELECT NVL(MAX(GORVISA_SEQ_NO), 0) + 1 " +
		" FROM GORVISA " +
		" WHERE GORVISA_PIDM = :GORVISA_PIDM ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GORVISA_PIDM", gorvisaElement.getGorvisaPidm());
							
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								getFormModel().getFormHeader().setMaxSeqno(ptiCursorResults.getNumber(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.GET_RECORD_NUMBER
		 BEGIN
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT COUNT(*)
         FROM   GORVISA
         WHERE  GORVISA_PIDM = :GORVISA_PIDM;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO :RECORD_NUMBER;
   END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.GET_RECORD_NUMBER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_RECORD_NUMBER")
		public void Goaintl_GetRecordNumber()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					{
						String sqlptiCursor = "SELECT COUNT(*) " +
		" FROM GORVISA " +
		" WHERE GORVISA_PIDM = :GORVISA_PIDM ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GORVISA_PIDM", gorvisaElement.getGorvisaPidm());
							
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								getFormModel().getFormHeader().setRecordNumber(ptiCursorResults.getNumber(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.KEY-COMMIT
		 commit_form;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Goaintl_Save()
		{
			
				commitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_GORDOCM
		 Declare
	temp varchar2(1) :=Null;
	cursor gtvdocm_c is 
	  select 'x'
    from   gordocm 
    where (gordocm_pidm = :gordocm_pidm
    and    gordocm_seq_no = :gordocm_seq_no
    and    gordocm_vtyp_code = :gordocm_vtyp_code
    and    gordocm_docm_code is not null
    and    gordocm_request_date is null)
    or    (gordocm_pidm = :gorvisa_pidm
    and    gordocm_seq_no = :gorvisa_seq_no
    and    gordocm_vtyp_code = :gorvisa_vtyp_code
    and    gordocm_docm_code is not null
    and    gordocm_request_date is null);
begin
	open gtvdocm_c;
	fetch gtvdocm_c into temp;
	if temp is not null then 
     message( G$_NLS.Get('GOAINTL-0007', 'FORM','Visa Document Request Date is Required for Current Visa Document') );
     go_block('gordocm');	
 	   raise form_trigger_failure;
	end if;
	close gtvdocm_c;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_GORDOCM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_GORDOCM")
		public void Goaintl_CheckGordocm()
		{
				GordocmAdapter gordocmElement = (GordocmAdapter)this.getFormModel().getGordocm().getRowAdapter(true);
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gordocmElement != null && gorvisaElement !=null)
				{
					int rowCount = 0;
					{
						NString temp = NString.getNull();
						String sqlgtvdocmC = "SELECT 'x' " +
		" FROM gordocm " +
		" WHERE (gordocm_pidm = :GORDOCM_PIDM AND gordocm_seq_no = :GORDOCM_SEQ_NO AND gordocm_vtyp_code = :GORDOCM_VTYP_CODE AND gordocm_docm_code IS NOT NULL AND gordocm_request_date IS NULL) OR (gordocm_pidm = :GORVISA_PIDM AND gordocm_seq_no = :GORVISA_SEQ_NO AND gordocm_vtyp_code = :GORVISA_VTYP_CODE AND gordocm_docm_code IS NOT NULL AND gordocm_request_date IS NULL) ";
						DataCursor gtvdocmC = new DataCursor(sqlgtvdocmC);
						try {
							//Setting query parameters
							gtvdocmC.addParameter("GORDOCM_PIDM", gordocmElement.getGordocmPidm());
							gtvdocmC.addParameter("GORDOCM_SEQ_NO", gordocmElement.getGordocmSeqNo());
							gtvdocmC.addParameter("GORDOCM_VTYP_CODE", gordocmElement.getGordocmVtypCode());
							gtvdocmC.addParameter("GORVISA_PIDM", gorvisaElement.getGorvisaPidm());
							gtvdocmC.addParameter("GORVISA_SEQ_NO", gorvisaElement.getGorvisaSeqNo());
							gtvdocmC.addParameter("GORVISA_VTYP_CODE", gorvisaElement.getGorvisaVtypCode());
							
							gtvdocmC.open();
							ResultSet gtvdocmCResults = gtvdocmC.fetchInto();
							if ( gtvdocmCResults != null ) {
								temp = gtvdocmCResults.getStr(0);
							}
							if ( !temp.isNull() )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0007"), toStr("FORM"), toStr("Visa Document Request Date is Required for Current Visa Document")));
								goBlock(toStr("gordocm"));
								throw new ApplicationException();
							}
						}
						finally{
							gtvdocmC.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_GOBINTL
		 Declare
	cursor gobintl_c is 
	  select 'Y'
    from  gobintl
    where gobintl_pidm = :key_block.pidm;
begin
	open gobintl_c;
 :gobintl_exists := '';
	fetch gobintl_c into :gobintl_exists;
	close gobintl_c;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_GOBINTL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_GOBINTL")
		public void Goaintl_CheckGobintl()
		{
			
				int rowCount = 0;
				{
					String sqlgobintlC = "SELECT 'Y' " +
	" FROM gobintl " +
	" WHERE gobintl_pidm = :KEY_BLOCK_PIDM ";
					DataCursor gobintlC = new DataCursor(sqlgobintlC);
					try {
						//Setting query parameters
						gobintlC.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
						
						gobintlC.open();
						getFormModel().getFormHeader().setGobintlExists(toStr(""));
						ResultSet gobintlCResults = gobintlC.fetchInto();
						if ( gobintlCResults != null ) {
							getFormModel().getFormHeader().setGobintlExists(gobintlCResults.getStr(0));
						}
					}
					finally{
						gobintlC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_GORVISA
		 if :GORVISA_VTYP_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0008', 'FORM','Visa Type Code Must Be Entered.') );
	  go_item('GORVISA_VTYP_CODE');
	  raise form_trigger_failure;
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0009', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  go_item('gorvisa_no_entries');
    	  raise form_trigger_failure;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0010', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  go_item('gorvisa_no_entries');
    	  raise form_trigger_failure;
    end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_GORVISA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_GORVISA")
		public void Goaintl_CheckGorvisa()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( gorvisaElement.getGorvisaVtypCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0008"), toStr("FORM"), toStr("Visa Type Code Must Be Entered.")));
						goItem(toStr("GORVISA_VTYP_CODE"));
						throw new ApplicationException();
					}
					// 
					if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
					{
						if ( gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0009"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
							goItem(toStr("gorvisa_no_entries"));
							throw new ApplicationException();
						}
					}
					else {
						if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0010"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
							goItem(toStr("gorvisa_no_entries"));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_GORVISA_1
		 :error_item := '';
if :GORVISA_VTYP_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0011', 'FORM','Visa Type Code Must Be Entered.') );
	 :error_item := 'GORVISA_VTYP_CODE';
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null and :error_item is null then
    	  message( G$_NLS.Get('GOAINTL-0012', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
  	   :error_item := 'GORVISA_ENTRY_IND';
    end if;
else
    if :gorvisa_no_entries is not null and :error_item is null then
    	  message( G$_NLS.Get('GOAINTL-0013', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
  	   :error_item := 'GORVISA_NO_ENTRIES';
    end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_GORVISA_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_GORVISA_1")
		public void Goaintl_CheckGorvisa1()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					getFormModel().getFormHeader().setErrorItem(toStr(""));
					if ( gorvisaElement.getGorvisaVtypCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0011"), toStr("FORM"), toStr("Visa Type Code Must Be Entered.")));
						getFormModel().getFormHeader().setErrorItem(toStr("GORVISA_VTYP_CODE"));
					}
					// 
					if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
					{
						if ( gorvisaElement.getGorvisaNoEntries().isNull() && getFormModel().getFormHeader().getErrorItem().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0012"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
							getFormModel().getFormHeader().setErrorItem(toStr("GORVISA_ENTRY_IND"));
						}
					}
					else {
						if ( !gorvisaElement.getGorvisaNoEntries().isNull() && getFormModel().getFormHeader().getErrorItem().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0013"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
							getFormModel().getFormHeader().setErrorItem(toStr("GORVISA_NO_ENTRIES"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_VISA_DATES
		 declare
	  Alert_Info_ID            ALERT           := FIND_ALERT( 'G$_INFO_ALERT'  ) ;
    Alert_Result             NUMBER ;
    tmp1  varchar2(1) :='';						
begin
if :GORVISA_VTYP_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0014', 'FORM','Visa Type Code Must Be Entered.') );
	  go_item('GORVISA_VTYP_CODE');
	  raise form_trigger_failure;
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0015', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  go_item('gorvisa_no_entries');
    	  raise form_trigger_failure;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0016', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  go_item('gorvisa_no_entries');
    	  raise form_trigger_failure;
    end if;    	
end if;
--
if :gorvisa_visa_issue_date is not null and  :gorvisa_visa_req_date is not null then	
	  if to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD') then
	 	   message( G$_NLS.Get('GOAINTL-0017', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	   go_item('gorvisa_visa_req_date');
	 	   raise form_trigger_failure;
	 end if;
end if;
--
if :gorvisa_visa_req_date is not null then
	  if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0018', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Request Date.') );
	 	   go_item('gorvisa_visa_start_date');
	     raise form_trigger_failure;
	  end if;
	  --
	  if to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0019', 'FORM','Visa End Date Can Not Be Earlier Than Visa Request Date.') );
	 	   go_item('gorvisa_visa_expire_date');
	     raise form_trigger_failure;
    end if;
end if;
--
if :GORVISA_VISA_ISSUE_DATE is not null then
    if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0020', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Issued Date.') );
	 	   go_item('gorvisa_visa_start_date');
	     raise form_trigger_failure;
    end if;
    --
    if (to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD')) then
 	      message( G$_NLS.Get('GOAINTL-0021', 'FORM','Visa End Date Can Not Be Earlier Than Visa Issued Date.') );
 	      go_item('gorvisa_visa_expire_date');
 	      raise form_trigger_failure;
    end if;
    --
    if  :gorvisa_visa_req_date is not null 
    and (to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD')) then
	       message( G$_NLS.Get('GOAINTL-0022', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	     go_item('gorvisa_visa_req_date');
	 	     raise form_trigger_failure;
    end if;
end if;
--
if check_null_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO)  and 
													( :gorvisa.gorvisa_visa_start_date is null
													 or :gorvisa.gorvisa_visa_expire_date is null) then
													 
	 message( G$_NLS.Get('GOAINTL-0023', 'FORM','Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.') );
	 raise form_trigger_failure;	 
end if;
--
if check_expire_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO) then
	SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT,  G$_NLS.Get('GOAINTL-0024', 'FORM','Visa Information Start Date and End Date overlap with another Visa record.')   ) ;        	
  Alert_Result := SHOW_ALERT ( Alert_Info_ID ) ;
end if;
-- 71-2  added to handle Oracle unhandled exceptions
EXCEPTION
	WHEN OTHERS THEN
	    NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_VISA_DATES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_VISA_DATES")
		public void Goaintl_CheckVisaDates()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
						AlertDescriptor alertInfoId = findAlert("G$_INFO_ALERT");
						NNumber alertResult= NNumber.getNull();
						NString tmp1 = toStr("");
						try
						{
							if ( gorvisaElement.getGorvisaVtypCode().isNull() )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0014"), toStr("FORM"), toStr("Visa Type Code Must Be Entered.")));
								goItem(toStr("GORVISA_VTYP_CODE"));
								throw new ApplicationException();
							}
							// 
							if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
							{
								if ( gorvisaElement.getGorvisaNoEntries().isNull() )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0015"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
									goItem(toStr("gorvisa_no_entries"));
									throw new ApplicationException();
								}
							}
							else {
								if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0016"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
									goItem(toStr("gorvisa_no_entries"));
									throw new ApplicationException();
								}
							}
							// 
							if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() && !gorvisaElement.getGorvisaVisaReqDate().isNull() )
							{
								if ( toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0017"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
									goItem(toStr("gorvisa_visa_req_date"));
									throw new ApplicationException();
								}
							}
							// 
							if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() )
							{
								if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0018"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Request Date.")));
									goItem(toStr("gorvisa_visa_start_date"));
									throw new ApplicationException();
								}
								// 
								if ( toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0019"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Request Date.")));
									goItem(toStr("gorvisa_visa_expire_date"));
									throw new ApplicationException();
								}
							}
							// 
							if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() )
							{
								if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0020"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Issued Date.")));
									goItem(toStr("gorvisa_visa_start_date"));
									throw new ApplicationException();
								}
								// 
								if ((toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD"))))
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0021"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Issued Date.")));
									goItem(toStr("gorvisa_visa_expire_date"));
									throw new ApplicationException();
								}
								// 
								if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() && (toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD"))) )
								{
									errorMessage(GNls.Fget(toStr("GOAINTL-0022"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
									goItem(toStr("gorvisa_visa_req_date"));
									throw new ApplicationException();
								}
							}
							// 
							if ( this.getTask().getServices().checkNullDates(gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && (gorvisaElement.getGorvisaVisaStartDate().isNull() || gorvisaElement.getGorvisaVisaExpireDate().isNull()) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0023"), toStr("FORM"), toStr("Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.")));
								throw new ApplicationException();
							}
							// 
							if ( this.getTask().getServices().checkExpireDates(gorvisaElement, gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() )
							{
								setAlertMessageText(alertInfoId, GNls.Fget(toStr("GOAINTL-0024"), toStr("FORM"), toStr("Visa Information Start Date and End Date overlap with another Visa record.")));
								alertResult = toNumber(showAlert(alertInfoId));
							}
						}
						catch(Exception  e)
						{
						}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_VISA_DATES_1
		 if :GORVISA_VISS_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0025', 'FORM','Issuing Authority Code Must Be Entered.') );
	  raise form_trigger_failure;
end if;
--
if :GORVISA_VISA_START_DATE is null then
	  message( G$_NLS.Get('GOAINTL-0026', 'FORM','Visa Start Date Must Be Entered.') );
	  raise form_trigger_failure;
end if;
--
if :GORVISA_VISA_EXPIRE_DATE is null then
	  message( G$_NLS.Get('GOAINTL-0027', 'FORM','Visa End Date Must Be Entered.') );
	  raise form_trigger_failure;
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0028', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  raise form_trigger_failure;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0029', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  raise form_trigger_failure;
    end if;    	
end if;
--
if :gorvisa_visa_req_date is not null then
	  if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0030', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
	  end if;
	  --
	  if to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0031', 'FORM','Visa End Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
    end if;
end if;
--
if :gorvisa_visa_issue_date is not null and  :gorvisa_visa_req_date is not null then	
	  if to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD') then
	 	   message( G$_NLS.Get('GOAINTL-0032', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	   raise form_trigger_failure;
	 end if;
end if;
--
if :GORVISA_VISA_ISSUE_DATE is not null then
    if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0033', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Issued Date.') );
	     raise form_trigger_failure;
    end if;
    --
    if (to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD')) then
 	      message( G$_NLS.Get('GOAINTL-0034', 'FORM','Visa End Date Can Not Be Earlier Than Visa Issued Date.') );
 	      raise form_trigger_failure;
    end if;
    --
    if  :gorvisa_visa_req_date is not null 
    and (to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD')) then
	       message( G$_NLS.Get('GOAINTL-0035', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	     raise form_trigger_failure;
    end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_VISA_DATES_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_VISA_DATES_1")
		public void Goaintl_CheckVisaDates1()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( gorvisaElement.getGorvisaVissCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0025"), toStr("FORM"), toStr("Issuing Authority Code Must Be Entered.")));
						throw new ApplicationException();
					}
					// 
					if ( gorvisaElement.getGorvisaVisaStartDate().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0026"), toStr("FORM"), toStr("Visa Start Date Must Be Entered.")));
						throw new ApplicationException();
					}
					// 
					if ( gorvisaElement.getGorvisaVisaExpireDate().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0027"), toStr("FORM"), toStr("Visa End Date Must Be Entered.")));
						throw new ApplicationException();
					}
					// 
					if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
					{
						if ( gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0028"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
							throw new ApplicationException();
						}
					}
					else {
						if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0029"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
							throw new ApplicationException();
						}
					}
					// 
					if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() )
					{
						if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0030"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Request Date.")));
							throw new ApplicationException();
						}
						// 
						if ( toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0031"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Request Date.")));
							throw new ApplicationException();
						}
					}
					// 
					if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() && !gorvisaElement.getGorvisaVisaReqDate().isNull() )
					{
						if ( toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0032"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
							throw new ApplicationException();
						}
					}
					// 
					if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() )
					{
						if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0033"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Issued Date.")));
							throw new ApplicationException();
						}
						// 
						if ((toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD"))))
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0034"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Issued Date.")));
							throw new ApplicationException();
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() && (toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD"))) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0035"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.COMMIT_GORVISA
		 declare		
	  v_ignore          number;
    rg_gordocm        recordgroup;
    rg_count			     number ;
    V_GORDOCM_PIDM         	 GORDOCM.GORDOCM_PIDM%type;
 		V_GORDOCM_SEQ_NO         GORDOCM.GORDOCM_SEQ_NO%type; 
 		V_GORDOCM_VTYP_CODE      GORDOCM.GORDOCM_VTYP_CODE%type;    
 		V_GORDOCM_VISA_NUMBER    GORDOCM.GORDOCM_VISA_NUMBER%type;  
 		V_GORDOCM_DOCM_CODE      GORDOCM.GORDOCM_DOCM_CODE%type;  
 		V_GORDOCM_DISPOSITION    GORDOCM.GORDOCM_DISPOSITION%type;   
 		V_GORDOCM_USER_ID        GORDOCM.GORDOCM_USER_ID%type;    
 		V_GORDOCM_ACTIVITY_DATE  GORDOCM.GORDOCM_ACTIVITY_DATE%type; 
 		V_GORDOCM_SRCE_CODE      GORDOCM.GORDOCM_SRCE_CODE%type;     
 		V_GORDOCM_REQUEST_DATE   GORDOCM.GORDOCM_REQUEST_DATE%type;   
 		V_GORDOCM_RECEIVED_DATE  GORDOCM.GORDOCM_RECEIVED_DATE%type;  
begin	
	if :system.block_status = 'CHANGED' then
   	rg_gordocm := find_group('GORDOCM');
   	if not id_null(rg_gordocm) then
   		delete_group(rg_gordocm);
   	end if;
--
   	rg_gordocm := create_group_from_query('GORDOCM',
             'select * ' ||
             'from gordocm where GORDOCM_PIDM = ' || :gorvisa.gorvisa_pidm ||
             												' and GORDOCM_SEQ_NO = ' ||nvl(:gorvisa.gorvisa_seq_no,0) );
    v_ignore := populate_group(rg_gordocm);
    rg_count := GET_GROUP_ROW_COUNT(rg_gordocm);
--
    if rg_count >0 then
       delete from gordocm where GORDOCM_PIDM = :gorvisa.gorvisa_pidm and GORDOCM_SEQ_NO =:gorvisa.gorvisa_seq_no ;
    	 commit_form;
    	 FOR i IN 1..rg_count LOOP
					V_GORDOCM_PIDM 					:=  GET_GROUP_NUMBER_CELL  ('GORDOCM.GORDOCM_PIDM' ,i);
					V_GORDOCM_SEQ_NO  			:=  GET_GROUP_NUMBER_CELL  ('GORDOCM.GORDOCM_SEQ_NO' ,i);
					V_GORDOCM_VTYP_CODE 		:=  :gorvisa.gorvisa_vtyp_code;
					V_GORDOCM_VISA_NUMBER 	:=  :gorvisa.gorvisa_visa_number;
					V_GORDOCM_DOCM_CODE 		:=  GET_GROUP_CHAR_CELL  ('GORDOCM.GORDOCM_DOCM_CODE' ,i);
					V_GORDOCM_DISPOSITION 	:=  GET_GROUP_CHAR_CELL  ('GORDOCM.GORDOCM_DISPOSITION' ,i);
					V_GORDOCM_USER_ID 			:=  GET_GROUP_CHAR_CELL  ('GORDOCM.GORDOCM_USER_ID' ,i);
					V_GORDOCM_ACTIVITY_DATE :=  GET_GROUP_date_CELL  ('GORDOCM.GORDOCM_ACTIVITY_DATE' ,i);
					V_GORDOCM_SRCE_CODE 		:=  GET_GROUP_CHAR_CELL  ('GORDOCM.GORDOCM_SRCE_CODE' ,i);
					V_GORDOCM_REQUEST_DATE 	:=  GET_GROUP_date_CELL  ('GORDOCM.GORDOCM_REQUEST_DATE' ,i);
					V_GORDOCM_RECEIVED_DATE 	:=  GET_GROUP_date_CELL  ('GORDOCM.GORDOCM_RECEIVED_DATE' ,i);
--
  			  insert into gordocm(	GORDOCM_PIDM     			,      
																GORDOCM_SEQ_NO        , 
																GORDOCM_VTYP_CODE     , 
																GORDOCM_VISA_NUMBER   , 
																GORDOCM_DOCM_CODE     , 
																GORDOCM_DISPOSITION   , 
																GORDOCM_USER_ID       , 
																GORDOCM_ACTIVITY_DATE , 
																GORDOCM_SRCE_CODE     , 
																GORDOCM_REQUEST_DATE  , 
																GORDOCM_RECEIVED_DATE ) values
																( V_GORDOCM_PIDM        ,   
																  V_GORDOCM_SEQ_NO      ,   
																	V_GORDOCM_VTYP_CODE   ,   
																	V_GORDOCM_VISA_NUMBER ,   
																	V_GORDOCM_DOCM_CODE   ,   
																	V_GORDOCM_DISPOSITION ,   
																	V_GORDOCM_USER_ID     ,   
																	V_GORDOCM_ACTIVITY_DATE,  
																	V_GORDOCM_SRCE_CODE    ,  
																	V_GORDOCM_REQUEST_DATE ,  
																	V_GORDOCM_RECEIVED_DATE);
    	 end loop;
--
       commit;
--
				go_block('GORDOCM');
				execute_query;
				go_block('GORVISA');
    	 else 
     		commit_form;
   	end if;
--    
	end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.COMMIT_GORVISA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COMMIT_GORVISA")
		public void Goaintl_CommitGorvisa()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					int rowCount = 0;
					{
						NNumber vIgnore= NNumber.getNull();
						ValueSet rgGordocm= null;
						//NNumber rgCount= NNumber.getNull();
						int rgCount = 0;
						NNumber vGordocmPidm= NNumber.getNull();
						NNumber vGordocmSeqNo= NNumber.getNull();
						NString vGordocmVtypCode= NString.getNull();
						NString vGordocmVisaNumber= NString.getNull();
						NString vGordocmDocmCode= NString.getNull();
						NString vGordocmDisposition= NString.getNull();
						NString vGordocmUserId= NString.getNull();
						NDate vGordocmActivityDate= NDate.getNull();
						NString vGordocmSrceCode= NString.getNull();
						NDate vGordocmRequestDate= NDate.getNull();
						NDate vGordocmReceivedDate= NDate.getNull();
						if ( getBlockStatus().equals("CHANGED") )
						{
							rgGordocm = findGroup("GORDOCM");
							if ( !(rgGordocm == null) )
							{
								deleteGroup(rgGordocm);
							}
							// 
							rgGordocm = createGroupFromQuery("GORDOCM", toStr("select * ").append("from gordocm where GORDOCM_PIDM = ").append(gorvisaElement.getGorvisaPidm()).append(" and GORDOCM_SEQ_NO = ").append(isNull(gorvisaElement.getGorvisaSeqNo(), 0)));
							vIgnore = populateGroup(rgGordocm);
							rgCount = getGroupRowCount(rgGordocm);
							// 
							//if ( rgCount.greater(0) )
							if(rgCount > 0)
							{
								String sql1 = "DELETE FROM gordocm " +
		" WHERE GORDOCM_PIDM = :GORVISA_GORVISA_PIDM AND GORDOCM_SEQ_NO = :GORVISA_GORVISA_SEQ_NO";
								DataCommand command1 = new DataCommand(sql1);
								//Setting query parameters
								command1.addParameter("GORVISA_GORVISA_PIDM", gorvisaElement.getGorvisaPidm());
								command1.addParameter("GORVISA_GORVISA_SEQ_NO", gorvisaElement.getGorvisaSeqNo());
								rowCount = command1.execute();
								commitTask();
								for ( int i = 1; i <= rgCount; i++ )
								{
									vGordocmPidm = getGroupNumberCell("GORDOCM.GORDOCM_PIDM", i);
									vGordocmSeqNo = getGroupNumberCell("GORDOCM.GORDOCM_SEQ_NO", i);
									vGordocmVtypCode = gorvisaElement.getGorvisaVtypCode();
									vGordocmVisaNumber = gorvisaElement.getGorvisaVisaNumber();
									vGordocmDocmCode = getGroupCharCell("GORDOCM.GORDOCM_DOCM_CODE", i);
									vGordocmDisposition = getGroupCharCell("GORDOCM.GORDOCM_DISPOSITION", i);
									vGordocmUserId = getGroupCharCell("GORDOCM.GORDOCM_USER_ID", i);
									vGordocmActivityDate = getGroupDateCell("GORDOCM.GORDOCM_ACTIVITY_DATE", i);
									vGordocmSrceCode = getGroupCharCell("GORDOCM.GORDOCM_SRCE_CODE", i);
									vGordocmRequestDate = getGroupDateCell("GORDOCM.GORDOCM_REQUEST_DATE", i);
									vGordocmReceivedDate = getGroupDateCell("GORDOCM.GORDOCM_RECEIVED_DATE", i);
									// 
									String sql2 = "INSERT INTO gordocm " +
		"(GORDOCM_PIDM, GORDOCM_SEQ_NO, GORDOCM_VTYP_CODE, GORDOCM_VISA_NUMBER, GORDOCM_DOCM_CODE, GORDOCM_DISPOSITION, GORDOCM_USER_ID, GORDOCM_ACTIVITY_DATE, GORDOCM_SRCE_CODE, GORDOCM_REQUEST_DATE, GORDOCM_RECEIVED_DATE)" +
		"VALUES (:P_V_GORDOCM_PIDM, :P_V_GORDOCM_SEQ_NO, :P_V_GORDOCM_VTYP_CODE, :P_V_GORDOCM_VISA_NUMBER, :P_V_GORDOCM_DOCM_CODE, :P_V_GORDOCM_DISPOSITION, :P_V_GORDOCM_USER_ID, :P_V_GORDOCM_ACTIVITY_DATE, :P_V_GORDOCM_SRCE_CODE, :P_V_GORDOCM_REQUEST_DATE, :P_V_GORDOCM_RECEIVED_DATE)";
									DataCommand command2 = new DataCommand(sql2);
									//Setting query parameters
									command2.addParameter("P_V_GORDOCM_PIDM", vGordocmPidm);
									command2.addParameter("P_V_GORDOCM_SEQ_NO", vGordocmSeqNo);
									command2.addParameter("P_V_GORDOCM_VTYP_CODE", vGordocmVtypCode);
									command2.addParameter("P_V_GORDOCM_VISA_NUMBER", vGordocmVisaNumber);
									command2.addParameter("P_V_GORDOCM_DOCM_CODE", vGordocmDocmCode);
									command2.addParameter("P_V_GORDOCM_DISPOSITION", vGordocmDisposition);
									command2.addParameter("P_V_GORDOCM_USER_ID", vGordocmUserId);
									command2.addParameter("P_V_GORDOCM_ACTIVITY_DATE", vGordocmActivityDate);
									command2.addParameter("P_V_GORDOCM_SRCE_CODE", vGordocmSrceCode);
									command2.addParameter("P_V_GORDOCM_REQUEST_DATE", vGordocmRequestDate);
									command2.addParameter("P_V_GORDOCM_RECEIVED_DATE", vGordocmReceivedDate);
									rowCount = command2.execute();
								}
								commitTask();
								goBlock(toStr("GORDOCM"));
								executeQuery();
								goBlock(toStr("GORVISA"));
							}
							else {
								commitTask();
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.ASSIGN_GORVISA_VALUES
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ASSIGN_GORVISA_VALUES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ASSIGN_GORVISA_VALUES")
		public void Goaintl_AssignGorvisaValues()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.ENABLE_PAGES
		 DECLARE
page_id   TAB_PAGE;
BEGIN
       page_id := FIND_TAB_PAGE('GOAINTL_2_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'FALSE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_true );
    END IF;  
       page_id := FIND_TAB_PAGE( 'GOAINTL_3_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'FALSE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_true );
    END IF;
       page_id := FIND_TAB_PAGE( 'GOAINTL_4_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'FALSE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_true );
    END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.ENABLE_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_PAGES")
		public void Goaintl_EnablePages()
		{
			
				{
					TabPageDescriptor pageId= null;
					pageId = findTabPage("GOAINTL_2_CANVAS");
					//if ( getTabPageEnabled(pageId).equals("TRUE") )
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("GOAINTL_3_CANVAS");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
					pageId = findTabPage("GOAINTL_4_CANVAS");
					if ( !getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.DISABLE_PAGES
		 DECLARE
page_id   TAB_PAGE;
BEGIN
       page_id := FIND_TAB_PAGE('GOAINTL_2_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'TRUE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_false );
    END IF;  
       page_id := FIND_TAB_PAGE( 'GOAINTL_3_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'TRUE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_false );
    END IF;
       page_id := FIND_TAB_PAGE( 'GOAINTL_4_CANVAS' );
    IF GET_TAB_PAGE_PROPERTY( page_id, enabled ) = 'TRUE' THEN
 	     SET_TAB_PAGE_PROPERTY( page_id, enabled, property_false );
    END IF;           
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.DISABLE_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_PAGES")
		public void Goaintl_DisablePages()
		{
			
				{
					TabPageDescriptor pageId= null;
					pageId = findTabPage("GOAINTL_2_CANVAS");
					//if ( getTabPageEnabled(pageId).equals("TRUE") )
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
					pageId = findTabPage("GOAINTL_3_CANVAS");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
					pageId = findTabPage("GOAINTL_4_CANVAS");
					if ( getTabPageEnabled(pageId) )
					{
						setTabPageEnabled(pageId, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.WHEN-TAB-PAGE-CHANGED
		 DECLARE
tp_nm   VARCHAR2(30);
tp_id   TAB_PAGE;
tp_lb   VARCHAR2(30);
page_id   TAB_PAGE;
BEGIN 
	IF :system.block_status = 'CHANGED' then
	  message( G$_NLS.Get('GOAINTL-0036', 'FORM','Please Save Information before Leaving Current Block.') );
	  IF (:system.tab_previous_page = 'GOAINTL_1_CANVAS') THEN
	  	GO_ITEM ('GORVISA.GORVISA_VTYP_CODE');
	 	  END IF;
	  RAISE form_trigger_failure;
  END IF;
	tp_nm := GET_CANVAS_PROPERTY( 'GOAINTL_TAB_CANVAS', topmost_tab_page );
	if tp_nm = 'GOAINTL_1_CANVAS' then
		 EXECUTE_TRIGGER('OPTM_WIN_VISA_INFO');
		 G$_CHECK_FAILURE;
  elsif tp_nm = 'GOAINTL_2_CANVAS' then
		 EXECUTE_TRIGGER('OPTM_WIN_PASSPORT_INFO');
		 G$_CHECK_FAILURE;
	elsif tp_nm = 'GOAINTL_3_CANVAS' then
    EXECUTE_TRIGGER('OPTM_WIN_CERT_INFO') ;
    G$_CHECK_FAILURE;
  elsif tp_nm = 'GOAINTL_4_CANVAS' then
    EXECUTE_TRIGGER('OPTM_WIN_NATION_INFO') ;
    G$_CHECK_FAILURE;
  end if;
END;


         
    

    

    

    
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Goaintl_tabChange()
		{
			
				{
					NString tpNm= NString.getNull();
					TabPageDescriptor tpId= null;
					NString tpLb= NString.getNull();
					TabPageDescriptor pageId= null;
					if ( getBlockStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0036"), toStr("FORM"), toStr("Please Save Information before Leaving Current Block.")));
						if ((getTabPreviousPage().equals("GOAINTL_1_CANVAS")))
						{
							goItem(toStr("GORVISA.GORVISA_VTYP_CODE"));
						}
						throw new ApplicationException();
					}
					tpNm = getCanvasTopMostTabPage("GOAINTL_TAB_CANVAS");
					if ( tpNm.equals("GOAINTL_1_CANVAS") )
					{
						executeAction("OPTM_WIN_VISA_INFO");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tpNm.equals("GOAINTL_2_CANVAS") ) {
						executeAction("OPTM_WIN_PASSPORT_INFO");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tpNm.equals("GOAINTL_3_CANVAS") ) {
						executeAction("OPTM_WIN_CERT_INFO");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tpNm.equals("GOAINTL_4_CANVAS") ) {
						executeAction("OPTM_WIN_NATION_INFO");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_VISA_DATES_C
		 declare
	  Alert_Info_ID            ALERT           := FIND_ALERT( 'G$_INFO_ALERT'  ) ;
    Alert_Result             NUMBER ;
--
    tmp1  varchar2(1) :='';
begin
if :GORVISA_VTYP_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0037', 'FORM','Visa Type Code Must Be Entered.') );
	  raise form_trigger_failure;
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0038', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  raise form_trigger_failure;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0039', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  raise form_trigger_failure;
    end if;    	
end if;
--
if :gorvisa_visa_issue_date is not null and  :gorvisa_visa_req_date is not null then	
	  if to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD') then
	 	   message( G$_NLS.Get('GOAINTL-0040', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	   raise form_trigger_failure;
	 end if;
end if;
--
if :gorvisa_visa_req_date is not null then
	  if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0041', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
	  end if;
	  --
	  if to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_REQ_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0042', 'FORM','Visa End Date Can Not Be Earlier Than Visa Request Date.') );
	     raise form_trigger_failure;
    end if;
end if;
--
if :GORVISA_VISA_ISSUE_DATE is not null then
    if to_char(:GORVISA_VISA_START_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD') then
 	     message( G$_NLS.Get('GOAINTL-0043', 'FORM','Visa Start Date Can Not Be Earlier Than Visa Issued Date.') );
	     raise form_trigger_failure;
    end if;
    --
    if (to_char(:GORVISA_VISA_EXPIRE_DATE,'YYYYMMDD') < to_char(:GORVISA_VISA_ISSUE_DATE,'YYYYMMDD')) then
 	      message( G$_NLS.Get('GOAINTL-0044', 'FORM','Visa End Date Can Not Be Earlier Than Visa Issued Date.') );
 	      raise form_trigger_failure;
    end if;
    --
    if  :gorvisa_visa_req_date is not null 
    and (to_char(:gorvisa_visa_issue_date,'YYYYMMDD') < to_char(:gorvisa_visa_req_date,'YYYYMMDD')) then
	       message( G$_NLS.Get('GOAINTL-0045', 'FORM','Visa Request Date Can Not Be Later Than Visa Issued Date') );
	 	     raise form_trigger_failure;
    end if;
end if;
--
if check_null_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO)  and 
													( :gorvisa.gorvisa_visa_start_date is null
													 or :gorvisa.gorvisa_visa_expire_date is null) then
													
	 message( G$_NLS.Get('GOAINTL-0046', 'FORM','Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.') );
	 raise form_trigger_failure;	 
end if;
--
if check_expire_dates (:GORVISA.GORVISA_PIDM, :GORVISA.GORVISA_SEQ_NO) then
	SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT,  G$_NLS.Get('GOAINTL-0047', 'FORM','Start and end Visa Dates overlap with another Visa record.')   ) ;        	
  Alert_Result := SHOW_ALERT ( Alert_Info_ID ) ;
-- 71-2
--  raise form_trigger_failure;	 
end if;
-- 71-2  added to handle Oracle unhandled exceptions
EXCEPTION
	WHEN OTHERS THEN
	    NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_VISA_DATES_C
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_VISA_DATES_C")
		public void Goaintl_CheckVisaDatesC()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					AlertDescriptor alertInfoId = findAlert("G$_INFO_ALERT");
					NNumber alertResult= NNumber.getNull();
					// 
					NString tmp1 = toStr("");
					try
					{
						if ( gorvisaElement.getGorvisaVtypCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0037"), toStr("FORM"), toStr("Visa Type Code Must Be Entered.")));
							throw new ApplicationException();
						}
						// 
						if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
						{
							if ( gorvisaElement.getGorvisaNoEntries().isNull() )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0038"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
								throw new ApplicationException();
							}
						}
						else {
							if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0039"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() && !gorvisaElement.getGorvisaVisaReqDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0040"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0041"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Request Date.")));
								throw new ApplicationException();
							}
							// 
							if ( toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0042"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Request Date.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( !gorvisaElement.getGorvisaVisaIssueDate().isNull() )
						{
							if ( toChar(gorvisaElement.getGorvisaVisaStartDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD")) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0043"), toStr("FORM"), toStr("Visa Start Date Can Not Be Earlier Than Visa Issued Date.")));
								throw new ApplicationException();
							}
							// 
							if ((toChar(gorvisaElement.getGorvisaVisaExpireDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD"))))
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0044"), toStr("FORM"), toStr("Visa End Date Can Not Be Earlier Than Visa Issued Date.")));
								throw new ApplicationException();
							}
							// 
							if ( !gorvisaElement.getGorvisaVisaReqDate().isNull() && (toChar(gorvisaElement.getGorvisaVisaIssueDate(), "YYYYMMDD").lesser(toChar(gorvisaElement.getGorvisaVisaReqDate(), "YYYYMMDD"))) )
							{
								errorMessage(GNls.Fget(toStr("GOAINTL-0045"), toStr("FORM"), toStr("Visa Request Date Can Not Be Later Than Visa Issued Date")));
								throw new ApplicationException();
							}
						}
						// 
						if ( this.getTask().getServices().checkNullDates(gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() && (gorvisaElement.getGorvisaVisaStartDate().isNull() || gorvisaElement.getGorvisaVisaExpireDate().isNull()) )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0046"), toStr("FORM"), toStr("Another Visa with unspecified dates exists.  Change or delete it before adding a  new Visa record.")));
							throw new ApplicationException();
						}
						// 
						if ( this.getTask().getServices().checkExpireDates(gorvisaElement, gorvisaElement.getGorvisaPidm(), gorvisaElement.getGorvisaSeqNo()).getValue() )
						{
							setAlertMessageText(alertInfoId, GNls.Fget(toStr("GOAINTL-0047"), toStr("FORM"), toStr("Start and end Visa Dates overlap with another Visa record.")));
							alertResult = toNumber(showAlert(alertInfoId));
						}
					}
					catch(Exception  e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAINTL.CHECK_GORVISA_C
		 if :GORVISA_VTYP_CODE is null then
	  message( G$_NLS.Get('GOAINTL-0048', 'FORM','Visa Type Code Must Be Entered.') );
	  raise form_trigger_failure;
end if;
--
if :gorvisa_entry_ind = 'Y' then
    if :gorvisa_no_entries is null then
    	  message( G$_NLS.Get('GOAINTL-0049', 'FORM','Number of Entries is Required When Entry Indicator is Checked') );
    	  raise form_trigger_failure;
    end if;
else
    if :gorvisa_no_entries is not null then
    	  message( G$_NLS.Get('GOAINTL-0050', 'FORM','Number of Entries Must be Null When Entry Indicator is Not Checked') );
    	  raise form_trigger_failure;
    end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAINTL.CHECK_GORVISA_C
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_GORVISA_C")
		public void Goaintl_CheckGorvisaC()
		{
				GorvisaAdapter gorvisaElement = (GorvisaAdapter)this.getFormModel().getGorvisa().getRowAdapter(true);
				if(gorvisaElement != null)
				{
					if ( gorvisaElement.getGorvisaVtypCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAINTL-0048"), toStr("FORM"), toStr("Visa Type Code Must Be Entered.")));
						throw new ApplicationException();
					}
					// 
					if ( gorvisaElement.getGorvisaEntryInd().equals("Y") )
					{
						if ( gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0049"), toStr("FORM"), toStr("Number of Entries is Required When Entry Indicator is Checked")));
							throw new ApplicationException();
						}
					}
					else {
						if ( !gorvisaElement.getGorvisaNoEntries().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GOAINTL-0050"), toStr("FORM"), toStr("Number of Entries Must be Null When Entry Indicator is Not Checked")));
							throw new ApplicationException();
						}
					}
				}
			}

		
	
}
	
