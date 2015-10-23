package net.hedtech.mesc.common.banner.payroll.Pyabene.controller;

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
import net.hedtech.banner.general.common.Noqlibr.controller.NoqlibrFormController;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Noqjpls.*;
import net.hedtech.general.common.libraries.Poqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.model.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;
import net.hedtech.mesc.common.banner.payroll.Pyabene.services.Exceptions.*;
		

public class PyabeneFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	private NoqlibrFormController getNoqlibrFormController() {
		return (net.hedtech.banner.general.common.Noqlibr.controller.NoqlibrFormController) this.getTask().getTaskPart("NOQLIBR").getSupportCodeManager().getPackage("NOQLIBR");
	}	
	
	
	public PyabeneFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public PyabeneTask getTask() {
		return (PyabeneTask)super.getTask();
	}
	
	
	public PyabeneModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER PYABENE.G$_VERIFY_ACCESS
		 DECLARE
--
-- Character string variables.
--
  ERR_MSG                VARCHAR(190);
  HOLD_CMD               VARCHAR2(240);
  FORM_FILE_NAME         VARCHAR2(30);
  FORM_MOD_NAME          VARCHAR2(30);
  OBJECT                 VARCHAR2(30);
  PASSWORD               VARCHAR2(30);
  PASSWORD1              VARCHAR2(30);
  ROLE_NAME              VARCHAR2(30);
  VERSION                VARCHAR2(10);
--
-- Number variables.
--
  ERR_NO                 NUMBER;
  SEED1                  NUMBER := 12345678;
  SEED3                  NUMBER := 87651234;
--
  FORM_ID                FORMMODULE;
--
-- Exceptions.
--
  NO_OBJECT              EXCEPTION;
  NO_INST                EXCEPTION;
  NO_ACCESS              EXCEPTION;
  NO_PASSWORD            EXCEPTION;
  INVALID_VERSION        EXCEPTION;
  INVALID_ACCESS         EXCEPTION;
  NAME_MISMATCH          EXCEPTION;
--
-- Exception pragmas.
--
  PRAGMA EXCEPTION_INIT(NO_OBJECT,-20100);
  PRAGMA EXCEPTION_INIT(NO_INST,-20101);
  PRAGMA EXCEPTION_INIT(NO_ACCESS,-20102);
  PRAGMA EXCEPTION_INIT(NO_PASSWORD,-20103);
  PRAGMA EXCEPTION_INIT(INVALID_VERSION,-20104);
  PRAGMA EXCEPTION_INIT(INVALID_ACCESS,-20105);
  PRAGMA EXCEPTION_INIT(NAME_MISMATCH,-20106);
--
-- Begin main logic.
--
BEGIN
  OBJECT  := NAME_IN('SYSTEM.CURRENT_FORM');
  VERSION := NAME_IN('CURRENT_RELEASE');
--
-- Obtain the internal and file name for form.  Remove extension if present.
--
  FORM_FILE_NAME := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM));
  FORM_MOD_NAME  := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
--
  IF INSTR(FORM_FILE_NAME,'.') > 0 THEN
  	FORM_FILE_NAME := SUBSTR(FORM_FILE_NAME,1,INSTR(FORM_FILE_NAME,'.')-1);
  END IF;
--
-- Obtain encrypted password.
--
  G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
-- If security is turned off, quit.
--
  IF PASSWORD = 'INSECURED' THEN
    GOTO CHK_FORM_CNT;
  END IF;
--
-- Check that file system name matches the internal module name.
--
  IF FORM_FILE_NAME <> FORM_MOD_NAME THEN
  	ERR_MSG :=  G$_NLS.Get('PYABENE-0000', 'FORM',
      	'*ERROR* User attempted to run %01% but the internal name (%02%) does not match.',
  	    FORM_FILE_NAME, FORM_MOD_NAME);
--
  	G$_SECURITY.G$_CREATE_LOG_RECORD(USER, OBJECT, ERR_MSG);
    RAISE NAME_MISMATCH;
  END IF;
--
-- Call for second phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED3);
  PASSWORD := PASSWORD1;
--
-- Call for third phase processing.
--
  G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
-- Call for fourth phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED1);
  PASSWORD := '"' || PASSWORD1 || '"';
