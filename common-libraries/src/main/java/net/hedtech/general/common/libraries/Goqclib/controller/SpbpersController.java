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
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class SpbpersController extends AbstractSupportCodeObject {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
//	}
	
	private GDateClass getGDateClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}
	
	private GCalendarBtnClass getGCalendarBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}
	
	private GCodeClass getGCodeClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}
	
	private GIconBtnClass getGIconBtnClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}
	
	private GDescClass getGDescClass(){
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}
	
	public SpbpersController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER SPBPERS.POST-QUERY
	 * EXECUTE_TRIGGER('EDIT_PERS_GENDER'); G$_CHECK_FAILURE; --
	 * :SPBPERS.HOLD_SEX := :SPBPERS.SPBPERS_SEX; :SPBPERS.HOLD_ETHN_CODE :=
	 * :SPBPERS.SPBPERS_ETHN_CODE; :SPBPERS.HOLD_LGCY_CODE :=
	 * :SPBPERS.SPBPERS_LGCY_CODE; :SPBPERS.HOLD_CITZ_CODE :=
	 * :SPBPERS.SPBPERS_CITZ_CODE; -- IF :SPBPERS.SPBPERS_SEX IS NULL THEN
	 * :SPBPERS.PERS_SEX := 'N'; ELSE :SPBPERS.PERS_SEX := :SPBPERS.SPBPERS_SEX;
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void spbpers_AfterQuery(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();
		try {
			spbpersElement.setLockDbValues(true);

			if (!spbpersElement.getSpbpersConfirmedReDate().isNull())
				this.spbpersConfirmedReDate_PostChange();
			if (!spbpersElement.getSpbpersEthnCode().isNull())
				this.spbpersEthnCode_PostChange();
			if (!spbpersElement.getSpbpersLgcyCode().isNull())
				this.spbpersLgcyCode_PostChange();
			if (!spbpersElement.getSpbpersRelgCode().isNull())
				this.spbpersRelgCode_PostChange();
			if (!spbpersElement.getSpbpersMrtlCode().isNull())
				this.spbpersMrtlCode_PostChange();
			if (!spbpersElement.getSpbpersCitzCode().isNull())
				this.spbpersCitzCode_PostChange();
			if (!spbpersElement.getSpbpersSsn().isNull())
				this.spbpersSsn_PostChange();
			if (!spbpersElement.getSpbpersBirthDate().isNull())
				this.spbpersBirthDate_PostChange();

		} finally {
			spbpersElement.setLockDbValues(false);
		}

		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		executeAction("EDIT_PERS_GENDER");
		getContainer().getGoqrpls().gCheckFailure();
		//
		spbpersElement.setHoldSex(spbpersElement.getSpbpersSex());
		spbpersElement.setHoldEthnCode(spbpersElement.getSpbpersEthnCode());
		spbpersElement.setHoldLgcyCode(spbpersElement.getSpbpersLgcyCode());
		spbpersElement.setHoldCitzCode(spbpersElement.getSpbpersCitzCode());
		//
		if (spbpersElement.getSpbpersSex().isNull()) {
			spbpersElement.setPersSex(toStr("N"));
		} else {
			spbpersElement.setPersSex(spbpersElement.getSpbpersSex());
		}
	}

	@BeforeQuery
	public void spbpers_BeforeQuery(QueryEvent args) {
		setBlockWhereClause("SPBPERS", toStr("(SPBPERS_PIDM=:PIDM)"));

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.PRE-INSERT
	 * :SPBPERS.SPBPERS_SEX := :SPBPERS.PERS_SEX; :SPBPERS.SPBPERS_USER_ID :=
	 * :GLOBAL.CURRENT_USER;
	 * 
	 * EXECUTE_TRIGGER('CHECK_DCSD_INFO'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('CHECK_ETHN_RACE_CONFIRMED_DATE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p>This trigger makes sure that a null record is not inserted into the
	 * database<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void spbpers_BeforeRowInsert(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		spbpersElement.setSpbpersSex(spbpersElement.getPersSex());
		spbpersElement.setSpbpersUserId(getGlobal("CURRENT_USER"));
		executeAction("CHECK_DCSD_INFO");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_ETHN_RACE_CONFIRMED_DATE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.ON-INSERT BEGIN
	 * GB_BIO.P_CREATE(p_PIDM =>:SPBPERS.SPBPERS_PIDM, p_SSN
	 * =>:SPBPERS.SPBPERS_SSN, p_BIRTH_DATE =>:SPBPERS.SPBPERS_BIRTH_DATE,
	 * p_LGCY_CODE =>:SPBPERS.SPBPERS_LGCY_CODE, p_ETHN_CODE
	 * =>:SPBPERS.SPBPERS_ETHN_CODE, p_MRTL_CODE =>:SPBPERS.SPBPERS_MRTL_CODE,
	 * p_RELG_CODE =>:SPBPERS.SPBPERS_RELG_CODE, p_SEX =>:SPBPERS.SPBPERS_SEX,
	 * p_CONFID_IND =>:SPBPERS.SPBPERS_CONFID_IND, p_DEAD_IND
	 * =>:SPBPERS.SPBPERS_DEAD_IND, p_VETC_FILE_NUMBER
	 * =>:SPBPERS.SPBPERS_VETC_FILE_NUMBER, p_LEGAL_NAME
	 * =>:SPBPERS.SPBPERS_LEGAL_NAME, p_PREF_FIRST_NAME
	 * =>:SPBPERS.SPBPERS_PREF_FIRST_NAME, p_NAME_PREFIX
	 * =>:SPBPERS.SPBPERS_NAME_PREFIX, p_NAME_SUFFIX
	 * =>:SPBPERS.SPBPERS_NAME_SUFFIX, p_VERA_IND =>:SPBPERS.SPBPERS_VERA_IND,
	 * p_DEAD_DATE =>:SPBPERS.SPBPERS_DEAD_DATE, p_CITZ_CODE
	 * =>:SPBPERS.SPBPERS_CITZ_CODE, p_ACTIVE_DUTY_SEPR_DATE
	 * =>:SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE, p_SDVET_IND
	 * =>:SPBPERS.SPBPERS_SDVET_IND, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_USER_ID =>:SPBPERS.SPBPERS_USER_ID, P_ETHN_CDE
	 * =>:SPBPERS.SPBPERS_ETHN_CDE, P_CONFIRMED_RE_CDE
	 * =>:SPBPERS.SPBPERS_CONFIRMED_RE_CDE, P_CONFIRMED_RE_DATE
	 * =>:SPBPERS.SPBPERS_CONFIRMED_RE_DATE, p_ARMED_SERV_MED_VET_IND
	 * =>:SPBPERS.SPBPERS_ARMED_SERV_MED_VET_IND, p_ROWID_OUT =>:SPBPERS.ROWID);
	 * 
	 * :SPBPERS.SPBPERS_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPBPERS.ROWID),'DDMONYYYYHH24MISS');
	 * 
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void spbpers_RowInsert(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbBio.pCreate(/* pPidm=> */spbpersElement.getSpbpersPidm(),
			/* pSsn=> */spbpersElement.getSpbpersSsn(),
			/* pBirthDate=> */spbpersElement.getSpbpersBirthDate(),
			/* pLgcyCode=> */spbpersElement.getSpbpersLgcyCode(),
			/* pEthnCode=> */spbpersElement.getSpbpersEthnCode(),
			/* pMrtlCode=> */spbpersElement.getSpbpersMrtlCode(),
			/* pRelgCode=> */spbpersElement.getSpbpersRelgCode(),
			/* pSex=> */spbpersElement.getSpbpersSex(),
			/* pConfidInd=> */spbpersElement.getSpbpersConfidInd(),
			/* pDeadInd=> */spbpersElement.getSpbpersDeadInd(),
			/* pVetcFileNumber=> */spbpersElement.getSpbpersVetcFileNumber(),
			/* pLegalName=> */spbpersElement.getSpbpersLegalName(),
			/* pPrefFirstName=> */spbpersElement.getSpbpersPrefFirstName(),
			/* pNamePrefix=> */spbpersElement.getSpbpersNamePrefix(),
			/* pNameSuffix=> */spbpersElement.getSpbpersNameSuffix(),
			/* pVeraInd=> */spbpersElement.getSpbpersVeraInd(),
			/* pDeadDate=> */spbpersElement.getSpbpersDeadDate(),
			/* pCitzCode=> */spbpersElement.getSpbpersCitzCode(),
			/* pActiveDutySeprDate=> */spbpersElement
					.getSpbpersActiveDutySeprDate(),
			/* pSdvetInd=> */spbpersElement.getSpbpersSdvetInd(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pUserId=> */spbpersElement.getSpbpersUserId(),
			/* pEthnCde=> */spbpersElement.getSpbpersEthnCde(),
			/* pConfirmedReCde=> */spbpersElement.getSpbpersConfirmedReCde(),
			/* pConfirmedReDate=> */spbpersElement.getSpbpersConfirmedReDate(),
			/* pArmedServMedVetInd=> */spbpersElement
					.getSpbpersArmedServMedVetInd(),
			/* pRowidOut=> */p_rowid_out_ref);

			spbpersElement.setROWID(p_rowid_out_ref.val);
			spbpersElement.setSpbpersActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spbpersElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.POST-INSERT
	 * EXECUTE_TRIGGER('CHECK_MATERIALS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.POST-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowInsert
	public void spbpers_AfterRowInsert(RowAdapterEvent args) {

		executeAction("CHECK_MATERIALS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.PRE-UPDATE
	 * :SPBPERS.SPBPERS_SEX := :SPBPERS.PERS_SEX; :SPBPERS.SPBPERS_USER_ID :=
	 * :GLOBAL.CURRENT_USER; -- EXECUTE_TRIGGER('CHECK_DCSD_INFO');
	 * G$_CHECK_FAILURE; -- EXECUTE_TRIGGER('CHECK_FOR_EMPLOYEE');
	 * G$_CHECK_FAILURE; -- EXECUTE_TRIGGER('CHECK_ETHN_RACE_CONFIRMED_DATE');
	 * G$_CHECK_FAILURE;
	 */
	/*
	 * <p>This trigger ensures that a null record is not added to the database.
	 * <b>Migration Comments</b> Generated from trigger: SPBPERS.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void spbpers_BeforeRowUpdate(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		spbpersElement.setSpbpersSex(spbpersElement.getPersSex());
		spbpersElement.setSpbpersUserId(getGlobal("CURRENT_USER"));
		//
		executeAction("CHECK_DCSD_INFO");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_FOR_EMPLOYEE");
		getContainer().getGoqrpls().gCheckFailure();
		//
		executeAction("CHECK_ETHN_RACE_CONFIRMED_DATE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.ON-UPDATE BEGIN
	 * GB_BIO.P_UPDATE(p_PIDM =>:SPBPERS.SPBPERS_PIDM, p_SSN
	 * =>:SPBPERS.SPBPERS_SSN, p_BIRTH_DATE =>:SPBPERS.SPBPERS_BIRTH_DATE,
	 * p_LGCY_CODE =>:SPBPERS.SPBPERS_LGCY_CODE, p_ETHN_CODE
	 * =>:SPBPERS.SPBPERS_ETHN_CODE, p_MRTL_CODE =>:SPBPERS.SPBPERS_MRTL_CODE,
	 * p_RELG_CODE =>:SPBPERS.SPBPERS_RELG_CODE, p_SEX =>:SPBPERS.SPBPERS_SEX,
	 * p_CONFID_IND =>:SPBPERS.SPBPERS_CONFID_IND, p_DEAD_IND
	 * =>:SPBPERS.SPBPERS_DEAD_IND, p_VETC_FILE_NUMBER
	 * =>:SPBPERS.SPBPERS_VETC_FILE_NUMBER, p_LEGAL_NAME
	 * =>:SPBPERS.SPBPERS_LEGAL_NAME, p_PREF_FIRST_NAME
	 * =>:SPBPERS.SPBPERS_PREF_FIRST_NAME, p_NAME_PREFIX
	 * =>:SPBPERS.SPBPERS_NAME_PREFIX, p_NAME_SUFFIX
	 * =>:SPBPERS.SPBPERS_NAME_SUFFIX, p_VERA_IND =>:SPBPERS.SPBPERS_VERA_IND,
	 * p_DEAD_DATE =>:SPBPERS.SPBPERS_DEAD_DATE, p_CITZ_CODE
	 * =>:SPBPERS.SPBPERS_CITZ_CODE, p_ACTIVE_DUTY_SEPR_DATE
	 * =>:SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE, p_SDVET_IND
	 * =>:SPBPERS.SPBPERS_SDVET_IND, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_USER_ID =>:SPBPERS.SPBPERS_USER_ID, P_ETHN_CDE
	 * =>:SPBPERS.SPBPERS_ETHN_CDE, P_CONFIRMED_RE_CDE
	 * =>:SPBPERS.SPBPERS_CONFIRMED_RE_CDE, P_CONFIRMED_RE_DATE
	 * =>:SPBPERS.SPBPERS_CONFIRMED_RE_DATE, p_ARMED_SERV_MED_VET_IND
	 * =>:SPBPERS.SPBPERS_ARMED_SERV_MED_VET_IND, p_ROWID =>:SPBPERS.ROWID);
	 * 
	 * :SPBPERS.SPBPERS_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPBPERS.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void spbpers_RowUpdate(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbBio.pUpdate(/* pPidm=> */spbpersElement.getSpbpersPidm(),
			/* pSsn=> */spbpersElement.getSpbpersSsn(),
			/* pBirthDate=> */spbpersElement.getSpbpersBirthDate(),
			/* pLgcyCode=> */spbpersElement.getSpbpersLgcyCode(),
			/* pEthnCode=> */spbpersElement.getSpbpersEthnCode(),
			/* pMrtlCode=> */spbpersElement.getSpbpersMrtlCode(),
			/* pRelgCode=> */spbpersElement.getSpbpersRelgCode(),
			/* pSex=> */spbpersElement.getSpbpersSex(),
			/* pConfidInd=> */spbpersElement.getSpbpersConfidInd(),
			/* pDeadInd=> */spbpersElement.getSpbpersDeadInd(),
			/* pVetcFileNumber=> */spbpersElement.getSpbpersVetcFileNumber(),
			/* pLegalName=> */spbpersElement.getSpbpersLegalName(),
			/* pPrefFirstName=> */spbpersElement.getSpbpersPrefFirstName(),
			/* pNamePrefix=> */spbpersElement.getSpbpersNamePrefix(),
			/* pNameSuffix=> */spbpersElement.getSpbpersNameSuffix(),
			/* pVeraInd=> */spbpersElement.getSpbpersVeraInd(),
			/* pDeadDate=> */spbpersElement.getSpbpersDeadDate(),
			/* pCitzCode=> */spbpersElement.getSpbpersCitzCode(),
			/* pActiveDutySeprDate=> */spbpersElement
					.getSpbpersActiveDutySeprDate(),
			/* pSdvetInd=> */spbpersElement.getSpbpersSdvetInd(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pUserId=> */spbpersElement.getSpbpersUserId(),
			/* pEthnCde=> */spbpersElement.getSpbpersEthnCde(),
			/* pConfirmedReCde=> */spbpersElement.getSpbpersConfirmedReCde(),
			/* pConfirmedReDate=> */spbpersElement.getSpbpersConfirmedReDate(),
			/* pArmedServMedVetInd=> */spbpersElement
					.getSpbpersArmedServMedVetInd(),
			/* pRowid=> */spbpersElement.getROWID());
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spbpersElement.setSpbpersActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spbpersElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.POST-UPDATE
	 * EXECUTE_TRIGGER('CHECK_MATERIALS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.POST-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowUpdate
	public void spbpers_AfterRowUpdate(RowAdapterEvent args) {

		executeAction("CHECK_MATERIALS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.PRE-DELETE DECLARE cursora
	 * INTEGER; ignore_value NUMBER(1); lv_col_err NUMBER; lv_col_len NUMBER;
	 * lv_dummy VARCHAR2(1); lv_sql_stmt VARCHAR2(2000); ret_code INTEGER; BEGIN
	 * -- -- If Financial Aid is installed, check if this person is in the
	 * FinAid system. If they -- exist there, raise error since they cannot be
	 * deleted. -- IF :GLOBAL.RESSYS = 'Y' THEN lv_sql_stmt := 'SELECT ' || ''''
	 * || 'X' || '''' || ' FROM RORSTAT WHERE RORSTAT_PIDM = ' ||
	 * :SPBPERS.SPBPERS_PIDM || ' AND ROWNUM = 1'; --
	 * GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,lv_dummy); -- IF lv_dummy IS NOT NULL
	 * THEN MESSAGE(G$_NLS.Get('GOQCLIB-0129','FORM','*ERROR* Cannot delete this
	 * record because data for this person exists in the Financial Aid
	 * system.')); RAISE FORM_TRIGGER_FAILURE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.PRE-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowDelete
	public void spbpers_BeforeRowDelete(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		{
			NInteger cursora = NInteger.getNull();
			NNumber ignoreValue = NNumber.getNull();
			NNumber lvColErr = NNumber.getNull();
			NNumber lvColLen = NNumber.getNull();
			NString lvDummy = NString.getNull();
			NString lvSqlStmt = NString.getNull();
			NInteger retCode = NInteger.getNull();
			//
			// If Financial Aid is installed, check if this person is in the
			// FinAid system. If they
			// exist there, raise error since they cannot be deleted.
			//
			if (getGlobal("RESSYS").equals("Y")) {
				lvSqlStmt = toStr("SELECT ").append("'").append("X")
						.append("'")
						.append(" FROM RORSTAT WHERE RORSTAT_PIDM = ")
						.append(spbpersElement.getSpbpersPidm())
						.append(" AND ROWNUM = 1");
				//
				Ref<NString> p_return_value1_ref = new Ref<NString>(lvDummy);
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
				lvDummy = p_return_value1_ref.val;
				//
				if (!lvDummy.isNull()) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0129"),
									toStr("FORM"),
									toStr("*ERROR* Cannot delete this record because data for this person exists in the Financial Aid system.")));
					throw new ApplicationException();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.ON-DELETE BEGIN
	 * GB_BIO.P_DELETE(p_PIDM =>:SPBPERS.SPBPERS_PIDM, p_ROWID
	 * =>:SPBPERS.ROWID); EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void spbpers_RowDelete(RowAdapterEvent args) {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbBio.pDelete(/* pPidm=> */spbpersElement.getSpbpersPidm(), /* pRowid=> */
					spbpersElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-CREREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void spbpers_CreateRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-ENTQRY
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void spbpers_Search() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-NXTBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN IF
	 * GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); ELSE GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0130','FORM','Biographic or Race information
	 * changed, press SAVE before leaving current window.')); END IF; ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void spbpers_NextBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			if (getItemEnabled("GORPRAC_RACE_CDE").equals("TRUE")) {
				executeAction("KEY_NXTBLOCK_TRG");
			} else {
				goItem(toStr(getCursorItem()));
				warningMessage(GNls
						.Fget(toStr("GOQCLIB-0130"),
								toStr("FORM"),
								toStr("Biographic or Race information changed, press SAVE before leaving current window.")));
			}
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-NXTREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void spbpers_NextRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-NXTSET
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void spbpers_KeyNxtset() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-PRVBLK IF
	 * :SYSTEM.FORM_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0131','FORM','Biographic or Race information
	 * changed, press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void spbpers_PreviousBlock() {

		if (getTaskStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0131"),
							toStr("FORM"),
							toStr("Biographic or Race information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.KEY-PRVREC
	 * G$_INVALID_FUNCTION_MSG;
	 */
	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void spbpers_PreviousRecord() {

		getContainer().getGoqrpls().gInvalidFunctionMsg();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.CHECK_FOR_EMPLOYEE NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.CHECK_FOR_EMPLOYEE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_FOR_EMPLOYEE")
	public void spbpers_CheckForEmployee() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.CHECK_DCSD_INFO
	 * <multilinecomment> Forms that require edits between the deceased
	 * indicator and deceased dates can place their edits here
	 * </multilinecomment> NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.CHECK_DCSD_INFO
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_DCSD_INFO")
	public void spbpers_CheckDcsdInfo() {

		// Forms that require edits between the deceased indicator and deceased
		// dates can place their edits here
		// Forms that require edits between the deceased indicator and deceased
		// dates can place their edits here
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS.CHECK_ETHN_RACE_CONFIRMED_DATE IF
	 * :spbpers.spbpers_confirmed_re_cde = 'Y' THEN -- Ethnicity and Race
	 * Confirmed field is checked. IF :spbpers.spbpers_confirmed_re_date IS NULL
	 * THEN -- default the confirmed date with sysdate.
	 * :spbpers.spbpers_confirmed_re_date:= sysdate; END IF; ELSE IF
	 * :spbpers.spbpers_confirmed_re_date IS NOT NULL THEN -- Ethnicity and Race
	 * Confirmed field is unchecked, clear the date.
	 * :spbpers.spbpers_confirmed_re_date := NULL; END IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.CHECK_ETHN_RACE_CONFIRMED_DATE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ETHN_RACE_CONFIRMED_DATE")
	public void spbpers_CheckEthnRaceConfirmedDate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (spbpersElement.getSpbpersConfirmedReCde().equals("Y")) {
			// Ethnicity and Race Confirmed field is checked.
			if (spbpersElement.getSpbpersConfirmedReDate().isNull()) {
				// default the confirmed date with sysdate.
				spbpersElement.setSpbpersConfirmedReDate(NDate.getNow());
			}
		} else {
			if (!spbpersElement.getSpbpersConfirmedReDate().isNull()) {
				// Ethnicity and Race Confirmed field is unchecked, clear the
				// date.
				spbpersElement.setSpbpersConfirmedReDate(toDate(null));
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.CHECK_MATERIALS
	 * <multilinecomment> Placeholder for Student trigger </multilinecomment>
	 * NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.CHECK_MATERIALS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_MATERIALS")
	public void spbpers_CheckMaterials() {

		// Placeholder for Student trigger
		// Placeholder for Student trigger
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.CHECK_SSN NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPBPERS.CHECK_SSN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_SSN")
	public void spbpers_CheckSsn() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.CONVERT_ETHN_CODE IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN G$_CONVERT_ETHNICITY_CODE(p_pidm =>
	 * :spbpers.spbpers_pidm, p_ethn_code => :spbpers.spbpers_ethn_code,
	 * p_ethn_cde => :spbpers.spbpers_ethn_cde); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.CONVERT_ETHN_CODE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CONVERT_ETHN_CODE")
	public void spbpers_ConvertEthnCode() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (getBlockStatus().equals("CHANGED")) {
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<NString> pEthnCde_ref = new Ref<NString>(
					spbpersElement.getSpbpersEthnCde());
			getContainer().getGoqrpls().gConvertEthnicityCode(
					/* pPidm=> */spbpersElement.getSpbpersPidm(), /* pEthnCode=> */
					spbpersElement.getSpbpersEthnCode(), pEthnCde_ref);
			spbpersElement.setSpbpersEthnCde(pEthnCde_ref.val);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.EDIT_COBRA_ELIGIBILITY
	 * NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.EDIT_COBRA_ELIGIBILITY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_COBRA_ELIGIBILITY")
	public void spbpers_EditCobraEligibility() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.EDIT_BIRTH_DATE NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.EDIT_BIRTH_DATE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_BIRTH_DATE")
	public void spbpers_EditBirthDate() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.EDIT_PERS_AGE
	 * :SPBPERS.PERS_AGE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.EDIT_PERS_AGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_PERS_AGE")
	public void spbpers_EditPersAge() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		spbpersElement.setPersAge(toNumber(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS.EDIT_PERS_GENDER NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS.EDIT_PERS_GENDER
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "EDIT_PERS_GENDER")
	public void spbpers_EditPersGender() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER PERS_SEX.WHEN-RADIO-CHANGED
	 * :SPBPERS.SPBPERS_SEX := :SPBPERS.PERS_SEX;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_SEX.WHEN-RADIO-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-RADIO-CHANGED", item = "PERS_SEX")
	public void persSex_radioGroupChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		spbpersElement.setSpbpersSex(spbpersElement.getPersSex());
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_BIRTH_DATE", function = KeyFunction.NEXT_ITEM)
	public void spbpersBirthDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_BIRTH_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersBirthDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_BIRTH_DATE", function = KeyFunction.ITEM_OUT)
	public void spbpersBirthDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_BIRTH_DATE.POST-CHANGE
	 * DECLARE TEMP_AGE NUMBER; BEGIN G$_DATE_REFORMAT ('','');
	 * G$_CHECK_FAILURE; -- IF :SPBPERS.SPBPERS_BIRTH_DATE > SYSDATE THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0132','FORM','*ERROR* Future birth date not
	 * permitted.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * EXECUTE_TRIGGER('EDIT_BIRTH_DATE'); G$_CHECK_FAILURE; -- IF
	 * :SPBPERS_DEAD_IND IS NOT NULL AND :SPBPERS_DEAD_DATE IS NULL THEN
	 * :SPBPERS.PERS_AGE := ''; ELSE TEMP_AGE :=
	 * FLOOR(MONTHS_BETWEEN(NVL(:SPBPERS.SPBPERS_DEAD_DATE,SYSDATE),
	 * :SPBPERS.SPBPERS_BIRTH_DATE) / 12); IF NVL(LENGTH(TO_CHAR(TEMP_AGE)), 0)
	 * > 3 THEN MESSAGE(G$_NLS.Get('GOQCLIB-0133','FORM','*ERROR* Age is too big
	 * for field. Please check Birth date.')); RAISE FORM_TRIGGER_FAILURE; ELSE
	 * :SPBPERS.PERS_AGE := TEMP_AGE; END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_BIRTH_DATE")
	public void spbpersBirthDate_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersBirthDate().isNull())
			return;

		{
			NNumber tempAge = NNumber.getNull();

			getContainer().getGoqrpls().gCheckFailure();
			//
			if (spbpersElement.getSpbpersBirthDate().greater(NDate.getNow())) {
				errorMessage(GNls.Fget(toStr("GOQCLIB-0132"), toStr("FORM"),
						toStr("*ERROR* Future birth date not permitted.")));
				throw new ApplicationException();
			}
			//
			executeAction("EDIT_BIRTH_DATE");
			getContainer().getGoqrpls().gCheckFailure();
			//
			if (!spbpersElement.getSpbpersDeadInd().isNull()
					&& spbpersElement.getSpbpersDeadDate().isNull()) {
				spbpersElement.setPersAge(toNumber(""));
			} else {
				tempAge = floor(toInt(
						monthsBetween(isNull(spbpersElement.getSpbpersDeadDate(),
								NDate.getNow()),
								spbpersElement.getSpbpersBirthDate()
								)).divide(toInt(12)));
				if (isNull(length(toChar(tempAge)), 0).greater(3)) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0133"),
									toStr("FORM"),
									toStr("*ERROR* Age is too big for field. Please check Birth date.")));
					throw new ApplicationException();
				} else {
					spbpersElement.setPersAge(tempAge);
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_BIRTH_DATE.WHEN-VALIDATE-ITEM BEGIN IF
	 * :SPBPERS.SPBPERS_BIRTH_DATE IS NULL THEN :SPBPERS.PERS_AGE := ''; END IF;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_BIRTH_DATE")
	public void spbpersBirthDate_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersBirthDate().isNull())
			this.spbpersBirthDate_PostChange();

		if (spbpersElement.getSpbpersBirthDate().isNull()) {
			spbpersElement.setPersAge(toNumber(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_BIRTH_DATE_DBT")
	public void spbpersBirthDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_BIRTH_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPBPERS_BIRTH_DATE_DBT")
	public void spbpersBirthDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_SSN.POST-CHANGE DECLARE
	 * btn_pressed PLS_INTEGER; pii_active VARCHAR2(1) := 'N'; pti_into_temp
	 * VARCHAR2(1); lv_error_msg VARCHAR2(200); -- CURSOR PTI_CURSOR IS SELECT
	 * 'X' FROM SPBPERS WHERE SPBPERS_SSN = :SPBPERS.SPBPERS_SSN AND
	 * SPBPERS_PIDM <> :SPBPERS.SPBPERS_PIDM; BEGIN G$_CHECK_QUERY_MODE; -- IF
	 * (:GLOBAL.QUERY_MODE = '1') THEN :GLOBAL.QUERY_MODE := '0'; RETURN; END
	 * IF; -- -- -- -- lv_error_msg :=
	 * G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.TRIGGER_ITEM); IF lv_error_msg IS NOT
	 * NULL THEN MESSAGE(lv_error_msg); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * -- -- -- -- -- Turn off PII, verify it's unique, if not, give warning. --
	 * pii_active := gokfgac.f_spriden_pii_active; IF pii_active = 'Y' THEN
	 * gokfgac.p_turn_fgac_off; END IF; -- OPEN PTI_CURSOR; FETCH PTI_CURSOR
	 * INTO pti_into_temp; IF PTI_CURSOR%FOUND THEN IF G$_GET_UPRF_DUP_SSN_ALERT
	 * = 'Y' THEN btn_pressed := G$_DISPLAY_ALERT('G$_WARNING_ALERT',
	 * G$_NLS.Get('GOQCLIB-0134','FORM','*WARNING* SSN/SIN/TIN already assigned
	 * to another record.')); END IF; END IF; CLOSE PTI_CURSOR; -- -- Turn PII
	 * back on if active. -- IF pii_active = 'Y' THEN gokfgac.p_turn_fgac_on;
	 * END IF; -- DEFAULT_VALUE('U','GLOBAL.LOCATION_IND'); IF
	 * :GLOBAL.LOCATION_IND = 'C' AND :SPBPERS.SPBPERS_SSN IS NOT NULL THEN
	 * EXECUTE_TRIGGER('CHECK_SSN'); G$_CHECK_FAILURE; END IF; -- EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN -- -- Turn PII back on if active. -- IF
	 * pii_active = 'Y' THEN gokfgac.p_turn_fgac_on; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_SSN.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_SSN")
	public void spbpersSsn_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		int rowCount = 0;
		{
			NInteger btnPressed = NInteger.getNull();
			NString piiActive = toStr("N");
			NString ptiIntoTemp = NString.getNull();
			NString lvErrorMsg = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPBPERS "
					+ " WHERE SPBPERS_SSN = :SPBPERS_SPBPERS_SSN AND SPBPERS_PIDM <> :SPBPERS_SPBPERS_PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
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
					//
					// Turn off PII, verify it's unique, if not, give warning.
					//
					piiActive = Gokfgac.fSpridenPiiActive();
					if (piiActive.equals("Y")) {
						Gokfgac.pTurnFgacOff();
					}
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_SPBPERS_SSN",
							spbpersElement.getSpbpersSsn());
					ptiCursor.addParameter("SPBPERS_SPBPERS_PIDM",
							spbpersElement.getSpbpersPidm());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
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
													toStr("GOQCLIB-0134"),
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
					setDefaultValue("U", "GLOBAL.LOCATION_IND");
					if (getGlobal("LOCATION_IND").equals("C")
							&& !spbpersElement.getSpbpersSsn().isNull()) {
						executeAction("CHECK_SSN");
						getContainer().getGoqrpls().gCheckFailure();
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
	 * Original PL/SQL code code for TRIGGER SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
	 * G$_SSN_SET_ITEM_HINT(:SYSTEM.CURSOR_ITEM);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_SSN", function = KeyFunction.ITEM_CHANGE)
	public void spbpersSsn_itemChange() {

		getContainer().getGoqrpls().gSsnSetItemHint(toStr(getCursorItem()));
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_DEAD_IND.WHEN-CHECKBOX-CHANGED IF :SPBPERS.SPBPERS_DEAD_IND IS
	 * NULL AND :SPBPERS.SPBPERS_DEAD_DATE IS NOT NULL THEN
	 * :SPBPERS.SPBPERS_DEAD_DATE := ''; :SPBPERS.PERS_AGE :=
	 * FLOOR(MONTHS_BETWEEN(SYSDATE, :SPBPERS.SPBPERS_BIRTH_DATE) / 12); END IF;
	 * -- EXECUTE_TRIGGER('EDIT_COBRA_ELIGIBILITY'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "SPBPERS_DEAD_IND")
	public void spbpersDeadInd_checkBoxChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (spbpersElement.getSpbpersDeadInd().isNull()
				&& !spbpersElement.getSpbpersDeadDate().isNull()) {
			spbpersElement.setSpbpersDeadDate(toDate(""));
			spbpersElement.setPersAge(floor(toInt(
					monthsBetween(NDate.getNow(),
							spbpersElement.getSpbpersBirthDate())).divide(12)));
		}
		//
		executeAction("EDIT_COBRA_ELIGIBILITY");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_DEAD_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersDeadDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_DEAD_DATE", function = KeyFunction.ITEM_OUT)
	public void spbpersDeadDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM DECLARE TEMP_AGE NUMBER; BEGIN
	 * G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE; -- IF
	 * :SPBPERS.SPBPERS_DEAD_DATE > SYSDATE THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0135','FORM','*ERROR* Deceased Date must be
	 * before or on the Current Date.')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * IF :SPBPERS.SPBPERS_BIRTH_DATE IS NOT NULL AND :SPBPERS.SPBPERS_DEAD_DATE
	 * < :SPBPERS.SPBPERS_BIRTH_DATE THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0136','FORM','*ERROR* Deceased Date must be
	 * on or after the Birth Date.')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * :SPBPERS.SPBPERS_DEAD_DATE IS NOT NULL THEN :SPBPERS.SPBPERS_DEAD_IND :=
	 * 'Y'; -- TEMP_AGE :=
	 * FLOOR(MONTHS_BETWEEN(NVL(:SPBPERS.SPBPERS_DEAD_DATE,SYSDATE),
	 * :SPBPERS.SPBPERS_BIRTH_DATE) / 12); IF NVL(LENGTH(TO_CHAR(TEMP_AGE)), 0)
	 * > 3 THEN MESSAGE(G$_NLS.Get('GOQCLIB-0137','FORM','*ERROR* Age is too big
	 * for field. Please check Deceased date.')); RAISE FORM_TRIGGER_FAILURE;
	 * ELSE :SPBPERS.PERS_AGE := TEMP_AGE; END IF; -- ELSIF
	 * :SPBPERS.SPBPERS_DEAD_DATE IS NULL AND :SPBPERS.SPBPERS_DEAD_IND IS NOT
	 * NULL THEN EXECUTE_TRIGGER('EDIT_PERS_AGE'); G$_CHECK_FAILURE;
	 * :SPBPERS.SPBPERS_DEAD_IND := ''; :SPBPERS.PERS_AGE :=
	 * FLOOR(MONTHS_BETWEEN(SYSDATE, :SPBPERS.SPBPERS_BIRTH_DATE) / 12); END IF;
	 * -- IF (:GLOBAL.QUERY_MODE <> '1') THEN
	 * EXECUTE_TRIGGER('EDIT_COBRA_ELIGIBILITY'); G$_CHECK_FAILURE; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_DEAD_DATE")
	public void spbpersDeadDate_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		{
			NNumber tempAge = NNumber.getNull();

			getContainer().getGoqrpls().gCheckFailure();
			//
			if (spbpersElement.getSpbpersDeadDate().greater(NDate.getNow())) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0135"),
								toStr("FORM"),
								toStr("*ERROR* Deceased Date must be before or on the Current Date.")));
				throw new ApplicationException();
			}
			//
			if (!spbpersElement.getSpbpersBirthDate().isNull()
					&& spbpersElement.getSpbpersDeadDate().lesser(
							spbpersElement.getSpbpersBirthDate())) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0136"),
								toStr("FORM"),
								toStr("*ERROR* Deceased Date must be on or after the Birth Date.")));
				throw new ApplicationException();
			}
			//
			if (!spbpersElement.getSpbpersDeadDate().isNull()) {
				spbpersElement.setSpbpersDeadInd(toStr("Y"));
				//
				tempAge = floor(toInt(
						monthsBetween(
								isNull(spbpersElement.getSpbpersDeadDate(),
										NDate.getNow()), spbpersElement
										.getSpbpersBirthDate())).divide(12));
				if (isNull(length(toChar(tempAge)), 0).greater(3)) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0137"),
									toStr("FORM"),
									toStr("*ERROR* Age is too big for field. Please check Deceased date.")));
					throw new ApplicationException();
				} else {
					spbpersElement.setPersAge(tempAge);
				}
			} else if (spbpersElement.getSpbpersDeadDate().isNull()
					&& !spbpersElement.getSpbpersDeadInd().isNull()) {
				executeAction("EDIT_PERS_AGE");
				getContainer().getGoqrpls().gCheckFailure();
				spbpersElement.setSpbpersDeadInd(toStr(""));
				spbpersElement.setPersAge(floor(toInt(
						monthsBetween(NDate.getNow(),
								spbpersElement.getSpbpersBirthDate())).divide(
						12)));
			}
			//
			if ((getGlobal("QUERY_MODE").notEquals("1"))) {
				executeAction("EDIT_COBRA_ELIGIBILITY");
				getContainer().getGoqrpls().gCheckFailure();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_DEAD_DATE.KEY-NEXT-ITEM
	 * G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE; NEXT_FIELD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_DEAD_DATE", function = KeyFunction.NEXT_ITEM)
	public void spbpersDeadDate_keyNexItem() {

		getContainer().getGoqrpls().gCheckFailure();
		nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_DEAD_DATE_DBT")
	public void spbpersDeadDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_DEAD_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPBPERS_DEAD_DATE_DBT")
	public void spbpersDeadDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPBPERS_CITZ_CODE")
	public void spbpersCitzCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_CITZ_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersCitzCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPBPERS_CITZ_CODE")
	public void spbpersCitzCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPBPERS_CITZ_CODE")
	public void spbpersCitzCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_CITZ_CODE", function = KeyFunction.NEXT_ITEM)
	public void spbpersCitzCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_CITZ_CODE", function = KeyFunction.ITEM_OUT)
	public void spbpersCitzCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_CITZ_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR IS SELECT STVCITZ_DESC FROM STVCITZ WHERE
	 * STVCITZ_CODE = :SPBPERS.SPBPERS_CITZ_CODE; BEGIN G$_CHECK_QUERY_MODE; --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO :SPBPERS.CITZ_DESC; IF
	 * PTI_CURSOR%NOTFOUND THEN MESSAGE( G$_NLS.Get('GOQCLIB-0138',
	 * 'FORM','*ERROR* Invalid citizenship type; press LIST for valid code.') );
	 * CLOSE PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR;
	 * -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_CITZ_CODE")
	public void spbpersCitzCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersCitzCode().isNotNull()){

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVCITZ_DESC " + " FROM STVCITZ "
					+ " WHERE STVCITZ_CODE = :SPBPERS_SPBPERS_CITZ_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_SPBPERS_CITZ_CODE",
							spbpersElement.getSpbpersCitzCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						spbpersElement.setCitzDesc(ptiCursorResults.getStr(0));
					}
					if (ptiCursor.notFound()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0138"),
										toStr("FORM"),
										toStr("*ERROR* Invalid citizenship type; press LIST for valid code.")));
						ptiCursor.close();
						throw new ApplicationException();
					}
					ptiCursor.close();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_CITZ_CODE.WHEN-VALIDATE-ITEM BEGIN IF :SPBPERS.SPBPERS_CITZ_CODE
	 * IS NULL THEN :SPBPERS.CITZ_DESC := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_CITZ_CODE")
	public void spbpersCitzCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersCitzCode().isNull())
			this.spbpersCitzCode_PostChange();

		if (spbpersElement.getSpbpersCitzCode().isNull()) {
			spbpersElement.setCitzDesc(toStr(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CITZ_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_CITZ_CODE_LBT")
	public void spbpersCitzCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * CITZ_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "CITZ_DESC", function = KeyFunction.ITEM_CHANGE)
	public void citzDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPBPERS_MRTL_CODE")
	public void spbpersMrtlCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_MRTL_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersMrtlCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPBPERS_MRTL_CODE")
	public void spbpersMrtlCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPBPERS_MRTL_CODE")
	public void spbpersMrtlCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_MRTL_CODE", function = KeyFunction.NEXT_ITEM)
	public void spbpersMrtlCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_MRTL_CODE", function = KeyFunction.ITEM_OUT)
	public void spbpersMrtlCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_MRTL_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR IS SELECT STVMRTL_DESC FROM STVMRTL WHERE
	 * STVMRTL_CODE = :SPBPERS.SPBPERS_MRTL_CODE; BEGIN G$_CHECK_QUERY_MODE; --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO :SPBPERS.MRTL_DESCRIPTION; IF
	 * PTI_CURSOR%NOTFOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0139','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); CLOSE PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE;
	 * END IF; CLOSE PTI_CURSOR; -- EXECUTE_TRIGGER('EDIT_COBRA_ELIGIBILITY');
	 * G$_CHECK_FAILURE; -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_MRTL_CODE")
	public void spbpersMrtlCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersMrtlCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVMRTL_DESC " + " FROM STVMRTL "
					+ " WHERE STVMRTL_CODE = :SPBPERS_SPBPERS_MRTL_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_SPBPERS_MRTL_CODE",
							spbpersElement.getSpbpersMrtlCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						spbpersElement.setMrtlDescription(ptiCursorResults
								.getStr(0));
					}
					if (ptiCursor.notFound()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0139"),
										toStr("FORM"),
										toStr("*ERROR* Invalid code; press LIST for valid codes")));
						ptiCursor.close();
						throw new ApplicationException();
					}
					ptiCursor.close();
					//
					executeAction("EDIT_COBRA_ELIGIBILITY");
					getContainer().getGoqrpls().gCheckFailure();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_MRTL_CODE.WHEN-VALIDATE-ITEM BEGIN IF :SPBPERS.SPBPERS_MRTL_CODE
	 * IS NULL THEN :SPBPERS.MRTL_DESCRIPTION := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_MRTL_CODE")
	public void spbpersMrtlCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersMrtlCode().isNull())
			this.spbpersMrtlCode_PostChange();

		if (spbpersElement.getSpbpersMrtlCode().isNull()) {
			spbpersElement.setMrtlDescription(toStr(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_MRTL_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_MRTL_CODE_LBT")
	public void spbpersMrtlCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * MRTL_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "MRTL_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void mrtlDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPBPERS_RELG_CODE")
	public void spbpersRelgCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_RELG_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersRelgCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPBPERS_RELG_CODE")
	public void spbpersRelgCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPBPERS_RELG_CODE")
	public void spbpersRelgCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_RELG_CODE", function = KeyFunction.NEXT_ITEM)
	public void spbpersRelgCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_RELG_CODE", function = KeyFunction.ITEM_OUT)
	public void spbpersRelgCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_RELG_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR IS SELECT STVRELG_DESC FROM STVRELG WHERE
	 * STVRELG_CODE = :SPBPERS.SPBPERS_RELG_CODE; BEGIN G$_CHECK_QUERY_MODE; --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO :SPBPERS.RELG_DESCRIPTION; IF
	 * PTI_CURSOR%NOTFOUND THEN MESSAGE( G$_NLS.Get('GOQCLIB-0140',
	 * 'FORM','*ERROR* Invalid code; press LIST for valid codes') ); CLOSE
	 * PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_RELG_CODE")
	public void spbpersRelgCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersRelgCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVRELG_DESC " + " FROM STVRELG "
					+ " WHERE STVRELG_CODE = :SPBPERS_SPBPERS_RELG_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_SPBPERS_RELG_CODE",
							spbpersElement.getSpbpersRelgCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						spbpersElement.setRelgDescription(ptiCursorResults
								.getStr(0));
					}
					if (ptiCursor.notFound()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0140"),
										toStr("FORM"),
										toStr("*ERROR* Invalid code; press LIST for valid codes")));
						ptiCursor.close();
						throw new ApplicationException();
					}
					ptiCursor.close();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_RELG_CODE.WHEN-VALIDATE-ITEM BEGIN IF :SPBPERS.SPBPERS_RELG_CODE
	 * IS NULL THEN :SPBPERS.RELG_DESCRIPTION := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_RELG_CODE")
	public void spbpersRelgCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersRelgCode().isNull())
			this.spbpersRelgCode_PostChange();

		if (spbpersElement.getSpbpersRelgCode().isNull()) {
			spbpersElement.setRelgDescription(toStr(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_RELG_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_RELG_CODE_LBT")
	public void spbpersRelgCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * RELG_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "RELG_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void relgDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPBPERS_LGCY_CODE")
	public void spbpersLgcyCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_LGCY_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersLgcyCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPBPERS_LGCY_CODE")
	public void spbpersLgcyCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPBPERS_LGCY_CODE")
	public void spbpersLgcyCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_LGCY_CODE", function = KeyFunction.NEXT_ITEM)
	public void spbpersLgcyCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_LGCY_CODE", function = KeyFunction.ITEM_OUT)
	public void spbpersLgcyCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_LGCY_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR IS SELECT STVLGCY_DESC FROM STVLGCY WHERE
	 * STVLGCY_CODE = :SPBPERS_LGCY_CODE; BEGIN G$_CHECK_QUERY_MODE; -- OPEN
	 * PTI_CURSOR; FETCH PTI_CURSOR INTO :SPBPERS.LGCY_DESCRIPTION; IF
	 * PTI_CURSOR%NOTFOUND THEN MESSAGE( G$_NLS.Get('GOQCLIB-0141',
	 * 'FORM','*ERROR* Invalid code; press LIST for valid codes') ); CLOSE
	 * PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE; END IF; -- :GLOBAL.QUERY_MODE :=
	 * '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0';
	 * RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_LGCY_CODE")
	public void spbpersLgcyCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersLgcyCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVLGCY_DESC " + " FROM STVLGCY "
					+ " WHERE STVLGCY_CODE = :SPBPERS_LGCY_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_LGCY_CODE",
							spbpersElement.getSpbpersLgcyCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						spbpersElement.setLgcyDescription(ptiCursorResults
								.getStr(0));
					}
					if (ptiCursor.notFound()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0141"),
										toStr("FORM"),
										toStr("*ERROR* Invalid code; press LIST for valid codes")));
						ptiCursor.close();
						throw new ApplicationException();
					}
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_LGCY_CODE.WHEN-VALIDATE-ITEM BEGIN IF :SPBPERS.SPBPERS_LGCY_CODE
	 * IS NULL THEN :SPBPERS.LGCY_DESCRIPTION := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_LGCY_CODE")
	public void spbpersLgcyCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersLgcyCode().isNull())
			this.spbpersLgcyCode_PostChange();

		if (spbpersElement.getSpbpersLgcyCode().isNull()) {
			spbpersElement.setLgcyDescription(toStr(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_LGCY_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_LGCY_CODE_LBT")
	public void spbpersLgcyCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * LGCY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "LGCY_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void lgcyDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPBPERS_ETHN_CODE")
	public void spbpersEthnCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_ETHN_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersEthnCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPBPERS_ETHN_CODE")
	public void spbpersEthnCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPBPERS_ETHN_CODE")
	public void spbpersEthnCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_ETHN_CODE", function = KeyFunction.NEXT_ITEM)
	public void spbpersEthnCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_ETHN_CODE", function = KeyFunction.ITEM_OUT)
	public void spbpersEthnCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPBPERS_ETHN_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR IS SELECT STVETHN_DESC FROM STVETHN WHERE
	 * STVETHN_CODE = :SPBPERS.SPBPERS_ETHN_CODE; BEGIN G$_CHECK_QUERY_MODE; --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO :SPBPERS.ETHN_DESCRIPTION; IF
	 * PTI_CURSOR%NOTFOUND THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0142','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); CLOSE PTI_CURSOR; RAISE FORM_TRIGGER_FAILURE;
	 * END IF; CLOSE PTI_CURSOR; -- EXECUTE_TRIGGER('CONVERT_ETHN_CODE');
	 * G$_CHECK_FAILURE; -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_ETHN_CODE")
	public void spbpersEthnCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		
		if(spbpersElement.getSpbpersEthnCode().isNull())
			return;

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT STVETHN_DESC " + " FROM STVETHN "
					+ " WHERE STVETHN_CODE = :SPBPERS_SPBPERS_ETHN_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPBPERS_SPBPERS_ETHN_CODE",
							spbpersElement.getSpbpersEthnCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						spbpersElement.setEthnDescription(ptiCursorResults
								.getStr(0));
					}
					if (ptiCursor.notFound()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0142"),
										toStr("FORM"),
										toStr("*ERROR* Invalid code; press LIST for valid codes")));
						ptiCursor.close();
						throw new ApplicationException();
					}
					ptiCursor.close();
					//
					executeAction("CONVERT_ETHN_CODE");
					getContainer().getGoqrpls().gCheckFailure();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_ETHN_CODE.WHEN-VALIDATE-ITEM BEGIN IF :SPBPERS.SPBPERS_ETHN_CODE
	 * IS NULL THEN :SPBPERS.ETHN_DESCRIPTION := ''; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_ETHN_CODE")
	public void spbpersEthnCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersEthnCode().isNull())
			this.spbpersEthnCode_PostChange();

		if (spbpersElement.getSpbpersEthnCode().isNull()) {
			spbpersElement.setEthnDescription(toStr(""));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ETHN_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_ETHN_CODE_LBT")
	public void spbpersEthnCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * ETHN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "ETHN_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void ethnDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_CONFIRMED_RE_CDE.WHEN-CHECKBOX-CHANGED
	 * EXECUTE_TRIGGER('CHECK_ETHN_RACE_CONFIRMED_DATE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_CDE.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "SPBPERS_CONFIRMED_RE_CDE")
	public void spbpersConfirmedReCde_checkBoxChange() {

		executeAction("CHECK_ETHN_RACE_CONFIRMED_DATE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_CONFIRMED_RE_DATE", function = KeyFunction.NEXT_ITEM)
	public void spbpersConfirmedReDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_CONFIRMED_RE_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersConfirmedReDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_CONFIRMED_RE_DATE", function = KeyFunction.ITEM_OUT)
	public void spbpersConfirmedReDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_CONFIRMED_RE_DATE.POST-CHANGE if
	 * :SPBPERS.SPBPERS_CONFIRMED_RE_DATE is not null and
	 * (:SPBPERS.SPBPERS_CONFIRMED_RE_CDE is null or
	 * :SPBPERS.SPBPERS_CONFIRMED_RE_CDE <> 'Y') then
	 * :SPBPERS.SPBPERS_CONFIRMED_RE_CDE := 'Y'; end if;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPBPERS_CONFIRMED_RE_DATE")
	public void spbpersConfirmedReDate_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		if (!spbpersElement.getSpbpersConfirmedReDate().isNull()
				&& (spbpersElement.getSpbpersConfirmedReCde().isNull() || spbpersElement
						.getSpbpersConfirmedReCde().notEquals("Y"))) {
			spbpersElement.setSpbpersConfirmedReCde(toStr("Y"));
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPBPERS_CONFIRMED_RE_DATE_DBT")
	public void spbpersConfirmedReDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPBPERS_CONFIRMED_RE_DATE_DBT")
	public void spbpersConfirmedReDateDbt_buttonClick() {

		getGCalendarBtnClass().whenButtonPressed();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_ACTIVE_DUTY_SEPR_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersActiveDutySeprDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_ACTIVE_DUTY_SEPR_DATE", function = KeyFunction.ITEM_OUT)
	public void spbpersActiveDutySeprDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.WHEN-VALIDATE-ITEM G$_DATE_REFORMAT('','');
	 * G$_CHECK_FAILURE; -- IF :SPBPERS.SPBPERS_BIRTH_DATE IS NOT NULL AND
	 * :SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE < :SPBPERS.SPBPERS_BIRTH_DATE THEN
	 * MESSAGE ( G$_NLS.Get('GOQCLIB-0143', 'FORM','*ERROR* Active Duty
	 * Separation Date must be on or after the Birth Date.') ); RAISE
	 * FORM_TRIGGER_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_ACTIVE_DUTY_SEPR_DATE")
	public void spbpersActiveDutySeprDate_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);

		getContainer().getGoqrpls().gCheckFailure();
		//
		if (!spbpersElement.getSpbpersBirthDate().isNull()
				&& spbpersElement.getSpbpersActiveDutySeprDate().lesser(
						spbpersElement.getSpbpersBirthDate())) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0143"),
							toStr("FORM"),
							toStr("*ERROR* Active Duty Separation Date must be on or after the Birth Date.")));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.KEY-NEXT-ITEM G$_DATE_REFORMAT('','');
	 * G$_CHECK_FAILURE; NEXT_FIELD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_ACTIVE_DUTY_SEPR_DATE", function = KeyFunction.NEXT_ITEM)
	public void spbpersActiveDutySeprDate_keyNexItem() {

		getContainer().getGoqrpls().gCheckFailure();
		nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_ACTIVE_DUTY_SEPR_DATE_DBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "PERS_ACTIVE_DUTY_SEPR_DATE_DBT")
	public void persActiveDutySeprDateDbt_click() {

		getGCalendarBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * PERS_ACTIVE_DUTY_SEPR_DATE_DBT.WHEN-BUTTON-PRESSED
	 * --G$_DATE_CALL_GUACALN('SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE'); DECLARE
	 * ITEM_ID ITEM; AL_BUT NUMBER; CUR_ITEM VARCHAR2(100) :=
	 * NAME_IN('SYSTEM.TRIGGER_ITEM'); CURRENT_BLOCK_FLD VARCHAR2(61); BEGIN
	 * CURRENT_BLOCK_FLD := 'SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE';
	 * GO_ITEM(CURRENT_BLOCK_FLD); G$_CHECK_FAILURE; --
	 * COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE'); IF
	 * NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN IF
	 * GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
	 * (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
	 * NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR (NAME_IN('SYSTEM.MODE') <>
	 * 'NORMAL' AND GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
	 * (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
	 * GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
	 * (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
	 * GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
	 * COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD); COPY('','GLOBAL.VALUE');
	 * DO_KEY('NEXT_ITEM'); ELSE
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0144','FORM','*ERROR* Item is protected
	 * against update.')); END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * PERS_ACTIVE_DUTY_SEPR_DATE_DBT.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "PERS_ACTIVE_DUTY_SEPR_DATE_DBT")
	public void persActiveDutySeprDateDbt_buttonClick() {

		// G$_DATE_CALL_GUACALN('SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE');
		{
			ItemDescriptor itemId = null;
			NNumber alBut = NNumber.getNull();
			NString curItem = getTriggerItem();
			NString currentBlockFld = NString.getNull();
			currentBlockFld = toStr("SPBPERS.SPBPERS_ACTIVE_DUTY_SEPR_DATE");
			goItem(currentBlockFld);
			getContainer().getGoqrpls().gCheckFailure();
			//
			copy(getItemValue(getCursorItem()), "GLOBAL.VALUE");
			executeAction("G$_REVOKE_ACCESS");
			getContainer().getGoqrpls().gCheckFailure();
			getContainer().getGoqrpls().gSecuredFormCall(getUser(),
					toStr("GUACALN"), toStr("QUERY_NOHIDE"));
			if (!getNameIn("GLOBAL.VALUE").isNull()) {
				// F2J_WARNING : The built-in call was converted but there can
				// be semantic differences in the resulting code.
				// MORPHIS: Update null needs to be implemented
				if (getItemUpdateAllowed(currentBlockFld).equals("TRUE") /*
																		 * || (
																		 * SupportClasses
																		 * .
																		 * FORMS40
																		 * .
																		 * GetItemProperty
																		 * (
																		 * currentBlockFld
																		 * ,
																		 * SupportClasses
																		 * .
																		 * Property
																		 * .
																		 * UPDATE_NULL
																		 * )
																		 * .equals
																		 * (
																		 * "TRUE"
																		 * ) &&
																		 * getCurrentValue
																		 * (
																		 * ).isNull
																		 * ())
																		 */
						|| (getMode().notEquals("NORMAL") && getItemQueryAllowed(
								currentBlockFld).equals("TRUE"))
						|| (getRecordStatus().equals("NEW") && getItemInsertAllowed(
								currentBlockFld).equals("TRUE"))
						|| (getRecordStatus().equals("INSERT") && getItemInsertAllowed(
								currentBlockFld).equals("TRUE"))) {
					// F2N_TODO: The above condition uses unsupported features.
					// You should eliminate all references to SupportClasses.
					copy(getNameIn("GLOBAL.VALUE"), currentBlockFld);
					copy("", "GLOBAL.VALUE");
					executeAction("NEXT_ITEM");
				} else {
					errorMessage(GNls.Fget(toStr("GOQCLIB-0144"), toStr("FORM"),
							toStr("*ERROR* Item is protected against update.")));
				}
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPBPERS_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void spbpersActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPBPERS_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spbpersActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPBPERS_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void spbpersActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_SSN.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_SSN")
	public void spbpersSsn_validate() {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		if (!spbpersElement.getSpbpersSsn().isNull())
			this.spbpersSsn_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPBPERS_CONFIRMED_RE_DATE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPBPERS_CONFIRMED_RE_DATE")
	public void spbpersConfirmedReDate_validate() {

		SpbpersAdapter spbpersElement = (SpbpersAdapter) this.getFormModel()
				.getSpbpers().getRowAdapter(true);
		if (!spbpersElement.getSpbpersConfirmedReDate().isNull())
			this.spbpersConfirmedReDate_PostChange();

	}

	public void spbpersCitzCode_doubleClick() {
		spbpersCitzCode_WhenMouseDoubleclick();
		
	}

	public void spbpersMrtlCode_doubleClick() {
		spbpersMrtlCode_WhenMouseDoubleclick();
		
	}

	public void spbpersRelgCode_doubleClick() {
		spbpersRelgCode_WhenMouseDoubleclick();
		
	}

	public void spbpersLgcyCode_doubleClick() {
		spbpersLgcyCode_WhenMouseDoubleclick();
		
	}

	public void spbpersEthnCode_doubleClick() {
		spbpersEthnCode_WhenMouseDoubleclick();
		
	}

}
