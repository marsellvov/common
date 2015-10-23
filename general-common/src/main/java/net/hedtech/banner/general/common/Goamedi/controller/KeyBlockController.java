package net.hedtech.banner.general.common.Goamedi.controller;

import java.util.*;

import org.apache.commons.lang.Validate;
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
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;

import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this
				.getTask().getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_KEY_BLOCK_CLASS");
	}

	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_ID_CLASS");
	}

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask()
				.getTaskPart("GOQOLIB").getSupportCodeManager()
				.getPackage("G$_NAME_CLASS");
	}

	public KeyBlockController(IFormController parentController, String name) {
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
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.POST-BLOCK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-BLOCK", function = KeyFunction.BLOCK_OUT)
	public void keyBlock_blockOut() {

		getGKeyBlockClass().postBlock();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.KEY-COMMIT
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-COMMIT", function = KeyFunction.SAVE)
	public void keyBlock_Save() {

		getGKeyBlockClass().save();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.KEY-UP
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-UP", function = KeyFunction.PREVIOUS_RECORD)
	public void keyBlock_MoveUp() {

		getGKeyBlockClass().moveUp();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.KEY-DOWN
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DOWN", function = KeyFunction.NEXT_RECORD)
	public void keyBlock_MoveDown() {

		getGKeyBlockClass().moveDown();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-CREREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CREREC", function = KeyFunction.CREATE_RECORD)
	public void keyBlock_CreateRecord() {

		getGKeyBlockClass().createRecord();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-DELREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DELREC", function = KeyFunction.DELETE_RECORD)
	public void keyBlock_DeleteRecord() {

		getGKeyBlockClass().deleteRecord();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-ENTQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-ENTQRY", function = KeyFunction.SEARCH)
	public void keyBlock_Search() {

		getGKeyBlockClass().search();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.KEY-EXEQRY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-EXEQRY", function = KeyFunction.EXECUTE_QUERY)
	public void keyBlock_ExecuteQuery() {

		getGKeyBlockClass().executeQuery();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-NXTREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTREC", function = KeyFunction.NEXT_RECORD)
	public void keyBlock_NextRecord() {

		getGKeyBlockClass().nextRecord();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-NXTSET
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTSET")
	public void keyBlock_KeyNxtset() {

		getGKeyBlockClass().keyNxtset();
	}

	/*
	 * <p>This trigger checks if a valid PIDM exists. If it does, perform
	 * previous
	 * 
	 * block and execute query. If not, display error message.<b>Migration
	 * Comments</b> Generated from trigger: KEY_BLOCK.KEY-PRVBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
	public void keyBlock_PreviousBlock() {

		getGKeyBlockClass().previousBlock();
	}

	/*
	 * <p>Invalid function.<b>Migration Comments</b> Generated from trigger:
	 * KEY_BLOCK.KEY-PRVREC
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-PRVREC", function = KeyFunction.PREVIOUS_RECORD)
	public void keyBlock_PreviousRecord() {

		getGKeyBlockClass().previousRecord();
	}

	/*
	 * Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK NEXT_BLOCK ;
	 */
	/*
	 * <p>This trigger will check if an id number or 'GENERATED' was entered. If
	 * it
	 * 
	 * was, then advance to next block. If not, display error message.
	 * <b>Migration Comments</b> Generated from trigger: KEY_BLOCK.KEY-NXTBLK
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
	public void keyBlock_NextBlock() {

		nextBlock();
	}

	/*
	 * Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS DECLARE msg
	 * varchar2(200) := NULL; msg_type varchar2(1) := NULL; check_employee
	 * varchar2(1) := NULL; BEGIN G$_CHECK_VALUE((:KEY_BLOCK.ID IS NULL),
	 * G$_NLS.Get('GOAMEDI-0008','FORM','*ERROR* An existing id number must be
	 * entered for this function.'),TRUE,TRUE); -- IF :GLOBAL.HRESYS = 'Y' THEN
	 * check_employee := F_IsPidmInTable('PEBEMPL', 'PEBEMPL_PIDM',
	 * :KEY_BLOCK.PIDM); -- IF CHECK_EMPLOYEE = 'Y' THEN <multilinecomment> The
	 * HR security is implemented here dynamically invoking the procedure
	 * p_check_security in the package NOKSECR</multilinecomment> DECLARE parm1
	 * VARCHAR2(30) := USER; parm2 NUMBER := :PIDM; error_code_out
	 * VARCHAR2(100); error_mesg_out VARCHAR2(2000); sql_stmt VARCHAR2(1000);
	 * BEGIN
	 * 
	 * sql_stmt := 'BEGIN NOKSECR.p_check_security (' || '''' || parm1 || ''''
	 * || ',' || parm2 || ',' || '''' || '''' || ',' || ':OV1,:OV2)' || ';
	 * END;'; --
	 * GOKDBMS.DYNAMIC_SQL_BIND(sql_stmt,error_code_out,error_mesg_out); -- IF
	 * error_mesg_out IS NOT NULL AND error_code_out IS NOT NULL THEN IF
	 * error_code_out = 'E' THEN MESSAGE(error_mesg_out); RAISE
	 * FORM_TRIGGER_FAILURE; ELSIF error_code_out ='W' THEN
	 * MESSAGE(error_mesg_out); END IF; END IF; END; -- END IF; END IF; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: KEY_BLOCK.CHECK_KEYS
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "CHECK_KEYS")
	public void keyBlock_CheckKeys() {

		{
			NString msg = NString.getNull();
			NString msgType = NString.getNull();
			NString checkEmployee = NString.getNull();
			
			getTask()
					.getGoqrpls()
					.gCheckValue(
							toBool((getFormModel().getKeyBlock().getId().isNull())),
							GNls.Fget(
									toStr("GOAMEDI-0008"),
									toStr("FORM"),
									toStr("*ERROR* An existing id number must be entered for this function.")),
							toBool(NBool.True), toBool(NBool.True));
			//
			if (getGlobal("HRESYS").equals("Y")) {
				checkEmployee = StoredProcedures.fIspidmintable(
						toStr("PEBEMPL"), toStr("PEBEMPL_PIDM"), getFormModel()
								.getKeyBlock().getPidm());
				//
				if (checkEmployee.equals("Y")) {
					{
						NString parm1 = getUser();
						NNumber parm2 = getFormModel().getKeyBlock().getPidm();
						NString errorCodeOut = NString.getNull();
						NString errorMesgOut = NString.getNull();
						NString sqlStmt = NString.getNull();
						sqlStmt = toStr("BEGIN NOKSECR.p_check_security (")
								.append("'").append(parm1).append("'")
								.append(",").append(parm2).append(",")
								.append("'").append("'").append(",")
								.append(":OV1,:OV2)").append("; END;");
						//
						Ref<NString> p_return_value1_ref = new Ref<NString>(
								errorCodeOut);
						Ref<NString> p_return_value2_ref = new Ref<NString>(
								errorMesgOut);
						Gokdbms.dynamicSqlBind(sqlStmt, p_return_value1_ref,
								p_return_value2_ref);
						errorCodeOut = p_return_value1_ref.val;
						errorMesgOut = p_return_value2_ref.val;
						//
						if (!errorMesgOut.isNull() && !errorCodeOut.isNull()) {
							if (errorCodeOut.equals("E")) {
								errorMessage(errorMesgOut);
								throw new ApplicationException();
							} else if (errorCodeOut.equals("W")) {
								errorMessage(errorMesgOut);
							}
						}
					}
				}
			}
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.PRE-TEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "PRE-TEXT-ITEM", item = "ID", function = KeyFunction.ITEM_IN)
	public void id_itemIn() {

		getGIdClass().itemIn();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "ID", function = KeyFunction.NEXT_ITEM)
	public void id_keyNexItem() {

		getGIdClass().keyNexItem();
	}

	/*
	 * Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL G$_COPY_FLD_ATTR;
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOAIDEN','QUERY');
	 * G$_RESET_GLOBAL; -- IF :GLOBAL.VALUE IS NOT NULL THEN EXECUTE_TRIGGER(
	 * 'LIST_VALUES_COPY' ) ; G$_CHECK_FAILURE ; NEXT_FIELD ; END IF ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.KEY-LISTVAL
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-LISTVAL", item = "ID", function = KeyFunction.LIST_VALUES)
	public void id_ListValues() {

		getTask().getGoqrpls().gCopyFldAttr();
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("SOAIDEN"), toStr("QUERY"));
		getTask().getGoqrpls().gResetGlobal();
		//
		if (!getGlobal("VALUE").isNull()) {
			executeAction("LIST_VALUES_COPY");
			getTask().getGoqrpls().gCheckFailure();
			
			nextItem();
			//TODO Morphis MP validate..
		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
	 * EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'POIIDEN','QUERY');
	 * 
	 * -- IF :GLOBAL.VALUE IS NOT NULL THEN EXECUTE_TRIGGER( 'LIST_VALUES_COPY'
	 * ) ; G$_CHECK_FAILURE ; NEXT_FIELD ; END IF ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.KEY-CQUERY
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-CQUERY", item = "ID", function = KeyFunction.COUNT_QUERY)
	public void id_TotalResults() {

		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("POIIDEN"), toStr("QUERY"));
		//
		if (!getGlobal("VALUE").isNull()) {
			executeAction("LIST_VALUES_COPY");
			getTask().getGoqrpls().gCheckFailure();
			//TODO Morphis MP validate..
		//	this.id_validate();
			nextItem();

		}
	}

	/*
	 * Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM BEGIN
	 * :CONFID_INFO := ''; :DECEASED_IND := '';
	 * G$_VALID_ID(:ID,:PIDM,:NAME,:CONFID_INFO,:DECEASED_IND);
	 * G$_CHECK_FAILURE; END;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger:
	 * ID.WHEN-VALIDATE-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ValidationTrigger(item = "ID")
	public void id_validate() {

		

		getFormModel().getKeyBlock().setConfidInfo(toStr(""));
		getFormModel().getKeyBlock().setDeceasedInd(toStr(""));
		Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock()
				.getId());
		Ref<NNumber> pPIdm_ref = new Ref<NNumber>(getFormModel().getKeyBlock()
				.getPidm());
		Ref<NString> pFullName_ref = new Ref<NString>(getFormModel()
				.getKeyBlock().getNname());
		Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel()
				.getKeyBlock().getConfidInfo());
		Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel()
				.getKeyBlock().getDeceasedInd());
		getTask().getGoqrpls().gValidId(pId_ref, pPIdm_ref, pFullName_ref,
				pConfidInd_ref, pDcsdInd_ref);
		getFormModel().getKeyBlock().setId(pId_ref.val);
		getFormModel().getKeyBlock().setPidm(pPIdm_ref.val);
		getFormModel().getKeyBlock().setNname(pFullName_ref.val);
		getFormModel().getKeyBlock().setConfidInfo(pConfidInd_ref.val);
		getFormModel().getKeyBlock().setDeceasedInd(pDcsdInd_ref.val);
		getTask().getGoqrpls().gCheckFailure();
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.POST-CHANGE
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "POST-CHANGE", item = "ID")
	public void id_PostChange() {

		getGIdClass().postChange();
	}

	/*
	 * Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
	 * 
	 * G$_COPY_FLD_ATTR; EXECUTE_TRIGGER('G$_REVOKE_ACCESS'); G$_CHECK_FAILURE;
	 * G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'GUIALTI','QUERY');
	 * G$_RESET_GLOBAL; -- IF :GLOBAL.VALUE IS NOT NULL THEN EXECUTE_TRIGGER(
	 * 'LIST_VALUES_COPY' ) ; G$_CHECK_FAILURE ; NEXT_FIELD ; END IF ;
	 */
	/*
	 * <p><b>Migration Comments</b> Generated from trigger: ID.KEY-DUP-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-DUP-ITEM", item="ID")
	public void id_KeyDupItem() {

		getTask().getGoqrpls().gCopyFldAttr();
		executeAction("G$_REVOKE_ACCESS");
		getTask().getGoqrpls().gCheckFailure();
		getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"),
				toStr("GUIALTI"), toStr("QUERY"));
		getTask().getGoqrpls().gResetGlobal();
		//
		if (!getGlobal("VALUE").isNull()) {
			executeAction("LIST_VALUES_COPY");
			getTask().getGoqrpls().gCheckFailure();
			//TODO Morphis MP validate..
		//	this.id_validate();
			nextItem();
		}
	}

	/*
	 * <p><b>Migration Comments</b> Generated from trigger: NAME.KEY-NEXT-ITEM
	 * 
	 * 
	 * </p>
	 */

	@ActionTrigger(action = "KEY-NEXT-ITEM", item = "NAME", function = KeyFunction.NEXT_ITEM)
	public void name_keyNexItem() {

		getGNameClass().keyNexItem();
	}

}
