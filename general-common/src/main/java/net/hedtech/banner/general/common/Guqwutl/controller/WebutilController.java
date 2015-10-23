package net.hedtech.banner.general.common.Guqwutl.controller;
 
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
//import net.hedtech.general.common.libraries.Webutil.*;

import net.hedtech.banner.general.common.Guqwutl.model.*;
import net.hedtech.banner.general.common.Guqwutl.*;
import net.hedtech.banner.general.common.Guqwutl.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class WebutilController extends DefaultBlockController {


	
	public WebutilController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuqwutlTask getTask() {
		return (GuqwutlTask)super.getTask();
	}

	public GuqwutlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER DUMMY.WHEN-BUTTON-PRESSED
		 if :system.cursor_block = 'WEBUTIL' then 
	next_block;
end if;
WebUtil_Core.ShowBeans(false);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DUMMY.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DUMMY")
//		public void dummy_buttonClick()
//		{
//			
//				if ( getCursorBlock().equals("WEBUTIL") )
//				{
//					nextBlock();
//				}
//				getTask().getWebutil().getWebutilCore().showbeans(toBool(NBool.False));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_CLIENTINFO_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_CLIENTINFO_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilClientinfoFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_FILE_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_FILE_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilFileFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_HOST_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_HOST_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilHostFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_SESSION_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_SESSION_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/
//
//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilSessionFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_FILETRANSFER_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_FILETRANSFER_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilFiletransferFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_OLE_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_OLE_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilOleFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_C_API_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_C_API_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilCApiFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
		/* Original PL/SQL code code for TRIGGER WEBUTIL_BROWSER_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 begin
  WEBUTIL_CORE.CustomEventHandler(:SYSTEM.CUSTOM_ITEM_EVENT,:SYSTEM.CUSTOM_ITEM_EVENT_PARAMETERS);
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WEBUTIL_BROWSER_FUNCTIONS.WHEN-CUSTOM-ITEM-EVENT
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="WHEN-CUSTOM-ITEM-EVENT")
//		public void webutilBrowserFunctions_WhenCustomItemEvent()
//		{
//			
//				getTask().getWebutil().getWebutilCore().customeventhandler(toStr(SupportClasses.AppContext.CustomItemEvent), toStr(SupportClasses.AppContext.CustomItemEventParameters));
//			}

		
	
	
}

