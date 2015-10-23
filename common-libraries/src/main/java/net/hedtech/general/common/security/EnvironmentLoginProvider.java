package net.hedtech.general.common.security;

import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appdatalayer.configuration.AppDataLayerSettings;
import morphis.foundations.core.appdatalayer.configuration.OracleConnectionStringSettings;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.EnvironmentDataSourceFactory;
import morphis.foundations.core.appdatalayer.data.IDataSourceFactory;
import morphis.foundations.core.types.NString;
import net.hedtech.general.common.data.OracleDatabaseFactory;

public class EnvironmentLoginProvider extends DefaultLoginProvider {
	@Override
	public void login() {
		IDataSourceFactory dsFactory = AppDataLayerSettings.getConfig().getDataSourceFactory();
		if (!(dsFactory instanceof EnvironmentDataSourceFactory)) {
			super.login();
			return;
		}

		NString user = getFormModel().getLogin().getUsername();
		NString password = getFormModel().getLogin().getPassword();

		try {
			OracleDatabaseFactory dbFactory = (OracleDatabaseFactory)DbManager.getDataBaseFactory();

			// accessing the user tables is done via the underlying unproxied account
			OracleConnectionStringSettings conSettings = dbFactory.getConnectionSettings(); 
			
			if (!conSettings.isProxiedUser()) {
				// set the proxied user on the first time login when done over an environment datasource provided connection
				conSettings.setProxyInfo(conSettings.getUser(), conSettings.getPassword());
			}
			
			// ensure close the connection is closed either in case of error or before doing the actual login
			DbManager.closeConnection();

			this.login(toStr(user), toStr(password));
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
