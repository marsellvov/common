package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NString;

public class Gokvpda {
	public static NBool fIsVpdiCodeValid(NString userIn, NString vpdiCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.F_IS_VPDI_CODE_VALID", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@USER_IN", userIn);
		cmd.addParameter("@VPDI_CODE", vpdiCode);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static NBool fIsVpdiCodeValidAll(NString vpdiCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.F_IS_VPDI_CODE_VALID_ALL",
				DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@VPDI_CODE", vpdiCode);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static void pSetVpdiForJobsDefault() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_FOR_JOBS_DEFAULT",
				DbManager.getDataBaseFactory());

		cmd.execute();

	}

	public static void pSetVpdiForQuery(NString processCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_FOR_QUERY", DbManager.getDataBaseFactory());

		cmd.addParameter("@PROCESS_CODE", processCode);

		cmd.execute();

	}

	public static void pSetVpdiForQueryAll() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_FOR_QUERY_ALL",
				DbManager.getDataBaseFactory());

		cmd.execute();

	}

	public static void pSetVpdiForUpdate(NString homeCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("GOKVPDA.P_SET_VPDI_FOR_UPDATE",
						DbManager.getDataBaseFactory());

		cmd.addParameter("@HOME_CODE", homeCode);

		cmd.execute();

	}

	public static void pSetVpdiMContextOAll() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_M_CONTEXT_O_ALL",
				DbManager.getDataBaseFactory());

		cmd.execute();

	}

	public static void pSetVpdiOffProcessContext() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_OFF_PROCESS_CONTEXT",
				DbManager.getDataBaseFactory());

		cmd.execute();

	}

	public static void pSetVpdiResetAllContext(NString homeCode,
			NString processCode) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKVPDA.P_SET_VPDI_RESET_ALL_CONTEXT",
				DbManager.getDataBaseFactory());

		cmd.addParameter("@HOME_CODE", homeCode);
		cmd.addParameter("@PROCESS_CODE", processCode);

		cmd.execute();

	}
}