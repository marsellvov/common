package net.hedtech.banner.finance.common.Fraprop.controller;
 
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

//import com.ellucian.common.dbservices.*;
//import com.ellucian.common.dbservices.dbtypes.*;
//import net.hedtech.banner.finance.libraries.Goqwflw.*;
//import net.hedtech.banner.finance.libraries.Goqrpls.*;
//import net.hedtech.banner.finance.libraries.Foqrpls.*;
//import net.hedtech.banner.finance.libraries.Eoqrpls.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class CopyBlockController extends DefaultBlockController {


	
	public CopyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}

	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-COMMIT
		 --  EXECUTE_TRIGGER('EDIT_ORGN_SECURITY'); --87303 same logic is executed in trigger 'edit_from_to_info'.
--  G$_CHECK_FAILURE;

BEGIN
  :COPY_FUNCT_IND := 'Y';
  EXECUTE_TRIGGER('EDIT_FROM_TO_INFO');
  G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('SET_REQUIRED_ON');
  :COPY_FUNCT_IND := 'N';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void copyBlock_Save()
		{
			
				//   EXECUTE_TRIGGER('EDIT_ORGN_SECURITY'); --87303 same logic is executed in trigger 'edit_from_to_info'.
				//   G$_CHECK_FAILURE;
				getFormModel().getFormHeader().setCopyFunctInd(toStr("Y"));
				executeAction("EDIT_FROM_TO_INFO");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("SET_REQUIRED_ON");
				getFormModel().getFormHeader().setCopyFunctInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-EXIT
		 BEGIN

  CLEAR_BLOCK(NO_VALIDATE);
  GO_BLOCK('FRBPROP');
  G$_CHECK_FAILURE;
--
 EXECUTE_TRIGGER('SET_REQUIRED_ON');
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void copyBlock_Exit()
		{
			
				clearBlock(TaskServices.NO_VALIDATE);
				goBlock(toStr("FRBPROP"));
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("SET_REQUIRED_ON");
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-OTHERS
		 execute_trigger('INVALID_FUNCTION_MSG');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void copyBlock_KeyOthers()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-LISTVAL
		 DO_KEY('LIST_VALUES');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void copyBlock_ListValues()
		{
			
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-PRVBLK
		 execute_trigger('INVALID_FUNCTION_MSG');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void copyBlock_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-NXTBLK
		 execute_trigger('INVALID_FUNCTION_MSG');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void copyBlock_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_PROP_CODE.KEY-LISTVAL
		 BEGIN
--HIDE_WINDOW('COPY_PROP'); Defect #43559
--G$_COPY_FLD_ATTR;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.CURRENT_USER1,'FRIPROP','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
--G$_RESET_GLOBAL;
--G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
   :COPY_PROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
END;








		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="COPY_PROP_CODE", function=KeyFunction.LIST_VALUES)
		public void copyPropCode_ListValues()
		{
			
				// HIDE_WINDOW('COPY_PROP'); Defect #43559
				// G$_COPY_FLD_ATTR;
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIPROP"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				// G$_RESET_GLOBAL;
				// G$_CHECK_FAILURE;
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getCopyBlock().setCopyPropCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_PROP_CODE.KEY-CQUERY
		 --HIDE_WINDOW('COPY_PROP'); Defect #43559
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.CURRENT_USER1,'FRIKPRO','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
IF :GLOBAL.VALUE IS NOT NULL THEN
   :COPY_PROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="COPY_PROP_CODE", function=KeyFunction.COUNT_QUERY)
		public void copyPropCode_TotalResults()
		{
			
				// HIDE_WINDOW('COPY_PROP'); Defect #43559
				// HIDE_WINDOW('COPY_PROP'); Defect #43559
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIKPRO"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getCopyBlock().setCopyPropCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_PROP_CODE.WHEN-VALIDATE-ITEM
		 IF NOT SELECT_FRBPROP_1(:COPY_PROP_CODE) THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0163', 'FORM','Invalid Proposal Code; LIST is available.') );
   Raise Form_Trigger_Failure;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_PROP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="COPY_PROP_CODE")
		public void copyPropCode_validate()
		{
			
				if ( this.getTask().getServices().selectFrbprop1(getFormModel().getCopyBlock().getCopyPropCode()).not() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0163"), toStr("FORM"), toStr("*ERROR* Invalid Proposal Code; LIST is available.")));
					throw new ApplicationException();
				}
			}

		
	
	
}

