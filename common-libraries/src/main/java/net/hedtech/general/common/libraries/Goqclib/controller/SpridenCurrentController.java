package net.hedtech.general.common.libraries.Goqclib.controller;

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
import net.hedtech.general.common.libraries.Noqjpls.*;
import net.hedtech.general.common.libraries.Noqrpls.*;
import net.hedtech.general.common.libraries.Poqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqclib.model.*;
import net.hedtech.general.common.libraries.Goqclib.*;
import net.hedtech.general.common.libraries.Goqclib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class SpridenCurrentController extends AbstractSupportCodeObject {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
//	}
	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}
	
	private GIconBtnClass getGIconBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}
	
	private GDescClass getGDescClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}
	
	private GDateClass getGDateClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}

	public SpridenCurrentController(ISupportCodeContainer container) {
		super(container);

	}

	@Override
	public GoqclibTaskPart getContainer() {
		return (GoqclibTaskPart) super.getContainer();
	}

	public GoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE -- -- If this trigger is being
	 * fired due to navigation to the block but the key block is has not -- been
	 * successfully exited, the cursor block value will still be set to the
	 * KEY_BLOCK value. -- IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN RETURN;
	 * END IF; -- :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID'; -- IF
	 * :CHECK_KEYS = 'Y' THEN -- :HOLD_ITEM := :SYSTEM.CURSOR_ITEM; :CHECK_KEYS
	 * := 'N'; GO_BLOCK('KEY_BLOCK'); G$_CHECK_VALUE((:KEY_BLOCK.ID IS NULL),
	 * G$_NLS.Get('GOQCLIB-0013','FORM','*ERROR* An id number or ''GENERATED''
	 * must be entered for this function.'),TRUE,TRUE); --
	 * EXECUTE_TRIGGER('EDIT_EMPLOYEE_STATUS'); G$_CHECK_FAILURE; -- -- Turn off
	 * validation temporarily and perform query --
	 * SET_FORM_PROPERTY(:GLOBAL.CURRENT_FORM, VALIDATION, PROPERTY_OFF);
	 * NEXT_BLOCK; -- EXECUTE_TRIGGER('ENABLE_ROOTWIN_BUTTONS');
	 * G$_CHECK_FAILURE; -- EXECUTE_QUERY;
	 * SET_FORM_PROPERTY(:GLOBAL.CURRENT_FORM, VALIDATION, PROPERTY_ON); -- IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND IS NULL THEN IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED) = 'FALSE'
	 * THEN IF G$_MASKS.G$_DID_MASK_RESTRICT
	 * (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_LEGAL_NAME') = 'N' THEN
	 * SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED,
	 * PROPERTY_TRUE); END IF; END IF; -- Allow entering into Person fields IF
	 * GET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LAST_NAME', ENABLED) = 'FALSE'
	 * THEN EXECUTE_TRIGGER ('ENABLE_PERS_ITEMS'); G$_CHECK_FAILURE; END IF;
	 * --219-1 -- Allow entering into Non-Person fields IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.NON_PERS_NAME', ENABLED) = 'FALSE'
	 * THEN EXECUTE_TRIGGER('ENABLE_NONPERS_ITEMS'); G$_CHECK_FAILURE; END IF;
	 * -- IF G$_MASKS.G$_DID_MASK_RESTRICT
	 * (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_SURNAME_PREFIX') = 'N'
	 * THEN GO_ITEM('SPRIDEN_CURRENT.PERS_SURNAME_PREFIX'); ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_LAST_NAME'); END IF; ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_ID'); IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P' THEN IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED) = 'FALSE'
	 * THEN IF G$_MASKS.G$_DID_MASK_RESTRICT
	 * (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT', 'PERS_LEGAL_NAME') = 'N' THEN
	 * SET_ITEM_PROPERTY ('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED,
	 * PROPERTY_TRUE); END IF; END IF; --219-1 -- Do not allow entering into
	 * Non-Person field IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.NON_PERS_NAME',
	 * ENABLED) = 'TRUE' THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.NON_PERS_NAME',
	 * ENABLED, PROPERTY_OFF); END IF; -- Allow entering into Person fields IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LAST_NAME', ENABLED) = 'FALSE'
	 * THEN EXECUTE_TRIGGER('ENABLE_PERS_ITEMS'); G$_CHECK_FAILURE; END IF; END
	 * IF; --219-1 IF :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN -- Do not
	 * allow entering into Person fields
	 * SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SURNAME_PREFIX', ENABLED,
	 * PROPERTY_OFF); SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LAST_NAME',
	 * ENABLED, PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_FIRST_NAME', ENABLED,
	 * PROPERTY_OFF); SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MI', ENABLED,
	 * PROPERTY_OFF); SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX', ENABLED,
	 * PROPERTY_OFF); SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX', ENABLED,
	 * PROPERTY_OFF); SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',
	 * ENABLED, PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME', ENABLED,
	 * PROPERTY_OFF); -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN', VISIBLE) =
	 * 'TRUE' THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN',
	 * ENABLED, PROPERTY_OFF); END IF; -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_OFF); END IF; -- Allow entering into Non-Person field IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.NON_PERS_NAME', ENABLED) = 'FALSE'
	 * THEN EXECUTE_TRIGGER('ENABLE_NONPERS_ITEMS'); G$_CHECK_FAILURE; END IF;
	 * END IF; END IF; -- :CHECK_KEYS := 'N'; EXECUTE_TRIGGER('DISABLE_KEYS');
	 * EXECUTE_TRIGGER('ENABLE_TAB_PAGES'); G$_CHECK_FAILURE; -- IF :HOLD_ITEM
	 * IS NOT NULL THEN GO_ITEM(NAME_IN('HOLD_ITEM')); END IF; END IF; -- --
	 * Default logic to enable/disable search buttons based on entity. -- IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN', VISIBLE) =
	 * 'TRUE' THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN',
	 * ENABLED, PROPERTY_OFF); END IF; -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_OFF); END IF; -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_ON); END IF; EXECUTE_TRIGGER('SET_MRTL_ITEMS'); ELSE IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN', VISIBLE) =
	 * 'TRUE' THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN',
	 * ENABLED, PROPERTY_ON); END IF; -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_ON); END IF; -- IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_OFF); END IF; EXECUTE_TRIGGER('SET_MRTL_ITEMS'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void spridenCurrent_blockChange() {

		//
		// If this trigger is being fired due to navigation to the block but the
		// key block is has not
		// been successfully exited, the cursor block value will still be set to
		// the KEY_BLOCK value.
		//

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		//
		// If this trigger is being fired due to navigation to the block but the
		// key block is has not
		// been successfully exited, the cursor block value will still be set to
		// the KEY_BLOCK value.
		//
		if (getCursorBlock().equals("KEY_BLOCK")) {
			return;
		}
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"HOLD_BLOCK_FIELD", "SPRIDEN_CURRENT.SPRIDEN_ID");
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		if (getFormModel().getBusinessObject("BUTTON_CONTROL_BLOCK")
				.getValue("CHECK_KEYS").equals("Y")) {
			//
			spridenCurrentElement.setHoldItem(toStr(getCursorItem()));
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("BUTTON_CONTROL_BLOCK").setValue(
					"CHECK_KEYS", "N");
			goBlock(toStr("KEY_BLOCK"));
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getContainer()
					.getGoqrpls()
					.gCheckValue(
							(toBool(toStr(
									getFormModel().getBusinessObject(
											"KEY_BLOCK").getValue("ID"))
									.isNull())),
							GNls.Fget(
									toStr("GOQCLIB-0013"),
									toStr("FORM"),
									toStr("*ERROR* An id number or 'GENERATED' must be entered for this function.")),
							toBool(NBool.True), toBool(NBool.True));
			//
			executeAction("EDIT_EMPLOYEE_STATUS");
			getContainer().getGoqrpls().gCheckFailure();
			//
			// Turn off validation temporarily and perform query
			//
			try{
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not
				// supported. See documentation for details
				// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				// SupportClasses.FORMS40.SetFormProperty(getGlobal("CURRENT_FORM"),
				// SupportClasses.Property.VALIDATION, false);
				this.getContainer().getTask().setValidationEnabled(false);
	//			System.err
	//					.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
	
				nextBlock();
				//
				executeAction("ENABLE_ROOTWIN_BUTTONS");
				getContainer().getGoqrpls().gCheckFailure();
				//
				this.getContainer().getServices().executeQuery();
			} finally {
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not
				// supported. See documentation for details
				// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				// SupportClasses.FORMS40.SetFormProperty(getGlobal("CURRENT_FORM"),
				// SupportClasses.Property.VALIDATION, true);
				this.getContainer().getTask().setValidationEnabled(true);
			}
//			System.err
//					.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");

			//
			if (spridenCurrentElement.getSpridenEntityInd().isNull()) {
				if (getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals(
						"FALSE")) {
					if (getContainer()
							.getGoqrpls()
							.getGMasks()
							.gDidMaskRestrict(toStr(getCurrentTaskName()),
									toStr("SPRIDEN_CURRENT"),
									toStr("PERS_LEGAL_NAME")).equals("N")) {
						setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", true);
					}
				}
				// Allow entering into Person fields
				if (getItemEnabled("SPRIDEN_CURRENT.PERS_LAST_NAME").equals(
						"FALSE")) {
					executeAction("ENABLE_PERS_ITEMS");
					getContainer().getGoqrpls().gCheckFailure();
				}
				// 219-1
				// Allow entering into Non-Person fields
				if (getItemEnabled("SPRIDEN_CURRENT.NON_PERS_NAME").equals(
						"FALSE")) {
					executeAction("ENABLE_NONPERS_ITEMS");
					getContainer().getGoqrpls().gCheckFailure();
				}
				//
				if (getContainer()
						.getGoqrpls()
						.getGMasks()
						.gDidMaskRestrict(toStr(getCurrentTaskName()),
								toStr("SPRIDEN_CURRENT"),
								toStr("PERS_SURNAME_PREFIX")).equals("N")) {
					goItem(toStr("SPRIDEN_CURRENT.PERS_SURNAME_PREFIX"));
				} else {
					goItem(toStr("SPRIDEN_CURRENT.PERS_LAST_NAME"));
				}
			} else {
				goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
				if (spridenCurrentElement.getSpridenEntityInd().equals("P")) {
					if (getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME")
							.equals("FALSE")) {
						if (getContainer()
								.getGoqrpls()
								.getGMasks()
								.gDidMaskRestrict(toStr(getCurrentTaskName()),
										toStr("SPRIDEN_CURRENT"),
										toStr("PERS_LEGAL_NAME")).equals("N")) {
							setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME",
									true);
						}
					}
					// 219-1
					// Do not allow entering into Non-Person field
					if (getItemEnabled("SPRIDEN_CURRENT.NON_PERS_NAME").equals(
							"TRUE")) {
						setItemEnabled("SPRIDEN_CURRENT.NON_PERS_NAME", false);
					}
					// Allow entering into Person fields
					if (getItemEnabled("SPRIDEN_CURRENT.PERS_LAST_NAME")
							.equals("FALSE")) {
						executeAction("ENABLE_PERS_ITEMS");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
				// 219-1
				if (spridenCurrentElement.getSpridenEntityInd().equals("C")) {
					// Do not allow entering into Person fields
					setItemEnabled("SPRIDEN_CURRENT.PERS_SURNAME_PREFIX", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_LAST_NAME", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_FIRST_NAME", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_MI", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_PREFIX", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_SUFFIX", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_PREF_FNAME", false);
					setItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME", false);
					//
					if (getItemVisible("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN")
							.equals("TRUE")) {
						setItemEnabled("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN",
								false);
					}
					//
					if (getItemVisible("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN")
							.equals("TRUE")) {
						setItemEnabled("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN",
								false);
					}
					// Allow entering into Non-Person field
					if (getItemEnabled("SPRIDEN_CURRENT.NON_PERS_NAME").equals(
							"FALSE")) {
						executeAction("ENABLE_NONPERS_ITEMS");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("BUTTON_CONTROL_BLOCK").setValue(
					"CHECK_KEYS", "N");
			executeAction("DISABLE_KEYS");
			executeAction("ENABLE_TAB_PAGES");
			getContainer().getGoqrpls().gCheckFailure();
			//
			if (!spridenCurrentElement.getHoldItem().isNull()) {
				goItem(getNameIn("HOLD_ITEM"));
			}
		}
		//
		// Default logic to enable/disable search buttons based on entity.
		//
		if (spridenCurrentElement.getSpridenEntityInd().equals("C")) {
			if (getItemVisible("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN", false);
			}
			//
			if (getItemVisible("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN", false);
			}
			//
			if (getItemVisible("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN", true);
			}
			executeAction("SET_MRTL_ITEMS");
		} else {
			if (getItemVisible("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.FIRST_NAME_SRCH_BTN", true);
			}
			//
			if (getItemVisible("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.LAST_NAME_SRCH_BTN", true);
			}
			//
			if (getItemVisible("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN").equals(
					"TRUE")) {
				setItemEnabled("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN", false);
			}
			executeAction("SET_MRTL_ITEMS");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.POST-QUERY -- --
	 * Get person information -- EXECUTE_TRIGGER('GET_PERS_INFO');
	 * G$_CHECK_FAILURE; -- EXECUTE_TRIGGER('GET_NAME_TYPE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void spridenCurrent_AfterQuery(RowAdapterEvent args) {

		//
		// Get person information
		//
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		try {

			if (spridenCurrentElement.getSpridenId().isNull()) {
				spridenCurrentElement.setSpridenId(toStr(getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("ID")));
			}

			spridenCurrentElement.setLockDbValues(true);
			if (!spridenCurrentElement.getSpridenLastName().isNull())
				this.spridenLastName_PostChange();
			if (!spridenCurrentElement.getSpridenSurnamePrefix().isNull())
				this.spridenSurnamePrefix_PostChange();
			if (!spridenCurrentElement.getSpridenFirstName().isNull())
				this.spridenFirstName_PostChange();
			if (!spridenCurrentElement.getSpridenMi().isNull())
				this.spridenMi_PostChange();
			if (!spridenCurrentElement.getPersMrtlCode().isNull())
				this.persMrtlCode_PostChange();
			if (!spridenCurrentElement.getSpridenId().isNull())
				this.spridenId_PostChange();
		} finally {
			spridenCurrentElement.setLockDbValues(false);
		}
		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		//
		// Get person information
		//
		executeAction("GET_PERS_INFO");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("GET_NAME_TYPE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.PRE-INSERT BEGIN
	 * EXECUTE_TRIGGER('CHECK_PERS_NONPERS'); G$_CHECK_FAILURE; -- -- This
	 * trigger step will check that a last name and a first name was -- entered
	 * for a person. -- EXECUTE_TRIGGER('CHECK_FIRST_LAST_NAME');
	 * G$_CHECK_FAILURE; -- :SPRIDEN_CURRENT.SPRIDEN_ID := :KEY_BLOCK.ID; --
	 * EXECUTE_TRIGGER('SET_AUDIT_INFO'); G$_CHECK_FAILURE; --
	 * :SPRIDEN_CURRENT.SPRIDEN_CREATE_USER := :GLOBAL.CURRENT_USER;
	 * :SPRIDEN_CURRENT.SPRIDEN_CREATE_DATE :=
	 * TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT); END;
	 */
	/*
	 * <p>This trigger will validate the current information and generate a new
	 * PIDM.
	 * 
	 * If the id is to be generated, this will be performed.<b>Migration
	 * Comments</b> Generated from trigger: SPRIDEN_CURRENT.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void spridenCurrent_BeforeRowInsert(RowAdapterEvent args) {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		executeAction("CHECK_PERS_NONPERS");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// This trigger step will check that a last name and a first name was
		// entered for a person.
		//
		executeAction("CHECK_FIRST_LAST_NAME");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spridenCurrentElement.setSpridenId(toStr(getFormModel()
				.getBusinessObject("KEY_BLOCK").getValue("ID")));
		//
		executeAction("SET_AUDIT_INFO");
		getContainer().getGoqrpls().gCheckFailure();
		//
		spridenCurrentElement.setSpridenCreateUser(getGlobal("CURRENT_USER"));
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spridenCurrentElement.setSpridenCreateDate(toDate(toStr(getFormModel()
				.getBusinessObject("FORM_HEADER").getValue("CURRENT_DATE")),
				GDate.getNlsDateFormat()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.ON-INSERT -- 82-1
	 * add SURNAME_PREFIX BEGIN GB_IDENTIFICATION.P_CREATE(p_ID_INOUT
	 * =>:SPRIDEN_CURRENT.SPRIDEN_ID, p_LAST_NAME
	 * =>:SPRIDEN_CURRENT.SPRIDEN_LAST_NAME, p_FIRST_NAME
	 * =>:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME, p_MI
	 * =>:SPRIDEN_CURRENT.SPRIDEN_MI, p_CHANGE_IND =>'', p_ENTITY_IND
	 * =>:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND, p_USER
	 * =>:SPRIDEN_CURRENT.SPRIDEN_USER, p_ORIGIN
	 * =>:SPRIDEN_CURRENT.SPRIDEN_ORIGIN, p_NTYP_CODE
	 * =>:SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE, p_SURNAME_PREFIX
	 * =>:SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_PIDM_INOUT =>:SPRIDEN_CURRENT.SPRIDEN_PIDM,
	 * p_ROWID_OUT =>:SPRIDEN_CURRENT.ROWID); :CHANGE_IDEN := 'N'; -- SELECT
	 * SPRIDEN_ACTIVITY_DATE, SPRIDEN_CREATE_DATE INTO
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE,
	 * :SPRIDEN_CURRENT.SPRIDEN_CREATE_DATE FROM SPRIDEN WHERE ROWID =
	 * :SPRIDEN_CURRENT.ROWID; -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void spridenCurrent_RowInsert(RowAdapterEvent args) {

		// 82-1 add SURNAME_PREFIX
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		int rowCount = 0;
		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<NString> p_id_inout_ref = new Ref<NString>(
					spridenCurrentElement.getSpridenId());
			Ref<NNumber> p_pidm_inout_ref = new Ref<NNumber>(
					spridenCurrentElement.getSpridenPidm());
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbIdentification.pCreate(p_id_inout_ref, /* pLastName=> */
					spridenCurrentElement.getSpridenLastName(), /* pFirstName=> */
					spridenCurrentElement.getSpridenFirstName(), /* pMi=> */
					spridenCurrentElement.getSpridenMi(), /* pChangeInd=> */
					toStr(""), /* pEntityInd=> */
					spridenCurrentElement.getSpridenEntityInd(), /* pUser=> */
					spridenCurrentElement.getSpridenUser(), /* pOrigin=> */
					spridenCurrentElement.getSpridenOrigin(), /* pNtypCode=> */
					spridenCurrentElement.getSpridenNtypCode(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), /* pSurnamePrefix=> */
					spridenCurrentElement.getSpridenSurnamePrefix(),
					p_pidm_inout_ref, p_rowid_out_ref);
			spridenCurrentElement.setSpridenId(p_id_inout_ref.val);
			spridenCurrentElement.setSpridenPidm(p_pidm_inout_ref.val);
			spridenCurrentElement.setROWID(p_rowid_out_ref.val);
			spridenCurrentElement.setChangeIden(toStr("N"));
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			String sql1 = "SELECT SPRIDEN_ACTIVITY_DATE, SPRIDEN_CREATE_DATE "
					+ " FROM SPRIDEN "
					+ " WHERE ROWID = :SPRIDEN_CURRENT_ROWID ";
			DataCommand command1 = new DataCommand(sql1);
			// Setting query parameters
			command1.addParameter("SPRIDEN_CURRENT_ROWID",
					spridenCurrentElement.getROWID());
			ResultSet results1 = command1.executeQuery();
			rowCount = command1.getRowCount();
			if (results1.hasData()) {
				spridenCurrentElement.setSpridenActivityDate(results1
						.getDate(0));
				spridenCurrentElement.setSpridenCreateDate(results1.getDate(1));
			}
			results1.close();
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.POST-INSERT IF
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS = 'Y' THEN
	 * EXECUTE_TRIGGER('INSERT_SPBPERS'); G$_CHECK_FAILURE; --
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := ''; EXECUTE_TRIGGER('GET_PERS_INFO');
	 * G$_CHECK_FAILURE; END IF; -- EXECUTE_TRIGGER('GET_FULLNAME');
	 * G$_CHECK_FAILURE; -- :KEY_BLOCK.ID := :SPRIDEN_CURRENT.SPRIDEN_ID;
	 * :KEY_BLOCK.PIDM := :SPRIDEN_CURRENT.SPRIDEN_PIDM; :GLOBAL.KEY_IDNO :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ID;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.POST-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowInsert
	public void spridenCurrent_AfterRowInsert(RowAdapterEvent args) {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		if (spridenCurrentElement.getChangeSpbpers().equals("Y")) {
			executeAction("INSERT_SPBPERS");
			getContainer().getGoqrpls().gCheckFailure();
			//
			spridenCurrentElement.setChangeSpbpers(toStr(""));
			executeAction("GET_PERS_INFO");
			getContainer().getGoqrpls().gCheckFailure();
		}
		//
		executeAction("GET_FULLNAME");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("KEY_BLOCK").setValue("ID",
				spridenCurrentElement.getSpridenId());
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("KEY_BLOCK").setValue("PIDM",
				spridenCurrentElement.getSpridenPidm());
		setGlobal("KEY_IDNO", spridenCurrentElement.getSpridenId());
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.PRE-UPDATE DECLARE
	 * pii_active VARCHAR2(1) := 'N'; BEGIN pii_active :=
	 * gokfgac.f_spriden_pii_active; -- EXECUTE_TRIGGER('CHECK_PERS_NONPERS');
	 * G$_CHECK_FAILURE; -- -- This trigger step will make sure that a last name
	 * and a first name -- were entered for a person. --
	 * EXECUTE_TRIGGER('CHECK_FIRST_LAST_NAME'); G$_CHECK_FAILURE; -- BEGIN IF
	 * pii_active = 'Y' THEN -- spriden pii is active, turn fgac off
	 * gokfgac.p_turn_fgac_off; END IF; -- IF :SPRIDEN_CURRENT.SPRIDEN_ID =
	 * 'GENERATED' THEN :SPRIDEN_CURRENT.SPRIDEN_ID := GB_COMMON.F_GENERATE_ID;
	 * END IF; -- EXCEPTION WHEN OTHERS THEN IF pii_active = 'Y' THEN -- spriden
	 * pii is active, turn fgac on gokfgac.p_turn_fgac_on; END IF;
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END; -- IF
	 * pii_active = 'Y' THEN -- spriden pii is active, turn fgac on
	 * gokfgac.p_turn_fgac_on; END IF; -- IF (:SPRIDEN_CURRENT.SPRIDEN_PIDM IS
	 * NOT NULL AND :SPRIDEN_CURRENT.SPRIDEN_ID IS NULL) THEN
	 * MESSAGE(G$_NLS.GET('GOQCLIB-0014','FORM','*ERROR* ID is required.'));
	 * RAISE FORM_TRIGGER_FAILURE; END IF; -- IF :CHANGE_IDEN = 'Y' THEN
	 * EXECUTE_TRIGGER('SET_AUDIT_INFO'); END IF; END;
	 */
	/*
	 * <p>This trigger will validate the current information and check if any
	 * changes
	 * 
	 * were made to the name or id. If there were changes, new records are
	 * 
	 * created to record the changes.<b>Migration Comments</b> Generated from
	 * trigger: SPRIDEN_CURRENT.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void spridenCurrent_BeforeRowUpdate(RowAdapterEvent args) {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		{
			NString piiActive = toStr("N");
			piiActive = Gokfgac.fSpridenPiiActive();
			//
			executeAction("CHECK_PERS_NONPERS");
			getContainer().getGoqrpls().gCheckFailure();
			//
			// This trigger step will make sure that a last name and a first
			// name
			// were entered for a person.
			//
			executeAction("CHECK_FIRST_LAST_NAME");
			getContainer().getGoqrpls().gCheckFailure();
			try {
				if (piiActive.equals("Y")) {
					// spriden pii is active, turn fgac off
					Gokfgac.pTurnFgacOff();
				}
				//
				if (spridenCurrentElement.getSpridenId().equals("GENERATED")) {
					spridenCurrentElement.setSpridenId(GbCommon.fGenerateId());
				}
			} catch (Exception e) {
				if (piiActive.equals("Y")) {
					// spriden pii is active, turn fgac on
					Gokfgac.pTurnFgacOn();
				}
				getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
				throw new ApplicationException();
			}
			//
			if (piiActive.equals("Y")) {
				// spriden pii is active, turn fgac on
				Gokfgac.pTurnFgacOn();
			}
			//
			if ((!spridenCurrentElement.getSpridenPidm().isNull() && spridenCurrentElement
					.getSpridenId().isNull())) {
				errorMessage(GNls.Fget(toStr("GOQCLIB-0014"), toStr("FORM"),
						toStr("*ERROR* ID is required.")));
				throw new ApplicationException();
			}
			//
			if (spridenCurrentElement.getChangeIden().equals("Y")) {
				executeAction("SET_AUDIT_INFO");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.ON-UPDATE -- 82-1
	 * add SURNAME_PREFIX BEGIN IF :CHANGE_IDEN = 'Y' THEN
	 * GB_IDENTIFICATION.P_UPDATE(p_PIDM =>:SPRIDEN_CURRENT.SPRIDEN_PIDM, p_ID
	 * =>:SPRIDEN_CURRENT.SPRIDEN_ID, p_LAST_NAME
	 * =>:SPRIDEN_CURRENT.SPRIDEN_LAST_NAME, p_FIRST_NAME
	 * =>:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME, p_MI
	 * =>:SPRIDEN_CURRENT.SPRIDEN_MI, p_CHANGE_IND
	 * =>:SPRIDEN_CURRENT.SPRIDEN_CHANGE_IND, p_ENTITY_IND
	 * =>:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND, p_USER
	 * =>:SPRIDEN_CURRENT.SPRIDEN_USER, p_NTYP_CODE
	 * =>:SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_SURNAME_PREFIX
	 * =>:SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX, p_ORIGIN =>
	 * :SPRIDEN_CURRENT.SPRIDEN_ORIGIN, p_ROWID =>:SPRIDEN_CURRENT.ROWID); --
	 * :CHANGE_IDEN := 'N'; :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRIDEN_CURRENT.ROWID),'DDMONYYYYHH24MISS');
	 * END IF; EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void spridenCurrent_RowUpdate(RowAdapterEvent args) {

		// 82-1 add SURNAME_PREFIX
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		try {
			if (spridenCurrentElement.getChangeIden().equals("Y")) {
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				// F2J_WARNING : Passing parameters by name is not supported.
				// Please check that the parameters are in the correct order.
				GbIdentification.pUpdate(/* pPidm=> */spridenCurrentElement
						.getSpridenPidm(),
				/* pId=> */spridenCurrentElement.getSpridenId(),
				/* pLastName=> */spridenCurrentElement.getSpridenLastName(),
				/* pFirstName=> */spridenCurrentElement.getSpridenFirstName(),
				/* pMi=> */spridenCurrentElement.getSpridenMi(),
				/* pChangeInd=> */spridenCurrentElement.getSpridenChangeInd(),
				/* pEntityInd=> */spridenCurrentElement.getSpridenEntityInd(),
				/* pUser=> */spridenCurrentElement.getSpridenUser(),
				/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
				/* pNtypCode=> */spridenCurrentElement.getSpridenNtypCode(),
				/* pOrigin=> */spridenCurrentElement.getSpridenOrigin(),
				/* pSurnamePrefix=> */spridenCurrentElement
						.getSpridenSurnamePrefix(),
				/* pRowid=> */spridenCurrentElement.getROWID());
				//
				spridenCurrentElement.setChangeIden(toStr("N"));
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				spridenCurrentElement.setSpridenActivityDate(toDate(
						getContainer().getGoqrpls().gResynchRecord(
								spridenCurrentElement.getROWID()),
						"DDMONYYYYHH24MISS"));
			}
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.POST-UPDATE DECLARE
	 * CURSOR PERS_CURSOR IS SELECT 'Y' FROM SPBPERS WHERE SPBPERS.SPBPERS_PIDM
	 * = :SPRIDEN_CURRENT.SPRIDEN_PIDM; -- BEGIN OPEN PERS_CURSOR; FETCH
	 * PERS_CURSOR INTO :SPRIDEN_CURRENT.FOUND_SPBPERS; IF PERS_CURSOR%NOTFOUND
	 * THEN :SPRIDEN_CURRENT.FOUND_SPBPERS := 'N'; END IF; CLOSE PERS_CURSOR; --
	 * -- If changes were made to the person record, issue updates. -- IF
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS = 'Y' THEN IF
	 * :SPRIDEN_CURRENT.FOUND_SPBPERS = 'N' THEN
	 * EXECUTE_TRIGGER('INSERT_SPBPERS'); G$_CHECK_FAILURE; -- ELSE
	 * EXECUTE_TRIGGER('UPDATE_SPBPERS'); G$_CHECK_FAILURE; END IF; --
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := ''; EXECUTE_TRIGGER('GET_PERS_INFO');
	 * G$_CHECK_FAILURE; END IF; -- :KEY_BLOCK.ID :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ID; :GLOBAL.KEY_IDNO :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ID; -- EXECUTE_TRIGGER('GET_FULLNAME');
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.POST-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowUpdate
	public void spridenCurrent_AfterRowUpdate(RowAdapterEvent args) {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) args
				.getRow();

		int rowCount = 0;
		{
			String sqlpersCursor = "SELECT 'Y' "
					+ " FROM SPBPERS "
					+ " WHERE SPBPERS.SPBPERS_PIDM = :SPRIDEN_CURRENT_SPRIDEN_PIDM ";
			DataCursor persCursor = new DataCursor(sqlpersCursor);
			try {
				// Setting query parameters
				persCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
						spridenCurrentElement.getSpridenPidm());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable persCursor.
				persCursor.open();
				ResultSet persCursorResults = persCursor.fetchInto();
				if (persCursorResults != null) {
					spridenCurrentElement.setFoundSpbpers(persCursorResults
							.getStr(0));
				}
				if (persCursor.notFound()) {
					spridenCurrentElement.setFoundSpbpers(toStr("N"));
				}
				persCursor.close();
				//
				// If changes were made to the person record, issue updates.
				//
				if (spridenCurrentElement.getChangeSpbpers().equals("Y")) {
					if (spridenCurrentElement.getFoundSpbpers().equals("N")) {
						executeAction("INSERT_SPBPERS");
						getContainer().getGoqrpls().gCheckFailure();
					} else {
						executeAction("UPDATE_SPBPERS");
						getContainer().getGoqrpls().gCheckFailure();
					}
					//
					spridenCurrentElement.setChangeSpbpers(toStr(""));
					executeAction("GET_PERS_INFO");
					getContainer().getGoqrpls().gCheckFailure();
				}
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				getFormModel().getBusinessObject("KEY_BLOCK").setValue("ID",
						spridenCurrentElement.getSpridenId());
				setGlobal("KEY_IDNO", spridenCurrentElement.getSpridenId());
				//
				executeAction("GET_FULLNAME");
				getContainer().getGoqrpls().gCheckFailure();
			} finally {
				persCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-CLRBLK
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>This trigger will clear the block and execute a query. This is done to
	 * 
	 * clear out an erroneous delete.<b>Migration Comments</b> Generated from
	 * trigger: SPRIDEN_CURRENT.KEY-CLRBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRBLK", function = KeyFunction.CLEAR_BLOCK)
	public void spridenCurrent_keyClearBlock() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-CLRREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-CLRREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRREC", function = KeyFunction.CLEAR_RECORD)
	public void spridenCurrent_ClearRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-COMMIT -- --
	 * Check to see if NEXT is being used as the new ID. -- This is an invalid
	 * entry. -- IF :SPRIDEN_CURRENT.SPRIDEN_ID = 'NEXT' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0015','FORM','*ERROR* NEXT is not valid for
	 * this form.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- NEXT_FIELD;
	 * G$_CHECK_FAILURE; PREVIOUS_FIELD; G$_CHECK_FAILURE; -- COMMIT_FORM;
	 * G$_CHECK_FAILURE; -- :KEY_BLOCK.PIDM := :SPRIDEN_CURRENT.SPRIDEN_PIDM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void spridenCurrent_Save() {

		//
		// Check to see if NEXT is being used as the new ID.
		// This is an invalid entry.
		//

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		//
		// Check to see if NEXT is being used as the new ID.
		// This is an invalid entry.
		//
		if (spridenCurrentElement.getSpridenId().equals("NEXT")) {
			errorMessage(GNls.Fget(toStr("GOQCLIB-0015"), toStr("FORM"),
					toStr("*ERROR* NEXT is not valid for this form.")));
			throw new ApplicationException();
		}
		//
		nextItem();
		getContainer().getGoqrpls().gCheckFailure();
		previousItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		commitTask();
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("KEY_BLOCK").setValue("PIDM",
				spridenCurrentElement.getSpridenPidm());
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-CREREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void spridenCurrent_CreateRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-DELREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>This trigger will display messages to inform the user of the
	 * permanancy of
	 * 
	 * this function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void spridenCurrent_DeleteRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-DUP-ITEM
	 * GO_ITEM(:HOLD_BLOCK_FIELD);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-DUP-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUP-ITEM")
	public void spridenCurrent_KeyDupItem() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		goItem(toStr(getFormModel().getBusinessObject("FORM_HEADER").getValue(
				"HOLD_BLOCK_FIELD")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-DUPREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void spridenCurrent_CopyRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-ENTQRY
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void spridenCurrent_Search() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-NXTBLK DECLARE
	 * TEMP_CHANGE_IND VARCHAR2(8); BEGIN NEXT_FIELD; TEMP_CHANGE_IND :=
	 * F_IS_ID_CHANGE; IF TEMP_CHANGE_IND = 'NEW' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0016','FORM','Current identification added,
	 * press SAVE before leaving current window.'));
	 * GO_ITEM(:SYSTEM.CURSOR_ITEM); RAISE FORM_TRIGGER_FAILURE; ELSIF
	 * TEMP_CHANGE_IND = 'CREATE' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0017','FORM','Enter Current identification
	 * information before leaving current window.'));
	 * GO_ITEM(:SYSTEM.CURSOR_ITEM); RAISE FORM_TRIGGER_FAILURE; ELSIF
	 * TEMP_CHANGE_IND = 'CHANGE' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0018','FORM','Current identification changed,
	 * press SAVE before leaving current window.')); ELSIF :SYSTEM.BLOCK_STATUS
	 * = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0019','FORM','Current identification changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void spridenCurrent_NextBlock() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		{
			NString tempChangeInd = NString.getNull();
			nextItem();
			tempChangeInd = this.getContainer().getServices()
					.fIsIdChange(spridenCurrentElement);
			if (tempChangeInd.equals("NEW")) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0016"),
								toStr("FORM"),
//[PATCH] (1)PATCH REPLACE AT ORIGINAL LINE 1172 BY RULE <ErrorMessage>
								toStr("*ERROR* Current identification added, press SAVE before leaving current window.")));
//[END] (1)END OF REPLACE PATCH AT ORIGINAL LINE 1172 BY RULE <ErrorMessage>
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			} else if (tempChangeInd.equals("CREATE")) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0017"),
								toStr("FORM"),
//[PATCH] (2)PATCH REPLACE AT ORIGINAL LINE 1179 BY RULE <ErrorMessage>
								toStr("*ERROR* Enter Current identification information before leaving current window.")));
//[END] (2)END OF REPLACE PATCH AT ORIGINAL LINE 1179 BY RULE <ErrorMessage>
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			} else if (tempChangeInd.equals("CHANGE")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0018"),
								toStr("FORM"),
								toStr("Current identification changed, press SAVE before leaving current window.")));
			} else if (getBlockStatus().equals("CHANGED")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0019"),
								toStr("FORM"),
								toStr("Current identification changed, press SAVE before leaving current window.")));
			} else {
				executeAction("KEY_NXTBLOCK_TRG");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-NXTREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void spridenCurrent_NextRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-NXTSET
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void spridenCurrent_KeyNxtset() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-PRVBLK DECLARE
	 * TEMP_CHANGE_IND VARCHAR2(6); BEGIN NEXT_FIELD; TEMP_CHANGE_IND :=
	 * F_IS_ID_CHANGE; IF TEMP_CHANGE_IND = 'NEW' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0020','FORM','Current identification added,
	 * press SAVE before leaving current window.'));
	 * GO_ITEM(:SYSTEM.CURSOR_ITEM); RAISE FORM_TRIGGER_FAILURE; ELSIF
	 * TEMP_CHANGE_IND = 'CREATE' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0021','FORM','Enter Current identification
	 * information before leaving current window.'));
	 * GO_ITEM(:SYSTEM.CURSOR_ITEM); RAISE FORM_TRIGGER_FAILURE; ELSIF
	 * TEMP_CHANGE_IND = 'CHANGE' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0022','FORM','Current identification changed,
	 * press SAVE before leaving current window.')); ELSIF :SYSTEM.BLOCK_STATUS
	 * = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0023','FORM','Current identification changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void spridenCurrent_PreviousBlock() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		{
			NString tempChangeInd = NString.getNull();
			nextItem();
			tempChangeInd = this.getContainer().getServices()
					.fIsIdChange(spridenCurrentElement);
			if (tempChangeInd.equals("NEW")) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0020"),
								toStr("FORM"),
//[PATCH] (3)PATCH REPLACE AT ORIGINAL LINE 1279 BY RULE <ErrorMessage>
								toStr("*ERROR* Current identification added, press SAVE before leaving current window.")));
