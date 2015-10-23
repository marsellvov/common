package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexCustomAuth {
		public static void applicationPageItemExists() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.APPLICATION_PAGE_ITEM_EXISTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void currentPageIsPublic() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.CURRENT_PAGE_IS_PUBLIC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void defineUserSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.DEFINE_USER_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCookieProps() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_COOKIE_PROPS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getLdapProps() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_LDAP_PROPS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNextSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_NEXT_SESSION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSecurityGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_SESSION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSessionIdFromCookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_SESSION_ID_FROM_COOKIE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUsername() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.GET_USERNAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isSessionValid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.IS_SESSION_VALID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void ldapAuthenticate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LDAP_AUTHENTICATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void ldapDnprep() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LDAP_DNPREP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void login() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LOGIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void logout() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LOGOUT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void logoutThenGoToPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LOGOUT_THEN_GO_TO_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void logoutThenGoToUrl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.LOGOUT_THEN_GO_TO_URL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void portalSsoSentryV1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.PORTAL_SSO_SENTRY_V1", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void postLogin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.POST_LOGIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.REMOVE_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void sessionIdExists() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.SESSION_ID_EXISTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.SET_SESSION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setSessionIdToNextValue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.SET_SESSION_ID_TO_NEXT_VALUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_CUSTOM_AUTH.SET_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
