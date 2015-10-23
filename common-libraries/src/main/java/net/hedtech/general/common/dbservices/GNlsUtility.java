package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NString;

public class GNlsUtility {
	public static void pSetNls(NString locale){
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_NLS_UTILITY.P_SET_NLS", DbManager.getDataBaseFactory());

		
		cmd.addParameter("@P_LOCALE", locale);

		cmd.execute();
		
	}
}