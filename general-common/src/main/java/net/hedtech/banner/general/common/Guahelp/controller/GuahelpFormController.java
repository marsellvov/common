package net.hedtech.banner.general.common.Guahelp.controller;
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
import net.hedtech.banner.general.common.Guahelp.model.*;
import net.hedtech.banner.general.common.Guahelp.*;
import net.hedtech.banner.general.common.Guahelp.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GuahelpFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GuahelpFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuahelpTask getTask() {
		return (GuahelpTask)super.getTask();
	}
	
	
	public GuahelpModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guahelp_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guahelp_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guahelp_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guahelp_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guahelp_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guahelp_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guahelp_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guahelp_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guahelp_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guahelp_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guahelp_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guahelp_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guahelp_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guahelp_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guahelp_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guahelp_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guahelp_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guahelp_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guahelp_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guahelp_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guahelp_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guahelp_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guahelp_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guahelp_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guahelp_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guahelp_ClearTask()
		{
			
				getGFormClass().clearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guahelp_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guahelp_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guahelp_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guahelp_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guahelp_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guahelp_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guahelp_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guahelp_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guahelp_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guahelp_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guahelp_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guahelp_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guahelp_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guahelp_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guahelp_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guahelp_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guahelp_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guahelp_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guahelp_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guahelp_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guahelp_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guahelp_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guahelp_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guahelp_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guahelp_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.ENABLE_KEYS
		 -- This trigger is here soley for the purpose that the class
-- that it inherits from calls this when a clear form is performed
-- so this must be present so that the form works.

null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guahelp_EnableKeys()
		{
			
				//  This trigger is here soley for the purpose that the class
				//  that it inherits from calls this when a clear form is performed
				//  so this must be present so that the form works.
				//  This trigger is here soley for the purpose that the class
				//  that it inherits from calls this when a clear form is performed
				//  so this must be present so that the form works.
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.FIND_HELP
		 BEGIN
  :HELP_COMMENT := '';
  :HELP_IND := '';
--
  IF :HELP_SEL = 'F' THEN
    EXECUTE_TRIGGER('FORMLEVEL');
  ELSIF :HELP_SEL = 'B' THEN
    EXECUTE_TRIGGER('BLOCKLEVEL');
  ELSE
    EXECUTE_TRIGGER('FIELDLEVEL');
  END IF;
--
  :HOLD_COMMENT := :HELP_COMMENT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.FIND_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FIND_HELP")
		public void Guahelp_FindHelp()
		{
			
				getFormModel().getShowHelp().setHelpComment(toClob(""));
				getFormModel().getShowHelp().setHelpInd(toStr(""));
				// 
				if ( getFormModel().getDisplayHelp().getHelpSel().equals("F") )
				{
					executeAction("FORMLEVEL");
				}
				else if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") ) {
					executeAction("BLOCKLEVEL");
				}
				else {
					executeAction("FIELDLEVEL");
				}
				// 
				getFormModel().getShowHelp().setHoldComment(toStr(getFormModel().getShowHelp().getHelpComment()));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.POST_FORM_TRG
		 BEGIN
  :GLOBAL.HELP_UPD := 'Y';
--
  :GLOBAL.HELP_FORM := '';
  :GLOBAL.HELP_BLOCK := '';
  :GLOBAL.HELP_FIELD := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guahelp_PostFormTrg()
		{
			
				setGlobal("HELP_UPD", toStr("Y"));
				// 
				setGlobal("HELP_FORM", toStr(""));
				setGlobal("HELP_BLOCK", toStr(""));
				setGlobal("HELP_FIELD", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.WHEN-NEW-FORM-INSTANCE
		 DECLARE
  Y_LINE  NUMBER(3);
  POS_X   NUMBER(3);
  POS_Y   NUMBER(3);
BEGIN
  DEFAULT_VALUE('0','GLOBAL.QUERY_MODE');
  DEFAULT_VALUE('','GLOBAL.HELP_FORM');
  DEFAULT_VALUE('','GLOBAL.HELP_BLOCK');
  DEFAULT_VALUE('','GLOBAL.HELP_FIELD');
  DEFAULT_VALUE('','GLOBAL.HELP_UPD');
--
  :DISPLAY_HELP.HELP_FORM := :GLOBAL.HELP_FORM;
  :DISPLAY_HELP.HELP_BLOCK := :GLOBAL.HELP_BLOCK;
  :DISPLAY_HELP.HELP_FIELD := :GLOBAL.HELP_FIELD;
  :DISPLAY_HELP.HELP_TYPE := 'L';
  :DISPLAY_HELP.HELP_SEL := 'I';
--
  IF :HELP_FORM IS NOT NULL THEN
    GO_ITEM('DISPLAY_HELP.HELP_TYPE');
  ELSE
    GO_ITEM('DISPLAY_HELP.HELP_FORM');
  END IF;
--
  DEFAULT_VALUE('','GLOBAL.WIN_TITLE');
  DEFAULT_VALUE('','GLOBAL.WIN_X_POS');
  DEFAULT_VALUE('','GLOBAL.WIN_Y_POS');
--
  IF :GLOBAL.WIN_TITLE IS NOT NULL THEN
    SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,NAME_IN('GLOBAL.WIN_TITLE'));
  END IF;
--
  POS_X := TO_NUMBER(:GLOBAL.WIN_X_POS);
  POS_Y := TO_NUMBER(:GLOBAL.WIN_Y_POS);
--
-- If there is an POS_X then help is being called from another form so 
-- display it in the center of the screen with the navigation frame.  Otherwise
-- if POS_X is null then help is being called from the menu, guainit or direct access
-- so center the window without the navigation frame
--
  IF POS_X IS NOT NULL THEN 
    SHOW_WINDOW('GUAHELP_WINDOW',90,90);
  ELSE
    SHOW_WINDOW('GUAHELP_WINDOW',150,115);
  END IF;
--
-- Reset the global value to null so that if help is called from the menu while a form is 
-- open it will still get centered properly
--
  :GLOBAL.WIN_X_POS := NULL;
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
--
  SET_MENU_ITEM_PROPERTY('BLOCK.PREVIOUS',ENABLED,PROPERTY_OFF);
--
  :GLOBAL.QUERY_MODE := '1';
--
  IF :GLOBAL.HELP_UPD = 'Y' THEN
    SET_ITEM_PROPERTY('DISPLAY_HELP.GUAHELP_FIND_BTN',LABEL,G$_NLS.Get('GUAHELP-0000','FORM','Edit'));
    SET_ITEM_PROPERTY('SHOW_HELP.HELP_COMMENT',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('SHOW_HELP.HELP_COMMENT',UPDATEABLE,PROPERTY_ON);
  ELSE
    SET_MENU_ITEM_PROPERTY('ACTION.SAVE',ENABLED,PROPERTY_OFF);
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guahelp_TaskStarted(EventObject args)
		{
			
				{
					NNumber yLine= NNumber.getNull();
					NNumber posX= NNumber.getNull();
					NNumber posY= NNumber.getNull();
					try
					{
						setDefaultValue("0", "GLOBAL.QUERY_MODE");
						setDefaultValue("", "GLOBAL.HELP_FORM");
						setDefaultValue("", "GLOBAL.HELP_BLOCK");
						setDefaultValue("", "GLOBAL.HELP_FIELD");
						setDefaultValue("", "GLOBAL.HELP_UPD");
						// 
						getFormModel().getDisplayHelp().setHelpForm(getGlobal("HELP_FORM"));
						getFormModel().getDisplayHelp().setHelpBlock(getGlobal("HELP_BLOCK"));
						getFormModel().getDisplayHelp().setHelpField(getGlobal("HELP_FIELD"));
						getFormModel().getDisplayHelp().setHelpType(toStr("L"));
						getFormModel().getDisplayHelp().setHelpSel(toStr("I"));
						// 
						if ( !getFormModel().getDisplayHelp().getHelpForm().isNull() )
						{
							goItem(toStr("DISPLAY_HELP.HELP_TYPE"));
						}
						else {
							goItem(toStr("DISPLAY_HELP.HELP_FORM"));
						}
						// 
						setDefaultValue("", "GLOBAL.WIN_TITLE");
						setDefaultValue("", "GLOBAL.WIN_X_POS");
						setDefaultValue("", "GLOBAL.WIN_Y_POS");
						// 
						if ( !getGlobal("WIN_TITLE").isNull() )
						{
							setWindowTitle("MAIN_WINDOW", getNameIn("GLOBAL.WIN_TITLE"));
						}
						// 
						posX = toNumber(getGlobal("WIN_X_POS"));
						posY = toNumber(getGlobal("WIN_Y_POS"));
						// 
						//  If there is an POS_X then help is being called from another form so 
						//  display it in the center of the screen with the navigation frame.  Otherwise
						//  if POS_X is null then help is being called from the menu, guainit or direct access
						//  so center the window without the navigation frame
						// 
						if ( !posX.isNull() )
						{
							showWindow(toStr("GUAHELP_WINDOW"));
						}
						else {
							showWindow(toStr("GUAHELP_WINDOW"));
						}
						// 
						//  Reset the global value to null so that if help is called from the menu while a form is 
						//  open it will still get centered properly
						// 
						setGlobal("WIN_X_POS", toStr(null));
						getTask().getGoqrpls().gSetInstProperty();
						getTask().getGoqrpls().gSetWinProperty();
						// 
						setMenuItemEnabled("BLOCK.PREVIOUS", false);
						// 
						setGlobal("QUERY_MODE", toStr("1"));
						// 
						if ( getGlobal("HELP_UPD").equals("Y") )
						{
							setItemLabel(toStr("DISPLAY_HELP.GUAHELP_FIND_BTN"), GNls.Fget(toStr("GUAHELP-0000"), toStr("FORM"), toStr("Edit")));
							setItemEnabled("SHOW_HELP.HELP_COMMENT", true);
							setItemUpdateAllowed("SHOW_HELP.HELP_COMMENT", true);
						}
						else {
							setMenuItemEnabled("ACTION.SAVE", false);
						}
					}
					catch(Exception  e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guahelp_LoadCurrentRelease()
		{
			
				getFormModel().getDisplayHelp().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-NXTREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guahelp_NextRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-PRVREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guahelp_PreviousRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.FIELD_HELP
		 DECLARE
-- 74-1 increase local variable size to match database column size
--  COL_COMMENT  VARCHAR2(355);
  COL_COMMENT  VARCHAR2(4000);
  X_OWNER_NAME VARCHAR2(30);
  only_non_db  VARCHAR2(1);
  error_msg    VARCHAR2(80);
  SUBSTR_LEN   NUMBER(2) := INSTR(:DISPLAY_HELP.HELP_FIELD,'_') - 1;
--
  CURSOR COL_COMMENT_CUR IS
    SELECT comments 
      FROM all_col_comments
     WHERE table_name = SUBSTR(:display_help.help_field,1,SUBSTR_LEN)
       AND column_name = :display_help.help_field
       AND owner = x_owner_name;
--
BEGIN
  only_non_db:='N';
  IF SUBSTR(:DISPLAY_HELP.HELP_FORM,1,2) = 'FX' THEN
    X_OWNER_NAME := 'FIMSARC';
  ELSE
    X_OWNER_NAME := SELECT_OWNER_NAME(SUBSTR(:HELP_FIELD,1,SUBSTR_LEN));
  END IF;
--
  IF :global.db_field = 'Y' THEN
    BEGIN
      OPEN COL_COMMENT_CUR;
      FETCH COL_COMMENT_CUR INTO col_comment;
      CLOSE COL_COMMENT_CUR;
--
    EXCEPTION
     WHEN too_many_rows THEN
        MESSAGE( G$_NLS.Get('GUAHELP-0001', 'FORM',
	'*ERROR* Table %01% is defined under multiple owners' 
                       
	,  SUBSTR(:help_field,1,SUBSTR_LEN) ));
        RAISE FORM_TRIGGER_FAILURE;
    END;
--
  ELSIF :global.db_field = 'U' THEN
    BEGIN
      OPEN COL_COMMENT_CUR;
      FETCH COL_COMMENT_CUR INTO col_comment;
      IF COL_COMMENT_CUR%NOTFOUND THEN
        col_comment := 'NON-DATABASE FIELD';
        only_non_db := 'Y';
      END IF;
      CLOSE COL_COMMENT_CUR;
    EXCEPTION
      WHEN too_many_rows THEN
        MESSAGE( G$_NLS.Get('GUAHELP-0002', 'FORM',
	'*ERROR* Table %01% is defined under multiple owners' 
                       
	,  SUBSTR(:help_field,1,SUBSTR_LEN) ));
        RAISE FORM_TRIGGER_FAILURE;
    END;
ELSE
    col_comment := 'NON-DATABASE FIELD';
    only_non_db:='Y';
  END IF;
--
  IF col_comment IS NOT NULL THEN
    col_comment :=  G$_NLS.Get('GUAHELP-0003','FORM','------------------------ FIELD DESCRIPTION ------------------------- %01% %02%',CHR(10),COL_COMMENT);
  END IF;
--
  IF col_comment IS NOT NULL THEN
    :show_help.help_comment := col_comment || CHR(10)
       || '------------------------- FIELD USAGE NOTES -------------------------'
       || CHR(10) || :show_help.help_comment;
  END IF;
--
  EXCEPTION
  WHEN NO_DATA_FOUND THEN
    IF ONLY_NON_DB = 'N' THEN
      :help_comment:=col_comment;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.FIELD_HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FIELD_HELP")
		public void Guahelp_FieldHelp()
		{
			
				int rowCount = 0;
				{
					//  74-1 increase local variable size to match database column size
					//   COL_COMMENT  VARCHAR2(355);
					NString colComment= NString.getNull();
					NString xOwnerName= NString.getNull();
					NString onlyNonDb= NString.getNull();
					NString errorMsg= NString.getNull();
					NNumber substrLen = toNumber(inStr(getFormModel().getDisplayHelp().getHelpField(), toStr("_")).subtract(1));
					String sqlcolCommentCur = "SELECT comments " +
	" FROM all_col_comments " +
	" WHERE table_name = SUBSTR(:DISPLAY_HELP_HELP_FIELD, 1, :P_SUBSTR_LEN) AND column_name = :DISPLAY_HELP_HELP_FIELD AND owner = :P_X_OWNER_NAME ";
					DataCursor colCommentCur = new DataCursor(sqlcolCommentCur);
					try
					{
						onlyNonDb = toStr("N");
						if ( substring(getFormModel().getDisplayHelp().getHelpForm(), toInt(1), toInt(2)).equals("FX") )
						{
							xOwnerName = toStr("FIMSARC");
						}
						else {
							xOwnerName = this.getTask().getServices().selectOwnerName(substring(getFormModel().getDisplayHelp().getHelpField(), toInt(1), toInt(substrLen)));
						}
						// 
						if ( getGlobal("DB_FIELD").equals("Y") )
						{
							try {
								try
								{
									//Setting query parameters
									colCommentCur.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
									colCommentCur.addParameter("P_SUBSTR_LEN", substrLen);
									colCommentCur.addParameter("P_X_OWNER_NAME", xOwnerName);
									colCommentCur.open();
									ResultSet colCommentCurResults = colCommentCur.fetchInto();
									if ( colCommentCurResults != null ) {
										colComment = colCommentCurResults.getStr(0);
									}
									colCommentCur.close();
								}
								catch(TooManyRowsException e)
								{
									errorMessage(GNls.Fget(toStr("GUAHELP-0001"), toStr("FORM"), toStr("*ERROR* Table %01% is defined under multiple owners"), substring(getFormModel().getDisplayHelp().getHelpField(), toInt(1), toInt(substrLen))));
									throw new ApplicationException();
								}
								}finally{
									colCommentCur.close();
								}
						}
						else if ( getGlobal("DB_FIELD").equals("U") ) {
							try {
								try
								{
									//Setting query parameters
									colCommentCur.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
									colCommentCur.addParameter("P_SUBSTR_LEN", substrLen);
									colCommentCur.addParameter("P_X_OWNER_NAME", xOwnerName);
									colCommentCur.open();
									ResultSet colCommentCurResults = colCommentCur.fetchInto();
									if ( colCommentCurResults != null ) {
										colComment = colCommentCurResults.getStr(0);
									}
									if ( colCommentCur.notFound() )
									{
										colComment = toStr("NON-DATABASE FIELD");
										onlyNonDb = toStr("Y");
									}
									colCommentCur.close();
								}
								catch(TooManyRowsException e)
								{
									errorMessage(GNls.Fget(toStr("GUAHELP-0002"), toStr("FORM"), toStr("*ERROR* Table %01% is defined under multiple owners"), substring(getFormModel().getDisplayHelp().getHelpField(), toInt(1), toInt(substrLen))));
									throw new ApplicationException();
								}
								}finally{
									colCommentCur.close();
								}
						}
						else {
							colComment = toStr("NON-DATABASE FIELD");
							onlyNonDb = toStr("Y");
						}
						// 
						if ( !colComment.isNull() )
						{
							colComment = GNls.Fget(toStr("GUAHELP-0003"), toStr("FORM"), toStr("------------------------ FIELD DESCRIPTION ------------------------- %01% %02%"), chr(10), colComment);
						}
						// 
						if ( !colComment.isNull() )
						{
							getFormModel().getShowHelp().setHelpComment(toClob(
									colComment.append(chr(10))
									.append("------------------------- FIELD USAGE NOTES -------------------------")
									.append(chr(10)).append(getFormModel().getShowHelp().getHelpComment())));
						}
					}
					catch(NoDataFoundException e)
					{
						if ( onlyNonDb.equals("N") )
						{
							getFormModel().getShowHelp().setHelpComment(toClob(colComment));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-DELREC
		 :HELP_COMMENT := '';
:HELP_CHG := 'Y';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Guahelp_DeleteRecord()
		{
			
				getFormModel().getShowHelp().setHelpComment(toClob(""));
				getFormModel().getShowHelp().setHelpChg(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-COMMIT
		 DECLARE
  HLP_BLOCK       VARCHAR2(30);
  HLP_FIELD       VARCHAR2(30);
BEGIN
  HLP_BLOCK := '%';
  HLP_FIELD := '%';
--
  IF :HELP_SEL = 'B' THEN
    HLP_BLOCK := :HELP_BLOCK;
  ELSIF :HELP_SEL = 'I' THEN
    HLP_BLOCK := :HELP_BLOCK;
    HLP_FIELD := :HELP_FIELD;
  END IF;  
--
  IF :HELP_COMMENT IS NULL THEN  
    IF :HELP_TYPE = 'B' THEN
      DELETE GUBBHLP
       WHERE GUBBHLP_FORM_NAME = :DISPLAY_HELP.HELP_FORM
         AND NVL(GUBBHLP_BLOCK_NAME,'%') = HLP_BLOCK
         AND NVL(GUBBHLP_FIELD_NAME,'%') = HLP_FIELD;
    ELSE
      DELETE GUBLHLP
       WHERE GUBLHLP_FORM_NAME = :DISPLAY_HELP.HELP_FORM
         AND NVL(GUBLHLP_BLOCK_NAME,'%') = HLP_BLOCK
         AND NVL(GUBLHLP_FIELD_NAME,'%') = HLP_FIELD;
    END IF;
    GOTO SAVE_TRIG;
  END IF;
--
  IF :HELP_TYPE = 'B' THEN
    UPDATE GUBBHLP
       SET GUBBHLP_TEXT = :SHOW_HELP.HELP_COMMENT,
           GUBBHLP_ACTIVITY_DATE = SYSDATE
     WHERE GUBBHLP_FORM_NAME = :DISPLAY_HELP.HELP_FORM
       AND NVL(GUBBHLP_BLOCK_NAME,'%') = HLP_BLOCK
       AND NVL(GUBBHLP_FIELD_NAME,'%') = HLP_FIELD;
  ELSE
    UPDATE GUBLHLP
       SET GUBLHLP_TEXT = :SHOW_HELP.HELP_COMMENT,
           GUBLHLP_ACTIVITY_DATE = SYSDATE
     WHERE GUBLHLP_FORM_NAME = :DISPLAY_HELP.HELP_FORM
       AND NVL(GUBLHLP_BLOCK_NAME,'%') = HLP_BLOCK
       AND NVL(GUBLHLP_FIELD_NAME,'%') = HLP_FIELD;
  END IF;
  IF SQL%ROWCOUNT = 0 THEN
    IF :DISPLAY_HELP.HELP_TYPE = 'B' THEN
       INSERT INTO GUBBHLP
              (GUBBHLP_FORM_NAME,GUBBHLP_BLOCK_NAME,GUBBHLP_FIELD_NAME,
               GUBBHLP_TEXT,GUBBHLP_ACTIVITY_DATE)
       VALUES (:DISPLAY_HELP.HELP_FORM,
               DECODE(HLP_BLOCK,'%','',:DISPLAY_HELP.HELP_BLOCK),
               DECODE(HLP_FIELD,'%','',:DISPLAY_HELP.HELP_FIELD),
               :SHOW_HELP.HELP_COMMENT,SYSDATE);
    ELSE
      INSERT INTO GUBLHLP
             (GUBLHLP_FORM_NAME,GUBLHLP_BLOCK_NAME,GUBLHLP_FIELD_NAME,
              GUBLHLP_TEXT,GUBLHLP_ACTIVITY_DATE)
      VALUES (:HELP_FORM,
              DECODE(HLP_BLOCK,'%','',:DISPLAY_HELP.HELP_BLOCK),
              DECODE(HLP_FIELD,'%','',:DISPLAY_HELP.HELP_FIELD),
              :SHOW_HELP.HELP_COMMENT,SYSDATE);
    END IF;
  END IF;
--
<< SAVE_TRIG >>
--
  :HELP_CHG := 'N';
  :SYSTEM.MESSAGE_LEVEL := '5';
  COMMIT_FORM;
  :SYSTEM.MESSAGE_LEVEL := '0';
  G$_CHECK_FAILURE;
-- 52-1 spelling error
--  IF G$_DISPLAY_ALERT('INFO_ALERT','One record processed sucessfully') IS NOT NULL THEN
  IF G$_DISPLAY_ALERT('INFO_ALERT', G$_NLS.Get('GUAHELP-0004', 'FORM','One record processed successfully') ) IS NOT NULL THEN
      EXECUTE_TRIGGER('FIND_HELP');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Guahelp_Save()
		{
			
				int rowCount = 0;
				{
					NString hlpBlock= NString.getNull();
					NString hlpField= NString.getNull();
					hlpBlock = toStr("%");
					hlpField = toStr("%");
					// 
					if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") )
					{
						hlpBlock = getFormModel().getDisplayHelp().getHelpBlock();
					}
					else if ( getFormModel().getDisplayHelp().getHelpSel().equals("I") ) {
						hlpBlock = getFormModel().getDisplayHelp().getHelpBlock();
						hlpField = getFormModel().getDisplayHelp().getHelpField();
					}
					// 
					if ( getFormModel().getShowHelp().getHelpComment().isNull() )
					{
						if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
						{
							String sql1 = "DELETE FROM GUBBHLP " +
	" WHERE GUBBHLP_FORM_NAME = :DISPLAY_HELP_HELP_FORM AND NVL(GUBBHLP_BLOCK_NAME, '%') = :P_HLP_BLOCK AND NVL(GUBBHLP_FIELD_NAME, '%') = :P_HLP_FIELD";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
							command1.addParameter("P_HLP_BLOCK", hlpBlock);
							command1.addParameter("P_HLP_FIELD", hlpField);
							rowCount = command1.execute();
						}
						else {
							String sql2 = "DELETE FROM GUBLHLP " +
	" WHERE GUBLHLP_FORM_NAME = :DISPLAY_HELP_HELP_FORM AND NVL(GUBLHLP_BLOCK_NAME, '%') = :P_HLP_BLOCK AND NVL(GUBLHLP_FIELD_NAME, '%') = :P_HLP_FIELD";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
							command2.addParameter("P_HLP_BLOCK", hlpBlock);
							command2.addParameter("P_HLP_FIELD", hlpField);
							rowCount = command2.execute();
						}
//						GOTO SAVE_TRIG;
						getFormModel().getShowHelp().setHelpChg(toStr("N"));
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						commitTask();
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						getTask().getGoqrpls().gCheckFailure();
						//  52-1 spelling error
						//   IF G$_DISPLAY_ALERT('INFO_ALERT','One record processed sucessfully') IS NOT NULL THEN
						if ( !getTask().getGoqrpls().gDisplayAlert(toStr("INFO_ALERT"), GNls.Fget(toStr("GUAHELP-0004"), toStr("FORM"), toStr("One record processed successfully"))).isNull() )
						{
							executeAction("FIND_HELP");
						}
						return;
					}
					// 
					if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
					{
						String sql3 = "UPDATE GUBBHLP " +
	"SET GUBBHLP_TEXT = :SHOW_HELP_HELP_COMMENT, GUBBHLP_ACTIVITY_DATE = SYSDATE " +
	" WHERE GUBBHLP_FORM_NAME = :DISPLAY_HELP_HELP_FORM AND NVL(GUBBHLP_BLOCK_NAME, '%') = :P_HLP_BLOCK AND NVL(GUBBHLP_FIELD_NAME, '%') = :P_HLP_FIELD";
						DataCommand command3 = new DataCommand(sql3);
						//Setting query parameters
						command3.addParameter("SHOW_HELP_HELP_COMMENT", getFormModel().getShowHelp().getHelpComment());
						command3.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command3.addParameter("P_HLP_BLOCK", hlpBlock);
						command3.addParameter("P_HLP_FIELD", hlpField);
						rowCount = command3.execute();
					}
					else {
						String sql4 = "UPDATE GUBLHLP " +
	"SET GUBLHLP_TEXT = :SHOW_HELP_HELP_COMMENT, GUBLHLP_ACTIVITY_DATE = SYSDATE " +
	" WHERE GUBLHLP_FORM_NAME = :DISPLAY_HELP_HELP_FORM AND NVL(GUBLHLP_BLOCK_NAME, '%') = :P_HLP_BLOCK AND NVL(GUBLHLP_FIELD_NAME, '%') = :P_HLP_FIELD";
						DataCommand command4 = new DataCommand(sql4);
						//Setting query parameters
						command4.addParameter("SHOW_HELP_HELP_COMMENT", getFormModel().getShowHelp().getHelpComment());
						command4.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command4.addParameter("P_HLP_BLOCK", hlpBlock);
						command4.addParameter("P_HLP_FIELD", hlpField);
						rowCount = command4.execute();
					}
					if ( rowCount == 0 )
					{
						if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
						{
							String sql5 = "INSERT INTO GUBBHLP " +
	"(GUBBHLP_FORM_NAME, GUBBHLP_BLOCK_NAME, GUBBHLP_FIELD_NAME, GUBBHLP_TEXT, GUBBHLP_ACTIVITY_DATE)" +
	"VALUES (:DISPLAY_HELP_HELP_FORM, DECODE(:P_HLP_BLOCK, '%', '', :DISPLAY_HELP_HELP_BLOCK), DECODE(:P_HLP_FIELD, '%', '', :DISPLAY_HELP_HELP_FIELD), :SHOW_HELP_HELP_COMMENT, SYSDATE)";
							DataCommand command5 = new DataCommand(sql5);
							//Setting query parameters
							command5.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
							command5.addParameter("P_HLP_BLOCK", hlpBlock);
							command5.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
							command5.addParameter("P_HLP_FIELD", hlpField);
							command5.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
							command5.addParameter("SHOW_HELP_HELP_COMMENT", getFormModel().getShowHelp().getHelpComment());
							rowCount = command5.execute();
						}
						else {
							String sql6 = "INSERT INTO GUBLHLP " +
	"(GUBLHLP_FORM_NAME, GUBLHLP_BLOCK_NAME, GUBLHLP_FIELD_NAME, GUBLHLP_TEXT, GUBLHLP_ACTIVITY_DATE)" +
	"VALUES (:HELP_FORM, DECODE(:P_HLP_BLOCK, '%', '', :DISPLAY_HELP_HELP_BLOCK), DECODE(:P_HLP_FIELD, '%', '', :DISPLAY_HELP_HELP_FIELD), :SHOW_HELP_HELP_COMMENT, SYSDATE)";
							DataCommand command6 = new DataCommand(sql6);
							//Setting query parameters
							command6.addParameter("HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
							command6.addParameter("P_HLP_BLOCK", hlpBlock);
							command6.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
							command6.addParameter("P_HLP_FIELD", hlpField);
							command6.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
							command6.addParameter("SHOW_HELP_HELP_COMMENT", getFormModel().getShowHelp().getHelpComment());
							rowCount = command6.execute();
						}
					
					}
//					GOTO SAVE_TRIG;
					getFormModel().getShowHelp().setHelpChg(toStr("N"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					commitTask();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					getTask().getGoqrpls().gCheckFailure();
					//  52-1 spelling error
					//   IF G$_DISPLAY_ALERT('INFO_ALERT','One record processed sucessfully') IS NOT NULL THEN
					if ( !getTask().getGoqrpls().gDisplayAlert(toStr("INFO_ALERT"), GNls.Fget(toStr("GUAHELP-0004"), toStr("FORM"), toStr("One record processed successfully"))).isNull() )
					{
						executeAction("FIND_HELP");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-NXTBLK
		 DECLARE
  WIN_Y   NUMBER;
BEGIN
  DEFAULT_VALUE('0','GLOBAL.Y_LINE');
  WIN_Y := TO_NUMBER(:GLOBAL.Y_LINE) + 1;
--
  IF NVL(LENGTH(:help_comment), 0) > 0 THEN
    GO_ITEM('SHOW_HELP.HELP_COMMENT');
    EDIT_TEXTITEM;
    GO_FIELD('DISPLAY_HELP.HELP_TYPE');
  ELSE
    EXECUTE_TRIGGER('nohelp');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guahelp_NextBlock()
		{
			
				{
					NNumber winY= NNumber.getNull();
					setDefaultValue("0", "GLOBAL.Y_LINE");
					winY = toNumber(toNumber(getGlobal("Y_LINE")).add(1));
					// 


					
//					if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) ){
					Ref<NBool> edOk= new Ref<NBool>();
					Ref<NString> returnedText= new Ref<NString>();
					if ( length(returnedText.val).greater(3000) )
					{
//						TaskServices.editTextItem(true);
						TaskServices.editTextitem();
						goItem(toStr("SHOW_HELP.HELP_COMMENT"));
						
						goItem(toStr("DISPLAY_HELP.HELP_TYPE"));
					}
					else {
						executeAction("nohelp");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.WHEN-RADIO-CHANGED
		 EXECUTE_TRIGGER('FIND_HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-RADIO-CHANGED")
		public void Guahelp_radioGroupChange()
		{
			
				executeAction("FIND_HELP");
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.WHEN-WINDOW-CLOSED
		 IF :SYSTEM.EVENT_WINDOW = 'GUAHELP_WINDOW' THEN
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guahelp_WhenWindowClosed()
		{
			
				if ( getCurrentWindow().equals("GUAHELP_WINDOW") )
				{
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.WHEN_WINDOW_ACTIVATED_TRG
		 IF :SYSTEM.EVENT_WINDOW = 'GUAHELP_WINDOW' THEN
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
ELSE
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guahelp_WhenWindowActivatedTrg()
		{
			
				if ( getCurrentWindow().equals("GUAHELP_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
				else {
					getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-EXEQRY
		 BEGIN
  :SHOW_HELP.HELP_COMMENT := '';
--
-- form level
--
  IF :display_help.help_sel = 'F' THEN
    EXECUTE_TRIGGER('FORMLEVEL');
    G$_CHECK_FAILURE;
--
-- block level
--
  ELSIF :display_help.help_sel = 'B' THEN
    EXECUTE_TRIGGER('BLOCKLEVEL');
    G$_CHECK_FAILURE;
--
-- item level
--
  ELSIF :display_help.help_sel = 'I' THEN
    EXECUTE_TRIGGER('FIELDLEVEL');
    G$_CHECK_FAILURE;
  END IF;
--
  IF NVL(LENGTH(:show_help.help_comment), 0) > 0 THEN
    GO_FIELD('DISPLAY_HELP.HELP_TYPE');
  ELSE
    EXECUTE_TRIGGER('nohelp');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guahelp_ExecuteQuery()
		{
			
				getFormModel().getShowHelp().setHelpComment(toClob(""));
				// 
				//  form level
				// 
				if ( getFormModel().getDisplayHelp().getHelpSel().equals("F") )
				{
					executeAction("FORMLEVEL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") ) {
					executeAction("BLOCKLEVEL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getDisplayHelp().getHelpSel().equals("I") ) {
					executeAction("FIELDLEVEL");
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
//				if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) )
//				{
				Ref<NBool> edOk= new Ref<NBool>();
				Ref<NString> returnedText= new Ref<NString>();
				if ( length(returnedText.val).greater(3000) )
				{
//					TaskServices.editTextItem(true);
					TaskServices.editTextitem();
					goItem(toStr("DISPLAY_HELP.HELP_TYPE"));
				}
				else {
					executeAction("nohelp");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.NOHELP
		 DECLARE
  msg_txt VARCHAR2(200);
BEGIN
  IF :display_help.help_type='B' THEN
    IF :display_help.help_sel = 'F' THEN
      msg_txt :=  G$_NLS.Get('GUAHELP-0005', 'FORM','*NOTE* No BANNER help text for this Form') ;
    ELSIF :display_help.help_sel = 'B' THEN
      msg_txt :=  G$_NLS.Get('GUAHELP-0006', 'FORM','*NOTE* No BANNER help text for this Block') ;
    ELSE
      msg_txt :=  G$_NLS.Get('GUAHELP-0007', 'FORM','*NOTE* No BANNER help text for this Field') ;
    END IF;
--
    IF G$_DISPLAY_ALERT('',msg_txt) IS NOT NULL THEN
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- local help
--
  ELSE
    IF :display_help.help_sel = 'F' THEN
      msg_txt :=  G$_NLS.Get('GUAHELP-0008', 'FORM','*NOTE* No Local help text for this Form') ;
    ELSIF :display_help.help_sel = 'B' THEN
      msg_txt :=  G$_NLS.Get('GUAHELP-0009', 'FORM','*NOTE* No Local help text for this Block') ;
    ELSE
      msg_txt :=  G$_NLS.Get('GUAHELP-0010', 'FORM','*NOTE* No Local help text for this Field') ;
    END IF;
--
    IF G$_DISPLAY_ALERT('',msg_txt) IS NOT NULL THEN
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.NOHELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NOHELP")
		public void Guahelp_Nohelp()
		{
			
				{
					NString msgTxt= NString.getNull();
					if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
					{
						if ( getFormModel().getDisplayHelp().getHelpSel().equals("F") )
						{
							msgTxt = GNls.Fget(toStr("GUAHELP-0005"), toStr("FORM"), toStr("*NOTE* No BANNER help text for this Form"));
						}
						else if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") ) {
							msgTxt = GNls.Fget(toStr("GUAHELP-0006"), toStr("FORM"), toStr("*NOTE* No BANNER help text for this Block"));
						}
						else {
							msgTxt = GNls.Fget(toStr("GUAHELP-0007"), toStr("FORM"), toStr("*NOTE* No BANNER help text for this Field"));
						}
						// 
						if ( !getTask().getGoqrpls().gDisplayAlert(toStr(""), msgTxt).isNull() )
						{
							throw new ApplicationException();
						}
					}
					else {
						if ( getFormModel().getDisplayHelp().getHelpSel().equals("F") )
						{
							msgTxt = GNls.Fget(toStr("GUAHELP-0008"), toStr("FORM"), toStr("*NOTE* No Local help text for this Form"));
						}
						else if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") ) {
							msgTxt = GNls.Fget(toStr("GUAHELP-0009"), toStr("FORM"), toStr("*NOTE* No Local help text for this Block"));
						}
						else {
							msgTxt = GNls.Fget(toStr("GUAHELP-0010"), toStr("FORM"), toStr("*NOTE* No Local help text for this Field"));
						}
						// 
						if ( !getTask().getGoqrpls().gDisplayAlert(toStr(""), msgTxt).isNull() )
						{
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.FORMLEVEL
		 BEGIN
  IF :display_help.help_type = 'B' THEN
    SELECT gubbhlp_text 
      INTO :show_help.help_comment
      FROM gubbhlp
     WHERE gubbhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gubbhlp_block_name IS NULL
       AND gubbhlp_field_name IS NULL;
--
  ELSIF :display_help.help_type = 'L' THEN
    SELECT gublhlp_text 
      INTO :show_help.help_comment
      FROM gublhlp
     WHERE gublhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gublhlp_block_name IS NULL
       AND gublhlp_field_name IS NULL;
  END IF;
--
  IF NVL(LENGTH(:SHOW_HELP.HELP_COMMENT), 0) > 0 THEN
    :SHOW_HELP.HELP_IND := 'Y';
  END IF;
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    :SHOW_HELP.HELP_IND := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.FORMLEVEL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORMLEVEL")
		public void Guahelp_Formlevel()
		{
			
				int rowCount = 0;
				try
				{
					if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
					{
						String sql1 = "SELECT gubbhlp_text " +
	" FROM gubbhlp " +
	" WHERE gubbhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gubbhlp_block_name IS NULL AND gubbhlp_field_name IS NULL ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results1.getObject(0)));
						}
						results1.close();
					}
					else if ( getFormModel().getDisplayHelp().getHelpType().equals("L") ) {
						String sql2 = "SELECT gublhlp_text " +
	" FROM gublhlp " +
	" WHERE gublhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gublhlp_block_name IS NULL AND gublhlp_field_name IS NULL ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results2.getObject(0)));
						}
						results2.close();
					}
					// 
//					if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) )
//					{
					
					if ( length(getFormModel().getShowHelp().getHelpComment().toString()).greater(0) )
					{
//						TaskServices.editTextItem(true);
				
						getFormModel().getShowHelp().setHelpInd(toStr("Y"));
					}
				}
				catch(NoDataFoundException e)
				{
					getFormModel().getShowHelp().setHelpInd(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.FIELDLEVEL
		 BEGIN
  DEFAULT_VALUE('U','GLOBAL.DB_FIELD');
--
  IF :display_help.help_type = 'B' THEN
    SELECT gubbhlp_text 
      INTO :show_help.help_comment
      FROM gubbhlp
     WHERE gubbhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gubbhlp_block_name = :DISPLAY_HELP.HELP_BLOCK
       AND gubbhlp_field_name = :DISPLAY_HELP.HELP_FIELD;
--
  ELSIF :display_help.help_type = 'L' THEN
    SELECT gublhlp_text 
      INTO :show_help.help_comment
      FROM gublhlp
     WHERE gublhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gublhlp_block_name = :DISPLAY_HELP.HELP_BLOCK
       AND gublhlp_field_name = :DISPLAY_HELP.HELP_FIELD;
  END IF;
--
  IF :GLOBAL.HELP_UPD <> 'Y' THEN
    EXECUTE_TRIGGER('FIELD_HELP');
  END IF;
--
  IF NVL(LENGTH(:SHOW_HELP.HELP_COMMENT), 0) > 0 THEN
    :SHOW_HELP.HELP_IND := 'Y';
  END IF;
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    :HELP_IND :='';
    IF :GLOBAL.HELP_UPD = 'Y' THEN
      NULL;
    ELSE 
      EXECUTE_TRIGGER('FIELD_HELP');
    END IF;
  WHEN OTHERS THEN
    IF :GLOBAL.HELP_UPD = 'Y' THEN
      NULL;
    ELSE 
      EXECUTE_TRIGGER('FIELD_HELP');
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.FIELDLEVEL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FIELDLEVEL")
		public void Guahelp_Fieldlevel()
		{
			
				int rowCount = 0;
				try
				{
					setDefaultValue("U", "GLOBAL.DB_FIELD");
					// 
					if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
					{
						String sql1 = "SELECT gubbhlp_text " +
	" FROM gubbhlp " +
	" WHERE gubbhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gubbhlp_block_name = :DISPLAY_HELP_HELP_BLOCK AND gubbhlp_field_name = :DISPLAY_HELP_HELP_FIELD ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command1.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
						command1.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results1.getObject(0)));
						}
						results1.close();
					}
					else if ( getFormModel().getDisplayHelp().getHelpType().equals("L") ) {
						String sql2 = "SELECT gublhlp_text " +
	" FROM gublhlp " +
	" WHERE gublhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gublhlp_block_name = :DISPLAY_HELP_HELP_BLOCK AND gublhlp_field_name = :DISPLAY_HELP_HELP_FIELD ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command2.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
						command2.addParameter("DISPLAY_HELP_HELP_FIELD", getFormModel().getDisplayHelp().getHelpField());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results2.getObject(0)));
						}
						results2.close();
					}
					// 
					if ( getGlobal("HELP_UPD").notEquals("Y") )
					{
						executeAction("FIELD_HELP");
					}
					// 
//					if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) )
//					{
					Ref<NBool> edOk= new Ref<NBool>();
					Ref<NString> returnedText= new Ref<NString>();
					if ( length(getFormModel().getShowHelp().getHelpComment().toString()).greater(0) )
					{
//						TaskServices.editTextItem(true);
						
						getFormModel().getShowHelp().setHelpInd(toStr("Y"));
					}
				}
				catch(NoDataFoundException e)
				{
					getFormModel().getShowHelp().setHelpInd(toStr(""));
					if ( getGlobal("HELP_UPD").equals("Y") )
					{
					}
					else {
						executeAction("FIELD_HELP");
					}
				}
				catch(Exception  e)
				{
					if ( getGlobal("HELP_UPD").equals("Y") )
					{
					}
					else {
						executeAction("FIELD_HELP");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.BLOCKLEVEL
		 BEGIN
  IF :display_help.help_type = 'B' THEN
    SELECT gubbhlp_text 
      INTO :show_help.help_comment
      FROM gubbhlp
     WHERE gubbhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gubbhlp_block_name = :DISPLAY_HELP.HELP_BLOCK
       AND gubbhlp_field_name IS NULL;
--
  ELSIF :display_help.help_type = 'L' THEN
    SELECT gublhlp_text 
      INTO :show_help.help_comment
      FROM gublhlp
     WHERE gublhlp_form_name = :DISPLAY_HELP.HELP_FORM
       AND gublhlp_block_name = :DISPLAY_HELP.HELP_BLOCK
       AND gublhlp_field_name IS NULL;
  END IF;
--
  IF NVL(LENGTH(:SHOW_HELP.HELP_COMMENT), 0) > 0 THEN
    :SHOW_HELP.HELP_IND := 'Y';
  END IF;
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    :SHOW_HELP.HELP_IND := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.BLOCKLEVEL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BLOCKLEVEL")
		public void Guahelp_Blocklevel()
		{
			
				int rowCount = 0;
				try
				{
					if ( getFormModel().getDisplayHelp().getHelpType().equals("B") )
					{
						String sql1 = "SELECT gubbhlp_text " +
	" FROM gubbhlp " +
	" WHERE gubbhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gubbhlp_block_name = :DISPLAY_HELP_HELP_BLOCK AND gubbhlp_field_name IS NULL ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command1.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results1.getObject(0)));
						}
						results1.close();
					}
					else if ( getFormModel().getDisplayHelp().getHelpType().equals("L") ) {
						String sql2 = "SELECT gublhlp_text " +
	" FROM gublhlp " +
	" WHERE gublhlp_form_name = :DISPLAY_HELP_HELP_FORM AND gublhlp_block_name = :DISPLAY_HELP_HELP_BLOCK AND gublhlp_field_name IS NULL ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("DISPLAY_HELP_HELP_FORM", getFormModel().getDisplayHelp().getHelpForm());
						command2.addParameter("DISPLAY_HELP_HELP_BLOCK", getFormModel().getDisplayHelp().getHelpBlock());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							getFormModel().getShowHelp().setHelpComment(toClob(results2.getObject(0)));
						results2.close();
					}
					// 
//					if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) )
//					{
					Ref<NBool> edOk= new Ref<NBool>();
					Ref<NString> returnedText= new Ref<NString>();
					if ( length(getFormModel().getShowHelp().getHelpComment().toString()).greater(0) )
					{
//						TaskServices.editTextItem(true);
//						TaskServices.editTextitem();
						getFormModel().getShowHelp().setHelpInd(toStr("Y"));
					}
					}}
				catch(NoDataFoundException e)
				{
					getFormModel().getShowHelp().setHelpInd(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP.KEY-EXIT
		 BEGIN
  :GLOBAL.Y_LINE := '';
--
  IF :GLOBAL.HELP_UPD = 'Y' AND :SHOW_HELP.HELP_CHG = 'Y' THEN
    IF G$_DISPLAY_ALERT('CAUTION_ALERT', G$_NLS.Get('GUAHELP-0011', 'FORM','Do you wish to commit the changes?') ) 
         = ALERT_BUTTON1 THEN 
      DO_KEY('COMMIT_FORM');
    END IF;
  END IF;   
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guahelp_Exit()
		{
			
				setGlobal("Y_LINE", toStr(""));
				// 
				if ( getGlobal("HELP_UPD").equals("Y") && getFormModel().getShowHelp().getHelpChg().equals("Y") )
				{
					if ( getTask().getGoqrpls().gDisplayAlert(toStr("CAUTION_ALERT"), GNls.Fget(toStr("GUAHELP-0011"), toStr("FORM"), toStr("Do you wish to commit the changes?"))).equals(MessageServices.BUTTON1) )
					{
						executeAction("SAVE");
					}
				}
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
	
}
	
