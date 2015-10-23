package net.hedtech.banner.general.common.Guagmnu.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.banner.general.common.Guagmnu.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuagmnuTask getTask() {
		return (GuagmnuTask)super.getTask();
	}

	public GuagmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SEARCH_BTN")
		public void searchBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SEARCH_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  DO_FORM_CALL('GUIOBJS');
--
  IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
    COPY(:GLOBAL.MENU_NAME_PARM,'KEY_BLOCK.NEXT_SELECTION');
    :GLOBAL.MENU_NAME_PARM := '';
    GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
    DO_KEY('ENTER');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SEARCH_BTN")
		public void searchBtn_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUIOBJS"));
				// 
				if ( !getGlobal("MENU_NAME_PARM").isNull() )
				{
					copy(getGlobal("MENU_NAME_PARM"),"KEY_BLOCK.NEXT_SELECTION");
					setGlobal("MENU_NAME_PARM", toStr(""));
					goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.DoKey("ENTER");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN1.KEY-NEXT-ITEM
		 NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN1.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ALERT_BTN1", function=KeyFunction.NEXT_ITEM)
		public void alertBtn1_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN1.KEY-OTHERS
		 EXECUTE_TRIGGER('YES_BTN_LOGIC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN1.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS", item="ALERT_BTN1")
		public void alertBtn1_KeyOthers()
		{
			
				executeAction("YES_BTN_LOGIC");
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN1.KEY-PREV-ITEM
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN1.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="ALERT_BTN1", function=KeyFunction.PREVIOUS_ITEM)
		public void alertBtn1_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN1.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('YES_BTN_LOGIC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN1.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ALERT_BTN1")
		public void alertBtn1_buttonClick()
		{
			
				executeAction("YES_BTN_LOGIC");
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN1.YES_BTN_LOGIC
		 DECLARE
	TYPE_OF_ALERT  VARCHAR2(10) := :GLOBAL.ALERT_GLOBAL;
BEGIN
	:GLOBAL.ALERT_GLOBAL := '';
  GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
  HIDE_WINDOW('ALERT_WINDOW');
--
-- Process messages
--
  IF TYPE_OF_ALERT = 'MSG' THEN
    DO_FORM_CALL('GUAMESG');
--
-- Process time transactions
--
  ELSIF TYPE_OF_ALERT = 'TIME' THEN
    DELETE FROM GURTKLR
     WHERE GURTKLR_USER_ID = :GLOBAL.current_user1
       AND GURTKLR_CREATOR = 'EAWTE';
--
    :SYSTEM.MESSAGE_LEVEL := 5;
  	COMMIT;
	  :SYSTEM.MESSAGE_LEVEL := 0;
--
    IF NAME_IN('GLOBAL.SELECTFRM') <> 'PHADSUM' THEN
      DO_FORM_CALL('PHADSUM');
    END IF;
--
    :KEY_BLOCK.NEXT_SELECTION := :GLOBAL.NEW_FORM;
    DO_KEY('NEXT_FIELD');
--
-- Process electronic approvals
--
  ELSIF TYPE_OF_ALERT = 'EA' THEN
    IF NAME_IN('GLOBAL.SELECTFRM') <> 'NOAAPSM' THEN
      DO_FORM_CALL('NOAAPSM');
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN1.YES_BTN_LOGIC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="YES_BTN_LOGIC", item="ALERT_BTN1")
		public void alertBtn1_YesBtnLogic()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				int rowCount = 0;
				{
					NString typeOfAlert = getGlobal("ALERT_GLOBAL");
					setGlobal("ALERT_GLOBAL", toStr(""));
					goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
					hideWindow("ALERT_WINDOW");
					// 
					//  Process messages
					// 
					if ( typeOfAlert.equals("MSG") )
					{
						this.getTask().getServices().doFormCall(messagesElement, toStr("GUAMESG"));
					}
					else if ( typeOfAlert.equals("TIME") ) {
						String sql1 = "DELETE FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = :GLOBAL_CURRENT_USER1 AND GURTKLR_CREATOR = 'EAWTE'";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
						rowCount = command1.execute();
						// 
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						commitTask();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
						// 
						if ( getNameIn("GLOBAL.SELECTFRM").notEquals("PHADSUM") )
						{
							this.getTask().getServices().doFormCall(messagesElement, toStr("PHADSUM"));
						}
						// 
						getFormModel().getKeyBlock().setNextSelection(getGlobal("NEW_FORM"));
						// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.SQLFORMS.DoKey("NEXT_FIELD");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
					else if ( typeOfAlert.equals("EA") ) {
						if ( getNameIn("GLOBAL.SELECTFRM").notEquals("NOAAPSM") )
						{
							this.getTask().getServices().doFormCall(messagesElement, toStr("NOAAPSM"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN2.KEY-NEXT-ITEM
		 NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN2.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ALERT_BTN2", function=KeyFunction.NEXT_ITEM)
		public void alertBtn2_keyNexItem()
		{
			
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN2.KEY-OTHERS
		 EXECUTE_TRIGGER('NO_BTN_LOGIC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN2.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS", item="ALERT_BTN2")
		public void alertBtn2_KeyOthers()
		{
			
				executeAction("NO_BTN_LOGIC");
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN2.KEY-PREV-ITEM
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN2.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="ALERT_BTN2", function=KeyFunction.PREVIOUS_ITEM)
		public void alertBtn2_PreviousItem()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN2.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('NO_BTN_LOGIC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN2.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ALERT_BTN2")
		public void alertBtn2_buttonClick()
		{
			
				executeAction("NO_BTN_LOGIC");
			}

		
		/* Original PL/SQL code code for TRIGGER ALERT_BTN2.NO_BTN_LOGIC
		 GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
HIDE_WINDOW('ALERT_WINDOW');
--
-- Process messages
--
IF :GLOBAL.ALERT_GLOBAL = 'MSG' THEN
	:GLOBAL.ALERT_GLOBAL := '';
--
-- Process time transactions
--
ELSIF :GLOBAL.ALERT_GLOBAL = 'TIME' THEN
	:GLOBAL.ALERT_GLOBAL := '';
  :KEY_BLOCK.NEXT_SELECTION := :GLOBAL.NEW_FORM;
  DO_KEY('NEXT_FIELD');
--
-- Process electronic approvals
--
ELSIF :GLOBAL.ALERT_GLOBAL = 'EA' THEN
	:GLOBAL.ALERT_GLOBAL := '';
END IF;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALERT_BTN2.NO_BTN_LOGIC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="NO_BTN_LOGIC", item="ALERT_BTN2")
		public void alertBtn2_NoBtnLogic()
		{
			
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
				hideWindow("ALERT_WINDOW");
				// 
				//  Process messages
				// 
				if ( getGlobal("ALERT_GLOBAL").equals("MSG") )
				{
					setGlobal("ALERT_GLOBAL", toStr(""));
				}
				else if ( getGlobal("ALERT_GLOBAL").equals("TIME") ) {
					setGlobal("ALERT_GLOBAL", toStr(""));
					getFormModel().getKeyBlock().setNextSelection(getGlobal("NEW_FORM"));
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.DoKey("NEXT_FIELD");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				else if ( getGlobal("ALERT_GLOBAL").equals("EA") ) {
					setGlobal("ALERT_GLOBAL", toStr(""));
				}
			}

		
	
	
}

