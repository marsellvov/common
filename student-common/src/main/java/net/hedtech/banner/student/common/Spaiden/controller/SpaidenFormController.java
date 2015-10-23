package net.hedtech.banner.student.common.Spaiden.controller;

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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;
import net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController;
import net.hedtech.general.common.libraries.Goqclib.model.SpraddrAdapter;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqclib.model.SprteleAdapter;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		

public class SpaidenFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	private GoqclibFormController getGoqclibFormController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.GoqclibFormController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("GOQCLIB");
	}	
	
	
	public SpaidenFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SpaidenTask getTask() {
		return (SpaidenTask)super.getTask();
	}
	
	
	public SpaidenModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Spaiden_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Spaiden_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Spaiden_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.PRE_FORM_TRG
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
		 * SPAIDEN.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Spaiden_PreFormTrg()
		{
			
				//  --
				getTask().getGoqrpls().getGTabSecurity().gTabsecBuild(GSecurity.FgGetTabSecurityFnc(getCurrentTaskName(), getGlobal("CURRENT_USER")));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Spaiden_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Spaiden_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Spaiden_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Spaiden_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Spaiden_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Spaiden_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Spaiden_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Spaiden_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Spaiden_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Spaiden_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Spaiden_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Spaiden_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Spaiden_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Spaiden_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Spaiden_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Spaiden_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Spaiden_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Spaiden_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Spaiden_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Spaiden_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Spaiden_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Spaiden_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Spaiden_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Spaiden_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Spaiden_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Spaiden_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Spaiden_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Spaiden_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Spaiden_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Spaiden_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Spaiden_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Spaiden_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Spaiden_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Spaiden_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Spaiden_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Spaiden_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Spaiden_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Spaiden_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Spaiden_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Spaiden_CheckKeys()
		{
			
			getGApplFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Spaiden_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CHECK_TO_SAVE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TO_SAVE")
		public void Goqclib_CheckToSave()
		{
			
				getGoqclibFormController().CheckToSave();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY_NXTBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTBLOCK_TRG")
		public void Goqclib_KeyNxtblockTrg()
		{
			
				getGoqclibFormController().KeyNxtblockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY_PRVBLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_PRVBLOCK_TRG")
		public void Goqclib_KeyPrvblockTrg()
		{
			
				getGoqclibFormController().KeyPrvblockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.GO_ADDR_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_ADDR_FORM")
		public void Goqclib_GoAddrForm()
		{
			
				getGoqclibFormController().GoAddrForm();
		}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5.3.1';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Spaiden_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.WHEN-NEW-FORM-INSTANCE
		 G$_SET_WIN_PROPERTY;
EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' );
G$_CHECK_FAILURE;
EXECUTE_TRIGGER( 'GLOBAL_COPY' );
G$_CHECK_FAILURE;
:GLOBAL.PRODUCT_IND := 'S';
DEFAULT_VALUE('','GLOBAL.NAVIGATE_TO_TAB');
G$_SET_INST_PROPERTY;
--
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRIDEN_PREVIOUS','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRTELE','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRADDR','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPBPERS','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('GOREMAL','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('GORADID','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPREMRG','P');
--
set_item_property('pers_mrtl_code', visible, property_off);
set_item_property('pers_mrtl_code_lbt', visible, property_off);
set_item_property('mrtl_desc', visible, property_off);
--
SHOW_VIEW('G$_IDEN_TAB_CANVAS');
EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
--
IF :GLOBAL.FORM_WAS_CALLED ='Y' THEN
	 EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
   :PIDM:=:GLOBAL.PIDM;
   :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;

   IF :KEY_BLOCK.ID IS NOT NULL  THEN
      NEXT_FIELD ;
   END IF ;
   IF NVL(:GLOBAL.NAVIGATE_TO_TAB,'X') = 'TELEPHONE' THEN
   	 :check_keys := 'Y';
	   GO_BLOCK('SPRTELE');
	   EXECUTE_A_QUERY;
	   GO_ITEM('SPRTELE.SPRTELE_TELE_CODE');
   ELSE
	   GO_BLOCK('SPRIDEN_CURRENT');
   END IF;

--EXECUTE_A_QUERY;

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Spaiden_TaskStarted(EventObject args)
		{
			
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PRODUCT_IND", toStr("S"));
				setDefaultValue("", "GLOBAL.NAVIGATE_TO_TAB");
				getTask().getGoqrpls().gSetInstProperty();
				// 
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRIDEN_PREVIOUS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRTELE"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRADDR"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPBPERS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GOREMAL"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GORADID"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPREMRG"), toStr("P"));
				// 
				setItemVisible("pers_mrtl_code", false);
				setItemVisible("pers_mrtl_code_lbt", false);
				setItemVisible("mrtl_desc", false);
				// 
				showView("G$_IDEN_TAB_CANVAS");
				executeAction("DISABLE_TAB_PAGES");
				// 
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
						this.getTask().getServices().executeAQuery();
						goItem(toStr("SPRTELE.SPRTELE_TELE_CODE"));
					}
					else {
						goBlock(toStr("SPRIDEN_CURRENT"));
					}
				}		
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
  IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
    EXECUTE_TRIGGER ('DISABLE_ROOTWIN_BUTTONS');
    G$_NAVIGATION_FRAME.ENABLE_OPTION('GUASYST','P');
    G$_CHECK_FAILURE;
  END IF;
--
  IF :CHECK_KEYS = 'Y' THEN
    :CHECK_KEYS := 'N';
    -- GO_BLOCK('KEY_BLOCK');
    go_item('KEY_BLOCK.ID');
    G$_CHECK_VALUE ((:KEY_BLOCK.ID IS NULL),
       G$_NLS.Get('SPAIDEN-0000', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.')  
         , TRUE, TRUE);
--
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_OFF);
     	NEXT_BLOCK;
    	EXECUTE_TRIGGER ('ENABLE_ROOTWIN_BUTTONS');
    	G$_CHECK_FAILURE;
    	:system.message_level := '5';
    	EXECUTE_A_QUERY;
    	:system.message_level := '0';
    	SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
--
    IF :ENTITY_IND IS NULL THEN
      <multilinecomment> Allow access to Legal Name button </multilinecomment>
   	  IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_LEGAL_NAME') = 'N' THEN      
        IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED) = 'FALSE' THEN
          SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED, PROPERTY_TRUE);
          SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', NAVIGABLE, PROPERTY_TRUE);
          SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', UPDATEABLE, PROPERTY_TRUE);
        END IF;
      END IF;
      <multilinecomment> Allow entering into Person fields </multilinecomment>
      IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN   
        EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
        G$_CHECK_FAILURE; 
      END IF;
     <multilinecomment> Allow entering into Non-Person field </multilinecomment>
      IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN   
        EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
        G$_CHECK_FAILURE; 
      END IF;
   	  IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_SURNAME_PREFIX') = 'N' THEN      
        GO_ITEM( 'PERS_SURNAME_PREFIX' );
      ELSE
        GO_ITEM( 'PERS_LAST_NAME' );
      END IF;
    ELSE
      GO_ITEM( 'SPRIDEN_CURRENT.SPRIDEN_ID' );
      IF :ENTITY_IND = 'P' THEN
      <multilinecomment> Allow access to Legal Name button </multilinecomment>
      	IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_LEGAL_NAME') = 'N' THEN
          IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED) = 'FALSE' THEN
            SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED, PROPERTY_TRUE);
            SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', NAVIGABLE, PROPERTY_TRUE);
            SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', UPDATEABLE, PROPERTY_TRUE);
          END IF;
        END IF;
      <multilinecomment> Do not allow entering into Non-Person field </multilinecomment>
        IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'TRUE' THEN
          SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_OFF);
        END IF;
      <multilinecomment> Allow entering into Person fields </multilinecomment>
        IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN
          EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
          G$_CHECK_FAILURE; 
        END IF;
      END IF; 
      IF :ENTITY_IND = 'C' THEN
      <multilinecomment> Do not allow entering into Person fields </multilinecomment>
         SET_ITEM_PROPERTY ('spriden_current.PERS_SURNAME_PREFIX', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_LAST_NAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_FIRST_NAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_MI', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_PREFIX', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_SUFFIX', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_PREF_FNAME', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY ('spriden_current.PERS_LEGAL_NAME', ENABLED, PROPERTY_OFF);  
      <multilinecomment> Allow entering into Non-Person field </multilinecomment>
         IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN   
            EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
            G$_CHECK_FAILURE; 
         END IF;
      END IF;  
   END IF;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER ('DISABLE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
   G$_CHECK_FAILURE;
   --
   IF :GLOBAL.NAVIGATE_TO_TAB = 'TELEPHONE' THEN
   	 :check_keys := 'N';
   	 GO_ITEM('SPRTELE.SPRTELE_TELE_CODE');
   	 RETURN;
   END IF;
  --  
  END IF;
 
  IF :SYSTEM.TRIGGER_BLOCK = 'SPRIDEN_CURRENT' THEN
    :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID';
  END IF;
END;


  
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Spaiden_WhenNewBlockInstanceTrg()
		{
			
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					executeAction("DISABLE_ROOTWIN_BUTTONS");
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUASYST"), toStr("P"));
					getTask().getGoqrpls().gCheckFailure();
					goItem("ID");				
						

				}
				// 
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					//  GO_BLOCK('KEY_BLOCK');
					goItem(toStr("KEY_BLOCK.ID"));
					getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getId().isNull())), GNls.Fget(toStr("SPAIDEN-0000"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
					// 
					setFormValidationEnabled(getCurrentTaskName(), false);
					nextBlock();
					executeAction("ENABLE_ROOTWIN_BUTTONS");
					getTask().getGoqrpls().gCheckFailure();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					this.getTask().getServices().executeAQuery();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					setFormValidationEnabled(getCurrentTaskName(), true);
					// 
					if ( getFormModel().getKeyBlock().getEntityInd().isNull() )
					{
						//  Allow access to Legal Name button 
						if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_LEGAL_NAME")).equals("N") )
						{
							if ( getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals("FALSE") )
							{
								setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
								setItemNavigable("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
								setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
							}
						}
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
							getTask().getGoqrpls().gCheckFailure();
						}
						if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_SURNAME_PREFIX")).equals("N") )
						{
							goItem(toStr("PERS_SURNAME_PREFIX"));
						}
						else {
							goItem(toStr("PERS_LAST_NAME"));
						}
					}
					else {
						goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
						if ( getFormModel().getKeyBlock().getEntityInd().equals("P") )
						{
							//  Allow access to Legal Name button 
							if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_LEGAL_NAME")).equals("N") )
							{
								if ( getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals("FALSE") )
								{
									setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
									setItemNavigable("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
									setItemUpdateAllowed("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
								}
							}
							//  Do not allow entering into Non-Person field 
							if ( getItemEnabled("NON_PERS_NAME").equals("TRUE") )
							{
								setItemEnabled("NON_PERS_NAME", false);
							}
							//  Allow entering into Person fields 
							if ( getItemEnabled("PERS_LAST_NAME").equals("FALSE") )
							{
								executeAction("ENABLE_PERS_ITEMS");
								getTask().getGoqrpls().gCheckFailure();
							}
						}
						if ( getFormModel().getKeyBlock().getEntityInd().equals("C") )
						{
							//  Do not allow entering into Person fields 
							setItemEnabled("spriden_current.PERS_SURNAME_PREFIX", false);
							setItemEnabled("spriden_current.PERS_LAST_NAME", false);
							setItemEnabled("spriden_current.PERS_FIRST_NAME", false);
							setItemEnabled("spriden_current.PERS_MI", false);
							setItemEnabled("spriden_current.PERS_PREFIX", false);
							setItemEnabled("spriden_current.PERS_SUFFIX", false);
							setItemEnabled("spriden_current.PERS_PREF_FNAME", false);
							setItemEnabled("spriden_current.PERS_LEGAL_NAME", false);
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
					getTask().getGoqrpls().gCheckFailure();
					executeAction("ENABLE_TAB_PAGES");
					getTask().getGoqrpls().gCheckFailure();
					// 
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
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.WHEN-TAB-PAGE-CHANGED
		 DECLARE
  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN
	IF :key_block.PIDM is null then
		set_canvas_property('G$_IDEN_TAB_CANVAS', topmost_tab_page,'CURRENT_ID_TAB');
  END IF;    
  IF tab_topmost = 'CURRENT_ID_TAB' THEN
  	execute_trigger('SHOW_CURRENT_ID');
  ELSIF tab_topmost = 'ALTERNATE_ID_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_PREV_ID');
  ELSIF tab_topmost = 'ADDRESS_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_ADDRESS');
  ELSIF tab_topmost = 'TELEPHONE_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_TELEPHONE');
  ELSIF tab_topmost = 'BIO_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_BIO');
  ELSIF tab_topmost = 'EMAIL_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_EMAIL');
  ELSIF tab_topmost = 'EMERGENCY_CONTACT_TAB' THEN
  	EXECUTE_TRIGGER('SHOW_EMERGENCY_CONTACT');
  ELSIF tab_topmost = 'ADDITIONAL_ID_TAB' THEN
    EXECUTE_TRIGGER('SHOW_ADDITIONAL_ID');
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-TAB-PAGE-CHANGED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TAB-PAGE-CHANGED")
		public void Spaiden_tabChange()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					if ( getFormModel().getKeyBlock().getPidm().isNull() )
					{
						setCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS", "CURRENT_ID_TAB");
					}
					if ( tabTopmost.equals("CURRENT_ID_TAB") )
					{
						executeAction("SHOW_CURRENT_ID");
					}
					else if ( tabTopmost.equals("ALTERNATE_ID_TAB") ) {
						executeAction("SHOW_PREV_ID");
					}
					else if ( tabTopmost.equals("ADDRESS_TAB") ) {
						executeAction("SHOW_ADDRESS");
					}
					else if ( tabTopmost.equals("TELEPHONE_TAB") ) {
						executeAction("SHOW_TELEPHONE");
					}
					else if ( tabTopmost.equals("BIO_TAB") ) {
						executeAction("SHOW_BIO");
					}
					else if ( tabTopmost.equals("EMAIL_TAB") ) {
						executeAction("SHOW_EMAIL");
					}
					else if ( tabTopmost.equals("EMERGENCY_CONTACT_TAB") ) {
						executeAction("SHOW_EMERGENCY_CONTACT");
					}
					else if ( tabTopmost.equals("ADDITIONAL_ID_TAB") ) {
						executeAction("SHOW_ADDITIONAL_ID");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 <multilinecomment> The following is from RPAIDEN's WHEN_WINDOW_ACTIVATED_TRG. </multilinecomment>

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
		 * SPAIDEN.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Spaiden_WhenWindowActivatedTrg()
		{
			
				//  The following is from RPAIDEN's WHEN_WINDOW_ACTIVATED_TRG. 
				//  The following is from RPAIDEN's WHEN_WINDOW_ACTIVATED_TRG. 
				if ( getCurrentWindow().isNull() || in(getCurrentWindow(), "MAIN_WINDOW").getValue() )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.WHEN-WINDOW-CLOSED
		 BEGIN
  G$_WIN_CLOSED;
  G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Spaiden_WhenWindowClosed()
		{
			
				getTask().getGoqrpls().gWinClosed();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.LOAD_FORM_HEADER
		 :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
:CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
:CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT);
:CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS');
:CURRENT_USER := USER;
:MATERIAL_FLAG := '';
EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Spaiden_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				getFormModel().getFormHeader().setCurrentDate(toChar(NDate.getNow(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(NDate.getNow(), "HH24:MI:SS"));
				getFormModel().getFormHeader().setCurrentUser(getUser());
				getFormModel().getFormHeader().setMaterialFlag(toStr(""));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.KEY-DUP-ITEM
		 :ID := 'GENERATED';
:global.key_idno := 'GENERATED';
--
EXECUTE_TRIGGER('VALIDATE_ID');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void Spaiden_KeyDupItem()
		{
			
				getFormModel().getKeyBlock().setId(toStr("GENERATED"));
				setGlobal("KEY_IDNO", toStr("GENERATED"));
				// 
				executeAction("VALIDATE_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_SOURCE_1
		 EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_SOURCE_1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_SOURCE_1")
		public void Spaiden_ShowSource1()
		{
			
				executeAction("CHECK_BOTH");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("NAME_AND_ID_CHECK");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_WHICH_FORM
		 IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
   NEXT_FIELD;
   IF :KEY_BLOCK.PIDM IS NULL OR :KEY_BLOCK.ID IS NULL 
      OR :KEY_BLOCK.ID = 'GENERATED' THEN
      MESSAGE ( G$_NLS.Get('SPAIDEN-0001', 'FORM','*ERROR* An existing id number must be entered for this function.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;
EXECUTE_TRIGGER ('SAVE_KEYS');
G$_CHECK_FAILURE;
:GLOBAL.SECRFRM := NAME_IN('GLOBAL.GUROPTM_NAME1');
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL (:CURRENT_USER, :GLOBAL.SECRFRM,'');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_WHICH_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_WHICH_FORM")
		public void Spaiden_CallWhichForm()
		{
			
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					nextItem();
					if ( getFormModel().getKeyBlock().getPidm().isNull() || getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getId().equals("GENERATED") )
					{
						errorMessage(GNls.Fget(toStr("SPAIDEN-0001"), toStr("FORM"), toStr("*ERROR* An existing id number must be entered for this function.")));
						throw new ApplicationException();
					}
				}
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SECRFRM", getNameIn("GLOBAL.GUROPTM_NAME1"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getFormModel().getFormHeader().getCurrentUser(), getGlobal("SECRFRM"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_ADDRESS
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
	if :system.cursor_block = 'KEY_BLOCK' then
		if :key_block.ID is null or :key_block.PIDM is null then
			message(G$_NLS.Get('SPAIDEN-0002', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.') );
			raise form_trigger_failure;
		else
			next_block;
		end if;
  else
  	GO_BLOCK('SPRADDR');  
  	:SYSTEM.MESSAGE_LEVEL := '5';
  	EXECUTE_A_QUERY;
  	:SYSTEM.MESSAGE_LEVEL := '0';
  end if;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_ADDRESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_ADDRESS")
		public void Spaiden_ShowAddress()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
//				executeAction("CHECK_TO_SAVE");
				try {	executeAction("CHECK_TO_SAVE");
					if ( getCursorBlock().equals("KEY_BLOCK") )
					{
						if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
						{
							errorMessage(GNls.Fget(toStr("SPAIDEN-0002"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
							throw new ApplicationException();
						}
						else {
									nextBlock();
							}
					}
					else {
					goBlock(toStr("SPRADDR"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					this.getTask().getServices().executeAQuery();
					} 
				}
					catch (Exception e) {
					// TODO: handle exception
					goItem(toStr(getCursorItem()));
					throw new ApplicationException();
				}
//				
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					if ( getCursorBlock().equals("KEY_BLOCK") )
//					{
//						if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
//						{
//							errorMessage(GNls.Fget(toStr("SPAIDEN-0002"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
//							throw new ApplicationException();
//						}
//						else {
//							nextBlock();
//						}
//					}
//					else {
//						goBlock(toStr("SPRADDR"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						this.getTask().getServices().executeAQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_BIO
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPBPERS');  
  EXECUTE_A_QUERY;
-- 1-USLLT 
  IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
     execute_trigger('enable_gorprac');
	   go_block('GORPRAC');
		 EXECUTE_A_QUERY;
		 GO_BLOCK('SPBPERS');
     ELSE
     	  execute_trigger('disable_gorprac');
	END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_BIO
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_BIO")
		public void Spaiden_ShowBio()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			try {
				executeAction("CHECK_TO_SAVE");
					goBlock(toStr("SPBPERS"));
					this.getTask().getServices().executeAQuery();
					//  1-USLLT 
					if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
					{
						executeAction("enable_gorprac");
						goBlock(toStr("GORPRAC"));
						this.getTask().getServices().executeAQuery();
						goBlock(toStr("SPBPERS"));
					}
					else {
					executeAction("disable_gorprac");
					}
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
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
//					this.getTask().getServices().executeAQuery();
//					//  1-USLLT 
//					if ( getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE") )
//					{
//						executeAction("enable_gorprac");
//						goBlock(toStr("GORPRAC"));
//						this.getTask().getServices().executeAQuery();
//						goBlock(toStr("SPBPERS"));
//					}
//					else {
//						executeAction("disable_gorprac");
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_EMAIL
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
	if :system.cursor_block = 'KEY_BLOCK' then
		if :key_block.ID is null or :key_block.PIDM is null then
			message(G$_NLS.Get('SPAIDEN-0003', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.') );
			raise form_trigger_failure;
		else
			next_block;
		end if;
  else
  	GO_BLOCK('GOREMAL');  
  	:SYSTEM.MESSAGE_LEVEL := '5';
  	EXECUTE_A_QUERY;
  	:SYSTEM.MESSAGE_LEVEL := '0';
  end if;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_EMAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_EMAIL")
		public void Spaiden_ShowEmail()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			try {
				executeAction("CHECK_TO_SAVE");
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SPAIDEN-0003"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
						throw new ApplicationException();
					}
					else {
						nextBlock();
					}
				}
				else {
					goBlock(toStr("GOREMAL"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					this.getTask().getServices().executeAQuery();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					if ( getCursorBlock().equals("KEY_BLOCK") )
//					{
//						if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
//						{
//							errorMessage(GNls.Fget(toStr("SPAIDEN-0003"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
//							throw new ApplicationException();
//						}
//						else {
//							nextBlock();
//						}
//					}
//					else {
//						goBlock(toStr("GOREMAL"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						this.getTask().getServices().executeAQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_EMERGENCY_CONTACT
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPREMRG');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_A_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_EMERGENCY_CONTACT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_EMERGENCY_CONTACT")
		public void Spaiden_ShowEmergencyContact()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			
			try {
				executeAction("CHECK_TO_SAVE");
				
				goBlock(toStr("SPREMRG"));
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				this.getTask().getServices().executeAQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			} catch (Exception e) {
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();			
			}
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("SPREMRG"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					this.getTask().getServices().executeAQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_LEGAL_NAME
		 DECLARE
  LEGAL_NAME_IND    VARCHAR2(1);
  CURSOR LEGAL_NAME_CURSOR IS
    SELECT 'X'
      FROM SPBPERS
     WHERE SPBPERS_PIDM = :KEY_BLOCK.PIDM;
BEGIN
  IF GET_ITEM_PROPERTY ('LEGAL_NAME_BTN', ENABLED) = 'FALSE' THEN
    G$_INVALID_FUNCTION_MSG;
  ELSE
    EXECUTE_TRIGGER ('CHECK_BOTH');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
    G$_CHECK_FAILURE;
--
    OPEN LEGAL_NAME_CURSOR;
    FETCH LEGAL_NAME_CURSOR INTO LEGAL_NAME_IND;
    IF LEGAL_NAME_CURSOR%NOTFOUND THEN
   	  CLOSE LEGAL_NAME_CURSOR;
      :found_spbpers := 'N';
    END IF;
    CLOSE LEGAL_NAME_CURSOR;
--
    IF :KEY_BLOCK.ENTITY_IND = 'P' THEN
      GO_ITEM('pers_legal_name');
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_LEGAL_NAME
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_LEGAL_NAME")
		public void Spaiden_ShowLegalName()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){

				int rowCount = 0;
				{
					NString legalNameInd= NString.getNull();
					String sqllegalNameCursor = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :KEY_BLOCK_PIDM ";
					DataCursor legalNameCursor = new DataCursor(sqllegalNameCursor);
					try {
						if ( getItemEnabled("LEGAL_NAME_BTN").equals("FALSE") )
						{
							getTask().getGoqrpls().gInvalidFunctionMsg();
						}
						else {
							executeAction("CHECK_BOTH");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("NAME_AND_ID_CHECK");
							getTask().getGoqrpls().gCheckFailure();
							// 
							//Setting query parameters
							legalNameCursor.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
							legalNameCursor.open();
							ResultSet legalNameCursorResults = legalNameCursor.fetchInto();
							if ( legalNameCursorResults != null ) {
								legalNameInd = legalNameCursorResults.getStr(0);
							}
							if ( legalNameCursor.notFound() )
							{

								spridenCurrentElement.setFoundSpbpers(toStr("N"));
							}

							// 
							if ( getFormModel().getKeyBlock().getEntityInd().equals("P") )
							{
								goItem(toStr("pers_legal_name"));
							}
						}
					}
					finally{
						legalNameCursor.close();
					}
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_PREV_ID
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
	if :system.cursor_block = 'KEY_BLOCK' then
		if :key_block.ID is null or :key_block.PIDM is null then
			raise form_trigger_failure;
		else
			next_block;
		end if;
  else
  	GO_BLOCK('SPRIDEN_PREVIOUS');  
  	:SYSTEM.MESSAGE_LEVEL := '5';
  	EXECUTE_A_QUERY;
  	:SYSTEM.MESSAGE_LEVEL := '0';
  end if;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_PREV_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_PREV_ID")
		public void Spaiden_ShowPrevId()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			
			try {
				executeAction("CHECK_TO_SAVE");
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
					{
						throw new ApplicationException();
					}
					else {
						nextBlock();
					}
				}
				else {
					goBlock(toStr("SPRIDEN_PREVIOUS"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					this.getTask().getServices().executeAQuery();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					if ( getCursorBlock().equals("KEY_BLOCK") )
//					{
//						if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
//						{
//							throw new ApplicationException();
//						}
//						else {
//							nextBlock();
//						}
//					}
//					else {
//						goBlock(toStr("SPRIDEN_PREVIOUS"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						this.getTask().getServices().executeAQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_CURRENT_ID
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
	EXECUTE_TRIGGER('CHECK_TO_SAVE');
	IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
	ELSE
		GO_BLOCK('SPRIDEN_CURRENT'); 
  	:SYSTEM.MESSAGE_LEVEL := '5';
  	EXECUTE_A_QUERY;
  	:SYSTEM.MESSAGE_LEVEL := '0';
	END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_CURRENT_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_CURRENT_ID")
		public void Spaiden_ShowCurrentId()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			try {
				executeAction("CHECK_TO_SAVE");
				goBlock(toStr("SPRIDEN_CURRENT"));
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				this.getTask().getServices().executeAQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					goBlock(toStr("SPRIDEN_CURRENT"));
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//					this.getTask().getServices().executeAQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_TELEPHONE
		 <multilinecomment>*
EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
*</multilinecomment>
EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
  GO_BLOCK('SPRTELE');  
  :SYSTEM.MESSAGE_LEVEL := '5';
  EXECUTE_A_QUERY;
  :SYSTEM.MESSAGE_LEVEL := '0';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_TELEPHONE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_TELEPHONE")
		public void Spaiden_ShowTelephone()
		{
			
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
				// *
				// EXECUTE_TRIGGER ('CHECK_BOTH');
				// G$_CHECK_FAILURE;
				// EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
				// G$_CHECK_FAILURE;
				// *
			try {
				executeAction("CHECK_TO_SAVE");
				goBlock(toStr("SPRTELE"));
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				this.getTask().getServices().executeAQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
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
//					this.getTask().getServices().executeAQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SHOW_ADDITIONAL_ID
		 EXECUTE_TRIGGER('CHECK_TO_SAVE');
IF NOT FORM_SUCCESS THEN
		GO_ITEM(:SYSTEM.CURSOR_ITEM);
    RAISE FORM_TRIGGER_FAILURE;
ELSE
	if :system.cursor_block = 'KEY_BLOCK' then
		if :key_block.ID is null or :key_block.PIDM is null then
			message(G$_NLS.Get('SPAIDEN-0004', 'FORM','*ERROR* An ID number or ''GENERATED'' must be entered for this function.') );
			raise form_trigger_failure;
		else
			next_block;
		end if;
  else
  	GO_BLOCK('GORADID');  
  	:SYSTEM.MESSAGE_LEVEL := '5';
  	EXECUTE_A_QUERY;
  	:SYSTEM.MESSAGE_LEVEL := '0';
  end if;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SHOW_ADDITIONAL_ID
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SHOW_ADDITIONAL_ID")
		public void Spaiden_ShowAdditionalId()
		{
			try {
				executeAction("CHECK_TO_SAVE");
				if ( getCursorBlock().equals("KEY_BLOCK") )
				{
					if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SPAIDEN-0004"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
						throw new ApplicationException();
					}
					else {
						nextBlock();
					}
				}
				else {
					goBlock(toStr("GORADID"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					this.getTask().getServices().executeAQuery();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			}
			
			
//				executeAction("CHECK_TO_SAVE");
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goItem(toStr(getCursorItem()));
//					throw new ApplicationException();
//				}
//				else {
//					if ( getCursorBlock().equals("KEY_BLOCK") )
//					{
//						if ( getFormModel().getKeyBlock().getId().isNull() || getFormModel().getKeyBlock().getPidm().isNull() )
//						{
//							errorMessage(GNls.Fget(toStr("SPAIDEN-0004"), toStr("FORM"), toStr("*ERROR* An ID number or 'GENERATED' must be entered for this function.")));
//							throw new ApplicationException();
//						}
//						else {
//							nextBlock();
//						}
//					}
//					else {
//						goBlock(toStr("GORADID"));
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//						this.getTask().getServices().executeAQuery();
//						// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//						MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
//					}
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.DISABLE_KEYS
		    SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('ID_LBT', ENABLED, PROPERTY_OFF);
   
G$_NAVIGATION_FRAME.ENABLE_OPTION('SPRIDEN_PREVIOUS','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('SPRTELE','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('SPRADDR','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('SPBPERS','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('GOREMAL','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('GORADID','P');
G$_NAVIGATION_FRAME.ENABLE_OPTION('SPREMRG','P');
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Spaiden_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("GENERATE_BTN", false);
				setItemEnabled("ID_LBT", false);
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SPRIDEN_PREVIOUS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SPRTELE"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SPRADDR"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SPBPERS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GOREMAL"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GORADID"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("SPREMRG"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('ID',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('ID',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('ID_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('ID_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('GENERATE_BTN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('GENERATE_BTN',ENABLED,PROPERTY_ON);
END IF;

G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRIDEN_PREVIOUS','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRTELE','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPRADDR','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPBPERS','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('GOREMAL','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('GORADID','P');
G$_NAVIGATION_FRAME.DISABLE_OPTION('SPREMRG','P');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Spaiden_EnableKeys()
		{
			
				if ( getItemEnabled("ID").equals("FALSE") )
				{
					setItemEnabled("ID", true);
					setItemNavigable("ID", true);
				}
				if ( getItemEnabled("ID_LBT").equals("FALSE") )
				{
					setItemEnabled("ID_LBT", true);
				}
				if ( getItemEnabled("GENERATE_BTN").equals("FALSE") )
				{
					setItemEnabled("GENERATE_BTN", true);
				}
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRIDEN_PREVIOUS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRTELE"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPRADDR"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPBPERS"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GOREMAL"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("GORADID"), toStr("P"));
				getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("SPREMRG"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.DISABLE_ROOTWIN_BUTTONS
		 G$_NAVIGATION_FRAME.ENABLE_OPTION('GUASYST','P');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.DISABLE_ROOTWIN_BUTTONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_ROOTWIN_BUTTONS")
		public void Spaiden_DisableRootwinButtons()
		{
			
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUASYST"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_ROOTWIN_BUTTONS
		 G$_NAVIGATION_FRAME.ENABLE_OPTION('GUASYST','P');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_ROOTWIN_BUTTONS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_ROOTWIN_BUTTONS")
		public void Spaiden_EnableRootwinButtons()
		{
			
				getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUASYST"), toStr("P"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.DISABLE_TAB_PAGES
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
		 * SPAIDEN.DISABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_TAB_PAGES")
		public void Spaiden_DisableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDRESS_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("TELEPHONE_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("BIO_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMERGENCY_CONTACT_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("EMERGENCY_CONTACT_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( getTabPageEnabled(tabPageId))
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_FALSE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_TAB_PAGES
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
		 * SPAIDEN.ENABLE_TAB_PAGES
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_TAB_PAGES")
		public void Spaiden_EnableTabPages()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					tabPageId = findTabPage("ALTERNATE_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ALTERNATE_ID_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDRESS_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDRESS_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("TELEPHONE_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("TELEPHONE_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("BIO_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("BIO_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMAIL_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMAIL_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("EMERGENCY_CONTACT_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("EMERGENCY_CONTACT_TAB"));
						}
					}
					// 
					tabPageId = findTabPage("ADDITIONAL_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							getTask().getGoqrpls().getGTabSecurity().gSetTabPageProperty(tabPageId, toStr("ENABLED"), toStr("PROPERTY_TRUE"), toStr("ADDITIONAL_ID_TAB"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_LEGAL_BUTTON
		 -- SET_ITEM_PROPERTY ('LEGAL_NAME_BTN', ENABLED, PROPERTY_ON);
-- G$_NAVIGATION_FRAME.ENABLE_OPTION('LEGAL_NAME_WINDOW','P');
NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_LEGAL_BUTTON
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_LEGAL_BUTTON")
		public void Spaiden_EnableLegalButton()
		{
			
				//  SET_ITEM_PROPERTY ('LEGAL_NAME_BTN', ENABLED, PROPERTY_ON);
				//  G$_NAVIGATION_FRAME.ENABLE_OPTION('LEGAL_NAME_WINDOW','P');
				//  SET_ITEM_PROPERTY ('LEGAL_NAME_BTN', ENABLED, PROPERTY_ON);
				//  G$_NAVIGATION_FRAME.ENABLE_OPTION('LEGAL_NAME_WINDOW','P');
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_NONPERS_ITEMS
		 SET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED, PROPERTY_ON);
SET_ITEM_PROPERTY ('NON_PERS_NAME', NAVIGABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('NON_PERS_NAME', UPDATEABLE, PROPERTY_ON);
SET_ITEM_PROPERTY ('ORG_NAME_SRCH_BTN',ENABLED, PROPERTY_ON);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_NONPERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_NONPERS_ITEMS")
		public void Spaiden_EnableNonpersItems()
		{
			
				setItemEnabled("NON_PERS_NAME", true);
				setItemNavigable("NON_PERS_NAME", true);
				setItemUpdateAllowed("NON_PERS_NAME", true);
				setItemEnabled("ORG_NAME_SRCH_BTN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_PERS_ITEMS
		 <multilinecomment> Enable last name </multilinecomment>
   SET_ITEM_PROPERTY ('spriden_current.PERS_LAST_NAME', ENABLED, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_LAST_NAME', NAVIGABLE, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_LAST_NAME', UPDATEABLE, PROPERTY_ON);
<multilinecomment> Enable first name </multilinecomment>
   SET_ITEM_PROPERTY ('spriden_current.PERS_FIRST_NAME', ENABLED, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_FIRST_NAME', NAVIGABLE, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_FIRST_NAME', UPDATEABLE, PROPERTY_ON);
<multilinecomment> Enable middle name </multilinecomment>
   SET_ITEM_PROPERTY ('spriden_current.PERS_MI', ENABLED, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_MI', NAVIGABLE, PROPERTY_ON);
   SET_ITEM_PROPERTY ('spriden_current.PERS_MI', UPDATEABLE, PROPERTY_ON);
<multilinecomment> Enable prefix </multilinecomment>
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_PREFIX') = 'N' THEN
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREFIX', ENABLED, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREFIX', NAVIGABLE, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREFIX', UPDATEABLE, PROPERTY_ON);
   END IF;
<multilinecomment> Enable suffix </multilinecomment>
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_SUFFIX') = 'N' THEN
     SET_ITEM_PROPERTY ('spriden_current.PERS_SUFFIX', ENABLED, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_SUFFIX', NAVIGABLE, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_SUFFIX', UPDATEABLE, PROPERTY_ON);
   END IF;
<multilinecomment> Enable prefered first name  </multilinecomment>
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_PREF_FNAME') = 'N' THEN
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREF_FNAME', ENABLED, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREF_FNAME', NAVIGABLE, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_PREF_FNAME', UPDATEABLE, PROPERTY_ON);
   END IF;
<multilinecomment> Enable legal name </multilinecomment>
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_LEGAL_NAME') = 'N' THEN
     SET_ITEM_PROPERTY ('spriden_current.PERS_LEGAL_NAME', ENABLED, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_LEGAL_NAME', NAVIGABLE, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_LEGAL_NAME', UPDATEABLE, PROPERTY_ON);
   END IF;
<multilinecomment> Enable surname prefix </multilinecomment>
   IF G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_SURNAME_PREFIX') = 'N' THEN
     SET_ITEM_PROPERTY ('spriden_current.PERS_SURNAME_PREFIX', ENABLED, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_SURNAME_PREFIX', NAVIGABLE, PROPERTY_ON);
     SET_ITEM_PROPERTY ('spriden_current.PERS_SURNAME_PREFIX', UPDATEABLE, PROPERTY_ON);
   END IF;   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_PERS_ITEMS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_PERS_ITEMS")
		public void Spaiden_EnablePersItems()
		{
			
				//  Enable last name 
				//  Enable last name 
				setItemEnabled("spriden_current.PERS_LAST_NAME", true);
				setItemNavigable("spriden_current.PERS_LAST_NAME", true);
				setItemUpdateAllowed("spriden_current.PERS_LAST_NAME", true);
				//  Enable first name 
				setItemEnabled("spriden_current.PERS_FIRST_NAME", true);
				setItemNavigable("spriden_current.PERS_FIRST_NAME", true);
				setItemUpdateAllowed("spriden_current.PERS_FIRST_NAME", true);
				//  Enable middle name 
				setItemEnabled("spriden_current.PERS_MI", true);
				setItemNavigable("spriden_current.PERS_MI", true);
				setItemUpdateAllowed("spriden_current.PERS_MI", true);
				//  Enable prefix 
				if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_PREFIX")).equals("N") )
				{
					setItemEnabled("spriden_current.PERS_PREFIX", true);
					setItemNavigable("spriden_current.PERS_PREFIX", true);
					setItemUpdateAllowed("spriden_current.PERS_PREFIX", true);
				}
				//  Enable suffix 
				if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_SUFFIX")).equals("N") )
				{
					setItemEnabled("spriden_current.PERS_SUFFIX", true);
					setItemNavigable("spriden_current.PERS_SUFFIX", true);
					setItemUpdateAllowed("spriden_current.PERS_SUFFIX", true);
				}
				//  Enable prefered first name  
				if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_PREF_FNAME")).equals("N") )
				{
					setItemEnabled("spriden_current.PERS_PREF_FNAME", true);
					setItemNavigable("spriden_current.PERS_PREF_FNAME", true);
					setItemUpdateAllowed("spriden_current.PERS_PREF_FNAME", true);
				}
				//  Enable legal name 
				if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_LEGAL_NAME")).equals("N") )
				{
					setItemEnabled("spriden_current.PERS_LEGAL_NAME", true);
					setItemNavigable("spriden_current.PERS_LEGAL_NAME", true);
					setItemUpdateAllowed("spriden_current.PERS_LEGAL_NAME", true);
				}
				//  Enable surname prefix 
				if ( getTask().getGoqrpls().getGMasks().gDidMaskRestrict(toStr(getCurrentTaskName()), toStr("SPRIDEN_CURRENT"), toStr("PERS_SURNAME_PREFIX")).equals("N") )
				{
					setItemEnabled("spriden_current.PERS_SURNAME_PREFIX", true);
					setItemNavigable("spriden_current.PERS_SURNAME_PREFIX", true);
					setItemUpdateAllowed("spriden_current.PERS_SURNAME_PREFIX", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CLOSE_WINDOWS
		 --SET_WINDOW_PROPERTY ('SPRIDEN_PREVIOUS_WINDOW', VISIBLE, PROPERTY_OFF);
--SET_WINDOW_PROPERTY ('SPRADDR_WINDOW', VISIBLE, PROPERTY_OFF);
--SET_WINDOW_PROPERTY ('CURR_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
--SET_WINDOW_PROPERTY ('PREV_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
--SET_WINDOW_PROPERTY ('MAIL_WINDOW', VISIBLE, PROPERTY_OFF);
--SET_WINDOW_PROPERTY ('LEGAL_NAME_WINDOW', VISIBLE, PROPERTY_OFF);
NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Spaiden_CloseWindows()
		{
			
				// SET_WINDOW_PROPERTY ('SPRIDEN_PREVIOUS_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('SPRADDR_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('CURR_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('PREV_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('MAIL_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('LEGAL_NAME_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('SPRIDEN_PREVIOUS_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('SPRADDR_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('CURR_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('PREV_SOURCE_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('MAIL_WINDOW', VISIBLE, PROPERTY_OFF);
				// SET_WINDOW_PROPERTY ('LEGAL_NAME_WINDOW', VISIBLE, PROPERTY_OFF);
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.NAME_AND_ID_CHECK
		    G$_CHECK_VALUE ((:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL
     AND  :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P'),
       G$_NLS.Get('SPAIDEN-0005', 'FORM','*ERROR* Last name and first name required for a person.') ,
          TRUE);
--
-- This trigger step checks if the person exists on the database.  If
--  not, the
-- information must be committed (so a PIDM is created for further
--  processing)
--
   G$_CHECK_VALUE ((:SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL
     AND  (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL
      OR  :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL)),
       G$_NLS.Get('SPAIDEN-0006', 'FORM','*ERROR* Current identification added; press SAVE.') ,
         TRUE);
--
-- This trigger step checks if either the name or id was changed to force
--  the
-- user to commit any changes.
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
           AND  SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID;
   BEGIN
      OPEN PTI_CURSOR;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('SPAIDEN-0007', 'FORM','*ERROR* Current identification changed; press SAVE.') 
         , TRUE);
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
		 * SPAIDEN.NAME_AND_ID_CHECK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="NAME_AND_ID_CHECK")
		public void Spaiden_NameAndIdCheck()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){

				int rowCount = 0;
				getTask().getGoqrpls().gCheckValue(((spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement.getSpridenEntityInd().equals("P"))), GNls.Fget(toStr("SPAIDEN-0005"), toStr("FORM"), toStr("*ERROR* Last name and first name required for a person.")), toBool(NBool.True));
				// 
				//  This trigger step checks if the person exists on the database.  If
				//   not, the
				//  information must be committed (so a PIDM is created for further
				//   processing)
				// 
				getTask().getGoqrpls().gCheckValue(((spridenCurrentElement.getSpridenPidm().isNull() && (!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getNonPersName().isNull()))), GNls.Fget(toStr("SPAIDEN-0006"), toStr("FORM"), toStr("*ERROR* Current identification added; press SAVE.")), toBool(NBool.True));
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
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("SPAIDEN-0007"), toStr("FORM"), toStr("*ERROR* Current identification changed; press SAVE.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CHECK_BOTH
		    IF :SPRIDEN_CURRENT.ROWID IS NULL  THEN
      EXECUTE_TRIGGER( 'CHECK_PERS_NONPERS' );
      G$_CHECK_FAILURE;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CHECK_BOTH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_BOTH")
		public void Spaiden_CheckBoth()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){

				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( spridenCurrentElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					executeAction("CHECK_PERS_NONPERS");
					getTask().getGoqrpls().gCheckFailure();
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
		*/
		/*
		 *<p>
		 *This trigger will copy the keys back to the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Spaiden_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.GLOBAL_COPY
		    :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO;
   IF :KEY_BLOCK.ID IS NOT NULL THEN
      NEXT_ITEM;
   END IF;
		*/
		/*
		 *<p>
		 *This trigger will copy the key information from the global area.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Spaiden_GlobalCopy()
		{
			
				getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_SPATELE
		    :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM; 
   :HOLD_BLOCK := :SYSTEM.CURSOR_BLOCK;
   EXECUTE_TRIGGER( 'SAVE_KEYS' );
   G$_CHECK_FAILURE;
--
   :GLOBAL.SECRFRM := 'SPATELE';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
--
   IF :HOLD_BLOCK <> 'KEY_BLOCK' THEN
      GO_BLOCK(:HOLD_BLOCK);
      EXECUTE_A_QUERY;
   END IF;
   GO_ITEM( :HOLD_BLOCK_FIELD ); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_SPATELE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPATELE")
		public void Spaiden_CallSpatele()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				getFormModel().getFormHeader().setHoldBlock(toStr(getCursorBlock()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SPATELE"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				// 
				if ( getFormModel().getFormHeader().getHoldBlock().notEquals("KEY_BLOCK") )
				{
					goBlock(getFormModel().getFormHeader().getHoldBlock());
					this.getTask().getServices().executeAQuery();
				}
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_SPAPERS
		    :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;   
   EXECUTE_TRIGGER( 'SAVE_KEYS' );
   G$_CHECK_FAILURE;
--
   :GLOBAL.SECRFRM := 'SPAPERS';
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
   GO_ITEM(:HOLD_BLOCK_FIELD);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_SPAPERS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SPAPERS")
		public void Spaiden_CallSpapers()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SPAPERS"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_SOAAPPT
		    :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
   EXECUTE_TRIGGER( 'SAVE_KEYS' );
   G$_CHECK_FAILURE;
--
   :GLOBAL.SECRFRM := 'SOAAPPT';
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
   GO_ITEM(:HOLD_BLOCK_FIELD);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_SOAAPPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_SOAAPPT")
		public void Spaiden_CallSoaappt()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("SOAAPPT"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_GUASYST
		   :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM; 
  EXECUTE_TRIGGER( 'SAVE_KEYS' );
   G$_CHECK_FAILURE;
--
   :GLOBAL.SECRFRM := 'GUASYST';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
   GO_ITEM (:HOLD_BLOCK_FIELD);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_GUASYST
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_GUASYST")
		public void Spaiden_CallGuasyst()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("GUASYST"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CALL_GOAMTCH
		   :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM; 
  EXECUTE_TRIGGER( 'SAVE_KEYS' );
   G$_CHECK_FAILURE;
--
   :GLOBAL.SECRFRM := 'GOAMTCH';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
   GO_ITEM (:HOLD_BLOCK_FIELD);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CALL_GOAMTCH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_GOAMTCH")
		public void Spaiden_CallGoamtch()
		{
			
				getFormModel().getFormHeader().setHoldBlockField(toStr(getCursorItem()));
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("SECRFRM", toStr("GOAMTCH"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
				goItem(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.KEY-EXIT
		 DECLARE 
	alert_button	number;
		
BEGIN
if :key_block.ID is not null then
	if gb_common.f_id_exists(:key_block.ID) = 'N' then
		:key_block.ID := '';
		:global.key_idno := '';
		:global.key_pidm := '';
		:GLOBAL.VALUE := '';
		G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
	end if;
end if;

-- if :key_block.ID = 'NEXT' or :spriden_current.SPRIDEN_ID = 'NEXT'
 IF :system.cursor_block = 'KEY_BLOCK'	
 then   --  EXIT
          :GLOBAL.VALUE := '';
           G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
 else
 	<multilinecomment> MW 02/04/2003 Added following check for SPRADDR block to fix defect 71239. </multilinecomment>
 	 IF (:SYSTEM.CURSOR_BLOCK = 'SPRADDR' AND :SPRADDR.ROWID IS NULL) THEN
 	    :GLOBAL.VALUE := '';
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      G$_CHECK_FAILURE;
 	 END IF;
 	 
--	 
-- NEXT_FIELD;
-- PREVIOUS_FIELD;
 IF    :CHANGE_PHONE = 'Y' 
 THEN -- ASK ABOUT CHANGES
   alert_button := SHOW_ALERT('CAUTION_CHANGE_ALERT');
	IF alert_button = ALERT_BUTTON1
	THEN -- SAVE CHANGES
  	   DO_KEY ('COMMIT_FORM');
           :GLOBAL.VALUE := '';
        -- 012999   EXIT_FORM;
           G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
	ELSIF alert_button = ALERT_BUTTON2
        THEN	-- DON'T SAVE CHANGES
           :GLOBAL.VALUE := '';
        -- 012999   EXIT_FORM;
           G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
	END IF;
  ELSE -- EXIT
           :GLOBAL.VALUE := '';
        -- 012999  EXIT_FORM;
           G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
  END IF;
 end if;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Spaiden_Exit()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if(spraddrElement!=null){

				{
					NNumber alertButton= NNumber.getNull();
					if ( !getFormModel().getKeyBlock().getId().isNull() )
					{
						if ( GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N") )
						{
							getFormModel().getKeyBlock().setId(toStr(""));
							setGlobal("KEY_IDNO", toStr(""));
							setGlobal("KEY_PIDM", toStr(""));
							setGlobal("VALUE", toStr(""));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						}
					}
					//  if :key_block.ID = 'NEXT' or :spriden_current.SPRIDEN_ID = 'NEXT'
					if ( getCursorBlock().equals("KEY_BLOCK") )
					{
						//   EXIT
						setGlobal("VALUE", toStr(""));
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						//  MW 02/04/2003 Added following check for SPRADDR block to fix defect 71239. 
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						if ((getCursorBlock().equals("SPRADDR") && spraddrElement.getRowState().equals(DataRowStatus.INSERTED)))
						{
							setGlobal("VALUE", toStr(""));
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							getTask().getGoqrpls().gCheckFailure();
						}
						// 	 
						//  NEXT_FIELD;
						//  PREVIOUS_FIELD;
						if ( spraddrElement.getChangePhone().equals("Y") )
						{
							//  ASK ABOUT CHANGES
							alertButton = toNumber(showAlert("CAUTION_CHANGE_ALERT"));
							if ( alertButton.equals(MessageServices.BUTTON1) )
							{
								//  SAVE CHANGES
								executeAction(KeyFunction.SAVE);
								setGlobal("VALUE", toStr(""));
								//  012999   EXIT_FORM;
								getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							}
							else if ( alertButton.equals(MessageServices.BUTTON2) ) {
								//  DON'T SAVE CHANGES
								setGlobal("VALUE", toStr(""));
								//  012999   EXIT_FORM;
								getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
							}
						}
						else {
							//  EXIT
							setGlobal("VALUE", toStr(""));
							//  012999  EXIT_FORM;
							getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
						}
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.KEY-CLRFRM
		 EXECUTE_TRIGGER('CLRFRM_TRIGGER');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Spaiden_ClearTask()
		{
			
				executeAction("CLRFRM_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.CLRFRM_TRIGGER
		   EXECUTE_TRIGGER( 'SAVE_KEYS' );
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER ('ENABLE_KEYS');
  G$_CHECK_FAILURE;
--
--IF :SPRIDEN_CURRENT.SPRIDEN_ID = 'NEXT' THEN
--  MESSAGE( G$_NLS.Get('SPAIDEN-0008','FORM','*ERROR* NEXT is not a valid ID.  Your changes have not been saved.') );
--  SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB');
--  CLEAR_FORM(NO_VALIDATE);
--ELSE
	clear_form;
	if not form_success then
		execute_trigger('DISABLE_KEYS');
	end if;	
	g$_check_failure;
	if :system.cursor_block <> 'KEY_BLOCK' then
		execute_trigger('DISABLE_KEYS');
		:global.action := '';
	else
    SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB');
	  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      :GLOBAL.ACTION := '';
      EXECUTE_TRIGGER('DISABLE_KEYS');
      G$_CHECK_FAILURE;
      RETURN;
    END IF;
--END IF;  
--
    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' );
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER( 'GLOBAL_COPY' );
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER( 'CLOSE_WINDOWS' );
    G$_CHECK_FAILURE;
--
    G$_NAVIGATION_FRAME.ENABLE_OPTION('GUASYST','P');
--
    IF GET_ITEM_PROPERTY ('LEGAL_NAME_BTN', ENABLED) = 'FALSE' THEN
      EXECUTE_TRIGGER ('ENABLE_LEGAL_BUTTON');
    END IF;
    IF GET_ITEM_PROPERTY ('PERS_LAST_NAME', ENABLED) = 'FALSE' THEN
      EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS');
    END IF;
    IF GET_ITEM_PROPERTY ('NON_PERS_NAME', ENABLED) = 'FALSE' THEN
      EXECUTE_TRIGGER ('ENABLE_NONPERS_ITEMS');
    END IF;
--
    EXECUTE_TRIGGER('DISABLE_TAB_PAGES');
  end if;
--END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.CLRFRM_TRIGGER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLRFRM_TRIGGER")
		public void Spaiden_ClrfrmTrigger()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				// IF :SPRIDEN_CURRENT.SPRIDEN_ID = 'NEXT' THEN
				//   MESSAGE( G$_NLS.Get('SPAIDEN-0008','FORM','*ERROR* NEXT is not a valid ID.  Your changes have not been saved.') );
				//   SET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE,'CURRENT_ID_TAB');
				//   CLEAR_FORM(NO_VALIDATE);
				// ELSE
				try {
					clearTask();
					
				} catch (Exception e) {
					// TODO: handle exception
					executeAction("DISABLE_KEYS");
				}
				
//				clearTask();
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					executeAction("DISABLE_KEYS");
//				}
				getTask().getGoqrpls().gCheckFailure();
				if ( getCursorBlock().notEquals("KEY_BLOCK") )
				{
					executeAction("DISABLE_KEYS");
					setGlobal("ACTION", toStr(""));
				}
				else {
					setCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS", "CURRENT_ID_TAB");
					if ( getTaskStatus().equals("CHANGED") )
					{
						setGlobal("ACTION", toStr(""));
						executeAction("DISABLE_KEYS");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
					// END IF;  
					// 
					executeAction("LOAD_FORM_HEADER");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("GLOBAL_COPY");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("CLOSE_WINDOWS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("GUASYST"), toStr("P"));
					// 
					if ( getItemEnabled("LEGAL_NAME_BTN").equals("FALSE") )
					{
						executeAction("ENABLE_LEGAL_BUTTON");
					}
					if ( getItemEnabled("PERS_LAST_NAME").equals("FALSE") )
					{
						executeAction("ENABLE_PERS_ITEMS");
					}
					if ( getItemEnabled("NON_PERS_NAME").equals("FALSE") )
					{
						executeAction("ENABLE_NONPERS_ITEMS");
					}
					// 
					executeAction("DISABLE_TAB_PAGES");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.POST_FORMS_COMMIT_TRG
		 IF :MATERIAL_FLAG = 'Y' THEN
    SOKCPLN.P_CREATE_MATERIALS(:KEY_BLOCK.PIDM);
   :MATERIAL_FLAG := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Spaiden_PostFormsCommitTrg()
		{
			
				if ( getFormModel().getFormHeader().getMaterialFlag().equals("Y") )
				{
					Sokcpln.pCreateMaterials(getFormModel().getKeyBlock().getPidm());
					getFormModel().getFormHeader().setMaterialFlag(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.PRE-UPDATE
		    :WORKDATE := :SYSTEM.CURRENT_BLOCK;
--
   :WORKDATE := SUBSTR(:WORKDATE, 1, 7);
--
   :WORKDATE := LPAD(:WORKDATE, 15, :WORKDATE || '.');
--
   :WORKDATE := RPAD(:WORKDATE, 29, '_ACTIVITY_DATE');
--
   COPY( :CURRENT_DATE, :WORKDATE );
		*/
		/*
		 *<p>
		 *This trigger will update the activity date with the current date for the
		 *current block and row.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Spaiden_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(lpad(getFormModel().getFormHeader().getWorkdate(), 15, getFormModel().getFormHeader().getWorkdate().append(".").getValue()));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 29, "_ACTIVITY_DATE")));
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.POST_FORM_TRG
		 :GLOBAL.PRODUCT_IND := '';



		*/
		/*
		 *<p>
		 *This trigger will copy the current key value back to the global fields.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Spaiden_PostFormTrg()
		{
			
				setGlobal("PRODUCT_IND", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.KEY_EXIT_TRG
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
		 * SPAIDEN.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Spaiden_KeyExitTrg()
		{
			
				setGlobal("NAVIGATE_TO_TAB", toStr(null));
				executeAction("GLOBAL_TELE_COPY");
				executeAction("GLOBAL_ID_ERASE");
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.KEY_NXTKEY_TRG
		 IF :GLOBAL.NAVIGATE_TO_TAB = 'TELEPHONE' THEN
  :GLOBAL.VALUE := :SPRTELE.ROWID ;
   :global.atyp_code  := :SPRTELE.sprtele_atyp_code;
   :global.seqno := :SPRTELE.SPRTELE_ADDR_SEQNO;
   :global.tele_code := :SPRTELE.SPRTELE_TELE_CODE;
   :global.tele_seqno := :SPRTELE.SPRTELE_SEQNO;
   :global.phone_area := :SPRTELE.SPRTELE_PHONE_AREA;
   :global.phone_number := :SPRTELE.SPRTELE_PHONE_NUMBER;
   :global.phone_ext := :SPRTELE.SPRTELE_PHONE_EXT;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Spaiden_KeyNxtkeyTrg()
		{
			

				SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);

				if(sprteleElement!=null){

				if ( getGlobal("NAVIGATE_TO_TAB").equals("TELEPHONE") )
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					setGlobal("VALUE", sprteleElement.getROWID());
					setGlobal("ATYP_CODE", sprteleElement.getSprteleAtypCode());
					setGlobal("SEQNO", toStr(sprteleElement.getSprteleAddrSeqno()));
					setGlobal("TELE_CODE", sprteleElement.getSprteleTeleCode());
					setGlobal("TELE_SEQNO", toStr(sprteleElement.getSprteleSeqno()));
					setGlobal("PHONE_AREA", sprteleElement.getSprtelePhoneArea());
					setGlobal("PHONE_NUMBER", sprteleElement.getSprtelePhoneNumber());
					setGlobal("PHONE_EXT", sprteleElement.getSprtelePhoneExt());
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.GLOBAL_TELE_COPY
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
		 * SPAIDEN.GLOBAL_TELE_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_TELE_COPY")
		public void Spaiden_GlobalTeleCopy()
		{
			

				SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);

				if(sprteleElement!=null){

				if ((getGlobal("NAVIGATE_TO_TAB").equals("TELEPHONE") && !sprteleElement.getSprteleAtypCode().isNull()))
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					setGlobal("VALUE", sprteleElement.getROWID());
					setGlobal("ATYP_CODE", sprteleElement.getSprteleAtypCode());
					setGlobal("SEQNO", toStr(sprteleElement.getSprteleAddrSeqno()));
					setGlobal("TELE_CODE", sprteleElement.getSprteleTeleCode());
					setGlobal("TELE_SEQNO", toStr(sprteleElement.getSprteleSeqno()));
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.ENABLE_GORPRAC
		 
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',UPDATEABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',VISIBLE,PROPERTY_ON);

   SET_ITEM_PROPERTY('GORPRAC_USER_ID',VISIBLE,PROPERTY_ON);

   SET_ITEM_PROPERTY('GORPRAC_ACTIVITY_DATE',VISIBLE,PROPERTY_ON);

   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE_LBT',VISIBLE,PROPERTY_ON);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.ENABLE_GORPRAC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_GORPRAC")
		public void Spaiden_EnableGorprac()
		{
			
				setItemEnabled("GORPRAC_RACE_CDE", true);
				setItemNavigable("GORPRAC_RACE_CDE", true);
				setItemUpdateAllowed("GORPRAC_RACE_CDE", true);
				setItemVisible("GORPRAC_RACE_CDE", true);
				setItemVisible("GORPRAC_USER_ID", true);
				setItemVisible("GORPRAC_ACTIVITY_DATE", true);
				setItemEnabled("GORPRAC_RACE_CDE_LBT", true);
				setItemVisible("GORPRAC_RACE_CDE_LBT", true);
			}

		
		/* Original PL/SQL code code for TRIGGER SPAIDEN.DISABLE_GORPRAC
		 
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',NAVIGABLE,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE',UPDATEABLE,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('GORPRAC_RACE_CDE_LBT',VISIBLE,PROPERTY_OFF);

   SET_ITEM_PROPERTY('GORPRAC_USER_ID',VISIBLE,PROPERTY_OFF);

   SET_ITEM_PROPERTY('GORPRAC_ACTIVITY_DATE',VISIBLE,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPAIDEN.DISABLE_GORPRAC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_GORPRAC")
		public void Spaiden_DisableGorprac()
		{
			
				setItemEnabled("GORPRAC_RACE_CDE", false);
				setItemNavigable("GORPRAC_RACE_CDE", false);
				setItemUpdateAllowed("GORPRAC_RACE_CDE", false);
				setItemEnabled("GORPRAC_RACE_CDE_LBT", false);
				setItemVisible("GORPRAC_RACE_CDE_LBT", false);
				setItemVisible("GORPRAC_USER_ID", false);
				setItemVisible("GORPRAC_ACTIVITY_DATE", false);
			}

		
	
}
	
