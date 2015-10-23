package net.hedtech.banner.general.common.Goamedi.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;

import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
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

import net.hedtech.banner.general.common.Goamedi.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goamedi.model.*;

public class GoamediServices extends AbstractSupportCodeObject {

	public GoamediServices(ISupportCodeContainer container) {
		super(container);
	}

	public GoamediTask getTask() {
		return (GoamediTask) super.getContainer();
	}

	public net.hedtech.banner.general.common.Goamedi.model.GoamediModel getFormModel() {
		return getTask().getModel();
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	 * 
	 * PROCEDURE AUDIT_TRAIL_6_0 IS <multilinecomment> AUDIT TRAIL: 6.0 1. RPE
	 * #29921 VRM 11/18/2002 New form. This is the General Medical Information
	 * Form. This form GOAMEDI is used to enter the medical conditions of
	 * Employees and Students. It replaces the Student Medical Information Form
	 * SPAMEDI and the employee Medical Information Form PPAMEDI. Since both
	 * these forms practically did the same thing in the previous versions of
	 * Banner, in release 6.0 of Banner, we decided that we will replace both
	 * these forms with a single General form and called it as GOAMEDI.
	 * 
	 * This General form invokes HR security dynamically using DBMS_SQL. It uses
	 * the procedure p_check_security within the package NOKSECR to do the HR
	 * security.
	 * 
	 * AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1359
	/*
	 */
	public void auditTrail60() {
	}

	/*
	 * Original PL/SQL code for Prog Unit TEXT_EDIT_PROC
	 * 
	 * PROCEDURE TEXT_EDIT_PROC(text_field IN varchar2, text_field_length IN
	 * number, return_text_out OUT varchar2, message_out OUT varchar2) IS --
	 * 7311 change size of comment allowed from 500 to 3600 -- ed_ok BOOLEAN;
	 * commentval varchar2(5000) := ''; return_text varchar2(3600);
	 * message_out_var varchar2(250); -- BEGIN
	 * SHOW_EDITOR('G$_GENERAL_EDITOR',name_in(text_field),344,56,commentval,ed_ok);
	 * -- IF ed_ok THEN if length(commentval) > text_field_length then
	 * return_text := substr(commentval,1, text_field_length); return_text_out
	 * := return_text; bell; message_out_var := (G$_NLS.Get('GOAMEDI-0028',
	 * 'FORM', '*WARNING* Comment is limited to %01% characters; the length is
	 * %02% and will be truncated to %03%.', text_field_length,
	 * to_char(length(commentval)), text_field_length)); else IF
	 * (NVL(name_in(text_field),'~') <> commentval) THEN return_text :=
	 * substr(commentval,1,text_field_length) ; return_text_out := return_text;
	 * message_out_var := ''; ELSE return_text_out := commentval;
	 * message_out_var := ''; END IF; end if; ELSE return_text_out :=
	 * name_in(text_field); message_out_var := ''; END IF; message_out :=
	 * message_out_var; return; END;
	 */
	// ID:1360
	/*
	 * <p>
	 * </p>
	 * 
	 * @param textField
	 * 
	 * @param textFieldLength
	 * 
	 * @param returnTextOut
	 * 
	 * @param messageOut
	 */
	public void textEditProc(NString textField, NNumber textFieldLength,
			Ref<NString> returnTextOut, Ref<NString> messageOut) {
		// 7311 change size of comment allowed from 500 to 3600
		//
		Ref<NBool> edOk = new Ref<NBool>();
		Ref<NString> commentval = new Ref<NString>();
		NString returnText = NString.getNull();
		NString messageOutVar = NString.getNull();
		
		editTextItem(commentval, edOk);
		//
		if (edOk.val.getValue()) {
			if (length(commentval.val).greater(textFieldLength)) {
				returnText = substring(commentval.val, toInt(1), toInt(textFieldLength));
				returnTextOut.val = returnText;
				
				messageOutVar = ((GNls
						.Fget(toStr("GOAMEDI-0028"),
								toStr("FORM"),
								toStr("*WARNING* Comment is limited to %01% characters; the length is %02% and will be truncated to %03%."),
								toStr(textFieldLength),
								toChar(length(commentval.val)),
								toStr(textFieldLength))));
			} else {
				if ((isNull(getNameIn(textField), "~").notEquals(commentval.val))) {
					returnText = substring(commentval.val, toInt(1),
							toInt(textFieldLength));
					returnTextOut.val = returnText;
					messageOutVar = toStr("");
				} else {
					returnTextOut.val = commentval.val;
					messageOutVar = toStr("");
				}
			}
		} else {
			returnTextOut.val = getNameIn(textField);
			messageOutVar = toStr("");
		}
		messageOut.val = messageOutVar;
		return;
	}

	/*
	 * Original PL/SQL code for Prog Unit TEXT_ERROR_PROC
	 * 
	 * PROCEDURE TEXT_ERROR_PROC(text_field varchar2, text_field_length number)
	 * IS -- lv_errcod NUMBER := ERROR_CODE; lv_errtyp VARCHAR2(3) :=
	 * ERROR_TYPE; lv_errtxt VARCHAR2(80) := ERROR_TEXT; BEGIN IF (lv_errcod =
	 * 40735) THEN if length(name_in(text_field)) > text_field_length then
	 * message(G$_NLS.Get('GOAMEDI-0029', 'FORM', '*ERROR* Your comment can only
	 * be %01% characters in length; the length is %02%', text_field_length,
	 * to_char(length(name_in(text_field))))); else
	 * Message(lv_errtyp||'-'||to_char(lv_errcod)||': '||lv_errtxt); RAISE
	 * Form_Trigger_Failure; end if; ELSE
	 * Message(lv_errtyp||'-'||to_char(lv_errcod)||': '||lv_errtxt); RAISE
	 * Form_Trigger_Failure; END IF; END;
	 */
	// ID:1361
	/*
	 * 
	 * @param textField
	 * 
	 * @param textFieldLength
	 */
	public void textErrorProc(NString textField, NNumber textFieldLength) {
		//
		// NNumber lvErrcod = SupportClasses.SQLFORMS.ErrorCode();
		// NString lvErrtyp = SupportClasses.SQLFORMS.ErrorType();
		// NString lvErrtxt = SupportClasses.SQLFORMS.ErrorText();
		// if ((lvErrcod.equals(40735)))
		// {
		// if ( length(getNameIn(textField)).greater(textFieldLength) )
		// {
		// message(GNls.Fget(toStr("GOAMEDI-0029"), toStr("FORM"),
		// toStr("*ERROR* Your comment can only be %01% characters in length; the length is %02%"),
		// toStr(textFieldLength), toChar(length(getNameIn(textField)))));
		// }
		// else {
		// message(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
		// throw new ApplicationException();
		// }
		// }
		// else {
		// message(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
		// throw new ApplicationException();
		// }
		//
		try {
			if (length(getNameIn(textField)).greater(textFieldLength)) {
				errorMessage(GNls
						.Fget(toStr("GOAMEDI-0029"),
								toStr("FORM"),
								toStr("*ERROR* Your comment can only be %01% characters in length; the length is %02%"),
								toStr(textFieldLength),
								toChar(length(getNameIn(textField)))));
			}

		} catch (Exception e) {

			throw new ApplicationException();
		}

	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	 * 
	 * PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS <multilinecomment> AUDIT TRAIL: 7.0
	 * FORMSCNV 1. Michael Hitrik 01/30/2004 Auto conversion of UI enhancements.
	 * Refer to the General UI documentation for more details. AUDIT TRAIL END
	 * </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1362
	/*
	 */
	public void auditTrail70Formscnv() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	 * 
	 * PROCEDURE AUDIT_TRAIL_7_0 IS <multilinecomment> AUDIT TRAIL: 7.0 1.
	 * Michael Hitrik 03/04/2004 Application of enhanced UI methodology. Please
	 * refer to the SCT Banner 7.0 User Interface Technical Methodology for more
	 * details.
	 * 
	 * AUDIT TRAIL: 7.3 1. LB 03/16/2005 Modified block to implement calls to
	 * the GB_MEDICAL API. This required adding new ON-INSERT, ON-DELETE and
	 * ON-UPDATE triggers. The form is also executing new ON-ROLLBACK and
	 * POST-FORMS-COMMIT triggers to make this block message aware. 2. LB
	 * 05/24/2005 Added unchecked value and initial of 'N' to the
	 * SPRMEDI_DISB_IND item this is a NOT NULL column in the table. 3. DS
	 * 03/07/2006 Increased the length of the SPRMEDI_MEDI_CODE field. Added
	 * Medical Date field, SPRMEDI_MEDI_CODE_DATE column to the
	 * SPRMEDI_1_CANVAS. 4. SJQ 04/28/2006 Update the logic in the
	 * SPRMEDI_DISB_IND WHEN-CHECKBOX-CHANGED in the way it handled navigating
	 * back to the current record. The original logic did not take into
	 * consideration that the current record might not be the top most visible
	 * record. Updated the logic to make sure that the top most record is the
	 * same as it was before the trigger fired.
	 * 
	 * AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1363
	/*
	 */
	public void auditTrail70() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_1_1
	 * 
	 * PROCEDURE AUDIT_TRAIL_7_3_1_1 IS <multilinecomment> AUDIT TRAIL: 7.3.1.1
	 * 1. George Shalovka 19 july 2006 Correct defect 1-O4G1L Problem: Form item
	 * 'Medical Code' does not update correctly. SPRMEDI_MEDI_CODE is one of the
	 * primary keys to database row and is not updateable. Solution: Modify
	 * trigger SPRMEDI.Pre-Update to store original database value in
	 * SPRMEDI.HOLD_MEDI_CODE, then check if row exists in table PEREACC which
	 * uses same 'Medical Code' as one being changed; if so, display error.
	 * Modify trigger SPRMEDI.On-Update to perform delete then insert if
	 * 'Medical Code' has changed. Note that delete API call is made with
	 * SPRMEDI.HOLD_MEDI_CODE, which is the original database value. Modify
	 * SPRMEDI.SPRMEDI_ACTIVITY_DATE property pallette to conform to date
	 * standards. Modify program unit TEXT_EDIT_PROC and trigger
	 * SPRMEDI.SPRMEDI_COMMENT.Key-Edit to handle current API maximum of ~3600
	 * characters. Modify trigger SPRMEDI.SPRMEDI_COMMENT.When-Button-Pressed to
	 * display error message when button is pressed and cursor is not in data
	 * block. Modify canvas layout of form items to correspond to standards and
	 * improve usability. AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1364
	/*
	 */
	public void auditTrail7311() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	 * 
	 * PROCEDURE AUDIT_TRAIL_7_4 IS <multilinecomment> AUDIT TRAIL: 7.4 1.
	 * George Shalovka 02 November 2006 Correct defect 1-17T7MZ Minor UI problem
	 * with block Key Block items 'Confidential' and 'Deceased' not using
	 * standard Verdana font. Modified form items KEY_BLOCK.CONFID_INFO and
	 * KEY_BLOCK.DECEASED_IND property pallette Font.Font Name from
	 * (Unspeciified) to 'Verdana' Font.Font Size from (Unspecified) to '9'
	 * Font.Font Weight from (Unspecified) to 'Demilight' Font.Font Style from
	 * (Unspecified) to 'Plain' Font.Font Spacing from (Unspecified) to
	 * 'Normal'. AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1365
	/*
	 */
	public void auditTrail74() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	 * 
	 * PROCEDURE AUDIT_TRAIL_8_0_I18N IS <multilinecomment> AUDIT TRAIL: 8.0
	 * I18N 1. Michael Hitrik 06/28/2007 Added the G$_CHAR_FIELD_CLASS or
	 * G$_CHAR_MULTILINE_FIELD_CLASS to support internationalization
	 * requirements. AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1366
	/*
	 */
	public void auditTrail80I18n() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	 * 
	 * PROCEDURE AUDIT_TRAIL_8_0 IS <multilinecomment>
	 * 
	 * AUDIT TRAIL: 8.0 1. ShylajaS 07/13/2007 Defect 1-1AD9Z0
	 * BLOCK.SPRMEDI.ITEM.SPRMEDI_MEDI_CODE_DATE.Format Mask - "DD-MON-RRRR" +
	 * AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1367
	public void auditTrail80() {
	}

	/*
	 * Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	 * 
	 * PROCEDURE AUDIT_TRAIL_8_1 IS <multilinecomment>
	 * 
	 * AUDIT TRAIL: 8.1 1. EapenM 04/22/2008 Defect:1-331QWN Added
	 * GET_ITEM_PROPERTY('SPRMEDI_COMMENT',ENABLED) = 'TRUE' condition to
	 * WHEN-BUTTON-PRESSED trigger of SPRMEDI_COMMENT_BTN button. AUDIT TRAIL
	 * END </multilinecomment> BEGIN NULL; END;
	 */
	// ID:1368
	/*
	 */
	public void auditTrail81() {
	}

}
