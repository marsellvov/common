package net.hedtech.banner.finance.common.Fragrnt.controller;
 
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Fragrnt.model.*;
import net.hedtech.banner.finance.common.Fragrnt.*;
import net.hedtech.banner.finance.common.Fragrnt.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class CopyBlockController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public CopyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FragrntTask getTask() {
		return (FragrntTask)super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER COPY_BLOCK.KEY-COMMIT
		 --EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ;  --87303 same logic is executed in trigger 'edit_from_to_info'.
--G$_CHECK_FAILURE ;

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
			
				// EXECUTE_TRIGGER( 'EDIT_ORGN_SECURITY' ) ;  --87303 same logic is executed in trigger 'edit_from_to_info'.
				// G$_CHECK_FAILURE ;
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
  GO_BLOCK('frbgrnt');
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
				goBlock(toStr("frbgrnt"));
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="COPY_GRNT_CODE")
		public void copyGrntCode_WhenMouseDoubleclick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="COPY_GRNT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void copyGrntCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="COPY_GRNT_CODE")
		public void copyGrntCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="COPY_GRNT_CODE", function=KeyFunction.NEXT_ITEM)
		public void copyGrntCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="COPY_GRNT_CODE", function=KeyFunction.ITEM_OUT)
		public void copyGrntCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRBGRNT_CODE','FRBGRNT_TITLE','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="COPY_GRNT_CODE")
		public void copyGrntCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRBGRNT_CODE"), toStr("FRBGRNT_TITLE"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT_CODE.KEY-LISTVAL
		 BEGIN
HIDE_WINDOW('COPY_GRNT');
G$_COPY_FLD_ATTR;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIGRNT','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
   :COPY_GRNT_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
END;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="COPY_GRNT_CODE", function=KeyFunction.LIST_VALUES)
		public void copyGrntCode_ListValues()
		{
			
				hideWindow("COPY_GRNT");
				getTask().getGoqrpls().gCopyFldAttr();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIGRNT"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getCopyBlock().setCopyGrntCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT_CODE.KEY-CQUERY
		 HIDE_WINDOW('COPY_GRNT');
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIKGNT','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
IF :GLOBAL.VALUE IS NOT NULL THEN
   :COPY_GRNT_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="COPY_GRNT_CODE", function=KeyFunction.COUNT_QUERY)
		public void copyGrntCode_TotalResults()
		{
			
				hideWindow("COPY_GRNT");
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIKGNT"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getCopyBlock().setCopyGrntCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_GRNT_CODE.WHEN-VALIDATE-ITEM
		 IF NOT SELECT_frbgrnt_1(:COPY_GRNT_CODE) THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0231', 'FORM','Invalid Grant Code; LIST is available.') );
   Raise Form_Trigger_Failure;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_GRNT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="COPY_GRNT_CODE")
		public void copyGrntCode_validate()
		{
			
				if ( this.getTask().getServices().selectFrbgrnt1(getFormModel().getCopyBlock().getCopyGrntCode()).not() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0231"), toStr("FORM"), toStr("*ERROR* Invalid Grant Code; LIST is available.")));
					throw new ApplicationException();
				}
			}

		
	
	
}

