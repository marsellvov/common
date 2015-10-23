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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Noqjpls.*;
import net.hedtech.general.common.libraries.Poqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.model.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GNavBlockController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController getGoqolibGNavBlockController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAV_BLOCK");
	}	
	
	public GNavBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public PyabeneTask getTask() {
		return (PyabeneTask)super.getTask();
	}

	public PyabeneModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gNavBlock_blockIn()
		{
			
			getGoqolibGNavBlockController().gNavBlock_blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gNavBlock_blockChange()
		{
			
			getGoqolibGNavBlockController().gNavBlock_blockChange();
		}

		
		/* Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.CHECK_TYPE
		 BEGIN
  IF :G$_NAV_BLOCK.GO_ITEM IS NOT NULL THEN
--
    IF :G$_NAV_BLOCK.GO_ITEM IN ('EXIT','QUIT') THEN
      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
--
    ELSIF :G$_NAV_BLOCK.GO_ITEM = 'GUAGMNU' THEN
      MESSAGE(G$_NLS.Get('PYABENE-0019','FORM','*ERROR* Menu is already running; cannot start up another copy.'));
      RAISE FORM_TRIGGER_FAILURE;
--
    ELSIF :G$_NAV_BLOCK.GO_ITEM = 'GUAINIT' THEN
      MESSAGE(G$_NLS.Get('PYABENE-0020','FORM','*ERROR* GUAINIT has already been run for this Banner session.'));
      RAISE FORM_TRIGGER_FAILURE;
--
    ELSE
      :G$_NAV_BLOCK.CALL_FLD := :G$_NAV_BLOCK.GO_ITEM;
      :GLOBAL.SELECTFRM  := :G$_NAV_BLOCK.GO_ITEM;
--
      IF SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,1) = 'V' THEN
        IF NVL(LENGTH(:G$_NAV_BLOCK.GO_ITEM), 0) = 8 THEN
          :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,2,2);
        ELSE
          :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,2,1);
        END IF;
      ELSE
        IF NVL(LENGTH(:G$_NAV_BLOCK.GO_ITEM), 0) = 8 THEN
          :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,2);
        ELSE
          :G$_NAV_BLOCK.FORM_LEADING_EDGE := SUBSTR(:G$_NAV_BLOCK.CALL_FLD,1,1);
        END IF;
      END IF;
--
      IF SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) <> '*' THEN
        IF (SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) NOT BETWEEN 'A' AND 'Z') THEN
          MESSAGE(G$_NLS.Get('PYABENE-0021','FORM','*ERROR* Objects must begin with a letter.'));
          RAISE FORM_TRIGGER_FAILURE;
        END IF;
      END IF;
--
      EXECUTE_TRIGGER('CALL_ROUTINE');
      G$_CHECK_FAILURE;

      EXECUTE_TRIGGER('INIT_NEXT_SELECTION');
      IF NOT FORM_SUCCESS THEN
        NULL;
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
		 * G$_NAV_BLOCK.CHECK_TYPE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_TYPE")
		public void gNavBlock_CheckType()
		{
			
				if ( !getFormModel().getGNavBlock().getGoItem().isNull() )
				{
					// 
					if ( in(getFormModel().getGNavBlock().getGoItem(), "EXIT", "QUIT").getValue() )
					{
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
					else if ( getFormModel().getGNavBlock().getGoItem().equals("GUAGMNU") ) {
						errorMessage(GNls.Fget(toStr("PYABENE-0019"), toStr("FORM"), toStr("*ERROR* Menu is already running; cannot start up another copy.")));
						throw new ApplicationException();
					}
					else if ( getFormModel().getGNavBlock().getGoItem().equals("GUAINIT") ) {
						errorMessage(GNls.Fget(toStr("PYABENE-0020"), toStr("FORM"), toStr("*ERROR* GUAINIT has already been run for this Banner session.")));
						throw new ApplicationException();
					}
					else {
						getFormModel().getGNavBlock().setCallFld(getFormModel().getGNavBlock().getGoItem());
						setGlobal("SELECTFRM", getFormModel().getGNavBlock().getGoItem());
						// 
						if ( substring(getFormModel().getGNavBlock().getCallFld(), toInt(1), toInt(1)).equals("V") )
						{
							if ( isNull(length(getFormModel().getGNavBlock().getGoItem()), 0).equals(8) )
							{
								getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(), toInt(2), toInt(2)));
							}
							else {
								getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(), toInt(2), toInt(1)));
							}
						}
						else {
							if ( isNull(length(getFormModel().getGNavBlock().getGoItem()), 0).equals(8) )
							{
								getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(), toInt(1), toInt(2)));
							}
							else {
								getFormModel().getGNavBlock().setFormLeadingEdge(substring(getFormModel().getGNavBlock().getCallFld(), toInt(1), toInt(1)));
							}
						}
						// 
						if ( substring(getFormModel().getGNavBlock().getFormLeadingEdge(), toInt(1), toInt(1)).notEquals("*") )
						{
							if ((!between(substring(getFormModel().getGNavBlock().getFormLeadingEdge(), toInt(1), toInt(1)), "A", "Z")))
							{
								errorMessage(GNls.Fget(toStr("PYABENE-0021"), toStr("FORM"), toStr("*ERROR* Objects must begin with a letter.")));
								throw new ApplicationException();
							}
						}
						// 
						executeAction("CALL_ROUTINE");
						getTask().getGoqrpls().gCheckFailure();
						
						try{
						executeAction("INIT_NEXT_SELECTION");
						}catch ( Exception e )
						{
							throw new ApplicationException(e);
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER G$_NAV_BLOCK.CALL_ROUTINE
		 DECLARE
  WRK_OBJT         VARCHAR2(10);
  AL_BUTTON        NUMBER;
BEGIN
  << INIT_CALL >>
  :GLOBAL.NEW_FORM := :G$_NAV_BLOCK.CALL_FLD;
--
  SELECT GUBOBJS_OBJT_CODE
    INTO WRK_OBJT
    FROM GUBOBJS
   WHERE GUBOBJS_NAME = :G$_NAV_BLOCK.CALL_FLD;
--
  IF WRK_OBJT NOT IN ('MENU','MESSAGE') THEN
    EXECUTE_TRIGGER('GLO_INIT_ROUTINE');
    G$_CHECK_FAILURE;
--
    IF :G$_NAV_BLOCK.FORM_TYPE_IND = 'Q' AND WRK_OBJT = 'FORM' THEN
      MESSAGE(G$_NLS.Get('PYABENE-0022','FORM','*ERROR* Invalid form name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  :GLOBAL.CALLING_FORM := :SYSTEM.CURRENT_FORM;
--
-- This step will execute either a call form or a newform for the
-- requested form if global.callfrm is null.
-- The null check allows this step to be bypassed in the event that
-- the product initialization form (?OQMENU) has requested that control
-- be passed to another form.
-- If this is the case the trigger will cycle around one more time
-- and pass control to the form that the initialization routine
-- requested.
--
  IF :GLOBAL.CALLFRM IS NULL THEN
--
-- Check whether or not the user is running a Payroll or a
-- Position control form.  If so, check to see if the 
-- initialization form has been run.  If not, skip logic
-- otherwise call routine to check for electronic approvals.
--
    IF SUBSTR(:G$_NAV_BLOCK.FORM_LEADING_EDGE,1,1) IN ('N','P') THEN
      IF NVL(NAME_IN(NAME_IN('G$_NAV_BLOCK.FORM_INIT_IND')),'N') = 'Y' THEN
        G$_GET_PIPE_MESSAGES;
        EXECUTE_TRIGGER('GET_EAWTE_MESSAGES');
      END IF;
    END IF;
--
-- Determine the type of object we are about to call.
--
    IF WRK_OBJT = 'JOBS' THEN
      :GLOBAL.KEY_JOB_NAME := :GLOBAL.NEW_FORM;
      :GLOBAL.NEW_FORM := 'GJAPCTL';
    ELSIF WRK_OBJT = 'QUICKFLOW' THEN
      G$_QUICKFLOW(:GLOBAL.NEW_FORM);
      RETURN;
    ELSIF WRK_OBJT = 'MESSAGE' THEN
      SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
          G$_NLS.Get('PYABENE-0023','FORM','Please use desktop or web application to complete this activity. '
           || 'These applications may be accessible through your Banner toolbar.'));
      AL_BUTTON := SHOW_ALERT('G$_INFO_ALERT');
      RETURN;
    ELSIF WRK_OBJT = 'MENU' THEN
      MESSAGE(G$_NLS.Get('PYABENE-0024','FORM','*ERROR* Menu objects cannot be called from here.'));
      RETURN;
    ELSE
      NULL;
    END IF;
--
-- Form call logic.
--
    COPY('Y','GLOBAL.NAV_FRAME_CALL');
    COPY('','GLOBAL.FORM_WAS_CALLED');
-- --
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),:GLOBAL.NEW_FORM,'');
--
    :GLOBAL.KEY_CALL_CODE := '';
    :GLOBAL.WIN_TITLE := '';
    :GLOBAL.WIN_X_POS := '';
    :GLOBAL.WIN_Y_POX := '';
--
  END IF;
--
-- This step checks to see if a form name has been placed in the
-- GLOBAL.CALLFRM field.  If not, the trigger exits.
-- If there is a value, then copy the form name to :KEY_BLOCK.callfld 
-- and wipe out the global value. THEN restart the logic in this 
-- trigger over which will pass control directly to the requested form.
--
  IF :GLOBAL.CALLFRM IS NOT NULL THEN
    :G$_NAV_BLOCK.CALL_FLD := :GLOBAL.CALLFRM;
    :GLOBAL.CALLFRM := '';
    GOTO INIT_CALL;
  END IF;
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE(G$_NLS.Get('PYABENE-0025','FORM','*ERROR* Invalid object name entered.'));
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.CALL_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_ROUTINE")
		public void gNavBlock_CallRoutine()
		{
			
				int rowCount = 0;
				{
					NString wrkObjt= NString.getNull();
					NNumber alButton= NNumber.getNull();
					try
					{
						while(true){
						setGlobal("NEW_FORM", getFormModel().getGNavBlock().getCallFld());
						// 
						String sql1 = "SELECT GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :G___NAV_BLOCK_CALL_FLD ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("G___NAV_BLOCK_CALL_FLD", getFormModel().getGNavBlock().getCallFld());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							wrkObjt = results1.getStr(0);
						}
						results1.close();
						// 
						if ( notIn(wrkObjt, "MENU", "MESSAGE").getValue() )
						{
							executeAction("GLO_INIT_ROUTINE");
							getTask().getGoqrpls().gCheckFailure();
							// 
							if ( getFormModel().getGNavBlock().getFormTypeInd().equals("Q") && wrkObjt.equals("FORM") )
							{
								errorMessage(GNls.Fget(toStr("PYABENE-0022"), toStr("FORM"), toStr("*ERROR* Invalid form name entered.")));
								throw new ApplicationException();
							}
						}
						// 
						setGlobal("CALLING_FORM", toStr(getCurrentTaskName()));
						// 
						//  This step will execute either a call form or a newform for the
						//  requested form if global.callfrm is null.
						//  The null check allows this step to be bypassed in the event that
						//  the product initialization form (?OQMENU) has requested that control
						//  be passed to another form.
						//  If this is the case the trigger will cycle around one more time
						//  and pass control to the form that the initialization routine
						//  requested.
						// 
						if ( getGlobal("CALLFRM").isNull() )
						{
							// 
							//  Check whether or not the user is running a Payroll or a
							//  Position control form.  If so, check to see if the 
							//  initialization form has been run.  If not, skip logic
							//  otherwise call routine to check for electronic approvals.
							// 
							if ( in(substring(getFormModel().getGNavBlock().getFormLeadingEdge(), toInt(1), toInt(1)), "N", "P").getValue() )
							{
								if ( isNull(getNameIn(getNameIn("G$_NAV_BLOCK.FORM_INIT_IND")), "N").equals("Y") )
								{
									getTask().getGoqrpls().gGetPipeMessages();
									executeAction("GET_EAWTE_MESSAGES");
								}
							}
							// 
							//  Determine the type of object we are about to call.
							// 
							if ( wrkObjt.equals("JOBS") )
							{
								setGlobal("KEY_JOB_NAME", getGlobal("NEW_FORM"));
								setGlobal("NEW_FORM", toStr("GJAPCTL"));
							}
							else if ( wrkObjt.equals("QUICKFLOW") ) {
								getTask().getGoqrpls().gQuickflow(getGlobal("NEW_FORM"));
								return ;
							}
							else if ( wrkObjt.equals("MESSAGE") ) {
								setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("PYABENE-0023"), toStr("FORM"), toStr("Please use desktop or web application to complete this activity. ").append("These applications may be accessible through your Banner toolbar.")));
								alButton = toNumber(showAlert("G$_INFO_ALERT"));
								return ;
							}
							else if ( wrkObjt.equals("MENU") ) {
								errorMessage(GNls.Fget(toStr("PYABENE-0024"), toStr("FORM"), toStr("*ERROR* Menu objects cannot be called from here.")));
								return ;
							}
							else {
							}
							// 
							//  Form call logic.
							// 
							copy("Y","GLOBAL.NAV_FRAME_CALL");
							copy("","GLOBAL.FORM_WAS_CALLED");
							//  --
							executeAction("G$_REVOKE_ACCESS");
							getTask().getGoqrpls().gCheckFailure();
							getTask().getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), getGlobal("NEW_FORM"), toStr(""));
							// 
							setGlobal("KEY_CALL_CODE", toStr(""));
							setGlobal("WIN_TITLE", toStr(""));
							setGlobal("WIN_X_POS", toStr(""));
							setGlobal("WIN_Y_POX", toStr(""));
						}
						// 
						//  This step checks to see if a form name has been placed in the
						//  GLOBAL.CALLFRM field.  If not, the trigger exits.
						//  If there is a value, then copy the form name to :KEY_BLOCK.callfld 
						//  and wipe out the global value. THEN restart the logic in this 
						//  trigger over which will pass control directly to the requested form.
						// 
						if ( !getGlobal("CALLFRM").isNull() )
						{
							getFormModel().getGNavBlock().setCallFld(getGlobal("CALLFRM"));
							setGlobal("CALLFRM", toStr(""));
						}
						
						else break;
						}
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("PYABENE-0025"), toStr("FORM"), toStr("*ERROR* Invalid object name entered.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.INIT_NEXT_SELECTION
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INIT_NEXT_SELECTION")
		public void gNavBlock_InitNextSelection()
		{
			
			getGoqolibGNavBlockController().gNavBlock_InitNextSelection();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GET_EAWTE_MESSAGES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_EAWTE_MESSAGES")
		public void gNavBlock_GetEawteMessages()
		{
			
			getGoqolibGNavBlockController().gNavBlock_GetEawteMessages();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GLO_INIT_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GLO_INIT_ROUTINE")
		public void gNavBlock_GloInitRoutine()
		{
			
			getGoqolibGNavBlockController().gNavBlock_GloInitRoutine();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gNavBlock_ClearTask()
		{
			
			getGoqolibGNavBlockController().gNavBlock_ClearTask();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gNavBlock_ClearRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_ClearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gNavBlock_Save()
		{
			
			getGoqolibGNavBlockController().gNavBlock_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gNavBlock_CreateRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_CreateRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gNavBlock_DeleteRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_DeleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void gNavBlock_MoveDown()
		{
			
			getGoqolibGNavBlockController().gNavBlock_MoveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void gNavBlock_KeyMenu()
		{
			
			getGoqolibGNavBlockController().gNavBlock_KeyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gNavBlock_NextBlock()
		{
			
			getGoqolibGNavBlockController().gNavBlock_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gNavBlock_NextRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void gNavBlock_KeyOthers()
		{
			
			getGoqolibGNavBlockController().gNavBlock_KeyOthers();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gNavBlock_PreviousBlock()
		{
			
			getGoqolibGNavBlockController().gNavBlock_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gNavBlock_PreviousRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void gNavBlock_MoveUp()
		{
			
			getGoqolibGNavBlockController().gNavBlock_MoveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GO_ITEM")
		public void goItem_doubleClick()
		{
			
			getGoqolibGNavBlockController().goItem_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GO_ITEM", function=KeyFunction.ITEM_CHANGE)
		public void goItem_itemChange()
		{
			
			getGoqolibGNavBlockController().goItem_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GO_ITEM")
		public void goItem_GSearchParameters()
		{
			
			getGoqolibGNavBlockController().goItem_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GO_ITEM")
		public void goItem_GSearchOptions()
		{
			
			getGoqolibGNavBlockController().goItem_GSearchOptions();
		}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.KEY-NEXT-ITEM
		 BEGIN
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE( G$_NLS.Get('PYABENE-0026', 'FORM','*ERROR* There are pending form changes; Commit or Rollback.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
	IF :G$_NAV_BLOCK.GO_ITEM NOT IN ('EXIT','QUIT') THEN
    G$_SEARCH.CODE_KEY_NEXT_ITEM;
    G$_CHECK_FAILURE;
  END IF;
--
  IF INSTR(:GO_ITEM,'%') >= 1 THEN
    :G$_NAV_BLOCK.GO_ITEM := '';
    RETURN;
  END IF;
--
  :GLOBAL.MENU_NAME_PARM := '';
  EXECUTE_TRIGGER('CHECK_TYPE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GO_ITEM", function=KeyFunction.NEXT_ITEM)
		public void goItem_keyNexItem()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0026"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				if ( notIn(getFormModel().getGNavBlock().getGoItem(), "EXIT", "QUIT").getValue() )
				{
					getTask().getGoqrpls().getGSearch().codeKeyNextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
				// 
				if ( inStr(getFormModel().getGNavBlock().getGoItem(), toStr("%")).greaterOrEquals(1) )
				{
					getFormModel().getGNavBlock().setGoItem(toStr(""));
					return ;
				}
				// 
				setGlobal("MENU_NAME_PARM", toStr(""));
				executeAction("CHECK_TYPE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GO_ITEM", function=KeyFunction.ITEM_OUT)
		public void goItem_itemOut()
		{
			
			getGoqolibGNavBlockController().goItem_itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.KEY-ENTER
		 BEGIN
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE( G$_NLS.Get('PYABENE-0027', 'FORM','*ERROR* There are pending form changes; Commit or Rollback.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF INSTR(:G$_NAV_BLOCK.GO_ITEM,'%') >= 1 THEN
    :G$_NAV_BLOCK.GO_ITEM := '';
    RETURN;
  END IF;
--
  EXECUTE_TRIGGER('CHECK_TYPE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER", item="GO_ITEM")
		public void goItem_KeyEnter()
		{
			
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0027"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				if ( inStr(getFormModel().getGNavBlock().getGoItem(), toStr("%")).greaterOrEquals(1) )
				{
					getFormModel().getGNavBlock().setGoItem(toStr(""));
					return ;
				}
				// 
				executeAction("CHECK_TYPE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM.KEY-LISTVAL
		 BEGIN
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('PYABENE-0028','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIOBJS','');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GO_ITEM", function=KeyFunction.LIST_VALUES)
		public void goItem_ListValues()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0028"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIOBJS"), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GO_ITEM_BTN")
		@Before
		public void goItemBtn_click()
		{
			
			getGoqolibGNavBlockController().goItemBtn_click();
		}

		
		/* Original PL/SQL code code for TRIGGER GO_ITEM_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('PYABENE-0029','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIOBJS','');
--
  IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
    COPY(:GLOBAL.MENU_NAME_PARM,'G$_NAV_BLOCK.GO_ITEM');
    :GLOBAL.MENU_NAME_PARM := '';
    GO_ITEM('G$_NAV_BLOCK.GO_ITEM');
    DO_KEY('ENTER');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GO_ITEM_BTN")
		public void goItemBtn_buttonClick()
		{
			
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0029"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIOBJS"), toStr(""));
				// 
				if ( !getGlobal("MENU_NAME_PARM").isNull() )
				{
					copy(getGlobal("MENU_NAME_PARM"),"G$_NAV_BLOCK.GO_ITEM");
					setGlobal("MENU_NAME_PARM", toStr(""));
					goItem(toStr("G$_NAV_BLOCK.GO_ITEM"));
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\PYABENEF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.SQLFORMS.DoKey("ENTER");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\PYABENEF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_MY_INSTITUTION.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_MY_INSTITUTION")
		public void urlMyInstitution_buttonClick()
		{
			
			getGoqolibGNavBlockController().urlMyInstitution_buttonClick();
		}

		
	
	
}

