package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowSecurity {
		public static NBool Fauthenticate(NString pUserName,NString pPassword,NString pCompany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.AUTHENTICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_COMPANY", pCompany);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FauthenticatedSession(NNumber pFlowId,NNumber pSecurityGroupId,NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.AUTHENTICATED_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcheckDbPassword(NString pUserName,NString pPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CHECK_DB_PASSWORD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_PASSWORD", pPassword);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static NString FcheckDbPassword(NString pUsername,NString pPassword) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CHECK_DB_PASSWORD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_USERNAME", pUsername);
//			cmd.addParameter("@P_PASSWORD", pPassword);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NBool FcheckInstanceOwner(NNumber pInstance,NString pMethod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CHECK_INSTANCE_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_INSTANCE", pInstance);
			cmd.addParameter("@P_METHOD", pMethod);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void cookieAuthLogout(NString pCookie) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.COOKIE_AUTH_LOGOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COOKIE", pCookie);
				
			cmd.execute();


		}
		
		public static NNumber FcookieSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.COOKIE_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FcookieUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.COOKIE_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void createFndUser(NNumber pUserId,NNumber pSecurityGroupId,NString pUserName,NString pFirstName,NString pLastName,NString pDescription,NString pEmailAddress,NString pWebPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CREATE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_WEB_PASSWORD", pWebPassword);
				
			cmd.execute();


		}
		
		public static void createNewSession(NNumber pId,NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CREATE_NEW_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();


		}
		
		public static byte[] FcryptoMacMd5(byte[] pStr,byte[] pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CRYPTO_MAC_MD5", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FcryptoRandombytes(NInteger pNumbytes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CRYPTO_RANDOMBYTES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@P_NUMBYTES", pNumbytes);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FcryptoRandombytes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CRYPTO_RANDOMBYTES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber FcryptoRandomnumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CRYPTO_RANDOMNUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool FcurrentCompanyCanBuild(NString pInSchema) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CURRENT_COMPANY_CAN_BUILD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_IN_SCHEMA", pInSchema);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcurrentCompanyCanParse(NString pInSchema) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.CURRENT_COMPANY_CAN_PARSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_IN_SCHEMA", pInSchema);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FdecodeKey(NNumber pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DECODE_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fdecrypt(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DECRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdecrytpWalletPwd(NString pWalletPwd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DECRYTP_WALLET_PWD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WALLET_PWD", pWalletPwd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdetermineCookieAuthUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DETERMINE_COOKIE_AUTH_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FdisableAdminLogin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DISABLE_ADMIN_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FdisableWorkspaceLogin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.DISABLE_WORKSPACE_LOGIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FencodeKey(NNumber pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.ENCODE_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fencrypt(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.ENCRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FencryptWalletPwd(NString pWalletPwd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.ENCRYPT_WALLET_PWD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WALLET_PWD", pWalletPwd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void execCustomAuth() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.EXEC_CUSTOM_AUTH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void execCustomAuthSetups(NString pSetupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.EXEC_CUSTOM_AUTH_SETUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SETUP_ID", pSetupId);
				
			cmd.execute();


		}
		
		public static void execCustom2Auth() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.EXEC_CUSTOM2_AUTH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString findCompanyName(NNumber pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.FIND_COMPANY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString findFirstSchema(NNumber pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.FIND_FIRST_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber findSecurityGroupId(NString pCompany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.FIND_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_COMPANY", pCompany);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString flowOwner(NNumber pFlowId,NNumber pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.FLOW_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getAsfcookie() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_ASFCOOKIE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FgetExpiredUserName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_EXPIRED_USER_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetExpiredUserSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_EXPIRED_USER_SGID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetFlowId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_FLOW_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetFndUserId(NNumber pSecurityGroupId,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_FND_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetHashedSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_HASHED_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetSecurityGroupId(NString pProvisionedSchema) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PROVISIONED_SCHEMA", pProvisionedSchema);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetTranslatedFlowId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.GET_TRANSLATED_FLOW_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FhashSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.HASH_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FinternalPageSentry() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.INTERNAL_PAGE_SENTRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FipCheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.IP_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FprepUrl(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.PREP_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void purgeExpiredUserHeader(NNumber pSession) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.PURGE_EXPIRED_USER_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION", pSession);
				
			cmd.execute();


		}
		
		public static void removeFndUser(NNumber pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.REMOVE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void removeSession(NNumber pSessionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.REMOVE_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
				
			cmd.execute();


		}
		
		public static void resetAppChecksumSalt(NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.RESET_APP_CHECKSUM_SALT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void runFlow(NString pAuthenticationMethod,NString pRunCompany,NNumber pRunFlow,NNumber pRunPage,NString pCredentialsCompany,NString pCredentialsUn,NString pCredentialsPw,NNumber pSession) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.RUN_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AUTHENTICATION_METHOD", pAuthenticationMethod);
			cmd.addParameter("@P_RUN_COMPANY", pRunCompany);
			cmd.addParameter("@P_RUN_FLOW", pRunFlow);
			cmd.addParameter("@P_RUN_PAGE", pRunPage);
			cmd.addParameter("@P_CREDENTIALS_COMPANY", pCredentialsCompany);
			cmd.addParameter("@P_CREDENTIALS_UN", pCredentialsUn);
			cmd.addParameter("@P_CREDENTIALS_PW", pCredentialsPw);
			cmd.addParameter("@P_SESSION", pSession);
				
			cmd.execute();


		}
		
		public static void sessionCookieInfoInternal(Ref<NString> pUser,Ref<NNumber> pSession,Ref<NNumber> pSgid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.SESSION_COOKIE_INFO_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", NString.class);
			cmd.addParameter("@P_SESSION", NNumber.class);
			cmd.addParameter("@P_SGID", NNumber.class);
				
			cmd.execute();
			pUser.val = cmd.getParameterValue("@P_USER", NString.class);
			pSession.val = cmd.getParameterValue("@P_SESSION", NNumber.class);
			pSgid.val = cmd.getParameterValue("@P_SGID", NNumber.class);


		}
		
		public static void showCookie(NString pCookie,NString pValue,NString pMetaRedirectUrl,NString pMessage,NString pUsername,NString pPassword,NString pCompany,NBool pEncrypt,NNumber pSession) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.SHOW_COOKIE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COOKIE", pCookie);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_META_REDIRECT_URL", pMetaRedirectUrl);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_ENCRYPT", pEncrypt);
			cmd.addParameter("@P_SESSION", pSession);
				
			cmd.execute();


		}
		
		public static void strongPasswordCheck(NString pUsername,NString pPassword,NString pOldPassword,NString pWorkspaceName,NBool pUseStrongRules,Ref<NBool> pMinLengthErr,Ref<NBool> pNewDiffersByErr,Ref<NBool> pOneAlphaErr,Ref<NBool> pOneNumericErr,Ref<NBool> pOnePunctuationErr,Ref<NBool> pOneUpperErr,Ref<NBool> pOneLowerErr,Ref<NBool> pNotLikeUsernameErr,Ref<NBool> pNotLikeWorkspaceNameErr,Ref<NBool> pNotLikeWordsErr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.STRONG_PASSWORD_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_OLD_PASSWORD", pOldPassword);
			cmd.addParameter("@P_WORKSPACE_NAME", pWorkspaceName);
			cmd.addParameter("@P_USE_STRONG_RULES", pUseStrongRules);
			cmd.addParameter("@P_MIN_LENGTH_ERR", NBool.class);
			cmd.addParameter("@P_NEW_DIFFERS_BY_ERR", NBool.class);
			cmd.addParameter("@P_ONE_ALPHA_ERR", NBool.class);
			cmd.addParameter("@P_ONE_NUMERIC_ERR", NBool.class);
			cmd.addParameter("@P_ONE_PUNCTUATION_ERR", NBool.class);
			cmd.addParameter("@P_ONE_UPPER_ERR", NBool.class);
			cmd.addParameter("@P_ONE_LOWER_ERR", NBool.class);
			cmd.addParameter("@P_NOT_LIKE_USERNAME_ERR", NBool.class);
			cmd.addParameter("@P_NOT_LIKE_WORKSPACE_NAME_ERR", NBool.class);
			cmd.addParameter("@P_NOT_LIKE_WORDS_ERR", NBool.class);
				
			cmd.execute();
			pMinLengthErr.val = cmd.getParameterValue("@P_MIN_LENGTH_ERR", NBool.class);
			pNewDiffersByErr.val = cmd.getParameterValue("@P_NEW_DIFFERS_BY_ERR", NBool.class);
			pOneAlphaErr.val = cmd.getParameterValue("@P_ONE_ALPHA_ERR", NBool.class);
			pOneNumericErr.val = cmd.getParameterValue("@P_ONE_NUMERIC_ERR", NBool.class);
			pOnePunctuationErr.val = cmd.getParameterValue("@P_ONE_PUNCTUATION_ERR", NBool.class);
			pOneUpperErr.val = cmd.getParameterValue("@P_ONE_UPPER_ERR", NBool.class);
			pOneLowerErr.val = cmd.getParameterValue("@P_ONE_LOWER_ERR", NBool.class);
			pNotLikeUsernameErr.val = cmd.getParameterValue("@P_NOT_LIKE_USERNAME_ERR", NBool.class);
			pNotLikeWorkspaceNameErr.val = cmd.getParameterValue("@P_NOT_LIKE_WORKSPACE_NAME_ERR", NBool.class);
			pNotLikeWordsErr.val = cmd.getParameterValue("@P_NOT_LIKE_WORDS_ERR", NBool.class);


		}
		
		public static NString FstrongPasswordValidation(NString pUsername,NString pPassword,NString pOldPassword,NString pWorkspaceName,NBool pUseStrongRules) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.STRONG_PASSWORD_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_OLD_PASSWORD", pOldPassword);
			cmd.addParameter("@P_WORKSPACE_NAME", pWorkspaceName);
			cmd.addParameter("@P_USE_STRONG_RULES", pUseStrongRules);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void updateFndUser(NNumber pUserId,NNumber pSecurityGroupId,NString pUserName,NString pFirstName,NString pLastName,NString pDescription,NString pEmailAddress,NString pWebPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.UPDATE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_WEB_PASSWORD", pWebPassword);
				
			cmd.execute();


		}
		
		public static NNumber FuserBuilderSessionCompany() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.USER_BUILDER_SESSION_COMPANY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool FuserCanDevelopAnyFlow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.USER_CAN_DEVELOP_ANY_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FuserCanDevelopCurrentFlow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.USER_CAN_DEVELOP_CURRENT_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FuserCanDevelopFlow(NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.USER_CAN_DEVELOP_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FuserIsInternal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.USER_IS_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FverifyNotifyMsgChecksum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.VERIFY_NOTIFY_MSG_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FverifyPrintMsgChecksum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SECURITY.VERIFY_PRINT_MSG_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
