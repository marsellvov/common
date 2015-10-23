package net.hedtech.banner.finance.common.Fragrnt.controller;
 
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
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
		
import net.hedtech.general.common.services.OracleMessagesLevel;
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
	public FragrntTask getTask() {
		return (FragrntTask)super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
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
			if(getFormModel().getKeyBlock().getDisplayFrbgrntCode().isNull())
				executeAction("CHECK_KEYS");
			try{
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
			
				getGKeyBlockClass().nextBlock();
			}
			finally{
				MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
				
			}
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
		 :frbgrnt_user_id := 'HANCUSR';
:frbgrnt_activity_date := sysdate;

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
/* 
		@BeforeRowInsert
		public void keyBlock_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);


				frbgrntElement.setFrbgrntUserId(toStr("HANCUSR"));
				frbgrntElement.setFrbgrntActivityDate(NDate.getNow());
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.PRE-UPDATE
		 :frbgrnt_user_id := 'HANCUSR';
:frbgrnt_activity_date := sysdate;
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
/* 
		@BeforeRowUpdate
		public void keyBlock_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);


				frbgrntElement.setFrbgrntUserId(toStr("HANCUSR"));
				frbgrntElement.setFrbgrntActivityDate(NDate.getNow());
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'Y';

--following is for 82775.
   set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', enabled, property_on);
   set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', navigable, property_on);
   set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', update_allowed, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', enabled, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', navigable, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', update_allowed, property_on);	 
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', enabled, property_on);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', navigable, property_on);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', update_allowed, property_on);

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

		@After
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getFormModel().getFormHeader().setCheckKeys(toStr("Y"));
				// following is for 82775.
				setItemEnabled("FRBGBIL_BUD_LINE_EXCEED_IND", true);
				setItemNavigable("FRBGBIL_BUD_LINE_EXCEED_IND", true);
				setItemUpdateAllowed("FRBGBIL_BUD_LINE_EXCEED_IND", true);
				setItemEnabled("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
				setItemNavigable("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
				setItemUpdateAllowed("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
				setItemEnabled("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
				setItemNavigable("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
				setItemUpdateAllowed("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
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

//		@ActionTrigger(action="KEY-OTHERS")
//		public void keyBlock_KeyOthers()
//		{
//			
//				executeAction("INVALID_FUNCTION_MSG");
//				getTask().getGoqrpls().gCheckFailure();
//			}

		
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-COMMIT
		 BEGIN
  EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
  G$_CHECK_FAILURE;
END;
		*/
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
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.WNBI_1
		 :frbgrnt.display_pass_thru_ind := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.WNBI_1
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WNBI_1")
		public void keyBlock_Wnbi1()
		{
			

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;


				frbgrntElement.setDisplayPassThruInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.KEY-LISTVAL
		 BEGIN
G$_COPY_FLD_ATTR;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIGRNT','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
   :DISPLAY_FRBGRNT_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="DISPLAY_FRBGRNT_CODE", function=KeyFunction.LIST_VALUES)
		public void displayFrbgrntCode_ListValues()
		{
			
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
					getFormModel().getKeyBlock().setDisplayFrbgrntCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.KEY-CQUERY
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIKGNT','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
IF :GLOBAL.VALUE IS NOT NULL THEN
   :DISPLAY_FRBGRNT_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="DISPLAY_FRBGRNT_CODE", function=KeyFunction.COUNT_QUERY)
		public void displayFrbgrntCode_TotalResults()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIKGNT"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getKeyBlock().setDisplayFrbgrntCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.POST-TEXT-ITEM
		 null;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="DISPLAY_FRBGRNT_CODE", function=KeyFunction.ITEM_OUT)
		public void displayFrbgrntCode_itemOut()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.WHEN-VALIDATE-ITEM
		 SELECT_FRBGRNT_PROP(:DISPLAY_FRBGRNT_CODE);
