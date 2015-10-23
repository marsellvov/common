package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbCustomAuth {
		public static NBool FapplicationPageItemExists(NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.APPLICATION_PAGE_ITEM_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcurrentPageIsPublic() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.CURRENT_PAGE_IS_PUBLIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void defineUserSession(NString pUser,NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.DEFINE_USER_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void getCookieProps(NNumber pAppId,Ref<NString> pCookieName,Ref<NString> pCookiePath,Ref<NString> pCookieDomain) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_COOKIE_PROPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_COOKIE_NAME", NString.class);
			cmd.addParameter("@P_COOKIE_PATH", NString.class);
			cmd.addParameter("@P_COOKIE_DOMAIN", NString.class);
				
			cmd.execute();
			pCookieName.val = cmd.getParameterValue("@P_COOKIE_NAME", NString.class);
			pCookiePath.val = cmd.getParameterValue("@P_COOKIE_PATH", NString.class);
			pCookieDomain.val = cmd.getParameterValue("@P_COOKIE_DOMAIN", NString.class);


		}
		
		public static void getLdapProps(Ref<NString> pLdapHost,Ref<NNumber> pLdapPort,Ref<NString> pLdapDn,Ref<NString> pLdapEditFunction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_LDAP_PROPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LDAP_HOST", NString.class);
			cmd.addParameter("@P_LDAP_PORT", NNumber.class);
			cmd.addParameter("@P_LDAP_DN", NString.class);
			cmd.addParameter("@P_LDAP_EDIT_FUNCTION", NString.class);
				
			cmd.execute();
			pLdapHost.val = cmd.getParameterValue("@P_LDAP_HOST", NString.class);
			pLdapPort.val = cmd.getParameterValue("@P_LDAP_PORT", NNumber.class);
			pLdapDn.val = cmd.getParameterValue("@P_LDAP_DN", NString.class);
			pLdapEditFunction.val = cmd.getParameterValue("@P_LDAP_EDIT_FUNCTION", NString.class);


		}
		
		public static NNumber FgetNextSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_NEXT_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetSecurityGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetSessionIdFromCookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_SESSION_ID_FROM_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUsername() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.GET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FisSessionValid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.IS_SESSION_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FldapAuthenticate(NString pUsername,NString pPassword,NString pLdapHost,NNumber pLdapPort,NString pLdapString,NString pLdapEditFunction,NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LDAP_AUTHENTICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_LDAP_HOST", pLdapHost);
			cmd.addParameter("@P_LDAP_PORT", pLdapPort);
			cmd.addParameter("@P_LDAP_STRING", pLdapString);
			cmd.addParameter("@P_LDAP_EDIT_FUNCTION", pLdapEditFunction);
			cmd.addParameter("@P_OWNER", pOwner);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FldapDnprep(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LDAP_DNPREP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void login(NString pUname,NString pPassword,NString pSessionId,NString pAppPage,NString pEntryPoint,NBool pPreserveCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UNAME", pUname);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_APP_PAGE", pAppPage);
			cmd.addParameter("@P_ENTRY_POINT", pEntryPoint);
			cmd.addParameter("@P_PRESERVE_CASE", pPreserveCase);
				
			cmd.execute();


		}
		
		public static void logout(NString pThisApp,NString pNextAppPageSess,NString pNextUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_THIS_APP", pThisApp);
			cmd.addParameter("@P_NEXT_APP_PAGE_SESS", pNextAppPageSess);
			cmd.addParameter("@P_NEXT_URL", pNextUrl);
				
			cmd.execute();


		}
		
		public static void logoutThenGoToPage(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LOGOUT_THEN_GO_TO_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static void logoutThenGoToUrl(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.LOGOUT_THEN_GO_TO_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static NBool FportalSsoSentryV1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.PORTAL_SSO_SENTRY_V1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void postLogin(NString pUname,NString pSessionId,NString pAppPage,NBool pPreserveCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.POST_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UNAME", pUname);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_APP_PAGE", pAppPage);
			cmd.addParameter("@P_PRESERVE_CASE", pPreserveCase);
				
			cmd.execute();


		}
		
		public static void removeSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.REMOVE_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool FsessionIdExists() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.SESSION_ID_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void setSessionId(NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.SET_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void setSessionIdToNextValue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.SET_SESSION_ID_TO_NEXT_VALUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setUser(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_CUSTOM_AUTH.SET_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
	
	
	
}
