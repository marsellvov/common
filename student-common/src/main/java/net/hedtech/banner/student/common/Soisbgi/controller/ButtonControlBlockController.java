package net.hedtech.banner.student.common.Soisbgi.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.student.common.Soisbgi.model.*;
import net.hedtech.banner.student.common.Soisbgi.*;
import net.hedtech.banner.student.common.Soisbgi.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ButtonControlBlockController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoisbgiTask getTask() {
		return (SoisbgiTask)super.getTask();
	}

	public SoisbgiModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_EXIT_BTN")
		@Before
		public void stvsbgi1ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_SOASBGI_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_SOASBGI_BTN")
		@Before
		public void stvsbgi1SoasbgiBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER STVSBGI_1_SOASBGI_BTN.WHEN-BUTTON-PRESSED
		 <multilinecomment>
   :GLOBAL.KEY_SBGI := :STVSBGI_CODE ;
--
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOASBGI','QUERY');
G$_RESET_GLOBAL;
</multilinecomment>

do_key('HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_SOASBGI_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVSBGI_1_SOASBGI_BTN")
		public void stvsbgi1SoasbgiBtn_buttonClick()
		{
			
				// :GLOBAL.KEY_SBGI := :STVSBGI_CODE ;
				// --
				// G$_COPY_FLD_ATTR;
				// EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
				// G$_CHECK_FAILURE;
				// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOASBGI','QUERY');
				// G$_RESET_GLOBAL;
				// :GLOBAL.KEY_SBGI := :STVSBGI_CODE ;
				// --
				// G$_COPY_FLD_ATTR;
				// EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
				// G$_CHECK_FAILURE;
				// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOASBGI','QUERY');
				// G$_RESET_GLOBAL;
				executeAction(KeyFunction.HELP);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_ENTQRY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_ENTQRY_BTN")
		@Before
		public void stvsbgi1EntqryBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DISPLAY_STAT_CODE_LBT")
		@Before
		public void displayStatCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_ADMR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_ADMR_CODE_LBT")
		@Before
		public void stvsbgiAdmrCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_EXITVALUE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_EXITVALUE_BTN")
		@Before
		public void stvsbgi1ExitvalueBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_EXEQRY_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_EXEQRY_BTN")
		@Before
		public void stvsbgi1ExeqryBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER STVSBGI_1_EXEQRY_BTN.WHEN-BUTTON-PRESSED
		 if :system.mode = 'ENTER-QUERY' then
    do_key('EXECUTE_QUERY');
else
    do_key('ENTER_QUERY');
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_EXEQRY_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="STVSBGI_1_EXEQRY_BTN")
		public void stvsbgi1ExeqryBtn_buttonClick()
		{
			
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction(KeyFunction.EXECUTE_QUERY);
				}
				else {
					executeAction(KeyFunction.SEARCH);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSBGI_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="STVSBGI_1_ROLLBACK_BTN")
		@Before
		public void stvsbgi1RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOVSBGV_STAT_CODE_LBT")
		@Before
		public void sovsbgvStatCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVSBGV_ADMR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOVSBGV_ADMR_CODE_LBT")
		@Before
		public void sovsbgvAdmrCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
	
	
}

