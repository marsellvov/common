package net.hedtech.banner.general.common.Goamtch.controller;
import java.awt.Button;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goamtch.model.*;
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.banner.general.common.Goamtch.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class GoamtchFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GoamtchFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GoamtchTask getTask() {
		return (GoamtchTask)super.getTask();
	}
	
	
	public GoamtchModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Goamtch_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Goamtch_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Goamtch_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.PRE_FORM_TRG
		 BEGIN
  :global.created_id := '?';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Goamtch_PreFormTrg()
		{
			
				setGlobal("CREATED_ID", toStr("?"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Goamtch_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Goamtch_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Goamtch_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Goamtch_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Goamtch_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Goamtch_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Goamtch_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Goamtch_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Goamtch_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Goamtch_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGFormClass().beforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Goamtch_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Goamtch_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Goamtch_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Goamtch_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Goamtch_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Goamtch_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Goamtch_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Goamtch_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Goamtch_WhenNewBlockInstanceTrg()
		{
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					goItem("ID");		
				}
				else
				{
					getGFormClass().whenNewBlockInstanceTrg();
				}
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Goamtch_doubleClick()
		{
			
//				getGFormClass().whenMouseDoubleclick();
				this.getTask().getServices().selectIdAndExit();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Goamtch_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Goamtch_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Goamtch_WhenWindowActivatedTrg()
		{
			
				getGFormClass().whenWindowActivatedTrg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.WHEN-WINDOW-CLOSED
		 BEGIN
  IF :SYSTEM.EVENT_WINDOW = 'DETAILS_WINDOW' THEN
    CLEAR_BLOCK;
    GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM);
    HIDE_WINDOW('DETAILS_WINDOW');
--
  ELSIF :SYSTEM.EVENT_WINDOW = 'COMMENTS_WINDOW' THEN
    CLEAR_BLOCK;
    GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM); 
    HIDE_WINDOW('COMMENTS_WINDOW');
--
  ELSE
    G$_WIN_CLOSED;
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Goamtch_WhenWindowClosed()
		{
			
				if ( getCurrentWindow().equals("DETAILS_WINDOW") )
				{
					clearBlock();
					goItem(getFormModel().getFormHeader().getHoldBlkItem());
					hideWindow("DETAILS_WINDOW");
				}
				else if ( getCurrentWindow().equals("COMMENTS_WINDOW") ) {
					clearBlock();
					goItem(getFormModel().getFormHeader().getHoldBlkItem());
					hideWindow("COMMENTS_WINDOW");
				}
				else {
					getTask().getGoqrpls().gWinClosed();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-CLRFRM
		 BEGIN
  IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN
    --G$_INVALID_FUNCTION_MSG;  --commented for defect 1-1V1V4D
    MESSAGE(G$_NLS.GET('GOAMTCH-0000','FORM','*ERROR* ID and Source cannot be changed.')); --Added for defect 1-1V1V4D
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  EXECUTE_TRIGGER('SAVE_KEYS');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('ENABLE_KEYS');
  G$_CHECK_FAILURE;
--
  CLEAR_FORM(NO_VALIDATE);
  G$_CHECK_FAILURE;
--
  :FORM_HEADER.DO_TAB_NAVIGATION := 'N';
  :COMMIT_COMPLETED := 'Y';
--
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GLOBAL_COPY');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('RESET_TAB_PAGES');
  G$_CHECK_FAILURE;
--
  SET_ITEM_PROPERTY('GOTCMME.LAST_NAME',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_FIRST_NAME',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_MI',ENABLED,PROPERTY_TRUE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Goamtch_ClearTask()
		{
			
				if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
				{
					// G$_INVALID_FUNCTION_MSG;  --commented for defect 1-1V1V4D
					errorMessage(GNls.Fget(toStr("GOAMTCH-0000"), toStr("FORM"), toStr("*ERROR* ID and Source cannot be changed.")));
					// Added for defect 1-1V1V4D
					throw new ApplicationException();
				}
				// 
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				clearTask(TaskServices.NO_VALIDATE);
				getTask().getGoqrpls().gCheckFailure();
				// 
				getFormModel().getFormHeader().setDoTabNavigation(toStr("N"));
				getFormModel().getFormHeader().setCommitCompleted(toStr("Y"));
				// 
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("RESET_TAB_PAGES");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setItemEnabled("GOTCMME.LAST_NAME", true);
				setItemEnabled("GOTCMME.GOTCMME_FIRST_NAME", true);
				setItemEnabled("GOTCMME.GOTCMME_MI", true);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Goamtch_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Goamtch_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Goamtch_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Goamtch_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Goamtch_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Goamtch_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Goamtch_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Goamtch_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Goamtch_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Goamtch_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Goamtch_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Goamtch_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Goamtch_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Goamtch_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY_EXIT_TRG
		 BEGIN
  IF :GLOBAL.KEY_PIDM IS NULL THEN
  	:GLOBAL.KEY_ID   := '';
    :GLOBAL.KEY_IDNO := '';
    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Goamtch_KeyExitTrg()
		{
			
				if ( getGlobal("KEY_PIDM").isNull() )
				{
					setGlobal("KEY_ID", toStr(""));
					setGlobal("KEY_IDNO", toStr(""));
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Goamtch_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Goamtch_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Goamtch_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.SAVE_KEYS
		 BEGIN
  IF NVL(:FORM_HEADER.SKIP_SAVE,'N') = 'N' THEN
    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
  END IF;
  :GLOBAL.CM_SOURCE_CODE := :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Goamtch_SaveKeys()
		{
			
				if ( isNull(getFormModel().getFormHeader().getSkipSave(), "N").equals("N") )
				{
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				}
				setGlobal("CM_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.ENABLE_KEYS
		 BEGIN
  IF GET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('KEY_BLOCK.ID',NAVIGABLE,PROPERTY_ON);
  END IF;
--
  IF GET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',NAVIGABLE,PROPERTY_ON);
  END IF;
--
  IF GET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED,PROPERTY_ON);
  END IF;
--
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',VISIBLE) = 'TRUE' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',ENABLED,PROPERTY_ON);
  END IF;
  -- 73-5
  IF GET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT',ENABLED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT',ENABLED,PROPERTY_ON);
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT',NAVIGABLE,PROPERTY_ON);
  END IF;
-- 73-5
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN',ENABLED) = 'TRUE' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN',ENABLED,PROPERTY_OFF);
  END IF;
  --
  IF GET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN',ENABLED) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN',ENABLED,PROPERTY_ON);
  END IF;
-- 73-5
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Goamtch_EnableKeys()
		{
			
				if ( getItemEnabled("KEY_BLOCK.ID").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.ID", true);
					setItemNavigable("KEY_BLOCK.ID", true);
				}
				// 
				if ( getItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", true);
					setItemNavigable("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", true);
				}
				// 
				if ( getItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT", true);
				}
				// 
				if ( getItemVisible("KEY_BLOCK.GENERATE_BTN").equals("FALSE") )
				{
					setItemVisible("KEY_BLOCK.GENERATE_BTN", true);
				}
				//  73-5
				if ( getItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT", true);
					setItemNavigable("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT", true);
				}
				//  73-5
				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN").equals("TRUE") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN", false);
				}
				// 
				if ( getItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.DISABLE_KEYS
		 BEGIN
  SET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',ENABLED,PROPERTY_OFF);
  -- 73-5
  --SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN',ENABLED,PROPERTY_ON);
  SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT',ENABLED,PROPERTY_OFF);
  -- 73-5
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Goamtch_DisableKeys()
		{
			
				setItemEnabled("KEY_BLOCK.ID", false);
				setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", false);
				setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.GENERATE_BTN", false);
				//  73-5
				// SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN',ENABLED,PROPERTY_ON);
				setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT_BTN", false);
				setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_COMMENT", false);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Goamtch_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Goamtch_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.CHECK_KEYS
		 BEGIN
  IF :KEY_BLOCK.ID IS NULL THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0001','FORM','*ERROR* An ID must be entered for function.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :KEY_BLOCK.KEYBLOCK_SOURCE_CODE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0002','FORM','*ERROR* A valid source code is required.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Goamtch_CheckKeys()
		{
			
				if ( getFormModel().getKeyBlock().getId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0001"), toStr("FORM"), toStr("*ERROR* An ID must be entered for function.")));
					throw new ApplicationException();
				}
				// 
				if ( getFormModel().getKeyBlock().getKeyblockSourceCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0002"), toStr("FORM"), toStr("*ERROR* A valid source code is required.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Goamtch_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.WHEN-NEW-FORM-INSTANCE
		 DECLARE
  lv_valid_list       VARCHAR2(2000) := G$_GET_UPRF_CM_FORMS;
  lv_suppress         VARCHAR2(01);
  cursor gtvsdax_c is
    SELECT 'Y'
      FROM gtvsdax
     WHERE gtvsdax_internal_code_group  = 'GOAMTCH'
       AND gtvsdax_internal_code        = 'NO_GEN_BTN'
       AND UPPER(gtvsdax_external_code) = :FORM_HEADER.CALLING_FORM;
  
BEGIN
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GLOBAL_COPY');
  G$_CHECK_FAILURE;
--
-- Only suppress the GENERATE button for forms that have an entry in the GTVSDAX rows
--
  OPEN gtvsdax_c;
  FETCH gtvsdax_c INTO lv_suppress;
  CLOSE gtvsdax_c;
  IF NVL(lv_suppress,'N') = 'Y' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',VISIBLE,PROPERTY_FALSE);
  END IF; 	
--
-- Orignally if you were transferred to GOAMTCH form another form the generate button
-- would be removed
--  IF INSTR(lv_valid_list,:FORM_HEADER.CALLING_FORM) <> 0 THEN
--    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',VISIBLE,PROPERTY_FALSE);
--  END IF;
--
  G$_SET_INST_PROPERTY;
  G$_SET_WIN_PROPERTY;
--
  SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_FALSE);
  SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_FALSE);
--
  EXECUTE_TRIGGER('RESET_TAB_PAGES');
  --Added for auto dynamic hint
   G$_SSN_SET_ITEM_HINT('GOTCMME.GOTCMME_SSN');
   G$_SSN_SET_ITEM_HINT('GOVCMRT_MATCH.MATCH_SSN');
   G$_SSN_SET_ITEM_HINT('GOVCMID.MATCH_SSN');
   
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Goamtch_TaskStarted(EventObject args)
		{
			
				int rowCount = 0;
				{
					NString lvValidList = getTask().getGoqrpls().gGetUprfCmForms();
					NString lvSuppress= NString.getNull();
					String sqlgtvsdaxC = "SELECT 'Y' " +
	" FROM gtvsdax " +
	" WHERE gtvsdax_internal_code_group = 'GOAMTCH' AND gtvsdax_internal_code = 'NO_GEN_BTN' AND UPPER(gtvsdax_external_code) = :FORM_HEADER_CALLING_FORM ";
					DataCursor gtvsdaxC = new DataCursor(sqlgtvsdaxC);
					try {
						executeAction("LOAD_FORM_HEADER");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("GLOBAL_COPY");
						getTask().getGoqrpls().gCheckFailure();
						// 
						//  Only suppress the GENERATE button for forms that have an entry in the GTVSDAX rows
						// 
						//Setting query parameters
						gtvsdaxC.addParameter("FORM_HEADER_CALLING_FORM", getFormModel().getFormHeader().getCallingForm());
						gtvsdaxC.open();
						ResultSet gtvsdaxCResults = gtvsdaxC.fetchInto();
						if ( gtvsdaxCResults != null ) {
							lvSuppress = gtvsdaxCResults.getStr(0);
						}
						gtvsdaxC.close();
						if ( isNull(lvSuppress, "N").equals("Y") )
						{
							setItemVisible("BUTTON_CONTROL_BLOCK.GENERATE_BTN", false);
						}
						// 
						//  Orignally if you were transferred to GOAMTCH form another form the generate button
						//  would be removed
						//   IF INSTR(lv_valid_list,:FORM_HEADER.CALLING_FORM) <> 0 THEN
						//     SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',VISIBLE,PROPERTY_FALSE);
						//   END IF;
						// 
						getTask().getGoqrpls().gSetInstProperty();
						getTask().getGoqrpls().gSetWinProperty();
						// 
						setMenuItemEnabled("Action.Select", false);
						setMenuItemEnabled("Icons.Select", false);
						// 
						executeAction("RESET_TAB_PAGES");
						// Added for auto dynamic hint
						getTask().getGoqrpls().gSsnSetItemHint(toStr("GOTCMME.GOTCMME_SSN"));
						getTask().getGoqrpls().gSsnSetItemHint(toStr("GOVCMRT_MATCH.MATCH_SSN"));
						getTask().getGoqrpls().gSsnSetItemHint(toStr("GOVCMID.MATCH_SSN"));
					}
					finally{
						gtvsdaxC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Goamtch_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.LOAD_FORM_HEADER
		 BEGIN
  :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
  :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
  :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
  :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
  :CURRENT_USER := :GLOBAL.CURRENT_USER;
  :FORM_HEADER.CALLING_FORM := GET_APPLICATION_PROPERTY(CALLING_FORM);
--
 	CASE :FORM_HEADER.CALLING_FORM
    WHEN 'RCRSUSP' THEN
      :FORM_HEADER.ALLOW_CLEAR_BLOCK := 'N';
      :FORM_HEADER.ALLOW_CLEAR_FORM  := 'N';
      :FORM_HEADER.ALLOW_UPDATES     := 'N';
    WHEN 'SHAEDIS' THEN
      :FORM_HEADER.ALLOW_CLEAR_BLOCK := 'Y';
      :FORM_HEADER.ALLOW_CLEAR_FORM  := 'N';
      :FORM_HEADER.ALLOW_UPDATES     := 'Y';
    WHEN 'SRIPREL' THEN
      :FORM_HEADER.ALLOW_CLEAR_BLOCK := 'Y';
      :FORM_HEADER.ALLOW_CLEAR_FORM  := 'N';
      :FORM_HEADER.ALLOW_UPDATES     := 'Y';
    WHEN 'SAAEAPS' THEN
      :FORM_HEADER.ALLOW_CLEAR_BLOCK := 'Y';
      :FORM_HEADER.ALLOW_CLEAR_FORM  := 'N';
      :FORM_HEADER.ALLOW_UPDATES     := 'Y';
ELSE 
      :FORM_HEADER.ALLOW_CLEAR_BLOCK := 'Y';
      :FORM_HEADER.ALLOW_CLEAR_FORM  := 'Y';
      :FORM_HEADER.ALLOW_UPDATES     := 'Y';
  END CASE;
--
  EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
END;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Goamtch_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getGlobal("CURRENT_USER"));
				getFormModel().getFormHeader().setCallingForm(toStr(getParentTaskName()));
				// 
				if (getFormModel().getFormHeader().getCallingForm().equals("RCRSUSP"))
				{
					getFormModel().getFormHeader().setAllowClearBlock(toStr("N"));
					getFormModel().getFormHeader().setAllowClearForm(toStr("N"));
					getFormModel().getFormHeader().setAllowUpdates(toStr("N"));
				}
				else if (getFormModel().getFormHeader().getCallingForm().equals("SHAEDIS"))
				{
					getFormModel().getFormHeader().setAllowClearBlock(toStr("Y"));
					getFormModel().getFormHeader().setAllowClearForm(toStr("N"));
					getFormModel().getFormHeader().setAllowUpdates(toStr("Y"));
				}
				else if (getFormModel().getFormHeader().getCallingForm().equals("SRIPREL"))
				{
					getFormModel().getFormHeader().setAllowClearBlock(toStr("Y"));
					getFormModel().getFormHeader().setAllowClearForm(toStr("N"));
					getFormModel().getFormHeader().setAllowUpdates(toStr("Y"));
				}
				else if (getFormModel().getFormHeader().getCallingForm().equals("SAAEAPS"))
				{
					getFormModel().getFormHeader().setAllowClearBlock(toStr("Y"));
					getFormModel().getFormHeader().setAllowClearForm(toStr("N"));
					getFormModel().getFormHeader().setAllowUpdates(toStr("Y"));
				}
				else {
					getFormModel().getFormHeader().setAllowClearBlock(toStr("Y"));
					getFormModel().getFormHeader().setAllowClearForm(toStr("Y"));
					getFormModel().getFormHeader().setAllowUpdates(toStr("Y"));
				}
				// 
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.GLOBAL_COPY
		 DECLARE
  lv_call_ui          GOBCMUS.GOBCMUS_EXCLUDE_IND%TYPE;
  lv_cmsc_option_ind  GOBCMUS.GOBCMUS_CMSC_OPTION_IND%TYPE;
  lv_cmsc_code        GOBCMUS.GOBCMUS_CM_USER_ID%TYPE;
  lv_user             VARCHAR2(30) := :GLOBAL.CURRENT_USER;
  --start defect 1-43RRVA
  lv_valid_ind VARCHAR2(1) := '';

  CURSOR valid_ssn_c IS
     SELECT 'X'
       FROM SPBPERS
      WHERE SPBPERS_SSN = :global.key_idno;
   --end defect 1-43RRVA
BEGIN
	
	--start defect 1-43RRVA
	  
	  --Set the value of global variable global.key_idno to "GENERATED", when GOAMATCH is called from SHAEDIS
    --and the value of global variable global.key_idno already exist in Banner as a SSN number.
    IF (:GLOBAL.SSN_SEARCH_ENABLED_IND = 'Y') AND
    	 (:FORM_HEADER.CALLING_FORM = 'SHAEDIS') THEN
	    OPEN valid_ssn_c;
	    FETCH valid_ssn_c INTO lv_valid_ind;
	    CLOSE valid_ssn_c;
      IF lv_valid_ind IS NOT NULL THEN
        :global.key_idno := g$_nls.get('GOAMTCH-0003','FORM','GENERATED');
      END IF;
    END IF;
    
  --end defect 1-43RRVA

  GO_ITEM('KEY_BLOCK.KEYBLOCK_SOURCE_CODE');
  gokcmpk.p_get_cm_options(lv_user, lv_call_ui, lv_cmsc_option_ind, lv_cmsc_code);
--
-- If NOT allowed to clear the form, based on the switch set in the LOAD_FORM_HEADER, use the
-- global and disable the source code item.  If the global isn't valued, use the user's default.
-- If no default either, let the user enter one.
--
  DEFAULT_VALUE('','GLOBAL.CM_SOURCE_CODE');
  DEFAULT_VALUE('','GLOBAL.KEY_PIDM');
--
  IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN
    IF :GLOBAL.CM_SOURCE_CODE IS NOT NULL THEN
      :KEY_BLOCK.KEYBLOCK_SOURCE_CODE := :GLOBAL.CM_SOURCE_CODE;
      NEXT_FIELD;
--
      IF :FORM_HEADER.CALLING_FORM = 'RCRSUSP' THEN
        SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED,PROPERTY_FALSE);
        SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED,PROPERTY_FALSE);
      END IF;
--
    ELSE
    	IF lv_cmsc_code IS NOT NULL THEN
        :KEY_BLOCK.KEYBLOCK_SOURCE_CODE := lv_cmsc_code;
        NEXT_FIELD;
        IF :FORM_HEADER.CALLING_FORM NOT IN ('SHAEDIS','SRIPREL','SAAEAPS') THEN
          SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED,PROPERTY_FALSE);
          SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED,PROPERTY_FALSE);
        END IF;
      END IF;
    END IF;
--
  ELSE
    IF lv_cmsc_code IS NOT NULL THEN
      :KEY_BLOCK.KEYBLOCK_SOURCE_CODE := lv_cmsc_code;
      NEXT_FIELD;
    ELSIF :GLOBAL.CM_SOURCE_CODE IS NOT NULL THEN
	    :KEY_BLOCK.KEYBLOCK_SOURCE_CODE := :GLOBAL.CM_SOURCE_CODE;
      NEXT_FIELD;
    END IF;
  END IF;
--
  IF :GLOBAL.KEY_IDNO IS NOT NULL THEN
    GO_ITEM('KEY_BLOCK.ID');
    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO;
    NEXT_FIELD;
  END IF;
--
-- If the generate button is not visible, then the form is being called from another
-- form, passing in an ID so don't let the user change it.
--
  GO_ITEM('KEY_BLOCK.ID');
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GENERATE_BTN',VISIBLE) = 'FALSE' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.ID',INSERT_ALLOWED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('KEY_BLOCK.ID',UPDATE_ALLOWED,PROPERTY_FALSE);
  END IF;  	
--
-- Determine whether or not to disable the source code item.
--
  IF lv_cmsc_option_ind = 'N' THEN
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE',ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT',ENABLED,PROPERTY_FALSE);
    IF :KEY_BLOCK.KEYBLOCK_SOURCE_CODE IS NULL THEN
      MESSAGE(G$_NLS.GET('GOAMTCH-0004','FORM','*WARNING* User configuration is not correct, no default source code was found.'));
    END IF;
  END IF;
--
-- If generated id is passed in, attempt to navigate to the source code.
--
  IF :KEY_BLOCK.ID = 'GENERATED' THEN
    NEXT_FIELD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Goamtch_GlobalCopy()
		{
			
				int rowCount = 0;
				{
					NString lvCallUi= NString.getNull();
					NString lvCmscOptionInd= NString.getNull();
					NString lvCmscCode= NString.getNull();
					NString lvUser = getGlobal("CURRENT_USER");
					// start defect 1-43RRVA
					NString lvValidInd = toStr("");
					String sqlvalidSsnC = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :GLOBAL_KEY_IDNO ";
					DataCursor validSsnC = new DataCursor(sqlvalidSsnC);
					try {
						// start defect 1-43RRVA
						// Set the value of global variable global.key_idno to "GENERATED", when GOAMATCH is called from SHAEDIS
						// and the value of global variable global.key_idno already exist in Banner as a SSN number.
						if ( (getGlobal("SSN_SEARCH_ENABLED_IND").equals("Y")) && (getFormModel().getFormHeader().getCallingForm().equals("SHAEDIS")) )
						{
							//Setting query parameters
							validSsnC.addParameter("GLOBAL_KEY_IDNO", getGlobal("KEY_IDNO"));
							validSsnC.open();
							ResultSet validSsnCResults = validSsnC.fetchInto();
							if ( validSsnCResults != null ) {
								lvValidInd = validSsnCResults.getStr(0);
							}
							validSsnC.close();
							if ( !lvValidInd.isNull() )
							{
								setGlobal("KEY_IDNO", GNls.Fget(toStr("GOAMTCH-0003"), toStr("FORM"), toStr("GENERATED")));
							}
						}
						// end defect 1-43RRVA
						goItem(toStr("KEY_BLOCK.KEYBLOCK_SOURCE_CODE"));
						Ref<NString> p_call_ui_out_ref = new Ref<NString>(lvCallUi);
						Ref<NString> p_cmsc_option_ind_out_ref = new Ref<NString>(lvCmscOptionInd);
						Ref<NString> p_cmsc_code_out_ref = new Ref<NString>(lvCmscCode);
						Gokcmpk.pGetCmOptions(lvUser, p_call_ui_out_ref, p_cmsc_option_ind_out_ref, p_cmsc_code_out_ref);
						lvCallUi = p_call_ui_out_ref.val;
						lvCmscOptionInd = p_cmsc_option_ind_out_ref.val;
						lvCmscCode = p_cmsc_code_out_ref.val;
						// 
						//  If NOT allowed to clear the form, based on the switch set in the LOAD_FORM_HEADER, use the
						//  global and disable the source code item.  If the global isn't valued, use the user's default.
						//  If no default either, let the user enter one.
						// 
						setDefaultValue("", "GLOBAL.CM_SOURCE_CODE");
						setDefaultValue("", "GLOBAL.KEY_PIDM");
						// 
						if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
						{
							if ( !getGlobal("CM_SOURCE_CODE").isNull() )
							{
								getFormModel().getKeyBlock().setKeyblockSourceCode(getGlobal("CM_SOURCE_CODE"));
								nextItem();
								// 
								if ( getFormModel().getFormHeader().getCallingForm().equals("RCRSUSP") )
								{
									setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", false);
									setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT", false);
								}
							}
							else {
								if ( !lvCmscCode.isNull() )
								{
									getFormModel().getKeyBlock().setKeyblockSourceCode(lvCmscCode);
									nextItem();
									if ( !in(getFormModel().getFormHeader().getCallingForm(), "SHAEDIS", "SRIPREL", "SAAEAPS").getValue() )
									{
										setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", false);
										setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT", false);
									}
								}
							}
						}
						else {
							if ( !lvCmscCode.isNull() )
							{
								getFormModel().getKeyBlock().setKeyblockSourceCode(lvCmscCode);
								nextItem();
							}
							else if ( !getGlobal("CM_SOURCE_CODE").isNull() ) {
								getFormModel().getKeyBlock().setKeyblockSourceCode(getGlobal("CM_SOURCE_CODE"));
								nextItem();
							}
						}
						// 
						if ( !getGlobal("KEY_IDNO").isNull() )
						{
							goItem(toStr("KEY_BLOCK.ID"));
							getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
							nextItem();
						}
						// 
						//  If the generate button is not visible, then the form is being called from another
						//  form, passing in an ID so don't let the user change it.
						// 
						goItem(toStr("KEY_BLOCK.ID"));
						if ( getItemVisible("KEY_BLOCK.GENERATE_BTN").equals("FALSE") )
						{
							setItemInsertAllowed("KEY_BLOCK.ID", false);
							setItemUpdateAllowed("KEY_BLOCK.ID", false);
						}
						// 
						//  Determine whether or not to disable the source code item.
						// 
						if ( lvCmscOptionInd.equals("N") )
						{
							setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE", false);
							setItemEnabled("KEY_BLOCK.KEYBLOCK_SOURCE_CODE_LBT", false);
							if ( getFormModel().getKeyBlock().getKeyblockSourceCode().isNull() )
							{
								warningMessage(GNls.Fget(toStr("GOAMTCH-0004"), toStr("FORM"), toStr("*WARNING* User configuration is not correct, no default source code was found.")));
							}
						}
						// 
						//  If generated id is passed in, attempt to navigate to the source code.
						// 
						if ( getFormModel().getKeyBlock().getId().equals("GENERATED") )
						{
							nextItem();
						}
					}
					finally{
						validSsnC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.WHEN-TAB-PAGE-CHANGED
		 DECLARE
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('GOAMTCH_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN
	-- 7411-1 remove references to DO_TAB_NAVIGATION
	--
  --IF NVL(:FORM_HEADER.DO_TAB_NAVIGATION,'Y') = 'N' THEN
  --  :FORM_HEADER.DO_TAB_NAVIGATION := '';
  --  RETURN;
  --END IF;
  -- 7411-1 end
--
  IF tab_topmost = 'MATCH_TAB' THEN
    GO_BLOCK('GOVCMRT_MATCH');
  ELSIF tab_topmost = 'GOVCMID' THEN
    GO_BLOCK('GOVCMID');
    EXECUTE_QUERY;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Goamtch_tabChange()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("GOAMTCH_TAB_CANVAS");
					//  7411-1 remove references to DO_TAB_NAVIGATION
					// 
					// IF NVL(:FORM_HEADER.DO_TAB_NAVIGATION,'Y') = 'N' THEN
					//   :FORM_HEADER.DO_TAB_NAVIGATION := '';
					//   RETURN;
					// END IF;
					//  7411-1 end
					// 
					if ( tabTopmost.equals("MATCH_TAB") )
					{
						goBlock(toStr("GOVCMRT_MATCH"));
					}
					else if ( tabTopmost.equals("GOVCMID") ) {
						goBlock(toStr("GOVCMID"));
						executeQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.ENABLE_LOCAL_BTNS
		 BEGIN
  IF :FORM_HEADER.ALLOW_UPDATES = 'N' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CREATE_BTN',ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.UPDATE_BTN',ENABLED,PROPERTY_FALSE);
  ELSE
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CREATE_BTN',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.UPDATE_BTN',ENABLED,PROPERTY_TRUE);
  END IF;
--
  IF :FORM_HEADER.ALLOW_CLEAR_FORM = 'N' THEN
    IF :FORM_HEADER.ALLOW_CLEAR_BLOCK = 'N' THEN
      SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN'   ,ENABLED,PROPERTY_FALSE);
      SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN',ENABLED,PROPERTY_FALSE);
    ELSE
      SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN'   ,ENABLED,PROPERTY_TRUE);
      SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN',ENABLED,PROPERTY_TRUE);
    END IF;
  ELSE
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN'   ,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN',ENABLED,PROPERTY_TRUE);
  END IF;
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CHECK_BTN' ,ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SELECT_BTN',ENABLED,PROPERTY_TRUE);
--
-- Enable/Disable the details button based on the existance of options defined.
--
  IF (NVL(:FORM_HEADER.DETAILS_EXIST,'N')) = 'Y' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.DETAILS_BTN',ENABLED,PROPERTY_TRUE);
  ELSE
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.DETAILS_BTN',ENABLED,PROPERTY_FALSE);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.ENABLE_LOCAL_BTNS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_LOCAL_BTNS")
		public void Goamtch_EnableLocalBtns()
		{
			
				if ( getFormModel().getFormHeader().getAllowUpdates().equals("N") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.CREATE_BTN", false);
					setItemEnabled("BUTTON_CONTROL_BLOCK.UPDATE_BTN", false);
				}
				else {
					setItemEnabled("BUTTON_CONTROL_BLOCK.CREATE_BTN", true);
					setItemEnabled("BUTTON_CONTROL_BLOCK.UPDATE_BTN", true);
				}
				// 
				if ( getFormModel().getFormHeader().getAllowClearForm().equals("N") )
				{
					if ( getFormModel().getFormHeader().getAllowClearBlock().equals("N") )
					{
						setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN", false);
						setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN", false);
					}
					else {
						setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN", true);
						setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN", true);
					}
				}
				else {
					setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN", true);
					setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN", true);
				}
				// 
				setItemEnabled("BUTTON_CONTROL_BLOCK.CHECK_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.SELECT_BTN", true);
				// 
				//  Enable/Disable the details button based on the existance of options defined.
				// 
				if ( (isNull(getFormModel().getFormHeader().getDetailsExist(), "N")).equals("Y") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.DETAILS_BTN", true);
				}
				else {
					setItemEnabled("BUTTON_CONTROL_BLOCK.DETAILS_BTN", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.DISABLE_LOCAL_BTNS
		 BEGIN
  IF :FORM_HEADER.ALLOW_UPDATES = 'Y' THEN
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CREATE_BTN'       ,ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.UPDATE_BTN'       ,ENABLED,PROPERTY_FALSE);
  END IF;
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CHECK_BTN'          ,ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.DETAILS_BTN'        ,ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SELECT_BTN'         ,ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN'    ,ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN' ,ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN' ,ENABLED,PROPERTY_FALSE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.DISABLE_LOCAL_BTNS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_LOCAL_BTNS")
		public void Goamtch_DisableLocalBtns()
		{
			
				if ( getFormModel().getFormHeader().getAllowUpdates().equals("Y") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.CREATE_BTN", false);
					setItemEnabled("BUTTON_CONTROL_BLOCK.UPDATE_BTN", false);
				}
				// 
				setItemEnabled("BUTTON_CONTROL_BLOCK.CHECK_BTN", true);
				setItemEnabled("BUTTON_CONTROL_BLOCK.DETAILS_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.SELECT_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.RESET_TAB_PAGES
		 BEGIN
  ENABLE_MATCH_TAB;
  DISABLE_SUSPENSE_TAB;
--
  SET_GOVCMID_COUNT('');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.RESET_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="RESET_TAB_PAGES")
		public void Goamtch_ResetTabPages()
		{
			
				this.getTask().getServices().enableMatchTab();
				this.getTask().getServices().disableSuspenseTab();
				// 
				this.getTask().getServices().setGovcmidCount(toInt(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-DUPREC
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Goamtch_CopyRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-EXIT
		 BEGIN
  IF :SYSTEM.TRIGGER_BLOCK <> 'KEY_BLOCK' THEN
--
-- If the key block is still enabled, no need to delete any records.
--
    IF GET_ITEM_PROPERTY('KEY_BLOCK.ID',ENABLED) = 'FALSE' THEN
--
      IF :SYSTEM.TRIGGER_BLOCK IN ('GOVCMRT_MATCH','GOVCMID') THEN
        REMOVE_CMRT_RECORDS;
        GO_BLOCK('GOTCMME');
      END IF;
--
      IF :SYSTEM.RECORD_STATUS IN ('INSERT','NEW') THEN
      	DELETE_RECORD;
      ELSE
    	  IF :SYSTEM.RECORD_STATUS = 'CHANGED' THEN
          :SYSTEM.MESSAGE_LEVEL := '5';
          COMMIT_FORM;
          :SYSTEM.MESSAGE_LEVEL := '0';
        END IF;
      END IF;
    END IF;
--
  END IF;
--
  :GLOBAL.VALUE := '';
  :CHECK_KEYS := 'E';
  :GLOBAL.CM_PURGE_RECORDS := 'Y';
--
  EXECUTE_TRIGGER('KEY_EXIT_TRG');
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Goamtch_Exit()
		{
			
				if ( getTriggerBlock().notEquals("KEY_BLOCK") )
				{
					// 
					//  If the key block is still enabled, no need to delete any records.
					// 
					if ( getItemEnabled("KEY_BLOCK.ID").equals("FALSE") )
					{
						// 
						if ( in(getTriggerBlock(), "GOVCMRT_MATCH", "GOVCMID").getValue() )
						{
							this.getTask().getServices().removeCmrtRecords();
							goBlock(toStr("GOTCMME"));
						}
						// 
						if ( (getRecordStatus().equals("INSERT") || getRecordStatus().equals("NEW")) )
						{
							deleteRecord();
						}
						else {
							if ( getRecordStatus().equals("CHANGED") )
							{
								try { 
								MessageServices.setMessageLevel(MessageLevel.NONE);
								commitTask();
								} finally {
											
								MessageServices.resetMessageLevel();
								}
											
							}
						}
					}
				}
				// 
				setGlobal("VALUE", toStr(""));
				getFormModel().getFormHeader().setCheckKeys(toStr("E"));
				setGlobal("CM_PURGE_RECORDS", toStr("Y"));
				// 
				executeAction("KEY_EXIT_TRG");
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-NXTBLK
		 BEGIN
  NEXT_BLOCK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Goamtch_NextBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-DUP-ITEM
		 
G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Goamtch_KeyDupItem()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-NXTSET
		 SCROLL_DOWN;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Goamtch_KeyNxtset()
		{
			
				
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.KEY-PRVBLK
		 
G$_INVALID_FUNCTION_MSG;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Goamtch_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.POST_QUERY_TRG
		 BEGIN
  G$_MASKS.G$_STRING_MASKS(p_form_name     => :SYSTEM.CURRENT_FORM, 
                           p_block_name    => :SYSTEM.CURRENT_BLOCK, 
                           p_column_name   => '', 
                           p_record_number => :SYSTEM.TRIGGER_RECORD); 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.POST_QUERY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_QUERY_TRG")
		public void Goamtch_PostQueryTrg()
		{
			
				getTask().getGoqrpls().getGMasks().gStringMasks(toStr(/*pFormName=>*/getCurrentTaskName()), toStr(/*pBlockName=>*/getCurrentBlock()), /*pColumnName=>*/toStr(""), toStr(/*pRecordNumber=>*/getTriggerRecord()));
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.CM_CREATE_NEW_ID_1
		 DECLARE
	  -- 73-5
  API_alert_id ALERT := FIND_ALERT('G$_CAUTION_OK_ALERT');
  ack_API_err NUMBER;
  lv_failure_msg   VARCHAR2(2000);
  lv_address_failure VARCHAR2(1) := 'N';
  lv_telephone_failure VARCHAR2(1) := 'N';
  lv_email_failure VARCHAR2(1) := 'N';
BEGIN
	:FORM_HEADER.API_FAILURE := 'N';
-- 73-5
-- pre-validate as much data as possible before creating PIDM
--
-- 74-3 change minimum address requirements to match API GB_ADDRESS.
--	1) 'City' is required.
--	2) if 'State' is entered then 'ZIP/Postal Code' is required.
--	3) if 'ZIP/Postal Code' is entered then either 'State' or 'Nation' is required.
--	4) if 'ZIP/Postal Code' is not entered, the either 'State' or 'Nation' is required
--
  if  :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND = 'Y' THEN
  	--
  		IF	:GOTCMME.GOTCMME_ATYP_CODE IS NOT NULL THEN
  			-- 1 --
					if	:GOTCMME.GOTCMME_CITY is null then
         			lv_failure_msg := G$_NLS.Get('GOAMTCH-0005','FORM','Address');
         			:FORM_HEADER.API_FAILURE := 'Y';
         			lv_address_failure := 'Y';
  	 			-- 2 --
  	 			elsif	:GOTCMME.GOTCMME_STAT_CODE is not null then
  	 					IF	:GOTCMME.GOTCMME_ZIP IS NULL THEN
  	 							lv_failure_msg := G$_NLS.Get('GOAMTCH-0006','FORM','Address');
         					:FORM_HEADER.API_FAILURE := 'Y';
         					lv_address_failure := 'Y';
  	 					END IF;
  	 			-- 3 --
  	 			elsif	:GOTCMME.GOTCMME_ZIP is not null then
  	 					IF	(	:GOTCMME.GOTCMME_STAT_CODE is null
         			AND 	:GOTCMME.GOTCMME_NATN_CODE is null) THEN
									lv_failure_msg := G$_NLS.Get('GOAMTCH-0007','FORM','Address');
         					:FORM_HEADER.API_FAILURE := 'Y';
         					lv_address_failure := 'Y';
  	 					END IF;
  	 			-- 4 --
  	 			elsif	:GOTCMME.GOTCMME_ZIP is     null then
  	 					IF	(	:GOTCMME.GOTCMME_STAT_CODE is null
         			AND 	:GOTCMME.GOTCMME_NATN_CODE is null) THEN
									lv_failure_msg := G$_NLS.Get('GOAMTCH-0008','FORM','Address');
         					:FORM_HEADER.API_FAILURE := 'Y';
         					lv_address_failure := 'Y';
  	 					END IF;
  	 			end if;
  	 			--
  		END IF;
  --
  		IF  :GOTCMME.GOTCMME_TELE_CODE IS NOT NULL
  		AND :GOTCMME.GOTCMME_PHONE_NUMBER IS NULL THEN
      		if  lv_address_failure = 'Y' then
          		lv_failure_msg := lv_failure_msg||G$_NLS.Get('GOAMTCH-0009','FORM',', Telephone');
      		else
      	  		lv_failure_msg := lv_failure_msg||G$_NLS.Get('GOAMTCH-0010','FORM','Telephone');
      		end if;
      		lv_telephone_failure := 'Y';
      		:FORM_HEADER.API_FAILURE := 'Y';
  		END IF;
  --
  		IF  :GOTCMME.GOTCMME_EMAL_CODE IS NOT NULL
  		AND :GOTCMME.GOTCMME_EMAIL_ADDRESS IS NULL THEN
      		if  lv_address_failure = 'Y' 
      		or  lv_telephone_failure = 'Y' then
         			lv_failure_msg := lv_failure_msg||G$_NLS.Get('GOAMTCH-0011','FORM',', E-mail');
      		else
      	  		lv_failure_msg := lv_failure_msg||G$_NLS.Get('GOAMTCH-0012','FORM','E-mail');
      		end if;
          lv_email_failure := 'Y';
          :FORM_HEADER.API_FAILURE := 'Y';
      END IF;
  --
  end if;
  --
  IF  :FORM_HEADER.API_FAILURE = 'Y' THEN
  	  lv_failure_msg := G$_NLS.Get('GOAMTCH-0013','FORM','A new ID cannot be created without complete ')||lv_failure_msg||'.';
      SET_ALERT_PROPERTY(API_alert_id,TITLE,(G$_NLS.Get('GOAMTCH-0014','FORM','Data Entry missing values')));
      SET_ALERT_PROPERTY(API_alert_id,ALERT_MESSAGE_TEXT,lv_failure_msg);
      ack_API_err := SHOW_ALERT(API_alert_id);
      CLEAR_SUSPENSE_BLOCK;
      RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.CM_CREATE_NEW_ID_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CM_CREATE_NEW_ID_1")
		public void Goamtch_CmCreateNewId1()
		{
			
				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				if(gotcmmeElement==null){
					return;
				}


				{
					//  73-5
					AlertDescriptor apiAlertId = findAlert("G$_CAUTION_OK_ALERT");
					NNumber ackApiErr= NNumber.getNull();
					NString lvFailureMsg= NString.getNull();
					NString lvAddressFailure = toStr("N");
					NString lvTelephoneFailure = toStr("N");
					NString lvEmailFailure = toStr("N");
					getFormModel().getFormHeader().setApiFailure(toStr("N"));
					//  73-5
					//  pre-validate as much data as possible before creating PIDM
					// 
					//  74-3 change minimum address requirements to match API GB_ADDRESS.
					// 	1) 'City' is required.
					// 	2) if 'State' is entered then 'ZIP/Postal Code' is required.
					// 	3) if 'ZIP/Postal Code' is entered then either 'State' or 'Nation' is required.
					// 	4) if 'ZIP/Postal Code' is not entered, the either 'State' or 'Nation' is required
					// 
					if ( getFormModel().getKeyBlock().getKeyblockApiFailureInd().equals("Y") )
					{
						// 
						if ( !gotcmmeElement.getGotcmmeAtypCode().isNull() )
						{
							//  1 --
							if ( gotcmmeElement.getGotcmmeCity().isNull() )
							{
								lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0005"), toStr("FORM"), toStr("Address"));
								getFormModel().getFormHeader().setApiFailure(toStr("Y"));
								lvAddressFailure = toStr("Y");
							}
							else if ( !gotcmmeElement.getGotcmmeStatCode().isNull() ) {
								if ( gotcmmeElement.getGotcmmeZip().isNull() )
								{
									lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0006"), toStr("FORM"), toStr("Address"));
									getFormModel().getFormHeader().setApiFailure(toStr("Y"));
									lvAddressFailure = toStr("Y");
								}
							}
							else if ( !gotcmmeElement.getGotcmmeZip().isNull() ) {
								if ((gotcmmeElement.getGotcmmeStatCode().isNull() && gotcmmeElement.getGotcmmeNatnCode().isNull()))
								{
									lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0007"), toStr("FORM"), toStr("Address"));
									getFormModel().getFormHeader().setApiFailure(toStr("Y"));
									lvAddressFailure = toStr("Y");
								}
							}
							else if ( gotcmmeElement.getGotcmmeZip().isNull() ) {
								if ((gotcmmeElement.getGotcmmeStatCode().isNull() && gotcmmeElement.getGotcmmeNatnCode().isNull()))
								{
									lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0008"), toStr("FORM"), toStr("Address"));
									getFormModel().getFormHeader().setApiFailure(toStr("Y"));
									lvAddressFailure = toStr("Y");
								}
							}
						}
						// 
						if ( !gotcmmeElement.getGotcmmeTeleCode().isNull() && gotcmmeElement.getGotcmmePhoneNumber().isNull() )
						{
							if ( lvAddressFailure.equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0009"), toStr("FORM"), toStr(", Telephone")));
							}
							else {
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0010"), toStr("FORM"), toStr("Telephone")));
							}
							lvTelephoneFailure = toStr("Y");
							getFormModel().getFormHeader().setApiFailure(toStr("Y"));
						}
						// 
						if ( !gotcmmeElement.getGotcmmeEmalCode().isNull() && gotcmmeElement.getGotcmmeEmailAddress().isNull() )
						{
							if ( lvAddressFailure.equals("Y") || lvTelephoneFailure.equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0011"), toStr("FORM"), toStr(", E-mail")));
							}
							else {
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0012"), toStr("FORM"), toStr("E-mail")));
							}
							lvEmailFailure = toStr("Y");
							getFormModel().getFormHeader().setApiFailure(toStr("Y"));
						}
					}
					// 
					if ( getFormModel().getFormHeader().getApiFailure().equals("Y") )
					{
						lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0013"), toStr("FORM"), toStr("A new ID cannot be created without complete ")).append(lvFailureMsg).append(".");
						setAlertTitle(apiAlertId, ((GNls.Fget(toStr("GOAMTCH-0014"), toStr("FORM"), toStr("Data Entry missing values")))));
						setAlertMessageText(apiAlertId, lvFailureMsg);
						ackApiErr = toNumber(showAlert(apiAlertId));
						this.getTask().getServices().clearSuspenseBlock();
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.CM_CREATE_NEW_ID_2
		 DECLARE
	lv_addr_seqno   SPRADDR.SPRADDR_SEQNO%TYPE;
  lv_atyp_code    SPRADDR.SPRADDR_ATYP_CODE%TYPE;
  lv_bdate        DATE := FORMAT_BIRTH_DATE;
  lv_id           SPRIDEN.SPRIDEN_ID%TYPE;
  lv_pidm         SPRIDEN.SPRIDEN_PIDM%TYPE;
  lv_primary_ind  SPRTELE.SPRTELE_PRIMARY_IND%TYPE := '';
  lv_rowid        VARCHAR2(18);
  lv_status_msg   VARCHAR2(2000);
  lv_tele_seqno   SPRTELE.SPRTELE_SEQNO%TYPE;
  lv_failure_msg  VARCHAR2(2000);
  API_alert_id 		ALERT := FIND_ALERT('G$_CAUTION_OK_ALERT');
  ack_API_err 		NUMBER;
BEGIN
	-- 73-5 reset API failure indicators
  :FORM_HEADER.API_FAILURE := 'N';
	:FORM_HEADER.F_CREATE_ADDRESS_ERR := 'N';
	:FORM_HEADER.F_CREATE_BIO_ERR := 'N';
	:FORM_HEADER.F_CREATE_EMAIL_ERR := 'N';
	:FORM_HEADER.F_CREATE_ADDID_ERR := 'N';
	:FORM_HEADER.F_CREATE_TELEPHONE_ERR := 'N';
--
  lv_id := :KEY_BLOCK.ID;
  REMOVE_CMRT_RECORDS;
  -- 
  SAVEPOINT BEGIN_CREATE;
--
-- Create the SPRIDEN record.
--
  GB_IDENTIFICATION.P_CREATE(p_ID_INOUT    =>lv_id,
                             p_LAST_NAME   =>:GOTCMME.GOTCMME_LAST_NAME,
                             p_FIRST_NAME  =>:GOTCMME.GOTCMME_FIRST_NAME,
                             p_MI          =>:GOTCMME.GOTCMME_MI,
                             p_CHANGE_IND  =>'',
                             p_ENTITY_IND  =>:GOTCMME.GOTCMME_ENTITY_CDE,
                             p_USER        =>:GLOBAL.CURRENT_USER,
                             p_ORIGIN      =>:SYSTEM.CURRENT_FORM,
                             p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
                             p_surname_prefix => null,
                             p_PIDM_INOUT  =>lv_pidm,
                             p_ROWID_OUT   =>lv_rowid);
--
  IF 	:KEY_BLOCK.ID = 'GENERATED' THEN
    	lv_status_msg := G$_NLS.Get('GOAMTCH-0015','FORM','Generated ID: ') || lv_id || '.  ';
  END IF;
--
  lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0016','FORM','Identification record created;');
--
-- Create the SPBPERS record.
--
  IF 	:GOTCMME.GOTCMME_SSN IS NOT NULL OR
  	 	:GOTCMME.GOTCMME_SEX IS NOT NULL OR
  	 	lv_bdate IS NOT NULL THEN
--
   		lv_status_msg := lv_status_msg || F_CREATE_BIO(lv_pidm, lv_bdate);
      if  :FORM_HEADER.F_CREATE_BIO_ERR = 'Y' then
      	  lv_failure_msg := lv_failure_msg || G$_NLS.Get('GOAMTCH-0017','FORM','Biographical record create failed; ');
      end if;      
  ELSE
  		lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0018','FORM',' Biographical record not created;');
  END IF;
--
-- Create the SPRADDR record.
--
  IF 	:GOTCMME.GOTCMME_ATYP_CODE IS NOT NULL THEN
    	lv_status_msg := lv_status_msg || F_CREATE_ADDRESS(lv_pidm, lv_atyp_code, lv_addr_seqno);
    	lv_primary_ind := 'Y';
      if  :FORM_HEADER.F_CREATE_ADDRESS_ERR = 'Y' then
      	  lv_failure_msg := lv_failure_msg || G$_NLS.Get('GOAMTCH-0019','FORM','Address record create failed; ');
      end if;
  ELSE
  		lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0020','FORM',' Address record not created;');
  END IF;
--
-- Create the SPRTELE record.
--
  IF 	:GOTCMME.GOTCMME_TELE_CODE IS NOT NULL AND
     (:GOTCMME.GOTCMME_PHONE_AREA IS NOT NULL OR
      :GOTCMME.GOTCMME_PHONE_NUMBER IS NOT NULL OR
      :GOTCMME.GOTCMME_PHONE_EXT IS NOT NULL) THEN
   		lv_status_msg := lv_status_msg || F_CREATE_TELEPHONE(lv_pidm, lv_atyp_code, 
      	                                                   lv_addr_seqno, lv_primary_ind);
      if  :FORM_HEADER.F_CREATE_TELEPHONE_ERR = 'Y' then
      	  lv_failure_msg := lv_failure_msg || G$_NLS.Get('GOAMTCH-0021','FORM','Telephone record create failed; ');
      end if;
  ELSE
  		lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0022','FORM','Telephone record not created;');
  END IF;
--
-- Create the GOREMAL record.
--
  IF 	:GOTCMME.GOTCMME_EMAL_CODE IS NOT NULL AND
  	 	:GOTCMME.GOTCMME_EMAIL_ADDRESS IS NOT NULL THEN
    	lv_status_msg := lv_status_msg || F_CREATE_EMAIL(lv_pidm);
      if  :FORM_HEADER.F_CREATE_EMAIL_ERR = 'Y' then
      	  lv_failure_msg := lv_failure_msg || G$_NLS.Get('GOAMTCH-0023','FORM','E-mail record create failed; ');
      end if;
  ELSE
  		lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0024','FORM','E-mail record not created.');
  END IF;
--
-- Create GORADID record.
--
  IF 	:GOTCMME.GOTCMME_ADID_CODE IS NOT NULL AND
  	 	:GOTCMME.GOTCMME_ADDITIONAL_ID IS NOT NULL THEN
    	lv_status_msg := lv_status_msg || F_CREATE_ADDID(lv_pidm);
      if  :FORM_HEADER.F_CREATE_ADDID_ERR = 'Y' then
      	  lv_failure_msg := lv_failure_msg || G$_NLS.Get('GOAMTCH-0025','FORM','Additional ID create failed; ');
      end if;
  ELSE
  		lv_status_msg := lv_status_msg || G$_NLS.Get('GOAMTCH-0026','FORM','Additional ID not created.');
  END IF;

--
  IF  :FORM_HEADER.API_FAILURE = 'Y' 
  AND :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND = 'Y' then
      lv_failure_msg := G$_NLS.Get('GOAMTCH-0027','FORM','ID Not Created: ')|| lv_failure_msg || G$_NLS.Get('GOAMTCH-0028','FORM','Enter complete data to create new ID.');
      --
      SET_ALERT_PROPERTY(API_alert_id,TITLE,G$_NLS.Get('GOAMTCH-0029','FORM','ID Not Created; API Error Encountered'));
      SET_ALERT_PROPERTY(API_alert_id,ALERT_MESSAGE_TEXT,lv_failure_msg);
      ack_API_err := SHOW_ALERT(API_alert_id);
      --
      GB_COMMON.P_ROLLBACK('NO ROLLBACK');
      --
      ROLLBACK TO SAVEPOINT BEGIN_CREATE;
      --
      GO_BLOCK('GOTCMME');
  ELSE
  		GB_COMMON.P_COMMIT;
--	
-- Notify user of the status of the changes being done by the update id button.
--
      SET_ALERT_PROPERTY(API_alert_id,TITLE,G$_NLS.Get('GOAMTCH-0030','FORM','New ID Created'));
      SET_ALERT_PROPERTY(API_alert_id,ALERT_MESSAGE_TEXT,lv_status_msg);
      ack_API_err := SHOW_ALERT(API_alert_id);
--
  		:GLOBAL.ID := lv_id;
  		:GLOBAL.KEY_IDNO := lv_id;
  		:GLOBAL.KEY_PIDM := lv_pidm;
  		:FORM_HEADER.SKIP_SAVE := 'Y';
      :global.created_id  := lv_id;
--
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    GB_COMMON.P_ROLLBACK;
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;


        --G$_NLS.Get('x','FORM','No matches found, create as new?'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.CM_CREATE_NEW_ID_2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CM_CREATE_NEW_ID_2")
		public void Goamtch_CmCreateNewId2()
		{
			

				GotcmmeAdapter gotcmmeElement = (GotcmmeAdapter)this.getFormModel().getGotcmme().getRowAdapter(true);
				if(gotcmmeElement==null){
					return;
				}



				{
					NNumber lvAddrSeqno= NNumber.getNull();
					NString lvAtypCode= NString.getNull();
					NDate lvBdate = this.getTask().getServices().formatBirthDate(gotcmmeElement);
					NString lvId= NString.getNull();
					NNumber lvPidm= NNumber.getNull();
					NString lvPrimaryInd = toStr("");
					NString lvRowid= NString.getNull();
					NString lvStatusMsg= NString.getNull();
					NNumber lvTeleSeqno= NNumber.getNull();
					NString lvFailureMsg= NString.getNull();
					AlertDescriptor apiAlertId = findAlert("G$_CAUTION_OK_ALERT");
					NNumber ackApiErr= NNumber.getNull();
					try
					{
						//  73-5 reset API failure indicators
						getFormModel().getFormHeader().setApiFailure(toStr("N"));
						getFormModel().getFormHeader().setFCreateAddressErr(toStr("N"));
						getFormModel().getFormHeader().setFCreateBioErr(toStr("N"));
						getFormModel().getFormHeader().setFCreateEmailErr(toStr("N"));
						getFormModel().getFormHeader().setFCreateAddidErr(toStr("N"));
						getFormModel().getFormHeader().setFCreateTelephoneErr(toStr("N"));
						// 
						lvId = getFormModel().getKeyBlock().getId();
						this.getTask().getServices().removeCmrtRecords();
						//  
						// 
						//  Create the SPRIDEN record.
						// 
						Ref<NString> p_id_inout_ref = new Ref<NString>(lvId);
						Ref<NNumber> p_pidm_inout_ref = new Ref<NNumber>(lvPidm);
						Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>(lvRowid.getValue().getBytes()); 
						//GbIdentification.pCreate(p_id_inout_ref, /*pLastName=>*/gotcmmeElement.getGotcmmeLastName(), /*pFirstName=>*/gotcmmeElement.getGotcmmeFirstName(), /*pMi=>*/gotcmmeElement.getGotcmmeMi(), /*pChangeInd=>*/toStr(""), /*pEntityInd=>*/gotcmmeElement.getGotcmmeEntityCde(), /*pUser=>*/getGlobal("CURRENT_USER"), toStr(/*pOrigin=>*/getCurrentTaskName()), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), toStr(/*pSurnamePrefix=>*/null), toStr(/*pPidmInout=>*/lvPidm), p_pidm_inout_ref);						
						GbIdentification.pCreate(p_id_inout_ref, 
								  /*pLastName=>*/gotcmmeElement.getGotcmmeLastName(), 
								  /*pFirstName=>*/gotcmmeElement.getGotcmmeFirstName(), 
								  /*pMi=>*/gotcmmeElement.getGotcmmeMi(), 
								  /*pChangeInd=>*/toStr(""), 
								  /*pEntityInd=>*/gotcmmeElement.getGotcmmeEntityCde(), 
								  /*pUser=>*/getGlobal("CURRENT_USER"), 
								  /*pOrigin=>*/toStr(getCurrentTaskName()), 
								  /*pNtypCode=>*/NString.getNull(), 
								  /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
								  /*pSurnamePrefix=>*/NString.getNull(), 
								  /*pPidmInout=>*/p_pidm_inout_ref, 
								  /*pRowidOut*/p_rowid_out_ref);
						
						/*TODO: <JM> corrected lvRowid to receive p_rowid_out_ref value, was receiving p_pidm_inout_ref erroneously
						 * added lvPidm assignment, was missing before.
						 */
						lvId = p_id_inout_ref.val;
						lvPidm = p_pidm_inout_ref.val;
						lvRowid = toStr(p_rowid_out_ref.val);
						
						// 
						if ( getFormModel().getKeyBlock().getId().equals("GENERATED") )
						{
							lvStatusMsg = GNls.Fget(toStr("GOAMTCH-0015"), toStr("FORM"), toStr("Generated ID: ")).append(lvId).append(".  ");
						}
						// 
						lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0016"), toStr("FORM"), toStr("Identification record created;")));
						// 
						//  Create the SPBPERS record.
						// 
						if ( !gotcmmeElement.getGotcmmeSsn().isNull() || !gotcmmeElement.getGotcmmeSex().isNull() || !lvBdate.isNull() )
						{
							// 
							lvStatusMsg = lvStatusMsg.append(this.getTask().getServices().fCreateBio(gotcmmeElement, lvPidm, lvBdate));
							if ( getFormModel().getFormHeader().getFCreateBioErr().equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0017"), toStr("FORM"), toStr("Biographical record create failed; ")));
							}
						}
						else {
							lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0018"), toStr("FORM"), toStr(" Biographical record not created;")));
						}
						// 
						//  Create the SPRADDR record.
						// 
						Ref<NString> pAtypCodeOut_ref =  new Ref<NString>(lvAtypCode);
						Ref<NNumber> pAddrSeqnoOut_ref =  new Ref<NNumber>(lvAddrSeqno);
						if ( !gotcmmeElement.getGotcmmeAtypCode().isNull() )
						{
							lvStatusMsg = lvStatusMsg.append(this.getTask().getServices().fCreateAddress(gotcmmeElement, lvPidm, pAtypCodeOut_ref, pAddrSeqnoOut_ref));
							lvPrimaryInd = toStr("Y");
							if ( getFormModel().getFormHeader().getFCreateAddressErr().equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0019"), toStr("FORM"), toStr("Address record create failed; ")));
							}
						}
						else {
							lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0020"), toStr("FORM"), toStr(" Address record not created;")));
						}
						// 
						//  Create the SPRTELE record.
						// 
						if ( !gotcmmeElement.getGotcmmeTeleCode().isNull() && (!gotcmmeElement.getGotcmmePhoneArea().isNull() || !gotcmmeElement.getGotcmmePhoneNumber().isNull() || !gotcmmeElement.getGotcmmePhoneExt().isNull()) )
						{
							lvStatusMsg = lvStatusMsg.append(this.getTask().getServices().fCreateTelephone(gotcmmeElement, lvPidm, lvAtypCode, lvAddrSeqno, lvPrimaryInd));
							if ( getFormModel().getFormHeader().getFCreateTelephoneErr().equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0021"), toStr("FORM"), toStr("Telephone record create failed; ")));
							}
						}
						else {
							lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0022"), toStr("FORM"), toStr("Telephone record not created;")));
						}
						// 
						//  Create the GOREMAL record.
						// 
						if ( !gotcmmeElement.getGotcmmeEmalCode().isNull() && !gotcmmeElement.getGotcmmeEmailAddress().isNull() )
						{
							lvStatusMsg = lvStatusMsg.append(this.getTask().getServices().fCreateEmail(gotcmmeElement, lvPidm));
							if ( getFormModel().getFormHeader().getFCreateEmailErr().equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0023"), toStr("FORM"), toStr("E-mail record create failed; ")));
							}
						}
						else {
							lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0024"), toStr("FORM"), toStr("E-mail record not created.")));
						}
						// 
						//  Create GORADID record.
						// 
						if ( !gotcmmeElement.getGotcmmeAdidCode().isNull() && !gotcmmeElement.getGotcmmeAdditionalId().isNull() )
						{
							lvStatusMsg = lvStatusMsg.append(this.getTask().getServices().fCreateAddid(gotcmmeElement, lvPidm));
							if ( getFormModel().getFormHeader().getFCreateAddidErr().equals("Y") )
							{
								lvFailureMsg = lvFailureMsg.append(GNls.Fget(toStr("GOAMTCH-0025"), toStr("FORM"), toStr("Additional ID create failed; ")));
							}
						}
						else {
							lvStatusMsg = lvStatusMsg.append(GNls.Fget(toStr("GOAMTCH-0026"), toStr("FORM"), toStr("Additional ID not created.")));
						}
						// 
						if ( getFormModel().getFormHeader().getApiFailure().equals("Y") && getFormModel().getKeyBlock().getKeyblockApiFailureInd().equals("Y") )
						{
							lvFailureMsg = GNls.Fget(toStr("GOAMTCH-0027"), toStr("FORM"), toStr("ID Not Created: ")).append(lvFailureMsg).append(GNls.Fget(toStr("GOAMTCH-0028"), toStr("FORM"), toStr("Enter complete data to create new ID.")));
							// 
							setAlertTitle(apiAlertId, GNls.Fget(toStr("GOAMTCH-0029"), toStr("FORM"), toStr("ID Not Created; API Error Encountered")));
							setAlertMessageText(apiAlertId, lvFailureMsg);
							ackApiErr = toNumber(showAlert(apiAlertId));
							// 
							GbCommon.pRollback(toStr("NO ROLLBACK"));
							// 
							rollback();
							// 
							goBlock(toStr("GOTCMME"));
						}
						else {
							GbCommon.pCommit();
							// 	
							//  Notify user of the status of the changes being done by the update id button.
							// 
							setAlertTitle(apiAlertId, GNls.Fget(toStr("GOAMTCH-0030"), toStr("FORM"), toStr("New ID Created")));
							setAlertMessageText(apiAlertId, lvStatusMsg);
							ackApiErr = toNumber(showAlert(apiAlertId));
							// 
							setGlobal("ID", lvId);
							setGlobal("KEY_IDNO", lvId);
							setGlobal("KEY_PIDM", toStr(lvPidm));
							getFormModel().getFormHeader().setSkipSave(toStr("Y"));
							setGlobal("CREATED_ID", lvId);
						}
					}
					catch(Exception  e)
					{
						GbCommon.pRollback(toStr(""));
						getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GOAMTCH.COUNT_GOVCMID_TRG
		 DECLARE
  lv_govcmid_cnt      PLS_INTEGER := 0;
  lv_govcmrt_cnt      PLS_INTEGER := 0;
  lv_result_cnt       PLS_INTEGER := 0;
--
  CURSOR govcmid_result_cnt_C IS
    SELECT COUNT(*) 
      FROM GOVCMID;
--
  CURSOR govcmrt_match_C IS
    SELECT COUNT(*) 
      FROM GOVCMRT
     WHERE GOVCMRT_RESULT_IND ='M';
BEGIN
  OPEN govcmid_result_cnt_C;
  FETCH govcmid_result_cnt_C INTO lv_govcmid_cnt;
  CLOSE govcmid_result_cnt_C;
--
  IF :GOVCMRT_MATCH.ROWID IS NOT NULL THEN
    OPEN govcmrt_match_C;
    FETCH govcmrt_match_C INTO lv_govcmrt_cnt;
    CLOSE govcmrt_match_C;
  END IF;
--
  lv_result_cnt := NVL(lv_govcmid_cnt,0) - NVL(lv_govcmrt_cnt,0);
  SET_GOVCMID_COUNT(lv_result_cnt);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOAMTCH.COUNT_GOVCMID_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="COUNT_GOVCMID_TRG")
		public void Goamtch_CountGovcmidTrg()
		{
			

				GovcmrtMatchAdapter govcmrtMatchElement = (GovcmrtMatchAdapter)this.getFormModel().getGovcmrtMatch().getRowAdapter(true);
				if(govcmrtMatchElement==null){
					return;
				}



				int rowCount = 0;
				{
					NInteger lvGovcmidCnt = toInt(0);
					NInteger lvGovcmrtCnt = toInt(0);
					NInteger lvResultCnt = toInt(0);
					String sqlgovcmidResultCntC = "SELECT COUNT(*) " +
	" FROM GOVCMID ";
					DataCursor govcmidResultCntC = new DataCursor(sqlgovcmidResultCntC);
					String sqlgovcmrtMatchC = "SELECT COUNT(*) " +
	" FROM GOVCMRT " +
	" WHERE GOVCMRT_RESULT_IND = 'M' ";
					DataCursor govcmrtMatchC = new DataCursor(sqlgovcmrtMatchC);
					try {
						govcmidResultCntC.open();
						ResultSet govcmidResultCntCResults = govcmidResultCntC.fetchInto();
						if ( govcmidResultCntCResults != null ) {
							lvGovcmidCnt = govcmidResultCntCResults.getInteger(0);
						}
						//govcmidResultCntC.close();
						// 
						if ( !govcmrtMatchElement.getRowState().equals(DataRowStatus.INSERTED))
						{
							govcmrtMatchC.open();
							ResultSet govcmrtMatchCResults = govcmrtMatchC.fetchInto();
							if ( govcmrtMatchCResults != null ) {
								lvGovcmrtCnt = govcmrtMatchCResults.getInteger(0);
							}
							//govcmrtMatchC.close();
						}
						// 
						lvResultCnt = toInt(isNull(lvGovcmidCnt, 0).subtract(isNull(lvGovcmrtCnt, 0)));
						this.getTask().getServices().setGovcmidCount(lvResultCnt);
					}
					finally{
						govcmidResultCntC.close();
						govcmrtMatchC.close();
					}
				}
			}

		
	
}
	
