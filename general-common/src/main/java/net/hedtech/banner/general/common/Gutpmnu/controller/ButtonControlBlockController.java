package net.hedtech.banner.general.common.Gutpmnu.controller;
 
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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GutpmnuTask getTask() {
		return (GutpmnuTask)super.getTask();
	}

	public GutpmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJECT_SORT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJECT_SORT_BTN")
		public void objectSortBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJECT_SORT_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
	WHICH_SORT  VARCHAR2(200):= GET_BLOCK_PROPERTY('GUBOBJS',ORDER_BY);
BEGIN
	IF WHICH_SORT = 'GUBOBJS_DESC' THEN
    SET_BLOCK_PROPERTY('GUBOBJS',ORDER_BY,'GUBOBJS_NAME');
	ELSE
    SET_BLOCK_PROPERTY('GUBOBJS',ORDER_BY,'GUBOBJS_DESC');
	END IF;
--
-- 1-HBN4V
  :FORM_HEADER.INITIAL_QUERY := 'Y';
  EXECUTE_TRIGGER('QUERY_DATA');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJECT_SORT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJECT_SORT_BTN")
		public void objectSortBtn_buttonClick()
		{
			
				{
					NString whichSort = getBlockOrderByClause("GUBOBJS");
					if ( whichSort.equals("GUBOBJS_DESC") )
					{
						setBlockOrderByClause("GUBOBJS", "GUBOBJS_NAME");
					}
					else {
						setBlockOrderByClause("GUBOBJS", "GUBOBJS_DESC");
					}
					// 
					//  1-HBN4V
					getFormModel().getFormHeader().setInitialQuery(toStr("Y"));
					executeAction("QUERY_DATA");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INSERT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="INSERT_BTN")
		public void insertBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER INSERT_BTN.WHEN-BUTTON-PRESSED
		 CHK_ENTER_MODE;
G$_CHECK_FAILURE;
--
VALIDATE(ITEM_SCOPE);
G$_CHECK_FAILURE;
--
IF :SYSTEM.CURSOR_BLOCK = 'GUBOBJS' AND 
   :SYSTEM.MODE = 'ENTER-QUERY' THEN
  RETURN;
END IF;
--
IF NOT get_multy_row_from_rec_grp('SELECTION') THEN
  MESSAGE(G$_NLS.Get('GUTPMNU-0036','FORM','*ERROR* This function is not available, '
           || 'double click on one or more objects to select them and press the insert button to add to menu.'));
  IF :hold_record IS NOT NULL THEN
    GO_RECORD(:hold_record);
  END IF;
  RETURN; 
END IF;
--
IF submenu_maintenance.Update_Standard then
  G$_MULTI_REC_SELECTION.Insert_Into_Gurmenu(SUBMENU_MAINTENANCE.Current_Block||'.GURMENU_OBJ_NAME');
  SUBMENU_MAINTENANCE.Qty_Changed_Records;
ELSE
  EXECUTE_TRIGGER('CLEAR_GROUP');
END IF;
--
IF :hold_record IS NOT NULL THEN
  GO_RECORD(:hold_record);
  :hold_record := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INSERT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="INSERT_BTN")
		public void insertBtn_buttonClick()
		{
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//validateItem(getCurrentItem());
				validateItem(getCurrentBlock()+"."+getCurrentItem());
				
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getCursorBlock().equals("GUBOBJS") && getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				
				if ( this.getTask().getServices().getMultyRowFromRecGrp(toStr("SELECTION")).not() )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0036"), toStr("FORM"), toStr("*ERROR* This function is not available, ").append("double click on one or more objects to select them and press the insert button to add to menu.")));
					if ( !getFormModel().getFormHeader().getHoldRecord().isNull() )
					{
						setCurrentRecord(getFormModel().getFormHeader().getHoldRecord());
					}
					return ;
				}
				// 
				if(getViewVisible("GURMENU_CANVAS").isTrue())
					goBlock("GURMENU");
				else if(getViewVisible("GURMENU2_CANVAS").isTrue())
					goBlock("GURMENU2");

				if ( getTask().getSubmenuMaintenance().updateStandard().getValue() )
				{	
				//	getTask().getGoqgmnu().getGMultiRecSelection().insertIntoGurmenu(ServiceEventContext.ExecutionContext.CurrentBlock.append(".GURMENU_OBJ_NAME"));				
					//Adicionado
					getTask().getGoqgmnu().getGMultiRecSelection().insertIntoGurmenu(getCurrentBlock().append(".GURMENU_OBJ_NAME"));
					
					getTask().getSubmenuMaintenance().qtyChangedRecords();
				}
				else {
					executeAction("CLEAR_GROUP");
				}
				// 
				if ( !getFormModel().getFormHeader().getHoldRecord().isNull() )
				{
					setCurrentRecord(getFormModel().getFormHeader().getHoldRecord());
					getFormModel().getFormHeader().setHoldRecord(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DELETE_BTN")
		public void deleteBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_BTN.WHEN-BUTTON-PRESSED
		 CHK_ENTER_MODE;
G$_CHECK_FAILURE;
--
VALIDATE(ITEM_SCOPE);
G$_CHECK_FAILURE;
--
IF :SYSTEM.CURSOR_BLOCK = 'GUBOBJS' AND 
   :SYSTEM.MODE = 'ENTER-QUERY' THEN
  RETURN;
END IF;
--
IF NOT get_multy_row_from_rec_grp('DELETE') THEN
  MESSAGE(G$_NLS.Get('GUTPMNU-0037','FORM','*ERROR* This function is not available, '
           || 'double click on one or more objects to select them and press the delete button to remove from menu.'));
  RETURN;
END IF;
--
IF SUBMENU_MAINTENANCE.Update_Standard THEN
  G$_MULTI_REC_SELECTION.Delete_From_Gurmenu(SUBMENU_MAINTENANCE.Current_Block||'.GURMENU_OBJ_NAME');
  SUBMENU_MAINTENANCE.Qty_Changed_Records;
ELSE
  EXECUTE_TRIGGER('CLEAR_GROUP');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DELETE_BTN")
		public void deleteBtn_buttonClick()
		{
			
//			if(getViewVisible("GURMENU_CANVAS").isTrue())
//				goBlock("GURMENU");
//			else if(getViewVisible("GURMENU2_CANVAS").isTrue())
//				goBlock("GURMENU2");
			//Adicionado
//			getTask().getGoqgmnu().getGMultiRecSelection().insertIntoGurmenu(getCurrentBlock().append(".GURMENU_OBJ_NAME"));
			
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				
				validateCurrentItem();
				getTask().getGoqrpls().gCheckFailure();
				if ( getCursorBlock().equals("GUBOBJS") && getMode().equals("ENTER-QUERY") )
				{
					return ;
				}
				// 
				if ( this.getTask().getServices().getMultyRowFromRecGrp(toStr("DELETE")).not() )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0037"), toStr("FORM"), toStr("*ERROR* This function is not available, ").append("double click on one or more objects to select them and press the delete button to remove from menu.")));
					return ;
				}			
				
				if ( getTask().getSubmenuMaintenance().updateStandard().getValue() )
				{
					
					//getTask().getGoqgmnu().getGMultiRecSelection().deleteFromGurmenu(ServiceEventContext.ExecutionContext.CurrentBlock.append(".GURMENU_OBJ_NAME"));
					//Adicionado
					getTask().getGoqgmnu().getGMultiRecSelection().deleteFromGurmenu(getCurrentBlock().append(".GURMENU_OBJ_NAME"));
					
					getTask().getSubmenuMaintenance().qtyChangedRecords();
				}
				else {
					executeAction("CLEAR_GROUP");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INSERT_ALL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="INSERT_ALL_BTN")
		public void insertAllBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER INSERT_ALL_BTN.WHEN-BUTTON-PRESSED
		 CHK_ENTER_MODE;
G$_CHECK_FAILURE;
--
VALIDATE(ITEM_SCOPE);
G$_CHECK_FAILURE;
--
declare
 rg_name VARCHAR2(10):= 'SELECTION';
 rg_id   RecordGroup := Find_Group(rg_name);
--
 al_msg  VARCHAR2(150):= G$_NLS.Get('GUTPMNU-0038','FORM','Operation can not be complete with more than 20 records.Change your Query condition and try again.');
 al_btn  NUMBER;
begin
--
 if :system.cursor_block = 'GUBOBJS' and 
    :system.mode = 'ENTER-QUERY' then
   return;
 end if;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('GUTPMNU-0039','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
 go_block('GUBOBJS');
 if :SYSTEM.MODE <> 'ENTER_QUERY' then
   IF Get_Block_Property(:SYSTEM.CURSOR_BLOCK,QUERY_HITS)< 20 THEN
     if NOT Id_Null(rg_id) then
       DELETE_GROUP_ROW(rg_name,ALL_ROWS);
     end if;
     first_record;
     loop
       if :system.last_record <> 'TRUE' then
         G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE(rg_name);
         next_record;
       else
         EXIT;
       end if;
     end loop;
     G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE(rg_name);
     go_block('GURMENU');
     G$_MULTI_REC_SELECTION.INSERT_INTO_GURMENU('GURMENU.GURMENU_OBJ_NAME');
     last_record;
     first_record;
   ELSE
     SET_ALERT_PROPERTY('ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
     al_btn := SHOW_ALERT('ALERT');  
   END IF; 
 end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * INSERT_ALL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="INSERT_ALL_BTN")
		public void insertAllBtn_buttonClick()
		{
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//validateItem(getCurrentItem());
				validateCurrentItem();
				getTask().getGoqrpls().gCheckFailure();
				{
					NString rgName = toStr("SELECTION");
					ValueSet rgId = findGroup(rgName);
					// 
					NString alMsg = GNls.Fget(toStr("GUTPMNU-0038"), toStr("FORM"), toStr("Operation can not be complete with more than 20 records.Change your Query condition and try again."));
					NNumber alBtn= NNumber.getNull();
					// 
					if ( getCursorBlock().equals("GUBOBJS") && getMode().equals("ENTER-QUERY") )
					{
						return ;
					}
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GUTPMNU-0039"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
						throw new ApplicationException();
					}
					// 
					goBlock(toStr("GUBOBJS"));
					if ( !getMode().equals("ENTER_QUERY") )
					{
						if ( getBlockQueryHits(getCursorBlock()).lesser(20) )
						{
							if ( !(rgId == null) )
							{
								deleteGroupRow(rgName.getValue(), ValueSet.ALL_ROWS);
							}
							firstRecord();
							while (true) {
								if ( !isInLastRecord() )
								{
									getTask().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(rgName);
									nextRecord();
								}
								else {
										break;
								}
							}
							getTask().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(rgName);
							goBlock(toStr("GURMENU"));
							getTask().getGoqgmnu().getGMultiRecSelection().insertIntoGurmenu(toStr("GURMENU.GURMENU_OBJ_NAME"));
							lastRecord();
							firstRecord();
						}
						else {
							setAlertMessageText("ALERT", alMsg);
							alBtn = toNumber(showAlert("ALERT"));
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_ALL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DELETE_ALL_BTN")
		public void deleteAllBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_ALL_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
  rg_name         VARCHAR2(10):= 'DELETE';
  rg_id           RecordGroup := FIND_GROUP(rg_name);
  cursor_block    VARCHAR2(30):= :SYSTEM.CURSOR_BLOCK;
BEGIN
  CHK_ENTER_MODE;
  G$_CHECK_FAILURE;
--
  VALIDATE(ITEM_SCOPE);
  G$_CHECK_FAILURE;
--
  IF :SYSTEM.CURSOR_BLOCK = 'GUBOBJS' AND 
     :SYSTEM.MODE = 'ENTER-QUERY' THEN
    RETURN;
  END IF;
--
  IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('GUTPMNU-0040','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF NOT ID_NULL(rg_id) THEN
    DELETE_GROUP_ROW(rg_name,ALL_ROWS);
  END IF;
--
  FIRST_RECORD;
  G$_CHECK_FAILURE;
--
  LOOP
    IF NAME_IN(cursor_block || '.DISPLAY_DESC') IS NOT NULL AND 
    	 NAME_IN(cursor_block || '.GURMENU_OBJ_NAME') IS NOT NULL THEN
      G$_MULTI_REC_SELECTION.MULTI_RECORD_CHOICE(rg_name,cursor_block || '.GURMENU_OBJ_NAME',
                                                         cursor_block || '.GURMENU_COUNT');
--
      IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
        EXIT;
      ELSE
        NEXT_RECORD;
        G$_CHECK_FAILURE;
      END IF;
    END IF;
  END LOOP;
--
  G$_MULTI_REC_SELECTION.DELETE_FROM_GURMENU(cursor_block || '.GURMENU_OBJ_NAME');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_ALL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DELETE_ALL_BTN")
		public void deleteAllBtn_buttonClick()		
				{
					NString rgName = toStr("DELETE");
					ValueSet rgId = findGroup(rgName);
					NString cursorBlock = getCursorBlock();
					this.getTask().getServices().chkEnterMode();
					getTask().getGoqrpls().gCheckFailure();
		

					validateCurrentItem();
					
					getTask().getGoqrpls().gCheckFailure();
					// 
					if ( getCursorBlock().equals("GUBOBJS") && getMode().equals("ENTER-QUERY") )
					{
						return ;
					}
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GUTPMNU-0040"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
						throw new ApplicationException();
					}
					// 
					if ( !(rgId == null) )
					{
						deleteGroupRow(rgName.getValue(), ValueSet.ALL_ROWS);
					}
					// 
					firstRecord();
					getTask().getGoqrpls().gCheckFailure();
					// 
					while (true) {
						
						if ( !getNameIn(cursorBlock.append(".DISPLAY_DESC")).isNull() && !getNameIn(cursorBlock.append(".GURMENU_OBJ_NAME")).isNull() )					
						{
							getTask().getGoqgmnu().getGMultiRecSelection().multiRecordChoice(rgName, cursorBlock.append(".GURMENU_OBJ_NAME"), cursorBlock.append(".GURMENU_COUNT"));
							// 
							if ( isInLastRecord() )
							{
									break;
							}
							else {
								nextRecord();
								getTask().getGoqrpls().gCheckFailure();
							}
						}
					}
					// 
					getTask().getGoqgmnu().getGMultiRecSelection().deleteFromGurmenu(cursorBlock.append(".GURMENU_OBJ_NAME"));
				}
		
			
			

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ALL_USERS_BTN")
		public void allUsersBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ALL_USERS_BTN.WHEN-BUTTON-PRESSED
		 CHK_ENTER_MODE;
G$_CHECK_FAILURE;
--
VALIDATE(ITEM_SCOPE);
G$_CHECK_FAILURE;
--
IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
  MESSAGE(G$_NLS.Get('GUTPMNU-0041','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
  RAISE FORM_TRIGGER_FAILURE;
END IF;
--
:NAVIGATE_FLAG := 'Y';
EXECUTE_TRIGGER('KEY-CQUERY');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALL_USERS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		//Cabanas
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ALL_USERS_BTN")
		public void allUsersBtn_buttonClick()
		{
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//validateItem(getCurrentItem());
				validateCurrentItem();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0041"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				getFormModel().getFormHeader().setNavigateFlag(toStr("Y"));
				executeAction("KEY-CQUERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="COPY_BTN")
		public void copyBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COPY_BTN.WHEN-BUTTON-PRESSED
		 CHK_ENTER_MODE;
G$_CHECK_FAILURE;
--
VALIDATE(ITEM_SCOPE);
G$_CHECK_FAILURE;
--
IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
  MESSAGE(G$_NLS.Get('GUTPMNU-0042','FORM','*ERROR* There are pending form changes; Commit or Rollback.'));
  RAISE FORM_TRIGGER_FAILURE;
END IF;
--
EXECUTE_TRIGGER('KEY-NXTKEY');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COPY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COPY_BTN")
		public void copyBtn_buttonClick()
		{
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				// 
//				validateItem(getCurrentItem());
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("GUTPMNU-0042"), toStr("FORM"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
					throw new ApplicationException();
				}
				// 
				executeAction("KEY-NXTKEY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="CANCEL_BTN")
		public void cancelBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER CANCEL_BTN.WHEN-BUTTON-PRESSED
		 chk_enter_mode;
g$_check_failure;
--
EXECUTE_TRIGGER('OPTION_MAIN');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CANCEL_BTN")
		public void cancelBtn_buttonClick()
		{
			
				this.getTask().getServices().chkEnterMode();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("OPTION_MAIN");
			}

		
	
	
}

