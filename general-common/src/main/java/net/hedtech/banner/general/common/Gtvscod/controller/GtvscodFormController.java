package net.hedtech.banner.general.common.Gtvscod.controller;
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
import net.hedtech.banner.general.common.Gtvscod.model.*;
import net.hedtech.banner.general.common.Gtvscod.*;
import net.hedtech.banner.general.common.Gtvscod.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
		

public class GtvscodFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
		
	
	
	public GtvscodFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GtvscodTask getTask() {
		return (GtvscodTask)super.getTask();
	}
	
	
	public GtvscodModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Gtvscod_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Gtvscod_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Gtvscod_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Gtvscod_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Gtvscod_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Gtvscod_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Gtvscod_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Gtvscod_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Gtvscod_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Gtvscod_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Gtvscod_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Gtvscod_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Gtvscod_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Gtvscod_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Gtvscod_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Gtvscod_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Gtvscod_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Gtvscod_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Gtvscod_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Gtvscod_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Gtvscod_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Gtvscod_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Gtvscod_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Gtvscod_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Gtvscod_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Gtvscod_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Gtvscod_ClearTask()
		{
			
				getGFormClass().clearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Gtvscod_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Gtvscod_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Gtvscod_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Gtvscod_MoveDown()
		{
			if ( isInLastRecord(true) )
			{
				warningMessage(GNls.Fget(toStr("GUIOBJS-0032"), toStr("FORM"), toStr("*WARNING* At last record.")));
				return ;
			}
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Gtvscod_MoveUp()
		{
			if(isInFirstRecord())
				
			{
				warningMessage(GNls.Fget(toStr("GUIOBJS-0030"), toStr("FORM"), toStr("*WARNING* At first record.")));
				return ;
			}
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Gtvscod_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Gtvscod_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Gtvscod_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Gtvscod_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Gtvscod_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Gtvscod_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Gtvscod_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Gtvscod_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Gtvscod_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Gtvscod_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Gtvscod_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Gtvscod_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Gtvscod_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Gtvscod_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Gtvscod_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Gtvscod_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Gtvscod_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Gtvscod_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Gtvscod_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.GLOBAL_COPY
		 :SYSTEM.MESSAGE_LEVEL:='25';
IF :GLOBAL.EDI_ELEMENT_ID IS NOT NULL THEN
   :GTVSCOD_ELEMENT_ID:=:GLOBAL.EDI_ELEMENT_ID;
   --:GLOBAL.EDI_ELEMENT_ID:='';
END IF;
IF :GLOBAL.EDI_STANDARD_IND IS NOT NULL THEN
   :GTVSCOD_STANDARD_IND:=:GLOBAL.EDI_STANDARD_IND;
   --:GLOBAL.EDI_STANDARD_IND:='';
END IF;
:SYSTEM.MESSAGE_LEVEL:='0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		//@ActionTrigger(action="GLOBAL_COPY")
		public void Gtvscod_GlobalCopy()
		{
			


				GtvscodAdapter gtvscodElement = (GtvscodAdapter)this.getFormModel().getGtvscod().getRowAdapter(true);

    
				if(gtvscodElement!=null){
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				if (!getGlobal("EDI_ELEMENT_ID").isNull() )
				{
					gtvscodElement.setGtvscodElementId(getGlobal("EDI_ELEMENT_ID"));
				}
				if ( !getGlobal("EDI_STANDARD_IND").isNull() )
				{
					gtvscodElement.setGtvscodStandardInd(getGlobal("EDI_STANDARD_IND"));
				}
			
				} finally {
							
				MessageServices.resetMessageLevel();
				}
				}
							
				
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Gtvscod_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.UPDATE_USER_ID
		    :WORKUSER := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKUSER := RPAD(SUBSTR(:WORKUSER, 1, 7), 15, '_USER_ID') ;
--
   COPY( :CURRENT_USER, :WORKUSER ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.UPDATE_USER_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_USER_ID")
		public void Gtvscod_UpdateUserId()
		{
			
				getFormModel().getFormHeader().setWorkuser(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkuser(toStr(rpad(substring(getFormModel().getFormHeader().getWorkuser(), toInt(1), toInt(7)), 15, "_USER_ID")));
				// 
				copy(getFormModel().getFormHeader().getCurrentUser(),getFormModel().getFormHeader().getWorkuser());
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.UPDATE_ACTIVITY_DATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKDATE := RPAD(SUBSTR(:WORKDATE, 1, 7), 21, '_ACTIVITY_DATE')
       ;
--
   COPY( :CURRENT_DATE, :WORKDATE ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Gtvscod_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)), 21, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.INVALID_FUNCTION_MSG
		    MESSAGE( 
    G$_NLS.Get('GTVSCOD-0004', 'FORM','Invalid function; press SHOW KEYS for valid functions.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Gtvscod_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("GTVSCOD-0004"), toStr("FORM"), toStr("Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('GTVSCOD_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GTVSCOD_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GTVSCOD_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GTVSCOD_DESC',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GTVSCOD_DESC',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GTVSCOD_DESC',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Gtvscod_EnableKeys()
		{
			
				if ( getItemEnabled("GTVSCOD_CODE").equals("FALSE") )
				{
					setItemEnabled("GTVSCOD_CODE", true);
					setItemNavigable("GTVSCOD_CODE", true);
				}
				if ( getItemEnabled("GTVSCOD_DESC").equals("FALSE") )
				{
					setItemEnabled("GTVSCOD_DESC", true);
					setItemNavigable("GTVSCOD_DESC", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.DISABLE_KEYS
		    SET_ITEM_PROPERTY('GTVSCOD_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GTVSCOD_DESC',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Gtvscod_DisableKeys()
		{
			
				setItemEnabled("GTVSCOD_CODE", false);
				setItemEnabled("GTVSCOD_DESC", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.WHEN-NEW-FORM-INSTANCE
		    G$_SET_WIN_PROPERTY;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   
   EXECUTE_QUERY ;
   G$_SET_INST_PROPERTY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Gtvscod_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeQuery();
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.KEY-NXTKEY
		    :WORKFLD := :SYSTEM.CURRENT_FIELD ;
--
   :WORKFLD := RPAD(SUBSTR(:WORKFLD, 1, 8), 12, 'CODE') ;
--
   :GLOBAL.VALUE := NAME_IN( NAME_IN( 'WORKFLD' ) ) ;
--
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Gtvscod_KeyNxtkey()
		{
			
				GtvscodAdapter gtvscodElement = (GtvscodAdapter)this.getFormModel().getGtvscod().getRowAdapter(true);
			
				getFormModel().getFormHeader().setWorkfld(toStr(getCurrentField()));
				// 
				getFormModel().getFormHeader().setWorkfld(toStr(rpad(substring(getFormModel().getFormHeader().getWorkfld(), toInt(1), toInt(8)), 12, "CODE")));
				// 
				setGlobal("VALUE", gtvscodElement.getGtvscodCode());
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.KEY-EXIT
		    :GLOBAL.VALUE := '' ;
--
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Gtvscod_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Gtvscod_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD.PRE-INSERT
		  <multilinecomment>  DECLARE
      PTI_INTO_TEMP        char(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FTVFOBS
         WHERE  FTVFOBS_CODE = :FTVFOBS_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND, 'FOB code exists', TRUE);
   END ;</multilinecomment>
--
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Gtvscod_BeforeRowInsert(RowAdapterEvent args)
		{
			
				//   DECLARE
				// PTI_INTO_TEMP        char(255);
				// CURSOR PTI_CURSOR IS
				// SELECT 'X'
				// FROM   FTVFOBS
				// WHERE  FTVFOBS_CODE = :FTVFOBS_CODE ;
				// BEGIN
				// OPEN PTI_CURSOR ;
				// FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
				// G$_CHECK_VALUE (PTI_CURSOR%FOUND, 'FOB code exists', TRUE);
				// END ;
				// 
				//   DECLARE
				// PTI_INTO_TEMP        char(255);
				// CURSOR PTI_CURSOR IS
				// SELECT 'X'
				// FROM   FTVFOBS
				// WHERE  FTVFOBS_CODE = :FTVFOBS_CODE ;
				// BEGIN
				// OPEN PTI_CURSOR ;
				// FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
				// G$_CHECK_VALUE (PTI_CURSOR%FOUND, 'FOB code exists', TRUE);
				// END ;
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
