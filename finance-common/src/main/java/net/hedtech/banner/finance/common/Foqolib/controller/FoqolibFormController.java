package net.hedtech.banner.finance.common.Foqolib.controller;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqolib.model.*;
import net.hedtech.banner.finance.common.Foqolib.*;
import net.hedtech.banner.finance.common.Foqolib.services.*;

public class FoqolibFormController extends AbstractSupportCodeObject {

	public FoqolibFormController(ISupportCodeContainer container) {
		super(container);
	}

	@Override
	public FoqolibTaskPart getContainer() {
		return (FoqolibTaskPart) super.getContainer();
	}

	public FoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}

	// action methods generated from triggers
	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.MNU_OPEN_FORMAT
	 * F$_FORMAT_NUMBER.OPEN_FORMAT_WINDOW;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.MNU_OPEN_FORMAT
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "MNU_OPEN_FORMAT")
	public void Foqolib_MnuOpenFormat() {

		getContainer().getFoqrpls().getFFormatNumber().openFormatWindow();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.ABAL_ERASE_NSF_GLOBALS
	 * <multilinecomment> Erase all the NSF globals that were used by
	 * abal_update_fgbbavl trigger while doing ABAL processing.
	 * </multilinecomment>
	 * 
	 * ERASE( 'GLOBAL.STDEDIT_RUCL_CODE' ) ; ERASE( 'GLOBAL.STDEDIT_TRANS_AMT' )
	 * ; ERASE( 'GLOBAL.STDEDIT_ENCD_NUM' ) ; ERASE(
	 * 'GLOBAL.STDEDIT_ENCD_ITEM_NUM' ) ; ERASE( 'GLOBAL.STDEDIT_ENCD_SEQ_NUM' )
	 * ; ERASE( 'GLOBAL.STDEDIT_ENCD_ACTION_IND' ) ; ERASE(
	 * 'GLOBAL.STDEDIT_CMT_TYPE' ) ; ERASE( 'GLOBAL.ABAL_IND' ) ; ERASE(
	 * 'GLOBAL.ABAL_MESSAGE'); ERASE( 'GLOBAL.STDEDIT_SERIAL_NUM');
	 * :GLOBAL.ABAL_IND := ''; :GLOBAL.ABAL_MESSAGE := '';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.ABAL_ERASE_NSF_GLOBALS
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ABAL_ERASE_NSF_GLOBALS")
	public void Foqolib_AbalEraseNsfGlobals() {

		// Erase all the NSF globals that were used by abal_update_fgbbavl
		// trigger while doing ABAL processing.
		// Erase all the NSF globals that were used by abal_update_fgbbavl
		// trigger while doing ABAL processing.
		removeGlobal("GLOBAL.STDEDIT_RUCL_CODE");
		removeGlobal("GLOBAL.STDEDIT_TRANS_AMT");
		removeGlobal("GLOBAL.STDEDIT_ENCD_NUM");
		removeGlobal("GLOBAL.STDEDIT_ENCD_ITEM_NUM");
		removeGlobal("GLOBAL.STDEDIT_ENCD_SEQ_NUM");
		removeGlobal("GLOBAL.STDEDIT_ENCD_ACTION_IND");
		removeGlobal("GLOBAL.STDEDIT_CMT_TYPE");
		removeGlobal("GLOBAL.ABAL_IND");
		removeGlobal("GLOBAL.ABAL_MESSAGE");
		removeGlobal("GLOBAL.STDEDIT_SERIAL_NUM");
		setGlobal("ABAL_IND", toStr(""));
		setGlobal("ABAL_MESSAGE", toStr(""));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.KEY-CREREC NEXT_ITEM;
	 * PREVIOUS_ITEM; IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN COMMIT_FORM; END
	 * IF; CREATE_RECORD;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FOQOLIB.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void Foqolib_CreateRecord() {

		nextItem();
		previousItem();
		if (getTaskStatus().equals("CHANGED")) {
			commitTask();
		}
		createRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.LOAD_FORM_HEADER
	 * :CURRENT_DATE := TO_CHAR(SYSDATE, G$_DATE.GET_NLS_DATE_FORMAT) ;
	 * :CURRENT_TIME := TO_CHAR(SYSDATE, 'HH24:MI:SS') ; -- :CURRENT_FORM :=
	 * :SYSTEM.CURRENT_FORM ; :CURRENT_INSTITUTION := :GLOBAL.INSTITUTION ;
	 * EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.LOAD_FORM_HEADER
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_FORM_HEADER")
	public void Foqolib_LoadFormHeader() {

		getFormModel().getLibFormHeader().setCurrentDate(
				toChar(NDate.getNow(), GDate.getNlsDateFormat()));
		getFormModel().getLibFormHeader().setCurrentTime(
				toChar(NDate.getNow(), "HH24:MI:SS"));
		//
		getFormModel().getLibFormHeader().setCurrentForm(
				toStr(getCurrentTaskName()));
		getFormModel().getLibFormHeader().setCurrentInstitution(
				getGlobal("INSTITUTION"));
		executeAction("LOAD_CURRENT_RELEASE");
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.LOAD_CURRENT_RELEASE
	 * :CURRENT_RELEASE := '8.9.1';
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.LOAD_CURRENT_RELEASE
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Foqolib_LoadCurrentRelease() {

		getFormModel().getLibFormHeader().setCurrentRelease(toStr("9.0"));
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.WHEN-NEW-FORM-INSTANCE
	 * EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ; G$_CHECK_FAILURE ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.WHEN-NEW-FORM-INSTANCE
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStarted
	public void Foqolib_TaskStarted(EventObject args) {

		executeAction("LOAD_FORM_HEADER");
		getContainer().getGoqrpls().gCheckFailure();
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * FOQOLIB.ORIG_COMM_DESC_NEW_ITEM_TRIG begin :original_commodity_desc_item
	 * :=
	 * get_orig_comm_desc(:global.comm_code,:global.comm_desc,:global.eff_date);
	 * if :original_commodity_desc_item is not null then
	 * set_window_property('original_commodity_desc_window',visible,property_true);
	 * set_view_property
	 * ('original_commodity_desc_canvas',visible,property_true); end if; end;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.ORIG_COMM_DESC_NEW_ITEM_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ORIG_COMM_DESC_NEW_ITEM_TRIG")
	public void Foqolib_OrigCommDescNewItemTrig() {

		getFormModel().getOriginalCommodityDescBlock()
				.setOriginalCommodityDescItem(
						getContainer().getFoqrpls().getOrigCommDesc(getGlobal("COMM_CODE"),
								getGlobal("COMM_DESC"), getGlobal("EFF_DATE")));
		if (!getFormModel().getOriginalCommodityDescBlock()
				.getOriginalCommodityDescItem().isNull()) {

			setViewVisible("original_commodity_desc_canvas", true);
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER
	 * FOQOLIB.ORIG_COMM_DESC_POST_TEXT_TRIG
	 * set_view_property('original_commodity_desc_canvas',visible,property_off);
	 * set_window_property
	 * ('original_commodity_desc_window',visible,property_off);
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * FOQOLIB.ORIG_COMM_DESC_POST_TEXT_TRIG
	 * 
	 * 
	 * </p>
	 */
	@ActionTrigger(action = "ORIG_COMM_DESC_POST_TEXT_TRIG")
	public void Foqolib_OrigCommDescPostTextTrig() {

		setViewVisible("original_commodity_desc_canvas", false);
	}

	/*
	 * Original PL/SQL code code for TRIGGER FOQOLIB.PRE-FORM DEFAULT_VALUE(
	 * '0', 'global.query_mode' ) ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: FOQOLIB.PRE-FORM
	 * 
	 * 
	 * </p>
	 * 
	 * @param args
	 */
	@TaskStartedPre
	public void Foqolib_TaskStartedPre(EventObject args) {

		setDefaultValue("0", "global.query_mode");
	}

}
