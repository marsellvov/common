package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;

public class DbmsSession {

	public static void setNls(String param, NString value) {
		setNls(Types.toStr(param), value);
	}

	public static void setNls(NString param, NString value) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SESSION.SET_NLS", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@PARAM", param);
		cmd.addParameter("@VALUE", value);
			
		cmd.execute();
	}
}
