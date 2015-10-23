package net.hedtech.general.common.security;

import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appdatalayer.configuration.AppDataLayerSettings;
import morphis.foundations.core.appdatalayer.configuration.OracleConnectionStringSettings;
import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.EnvironmentDataSourceFactory;
import morphis.foundations.core.appdatalayer.data.IDataSourceFactory;
import morphis.foundations.core.appdatalayer.data.NoDataFoundException;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.commands.CommandDescriptor;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.runtime.web.message.RequestState;
import morphis.foundations.core.util.logging.ILogger;
import morphis.foundations.core.util.logging.LoggerFactory;
import net.hedtech.general.common.data.OracleDatabaseFactory;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;

public abstract class SSOLoginProvider extends DefaultLoginProvider {
	private static ILogger logger = LoggerFactory.getInstance(SSOLoginProvider.class);
	
	private static final String USER_NOT_AUTHENTICATED = "User not authenticated";
	private static final String USER_DETAILS_MISSING = "User details not specified for user: %s";
	private static final String USER_UNKNOWN = "User unknown: %s";
	private static final String USER_INVALID = "User or password invalid - please retry login";
	private static final String USER_LOCKED = "User locked: %s";
	private static final String USER_EXPIRED = "User expired: %s";

	protected String authenticationAssertionAttribute;

	public String getAuthenticationAssertionAttribute() {
		return authenticationAssertionAttribute;
	}

	public void setAuthenticationAssertionAttribute(String authenticationAssertionAttribute) {
		this.authenticationAssertionAttribute = authenticationAssertionAttribute;
	}
	
	@Override
	public void validateAccess() {
		RequestState requestState = InteractionManager.getRequestState();
		SecurityContext context = requestState.getSecurityContext();

		Authentication authenticationToken = context.getAuthentication();
		if (authenticationToken == null || authenticationToken.getPrincipal() == null || authenticationToken instanceof AnonymousAuthenticationToken) {
			loginErrorMessage(USER_NOT_AUTHENTICATED);
			return;
		}

		Object principal = authenticationToken.getPrincipal();

		String userName;
		String password = ""; // proxied user

		// get the user name
		if (principal instanceof UserDetails)
			userName = ((UserDetails)principal).getUsername();
		else
			userName = principal.toString();

		debugLoginAttempt(userName, authenticationToken);
		
		String assertAttributeValue = getAssertAttributeValue(authenticationToken);
		if (assertAttributeValue == null) {
			loginErrorMessage(USER_DETAILS_MISSING, userName);
			return;
		}
		
		String oracleUserName;

		try {
			// ensure connection initialization
			IDataSourceFactory dsFactory = AppDataLayerSettings.getConfig().getDataSourceFactory();
			
			OracleDatabaseFactory dbFactory = (OracleDatabaseFactory)DbManager.getDataBaseFactory();

			// accessing the user tables is done via the underlying unproxied account
			OracleConnectionStringSettings conSettings = dbFactory.getConnectionSettings(); 
			if (!conSettings.isProxiedUser() && dsFactory instanceof EnvironmentDataSourceFactory) {
				// set the proxied user on the first time login when done over an environment datasource provided connection
				conSettings.setProxyInfo(conSettings.getUser(), conSettings.getPassword());
			}
			
			try {
				// 1. fetch the banner admin user properties
				String sql = 
						"SELECT gobeacc_username, gobeacc_pidm FROM gobumap, gobeacc " +
						"WHERE gobumap_pidm = gobeacc_pidm AND gobumap_udc_id = :ASSERT_ATTRIBUTE_VALUE";
				
				DataCommand cmd = new DataCommand(sql);
				cmd.addParameter("ASSERT_ATTRIBUTE_VALUE", assertAttributeValue);
				
				try {
					ResultSet rs = cmd.executeQuery();
					oracleUserName = rs.getString(0);
					rs.close();
				}
				catch (NoDataFoundException e) {
					loginErrorMessage(USER_UNKNOWN, userName);
					return;
				}
				
				// 2. check if the oracle user account is locked
				String accountStatus = "";
				
				String sql1 = "select account_status, lock_date from dba_users where username = :USERNAME";
				
				DataCommand cmd1 = new DataCommand(sql1);
				cmd1.addParameter("USERNAME", oracleUserName);
				
				try {
					ResultSet rs1 = cmd1.executeQuery();
					accountStatus = rs1.getString(0);
					rs1.close();
				}
				catch (NoDataFoundException e) {
				}
				
				if (accountStatus.contains("LOCKED")) {
					loginErrorMessage(USER_LOCKED, userName);
					return;
				}
				else if (accountStatus.contains("EXPIRED")) {
					loginErrorMessage(USER_EXPIRED, userName);
					return;
				}
				GFormClass.SeedNumbersRetrieval.getInstance();
			}
			finally {
				// ensure close the connection is closed either in case of error or before doing the actual login
				DbManager.closeConnection();
			}
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		this.login(toStr(oracleUserName), toStr(password));
		
		logger.debug(this, "User %s[%s] successfully authenticated", userName, oracleUserName);
	}

	@Override
	protected void afterLogin() {
		startApplication();
	}

	@Override
	protected void loginError(Exception ex) {
		logger.error(this, "Authentication exception: %s", ex.getMessage());
		
		loginErrorMessage(USER_INVALID);
	}

	protected void loginErrorMessage(String msg, Object... args) {
		String message = String.format(msg, args);
		
		logger.debug(this, "Authentication error: %s", message);
		
		CommandDescriptor command = this.getWorkspace().getCommandDescriptorFactory().createGenericCommand(getWorkspace(), "SYSTEM_ERROR");
		command.addParameter("kind", "AUTHENTICATION_FAILED");
		command.addParameter("message", message);
		
		this.getWorkspace().addCommand(command);
	}
	
	protected abstract void debugLoginAttempt(String userName, Authentication authentication);
	
	protected abstract String getAssertAttributeValue(Authentication authentication);
}
