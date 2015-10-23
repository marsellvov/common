package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class Noksecr {
	public static NString fEmprSecurity(NString userId,
			NString parmEmprCode, NString instEmprInd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.F_EMPR_SECURITY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@USER_ID", userId);
		cmd.addParameter("@PARM_EMPR_CODE", parmEmprCode);
		cmd.addParameter("@INST_EMPR_IND", instEmprInd);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fHrSecurity(NString id) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.F_HR_SECURITY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ID", id);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fHrSecurity(NString id, NString posn,
			NString suff) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.F_HR_SECURITY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ID", id);
		cmd.addParameter("@POSN", posn);
		cmd.addParameter("@SUFF", suff);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fHrSecurityWte(NString orgnCodeIn,
			NString coasCodeIn, NString eclsCodeIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.F_HR_SECURITY_WTE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
		cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
		cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fSalaSecurity(NString userId,
			NNumber parmSalary, NString instSalaInd) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.F_SALA_SECURITY", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@USER_ID", userId);
		cmd.addParameter("@PARM_SALARY", parmSalary);
		cmd.addParameter("@INST_SALA_IND", instSalaInd);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fTimeEntrySecurity(NString userIdIn,
			NString coasCodeIn, NString orgnCodeIn, NString eclsCodeIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKSECR.F_TIME_ENTRY_SECURITY",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@USER_ID_IN", userIdIn);
		cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
		cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
		cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void pCheckSecurity(NString userIdIn, NNumber pidmIn,
			NString eclsCodeIn, NString coasCodeIn, NString orgnCodeIn,
			NString emprCodeIn, Ref<NString> returnCodeOut,
			Ref<NString> returnTextOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_CHECK_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@USER_ID_IN", userIdIn);
		cmd.addParameter("@PIDM_IN", pidmIn);
		cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
		cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
		cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
		cmd.addParameter("@EMPR_CODE_IN", emprCodeIn);
		cmd.addParameter("@RETURN_CODE_OUT", NString.class);
		cmd.addParameter("@RETURN_TEXT_OUT", NString.class);

		cmd.execute();
		returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT",
				NString.class);
		returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT",
				NString.class);

	}

	public static void pCheckSecurity(NString pUserId, NNumber pPidm,
			NString pEmprCode, Ref<NString> pReturnCodeOut,
			Ref<NString> pReturnTextOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_CHECK_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_EMPR_CODE", pEmprCode);
		cmd.addParameter("@P_RETURN_CODE_OUT", NString.class);
		cmd.addParameter("@P_RETURN_TEXT_OUT", NString.class);

		cmd.execute();
		pReturnCodeOut.val = cmd.getParameterValue("@P_RETURN_CODE_OUT",
				NString.class);
		pReturnTextOut.val = cmd.getParameterValue("@P_RETURN_TEXT_OUT",
				NString.class);

	}

	public static void pDoSecurity(NNumber parPidm, NString parEmprCode,
			NString parGlobalSalaSecurityInd,
			NString parGlobalEclsSecurityInd,
			NString parGlobalOrgnSecurityInd,
			NString parGlobalEmprSecurityInd, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_DO_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_EMPR_CODE", parEmprCode);
		cmd.addParameter("@PAR_GLOBAL_SALA_SECURITY_IND",
				parGlobalSalaSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_ECLS_SECURITY_IND",
				parGlobalEclsSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_ORGN_SECURITY_IND",
				parGlobalOrgnSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_EMPR_SECURITY_IND",
				parGlobalEmprSecurityInd);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pDoSecurityTsOrgn(NNumber parPidm,
			NString parEmprCode, NString parGlobalSalaSecurityInd,
			NString parGlobalEclsSecurityInd,
			NString parGlobalOrgnSecurityInd,
			NString parGlobalEmprSecurityInd, NString parTsOrgn,
			NString parTsOrgnMulty, NString parPosn, NString parSuff,
			NDate parDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("NOKSECR.P_DO_SECURITY_TS_ORGN",
						DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_EMPR_CODE", parEmprCode);
		cmd.addParameter("@PAR_GLOBAL_SALA_SECURITY_IND",
				parGlobalSalaSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_ECLS_SECURITY_IND",
				parGlobalEclsSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_ORGN_SECURITY_IND",
				parGlobalOrgnSecurityInd);
		cmd.addParameter("@PAR_GLOBAL_EMPR_SECURITY_IND",
				parGlobalEmprSecurityInd);
		cmd.addParameter("@PAR_TS_ORGN", parTsOrgn);
		cmd.addParameter("@PAR_TS_ORGN_MULTY", parTsOrgnMulty);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_DATE", parDate);
		cmd.addParameter("@MSG", msg, true);
		cmd.addParameter("@MSG_TYPE", msgType, true);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEclsSecurity(NString parSecurityEclsCode,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_EDIT_ECLS_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_SECURITY_ECLS_CODE", parSecurityEclsCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditEmprSecurity(NString parEmprCode,
			NNumber parPidm, NString parPosn, NString parSuff,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_EDIT_EMPR_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_EMPR_CODE", parEmprCode);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditOrgnSecurity(NString parSecurityOrgnCode,
			NString parSecurityCoasCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_EDIT_ORGN_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_SECURITY_ORGN_CODE", parSecurityOrgnCode);
		cmd.addParameter("@PAR_SECURITY_COAS_CODE", parSecurityCoasCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditSalaSecurity(NNumber parSecuritySalary,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_EDIT_SALA_SECURITY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_SECURITY_SALARY", parSecuritySalary);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pValidateTsOrgnSecurity(NNumber parPidm,
			NString parPosn, NString parSuff, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_VALIDATE_TS_ORGN_SECURITY",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@MSG", msg, true);
		cmd.addParameter("@MSG_TYPE", msgType, true);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pValidateTsOrgnSecurityMl(NNumber parPidm,
			NDate parDate, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKSECR.P_VALIDATE_TS_ORGN_SECURITY_ML",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_DATE", parDate);
		cmd.addParameter("@MSG", msg, true);
		cmd.addParameter("@MSG_TYPE", msgType, true);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}
}