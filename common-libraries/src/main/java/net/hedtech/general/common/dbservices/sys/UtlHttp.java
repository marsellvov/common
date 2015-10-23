package net.hedtech.general.common.dbservices.sys;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NString;

public class UtlHttp {
public static NString getBodyCharset() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTL_HTTP.GET_BODY_CHARSET", DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NString.class);
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
}
