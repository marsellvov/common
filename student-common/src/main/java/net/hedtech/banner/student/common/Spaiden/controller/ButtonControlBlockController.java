package net.hedtech.banner.student.common.Spaiden.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
		
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
	public SpaidenTask getTask() {
		return (SpaidenTask)super.getTask();
	}

	public SpaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
	

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRICURR_NTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRICURR_NTYP_CODE_LBT")
		@Before
		public void spricurrNtypCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRICURR_NTYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE');
DO_KEY('LIST_VALUES');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRICURR_NTYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRICURR_NTYP_CODE_LBT")
		public void spricurrNtypCodeLbt_buttonClick()
		{
			
				goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE"));
				executeAction(KeyFunction.LIST_VALUES);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADDRESS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ADDRESS_BTN")
		@Before
		public void addressBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ADDRESS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER ('SHOW_ADDRESS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADDRESS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADDRESS_BTN")
		public void addressBtn_buttonClick()
		{
			
				executeAction("SHOW_ADDRESS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_NAME_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PREVIOUS_NAME_BTN")
		@Before
		public void previousNameBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER PREVIOUS_NAME_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER ('SHOW_PREV_ID');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_NAME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREVIOUS_NAME_BTN")
		public void previousNameBtn_buttonClick()
		{
			
				executeAction("SHOW_PREV_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOURCE_BTN")
		@Before
		public void sourceBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SOURCE_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER ('SHOW_SOURCE_1');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOURCE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOURCE_BTN")
		public void sourceBtn_buttonClick()
		{
			
				executeAction("SHOW_SOURCE_1");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LEGAL_NAME_BTN")
		@Before
		public void legalNameBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER LEGAL_NAME_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER ('SHOW_LEGAL_NAME');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LEGAL_NAME_BTN")
		public void legalNameBtn_buttonClick()
		{
			
				executeAction("SHOW_LEGAL_NAME");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LEGAL_NAME_RETURN_BTN")
		@Before
		public void legalNameReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER LEGAL_NAME_RETURN_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_ITEM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LEGAL_NAME_RETURN_BTN")
		public void legalNameReturnBtn_buttonClick()
		{
			// MORPHIS TODO GEN
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SPAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				executeAction("DUPLICATE_ITEM");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LEGAL_NAME_ROLLBACK_BTN")
		@Before
		public void legalNameRollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LEGAL_NAME_SAVE_BTN")
		@Before
		public void legalNameSaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LEGAL_NAME_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LEGAL_NAME_EXIT_BTN")
		@Before
		public void legalNameExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_SOURCE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PREVIOUS_SOURCE_BTN")
		@Before
		public void previousSourceBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER PREVIOUS_SOURCE_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('SHOW_SOURCE_2');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_SOURCE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PREVIOUS_SOURCE_BTN")
		public void previousSourceBtn_buttonClick()
		{
			
				executeAction("SHOW_SOURCE_2");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_6_RETURN_BTN")
		@Before
		public void spraddr6ReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_6_RETURN_BTN.WHEN-BUTTON-PRESSED
		 GO_FIELD('SPRADDR_ZIP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_6_RETURN_BTN")
		public void spraddr6ReturnBtn_buttonClick()
		{
			
				goField(toStr("SPRADDR_ZIP"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_6_SAVE_BTN")
		@Before
		public void spraddr6SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_6_EXIT_BTN")
		@Before
		public void spraddr6ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_6_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_6_ROLLBACK_BTN")
		@Before
		public void spraddr6RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_5_RETURN_BTN")
		@Before
		public void spraddr5ReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_5_RETURN_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_ITEM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_5_RETURN_BTN")
		public void spraddr5ReturnBtn_buttonClick()
		{
			// MORPHIS TODO GEN
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SPAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				executeAction("DUPLICATE_ITEM");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_5_ROLLBACK_BTN")
		@Before
		public void spraddr5RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_5_SAVE_BTN")
		@Before
		public void spraddr5SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_5_EXIT_BTN")
		@Before
		public void spraddr5ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_5_EXIT_BTN.WHEN-BUTTON-PRESSED
		 GO_BLOCK('SPRIDEN_CURRENT');
-- 012999  EXIT_FORM;
G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_5_EXIT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_5_EXIT_BTN")
		@After
		public void spraddr5ExitBtn_buttonClick()
		{
			
				goBlock(toStr("SPRIDEN_CURRENT"));
				//  012999  EXIT_FORM;
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
			}

		
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
		@Before
		public void idLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ID_LBT.WHEN-BUTTON-PRESSED
		 -- set_window_property ('G$_OPT_WINDOW', POSITION, 17, 4);
-- 54-1  Added third entry to present Option List Window
--       with new GUIALTI form option.
G$_KEY_OPT_MENU ('KEY_BLOCK.ID',
                  G$_NLS.Get('SPAIDEN-0022', 'FORM','Person Search') , 'LIST_VALUES',
                  G$_NLS.Get('SPAIDEN-0023', 'FORM','Non-Person Search') , 'COUNT_QUERY',
                  G$_NLS.Get('SPAIDEN-0024', 'FORM','Alternate ID Search') ,'DUPLICATE_RECORD', '','');
G$_CHECK_FAILURE;
:CHECK_KEYS:='N';
G$_CHECK_FAILURE; 

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
			
				//  set_window_property ('G$_OPT_WINDOW', POSITION, 17, 4);
				//  54-1  Added third entry to present Option List Window
				//        with new GUIALTI form option.
				//  set_window_property ('G$_OPT_WINDOW', POSITION, 17, 4);
				//  54-1  Added third entry to present Option List Window
				//        with new GUIALTI form option.
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("SPAIDEN-0022"), toStr("FORM"), toStr("Person Search")), toStr("LIST_VALUES"), GNls.Fget(toStr("SPAIDEN-0023"), toStr("FORM"), toStr("Non-Person Search")), toStr("COUNT_QUERY"), GNls.Fget(toStr("SPAIDEN-0024"), toStr("FORM"), toStr("Alternate ID Search")), toStr("DUPLICATE_RECORD"), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_STAT_CODE_LBT")
		@Before
		public void spraddrStatCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_NATN_CODE_LBT")
		@Before
		public void spraddrNatnCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_CNTY_CODE_LBT")
		@Before
		public void spraddrCntyCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TELE_CODE_LBT")
		@Before
		public void teleCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ATYP_CODE_LBT")
		@Before
		public void spraddrAtypCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 --SET_WINDOW_PROPERTY ('G$_OPT_WINDOW', POSITION, 33, 8);
G$_KEY_OPT_MENU ('SPRADDR.SPRADDR_ATYP_CODE',
                  G$_NLS.Get('SPAIDEN-0025', 'FORM','Address Types') , 'LIST_VALUES',
                  G$_NLS.Get('SPAIDEN-0026', 'FORM','Addresses (SOADDRQ)') , 'COUNT_QUERY',
                 '', '', '', '');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_buttonClick()
		{
			
				// SET_WINDOW_PROPERTY ('G$_OPT_WINDOW', POSITION, 33, 8);
				// SET_WINDOW_PROPERTY ('G$_OPT_WINDOW', POSITION, 33, 8);
				getTask().getGoqrpls().gKeyOptMenu(toStr("SPRADDR.SPRADDR_ATYP_CODE"), GNls.Fget(toStr("SPAIDEN-0025"), toStr("FORM"), toStr("Address Types")), toStr("LIST_VALUES"), GNls.Fget(toStr("SPAIDEN-0026"), toStr("FORM"), toStr("Addresses (SOADDRQ)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ASRC_CODE_LBT")
		@Before
		public void spraddrAsrcCodeLbt_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_1_ROLLBACK_BTN")
		@Before
		public void spridenCurrent1RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_1_SAVE_BTN")
		@Before
		public void spridenCurrent1SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_1_EXIT_BTN")
		@Before
		public void spridenCurrent1ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_2_RETURN_BTN")
		@Before
		public void spridenCurrent2ReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT_2_RETURN_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('KEY-DUP-ITEM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_CURRENT_2_RETURN_BTN")
		public void spridenCurrent2ReturnBtn_buttonClick()
		{
			
				executeAction("DUPLICATE_ITEM");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_2_ROLLBACK_BTN")
		@Before
		public void spridenCurrent2RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_2_EXIT_BTN")
		@Before
		public void spridenCurrent2ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREV_4_RETURN_BTN")
		@Before
		public void spridenPrev4ReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_PREV_4_RETURN_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_ITEM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_PREV_4_RETURN_BTN")
		public void spridenPrev4ReturnBtn_buttonClick()
		{
			 // MORPHIS TODO GEN
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SPAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				executeAction("DUPLICATE_ITEM");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREV_4_ROLLBACK_BTN")
		@Before
		public void spridenPrev4RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREV_4_EXIT_BTN")
		@Before
		public void spridenPrev4ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREVIOUS_ROLLBACK_BTN")
		@Before
		public void spridenPreviousRollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREVIOUS_SAVE_BTN")
		@Before
		public void spridenPreviousSaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREVIOUS_EXIT_BTN")
		@Before
		public void spridenPreviousExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS_3_RETURN_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREVIOUS_3_RETURN_BTN")
		@Before
		public void spridenPrevious3ReturnBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS_3_RETURN_BTN.WHEN-BUTTON-PRESSED
		 -- DO_KEY('DUPLICATE_ITEM');
GO_BLOCK ('SPRIDEN_CURRENT');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS_3_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_PREVIOUS_3_RETURN_BTN")
		public void spridenPrevious3ReturnBtn_buttonClick()
		{
			
				//  DO_KEY('DUPLICATE_ITEM');
				//  DO_KEY('DUPLICATE_ITEM');
				goBlock(toStr("SPRIDEN_CURRENT"));
			}

		
	
	
}

