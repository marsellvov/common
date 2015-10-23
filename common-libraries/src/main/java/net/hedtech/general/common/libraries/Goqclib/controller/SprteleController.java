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

public class SprteleController extends AbstractSupportCodeObject {

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

	public SprteleController(ISupportCodeContainer container) {
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
	 * Original PL/SQL code code for TRIGGER SPRTELE.PRE-INSERT
	 * EXECUTE_TRIGGER('DO_EDITS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.PRE-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowInsert
	public void sprtele_BeforeRowInsert(RowAdapterEvent args) {

		executeAction("DO_EDITS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.ON-INSERT -- 82-1 add
	 * :SPRTELE.SPRTELE_CTRY_CODE_PHONE, to insert BEGIN
	 * GB_TELEPHONE.P_CREATE(p_PIDM =>:SPRTELE.SPRTELE_PIDM, p_TELE_CODE
	 * =>:SPRTELE.SPRTELE_TELE_CODE, p_PHONE_AREA =>:SPRTELE.SPRTELE_PHONE_AREA,
	 * p_PHONE_NUMBER =>:SPRTELE.SPRTELE_PHONE_NUMBER, p_PHONE_EXT
	 * =>:SPRTELE.SPRTELE_PHONE_EXT, p_STATUS_IND =>:SPRTELE.SPRTELE_STATUS_IND,
	 * p_ATYP_CODE =>:SPRTELE.SPRTELE_ATYP_CODE, p_ADDR_SEQNO
	 * =>:SPRTELE.SPRTELE_ADDR_SEQNO, p_PRIMARY_IND
	 * =>:SPRTELE.SPRTELE_PRIMARY_IND, p_UNLIST_IND
	 * =>:SPRTELE.SPRTELE_UNLIST_IND, p_COMMENT =>:SPRTELE.SPRTELE_COMMENT,
	 * p_INTL_ACCESS =>:SPRTELE.SPRTELE_INTL_ACCESS, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER,
	 * p_CTRY_code_PHONE =>:SPRTELE.SPRTELE_CTRY_CODE_PHONE, -- 82-1 p_SEQNO_OUT
	 * =>:SPRTELE.SPRTELE_SEQNO, p_ROWID_OUT =>:SPRTELE.ROWID);
	 * :SPRTELE.SPRTELE_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRTELE.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.ON-INSERT
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowInsert
	public void sprtele_RowInsert(RowAdapterEvent args) {

		// 82-1 add :SPRTELE.SPRTELE_CTRY_CODE_PHONE, to insert
		SprteleAdapter sprteleElement = (SprteleAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			Ref<NNumber> p_seqno_out_ref = new Ref<NNumber>();
			Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
			GbTelephone.pCreate(/* pPidm=> */sprteleElement.getSprtelePidm(), /*
																			 * pTeleCode
																			 * =
																			 * >
																			 */
					sprteleElement.getSprteleTeleCode(), /* pPhoneArea=> */
					sprteleElement.getSprtelePhoneArea(), /* pPhoneNumber=> */
					sprteleElement.getSprtelePhoneNumber(), /* pPhoneExt=> */
					sprteleElement.getSprtelePhoneExt(), /* pStatusInd=> */
					sprteleElement.getSprteleStatusInd(), /* pAtypCode=> */
					sprteleElement.getSprteleAtypCode(), /* pAddrSeqno=> */
					sprteleElement.getSprteleAddrSeqno(), /* pPrimaryInd=> */
					sprteleElement.getSprtelePrimaryInd(), /* pUnlistInd=> */
					sprteleElement.getSprteleUnlistInd(), /* pComment=> */
					sprteleElement.getSprteleComment(), /* pIntlAccess=> */
					sprteleElement.getSprteleIntlAccess(), /* pDataOrigin=> */
					getGlobal("DATA_ORIGIN"), /* pUserId=> */
					getGlobal("CURRENT_USER"), /* pCtryCodePhone=> */
					sprteleElement.getSprteleCtryCodePhone(), p_seqno_out_ref,
					p_rowid_out_ref);
			sprteleElement.setSprteleSeqno(p_seqno_out_ref.val);
			sprteleElement.setROWID(p_rowid_out_ref.val);
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			sprteleElement.setSprteleActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(sprteleElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.PRE-UPDATE
	 * EXECUTE_TRIGGER('DO_EDITS'); G$_CHECK_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.PRE-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeRowUpdate
	public void sprtele_BeforeRowUpdate(RowAdapterEvent args) {

		executeAction("DO_EDITS");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.ON-UPDATE -- 82-1 add
	 * SPRTELE_CTRY_CODE_PHONE to update BEGIN GB_TELEPHONE.P_UPDATE(p_PIDM
	 * =>:SPRTELE.SPRTELE_PIDM, p_SEQNO =>:SPRTELE.SPRTELE_SEQNO, p_TELE_CODE
	 * =>:SPRTELE.SPRTELE_TELE_CODE, p_PHONE_AREA =>:SPRTELE.SPRTELE_PHONE_AREA,
	 * p_PHONE_NUMBER =>:SPRTELE.SPRTELE_PHONE_NUMBER, p_PHONE_EXT
	 * =>:SPRTELE.SPRTELE_PHONE_EXT, p_STATUS_IND =>:SPRTELE.SPRTELE_STATUS_IND,
	 * p_ATYP_CODE =>:SPRTELE.SPRTELE_ATYP_CODE, p_ADDR_SEQNO
	 * =>:SPRTELE.SPRTELE_ADDR_SEQNO, p_PRIMARY_IND
	 * =>:SPRTELE.SPRTELE_PRIMARY_IND, p_UNLIST_IND
	 * =>:SPRTELE.SPRTELE_UNLIST_IND, p_COMMENT =>:SPRTELE.SPRTELE_COMMENT,
	 * p_INTL_ACCESS =>:SPRTELE.SPRTELE_INTL_ACCESS, p_DATA_ORIGIN
	 * =>:GLOBAL.DATA_ORIGIN, p_USER_ID =>:GLOBAL.CURRENT_USER,
	 * p_CTRY_code_PHONE =>:SPRTELE.SPRTELE_CTRY_CODE_PHONE, -- 82-1 p_ROWID
	 * =>:SPRTELE.ROWID); :SPRTELE.SPRTELE_ACTIVITY_DATE :=
	 * TO_DATE(G$_RESYNCH_RECORD(:SPRTELE.ROWID),'DDMONYYYYHH24MISS'); EXCEPTION
	 * WHEN OTHERS THEN G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE;
	 * END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.ON-UPDATE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowUpdate
	public void sprtele_RowUpdate(RowAdapterEvent args) {

		// 82-1 add SPRTELE_CTRY_CODE_PHONE to update
		SprteleAdapter sprteleElement = (SprteleAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbTelephone.pUpdate(/* pPidm=> */sprteleElement.getSprtelePidm(),
			/* pSeqno=> */sprteleElement.getSprteleSeqno(),
			/* pTeleCode=> */sprteleElement.getSprteleTeleCode(),
			/* pPhoneArea=> */sprteleElement.getSprtelePhoneArea(),
			/* pPhoneNumber=> */sprteleElement.getSprtelePhoneNumber(),
			/* pPhoneExt=> */sprteleElement.getSprtelePhoneExt(),
			/* pStatusInd=> */sprteleElement.getSprteleStatusInd(),
			/* pAtypCode=> */sprteleElement.getSprteleAtypCode(),
			/* pAddrSeqno=> */sprteleElement.getSprteleAddrSeqno(),
			/* pPrimaryInd=> */sprteleElement.getSprtelePrimaryInd(),
			/* pUnlistInd=> */sprteleElement.getSprteleUnlistInd(),
			/* pComment=> */sprteleElement.getSprteleComment(),
			/* pIntlAccess=> */sprteleElement.getSprteleIntlAccess(),
			/* pDataOrigin=> */getGlobal("DATA_ORIGIN"),
			/* pUserId=> */getGlobal("CURRENT_USER"),
			/* pCtryCodePhone=> */sprteleElement.getSprteleCtryCodePhone(),
			/* pRowid=> */sprteleElement.getROWID());
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			sprteleElement.setSprteleActivityDate(toDate(getContainer().getGoqrpls()
					.gResynchRecord(sprteleElement.getROWID()),
					"DDMONYYYYHH24MISS"));
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.ON-DELETE BEGIN
	 * GB_TELEPHONE.P_DELETE(p_PIDM =>:SPRTELE.SPRTELE_PIDM, p_TELE_CODE
	 * =>:SPRTELE.SPRTELE_TELE_CODE, p_SEQNO =>:SPRTELE.SPRTELE_SEQNO, p_ROWID
	 * =>:SPRTELE.ROWID); EXCEPTION WHEN OTHERS THEN
	 * G$_DISPLAY_ERR_MSG(SQLERRM); RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.ON-DELETE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@RowDelete
	public void sprtele_RowDelete(RowAdapterEvent args) {

		SprteleAdapter sprteleElement = (SprteleAdapter) args.getRow();

		try {
			// F2J_TO_COMPLETE : The conversion process could not determine the
			// name of the intended business object. Determine the correct
			// Business Object name and complete the code.
			// F2J_WARNING : Passing parameters by name is not supported. Please
			// check that the parameters are in the correct order.
			GbTelephone.pDelete(/* pPidm=> */sprteleElement.getSprtelePidm(),
			/* pTeleCode=> */sprteleElement.getSprteleTeleCode(),
			/* pSeqno=> */sprteleElement.getSprteleSeqno(),
			/* pRowid=> */sprteleElement.getROWID());
		} catch (Exception e) {
			getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.KEY-CQUERY COUNT_QUERY;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", function = KeyFunction.COUNT_QUERY)
	public void sprtele_TotalResults() {

		// F2J_NOT_SUPPORTED : Call to built-in "COUNT_QUERY" was removed
		// because it is not supported. See documentation for details
		// "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
		// SupportClasses.SQLFORMS.CountQuery();
		this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'COUNT_QUERY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
		

	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.KEY-NXTBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0118','FORM','Telephone information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void sprtele_NextBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0118"),
							toStr("FORM"),
							toStr("Telephone information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_NXTBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.KEY-PRVBLK IF
	 * :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN GO_ITEM(:SYSTEM.CURSOR_ITEM);
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0119','FORM','Telephone information changed,
	 * press SAVE before leaving current window.')); ELSE
	 * EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG'); END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void sprtele_PreviousBlock() {

		if (getBlockStatus().equals("CHANGED")) {
			goItem(toStr(getCursorItem()));
			warningMessage(GNls
					.Fget(toStr("GOQCLIB-0119"),
							toStr("FORM"),
							toStr("Telephone information changed, press SAVE before leaving current window.")));
		} else {
			executeAction("KEY_PRVBLOCK_TRG");
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE.DO_EDITS DECLARE
	 * PTI_INTO_TEMP VARCHAR2(1); CURSOR PTI_CURSOR1 IS SELECT 'X' FROM SPRADDR
	 * WHERE SPRADDR_PIDM = :SPRTELE.SPRTELE_PIDM AND SPRADDR_ATYP_CODE =
	 * :SPRTELE.SPRTELE_ATYP_CODE AND SPRADDR_SEQNO =
	 * :SPRTELE.SPRTELE_ADDR_SEQNO; -- CURSOR PTI_CURSOR2 IS SELECT 'X' FROM
	 * SPRTELE WHERE SPRTELE_PIDM = :SPRTELE.SPRTELE_PIDM AND SPRTELE_ATYP_CODE
	 * = :SPRTELE.SPRTELE_ATYP_CODE AND SPRTELE_PRIMARY_IND = 'Y' AND
	 * :SPRTELE.SPRTELE_PRIMARY_IND = 'Y' AND (:SPRTELE.ROWID <> SPRTELE.ROWID
	 * OR :SPRTELE.ROWID IS NULL) AND :SPRTELE.SPRTELE_ADDR_SEQNO =
	 * SPRTELE_ADDR_SEQNO; -- BEGIN IF (:SPRTELE.SPRTELE_ATYP_CODE IS NOT NULL
	 * OR :SPRTELE.SPRTELE_ADDR_SEQNO IS NOT NULL) THEN OPEN PTI_CURSOR1; FETCH
	 * PTI_CURSOR1 INTO PTI_INTO_TEMP; IF PTI_CURSOR1%NOTFOUND THEN CLOSE
	 * PTI_CURSOR1; MESSAGE(G$_NLS.Get('GOQCLIB-0120','FORM','*ERROR* Invalid
	 * address type and sequence no, press COUNT QUERY HITS.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR1; END IF; -- OPEN
	 * PTI_CURSOR2; FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP; IF PTI_CURSOR2%FOUND
	 * THEN CLOSE PTI_CURSOR2; MESSAGE(G$_NLS.Get('GOQCLIB-0121','FORM','*ERROR*
	 * Primary phone already exists for address type and seqno.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR2; -- -- Check for the
	 * existence of at least one regular phone number OR -- international phone
	 * number. -- IF :SPRTELE.SPRTELE_PHONE_NUMBER IS NULL AND
	 * :SPRTELE.SPRTELE_INTL_ACCESS IS NULL THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0122','FORM','*ERROR* Must enter Telephone
	 * Number or International Access Code.')); RAISE FORM_TRIGGER_FAILURE; END
	 * IF; -- :SPRTELE.SPRTELE_USER_ID := :GLOBAL.CURRENT_USER;
	 * :SPRTELE.SPRTELE_ACTIVITY_DATE :=
	 * TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT); END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.DO_EDITS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "DO_EDITS")
	public void sprtele_DoEdits() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor1 = "SELECT 'X' "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR_PIDM = :SPRTELE_SPRTELE_PIDM AND SPRADDR_ATYP_CODE = :SPRTELE_SPRTELE_ATYP_CODE AND SPRADDR_SEQNO = :SPRTELE_SPRTELE_ADDR_SEQNO ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			String sqlptiCursor2 = "SELECT 'X' "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :SPRTELE_SPRTELE_PIDM AND SPRTELE_ATYP_CODE = :SPRTELE_SPRTELE_ATYP_CODE AND SPRTELE_PRIMARY_IND = 'Y' AND :SPRTELE_SPRTELE_PRIMARY_IND = 'Y' AND (:SPRTELE_ROWID <> SPRTELE.ROWID OR :SPRTELE_ROWID IS NULL) AND :SPRTELE_SPRTELE_ADDR_SEQNO = SPRTELE_ADDR_SEQNO ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			try {
				if ((!sprteleElement.getSprteleAtypCode().isNull() || !sprteleElement
						.getSprteleAddrSeqno().isNull())) {
					// Setting query parameters
					ptiCursor1.addParameter("SPRTELE_SPRTELE_PIDM",
							sprteleElement.getSprtelePidm());
					ptiCursor1.addParameter("SPRTELE_SPRTELE_ATYP_CODE",
							sprteleElement.getSprteleAtypCode());
					ptiCursor1.addParameter("SPRTELE_SPRTELE_ADDR_SEQNO",
							sprteleElement.getSprteleAddrSeqno());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor1.
					ptiCursor1.open();
					ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
					if (ptiCursor1Results != null) {
						ptiIntoTemp = ptiCursor1Results.getStr(0);
					}
					if (ptiCursor1.notFound()) {
						ptiCursor1.close();
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0120"),
										toStr("FORM"),
										toStr("*ERROR* Invalid address type and sequence no, press COUNT QUERY HITS.")));
						throw new ApplicationException();
					}
					ptiCursor1.close();
				}
				//
				// Setting query parameters
				ptiCursor2.addParameter("SPRTELE_SPRTELE_PIDM",
						sprteleElement.getSprtelePidm());
				ptiCursor2.addParameter("SPRTELE_SPRTELE_ATYP_CODE",
						sprteleElement.getSprteleAtypCode());
				ptiCursor2.addParameter("SPRTELE_SPRTELE_PRIMARY_IND",
						sprteleElement.getSprtelePrimaryInd());
				ptiCursor2.addParameter("SPRTELE_ROWID",
						sprteleElement.getROWID());
				ptiCursor2.addParameter("SPRTELE_SPRTELE_ADDR_SEQNO",
						sprteleElement.getSprteleAddrSeqno());
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
							.Fget(toStr("GOQCLIB-0121"),
									toStr("FORM"),
									toStr("*ERROR* Primary phone already exists for address type and seqno.")));
					throw new ApplicationException();
				}
				ptiCursor2.close();
				//
				// Check for the existence of at least one regular phone number
				// OR
				// international phone number.
				//
				if (sprteleElement.getSprtelePhoneNumber().isNull()
						&& sprteleElement.getSprteleIntlAccess().isNull()) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0122"),
									toStr("FORM"),
									toStr("*ERROR* Must enter Telephone Number or International Access Code.")));
					throw new ApplicationException();
				}
				//
				sprteleElement.setSprteleUserId(getGlobal("CURRENT_USER"));
				// F2J_TO_COMPLETE : The conversion process could not determine
				// the name of the intended business object. Determine the
				// correct Business Object name and complete the code.
				sprteleElement.setSprteleActivityDate(toDate(
						toStr(getFormModel().getBusinessObject("FORM_HEADER")
								.getValue("CURRENT_DATE")), GDate
								.getNlsDateFormat()));
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.PRE-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@BeforeQuery
	public void sprtele_BeforeQuery(QueryEvent args) {

		// F2J_WARNING : Query Parameters initialization. Make sure that all the
		// query parameters are properly initialized

		((IDBBusinessObject) args.getSource()).getSelectCommandParams().add(
				DbManager.getDataBaseFactory().createDataParameter(
						"PIDM",
						getFormModel().getBusinessObject("KEY_BLOCK").getValue(
								"PIDM")));

	}

	@RecordCreated
	public void sprtele_RecordCreated(EventObject args) {
		SprteleAdapter sprteleElement = (SprteleAdapter) ((RowAdapterEvent) args)
				.getRow();
		sprteleElement.setSprtelePidm(toNumber(getFormModel()
				.getBusinessObject("KEY_BLOCK").getValue("PIDM")));
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.WHEN-MOUSE-DOUBLECLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-DOUBLECLICK", item = "SPRTELE_TELE_CODE")
	public void sprteleTeleCode_WhenMouseDoubleclick() {

		getGCodeClass().whenMouseDoubleclick();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRTELE_TELE_CODE", function = KeyFunction.ITEM_CHANGE)
	public void sprteleTeleCode_itemChange() {

		getGCodeClass().itemChange();
	}

	@ActionTrigger(action = "G$_SEARCH_PARAMETERS", item = "SPRTELE_TELE_CODE")
	public void sprteleTeleCode_GSearchParameters() {

		getGCodeClass().gSearchParameters();
	}

	@ActionTrigger(action = "G$_SEARCH_OPTIONS", item = "SPRTELE_TELE_CODE")
	public void sprteleTeleCode_GSearchOptions() {

		getGCodeClass().gSearchOptions();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRTELE_TELE_CODE", function = KeyFunction.NEXT_ITEM)
	public void sprteleTeleCode_keyNexItem() {

		getGCodeClass().keyNexItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRTELE_TELE_CODE", function = KeyFunction.ITEM_OUT)
	public void sprteleTeleCode_itemOut() {

		getGCodeClass().itemOut();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE_TELE_CODE.POST-CHANGE BEGIN
	 * G$_CHECK_QUERY_MODE; -- :SPRTELE.TELE_DESCRIPTION :=
	 * GB_STVTELE.F_GET_DESCRIPTION(:SPRTELE.SPRTELE_TELE_CODE); --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRTELE_TELE_CODE")
	public void sprteleTeleCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			sprteleElement.setTeleDescription(GbStvtele
					.fGetDescription(sprteleElement.getSprteleTeleCode()));
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE_LBT.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRTELE_TELE_CODE_LBT")
	public void sprteleTeleCodeLbt_click() {

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
	 * Original PL/SQL code code for TRIGGER
	 * SPRTELE_PRIMARY_IND.WHEN-CHECKBOX-CHANGED DECLARE PTI_INTO_TEMP
	 * VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT 'X' FROM SPRTELE WHERE
	 * SPRTELE_PIDM = :SPRTELE.SPRTELE_PIDM AND SPRTELE_PRIMARY_IND = 'Y' AND
	 * :SPRTELE.SPRTELE_ADDR_SEQNO = SPRTELE_ADDR_SEQNO AND
	 * :SPRTELE.SPRTELE_ATYP_CODE = SPRTELE_ATYP_CODE AND (SPRTELE.ROWID <>
	 * :SPRTELE.ROWID OR :SPRTELE.ROWID IS NULL); BEGIN G$_CHECK_QUERY_MODE; --
	 * IF (:SPRTELE.SPRTELE_STATUS_IND IS NOT NULL AND
	 * :SPRTELE.SPRTELE_PRIMARY_IND IS NOT NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0123','FORM','*Warning* Inactive phone number
	 * is being made primary.')); END IF; -- IF :SPRTELE.SPRTELE_PRIMARY_IND IS
	 * NULL THEN :GLOBAL.QUERY_MODE := '0'; RETURN; END IF; -- IF
	 * :GLOBAL.QUERY_MODE <> '1' THEN OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * PTI_INTO_TEMP; IF PTI_CURSOR%FOUND THEN CLOSE PTI_CURSOR;
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0124','FORM','*ERROR* There may be only one
	 * primary phone number per addr type/seq no.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR; END IF; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_PRIMARY_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "SPRTELE_PRIMARY_IND")
	public void sprtelePrimaryInd_checkBoxChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' "
					+ " FROM SPRTELE "
					+ " WHERE SPRTELE_PIDM = :SPRTELE_SPRTELE_PIDM AND SPRTELE_PRIMARY_IND = 'Y' AND :SPRTELE_SPRTELE_ADDR_SEQNO = SPRTELE_ADDR_SEQNO AND :SPRTELE_SPRTELE_ATYP_CODE = SPRTELE_ATYP_CODE AND (SPRTELE.ROWID <> :SPRTELE_ROWID OR :SPRTELE_ROWID IS NULL) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					if ((!sprteleElement.getSprteleStatusInd().isNull() && !sprteleElement
							.getSprtelePrimaryInd().isNull())) {
						warningMessage(GNls
								.Fget(toStr("GOQCLIB-0123"),
										toStr("FORM"),
										toStr("*WARNING* Inactive phone number is being made primary.")));
					}
					//
					if (sprteleElement.getSprtelePrimaryInd().isNull()) {
						setGlobal("QUERY_MODE", toStr("0"));
						return;
					}
					//
					if (getGlobal("QUERY_MODE").notEquals("1")) {
						// Setting query parameters
						ptiCursor.addParameter("SPRTELE_SPRTELE_PIDM",
								sprteleElement.getSprtelePidm());
						ptiCursor.addParameter("SPRTELE_SPRTELE_ADDR_SEQNO",
								sprteleElement.getSprteleAddrSeqno());
						ptiCursor.addParameter("SPRTELE_SPRTELE_ATYP_CODE",
								sprteleElement.getSprteleAtypCode());
						ptiCursor.addParameter("SPRTELE_ROWID",
								sprteleElement.getROWID());
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if (ptiCursorResults != null) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if (ptiCursor.found()) {
							ptiCursor.close();
							errorMessage(GNls
									.Fget(toStr("GOQCLIB-0124"),
											toStr("FORM"),
											toStr("*ERROR* There may be only one primary phone number per addr type/seq no.")));
							throw new ApplicationException();
						}
						ptiCursor.close();
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
	 * SPRTELE_STATUS_IND.WHEN-CHECKBOX-CHANGED BEGIN G$_CHECK_QUERY_MODE; --
	 * :GLOBAL.QUERY_MODE := '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN
	 * :GLOBAL.QUERY_MODE := '0'; RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_STATUS_IND.WHEN-CHECKBOX-CHANGED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-CHECKBOX-CHANGED", item = "SPRTELE_STATUS_IND")
	public void sprteleStatusInd_checkBoxChange() {

		try {
			getContainer().getGoqrpls().gCheckQueryMode();
			//
			setGlobal("QUERY_MODE", toStr("0"));
		} catch (ApplicationException e) {
			setGlobal("QUERY_MODE", toStr("0"));
			throw new ApplicationException();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE_ATYP_CODE.KEY-CQUERY
	 * EXECUTE_TRIGGER('SAVE_KEYS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE; :GLOBAL.PIDM :=
	 * :KEY_BLOCK.PIDM; EXECUTE_TRIGGER('GO_ADDR_FORM'); -- IF :GLOBAL.VALUE IS
	 * NOT NULL THEN :SPRTELE.SPRTELE_ATYP_CODE := :GLOBAL.VALUE;
	 * :SPRTELE.SPRTELE_ADDR_SEQNO := :GLOBAL.SEQNO; :GLOBAL.VALUE := '';
	 * :GLOBAL.SEQNO := ''; NEXT_FIELD; NEXT_FIELD; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPRTELE_ATYP_CODE", function = KeyFunction.COUNT_QUERY)
	public void sprteleAtypCode_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		executeAction("SAVE_KEYS");
		getContainer().getGoqrpls().gCheckFailure();
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
			sprteleElement.setSprteleAtypCode(getGlobal("VALUE"));
			sprteleElement.setSprteleAddrSeqno(toNumber(getGlobal("SEQNO")));
			setGlobal("VALUE", toStr(""));
			setGlobal("SEQNO", toStr(""));
			nextItem();
			nextItem();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE_ATYP_CODE.KEY-LISTVAL
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0125','FORM','*ERROR* Invalid function, press
	 * COUNT QUERY HITS for valid addresses for ID.')); RAISE
	 * FORM_TRIGGER_FAILURE;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-LISTVAL", item = "SPRTELE_ATYP_CODE", function = KeyFunction.LIST_VALUES)
	public void sprteleAtypCode_ListValues() {

		errorMessage(GNls
				.Fget(toStr("GOQCLIB-0125"),
						toStr("FORM"),
						toStr("*ERROR* Invalid function, press COUNT QUERY HITS for valid addresses for ID.")));
		throw new ApplicationException();
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE_ATYP_CODE.POST-CHANGE
	 * DECLARE PTI_INTO_TEMP VARCHAR2(1); CURSOR PTI_CURSOR IS SELECT
	 * STVATYP_DESC FROM STVATYP WHERE STVATYP_CODE = :SPRTELE.SPRTELE_ATYP_CODE
	 * AND :SPRTELE.SPRTELE_ATYP_CODE IN (SELECT SPRADDR_ATYP_CODE FROM SPRADDR
	 * WHERE SPRADDR_PIDM = :SPRTELE.SPRTELE_PIDM); -- BEGIN
	 * G$_CHECK_QUERY_MODE; -- OPEN PTI_CURSOR; FETCH PTI_CURSOR INTO
	 * :SPRTELE.ATYP_DESCRIPTION; IF PTI_CURSOR%NOTFOUND THEN CLOSE PTI_CURSOR;
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0126','FORM','*ERROR* Invalid address type
	 * for ID, press COUNT QUERY HITS for valid address.')); RAISE
	 * FORM_TRIGGER_FAILURE; END IF; CLOSE PTI_CURSOR; -- :GLOBAL.QUERY_MODE :=
	 * '0'; EXCEPTION WHEN FORM_TRIGGER_FAILURE THEN :GLOBAL.QUERY_MODE := '0';
	 * RAISE FORM_TRIGGER_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "SPRTELE_ATYP_CODE")
	public void sprteleAtypCode_PostChange() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);
		
		if(sprteleElement.getSprteleAtypCode().isNull())
			return;

		int rowCount = 0;
		{
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT STVATYP_DESC "
					+ " FROM STVATYP "
					+ " WHERE STVATYP_CODE = :SPRTELE_SPRTELE_ATYP_CODE AND (:SPRTELE_SPRTELE_ATYP_CODE) IN ((SELECT SPRADDR_ATYP_CODE "
					+ " FROM SPRADDR "
					+ " WHERE SPRADDR_PIDM = :SPRTELE_SPRTELE_PIDM )) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				try {
					getContainer().getGoqrpls().gCheckQueryMode();
					//
					// Setting query parameters
					ptiCursor.addParameter("SPRTELE_SPRTELE_ATYP_CODE",
							sprteleElement.getSprteleAtypCode());
					ptiCursor.addParameter("SPRTELE_SPRTELE_PIDM",
							sprteleElement.getSprtelePidm());
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if (ptiCursorResults != null) {
						sprteleElement.setAtypDescription(ptiCursorResults
								.getStr(0));
					}
					if (ptiCursor.notFound()) {
						ptiCursor.close();
						errorMessage(GNls
								.Fget(toStr("GOQCLIB-0126"),
										toStr("FORM"),
										toStr("*ERROR* Invalid address type for ID, press COUNT QUERY HITS for valid address.")));
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
	 * Original PL/SQL code code for TRIGGER SPRTELE_ATYP_CODE.POST-TEXT-ITEM IF
	 * :SPRTELE.SPRTELE_ATYP_CODE IS NULL THEN :SPRTELE.ATYP_DESCRIPTION := '';
	 * RETURN; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRTELE_ATYP_CODE", function = KeyFunction.ITEM_OUT)
	public void sprteleAtypCode_itemOut() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		if (sprteleElement.getSprteleAtypCode().isNull()) {
			sprteleElement.setAtypDescription(toStr(""));
			return;
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRTELE_ATYP_CODE_BTN")
	public void sprteleAtypCodeBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRTELE_ATYP_CODE_BTN.WHEN-BUTTON-PRESSED GO_ITEM('SPRTELE_ATYP_CODE');
	 * DO_KEY('COUNT_QUERY');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRTELE_ATYP_CODE_BTN")
	public void sprteleAtypCodeBtn_buttonClick() {

		goItem(toStr("SPRTELE_ATYP_CODE"));
		executeAction("COUNT_QUERY");
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
	 * Original PL/SQL code code for TRIGGER SPRTELE_ADDR_SEQNO.KEY-NEXT-ITEM --
	 * -- If there is a vlaue in atyp_code then there must be a value in seqno.
	 * -- IF (:SPRTELE.SPRTELE_ATYP_CODE IS NOT NULL AND
	 * :SPRTELE.SPRTELE_ADDR_SEQNO IS NULL) THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0127','FORM','*ERROR* Invalid address type
	 * and sequence no, press COUNT QUERY HITS.')); RAISE FORM_TRIGGER_FAILURE;
	 * ELSE NEXT_ITEM; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ADDR_SEQNO.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRTELE_ADDR_SEQNO", function = KeyFunction.NEXT_ITEM)
	public void sprteleAddrSeqno_keyNexItem() {

		//
		// If there is a vlaue in atyp_code then there must be a value in seqno.
		//

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		//
		// If there is a vlaue in atyp_code then there must be a value in seqno.
		//
		if ((!sprteleElement.getSprteleAtypCode().isNull() && sprteleElement
				.getSprteleAddrSeqno().isNull())) {
			errorMessage(GNls
					.Fget(toStr("GOQCLIB-0127"),
							toStr("FORM"),
							toStr("*ERROR* Invalid address type and sequence no, press COUNT QUERY HITS.")));
			throw new ApplicationException();
		} else {
			nextItem();
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRTELE_ADDR_SEQNO.WHEN-VALIDATE-ITEM DECLARE PTI_INTO_TEMP VARCHAR2(1);
	 * BEGIN IF (:SPRTELE.SPRTELE_ATYP_CODE IS NOT NULL AND
	 * :SPRTELE.SPRTELE_ADDR_SEQNO IS NOT NULL) THEN PTI_INTO_TEMP :=
	 * GB_ADDRESS.F_EXISTS(p_pidm => :SPRTELE.SPRTELE_PIDM, p_atyp_code =>
	 * :SPRTELE.SPRTELE_ATYP_CODE, p_seqno => :SPRTELE.SPRTELE_ADDR_SEQNO); IF
	 * PTI_INTO_TEMP <> 'Y' THEN
	 * MESSAGE(G$_NLS.Get('GOQCLIB-0128','FORM','*ERROR* Invalid address type
	 * and sequence no, press COUNT QUERY HITS.')); RAISE FORM_TRIGGER_FAILURE;
	 * END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ADDR_SEQNO.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRTELE_ADDR_SEQNO")
	public void sprteleAddrSeqno_validate() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		{
			NString ptiIntoTemp = NString.getNull();
			if ((!sprteleElement.getSprteleAtypCode().isNull() && !sprteleElement
					.getSprteleAddrSeqno().isNull())) {
				// F2J_WARNING : Passing parameters by name is not supported.
				// Please check that the parameters are in the correct order.
				ptiIntoTemp = GbAddress.fExists(
				/* pPidm=> */sprteleElement.getSprtelePidm(), /*
															 * pAtypCode= >
															 */
						sprteleElement.getSprteleAtypCode(), /* pSeqno=> */
						sprteleElement.getSprteleAddrSeqno(),
						NString.getNull(), null);
				if (ptiIntoTemp.notEquals("Y")) {
					errorMessage(GNls
							.Fget(toStr("GOQCLIB-0128"),
									toStr("FORM"),
									toStr("*ERROR* Invalid address type and sequence no, press COUNT QUERY HITS.")));
					throw new ApplicationException();
				}
			}
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER SPRTELE_ADDR_SEQNO.KEY-CQUERY
	 * EXECUTE_TRIGGER('SAVE_KEYS'); G$_CHECK_FAILURE; --
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE; :GLOBAL.PIDM :=
	 * :KEY_BLOCK.PIDM; EXECUTE_TRIGGER('GO_ADDR_FORM'); -- IF :GLOBAL.VALUE IS
	 * NOT NULL THEN :SPRTELE.SPRTELE_ATYP_CODE := :GLOBAL.VALUE;
	 * :SPRTELE.SPRTELE_ADDR_SEQNO := :GLOBAL.SEQNO; :GLOBAL.VALUE := '';
	 * :GLOBAL.SEQNO := ''; NEXT_FIELD; END IF;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ADDR_SEQNO.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "SPRTELE_ADDR_SEQNO", function = KeyFunction.COUNT_QUERY)
	public void sprteleAddrSeqno_TotalResults() {

		// F2J_WARNING : Caution, the variable may be null.
		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);

		executeAction("SAVE_KEYS");
		getContainer().getGoqrpls().gCheckFailure();
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
			sprteleElement.setSprteleAtypCode(getGlobal("VALUE"));
			sprteleElement.setSprteleAddrSeqno(toNumber(getGlobal("SEQNO")));
			setGlobal("VALUE", toStr(""));
			setGlobal("SEQNO", toStr(""));
			nextItem();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ADDR_SEQNO_BTN.WHEN-MOUSE-CLICK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SPRTELE_ADDR_SEQNO_BTN")
	public void sprteleAddrSeqnoBtn_click() {

		getGIconBtnClass().whenMouseClick();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * SPRTELE_ADDR_SEQNO_BTN.WHEN-BUTTON-PRESSED GO_ITEM('SPRTELE_ADDR_SEQNO');
	 * DO_KEY('COUNT_QUERY');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ADDR_SEQNO_BTN.WHEN-BUTTON-PRESSED
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "SPRTELE_ADDR_SEQNO_BTN")
	public void sprteleAddrSeqnoBtn_buttonClick() {

		goItem(toStr("SPRTELE_ADDR_SEQNO"));
		executeAction("COUNT_QUERY");
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ACTIVITY_DATE.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "SPRTELE_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
	public void sprteleActivityDate_keyNexItem() {

		getGDateClass().nextItem();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SPRTELE_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
	public void sprteleActivityDate_itemChange() {

		getGDateClass().itemChange();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ACTIVITY_DATE.POST-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-TEXT-ITEM", item = "SPRTELE_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
	public void sprteleActivityDate_itemOut() {

		getGDateClass().itemOut();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_TELE_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRTELE_TELE_CODE")
	public void sprteleTeleCode_validate() {

		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);
		if (!sprteleElement.getSprteleTeleCode().isNull())
			this.sprteleTeleCode_PostChange();

	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: SPRTELE.POST-QUERY
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */

	@AfterQuery
	public void sprtele_AfterQuery(RowAdapterEvent args) {

		SprteleAdapter sprteleElement = (SprteleAdapter) args.getRow();
		try {
			sprteleElement.setLockDbValues(true);

			if (!sprteleElement.getSprteleTeleCode().isNull())
				this.sprteleTeleCode_PostChange();
			// MORPHIS TODO adicionado para aparecer a descri��o (PPAIDEN)
			if (!sprteleElement.getSprteleAtypCode().isNull())
				this.sprteleAtypCode_PostChange();
		} finally {
			sprteleElement.setLockDbValues(false);
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * SPRTELE_ATYP_CODE.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "SPRTELE_ATYP_CODE")
	public void sprteleAtypCode_validate() {

		SprteleAdapter sprteleElement = (SprteleAdapter) this.getFormModel()
				.getSprtele().getRowAdapter(true);
		if (!sprteleElement.getSprteleAtypCode().isNull())
			this.sprteleAtypCode_PostChange();

	}

	public void sprteleTeleCode_doubleClick() {
		sprteleTeleCode_WhenMouseDoubleclick();
		
	}

}
