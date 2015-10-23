package net.hedtech.banner.general.common.Goamedi.controller;
 
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
import net.hedtech.banner.general.common.Goamedi.model.*;
import net.hedtech.banner.general.common.Goamedi.*;
import net.hedtech.banner.general.common.Goamedi.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.runtime.KeyBlockNavigationModel;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoamediTask getTask() {
		return (GoamediTask)super.getTask();
	}

	public GoamediModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ID_LBT")
		public void idLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ID_LBT.WHEN-BUTTON-PRESSED
		 
IF :GLOBAL.HRESYS = 'Y' THEN
   G$_KEY_OPT_MENU('KEY_BLOCK.ID',
                 G$_NLS.Get('GOAMEDI-0017', 'FORM','List for Person (SOAIDEN)') ,'LIST_VALUES',
                 G$_NLS.Get('GOAMEDI-0019', 'FORM','List for Employee   (POIIDEN)') ,'COUNT_QUERY',
                 G$_NLS.Get('GOAMEDI-0021', 'FORM','Alternate ID Search (GUIALTI)') ,'DUPLICATE_ITEM',
                '','');
ELSE
	 G$_KEY_OPT_MENU('KEY_BLOCK.ID',
                 G$_NLS.Get('GOAMEDI-0024', 'FORM','List for Person (SOAIDEN)') ,'LIST_VALUES',
                 G$_NLS.Get('GOAMEDI-0026', 'FORM','Alternate ID Search (GUIALTI)') ,'DUPLICATE_ITEM',
                '','',
                '','');
END IF;

G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ID_LBT")
		public void idLbt_buttonClick()
		{
			
				if ( getGlobal("HRESYS").equals("Y") )
				{
					getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("GOAMEDI-0017"), toStr("FORM"), toStr("List for Person (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAMEDI-0019"), toStr("FORM"), toStr("List for Employee   (POIIDEN)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("GOAMEDI-0021"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("DUPLICATE_ITEM"), toStr(""), toStr(""));
				}
				else {
					getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("GOAMEDI-0024"), toStr("FORM"), toStr("List for Person (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAMEDI-0026"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("DUPLICATE_ITEM"), toStr(""), toStr(""), toStr(""), toStr(""));
				}
				getTask().getGoqrpls().gCheckFailure();
				
				//MORPHIS: TO REMOVE when trigger execution fires on navigation and autoskip implmented
				if (getCurrentTask().getNavigationModel() instanceof KeyBlockNavigationModel)
				{
					KeyBlockNavigationModel navModel = (KeyBlockNavigationModel)getCurrentTask().getNavigationModel();
					navModel.doNavigation();
				}
				
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRMEDI_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRMEDI_1_ROLLBACK_BTN")
		public void sprmedi1RollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRMEDI_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRMEDI_1_SAVE_BTN")
		public void sprmedi1SaveBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRMEDI_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRMEDI_1_EXIT_BTN")
		public void sprmedi1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
	
	
}

