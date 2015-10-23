package net.hedtech.general.common.libraries.Aoqclib.controller;
 
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
import net.hedtech.general.common.libraries.Aoqclib.model.*;
import net.hedtech.general.common.libraries.Aoqclib.*;
import net.hedtech.general.common.libraries.Aoqclib.services.*;

		
public class AuralrtController extends AbstractSupportCodeObject {


	
	public AuralrtController(ITask task) {
		super(task);
	}
	
	
	@Override
	public AoqclibTaskPart getContainer() {
		return (AoqclibTaskPart)super.getContainer();
	}
	
	
	public AoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}	
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AURALRT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

//		@BeforeQuery
//		public void auralrt_BeforeQuery(QueryEvent args)
//		{
//			
//               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_PIDM", ));             
//
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_CURRENT_USER", getGlobal("CURRENT_USER")));             
//
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("CURRENT_FORM", ));             
//
//
//           
//               }

		
		/* Original PL/SQL code code for TRIGGER USER_ALERTS_BTN.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERTS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="USER_ALERTS_BTN")
		@Before
		public void userAlertsBtn_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERTS_BTN.WHEN-BUTTON-PRESSED
		   EXECUTE_TRIGGER( 'A$_SHOW_USER_ALERTS' ) ;
  G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERTS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="USER_ALERTS_BTN")
		public void userAlertsBtn_buttonClick()
		{
			
				executeAction("A$_SHOW_USER_ALERTS");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERT_CLOSE_BTN.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERT_CLOSE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="USER_ALERT_CLOSE_BTN")
		@Before
		public void userAlertCloseBtn_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERT_CLOSE_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
  GO_ITEM(NAME_IN('CALLED_FROM_ITEM'));

--Begin defect#1-GDAIT9 added code
	SET_ITEM_PROPERTY('AURALRT.AURALRT_MESSAGE',NAVIGABLE,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('AURALRT.USER_ALERT_CLOSE_BTN',ENABLED,PROPERTY_FALSE);
--End defect#1-GDAIT9 added code
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERT_CLOSE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="USER_ALERT_CLOSE_BTN")
		public void userAlertCloseBtn_buttonClick()
		{
			
				goItem(getNameIn("CALLED_FROM_ITEM"));
				// Begin defect#1-GDAIT9 added code
				setItemNavigable("AURALRT.AURALRT_MESSAGE", false);
				setItemEnabled("AURALRT.USER_ALERT_CLOSE_BTN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERT_CLOSE_BTN.KEY-CLRFRM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERT_CLOSE_BTN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", item="USER_ALERT_CLOSE_BTN", function=KeyFunction.CLEAR_FORM)
		public void userAlertCloseBtn_ClearTask()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERT_CLOSE_BTN.KEY-CLRBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERT_CLOSE_BTN.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="USER_ALERT_CLOSE_BTN", function=KeyFunction.CLEAR_BLOCK)
		public void userAlertCloseBtn_keyClearBlock()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER USER_ALERT_CLOSE_BTN.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * USER_ALERT_CLOSE_BTN.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="USER_ALERT_CLOSE_BTN", function=KeyFunction.SAVE)
		public void userAlertCloseBtn_Save()
		{
			
			getContainer().getGoqrpls().gInvalidFunctionMsg();
			}

		
	
	
}

