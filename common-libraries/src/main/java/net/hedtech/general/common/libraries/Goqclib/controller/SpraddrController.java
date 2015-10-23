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
import net.hedtech.general.common.libraries.Goqclib.services.Exceptions.ToDateCheckAdd;
import net.hedtech.general.common.libraries.Goqclib.services.Exceptions.ToDateCheckChg;
import net.hedtech.general.common.libraries.Goqclib.services.UnknownTypes;
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class SpraddrController extends AbstractSupportCodeObject {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getContainer().getContainerPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
//	}
	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}
	
	private GIconBtnClass getGIconBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}
	
	private GCalendarBtnClass getGCalendarBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}
	
	private GDescClass getGDescClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}
	
	private GDateClass getGDateClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}

	public SpraddrController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-BLOCK-INSTANCE
	 * G$_NAVIGATION_FRAME.POPULATE_GUROPTM; G$_CHECK_FAILURE; --
	 * :HOLD_BLOCK_FIELD := 'SPRADDR.SPRADDR_ATYP_CODE';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void spraddr_blockChange() {

		getContainer().getGoqrpls().getGNavigationFrame().populateGuroptm();
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"HOLD_BLOCK_FIELD", "SPRADDR.SPRADDR_ATYP_CODE");
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.PRE-QUERY DECLARE lv_i
	 * VARCHAR2(3) := '''' || 'I' || ''''; lv_j VARCHAR2(3) := '''' || 'J' ||
	 * ''''; -- lv_hr_sort VARCHAR2(1200) := 'DECODE(spraddr_status_ind, ' ||
	 * lv_i || ', -1, ' ||
	 * 'DECODE(TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,SYSDATE+1),' || lv_j || '))
	 * - ' || 'TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')),0,1,
	 * (TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,' || 'SYSDATE+1),' || lv_j || '))
	 * - TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')))) / ' ||
	 * 'DECODE(ABS(TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,SYSDATE+1),' || lv_j ||
	 * ')) - ' || 'TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || '))),0,1,
	 * (ABS(TO_NUMBER(TO_CHAR(NVL' || '(spraddr_to_date,SYSDATE+1),' || lv_j ||
	 * ')) - TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')))))) * ' ||
	 * '(DECODE(TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')) -
	 * TO_NUMBER(TO_CHAR(NVL(' || 'spraddr_from_date,SYSDATE-1),' || lv_j ||
	 * ')),0,1, (TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')) - ' ||
	 * 'TO_NUMBER(TO_CHAR(NVL(spraddr_from_date,SYSDATE-1),' || lv_j || ')))) /
	 * ' || 'DECODE(ABS(TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')) -
	 * TO_NUMBER(TO_CHAR(NVL(' || 'spraddr_from_date,SYSDATE-1),' || lv_j ||
	 * '))),0,1, (ABS(TO_NUMBER(TO_CHAR(SYSDATE,' || lv_j || ')) - ' ||
	 * 'TO_NUMBER(TO_CHAR(NVL(spraddr_from_date,SYSDATE-1),' || lv_j || '))))))
	 * DESC, ' || 'spraddr_atyp_code, spraddr_to_date DESC, spraddr_from_date
	 * DESC, spraddr_seqno'; -- lv_fin_sort VARCHAR2(100) := 'spraddr_atyp_code,
	 * spraddr_seqno'; -- lv_al_sort VARCHAR2(500) := 'spraddr_status_ind DESC,
	 * spraddr_to_date DESC, ' || 'spraddr_from_date DESC, spraddr_atyp_code';
	 * -- lv_this_product VARCHAR2(1) := SUBSTR(:SYSTEM.CURRENT_FORM,1,1); BEGIN
	 * -- -- Add dynamic sort for specific products and forms. -- CASE
	 * lv_this_product WHEN 'F' THEN IF :SYSTEM.CURRENT_FORM = 'FOAIDEN' THEN
	 * SET_BLOCK_PROPERTY('SPRADDR',ORDER_BY,lv_hr_sort); ELSE
	 * SET_BLOCK_PROPERTY('SPRADDR',ORDER_BY,lv_fin_sort); END IF; WHEN 'P' THEN
	 * SET_BLOCK_PROPERTY('SPRADDR',ORDER_BY,lv_hr_sort); WHEN 'A' THEN
	 * SET_BLOCK_PROPERTY('SPRADDR',ORDER_BY,lv_al_sort); ELSE NULL; END CASE;
	 * -- EXECUTE_TRIGGER('CHECK_IF_PHONE_EXISTS'); IF :SPRADDR.PHONE_EXISTS =
	 * 'N' THEN :SPRADDR.CHANGE_STATUS := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void spraddr_BeforeQuery(QueryEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"KEY_BLOCK_PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));

		{
			NString lvI = toStr("'").append("I").append("'");
			NString lvJ = toStr("'").append("J").append("'");
			//
			NString lvHrSort = toStr("DECODE(spraddr_status_ind, ")
					.append(lvI)
					.append(", -1, ")
					.append("DECODE(TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,SYSDATE+1),")
					.append(lvJ)
					.append(")) - ")
					.append("TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")),0,1, (TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,")
					.append("SYSDATE+1),")
					.append(lvJ)
					.append(")) - TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")))) / ")
					.append("DECODE(ABS(TO_NUMBER(TO_CHAR(NVL(spraddr_to_date,SYSDATE+1),")
					.append(lvJ)
					.append(")) - ")
					.append("TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append("))),0,1, (ABS(TO_NUMBER(TO_CHAR(NVL")
					.append("(spraddr_to_date,SYSDATE+1),")
					.append(lvJ)
					.append(")) - TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")))))) * ")
					.append("(DECODE(TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")) - TO_NUMBER(TO_CHAR(NVL(")
					.append("spraddr_from_date,SYSDATE-1),")
					.append(lvJ)
					.append(")),0,1, (TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")) - ")
					.append("TO_NUMBER(TO_CHAR(NVL(spraddr_from_date,SYSDATE-1),")
					.append(lvJ)
					.append(")))) / ")
					.append("DECODE(ABS(TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")) - TO_NUMBER(TO_CHAR(NVL(")
					.append("spraddr_from_date,SYSDATE-1),")
					.append(lvJ)
					.append("))),0,1, (ABS(TO_NUMBER(TO_CHAR(SYSDATE,")
					.append(lvJ)
					.append(")) - ")
					.append("TO_NUMBER(TO_CHAR(NVL(spraddr_from_date,SYSDATE-1),")
					.append(lvJ)
					.append(")))))) DESC, ")
					.append("spraddr_atyp_code, spraddr_to_date DESC, spraddr_from_date DESC, spraddr_seqno");
			//
			NString lvFinSort = toStr("spraddr_atyp_code, spraddr_seqno");
			//
			NString lvAlSort = toStr(
					"spraddr_status_ind DESC, spraddr_to_date DESC, ").append(
					"spraddr_from_date DESC, spraddr_atyp_code");
			//
			NString lvThisProduct = substring(toStr(getCurrentTaskName()),
					toInt(1), toInt(1));
			//
			// Add dynamic sort for specific products and forms.
			//
			if (lvThisProduct.equals("F")) {
				if (getCurrentTaskName().equals("FOAIDEN")) {
					setBlockOrderByClause("SPRADDR", lvHrSort);
				} else {
					setBlockOrderByClause("SPRADDR", lvFinSort);
				}
			} else if (lvThisProduct.equals("P")) {
				setBlockOrderByClause("SPRADDR", lvHrSort);
			} else if (lvThisProduct.equals("A")) {
				setBlockOrderByClause("SPRADDR", lvAlSort);
			} else {
			}
			//
			executeAction("CHECK_IF_PHONE_EXISTS");
			if (spraddrElement.getPhoneExists().equals("N")) {
				spraddrElement.setChangeStatus(toStr(""));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.POST-QUERY
	 * EXECUTE_TRIGGER('CHECK_PHONE'); -- :SPRADDR.HOLD_STATUS :=
	 * :SPRADDR.SPRADDR_STATUS_IND; -- IF :SYSTEM.CURRENT_FORM = 'APAIDEN' THEN
	 * EXECUTE_TRIGGER('SET_CHECK_BOXES'); END IF; -- SET_ITEM_PROPERTY
	 * ('SPRADDR.TELE_CODE_LBT', ENABLED, PROPERTY_ON); SET_ITEM_PROPERTY
	 * ('SPRADDR.PHONE_BTN', ENABLED, PROPERTY_ON);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void spraddr_AfterQuery(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();
		try {
			spraddrElement.setLockDbValues(true);

			if (!spraddrElement.getSpraddrAsrcCode().isNull())
				this.spraddrAsrcCode_PostChange();
			if (!spraddrElement.getTeleCode().isNull())
				this.teleCode_PostChange();
			if (!spraddrElement.getSpraddrNatnCode().isNull())
				this.spraddrNatnCode_PostChange();
			if (!spraddrElement.getSpraddrCntyCode().isNull())
				this.spraddrCntyCode_PostChange();
			if (!spraddrElement.getSpraddrStatCode().isNull())
				this.spraddrStatCode_PostChange();
			if (!spraddrElement.getSpraddrAtypCode().isNull())
				this.spraddrAtypCode_PostChange();
			if (!spraddrElement.getSpraddrToDate().isNull())
				this.spraddrToDate_PostChange();
			if (!spraddrElement.getSpraddrFromDate().isNull())
				this.spraddrFromDate_PostChange();
		} finally {
			spraddrElement.setLockDbValues(false);
		}
		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		executeAction("CHECK_PHONE");
		//
		spraddrElement.setHoldStatus(spraddrElement.getSpraddrStatusInd());
		//
		if (getCurrentTaskName().equals("APAIDEN")) {
			executeAction("SET_CHECK_BOXES");
		}
		//
		setItemEnabled("SPRADDR.TELE_CODE_LBT", true);
		setItemEnabled("SPRADDR.PHONE_BTN", true);
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.PRE-INSERT BEGIN
	 * :SPRADDR.SPRADDR_ACTIVITY_DATE := TRUNC(SYSDATE); --
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('CHECK_DATES'); G$_CHECK_FAILURE; --
	 * :SPRADDR.SPRADDR_USER := :GLOBAL.CURRENT_USER; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void spraddr_BeforeRowInsert(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		spraddrElement.setSpraddrActivityDate(trunc(NDate.getNow()));
		//
		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_DATES");
		getContainer().getGoqrpls().gCheckFailure();
		//
		spraddrElement.setSpraddrUser(getGlobal("CURRENT_USER"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.ON-INSERT -- 82-1 add
	 * SPRADDR_CTRY_CODE_PHONE, SPRADDR_HOUSE_NUMBER, SPRADDR_STREET_LINE4,
	 * BEGIN EXECUTE_TRIGGER('SET_FINANCE_RULES'); -- IF
	 * :GLOBAL.USE_FINANCE_RULES <> 'Y' THEN :SPRADDR.SPRADDR_SEQNO := NULL; END
	 * IF; -- GB_ADDRESS.P_CREATE(p_PIDM =>:SPRADDR.SPRADDR_PIDM, p_ATYP_CODE
	 * =>:SPRADDR.SPRADDR_ATYP_CODE, p_FROM_DATE =>:SPRADDR.SPRADDR_FROM_DATE,
	 * p_TO_DATE =>:SPRADDR.SPRADDR_TO_DATE, p_STREET_LINE1
	 * =>:SPRADDR.SPRADDR_STREET_LINE1, p_STREET_LINE2
	 * =>:SPRADDR.SPRADDR_STREET_LINE2, p_STREET_LINE3
	 * =>:SPRADDR.SPRADDR_STREET_LINE3, p_CITY =>:SPRADDR.SPRADDR_CITY,
	 * p_STAT_CODE =>:SPRADDR.SPRADDR_STAT_CODE, p_ZIP =>:SPRADDR.SPRADDR_ZIP,
	 * p_CNTY_CODE =>:SPRADDR.SPRADDR_CNTY_CODE, p_NATN_CODE
	 * =>:SPRADDR.SPRADDR_NATN_CODE, p_STATUS_IND =>:SPRADDR.SPRADDR_STATUS_IND,
	 * p_USER =>:GLOBAL.CURRENT_USER, p_ASRC_CODE =>:SPRADDR.SPRADDR_ASRC_CODE,
	 * p_DELIVERY_POINT =>:SPRADDR.SPRADDR_DELIVERY_POINT, p_CORRECTION_DIGIT
	 * =>:SPRADDR.SPRADDR_CORRECTION_DIGIT, p_CARRIER_ROUTE
	 * =>:SPRADDR.SPRADDR_CARRIER_ROUTE, p_GST_TAX_ID
	 * =>:SPRADDR.SPRADDR_GST_TAX_ID, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN, --
	 * p_ctry_code_phone =>:SPRADDR.SPRADDR_CTRY_CODE_PHONE, -- 82-1
	 * p_house_number =>:SPRADDR.SPRADDR_HOUSE_NUMBER, -- 82-1 p_street_line4
	 * =>:SPRADDR.SPRADDR_STREET_LINE4, -- 82-1 p_FINANCE_RULES
	 * =>:GLOBAL.USE_FINANCE_RULES, p_SEQNO_INOUT =>:SPRADDR.SPRADDR_SEQNO,
	 * p_ROWID_OUT =>:SPRADDR.ROWID); -- EXECUTE_TRIGGER('RESET_FINANCE_RULES');
	 * -- :SPRADDR.SPRADDR_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRADDR.ROWID),'DDMONYYYYHH24MISS'); --
	 * EXCEPTION WHEN OTHERS THEN EXECUTE_TRIGGER('RESET_FINANCE_RULES');
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void spraddr_RowInsert(RowAdapterEvent args) {

		// 82-1 add SPRADDR_CTRY_CODE_PHONE, SPRADDR_HOUSE_NUMBER,
		// SPRADDR_STREET_LINE4,
		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		try {
			executeAction("SET_FINANCE_RULES");
			//
			if (getGlobal("USE_FINANCE_RULES").notEquals("Y")) {
				spraddrElement.setSpraddrSeqno(toNumber(null));
			}
			//
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			Ref<NNumber> pSeqnoInout = new Ref<NNumber>(
					spraddrElement.getSpraddrSeqno());
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbAddress.pCreate(/* pPidm=> */spraddrElement.getSpraddrPidm(),
			/* pAtypCode=> */spraddrElement.getSpraddrAtypCode(),
			/* pFromDate=> */spraddrElement.getSpraddrFromDate(),
			/* pToDate=> */spraddrElement.getSpraddrToDate(),
			/* pStreetLine1=> */spraddrElement.getSpraddrStreetLine1(),
			/* pStreetLine2=> */spraddrElement.getSpraddrStreetLine2(),
			/* pStreetLine3=> */spraddrElement.getSpraddrStreetLine3(),
			/* pCity=> */spraddrElement.getSpraddrCity(),
			/* pStatCode=> */spraddrElement.getSpraddrStatCode(),
			/* pZip=> */spraddrElement.getSpraddrZip(),
			/* pCntyCode=> */spraddrElement.getSpraddrCntyCode(),
			/* pNatnCode=> */spraddrElement.getSpraddrNatnCode(),
			/* pStatusInd=> */spraddrElement.getSpraddrStatusInd(),
			/* pUser=> */getGlobal("CURRENT_USER"),
			/* pAsrcCode=> */spraddrElement.getSpraddrAsrcCode(),
			/* pDeliveryPoint=> */spraddrElement.getSpraddrDeliveryPoint(),
			/* pCorrectionDigit=> */spraddrElement.getSpraddrCorrectionDigit(),
			/* pCarrierRoute=> */spraddrElement.getSpraddrCarrierRoute(),
			/* pGstTaxId=> */spraddrElement.getSpraddrGstTaxId(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pHouseNumber=> */spraddrElement.getSpraddrHouseNumber(),
			/* pStreetLine4=> */spraddrElement.getSpraddrStreetLine4(),
			/* pFinanceRules=> */getGlobal("USE_FINANCE_RULES"),
			/* pSeqnoInout=> */pSeqnoInout,
			/* pRowidOut=> */p_rowid_out_ref);
			//
			spraddrElement.setSpraddrSeqno(pSeqnoInout.val);
			spraddrElement.setROWID(p_rowid_out_ref.val);
			executeAction("RESET_FINANCE_RULES");
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spraddrElement.setSpraddrActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spraddrElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			executeAction("RESET_FINANCE_RULES");
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.POST-INSERT
	 * EXECUTE_TRIGGER('CHECK_PHONES'); G$_CHECK_FAILURE; -- IF
	 * :SPRADDR.PHONE_NUMBER IS NOT NULL THEN EXECUTE_TRIGGER('INSERT_SPRTELE');
	 * G$_CHECK_FAILURE; END IF; -- :MATERIAL_FLAG := 'Y'; :SPRADDR.CHANGE_PHONE
	 * := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.POST-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowInsert
	public void spraddr_AfterRowInsert(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		executeAction("CHECK_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (!spraddrElement.getPhoneNumber().isNull()) {
			executeAction("INSERT_SPRTELE");
			getContainer().getGoqrpls().gCheckFailure();
		}
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"MATERIAL_FLAG", "Y");
		spraddrElement.setChangePhone(toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.PRE-UPDATE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('CHECK_DATES'); G$_CHECK_FAILURE; --
	 * :SPRADDR.SPRADDR_ACTIVITY_DATE :=
	 * TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT); :SPRADDR.SPRADDR_USER
	 * := :GLOBAL.CURRENT_USER; -- IF :SPRADDR.SPRADDR_STATUS_IND = 'I' THEN IF
	 * NVL(:SPRADDR.HOLD_STATUS,'*') <> 'I' THEN :SPRADDR.CHANGE_STATUS := 'Y';
	 * END IF; ELSE IF :SPRADDR.HOLD_STATUS = 'I' THEN :SPRADDR.CHANGE_STATUS :=
	 * 'Y'; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void spraddr_BeforeRowUpdate(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_DATES");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spraddrElement.setSpraddrActivityDate(toDate(toStr(getFormModel()
				.getBusinessObject("FORM_HEADER").getValue("CURRENT_DATE")),
				GDate.getNlsDateFormat()));
		spraddrElement.setSpraddrUser(getGlobal("CURRENT_USER"));
		//
		if (spraddrElement.getSpraddrStatusInd().equals("I")) {
			if (isNull(spraddrElement.getHoldStatus(), "*").notEquals("I")) {
				spraddrElement.setChangeStatus(toStr("Y"));
			}
		} else {
			if (spraddrElement.getHoldStatus().equals("I")) {
				spraddrElement.setChangeStatus(toStr("Y"));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.ON-UPDATE -- 82-1 add
	 * SPRADDR_CTRY_CODE_PHONE, SPRADDR_HOUSE_NUMBER, SPRADDR_STREET_LINE4,
	 * BEGIN EXECUTE_TRIGGER('SET_FINANCE_RULES'); -- GB_ADDRESS.P_UPDATE(p_PIDM
	 * =>:SPRADDR.SPRADDR_PIDM, p_SEQNO =>:SPRADDR.SPRADDR_SEQNO, p_ATYP_CODE
	 * =>:SPRADDR.SPRADDR_ATYP_CODE, p_FROM_DATE =>:SPRADDR.SPRADDR_FROM_DATE,
	 * p_TO_DATE =>:SPRADDR.SPRADDR_TO_DATE, p_STREET_LINE1
	 * =>:SPRADDR.SPRADDR_STREET_LINE1, p_STREET_LINE2
	 * =>:SPRADDR.SPRADDR_STREET_LINE2, p_STREET_LINE3
	 * =>:SPRADDR.SPRADDR_STREET_LINE3, p_CITY =>:SPRADDR.SPRADDR_CITY,
	 * p_STAT_CODE =>:SPRADDR.SPRADDR_STAT_CODE, p_ZIP =>:SPRADDR.SPRADDR_ZIP,
	 * p_CNTY_CODE =>:SPRADDR.SPRADDR_CNTY_CODE, p_NATN_CODE
	 * =>:SPRADDR.SPRADDR_NATN_CODE, p_STATUS_IND =>:SPRADDR.SPRADDR_STATUS_IND,
	 * p_USER =>:GLOBAL.CURRENT_USER, p_ASRC_CODE =>:SPRADDR.SPRADDR_ASRC_CODE,
	 * p_DELIVERY_POINT =>:SPRADDR.SPRADDR_DELIVERY_POINT, p_CORRECTION_DIGIT
	 * =>:SPRADDR.SPRADDR_CORRECTION_DIGIT, p_GST_TAX_ID
	 * =>:SPRADDR.SPRADDR_GST_TAX_ID, p_CARRIER_ROUTE
	 * =>:SPRADDR.SPRADDR_CARRIER_ROUTE, -- p_ctry_code_phone
	 * =>:SPRADDR.SPRADDR_CTRY_CODE_PHONE, -- 82-1 p_house_number
	 * =>:SPRADDR.SPRADDR_HOUSE_NUMBER, -- 82-1 p_street_line4
	 * =>:SPRADDR.SPRADDR_STREET_LINE4, -- 82-1 p_FINANCE_RULES
	 * =>:GLOBAL.USE_FINANCE_RULES, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN, p_ROWID
	 * =>:SPRADDR.ROWID); -- EXECUTE_TRIGGER('RESET_FINANCE_RULES'); --
	 * :SPRADDR.SPRADDR_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRADDR.ROWID),'DDMONYYYYHH24MISS'); --
	 * EXCEPTION WHEN OTHERS THEN EXECUTE_TRIGGER('RESET_FINANCE_RULES');
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void spraddr_RowUpdate(RowAdapterEvent args) {

		// 82-1 add SPRADDR_CTRY_CODE_PHONE, SPRADDR_HOUSE_NUMBER,
		// SPRADDR_STREET_LINE4,
		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		try {
			executeAction("SET_FINANCE_RULES");
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbAddress.pUpdate(/* pPidm=> */spraddrElement.getSpraddrPidm(),
			/* pSeqno=> */spraddrElement.getSpraddrSeqno(),
			/* pAtypCode=> */spraddrElement.getSpraddrAtypCode(),
			/* pFromDate=> */spraddrElement.getSpraddrFromDate(),
			/* pToDate=> */spraddrElement.getSpraddrToDate(),
			/* pStreetLine1=> */spraddrElement.getSpraddrStreetLine1(),
			/* pStreetLine2=> */spraddrElement.getSpraddrStreetLine2(),
			/* pStreetLine3=> */spraddrElement.getSpraddrStreetLine3(),
			/* pCity=> */spraddrElement.getSpraddrCity(),
			/* pStatCode=> */spraddrElement.getSpraddrStatCode(),
			/* pZip=> */spraddrElement.getSpraddrZip(),
			/* pCntyCode=> */spraddrElement.getSpraddrCntyCode(),
			/* pNatnCode=> */spraddrElement.getSpraddrNatnCode(),
			/* pStatusInd=> */spraddrElement.getSpraddrStatusInd(),
			/* pUser=> */getGlobal("CURRENT_USER"),
			/* pAsrcCode=> */spraddrElement.getSpraddrAsrcCode(),
			/* pDeliveryPoint=> */spraddrElement.getSpraddrDeliveryPoint(),
			/* pCorrectionDigit=> */spraddrElement.getSpraddrCorrectionDigit(),
			/* pGstTaxId=> */spraddrElement.getSpraddrGstTaxId(),
			/* pCarrierRoute=> */spraddrElement.getSpraddrCarrierRoute(),
			/* pHouseNumber=> */spraddrElement.getSpraddrHouseNumber(),
			/* pStreetLine4=> */spraddrElement.getSpraddrStreetLine4(),
			/* pFinanceRules=> */getGlobal("USE_FINANCE_RULES"),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pRowid=> */spraddrElement.getROWID());
			//
			executeAction("RESET_FINANCE_RULES");
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spraddrElement.setSpraddrActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spraddrElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			executeAction("RESET_FINANCE_RULES");
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.POST-UPDATE
	 * EXECUTE_TRIGGER('CHECK_PHONES'); -- IF NOT FORM_FAILURE THEN IF
	 * :SPRADDR.PHONE_NUMBER IS NULL THEN
	 * EXECUTE_TRIGGER('UPDATE_PHONE_STATUS'); ELSE IF :SPRADDR.SPRTELE_SEQNO IS
	 * NULL THEN EXECUTE_TRIGGER('INSERT_SPRTELE'); ELSE
	 * EXECUTE_TRIGGER('UPDATE_SPRTELE'); END IF; END IF; END IF; --
	 * :SPRADDR.CHANGE_PHONE := ''; :SPRADDR.CHANGE_STATUS := '';
	 * :SPRADDR.HOLD_STATUS := :SPRADDR.SPRADDR_STATUS_IND;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.POST-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowUpdate
	public void spraddr_AfterRowUpdate(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		try {
			executeAction("CHECK_PHONES");

			// F2N_TODO: The above condition uses unsupported features. You
			// should eliminate all references to SupportClasses.
			if (spraddrElement.getPhoneNumber().isNull()) {
				executeAction("UPDATE_PHONE_STATUS");
			} else {
				if (spraddrElement.getSprteleSeqno().isNull()) {
					executeAction("INSERT_SPRTELE");
				} else {
					executeAction("UPDATE_SPRTELE");
				}
			}
		} finally {
			//
			spraddrElement.setChangePhone(toStr(""));
			spraddrElement.setChangeStatus(toStr(""));
			spraddrElement.setHoldStatus(spraddrElement.getSpraddrStatusInd());
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.PRE-DELETE NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.PRE-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowDelete
	public void spraddr_BeforeRowDelete(RowAdapterEvent args) {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.ON-DELETE BEGIN
	 * GB_ADDRESS.P_DELETE(p_PIDM =>:SPRADDR.SPRADDR_PIDM, p_ATYP_CODE
	 * =>:SPRADDR.SPRADDR_ATYP_CODE, p_SEQNO =>:SPRADDR.SPRADDR_SEQNO,
	 * p_STATUS_IND => :SPRADDR.SPRADDR_STATUS_IND, p_ROWID =>:SPRADDR.ROWID);
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void spraddr_RowDelete(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbAddress.pDelete(/* pPidm=> */spraddrElement.getSpraddrPidm(),
			/* pAtypCode=> */spraddrElement.getSpraddrAtypCode(),
			/* pSeqno=> */spraddrElement.getSpraddrSeqno(),
			/* pStatusInd=> */spraddrElement.getSpraddrStatusInd(),
			/* pRowid=> */spraddrElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.POST-DELETE
	 * :SPRADDR.CHANGE_PHONE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.POST-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowDelete
	public void spraddr_AfterRowDelete(RowAdapterEvent args) {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) args.getRow();

		spraddrElement.setChangePhone(toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-CLRFRM
	 * EXECUTE_TRIGGER('CLRFRM_TRIGGER'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-CLRFRM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CLRFRM", function = KeyFunction.CLEAR_FORM)
	public void spraddr_ClearTask() {

		executeAction("CLRFRM_TRIGGER");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-COMMIT IF
	 * :SPRADDR.SPRADDR_ATYP_CODE IS NULL THEN EXECUTE_TRIGGER('CHECK_PHONES');
	 * G$_CHECK_FAILURE; ELSE NEXT_FIELD; PREVIOUS_FIELD;
	 * EXECUTE_TRIGGER('CHECK_PHONES'); G$_CHECK_FAILURE; END IF; -- IF
	 * :SPRADDR.CHANGE_PHONE IS NULL THEN COMMIT_FORM; G$_CHECK_FAILURE; ELSE
	 * :SPRADDR.SPRADDR_PIDM := :SPRADDR.SPRADDR_PIDM; COMMIT_FORM;
	 * G$_CHECK_FAILURE; :SPRADDR.CHANGE_PHONE := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void spraddr_Save() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getSpraddrAtypCode().isNull()) {
			executeAction("CHECK_PHONES");
			getContainer().getGoqrpls().gCheckFailure();
		} else {
			executeAction("POST-TEXT-ITEM");
			nextItem();
			executeAction("POST-TEXT-ITEM");
			previousItem();
			executeAction("CHECK_PHONES");
			getContainer().getGoqrpls().gCheckFailure();
		}
		//
		if (spraddrElement.getChangePhone().isNull()) {
			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
		} else {
			if (spraddrElement.getRow().getStatus()
					.equals(DataRowStatus.UNCHANGED))
				spraddrElement.getRow().setStatus(DataRowStatus.UPDATED);
			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
			spraddrElement.setChangePhone(toStr(""));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-DELREC
	 * EXECUTE_TRIGGER('FIELDS_ENTERED'); G$_CHECK_FAILURE; -- DELETE_RECORD;
	 * G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void spraddr_DeleteRecord() {

		executeAction("FIELDS_ENTERED");
		getContainer().getGoqrpls().gCheckFailure();
		//
		deleteRecord();
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-DUPREC
	 * DUPLICATE_RECORD; :SPRADDR.SPRADDR_SEQNO := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-DUPREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUPREC", function = KeyFunction.DUPLICATE_RECORD)
	public void spraddr_CopyRecord() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		duplicateRecord();
		spraddrElement.setSpraddrSeqno(toNumber(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-ENTQRY
	 * SET_ITEM_PROPERTY ('SPRADDR.TELE_CODE_LBT', ENABLED, PROPERTY_OFF);
	 * SET_ITEM_PROPERTY ('SPRADDR.PHONE_BTN', ENABLED, PROPERTY_OFF); --
	 * G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY; G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void spraddr_Search() {

		setItemEnabled("SPRADDR.TELE_CODE_LBT", false);
		setItemEnabled("SPRADDR.PHONE_BTN", false);
		//
		getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyEntqry();
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTBLK NEXT_FIELD; IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0069','FORM','Address information changed,
	 * press SAVE before leaving current window.')); ELSE IF F_IS_PHONE_CHANGE =
	 * 'Y' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0070','FORM','Address information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void spraddr_NextBlock() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		nextItem();
		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0069"),
							toStr("FORM"),
							toStr("Address information changed, press SAVE before leaving current window.")));
		} else {
			if (this.getContainer().getServices().fIsPhoneChange(spraddrElement)
					.equals("Y")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0070"),
								toStr("FORM"),
								toStr("Address information changed, press SAVE before leaving current window.")));
			} else {
				executeAction("KEY_NXTBLOCK_TRG");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTKEY
	 * GO_ITEM('SPRADDR.SPRADDR_ZIP');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTKEY")
	public void spraddr_KeyNxtkey() {

		goItem(toStr("SPRADDR.SPRADDR_ZIP"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTREC
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('CHECK_PHONE_UPDATE'); G$_CHECK_FAILURE; -- NEXT_RECORD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void spraddr_NextRecord() {

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		executeAction("CHECK_PHONE_UPDATE");
		getContainer().getGoqrpls().gCheckFailure();
		//
		nextRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTSET
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('CHECK_PHONE_UPDATE'); G$_CHECK_FAILURE; -- NEXT_SET;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void spraddr_KeyNxtset() {

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		executeAction("CHECK_PHONE_UPDATE");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_NOT_SUPPORTED : Call to built-in "NEXT_SET" was removed because
		// it is not supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
		// SupportClasses.SQLFORMS.NextSet();
		this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'NEXT_SET' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-PRVBLK NEXT_FIELD; IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0071','FORM','Address information changed,
	 * press SAVE before leaving current window.')); ELSE IF F_IS_PHONE_CHANGE =
	 * 'Y' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0072','FORM','Address information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void spraddr_PreviousBlock() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		nextItem();
		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0071"),
							toStr("FORM"),
							toStr("Address information changed, press SAVE before leaving current window.")));
		} else {
			if (this.getContainer().getServices().fIsPhoneChange(spraddrElement)
					.equals("Y")) {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0072"),
								toStr("FORM"),
								toStr("Address information changed, press SAVE before leaving current window.")));
			} else {
				executeAction("KEY_PRVBLOCK_TRG");
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.KEY-PRVREC
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE;
	 * EXECUTE_TRIGGER('CHECK_PHONE_UPDATE'); G$_CHECK_FAILURE; -- IF
	 * :SYSTEM.RECORD_STATUS = 'INSERT' AND :SPRADDR.SPRADDR_ATYP_CODE IS NULL
	 * THEN SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE', REQUIRED,
	 * PROPERTY_OFF); PREVIOUS_RECORD; ELSE PREVIOUS_RECORD; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void spraddr_PreviousRecord() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		executeAction("CHECK_PHONE_UPDATE");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_WARNING : The built-in call was converted but there can be
		// semantic differences in the resulting code.
		if (getRecordStatus().equals("INSERT")
				&& spraddrElement.getSpraddrAtypCode().isNull()) {
			setItemRequired("SPRADDR.SPRADDR_ATYP_CODE", false);
			previousRecord();
		} else {
			previousRecord();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_ADDRESS IF
	 * (:SPRADDR.SPRADDR_ATYP_CODE IS NULL) THEN RETURN; END IF; --
	 * G$_CHECK_VALUE(:SPRADDR.SPRADDR_CITY IS NULL,
	 * G$_NLS.Get('GOQCLIB-0073','FORM','*ERROR* City must be entered.'), TRUE);
	 * -- G$_CHECK_VALUE ((:SPRADDR.SPRADDR_STAT_CODE IS NULL AND
	 * :SPRADDR.SPRADDR_NATN_CODE IS NULL),
	 * G$_NLS.Get('GOQCLIB-0074','FORM','*ERROR* Either State/Province or Nation
	 * must be entered.'), TRUE); -- G$_CHECK_VALUE ((:SPRADDR.SPRADDR_STAT_CODE
	 * IS NOT NULL AND :SPRADDR.SPRADDR_ZIP IS NULL),
	 * G$_NLS.Get('GOQCLIB-0075','FORM','*ERROR* Zip must be entered for City
	 * and State.'), TRUE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.CHECK_ADDRESS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ADDRESS")
	public void spraddr_CheckAddress() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if ((spraddrElement.getSpraddrAtypCode().isNull())) {
			return;
		}
		//
		getContainer().getGoqrpls().gCheckValue(
				toBool(spraddrElement.getSpraddrCity().isNull()),
				GNls.Fget(toStr("GOQCLIB-0073"), toStr("FORM"),
						toStr("*ERROR* City must be entered.")),
				toBool(NBool.True));
		//
		getContainer()
				.getGoqrpls()
				.gCheckValue(
						(toBool(spraddrElement.getSpraddrStatCode().isNull()
								&& spraddrElement.getSpraddrNatnCode().isNull())),
						GNls.Fget(
								toStr("GOQCLIB-0074"),
								toStr("FORM"),
								toStr("*ERROR* Either State/Province or Nation must be entered.")),
						toBool(NBool.True));
		//
		getContainer()
				.getGoqrpls()
				.gCheckValue(
						(toBool(!spraddrElement.getSpraddrStatCode().isNull()
								&& spraddrElement.getSpraddrZip().isNull())),
						GNls.Fget(
								toStr("GOQCLIB-0075"),
								toStr("FORM"),
								toStr("*ERROR* Zip must be entered for City and State.")),
						toBool(NBool.True));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_ADDRESS_EXISTS BEGIN
	 * IF (:SPRADDR.SPRADDR_CITY IS NULL) AND (:SPRADDR.SPRADDR_STAT_CODE IS
	 * NULL) AND (:SPRADDR.SPRADDR_CNTY_CODE IS NULL) AND
	 * (:SPRADDR.SPRADDR_NATN_CODE IS NULL) THEN :SPRADDR.NO_ADDR_INFO := 1;
	 * ELSE :SPRADDR.NO_ADDR_INFO := 0; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.CHECK_ADDRESS_EXISTS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ADDRESS_EXISTS")
	public void spraddr_CheckAddressExists() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if ((spraddrElement.getSpraddrCity().isNull())
				&& (spraddrElement.getSpraddrStatCode().isNull())
				&& (spraddrElement.getSpraddrCntyCode().isNull())
				&& (spraddrElement.getSpraddrNatnCode().isNull())) {
			spraddrElement.setNoAddrInfo(toNumber(1));
		} else {
			spraddrElement.setNoAddrInfo(toNumber(0));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_DATES DECLARE
	 * PTI_INTO_TEMP VARCHAR2(1); -- CURSOR PTI_CURSOR1 IS SELECT 'X' FROM
	 * SPRADDR WHERE SPRADDR.SPRADDR_PIDM = :KEY_BLOCK.PIDM AND
	 * SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE AND
	 * SPRADDR.SPRADDR_STATUS_IND IS NULL; -- CURSOR PTI_CURSOR2 IS SELECT 'X'
	 * FROM SPRADDR WHERE SPRADDR.ROWID <> :SPRADDR.ROWID AND
	 * SPRADDR.SPRADDR_PIDM = :KEY_BLOCK.PIDM AND SPRADDR.SPRADDR_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL; --
	 * CURSOR PTI_CURSOR3 IS SELECT 'X' FROM SPRADDR WHERE SPRADDR.SPRADDR_PIDM
	 * = :KEY_BLOCK.PIDM AND SPRADDR.SPRADDR_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND
	 * ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR
	 * ((NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))) OR
	 * (NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND
	 * NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND
	 * NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))))); -- CURSOR PTI_CURSOR4 IS
	 * SELECT 'X' FROM SPRADDR WHERE SPRADDR.ROWID <> :SPRADDR.ROWID AND
	 * SPRADDR.SPRADDR_PIDM = :KEY_BLOCK.PIDM AND SPRADDR.SPRADDR_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND
	 * ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR
	 * ((NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))) OR
	 * (NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND
	 * NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
	 * NVL(:SPRADDR.SPRADDR_FROM_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT)) AND
	 * NVL(:SPRADDR.SPRADDR_TO_DATE,
	 * TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099',
	 * 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))))); -- BEGIN IF
	 * :SPRADDR.SPRADDR_STATUS_IND = 'I' THEN RETURN; END IF; -- -- Only perform
	 * this if not part of finance. -- EXECUTE_TRIGGER('SET_FINANCE_RULES'); IF
	 * :GLOBAL.USE_FINANCE_RULES = 'Y' THEN
	 * EXECUTE_TRIGGER('RESET_FINANCE_RULES'); RETURN; END IF; -- -- New record
	 * processing. -- IF (:SPRADDR.ROWID IS NULL) THEN -- IF
	 * (:SPRADDR.SPRADDR_FROM_DATE IS NULL) THEN IF (:SPRADDR.SPRADDR_TO_DATE IS
	 * NULL) THEN -- -- No dates. -- OPEN PTI_CURSOR1; FETCH PTI_CURSOR1 INTO
	 * PTI_INTO_TEMP; IF PTI_CURSOR1%NOTFOUND THEN CLOSE PTI_CURSOR1; RETURN;
	 * ELSE CLOSE PTI_CURSOR1; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0076','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0077','FORM','*ERROR* An effective address of
	 * this type already exists for the person.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- END IF; -- -- To date is set. -- ELSE OPEN
	 * PTI_CURSOR3; FETCH PTI_CURSOR3 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR3%NOTFOUND THEN CLOSE PTI_CURSOR3; GOTO TO_DATE_CHECK_ADD; END
	 * IF; CLOSE PTI_CURSOR3; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0078','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0079','FORM','*ERROR* An effective address
	 * for this type already exists for the person.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- END IF; -- -- From date is set. -- ELSE OPEN
	 * PTI_CURSOR3; FETCH PTI_CURSOR3 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR3%NOTFOUND THEN CLOSE PTI_CURSOR3; GOTO TO_DATE_CHECK_ADD; END
	 * IF; CLOSE PTI_CURSOR3; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0080','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0081','FORM','*ERROR* An address for the From
	 * Date already exists for the person.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- END IF; -- << TO_DATE_CHECK_ADD >> IF
	 * (:SPRADDR.SPRADDR_TO_DATE IS NULL) THEN OPEN PTI_CURSOR3; FETCH
	 * PTI_CURSOR3 INTO PTI_INTO_TEMP; IF PTI_CURSOR3%NOTFOUND THEN CLOSE
	 * PTI_CURSOR3; RETURN; END IF; CLOSE PTI_CURSOR3; -- IF :GLOBAL.FINSYS =
	 * 'Y' THEN MESSAGE(G$_NLS.Get('GOQCLIB-0082','FORM','*ERROR* Multiple
	 * effective addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0083','FORM','*ERROR* Address for the To Date
	 * already exists for the person(To Date blank).')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- ELSE OPEN PTI_CURSOR3; FETCH PTI_CURSOR3 INTO
	 * PTI_INTO_TEMP; IF PTI_CURSOR3%NOTFOUND THEN CLOSE PTI_CURSOR3; RETURN;
	 * END IF; CLOSE PTI_CURSOR3; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0084','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0085','FORM','*ERROR* Effective dates overlap
	 * another address of the same type.')); END IF; RAISE FORM_TRIGGER_FAILURE;
	 * -- END IF; -- -- Record exists, do change logic. -- ELSE IF
	 * (:SPRADDR.SPRADDR_FROM_DATE IS NULL) THEN IF (:SPRADDR.SPRADDR_TO_DATE IS
	 * NULL) THEN -- -- To date is null. -- OPEN PTI_CURSOR2; FETCH PTI_CURSOR2
	 * INTO PTI_INTO_TEMP; IF PTI_CURSOR2%NOTFOUND THEN CLOSE PTI_CURSOR2;
	 * RETURN; ELSE CLOSE PTI_CURSOR2; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0086','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0087','FORM','*ERROR* An effective address of
	 * this type already exists for the person.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- END IF; -- -- From date is null. -- ELSE OPEN
	 * PTI_CURSOR4; FETCH PTI_CURSOR4 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR4%NOTFOUND THEN CLOSE PTI_CURSOR4; GOTO TO_DATE_CHECK_CHG; END
	 * IF; CLOSE PTI_CURSOR4; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0088','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); RAISE FORM_TRIGGER_FAILURE; ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0089','FORM','*ERROR* An effective address of
	 * this type already exists for the person.')); RAISE FORM_TRIGGER_FAILURE;
	 * END IF; END IF; -- -- From date is NOT null. -- ELSE OPEN PTI_CURSOR4;
	 * FETCH PTI_CURSOR4 INTO PTI_INTO_TEMP; IF PTI_CURSOR4%NOTFOUND THEN CLOSE
	 * PTI_CURSOR4; GOTO TO_DATE_CHECK_CHG; END IF; CLOSE PTI_CURSOR4; -- IF
	 * :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0090','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0091','FORM','*ERROR* An address for the From
	 * Date already exists for the person.')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- END IF; -- << TO_DATE_CHECK_CHG >> IF
	 * (:SPRADDR.SPRADDR_TO_DATE IS NULL) THEN OPEN PTI_CURSOR4; FETCH
	 * PTI_CURSOR4 INTO PTI_INTO_TEMP; IF PTI_CURSOR4%NOTFOUND THEN CLOSE
	 * PTI_CURSOR4; RETURN; END IF; CLOSE PTI_CURSOR4; -- IF :GLOBAL.FINSYS =
	 * 'Y' THEN MESSAGE(G$_NLS.Get('GOQCLIB-0092','FORM','*ERROR* Multiple
	 * effective addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0093','FORM','*ERROR* Address for the To Date
	 * already exists for the person(To Date blank).')); END IF; RAISE
	 * FORM_TRIGGER_FAILURE; -- ELSE OPEN PTI_CURSOR4; FETCH PTI_CURSOR4 INTO
	 * PTI_INTO_TEMP; IF PTI_CURSOR4%NOTFOUND THEN CLOSE PTI_CURSOR4; RETURN;
	 * END IF; CLOSE PTI_CURSOR4; -- IF :GLOBAL.FINSYS = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0094','FORM','*ERROR* Multiple effective
	 * addresses of this address type.')); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0095','FORM','*ERROR* Effective dates overlap
	 * another address of the same type.')); END IF; RAISE FORM_TRIGGER_FAILURE;
	 * -- END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.CHECK_DATES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_DATES")
	public void spraddr_CheckDates() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor1 = "SELECT 'X' "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			String sqlptiCursor2 = "SELECT 'X' "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR.ROWID <> :SPRADDR_ROWID AND SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			String sqlptiCursor3 = "SELECT 'X' "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR ((NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))))) ";
			DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
			String sqlptiCursor4 = "SELECT 'X' "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR.ROWID <> :SPRADDR_ROWID AND SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR ((NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))))) ";
			DataCursor ptiCursor4 = new DataCursor(sqlptiCursor4);
			try {
				if (spraddrElement.getSpraddrStatusInd().equals("I")) {
					return;
				}
				//
				// Only perform this if not part of finance.
				//
				executeAction("SET_FINANCE_RULES");
				if (getGlobal("USE_FINANCE_RULES").equals("Y")) {
					executeAction("RESET_FINANCE_RULES");
					return;
				}
				//
				// New record processing.
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				if ((getRecordStatus("spraddr") == "NEW" || getRecordStatus("spraddr") == "INSERT")) {
					//
					try {
						if ((spraddrElement.getSpraddrFromDate().isNull())) {
							if ((spraddrElement.getSpraddrToDate().isNull())) {
								//
								// No dates.
								//
								// Setting query parameters
								ptiCursor1.addParameter(
										"KEY_BLOCK_PIDM",
										getFormModel().getBusinessObject(
												"KEY_BLOCK").getValue("PIDM"));
								ptiCursor1.addParameter(
										"SPRADDR_SPRADDR_ATYP_CODE",
										spraddrElement.getSpraddrAtypCode());
								// F2J_WARNING : Make sure that the method
								// "Close" is being called over the variable
								// ptiCursor1.
								ptiCursor1.open();
								ResultSet ptiCursor1Results = ptiCursor1
										.fetchInto();
								if (ptiCursor1Results != null) {
									ptiIntoTemp = ptiCursor1Results.getStr(0);
								}
								if (ptiCursor1.notFound()) {
									ptiCursor1.close();
									return;
								} else {
									ptiCursor1.close();
									//
									if (getGlobal("FINSYS").equals("Y")) {
										errorMessage(GNls
												.Fget(toStr("GOQCLIB-0076"),
														toStr("FORM"),
														toStr("*ERROR* Multiple effective addresses of this address type.")));
									} else {
										errorMessage(GNls
												.Fget(toStr("GOQCLIB-0077"),
														toStr("FORM"),
														toStr("*ERROR* An effective address of this type already exists for the person.")));
									}
									throw new ApplicationException();
								}
							} else {
								// Setting query parameters
								ptiCursor3.addParameter(
										"KEY_BLOCK_PIDM",
										getFormModel().getBusinessObject(
												"KEY_BLOCK").getValue("PIDM"));
								ptiCursor3.addParameter(
										"SPRADDR_SPRADDR_ATYP_CODE",
										spraddrElement.getSpraddrAtypCode());
								ptiCursor3.addParameter(
										"SPRADDR_SPRADDR_FROM_DATE",
										spraddrElement.getSpraddrFromDate());
								ptiCursor3.addParameter(
										"SPRADDR_SPRADDR_TO_DATE",
										spraddrElement.getSpraddrToDate());
								// F2J_WARNING : Make sure that the method
								// "Close" is being called over the variable
								// ptiCursor3.
								ptiCursor3.open();
								ResultSet ptiCursor3Results = ptiCursor3
										.fetchInto();
								if (ptiCursor3Results != null) {
									ptiIntoTemp = ptiCursor3Results.getStr(0);
								}
								if (ptiCursor3.notFound()) {
									ptiCursor3.close();
									throw new ToDateCheckAdd();
								}
								ptiCursor3.close();
								//
								if (getGlobal("FINSYS").equals("Y")) {
									errorMessage(GNls
											.Fget(toStr("GOQCLIB-0078"),
													toStr("FORM"),
													toStr("*ERROR* Multiple effective addresses of this address type.")));
								} else {
									errorMessage(GNls
											.Fget(toStr("GOQCLIB-0079"),
													toStr("FORM"),
													toStr("*ERROR* An effective address for this type already exists for the person.")));
								}
								throw new ApplicationException();
							}
						} else {
							// Setting query parameters
							ptiCursor3.addParameter(
									"KEY_BLOCK_PIDM",
									getFormModel().getBusinessObject(
											"KEY_BLOCK").getValue("PIDM"));
							ptiCursor3.addParameter(
									"SPRADDR_SPRADDR_ATYP_CODE",
									spraddrElement.getSpraddrAtypCode());
							ptiCursor3.addParameter(
									"SPRADDR_SPRADDR_FROM_DATE",
									spraddrElement.getSpraddrFromDate());
							ptiCursor3.addParameter("SPRADDR_SPRADDR_TO_DATE",
									spraddrElement.getSpraddrToDate());
							// F2J_WARNING : Make sure that the method "Close"
							// is being called over the variable ptiCursor3.
							ptiCursor3.open();
							ResultSet ptiCursor3Results = ptiCursor3
									.fetchInto();
							if (ptiCursor3Results != null) {
								ptiIntoTemp = ptiCursor3Results.getStr(0);
							}
							if (ptiCursor3.notFound()) {
								ptiCursor3.close();
								throw new ToDateCheckAdd();
							}
							ptiCursor3.close();
							//
							if (getGlobal("FINSYS").equals("Y")) {
								errorMessage(GNls
										.Fget(toStr("GOQCLIB-0080"),
												toStr("FORM"),
												toStr("*ERROR* Multiple effective addresses of this address type.")));
							} else {
								errorMessage(GNls
										.Fget(toStr("GOQCLIB-0081"),
												toStr("FORM"),
												toStr("*ERROR* An address for the From Date already exists for the person.")));
							}
							throw new ApplicationException();
						}
					} catch (ToDateCheckAdd e) {
					}
					if ((spraddrElement.getSpraddrToDate().isNull())) {
						// Setting query parameters
						ptiCursor3.addParameter("KEY_BLOCK_PIDM",
								getFormModel().getBusinessObject("KEY_BLOCK")
										.getValue("PIDM"));
						ptiCursor3.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_FROM_DATE",
								spraddrElement.getSpraddrFromDate());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_TO_DATE",
								spraddrElement.getSpraddrToDate());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor3.
						ptiCursor3.open();
						ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
						if (ptiCursor3Results != null) {
							ptiIntoTemp = ptiCursor3Results.getStr(0);
						}
						if (ptiCursor3.notFound()) {
							ptiCursor3.close();
							return;
						}
						ptiCursor3.close();
						//
						if (getGlobal("FINSYS").equals("Y")) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0082"),
											toStr("FORM"),
											toStr("*ERROR* Multiple effective addresses of this address type.")));
						} else {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0083"),
											toStr("FORM"),
											toStr("*ERROR* Address for the To Date already exists for the person(To Date blank).")));
						}
						throw new ApplicationException();
					} else {
						// Setting query parameters
						ptiCursor3.addParameter("KEY_BLOCK_PIDM",
								getFormModel().getBusinessObject("KEY_BLOCK")
										.getValue("PIDM"));
						ptiCursor3.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_FROM_DATE",
								spraddrElement.getSpraddrFromDate());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_TO_DATE",
								spraddrElement.getSpraddrToDate());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor3.
						ptiCursor3.open();
						ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
						if (ptiCursor3Results != null) {
							ptiIntoTemp = ptiCursor3Results.getStr(0);
						}
						if (ptiCursor3.notFound()) {
							ptiCursor3.close();
							return;
						}
						ptiCursor3.close();
						//
						if (getGlobal("FINSYS").equals("Y")) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0084"),
											toStr("FORM"),
											toStr("*ERROR* Multiple effective addresses of this address type.")));
						} else {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0085"),
											toStr("FORM"),
											toStr("*ERROR* Effective dates overlap another address of the same type.")));
						}
						throw new ApplicationException();
					}
				} else {
					try {
						if ((spraddrElement.getSpraddrFromDate().isNull())) {
							if ((spraddrElement.getSpraddrToDate().isNull())) {
								//
								// To date is null.
								//
								// Setting query parameters
								ptiCursor2.addParameter("SPRADDR_ROWID",
										spraddrElement.getROWID());
								ptiCursor2.addParameter(
										"KEY_BLOCK_PIDM",
										getFormModel().getBusinessObject(
												"KEY_BLOCK").getValue("PIDM"));
								ptiCursor2.addParameter(
										"SPRADDR_SPRADDR_ATYP_CODE",
										spraddrElement.getSpraddrAtypCode());
								// F2J_WARNING : Make sure that the method
								// "Close" is being called over the variable
								// ptiCursor2.
								ptiCursor2.open();
								ResultSet ptiCursor2Results = ptiCursor2
										.fetchInto();
								if (ptiCursor2Results != null) {
									ptiIntoTemp = ptiCursor2Results.getStr(0);
								}
								if (ptiCursor2.notFound()) {
									ptiCursor2.close();
									return;
								} else {
									ptiCursor2.close();
									//
									if (getGlobal("FINSYS").equals("Y")) {
										errorMessage(GNls
												.Fget(toStr("GOQCLIB-0086"),
														toStr("FORM"),
														toStr("*ERROR* Multiple effective addresses of this address type.")));
									} else {
										errorMessage(GNls
												.Fget(toStr("GOQCLIB-0087"),
														toStr("FORM"),
														toStr("*ERROR* An effective address of this type already exists for the person.")));
									}
									throw new ApplicationException();
								}
							} else {
								// Setting query parameters
								ptiCursor4.addParameter("SPRADDR_ROWID",
										spraddrElement.getROWID());
								ptiCursor4.addParameter(
										"KEY_BLOCK_PIDM",
										getFormModel().getBusinessObject(
												"KEY_BLOCK").getValue("PIDM"));
								ptiCursor4.addParameter(
										"SPRADDR_SPRADDR_ATYP_CODE",
										spraddrElement.getSpraddrAtypCode());
								ptiCursor4.addParameter(
										"SPRADDR_SPRADDR_FROM_DATE",
										spraddrElement.getSpraddrFromDate());
								ptiCursor4.addParameter(
										"SPRADDR_SPRADDR_TO_DATE",
										spraddrElement.getSpraddrToDate());
								// F2J_WARNING : Make sure that the method
								// "Close" is being called over the variable
								// ptiCursor4.
								ptiCursor4.open();
								ResultSet ptiCursor4Results = ptiCursor4
										.fetchInto();
								if (ptiCursor4Results != null) {
									ptiIntoTemp = ptiCursor4Results.getStr(0);
								}
								if (ptiCursor4.notFound()) {
									ptiCursor4.close();
									throw new ToDateCheckChg();
								}
								ptiCursor4.close();
								//
								if (getGlobal("FINSYS").equals("Y")) {
									errorMessage(GNls
											.Fget(toStr("GOQCLIB-0088"),
													toStr("FORM"),
													toStr("*ERROR* Multiple effective addresses of this address type.")));
									throw new ApplicationException();
								} else {
									errorMessage(GNls
											.Fget(toStr("GOQCLIB-0089"),
													toStr("FORM"),
													toStr("*ERROR* An effective address of this type already exists for the person.")));
									throw new ApplicationException();
								}
							}
						} else {
							// Setting query parameters
							ptiCursor4.addParameter("SPRADDR_ROWID",
									spraddrElement.getROWID());
							ptiCursor4.addParameter(
									"KEY_BLOCK_PIDM",
									getFormModel().getBusinessObject(
											"KEY_BLOCK").getValue("PIDM"));
							ptiCursor4.addParameter(
									"SPRADDR_SPRADDR_ATYP_CODE",
									spraddrElement.getSpraddrAtypCode());
							ptiCursor4.addParameter(
									"SPRADDR_SPRADDR_FROM_DATE",
									spraddrElement.getSpraddrFromDate());
							ptiCursor4.addParameter("SPRADDR_SPRADDR_TO_DATE",
									spraddrElement.getSpraddrToDate());
							// F2J_WARNING : Make sure that the method "Close"
							// is being called over the variable ptiCursor4.
							ptiCursor4.open();
							ResultSet ptiCursor4Results = ptiCursor4
									.fetchInto();
							if (ptiCursor4Results != null) {
								ptiIntoTemp = ptiCursor4Results.getStr(0);
							}
							if (ptiCursor4.notFound()) {
								ptiCursor4.close();
								throw new ToDateCheckChg();
							}
							ptiCursor4.close();
							//
							if (getGlobal("FINSYS").equals("Y")) {
								errorMessage(GNls
										.Fget(toStr("GOQCLIB-0090"),
												toStr("FORM"),
												toStr("*ERROR* Multiple effective addresses of this address type.")));
							} else {
								errorMessage(GNls
										.Fget(toStr("GOQCLIB-0091"),
												toStr("FORM"),
												toStr("*ERROR* An address for the From Date already exists for the person.")));
							}
							throw new ApplicationException();
						}
					} catch (ToDateCheckChg e) {
					}
					if ((spraddrElement.getSpraddrToDate().isNull())) {
						// Setting query parameters
						ptiCursor4.addParameter("SPRADDR_ROWID",
								spraddrElement.getROWID());
						ptiCursor4.addParameter("KEY_BLOCK_PIDM",
								getFormModel().getBusinessObject("KEY_BLOCK")
										.getValue("PIDM"));
						ptiCursor4.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor4.addParameter("SPRADDR_SPRADDR_FROM_DATE",
								spraddrElement.getSpraddrFromDate());
						ptiCursor4.addParameter("SPRADDR_SPRADDR_TO_DATE",
								spraddrElement.getSpraddrToDate());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor4.
						ptiCursor4.open();
						ResultSet ptiCursor4Results = ptiCursor4.fetchInto();
						if (ptiCursor4Results != null) {
							ptiIntoTemp = ptiCursor4Results.getStr(0);
						}
						if (ptiCursor4.notFound()) {
							ptiCursor4.close();
							return;
						}
						ptiCursor4.close();
						//
						if (getGlobal("FINSYS").equals("Y")) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0092"),
											toStr("FORM"),
											toStr("*ERROR* Multiple effective addresses of this address type.")));
						} else {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0093"),
											toStr("FORM"),
											toStr("*ERROR* Address for the To Date already exists for the person(To Date blank).")));
						}
						throw new ApplicationException();
					} else {
						// Setting query parameters
						ptiCursor4.addParameter("SPRADDR_ROWID",
								spraddrElement.getROWID());
						ptiCursor4.addParameter("KEY_BLOCK_PIDM",
								getFormModel().getBusinessObject("KEY_BLOCK")
										.getValue("PIDM"));
						ptiCursor4.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor4.addParameter("SPRADDR_SPRADDR_FROM_DATE",
								spraddrElement.getSpraddrFromDate());
						ptiCursor4.addParameter("SPRADDR_SPRADDR_TO_DATE",
								spraddrElement.getSpraddrToDate());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor4.
						ptiCursor4.open();
						ResultSet ptiCursor4Results = ptiCursor4.fetchInto();
						if (ptiCursor4Results != null) {
							ptiIntoTemp = ptiCursor4Results.getStr(0);
						}
						if (ptiCursor4.notFound()) {
							ptiCursor4.close();
							return;
						}
						ptiCursor4.close();
						//
						if (getGlobal("FINSYS").equals("Y")) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0094"),
											toStr("FORM"),
											toStr("*ERROR* Multiple effective addresses of this address type.")));
						} else {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0095"),
											toStr("FORM"),
											toStr("*ERROR* Effective dates overlap another address of the same type.")));
						}
						throw new ApplicationException();
					}

				}
			} finally {
				ptiCursor1.close();
				ptiCursor3.close();
				ptiCursor2.close();
				ptiCursor4.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_IF_PHONE_EXISTS
	 * DECLARE CURSOR PTI_CURSOR IS SELECT 'Y' FROM SPRTELE WHERE SPRTELE_PIDM =
	 * :PIDM; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :SPRADDR.PHONE_EXISTS; IF (PTI_CURSOR%NOTFOUND) THEN
	 * :SPRADDR.PHONE_EXISTS := 'N'; END IF; CLOSE PTI_CURSOR; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.CHECK_IF_PHONE_EXISTS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_IF_PHONE_EXISTS")
	public void spraddr_CheckIfPhoneExists() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT 'Y' " + " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spraddrElement.setPhoneExists(ptiCursorResults.getStr(0));
				}
				if ((ptiCursor.notFound())) {
					spraddrElement.setPhoneExists(toStr("N"));
				}
				ptiCursor.close();
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_MULTIPLE_ZIPS -- --
	 * Added the following procedure to check for multiple cities that -- have
	 * the same zip code and displays a message. -- DECLARE CNT NUMBER(5);
	 * CURSOR PTI_CURSOR IS SELECT COUNT(*) FROM GTVZIPC WHERE GTVZIPC_CODE =
	 * :SPRADDR.SPRADDR_ZIP; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO CNT;
	 * CLOSE PTI_CURSOR; -- IF cnt > 1 THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0096','FORM','*WARNING* Multiple Cities exist
	 * for this ZIP/Postal code; press LIST to select one.')); END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.CHECK_MULTIPLE_ZIPS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_MULTIPLE_ZIPS")
	public void spraddr_CheckMultipleZips() {

		//
		// Added the following procedure to check for multiple cities that
		// have the same zip code and displays a message.
		//

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			NNumber cnt = NNumber.getNull();
			String sqlptiCursor = "SELECT COUNT(*) " + " FROM GTVZIPC "
					+ " WHERE GTVZIPC_CODE = :SPRADDR_SPRADDR_ZIP ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPRADDR_SPRADDR_ZIP",
						spraddrElement.getSpraddrZip());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					cnt = ptiCursorResults.getNumber(0);
				}
				ptiCursor.close();
				//
				if (cnt.greater(1)) {
					warningMessage(GNls
							.Fget(toStr("GOQCLIB-0096"),
									toStr("FORM"),
									toStr("*WARNING* Multiple Cities exist for this ZIP/Postal code; press LIST to select one.")));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_PHONE DECLARE CURSOR
	 * PTI_CURSOR IS SELECT NVL(COUNT(SPRTELE_SEQNO), 0) FROM SPRTELE WHERE
	 * SPRTELE_PIDM = :PIDM AND SPRTELE_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
	 * AND SPRTELE_ADDR_SEQNO = :SPRADDR.SPRADDR_SEQNO; BEGIN
	 * EXECUTE_TRIGGER('GET_PHONE_INFO'); -- OPEN PTI_CURSOR; FETCH PTI_CURSOR
	 * INTO :SPRADDR.HOLD_ADDR_TELE_SEQNO; CLOSE PTI_CURSOR; --
	 * EXECUTE_TRIGGER('GET_PHONE_COUNT'); -- IF (:SPRADDR.HOLD_SEQNO > 0) THEN
	 * :SPRADDR.PHONE_EXISTS := 'Y'; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.CHECK_PHONE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_PHONE")
	public void spraddr_CheckPhone() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT NVL(COUNT(SPRTELE_SEQNO), 0) "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				executeAction("GET_PHONE_INFO");
				//
				// Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
						spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_SPRADDR_SEQNO",
						spraddrElement.getSpraddrSeqno());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spraddrElement.setHoldAddrTeleSeqno(ptiCursorResults
							.getNumber(0));
				}
				ptiCursor.close();
				//
				executeAction("GET_PHONE_COUNT");
				//
				if ((spraddrElement.getHoldSeqno().greater(0))) {
					spraddrElement.setPhoneExists(toStr("Y"));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_PHONE_UPDATE IF
	 * :SPRADDR.PHONE_CTRY IS NULL THEN IF :SPRADDR.PHONE_AREA IS NULL THEN IF
	 * :SPRADDR.PHONE_NUMBER IS NULL THEN IF :SPRADDR.PHONE_EXT IS NULL THEN
	 * RETURN; END IF; END IF; END IF; END IF; -- NEXT_FIELD; G$_CHECK_FAILURE;
	 * PREVIOUS_FIELD; G$_CHECK_FAILURE; -- IF :SPRADDR.CHANGE_PHONE = 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0097','FORM','*ERROR* Must COMMIT phone
	 * number changes before exiting block.')); RAISE FORM_TRIGGER_FAILURE; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.CHECK_PHONE_UPDATE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_PHONE_UPDATE")
	public void spraddr_CheckPhoneUpdate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getPhoneCtry().isNull()) {
			if (spraddrElement.getPhoneArea().isNull()) {
				if (spraddrElement.getPhoneNumber().isNull()) {
					if (spraddrElement.getPhoneExt().isNull()) {
						return;
					}
				}
			}
		}
		//
		nextItem();
		getContainer().getGoqrpls().gCheckFailure();
		previousItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (spraddrElement.getChangePhone().equals("Y")) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0097"),
							toStr("FORM"),
							toStr("*ERROR* Must COMMIT phone number changes before exiting block.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.CHECK_PHONES
	 * G$_CHECK_VALUE((:SPRADDR.HOLD_PHONE_NUMBER IS NOT NULL AND
	 * :SPRADDR.PHONE_NUMBER IS NULL), G$_NLS.Get('GOQCLIB-0098','FORM','*ERROR*
	 * Delete phone numbers on Tele Form,SPATELE; CQUERY from phone fields.'),
	 * TRUE); -- G$_CHECK_VALUE(((:SPRADDR.PHONE_CTRY IS NOT NULL OR
	 * :SPRADDR.PHONE_AREA IS NOT NULL OR :SPRADDR.PHONE_EXT IS NOT NULL) AND
	 * :SPRADDR.PHONE_NUMBER IS NULL), G$_NLS.Get('GOQCLIB-0099','FORM','*ERROR*
	 * Phone number must be entered when country code or area code or extension
	 * are entered'), TRUE); -- G$_CHECK_VALUE ((:SPRADDR.TELE_CODE IS NULL AND
	 * :SPRADDR.CHANGE_PHONE = 'Y'), G$_NLS.Get('GOQCLIB-0100','FORM','*ERROR*
	 * Phone type must be entered when phone number is entered.'), TRUE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.CHECK_PHONES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_PHONES")
	public void spraddr_CheckPhones() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		getContainer()
				.getGoqrpls()
				.gCheckValue(
						(toBool(!spraddrElement.getHoldPhoneNumber().isNull()
								&& spraddrElement.getPhoneNumber().isNull())),
						GNls.Fget(
								toStr("GOQCLIB-0098"),
								toStr("FORM"),
								toStr("*ERROR* Delete phone numbers on Tele Form,SPATELE; CQUERY from phone fields.")),
						toBool(NBool.True));
		//
		getContainer()
				.getGoqrpls()
				.gCheckValue(
						(toBool((!spraddrElement.getPhoneCtry().isNull()
								|| !spraddrElement.getPhoneArea().isNull() || !spraddrElement
								.getPhoneExt().isNull())
								&& spraddrElement.getPhoneNumber().isNull())),
						GNls.Fget(
								toStr("GOQCLIB-0099"),
								toStr("FORM"),
								toStr("*ERROR* Phone number must be entered when country code or area code or extension are entered")),
						toBool(NBool.True));
		//
		getContainer()
				.getGoqrpls()
				.gCheckValue(
						(toBool(spraddrElement.getTeleCode().isNull()
								&& spraddrElement.getChangePhone().equals("Y"))),
						GNls.Fget(
								toStr("GOQCLIB-0100"),
								toStr("FORM"),
								toStr("*ERROR* Phone type must be entered when phone number is entered.")),
						toBool(NBool.True));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.ENABLE_PHONE IF
	 * GET_ITEM_PROPERTY('SPRADDR.PHONE_BTN',ENABLED) = 'FALSE' THEN
	 * SET_ITEM_PROPERTY('SPRADDR.PHONE_BTN',ENABLED,PROPERTY_ON);
	 * SET_ITEM_PROPERTY('SPRADDR.PHONE_BTN',NAVIGABLE,PROPERTY_ON); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.ENABLE_PHONE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "ENABLE_PHONE")
	public void spraddr_EnablePhone() {

		if (getItemEnabled("SPRADDR.PHONE_BTN").equals("FALSE")) {
			setItemEnabled("SPRADDR.PHONE_BTN", true);
			setItemNavigable("SPRADDR.PHONE_BTN", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.FIELDS_ENTERED DECLARE
	 * PTI_INTO_TEMP VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM SPRTELE
	 * WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO =
	 * :SPRADDR.SPRADDR_SEQNO AND :HOLD_ADDR_TELE_SEQNO > 1; BEGIN OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0101','FORM','*ERROR* Multiple phone #''s
	 * exist; CQUERY from phone fields to delete.')); CLOSE PTI_CURSOR; RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.FIELDS_ENTERED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "FIELDS_ENTERED")
	public void spraddr_FieldsEntered() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO AND :HOLD_ADDR_TELE_SEQNO > 1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
						spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_SPRADDR_SEQNO",
						spraddrElement.getSpraddrSeqno());
				ptiCursor.addParameter("HOLD_ADDR_TELE_SEQNO",
						spraddrElement.getHoldAddrTeleSeqno());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.found()) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0101"),
									toStr("FORM"),
									toStr("*ERROR* Multiple phone #'s exist; CQUERY from phone fields to delete.")));
					ptiCursor.close();
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.GET_PHONE_COUNT DECLARE
	 * CURSOR PTI_CURSOR IS SELECT NVL(COUNT(SPRTELE_SEQNO), 0) FROM SPRTELE
	 * WHERE SPRTELE_PIDM = :PIDM; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :SPRADDR.HOLD_SEQNO; CLOSE PTI_CURSOR; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.GET_PHONE_COUNT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_PHONE_COUNT")
	public void spraddr_GetPhoneCount() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT NVL(COUNT(SPRTELE_SEQNO), 0) "
					+ " FROM SPRTELE " + " WHERE SPRTELE_PIDM = :PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spraddrElement.setHoldSeqno(ptiCursorResults.getNumber(0));
				}
				ptiCursor.close();
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.GET_PHONE_INFO -- 82-1 add
	 * SPRTELE_CTRY_CODE_PHONE and references -- 82-1 to Data Block SPRADDR form
	 * items -- 82-1 SPRADDR.PHONE_CTRY and SPRADDR.HOLD_PHONE_CTRY DECLARE
	 * CURSOR PTI_CURSOR IS SELECT SPRTELE_TELE_CODE, SPRTELE_SEQNO,
	 * SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER, SPRTELE_PHONE_EXT, 'N',
	 * SPRTELE_CTRY_CODE_PHONE -- 82-1 FROM SPRTELE WHERE SPRTELE_PIDM = :PIDM
	 * AND SPRTELE_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO
	 * = :SPRADDR.SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND = 'Y'; BEGIN
	 * :SPRADDR.SPRTELE_SEQNO := ''; :SPRADDR.PHONE_CTRY := ''; -- 82-1
	 * :SPRADDR.PHONE_AREA := ''; :SPRADDR.PHONE_NUMBER := '';
	 * :SPRADDR.PHONE_EXT := ''; :SPRADDR.PHONE_EXISTS := ''; -- OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO :SPRADDR.TELE_CODE,
	 * :SPRADDR.SPRTELE_SEQNO, :SPRADDR.PHONE_AREA, :SPRADDR.PHONE_NUMBER,
	 * :SPRADDR.PHONE_EXT, :SPRADDR.CHANGE_PHONE, :SPRADDR.PHONE_CTRY; -- 82-1
	 * CLOSE PTI_CURSOR; -- :SPRADDR.HOLD_PHONE_CTRY := :SPRADDR.PHONE_CTRY; --
	 * 82-1 :SPRADDR.HOLD_PHONE_AREA := :SPRADDR.PHONE_AREA;
	 * :SPRADDR.HOLD_PHONE_NUMBER := :SPRADDR.PHONE_NUMBER;
	 * :SPRADDR.HOLD_PHONE_EXT := :SPRADDR.PHONE_EXT; :SPRADDR.HOLD_TELE_CODE :=
	 * :SPRADDR.TELE_CODE; :SPRADDR.CHANGE_PHONE := ''; --
	 * EXECUTE_TRIGGER('CHECK_IF_PHONE_EXISTS'); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.GET_PHONE_INFO
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "GET_PHONE_INFO")
	public void spraddr_GetPhoneInfo() {

		// 82-1 add SPRTELE_CTRY_CODE_PHONE and references
		// 82-1 to Data Block SPRADDR form items
		// 82-1 SPRADDR.PHONE_CTRY and SPRADDR.HOLD_PHONE_CTRY

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT SPRTELE_TELE_CODE, SPRTELE_SEQNO, SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER, SPRTELE_PHONE_EXT, 'N', SPRTELE_CTRY_CODE_PHONE "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND = 'Y' ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				spraddrElement.setSprteleSeqno(toNumber(""));
				spraddrElement.setPhoneCtry(toStr(""));
				// 82-1
				spraddrElement.setPhoneArea(toStr(""));
				spraddrElement.setPhoneNumber(toStr(""));
				spraddrElement.setPhoneExt(toStr(""));
				spraddrElement.setPhoneExists(toStr(""));
				//
				// Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
						spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_SPRADDR_SEQNO",
						spraddrElement.getSpraddrSeqno());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spraddrElement.setTeleCode(ptiCursorResults.getStr(0));
					spraddrElement.setSprteleSeqno(ptiCursorResults
							.getNumber(1));
					spraddrElement.setPhoneArea(ptiCursorResults.getStr(2));
					spraddrElement.setPhoneNumber(ptiCursorResults.getStr(3));
					spraddrElement.setPhoneExt(ptiCursorResults.getStr(4));
					spraddrElement.setChangePhone(ptiCursorResults.getStr(5));
					spraddrElement.setPhoneCtry(ptiCursorResults.getStr(6));
				}
				// 82-1
				ptiCursor.close();
				
				findItem("TELE_CODE").setToValidate(true);
				validateItem("TELE_CODE");

				//
				spraddrElement.setHoldPhoneCtry(spraddrElement.getPhoneCtry());
				// 82-1
				spraddrElement.setHoldPhoneArea(spraddrElement.getPhoneArea());
				spraddrElement.setHoldPhoneNumber(spraddrElement
						.getPhoneNumber());
				spraddrElement.setHoldPhoneExt(spraddrElement.getPhoneExt());
				spraddrElement.setHoldTeleCode(spraddrElement.getTeleCode());
				spraddrElement.setChangePhone(toStr(""));
				//
				executeAction("CHECK_IF_PHONE_EXISTS");
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.INSERT_SPRTELE -- 82-1 add
	 * SPRTELE_CTRY_CODE_PHONE and references -- 82-1 to Data Block SPRADDR form
	 * items -- 82-1 SPRADDR.PHONE_CTRY and SPRADDR.HOLD_PHONE_CTRY DECLARE
	 * lv_rowid VARCHAR2(18); PTI_INTO_TEMP VARCHAR2(1); -- CURSOR PTI_CURSOR1
	 * IS SELECT 'X' FROM SPRTELE WHERE SPRTELE_PIDM = :PIDM; -- CURSOR
	 * PTI_CURSOR2 IS SELECT 'X' FROM SPRTELE WHERE SPRTELE_PIDM = :PIDM AND
	 * SPRTELE_TELE_CODE = :SPRADDR.TELE_CODE AND SPRTELE_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO =
	 * :SPRADDR.SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND = 'Y'; -- CURSOR
	 * PTI_CURSOR3 IS SELECT ROWID FROM SPRTELE WHERE SPRTELE_PIDM = :PIDM AND
	 * SPRTELE_TELE_CODE = :SPRADDR.TELE_CODE AND SPRTELE_ATYP_CODE =
	 * :SPRADDR.SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO =
	 * :SPRADDR.SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND IS NULL AND
	 * NVL(SPRTELE_CTRY_CODE_PHONE,'*') = NVL(:SPRADDR.PHONE_CTRY,'*') -- 82-1
	 * AND NVL(SPRTELE_PHONE_AREA,'*') = NVL(:SPRADDR.PHONE_AREA,'*') AND
	 * NVL(SPRTELE_PHONE_NUMBER,'*') = NVL(:SPRADDR.PHONE_NUMBER,'*') AND
	 * NVL(SPRTELE_PHONE_EXT,'*') = NVL(:SPRADDR.PHONE_EXT,'*'); -- BEGIN OPEN
	 * PTI_CURSOR1; FETCH PTI_CURSOR1 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR1%NOTFOUND THEN CLOSE PTI_CURSOR1; ELSE CLOSE PTI_CURSOR1; --
	 * OPEN PTI_CURSOR2; FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP; IF
	 * PTI_CURSOR2%FOUND THEN MESSAGE(G$_NLS.Get('GOQCLIB-0102','FORM','*ERROR*
	 * A primary Phone Number already exists for this address.')); CLOSE
	 * PTI_CURSOR2; RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR2; --
	 * OPEN PTI_CURSOR3; FETCH PTI_CURSOR3 INTO lv_rowid; IF PTI_CURSOR3%FOUND
	 * THEN GB_TELEPHONE.P_UPDATE(p_PIDM =>:PIDM, p_SEQNO
	 * =>:SPRADDR.SPRADDR_SEQNO, p_TELE_CODE =>:SPRADDR.TELE_CODE, p_PHONE_AREA
	 * =>:SPRADDR.PHONE_AREA, p_PHONE_NUMBER =>:SPRADDR.PHONE_NUMBER,
	 * p_PHONE_EXT =>:SPRADDR.PHONE_EXT, p_ADDR_SEQNO =>:SPRADDR.SPRADDR_SEQNO,
	 * p_PRIMARY_IND =>'Y', p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN, p_USER_ID
	 * =>:GLOBAL.CURRENT_USER, p_CTRY_code_PHONE =>:SPRADDR.PHONE_CTRY, -- 82-1
	 * -- p_CTRY_code_PHONE =>:SPRADDR.SPRADDR_CTRY_CODE_PHONE, -- 82-1 p_ROWID
	 * =>lv_rowid); RETURN; END IF; CLOSE PTI_CURSOR3; END IF; --
	 * GB_TELEPHONE.P_CREATE(p_PIDM =>:PIDM, p_TELE_CODE =>:SPRADDR.TELE_CODE,
	 * p_PHONE_AREA =>:SPRADDR.PHONE_AREA, p_PHONE_NUMBER
	 * =>:SPRADDR.PHONE_NUMBER, p_PHONE_EXT =>:SPRADDR.PHONE_EXT, p_STATUS_IND
	 * =>:SPRADDR.SPRADDR_STATUS_IND, p_ATYP_CODE =>:SPRADDR.SPRADDR_ATYP_CODE,
	 * p_ADDR_SEQNO =>:SPRADDR.SPRADDR_SEQNO, p_PRIMARY_IND =>'Y', p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER,
	 * p_CTRY_code_PHONE =>:SPRADDR.PHONE_CTRY, -- 82-1 -- p_CTRY_code_PHONE
	 * =>:SPRADDR.SPRADDR_CTRY_CODE_PHONE, -- 82-1 p_SEQNO_OUT
	 * =>:SPRADDR.HOLD_SEQNO, p_ROWID_OUT =>lv_rowid); --
	 * EXECUTE_TRIGGER('GET_PHONE_INFO'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('GET_PHONE_COUNT'); -- IF (:SPRADDR.HOLD_SEQNO > 1) THEN
	 * :SPRADDR.PHONE_EXISTS := 'Y'; END IF; -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.INSERT_SPRTELE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "INSERT_SPRTELE")
	public void spraddr_InsertSprtele() {

		// 82-1 add SPRTELE_CTRY_CODE_PHONE and references
		// 82-1 to Data Block SPRADDR form items
		// 82-1 SPRADDR.PHONE_CTRY and SPRADDR.HOLD_PHONE_CTRY

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			java.sql.RowId lvRowid = null;
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor1 = "SELECT 'X' " + " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			String sqlptiCursor2 = "SELECT 'X' "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_TELE_CODE = :SPRADDR_TELE_CODE AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND = 'Y' ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			String sqlptiCursor3 = "SELECT ROWID "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_TELE_CODE = :SPRADDR_TELE_CODE AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND IS NULL AND NVL(SPRTELE_CTRY_CODE_PHONE, '*') = NVL(:SPRADDR_PHONE_CTRY, '*') AND NVL(SPRTELE_PHONE_AREA, '*') = NVL(:SPRADDR_PHONE_AREA, '*') AND NVL(SPRTELE_PHONE_NUMBER, '*') = NVL(:SPRADDR_PHONE_NUMBER, '*') AND NVL(SPRTELE_PHONE_EXT, '*') = NVL(:SPRADDR_PHONE_EXT, '*') ";
			DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
			try {
				try {
					// Setting query parameters
					ptiCursor1.addParameter("PIDM", getFormModel()
							.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor1.
					ptiCursor1.open();
					ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
					if (ptiCursor1Results != null) {
						ptiIntoTemp = ptiCursor1Results.getStr(0);
					}
					if (ptiCursor1.notFound()) {
						ptiCursor1.close();
					} else {
						ptiCursor1.close();
						//
						// Setting query parameters
						ptiCursor2.addParameter("PIDM", getFormModel()
								.getBusinessObject("KEY_BLOCK")
								.getValue("PIDM"));
						ptiCursor2.addParameter("SPRADDR_TELE_CODE",
								spraddrElement.getTeleCode());
						ptiCursor2.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor2.addParameter("SPRADDR_SPRADDR_SEQNO",
								spraddrElement.getSpraddrSeqno());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor2.
						ptiCursor2.open();
						ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
						if (ptiCursor2Results != null) {
							ptiIntoTemp = ptiCursor2Results.getStr(0);
						}
						if (ptiCursor2.found()) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0102"),
											toStr("FORM"),
											toStr("*ERROR* A primary Phone Number already exists for this address.")));
							ptiCursor2.close();
							throw new ApplicationException();
						}
						ptiCursor2.close();
						//
						// Setting query parameters
						ptiCursor3.addParameter("PIDM", getFormModel()
								.getBusinessObject("KEY_BLOCK")
								.getValue("PIDM"));
						ptiCursor3.addParameter("SPRADDR_TELE_CODE",
								spraddrElement.getTeleCode());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						ptiCursor3.addParameter("SPRADDR_SPRADDR_SEQNO",
								spraddrElement.getSpraddrSeqno());
						ptiCursor3.addParameter("SPRADDR_PHONE_CTRY",
								spraddrElement.getPhoneCtry());
						ptiCursor3.addParameter("SPRADDR_PHONE_AREA",
								spraddrElement.getPhoneArea());
						ptiCursor3.addParameter("SPRADDR_PHONE_NUMBER",
								spraddrElement.getPhoneNumber());
						ptiCursor3.addParameter("SPRADDR_PHONE_EXT",
								spraddrElement.getPhoneExt());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor3.
						ptiCursor3.open();
						ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
						if (ptiCursor3Results != null) {
							lvRowid = (java.sql.RowId) ptiCursor3Results
									.getObject(0);
						}
						if (ptiCursor3.found()) {
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							// F2J_WARNING : Passing parameters by name is not
							// supported. Please check that the parameters are
							// in the correct order.
							GbTelephone
									.pUpdate(
											/* pPidm=> */toNumber(getFormModel()
													.getBusinessObject(
															"KEY_BLOCK")
													.getValue("PIDM")),
											/* pSeqno=> */spraddrElement
													.getSpraddrSeqno(),
											/* pTeleCode=> */spraddrElement
													.getTeleCode(),
											/* pPhoneArea=> */spraddrElement
													.getPhoneArea(),
											/* pPhoneNumber=> */spraddrElement
													.getPhoneNumber(),
											/* pPhoneExt=> */spraddrElement
													.getPhoneExt(),
											/* pAddrSeqno=> */spraddrElement
													.getSpraddrSeqno(),
											/* pPrimaryInd=> */toStr("Y"),
											/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
											/* pUserId=> */getGlobal("CURRENT_USER"),
											/* pCtryCodePhone=> */spraddrElement
													.getPhoneCtry(),
											/* pRowid=> */lvRowid);
							return;
						}
						ptiCursor3.close();
					}

					Ref<NNumber> pSeqnoOut = new Ref<NNumber>(
							spraddrElement.getHoldSeqno());
					Ref<byte[]> pRowidOut = new Ref<byte[]>();
					//
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					// F2J_WARNING : Passing parameters by name is not
					// supported. Please check that the parameters are in the
					// correct order.
					GbTelephone.pCreate(/* pPidm=> */toNumber(getFormModel()
							.getBusinessObject("KEY_BLOCK").getValue("PIDM")),
					/* pTeleCode=> */spraddrElement.getTeleCode(),
					/* pPhoneArea=> */spraddrElement.getPhoneArea(),
					/* pPhoneNumber=> */spraddrElement.getPhoneNumber(),
					/* pPhoneExt=> */spraddrElement.getPhoneExt(),
					/* pStatusInd=> */spraddrElement.getSpraddrStatusInd(),
					/* pAtypCode=> */spraddrElement.getSpraddrAtypCode(),
					/* pAddrSeqno=> */spraddrElement.getSpraddrSeqno(),
					/* pPrimaryInd=> */toStr("Y"),
					/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
					/* pUserId=> */getGlobal("CURRENT_USER"),
					/* pCtryCodePhone=> */spraddrElement.getPhoneCtry(),
					/* pSeqnoOut=> */pSeqnoOut,
					/* pRowidOut=> */pRowidOut);
					//
					spraddrElement.setHoldSeqno(pSeqnoOut.val);
					executeAction("GET_PHONE_INFO");
					getContainer().getGoqrpls().gCheckFailure();
					//
					executeAction("GET_PHONE_COUNT");
					//
					if ((spraddrElement.getHoldSeqno().greater(1))) {
						spraddrElement.setPhoneExists(toStr("Y"));
					}
				} catch (Exception e) {
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
				ptiCursor3.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.PHONE_COMMIT NEXT_FIELD;
	 * G$_CHECK_FAILURE; -- PREVIOUS_FIELD; G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('CHECK_PHONES'); G$_CHECK_FAILURE; -- IF
	 * :SPRADDR.CHANGE_PHONE IS NULL THEN COMMIT_FORM; G$_CHECK_FAILURE; ELSE
	 * :SPRADDR.SPRADDR_PIDM := :SPRADDR.SPRADDR_PIDM; COMMIT_FORM;
	 * G$_CHECK_FAILURE; :SPRADDR.CHANGE_PHONE := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.PHONE_COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PHONE_COMMIT")
	public void spraddr_PhoneCommit() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		executeAction("POST-TEXT-ITEM");
		nextItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("POST-TEXT-ITEM");
		previousItem();
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (spraddrElement.getChangePhone().isNull()) {
			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
		} else {
			if (spraddrElement.getRow().getStatus()
					.equals(DataRowStatus.UNCHANGED))
				spraddrElement.getRow().setStatus(DataRowStatus.UPDATED);
			commitTask();
			getContainer().getGoqrpls().gCheckFailure();
			spraddrElement.setChangePhone(toStr(""));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.RESET_FINANCE_RULES
	 * :GLOBAL.USE_FINANCE_RULES := 'N';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.RESET_FINANCE_RULES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "RESET_FINANCE_RULES")
	public void spraddr_ResetFinanceRules() {

		setGlobal("USE_FINANCE_RULES", toStr("N"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.SET_CHECK_BOXES NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.SET_CHECK_BOXES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_CHECK_BOXES")
	public void spraddr_SetCheckBoxes() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.SET_FINANCE_DATES -- --
	 * This trigger will not do anything by default. The finance requirements
	 * need to have the -- ability to perform some special date modifications so
	 * they will override this logic. -- NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.SET_FINANCE_DATES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_FINANCE_DATES")
	public void spraddr_SetFinanceDates() {

		//
		// This trigger will not do anything by default. The finance
		// requirements need to have the
		// ability to perform some special date modifications so they will
		// override this logic.
		//
		//
		// This trigger will not do anything by default. The finance
		// requirements need to have the
		// ability to perform some special date modifications so they will
		// override this logic.
		//
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.SET_FINANCE_RULES -- This
	 * will be set to 'N' for all forms other than Finance forms which can
	 * over-ride the trigger -- by setting the global to 'Y' --
	 * :GLOBAL.USE_FINANCE_RULES := 'N';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.SET_FINANCE_RULES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SET_FINANCE_RULES")
	public void spraddr_SetFinanceRules() {

		// This will be set to 'N' for all forms other than Finance forms which
		// can over-ride the trigger
		// by setting the global to 'Y'
		//
		// This will be set to 'N' for all forms other than Finance forms which
		// can over-ride the trigger
		// by setting the global to 'Y'
		//
		setGlobal("USE_FINANCE_RULES", toStr("N"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.SHOW_PHONES DECLARE
	 * lv_form_to_call VARCHAR2(30); lv_this_product VARCHAR2(1) :=
	 * SUBSTR(:SYSTEM.CURRENT_FORM,1,1); tab_page_id TAB_PAGE; BEGIN
	 * lv_form_to_call := CASE lv_this_product WHEN 'A' THEN 'APAIDEN' WHEN 'F'
	 * THEN 'FOAIDEN' WHEN 'P' THEN 'PPATELE' ELSE 'SPAIDEN' END; --
	 * GO_ITEM('SPRADDR.PHONE_AREA'); :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
	 * EXECUTE_TRIGGER('CHECK_PHONE_UPDATE'); G$_CHECK_FAILURE; -- -- Check if
	 * in a phone with a telephone tab -- tab_page_id :=
	 * FIND_TAB_PAGE('TELEPHONE_TAB'); IF NOT ID_NULL(tab_page_id) THEN IF
	 * GET_TAB_PAGE_PROPERTY(tab_page_id,VISIBLE) = 'FALSE' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0103','FORM','*ERROR* User %01% is not
	 * authorized to access %02%.', USER,
	 * NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(:SYSTEM
	 * .CURRENT_FORM,'TELEPHONE_TAB'),'TELEPHONE_TAB'))); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; IF
	 * GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
	 * GO_BLOCK('SPRTELE'); -- :SYSTEM.MESSAGE_LEVEL := '5'; EXECUTE_QUERY;
	 * :SYSTEM.MESSAGE_LEVEL := '0'; END IF; -- -- No tab found, so call the
	 * appropriate IDEN form. -- ELSE IF
	 * INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC
	 * (lv_form_to_call,USER),'TELEPHONE_TAB:N') > 0 THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0104','FORM','*ERROR* User %01% is not
	 * authorized to access %02% on %03%.', USER,
	 * NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC
	 * (lv_form_to_call,'TELEPHONE_TAB'),'TELEPHONE_TAB'), lv_form_to_call));
	 * RAISE FORM_TRIGGER_FAILURE; ELSE :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
	 * :GLOBAL.SECRFRM := lv_form_to_call; :GLOBAL.NAVIGATE_TO_TAB :=
	 * 'TELEPHONE'; :HOLD_FIELD := :SYSTEM.CURRENT_FIELD; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.NAVIGATE_TO_TAB := ''; --
	 * EXECUTE_TRIGGER('CHECK_PHONE'); G$_CHECK_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRADDR.SHOW_PHONES
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "SHOW_PHONES")
	public void spraddr_ShowPhones() {

		NString caseExpressionResult = null;
		{
			NString lvFormToCall = NString.getNull();
			NString lvThisProduct = substring(toStr(getCurrentTaskName()),
					toInt(1), toInt(1));
			TabPageDescriptor tabPageId = null;
			if (lvThisProduct.equals("A")) {
				caseExpressionResult = toStr("APAIDEN");
			} else if (lvThisProduct.equals("F")) {
				caseExpressionResult = toStr("FOAIDEN");
			} else if (lvThisProduct.equals("P")) {
				caseExpressionResult = toStr("PPATELE");
			}

			lvFormToCall = caseExpressionResult;
			//
			goItem(toStr("SPRADDR.PHONE_AREA"));
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("FORM_HEADER").setValue(
					"HOLD_BLOCK_FIELD", getCursorItem());
			executeAction("CHECK_PHONE_UPDATE");
			getContainer().getGoqrpls().gCheckFailure();
			//
			// Check if in a phone with a telephone tab
			//
			tabPageId = findTabPage("TELEPHONE_TAB");
			if (!(tabPageId == null)) {
				if (!getTabPageVisible(tabPageId.getId())) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0103"),
									toStr("FORM"),
									toStr("*ERROR* User %01% is not authorized to access %02%."),
									getUser(),
									isNull(GSecurity.FgGetTabDescFnc(
											getCurrentTaskName(),
											toStr("TELEPHONE_TAB")),
											"TELEPHONE_TAB")));
					throw new ApplicationException();
				}
				if (getTabPageEnabled(tabPageId.getId())) {
					goBlock(toStr("SPRTELE"));
					//
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					this.getContainer().getServices().executeQuery();
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					MessageServices.resetMessageLevel();
				}
			} else {
				if (inStr(
						GSecurity.FgGetTabSecurityFnc(lvFormToCall, getUser()),
						toStr("TELEPHONE_TAB:N")).greater(0)) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0104"),
									toStr("FORM"),
									toStr("*ERROR* User %01% is not authorized to access %02% on %03%."),
									getUser(),
									isNull(GSecurity.FgGetTabDescFnc(
											lvFormToCall,
											toStr("TELEPHONE_TAB")),
											"TELEPHONE_TAB"), lvFormToCall));
					throw new ApplicationException();
				} else {
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					setGlobal("KEY_IDNO",
							getFormModel().getBusinessObject("KEY_BLOCK")
									.getValue("ID"));
					setGlobal("SECRFRM", lvFormToCall);
					setGlobal("NAVIGATE_TO_TAB", toStr("TELEPHONE"));
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					getFormModel().getBusinessObject("FORM_HEADER").setValue(
							"HOLD_FIELD", getCurrentField());
					//
					executeAction("G$_REVOKE_ACCESS");
					getContainer().getGoqrpls().gCheckFailure();
					setGlobal("FORM_WAS_CALLED", toStr("Y"));
					getContainer().getGoqrpls().gSecuredFormCall(
							getGlobal("CURRENT_USER"), getGlobal("SECRFRM"),
							toStr(""));
					setGlobal("FORM_WAS_CALLED", toStr("N"));
					setGlobal("NAVIGATE_TO_TAB", toStr(""));
					//
					executeAction("CHECK_PHONE");
					getContainer().getGoqrpls().gCheckFailure();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.UPDATE_PHONE_STATUS DECLARE
	 * lv_rowid VARCHAR2(18); lv_status SPRTELE.SPRTELE_STATUS_IND%TYPE; --
	 * CURSOR get_rowid_c IS SELECT ROWID FROM SPRTELE WHERE SPRTELE_PIDM =
	 * :PIDM AND SPRTELE_ADDR_SEQNO = :SPRADDR.SPRADDR_SEQNO AND
	 * SPRTELE_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE AND
	 * NVL(SPRTELE_STATUS_IND,'*') = lv_status; -- BEGIN IF
	 * NVL(:SPRADDR.CHANGE_STATUS,'N') <> 'Y' THEN RETURN; END IF; -- IF
	 * :SPRADDR.SPRADDR_STATUS_IND = 'I' THEN lv_status := '*'; ELSE lv_status
	 * := 'I'; END IF; -- -- Loop through all possible records for this address
	 * type and seq. -- FOR rowid_rec IN get_rowid_c LOOP --
	 * GB_TELEPHONE.P_UPDATE(p_PIDM =>:PIDM, p_SEQNO =>:SPRADDR.SPRTELE_SEQNO,
	 * p_TELE_CODE =>:SPRADDR.HOLD_TELE_CODE, p_STATUS_IND
	 * =>:SPRADDR.SPRADDR_STATUS_IND, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_USER_ID =>:GLOBAL.CURRENT_USER, p_ROWID =>lv_rowid); END LOOP; --
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.UPDATE_PHONE_STATUS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "UPDATE_PHONE_STATUS")
	public void spraddr_UpdatePhoneStatus() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			java.sql.RowId lvRowid = null;
			NString lvStatus = NString.getNull();
			String sqlgetRowidC = "SELECT ROWID "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND NVL(SPRTELE_STATUS_IND, '*') = :P_LV_STATUS ";
			DataCursor getRowidC = new DataCursor(sqlgetRowidC);
			try {
				if (isNull(spraddrElement.getChangeStatus(), "N")
						.notEquals("Y")) {
					return;
				}
				//
				if (spraddrElement.getSpraddrStatusInd().equals("I")) {
					lvStatus = toStr("*");
				} else {
					lvStatus = toStr("I");
				}
				//
				// Loop through all possible records for this address type and
				// seq.
				//
				// Setting query parameters
				getRowidC.addParameter("PIDM", getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
				getRowidC.addParameter("SPRADDR_SPRADDR_SEQNO",
						spraddrElement.getSpraddrSeqno());
				getRowidC.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
						spraddrElement.getSpraddrAtypCode());
				getRowidC.addParameter("P_LV_STATUS", lvStatus);
				try {
					getRowidC.open();
					while (true) {
						TableRow rowidRec = getRowidC.fetchRow();
						if (getRowidC.notFound())
							break;
						//
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						// F2J_WARNING : Passing parameters by name is not
						// supported. Please check that the parameters are in
						// the correct order.
						GbTelephone.pUpdate(
								/* pPidm=> */toNumber(getFormModel()
										.getBusinessObject("KEY_BLOCK")
										.getValue("PIDM")),
								/* pSeqno=> */spraddrElement.getSprteleSeqno(),
								/* pTeleCode=> */spraddrElement
										.getHoldTeleCode(),
								/* pStatusInd=> */spraddrElement
										.getSpraddrStatusInd(),
								/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
								/* pUserId=> */getGlobal("CURRENT_USER"),
								/* pRowid=> */lvRowid);
					}
				} finally {
					getRowidC.close();
				}
			} catch (Exception e) {
				getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
				throw new ApplicationException();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR.UPDATE_SPRTELE -- 82-1 add
	 * :SPRADDR.PHONE_CTRY to update DECLARE TEMP_TELE_ROWID VARCHAR2(30); BEGIN
	 * IF :SPRADDR.CHANGE_PHONE = 'Y' THEN SELECT ROWID INTO TEMP_TELE_ROWID
	 * FROM SPRTELE WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_TELE_CODE =
	 * :SPRADDR.HOLD_TELE_CODE AND SPRTELE_SEQNO = :SPRADDR.SPRTELE_SEQNO; --
	 * GB_TELEPHONE.P_UPDATE(p_PIDM =>:PIDM, p_SEQNO =>:SPRADDR.SPRTELE_SEQNO,
	 * p_TELE_CODE =>:SPRADDR.TELE_CODE, p_PHONE_AREA =>:SPRADDR.PHONE_AREA,
	 * p_PHONE_NUMBER =>:SPRADDR.PHONE_NUMBER, p_PHONE_EXT =>:SPRADDR.PHONE_EXT,
	 * p_ADDR_SEQNO =>:SPRADDR.SPRADDR_SEQNO, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER,
	 * p_CTRY_code_PHONE =>:SPRADDR.PHONE_CTRY, -- 82-1 -- p_CTRY_code_PHONE
	 * =>:SPRADDR.SPRADDR_CTRY_CODE_PHONE, p_ROWID =>TEMP_TELE_ROWID); END IF;
	 * -- EXECUTE_TRIGGER('UPDATE_PHONE_STATUS');
	 * EXECUTE_TRIGGER('GET_PHONE_INFO'); -- EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR.UPDATE_SPRTELE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "UPDATE_SPRTELE")
	public void spraddr_UpdateSprtele() {

		// 82-1 add :SPRADDR.PHONE_CTRY to update

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		int rowCount = 0;
		{
			java.sql.RowId tempTeleRowid = null;
			try {
				if (spraddrElement.getChangePhone().equals("Y")) {
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					String sql1 = "SELECT ROWID "
							+ " FROM SPRTELE "
							+ " WHERE SPRTELE_PIDM = :PIDM AND SPRTELE_TELE_CODE = :SPRADDR_HOLD_TELE_CODE AND SPRTELE_SEQNO = :SPRADDR_SPRTELE_SEQNO ";
					DataCommand command1 = new DataCommand(sql1);
					// Setting query parameters
					command1.addParameter("PIDM", getFormModel()
							.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					command1.addParameter("SPRADDR_HOLD_TELE_CODE",
							spraddrElement.getHoldTeleCode());
					command1.addParameter("SPRADDR_SPRTELE_SEQNO",
							spraddrElement.getSprteleSeqno());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if (results1.hasData()) {
						tempTeleRowid = (java.sql.RowId) results1.getObject(0);
						// tempTeleRowid = new java.sql.RowId
						// results1.getStr(0);
					}
					results1.close();
					//
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					// F2J_WARNING : Passing parameters by name is not
					// supported. Please check that the parameters are in the
					// correct order.
					GbTelephone.pUpdate(/* pPidm=> */toNumber(getFormModel()
							.getBusinessObject("KEY_BLOCK").getValue("PIDM")),
					/* pSeqno=> */spraddrElement.getSprteleSeqno(),
					/* pTeleCode=> */spraddrElement.getTeleCode(),
					/* pPhoneArea=> */spraddrElement.getPhoneArea(),
					/* pPhoneNumber=> */spraddrElement.getPhoneNumber(),
					/* pPhoneExt=> */spraddrElement.getPhoneExt(),
					/* pAddrSeqno=> */spraddrElement.getSpraddrSeqno(),
					/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
					/* pUserId=> */getGlobal("CURRENT_USER"),
					/* pCtryCodePhone=> */spraddrElement.getPhoneCtry(),
					/* pRowid=> */tempTeleRowid);
				}
				//
				executeAction("UPDATE_PHONE_STATUS");
				executeAction("GET_PHONE_INFO");
			} catch (Exception e) {
				getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
				throw new ApplicationException();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_FROM_DATE", function = KeyFunction.NEXT_ITEM)
	public void spraddrFromDate_keyNexItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		getContainer().getGoqrpls().gDateNextItem();
		getContainer().getGoqrpls().gCheckFailure();
		getContainer().getGoqrpls().gCheckQueryMode();
		//MORPHIS TODO AP ELLBHR-10579, PPIADDR FORM is readonly but pressing tab with IDs which SPRADDR_FROM_DATE field is empty would set a date
		if (getGlobal("QUERY_MODE").equals("0")
				&& getItemEnabled("SPRADDR.SPRADDR_FROM_DATE").getValue()
				&& getItemReadOnly("SPRADDR.SPRADDR_FROM_DATE").getValue()) {
			if (spraddrElement.getSpraddrFromDate().isNull()) {
				spraddrElement.setSpraddrFromDate(NDate.getNow());
			}
		}
		setGlobal("QUERY_MODE", toStr("0"));
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_FROM_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrFromDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_FROM_DATE", function = KeyFunction.ITEM_OUT)
	public void spraddrFromDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_FROM_DATE.POST-CHANGE BEGIN
	 * G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE; -- G$_CHECK_QUERY_MODE; -- IF
	 * (:GLOBAL.QUERY_MODE = '0') THEN IF ( :SPRADDR.SPRADDR_TO_DATE IS NOT NULL
	 * AND :SPRADDR.SPRADDR_FROM_DATE > :SPRADDR.SPRADDR_TO_DATE ) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0105','FORM','*ERROR* Address from date must
	 * be less than or equal address to date.')); RAISE FORM_TRIGGER_FAILURE;
	 * END IF; END IF; -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_FROM_DATE")
	public void spraddrFromDate_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		try {

			getContainer().getGoqrpls().gCheckFailure();
			//
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			if ((getGlobal("QUERY_MODE").equals("0"))) {
				if ((!spraddrElement.getSpraddrToDate().isNull() && spraddrElement
						.getSpraddrFromDate().greater(
								spraddrElement.getSpraddrToDate()))) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0105"),
									toStr("FORM"),
									toStr("*ERROR* Address from date must be less than or equal address to date.")));
					throw new ApplicationException();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_FROM_DATE_DBT")
	public void spraddrFromDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRADDR_FROM_DATE_DBT")
	public void spraddrFromDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_TO_DATE", function = KeyFunction.NEXT_ITEM)
	public void spraddrToDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_TO_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrToDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_TO_DATE", function = KeyFunction.ITEM_OUT)
	public void spraddrToDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_TO_DATE.POST-CHANGE BEGIN
	 * G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE; -- G$_CHECK_QUERY_MODE; -- IF
	 * (:GLOBAL.QUERY_MODE = '0') THEN IF (:SPRADDR.SPRADDR_TO_DATE <
	 * :SPRADDR.SPRADDR_FROM_DATE OR :SPRADDR.SPRADDR_FROM_DATE IS NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0106','FORM','*ERROR* Address to date must be
	 * greater than or equal to address from date.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; END IF; -- :GLOBAL.QUERY_MODE := '0';
	 * EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_TO_DATE")
	public void spraddrToDate_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if(spraddrElement.getSpraddrToDate().isNull())
			return;

		try {

			getContainer().getGoqrpls().gCheckFailure();
			//
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			if ((getGlobal("QUERY_MODE").equals("0"))) {
				if ((spraddrElement.getSpraddrToDate().lesser(
						spraddrElement.getSpraddrFromDate()) || spraddrElement
						.getSpraddrFromDate().isNull())) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0106"),
									toStr("FORM"),
									toStr("*ERROR* Address to date must be greater than or equal to address from date.")));
					throw new ApplicationException();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_TO_DATE_DBT")
	public void spraddrToDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRADDR_TO_DATE_DBT")
	public void spraddrToDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRADDR_ATYP_CODE")
	public void spraddrAtypCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_ATYP_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrAtypCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRADDR_ATYP_CODE")
	public void spraddrAtypCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_ATYP_CODE", function = KeyFunction.NEXT_ITEM)
	public void spraddrAtypCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_ATYP_CODE", function = KeyFunction.ITEM_OUT)
	public void spraddrAtypCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE.G$_SEARCH_OPTIONS
	 * 
	 * SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION_UNIT
	 * ,FORM_SCOPE);
	 * 
	 * G$_KEY_OPT_MENU ('SPRADDR.SPRADDR_ATYP_CODE', G$_NLS.Get('GOQCLIB-0107',
	 * 'FORM','Address Types') , 'LIST_VALUES', G$_NLS.Get('GOQCLIB-0108',
	 * 'FORM','Query Addresses ') , 'COUNT_QUERY', '', '', '', '');
	 * G$_CHECK_FAILURE;
	 * 
	 * SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION_UNIT
	 * ,ITEM_SCOPE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRADDR_ATYP_CODE")
	public void spraddrAtypCode_GSearchOptions() {

		// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
		// SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(),
		// SupportClasses.Property.VALIDATION_UNIT,
		// SupportClasses.Constants.FORM_SCOPE);
		this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
		

		getContainer().getGoqrpls().gKeyOptMenu(
				toStr("SPRADDR.SPRADDR_ATYP_CODE"),
				GNls.Fget(toStr("GOQCLIB-0107"), toStr("FORM"),
						toStr("Address Types")),
				toStr("LIST_VALUES"),
				GNls.Fget(toStr("GOQCLIB-0108"), toStr("FORM"),
						toStr("Query Addresses ")), toStr("COUNT_QUERY"),
				toStr(""), toStr(""), toStr(""), toStr(""));
		getContainer().getGoqrpls().gCheckFailure();
		// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION_UNIT" is not
		// supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
		// SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(),
		// SupportClasses.Property.VALIDATION_UNIT,
		// SupportClasses.Constants.ITEM_SCOPE);
		this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION_UNIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR1 IS SELECT STVATYP_DESC, STVATYP_TELE_CODE FROM
	 * STVATYP WHERE STVATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE; -- BEGIN
	 * G$_CHECK_QUERY_MODE; -- IF :SPRADDR.ROWID IS NULL OR :SPRADDR.TELE_CODE
	 * IS NULL THEN OPEN PTI_CURSOR1; FETCH PTI_CURSOR1 INTO
	 * :SPRADDR.ATYP_DESCRIPTION, :SPRADDR.TELE_CODE; IF PTI_CURSOR1%NOTFOUND
	 * THEN MESSAGE(G$_NLS.Get('GOQCLIB-0109','FORM','*ERROR* Invalid code;
	 * press LIST for valid codes.')); CLOSE PTI_CURSOR1; RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR1; -- IF :SPRADDR.TELE_CODE
	 * IS NOT NULL THEN :SPRADDR.TELE_DESCRIPTION :=
	 * GB_STVTELE.F_GET_DESCRIPTION(:SPRADDR.TELE_CODE); END IF; --
	 * :SPRADDR.SPRADDR_PIDM := :KEY_BLOCK.PIDM; IF :SPRADDR.SPRADDR_FROM_DATE
	 * IS NULL THEN :SPRADDR.SPRADDR_FROM_DATE := SYSDATE; END IF; --
	 * EXECUTE_TRIGGER('SET_FINANCE_DATES'); G$_CHECK_FAILURE; -- ELSE
	 * :SPRADDR.ATYP_DESCRIPTION :=
	 * GB_STVATYP.F_GET_DESCRIPTION(:SPRADDR.SPRADDR_ATYP_CODE); IF
	 * :SPRADDR.ATYP_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0110','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes.')); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_ATYP_CODE")
	public void spraddrAtypCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getSpraddrAtypCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor1 = "SELECT STVATYP_DESC, STVATYP_TELE_CODE "
					+ " FROM STVATYP "
					+ " WHERE STVATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					if (spraddrElement.getRowState().equals(
							DataRowStatus.INSERTED)
							|| spraddrElement.getTeleCode().isNull()) {
						// Setting query parameters
						ptiCursor1.addParameter("SPRADDR_SPRADDR_ATYP_CODE",
								spraddrElement.getSpraddrAtypCode());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor1.
						ptiCursor1.open();
						ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
						if (ptiCursor1Results != null) {
							spraddrElement.setAtypDescription(ptiCursor1Results
									.getStr(0));
							spraddrElement.setTeleCode(ptiCursor1Results
									.getStr(1));
						}
						if (ptiCursor1.notFound()) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0109"),
											toStr("FORM"),
											toStr("*ERROR* Invalid code; press LIST for valid codes.")));
							ptiCursor1.close();
							throw new ApplicationException();
						}
						ptiCursor1.close();
						//
						if (!spraddrElement.getTeleCode().isNull()) {
							spraddrElement.setTeleDescription(GbStvtele
									.fGetDescription(spraddrElement
											.getTeleCode()));
						}
						//
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						spraddrElement.setSpraddrPidm(toNumber(getFormModel()
								.getBusinessObject("KEY_BLOCK")
								.getValue("PIDM")));
						if (spraddrElement.getSpraddrFromDate().isNull()) {
							spraddrElement.setSpraddrFromDate(NDate.getNow());
						}
						//
						executeAction("SET_FINANCE_DATES");
						getContainer().getGoqrpls().gCheckFailure();
					} else {
						spraddrElement.setAtypDescription(GbStvatyp
								.fGetDescription(spraddrElement
										.getSpraddrAtypCode()));
						if (spraddrElement.getAtypDescription().isNull()) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0110"),
											toStr("FORM"),
											toStr("*ERROR* Invalid code; press LIST for valid codes.")));
							throw new ApplicationException();
						}
					}
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ATYP_CODE.KEY-CQUERY
	 * DECLARE lv_form_to_call VARCHAR2(30); lv_this_product VARCHAR2(1) :=
	 * SUBSTR(:SYSTEM.CURRENT_FORM,1,1); BEGIN lv_form_to_call := CASE
	 * lv_this_product WHEN 'A' THEN 'APCADDR' WHEN 'F' THEN 'FOQADDR' WHEN 'P'
	 * THEN 'PPIADDR' ELSE 'SOADDRQ' END; -- :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
	 * :GLOBAL.VALUE := ''; :GLOBAL.PIDM := :KEY_BLOCK.PIDM; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,lv_form_to_call,'QUERY'); -- IF
	 * :GLOBAL.VALUE IS NOT NULL THEN EXECUTE_TRIGGER('LIST_VALUES_COPY');
	 * G$_CHECK_FAILURE; NEXT_FIELD; G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPRADDR_ATYP_CODE", function = KeyFunction.COUNT_QUERY)
	public void spraddrAtypCode_TotalResults() {

		NString caseExpressionResult = null;
		{
			NString lvFormToCall = NString.getNull();
			NString lvThisProduct = substring(toStr(getCurrentTaskName()),
					toInt(1), toInt(1));

			if (lvThisProduct.equals("A")) {
				caseExpressionResult = toStr("APCADDR");
			} else if (lvThisProduct.equals("F")) {
				caseExpressionResult = toStr("FOQADDR");
			} else if (lvThisProduct.equals("P")) {
				caseExpressionResult = toStr("PPIADDR");
			}

			lvFormToCall = caseExpressionResult;
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			setGlobal("KEY_IDNO", getFormModel().getBusinessObject("KEY_BLOCK")
					.getValue("ID"));
			setGlobal("VALUE", toStr(""));
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			setGlobal("PIDM", getFormModel().getBusinessObject("KEY_BLOCK")
					.getValue("PIDM"));
			//
			executeAction("G$_REVOKE_ACCESS");
			getContainer().getGoqrpls().gCheckFailure();
			getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
					lvFormToCall, toStr("QUERY"));
			//
			if (!getGlobal("VALUE").isNull()) {
				executeAction("LIST_VALUES_COPY");
				getContainer().getGoqrpls().gCheckFailure();
				nextItem();
				getContainer().getGoqrpls().gCheckFailure();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_ATYP_CODE_LBT")
	public void spraddrAtypCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED DECLARE lv_this_product
	 * VARCHAR2(1) := SUBSTR(:SYSTEM.CURRENT_FORM,1,1); BEGIN IF lv_this_product
	 * = 'P' THEN SET_WINDOW_PROPERTY('G$_OPT_WINDOW', POSITION, 198, 126);
	 * G$_KEY_OPT_MENU ('SPRADDR.SPRADDR_ATYP_CODE', 'Address Types',
	 * 'LIST_VALUES', 'Addresses (PPIADDR)', 'COUNT_QUERY', '', '', '', '');
	 * G$_CHECK_FAILURE; ELSE G$_BTN_PRESSED; G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRADDR_ATYP_CODE_LBT")
	public void spraddrAtypCodeLbt_buttonClick() {

		{
			NString lvThisProduct = substring(toStr(getCurrentTaskName()),
					toInt(1), toInt(1));
			if (lvThisProduct.equals("P")) {
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not
				// supported. See documentation for details
				// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				// SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW",
				// SupportClasses.Property.POSITION, 198, 126);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SPRADDR.SPRADDR_ATYP_CODE"), GNls.Fget(toStr("GOQCLIB-0107"), toStr("FORM"), toStr("Address Types")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOQCLIB-0178"), toStr("FORM"), toStr("Addresses (PPIADDR)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
//				getContainer().getGoqrpls().gKeyOptMenu(toStr("SPRADDR.SPRADDR_ATYP_CODE"), toStr("Address Types"), toStr("LIST_VALUES"), toStr("Addresses (PPIADDR)"), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			} else {
				getContainer().getGoqrpls().gBtnPressed();
				getContainer().getGoqrpls().gCheckFailure();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * ATYP_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "ATYP_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void atypDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRADDR_STAT_CODE")
	public void spraddrStatCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_STAT_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrStatCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRADDR_STAT_CODE")
	public void spraddrStatCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRADDR_STAT_CODE")
	public void spraddrStatCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_STAT_CODE", function = KeyFunction.NEXT_ITEM)
	public void spraddrStatCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_STAT_CODE.PRE-TEXT-ITEM
	 * :SPRADDR.HOLD_STAT_CODE := :SPRADDR.SPRADDR_STAT_CODE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.PRE-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-TEXT-ITEM", item = "SPRADDR_STAT_CODE", function = KeyFunction.ITEM_IN)
	public void spraddrStatCode_itemIn() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		spraddrElement.setHoldStatCode(spraddrElement.getSpraddrStatCode());
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_STAT_CODE.POST-TEXT-ITEM IF
	 * :SPRADDR.SPRADDR_STAT_CODE IS NULL THEN :SPRADDR.STAT_DESCRIPTION := '';
	 * RETURN; END IF; -- G$_SEARCH.POST_TEXT_CODE; IF
	 * :SPRADDR.SPRADDR_STAT_CODE IS NOT NULL AND (:SPRADDR.HOLD_STAT_CODE IS
	 * NULL OR :SPRADDR.SPRADDR_STAT_CODE <> :SPRADDR.HOLD_STAT_CODE) THEN
	 * :MATERIAL_FLAG := 'Y'; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_STAT_CODE", function = KeyFunction.ITEM_OUT)
	public void spraddrStatCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getSpraddrStatCode().isNull()) {
			spraddrElement.setStatDescription(toStr(""));
			return;
		}
		//
		getContainer().getGoqrpls().getGSearch().postTextCode();
		if (!spraddrElement.getSpraddrStatCode().isNull()
				&& (spraddrElement.getHoldStatCode().isNull() || spraddrElement
						.getSpraddrStatCode().notEquals(
								spraddrElement.getHoldStatCode()))) {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("FORM_HEADER").setValue(
					"MATERIAL_FLAG", "Y");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_STAT_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPRADDR.STAT_DESCRIPTION :=
	 * GB_STVSTAT.F_GET_DESCRIPTION(:SPRADDR.SPRADDR_STAT_CODE); IF
	 * :SPRADDR.STAT_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0111','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_STAT_CODE")
	public void spraddrStatCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getSpraddrStatCode().isNull())
			return;

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spraddrElement.setStatDescription(GbStvstat
					.fGetDescription(spraddrElement.getSpraddrStatCode()));
			if (spraddrElement.getStatDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0111"),
								toStr("FORM"),
								toStr("*ERROR* Invalid code; press LIST for valid codes")));
				throw new ApplicationException();
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_STAT_CODE_LBT")
	public void spraddrStatCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * STAT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "STAT_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void statDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ZIP.KEY-LISTVAL
	 * :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GTVZIPC','QUERY'); -- IF
	 * :GLOBAL.VALUE IS NOT NULL THEN :SPRADDR.SPRADDR_ZIP := :GLOBAL.VALUE;
	 * :SPRADDR.SPRADDR_CITY := :GLOBAL.VALUE_2; -- IF
	 * G$_CITY_STATE_NATN3(:SPRADDR.SPRADDR_ZIP, :SPRADDR.SPRADDR_CITY,
	 * :SPRADDR.SPRADDR_STAT_CODE, :SPRADDR.SPRADDR_NATN_CODE,
	 * :SPRADDR.SPRADDR_CNTY_CODE) THEN :SPRADDR.NO_ADDR_INFO := 0; -- IF
	 * :SPRADDR.SPRADDR_NATN_CODE IS NULL THEN :SPRADDR.NATN_DESCRIPTION :=
	 * NULL; END IF; -- GO_ITEM('SPRADDR.SPRADDR_STAT_CODE'); NEXT_FIELD;
	 * NEXT_FIELD; NEXT_FIELD; PREVIOUS_FIELD; ELSE PREVIOUS_FIELD;
	 * PREVIOUS_FIELD; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ZIP.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-LISTVAL", item = "SPRADDR_ZIP", function = KeyFunction.LIST_VALUES)
	public void spraddrZip_ListValues() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue(
				"HOLD_BLOCK_FIELD", getCursorItem());
		//
		executeAction("G$_REVOKE_ACCESS");
		getContainer().getGoqrpls().gCheckFailure();
		getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("GTVZIPC"), toStr("QUERY"));
		//
		if (!getGlobal("VALUE").isNull()) {
			spraddrElement.setSpraddrZip(getGlobal("VALUE"));
			spraddrElement.setSpraddrCity(getGlobal("VALUE_2"));

			Ref<NString> zipIn_ref = new Ref<NString>(
					spraddrElement.getSpraddrZip());
			Ref<NString> cityIn_ref = new Ref<NString>(
					spraddrElement.getSpraddrCity());
			Ref<NString> stateOut_ref = new Ref<NString>(
					spraddrElement.getSpraddrStatCode());
			Ref<NString> natnOut_ref = new Ref<NString>(
					spraddrElement.getSpraddrNatnCode());
			Ref<NString> cntyOut_ref = new Ref<NString>(
					spraddrElement.getSpraddrCntyCode());

			NBool retval = getContainer().getGoqrpls().gCityStateNatn3(zipIn_ref,
					cityIn_ref, stateOut_ref, natnOut_ref, cntyOut_ref);

			spraddrElement.setSpraddrZip(zipIn_ref.val);
			spraddrElement.setSpraddrCity(cityIn_ref.val);
			spraddrElement.setSpraddrStatCode(stateOut_ref.val);
			spraddrElement.setSpraddrNatnCode(natnOut_ref.val);
			spraddrElement.setSpraddrCntyCode(cntyOut_ref.val);

			if (retval.getValue()) {
				spraddrElement.setNoAddrInfo(toNumber(0));
				//
				if (spraddrElement.getSpraddrNatnCode().isNull()) {
					spraddrElement.setNatnDescription(toStr(null));
				}
				//
				goItem(toStr("SPRADDR.SPRADDR_STAT_CODE"));
				
				//MORPHIS TODO AP Validate Stat, Cnty and Natn fields
				validateCurrentItem(true);
				nextItem();
				nextItem();
				//MORPHIS TODO AP Validate Stat, Cnty and Natn fields
				validateCurrentItem(true);
				nextItem();
				//MORPHIS TODO AP Validate Stat, Cnty and Natn fields
				validateCurrentItem(true);
				previousItem();

			} else {
				previousItem();
				previousItem();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ZIP.KEY-NEXT-ITEM IF
	 * :SPRADDR.SPRADDR_ZIP IS NULL THEN NEXT_FIELD; ELSE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS'); IF (:SPRADDR.NO_ADDR_INFO = 1)
	 * THEN EXECUTE_TRIGGER('ADDR_DEFAULT_NXTFLD');
	 * EXECUTE_TRIGGER('CHECK_MULTIPLE_ZIPS'); ELSE NEXT_FIELD; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ZIP.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_ZIP", function = KeyFunction.NEXT_ITEM)
	public void spraddrZip_keyNexItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getSpraddrZip().isNull()) {
			nextItem();
		} else {
			executeAction("CHECK_ADDRESS_EXISTS");
			if ((spraddrElement.getNoAddrInfo().equals(1))) {
				executeAction("ADDR_DEFAULT_NXTFLD");
				executeAction("CHECK_MULTIPLE_ZIPS");
			} else {
				nextItem();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ZIP.KEY-PREV-ITEM IF
	 * :SPRADDR.SPRADDR_ZIP IS NULL THEN PREVIOUS_FIELD; ELSE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS'); IF (:SPRADDR.NO_ADDR_INFO = 1)
	 * THEN IF G$_CITY_STATE_NATN(:SPRADDR.SPRADDR_ZIP, :SPRADDR.SPRADDR_CITY,
	 * :SPRADDR.SPRADDR_STAT_CODE, :SPRADDR.SPRADDR_NATN_CODE,
	 * :SPRADDR.SPRADDR_CNTY_CODE) THEN PREVIOUS_FIELD; PREVIOUS_FIELD; ELSE
	 * NEXT_FIELD; NEXT_FIELD; GO_ITEM('SPRADDR.SPRADDR_STAT_CODE'); END IF;
	 * ELSE PREVIOUS_FIELD; END IF; -- EXECUTE_TRIGGER('CHECK_MULTIPLE_ZIPS');
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ZIP.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "SPRADDR_ZIP", function = KeyFunction.PREVIOUS_ITEM)
	public void spraddrZip_PreviousItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getSpraddrZip().isNull()) {
			previousItem();
		} else {
			executeAction("CHECK_ADDRESS_EXISTS");
			if ((spraddrElement.getNoAddrInfo().equals(1))) {
				Ref<NString> zipIn_ref = new Ref<NString>(
						spraddrElement.getSpraddrZip());
				Ref<NString> cityOut_ref = new Ref<NString>(
						spraddrElement.getSpraddrCity());
				Ref<NString> stateOut_ref = new Ref<NString>(
						spraddrElement.getSpraddrStatCode());
				Ref<NString> natnOut_ref = new Ref<NString>(
						spraddrElement.getSpraddrNatnCode());
				Ref<NString> cntyOut_ref = new Ref<NString>(
						spraddrElement.getSpraddrCntyCode());

				NBool retval = getContainer().getGoqrpls().gCityStateNatn(zipIn_ref,
						cityOut_ref, stateOut_ref, natnOut_ref, cntyOut_ref);

				spraddrElement.setSpraddrZip(zipIn_ref.val);
				spraddrElement.setSpraddrCity(cityOut_ref.val);
				spraddrElement.setSpraddrStatCode(stateOut_ref.val);
				spraddrElement.setSpraddrNatnCode(natnOut_ref.val);
				spraddrElement.setSpraddrCntyCode(cntyOut_ref.val);

				if (retval.getValue()) {
					previousItem();
					previousItem();
				} else {
					nextItem();
					nextItem();
					goItem(toStr("SPRADDR.SPRADDR_STAT_CODE"));
				}
			} else {
				previousItem();
			}
			//
			executeAction("CHECK_MULTIPLE_ZIPS");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ZIP.ADDR_DEFAULT_NXTFLD IF
	 * G$_CITY_STATE_NATN(:SPRADDR.SPRADDR_ZIP, :SPRADDR.SPRADDR_CITY,
	 * :SPRADDR.SPRADDR_STAT_CODE, :SPRADDR.SPRADDR_NATN_CODE,
	 * :SPRADDR.SPRADDR_CNTY_CODE) THEN GO_ITEM('SPRADDR.SPRADDR_CITY'); ELSE
	 * NEXT_FIELD; NEXT_FIELD; PREVIOUS_FIELD; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ZIP.ADDR_DEFAULT_NXTFLD
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "ADDR_DEFAULT_NXTFLD")
	public void spraddrZip_AddrDefaultNxtfld() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		Ref<NString> zipIn_ref = new Ref<NString>(
				spraddrElement.getSpraddrZip());
		Ref<NString> cityOut_ref = new Ref<NString>(
				spraddrElement.getSpraddrCity());
		Ref<NString> stateOut_ref = new Ref<NString>(
				spraddrElement.getSpraddrStatCode());
		Ref<NString> natnOut_ref = new Ref<NString>(
				spraddrElement.getSpraddrNatnCode());
		Ref<NString> cntyOut_ref = new Ref<NString>(
				spraddrElement.getSpraddrCntyCode());

		NBool retval = getContainer().getGoqrpls().gCityStateNatn(zipIn_ref,
				cityOut_ref, stateOut_ref, natnOut_ref, cntyOut_ref);

		spraddrElement.setSpraddrZip(zipIn_ref.val);
		spraddrElement.setSpraddrCity(cityOut_ref.val);
		spraddrElement.setSpraddrStatCode(stateOut_ref.val);
		setItemIsValid("SPRADDR_STAT_CODE", false);
		spraddrElement.setSpraddrNatnCode(natnOut_ref.val);
		setItemIsValid("SPRADDR_NATN_CODE", false);
		spraddrElement.setSpraddrCntyCode(cntyOut_ref.val);
		setItemIsValid("SPRADDR_CNTY_CODE", false);

		if (retval.getValue()) {
			goItem(toStr("SPRADDR.SPRADDR_CITY"));
		} else {
			nextItem();
			TaskServices.getCurrentTask().getNavigationModel().doNavigation();
			nextItem();
			TaskServices.getCurrentTask().getNavigationModel().doNavigation();
			validateCurrentItem();
			previousItem();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ZIP_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_ZIP_LBT")
	public void spraddrZipLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRADDR_CNTY_CODE")
	public void spraddrCntyCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_CNTY_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrCntyCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRADDR_CNTY_CODE")
	public void spraddrCntyCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRADDR_CNTY_CODE")
	public void spraddrCntyCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_CNTY_CODE", function = KeyFunction.NEXT_ITEM)
	public void spraddrCntyCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_CNTY_CODE.POST-TEXT-ITEM
	 * G$_SEARCH.POST_TEXT_CODE; IF :SPRADDR.SPRADDR_CNTY_CODE IS NULL THEN
	 * :SPRADDR.CNTY_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_CNTY_CODE", function = KeyFunction.ITEM_OUT)
	public void spraddrCntyCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().postTextCode();
		if (spraddrElement.getSpraddrCntyCode().isNull()) {
			spraddrElement.setCntyDescription(toStr(""));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_CNTY_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPRADDR.CNTY_DESCRIPTION :=
	 * GB_STVCNTY.F_GET_DESCRIPTION(:SPRADDR.SPRADDR_CNTY_CODE); IF
	 * :SPRADDR.CNTY_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0112','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_CNTY_CODE")
	public void spraddrCntyCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getSpraddrCntyCode().isNull())
			return;

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spraddrElement.setCntyDescription(GbStvcnty
					.fGetDescription(spraddrElement.getSpraddrCntyCode()));
			if (spraddrElement.getCntyDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0112"),
								toStr("FORM"),
								toStr("*ERROR* Invalid code; press LIST for valid codes")));
				throw new ApplicationException();
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_CNTY_CODE_LBT")
	public void spraddrCntyCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * CNTY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "CNTY_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void cntyDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRADDR_NATN_CODE")
	public void spraddrNatnCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_NATN_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrNatnCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRADDR_NATN_CODE")
	public void spraddrNatnCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_NATN_CODE", function = KeyFunction.NEXT_ITEM)
	public void spraddrNatnCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRADDR_NATN_CODE.G$_SEARCH_PARAMETERS
	 * G$_SEARCH.PARAMETERS('STVNATN_CODE', 'STVNATN_NATION', '');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRADDR_NATN_CODE")
	public void spraddrNatnCode_GSearchParameters() {

		getContainer()
				.getGoqrpls()
				.getGSearch()
				.parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"),
						toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_NATN_CODE.POST-TEXT-ITEM
	 * G$_SEARCH.POST_TEXT_CODE; IF :SPRADDR.SPRADDR_NATN_CODE IS NULL THEN
	 * :SPRADDR.NATN_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_NATN_CODE", function = KeyFunction.ITEM_OUT)
	public void spraddrNatnCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().postTextCode();
		if (spraddrElement.getSpraddrNatnCode().isNull()) {
			spraddrElement.setNatnDescription(toStr(""));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_NATN_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPRADDR.NATN_DESCRIPTION :=
	 * GB_STVNATN.F_GET_DESCRIPTION(:SPRADDR.SPRADDR_NATN_CODE); IF
	 * :SPRADDR.NATN_DESCRIPTION IS NULL THEN MESSAGE(
	 * G$_NLS.Get('GOQCLIB-0113', 'FORM','*ERROR* Invalid code; press LIST for
	 * valid codes') ); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_NATN_CODE")
	public void spraddrNatnCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getSpraddrNatnCode().isNull())
			return;

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spraddrElement.setNatnDescription(GbStvnatn
					.fGetDescription(spraddrElement.getSpraddrNatnCode()));
			if (spraddrElement.getNatnDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0113"),
								toStr("FORM"),
								toStr("*ERROR* Invalid code; press LIST for valid codes")));
				throw new ApplicationException();
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_NATN_CODE_LBT")
	public void spraddrNatnCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * NATN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "NATN_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void natnDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "TELE_CODE")
	public void teleCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "TELE_CODE", function = KeyFunction.ITEM_CHANGE)
	public void teleCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "TELE_CODE")
	public void teleCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "TELE_CODE")
	public void teleCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "TELE_CODE", function = KeyFunction.NEXT_ITEM)
	public void teleCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER TELE_CODE.POST-TEXT-ITEM
	 * G$_SEARCH.POST_TEXT_CODE; IF :SPRADDR.HOLD_TELE_CODE = :SPRADDR.TELE_CODE
	 * THEN NULL; ELSIF :SPRADDR.TELE_CODE IS NULL THEN
	 * :SPRADDR.TELE_DESCRIPTION := ''; ELSE :SPRADDR.CHANGE_PHONE := 'Y'; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "TELE_CODE", function = KeyFunction.ITEM_OUT)
	public void teleCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().postTextCode();
		if (spraddrElement.getHoldTeleCode().equals(
				spraddrElement.getTeleCode())) {
		} else if (spraddrElement.getTeleCode().isNull()) {
			spraddrElement.setTeleDescription(toStr(""));
		} else {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER TELE_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPRADDR.TELE_DESCRIPTION :=
	 * GB_STVTELE.F_GET_DESCRIPTION(:SPRADDR.TELE_CODE); IF
	 * :SPRADDR.TELE_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0114','FORM','*ERROR* Invalid code, press
	 * LIST for codes.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "TELE_CODE")
	public void teleCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getTeleCode().isNull())
			return;

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spraddrElement.setTeleDescription(GbStvtele
					.fGetDescription(spraddrElement.getTeleCode()));
			if (spraddrElement.getTeleDescription().isNull()) {
				errorMessage(GNls.Fget(toStr("GOQCLIB-0114"), toStr("FORM"),
						toStr("*ERROR* Invalid code, press LIST for codes.")));
				throw new ApplicationException();
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER TELE_CODE.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: TELE_CODE.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "TELE_CODE", function = KeyFunction.SAVE)
	public void teleCode_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "TELE_CODE_LBT")
	public void teleCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "TELE_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void teleDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_CTRY.WHEN-NEW-ITEM-INSTANCE
	 * NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_CTRY.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PHONE_CTRY", function = KeyFunction.ITEM_CHANGE)
	public void phoneCtry_itemChange() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_CTRY.POST-TEXT-ITEM IF
	 * :SPRADDR.HOLD_PHONE_CTRY IS NULL THEN IF :SPRADDR.PHONE_CTRY IS NULL THEN
	 * RETURN; END IF; END IF; -- IF (NVL(:SPRADDR.HOLD_PHONE_CTRY, '000') <>
	 * NVL(:SPRADDR.PHONE_CTRY, '000')) THEN :SPRADDR.CHANGE_PHONE := 'Y'; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_CTRY.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PHONE_CTRY", function = KeyFunction.ITEM_OUT)
	public void phoneCtry_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getHoldPhoneCtry().isNull()) {
			if (spraddrElement.getPhoneCtry().isNull()) {
				return;
			}
		}
		//
		if ((isNull(spraddrElement.getHoldPhoneCtry(), "000").notEquals(isNull(
				spraddrElement.getPhoneCtry(), "000")))) {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_CTRY.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_CTRY.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PHONE_CTRY", function = KeyFunction.SAVE)
	public void phoneCtry_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_CTRY.KEY-CQUERY
	 * EXECUTE_TRIGGER('SHOW_PHONES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_CTRY.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PHONE_CTRY", function = KeyFunction.COUNT_QUERY)
	public void phoneCtry_TotalResults() {

		executeAction("SHOW_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_AREA.WHEN-NEW-ITEM-INSTANCE
	 * NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_AREA.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PHONE_AREA", function = KeyFunction.ITEM_CHANGE)
	public void phoneArea_itemChange() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_AREA.POST-TEXT-ITEM IF
	 * :SPRADDR.HOLD_PHONE_AREA IS NULL THEN IF :SPRADDR.PHONE_AREA IS NULL THEN
	 * RETURN; END IF; END IF; -- IF (NVL(:SPRADDR.HOLD_PHONE_AREA, '000') <>
	 * NVL(:SPRADDR.PHONE_AREA, '000')) THEN :SPRADDR.CHANGE_PHONE := 'Y'; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_AREA.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PHONE_AREA", function = KeyFunction.ITEM_OUT)
	public void phoneArea_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getHoldPhoneArea().isNull()) {
			if (spraddrElement.getPhoneArea().isNull()) {
				return;
			}
		}
		//
		if ((isNull(spraddrElement.getHoldPhoneArea(), "000").notEquals(isNull(
				spraddrElement.getPhoneArea(), "000")))) {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_AREA.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_AREA.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PHONE_AREA", function = KeyFunction.SAVE)
	public void phoneArea_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_AREA.KEY-CQUERY
	 * EXECUTE_TRIGGER('SHOW_PHONES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_AREA.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PHONE_AREA", function = KeyFunction.COUNT_QUERY)
	public void phoneArea_TotalResults() {

		executeAction("SHOW_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_NUMBER.WHEN-NEW-ITEM-INSTANCE
	 * EXECUTE_TRIGGER('ENABLE_PHONE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_NUMBER.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PHONE_NUMBER", function = KeyFunction.ITEM_CHANGE)
	public void phoneNumber_itemChange() {

		executeAction("ENABLE_PHONE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_NUMBER.POST-TEXT-ITEM IF
	 * :SPRADDR.HOLD_PHONE_NUMBER IS NULL THEN IF :SPRADDR.PHONE_NUMBER IS NULL
	 * THEN RETURN; END IF; END IF; -- IF (NVL(:SPRADDR.HOLD_PHONE_NUMBER,
	 * '000') <> NVL(:SPRADDR.PHONE_NUMBER, '000')) THEN :SPRADDR.CHANGE_PHONE
	 * := 'Y'; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_NUMBER.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PHONE_NUMBER", function = KeyFunction.ITEM_OUT)
	public void phoneNumber_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getHoldPhoneNumber().isNull()) {
			if (spraddrElement.getPhoneNumber().isNull()) {
				return;
			}
		}
		//
		if ((isNull(spraddrElement.getHoldPhoneNumber(), "000")
				.notEquals(isNull(spraddrElement.getPhoneNumber(), "000")))) {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_NUMBER.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_NUMBER.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PHONE_NUMBER", function = KeyFunction.SAVE)
	public void phoneNumber_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_NUMBER.KEY-CQUERY
	 * EXECUTE_TRIGGER('SHOW_PHONES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_NUMBER.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PHONE_NUMBER", function = KeyFunction.COUNT_QUERY)
	public void phoneNumber_TotalResults() {

		executeAction("SHOW_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_EXT.WHEN-NEW-ITEM-INSTANCE
	 * EXECUTE_TRIGGER('ENABLE_PHONE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_EXT.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "PHONE_EXT", function = KeyFunction.ITEM_CHANGE)
	public void phoneExt_itemChange() {

		executeAction("ENABLE_PHONE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_EXT.POST-TEXT-ITEM IF
	 * (:SPRADDR.PHONE_NUMBER IS NULL AND :SPRADDR.PHONE_EXT IS NOT NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0115','FORM','*WARNING* Phone number must be
	 * entered if extension is entered.')); RAISE FORM_TRIGGER_FAILURE; END IF;
	 * -- IF :SPRADDR.HOLD_PHONE_EXT IS NULL THEN IF :SPRADDR.PHONE_EXT IS NULL
	 * THEN RETURN; END IF; END IF; -- IF (NVL(:SPRADDR.HOLD_PHONE_EXT, '000')
	 * <> NVL(:SPRADDR.PHONE_EXT, '000')) THEN :SPRADDR.CHANGE_PHONE := 'Y'; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_EXT.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "PHONE_EXT", function = KeyFunction.ITEM_OUT)
	public void phoneExt_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if ((spraddrElement.getPhoneNumber().isNull() && !spraddrElement
				.getPhoneExt().isNull())) {
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0115"),
							toStr("FORM"),
							toStr("*WARNING* Phone number must be entered if extension is entered.")));
			throw new ApplicationException();
		}
		//
		if (spraddrElement.getHoldPhoneExt().isNull()) {
			if (spraddrElement.getPhoneExt().isNull()) {
				return;
			}
		}
		//
		if ((isNull(spraddrElement.getHoldPhoneExt(), "000").notEquals(isNull(
				spraddrElement.getPhoneExt(), "000")))) {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_EXT.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: PHONE_EXT.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "PHONE_EXT", function = KeyFunction.SAVE)
	public void phoneExt_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_EXT.KEY-CQUERY
	 * EXECUTE_TRIGGER('SHOW_PHONES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: PHONE_EXT.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "PHONE_EXT", function = KeyFunction.COUNT_QUERY)
	public void phoneExt_TotalResults() {

		executeAction("SHOW_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "PHONE_BTN")
	public void phoneBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER PHONE_BTN.WHEN-BUTTON-PRESSED
	 * G$_CHECK_QUERY_MODE; IF :GLOBAL.QUERY_MODE = '1' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0116','FORM','*ERROR* Function not supported
	 * in Enter Query mode')); RETURN; ELSE :HOLD_BLOCK_FIELD :=
	 * :SYSTEM.CURSOR_ITEM; GO_ITEM('SPRADDR.PHONE_AREA');
	 * EXECUTE_TRIGGER('KEY-CQUERY'); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PHONE_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "PHONE_BTN")
	public void phoneBtn_buttonClick() {

		getContainer().getGoqrpls().gCheckQueryMode();
		if (getGlobal("QUERY_MODE").equals("1")) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0116"),
							toStr("FORM"),
							toStr("*ERROR* Function not supported in Enter Query mode")));
			return;
		} else {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("FORM_HEADER").setValue(
					"HOLD_BLOCK_FIELD", getCursorItem());
			goItem(toStr("SPRADDR.PHONE_AREA"));
			executeAction("KEY-CQUERY");
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FAX_CTRY.WHEN-NEW-ITEM-INSTANCE
	 * NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FAX_CTRY.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "FAX_CTRY", function = KeyFunction.ITEM_CHANGE)
	public void faxCtry_itemChange() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER FAX_CTRY.POST-TEXT-ITEM IF
	 * :SPRADDR.HOLD_PHONE_CTRY IS NULL THEN IF :SPRADDR.PHONE_CTRY IS NULL THEN
	 * RETURN; END IF; END IF; -- IF (NVL(:SPRADDR.HOLD_PHONE_CTRY, '000') <>
	 * NVL(:SPRADDR.PHONE_CTRY, '000')) THEN :SPRADDR.CHANGE_PHONE := 'Y'; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FAX_CTRY.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "FAX_CTRY", function = KeyFunction.ITEM_OUT)
	public void faxCtry_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);

		if (spraddrElement.getHoldPhoneCtry().isNull()) {
			if (spraddrElement.getPhoneCtry().isNull()) {
				return;
			}
		}
		//
		if ((isNull(spraddrElement.getHoldPhoneCtry(), "000").notEquals(isNull(
				spraddrElement.getPhoneCtry(), "000")))) {
			spraddrElement.setChangePhone(toStr("Y"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER FAX_CTRY.KEY-COMMIT
	 * EXECUTE_TRIGGER('PHONE_COMMIT'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FAX_CTRY.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", item = "FAX_CTRY", function = KeyFunction.SAVE)
	public void faxCtry_Save() {

		executeAction("PHONE_COMMIT");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FAX_CTRY.KEY-CQUERY
	 * EXECUTE_TRIGGER('SHOW_PHONES'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FAX_CTRY.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "FAX_CTRY", function = KeyFunction.COUNT_QUERY)
	public void faxCtry_TotalResults() {

		executeAction("SHOW_PHONES");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRADDR_ASRC_CODE")
	public void spraddrAsrcCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_ASRC_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrAsrcCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRADDR_ASRC_CODE")
	public void spraddrAsrcCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRADDR_ASRC_CODE")
	public void spraddrAsrcCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_ASRC_CODE", function = KeyFunction.ITEM_OUT)
	public void spraddrAsrcCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ASRC_CODE.KEY-NEXT-ITEM
	 * G$_SEARCH.CODE_KEY_NEXT_ITEM; NEXT_ITEM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_ASRC_CODE", function = KeyFunction.NEXT_ITEM)
	public void spraddrAsrcCode_keyNexItem() {

		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		nextItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRADDR_ASRC_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; IF (:GLOBAL.QUERY_MODE = '0') THEN IF
	 * GB_STVASRC.F_CODE_EXISTS(:SPRADDR.SPRADDR_ASRC_CODE) = 'N' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0117','FORM','*ERROR* Invalid code; press
	 * LIST for valid code.')); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRADDR_ASRC_CODE")
	public void spraddrAsrcCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		
		if(spraddrElement.getSpraddrAsrcCode().isNull())
			return;

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			if ((getGlobal("QUERY_MODE").equals("0"))) {
				if (GbStvasrc.fCodeExists(spraddrElement.getSpraddrAsrcCode())
						.equals("N")) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0117"),
									toStr("FORM"),
									toStr("*ERROR* Invalid code; press LIST for valid code.")));
					throw new ApplicationException();
				}
			}
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRADDR_ASRC_CODE_LBT")
	public void spraddrAsrcCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRADDR_DELIVERY_POINT.WHEN-NEW-ITEM-INSTANCE IF :GLOBAL.QUERY_MODE = '1'
	 * THEN GO_ITEM('SPRADDR.SPRADDR_ATYP_CODE'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_DELIVERY_POINT.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_DELIVERY_POINT", function = KeyFunction.ITEM_CHANGE)
	public void spraddrDeliveryPoint_itemChange() {

		if (getGlobal("QUERY_MODE").equals("1")) {
			goItem(toStr("SPRADDR.SPRADDR_ATYP_CODE"));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRADDR_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void spraddrActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRADDR_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spraddrActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRADDR_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void spraddrActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_FROM_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_FROM_DATE")
	public void spraddrFromDate_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrFromDate().isNull())
			this.spraddrFromDate_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_TO_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_TO_DATE")
	public void spraddrToDate_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrToDate().isNull())
			this.spraddrToDate_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ATYP_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_ATYP_CODE")
	public void spraddrAtypCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrAtypCode().isNull())
			this.spraddrAtypCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_STAT_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_STAT_CODE")
	public void spraddrStatCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrStatCode().isNull())
			this.spraddrStatCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_CNTY_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_CNTY_CODE")
	public void spraddrCntyCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrCntyCode().isNull())
			this.spraddrCntyCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_NATN_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_NATN_CODE")
	public void spraddrNatnCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrNatnCode().isNull())
			this.spraddrNatnCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * TELE_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "TELE_CODE")
	public void teleCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getTeleCode().isNull())
			this.teleCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRADDR_ASRC_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRADDR_ASRC_CODE")
	public void spraddrAsrcCode_validate() {

		SpraddrAdapter spraddrElement = (SpraddrAdapter) this.getFormModel()
				.getSpraddr().getRowAdapter(true);
		if (!spraddrElement.getSpraddrAsrcCode().isNull())
			this.spraddrAsrcCode_PostChange();

	}

	public void spraddrAtypCode_doubleClick() {
		spraddrAtypCode_WhenMouseDoubleclick();
		
	}

	public void spraddrStatCode_doubleClick() {
		spraddrStatCode_WhenMouseDoubleclick();
		
	}

	public void spraddrCntyCode_doubleClick() {
		spraddrCntyCode_WhenMouseDoubleclick();
		
	}

	public void spraddrNatnCode_doubleClick() {
		spraddrNatnCode_WhenMouseDoubleclick();
		
	}

	public void teleCode_doubleClick() {
		teleCode_WhenMouseDoubleclick();
		
	}

	public void spraddrAsrcCode_doubleClick() {
		spraddrAsrcCode_WhenMouseDoubleclick();
		
	}

}
