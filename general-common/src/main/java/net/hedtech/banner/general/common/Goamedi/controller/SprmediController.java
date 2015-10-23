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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SprmediController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_ICON_BTN_CLASS");
	}

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_CODE_CLASS");
	}

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_DESC_CLASS");
	}

	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_CALENDAR_BTN_CLASS");
	}

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_DATE_CLASS");
	}

	public SprmediController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public GoamediTask getTask() {
		return (GoamediTask) super.getTask();
	}

	public GoamediModel getFormModel() {
		return this.getTask().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.KEY-NXTBLK
	 * EXECUTE_TRIGGER('INVALID_FUNCTION_MSG'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void sprmedi_NextBlock() {

		executeAction("INVALID_FUNCTION_MSG");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.KEY-PRVBLK
	 * EXECUTE_TRIGGER('INVALID_FUNCTION_MSG'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void sprmedi_PreviousBlock() {

		executeAction("INVALID_FUNCTION_MSG");
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.PRE-INSERT :SPRMEDI_USER_ID
	 * := :GLOBAL.CURRENT_USER;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void sprmedi_BeforeRowInsert(RowAdapterEvent args) {

		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();

		sprmediElement.setSprmediUserId(getGlobal("CURRENT_USER"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.PRE-UPDATE -- 7311 If
	 * primary key of SPRMEDI_MEDI_CODE has been changed, -- perform delete and
	 * insert to emulate update in ON-UPDATE trigger. -- But first, check if any
	 * PEREACC rows exist that use SPRMEDI_MEDI_CODE -- as part of key. If so,
	 * send message that this row needs to be -- deleted or changed before
	 * attempting update. DECLARE LV_SQL_STMT varchar2(300); VAL_RESULT
	 * varchar2(1); LV_PIDM sprmedi.sprmedi_pidm%TYPE; LV_MEDI_CODE
	 * sprmedi.sprmedi_medi_code%TYPE; -- BEGIN -- 7311 begin
	 * :SPRMEDI.HOLD_MEDI_CODE :=
	 * GET_ITEM_PROPERTY('SPRMEDI.SPRMEDI_MEDI_CODE',DATABASE_VALUE); -- IF
	 * :SPRMEDI.HOLD_MEDI_CODE <> :SPRMEDI.SPRMEDI_MEDI_CODE THEN -- -- check if
	 * any PEREACC rows exists that rely on this GOAMEDI code -- if
	 * goksyst.F_IsProductinstalled('HUMANRE') then LV_PIDM :=
	 * :SPRMEDI.SPRMEDI_PIDM; LV_MEDI_CODE := :SPRMEDI.HOLD_MEDI_CODE;
	 * lv_sql_stmt := 'SELECT ''0'' FROM PEREACC WHERE PEREACC_MEDI_CODE = ' ||
	 * '''' || LV_MEDI_CODE || '''' || ' AND PEREACC_PIDM = ' || '''' || LV_PIDM
	 * || ''''; -- GOKDBMS.DYNAMIC_SQL(LV_SQL_STMT,VAL_RESULT); -- IF VAL_RESULT
	 * IS NOT NULL THEN MESSAGE(G$_NLS.GET('X','FORM','*ERROR* Cannot change
	 * Medical Code when an Employee Accomodation with the same Medical
	 * Condition exists on PEAEACC; delete or change on that form before
	 * proceeding.')); RAISE FORM_TRIGGER_FAILURE; END IF; end if; END IF; --
	 * 7311 end :SPRMEDI_USER_ID := :GLOBAL.CURRENT_USER;
	 * EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void sprmedi_BeforeRowUpdate(RowAdapterEvent args) {

		// 7311 If primary key of SPRMEDI_MEDI_CODE has been changed,
		// perform delete and insert to emulate update in ON-UPDATE trigger.
		// But first, check if any PEREACC rows exist that use SPRMEDI_MEDI_CODE
		// as part of key. If so, send message that this row needs to be
		// deleted or changed before attempting update.
		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();

		{
			NString lvSqlStmt = NString.getNull();
			NString valResult = NString.getNull();
			NNumber lvPidm = NNumber.getNull();
			NString lvMediCode = NString.getNull();
			// 7311 begin
			sprmediElement
			.setHoldMediCode(toStr(getItemDataBaseValue("SPRMEDI.SPRMEDI_MEDI_CODE")));
			//
			if (sprmediElement.getHoldMediCode().notEquals(
					sprmediElement.getSprmediMediCode())) {
				//
				// check if any PEREACC rows exists that rely on this GOAMEDI
				// code
				//
				if (Goksyst.fIsproductinstalled(toStr("HUMANRE")).getValue()) {
					lvPidm = sprmediElement.getSprmediPidm();
					lvMediCode = sprmediElement.getHoldMediCode();
					lvSqlStmt = toStr(
							"SELECT '0' FROM PEREACC WHERE PEREACC_MEDI_CODE = ")
							.append("'").append(lvMediCode).append("'")
							.append(" AND PEREACC_PIDM = ").append("'")
							.append(lvPidm).append("'");
					//
					Ref<NString> p_return_value1_ref = new Ref<NString>(
							valResult);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
					valResult = p_return_value1_ref.val;
					//
					if (!valResult.isNull()) {
						errorMessage(GNls
								.Fget(toStr("X"),
										toStr("FORM"),
										toStr("*ERROR* Cannot change Medical Code when an Employee Accomodation with the same Medical Condition exists on PEAEACC; delete or change on that form before proceeding.")));
						throw new ApplicationException();
					}
				}
			}
			// 7311 end
			sprmediElement.setSprmediUserId(getGlobal("CURRENT_USER"));
			executeAction("UPDATE_ACTIVITY_DATE");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.ON-DELETE -- -- ON-DELETE
	 * Trigger -- BEGIN gb_common.p_set_context('GB_MEDICAL',
	 * 'CHECK_HR_SECURITY', 'Y'); gb_medical.p_delete( p_pidm
	 * =>:sprmedi.sprmedi_pidm, p_medi_code =>:sprmedi.sprmedi_medi_code,
	 * p_rowid =>:sprmedi.ROWID); -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void sprmedi_RowDelete(RowAdapterEvent args) {

		//
		// ON-DELETE Trigger
		//
		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();

		try {
			GbCommon.pSetContext(toStr("GB_MEDICAL"),
					toStr("CHECK_HR_SECURITY"), toStr("Y"), null);
			
			GbMedical.pDelete(/* pPidm=> */sprmediElement.getSprmediPidm(), /*
			 * pMediCode
			 * =>
			 */
					sprmediElement.getSprmediMediCode(), /* pRowid=> */
					toStr(DbManager.getDataBaseFactory().rowidToString(
							sprmediElement.getROWID())));
		} catch (Exception e) {
			getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.ON-INSERT -- -- ON-INSERT
	 * Trigger -- BEGIN gb_common.p_set_context('GB_MEDICAL',
	 * 'CHECK_HR_SECURITY', 'Y'); gb_medical.p_create( p_pidm
	 * =>:sprmedi.sprmedi_pidm, p_medi_code =>:sprmedi.sprmedi_medi_code,
	 * p_mdeq_code =>:sprmedi.sprmedi_mdeq_code, p_comment
	 * =>:sprmedi.sprmedi_comment, p_disa_code =>:sprmedi.sprmedi_disa_code,
	 * p_spsr_code =>:sprmedi.sprmedi_spsr_code, p_onset_age
	 * =>:sprmedi.sprmedi_onset_age, p_disb_ind =>:sprmedi.sprmedi_disb_ind,
	 * p_user_id =>:global.current_user, p_data_origin =>:global.data_origin,
	 * p_medi_code_date =>:sprmedi.sprmedi_medi_code_date, p_rowid_out
	 * =>:sprmedi.rowid); -- :sprmedi.sprmedi_activity_date :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRMEDI.ROWID),'DDMONYYYYHH24MISS'); --
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void sprmedi_RowInsert(RowAdapterEvent args) {

		//
		// ON-INSERT Trigger
		//
		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();

		try {
			GbCommon.pSetContext(toStr("GB_MEDICAL"),
					toStr("CHECK_HR_SECURITY"), toStr("Y"),null);
			
			Ref<NString> p_rowid_out_ref = new Ref<NString>(toStr(
					sprmediElement.getROWID()));
			GbMedical.pCreate(/* pPidm=> */sprmediElement.getSprmediPidm(), /*
			 * pMediCode
			 * =>
			 */
					sprmediElement.getSprmediMediCode(), /* pMdeqCode=> */
					sprmediElement.getSprmediMdeqCode(), /* pComment=> */
					sprmediElement.getSprmediComment(), /* pDisaCode=> */
					sprmediElement.getSprmediDisaCode(), /* pSpsrCode=> */
					sprmediElement.getSprmediSpsrCode(), /* pOnsetAge=> */
					sprmediElement.getSprmediOnsetAge(), /* pDisbInd=> */
					sprmediElement.getSprmediDisbInd(), /* pUserId=> */
					getGlobal("CURRENT_USER"),
					toDate(/* pDataOrigin=> */sprmediElement
							.getSprmediMediCodeDate()),
							toStr(/* pMediCodeDate=> */getGlobal("DATA_ORIGIN")), p_rowid_out_ref);
			//sprmediElement.getROWID();
			sprmediElement.setROWID(p_rowid_out_ref.val);
			//
			
		} catch (Exception e) {
			getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI.ON-UPDATE -- -- ON-UPDATE
	 * -- BEGIN -- 7311 If primary key of SPRMEDI_MEDI_CODE has been changed, --
	 * perform delete and insert to emulate update. -- Before this, in
	 * Pre-Update trigger, check if any PEREACC rows -- exist that use
	 * SPRMEDI_MEDI_CODE as part of key. -- If so, send message that this row
	 * needs to be -- deleted or changed before attempting update. -- IF
	 * :SPRMEDI.HOLD_MEDI_CODE <> :SPRMEDI.SPRMEDI_MEDI_CODE THEN
	 * gb_common.p_set_context('GB_MEDICAL', 'CHECK_HR_SECURITY', 'Y');
	 * gb_medical.p_delete( p_pidm =>:sprmedi.sprmedi_pidm, --
	 * p_medi_code=>:sprmedi.sprmedi_medi_code, replaced so that the newly
	 * entered code is checked p_medi_code=>:sprmedi.hold_medi_code, p_rowid
	 * =>:sprmedi.ROWID); -- gb_medical.p_create( p_pidm
	 * =>:sprmedi.sprmedi_pidm, p_medi_code =>:sprmedi.sprmedi_medi_code,
	 * p_mdeq_code =>:sprmedi.sprmedi_mdeq_code, p_comment
	 * =>:sprmedi.sprmedi_comment, p_disa_code =>:sprmedi.sprmedi_disa_code,
	 * p_spsr_code =>:sprmedi.sprmedi_spsr_code, p_onset_age
	 * =>:sprmedi.sprmedi_onset_age, p_disb_ind =>:sprmedi.sprmedi_disb_ind,
	 * p_user_id =>:global.current_user, p_data_origin =>:global.data_origin,
	 * p_medi_code_date=>:sprmedi.sprmedi_medi_code_date, p_rowid_out
	 * =>:sprmedi.rowid); -- :sprmedi.sprmedi_activity_date :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRMEDI.ROWID),'DDMONYYYYHH24MISS'); -- ELSE
	 * -- gb_common.p_set_context('GB_MEDICAL', 'CHECK_HR_SECURITY', 'Y');
	 * gb_medical.p_update( p_pidm =>:sprmedi.sprmedi_pidm, p_medi_code
	 * =>:sprmedi.sprmedi_medi_code, p_mdeq_code =>:sprmedi.sprmedi_mdeq_code,
	 * p_comment =>:sprmedi.sprmedi_comment, p_disa_code
	 * =>:sprmedi.sprmedi_disa_code, p_spsr_code =>:sprmedi.sprmedi_spsr_code,
	 * p_onset_age =>:sprmedi.sprmedi_onset_age, p_disb_ind
	 * =>:sprmedi.sprmedi_disb_ind, p_user_id =>:global.current_user,
	 * p_data_origin =>:global.data_origin,
	 * p_medi_code_date=>:sprmedi.sprmedi_medi_code_date, p_rowid
	 * =>:sprmedi.rowid); -- :sprmedi.sprmedi_activity_date :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRMEDI.ROWID),'DDMONYYYYHH24MISS'); END IF;
	 * -- EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void sprmedi_RowUpdate(RowAdapterEvent args) {

		//
		// ON-UPDATE
		//
		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();

		try {
			// 7311 If primary key of SPRMEDI_MEDI_CODE has been changed,
			// perform delete and insert to emulate update.
			// Before this, in Pre-Update trigger, check if any PEREACC rows
			// exist that use SPRMEDI_MEDI_CODE as part of key.
			// If so, send message that this row needs to be
			// deleted or changed before attempting update.
			//
			if (sprmediElement.getHoldMediCode().notEquals(sprmediElement.getSprmediMediCode())) {
				GbCommon.pSetContext(toStr("GB_MEDICAL"),toStr("CHECK_HR_SECURITY"), toStr("Y"),null);
				
				GbMedical.pDelete(sprmediElement.getSprmediPidm(), sprmediElement.getHoldMediCode(),toStr(DbManager.getDataBaseFactory().rowidToString(sprmediElement.getROWID())));
				//
				Ref<NString> p_rowid_out_ref = new Ref<NString>(toStr(sprmediElement.getROWID()));
				GbMedical.pCreate(
						/* pPidm=> */sprmediElement.getSprmediPidm(), 
						/* pMediCode =>*/ sprmediElement.getSprmediMediCode(),
						/* pMdeqCode=> */sprmediElement.getSprmediMdeqCode(), 
						/* pComment=> */ sprmediElement.getSprmediComment(),
						/* pDisaCode=> */sprmediElement.getSprmediDisaCode(), 
						/* pSpsrCode=> */sprmediElement.getSprmediSpsrCode(), 
						/* pOnsetAge=> */sprmediElement.getSprmediOnsetAge(),
						/* pDisbInd=> */sprmediElement.getSprmediDisbInd(),
						/* pUserId=> */getGlobal("CURRENT_USER"),
						/* pMediCodeDate=> */sprmediElement.getSprmediMediCodeDate(),
						/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
						p_rowid_out_ref);

				//sprmediElement.getROWID();
				sprmediElement.setROWID(p_rowid_out_ref.val);
				
				sprmediElement
				.setSprmediActivityDate(toDate(getTask().getGoqrpls()
						.gResynchRecord(sprmediElement.getROWID()),
						"DDMONYYYYHH24MISS"));
			} else {
				//
				GbCommon.pSetContext(toStr("GB_MEDICAL"),
						toStr("CHECK_HR_SECURITY"), toStr("Y"),null);
				GbMedical.pUpdate(/* pPidm=> */sprmediElement.getSprmediPidm(), /*
				 * pMediCode
				 * =
				 * >
				 */
						
						sprmediElement.getSprmediMediCode(), /* pMdeqCode=> */
						sprmediElement.getSprmediMdeqCode(), /* pComment=> */
						sprmediElement.getSprmediComment(), /* pDisaCode=> */
						sprmediElement.getSprmediDisaCode(), /* pSpsrCode=> */
						sprmediElement.getSprmediSpsrCode(), /* pOnsetAge=> */
						sprmediElement.getSprmediOnsetAge(), /* pDisbInd=> */
						sprmediElement.getSprmediDisbInd(), /* pUserId=> */
						getGlobal("CURRENT_USER"),
						/* pMediCodeDate=> */sprmediElement.getSprmediMediCodeDate(), 
						/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
						/* pRowid=> */toStr(DbManager.getDataBaseFactory().rowidToString(
										sprmediElement.getROWID())));
				//
				sprmediElement
				.setSprmediActivityDate(toDate(getTask().getGoqrpls()
						.gResynchRecord(sprmediElement.getROWID()),
						"DDMONYYYYHH24MISS"));
			}
		} catch (Exception e) {
			getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_SPSR_CODE_LBT")
	public void sprmediSpsrCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_MEDI_CODE_LBT")
	public void sprmediMediCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRMEDI_MEDI_CODE")
	public void sprmediMediCode_doubleClick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRMEDI_MEDI_CODE", function = KeyFunction.ITEM_CHANGE)
	public void sprmediMediCode_itemChange() {

		getGCodeClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRMEDI_MEDI_CODE")
	public void sprmediMediCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRMEDI_MEDI_CODE" )
	public void sprmediMediCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRMEDI_MEDI_CODE", function = KeyFunction.NEXT_ITEM)
	public void sprmediMediCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRMEDI_MEDI_CODE", function = KeyFunction.ITEM_OUT)
	public void sprmediMediCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_MEDI_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE ; -- DECLARE
	 * 
	 * CURSOR PTI_CURSOR IS SELECT STVMEDI_DESC FROM STVMEDI WHERE STVMEDI_CODE
	 * = :SPRMEDI.SPRMEDI_MEDI_CODE ;
	 * 
	 * <multilinecomment> The following cursor is to default the Disability Type
	 * from GORMEDR </multilinecomment>
	 * 
	 * CURSOR GORMEDR_DISA_CURSOR IS SELECT GORMEDR_DISA_CODE FROM GORMEDR WHERE
	 * GORMEDR_MEDI_CODE = :SPRMEDI_MEDI_CODE AND GORMEDR_DEFAULT_IND = 'Y';
	 * 
	 * BEGIN OPEN GORMEDR_DISA_CURSOR; FETCH GORMEDR_DISA_CURSOR INTO
	 * :SPRMEDI_DISA_CODE; CLOSE GORMEDR_DISA_CURSOR; OPEN PTI_CURSOR ; FETCH
	 * PTI_CURSOR INTO :MEDI_DESCRIPTION ; G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
	 * G$_NLS.Get('GOAMEDI-0009', 'FORM','*ERROR* Invalid code; press LIST for
	 * valid codes') , TRUE); END ; -- :GLOBAL.QUERY_MODE := '0' ; EXCEPTION
	 * WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0' ; RAISE
	 * FORM_TRIGGER_FAILURE ; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRMEDI_MEDI_CODE")
	public void sprmediMediCode_PostChange() {

		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);

		if(sprmediElement!=null){

		int rowCount = 0;
		
		if(sprmediElement == null)
			return;
		
		if (sprmediElement.getSprmediMediCode().isNull())
			return;
		try {
			getTask().getGoqrpls().gCheckQueryMode();
			{
				String sqlptiCursor = "SELECT STVMEDI_DESC " + " FROM STVMEDI "
						+ " WHERE STVMEDI_CODE = :SPRMEDI_SPRMEDI_MEDI_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				String sqlgormedrDisaCursor = "SELECT GORMEDR_DISA_CODE "
						+ " FROM GORMEDR "
						+ " WHERE GORMEDR_MEDI_CODE = :SPRMEDI_MEDI_CODE AND GORMEDR_DEFAULT_IND = 'Y' ";
				DataCursor gormedrDisaCursor = new DataCursor(
						sqlgormedrDisaCursor);
				try {
					// Setting query parameters
					gormedrDisaCursor.addParameter("SPRMEDI_MEDI_CODE",
							sprmediElement.getSprmediMediCode());
					
					gormedrDisaCursor.open();
					ResultSet gormedrDisaCursorResults = gormedrDisaCursor
							.fetchInto();
					if (gormedrDisaCursorResults != null) {
						sprmediElement
						.setSprmediDisaCode(gormedrDisaCursorResults
								.getStr(0));
					}
					gormedrDisaCursor.close();
					// Setting query parameters
					ptiCursor.addParameter("SPRMEDI_SPRMEDI_MEDI_CODE",
							sprmediElement.getSprmediMediCode());
					
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						sprmediElement.setMediDescription(ptiCursorResults
								.getStr(0));
					}
					getTask()
					.getGoqrpls()
					.gCheckValue(
							toBool(ptiCursor.notFound()),
							GNls.Fget(
									toStr("GOAMEDI-0009"),
									toStr("FORM"),
									toStr("*ERROR* Invalid code; press LIST for valid codes")),
									toBool(NBool.True));
				} finally {
					gormedrDisaCursor.close();
					ptiCursor.close();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_MEDI_CODE.WHEN-VALIDATE-ITEM IF :SPRMEDI_MEDI_CODE IS NULL THEN
	 * :MEDI_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRMEDI_MEDI_CODE")
	public void sprmediMediCode_validate() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		if(sprmediElement == null)
			return;
		

		this.sprmediMediCode_PostChange();

		if (sprmediElement.getSprmediMediCode().isNull()) {
			sprmediElement.setMediDescription(toStr(""));
		}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MEDI_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "MEDI_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void mediDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_MEDI_CODE_DATE_DBT")
	public void sprmediMediCodeDateDbt_click() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MEDI_CODE_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRMEDI_MEDI_CODE_DATE_DBT")
	public void sprmediMediCodeDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}
	
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRMEDI_DISA_CODE")
	public void sprmediDisaCode_doubleClick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRMEDI_DISA_CODE", function = KeyFunction.ITEM_CHANGE)
	public void sprmediDisaCode_itemChange() {

		getGCodeClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRMEDI_DISA_CODE")
	public void sprmediDisaCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRMEDI_DISA_CODE")
	public void sprmediDisaCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRMEDI_DISA_CODE", function = KeyFunction.NEXT_ITEM)
	public void sprmediDisaCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRMEDI_DISA_CODE", function = KeyFunction.ITEM_OUT)
	public void sprmediDisaCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_DISA_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE ; -- DECLARE CURSOR PTI_CURSOR IS SELECT STVDISA_DESC
	 * FROM STVDISA WHERE STVDISA_CODE = :SPRMEDI.SPRMEDI_DISA_CODE ; BEGIN OPEN
	 * PTI_CURSOR ; FETCH PTI_CURSOR INTO :DISA_DESCRIPTION ; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAMEDI-0010', 'FORM','*ERROR* Invalid
	 * code; press LIST for valid codes') , TRUE); END ; -- :GLOBAL.QUERY_MODE
	 * := '0' ; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE :=
	 * '0' ; RAISE FORM_TRIGGER_FAILURE ; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRMEDI_DISA_CODE")
	public void sprmediDisaCode_PostChange() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		int rowCount = 0;
		
		if(sprmediElement == null)
			return;
		
		if (sprmediElement.getSprmediDisaCode().isNull())
			return;
		try {
			getTask().getGoqrpls().gCheckQueryMode();
			{
				String sqlptiCursor = "SELECT STVDISA_DESC " + " FROM STVDISA "
						+ " WHERE STVDISA_CODE = :SPRMEDI_SPRMEDI_DISA_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("SPRMEDI_SPRMEDI_DISA_CODE",
							sprmediElement.getSprmediDisaCode());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						sprmediElement.setDisaDescription(ptiCursorResults
								.getStr(0));
					}
					getTask()
					.getGoqrpls()
					.gCheckValue(
							toBool(ptiCursor.notFound()),
							GNls.Fget(
									toStr("GOAMEDI-0010"),
									toStr("FORM"),
									toStr("*ERROR* Invalid code; press LIST for valid codes")),
									toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_DISA_CODE.WHEN-VALIDATE-ITEM IF :SPRMEDI_DISA_CODE IS NULL THEN
	 * :DISA_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRMEDI_DISA_CODE")
	public void sprmediDisaCode_validate() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		if(sprmediElement == null)
			return;

		this.sprmediDisaCode_PostChange();

		if (sprmediElement.getSprmediDisaCode().isNull()) {
			sprmediElement.setDisaDescription(toStr(""));
		}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * DISA_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "DISA_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void disaDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_DISB_IND.WHEN-CHECKBOX-CHANGED DECLARE CURRENT_REC_NUMBER
	 * PLS_INTEGER; TOP_REC_NUMBER PLS_INTEGER; REC_CNT PLS_INTEGER := 0; BEGIN
	 * IF :SYSTEM.MODE = 'ENTER-QUERY' THEN RETURN; END IF; --
	 * CURRENT_REC_NUMBER := :SYSTEM.CURSOR_RECORD; TOP_REC_NUMBER :=
	 * GET_BLOCK_PROPERTY('SPRMEDI',TOP_RECORD); FIRST_RECORD; -- LOOP IF
	 * :SPRMEDI_DISB_IND = 'Y' THEN REC_CNT := REC_CNT + 1; END IF; IF
	 * :SYSTEM.LAST_RECORD = 'TRUE' THEN EXIT; END IF; -- NEXT_RECORD; END LOOP;
	 * -- IF CURRENT_REC_NUMBER = TOP_REC_NUMBER THEN
	 * GO_RECORD(CURRENT_REC_NUMBER); ELSE GO_RECORD(TOP_REC_NUMBER);
	 * NEXT_RECORD; END IF; GO_ITEM('SPRMEDI_DISB_IND'); -- IF REC_CNT > 1 THEN
	 * MESSAGE (G$_NLS.Get('GOAMEDI-0012','FORM','*ERROR* Only one disability
	 * may be designated as primary')); :SPRMEDI_DISB_IND := 'N'; RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISB_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "SPRMEDI_DISB_IND")
	public void sprmediDisbInd_checkBoxChange() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel().getSprmedi().getRowAdapter(true);
		if(sprmediElement != null)
		{
			NInteger currentRecNumber = NInteger.getNull();
			NInteger topRecNumber = NInteger.getNull();
			NInteger recCnt = toInt(0);
			if (getMode().equals("ENTER-QUERY")) {
				return;
			}
			//
			currentRecNumber = toInt(getCursorRecord());
			
			topRecNumber = getBlockTopMostRecord();

			firstRecord();
			//
			while (true) {
				if (sprmediElement.getSprmediDisbInd().equals("Y")) {
					recCnt = recCnt.add(1);
				}
				if (isInLastRecord()) {
					break;
				}
				//
				nextRecord();
			}
			//
//			if (currentRecNumber.equals(topRecNumber)) {
//				setCurrentRecord(toStr(currentRecNumber));
//			} else {
//				setCurrentRecord(toStr(topRecNumber));
//				nextRecord();
//			}
			setCurrentRecord(toStr(currentRecNumber));
			doNavigation(); //porque ao replicar o Issue ELLBHR-23716, ao fazer check e depois uncheck o form entrava em loop neste método.
							//Agora já não faz loop, mas muda de registo. Bruno Aleluia
			goItem(toStr("SPRMEDI_DISB_IND"));
			//
			if (recCnt.greater(1)) {
				errorMessage(GNls.Fget(toStr("GOAMEDI-0012"),toStr("FORM"),toStr("*ERROR* Only one disability may be designated as primary")));
				sprmediElement.setSprmediDisbInd(toStr("N"));
				throw new ApplicationException();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRMEDI_MDEQ_CODE")
	public void sprmediMdeqCode_doubleClick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRMEDI_MDEQ_CODE", function = KeyFunction.ITEM_CHANGE)
	public void sprmediMdeqCode_itemChange() {

		getGCodeClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRMEDI_MDEQ_CODE")
	public void sprmediMdeqCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRMEDI_MDEQ_CODE")
	public void sprmediMdeqCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRMEDI_MDEQ_CODE", function = KeyFunction.NEXT_ITEM)
	public void sprmediMdeqCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRMEDI_MDEQ_CODE", function = KeyFunction.ITEM_OUT)
	public void sprmediMdeqCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_MDEQ_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE ; -- DECLARE CURSOR PTI_CURSOR IS SELECT STVMDEQ_DESC
	 * FROM STVMDEQ WHERE STVMDEQ_CODE = :SPRMEDI.SPRMEDI_MDEQ_CODE ; BEGIN OPEN
	 * PTI_CURSOR ; FETCH PTI_CURSOR INTO :MDEQ_DESCRIPTION ; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAMEDI-0013', 'FORM','*ERROR* Invalid
	 * code; press LIST for valid codes') , TRUE); END ; -- :GLOBAL.QUERY_MODE
	 * := '0' ; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE :=
	 * '0' ; RAISE FORM_TRIGGER_FAILURE ; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRMEDI_MDEQ_CODE")
	public void sprmediMdeqCode_PostChange() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		int rowCount = 0;
		
		if(sprmediElement == null)
			return;
		
		if (sprmediElement.getSprmediMdeqCode().isNull())
			return;
		try {
			getTask().getGoqrpls().gCheckQueryMode();
			{
				String sqlptiCursor = "SELECT STVMDEQ_DESC " + " FROM STVMDEQ "
						+ " WHERE STVMDEQ_CODE = :SPRMEDI_SPRMEDI_MDEQ_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("SPRMEDI_SPRMEDI_MDEQ_CODE",
							sprmediElement.getSprmediMdeqCode());

					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						sprmediElement.setMdeqDescription(ptiCursorResults
								.getStr(0));
					}
					getTask()
					.getGoqrpls()
					.gCheckValue(toBool(
							ptiCursor.notFound()),
							GNls.Fget(
									toStr("GOAMEDI-0013"),
									toStr("FORM"),
									toStr("*ERROR* Invalid code; press LIST for valid codes")),
									toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_MDEQ_CODE.WHEN-VALIDATE-ITEM IF :SPRMEDI_MDEQ_CODE IS NULL THEN
	 * :MDEQ_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRMEDI_MDEQ_CODE")
	public void sprmediMdeqCode_validate() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		if(sprmediElement == null)
			return;
		
		this.sprmediMdeqCode_PostChange();

		if (sprmediElement.getSprmediMdeqCode().isNull()) {
			sprmediElement.setMdeqDescription(toStr(""));
		}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MDEQ_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "MDEQ_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void mdeqDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRMEDI_SPSR_CODE")
	public void sprmediSpsrCode_doubleClick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRMEDI_SPSR_CODE", function = KeyFunction.ITEM_CHANGE)
	public void sprmediSpsrCode_itemChange() {

		getGCodeClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRMEDI_SPSR_CODE")
	public void sprmediSpsrCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS" , item = "SPRMEDI_SPSR_CODE")
	public void sprmediSpsrCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRMEDI_SPSR_CODE", function = KeyFunction.NEXT_ITEM)
	public void sprmediSpsrCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRMEDI_SPSR_CODE", function = KeyFunction.ITEM_OUT)
	public void sprmediSpsrCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_SPSR_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE ; -- DECLARE CURSOR PTI_CURSOR IS SELECT STVSPSR_DESC
	 * FROM STVSPSR WHERE STVSPSR_CODE = :SPRMEDI.SPRMEDI_SPSR_CODE ; BEGIN OPEN
	 * PTI_CURSOR ; FETCH PTI_CURSOR INTO :SPSR_DESCRIPTION ; G$_CHECK_VALUE
	 * (PTI_CURSOR%NOTFOUND, G$_NLS.Get('GOAMEDI-0014', 'FORM','*ERROR* Invalid
	 * code; press LIST for valid codes') , TRUE); END ; -- :GLOBAL.QUERY_MODE
	 * := '0' ; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE :=
	 * '0' ; RAISE FORM_TRIGGER_FAILURE ; END ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRMEDI_SPSR_CODE")
	public void sprmediSpsrCode_PostChange() {


		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		if(sprmediElement == null)
			return;

		int rowCount = 0;
		if (sprmediElement.getSprmediSpsrCode().isNull())
			return;
		try {
			getTask().getGoqrpls().gCheckQueryMode();
			{
				String sqlptiCursor = "SELECT STVSPSR_DESC " + " FROM STVSPSR "
						+ " WHERE STVSPSR_CODE = :SPRMEDI_SPRMEDI_SPSR_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					// Setting query parameters
					ptiCursor.addParameter("SPRMEDI_SPRMEDI_SPSR_CODE",
							sprmediElement.getSprmediSpsrCode());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						sprmediElement.setSpsrDescription(ptiCursorResults
								.getStr(0));
					}
					getTask()
					.getGoqrpls()
					.gCheckValue(toBool(
							ptiCursor.notFound()),
							GNls.Fget(
									toStr("GOAMEDI-0014"),
									toStr("FORM"),
									toStr("*ERROR* Invalid code; press LIST for valid codes")),
									toBool(NBool.True));
				} finally {
					ptiCursor.close();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_SPSR_CODE.WHEN-VALIDATE-ITEM IF :SPRMEDI_SPSR_CODE IS NULL THEN
	 * :SPSR_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_SPSR_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRMEDI_SPSR_CODE")
	public void sprmediSpsrCode_validate() {

		
		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel()
				.getSprmedi().getRowAdapter(true);
		if(sprmediElement!=null){
		if(sprmediElement == null)
			return;
		
		this.sprmediSpsrCode_PostChange();

		if (sprmediElement.getSprmediSpsrCode().isNull()) {
			sprmediElement.setSpsrDescription(toStr(""));
		}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPSR_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPSR_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void spsrDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_COMMENT.KEY-EDIT declare
	 * returned_text varchar2(5000):=''; message_out varchar2(250); begin
	 * TEXT_EDIT_PROC(':sprmedi_comment',3600,returned_text, message_out);
	 * g$_check_failure; :sprmedi_comment := returned_text; if message_out is
	 * not null then message(message_out); end if; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_COMMENT.KEY-EDIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-EDIT", item="SPRMEDI_COMMENT")
	public void sprmediComment_KeyEdit() {

		
		SprmediAdapter sprmediElement = (SprmediAdapter) this.getFormModel().getSprmedi().getRowAdapter(true);
		if(sprmediElement != null)
		{
			NString returnedText = toStr("");
			NString messageOut = NString.getNull();
			Ref<NString> returnTextOut_ref = new Ref<NString>(returnedText);
			Ref<NString> messageOut_ref = new Ref<NString>(messageOut);
			this.getTask().getServices().textEditProc(toStr(":sprmedi_comment"), toNumber(3600),returnTextOut_ref, messageOut_ref);
			returnedText = returnTextOut_ref.val;
			messageOut = messageOut_ref.val;
			getTask().getGoqrpls().gCheckFailure();
			sprmediElement.setSprmediComment(returnedText);
			if (!messageOut.isNull()) {
				message(messageOut);
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRMEDI_COMMENT.ON-ERROR
	 * TEXT_ERROR_PROC(':sprmedi_comment',3600); g$_check_failure;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_COMMENT.ON-ERROR
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@OnError
	public void sprmediComment_OnError(EventObject args) {

		this.getTask().getServices()
		.textErrorProc(toStr(":sprmedi_comment"), toNumber(3600));
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_COMMENT_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_COMMENT_BTN")
	public void sprmediCommentBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRMEDI_COMMENT_BTN.WHEN-BUTTON-PRESSED -- 7311 IF :SYSTEM.CURSOR_BLOCK
	 * <> 'SPRMEDI' THEN MESSAGE(G$_NLS.GET('x','FORM','Button is outside of the
	 * current block.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * go_item('SPRMEDI_COMMENT'); --Defect 1-331QWN IF
	 * GET_ITEM_PROPERTY('SPRMEDI_COMMENT',ENABLED) = 'TRUE' THEN
	 * execute_trigger('KEY-EDIT'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_COMMENT_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRMEDI_COMMENT_BTN")
	public void sprmediCommentBtn_buttonClick() {

		// 7311
		// 7311
		if (getCursorBlock().notEquals("SPRMEDI")) {
			errorMessage(GNls.Fget(toStr("x"), toStr("FORM"),
					toStr("Button is outside of the current block.")));
			throw new ApplicationException();
		}
		//
		goItem(toStr("SPRMEDI_COMMENT"));
		// Defect 1-331QWN
		if (getItemEnabled("SPRMEDI_COMMENT").equals("TRUE")) {
			executeAction("KEY-EDIT");
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRMEDI_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void sprmediActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRMEDI_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void sprmediActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRMEDI_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void sprmediActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_DISA_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_DISA_CODE_LBT")
	public void sprmediDisaCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRMEDI_MDEQ_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRMEDI_MDEQ_CODE_LBT")
	public void sprmediMdeqCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRMEDI.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void sprmedi_AfterQuery(RowAdapterEvent args) {

		SprmediAdapter sprmediElement = (SprmediAdapter) args.getRow();


		try {
			sprmediElement.setLockDbValues(true);
			try {  
				this.sprmediMediCode_PostChange(); 
			} catch(Exception ex) { 
			} 
			try {  
				this.sprmediDisaCode_PostChange(); 
			} catch(Exception ex) { 
			} 
			try {  
				this.sprmediMdeqCode_PostChange(); 
			} catch(Exception ex) { 
			} 
			try {  
				this.sprmediSpsrCode_PostChange(); 
			} catch(Exception ex) { 
			} 
			

			//[DELETE] 

					//[DELETE] 
							//[DELETE] 
									//[DELETE] 
		} finally {
			sprmediElement.setLockDbValues(false);
		}



	}

	@BeforeQuery
	public void sprmedi_BeforeQuery(QueryEvent args)
	{

		((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", getFormModel().getKeyBlock().getPidm() ));             

	}

}
