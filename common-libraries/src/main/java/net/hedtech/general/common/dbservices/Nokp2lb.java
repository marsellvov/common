package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class Nokp2lb {
	public static NString fAcademicTitleExists(NNumber parPidm,
			NString parPosn, NString parSuff, NString parCoasCode,
			NString parOrgn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.F_ACADEMIC_TITLE_EXISTS",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_ORGN", parOrgn);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetAcademicTitle(NNumber parPidm,
			NString parPosn, NString parSuff, NString parCoasCode,
			NString parOrgn, NDate parEffDate) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.F_GET_ACADEMIC_TITLE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_ORGN", parOrgn);
		cmd.addParameter("@PAR_EFF_DATE", parEffDate);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fGetNobtranComments(NNumber transactionNo) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.F_GET_NOBTRAN_COMMENTS",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@TRANSACTION_NO", transactionNo);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NBool fPtrinstFacInd() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.F_PTRINST_FAC_IND", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static void pDelPersabb(NNumber parTransNo,
			Ref<NString> parMsg, Ref<NString> parMsgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.P_DEL_PERSABB", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_TRANS_NO", parTransNo);
		cmd.addParameter("@PAR_MSG", NString.class);
		cmd.addParameter("@PAR_MSG_TYPE", NString.class);

		cmd.execute();
		parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);
		parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE",
				NString.class);

	}

	public static void pEditBargCode(NString parBargCode,
			NString parExeSource, Ref<NString> parBargDesc,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.P_EDIT_BARG_CODE", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_BARG_CODE", parBargCode);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@PAR_BARG_DESC", parBargDesc, true);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		parBargDesc.val = cmd.getParameterValue("@PAR_BARG_DESC",
				NString.class);
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pEditLoa(NDate parPebemplLoaBegDate,
			NDate parPebemplLoaEndDate, NString parPebemplLreaCode,
			NString parPebemplStatus, NNumber parPidm,
			NNumber parTransNo, NString parExeSource,
			Ref<NString> msg, Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.P_EDIT_LOA", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PEBEMPL_LOA_BEG_DATE", parPebemplLoaBegDate);
		cmd.addParameter("@PAR_PEBEMPL_LOA_END_DATE", parPebemplLoaEndDate);
		cmd.addParameter("@PAR_PEBEMPL_LREA_CODE", parPebemplLreaCode);
		cmd.addParameter("@PAR_PEBEMPL_STATUS", parPebemplStatus);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_TRANS_NO", parTransNo);
		cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}

	public static void pUpdPersabbDecision(NNumber parPidm,
			Ref<NString> parMsg, Ref<NString> parMsgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.P_UPD_PERSABB_DECISION",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_MSG", NString.class);
		cmd.addParameter("@PAR_MSG_TYPE", NString.class);

		cmd.execute();
		parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);
		parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE",
				NString.class);

	}

	public static void pUpdPersabbTrans(NNumber parTransNo,
			NString parActionDate, NNumber parPidm, NString parOrgnCode,
			NString parCoasCode, NString parPosn, NString parSuff,
			Ref<NString> parMsg, Ref<NString> parMsgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKP2LB.P_UPD_PERSABB_TRANS", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_TRANS_NO", parTransNo);
		cmd.addParameter("@PAR_ACTION_DATE", parActionDate);
		cmd.addParameter("@PAR_PIDM", parPidm);
		cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
		cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
		cmd.addParameter("@PAR_POSN", parPosn);
		cmd.addParameter("@PAR_SUFF", parSuff);
		cmd.addParameter("@PAR_MSG", NString.class);
		cmd.addParameter("@PAR_MSG_TYPE", NString.class);

		cmd.execute();
		parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);
		parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE",
				NString.class);

	}
}