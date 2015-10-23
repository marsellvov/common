package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbUtil {
		public static NDate FcacheGetDateOfPageCache(NNumber pApplication,NNumber pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CACHE_GET_DATE_OF_PAGE_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FcacheGetDateOfRegionCache(NNumber pApplication,NNumber pPage,NString pRegionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CACHE_GET_DATE_OF_REGION_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void cachePurgeByApplication(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CACHE_PURGE_BY_APPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void cachePurgeByPage(NNumber pApplication,NNumber pPage,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CACHE_PURGE_BY_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void cachePurgeStale(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CACHE_PURGE_STALE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void changeCurrentUserPw(NString pNewPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CHANGE_CURRENT_USER_PW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NEW_PASSWORD", pNewPassword);
				
			cmd.execute();


		}
		
		public static NBool FchangePasswordOnFirstUse(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CHANGE_PASSWORD_ON_FIRST_USE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void clearAppCache(NString pAppId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CLEAR_APP_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APP_ID", pAppId);
				
			cmd.execute();


		}
		
		public static void clearPageCache(NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CLEAR_PAGE_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void clearUserCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CLEAR_USER_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void countClick(NString pUrl,NString pCat,NString pId,NString pUser,NString pCompany,NString pWorkspace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.COUNT_CLICK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_CAT", pCat);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMPANY", pCompany);
			cmd.addParameter("@P_WORKSPACE", pWorkspace);
				
			cmd.execute();


		}
		
		public static void createUser(NNumber pUserId,NString pUserName,NString pFirstName,NString pLastName,NString pDescription,NString pEmailAddress,NString pWebPassword,NString pWebPasswordFormat,NString pGroupIds,NString pDeveloperPrivs,NString pDefaultSchema,NString pAllowAccessToSchemas,NDate pAccountExpiry,NString pAccountLocked,NNumber pFailedAccessAttempts,NString pChangePasswordOnFirstUse,NString pFirstPasswordUseOccurred,NString pAttribute01,NString pAttribute02,NString pAttribute03,NString pAttribute04,NString pAttribute05,NString pAttribute06,NString pAttribute07,NString pAttribute08,NString pAttribute09,NString pAttribute10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CREATE_USER", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CREATE_USER_FROM_FILE", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CREATE_USER_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_GROUP_DESC", pGroupDesc);
				
			cmd.execute();


		}
		
		public static NBool FcurrentUserInGroup(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CURRENT_USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcurrentUserInGroup(NNumber pGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.CURRENT_USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_ID", pGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void dailyCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.DAILY_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
		public static void decrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.DECREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void editUser(NNumber pUserId,NString pUserName,NString pFirstName,NString pLastName,NString pWebPassword,NString pNewPassword,NString pEmailAddress,NString pStartDate,NString pEndDate,NString pEmployeeId,NString pAllowAccessToSchemas,NString pPersonType,NString pDefaultSchema,NString pGroupIds,NString pDeveloperRoles,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EDIT_USER", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
		public static NNumber FendUserAccountDaysLeft(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.END_USER_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void expireEndUserAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void expireWorkspaceAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void exportApplication(NNumber pWorkspaceId,NNumber pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPORT_APPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORKSPACE_ID", pWorkspaceId);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();


		}
		
		public static void exportApplicationComponent(NNumber pWorkspaceId,NNumber pApplicationId,NNumber pComponentId,NString pComponentType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPORT_APPLICATION_COMPONENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORKSPACE_ID", pWorkspaceId);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_COMPONENT_ID", pComponentId);
			cmd.addParameter("@P_COMPONENT_TYPE", pComponentType);
				
			cmd.execute();


		}
		
		public static void exportApplicationPage(NNumber pWorkspaceId,NNumber pApplicationId,NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPORT_APPLICATION_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORKSPACE_ID", pWorkspaceId);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void exportUsers(NString pExportFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.EXPORT_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXPORT_FORMAT", pExportFormat);
				
			cmd.execute();


		}
		
		public static NString fetchAppItem(NString pItem,NNumber pApp,NNumber pSession) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FETCH_APP_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_APP", pApp);
			cmd.addParameter("@P_SESSION", pSession);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fetchUser(NNumber pUserId,Ref<NString> pWorkspace,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pWebPassword,Ref<NString> pEmailAddress,Ref<NString> pStartDate,Ref<NString> pEndDate,Ref<NString> pEmployeeId,Ref<NString> pAllowAccessToSchemas,Ref<NString> pPersonType,Ref<NString> pDefaultSchema,Ref<NString> pGroups,Ref<NString> pDeveloperRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FETCH_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_WORKSPACE", NString.class);
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
			pWorkspace.val = cmd.getParameterValue("@P_WORKSPACE", NString.class);
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
		
		public static void fetchUser(NNumber pUserId,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pEmailAddress,Ref<NString> pGroups,Ref<NString> pDeveloperRole,Ref<NString> pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FETCH_USER", DbManager.getDataBaseFactory());
			
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
		
		public static void fetchUser(NNumber pUserId,Ref<NString> pWorkspace,Ref<NString> pUserName,Ref<NString> pFirstName,Ref<NString> pLastName,Ref<NString> pWebPassword,Ref<NString> pEmailAddress,Ref<NString> pStartDate,Ref<NString> pEndDate,Ref<NString> pEmployeeId,Ref<NString> pAllowAccessToSchemas,Ref<NString> pPersonType,Ref<NString> pDefaultSchema,Ref<NString> pGroups,Ref<NString> pDeveloperRole,Ref<NString> pDescription,Ref<NDate> pAccountExpiry,Ref<NString> pAccountLocked,Ref<NNumber> pFailedAccessAttempts,Ref<NString> pChangePasswordOnFirstUse,Ref<NString> pFirstPasswordUseOccurred) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FETCH_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_WORKSPACE", NString.class);
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
			pWorkspace.val = cmd.getParameterValue("@P_WORKSPACE", NString.class);
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
		
		public static NNumber findSecurityGroupId(NString pWorkspace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FIND_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WORKSPACE", pWorkspace);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString findWorkspace(NString pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FIND_WORKSPACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void flash(NString p,NString fileparams,NString method,NString instance,NString methodname,NString tf,NString setxmldatacall,NString setxmltextcall,NString trialTf,NString instance3,NString xmlcalldate,NString onenterframe,NString j,NString loading,NString waiting) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.FLASH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P", p);
			cmd.addParameter("@FILEPARAMS", fileparams);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@INSTANCE", instance);
			cmd.addParameter("@METHODNAME", methodname);
			cmd.addParameter("@TF", tf);
			cmd.addParameter("@SETXMLDATACALL", setxmldatacall);
			cmd.addParameter("@SETXMLTEXTCALL", setxmltextcall);
			cmd.addParameter("@TRIAL_TF", trialTf);
			cmd.addParameter("@INSTANCE3", instance3);
			cmd.addParameter("@XMLCALLDATE", xmlcalldate);
			cmd.addParameter("@ONENTERFRAME", onenterframe);
			cmd.addParameter("@J", j);
			cmd.addParameter("@LOADING", loading);
			cmd.addParameter("@WAITING", waiting);
				
			cmd.execute();


		}
		
		public static NBool FgetAccountLockedStatus(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_ACCOUNT_LOCKED_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FgetApplicationIdStatus(NNumber pWorkspaceId,NNumber pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_APPLICATION_ID_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WORKSPACE_ID", pWorkspaceId);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetApplicationName(NNumber pWorkspaceId,NNumber pApplicationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_APPLICATION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WORKSPACE_ID", pWorkspaceId);
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAttribute(NString pUsername,NNumber pAttributeNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_ATTRIBUTE_NUMBER", pAttributeNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetAuthenticationResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetCurrentUserId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_CURRENT_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetDefaultSchema() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_DEFAULT_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetEmail(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getFile(NString pFileId,NString pMimeType,NString pInline) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FILE_ID", pFileId);
			cmd.addParameter("@P_MIME_TYPE", pMimeType);
			cmd.addParameter("@P_INLINE", pInline);
				
			cmd.execute();


		}
		
		public static NNumber FgetFileId(NString pFname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_FILE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FNAME", pFname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetFirstName(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_FIRST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetGroupId(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetGroupName(NString pGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_GROUP_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GROUP_ID", pGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetGroupsUserBelongsTo(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_GROUPS_USER_BELONGS_TO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLastName(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_LAST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNumericSessionState(NString pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_NUMERIC_SESSION_STATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetPreference(NString pPreference,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSessionState(NString pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_SESSION_STATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSince(NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_SINCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetUserId(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetUserRoles(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_USER_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUsername(NNumber pUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.GET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USERID", pUserid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void incrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.INCREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool FisLoginPasswordValid(NString pUsername,NString pPassword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.IS_LOGIN_PASSWORD_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PASSWORD", pPassword);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FisUsernameUnique(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.IS_USERNAME_UNIQUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FkeyvalNum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.KEYVAL_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FkeyvalVc2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.KEYVAL_VC2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void lockAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.LOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static NNumber FminimumFreeApplicationId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.MINIMUM_FREE_APPLICATION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void monthCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.MONTH_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
		public static NBool FpasswordFirstUseOccurred(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PASSWORD_FIRST_USE_OCCURRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pause(NNumber pSeconds) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PAUSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SECONDS", pSeconds);
				
			cmd.execute();


		}
		
		public static NString FprepareUrl(NString pUrl,NString pUrlCharset,NString pChecksumType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PREPARE_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_URL_CHARSET", pUrlCharset);
			cmd.addParameter("@P_CHECKSUM_TYPE", pChecksumType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FpublicCheckAuthorization(NString pSecurityScheme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PUBLIC_CHECK_AUTHORIZATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void purgeRegionsByApp(NNumber pApplication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PURGE_REGIONS_BY_APP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
				
			cmd.execute();


		}
		
		public static void purgeRegionsByName(NNumber pApplication,NNumber pPage,NString pRegionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PURGE_REGIONS_BY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
				
			cmd.execute();


		}
		
		public static void purgeRegionsByPage(NNumber pApplication,NNumber pPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.PURGE_REGIONS_BY_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_PAGE", pPage);
				
			cmd.execute();


		}
		
		public static void removePreference(NString pPreference,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.REMOVE_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void removeSortPreferences(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.REMOVE_SORT_PREFERENCES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void removeUser(NNumber pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.REMOVE_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void removeUser(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.REMOVE_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void resetAuthorizations() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.RESET_AUTHORIZATIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetPw(NString pUser,NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.RESET_PW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static NNumber FsavekeyNum(NNumber pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SAVEKEY_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FsavekeyVc2(NString pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SAVEKEY_VC2", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void setAttribute(NNumber pUserid,NNumber pAttributeNumber,NString pAttributeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_ATTRIBUTE_NUMBER", pAttributeNumber);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
				
			cmd.execute();


		}
		
		public static void setAuthenticationResult(NNumber pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();


		}
		
		public static void setCustomAuthStatus(NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_CUSTOM_AUTH_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void setEmail(NNumber pUserid,NString pEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_EMAIL", pEmail);
				
			cmd.execute();


		}
		
		public static void setFirstName(NNumber pUserid,NString pFirstName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_FIRST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
				
			cmd.execute();


		}
		
		public static void setLastName(NNumber pUserid,NString pLastName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_LAST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_LAST_NAME", pLastName);
				
			cmd.execute();


		}
		
		public static void setPreference(NString pPreference,NString pValue,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void setSessionState(NString pName,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_SESSION_STATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void setUsername(NNumber pUserid,NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.SET_USERNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();


		}
		
//		public static List<VcArr2Row> FstringToTable(NString pString,NString pSeparator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.STRING_TO_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<VcArr2Row>.class);
//			cmd.addParameter("@P_STRING", pString);
//			cmd.addParameter("@P_SEPARATOR", pSeparator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<VcArr2Row>.class);
//
//		}
		
//		public static NString FtableToString(List<WwvFlowGlobal.VcArr2Row> pTable,NString pString) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.TABLE_TO_STRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("P_TABLE", "", pTable, object.class));
//			cmd.addParameter("@P_STRING", pString);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void todayCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.TODAY_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unexpireEndUserAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.UNEXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void unexpireWorkspaceAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.UNEXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void unlockAccount(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.UNLOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static NString FurlEncode(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.URL_ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FuserInGroup(NString pGroupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.USER_IN_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void weeklyCalendar(NString pDateTypeField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.WEEKLY_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_TYPE_FIELD", pDateTypeField);
				
			cmd.execute();


		}
		
		public static NNumber FworkspaceAccountDaysLeft(NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_UTIL.WORKSPACE_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
