package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class Nokplib {
	public static NString fCheckPerdadjExist(NNumber parPidm,
			NString parPosn, NString parSuff,
			NDate parNbrjobsEffectiveDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKPLIB.F_CHECK_PERDADJ_EXIST",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetDeferPay(NNumber parPidm, NString parPosn,
			NString parSuff) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.F_GET_DEFER_PAY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetEmplEcls(NNumber parPidm) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.F_GET_EMPL_ECLS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_PIDM", parPidm);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NDate fGetLastPaidDate(NNumber parPidm,
			NString parPhrjobsPosn, NString parPhrjobsSuff) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.F_GET_LAST_PAID_DATE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_PHRJOBS_POSN", parPhrjobsPosn);
		cmd.addParameter("@PAR_PHRJOBS_SUFF", parPhrjobsSuff);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NString fGetPosnEcls(NString parPosn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.F_GET_POSN_ECLS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_POSN", parPosn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void pCalcDeferPay(NNumber parNbrjobsAssgnSalary,
			NNumber parNbrjobsFactor, NNumber parNbrjobsPays,
			NString parNbrjobsPictCode, NDate parNbrjobsEffectiveDate,
			NString parNbrjobsDfprCode, NString parEclsDfprCode,
			NString parHoldDfprCode, NNumber parPidm, NString parSuff,
			NString parPosn, Ref<NString> parDfprDesc,
			NString parExeSource, Ref<NNumber> parDeferAccruals,
			Ref<NNumber> parAdjPerPaySal,
			Ref<NNumber> parAdjPerPayDefer,
			Ref<NString> parDeferInd, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_CALC_DEFER_PAY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NBRJOBS_ASSGN_SALARY", parNbrjobsAssgnSalary);
		cmd.addParameter("@PAR_NBRJOBS_FACTOR", parNbrjobsFactor);
		cmd.addParameter("@PAR_NBRJOBS_PAYS", parNbrjobsPays);
		cmd.addParameter("@PAR_NBRJOBS_PICT_CODE", parNbrjobsPictCode);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
		cmd.addParameter("@PAR_NBRJOBS_DFPR_CODE", parNbrjobsDfprCode);
		cmd.addParameter("@PAR_ECLS_DFPR_CODE", parEclsDfprCode);
		cmd.addParameter("@PAR_HOLD_DFPR_CODE", parHoldDfprCode);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_DFPR_DESC", NString.class);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_DEFER_ACCRUALS", NNumber.class);
		cmd.addParameter("@PAR_ADJ_PER_PAY_SAL", NNumber.class);
		cmd.addParameter("@PAR_ADJ_PER_PAY_DEFER", NNumber.class);
		cmd.addParameter("@PAR_DEFER_IND", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDfprDesc.val = cmd.getParameterValue("@PAR_DFPR_DESC",
				NString.class);
		parDeferAccruals.val = cmd.getParameterValue(
				"@PAR_DEFER_ACCRUALS", NNumber.class);
		parAdjPerPaySal.val = cmd.getParameterValue(
				"@PAR_ADJ_PER_PAY_SAL", NNumber.class);
		parAdjPerPayDefer.val = cmd.getParameterValue(
				"@PAR_ADJ_PER_PAY_DEFER", NNumber.class);
		parDeferInd.val = cmd.getParameterValue("@PAR_DEFER_IND",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pCalcSalEncumbrance(NNumber pidm, NString posn,
			NString suff, NDate encBdate, NDate encEdate,
			NNumber bjobSalEnc, NString financeSysInd, NString source,
			Ref<NNumber> salEncum, Ref<NString> errInd,
			Ref<NString> errMsg) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_CALC_SAL_ENCUMBRANCE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PIDM", pidm);
		cmd.addParameter("@POSN", posn);
		cmd.addParameter("@SUFF", suff);
		cmd.addParameter("@ENC_BDATE", encBdate);
		cmd.addParameter("@ENC_EDATE", encEdate);
		cmd.addParameter("@BJOB_SAL_ENC", bjobSalEnc);
		cmd.addParameter("@FINANCE_SYS_IND", financeSysInd);
		cmd.addParameter("@SOURCE", source);
		cmd.addParameter("@SAL_ENCUM", salEncum, true);
		cmd.addParameter("@ERR_IND", errInd, true);
		cmd.addParameter("@ERR_MSG", errMsg, true);

		cmd.execute();
		salEncum.val = cmd
				.getParameterValue("@SAL_ENCUM", NNumber.class);
		errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
		errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);

	}

	public static void pDelDadjsJhis(NNumber parPidm, NString parPosn,
			NString parSuff, NString tableName, NDate parEffDate,
			Ref<NString> parMsg) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_DEL_DADJS_JHIS", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@TABLE_NAME", tableName);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);
		cmd.addParameter("@PAR_MSG", NString.class);

		cmd.execute();
		parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);

	}

	public static void pEditBdca(NString parBdcaCode, NString parBcatCode,
			NString exeSource, Ref<NString> parBdcaDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_BDCA", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_BDCA_CODE", parBdcaCode);
		cmd.addParameter("@PAR_BCAT_CODE", parBcatCode);
		cmd.addParameter("@EXE_SOURCE", exeSource);
		cmd.addParameter("@PAR_BDCA_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parBdcaDesc.val = cmd.getParameterValue("@PAR_BDCA_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditBdpl(NString parNtrfrngBdcaCode,
			NString parNtrfrngBdplCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_BDPL", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NTRFRNG_BDCA_CODE", parNtrfrngBdcaCode);
		cmd.addParameter("@PAR_NTRFRNG_BDPL_CODE", parNtrfrngBdplCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditDefEarnCode(NString parEclsCode,
			Ref<NString> parEarnCode,
			Ref<NString> parBaseEarnCode,
			Ref<NString> parBaseEarnDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_DEF_EARN_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EARN_CODE", NString.class);
		cmd.addParameter("@PAR_BASE_EARN_CODE", NString.class);
		cmd.addParameter("@PAR_BASE_EARN_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEarnCode.val = cmd.getParameterValue("@PAR_EARN_CODE",
				NString.class);
		parBaseEarnCode.val = cmd.getParameterValue("@PAR_BASE_EARN_CODE",
				NString.class);
		parBaseEarnDesc.val = cmd.getParameterValue("@PAR_BASE_EARN_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditDeferPay(NNumber parNbrjobsFactor,
			NNumber parNbrjobsPays, NString parNbrjobsPictCode,
			NString parEclsDfprCode, Ref<NString> parNbrjobsDfprCode,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_DEFER_PAY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NBRJOBS_FACTOR", parNbrjobsFactor);
		cmd.addParameter("@PAR_NBRJOBS_PAYS", parNbrjobsPays);
		cmd.addParameter("@PAR_NBRJOBS_PICT_CODE", parNbrjobsPictCode);
		cmd.addParameter("@PAR_ECLS_DFPR_CODE", parEclsDfprCode);
		cmd.addParameter("@PAR_NBRJOBS_DFPR_CODE", parNbrjobsDfprCode, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parNbrjobsDfprCode.val = cmd.getParameterValue(
				"@PAR_NBRJOBS_DFPR_CODE", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditDfpr(NNumber parPidm, NString parPosn,
			NString parSuff, NNumber parNbrjobsFactor,
			NNumber parNbrjobsPays, NDate parNbrjobsEffectiveDate,
			NString parEclsDfprCode, NString parHoldDfprCode,
			NString parExeSource, Ref<NString> parNbrjobsDfprCode,
			Ref<NDate> parDeferPayBegin,
			Ref<NNumber> parDfprBeginPayno,
			Ref<NNumber> parDfprEndPayno,
			Ref<NString> parDfprDesc,
			Ref<NNumber> parMaxDfpnPayno, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_DFPR", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_NBRJOBS_FACTOR", parNbrjobsFactor);
		cmd.addParameter("@PAR_NBRJOBS_PAYS", parNbrjobsPays);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
		cmd.addParameter("@PAR_ECLS_DFPR_CODE", parEclsDfprCode);
		cmd.addParameter("@PAR_HOLD_DFPR_CODE", parHoldDfprCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_NBRJOBS_DFPR_CODE", parNbrjobsDfprCode, true);
		cmd.addParameter("@PAR_DEFER_PAY_BEGIN", NDate.class);
		cmd.addParameter("@PAR_DFPR_BEGIN_PAYNO", NNumber.class);
		cmd.addParameter("@PAR_DFPR_END_PAYNO", NNumber.class);
		cmd.addParameter("@PAR_DFPR_DESC", NString.class);
		cmd.addParameter("@PAR_MAX_DFPN_PAYNO", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parNbrjobsDfprCode.val = cmd.getParameterValue(
				"@PAR_NBRJOBS_DFPR_CODE", NString.class);
		parDeferPayBegin.val = cmd.getParameterValue(
				"@PAR_DEFER_PAY_BEGIN", NDate.class);
		parDfprBeginPayno.val = cmd.getParameterValue(
				"@PAR_DFPR_BEGIN_PAYNO", NNumber.class);
		parDfprEndPayno.val = cmd.getParameterValue("@PAR_DFPR_END_PAYNO",
				NNumber.class);
		parDfprDesc.val = cmd.getParameterValue("@PAR_DFPR_DESC",
				NString.class);
		parMaxDfpnPayno.val = cmd.getParameterValue("@PAR_MAX_DFPN_PAYNO",
				NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEarn(NString parEarnCode, NString exeSource,
			Ref<NString> earnDesc, Ref<NString> earnBase,
			Ref<NString> specRateInd, Ref<NString> earnType,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EARN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
		cmd.addParameter("@EXE_SOURCE", exeSource);
		cmd.addParameter("@EARN_DESC", NString.class);
		cmd.addParameter("@EARN_BASE", NString.class);
		cmd.addParameter("@SPEC_RATE_IND", NString.class);
		cmd.addParameter("@EARN_TYPE", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		earnDesc.val = cmd
				.getParameterValue("@EARN_DESC", NString.class);
		earnBase.val = cmd
				.getParameterValue("@EARN_BASE", NString.class);
		specRateInd.val = cmd.getParameterValue("@SPEC_RATE_IND",
				NString.class);
		earnType.val = cmd
				.getParameterValue("@EARN_TYPE", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEarnBase(NNumber parPidm, NString parPosn,
			NString parSuff, NString parEarnCode, NDate parEarnEffDate,
			NDate earnQueryDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EARN_BASE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
		cmd.addParameter("@PAR_EARN_EFF_DATE", parEarnEffDate);
		cmd.addParameter("@EARN_QUERY_DATE", earnQueryDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEarnBaseFuture(NNumber parPidm,
			NString parPosn, NString parSuff, NString parEarnCode,
			NDate parCancelDate, NDate parEarnEffDate,
			NDate earnQueryDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EARN_BASE_FUTURE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
		cmd.addParameter("@PAR_CANCEL_DATE", parCancelDate);
		cmd.addParameter("@PAR_EARN_EFF_DATE", parEarnEffDate);
		cmd.addParameter("@EARN_QUERY_DATE", earnQueryDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEarnBud(NString parEarnCode,
			Ref<NString> parEarnDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EARN_BUD", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
		cmd.addParameter("@PAR_EARN_DESC", parEarnDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEarnDesc.val = cmd.getParameterValue("@PAR_EARN_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEcls(NString parEclsCode, NString parExeSource,
			Ref<NString> parEclsDesc, Ref<NString> parPictCode,
			Ref<NNumber> parEclsHrsDay,
			Ref<NNumber> parEclsHrsPay,
			Ref<NString> parEclsDhInd,
			Ref<NString> parEclsSalaryInd,
			Ref<NString> parEclsFpi, Ref<NString> parEclsShcd,
			Ref<NString> parEclsEncInd,
			Ref<NString> parEclsEmprCode,
			Ref<NString> parEclsLgcdCode,
			Ref<NString> parEclsDfprCode,
			Ref<NString> parEclsPcatCode,
			Ref<NString> parEclsStrsAssnCode,
			Ref<NString> parEclsStrsPayCode,
			Ref<NString> parEclsPersPayCode,
			Ref<NString> parBudgetRollInd,
			Ref<NString> parPremiumRollInd,
			Ref<NString> parWkshCode,
			Ref<NString> parInternalFtPtInd,
			Ref<NString> parTimeEntryMethod,
			Ref<NString> parTimeEntryType,
			Ref<NString> parTimeInOutInd,
			Ref<NNumber> parBudgBasis,
			Ref<NNumber> parAnnBasis,
			Ref<NString> parCreateJfteInd,
			Ref<NString> parLeavReptMethod,
			Ref<NString> parLcatCode,
			Ref<NString> parPictCodeLeavRept, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_ECLS", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_ECLS_DESC", NString.class);
		cmd.addParameter("@PAR_PICT_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_HRS_DAY", NNumber.class);
		cmd.addParameter("@PAR_ECLS_HRS_PAY", NNumber.class);
		cmd.addParameter("@PAR_ECLS_DH_IND", NString.class);
		cmd.addParameter("@PAR_ECLS_SALARY_IND", NString.class);
		cmd.addParameter("@PAR_ECLS_FPI", NString.class);
		cmd.addParameter("@PAR_ECLS_SHCD", NString.class);
		cmd.addParameter("@PAR_ECLS_ENC_IND", NString.class);
		cmd.addParameter("@PAR_ECLS_EMPR_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_LGCD_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_DFPR_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_PCAT_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_STRS_ASSN_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_STRS_PAY_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_PERS_PAY_CODE", NString.class);
		cmd.addParameter("@PAR_BUDGET_ROLL_IND", NString.class);
		cmd.addParameter("@PAR_PREMIUM_ROLL_IND", NString.class);
		cmd.addParameter("@PAR_WKSH_CODE", NString.class);
		cmd.addParameter("@PAR_INTERNAL_FT_PT_IND", NString.class);
		cmd.addParameter("@PAR_TIME_ENTRY_METHOD", NString.class);
		cmd.addParameter("@PAR_TIME_ENTRY_TYPE", NString.class);
		cmd.addParameter("@PAR_TIME_IN_OUT_IND", NString.class);
		cmd.addParameter("@PAR_BUDG_BASIS", NNumber.class);
		cmd.addParameter("@PAR_ANN_BASIS", NNumber.class);
		cmd.addParameter("@PAR_CREATE_JFTE_IND", NString.class);
		cmd.addParameter("@PAR_LEAV_REPT_METHOD", NString.class);
		cmd.addParameter("@PAR_LCAT_CODE", NString.class);
		cmd.addParameter("@PAR_PICT_CODE_LEAV_REPT", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEclsDesc.val = cmd.getParameterValue("@PAR_ECLS_DESC",
				NString.class);
		parPictCode.val = cmd.getParameterValue("@PAR_PICT_CODE",
				NString.class);
		parEclsHrsDay.val = cmd.getParameterValue("@PAR_ECLS_HRS_DAY",
				NNumber.class);
		parEclsHrsPay.val = cmd.getParameterValue("@PAR_ECLS_HRS_PAY",
				NNumber.class);
		parEclsDhInd.val = cmd.getParameterValue("@PAR_ECLS_DH_IND",
				NString.class);
		parEclsSalaryInd.val = cmd.getParameterValue(
				"@PAR_ECLS_SALARY_IND", NString.class);
		parEclsFpi.val = cmd.getParameterValue("@PAR_ECLS_FPI",
				NString.class);
		parEclsShcd.val = cmd.getParameterValue("@PAR_ECLS_SHCD",
				NString.class);
		parEclsEncInd.val = cmd.getParameterValue("@PAR_ECLS_ENC_IND",
				NString.class);
		parEclsEmprCode.val = cmd.getParameterValue("@PAR_ECLS_EMPR_CODE",
				NString.class);
		parEclsLgcdCode.val = cmd.getParameterValue("@PAR_ECLS_LGCD_CODE",
				NString.class);
		parEclsDfprCode.val = cmd.getParameterValue("@PAR_ECLS_DFPR_CODE",
				NString.class);
		parEclsPcatCode.val = cmd.getParameterValue("@PAR_ECLS_PCAT_CODE",
				NString.class);
		parEclsStrsAssnCode.val = cmd.getParameterValue(
				"@PAR_ECLS_STRS_ASSN_CODE", NString.class);
		parEclsStrsPayCode.val = cmd.getParameterValue(
				"@PAR_ECLS_STRS_PAY_CODE", NString.class);
		parEclsPersPayCode.val = cmd.getParameterValue(
				"@PAR_ECLS_PERS_PAY_CODE", NString.class);
		parBudgetRollInd.val = cmd.getParameterValue(
				"@PAR_BUDGET_ROLL_IND", NString.class);
		parPremiumRollInd.val = cmd.getParameterValue(
				"@PAR_PREMIUM_ROLL_IND", NString.class);
		parWkshCode.val = cmd.getParameterValue("@PAR_WKSH_CODE",
				NString.class);
		parInternalFtPtInd.val = cmd.getParameterValue(
				"@PAR_INTERNAL_FT_PT_IND", NString.class);
		parTimeEntryMethod.val = cmd.getParameterValue(
				"@PAR_TIME_ENTRY_METHOD", NString.class);
		parTimeEntryType.val = cmd.getParameterValue(
				"@PAR_TIME_ENTRY_TYPE", NString.class);
		parTimeInOutInd.val = cmd.getParameterValue(
				"@PAR_TIME_IN_OUT_IND", NString.class);
		parBudgBasis.val = cmd.getParameterValue("@PAR_BUDG_BASIS",
				NNumber.class);
		parAnnBasis.val = cmd.getParameterValue("@PAR_ANN_BASIS",
				NNumber.class);
		parCreateJfteInd.val = cmd.getParameterValue(
				"@PAR_CREATE_JFTE_IND", NString.class);
		parLeavReptMethod.val = cmd.getParameterValue(
				"@PAR_LEAV_REPT_METHOD", NString.class);
		parLcatCode.val = cmd.getParameterValue("@PAR_LCAT_CODE",
				NString.class);
		parPictCodeLeavRept.val = cmd.getParameterValue(
				"@PAR_PICT_CODE_LEAV_REPT", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEclsEarn(NString parEclsCode,
			NString parEarnCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_ECLS_EARN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEclsNameOnly(NString parEclsCode,
			NString exeSource, Ref<NString> parEclsEncInd,
			Ref<NString> parEclsDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKPLIB.P_EDIT_ECLS_NAME_ONLY",
						DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@EXE_SOURCE", exeSource);
		cmd.addParameter("@PAR_ECLS_ENC_IND", NString.class);
		cmd.addParameter("@PAR_ECLS_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEclsEncInd.val = cmd.getParameterValue("@PAR_ECLS_ENC_IND",
				NString.class);
		parEclsDesc.val = cmd.getParameterValue("@PAR_ECLS_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEclsOnly(NString parEclsCode,
			NString parExeSource, Ref<NString> parEclsDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_ECLS_ONLY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_ECLS_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEclsDesc.val = cmd.getParameterValue("@PAR_ECLS_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEfun(NString parEfunCode,
			Ref<NString> parEfunDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EFUN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_EFUN_CODE", parEfunCode);
		cmd.addParameter("@PAR_EFUN_DESC", parEfunDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEfunDesc.val = cmd.getParameterValue("@PAR_EFUN_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEmplPidm(NNumber parPidm,
			Ref<NString> parEmplSta, Ref<NString> parDistOrgn,
			Ref<NString> parDistCoas,
			Ref<NString> parEmplTermDate,
			Ref<NString> parBcatCode,
			Ref<NString> parSecEclsCode,
			Ref<NString> parSecOrgnCode,
			Ref<NString> parSecCoasCode,
			Ref<NString> parCoasCodeHome,
			Ref<NString> parOrgnCodeHome, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EMPL_PIDM", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_EMPL_STA", NString.class);
		cmd.addParameter("@PAR_DIST_ORGN", NString.class);
		cmd.addParameter("@PAR_DIST_COAS", NString.class);
		cmd.addParameter("@PAR_EMPL_TERM_DATE", NString.class);
		cmd.addParameter("@PAR_BCAT_CODE", NString.class);
		cmd.addParameter("@PAR_SEC_ECLS_CODE", NString.class);
		cmd.addParameter("@PAR_SEC_ORGN_CODE", NString.class);
		cmd.addParameter("@PAR_SEC_COAS_CODE", NString.class);
		cmd.addParameter("@PAR_COAS_CODE_HOME", NString.class);
		cmd.addParameter("@PAR_ORGN_CODE_HOME", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEmplSta.val = cmd.getParameterValue("@PAR_EMPL_STA",
				NString.class);
		parDistOrgn.val = cmd.getParameterValue("@PAR_DIST_ORGN",
				NString.class);
		parDistCoas.val = cmd.getParameterValue("@PAR_DIST_COAS",
				NString.class);
		parEmplTermDate.val = cmd.getParameterValue("@PAR_EMPL_TERM_DATE",
				NString.class);
		parBcatCode.val = cmd.getParameterValue("@PAR_BCAT_CODE",
				NString.class);
		parSecEclsCode.val = cmd.getParameterValue("@PAR_SEC_ECLS_CODE",
				NString.class);
		parSecOrgnCode.val = cmd.getParameterValue("@PAR_SEC_ORGN_CODE",
				NString.class);
		parSecCoasCode.val = cmd.getParameterValue("@PAR_SEC_COAS_CODE",
				NString.class);
		parCoasCodeHome.val = cmd.getParameterValue("@PAR_COAS_CODE_HOME",
				NString.class);
		parOrgnCodeHome.val = cmd.getParameterValue("@PAR_ORGN_CODE_HOME",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEmpr(NString parEmprCode, NString parExeSource,
			Ref<NString> parEmprDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_EMPR", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_EMPR_CODE", parEmprCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_EMPR_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEmprDesc.val = cmd.getParameterValue("@PAR_EMPR_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEskl(NString parEsklCode,
			Ref<NString> parEsklDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_ESKL", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ESKL_CODE", parEsklCode);
		cmd.addParameter("@PAR_ESKL_DESC", parEsklDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEsklDesc.val = cmd.getParameterValue("@PAR_ESKL_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditLvDates(NString parPidm, NDate parEffDate,
			NString parStatus, NString exeSource, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_LV_DATES", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);
		cmd.addParameter("@PAR_STATUS", parStatus);
		cmd.addParameter("@EXE_SOURCE", exeSource);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsJblnCode(NString parJblnCode,
			NString parExeSource, Ref<NString> parJblnDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_JBLN_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_JBLN_CODE", parJblnCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_JBLN_DESC", parJblnDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parJblnDesc.val = cmd.getParameterValue("@PAR_JBLN_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsJcreCode(NString parJcreCode,
			NString parExeSource, Ref<NString> parJcreDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_JCRE_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_JCRE_CODE", parJcreCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_JCRE_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parJcreDesc.val = cmd.getParameterValue("@PAR_JCRE_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsLgcdCode(NString parLgcdCode,
			NString parExeSource, Ref<NString> parLgcdDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_LGCD_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_LGCD_CODE", parLgcdCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_LGCD_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parLgcdDesc.val = cmd.getParameterValue("@PAR_LGCD_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsLocnCode(NString parLocnCode,
			NString parExeSource, Ref<NString> parLocnDesc,
			Ref<NString> parEmprCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_LOCN_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_LOCN_CODE", parLocnCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_LOCN_DESC", NString.class);
		cmd.addParameter("@PAR_EMPR_CODE", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parLocnDesc.val = cmd.getParameterValue("@PAR_LOCN_DESC",
				NString.class);
		parEmprCode.val = cmd.getParameterValue("@PAR_EMPR_CODE",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsSchlCode(NString parSchlCode,
			NString parExeSource, Ref<NString> parEmprCode,
			Ref<NString> parSchlDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_SCHL_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_SCHL_CODE", parSchlCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_EMPR_CODE", NString.class);
		cmd.addParameter("@PAR_SCHL_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEmprCode.val = cmd.getParameterValue("@PAR_EMPR_CODE",
				NString.class);
		parSchlDesc.val = cmd.getParameterValue("@PAR_SCHL_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsStrsAssnCode(NString parAssnCode,
			NString parSource, Ref<NString> parAssnDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_STRS_ASSN_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ASSN_CODE", parAssnCode);
		cmd.addParameter("@PAR_SOURCE", parSource);
		cmd.addParameter("@PAR_ASSN_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parAssnDesc.val = cmd.getParameterValue("@PAR_ASSN_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNbrjobsWkcpCode(NString parWkcpCode,
			NString parExeSource, Ref<NString> parWkcpDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NBRJOBS_WKCP_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_WKCP_CODE", parWkcpCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_WKCP_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parWkcpDesc.val = cmd.getParameterValue("@PAR_WKCP_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditNtrfrngBdcaCode(NString parBdcaCode,
			NString parExeSource, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_NTRFRNG_BDCA_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_BDCA_CODE", parBdcaCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditOrgnTsHr(NString parOrgnCodeTs,
			NString parExeSource, Ref<NString> parDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_ORGN_TS_HR", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ORGN_CODE_TS", parOrgnCodeTs);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPartialPay(NString parStatus,
			NString parEclsEncInd, NString parEclsCode,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PARTIAL_PAY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_STATUS", parStatus);
		cmd.addParameter("@PAR_ECLS_ENC_IND", parEclsEncInd);
		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPcat(NString parPcatCode, NString parEclsCode,
			NString parExeSource, Ref<NString> parPcatDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PCAT", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PCAT_CODE", parPcatCode);
		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_PCAT_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parPcatDesc.val = cmd.getParameterValue("@PAR_PCAT_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPebemplBcatCode(NString parBcatCode,
			NString parEclsCode, NNumber parPidm,
			Ref<NString> parDesc, NString exeSource,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PEBEMPL_BCAT_CODE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_BCAT_CODE", parBcatCode);
		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_DESC", parDesc, true);
		cmd.addParameter("@EXE_SOURCE", exeSource);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPebemplTermEmpl(NNumber parPidm,
			NString parOrgnCodeHome, NString parOrgnCodeDist,
			NString parCoasCodeHome, NString parCoasCodeDist,
			NString parEclsCode, NString parLcatCode,
			NString parBcatCode, NDate parFirstHireDate,
			NDate parCurrentHireDate, NDate parAdjServiceDate,
			NDate parSeniorityDate, NString parLreaCode,
			NDate parLoaBegDate, NDate parLoaEndDate,
			NString parI9FormInd, NDate parI9Date, NDate parI9ExpireDate,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PEBEMPL_TERM_EMPL",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_ORGN_CODE_HOME", parOrgnCodeHome);
		cmd.addParameter("@PAR_ORGN_CODE_DIST", parOrgnCodeDist);
		cmd.addParameter("@PAR_COAS_CODE_HOME", parCoasCodeHome);
		cmd.addParameter("@PAR_COAS_CODE_DIST", parCoasCodeDist);
		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
		cmd.addParameter("@PAR_BCAT_CODE", parBcatCode);
		cmd.addParameter("@PAR_FIRST_HIRE_DATE", parFirstHireDate);
		cmd.addParameter("@PAR_CURRENT_HIRE_DATE", parCurrentHireDate);
		cmd.addParameter("@PAR_ADJ_SERVICE_DATE", parAdjServiceDate);
		cmd.addParameter("@PAR_SENIORITY_DATE", parSeniorityDate);
		cmd.addParameter("@PAR_LREA_CODE", parLreaCode);
		cmd.addParameter("@PAR_LOA_BEG_DATE", parLoaBegDate);
		cmd.addParameter("@PAR_LOA_END_DATE", parLoaEndDate);
		cmd.addParameter("@PAR_I9_FORM_IND", parI9FormInd);
		cmd.addParameter("@PAR_I9_DATE", parI9Date);
		cmd.addParameter("@PAR_I9_EXPIRE_DATE", parI9ExpireDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPgrpCode(NString parPgrpCode,
			Ref<NString> parPgrpDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PGRP_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PGRP_CODE", parPgrpCode);
		cmd.addParameter("@PAR_PGRP_DESC", parPgrpDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parPgrpDesc.val = cmd.getParameterValue("@PAR_PGRP_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPhrjobsDel(NNumber parPidm, NString parPosn,
			NString parSuff, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PHRJOBS_DEL", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPhrjobsDelPict(NNumber parPidm,
			NString parPosn, NString parSuff, NString parPictCode,
			NDate parEffDate, NDate parLastPaidDate, NString msgInd,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PHRJOBS_DEL_PICT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);
		cmd.addParameter("@PAR_LAST_PAID_DATE", parLastPaidDate);
		cmd.addParameter("@MSG_IND", msgInd);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPhrjobsDelPictTerm(NNumber parPidm,
			NString parPosn, NString parSuff, NString parPictCode,
			NDate parEffDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PHRJOBS_DEL_PICT_TERM",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPict(NString parPictCode, NString parExeSource,
			Ref<NNumber> parPaysPerYear,
			Ref<NString> parPictDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PICT", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_PAYS_PER_YEAR", NNumber.class);
		cmd.addParameter("@PAR_PICT_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parPaysPerYear.val = cmd.getParameterValue("@PAR_PAYS_PER_YEAR",
				NNumber.class);
		parPictDesc.val = cmd.getParameterValue("@PAR_PICT_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPictCaln(NString parPictCode, NDate parEffDate,
			Ref<NString> parYear, Ref<NNumber> parPayno,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PICT_CALN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);
		cmd.addParameter("@PAR_YEAR", NString.class);
		cmd.addParameter("@PAR_PAYNO", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parYear.val = cmd.getParameterValue("@PAR_YEAR", NString.class);
		parPayno.val = cmd
				.getParameterValue("@PAR_PAYNO", NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPictDfpr(NString parPictCode,
			NString parDfprCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_PICT_DFPR", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_DFPR_CODE", parDfprCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditWkshForEarn(NNumber parPidm, NString parPosn,
			NString parSuff, NDate parNewDate, NDate parWkshEffDate,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_EDIT_WKSH_FOR_EARN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_NEW_DATE", parNewDate);
		cmd.addParameter("@PAR_WKSH_EFF_DATE", parWkshEffDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pGetDfprPays(NString parNbrjobsDfprCode,
			Ref<NNumber> parDfprPays,
			Ref<NNumber> parDfprFactor, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_GET_DFPR_PAYS", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NBRJOBS_DFPR_CODE", parNbrjobsDfprCode);
		cmd.addParameter("@PAR_DFPR_PAYS", NNumber.class);
		cmd.addParameter("@PAR_DFPR_FACTOR", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDfprPays.val = cmd.getParameterValue("@PAR_DFPR_PAYS",
				NNumber.class);
		parDfprFactor.val = cmd.getParameterValue("@PAR_DFPR_FACTOR",
				NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pGetHoldFactorPq(NString parPictCode,
			Ref<NNumber> parHoldFactor, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_GET_HOLD_FACTOR_PQ", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@PAR_HOLD_FACTOR", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parHoldFactor.val = cmd.getParameterValue("@PAR_HOLD_FACTOR",
				NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pInsPerdadj(NNumber parPidm, NString parPosn,
			NString parSuff, NDate parNbrjobsEffectiveDate,
			NNumber parNbrjobsPerPaySalary,
			NNumber parNbrjobsPerPayDeferAmt, NNumber parAdjPerPaySal,
			NNumber parDeferAccruals, NNumber parAdjPerPayDefer,
			Ref<NString> msg, Ref<NString> msgType,
			NString parSystemCalcInd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_INS_PERDADJ", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_SALARY", parNbrjobsPerPaySalary);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_DEFER_AMT",
				parNbrjobsPerPayDeferAmt);
		cmd.addParameter("@PAR_ADJ_PER_PAY_SAL", parAdjPerPaySal);
		cmd.addParameter("@PAR_DEFER_ACCRUALS", parDeferAccruals);
		cmd.addParameter("@PAR_ADJ_PER_PAY_DEFER", parAdjPerPayDefer);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);
		cmd.addParameter("@PAR_SYSTEM_CALC_IND", parSystemCalcInd);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pInsPerjhis(NNumber parNbrjobsPidm,
			NString parNbrjobsPosn, NString parNbrjobsSuff,
			NDate parNbrjobsEffectiveDate, NString parNbrjobsStatus,
			NString parNbrjobsEclsCode, NDate parNbrbjobBeginDate,
			NDate parNbrbjobEndDate, NString parNbrjobsPictCode,
			NString parNbrjobsSalTable, NString parNbrjobsSalGrade,
			NNumber parNbrjobsSalStep, NNumber parNbrjobsHrsDay,
			NNumber parNbrjobsRegRate, NNumber parNbrjobsAssgnSalary,
			NNumber parNbrjobsAnnSalary, NString parNbrjobsJcreCode,
			NString parNbrjobsEmprCode, NString parNbrjobsLocnCode,
			NString parNbrjobsSchlCode, NNumber parNbrjobsSupervisorPidm,
			NString parNbrjobsSupervisorPosn,
			NString parNbrjobsSupervisorSuff, NString parNbrjobsWkcpCode,
			NString parNbrjobsJblnCode, NDate parNbrjobsPersChgDate,
			NNumber parNbrbjobDeferBal, NString parNbrbjobContractType,
			NNumber parNbrbjobSalaryEncumbrance,
			NDate parNbrbjobContractBegnDate,
			NDate parNbrbjobContractEndDate, NString parNbrbjobStepIncrMon,
			NString parNbrbjobStepIncrDay, NString parNbrbjobCoasCode,
			NString parNbrbjobAccrueLeaveInd,
			NString parNbrbjobCivilServiceInd,
			NNumber parNbrbjobFringeEncumbrance, NString parNbrjobsDesc,
			NString parNbrjobsCoasCodeTs, NString parNbrjobsOrgnCodeTs,
			NNumber parNbrjobsApptPct, NNumber parNbrjobsFte,
			NNumber parNbrjobsHrsPay, NString parNbrjobsShift,
			NNumber parNbrjobsFactor, NNumber parNbrjobsPerPaySalary,
			NNumber parNbrjobsPays, NNumber parNbrjobsPerPayDeferAmt,
			NString parNbrjobsSgrpCode, NString parNbrjobsLgcdCode,
			NString parNbrjobsPcatCode, NString parNbrjobsDfprCode,
			NNumber parNbrbjobTotalEncumbHrs,
			NNumber parNbrbjobTotalContractHrs,
			NNumber parNbrjobsEncumbranceHrs,
			NString parNbrjobsTimeEntryMethod,
			NString parNbrjobsTimeEntryType,
			NString parNbrjobsTimeInOutInd,
			NDate parNbrbjobProbatBeginDate, NDate parNbrbjobProbatEndDate,
			NNumber parNbrbjobProbationUnits,
			NString parNbrjobsLeavReptMethod, NString parNbrjobsLcatCode,
			NDate parNbrbjobEligibleDate,
			NString parNbrjobsPictCodeLeavRpt, NDate parCommentDate,
			NString parCommentUser, NString parNobtranComment,
			Ref<NString> parMsg) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_INS_PERJHIS", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NBRJOBS_PIDM", parNbrjobsPidm);
		cmd.addParameter("@PAR_NBRJOBS_POSN", parNbrjobsPosn);
		cmd.addParameter("@PAR_NBRJOBS_SUFF", parNbrjobsSuff);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
		cmd.addParameter("@PAR_NBRJOBS_STATUS", parNbrjobsStatus);
		cmd.addParameter("@PAR_NBRJOBS_ECLS_CODE", parNbrjobsEclsCode);
		cmd.addParameter("@PAR_NBRBJOB_BEGIN_DATE", parNbrbjobBeginDate);
		cmd.addParameter("@PAR_NBRBJOB_END_DATE", parNbrbjobEndDate);
		cmd.addParameter("@PAR_NBRJOBS_PICT_CODE", parNbrjobsPictCode);
		cmd.addParameter("@PAR_NBRJOBS_SAL_TABLE", parNbrjobsSalTable);
		cmd.addParameter("@PAR_NBRJOBS_SAL_GRADE", parNbrjobsSalGrade);
		cmd.addParameter("@PAR_NBRJOBS_SAL_STEP", parNbrjobsSalStep);
		cmd.addParameter("@PAR_NBRJOBS_HRS_DAY", parNbrjobsHrsDay);
		cmd.addParameter("@PAR_NBRJOBS_REG_RATE", parNbrjobsRegRate);
		cmd.addParameter("@PAR_NBRJOBS_ASSGN_SALARY", parNbrjobsAssgnSalary);
		cmd.addParameter("@PAR_NBRJOBS_ANN_SALARY", parNbrjobsAnnSalary);
		cmd.addParameter("@PAR_NBRJOBS_JCRE_CODE", parNbrjobsJcreCode);
		cmd.addParameter("@PAR_NBRJOBS_EMPR_CODE", parNbrjobsEmprCode);
		cmd.addParameter("@PAR_NBRJOBS_LOCN_CODE", parNbrjobsLocnCode);
		cmd.addParameter("@PAR_NBRJOBS_SCHL_CODE", parNbrjobsSchlCode);
		cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_PIDM",
				parNbrjobsSupervisorPidm);
		cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_POSN",
				parNbrjobsSupervisorPosn);
		cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_SUFF",
				parNbrjobsSupervisorSuff);
		cmd.addParameter("@PAR_NBRJOBS_WKCP_CODE", parNbrjobsWkcpCode);
		cmd.addParameter("@PAR_NBRJOBS_JBLN_CODE", parNbrjobsJblnCode);
		cmd.addParameter("@PAR_NBRJOBS_PERS_CHG_DATE", parNbrjobsPersChgDate);
		cmd.addParameter("@PAR_NBRBJOB_DEFER_BAL", parNbrbjobDeferBal);
		cmd.addParameter("@PAR_NBRBJOB_CONTRACT_TYPE", parNbrbjobContractType);
		cmd.addParameter("@PAR_NBRBJOB_SALARY_ENCUMBRANCE",
				parNbrbjobSalaryEncumbrance);
		cmd.addParameter("@PAR_NBRBJOB_CONTRACT_BEGN_DATE",
				parNbrbjobContractBegnDate);
		cmd.addParameter("@PAR_NBRBJOB_CONTRACT_END_DATE",
				parNbrbjobContractEndDate);
		cmd.addParameter("@PAR_NBRBJOB_STEP_INCR_MON", parNbrbjobStepIncrMon);
		cmd.addParameter("@PAR_NBRBJOB_STEP_INCR_DAY", parNbrbjobStepIncrDay);
		cmd.addParameter("@PAR_NBRBJOB_COAS_CODE", parNbrbjobCoasCode);
		cmd.addParameter("@PAR_NBRBJOB_ACCRUE_LEAVE_IND",
				parNbrbjobAccrueLeaveInd);
		cmd.addParameter("@PAR_NBRBJOB_CIVIL_SERVICE_IND",
				parNbrbjobCivilServiceInd);
		cmd.addParameter("@PAR_NBRBJOB_FRINGE_ENCUMBRANCE",
				parNbrbjobFringeEncumbrance);
		cmd.addParameter("@PAR_NBRJOBS_DESC", parNbrjobsDesc);
		cmd.addParameter("@PAR_NBRJOBS_COAS_CODE_TS", parNbrjobsCoasCodeTs);
		cmd.addParameter("@PAR_NBRJOBS_ORGN_CODE_TS", parNbrjobsOrgnCodeTs);
		cmd.addParameter("@PAR_NBRJOBS_APPT_PCT", parNbrjobsApptPct);
		cmd.addParameter("@PAR_NBRJOBS_FTE", parNbrjobsFte);
		cmd.addParameter("@PAR_NBRJOBS_HRS_PAY", parNbrjobsHrsPay);
		cmd.addParameter("@PAR_NBRJOBS_SHIFT", parNbrjobsShift);
		cmd.addParameter("@PAR_NBRJOBS_FACTOR", parNbrjobsFactor);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_SALARY", parNbrjobsPerPaySalary);
		cmd.addParameter("@PAR_NBRJOBS_PAYS", parNbrjobsPays);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_DEFER_AMT",
				parNbrjobsPerPayDeferAmt);
		cmd.addParameter("@PAR_NBRJOBS_SGRP_CODE", parNbrjobsSgrpCode);
		cmd.addParameter("@PAR_NBRJOBS_LGCD_CODE", parNbrjobsLgcdCode);
		cmd.addParameter("@PAR_NBRJOBS_PCAT_CODE", parNbrjobsPcatCode);
		cmd.addParameter("@PAR_NBRJOBS_DFPR_CODE", parNbrjobsDfprCode);
		cmd.addParameter("@PAR_NBRBJOB_TOTAL_ENCUMB_HRS",
				parNbrbjobTotalEncumbHrs);
		cmd.addParameter("@PAR_NBRBJOB_TOTAL_CONTRACT_HRS",
				parNbrbjobTotalContractHrs);
		cmd.addParameter("@PAR_NBRJOBS_ENCUMBRANCE_HRS",
				parNbrjobsEncumbranceHrs);
		cmd.addParameter("@PAR_NBRJOBS_TIME_ENTRY_METHOD",
				parNbrjobsTimeEntryMethod);
		cmd.addParameter("@PAR_NBRJOBS_TIME_ENTRY_TYPE",
				parNbrjobsTimeEntryType);
		cmd.addParameter("@PAR_NBRJOBS_TIME_IN_OUT_IND", parNbrjobsTimeInOutInd);
		cmd.addParameter("@PAR_NBRBJOB_PROBAT_BEGIN_DATE",
				parNbrbjobProbatBeginDate);
		cmd.addParameter("@PAR_NBRBJOB_PROBAT_END_DATE",
				parNbrbjobProbatEndDate);
		cmd.addParameter("@PAR_NBRBJOB_PROBATION_UNITS",
				parNbrbjobProbationUnits);
		cmd.addParameter("@PAR_NBRJOBS_LEAV_REPT_METHOD",
				parNbrjobsLeavReptMethod);
		cmd.addParameter("@PAR_NBRJOBS_LCAT_CODE", parNbrjobsLcatCode);
		cmd.addParameter("@PAR_NBRBJOB_ELIGIBLE_DATE", parNbrbjobEligibleDate);
		cmd.addParameter("@PAR_NBRJOBS_PICT_CODE_LEAV_RPT",
				parNbrjobsPictCodeLeavRpt);
		cmd.addParameter("@PAR_COMMENT_DATE", parCommentDate);
		cmd.addParameter("@PAR_COMMENT_USER", parCommentUser);
		cmd.addParameter("@PAR_NOBTRAN_COMMENT", parNobtranComment);
		cmd.addParameter("@PAR_MSG", NString.class);

		cmd.execute();
		parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);

	}

	public static void pProrateAssignSalary(NString pictCode,
			NDate beginDate, NDate endDate, NNumber assignSal,
			Ref<NNumber> proratedAmt) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_PRORATE_ASSIGN_SALARY",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PICT_CODE", pictCode);
		cmd.addParameter("@BEGIN_DATE", beginDate);
		cmd.addParameter("@END_DATE", endDate);
		cmd.addParameter("@ASSIGN_SAL", assignSal);
		cmd.addParameter("@PRORATED_AMT", proratedAmt, true);

		cmd.execute();
		proratedAmt.val = cmd.getParameterValue("@PRORATED_AMT",
				NNumber.class);

	}

	public static void pUpdPerdadj(NNumber parPidm, NString parPosn,
			NString parSuff, NDate parNbrjobsEffectiveDate,
			NNumber parNbrjobsFactor, NNumber parNbrjobsPays,
			NNumber parNbrjobsPerPaySalary,
			NNumber parNbrjobsPerPayDeferAmt, NNumber parAdjPerPaySal,
			NNumber parDeferAccruals, NNumber parAdjPerPayDefer,
			Ref<NString> msg, Ref<NString> msgType,
			NString parSystemCalcInd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKPLIB.P_UPD_PERDADJ", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
		cmd.addParameter("@PAR_NBRJOBS_FACTOR", parNbrjobsFactor);
		cmd.addParameter("@PAR_NBRJOBS_PAYS", parNbrjobsPays);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_SALARY", parNbrjobsPerPaySalary);
		cmd.addParameter("@PAR_NBRJOBS_PER_PAY_DEFER_AMT",
				parNbrjobsPerPayDeferAmt);
		cmd.addParameter("@PAR_ADJ_PER_PAY_SAL", parAdjPerPaySal);
		cmd.addParameter("@PAR_DEFER_ACCRUALS", parDeferAccruals);
		cmd.addParameter("@PAR_ADJ_PER_PAY_DEFER", parAdjPerPayDefer);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);
		cmd.addParameter("@PAR_SYSTEM_CALC_IND", parSystemCalcInd);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pUpdPerjhisEncHrs(NNumber parPidm, NString parPosn,
			NString parSuff, NNumber parEncumHrsPrev,
			NDate parHoldEffHrs, Ref<NString> msg) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKPLIB.P_UPD_PERJHIS_ENC_HRS",
						DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_ENCUM_HRS_PREV", parEncumHrsPrev);
		cmd.addParameter("@PAR_HOLD_EFF_HRS", parHoldEffHrs);
		cmd.addParameter("@MSG", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);

	}

	@DbRecordType(id = "PtrbdplRectypeRow", dataSourceName = "PTRBDPL_RECTYPE")
	public static class PtrbdplRectypeRow {
		@DbRecordField(dataSourceName = "EFF_DATE")
		public NDate EffDate;
		@DbRecordField(dataSourceName = "BDPL_CODE")
		public NString BdplCode;
		@DbRecordField(dataSourceName = "BDPL_DESC")
		public NString BdplDesc;
		@DbRecordField(dataSourceName = "BDPL_AMT1")
		public NNumber BdplAmt1;
		@DbRecordField(dataSourceName = "BDPL_AMT2")
		public NNumber BdplAmt2;
		@DbRecordField(dataSourceName = "BDPL_AMT3")
		public NNumber BdplAmt3;
		@DbRecordField(dataSourceName = "BDPL_AMT4")
		public NNumber BdplAmt4;
	}
}