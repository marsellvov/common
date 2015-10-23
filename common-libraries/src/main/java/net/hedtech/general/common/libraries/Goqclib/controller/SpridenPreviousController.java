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

public class SpridenPreviousController extends AbstractSupportCodeObject {

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

	public SpridenPreviousController(ISupportCodeContainer container) {
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
	 * SPRIDEN_PREVIOUS.WHEN-NEW-BLOCK-INSTANCE
	 * G$_NAVIGATION_FRAME.POPULATE_GUROPTM; -- -- Determine whether or not to
	 * display the name based on type of entity. -- IF
	 * :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C' THEN
	 * SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',DISPLAYED,PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY
	 * ('SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',DISPLAYED,PROPERTY_FALSE); ELSE IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_PREVIOUS',
	 * 'SPRIDEN_SURNAME_PREFIX') = 'N' THEN IF
	 * GET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',DISPLAYED) <>
	 * 'TRUE' THEN SET_ITEM_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',DISPLAYED,PROPERTY_TRUE); END
	 * IF; END IF; IF GET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',DISPLAYED)
	 * <> 'TRUE' THEN
	 * SET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',DISPLAYED,PROPERTY_TRUE);
	 * END IF; IF
	 * GET_ITEM_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',DISPLAYED) <>
	 * 'TRUE' THEN SET_ITEM_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',DISPLAYED,PROPERTY_TRUE); END IF;
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void spridenPrevious_blockChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		getContainer().getGoqrpls().getGNavigationFrame().populateGuroptm();
		//
		// Determine whether or not to display the name based on type of entity.
		//
		if (spridenCurrentElement.getSpridenEntityInd().equals("C")) {
			setItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_MI", false);
			setItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME", false);
		} else {
			if (getContainer()
					.getGoqrpls()
					.getGMasks()
					.gDidMaskRestrict(toStr(getCurrentTaskName()),
							toStr("SPRIDEN_PREVIOUS"),
							toStr("SPRIDEN_SURNAME_PREFIX")).equals("N")) {
				if (getItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX")
						.notEquals("TRUE")) {
					setItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
							true);
				}
			}
			if (getItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_MI").notEquals("TRUE")) {
				setItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_MI", true);
			}
			if (getItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME")
					.notEquals("TRUE")) {
				setItemVisible("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME", true);
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_PREVIOUS.WHEN-NEW-RECORD-INSTANCE -- -- Determine whether enable
	 * or disable items. -- IF :SPRIDEN_PREVIOUS.ROWID IS NULL THEN
	 * EXECUTE_TRIGGER('ENABLE_ITEMS'); ELSE EXECUTE_TRIGGER('DISABLE_ITEMS');
	 * END IF; -- IF :SYSTEM.MODE <> 'ENTER-QUERY' THEN IF
	 * :SPRIDEN_PREVIOUS.ROWID IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0051','FORM','*NOTE* Press Duplicate Record
	 * to copy information from alternate record or select type of change from
	 * available list')); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.WHEN-NEW-RECORD-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE", function = KeyFunction.RECORD_CHANGE)
	public void spridenPrevious_recordChange() {

		//
		// Determine whether enable or disable items.
		//

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		//
		// Determine whether enable or disable items.
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		if (getRecordStatus("spriden_Previous") == "NEW"
				|| getRecordStatus("spriden_Previous") == "INSERT") {
			executeAction("ENABLE_ITEMS");
		} else {
			executeAction("DISABLE_ITEMS");
		}
		//
		if (!getMode().equals("ENTER-QUERY")) {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			if (spridenPreviousElement.getRowState().equals(DataRowStatus.INSERTED)) {
				infoMessage(GNls
						.Fget(toStr("GOQCLIB-0051"),
								toStr("FORM"),
								toStr("*NOTE* Press Duplicate Record to copy information from alternate record or select type of change from available list")));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_PREVIOUS.WHEN-NEW-ITEM-INSTANCE DECLARE the_alert PLS_INTEGER;
	 * BEGIN IF :SYSTEM.MODE = 'ENTER-QUERY' THEN RETURN; END IF; -- IF
	 * :SPRIDEN_PREVIOUS.ROWID IS NULL AND :SYSTEM.CURSOR_ITEM <>
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND' AND :SYSTEM.CURSOR_ITEM <>
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE' AND
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND IS NULL THEN -- SET_ALERT_PROPERTY(
	 * 'G$_INFO_ALERT',ALERT_MESSAGE_TEXT,G$_NLS.Get('GOQCLIB-0052','FORM','Please
	 * select the type of change from available list.')); the_alert :=
	 * SHOW_ALERT('G$_INFO_ALERT'); RAISE FORM_TRIGGER_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", function = KeyFunction.ITEM_CHANGE)
	public void spridenPrevious_itemChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		{
			NInteger theAlert = NInteger.getNull();
			if (getMode().equals("ENTER-QUERY")) {
				return;
			}
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			if ((getRecordStatus("spriden_Previous") == "NEW" || getRecordStatus("spriden_Previous") == "INSERT")
					&& getCursorItem().notEquals(
							"SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND")
					&& getCursorItem().notEquals(
							"SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE")
					&& spridenPreviousElement.getSpridenChangeInd().isNull()) {
				//
				setAlertMessageText(
						"G$_INFO_ALERT",
						GNls.Fget(
								toStr("GOQCLIB-0052"),
								toStr("FORM"),
								toStr("Please select the type of change from available list.")));
				theAlert = toInt(showAlert("G$_INFO_ALERT"));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.POST-QUERY BEGIN
	 * :SPRIDEN_PREVIOUS.PREVIOUS_NTYP_DESC :=
	 * GB_GTVNTYP.F_GET_DESCRIPTION(:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE); --
	 * EXECUTE_TRIGGER('DISABLE_ITEMS'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void spridenPrevious_AfterQuery(RowAdapterEvent args) {

		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		spridenPreviousElement.setPreviousNtypDesc(GbGtvntyp
				.fGetDescription(spridenPreviousElement.getSpridenNtypCode()));
		//
		executeAction("DISABLE_ITEMS");
	}

	@BeforeQuery
	public void spridenPrevious_BeforeQuery(QueryEvent args) {
		setBlockWhereClause(
				"SPRIDEN_PREVIOUS",
				toStr("(spriden_change_ind IS NOT NULL and SPRIDEN_PIDM=:PIDM)"));

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.PRE-DELETE DECLARE
	 * PTI_INTO_TEMP VARCHAR2(1); -- CURSOR PTI_CURSOR IS SELECT 'X' FROM
	 * SPRIDEN WHERE SPRIDEN_PIDM = :SPRIDEN_CURRENT.SPRIDEN_PIDM AND
	 * SPRIDEN_CHANGE_IND = 'N' AND SPRIDEN_ID <> :SPRIDEN_CURRENT.SPRIDEN_ID
	 * AND SPRIDEN_ID = :SPRIDEN_PREVIOUS.SPRIDEN_ID; BEGIN OPEN PTI_CURSOR;
	 * FETCH PTI_CURSOR INTO PTI_INTO_TEMP; IF PTI_CURSOR%NOTFOUND THEN CLOSE
	 * PTI_CURSOR; RETURN; ELSE CLOSE PTI_CURSOR; END IF; -- UPDATE SPRIDEN SET
	 * SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID WHERE SPRIDEN_CHANGE_IND = 'N'
	 * AND SPRIDEN_PIDM = :SPRIDEN_CURRENT.SPRIDEN_PIDM AND SPRIDEN_ID =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ID; -- IF SQL%NOTFOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0053','FORM','*ERROR* System error when
	 * resetting name change to current ID.')); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.PRE-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowDelete
	public void spridenPrevious_BeforeRowDelete(RowAdapterEvent args) {

		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE SPRIDEN_PIDM = :SPRIDEN_CURRENT_SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND = 'N' AND SPRIDEN_ID <> :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
						spridenCurrentElement.getSpridenPidm());
				ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
						spridenCurrentElement.getSpridenId());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID",
						spridenPreviousElement.getSpridenId());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.notFound()) {
					ptiCursor.close();
					return;
				} else {
					ptiCursor.close();
				}
				//
				String sql1 = "UPDATE SPRIDEN "
						+ "SET SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID "
						+ " WHERE SPRIDEN_CHANGE_IND = 'N' AND SPRIDEN_PIDM = :SPRIDEN_CURRENT_SPRIDEN_PIDM AND SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID";
				DataCommand command1 = new DataCommand(sql1);
				// Setting query parameters
				command1.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID",
						spridenCurrentElement.getSpridenId());
				command1.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
						spridenCurrentElement.getSpridenPidm());
				command1.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID",
						spridenPreviousElement.getSpridenId());
				rowCount = command1.execute();
				//
				if (rowCount == 0) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0053"),
									toStr("FORM"),
									toStr("*ERROR* System error when resetting name change to current ID.")));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.ON-DELETE -- 82-1
	 * add SURNAME_PREFIX BEGIN GB_IDENTIFICATION.P_DELETE(p_PIDM
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_PIDM, p_ID =>:SPRIDEN_PREVIOUS.SPRIDEN_ID,
	 * p_LAST_NAME =>:SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME, p_FIRST_NAME
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME, p_MI
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_MI, p_CHANGE_IND
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND, p_NTYP_CODE
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE, p_SURNAME_PREFIX
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX, p_ROWID
	 * =>:SPRIDEN_PREVIOUS.ROWID); EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void spridenPrevious_RowDelete(RowAdapterEvent args) {

		// 82-1 add SURNAME_PREFIX
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbIdentification.pDelete(/* pPidm=> */spridenPreviousElement
					.getSpridenPidm(),
			/* pId=> */spridenPreviousElement.getSpridenId(),
			/* pLastName=> */spridenPreviousElement.getSpridenLastName(),
			/* pFirstName=> */spridenPreviousElement.getSpridenFirstName(),
			/* pMi=> */spridenPreviousElement.getSpridenMi(),
			/* pChangeInd=> */spridenPreviousElement.getSpridenChangeInd(),
			/* pNtypCode=> */spridenPreviousElement.getSpridenNtypCode(),
			/* pSurnamePrefix=> */spridenPreviousElement
					.getSpridenSurnamePrefix(),
			/* pRowid=> */spridenPreviousElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.PRE-INSERT -- 82-1
	 * add SPRIDEN_SURNAME_PREFIX to check for unique name DECLARE PTI_INTO_TEMP
	 * VARCHAR2(1); the_alert NUMBER; pii_active VARCHAR2(1) := 'N'; -- CURSOR
	 * PTI_CURSOR1 IS SELECT 'X' FROM SPRIDEN WHERE SPRIDEN_ID =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ID AND SPRIDEN_PIDM <>
	 * :SPRIDEN_PREVIOUS.SPRIDEN_PIDM; -- CURSOR PTI_CURSOR2 IS -- 82-1 SELECT
	 * 'X' FROM SPRIDEN WHERE NVL(SPRIDEN_SURNAME_PREFIX,' ') =
	 * NVL(:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX,' ') AND
	 * NVL(SPRIDEN_NTYP_CODE,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE,' ')
	 * AND NVL(SPRIDEN_MI,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_MI,' ') AND
	 * NVL(SPRIDEN_FIRST_NAME,' ') =
	 * NVL(:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME,' ') AND SPRIDEN_LAST_NAME =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME AND SPRIDEN_ID =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ID AND SPRIDEN_PIDM =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_PIDM; -- BEGIN pii_active :=
	 * gokfgac.f_spriden_pii_active; -- -- Check if NEXT is being used as ID.
	 * This is invalid -- IF :SPRIDEN_PREVIOUS.SPRIDEN_ID = 'NEXT' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0054','FORM','NEXT is not a valid ID.'));
	 * RAISE FORM_TRIGGER_FAILURE; END IF; -- Turn off PII IF pii_active = 'Y'
	 * THEN gokfgac.p_turn_fgac_off; END IF; -- -- Check the uniqueness of the
	 * new ID -- OPEN PTI_CURSOR1; FETCH PTI_CURSOR1 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR1%FOUND THEN CLOSE PTI_CURSOR1;
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0055','FORM','*ERROR* ID has already been
	 * added to database.')); RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE
	 * PTI_CURSOR1; -- -- Check for uniqueness of the spriden record -- OPEN
	 * PTI_CURSOR2; FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP; IF PTI_CURSOR2%FOUND
	 * THEN CLOSE PTI_CURSOR2; MESSAGE(G$_NLS.Get('GOQCLIB-0056','FORM','*ERROR*
	 * This record already exists')); RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE
	 * PTI_CURSOR2; -- -- Turn on PII -- IF pii_active = 'Y' THEN
	 * gokfgac.p_turn_fgac_on; END IF; -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0057','FORM','*ERROR* Invalid Change
	 * Indicator value.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ID IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0058','FORM','*ERROR* Invalid ID; Enter valid
	 * ID.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0059','FORM','*ERROR* Invalid Name; Enter
	 * valid Name.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND = 'P' AND
	 * :SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0060','FORM','*ERROR* Invalid First Name;
	 * Enter valid Name.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :SPRIDEN_PREVIOUS.SPRIDEN_USER := :GLOBAL.CURRENT_USER;
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN := :SYSTEM.CURRENT_FORM;
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CREATE_USER := :GLOBAL.CURRENT_USER;
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CREATE_DATE := SYSDATE; EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN IF pii_active = 'Y' THEN -- spriden pii is
	 * active, turn fgac on gokfgac.p_turn_fgac_on; END IF; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void spridenPrevious_BeforeRowInsert(RowAdapterEvent args) {

		// 82-1 add SPRIDEN_SURNAME_PREFIX to check for unique name
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			NNumber theAlert = NNumber.getNull();
			NString piiActive = toStr("N");
			String sqlptiCursor1 = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID AND SPRIDEN_PIDM <> :SPRIDEN_PREVIOUS_SPRIDEN_PIDM ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			String sqlptiCursor2 = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE NVL(SPRIDEN_SURNAME_PREFIX, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX, ' ') AND NVL(SPRIDEN_NTYP_CODE, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE, ' ') AND NVL(SPRIDEN_MI, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_MI, ' ') AND NVL(SPRIDEN_FIRST_NAME, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME, ' ') AND SPRIDEN_LAST_NAME = :SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME AND SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID AND SPRIDEN_PIDM = :SPRIDEN_PREVIOUS_SPRIDEN_PIDM ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			try {
				try {
					piiActive = Gokfgac.fSpridenPiiActive();
					//
					// Check if NEXT is being used as ID. This is invalid
					//
					if (spridenPreviousElement.getSpridenId().equals("NEXT")) {
						errorMessage(GNls.Fget(toStr("GOQCLIB-0054"), toStr("FORM"),
								toStr("NEXT is not a valid ID.")));
						throw new ApplicationException();
					}
					// Turn off PII
					if (piiActive.equals("Y")) {
						Gokfgac.pTurnFgacOff();
					}
					//
					// Check the uniqueness of the new ID
					//
					// Setting query parameters
					ptiCursor1.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID",
							spridenPreviousElement.getSpridenId());
					ptiCursor1.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_PIDM",
							spridenPreviousElement.getSpridenPidm());
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
								.Fget(toStr("GOQCLIB-0055"),
										toStr("FORM"),
										toStr("*ERROR* ID has already been added to database.")));
						throw new ApplicationException();
					}
					ptiCursor1.close();
					//
					// Check for uniqueness of the spriden record
					//
					// Setting query parameters
					ptiCursor2.addParameter(
							"SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX",
							spridenPreviousElement.getSpridenSurnamePrefix());
					ptiCursor2.addParameter(
							"SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE",
							spridenPreviousElement.getSpridenNtypCode());
					ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_MI",
							spridenPreviousElement.getSpridenMi());
					ptiCursor2.addParameter(
							"SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME",
							spridenPreviousElement.getSpridenFirstName());
					ptiCursor2.addParameter(
							"SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME",
							spridenPreviousElement.getSpridenLastName());
					ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID",
							spridenPreviousElement.getSpridenId());
					ptiCursor2.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_PIDM",
							spridenPreviousElement.getSpridenPidm());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor2.
					ptiCursor2.open();
					ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
					if (ptiCursor2Results != null) {
						ptiIntoTemp = ptiCursor2Results.getStr(0);
					}
					if (ptiCursor2.found()) {
						ptiCursor2.close();
						errorMessage(GNls.Fget(toStr("GOQCLIB-0056"), toStr("FORM"),
								toStr("*ERROR* This record already exists")));
						throw new ApplicationException();
					}
					ptiCursor2.close();
					//
					// Turn on PII
					//
					if (piiActive.equals("Y")) {
						Gokfgac.pTurnFgacOn();
					}
					//
					if (spridenPreviousElement.getSpridenChangeInd().isNull()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0057"),
										toStr("FORM"),
										toStr("*ERROR* Invalid Change Indicator value.")));
						throw new ApplicationException();
					}
					//
					if (spridenPreviousElement.getSpridenId().isNull()) {
						errorMessage(GNls.Fget(toStr("GOQCLIB-0058"), toStr("FORM"),
								toStr("*ERROR* Invalid ID; Enter valid ID.")));
						throw new ApplicationException();
					}
					//
					if (spridenPreviousElement.getSpridenLastName().isNull()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0059"),
										toStr("FORM"),
										toStr("*ERROR* Invalid Name; Enter valid Name.")));
						throw new ApplicationException();
					}
					//
					if (spridenPreviousElement.getSpridenEntityInd()
							.equals("P")
							&& spridenPreviousElement.getSpridenFirstName()
									.isNull()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0060"),
										toStr("FORM"),
										toStr("*ERROR* Invalid First Name; Enter valid Name.")));
						throw new ApplicationException();
					}
					//
					spridenPreviousElement
							.setSpridenUser(getGlobal("CURRENT_USER"));
					spridenPreviousElement
							.setSpridenOrigin(toStr(getCurrentTaskName()));
					spridenPreviousElement
							.setSpridenCreateUser(getGlobal("CURRENT_USER"));
					spridenPreviousElement.setSpridenCreateDate(NDate.getNow());
				} catch (ApplicationException e) {
					if (piiActive.equals("Y")) {
						// spriden pii is active, turn fgac on
						Gokfgac.pTurnFgacOn();
					}
					throw new ApplicationException();
				}
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.ON-INSERT -- 82-1
	 * add SURNAME_PREFIX BEGIN GB_IDENTIFICATION.P_CREATE(p_ID_INOUT
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_ID, p_LAST_NAME
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME, p_FIRST_NAME
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME, p_MI
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_MI, p_CHANGE_IND
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND, p_ENTITY_IND
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND, p_USER
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_USER, p_ORIGIN
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN, p_NTYP_CODE
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_SURNAME_PREFIX
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX, -- 82-1 p_PIDM_INOUT
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_PIDM, p_ROWID_OUT =>:SPRIDEN_PREVIOUS.ROWID);
	 * -- SELECT SPRIDEN_ACTIVITY_DATE, SPRIDEN_CREATE_DATE INTO
	 * :SPRIDEN_PREVIOUS
	 * .SPRIDEN_ACTIVITY_DATE,:SPRIDEN_PREVIOUS.SPRIDEN_CREATE_DATE FROM SPRIDEN
	 * WHERE ROWID = :SPRIDEN_PREVIOUS.ROWID; -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void spridenPrevious_RowInsert(RowAdapterEvent args) {

		// 82-1 add SURNAME_PREFIX
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		int rowCount = 0;
		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<NString> p_id_inout_ref = new Ref<NString>(
					spridenPreviousElement.getSpridenId());
			Ref<NNumber> p_pidm_inout_ref = new Ref<NNumber>(
					spridenPreviousElement.getSpridenPidm());
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbIdentification.pCreate(p_id_inout_ref, /* pLastName=> */
					spridenPreviousElement.getSpridenLastName(), /* pFirstName=> */
					spridenPreviousElement.getSpridenFirstName(), /* pMi=> */
					spridenPreviousElement.getSpridenMi(), /* pChangeInd=> */
					spridenPreviousElement.getSpridenChangeInd(), /* pEntityInd=> */
					spridenPreviousElement.getSpridenEntityInd(), /* pUser=> */
					spridenPreviousElement.getSpridenUser(), /* pOrigin=> */
					spridenPreviousElement.getSpridenOrigin(), /* pNtypCode=> */
					spridenPreviousElement.getSpridenNtypCode(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), /* pSurnamePrefix=> */
					spridenPreviousElement.getSpridenSurnamePrefix(),
					p_pidm_inout_ref, p_rowid_out_ref);
			spridenPreviousElement.setSpridenId(p_id_inout_ref.val);
			spridenPreviousElement.setSpridenPidm(p_pidm_inout_ref.val);
			spridenPreviousElement.setROWID(p_rowid_out_ref.val);
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			String sql1 = "SELECT SPRIDEN_ACTIVITY_DATE, SPRIDEN_CREATE_DATE "
					+ " FROM SPRIDEN "
					+ " WHERE ROWID = :SPRIDEN_PREVIOUS_ROWID ";
			DataCommand command1 = new DataCommand(sql1);
			// Setting query parameters
			command1.addParameter("SPRIDEN_PREVIOUS_ROWID",
					spridenPreviousElement.getROWID());
			ResultSet results1 = command1.executeQuery();
			rowCount = command1.getRowCount();
			if (results1.hasData()) {
				spridenPreviousElement.setSpridenActivityDate(results1
						.getDate(0));
				spridenPreviousElement
						.setSpridenCreateDate(results1.getDate(1));
			}
			results1.close();
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.PRE-UPDATE -- 82-1
	 * add SPRIDEN_SURNAME_PREFIX to check for unique name DECLARE PTI_INTO_TEMP
	 * VARCHAR2(1); -- CURSOR PTI_CURSOR IS -- 82-1 SELECT 'X' FROM SPRIDEN
	 * WHERE NVL(SPRIDEN_SURNAME_PREFIX,' ') =
	 * NVL(:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX,' ') AND
	 * NVL(SPRIDEN_NTYP_CODE,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE,' ')
	 * AND NVL(SPRIDEN_MI,' ') = NVL(:SPRIDEN_PREVIOUS.SPRIDEN_MI,' ') AND
	 * NVL(SPRIDEN_FIRST_NAME,' ') =
	 * NVL(:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME,' ') AND SPRIDEN_LAST_NAME =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME AND SPRIDEN_ID =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ID AND SPRIDEN_PIDM =
	 * :SPRIDEN_PREVIOUS.SPRIDEN_PIDM; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR
	 * INTO PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN CLOSE PTI_CURSOR;
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0061','FORM','*ERROR* This record already
	 * exists')); RAISE FORM_TRIGGER_FAILURE; END IF; -- CLOSE PTI_CURSOR; -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0062','FORM','*ERROR* Invalid Change
	 * Indicator value.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :SPRIDEN_PREVIOUS.SPRIDEN_USER := :GLOBAL.CURRENT_USER;
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN := :SYSTEM.CURRENT_FORM; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void spridenPrevious_BeforeRowUpdate(RowAdapterEvent args) {

		// 82-1 add SPRIDEN_SURNAME_PREFIX to check for unique name
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRIDEN "
					+ " WHERE NVL(SPRIDEN_SURNAME_PREFIX, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX, ' ') AND NVL(SPRIDEN_NTYP_CODE, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE, ' ') AND NVL(SPRIDEN_MI, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_MI, ' ') AND NVL(SPRIDEN_FIRST_NAME, ' ') = NVL(:SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME, ' ') AND SPRIDEN_LAST_NAME = :SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME AND SPRIDEN_ID = :SPRIDEN_PREVIOUS_SPRIDEN_ID AND SPRIDEN_PIDM = :SPRIDEN_PREVIOUS_SPRIDEN_PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter(
						"SPRIDEN_PREVIOUS_SPRIDEN_SURNAME_PREFIX",
						spridenPreviousElement.getSpridenSurnamePrefix());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_NTYP_CODE",
						spridenPreviousElement.getSpridenNtypCode());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_MI",
						spridenPreviousElement.getSpridenMi());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_FIRST_NAME",
						spridenPreviousElement.getSpridenFirstName());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_LAST_NAME",
						spridenPreviousElement.getSpridenLastName());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_ID",
						spridenPreviousElement.getSpridenId());
				ptiCursor.addParameter("SPRIDEN_PREVIOUS_SPRIDEN_PIDM",
						spridenPreviousElement.getSpridenPidm());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.found()) {
					ptiCursor.close();
					errorMessage(GNls.Fget(toStr("GOQCLIB-0061"), toStr("FORM"),
							toStr("*ERROR* This record already exists")));
					throw new ApplicationException();
				}
				//
				ptiCursor.close();
				//
				if (spridenPreviousElement.getSpridenChangeInd().isNull()) {
					errorMessage(GNls.Fget(toStr("GOQCLIB-0062"), toStr("FORM"),
							toStr("*ERROR* Invalid Change Indicator value.")));
					throw new ApplicationException();
				}
				//
				spridenPreviousElement
						.setSpridenUser(getGlobal("CURRENT_USER"));
				spridenPreviousElement
						.setSpridenOrigin(toStr(getCurrentTaskName()));
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.ON-UPDATE -- 82-1
	 * add SURNAME_PREFIX BEGIN GB_IDENTIFICATION.P_UPDATE(p_PIDM
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_PIDM, p_ID =>:SPRIDEN_PREVIOUS.SPRIDEN_ID,
	 * p_LAST_NAME =>:SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME, p_FIRST_NAME
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME, p_MI
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_MI, p_CHANGE_IND
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND, p_ENTITY_IND
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND, p_USER
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_USER, p_NTYP_CODE
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_SURNAME_PREFIX
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX, -- 82-1 p_ORIGIN
	 * =>:SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN, p_ROWID =>:SPRIDEN_PREVIOUS.ROWID);
	 * -- :SPRIDEN_PREVIOUS.SPRIDEN_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRIDEN_PREVIOUS.ROWID),'DDMONYYYYHH24MISS');
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void spridenPrevious_RowUpdate(RowAdapterEvent args) {

		// 82-1 add SURNAME_PREFIX
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) args
				.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbIdentification.pUpdate(/* pPidm=> */spridenPreviousElement
					.getSpridenPidm(),
			/* pId=> */spridenPreviousElement.getSpridenId(),
			/* pLastName=> */spridenPreviousElement.getSpridenLastName(),
			/* pFirstName=> */spridenPreviousElement.getSpridenFirstName(),
			/* pMi=> */spridenPreviousElement.getSpridenMi(),
			/* pChangeInd=> */spridenPreviousElement.getSpridenChangeInd(),
			/* pEntityInd=> */spridenPreviousElement.getSpridenEntityInd(),
			/* pUser=> */spridenPreviousElement.getSpridenUser(),
			/* pOrigin=> */spridenPreviousElement.getSpridenOrigin(),
			/* pNtypCode=> */spridenPreviousElement.getSpridenNtypCode(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pSurnamePrefix=> */spridenPreviousElement
					.getSpridenSurnamePrefix(),
			/* pRowid=> */spridenPreviousElement.getROWID());
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spridenPreviousElement.setSpridenActivityDate(toDate(
					getContainer().getGoqrpls().gResynchRecord(
							spridenPreviousElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-COMMIT DECLARE
	 * lv_rownum PLS_INTEGER := :SYSTEM.CURSOR_RECORD; BEGIN COMMIT_FORM; IF
	 * :SYSTEM.FORM_STATUS <> 'QUERY' THEN RAISE FORM_TRIGGER_FAILURE; END IF;
	 * -- -- This will cause a requery if a record is deleted and it caused
	 * another record to -- be updated to save id or name change history. -- IF
	 * NVL(:SPRIDEN_PREVIOUS.DO_REQUERY,'N') = 'Y' THEN :SYSTEM.MESSAGE_LEVEL :=
	 * '5'; EXECUTE_QUERY; :SYSTEM.MESSAGE_LEVEL := '0'; GO_RECORD(lv_rownum);
	 * :SPRIDEN_PREVIOUS.DO_REQUERY := 'N'; END IF; --
	 * EXECUTE_TRIGGER('DISABLE_ITEMS'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void spridenPrevious_Save() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		{
			NNumber lvRownum = getCurrentRecord();
			commitTask();
			if (!getTaskStatus().equals("QUERY")) {
				throw new ApplicationException();
			}
			//
			// This will cause a requery if a record is deleted and it caused
			// another record to
			// be updated to save id or name change history.
			//
			if (isNull(spridenPreviousElement.getDoRequery(), "N").equals("Y")) {
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				this.getContainer().getServices().executeQuery();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
				setCurrentRecord(lvRownum);
				spridenPreviousElement.setDoRequery(toStr("N"));
			}
			//
			executeAction("DISABLE_ITEMS");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-CREREC
	 * CREATE_RECORD;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void spridenPrevious_CreateRecord() {

		createRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-DELREC DECLARE
	 * al_button NUMBER; BEGIN IF :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND = 'I'
	 * THEN al_button := SHOW_ALERT('WARNING_ID_CHANGE'); IF al_button =
	 * alert_button2 THEN RAISE FORM_TRIGGER_FAILURE; ELSE DELETE_RECORD;
	 * :SPRIDEN_PREVIOUS.DO_REQUERY := 'Y'; END IF; ELSE IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND = 'N' THEN al_button :=
	 * SHOW_ALERT('WARNING_ROW_REMOVE'); IF al_button = alert_button2 THEN RAISE
	 * FORM_TRIGGER_FAILURE; ELSE DELETE_RECORD; END IF; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void spridenPrevious_DeleteRecord() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		{
			NNumber alButton = NNumber.getNull();
			if (spridenPreviousElement.getSpridenChangeInd().equals("I")) {
				alButton = toNumber(showAlert("WARNING_ID_CHANGE"));
				if (alButton.equals(MessageServices.BUTTON2)) {
					throw new ApplicationException();
				} else {
					deleteRecord();
					spridenPreviousElement.setDoRequery(toStr("Y"));
				}
			} else {
				if (spridenPreviousElement.getSpridenChangeInd().equals("N")) {
					alButton = toNumber(showAlert("WARNING_ROW_REMOVE"));
					if (alButton.equals(MessageServices.BUTTON2)) {
						throw new ApplicationException();
					} else {
						deleteRecord();
					}
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-DUPREC
	 * :HOLD_BLOCK := 'SPRIDEN_PREVIOUS'; -- DUPLICATE_RECORD; G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void spridenPrevious_CopyRecord() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue("HOLD_BLOCK",
				"SPRIDEN_PREVIOUS");
		//
		duplicateRecord();
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-NXTBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0063','FORM','Alternate information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void spridenPrevious_NextBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0063"),
							toStr("FORM"),
							toStr("Alternate information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-NXTREC IF
	 * (:SPRIDEN_PREVIOUS.SPRIDEN_ID IS NULL OR
	 * :SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME IS NULL OR
	 * (:SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND = 'P' AND
	 * :SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME IS NULL)) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0064','FORM','Complete entering alternate
	 * record information.')); ELSE :SYSTEM.MESSAGE_LEVEL := 5; NEXT_RECORD;
	 * :SYSTEM.MESSAGE_LEVEL := 0; END IF;
	 */
	/*
	 * <p>This trigger will determine if the cursor is about to move onto a null
	 * 
	 * record. If it is, then display the last row message.<b>Migration
	 * Comments</b> Generated from trigger: SPRIDEN_PREVIOUS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void spridenPrevious_NextRecord() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		if ((spridenPreviousElement.getSpridenId().isNull()
				|| spridenPreviousElement.getSpridenLastName().isNull() || (spridenPreviousElement
				.getSpridenEntityInd().equals("P") && spridenPreviousElement
				.getSpridenFirstName().isNull()))) {
			warningMessage(GNls.Fget(toStr("GOQCLIB-0064"), toStr("FORM"),
					toStr("Complete entering alternate record information.")));
		} else {
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			nextRecord();
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.KEY-PRVBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0065','FORM','Alternate information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void spridenPrevious_PreviousBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0065"),
							toStr("FORM"),
							toStr("Alternate information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.DISABLE_ITEMS --
	 * 82-1 add SPRIDEN_SURNAME_PREFIX BEGIN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE); --
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * -- SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.DISABLE_ITEMS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "DISABLE_ITEMS")
	public void spridenPrevious_DisableItems() {

		// 82-1 add SPRIDEN_SURNAME_PREFIX
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, false);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
				ItemServices.CURRENT_RECORD, false);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, false);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, false);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, false);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND",
				ItemServices.CURRENT_RECORD, false);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND",
				ItemServices.CURRENT_RECORD, false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.ENABLE_ITEMS --
	 * 82-1 add SPRIDEN_SURNAME_PREFIX BEGIN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); -- IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_PREVIOUS',
	 * 'SPRIDEN_SURNAME_PREFIX') = 'N' THEN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE); -- 82-1
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); -- 82-1 END IF; --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); --
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	 * -- SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.ENABLE_ITEMS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "ENABLE_ITEMS")
	public void spridenPrevious_EnableItems() {

		// 82-1 add SPRIDEN_SURNAME_PREFIX
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, true);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, true);
		//
		if (getContainer()
				.getGoqrpls()
				.getGMasks()
				.gDidMaskRestrict(toStr(getCurrentTaskName()),
						toStr("SPRIDEN_PREVIOUS"),
						toStr("SPRIDEN_SURNAME_PREFIX")).equals("N")) {
			setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
					ItemServices.CURRENT_RECORD, true);
			// 82-1
			setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
					ItemServices.CURRENT_RECORD, true);
		}
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, true);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, true);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, true);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, true);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, true);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, true);
		//
		setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND",
				ItemServices.CURRENT_RECORD, true);
		setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND",
				ItemServices.CURRENT_RECORD, true);
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.SET_ID_NAVIGABLE
	 * -- 82-1 add SPRIDEN_SURNAME_PREFIX BEGIN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE); -- 82-1
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE); SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.SET_ID_NAVIGABLE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_ID_NAVIGABLE")
	public void spridenPrevious_SetIdNavigable() {

		// 82-1 add SPRIDEN_SURNAME_PREFIX
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, true);
		//
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
				ItemServices.CURRENT_RECORD, false);
		// 82-1
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, false);
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, false);
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_PREVIOUS.SET_NAME_NAVIGABLE
	 * -- 82-1 add SPRIDEN_SURNAME_PREFIX BEGIN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE); -- IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_PREVIOUS',
	 * 'SPRIDEN_SURNAME_PREFIX') = 'N' THEN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE); -- 82-1 END IF;
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE); SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_PREVIOUS.SET_NAME_NAVIGABLE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_NAME_NAVIGABLE")
	public void spridenPrevious_SetNameNavigable() {

		// 82-1 add SPRIDEN_SURNAME_PREFIX
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_ID",
				ItemServices.CURRENT_RECORD, false);
		//
		if (getContainer()
				.getGoqrpls()
				.getGMasks()
				.gDidMaskRestrict(toStr(getCurrentTaskName()),
						toStr("SPRIDEN_PREVIOUS"),
						toStr("SPRIDEN_SURNAME_PREFIX")).equals("N")) {
			setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
					ItemServices.CURRENT_RECORD, true);
		}
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
				ItemServices.CURRENT_RECORD, true);
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_MI",
				ItemServices.CURRENT_RECORD, true);
		setItemEnabled("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
				ItemServices.CURRENT_RECORD, true);
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
	 * SPRIDEN_NTYP_CODE.WHEN-VALIDATE-ITEM BEGIN IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE IS NULL THEN
	 * :SPRIDEN_PREVIOUS.PREVIOUS_NTYP_DESC := ''; RETURN; END IF; --
	 * :SPRIDEN_PREVIOUS.PREVIOUS_NTYP_DESC :=
	 * GB_GTVNTYP.F_GET_DESCRIPTION(:SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE); -- IF
	 * :SPRIDEN_PREVIOUS.PREVIOUS_NTYP_DESC IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0066','FORM','*ERROR* %01% is invalid. LIST
	 * for valid values.', :SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE )); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END;
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
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);

		if (spridenPreviousElement.getSpridenNtypCode().isNull()) {
			spridenPreviousElement.setPreviousNtypDesc(toStr(""));
			return;
		}
		//
		spridenPreviousElement.setPreviousNtypDesc(GbGtvntyp
				.fGetDescription(spridenPreviousElement.getSpridenNtypCode()));
		//
		if (spridenPreviousElement.getPreviousNtypDesc().isNull()) {
			errorMessage(GNls.Fget(toStr("GOQCLIB-0066"), toStr("FORM"),
					toStr("*ERROR* %01% is invalid. LIST for valid values."),
					spridenPreviousElement.getSpridenNtypCode()));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
	 * G$_SEARCH.CODE_KEY_NEXT_ITEM; -- NEXT_ITEM; G$_CHECK_FAILURE;
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
		getContainer().getGoqrpls().gCheckFailure();
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
	 * PREVIOUS_NTYP_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PREVIOUS_NTYP_DESC", function = KeyFunction.ITEM_CHANGE)
	public void previousNtypDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRIDEN_CHANGE_IND.WHEN-LIST-CHANGED DECLARE the_alert NUMBER; the_record
	 * SPRIDEN%ROWTYPE; BEGIN IF :SYSTEM.MODE = 'ENTER-QUERY' THEN RETURN; END
	 * IF; -- IF :SPRIDEN_PREVIOUS.ROWID IS NULL THEN -- BEGIN SELECT * INTO
	 * the_record FROM SPRIDEN WHERE SPRIDEN_PIDM =
	 * :SPRIDEN_CURRENT.SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND IS NULL; --
	 * EXCEPTION WHEN NO_DATA_FOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0067','FORM','*ERROR* No current record
	 * available.')); WHEN TOO_MANY_ROWS THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0068','FORM','*ERROR* You have more than one
	 * current record. Call your DBA.')); END; -- -- IF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND = 'N' THEN
	 * COPY(the_record.SPRIDEN_ID,'SPRIDEN_PREVIOUS.SPRIDEN_ID');
	 * COPY('','SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX');
	 * COPY('','SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME');
	 * COPY('','SPRIDEN_PREVIOUS.SPRIDEN_MI');
	 * COPY('','SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME');
	 * COPY(the_record.SPRIDEN_ENTITY_IND
	 * ,'SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND');
	 * COPY(NAME_IN('KEY_BLOCK.PIDM'),'SPRIDEN_PREVIOUS.SPRIDEN_PIDM');
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ACTIVITY_DATE := SYSDATE; --
	 * EXECUTE_TRIGGER('SET_NAME_NAVIGABLE'); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE); IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_PREVIOUS',
	 * 'SPRIDEN_SURNAME_PREFIX') = 'N' THEN
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); END IF;
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE); IF
	 * G$_MASKS.G$_DID_MASK_RESTRICT (:SYSTEM.CURRENT_FORM,'SPRIDEN_PREVIOUS',
	 * 'SPRIDEN_SURNAME_PREFIX') = 'N' THEN
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX'); ELSE
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME'); END IF; -- ELSIF
	 * :SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND = 'I' THEN
	 * COPY('','SPRIDEN_PREVIOUS.SPRIDEN_ID');
	 * COPY(the_record.SPRIDEN_SURNAME_PREFIX
	 * ,'SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX');
	 * COPY(the_record.SPRIDEN_LAST_NAME,'SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME');
	 * COPY
	 * (the_record.SPRIDEN_FIRST_NAME,'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME');
	 * COPY(the_record.SPRIDEN_MI,'SPRIDEN_PREVIOUS.SPRIDEN_MI');
	 * COPY(the_record
	 * .SPRIDEN_ENTITY_IND,'SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND');
	 * COPY(NAME_IN('KEY_BLOCK.PIDM'),'SPRIDEN_PREVIOUS.SPRIDEN_PIDM');
	 * :SPRIDEN_PREVIOUS.SPRIDEN_ACTIVITY_DATE := SYSDATE; --
	 * EXECUTE_TRIGGER('SET_ID_NAVIGABLE'); --
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_ID',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY(
	 * 'SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	 * SET_ITEM_INSTANCE_PROPERTY('SPRIDEN_PREVIOUS.SPRIDEN_MI',
	 * CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_ID'); ELSE NULL; END IF; -- END IF;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_CHANGE_IND.WHEN-LIST-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-LIST-CHANGED", item = "SPRIDEN_CHANGE_IND")
	public void spridenChangeInd_listChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpridenPreviousAdapter spridenPreviousElement = (SpridenPreviousAdapter) this
				.getFormModel().getSpridenPrevious().getRowAdapter(true);
		SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter) this
				.getFormModel().getSpridenCurrent().getRowAdapter(true);

		int rowCount = 0;
		{
			NNumber theAlert = NNumber.getNull();
			ResultSet theRecord = null;
			if (getMode().equals("ENTER-QUERY")) {
				return;
			}
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			if ((getRecordStatus("spriden_Previous") == "NEW" || getRecordStatus("spriden_Previous") == "INSERT")) {
				try {
					String sql1 = "SELECT * "
							+ " FROM SPRIDEN "
							+ " WHERE SPRIDEN_PIDM = :SPRIDEN_CURRENT_SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM",
							spridenCurrentElement.getSpridenPidm());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if (results1.hasData()) {
						theRecord = results1;
					}
					results1.close();
				} catch (NoDataFoundException e) {
					errorMessage(GNls.Fget(toStr("GOQCLIB-0067"), toStr("FORM"),
							toStr("*ERROR* No current record available.")));
				} catch (TooManyRowsException e) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0068"),
									toStr("FORM"),
									toStr("*ERROR* You have more than one current record. Call your DBA.")));
				}
				//
				//
				if (spridenPreviousElement.getSpridenChangeInd().equals("N")) {
					copy(theRecord.getString("SPRIDEN_ID"),
							"SPRIDEN_PREVIOUS.SPRIDEN_ID");
					copy("", "SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX");
					copy("", "SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME");
					copy("", "SPRIDEN_PREVIOUS.SPRIDEN_MI");
					copy("", "SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME");
					copy(theRecord.getString("SPRIDEN_ENTITY_IND"),
							"SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND");
					copy(getNameIn("KEY_BLOCK.PIDM"),
							"SPRIDEN_PREVIOUS.SPRIDEN_PIDM");
					spridenPreviousElement.setSpridenActivityDate(NDate
							.getNow());
					//
					executeAction("SET_NAME_NAVIGABLE");
					//
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
							ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
							ItemServices.CURRENT_RECORD, false);
					if (getContainer()
							.getGoqrpls()
							.getGMasks()
							.gDidMaskRestrict(toStr(getCurrentTaskName()),
									toStr("SPRIDEN_PREVIOUS"),
									toStr("SPRIDEN_SURNAME_PREFIX"))
							.equals("N")) {
						setItemInsertAllowed(
								"SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
								ItemServices.CURRENT_RECORD, true);
						setItemUpdateAllowed(
								"SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
								ItemServices.CURRENT_RECORD, true);
					}
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
							ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
							ItemServices.CURRENT_RECORD, true);
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
							ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
							ItemServices.CURRENT_RECORD, true);
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
							ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
							ItemServices.CURRENT_RECORD, true);
					if (getContainer()
							.getGoqrpls()
							.getGMasks()
							.gDidMaskRestrict(toStr(getCurrentTaskName()),
									toStr("SPRIDEN_PREVIOUS"),
									toStr("SPRIDEN_SURNAME_PREFIX"))
							.equals("N")) {
						goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX"));
					} else {
						goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME"));
					}
				} else if (spridenPreviousElement.getSpridenChangeInd().equals(
						"I")) {
					copy("", "SPRIDEN_PREVIOUS.SPRIDEN_ID");
					copy(theRecord.getString("SPRIDEN_SURNAME_PREFIX"),
							"SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX");
					copy(theRecord.getString("SPRIDEN_LAST_NAME"),
							"SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME");
					copy(theRecord.getString("SPRIDEN_FIRST_NAME"),
							"SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME");
					copy(theRecord.getString("SPRIDEN_MI"),
							"SPRIDEN_PREVIOUS.SPRIDEN_MI");
					copy(theRecord.getString("SPRIDEN_ENTITY_IND"),
							"SPRIDEN_PREVIOUS.SPRIDEN_ENTITY_IND");
					copy(getNameIn("KEY_BLOCK.PIDM"),
							"SPRIDEN_PREVIOUS.SPRIDEN_PIDM");
					spridenPreviousElement.setSpridenActivityDate(NDate
							.getNow());
					//
					executeAction("SET_ID_NAVIGABLE");
					//
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
							ItemServices.CURRENT_RECORD, true);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_ID",
							ItemServices.CURRENT_RECORD, true);
					setItemInsertAllowed(
							"SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
							ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed(
							"SPRIDEN_PREVIOUS.SPRIDEN_SURNAME_PREFIX",
							ItemServices.CURRENT_RECORD, false);
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
							ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME",
							ItemServices.CURRENT_RECORD, false);
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
							ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_FIRST_NAME",
							ItemServices.CURRENT_RECORD, false);
					setItemInsertAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
							ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("SPRIDEN_PREVIOUS.SPRIDEN_MI",
							ItemServices.CURRENT_RECORD, false);
					goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ID"));
				} else {
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
	 * :HOLD_BLOCK_FIELD := 'SPRIDEN_CURRENT.SPRIDEN_ID'; :HOLD_BLOCK :=
	 * 'SPRIDEN_CURRENT';
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
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue("HOLD_BLOCK",
				"SPRIDEN_CURRENT");
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_LAST_NAME.KEY-NEXT-ITEM IF
	 * NAME_IN('SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND') = 'P' THEN NEXT_ITEM; ELSE
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRIDEN_LAST_NAME.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRIDEN_LAST_NAME", function = KeyFunction.NEXT_ITEM)
	public void spridenLastName_keyNexItem() {

		if (getNameIn("SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND").equals("P")) {
			nextItem();
		} else {
			goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_ORIGIN.KEY-NEXT-ITEM
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_USER');
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

		goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_USER"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRIDEN_USER.KEY-PREV-ITEM
	 * GO_ITEM('SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN');
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

		goItem(toStr("SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN"));
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

	public void spridenNtypCode_doubleClick() {
		spridenNtypCode_WhenMouseDoubleclick();
		
	}

}
