package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.ItemDescriptor;
import morphis.foundations.core.types.*;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
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
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GSdkeyController extends DefaultBlockController {

	public GSdkeyController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}	
		
		
		
	public BaseTask getTask() {
		return (BaseTask)super.getTask();
	}

			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOVSDAV_VALUE_AS_CHAR_LBT")
		public void govsdavValueAsCharLbt_click()
		{
			
				//goqolibFormController.gFlashliteBtnClass_click();
			}

		
		/* Original PL/SQL code code for TRIGGER SDE_CLOSE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  G$_SD.p_close_sde_form(p_delayed=>FALSE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SDE_CLOSE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SDE_CLOSE_BTN")
		public void sdeCloseBtn_buttonClick()
		{
			
				getTask().getFormController().getGoqrpls().getGSd().pCloseSdeForm(/*pDelayed=>*/NBool.False);
				
			}

		/* Original PL/SQL code code for TRIGGER SDE_CLOSE_BTN.WHEN-MOUSE-CLICK
		 * BEGIN
		 *  NULL;
		 * END;
		 */		
		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SDE_CLOSE_BTN")
		public void sdeCloseBtn_click() {

		}		

		// cas ???
		
		/* Original PL/SQL code code for TRIGGER GOVSDAV_VALUE_AS_CHAR_DBT.WHEN-MOUSE-CLICK
		 BEGIN
 NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOVSDAV_VALUE_AS_CHAR_DBT")
		public void govsdavValueAsCharDbt_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GOVSDAV_VALUE_AS_CHAR_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
 ITEM_ID           ITEM;
 AL_BUT            NUMBER;
 CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
 CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
 ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
              SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
 IF ID_NULL(ITEM_ID) THEN
   MESSAGE(G$_NLS.Get('GOQOLIB-0014','FORM','*ERROR* Date button is outside the current block.'));
   RAISE FORM_TRIGGER_FAILURE;
 END IF;
 CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                        SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                          INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
 IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
   RETURN;
 END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
 IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
    (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
     NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
    (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
     GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
    (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
     GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
    (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
     GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
   GO_ITEM(CURRENT_BLOCK_FLD);
   G$_CHECK_FAILURE; 
   COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
   IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
     COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
     COPY('','GLOBAL.VALUE');
     DO_KEY('NEXT_ITEM');
   END IF;  
--
-- Protected, don't launch form.
--
 ELSE
   MESSAGE(G$_NLS.Get('GOQOLIB-0015','FORM','*ERROR* Item is protected against update.'));              
   NULL;
 END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOVSDAV_VALUE_AS_CHAR_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GOVSDAV_VALUE_AS_CHAR_DBT")
		public void govsdavValueAsCharDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("GOQOLIB-0014"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || 
						//(SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) || 
						(getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getFormController().getGoqrpls().gCheckFailure();
						copy(getCursorValue(),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getFormController().getGoqrpls().gCheckFailure();
						getTask().getFormController().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction("NEXT_ITEM");
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("GOQOLIB-0015"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}
				
	
}

