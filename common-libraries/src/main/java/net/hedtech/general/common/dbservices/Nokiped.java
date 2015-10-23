package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class Nokiped {
	public static NString fCheckNation() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_CHECK_NATION", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fChkJobsIpedsRptInd(NNumber pPidm,
			NString pPosn, NDate pBeginDate, NDate pEndDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_CHK_JOBS_IPEDS_RPT_IND",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_POSN", pPosn);
		cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
		cmd.addParameter("@P_END_DATE", pEndDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fPreSetIped() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_PRE_SET_IPED", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fPtresocDesc(NString pEsocCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_PTRESOC_DESC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_ESOC_CODE", pEsocCode);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fPtvecipDesc(NString pEcipCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_PTVECIP_DESC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_ECIP_CODE", pEcipCode);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fSetIped(NString pPosn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.F_SET_IPED", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_POSN", pPosn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void pEditEcipVsEsoc(NString pEcip, NString pEsoc,
			Ref<NString> pMsgOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.P_EDIT_ECIP_VS_ESOC", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_ECIP", pEcip);
		cmd.addParameter("@P_ESOC", pEsoc);
		cmd.addParameter("@P_MSG_OUT", NString.class);

		cmd.execute();
		pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);

	}

	public static void pEditIpedsReportable(NNumber pPidm, NString pPosn,
			NString pSuff, NDate pBeginDate, NDate pEndDate,
			NNumber pTransNo, NDate pEffectiveDate, NString pExeSource,
			NString pMsgInd, Ref<NString> pIpedsInd,
			Ref<NString> pMsgOut, Ref<NString> pMsgTypeOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.P_EDIT_IPEDS_REPORTABLE",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_POSN", pPosn);
		cmd.addParameter("@P_SUFF", pSuff);
		cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
		cmd.addParameter("@P_END_DATE", pEndDate);
		cmd.addParameter("@P_TRANS_NO", pTransNo);
		cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
		cmd.addParameter("@P_EXE_SOURCE", pExeSource);
		cmd.addParameter("@P_MSG_IND", pMsgInd);
		cmd.addParameter("@P_IPEDS_IND", NString.class);
		cmd.addParameter("@P_MSG_OUT", NString.class);
		cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);

		cmd.execute();
		pIpedsInd.val = cmd.getParameterValue("@P_IPEDS_IND",
				NString.class);
		pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
		pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT",
				NString.class);

	}

	public static void pValidateIpedsReptInd(NString pIpedsReptInd,
			NNumber pPidm, NString pPosn, NDate pBeginDate,
			NDate pEndDate, NString pContractType,
			Ref<NString> pWarningMsgOut,
			Ref<NString> pErrorMsgOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKIPED.P_VALIDATE_IPEDS_REPT_IND",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@P_IPEDS_REPT_IND", pIpedsReptInd);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_POSN", pPosn);
		cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
		cmd.addParameter("@P_END_DATE", pEndDate);
		cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
		cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
		cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);

		cmd.execute();
		pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT",
				NString.class);
		pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT",
				NString.class);

	}
}