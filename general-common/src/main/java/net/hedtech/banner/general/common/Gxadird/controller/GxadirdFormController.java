package net.hedtech.banner.general.common.Gxadird.controller;
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
import net.hedtech.banner.general.common.Gxadird.model.*;
import net.hedtech.banner.general.common.Gxadird.*;
import net.hedtech.banner.general.common.Gxadird.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;
import net.hedtech.general.common.services.OracleMessagesLevel;
		

public class GxadirdFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public GxadirdFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public GxadirdTask getTask() {
		return (GxadirdTask)super.getTask();
	}
	
	
	public GxadirdModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Gxadird_GVerifyAccess()
		{
			
				getGFormClass().gVerifyAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Gxadird_GRevokeAccess()
		{
			
				getGFormClass().gRevokeAccess();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.BANNER_XE_SEND_CONTEXT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="BANNER_XE_SEND_CONTEXT")
		public void Gxadird_BannerXeSendContext()
		{
			
				getGFormClass().bannerXeSendContext();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Gxadird_TaskStartedPre(EventObject args)
		{
			
				getGFormClass().taskStartedPre(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Gxadird_PreFormTrg()
		{
			
				getGFormClass().preFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Gxadird_TaskEnded(EventObject args)
		{
			
				getGFormClass().taskEnded(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Gxadird_PostFormTrg()
		{
			
				getGFormClass().postFormTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void Gxadird_blockIn()
		{
			
				getGFormClass().blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Gxadird_PreBlockTrg()
		{
			
				getGFormClass().preBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void Gxadird_blockOut()
		{
			
				getGFormClass().blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Gxadird_PostBlockTrg()
		{
			
				getGFormClass().postBlockTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Gxadird_BeforeCommit(CancelEvent args)
		{
			
				getGFormClass().beforeCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Gxadird_PreCommitTrg()
		{
			
				getGFormClass().preCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Gxadird_OnError(EventObject args)
		{
			
				getGFormClass().onError(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Gxadird_OnRollback()
		{
			
				getGFormClass().onRollback();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Gxadird_OnRollbackTrg()
		{
			
				getGFormClass().onRollbackTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Gxadird_OnSelect()
		{
			
				getGFormClass().onSelect();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Gxadird_AfterCommit(EventObject args)
		{
			
				getGFormClass().afterCommit(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Gxadird_PostFormsCommitTrg()
		{
			
				getGFormClass().postFormsCommitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Gxadird_buttonClick()
		{
			
				getGFormClass().click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void Gxadird_blockChange()
		{
			
				getGFormClass().blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Gxadird_doubleClick()
		{
			
				getGFormClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Gxadird_WhenTimerExpired(NString timerName)
		{
			
				getGFormClass().whenTimerExpired(timerName);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Gxadird_WhenWindowActivated()
		{
			
				getGFormClass().whenWindowActivated();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Gxadird_WhenWindowClosed()
		{
			
				getGFormClass().whenWindowClosed();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Gxadird_Help()
		{
			
				getGFormClass().help();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Gxadird_F0()
		{
			
				getGFormClass().f0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Gxadird_F2()
		{
			
				getGFormClass().f2();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-F6
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F6", function=KeyFunction.KEY_F6)
		public void Gxadird_F6()
		{
			
				getGFormClass().f6();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void Gxadird_MoveDown()
		{
			
				getGFormClass().moveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void Gxadird_MoveUp()
		{
			
				getGFormClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Gxadird_ListValues()
		{
			
				getGFormClass().listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Gxadird_KeyMenu()
		{
			
				getGFormClass().keyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Gxadird_NextBlock()
		{
			
				getGFormClass().nextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Gxadird_NextRecord()
		{
			
				getGFormClass().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Gxadird_PreviousRecord()
		{
			
				getGFormClass().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Gxadird_KeyNxtset()
		{
			
				getGFormClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Gxadird_KeyScrup()
		{
			
				getGFormClass().keyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Gxadird_KeyScrdown()
		{
			
				getGFormClass().keyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Gxadird_KeyPrint()
		{
			
				getGFormClass().keyPrint();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Gxadird_Search()
		{
			
				getGFormClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Gxadird_ExecuteQuery()
		{
			
				getGFormClass().executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Gxadird_Exit()
		{
			
				getGFormClass().exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Gxadird_KeyExitTrg()
		{
			
				getGFormClass().keyExitTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Gxadird_KeyNxtkey()
		{
			
				getGFormClass().keyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Gxadird_KeyNxtkeyTrg()
		{
			
				getGFormClass().keyNxtkeyTrg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Gxadird_ListValuesCopy()
		{
			
				getGFormClass().listValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Gxadird_InvalidOptionMsg()
		{
			
				getGFormClass().invalidOptionMsg();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Gxadird_UpdateActivity()
		{
			
				getGFormClass().updateActivity();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Gxadird_CheckKeys()
		{
			
				getGApplFormClass().checkKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void Gxadird_recordChange()
		{
			
				getGApplFormClass().whenNewRecordInstance();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.KEY-DUPREC
		   MESSAGE( G$_NLS.Get('GXADIRD-0000', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Gxadird_CopyRecord()
		{
			
				errorMessage(GNls.Fget(toStr("GXADIRD-0000"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.CHECK_SECURITY
		 DECLARE
  DESC_RET VARCHAR2(2);
  RET_CODE INTEGER;
  SQL_STMT VARCHAR2(200);
BEGIN
  IF :GLOBAL.HRESYS = 'Y' THEN
    SQL_STMT := 'SELECT ''Y'' FROM PTRUSER' ||
                ' WHERE PTRUSER_CODE= ' || '''' || :CURRENT_USER || '''';
    GOKDBMS.DYNAMIC_SQL(SQL_STMT,DESC_RET);
--
    IF DESC_RET IS NOT NULL THEN
      :HOLD_SECURITY := DESC_RET;
--
      DESC_RET := '';
      IF :GLOBAL.FINSYS = 'Y' THEN
        SQL_STMT := 'SELECT ''B'' FROM FOBPROF ' ||
                    ' WHERE FOBPROF_USER_ID = ' || '''' || :CURRENT_USER || '''';
        GOKDBMS.DYNAMIC_SQL(SQL_STMT,DESC_RET);
--
        IF DESC_RET IS NOT NULL THEN
          :HOLD_SECURITY := DESC_RET;
        ELSE
          DESC_RET := '';
          SQL_STMT := 'SELECT ''B'' FROM TBBUPRF' ||
                      ' WHERE TBBUPRF_USERID = ' || '''' || :CURRENT_USER || '''';
          GOKDBMS.DYNAMIC_SQL(SQL_STMT,DESC_RET);
--
          IF DESC_RET IS NOT NULL THEN
            :HOLD_SECURITY := DESC_RET;
          ELSE
            :HOLD_SECURITY := 'Y';
          END IF;
        END IF;
      END IF;
    ELSE
      :HOLD_SECURITY := 'N';
    END IF;    
  ELSE
   :HOLD_SECURITY := 'N';
  END IF;
END;

 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.CHECK_SECURITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_SECURITY")
		public void Gxadird_CheckSecurity()
		{
			
				{
					NString descRet= NString.getNull();
					NInteger retCode= NInteger.getNull();
					NString sqlStmt= NString.getNull();
					if ( getGlobal("HRESYS").equals("Y") )
					{
						sqlStmt = toStr("SELECT 'Y' FROM PTRUSER").append(" WHERE PTRUSER_CODE= ").append("'").append(getFormModel().getFormHeader().getCurrentUser()).append("'");
						Ref<NString> p_return_value1_ref = new Ref<NString>(descRet);
						Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
						descRet = p_return_value1_ref.val;
						if ( !descRet.isNull() )
						{
							getFormModel().getFormHeader().setHoldSecurity(descRet);
							descRet = toStr("");
							if ( getGlobal("FINSYS").equals("Y") )
							{
								sqlStmt = toStr("SELECT 'B' FROM FOBPROF ").append(" WHERE FOBPROF_USER_ID = ").append("'").append(getFormModel().getFormHeader().getCurrentUser()).append("'");
								p_return_value1_ref = new Ref<NString>(descRet);
								Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
								descRet = p_return_value1_ref.val;
								if ( !descRet.isNull() )
								{
									getFormModel().getFormHeader().setHoldSecurity(descRet);
								}
								else {
									descRet = toStr("");
									sqlStmt = toStr("SELECT 'B' FROM TBBUPRF").append(" WHERE TBBUPRF_USERID = ").append("'").append(getFormModel().getFormHeader().getCurrentUser()).append("'");
									p_return_value1_ref = new Ref<NString>(descRet);
									Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
									descRet = p_return_value1_ref.val;
									if ( !descRet.isNull() )
									{
										getFormModel().getFormHeader().setHoldSecurity(descRet);
									}
									else {
										getFormModel().getFormHeader().setHoldSecurity(toStr("Y"));
									}
								}
							}
						}
						else {
							getFormModel().getFormHeader().setHoldSecurity(toStr("N"));
						}
					}
					else {
						getFormModel().getFormHeader().setHoldSecurity(toStr("N"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.LOAD_FORM_HEADER
		    :CURRENT_FORM := :SYSTEM.CURRENT_FORM ;
--
   :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
   :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ;
--
   :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
--
   :CURRENT_USER := :GLOBAL.USER_ID ;
   EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE'); 
   EXECUTE_TRIGGER( 'CHECK_SECURITY' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Gxadird_LoadFormHeader()
		{
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentUser(getGlobal("USER_ID"));
				executeAction("LOAD_CURRENT_RELEASE");
				executeAction("CHECK_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.UPDATE_USER_ID
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
		 * GXADIRD.UPDATE_USER_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_USER_ID")
		public void Gxadird_UpdateUserId()
		{
			
				getFormModel().getFormHeader().setWorkuser(toStr(getCurrentBlock()));
				getFormModel().getFormHeader().setWorkuser(toStr(rpad(substring(getFormModel().getFormHeader().getWorkuser(), toInt(1), toInt(7)), 15, "_USER_ID")));
				copy(getFormModel().getFormHeader().getCurrentUser(),getFormModel().getFormHeader().getWorkuser());
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.6.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Gxadird_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DECLARE 
  FIELD_NAME VARCHAR2(45);
BEGIN

IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
  FIELD_NAME := :SYSTEM.CURSOR_FIELD;
  IF :CHECK_KEYS = 'Y' THEN
     :CHECK_KEYS := 'N';
     
  --   SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
     
  --   GO_BLOCK ('KEY_BLOCK');
     
     G$_CHECK_FAILURE;
     
     EXECUTE_TRIGGER ('CHECK_KEYS');
    
   G$_CHECK_FAILURE;
    
     IF NOT FORM_SUCCESS THEN
    --     SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
         RAISE FORM_TRIGGER_FAILURE;
     END IF;
     
 --    NEXT_BLOCK;
     
--     G$_CHECK_FAILURE;
-- 5401-1
     :SYSTEM.MESSAGE_LEVEL := '05';
--     CLEAR_RECORD;
--     EXECUTE_QUERY;
--     G$_CHECK_FAILURE;
--    NEXT_BLOCK;
--     G$_CHECK_FAILURE;
-- 5401-1
    EXECUTE_QUERY;
     G$_CHECK_FAILURE;
     :SYSTEM.MESSAGE_LEVEL := '00';
--     SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
     :CHECK_KEYS := 'N';
     EXECUTE_TRIGGER ('DISABLE_KEYS');
     G$_CHECK_FAILURE;
     GO_ITEM (FIELD_NAME);  
     IF :SYSTEM.CURSOR_BLOCK NOT IN ('GXRDIRD') AND :GXRDIRD.ROWID IS NOT NULL THEN
       EXECUTE_QUERY;
     END IF;
  ELSE
     EXECUTE_QUERY;   
  END IF;
END IF;
-- 70-3
IF :SYSTEM.TRIGGER_BLOCK = 'KEY_BLOCK' THEN
   SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT',ENABLED,PROPERTY_OFF);
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Gxadird_WhenNewBlockInstanceTrg()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;

				{
					NString fieldName= NString.getNull();
					if ( getCursorBlock().notEquals("KEY_BLOCK") )
					{
						fieldName = toStr( getCursorField());
						if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
						{
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							getTask().getGoqrpls().gCheckFailure();
							executeAction("CHECK_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							try { 
							MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
							executeQuery();
							if (getItemEnabled("GXRDIRD_BANK_ACCT_NUM").equals("false"))
								setItemEnabled("GXRDIRD_BANK_ACCT_NUM", true);
							getTask().getGoqrpls().gCheckFailure();
							} finally {
							MessageServices.resetMessageLevel();
							}
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							executeAction("DISABLE_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							goItem(fieldName);
							if ( !in(getCursorBlock(), "GXRDIRD").getValue() && !(toBool(gxrdirdElement.getROWID()).isNull()) )
							{
								executeQuery();
							}
						}
						else {
							executeQuery();
						}
					}
					if ( getTriggerBlock().equals("KEY_BLOCK"))
					{
						setItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE_LBT", false);
						setItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT", false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.CLOSE_WINDOWS
		   -- SET_WINDOW_PROPERTY('PERPADV_WINDOW',VISIBLE,PROPERTY_OFF);
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Gxadird_CloseWindows()
		{
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.WHEN_WINDOW_ACTIVATED_TRG
		 G$_SET_WIN_PROPERTY;
G$_SET_INST_PROPERTY ;
<multilinecomment>IF :SYSTEM.EVENT_WINDOW = 'MAIN_WINDOW' THEN 
  IF GET_ITEM_PROPERTY('ID',ENABLED) = 'TRUE' THEN  
     GO_ITEM ('ID');
  ELSE
     GO_ITEM ('GXRDIRD_BANK_ROUT_NUM');
  END IF;
--ELSIF :SYSTEM.EVENT_WINDOW = 'PERPADV_WINDOW' THEN 
--     GO_ITEM ('PERPADV_POSN');
END IF;
</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Gxadird_WhenWindowActivatedTrg()
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.UPDATE_ACTIVITY_DATE
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
		 * GXADIRD.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Gxadird_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				copy(NDate.getNow() ,getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;

	--Banner XE Messaging Integration



DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');

IF :GLOBAL.BANNER_XE_MODE = 'Y' THEN

   :GLOBAL.GXADIRD_XE_CONTEXT := 'KEY_IDNO';

   EXECUTE_TRIGGER('BANNER_XE_SEND_CONTEXT');

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Gxadird_SaveKeys()
		{
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
				if ( getGlobal("BANNER_XE_MODE").equals("Y") )
				{
					setGlobal("GXADIRD_XE_CONTEXT", toStr("KEY_IDNO"));
					executeAction("BANNER_XE_SEND_CONTEXT");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('GXADIRD-0001', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Gxadird_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("GXADIRD-0001"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.INVALID_CODE_MSG
		    MESSAGE(
 G$_NLS.Get('GXADIRD-0002', 'FORM','*ERROR* Invalid code; press LIST for valid codes.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.INVALID_CODE_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_CODE_MSG")
		public void Gxadird_InvalidCodeMsg()
		{
			
				errorMessage(GNls.Fget(toStr("GXADIRD-0002"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.GLOBAL_COPY
		    IF :GLOBAL.KEY_IDNO IS NOT NULL THEN
      :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
      NEXT_ITEM ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Gxadird_GlobalCopy()
		{
			
				if ( !getGlobal("KEY_IDNO").isNull() )
				{
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
-- 5301-3
--   SET_ITEM_PROPERTY('ID',UPDATEABLE,PROPERTY_ON);
--   SET_ITEM_PROPERTY('ID',REQUIRED,PROPERTY_ON);
END IF;
-- 54-1
IF  GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.ID_LBT',ENABLED) = 'FALSE' THEN
	  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.ID_LBT',ENABLED,PROPERTY_ON);
END IF;
<multilinecomment>IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
END IF;
</multilinecomment>
<multilinecomment>IF GET_ITEM_PROPERTY('GXRDIRD_BANK_CODE_LBT',ENABLED) = 'TRUE' THEN
   SET_ITEM_PROPERTY('GXRDIRD_BANK_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;
</multilinecomment>
--SET_ITEM_PROPERTY('ADVANCE_RECOVERY_BTN',ENABLED,PROPERTY_OFF);
--g$_navigation_frame.disable_option('PERPADV_ADVANCE_RECOVERY','P');
-- 70-3 handle LOV buttons added to data blok
IF  GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT',ENABLED) = 'TRUE' THEN
	  SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF  GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE_LBT',ENABLED) = 'TRUE' THEN
	  SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Gxadird_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.ID_LBT").equals("FALSE") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.ID_LBT", true);
				}
				if ( getItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT").equals("TRUE") )
				{
					setItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT", false);
				}
				if ( getItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE_LBT").equals("TRUE") )
				{
					setItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE_LBT", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.DISABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'TRUE' THEN         
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
END IF;
--
IF  GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.ID_LBT',ENABLED) = 'TRUE' THEN
	  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.ID_LBT',ENABLED,PROPERTY_OFF);
END IF;
--
IF  GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT',ENABLED) = 'FALSE'
AND GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM',ENABLED) = 'TRUE'
AND GET_BLOCK_PROPERTY('GXRDIRD',UPDATE_ALLOWED) = 'TRUE' THEN
	  SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT',ENABLED,PROPERTY_ON);
END IF;
--
IF  GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE_LBT',ENABLED) = 'FALSE'
AND GET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE',ENABLED) = 'TRUE'
AND GET_BLOCK_PROPERTY('GXRDIRD',UPDATE_ALLOWED) = 'TRUE' THEN
	  SET_ITEM_PROPERTY('GXRDIRD.GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Gxadird_DisableKeys()
		{
			
				if ( getItemEnabled("ID").equals("TRUE") )
				{
					setItemEnabled("ID", false);
				}
				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.ID_LBT").equals("TRUE") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.ID_LBT", false);
				}
				if ( getItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT").equals("FALSE") && getItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM").equals("TRUE") && getBlockUpdateAllowed("GXRDIRD").equals("TRUE") )
				{
					setItemEnabled("GXRDIRD.GXRDIRD_BANK_ROUT_NUM_LBT", true);
				}
				if ( getItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE_LBT").equals("FALSE") && getItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE").equals("TRUE") && getBlockUpdateAllowed("GXRDIRD").equals("TRUE") )
				{
					setItemEnabled("GXRDIRD.GXRDIRD_ATYP_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'CHECK_SECURITY' ) ;
   G$_CHECK_FAILURE ;

IF :HOLD_SECURITY='N' THEN 
-- 70-2 replace canvases with property commands
--   SHOW_VIEW('HIDE_RECORD1');
--   SHOW_VIEW('HIDE_RECORD2');
   SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',VISIBLE,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',VISIBLE,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_PERCENT',VISIBLE,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
--
   SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_PERCENT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_HR_IND',ENABLED,PROPERTY_OFF);
   
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ADDR_SEQNO') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ATYP_CODE') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AP_IND') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AP_IND',ENABLED,PROPERTY_ON);
   END IF;

   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ACHT_CODE') = 'N' THEN  
     SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ACHT_CODE_LBT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE_LBT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ADDR_SEQNO_IAT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',ENABLED,PROPERTY_ON);
   END IF;
ELSIF :HOLD_SECURITY ='Y' THEN 
-- 70-2 replace canvases with property commands
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PRIORITY') = 'N' THEN
  	 SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',VISIBLE,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AMOUNT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',VISIBLE,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PERCENT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PERCENT',VISIBLE,PROPERTY_ON);
   END IF;
   SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
   --
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PRIORITY') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AMOUNT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PERCENT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PERCENT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_HR_IND') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_HR_IND',ENABLED,PROPERTY_ON);
   END IF;
   SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_AP_IND',ENABLED,PROPERTY_OFF);
   
   SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',ENABLED,PROPERTY_OFF);
-- 70-2 replace canvases with property commands   
--   HIDE_VIEW('HIDE_RECORD1');
--   HIDE_VIEW('HIDE_RECORD2');
ELSE
-- 70-2 replace canvases with property commands
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PRIORITY') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',VISIBLE,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AMOUNT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',VISIBLE,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PERCENT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PERCENT',VISIBLE,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ATYP_CODE_LBT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
   END IF;
--
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PRIORITY') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PRIORITY',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AMOUNT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AMOUNT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_PERCENT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_PERCENT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_HR_IND') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_HR_IND',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ADDR_SEQNO') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ATYP_CODE') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ATYP_CODE',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_AP_IND') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_AP_IND',ENABLED,PROPERTY_ON);
   END IF;
   
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ACHT_CODE') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ACHT_CODE_LBT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ACHT_CODE_LBT',ENABLED,PROPERTY_ON);
   END IF;
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'GXRDIRD', 'GXRDIRD_ADDR_SEQNO_IAT') = 'N' THEN
     SET_ITEM_PROPERTY('GXRDIRD_ADDR_SEQNO_IAT',ENABLED,PROPERTY_ON);
   END IF;
-- 70-2 replace canvases with property commands
--   HIDE_VIEW('HIDE_RECORD1');
--   HIDE_VIEW('HIDE_RECORD2');
END IF;
--
--   SET_ITEM_PROPERTY('ADVANCE_RECOVERY_BTN',ENABLED,PROPERTY_OFF);
 --  g$_navigation_frame.disable_option('PERPADV_ADVANCE_RECOVERY','P');
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
--
 <multilinecomment>  IF GET_APPLICATION_PROPERTY(USER_INTERFACE) = 'CHARMODE' THEN
      SET_WINDOW_PROPERTY('PERPADV_WINDOW',POSITION,1,4);
   ELSE
      SET_WINDOW_PROPERTY('PERPADV_WINDOW',POSITION,0,3);
   END IF;</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Gxadird_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				if ( getFormModel().getFormHeader().getHoldSecurity().equals("N") )
				{
					setItemVisible("GXRDIRD_PRIORITY", false);
					setItemVisible("GXRDIRD_AMOUNT", false);
					setItemVisible("GXRDIRD_PERCENT", false);
					setItemEnabled("GXRDIRD_ATYP_CODE_LBT", true);
					setItemEnabled("GXRDIRD_PRIORITY", false);
					setItemEnabled("GXRDIRD_AMOUNT", false);
					setItemEnabled("GXRDIRD_PERCENT", false);
					setItemEnabled("GXRDIRD_HR_IND", false);
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ADDR_SEQNO")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ADDR_SEQNO", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ATYP_CODE")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ATYP_CODE", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AP_IND")).equals("N") )
					{
						setItemEnabled("GXRDIRD_AP_IND", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ACHT_CODE")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ACHT_CODE", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ACHT_CODE_LBT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ACHT_CODE_LBT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ADDR_SEQNO_IAT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", true);
					}
				}
				else if ( getFormModel().getFormHeader().getHoldSecurity().equals("Y") ) {
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PRIORITY")).equals("N") )
					{
						setItemVisible("GXRDIRD_PRIORITY", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AMOUNT")).equals("N") )
					{
						setItemVisible("GXRDIRD_AMOUNT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PERCENT")).equals("N") )
					{
						setItemVisible("GXRDIRD_PERCENT", true);
					}
					setItemEnabled("GXRDIRD_ATYP_CODE_LBT", false);
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PRIORITY")).equals("N") )
					{
						setItemEnabled("GXRDIRD_PRIORITY", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AMOUNT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_AMOUNT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PERCENT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_PERCENT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_HR_IND")).equals("N") )
					{
						setItemEnabled("GXRDIRD_HR_IND", true);
					}
					setItemEnabled("GXRDIRD_ADDR_SEQNO", false);
					setItemEnabled("GXRDIRD_ATYP_CODE", false);
					setItemEnabled("GXRDIRD_AP_IND", false);
					setItemEnabled("GXRDIRD_ACHT_CODE", false);
					setItemEnabled("GXRDIRD_ACHT_CODE_LBT", false);
					setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", false);
				}
				else {
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PRIORITY")).equals("N") )
					{
						setItemVisible("GXRDIRD_PRIORITY", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AMOUNT")).equals("N") )
					{
						setItemVisible("GXRDIRD_AMOUNT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PERCENT")).equals("N") )
					{
						setItemVisible("GXRDIRD_PERCENT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ATYP_CODE_LBT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ATYP_CODE_LBT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PRIORITY")).equals("N") )
					{
						setItemEnabled("GXRDIRD_PRIORITY", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AMOUNT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_AMOUNT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_PERCENT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_PERCENT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_HR_IND")).equals("N") )
					{
						setItemEnabled("GXRDIRD_HR_IND", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ADDR_SEQNO")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ADDR_SEQNO", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ATYP_CODE")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ATYP_CODE", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_AP_IND")).equals("N") )
					{
						setItemEnabled("GXRDIRD_AP_IND", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ACHT_CODE")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ACHT_CODE", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ACHT_CODE_LBT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ACHT_CODE_LBT", true);
					}
					if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("GXRDIRD"), toStr("GXRDIRD_ADDR_SEQNO_IAT")).equals("N") )
					{
						setItemEnabled("GXRDIRD_ADDR_SEQNO_IAT", true);
					}
				}
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.KEY-PRVBLK
		 --   PREVIOUS_BLOCK ;
--   EXECUTE_QUERY ;
   EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Gxadird_PreviousBlock()
		{
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.KEY_NXTBLK
		  NEXT_BLOCK ;
--   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY_NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTBLK")
		public void Gxadird_KeyNxtblk()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.KEY-CLRFRM
		    EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   
   EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   
   CLEAR_FORM ;
   IF NOT FORM_SUCCESS THEN
     EXECUTE_TRIGGER( 'DISABLE_KEYS' ) ;
     G$_CHECK_FAILURE;
     RETURN;
   END IF;
   
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   
--
   EXECUTE_TRIGGER('CLOSE_WINDOWS');
   EXECUTE_TRIGGER( 'CHECK_SECURITY' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Gxadird_ClearTask()
		{
			try{
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
			}catch(Exception e){
				executeAction("DISABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				throw new ApplicationException();
			}
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CLOSE_WINDOWS");
				executeAction("CHECK_SECURITY");
				getTask().getGoqrpls().gCheckFailure();
				goBlock("KEY_BLOCK");
				executeAction("POST-CHANGE","KEY_BLOCK","ID");
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Gxadird_BeforeRowUpdate(RowAdapterEvent args)
		{
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'UPDATE_USER_ID' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Gxadird_BeforeRowInsert(RowAdapterEvent args)
		{
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GXADIRD.CHECK_IAT_REQ_PROPERTIES
		 IF :GXRDIRD_ACH_IAT_IND = 'Y' THEN
	IF :GXRDIRD_SCOD_CODE_ISO IS NULL THEN
		message(G$_NLS.Get('GXADIRD-0003','FORM','*ERROR* ISO Country code is required when IAT is checked.'));
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
	IF (:GXRDIRD_ADDR_SEQNO_IAT IS NOT NULL AND :GXRDIRD_ATYP_CODE_IAT IS NULL) THEN
			message(G$_NLS.Get('GXADIRD-0004','FORM','*ERROR* IAT Address Type is required for an Accounts Payable record when IAT Address Sequence is entered.'));
			RAISE FORM_TRIGGER_FAILURE;
	END IF;
	IF(:GXRDIRD_AP_IND = 'A') THEN
		IF (:GXRDIRD_ACHT_CODE IS NULL) THEN
			message(G$_NLS.Get('GXADIRD-0005','FORM','*ERROR* An active ACH Transaction Type code is required for an Accounts Payable record when IAT is check box is checked.'));
			RAISE FORM_TRIGGER_FAILURE;
		END IF;
		IF (:GXRDIRD_ADDR_SEQNO_IAT IS NULL AND :GXRDIRD_ATYP_CODE_IAT IS NOT NULL) THEN
			message(G$_NLS.Get('GXADIRD-0006','FORM','*ERROR* IAT Address Sequence is required for an Accounts Payable record when IAT Address Type is entered.'));
			RAISE FORM_TRIGGER_FAILURE;
		END IF;
	END IF;
	
	IF(:GXRDIRD_HR_IND = 'A' AND :GXRDIRD_AP_IND = 'I') THEN	
		IF (:GXRDIRD_ACHT_CODE IS NOT NULL) THEN
			message(G$_NLS.Get('GXADIRD-0007','FORM','*WARNING*  You have entered an ACH Transaction Type which is used for invoice payments only, not with bank accounts designated only for payroll processing.'));
		END IF;
		IF (:GXRDIRD_ADDR_SEQNO_IAT IS NOT NULL) THEN
			message(G$_NLS.Get('GXADIRD-0008','FORM','*WARNING*  You have entered an IAT Address Sequence which is used for invoice payments only, not with bank accounts designated only for payroll processing.'));
		END IF;
	END IF;
	IF(:GXRDIRD_HR_IND = 'A' AND :GXRDIRD_AP_IND = 'A') THEN	
		IF (:GXRDIRD_ADDR_SEQNO_IAT IS NOT NULL AND :GXRDIRD_ATYP_CODE_IAT IS NOT NULL) THEN
			message(G$_NLS.Get('GXADIRD-0009','FORM','*WARNING*  You have entered an Accounts Payable IAT Address Sequence for a bank account designated as both Accounts Payable and Payroll.  The payroll process may select a different address than Accounts Payable.'));
		END IF;
	END IF;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXADIRD.CHECK_IAT_REQ_PROPERTIES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_IAT_REQ_PROPERTIES")
		public void Gxadird_CheckIatReqProperties()
		{
				GxrdirdAdapter gxrdirdElement = (GxrdirdAdapter)this.getFormModel().getGxrdird().getRowAdapter(true);
				if(gxrdirdElement ==null)
					return;
				if ( gxrdirdElement.getGxrdirdAchIatInd().equals("Y") )
				{
					if ( gxrdirdElement.getGxrdirdScodCodeIso().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0003"), toStr("FORM"), toStr("*ERROR* ISO Country code is required when IAT is checked.")));
						throw new ApplicationException();
					}
					if ((!gxrdirdElement.getGxrdirdAddrSeqnoIat().isNull() && gxrdirdElement.getGxrdirdAtypCodeIat().isNull()))
					{
						errorMessage(GNls.Fget(toStr("GXADIRD-0004"), toStr("FORM"), toStr("*ERROR* IAT Address Type is required for an Accounts Payable record when IAT Address Sequence is entered.")));
						throw new ApplicationException();
					}
					if ((gxrdirdElement.getGxrdirdApInd().equals("A")))
					{
						if ((gxrdirdElement.getGxrdirdAchtCode().isNull()))
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0005"), toStr("FORM"), toStr("*ERROR* An active ACH Transaction Type code is required for an Accounts Payable record when IAT is check box is checked.")));
							throw new ApplicationException();
						}
						if ((gxrdirdElement.getGxrdirdAddrSeqnoIat().isNull() && !gxrdirdElement.getGxrdirdAtypCodeIat().isNull()))
						{
							errorMessage(GNls.Fget(toStr("GXADIRD-0006"), toStr("FORM"), toStr("*ERROR* IAT Address Sequence is required for an Accounts Payable record when IAT Address Type is entered.")));
							throw new ApplicationException();
						}
					}
					if ((gxrdirdElement.getGxrdirdHrInd().equals("A") && gxrdirdElement.getGxrdirdApInd().equals("I")))
					{
						if ((!gxrdirdElement.getGxrdirdAchtCode().isNull()))
						{
							warningMessage(GNls.Fget(toStr("GXADIRD-0007"), toStr("FORM"), toStr("*WARNING*  You have entered an ACH Transaction Type which is used for invoice payments only, not with bank accounts designated only for payroll processing.")));
						}
						if ((!gxrdirdElement.getGxrdirdAddrSeqnoIat().isNull()))
						{
							warningMessage(GNls.Fget(toStr("GXADIRD-0008"), toStr("FORM"), toStr("*WARNING*  You have entered an IAT Address Sequence which is used for invoice payments only, not with bank accounts designated only for payroll processing.")));
						}
					}
					if ((gxrdirdElement.getGxrdirdHrInd().equals("A") && gxrdirdElement.getGxrdirdApInd().equals("A")))
					{
						if ((!gxrdirdElement.getGxrdirdAddrSeqnoIat().isNull() && !gxrdirdElement.getGxrdirdAtypCodeIat().isNull()))
						{
							warningMessage(GNls.Fget(toStr("GXADIRD-0009"), toStr("FORM"), toStr("*WARNING*  You have entered an Accounts Payable IAT Address Sequence for a bank account designated as both Accounts Payable and Payroll.  The payroll process may select a different address than Accounts Payable.")));
						}
					}
				}
			}

		
	
}
	
