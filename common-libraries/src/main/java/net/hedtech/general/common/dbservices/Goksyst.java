package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NString;

public class Goksyst {
	public static NBool fIsproductinstalled(NString productLitIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKSYST.F_ISPRODUCTINSTALLED", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@PRODUCT_LIT_IN", productLitIn);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}

	public static NBool fIssystemlinkenabled(NString systemCodeIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("GOKSYST.F_ISSYSTEMLINKENABLED",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@SYSTEM_CODE_IN", systemCodeIn);

		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}
}