--
-- Invoke needed role.
--
  HOLD_CMD := ROLE_NAME || ' IDENTIFIED BY ' || PASSWORD; 
  G$_TRACE_PKG.DO_EXEC_SQL('SET ROLE ' || HOLD_CMD);
--
  G$_VPDI.SET_VPDI_ON_ACCESS;
--
-- Clear variables.
--
  HOLD_CMD := '';
  OBJECT := '';
  PASSWORD := '';
  ROLE_NAME := '';
  SEED1 := '';
  SEED3 := '';
--
<<CHK_FORM_CNT>>
--
-- Update form count and listing.
--
  IF NVL(:GLOBAL.SKIP_FORM_CNT,'N') = 'Y' OR
     NVL(:GLOBAL.SKIP_DECR_CNT,'N') = 'Y' OR
     :SYSTEM.TRIGGER_BLOCK IS NOT NULL THEN
    RETURN;
  END IF;
--
<multilinecomment>
  FORM_ID := FIND_FORM(:SYSTEM.CURRENT_FORM);
  :GLOBAL.CURR_NO_FORMS := TO_CHAR(TO_NUMBER(:GLOBAL.CURR_NO_FORMS) + 1);
  IF :GLOBAL.CURR_OPEN_FORMS IS NULL THEN
    :GLOBAL.CURR_OPEN_FORMS := :SYSTEM.CURRENT_FORM || '-' || TO_CHAR(FORM_ID.ID);
  ELSE
    :GLOBAL.CURR_OPEN_FORMS := :GLOBAL.CURR_OPEN_FORMS || ',' || :SYSTEM.CURRENT_FORM || '-' 
             || TO_CHAR(FORM_ID.ID);
  END IF;
