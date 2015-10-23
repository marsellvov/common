package net.hedtech.banner.alumni.common.Apaiden.controller;
 
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
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenPreviousAdapter;
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
	public ApaidenTask getTask() {
		return (ApaidenTask)super.getTask();
	}

	public ApaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers

		
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
		 EXECUTE_TRIGGER ('MNU_OPT_ADDRESS');

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
			
				executeAction("MNU_OPT_ADDRESS");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAMES_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NAMES_BTN")
		@Before
		public void namesBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER NAMES_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('MNU_CALL_APANAME');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAMES_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NAMES_BTN")
		public void namesBtn_buttonClick()
		{
			
				executeAction("MNU_CALL_APANAME");
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
		 EXECUTE_TRIGGER ('CHECK_BOTH');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER ('NAME_AND_ID_CHECK');
G$_CHECK_FAILURE;
--
DO_KEY ('DUPLICATE_RECORD');
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
			
				executeAction("CHECK_BOTH");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("NAME_AND_ID_CHECK");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction(KeyFunction.DUPLICATE_RECORD);
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
		 --DO_KEY ('DUPLICATE_RECORD');
SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_USER',ENABLED,PROPERTY_ON);
SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_USER',NAVIGABLE,PROPERTY_ON);
SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN',ENABLED,PROPERTY_ON);
SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN',NAVIGABLE,PROPERTY_ON);
-- SET_FIELD ('SPRIDEN_PREVIOUS.SPRIDEN_USER', ENTERABLE);
-- SET_FIELD ('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN', ENTERABLE);
IF :SPRIDEN_PREVIOUS.SPRIDEN_USER IS NULL AND
   :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN IS NULL THEN
   MESSAGE ( G$_NLS.Get('APAIDEN-0060', 'FORM','*NOTE* No maintenance information available for this record.') );
ELSE
   IF :SPRIDEN_PREVIOUS.SPRIDEN_USER IS NULL THEN
--    SET_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_USER', ENTERABLE, ATTR_OFF);
      SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_USER',ENABLED,PROPERTY_OFF);
      GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN');
   ELSIF :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN IS NULL THEN
--    SET_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN', ENTERABLE, ATTR_OFF);
      SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN',ENABLED,PROPERTY_OFF);
      GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_USER');
   ELSE
      GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_USER');
   END IF;
END IF;
--
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
			
				// DO_KEY ('DUPLICATE_RECORD');

				//F2J_WARNING : Caution, the variable may be null.
				SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter)this.getFormModel().getSpridenPrevious().getRowAdapter(true);

				executeAction(KeyFunction.DUPLICATE_RECORD);
				// DO_KEY ('DUPLICATE_RECORD');
				setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_USER", true);
				setItemNavigable("SPRIDEN_PREVIOUS.SPRIDEN_USER", true);
				setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN", true);
				setItemNavigable("SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN", true);
				//  SET_FIELD ('SPRIDEN_PREVIOUS.SPRIDEN_USER', ENTERABLE);
				//  SET_FIELD ('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN', ENTERABLE);
				if ( spridenPreviousElement.getSpridenUser().isNull() && spridenPreviousElement.getSpridenOrigin().isNull() )
				{
					infoMessage(GNls.Fget(toStr("APAIDEN-0060"), toStr("FORM"), toStr("*NOTE* No maintenance information available for this record.")));
				}
				else {
					if ( spridenPreviousElement.getSpridenUser().isNull() )
					{
						//     SET_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_USER', ENTERABLE, ATTR_OFF);
						setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_USER", false);
						goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN"));
					}
					else if ( spridenPreviousElement.getSpridenOrigin().isNull() ) {
						//     SET_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN', ENTERABLE, ATTR_OFF);
						setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN", false);
						goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_USER"));
					}
					else {
						goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_USER"));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EMPLOYMENT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="EMPLOYMENT_BTN")
		@Before
		public void employmentBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER EMPLOYMENT_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('MNU_CALL_APAEHIS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EMPLOYMENT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EMPLOYMENT_BTN")
		public void employmentBtn_buttonClick()
		{
			
				executeAction("MNU_CALL_APAEHIS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALUMNI_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ALUMNI_BTN")
		@Before
		public void alumniBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ALUMNI_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('MNU_CALL_ALUMNI');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ALUMNI_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ALUMNI_BTN")
		public void alumniBtn_buttonClick()
		{
			
				executeAction("MNU_CALL_ALUMNI");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPOUSE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPOUSE_BTN")
		@Before
		public void spouseBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPOUSE_BTN.WHEN-BUTTON-PRESSED
		 IF :KEY_BLOCK.SPS_IDNO IS NULL THEN
MESSAGE( G$_NLS.Get('APAIDEN-0061', 'FORM','*ERROR* Spouse MUST exist for this function.') );
RETURN;
ELSE
 :GLOBAL.KEY_IDNO := :KEY_BLOCK.SPS_IDNO;
 :GLOBAL.ALUM_CALLED_FORM := 'Y';
  EXECUTE_TRIGGER('CALL_APAIDEN');
  G$_CHECK_FAILURE;
  :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
  EXECUTE_TRIGGER('DISABLE_KEYS');
  EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
  G$_CHECK_FAILURE;
  :GLOBAL.ALUM_CALLED_FORM := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPOUSE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPOUSE_BTN")
		public void spouseBtn_buttonClick()
		{
			
				if ( getFormModel().getKeyBlock().getSpsIdno().isNull() )
				{
					errorMessage(GNls.Fget(toStr("APAIDEN-0061"), toStr("FORM"), toStr("*ERROR* Spouse MUST exist for this function.")));
					return ;
				}
				else {
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getSpsIdno());
					setGlobal("ALUM_CALLED_FORM", toStr("Y"));
					executeAction("CALL_APAIDEN");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					executeAction("DISABLE_KEYS");
					executeAction("ENABLE_TAB_PAGES");
					getTask().getGoqrpls().gCheckFailure();
					setGlobal("ALUM_CALLED_FORM", toStr(""));
				}
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
		 * SPRIDEN_CURRENT_1_PREV_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_1_PREV_BTN")
		@Before
		public void spridenCurrent1PrevBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT_1_PREV_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('MNU_OPT_BLK_PREVIOUS');
G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_1_PREV_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_CURRENT_1_PREV_BTN")
		public void spridenCurrent1PrevBtn_buttonClick()
		{
			
				executeAction("MNU_OPT_BLK_PREVIOUS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_CANCEL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_CURRENT_2_CANCEL_BTN")
		@Before
		public void spridenCurrent2CancelBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT_2_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 --GO_FIELD(NAME_IN('HOLD_BLOCK_FIELD'));
GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_ID'); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT_2_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_CURRENT_2_CANCEL_BTN")
		public void spridenCurrent2CancelBtn_buttonClick()
		{
			
				// GO_FIELD(NAME_IN('HOLD_BLOCK_FIELD'));
				// GO_FIELD(NAME_IN('HOLD_BLOCK_FIELD'));
				goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
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
		 * SPRIDEN_PREV_4_CANCEL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_PREV_4_CANCEL_BTN")
		@Before
		public void spridenPrev4CancelBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_PREV_4_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 GO_FIELD('SPRIDEN_PREVIOUS.SPRIDEN_ID');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREV_4_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRIDEN_PREV_4_CANCEL_BTN")
		public void spridenPrev4CancelBtn_buttonClick()
		{
			
				goField(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ID"));
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
		 * SPRADDR_5_EXITVALUE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_5_EXITVALUE_BTN")
		@Before
		public void spraddr5ExitvalueBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-NXTBLK
		 GO_ITEM('APTADDR_NO') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="APTADDR_YES", function=KeyFunction.NEXT_BLOCK)
		public void aptaddrYes_NextBlock()
		{
			
				goItem(toStr("APTADDR_NO"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-PRVBLK
		 GO_ITEM('APTADDR_NO') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="APTADDR_YES", function=KeyFunction.PREVIOUS_BLOCK)
		public void aptaddrYes_PreviousBlock()
		{
			
				goItem(toStr("APTADDR_NO"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="APTADDR_YES")
		@Before
		public void aptaddrYes_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.WHEN-BUTTON-PRESSED
		 BEGIN
   INACTIVATE_HOUSEHOLD_ADDRESSES;
   --
	 GO_BLOCK('APTADDR');
   REMOVE_HOUSEHOLD_TEMP_RECS;
   CLEAR_BLOCK(NO_VALIDATE);
   --
   EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS') ;
   G$_CHECK_FAILURE;
   --
   GO_BLOCK('SPRADDR');
   CLEAR_BLOCK(NO_VALIDATE);
   EXECUTE_QUERY;
   HOUSEHOLD_ITEMS_DISABLE;   
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APTADDR_YES")
		public void aptaddrYes_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				this.getTask().getServices().inactivateHouseholdAddresses(spraddrElement);
				// 
				goBlock(toStr("APTADDR"));
				this.getTask().getServices().removeHouseholdTempRecs();
				clearBlock(TaskServices.NO_VALIDATE);
				// 
				executeAction("ENABLE_NON_HOUSEHOLD_TABS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				goBlock(toStr("SPRADDR"));
				clearBlock(TaskServices.NO_VALIDATE);
				executeQuery();
				this.getTask().getServices().householdItemsDisable();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-PREV-ITEM
		 GO_ITEM('APTADDR_NO') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="APTADDR_YES", function=KeyFunction.PREVIOUS_ITEM)
		public void aptaddrYes_PreviousItem()
		{
			
				goItem(toStr("APTADDR_NO"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-NEXT-ITEM
		 GO_ITEM('APTADDR_NO') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="APTADDR_YES", function=KeyFunction.NEXT_ITEM)
		public void aptaddrYes_keyNexItem()
		{
			
				goItem(toStr("APTADDR_NO"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-CLRFRM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", item="APTADDR_YES", function=KeyFunction.CLEAR_FORM)
		public void aptaddrYes_ClearTask()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-CLRBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="APTADDR_YES", function=KeyFunction.CLEAR_BLOCK)
		public void aptaddrYes_keyClearBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_YES.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_YES.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="APTADDR_YES", function=KeyFunction.SAVE)
		public void aptaddrYes_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-NXTBLK
		 GO_ITEM('APTADDR_YES') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="APTADDR_NO", function=KeyFunction.NEXT_BLOCK)
		public void aptaddrNo_NextBlock()
		{
			
				goItem(toStr("APTADDR_YES"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-PRVBLK
		 GO_ITEM('APTADDR_YES') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="APTADDR_NO", function=KeyFunction.PREVIOUS_BLOCK)
		public void aptaddrNo_PreviousBlock()
		{
			
				goItem(toStr("APTADDR_YES"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="APTADDR_NO")
		@Before
		public void aptaddrNo_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.WHEN-BUTTON-PRESSED
		 BEGIN
   GO_ITEM('APTADDR.APTADDR_SLCT_IND') ;
   MESSAGE(G$_NLS.Get('APAIDEN-0062', 'FORM', 'Household address inactivation was aborted.'));
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APTADDR_NO")
		public void aptaddrNo_buttonClick()
		{
			
				goItem(toStr("APTADDR.APTADDR_SLCT_IND"));
				warningMessage(GNls.Fget(toStr("APAIDEN-0062"), toStr("FORM"), toStr("Household address inactivation was aborted.")));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-NEXT-ITEM
		 GO_ITEM('APTADDR_YES') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="APTADDR_NO", function=KeyFunction.NEXT_ITEM)
		public void aptaddrNo_keyNexItem()
		{
			
				goItem(toStr("APTADDR_YES"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-PREV-ITEM
		 GO_ITEM('APTADDR_YES') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="APTADDR_NO", function=KeyFunction.PREVIOUS_ITEM)
		public void aptaddrNo_PreviousItem()
		{
			
				goItem(toStr("APTADDR_YES"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-CLRFRM
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", item="APTADDR_NO", function=KeyFunction.CLEAR_FORM)
		public void aptaddrNo_ClearTask()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-CLRBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", item="APTADDR_NO", function=KeyFunction.CLEAR_BLOCK)
		public void aptaddrNo_keyClearBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_NO.KEY-COMMIT
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NO.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="APTADDR_NO", function=KeyFunction.SAVE)
		public void aptaddrNo_Save()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.KEY-NXTBLK
		 GO_ITEM('APTADDR.APTADDR_SLCT_IND') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="APTADDR_GUASYST_BTN", function=KeyFunction.NEXT_BLOCK)
		public void aptaddrGuasystBtn_NextBlock()
		{
			
				goItem(toStr("APTADDR.APTADDR_SLCT_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.KEY-PRVBLK
		 BEGIN
	 GO_BLOCK('APTADDR');
   REMOVE_HOUSEHOLD_TEMP_RECS;
   CLEAR_BLOCK(NO_VALIDATE);
   EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS') ;
   G$_CHECK_FAILURE;
   GO_BLOCK('SPRADDR');
   HOUSEHOLD_ITEMS_DISABLE;   
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="APTADDR_GUASYST_BTN", function=KeyFunction.PREVIOUS_BLOCK)
		public void aptaddrGuasystBtn_PreviousBlock()
		{
			
				goBlock(toStr("APTADDR"));
				this.getTask().getServices().removeHouseholdTempRecs();
				clearBlock(TaskServices.NO_VALIDATE);
				executeAction("ENABLE_NON_HOUSEHOLD_TABS");
				getTask().getGoqrpls().gCheckFailure();
				goBlock(toStr("SPRADDR"));
				this.getTask().getServices().householdItemsDisable();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.WHEN-MOUSE-CLICK
		 BEGIN
	  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="APTADDR_GUASYST_BTN")
		public void aptaddrGuasystBtn_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.WHEN-BUTTON-PRESSED
		 -- PLU-LWS 02/02/2005
-- Set global and form fields (so we know where to go back to)
--
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID ;
-- Leave pidm alone in KEY_BLOCK

-- Come back to normal APTADDR default field in APTADDR instead of button
:HOLD_BLOCK_FIELD := 'APTADDR.APTADDR_SLCT_IND' ;
EXECUTE_TRIGGER('CALL_GUASYST');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APTADDR_GUASYST_BTN")
		public void aptaddrGuasystBtn_buttonClick()
		{
			
				//  PLU-LWS 02/02/2005
				//  Set global and form fields (so we know where to go back to)
				// 
				//  PLU-LWS 02/02/2005
				//  Set global and form fields (so we know where to go back to)
				// 
				setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
				//  Leave pidm alone in KEY_BLOCK
				//  Come back to normal APTADDR default field in APTADDR instead of button
				getFormModel().getFormHeader().setHoldBlockField(toStr("APTADDR.APTADDR_SLCT_IND"));
				executeAction("CALL_GUASYST");
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.KEY-NEXT-ITEM
		 GO_ITEM('APTADDR_INACTIVATE_BTN') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="APTADDR_GUASYST_BTN", function=KeyFunction.NEXT_ITEM)
		public void aptaddrGuasystBtn_keyNexItem()
		{
			
				goItem(toStr("APTADDR_INACTIVATE_BTN"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.KEY-PREV-ITEM
		 DO_KEY('NEXT_ITEM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="APTADDR_GUASYST_BTN", function=KeyFunction.PREVIOUS_ITEM)
		public void aptaddrGuasystBtn_PreviousItem()
		{
			
				executeAction(KeyFunction.NEXT_ITEM);
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_GUASYST_BTN.KEY-CLRFRM
		 DECLARE
   tab_page_id TAB_PAGE;
BEGIN
	 GO_BLOCK('APTADDR') ;
	 REMOVE_HOUSEHOLD_TEMP_RECS ;
   --
   -- Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
   tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
   IF NOT ID_NULL(tab_page_id) THEN
      IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
         SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
      END IF;
   END IF;
   --
   EXECUTE_TRIGGER('CLRFRM_TRIGGER');
   G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_GUASYST_BTN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", item="APTADDR_GUASYST_BTN", function=KeyFunction.CLEAR_FORM)
		public void aptaddrGuasystBtn_ClearTask()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					goBlock(toStr("APTADDR"));
					this.getTask().getServices().removeHouseholdTempRecs();
					// 
					//  Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
					tabPageId = findTabPage("CURRENT_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId))
						{
							setTabPageEnabled(tabPageId, true);
						}
					}
					// 
					executeAction("CLRFRM_TRIGGER");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.KEY-NXTBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", item="APTADDR_INACTIVATE_BTN", function=KeyFunction.NEXT_BLOCK)
		public void aptaddrInactivateBtn_NextBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.KEY-PRVBLK
		 BEGIN
  G$_INVALID_FUNCTION_MSG;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", item="APTADDR_INACTIVATE_BTN", function=KeyFunction.PREVIOUS_BLOCK)
		public void aptaddrInactivateBtn_PreviousBlock()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
   CURSOR ADDRESSES_TO_CHANGE_C IS
       SELECT *
         FROM APTADDR
        WHERE APTADDR_SESSIONID = SUBSTR(SYS_CONTEXT('USERENV','SESSIONID'),1,30)
          AND APTADDR_SLCT_IND = 'Y'
--          AND APTADDR_ADDRESS_COMPARE_IND is null
--          AND APTADDR_PHONE_COMPARE_IND is null
        ORDER BY APTADDR_HEAD_IND;

   addr_to_chng_rec       ADDRESSES_TO_CHANGE_C%ROWTYPE;
   blk_id   Block;
BEGIN
   IF G$_QUERY_ONLY_ROLE THEN
      MESSAGE(G$_NLS.Get('APAIDEN-0063', 'FORM', '*ERROR* Form running in query-only mode. This option is not available.'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
	 blk_id := FIND_BLOCK('APTADDR');
	 
	 IF NOT ID_NULL(blk_id) THEN
	 	  -- Save any indicators that haven't been saved yet.
      IF GET_BLOCK_PROPERTY(blk_id, STATUS) = 'CHANGED'  THEN
         DO_SILENT_COMMIT;
      END IF;
	    OPEN ADDRESSES_TO_CHANGE_C ;
      FETCH ADDRESSES_TO_CHANGE_C INTO addr_to_chng_rec;
      IF ADDRESSES_TO_CHANGE_C%NOTFOUND THEN
         CLOSE ADDRESSES_TO_CHANGE_C;
         MESSAGE(G$_NLS.Get('APAIDEN-0064', 'FORM', '*ERROR* No household addresses selected for update.'));
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
      CLOSE ADDRESSES_TO_CHANGE_C;
      SET_BLOCK_PROPERTY(blk_id, DELETE_ALLOWED, PROPERTY_TRUE);
      SET_BLOCK_PROPERTY(blk_id, INSERT_ALLOWED, PROPERTY_TRUE);
      
      -- Are you sure you want to inactivate all household addresses?
      GO_ITEM('APTADDR_NO');
   END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APTADDR_INACTIVATE_BTN")
		public void aptaddrInactivateBtn_buttonClick()
		{
			
				int rowCount = 0;
				{
					String sqladdressesToChangeC = "SELECT * " +
	" FROM APTADDR " +
	" WHERE APTADDR_SESSIONID = SUBSTR(SYS_CONTEXT('USERENV', 'SESSIONID'), 1, 30) AND APTADDR_SLCT_IND = 'Y' " +
	" ORDER BY APTADDR_HEAD_IND";
					DataCursor addressesToChangeC = new DataCursor(sqladdressesToChangeC);
					TableRow addrToChngRec= null;
					BlockDescriptor blkId= null;
					try {
						if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
						{
							errorMessage(GNls.Fget(toStr("APAIDEN-0063"), toStr("FORM"), toStr("*ERROR* Form running in query-only mode. This option is not available.")));
							throw new ApplicationException();
						}
						blkId = findBlock("APTADDR");
						if ( !(blkId == null) )
						{
							//MORPHIS TODO MP CAUTION
							//  Save any indicators that haven't been saved yet.
							//if ( getBlockStatus(blkId).equals("CHANGED") )
								if ( getBlockStatus().equals("CHANGED") )
							{
								this.getTask().getServices().doSilentCommit();
							}
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable addressesToChangeC.
							addressesToChangeC.open();
							addrToChngRec = addressesToChangeC.fetchRow();
							if ( addressesToChangeC.notFound() )
							{
								addressesToChangeC.close();
								errorMessage(GNls.Fget(toStr("APAIDEN-0064"), toStr("FORM"), toStr("*ERROR* No household addresses selected for update.")));
								throw new ApplicationException();
							}
							addressesToChangeC.close();
							setBlockDeleteAllowed(blkId, true);
							setBlockInsertAllowed(blkId, true);
							//  Are you sure you want to inactivate all household addresses?
							goItem(toStr("APTADDR_NO"));
						}
					}
					finally{
						addressesToChangeC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.KEY-NEXT-ITEM
		 GO_ITEM('APTADDR.APTADDR_SLCT_IND') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="APTADDR_INACTIVATE_BTN", function=KeyFunction.NEXT_ITEM)
		public void aptaddrInactivateBtn_keyNexItem()
		{
			
				goItem(toStr("APTADDR.APTADDR_SLCT_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.KEY-PREV-ITEM
		 GO_ITEM('APTADDR_GUASYST_BTN') ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="APTADDR_INACTIVATE_BTN", function=KeyFunction.PREVIOUS_ITEM)
		public void aptaddrInactivateBtn_PreviousItem()
		{
			
				goItem(toStr("APTADDR_GUASYST_BTN"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_INACTIVATE_BTN.KEY-CLRFRM
		 DECLARE
   tab_page_id TAB_PAGE;
BEGIN
	 GO_BLOCK('APTADDR');
	 REMOVE_HOUSEHOLD_TEMP_RECS ;
   --
   -- Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
   tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
   IF NOT ID_NULL(tab_page_id) THEN
      IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
         SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
      END IF;
   END IF;
   --
   EXECUTE_TRIGGER('CLRFRM_TRIGGER');
   G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_INACTIVATE_BTN.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", item="APTADDR_INACTIVATE_BTN", function=KeyFunction.CLEAR_FORM)
		public void aptaddrInactivateBtn_ClearTask()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					goBlock(toStr("APTADDR"));
					this.getTask().getServices().removeHouseholdTempRecs();
					// 
					//  Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
					tabPageId = findTabPage("CURRENT_ID_TAB");
					if ( !(tabPageId == null) )
					{
						if ( !getTabPageEnabled(tabPageId) )
						{
							setTabPageEnabled(tabPageId, true);
						}
					}
					// 
					executeAction("CLRFRM_TRIGGER");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APREHIS_UPDATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="APREHIS_UPDATE_BTN")
		@Before
		public void aprehisUpdateBtn_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER APREHIS_UPDATE_BTN.WHEN-BUTTON-PRESSED
		 IF :EMPLOYMENT_DETAILS = 'Y' THEN
   :GLOBAL.ADDR_ATYP_CODE := :SPRADDR_ATYP_CODE;
   :GLOBAL.ATYP_SEQNO := :SPRADDR_SEQNO; 
END IF;
EXECUTE_TRIGGER('MNU_OPT_FRM_APAEHIS');
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APREHIS_UPDATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="APREHIS_UPDATE_BTN")
		public void aprehisUpdateBtn_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				if ( spraddrElement.getEmploymentDetails().equals("Y") )
				{
					setGlobal("ADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
					setGlobal("ATYP_SEQNO", toStr(spraddrElement.getSpraddrSeqno()));
				}
				executeAction("MNU_OPT_FRM_APAEHIS");
			}

		
	
	
}

