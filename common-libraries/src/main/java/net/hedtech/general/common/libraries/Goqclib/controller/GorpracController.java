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
import net.hedtech.general.common.libraries.Goqclib.model.*;
import net.hedtech.general.common.libraries.Goqclib.*;
import net.hedtech.general.common.libraries.Goqclib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class GorpracController extends AbstractSupportCodeObject {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
//	}
	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}
	
	private GDescClass getGDescClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}
	
	private GDateClass getGDateClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}
	
	private GIconBtnClass getGIconBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}

	public GorpracController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER GORPRAC.POST-QUERY
	 * :gorprac.race_desc := gb_race_ethnicity.f_get_description(p_code =>
	 * :gorprac.gorprac_race_cde);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void gorprac_AfterQuery(RowAdapterEvent args) {

		GorpracAdapter gorpracElement = (GorpracAdapter) args.getRow();

		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		// F2J_WARNING : Passing parameters by name is not supported. Please
		// check that the parameters are in the correct order.
		gorpracElement
				.setRaceDesc(GbRaceEthnicity
						.fGetDescription(/* pCode=> */gorpracElement
								.getGorpracRaceCde()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC.PRE-INSERT
	 * :GORPRAC.GORPRAC_PIDM := :KEY_BLOCK.PIDM; :GORPRAC.GORPRAC_USER_ID :=
	 * :GLOBAL.CURRENT_USER; :GORPRAC.GORPRAC_ACTIVITY_DATE := SYSDATE;
	 * :GORPRAC.GORPRAC_DATA_ORIGIN := :GLOBAL.DATA_ORIGIN;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void gorprac_BeforeRowInsert(RowAdapterEvent args) {

		GorpracAdapter gorpracElement = (GorpracAdapter) args.getRow();

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		gorpracElement.setGorpracPidm(toNumber(getFormModel()
				.getBusinessObject("KEY_BLOCK").getValue("PIDM")));
		gorpracElement.setGorpracUserId(getGlobal("CURRENT_USER"));
		gorpracElement.setGorpracActivityDate(NDate.getNow());
		gorpracElement.setGorpracDataOrigin(getGlobal("DATA_ORIGIN"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC.ON-INSERT BEGIN
	 * gb_person_race.p_create( p_pidm => :KEY_BLOCK.PIDM, p_race_cde =>
	 * :GORPRAC.GORPRAC_RACE_CDE, p_user_id => :GLOBAL.CURRENT_USER,
	 * p_data_origin => :GLOBAL.DATA_ORIGIN, p_rowid_out => :GORPRAC.ROWID); --
	 * :GORPRAC.GORPRAC_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:GORPRAC.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void gorprac_RowInsert(RowAdapterEvent args) {

		GorpracAdapter gorpracElement = (GorpracAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>(gorpracElement
					.getROWID().getBytes());
			GbPersonRace.pCreate(/* pPidm=> */toNumber(getFormModel()
					.getBusinessObject("KEY_BLOCK").getValue("PIDM")), /*
																		 * pRaceCde=
																		 * >
																		 */
					gorpracElement.getGorpracRaceCde(), /* pUserId=> */
					getGlobal("CURRENT_USER"), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), p_rowid_out_ref);
			gorpracElement.setROWID(p_rowid_out_ref.val);
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			gorpracElement.setGorpracActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(gorpracElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC.ON-DELETE BEGIN
	 * gb_person_race.p_delete( p_pidm => :GORPRAC.GORPRAC_PIDM, p_race_cde =>
	 * :GORPRAC.GORPRAC_RACE_CDE, p_rowid => :GORPRAC.ROWID); EXCEPTION WHEN
	 * OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void gorprac_RowDelete(RowAdapterEvent args) {

		GorpracAdapter gorpracElement = (GorpracAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbPersonRace.pDelete(/* pPidm=> */gorpracElement.getGorpracPidm(), /*
																			 * pRaceCde
																			 * =
																			 * >
																			 */
					gorpracElement.getGorpracRaceCde(), /* pRowid=> */
					gorpracElement.getROWID().getBytes());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC.KEY-NXTBLK IF
	 * :SYSTEM.FORM_STATUS = 'CHANGED' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0145','FORM','Biographic or Race information
	 * changed, press SAVE before leaving current window.')); RAISE
	 * FORM_TRIGGER_FAILURE; ELSE EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void gorprac_NextBlock() {

		if (getTaskStatus().equals("CHANGED")) {
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0145"),
							toStr("FORM"),
							toStr("Biographic or Race information changed, press SAVE before leaving current window.")));
			throw new ApplicationException();
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC.KEY-PRVBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN IF
	 * GET_BLOCK_PROPERTY(:SYSTEM.CURSOR_BLOCK,PREVIOUSBLOCK) = 'SPBPERS' THEN
	 * PREVIOUS_BLOCK; ELSE MESSAGE(G$_NLS.Get('GOQCLIB-0146','FORM','Biographic
	 * or Race information changed, press SAVE before leaving current
	 * window.')); RAISE FORM_TRIGGER_FAILURE; END IF; ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void gorprac_PreviousBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			if (getBlockPreviousBlock(getCursorBlock()).equals("SPBPERS")) {
				previousBlock();
			} else {
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0146"),
								toStr("FORM"),
								toStr("Biographic or Race information changed, press SAVE before leaving current window.")));
				throw new ApplicationException();
			}
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GORPRAC.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void gorprac_BeforeQuery(QueryEvent args) {

		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"KEY_BLOCK_PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "GORPRAC_RACE_CDE")
	public void gorpracRaceCde_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "GORPRAC_RACE_CDE", function = KeyFunction.ITEM_CHANGE)
	public void gorpracRaceCde_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "GORPRAC_RACE_CDE")
	public void gorpracRaceCde_GSearchParameters() {

		getContainer()
				.getGoqrpls()
				.getGSearch()
				.parameters(toStr("GORRACE_RACE_CDE"), toStr("GORRACE_DESC"),
						toStr(""));
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "GORPRAC_RACE_CDE")
	public void gorpracRaceCde_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "GORPRAC_RACE_CDE", function = KeyFunction.NEXT_ITEM)
	public void gorpracRaceCde_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "GORPRAC_RACE_CDE", function = KeyFunction.ITEM_OUT)
	public void gorpracRaceCde_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GORPRAC_RACE_CDE.WHEN-VALIDATE-ITEM
	 * :GORPRAC.RACE_DESC := ''; IF :GORPRAC.GORPRAC_RACE_CDE IS NOT NULL THEN
	 * :GORPRAC.RACE_DESC := gb_race_ethnicity.f_get_description(p_code =>
	 * :GORPRAC.GORPRAC_RACE_CDE); g$_check_value( :GORPRAC.RACE_DESC IS NULL,
	 * -- G$_NLS.Get('x', 'FORM',
	 * gb_race_ethnicity_strings.f_get_error('INVALID_RACE_CDE')), --81-3
	 * (gb_race_ethnicity_strings.f_get_error('INVALID_RACE_CDE')), -- 81-3
	 * TRUE); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "GORPRAC_RACE_CDE")
	public void gorpracRaceCde_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		GorpracAdapter gorpracElement = (GorpracAdapter) this.getFormModel()
				.getGorprac().getRowAdapter(true);

		gorpracElement.setRaceDesc(toStr(""));
		if (!gorpracElement.getGorpracRaceCde().isNull()) {
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			gorpracElement.setRaceDesc(GbRaceEthnicity
					.fGetDescription(/* pCode=> */gorpracElement
							.getGorpracRaceCde()));
			getContainer().getGoqrpls().gCheckValue(
					toBool(gorpracElement.getRaceDesc().isNull()),
					((GbRaceEthnicityStrings
							.fGetError(toStr("INVALID_RACE_CDE")))),
					toBool(NBool.True));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * RACE_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "RACE_DESC", function = KeyFunction.ITEM_CHANGE)
	public void raceDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "GORPRAC_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void gorpracActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "GORPRAC_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void gorpracActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "GORPRAC_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void gorpracActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GORPRAC_RACE_CDE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "GORPRAC_RACE_CDE_LBT")
	public void gorpracRaceCdeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	public void gorpracRaceCde_doubleClick() {
		gorpracRaceCde_WhenMouseDoubleclick();
		
	}

}
