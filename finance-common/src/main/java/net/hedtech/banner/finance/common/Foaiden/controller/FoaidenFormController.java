package net.hedtech.banner.finance.common.Foaiden.controller;
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;
import net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqclib.model.SprteleAdapter;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class FoaidenFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	private GoqclibFormController getGoqclibFormController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("GOQCLIB");
	}	
	
	
	public FoaidenFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public FoaidenTask getTask() {
		return (FoaidenTask)super.getTask();
	}
	
	
	public FoaidenModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Foaiden_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Foaiden_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Foaiden_BannerXeSendContext()
		{
			
				getGFormClass().bannerXeSendContext();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-CUSTOM-JAVASCRIPT-EVENT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-CUSTOM-JAVASCRIPT-EVENT")
		public void Foaiden_WhenCustomJavascriptEvent()
		{
			
				getGFormClass().WhenCustomJavascriptEvent();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Foaiden_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.PRE_FORM_TRG
		 BEGIN
-- --
  G$_TAB_SECURITY.G$_TABSEC_BUILD(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(:SYSTEM.CURRENT_FORM,:GLOBAL.CURRENT_USER));
  G$_CHECK_FAILURE;
-- --
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Foaiden_PreFormTrg()
		{
			
				//  --
				getTask().getGoqrpls().getGTabSecurity().gTabsecBuild(GSecurity.FgGetTabSecurityFnc(getCurrentTaskName(), getGlobal("CURRENT_USER")));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Foaiden_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Foaiden_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Foaiden_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Foaiden_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Foaiden_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Foaiden_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Foaiden_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Foaiden_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Foaiden_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Foaiden_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Foaiden_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Foaiden_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.POST-FORMS-COMMIT
		 -- sq Added this trigger for messaging.
BEGIN
  GB_COMMON.P_COMMIT('NO COMMIT');
--
  EXECUTE_TRIGGER('POST_FORMS_COMMIT_TRG');
  G$_CHECK_FAILURE;
--
EXCEPTION
	WHEN OTHERS THEN
	  MESSAGE(SUBSTR(SQLERRM,1,255));
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Foaiden_AfterCommit(EventObject args)
		{
			
				//  sq Added this trigger for messaging.
				try
				{
					GbCommon.pCommit(toStr("NO COMMIT"));
					// 
					executeAction("POST_FORMS_COMMIT_TRG");
					getTask().getGoqrpls().gCheckFailure();
				}
				catch(Exception  e)
				{
					errorMessage(substring(errorMessage(), toInt(1), toInt(255)));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Foaiden_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Foaiden_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Foaiden_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Foaiden_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Foaiden_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Foaiden_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Foaiden_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Foaiden_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Foaiden_F6()
		{
			
				getGFormClass().f6();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Foaiden_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Foaiden_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Foaiden_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Foaiden_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Foaiden_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Foaiden_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Foaiden_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Foaiden_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Foaiden_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Foaiden_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Foaiden_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Foaiden_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Foaiden_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Foaiden_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.KEY_EXIT_TRG
		 BEGIN
  :GLOBAL.NAVIGATE_TO_TAB := null;
  EXECUTE_TRIGGER('GLOBAL_TELE_COPY');
  EXECUTE_TRIGGER('GLOBAL_ID_ERASE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Foaiden_KeyExitTrg()
		{
			
				setGlobal("NAVIGATE_TO_TAB", toStr(null));
				executeAction("GLOBAL_TELE_COPY");
				executeAction("GLOBAL_ID_ERASE");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Foaiden_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.KEY_NXTKEY_TRG
		 IF :GLOBAL.NAVIGATE_TO_TAB = 'TELEPHONE' THEN
  :GLOBAL.VALUE := :SPRTELE.ROWID ;
   :global.atyp_code  := :SPRTELE.sprtele_atyp_code;
   :global.seqno := :SPRTELE.SPRTELE_ADDR_SEQNO;
   :global.tele_code := :SPRTELE.SPRTELE_TELE_CODE;
   :global.tele_seqno := :SPRTELE.SPRTELE_SEQNO;
   :global.phone_area := :SPRTELE.SPRTELE_PHONE_AREA;
   :global.phone_number := :SPRTELE.SPRTELE_PHONE_NUMBER;
   :global.phone_ext := :SPRTELE.SPRTELE_PHONE_EXT;
   :global.ctry_code_phone := :sprtele.sprtele_ctry_code_phone;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Foaiden_KeyNxtkeyTrg()
		{
			


				SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);

				if(sprteleElement!=null){
				if ( getGlobal("NAVIGATE_TO_TAB").equals("TELEPHONE") )
				{
					setGlobal("VALUE", sprteleElement.getROWID());
					setGlobal("ATYP_CODE", sprteleElement.getSprteleAtypCode());
					setGlobal("SEQNO", toStr(sprteleElement.getSprteleAddrSeqno()));
					setGlobal("TELE_CODE", sprteleElement.getSprteleTeleCode());
					setGlobal("TELE_SEQNO", toStr(sprteleElement.getSprteleSeqno()));
					setGlobal("PHONE_AREA", sprteleElement.getSprtelePhoneArea());
					setGlobal("PHONE_NUMBER", sprteleElement.getSprtelePhoneNumber());
					setGlobal("PHONE_EXT", sprteleElement.getSprtelePhoneExt());
					setGlobal("CTRY_CODE_PHONE", sprteleElement.getSprteleCtryCodePhone());
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Foaiden_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Foaiden_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Foaiden_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Foaiden_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Foaiden_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_TO_SAVE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TO_SAVE")
		public void Goqclib_CheckToSave()
		{
			
				getGoqclibFormController().Goqclib_CheckToSave();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY_NXTBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTBLOCK_TRG")
		public void Goqclib_KeyNxtblockTrg()
		{
			
				getGoqclibFormController().Goqclib_KeyNxtblockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY_PRVBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_PRVBLOCK_TRG")
		public void Goqclib_KeyPrvblockTrg()
		{
			
				getGoqclibFormController().Goqclib_KeyPrvblockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.GO_ADDR_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_ADDR_FORM")
		public void Goqclib_GoAddrForm()
		{
			
				getGoqclibFormController().Goqclib_GoAddrForm();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.EXECUTE_QUERY_NO_MSG
		 :SYSTEM.MESSAGE_LEVEL := 5;
EXECUTE_QUERY;
:SYSTEM.MESSAGE_LEVEL := 0;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.EXECUTE_QUERY_NO_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EXECUTE_QUERY_NO_MSG")
		public void Foaiden_ExecuteQueryNoMsg()
		{
			
				
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeQuery();
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 IF :SYSTEM.EVENT_WINDOW IS NULL OR
   :SYSTEM.EVENT_WINDOW IN ('MAIN_WINDOW') THEN
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Foaiden_WhenWindowActivatedTrg()
		{
			
				if ( (getCurrentWindow()) == null || in(getCurrentWindow(), "MAIN_WINDOW").getValue() )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CHECK_PERS_SOUNDEX_NAMES
		 :GLOBAL.FIRST_NAME := :SPRIDEN_CURRENT.PERS_FIRST_NAME;
:GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.PERS_LAST_NAME;
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
DECLARE
      MY_TEMP      VARCHAR2(255);
      ALERT_BUT    VARCHAR2(255);
CURSOR MY_CURSOR IS
      select 'X' from spriden
       where ((spriden_soundex_last_name = soundex(:spriden_current.pers_last_name) and
               :spriden_current.pers_last_name is not null) or
               :spriden_current.pers_last_name is null)     
         OR ((spriden_soundex_first_name = soundex(:spriden_current.pers_first_name) and
               :spriden_current.pers_first_name is not null or
               :spriden_current.pers_first_name is null));

BEGIN
      OPEN MY_CURSOR ;
      FETCH MY_CURSOR INTO MY_TEMP ;
      IF MY_CURSOR%FOUND THEN
      F$_REQUEST_SEARCH('F$_SEARCH_ALERT', '*Warning* Similar name(s) exist. Would you like to view them?', 'FTIIDEN',
                       'PERSON');
      ELSE
         ALERT_BUT := G$_DISPLAY_ALERT('', G$_NLS.Get('FOAIDEN-0000', 'FORM','No similar names found.') );
      END IF ;
      SYNCHRONIZE ;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_PERS_SOUNDEX_NAMES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PERS_SOUNDEX_NAMES")
		public void Foaiden_CheckPersSoundexNames()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				int rowCount = 0;
				setGlobal("FIRST_NAME", spridenCurrentElement.getPersFirstName());
				setGlobal("LAST_NAME", spridenCurrentElement.getPersLastName());
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				{
					NString myTemp= NString.getNull();
					NString alertBut= NString.getNull();
					String sqlmyCursor = "SELECT 'X' " +
	" FROM spriden " +
	" WHERE ((spriden_soundex_last_name = soundex(:SPRIDEN_CURRENT_PERS_LAST_NAME) AND :SPRIDEN_CURRENT_PERS_LAST_NAME IS NOT NULL) OR :SPRIDEN_CURRENT_PERS_LAST_NAME IS NULL) OR ((spriden_soundex_first_name = soundex(:SPRIDEN_CURRENT_PERS_FIRST_NAME) AND :SPRIDEN_CURRENT_PERS_FIRST_NAME IS NOT NULL OR :SPRIDEN_CURRENT_PERS_FIRST_NAME IS NULL)) ";
					DataCursor myCursor = new DataCursor(sqlmyCursor);
					try {
						//Setting query parameters
						myCursor.addParameter("SPRIDEN_CURRENT_PERS_LAST_NAME", spridenCurrentElement.getPersLastName());
						myCursor.addParameter("SPRIDEN_CURRENT_PERS_FIRST_NAME", spridenCurrentElement.getPersFirstName());
						myCursor.open();
						ResultSet myCursorResults = myCursor.fetchInto();
						if ( myCursorResults != null ) {
							myTemp = myCursorResults.getStr(0);
						}
						if ( myCursor.found() )
						{
							this.getTask().getServices().fRequestSearch(spridenCurrentElement, toStr("F$_SEARCH_ALERT"), toStr("*Warning* Similar name(s) exist. Would you like to view them?"), toStr("FTIIDEN"), toStr("PERSON"));
						}
						else {
							alertBut = toStr(getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("FOAIDEN-0000"), toStr("FORM"), toStr("No similar names found."))));
						}
					
						
					}
					finally{
						myCursor.close();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CHECK_ORG_SOUNDEX_NAMES
		 :GLOBAL.FIRST_NAME := :SPRIDEN_CURRENT.PERS_FIRST_NAME;
:GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME;
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
	
DECLARE
      MY_INTO_TEMP      VARCHAR2(255);
      ALERT_BUT         VARCHAR2(255);
CURSOR MY_CURSOR IS
      select 'X' from spriden
       where ((spriden_soundex_last_name = soundex(:spriden_current.non_pers_name) and
               :spriden_current.non_pers_name is not null) or
               :spriden_current.non_pers_name is null);
BEGIN
      OPEN MY_CURSOR ;
      FETCH MY_CURSOR INTO MY_INTO_TEMP ;
      IF MY_CURSOR%FOUND THEN
         F$_REQUEST_SEARCH('F$_SEARCH_ALERT', '*Warning* Similar name(s) exist. Would you like to view them?', 'FTIIDEN',
                        'ORG');
      ELSE
         ALERT_BUT := G$_DISPLAY_ALERT('', G$_NLS.Get('FOAIDEN-0001', 'FORM','No similar names found.') );
      END IF ;
      SYNCHRONIZE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_ORG_SOUNDEX_NAMES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_ORG_SOUNDEX_NAMES")
		public void Foaiden_CheckOrgSoundexNames()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				int rowCount = 0;
				setGlobal("FIRST_NAME", spridenCurrentElement.getPersFirstName());
				setGlobal("LAST_NAME", spridenCurrentElement.getNonPersName());
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				{
					NString myIntoTemp= NString.getNull();
					NString alertBut= NString.getNull();
					String sqlmyCursor = "SELECT 'X' " +
	" FROM spriden " +
	" WHERE ((spriden_soundex_last_name = soundex(:SPRIDEN_CURRENT_NON_PERS_NAME) AND :SPRIDEN_CURRENT_NON_PERS_NAME IS NOT NULL) OR :SPRIDEN_CURRENT_NON_PERS_NAME IS NULL) ";
					DataCursor myCursor = new DataCursor(sqlmyCursor);
					try {
						//Setting query parameters
						myCursor.addParameter("SPRIDEN_CURRENT_NON_PERS_NAME", spridenCurrentElement.getNonPersName());
						myCursor.open();
						ResultSet myCursorResults = myCursor.fetchInto();
						if ( myCursorResults != null ) {
							myIntoTemp = myCursorResults.getStr(0);
						}
						if ( myCursor.found() )
						{
							this.getTask().getServices().fRequestSearch(spridenCurrentElement, toStr("F$_SEARCH_ALERT"), toStr("*Warning* Similar name(s) exist. Would you like to view them?"), toStr("FTIIDEN"), toStr("ORG"));
						}
						else {
							alertBut = toStr(getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("FOAIDEN-0001"), toStr("FORM"), toStr("No similar names found."))));
						}
					
						
					}
					finally{
						myCursor.close();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.LIST_VALUES_CALL
		 G$_LIST_VALUES_CALL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.LIST_VALUES_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_CALL")
		public void Foaiden_ListValuesCall()
		{
			
				getTask().getGoqrpls().gListValuesCall();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5.0.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Foaiden_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.PREVIOUS_REMOVE
		 DO_KEY ('DELETE_RECORD');
commit_form;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.PREVIOUS_REMOVE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PREVIOUS_REMOVE")
		public void Foaiden_PreviousRemove()
		{
			
				executeAction("DELETE_RECORD");
				commitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.DELIVERY
		 if :system.current_field = 'SPRADDR_ZIP' then
   do_key ('DUPLICATE_RECORD');
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.DELIVERY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELIVERY")
		public void Foaiden_Delivery()
		{
			
				if ( getCurrentField().equals("SPRADDR_ZIP") )
				{
					executeAction("DUPLICATE_RECORD");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.ADDRESS
		 <multilinecomment>EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');</multilinecomment>
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
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ADDRESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ADDRESS")
		public void Foaiden_Address()
		{
			
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				try {
					executeAction("CHECK_TO_SAVE");
				} catch (Exception e) {
					goItem(toStr(getCursorItem()));
					throw new ApplicationException();
				}
					goBlock(toStr("SPRADDR"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.PREVIOUS_NAME
		 <multilinecomment>EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');</multilinecomment>

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
		 * FOAIDEN.PREVIOUS_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PREVIOUS_NAME")
		public void Foaiden_PreviousName()
		{
			
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				try {
					executeAction("CHECK_TO_SAVE");
				} catch (Exception e) {
					goItem(toStr(getCursorItem()));
					throw new ApplicationException();
				}
					goBlock(toStr("SPRIDEN_PREVIOUS"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.SOURCE
		 DO_KEY ('DUPLICATE_RECORD');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.SOURCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SOURCE")
		public void Foaiden_Source()
		{
			
				executeAction("DUPLICATE_RECORD");
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.ENABLE_NONPERS_ITEMS
		 IF GET_ITEM_PROPERTY('PERS_LAST_NAME',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>
   SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_ON);
   SET_ITEM_PROPERTY ('NON_PERS_NAME', NAVIGABLE, PROPERTY_ON);
   SET_ITEM_PROPERTY ('NON_PERS_NAME', UPDATEABLE, PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ENABLE_NONPERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_NONPERS_ITEMS")
		public void Foaiden_EnableNonpersItems()
		{
			
				if ( getItemVisible("PERS_LAST_NAME").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("NON_PERS_NAME", true);
					setItemNavigable("NON_PERS_NAME", true);
					setItemUpdateAllowed("NON_PERS_NAME", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.ENABLE_PERS_ITEMS
		 <multilinecomment> Enable last name </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_LAST_NAME',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>
      SET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_LAST_NAME', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_LAST_NAME', UPDATEABLE, PROPERTY_ON);
   END IF;
<multilinecomment>    Enable first name </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_FIRST_NAME',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>
      SET_ITEM_PROPERTY ('PERS_FIRST_NAME', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_FIRST_NAME', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_FIRST_NAME', UPDATEABLE, PROPERTY_ON);
   END IF;      
<multilinecomment>    Enable middle name </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_MI',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>
      SET_ITEM_PROPERTY ('PERS_MI', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_MI', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_MI', UPDATEABLE, PROPERTY_ON);
   END IF;      
<multilinecomment> Enable prefix </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_PREFIX',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>
      SET_ITEM_PROPERTY ('PERS_PREFIX', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_PREFIX', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_PREFIX', UPDATEABLE, PROPERTY_ON);
   END IF;
   <multilinecomment> Enable suffix </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_SUFFIX',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>   
      SET_ITEM_PROPERTY ('PERS_SUFFIX', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_SUFFIX', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_SUFFIX', UPDATEABLE, PROPERTY_ON);
   END IF;      
   <multilinecomment> Enable legal name </multilinecomment>
   IF GET_ITEM_PROPERTY('PERS_LEGAL_NAME',VISIBLE) = 'TRUE' THEN   <multilinecomment> 1-4I0Q7O </multilinecomment>   
      SET_ITEM_PROPERTY ('PERS_LEGAL_NAME', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_LEGAL_NAME', NAVIGABLE, PROPERTY_ON);
      SET_ITEM_PROPERTY ('PERS_LEGAL_NAME', UPDATEABLE, PROPERTY_ON);
   END IF;      


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ENABLE_PERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_PERS_ITEMS")
		public void Foaiden_EnablePersItems()
		{
			
				//  Enable last name 
				//  Enable last name 
				if ( getItemVisible("PERS_LAST_NAME").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_LAST_NAME", true);
					setItemNavigable("PERS_LAST_NAME", true);
					setItemUpdateAllowed("PERS_LAST_NAME", true);
				}
				//     Enable first name 
				if ( getItemVisible("PERS_FIRST_NAME").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_FIRST_NAME", true);
					setItemNavigable("PERS_FIRST_NAME", true);
					setItemUpdateAllowed("PERS_FIRST_NAME", true);
				}
				//     Enable middle name 
				if ( getItemVisible("PERS_MI").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_MI", true);
					setItemNavigable("PERS_MI", true);
					setItemUpdateAllowed("PERS_MI", true);
				}
				//  Enable prefix 
				if ( getItemVisible("PERS_PREFIX").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_PREFIX", true);
					setItemNavigable("PERS_PREFIX", true);
					setItemUpdateAllowed("PERS_PREFIX", true);
				}
				//  Enable suffix 
				if ( getItemVisible("PERS_SUFFIX").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_SUFFIX", true);
					setItemNavigable("PERS_SUFFIX", true);
					setItemUpdateAllowed("PERS_SUFFIX", true);
				}
				//  Enable legal name 
				if ( getItemVisible("PERS_LEGAL_NAME").equals("TRUE") )
				{
					//  1-4I0Q7O 
					setItemEnabled("PERS_LEGAL_NAME", true);
					setItemNavigable("PERS_LEGAL_NAME", true);
					setItemUpdateAllowed("PERS_LEGAL_NAME", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CLOSE_WINDOWS
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Foaiden_CloseWindows()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN	
	IF :SYSTEM.CURSOR_BLOCK ='KEY_BLOCK' THEN
		:FORM_HEADER.NEXT_DOC_NUM := fokutil.f_next_display;
	END IF;
	
  IF :CHECK_KEYS = 'Y' THEN
    :CHECK_KEYS := 'N';
    GO_BLOCK('KEY_BLOCK');
    G$_CHECK_VALUE ((:KEY_BLOCK.ID IS NULL),
       G$_NLS.Get('FOAIDEN-0002', 'FORM','*ERROR* An id number or ''GENERATED'' must be entered for this function.')  
       , TRUE, TRUE);
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_OFF);
    GO_BLOCK('SPRIDEN_CURRENT');
    EXECUTE_QUERY;
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
    IF :ENTITY_IND IS NULL  THEN
      <multilinecomment> Allow entering into Person fields </multilinecomment>
     -- IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN   
      EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
      G$_CHECK_FAILURE; 
    --  END IF;
     <multilinecomment> Allow entering into Non-Person field </multilinecomment>
      IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN   
        EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
        G$_CHECK_FAILURE; 
      END IF;
      GO_ITEM( 'PERS_LAST_NAME' ) ;
    ELSE
      GO_ITEM( 'SPRIDEN_CURRENT.SPRIDEN_ID' ) ;
      IF :ENTITY_IND = 'P' THEN
      <multilinecomment> Do not allow entering into Non-Person field </multilinecomment>
        IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'TRUE' THEN
          SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_OFF);
        END IF;
      <multilinecomment> Allow entering into Person fields </multilinecomment>
        EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
        G$_CHECK_FAILURE; 
      END IF; 
      IF :ENTITY_IND = 'C' THEN
      <multilinecomment> Do not allow entering into Person fields </multilinecomment>
        SET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_FIRST_NAME', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_MI', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_PREFIX', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_SUFFIX', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_LEGAL_NAME', ENABLED, PROPERTY_OFF);
        SET_ITEM_PROPERTY ('PERS_PREF_FNAME', ENABLED, PROPERTY_OFF);
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
  END IF;
  IF :SYSTEM.TRIGGER_BLOCK = 'SPRIDEN_CURRENT' THEN
    :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID';
    GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
    :HOLD_BLOCK_FIELD := '';
  ELSIF :SYSTEM.TRIGGER_BLOCK = 'SPRADDR' THEN
    :HOLD_BLOCK_FIELD := 'SPRADDR.SPRADDR_ATYP_CODE';
    GO_ITEM(NAME_IN('HOLD_BLOCK_FIELD'));
    :HOLD_BLOCK_FIELD := '';
  END IF;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Foaiden_WhenNewBlockInstanceTrg()
		{
			
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					getFormModel().getFormHeader().setNextDocNum(Fokutil.fNextDisplay());
					goItem("ID");
				}
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") && getCursorBlock().notEquals("KEY_BLOCK"))
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					goBlock(toStr("KEY_BLOCK"));
					getTask().getGoqrpls().gCheckValue(toBool(getFormModel().getKeyBlock().getId().isNull()), GNls.Fget(toStr("FOAIDEN-0002"), toStr("FORM"), toStr("*ERROR* An id number or 'GENERATED' must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
					
					
					try {
						TaskServices.getCurrentTask().setValidationEnabled(false);

						goBlock(toStr("SPRIDEN_CURRENT"));
						executeQuery();

					} finally {
						TaskServices.getCurrentTask().setValidationEnabled(true);

					}
					
					
					if ( getFormModel().getKeyBlock().getEntityInd().isNull() )
					{
						//  Allow entering into Person fields 
						//  IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN   
						executeAction("ENABLE_PERS_ITEMS");
						getTask().getGoqrpls().gCheckFailure();
						//   END IF;
						//  Allow entering into Non-Person field 
						if ( getItemEnabled("NON_PERS_NAME").equals("FALSE") )
						{
							executeAction("ENABLE_NONPERS_ITEMS");
							getTask().getGoqrpls().gCheckFailure();
						}
						goItem(toStr("PERS_LAST_NAME"));
					}
					else {
						goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
						if ( getFormModel().getKeyBlock().getEntityInd().equals("P") )
						{
							//  Do not allow entering into Non-Person field 
							if ( getItemEnabled("NON_PERS_NAME").equals("TRUE") )
							{
								setItemEnabled("NON_PERS_NAME", false);
							}
							//  Allow entering into Person fields 
							executeAction("ENABLE_PERS_ITEMS");
							getTask().getGoqrpls().gCheckFailure();
						}
						if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
						{
							//  Do not allow entering into Person fields 
							setItemEnabled("PERS_LAST_NAME", false);
							setItemEnabled("PERS_FIRST_NAME", false);
							setItemEnabled("PERS_MI", false);
							setItemEnabled("PERS_PREFIX", false);
							setItemEnabled("PERS_SUFFIX", false);
							setItemEnabled("PERS_LEGAL_NAME", false);
							setItemEnabled("PERS_PREF_FNAME", false);
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
				if ( getTriggerBlock().equals("SPRIDEN_CURRENT") )
				{
					getFormModel().getFormHeader().setHoldBlockField(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
					goItem(getNameIn("HOLD_BLOCK_FIELD"));
					getFormModel().getFormHeader().setHoldBlockField(toStr(""));
				}
				else if ( getTriggerBlock().equals("SPRADDR") ) {
					getFormModel().getFormHeader().setHoldBlockField(toStr("SPRADDR.SPRADDR_ATYP_CODE"));
					goItem(getNameIn("HOLD_BLOCK_FIELD"));
					getFormModel().getFormHeader().setHoldBlockField(toStr(""));
				}
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.WHEN-WINDOW-CLOSED
		 -- SET_WINDOW_PROPERTY(:SYSTEM.EVENT_WINDOW,VISIBLE,PROPERTY_OFF);
<multilinecomment>DECLARE 
   TM_ID TIMER;
BEGIN
   IF :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
      SET_WINDOW_PROPERTY(:SYSTEM.EVENT_WINDOW,VISIBLE,PROPERTY_OFF);
   ELSE
      TM_ID := FIND_TIMER('OPT_TIMER');
      IF NOT ID_NULL(TM_ID) THEN
         DELETE_TIMER(TM_ID);
      END IF;
      SET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,VISUAL_ATTRIBUTE,'');
      SET_WINDOW_PROPERTY('G$_OPT_WINDOW',VISIBLE,PROPERTY_OFF);
      GO_ITEM(NAME_IN('SELECT_ITEM'));
   END IF;
END;</multilinecomment>
BEGIN
  G$_WIN_CLOSED;
  G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Foaiden_WhenWindowClosed()
		{
			
				//  SET_WINDOW_PROPERTY(:SYSTEM.EVENT_WINDOW,VISIBLE,PROPERTY_OFF);
				// DECLARE
				// TM_ID TIMER;
				// BEGIN
				// IF :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
				// SET_WINDOW_PROPERTY(:SYSTEM.EVENT_WINDOW,VISIBLE,PROPERTY_OFF);
				// ELSE
				// TM_ID := FIND_TIMER('OPT_TIMER');
				// IF NOT ID_NULL(TM_ID) THEN
				// DELETE_TIMER(TM_ID);
				// END IF;
				// SET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,VISUAL_ATTRIBUTE,'');
				// SET_WINDOW_PROPERTY('G$_OPT_WINDOW',VISIBLE,PROPERTY_OFF);
				// GO_ITEM(NAME_IN('SELECT_ITEM'));
				// END IF;
				// END;
				getTask().getGoqrpls().gWinClosed();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.NAME_AND_ID_CHECK
		    G$_CHECK_VALUE ((:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL
     AND  :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P'),
       G$_NLS.Get('FOAIDEN-0003', 'FORM','*ERROR* Last name and first name required for a person.') ,
          TRUE);
--
-- This trigger step checks if the person exists on the database.
-- If not the information must be committed 
-- (so a PIDM is created for further processing)
--
   G$_CHECK_VALUE ((:SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL
     AND  (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL
      OR  :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL)),
       G$_NLS.Get('FOAIDEN-0004', 'FORM','*ERROR* Current identification added, press SAVE before leaving current window.') ,
        TRUE);
--
-- This trigger step checks if either the name or id was changed to force
--  the user to commit any changes.
--
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRIDEN
         WHERE  ROWID = :SPRIDEN_CURRENT.ROWID
           AND  SPRIDEN_LAST_NAME =
              :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME
           AND  ((SPRIDEN_FIRST_NAME =
              :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME
           AND  :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL)
            OR  (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL
           AND  :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C'))
           AND  SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
       G$_NLS.Get('FOAIDEN-0005', 'FORM','*ERROR* Current identification changed, press SAVE before leaving current window') , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *This trigger checks that the last and first names are entered for a person.

		 *It then checks if a new person was added and must be committed or if an

		 *existing person was changed and must be committed.  Finally, the name

		 *information is copied onto subsequent pages.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.NAME_AND_ID_CHECK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NAME_AND_ID_CHECK")
		public void Foaiden_NameAndIdCheck()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				int rowCount = 0;
				getTask().getGoqrpls().gCheckValue(toBool(spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement.getSpridenEntityInd().equals("P")), GNls.Fget(toStr("FOAIDEN-0003"), toStr("FORM"), toStr("*ERROR* Last name and first name required for a person.")), toBool(NBool.True));
				// 
				//  This trigger step checks if the person exists on the database.
				//  If not the information must be committed 
				//  (so a PIDM is created for further processing)
				// 
				getTask().getGoqrpls().gCheckValue(toBool(spridenCurrentElement.getSpridenPidm().isNull() && (!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getNonPersName().isNull())), GNls.Fget(toStr("FOAIDEN-0004"), toStr("FORM"), toStr("*ERROR* Current identification added, press SAVE before leaving current window.")), toBool(NBool.True));
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE ROWID = :SPRIDEN_CURRENT_ROWID AND SPRIDEN_LAST_NAME = :SPRIDEN_CURRENT_SPRIDEN_LAST_NAME AND ((SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME AND :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NOT NULL) OR (:SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NULL AND :SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND = 'C')) AND SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRIDEN_CURRENT_ROWID", spridenCurrentElement.getROWID());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_LAST_NAME", spridenCurrentElement.getSpridenLastName());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME", spridenCurrentElement.getSpridenFirstName());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND", spridenCurrentElement.getSpridenEntityInd());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FOAIDEN-0005"), toStr("FORM"), toStr("*ERROR* Current identification changed, press SAVE before leaving current window")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CHECK_PERS_NONPERS
		    G$_CHECK_VALUE ((:PERS_LAST_NAME IS NULL
     AND  :PERS_FIRST_NAME IS NULL
     AND  :NON_PERS_NAME IS NULL),
 G$_NLS.Get('FOAIDEN-0006', 'FORM','*ERROR* You must enter either person or non-person name information.') ,
         TRUE);
--
   G$_CHECK_VALUE (((:PERS_LAST_NAME IS NOT NULL
      OR  :PERS_FIRST_NAME IS NOT NULL)
     AND  :NON_PERS_NAME IS NOT NULL),
 G$_NLS.Get('FOAIDEN-0007', 'FORM','*ERROR* You may only enter person or non-person info; not both.') , TRUE);
--
   IF (:pers_prefix IS NOT NULL 
       OR :pers_suffix IS NOT NULL) AND
      :non_pers_name IS NOT NULL THEN
         :KEY_BLOCK.ENTITY_IND := '';
         MESSAGE ( G$_NLS.Get('FOAIDEN-0008', 'FORM','*ERROR* Can only enter person or non-person info; not both.') );
         RAISE FORM_TRIGGER_FAILURE;
   END IF;
   IF G$_NCHK(NOT (:PERS_LAST_NAME IS NOT NULL
      OR  :PERS_FIRST_NAME IS NOT NULL)) THEN
      GOTO COPY_C_ENTITY ;
   END IF ;
--
   << COPY_P_ENTITY >>
   :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'P' ;
--
   :ENTITY_IND := 'P' ;
   RETURN ;
--
   << COPY_C_ENTITY >>
   G$_CHECK_VALUE ((:NON_PERS_NAME IS NULL),
 G$_NLS.Get('FOAIDEN-0009', 'FORM','*ERROR* You must enter either a person name or company name.') , TRUE,
         TRUE);
--
   :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'C' ;
--
   :ENTITY_IND := 'C' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_PERS_NONPERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_PERS_NONPERS")
		public void Foaiden_CheckPersNonpers()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				getTask().getGoqrpls().gCheckValue((toBool(spridenCurrentElement.getPersLastName().isNull() && spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement.getNonPersName().isNull())), GNls.Fget(toStr("FOAIDEN-0006"), toStr("FORM"), toStr("*ERROR* You must enter either person or non-person name information.")), toBool(NBool.True));
				// 
				getTask().getGoqrpls().gCheckValue(toBool((!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getPersFirstName().isNull()) && !spridenCurrentElement.getNonPersName().isNull()), GNls.Fget(toStr("FOAIDEN-0007"), toStr("FORM"), toStr("*ERROR* You may only enter person or non-person info; not both.")), toBool(NBool.True));
				// 
				if ( (!spridenCurrentElement.getPersPrefix().isNull() || !spridenCurrentElement.getPersSuffix().isNull()) && !spridenCurrentElement.getNonPersName().isNull() )
				{
					getFormModel().getKeyBlock().setEntityInd(toStr(""));
					errorMessage(GNls.Fget(toStr("FOAIDEN-0008"), toStr("FORM"), toStr("*ERROR* Can only enter person or non-person info; not both.")));
					throw new ApplicationException();
				}
				if ( getTask().getGoqrpls().gNchk(toBool(!(!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getPersFirstName().isNull()))).toBoolean())
				{
					 goToCopyCEntity(spridenCurrentElement);
					 return;
				}
				goToCopyPEntity(spridenCurrentElement);
			}
		}
		private void goToCopyPEntity(SpridenCurrentAdapter spridenCurrentElement) {
			//COPY_P_ENTITY:;
			spridenCurrentElement.setSpridenEntityInd(toStr("P"));
			// 
			getFormModel().getKeyBlock().setEntityInd(toStr("P"));
			return ;
		}
		private void goToCopyCEntity(SpridenCurrentAdapter spridenCurrentElement) {
			//COPY_C_ENTITY:;
			getTask().getGoqrpls().gCheckValue(toBool(spridenCurrentElement.getNonPersName().isNull()), GNls.Fget(toStr("FOAIDEN-0009"), toStr("FORM"), toStr("*ERROR* You must enter either a person name or company name.")), toBool(NBool.True), toBool(NBool.True));
			// 
			spridenCurrentElement.setSpridenEntityInd(toStr("C"));
			// 
			getFormModel().getKeyBlock().setEntityInd(toStr("C"));
		}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CHECK_BOTH
		    IF :SPRIDEN_CURRENT.ROWID IS NULL  THEN
      EXECUTE_TRIGGER( 'CHECK_PERS_NONPERS' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CHECK_BOTH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BOTH")
		public void Foaiden_CheckBoth()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				if ( spridenCurrentElement.getRowState().equals(DataRowStatus.INSERTED))
				{
					executeAction("CHECK_PERS_NONPERS");
					getTask().getGoqrpls().gCheckFailure();
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
 --  EXECUTE_TRIGGER('GLOBAL_ID_ERASE');
		*/
		/*
		 *<p>
		 *This trigger will copy the keys back to the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Foaiden_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MENU_TRIGGER
		 <multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Jan-2004 11:11 AM
 ******************************************</multilinecomment>

   :HOLD_BLOCK := :SYSTEM.CURRENT_BLOCK ;
--
   :HOLD_FIELD := :SYSTEM.CURRENT_FIELD ;
--
   :HOLD_BLOCK_FIELD := :HOLD_BLOCK || '.' || :HOLD_FIELD ;
--
   null;  --BLOCK_MENU ;
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
      EXECUTE_TRIGGER( 'GLOBAL_TELE_COPY' );
      G$_CHECK_FAILURE;
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
		 * FOAIDEN.MENU_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MENU_TRIGGER")
		public void Foaiden_MenuTrigger()
		{
			
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Jan-2004 11:11 AM
				// ******************************************
				// ******************************************
				// Code modified by the Forms Migration Assistant
				// 19-Jan-2004 11:11 AM
				// ******************************************
				getFormModel().getFormHeader().setHoldBlock(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setHoldField(toStr(getCurrentField()));
				// 
				getFormModel().getFormHeader().setHoldBlockField(getFormModel().getFormHeader().getHoldBlock().append(".").append(getFormModel().getFormHeader().getHoldField()));
				// 
				// BLOCK_MENU ;
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
					executeAction("GLOBAL_TELE_COPY");
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

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.LOAD_FORM_HEADER
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
		 * FOAIDEN.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Foaiden_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getUser());
				getFormModel().getFormHeader().setMaterialFlag(toStr(""));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.INVALID_FUNCTION_MSG
		    MESSAGE( G$_NLS.Get('FOAIDEN-0010', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') );
   RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Foaiden_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("FOAIDEN-0010"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.GLOBAL_COPY
		    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
   IF :KEY_BLOCK.ID IS NOT NULL THEN
      NEXT_ITEM;
   END IF;
   
		*/
		/*
		 *<p>
		 *This trigger will copy the key information from the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Foaiden_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID_LBT',NAVIGABLE,PROPERTY_ON);
END IF;
IF G$_NAVIGATION_FRAME.GET_DESCRIPTION('1.01','P') = 'Generate ID' THEN
   G$_NAVIGATION_FRAME.ENABLE_OPTION('1.01','P');
   SET_ITEM_PROPERTY('ID_LBT',NAVIGABLE,PROPERTY_ON);
END IF;

IF GET_ITEM_PROPERTY('GENERATE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GENERATE_BTN',NAVIGABLE,PROPERTY_ON);
END IF;





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Foaiden_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
//					setItemNavigable("ID_LBT", true);
				}
				if ( getTask().getGoqrpls().getGNavigationFrame().getDescription(toStr("1.01"), toStr("P")).equals("Generate ID") )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("1.01"), toStr("P"));
//					setItemNavigable("ID_LBT", true);
				}
				if ( getItemEnabled("GENERATE_BTN").equals("FALSE") )
				{
					setItemEnabled("GENERATE_BTN", true);
//					setItemNavigable("GENERATE_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_OFF);
   G$_NAVIGATION_FRAME.DISABLE_OPTION('1.01','P');
    SET_ITEM_PROPERTY('ID_LBT', ENABLED, PROPERTY_OFF);
    
    EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
    G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Foaiden_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("GENERATE_BTN", false);
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("1.01"), toStr("P"));
				setItemEnabled("ID_LBT", false);
				executeAction("ENABLE_TAB_PAGES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CLRFRM_TRIGGER
		 
   :GLOBAL.CLEAR_FORM := 'Y';
   :GLOBAL.VALUE := 'KEY-CLRFRM';
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER ('ENABLE_KEYS');
   G$_CHECK_FAILURE;
 
   SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB');   
     CLEAR_FORM;
   IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      :GLOBAL.ACTION := '';
      EXECUTE_TRIGGER('DISABLE_KEYS');
      G$_CHECK_FAILURE;
      RETURN;
   END IF;
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
   
   EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
      :CHECK_KEYS := 'N';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CLRFRM_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLRFRM_TRIGGER")
		public void Foaiden_ClrfrmTrigger()
		{
			
				setGlobal("CLEAR_FORM", toStr("Y"));
				setGlobal("VALUE", toStr("KEY-CLRFRM"));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				setCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS", "CURRENT_ID_TAB");
				clearTask();
				if ( getTaskStatus().equals("CHANGED") )
				{
					setGlobal("ACTION", toStr(""));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				goBlock("KEY_BLOCK");
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
				executeAction("DISABLE_TAB_PAGES");
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CALL_SPATELE
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
--
   GO_BLOCK('SPRTELE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CALL_SPATELE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPATELE")
		public void Foaiden_CallSpatele()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				// 
				goBlock(toStr("SPRTELE"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CALL_SPAPERS
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--

   GO_BLOCK('SPBPERS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.CALL_SPAPERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPAPERS")
		public void Foaiden_CallSpapers()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goBlock(toStr("SPBPERS"));
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CALL_SOAAPPT
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
		 * FOAIDEN.CALL_SOAAPPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SOAAPPT")
		public void Foaiden_CallSoaappt()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SOAAPPT"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAAPPT"), toStr(""));
				// 
				goItem(getFormModel().getFormHeader().getHoldField());
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.CALL_GUASYST
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
		 * FOAIDEN.CALL_GUASYST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_GUASYST")
		public void Foaiden_CallGuasyst()
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
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.WHEN-NEW-FORM-INSTANCE
		 g$_set_win_property;
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
G$_CHECK_FAILURE ;
:GLOBAL.PRODUCT_IND := 'S' ;
DEFAULT_VALUE('','GLOBAL.NAVIGATE_TO_TAB');
G$_SET_INST_PROPERTY;

IF NOT G$_MASKS.G$_WAS_MASKING_APPLIED(:GLOBAL.CURRENT_FORM,'SPRIDEN_CURRENT','PERS_SSN') THEN
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SSN',VISIBLE,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SSN',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SSN' ,NAVIGABLE,PROPERTY_TRUE);
END IF;

SHOW_VIEW('G$_IDEN_TAB_CANVAS');
EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
G$_POPULATE_ETHNICITY_LIST('SPBPERS.SPBPERS_ETHN_CDE');

IF :GLOBAL.FORM_WAS_CALLED ='Y' THEN
	 EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
   :PIDM:=:GLOBAL.PIDM;
   :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;

   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
   IF NVL(:GLOBAL.NAVIGATE_TO_TAB,'X') = 'TELEPHONE' THEN
   	 :CHECK_KEYS := 'Y';
	   GO_BLOCK('SPRTELE');
	   EXECUTE_QUERY;
	   GO_ITEM('SPRTELE.SPRTELE_TELE_CODE');
   ELSE
	   GO_BLOCK('SPRIDEN_CURRENT');
   END IF;

--EXECUTE_QUERY;

END IF;

	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Foaiden_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PRODUCT_IND", toStr("S"));
				setDefaultValue("", "GLOBAL.NAVIGATE_TO_TAB");
				getTask().getGoqrpls().gSetInstProperty();
				if ( getTask().getGoqrpls().getGMasks().gWasMaskingApplied(getGlobal("CURRENT_FORM"), toStr("SPRIDEN_CURRENT"), toStr("PERS_SSN")).not() )
				{
					setItemVisible("SPRIDEN_CURRENT.PERS_SSN", true);
					setItemEnabled("SPRIDEN_CURRENT.PERS_SSN", true);
					setItemNavigable("SPRIDEN_CURRENT.PERS_SSN", true);
				}
				showView("G$_IDEN_TAB_CANVAS");
				executeAction("DISABLE_TAB_PAGES");
				getTask().getGoqrpls().gPopulateEthnicityList(toStr("SPBPERS.SPBPERS_ETHN_CDE"));
				if ( getGlobal("FORM_WAS_CALLED").equals("Y") )
				{
					executeAction("ENABLE_TAB_PAGES");
					getFormModel().getKeyBlock().setPidm(toNumber(getGlobal("PIDM")));
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
					if ( !getFormModel().getKeyBlock().getId().isNull() )
					{
						nextItem();
					}
					if ( isNull(getGlobal("NAVIGATE_TO_TAB"), "X").equals("TELEPHONE") )
					{
						getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
						goBlock(toStr("SPRTELE"));
						executeQuery();
						goItem(toStr("SPRTELE.SPRTELE_TELE_CODE"));
					}
					else {
						goBlock(toStr("SPRIDEN_CURRENT"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.KEY-PRVBLK
		 IF :SYSTEM.TRIGGER_BLOCK = 'SPRIDEN_CURRENT' THEN
	G$_INVALID_FUNCTION_MSG;
ELSE
	PREVIOUS_BLOCK;
  EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Foaiden_PreviousBlock()
		{
			
				if ( getTriggerBlock().equals("SPRIDEN_CURRENT") )
				{
					getTask().getGoqrpls().gInvalidFunctionMsg();
				}
				else {
					previousBlock();
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.FORM_KEY_MENU
		    EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *This trigger will execute the menu trigger.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.FORM_KEY_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="FORM_KEY_MENU")
		public void Foaiden_FormKeyMenu()
		{
			
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.KEY-CLRFRM
		  
   EXECUTE_TRIGGER( 'CLRFRM_TRIGGER' ) ;
   G$_CHECK_FAILURE ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Foaiden_ClearTask()
		{
			
				executeAction("CLRFRM_TRIGGER");
				validateItem("ID");
				//*
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.POST_FORMS_COMMIT_TRG
		 IF :MATERIAL_FLAG = 'Y' THEN
-- S$_CREATE_MATERIALS(:KEY_BLOCK.PIDM);
   :MATERIAL_FLAG := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Foaiden_PostFormsCommitTrg()
		{
			
				if ( getFormModel().getFormHeader().getMaterialFlag().equals("Y") )
				{
					//  S$_CREATE_MATERIALS(:KEY_BLOCK.PIDM);
					getFormModel().getFormHeader().setMaterialFlag(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.PRE-UPDATE
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
		 * FOAIDEN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Foaiden_BeforeRowUpdate(RowAdapterEvent args)
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

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.POST_FORM_TRG
		 BEGIN
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   :GLOBAL.PRODUCT_IND := '' ;
   
   EXECUTE_TRIGGER('GLOBAL_ID_ERASE');
  -- EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  -- G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *This trigger will copy the current key value back to the global fields.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Foaiden_PostFormTrg()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PRODUCT_IND", toStr(""));
				executeAction("GLOBAL_ID_ERASE");
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.WHEN-TAB-PAGE-CHANGED
		 DECLARE
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN 
	validate(item_scope);
	IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
	END IF;
  IF tab_topmost = 'CURRENT_ID_TAB' THEN
    EXECUTE_TRIGGER('MNU_SHOW_CURR_ID');
  ELSIF tab_topmost = 'ALTERNATE_ID_TAB' THEN
    EXECUTE_TRIGGER('PREVIOUS_NAME');
  ELSIF tab_topmost = 'ADDRESS_TAB' THEN
    EXECUTE_TRIGGER('ADDRESS');
  ELSIF tab_topmost = 'TELEPHONE_TAB' THEN
    EXECUTE_TRIGGER('MNU_SHOW_PHONES');
  ELSIF tab_topmost = 'BIO_TAB' THEN
  	EXECUTE_TRIGGER('MNU_SHOW_BIO');
  ELSIF tab_topmost = 'EMAIL_TAB' THEN
  	EXECUTE_TRIGGER('MNU_SHOW_EMAIL');
  ELSIF tab_topmost = 'EMERGENCY_CONTACT_TAB' THEN
  	EXECUTE_TRIGGER('MNU_SHOW_EMRG');
  ELSIF tab_topmost = 'ADDITIONAL_ID_TAB' THEN
  	EXECUTE_TRIGGER('MNU_SHOW_ADDITIONAL_ID');
  END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Foaiden_tabChange()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					try {
						validateCurrentItem();
//						validateItem(getCurrentItem());
					} catch (Exception e) {
						goItem(toStr(getCursorItem()));
						throw new ApplicationException();
					}
					if ( tabTopmost.equals("CURRENT_ID_TAB") )
					{
						executeAction("MNU_SHOW_CURR_ID");
					}
					else if ( tabTopmost.equals("ALTERNATE_ID_TAB") ) {
						executeAction("PREVIOUS_NAME");
					}
					else if ( tabTopmost.equals("ADDRESS_TAB") ) {
						executeAction("ADDRESS");
					}
					else if ( tabTopmost.equals("TELEPHONE_TAB") ) {
						executeAction("MNU_SHOW_PHONES");
					}
					else if ( tabTopmost.equals("BIO_TAB") ) {
						executeAction("MNU_SHOW_BIO");
					}
					else if ( tabTopmost.equals("EMAIL_TAB") ) {
						executeAction("MNU_SHOW_EMAIL");
					}
					else if ( tabTopmost.equals("EMERGENCY_CONTACT_TAB") ) {
						executeAction("MNU_SHOW_EMRG");
					}
					else if ( tabTopmost.equals("ADDITIONAL_ID_TAB") ) {
						executeAction("MNU_SHOW_ADDITIONAL_ID");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.ENABLE_TAB_PAGES
		 DECLARE
	tab_page_id TAB_PAGE;
BEGIN
	tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ALTERNATE_ID_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('ADDRESS_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','ADDRESS_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','TELEPHONE_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('BIO_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','BIO_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','EMAIL_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('EMERGENCY_CONTACT_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_TRUE','EMERGENCY_CONTACT_TAB');
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
		 * FOAIDEN.ENABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TAB_PAGES")
		public void Foaiden_EnableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDRESS_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("TELEPHONE_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("BIO_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMERGENCY_CONTACT_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMERGENCY_CONTACT_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == false  )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.DISABLE_TAB_PAGES
		 DECLARE
	tab_page_id TAB_PAGE;
BEGIN
	tab_page_id := FIND_TAB_PAGE('ALTERNATE_ID_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ALTERNATE_ID_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('ADDRESS_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','ADDRESS_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','TELEPHONE_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('BIO_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','BIO_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('EMAIL_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','EMAIL_TAB');
		END IF;
	END IF;
--
	tab_page_id := FIND_TAB_PAGE('EMERGENCY_CONTACT_TAB');
	IF NOT ID_NULL(tab_page_id) THEN
		IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
      G$_TAB_SECURITY.G$_SET_TAB_PAGE_PROPERTY(tab_page_id,'ENABLED','PROPERTY_FALSE','EMERGENCY_CONTACT_TAB');
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
		 * FOAIDEN.DISABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TAB_PAGES")
		public void Foaiden_DisableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDRESS_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("TELEPHONE_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("BIO_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMERGENCY_CONTACT_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMERGENCY_CONTACT_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) == true )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.GLOBAL_TELE_COPY
		   IF (:global.NAVIGATE_TO_TAB = 'TELEPHONE' 
  	AND :SPRTELE_ATYP_CODE IS NOT NULL) THEN 
     :GLOBAL.VALUE := :SPRTELE.ROWID ;
     :global.atyp_code  := :sprtele_atyp_code;
     :global.seqno := :SPRTELE_ADDR_SEQNO;
     :global.tele_code := :SPRTELE_TELE_CODE;
     :global.tele_seqno := :SPRTELE.SPRTELE_SEQNO;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.GLOBAL_TELE_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_TELE_COPY")
		public void Foaiden_GlobalTeleCopy()
		{
			

				SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);

				if(sprteleElement!=null){
				if ((getGlobal("NAVIGATE_TO_TAB").equals("TELEPHONE") && !sprteleElement.getSprteleAtypCode().isNull()))
				{
					setGlobal("VALUE", sprteleElement.getROWID());
					setGlobal("ATYP_CODE", sprteleElement.getSprteleAtypCode());
					setGlobal("SEQNO", toStr(sprteleElement.getSprteleAddrSeqno()));
					setGlobal("TELE_CODE", sprteleElement.getSprteleTeleCode());
					setGlobal("TELE_SEQNO", toStr(sprteleElement.getSprteleSeqno()));
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.GLOBAL_ID_ERASE
		 IF :GLOBAL.KEY_IDNO IS NOT NULL THEN 
  IF GB_COMMON.F_ID_EXISTS( :KEY_BLOCK.ID ) = 'N' THEN
  	:key_block.id := null;
    :GLOBAL.KEY_IDNO := null;
  END IF;
END IF;
	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.GLOBAL_ID_ERASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_ID_ERASE")
		public void Foaiden_GlobalIdErase()
		{
			
				if ( !getGlobal("KEY_IDNO").isNull() )
				{
					if ( GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N") )
					{
						getFormModel().getKeyBlock().setId(toStr(null));
						setGlobal("KEY_IDNO", toStr(null));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_PHONES
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
		 * FOAIDEN.MNU_SHOW_PHONES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_PHONES")
		public void Foaiden_MnuShowPhones()
		{
			
			try {
				executeAction("CHECK_TO_SAVE");
			} catch (Exception e) {
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
					goBlock(toStr("SPRTELE"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_BIO
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
<multilinecomment>	IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
		-- Query Race data
    GO_BLOCK('GORPRAC');  
    :SYSTEM.MESSAGE_LEVEL := '5';
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL := '0';
  END IF;  </multilinecomment>

  -- Query Person data
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
		 * FOAIDEN.MNU_SHOW_BIO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_BIO")
		public void Foaiden_MnuShowBio()
		{
			
			try {
				executeAction("CHECK_TO_SAVE");
			} catch (Exception e) {
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
					// 	IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
					// -- Query Race data
					// GO_BLOCK('GORPRAC');
					// :SYSTEM.MESSAGE_LEVEL := '5';
					// EXECUTE_QUERY;
					// :SYSTEM.MESSAGE_LEVEL := '0';
					// END IF;  
					//  Query Person data
					goBlock(toStr("SPBPERS"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					// 
					//  Query Race/Ethnicity data
					// 
					if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
					{
						goBlock(toStr("GORPRAC"));
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						executeQuery();
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						goBlock(toStr("SPBPERS"));
					}
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_EMAIL
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
	:SYSTEM.MESSAGE_LEVEL := '5';
  GO_BLOCK('GOREMAL');
--  EXECUTE_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.MNU_SHOW_EMAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_EMAIL")
		public void Foaiden_MnuShowEmail()
		{
				try {
					executeAction("CHECK_TO_SAVE");
				} catch (Exception e) {
					goItem(toStr(getCursorItem()));
					throw new ApplicationException();
				}
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					goBlock(toStr("GOREMAL"));
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_EMRG
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPREMRG');
  EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.MNU_SHOW_EMRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_EMRG")
		public void Foaiden_MnuShowEmrg()
		{
					try {
						executeAction("CHECK_TO_SAVE");
					} catch (Exception e) {
						goItem(toStr(getCursorItem()));
						throw new ApplicationException();
					}
					goBlock(toStr("SPREMRG"));
					executeQuery();
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_CURR_ID
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPRIDEN_CURRENT');
  EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FOAIDEN.MNU_SHOW_CURR_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_CURR_ID")
		public void Foaiden_MnuShowCurrId()
		{
			
					try {
						executeAction("CHECK_TO_SAVE");
					} catch (Exception e) {
						goItem(toStr(getCursorItem()));
						throw new ApplicationException();
					}
					goBlock(toStr("SPRIDEN_CURRENT"));
					executeQuery();
				
			}

		
		/* Original PL/SQL code code for TRIGGER FOAIDEN.MNU_SHOW_ADDITIONAL_ID
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
		 * FOAIDEN.MNU_SHOW_ADDITIONAL_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="MNU_SHOW_ADDITIONAL_ID")
		public void Foaiden_MnuShowAdditionalId()
		{
			
			try {
				executeAction("CHECK_TO_SAVE");
			} catch (Exception e) {
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
					goBlock(toStr("GORADID"));
					try { 
					MessageServices.setMessageLevel(MessageLevel.NONE);
					executeQuery();
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
				
			}

		
	
}
	