</multilinecomment>
--
-- Exception handling.
--
  EXCEPTION
    WHEN NO_OBJECT THEN
      MESSAGE(G$_NLS.Get('PYABENE-0001','FORM','*ERROR* No parameters were passed.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_INST THEN
      MESSAGE(G$_NLS.Get('PYABENE-0002','FORM','*ERROR* No records found on GUBIPRF.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_ACCESS THEN
      MESSAGE(G$_NLS.Get('PYABENE-0003','FORM','*ERROR* User %01% not authorized to access %02%',
                USER,OBJECT),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NO_PASSWORD THEN
      MESSAGE(G$_NLS.Get('PYABENE-0004','FORM','*ERROR* No password found on GUBROLE.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN INVALID_VERSION THEN
      MESSAGE(G$_NLS.Get('PYABENE-0005','FORM','*ERROR* Invalid version of %01%.',
                OBJECT ),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN INVALID_ACCESS THEN
      MESSAGE(G$_NLS.Get('PYABENE-0006','FORM','*ERROR* Invalid password tried.'),ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN NAME_MISMATCH THEN
      MESSAGE(ERR_MSG,ACKNOWLEDGE);
      RAISE FORM_TRIGGER_FAILURE;
--
    WHEN OTHERS THEN
      ERR_MSG := SUBSTR(SQLERRM,1,190);
      MESSAGE('SQLERRM: ' || ERR_MSG);
      RAISE FORM_TRIGGER_FAILURE;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Pyabene_GVerifyAccess()
		{
			
				{
					// 
					//  Character string variables.
					// 
					NString errMsg= NString.getNull();
					NString holdCmd= NString.getNull();
					NString formFileName= NString.getNull();
					NString formModName= NString.getNull();
					NString _object= NString.getNull();
					NString password= NString.getNull();
					NString password1= NString.getNull();
					NString roleName= NString.getNull();
					NString version= NString.getNull();
					
					Ref<NString> passwordRef = new Ref<NString>(password);
					Ref<NString> roleRef = new Ref<NString>(roleName);
					// 
					//  Number variables.
					// 
					NNumber errNo= NNumber.getNull();
					/*NNumber seed1 = toNumber(20040924);
					NNumber seed3 = toNumber(20050107);*/
					NNumber seed1 = toNumber(20040924);
					NNumber seed3 = toNumber(20050107);
					// 
//					UnknownTypes.Formmodule formId= null;
					// 
					//  Exceptions.
					// 
					try
					{
						_object = getCurrentTaskName();
						version = getNameIn("CURRENT_RELEASE");
						// 
						//  Obtain the internal and file name for form.  Remove extension if present.
						// 
						formFileName = upper(getCurrentTaskName());
						formModName = upper(getCurrentTaskName());
						// 
						if ( inStr(formFileName, toStr(".")).greater(0) )
						{
							formFileName = substring(formFileName, toInt(1), inStr(formFileName, toStr(".")).subtract(1));
						}
						// 
						//  Obtain encrypted password.
						// 
						//GSecurity.gVerifyPassword1Prd(_object, version,passwordRef , roleRef);
						GSecurity.gVerifyPassword1Prd(_object, version, passwordRef, roleRef);
						
						password = passwordRef.val;
						roleName = roleRef.val;
						
						// 
						//  If security is turned off, quit.
						// 
						if (! password.equals("INSECURED") )
						{
							
							// 
							//  Check that file system name matches the internal module name.
							// 
							if ( formFileName.notEquals(formModName) )
							{
								errMsg = GNls.Fget(toStr("PYABENE-0000"), toStr("FORM"), toStr("*ERROR* User attempted to run %01% but the internal name (%02%) does not match."), formFileName, formModName);
								// 
								GSecurity.gCreateLogRecord(getUser(), _object, errMsg);
								throw new NameMismatch();
							}
							// 
							//  Call for second phase processing.
							// 
							password1 = GSecurity.FgDecryptFnc(password, seed3);
							password = password1;
							passwordRef.val = password;
							
							
							// 
							//  Call for third phase processing.
							// 
							GSecurity.gVerifyPassword1Prd(_object, version, passwordRef, roleRef);
							
							roleName = roleRef.val;
							password = passwordRef.val;
							
							// 
							//  Call for fourth phase processing.
							// 
							password1 = GSecurity.FgDecryptFnc(password, seed1);
							
									
							password = toStr("\"").append(password1).append("\"");
							// 
							//  Invoke needed role.
							// 
							holdCmd = roleName.append(" IDENTIFIED BY ").append(password);
							getTask().getGoqrpls().getGTracePkg().doExecSql(toStr("SET ROLE ").append(holdCmd));
							// 
							getTask().getGoqrpls().getGVpdi().setVpdiOnAccess();
							// 
							//  Clear variables.
							// 
							holdCmd = toStr("");
							_object = toStr("");
							password = toStr("");
							roleName = toStr("");
							seed1 = toNumber("");
							seed3 = toNumber("");
						}
						// 
						//  Update form count and listing.
						// 
						if ( isNull(getGlobal("SKIP_FORM_CNT"), "N").equals("Y") || isNull(getGlobal("SKIP_DECR_CNT"), "N").equals("Y") || getTriggerBlock().isNotNull() )
						{
							return ;
						}
					}
					catch (Exception e){
						
					
						if( e instanceof NoObject)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0001"), toStr("FORM"), toStr("*ERROR* No parameters were passed.")));
							throw new ApplicationException();
						}
						if (e instanceof NoInst)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0002"), toStr("FORM"), toStr("*ERROR* No records found on GUBIPRF.")));
							throw new ApplicationException();
						}
						if (e instanceof NoAccess)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0003"), toStr("FORM"), toStr("*ERROR* User %01% not authorized to access %02%"), getUser(), _object));
							throw new ApplicationException();
						}
						if (e instanceof NoPassword)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0004"), toStr("FORM"), toStr("*ERROR* No password found on GUBROLE.")));
							throw new ApplicationException();
						}
						if (e instanceof InvalidVersion)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0005"), toStr("FORM"), toStr("*ERROR* Invalid version of %01%."), _object));
							throw new ApplicationException();
						}
						if (e instanceof InvalidAccess)
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0006"), toStr("FORM"), toStr("*ERROR* Invalid password tried.")));
							throw new ApplicationException();
						}
						if (e instanceof NameMismatch)
						{
							errorMessage(errMsg);
							throw new ApplicationException();
						}
						
						else
						{
							errMsg = substring(errorMessage(), toInt(1), toInt(190));
							errorMessage(toStr("SQLERRM: ").append(errMsg));
							throw new ApplicationException();
							
						}
					}
					
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Pyabene_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Pyabene_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Pyabene_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Pyabene_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Pyabene_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Pyabene_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Pyabene_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Pyabene_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Pyabene_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Pyabene_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Pyabene_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Pyabene_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Pyabene_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Pyabene_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.ON-SELECT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-SELECT")
		public void Pyabene_OnSelect()
		{
			
			getGFormClass().onSelect();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Pyabene_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Pyabene_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Pyabene_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Pyabene_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Pyabene_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Pyabene_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Pyabene_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Pyabene_WhenWindowActivatedTrg()
		{
			
			getGFormClass().whenWindowActivatedTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Pyabene_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Pyabene_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Pyabene_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Pyabene_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Pyabene_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Pyabene_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Pyabene_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Pyabene_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Pyabene_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Pyabene_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Pyabene_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Pyabene_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Pyabene_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Pyabene_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Pyabene_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Pyabene_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Pyabene_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Pyabene_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Pyabene_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Pyabene_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Pyabene_LoadFormHeader()
		{
			
			getGFormClass().loadFormHeader();
		}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.INVALID_OPTION_MSG
		 BEGIN
  MESSAGE( G$_NLS.Get('PYABENE-0007', 'FORM','*ERROR* Selected Option not available from this block.') );
  RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Pyabene_InvalidOptionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("PYABENE-0007"), toStr("FORM"), toStr("*ERROR* Selected Option not available from this block.")));
				throw new ApplicationException();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Pyabene_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Pyabene_CheckKeys()
		{
			
			getGApplFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Pyabene_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.N$_GUROPTM_CALL_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="N$_GUROPTM_CALL_FORM")
		public void Noqlibr_NGuroptmCallForm()
		{
			
				getNoqlibrFormController().Noqlibr_NGuroptmCallForm();
		}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Pyabene_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DECLARE
   FIELD_NAME  VARCHAR2(70);
BEGIN
   IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
      FIELD_NAME := :SYSTEM.CURSOR_FIELD;
      IF :CHECK_KEYS = 'Y' THEN
         :CHECK_KEYS := 'N';
-- 
         CLEAR_RECORD ;
         GO_BLOCK('KEY_BLOCK');
         G$_CHECK_FAILURE;
--
         EXECUTE_TRIGGER( 'CHECK_KEYS' ) ;
         G$_CHECK_FAILURE ;
--
        -- SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
           NEXT_BLOCK ;
           EXECUTE_QUERY ; 
        -- SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
--
         :CHECK_KEYS := 'N';
         EXECUTE_TRIGGER('DISABLE_KEYS');
         G$_CHECK_FAILURE;
--
         GO_ITEM(FIELD_NAME);
      END IF ;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Pyabene_WhenNewBlockInstanceTrg()
		{
			
				{
					NString fieldName= NString.getNull();
					if ( getCursorBlock().notEquals("KEY_BLOCK") )
					{
						fieldName = toStr(getCursorField());
						if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
						{
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							//  
							clearRecord();
							goBlock(toStr("KEY_BLOCK"));
							getTask().getGoqrpls().gCheckFailure();
							// 
							executeAction("CHECK_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							// 
							//  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
							nextBlock();
							executeQuery();
							//  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
							// 
							getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
							executeAction("DISABLE_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							// 
							goItem(fieldName);
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.UPDATE_ACTIVITY_DATE
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
		 * PYABENE.UPDATE_ACTIVITY_DATE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
		public void Pyabene_UpdateActivityDate()
		{
			
				getFormModel().getFormHeader().setWorkdate(toStr(getCurrentBlock()));
				// 
				getFormModel().getFormHeader().setWorkdate(substring(getFormModel().getFormHeader().getWorkdate(), toInt(1), toInt(7)));
				// 
				getFormModel().getFormHeader().setWorkdate(toStr(rpad(getFormModel().getFormHeader().getWorkdate(), 21, "_ACTIVITY_DATE")));
				
				// 
				copy(NDate.getNow(),getFormModel().getFormHeader().getWorkdate());
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.SAVE_KEYS
		    :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Pyabene_SaveKeys()
		{
			
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.INVALID_FUNCTION_MSG
		    MESSAGE(
 G$_NLS.Get('PYABENE-0008', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions.') 
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Pyabene_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("PYABENE-0008"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.INVALID_CODE_MSG
		    MESSAGE(
 G$_NLS.Get('PYABENE-0009', 'FORM','*ERROR* Invalid code; press LIST for valid codes.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.INVALID_CODE_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_CODE_MSG")
		public void Pyabene_InvalidCodeMsg()
		{
			
				errorMessage(GNls.Fget(toStr("PYABENE-0009"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.GLOBAL_COPY
		    IF :GLOBAL.KEY_IDNO IS NOT NULL THEN
      :KEY_BLOCK.ID := :GLOBAL.KEY_IDNO ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Pyabene_GlobalCopy()
		{
			
				if ( !getGlobal("KEY_IDNO").isNull() )
				{
					getFormModel().getKeyBlock().setId(getGlobal("KEY_IDNO"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.ENABLE_KEYS
		 <multilinecomment>IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',NAVIGABLE,PROPERTY_ON);
END IF;
--
IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',NAVIGABLE,PROPERTY_ON);
END IF;

IF GET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',NAVIGABLE,PROPERTY_ON);
END IF;</multilinecomment> NULL;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Pyabene_EnableKeys()
		{
			
				// IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// --
				// IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',NAVIGABLE,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED) = 'FALSE' THEN
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',NAVIGABLE,PROPERTY_ON);
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.DISABLE_KEYS
		 <multilinecomment>  SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_OFF);</multilinecomment>NULL;
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Pyabene_DisableKeys()
		{
			
				//   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_OFF);
				//   SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_NATN_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_AIRFARE_CODE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_ELGBTY_REASON',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE_DBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_REASON_DATE',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_AIRPORT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_HOME_NATN',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN_LBT',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_BIRTH_NATN',ENABLED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('PDRBENE_TKT_ELGBTY',ENABLED,PROPERTY_OFF);
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'ENABLE_KEYS' ) ;
   G$_CHECK_FAILURE ;
--
   IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN
       IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'PDABDSU' THEN
          SET_ITEM_PROPERTY('pdrbene_1_EXITVALUE_BTN',ENABLED,PROPERTY_OFF);
          SET_MENU_ITEM_PROPERTY('ACTION.SELECT',ENABLED,PROPERTY_OFF);         
       END IF;
       NEXT_BLOCK ;
       EXECUTE_QUERY ;
   END IF ;
--
   :GLOBAL.FORM_WAS_CALLED := '' ;
--
   G$_SET_INST_PROPERTY;
--
   G$_SET_WIN_PROPERTY;
--
   SET_MENU_ITEM_PROPERTY('MAIN.BLOCK',ENABLED,PROPERTY_ON);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Pyabene_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getGlobal("FORM_WAS_CALLED").equals("Y") )
				{
					if ( getParentTaskName().equals("PDABDSU") )
					{
						setItemEnabled("pdrbene_1_EXITVALUE_BTN", false);
						setMenuItemEnabled("ACTION.SELECT", false);
					}
					nextBlock();
					executeQuery();
				}
				// 
				setGlobal("FORM_WAS_CALLED", toStr(""));
				// 
				getTask().getGoqrpls().gSetInstProperty();
				// 
				getTask().getGoqrpls().gSetWinProperty();
				// 
				setMenuItemEnabled("MAIN.BLOCK", true);
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.KEY-PRVBLK
		    PREVIOUS_BLOCK ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Pyabene_PreviousBlock()
		{
			
				previousBlock();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.KEY-NXTBLK
		    NEXT_BLOCK ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Pyabene_NextBlock()
		{
			
				nextBlock();
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.KEY-EXIT
		    :GLOBAL.SEQ_NO := '' ;
--
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;     
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Pyabene_Exit()
		{
			
				setGlobal("SEQ_NO", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.KEY-CLRFRM
		    EXECUTE_TRIGGER('SAVE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_TRIGGER('ENABLE_KEYS') ;
   G$_CHECK_FAILURE;
   CLEAR_FORM;
   IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
      EXECUTE_TRIGGER( 'DISABLE_KEYS' ) ;
      G$_CHECK_FAILURE ;
      GO_ITEM('pdrbene.pdrbene_SEQ_NO');
      RETURN ;
   END IF;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Pyabene_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				if ( getTaskStatus().equals("CHANGED") )
				{
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					goItem(toStr("pdrbene.pdrbene_SEQ_NO"));
					return ;
				}
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.PRE-UPDATE
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Pyabene_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PYABENE.PRE-INSERT
		    EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PYABENE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Pyabene_BeforeRowInsert(RowAdapterEvent args)
		{
			
				// F2J_TODO : RowAdapterEvent declared on FormController. agrs row depends on event source block. Code completion required.
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
}
	
