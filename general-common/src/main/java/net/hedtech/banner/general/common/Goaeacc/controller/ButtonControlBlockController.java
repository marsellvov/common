package net.hedtech.banner.general.common.Goaeacc.controller;
 
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

import net.hedtech.banner.general.common.Goaeacc.model.*;
import net.hedtech.banner.general.common.Goaeacc.*;
import net.hedtech.banner.general.common.Goaeacc.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoaeaccTask getTask() {
		return (GoaeaccTask)super.getTask();
	}

	public GoaeaccModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC_USERNAME_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBEACC_USERNAME_LBT")
		public void gobeaccUsernameLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GOBEACC_USERNAME_LBT.WHENBUTTONPRESSED
		   go_item('gobeacc.gobeacc_username');
  LIST_VALUES;
  <multilinecomment>
  G$_KEY_OPT_MENU('GOBEACC_USERNAME',
                  G$_NLS.Get('GOAEACC-0024', 'FORM','VBS Users') ,'LIST_VALUES',
                 G$_NLS.Get('GOAEACC-0026', 'FORM','Oracle Users') ,'COUNT_QUERY','','','','');
	
    </multilinecomment>          
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBEACC_USERNAME_LBT.WHENBUTTONPRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHENBUTTONPRESSED", item="GOBEACC_USERNAME_LBT")
		public void gobeaccUsernameLbt_Whenbuttonpressed()
		{
			
				goItem(toStr("gobeacc.gobeacc_username"));
				listValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="WACS_ID_LBT")
		public void wacsIdLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER WACS_ID_LBT.WHEN-BUTTON-PRESSED
		 -- 54-1 add code to provide Option List Window display and
--      access to GUIALTI form
GO_ITEM('GOBEACC.WACS_ID');
G$_KEY_OPT_MENU
('GOBEACC.WACS_ID',
  G$_NLS.Get('GOAEACC-0010', 'FORM','Valid Banner ID (SOAIDEN)') ,'LIST_VALUES',
  G$_NLS.Get('GOAEACC-0011', 'FORM','Alternate ID Search (GUIALTI)') ,'COUNT_QUERY',
 '','','','');
 G$_CHECK_FAILURE;
-- DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WACS_ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="WACS_ID_LBT")
		public void wacsIdLbt_buttonClick()
		{
			
				//  54-1 add code to provide Option List Window display and
				//       access to GUIALTI form
				//  54-1 add code to provide Option List Window display and
				//       access to GUIALTI form
				goItem(toStr("GOBEACC.WACS_ID"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("GOBEACC.WACS_ID"), GNls.Fget(toStr("GOAEACC-0010"), toStr("FORM"), toStr("Valid Banner ID (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAEACC-0011"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBVUSR_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBVUSR_EXIT_BTN")
		public void gobvusrExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBVUSR_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBVUSR_SAVE_BTN")
		public void gobvusrSaveBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOBVUSR_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOBVUSR_ROLLBACK_BTN")
		public void gobvusrRollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
	
	
}

