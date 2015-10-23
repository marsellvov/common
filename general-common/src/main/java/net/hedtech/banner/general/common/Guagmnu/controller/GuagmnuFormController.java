package net.hedtech.banner.general.common.Guagmnu.controller;
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
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.banner.general.common.Guagmnu.services.*;
import net.hedtech.banner.general.common.Guagmnu.services.UnknownTypes;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
//import net.hedtech.banner.general.common.Guagmnu.services.MenuType;	
		

public class GuagmnuFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
//	private MenuType getMenuType() {
//		return (net.hedtech.banner.general.common.Guagmnu.services.MenuType) this.getTask().getTaskPart("GUAGMNU").getSupportCodeManager().getPackage("MENU_TYPE");
//	}	
//		
	
	
	public GuagmnuFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GuagmnuTask getTask() {
		return (GuagmnuTask)super.getTask();
	}
	
	
	public GuagmnuModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Guagmnu_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Guagmnu_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Guagmnu_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Guagmnu_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Guagmnu_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Guagmnu_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Guagmnu_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Guagmnu_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Guagmnu_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Guagmnu_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Guagmnu_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Guagmnu_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Guagmnu_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Guagmnu_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Guagmnu_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Guagmnu_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Guagmnu_WhenNewBlockInstanceTrg()
		{
			
				getGFormClass().whenNewBlockInstanceTrg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN-WINDOW-ACTIVATED
		 BEGIN
  DO_NEW_MESSAGES_EXIST(:GLOBAL.current_user1);
--
 	SHOW_VIEW('GO_CANVAS');
  SHOW_VIEW('TREE_CANVAS');
  SHOW_VIEW('MESSAGES_CANVAS');
  SHOW_VIEW('LINKS_CANVAS');
--
  IF NOT G$_DO_WIN_ACTIVATED THEN
    RETURN;
  END IF;
--
  G$_WIN_ACTIVATED;
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('WHEN_WINDOW_ACTIVATED_TRG');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Guagmnu_WhenWindowActivated()
		{
			
				this.getTask().getServices().doNewMessagesExist(getGlobal("CURRENT_USER1"));
				// 
				showView("GO_CANVAS");
				showView("TREE_CANVAS");
				showView("MESSAGES_CANVAS");
				showView("LINKS_CANVAS");
				// 
				if ( getTask().getGoqrpls().gDoWinActivated().not() )
				{
					return ;
				}
				// 
				getTask().getGoqrpls().gWinActivated();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("WHEN_WINDOW_ACTIVATED_TRG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Guagmnu_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Guagmnu_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Guagmnu_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Guagmnu_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Guagmnu_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Guagmnu_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Guagmnu_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Guagmnu_NextBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-PRVBLK
		 PREVIOUS_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Guagmnu_PreviousBlock()
		{
			
				previousBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-PRVREC
		 BEGIN
  DO_KEY('PREVIOUS_ITEM');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Guagmnu_PreviousRecord()
		{
			
				executeAction("PREVIOUS_ITEM");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Guagmnu_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Guagmnu_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Guagmnu_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Guagmnu_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Guagmnu_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Guagmnu_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Guagmnu_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Guagmnu_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Guagmnu_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Guagmnu_GlobalCopy()
		{
			
				getGFormClass().globalCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Guagmnu_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Guagmnu_SaveKeys()
		{
			
				getGFormClass().saveKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Guagmnu_EnableKeys()
		{
			
				getGFormClass().enableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Guagmnu_DisableKeys()
		{
			
				getGFormClass().disableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Guagmnu_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Guagmnu_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.POST-BLOCK
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Guagmnu_blockOut()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.PRE-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Guagmnu_blockIn()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.QUERY_DATA
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="QUERY_DATA")
//		public void Guagmnu_QueryData()
//		{
//			
//				getMenuType().queryData();
//			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN-NEW-BLOCK-INSTANCE
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Guagmnu_blockChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.PRE-FORM
		 BEGIN
  EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
  G$_CHECK_FAILURE;
--
  IF :GLOBAL.current_user1 = 'BASELINE' THEN
    BASELINE_USER_MSG;
  END IF;
--
  GET_CANVAS_COLORS;
  SET_CANVAS_COLORS;
  SET_URL_ITEMS;
  G$_MENU_BAR.SET_FGAC_NOTICE;
--
  G$_NVA_SET_SEPARATOR_LINE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Guagmnu_TaskStartedPre(EventObject args)
		{
			
				executeAction("G$_VERIFY_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getGlobal("CURRENT_USER1").equals("BASELINE") )
				{
					this.getTask().getServices().baselineUserMsg();
				}
				// 
				this.getTask().getServices().getCanvasColors();
				this.getTask().getServices().setCanvasColors();
				this.getTask().getServices().setUrlItems();
				getTask().getGoqrpls().getGMenuBar().setFgacNotice();
				// 
				getTask().getGoqrpls().gNvaSetSeparatorLine();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN-NEW-FORM-INSTANCE
		 BEGIN
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
--  :FORM_HEADER.WELCOME_USER := G$_NLS.Get('GUAGMNU-0001','FORM','Welcome, %01%',:GLOBAL.current_user1);
  :FORM_HEADER.WELCOME_USER := SUBSTR(G$_NLS.Get('GUAGMNU-0000','FORM','Welcome, %01%.',:GLOBAL.LOGON_GREETING_NAME),1,90);
--
-- Determine which products are installed
--
  POPULATE_INSTALLED_LIST;
--
  SET_WINDOW_PROPERTY('MAIN_WINDOW',WINDOW_STATE,MAXIMIZE);
--
  :FORM_HEADER.tree_pop := 'N';
  :FORM_HEADER.pop_temps_ind := 'N';
--
  :CURRENT_LEVEL := 0;
--
-- 4000-11 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to create a 
--         timer that will poll for valid tasks and activities sent from SCT Workflow.
--
--         If Workflow is not installed or is not enabled at a client site, the 
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform any Workflow function.
--
-- 4100-3  Move "make timer" logic so that it executes before START_UP_MENU, as that local
--         procedure is being modified to check for the existence of the timer to determine 
--         whether another set of logic should be performed.
--
  IF NVL(:GLOBAL.WF_ENABLED_IND,'N') = 'Y' THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_MAKE_TIMER');
  END IF;
--  
  E$_IMG_UTIL.P_PRE_FORM_TRIGGER_DRIVER;    
--
 	SHOW_VIEW('GO_CANVAS');
  SHOW_VIEW('TREE_CANVAS');
  MESSAGE(G$_NLS.Get('GUAGMNU-0001','FORM','Please Wait ... Building Your Menu ...'),NO_ACKNOWLEDGE);
--
  EXECUTE_TRIGGER('POPULATE_ROOT_TREE');
  CLEAR_MESSAGE;
--
  READ_IMAGE_FILES;
  QUERY_BROADCAST_MSGS;
--
  GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SEARCH_BTN',ENABLED,PROPERTY_TRUE);
  :FORM_HEADER.tree_pop := 'N';
--
  :GLOBAL.UI_BUTTON_COLOR := G$_GET_UPRF_BUTTON_COLOR;
  :GLOBAL.UI_CANVAS_COLOR := G$_GET_UPRF_CANVAS_COLOR;
  :GLOBAL.UI_CODE_PROMPT_COLOR := G$_GET_UPRF_CODE_PROMPT_COLOR;
  :GLOBAL.UI_PROMPT_COLOR := G$_GET_UPRF_PROMPT_COLOR;
  :GLOBAL.UI_RECORD_COLOR := G$_GET_UPRF_RECORD_COLOR;
  :GLOBAL.UI_SCROLLBAR_COLOR := G$_GET_UPRF_SCROLLBAR_COLOR;
  :GLOBAL.UI_WINDOW_COLOR := G$_GET_UPRF_CANVAS_COLOR;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Guagmnu_TaskStarted(EventObject args)
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				executeAction("LOAD_FORM_HEADER");
				//   :FORM_HEADER.WELCOME_USER := G$_NLS.Get('GUAGMNU-0001','FORM','Welcome, %01%',:GLOBAL.current_user1);
				getFormModel().getFormHeader().setWelcomeUser(substring(GNls.Fget(toStr("GUAGMNU-0000"), toStr("FORM"), toStr("Welcome, %01%."), getGlobal("LOGON_GREETING_NAME")), toInt(1), toInt(90)));
				// 
				//  Determine which products are installed
				// 
				this.getTask().getServices().populateInstalledList();
				// 
				// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_STATE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE".
				//				SupportClasses.FORMS4W.SetWindowProperty("MAIN_WINDOW", SupportClasses.Property.WINDOW_STATE, WindowState.Maximized);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_STATE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE'.");
				
				
				// 
				getFormModel().getFormHeader().setTreePop(toStr("N"));
				getFormModel().getFormHeader().setPopTempsInd(toStr("N"));
				// 
				getFormModel().getFormHeader().setCurrentLevel(toNumber(0));
				// 
				//  4000-11 Add the following call to the G$_WF_DRIVER.WF_EXECUTE procedure to create a 
				//          timer that will poll for valid tasks and activities sent from SCT Workflow.
				// 
				//          If Workflow is not installed or is not enabled at a client site, the 
				//          G$_WF_DRIVER.WF_EXECUTE procedure will not perform any Workflow function.
				// 
				//  4100-3  Move "make timer" logic so that it executes before START_UP_MENU, as that local
				//          procedure is being modified to check for the existence of the timer to determine 
				//          whether another set of logic should be performed.
				// 
				if ( isNull(getGlobal("WF_ENABLED_IND"), "N").equals("Y") )
				{
					getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_MAKE_TIMER"));
				}
				//   
				getTask().getEoqrpls().getEImgUtil().pPreFormTriggerDriver();
				// 
				showView("GO_CANVAS");
				showView("TREE_CANVAS");
				infoMessage(GNls.Fget(toStr("GUAGMNU-0001"), toStr("FORM"), toStr("Please Wait ... Building Your Menu ...")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				// 
				executeAction("POPULATE_ROOT_TREE");
				clearMessage();
				// 
				this.getTask().getServices().readImageFiles();
				this.getTask().getServices().queryBroadcastMsgs(messagesElement);
				// 
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
				setItemEnabled("BUTTON_CONTROL_BLOCK.SEARCH_BTN", true);
				getFormModel().getFormHeader().setTreePop(toStr("N"));
				// 
				setGlobal("UI_BUTTON_COLOR", getTask().getGoqrpls().gGetUprfButtonColor());
				setGlobal("UI_CANVAS_COLOR", getTask().getGoqrpls().gGetUprfCanvasColor());
				setGlobal("UI_CODE_PROMPT_COLOR", getTask().getGoqrpls().gGetUprfCodePromptColor());
				setGlobal("UI_PROMPT_COLOR", getTask().getGoqrpls().gGetUprfPromptColor());
				setGlobal("UI_RECORD_COLOR", getTask().getGoqrpls().gGetUprfRecordColor());
				setGlobal("UI_SCROLLBAR_COLOR", getTask().getGoqrpls().gGetUprfScrollbarColor());
				setGlobal("UI_WINDOW_COLOR", getTask().getGoqrpls().gGetUprfCanvasColor());
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.LOAD_FORM_HEADER
		 BEGIN
  :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
  :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
  EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
--
  :GLOBAL.CURRENT_RELEASE := :CURRENT_RELEASE;
  :GLOBAL.SELECTFRM  := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Guagmnu_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				executeAction("LOAD_CURRENT_RELEASE");
				// 
				setGlobal("CURRENT_RELEASE", getFormModel().getFormHeader().getCurrentRelease());
				setGlobal("SELECTFRM", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.4.2';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Guagmnu_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.POST-FORM
		 BEGIN
  EXECUTE_TRIGGER('PURGE_DATA_EXTRACT_OUTD');
-- -- With General7.4 the Data Extract was modified to not write to the GUBOUTP/GUROUTP
-- -- tables; but instead write to GUBOUTD/GUROUTD tables.  However, with General7.4 the
-- -- Finance FGAGASB data extract has not been modified away from the GUBOUTP/GUROUTP tables.
  IF :GLOBAL.FINSYS = 'Y' THEN
    EXECUTE_TRIGGER('PURGE_DATA_EXTRACT');
  END IF;
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
EXCEPTION
  WHEN OTHERS THEN NULL;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Guagmnu_TaskEnded(EventObject args)
		{
			
				try
				{
					executeAction("PURGE_DATA_EXTRACT_OUTD");
					//  -- With General7.4 the Data Extract was modified to not write to the GUBOUTP/GUROUTP
					//  -- tables; but instead write to GUBOUTD/GUROUTD tables.  However, with General7.4 the
					//  -- Finance FGAGASB data extract has not been modified away from the GUBOUTP/GUROUTP tables.
					if ( getGlobal("FINSYS").equals("Y") )
					{
						executeAction("PURGE_DATA_EXTRACT");
					}
 
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
				}
				catch(Exception  e)
				{
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.PURGE_DATA_EXTRACT
		 DECLARE
  alert_btn   NUMBER;
	rec_count   NUMBER := 0;
  session_no  NUMBER := TO_NUMBER(:GLOBAL.SESSION_ID);
  user_id_no  NUMBER := TO_NUMBER(:GLOBAL.NUMERIC_USER_ID);
BEGIN
  SELECT COUNT(*)
    INTO rec_count
    FROM GUROUTP
   WHERE GUROUTP_USER_NUM = user_id_no
     AND GUROUTP_FILE_NUMBER = session_no;
--
  IF rec_count > 0 THEN
--
-- If alot of records, warn user
--
    IF rec_count > 500 THEN
      alert_btn := G$_DISPLAY_ALERT('G$_BANNER_ALERT',
                           G$_NLS.Get('GUAGMNU-0002','FORM','There may be a delay exiting caused by the removal of FGAGASB data extracted during this session.'));
    END IF;
--
    DELETE FROM GUROUTP
      WHERE GUROUTP_USER_NUM = user_id_no
    	  AND GUROUTP_FILE_NUMBER = session_no;
--
    DELETE FROM GUBOUTP
      WHERE GUBOUTP_USER_NUM = user_id_no
    	  AND GUBOUTP_FILE_NUMBER = session_no;
--
    FORMS_DDL('BEGIN COMMIT; END;');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PURGE_DATA_EXTRACT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PURGE_DATA_EXTRACT")
		public void Guagmnu_PurgeDataExtract()
		{
			
				int rowCount = 0;
				{
					NNumber alertBtn= NNumber.getNull();
					NNumber recCount = toNumber(0);
					NNumber sessionNo = toNumber(getGlobal("SESSION_ID"));
					NNumber userIdNo = toNumber(getGlobal("NUMERIC_USER_ID"));
					String sql1 = "SELECT COUNT(*) " +
	" FROM GUROUTP " +
	" WHERE GUROUTP_USER_NUM = :P_USER_ID_NO AND GUROUTP_FILE_NUMBER = :P_SESSION_NO ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("P_USER_ID_NO", userIdNo);
					command1.addParameter("P_SESSION_NO", sessionNo);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						recCount = results1.getNumber(0);
					}
					results1.close();
					// 
					if ( recCount.greater(0) )
					{
						// 
						//  If alot of records, warn user
						// 
						if ( recCount.greater(500) )
						{
							alertBtn = getTask().getGoqrpls().gDisplayAlert(toStr("G$_BANNER_ALERT"), GNls.Fget(toStr("GUAGMNU-0002"), toStr("FORM"), toStr("There may be a delay exiting caused by the removal of FGAGASB data extracted during this session.")));
						}
						// 
						String sql2 = "DELETE FROM GUROUTP " +
	" WHERE GUROUTP_USER_NUM = :P_USER_ID_NO AND GUROUTP_FILE_NUMBER = :P_SESSION_NO";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("P_USER_ID_NO", userIdNo);
						command2.addParameter("P_SESSION_NO", sessionNo);
						rowCount = command2.execute();
						// 
						String sql3 = "DELETE FROM GUBOUTP " +
	" WHERE GUBOUTP_USER_NUM = :P_USER_ID_NO AND GUBOUTP_FILE_NUMBER = :P_SESSION_NO";
						DataCommand command3 = new DataCommand(sql3);
						//Setting query parameters
						command3.addParameter("P_USER_ID_NO", userIdNo);
						command3.addParameter("P_SESSION_NO", sessionNo);
						rowCount = command3.execute();
						// 
						formsDDL("BEGIN COMMIT; END;");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.PURGE_DATA_EXTRACT_OUTD
		 DECLARE
  alert_btn   NUMBER;
	rec_count   NUMBER := 0;
  session_no  NUMBER := TO_NUMBER(:GLOBAL.SESSION_ID);
  user_id_no  NUMBER := TO_NUMBER(:GLOBAL.NUMERIC_USER_ID);
BEGIN
  SELECT COUNT(*)
    INTO rec_count
    FROM GUROUTD
   WHERE GUROUTD_USER_NUM = user_id_no
     AND GUROUTD_FILE_NUMBER = session_no;
--
  IF rec_count > 0 THEN
--
-- If alot of records, warn user
--
    IF rec_count > 500 THEN
      alert_btn := G$_DISPLAY_ALERT('G$_BANNER_ALERT',
                           G$_NLS.Get('GUAGMNU-0003','FORM','There may be a delay exiting caused by the removal of data extracted during this session.'));
    END IF;
--
    DELETE FROM GUROUTD
      WHERE GUROUTD_USER_NUM = user_id_no
      AND GUROUTD_FILE_NUMBER = session_no;
--
    DELETE FROM GUBOUTD
      WHERE GUBOUTD_USER_NUM = user_id_no
      AND GUBOUTD_FILE_NUMBER = session_no;
--
    FORMS_DDL('BEGIN COMMIT; END;');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.PURGE_DATA_EXTRACT_OUTD
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PURGE_DATA_EXTRACT_OUTD")
		public void Guagmnu_PurgeDataExtractOutd()
		{
			
				int rowCount = 0;
				{
					NNumber alertBtn= NNumber.getNull();
					NNumber recCount = toNumber(0);
					NNumber sessionNo = toNumber(getGlobal("SESSION_ID"));
					NNumber userIdNo = toNumber(getGlobal("NUMERIC_USER_ID"));
					String sql1 = "SELECT COUNT(*) " +
	" FROM GUROUTD " +
	" WHERE GUROUTD_USER_NUM = :P_USER_ID_NO AND GUROUTD_FILE_NUMBER = :P_SESSION_NO ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("P_USER_ID_NO", userIdNo);
					command1.addParameter("P_SESSION_NO", sessionNo);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						recCount = results1.getNumber(0);
					}
					results1.close();
					// 
					if ( recCount.greater(0) )
					{
						// 
						//  If alot of records, warn user
						// 
						if ( recCount.greater(500) )
						{
							alertBtn = getTask().getGoqrpls().gDisplayAlert(toStr("G$_BANNER_ALERT"), GNls.Fget(toStr("GUAGMNU-0003"), toStr("FORM"), toStr("There may be a delay exiting caused by the removal of data extracted during this session.")));
						}
						// 
						String sql2 = "DELETE FROM GUROUTD " +
	" WHERE GUROUTD_USER_NUM = :P_USER_ID_NO AND GUROUTD_FILE_NUMBER = :P_SESSION_NO";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("P_USER_ID_NO", userIdNo);
						command2.addParameter("P_SESSION_NO", sessionNo);
						rowCount = command2.execute();
						// 
						String sql3 = "DELETE FROM GUBOUTD " +
	" WHERE GUBOUTD_USER_NUM = :P_USER_ID_NO AND GUBOUTD_FILE_NUMBER = :P_SESSION_NO";
						DataCommand command3 = new DataCommand(sql3);
						//Setting query parameters
						command3.addParameter("P_USER_ID_NO", userIdNo);
						command3.addParameter("P_SESSION_NO", sessionNo);
						rowCount = command3.execute();
						// 
						formsDDL("BEGIN COMMIT; END;");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN_WINDOW_ACTIVATED_TRG
		 DECLARE
	win_title   VARCHAR2(200) := GET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE);
  lv_day      VARCHAR2(200)  := TO_CHAR( SYSDATE,'DL');
BEGIN
  IF INSTR(win_title,lv_day) = 0 THEN
    SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,win_title 
		                         || G$_NLS.Get('GUAGMNU-0004','FORM',' - %01% - Last login %02%',lv_day,:GLOBAL.LAST_LOGON_TIME)
		                       );
    
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Guagmnu_WhenWindowActivatedTrg()
		{
			
				{
					NString winTitle = getWindowTitle("MAIN_WINDOW");
					NString lvDay = toChar(NDate.getNow(), "DL");
					if ( inStr(winTitle, lvDay).equals(0) )
					{
						setWindowTitle("MAIN_WINDOW", winTitle.append(GNls.Fget(toStr("GUAGMNU-0004"), toStr("FORM"), toStr(" - %01% - Last login %02%"), lvDay, getGlobal("LAST_LOGON_TIME"))));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN-MOUSE-DOUBLECLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Guagmnu_doubleClick()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WHEN-TIMER-EXPIRED
		 <multilinecomment>
DECLARE
  NAME_OF_TIMER  VARCHAR2(80) := GET_APPLICATION_PROPERTY(TIMER_NAME);
BEGIN
  DEFAULT_VALUE('Banner','GLOBAL.HEADING');
--
  G$_TIMER_EXP;
  G$_CHECK_FAILURE;
--
-- 4000-11 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE procedure to check
--         for a valid task or activity sent via SCT Workflow and, if found, launch the SCT Banner 
--         object associated with that task or activity.
--
--         If Workflow is not installed or enabled at a client site, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform any Workflow function.
--
  IF NAME_OF_TIMER = G$_WF_DRIVER.WF_TIMER_NAME THEN
    G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG');
  END IF;
END;
</multilinecomment>
DECLARE
  NAME_OF_TIMER  VARCHAR2(80) := GET_APPLICATION_PROPERTY(TIMER_NAME);
BEGIN
  CASE NAME_OF_TIMER
--
    WHEN 'RESTART_SESSION' THEN 
      COPY('Y','GLOBAL.EXIT_TO_MENU');
      COPY('Y','GLOBAL.EXIT_BANNER');
      COPY('Y','GLOBAL.RESTART_SESSION');
      RESTART_SESSION;
--
-- 4000-11 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE procedure to check
--         for a valid task or activity sent via SCT Workflow and, if found, launch the SCT Banner 
--         object associated with that task or activity.
--
--         If Workflow is not installed or enabled at a client site, the
--         G$_WF_DRIVER.WF_EXECUTE procedure will not perform any Workflow function.
--
    WHEN G$_WF_DRIVER.WF_TIMER_NAME THEN
      G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG');
--
    ELSE NULL;
--
  END CASE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Guagmnu_WhenTimerExpired(NString timerName)
		{
			
				// DECLARE
				// NAME_OF_TIMER  VARCHAR2(80) := GET_APPLICATION_PROPERTY(TIMER_NAME);
				// BEGIN
				// DEFAULT_VALUE('Banner','GLOBAL.HEADING');
				// --
				// G$_TIMER_EXP;
				// G$_CHECK_FAILURE;
				// --
				// -- 4000-11 Add the following conditional call to the G$_WF_DRIVER.WF_EXECUTE procedure to check
				// --         for a valid task or activity sent via SCT Workflow and, if found, launch the SCT Banner
				// --         object associated with that task or activity.
				// --
				// --         If Workflow is not installed or enabled at a client site, the
				// --         G$_WF_DRIVER.WF_EXECUTE procedure will no. perform any Workflow function.
				// --
				// IF NAME_OF_TIMER = G$_WF_DRIVER.WF_TIMER_NAME THEN
				// G$_WF_DRIVER.WF_EXECUTE('WF_CHECK_MSG');
				// END IF;
				// END;
				{
					//NString nameOfTimer = SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.TIMER_NAME);
					NString nameOfTimer = timerName;
					if (nameOfTimer.equals("RESTART_SESSION"))
					{
						copy("Y","GLOBAL.EXIT_TO_MENU");
						copy("Y","GLOBAL.EXIT_BANNER");
						copy("Y","GLOBAL.RESTART_SESSION");
						this.getTask().getServices().restartSession();
					}
					else if (nameOfTimer.equals(getTask().getGoqwflw().getGWfDriver().WF_TIMER_NAME))
					{
						getTask().getGoqwflw().getGWfDriver().wfExecute(toStr("WF_CHECK_MSG"));
					}
					else {
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ON-ERROR
		 DECLARE
  ALERT_BUTTON NUMBER;
  SQL_NUM      NUMBER        := SQLCODE;
  SQL_MSG      VARCHAR2(240) := SQLERRM;
--
  ERR_NUM      NUMBER        := ERROR_CODE;
  ERR_MSG      VARCHAR2(240) := ERROR_TEXT;
  ERR_TYP      VARCHAR2(3)   := ERROR_TYPE;
--
  lv_dbms_code NUMBER        := 0;
BEGIN
--
-- Check to see if the user has been disconnected.
--
  IF lv_dbms_code = -1012 OR lv_dbms_code = -2396 OR lv_dbms_code = -3114 OR
     INSTR(ERR_MSG,'1012') > 0 OR
   	 INSTR(ERR_MSG,'2396') > 0 OR
   	 INSTR(ERR_MSG,'3114') > 0 THEN
    G$_RECONNECT;
    G$_CHECK_FAILURE;
  ELSE
--
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
--
    IF ERR_TYP = 'FRM' THEN
      IF ERR_NUM = 40010 THEN
        MESSAGE(G$_NLS.Get('GUAGMNU-0005','FORM','*WARNING* Invalid object name entered, check your spelling and try again.'));
      ELSIF ERR_NUM = 40505 OR ERR_NUM = 40735 THEN
        IF SQL_NUM = -3114 THEN
          ALERT_BUTTON := 
             G$_DISPLAY_ALERT('G$_WARNING_ALERT',G$_NLS.Get('GUAGMNU-0006','FORM','*NOTE* Database connection lost, you must exit BANNER.'));
          EXECUTE_TRIGGER('DISABLE_BUTTONS');
        END IF;
      ELSIF ERR_NUM = 40514 THEN
        ALERT_BUTTON := 
           G$_DISPLAY_ALERT('G$_WARNING_ALERT',G$_NLS.Get('GUAGMNU-0007','FORM','*NOTE* Database connection lost, you must exit BANNER.'));
        EXECUTE_TRIGGER('DISABLE_BUTTONS');
      ELSE
        MESSAGE(ERR_TYP || '-' || TO_CHAR(ERR_NUM) || ': ' || ERR_MSG);
      END IF;
    ELSE
      MESSAGE(ERR_TYP || '-' || TO_CHAR(ERR_NUM) || ': ' || ERR_MSG);
    END IF;
  END IF;
--
  RETURN;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Guagmnu_OnError(EventObject args)
		{
			
				{
					NNumber alertButton= NNumber.getNull();
					NNumber sqlNum = errorCode();
					NString sqlMsg = errorMessage();
					// 
//					NNumber errNum = SupportClasses.SQLFORMS.ErrorCode();
//					NString errMsg = SupportClasses.SQLFORMS.ErrorText();
//					NString errTyp = SupportClasses.SQLFORMS.ErrorType();
					// 
					NNumber errNum=NNumber.getNull();
					NString errMsg=NString.getNull();
					NString errTyp=NString.getNull();
					NNumber lvDbmsCode = toNumber(0);
					// 
					//  Check to see if the user has been disconnected.
					// 
					if ( lvDbmsCode.equals(- (1012)) || lvDbmsCode.equals(- (2396)) || lvDbmsCode.equals(- (3114)) || inStr(errMsg, toStr("1012")).greater(0) || inStr(errMsg, toStr("2396")).greater(0) || inStr(errMsg, toStr("3114")).greater(0) )
					{
						getTask().getGoqrpls().gReconnect();
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						// 
						executeAction("G$_VERIFY_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						// 
						if ( errTyp.equals("FRM") )
						{
							if ( errNum.equals(40010) )
							{
								warningMessage(GNls.Fget(toStr("GUAGMNU-0005"), toStr("FORM"), toStr("*WARNING* Invalid object name entered, check your spelling and try again.")));
							}
							else if ( errNum.equals(40505) || errNum.equals(40735) ) {
								if ( sqlNum.equals(- (3114)) )
								{
									alertButton = getTask().getGoqrpls().gDisplayAlert(toStr("G$_WARNING_ALERT"), GNls.Fget(toStr("GUAGMNU-0006"), toStr("FORM"), toStr("*NOTE* Database connection lost, you must exit BANNER.")));
									executeAction("DISABLE_BUTTONS");
								}
							}
							else if ( errNum.equals(40514) ) {
								alertButton = getTask().getGoqrpls().gDisplayAlert(toStr("G$_WARNING_ALERT"), GNls.Fget(toStr("GUAGMNU-0007"), toStr("FORM"), toStr("*NOTE* Database connection lost, you must exit BANNER.")));
								executeAction("DISABLE_BUTTONS");
							}
							else {
								message(errTyp.append("-").append(toChar(errNum)).append(": ").append(errMsg));
							}
						}
						else {
							message(errTyp.append("-").append(toChar(errNum)).append(": ").append(errMsg));
						}
					}
					// 
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.CHECK_TYPE
		 DECLARE
  lv_first_char VARCHAR2(1);
  lv_selection  VARCHAR2(30) := :KEY_BLOCK.NEXT_SELECTION;
  lv_valid_menu VARCHAR2(1);
--
  CURSOR valid_pers_menu_c (p_value VARCHAR2) IS
    SELECT 'Y'
      FROM GUTPMNU
     WHERE GUTPMNU_VALUE = 'MENU|' || p_value;
--
  CURSOR valid_prod_menu_c (p_value VARCHAR2) IS
    SELECT 'Y'
      FROM GUTMENU
     WHERE GUTMENU_VALUE = p_value;
--
  CURSOR valid_proc_menu_c (p_value VARCHAR2) IS
    SELECT 'Y'
      FROM GURMENU
     WHERE GURMENU_NAME = p_value
       AND ROWNUM = 1;
--
BEGIN
  IF lv_selection IS NULL THEN
    RETURN;
  END IF;
--
-- Determine what was entered and what to do with it.
--
  CASE 
    WHEN lv_selection IN ('EXIT','QUIT') THEN 
      CONFIRM_B2K_EXIT;
--
    WHEN lv_selection = 'GUAINIT' THEN 
      MESSAGE(G$_NLS.GET('GUAGMNU-0008','FORM','*ERROR* GUAINIT has already been run for this Banner session.'));
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN lv_selection IN ('GUAGMNU','*MAIN') THEN
      MESSAGE(G$_NLS.GET('GUAGMNU-0009','FORM','*ERROR* Menu is already running; cannot start up another copy.'));
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN lv_selection IN ('*PROCESS','*PROCESS1','*PROCESS2','*PROCESS3','*PROCESS4') THEN
      EXECUTE_TRIGGER('WAS_PROCESS_MENU_LOADED');
--
      IF lv_selection = '*PROCESS' THEN
        NAVIGATE_TREE('',lv_selection);
      ELSE
        NAVIGATE_TREE(lv_selection,'*PROCESS');
      END IF;
--
      :KEY_BLOCK.NEXT_SELECTION := '';
      GO_BLOCK('TREE');
      RETURN;
--
-- Handle what else it could be
--
    ELSE
      :KEY_BLOCK.CALLFLD := lv_selection;
      :GLOBAL.SELECTFRM  := lv_selection;
--
-- Find product code for object called
--
      CASE LENGTH(lv_selection)
        WHEN 7 THEN :KEY_BLOCK.FORM_LEADING_EDGE := SUBSTR(lv_selection,1,1);
        ELSE        :KEY_BLOCK.FORM_LEADING_EDGE := SUBSTR(lv_selection,1,2);
      END CASE;
--
-- If not a menu, verify valid character
--
      lv_first_char := SUBSTR(:KEY_BLOCK.FORM_LEADING_EDGE,1,1);
      IF lv_first_char  <> '*' THEN
        IF lv_first_char NOT BETWEEN 'A' AND 'Z' THEN
          MESSAGE(G$_NLS.GET('GUAGMNU-0010','FORM','*ERROR* Objects must begin with a letter.'));
          RAISE FORM_TRIGGER_FAILURE;
        END IF;
--
-- If a menu, verify it is valid, first on the user's personal menu, then on the product menu,
-- then on any menu.
--
      ELSE	
--
        IF lv_selection = '*SECURITY' THEN
        	IF SUBSTR(USER,1,7) <> 'BANSECR' THEN
        		MESSAGE(G$_NLS.GET('GUAGMNU-0011','FORM','*ERROR* The menu entered is not valid for this user.'));
            RAISE FORM_TRIGGER_FAILURE;       		
        	END IF;
        END IF;
--
        IF lv_selection NOT IN ('*PERSONAL','*MENU','*SECURITY') THEN
--
-- Personal menu check
--
          OPEN valid_pers_menu_c(lv_selection);
          FETCH valid_pers_menu_c INTO lv_valid_menu;
          CLOSE valid_pers_menu_c;
--
-- Product menu check
--
          IF NVL(lv_valid_menu,'N') <> 'Y' THEN
            OPEN valid_prod_menu_c(lv_selection);
            FETCH valid_prod_menu_c INTO lv_valid_menu;
            CLOSE valid_prod_menu_c;
--
-- Any valid menu check, probably a process menu
--
            IF NVL(lv_valid_menu,'N') <> 'Y' THEN
              OPEN valid_proc_menu_c(lv_selection);
              FETCH valid_proc_menu_c INTO lv_valid_menu;
              CLOSE valid_proc_menu_c;
--
-- Not found
--
              IF NVL(lv_valid_menu,'N') <> 'Y' THEN
                MESSAGE(G$_NLS.GET('GUAGMNU-0012','FORM','*ERROR* %01% is an invalid menu.',lv_selection));
                RAISE FORM_TRIGGER_FAILURE;
--
-- Found, does it contain a period like the process menus, if so, check if it needs to be loaded.
--
              ELSE
                IF INSTR(lv_selection,'.') > 0 THEN
                  EXECUTE_TRIGGER('WAS_PROCESS_MENU_LOADED');
                ELSE
                  MESSAGE(G$_NLS.GET('GUAGMNU-0013','FORM','*WARNING* The menu entered is valid but is not included as part of a personal or product menu.'));
                  RAISE FORM_TRIGGER_FAILURE;
                END IF;
              END IF;
--
            END IF;
          END IF;
        END IF;
      END IF;
--
      EXECUTE_TRIGGER('CALL_ROUTINE');
      G$_CHECK_FAILURE;
--
      EXECUTE_TRIGGER('INIT_NEXT_SELECTION');
      IF NOT FORM_SUCCESS THEN
        NULL;
      END IF;
--
    END CASE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.CHECK_TYPE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TYPE")
		public void Guagmnu_CheckType()
		{
			
				int rowCount = 0;
				{
					NString lvFirstChar= NString.getNull();
					NString lvSelection = getFormModel().getKeyBlock().getNextSelection();
					NString lvValidMenu= NString.getNull();
					String sqlvalidPersMenuC = "SELECT 'Y' " +
	" FROM GUTPMNU " +
	" WHERE GUTPMNU_VALUE = 'MENU|' || :P_P_VALUE ";
					DataCursor validPersMenuC = new DataCursor(sqlvalidPersMenuC);
					String sqlvalidProdMenuC = "SELECT 'Y' " +
	" FROM GUTMENU " +
	" WHERE GUTMENU_VALUE = :P_P_VALUE ";
					DataCursor validProdMenuC = new DataCursor(sqlvalidProdMenuC);
					String sqlvalidProcMenuC = "SELECT 'Y' " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_P_VALUE AND ROWNUM = 1 ";
					DataCursor validProcMenuC = new DataCursor(sqlvalidProcMenuC);
					NString pValue = NString.getNull();
					try {
						if ( lvSelection.isNull() )
						{
							return ;
						}
						// 
						//  Determine what was entered and what to do with it.
						// 
						if (in(lvSelection, "EXIT", "QUIT").getValue() ==(lvSelection.equals("GUAINIT")))
						{
							errorMessage(GNls.Fget(toStr("GUAGMNU-0008"), toStr("FORM"), toStr("*ERROR* GUAINIT has already been run for this Banner session.")));
							throw new ApplicationException();
						}
						else if (in(lvSelection, "EXIT", "QUIT").getValue() ==(in(lvSelection, "GUAGMNU", "*MAIN").getValue()))
						{
							errorMessage(GNls.Fget(toStr("GUAGMNU-0009"), toStr("FORM"), toStr("*ERROR* Menu is already running; cannot start up another copy.")));
							throw new ApplicationException();
						}
						else if (in(lvSelection, "EXIT", "QUIT").getValue() ==(in(lvSelection, "*PROCESS", "*PROCESS1", "*PROCESS2", "*PROCESS3", "*PROCESS4").getValue()))
						{
							executeAction("WAS_PROCESS_MENU_LOADED");
							// 
							if ( lvSelection.equals("*PROCESS") )
							{
								this.getTask().getServices().navigateTree(toStr(""), lvSelection);
							}
							else {
								this.getTask().getServices().navigateTree(lvSelection, toStr("*PROCESS"));
							}
							// 
							getFormModel().getKeyBlock().setNextSelection(toStr(""));
							goBlock(toStr("TREE"));
							return ;
						}
						else {
							getFormModel().getKeyBlock().setCallfld(lvSelection);
							setGlobal("SELECTFRM", lvSelection);
							// 
							//  Find product code for object called
							// 
							if (length(lvSelection).equals(7))
							{
								getFormModel().getKeyBlock().setFormLeadingEdge(substring(lvSelection, toInt(1), toInt(1)));
							}
							else {
								getFormModel().getKeyBlock().setFormLeadingEdge(substring(lvSelection, toInt(1), toInt(2)));
							}
							// 
							//  If not a menu, verify valid character
							// 
							lvFirstChar = substring(getFormModel().getKeyBlock().getFormLeadingEdge(), toInt(1), toInt(1));
							if ( lvFirstChar.notEquals("*") )
							{
								if ( !between(lvFirstChar, "A", "Z") )
								{
									errorMessage(GNls.Fget(toStr("GUAGMNU-0010"), toStr("FORM"), toStr("*ERROR* Objects must begin with a letter.")));
									throw new ApplicationException();
								}
							}
							else {
								// 
								if ( lvSelection.equals("*SECURITY") )
								{
									if ( substring(getUser(), toInt(1), toInt(7)).notEquals("BANSECR") )
									{
										errorMessage(GNls.Fget(toStr("GUAGMNU-0011"), toStr("FORM"), toStr("*ERROR* The menu entered is not valid for this user.")));
										throw new ApplicationException();
									}
								}
								// 
								if ( !in(lvSelection, "*PERSONAL", "*MENU", "*SECURITY").getValue() )
								{
									// 
									//  Personal menu check
									// 
									pValue=lvSelection;
									//Setting query parameters
									validPersMenuC.addParameter("P_P_VALUE", pValue);
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable validPersMenuC.
									validPersMenuC.open();
									ResultSet validPersMenuCResults = validPersMenuC.fetchInto();
									if ( validPersMenuCResults != null ) {
										lvValidMenu = validPersMenuCResults.getStr(0);
									}
									validPersMenuC.close();
									// 
									//  Product menu check
									// 
									if ( isNull(lvValidMenu, "N").notEquals("Y") )
									{
										pValue=lvSelection;
										//Setting query parameters
										validProdMenuC.addParameter("P_P_VALUE", pValue);
										//F2J_WARNING : Make sure that the method "Close" is being called over the variable validProdMenuC.
										validProdMenuC.open();
										ResultSet validProdMenuCResults = validProdMenuC.fetchInto();
										if ( validProdMenuCResults != null ) {
											lvValidMenu = validProdMenuCResults.getStr(0);
										}
										validProdMenuC.close();
										// 
										//  Any valid menu check, probably a process menu
										// 
										if ( isNull(lvValidMenu, "N").notEquals("Y") )
										{
											pValue=lvSelection;
											//Setting query parameters
											validProcMenuC.addParameter("P_P_VALUE", pValue);
											//F2J_WARNING : Make sure that the method "Close" is being called over the variable validProcMenuC.
											validProcMenuC.open();
											ResultSet validProcMenuCResults = validProcMenuC.fetchInto();
											if ( validProcMenuCResults != null ) {
												lvValidMenu = validProcMenuCResults.getStr(0);
											}
											validProcMenuC.close();
											// 
											//  Not found
											// 
											if ( isNull(lvValidMenu, "N").notEquals("Y") )
											{
												errorMessage(GNls.Fget(toStr("GUAGMNU-0012"), toStr("FORM"), toStr("*ERROR* %01% is an invalid menu."), lvSelection));
												throw new ApplicationException();
											}
											else {
												if ( inStr(lvSelection, toStr(".")).greater(0) )
												{
													executeAction("WAS_PROCESS_MENU_LOADED");
												}
												else {
													warningMessage(GNls.Fget(toStr("GUAGMNU-0013"), toStr("FORM"), toStr("*WARNING* The menu entered is valid but is not included as part of a personal or product menu.")));
													throw new ApplicationException();
												}
											}
										}
									}
								}
							}
							// 
							try{
							executeAction("CALL_ROUTINE");
							getTask().getGoqrpls().gCheckFailure();
							// 
							executeAction("INIT_NEXT_SELECTION");
							//if ( SupportClasses.SQLFORMS.FormSuccess().not() )
							//{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							//}
						}catch(Exception e){
							
							throw new ApplicationException();
							}
					
					
						}
					}
					
					finally {
						validPersMenuC.close();
						validProdMenuC.close();
						validProcMenuC.close();
					}
				}
		}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.INIT_NEXT_SELECTION
		 BEGIN
  IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
    :KEY_BLOCK.CALLFLD := :GLOBAL.MENU_NAME_PARM;
    :GLOBAL.MENU_NAME_PARM := '';
    EXECUTE_TRIGGER('CALL_ROUTINE');
  END IF;
  :KEY_BLOCK.NEXT_SELECTION := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.INIT_NEXT_SELECTION
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INIT_NEXT_SELECTION")
		public void Guagmnu_InitNextSelection()
		{
			
				if ( !getGlobal("MENU_NAME_PARM").isNull() )
				{
					getFormModel().getKeyBlock().setCallfld(getGlobal("MENU_NAME_PARM"));
					setGlobal("MENU_NAME_PARM", toStr(""));
					executeAction("CALL_ROUTINE");
				}
				getFormModel().getKeyBlock().setNextSelection(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.CALL_ROUTINE
		 DECLARE
  WRK_OBJT         VARCHAR2(30);
  AL_BUTTON        PLS_INTEGER;
  ID_OF_TIMER      TIMER;
  CURR_WF_TASK_ID  PLS_INTEGER;
--
  CURSOR find_objt_c (p_obj VARCHAR2) IS
    SELECT GUBOBJS_OBJT_CODE
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = p_obj;
--  
BEGIN
  << INIT_CALL >>
  :GLOBAL.NEW_FORM := :KEY_BLOCK.CALLFLD;
--
  OPEN find_objt_c (:GLOBAL.NEW_FORM);
  FETCH find_objt_c INTO WRK_OBJT;
  CLOSE find_objt_c;
--
-- If nothing is returned, check if the object is valid.  Could be the user is not authorized.
--
  IF WRK_OBJT IS NULL THEN
    IF NOT G$_CHK_AUTH.G$_CHECK_VALID_OBJ_FNC(:GLOBAL.NEW_FORM) THEN
      MESSAGE(G$_NLS.Get('GUAGMNU-0014','FORM','*ERROR* Invalid object name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    ELSE
  	  WRK_OBJT := 'FORM';
    END IF;
  END IF;
--
  IF WRK_OBJT IN ('FORM','JOB') THEN
    EXECUTE_TRIGGER('GLO_INIT_ROUTINE');
    G$_CHECK_FAILURE;
--
    IF :KEY_BLOCK.FORM_TYPE_IND = 'Q' AND WRK_OBJT = 'FORM' THEN
      MESSAGE(G$_NLS.Get('GUAGMNU-0015','FORM','*ERROR* Invalid form name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  :GLOBAL.CALLING_FORM := 'GUAGMNU';
--
-- This step will execute either a call form or a newform for the requested form if 
-- global.callfrm is null.  The null check allows this step to be bypassed in the event that
-- the product initialization form (?OQMENU) has requested that control be passed to another form.
-- If this is the case the trigger will cycle around one more time and pass control to the form 
-- that the initialization routine requested.
--
  IF :GLOBAL.CALLFRM IS NULL THEN
--
-- Check whether or not the user is running a Payroll or a Position control form.  If so, check 
-- to see if the initialization form has been run.  If not, skip logic otherwise call routine 
-- to check for electronic approvals.
--
    IF WRK_OBJT = 'FORM' AND :KEY_BLOCK.FORM_INIT_IND IS NOT NULL THEN
      IF SUBSTR(:KEY_BLOCK.FORM_LEADING_EDGE,1,1) IN ('N','P') THEN
        IF NVL(NAME_IN(NAME_IN('KEY_BLOCK.FORM_INIT_IND')),'N') = 'Y' THEN
          G$_GET_PIPE_MESSAGES;
          GET_EAWTE_MESSAGES;
        END IF;
      END IF;
    END IF;
--
-- Determine the type of object we are about to call.
--
    CASE WRK_OBJT
      WHEN 'JOBS' THEN 
        :GLOBAL.KEY_JOB_NAME := :GLOBAL.NEW_FORM;
        :GLOBAL.NEW_FORM := 'GJAPCTL';
--
      WHEN 'QUICKFLOW' THEN 
        SET_MENU_ITEM_PROPERTY('Action.ExitQuickflow',ENABLED,PROPERTY_TRUE);
        G$_QUICKFLOW(:GLOBAL.NEW_FORM);
        RETURN;
--
      WHEN 'MENU' THEN 
        NAVIGATE_TREE(:GLOBAL.NEW_FORM,'');
        GO_BLOCK('TREE');
        RETURN;
--
      WHEN 'MESSAGE' THEN 
        SET_ALERT_PROPERTY('G$_BANNER_ALERT',ALERT_MESSAGE_TEXT,
            G$_NLS.Get('GUAGMNU-0016', 'FORM','Please use desktop or web application to complete '
                      || 'this activity.  These applications may be accessible through your '
                      || 'Banner toolbar.'));
        AL_BUTTON := SHOW_ALERT('G$_BANNER_ALERT');
        RETURN;
--
      ELSE NULL;
    END CASE;
--
-- Form call logic.
--
    DO_FORM_CALL(:GLOBAL.NEW_FORM);
--
    SET_CANVAS_COLORS;
    :GLOBAL.KEY_CALL_CODE := '';
    :GLOBAL.WIN_TITLE := '';
    :GLOBAL.WIN_X_POS := '';
    :GLOBAL.WIN_Y_POX := '';
--
-- 4100-3 Add logic to only notify a user of pending messages if the session is not 
--        listening for Workflow tasks or activities, if the user has not just returned
--        from performing a Workflow task or activity, or if the user has just returned 
--        from performing a Workflow activity that he or she has not submitted.
--
    ID_OF_TIMER := FIND_TIMER(G$_WF_DRIVER.WF_TIMER_NAME);
--
    IF ID_NULL(ID_OF_TIMER) AND NOT G$_WF_CONDITIONS.IS_WF_SUBMITTED THEN
      DO_NEW_MESSAGES_EXIST(:GLOBAL.current_user1);
    END IF;
--
  END IF;
--
-- This step checks to see if a form name has been placed in the GLOBAL.CALLFRM field.  
-- If not, the trigger exits.  If there is a value, then copy the form name to 
-- :KEY_BLOCK.callfld and wipe out the global value.  Then restart the logic in this 
-- trigger over which will pass control directly to the requested form.
--
  IF :GLOBAL.CALLFRM IS NOT NULL THEN
    :KEY_BLOCK.CALLFLD := :GLOBAL.CALLFRM;
    :GLOBAL.CALLFRM := '';
    GOTO INIT_CALL;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.CALL_ROUTINE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_ROUTINE")
		public void Guagmnu_CallRoutine()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				int rowCount = 0;
				{
					NString wrkObjt= NString.getNull();
					NInteger alButton= NInteger.getNull();
					UnknownTypes.Timer idOfTimer= null;
					NInteger currWfTaskId= NInteger.getNull();
					String sqlfindObjtC = "SELECT GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_P_OBJ ";
					DataCursor findObjtC = new DataCursor(sqlfindObjtC);
					NString pObj = NString.getNull();
					try {
						// INIT_CALL:;
						setGlobal("NEW_FORM", getFormModel().getKeyBlock().getCallfld());
						// 
						pObj=getGlobal("NEW_FORM");
						//Setting query parameters
						findObjtC.addParameter("P_P_OBJ", pObj);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findObjtC.
						findObjtC.open();
						ResultSet findObjtCResults = findObjtC.fetchInto();
						if ( findObjtCResults != null ) {
							wrkObjt = findObjtCResults.getStr(0);
						}
						findObjtC.close();
						// 
						//  If nothing is returned, check if the object is valid.  Could be the user is not authorized.
						// 
						if ( wrkObjt.isNull() )
						{
							if (! GChkAuth.gCheckValidObjFnc(getGlobal("NEW_FORM")).toBoolean() )
							{
								errorMessage(GNls.Fget(toStr("GUAGMNU-0014"), toStr("FORM"), toStr("*ERROR* Invalid object name entered.")));
								throw new ApplicationException();
							}
							else {
								wrkObjt = toStr("FORM");
							}
						}
						// 
						if ( in(wrkObjt, "FORM", "JOB").getValue() )
						{
							executeAction("GLO_INIT_ROUTINE");
							getTask().getGoqrpls().gCheckFailure();
							// 
							if ( getFormModel().getKeyBlock().getFormTypeInd().equals("Q") && wrkObjt.equals("FORM") )
							{
								errorMessage(GNls.Fget(toStr("GUAGMNU-0015"), toStr("FORM"), toStr("*ERROR* Invalid form name entered.")));
								throw new ApplicationException();
							}
						}
						// 
						setGlobal("CALLING_FORM", toStr("GUAGMNU"));
						// 
						//  This step will execute either a call form or a newform for the requested form if 
						//  global.callfrm is null.  The null check allows this step to be bypassed in the event that
						//  the product initialization form (?OQMENU) has requested that control be passed to another form.
						//  If this is the case the trigger will cycle around one more time and pass control to the form 
						//  that the initialization routine requested.
						// 
						if ( getGlobal("CALLFRM").isNull() )
						{
							// 
							//  Check whether or not the user is running a Payroll or a Position control form.  If so, check 
							//  to see if the initialization form has been run.  If not, skip logic otherwise call routine 
							//  to check for electronic approvals.
							// 
							if ( wrkObjt.equals("FORM") && !getFormModel().getKeyBlock().getFormInitInd().isNull() )
							{
								if ( in(substring(getFormModel().getKeyBlock().getFormLeadingEdge(), toInt(1), toInt(1)), "N", "P").getValue() )
								{
									if ( isNull(getNameIn(getNameIn("KEY_BLOCK.FORM_INIT_IND")), "N").equals("Y") )
									{
										this.getTask().getServices().gGetPipeMessages(messagesElement);
										this.getTask().getServices().getEawteMessages(messagesElement);
									}
								}
							}
							// 
							//  Determine the type of object we are about to call.
							// 
							if (wrkObjt.equals("JOBS"))
							{
								setGlobal("KEY_JOB_NAME", getGlobal("NEW_FORM"));
								setGlobal("NEW_FORM", toStr("GJAPCTL"));
							}
							else if (wrkObjt.equals("QUICKFLOW"))
							{
								setMenuItemEnabled("Action.ExitQuickflow", true);
								getTask().getGoqrpls().gQuickflow(getGlobal("NEW_FORM"));
								return ;
							}
							else if (wrkObjt.equals("MENU"))
							{
								this.getTask().getServices().navigateTree(getGlobal("NEW_FORM"), toStr(""));
								goBlock(toStr("TREE"));
								return ;
							}
							else if (wrkObjt.equals("MESSAGE"))
							{
								setAlertMessageText("G$_BANNER_ALERT", GNls.Fget(toStr("GUAGMNU-0016"), toStr("FORM"), toStr("Please use desktop or web application to complete ").append("this activity.  These applications may be accessible through your ").append("Banner toolbar.")));
								alButton = toInt(showAlert("G$_BANNER_ALERT"));
								return ;
							}
							else {
							}
							// 
							//  Form call logic.
							// 
							this.getTask().getServices().doFormCall(messagesElement, getGlobal("NEW_FORM"));
							// 
							this.getTask().getServices().setCanvasColors();
							setGlobal("KEY_CALL_CODE", toStr(""));
							setGlobal("WIN_TITLE", toStr(""));
							setGlobal("WIN_X_POS", toStr(""));
							setGlobal("WIN_Y_POX", toStr(""));
							// 
							//  4100-3 Add logic to only notify a user of pending messages if the session is not 
							//         listening for Workflow tasks or activities, if the user has not just returned
							//         from performing a Workflow task or activity, or if the user has just returned 
							//         from performing a Workflow activity that he or she has not submitted.
							// 
							// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
							//							idOfTimer = SupportClasses.FORMS40.FindTimer(GWfDriver.wfTimerName);
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
							
							
							// 
							if ( (idOfTimer == null) && getTask().getGoqwflw().getGWfConditions().isWfSubmitted().not() )
							{
								this.getTask().getServices().doNewMessagesExist(getGlobal("CURRENT_USER1"));
							}
						}
						// 
						//  This step checks to see if a form name has been placed in the GLOBAL.CALLFRM field.  
						//  If not, the trigger exits.  If there is a value, then copy the form name to 
						//  :KEY_BLOCK.callfld and wipe out the global value.  Then restart the logic in this 
						//  trigger over which will pass control directly to the requested form.
						// 
						if ( !getGlobal("CALLFRM").isNull() )
						{
							getFormModel().getKeyBlock().setCallfld(getGlobal("CALLFRM"));
							setGlobal("CALLFRM", toStr(""));
							// goto INIT_CALL;
							 
							// INIT_CALL:;
								setGlobal("NEW_FORM", getFormModel().getKeyBlock().getCallfld());
								// 
							
						}
					}
					finally{
						findObjtC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.GLO_INIT_ROUTINE
		 BEGIN
  :KEY_BLOCK.FORM_INIT_IND := 'GLOBAL.INIT' || RTRIM(:KEY_BLOCK.FORM_LEADING_EDGE);
--
  IF NVL(LENGTH(:KEY_BLOCK.FORM_LEADING_EDGE), 0) = 1 THEN
    :KEY_BLOCK.FORM_TYPE_IND := SUBSTR(:KEY_BLOCK.CALLFLD,3,1);
  ELSE
    :KEY_BLOCK.FORM_TYPE_IND := SUBSTR(:KEY_BLOCK.CALLFLD,4,1);
  END IF;
--
  DEFAULT_VALUE('N','GLOBAL.INIT' || RTRIM(:KEY_BLOCK.FORM_LEADING_EDGE));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.GLO_INIT_ROUTINE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLO_INIT_ROUTINE")
		public void Guagmnu_GloInitRoutine()
		{
			
				getFormModel().getKeyBlock().setFormInitInd(toStr("GLOBAL.INIT").append(rtrim(getFormModel().getKeyBlock().getFormLeadingEdge())));
				// 
				if ( isNull(length(getFormModel().getKeyBlock().getFormLeadingEdge()), 0).equals(1) )
				{
					getFormModel().getKeyBlock().setFormTypeInd(substring(getFormModel().getKeyBlock().getCallfld(), toInt(3), toInt(1)));
				}
				else {
					getFormModel().getKeyBlock().setFormTypeInd(substring(getFormModel().getKeyBlock().getCallfld(), toInt(4), toInt(1)));
				}
				// 
				setDefaultValue("N", toStr("GLOBAL.INIT").append(rtrim(getFormModel().getKeyBlock().getFormLeadingEdge())));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-COMMIT
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Guagmnu_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-CLRFRM
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Guagmnu_ClearTask()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-ENTER
		 BEGIN
  EXECUTE_TRIGGER('CHECK_TYPE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-ENTER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTER")
		public void Guagmnu_KeyEnter()
		{
			
				executeAction("CHECK_TYPE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-EXIT
		 BEGIN
--
-- 4100-1 Migrate contents of this trigger to new local CONFIRM_B2K_EXIT
--        procedure, which will be invoked by all methods of manually
--        exiting a Banner session.
--
  CONFIRM_B2K_EXIT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Guagmnu_Exit()
		{
			
				// 
				//  4100-1 Migrate contents of this trigger to new local CONFIRM_B2K_EXIT
				//         procedure, which will be invoked by all methods of manually
				//         exiting a Banner session.
				// 
				this.getTask().getServices().confirmB2kExit();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-LISTVAL
		 DO_FORM_CALL('GUIOBJS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Guagmnu_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUIOBJS"));
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-NEXT-ITEM
		 NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void Guagmnu_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-PREV-ITEM
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void Guagmnu_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.KEY-OTHERS
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.KEY-OTHERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-OTHERS")
		public void Guagmnu_KeyOthers()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.DELETE_PERSONAL_MENU
		 DECLARE
  htree       ITEM;
  delete_node Ftree.NODE;
  RG_MENU     RECORDGROUP;
BEGIN
	htree := Find_Item('tree.gurmenu_desc');
-- find and delete "My Banner" branch of TREE
  delete_node := Ftree.FIND_TREE_NODE(htree,'My Banner',Ftree.find_next,
                                      Ftree.NODE_LABEL,Ftree.root_node,Ftree.root_node);
--
  IF NOT Ftree.ID_NULL(delete_node) THEN
    FTREE.DELETE_TREE_NODE(htree, delete_node);
  END IF;
-- delete appropriate RG associated with this branch of TREE
  IF NAME_IN('GLOBAL.FORMNAME_DISPLAY_IND') = 'N' THEN
  	RG_MENU := FIND_GROUP('RG_GUVPEMNU_PERSONAL');
	ELSE
	  RG_MENU := FIND_GROUP('RG_GUVPEMNU_PERSONAL_LABEL');
	END IF;
--
	IF NOT ID_NULL(RG_MENU) THEN 
   	DELETE_GROUP_ROW(RG_MENU,ALL_ROWS);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.DELETE_PERSONAL_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DELETE_PERSONAL_MENU")
		public void Guagmnu_DeletePersonalMenu()
		{
			
				{
					TreeDescriptor htree= null;
					TreeNode deleteNode= null;
					ValueSet rgMenu= null;
					htree = getTree("tree.gurmenu_desc");
					//  find and delete "My Banner" branch of TREE
					deleteNode = findTreeNode(htree, "My Banner", TreeServices.FIND_NEXT, TreeServices.NODE_LABEL, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
					// 
					if ( !(deleteNode == null) )
					{
						deleteTreeNode(htree, deleteNode);
					}
					//  delete appropriate RG associated with this branch of TREE
					if ( getNameIn("GLOBAL.FORMNAME_DISPLAY_IND").equals("N") )
					{
						rgMenu = findGroup("RG_GUVPEMNU_PERSONAL");
					}
					else {
						rgMenu = findGroup("RG_GUVPEMNU_PERSONAL_LABEL");
					}
					// 
					if ( !(rgMenu == null) )
					{
						deleteGroupRow(rgMenu, ValueSet.ALL_ROWS);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.DISABLE_ALL_SITEMAP2
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP2.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP2.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP2.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP2.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_FALSE);
	END LOOP ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.DISABLE_ALL_SITEMAP2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_ALL_SITEMAP2")
		public void Guagmnu_DisableAllSitemap2()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP2.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP2.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP2.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP2.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.DISABLE_ALL_SITEMAP3
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN 
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP3.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP3.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP3.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP3.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_FALSE);
	END LOOP ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.DISABLE_ALL_SITEMAP3
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_ALL_SITEMAP3")
		public void Guagmnu_DisableAllSitemap3()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP3.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP3.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP3.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP3.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ENABLE_ALL_SITEMAP1
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN 
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ENABLE_ALL_SITEMAP1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_ALL_SITEMAP1")
		public void Guagmnu_EnableAllSitemap1()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, true);
						setItemNavigable(itemName, true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ENABLE_ALL_SITEMAP2
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN 
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP2.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP2.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP2.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP2.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ENABLE_ALL_SITEMAP2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_ALL_SITEMAP2")
		public void Guagmnu_EnableAllSitemap2()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP2.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP2.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP2.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP2.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, true);
						setItemNavigable(itemName, true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ENABLE_ALL_SITEMAP3
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN 
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP3.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP3.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP3.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP3.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ENABLE_ALL_SITEMAP3
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_ALL_SITEMAP3")
		public void Guagmnu_EnableAllSitemap3()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP3.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP3.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP3.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP3.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, true);
						setItemNavigable(itemName, true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ENABLE_ALL_SITEMAP4
		 DECLARE
	ITEM_NAME VARCHAR2(100);
BEGIN 
	FOR ITEM_SEQ IN 1..40 LOOP
	  COPY('','SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ENABLE_ALL_SITEMAP4
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_ALL_SITEMAP4")
		public void Guagmnu_EnableAllSitemap4()
		{
			
				{
					NString itemName= NString.getNull();
					for ( int itemSeq = 1; itemSeq <= 40; itemSeq++ )
					{
						copy("",toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
						copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
						itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
						setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
						setItemToolTip(itemName, "");
						setItemEnabled(itemName, true);
						setItemNavigable(itemName, true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.REFRESH_SITEMAP
		 BEGIN
  menu_seq.set_seq;
--
	EXECUTE_TRIGGER('ENABLE_ALL_SITEMAP1');
  GO_BLOCK('SITE_MAP1');
  EXECUTE_TRIGGER('POPULATE_SITE_MAP1');
--
  IF :last_seq = 'Y' THEN
     EXECUTE_TRIGGER('DISABLE_ALL_SITEMAP2');
  ELSE
  	EXECUTE_TRIGGER('ENABLE_ALL_SITEMAP2');
    GO_BLOCK('SITE_MAP2');
    IF :SITE_MAP1.MAIN_DESC_1 IS NULL THEN
      SET_ITEM_PROPERTY('SITE_MAP1.MAIN_DESC_1',ENABLED,PROPERTY_FALSE);
    END IF;
    EXECUTE_TRIGGER('POPULATE_SITE_MAP2');
  END IF;
--
  IF :last_seq = 'Y' THEN
 	  EXECUTE_TRIGGER('DISABLE_ALL_SITEMAP3');
  ELSE	 
  	EXECUTE_TRIGGER('ENABLE_ALL_SITEMAP3');
    GO_BLOCK('SITE_MAP3');
    IF :SITE_MAP2.MAIN_DESC_1 IS NULL THEN
      SET_ITEM_PROPERTY('SITE_MAP2.MAIN_DESC_1',ENABLED,PROPERTY_FALSE);
    END IF;
    EXECUTE_TRIGGER('POPULATE_SITE_MAP3');
  END IF;
--
  EXECUTE_TRIGGER('ENABLE_ALL_SITEMAP4');
  GO_BLOCK('SITE_MAP4');
  IF :SITE_MAP3.MAIN_DESC_1 IS NULL THEN
    SET_ITEM_PROPERTY('SITE_MAP3.MAIN_DESC_1',ENABLED,PROPERTY_FALSE);
  END IF;
  EXECUTE_TRIGGER('POPULATE_SITE_MAP4');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.REFRESH_SITEMAP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="REFRESH_SITEMAP")
		public void Guagmnu_RefreshSitemap()
		{
			
				getTask().getMenuSeq().setSeq();
				// 
				executeAction("ENABLE_ALL_SITEMAP1");
				goBlock(toStr("SITE_MAP1"));
				executeAction("POPULATE_SITE_MAP1");
				// 
				if ( getFormModel().getFormHeader().getLastSeq().equals("Y") )
				{
					executeAction("DISABLE_ALL_SITEMAP2");
				}
				else {
					executeAction("ENABLE_ALL_SITEMAP2");
					goBlock(toStr("SITE_MAP2"));
					if ( getFormModel().getSiteMap1().getMainDesc1().isNull() )
					{
						setItemEnabled("SITE_MAP1.MAIN_DESC_1", false);
					}
					executeAction("POPULATE_SITE_MAP2");
				}
				// 
				if ( getFormModel().getFormHeader().getLastSeq().equals("Y") )
				{
					executeAction("DISABLE_ALL_SITEMAP3");
				}
				else {
					executeAction("ENABLE_ALL_SITEMAP3");
					goBlock(toStr("SITE_MAP3"));
					if ( getFormModel().getSiteMap2().getMainDesc1().isNull() )
					{
						setItemEnabled("SITE_MAP2.MAIN_DESC_1", false);
					}
					executeAction("POPULATE_SITE_MAP3");
				}
				// 
				executeAction("ENABLE_ALL_SITEMAP4");
				goBlock(toStr("SITE_MAP4"));
				if ( getFormModel().getSiteMap3().getMainDesc1().isNull() )
				{
					setItemEnabled("SITE_MAP3.MAIN_DESC_1", false);
				}
				executeAction("POPULATE_SITE_MAP4");
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.REFRESH_TREE
		 DECLARE
  htree         ITEM;
  find_node     FTREE.NODE;
BEGIN
--
-- NOTE: In order to delete what may be the current Tree branch, shift focus to 'SCT Banner' 
--       branch; this seems to avoid 7343 error.
--
	htree := FIND_ITEM('tree.gurmenu_desc');
  find_node := FTREE.FIND_TREE_NODE(htree,'Banner',FTREE.find_next,
                                    FTREE.NODE_LABEL,FTREE.root_node,FTREE.root_node);
  Ftree.SET_TREE_SELECTION(htree, find_node, FTREE.SELECT_ON);
--
  :FORM_HEADER.pop_temps_ind := 'Y';
	EXECUTE_TRIGGER('DELETE_PERSONAL_MENU');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('POPULATE_PERSONAL_MENU');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.REFRESH_TREE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="REFRESH_TREE")
		public void Guagmnu_RefreshTree()
		{
			
				{
					ItemDescriptor htree= null;
					TreeNode findNode= null;
					// 
					//  NOTE: In order to delete what may be the current Tree branch, shift focus to 'SCT Banner' 
					//        branch; this seems to avoid 7343 error.
					// 
					htree = findItem(toStr("tree.gurmenu_desc"));
					findNode = findTreeNode(toStr(htree), "Banner", TreeServices.FIND_NEXT, TreeServices.NODE_LABEL, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
					setTreeSelection(toStr(htree), findNode, true);
					// 
					getFormModel().getFormHeader().setPopTempsInd(toStr("Y"));
					executeAction("DELETE_PERSONAL_MENU");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("POPULATE_PERSONAL_MENU");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.POPULATE_PERSONAL_MENU
		 DECLARE
  htree          ITEM;
  personal_node  FTREE.NODE;
  empty_node     FTREE.NODE;
  start_branch   VARCHAR2(30);
  RG_ID          RECORDGROUP;
  RG_COUNT       PLS_INTEGER;
  organize_msg   VARCHAR2(90);
  start_msg      VARCHAR2(90);
  which_msg      VARCHAR2(90);
BEGIN
	htree := FIND_ITEM('tree.gurmenu_desc');
--
  IF NAME_IN('GLOBAL.FORMNAME_DISPLAY_IND') = 'N' THEN
	  RG_ID := FIND_GROUP('RG_GUVPEMNU_PERSONAL');
    organize_msg :=  G$_NLS.Get('GUAGMNU-0017', 'FORM','Organize My Banner') ;
	  start_msg :=  G$_NLS.Get('GUAGMNU-0018', 'FORM','Empty; Select to build.') ;
  ELSE
	  RG_ID := FIND_GROUP('RG_GUVPEMNU_PERSONAL_LABEL');
    organize_msg :=  G$_NLS.Get('GUAGMNU-0019', 'FORM','Organize My Banner [GUAPMNU]') ;
	  start_msg :=  G$_NLS.Get('GUAGMNU-0020', 'FORM','Empty; Select to build. [GUAPMNU]') ;
	END IF;
--
-- Only execute if refresh tree is pressed.
--
 	IF :FORM_HEADER.pop_temps_ind = 'Y' THEN
    GUKMENU.P_BLD_PERS_MENU;
 	END IF;
--
  start_branch := POPULATE_GROUP(RG_ID);
--
-- add My Banner at beginning
--
  personal_node := FTREE.Add_Tree_Node(htree,
                                       FTREE.ROOT_NODE,
                                       FTREE.PARENT_OFFSET,
                                       1,
                                       FTREE.EXPANDED_NODE,
                                       G$_NLS.Get('GUAGMNU-0021','FORM','My Banner'),
                                       'folder',
                                       '*PERSONAL');
--
	RG_COUNT := Get_Group_Row_Count(RG_ID);
--
  IF RG_COUNT > 0 THEN
    which_msg := organize_msg;
    FTREE.Add_Tree_Data(htree,
                        personal_node,
                        FTREE.PARENT_OFFSET,
                        FTREE.LAST_CHILD,
                        FTREE.RECORD_GROUP,
                        RG_ID);
  ELSE
    which_msg := start_msg;
	END IF;
--
  empty_node := FTREE.Add_Tree_Node(htree,
                                    personal_node,
                                    FTREE.PARENT_OFFSET,
                                    FTREE.LAST_CHILD,
                                    FTREE.LEAF_NODE,
                                    which_msg,
                                    'form',
                                    'GUAPMNU');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POPULATE_PERSONAL_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POPULATE_PERSONAL_MENU")
		public void Guagmnu_PopulatePersonalMenu()
		{
			
				{
					TreeDescriptor htree= null;
					TreeNode personalNode= null;
					TreeNode emptyNode= null;
					NString startBranch= NString.getNull();
					ValueSet rgId= null;
//					NInteger rgCount= NInteger.getNull();
					int rgCount=0;
					NString organizeMsg= NString.getNull();
					NString startMsg= NString.getNull();
					NString whichMsg= NString.getNull();
					htree = getTree("tree.gurmenu_desc");
					// 
					if ( getNameIn("GLOBAL.FORMNAME_DISPLAY_IND").equals("N") )
					{
						rgId = findGroup("RG_GUVPEMNU_PERSONAL");
						organizeMsg = GNls.Fget(toStr("GUAGMNU-0017"), toStr("FORM"), toStr("Organize My Banner"));
						startMsg = GNls.Fget(toStr("GUAGMNU-0018"), toStr("FORM"), toStr("Empty; Select to build."));
					}
					else {
						rgId = findGroup("RG_GUVPEMNU_PERSONAL_LABEL");
						organizeMsg = GNls.Fget(toStr("GUAGMNU-0019"), toStr("FORM"), toStr("Organize My Banner [GUAPMNU]"));
						startMsg = GNls.Fget(toStr("GUAGMNU-0020"), toStr("FORM"), toStr("Empty; Select to build. [GUAPMNU]"));
					}
					// 
					//  Only execute if refresh tree is pressed.
					// 
					if ( getFormModel().getFormHeader().getPopTempsInd().equals("Y") )
					{
						Gukmenu.pBldPersMenu();
					}
					// 
					startBranch = toStr(populateGroup(rgId));
					// 
					//  add My Banner at beginning
					// 
					personalNode = addTreeNode(htree, TreeServices.ROOT_NODE, TreeServices.PARENT_OFFSET, toNumber(1), TreeServices.EXPANDED_NODE, GNls.Fget(toStr("GUAGMNU-0021"), toStr("FORM"), toStr("My Banner")), toStr("folder"), toStr("*PERSONAL"));
;
					// 
					rgCount = getGroupRowCount(rgId);
					// 
					if ( rgCount > 0)
					{
						whichMsg = organizeMsg;
						addTreeData(htree, personalNode, TreeServices.PARENT_OFFSET, TreeServices.LAST_CHILD, rgId);
					}
					else {
						whichMsg = startMsg;
					}
					// 
					emptyNode = addTreeNode(htree, personalNode, TreeServices.PARENT_OFFSET, TreeServices.LAST_CHILD, TreeServices.LEAF_NODE, whichMsg,toStr( "form"),toStr( "GUAPMNU"));
;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.POPULATE_PROCESS_MENU
		 DECLARE
  htree         ITEM;
  new_node      FTREE.NODE;
  start_branch  VARCHAR2(30);
  RG_ID         RECORDGROUP;
  RG_COUNT      PLS_INTEGER;
BEGIN
-- Find the tree itself.
  htree := Find_Item('tree.gurmenu_desc');
--
  IF NAME_IN('GLOBAL.FORMNAME_DISPLAY_IND') = 'N' THEN
	  RG_ID := Find_Group('RG_GUVPSMNU_PROCESS');
	ELSE
	  RG_ID := Find_Group('RG_GUVPSMNU_PROCESS_LABEL');
	END IF;
--
  start_branch := POPULATE_GROUP(RG_ID);
--
  RG_COUNT := Get_Group_Row_Count(RG_ID);
  IF RG_COUNT = 0 THEN
	  RETURN;
	END IF;
-- add Business Processes at beginning
  new_node := Ftree.Add_Tree_Node(htree,
                                  Ftree.ROOT_NODE,
                                  Ftree.PARENT_OFFSET,
                                  1,
                                  Ftree.EXPANDED_NODE,
                                  G$_NLS.Get('GUAGMNU-0022','FORM','Business Processes'),
                                  'folder',
                                  '*PROCESS');
-- add data
  Ftree.Add_Tree_Data(htree,
                        new_node,
                        Ftree.PARENT_OFFSET,
                        FTREE.LAST_CHILD,
                        Ftree.RECORD_GROUP,
                        RG_ID);
--
  IF NOT Id_Null(RG_ID) THEN 
   	Delete_Group_Row(RG_ID,ALL_ROWS);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POPULATE_PROCESS_MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POPULATE_PROCESS_MENU")
		public void Guagmnu_PopulateProcessMenu()
		{
			
				{
					TreeDescriptor htree= null;
					TreeNode newNode= null;
					NString startBranch= NString.getNull();
					ValueSet rgId= null;
//					NInteger rgCount= NInteger.getNull();
					int rgCount=0;
					//  Find the tree itself.
					htree = getTree("tree.gurmenu_desc");
					// 
					if ( getNameIn("GLOBAL.FORMNAME_DISPLAY_IND").equals("N") )
					{
						rgId = findGroup("RG_GUVPSMNU_PROCESS");
					}
					else {
						rgId = findGroup("RG_GUVPSMNU_PROCESS_LABEL");
					}
					// 
					startBranch = toStr(populateGroup(rgId));
					// 
					rgCount = getGroupRowCount(rgId);
					if ( rgCount ==0)
					{
						return ;
					}
					//  add Business Processes at beginning
					newNode = addTreeNode(htree, TreeServices.ROOT_NODE, TreeServices.PARENT_OFFSET,toNumber( 1), TreeServices.EXPANDED_NODE, GNls.Fget(toStr("GUAGMNU-0022"), toStr("FORM"), toStr("Business Processes")),toStr( "folder"),toStr( "*PROCESS"));
;
					//  add data
					addTreeData(htree, newNode, TreeServices.PARENT_OFFSET, TreeServices.LAST_CHILD, rgId);
					// 
					if ( !(rgId == null) )
					{
						deleteGroupRow(rgId, ValueSet.ALL_ROWS);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.POPULATE_ROOT_TREE
		 DECLARE
  htree         ITEM;
  find_node     FTREE.NODE;
  new_node      FTREE.NODE;
  start_branch  VARCHAR2(200);
  RG_ID         RECORDGROUP;
  RG_COUNT      PLS_INTEGER;
BEGIN
	IF :FORM_HEADER.tree_pop <> 'Y' THEN
--
-- Find the tree populate the record groups.
--
    IF NAME_IN('GLOBAL.FORMNAME_DISPLAY_IND') = 'N' THEN
	  	RG_ID := FIND_GROUP('RG_GUVMMNU_PRODUCTS');
	  ELSE
	    RG_ID := FIND_GROUP('RG_GUVMMNU_PRODUCTS_LABEL');
	  END IF;
--
-- Only execute if refresh tree is pressed.
--
  	IF :FORM_HEADER.pop_temps_ind = 'Y' THEN
      GUKMENU.P_BLD_PROD_MENU;
  	END IF;
--
    start_branch := POPULATE_GROUP('RG_PRODUCT_LIST');
    CLEAR_LIST('SELECTION_LIST');
    POPULATE_LIST('SELECTION_LIST','RG_PRODUCT_LIST');
--    
    start_branch := POPULATE_GROUP(RG_ID);
--
-- add My Banner at beginning
--
    htree := FIND_ITEM('tree.gurmenu_desc');
    new_node := FTREE.Add_Tree_Node(htree,
                                    FTREE.ROOT_NODE,
                                    FTREE.PARENT_OFFSET,
                                    1,
                                    FTREE.EXPANDED_NODE,
                                    'Banner',
                                    'folder',
                                    '*MENU');
--
-- determine how many rows are returned
--
  	RG_COUNT := Get_Group_Row_Count(RG_ID);
    IF RG_COUNT > 0 THEN
--
-- add data to the tree
--
      FTREE.Add_Tree_Data(htree,
                          new_node,
                          FTREE.PARENT_OFFSET,
                          FTREE.LAST_CHILD,
                          FTREE.RECORD_GROUP,
                          RG_ID);
	  END IF;
	END IF;
--
-- load personal preference
--
  IF FORM_SUCCESS THEN
 	  :FORM_HEADER.tree_pop := 'Y';
 	END IF;  	
--
 	IF NOT ID_NULL(RG_ID) THEN 
 	  Delete_Group_Row(RG_ID,ALL_ROWS);
 	END IF;
--
 	EXECUTE_TRIGGER('POPULATE_PERSONAL_MENU');
--
  IF (:PARAMETER.VALUE IN ('*PROCESS','*PROCESS1','*PROCESS2','*PROCESS3','*PROCESS4')) OR
 	   (INSTR( :PARAMETER.VALUE ,'.') = 4 AND
 	    SUBSTR( :PARAMETER.VALUE, 1, 1 ) = '*' ) THEN
 	  EXECUTE_TRIGGER('POPULATE_PROCESS_MENU');
 	  -- 1-2WKYEP
 	  :FORM_HEADER.BP_POP:='Y';
 	END IF;
--
-- Locate preference and expand
--
  start_branch := :PARAMETER.VALUE;
  IF  start_branch <> '*MAIN' THEN
    find_node := FTREE.FIND_TREE_NODE(htree,start_branch,FTREE.find_next,
                                      FTREE.NODE_VALUE,FTREE.root_node,FTREE.root_node);
    FTREE.SET_TREE_NODE_PROPERTY(htree,find_node,FTREE.NODE_STATE,FTREE.EXPANDED_NODE);
    FTREE.SET_TREE_NODE_PROPERTY(htree,find_node,FTREE.NODE_ICON,'open_folder');
--
    FTREE.SET_TREE_SELECTION(htree,find_node,FTREE.SELECT_ON);
    FTREE.SET_TREE_SELECTION(htree,find_node,FTREE.SELECT_OFF);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.POPULATE_ROOT_TREE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POPULATE_ROOT_TREE")
		public void Guagmnu_PopulateRootTree()
		{
			
				{
					TreeDescriptor htree= null;
					TreeNode findNode= null;
					TreeNode newNode= null;
					NString startBranch= NString.getNull();
					ValueSet rgId= null;
//					NInteger rgCount= NInteger.getNull();
					int rgCount=0;
					if ( getFormModel().getFormHeader().getTreePop().notEquals("Y") )
					{
						// 
						//  Find the tree populate the record groups.
						// 
						if ( getNameIn("GLOBAL.FORMNAME_DISPLAY_IND").equals("N") )
						{
							rgId = findGroup("RG_GUVMMNU_PRODUCTS");
						}
						else {
							rgId = findGroup("RG_GUVMMNU_PRODUCTS_LABEL");
						}
						// 
						//  Only execute if refresh tree is pressed.
						// 
						if ( getFormModel().getFormHeader().getPopTempsInd().equals("Y") )
						{
							Gukmenu.pBldProdMenu();
						}
						// 
						startBranch = toStr(populateGroup("RG_PRODUCT_LIST"));
						clearList("SELECTION_LIST");
						populateList("SELECTION_LIST", "RG_PRODUCT_LIST");
						//     
						startBranch = toStr(populateGroup(rgId));
						// 
						//  add My Banner at beginning
						// 
						htree = getTree("tree.gurmenu_desc");
						newNode = addTreeNode(htree, TreeServices.ROOT_NODE, TreeServices.PARENT_OFFSET,toNumber( 1), TreeServices.EXPANDED_NODE, toStr("Banner"),toStr( "folder"),toStr ("*MENU"));
;
						// 
						//  determine how many rows are returned
						// 
						rgCount =(getGroupRowCount(rgId));
						if ( rgCount >0)
						{
							// 
							//  add data to the tree
							// 
							addTreeData(htree, newNode, TreeServices.PARENT_OFFSET, TreeServices.LAST_CHILD, rgId);
						}
					}
					// 
					//  load personal preference
					// 
				//	if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
					getCursorValue();
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						getFormModel().getFormHeader().setTreePop(toStr("Y"));
					}
					// 
					if ( !(rgId == null) )
					{
						deleteGroupRow(rgId, ValueSet.ALL_ROWS);
					}
					// 
					executeAction("POPULATE_PERSONAL_MENU");
					// 
					if ( (in(this.getFormModel().getParam("VALUE", NString.class), "*PROCESS", "*PROCESS1", "*PROCESS2", "*PROCESS3", "*PROCESS4").getValue()) || (inStr(this.getFormModel().getParam("VALUE", NString.class), toStr(".")).equals(4) && substring(this.getFormModel().getParam("VALUE", NString.class), toInt(1), toInt(1)).equals("*")) )
					{
						executeAction("POPULATE_PROCESS_MENU");
						//  1-2WKYEP
						getFormModel().getFormHeader().setBpPop(toStr("Y"));
					}
					// 
					//  Locate preference and expand
					// 
					startBranch = this.getFormModel().getParam("VALUE", NString.class);
					if ( startBranch.notEquals("*MAIN") )
					{
						findNode = findTreeNode(htree, startBranch, TreeServices.FIND_NEXT, TreeServices.NODE_VALUE, TreeServices.ROOT_NODE, TreeServices.ROOT_NODE);
						// F2J_NOT_SUPPORTED : The property "TREE_NODE's nodeState" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
						//						SupportClasses.FTREE.SetTreeNodeProperty(htree, findNode, Ftree.nodeState, TreeServices.EXPANDED_NODE);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'TREE_NODE's nodeState' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
						
						
						setTreeNodeIcon(htree, findNode, "open_folder");
						// 
						setTreeSelection(htree, findNode, true);
						setTreeSelection(htree, findNode, false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.SHOW_SITEMAP
		 IF GET_VIEW_PROPERTY('SITEMAP',VISIBLE) = 'TRUE' THEN
  EXECUTE_TRIGGER('REFRESH_SITEMAP');
ELSE
  HIDE_VIEW('TREE_CANVAS');
  EXECUTE_TRIGGER('REFRESH_SITEMAP');
--
  SHOW_VIEW('SITEMAP');
 	SHOW_VIEW('GO_CANVAS');
  SHOW_VIEW('MESSAGES_CANVAS');
  SHOW_VIEW('LINKS_CANVAS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.SHOW_SITEMAP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_SITEMAP")
		public void Guagmnu_ShowSitemap()
		{
			
				if ( getViewVisible("SITEMAP").equals("TRUE") )
				{
					executeAction("REFRESH_SITEMAP");
				}
				else {
					hideView("TREE_CANVAS");
					executeAction("REFRESH_SITEMAP");
					// 
					showView("SITEMAP");
					showView("GO_CANVAS");
					showView("MESSAGES_CANVAS");
					showView("LINKS_CANVAS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.SHOW_TREE
		 IF GET_VIEW_PROPERTY('TREE_CANVAS',VISIBLE) = 'TRUE' THEN
  EXECUTE_TRIGGER('REFRESH_TREE');
ELSE
 	HIDE_VIEW('SITEMAP');
  SHOW_VIEW('TREE_CANVAS');
 	SHOW_VIEW('GO_CANVAS');
  SHOW_VIEW('MESSAGES_CANVAS');
  SHOW_VIEW('LINKS_CANVAS');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.SHOW_TREE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_TREE")
		public void Guagmnu_ShowTree()
		{
			
				if ( getViewVisible("TREE_CANVAS").equals("TRUE") )
				{
					executeAction("REFRESH_TREE");
				}
				else {
					hideView("SITEMAP");
					showView("TREE_CANVAS");
					showView("GO_CANVAS");
					showView("MESSAGES_CANVAS");
					showView("LINKS_CANVAS");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.WAS_PROCESS_MENU_LOADED
		 --
-- Check if process menu has already been loaded, and if not, load it
--
IF :FORM_HEADER.BP_POP = 'Y' THEN
  NULL;
ELSE
  MESSAGE(G$_NLS.Get('GUAGMNU-0023','FORM','Please Wait ... Adding Business Processes to Your Menu ...'));
  SYNCHRONIZE;
  EXECUTE_TRIGGER('POPULATE_PROCESS_MENU');
  CLEAR_MESSAGE;
  :FORM_HEADER.BP_POP := 'Y';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.WAS_PROCESS_MENU_LOADED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WAS_PROCESS_MENU_LOADED")
		public void Guagmnu_WasProcessMenuLoaded()
		{
			
				// 
				//  Check if process menu has already been loaded, and if not, load it
				// 
				// 
				//  Check if process menu has already been loaded, and if not, load it
				// 
				if ( getFormModel().getFormHeader().getBpPop().equals("Y") )
				{
				}
				else {
					message(GNls.Fget(toStr("GUAGMNU-0023"), toStr("FORM"), toStr("Please Wait ... Adding Business Processes to Your Menu ...")));
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
					executeAction("POPULATE_PROCESS_MENU");
					clearMessage();
					getFormModel().getFormHeader().setBpPop(toStr("Y"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GUAGMNU.ON-LOGOUT
		 DECLARE
	lv_x   VARCHAR2(01);
BEGIN
	BEGIN
    G$_SECURITY.g$_audit_banner_logoff(p_comment => 'Logoff from forms');
	EXCEPTION
		WHEN OTHERS THEN
		  lv_x := 'x';
  END;
  LOGOUT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAGMNU.ON-LOGOUT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-LOGOUT")
		public void Guagmnu_OnLogout()
		{
			
				{
					NString lvX= NString.getNull();
					try
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						GSecurity.gAuditBannerLogoff(toStr(/*pComment=>*/"Logoff from forms"));
					}
					catch(Exception  e)
					{
						lvX = toStr("x");
					}
					// F2J_NOT_SUPPORTED : Call to built-in "LOGOUT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
					//					SupportClasses.FORMS40.Logout();
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGOUT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
					
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.POST-BLOCK
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK")
		public void menuType_PostBlock()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.PRE-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK")
		public void menuType_PreBlock()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.QUERY_DATA
		 DECLARE
  HOLD_POS VARCHAR2(80) := :SYSTEM.CURSOR_ITEM;
BEGIN
  GO_BLOCK('GUBOBJS');
  EXECUTE_QUERY;
  GO_ITEM(HOLD_POS);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.QUERY_DATA
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="QUERY_DATA")
		public void menuType_QueryData()
		{
			
				{
					NString holdPos = getCursorItem();
					goBlock(toStr("GUBOBJS"));
					executeQuery();
					goItem(holdPos);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MENU_TYPE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE")
		public void menuType_WhenNewBlockInstance()
		{
			
			}

		
	
}
	
