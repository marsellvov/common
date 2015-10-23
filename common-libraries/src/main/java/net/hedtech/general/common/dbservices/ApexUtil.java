package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class ApexUtil {
		public static void cacheGetDateOfPageCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CACHE_GET_DATE_OF_PAGE_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void cacheGetDateOfRegionCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CACHE_GET_DATE_OF_REGION_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void cachePurgeByApplication() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CACHE_PURGE_BY_APPLICATION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void cachePurgeByPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CACHE_PURGE_BY_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void cachePurgeStale() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CACHE_PURGE_STALE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void changeCurrentUserPw() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CHANGE_CURRENT_USER_PW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void changePasswordOnFirstUse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CHANGE_PASSWORD_ON_FIRST_USE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearAppCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CLEAR_APP_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearPageCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CLEAR_PAGE_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearUserCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CLEAR_USER_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void countClick() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.COUNT_CLICK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CREATE_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createUserFromFile() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CREATE_USER_FROM_FILE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createUserGroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CREATE_USER_GROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void currentUserInGroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.CURRENT_USER_IN_GROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dailyCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.DAILY_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void decrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.DECREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void editUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EDIT_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void endUserAccountDaysLeft() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.END_USER_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void expireEndUserAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void expireWorkspaceAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportApplication() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPORT_APPLICATION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportApplicationComponent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPORT_APPLICATION_COMPONENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportApplicationPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPORT_APPLICATION_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportUsers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.EXPORT_USERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchAppItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.FETCH_APP_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.FETCH_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		
		public static void findSecurityGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.FIND_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void findWorkspace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.FIND_WORKSPACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void flash() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.FLASH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getAccountLockedStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_ACCOUNT_LOCKED_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getApplicationIdStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_APPLICATION_ID_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getApplicationName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_APPLICATION_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getAuthenticationResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCurrentUserId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_CURRENT_USER_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getDefaultSchema() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_DEFAULT_SCHEMA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getEmail() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_EMAIL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getFile() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_FILE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getFileId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_FILE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getFirstName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_FIRST_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_GROUP_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getGroupName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_GROUP_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getGroupsUserBelongsTo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_GROUPS_USER_BELONGS_TO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getLastName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_LAST_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNumericSessionState() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_NUMERIC_SESSION_STATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getPreference() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_PREFERENCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSessionState() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_SESSION_STATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSince() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_SINCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUserId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_USER_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUserRoles() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_USER_ROLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUsername() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.GET_USERNAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void incrementCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.INCREMENT_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isLoginPasswordValid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.IS_LOGIN_PASSWORD_VALID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isUsernameUnique() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.IS_USERNAME_UNIQUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void keyvalNum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.KEYVAL_NUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void keyvalVc2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.KEYVAL_VC2", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void lockAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.LOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void minimumFreeApplicationId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.MINIMUM_FREE_APPLICATION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void monthCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.MONTH_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void passwordFirstUseOccurred() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PASSWORD_FIRST_USE_OCCURRED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pause() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PAUSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void prepareUrl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PREPARE_URL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void publicCheckAuthorization() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PUBLIC_CHECK_AUTHORIZATION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void purgeRegionsByApp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PURGE_REGIONS_BY_APP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void purgeRegionsByName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PURGE_REGIONS_BY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void purgeRegionsByPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.PURGE_REGIONS_BY_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removePreference() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.REMOVE_PREFERENCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeSortPreferences() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.REMOVE_SORT_PREFERENCES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void removeUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.REMOVE_USER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetAuthorizations() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.RESET_AUTHORIZATIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetPw() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.RESET_PW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void savekeyNum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SAVEKEY_NUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void savekeyVc2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SAVEKEY_VC2", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setAuthenticationResult() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_AUTHENTICATION_RESULT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setCustomAuthStatus() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_CUSTOM_AUTH_STATUS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setEmail() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_EMAIL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setFirstName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_FIRST_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setLastName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_LAST_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setPreference() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_PREFERENCE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setSessionState() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_SESSION_STATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setUsername() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.SET_USERNAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void stringToTable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.STRING_TO_TABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void tableToString() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.TABLE_TO_STRING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void todayCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.TODAY_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unexpireEndUserAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.UNEXPIRE_END_USER_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unexpireWorkspaceAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.UNEXPIRE_WORKSPACE_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void unlockAccount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.UNLOCK_ACCOUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void urlEncode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.URL_ENCODE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void userInGroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.USER_IN_GROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void weeklyCalendar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.WEEKLY_CALENDAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void workspaceAccountDaysLeft() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APEX_UTIL.WORKSPACE_ACCOUNT_DAYS_LEFT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
