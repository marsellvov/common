package net.hedtech.banner.general.common.Guiobjs.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Guiobjs.model.*;
import net.hedtech.banner.general.common.Guiobjs.*;
import net.hedtech.banner.general.common.Guiobjs.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuiobjsTask getTask() {
		return (GuiobjsTask)super.getTask();
	}

	public GuiobjsModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_START_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUBOBJS_1_START_BTN")
		public void gubobjs1StartBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_1_START_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  EXECUTE_TRIGGER('EXIT_WITH_VALUE');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_START_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GUBOBJS_1_START_BTN")
		public void gubobjs1StartBtn_buttonClick()
		{
			
				executeAction("EXIT_WITH_VALUE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUBOBJS_1_ROLLBACK_BTN")
		public void gubobjs1RollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_1_ROLLBACK_BTN.WHEN-BUTTON-PRESSED
		 SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN',Enabled,Property_False);
SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN',Enabled,Property_False);
SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN',Enabled,Property_False);
DO_KEY('CLEAR_FORM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_ROLLBACK_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GUBOBJS_1_ROLLBACK_BTN")
		public void gubobjs1RollbackBtn_buttonClick()
		{
			
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_START_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_ROLLBACK_BTN", false);
				setItemEnabled("BUTTON_CONTROL_BLOCK.GUBOBJS_1_EXITVALUE_BTN", false);
				executeAction(KeyFunction.CLEAR_FORM);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUBOBJS_1_EXIT_BTN")
		public void gubobjs1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUBOBJS_1_EXIT_BTN.WHEN-BUTTON-PRESSED
		 SET_RECORD_PROPERTY(1,:SYSTEM.CURRENT_BLOCK,STATUS,QUERY_STATUS);
DO_KEY('EXIT_FORM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_EXIT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GUBOBJS_1_EXIT_BTN")
		public void gubobjs1ExitBtn_buttonClick()
		{
				executeAction("EXIT");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUBOBJS_1_EXITVALUE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUBOBJS_1_EXITVALUE_BTN")
		public void gubobjs1ExitvalueBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
	
	
}

