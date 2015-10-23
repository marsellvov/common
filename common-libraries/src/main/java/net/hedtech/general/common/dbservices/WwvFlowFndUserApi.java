package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowFndUserApi {
		public static void changeCurrentUserPw(NString pNewPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CHANGE_CURRENT_USER_PW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NEW_PASSWORD", pNewPassword);
				
			cmd.execute();


		}
		
		public static NBool FchangePasswordOnFirstUse(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CHANGE_PASSWORD_ON_FIRST_USE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void createCompany(NNumber pId,NNumber pProvisioningCompanyId,NString pShortName,NString pFirstSchemaProvisioned,NString pCompanySchemas,NString pExpireFndUserAccounts,NNumber pAccountLifetimeDays,NNumber pFndUserMaxLoginFailures) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CREATE_COMPANY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PROVISIONING_COMPANY_ID", pProvisioningCompanyId);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_FIRST_SCHEMA_PROVISIONED", pFirstSchemaProvisioned);
			cmd.addParameter("@P_COMPANY_SCHEMAS", pCompanySchemas);
			cmd.addParameter("@P_EXPIRE_FND_USER_ACCOUNTS", pExpireFndUserAccounts);
			cmd.addParameter("@P_ACCOUNT_LIFETIME_DAYS", pAccountLifetimeDays);
			cmd.addParameter("@P_FND_USER_MAX_LOGIN_FAILURES", pFndUserMaxLoginFailures);
				
			cmd.execute();


		}
		
		public static void createFndUser(NNumber pUserId,NString pUserName,NString pFirstName,NString pLastName,NString pDescription,NString pEmailAddress,NString pWebPassword,NString pWebPasswordFormat,NString pGroupIds,NString pDeveloperPrivs,NString pDefaultSchema,NString pAllowAccessToSchemas,NDate pAccountExpiry,NString pAccountLocked,NNumber pFailedAccessAttempts,NString pChangePasswordOnFirstUse,NString pFirstPasswordUseOccurred,NString pAttribute01,NString pAttribute02,NString pAttribute03,NString pAttribute04,NString pAttribute05,NString pAttribute06,NString pAttribute07,NString pAttribute08,NString pAttribute09,NString pAttribute10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CREATE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_WEB_PASSWORD", pWebPassword);
			cmd.addParameter("@P_WEB_PASSWORD_FORMAT", pWebPasswordFormat);
			cmd.addParameter("@P_GROUP_IDS", pGroupIds);
			cmd.addParameter("@P_DEVELOPER_PRIVS", pDeveloperPrivs);
			cmd.addParameter("@P_DEFAULT_SCHEMA", pDefaultSchema);
			cmd.addParameter("@P_ALLOW_ACCESS_TO_SCHEMAS", pAllowAccessToSchemas);
			cmd.addParameter("@P_ACCOUNT_EXPIRY", pAccountExpiry);
			cmd.addParameter("@P_ACCOUNT_LOCKED", pAccountLocked);
			cmd.addParameter("@P_FAILED_ACCESS_ATTEMPTS", pFailedAccessAttempts);
			cmd.addParameter("@P_CHANGE_PASSWORD_ON_FIRST_USE", pChangePasswordOnFirstUse);
			cmd.addParameter("@P_FIRST_PASSWORD_USE_OCCURRED", pFirstPasswordUseOccurred);
			cmd.addParameter("@P_ATTRIBUTE_01", pAttribute01);
			cmd.addParameter("@P_ATTRIBUTE_02", pAttribute02);
			cmd.addParameter("@P_ATTRIBUTE_03", pAttribute03);
			cmd.addParameter("@P_ATTRIBUTE_04", pAttribute04);
			cmd.addParameter("@P_ATTRIBUTE_05", pAttribute05);
			cmd.addParameter("@P_ATTRIBUTE_06", pAttribute06);
			cmd.addParameter("@P_ATTRIBUTE_07", pAttribute07);
			cmd.addParameter("@P_ATTRIBUTE_08", pAttribute08);
			cmd.addParameter("@P_ATTRIBUTE_09", pAttribute09);
			cmd.addParameter("@P_ATTRIBUTE_10", pAttribute10);
				
			cmd.execute();


		}
		
		public static void createUserFromFile(NNumber pId,NString pMode,NString pFormat,NString pPassword,NString pApp,NString pAppurl,Ref<NString> pStart,Ref<NString> pEnd,Ref<NString> pLoaded) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CREATE_USER_FROM_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_APP", pApp);
			cmd.addParameter("@P_APPURL", pAppurl);
			cmd.addParameter("@P_START", NString.class);
			cmd.addParameter("@P_END", NString.class);
			cmd.addParameter("@P_LOADED", NString.class);
				
			cmd.execute();
			pStart.val = cmd.getParameterValue("@P_START", NString.class);
			pEnd.val = cmd.getParameterValue("@P_END", NString.class);
			pLoaded.val = cmd.getParameterValue("@P_LOADED", NString.class);


		}
		
		public static void createUserGroup(NNumber pId,NString pGroupName,NNumber pSecurityGroupId,NString pGroupDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.CREATE_USER_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_GROUP_DESC", pGroupDesc);
				
			cmd.execute();


		}
		
		public static void editFndUser(NNumber pUserId,NString pUserName,NString pFirstName,NString pLastName,NString pWebPassword,NString pNewPassword,NString pEmailAddress,NString pStartDate,NString pEndDate,NString pEmployeeId,NString pAllowAccessToSchemas,NString pPersonType,NString pDefaultSchema,NString pGroupIds,NString pDeveloperRoles,NString pDescription,NDate pAccountExpiry,NString pAccountLocked,NNumber pFailedAccessAttempts,NString pChangePasswordOnFirstUse,NString pFirstPasswordUseOccurred) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.EDIT_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_WEB_PASSWORD", pWebPassword);
			cmd.addParameter("@P_NEW_PASSWORD", pNewPassword);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_EMPLOYEE_ID", pEmployeeId);
			cmd.addParameter("@P_ALLOW_ACCESS_TO_SCHEMAS", pAllowAccessToSchemas);
			cmd.addParameter("@P_PERSON_TYPE", pPersonType);
			cmd.addParameter("@P_DEFAULT_SCHEMA", pDefaultSchema);
			cmd.addParameter("@P_GROUP_IDS", pGroupIds);
			cmd.addParameter("@P_DEVELOPER_ROLES", pDeveloperRoles);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_ACCOUNT_EXPIRY", pAccountExpiry);
			cmd.addParameter("@P_ACCOUNT_LOCKED", pAccountLocked);
			cmd.addParameter("@P_FAILED_ACCESS_ATTEMPTS", pFailedAccessAttempts);
			cmd.addParameter("@P_CHANGE_PASSWORD_ON_FIRST_USE", pChangePasswordOnFirstUse);
			cmd.addParameter("@P_FIRST_PASSWORD_USE_OCCURRED", pFirstPasswordUseOccurred);
				
			cmd.execute();


		}
		
		public static NNumber FendUserAccountDaysLeft(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.END_USER_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void expireEndUserAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.EXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void expireWorkspaceAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.EXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void exportFndUsers(NString pExportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.EXPORT_FND_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXPORT_FORMAT", pExportFormat);
				
			cmd.execute();


		}
		
		public static void fetchFndUser(NNumber pUserId,Ref<NString> pCompany,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pWebPassword,Ref<NString> pEmailAddress,Ref<NString> pStartDate,Ref<NString> pEndDate,Ref<NString> pEmployeeId,Ref<NString> pAllowAccessToSchemas,Ref<NString> pPersonType,Ref<NString> pDefaultSchema,Ref<NString> pGroups,Ref<NString> pDeveloperRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.FETCH_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMPANY", NString.class);
			cmd.addParameter("@P_USER_NAME", NString.class);
			cmd.addParameter("@P_FIRST_NAME", NString.class);
			cmd.addParameter("@P_LAST_NAME", NString.class);
			cmd.addParameter("@P_WEB_PASSWORD", NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS", NString.class);
			cmd.addParameter("@P_START_DATE", NString.class);
			cmd.addParameter("@P_END_DATE", NString.class);
			cmd.addParameter("@P_EMPLOYEE_ID", NString.class);
			cmd.addParameter("@P_ALLOW_ACCESS_TO_SCHEMAS", NString.class);
			cmd.addParameter("@P_PERSON_TYPE", NString.class);
			cmd.addParameter("@P_DEFAULT_SCHEMA", NString.class);
			cmd.addParameter("@P_GROUPS", NString.class);
			cmd.addParameter("@P_DEVELOPER_ROLE", NString.class);
				
			cmd.execute();
			pCompany.val = cmd.getParameterValue("@P_COMPANY", NString.class);
			pUserName.val = cmd.getParameterValue("@P_USER_NAME", NString.class);
			pFirstName.val = cmd.getParameterValue("@P_FIRST_NAME", NString.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pWebPassword.val = cmd.getParameterValue("@P_WEB_PASSWORD", NString.class);
			pEmailAddress.val = cmd.getParameterValue("@P_EMAIL_ADDRESS", NString.class);
			pStartDate.val = cmd.getParameterValue("@P_START_DATE", NString.class);
			pEndDate.val = cmd.getParameterValue("@P_END_DATE", NString.class);
			pEmployeeId.val = cmd.getParameterValue("@P_EMPLOYEE_ID", NString.class);
			pAllowAccessToSchemas.val = cmd.getParameterValue("@P_ALLOW_ACCESS_TO_SCHEMAS", NString.class);
			pPersonType.val = cmd.getParameterValue("@P_PERSON_TYPE", NString.class);
			pDefaultSchema.val = cmd.getParameterValue("@P_DEFAULT_SCHEMA", NString.class);
			pGroups.val = cmd.getParameterValue("@P_GROUPS", NString.class);
			pDeveloperRole.val = cmd.getParameterValue("@P_DEVELOPER_ROLE", NString.class);


		}
		
		public static void fetchFndUser(NNumber pUserId,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pEmailAddress,Ref<NString> pGroups,Ref<NString> pDeveloperRole,Ref<NString> pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.FETCH_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_NAME", NString.class);
			cmd.addParameter("@P_FIRST_NAME", NString.class);
			cmd.addParameter("@P_LAST_NAME", NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS", NString.class);
			cmd.addParameter("@P_GROUPS", NString.class);
			cmd.addParameter("@P_DEVELOPER_ROLE", NString.class);
			cmd.addParameter("@P_DESCRIPTION", NString.class);
				
			cmd.execute();
			pUserName.val = cmd.getParameterValue("@P_USER_NAME", NString.class);
			pFirstName.val = cmd.getParameterValue("@P_FIRST_NAME", NString.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pEmailAddress.val = cmd.getParameterValue("@P_EMAIL_ADDRESS", NString.class);
			pGroups.val = cmd.getParameterValue("@P_GROUPS", NString.class);
			pDeveloperRole.val = cmd.getParameterValue("@P_DEVELOPER_ROLE", NString.class);
			pDescription.val = cmd.getParameterValue("@P_DESCRIPTION", NString.class);


		}
		
		public static void fetchFndUser(NNumber pUserId,Ref<NString> pCompany,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pWebPassword,Ref<NString> pEmailAddress,Ref<NString> pStartDate,Ref<NString> pEndDate,Ref<NString> pEmployeeId,Ref<NString> pAllowAccessToSchemas,Ref<NString> pPersonType,Ref<NString> pDefaultSchema,Ref<NString> pGroups,Ref<NString> pDeveloperRole,Ref<NString> pDescription,Ref<NDate> pAccountExpiry,Ref<NString> pAccountLocked,Ref<NNumber> pFailedAccessAttempts,Ref<NString> pChangePasswordOnFirstUse,Ref<NString> pFirstPasswordUseOccurred) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.FETCH_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMPANY", NString.class);
			cmd.addParameter("@P_USER_NAME", NString.class);
			cmd.addParameter("@P_FIRST_NAME", NString.class);
			cmd.addParameter("@P_LAST_NAME", NString.class);
			cmd.addParameter("@P_WEB_PASSWORD", NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS", NString.class);
			cmd.addParameter("@P_START_DATE", NString.class);
			cmd.addParameter("@P_END_DATE", NString.class);
			cmd.addParameter("@P_EMPLOYEE_ID", NString.class);
			cmd.addParameter("@P_ALLOW_ACCESS_TO_SCHEMAS", NString.class);
			cmd.addParameter("@P_PERSON_TYPE", NString.class);
			cmd.addParameter("@P_DEFAULT_SCHEMA", NString.class);
			cmd.addParameter("@P_GROUPS", NString.class);
			cmd.addParameter("@P_DEVELOPER_ROLE", NString.class);
			cmd.addParameter("@P_DESCRIPTION", NString.class);
			cmd.addParameter("@P_ACCOUNT_EXPIRY", NDate.class);
			cmd.addParameter("@P_ACCOUNT_LOCKED", NString.class);
			cmd.addParameter("@P_FAILED_ACCESS_ATTEMPTS", NNumber.class);
			cmd.addParameter("@P_CHANGE_PASSWORD_ON_FIRST_USE", NString.class);
			cmd.addParameter("@P_FIRST_PASSWORD_USE_OCCURRED", NString.class);
				
			cmd.execute();
			pCompany.val = cmd.getParameterValue("@P_COMPANY", NString.class);
			pUserName.val = cmd.getParameterValue("@P_USER_NAME", NString.class);
			pFirstName.val = cmd.getParameterValue("@P_FIRST_NAME", NString.class);
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pWebPassword.val = cmd.getParameterValue("@P_WEB_PASSWORD", NString.class);
			pEmailAddress.val = cmd.getParameterValue("@P_EMAIL_ADDRESS", NString.class);
			pStartDate.val = cmd.getParameterValue("@P_START_DATE", NString.class);
			pEndDate.val = cmd.getParameterValue("@P_END_DATE", NString.class);
			pEmployeeId.val = cmd.getParameterValue("@P_EMPLOYEE_ID", NString.class);
			pAllowAccessToSchemas.val = cmd.getParameterValue("@P_ALLOW_ACCESS_TO_SCHEMAS", NString.class);
			pPersonType.val = cmd.getParameterValue("@P_PERSON_TYPE", NString.class);
			pDefaultSchema.val = cmd.getParameterValue("@P_DEFAULT_SCHEMA", NString.class);
			pGroups.val = cmd.getParameterValue("@P_GROUPS", NString.class);
			pDeveloperRole.val = cmd.getParameterValue("@P_DEVELOPER_ROLE", NString.class);
			pDescription.val = cmd.getParameterValue("@P_DESCRIPTION", NString.class);
			pAccountExpiry.val = cmd.getParameterValue("@P_ACCOUNT_EXPIRY", NDate.class);
			pAccountLocked.val = cmd.getParameterValue("@P_ACCOUNT_LOCKED", NString.class);
			pFailedAccessAttempts.val = cmd.getParameterValue("@P_FAILED_ACCESS_ATTEMPTS", NNumber.class);
			pChangePasswordOnFirstUse.val = cmd.getParameterValue("@P_CHANGE_PASSWORD_ON_FIRST_USE", NString.class);
			pFirstPasswordUseOccurred.val = cmd.getParameterValue("@P_FIRST_PASSWORD_USE_OCCURRED", NString.class);


		}
		
		public static NString findCompany(NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.FIND_COMPANY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber findSecurityGroupId(NString pCompany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.FIND_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_COMPANY", pCompany);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool FgetAccountLockedStatus(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.GET_ACCOUNT_LOCKED_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FgetAuthenticationResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.GET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUserRoles(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.GET_USER_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void lockAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.LOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static NBool FpasswordFirstUseOccurred(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.PASSWORD_FIRST_USE_OCCURRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void removeFndUser(NNumber pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.REMOVE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void removeFndUser(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.REMOVE_FND_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void resetPw(NString pUser,NString pSecurityGroupId,NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.RESET_PW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void setAuthenticationResult(NNumber pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.SET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();


		}
		
		public static void setCustomAuthStatus(NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.SET_CUSTOM_AUTH_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void unexpireEndUserAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.UNEXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void unexpireWorkspaceAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.UNEXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void unlockAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.UNLOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static NBool FuserInGroup(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FworkspaceAccountDaysLeft(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_FND_USER_API.WORKSPACE_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
