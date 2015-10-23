package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class Nokflib {
	public static DataCursor fBudgUserOrgnList(NString userIn,
			NString coasIn, NDate asofdateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKFLIB.F_BUDG_USER_ORGN_LIST",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@USER_IN", userIn);
		cmd.addParameter("@COAS_IN", coasIn);
		cmd.addParameter("@ASOFDATE_IN", asofdateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static NDate fEffDateTime(NDate effDateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_EFF_DATE_TIME", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NDate.class);
		cmd.addParameter("@EFF_DATE_IN", effDateIn);

		cmd.execute();

		return cmd.getReturnValue(NDate.class);

	}

	public static NString fEncumbStatusInd(NString pCoasCode,
			NDate pTransDate, NString pEncumbNum, NNumber pEncumbItem,
			NNumber pEncumbSeqNum) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_ENCUMB_STATUS_IND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_COAS_CODE", pCoasCode);
		cmd.addParameter("@P_TRANS_DATE", pTransDate);
		cmd.addParameter("@P_ENCUMB_NUM", pEncumbNum);
		cmd.addParameter("@P_ENCUMB_ITEM", pEncumbItem);
		cmd.addParameter("@P_ENCUMB_SEQ_NUM", pEncumbSeqNum);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fFiscalPeriodStatusInd(NString pCoasCode,
			NDate pTransDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_FISCAL_PERIOD_STATUS_IND",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_COAS_CODE", pCoasCode);
		cmd.addParameter("@P_TRANS_DATE", pTransDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static DataCursor fGetFtvecls(NString pEclsCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_FTVECLS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_ECLS_CODE", pEclsCode);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static NString fGetInternAtypCode(NString parCoas,
			NString parAcct, NDate parNtd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_INTERN_ATYP_CODE",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_COAS", parCoas);
		cmd.addParameter("@PAR_ACCT", parAcct);
		cmd.addParameter("@PAR_NTD", parNtd);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetOrgnDescNoTermdt(NString orgnIn,
			NString coasIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_ORGN_DESC_NO_TERMDT",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ORGN_IN", orgnIn);
		cmd.addParameter("@COAS_IN", coasIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static DataCursor fGetPredOrgn(NString orgnCodeIn,
			NString coasCodeIn, NDate asofDateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_PRED_ORGN", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
		cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
		cmd.addParameter("@ASOF_DATE_IN", asofDateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static DataCursor fGetSpecfcOrgnList(NString orgnIn,
			NString coasIn, NDate asofdateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_SPECFC_ORGN_LIST",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@ORGN_IN", orgnIn);
		cmd.addParameter("@COAS_IN", coasIn);
		cmd.addParameter("@ASOFDATE_IN", asofdateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static DataCursor fGetSpecfcPredOrgnList(NString orgnPredIn,
			NString coasIn, NDate asofdateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_GET_SPECFC_PRED_ORGN_LIST",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@ORGN_PRED_IN", orgnPredIn);
		cmd.addParameter("@COAS_IN", coasIn);
		cmd.addParameter("@ASOFDATE_IN", asofdateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static DataCursor fGetSuccessorOrgns(NString orgnCodeIn,
			NString orgnLevelStr, NString coasCodeIn, NDate asofDateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKFLIB.F_GET_SUCCESSOR_ORGNS",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
		cmd.addParameter("@ORGN_LEVEL_STR", orgnLevelStr);
		cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
		cmd.addParameter("@ASOF_DATE_IN", asofDateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static DataCursor fHighestLevelOrgnList(NString coasIn,
			NDate asofdateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_HIGHEST_LEVEL_ORGN_LIST",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@COAS_IN", coasIn);
		cmd.addParameter("@ASOFDATE_IN", asofdateIn);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static NString fIsOrgnSuborg(NString orgnCode,
			NString subOrgnCode, NString coasCode, NDate asofDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_IS_ORGN_SUBORG", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ORGN_CODE", orgnCode);
		cmd.addParameter("@SUB_ORGN_CODE", subOrgnCode);
		cmd.addParameter("@COAS_CODE", coasCode);
		cmd.addParameter("@ASOF_DATE", asofDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fIsPredOrgn(NString orgnIn, NString coasIn,
			NDate asofdateIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_IS_PRED_ORGN", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ORGN_IN", orgnIn);
		cmd.addParameter("@COAS_IN", coasIn);
		cmd.addParameter("@ASOFDATE_IN", asofdateIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fOrgnHierOrgnInd(NString checkOrgnCode,
			NString parOrgnCode, NString parCoasCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_ORGN_HIER_ORGN_IND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@CHECK_ORGN_CODE", checkOrgnCode);
		cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fSetRuclLiqInd(NString parFincRuclCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.F_SET_RUCL_LIQ_IND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_FINC_RUCL_CODE", parFincRuclCode);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void pEditCoasCode(NString parCoasCode,
			NDate parEffectiveDate, NString parExeSource,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_COAS_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditCtypCode(NString parCtypCode,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_CTYP_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_CTYP_CODE", parCtypCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEclsFin(NString parEclsCode,
			NString parExeSource, Ref<NString> parEclsDesc,
			Ref<NString> parPictCode,
			Ref<NNumber> parEclsHrsPay,
			Ref<NNumber> parHoldFactor,
			Ref<NString> parEclsEncInd,
			Ref<NString> parWkshCode,
			Ref<NString> parBudgetRollInd,
			Ref<NNumber> parEclsHrsDay, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_ECLS_FIN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_ECLS_DESC", NString.class);
		cmd.addParameter("@PAR_PICT_CODE", NString.class);
		cmd.addParameter("@PAR_ECLS_HRS_PAY", NNumber.class);
		cmd.addParameter("@PAR_HOLD_FACTOR", NNumber.class);
		cmd.addParameter("@PAR_ECLS_ENC_IND", NString.class);
		cmd.addParameter("@PAR_WKSH_CODE", NString.class);
		cmd.addParameter("@PAR_BUDGET_ROLL_IND", NString.class);
		cmd.addParameter("@PAR_ECLS_HRS_DAY", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parEclsDesc.val = cmd.getParameterValue("@PAR_ECLS_DESC",
				NString.class);
		parPictCode.val = cmd.getParameterValue("@PAR_PICT_CODE",
				NString.class);
		parEclsHrsPay.val = cmd.getParameterValue("@PAR_ECLS_HRS_PAY",
				NNumber.class);
		parHoldFactor.val = cmd.getParameterValue("@PAR_HOLD_FACTOR",
				NNumber.class);
		parEclsEncInd.val = cmd.getParameterValue("@PAR_ECLS_ENC_IND",
				NString.class);
		parWkshCode.val = cmd.getParameterValue("@PAR_WKSH_CODE",
				NString.class);
		parBudgetRollInd.val = cmd.getParameterValue(
				"@PAR_BUDGET_ROLL_IND", NString.class);
		parEclsHrsDay.val = cmd.getParameterValue("@PAR_ECLS_HRS_DAY",
				NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditFsyr(NString parNtrfiniFsyrCode,
			NString parNtrfiniCoasCode, Ref<NDate> parFsyrStartDate,
			Ref<NDate> parFsyrEndDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_FSYR", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NTRFINI_FSYR_CODE", parNtrfiniFsyrCode);
		cmd.addParameter("@PAR_NTRFINI_COAS_CODE", parNtrfiniCoasCode);
		cmd.addParameter("@PAR_FSYR_START_DATE", NDate.class);
		cmd.addParameter("@PAR_FSYR_END_DATE", NDate.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parFsyrStartDate.val = cmd.getParameterValue(
				"@PAR_FSYR_START_DATE", NDate.class);
		parFsyrEndDate.val = cmd.getParameterValue("@PAR_FSYR_END_DATE",
				NDate.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditFsyrFisc(NString parNbbfiscFsyrCode,
			NString parNbbfiscCoasCode, Ref<NDate> parFsyrStartDate,
			Ref<NDate> parFsyrEndDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_FSYR_FISC", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_NBBFISC_FSYR_CODE", parNbbfiscFsyrCode);
		cmd.addParameter("@PAR_NBBFISC_COAS_CODE", parNbbfiscCoasCode);
		cmd.addParameter("@PAR_FSYR_START_DATE", NDate.class);
		cmd.addParameter("@PAR_FSYR_END_DATE", NDate.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parFsyrStartDate.val = cmd.getParameterValue(
				"@PAR_FSYR_START_DATE", NDate.class);
		parFsyrEndDate.val = cmd.getParameterValue("@PAR_FSYR_END_DATE",
				NDate.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditObud(NString parObudCode, NString parCoasCode,
			NString parObhpCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_OBUD", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_OBUD_CODE", parObudCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_OBHP_CODE", parObhpCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditOrgnCode(NString parOrgnCode,
			NString parCoasCode, NDate parEffectiveDate,
			NString parExeSource, Ref<NString> parDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_ORGN_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditOrgnCode(NString parOrgnCode,
			NString parExeSource, Ref<NString> parDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_ORGN_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditOrgnCode2(NString parOrgnCode,
			NString parCoasCode, NDate parEffectiveDate,
			NString parExeSource, Ref<NString> parDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_ORGN_CODE2", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_DESC", NString.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditPictFin(NString parEclsCode,
			NString parPictCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_PICT_FIN", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_PICT_CODE", parPictCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditProjCode(NString parProjCode,
			NString parCoasCode, NDate parEffectiveDate,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_PROJ_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PROJ_CODE", parProjCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditRucl(NString parRucl,
			Ref<NString> parRuclDesc, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_EDIT_RUCL", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_RUCL", parRucl);
		cmd.addParameter("@PAR_RUCL_DESC", parRuclDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parRuclDesc.val = cmd.getParameterValue("@PAR_RUCL_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pGetHoldFactorPqF(NString parEclsCode,
			Ref<NNumber> parHoldFactor, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKFLIB.P_GET_HOLD_FACTOR_PQ_F",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_ECLS_CODE", parEclsCode);
		cmd.addParameter("@PAR_HOLD_FACTOR", NNumber.class);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parHoldFactor.val = cmd.getParameterValue("@PAR_HOLD_FACTOR",
				NNumber.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}
}