//[END] (3)END OF REPLACE PATCH AT ORIGINAL LINE 1279 BY RULE <ErrorMessage>
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			} else if (tempChangeInd.equals("CREATE")) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0021"),
								toStr("FORM"),
//[PATCH] (4)PATCH REPLACE AT ORIGINAL LINE 1286 BY RULE <ErrorMessage>
								toStr("*ERROR* Enter Current identification information before leaving current window.")));
//[END] (4)END OF REPLACE PATCH AT ORIGINAL LINE 1286 BY RULE <ErrorMessage>
				goItem(toStr(getCursorItem()));
				throw new ApplicationException();
			} else if (tempChangeInd.equals("CHANGE")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0022"),
								toStr("FORM"),
								toStr("Current identification changed, press SAVE before leaving current window.")));
			} else if (getBlockStatus().equals("CHANGED")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0023"),
								toStr("FORM"),
								toStr("Current identification changed, press SAVE before leaving current window.")));
			} else {
				executeAction("KEY_PRVBLOCK_TRG");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-PRVREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void spridenCurrent_PreviousRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-SCRDOWN
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-SCRDOWN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-SCRDOWN")
	public void spridenCurrent_KeyScrdown() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.KEY-SCRUP
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.KEY-SCRUP
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-SCRUP")
	public void spridenCurrent_KeyScrup() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CURRENT.CHECK_FIRST_LAST_NAME IF
	 * (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN IF
	 * (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL OR
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME IS NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0024','FORM','*ERROR* Last name and first
	 * name required for a person.')); RAISE FORM_TRIGGER_FAILURE; END IF; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.CHECK_FIRST_LAST_NAME
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_FIRST_LAST_NAME")
	public void spridenCurrent_CheckFirstLastName() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getSpridenEntityInd().equals("P"))) {
			if ((spridenCurrentElement.getSpridenFirstName().isNull() || spridenCurrentElement
					.getSpridenLastName().isNull())) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0024"),
								toStr("FORM"),
								toStr("*ERROR* Last name and first name required for a person.")));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.CHECK_NAME_AND_ID
	 * DECLARE PTI_INTO_TEMP VARCHAR2(1); -- CURSOR PTI_CURSOR IS SELECT 'X'
	 * FROM SPRIDEN WHERE ROWID = :SPRIDEN_CURRENT.ROWID AND SPRIDEN_LAST_NAME =
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME AND ((SPRIDEN_FIRST_NAME =
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME AND
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL) OR
	 * (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C')) AND SPRIDEN_ID =
	 * :SPRIDEN_CURRENT.SPRIDEN_ID; BEGIN -- -- Verify first name is provided
	 * for a person. -- IF (:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0025','FORM','*ERROR* Last name and first
	 * name required for a person.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- --
	 * This trigger step checks if the person exists on the database. If not,
	 * the -- information must be committed (so a PIDM is created for further
	 * processing). -- IF (:SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL AND
	 * (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL OR
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL)) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0026','FORM','*ERROR* Current identification
	 * needs to be added, press SAVE.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * -- This trigger step checks if either the name or id was changed to force
	 * -- the user to commit any changes. -- OPEN PTI_CURSOR; FETCH PTI_CURSOR
	 * INTO PTI_INTO_TEMP; IF PTI_CURSOR%NOTFOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0027','FORM','*ERROR* Current identification
	 * changed; press SAVE.')); CLOSE PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE;
	 * END IF; CLOSE PTI_CURSOR; END;
	 */
	/*
	 * <p>This trigger checks that the last and first names are entered for a
	 * person.
	 * 
	 * It then checks if a new person was added and must be committed or if an
	 * 
	 * existing person was changed and must be committed. Finally, the name
	 * 
	 * information is copied onto subsequent pages.<b>Migration Comments</b>
	 * Generated from trigger: SPRIDEN_CURRENT.CHECK_NAME_AND_ID
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_NAME_AND_ID")
	public void spridenCurrent_CheckNameAndId() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE ROWID = :SPRIDEN_CURRENT_ROWID AND SPRIDEN_LAST_NAME = :SPRIDEN_CURRENT_SPRIDEN_LAST_NAME AND ((SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME AND :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NOT NULL) OR (:SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NULL AND :SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND = 'C')) AND SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//
				// Verify first name is provided for a person.
				//
				if ((spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement
						.getSpridenEntityInd().equals("P"))) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0025"),
									toStr("FORM"),
									toStr("*ERROR* Last name and first name required for a person.")));
					throw new ApplicationException();
				}
				//
				// This trigger step checks if the person exists on the
				// database. If not, the
				// information must be committed (so a PIDM is created for
				// further processing).
				//
				if ((spridenCurrentElement.getSpridenPidm().isNull() && (!spridenCurrentElement
						.getPersLastName().isNull() || !spridenCurrentElement
						.getNonPersName().isNull()))) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0026"),
									toStr("FORM"),
									toStr("*ERROR* Current identification needs to be added, press SAVE.")));
					throw new ApplicationException();
				}
				//
				// This trigger step checks if either the name or id was changed
				// to force
				// the user to commit any changes.
				//
				// Setting query parameters
				ptiCursor.addParameter("SPRIDEN_CURRENT_ROWID",
						spridenCurrentElement.getROWID());
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_LAST_NAME",
						spridenCurrentElement.getSpridenLastName());
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME",
						spridenCurrentElement.getSpridenFirstName());
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND",
						spridenCurrentElement.getSpridenEntityInd());
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
						spridenCurrentElement.getSpridenId());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.notFound()) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0027"),
									toStr("FORM"),
									toStr("*ERROR* Current identification changed; press SAVE.")));
					ptiCursor.close();
					throw new ApplicationException();
				}
				ptiCursor.close();
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CURRENT.CHECK_ORG_SOUNDEX_NAMES DECLARE PTI_INTO_TEMP
	 * VARCHAR2(255); ALERT_BUT VARCHAR2(255); -- CURSOR PTI_CURSOR IS SELECT
	 * 'X' FROM SPRIDEN WHERE ((spriden_soundex_last_name =
	 * soundex(:spriden_current.non_pers_name) AND
	 * :spriden_current.non_pers_name IS NOT NULL) OR
	 * :spriden_current.non_pers_name IS NULL); BEGIN OPEN PTI_CURSOR; FETCH
	 * PTI_CURSOR INTO PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN CLOSE PTI_CURSOR;
	 * -- EXECUTE_TRIGGER('REQUEST_NAME_SEARCH'); G$_CHECK_FAILURE; ELSE CLOSE
	 * PTI_CURSOR; ALERT_BUT :=
	 * G$_DISPLAY_ALERT('',G$_NLS.Get('GOQCLIB-0028','FORM','No similar names
	 * found.')); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.CHECK_ORG_SOUNDEX_NAMES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ORG_SOUNDEX_NAMES")
	public void spridenCurrent_CheckOrgSoundexNames() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			NString alertBut = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE ((spriden_soundex_last_name = soundex(:SPRIDEN_CURRENT_NON_PERS_NAME) AND :SPRIDEN_CURRENT_NON_PERS_NAME IS NOT NULL) OR :SPRIDEN_CURRENT_NON_PERS_NAME IS NULL) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPRIDEN_CURRENT_NON_PERS_NAME",
						spridenCurrentElement.getNonPersName());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.found()) {
					ptiCursor.close();
					//
					executeAction("REQUEST_NAME_SEARCH");
					getContainer().getGoqrpls().gCheckFailure();
				} else {
					ptiCursor.close();
					alertBut = toStr(getContainer().getGoqrpls().gDisplayAlert(
							toStr(""),
							GNls.Fget(toStr("GOQCLIB-0028"), toStr("FORM"),
									toStr("No similar names found."))));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.CHECK_PERS_NONPERS
	 * IF :SPRIDEN_CURRENT.ROWID IS NOT NULL THEN RETURN; ELSE -- -- Verify
	 * person/non-person data -- IF (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0029','FORM','*ERROR* You must enter either
	 * person or non-person name information.')); RAISE FORM_TRIGGER_FAILURE;
	 * END IF; -- IF ((:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NOT NULL) AND
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0030','FORM','*ERROR* You may only enter
	 * person or non-person info; not both.')); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; -- IF ((:SPRIDEN_CURRENT.PERS_PREFIX IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_SUFFIX IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_PREF_FNAME IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NOT NULL) AND
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL) THEN -- :KEY_BLOCK.ENTITY_IND
	 * := ''; MESSAGE(G$_NLS.Get('GOQCLIB-0031','FORM','*ERROR* Can only enter
	 * person or non-person info; not both.')); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; -- -- Set appropriate entity indicators -- IF
	 * (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'P'; :KEY_BLOCK.ENTITY_IND := 'P';
	 * -- ELSE IF (:SPRIDEN_CURRENT.NON_PERS_NAME IS NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0032','FORM','*ERROR* You must enter either a
	 * person name or company name.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'C'; :KEY_BLOCK.ENTITY_IND := 'C';
	 * END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.CHECK_PERS_NONPERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_PERS_NONPERS")
	public void spridenCurrent_CheckPersNonpers() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		if (!(getRecordStatus("spriden_Current") == "NEW" || getRecordStatus("spriden_Current") == "INSERT")) {
			return;
		} else {
			//
			// Verify person/non-person data
			//
			if ((spridenCurrentElement.getPersLastName().isNull()
					&& spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement
					.getNonPersName().isNull())) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0029"),
								toStr("FORM"),
								toStr("*ERROR* You must enter either person or non-person name information.")));
				throw new ApplicationException();
			}
			//
			if (((!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement
					.getPersFirstName().isNull()) && !spridenCurrentElement
					.getNonPersName().isNull())) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0030"),
								toStr("FORM"),
								toStr("*ERROR* You may only enter person or non-person info; not both.")));
				throw new ApplicationException();
			}
			//
			if (((!spridenCurrentElement.getPersPrefix().isNull()
					|| !spridenCurrentElement.getPersSuffix().isNull()
					|| !spridenCurrentElement.getPersPrefFname().isNull() || !spridenCurrentElement
					.getPersSurnamePrefix().isNull()) && !spridenCurrentElement
					.getNonPersName().isNull())) {
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				getFormModel().getBusinessObject("KEY_BLOCK").setValue(
						"ENTITY_IND", "");
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0031"),
								toStr("FORM"),
								toStr("*ERROR* Can only enter person or non-person info; not both.")));
				throw new ApplicationException();
			}
			//
			// Set appropriate entity indicators
			//
			if ((!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement
					.getPersFirstName().isNull())) {
				spridenCurrentElement.setSpridenEntityInd(toStr("P"));
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				getFormModel().getBusinessObject("KEY_BLOCK").setValue(
						"ENTITY_IND", "P");
			} else {
				if ((spridenCurrentElement.getNonPersName().isNull())) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0032"),
									toStr("FORM"),
									toStr("*ERROR* You must enter either a person name or company name.")));
					throw new ApplicationException();
				}
				//
				spridenCurrentElement.setSpridenEntityInd(toStr("C"));
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				getFormModel().getBusinessObject("KEY_BLOCK").setValue(
						"ENTITY_IND", "C");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CURRENT.CHECK_PERS_SOUNDEX_NAMES DECLARE PTI_INTO_TEMP
	 * VARCHAR2(255); ALERT_BUT VARCHAR2(255); -- CURSOR PTI_CURSOR IS SELECT
	 * 'X' FROM SPRIDEN WHERE ((SPRIDEN_SOUNDEX_LAST_NAME =
	 * SOUNDEX(:SPRIDEN_CURRENT.PERS_LAST_NAME) AND
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL) OR
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL) AND ((SPRIDEN_SOUNDEX_FIRST_NAME
	 * = SOUNDEX(:SPRIDEN_CURRENT.PERS_FIRST_NAME) AND
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NOT NULL) OR
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL); -- BEGIN OPEN PTI_CURSOR;
	 * FETCH PTI_CURSOR INTO PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN CLOSE
	 * PTI_CURSOR; -- EXECUTE_TRIGGER('REQUEST_NAME_SEARCH'); G$_CHECK_FAILURE;
	 * ELSE CLOSE PTI_CURSOR; ALERT_BUT :=
	 * G$_DISPLAY_ALERT('',G$_NLS.Get('GOQCLIB-0033','FORM','No similar names
	 * found.')); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.CHECK_PERS_SOUNDEX_NAMES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_PERS_SOUNDEX_NAMES")
	public void spridenCurrent_CheckPersSoundexNames() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			NString alertBut = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE ((SPRIDEN_SOUNDEX_LAST_NAME = SOUNDEX(:SPRIDEN_CURRENT_PERS_LAST_NAME) AND :SPRIDEN_CURRENT_PERS_LAST_NAME IS NOT NULL) OR :SPRIDEN_CURRENT_PERS_LAST_NAME IS NULL) AND ((SPRIDEN_SOUNDEX_FIRST_NAME = SOUNDEX(:SPRIDEN_CURRENT_PERS_FIRST_NAME) AND :SPRIDEN_CURRENT_PERS_FIRST_NAME IS NOT NULL) OR :SPRIDEN_CURRENT_PERS_FIRST_NAME IS NULL) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPRIDEN_CURRENT_PERS_LAST_NAME",
						spridenCurrentElement.getPersLastName());
				ptiCursor.addParameter("SPRIDEN_CURRENT_PERS_FIRST_NAME",
						spridenCurrentElement.getPersFirstName());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.found()) {
					ptiCursor.close();
					//
					executeAction("REQUEST_NAME_SEARCH");
					getContainer().getGoqrpls().gCheckFailure();
				} else {
					ptiCursor.close();
					alertBut = toStr(getContainer().getGoqrpls().gDisplayAlert(
							toStr(""),
							GNls.Fget(toStr("GOQCLIB-0033"), toStr("FORM"),
									toStr("No similar names found."))));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.CHECK_SSN NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.CHECK_SSN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_SSN")
	public void spridenCurrent_CheckSsn() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.COMMIT_SPBPERS
	 * NEXT_ITEM; G$_CHECK_FAILURE; -- PREVIOUS_ITEM; G$_CHECK_FAILURE; -- IF
	 * ((:SPRIDEN_CURRENT.PERS_PREFIX IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_SUFFIX IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_PREF_FNAME IS NOT NULL OR
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NOT NULL) AND
	 * (:SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL)) THEN MESSAGE (
	 * G$_NLS.Get('GOQCLIB-0034', 'FORM','*ERROR* Can only enter person or
	 * non-person info; not both.') ); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * EXECUTE_TRIGGER ('CHECK_FIRST_LAST_NAME'); G$_CHECK_FAILURE; -- IF
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS = 'Y' THEN :SPRIDEN_CURRENT.SPRIDEN_PIDM
	 * := :SPRIDEN_CURRENT.SPRIDEN_PIDM; COMMIT_FORM; G$_CHECK_FAILURE;
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := ''; ELSE COMMIT_FORM;
	 * G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.COMMIT_SPBPERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "COMMIT_SPBPERS")
	public void spridenCurrent_CommitSpbpers() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		nextItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		previousItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (((!spridenCurrentElement.getPersPrefix().isNull()
				|| !spridenCurrentElement.getPersSuffix().isNull()
				|| !spridenCurrentElement.getPersPrefFname().isNull() || !spridenCurrentElement
				.getPersSurnamePrefix().isNull()) && (!spridenCurrentElement
				.getNonPersName().isNull()))) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0034"),
							toStr("FORM"),
							toStr("*ERROR* Can only enter person or non-person info; not both.")));
			throw new ApplicationException();
		}
		//
		executeAction("CHECK_FIRST_LAST_NAME");
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (spridenCurrentElement.getChangeSpbpers().equals("Y")) {
			spridenCurrentElement.setSpridenPidm(spridenCurrentElement
					.getSpridenPidm());
 			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
			spridenCurrentElement.setChangeSpbpers(toStr(""));
		} else {
			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CURRENT.EDIT_EMPLOYEE_STATUS NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.EDIT_EMPLOYEE_STATUS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_EMPLOYEE_STATUS")
	public void spridenCurrent_EditEmployeeStatus() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.GET_FULLNAME
	 * DECLARE LV_MI SPRIDEN.SPRIDEN_MI%TYPE; BEGIN IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P' THEN LV_MI := CASE
	 * NVL(:SPRIDEN_CURRENT.PERS_MI,'*') WHEN '*' THEN '' ELSE
	 * SUBSTR(:SPRIDEN_CURRENT.PERS_MI,1,1) || '.' END; --
	 * G$_BUILD_FULL_NAME(:KEY_BLOCK.FULL_NAME, :SPRIDEN_CURRENT.PERS_LAST_NAME,
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME, LV_MI, :SPRIDEN_CURRENT.PERS_PREFIX,
	 * :SPRIDEN_CURRENT.PERS_SUFFIX, 99, :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX);
	 * ELSE :KEY_BLOCK.FULL_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.GET_FULLNAME
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_FULLNAME")
	public void spridenCurrent_GetFullname() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		Object caseExpressionResult = null;
		{
			NString lvMi = NString.getNull();
			if (spridenCurrentElement.getSpridenEntityInd().equals("P")) {
				if (isNull(spridenCurrentElement.getPersMi(), "*").equals("*")) {
					caseExpressionResult = "";
				}
				lvMi = toStr(caseExpressionResult);
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				Ref<NString> pFullName_ref = new Ref<NString>(
						toStr(getFormModel().getBusinessObject("KEY_BLOCK")
								.getValue("FULL_NAME")));
				getContainer().getGoqrpls().gBuildFullName(pFullName_ref,
						spridenCurrentElement.getPersLastName(),
						spridenCurrentElement.getPersFirstName(), lvMi,
						spridenCurrentElement.getPersPrefix(),
						spridenCurrentElement.getPersSuffix(), toInt(99),
						spridenCurrentElement.getPersSurnamePrefix());
				getFormModel().getBusinessObject("KEY_BLOCK").setValue(
						"FULL_NAME", pFullName_ref.val);
			} else {
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				getFormModel().getBusinessObject("KEY_BLOCK").setValue(
						"FULL_NAME", spridenCurrentElement.getNonPersName());
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.GET_NAME_TYPE
	 * DECLARE CURSOR NTYP_DESC_CURSOR IS SELECT GTVNTYP_DESC FROM GTVNTYP WHERE
	 * GTVNTYP_CODE = :SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE; BEGIN OPEN
	 * NTYP_DESC_CURSOR; FETCH NTYP_DESC_CURSOR INTO
	 * :SPRIDEN_CURRENT.CURRENT_NTYP_DESC; IF NTYP_DESC_CURSOR%NOTFOUND THEN
	 * :SPRIDEN_CURRENT.CURRENT_NTYP_DESC := ''; END IF; CLOSE NTYP_DESC_CURSOR;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.GET_NAME_TYPE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_NAME_TYPE")
	public void spridenCurrent_GetNameType() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlntypDescCursor = "SELECT GTVNTYP_DESC "
					+ " FROM GTVNTYP "
					+ " WHERE GTVNTYP_CODE = :SPRIDEN_CURRENT_SPRIDEN_NTYP_CODE ";
			DataCursor ntypDescCursor = new DataCursor(sqlntypDescCursor);
			try {
				// Setting query parameters
				ntypDescCursor.addParameter(
						"SPRIDEN_CURRENT_SPRIDEN_NTYP_CODE",
						spridenCurrentElement.getSpridenNtypCode());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ntypDescCursor.
				ntypDescCursor.open();
				ResultSet ntypDescCursorResults = ntypDescCursor.fetchInto();
				if (ntypDescCursorResults != null) {
					spridenCurrentElement
							.setCurrentNtypDesc(ntypDescCursorResults.getStr(0));
				}
				if (ntypDescCursor.notFound()) {
					spridenCurrentElement.setCurrentNtypDesc(toStr(""));
				}
				ntypDescCursor.close();
			} finally {
				ntypDescCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.GET_PERS_INFO --
	 * 82-1 add SURNAME_PREFIX DECLARE CURSOR PERS_NAME_CURSOR IS SELECT
	 * SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, SPBPERS_PREF_FIRST_NAME,
	 * SPBPERS_LEGAL_NAME, SPBPERS_SSN, SPBPERS_MRTL_CODE FROM SPBPERS WHERE
	 * SPBPERS_PIDM = :SPRIDEN_CURRENT.SPRIDEN_PIDM; BEGIN
	 * :SPRIDEN_CURRENT.FOUND_SPBPERS := 'Y'; :SPRIDEN_CURRENT.CHANGE_SPBPERS :=
	 * ''; -- OPEN PERS_NAME_CURSOR; FETCH PERS_NAME_CURSOR INTO
	 * :SPRIDEN_CURRENT.PERS_PREFIX, :SPRIDEN_CURRENT.PERS_SUFFIX,
	 * :SPRIDEN_CURRENT.PERS_PREF_FNAME, :SPRIDEN_CURRENT.PERS_LEGAL_NAME,
	 * :SPRIDEN_CURRENT.PERS_SSN, :SPRIDEN_CURRENT.PERS_MRTL_CODE; IF
	 * PERS_NAME_CURSOR%NOTFOUND THEN :SPRIDEN_CURRENT.FOUND_SPBPERS := 'N'; END
	 * IF; CLOSE PERS_NAME_CURSOR; -- IF :SPRIDEN_CURRENT.PERS_MRTL_CODE IS NOT
	 * NULL THEN SELECT STVMRTL_DESC INTO :SPRIDEN_CURRENT.MRTL_DESC FROM
	 * STVMRTL WHERE STVMRTL_CODE = :SPRIDEN_CURRENT.PERS_MRTL_CODE; END IF; --
	 * :SPRIDEN_CURRENT.HOLD_LEGAL_NAME := :SPRIDEN_CURRENT.PERS_LEGAL_NAME;
	 * :SPRIDEN_CURRENT.HOLD_MRTL_CODE := :SPRIDEN_CURRENT.PERS_MRTL_CODE;
	 * :SPRIDEN_CURRENT.HOLD_PREF_FNAME := :SPRIDEN_CURRENT.PERS_PREF_FNAME;
	 * :SPRIDEN_CURRENT.HOLD_PREFIX := :SPRIDEN_CURRENT.PERS_PREFIX;
	 * :SPRIDEN_CURRENT.HOLD_SUFFIX := :SPRIDEN_CURRENT.PERS_SUFFIX;
	 * :SPRIDEN_CURRENT.HOLD_SSN := :SPRIDEN_CURRENT.PERS_SSN; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.GET_PERS_INFO
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_PERS_INFO")
	public void spridenCurrent_GetPersInfo() {

		// 82-1 add SURNAME_PREFIX

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlpersNameCursor = "SELECT SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, SPBPERS_PREF_FIRST_NAME, SPBPERS_LEGAL_NAME, SPBPERS_SSN, SPBPERS_MRTL_CODE "
					+ " FROM SPBPERS "
					+ " WHERE SPBPERS_PIDM = :SPRIDEN_CURRENT_SPRIDEN_PIDM ";
			DataCursor persNameCursor = new DataCursor(sqlpersNameCursor);
			try {
				spridenCurrentElement.setFoundSpbpers(toStr("Y"));
				spridenCurrentElement.setChangeSpbpers(toStr(""));
				//
				// Setting query parameters
				persNameCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
						spridenCurrentElement.getSpridenPidm());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable persNameCursor.
				persNameCursor.open();
				ResultSet persNameCursorResults = persNameCursor.fetchInto();
				if (persNameCursorResults != null) {
					spridenCurrentElement.setPersPrefix(persNameCursorResults
							.getStr(0));
					spridenCurrentElement.setPersSuffix(persNameCursorResults
							.getStr(1));
					spridenCurrentElement
							.setPersPrefFname(persNameCursorResults.getStr(2));
					spridenCurrentElement
							.setPersLegalName(persNameCursorResults.getStr(3));
					spridenCurrentElement.setPersSsn(persNameCursorResults
							.getStr(4));
					spridenCurrentElement.setPersMrtlCode(persNameCursorResults
							.getStr(5));
				}
				if (persNameCursor.notFound()) {
					spridenCurrentElement.setFoundSpbpers(toStr("N"));
				}
				persNameCursor.close();
				//
				if (!spridenCurrentElement.getPersMrtlCode().isNull()) {
					String sql1 = "SELECT STVMRTL_DESC "
							+ " FROM STVMRTL "
							+ " WHERE STVMRTL_CODE = :SPRIDEN_CURRENT_PERS_MRTL_CODE ";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("SPRIDEN_CURRENT_PERS_MRTL_CODE",
							spridenCurrentElement.getPersMrtlCode());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if (results1.hasData()) {
						spridenCurrentElement.setMrtlDesc(results1.getStr(0));
					}
					results1.close();
				}
				//
				spridenCurrentElement.setHoldLegalName(spridenCurrentElement
						.getPersLegalName());
				spridenCurrentElement.setHoldMrtlCode(spridenCurrentElement
						.getPersMrtlCode());
				spridenCurrentElement.setHoldPrefFname(spridenCurrentElement
						.getPersPrefFname());
				spridenCurrentElement.setHoldPrefix(spridenCurrentElement
						.getPersPrefix());
				spridenCurrentElement.setHoldSuffix(spridenCurrentElement
						.getPersSuffix());
				spridenCurrentElement.setHoldSsn(spridenCurrentElement
						.getPersSsn());
			} finally {
				persNameCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.INSERT_SPBPERS
	 * DECLARE lv_rowid VARCHAR2(18); BEGIN GB_BIO.P_CREATE(p_PIDM
	 * =>:SPRIDEN_CURRENT.SPRIDEN_PIDM, p_SSN =>:SPRIDEN_CURRENT.PERS_SSN,
	 * p_MRTL_CODE =>:SPRIDEN_CURRENT.PERS_MRTL_CODE, p_SEX =>'N', p_LEGAL_NAME
	 * =>:SPRIDEN_CURRENT.PERS_LEGAL_NAME, p_PREF_FIRST_NAME
	 * =>:SPRIDEN_CURRENT.PERS_PREF_FNAME, p_NAME_PREFIX
	 * =>:SPRIDEN_CURRENT.PERS_PREFIX, p_NAME_SUFFIX
	 * =>:SPRIDEN_CURRENT.PERS_SUFFIX, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_USER_ID =>:GLOBAL.CURRENT_USER, p_ROWID_OUT =>lv_rowid); --
	 * :SPRIDEN_CURRENT.FOUND_SPBPERS := 'Y'; -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.INSERT_SPBPERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "INSERT_SPBPERS")
	public void spridenCurrent_InsertSpbpers() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		{
			Ref<byte[]> lvRowid = new Ref<byte[]>();
			try {
				// F2J_WARNING : Passing parameters by name is not supported.
				// Please check that the parameters are in the correct order.
				GbBio.pCreate(
						/* pPidm=> */spridenCurrentElement.getSpridenPidm(),
						/* pSsn=> */spridenCurrentElement.getPersSsn(),
						/* pMrtlCode=> */spridenCurrentElement
								.getPersMrtlCode(),
						/* pSex=> */toStr("N"),
						/* pLegalName=> */spridenCurrentElement
								.getPersLegalName(),
						/* pPrefFirstName=> */spridenCurrentElement
								.getPersPrefFname(),
						/* pNamePrefix=> */spridenCurrentElement
								.getPersPrefix(),
						/* pNameSuffix=> */spridenCurrentElement
								.getPersSuffix(),
						/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
						/* pUserId=> */getGlobal("CURRENT_USER"),
						/* pRowidOut=> */lvRowid);
				//
				spridenCurrentElement.setFoundSpbpers(toStr("Y"));
			} catch (Exception e) {
				getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.REQUEST_NAME_SEARCH
	 * DECLARE ALERT_ID ALERT; AL_NAME VARCHAR2(40); ALERT_BUT NUMBER;
	 * ALERT_STRING VARCHAR2(120); ALERT_FORM VARCHAR2(20); BEGIN IF
	 * :which_name_search = 'ORG' THEN ALERT_ID :=
	 * FIND_ALERT('ORG_SEARCH_ALERT'); ELSE ALERT_ID :=
	 * FIND_ALERT('PERS_SEARCH_ALERT'); END IF; -- IF ID_NULL(ALERT_ID) THEN
	 * RAISE FORM_TRIGGER_FAILURE; END IF; -- ALERT_BUT := SHOW_ALERT(ALERT_ID);
	 * IF ALERT_BUT = ALERT_BUTTON1 THEN :GLOBAL.FIRST_NAME :=
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME; :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * :GLOBAL.CALLING_FORM := 'NAME_SEARCH'; -- IF :which_name_search = 'ORG'
	 * THEN :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME; ALERT_FORM :=
	 * 'SOACOMP'; ELSE :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.PERS_LAST_NAME;
	 * ALERT_FORM := 'SOAIDEN'; END IF; -- EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
	 * G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,alert_form,''); --
	 * :GLOBAL.FORM_WAS_CALLED := ''; :GLOBAL.CALLING_FORM := '';
	 * :GLOBAL.FIRST_NAME := ''; :GLOBAL.LAST_NAME := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.REQUEST_NAME_SEARCH
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "REQUEST_NAME_SEARCH")
	public void spridenCurrent_RequestNameSearch() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		{
			AlertDescriptor alertId = null;
			NString alName = NString.getNull();
			NNumber alertBut = NNumber.getNull();
			NString alertString = NString.getNull();
			NString alertForm = NString.getNull();
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			if (getFormModel().getBusinessObject("FORM_HEADER")
					.getValue("WHICH_NAME_SEARCH").equals("ORG")) {
				alertId = findAlert("ORG_SEARCH_ALERT");
			} else {
				alertId = findAlert("PERS_SEARCH_ALERT");
			}
			//
			if ((alertId == null)) {
				throw new ApplicationException();
			}
			//
			alertBut = toNumber(showAlert(alertId));
			if (alertBut.equals(MessageServices.BUTTON1)) {
				setGlobal("FIRST_NAME",
						spridenCurrentElement.getPersFirstName());
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("CALLING_FORM", toStr("NAME_SEARCH"));
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				if (getFormModel().getBusinessObject("FORM_HEADER")
						.getValue("WHICH_NAME_SEARCH").equals("ORG")) {
					setGlobal("LAST_NAME",
							spridenCurrentElement.getNonPersName());
					alertForm = toStr("SOACOMP");
				} else {
					setGlobal("LAST_NAME",
							spridenCurrentElement.getPersLastName());
					alertForm = toStr("SOAIDEN");
				}
				//
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				getContainer().getGoqrpls().gSecuredFormCall(
						getGlobal("CURRENT_USER"), alertForm, toStr(""));
				//
				setGlobal("FORM_WAS_CALLED", toStr(""));
				setGlobal("CALLING_FORM", toStr(""));
				setGlobal("FIRST_NAME", toStr(""));
				setGlobal("LAST_NAME", toStr(""));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.SET_AUDIT_INFO
	 * :SPRIDEN_CURRENT.SPRIDEN_USER := :GLOBAL.CURRENT_USER;
	 * :SPRIDEN_CURRENT.SPRIDEN_ORIGIN := :SYSTEM.CURRENT_FORM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.SET_AUDIT_INFO
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_AUDIT_INFO")
	public void spridenCurrent_SetAuditInfo() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		spridenCurrentElement.setSpridenUser(getGlobal("CURRENT_USER"));
		spridenCurrentElement.setSpridenOrigin(toStr(getCurrentTaskName()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.SET_MRTL_ITEMS IF
	 * :SYSTEM.CURRENT_FORM IN ('APAIDEN', 'PPAIDEN') THEN IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
	 * SET_ITEM_PROPERTY('PERS_MRTL_CODE', ENABLED, PROPERTY_OFF);
	 * SET_ITEM_PROPERTY('PERS_MRTL_CODE_LBT', ENABLED, PROPERTY_OFF); ELSE IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT',
	 * 'PERS_MRTL_CODE') = 'N' THEN SET_ITEM_PROPERTY('PERS_MRTL_CODE', ENABLED,
	 * PROPERTY_ON); SET_ITEM_PROPERTY('PERS_MRTL_CODE_LBT', ENABLED,
	 * PROPERTY_ON); END IF; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.SET_MRTL_ITEMS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_MRTL_ITEMS")
	public void spridenCurrent_SetMrtlItems() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (in(getCurrentTaskName(), "APAIDEN", "PPAIDEN").getValue()) {
			if (spridenCurrentElement.getSpridenEntityInd().equals("C")) {
				setItemEnabled("PERS_MRTL_CODE", false);
				setItemEnabled("PERS_MRTL_CODE_LBT", false);
			} else {
				if (getContainer()
						.getGoqrpls()
						.getGMasks()
						.gDidMaskRestrict(toStr(getCurrentTaskName()),
								toStr("SPRIDEN_CURRENT"),
								toStr("PERS_MRTL_CODE")).equals("N")) {
					setItemEnabled("PERS_MRTL_CODE", true);
					setItemEnabled("PERS_MRTL_CODE_LBT", true);
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.UPDATE_SPBPERS
	 * BEGIN GB_BIO.P_UPDATE(p_PIDM =>:SPRIDEN_CURRENT.SPRIDEN_PIDM, p_SSN
	 * =>:SPRIDEN_CURRENT.PERS_SSN, p_MRTL_CODE
	 * =>:SPRIDEN_CURRENT.PERS_MRTL_CODE, p_NAME_PREFIX
	 * =>:SPRIDEN_CURRENT.PERS_PREFIX, p_NAME_SUFFIX
	 * =>:SPRIDEN_CURRENT.PERS_SUFFIX, p_PREF_FIRST_NAME
	 * =>:SPRIDEN_CURRENT.PERS_PREF_FNAME, p_LEGAL_NAME
	 * =>:SPRIDEN_CURRENT.PERS_LEGAL_NAME, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_USER_ID =>:GLOBAL.CURRENT_USER, p_ROWID =>''); -- EXCEPTION WHEN OTHERS
	 * THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.UPDATE_SPBPERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "UPDATE_SPBPERS")
	public void spridenCurrent_UpdateSpbpers() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbBio.pUpdate(/* pPidm=> */spridenCurrentElement.getSpridenPidm(),
			/* pSsn=> */spridenCurrentElement.getPersSsn(),
			/* pMrtlCode=> */spridenCurrentElement.getPersMrtlCode(),
			/* pNamePrefix=> */spridenCurrentElement.getPersPrefix(),
			/* pNameSuffix=> */spridenCurrentElement.getPersSuffix(),
			/* pPrefFirstName=> */spridenCurrentElement.getPersPrefFname(),
			/* pLegalName=> */spridenCurrentElement.getPersLegalName(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pUserId=> */getGlobal("CURRENT_USER"),
			/* pRowid=> */null);
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CURRENT.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void spridenCurrent_BeforeQuery(QueryEvent args) {

		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"KEY_BLOCK_ID",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
	 * :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRIDEN_ID", function = KeyFunction.ITEM_CHANGE)
	public void spridenId_itemChange() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"HOLD_BLOCK_FIELD", "SPRIDEN_CURRENT.SPRIDEN_ID");
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ID.POST-CHANGE DECLARE
	 * PTI_INTO_TEMP VARCHAR2(255); pii_active VARCHAR2(1) := 'N'; -- CURSOR
	 * PTI_CURSOR1 IS SELECT SPRIDEN_PIDM FROM SPRIDEN WHERE SPRIDEN_ID =
	 * :SPRIDEN_CURRENT.SPRIDEN_ID AND SPRIDEN_PIDM <>
	 * :SPRIDEN_CURRENT.SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND IS NULL; -- CURSOR
	 * PTI_CURSOR2 IS SELECT SPRIDEN_PIDM FROM SPRIDEN WHERE SPRIDEN_ID =
	 * :SPRIDEN_CURRENT.SPRIDEN_ID AND SPRIDEN_CHANGE_IND = 'I' AND SPRIDEN_PIDM
	 * <> :SPRIDEN_CURRENT.SPRIDEN_PIDM; -- -- -- -- 81-4 remove Outer Join to
	 * improve perfomance CURSOR SSN_CURSOR IS SELECT 'X' FROM SPRIDEN, SPBPERS
	 * WHERE SPBPERS_SSN = :SPRIDEN_CURRENT.SPRIDEN_ID AND SPRIDEN_CHANGE_IND IS
	 * NULL AND SPRIDEN_PIDM = SPBPERS_PIDM; -- 81-4 -- AND SPRIDEN_PIDM =
	 * SPBPERS_PIDM(+); -- 81-4 -- -- -- BEGIN G$_CHECK_QUERY_MODE; -- -- This
	 * trigger step checks if the id number was changed for a person who does --
	 * not yet have a PIDM. If so, display an error. -- IF (:GLOBAL.QUERY_MODE =
	 * '1') THEN :GLOBAL.QUERY_MODE := '0'; RETURN; END IF; -- pii_active :=
	 * gokfgac.f_spriden_pii_active; -- -- Check to see if NEXT is being used as
	 * the new ID. -- This is an invalid entry. -- IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ID = 'NEXT' THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0035', 'FORM','NEXT is not valid for this form.') );
	 * RAISE FORM_TRIGGER_FAILURE; END IF; -- IF (:SPRIDEN_CURRENT.SPRIDEN_PIDM
	 * IS NULL AND :KEY_BLOCK.ID <> :SPRIDEN_CURRENT.SPRIDEN_ID) THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0036', 'FORM','*ERROR* You may not change current ID
	 * on an add; change ID in key block.') ); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; -- -- This trigger step checks the changed id to determine if it is
	 * the current -- id of another entity. If it is, an error message is
	 * generated. -- IF pii_active = 'Y' THEN -- spriden pii is active, turn
	 * fgac off gokfgac.p_turn_fgac_off; END IF; OPEN PTI_CURSOR1; FETCH
	 * PTI_CURSOR1 INTO PTI_INTO_TEMP; IF PTI_CURSOR1%FOUND THEN CLOSE
	 * PTI_CURSOR1; MESSAGE(G$_NLS.Get('GOQCLIB-0037','FORM','*ERROR* ID number
	 * entered is current ID number for another person or non-person.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR1; -- -- This trigger step
	 * checks if the changed id number is the previous id of -- another entity.
	 * If it is, an error message is generated. -- OPEN PTI_CURSOR2; FETCH
	 * PTI_CURSOR2 INTO PTI_INTO_TEMP; IF PTI_CURSOR2%FOUND THEN CLOSE
	 * PTI_CURSOR2; MESSAGE(G$_NLS.Get('GOQCLIB-0038','FORM','*ERROR* ID number
	 * entered is previous ID number for another person or non-person.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR2; -- -- -- -- This trigger
	 * step checks if the changed id number is an SSN/SIN/TIN of -- -- --
	 * another entity. If it is, a, error message is generated. This is only
	 * done -- -- -- if SSN Searching is enabled (GUBINST_SSN_SEARCH_ENABLED_IND
	 * = 'Y') -- -- -- IF :GLOBAL.SSN_SEARCH_ENABLED_IND = 'Y' THEN OPEN
	 * SSN_CURSOR; FETCH SSN_CURSOR INTO PTI_INTO_TEMP; IF SSN_CURSOR%FOUND THEN
	 * CLOSE SSN_CURSOR; MESSAGE(G$_NLS.Get('GOQCLIB-0039','FORM','*ERROR* ID
	 * number entered is an SSN/SIN/TIN.')); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * CLOSE SSN_CURSOR; END IF; -- -- -- IF pii_active = 'Y' THEN -- spriden
	 * pii is active, turn fgac on gokfgac.p_turn_fgac_on; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; IF :SPRIDEN_CURRENT.PERS_LAST_NAME is null and
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL THEN -- New ID creation RETURN;
	 * END IF; -- :CHANGE_IDEN := 'Y'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * IF pii_active = 'Y' THEN -- spriden pii is active, turn fgac on
	 * gokfgac.p_turn_fgac_on; END IF; :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ID.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRIDEN_ID")
	public void spridenId_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			NString piiActive = toStr("N");
			String sqlptiCursor1 = "SELECT SPRIDEN_PIDM "
					+ " FROM SPRIDEN "
					+ " WHERE SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT_SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			String sqlptiCursor2 = "SELECT SPRIDEN_PIDM "
					+ " FROM SPRIDEN "
					+ " WHERE SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_CHANGE_IND = 'I' AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT_SPRIDEN_PIDM ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			String sqlssnCursor = "SELECT 'X' "
					+ " FROM SPRIDEN, SPBPERS "
					+ " WHERE SPBPERS_SSN = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM ";
			DataCursor ssnCursor = new DataCursor(sqlssnCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// This trigger step checks if the id number was changed for
					// a person who does
					// not yet have a PIDM. If so, display an error.
					//
					if ((getGlobal("QUERY_MODE").equals("1"))) {
						setGlobal("QUERY_MODE", toStr("0"));
						return;
					}
					//
					piiActive = Gokfgac.fSpridenPiiActive();
					//
					// Check to see if NEXT is being used as the new ID.
					// This is an invalid entry.
					//
					if (spridenCurrentElement.getSpridenId().equals("NEXT")) {
						errorMessage(GNls.Fget(toStr("GOQCLIB-0035"), toStr("FORM"),
//[PATCH] (5)PATCH REPLACE AT ORIGINAL LINE 2508 BY RULE <ErrorMessage>
								toStr("*ERROR* NEXT is not valid for this form.")));
//[END] (5)END OF REPLACE PATCH AT ORIGINAL LINE 2508 BY RULE <ErrorMessage>
						throw new ApplicationException();
					}
					//
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					if ((spridenCurrentElement.getSpridenPidm().isNull() && toStr(
							getFormModel().getBusinessObject("KEY_BLOCK")
									.getValue("ID")).notEquals(
							spridenCurrentElement.getSpridenId()))) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0036"),
										toStr("FORM"),
										toStr("*ERROR* You may not change current ID on an add; change ID in key block.")));
						throw new ApplicationException();
					}
					//
					// This trigger step checks the changed id to determine if
					// it is the current
					// id of another entity. If it is, an error message is
					// generated.
					//
					if (piiActive.equals("Y")) {
						// spriden pii is active, turn fgac off
						Gokfgac.pTurnFgacOff();
					}
					// Setting query parameters
					ptiCursor1.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
							spridenCurrentElement.getSpridenId());
					ptiCursor1.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
							spridenCurrentElement.getSpridenPidm());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor1.
					ptiCursor1.open();
					ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
					if (ptiCursor1Results != null) {
						ptiIntoTemp = ptiCursor1Results.getStr(0);
					}
					if (ptiCursor1.found()) {
						ptiCursor1.close();
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0037"),
										toStr("FORM"),
										toStr("*ERROR* ID number entered is current ID number for another person or non-person.")));
						throw new ApplicationException();
					}
					ptiCursor1.close();
					//
					// This trigger step checks if the changed id number is the
					// previous id of
					// another entity. If it is, an error message is generated.
					//
					// Setting query parameters
					ptiCursor2.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
							spridenCurrentElement.getSpridenId());
					ptiCursor2.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
							spridenCurrentElement.getSpridenPidm());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor2.
					ptiCursor2.open();
					ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
					if (ptiCursor2Results != null) {
						ptiIntoTemp = ptiCursor2Results.getStr(0);
					}
					if (ptiCursor2.found()) {
						ptiCursor2.close();
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0038"),
										toStr("FORM"),
										toStr("*ERROR* ID number entered is previous ID number for another person or non-person.")));
						throw new ApplicationException();
					}
					ptiCursor2.close();
					//
					// -- -- This trigger step checks if the changed id number
					// is an SSN/SIN/TIN of
					// -- -- another entity. If it is, a, error message is
					// generated. This is only done
					// -- -- if SSN Searching is enabled
					// (GUBINST_SSN_SEARCH_ENABLED_IND = 'Y')
					// -- --
					if (getGlobal("SSN_SEARCH_ENABLED_IND").equals("Y")) {
						// Setting query parameters
						ssnCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
								spridenCurrentElement.getSpridenId());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ssnCursor.
						ssnCursor.open();
						ResultSet ssnCursorResults = ssnCursor.fetchInto();
						if (ssnCursorResults != null) {
							ptiIntoTemp = ssnCursorResults.getStr(0);
						}
						if (ssnCursor.found()) {
							ssnCursor.close();
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0039"),
											toStr("FORM"),
											toStr("*ERROR* ID number entered is an SSN/SIN/TIN.")));
							throw new ApplicationException();
						}
						ssnCursor.close();
					}
					// -- --
					if (piiActive.equals("Y")) {
						// spriden pii is active, turn fgac on
						Gokfgac.pTurnFgacOn();
					}
					//
					setGlobal("QUERY_MODE", toStr("0"));
					if (spridenCurrentElement.getPersLastName().isNull()
							&& spridenCurrentElement.getNonPersName().isNull()) {
						// New ID creation
						return;
					}
					//
					spridenCurrentElement.setChangeIden(toStr("Y"));
				} catch (ApplicationException e) {
					if (piiActive.equals("Y")) {
						// spriden pii is active, turn fgac on
						Gokfgac.pTurnFgacOn();
					}
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
				ssnCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ID.KEY-PREV-ITEM IF
	 * NVL(:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND,'C') = 'C' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.NON_PERS_NAME'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',ENABLED) = 'TRUE' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_MRTL_CODE'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',ENABLED) = 'TRUE'
	 * THEN GO_ITEM('SPRIDEN_CURRENT.PERS_LEGAL_NAME'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',ENABLED) = 'TRUE'
	 * THEN GO_ITEM('SPRIDEN_CURRENT.PERS_PREF_FNAME'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SUFFIX',ENABLED) = 'TRUE' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_SUFFIX'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREFIX',ENABLED) = 'TRUE' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_PREFIX'); ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_MI'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ID.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "SPRIDEN_ID", function = KeyFunction.PREVIOUS_ITEM)
	public void spridenId_PreviousItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (isNull(spridenCurrentElement.getSpridenEntityInd(), "C")
				.equals("C")) {
			goItem(toStr("SPRIDEN_CURRENT.NON_PERS_NAME"));
		} else if (getItemEnabled("SPRIDEN_CURRENT.PERS_MRTL_CODE").equals(
				"TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_MRTL_CODE"));
		} else if (getItemEnabled("SPRIDEN_CURRENT.PERS_LEGAL_NAME").equals(
				"TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_LEGAL_NAME"));
		} else if (getItemEnabled("SPRIDEN_CURRENT.PERS_PREF_FNAME").equals(
				"TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_PREF_FNAME"));
		} else if (getItemEnabled("SPRIDEN_CURRENT.PERS_SUFFIX").equals("TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_SUFFIX"));
		} else if (getItemEnabled("SPRIDEN_CURRENT.PERS_PREFIX").equals("TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_PREFIX"));
		} else {
			goItem(toStr("SPRIDEN_CURRENT.PERS_MI"));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRIDEN_NTYP_CODE")
	public void spridenNtypCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRIDEN_NTYP_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spridenNtypCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRIDEN_NTYP_CODE")
	public void spridenNtypCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRIDEN_NTYP_CODE")
	public void spridenNtypCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRIDEN_NTYP_CODE", function = KeyFunction.ITEM_OUT)
	public void spridenNtypCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_NTYP_CODE.WHEN-VALIDATE-ITEM BEGIN
	 * EXECUTE_TRIGGER('GET_NAME_TYPE'); G$_CHECK_FAILURE; --
	 * G$_CHECK_QUERY_MODE; -- IF :SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE IS NULL
	 * THEN :SPRIDEN_CURRENT.CURRENT_NTYP_DESC := ''; ELSE IF
	 * :SPRIDEN_CURRENT.CURRENT_NTYP_DESC IS NULL THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0040', 'FORM','*ERROR* Invalid code; press LIST for
	 * valid codes.') ); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; IF
	 * (:GLOBAL.QUERY_MODE = '0') THEN :CHANGE_IDEN := 'Y'; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_NTYP_CODE")
	public void spridenNtypCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		executeAction("GET_NAME_TYPE");
		getContainer().getGoqrpls().gCheckFailure();
		//
		getContainer().getGoqrpls().gCheckQueryMode();
		//
		if (spridenCurrentElement.getSpridenNtypCode().isNull()) {
			spridenCurrentElement.setCurrentNtypDesc(toStr(""));
		} else {
			if (spridenCurrentElement.getCurrentNtypDesc().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0040"),
								toStr("FORM"),
								toStr("*ERROR* Invalid code; press LIST for valid codes.")));
				throw new ApplicationException();
			}
		}
		if ((getGlobal("QUERY_MODE").equals("0"))) {
			spridenCurrentElement.setChangeIden(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
	 * G$_SEARCH.CODE_KEY_NEXT_ITEM; -- NEXT_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRIDEN_NTYP_CODE", function = KeyFunction.NEXT_ITEM)
	public void spridenNtypCode_keyNexItem() {

		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		//
		nextItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_NTYP_CODE.LIST_VALUES_COPY
	 * COPY(:GLOBAL.VALUE, :SYSTEM.CURSOR_ITEM);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE.LIST_VALUES_COPY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "LIST_VALUES_COPY", item = "SPRIDEN_NTYP_CODE")
	public void spridenNtypCode_ListValuesCopy() {

		ItemDescriptor item = findItem(getCursorItem());
		copy(getGlobal("VALUE"), getCursorItem());
		setItemIsValid(item, false);
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_NTYP_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRIDEN_NTYP_CODE_LBT")
	public void spridenNtypCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * CURRENT_NTYP_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "CURRENT_NTYP_DESC", function = KeyFunction.ITEM_CHANGE)
	public void currentNtypDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SSN.WHEN-VALIDATE-ITEM DECLARE
	 * btn_pressed PLS_INTEGER; pii_active VARCHAR2(1) := 'N'; pti_into_temp
	 * VARCHAR2(1); ssn_item ITEM; lv_error_msg VARCHAR2(200); -- CURSOR
	 * PTI_CURSOR IS SELECT 'X' FROM SPBPERS WHERE SPBPERS_SSN =
	 * :SPRIDEN_CURRENT.PERS_SSN AND SPBPERS_PIDM <>
	 * NVL(:SPRIDEN_CURRENT.SPRIDEN_PIDM,0); -- BEGIN IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SSN',VISIBLE) <> 'TRUE' THEN
	 * RETURN; END IF; -- G$_CHECK_QUERY_MODE; -- IF (:GLOBAL.QUERY_MODE = '1')
	 * THEN :GLOBAL.QUERY_MODE := '0'; RETURN; END IF; -- -- -- -- lv_error_msg
	 * := G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.TRIGGER_ITEM); IF lv_error_msg IS
	 * NOT NULL THEN MESSAGE(lv_error_msg); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * -- -- -- -- pii_active := gokfgac.f_spriden_pii_active; -- -- If the SSN
	 * changes, turn off PII, verify it's unique, if not, give warning. -- IF
	 * (NVL(:SPRIDEN_CURRENT.HOLD_SSN, '!!!') <> NVL(:SPRIDEN_CURRENT.PERS_SSN,
	 * '!!!')) THEN -- -- Turn off PII, if active, and test for existance of
	 * same SSN. -- IF pii_active = 'Y' THEN gokfgac.p_turn_fgac_off; END IF; --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO pti_into_temp; IF PTI_CURSOR%FOUND
	 * THEN IF G$_GET_UPRF_DUP_SSN_ALERT = 'Y' THEN btn_pressed :=
	 * G$_DISPLAY_ALERT('G$_WARNING_ALERT',
	 * G$_NLS.Get('GOQCLIB-0041','FORM','*WARNING* SSN/SIN/TIN already assigned
	 * to another record.')); END IF; END IF; CLOSE PTI_CURSOR; -- -- Turn PII
	 * back on if active. -- IF pii_active = 'Y' THEN gokfgac.p_turn_fgac_on;
	 * END IF; -- :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; --
	 * DEFAULT_VALUE('U','GLOBAL.LOCATION_IND'); IF :GLOBAL.LOCATION_IND = 'C'
	 * AND :SPRIDEN_CURRENT.PERS_SSN IS NOT NULL THEN
	 * EXECUTE_TRIGGER('CHECK_SSN'); G$_CHECK_FAILURE; END IF; -- END IF; --
	 * EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN -- -- Turn PII back on if
	 * active. -- IF pii_active = 'Y' THEN gokfgac.p_turn_fgac_on; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SSN.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_SSN")
	public void persSsn_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NInteger btnPressed = NInteger.getNull();
			NString piiActive = toStr("N");
			NString ptiIntoTemp = NString.getNull();
			ItemDescriptor ssnItem = null;
			NString lvErrorMsg = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPBPERS "
					+ " WHERE SPBPERS_SSN = :SPRIDEN_CURRENT_PERS_SSN AND SPBPERS_PIDM <> NVL(:SPRIDEN_CURRENT_SPRIDEN_PIDM, 0) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					if (getItemVisible("SPRIDEN_CURRENT.PERS_SSN").notEquals(
							"TRUE")) {
						return;
					}
					//
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					if ((getGlobal("QUERY_MODE").equals("1"))) {
						setGlobal("QUERY_MODE", toStr("0"));
						return;
					}
					// --
					// --
					lvErrorMsg = getContainer().getGoqrpls().gSsnValidateMaxLength(
							toStr(getTriggerItem()));
					if (!lvErrorMsg.isNull()) {
						errorMessage(lvErrorMsg);
						throw new ApplicationException();
					}
					// --
					// --
					piiActive = Gokfgac.fSpridenPiiActive();
					//
					// If the SSN changes, turn off PII, verify it's unique, if
					// not, give warning.
					//
					if ((isNull(spridenCurrentElement.getHoldSsn(), "!!!")
							.notEquals(isNull(
									spridenCurrentElement.getPersSsn(), "!!!")))) {
						//
						// Turn off PII, if active, and test for existance of
						// same SSN.
						//
						if (piiActive.equals("Y")) {
							Gokfgac.pTurnFgacOff();
						}
						//
						// Setting query parameters
						ptiCursor.addParameter("SPRIDEN_CURRENT_PERS_SSN",
								spridenCurrentElement.getPersSsn());
						ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
								spridenCurrentElement.getSpridenPidm());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if (ptiCursorResults != null) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if (ptiCursor.found()) {
							if (getContainer().getGoqrpls().gGetUprfDupSsnAlert()
									.equals("Y")) {
								btnPressed = toInt(getContainer()
										.getGoqrpls()
										.gDisplayAlert(
												toStr("G$_WARNING_ALERT"),
												GNls.Fget(
														toStr("GOQCLIB-0041"),
														toStr("FORM"),
														toStr("*WARNING* SSN/SIN/TIN already assigned to another record."))));
							}
						}
						ptiCursor.close();
						//
						// Turn PII back on if active.
						//
						if (piiActive.equals("Y")) {
							Gokfgac.pTurnFgacOn();
						}
						//
						spridenCurrentElement.setChangeSpbpers(toStr("Y"));
						spridenCurrentElement
								.setSpridenActivityDate(spridenCurrentElement
										.getSpridenActivityDate());
						//
						setDefaultValue("U", "GLOBAL.LOCATION_IND");
						if (getGlobal("LOCATION_IND").equals("C")
								&& !spridenCurrentElement.getPersSsn().isNull()) {
							executeAction("CHECK_SSN");
							getContainer().getGoqrpls().gCheckFailure();
						}
					}
				} catch (ApplicationException e) {
					//
					// Turn PII back on if active.
					//
					if (piiActive.equals("Y")) {
						Gokfgac.pTurnFgacOn();
					}
					//
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SSN.WHEN-NEW-ITEM-INSTANCE
	 * BEGIN :GLOBAL.PRE_SSN := :SPRIDEN_CURRENT.PERS_SSN;
	 * G$_SSN_SET_ITEM_HINT(:SYSTEM.CURSOR_ITEM); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SSN.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PERS_SSN", function = KeyFunction.ITEM_CHANGE)
	public void persSsn_itemChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		setGlobal("PRE_SSN", spridenCurrentElement.getPersSsn());
		getContainer().getGoqrpls().gSsnSetItemHint(toStr(getCursorItem()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SSN.KEY-NEXT-ITEM IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.NON_PERS_NAME'); ELSE IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT',
	 * 'PERS_SURNAME_PREFIX') = 'N' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_SURNAME_PREFIX'); ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_LAST_NAME'); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SSN.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "PERS_SSN", function = KeyFunction.NEXT_ITEM)
	public void persSsn_keyNexItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (spridenCurrentElement.getSpridenEntityInd().equals("C")) {
			goItem(toStr("SPRIDEN_CURRENT.NON_PERS_NAME"));
		} else {
			if (getContainer()
					.getGoqrpls()
					.getGMasks()
					.gDidMaskRestrict(toStr(getCurrentTaskName()),
							toStr("SPRIDEN_CURRENT"),
							toStr("PERS_SURNAME_PREFIX")).equals("N")) {
				goItem(toStr("SPRIDEN_CURRENT.PERS_SURNAME_PREFIX"));
			} else {
				goItem(toStr("SPRIDEN_CURRENT.PERS_LAST_NAME"));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * PERS_SURNAME_PREFIX.WHEN-VALIDATE-ITEM BEGIN G$_CHECK_QUERY_MODE; IF
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NOT NULL THEN -- IF
	 * (:GLOBAL.QUERY_MODE = '0') THEN -- IF
	 * G$_NCHK(NOT((:SPRIDEN_CURRENT.PERS_SURNAME_PREFIX <>
	 * :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX OR
	 * (:SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NOT NULL) OR
	 * (:SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX IS NOT NULL AND
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NULL)) AND
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL)) THEN G$_CHECK_VALUE
	 * ((:SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL), G$_NLS.Get('GOQCLIB-0042',
	 * 'FORM','*ERROR* Can only enter person or non-person info; not both.') ,
	 * TRUE, TRUE); END IF; -- :CHANGE_IDEN := 'Y'; END IF; --
	 * :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX :=
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX; -- :GLOBAL.QUERY_MODE := '0'; ELSE
	 * IF (:SPRIDEN_CURRENT.NON_PERS_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX := NULL;
	 * 
	 * END IF; IF :GLOBAL.QUERY_MODE = '0' THEN :CHANGE_IDEN := 'Y'; END IF;
	 * :GLOBAL.QUERY_MODE := '0'; END IF; EXCEPTION WHEN FORM_TRIGGER_FAILURE
	 * THEN :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_SURNAME_PREFIX")
	public void persSurnamePrefix_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			if (!spridenCurrentElement.getPersSurnamePrefix().isNull()) {
				//
				if ((getGlobal("QUERY_MODE").equals("0"))) {
					//
					if (getContainer()
							.getGoqrpls()
							.gNchk(toBool(!((spridenCurrentElement
									.getPersSurnamePrefix().notEquals(
											spridenCurrentElement
													.getSpridenSurnamePrefix())
									|| (spridenCurrentElement
											.getSpridenSurnamePrefix().isNull() && !spridenCurrentElement
											.getPersSurnamePrefix().isNull()) || (!spridenCurrentElement
									.getSpridenSurnamePrefix().isNull() && spridenCurrentElement
									.getPersSurnamePrefix().isNull())) && spridenCurrentElement
									.getNonPersName().isNull()))).getValue()) {
						getContainer()
								.getGoqrpls()
								.gCheckValue(
										(toBool(!spridenCurrentElement
												.getNonPersName().isNull())),
										GNls.Fget(
												toStr("GOQCLIB-0042"),
												toStr("FORM"),
												toStr("*ERROR* Can only enter person or non-person info; not both.")),
										toBool(NBool.True), toBool(NBool.True));
					}
					//
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				//
				spridenCurrentElement
						.setSpridenSurnamePrefix(spridenCurrentElement
								.getPersSurnamePrefix());
				//
				setGlobal("QUERY_MODE", toStr("0"));
			} else {
				if ((spridenCurrentElement.getNonPersName().isNull() && !spridenCurrentElement
						.getPersSurnamePrefix().isNull())) {
					spridenCurrentElement.setPersSurnamePrefix(toStr(null));
				}
				if (getGlobal("QUERY_MODE").equals("0")) {
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				setGlobal("QUERY_MODE", toStr("0"));
			}
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SURNAME_PREFIX.POST-TEXT-ITEM
	 * IF :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX IS NOT NULL THEN IF
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NULL THEN
	 * :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX :=
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SURNAME_PREFIX.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PERS_SURNAME_PREFIX", function = KeyFunction.ITEM_OUT)
	public void persSurnamePrefix_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (!spridenCurrentElement.getSpridenSurnamePrefix().isNull()) {
			if (spridenCurrentElement.getPersSurnamePrefix().isNull()) {
				spridenCurrentElement
						.setSpridenSurnamePrefix(spridenCurrentElement
								.getPersSurnamePrefix());
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_LAST_NAME.KEY-CQUERY IF
	 * (:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL) THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0043', 'FORM','*ERROR* Last Name or First Name is
	 * required for this function') ); RAISE FORM_TRIGGER_FAILURE; ELSE
	 * EXECUTE_TRIGGER ('CHECK_PERS_SOUNDEX_NAMES'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LAST_NAME.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PERS_LAST_NAME", function = KeyFunction.COUNT_QUERY)
	public void persLastName_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement
				.getPersLastName().isNull())) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0043"),
							toStr("FORM"),
							toStr("*ERROR* Last Name or First Name is required for this function")));
			throw new ApplicationException();
		} else {
			executeAction("CHECK_PERS_SOUNDEX_NAMES");
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_LAST_NAME.WHEN-VALIDATE-ITEM
	 * BEGIN IF :SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL THEN
	 * G$_CHECK_QUERY_MODE; -- IF (:GLOBAL.QUERY_MODE = '0') THEN -- IF
	 * G$_NCHK(NOT(:SPRIDEN_CURRENT.NON_PERS_NAME IS NULL AND
	 * (:SPRIDEN_CURRENT.SPRIDEN_LAST_NAME <> :SPRIDEN_CURRENT.PERS_LAST_NAME OR
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME IS NULL))) THEN G$_CHECK_VALUE
	 * ((:SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL), G$_NLS.Get('GOQCLIB-0044',
	 * 'FORM','*ERROR* Can only enter person or non-person info; not both.') ,
	 * TRUE, TRUE); END IF; :CHANGE_IDEN := 'Y'; -- END IF; --
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'P';
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME := :SPRIDEN_CURRENT.PERS_LAST_NAME; --
	 * :GLOBAL.QUERY_MODE := '0'; ELSE IF (:SPRIDEN_CURRENT.NON_PERS_NAME IS
	 * NULL AND :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME := NULL; END IF; END IF; EXCEPTION
	 * WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LAST_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_LAST_NAME")
	public void persLastName_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			if (!spridenCurrentElement.getPersLastName().isNull()) {
				getContainer().getGoqrpls().gCheckQueryMode();
				//
				if ((getGlobal("QUERY_MODE").equals("0"))) {
					//
					if (getContainer()
							.getGoqrpls()
							.gNchk(toBool(!(spridenCurrentElement
									.getNonPersName().isNull() && (spridenCurrentElement
									.getSpridenLastName().notEquals(
											spridenCurrentElement
													.getPersLastName()) || spridenCurrentElement
									.getSpridenLastName().isNull()))))
							.getValue()) {
						getContainer()
								.getGoqrpls()
								.gCheckValue(
										(toBool(!spridenCurrentElement
												.getNonPersName().isNull())),
										GNls.Fget(
												toStr("GOQCLIB-0044"),
												toStr("FORM"),
												toStr("*ERROR* Can only enter person or non-person info; not both.")),
										toBool(NBool.True), toBool(NBool.True));
					}
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				//
				spridenCurrentElement.setSpridenEntityInd(toStr("P"));
				spridenCurrentElement.setSpridenLastName(spridenCurrentElement
						.getPersLastName());
				//
				setGlobal("QUERY_MODE", toStr("0"));
			} else {
				if ((spridenCurrentElement.getNonPersName().isNull() && !spridenCurrentElement
						.getSpridenLastName().isNull())) {
					spridenCurrentElement.setSpridenLastName(toStr(null));
				}
			}
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_LAST_NAME.KEY-PREV-ITEM IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT',
	 * 'PERS_SURNAME_PREFIX') = 'N' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_SURNAME_PREFIX'); -- ELSIF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT',
	 * 'PERS_SSN') = 'N' THEN GO_ITEM('SPRIDEN_CURRENT.PERS_SSN'); -- ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',VISIBLE) = 'TRUE' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_MRTL_CODE'); -- ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LAST_NAME.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "PERS_LAST_NAME", function = KeyFunction.PREVIOUS_ITEM)
	public void persLastName_PreviousItem() {

		if (getContainer()
				.getGoqrpls()
				.getGMasks()
				.gDidMaskRestrict(toStr(getCurrentTaskName()),
						toStr("SPRIDEN_CURRENT"), toStr("PERS_SURNAME_PREFIX"))
				.equals("N")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_SURNAME_PREFIX"));
		} else if (getContainer()
				.getGoqrpls()
				.getGMasks()
				.gDidMaskRestrict(toStr(getCurrentTaskName()),
						toStr("SPRIDEN_CURRENT"), toStr("PERS_SSN"))
				.equals("N")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_SSN"));
		} else if (getItemVisible("SPRIDEN_CURRENT.PERS_MRTL_CODE").equals(
				"TRUE")) {
			goItem(toStr("SPRIDEN_CURRENT.PERS_MRTL_CODE"));
		} else {
			goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE"));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * LAST_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "LAST_NAME_SRCH_BTN")
	public void lastNameSrchBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * LAST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED :WHICH_NAME_SEARCH := 'PERSON';
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_LAST_NAME'); DO_KEY ('COUNT_QUERY');
	 * G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * LAST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "LAST_NAME_SRCH_BTN")
	public void lastNameSrchBtn_buttonClick() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"WHICH_NAME_SEARCH", "PERSON");
		goItem(toStr("SPRIDEN_CURRENT.PERS_LAST_NAME"));
		executeAction("COUNT_QUERY");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_FIRST_NAME.KEY-CQUERY IF
	 * (:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL) THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0045', 'FORM','*ERROR* Last Name or First Name is
	 * required for this function') ); RAISE FORM_TRIGGER_FAILURE; ELSE
	 * EXECUTE_TRIGGER ('CHECK_PERS_SOUNDEX_NAMES'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_FIRST_NAME.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PERS_FIRST_NAME", function = KeyFunction.COUNT_QUERY)
	public void persFirstName_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getPersFirstName().isNull() && spridenCurrentElement
				.getPersLastName().isNull())) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0045"),
							toStr("FORM"),
							toStr("*ERROR* Last Name or First Name is required for this function")));
			throw new ApplicationException();
		} else {
			executeAction("CHECK_PERS_SOUNDEX_NAMES");
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_FIRST_NAME.WHEN-VALIDATE-ITEM
	 * BEGIN IF :SPRIDEN_CURRENT.PERS_FIRST_NAME IS NOT NULL THEN
	 * G$_CHECK_QUERY_MODE; -- IF (:GLOBAL.QUERY_MODE = '0') THEN -- IF
	 * G$_NCHK(NOT(:SPRIDEN_CURRENT.NON_PERS_NAME IS NULL AND
	 * (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME <> :SPRIDEN_CURRENT.PERS_FIRST_NAME
	 * OR :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL))) THEN
	 * G$_CHECK_VALUE((:SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL),
	 * G$_NLS.Get('GOQCLIB-0046', 'FORM','*ERROR* You may enter person or
	 * non_person info; not both.') , TRUE, TRUE); END IF; :CHANGE_IDEN := 'Y';
	 * -- END IF; -- :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME :=
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME; -- :GLOBAL.QUERY_MODE := '0'; -- ELSE
	 * IF (:SPRIDEN_CURRENT.NON_PERS_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME := NULL; END IF; END IF; EXCEPTION
	 * WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_FIRST_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_FIRST_NAME")
	public void persFirstName_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			if (!spridenCurrentElement.getPersFirstName().isNull()) {
				getContainer().getGoqrpls().gCheckQueryMode();
				//
				if ((getGlobal("QUERY_MODE").equals("0"))) {
					//
					if (getContainer()
							.getGoqrpls()
							.gNchk(toBool(!(spridenCurrentElement
									.getNonPersName().isNull() && (spridenCurrentElement
									.getSpridenFirstName().notEquals(
											spridenCurrentElement
													.getPersFirstName()) || spridenCurrentElement
									.getSpridenFirstName().isNull()))))
							.getValue()) {
						getContainer()
								.getGoqrpls()
								.gCheckValue(
										(toBool(!spridenCurrentElement
												.getNonPersName().isNull())),
										GNls.Fget(
												toStr("GOQCLIB-0046"),
												toStr("FORM"),
												toStr("*ERROR* You may enter person or non_person info; not both.")),
										toBool(NBool.True), toBool(NBool.True));
					}
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				//
				spridenCurrentElement.setSpridenFirstName(spridenCurrentElement
						.getPersFirstName());
				//
				setGlobal("QUERY_MODE", toStr("0"));
			} else {
				if ((spridenCurrentElement.getNonPersName().isNull() && !spridenCurrentElement
						.getSpridenFirstName().isNull())) {
					spridenCurrentElement.setSpridenFirstName(toStr(null));
				}
			}
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_FIRST_NAME.POST-TEXT-ITEM IF
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL THEN IF :PERS_FIRST_NAME
	 * IS NULL THEN :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME := :PERS_FIRST_NAME; END
	 * IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_FIRST_NAME.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PERS_FIRST_NAME", function = KeyFunction.ITEM_OUT)
	public void persFirstName_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (!spridenCurrentElement.getSpridenFirstName().isNull()) {
			if (spridenCurrentElement.getPersFirstName().isNull()) {
				spridenCurrentElement.setSpridenFirstName(spridenCurrentElement
						.getPersFirstName());
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FIRST_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "FIRST_NAME_SRCH_BTN")
	public void firstNameSrchBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * FIRST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED :WHICH_NAME_SEARCH := 'PERSON';
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_FIRST_NAME'); DO_KEY ('COUNT_QUERY');
	 * G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FIRST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "FIRST_NAME_SRCH_BTN")
	public void firstNameSrchBtn_buttonClick() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"WHICH_NAME_SEARCH", "PERSON");
		goItem(toStr("SPRIDEN_CURRENT.PERS_FIRST_NAME"));
		executeAction("COUNT_QUERY");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MI.POST-TEXT-ITEM IF
	 * :SPRIDEN_CURRENT.SPRIDEN_MI IS NOT NULL THEN IF :SPRIDEN_CURRENT.PERS_MI
	 * IS NULL THEN :SPRIDEN_CURRENT.SPRIDEN_MI := :SPRIDEN_CURRENT.PERS_MI; END
	 * IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MI.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PERS_MI", function = KeyFunction.ITEM_OUT)
	public void persMi_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (!spridenCurrentElement.getSpridenMi().isNull()) {
			if (spridenCurrentElement.getPersMi().isNull()) {
				spridenCurrentElement.setSpridenMi(spridenCurrentElement
						.getPersMi());
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MI.WHEN-VALIDATE-ITEM BEGIN
	 * G$_CHECK_QUERY_MODE; IF :SPRIDEN_CURRENT.PERS_MI IS NOT NULL THEN -- IF
	 * (:GLOBAL.QUERY_MODE = '0') THEN -- IF
	 * G$_NCHK(NOT((:SPRIDEN_CURRENT.PERS_MI <> :SPRIDEN_CURRENT.SPRIDEN_MI OR
	 * (:SPRIDEN_CURRENT.SPRIDEN_MI IS NULL AND :SPRIDEN_CURRENT.PERS_MI IS NOT
	 * NULL) OR (:SPRIDEN_CURRENT.SPRIDEN_MI IS NOT NULL AND
	 * :SPRIDEN_CURRENT.PERS_MI IS NULL)) AND :SPRIDEN_CURRENT.NON_PERS_NAME IS
	 * NULL)) THEN G$_CHECK_VALUE ((:SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL),
	 * G$_NLS.Get('GOQCLIB-0047', 'FORM','*ERROR* Can only enter person or
	 * non-person info; not both.') , TRUE, TRUE); END IF; -- :CHANGE_IDEN :=
	 * 'Y'; END IF; -- :SPRIDEN_CURRENT.SPRIDEN_MI := :SPRIDEN_CURRENT.PERS_MI;
	 * -- :GLOBAL.QUERY_MODE := '0'; ELSE IF (:SPRIDEN_CURRENT.NON_PERS_NAME IS
	 * NULL AND :SPRIDEN_CURRENT.PERS_MI IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.PERS_MI := NULL;
	 * 
	 * END IF; IF :GLOBAL.QUERY_MODE = '0' THEN :CHANGE_IDEN := 'Y'; END IF;
	 * :GLOBAL.QUERY_MODE := '0'; END IF; EXCEPTION WHEN FORM_TRIGGER_FAILURE
	 * THEN :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MI.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_MI")
	public void persMi_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			if (!spridenCurrentElement.getPersMi().isNull()) {
				//
				if ((getGlobal("QUERY_MODE").equals("0"))) {
					//
					if (getContainer()
							.getGoqrpls()
							.gNchk(toBool(!((spridenCurrentElement.getPersMi()
									.notEquals(
											spridenCurrentElement
													.getSpridenMi())
									|| (spridenCurrentElement.getSpridenMi()
											.isNull() && !spridenCurrentElement
											.getPersMi().isNull()) || (!spridenCurrentElement
									.getSpridenMi().isNull() && spridenCurrentElement
									.getPersMi().isNull())) && spridenCurrentElement
									.getNonPersName().isNull()))).getValue()) {
						getContainer()
								.getGoqrpls()
								.gCheckValue(
										(toBool(!spridenCurrentElement
												.getNonPersName().isNull())),
										GNls.Fget(
												toStr("GOQCLIB-0047"),
												toStr("FORM"),
												toStr("*ERROR* Can only enter person or non-person info; not both.")),
										toBool(NBool.True), toBool(NBool.True));
					}
					//
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				//
				spridenCurrentElement.setSpridenMi(spridenCurrentElement
						.getPersMi());
				//
				setGlobal("QUERY_MODE", toStr("0"));
			} else {
				if ((spridenCurrentElement.getNonPersName().isNull() && !spridenCurrentElement
						.getPersMi().isNull())) {
					spridenCurrentElement.setPersMi(toStr(null));
				}
				if (getGlobal("QUERY_MODE").equals("0")) {
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				setGlobal("QUERY_MODE", toStr("0"));
			}
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_PREFIX.WHEN-VALIDATE-ITEM IF
	 * (NVL(:SPRIDEN_CURRENT.HOLD_PREFIX, '!!!') <>
	 * NVL(:SPRIDEN_CURRENT.PERS_PREFIX, '!!!')) THEN
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_PREFIX.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_PREFIX")
	public void persPrefix_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((isNull(spridenCurrentElement.getHoldPrefix(), "!!!")
				.notEquals(isNull(spridenCurrentElement.getPersPrefix(), "!!!")))) {
			spridenCurrentElement.setChangeSpbpers(toStr("Y"));
			spridenCurrentElement.setSpridenActivityDate(NDate.getNow());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_PREFIX.KEY-COMMIT
	 * EXECUTE_TRIGGER('COMMIT_SPBPERS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_PREFIX.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PERS_PREFIX", function = KeyFunction.SAVE)
	public void persPrefix_Save() {

		executeAction("COMMIT_SPBPERS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SUFFIX.WHEN-VALIDATE-ITEM IF
	 * (NVL(:SPRIDEN_CURRENT.HOLD_SUFFIX, '!!!') <>
	 * NVL(:SPRIDEN_CURRENT.PERS_SUFFIX, '!!!')) THEN
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SUFFIX.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_SUFFIX")
	public void persSuffix_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((isNull(spridenCurrentElement.getHoldSuffix(), "!!!")
				.notEquals(isNull(spridenCurrentElement.getPersSuffix(), "!!!")))) {
			spridenCurrentElement.setChangeSpbpers(toStr("Y"));
			spridenCurrentElement.setSpridenActivityDate(spridenCurrentElement
					.getSpridenActivityDate());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SUFFIX.KEY-COMMIT
	 * EXECUTE_TRIGGER('COMMIT_SPBPERS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SUFFIX.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PERS_SUFFIX", function = KeyFunction.SAVE)
	public void persSuffix_Save() {

		executeAction("COMMIT_SPBPERS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_PREF_FNAME.WHEN-VALIDATE-ITEM
	 * IF (NVL(:SPRIDEN_CURRENT.HOLD_PREF_FNAME,'!!!') <>
	 * NVL(:SPRIDEN_CURRENT.PERS_PREF_FNAME,'!!!')) THEN
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_PREF_FNAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_PREF_FNAME")
	public void persPrefFname_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((isNull(spridenCurrentElement.getHoldPrefFname(), "!!!")
				.notEquals(isNull(spridenCurrentElement.getPersPrefFname(),
						"!!!")))) {
			spridenCurrentElement.setChangeSpbpers(toStr("Y"));
			spridenCurrentElement.setSpridenActivityDate(NDate.getNow());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_PREF_FNAME.KEY-COMMIT
	 * EXECUTE_TRIGGER('COMMIT_SPBPERS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_PREF_FNAME.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PERS_PREF_FNAME", function = KeyFunction.SAVE)
	public void persPrefFname_Save() {

		executeAction("COMMIT_SPBPERS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LEGAL_NAME.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "PERS_LEGAL_NAME", function = KeyFunction.NEXT_ITEM)
	public void persLegalName_keyNexItem() {

		nextItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_LEGAL_NAME.WHEN-VALIDATE-ITEM
	 * IF (NVL(:SPRIDEN_CURRENT.HOLD_LEGAL_NAME,'!!!') <>
	 * NVL(:SPRIDEN_CURRENT.PERS_LEGAL_NAME,'!!!')) THEN
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LEGAL_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_LEGAL_NAME")
	public void persLegalName_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((isNull(spridenCurrentElement.getHoldLegalName(), "!!!")
				.notEquals(isNull(spridenCurrentElement.getPersLegalName(),
						"!!!")))) {
			spridenCurrentElement.setChangeSpbpers(toStr("Y"));
			spridenCurrentElement.setSpridenActivityDate(spridenCurrentElement
					.getSpridenActivityDate());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_LEGAL_NAME.KEY-COMMIT
	 * 
	 * -- EXECUTE_TRIGGER('COMMIT_SPBPERS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_LEGAL_NAME.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PERS_LEGAL_NAME", function = KeyFunction.SAVE)
	public void persLegalName_Save() {

		//
		//
		executeAction("COMMIT_SPBPERS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "PERS_MRTL_CODE")
	public void persMrtlCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PERS_MRTL_CODE", function = KeyFunction.ITEM_CHANGE)
	public void persMrtlCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "PERS_MRTL_CODE")
	public void persMrtlCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "PERS_MRTL_CODE")
	public void persMrtlCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PERS_MRTL_CODE", function = KeyFunction.ITEM_OUT)
	public void persMrtlCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MRTL_CODE.WHEN-VALIDATE-ITEM
	 * IF (NVL(:SPRIDEN_CURRENT.HOLD_MRTL_CODE,'!!!') <>
	 * NVL(:SPRIDEN_CURRENT.PERS_MRTL_CODE,'!!!')) THEN
	 * :SPRIDEN_CURRENT.CHANGE_SPBPERS := 'Y';
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE :=
	 * :SPRIDEN_CURRENT.SPRIDEN_ACTIVITY_DATE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "PERS_MRTL_CODE")
	public void persMrtlCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (!spridenCurrentElement.getPersMrtlCode().isNull())
			this.persMrtlCode_PostChange();

		if ((isNull(spridenCurrentElement.getHoldMrtlCode(), "!!!")
				.notEquals(isNull(spridenCurrentElement.getPersMrtlCode(),
						"!!!")))) {
			spridenCurrentElement.setChangeSpbpers(toStr("Y"));
			spridenCurrentElement.setSpridenActivityDate(spridenCurrentElement
					.getSpridenActivityDate());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MRTL_CODE.POST-CHANGE DECLARE
	 * CURSOR PTI_CURSOR IS SELECT STVMRTL_DESC FROM STVMRTL WHERE STVMRTL_CODE
	 * = :SPRIDEN_CURRENT.PERS_MRTL_CODE; BEGIN OPEN PTI_CURSOR; FETCH
	 * PTI_CURSOR INTO :SPRIDEN_CURRENT.MRTL_DESC; IF PTI_CURSOR%NOTFOUND THEN
	 * MESSAGE( G$_NLS.Get('GOQCLIB-0048', 'FORM','*ERROR* Invalid code; press
	 * LIST for valid codes') ); CLOSE PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE;
	 * ELSE CLOSE PTI_CURSOR; END IF; -- IF :SPRIDEN_CURRENT.PERS_MRTL_CODE IS
	 * NULL THEN :SPRIDEN_CURRENT.MRTL_DESC := ''; RETURN; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "PERS_MRTL_CODE")
	public void persMrtlCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if(spridenCurrentElement.getPersMrtlCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVMRTL_DESC " + " FROM STVMRTL "	+ " WHERE STVMRTL_CODE = :SPRIDEN_CURRENT_PERS_MRTL_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPRIDEN_CURRENT_PERS_MRTL_CODE", spridenCurrentElement.getPersMrtlCode());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spridenCurrentElement.setMrtlDesc(ptiCursorResults.getStr(0));
				}
				if (ptiCursor.notFound()) {
					errorMessage(GNls.Fget(toStr("GOQCLIB-0048"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")));
					ptiCursor.close();
					throw new ApplicationException();
				} else {
					ptiCursor.close();
				}
				//
				if (spridenCurrentElement.getPersMrtlCode().isNull()) {
					spridenCurrentElement.setMrtlDesc(toStr(""));
					return;
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MRTL_CODE.KEY-NEXT-ITEM
	 * G$_SEARCH.CODE_KEY_NEXT_ITEM; -- IF :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND
	 * IS NULL OR :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.NON_PERS_NAME'); ELSE
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_ID'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "PERS_MRTL_CODE", function = KeyFunction.NEXT_ITEM)
	public void persMrtlCode_keyNexItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		//
		if (spridenCurrentElement.getSpridenEntityInd().isNull()
				|| spridenCurrentElement.getSpridenEntityInd().equals("C")) {
			goItem(toStr("SPRIDEN_CURRENT.NON_PERS_NAME"));
		} else {
			goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_MRTL_CODE.KEY_NXTKEY
	 * DO_KEY('LIST_VALUES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE.KEY_NXTKEY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY_NXTKEY", item = "PERS_MRTL_CODE")
	public void persMrtlCode_KeyNxtkey() {

		executeAction("LIST_VALUES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_MRTL_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "PERS_MRTL_CODE_LBT")
	public void persMrtlCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MRTL_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "MRTL_DESC", function = KeyFunction.ITEM_CHANGE)
	public void mrtlDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER NON_PERS_NAME.KEY-CQUERY IF
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0049', 'FORM','*ERROR* Non-person Name is required
	 * for this function') ); RAISE FORM_TRIGGER_FAILURE; ELSE
	 * EXECUTE_TRIGGER('CHECK_ORG_SOUNDEX_NAMES'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NON_PERS_NAME.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "NON_PERS_NAME", function = KeyFunction.COUNT_QUERY)
	public void nonPersName_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (spridenCurrentElement.getNonPersName().isNull()) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0049"),
							toStr("FORM"),
							toStr("*ERROR* Non-person Name is required for this function")));
			throw new ApplicationException();
		} else {
			executeAction("CHECK_ORG_SOUNDEX_NAMES");
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER NON_PERS_NAME.WHEN-VALIDATE-ITEM
	 * BEGIN IF :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL THEN
	 * G$_CHECK_QUERY_MODE; -- IF (:GLOBAL.QUERY_MODE = '0') THEN -- IF
	 * G$_NCHK(NOT(:SPRIDEN_CURRENT.PERS_FIRST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL AND
	 * (:SPRIDEN_CURRENT.SPRIDEN_LAST_NAME <> :SPRIDEN_CURRENT.NON_PERS_NAME OR
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME IS NULL) AND
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NULL AND :SPRIDEN_CURRENT.PERS_MI
	 * IS NULL)) THEN G$_CHECK_VALUE(NOT(:SPRIDEN_CURRENT.PERS_FIRST_NAME IS
	 * NULL AND :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX IS NULL AND
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL AND :SPRIDEN_CURRENT.PERS_MI IS
	 * NULL), G$_NLS.Get('GOQCLIB-0050', 'FORM','*ERROR* Can only enter person
	 * or non-person info; not both.') ,TRUE,TRUE);
	 * 
	 * END IF; :CHANGE_IDEN := 'Y'; -- END IF; --
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := 'C';
	 * :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX := '';
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME;
	 * :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME := ''; :SPRIDEN_CURRENT.SPRIDEN_MI :=
	 * ''; -- :GLOBAL.QUERY_MODE := '0'; ELSE
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND := ''; IF
	 * (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL AND
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME IS NOT NULL) THEN
	 * :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME := NULL; END IF; END IF;
	 * 
	 * EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NON_PERS_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "NON_PERS_NAME")
	public void nonPersName_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		try {
			if (!spridenCurrentElement.getNonPersName().isNull()) {
				getContainer().getGoqrpls().gCheckQueryMode();
				//
				if ((getGlobal("QUERY_MODE").equals("0"))) {
					//
					if (getContainer()
							.getGoqrpls()
							.gNchk(toBool(!(spridenCurrentElement
									.getPersFirstName().isNull()
									&& spridenCurrentElement.getPersLastName()
											.isNull()
									&& (spridenCurrentElement
											.getSpridenLastName().notEquals(
													spridenCurrentElement
															.getNonPersName()) || spridenCurrentElement
											.getSpridenLastName().isNull())
									&& spridenCurrentElement
											.getPersSurnamePrefix().isNull() && spridenCurrentElement
									.getPersMi().isNull()))).getValue()) {
						getContainer()
								.getGoqrpls()
								.gCheckValue(
										toBool(!(spridenCurrentElement
												.getPersFirstName().isNull()
												&& spridenCurrentElement
														.getPersSurnamePrefix()
														.isNull()
												&& spridenCurrentElement
														.getPersLastName()
														.isNull() && spridenCurrentElement
												.getPersMi().isNull())),
										GNls.Fget(
												toStr("GOQCLIB-0050"),
												toStr("FORM"),
												toStr("*ERROR* Can only enter person or non-person info; not both.")),
										toBool(NBool.True), toBool(NBool.True));
					}
					spridenCurrentElement.setChangeIden(toStr("Y"));
				}
				//
				spridenCurrentElement.setSpridenEntityInd(toStr("C"));
				spridenCurrentElement.setSpridenSurnamePrefix(toStr(""));
				spridenCurrentElement.setSpridenLastName(spridenCurrentElement
						.getNonPersName());
				spridenCurrentElement.setSpridenFirstName(toStr(""));
				spridenCurrentElement.setSpridenMi(toStr(""));
				//
				setGlobal("QUERY_MODE", toStr("0"));
			} else {
				spridenCurrentElement.setSpridenEntityInd(toStr(""));
				if ((spridenCurrentElement.getPersLastName().isNull() && !spridenCurrentElement
						.getSpridenLastName().isNull())) {
					spridenCurrentElement.setSpridenLastName(toStr(null));
				}
			}
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER NON_PERS_NAME.KEY-PREV-ITEM IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND IS NULL OR
	 * :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL THEN PREVIOUS_ITEM; ELSE IF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_SSN',VISIBLE) = 'TRUE' THEN
	 * GO_ITEM('SPRIDEN_CURRENT.PERS_SSN'); ELSIF
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_MRTL_CODE',VISIBLE) = 'TRUE' AND
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_CURRENT',
	 * 'PERS_MRTL_CODE') = 'N' THEN GO_ITEM('SPRIDEN_CURRENT.PERS_MRTL_CODE');
	 * ELSE GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE'); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NON_PERS_NAME.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "NON_PERS_NAME", function = KeyFunction.PREVIOUS_ITEM)
	public void nonPersName_PreviousItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if (spridenCurrentElement.getSpridenEntityInd().isNull()
				|| spridenCurrentElement.getNonPersName().isNull()) {
			previousItem();
		} else {
			if (getItemVisible("SPRIDEN_CURRENT.PERS_SSN").equals("TRUE")) {
				goItem(toStr("SPRIDEN_CURRENT.PERS_SSN"));
			} else if (getItemVisible("SPRIDEN_CURRENT.PERS_MRTL_CODE").equals(
					"TRUE")
					&& getContainer()
							.getGoqrpls()
							.getGMasks()
							.gDidMaskRestrict(toStr(getCurrentTaskName()),
									toStr("SPRIDEN_CURRENT"),
									toStr("PERS_MRTL_CODE")).equals("N")) {
				goItem(toStr("SPRIDEN_CURRENT.PERS_MRTL_CODE"));
			} else {
				goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_NTYP_CODE"));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER NON_PERS_NAME.KEY-NEXT-ITEM
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_ID');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NON_PERS_NAME.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "NON_PERS_NAME", function = KeyFunction.NEXT_ITEM)
	public void nonPersName_keyNexItem() {

		goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ID"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * NON_PERS_NAME.WHEN-NEW-ITEM-INSTANCE IF GET_ITEM_PROPERTY
	 * ('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', ENABLED) = 'FALSE' AND
	 * GET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', VISIBLE) = 'TRUE'
	 * THEN SET_ITEM_PROPERTY('SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN', ENABLED,
	 * PROPERTY_ON); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NON_PERS_NAME.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "NON_PERS_NAME", function = KeyFunction.ITEM_CHANGE)
	public void nonPersName_itemChange() {

		if (getItemEnabled("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN").equals("FALSE")
				&& getItemVisible("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN").equals(
						"TRUE")) {
			setItemEnabled("SPRIDEN_CURRENT.ORG_NAME_SRCH_BTN", true);
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * ORG_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "ORG_NAME_SRCH_BTN")
	public void orgNameSrchBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * ORG_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED :WHICH_NAME_SEARCH := 'ORG';
	 * GO_ITEM('NON_PERS_NAME'); DO_KEY('COUNT_QUERY');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * ORG_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "ORG_NAME_SRCH_BTN")
	public void orgNameSrchBtn_buttonClick() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"WHICH_NAME_SEARCH", "ORG");
		goItem(toStr("NON_PERS_NAME"));
		executeAction("COUNT_QUERY");
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_USER.KEY-PREV-ITEM
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_ORIGIN');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_USER.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "SPRIDEN_USER", function = KeyFunction.PREVIOUS_ITEM)
	public void spridenUser_PreviousItem() {

		goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_ORIGIN"));
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRIDEN_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void spridenActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRIDEN_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spridenActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRIDEN_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void spridenActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ORIGIN.KEY-NEXT-ITEM
	 * GO_ITEM('SPRIDEN_CURRENT.SPRIDEN_USER');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ORIGIN.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRIDEN_ORIGIN", function = KeyFunction.NEXT_ITEM)
	public void spridenOrigin_keyNexItem() {

		goItem(toStr("SPRIDEN_CURRENT.SPRIDEN_USER"));
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CREATE_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRIDEN_CREATE_DATE", function = KeyFunction.NEXT_ITEM)
	public void spridenCreateDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CREATE_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRIDEN_CREATE_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spridenCreateDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CREATE_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRIDEN_CREATE_DATE", function = KeyFunction.ITEM_OUT)
	public void spridenCreateDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_MI.POST-CHANGE IF
	 * (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN :SPRIDEN_CURRENT.PERS_MI
	 * := :SPRIDEN_CURRENT.SPRIDEN_MI; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_MI.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRIDEN_MI")
	public void spridenMi_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getSpridenEntityInd().equals("P"))) {
			spridenCurrentElement.setPersMi(spridenCurrentElement
					.getSpridenMi());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_FIRST_NAME.POST-CHANGE IF
	 * (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN
	 * :SPRIDEN_CURRENT.PERS_FIRST_NAME := :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME;
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_FIRST_NAME.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRIDEN_FIRST_NAME")
	public void spridenFirstName_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getSpridenEntityInd().equals("P"))) {
			spridenCurrentElement.setPersFirstName(spridenCurrentElement
					.getSpridenFirstName());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_SURNAME_PREFIX.POST-CHANGE
	 * IF (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN
	 * :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX :=
	 * :SPRIDEN_CURRENT.SPRIDEN_SURNAME_PREFIX; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_SURNAME_PREFIX.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRIDEN_SURNAME_PREFIX")
	public void spridenSurnamePrefix_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getSpridenEntityInd().equals("P"))) {
			spridenCurrentElement.setPersSurnamePrefix(spridenCurrentElement
					.getSpridenSurnamePrefix());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_LAST_NAME.POST-CHANGE IF
	 * (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'P') THEN
	 * :SPRIDEN_CURRENT.PERS_LAST_NAME := :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME;
	 * END IF; IF (:SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C') THEN
	 * :SPRIDEN_CURRENT.NON_PERS_NAME := :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_LAST_NAME.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRIDEN_LAST_NAME")
	public void spridenLastName_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		if ((spridenCurrentElement.getSpridenEntityInd().equals("P"))) {
			spridenCurrentElement.setPersLastName(spridenCurrentElement
					.getSpridenLastName());
		}
		if ((spridenCurrentElement.getSpridenEntityInd().equals("C"))) {
			spridenCurrentElement.setNonPersName(spridenCurrentElement
					.getSpridenLastName());
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_ID.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_ID")
	public void spridenId_validate() {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if (!spridenCurrentElement.getSpridenId().isNull())
			this.spridenId_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_MI.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_MI")
	public void spridenMi_validate() {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if (!spridenCurrentElement.getSpridenMi().isNull())
			this.spridenMi_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_FIRST_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_FIRST_NAME")
	public void spridenFirstName_validate() {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if (!spridenCurrentElement.getSpridenFirstName().isNull())
			this.spridenFirstName_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_SURNAME_PREFIX")
	public void spridenSurnamePrefix_validate() {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if (!spridenCurrentElement.getSpridenSurnamePrefix().isNull())
			this.spridenSurnamePrefix_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_LAST_NAME.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRIDEN_LAST_NAME")
	public void spridenLastName_validate() {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		if (!spridenCurrentElement.getSpridenLastName().isNull())
			this.spridenLastName_PostChange();

	}

	public void spridenNtypCode_doubleClick() {
		spridenNtypCode_WhenMouseDoubleclick();
		
	}

	public void persMrtlCode_doubleClick() {
		persMrtlCode_WhenMouseDoubleclick();
		
	}

}
