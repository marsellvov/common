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

public class GoremalController extends AbstractSupportCodeObject {

//	private GoqolibFormController getGoqolibFormController() {
//		return (net.hedtech.general.common.libraries.Goqolib.services.GoqolibFormController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GOQOLIB_PC");
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
	
	public GoremalController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER GOREMAL.WHEN-NEW-BLOCK-INSTANCE
	 * :email_ind := ''; --set initial value :cmt_result := 'success'; --set
	 * initial value -- IF :ID IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0147','FORM','*ERROR* Invalid code; press
	 * LIST for valid value.') ); GO_BLOCK('key_block'); ELSE
	 * EXECUTE_TRIGGER('DISABLE_KEYS'); EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
	 * CLEAR_RECORD; -- EXECUTE_QUERY(ALL_RECORDS); G$_CHECK_FAILURE; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL.WHEN-NEW-BLOCK-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-BLOCK-INSTANCE", function = KeyFunction.BLOCK_CHANGE)
	public void goremal_blockChange() {

		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue("EMAIL_IND",
				"");
		// set initial value
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		getFormModel().getBusinessObject("FORM_HEADER").setValue("CMT_RESULT",
				"success");
		// set initial value
		//
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		if (toStr(getFormModel().getBusinessObject("KEY_BLOCK").getValue("ID"))
				.isNull()) {
			errorMessage(GNls.Fget(toStr("GOQCLIB-0147"), toStr("FORM"),
					toStr("*ERROR* Invalid code; press LIST for valid value.")));
			goBlock(toStr("key_block"));
		} else {
			executeAction("DISABLE_KEYS");
			executeAction("ENABLE_TAB_PAGES");
			clearRecord();
			//
			// MORPHIS: Query all records
			this.getContainer().getServices().executeQuery();
			getContainer().getGoqrpls().gCheckFailure();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.POST-QUERY -- -- get the
	 * corresponding emal_code and display it on query -- DECLARE CURSOR s1 IS
	 * SELECT gtvemal_desc, gtvemal_url_ind FROM gtvemal WHERE gtvemal_code =
	 * :GOREMAL.goremal_emal_code; BEGIN OPEN s1; FETCH s1 INTO
	 * :GOREMAL.email_desc, :GOREMAL.url_ind; CLOSE s1;
	 * 
	 * select goremal_activity_date into :GOREMAL.GOREMAL_ACTIVITY_DATE from
	 * goremal where GOREMAL.ROWID = :GOREMAL.ROWID;
	 * 
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void goremal_AfterQuery(RowAdapterEvent args) {

		//
		// get the corresponding emal_code and display it on query
		//
		GoremalAdapter goremalElement = (GoremalAdapter) args.getRow();

		int rowCount = 0;
		// F2J_WARNING : Post-query code is executed once for every row
		// retrieved. If you expect the query to return many records, this may
		// cause a performance problem.
		{
			String sqls1 = "SELECT gtvemal_desc, gtvemal_url_ind "
					+ " FROM gtvemal "
					+ " WHERE gtvemal_code = :GOREMAL_GOREMAL_EMAL_CODE ";
			DataCursor s1 = new DataCursor(sqls1);
			try {
				// Setting query parameters
				s1.addParameter("GOREMAL_GOREMAL_EMAL_CODE",
						goremalElement.getGoremalEmalCode());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable s1.
				s1.open();
				ResultSet s1Results = s1.fetchInto();
				if (s1Results != null) {
					goremalElement.setEmailDesc(s1Results.getStr(0));
					goremalElement.setUrlInd(s1Results.getStr(1));
				}
				s1.close();
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				String sql1 = "SELECT goremal_activity_date "
						+ " FROM goremal "
						+ " WHERE GOREMAL.ROWID = :GOREMAL_ROWID ";
				DataCommand command1 = new DataCommand(sql1);
				// Setting query parameters
				command1.addParameter("GOREMAL_ROWID",
						goremalElement.getROWID());
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if (results1.hasData()) {
					goremalElement.setGoremalActivityDate(results1.getDate(0));
				}
				results1.close();
			} finally {
				s1.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.POST-BLOCK NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void goremal_blockOut() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.PRE-INSERT
	 * EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void goremal_BeforeRowInsert(RowAdapterEvent args) {

		executeAction("PRE_COMMIT_VALIDATE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.ON-INSERT BEGIN
	 * GB_EMAIL.P_CREATE(p_PIDM =>:GOREMAL.GOREMAL_PIDM, p_EMAL_CODE
	 * =>:GOREMAL.GOREMAL_EMAL_CODE, p_EMAIL_ADDRESS
	 * =>:GOREMAL.GOREMAL_EMAIL_ADDRESS, p_STATUS_IND
	 * =>:GOREMAL.GOREMAL_STATUS_IND, p_PREFERRED_IND
	 * =>:GOREMAL.GOREMAL_PREFERRED_IND, p_USER_ID =>:GOREMAL.GOREMAL_USER_ID,
	 * p_COMMENT =>:GOREMAL.GOREMAL_COMMENT, p_DISP_WEB_IND
	 * =>:GOREMAL.GOREMAL_DISP_WEB_IND, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_ROWID_OUT =>:GOREMAL.ROWID);
	 * 
	 * :GOREMAL_ACTIVITY_DATE := SYSDATE;
	 * 
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void goremal_RowInsert(RowAdapterEvent args) {

		GoremalAdapter goremalElement = (GoremalAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbEmail.pCreate(/* pPidm=> */goremalElement.getGoremalPidm(), /*
																		 * pEmalCode
																		 * =>
																		 */
					goremalElement.getGoremalEmalCode(), /* pEmailAddress=> */
					goremalElement.getGoremalEmailAddress(), /* pStatusInd=> */
					goremalElement.getGoremalStatusInd(), /* pPreferredInd=> */
					goremalElement.getGoremalPreferredInd(), /* pUserId=> */
					goremalElement.getGoremalUserId(), /* pComment=> */
					goremalElement.getGoremalComment(), /* pDispWebInd=> */
					goremalElement.getGoremalDispWebInd(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), p_rowid_out_ref);
			goremalElement.setROWID(p_rowid_out_ref.val);
			goremalElement.setGoremalActivityDate(NDate.getNow());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.POST-INSERT NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.POST-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowInsert
	public void goremal_AfterRowInsert(RowAdapterEvent args) {

	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.PRE-UPDATE
	 * EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void goremal_BeforeRowUpdate(RowAdapterEvent args) {

		executeAction("PRE_COMMIT_VALIDATE");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.ON-UPDATE BEGIN
	 * GB_EMAIL.P_UPDATE(p_PIDM =>:GOREMAL.GOREMAL_PIDM, p_EMAL_CODE
	 * =>:GOREMAL.GOREMAL_EMAL_CODE, p_EMAIL_ADDRESS
	 * =>:GOREMAL.GOREMAL_EMAIL_ADDRESS, p_STATUS_IND
	 * =>:GOREMAL.GOREMAL_STATUS_IND, p_PREFERRED_IND
	 * =>:GOREMAL.GOREMAL_PREFERRED_IND, p_USER_ID =>:GOREMAL.GOREMAL_USER_ID,
	 * p_COMMENT =>:GOREMAL.GOREMAL_COMMENT, p_DISP_WEB_IND
	 * =>:GOREMAL.GOREMAL_DISP_WEB_IND, p_DATA_ORIGIN =>:GLOBAL.DATA_ORIGIN,
	 * p_ROWID =>:GOREMAL.ROWID);
	 * 
	 * :GOREMAL_ACTIVITY_DATE := SYSDATE;
	 * 
	 * EXCEPTION WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE
	 * FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void goremal_RowUpdate(RowAdapterEvent args) {

		GoremalAdapter goremalElement = (GoremalAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbEmail.pUpdate(/* pPidm=> */goremalElement.getGoremalPidm(), /*
																		 * pEmalCode
																		 * =>
																		 */
					goremalElement.getGoremalEmalCode(), /* pEmailAddress=> */
					goremalElement.getGoremalEmailAddress(), /* pStatusInd=> */
					goremalElement.getGoremalStatusInd(), /* pPreferredInd=> */
					goremalElement.getGoremalPreferredInd(), /* pUserId=> */
					goremalElement.getGoremalUserId(), /* pComment=> */
					goremalElement.getGoremalComment(), /* pDispWebInd=> */
					goremalElement.getGoremalDispWebInd(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), /* pRowid=> */
					goremalElement.getROWID());
			goremalElement.setGoremalActivityDate(NDate.getNow());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.POST-UPDATE BEGIN SELECT
	 * ROWID INTO :GOREMAL.ROWID FROM GOREMAL WHERE goremal_pidm =
	 * :GOREMAL.GOREMAL_PIDM AND goremal_emal_code = :GOREMAL.GOREMAL_EMAL_CODE
	 * AND goremal_email_address = :GOREMAL.GOREMAL_EMAIL_ADDRESS; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.POST-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterRowUpdate
	public void goremal_AfterRowUpdate(RowAdapterEvent args) {

		GoremalAdapter goremalElement = (GoremalAdapter) args.getRow();
		int rowCount = 0;
		
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		String sql1 = "SELECT ROWID "
				+ " FROM GOREMAL "
				+ " WHERE goremal_pidm = :GOREMAL_GOREMAL_PIDM AND goremal_emal_code = :GOREMAL_GOREMAL_EMAL_CODE AND goremal_email_address = :GOREMAL_GOREMAL_EMAIL_ADDRESS ";
		DataCommand command1 = new DataCommand(sql1);
		// Setting query parameters
		command1.addParameter("GOREMAL_GOREMAL_PIDM", goremalElement.getGoremalPidm());
		command1.addParameter("GOREMAL_GOREMAL_EMAL_CODE", goremalElement.getGoremalEmalCode());
		command1.addParameter("GOREMAL_GOREMAL_EMAIL_ADDRESS", goremalElement.getGoremalEmailAddress());
		ResultSet results1 = command1.executeQuery();
		rowCount = command1.getRowCount();
		if (results1.hasData()) {
			goremalElement.setROWID((java.sql.RowId)results1.getObject(0));
		}
		results1.close();
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.ON-DELETE BEGIN
	 * GB_EMAIL.P_DELETE(p_PIDM =>:GOREMAL.GOREMAL_PIDM, p_EMAL_CODE
	 * =>:GOREMAL.GOREMAL_EMAL_CODE, p_EMAIL_ADDRESS
	 * =>:GOREMAL.GOREMAL_EMAIL_ADDRESS, p_ROWID =>:GOREMAL.ROWID); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void goremal_RowDelete(RowAdapterEvent args) {

		GoremalAdapter goremalElement = (GoremalAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbEmail.pDelete(/* pPidm=> */goremalElement.getGoremalPidm(), /*
																		 * pEmalCode
																		 * =>
																		 */
					goremalElement.getGoremalEmalCode(), /* pEmailAddress=> */
					goremalElement.getGoremalEmailAddress(), /* pRowid=> */
					goremalElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.KEY-COMMIT COMMIT_FORM; IF
	 * :cmt_result = 'success' THEN :email_ind := ''; -- reset to initial value
	 * END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void goremal_Save() {

		commitTask();
		// F2J_TO_COMPLETE : The conversion process could not determine the name
		// of the intended business object. Determine the correct Business
		// Object name and complete the code.
		if (getFormModel().getBusinessObject("FORM_HEADER")
				.getValue("CMT_RESULT").equals("success")) {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			getFormModel().getBusinessObject("FORM_HEADER").setValue(
					"EMAIL_IND", "");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.KEY-NXTBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0148','FORM','Email information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void goremal_NextBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0148"),
							toStr("FORM"),
							toStr("Email information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.KEY-PRVBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0149','FORM','Email information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void goremal_PreviousBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0149"),
							toStr("FORM"),
							toStr("Email information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.DISABLE_KEYS
	 * SET_ITEM_PROPERTY('ID', ENABLED, PROPERTY_FALSE);
	 * SET_ITEM_PROPERTY('ID_LBT', ENABLED, PROPERTY_FALSE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.DISABLE_KEYS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "DISABLE_KEYS")
	public void goremal_DisableKeys() {

		setItemEnabled("ID", false);
		setItemEnabled("ID_LBT", false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.ENABLE_KEYS
	 * SET_ITEM_PROPERTY('ID', ENABLED, PROPERTY_TRUE); SET_ITEM_PROPERTY('ID',
	 * NAVIGABLE, PROPERTY_TRUE); SET_ITEM_PROPERTY('ID_LBT', ENABLED,
	 * PROPERTY_TRUE);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.ENABLE_KEYS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "ENABLE_KEYS")
	public void goremal_EnableKeys() {

		setItemEnabled("ID", true);
		setItemNavigable("ID", true);
		setItemEnabled("ID_LBT", true);
	}

	/*
	 * Original PL/SQL code code for TRIGGER GOREMAL.PRE_COMMIT_VALIDATE DECLARE
	 * PTI_INTO_TEMP VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM DUAL
	 * WHERE EXISTS (SELECT 'x' FROM goremal WHERE
	 * goremal_pidm=:GOREMAL.goremal_pidm AND goremal_preferred_ind='Y' AND
	 * :GOREMAL.goremal_preferred_ind='Y' AND (GOREMAL.ROWID <> :GOREMAL.ROWID
	 * OR :GOREMAL.ROWID IS NULL)); BEGIN IF :GOREMAL.GOREMAL_EMAL_CODE IS NULL
	 * THEN MESSAGE(G$_NLS.GET('GOQCLIB-0150','FORM','*ERROR* E-mail type code
	 * is required.')); :cmt_result := 'failed'; RAISE FORM_TRIGGER_FAILURE; END
	 * IF; -- :GOREMAL.goremal_pidm := :KEY_BLOCK.pidm; :GOREMAL.goremal_user_id
	 * := :GLOBAL.CURRENT_USER; -- OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN CLOSE PTI_CURSOR; -- IF
	 * :email_ind = 'Y' OR :email_ind = 'F' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0151','FORM','*ERROR* There may be only one
	 * preferred e-mail address type')); :cmt_result := 'failed'; RAISE
	 * FORM_TRIGGER_FAILURE; ELSIF :email_ind = 'G' THEN :email_ind := 'F'; --
	 * F: one row has been set to preferred one :cmt_result := 'success'; END
	 * IF; -- -- cursor notfound (no pref in db on this pidm) -- ELSE CLOSE
	 * PTI_CURSOR; -- IF :GOREMAL.goremal_preferred_ind = 'Y' THEN IF :email_ind
	 * = 'F' THEN MESSAGE(G$_NLS.Get('GOQCLIB-0152','FORM','*ERROR* There may be
	 * only one preferred e-mail address type')); :cmt_result := 'failed'; RAISE
	 * FORM_TRIGGER_FAILURE; ELSE :email_ind :='F'; :cmt_result := 'success';
	 * END IF; END IF; END IF; -- -- checking to make sure preferred email
	 * address type is not inactive. -- IF :GOREMAL.goremal_preferred_ind = 'Y'
	 * AND :GOREMAL.goremal_status_ind = 'I' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0153','FORM','*ERROR* The preferred E-mail
	 * address type should be Active')); RAISE FORM_TRIGGER_FAILURE; END IF; --
	 * IF :GOREMAL.goremal_email_address IS NULL THEN
	 * G$_CHECK_VALUE(TRUE,G$_NLS.Get('GOQCLIB-0154','FORM','*ERROR* E-mail
	 * address is required.'),TRUE); END IF; -- IF :GOREMAL.GOREMAL_USER_ID IS
	 * NULL THEN :GOREMAL.GOREMAL_USER_ID := USER; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL.PRE_COMMIT_VALIDATE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE_COMMIT_VALIDATE")
	public void goremal_PreCommitValidate() {

		// F2J_WARNING : Caution, the variable may be null.
		GoremalAdapter goremalElement = (GoremalAdapter) this.getFormModel()
				.getGoremal().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM DUAL "
					+ " WHERE  EXISTS(SELECT 'x' "
					+ " FROM goremal "
					+ " WHERE goremal_pidm = :GOREMAL_GOREMAL_PIDM AND goremal_preferred_ind = 'Y' AND :GOREMAL_GOREMAL_PREFERRED_IND = 'Y' AND (GOREMAL.ROWID <> :GOREMAL_ROWID OR :GOREMAL_ROWID IS NULL) ) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				if (goremalElement.getGoremalEmalCode().isNull()) {
					errorMessage(GNls.Fget(toStr("GOQCLIB-0150"), toStr("FORM"),
							toStr("*ERROR* E-mail type code is required.")));
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					getFormModel().getBusinessObject("FORM_HEADER").setValue(
							"CMT_RESULT", "failed");
					throw new ApplicationException();
				}
				//
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				goremalElement.setGoremalPidm(toNumber(getFormModel()
						.getBusinessObject("KEY_BLOCK").getValue("PIDM")));
				goremalElement.setGoremalUserId(getGlobal("CURRENT_USER"));
				//
				// Setting query parameters
				ptiCursor.addParameter("GOREMAL_GOREMAL_PIDM",
						goremalElement.getGoremalPidm());
				ptiCursor.addParameter("GOREMAL_GOREMAL_PREFERRED_IND",
						goremalElement.getGoremalPreferredInd());
				ptiCursor.addParameter("GOREMAL_ROWID",
						goremalElement.getROWID());
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
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					if (getFormModel().getBusinessObject("FORM_HEADER")
							.getValue("EMAIL_IND").equals("Y")
							|| getFormModel().getBusinessObject("FORM_HEADER")
									.getValue("EMAIL_IND").equals("F")) {
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0151"),
										toStr("FORM"),
										toStr("*ERROR* There may be only one preferred e-mail address type")));
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						getFormModel().getBusinessObject("FORM_HEADER")
								.setValue("CMT_RESULT", "failed");
						throw new ApplicationException();
					} else if (getFormModel().getBusinessObject("FORM_HEADER")
							.getValue("EMAIL_IND").equals("G")) {
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						getFormModel().getBusinessObject("FORM_HEADER")
								.setValue("EMAIL_IND", "F");
						// F: one row has been set to preferred one
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						getFormModel().getBusinessObject("FORM_HEADER")
								.setValue("CMT_RESULT", "success");
					}
				} else {
					ptiCursor.close();
					//
					if (goremalElement.getGoremalPreferredInd().equals("Y")) {
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						if (getFormModel().getBusinessObject("FORM_HEADER")
								.getValue("EMAIL_IND").equals("F")) {
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0152"),
											toStr("FORM"),
											toStr("*ERROR* There may be only one preferred e-mail address type")));
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							getFormModel().getBusinessObject("FORM_HEADER")
									.setValue("CMT_RESULT", "failed");
							throw new ApplicationException();
						} else {
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							getFormModel().getBusinessObject("FORM_HEADER")
									.setValue("EMAIL_IND", "F");
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							getFormModel().getBusinessObject("FORM_HEADER")
									.setValue("CMT_RESULT", "success");
						}
					}
				}
				//
				// checking to make sure preferred email address type is not
				// inactive.
				//
				if (goremalElement.getGoremalPreferredInd().equals("Y")
						&& goremalElement.getGoremalStatusInd().equals("I")) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0153"),
									toStr("FORM"),
									toStr("*ERROR* The preferred E-mail address type should be Active")));
					throw new ApplicationException();
				}
				//
				if (goremalElement.getGoremalEmailAddress().isNull()) {
					getContainer()
							.getGoqrpls()
							.gCheckValue(
									toBool(NBool.True),
									GNls.Fget(
											toStr("GOQCLIB-0154"),
											toStr("FORM"),
											toStr("*ERROR* E-mail address is required.")),
									toBool(NBool.True));
				}
				//
				if (goremalElement.getGoremalUserId().isNull()) {
					goremalElement.setGoremalUserId(getUser());
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: GOREMAL.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void goremal_BeforeQuery(QueryEvent args) {

		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"PIDM",
						toNumber(getFormModel().getBusinessObject("KEY_BLOCK")
								.getValue("PIDM"))));

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "GOREMAL_EMAL_CODE")
	public void goremalEmalCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "GOREMAL_EMAL_CODE", function = KeyFunction.ITEM_CHANGE)
	public void goremalEmalCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "GOREMAL_EMAL_CODE")
	public void goremalEmalCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "GOREMAL_EMAL_CODE")
	public void goremalEmalCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "GOREMAL_EMAL_CODE", function = KeyFunction.NEXT_ITEM)
	public void goremalEmalCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "GOREMAL_EMAL_CODE", function = KeyFunction.ITEM_OUT)
	public void goremalEmalCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_EMAL_CODE.WHEN-VALIDATE-ITEM DECLARE CURSOR s1 IS SELECT
	 * gtvemal_desc, gtvemal_url_ind FROM gtvemal WHERE
	 * gtvemal_code=:GOREMAL.GOREMAL_EMAL_CODE; BEGIN IF
	 * :GOREMAL.GOREMAL_EMAL_CODE IS NULL THEN :GOREMAL.EMAIL_DESC := '';
	 * RETURN; END IF; -- OPEN s1; FETCH s1 INTO :GOREMAL.email_desc,
	 * :GOREMAL.url_ind; IF s1%NOTFOUND THEN CLOSE s1;
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0155','FORM','*ERROR* Invalid E-mail code;
	 * press LIST for valid code.')); RAISE FORM_TRIGGER_FAILURE; END IF; CLOSE
	 * s1; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "GOREMAL_EMAL_CODE")
	public void goremalEmalCode_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		GoremalAdapter goremalElement = (GoremalAdapter) this.getFormModel()
				.getGoremal().getRowAdapter(true);
		
		if(goremalElement == null)
			return;

		int rowCount = 0;
		{
			String sqls1 = "SELECT gtvemal_desc, gtvemal_url_ind "
					+ " FROM gtvemal "
					+ " WHERE gtvemal_code = :GOREMAL_GOREMAL_EMAL_CODE ";
			DataCursor s1 = new DataCursor(sqls1);
			try {
				if (goremalElement.getGoremalEmalCode().isNull()) {
					goremalElement.setEmailDesc(toStr(""));
					return;
				}
				//
				// Setting query parameters
				s1.addParameter("GOREMAL_GOREMAL_EMAL_CODE",
						goremalElement.getGoremalEmalCode());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable s1.
				s1.open();
				ResultSet s1Results = s1.fetchInto();
				if (s1Results != null) {
					goremalElement.setEmailDesc(s1Results.getStr(0));
					goremalElement.setUrlInd(s1Results.getStr(1));
				}
				if (s1.notFound()) {
					s1.close();
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0155"),
									toStr("FORM"),
									toStr("*ERROR* Invalid E-mail code; press LIST for valid code.")));
					throw new ApplicationException();
				}
				s1.close();
			} finally {
				s1.close();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAL_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "GOREMAL_EMAL_CODE_LBT")
	public void goremalEmalCodeLbt_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * EMAIL_DESC.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "EMAIL_DESC", function = KeyFunction.ITEM_CHANGE)
	public void emailDesc_itemChange() {

		getGDescClass().itemChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_EMAIL_ADDRESS.WHEN-VALIDATE-ITEM DECLARE TEMP_EMAIL_ADDRESS
	 * GOREMAL.GOREMAL_EMAIL_ADDRESS%TYPE; AL_MSG VARCHAR2(255); AL_BTN
	 * NUMBER(2); BEGIN TEMP_EMAIL_ADDRESS :=
	 * REPLACE(:GOREMAL.GOREMAL_EMAIL_ADDRESS,' '); -- IF TEMP_EMAIL_ADDRESS <>
	 * :GOREMAL.GOREMAL_EMAIL_ADDRESS THEN AL_MSG := G$_NLS.Get('GOQCLIB-0156',
	 * 'FORM', 'This email address will be changed to %01%. Spaces are not
	 * allowed in an email address.', TEMP_EMAIL_ADDRESS );
	 * SET_ALERT_PROPERTY('G$_CAUTION_OK_ALERT', ALERT_MESSAGE_TEXT, AL_MSG);
	 * AL_BTN := SHOW_ALERT('G$_CAUTION_OK_ALERT');
	 * :GOREMAL.GOREMAL_EMAIL_ADDRESS := TEMP_EMAIL_ADDRESS; ELSE
	 * TEMP_EMAIL_ADDRESS := NULL; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_EMAIL_ADDRESS.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "GOREMAL_EMAIL_ADDRESS")
	public void goremalEmailAddress_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		GoremalAdapter goremalElement = (GoremalAdapter) this.getFormModel()
				.getGoremal().getRowAdapter(true);

		{
			NString tempEmailAddress = NString.getNull();
			NString alMsg = NString.getNull();
			NNumber alBtn = NNumber.getNull();
			tempEmailAddress = replace(goremalElement.getGoremalEmailAddress(),
					" ");
			//
			if (tempEmailAddress.notEquals(goremalElement
					.getGoremalEmailAddress())) {
				alMsg = GNls
						.Fget(toStr("GOQCLIB-0156"),
								toStr("FORM"),
								toStr("This email address will be changed to %01%. Spaces are not allowed in an email address."),
								tempEmailAddress);
				setAlertMessageText("G$_CAUTION_OK_ALERT", alMsg);
				alBtn = toNumber(showAlert("G$_CAUTION_OK_ALERT"));
				goremalElement.setGoremalEmailAddress(tempEmailAddress);
			} else {
				tempEmailAddress = toStr(null);
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_PREFERRED_IND.WHEN-CHECKBOX-CHANGED DECLARE PTI_INTO_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'x' FROM goremal WHERE
	 * goremal_pidm = :GOREMAL.goremal_pidm AND goremal_preferred_ind = 'Y' AND
	 * goremal.ROWID = :goremal.ROWID; BEGIN -- -- email_ind='G' indicates that
	 * preferred row from db is changed to non-preferred in form. --
	 * email_ind='Y' indicates that preferred row from db is not changed. --
	 * OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO PTI_INTO_TEMP; IF PTI_CURSOR%FOUND
	 * THEN IF :GOREMAL.goremal_preferred_ind = 'N' THEN :email_ind := 'G'; ELSE
	 * -- i.e. :goremal_preferred_ind = 'Y'; :email_ind := 'Y'; END IF; ELSE IF
	 * (:email_ind IS NULL OR :email_ind ='F') THEN IF
	 * :GOREMAL.goremal_preferred_ind = 'Y' THEN :email_ind := 'Y'; ELSE
	 * :email_ind :=''; END IF; END IF; END IF; CLOSE PTI_CURSOR; --
	 * IF(:GOREMAL.goremal_preferred_ind) = 'Y' THEN :GOREMAL.goremal_status_ind
	 * := 'A'; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_PREFERRED_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "GOREMAL_PREFERRED_IND")
	public void goremalPreferredInd_checkBoxChange() {

		// F2J_WARNING : Caution, the variable may be null.
		GoremalAdapter goremalElement = (GoremalAdapter) this.getFormModel()
				.getGoremal().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'x' "
					+ " FROM goremal "
					+ " WHERE goremal_pidm = :GOREMAL_GOREMAL_PIDM AND goremal_preferred_ind = 'Y' AND goremal.ROWID = :GOREMAL_ROWID ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//
				// email_ind='G' indicates that preferred row from db is changed
				// to non-preferred in form.
				// email_ind='Y' indicates that preferred row from db is not
				// changed.
				//
				// Setting query parameters
				ptiCursor.addParameter("GOREMAL_GOREMAL_PIDM",
						goremalElement.getGoremalPidm());
				ptiCursor.addParameter("GOREMAL_ROWID",
						goremalElement.getROWID());
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if (ptiCursorResults != null) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if (ptiCursor.found()) {
					if (goremalElement.getGoremalPreferredInd().equals("N")) {
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						getFormModel().getBusinessObject("FORM_HEADER")
								.setValue("EMAIL_IND", "G");
					} else {
						// i.e. :goremal_preferred_ind = 'Y';
						// F2J_TO_COMPLETE : The conversion process could not
						// determine the name of the intended business object.
						// Determine the correct Business Object name and
						// complete the code.
						getFormModel().getBusinessObject("FORM_HEADER")
								.setValue("EMAIL_IND", "Y");
					}
				} else {
					// F2J_TO_COMPLETE : The conversion process could not
					// determine the name of the intended business object.
					// Determine the correct Business Object name and complete
					// the code.
					if ((toStr(
							getFormModel().getBusinessObject("FORM_HEADER")
									.getValue("EMAIL_IND")).isNull() || getFormModel()
							.getBusinessObject("FORM_HEADER")
							.getValue("EMAIL_IND").equals("F"))) {
						if (goremalElement.getGoremalPreferredInd().equals("Y")) {
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							getFormModel().getBusinessObject("FORM_HEADER")
									.setValue("EMAIL_IND", "Y");
						} else {
							// F2J_TO_COMPLETE : The conversion process could
							// not determine the name of the intended business
							// object. Determine the correct Business Object
							// name and complete the code.
							getFormModel().getBusinessObject("FORM_HEADER")
									.setValue("EMAIL_IND", "");
						}
					}
				}
				ptiCursor.close();
				//
				if ((goremalElement.getGoremalPreferredInd()).equals("Y")) {
					goremalElement.setGoremalStatusInd(toStr("A"));
				}
			} finally {
				ptiCursor.close();
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_PREFERRED_IND.WHEN-VALIDATE-ITEM NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_PREFERRED_IND.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "GOREMAL_PREFERRED_IND")
	public void goremalPreferredInd_validate() {

	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_STATUS_IND.WHEN-CHECKBOX-CHANGED BEGIN -- -- If email account is
	 * inactive so can't be preferred -- IF :GOREMAL.goremal_status_ind = 'I'
	 * THEN :GOREMAL.goremal_preferred_ind:='N'; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_STATUS_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "GOREMAL_STATUS_IND")
	public void goremalStatusInd_checkBoxChange() {

		// F2J_WARNING : Caution, the variable may be null.
		GoremalAdapter goremalElement = (GoremalAdapter) this.getFormModel()
				.getGoremal().getRowAdapter(true);

		//
		// If email account is inactive so can't be preferred
		//
		if (goremalElement.getGoremalStatusInd().equals("I")) {
			goremalElement.setGoremalPreferredInd(toStr("N"));
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * GOREMAL_STATUS_IND.WHEN-VALIDATE-ITEM NULL;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_STATUS_IND.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "GOREMAL_STATUS_IND")
	public void goremalStatusInd_validate() {

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "GOREMAL_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void goremalActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "GOREMAL_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void goremalActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * GOREMAL_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "GOREMAL_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void goremalActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	public void goremalEmalCode_doubleClick() {
		goremalEmalCode_WhenMouseDoubleclick();
		
	}

}
