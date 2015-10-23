package net.hedtech.general.common.libraries.Soqrpls;

import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;

import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class SoqrplsServices extends AbstractLibrary {

	public SoqrplsServices(LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}

	// Attached Libraries
	public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw() {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices) getSupportCodeManager()
				.getLibrary("GOQWFLW");
	}

	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls() {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices) getSupportCodeManager()
				.getLibrary("GOQRPLS");
	}

	public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls() {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices) getSupportCodeManager()
				.getLibrary("EOQRPLS");
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.SELECT_SOBCURR_TERM
	/*
	 * FUNCTION SELECT_SOBCURR_TERM (IVAR_1 VARCHAR2, IVAR_2 VARCHAR2, IVAR_3
	 * NUMBER) RETURN BOOLEAN IS PTI_INTO_TEMP VARCHAR2(255); CURSOR PTI_CURSOR
	 * IS SELECT 'X' FROM sormcrl x where IVAR_3 = x.sormcrl_curr_rule and
	 * sormcrl_term_code_eff = (select max(sormcrl_term_code_eff) from sormcrl
	 * where ((decode(sormcrl_rec_ind,'Y','R','N') = IVAR_2 or
	 * decode(sormcrl_adm_ind,'Y','A','N') = IVAR_2 or
	 * decode(sormcrl_stu_ind,'Y','S','N') = IVAR_2 or
	 * decode(sormcrl_his_ind,'Y','H','N') = IVAR_2 or
	 * decode(sormcrl_dau_ind,'Y','M','N') = IVAR_2) or IVAR_2 = 'X') and
	 * sormcrl_curr_rule = x.sormcrl_curr_rule and sormcrl_term_code_eff <=
	 * IVAR_1); BEGIN OPEN PTI_CURSOR ; FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
	 * RETURN (PTI_CURSOR%NOTFOUND) ; END ;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param ivar1
	 * 
	 * @param ivar2
	 * 
	 * @param ivar3
	 */
	public NBool selectSobcurrTerm(NString ivar1, NString ivar2, NNumber ivar3) {
		int rowCount = 0;
		NString ptiIntoTemp = NString.getNull();
		String sqlptiCursor = "SELECT 'X' "
				+ " FROM sormcrl x "
				+ " WHERE :P_IVAR_3 = x.sormcrl_curr_rule AND sormcrl_term_code_eff = (SELECT max(sormcrl_term_code_eff) "
				+ " FROM sormcrl "
				+ " WHERE ((decode(sormcrl_rec_ind, 'Y', 'R', 'N') = :P_IVAR_2 OR decode(sormcrl_adm_ind, 'Y', 'A', 'N') = :P_IVAR_2 OR decode(sormcrl_stu_ind, 'Y', 'S', 'N') = :P_IVAR_2 OR decode(sormcrl_his_ind, 'Y', 'H', 'N') = :P_IVAR_2 OR decode(sormcrl_dau_ind, 'Y', 'M', 'N') = :P_IVAR_2) OR :P_IVAR_2 = 'X') AND sormcrl_curr_rule = x.sormcrl_curr_rule AND sormcrl_term_code_eff <= :P_IVAR_1 ) ";
		DataCursor ptiCursor = new DataCursor(sqlptiCursor);
		try {
			// Setting query parameters
			ptiCursor.addParameter("P_IVAR_3", ivar3);
			ptiCursor.addParameter("P_IVAR_2", ivar2);
			ptiCursor.addParameter("P_IVAR_1", ivar1);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable ptiCursor.
			ptiCursor.open();
			ResultSet ptiCursorResults = ptiCursor.fetchInto();
			if (ptiCursorResults != null) {
				ptiIntoTemp = ptiCursorResults.getStr(0);
			}
			return (toBool(ptiCursor.notFound()));
		} finally {
			ptiCursor.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.SELECT_CMNR_RULE
	/*
	 * FUNCTION SELECT_CMNR_RULE(curr_rule integer, term VARCHAR2, minr
	 * VARCHAR2, module VARCHAR2) return number is rule number; cursor c1 is
	 * select sorcmnr_cmnr_rule from sorcmnr x where x.sorcmnr_term_code_eff =
	 * (select max(sorcmnr_term_code_eff) from sorcmnr where sorcmnr_curr_rule =
	 * x.sorcmnr_curr_rule and sorcmnr_term_code_eff <= term) and
	 * x.sorcmnr_curr_rule = curr_rule and (decode(x.sorcmnr_stu_ind,'Y','S') =
	 * module or decode(x.sorcmnr_rec_ind,'Y','R') = module or
	 * decode(x.sorcmnr_adm_ind,'Y','A') = module or
	 * decode(x.sorcmnr_his_ind,'Y','H') = module or
	 * decode(x.sorcmnr_dau_ind,'Y','M') = module) and x.sorcmnr_majr_code_minr
	 * = minr; begin open c1; fetch c1 into rule; return rule; close c1; RETURN
	 * NULL; end;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param term
	 * 
	 * @param minr
	 * 
	 * @param module
	 */
	public NNumber selectCmnrRule(NInteger currRule, NString term,
			NString minr, NString module) {
		int rowCount = 0;
		NNumber rule = NNumber.getNull();
		String sqlc1 = "SELECT sorcmnr_cmnr_rule "
				+ " FROM sorcmnr x "
				+ " WHERE x.sorcmnr_term_code_eff = (SELECT max(sorcmnr_term_code_eff) "
				+ " FROM sorcmnr "
				+ " WHERE sorcmnr_curr_rule = x.sorcmnr_curr_rule AND sorcmnr_term_code_eff <= :P_TERM ) AND x.sorcmnr_curr_rule = :P_CURR_RULE AND (decode(x.sorcmnr_stu_ind, 'Y', 'S') = :P_MODULE OR decode(x.sorcmnr_rec_ind, 'Y', 'R') = :P_MODULE OR decode(x.sorcmnr_adm_ind, 'Y', 'A') = :P_MODULE OR decode(x.sorcmnr_his_ind, 'Y', 'H') = :P_MODULE OR decode(x.sorcmnr_dau_ind, 'Y', 'M') = :P_MODULE) AND x.sorcmnr_majr_code_minr = :P_MINR ";
		DataCursor c1 = new DataCursor(sqlc1);
		try {
			// Setting query parameters
			c1.addParameter("P_TERM", term);
			c1.addParameter("P_CURR_RULE", currRule);
			c1.addParameter("P_MODULE", module);
			c1.addParameter("P_MINR", minr);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable c1.
			c1.open();
			ResultSet c1Results = c1.fetchInto();
			if (c1Results != null) {
				rule = c1Results.getNumber(0);
			}
			c1.close();
			return rule;
			// return NNumber.getNull();
		} finally {
			c1.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.SELECT_CMJR_RULE
	/*
	 * FUNCTION SELECT_CMJR_RULE (curr_rule integer, major VARCHAR2, dept
	 * VARCHAR2, term VARCHAR2, module VARCHAR2) return number is rule number;
	 * cursor c1 is select sorcmjr_cmjr_rule from sorcmjr x where
	 * x.sorcmjr_term_code_eff = (select max(sorcmjr_term_code_eff) from sorcmjr
	 * where sorcmjr_curr_rule = x.sorcmjr_curr_rule and sorcmjr_cmjr_rule =
	 * x.sorcmjr_cmjr_rule and sorcmjr_term_code_eff <= term) and
	 * x.sorcmjr_curr_rule = curr_rule and (nvl(x.sorcmjr_dept_code,'%') =
	 * nvl(dept,'%') or (x.sorcmjr_dept_code is null and dept is not null)) and
	 * (decode(x.sorcmjr_stu_ind,'Y','S') = module or
	 * decode(x.sorcmjr_rec_ind,'Y','R') = module or
	 * decode(x.sorcmjr_adm_ind,'Y','A') = module or
	 * decode(x.sorcmjr_his_ind,'Y','H') = module or
	 * decode(x.sorcmjr_dau_ind,'Y','M') = module) and
	 * (nvl(x.sorcmjr_majr_code,'%') = nvl(major,'%') or (x.sorcmjr_majr_code is
	 * null and major is not null)); begin open c1; fetch c1 into rule; return
	 * rule; end select_cmjr_rule;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param major
	 * 
	 * @param dept
	 * 
	 * @param term
	 * 
	 * @param module
	 */
	public NNumber selectCmjrRule(NInteger currRule, NString major,
			NString dept, NString term, NString module) {
		int rowCount = 0;
		NNumber rule = NNumber.getNull();
		String sqlc1 = "SELECT sorcmjr_cmjr_rule "
				+ " FROM sorcmjr x "
				+ " WHERE x.sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) "
				+ " FROM sorcmjr "
				+ " WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND sorcmjr_cmjr_rule = x.sorcmjr_cmjr_rule AND sorcmjr_term_code_eff <= :P_TERM ) AND x.sorcmjr_curr_rule = :P_CURR_RULE AND (nvl(x.sorcmjr_dept_code, '%') = nvl(:P_DEPT, '%') OR (x.sorcmjr_dept_code IS NULL AND :P_DEPT IS NOT NULL)) AND (decode(x.sorcmjr_stu_ind, 'Y', 'S') = :P_MODULE OR decode(x.sorcmjr_rec_ind, 'Y', 'R') = :P_MODULE OR decode(x.sorcmjr_adm_ind, 'Y', 'A') = :P_MODULE OR decode(x.sorcmjr_his_ind, 'Y', 'H') = :P_MODULE OR decode(x.sorcmjr_dau_ind, 'Y', 'M') = :P_MODULE) AND (nvl(x.sorcmjr_majr_code, '%') = nvl(:P_MAJOR, '%') OR (x.sorcmjr_majr_code IS NULL AND :P_MAJOR IS NOT NULL)) ";
		DataCursor c1 = new DataCursor(sqlc1);
		try {
			// Setting query parameters
			c1.addParameter("P_TERM", term);
			c1.addParameter("P_CURR_RULE", currRule);
			c1.addParameter("P_DEPT", dept);
			c1.addParameter("P_MODULE", module);
			c1.addParameter("P_MAJOR", major);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable c1.
			c1.open();
			ResultSet c1Results = c1.fetchInto();
			if (c1Results != null) {
				rule = c1Results.getNumber(0);
			}
			return rule;
		} finally {
			c1.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.SELECT_CCON_RULE
	/*
	 * FUNCTION SELECT_CCON_RULE (curr_rule integer, term VARCHAR2, conc
	 * VARCHAR2, cmjr_rule integer, module VARCHAR2) return number is rule
	 * number; cursor c1 is select sorccon_ccon_rule from sorccon x where
	 * x.sorccon_term_code_eff = (select max(sorccon_term_code_eff) from sorccon
	 * where sorccon_curr_rule = x.sorccon_curr_rule and sorccon_term_code_eff
	 * <= term) and (decode(x.sorccon_stu_ind,'Y','S') = module or
	 * decode(x.sorccon_rec_ind,'Y','R') = module or
	 * decode(x.sorccon_adm_ind,'Y','A') = module or
	 * decode(x.sorccon_his_ind,'Y','H') = module or
	 * decode(x.sorccon_dau_ind,'Y','M') = module ) and (x.sorccon_cmjr_rule =
	 * cmjr_rule or x.sorccon_cmjr_rule is null) and x.sorccon_majr_code_conc =
	 * conc and x.sorccon_curr_rule = curr_rule; begin open c1; fetch c1 into
	 * rule; return rule; close c1; RETURN NULL; end select_ccon_rule;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param term
	 * 
	 * @param conc
	 * 
	 * @param cmjrRule
	 * 
	 * @param module
	 */
	public NNumber selectCconRule(NInteger currRule, NString term,
			NString conc, NInteger cmjrRule, NString module) {
		int rowCount = 0;
		NNumber rule = NNumber.getNull();
		String sqlc1 = "SELECT sorccon_ccon_rule "
				+ " FROM sorccon x "
				+ " WHERE x.sorccon_term_code_eff = (SELECT max(sorccon_term_code_eff) "
				+ " FROM sorccon "
				+ " WHERE sorccon_curr_rule = x.sorccon_curr_rule AND sorccon_term_code_eff <= :P_TERM ) AND (decode(x.sorccon_stu_ind, 'Y', 'S') = :P_MODULE OR decode(x.sorccon_rec_ind, 'Y', 'R') = :P_MODULE OR decode(x.sorccon_adm_ind, 'Y', 'A') = :P_MODULE OR decode(x.sorccon_his_ind, 'Y', 'H') = :P_MODULE OR decode(x.sorccon_dau_ind, 'Y', 'M') = :P_MODULE) AND (x.sorccon_cmjr_rule = :P_CMJR_RULE OR x.sorccon_cmjr_rule IS NULL) AND x.sorccon_majr_code_conc = :P_CONC AND x.sorccon_curr_rule = :P_CURR_RULE ";
		DataCursor c1 = new DataCursor(sqlc1);
		try {
			// Setting query parameters
			c1.addParameter("P_TERM", term);
			c1.addParameter("P_MODULE", module);
			c1.addParameter("P_CMJR_RULE", cmjrRule);
			c1.addParameter("P_CONC", conc);
			c1.addParameter("P_CURR_RULE", currRule);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable c1.
			c1.open();
			ResultSet c1Results = c1.fetchInto();
			if (c1Results != null) {
				rule = c1Results.getNumber(0);
			}
			c1.close();
			return rule;
			// return NNumber.getNull();
		} finally {
			c1.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.SELECT_CCONBASE_RULE
	/*
	 * FUNCTION SELECT_CCONBASE_RULE (curr_rule integer, term VARCHAR2, conc
	 * VARCHAR2, module VARCHAR2) return number is rule number; cursor c1 is
	 * select sorccon_ccon_rule from sorccon x where x.sorccon_term_code_eff =
	 * (select max(sorccon_term_code_eff) from sorccon where sorccon_curr_rule =
	 * x.sorccon_curr_rule and sorccon_term_code_eff <= term) and
	 * (decode(x.sorccon_stu_ind,'Y','S') = module or
	 * decode(x.sorccon_rec_ind,'Y','R') = module or
	 * decode(x.sorccon_adm_ind,'Y','A') = module or
	 * decode(x.sorccon_his_ind,'Y','H') = module or
	 * decode(x.sorccon_dau_ind,'Y','M') = module ) and x.sorccon_cmjr_rule is
	 * null and x.sorccon_majr_code_conc = conc and x.sorccon_curr_rule =
	 * curr_rule; begin open c1; fetch c1 into rule; return rule; close c1;
	 * RETURN NULL; end select_cconbase_rule;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param term
	 * 
	 * @param conc
	 * 
	 * @param module
	 */
	public NNumber selectCconbaseRule(NInteger currRule, NString term,
			NString conc, NString module) {
		int rowCount = 0;
		NNumber rule = NNumber.getNull();
		String sqlc1 = "SELECT sorccon_ccon_rule "
				+ " FROM sorccon x "
				+ " WHERE x.sorccon_term_code_eff = (SELECT max(sorccon_term_code_eff) "
				+ " FROM sorccon "
				+ " WHERE sorccon_curr_rule = x.sorccon_curr_rule AND sorccon_term_code_eff <= :P_TERM ) AND (decode(x.sorccon_stu_ind, 'Y', 'S') = :P_MODULE OR decode(x.sorccon_rec_ind, 'Y', 'R') = :P_MODULE OR decode(x.sorccon_adm_ind, 'Y', 'A') = :P_MODULE OR decode(x.sorccon_his_ind, 'Y', 'H') = :P_MODULE OR decode(x.sorccon_dau_ind, 'Y', 'M') = :P_MODULE) AND x.sorccon_cmjr_rule IS NULL AND x.sorccon_majr_code_conc = :P_CONC AND x.sorccon_curr_rule = :P_CURR_RULE ";
		DataCursor c1 = new DataCursor(sqlc1);
		try {
			// Setting query parameters
			c1.addParameter("P_TERM", term);
			c1.addParameter("P_MODULE", module);
			c1.addParameter("P_CONC", conc);
			c1.addParameter("P_CURR_RULE", currRule);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable c1.
			c1.open();
			ResultSet c1Results = c1.fetchInto();
			if (c1Results != null) {
				rule = c1Results.getNumber(0);
			}
			c1.close();
			return rule;
			// return NNumber.getNull();
		} finally {
			c1.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_VALID_ID
	/*
	 * PROCEDURE S$_VALID_ID(p_ID IN OUT VARCHAR2, p_PIDM IN OUT NUMBER,
	 * p_FULL_NAME IN OUT VARCHAR2, p_CONFID_IND IN OUT VARCHAR2, p_DCSD_IND IN
	 * OUT VARCHAR2, p_CHECK_VALUE IN VARCHAR2 default 'YYYYN') IS BEGIN
	 * G$_VALID_ALL_ID(p_ID, p_PIDM, p_FULL_NAME, p_CONFID_IND, p_DCSD_IND,
	 * p_CHECK_VALUE, 'P'); END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pId
	 * 
	 * @param pPidm
	 * 
	 * @param pFullName
	 * 
	 * @param pConfidInd
	 * 
	 * @param pDcsdInd
	 */
	public void sValidId(Ref<NString> pId, Ref<NNumber> pPidm,
			Ref<NString> pFullName, Ref<NString> pConfidInd,
			Ref<NString> pDcsdInd) {
		sValidId(pId, pPidm, pFullName, pConfidInd, pDcsdInd, toStr("YYYYN"));
	}

	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pId
	 * 
	 * @param pPidm
	 * 
	 * @param pFullName
	 * 
	 * @param pConfidInd
	 * 
	 * @param pDcsdInd
	 * 
	 * @param pCheckValue
	 */
	public void sValidId(Ref<NString> pId, Ref<NNumber> pPidm,
			Ref<NString> pFullName, Ref<NString> pConfidInd,
			Ref<NString> pDcsdInd, NString pCheckValue) {
		getGoqrpls().gValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd,
				pCheckValue, toStr("P"));
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_VALID_ALL_ID
	/*
	 * PROCEDURE S$_VALID_ALL_ID(p_ID IN OUT VARCHAR2, p_PIDM IN OUT NUMBER,
	 * p_FULL_NAME IN OUT VARCHAR2, p_CONFID_IND IN OUT VARCHAR2, p_DCSD_IND IN
	 * OUT VARCHAR2, p_CHECK_VALUE IN VARCHAR2 default 'YYYYN') IS BEGIN
	 * G$_VALID_ALL_ID(p_ID, p_PIDM, p_FULL_NAME, p_CONFID_IND, p_DCSD_IND,
	 * p_CHECK_VALUE); END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pId
	 * 
	 * @param pPidm
	 * 
	 * @param pFullName
	 * 
	 * @param pConfidInd
	 * 
	 * @param pDcsdInd
	 */
	public void sValidAllId(Ref<NString> pId, Ref<NNumber> pPidm,
			Ref<NString> pFullName, Ref<NString> pConfidInd,
			Ref<NString> pDcsdInd) {
		sValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd, toStr("YYYYN"));
	}

	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pId
	 * 
	 * @param pPidm
	 * 
	 * @param pFullName
	 * 
	 * @param pConfidInd
	 * 
	 * @param pDcsdInd
	 * 
	 * @param pCheckValue
	 */
	public void sValidAllId(Ref<NString> pId, Ref<NNumber> pPidm,
			Ref<NString> pFullName, Ref<NString> pConfidInd,
			Ref<NString> pDcsdInd, NString pCheckValue) {
		getGoqrpls().gValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd,
				pCheckValue);
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_MENUSET
	/*
	 * PROCEDURE S$_MenuSet (Form_Type in varchar2, Select_Action in varchar2,
	 * NxtBlk_Action in varchar2, PrvBlk_Action in varchar2) IS BEGIN if
	 * Form_Type = 'I' then
	 * SET_MENU_ITEM_PROPERTY('Record.Clear',ENABLED,PROPERTY_FALSE);
	 * SET_MENU_ITEM_PROPERTY('Record.Remove',ENABLED,PROPERTY_FALSE);
	 * SET_MENU_ITEM_PROPERTY('Record.Insert',ENABLED,PROPERTY_FALSE);
	 * SET_MENU_ITEM_PROPERTY('Action.Save',ENABLED,PROPERTY_FALSE); else
	 * SET_MENU_ITEM_PROPERTY('Record.Clear',ENABLED,PROPERTY_TRUE);
	 * SET_MENU_ITEM_PROPERTY('Record.Remove',ENABLED,PROPERTY_TRUE);
	 * SET_MENU_ITEM_PROPERTY('Record.Insert',ENABLED,PROPERTY_TRUE);
	 * SET_MENU_ITEM_PROPERTY('Action.Save',ENABLED,PROPERTY_TRUE); end if; if
	 * Select_Action = 'D' then
	 * SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_FALSE); elsif
	 * Select_Action = 'E' then
	 * SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE); end if; if
	 * NxtBlk_Action = 'D' then
	 * SET_MENU_ITEM_PROPERTY('Block.Next',ENABLED,PROPERTY_FALSE); elsif
	 * NxtBlk_Action = 'E' then
	 * SET_MENU_ITEM_PROPERTY('Block.Next',ENABLED,PROPERTY_TRUE); end if; if
	 * PrvBlk_Action = 'D' then
	 * SET_MENU_ITEM_PROPERTY('Block.Previous',ENABLED,PROPERTY_FALSE); elsif
	 * PrvBlk_Action = 'E' then
	 * SET_MENU_ITEM_PROPERTY('Block.Previous',ENABLED,PROPERTY_TRUE); end if;
	 * END;
	 */
	/*
	 * <p> /* </p>
	 * 
	 * @param formType
	 * 
	 * @param selectAction
	 * 
	 * @param nxtblkAction
	 * 
	 * @param prvblkAction
	 */
	public void sMenuset(NString formType, NString selectAction,
			NString nxtblkAction, NString prvblkAction) {
		if (formType.equals("I")) {
			setMenuItemEnabled("Record.Clear", false);
			setMenuItemEnabled("Record.Remove", false);
			setMenuItemEnabled("Record.Insert", false);
			setMenuItemEnabled("Action.Save", false);
		} else {
			setMenuItemEnabled("Record.Clear", true);
			setMenuItemEnabled("Record.Remove", true);
			setMenuItemEnabled("Record.Insert", true);
			setMenuItemEnabled("Action.Save", true);
		}
		if (selectAction.equals("D")) {
			setMenuItemEnabled("Action.Select", false);
		} else if (selectAction.equals("E")) {
			setMenuItemEnabled("Action.Select", true);
		}
		if (nxtblkAction.equals("D")) {
			setMenuItemEnabled("Block.Next", false);
		} else if (nxtblkAction.equals("E")) {
			setMenuItemEnabled("Block.Next", true);
		}
		if (prvblkAction.equals("D")) {
			setMenuItemEnabled("Block.Previous", false);
		} else if (prvblkAction.equals("E")) {
			setMenuItemEnabled("Block.Previous", true);
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_GET_ADVR
	/*
	 * PROCEDURE S$_GET_ADVR(KEY_TERM IN OUT VARCHAR2) IS ADVR_ID VARCHAR2(10);
	 * ADVR_NAME VARCHAR2(100); ADVR_CODE VARCHAR2(30); TERM_CODE_EFF
	 * VARCHAR2(10); PIDM NUMBER(8); BEGIN PIDM :=
	 * TO_NUMBER(NAME_IN('SGBSTDN_PIDM'));
	 * COPY(NAME_IN('SGBSTDN_TERM_CODE_EFF'),TERM_CODE_EFF); -- SELECT
	 * SPRIDEN_ID, SPRIDEN_LAST_NAME||', '||SPRIDEN_FIRST_NAME||' '||
	 * SPRIDEN_MI, SGRADVR_ADVR_CODE INTO ADVR_ID,ADVR_NAME,ADVR_CODE FROM
	 * SPRIDEN, SGRADVR WHERE SGRADVR_PIDM = PIDM AND SGRADVR_TERM_CODE_EFF =
	 * (SELECT MAX(X.SGRADVR_TERM_CODE_EFF) FROM SGRADVR X WHERE X.SGRADVR_PIDM
	 * = PIDM AND X.SGRADVR_TERM_CODE_EFF <= NVL(KEY_TERM, TERM_CODE_EFF)) AND
	 * SPRIDEN_PIDM = SGRADVR_ADVR_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND
	 * SGRADVR_PRIM_IND = 'Y'; -- COPY(ADVR_ID,'SGBSTDN_ADVR_ID');
	 * COPY(ADVR_NAME,'SGBSTDN_ADVR_NAME'); COPY(ADVR_CODE,'SGBSTDN_ADVR_CODE');
	 * -- EXCEPTION WHEN OTHERS THEN NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param keyTerm
	 */
	public void sGetAdvr(Ref<NString> keyTerm) {
		int rowCount = 0;
		NString advrId = NString.getNull();
		NString advrName = NString.getNull();
		NString advrCode = NString.getNull();
		NString termCodeEff = NString.getNull();
		NNumber pidm = NNumber.getNull();
		try {
			pidm = toNumber(getNameIn("SGBSTDN_PIDM"));
			copy(getNameIn("SGBSTDN_TERM_CODE_EFF"), termCodeEff);
			//
			String sql1 = "SELECT SPRIDEN_ID, SPRIDEN_LAST_NAME || ', ' || SPRIDEN_FIRST_NAME || ' ' || SPRIDEN_MI, SGRADVR_ADVR_CODE "
					+ " FROM SPRIDEN, SGRADVR "
					+ " WHERE SGRADVR_PIDM = :P_PIDM AND SGRADVR_TERM_CODE_EFF = (SELECT MAX(X.SGRADVR_TERM_CODE_EFF) "
					+ " FROM SGRADVR X "
					+ " WHERE X.SGRADVR_PIDM = :P_PIDM AND X.SGRADVR_TERM_CODE_EFF <= NVL(:P_KEY_TERM, :P_TERM_CODE_EFF) ) AND SPRIDEN_PIDM = SGRADVR_ADVR_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND SGRADVR_PRIM_IND = 'Y' ";
			DataCommand command1 = new DataCommand(sql1);
			// Setting query parameters
			command1.addParameter("P_PIDM", pidm);
			command1.addParameter("P_KEY_TERM", keyTerm);
			command1.addParameter("P_TERM_CODE_EFF", termCodeEff);
			ResultSet results1 = command1.executeQuery();
			rowCount = command1.getRowCount();
			if (results1.hasData()) {
				advrId = results1.getStr(0);
				advrName = results1.getStr(1);
				advrCode = results1.getStr(2);
			}
			results1.close();
			//
			copy(advrId, "SGBSTDN_ADVR_ID");
			copy(advrName, "SGBSTDN_ADVR_NAME");
			copy(advrCode, "SGBSTDN_ADVR_CODE");
		} catch (Exception e) {
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_DELETE_MATERIALS
	/*
	 * PROCEDURE S$_DELETE_MATERIALS (PIDM IN NUMBER, PLAN_CODE IN VARCHAR2,
	 * TYPE_IND IN VARCHAR2, TERM_CODE IN VARCHAR2, SEQNO IN NUMBER) IS BEGIN IF
	 * TYPE_IND = 'S' THEN BEGIN DELETE FROM GURMAIL WHERE GURMAIL_PIDM = PIDM
	 * AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = TYPE_IND AND
	 * GURMAIL_TERM_CODE = '999999' AND GURMAIL_ADMIN_IDENTIFIER IS NULL AND
	 * GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND
	 * GURMAIL_CPLN_CODE = PLAN_CODE; EXCEPTION WHEN NO_DATA_FOUND THEN NULL;
	 * END; ELSE BEGIN DELETE FROM GURMAIL WHERE GURMAIL_PIDM = PIDM AND
	 * GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = TYPE_IND AND
	 * GURMAIL_TERM_CODE = TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = SEQNO AND
	 * GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND
	 * GURMAIL_CPLN_CODE = PLAN_CODE; EXCEPTION WHEN NO_DATA_FOUND THEN NULL;
	 * END; END IF; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pidm
	 * 
	 * @param planCode
	 * 
	 * @param typeInd
	 * 
	 * @param termCode
	 * 
	 * @param seqno
	 */
	public void sDeleteMaterials(NNumber pidm, NString planCode,
			NString typeInd, NString termCode, NNumber seqno) {
		int rowCount = 0;
		if (typeInd.equals("S")) {
			try {
				String sql1 = "DELETE FROM GURMAIL "
						+ " WHERE GURMAIL_PIDM = :P_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :P_TYPE_IND AND GURMAIL_TERM_CODE = '999999' AND GURMAIL_ADMIN_IDENTIFIER IS NULL AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :P_PLAN_CODE";
				DataCommand command1 = new DataCommand(sql1);
				// Setting query parameters
				command1.addParameter("P_PIDM", pidm);
				command1.addParameter("P_TYPE_IND", typeInd);
				command1.addParameter("P_PLAN_CODE", planCode);
				rowCount = command1.execute();
			} catch (NoDataFoundException e) {
			}
		} else {
			try {
				String sql2 = "DELETE FROM GURMAIL "
						+ " WHERE GURMAIL_PIDM = :P_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :P_TYPE_IND AND GURMAIL_TERM_CODE = :P_TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = :P_SEQNO AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :P_PLAN_CODE";
				DataCommand command2 = new DataCommand(sql2);
				// Setting query parameters
				command2.addParameter("P_PIDM", pidm);
				command2.addParameter("P_TYPE_IND", typeInd);
				command2.addParameter("P_TERM_CODE", termCode);
				command2.addParameter("P_SEQNO", seqno);
				command2.addParameter("P_PLAN_CODE", planCode);
				rowCount = command2.execute();
			} catch (NoDataFoundException e) {
			}
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_CURR_RULE
	/*
	 * procedure S$_CURR_RULE (term in VARCHAR2, campus in VARCHAR2, levl in
	 * VARCHAR2, college in VARCHAR2, degree in VARCHAR2, program in VARCHAR2,
	 * module in VARCHAR2, hold_curr_rule in out number, hold_prim_roll_ind in
	 * out VARCHAR2, hold_secd_roll_ind in out VARCHAR2) is begin declare cursor
	 * curr_c is select * from sobcurr x where x.sobcurr_term_code_init <= term
	 * and x.sobcurr_levl_code = levl and x.sobcurr_coll_code = college and
	 * x.sobcurr_degc_code = degree and exists (select
	 * max(sormcrl_term_code_eff) from sormcrl where sormcrl_curr_rule =
	 * x.sobcurr_curr_rule and sormcrl_term_code_eff <= term and
	 * (decode(sormcrl_stu_ind,'Y','S') = module or
	 * decode(sormcrl_adm_ind,'Y','A') = module or
	 * decode(sormcrl_rec_ind,'Y','R') = module or
	 * decode(sormcrl_his_ind,'Y','H') = module or
	 * decode(sormcrl_dau_ind,'Y','M') = module) or module = 'X'); sobcurr_rec
	 * curr_c%rowtype; begin open curr_c; loop fetch curr_c into sobcurr_rec;
	 * exit when curr_c%notfound; if program is not null and campus is not null
	 * then if sobcurr_rec.sobcurr_program = program and
	 * sobcurr_rec.sobcurr_camp_code = campus then hold_curr_rule :=
	 * sobcurr_rec.sobcurr_curr_rule; hold_prim_roll_ind :=
	 * sobcurr_rec.sobcurr_prim_roll_ind; hold_secd_roll_ind :=
	 * sobcurr_rec.sobcurr_secd_roll_ind; exit; else if
	 * (sobcurr_rec.sobcurr_program = program and sobcurr_rec.sobcurr_camp_code
	 * is null) then hold_curr_rule := sobcurr_rec.sobcurr_curr_rule;
	 * hold_prim_roll_ind := sobcurr_rec.sobcurr_prim_roll_ind;
	 * hold_secd_roll_ind := sobcurr_rec.sobcurr_secd_roll_ind; exit; end if; if
	 * (sobcurr_rec.sobcurr_camp_code = campus and sobcurr_rec.sobcurr_program
	 * is null) then hold_curr_rule := sobcurr_rec.sobcurr_curr_rule;
	 * hold_prim_roll_ind := sobcurr_rec.sobcurr_prim_roll_ind;
	 * hold_secd_roll_ind := sobcurr_rec.sobcurr_secd_roll_ind; exit; end if; if
	 * sobcurr_rec.sobcurr_camp_code is null and sobcurr_rec.sobcurr_program is
	 * null then hold_curr_rule := sobcurr_rec.sobcurr_curr_rule;
	 * hold_prim_roll_ind := sobcurr_rec.sobcurr_prim_roll_ind;
	 * hold_secd_roll_ind := sobcurr_rec.sobcurr_secd_roll_ind; exit; end if;
	 * end if; elsif program is not null and campus is null then if
	 * ((sobcurr_rec.sobcurr_program = program or sobcurr_rec.sobcurr_program is
	 * null) and nvl(sobcurr_rec.sobcurr_camp_code, '%') = nvl(campus, '%'))
	 * then hold_curr_rule := sobcurr_rec.sobcurr_curr_rule; hold_prim_roll_ind
	 * := sobcurr_rec.sobcurr_prim_roll_ind; hold_secd_roll_ind :=
	 * sobcurr_rec.sobcurr_secd_roll_ind; exit; end if; elsif program is null
	 * and campus is not null then if ((sobcurr_rec.sobcurr_camp_code = campus
	 * or sobcurr_rec.sobcurr_camp_code is null) and
	 * nvl(sobcurr_rec.sobcurr_program, '%') = nvl(program, '%')) then
	 * hold_curr_rule := sobcurr_rec.sobcurr_curr_rule; hold_prim_roll_ind :=
	 * sobcurr_rec.sobcurr_prim_roll_ind; hold_secd_roll_ind :=
	 * sobcurr_rec.sobcurr_secd_roll_ind; exit; end if; elsif program is null
	 * and campus is null then if sobcurr_rec.sobcurr_program is null and
	 * sobcurr_rec.sobcurr_camp_code is null then hold_curr_rule :=
	 * sobcurr_rec.sobcurr_curr_rule; hold_prim_roll_ind :=
	 * sobcurr_rec.sobcurr_prim_roll_ind; hold_secd_roll_ind :=
	 * sobcurr_rec.sobcurr_secd_roll_ind; exit; end if; end if; end loop; close
	 * curr_c; end; end;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param term
	 * 
	 * @param campus
	 * 
	 * @param levl
	 * 
	 * @param college
	 * 
	 * @param degree
	 * 
	 * @param program
	 * 
	 * @param module
	 * 
	 * @param holdCurrRule
	 * 
	 * @param holdPrimRollInd
	 * 
	 * @param holdSecdRollInd
	 */
	public void sCurrRule(NString term, NString campus, NString levl,
			NString college, NString degree, NString program, NString module,
			Ref<NNumber> holdCurrRule, Ref<NString> holdPrimRollInd,
			Ref<NString> holdSecdRollInd) {
		int rowCount = 0;
		{
			String sqlcurrC = "SELECT * "
					+ " FROM sobcurr x "
					+ " WHERE x.sobcurr_term_code_init <= :P_TERM AND x.sobcurr_levl_code = :P_LEVL AND x.sobcurr_coll_code = :P_COLLEGE AND x.sobcurr_degc_code = :P_DEGREE AND  EXISTS(SELECT max(sormcrl_term_code_eff) "
					+ " FROM sormcrl "
					+ " WHERE sormcrl_curr_rule = x.sobcurr_curr_rule AND sormcrl_term_code_eff <= :P_TERM AND (decode(sormcrl_stu_ind, 'Y', 'S') = :P_MODULE OR decode(sormcrl_adm_ind, 'Y', 'A') = :P_MODULE OR decode(sormcrl_rec_ind, 'Y', 'R') = :P_MODULE OR decode(sormcrl_his_ind, 'Y', 'H') = :P_MODULE OR decode(sormcrl_dau_ind, 'Y', 'M') = :P_MODULE) OR :P_MODULE = 'X' ) ";
			DataCursor currC = new DataCursor(sqlcurrC);
			TableRow sobcurrRec = null;
			try {
				// Setting query parameters
				currC.addParameter("P_TERM", term);
				currC.addParameter("P_LEVL", levl);
				currC.addParameter("P_COLLEGE", college);
				currC.addParameter("P_DEGREE", degree);
				currC.addParameter("P_MODULE", module);
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable currC.
				currC.open();
				while (true) {
					sobcurrRec = currC.fetchRow();
					if (currC.notFound())
						break;
					if (!program.isNull() && !campus.isNull()) {
						if (sobcurrRec.getStr("sobcurr_program")
								.equals(program)
								&& sobcurrRec.getStr("sobcurr_camp_code")
										.equals(campus)) {
							holdCurrRule.val = sobcurrRec
									.getNumber("sobcurr_curr_rule");
							holdPrimRollInd.val = sobcurrRec
									.getStr("sobcurr_prim_roll_ind");
							holdSecdRollInd.val = sobcurrRec
									.getStr("sobcurr_secd_roll_ind");
							break;
						} else {
							if ((sobcurrRec.getStr("sobcurr_program").equals(
									program) && sobcurrRec.getStr(
									"sobcurr_camp_code").isNull())) {
								holdCurrRule.val = sobcurrRec
										.getNumber("sobcurr_curr_rule");
								holdPrimRollInd.val = sobcurrRec
										.getStr("sobcurr_prim_roll_ind");
								holdSecdRollInd.val = sobcurrRec
										.getStr("sobcurr_secd_roll_ind");
								break;
							}
							if ((sobcurrRec.getStr("sobcurr_camp_code").equals(
									campus) && sobcurrRec.getStr(
									"sobcurr_program").isNull())) {
								holdCurrRule.val = sobcurrRec
										.getNumber("sobcurr_curr_rule");
								holdPrimRollInd.val = sobcurrRec
										.getStr("sobcurr_prim_roll_ind");
								holdSecdRollInd.val = sobcurrRec
										.getStr("sobcurr_secd_roll_ind");
								break;
							}
							if (sobcurrRec.getStr("sobcurr_camp_code").isNull()
									&& sobcurrRec.getStr("sobcurr_program")
											.isNull()) {
								holdCurrRule.val = sobcurrRec
										.getNumber("sobcurr_curr_rule");
								holdPrimRollInd.val = sobcurrRec
										.getStr("sobcurr_prim_roll_ind");
								holdSecdRollInd.val = sobcurrRec
										.getStr("sobcurr_secd_roll_ind");
								break;
							}
						}
					} else if (!program.isNull() && campus.isNull()) {
						if (((sobcurrRec.getStr("sobcurr_program").equals(
								program) || sobcurrRec
								.getStr("sobcurr_program").isNull()) && isNull(
								sobcurrRec.getStr("sobcurr_camp_code"), "%")
								.equals(isNull(campus, "%")))) {
							holdCurrRule.val = sobcurrRec
									.getNumber("sobcurr_curr_rule");
							holdPrimRollInd.val = sobcurrRec
									.getStr("sobcurr_prim_roll_ind");
							holdSecdRollInd.val = sobcurrRec
									.getStr("sobcurr_secd_roll_ind");
							break;
						}
					} else if (program.isNull() && !campus.isNull()) {
						if (((sobcurrRec.getStr("sobcurr_camp_code").equals(
								campus) || sobcurrRec.getStr(
								"sobcurr_camp_code").isNull()) && isNull(
								sobcurrRec.getStr("sobcurr_program"), "%")
								.equals(isNull(program, "%")))) {
							holdCurrRule.val = sobcurrRec
									.getNumber("sobcurr_curr_rule");
							holdPrimRollInd.val = sobcurrRec
									.getStr("sobcurr_prim_roll_ind");
							holdSecdRollInd.val = sobcurrRec
									.getStr("sobcurr_secd_roll_ind");
							break;
						}
					} else if (program.isNull() && campus.isNull()) {
						if (sobcurrRec.getStr("sobcurr_program").isNull()
								&& sobcurrRec.getStr("sobcurr_camp_code")
										.isNull()) {
							holdCurrRule.val = sobcurrRec
									.getNumber("sobcurr_curr_rule");
							holdPrimRollInd.val = sobcurrRec
									.getStr("sobcurr_prim_roll_ind");
							holdSecdRollInd.val = sobcurrRec
									.getStr("sobcurr_secd_roll_ind");
							break;
						}
					}
				}
				currC.close();
			} finally {
				currC.close();
			}
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_COMM_PROCESS
	/*
	 * PROCEDURE S$_COMM_PROCESS (PIDM IN NUMBER, ACTION IN VARCHAR2, TYPE_IND
	 * IN VARCHAR2, TERM_CODE IN VARCHAR2, SEQNO IN NUMBER, CAMP_CODE IN
	 * VARCHAR2, LEVL_CODE IN VARCHAR2, COLL_CODE IN VARCHAR2, DEGC_CODE IN
	 * VARCHAR2, RESULT IN OUT VARCHAR2, OLD_PLAN IN OUT VARCHAR2, NEW_PLAN IN
	 * OUT VARCHAR2, RECRUIT_EXISTS IN OUT VARCHAR2, ADMIT_EXISTS IN OUT
	 * VARCHAR2) IS RECRUIT_PLAN VARCHAR2(4); ADMIT_PLAN VARCHAR2(4);
	 * STUDENT_PLAN VARCHAR2(4); -- CURSOR OLD_COMM_PLAN IS SELECT
	 * SOBCPLN_CPLN_CODE FROM SOBCPLN WHERE SOBCPLN_PIDM = PIDM AND
	 * SOBCPLN_TYPE_IND = TYPE_IND AND SOBCPLN_TERM_CODE = TERM_CODE AND
	 * SOBCPLN_SEQNO = SEQNO AND SOBCPLN_ACTIVE_IND = 'Y' UNION SELECT
	 * SOBCPLN_CPLN_CODE -- student plans have null term/seqno FROM SOBCPLN
	 * WHERE SOBCPLN_PIDM = PIDM AND SOBCPLN_TYPE_IND = TYPE_IND AND
	 * SOBCPLN_TERM_CODE IS NULL AND SOBCPLN_SEQNO IS NULL AND
	 * SOBCPLN_ACTIVE_IND = 'Y'; -- CURSOR FIND_RECRUIT IS SELECT 'Y' FROM
	 * SOBCPLN WHERE SOBCPLN_PIDM = PIDM AND SOBCPLN_TYPE_IND = 'R' AND
	 * SOBCPLN_ACTIVE_IND = 'Y'; -- CURSOR FIND_ADMIT IS SELECT 'Y' FROM SOBCPLN
	 * WHERE SOBCPLN_PIDM = PIDM AND SOBCPLN_TYPE_IND = 'A' AND
	 * SOBCPLN_ACTIVE_IND = 'Y'; -- CURSOR FIND_PLAN IS SELECT
	 * SORCOMM_CPLN_CODE_RECR, SORCOMM_CPLN_CODE_ADMT, SORCOMM_CPLN_CODE_STDN
	 * FROM SORCOMM WHERE (SORCOMM_CAMP_CODE = CAMP_CODE OR SORCOMM_CAMP_CODE IS
	 * NULL) AND (SORCOMM_LEVL_CODE = LEVL_CODE OR SORCOMM_LEVL_CODE IS NULL)
	 * AND (SORCOMM_COLL_CODE = COLL_CODE OR SORCOMM_COLL_CODE IS NULL) AND
	 * (SORCOMM_DEGC_CODE = DEGC_CODE OR SORCOMM_DEGC_CODE IS NULL) ORDER BY
	 * NVL(DECODE(SORCOMM_CAMP_CODE,NULL,'','1')||
	 * DECODE(SORCOMM_LEVL_CODE,NULL,'','1')||
	 * DECODE(SORCOMM_COLL_CODE,NULL,'','1')||
	 * DECODE(SORCOMM_DEGC_CODE,NULL,'','1'),'0') DESC; -- BEGIN --Actions: 1 =
	 * change of comm plan within a specific recr/admt/stdn rec. -- 2 =
	 * inactivate comm plan for inactivated recruit/applicant or -- student. --
	 * 3 = add comm plan for new admit/student rec; inactivate any --
	 * subordinate comm plans (for recruiting or admissions). IF ACTION = '3'
	 * THEN GOTO ACTION_3; END IF; -- find existing comm plan BEGIN OPEN
	 * OLD_COMM_PLAN; FETCH OLD_COMM_PLAN INTO OLD_PLAN; IF
	 * OLD_COMM_PLAN%NOTFOUND THEN IF ACTION = '2' THEN CLOSE OLD_COMM_PLAN;
	 * GOTO EXIT_PROCEDURE; ELSE OLD_PLAN := ''; END IF; END IF; CLOSE
	 * OLD_COMM_PLAN; END; GOTO FIND_NEW_PLAN; -- determine if recruiting &
	 * admissions comm plans exist <<ACTION_3>> OPEN FIND_RECRUIT; FETCH
	 * FIND_RECRUIT INTO RECRUIT_EXISTS; IF FIND_RECRUIT%NOTFOUND THEN
	 * RECRUIT_EXISTS := 'N'; END IF; CLOSE FIND_RECRUIT; -- OPEN FIND_ADMIT;
	 * FETCH FIND_ADMIT INTO ADMIT_EXISTS; IF FIND_ADMIT%NOTFOUND THEN
	 * ADMIT_EXISTS := 'N'; END IF; CLOSE FIND_ADMIT; -- use comm plan rules to
	 * identify new comm plan <<FIND_NEW_PLAN>> BEGIN IF ACTION = '2' THEN GOTO
	 * END_FIND_PLAN; END IF; OPEN FIND_PLAN; FETCH FIND_PLAN INTO RECRUIT_PLAN,
	 * ADMIT_PLAN, STUDENT_PLAN; CLOSE FIND_PLAN; -- IF TYPE_IND = 'R' THEN
	 * NEW_PLAN := RECRUIT_PLAN; ELSIF TYPE_IND = 'A' THEN NEW_PLAN :=
	 * ADMIT_PLAN; ELSE NEW_PLAN := STUDENT_PLAN; END IF; <<END_FIND_PLAN>>
	 * NULL; EXCEPTION WHEN NO_DATA_FOUND THEN NEW_PLAN := ''; END; -- -- If no
	 * action needs to be taken, return to calling program. -- IF ACTION = '3'
	 * THEN GOTO CHECK_3; END IF; IF NEW_PLAN = OLD_PLAN THEN GOTO
	 * EXIT_PROCEDURE; ELSIF OLD_PLAN IS NULL AND NEW_PLAN IS NULL THEN GOTO
	 * EXIT_PROCEDURE; END IF; GOTO ACTION_NEEDED; -- <<CHECK_3>> IF NEW_PLAN IS
	 * NULL AND RECRUIT_EXISTS = 'N' AND ADMIT_EXISTS = 'N' THEN GOTO
	 * EXIT_PROCEDURE; END IF; IF TYPE_IND = 'A' AND NEW_PLAN IS NULL AND
	 * RECRUIT_EXISTS = 'N' THEN GOTO EXIT_PROCEDURE; END IF; <<ACTION_NEEDED>>
	 * RESULT := 'Y'; <<EXIT_PROCEDURE>> NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pidm
	 * 
	 * @param action
	 * 
	 * @param typeInd
	 * 
	 * @param termCode
	 * 
	 * @param seqno
	 * 
	 * @param campCode
	 * 
	 * @param levlCode
	 * 
	 * @param collCode
	 * 
	 * @param degcCode
	 * 
	 * @param result
	 * 
	 * @param oldPlan
	 * 
	 * @param newPlan
	 * 
	 * @param recruitExists
	 * 
	 * @param admitExists
	 */
	public void sCommProcess(NNumber pidm, NString action, NString typeInd,
			NString termCode, NNumber seqno, NString campCode,
			NString levlCode, NString collCode, NString degcCode,
			Ref<NString> result, Ref<NString> oldPlan, Ref<NString> newPlan,
			Ref<NString> recruitExists, Ref<NString> admitExists) {
		int rowCount = 0;
		NString recruitPlan = NString.getNull();
		NString admitPlan = NString.getNull();
		NString studentPlan = NString.getNull();
		String sqloldCommPlan = "SELECT SOBCPLN_CPLN_CODE "
				+ " FROM SOBCPLN "
				+ " WHERE SOBCPLN_PIDM = :P_PIDM AND SOBCPLN_TYPE_IND = :P_TYPE_IND AND SOBCPLN_TERM_CODE = :P_TERM_CODE AND SOBCPLN_SEQNO = :P_SEQNO AND SOBCPLN_ACTIVE_IND = 'Y' "
				+ "UNION SELECT SOBCPLN_CPLN_CODE "
				+ " FROM SOBCPLN "
				+ " WHERE SOBCPLN_PIDM = :P_PIDM AND SOBCPLN_TYPE_IND = :P_TYPE_IND AND SOBCPLN_TERM_CODE IS NULL AND SOBCPLN_SEQNO IS NULL AND SOBCPLN_ACTIVE_IND = 'Y' ";
		DataCursor oldCommPlan = new DataCursor(sqloldCommPlan);
		String sqlfindRecruit = "SELECT 'Y' "
				+ " FROM SOBCPLN "
				+ " WHERE SOBCPLN_PIDM = :P_PIDM AND SOBCPLN_TYPE_IND = 'R' AND SOBCPLN_ACTIVE_IND = 'Y' ";
		DataCursor findRecruit = new DataCursor(sqlfindRecruit);
		String sqlfindAdmit = "SELECT 'Y' "
				+ " FROM SOBCPLN "
				+ " WHERE SOBCPLN_PIDM = :P_PIDM AND SOBCPLN_TYPE_IND = 'A' AND SOBCPLN_ACTIVE_IND = 'Y' ";
		DataCursor findAdmit = new DataCursor(sqlfindAdmit);
		String sqlfindPlan = "SELECT SORCOMM_CPLN_CODE_RECR, SORCOMM_CPLN_CODE_ADMT, SORCOMM_CPLN_CODE_STDN "
				+ " FROM SORCOMM "
				+ " WHERE (SORCOMM_CAMP_CODE = :P_CAMP_CODE OR SORCOMM_CAMP_CODE IS NULL) AND (SORCOMM_LEVL_CODE = :P_LEVL_CODE OR SORCOMM_LEVL_CODE IS NULL) AND (SORCOMM_COLL_CODE = :P_COLL_CODE OR SORCOMM_COLL_CODE IS NULL) AND (SORCOMM_DEGC_CODE = :P_DEGC_CODE OR SORCOMM_DEGC_CODE IS NULL) "
				+ " ORDER BY NVL(DECODE(SORCOMM_CAMP_CODE, NULL, '', '1') || DECODE(SORCOMM_LEVL_CODE, NULL, '', '1') || DECODE(SORCOMM_COLL_CODE, NULL, '', '1') || DECODE(SORCOMM_DEGC_CODE, NULL, '', '1'), '0') DESC";
		DataCursor findPlan = new DataCursor(sqlfindPlan);
		try {
			// Actions: 1 = change of comm plan within a specific recr/admt/stdn
			// rec.
			// 2 = inactivate comm plan for inactivated recruit/applicant or
			// student.
			// 3 = add comm plan for new admit/student rec; inactivate any
			// subordinate comm plans (for recruiting or admissions).
			if (action.equals("3")) {
				// goto ACTION_3;
				// ACTION_3:;
				// Setting query parameters
				findRecruit.addParameter("P_PIDM", pidm);
				// F2J_WARNING : Make sure that the method "Close" is being called over
				// the variable findRecruit.
				findRecruit.open();
				ResultSet findRecruitResults = findRecruit.fetchInto();
				if (findRecruitResults != null) {
					//recruitExists = findRecruitResults.getStr(0);
					recruitExists.val = findRecruitResults.getStr(0);
				}
				if (findRecruit.notFound()) {
					recruitExists.val = toStr("N");
				}
				findRecruit.close();
				//
				// Setting query parameters
				findAdmit.addParameter("P_PIDM", pidm);
				// F2J_WARNING : Make sure that the method "Close" is being called over
				// the variable findAdmit.
				findAdmit.open();
				ResultSet findAdmitResults = findAdmit.fetchInto();
				if (findAdmitResults != null) {
					admitExists.val = findAdmitResults.getStr(0);
				}
				if (findAdmit.notFound()) {
					admitExists.val = toStr("N");
				}
				findAdmit.close();
			}
			try {
				// Setting query parameters
				oldCommPlan.addParameter("P_PIDM", pidm);
				oldCommPlan.addParameter("P_TYPE_IND", typeInd);
				oldCommPlan.addParameter("P_TERM_CODE", termCode);
				oldCommPlan.addParameter("P_SEQNO", seqno);
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable oldCommPlan.
				oldCommPlan.open();
				ResultSet oldCommPlanResults = oldCommPlan.fetchInto();
				if (oldCommPlanResults != null) {
					oldPlan.val = oldCommPlanResults.getStr(0);
				}
				if (oldCommPlan.notFound()) {
					if (action.equals("2")) {
						oldCommPlan.close();
						// goto EXIT_PROCEDURE;
						exitProcedure();
					} else {
						oldPlan.val = toStr("");
					}
				}
				oldCommPlan.close();
			} finally {
				oldCommPlan.close();
			}
			// goto FIND_NEW_PLAN;
			// FIND_NEW_PLAN:;
			try {
				try {
					if (action.equals("2")) {
						endFindPlan();
					}
					// Setting query parameters
					findPlan.addParameter("P_CAMP_CODE", campCode);
					findPlan.addParameter("P_LEVL_CODE", levlCode);
					findPlan.addParameter("P_COLL_CODE", collCode);
					findPlan.addParameter("P_DEGC_CODE", degcCode);
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable findPlan.
					findPlan.open();
					ResultSet findPlanResults = findPlan.fetchInto();
					if (findPlanResults != null) {
						recruitPlan = findPlanResults.getStr(0);
						admitPlan = findPlanResults.getStr(1);
						studentPlan = findPlanResults.getStr(2);
					}
					findPlan.close();
					//
					if (typeInd.equals("R")) {
						newPlan.val = recruitPlan;
					} else if (typeInd.equals("A")) {
						newPlan.val = admitPlan;
					} else {
						newPlan.val = studentPlan;
					}
				} catch (NoDataFoundException e) {
					newPlan.val = toStr("");
				}
			} finally {
				findPlan.close();
			}
			//
			// If no action needs to be taken, return to calling program.
			//
			if (action.equals("3")) {
				// goto CHECK_3;
				// CHECK_3:;
				if (newPlan.val.isNull() && recruitExists.val.equals("N")
						&& admitExists.val.equals("N")) {
					// goto EXIT_PROCEDURE;
					exitProcedure();
				}
				if (typeInd.equals("A") && newPlan.val.isNull()
						&& recruitExists.val.equals("N")) {
					// goto EXIT_PROCEDURE;
					exitProcedure();
				}
			}
			if (newPlan.val.equals(oldPlan.val)) {
				// goto EXIT_PROCEDURE;
				exitProcedure();
			} else if (oldPlan.val.isNull() && newPlan.val.isNull()) {
				// goto EXIT_PROCEDURE;
				exitProcedure();
			}
			// goto ACTION_NEEDED;
			// ACTION_NEEDED:;
			result.val = toStr("Y");
			// EXIT_PROCEDURE:;
		} finally {
			findRecruit.close();
			findAdmit.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_COMM_PLAN
	/*
	 * PROCEDURE S$_COMM_PLAN (PIDM IN NUMBER, KEY_FUNCTION IN VARCHAR2, ACTION
	 * IN VARCHAR2, TYPE_IND IN VARCHAR2, TERM_CODE IN VARCHAR2, SEQNO IN
	 * NUMBER, CAMP_CODE IN VARCHAR2, LEVL_CODE IN VARCHAR2, COLL_CODE IN
	 * VARCHAR2, DEGC_CODE IN VARCHAR2) IS RESULT VARCHAR2(1); OLD_PLAN
	 * VARCHAR2(4); NEW_PLAN VARCHAR2(4); RECRUIT_EXISTS VARCHAR2(1);
	 * ADMIT_EXISTS VARCHAR2(1); -- BEGIN RESULT := 'N';
	 * S$_COMM_PROCESS(PIDM,ACTION
	 * ,TYPE_IND,TERM_CODE,SEQNO,CAMP_CODE,LEVL_CODE,COLL_CODE,DEGC_CODE,
	 * RESULT,OLD_PLAN,NEW_PLAN,RECRUIT_EXISTS, ADMIT_EXISTS); -- -- If no
	 * action needs to be taken, return to calling program. -- IF RESULT = 'N'
	 * THEN GOTO EXIT_PROCEDURE; END IF; -- display comm plan codes and other
	 * fields in pop-up window <<LOAD_FIELDS>>
	 * COPY(OLD_PLAN,'S$_COMM_PLAN_BLOCK.OLD_CPLN_CODE');
	 * COPY(NEW_PLAN,'S$_COMM_PLAN_BLOCK.NEW_CPLN_CODE');
	 * COPY(TO_CHAR(PIDM),'S$_COMM_PLAN_BLOCK.CPLN_PIDM');
	 * COPY(KEY_FUNCTION,'S$_COMM_PLAN_BLOCK.KEY_FUNCTION');
	 * COPY(ACTION,'S$_COMM_PLAN_BLOCK.CPLN_ACTION');
	 * COPY(TYPE_IND,'S$_COMM_PLAN_BLOCK.CPLN_TYPE_IND');
	 * COPY(TERM_CODE,'S$_COMM_PLAN_BLOCK.CPLN_TERM_CODE');
	 * COPY(TO_CHAR(SEQNO),'S$_COMM_PLAN_BLOCK.CPLN_SEQNO'); IF ACTION = '2'
	 * THEN GOTO DISPLAY_WINDOW; ELSIF ACTION = '3' THEN GOTO MESSAGE_3; END IF;
	 * IF NEW_PLAN IS NULL THEN COPY( G$_NLS.Get('SOQRPLS-0048', 'LIB','No plan
	 * found for curriculum') ,':S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC'); END IF;
	 * GOTO DISPLAY_WINDOW; <<MESSAGE_3>> IF TYPE_IND = 'S' THEN GOTO MESSAGE_S;
	 * END IF; IF RECRUIT_EXISTS = 'Y' THEN COPY( G$_NLS.Get('SOQRPLS-0049',
	 * 'LIB','Recruiting comm plan(s) exist')
	 * ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC'); END IF; IF NEW_PLAN IS NULL THEN
	 * COPY( G$_NLS.Get('SOQRPLS-0050', 'LIB','No plan found for curriculum')
	 * ,'S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC'); END IF; GOTO DISPLAY_WINDOW;
	 * <<MESSAGE_S>> IF RECRUIT_EXISTS = 'N' AND ADMIT_EXISTS = 'N' THEN NULL;
	 * ELSIF RECRUIT_EXISTS = 'Y' AND ADMIT_EXISTS = 'N' THEN COPY(
	 * G$_NLS.Get('SOQRPLS-0051', 'LIB','Recruiting comm plan(s) exist')
	 * ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC'); ELSIF RECRUIT_EXISTS = 'N' AND
	 * ADMIT_EXISTS = 'Y' THEN COPY( G$_NLS.Get('SOQRPLS-0052',
	 * 'LIB','Admissions comm plan(s) exist')
	 * ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC'); ELSE COPY(
	 * G$_NLS.Get('SOQRPLS-0053', 'LIB','Recruit/admit comm plans exist ')
	 * ,'S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC'); END IF; IF NEW_PLAN IS NULL THEN
	 * COPY( G$_NLS.Get('SOQRPLS-0054', 'LIB','No plan found for curriculum.')
	 * ,'S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC'); END IF; <<DISPLAY_WINDOW>>
	 * GO_BLOCK('S$_COMM_PLAN_BLOCK'); RAISE FORM_TRIGGER_FAILURE;
	 * <<EXIT_PROCEDURE>> RETURN; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pidm
	 * 
	 * @param keyFunction
	 * 
	 * @param action
	 * 
	 * @param typeInd
	 * 
	 * @param termCode
	 * 
	 * @param seqno
	 * 
	 * @param campCode
	 * 
	 * @param levlCode
	 * 
	 * @param collCode
	 * 
	 * @param degcCode
	 */
	public void sCommPlan(NNumber pidm, NString keyFunction, NString action,
			NString typeInd, NString termCode, NNumber seqno, NString campCode,
			NString levlCode, NString collCode, NString degcCode) {
		NString result = NString.getNull();
		NString oldPlan = NString.getNull();
		NString newPlan = NString.getNull();
		NString recruitExists = NString.getNull();
		NString admitExists = NString.getNull();
		result = toStr("N");
		Ref<NString> result_ref = new Ref<NString>(result);
		Ref<NString> oldPlan_ref = new Ref<NString>(oldPlan);
		Ref<NString> newPlan_ref = new Ref<NString>(newPlan);
		Ref<NString> recruitExists_ref = new Ref<NString>(recruitExists);
		Ref<NString> admitExists_ref = new Ref<NString>(admitExists);
		sCommProcess(pidm, action, typeInd, termCode, seqno, campCode,
				levlCode, collCode, degcCode, result_ref, oldPlan_ref,
				newPlan_ref, recruitExists_ref, admitExists_ref);
		result = result_ref.val;
		oldPlan = oldPlan_ref.val;
		newPlan = newPlan_ref.val;
		recruitExists = recruitExists_ref.val;
		admitExists = admitExists_ref.val;
		// LOAD_FIELDS:;
		copy(oldPlan, "S$_COMM_PLAN_BLOCK.OLD_CPLN_CODE");
		copy(newPlan, "S$_COMM_PLAN_BLOCK.NEW_CPLN_CODE");
		copy(toChar(pidm), "S$_COMM_PLAN_BLOCK.CPLN_PIDM");
		copy(keyFunction, "S$_COMM_PLAN_BLOCK.KEY_FUNCTION");
		copy(action, "S$_COMM_PLAN_BLOCK.CPLN_ACTION");
		copy(typeInd, "S$_COMM_PLAN_BLOCK.CPLN_TYPE_IND");
		copy(termCode, "S$_COMM_PLAN_BLOCK.CPLN_TERM_CODE");
		copy(toChar(seqno), "S$_COMM_PLAN_BLOCK.CPLN_SEQNO");
		if (action.equals("2")) {
			// goto DISPLAY_WINDOW;
			displayWindow();
		} else if (action.equals("3")) {
			// goto MESSAGE_3;
			// MESSAGE_3:;
			if (typeInd.equals("S")) {
				// goto MESSAGE_S;
				// MESSAGE_S:;
				if (recruitExists.equals("N") && admitExists.equals("N")) {
				} else if (recruitExists.equals("Y") && admitExists.equals("N")) {
					copy(GNls.Fget(toStr("SOQRPLS-0051"), toStr("LIB"),
							toStr("Recruiting comm plan(s) exist")),
							"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
				} else if (recruitExists.equals("N") && admitExists.equals("Y")) {
					copy(GNls.Fget(toStr("SOQRPLS-0052"), toStr("LIB"),
							toStr("Admissions comm plan(s) exist")),
							"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
				} else {
					copy(GNls.Fget(toStr("SOQRPLS-0053"), toStr("LIB"),
							toStr("Recruit/admit comm plans exist ")),
							"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
				}
				if (newPlan.isNull()) {
					copy(GNls.Fget(toStr("SOQRPLS-0054"), toStr("LIB"),
							toStr("No plan found for curriculum.")),
							"S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
				}
			}
			if (recruitExists.equals("Y")) {
				copy(GNls.Fget(toStr("SOQRPLS-0049"), toStr("LIB"),
						toStr("Recruiting comm plan(s) exist")),
						"S$_COMM_PLAN_BLOCK.OLD_CPLN_DESC");
			}
			if (newPlan.isNull()) {
				copy(GNls.Fget(toStr("SOQRPLS-0050"), toStr("LIB"),
						toStr("No plan found for curriculum")),
						"S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
			}
			// goto DISPLAY_WINDOW;
			displayWindow();
		}
		if (newPlan.isNull()) {
			copy(GNls.Fget(toStr("SOQRPLS-0048"), toStr("LIB"),
					toStr("No plan found for curriculum")),
					":S$_COMM_PLAN_BLOCK.NEW_CPLN_DESC");
		}
		// goto DISPLAY_WINDOW;
		displayWindow();
		//
		// If no action needs to be taken, return to calling program.
		//
		if (result.equals("N")) {
			// goto EXIT_PROCEDURE;
			exitProcedure();
		}
		// EXIT_PROCEDURE:;
		// return ;
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_COMM_COLLECTOR
	/*
	 * PROCEDURE S$_COMM_COLLECTOR (PIDM IN NUMBER, ACTION IN VARCHAR2, TYPE_IND
	 * IN VARCHAR2, TERM_CODE IN VARCHAR2, SEQNO IN NUMBER, CAMP_CODE IN
	 * VARCHAR2, LEVL_CODE IN VARCHAR2, COLL_CODE IN VARCHAR2, DEGC_CODE IN
	 * VARCHAR2) IS RESULT VARCHAR2(1); OLD_PLAN VARCHAR2(4); NEW_PLAN
	 * VARCHAR2(4); RECRUIT_EXISTS VARCHAR2(1); ADMIT_EXISTS VARCHAR2(1);
	 * PLAN_EXISTS VARCHAR2(1); -- CURSOR FIND_PLAN IS SELECT 'Y' FROM SOBCPLN
	 * WHERE SOBCPLN_PIDM = PIDM AND SOBCPLN_ACTIVE_IND = 'Y'; -- BEGIN RESULT
	 * := 'N'; IF ACTION = '4' THEN OPEN FIND_PLAN; FETCH FIND_PLAN INTO
	 * PLAN_EXISTS; CLOSE FIND_PLAN; IF PLAN_EXISTS = 'Y' THEN RESULT := 'Y';
	 * GOTO CHECK_RESULT; END IF; END IF;
	 * S$_COMM_PROCESS(PIDM,ACTION,TYPE_IND,TERM_CODE,
	 * SEQNO,CAMP_CODE,LEVL_CODE,COLL_CODE,DEGC_CODE,
	 * RESULT,OLD_PLAN,NEW_PLAN,RECRUIT_EXISTS, ADMIT_EXISTS); <<CHECK_RESULT>>
	 * IF RESULT = 'Y' THEN INSERT INTO SORCCOL (SORCCOL_PIDM,
	 * SORCCOL_SOURCE_IND, SORCCOL_ACTION_IND, SORCCOL_TYPE_IND,
	 * SORCCOL_TERM_CODE, SORCCOL_SEQNO, SORCCOL_CAMP_CODE, SORCCOL_LEVL_CODE,
	 * SORCCOL_COLL_CODE, SORCCOL_DEGC_CODE, SORCCOL_ACTIVITY_DATE) VALUES
	 * (PIDM,'R',ACTION,TYPE_IND,TERM_CODE,SEQNO,
	 * CAMP_CODE,LEVL_CODE,COLL_CODE,DEGC_CODE,SYSDATE); END IF;
	 * <<EXIT_PROCEDURE>> NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param pidm
	 * 
	 * @param action
	 * 
	 * @param typeInd
	 * 
	 * @param termCode
	 * 
	 * @param seqno
	 * 
	 * @param campCode
	 * 
	 * @param levlCode
	 * 
	 * @param collCode
	 * 
	 * @param degcCode
	 */
	public void sCommCollector(NNumber pidm, NString action, NString typeInd,
			NString termCode, NNumber seqno, NString campCode,
			NString levlCode, NString collCode, NString degcCode) {
		int rowCount = 0;
		NString result = NString.getNull();
		NString oldPlan = NString.getNull();
		NString newPlan = NString.getNull();
		NString recruitExists = NString.getNull();
		NString admitExists = NString.getNull();
		NString planExists = NString.getNull();
		String sqlfindPlan = "SELECT 'Y' " + " FROM SOBCPLN "
				+ " WHERE SOBCPLN_PIDM = :P_PIDM AND SOBCPLN_ACTIVE_IND = 'Y' ";
		DataCursor findPlan = new DataCursor(sqlfindPlan);
		try {
			result = toStr("N");
			if (action.equals("4")) {
				// Setting query parameters
				findPlan.addParameter("P_PIDM", pidm);
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable findPlan.
				findPlan.open();
				ResultSet findPlanResults = findPlan.fetchInto();
				if (findPlanResults != null) {
					planExists = findPlanResults.getStr(0);
				}
				findPlan.close();
				if (planExists.equals("Y")) {
					result = toStr("Y");
					// goto CHECK_RESULT;
					// CHECK_RESULT:;
					if (result.equals("Y")) {
						String sql1 = "INSERT INTO SORCCOL "
								+ "(SORCCOL_PIDM, SORCCOL_SOURCE_IND, SORCCOL_ACTION_IND, SORCCOL_TYPE_IND, SORCCOL_TERM_CODE, SORCCOL_SEQNO, SORCCOL_CAMP_CODE, SORCCOL_LEVL_CODE, SORCCOL_COLL_CODE, SORCCOL_DEGC_CODE, SORCCOL_ACTIVITY_DATE)"
								+ "VALUES (:P_PIDM, 'R', :P_ACTION, :P_TYPE_IND, :P_TERM_CODE, :P_SEQNO, :P_CAMP_CODE, :P_LEVL_CODE, :P_COLL_CODE, :P_DEGC_CODE, SYSDATE)";
						DataCommand command1 = new DataCommand(sql1);
						// Setting query parameters
						command1.addParameter("P_PIDM", pidm);
						command1.addParameter("P_ACTION", action);
						command1.addParameter("P_TYPE_IND", typeInd);
						command1.addParameter("P_TERM_CODE", termCode);
						command1.addParameter("P_SEQNO", seqno);
						command1.addParameter("P_CAMP_CODE", campCode);
						command1.addParameter("P_LEVL_CODE", levlCode);
						command1.addParameter("P_COLL_CODE", collCode);
						command1.addParameter("P_DEGC_CODE", degcCode);
						rowCount = command1.execute();
					}
				}
			}
			Ref<NString> result_ref = new Ref<NString>(result);
			Ref<NString> oldPlan_ref = new Ref<NString>(oldPlan);
			Ref<NString> newPlan_ref = new Ref<NString>(newPlan);
			Ref<NString> recruitExists_ref = new Ref<NString>(recruitExists);
			Ref<NString> admitExists_ref = new Ref<NString>(admitExists);
			sCommProcess(pidm, action, typeInd, termCode, seqno, campCode,
					levlCode, collCode, degcCode, result_ref, oldPlan_ref,
					newPlan_ref, recruitExists_ref, admitExists_ref);
			result = result_ref.val;
			oldPlan = oldPlan_ref.val;
			newPlan = newPlan_ref.val;
			recruitExists = recruitExists_ref.val;
			admitExists = admitExists_ref.val;
			// CHECK_RESULT:;
			if (result.equals("Y")) {
				String sql1 = "INSERT INTO SORCCOL "
						+ "(SORCCOL_PIDM, SORCCOL_SOURCE_IND, SORCCOL_ACTION_IND, SORCCOL_TYPE_IND, SORCCOL_TERM_CODE, SORCCOL_SEQNO, SORCCOL_CAMP_CODE, SORCCOL_LEVL_CODE, SORCCOL_COLL_CODE, SORCCOL_DEGC_CODE, SORCCOL_ACTIVITY_DATE)"
						+ "VALUES (:P_PIDM, 'R', :P_ACTION, :P_TYPE_IND, :P_TERM_CODE, :P_SEQNO, :P_CAMP_CODE, :P_LEVL_CODE, :P_COLL_CODE, :P_DEGC_CODE, SYSDATE)";
				DataCommand command1 = new DataCommand(sql1);
				// Setting query parameters
				command1.addParameter("P_PIDM", pidm);
				command1.addParameter("P_ACTION", action);
				command1.addParameter("P_TYPE_IND", typeInd);
				command1.addParameter("P_TERM_CODE", termCode);
				command1.addParameter("P_SEQNO", seqno);
				command1.addParameter("P_CAMP_CODE", campCode);
				command1.addParameter("P_LEVL_CODE", levlCode);
				command1.addParameter("P_COLL_CODE", collCode);
				command1.addParameter("P_DEGC_CODE", degcCode);
				rowCount = command1.execute();
			}
			// EXIT_PROCEDURE:;
		} finally {
			findPlan.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.S$_CALL_SHANCRS
	/*
	 * PROCEDURE S$_CALL_SHANCRS IS BEGIN G$_COPY_FLD_ATTR;
	 * DEFAULT_VALUE('14','GLOBAL.SIZE_Y'); DEFAULT_VALUE('1','GLOBAL.MOVE_X');
	 * DEFAULT_VALUE('6','GLOBAL.MOVE_Y'); DEFAULT_VALUE('9','GLOBAL.ANC_Y');
	 * DEFAULT_VALUE('1','GLOBAL.ANC_X'); DEFAULT_VALUE('80','GLOBAL.SIZE_X');
	 * EXECUTE_TRIGGER('SAVE_KEYS'); -- --TK CALL obsoleted with Forms9i -- --
	 * CALL('SHANCRS',NO_HIDE); G$_SECURED_FORM_CALL(USER, 'SHANCRS', '');
	 * COPY('','GLOBAL.VALUE'); G$_RESET_GLOBAL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void sCallShancrs() {
		getGoqrpls().gCopyFldAttr();
		setDefaultValue("14", "GLOBAL.SIZE_Y");
		setDefaultValue("1", "GLOBAL.MOVE_X");
		setDefaultValue("6", "GLOBAL.MOVE_Y");
		setDefaultValue("9", "GLOBAL.ANC_Y");
		setDefaultValue("1", "GLOBAL.ANC_X");
		setDefaultValue("80", "GLOBAL.SIZE_X");
		executeAction("SAVE_KEYS");
		// --TK CALL obsoleted with Forms9i
		// -- CALL('SHANCRS',NO_HIDE);
		getGoqrpls().gSecuredFormCall(getUser(), toStr("SHANCRS"), toStr(""));
		copy("", "GLOBAL.VALUE");
		getGoqrpls().gResetGlobal();
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.P_EDITDETAILCODE
	/*
	 * PROCEDURE P_EditDetailCode (detail_code in varchar2, form_name in
	 * varchar2, dcat_code in varchar2, detail_description in out varchar2,
	 * detail_amount in out number, error_ind in out varchar2) IS uc_formname
	 * varchar2(8); cursor TbbdetcC is select * from tbbdetc where
	 * tbbdetc_detail_code = detail_code; tbbdetc_rec TbbdetcC%rowtype; BEGIN if
	 * detail_code is null then null; else error_ind := '0'; uc_formname :=
	 * upper(form_name); open TbbdetcC; fetch TbbdetcC into tbbdetc_rec; if
	 * TbbdetcC%notfound then error_ind := '1'; else if
	 * tbbdetc_rec.tbbdetc_detc_active_ind = 'N' then error_ind := '2'; elsif
	 * tbbdetc_rec.tbbdetc_dcat_code = 'GRN' then error_ind := '3'; elsif
	 * tbbdetc_rec.tbbdetc_type_ind = 'P' then error_ind := '4'; end if;
	 * detail_description := tbbdetc_rec.tbbdetc_desc; detail_amount :=
	 * tbbdetc_rec.tbbdetc_amount; end if; if error_ind = '0' then if
	 * uc_formname = 'SAAADMS' then if tbbdetc_rec.tbbdetc_dcat_code = 'APF'
	 * then null; else error_ind := '5'; end if; elsif uc_formname = 'SCADETL'
	 * then null; elsif uc_formname = 'SFAAFEE' then null; elsif uc_formname =
	 * 'SFAEFEE' then null; elsif uc_formname = 'SFAFMAX' then null; elsif
	 * uc_formname = 'SFAPRFE' then null; elsif uc_formname = 'SFAREGF' then
	 * null; elsif uc_formname = 'SFAREGS' then null; elsif uc_formname =
	 * 'SFARFND' then if tbbdetc_rec.tbbdetc_dcat_code = 'TUI' or
	 * tbbdetc_rec.tbbdetc_dcat_code = 'FEE' then null; else error_ind := '5';
	 * end if; elsif uc_formname = 'SFARGFE' then null; elsif uc_formname =
	 * 'SHADEGR' then null; elsif uc_formname = 'SHADIPL' then null; elsif
	 * uc_formname = 'SHAMCAT' then null; elsif uc_formname = 'SHAMDEG' then
	 * null; elsif uc_formname = 'SHAMDIP' then null; elsif uc_formname =
	 * 'SHARQTC' then if tbbdetc_rec.tbbdetc_dcat_code = 'TRN' then null; else
	 * error_ind := '5'; end if; elsif uc_formname = 'SLALMFE' then if
	 * tbbdetc_rec.tbbdetc_dcat_code = 'HOU' or tbbdetc_rec.tbbdetc_dcat_code =
	 * 'MEA' or tbbdetc_rec.tbbdetc_dcat_code = 'PHO' then null; else error_ind
	 * := '5'; end if; elsif uc_formname = 'SMARQCM' then null; elsif
	 * uc_formname = 'SSADETL' then null; elsif uc_formname = 'SSADFEE' then
	 * null; elsif uc_formname = 'SSASECT' then null; elsif uc_formname =
	 * 'SOAORUL' then null ; elsif uc_formname = 'SSARULE' then null ; elsif
	 * uc_formname = 'SFARHST' then null ; else error_ind := '6'; end if; end
	 * if; end if; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param detailCode
	 * 
	 * @param formName
	 * 
	 * @param dcatCode
	 * 
	 * @param detailDescription
	 * 
	 * @param detailAmount
	 * 
	 * @param errorInd
	 */
	public void pEditdetailcode(NString detailCode, NString formName,
			NString dcatCode, Ref<NString> detailDescription,
			Ref<NNumber> detailAmount, Ref<NString> errorInd) {
		int rowCount = 0;
		NString ucFormname = NString.getNull();
		String sqltbbdetcc = "SELECT * " + " FROM tbbdetc "
				+ " WHERE tbbdetc_detail_code = :P_DETAIL_CODE ";
		DataCursor tbbdetcc = new DataCursor(sqltbbdetcc);
		TableRow tbbdetcRec = null;
		try {
			if (detailCode.isNull()) {
			} else {
				errorInd.val = toStr("0");
				ucFormname = upper(formName);
				// Setting query parameters
				tbbdetcc.addParameter("P_DETAIL_CODE", detailCode);
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable tbbdetcc.
				tbbdetcc.open();
				tbbdetcRec = tbbdetcc.fetchRow();
				if (tbbdetcc.notFound()) {
					errorInd.val = toStr("1");
				} else {
					if (tbbdetcRec.getStr("tbbdetc_detc_active_ind")
							.equals("N")) {
						errorInd.val = toStr("2");
					} else if (tbbdetcRec.getStr("tbbdetc_dcat_code").equals(
							"GRN")) {
						errorInd.val = toStr("3");
					} else if (tbbdetcRec.getStr("tbbdetc_type_ind")
							.equals("P")) {
						errorInd.val = toStr("4");
					}
					detailDescription.val = tbbdetcRec.getStr("tbbdetc_desc");
					detailAmount.val = tbbdetcRec.getNumber("tbbdetc_amount");
				}
				if (errorInd.val.equals("0")) {
					if (ucFormname.equals("SAAADMS")) {
						if (tbbdetcRec.getStr("tbbdetc_dcat_code")
								.equals("APF")) {
						} else {
							errorInd.val = toStr("5");
						}
					} else if (ucFormname.equals("SCADETL")) {
					} else if (ucFormname.equals("SFAAFEE")) {
					} else if (ucFormname.equals("SFAEFEE")) {
					} else if (ucFormname.equals("SFAFMAX")) {
					} else if (ucFormname.equals("SFAPRFE")) {
					} else if (ucFormname.equals("SFAREGF")) {
					} else if (ucFormname.equals("SFAREGS")) {
					} else if (ucFormname.equals("SFARFND")) {
						if (tbbdetcRec.getStr("tbbdetc_dcat_code")
								.equals("TUI")
								|| tbbdetcRec.getStr("tbbdetc_dcat_code")
										.equals("FEE")) {
						} else {
							errorInd.val = toStr("5");
						}
					} else if (ucFormname.equals("SFARGFE")) {
					} else if (ucFormname.equals("SHADEGR")) {
					} else if (ucFormname.equals("SHADIPL")) {
					} else if (ucFormname.equals("SHAMCAT")) {
					} else if (ucFormname.equals("SHAMDEG")) {
					} else if (ucFormname.equals("SHAMDIP")) {
					} else if (ucFormname.equals("SHARQTC")) {
						if (tbbdetcRec.getStr("tbbdetc_dcat_code")
								.equals("TRN")) {
						} else {
							errorInd.val = toStr("5");
						}
					} else if (ucFormname.equals("SLALMFE")) {
						if (tbbdetcRec.getStr("tbbdetc_dcat_code")
								.equals("HOU")
								|| tbbdetcRec.getStr("tbbdetc_dcat_code")
										.equals("MEA")
								|| tbbdetcRec.getStr("tbbdetc_dcat_code")
										.equals("PHO")) {
						} else {
							errorInd.val = toStr("5");
						}
					} else if (ucFormname.equals("SMARQCM")) {
					} else if (ucFormname.equals("SSADETL")) {
					} else if (ucFormname.equals("SSADFEE")) {
					} else if (ucFormname.equals("SSASECT")) {
					} else if (ucFormname.equals("SOAORUL")) {
					} else if (ucFormname.equals("SSARULE")) {
					} else if (ucFormname.equals("SFARHST")) {
					} else {
						errorInd.val = toStr("6");
					}
				}
			}
		} finally {
			tbbdetcc.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.MINR_ATTACH
	/*
	 * FUNCTION MINR_ATTACH (curr_rule number, term VARCHAR2, module VARCHAR2)
	 * return VARCHAR2 is ind VARCHAR2(1); cursor minr_attach is select distinct
	 * 'Y' from sorcmnr x where sorcmnr_curr_rule = curr_rule and
	 * sorcmnr_term_code_eff = (select max(sorcmnr_term_code_eff) from sorcmnr
	 * where sorcmnr_curr_rule = x.sorcmnr_curr_rule and
	 * (decode(sorcmnr_rec_ind,'Y','R') = module or
	 * decode(sorcmnr_adm_ind,'Y','A') = module or
	 * decode(sorcmnr_stu_ind,'Y','S') = module or
	 * decode(sorcmnr_his_ind,'Y','H') = module or
	 * decode(sorcmnr_dau_ind,'Y','M') = module) and sorcmnr_term_code_eff <=
	 * term); begin open minr_attach; fetch minr_attach into ind; return(ind);
	 * end minr_attach;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param minrAttach
	 * 
	 * @param minrAttach
	 * 
	 * @param minrAttach
	 */
	public NString minrAttach(NNumber currRule, NString term, NString module) {
		int rowCount = 0;
		NString ind = NString.getNull();
		String sqlminrAttach = "SELECT DISTINCT 'Y' "
				+ " FROM sorcmnr x "
				+ " WHERE sorcmnr_curr_rule = :P_CURR_RULE AND sorcmnr_term_code_eff = (SELECT max(sorcmnr_term_code_eff) "
				+ " FROM sorcmnr "
				+ " WHERE sorcmnr_curr_rule = x.sorcmnr_curr_rule AND (decode(sorcmnr_rec_ind, 'Y', 'R') = :P_MODULE OR decode(sorcmnr_adm_ind, 'Y', 'A') = :P_MODULE OR decode(sorcmnr_stu_ind, 'Y', 'S') = :P_MODULE OR decode(sorcmnr_his_ind, 'Y', 'H') = :P_MODULE OR decode(sorcmnr_dau_ind, 'Y', 'M') = :P_MODULE) AND sorcmnr_term_code_eff <= :P_TERM ) ";
		DataCursor minrAttach = new DataCursor(sqlminrAttach);
		try {
			// Setting query parameters
			minrAttach.addParameter("P_CURR_RULE", currRule);
			minrAttach.addParameter("P_MODULE", module);
			minrAttach.addParameter("P_TERM", term);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable minrAttach.
			minrAttach.open();
			ResultSet minrAttachResults = minrAttach.fetchInto();
			if (minrAttachResults != null) {
				ind = minrAttachResults.getStr(0);
			}
			return ((ind));
		} finally {
			minrAttach.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.MAJR_ATTACH
	/*
	 * FUNCTION MAJR_ATTACH (curr_rule number, term VARCHAR2, module VARCHAR2)
	 * return VARCHAR2 is ind VARCHAR2(1); cursor majr_attach is select distinct
	 * 'Y' from sorcmjr x where sorcmjr_curr_rule = curr_rule and
	 * sorcmjr_term_code_eff = (select max(sorcmjr_term_code_eff) from sorcmjr
	 * where sorcmjr_curr_rule = x.sorcmjr_curr_rule and
	 * (decode(sorcmjr_rec_ind,'Y','R') = module or
	 * decode(sorcmjr_adm_ind,'Y','A') = module or
	 * decode(sorcmjr_stu_ind,'Y','S') = module or
	 * decode(sorcmjr_his_ind,'Y','H') = module or
	 * decode(sorcmjr_dau_ind,'Y','M') = module) and sorcmjr_term_code_eff <=
	 * term); begin open majr_attach; fetch majr_attach into ind; return(ind);
	 * end majr_attach;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param majrAttach
	 * 
	 * @param majrAttach
	 * 
	 * @param majrAttach
	 */
	public NString majrAttach(NNumber currRule, NString term, NString module) {
		int rowCount = 0;
		NString ind = NString.getNull();
		String sqlmajrAttach = "SELECT DISTINCT 'Y' "
				+ " FROM sorcmjr x "
				+ " WHERE sorcmjr_curr_rule = :P_CURR_RULE AND sorcmjr_term_code_eff = (SELECT max(sorcmjr_term_code_eff) "
				+ " FROM sorcmjr "
				+ " WHERE sorcmjr_curr_rule = x.sorcmjr_curr_rule AND (decode(sorcmjr_rec_ind, 'Y', 'R') = :P_MODULE OR decode(sorcmjr_adm_ind, 'Y', 'A') = :P_MODULE OR decode(sorcmjr_stu_ind, 'Y', 'S') = :P_MODULE OR decode(sorcmjr_his_ind, 'Y', 'H') = :P_MODULE OR decode(sorcmjr_dau_ind, 'Y', 'M') = :P_MODULE) AND sorcmjr_term_code_eff <= :P_TERM ) ";
		DataCursor majrAttach = new DataCursor(sqlmajrAttach);
		try {
			// Setting query parameters
			majrAttach.addParameter("P_CURR_RULE", currRule);
			majrAttach.addParameter("P_MODULE", module);
			majrAttach.addParameter("P_TERM", term);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable majrAttach.
			majrAttach.open();
			ResultSet majrAttachResults = majrAttach.fetchInto();
			if (majrAttachResults != null) {
				ind = majrAttachResults.getStr(0);
			}
			return ((ind));
		} finally {
			majrAttach.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.F_MULTILINEOPTION
	/*
	 * FUNCTION F_MultiLineOption (line1 varchar2, line2 varchar2, line3
	 * varchar2) RETURN varchar2 IS opt_line varchar2(200); opt_return
	 * varchar2(30); hold_line1 varchar2(18); hold_line2 varchar2(18);
	 * hold_line3 varchar2(18); BEGIN hold_line1 := substr(line1,1,18);
	 * hold_line2 := substr(line2,1,18); hold_line3 := substr(line3,1,18);
	 * opt_line := hold_line1; if line2 is null then null; else opt_line :=
	 * opt_line||chr(10)||hold_line2; end if; if line3 is null then null; else
	 * opt_line := opt_line||chr(10)||hold_line3; end if; opt_return :=
	 * substr(opt_line,1,30); return opt_return; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param line1
	 * 
	 * @param line2
	 * 
	 * @param line3
	 */
	public NString fMultilineoption(NString line1, NString line2, NString line3) {
		NString optLine = NString.getNull();
		NString optReturn = NString.getNull();
		NString holdLine1 = NString.getNull();
		NString holdLine2 = NString.getNull();
		NString holdLine3 = NString.getNull();
		holdLine1 = substring(line1, toInt(1), toInt(18));
		holdLine2 = substring(line2, toInt(1), toInt(18));
		holdLine3 = substring(line3, toInt(1), toInt(18));
		optLine = holdLine1;
		if (line2.isNull()) {
		} else {
			optLine = optLine.append(chr(10)).append(holdLine2);
		}
		if (line3.isNull()) {
		} else {
			optLine = optLine.append(chr(10)).append(holdLine3);
		}
		optReturn = substring(optLine, toInt(1), toInt(30));
		return optReturn;
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.F_ERRORMESSAGE
	/*
	 * FUNCTION F_ErrorMessage (detail_code varchar2, form_name varchar2,
	 * dcat_code varchar2, error_ind varchar2) RETURN varchar2 IS error_msg
	 * varchar2(70); begin error_msg := ''; if error_ind = '1' then error_msg :=
	 * G$_NLS.Get('SOQRPLS-0000', 'LIB','*ERROR* Invalid Detail Code, press LIST
	 * for valid codes') ; elsif error_ind = '2' then error_msg :=
	 * G$_NLS.Get('SOQRPLS-0001', 'LIB','*ERROR* Detail Code is Inactive') ;
	 * elsif error_ind = '3' then error_msg := G$_NLS.Get('SOQRPLS-0002',
	 * 'LIB','*ERROR* Detail Code reserved for Grant/Billing functions') ; elsif
	 * error_ind = '4' then error_msg := G$_NLS.Get('SOQRPLS-0003',
	 * 'LIB','*ERROR* Detail Code must be a Charge Type') ; elsif error_ind =
	 * '5' then if form_name = 'SAAADMS' then error_msg :=
	 * G$_NLS.Get('SOQRPLS-0005', 'LIB','*ERROR* Detail Code must be have APF
	 * category') ; elsif form_name = 'SFAPRFE' then null; end if; elsif
	 * error_ind = '6' then error_msg := G$_NLS.Get('SOQRPLS-0007',
	 * 'LIB','*ERROR* Unknown Edit Context') ; elsif error_ind = '7' then
	 * error_msg := G$_NLS.Get('SOQRPLS-0008', 'LIB','*ERROR* You are not
	 * authorized to enter this Category of Detail Code') ; end if; return
	 * error_msg; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param detailCode
	 * 
	 * @param formName
	 * 
	 * @param dcatCode
	 * 
	 * @param errorInd
	 */
	public NString fErrormessage(NString detailCode, NString formName,
			NString dcatCode, NString errorInd) {
		NString errorMsg = NString.getNull();
		errorMsg = toStr("");
		if (errorInd.equals("1")) {
			errorMsg = GNls
					.Fget(toStr("SOQRPLS-0000"),
							toStr("LIB"),
							toStr("*ERROR* Invalid Detail Code, press LIST for valid codes"));
		} else if (errorInd.equals("2")) {
			errorMsg = GNls.Fget(toStr("SOQRPLS-0001"), toStr("LIB"),
					toStr("*ERROR* Detail Code is Inactive"));
		} else if (errorInd.equals("3")) {
			errorMsg = GNls
					.Fget(toStr("SOQRPLS-0002"),
							toStr("LIB"),
							toStr("*ERROR* Detail Code reserved for Grant/Billing functions"));
		} else if (errorInd.equals("4")) {
			errorMsg = GNls.Fget(toStr("SOQRPLS-0003"), toStr("LIB"),
					toStr("*ERROR* Detail Code must be a Charge Type"));
		} else if (errorInd.equals("5")) {
			if (formName.equals("SAAADMS")) {
				errorMsg = GNls.Fget(toStr("SOQRPLS-0005"), toStr("LIB"),
						toStr("*ERROR* Detail Code must be have APF category"));
			} else if (formName.equals("SFAPRFE")) {
			}
		} else if (errorInd.equals("6")) {
			errorMsg = GNls.Fget(toStr("SOQRPLS-0007"), toStr("LIB"),
					toStr("*ERROR* Unknown Edit Context"));
		} else if (errorInd.equals("7")) {
			errorMsg = GNls
					.Fget(toStr("SOQRPLS-0008"),
							toStr("LIB"),
							toStr("*ERROR* You are not authorized to enter this Category of Detail Code"));
		}
		return errorMsg;
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.F_CHECKUSERPROFILE
	/*
	 * FUNCTION F_CheckUserProfile (detail_code varchar2) RETURN varchar2 IS
	 * error_ind varchar2(1); cursor TbbdetcC is select * from tbbdetc where
	 * tbbdetc_detail_code = detail_code; tbbdetc_rec TbbdetcC%rowtype;
	 * 
	 * cursor TbbctrlC is select * from tbbctrl; tbbctrl_rec TbbctrlC%rowtype;
	 * 
	 * cursor TbbuprfC is select * from tbbuprf where tbbuprf_userid = user and
	 * tbbuprf_restrict_ind = 'Y'; tbbuprf_rec TbbuprfC%rowtype;
	 * 
	 * cursor TbruprfC is select * from tbruprf where tbruprf_userid = user and
	 * tbruprf_dcat_code = tbbdetc_rec.tbbdetc_dcat_code; tbruprf_rec
	 * TbruprfC%rowtype; BEGIN error_ind := '0'; if detail_code is not null then
	 * open TbbctrlC; fetch TbbctrlC into tbbctrl_rec; open TbbdetcC; fetch
	 * TbbdetcC into tbbdetc_rec; --- is user profile restriction turned on for
	 * AR ? if tbbctrl_rec.tbbctrl_restrict_ind = 'Y' then open TbbuprfC; fetch
	 * TbbuprfC into tbbuprf_rec; --- is the person restricted? if
	 * tbbuprf_rec.tbbuprf_restrict_ind = 'Y' then open TbruprfC; fetch TbruprfC
	 * into tbruprf_rec; --- does the person have the detail code category in
	 * their --- restr access list? if TbruprfC%notfound then error_ind := '7';
	 * return error_ind; end if; end if; end if; close TbbdetcC; close TbbctrlC;
	 * end if; return error_ind; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param detailCode
	 */
	public NString fCheckuserprofile(NString detailCode) {
		int rowCount = 0;
		NString errorInd = NString.getNull();
		String sqltbbdetcc = "SELECT * " + " FROM tbbdetc "
				+ " WHERE tbbdetc_detail_code = :P_DETAIL_CODE ";
		DataCursor tbbdetcc = new DataCursor(sqltbbdetcc);
		TableRow tbbdetcRec = null;
		String sqltbbctrlc = "SELECT * " + " FROM tbbctrl ";
		DataCursor tbbctrlc = new DataCursor(sqltbbctrlc);
		TableRow tbbctrlRec = null;
		String sqltbbuprfc = "SELECT * "
				+ " FROM tbbuprf "
				+ " WHERE tbbuprf_userid = user AND tbbuprf_restrict_ind = 'Y' ";
		DataCursor tbbuprfc = new DataCursor(sqltbbuprfc);
		TableRow tbbuprfRec = null;
		String sqltbruprfc = "SELECT * "
				+ " FROM tbruprf "
				+ " WHERE tbruprf_userid = user AND tbruprf_dcat_code = :P_TBBDETC_REC_TBBDETC_DCAT_CODE ";
		DataCursor tbruprfc = new DataCursor(sqltbruprfc);
		TableRow tbruprfRec = null;
		try {
			errorInd = toStr("0");
			if (!detailCode.isNull()) {
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable tbbctrlc.
				tbbctrlc.open();
				tbbctrlRec = tbbctrlc.fetchRow();
				// Setting query parameters
				tbbdetcc.addParameter("P_DETAIL_CODE", detailCode);
				// F2J_WARNING : Make sure that the method "Close" is being
				// called over the variable tbbdetcc.
				tbbdetcc.open();
				tbbdetcRec = tbbdetcc.fetchRow();
				// - is user profile restriction turned on for AR ?
				if (tbbctrlRec.getStr("tbbctrl_restrict_ind").equals("Y")) {
					// F2J_WARNING : Make sure that the method "Close" is being
					// called over the variable tbbuprfc.
					tbbuprfc.open();
					tbbuprfRec = tbbuprfc.fetchRow();
					// - is the person restricted?
					if (tbbuprfRec.getStr("tbbuprf_restrict_ind").equals("Y")) {
						// Setting query parameters
						tbruprfc.addParameter(
								"P_TBBDETC_REC_TBBDETC_DCAT_CODE",
								tbbdetcRec.getStr("tbbdetc_dcat_code"));
						// F2J_WARNING : Make sure that the method "Close" is
						// being called over the variable tbruprfc.
						tbruprfc.open();
						tbruprfRec = tbruprfc.fetchRow();
						// - does the person have the detail code category in
						// their
						// - restr access list?
						if (tbruprfc.notFound()) {
							errorInd = toStr("7");
							return errorInd;
						}
					}
				}
				tbbdetcc.close();
				tbbctrlc.close();
			}
			return errorInd;
		} finally {
			tbbctrlc.close();
			tbbdetcc.close();
			tbbuprfc.close();
			tbruprfc.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.CONC_BASE_ATTACH
	/*
	 * FUNCTION CONC_BASE_ATTACH (curr_rule number, term VARCHAR2, module
	 * VARCHAR2) return VARCHAR2 is ind VARCHAR2(1); cursor c1 is select
	 * decode(x.sorccon_rec_ind, 'Y', 'R', 'N') rec, decode(x.sorccon_adm_ind,
	 * 'Y', 'A', 'N') adm, decode(x.sorccon_stu_ind, 'Y', 'S', 'N') stu,
	 * decode(x.sorccon_his_ind, 'Y', 'H', 'N') his, decode(x.sorccon_dau_ind,
	 * 'Y', 'M', 'N') dau from sorccon x where x.sorccon_curr_rule = curr_rule
	 * and x.sorccon_cmjr_rule is null and x.sorccon_term_code_eff = (select
	 * max(y.sorccon_term_code_eff) from sorccon y where y.sorccon_curr_rule =
	 * x.sorccon_curr_rule and y.sorccon_term_code_eff <= term); sorccon_rec
	 * c1%rowtype; end_check VARCHAR2(1); begin open c1; end_check := 'N'; loop
	 * exit when c1%notfound or end_check = 'Y'; fetch c1 into sorccon_rec; if
	 * sorccon_rec.rec = module or sorccon_rec.adm = module or sorccon_rec.stu =
	 * module or sorccon_rec.his = module or sorccon_rec.dau = module then
	 * end_check := 'Y'; end if; end loop; close c1; ind := end_check;
	 * return(ind); end conc_base_attach;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param term
	 * 
	 * @param module
	 */
	public NString concBaseAttach(NNumber currRule, NString term, NString module) {
		int rowCount = 0;
		NString ind = NString.getNull();
		String sqlc1 = "SELECT decode(x.sorccon_rec_ind, 'Y', 'R', 'N') rec, decode(x.sorccon_adm_ind, 'Y', 'A', 'N') adm, decode(x.sorccon_stu_ind, 'Y', 'S', 'N') stu, decode(x.sorccon_his_ind, 'Y', 'H', 'N') his, decode(x.sorccon_dau_ind, 'Y', 'M', 'N') dau "
				+ " FROM sorccon x "
				+ " WHERE x.sorccon_curr_rule = :P_CURR_RULE AND x.sorccon_cmjr_rule IS NULL AND x.sorccon_term_code_eff = (SELECT max(y.sorccon_term_code_eff) "
				+ " FROM sorccon y "
				+ " WHERE y.sorccon_curr_rule = x.sorccon_curr_rule AND y.sorccon_term_code_eff <= :P_TERM ) ";
		DataCursor c1 = new DataCursor(sqlc1);
		TableRow sorcconRec = null;
		NString endCheck = NString.getNull();
		try {
			// Setting query parameters
			c1.addParameter("P_CURR_RULE", currRule);
			c1.addParameter("P_TERM", term);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable c1.
			c1.open();
			endCheck = toStr("N");
			while (true) {
				if (c1.notFound() || endCheck.equals("Y"))
					break;
				sorcconRec = c1.fetchRow();
				if (sorcconRec.getStr("rec").equals(module)
						|| sorcconRec.getStr("adm").equals(module)
						|| sorcconRec.getStr("stu").equals(module)
						|| sorcconRec.getStr("his").equals(module)
						|| sorcconRec.getStr("dau").equals(module)) {
					endCheck = toStr("Y");
				}
			}
			c1.close();
			ind = endCheck;
			return ((ind));
		} finally {
			c1.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.CONC_ATTACH
	/*
	 * FUNCTION CONC_ATTACH (curr_rule number, cmjr_rule number, term VARCHAR2,
	 * module VARCHAR2) return VARCHAR2 is ind VARCHAR2(1); cursor conc_attach
	 * is select distinct 'Y' from sorccon x where sorccon_curr_rule = curr_rule
	 * and (sorccon_cmjr_rule = nvl(cmjr_rule,0) or sorccon_cmjr_rule is null)
	 * and sorccon_term_code_eff = (select max(sorccon_term_code_eff) from
	 * sorccon where sorccon_curr_rule = x.sorccon_curr_rule and
	 * (sorccon_cmjr_rule = x.sorccon_cmjr_rule or sorccon_cmjr_rule is null)
	 * and (decode(sorccon_rec_ind,'Y','R') = module or
	 * decode(sorccon_adm_ind,'Y','A') = module or
	 * decode(sorccon_stu_ind,'Y','S') = module or
	 * decode(sorccon_his_ind,'Y','H') = module or
	 * decode(sorccon_dau_ind,'Y','M') = module) and sorccon_term_code_eff <=
	 * term); begin open conc_attach; fetch conc_attach into ind; return(ind);
	 * end conc_attach;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param concAttach
	 * 
	 * @param concAttach
	 * 
	 * @param concAttach
	 * 
	 * @param concAttach
	 */
	public NString concAttach(NNumber currRule, NNumber cmjrRule, NString term,
			NString module) {
		int rowCount = 0;
		NString ind = NString.getNull();
		String sqlconcAttach = "SELECT DISTINCT 'Y' "
				+ " FROM sorccon x "
				+ " WHERE sorccon_curr_rule = :P_CURR_RULE AND (sorccon_cmjr_rule = nvl(:P_CMJR_RULE, 0) OR sorccon_cmjr_rule IS NULL) AND sorccon_term_code_eff = (SELECT max(sorccon_term_code_eff) "
				+ " FROM sorccon "
				+ " WHERE sorccon_curr_rule = x.sorccon_curr_rule AND (sorccon_cmjr_rule = x.sorccon_cmjr_rule OR sorccon_cmjr_rule IS NULL) AND (decode(sorccon_rec_ind, 'Y', 'R') = :P_MODULE OR decode(sorccon_adm_ind, 'Y', 'A') = :P_MODULE OR decode(sorccon_stu_ind, 'Y', 'S') = :P_MODULE OR decode(sorccon_his_ind, 'Y', 'H') = :P_MODULE OR decode(sorccon_dau_ind, 'Y', 'M') = :P_MODULE) AND sorccon_term_code_eff <= :P_TERM ) ";
		DataCursor concAttach = new DataCursor(sqlconcAttach);
		try {
			// Setting query parameters
			concAttach.addParameter("P_CURR_RULE", currRule);
			concAttach.addParameter("P_CMJR_RULE", cmjrRule);
			concAttach.addParameter("P_MODULE", module);
			concAttach.addParameter("P_TERM", term);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable concAttach.
			concAttach.open();
			ResultSet concAttachResults = concAttach.fetchInto();
			if (concAttachResults != null) {
				ind = concAttachResults.getStr(0);
			}
			return ((ind));
		} finally {
			concAttach.close();
		}
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
	 * PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS -- AUDIT TRAIL:
	 * NLS_DATE_SUPPORT -- 1. TGKinderman 11/11/2005 -- This object was passed
	 * through a conversion process relative to preparing -- the object to
	 * support internationalization needs. Basically, hard coded -- date format
	 * masks of DD-MON-YYYY are converted to a G$_DATE function that -- returns
	 * nls_date_format. The release number of this object was NOT -- modified as
	 * part of this effort. This object may or may not have had -- conversion
	 * process code modifications. However, this audit trail entry -- does
	 * indicate that the object has been passed through the conversion. -- AUDIT
	 * TRAIL END -- BEGIN NULL; END AUDIT_TRAIL_NLS_DATE_SUPPORT;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrailNlsDateSupport() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_8_0_SOQRPLS
	/*
	 * PROCEDURE AUDIT_TRAIL_8_0_SOQRPLS IS BEGIN NULL; <multilinecomment> AUDIT
	 * TRAIL: 8.0 1. Remove obsolete procedures MAHockett 10/15/07 s$_calc_tmst,
	 * s$_class_calc AUDIT TRAIL END </multilinecomment> END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail80Soqrpls() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_7_0_SOQRPLS
	/*
	 * PROCEDURE AUDIT_TRAIL_7_0_SOQRPLS IS <multilinecomment> AUDIT TRAIL: 7.0
	 * 1. TGKinderman 11/20/2003 Converted to Forms9i 2. TGKinderman 11/20/2003
	 * Replaced obsolete CALL statement in S$_CALL_SHANCRS with
	 * G$_SECURED_FORM_CALL. CALL obsoleted with Forms9i. 3. TGKinderman
	 * 12/11/2003 Per Banner7.0 UI requirements, modified S$_VALID_ALL_ID and
	 * S$_VALID_ID to return Confidential instead ofCONFIDENTIAL* and Deceased
	 * instead of *DECEASED*. 4. TGKinderman 06/03/2004 (LNguyen) Added a
	 * default parameter to S$_VALID_ALL_ID and S$_VALID_ID. Modified these
	 * routines to call the G$_VALID_ALL_ID and G$_VALID_ID respectively. AUDIT
	 * TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail70Soqrpls() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_6_0
	/*
	 * PROCEDURE AUDIT_TRAIL_6_0 IS <multilinecomment> AUDIT TRAIL: 6.0 1.
	 * Altered P_EDITDETAILCODE added new forms PL 02/10/03 SFARHST, SSARULE,
	 * SOAORUL as allowable forms to process tbbdetc_detail_code. 2. Changed
	 * S$_CLASS_CALC for expanded credit hour PL 02/10/03 gpa project. AUDIT
	 * TRAIL END </multilinecomment> BEGIN NULL ; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail60() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_5_5_B2K
	/*
	 * PROCEDURE AUDIT_TRAIL_5_5_B2K IS <multilinecomment> AUDIT TRAIL: 5.5 1.
	 * MW 06/06/2002 Upgrade insert statement in S$_COMM_COLLECTOR procedure
	 * with explicit column definitions.
	 * 
	 * AUDIT TRAIL END </multilinecomment> BEGIN NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail55B2k() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_5_0_SOQRPLS
	/*
	 * PROCEDURE AUDIT_TRAIL_5_0_SOQRPLS IS <multilinecomment> AUDIT TRAIL: 5.0
	 * 1. TGKinderman 06/14/2000 Dev6.0 Upgrade. AUDIT TRAIL END
	 * </multilinecomment> BEGIN NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail50Soqrpls() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_4_3
	/*
	 * PROCEDURE AUDIT_TRAIL_4_3 IS BEGIN NULL; <multilinecomment> AUDIT TRAIL:
	 * 4.3 1. Defect #33075 CLF 02/22/00 Problem: Confidentiality indicator may
	 * be update with NULL or 'N' to indicate not confidential Fix: Modify
	 * S$_VALID_ID and S$_VALID_ALL_ID to check for confidentiality by
	 * CONFID_IND = 'Y' instead of a NOT NULL condition 2. Defect 33361 MAH
	 * 3/9/00 Problem: F_CheckUserProfile was returning an error for restricted
	 * users even if no detail code was entered on the form. Solution: Add check
	 * at top of F_CheckUserProfile to return a 0 if the detail code is blank.
	 * 3. Change the cursor c1 to curr_c in s$_curr_rule. MAH 6/9/00 AUDIT TRAIL
	 * END </multilinecomment> END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail43() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_4_0_B2K
	/*
	 * PROCEDURE AUDIT_TRAIL_4_0_B2K IS BEGIN NULL; <multilinecomment> AUDIT
	 * TRAIL: 4.0 1. Added F_MultiLineOption function to create multiple line
	 * Navigation Option Descriptions. TJH 01/13/99 2. Added S$_MenuSet
	 * procedure facilitate enabling/disabling of Menu Options. TJH 02/11/99
	 * AUDIT TRAIL END </multilinecomment> END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail40B2k() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_3_0
	/*
	 * PROCEDURE AUDIT_TRAIL_3_0 IS BEGIN NULL; <multilinecomment> AUDIT TRAIL:
	 * 3.0 1. Generated PLX file for 3.0 VB 09/04/97 </multilinecomment> END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail30() {
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.AUDIT_TRAIL_2_1
	/*
	 * PROCEDURE AUDIT_TRAIL_2_1 IS BEGIN <multilinecomment> AUDIT TRAIL: 2.1.15
	 * 1. Add new function all_conc_attach to select if concentrations are
	 * attached to the base or major. NM 10/15/96 2. Re-wrote s$_curr_rule to
	 * cover all possible scenerios of base curriculum. NM 10/31/96 3. Updated
	 * select_cmjr_rule in two places: A.) and (nvl(x.sorcmjr_dept_code,'%') =
	 * nvl(dept,'%') or (x.sorcmjr_dept_code is null and dept is not null)) B.)
	 * and (nvl(x.sorcmjr_majr_code,'%') = nvl(major,'%') or
	 * (x.sorcmjr_majr_code is null and major is not null)); AUDIT TRAIL END
	 * </multilinecomment> NULL; END;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified
	 * as containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 */
	public void auditTrail21() {
		// AUDIT TRAIL: 2.1.15
		// 1. Add new function all_conc_attach to select if concentrations are
		// attached to the base or major. NM 10/15/96
		// 2. Re-wrote s$_curr_rule to cover all possible scenerios of base
		// curriculum.
		// NM 10/31/96
		// 3. Updated select_cmjr_rule in two places:
		// A.) and (nvl(x.sorcmjr_dept_code,'%') = nvl(dept,'%')
		// or (x.sorcmjr_dept_code is null and dept is not null))
		// B.) and (nvl(x.sorcmjr_majr_code,'%') = nvl(major,'%')
		// or (x.sorcmjr_majr_code is null and major is not null));
		// AUDIT TRAIL END
	}

	// Original PL/SQL code for Prog Unit SOQRPLS.ALL_CONC_ATTACH
	/*
	 * FUNCTION ALL_CONC_ATTACH (CURR_RULE IN NUMBER, TERM IN VARCHAR2, MODULE
	 * IN VARCHAR2) RETURN VARCHAR2 IS RET_IND VARCHAR2(1); CHK_IND VARCHAR2(1);
	 * CURSOR CHK_CONC IS SELECT DISTINCT 'Y' FROM SORCCON X WHERE
	 * SORCCON_CURR_RULE = CURR_RULE AND SORCCON_TERM_CODE_EFF = (SELECT
	 * MAX(SORCCON_TERM_CODE_EFF) FROM SORCCON WHERE SORCCON_CURR_RULE =
	 * X.SORCCON_CURR_RULE AND (SORCCON_CMJR_RULE = X.SORCCON_CMJR_RULE OR
	 * SORCCON_CMJR_RULE IS NULL) AND (DECODE(SORCCON_REC_IND,'Y','R') = MODULE
	 * OR DECODE(SORCCON_REC_IND,'Y','A') = MODULE OR
	 * DECODE(SORCCON_REC_IND,'Y','S') = MODULE OR
	 * DECODE(SORCCON_REC_IND,'Y','H') = MODULE OR
	 * DECODE(SORCCON_REC_IND,'Y','M') = MODULE) AND SORCCON_TERM_CODE_EFF <=
	 * TERM); BEGIN OPEN CHK_CONC; FETCH CHK_CONC INTO CHK_IND; IF
	 * CHK_CONC%FOUND THEN RET_IND := 'Y'; ELSE RET_IND := 'N'; END IF; CLOSE
	 * CHK_CONC; RETURN RET_IND; END ALL_CONC_ATTACH;
	 */
	/*
	 * <p> F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as
	 * containing business logic. See documentation for details
	 * ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html. /*
	 * </p>
	 * 
	 * @param currRule
	 * 
	 * @param term
	 * 
	 * @param module
	 */
	public NString allConcAttach(NNumber currRule, NString term, NString module) {
		int rowCount = 0;
		NString retInd = NString.getNull();
		NString chkInd = NString.getNull();
		String sqlchkConc = "SELECT DISTINCT 'Y' "
				+ " FROM SORCCON X "
				+ " WHERE SORCCON_CURR_RULE = :P_CURR_RULE AND SORCCON_TERM_CODE_EFF = (SELECT MAX(SORCCON_TERM_CODE_EFF) "
				+ " FROM SORCCON "
				+ " WHERE SORCCON_CURR_RULE = X.SORCCON_CURR_RULE AND (SORCCON_CMJR_RULE = X.SORCCON_CMJR_RULE OR SORCCON_CMJR_RULE IS NULL) AND (DECODE(SORCCON_REC_IND, 'Y', 'R') = :P_MODULE OR DECODE(SORCCON_REC_IND, 'Y', 'A') = :P_MODULE OR DECODE(SORCCON_REC_IND, 'Y', 'S') = :P_MODULE OR DECODE(SORCCON_REC_IND, 'Y', 'H') = :P_MODULE OR DECODE(SORCCON_REC_IND, 'Y', 'M') = :P_MODULE) AND SORCCON_TERM_CODE_EFF <= :P_TERM ) ";
		DataCursor chkConc = new DataCursor(sqlchkConc);
		try {
			// Setting query parameters
			chkConc.addParameter("P_CURR_RULE", currRule);
			chkConc.addParameter("P_MODULE", module);
			chkConc.addParameter("P_TERM", term);
			// F2J_WARNING : Make sure that the method "Close" is being called
			// over the variable chkConc.
			chkConc.open();
			ResultSet chkConcResults = chkConc.fetchInto();
			if (chkConcResults != null) {
				chkInd = chkConcResults.getStr(0);
			}
			if (chkConc.found()) {
				retInd = toStr("Y");
			} else {
				retInd = toStr("N");
			}
			chkConc.close();
			return retInd;
		} finally {
			chkConc.close();
		}
	}

	public void exitProcedure() {
		return;
	};

	public void endFindPlan() {
		return;
	};

	public void displayWindow() {
		// DISPLAY_WINDOW:;
		goBlock(toStr("S$_COMM_PLAN_BLOCK"));
		throw new ApplicationException();
	};
}