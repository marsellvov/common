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
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController;

public class SpremrgController extends AbstractSupportCodeObject {

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

	public SpremrgController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER SPREMRG.PRE-QUERY --:PAGE0_IND :=
	 * 'Y'; NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void spremrg_BeforeQuery(QueryEvent args) {

		// :PAGE0_IND := 'Y';
		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"KEY_BLOCK_PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));

		// :PAGE0_IND := 'Y';
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.PRE-INSERT
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; --
	 * :SPREMRG.SPREMRG_ACTIVITY_DATE :=
	 * TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT);
	 * :SPREMRG.SPREMRG_USER_ID := :GLOBAL.CURRENT_USER; :SPREMRG.SPREMRG_PIDM
	 * := :KEY_BLOCK.PIDM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void spremrg_BeforeRowInsert(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spremrgElement.setSpremrgActivityDate(toDate(toStr(getFormModel()
				.getBusinessObject("FORM_HEADER").getValue("CURRENT_DATE")),
				GDate.getNlsDateFormat()));
		spremrgElement.setSpremrgUserId(getGlobal("CURRENT_USER"));
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spremrgElement.setSpremrgPidm(toNumber(getFormModel()
				.getBusinessObject("KEY_BLOCK").getValue("PIDM")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.ON-INSERT BEGIN
	 * GB_EMERGENCY_CONTACT.P_CREATE(p_PIDM =>:SPREMRG.SPREMRG_PIDM, p_PRIORITY
	 * =>:SPREMRG.SPREMRG_PRIORITY, p_LAST_NAME =>:SPREMRG.SPREMRG_LAST_NAME,
	 * p_FIRST_NAME =>:SPREMRG.SPREMRG_FIRST_NAME, p_MI =>:SPREMRG.SPREMRG_MI,
	 * p_STREET_LINE1 =>:SPREMRG.SPREMRG_STREET_LINE1, p_STREET_LINE2
	 * =>:SPREMRG.SPREMRG_STREET_LINE2, p_STREET_LINE3
	 * =>:SPREMRG.SPREMRG_STREET_LINE3, p_CITY =>:SPREMRG.SPREMRG_CITY,
	 * p_STAT_CODE =>:SPREMRG.SPREMRG_STAT_CODE, p_NATN_CODE
	 * =>:SPREMRG.SPREMRG_NATN_CODE, p_ZIP =>:SPREMRG.SPREMRG_ZIP, p_PHONE_AREA
	 * =>:SPREMRG.SPREMRG_PHONE_AREA, p_PHONE_NUMBER
	 * =>:SPREMRG.SPREMRG_PHONE_NUMBER, p_PHONE_EXT
	 * =>:SPREMRG.SPREMRG_PHONE_EXT, p_RELT_CODE =>:SPREMRG.SPREMRG_RELT_CODE,
	 * p_ATYP_CODE =>:SPREMRG.SPREMRG_ATYP_CODE, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER, p_surname_prefix
	 * =>:spremrg.spremrg_surname_prefix, p_ctry_code_phone
	 * =>:spremrg.spremrg_ctry_code_phone, p_house_number
	 * =>:spremrg.spremrg_house_number, p_street_line4
	 * =>:spremrg.spremrg_street_line4, p_ROWID_OUT =>:SPREMRG.ROWID); --
	 * :SPREMRG.SPREMRG_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPREMRG.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void spremrg_RowInsert(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbEmergencyContact.pCreate(
					/* pPidm=> */spremrgElement.getSpremrgPidm(), /* pPriority=> */
					spremrgElement.getSpremrgPriority(), /* pLastName=> */
					spremrgElement.getSpremrgLastName(), /* pFirstName=> */
					spremrgElement.getSpremrgFirstName(), /* pMi=> */
					spremrgElement.getSpremrgMi(), /* pStreetLine1=> */
					spremrgElement.getSpremrgStreetLine1(), /* pStreetLine2=> */
					spremrgElement.getSpremrgStreetLine2(), /* pStreetLine3=> */
					spremrgElement.getSpremrgStreetLine3(), /* pCity=> */
					spremrgElement.getSpremrgCity(), /* pStatCode=> */
					spremrgElement.getSpremrgStatCode(), /* pNatnCode=> */
					spremrgElement.getSpremrgNatnCode(), /* pZip=> */
					spremrgElement.getSpremrgZip(), /* pPhoneArea=> */
					spremrgElement.getSpremrgPhoneArea(), /* pPhoneNumber=> */
					spremrgElement.getSpremrgPhoneNumber(), /* pPhoneExt=> */
					spremrgElement.getSpremrgPhoneExt(), /* pReltCode=> */
					spremrgElement.getSpremrgReltCode(), /* pAtypCode=> */
					spremrgElement.getSpremrgAtypCode(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), /* pUserId=> */
					getGlobal("CURRENT_USER"), /* pSurnamePrefix=> */
					spremrgElement.getSpremrgSurnamePrefix(), /* pCtryCodePhone=> */
					spremrgElement.getSpremrgCtryCodePhone(), /* pHouseNumber=> */
					spremrgElement.getSpremrgHouseNumber(), /* pStreetLine4=> */
					spremrgElement.getSpremrgStreetLine4(), p_rowid_out_ref);
			spremrgElement.setROWID(p_rowid_out_ref.val);
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spremrgElement.setSpremrgActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spremrgElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.PRE-UPDATE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; --
	 * :SPREMRG.SPREMRG_ACTIVITY_DATE :=
	 * TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT);
	 * :SPREMRG.SPREMRG_USER_ID := :GLOBAL.CURRENT_USER; :SPREMRG.SPREMRG_PIDM
	 * := :KEY_BLOCK.PIDM;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void spremrg_BeforeRowUpdate(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spremrgElement.setSpremrgActivityDate(toDate(toStr(getFormModel()
				.getBusinessObject("FORM_HEADER").getValue("CURRENT_DATE")),
				GDate.getNlsDateFormat()));
		spremrgElement.setSpremrgUserId(getGlobal("CURRENT_USER"));
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		spremrgElement.setSpremrgPidm(toNumber(getFormModel()
				.getBusinessObject("KEY_BLOCK").getValue("PIDM")));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.ON-UPDATE BEGIN
	 * GB_EMERGENCY_CONTACT.P_UPDATE(p_PIDM =>:SPREMRG.SPREMRG_PIDM, p_PRIORITY
	 * =>:SPREMRG.SPREMRG_PRIORITY, p_LAST_NAME =>:SPREMRG.SPREMRG_LAST_NAME,
	 * p_FIRST_NAME =>:SPREMRG.SPREMRG_FIRST_NAME, p_MI =>:SPREMRG.SPREMRG_MI,
	 * p_STREET_LINE1 =>:SPREMRG.SPREMRG_STREET_LINE1, p_STREET_LINE2
	 * =>:SPREMRG.SPREMRG_STREET_LINE2, p_STREET_LINE3
	 * =>:SPREMRG.SPREMRG_STREET_LINE3, p_CITY =>:SPREMRG.SPREMRG_CITY,
	 * p_STAT_CODE =>:SPREMRG.SPREMRG_STAT_CODE, p_NATN_CODE
	 * =>:SPREMRG.SPREMRG_NATN_CODE, p_ZIP =>:SPREMRG.SPREMRG_ZIP, p_PHONE_AREA
	 * =>:SPREMRG.SPREMRG_PHONE_AREA, p_PHONE_NUMBER
	 * =>:SPREMRG.SPREMRG_PHONE_NUMBER, p_PHONE_EXT
	 * =>:SPREMRG.SPREMRG_PHONE_EXT, p_RELT_CODE =>:SPREMRG.SPREMRG_RELT_CODE,
	 * p_ATYP_CODE =>:SPREMRG.SPREMRG_ATYP_CODE, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER, p_surname_prefix
	 * =>:spremrg.spremrg_surname_prefix, p_ctry_code_phone
	 * =>:spremrg.spremrg_ctry_code_phone, p_house_number
	 * =>:spremrg.spremrg_house_number, p_street_line4
	 * =>:spremrg.spremrg_street_line4, p_ROWID =>:SPREMRG.ROWID); --
	 * :SPREMRG.SPREMRG_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPREMRG.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void spremrg_RowUpdate(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbEmergencyContact.pUpdate(/* pPidm=> */spremrgElement
					.getSpremrgPidm(),
			/* pPriority=> */spremrgElement.getSpremrgPriority(),
			/* pLastName=> */spremrgElement.getSpremrgLastName(),
			/* pFirstName=> */spremrgElement.getSpremrgFirstName(),
			/* pMi=> */spremrgElement.getSpremrgMi(),
			/* pStreetLine1=> */spremrgElement.getSpremrgStreetLine1(),
			/* pStreetLine2=> */spremrgElement.getSpremrgStreetLine2(),
			/* pStreetLine3=> */spremrgElement.getSpremrgStreetLine3(),
			/* pCity=> */spremrgElement.getSpremrgCity(),
			/* pStatCode=> */spremrgElement.getSpremrgStatCode(),
			/* pNatnCode=> */spremrgElement.getSpremrgNatnCode(),
			/* pZip=> */spremrgElement.getSpremrgZip(),
			/* pPhoneArea=> */spremrgElement.getSpremrgPhoneArea(),
			/* pPhoneNumber=> */spremrgElement.getSpremrgPhoneNumber(),
			/* pPhoneExt=> */spremrgElement.getSpremrgPhoneExt(),
			/* pReltCode=> */spremrgElement.getSpremrgReltCode(),
			/* pAtypCode=> */spremrgElement.getSpremrgAtypCode(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pUserId=> */getGlobal("CURRENT_USER"),
			/* pSurnamePrefix=> */spremrgElement.getSpremrgSurnamePrefix(),
			/* pCtryCodePhone=> */spremrgElement.getSpremrgCtryCodePhone(),
			/* pHouseNumber=> */spremrgElement.getSpremrgHouseNumber(),
			/* pStreetLine4=> */spremrgElement.getSpremrgStreetLine4(),
			/* pRowid=> */spremrgElement.getROWID());
			//
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			spremrgElement.setSpremrgActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(spremrgElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.ON-DELETE BEGIN
	 * GB_EMERGENCY_CONTACT.P_DELETE(p_PIDM =>:SPREMRG.SPREMRG_PIDM, p_PRIORITY
	 * =>:SPREMRG.SPREMRG_PRIORITY, p_ROWID =>:SPREMRG.ROWID); EXCEPTION WHEN
	 * OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void spremrg_RowDelete(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbEmergencyContact.pDelete(
					/* pPidm=> */spremrgElement.getSpremrgPidm(),
					/* pPriority=> */spremrgElement.getSpremrgPriority(),
					/* pRowid=> */spremrgElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-NXTBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0157','FORM','Emergency contact information
	 * changed, press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void spremrg_NextBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0157"),
							toStr("FORM"),
							toStr("Emergency contact information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-NXTKEY
	 * GO_ITEM('SPREMRG.SPREMRG_ZIP');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-NXTKEY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTKEY")
	public void spremrg_KeyNxtkey() {

		goItem(toStr("SPREMRG.SPREMRG_ZIP"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-NXTREC
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; NEXT_RECORD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void spremrg_NextRecord() {

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		nextRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-NXTSET
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; NEXT_SET;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void spremrg_KeyNxtset() {

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		// F2J_NOT_SUPPORTED : Call to built-in "NEXT_SET" was removed because
		// it is not supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
		// SupportClasses.SQLFORMS.NextSet();
		this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'NEXT_SET' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-PRVREC
	 * EXECUTE_TRIGGER('CHECK_ADDRESS'); G$_CHECK_FAILURE; PREVIOUS_RECORD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void spremrg_PreviousRecord() {

		executeAction("CHECK_ADDRESS");
		getContainer().getGoqrpls().gCheckFailure();
		previousRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.KEY-PRVBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0158','FORM','Emergency contact information
	 * changed, press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void spremrg_PreviousBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0158"),
							toStr("FORM"),
							toStr("Emergency contact information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.CALL_PHONE_FORM DECLARE
	 * lv_form_to_call VARCHAR2(30); lv_this_product VARCHAR2(1) :=
	 * SUBSTR(:SYSTEM.CURRENT_FORM,1,1); tab_page_id TAB_PAGE; BEGIN
	 * lv_form_to_call := CASE lv_this_product WHEN 'A' THEN 'APAIDEN' WHEN 'F'
	 * THEN 'FOAIDEN' WHEN 'P' THEN 'PPATELE' ELSE 'SPAIDEN' END; --
	 * GO_ITEM('SPREMRG_PHONE_AREA'); :HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
	 * G$_CHECK_FAILURE; -- -- Check if in a form with a telephone tab --
	 * tab_page_id := FIND_TAB_PAGE('TELEPHONE_TAB'); IF NOT
	 * ID_NULL(tab_page_id) THEN IF GET_TAB_PAGE_PROPERTY(tab_page_id,VISIBLE) =
	 * 'FALSE' THEN MESSAGE(G$_NLS.Get('GOQCLIB-0159','FORM','*ERROR* User %01%
	 * is not authorized to access %02%.', USER,
	 * NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC
	 * (:SYSTEM.CURRENT_FORM,'TELEPHONE_TAB'),'TELEPHONE_TAB'))); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; IF
	 * GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'TRUE' THEN
	 * GO_BLOCK('SPRTELE'); -- :SYSTEM.MESSAGE_LEVEL := '5'; EXECUTE_QUERY;
	 * :SYSTEM.MESSAGE_LEVEL := '0'; END IF; -- -- No tab found, so call the
	 * appropriate IDEN form. -- ELSE IF
	 * INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC
	 * (lv_form_to_call,USER),'TELEPHONE_TAB:N') > 0 THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0160','FORM','*ERROR* User %01% is not
	 * authorized to access %02% on %03%.', USER,
	 * NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC
	 * (lv_form_to_call,'TELEPHONE_TAB'),'TELEPHONE_TAB'), lv_form_to_call));
	 * RAISE FORM_TRIGGER_FAILURE; ELSE :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
	 * :GLOBAL.SECRFRM := lv_form_to_call; :GLOBAL.NAVIGATE_TO_TAB :=
	 * 'TELEPHONE'; :HOLD_FIELD := :SYSTEM.CURRENT_FIELD; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * :GLOBAL.FORM_WAS_CALLED := 'Y';
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
	 * :GLOBAL.FORM_WAS_CALLED := 'N'; :GLOBAL.NAVIGATE_TO_TAB := ''; -- END IF;
	 * END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG.CALL_PHONE_FORM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CALL_PHONE_FORM")
	public void spremrg_CallPhoneForm() {

		String caseExpressionResult = null;
		{
			NString lvFormToCall = NString.getNull();
			NString lvThisProduct = substring(toStr(getCurrentTaskName()),
					toInt(1), toInt(1));
			TabPageDescriptor tabPageId = null;

			if (lvThisProduct.equals("A")) {
				caseExpressionResult = "APAIDEN";
			} else if (lvThisProduct.equals("F")) {
				caseExpressionResult = "FOAIDEN";
			} else if (lvThisProduct.equals("P")) {
				caseExpressionResult = "PPATELE";
			}

			lvFormToCall = toStr(caseExpressionResult);
			//
			goItem(toStr("SPREMRG_PHONE_AREA"));
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("FORM_HEADER").setValue(
					"HOLD_BLOCK_FIELD", getCursorItem());
			getContainer().getGoqrpls().gCheckFailure();
			//
			// Check if in a form with a telephone tab
			//
			tabPageId = findTabPage("TELEPHONE_TAB");
			if (!(tabPageId == null)) {
				if (!getTabPageVisible(tabPageId.getId())) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0159"),
									toStr("FORM"),
									toStr("*ERROR* User %01% is not authorized to access %02%."),
									getUser(),
									isNull(GSecurity.FgGetTabDescFnc(
											getCurrentTaskName(),
											toStr("TELEPHONE_TAB")),
											"TELEPHONE_TAB")));
					throw new ApplicationException();
				}
				if (getTabPageEnabled(tabPageId)) {
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
							.Fget(toStr("GOQCLIB-0160"),
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
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.CHECK_ADDRESS DECLARE
	 * TEMP_CHK_ADDR VARCHAR2(2) := 'N'; BEGIN IF :SPREMRG.SPREMRG_HOUSE_NUMBER
	 * IS NOT NULL OR :SPREMRG.SPREMRG_STREET_LINE1 IS NOT NULL OR
	 * :SPREMRG.SPREMRG_STREET_LINE2 IS NOT NULL OR
	 * :SPREMRG.SPREMRG_STREET_LINE3 IS NOT NULL OR
	 * :SPREMRG.SPREMRG_STREET_LINE4 IS NOT NULL OR :SPREMRG.SPREMRG_CITY IS NOT
	 * NULL OR :SPREMRG.SPREMRG_STAT_CODE IS NOT NULL OR :SPREMRG.SPREMRG_ZIP IS
	 * NOT NULL OR :SPREMRG.SPREMRG_NATN_CODE IS NOT NULL THEN -- TEMP_CHK_ADDR
	 * := 'Y'; -- END IF; -- G$_CHECK_VALUE((TEMP_CHK_ADDR = 'Y' AND
	 * (:SPREMRG.SPREMRG_STREET_LINE1 IS NULL OR :SPREMRG.SPREMRG_CITY IS
	 * NULL)), G$_NLS.Get('GOQCLIB-0161','FORM','*ERROR* The first street line
	 * and the city must be entered.'),TRUE); -- G$_CHECK_VALUE((TEMP_CHK_ADDR =
	 * 'Y' AND (:SPREMRG.SPREMRG_STAT_CODE IS NULL AND
	 * :SPREMRG.SPREMRG_NATN_CODE IS NULL)),
	 * G$_NLS.Get('GOQCLIB-0162','FORM','*ERROR* Either state or nation code
	 * must be entered.'),TRUE); -- G$_CHECK_VALUE((TEMP_CHK_ADDR = 'Y' AND
	 * (:SPREMRG.SPREMRG_STAT_CODE IS NOT NULL AND :SPREMRG.SPREMRG_ZIP IS
	 * NULL)), G$_NLS.Get('GOQCLIB-0163','FORM','*ERROR* Zip must be entered for
	 * city and state.'),TRUE); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG.CHECK_ADDRESS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ADDRESS")
	public void spremrg_CheckAddress() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		{
			NString tempChkAddr = toStr("N");
			if (!spremrgElement.getSpremrgHouseNumber().isNull()
					|| !spremrgElement.getSpremrgStreetLine1().isNull()
					|| !spremrgElement.getSpremrgStreetLine2().isNull()
					|| !spremrgElement.getSpremrgStreetLine3().isNull()
					|| !spremrgElement.getSpremrgStreetLine4().isNull()
					|| !spremrgElement.getSpremrgCity().isNull()
					|| !spremrgElement.getSpremrgStatCode().isNull()
					|| !spremrgElement.getSpremrgZip().isNull()
					|| !spremrgElement.getSpremrgNatnCode().isNull()) {
				//
				tempChkAddr = toStr("Y");
			}
			//
			getContainer()
					.getGoqrpls()
					.gCheckValue(
							(toBool(tempChkAddr.equals("Y")
									&& (spremrgElement.getSpremrgStreetLine1()
											.isNull() || spremrgElement
											.getSpremrgCity().isNull()))),
							GNls.Fget(
									toStr("GOQCLIB-0161"),
									toStr("FORM"),
									toStr("*ERROR* The first street line and the city must be entered.")),
							toBool(NBool.True));
			//
			getContainer()
					.getGoqrpls()
					.gCheckValue(
							(toBool(tempChkAddr.equals("Y")
									&& (spremrgElement.getSpremrgStatCode()
											.isNull() && spremrgElement
											.getSpremrgNatnCode().isNull()))),
							GNls.Fget(
									toStr("GOQCLIB-0162"),
									toStr("FORM"),
									toStr("*ERROR* Either state or nation code must be entered.")),
							toBool(NBool.True));
			//
			getContainer()
					.getGoqrpls()
					.gCheckValue(
							(toBool(tempChkAddr.equals("Y")
									&& (!spremrgElement.getSpremrgStatCode()
											.isNull() && spremrgElement
											.getSpremrgZip().isNull()))),
							GNls.Fget(
									toStr("GOQCLIB-0163"),
									toStr("FORM"),
									toStr("*ERROR* Zip must be entered for city and state.")),
							toBool(NBool.True));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.CHECK_ADDRESS_EXISTS BEGIN
	 * IF (:SPREMRG.SPREMRG_CITY IS NULL) AND (:SPREMRG.SPREMRG_STAT_CODE IS
	 * NULL) AND (:SPREMRG.SPREMRG_NATN_CODE IS NULL) THEN :SPREMRG.NO_ADDR_INFO
	 * := 1; ELSE :SPREMRG.NO_ADDR_INFO := 0; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG.CHECK_ADDRESS_EXISTS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_ADDRESS_EXISTS")
	public void spremrg_CheckAddressExists() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		if ((spremrgElement.getSpremrgCity().isNull())
				&& (spremrgElement.getSpremrgStatCode().isNull())
				&& (spremrgElement.getSpremrgNatnCode().isNull())) {
			spremrgElement.setNoAddrInfo(toNumber(1));
		} else {
			spremrgElement.setNoAddrInfo(toNumber(0));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG.COPY_PHONE DECLARE CURSOR
	 * PTI_CURSOR IS SELECT SPRTELE_CTRY_CODE_PHONE, SPRTELE_PHONE_AREA,
	 * SPRTELE_PHONE_NUMBER, SPRTELE_PHONE_EXT FROM SPRTELE WHERE ROWID =
	 * :SPREMRG.HLD_ROWID; BEGIN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :SPREMRG.SPREMRG_CTRY_CODE_PHONE, :SPREMRG.SPREMRG_PHONE_AREA,
	 * :SPREMRG.SPREMRG_PHONE_NUMBER, :SPREMRG.SPREMRG_PHONE_EXT; CLOSE
	 * PTI_CURSOR; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.COPY_PHONE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "COPY_PHONE")
	public void spremrg_CopyPhone() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor = "SELECT SPRTELE_CTRY_CODE_PHONE, SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER, SPRTELE_PHONE_EXT "
					+ " FROM SPRTELE " + " WHERE ROWID = :SPREMRG_HLD_ROWID ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				// Setting query parameters
				ptiCursor.addParameter("SPREMRG_HLD_ROWID",
						spremrgElement.getHldRowid());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					spremrgElement.setSpremrgCtryCodePhone(ptiCursorResults
							.getStr(0));
					spremrgElement.setSpremrgPhoneArea(ptiCursorResults
							.getStr(1));
					spremrgElement.setSpremrgPhoneNumber(ptiCursorResults
							.getStr(2));
					spremrgElement.setSpremrgPhoneExt(ptiCursorResults
							.getStr(3));
				}
				ptiCursor.close();
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPREMRG_RELT_CODE")
	public void spremrgReltCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_RELT_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spremrgReltCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPREMRG_RELT_CODE")
	public void spremrgReltCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPREMRG_RELT_CODE")
	public void spremrgReltCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_RELT_CODE", function = KeyFunction.NEXT_ITEM)
	public void spremrgReltCode_keyNexItem() {

		// :RELT_DESCRIPTION := null;
		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		getContainer().getGoqrpls().gCheckFailure();
		nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_RELT_CODE", function = KeyFunction.ITEM_OUT)
	public void spremrgReltCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_RELT_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPREMRG.RELT_DESCRIPTION :=
	 * GB_STVRELT.F_GET_DESCRIPTION(:SPREMRG.SPREMRG_RELT_CODE); IF
	 * :SPREMRG.RELT_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0164','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPREMRG_RELT_CODE")
	public void spremrgReltCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spremrgElement.setReltDescription(GbStvrelt
					.fGetDescription(spremrgElement.getSpremrgReltCode()));
			if (spremrgElement.getReltDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0164"),
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
	 * SPREMRG_RELT_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPREMRG_RELT_CODE_LBT")
	public void spremrgReltCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * RELT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "RELT_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void reltDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPREMRG_ATYP_CODE")
	public void spremrgAtypCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_ATYP_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spremrgAtypCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPREMRG_ATYP_CODE")
	public void spremrgAtypCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_ATYP_CODE", function = KeyFunction.NEXT_ITEM)
	public void spremrgAtypCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_ATYP_CODE", function = KeyFunction.ITEM_OUT)
	public void spremrgAtypCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ATYP_CODE.G$_SEARCH_OPTIONS
	 * G$_KEY_OPT_MENU('SPREMRG_ATYP_CODE', G$_NLS.Get('GOQCLIB-0165',
	 * 'FORM','Address Types') ,'LIST_VALUES', G$_NLS.Get('GOQCLIB-0166',
	 * 'FORM','Address Query') ,'COUNT_QUERY', '','','',''); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.G$_SEARCH_OPTIONS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPREMRG_ATYP_CODE")
	public void spremrgAtypCode_GSearchOptions() {

		getContainer().getGoqrpls().gKeyOptMenu(
				toStr("SPREMRG_ATYP_CODE"),
				GNls.Fget(toStr("GOQCLIB-0165"), toStr("FORM"),
						toStr("Address Types")),
				toStr("LIST_VALUES"),
				GNls.Fget(toStr("GOQCLIB-0166"), toStr("FORM"),
						toStr("Address Query")), toStr("COUNT_QUERY"),
				toStr(""), toStr(""), toStr(""), toStr(""));
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ATYP_CODE.POST-CHANGE
	 * DECLARE CURSOR PTI_CURSOR2 IS SELECT SPRADDR_HOUSE_NUMBER,
	 * SPRADDR_STREET_LINE1, SPRADDR_STREET_LINE2, SPRADDR_STREET_LINE3,
	 * SPRADDR_STREET_LINE4, SPRADDR_CITY, SPRADDR_STAT_CODE, SPRADDR_ZIP,
	 * SPRADDR_NATN_CODE, SPRADDR_SEQNO FROM SPRADDR WHERE SPRADDR_PIDM =
	 * :KEY_BLOCK.PIDM AND SPRADDR_ATYP_CODE = :SPREMRG.SPREMRG_ATYP_CODE AND
	 * SPRADDR_STATUS_IND IS NULL AND ((SPRADDR_TO_DATE IS NULL AND
	 * SPRADDR_FROM_DATE IS NULL) OR (SPRADDR_TO_DATE IS NOT NULL AND
	 * SPRADDR_FROM_DATE IS NOT NULL AND SYSDATE BETWEEN SPRADDR_FROM_DATE AND
	 * SPRADDR_TO_DATE) OR (SPRADDR_FROM_DATE IS NOT NULL AND SPRADDR_TO_DATE IS
	 * NULL AND SYSDATE >= SPRADDR_FROM_DATE)); -- CURSOR PTI_CURSOR4 IS SELECT
	 * SPRTELE_CTRY_CODE_PHONE, SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER,
	 * SPRTELE_PHONE_EXT FROM SPRTELE WHERE SPRTELE_PIDM = :KEY_BLOCK.PIDM AND
	 * SPRTELE_ATYP_CODE = :SPREMRG.SPREMRG_ATYP_CODE AND SPRTELE_ADDR_SEQNO =
	 * :SPREMRG.PAGE0_SEQNO; -- BEGIN G$_CHECK_QUERY_MODE; --
	 * EXECUTE_TRIGGER('RESET_RECORD'); -- :SPREMRG.ATYP_DESCRIPTION :=
	 * GB_STVATYP.F_GET_DESCRIPTION(:SPREMRG.SPREMRG_ATYP_CODE); IF
	 * :SPREMRG.ATYP_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0167','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; -- IF
	 * (:GLOBAL.QUERY_MODE = '1') THEN :GLOBAL.QUERY_MODE := '0'; RETURN; END
	 * IF; -- OPEN PTI_CURSOR2; FETCH PTI_CURSOR2 INTO
	 * :SPREMRG.SPREMRG_HOUSE_NUMBER, :SPREMRG.SPREMRG_STREET_LINE1,
	 * :SPREMRG.SPREMRG_STREET_LINE2, :SPREMRG.SPREMRG_STREET_LINE3,
	 * :SPREMRG.SPREMRG_STREET_LINE4, :SPREMRG.SPREMRG_CITY,
	 * :SPREMRG.SPREMRG_STAT_CODE, :SPREMRG.SPREMRG_ZIP,
	 * :SPREMRG.SPREMRG_NATN_CODE, :SPREMRG.PAGE0_SEQNO; IF PTI_CURSOR2%NOTFOUND
	 * THEN CLOSE PTI_CURSOR2; MESSAGE(G$_NLS.Get('GOQCLIB-0168','FORM','*NOTE*
	 * No address exists for this address type or address is inactive'));
	 * EXECUTE_TRIGGER('RESET_RECORD'); RETURN; END IF; CLOSE PTI_CURSOR2; -- IF
	 * :SPREMRG.SPREMRG_NATN_CODE IS NOT NULL THEN :SPREMRG.NATN_DESCRIPTION :=
	 * GB_STVNATN.F_GET_DESCRIPTION(:SPREMRG.SPREMRG_NATN_CODE); IF
	 * :SPREMRG.NATN_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0169','FORM','*ERROR* Invalid nation code;
	 * press LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; END
	 * IF; -- OPEN PTI_CURSOR4; FETCH PTI_CURSOR4 INTO
	 * :SPREMRG.SPREMRG_CTRY_CODE_PHONE, :SPREMRG.SPREMRG_PHONE_AREA,
	 * :SPREMRG.SPREMRG_PHONE_NUMBER, :SPREMRG.SPREMRG_PHONE_EXT; CLOSE
	 * PTI_CURSOR4; -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN
	 * FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPREMRG_ATYP_CODE")
	public void spremrgAtypCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		int rowCount = 0;
		{
			String sqlptiCursor2 = "SELECT SPRADDR_HOUSE_NUMBER, SPRADDR_STREET_LINE1, SPRADDR_STREET_LINE2, SPRADDR_STREET_LINE3, SPRADDR_STREET_LINE4, SPRADDR_CITY, SPRADDR_STAT_CODE, SPRADDR_ZIP, SPRADDR_NATN_CODE, SPRADDR_SEQNO "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR_ATYP_CODE = :SPREMRG_SPREMRG_ATYP_CODE AND SPRADDR_STATUS_IND IS NULL ";
//			MORPHIS TODO DF
//					+ "AND ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR (SPRADDR_TO_DATE IS NOT NULL AND SPRADDR_FROM_DATE IS NOT NULL AND SYSDATE BETWEEN SPRADDR_FROM_DATE AND SPRADDR_TO_DATE) OR (SPRADDR_FROM_DATE IS NOT NULL AND SPRADDR_TO_DATE IS NULL AND SYSDATE >= SPRADDR_FROM_DATE)) ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			String sqlptiCursor4 = "SELECT SPRTELE_CTRY_CODE_PHONE, SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER, SPRTELE_PHONE_EXT "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :KEY_BLOCK_PIDM AND SPRTELE_ATYP_CODE = :SPREMRG_SPREMRG_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPREMRG_PAGE0_SEQNO ";
			DataCursor ptiCursor4 = new DataCursor(sqlptiCursor4);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					executeAction("RESET_RECORD");
					//
					spremrgElement.setAtypDescription(GbStvatyp
							.fGetDescription(spremrgElement
									.getSpremrgAtypCode()));
					if (spremrgElement.getAtypDescription().isNull()) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0167"),
										toStr("FORM"),
										toStr("*ERROR* Invalid code; press LIST for valid codes")));
						throw new ApplicationException();
					}
					//
					if ((getGlobal("QUERY_MODE").equals("1"))) {
						setGlobal("QUERY_MODE", toStr("0"));
						return;
					}
					//
					// Setting query parameters
					ptiCursor2.addParameter("KEY_BLOCK_PIDM", getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					ptiCursor2.addParameter("SPREMRG_SPREMRG_ATYP_CODE",spremrgElement.getSpremrgAtypCode());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor2.
					ptiCursor2.open();
					ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
					if (ptiCursor2Results != null) {
						spremrgElement.setSpremrgHouseNumber(ptiCursor2Results
								.getStr(0));
						spremrgElement.setSpremrgStreetLine1(ptiCursor2Results
								.getStr(1));
						spremrgElement.setSpremrgStreetLine2(ptiCursor2Results
								.getStr(2));
						spremrgElement.setSpremrgStreetLine3(ptiCursor2Results
								.getStr(3));
						spremrgElement.setSpremrgStreetLine4(ptiCursor2Results
								.getStr(4));
						spremrgElement.setSpremrgCity(ptiCursor2Results
								.getStr(5));
						spremrgElement.setSpremrgStatCode(ptiCursor2Results
								.getStr(6));
						spremrgElement.setSpremrgZip(ptiCursor2Results
								.getStr(7));
						spremrgElement.setSpremrgNatnCode(ptiCursor2Results
								.getStr(8));
						spremrgElement.setPage0Seqno(ptiCursor2Results
								.getNumber(9));
					}
					if (ptiCursor2.notFound()) {
						ptiCursor2.close();
						infoMessage(GNls
								.Fget(toStr("GOQCLIB-0168"),
										toStr("FORM"),
										toStr("*NOTE* No address exists for this address type or address is inactive")));
						executeAction("RESET_RECORD");
						return;
					}
					ptiCursor2.close();
					//
					if (!spremrgElement.getSpremrgNatnCode().isNull()) {
						spremrgElement.setNatnDescription(GbStvnatn
								.fGetDescription(spremrgElement
										.getSpremrgNatnCode()));
						if (spremrgElement.getNatnDescription().isNull()) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0169"),
											toStr("FORM"),
											toStr("*ERROR* Invalid nation code; press LIST for valid codes")));
							throw new ApplicationException();
						}
					}
					//
					// Setting query parameters
					ptiCursor4.addParameter("KEY_BLOCK_PIDM", getFormModel()
							.getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					ptiCursor4.addParameter("SPREMRG_SPREMRG_ATYP_CODE",
							spremrgElement.getSpremrgAtypCode());
					ptiCursor4.addParameter("SPREMRG_PAGE0_SEQNO",
							spremrgElement.getPage0Seqno());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor4.
					ptiCursor4.open();
					ResultSet ptiCursor4Results = ptiCursor4.fetchInto();
					if (ptiCursor4Results != null) {
						spremrgElement
								.setSpremrgCtryCodePhone(ptiCursor4Results
										.getStr(0));
						spremrgElement.setSpremrgPhoneArea(ptiCursor4Results
								.getStr(1));
						spremrgElement.setSpremrgPhoneNumber(ptiCursor4Results
								.getStr(2));
						spremrgElement.setSpremrgPhoneExt(ptiCursor4Results
								.getStr(3));
					}
					ptiCursor4.close();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			} finally {
				ptiCursor2.close();
				ptiCursor4.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ATYP_CODE.KEY-CQUERY
	 * :GLOBAL.KEY_IDNO := :KEY_BLOCK.ID; :GLOBAL.VALUE := ''; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE; :GLOBAL.PIDM :=
	 * :KEY_BLOCK.PIDM; EXECUTE_TRIGGER('GO_ADDR_FORM'); -- IF :GLOBAL.VALUE IS
	 * NOT NULL THEN :SPREMRG.SPREMRG_ATYP_CODE := :GLOBAL.VALUE; NEXT_FIELD;
	 * G$_CHECK_FAILURE; IF G$_MASKS.G$_DID_MASK_RESTRICT
	 * (:SYSTEM.CURRENT_FORM,'SPREMRG','SPREMRG_CTRY_CODE_PHONE') = 'N' THEN
	 * GO_ITEM('SPREMRG.SPREMRG_CTRY_CODE_PHONE'); ELSE
	 * GO_ITEM('SPREMRG.SPREMRG_PHONE_AREA'); END IF; G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPREMRG_ATYP_CODE", function = KeyFunction.COUNT_QUERY)
	public void spremrgAtypCode_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		setGlobal("KEY_IDNO", getFormModel().getBusinessObject("KEY_BLOCK")
				.getValue("ID"));
		setGlobal("VALUE", toStr(""));
		//
		executeAction("G$_REVOKE_ACCESS");
		getContainer().getGoqrpls().gCheckFailure();
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		setGlobal("PIDM", getFormModel().getBusinessObject("KEY_BLOCK")
				.getValue("PIDM"));
		executeAction("GO_ADDR_FORM");
		//
		if (!getGlobal("VALUE").isNull()) {
			spremrgElement.setSpremrgAtypCode(getGlobal("VALUE"));
			nextItem();
			getContainer().getGoqrpls().gCheckFailure();
			if (getContainer()
					.getGoqrpls()
					.getGMasks()
					.gDidMaskRestrict(toStr(getCurrentTaskName()),
							toStr("SPREMRG"), toStr("SPREMRG_CTRY_CODE_PHONE"))
					.equals("N")) {
				goItem(toStr("SPREMRG.SPREMRG_CTRY_CODE_PHONE"));
			} else {
				goItem(toStr("SPREMRG.SPREMRG_PHONE_AREA"));
			}
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ATYP_CODE.RESET_RECORD
	 * :SPREMRG.SPREMRG_HOUSE_NUMBER := ' '; :SPREMRG.SPREMRG_STREET_LINE1 :=
	 * ' '; :SPREMRG.SPREMRG_STREET_LINE2 := ' '; :SPREMRG.SPREMRG_STREET_LINE3
	 * := ' '; :SPREMRG.SPREMRG_STREET_LINE4 := ' '; :SPREMRG.SPREMRG_CITY :=
	 * ' '; :SPREMRG.SPREMRG_STAT_CODE := ' '; :SPREMRG.SPREMRG_ZIP := ' ';
	 * :SPREMRG.SPREMRG_NATN_CODE := ' '; :SPREMRG.NATN_DESCRIPTION := ' ';
	 * :SPREMRG.SPREMRG_CTRY_CODE_PHONE := ' '; :SPREMRG.SPREMRG_PHONE_AREA :=
	 * ' '; :SPREMRG.SPREMRG_PHONE_NUMBER := ' '; :SPREMRG.SPREMRG_PHONE_EXT :=
	 * ' ';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.RESET_RECORD
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "RESET_RECORD")
	public void spremrgAtypCode_ResetRecord() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		spremrgElement.setSpremrgHouseNumber(toStr(""));
		spremrgElement.setSpremrgStreetLine1(toStr(""));
		spremrgElement.setSpremrgStreetLine2(toStr(""));
		spremrgElement.setSpremrgStreetLine3(toStr(""));
		spremrgElement.setSpremrgStreetLine4(toStr(""));
		spremrgElement.setSpremrgCity(toStr(""));
		spremrgElement.setSpremrgStatCode(toStr(""));
		spremrgElement.setSpremrgZip(toStr(""));
		spremrgElement.setSpremrgNatnCode(toStr(""));
		spremrgElement.setNatnDescription(toStr(""));
		spremrgElement.setSpremrgCtryCodePhone(toStr(""));
		spremrgElement.setSpremrgPhoneArea(toStr(""));
		spremrgElement.setSpremrgPhoneNumber(toStr(""));
		spremrgElement.setSpremrgPhoneExt(toStr(""));
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPREMRG_ATYP_CODE_LBT")
	public void spremrgAtypCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
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
	 * SPREMRG_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPREMRG_STAT_CODE")
	public void spremrgStatCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_STAT_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spremrgStatCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPREMRG_STAT_CODE")
	public void spremrgStatCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPREMRG_STAT_CODE")
	public void spremrgStatCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_STAT_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_STAT_CODE", function = KeyFunction.NEXT_ITEM)
	public void spremrgStatCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_STAT_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_STAT_CODE", function = KeyFunction.ITEM_OUT)
	public void spremrgStatCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().postTextCode();
		getContainer().getGoqrpls().gCheckFailure();
		//
		if (spremrgElement.getSpremrgStatCode().isNull()) {
			spremrgElement.setStateDescription(toStr(""));
			return;
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_STAT_CODE.POST-CHANGE BEGIN
	 * :SPREMRG.STATE_DESCRIPTION :=
	 * GB_STVSTAT.F_GET_DESCRIPTION(:SPREMRG.SPREMRG_STAT_CODE); IF
	 * :SPREMRG.STATE_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0170','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_STAT_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPREMRG_STAT_CODE")
	public void spremrgStatCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		try {
			spremrgElement.setStateDescription(GbStvstat
					.fGetDescription(spremrgElement.getSpremrgStatCode()));
			if (spremrgElement.getStateDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0170"),
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
	 * SPREMRG_STAT_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPREMRG_STAT_CODE_LBT")
	public void spremrgStatCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * STATE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "STATE_DESCRIPTION", function = KeyFunction.ITEM_CHANGE)
	public void stateDescription_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPREMRG_ZIP")
	public void spremrgZip_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_ZIP", function = KeyFunction.ITEM_CHANGE)
	public void spremrgZip_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPREMRG_ZIP")
	public void spremrgZip_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPREMRG_ZIP")
	public void spremrgZip_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_ZIP", function = KeyFunction.ITEM_OUT)
	public void spremrgZip_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ZIP.KEY-LISTVAL
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GTVZIPC','QUERY'); -- IF
	 * :GLOBAL.VALUE IS NULL THEN RETURN; ELSE :SPREMRG.SPREMRG_ZIP :=
	 * :GLOBAL.VALUE; EXECUTE_TRIGGER('ADDR_DEFAULT_NXTFLD'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-LISTVAL", item = "SPREMRG_ZIP", function = KeyFunction.LIST_VALUES)
	public void spremrgZip_ListValues() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		executeAction("G$_REVOKE_ACCESS");
		getContainer().getGoqrpls().gCheckFailure();
		getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("GTVZIPC"), toStr("QUERY"));
		//
		if (getGlobal("VALUE").isNull()) {
			return;
		} else {
			spremrgElement.setSpremrgZip(getGlobal("VALUE"));
			executeAction("ADDR_DEFAULT_NXTFLD");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ZIP.KEY-NEXT-ITEM IF
	 * :SPREMRG.SPREMRG_ZIP IS NULL THEN NEXT_FIELD; ELSE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS'); IF (:SPREMRG.NO_ADDR_INFO = 1)
	 * THEN EXECUTE_TRIGGER('ADDR_DEFAULT_NXTFLD'); ELSE NEXT_FIELD; END IF; END
	 * IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_ZIP", function = KeyFunction.NEXT_ITEM)
	public void spremrgZip_keyNexItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		if (spremrgElement.getSpremrgZip().isNull()) {
			nextItem();
		} else {
			executeAction("CHECK_ADDRESS_EXISTS");
			if ((spremrgElement.getNoAddrInfo().equals(1))) {
				executeAction("ADDR_DEFAULT_NXTFLD");
			} else {
				nextItem();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ZIP.KEY-PREV-ITEM IF
	 * :SPREMRG.SPREMRG_ZIP IS NULL THEN PREVIOUS_FIELD; ELSE
	 * EXECUTE_TRIGGER('CHECK_ADDRESS_EXISTS'); IF (:SPREMRG.NO_ADDR_INFO = 1)
	 * THEN IF G$_CITY_STATE_NATN(:SPREMRG.SPREMRG_ZIP, :SPREMRG.SPREMRG_CITY,
	 * :SPREMRG.SPREMRG_STAT_CODE, :SPREMRG.SPREMRG_NATN_CODE,
	 * :SPREMRG.PARM_CNTY) THEN PREVIOUS_FIELD; PREVIOUS_FIELD; ELSE NEXT_FIELD;
	 * GO_ITEM('SPREMRG.SPREMRG_STAT_CODE'); END IF; ELSE PREVIOUS_FIELD; END
	 * IF; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.KEY-PREV-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PREV-ITEM", item = "SPREMRG_ZIP", function = KeyFunction.PREVIOUS_ITEM)
	public void spremrgZip_PreviousItem() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		if (spremrgElement.getSpremrgZip().isNull()) {
			previousItem();
		} else {
			executeAction("CHECK_ADDRESS_EXISTS");
			if ((spremrgElement.getNoAddrInfo().equals(1))) {
				Ref<NString> zipIn_ref = new Ref<NString>(
						spremrgElement.getSpremrgZip());
				Ref<NString> cityOut_ref = new Ref<NString>(
						spremrgElement.getSpremrgCity());
				Ref<NString> stateOut_ref = new Ref<NString>(
						spremrgElement.getSpremrgStatCode());
				Ref<NString> natnOut_ref = new Ref<NString>(
						spremrgElement.getSpremrgNatnCode());
				Ref<NString> cntyOut_ref = new Ref<NString>(
						spremrgElement.getParmCnty());

				NBool retval = getContainer().getGoqrpls().gCityStateNatn(zipIn_ref,
						cityOut_ref, stateOut_ref, natnOut_ref, cntyOut_ref);

				spremrgElement.setSpremrgZip(zipIn_ref.val);
				spremrgElement.setSpremrgCity(cityOut_ref.val);
				spremrgElement.setSpremrgStatCode(stateOut_ref.val);
				spremrgElement.setSpremrgNatnCode(natnOut_ref.val);
				spremrgElement.setParmCnty(cntyOut_ref.val);

				if (retval.getValue()) {
					previousItem();
					previousItem();
				} else {
					nextItem();
					goItem(toStr("SPREMRG.SPREMRG_STAT_CODE"));
				}
			} else {
				previousItem();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_ZIP.ADDR_DEFAULT_NXTFLD IF
	 * G$_CITY_STATE_NATN (:SPREMRG.SPREMRG_ZIP, :SPREMRG.SPREMRG_CITY,
	 * :SPREMRG.SPREMRG_STAT_CODE, :SPREMRG.SPREMRG_NATN_CODE,
	 * :SPREMRG.PARM_CNTY) THEN PREVIOUS_FIELD; PREVIOUS_FIELD; ELSE
	 * PREVIOUS_FIELD; NEXT_FIELD; NEXT_FIELD; PREVIOUS_FIELD; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP.ADDR_DEFAULT_NXTFLD
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "ADDR_DEFAULT_NXTFLD")
	public void spremrgZip_AddrDefaultNxtfld() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		Ref<NString> zipIn_ref = new Ref<NString>(
				spremrgElement.getSpremrgZip());
		Ref<NString> cityOut_ref = new Ref<NString>(
				spremrgElement.getSpremrgCity());
		Ref<NString> stateOut_ref = new Ref<NString>(
				spremrgElement.getSpremrgStatCode());
		Ref<NString> natnOut_ref = new Ref<NString>(
				spremrgElement.getSpremrgNatnCode());
		Ref<NString> cntyOut_ref = new Ref<NString>(
				spremrgElement.getParmCnty());

		NBool retval = getContainer().getGoqrpls().gCityStateNatn(zipIn_ref,
				cityOut_ref, stateOut_ref, natnOut_ref, cntyOut_ref);

		spremrgElement.setSpremrgZip(zipIn_ref.val);
		spremrgElement.setSpremrgCity(cityOut_ref.val);
		spremrgElement.setSpremrgStatCode(stateOut_ref.val);
		setItemIsValid("SPREMRG_STAT_CODE", false);
		validateItem("SPREMRG_STAT_CODE");
		spremrgElement.setSpremrgNatnCode(natnOut_ref.val);
		spremrgElement.setParmCnty(cntyOut_ref.val);

		if (retval.getValue()) {
			previousItem();
			previousItem();
		} else {
			previousItem();
			nextItem();
			nextItem();
			previousItem();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ZIP_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPREMRG_ZIP_LBT")
	public void spremrgZipLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPREMRG_NATN_CODE")
	public void spremrgNatnCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_NATN_CODE", function = KeyFunction.ITEM_CHANGE)
	public void spremrgNatnCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPREMRG_NATN_CODE")
	public void spremrgNatnCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_NATN_CODE", function = KeyFunction.NEXT_ITEM)
	public void spremrgNatnCode_keyNexItem() {

		// :SPREMRG.NATN_DESCRIPTION := null;
		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		getContainer().getGoqrpls().gCheckFailure();
		nextItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPREMRG_NATN_CODE.G$_SEARCH_PARAMETERS
	 * G$_SEARCH.PARAMETERS('STVNATN_CODE', 'STVNATN_NATION', '');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.G$_SEARCH_PARAMETERS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPREMRG_NATN_CODE")
	public void spremrgNatnCode_GSearchParameters() {

		getContainer()
				.getGoqrpls()
				.getGSearch()
				.parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"),
						toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_NATN_CODE.POST-TEXT-ITEM
	 * G$_SEARCH.POST_TEXT_CODE; IF :SPREMRG.SPREMRG_NATN_CODE IS NULL THEN
	 * :SPREMRG.NATN_DESCRIPTION := ''; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_NATN_CODE", function = KeyFunction.ITEM_OUT)
	public void spremrgNatnCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		getContainer().getGoqrpls().getGSearch().postTextCode();
		if (spremrgElement.getSpremrgNatnCode().isNull()) {
			spremrgElement.setNatnDescription(toStr(""));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_NATN_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPREMRG.NATN_DESCRIPTION :=
	 * GB_STVNATN.F_GET_DESCRIPTION(:SPREMRG.SPREMRG_NATN_CODE); IF
	 * :SPREMRG.NATN_DESCRIPTION IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0171','FORM','*ERROR* Invalid code; press
	 * LIST for valid codes')); :SPREMRG.NATN_DESCRIPTION := NULL; RAISE
	 * FORM_TRIGGER_FAILURE; END IF; -- :GLOBAL.QUERY_MODE := '0'; EXCEPTION
	 * WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0'; RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPREMRG_NATN_CODE")
	public void spremrgNatnCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			spremrgElement.setNatnDescription(GbStvnatn
					.fGetDescription(spremrgElement.getSpremrgNatnCode()));
			if (spremrgElement.getNatnDescription().isNull()) {
				errorMessage(GNls
						.Fget(toStr("GOQCLIB-0171"),
								toStr("FORM"),
								toStr("*ERROR* Invalid code; press LIST for valid codes")));
				spremrgElement.setNatnDescription(toStr(null));
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
	 * SPREMRG_NATN_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPREMRG_NATN_CODE_LBT")
	public void spremrgNatnCodeLbt_click() {

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
	 * Original PL/SQL code code for TRIGGER SPREMRG_CTRY_CODE_PHONE.KEY-CQUERY
	 * EXECUTE_TRIGGER('CALL_PHONE_FORM'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_CTRY_CODE_PHONE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPREMRG_CTRY_CODE_PHONE", function = KeyFunction.COUNT_QUERY)
	public void spremrgCtryCodePhone_TotalResults() {

		executeAction("CALL_PHONE_FORM");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_PHONE_AREA.KEY-CQUERY
	 * EXECUTE_TRIGGER('CALL_PHONE_FORM'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_PHONE_AREA.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPREMRG_PHONE_AREA", function = KeyFunction.COUNT_QUERY)
	public void spremrgPhoneArea_TotalResults() {

		executeAction("CALL_PHONE_FORM");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_PHONE_NUMBER.KEY-CQUERY
	 * EXECUTE_TRIGGER('CALL_PHONE_FORM'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_PHONE_NUMBER.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPREMRG_PHONE_NUMBER", function = KeyFunction.COUNT_QUERY)
	public void spremrgPhoneNumber_TotalResults() {

		executeAction("CALL_PHONE_FORM");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPREMRG_PHONE_EXT.KEY-CQUERY
	 * EXECUTE_TRIGGER('CALL_PHONE_FORM'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_PHONE_EXT.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPREMRG_PHONE_EXT", function = KeyFunction.COUNT_QUERY)
	public void spremrgPhoneExt_TotalResults() {

		executeAction("CALL_PHONE_FORM");
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
	 * GO_ITEM('SPREMRG.SPREMRG_PHONE_AREA'); DO_KEY('COUNT_QUERY');
	 * G$_CHECK_FAILURE;
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

		goItem(toStr("SPREMRG.SPREMRG_PHONE_AREA"));
		executeAction("COUNT_QUERY");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPREMRG_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void spremrgActivityDate_keyNexItem() {

		// :SPREMRG.ATYP_DESCRIPTION := null;
		getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
		getContainer().getGoqrpls().gCheckFailure();
		nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPREMRG_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void spremrgActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPREMRG_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void spremrgActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_RELT_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPREMRG_RELT_CODE")
	public void spremrgReltCode_validate() {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);
		if (!spremrgElement.getSpremrgReltCode().isNull())
			this.spremrgReltCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPREMRG.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void spremrg_AfterQuery(RowAdapterEvent args) {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) args.getRow();
		try {
			spremrgElement.setLockDbValues(true);

			if (!spremrgElement.getSpremrgReltCode().isNull())
				this.spremrgReltCode_PostChange();
		} finally {
			spremrgElement.setLockDbValues(false);
		}

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_ATYP_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPREMRG_ATYP_CODE")
	public void spremrgAtypCode_validate() {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);
		if (!spremrgElement.getSpremrgAtypCode().isNull()) 
			this.spremrgAtypCode_PostChange();
		// cas ??? 
		//MORPHIS TODO : ??? When  SPREMRG_ATYP_CODE is cleaned the description is not
		//It should trigger PostChange() but in this case unwanted invalid item messages appears  
		else
			spremrgElement.setAtypDescription(NString.EmptyString);

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_STAT_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPREMRG_STAT_CODE")
	public void spremrgStatCode_validate() {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);
		if (!spremrgElement.getSpremrgStatCode().isNull())
			this.spremrgStatCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPREMRG_NATN_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPREMRG_NATN_CODE")
	public void spremrgNatnCode_validate() {

		SpremrgAdapter spremrgElement = (SpremrgAdapter) this.getFormModel()
				.getSpremrg().getRowAdapter(true);
		if (!spremrgElement.getSpremrgNatnCode().isNull())
			this.spremrgNatnCode_PostChange();

	}

	public void spremrgReltCode_doubleClick() {
		spremrgReltCode_WhenMouseDoubleclick();
	}

	public void spremrgAtypCode_doubleClick() {
		spremrgAtypCode_WhenMouseDoubleclick();
	}

	public void spremrgStatCode_doubleClick() {
		spremrgStatCode_WhenMouseDoubleclick();
	}

	public void spremrgZip_doubleClick() {
		spremrgZip_WhenMouseDoubleclick();
	}

	public void spremrgNatnCode_doubleClick() {
		spremrgNatnCode_WhenMouseDoubleclick();
	}

}
