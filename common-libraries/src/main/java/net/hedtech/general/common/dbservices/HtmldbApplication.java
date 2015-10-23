package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbApplication {
		public static void accept() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.ACCEPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearAppCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CLEAR_APP_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearFlowCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CLEAR_FLOW_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearPageCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CLEAR_PAGE_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearPageCaches() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CLEAR_PAGE_CACHES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void clearUserCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CLEAR_USER_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void convertFlowAliasToId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.CONVERT_FLOW_ALIAS_TO_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void debug() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DEBUG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void doSubstitutions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DO_SUBSTITUTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void doTemplateSubstitutions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DO_TEMPLATE_SUBSTITUTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void drawBodyClose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DRAW_BODY_CLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void drawBodyOpen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DRAW_BODY_OPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void drawIconNavigationBar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.DRAW_ICON_NAVIGATION_BAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchAppItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FETCH_APP_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchFlowItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FETCH_FLOW_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchItem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FETCH_ITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fetchValue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FETCH_VALUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void findItemId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FIND_ITEM_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void findItemName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.FIND_ITEM_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getBrowserVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_BROWSER_VERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCompanyName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_COMPANY_NAME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCurrentFlowSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_CURRENT_FLOW_SGID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getCustomAuthLoginUrl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_CUSTOM_AUTH_LOGIN_URL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNextSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_NEXT_SESSION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNlsGroupSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_NLS_GROUP_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getPageAlias() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_PAGE_ALIAS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_SGID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getTranslatedAppId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_TRANSLATED_APP_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getUniqueId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.GET_UNIQUE_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void help() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.HELP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isCustomAuthPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.IS_CUSTOM_AUTH_PAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void nullPageCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.NULL_PAGE_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void nullPageCaches() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.NULL_PAGE_CACHES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void nullStepCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.NULL_STEP_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void nullStepCaches() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.NULL_STEP_CACHES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void paintButtons() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.PAINT_BUTTONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void paintFormopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.PAINT_FORMOPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void processState() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.PROCESS_STATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void publicRoleCheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.PUBLIC_ROLE_CHECK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void publicSecurityCheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.PUBLIC_SECURITY_CHECK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void replaceCgiEnv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.REPLACE_CGI_ENV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetGNlsDateFormat() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_G_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetGNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_G_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetPageProcess() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_PAGE_PROCESS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetPageProcessess() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_PAGE_PROCESSESS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetSecurityCheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.RESET_SECURITY_CHECK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void s() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.S", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void saveInSubstitutionCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SAVE_IN_SUBSTITUTION_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setGNlsDateFormat() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SET_G_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setGNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SET_G_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void show() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SHOW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showErrorMessage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.SHOW_ERROR_MESSAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void tabTitle() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.TAB_TITLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void trimSql() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.TRIM_SQL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void updateCacheWithWrite() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_APPLICATION.UPDATE_CACHE_WITH_WRITE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
