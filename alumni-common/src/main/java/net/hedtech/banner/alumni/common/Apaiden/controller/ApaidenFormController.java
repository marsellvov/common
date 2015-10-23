package net.hedtech.banner.alumni.common.Apaiden.controller;

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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Aoqclib.controller.AoqclibFormController;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;
import net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class ApaidenFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	private AoqclibFormController getAoqclibFormController() {
		return (net.hedtech.general.common.libraries.Aoqclib.controller.AoqclibFormController) this.getTask().getTaskPart("AOQCLIB").getSupportCodeManager().getPackage("AOQCLIB");
	}	
	private GoqclibFormController getGoqclibFormController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("GOQCLIB");
	}	
	
	
	public ApaidenFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public ApaidenTask getTask() {
		return (ApaidenTask)super.getTask();
	}
	
	
	public ApaidenModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Apaiden_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Apaiden_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Apaiden_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.PRE_FORM_TRG
		 BEGIN
-- --
  G$_TAB_SECURITY.G$_TABSEC_BUILD(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(:SYSTEM.CURRENT_FORM,:GLOBAL.CURRENT_USER));
  G$_CHECK_FAILURE;
-- --
--G$_SET_IDEN_ITEMS;
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE'    ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE'    ,ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT',VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.MRTL_DESC'         ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.PREFERRED_ADDR'            ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.PREFERRED_ADDR'            ,ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.PREFERRED_REGION'          ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.PREFERRED_REGION'          ,ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.COMBINED_MAILING'          ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.COMBINED_MAILING'          ,ENABLED,PROPERTY_TRUE);  
  SET_ITEM_PROPERTY('SPRADDR.EMPLOYMENT_DETAILS'        ,VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRADDR.EMPLOYMENT_DETAILS'        ,ENABLED,PROPERTY_TRUE);
END;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Apaiden_PreFormTrg()
		{
			
				//  --
				getTask().getGoqrpls().getGTabSecurity().gTabsecBuild(GSecurity.FgGetTabSecurityFnc(getCurrentTaskName(), getGlobal("CURRENT_USER")));
				getTask().getGoqrpls().gCheckFailure();
				//  --
				// G$_SET_IDEN_ITEMS;
				setItemVisible("SPRIDEN_CURRENT.PERS_MRTL_CODE", true);
				setItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE", true);
				setItemVisible("SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT", true);
				setItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT", true);
				setItemVisible("SPRIDEN_CURRENT.MRTL_DESC", true);
				setItemVisible("SPRADDR.PREFERRED_ADDR", true);
				setItemEnabled("SPRADDR.PREFERRED_ADDR", true);
				setItemVisible("SPRADDR.PREFERRED_REGION", true);
				setItemEnabled("SPRADDR.PREFERRED_REGION", true);
				setItemVisible("SPRADDR.COMBINED_MAILING", true);
				setItemEnabled("SPRADDR.COMBINED_MAILING", true);
				setItemVisible("SPRADDR.EMPLOYMENT_DETAILS", true);
				setItemEnabled("SPRADDR.EMPLOYMENT_DETAILS", true);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Apaiden_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Apaiden_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Apaiden_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Apaiden_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Apaiden_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Apaiden_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Apaiden_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Apaiden_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Apaiden_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Apaiden_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Apaiden_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Apaiden_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Apaiden_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.POST_FORMS_COMMIT_TRG
		 -- sq Added this trigger for messaging.
BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Apaiden_PostFormsCommitTrg()
		{
			
				//  sq Added this trigger for messaging.
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Apaiden_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Apaiden_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Apaiden_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Apaiden_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Apaiden_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Apaiden_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Apaiden_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Apaiden_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Apaiden_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Apaiden_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Apaiden_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Apaiden_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Apaiden_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Apaiden_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Apaiden_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Apaiden_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Apaiden_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Apaiden_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Apaiden_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Apaiden_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Apaiden_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Apaiden_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Apaiden_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.KEY_EXIT_TRG
		 BEGIN
  :GLOBAL.NAVIGATE_TO_TAB := null;
  EXECUTE_TRIGGER('GLOBAL_ID_ERASE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Apaiden_KeyExitTrg()
		{
			
				setGlobal("NAVIGATE_TO_TAB", toStr(null));
				executeAction("GLOBAL_ID_ERASE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Apaiden_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Apaiden_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Apaiden_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Apaiden_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Apaiden_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Apaiden_CheckKeys()
		{
			
			getGApplFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Apaiden_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.A$_SHOW_USER_ALERTS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="A$_SHOW_USER_ALERTS")
		public void Aoqclib_AShowUserAlerts()
		{
			
				getAoqclibFormController().AShowUserAlerts();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.A$_CHECK_USER_ALERTS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="A$_CHECK_USER_ALERTS")
		public void Aoqclib_ACheckUserAlerts()
		{
			
				getAoqclibFormController().ACheckUserAlerts();
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_APCADDR
		 :global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APCADDR','QUERY');
:global.form_was_called := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_APCADDR
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_APCADDR")
		public void Apaiden_CallApcaddr()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APCADDR"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_GTVZIPC
		 :global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'GTVZIPC','QUERY');
:global.form_was_called := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_GTVZIPC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_GTVZIPC")
		public void Apaiden_CallGtvzipc()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GTVZIPC"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_APAIDEN
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0000', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
:global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APAIDEN','');
:global.form_was_called := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_APAIDEN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_APAIDEN")
		public void Apaiden_CallApaiden()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0000"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APAIDEN"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_APACONS
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0001', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
:global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APACONS','');
:global.form_was_called := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_APACONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_APACONS")
		public void Apaiden_CallApacons()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0001"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APACONS"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_AOAORGN
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0002', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
:global.form_was_called := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOAORGN','');
:global.form_was_called := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_AOAORGN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_AOAORGN")
		public void Apaiden_CallAoaorgn()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0002"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOAORGN"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Apaiden_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.KEY-EXIT
		 -- PLU-LWS 02/01/2005
-- Clear out any temporary records in APTADDR for this session;
   REMOVE_HOUSEHOLD_TEMP_RECS;
--
G$_DETERMINE_ERASE_GLOBAL;
-- 020399 EXIT_FORM;
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Apaiden_Exit()
		{
			
				//  PLU-LWS 02/01/2005
				//  Clear out any temporary records in APTADDR for this session;
				//  PLU-LWS 02/01/2005
				//  Clear out any temporary records in APTADDR for this session;
				this.getTask().getServices().removeHouseholdTempRecs();
				// 
				getTask().getGoqrpls().gDetermineEraseGlobal();
				//  020399 EXIT_FORM;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_ADDRESS
		 <multilinecomment>EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
--
IF :KEY_BLOCK.PIDM is null then
  message( G$_NLS.Get('APAIDEN-0007', 'FORM','*ERROR* Please add name information before adding an address') );
  RAISE FORM_TRIGGER_FAILURE;
 ELSE
  GO_BLOCK('SPRADDR');
  EXECUTE_QUERY(ALL_RECORDS);
END IF;</multilinecomment>
DECLARE
	 boo_household_tab boolean;
BEGIN
   -- PLU-LWS If we are coming to the current ID block as a result of using the option menu
   -- from the APTADDR block (or either of the two buttons from there) 
   -- then clean-up APTADDR table.
   --
   -- This catches the four buttons AND the block name
   boo_household_tab := (INSTR(:SYSTEM.CURRENT_ITEM,'APTADDR') > 0);
   IF boo_household_tab THEN  
      --
      REMOVE_HOUSEHOLD_TEMP_RECS;
      CLEAR_BLOCK(NO_VALIDATE);
      EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS') ;
      G$_CHECK_FAILURE;
   END IF;
   --
   EXECUTE_TRIGGER('CHECK_TO_SAVE');
   IF NOT FORM_SUCCESS THEN
      GO_ITEM(:SYSTEM.CURSOR_ITEM);
      RAISE FORM_TRIGGER_FAILURE;
   ELSE
      GO_BLOCK('SPRADDR');  
      :SYSTEM.MESSAGE_LEVEL := '5';
      EXECUTE_QUERY;
      :SYSTEM.MESSAGE_LEVEL := '0';
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_ADDRESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_ADDRESS")
		public void Apaiden_MnuOptAddress()
		{
			
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// --
				// IF :KEY_BLOCK.PIDM is null then
				// message( G$_NLS.Get('APAIDEN-0007', 'FORM','*ERROR* Please add name information before adding an address') );
				// RAISE FORM_TRIGGER_FAILURE;
				// ELSE
				// GO_BLOCK('SPRADDR');
				// EXECUTE_QUERY(ALL_RECORDS);
				// END IF;
				{
					NBool booHouseholdTab= NBool.getNull();
					//  PLU-LWS If we are coming to the current ID block as a result of using the option menu
					//  from the APTADDR block (or either of the two buttons from there) 
					//  then clean-up APTADDR table.
					// 
					//  This catches the four buttons AND the block name
					booHouseholdTab = toBool(((inStr(toStr(getCurrentItem()), toStr("APTADDR")).greater(0))));
					if ( booHouseholdTab.getValue() )
					{
						// 
						this.getTask().getServices().removeHouseholdTempRecs();
						clearBlock(TaskServices.NO_VALIDATE);
						executeAction("ENABLE_NON_HOUSEHOLD_TABS");
						getTask().getGoqrpls().gCheckFailure();
					}
					// 
					
					try{
						executeAction("CHECK_TO_SAVE");
						goBlock(toStr("SPRADDR"));
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
						executeQuery();
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					}catch(Exception e){
						goItem(toStr(getCursorItem()));
						throw new ApplicationException(e);
					}
//					executeAction("CHECK_TO_SAVE");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						goItem(toStr(getCursorItem()));
//						throw new ApplicationException();
//					}
//					else {
//						goBlock(toStr("SPRADDR"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						executeQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_SPOUSE
		 IF  :KEY_BLOCK.SPS_NAME IS  NULL THEN
  MESSAGE( G$_NLS.Get('APAIDEN-0003', 'FORM','*ERROR* Spouse must exist for this function.') );
  RAISE FORM_TRIGGER_FAILURE;
ELSE 
  IF :KEY_BLOCK.SPS_PIDM IS NULL THEN
    MESSAGE( G$_NLS.Get('APAIDEN-0004', 'FORM','*ERROR* Spouse must be constituent for this function.') );
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
    IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      MESSAGE( G$_NLS.Get('APAIDEN-0005', 'FORM','*ERROR* Must COMMIT changes for this function.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    :GLOBAL.KEY_IDNO := :KEY_BLOCK.SPS_IDNO;
    :GLOBAL.ALUM_CALLED_FORM := 'Y';
    :GLOBAL.FORM_WAS_CALLED := 'Y';
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:global.current_user,'APAIDEN','');
    :GLOBAL.FORM_WAS_CALLED := '';
    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
    :GLOBAL.ALUM_CALLED_FORM := '';
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_SPOUSE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_SPOUSE")
		public void Apaiden_MnuCallSpouse()
		{
			
				if ( getFormModel().getKeyBlock().getSpsName().isNull() )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0003"), toStr("FORM"), toStr("*ERROR* Spouse must exist for this function.")));
					throw new ApplicationException();
				}
				else {
					if ( getFormModel().getKeyBlock().getSpsPidm().isNull() )
					{
						errorMessage(GNls.Fget(toStr("APAIDEN-0004"), toStr("FORM"), toStr("*ERROR* Spouse must be constituent for this function.")));
						throw new ApplicationException();
					}
					else {
						if ( getTaskStatus().equals("CHANGED") )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0005"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
							throw new ApplicationException();
						}
						setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getSpsIdno());
						setGlobal("ALUM_CALLED_FORM", toStr("Y"));
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APAIDEN"), toStr(""));
						setGlobal("FORM_WAS_CALLED", toStr(""));
						setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
						setGlobal("ALUM_CALLED_FORM", toStr(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_APANAME
		 EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('SAVE_KEYS');
IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0006', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APANAME','');
:GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_APANAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_APANAME")
		public void Apaiden_MnuCallApaname()
		{
			
				executeAction("CHECK_BOTH");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("NAME_AND_ID_CHECK");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SAVE_KEYS");
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0006"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APANAME"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_ALUMNI
		 DECLARE
 PTI_INTO_TEMP  VARCHAR2(255);
  CURSOR PTI_CURSOR IS
    SELECT 'X'
    FROM   SPRADDR
    WHERE  SPRADDR_PIDM = :PIDM
    AND    SPRADDR_ATYP_CODE = :SPRADDR_ATYP_CODE
    AND    SPRADDR_SEQNO    = :SPRADDR_SEQNO;
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    IF PTI_CURSOR%NOTFOUND THEN
       MESSAGE( G$_NLS.Get('APAIDEN-0007', 'FORM','*ERROR* Valid address must be saved prior to accessing the Cons/Orgn forms') 
               );
       RAISE FORM_TRIGGER_FAILURE;
    END IF ;
END;
--
IF :ENTITY_IND = 'P' THEN
  :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
  EXECUTE_TRIGGER('CALL_APACONS');
  G$_CHECK_FAILURE;
ELSIF :ENTITY_IND = 'C' THEN
  :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
  EXECUTE_TRIGGER('CALL_AOAORGN');
  G$_CHECK_FAILURE;
 ELSE
  NULL;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_ALUMNI
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_ALUMNI")
		public void Apaiden_MnuCallAlumni()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				int rowCount = 0;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :PIDM AND SPRADDR_ATYP_CODE = :SPRADDR_ATYP_CODE AND SPRADDR_SEQNO = :SPRADDR_SEQNO ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						ptiCursor.addParameter("SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0007"), toStr("FORM"), toStr("*ERROR* Valid address must be saved prior to accessing the Cons/Orgn forms")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getFormModel().getKeyBlock().getEntityInd().equals("P") )
				{
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					executeAction("CALL_APACONS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getFormModel().getKeyBlock().getEntityInd().equals("C") ) {
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					executeAction("CALL_AOAORGN");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_APAEHIS
		 IF :ENTITY_IND = 'C' THEN
MESSAGE( G$_NLS.Get('APAIDEN-0008', 'FORM','*ERROR* ID must be a constituent for this function.') );
RETURN;
ELSIF :ENTITY_IND = 'P' THEN
	IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0009', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
  END IF;
  :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
  :GLOBAL.FORM_WAS_CALLED := 'Y';
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:global.current_user,'APAEHIS','');
  :GLOBAL.FORM_WAS_CALLED := '';
ELSE
 NULL;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_APAEHIS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_APAEHIS")
		public void Apaiden_MnuCallApaehis()
		{
			
				if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0008"), toStr("FORM"), toStr("*ERROR* ID must be a constituent for this function.")));
					return ;
				}
				else if ( getFormModel().getKeyBlock().getEntityInd().equals("P") ) {
					if ( getTaskStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("APAIDEN-0009"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
						throw new ApplicationException();
					}
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					setGlobal("FORM_WAS_CALLED", toStr("Y"));
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APAEHIS"), toStr(""));
					setGlobal("FORM_WAS_CALLED", toStr(""));
				}
				else {
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_FORMS
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0010', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   :global.form_was_called := 'Y';
   :global.calling_form := 'Y';
--
   :GLOBAL.SECRFRM := NAME_IN('GLOBAL.GUROPTM_NAME1') ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:global.current_user,:global.secrfrm,'');
--
:global.form_was_called := '';
:global.calling_form := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_FORMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_FORMS")
		public void Apaiden_MnuCallForms()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0010"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("CALLING_FORM", toStr("Y"));
				// 
				setGlobal("SECRFRM", getNameIn("GLOBAL.GUROPTM_NAME1"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				// 
				setGlobal("FORM_WAS_CALLED", toStr(""));
				setGlobal("CALLING_FORM", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_APAPERS
		 
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
    GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPBPERS');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
--
-- Query Race/Ethnicity data
--
  IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
    GO_BLOCK('GORPRAC');  
    :SYSTEM.MESSAGE_LEVEL := '5';
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL := '0';
    GO_BLOCK('SPBPERS');
  END IF;

END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_APAPERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_APAPERS")
		public void Apaiden_MnuCallApapers()
		{
			
			try{
				executeAction("CHECK_TO_SAVE");
				goBlock(toStr("SPBPERS"));
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				// 
				//  Query Race/Ethnicity data
				// 
				if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
				{
					goBlock(toStr("GORPRAC"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					executeQuery();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					goBlock(toStr("SPBPERS"));
				}
			}catch(Exception e){
				goItem(toStr(getCursorItem()));
				throw new ApplicationException(e);
				
			}
			
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("SPBPERS"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					// 
//					//  Query Race/Ethnicity data
//					// 
//					if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
//					{
//						goBlock(toStr("GORPRAC"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						executeQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//						goBlock(toStr("SPBPERS"));
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.ENABLE_NONPERS_ITEMS
		 SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_ON);
SET_ITEM_PROPERTY ('NON_PERS_NAME', NAVIGABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('NON_PERS_NAME', UPDATEABLE, PROPERTY_ON);
G$_NAVIGATION_FRAME.DISABLE_OPTION( G$_NLS.Get('APAIDEN-0011', 'FORM','Person Information') ,'L');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ENABLE_NONPERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_NONPERS_ITEMS")
		public void Apaiden_EnableNonpersItems()
		{
			
				setItemEnabled("NON_PERS_NAME", true);
				setItemNavigable("NON_PERS_NAME", true);
				setItemUpdateAllowed("NON_PERS_NAME", true);
				getTask().getGoqrpls().getGNavigationFrame().disableOption(GNls.Fget(toStr("APAIDEN-0011"), toStr("FORM"), toStr("Person Information")), toStr("L"));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.ENABLE_PERS_ITEMS
		 SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LAST_NAME', ENABLED, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LAST_NAME', NAVIGABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LAST_NAME',UPDATEABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_FIRST_NAME', ENABLED, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_FIRST_NAME', NAVIGABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_FIRST_NAME', UPDATEABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_MI', ENABLED, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_MI', NAVIGABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_MI', UPDATEABLE, PROPERTY_ON);
G$_NAVIGATION_FRAME.ENABLE_OPTION( G$_NLS.Get('APAIDEN-0012', 'FORM','Person Information') ,'L');
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',ENABLED) = 'FALSE' 
   	AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX', VISIBLE) = 'TRUE'
    AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',CONCEAL_DATA) = 'FALSE'  THEN  -- Defect#1-4I01RM added AND conditions	
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',ENABLED) = 'FALSE'
   	AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX', VISIBLE) = 'TRUE'
    AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',CONCEAL_DATA) = 'FALSE'  THEN  -- Defect#1-4I01RM added AND conditions	
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',ENABLED) = 'FALSE'
   	AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME', VISIBLE) = 'TRUE'
    AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',CONCEAL_DATA) = 'FALSE'  THEN  -- Defect#1-4I01RM added AND conditions	
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',ENABLED) = 'FALSE' 
   	AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', VISIBLE) = 'TRUE'
    AND GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',CONCEAL_DATA) = 'FALSE'  THEN  -- Defect#1-1R44PT added AND conditions	
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ENABLE_PERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_PERS_ITEMS")
		public void Apaiden_EnablePersItems()
		{
			
				setItemEnabled("SPRIDEN_CURRENT.PERS_LAST_NAME", true);
				setItemNavigable("SPRIDEN_CURRENT.PERS_LAST_NAME", true);
				setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_LAST_NAME", true);
				setItemEnabled("SPRIDEN_CURRENT.PERS_FIRST_NAME", true);
				setItemNavigable("SPRIDEN_CURRENT.PERS_FIRST_NAME", true);
				setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_FIRST_NAME", true);
				setItemEnabled("SPRIDEN_CURRENT.PERS_MI", true);
				setItemNavigable("SPRIDEN_CURRENT.PERS_MI", true);
				setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_MI", true);
				getTask().getGoqrpls().getGNavigationFrame().enableOption(GNls.Fget(toStr("APAIDEN-0012"), toStr("FORM"), toStr("Person Information")), toStr("L"));
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_PREFIX").equals("FALSE") && getItemVisible("SPRIDEN_CURRENT.PERS_PREFIX").equals("TRUE") && getItemDisplayAsPassword("SPRIDEN_CURRENT.PERS_PREFIX").equals("FALSE")  )//SupportClasses.FORMS40.GetItemProperty("SPRIDEN_CURRENT.PERS_PREFIX", SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					//  Defect#1-4I01RM added AND conditions	
					setItemEnabled("SPRIDEN_CURRENT.PERS_PREFIX", true);
					setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_PREFIX", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_PREFIX", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_SUFFIX").equals("FALSE") && getItemVisible("SPRIDEN_CURRENT.PERS_SUFFIX").equals("TRUE") && getItemDisplayAsPassword("SPRIDEN_CURRENT.PERS_SUFFIX").equals("FALSE")) //SupportClasses.FORMS40.GetItemProperty("SPRIDEN_CURRENT.PERS_SUFFIX", SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					//  Defect#1-4I01RM added AND conditions	
					setItemEnabled("SPRIDEN_CURRENT.PERS_SUFFIX", true);
					setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_SUFFIX", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_SUFFIX", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_PREF_FNAME").equals("FALSE") && getItemVisible("SPRIDEN_CURRENT.PERS_PREF_FNAME").equals("TRUE") && getItemDisplayAsPassword("SPRIDEN_CURRENT.PERS_PREF_FNAME").equals("FALSE")) //SupportClasses.FORMS40.GetItemProperty("SPRIDEN_CURRENT.PERS_PREF_FNAME", SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					//  Defect#1-4I01RM added AND conditions	
					setItemEnabled("SPRIDEN_CURRENT.PERS_PREF_FNAME", true);
					setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_PREF_FNAME", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_PREF_FNAME", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals("FALSE") && getItemVisible("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals("TRUE") && getItemDisplayAsPassword("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals("FALSE"))  //SupportClasses.FORMS40.GetItemProperty("SPRIDEN_CURRENT.PERS_LEGAL_NAME", SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					//  Defect#1-1R44PT added AND conditions	
					setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
					setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE", true);
					setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_MRTL_CODE", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_MRTL_CODE", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.GET_FULLNAME
		 -- Begin 1-8XBO6Y
IF :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P' THEN
g$_build_full_name(p_FULL_NAME    => :KEY_BLOCK.FULL_NAME, 
                   p_LAST_NAME    => :SPRIDEN_CURRENT.PERS_LAST_NAME,
                   p_FIRST_NAME   => :SPRIDEN_CURRENT.PERS_FIRST_NAME,
                   p_MI_NAME      => :SPRIDEN_CURRENT.PERS_MI,
--                   :SPBPERS_NAME_PREFIX, 
--                   :SPBPERS_NAME_SUFFIX,
                   p_NAME_PREFIX  => :SPRIDEN_CURRENT.PERS_PREFIX,
                   p_NAME_SUFFIX  => :SPRIDEN_CURRENT.PERS_SUFFIX,
                   p_NAME_LEN     => GET_ITEM_PROPERTY('KEY_BLOCK.FULL_NAME', MAX_LENGTH),
                   p_SURNAME_PREFIX  => :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX);
END IF;
-- End 1-8XBO6Y
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.GET_FULLNAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GET_FULLNAME")
		@After
		public void Apaiden_GetFullname()
		{
			
				//  Begin 1-8XBO6Y

				//F2J_WARNING : Caution, the variable may be null.
				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);


				//  Begin 1-8XBO6Y
				if ( spridenCurrentElement.getSpridenEntityInd().equals("P") )
				{
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getFullName());
					getTask().getGoqrpls().gBuildFullName(pFullName_ref, /*pLastName=>*/spridenCurrentElement.getPersLastName(), /*pFirstName=>*/spridenCurrentElement.getPersFirstName(), /*pMiName=>*/spridenCurrentElement.getPersMi(), /*pNamePrefix=>*/spridenCurrentElement.getPersPrefix(), /*pNameSuffix=>*/spridenCurrentElement.getPersSuffix(), toInt(90), /*pSurnamePrefix=>*/spridenCurrentElement.getPersSurnamePrefix());
					getFormModel().getKeyBlock().setFullName(pFullName_ref.val);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
--
-- Rollback Issue Code. FHL 9/5/96
IF :GLOBAL.VALUE = 'KEY-CLRFRM' THEN
 RETURN;
END IF;
--
-- Added :GLOBAL.ALUM_CALLED_FORM <> 'Y' below because of defect # 5889.
-- This defect was a Character mode issue that when Spouse address was
-- invoked from apaiden, the Address window would not display when 
-- apaiden was called. This worked fine in windows !. FHL 2/20/97
--
-- Added :GLOBAL.ALUM_CALLED_FORM IS NULL Check below. FHL 6/20/97
--
   IF :SYSTEM.EVENT_WINDOW IS NULL OR
      :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
      G$_SET_WIN_PROPERTY;
      G$_SET_INST_PROPERTY;
   END IF;
 
-- New Lines added by FHL request    TV 01-22-99 
    IF :SYSTEM.EVENT_WINDOW IS NOT NULL AND 
      :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW'
--
-- added following two lines to fix defect #12271 04/21/99 YGUO
        AND ( :GLOBAL.ALUM_CALLED_FORM <> 'Y' OR
        :GLOBAL.ALUM_CALLED_FORM IS NULL ) THEN
--
      G$_DETERMINE_CURSOR_LOCATION('SPRIDEN_CURRENT.SPRIDEN_ID');
   END IF;

--   
<multilinecomment> IF :SYSTEM.EVENT_WINDOW ='MAIN_WINDOW' THEN
      G$_DETERMINE_CURSOR_LOCATION('SPRIDEN_CURRENT.SPRIDEN_ID');
   END IF;</multilinecomment>  --Removed by FHL request - TV 01-22-99

      
 <multilinecomment>  IF :SYSTEM.EVENT_WINDOW IS NOT NULL AND
      :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' AND
      ( :GLOBAL.ALUM_CALLED_FORM <> 'Y' OR
        :GLOBAL.ALUM_CALLED_FORM IS NULL ) THEN
      G$_DETERMINE_CURSOR_LOCATION('SPRIDEN_CURRENT.SPRIDEN_ID');
   END IF; </multilinecomment>   
             --Removed to comply with navigation order in 4.0 GD 09-03-98
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Apaiden_WhenWindowActivatedTrg()
		{
			
				// 
				//  Rollback Issue Code. FHL 9/5/96
				if ( getGlobal("VALUE").equals("KEY-CLRFRM") )
				{
					return ;
				}
				// 
				//  Added :GLOBAL.ALUM_CALLED_FORM <> 'Y' below because of defect # 5889.
				//  This defect was a Character mode issue that when Spouse address was
				//  invoked from apaiden, the Address window would not display when 
				//  apaiden was called. This worked fine in windows !. FHL 2/20/97
				// 
				//  Added :GLOBAL.ALUM_CALLED_FORM IS NULL Check below. FHL 6/20/97
				// 
				if ( getCurrentWindow().isNull() || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetWinProperty();
					getTask().getGoqrpls().gSetInstProperty();
				}
				//  New Lines added by FHL request    TV 01-22-99 
				if ( getCurrentWindow().isNotNull() && getCurrentWindow().notEquals("G$_OPT_WINDOW") && (getGlobal("ALUM_CALLED_FORM").notEquals("Y") || getGlobal("ALUM_CALLED_FORM").isNull()) )
				{
					// 
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
	IF NAME_IN('SYSTEM.CURSOR_BLOCK')='AURALRT' OR
	   NAME_IN('SYSTEM.CURSOR_BLOCK')='KEY_BLOCK' THEN
		RETURN;
	END IF;
	:HOLD_BLOCK_FIELD := '';
IF NAME_IN('SYSTEM.CURSOR_BLOCK')='SPRADDR' THEN
	--
   IF :CHECK_KEYS = 'Y' THEN
      :CHECK_KEYS := 'N';
      GO_BLOCK('KEY_BLOCK');
      DO_KEY('NEXT_ITEM');
      G$_CHECK_VALUE ((:KEY_BLOCK.ID IS NULL),
       G$_NLS.Get('APAIDEN-0013', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.')  
         , TRUE, TRUE);
      GO_BLOCK('SPRADDR');
      GO_ITEM('SPRADDR_ATYP_CODE');
      EXECUTE_QUERY(ALL_RECORDS); 
      :CHECK_KEYS := 'N';
      EXECUTE_TRIGGER ('DISABLE_KEYS');
      G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
      G$_CHECK_FAILURE;
   ELSE
   	  EXECUTE_QUERY(ALL_RECORDS);
   END IF;

      IF :ENTITY_IND = 'C' THEN
            G$_NAVIGATION_FRAME.DISABLE_OPTION('APAIDEN','P');
            G$_NAVIGATION_FRAME.DISABLE_OPTION('APAEHIS','L');
      ELSE
            G$_NAVIGATION_FRAME.ENABLE_OPTION('APAIDEN','P');
            G$_NAVIGATION_FRAME.ENABLE_OPTION('APAEHIS','L');
      END IF;

--
--
ELSE
IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK('KEY_BLOCK');
   G$_CHECK_VALUE ((:KEY_BLOCK.ID IS NULL),
       G$_NLS.Get('APAIDEN-0014', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.')  
         , TRUE, TRUE);
--
   SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_OFF);
   NEXT_BLOCK ;
   :SYSTEM.MESSAGE_LEVEL := '5';
   EXECUTE_QUERY;
   :SYSTEM.MESSAGE_LEVEL := '0';
   SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
   IF :ENTITY_IND IS NULL  THEN
      <multilinecomment> Allow entering into Person fields </multilinecomment>
      IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN   
         EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
         G$_CHECK_FAILURE; 
      END IF;
     <multilinecomment> Allow entering into Non-Person field </multilinecomment>
      IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN   
         EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
       G$_NAVIGATION_FRAME.DISABLE_OPTION('APAPERS','L');
      
         G$_CHECK_FAILURE; 
      END IF;
      GO_ITEM( 'PERS_LAST_NAME' ) ;
   ELSE
      GO_ITEM( 'SPRIDEN_CURRENT.SPRIDEN_ID' ) ;
      IF :ENTITY_IND = 'P' THEN
 --
      <multilinecomment> New Line  TV 01-15-99</multilinecomment>
         G$_NAVIGATION_FRAME.ENABLE_OPTION('APAPERS','L');
--    
      <multilinecomment> Do not allow entering into Non-Person field </multilinecomment>
         IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'TRUE' THEN
            SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_OFF);
         END IF;
      <multilinecomment> Allow entering into Person fields </multilinecomment>
-- Begin Defect 70-0153
--         IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN
            EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
            G$_CHECK_FAILURE; 
--         END IF;
-- End Defect 70-0153
      END IF;                                
      IF :ENTITY_IND = 'C' THEN
      <multilinecomment> Do not allow entering into Person fields </multilinecomment>
--
      <multilinecomment> New Line  TV 01-15-99</multilinecomment>
         G$_NAVIGATION_FRAME.DISABLE_OPTION('APAPERS','L');
--
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LAST_NAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_FIRST_NAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MI', ENABLED, PROPERTY_OFF); 
-- Begin Defect 70-0153
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED, PROPERTY_OFF);
-- End Defect 70-0153
      <multilinecomment> Allow entering into Non-Person field </multilinecomment>
         IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN   
            EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
            G$_CHECK_FAILURE; 
         END IF;
      END IF;  
   END IF ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER ('DISABLE_KEYS');
   EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
   G$_CHECK_FAILURE;
   IF :GLOBAL.NAVIGATE_TO_TAB = 'TELEPHONE' THEN
 	  	:check_keys := 'N';
  	 	GO_ITEM('SPRTELE.SPRTELE_TELE_CODE');
  	 	RETURN;
 	 END IF;
ELSE	
  IF :SYSTEM.CURSOR_BLOCK = 'SPRIDEN_CURRENT' THEN
     IF :HOLD_BLOCK_FIELD is NULL THEN
     :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID'; 
     END IF;
  GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
  :HOLD_BLOCK_FIELD := '';
  ELSIF :SYSTEM.CURSOR_BLOCK = 'SPRIDEN_PREVIOUS' THEN
     IF :HOLD_BLOCK_FIELD is NULL THEN
        :HOLD_BLOCK_FIELD := 'SPRIDEN_PREVIOUS.SPRIDEN_ID'; 
     END IF;
     GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
     :HOLD_BLOCK_FIELD := '';
     :SYSTEM.MESSAGE_LEVEL := '0';
  ELSIF :SYSTEM.CURSOR_BLOCK = 'SPRTELE' THEN
     IF :HOLD_BLOCK_FIELD is NULL THEN
        :HOLD_BLOCK_FIELD := 'SPRTELE.SPRTELE_TELE_CODE'; 
     END IF;
     GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
     :HOLD_BLOCK_FIELD := '';
     EXECUTE_QUERY;
     :SYSTEM.MESSAGE_LEVEL := '0';
  ELSIF :SYSTEM.CURSOR_BLOCK = 'SPBPERS' THEN
     IF :HOLD_BLOCK_FIELD is NULL THEN
        :HOLD_BLOCK_FIELD := 'SPBPERS.PERS_SEX'; 
     END IF;
     GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
     :HOLD_BLOCK_FIELD := '';
--     EXECUTE_QUERY;
     :SYSTEM.MESSAGE_LEVEL := '0';
     IF :ENTITY_IND = 'C' THEN
     	  EXECUTE_TRIGGER('BIO_TAB_WARNING');
     END IF;
  ELSIF :SYSTEM.CURSOR_BLOCK = 'GOREMAL' THEN
     IF :HOLD_BLOCK_FIELD is NULL THEN
        :HOLD_BLOCK_FIELD := 'GOREMAL.GOREMAL_EMAL_CODE'; 
     END IF;
     GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
     :HOLD_BLOCK_FIELD := '';
     :SYSTEM.MESSAGE_LEVEL := '0'; 
    --   
  END IF;
  --
END IF;
END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Apaiden_WhenNewBlockInstanceTrg()
		{
			
				if ( getCursorBlock().equals("AURALRT") || getCursorBlock().equals("KEY_BLOCK") )
				{
					return ;
				}
				getFormModel().getFormHeader().setHoldBlockField(toStr(""));
				if ( getCursorBlock().equals("SPRADDR") )
				{
					// 
					if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
					{
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						goBlock(toStr("KEY_BLOCK"));
						executeAction(KeyFunction.NEXT_ITEM);
						getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getId().isNull())), GNls.Fget(toStr("APAIDEN-0013"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
						goBlock(toStr("SPRADDR"));
						goItem(toStr("SPRADDR_ATYP_CODE"));
						executeQuery();
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("ENABLE_TAB_PAGES");
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						executeQuery();
					}
					if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
					{
						getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APAIDEN"), toStr("P"));
						getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APAEHIS"), toStr("L"));
					}
					else {
						getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("APAIDEN"), toStr("P"));
						getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("APAEHIS"), toStr("L"));
					}
				}
				else {
					if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
					{
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						goBlock(toStr("KEY_BLOCK"));
						getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getId().isNull())), GNls.Fget(toStr("APAIDEN-0014"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
						// 
						setFormValidationEnabled(getCurrentTaskName(), false);
						nextBlock();
						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
						executeQuery();
						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						setFormValidationEnabled(getCurrentTaskName(), true);
						if ( getFormModel().getKeyBlock().getEntityInd().isNull() )
						{
							//  Allow entering into Person fields 
							if ( getItemEnabled("PERS_LAST_NAME").equals("FALSE") )
							{
								executeAction("ENABLE_PERS_ITEMS");
								getTask().getGoqrpls().gCheckFailure();
							}
							//  Allow entering into Non-Person field 
							if ( getItemEnabled("NON_PERS_NAME").equals("FALSE") )
							{
								executeAction("ENABLE_NONPERS_ITEMS");
								getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APAPERS"), toStr("L"));
								getTask().getGoqrpls().gCheckFailure();
							}
							goItem(toStr("PERS_LAST_NAME"));
						}
						else {
							goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
							if ( getFormModel().getKeyBlock().getEntityInd().equals("P") )
							{
								// 
								//  New Line  TV 01-15-99
								getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("APAPERS"), toStr("L"));
								//     
								//  Do not allow entering into Non-Person field 
								if ( getItemEnabled("NON_PERS_NAME").equals("TRUE") )
								{
									setItemEnabled("NON_PERS_NAME", false);
								}
								//  Allow entering into Person fields 
								//  Begin Defect 70-0153
								//          IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN
								executeAction("ENABLE_PERS_ITEMS");
								getTask().getGoqrpls().gCheckFailure();
							}
							if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
							{
								//  Do not allow entering into Person fields 
								// 
								//  New Line  TV 01-15-99
								getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APAPERS"), toStr("L"));
								// 
								setItemEnabled("SPRIDEN_CURRENT.PERS_LAST_NAME", false);
								setItemEnabled("SPRIDEN_CURRENT.PERS_FIRST_NAME", false);
								setItemEnabled("SPRIDEN_CURRENT.PERS_MI", false);
								//  Begin Defect 70-0153
								setItemEnabled("SPRIDEN_CURRENT.PERS_PREFIX", false);
								setItemEnabled("SPRIDEN_CURRENT.PERS_SUFFIX", false);
								setItemEnabled("SPRIDEN_CURRENT.PERS_PREF_FNAME", false);
								setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", false);
								//  End Defect 70-0153
								//  Allow entering into Non-Person field 
								if ( getItemEnabled("NON_PERS_NAME").equals("FALSE") )
								{
									executeAction("ENABLE_NONPERS_ITEMS");
									getTask().getGoqrpls().gCheckFailure();
								}
							}
						}
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
						executeAction("DISABLE_KEYS");
						executeAction("ENABLE_TAB_PAGES");
						getTask().getGoqrpls().gCheckFailure();
						if ( getGlobal("NAVIGATE_TO_TAB").equals("TELEPHONE") )
						{
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							goItem(toStr("SPRTELE.SPRTELE_TELE_CODE"));
							return ;
						}
					}
					else {
						if ( getCursorBlock().equals("SPRIDEN_CURRENT") )
						{
							if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
							{
								getFormModel().getFormHeader().setHoldBlockField(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
							}
							goItem(getNameIn("HOLD_BLOCK_FIELD"));
							getFormModel().getFormHeader().setHoldBlockField(toStr(""));
						}
						else if ( getCursorBlock().equals("SPRIDEN_PREVIOUS") ) {
							if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
							{
								getFormModel().getFormHeader().setHoldBlockField(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ID"));
							}
							goItem(getNameIn("HOLD_BLOCK_FIELD"));
							getFormModel().getFormHeader().setHoldBlockField(toStr(""));
							// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						}
						else if ( getCursorBlock().equals("SPRTELE") ) {
							if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
							{
								getFormModel().getFormHeader().setHoldBlockField(toStr("SPRTELE.SPRTELE_TELE_CODE"));
							}
							goItem(getNameIn("HOLD_BLOCK_FIELD"));
							getFormModel().getFormHeader().setHoldBlockField(toStr(""));
							executeQuery();
							// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						}
						else if ( getCursorBlock().equals("SPBPERS") ) {
							if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
							{
								getFormModel().getFormHeader().setHoldBlockField(toStr("SPBPERS.PERS_SEX"));
							}
							goItem(getNameIn("HOLD_BLOCK_FIELD"));
							getFormModel().getFormHeader().setHoldBlockField(toStr(""));
							//      EXECUTE_QUERY;
							// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
							if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
							{
								executeAction("BIO_TAB_WARNING");
							}
						}
						else if ( getCursorBlock().equals("GOREMAL") ) {
							if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
							{
								getFormModel().getFormHeader().setHoldBlockField(toStr("GOREMAL.GOREMAL_EMAL_CODE"));
							}
							goItem(getNameIn("HOLD_BLOCK_FIELD"));
							getFormModel().getFormHeader().setHoldBlockField(toStr(""));
							// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
							MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.NAME_AND_ID_CHECK
		 G$_CHECK_VALUE(
  (:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P'),
  G$_NLS.Get('APAIDEN-0015', 'FORM', 
    '*ERROR* Last name and first name required for a person.'), TRUE);

-- This trigger step checks if the person exists on the -- database.  If not, the
-- information must be committed (so a PIDM is created for further processing)
G$_CHECK_VALUE(
  (:SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL 
    AND (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL 
         OR :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL)),
   G$_NLS.Get('APAIDEN-0016', 'FORM',
     '*ERROR* Current identification added; press COMMIT.'), TRUE);

-- This trigger step checks if either the name or id was changed to force
-- the user to commit any changes.
DECLARE
  PTI_INTO_TEMP        VARCHAR2(255);
  CURSOR PTI_CURSOR IS
    SELECT 'X'
    FROM   SPRIDEN
    WHERE  ROWID = :SPRIDEN_CURRENT.ROWID
      AND  RTRIM(SPRIDEN_LAST_NAME) = RTRIM(:SPRIDEN_CURRENT.SPRIDEN_LAST_NAME)
      AND  (   (SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME
                AND  :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL)
            OR (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL
                AND  :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C'))
      AND  SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID;
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
  G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
    G$_NLS.Get('APAIDEN-0017', 'FORM',
      '*ERROR* Current identification changed; press COMMIT.'), TRUE);
  CLOSE PTI_CURSOR;
END;
		*/
		/*
		 *<p>
		 *This trigger checks that the last and first names are entered for a person.

		 *It then checks if a new person was added and must be committed or if an

		 *existing person was changed and must be committed.  Finally, the name

		 *information is copied onto subsequent pages.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.NAME_AND_ID_CHECK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NAME_AND_ID_CHECK")
		public void Apaiden_NameAndIdCheck()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);


				int rowCount = 0;
				getTask().getGoqrpls().gCheckValue(((spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement.getSpridenEntityInd().equals("P"))), GNls.Fget(toStr("APAIDEN-0015"), toStr("FORM"), toStr("*ERROR* Last name and first name required for a person.")), toBool(NBool.True));
				//  This trigger step checks if the person exists on the -- database.  If not, the
				//  information must be committed (so a PIDM is created for further processing)
				getTask().getGoqrpls().gCheckValue(((spridenCurrentElement.getSpridenPidm().isNull() && (!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getNonPersName().isNull()))), GNls.Fget(toStr("APAIDEN-0016"), toStr("FORM"), toStr("*ERROR* Current identification added; press COMMIT.")), toBool(NBool.True));
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE ROWID = :SPRIDEN_CURRENT_ROWID AND RTRIM(SPRIDEN_LAST_NAME) = RTRIM(:SPRIDEN_CURRENT_SPRIDEN_LAST_NAME) AND ((SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME AND :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NOT NULL) OR (:SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NULL AND :SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND = 'C')) AND SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRIDEN_CURRENT_ROWID", spridenCurrentElement.getROWID());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_LAST_NAME", spridenCurrentElement.getSpridenLastName());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME", spridenCurrentElement.getSpridenFirstName());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND", spridenCurrentElement.getSpridenEntityInd());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("APAIDEN-0017"), toStr("FORM"), toStr("*ERROR* Current identification changed; press COMMIT.")), toBool(NBool.True));
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_BLK_PREVIOUS
		 <multilinecomment>EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
--
IF :KEY_BLOCK.PIDM is null then
  message( G$_NLS.Get('APAIDEN-0059', 'FORM','*ERROR* Please add name information before looking for alternate names.') );
  RAISE FORM_TRIGGER_FAILURE;
 ELSE
  GO_BLOCK('SPRIDEN_PREVIOUS');
END IF;</multilinecomment>

EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
    GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPRIDEN_PREVIOUS');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_BLK_PREVIOUS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_BLK_PREVIOUS")
		public void Apaiden_MnuOptBlkPrevious()
		{
			
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// --
				// IF :KEY_BLOCK.PIDM is null then
				// message( G$_NLS.Get('APAIDEN-0059', 'FORM','*ERROR* Please add name information before looking for alternate names.') );
				// RAISE FORM_TRIGGER_FAILURE;
				// ELSE
				// GO_BLOCK('SPRIDEN_PREVIOUS');
				// END IF;
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// --
				// IF :KEY_BLOCK.PIDM is null then
				// message( G$_NLS.Get('APAIDEN-0059', 'FORM','*ERROR* Please add name information before looking for alternate names.') );
				// RAISE FORM_TRIGGER_FAILURE;
				// ELSE
				// GO_BLOCK('SPRIDEN_PREVIOUS');
				// END IF;
				try{
					executeAction("CHECK_TO_SAVE");
					goBlock(toStr("SPRIDEN_PREVIOUS"));
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					executeQuery();
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}catch(Exception e){
					goItem(toStr(getCursorItem()));
					throw new ApplicationException(e);
					
				}
				
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("SPRIDEN_PREVIOUS"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CHECK_BOTH
		    IF :SPRIDEN_CURRENT.ROWID IS NULL  THEN
      EXECUTE_TRIGGER( 'CHECK_PERS_NONPERS' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CHECK_BOTH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BOTH")
		public void Apaiden_CheckBoth()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);


				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( toStr(spridenCurrentElement.getROWID()).isNull() )
				{
					executeAction("CHECK_PERS_NONPERS");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.SAVE_KEYS
		 <multilinecomment>IF :KEY_BLOCK.ID IS NULL THEN
   :GLOBAL.KEY_IDNO := '';
ELSIF
   :key_block.ID = 'GENERATED' THEN
   :GLOBAL.KEY_IDNO := '';
ELSE
   :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
END IF;</multilinecomment>
   :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
--   EXECUTE_TRIGGER('GLOBAL_ID_ERASE');
		*/
		/*
		 *<p>
		 *This trigger will copy the keys back to the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Apaiden_SaveKeys()
		{
			
				// IF :KEY_BLOCK.ID IS NULL THEN
				// :GLOBAL.KEY_IDNO := '';
				// ELSIF
				// :key_block.ID = 'GENERATED' THEN
				// :GLOBAL.KEY_IDNO := '';
				// ELSE
				// :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
				// END IF;
				// IF :KEY_BLOCK.ID IS NULL THEN
				// :GLOBAL.KEY_IDNO := '';
				// ELSIF
				// :key_block.ID = 'GENERATED' THEN
				// :GLOBAL.KEY_IDNO := '';
				// ELSE
				// :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
				// END IF;
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Nov-2003 11:04 PM
 ******************************************</multilinecomment>
    
   :HOLD_BLOCK := :SYSTEM.CURRENT_BLOCK ;
--
   :HOLD_FIELD := :SYSTEM.CURRENT_FIELD ;
--
   :HOLD_BLOCK_FIELD := :HOLD_BLOCK || '.' || :HOLD_FIELD ;
--
   null ;   -- BLOCK_MENU ;
--
   IF :SYSTEM.CURRENT_BLOCK = 'KEY_BLOCK' THEN
      EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
      G$_CHECK_FAILURE ;
      CLEAR_FORM ;
      G$_CHECK_FAILURE ;
      NEXT_BLOCK ;
      EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SYSTEM.CURRENT_BLOCK = 'SPAPERS' THEN
      EXECUTE_TRIGGER( 'CALL_SPAPERS' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SYSTEM.CURRENT_BLOCK = 'SPATELE' THEN
      EXECUTE_TRIGGER( 'CALL_SPATELE' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SYSTEM.CURRENT_BLOCK = 'SOAAPPT' THEN
      EXECUTE_TRIGGER( 'CALL_SOAAPPT' ) ;
      G$_CHECK_FAILURE ;
   ELSIF :SYSTEM.CURRENT_BLOCK = 'GUASYST' THEN
      EXECUTE_TRIGGER( 'CALL_GUASYST' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      EXECUTE_QUERY ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER")
		public void Apaiden_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 11:04 PM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Nov-2003 11:04 PM
				// ******************************************
				getFormModel().getFormHeader().setHoldBlock(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setHoldField(toStr(getCurrentField()));
				// 
				getFormModel().getFormHeader().setHoldBlockField(getFormModel().getFormHeader().getHoldBlock().append(".").append(getFormModel().getFormHeader().getHoldField()));
				// 
				//  BLOCK_MENU ;
				// 
				if ( getCurrentBlock().equals("KEY_BLOCK") )
				{
					executeAction("SAVE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					clearTask();
					getTask().getGoqrpls().gCheckFailure();
					nextBlock();
					executeAction("LOAD_FORM_HEADER");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("GLOBAL_COPY");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getCurrentBlock().equals("SPAPERS") ) {
					executeAction("CALL_SPAPERS");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getCurrentBlock().equals("SPATELE") ) {
					executeAction("CALL_SPATELE");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getCurrentBlock().equals("SOAAPPT") ) {
					executeAction("CALL_SOAAPPT");
					getTask().getGoqrpls().gCheckFailure();
				}
				else if ( getCurrentBlock().equals("GUASYST") ) {
					executeAction("CALL_GUASYST");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.LOAD_FORM_HEADER
		 :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
:CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
:CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
:CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
:CURRENT_USER := USER ;
:MATERIAL_FLAG := '';
EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Apaiden_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getUser());
				getFormModel().getFormHeader().setMaterialFlag(toStr(""));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.INVALID_FUNCTION_MSG
		    NULL ;
   MESSAGE(
 G$_NLS.Get('APAIDEN-0018', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Apaiden_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("APAIDEN-0018"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.GLOBAL_COPY
		 :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
GO_ITEM('KEY_BLOCK.ID');
IF :KEY_BLOCK.ID IS NOT NULL THEN
   NEXT_ITEM;
ELSE
   CLEAR_RECORD;
END IF;
-- Added else clear_record above to display auto-hint.
GO_ITEM('KEY_BLOCK.ID');
		*/
		/*
		 *<p>
		 *This trigger will copy the key information from the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Apaiden_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				goItem(toStr("KEY_BLOCK.ID"));
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
				else {
					clearRecord();
				}
				//  Added else clear_record above to display auto-hint.
				goItem(toStr("KEY_BLOCK.ID"));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('GENERATE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('SPS_IDNO',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPS_IDNO',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('SPS_IDNO',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED) = 'FALSE' THEN
   IF :SPS_IDNO IS NOT NULL THEN
      SET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED,PROPERTY_ON);
   END IF;
END IF;
--
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
END IF;
--
 SET_ITEM_PROPERTY('ADDRESS_BTN',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('NAMES_BTN',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('SOURCE_BTN',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('LAST_NAME_SRCH_BTN',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('FIRST_NAME_SRCH_BTN',ENABLED,PROPERTY_OFF);
 SET_ITEM_PROPERTY('SPRIDEN_CURRENT_1_PREV_BTN',ENABLED,PROPERTY_OFF);
--
--SET_ITEM_PROPERTY('EMAL_BTN',LABEL, G$_NLS.Get('APAIDEN-0075', 'FORM','E-mail Address') ); LR
--
-- SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB'); 
-- EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Apaiden_EnableKeys()
		{
			
				if ( getItemEnabled("GENERATE_BTN").equals("FALSE") )
				{
					setItemEnabled("GENERATE_BTN", true);
				}
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				// 
				if ( getItemEnabled("SPS_IDNO").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO", true);
					setItemNavigable("SPS_IDNO", true);
				}
				// 
				if ( getItemEnabled("DONR_CAT_LBT").equals("FALSE") )
				{
					setItemEnabled("DONR_CAT_LBT", true);
				}
				// 
				if ( getItemEnabled("SPS_IDNO_LBT").equals("FALSE") )
				{
					if ( !getFormModel().getKeyBlock().getSpsIdno().isNull() )
					{
						setItemEnabled("SPS_IDNO_LBT", true);
					}
				}
				// 
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
				}
				// 
				setItemEnabled("ADDRESS_BTN", false);
				setItemEnabled("NAMES_BTN", false);
				setItemEnabled("SOURCE_BTN", false);
				setItemEnabled("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT", false);
				setItemEnabled("LAST_NAME_SRCH_BTN", false);
				setItemEnabled("FIRST_NAME_SRCH_BTN", false);
				setItemEnabled("SPRIDEN_CURRENT_1_PREV_BTN", false);
				// 
				// SET_ITEM_PROPERTY('EMAL_BTN',LABEL, G$_NLS.Get('APAIDEN-0075', 'FORM','E-mail Address') ); LR
				// 
				//  SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB'); 
				//  EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.DISABLE_KEYS
		    SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPS_IDNO',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('DONR_CAT_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('SPS_IDNO_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_OFF);
--
IF GET_ITEM_PROPERTY('ADDRESS_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ADDRESS_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('NAMES_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('NAMES_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SOURCE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SOURCE_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('LAST_NAME_SRCH_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('LAST_NAME_SRCH_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('FIRST_NAME_SRCH_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('FIRST_NAME_SRCH_BTN',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT_1_PREV_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('SPRIDEN_CURRENT_1_PREV_BTN',ENABLED,PROPERTY_ON);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Apaiden_DisableKeys()
		{
			
				setItemEnabled("GENERATE_BTN", false);
				setItemEnabled("ID", false);
				setItemEnabled("SPS_IDNO", false);
				setItemEnabled("DONR_CAT_LBT", false);
				setItemEnabled("SPS_IDNO_LBT", false);
				setItemEnabled("ID_LBT", false);
				// 
				if ( getItemEnabled("ADDRESS_BTN").equals("FALSE") )
				{
					setItemEnabled("ADDRESS_BTN", true);
				}
				if ( getItemEnabled("NAMES_BTN").equals("FALSE") )
				{
					setItemEnabled("NAMES_BTN", true);
				}
				if ( getItemEnabled("SOURCE_BTN").equals("FALSE") )
				{
					setItemEnabled("SOURCE_BTN", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE_LBT", true);
				}
				if ( getItemEnabled("LAST_NAME_SRCH_BTN").equals("FALSE") )
				{
					setItemEnabled("LAST_NAME_SRCH_BTN", true);
				}
				if ( getItemEnabled("FIRST_NAME_SRCH_BTN").equals("FALSE") )
				{
					setItemEnabled("FIRST_NAME_SRCH_BTN", true);
				}
				if ( getItemEnabled("SPRIDEN_CURRENT_1_PREV_BTN").equals("FALSE") )
				{
					setItemEnabled("SPRIDEN_CURRENT_1_PREV_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CLRFRM_TRIGGER
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER ('ENABLE_KEYS');   
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB'); 
   IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      :GLOBAL.ACTION := '';
      EXECUTE_TRIGGER('DISABLE_KEYS');
      G$_CHECK_FAILURE;
      RETURN;
   END IF;
   EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN
      EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
   END IF;
   IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN
      EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CLRFRM_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLRFRM_TRIGGER")
		public void Apaiden_ClrfrmTrigger()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				setCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS", "CURRENT_ID_TAB");
				if ( getTaskStatus().equals("CHANGED") )
				{
					setGlobal("ACTION", toStr(""));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				executeAction("DISABLE_TAB_PAGES");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getItemEnabled("PERS_LAST_NAME").equals("FALSE") )
				{
					executeAction("ENABLE_PERS_ITEMS");
				}
				if ( getItemEnabled("NON_PERS_NAME").equals("FALSE") )
				{
					executeAction("ENABLE_NONPERS_ITEMS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_SPATELE
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0019', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.SECRFRM := 'SPATELE' ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SPATELE','');
--
   IF :HOLD_BLOCK <> 'KEY_BLOCK' THEN
      GO_BLOCK(:HOLD_BLOCK) ;
      EXECUTE_QUERY ;
   END IF ;
   GO_FIELD( :HOLD_BLOCK_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_SPATELE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPATELE")
		public void Apaiden_CallSpatele()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0019"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SPATELE"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SPATELE"), toStr(""));
				// 
				if ( getFormModel().getFormHeader().getHoldBlock().notEquals("KEY_BLOCK") )
				{
					goBlock(getFormModel().getFormHeader().getHoldBlock());
					executeQuery();
				}
				goField(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_SPAPERS
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0020', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.SECRFRM := 'SPAPERS' ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SPAPERS','');
--   
   GO_FIELD( :HOLD_BLOCK_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_SPAPERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPAPERS")
		public void Apaiden_CallSpapers()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0020"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SPAPERS"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SPAPERS"), toStr(""));
				//    
				goField(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_SOAAPPT
		 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
   MESSAGE( G$_NLS.Get('APAIDEN-0021', 'FORM','*ERROR* Must COMMIT changes for this function.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.SECRFRM := 'SOAAPPT' ;
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOAAPPT','');
--
   GO_FIELD( :HOLD_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_SOAAPPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SOAAPPT")
		public void Apaiden_CallSoaappt()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0021"), toStr("FORM"), toStr("*ERROR* Must COMMIT changes for this function.")));
					throw new ApplicationException();
				}
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SOAAPPT"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAAPPT"), toStr(""));
				// 
				goField(getFormModel().getFormHeader().getHoldField());
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CALL_GUASYST
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.SECRFRM := 'GUASYST' ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUASYST','');
--
   GO_FIELD( :HOLD_BLOCK_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CALL_GUASYST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_GUASYST")
		public void Apaiden_CallGuasyst()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("GUASYST"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUASYST"), toStr(""));
				// 
				goField(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.WHEN-NEW-FORM-INSTANCE
		 --
-- The SETMENU procedure below is to enable the menu block functions
-- in menu gumeval (attached to this form). Gumeval is used to provide
-- an Action.Select function to exit-with-value (spraddr_atyp_code)
-- when called from another form. The pre-form trigger conditionally
-- enables/disables the action.select menu pick and the Select button.
--
G$_SETMENU('main.block',1);
G$_SETMENU('action.select',0);
--
G$_SET_WIN_PROPERTY;
--
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
G$_CHECK_FAILURE ;
:GLOBAL.PRODUCT_IND := 'A' ;
DEFAULT_VALUE('','GLOBAL.NAVIGATE_TO_TAB');
G$_SET_INST_PROPERTY;

SHOW_VIEW('G$_IDEN_TAB_CANVAS');
SET_VIEW_PROPERTY('G$_IDEN_TAB_CANVAS',DISPLAY_POSITION,0,85);
--SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',HEIGHT,357);
EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
IF :GLOBAL.ALUM_CALLED_FORM = 'Y' THEN
   G$_SETMENU('action.select',1);
   SET_ITEM_PROPERTY ('SPRADDR_5_EXITVALUE_BTN', ENABLED, PROPERTY_ON);
   :SYSTEM.MESSAGE_LEVEL := '5';
   GO_BLOCK('SPRIDEN_CURRENT');
   EXECUTE_QUERY;
   IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('BIO_TAB') <> 'N' THEN
     GO_BLOCK('SPBPERS');
     EXECUTE_QUERY;
     GO_BLOCK('GORPRAC');
     EXECUTE_QUERY;
   END IF;
   IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('ADDRESS_TAB') <> 'N' THEN
     GO_BLOCK('SPRADDR');
     EXECUTE_QUERY(ALL_RECORDS);
   END IF;
   :check_keys := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
   G$_CHECK_FAILURE;
   IF :GLOBAL.ALUM_CALLED_BLOCK IS NOT NULL THEN
     IF CAN_NAVIGATE_TO_BLOCK(:GLOBAL.ALUM_CALLED_BLOCK) THEN
       GO_BLOCK(:GLOBAL.ALUM_CALLED_BLOCK);
     END IF;
   END IF;
   :SYSTEM.MESSAGE_LEVEL := '0'; 
   RETURN;
END IF;
IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN
   DO_KEY('NEXT_BLOCK');
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Apaiden_TaskStarted(EventObject args)
		{
			
				// 
				//  The SETMENU procedure below is to enable the menu block functions
				//  in menu gumeval (attached to this form). Gumeval is used to provide
				//  an Action.Select function to exit-with-value (spraddr_atyp_code)
				//  when called from another form. The pre-form trigger conditionally
				//  enables/disables the action.select menu pick and the Select button.
				// 
				// 
				//  The SETMENU procedure below is to enable the menu block functions
				//  in menu gumeval (attached to this form). Gumeval is used to provide
				//  an Action.Select function to exit-with-value (spraddr_atyp_code)
				//  when called from another form. The pre-form trigger conditionally
				//  enables/disables the action.select menu pick and the Select button.
				// 
				getTask().getGoqrpls().gSetmenu(toStr("main.block"), toNumber(1));
				getTask().getGoqrpls().gSetmenu(toStr("action.select"), toNumber(0));
				// 
				getTask().getGoqrpls().gSetWinProperty();
				// 
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PRODUCT_IND", toStr("A"));
				setDefaultValue("", "GLOBAL.NAVIGATE_TO_TAB");
				getTask().getGoqrpls().gSetInstProperty();
				showView("G$_IDEN_TAB_CANVAS");
				// F2J_NOT_SUPPORTED : The property "VIEW's DISPLAY_POSITION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
				//				SupportClasses.FORMS4W.SetViewProperty("G$_IDEN_TAB_CANVAS", SupportClasses.Property.DISPLAY_POSITION, 0, 85);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VIEW's DISPLAY_POSITION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
				
				
				// SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',HEIGHT,357);
				executeAction("DISABLE_TAB_PAGES");
				if ( getGlobal("ALUM_CALLED_FORM").equals("Y") )
				{
					getTask().getGoqrpls().gSetmenu(toStr("action.select"), toNumber(1));
					setItemEnabled("SPRADDR_5_EXITVALUE_BTN", true);
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					goBlock(toStr("SPRIDEN_CURRENT"));
					executeQuery();
					if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("BIO_TAB")).notEquals("N") )
					{
						goBlock(toStr("SPBPERS"));
						executeQuery();
						goBlock(toStr("GORPRAC"));
						executeQuery();
					}
					if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("ADDRESS_TAB")).notEquals("N") )
					{
						goBlock(toStr("SPRADDR"));
						executeQuery();
					}
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
					executeAction("ENABLE_TAB_PAGES");
					getTask().getGoqrpls().gCheckFailure();
					if ( !getGlobal("ALUM_CALLED_BLOCK").isNull() )
					{
						if ( this.getTask().getServices().canNavigateToBlock(getGlobal("ALUM_CALLED_BLOCK")).getValue() )
						{
							goBlock(getGlobal("ALUM_CALLED_BLOCK"));
						}
					}
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					return ;
				}
				if ( getGlobal("FORM_WAS_CALLED").equals("Y") )
				{
					executeAction(KeyFunction.NEXT_BLOCK);
				}
				
				if(getFormModel().getKeyBlock().getDonrCat().isNull())
				{
					setItemVisible("DONR_CAT_LBT", false);
					
				}
				if(getFormModel().getKeyBlock().getDonrCat().isNotNull())
				{
					setItemVisible("DONR_CAT_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *This trigger will execute the menu trigger.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Apaiden_FormKeyMenu()
		{
			
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.KEY-CLRFRM
		    EXECUTE_TRIGGER( 'CLRFRM_TRIGGER' ) ;
   G$_CHECK_FAILURE ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Apaiden_ClearTask()
		{
			
				executeAction("CLRFRM_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.PRE-UPDATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK ;
--
   :WORKDATE := SUBSTR(:WORKDATE, 1, 7) ;
--
   :WORKDATE := LPAD(:WORKDATE, 15, :WORKDATE || '.') ;
--
   :WORKDATE := RPAD(:WORKDATE, 29, '_ACTIVITY_DATE') ;
--
   COPY( :CURRENT_DATE, :WORKDATE ) ;
		*/
		/*
		 *<p>
		 *This trigger will update the activity date with the current date for the

		 *current block and row.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Apaiden_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
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

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.POST_FORM_TRG
		    :GLOBAL.PRODUCT_IND := '' ;
   

		*/
		/*
		 *<p>
		 *This trigger will copy the current key value back to the global fields.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Apaiden_PostFormTrg()
		{
			
				setGlobal("PRODUCT_IND", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.WHEN-TAB-PAGE-CHANGED
		 DECLARE
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN
	  validate(item_scope);
	IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
	END IF;
  IF tab_topmost = 'CURRENT_ID_TAB' THEN
  	-- PLU-LWS Disable Household Tab is already built-in to trigger
    EXECUTE_TRIGGER('MNU_OPT_BLK_CURRENT');
    G$_CHECK_FAILURE;    
    HOUSEHOLD_ITEMS_DISABLE;
  ELSIF tab_topmost = 'ALTERNATE_ID_TAB' THEN
  	-- PLU-LWS Disable Household Tab
    EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
    G$_CHECK_FAILURE;		
    EXECUTE_TRIGGER('MNU_OPT_BLK_PREVIOUS');
    G$_CHECK_FAILURE;
  ELSIF tab_topmost = 'ADDRESS_TAB' THEN
  	EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS');
  	G$_CHECK_FAILURE ;
    EXECUTE_TRIGGER('MNU_OPT_ADDRESS');
    G$_CHECK_FAILURE;
    HOUSEHOLD_ITEMS_DISABLE;
  ELSIF tab_topmost = 'TELEPHONE_TAB' THEN
  	-- PLU-LWS Disable Household Tab
    EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
    G$_CHECK_FAILURE;		
    EXECUTE_TRIGGER('MNU_OPT_SHOW_PHONES');
    G$_CHECK_FAILURE;
  ELSIF tab_topmost = 'BIO_TAB' THEN
  	-- PLU-LWS Disable Household Tab
    EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
    G$_CHECK_FAILURE;		
    EXECUTE_TRIGGER('MNU_CALL_APAPERS');
    G$_CHECK_FAILURE;
  ELSIF tab_topmost = 'ADDITIONAL_ID_TAB' THEN
  	-- PLU-LWS Disable Household Tab
    EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
    G$_CHECK_FAILURE;		
    EXECUTE_TRIGGER('MNU_OPT_ADDITIONAL_ID');
    G$_CHECK_FAILURE;
  ELSIF tab_topmost = 'EMAIL_TAB' THEN
  	-- PLU-LWS Disable Household Tab
    EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
    G$_CHECK_FAILURE;		
    EXECUTE_TRIGGER('MNU_CALL_APAEMAL');
    G$_CHECK_FAILURE;
  -- PLU-LWS Added Household_Tab option
  ELSIF tab_topmost = 'HOUSEHOLD_TAB' THEN
  	EXECUTE_TRIGGER('MNU_OPT_SHOW_HOUSEHOLD') ;
  	G$_CHECK_FAILURE ;
  END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Apaiden_tabChange()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					try{
						validateCurrentItem();
					}catch(Exception e){
						goItem(toStr(getCursorItem()));
						throw new ApplicationException(e);
					}
					
//					validateCurrentItem();
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						goItem(toStr(getCursorItem()));
//						throw new ApplicationException();
//					}
					if ( tabTopmost.equals("CURRENT_ID_TAB") )
					{
						//  PLU-LWS Disable Household Tab is already built-in to trigger
						executeAction("MNU_OPT_BLK_CURRENT");
						getTask().getGoqrpls().gCheckFailure();
						this.getTask().getServices().householdItemsDisable();
					}
					else if ( tabTopmost.equals("ALTERNATE_ID_TAB") ) {
						//  PLU-LWS Disable Household Tab
						executeAction("DISABLE_HOUSEHOLD_TAB");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_OPT_BLK_PREVIOUS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tabTopmost.equals("ADDRESS_TAB") ) {
						executeAction("ENABLE_NON_HOUSEHOLD_TABS");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_OPT_ADDRESS");
						getTask().getGoqrpls().gCheckFailure();
						this.getTask().getServices().householdItemsDisable();
					}
					else if ( tabTopmost.equals("TELEPHONE_TAB") ) {
						//  PLU-LWS Disable Household Tab
						executeAction("DISABLE_HOUSEHOLD_TAB");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_OPT_SHOW_PHONES");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tabTopmost.equals("BIO_TAB") ) {
						//  PLU-LWS Disable Household Tab
						executeAction("DISABLE_HOUSEHOLD_TAB");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_CALL_APAPERS");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tabTopmost.equals("ADDITIONAL_ID_TAB") ) {
						//  PLU-LWS Disable Household Tab
						executeAction("DISABLE_HOUSEHOLD_TAB");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_OPT_ADDITIONAL_ID");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tabTopmost.equals("EMAIL_TAB") ) {
						//  PLU-LWS Disable Household Tab
						executeAction("DISABLE_HOUSEHOLD_TAB");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("MNU_CALL_APAEMAL");
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( tabTopmost.equals("HOUSEHOLD_TAB") ) {
						executeAction("MNU_OPT_SHOW_HOUSEHOLD");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.ENABLE_TAB_PAGES
		 DECLARE
  tab_page_id TAB_PAGE;
BEGIN
  tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ALTERNATE_ID_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('ADDRESS_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ADDRESS_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','TELEPHONE_TAB');
    END IF;
  END IF;
--  IF :ENTITY_IND = 'C' THEN
--  	NULL;
--  ELSE
    tab_page_id := FIND_TAB_PAGE('BIO_TAB');
    IF NOT ID_NULL(tab_page_id) THEN
      IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','BIO_TAB');
      END IF;
    END IF;
--  END IF;
  tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','EMAIL_TAB');
    END IF;
  END IF;
--
  tab_page_id := FIND_TAB_PAGE('ADDITIONAL_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ADDITIONAL_ID_TAB');
    END IF;
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ENABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TAB_PAGES")
		public void Apaiden_EnableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDRESS_TAB"));
						}
					}
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("TELEPHONE_TAB"));
						}
					}
					//   IF :ENTITY_IND = 'C' THEN
					//   	NULL;
					//   ELSE
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("BIO_TAB"));
						}
					}
					//   END IF;
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.DISABLE_TAB_PAGES
		 DECLARE
  tab_page_id TAB_PAGE;
BEGIN
  tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ALTERNATE_ID_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('ADDRESS_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ADDRESS_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','TELEPHONE_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('BIO_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','BIO_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','EMAIL_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('ADDITIONAL_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ADDITIONAL_ID_TAB');
    END IF;
  END IF;
  --
  -- PLU-LWS 01/27/2005
  -- Added Household Tab to list of tabs to disable. Updates label, too.
  EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
  G$_CHECK_FAILURE;
  --
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.DISABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TAB_PAGES")
		public void Apaiden_DisableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDRESS_TAB"));
						}
					}
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("TELEPHONE_TAB"));
						}
					}
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("BIO_TAB"));
						}
					}
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMAIL_TAB"));
						}
					}
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
					// 
					//  PLU-LWS 01/27/2005
					//  Added Household Tab to list of tabs to disable. Updates label, too.
					executeAction("DISABLE_HOUSEHOLD_TAB");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.DISABLE_BIO_TAB
		 DECLARE
  tab_page_id TAB_PAGE;
BEGIN
  tab_page_id := FIND_TAB_PAGE('BIO_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','BIO_TAB');
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.DISABLE_BIO_TAB
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_BIO_TAB")
		public void Apaiden_DisableBioTab()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("BIO_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_SHOW_PHONES
		 <multilinecomment> GO_ITEM('SPRADDR.PHONE_AREA');
:HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
EXECUTE_TRIGGER('CHECK_PHONE_UPDATE');
G$_CHECK_FAILURE;
--
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
:GLOBAL.SECRFRM := 'SPATELE';
:HOLD_FIELD := :SYSTEM.CURRENT_FIELD;
--
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
:GLOBAL.FORM_WAS_CALLED := 'Y';
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
:GLOBAL.FORM_WAS_CALLED := 'N';
--
EXECUTE_TRIGGER('CHECK_PHONE');
G$_CHECK_FAILURE;
</multilinecomment>
--GO_BLOCK('SPRTELE');

EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
    GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPRTELE');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_SHOW_PHONES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_SHOW_PHONES")
		public void Apaiden_MnuOptShowPhones()
		{
			
				//  GO_ITEM('SPRADDR.PHONE_AREA');
				// :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
				// EXECUTE_TRIGGER('CHECK_PHONE_UPDATE');
				// G$_CHECK_FAILURE;
				// --
				// :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
				// :GLOBAL.SECRFRM := 'SPATELE';
				// :HOLD_FIELD := :SYSTEM.CURRENT_FIELD;
				// --
				// EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
				// G$_CHECK_FAILURE;
				// :GLOBAL.FORM_WAS_CALLED := 'Y';
				// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
				// :GLOBAL.FORM_WAS_CALLED := 'N';
				// --
				// EXECUTE_TRIGGER('CHECK_PHONE');
				// G$_CHECK_FAILURE;
				// GO_BLOCK('SPRTELE');
				//  GO_ITEM('SPRADDR.PHONE_AREA');
				// :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
				// EXECUTE_TRIGGER('CHECK_PHONE_UPDATE');
				// G$_CHECK_FAILURE;
				// --
				// :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
				// :GLOBAL.SECRFRM := 'SPATELE';
				// :HOLD_FIELD := :SYSTEM.CURRENT_FIELD;
				// --
				// EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
				// G$_CHECK_FAILURE;
				// :GLOBAL.FORM_WAS_CALLED := 'Y';
				// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
				// :GLOBAL.FORM_WAS_CALLED := 'N';
				// --
				// EXECUTE_TRIGGER('CHECK_PHONE');
				// G$_CHECK_FAILURE;
				// GO_BLOCK('SPRTELE');
			
				try{
					executeAction("CHECK_TO_SAVE");
					goBlock(toStr("SPRTELE"));
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					executeQuery();
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}catch(Exception e){
					goItem(toStr(getCursorItem()));
					throw new ApplicationException(e);
				}
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("SPRTELE"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_ADDITIONAL_ID
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
    GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('GORADID');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_ADDITIONAL_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_ADDITIONAL_ID")
		public void Apaiden_MnuOptAdditionalId(){
			try{
				executeAction("CHECK_TO_SAVE");
				
			}catch(Exception e){
				goItem(toStr(getCursorItem()));
				throw new ApplicationException(e);
			}
			goBlock(toStr("GORADID"));
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
			executeQuery();
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("GORADID"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.CHECK_FINAID
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CHECK_FINAID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_FINAID")
		public void Apaiden_CheckFinaid()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.CHECK_TO_SAVE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TO_SAVE")
		public void Goqclib_CheckToSave(){
			
				getGoqclibFormController().CheckToSave();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY_NXTBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTBLOCK_TRG")
		public void Goqclib_KeyNxtblockTrg(){
			
				getGoqclibFormController().KeyNxtblockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.KEY_PRVBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_PRVBLOCK_TRG")
		public void Goqclib_KeyPrvblockTrg()
		{
			
				getGoqclibFormController().KeyPrvblockTrg();
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_CALL_APAEMAL
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
    GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('GOREMAL');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_CALL_APAEMAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_CALL_APAEMAL")
		public void Apaiden_MnuCallApaemal()
		{
			
			try{
				executeAction("CHECK_TO_SAVE");
				goBlock(toStr("GOREMAL"));
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}catch(Exception e){
				goItem(toStr(getCursorItem()));
				throw new ApplicationException(e);
			}
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("GOREMAL"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_BLK_CURRENT
		 DECLARE
	 boo_household_tab boolean;
BEGIN
   -- PLU-LWS If we are coming to the current ID block as a result of using the option menu
   -- from the APTADDR block (or either of the two buttons from there) 
   -- then clean-up APTADDR table.
   --
   -- This catches the four buttons AND the block name
   boo_household_tab := (INSTR(:SYSTEM.CURRENT_ITEM,'APTADDR') > 0);
   IF boo_household_tab THEN  
      --
      REMOVE_HOUSEHOLD_TEMP_RECS;
      CLEAR_BLOCK(NO_VALIDATE);
      EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS') ;
      G$_CHECK_FAILURE;
      --
   END IF;
   --
   EXECUTE_TRIGGER('CHECK_TO_SAVE');
   IF NOT FORM_SUCCESS THEN
      GO_ITEM(:SYSTEM.CURSOR_ITEM);
      RAISE FORM_TRIGGER_FAILURE;
   ELSE
      GO_BLOCK('SPRIDEN_CURRENT');
      :SYSTEM.MESSAGE_LEVEL := '5';
      EXECUTE_QUERY;
      :SYSTEM.MESSAGE_LEVEL := '0';
      --IF boo_household_tab THEN
      	   EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
      --END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_BLK_CURRENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_BLK_CURRENT")
		public void Apaiden_MnuOptBlkCurrent()
		{
			
				{
					NBool booHouseholdTab= NBool.getNull();
					//  PLU-LWS If we are coming to the current ID block as a result of using the option menu
					//  from the APTADDR block (or either of the two buttons from there) 
					//  then clean-up APTADDR table.
					// 
					//  This catches the four buttons AND the block name
					booHouseholdTab = toBool(((inStr(toStr(getCurrentItem()), toStr("APTADDR")).greater(0))));
					if ( booHouseholdTab.getValue() )
					{
						// 
						this.getTask().getServices().removeHouseholdTempRecs();
						clearBlock(TaskServices.NO_VALIDATE);
						executeAction("ENABLE_NON_HOUSEHOLD_TABS");
						getTask().getGoqrpls().gCheckFailure();
					}
					// 
					try{
						executeAction("CHECK_TO_SAVE");
						goBlock(toStr("SPRIDEN_CURRENT"));
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
						executeQuery();
						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
						executeAction("DISABLE_HOUSEHOLD_TAB");
					}catch(Exception e){
						goItem(toStr(getCursorItem()));
						throw new ApplicationException(e);
					}
					
//					executeAction("CHECK_TO_SAVE");
//					if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						goItem(toStr(getCursorItem()));
//						throw new ApplicationException();
//					}
//					else {
//						goBlock(toStr("SPRIDEN_CURRENT"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						executeQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//						// IF boo_household_tab THEN
//						executeAction("DISABLE_HOUSEHOLD_TAB");
//					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.GLOBAL_ID_ERASE
		 	IF :KEY_BLOCK.ID IS NOT NULL
	AND gb_common.f_id_exists(:KEY_BLOCK.ID) = 'N' THEN
		:key_block.id := null;
    :GLOBAL.KEY_IDNO := null;
	END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.GLOBAL_ID_ERASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_ID_ERASE")
		public void Apaiden_GlobalIdErase()
		{
			
				if ( !getFormModel().getKeyBlock().getId().isNull() && GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N") )
				{
					getFormModel().getKeyBlock().setId(toStr(null));
					setGlobal("KEY_IDNO", toStr(null));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.GO_ADDR_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_ADDR_FORM")
		public void Goqclib_GoAddrForm()
		{
			
				getGoqclibFormController().GoAddrForm();
		}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.POST-INSERT
		 NULL;
<multilinecomment>
DECLARE
  tab_page_id TAB_PAGE;
BEGIN
	IF :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
    tab_page_id := FIND_TAB_PAGE('BIO_TAB');
    IF NOT ID_NULL(tab_page_id) THEN
      IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
        SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_FALSE);
      END IF;
    END IF;
  END IF;
END;
</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterRowInsert
		public void Apaiden_AfterRowInsert(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.BIO_TAB_WARNING
		 DECLARE
  ALERT_ID         ALERT;
  AL_NAME          VARCHAR2(40);
  ALERT_BUT        NUMBER;
  ALERT_STRING     VARCHAR2(120);
  ALERT_FORM       VARCHAR2(20);
BEGIN 
  ALERT_ID := FIND_ALERT('BIO_TAB_ALERT');
  ALERT_BUT := SHOW_ALERT(ALERT_ID);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.BIO_TAB_WARNING
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BIO_TAB_WARNING")
		public void Apaiden_BioTabWarning()
		{
			
				{
					AlertDescriptor alertId= null;
					NString alName= NString.getNull();
					NNumber alertBut= NNumber.getNull();
					NString alertString= NString.getNull();
					NString alertForm= NString.getNull();
					alertId = findAlert("BIO_TAB_ALERT");
					alertBut = toNumber(showAlert(alertId));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.VALIDATE_ID
		 DECLARE
	lv_cm_status VARCHAR2(4) := NULL;
	hold_keyblock_id  VARCHAR(9);
BEGIN	
	-- Clear ID and Spouse fields
  :FULL_NAME := '';
  :CONFID_IND := '';
  :DECEASED_IND := '';
  :ENTITY_IND := '';
  :DONR_CAT := '';
  :PREF_CLASS := '';
  :SPS_IDNO := ''; 
  :SPS_NAME := '';
  :SPS_DECEASED_IND := '';
  :SPS_DONR_CAT := '';
  :SPS_PREF_CLASS := '';

  IF :ID IS NULL THEN 
    a$_sel_id_info;
    G$_CHECK_FAILURE;
	  RETURN;
  END IF;

  IF :ID = 'NEXT' THEN
    IF ((gokfgac.f_spriden_pii_active = 'N') AND (GB_COMMON.F_ID_EXISTS(:ID) = 'N'))
    OR (gokfgac.f_spriden_pii_active = 'Y' AND NOT G$_VERIFY_ID_EXISTS(:ID)) THEN
      MESSAGE( G$_NLS.Get('APAIDEN-0022', 'FORM','*ERROR* NEXT is not valid for this form.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;  
  END IF;
  hold_keyblock_id := :KEY_BLOCK.ID ;
  IF :ID = 'GENERATED' THEN
	  P_CLEAR_ID_FIELDS;
	  lv_cm_status := G$_INVOKE_CM;
	  IF lv_cm_status = 'NULL' THEN
    	MESSAGE( G$_NLS.Get('APAIDEN-0023', 'FORM', 
        '*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching',USER) );
      :KEY_BLOCK.ID := hold_keyblock_id ;
    	RAISE form_trigger_failure;
    END IF;	
  END IF;	
--
-- Initialize the PIDM to null to ensure that a
-- previous PIDM does not get used for a different (changed) ID.
-- Check for an id change.
--
  :KEY_BLOCK.PIDM :=  NULL;
-- -- --
-- -- --
  IF (NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND 
  	  G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'YES') AND
  	  G$_VERIFY_ID_AS_SSN(:ID) THEN
-- -- ID is found as an SSN and want to fall thru to ID exists and execute G$_VALID_ALL_ID (a$_sel_id_info)
    NULL;
-- -- --
-- -- --
  ELSIF ((gokfgac.f_spriden_pii_active = 'N') AND (GB_COMMON.F_ID_EXISTS(:ID) = 'N'))
  OR (gokfgac.f_spriden_pii_active = 'Y' AND NOT G$_VERIFY_ID_EXISTS(:ID)) 
  OR :MANUAL_CM_CALL = 'Y' THEN
    IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND
    	 gokfgac.f_spriden_pii_active = 'Y'             AND
    	 gokfgac.f_is_user_exempt = 'N'                 AND
    	 G$_VERIFY_SSN_EXISTS(:ID)                      THEN
      MESSAGE(G$_NLS.Get('APAIDEN-0024','FORM','*ERROR* You do not have permission to view this ID.'));
      RAISE FORM_TRIGGER_FAILURE;
    ELSE	
    -- Attemp creating a new ID
      lv_cm_status := G$_INVOKE_CM;
      IF lv_cm_status = 'NULL' THEN
      	MESSAGE( G$_NLS.Get('APAIDEN-0025', 'FORM', 
        '*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching',USER) );
        :KEY_BLOCK.ID := hold_keyblock_id ;
    	  RAISE form_trigger_failure;
      ELSIF lv_cm_status = 'SKIP' THEN
    	  RETURN;
      END IF;
    END IF;
  END IF;	
  
  -- ID exists. 
  :HOLD_KEY_IDNO_FOR_ALERTS := :GLOBAL.KEY_IDNO;
  a$_sel_id_info;
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('A$_CHECK_USER_ALERTS');
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.VALIDATE_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_ID")
		public void Apaiden_ValidateId()
		{
			
				{
					NString lvCmStatus = NString.getNull();
					NString holdKeyblockId= NString.getNull();
					//  Clear ID and Spouse fields
					getFormModel().getKeyBlock().setFullName(toStr(""));
					getFormModel().getKeyBlock().setConfidInd(toStr(""));
					getFormModel().getKeyBlock().setDeceasedInd(toStr(""));
					getFormModel().getKeyBlock().setEntityInd(toStr(""));
					getFormModel().getKeyBlock().setDonrCat(toStr(""));
					getFormModel().getKeyBlock().setPrefClass(toStr(""));
					getFormModel().getKeyBlock().setSpsIdno(toStr(""));
					getFormModel().getKeyBlock().setSpsName(toStr(""));
					getFormModel().getKeyBlock().setSpsDeceasedInd(toStr(""));
					getFormModel().getKeyBlock().setSpsDonrCat(toStr(""));
					getFormModel().getKeyBlock().setSpsPrefClass(toStr(""));
					if ( getFormModel().getKeyBlock().getId().isNull() )
					{
						getTask().getAoqrpls().aSelIdInfo();
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
					if ( getFormModel().getKeyBlock().getId().equals("NEXT") )
					{
						if ( ((Gokfgac.fSpridenPiiActive().equals("N")) && (GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N"))) || (Gokfgac.fSpridenPiiActive().equals("Y") && getTask().getGoqrpls().gVerifyIdExists(getFormModel().getKeyBlock().getId()).not()) )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0022"), toStr("FORM"), toStr("*ERROR* NEXT is not valid for this form.")));
							throw new ApplicationException();
						}
					}
					holdKeyblockId = getFormModel().getKeyBlock().getId();
					if ( getFormModel().getKeyBlock().getId().equals("GENERATED") )
					{
						this.getTask().getServices().pClearIdFields();
						lvCmStatus = getTask().getGoqrpls().gInvokeCm();
						if ( lvCmStatus.equals("NULL") )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0023"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching"), getUser()));
							getFormModel().getKeyBlock().setId(holdKeyblockId);
							throw new ApplicationException();
						}
					}
					// 
					//  Initialize the PIDM to null to ensure that a
					//  previous PIDM does not get used for a different (changed) ID.
					//  Check for an id change.
					// 
					getFormModel().getKeyBlock().setPidm(toNumber(null));
					//  -- --
					//  -- --
					
					if ( (getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("YES")) && getTask().getGoqrpls().gVerifyIdAsSsn(getFormModel().getKeyBlock().getId()).getValue() )
					{
						//  -- ID is found as an SSN and want to fall thru to ID exists and execute G$_VALID_ALL_ID (a$_sel_id_info)
					}
					else if ( ((Gokfgac.fSpridenPiiActive().equals("N")) && (GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N"))) || (Gokfgac.fSpridenPiiActive().equals("Y") && getTask().getGoqrpls().gVerifyIdExists(getFormModel().getKeyBlock().getId()).not()) || getFormModel().getKeyBlock().getManualCmCall().equals("Y") ) {
						if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && Gokfgac.fSpridenPiiActive().equals("Y") && Gokfgac.fIsUserExempt().equals("N") && getTask().getGoqrpls().gVerifySsnExists(getFormModel().getKeyBlock().getId()).getValue() )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0024"), toStr("FORM"), toStr("*ERROR* You do not have permission to view this ID.")));
							throw new ApplicationException();
						}
						else {
							//  Attemp creating a new ID
							lvCmStatus = getTask().getGoqrpls().gInvokeCm();
							if ( lvCmStatus.equals("NULL") )
							{
								errorMessage(GNls.Fget(toStr("APAIDEN-0025"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching"), getUser()));
								getFormModel().getKeyBlock().setId(holdKeyblockId);
								throw new ApplicationException();
							}
							else if ( lvCmStatus.equals("SKIP") ) {
								return ;
							}
						}
					}
					//  ID exists. 
					getFormModel().getFormHeader().setHoldKeyIdnoForAlerts(getGlobal("KEY_IDNO"));
					getTask().getAoqrpls().aSelIdInfo();
					getTask().getGoqrpls().gCheckFailure();
					executeAction("A$_CHECK_USER_ALERTS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_CALL_CM
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
:GLOBAL.KEY_IDNO  := :KEY_BLOCK.ID;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'GOAMTCH','');
:GLOBAL.FORM_WAS_CALLED := '';
IF :GLOBAL.KEY_IDNO is not null then
   :KEY_BLOCK.ID  := :GLOBAL.KEY_IDNO;
END IF;

  a$_sel_id_info;
  G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_CALL_CM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_CALL_CM")
		public void Apaiden_MnuOptCallCm()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GOAMTCH"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				if ( !getGlobal("KEY_IDNO").isNull() )
				{
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				}
				//MORPHIS TODO MP needs confirmation on what this is.
				//aSelIdInfo;
				getTask().getAoqrpls().aSelIdInfo();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.DISABLE_HOUSEHOLD_TAB
		 -- PLU-LWS  02/02/2005
-- Household Enhancement.
DECLARE
  tab_page_id TAB_PAGE;
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
  household_member_text APTADDR.APTADDR_STREET_LINE1%TYPE := g$_nls.get('APAIDEN-0026','FORM','Household Members');
BEGIN
  tab_page_id := FIND_TAB_PAGE('HOUSEHOLD_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
 	    REMOVE_HOUSEHOLD_TEMP_RECS;
      IF GET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',LABEL) <> household_member_text THEN
         SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, g$_nls.get('APAIDEN-0027','FORM','Household Members'));
      END IF;
      -- Added OR for cases where navigation is through Options.
      IF tab_topmost = 'CURRENT_ID_TAB' THEN
        G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','HOUSEHOLD_TAB');
      ELSIF tab_topmost = 'HOUSEHOLD_TAB' THEN
      	 IF :SYSTEM.CURRENT_BLOCK = 'SPRIDEN_CURRENT' THEN
           G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','HOUSEHOLD_TAB');
      	 END IF;
      ELSE
        --Begin defect#1-EGN672  added IF-ELSE condition
        IF tab_topmost = 'ADDRESS_TAB' AND :APTADDR_HEADER.HOUSEHOLD_COUNT > 0 THEN 
      		   SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, g$_nls.get('APAIDEN-0028','FORM','Household Members (%01%)',
   	                         :APTADDR_HEADER.HOUSEHOLD_COUNT ));
        ELSE
        --End defect#1-EGN672  added IF-ELSE condition
             G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','HOUSEHOLD_TAB');
      	END IF; 
      END IF;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.DISABLE_HOUSEHOLD_TAB
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_HOUSEHOLD_TAB")
		public void Apaiden_DisableHouseholdTab()
		{
			
				//  PLU-LWS  02/02/2005
				//  Household Enhancement.
				{
					TabPageDescriptor tabPageId= null;
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					NString householdMemberText = GNls.Fget(toStr("APAIDEN-0026"), toStr("FORM"), toStr("Household Members"));
					tabPageId = findTabPage("HOUSEHOLD_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("true") )
						{
							this.getTask().getServices().removeHouseholdTempRecs();
							if ( getTabPageLabel("HOUSEHOLD_TAB").notEquals(householdMemberText) )
							{
								setTabPageLabel("HOUSEHOLD_TAB", GNls.Fget(toStr("APAIDEN-0027"), toStr("FORM"), toStr("Household Members")));
							}
							//  Added OR for cases where navigation is through Options.
							if ( tabTopmost.equals("CURRENT_ID_TAB") )
							{
								getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("HOUSEHOLD_TAB"));
							}
							else if ( tabTopmost.equals("HOUSEHOLD_TAB") ) {
								if ( getCurrentBlock().equals("SPRIDEN_CURRENT") )
								{
									getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("HOUSEHOLD_TAB"));
								}
							}
							else {
								// Begin defect#1-EGN672  added IF-ELSE condition
								if ( tabTopmost.equals("ADDRESS_TAB") && getFormModel().getAptaddrHeader().getHouseholdCount().greater(toStr(0)) )
								{
									setTabPageLabel("HOUSEHOLD_TAB", GNls.Fget(toStr("APAIDEN-0028"), toStr("FORM"), toStr("Household Members (%01%)"), getFormModel().getAptaddrHeader().getHouseholdCount()));
								}
								else {
									// End defect#1-EGN672  added IF-ELSE condition
									getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("HOUSEHOLD_TAB"));
								}
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_SHOW_HOUSEHOLD
		 BEGIN
  --
  -- PLU-LWS Make sure it is safe to move to the Household Tab
  --
  EXECUTE_TRIGGER('CHECK_TO_SAVE');
  IF NOT FORM_SUCCESS THEN
  	  GO_BLOCK('SPRADDR');
  	  RAISE FORM_TRIGGER_FAILURE ;
  END IF;
  --
  IF :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
		   GO_BLOCK('SPRADDR');
		   MESSAGE( G$_NLS.Get('APAIDEN-0029', 'FORM', '*WARNING* The Household Members tab is unavailable to non-persons.'));
		   RAISE FORM_TRIGGER_FAILURE ;  	
  -- CHECK_TO_SAVE trigger above will check for these things below.		   
<multilinecomment>		   
	ELSIF GET_RECORD_PROPERTY(:SYSTEM.CURSOR_RECORD,'SPRADDR',STATUS) = 'CHANGED'  THEN
		   GO_BLOCK('SPRADDR');
		   MESSAGE( G$_NLS.Get('APAIDEN-nnnn', 'FORM', '*WARNING* Save your changes before updating household information.'));
		   RAISE FORM_TRIGGER_FAILURE ;
	ELSIF GET_RECORD_PROPERTY(:SYSTEM.CURSOR_RECORD,'SPRADDR',STATUS) = 'NEW' THEN
		   GO_BLOCK('SPRADDR');
		   MESSAGE(G$_NLS.Get('APAIDEN-nnnn', 'FORM', '*WARNING* Finish and save your new record before updating household information.'));
		   RAISE FORM_TRIGGER_FAILURE ;
	ELSIF GET_RECORD_PROPERTY(:SYSTEM.CURSOR_RECORD,'SPRADDR',STATUS) = 'INSERT' THEN
		   GO_BLOCK('SPRADDR');
		   MESSAGE(G$_NLS.Get('APAIDEN-nnnn', 'FORM', '*WARNING* Finish your new record before updating household information.'));
		   RAISE FORM_TRIGGER_FAILURE ;
</multilinecomment>		   
	ELSIF CURRENT_ADDRESS_INACTIVE THEN
		   GO_BLOCK('SPRADDR');
			 MESSAGE(G$_NLS.Get('APAIDEN-0030', 'FORM', '*WARNING* Household maintenance is not available for inactive or future dated addresses.'));
			 RAISE FORM_TRIGGER_FAILURE ;
	ELSIF SELECT_APTADDR_IN_USE THEN
		   GO_BLOCK('SPRADDR');
		   MESSAGE(G$_NLS.Get('APAIDEN-0031', 'FORM', '*WARNING* This record or household member record is being reviewed or updated by %01% (%02%-%03%)', 
		           :APTADDR_HEADER.ADDR_IN_USE_USER, F_GETSPRIDENID(:APTADDR_HEADER.ADDR_IN_USE_PIDM), :APTADDR_HEADER.ADDR_IN_USE_NAME_LF30));
		   RAISE FORM_TRIGGER_FAILURE ;
  ELSIF :APTADDR_HEADER.HOUSEHOLD_COUNT = -1 THEN 
		   GO_BLOCK('SPRADDR');
		   MESSAGE(G$_NLS.Get('APAIDEN-0032', 'FORM', '*WARNING* Current person is deceased.  Household address maintenance is not available for deceased persons.'));
		   RAISE FORM_TRIGGER_FAILURE ;  
  ELSIF GET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED) = 'FALSE' THEN
		   GO_BLOCK('SPRADDR') ;
		   MESSAGE(G$_NLS.Get('APAIDEN-0033', 'FORM', '*WARNING* Household address maintenance is not available for this person.'));
		   RAISE FORM_TRIGGER_FAILURE ;  
  ELSE
		   EXECUTE_TRIGGER('DISABLE_NON_HOUSEHOLD_TABS') ;
       G$_CHECK_FAILURE;
       --
       SET_BLOCK_PROPERTY('APTADDR', DELETE_ALLOWED, PROPERTY_TRUE);
       SET_BLOCK_PROPERTY('APTADDR', INSERT_ALLOWED, PROPERTY_TRUE);
       
		   -- Make sure we don't have any records in the temporary table from this session already
		   
		   HOUSEHOLD_ITEMS_ENABLE;
		   
		   GO_BLOCK('APTADDR');
       REMOVE_HOUSEHOLD_TEMP_RECS;
       CLEAR_BLOCK(NO_VALIDATE);
       --
       POPULATE_HOUSEHOLD_TEMP_RECS;
       SET_BLOCK_PROPERTY('APTADDR', DELETE_ALLOWED, PROPERTY_FALSE);
       SET_BLOCK_PROPERTY('APTADDR', INSERT_ALLOWED, PROPERTY_FALSE);
  END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_SHOW_HOUSEHOLD
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_SHOW_HOUSEHOLD")
		public void Apaiden_MnuOptShowHousehold()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				// 
				//  PLU-LWS Make sure it is safe to move to the Household Tab
				// 
				try{
					executeAction("CHECK_TO_SAVE");
				}catch(Exception e){
					goBlock(toStr("SPRADDR"));
					throw new ApplicationException(e);
				}
				
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goBlock(toStr("SPRADDR"));
//					throw new ApplicationException();
//				}
				// 
				if ( spridenCurrentElement.getSpridenEntityInd().equals("C") )
				{
					goBlock(toStr("SPRADDR"));
					warningMessage(GNls.Fget(toStr("APAIDEN-0029"), toStr("FORM"), toStr("*WARNING* The Household Members tab is unavailable to non-persons.")));
					throw new ApplicationException();
				}
				else if ( this.getTask().getServices().currentAddressInactive(spraddrElement).getValue() ) {
					goBlock(toStr("SPRADDR"));
					warningMessage(GNls.Fget(toStr("APAIDEN-0030"), toStr("FORM"), toStr("*WARNING* Household maintenance is not available for inactive or future dated addresses.")));
					throw new ApplicationException();
				}
				else if ( this.getTask().getServices().selectAptaddrInUse(spraddrElement).getValue() ) {
					goBlock(toStr("SPRADDR"));
					warningMessage(GNls.Fget(toStr("APAIDEN-0031"), toStr("FORM"), toStr("*WARNING* This record or household member record is being reviewed or updated by %01% (%02%-%03%)"), getFormModel().getAptaddrHeader().getAddrInUseUser(), StoredProcedures.fGetspridenid(toNumber(getFormModel().getAptaddrHeader().getAddrInUsePidm()), NNumber.getNull(), NNumber.getNull()), getFormModel().getAptaddrHeader().getAddrInUseNameLf30()));
					throw new ApplicationException();
				}
				else if ( getFormModel().getAptaddrHeader().getHouseholdCount().equals(- (1)) ) {
					goBlock(toStr("SPRADDR"));
					warningMessage(GNls.Fget(toStr("APAIDEN-0032"), toStr("FORM"), toStr("*WARNING* Current person is deceased.  Household address maintenance is not available for deceased persons.")));
					throw new ApplicationException();
				}
				else if ( toStr(getTabPageEnabled("HOUSEHOLD_TAB")).equals("FALSE") ) {
					goBlock(toStr("SPRADDR"));
					warningMessage(GNls.Fget(toStr("APAIDEN-0033"), toStr("FORM"), toStr("*WARNING* Household address maintenance is not available for this person.")));
					throw new ApplicationException();
				}
				else {
					executeAction("DISABLE_NON_HOUSEHOLD_TABS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					setBlockDeleteAllowed("APTADDR", true);
					setBlockInsertAllowed("APTADDR", true);
					//  Make sure we don't have any records in the temporary table from this session already
					this.getTask().getServices().householdItemsEnable();
					goBlock(toStr("APTADDR"));
					this.getTask().getServices().removeHouseholdTempRecs();
					clearBlock(TaskServices.NO_VALIDATE);
					// 
					this.getTask().getServices().populateHouseholdTempRecs(spraddrElement, spridenCurrentElement);
					setBlockDeleteAllowed("APTADDR", false);
					setBlockInsertAllowed("APTADDR", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.DISABLE_NON_HOUSEHOLD_TABS
		 DECLARE
  tab_page_id TAB_PAGE;
BEGIN
--PLU-LWS Leave the CURRENT_ID_TAB active.
--  tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
--  IF NOT ID_NULL(tab_page_id) THEN
--    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
--      SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_FALSE);
--    END IF;
--  END IF;
  tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ALTERNATE_ID_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','TELEPHONE_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('BIO_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','BIO_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','EMAIL_TAB');
    END IF;
  END IF;
--
  tab_page_id := FIND_TAB_PAGE('ADDITIONAL_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ADDITIONAL_ID_TAB');
    END IF;
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.DISABLE_NON_HOUSEHOLD_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_NON_HOUSEHOLD_TABS")
		public void Apaiden_DisableNonHouseholdTabs()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					// PLU-LWS Leave the CURRENT_ID_TAB active.
					//   tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
					//   IF NOT ID_NULL(tab_page_id) THEN
					//     IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
					//       SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_FALSE);
					//     END IF;
					//   END IF;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("TELEPHONE_TAB"));
						}
					}
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("BIO_TAB"));
						}
					}
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("TRUE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.ENABLE_NON_HOUSEHOLD_TABS
		 DECLARE
  tab_page_id TAB_PAGE;
BEGIN
--  tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
--  IF NOT ID_NULL(tab_page_id) THEN
--    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
--      SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
--    END IF;
--  END IF;
  tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ALTERNATE_ID_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','TELEPHONE_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('BIO_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','BIO_TAB');
    END IF;
  END IF;
  tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','EMAIL_TAB');
    END IF;
  END IF;
--
  tab_page_id := FIND_TAB_PAGE('ADDITIONAL_ID_TAB');
  IF NOT ID_NULL(tab_page_id) THEN
    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ADDITIONAL_ID_TAB');
    END IF;
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.ENABLE_NON_HOUSEHOLD_TABS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_NON_HOUSEHOLD_TABS")
		public void Apaiden_EnableNonHouseholdTabs()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					//   tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
					//   IF NOT ID_NULL(tab_page_id) THEN
					//     IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
					//       SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
					//     END IF;
					//   END IF;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("TELEPHONE_TAB"));
						}
					}
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("BIO_TAB"));
						}
					}
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( toStr(getTabPageEnabled(tabPageId)).equals("FALSE") )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APAIDEN.MNU_OPT_FRM_APAEHIS
		 EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
G$_CHECK_FAILURE ;
:GLOBAL.SECRFRM := 'APAEHIS' ;
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
IF :GLOBAL.ADDR_ATYP_CODE IS NOT NULL AND
	 :GLOBAL.ATYP_SEQNO IS NOT NULL THEN 
   :GLOBAL.FORM_WAS_CALLED := 'Y';
ELSE
	 :GLOBAL.FORM_WAS_CALLED := '';
END IF;   
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APAEHIS','');
:GLOBAL.FORM_WAS_CALLED := '';
G$_SET_INST_PROPERTY;
:PREFERRED_RECORD_NUMBER := '';
EXECUTE_TRIGGER('SET_CHECK_BOXES');
G$_CHECK_FAILURE;







		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APAIDEN.MNU_OPT_FRM_APAEHIS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_OPT_FRM_APAEHIS")
		public void Apaiden_MnuOptFrmApaehis()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SECRFRM", toStr("APAEHIS"));
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				if ( !getGlobal("ADDR_ATYP_CODE").isNull() && !getGlobal("ATYP_SEQNO").isNull() )
				{
					setGlobal("FORM_WAS_CALLED", toStr("Y"));
				}
				else {
					setGlobal("FORM_WAS_CALLED", toStr(""));
				}
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APAEHIS"), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				getTask().getGoqrpls().gSetInstProperty();
				getFormModel().getKeyBlock().setPreferredRecordNumber(toNumber(""));
				executeAction("SET_CHECK_BOXES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