EXECUTE_TRIGGER('CHECK_TEXT');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DISPLAY_FRBGRNT_CODE")
		public void displayFrbgrntCode_validate()
		{
			
				this.getTask().getServices().selectFrbgrntProp(getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.KEY-NEXT-ITEM
		 go_item('display_prop_code');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-NEXT-ITEM", item="DISPLAY_FRBGRNT_CODE", function=KeyFunction.NEXT_ITEM)
//		public void displayFrbgrntCode_keyNexItem()
//		{
//				goItem(toStr("display_prop_code"));
//			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_FRBGRNT_CODE.KEY-PREV-ITEM
		 go_item('display_prop_code');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_FRBGRNT_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-PREV-ITEM", item="DISPLAY_FRBGRNT_CODE", function=KeyFunction.PREVIOUS_ITEM)
//		public void displayFrbgrntCode_PreviousItem()
//		{
//			
//				goItem(toStr("display_prop_code"));
//			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE.WHEN-VALIDATE-ITEM
		 IF :DISPLAY_PROP_CODE IS NULL THEN
    RETURN;
END IF;
    IF SELECT_FRBPROP_1(:DISPLAY_PROP_CODE) THEN
        MESSAGE( G$_NLS.Get('FRAGRNT-0095', 'FORM','Proposal code is invalid; LIST is available.') );
        RAISE FORM_TRIGGER_FAILURE;
     END IF;    
--
declare
 temp_data   varchar2(9);
 cursor c1 is 
  select frbgrnt_prop_code
   from frbgrnt
     where frbgrnt_code = :display_frbgrnt_code;
begin
 if not select_frbgrnt_1(:display_frbgrnt_code) then
    return;
 end if;
 open c1;
   fetch c1 into temp_data;
   IF temp_data is null and 
      :display_prop_code is not null then
       message( G$_NLS.Get('FRAGRNT-0096', 'FORM',
	'Proposal code entered is not valid for Grant %01%' 
	,  :display_frbgrnt_code));
       RAISE FORM_TRIGGER_FAILURE;
   ELSIF temp_data is not null and
         temp_data <> :display_prop_code then
         message( G$_NLS.Get('FRAGRNT-0097', 'FORM',
	'Proposal code entered is not valid for Grant %01%' 
	,  :display_frbgrnt_code));
         RAISE FORM_TRIGGER_FAILURE;
   end if;
      
 end;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DISPLAY_PROP_CODE")
		public void displayPropCode_validate()
		{
			
				int rowCount = 0;
				if ( getFormModel().getKeyBlock().getDisplayPropCode().isNull() )
				{
					return ;
				}
				if ( this.getTask().getServices().selectFrbprop1(getFormModel().getKeyBlock().getDisplayPropCode()).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0095"), toStr("FORM"), toStr("*ERROR* Proposal code is invalid; LIST is available.")));
					throw new ApplicationException();
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 =  " SELECT frbgrnt_prop_code " +
									" FROM frbgrnt " +
									" WHERE frbgrnt_code = :DISPLAY_FRBGRNT_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						if ( this.getTask().getServices().selectFrbgrnt1(getFormModel().getKeyBlock().getDisplayFrbgrntCode()).not() )
						{
							return ;
						}
						//Setting query parameters
						c1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							tempData = c1Results.getStr(0);
						}
						if ( tempData.isNull() && !getFormModel().getKeyBlock().getDisplayPropCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0096"), toStr("FORM"), toStr("*ERROR* Proposal code entered is not valid for Grant %01%"), getFormModel().getKeyBlock().getDisplayFrbgrntCode()));
							throw new ApplicationException();
						}
						else if ( !tempData.isNull() && tempData.notEquals(getFormModel().getKeyBlock().getDisplayPropCode()) ) {
							errorMessage(GNls.Fget(toStr("FRAGRNT-0097"), toStr("FORM"), toStr("*ERROR* Proposal code entered is not valid for Grant %01%"), getFormModel().getKeyBlock().getDisplayFrbgrntCode()));
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE.KEY-LISTVAL
		 BEGIN
G$_COPY_FLD_ATTR;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIPROP','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
   :DISPLAY_PROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="DISPLAY_PROP_CODE", function=KeyFunction.LIST_VALUES)
		public void displayPropCode_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIPROP"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getKeyBlock().setDisplayPropCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE.KEY-CQUERY
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIKPRO','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
IF :GLOBAL.VALUE IS NOT NULL THEN
   :DISPLAY_PROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="DISPLAY_PROP_CODE", function=KeyFunction.COUNT_QUERY)
		public void displayPropCode_TotalResults()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIKPRO"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getGlobal("VALUE").isNull() )
				{
					getFormModel().getKeyBlock().setDisplayPropCode(getGlobal("VALUE"));
					setGlobal("VALUE", toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE.KEY-NEXT-ITEM
		 GO_ITEM('DISPLAY_FRBGRNT_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-NEXT-ITEM", item="DISPLAY_PROP_CODE", function=KeyFunction.NEXT_ITEM)
//		public void displayPropCode_keyNexItem()
//		{
//			
//				goItem(toStr("DISPLAY_FRBGRNT_CODE"));
//			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PROP_CODE.KEY-PREV-ITEM
		 GO_ITEM('DISPLAY_FRBGRNT_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PROP_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-PREV-ITEM", item="DISPLAY_PROP_CODE", function=KeyFunction.PREVIOUS_ITEM)
//		public void displayPropCode_PreviousItem()
//		{
//			
//				goItem(toStr("DISPLAY_FRBGRNT_CODE"));
//			}

		
	
	
}

