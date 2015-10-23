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

//import com.ellucian.forms.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	

import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
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
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
				getGKeyBlockClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_MoveUp()
		{
			
				getGKeyBlockClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_MoveDown()
		{
			
				getGKeyBlockClass().moveDown();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
				getGKeyBlockClass().createRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
				getGKeyBlockClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
				getGKeyBlockClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
				getGKeyBlockClass().executeQuery();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
				getGKeyBlockClass().nextRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
				getGKeyBlockClass().keyNxtset();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 <multilinecomment>BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
  G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK;
  G$_CHECK_FAILURE;
END; </multilinecomment>
next_block;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				// BEGIN
				// EXECUTE_TRIGGER('CHECK_KEYS');
				// G$_CHECK_FAILURE;
				// G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK;
				// G$_CHECK_FAILURE;
				// END; 
				// BEGIN
				// EXECUTE_TRIGGER('CHECK_KEYS');
				// G$_CHECK_FAILURE;
				// G$_GOQOLIB_KEY_TRIGGER.KEY_NXTBLK;
				// G$_CHECK_FAILURE;
				// END; 
				nextBlock();
			}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous
		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
				getGKeyBlockClass().previousBlock();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
				getGKeyBlockClass().previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.PRE-INSERT
		 :frbprop_user_id := 'HANCUSR';
:frbprop_activity_date := sysdate;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
/* F2N_WARNING: this method is commented because it matches a model event in a business object without a data layer representation
		@BeforeRowInsert
		public void keyBlock_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setFrbpropUserId(toStr("HANCUSR"));
				frbpropElement.setFrbpropActivityDate(NDate.getNow());
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.PRE-UPDATE
		 :frbprop_user_id := 'HANCUSR';
:frbprop_activity_date := sysdate;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
/* F2N_WARNING: this method is commented because it matches a model event in a business object without a data layer representation
		@BeforeRowUpdate
		public void keyBlock_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setFrbpropUserId(toStr("HANCUSR"));
				frbpropElement.setFrbpropActivityDate(NDate.getNow());
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 
:CHECK_KEYS := 'Y';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getFormModel().getFormHeader().setCheckKeys(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-OTHERS
		 execute_trigger('INVALID_FUNCTION_MSG');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void keyBlock_KeyOthers()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-LISTVAL
		 do_key('LIST_VALUES');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void keyBlock_ListValues()
		{
			
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBPROP_CODE.KEY-LISTVAL
		 BEGIN
   G$_COPY_FLD_ATTR;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
--
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:global.CURRENT_USER1, 'FRIPROP','QUERY');
--
   :GLOBAL.FORM_WAS_CALLED := 'N';
--
   G$_RESET_GLOBAL;
   G$_CHECK_FAILURE;
--
--message(':GLOBAL.VALUE is '||:GLOBAL.VALUE);
   IF :GLOBAL.VALUE IS NOT NULL THEN
--message('will assign');
      :DISPLAY_FRBPROP_CODE := :GLOBAL.VALUE;
--message(':DISPLAY_FRBPROP_CODE is '||:DISPLAY_FRBPROP_CODE);
      :GLOBAL.VALUE := '';
   END IF;
--message('after IF');
SYNCHRONIZE;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBPROP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="DISPLAY_FRBPROP_CODE", function=KeyFunction.LIST_VALUES)
		public void displayFrbpropCode_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				// 
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIPROP"), toStr("QUERY"));
				// 
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				// 
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				// 
				// message(':GLOBAL.VALUE is '||:GLOBAL.VALUE);
				if ( !getGlobal("VALUE").isNull() )
				{
					// message('will assign');
					getFormModel().getKeyBlock().setDisplayFrbpropCode(getGlobal("VALUE"));
					// message(':DISPLAY_FRBPROP_CODE is '||:DISPLAY_FRBPROP_CODE);
					setGlobal("VALUE", toStr(""));
				}
				// message('after IF');
				// F2J_TO_REMOVE *: Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBPROP_CODE.POST-TEXT-ITEM
		 <multilinecomment>   IF :HOLD_PRESS = 'Y' THEN
     RETURN;
   END IF; 
      IF :DISPLAY_FRBPROP_CODE IS NULL THEN
      MESSAGE('Proposal Code must be entered.');
      RAISE FORM_TRIGGER_FAILURE;
   END IF;  </multilinecomment>
   null;
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBPROP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="DISPLAY_FRBPROP_CODE", function=KeyFunction.ITEM_OUT)
		public void displayFrbpropCode_itemOut()
		{
			
				//    IF :HOLD_PRESS = 'Y' THEN
				// RETURN;
				// END IF;
				// IF :DISPLAY_FRBPROP_CODE IS NULL THEN
				// MESSAGE('Proposal Code must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;  
				//    IF :HOLD_PRESS = 'Y' THEN
				// RETURN;
				// END IF;
				// IF :DISPLAY_FRBPROP_CODE IS NULL THEN
				// MESSAGE('Proposal Code must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;  
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBPROP_CODE.KEY-CQUERY
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.CURRENT_USER1,'FRIKPRO','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
IF :GLOBAL.VALUE IS NOT NULL THEN
   :DISPLAY_FRBPROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBPROP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="DISPLAY_FRBPROP_CODE", function=KeyFunction.COUNT_QUERY)
		public void displayFrbpropCode_TotalResults()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIKPRO"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getKeyBlock().setDisplayFrbpropCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
	
	
}

