package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowCustomAuthStd {
		public static void authenticationStatus(NNumber pFlowId,NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.AUTHENTICATION_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void flowchartLogin(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.FLOWCHART_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void flowchartPerpage(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.FLOWCHART_PERPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void getCookieProps(NNumber pFlow,Ref<NString> pCookieName,Ref<NString> pCookiePath,Ref<NString> pCookieDomain) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.GET_COOKIE_PROPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW", pFlow);
			cmd.addParameter("@P_COOKIE_NAME", NString.class);
			cmd.addParameter("@P_COOKIE_PATH", NString.class);
			cmd.addParameter("@P_COOKIE_DOMAIN", NString.class);
				
			cmd.execute();
			pCookieName.val = cmd.getParameterValue("@P_COOKIE_NAME", NString.class);
			pCookiePath.val = cmd.getParameterValue("@P_COOKIE_PATH", NString.class);
			pCookieDomain.val = cmd.getParameterValue("@P_COOKIE_DOMAIN", NString.class);


		}
		
		public static void getLdapProps(Ref<NString> pLdapHost,Ref<NNumber> pLdapPort,Ref<NString> pLdapDn,Ref<NString> pLdapEditFunction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.GET_LDAP_PROPS", DbManager.getDataBaseFactory());
			
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
		
		public static NNumber FgetSessionIdFromCookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.GET_SESSION_ID_FROM_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUsername() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.GET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FisSessionValid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.IS_SESSION_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FldapAuthenticate(NString pUsername,NString pPassword,NString pLdapHost,NNumber pLdapPort,NString pLdapString,NString pLdapEditFunction,NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LDAP_AUTHENTICATE", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LDAP_DNPREP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void login(NString pUname,NString pPassword,NString pSessionId,NString pFlowPage,NString pEntryPoint,NBool pPreserveCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UNAME", pUname);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_FLOW_PAGE", pFlowPage);
			cmd.addParameter("@P_ENTRY_POINT", pEntryPoint);
			cmd.addParameter("@P_PRESERVE_CASE", pPreserveCase);
				
			cmd.execute();


		}
		
		public static void loginPage(NString pFlowPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LOGIN_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_PAGE", pFlowPage);
				
			cmd.execute();


		}
		
		public static void logout(NString pThisFlow,NString pNextFlowPageSess,NString pNextUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_THIS_FLOW", pThisFlow);
			cmd.addParameter("@P_NEXT_FLOW_PAGE_SESS", pNextFlowPageSess);
			cmd.addParameter("@P_NEXT_URL", pNextUrl);
				
			cmd.execute();


		}
		
		public static void logoutThenGoToPage(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LOGOUT_THEN_GO_TO_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static void logoutThenGoToUrl(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.LOGOUT_THEN_GO_TO_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static void mocLogoutThenGoToPageV1(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.MOC_LOGOUT_THEN_GO_TO_PAGE_V1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static void mocLogoutThenGoToUrlV1(NString pArgs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.MOC_LOGOUT_THEN_GO_TO_URL_V1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ARGS", pArgs);
				
			cmd.execute();


		}
		
		public static void mocLogoutV1(NString pThisFlow,NString pNextFlowPageSess,NString pNextUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.MOC_LOGOUT_V1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_THIS_FLOW", pThisFlow);
			cmd.addParameter("@P_NEXT_FLOW_PAGE_SESS", pNextFlowPageSess);
			cmd.addParameter("@P_NEXT_URL", pNextUrl);
				
			cmd.execute();


		}
		
		public static NBool FmocPageSentryV1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.MOC_PAGE_SENTRY_V1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FportalSsoSentryV0() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.PORTAL_SSO_SENTRY_V0", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FportalSsoSentryV1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.PORTAL_SSO_SENTRY_V1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void postLogin(NString pUname,NString pPassword,NString pSessionId,NString pFlowPage,NBool pPreserveCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.POST_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UNAME", pUname);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_FLOW_PAGE", pFlowPage);
			cmd.addParameter("@P_PRESERVE_CASE", pPreserveCase);
				
			cmd.execute();


		}
		
		public static void removeSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_CUSTOM_AUTH_STD.REMOVE_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
