package net.hedtech.banner.general.common.Guasyst.controller;
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
import net.hedtech.banner.general.common.Guasyst.model.*;
import net.hedtech.banner.general.common.Guasyst.*;
import net.hedtech.banner.general.common.Guasyst.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GuasystFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GuasystFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuasystTask getTask() {
		return (GuasystTask)super.getTask();
	}
	
	
	public GuasystModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guasyst_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guasyst_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guasyst_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guasyst_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guasyst_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guasyst_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guasyst_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guasyst_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guasyst_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guasyst_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guasyst_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guasyst_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guasyst_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guasyst_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guasyst_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guasyst_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guasyst_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guasyst_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guasyst_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guasyst_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guasyst_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guasyst_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guasyst_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guasyst_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guasyst_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guasyst_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guasyst_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guasyst_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guasyst_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guasyst_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guasyst_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guasyst_PreviousBlock()
		{
			
				getGFormClass().previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Guasyst_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guasyst_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guasyst_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guasyst_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guasyst_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guasyst_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guasyst_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guasyst_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guasyst_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guasyst_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guasyst_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guasyst_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guasyst_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guasyst_LoadFormHeader()
		{
			
				getGFormClass().loadFormHeader();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guasyst_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guasyst_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Guasyst_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Guasyst_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.2';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guasyst_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.DISPLAY_HEADINGS
		 -- 60-1 delete obsolete form items
-- 60-1 change heading 'ALUMNI' to 'ADVANCEMENT'
BEGIN
IF NVL(:GLOBAL.ALUSYS,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('ALU_HEADING',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ALU_CONST',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ALU_ORGN',DISPLAYED,PROPERTY_OFF);
ELSE
   :ALU_HEADING       :=G$_NLS.Get('GUASYST-0000','FORM','ADVANCEMENT');
END IF;
-- 301-1
IF NVL(:GLOBAL.HRESYS,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('HR_APPL',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('HR_EMPL',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('HR_BENE',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('HR_COBRA',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('HR_HEADING',DISPLAYED,PROPERTY_OFF);
ELSE
   :HR_HEADING      := G$_NLS.Get('GUASYST-0001','FORM','HUMAN RESOURCE');
END IF;
IF NVL(:GLOBAL.FINSYS,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('FIN_HEADING',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_AGENCY',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_BANK',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_CUST',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_EMPL',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_MAGR',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_VEND',DISPLAYED,PROPERTY_OFF);
ELSE
   :FIN_HEADING     := G$_NLS.Get('GUASYST-0002','FORM','FINANCE');
END IF;
IF NVL(:GLOBAL.STUSYS,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('STD_HEADING',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_RECR',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_ADM',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_TRAN',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_GENR',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_REGR',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_HOUS',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('STD_FACU',DISPLAYED,PROPERTY_OFF);
ELSE
   :STD_HEADING     := G$_NLS.Get('GUASYST-0003','FORM','STUDENT') ;
END IF;
IF NVL(:GLOBAL.BILCSH,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('AR',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('AR_HEADING_1',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('AR_HEADING_2',DISPLAYED,PROPERTY_OFF);
ELSE
   :AR_HEADING_1    := G$_NLS.Get('GUASYST-0004','FORM','ACCOUNTS');
   :AR_HEADING_2    := G$_NLS.Get('GUASYST-0005','FORM','RECEIVABLE');
END IF;
IF NVL(:GLOBAL.RESSYS,'N') <> 'Y' THEN
   SET_ITEM_PROPERTY('FIN_AID_APPL',DISPLAYED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('FIN_AID_HEADING',DISPLAYED,PROPERTY_OFF);
ELSE
   :FIN_AID_HEADING := G$_NLS.Get('GUASYST-0006','FORM','FINANCIAL AID'); 
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.DISPLAY_HEADINGS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISPLAY_HEADINGS")
		public void Guasyst_DisplayHeadings()
		{
				if ( isNull(getGlobal("ALUSYS"), "N").notEquals("Y") )
				{
					setItemVisible("ALU_HEADING", false);
					setItemVisible("ALU_CONST", false);
					setItemVisible("ALU_ORGN", false);
				}
				else {
					getFormModel().getKeyBlock().setAluHeading(GNls.Fget(toStr("GUASYST-0000"), toStr("FORM"), toStr("ADVANCEMENT")));
				}
				if ( isNull(getGlobal("HRESYS"), "N").notEquals("Y") )
				{
					setItemVisible("HR_APPL", false);
					setItemVisible("HR_EMPL", false);
					setItemVisible("HR_BENE", false);
					setItemVisible("HR_COBRA", false);
					setItemVisible("HR_HEADING", false);
				}
				else {
					getFormModel().getKeyBlock().setHrHeading(GNls.Fget(toStr("GUASYST-0001"), toStr("FORM"), toStr("HUMAN RESOURCE")));
				}
				if ( isNull(getGlobal("FINSYS"), "N").notEquals("Y") )
				{
					setItemVisible("FIN_HEADING", false);
					setItemVisible("FIN_AGENCY", false);
					setItemVisible("FIN_BANK", false);
					setItemVisible("FIN_CUST", false);
					setItemVisible("FIN_EMPL", false);
					setItemVisible("FIN_MAGR", false);
					setItemVisible("FIN_VEND", false);
				}
				else {
					getFormModel().getKeyBlock().setFinHeading(GNls.Fget(toStr("GUASYST-0002"), toStr("FORM"), toStr("FINANCE")));
				}
				if ( isNull(getGlobal("STUSYS"), "N").notEquals("Y") )
				{
					setItemVisible("STD_HEADING", false);
					setItemVisible("STD_RECR", false);
					setItemVisible("STD_ADM", false);
					setItemVisible("STD_TRAN", false);
					setItemVisible("STD_GENR", false);
					setItemVisible("STD_REGR", false);
					setItemVisible("STD_HOUS", false);
					setItemVisible("STD_FACU", false);
				}
				else {
					getFormModel().getKeyBlock().setStdHeading(GNls.Fget(toStr("GUASYST-0003"), toStr("FORM"), toStr("STUDENT")));
				}
				if ( isNull(getGlobal("BILCSH"), "N").notEquals("Y") )
				{
					setItemVisible("AR", false);
					setItemVisible("AR_HEADING_1", false);
					setItemVisible("AR_HEADING_2", false);
				}
				else {
					getFormModel().getKeyBlock().setArHeading1(GNls.Fget(toStr("GUASYST-0004"), toStr("FORM"), toStr("ACCOUNTS ")));
					getFormModel().getKeyBlock().setArHeading2(GNls.Fget(toStr("GUASYST-0005"), toStr("FORM"), toStr("RECEIVABLE")));
				}
				if ( isNull(getGlobal("RESSYS"), "N").notEquals("Y") )
				{
					setItemVisible("FIN_AID_APPL", false);
					setItemVisible("FIN_AID_HEADING", false);
				}
				else {
					getFormModel().getKeyBlock().setFinAidHeading(GNls.Fget(toStr("GUASYST-0006"), toStr("FORM"), toStr("FINANCIAL AID")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
        IF :SYSTEM.EVENT_WINDOW IS NULL OR
           :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
           G$_SET_INST_PROPERTY;
           G$_SET_WIN_PROPERTY;
        END IF;
--
        IF :SYSTEM.EVENT_WINDOW IS NOT NULL AND
           :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
           G$_DETERMINE_CURSOR_LOCATION('KEY_BLOCK.ID');
        END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guasyst_WhenWindowActivatedTrg()
		{
			
				if ( (getCurrentWindow()) == null || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
				if ( (getCurrentWindow()) != null && getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("KEY_BLOCK.ID"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.UPDATE_ACTIVITY_DATE
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
		 * GUASYST.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Guasyst_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guasyst_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.LIST_VALUES_CALL
		    :CALLFLD := :SYSTEM.CURRENT_ITEM ;
   :CALLFLD := SUBSTR(:CALLFLD, 9, 4) ;
   :CALLFLD := LPAD(:CALLFLD, 6, 'TV') ;
   :CALLFLD := LPAD(:CALLFLD, 7, SUBSTR(:CURRENT_FORM, 1, 1)) ;
--
   G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,:CALLFLD,'QUERY');
   G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.LIST_VALUES_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_CALL")
		public void Guasyst_ListValuesCall()
		{
			
				getFormModel().getFormHeader().setCallfld(toStr(getCurrentItem()));
				getFormModel().getFormHeader().setCallfld(substring(getFormModel().getFormHeader().getCallfld(), toInt(9), toInt(4)));
				getFormModel().getFormHeader().setCallfld(lpad(getFormModel().getFormHeader().getCallfld(), 6, "TV"));
				getFormModel().getFormHeader().setCallfld(lpad(getFormModel().getFormHeader().getCallfld(), 7, substring(getFormModel().getFormHeader().getCurrentForm(), toInt(1), toInt(1)).toString()));
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), getFormModel().getFormHeader().getCallfld(), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('GUASYST-0007', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Guasyst_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("GUASYST-0007"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.GLOBAL_COPY
		    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
--
   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guasyst_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guasyst_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guasyst_DisableKeys()
		{
			
				setItemEnabled("ID", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('DISPLAY_HEADINGS');
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
   set_menu_item_property('ACTION.SAVE',ENABLED,PROPERTY_FALSE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guasyst_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISPLAY_HEADINGS");
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
				setMenuItemEnabled("ACTION.SAVE", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-LISTVAL
		    :CALLFLD := :SYSTEM.CURRENT_ITEM ;
--
   :CALLFLD := SUBSTR(:CALLFLD, 14, 4) ;
--
   IF :CALLFLD = 'CODE' THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_CALL' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      LIST_VALUES ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guasyst_ListValues()
		{
			
				getFormModel().getFormHeader().setCallfld(toStr(getCurrentItem()));
				getFormModel().getFormHeader().setCallfld(substring(getFormModel().getFormHeader().getCallfld(), toInt(14), toInt(4)));
				if ( getFormModel().getFormHeader().getCallfld().equals("CODE") )
				{
					executeAction("LIST_VALUES_CALL");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					listValues();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-DUPREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Guasyst_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-DELREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-DELREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void Guasyst_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-CREREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-CREREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void Guasyst_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-CLRFRM
		 BEGIN
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('DISPLAY_HEADINGS');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guasyst_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISPLAY_HEADINGS");
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.KEY-CLRBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void Guasyst_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guasyst_BeforeRowUpdate(RowAdapterEvent args)
		{
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guasyst_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUASYST.POST_FORM_TRG
		 BEGIN
   G$_DETERMINE_ERASE_GLOBAL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUASYST.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guasyst_PostFormTrg()
		{
			
				getTask().getGoqrpls().gDetermineEraseGlobal();
			}

		
	
}
	
