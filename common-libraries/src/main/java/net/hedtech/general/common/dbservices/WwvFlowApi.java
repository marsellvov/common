package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowApi {
		public static void appendToInstallScript(NNumber pId,NNumber pFlowId,NString pScriptClob,NBool pDeinstall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.APPEND_TO_INSTALL_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SCRIPT_CLOB", pScriptClob);
			cmd.addParameter("@P_DEINSTALL", pDeinstall);
				
			cmd.execute();


		}
		
		public static void checkSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CHECK_SGID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void checkVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CHECK_VERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createAppComments(NNumber pId,NNumber pFlowId,NString pPages,NString pAppComment,NString pCommentOwner,NString pCommentFlag,NString pAppVersion,NString pCreatedBy,NString pCreatedOn,NString pUpdatedBy,NString pUpdatedOn,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_APP_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGES", pPages);
			cmd.addParameter("@P_APP_COMMENT", pAppComment);
			cmd.addParameter("@P_COMMENT_OWNER", pCommentOwner);
			cmd.addParameter("@P_COMMENT_FLAG", pCommentFlag);
			cmd.addParameter("@P_APP_VERSION", pAppVersion);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_ON", pCreatedOn);
			cmd.addParameter("@P_UPDATED_BY", pUpdatedBy);
			cmd.addParameter("@P_UPDATED_ON", pUpdatedOn);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createAuthSetup(NNumber pId,NNumber pFlowId,NString pName,NString pDescription,NNumber pReferenceId,NString pPageSentryFunction,NString pSessVerifyFunction,NString pInvalidSessionPage,NString pInvalidSessionUrl,NString pPreAuthProcess,NString pAuthFunction,NString pPostAuthProcess,NString pCookieName,NString pCookiePath,NString pCookieDomain,NString pLdapHost,NString pLdapPort,NString pLdapString,NString pAttribute01,NString pAttribute02,NString pAttribute03,NString pAttribute04,NString pAttribute05,NString pAttribute06,NString pAttribute07,NString pAttribute08,NString pRequiredPatch,NNumber pSecurityGroupId,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_AUTH_SETUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_PAGE_SENTRY_FUNCTION", pPageSentryFunction);
			cmd.addParameter("@P_SESS_VERIFY_FUNCTION", pSessVerifyFunction);
			cmd.addParameter("@P_INVALID_SESSION_PAGE", pInvalidSessionPage);
			cmd.addParameter("@P_INVALID_SESSION_URL", pInvalidSessionUrl);
			cmd.addParameter("@P_PRE_AUTH_PROCESS", pPreAuthProcess);
			cmd.addParameter("@P_AUTH_FUNCTION", pAuthFunction);
			cmd.addParameter("@P_POST_AUTH_PROCESS", pPostAuthProcess);
			cmd.addParameter("@P_COOKIE_NAME", pCookieName);
			cmd.addParameter("@P_COOKIE_PATH", pCookiePath);
			cmd.addParameter("@P_COOKIE_DOMAIN", pCookieDomain);
			cmd.addParameter("@P_LDAP_HOST", pLdapHost);
			cmd.addParameter("@P_LDAP_PORT", pLdapPort);
			cmd.addParameter("@P_LDAP_STRING", pLdapString);
			cmd.addParameter("@P_ATTRIBUTE_01", pAttribute01);
			cmd.addParameter("@P_ATTRIBUTE_02", pAttribute02);
			cmd.addParameter("@P_ATTRIBUTE_03", pAttribute03);
			cmd.addParameter("@P_ATTRIBUTE_04", pAttribute04);
			cmd.addParameter("@P_ATTRIBUTE_05", pAttribute05);
			cmd.addParameter("@P_ATTRIBUTE_06", pAttribute06);
			cmd.addParameter("@P_ATTRIBUTE_07", pAttribute07);
			cmd.addParameter("@P_ATTRIBUTE_08", pAttribute08);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createBug(NNumber pId,NNumber pFlowId,NNumber pPageId,NString pBugDescription,NString pBugPriority,NString pBugStatusCode,NString pBugReportedBy,NDate pBugReportedOn,NString pBugAssignedTo,NDate pBugAssignedOn,NString pBugFixInVersion,NDate pBugProjectedCloseDate,NDate pBugCloseDate,NString pBugAffectedFilesOrMod,NString pBugText,NString pBugHowToReproduce,NString pBugWorkaround,NString pBugAdditionalText,NString pBugWorkLog,NString pBugLastUpdatedBy,NDate pBugLastUpdatedOn,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_BUG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_BUG_DESCRIPTION", pBugDescription);
			cmd.addParameter("@P_BUG_PRIORITY", pBugPriority);
			cmd.addParameter("@P_BUG_STATUS_CODE", pBugStatusCode);
			cmd.addParameter("@P_BUG_REPORTED_BY", pBugReportedBy);
			cmd.addParameter("@P_BUG_REPORTED_ON", pBugReportedOn);
			cmd.addParameter("@P_BUG_ASSIGNED_TO", pBugAssignedTo);
			cmd.addParameter("@P_BUG_ASSIGNED_ON", pBugAssignedOn);
			cmd.addParameter("@P_BUG_FIX_IN_VERSION", pBugFixInVersion);
			cmd.addParameter("@P_BUG_PROJECTED_CLOSE_DATE", pBugProjectedCloseDate);
			cmd.addParameter("@P_BUG_CLOSE_DATE", pBugCloseDate);
			cmd.addParameter("@P_BUG_AFFECTED_FILES_OR_MOD", pBugAffectedFilesOrMod);
			cmd.addParameter("@P_BUG_TEXT", pBugText);
			cmd.addParameter("@P_BUG_HOW_TO_REPRODUCE", pBugHowToReproduce);
			cmd.addParameter("@P_BUG_WORKAROUND", pBugWorkaround);
			cmd.addParameter("@P_BUG_ADDITIONAL_TEXT", pBugAdditionalText);
			cmd.addParameter("@P_BUG_WORK_LOG", pBugWorkLog);
			cmd.addParameter("@P_BUG_LAST_UPDATED_BY", pBugLastUpdatedBy);
			cmd.addParameter("@P_BUG_LAST_UPDATED_ON", pBugLastUpdatedOn);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createBuildOption(NNumber pId,NNumber pFlowId,NString pBuildOptionName,NString pBuildOptionStatus,NString pBuildOptionComment,NString pDefaultOnExport,NString pAttribute1,NString pAttribute2,NString pAttribute3,NString pAttribute4,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_BUILD_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_BUILD_OPTION_NAME", pBuildOptionName);
			cmd.addParameter("@P_BUILD_OPTION_STATUS", pBuildOptionStatus);
			cmd.addParameter("@P_BUILD_OPTION_COMMENT", pBuildOptionComment);
			cmd.addParameter("@P_DEFAULT_ON_EXPORT", pDefaultOnExport);
			cmd.addParameter("@P_ATTRIBUTE1", pAttribute1);
			cmd.addParameter("@P_ATTRIBUTE2", pAttribute2);
			cmd.addParameter("@P_ATTRIBUTE3", pAttribute3);
			cmd.addParameter("@P_ATTRIBUTE4", pAttribute4);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createButtonTemplates(NNumber pId,NNumber pFlowId,NString pTemplateName,NString pTemplate,NString pTranslateThisTemplate,NString pTemplateComment,NNumber pReferenceId,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_BUTTON_TEMPLATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TEMPLATE_NAME", pTemplateName);
			cmd.addParameter("@P_TEMPLATE", pTemplate);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_TEMPLATE_COMMENT", pTemplateComment);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createCalendar(NNumber pId,NNumber pFlowId,NNumber pPageId,NString pPlugName,NString pRegionName,NNumber pPlugTemplate,NString pPlugDisplaySequence,NString pPlugDisplayColumn,NString pPlugDisplayPoint,NString pPlugSource,NString pPlugSourceType,NString pPlugDisplayErrorMessage,NString pPlugRequiredRole,NString pPlugDisplayWhenCondition,NString pPlugDisplayWhenCond2,NString pPlugDisplayConditionType,NString pPlugHeader,NString pPlugFooter,NString pPlugOverrideRegPos,NString pPlugCustomized,NString pPlugCustomizedName,NString pTranslateTitle,NString pPlugCaching,NString pPlugCachingSessionState,NString pPlugCachingMaxAgeInSec,NString pPlugCacheWhenCondType,NString pPlugCacheWhenConditionE1,NString pPlugCacheWhenConditionE2,NString pRequiredPatch,NString pPlugComment,NNumber pCalId,NString pStartDate,NString pEndDate,NString pBeginAtStartOfInterval,NString pDateItem,NString pDisplayAs,NString pDisplayItem,NString pDisplayType,NString pItemFormat,NString pEasySqlOwner,NString pEasySqlTable,NString pDateColumn,NString pDisplayColumn,NNumber pTemplateId,NNumber pStartOfWeek,NString pDayLink,NString pItemLink,NString pStartTime,NString pEndTime,NString pTimeFormat,NString pWeekStartDay,NString pWeekEndDay,NString pDateTypeColumn,NString pCalendarComments,NString pPlugColumnWidth,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CALENDAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_PLUG_NAME", pPlugName);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
			cmd.addParameter("@P_PLUG_TEMPLATE", pPlugTemplate);
			cmd.addParameter("@P_PLUG_DISPLAY_SEQUENCE", pPlugDisplaySequence);
			cmd.addParameter("@P_PLUG_DISPLAY_COLUMN", pPlugDisplayColumn);
			cmd.addParameter("@P_PLUG_DISPLAY_POINT", pPlugDisplayPoint);
			cmd.addParameter("@P_PLUG_SOURCE", pPlugSource);
			cmd.addParameter("@P_PLUG_SOURCE_TYPE", pPlugSourceType);
			cmd.addParameter("@P_PLUG_DISPLAY_ERROR_MESSAGE", pPlugDisplayErrorMessage);
			cmd.addParameter("@P_PLUG_REQUIRED_ROLE", pPlugRequiredRole);
			cmd.addParameter("@P_PLUG_DISPLAY_WHEN_CONDITION", pPlugDisplayWhenCondition);
			cmd.addParameter("@P_PLUG_DISPLAY_WHEN_COND2", pPlugDisplayWhenCond2);
			cmd.addParameter("@P_PLUG_DISPLAY_CONDITION_TYPE", pPlugDisplayConditionType);
			cmd.addParameter("@P_PLUG_HEADER", pPlugHeader);
			cmd.addParameter("@P_PLUG_FOOTER", pPlugFooter);
			cmd.addParameter("@P_PLUG_OVERRIDE_REG_POS", pPlugOverrideRegPos);
			cmd.addParameter("@P_PLUG_CUSTOMIZED", pPlugCustomized);
			cmd.addParameter("@P_PLUG_CUSTOMIZED_NAME", pPlugCustomizedName);
			cmd.addParameter("@P_TRANSLATE_TITLE", pTranslateTitle);
			cmd.addParameter("@P_PLUG_CACHING", pPlugCaching);
			cmd.addParameter("@P_PLUG_CACHING_SESSION_STATE", pPlugCachingSessionState);
			cmd.addParameter("@P_PLUG_CACHING_MAX_AGE_IN_SEC", pPlugCachingMaxAgeInSec);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_COND_TYPE", pPlugCacheWhenCondType);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E1", pPlugCacheWhenConditionE1);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E2", pPlugCacheWhenConditionE2);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PLUG_COMMENT", pPlugComment);
			cmd.addParameter("@P_CAL_ID", pCalId);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_BEGIN_AT_START_OF_INTERVAL", pBeginAtStartOfInterval);
			cmd.addParameter("@P_DATE_ITEM", pDateItem);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
			cmd.addParameter("@P_DISPLAY_ITEM", pDisplayItem);
			cmd.addParameter("@P_DISPLAY_TYPE", pDisplayType);
			cmd.addParameter("@P_ITEM_FORMAT", pItemFormat);
			cmd.addParameter("@P_EASY_SQL_OWNER", pEasySqlOwner);
			cmd.addParameter("@P_EASY_SQL_TABLE", pEasySqlTable);
			cmd.addParameter("@P_DATE_COLUMN", pDateColumn);
			cmd.addParameter("@P_DISPLAY_COLUMN", pDisplayColumn);
			cmd.addParameter("@P_TEMPLATE_ID", pTemplateId);
			cmd.addParameter("@P_START_OF_WEEK", pStartOfWeek);
			cmd.addParameter("@P_DAY_LINK", pDayLink);
			cmd.addParameter("@P_ITEM_LINK", pItemLink);
			cmd.addParameter("@P_START_TIME", pStartTime);
			cmd.addParameter("@P_END_TIME", pEndTime);
			cmd.addParameter("@P_TIME_FORMAT", pTimeFormat);
			cmd.addParameter("@P_WEEK_START_DAY", pWeekStartDay);
			cmd.addParameter("@P_WEEK_END_DAY", pWeekEndDay);
			cmd.addParameter("@P_DATE_TYPE_COLUMN", pDateTypeColumn);
			cmd.addParameter("@P_CALENDAR_COMMENTS", pCalendarComments);
			cmd.addParameter("@P_PLUG_COLUMN_WIDTH", pPlugColumnWidth);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createCalendarTemplate(NNumber pId,NNumber pFlowId,NString pCalTemplateName,NString pTranslateThisTemplate,NString pMonthTitleFormat,NString pDayOfWeekFormat,NString pMonthOpenFormat,NString pMonthCloseFormat,NString pDayTitleFormat,NString pDayOpenFormat,NString pDayCloseFormat,NString pTodayOpenFormat,NString pWeekendTitleFormat,NString pWeekendOpenFormat,NString pWeekendCloseFormat,NString pNondayTitleFormat,NString pNondayOpenFormat,NString pNondayCloseFormat,NString pWeekTitleFormat,NString pWeekOpenFormat,NString pWeekCloseFormat,NString pDailyTitleFormat,NString pDailyOpenFormat,NString pDailyCloseFormat,NString pWeeklyTitleFormat,NString pWeeklyDayOfWeekFormat,NString pWeeklyMonthOpenFormat,NString pWeeklyMonthCloseFormat,NString pWeeklyDayTitleFormat,NString pWeeklyDayOpenFormat,NString pWeeklyDayCloseFormat,NString pWeeklyTodayOpenFormat,NString pWeeklyWeekendTitleFormat,NString pWeeklyWeekendOpenFormat,NString pWeeklyWeekendCloseFormat,NString pWeeklyTimeOpenFormat,NString pWeeklyTimeCloseFormat,NString pWeeklyTimeTitleFormat,NString pWeeklyHourOpenFormat,NString pWeeklyHourCloseFormat,NString pDailyDayOfWeekFormat,NString pDailyMonthTitleFormat,NString pDailyMonthOpenFormat,NString pDailyMonthCloseFormat,NString pDailyDayTitleFormat,NString pDailyDayOpenFormat,NString pDailyDayCloseFormat,NString pDailyTodayOpenFormat,NString pDailyTimeOpenFormat,NString pDailyTimeCloseFormat,NString pDailyTimeTitleFormat,NString pDailyHourOpenFormat,NString pDailyHourCloseFormat,NNumber pReferenceId,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CALENDAR_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_CAL_TEMPLATE_NAME", pCalTemplateName);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_MONTH_TITLE_FORMAT", pMonthTitleFormat);
			cmd.addParameter("@P_DAY_OF_WEEK_FORMAT", pDayOfWeekFormat);
			cmd.addParameter("@P_MONTH_OPEN_FORMAT", pMonthOpenFormat);
			cmd.addParameter("@P_MONTH_CLOSE_FORMAT", pMonthCloseFormat);
			cmd.addParameter("@P_DAY_TITLE_FORMAT", pDayTitleFormat);
			cmd.addParameter("@P_DAY_OPEN_FORMAT", pDayOpenFormat);
			cmd.addParameter("@P_DAY_CLOSE_FORMAT", pDayCloseFormat);
			cmd.addParameter("@P_TODAY_OPEN_FORMAT", pTodayOpenFormat);
			cmd.addParameter("@P_WEEKEND_TITLE_FORMAT", pWeekendTitleFormat);
			cmd.addParameter("@P_WEEKEND_OPEN_FORMAT", pWeekendOpenFormat);
			cmd.addParameter("@P_WEEKEND_CLOSE_FORMAT", pWeekendCloseFormat);
			cmd.addParameter("@P_NONDAY_TITLE_FORMAT", pNondayTitleFormat);
			cmd.addParameter("@P_NONDAY_OPEN_FORMAT", pNondayOpenFormat);
			cmd.addParameter("@P_NONDAY_CLOSE_FORMAT", pNondayCloseFormat);
			cmd.addParameter("@P_WEEK_TITLE_FORMAT", pWeekTitleFormat);
			cmd.addParameter("@P_WEEK_OPEN_FORMAT", pWeekOpenFormat);
			cmd.addParameter("@P_WEEK_CLOSE_FORMAT", pWeekCloseFormat);
			cmd.addParameter("@P_DAILY_TITLE_FORMAT", pDailyTitleFormat);
			cmd.addParameter("@P_DAILY_OPEN_FORMAT", pDailyOpenFormat);
			cmd.addParameter("@P_DAILY_CLOSE_FORMAT", pDailyCloseFormat);
			cmd.addParameter("@P_WEEKLY_TITLE_FORMAT", pWeeklyTitleFormat);
			cmd.addParameter("@P_WEEKLY_DAY_OF_WEEK_FORMAT", pWeeklyDayOfWeekFormat);
			cmd.addParameter("@P_WEEKLY_MONTH_OPEN_FORMAT", pWeeklyMonthOpenFormat);
			cmd.addParameter("@P_WEEKLY_MONTH_CLOSE_FORMAT", pWeeklyMonthCloseFormat);
			cmd.addParameter("@P_WEEKLY_DAY_TITLE_FORMAT", pWeeklyDayTitleFormat);
			cmd.addParameter("@P_WEEKLY_DAY_OPEN_FORMAT", pWeeklyDayOpenFormat);
			cmd.addParameter("@P_WEEKLY_DAY_CLOSE_FORMAT", pWeeklyDayCloseFormat);
			cmd.addParameter("@P_WEEKLY_TODAY_OPEN_FORMAT", pWeeklyTodayOpenFormat);
			cmd.addParameter("@P_WEEKLY_WEEKEND_TITLE_FORMAT", pWeeklyWeekendTitleFormat);
			cmd.addParameter("@P_WEEKLY_WEEKEND_OPEN_FORMAT", pWeeklyWeekendOpenFormat);
			cmd.addParameter("@P_WEEKLY_WEEKEND_CLOSE_FORMAT", pWeeklyWeekendCloseFormat);
			cmd.addParameter("@P_WEEKLY_TIME_OPEN_FORMAT", pWeeklyTimeOpenFormat);
			cmd.addParameter("@P_WEEKLY_TIME_CLOSE_FORMAT", pWeeklyTimeCloseFormat);
			cmd.addParameter("@P_WEEKLY_TIME_TITLE_FORMAT", pWeeklyTimeTitleFormat);
			cmd.addParameter("@P_WEEKLY_HOUR_OPEN_FORMAT", pWeeklyHourOpenFormat);
			cmd.addParameter("@P_WEEKLY_HOUR_CLOSE_FORMAT", pWeeklyHourCloseFormat);
			cmd.addParameter("@P_DAILY_DAY_OF_WEEK_FORMAT", pDailyDayOfWeekFormat);
			cmd.addParameter("@P_DAILY_MONTH_TITLE_FORMAT", pDailyMonthTitleFormat);
			cmd.addParameter("@P_DAILY_MONTH_OPEN_FORMAT", pDailyMonthOpenFormat);
			cmd.addParameter("@P_DAILY_MONTH_CLOSE_FORMAT", pDailyMonthCloseFormat);
			cmd.addParameter("@P_DAILY_DAY_TITLE_FORMAT", pDailyDayTitleFormat);
			cmd.addParameter("@P_DAILY_DAY_OPEN_FORMAT", pDailyDayOpenFormat);
			cmd.addParameter("@P_DAILY_DAY_CLOSE_FORMAT", pDailyDayCloseFormat);
			cmd.addParameter("@P_DAILY_TODAY_OPEN_FORMAT", pDailyTodayOpenFormat);
			cmd.addParameter("@P_DAILY_TIME_OPEN_FORMAT", pDailyTimeOpenFormat);
			cmd.addParameter("@P_DAILY_TIME_CLOSE_FORMAT", pDailyTimeCloseFormat);
			cmd.addParameter("@P_DAILY_TIME_TITLE_FORMAT", pDailyTimeTitleFormat);
			cmd.addParameter("@P_DAILY_HOUR_OPEN_FORMAT", pDailyHourOpenFormat);
			cmd.addParameter("@P_DAILY_HOUR_CLOSE_FORMAT", pDailyHourCloseFormat);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createChartPage(NNumber pFlowId,NNumber pFlowStepId,NString pPageName,NString pChartSql,NString pTabSet,NString pScale,NString pAxis,NString pNumMask,NString pPlugId,NString pPlugDisplayColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CHART_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_CHART_SQL", pChartSql);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_SCALE", pScale);
			cmd.addParameter("@P_AXIS", pAxis);
			cmd.addParameter("@P_NUM_MASK", pNumMask);
			cmd.addParameter("@P_PLUG_ID", pPlugId);
			cmd.addParameter("@P_PLUG_DISPLAY_COLUMN", pPlugDisplayColumn);
				
			cmd.execute();


		}
		
		public static void createChartSeriesAttr(NNumber pId,NNumber pRegionId,NNumber pSeriesId,NString pA001,NString pA002,NString pA003,NString pA004,NString pA005,NString pA006,NString pA007,NString pA008,NString pA009,NString pA010,NString pA011,NString pA012,NString pA013,NString pA014,NString pA015,NString pA016,NString pA017,NString pA018,NString pA019,NString pA020,NString pA021,NString pA022,NString pA023,NString pA024,NString pA025,NString pA026,NString pA027,NString pA028,NString pA029,NString pA030,NString pA031,NString pA032,NString pA033,NString pA034,NString pA035,NString pA036,NString pA037,NString pA038,NString pA039,NString pA040,NString pA041,NString pA042,NString pA043,NString pA044,NString pA045,NString pA046,NString pA047,NString pA048,NString pA049,NString pA050,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CHART_SERIES_ATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_SERIES_ID", pSeriesId);
			cmd.addParameter("@P_A001", pA001);
			cmd.addParameter("@P_A002", pA002);
			cmd.addParameter("@P_A003", pA003);
			cmd.addParameter("@P_A004", pA004);
			cmd.addParameter("@P_A005", pA005);
			cmd.addParameter("@P_A006", pA006);
			cmd.addParameter("@P_A007", pA007);
			cmd.addParameter("@P_A008", pA008);
			cmd.addParameter("@P_A009", pA009);
			cmd.addParameter("@P_A010", pA010);
			cmd.addParameter("@P_A011", pA011);
			cmd.addParameter("@P_A012", pA012);
			cmd.addParameter("@P_A013", pA013);
			cmd.addParameter("@P_A014", pA014);
			cmd.addParameter("@P_A015", pA015);
			cmd.addParameter("@P_A016", pA016);
			cmd.addParameter("@P_A017", pA017);
			cmd.addParameter("@P_A018", pA018);
			cmd.addParameter("@P_A019", pA019);
			cmd.addParameter("@P_A020", pA020);
			cmd.addParameter("@P_A021", pA021);
			cmd.addParameter("@P_A022", pA022);
			cmd.addParameter("@P_A023", pA023);
			cmd.addParameter("@P_A024", pA024);
			cmd.addParameter("@P_A025", pA025);
			cmd.addParameter("@P_A026", pA026);
			cmd.addParameter("@P_A027", pA027);
			cmd.addParameter("@P_A028", pA028);
			cmd.addParameter("@P_A029", pA029);
			cmd.addParameter("@P_A030", pA030);
			cmd.addParameter("@P_A031", pA031);
			cmd.addParameter("@P_A032", pA032);
			cmd.addParameter("@P_A033", pA033);
			cmd.addParameter("@P_A034", pA034);
			cmd.addParameter("@P_A035", pA035);
			cmd.addParameter("@P_A036", pA036);
			cmd.addParameter("@P_A037", pA037);
			cmd.addParameter("@P_A038", pA038);
			cmd.addParameter("@P_A039", pA039);
			cmd.addParameter("@P_A040", pA040);
			cmd.addParameter("@P_A041", pA041);
			cmd.addParameter("@P_A042", pA042);
			cmd.addParameter("@P_A043", pA043);
			cmd.addParameter("@P_A044", pA044);
			cmd.addParameter("@P_A045", pA045);
			cmd.addParameter("@P_A046", pA046);
			cmd.addParameter("@P_A047", pA047);
			cmd.addParameter("@P_A048", pA048);
			cmd.addParameter("@P_A049", pA049);
			cmd.addParameter("@P_A050", pA050);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createConfiguration(NNumber pId,NNumber pSecurityGroupId,NNumber pFlowId,NString pName,NString pConfigComments,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CONFIGURATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_CONFIG_COMMENTS", pConfigComments);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createConfigurationItem(NNumber pId,NNumber pSecurityGroupId,NNumber pConfig,NString pTableDotColumn,NString pIdColumnValue,NString pNewValue,NString pConfigComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_CONFIGURATION_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_CONFIG", pConfig);
			cmd.addParameter("@P_TABLE_DOT_COLUMN", pTableDotColumn);
			cmd.addParameter("@P_ID_COLUMN_VALUE", pIdColumnValue);
			cmd.addParameter("@P_NEW_VALUE", pNewValue);
			cmd.addParameter("@P_CONFIG_COMMENT", pConfigComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createDynamicTranslation(NNumber pId,NNumber pFlowId,NString pLanguage,NString pFrom,NString pTo,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_DYNAMIC_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LANGUAGE", pLanguage);
			cmd.addParameter("@P_FROM", pFrom);
			cmd.addParameter("@P_TO", pTo);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createEntryPoint(NNumber pId,NNumber pFlowId,NString pName,NString pPageReset,NNumber pEntryPointComment,NNumber pSecurityGroupId,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ENTRY_POINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_PAGE_RESET", pPageReset);
			cmd.addParameter("@P_ENTRY_POINT_COMMENT", pEntryPointComment);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createEntryPointArgs(NNumber pId,NNumber pFlowEntryPointId,NString pEntryPointArgSequence,NString pEntryPointArgItemId,NNumber pEntryPointArgComment,NNumber pSecurityGroupId,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ENTRY_POINT_ARGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ENTRY_POINT_ID", pFlowEntryPointId);
			cmd.addParameter("@P_ENTRY_POINT_ARG_SEQUENCE", pEntryPointArgSequence);
			cmd.addParameter("@P_ENTRY_POINT_ARG_ITEM_ID", pEntryPointArgItemId);
			cmd.addParameter("@P_ENTRY_POINT_ARG_COMMENT", pEntryPointArgComment);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createFieldTemplate(NNumber pId,NNumber pFlowId,NString pTemplateName,NString pTemplateBody1,NString pTemplateBody2,NString pOnErrorBeforeLabel,NString pOnErrorAfterLabel,NNumber pReferenceId,NString pTranslateThisTemplate,NString pTemplateComment,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FIELD_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TEMPLATE_NAME", pTemplateName);
			cmd.addParameter("@P_TEMPLATE_BODY1", pTemplateBody1);
			cmd.addParameter("@P_TEMPLATE_BODY2", pTemplateBody2);
			cmd.addParameter("@P_ON_ERROR_BEFORE_LABEL", pOnErrorBeforeLabel);
			cmd.addParameter("@P_ON_ERROR_AFTER_LABEL", pOnErrorAfterLabel);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_TEMPLATE_COMMENT", pTemplateComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createFlashChart(NNumber pId,NNumber pFlowId,NNumber pPageId,NNumber pRegionId,NString pDefaultChartType,NString pChartTitle,NNumber pChartWidth,NNumber pChartHeight,NString pChartAnimation,NString pDisplayAttr,NString pDialTickAttr,NString pMargins,NNumber pOmitLabelInterval,NString pBgtype,NString pBgcolor1,NString pBgcolor2,NNumber pGradientRotation,NString pColorScheme,NString pCustomColors,NString pXAxisTitle,NNumber pXAxisMin,NNumber pXAxisMax,NNumber pXAxisGridSpacing,NString pXAxisPrefix,NString pXAxisPostfix,NString pXAxisGroupSep,NNumber pXAxisDecimalPlace,NString pYAxisTitle,NNumber pYAxisMin,NNumber pYAxisMax,NNumber pYAxisGridSpacing,NString pYAxisPrefix,NString pYAxisPostfix,NString pYAxisGroupSep,NNumber pYAxisDecimalPlace,NString pAsyncUpdate,NNumber pAsyncTime,NString pNamesFont,NNumber pNamesRotation,NString pValuesFont,NNumber pValuesRotation,NString pHintsFont,NString pLegendFont,NString pGridLabelsFont,NString pChartTitleFont,NString pXAxisTitleFont,NString pYAxisTitleFont,NString pUseChartXml,NString pChartXml,NString pAttribute01,NString pAttribute02,NString pAttribute03,NString pAttribute04,NString pAttribute05,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLASH_CHART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_DEFAULT_CHART_TYPE", pDefaultChartType);
			cmd.addParameter("@P_CHART_TITLE", pChartTitle);
			cmd.addParameter("@P_CHART_WIDTH", pChartWidth);
			cmd.addParameter("@P_CHART_HEIGHT", pChartHeight);
			cmd.addParameter("@P_CHART_ANIMATION", pChartAnimation);
			cmd.addParameter("@P_DISPLAY_ATTR", pDisplayAttr);
			cmd.addParameter("@P_DIAL_TICK_ATTR", pDialTickAttr);
			cmd.addParameter("@P_MARGINS", pMargins);
			cmd.addParameter("@P_OMIT_LABEL_INTERVAL", pOmitLabelInterval);
			cmd.addParameter("@P_BGTYPE", pBgtype);
			cmd.addParameter("@P_BGCOLOR1", pBgcolor1);
			cmd.addParameter("@P_BGCOLOR2", pBgcolor2);
			cmd.addParameter("@P_GRADIENT_ROTATION", pGradientRotation);
			cmd.addParameter("@P_COLOR_SCHEME", pColorScheme);
			cmd.addParameter("@P_CUSTOM_COLORS", pCustomColors);
			cmd.addParameter("@P_X_AXIS_TITLE", pXAxisTitle);
			cmd.addParameter("@P_X_AXIS_MIN", pXAxisMin);
			cmd.addParameter("@P_X_AXIS_MAX", pXAxisMax);
			cmd.addParameter("@P_X_AXIS_GRID_SPACING", pXAxisGridSpacing);
			cmd.addParameter("@P_X_AXIS_PREFIX", pXAxisPrefix);
			cmd.addParameter("@P_X_AXIS_POSTFIX", pXAxisPostfix);
			cmd.addParameter("@P_X_AXIS_GROUP_SEP", pXAxisGroupSep);
			cmd.addParameter("@P_X_AXIS_DECIMAL_PLACE", pXAxisDecimalPlace);
			cmd.addParameter("@P_Y_AXIS_TITLE", pYAxisTitle);
			cmd.addParameter("@P_Y_AXIS_MIN", pYAxisMin);
			cmd.addParameter("@P_Y_AXIS_MAX", pYAxisMax);
			cmd.addParameter("@P_Y_AXIS_GRID_SPACING", pYAxisGridSpacing);
			cmd.addParameter("@P_Y_AXIS_PREFIX", pYAxisPrefix);
			cmd.addParameter("@P_Y_AXIS_POSTFIX", pYAxisPostfix);
			cmd.addParameter("@P_Y_AXIS_GROUP_SEP", pYAxisGroupSep);
			cmd.addParameter("@P_Y_AXIS_DECIMAL_PLACE", pYAxisDecimalPlace);
			cmd.addParameter("@P_ASYNC_UPDATE", pAsyncUpdate);
			cmd.addParameter("@P_ASYNC_TIME", pAsyncTime);
			cmd.addParameter("@P_NAMES_FONT", pNamesFont);
			cmd.addParameter("@P_NAMES_ROTATION", pNamesRotation);
			cmd.addParameter("@P_VALUES_FONT", pValuesFont);
			cmd.addParameter("@P_VALUES_ROTATION", pValuesRotation);
			cmd.addParameter("@P_HINTS_FONT", pHintsFont);
			cmd.addParameter("@P_LEGEND_FONT", pLegendFont);
			cmd.addParameter("@P_GRID_LABELS_FONT", pGridLabelsFont);
			cmd.addParameter("@P_CHART_TITLE_FONT", pChartTitleFont);
			cmd.addParameter("@P_X_AXIS_TITLE_FONT", pXAxisTitleFont);
			cmd.addParameter("@P_Y_AXIS_TITLE_FONT", pYAxisTitleFont);
			cmd.addParameter("@P_USE_CHART_XML", pUseChartXml);
			cmd.addParameter("@P_CHART_XML", pChartXml);
			cmd.addParameter("@P_ATTRIBUTE_01", pAttribute01);
			cmd.addParameter("@P_ATTRIBUTE_02", pAttribute02);
			cmd.addParameter("@P_ATTRIBUTE_03", pAttribute03);
			cmd.addParameter("@P_ATTRIBUTE_04", pAttribute04);
			cmd.addParameter("@P_ATTRIBUTE_05", pAttribute05);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createFlashChartSeries(NNumber pId,NNumber pChartId,NNumber pFlowId,NNumber pSeriesSeq,NString pSeriesName,NString pSeriesQuery,NString pSeriesQueryType,NString pSeriesQueryParseOpt,NString pSeriesQueryNoDataFound,NNumber pSeriesQueryRowCountMax,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLASH_CHART_SERIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_CHART_ID", pChartId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SERIES_SEQ", pSeriesSeq);
			cmd.addParameter("@P_SERIES_NAME", pSeriesName);
			cmd.addParameter("@P_SERIES_QUERY", pSeriesQuery);
			cmd.addParameter("@P_SERIES_QUERY_TYPE", pSeriesQueryType);
			cmd.addParameter("@P_SERIES_QUERY_PARSE_OPT", pSeriesQueryParseOpt);
			cmd.addParameter("@P_SERIES_QUERY_NO_DATA_FOUND", pSeriesQueryNoDataFound);
			cmd.addParameter("@P_SERIES_QUERY_ROW_COUNT_MAX", pSeriesQueryRowCountMax);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
//		public static void createFlow(NNumber pId,NNumber pSecurityGroupId,NNumber pDisplayId,NString pOwner,NString pName,NString pAlias,NString pWebdbTemplate,NNumber pDefaultPageTemplate,NString pHomeLink,NString pBoxWidth,NString pWebdbLogging,NString pPageViewLogging,NString pFlowLanguage,NString pFlowLanguageDerivedFrom,NString pFlowImagePrefix,NNumber pPrinterFriendlyTemplate,NNumber pDefaultRegionTemplate,NNumber pDefaultLabelTemplate,NNumber pDefaultReportTemplate,NNumber pDefaultListTemplate,NNumber pDefaultMenuTemplate,NNumber pDefaultButtonTemplate,NNumber pErrorTemplate,NNumber pDefaultChartTemplate,NNumber pDefaultFormTemplate,NNumber pDefaultWizardTemplate,NNumber pDefaultTabformTemplate,NNumber pDefaultReportrTemplate,NNumber pDefaultMenurTemplate,NNumber pDefaultListrTemplate,NNumber pThemeId,NString pDocumentationBanner,NString pAuthentication,NString pLoginUrl,NString pLogoutUrl,NString pLogoImage,NString pLogoImageAttributes,NString pPublicUrlPrefix,NString pPublicUser,NString pDbauthUrlPrefix,NString pProxyServer,NString pCustAuthenticationProcess,NString pCustAuthenticationPage,NString pCustomAuthLoginUrl,NString pFlowVersion,NNumber pPageRangeMinimum,NNumber pPageRangeMaximum,NString pFlowStatus,NString pFlowUnavailableText,NString pBuildStatus,NString pExactSubstitutionsOnly,NString pVpd,NString pSecurityScheme,NNumber pApplicationTabSet,NString pRejoinExistingSessions,NString pSubstitutionString01,NString pSubstitutionValue01,NString pSubstitutionString02,NString pSubstitutionValue02,NString pSubstitutionString03,NString pSubstitutionValue03,NString pSubstitutionString04,NString pSubstitutionValue04,NString pSubstitutionString05,NString pSubstitutionValue05,NString pSubstitutionString06,NString pSubstitutionValue06,NString pSubstitutionString07,NString pSubstitutionValue07,NString pSubstitutionString08,NString pSubstitutionValue08,NString pSubstitutionString09,NString pSubstitutionValue09,NString pSubstitutionString10,NString pSubstitutionValue10,NString pSubstitutionString11,NString pSubstitutionValue11,NString pSubstitutionString12,NString pSubstitutionValue12,NString pSubstitutionString13,NString pSubstitutionValue13,NString pSubstitutionString14,NString pSubstitutionValue14,NString pSubstitutionString15,NString pSubstitutionValue15,NString pSubstitutionString16,NString pSubstitutionValue16,NString pSubstitutionString17,NString pSubstitutionValue17,NString pSubstitutionString18,NString pSubstitutionValue18,NString pSubstitutionString19,NString pSubstitutionValue19,NString pSubstitutionString20,NString pSubstitutionValue20,List<WwvFlowGlobal.VcArr2Row> pRequiredRoles,NString pGlobalNotification,NNumber pGlobalId,NString pCharset,NString pPageProtectionEnabledYN,byte[] pChecksumSalt,NString pChecksumSaltLastReset,NString pCsvEncoding,NString pLastUpdatedBy,NString pLastUpdYyyymmddhh24miss,NNumber pIdOffset,NString pTarget) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLOW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ID", pId);
//			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
//			cmd.addParameter("@P_DISPLAY_ID", pDisplayId);
//			cmd.addParameter("@P_OWNER", pOwner);
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_ALIAS", pAlias);
//			cmd.addParameter("@P_WEBDB_TEMPLATE", pWebdbTemplate);
//			cmd.addParameter("@P_DEFAULT_PAGE_TEMPLATE", pDefaultPageTemplate);
//			cmd.addParameter("@P_HOME_LINK", pHomeLink);
//			cmd.addParameter("@P_BOX_WIDTH", pBoxWidth);
//			cmd.addParameter("@P_WEBDB_LOGGING", pWebdbLogging);
//			cmd.addParameter("@P_PAGE_VIEW_LOGGING", pPageViewLogging);
//			cmd.addParameter("@P_FLOW_LANGUAGE", pFlowLanguage);
//			cmd.addParameter("@P_FLOW_LANGUAGE_DERIVED_FROM", pFlowLanguageDerivedFrom);
//			cmd.addParameter("@P_FLOW_IMAGE_PREFIX", pFlowImagePrefix);
//			cmd.addParameter("@P_PRINTER_FRIENDLY_TEMPLATE", pPrinterFriendlyTemplate);
//			cmd.addParameter("@P_DEFAULT_REGION_TEMPLATE", pDefaultRegionTemplate);
//			cmd.addParameter("@P_DEFAULT_LABEL_TEMPLATE", pDefaultLabelTemplate);
//			cmd.addParameter("@P_DEFAULT_REPORT_TEMPLATE", pDefaultReportTemplate);
//			cmd.addParameter("@P_DEFAULT_LIST_TEMPLATE", pDefaultListTemplate);
//			cmd.addParameter("@P_DEFAULT_MENU_TEMPLATE", pDefaultMenuTemplate);
//			cmd.addParameter("@P_DEFAULT_BUTTON_TEMPLATE", pDefaultButtonTemplate);
//			cmd.addParameter("@P_ERROR_TEMPLATE", pErrorTemplate);
//			cmd.addParameter("@P_DEFAULT_CHART_TEMPLATE", pDefaultChartTemplate);
//			cmd.addParameter("@P_DEFAULT_FORM_TEMPLATE", pDefaultFormTemplate);
//			cmd.addParameter("@P_DEFAULT_WIZARD_TEMPLATE", pDefaultWizardTemplate);
//			cmd.addParameter("@P_DEFAULT_TABFORM_TEMPLATE", pDefaultTabformTemplate);
//			cmd.addParameter("@P_DEFAULT_REPORTR_TEMPLATE", pDefaultReportrTemplate);
//			cmd.addParameter("@P_DEFAULT_MENUR_TEMPLATE", pDefaultMenurTemplate);
//			cmd.addParameter("@P_DEFAULT_LISTR_TEMPLATE", pDefaultListrTemplate);
//			cmd.addParameter("@P_THEME_ID", pThemeId);
//			cmd.addParameter("@P_DOCUMENTATION_BANNER", pDocumentationBanner);
//			cmd.addParameter("@P_AUTHENTICATION", pAuthentication);
//			cmd.addParameter("@P_LOGIN_URL", pLoginUrl);
//			cmd.addParameter("@P_LOGOUT_URL", pLogoutUrl);
//			cmd.addParameter("@P_LOGO_IMAGE", pLogoImage);
//			cmd.addParameter("@P_LOGO_IMAGE_ATTRIBUTES", pLogoImageAttributes);
//			cmd.addParameter("@P_PUBLIC_URL_PREFIX", pPublicUrlPrefix);
//			cmd.addParameter("@P_PUBLIC_USER", pPublicUser);
//			cmd.addParameter("@P_DBAUTH_URL_PREFIX", pDbauthUrlPrefix);
//			cmd.addParameter("@P_PROXY_SERVER", pProxyServer);
//			cmd.addParameter("@P_CUST_AUTHENTICATION_PROCESS", pCustAuthenticationProcess);
//			cmd.addParameter("@P_CUST_AUTHENTICATION_PAGE", pCustAuthenticationPage);
//			cmd.addParameter("@P_CUSTOM_AUTH_LOGIN_URL", pCustomAuthLoginUrl);
//			cmd.addParameter("@P_FLOW_VERSION", pFlowVersion);
//			cmd.addParameter("@P_PAGE_RANGE_MINIMUM", pPageRangeMinimum);
//			cmd.addParameter("@P_PAGE_RANGE_MAXIMUM", pPageRangeMaximum);
//			cmd.addParameter("@P_FLOW_STATUS", pFlowStatus);
//			cmd.addParameter("@P_FLOW_UNAVAILABLE_TEXT", pFlowUnavailableText);
//			cmd.addParameter("@P_BUILD_STATUS", pBuildStatus);
//			cmd.addParameter("@P_EXACT_SUBSTITUTIONS_ONLY", pExactSubstitutionsOnly);
//			cmd.addParameter("@P_VPD", pVpd);
//			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
//			cmd.addParameter("@P_APPLICATION_TAB_SET", pApplicationTabSet);
//			cmd.addParameter("@P_REJOIN_EXISTING_SESSIONS", pRejoinExistingSessions);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_01", pSubstitutionString01);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_01", pSubstitutionValue01);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_02", pSubstitutionString02);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_02", pSubstitutionValue02);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_03", pSubstitutionString03);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_03", pSubstitutionValue03);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_04", pSubstitutionString04);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_04", pSubstitutionValue04);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_05", pSubstitutionString05);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_05", pSubstitutionValue05);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_06", pSubstitutionString06);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_06", pSubstitutionValue06);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_07", pSubstitutionString07);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_07", pSubstitutionValue07);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_08", pSubstitutionString08);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_08", pSubstitutionValue08);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_09", pSubstitutionString09);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_09", pSubstitutionValue09);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_10", pSubstitutionString10);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_10", pSubstitutionValue10);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_11", pSubstitutionString11);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_11", pSubstitutionValue11);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_12", pSubstitutionString12);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_12", pSubstitutionValue12);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_13", pSubstitutionString13);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_13", pSubstitutionValue13);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_14", pSubstitutionString14);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_14", pSubstitutionValue14);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_15", pSubstitutionString15);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_15", pSubstitutionValue15);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_16", pSubstitutionString16);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_16", pSubstitutionValue16);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_17", pSubstitutionString17);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_17", pSubstitutionValue17);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_18", pSubstitutionString18);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_18", pSubstitutionValue18);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_19", pSubstitutionString19);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_19", pSubstitutionValue19);
//			cmd.addParameter("@P_SUBSTITUTION_STRING_20", pSubstitutionString20);
//			cmd.addParameter("@P_SUBSTITUTION_VALUE_20", pSubstitutionValue20);
//			// cmd.addParameter(DbTypes.getTableType("P_REQUIRED_ROLES", "", pRequiredRoles, object.class));
//			cmd.addParameter("@P_GLOBAL_NOTIFICATION", pGlobalNotification);
//			cmd.addParameter("@P_GLOBAL_ID", pGlobalId);
//			cmd.addParameter("@P_CHARSET", pCharset);
//			cmd.addParameter("@P_PAGE_PROTECTION_ENABLED_Y_N", pPageProtectionEnabledYN);
//			cmd.addParameter("@P_CHECKSUM_SALT", pChecksumSalt);
//			cmd.addParameter("@P_CHECKSUM_SALT_LAST_RESET", pChecksumSaltLastReset);
//			cmd.addParameter("@P_CSV_ENCODING", pCsvEncoding);
//			cmd.addParameter("@P_LAST_UPDATED_BY", pLastUpdatedBy);
//			cmd.addParameter("@P_LAST_UPD_YYYYMMDDHH24MISS", pLastUpdYyyymmddhh24miss);
//			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
//			cmd.addParameter("@P_TARGET", pTarget);
//				
//			cmd.execute();
//
//
//		}
		
		public static void createFlowComputation(NNumber pId,NNumber pFlowId,NNumber pComputationSequence,NString pComputationItem,NString pComputationPoint,NString pComputationItemType,NString pComputationType,NString pComputationProcessed,NString pComputation,NString pSecurityScheme,NNumber pRequiredPatch,NString pComputationComment,NString pComputeWhen,NString pComputeWhenType,NString pComputeWhenText,NString pComputationErrorMessage,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLOW_COMPUTATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_COMPUTATION_SEQUENCE", pComputationSequence);
			cmd.addParameter("@P_COMPUTATION_ITEM", pComputationItem);
			cmd.addParameter("@P_COMPUTATION_POINT", pComputationPoint);
			cmd.addParameter("@P_COMPUTATION_ITEM_TYPE", pComputationItemType);
			cmd.addParameter("@P_COMPUTATION_TYPE", pComputationType);
			cmd.addParameter("@P_COMPUTATION_PROCESSED", pComputationProcessed);
			cmd.addParameter("@P_COMPUTATION", pComputation);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_COMPUTATION_COMMENT", pComputationComment);
			cmd.addParameter("@P_COMPUTE_WHEN", pComputeWhen);
			cmd.addParameter("@P_COMPUTE_WHEN_TYPE", pComputeWhenType);
			cmd.addParameter("@P_COMPUTE_WHEN_TEXT", pComputeWhenText);
			cmd.addParameter("@P_COMPUTATION_ERROR_MESSAGE", pComputationErrorMessage);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createFlowItem(NNumber pId,NNumber pFlowId,NString pName,NString pDataType,NString pIsPersistent,NNumber pRequiredPatch,NString pProtectionLevel,NString pItemComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLOW_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_IS_PERSISTENT", pIsPersistent);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PROTECTION_LEVEL", pProtectionLevel);
			cmd.addParameter("@P_ITEM_COMMENT", pItemComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createFlowProcess(NNumber pId,NNumber pFlowId,NNumber pProcessSequence,NString pProcessPoint,NString pProcessType,NString pProcessName,NString pProcessSql,NString pProcessSqlClob,NString pProcessErrorMessage,NString pProcessWhen,NString pProcessWhenType,NString pProcessWhen2,NString pProcessWhenType2,NString pSecurityScheme,NNumber pRequiredPatch,NString pProcessItemName,NString pProcessComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_FLOW_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PROCESS_SEQUENCE", pProcessSequence);
			cmd.addParameter("@P_PROCESS_POINT", pProcessPoint);
			cmd.addParameter("@P_PROCESS_TYPE", pProcessType);
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
			cmd.addParameter("@P_PROCESS_SQL", pProcessSql);
			cmd.addParameter("@P_PROCESS_SQL_CLOB", pProcessSqlClob);
			cmd.addParameter("@P_PROCESS_ERROR_MESSAGE", pProcessErrorMessage);
			cmd.addParameter("@P_PROCESS_WHEN", pProcessWhen);
			cmd.addParameter("@P_PROCESS_WHEN_TYPE", pProcessWhenType);
			cmd.addParameter("@P_PROCESS_WHEN2", pProcessWhen2);
			cmd.addParameter("@P_PROCESS_WHEN_TYPE2", pProcessWhenType2);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PROCESS_ITEM_NAME", pProcessItemName);
			cmd.addParameter("@P_PROCESS_COMMENT", pProcessComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createGenericAttr(NNumber pId,NNumber pRegionId,NNumber pAttributeId,NString pAttributeValue,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_GENERIC_ATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_ATTRIBUTE_ID", pAttributeId);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createIconBar(NNumber pId,NNumber pFlowId,NString pIconBarText,NString pIconBarTableWidth,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ICON_BAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_ICON_BAR_TEXT", pIconBarText);
			cmd.addParameter("@P_ICON_BAR_TABLE_WIDTH", pIconBarTableWidth);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createIconBarItem(NNumber pId,NNumber pFlowId,NNumber pIconSequence,NString pIconImage,NString pIconImage2,NString pIconImage3,NString pIconSubtext,NString pIconSubtext2,NString pIconSubtext3,NString pIconTarget,NString pIconImageAlt,NNumber pIconHeight,NNumber pIconWidth,NNumber pIconHeight2,NNumber pIconWidth2,NNumber pIconHeight3,NNumber pIconWidth3,NString pIconBarDispCond,NString pIconBarDispCondType,NString pIconBarFlowCondInstr,NString pBeginsOnNewLine,NNumber pCellColspan,NString pOnclick,NNumber pRequiredPatch,NString pSecurityScheme,NNumber pReferenceId,NString pIconBarComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ICON_BAR_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_ICON_SEQUENCE", pIconSequence);
			cmd.addParameter("@P_ICON_IMAGE", pIconImage);
			cmd.addParameter("@P_ICON_IMAGE2", pIconImage2);
			cmd.addParameter("@P_ICON_IMAGE3", pIconImage3);
			cmd.addParameter("@P_ICON_SUBTEXT", pIconSubtext);
			cmd.addParameter("@P_ICON_SUBTEXT2", pIconSubtext2);
			cmd.addParameter("@P_ICON_SUBTEXT3", pIconSubtext3);
			cmd.addParameter("@P_ICON_TARGET", pIconTarget);
			cmd.addParameter("@P_ICON_IMAGE_ALT", pIconImageAlt);
			cmd.addParameter("@P_ICON_HEIGHT", pIconHeight);
			cmd.addParameter("@P_ICON_WIDTH", pIconWidth);
			cmd.addParameter("@P_ICON_HEIGHT2", pIconHeight2);
			cmd.addParameter("@P_ICON_WIDTH2", pIconWidth2);
			cmd.addParameter("@P_ICON_HEIGHT3", pIconHeight3);
			cmd.addParameter("@P_ICON_WIDTH3", pIconWidth3);
			cmd.addParameter("@P_ICON_BAR_DISP_COND", pIconBarDispCond);
			cmd.addParameter("@P_ICON_BAR_DISP_COND_TYPE", pIconBarDispCondType);
			cmd.addParameter("@P_ICON_BAR_FLOW_COND_INSTR", pIconBarFlowCondInstr);
			cmd.addParameter("@P_BEGINS_ON_NEW_LINE", pBeginsOnNewLine);
			cmd.addParameter("@P_CELL_COLSPAN", pCellColspan);
			cmd.addParameter("@P_ONCLICK", pOnclick);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ICON_BAR_COMMENT", pIconBarComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createImage(NNumber pId,NNumber pFlowId,NString pImageName,NString pNationalLanguage,NNumber pHeight,NNumber pWidth,NString pNotes,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_IMAGE_NAME", pImageName);
			cmd.addParameter("@P_NATIONAL_LANGUAGE", pNationalLanguage);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_NOTES", pNotes);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createInstall(NNumber pId,NNumber pFlowId,NString pIncludeInExportYn,NString pWelcomeMessage,NString pLicenseMessage,NString pConfigurationMessage,NString pBuildOptionsMessage,NString pValidationMessage,NString pInstallMessage,NString pInstallSuccessMessage,NString pInstallFailureMessage,NString pUpgradeMessage,NString pUpgradeConfirmMessage,NString pUpgradeSuccessMessage,NString pUpgradeFailureMessage,NString pGetVersionSqlQuery,NString pDeinstallMessage,NString pDeinstallSuccessMessage,NString pDeinstallFailureMessage,NString pDeinstallScriptClob,NString pPromptSubString01,NString pPromptSubString02,NString pPromptSubString03,NString pPromptSubString04,NString pPromptSubString05,NString pPromptSubString06,NString pPromptSubString07,NString pPromptSubString08,NString pPromptSubString09,NString pPromptSubString10,NString pPromptSubString11,NString pPromptSubString12,NString pPromptSubString13,NString pPromptSubString14,NString pPromptSubString15,NString pPromptSubString16,NString pPromptSubString17,NString pPromptSubString18,NString pPromptSubString19,NString pPromptSubString20,NString pInstallPrompt01,NString pInstallPrompt02,NString pInstallPrompt03,NString pInstallPrompt04,NString pInstallPrompt05,NString pInstallPrompt06,NString pInstallPrompt07,NString pInstallPrompt08,NString pInstallPrompt09,NString pInstallPrompt10,NString pInstallPrompt11,NString pInstallPrompt12,NString pInstallPrompt13,NString pInstallPrompt14,NString pInstallPrompt15,NString pInstallPrompt16,NString pInstallPrompt17,NString pInstallPrompt18,NString pInstallPrompt19,NString pInstallPrompt20,NString pPromptIfMultAuthYn,NString pTriggerInstallWhenCond,NString pTriggerInstallWhenExp1,NString pTriggerInstallWhenExp2,NString pTriggerFailureMessage,NNumber pRequiredFreeKb,NString pRequiredSysPrivs,NString pRequiredNamesAvailable,NString pLastUpdatedBy,NDate pLastUpdatedOn,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_INSTALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_INCLUDE_IN_EXPORT_YN", pIncludeInExportYn);
			cmd.addParameter("@P_WELCOME_MESSAGE", pWelcomeMessage);
			cmd.addParameter("@P_LICENSE_MESSAGE", pLicenseMessage);
			cmd.addParameter("@P_CONFIGURATION_MESSAGE", pConfigurationMessage);
			cmd.addParameter("@P_BUILD_OPTIONS_MESSAGE", pBuildOptionsMessage);
			cmd.addParameter("@P_VALIDATION_MESSAGE", pValidationMessage);
			cmd.addParameter("@P_INSTALL_MESSAGE", pInstallMessage);
			cmd.addParameter("@P_INSTALL_SUCCESS_MESSAGE", pInstallSuccessMessage);
			cmd.addParameter("@P_INSTALL_FAILURE_MESSAGE", pInstallFailureMessage);
			cmd.addParameter("@P_UPGRADE_MESSAGE", pUpgradeMessage);
			cmd.addParameter("@P_UPGRADE_CONFIRM_MESSAGE", pUpgradeConfirmMessage);
			cmd.addParameter("@P_UPGRADE_SUCCESS_MESSAGE", pUpgradeSuccessMessage);
			cmd.addParameter("@P_UPGRADE_FAILURE_MESSAGE", pUpgradeFailureMessage);
			cmd.addParameter("@P_GET_VERSION_SQL_QUERY", pGetVersionSqlQuery);
			cmd.addParameter("@P_DEINSTALL_MESSAGE", pDeinstallMessage);
			cmd.addParameter("@P_DEINSTALL_SUCCESS_MESSAGE", pDeinstallSuccessMessage);
			cmd.addParameter("@P_DEINSTALL_FAILURE_MESSAGE", pDeinstallFailureMessage);
			cmd.addParameter("@P_DEINSTALL_SCRIPT_CLOB", pDeinstallScriptClob);
			cmd.addParameter("@P_PROMPT_SUB_STRING_01", pPromptSubString01);
			cmd.addParameter("@P_PROMPT_SUB_STRING_02", pPromptSubString02);
			cmd.addParameter("@P_PROMPT_SUB_STRING_03", pPromptSubString03);
			cmd.addParameter("@P_PROMPT_SUB_STRING_04", pPromptSubString04);
			cmd.addParameter("@P_PROMPT_SUB_STRING_05", pPromptSubString05);
			cmd.addParameter("@P_PROMPT_SUB_STRING_06", pPromptSubString06);
			cmd.addParameter("@P_PROMPT_SUB_STRING_07", pPromptSubString07);
			cmd.addParameter("@P_PROMPT_SUB_STRING_08", pPromptSubString08);
			cmd.addParameter("@P_PROMPT_SUB_STRING_09", pPromptSubString09);
			cmd.addParameter("@P_PROMPT_SUB_STRING_10", pPromptSubString10);
			cmd.addParameter("@P_PROMPT_SUB_STRING_11", pPromptSubString11);
			cmd.addParameter("@P_PROMPT_SUB_STRING_12", pPromptSubString12);
			cmd.addParameter("@P_PROMPT_SUB_STRING_13", pPromptSubString13);
			cmd.addParameter("@P_PROMPT_SUB_STRING_14", pPromptSubString14);
			cmd.addParameter("@P_PROMPT_SUB_STRING_15", pPromptSubString15);
			cmd.addParameter("@P_PROMPT_SUB_STRING_16", pPromptSubString16);
			cmd.addParameter("@P_PROMPT_SUB_STRING_17", pPromptSubString17);
			cmd.addParameter("@P_PROMPT_SUB_STRING_18", pPromptSubString18);
			cmd.addParameter("@P_PROMPT_SUB_STRING_19", pPromptSubString19);
			cmd.addParameter("@P_PROMPT_SUB_STRING_20", pPromptSubString20);
			cmd.addParameter("@P_INSTALL_PROMPT_01", pInstallPrompt01);
			cmd.addParameter("@P_INSTALL_PROMPT_02", pInstallPrompt02);
			cmd.addParameter("@P_INSTALL_PROMPT_03", pInstallPrompt03);
			cmd.addParameter("@P_INSTALL_PROMPT_04", pInstallPrompt04);
			cmd.addParameter("@P_INSTALL_PROMPT_05", pInstallPrompt05);
			cmd.addParameter("@P_INSTALL_PROMPT_06", pInstallPrompt06);
			cmd.addParameter("@P_INSTALL_PROMPT_07", pInstallPrompt07);
			cmd.addParameter("@P_INSTALL_PROMPT_08", pInstallPrompt08);
			cmd.addParameter("@P_INSTALL_PROMPT_09", pInstallPrompt09);
			cmd.addParameter("@P_INSTALL_PROMPT_10", pInstallPrompt10);
			cmd.addParameter("@P_INSTALL_PROMPT_11", pInstallPrompt11);
			cmd.addParameter("@P_INSTALL_PROMPT_12", pInstallPrompt12);
			cmd.addParameter("@P_INSTALL_PROMPT_13", pInstallPrompt13);
			cmd.addParameter("@P_INSTALL_PROMPT_14", pInstallPrompt14);
			cmd.addParameter("@P_INSTALL_PROMPT_15", pInstallPrompt15);
			cmd.addParameter("@P_INSTALL_PROMPT_16", pInstallPrompt16);
			cmd.addParameter("@P_INSTALL_PROMPT_17", pInstallPrompt17);
			cmd.addParameter("@P_INSTALL_PROMPT_18", pInstallPrompt18);
			cmd.addParameter("@P_INSTALL_PROMPT_19", pInstallPrompt19);
			cmd.addParameter("@P_INSTALL_PROMPT_20", pInstallPrompt20);
			cmd.addParameter("@P_PROMPT_IF_MULT_AUTH_YN", pPromptIfMultAuthYn);
			cmd.addParameter("@P_TRIGGER_INSTALL_WHEN_COND", pTriggerInstallWhenCond);
			cmd.addParameter("@P_TRIGGER_INSTALL_WHEN_EXP1", pTriggerInstallWhenExp1);
			cmd.addParameter("@P_TRIGGER_INSTALL_WHEN_EXP2", pTriggerInstallWhenExp2);
			cmd.addParameter("@P_TRIGGER_FAILURE_MESSAGE", pTriggerFailureMessage);
			cmd.addParameter("@P_REQUIRED_FREE_KB", pRequiredFreeKb);
			cmd.addParameter("@P_REQUIRED_SYS_PRIVS", pRequiredSysPrivs);
			cmd.addParameter("@P_REQUIRED_NAMES_AVAILABLE", pRequiredNamesAvailable);
			cmd.addParameter("@P_LAST_UPDATED_BY", pLastUpdatedBy);
			cmd.addParameter("@P_LAST_UPDATED_ON", pLastUpdatedOn);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createInstallBuildOption(NNumber pId,NNumber pFlowId,NNumber pSecurityGroupId,NNumber pInstallId,NNumber pBuildOptId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_INSTALL_BUILD_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_INSTALL_ID", pInstallId);
			cmd.addParameter("@P_BUILD_OPT_ID", pBuildOptId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createInstallCheck(NNumber pId,NNumber pFlowId,NNumber pSecurityGroupId,NNumber pInstallId,NString pName,NNumber pSequence,NString pCheckType,NString pCheckCondition,NString pCheckCondition2,NString pFailureMessage,NString pConditionType,NString pCondition,NString pCondition2,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_INSTALL_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_INSTALL_ID", pInstallId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SEQUENCE", pSequence);
			cmd.addParameter("@P_CHECK_TYPE", pCheckType);
			cmd.addParameter("@P_CHECK_CONDITION", pCheckCondition);
			cmd.addParameter("@P_CHECK_CONDITION2", pCheckCondition2);
			cmd.addParameter("@P_FAILURE_MESSAGE", pFailureMessage);
			cmd.addParameter("@P_CONDITION_TYPE", pConditionType);
			cmd.addParameter("@P_CONDITION", pCondition);
			cmd.addParameter("@P_CONDITION2", pCondition2);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createInstallScript(NNumber pId,NNumber pFlowId,NNumber pSecurityGroupId,NNumber pInstallId,NString pName,NNumber pSequence,NString pScriptType,NString pScriptClob,NString pConditionType,NString pCondition,NString pCondition2,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_INSTALL_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_INSTALL_ID", pInstallId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SEQUENCE", pSequence);
			cmd.addParameter("@P_SCRIPT_TYPE", pScriptType);
			cmd.addParameter("@P_SCRIPT_CLOB", pScriptClob);
			cmd.addParameter("@P_CONDITION_TYPE", pConditionType);
			cmd.addParameter("@P_CONDITION", pCondition);
			cmd.addParameter("@P_CONDITION2", pCondition2);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createLanguageMap(NNumber pId,NNumber pPrimaryLanguageFlowId,NNumber pTranslationFlowId,NString pTranslationFlowLanguageCd,NString pTranslationImageDirectory,NString pTranslationComments,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_LANGUAGE_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PRIMARY_LANGUAGE_FLOW_ID", pPrimaryLanguageFlowId);
			cmd.addParameter("@P_TRANSLATION_FLOW_ID", pTranslationFlowId);
			cmd.addParameter("@P_TRANSLATION_FLOW_LANGUAGE_CD", pTranslationFlowLanguageCd);
			cmd.addParameter("@P_TRANSLATION_IMAGE_DIRECTORY", pTranslationImageDirectory);
			cmd.addParameter("@P_TRANSLATION_COMMENTS", pTranslationComments);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createList(NNumber pId,NNumber pFlowId,NString pName,NString pListStatus,NString pListDisplayed,NNumber pDisplayRowTemplateId,NNumber pRequiredPatch,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LIST_STATUS", pListStatus);
			cmd.addParameter("@P_LIST_DISPLAYED", pListDisplayed);
			cmd.addParameter("@P_DISPLAY_ROW_TEMPLATE_ID", pDisplayRowTemplateId);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createListItem(NNumber pId,NNumber pListId,NString pListItemType,NString pListItemStatus,NString pItemDisplayed,NNumber pListItemDisplaySequence,NString pListItemLinkText,NString pListItemLinkTarget,NString pListItemIcon,NString pListItemIconAttributes,NString pListItemDispCondType,NString pListItemDispCondition,NString pListItemDispCondType2,NString pListItemDispCondition2,NString pListItemIconExp,NString pListItemIconExpAttr,NNumber pListItemParentId,NNumber pParentListItemId,NNumber pSubItemCount,NString pListCountclicksYN,NString pListCountclicksCat,NString pListText01,NString pListText02,NString pListText03,NString pListText04,NString pListText05,NString pListText06,NString pListText07,NString pListText08,NString pListText09,NString pListText10,NString pListItemOwner,NString pListItemCurrentForPages,NString pListItemCurrentType,NString pSecurityScheme,NNumber pRequiredPatch,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_LIST_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LIST_ID", pListId);
			cmd.addParameter("@P_LIST_ITEM_TYPE", pListItemType);
			cmd.addParameter("@P_LIST_ITEM_STATUS", pListItemStatus);
			cmd.addParameter("@P_ITEM_DISPLAYED", pItemDisplayed);
			cmd.addParameter("@P_LIST_ITEM_DISPLAY_SEQUENCE", pListItemDisplaySequence);
			cmd.addParameter("@P_LIST_ITEM_LINK_TEXT", pListItemLinkText);
			cmd.addParameter("@P_LIST_ITEM_LINK_TARGET", pListItemLinkTarget);
			cmd.addParameter("@P_LIST_ITEM_ICON", pListItemIcon);
			cmd.addParameter("@P_LIST_ITEM_ICON_ATTRIBUTES", pListItemIconAttributes);
			cmd.addParameter("@P_LIST_ITEM_DISP_COND_TYPE", pListItemDispCondType);
			cmd.addParameter("@P_LIST_ITEM_DISP_CONDITION", pListItemDispCondition);
			cmd.addParameter("@P_LIST_ITEM_DISP_COND_TYPE2", pListItemDispCondType2);
			cmd.addParameter("@P_LIST_ITEM_DISP_CONDITION2", pListItemDispCondition2);
			cmd.addParameter("@P_LIST_ITEM_ICON_EXP", pListItemIconExp);
			cmd.addParameter("@P_LIST_ITEM_ICON_EXP_ATTR", pListItemIconExpAttr);
			cmd.addParameter("@P_LIST_ITEM_PARENT_ID", pListItemParentId);
			cmd.addParameter("@P_PARENT_LIST_ITEM_ID", pParentListItemId);
			cmd.addParameter("@P_SUB_ITEM_COUNT", pSubItemCount);
			cmd.addParameter("@P_LIST_COUNTCLICKS_Y_N", pListCountclicksYN);
			cmd.addParameter("@P_LIST_COUNTCLICKS_CAT", pListCountclicksCat);
			cmd.addParameter("@P_LIST_TEXT_01", pListText01);
			cmd.addParameter("@P_LIST_TEXT_02", pListText02);
			cmd.addParameter("@P_LIST_TEXT_03", pListText03);
			cmd.addParameter("@P_LIST_TEXT_04", pListText04);
			cmd.addParameter("@P_LIST_TEXT_05", pListText05);
			cmd.addParameter("@P_LIST_TEXT_06", pListText06);
			cmd.addParameter("@P_LIST_TEXT_07", pListText07);
			cmd.addParameter("@P_LIST_TEXT_08", pListText08);
			cmd.addParameter("@P_LIST_TEXT_09", pListText09);
			cmd.addParameter("@P_LIST_TEXT_10", pListText10);
			cmd.addParameter("@P_LIST_ITEM_OWNER", pListItemOwner);
			cmd.addParameter("@P_LIST_ITEM_CURRENT_FOR_PAGES", pListItemCurrentForPages);
			cmd.addParameter("@P_LIST_ITEM_CURRENT_TYPE", pListItemCurrentType);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createListOfValues(NNumber pId,NNumber pFlowId,NString pLovName,NString pLovQuery,NNumber pReferenceId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_LIST_OF_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createListTemplate(NNumber pId,NNumber pFlowId,NString pListTemplateName,NString pListTemplateCurrent,NString pListTemplateNoncurrent,NString pListTemplateBeforeRows,NString pListTemplateAfterRows,NString pBetweenItems,NString pBeforeSubList,NString pAfterSubList,NString pBetweenSubListItems,NString pSubListItemCurrent,NString pSubListItemNoncurrent,NString pItemTemplCurrWChild,NString pItemTemplNoncurrWChild,NString pSubTemplCurrWChild,NString pSubTemplNoncurrWChild,NNumber pReferenceId,NString pTranslateThisTemplate,NString pListTemplateComment,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_LIST_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LIST_TEMPLATE_NAME", pListTemplateName);
			cmd.addParameter("@P_LIST_TEMPLATE_CURRENT", pListTemplateCurrent);
			cmd.addParameter("@P_LIST_TEMPLATE_NONCURRENT", pListTemplateNoncurrent);
			cmd.addParameter("@P_LIST_TEMPLATE_BEFORE_ROWS", pListTemplateBeforeRows);
			cmd.addParameter("@P_LIST_TEMPLATE_AFTER_ROWS", pListTemplateAfterRows);
			cmd.addParameter("@P_BETWEEN_ITEMS", pBetweenItems);
			cmd.addParameter("@P_BEFORE_SUB_LIST", pBeforeSubList);
			cmd.addParameter("@P_AFTER_SUB_LIST", pAfterSubList);
			cmd.addParameter("@P_BETWEEN_SUB_LIST_ITEMS", pBetweenSubListItems);
			cmd.addParameter("@P_SUB_LIST_ITEM_CURRENT", pSubListItemCurrent);
			cmd.addParameter("@P_SUB_LIST_ITEM_NONCURRENT", pSubListItemNoncurrent);
			cmd.addParameter("@P_ITEM_TEMPL_CURR_W_CHILD", pItemTemplCurrWChild);
			cmd.addParameter("@P_ITEM_TEMPL_NONCURR_W_CHILD", pItemTemplNoncurrWChild);
			cmd.addParameter("@P_SUB_TEMPL_CURR_W_CHILD", pSubTemplCurrWChild);
			cmd.addParameter("@P_SUB_TEMPL_NONCURR_W_CHILD", pSubTemplNoncurrWChild);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_LIST_TEMPLATE_COMMENT", pListTemplateComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createMenu(NNumber pId,NNumber pFlowId,NString pName,NNumber pSecurityGroupId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_MENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createMenuOption(NNumber pId,NNumber pParentId,NNumber pMenuId,NNumber pOptionSequence,NString pShortName,NString pLongName,NString pLink,NNumber pPageId,NString pAlsoCurrentForPages,NString pDisplayWhenCondType,NString pDisplayWhenCondition,NString pDisplayWhenCondition2,NString pSecurityScheme,NNumber pRequiredPatch,NNumber pSecurityGroupId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_MENU_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PARENT_ID", pParentId);
			cmd.addParameter("@P_MENU_ID", pMenuId);
			cmd.addParameter("@P_OPTION_SEQUENCE", pOptionSequence);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_LONG_NAME", pLongName);
			cmd.addParameter("@P_LINK", pLink);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_ALSO_CURRENT_FOR_PAGES", pAlsoCurrentForPages);
			cmd.addParameter("@P_DISPLAY_WHEN_COND_TYPE", pDisplayWhenCondType);
			cmd.addParameter("@P_DISPLAY_WHEN_CONDITION", pDisplayWhenCondition);
			cmd.addParameter("@P_DISPLAY_WHEN_CONDITION2", pDisplayWhenCondition2);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createMenuTemplate(NNumber pId,NNumber pFlowId,NString pName,NString pBeforeFirst,NString pCurrentPageOption,NString pNonCurrentPageOption,NString pMenuLinkAttributes,NString pBetweenLevels,NString pAfterLast,NNumber pMaxLevels,NString pStartWithNode,NString pTranslateThisTemplate,NString pTemplateComments,NNumber pSecurityGroupId,NNumber pReferenceId,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_MENU_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_BEFORE_FIRST", pBeforeFirst);
			cmd.addParameter("@P_CURRENT_PAGE_OPTION", pCurrentPageOption);
			cmd.addParameter("@P_NON_CURRENT_PAGE_OPTION", pNonCurrentPageOption);
			cmd.addParameter("@P_MENU_LINK_ATTRIBUTES", pMenuLinkAttributes);
			cmd.addParameter("@P_BETWEEN_LEVELS", pBetweenLevels);
			cmd.addParameter("@P_AFTER_LAST", pAfterLast);
			cmd.addParameter("@P_MAX_LEVELS", pMaxLevels);
			cmd.addParameter("@P_START_WITH_NODE", pStartWithNode);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_TEMPLATE_COMMENTS", pTemplateComments);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createMessage(NNumber pId,NNumber pFlowId,NString pName,NString pMessageLanguage,NString pMessageText,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_MESSAGE_LANGUAGE", pMessageLanguage);
			cmd.addParameter("@P_MESSAGE_TEXT", pMessageText);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
//		public static void createOrRemoveFile(NString pName,List<DbmsSql.Varchar2TableRow> pVarchar2Table,NString pMimetype,NString pLocation,NNumber pFlowId,NString pNlang,NNumber pHeight,NNumber pWidth,NString pNotes,NString pMode,NString pType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_OR_REMOVE_FILE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_NAME", pName);
//			// cmd.addParameter(DbTypes.getTableType("P_VARCHAR2_TABLE", "", pVarchar2Table, object.class));
//			cmd.addParameter("@P_MIMETYPE", pMimetype);
//			cmd.addParameter("@P_LOCATION", pLocation);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_NLANG", pNlang);
//			cmd.addParameter("@P_HEIGHT", pHeight);
//			cmd.addParameter("@P_WIDTH", pWidth);
//			cmd.addParameter("@P_NOTES", pNotes);
//			cmd.addParameter("@P_MODE", pMode);
//			cmd.addParameter("@P_TYPE", pType);
//				
//			cmd.execute();
//
//
//		}
		
		public static void createPage(NNumber pId,NNumber pFlowId,NString pTabSet,NString pName,NString pAlias,NString pStepTitle,NString pStepSubTitle,NString pStepSubTitleType,NString pFirstItem,NString pWelcomeText,NString pBoxWelcomeText,NString pBoxFooterText,NString pFooterText,NString pHelpText,NNumber pStepTemplate,NString pBoxImage,NString pRequiredRole,NNumber pRequiredPatch,NString pAllowDuplicateSubmissions,NString pOnDupSubmissionGotoUrl,NString pHtmlPageHeader,NString pHtmlPageOnload,NString pPageIsProtectedYN,NString pPageIsPublicYN,NString pProtectionLevel,NString pErrorNotificationText,NString pPageComment,NString pTabName,NString pAutoTabSet,NString pAutoTabText,NString pAutoParentTabSet,NString pAutoParentTabText,NString pCachePageYn,NNumber pCacheTimeoutSeconds,NString pCacheByUserYn,NString pCacheWhenConditionType,NString pCacheWhenConditionE1,NString pCacheWhenConditionE2,NNumber pGroupId,NString pLastUpdatedBy,NString pLastUpdYyyymmddhh24miss,NString pCreatedBy,NString pCreatedOnYyyymmddhh24miss,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_ALIAS", pAlias);
			cmd.addParameter("@P_STEP_TITLE", pStepTitle);
			cmd.addParameter("@P_STEP_SUB_TITLE", pStepSubTitle);
			cmd.addParameter("@P_STEP_SUB_TITLE_TYPE", pStepSubTitleType);
			cmd.addParameter("@P_FIRST_ITEM", pFirstItem);
			cmd.addParameter("@P_WELCOME_TEXT", pWelcomeText);
			cmd.addParameter("@P_BOX_WELCOME_TEXT", pBoxWelcomeText);
			cmd.addParameter("@P_BOX_FOOTER_TEXT", pBoxFooterText);
			cmd.addParameter("@P_FOOTER_TEXT", pFooterText);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_STEP_TEMPLATE", pStepTemplate);
			cmd.addParameter("@P_BOX_IMAGE", pBoxImage);
			cmd.addParameter("@P_REQUIRED_ROLE", pRequiredRole);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ALLOW_DUPLICATE_SUBMISSIONS", pAllowDuplicateSubmissions);
			cmd.addParameter("@P_ON_DUP_SUBMISSION_GOTO_URL", pOnDupSubmissionGotoUrl);
			cmd.addParameter("@P_HTML_PAGE_HEADER", pHtmlPageHeader);
			cmd.addParameter("@P_HTML_PAGE_ONLOAD", pHtmlPageOnload);
			cmd.addParameter("@P_PAGE_IS_PROTECTED_Y_N", pPageIsProtectedYN);
			cmd.addParameter("@P_PAGE_IS_PUBLIC_Y_N", pPageIsPublicYN);
			cmd.addParameter("@P_PROTECTION_LEVEL", pProtectionLevel);
			cmd.addParameter("@P_ERROR_NOTIFICATION_TEXT", pErrorNotificationText);
			cmd.addParameter("@P_PAGE_COMMENT", pPageComment);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_AUTO_TAB_SET", pAutoTabSet);
			cmd.addParameter("@P_AUTO_TAB_TEXT", pAutoTabText);
			cmd.addParameter("@P_AUTO_PARENT_TAB_SET", pAutoParentTabSet);
			cmd.addParameter("@P_AUTO_PARENT_TAB_TEXT", pAutoParentTabText);
			cmd.addParameter("@P_CACHE_PAGE_YN", pCachePageYn);
			cmd.addParameter("@P_CACHE_TIMEOUT_SECONDS", pCacheTimeoutSeconds);
			cmd.addParameter("@P_CACHE_BY_USER_YN", pCacheByUserYn);
			cmd.addParameter("@P_CACHE_WHEN_CONDITION_TYPE", pCacheWhenConditionType);
			cmd.addParameter("@P_CACHE_WHEN_CONDITION_E1", pCacheWhenConditionE1);
			cmd.addParameter("@P_CACHE_WHEN_CONDITION_E2", pCacheWhenConditionE2);
			cmd.addParameter("@P_GROUP_ID", pGroupId);
			cmd.addParameter("@P_LAST_UPDATED_BY", pLastUpdatedBy);
			cmd.addParameter("@P_LAST_UPD_YYYYMMDDHH24MISS", pLastUpdYyyymmddhh24miss);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_ON_YYYYMMDDHH24MISS", pCreatedOnYyyymmddhh24miss);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageBranch(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NString pBranchAction,NString pBranchPoint,NString pBranchType,NNumber pBranchWhenButtonId,NNumber pBranchSequence,NString pBranchConditionType,NString pBranchCondition,NString pBranchConditionText,NString pSecurityScheme,NNumber pRequiredPatch,NString pBranchComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_BRANCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_BRANCH_ACTION", pBranchAction);
			cmd.addParameter("@P_BRANCH_POINT", pBranchPoint);
			cmd.addParameter("@P_BRANCH_TYPE", pBranchType);
			cmd.addParameter("@P_BRANCH_WHEN_BUTTON_ID", pBranchWhenButtonId);
			cmd.addParameter("@P_BRANCH_SEQUENCE", pBranchSequence);
			cmd.addParameter("@P_BRANCH_CONDITION_TYPE", pBranchConditionType);
			cmd.addParameter("@P_BRANCH_CONDITION", pBranchCondition);
			cmd.addParameter("@P_BRANCH_CONDITION_TEXT", pBranchConditionText);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_BRANCH_COMMENT", pBranchComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageBranchArgs(NNumber pId,NNumber pFlowStepBranchId,NNumber pBranchArgSequence,NString pBranchArgSourceType,NString pBranchArgSource,NString pBranchArgComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_BRANCH_ARGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_STEP_BRANCH_ID", pFlowStepBranchId);
			cmd.addParameter("@P_BRANCH_ARG_SEQUENCE", pBranchArgSequence);
			cmd.addParameter("@P_BRANCH_ARG_SOURCE_TYPE", pBranchArgSourceType);
			cmd.addParameter("@P_BRANCH_ARG_SOURCE", pBranchArgSource);
			cmd.addParameter("@P_BRANCH_ARG_COMMENT", pBranchArgComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageButton(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NNumber pButtonSequence,NNumber pButtonPlugId,NString pButtonName,NString pButtonImage,NString pButtonImageAlt,NString pButtonPosition,NString pButtonAlignment,NString pButtonRedirectUrl,NString pButtonCondition,NString pButtonCondition2,NString pButtonConditionType,NString pButtonImageAttributes,NString pButtonCattributes,NString pSecurityScheme,NNumber pRequiredPatch,NString pButtonComment,NNumber pIdOffset,NString pTarget,NString pDatabaseAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_BUTTON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_BUTTON_SEQUENCE", pButtonSequence);
			cmd.addParameter("@P_BUTTON_PLUG_ID", pButtonPlugId);
			cmd.addParameter("@P_BUTTON_NAME", pButtonName);
			cmd.addParameter("@P_BUTTON_IMAGE", pButtonImage);
			cmd.addParameter("@P_BUTTON_IMAGE_ALT", pButtonImageAlt);
			cmd.addParameter("@P_BUTTON_POSITION", pButtonPosition);
			cmd.addParameter("@P_BUTTON_ALIGNMENT", pButtonAlignment);
			cmd.addParameter("@P_BUTTON_REDIRECT_URL", pButtonRedirectUrl);
			cmd.addParameter("@P_BUTTON_CONDITION", pButtonCondition);
			cmd.addParameter("@P_BUTTON_CONDITION2", pButtonCondition2);
			cmd.addParameter("@P_BUTTON_CONDITION_TYPE", pButtonConditionType);
			cmd.addParameter("@P_BUTTON_IMAGE_ATTRIBUTES", pButtonImageAttributes);
			cmd.addParameter("@P_BUTTON_CATTRIBUTES", pButtonCattributes);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_BUTTON_COMMENT", pButtonComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_DATABASE_ACTION", pDatabaseAction);
				
			cmd.execute();


		}
		
		public static void createPageComputation(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NNumber pComputationSequence,NString pComputationItem,NString pComputationPoint,NString pComputationItemType,NString pComputationType,NString pComputationProcessed,NString pComputation,NString pComputationComment,NString pComputeWhen,NString pComputeWhenType,NString pComputationErrorMessage,NString pComputeWhenText,NString pSecurityScheme,NNumber pRequiredPatch,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_COMPUTATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_COMPUTATION_SEQUENCE", pComputationSequence);
			cmd.addParameter("@P_COMPUTATION_ITEM", pComputationItem);
			cmd.addParameter("@P_COMPUTATION_POINT", pComputationPoint);
			cmd.addParameter("@P_COMPUTATION_ITEM_TYPE", pComputationItemType);
			cmd.addParameter("@P_COMPUTATION_TYPE", pComputationType);
			cmd.addParameter("@P_COMPUTATION_PROCESSED", pComputationProcessed);
			cmd.addParameter("@P_COMPUTATION", pComputation);
			cmd.addParameter("@P_COMPUTATION_COMMENT", pComputationComment);
			cmd.addParameter("@P_COMPUTE_WHEN", pComputeWhen);
			cmd.addParameter("@P_COMPUTE_WHEN_TYPE", pComputeWhenType);
			cmd.addParameter("@P_COMPUTATION_ERROR_MESSAGE", pComputationErrorMessage);
			cmd.addParameter("@P_COMPUTE_WHEN_TEXT", pComputeWhenText);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageGroup(NNumber pId,NNumber pFlowId,NString pGroupName,NString pGroupDesc,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_GROUP_DESC", pGroupDesc);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageHelp(NNumber pId,NNumber pFlowId,NString pHelpText,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_HELP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageItem(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NString pName,NString pDataType,NString pAcceptProcessing,NNumber pItemSequence,NNumber pItemPlugId,NString pUseCacheBeforeDefault,NString pItemDefault,NString pItemDefaultType,NString pPrompt,NString pPreElementText,NString pPostElementText,NString pFormatMask,NString pSource,NString pSourceType,NString pSourcePostComputation,NString pDisplayAs,NString pNamedLov,NString pLov,NNumber pLovColumns,NString pLovDisplayExtra,NString pLovDisplayNull,NString pLovNullText,NString pLovNullValue,NString pLovTranslated,NNumber pCsize,NNumber pCmaxlength,NNumber pCheight,NString pCattributes,NString pCattributesElement,NString pTagAttributes,NString pTagAttributes2,NString pBeginOnNewLine,NString pBeginOnNewField,NNumber pColspan,NNumber pRowspan,NString pButtonImage,NString pButtonImageAttr,NString pLabelAlignment,NString pFieldAlignment,NString pFieldTemplate,NString pDisplayWhen,NString pDisplayWhen2,NString pDisplayWhenType,NString pIsPersistent,NString pJavascript,NString pSecurityScheme,NNumber pRequiredPatch,NString pItemComment,NString pHelpText,NString pReadOnlyWhen,NString pReadOnlyWhen2,NString pReadOnlyWhenType,NString pReadOnlyDispAttr,NString pProtectionLevel,NString pEscapeOnHttpInput,NNumber pReferenceId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_ACCEPT_PROCESSING", pAcceptProcessing);
			cmd.addParameter("@P_ITEM_SEQUENCE", pItemSequence);
			cmd.addParameter("@P_ITEM_PLUG_ID", pItemPlugId);
			cmd.addParameter("@P_USE_CACHE_BEFORE_DEFAULT", pUseCacheBeforeDefault);
			cmd.addParameter("@P_ITEM_DEFAULT", pItemDefault);
			cmd.addParameter("@P_ITEM_DEFAULT_TYPE", pItemDefaultType);
			cmd.addParameter("@P_PROMPT", pPrompt);
			cmd.addParameter("@P_PRE_ELEMENT_TEXT", pPreElementText);
			cmd.addParameter("@P_POST_ELEMENT_TEXT", pPostElementText);
			cmd.addParameter("@P_FORMAT_MASK", pFormatMask);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_SOURCE_POST_COMPUTATION", pSourcePostComputation);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
			cmd.addParameter("@P_NAMED_LOV", pNamedLov);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_LOV_COLUMNS", pLovColumns);
			cmd.addParameter("@P_LOV_DISPLAY_EXTRA", pLovDisplayExtra);
			cmd.addParameter("@P_LOV_DISPLAY_NULL", pLovDisplayNull);
			cmd.addParameter("@P_LOV_NULL_TEXT", pLovNullText);
			cmd.addParameter("@P_LOV_NULL_VALUE", pLovNullValue);
			cmd.addParameter("@P_LOV_TRANSLATED", pLovTranslated);
			cmd.addParameter("@P_CSIZE", pCsize);
			cmd.addParameter("@P_CMAXLENGTH", pCmaxlength);
			cmd.addParameter("@P_CHEIGHT", pCheight);
			cmd.addParameter("@P_CATTRIBUTES", pCattributes);
			cmd.addParameter("@P_CATTRIBUTES_ELEMENT", pCattributesElement);
			cmd.addParameter("@P_TAG_ATTRIBUTES", pTagAttributes);
			cmd.addParameter("@P_TAG_ATTRIBUTES2", pTagAttributes2);
			cmd.addParameter("@P_BEGIN_ON_NEW_LINE", pBeginOnNewLine);
			cmd.addParameter("@P_BEGIN_ON_NEW_FIELD", pBeginOnNewField);
			cmd.addParameter("@P_COLSPAN", pColspan);
			cmd.addParameter("@P_ROWSPAN", pRowspan);
			cmd.addParameter("@P_BUTTON_IMAGE", pButtonImage);
			cmd.addParameter("@P_BUTTON_IMAGE_ATTR", pButtonImageAttr);
			cmd.addParameter("@P_LABEL_ALIGNMENT", pLabelAlignment);
			cmd.addParameter("@P_FIELD_ALIGNMENT", pFieldAlignment);
			cmd.addParameter("@P_FIELD_TEMPLATE", pFieldTemplate);
			cmd.addParameter("@P_DISPLAY_WHEN", pDisplayWhen);
			cmd.addParameter("@P_DISPLAY_WHEN2", pDisplayWhen2);
			cmd.addParameter("@P_DISPLAY_WHEN_TYPE", pDisplayWhenType);
			cmd.addParameter("@P_IS_PERSISTENT", pIsPersistent);
			cmd.addParameter("@P_JAVASCRIPT", pJavascript);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ITEM_COMMENT", pItemComment);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_READ_ONLY_WHEN", pReadOnlyWhen);
			cmd.addParameter("@P_READ_ONLY_WHEN2", pReadOnlyWhen2);
			cmd.addParameter("@P_READ_ONLY_WHEN_TYPE", pReadOnlyWhenType);
			cmd.addParameter("@P_READ_ONLY_DISP_ATTR", pReadOnlyDispAttr);
			cmd.addParameter("@P_PROTECTION_LEVEL", pProtectionLevel);
			cmd.addParameter("@P_ESCAPE_ON_HTTP_INPUT", pEscapeOnHttpInput);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageOnTable(NNumber pFlowId,NNumber pFlowStepId,NString pFormPageName,NString pReportPageName,NString pTableOwner,NString pTableName,NString pTablePkColumnName,NString pOmitColumnList,NString pButtonPosition,NString pReportPageId,NString pReportSelectList,NString pRptPlugTemplate,NString pFormPlugTemplate,NString pWhereClause,NString pPaginationSize,NString pTableBgcolor,NString pHeadingBgcolor,NString pTableBgcolors) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_ON_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_FORM_PAGE_NAME", pFormPageName);
			cmd.addParameter("@P_REPORT_PAGE_NAME", pReportPageName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_TABLE_PK_COLUMN_NAME", pTablePkColumnName);
			cmd.addParameter("@P_OMIT_COLUMN_LIST", pOmitColumnList);
			cmd.addParameter("@P_BUTTON_POSITION", pButtonPosition);
			cmd.addParameter("@P_REPORT_PAGE_ID", pReportPageId);
			cmd.addParameter("@P_REPORT_SELECT_LIST", pReportSelectList);
			cmd.addParameter("@P_RPT_PLUG_TEMPLATE", pRptPlugTemplate);
			cmd.addParameter("@P_FORM_PLUG_TEMPLATE", pFormPlugTemplate);
			cmd.addParameter("@P_WHERE_CLAUSE", pWhereClause);
			cmd.addParameter("@P_PAGINATION_SIZE", pPaginationSize);
			cmd.addParameter("@P_TABLE_BGCOLOR", pTableBgcolor);
			cmd.addParameter("@P_HEADING_BGCOLOR", pHeadingBgcolor);
			cmd.addParameter("@P_TABLE_BGCOLORS", pTableBgcolors);
				
			cmd.execute();


		}
		
		public static void createPagePlug(NNumber pId,NNumber pFlowId,NNumber pPageId,NString pPlugName,NString pRegionName,NNumber pPlugTemplate,NString pPlugDisplaySequence,NString pPlugDisplayColumn,NString pPlugDisplayPoint,NString pPlugSource,NString pPlugSourceType,NString pPlugDisplayErrorMessage,NString pPlugCreateLinkText,NString pPlugCreateLinkTarget,NString pPlugCreateImage,NString pPlugCreateImageAttributes,NString pPlugEditLinkText,NString pPlugEditLinkTarget,NString pPlugEditImage,NString pPlugEditImageAttributes,NString pPlugExpandLinkText,NString pPlugExpandLinkTarget,NString pPlugExpandImage,NString pPlugExpandImageAttributes,NString pPlugCloseLinkText,NString pPlugCloseLinkTarget,NString pPlugCloseImage,NString pPlugCloseImageAttributes,NString pPlugRequiredRole,NString pPlugDisplayWhenCondition,NString pPlugDisplayWhenCond2,NString pPlugDisplayConditionType,NString pPlugHeader,NString pPlugFooter,NString pPlugOverrideRegPos,NString pPlugCustomized,NString pPlugCustomizedName,NString pTranslateTitle,NNumber pPlugQueryRowTemplate,NNumber pPlugQueryMaxColumns,NString pPlugQueryHeadings,NString pPlugQueryHeadingsType,NNumber pPlugQueryNumRows,NString pPlugQueryHitHighlighting,NString pPlugQueryOptions,NString pPlugQueryFormatOut,NString pPlugQueryShowNullsAs,NString pPlugQueryColAllignments,NString pPlugQueryBreakCols,NString pPlugQuerySumCols,NString pPlugQueryNumberFormats,NString pPlugQueryTableBorder,NString pPlugColumnWidth,NString pPlugQueryNoDataFound,NString pPlugQueryMoreData,NNumber pPlugIgnorePagination,NString pPlugQueryNumRowsItem,NString pPlugQueryNumRowsType,NNumber pPlugQueryRowCountMax,NString pPlugQueryAscImage,NString pPlugQueryAscImageAttr,NString pPlugQueryDescImage,NString pPlugQueryDescImageAttr,NString pPlugQueryExpFilename,NString pPlugQueryExpSeparator,NString pPlugQueryExpEnclosedBy,NString pPlugQueryStripHtml,NString pPaginationDisplayPosition,NString pReportTotalTextFormat,NString pBreakColumnTextFormat,NString pBreakBeforeRow,NString pBreakGenericColumn,NString pBreakAfterRow,NString pBreakTypeFlag,NString pBreakRepeatHeadingFormat,NString pCsvOutput,NString pCsvOutputLinkText,NString pPrintUrl,NString pPrintUrlLabel,NString pPrnOutput,NNumber pPrnTemplateId,NString pPrnFormat,NString pPrnFormatItem,NString pPrnOutputShowLink,NString pPrnOutputLinkText,NString pPrnOutputFileName,NString pPrnUnits,NString pPrnPaperSize,NNumber pPrnWidth,NNumber pPrnHeight,NString pPrnOrientation,NString pPrnPageHeader,NString pPrnPageHeaderFontColor,NString pPrnPageHeaderFontFamily,NString pPrnPageHeaderFontWeight,NString pPrnPageHeaderFontSize,NString pPrnPageFooter,NString pPrnPageFooterFontColor,NString pPrnPageFooterFontFamily,NString pPrnPageFooterFontWeight,NString pPrnPageFooterFontSize,NString pPrnHeaderBgColor,NString pPrnHeaderFontColor,NString pPrnHeaderFontFamily,NString pPrnHeaderFontWeight,NString pPrnHeaderFontSize,NString pPrnBodyBgColor,NString pPrnBodyFontColor,NString pPrnBodyFontFamily,NString pPrnBodyFontWeight,NString pPrnBodyFontSize,NNumber pPrnBorderWidth,NNumber pSharedQueryId,NString pPlugUrlTextBegin,NString pPlugUrlTextEnd,NString pJavaEntryPoint,NString pPlugCaching,NString pPlugCachingSessionState,NString pPlugCachingMaxAgeInSec,NString pPlugCacheWhenCondType,NString pPlugCacheWhenConditionE1,NString pPlugCacheWhenConditionE2,NString pPlugChartFontSize,NString pPlugChartMaxRows,NString pPlugChartNumMask,NString pPlugChartScale,NString pPlugChartAxis,NString pPlugChartShowSummary,NNumber pMenuTemplateId,NNumber pListTemplateId,NString pRequiredPatch,NString pPlugComment,NString pUseCustomItemLayout,NString pCustomItemLayout,NString pPrnPageHeaderAlignment,NString pPrnPageFooterAlignment,NString pPrnBorderColor,NString pSortNull,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_PLUG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_PLUG_NAME", pPlugName);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
			cmd.addParameter("@P_PLUG_TEMPLATE", pPlugTemplate);
			cmd.addParameter("@P_PLUG_DISPLAY_SEQUENCE", pPlugDisplaySequence);
			cmd.addParameter("@P_PLUG_DISPLAY_COLUMN", pPlugDisplayColumn);
			cmd.addParameter("@P_PLUG_DISPLAY_POINT", pPlugDisplayPoint);
			cmd.addParameter("@P_PLUG_SOURCE", pPlugSource);
			cmd.addParameter("@P_PLUG_SOURCE_TYPE", pPlugSourceType);
			cmd.addParameter("@P_PLUG_DISPLAY_ERROR_MESSAGE", pPlugDisplayErrorMessage);
			cmd.addParameter("@P_PLUG_CREATE_LINK_TEXT", pPlugCreateLinkText);
			cmd.addParameter("@P_PLUG_CREATE_LINK_TARGET", pPlugCreateLinkTarget);
			cmd.addParameter("@P_PLUG_CREATE_IMAGE", pPlugCreateImage);
			cmd.addParameter("@P_PLUG_CREATE_IMAGE_ATTRIBUTES", pPlugCreateImageAttributes);
			cmd.addParameter("@P_PLUG_EDIT_LINK_TEXT", pPlugEditLinkText);
			cmd.addParameter("@P_PLUG_EDIT_LINK_TARGET", pPlugEditLinkTarget);
			cmd.addParameter("@P_PLUG_EDIT_IMAGE", pPlugEditImage);
			cmd.addParameter("@P_PLUG_EDIT_IMAGE_ATTRIBUTES", pPlugEditImageAttributes);
			cmd.addParameter("@P_PLUG_EXPAND_LINK_TEXT", pPlugExpandLinkText);
			cmd.addParameter("@P_PLUG_EXPAND_LINK_TARGET", pPlugExpandLinkTarget);
			cmd.addParameter("@P_PLUG_EXPAND_IMAGE", pPlugExpandImage);
			cmd.addParameter("@P_PLUG_EXPAND_IMAGE_ATTRIBUTES", pPlugExpandImageAttributes);
			cmd.addParameter("@P_PLUG_CLOSE_LINK_TEXT", pPlugCloseLinkText);
			cmd.addParameter("@P_PLUG_CLOSE_LINK_TARGET", pPlugCloseLinkTarget);
			cmd.addParameter("@P_PLUG_CLOSE_IMAGE", pPlugCloseImage);
			cmd.addParameter("@P_PLUG_CLOSE_IMAGE_ATTRIBUTES", pPlugCloseImageAttributes);
			cmd.addParameter("@P_PLUG_REQUIRED_ROLE", pPlugRequiredRole);
			cmd.addParameter("@P_PLUG_DISPLAY_WHEN_CONDITION", pPlugDisplayWhenCondition);
			cmd.addParameter("@P_PLUG_DISPLAY_WHEN_COND2", pPlugDisplayWhenCond2);
			cmd.addParameter("@P_PLUG_DISPLAY_CONDITION_TYPE", pPlugDisplayConditionType);
			cmd.addParameter("@P_PLUG_HEADER", pPlugHeader);
			cmd.addParameter("@P_PLUG_FOOTER", pPlugFooter);
			cmd.addParameter("@P_PLUG_OVERRIDE_REG_POS", pPlugOverrideRegPos);
			cmd.addParameter("@P_PLUG_CUSTOMIZED", pPlugCustomized);
			cmd.addParameter("@P_PLUG_CUSTOMIZED_NAME", pPlugCustomizedName);
			cmd.addParameter("@P_TRANSLATE_TITLE", pTranslateTitle);
			cmd.addParameter("@P_PLUG_QUERY_ROW_TEMPLATE", pPlugQueryRowTemplate);
			cmd.addParameter("@P_PLUG_QUERY_MAX_COLUMNS", pPlugQueryMaxColumns);
			cmd.addParameter("@P_PLUG_QUERY_HEADINGS", pPlugQueryHeadings);
			cmd.addParameter("@P_PLUG_QUERY_HEADINGS_TYPE", pPlugQueryHeadingsType);
			cmd.addParameter("@P_PLUG_QUERY_NUM_ROWS", pPlugQueryNumRows);
			cmd.addParameter("@P_PLUG_QUERY_HIT_HIGHLIGHTING", pPlugQueryHitHighlighting);
			cmd.addParameter("@P_PLUG_QUERY_OPTIONS", pPlugQueryOptions);
			cmd.addParameter("@P_PLUG_QUERY_FORMAT_OUT", pPlugQueryFormatOut);
			cmd.addParameter("@P_PLUG_QUERY_SHOW_NULLS_AS", pPlugQueryShowNullsAs);
			cmd.addParameter("@P_PLUG_QUERY_COL_ALLIGNMENTS", pPlugQueryColAllignments);
			cmd.addParameter("@P_PLUG_QUERY_BREAK_COLS", pPlugQueryBreakCols);
			cmd.addParameter("@P_PLUG_QUERY_SUM_COLS", pPlugQuerySumCols);
			cmd.addParameter("@P_PLUG_QUERY_NUMBER_FORMATS", pPlugQueryNumberFormats);
			cmd.addParameter("@P_PLUG_QUERY_TABLE_BORDER", pPlugQueryTableBorder);
			cmd.addParameter("@P_PLUG_COLUMN_WIDTH", pPlugColumnWidth);
			cmd.addParameter("@P_PLUG_QUERY_NO_DATA_FOUND", pPlugQueryNoDataFound);
			cmd.addParameter("@P_PLUG_QUERY_MORE_DATA", pPlugQueryMoreData);
			cmd.addParameter("@P_PLUG_IGNORE_PAGINATION", pPlugIgnorePagination);
			cmd.addParameter("@P_PLUG_QUERY_NUM_ROWS_ITEM", pPlugQueryNumRowsItem);
			cmd.addParameter("@P_PLUG_QUERY_NUM_ROWS_TYPE", pPlugQueryNumRowsType);
			cmd.addParameter("@P_PLUG_QUERY_ROW_COUNT_MAX", pPlugQueryRowCountMax);
			cmd.addParameter("@P_PLUG_QUERY_ASC_IMAGE", pPlugQueryAscImage);
			cmd.addParameter("@P_PLUG_QUERY_ASC_IMAGE_ATTR", pPlugQueryAscImageAttr);
			cmd.addParameter("@P_PLUG_QUERY_DESC_IMAGE", pPlugQueryDescImage);
			cmd.addParameter("@P_PLUG_QUERY_DESC_IMAGE_ATTR", pPlugQueryDescImageAttr);
			cmd.addParameter("@P_PLUG_QUERY_EXP_FILENAME", pPlugQueryExpFilename);
			cmd.addParameter("@P_PLUG_QUERY_EXP_SEPARATOR", pPlugQueryExpSeparator);
			cmd.addParameter("@P_PLUG_QUERY_EXP_ENCLOSED_BY", pPlugQueryExpEnclosedBy);
			cmd.addParameter("@P_PLUG_QUERY_STRIP_HTML", pPlugQueryStripHtml);
			cmd.addParameter("@P_PAGINATION_DISPLAY_POSITION", pPaginationDisplayPosition);
			cmd.addParameter("@P_REPORT_TOTAL_TEXT_FORMAT", pReportTotalTextFormat);
			cmd.addParameter("@P_BREAK_COLUMN_TEXT_FORMAT", pBreakColumnTextFormat);
			cmd.addParameter("@P_BREAK_BEFORE_ROW", pBreakBeforeRow);
			cmd.addParameter("@P_BREAK_GENERIC_COLUMN", pBreakGenericColumn);
			cmd.addParameter("@P_BREAK_AFTER_ROW", pBreakAfterRow);
			cmd.addParameter("@P_BREAK_TYPE_FLAG", pBreakTypeFlag);
			cmd.addParameter("@P_BREAK_REPEAT_HEADING_FORMAT", pBreakRepeatHeadingFormat);
			cmd.addParameter("@P_CSV_OUTPUT", pCsvOutput);
			cmd.addParameter("@P_CSV_OUTPUT_LINK_TEXT", pCsvOutputLinkText);
			cmd.addParameter("@P_PRINT_URL", pPrintUrl);
			cmd.addParameter("@P_PRINT_URL_LABEL", pPrintUrlLabel);
			cmd.addParameter("@P_PRN_OUTPUT", pPrnOutput);
			cmd.addParameter("@P_PRN_TEMPLATE_ID", pPrnTemplateId);
			cmd.addParameter("@P_PRN_FORMAT", pPrnFormat);
			cmd.addParameter("@P_PRN_FORMAT_ITEM", pPrnFormatItem);
			cmd.addParameter("@P_PRN_OUTPUT_SHOW_LINK", pPrnOutputShowLink);
			cmd.addParameter("@P_PRN_OUTPUT_LINK_TEXT", pPrnOutputLinkText);
			cmd.addParameter("@P_PRN_OUTPUT_FILE_NAME", pPrnOutputFileName);
			cmd.addParameter("@P_PRN_UNITS", pPrnUnits);
			cmd.addParameter("@P_PRN_PAPER_SIZE", pPrnPaperSize);
			cmd.addParameter("@P_PRN_WIDTH", pPrnWidth);
			cmd.addParameter("@P_PRN_HEIGHT", pPrnHeight);
			cmd.addParameter("@P_PRN_ORIENTATION", pPrnOrientation);
			cmd.addParameter("@P_PRN_PAGE_HEADER", pPrnPageHeader);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_COLOR", pPrnPageHeaderFontColor);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_FAMILY", pPrnPageHeaderFontFamily);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_WEIGHT", pPrnPageHeaderFontWeight);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_SIZE", pPrnPageHeaderFontSize);
			cmd.addParameter("@P_PRN_PAGE_FOOTER", pPrnPageFooter);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_COLOR", pPrnPageFooterFontColor);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_FAMILY", pPrnPageFooterFontFamily);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_WEIGHT", pPrnPageFooterFontWeight);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_SIZE", pPrnPageFooterFontSize);
			cmd.addParameter("@P_PRN_HEADER_BG_COLOR", pPrnHeaderBgColor);
			cmd.addParameter("@P_PRN_HEADER_FONT_COLOR", pPrnHeaderFontColor);
			cmd.addParameter("@P_PRN_HEADER_FONT_FAMILY", pPrnHeaderFontFamily);
			cmd.addParameter("@P_PRN_HEADER_FONT_WEIGHT", pPrnHeaderFontWeight);
			cmd.addParameter("@P_PRN_HEADER_FONT_SIZE", pPrnHeaderFontSize);
			cmd.addParameter("@P_PRN_BODY_BG_COLOR", pPrnBodyBgColor);
			cmd.addParameter("@P_PRN_BODY_FONT_COLOR", pPrnBodyFontColor);
			cmd.addParameter("@P_PRN_BODY_FONT_FAMILY", pPrnBodyFontFamily);
			cmd.addParameter("@P_PRN_BODY_FONT_WEIGHT", pPrnBodyFontWeight);
			cmd.addParameter("@P_PRN_BODY_FONT_SIZE", pPrnBodyFontSize);
			cmd.addParameter("@P_PRN_BORDER_WIDTH", pPrnBorderWidth);
			cmd.addParameter("@P_SHARED_QUERY_ID", pSharedQueryId);
			cmd.addParameter("@P_PLUG_URL_TEXT_BEGIN", pPlugUrlTextBegin);
			cmd.addParameter("@P_PLUG_URL_TEXT_END", pPlugUrlTextEnd);
			cmd.addParameter("@P_JAVA_ENTRY_POINT", pJavaEntryPoint);
			cmd.addParameter("@P_PLUG_CACHING", pPlugCaching);
			cmd.addParameter("@P_PLUG_CACHING_SESSION_STATE", pPlugCachingSessionState);
			cmd.addParameter("@P_PLUG_CACHING_MAX_AGE_IN_SEC", pPlugCachingMaxAgeInSec);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_COND_TYPE", pPlugCacheWhenCondType);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E1", pPlugCacheWhenConditionE1);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E2", pPlugCacheWhenConditionE2);
			cmd.addParameter("@P_PLUG_CHART_FONT_SIZE", pPlugChartFontSize);
			cmd.addParameter("@P_PLUG_CHART_MAX_ROWS", pPlugChartMaxRows);
			cmd.addParameter("@P_PLUG_CHART_NUM_MASK", pPlugChartNumMask);
			cmd.addParameter("@P_PLUG_CHART_SCALE", pPlugChartScale);
			cmd.addParameter("@P_PLUG_CHART_AXIS", pPlugChartAxis);
			cmd.addParameter("@P_PLUG_CHART_SHOW_SUMMARY", pPlugChartShowSummary);
			cmd.addParameter("@P_MENU_TEMPLATE_ID", pMenuTemplateId);
			cmd.addParameter("@P_LIST_TEMPLATE_ID", pListTemplateId);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PLUG_COMMENT", pPlugComment);
			cmd.addParameter("@P_USE_CUSTOM_ITEM_LAYOUT", pUseCustomItemLayout);
			cmd.addParameter("@P_CUSTOM_ITEM_LAYOUT", pCustomItemLayout);
			cmd.addParameter("@P_PRN_PAGE_HEADER_ALIGNMENT", pPrnPageHeaderAlignment);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_ALIGNMENT", pPrnPageFooterAlignment);
			cmd.addParameter("@P_PRN_BORDER_COLOR", pPrnBorderColor);
			cmd.addParameter("@P_SORT_NULL", pSortNull);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageProcess(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NNumber pProcessSequence,NString pProcessPoint,NString pProcessType,NString pProcessName,NString pProcessSql,NString pProcessSqlClob,NString pProcessErrorMessage,NNumber pProcessWhenButtonId,NString pProcessWhen,NString pProcessWhenType,NString pProcessWhen2,NString pProcessWhenType2,NString pProcessSuccessMessage,NString pSecurityScheme,NNumber pRequiredPatch,NString pProcessIsStatefulYN,NString pReturnKeyIntoItem1,NString pReturnKeyIntoItem2,NString pProcessItemName,NString pProcessComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_PROCESS_SEQUENCE", pProcessSequence);
			cmd.addParameter("@P_PROCESS_POINT", pProcessPoint);
			cmd.addParameter("@P_PROCESS_TYPE", pProcessType);
			cmd.addParameter("@P_PROCESS_NAME", pProcessName);
			cmd.addParameter("@P_PROCESS_SQL", pProcessSql);
			cmd.addParameter("@P_PROCESS_SQL_CLOB", pProcessSqlClob);
			cmd.addParameter("@P_PROCESS_ERROR_MESSAGE", pProcessErrorMessage);
			cmd.addParameter("@P_PROCESS_WHEN_BUTTON_ID", pProcessWhenButtonId);
			cmd.addParameter("@P_PROCESS_WHEN", pProcessWhen);
			cmd.addParameter("@P_PROCESS_WHEN_TYPE", pProcessWhenType);
			cmd.addParameter("@P_PROCESS_WHEN2", pProcessWhen2);
			cmd.addParameter("@P_PROCESS_WHEN_TYPE2", pProcessWhenType2);
			cmd.addParameter("@P_PROCESS_SUCCESS_MESSAGE", pProcessSuccessMessage);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PROCESS_IS_STATEFUL_Y_N", pProcessIsStatefulYN);
			cmd.addParameter("@P_RETURN_KEY_INTO_ITEM1", pReturnKeyIntoItem1);
			cmd.addParameter("@P_RETURN_KEY_INTO_ITEM2", pReturnKeyIntoItem2);
			cmd.addParameter("@P_PROCESS_ITEM_NAME", pProcessItemName);
			cmd.addParameter("@P_PROCESS_COMMENT", pProcessComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPageValidation(NNumber pId,NNumber pFlowId,NNumber pFlowStepId,NString pValidationName,NNumber pValidationSequence,NString pValidation,NString pValidation2,NString pValidationType,NString pErrorMessage,NString pValidationCondition,NString pValidationCondition2,NString pValidationConditionType,NString pWhenButtonPressed,NNumber pAssociatedItem,NString pErrorDisplayLocation,NString pSecurityScheme,NNumber pRequiredPatch,NString pValidationComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PAGE_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_VALIDATION_NAME", pValidationName);
			cmd.addParameter("@P_VALIDATION_SEQUENCE", pValidationSequence);
			cmd.addParameter("@P_VALIDATION", pValidation);
			cmd.addParameter("@P_VALIDATION2", pValidation2);
			cmd.addParameter("@P_VALIDATION_TYPE", pValidationType);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
			cmd.addParameter("@P_VALIDATION_CONDITION", pValidationCondition);
			cmd.addParameter("@P_VALIDATION_CONDITION2", pValidationCondition2);
			cmd.addParameter("@P_VALIDATION_CONDITION_TYPE", pValidationConditionType);
			cmd.addParameter("@P_WHEN_BUTTON_PRESSED", pWhenButtonPressed);
			cmd.addParameter("@P_ASSOCIATED_ITEM", pAssociatedItem);
			cmd.addParameter("@P_ERROR_DISPLAY_LOCATION", pErrorDisplayLocation);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_VALIDATION_COMMENT", pValidationComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createPlugTemplate(NNumber pId,NNumber pFlowId,NString pPagePlugTemplateName,NString pTemplate,NString pTemplate2,NString pTemplate3,NString pPlugTableBgcolor,NString pPlugHeadingBgcolor,NString pPlugFontSize,NNumber pReferenceId,NString pFormTableAttr,NString pTranslateThisTemplate,NString pTemplateComment,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_PLUG_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_PLUG_TEMPLATE_NAME", pPagePlugTemplateName);
			cmd.addParameter("@P_TEMPLATE", pTemplate);
			cmd.addParameter("@P_TEMPLATE2", pTemplate2);
			cmd.addParameter("@P_TEMPLATE3", pTemplate3);
			cmd.addParameter("@P_PLUG_TABLE_BGCOLOR", pPlugTableBgcolor);
			cmd.addParameter("@P_PLUG_HEADING_BGCOLOR", pPlugHeadingBgcolor);
			cmd.addParameter("@P_PLUG_FONT_SIZE", pPlugFontSize);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_FORM_TABLE_ATTR", pFormTableAttr);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_TEMPLATE_COMMENT", pTemplateComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createPopupLovTemplate(NNumber pId,NNumber pSecurityGroupId,NNumber pFlowId,NString pPopupIcon,NString pPopupIconAttr,NString pPopupIcon2,NString pPopupIconAttr2,NString pPageName,NString pPageTitle,NString pPageHtmlHead,NString pPageBodyAttr,NString pBeforeFieldText,NString pPageHeadingText,NString pPageFooterText,NString pFilterWidth,NString pFilterMaxWidth,NString pFilterTextAttr,NString pFindButtonText,NString pFindButtonImage,NString pFindButtonAttr,NString pCloseButtonText,NString pCloseButtonImage,NString pCloseButtonAttr,NString pNextButtonText,NString pNextButtonImage,NString pNextButtonAttr,NString pPrevButtonText,NString pPrevButtonImage,NString pPrevButtonAttr,NString pAfterFieldText,NString pScrollbars,NString pResizable,NString pWidth,NString pHeight,NString pResultRowXOfY,NString pResultRowsPerPg,NString pBeforeResultSet,NString pAfterResultSet,NString pWhenNoDataFoundMessage,NString pBeforeFirstFetchMessage,NNumber pMinimumCharactersRequired,NNumber pReferenceId,NString pTranslateThisTemplate,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_POPUP_LOV_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_POPUP_ICON", pPopupIcon);
			cmd.addParameter("@P_POPUP_ICON_ATTR", pPopupIconAttr);
			cmd.addParameter("@P_POPUP_ICON2", pPopupIcon2);
			cmd.addParameter("@P_POPUP_ICON_ATTR2", pPopupIconAttr2);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_PAGE_TITLE", pPageTitle);
			cmd.addParameter("@P_PAGE_HTML_HEAD", pPageHtmlHead);
			cmd.addParameter("@P_PAGE_BODY_ATTR", pPageBodyAttr);
			cmd.addParameter("@P_BEFORE_FIELD_TEXT", pBeforeFieldText);
			cmd.addParameter("@P_PAGE_HEADING_TEXT", pPageHeadingText);
			cmd.addParameter("@P_PAGE_FOOTER_TEXT", pPageFooterText);
			cmd.addParameter("@P_FILTER_WIDTH", pFilterWidth);
			cmd.addParameter("@P_FILTER_MAX_WIDTH", pFilterMaxWidth);
			cmd.addParameter("@P_FILTER_TEXT_ATTR", pFilterTextAttr);
			cmd.addParameter("@P_FIND_BUTTON_TEXT", pFindButtonText);
			cmd.addParameter("@P_FIND_BUTTON_IMAGE", pFindButtonImage);
			cmd.addParameter("@P_FIND_BUTTON_ATTR", pFindButtonAttr);
			cmd.addParameter("@P_CLOSE_BUTTON_TEXT", pCloseButtonText);
			cmd.addParameter("@P_CLOSE_BUTTON_IMAGE", pCloseButtonImage);
			cmd.addParameter("@P_CLOSE_BUTTON_ATTR", pCloseButtonAttr);
			cmd.addParameter("@P_NEXT_BUTTON_TEXT", pNextButtonText);
			cmd.addParameter("@P_NEXT_BUTTON_IMAGE", pNextButtonImage);
			cmd.addParameter("@P_NEXT_BUTTON_ATTR", pNextButtonAttr);
			cmd.addParameter("@P_PREV_BUTTON_TEXT", pPrevButtonText);
			cmd.addParameter("@P_PREV_BUTTON_IMAGE", pPrevButtonImage);
			cmd.addParameter("@P_PREV_BUTTON_ATTR", pPrevButtonAttr);
			cmd.addParameter("@P_AFTER_FIELD_TEXT", pAfterFieldText);
			cmd.addParameter("@P_SCROLLBARS", pScrollbars);
			cmd.addParameter("@P_RESIZABLE", pResizable);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_RESULT_ROW_X_OF_Y", pResultRowXOfY);
			cmd.addParameter("@P_RESULT_ROWS_PER_PG", pResultRowsPerPg);
			cmd.addParameter("@P_BEFORE_RESULT_SET", pBeforeResultSet);
			cmd.addParameter("@P_AFTER_RESULT_SET", pAfterResultSet);
			cmd.addParameter("@P_WHEN_NO_DATA_FOUND_MESSAGE", pWhenNoDataFoundMessage);
			cmd.addParameter("@P_BEFORE_FIRST_FETCH_MESSAGE", pBeforeFirstFetchMessage);
			cmd.addParameter("@P_MINIMUM_CHARACTERS_REQUIRED", pMinimumCharactersRequired);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createQueryColumn(NNumber pId,NNumber pQueryId,NNumber pQueryObjectId,NNumber pColumnNumber,NString pColumnAlias,NString pColumnSqlExpression,NString pColumnGroupBySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_QUERY_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_QUERY_ID", pQueryId);
			cmd.addParameter("@P_QUERY_OBJECT_ID", pQueryObjectId);
			cmd.addParameter("@P_COLUMN_NUMBER", pColumnNumber);
			cmd.addParameter("@P_COLUMN_ALIAS", pColumnAlias);
			cmd.addParameter("@P_COLUMN_SQL_EXPRESSION", pColumnSqlExpression);
			cmd.addParameter("@P_COLUMN_GROUP_BY_SEQUENCE", pColumnGroupBySequence);
				
			cmd.execute();


		}
		
		public static void createQueryCondition(NNumber pId,NNumber pQueryId,NString pCondition,NString pCondColumn,NNumber pCondId1,NNumber pCondId2,NString pCondRoot,NString pOperator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_QUERY_CONDITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_QUERY_ID", pQueryId);
			cmd.addParameter("@P_CONDITION", pCondition);
			cmd.addParameter("@P_COND_COLUMN", pCondColumn);
			cmd.addParameter("@P_COND_ID1", pCondId1);
			cmd.addParameter("@P_COND_ID2", pCondId2);
			cmd.addParameter("@P_COND_ROOT", pCondRoot);
			cmd.addParameter("@P_OPERATOR", pOperator);
				
			cmd.execute();


		}
		
		public static void createQueryDefinition(NNumber pId,NNumber pRegionId,NNumber pFlowId,NNumber pReferenceId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_QUERY_DEFINITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
				
			cmd.execute();


		}
		
		public static void createQueryObject(NNumber pId,NNumber pQueryId,NString pObjectOwner,NString pObjectName,NString pObjectAlias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_QUERY_OBJECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_QUERY_ID", pQueryId);
			cmd.addParameter("@P_OBJECT_OWNER", pObjectOwner);
			cmd.addParameter("@P_OBJECT_NAME", pObjectName);
			cmd.addParameter("@P_OBJECT_ALIAS", pObjectAlias);
				
			cmd.execute();


		}
		
		public static void createRegionRptCols(NNumber pId,NNumber pFlowId,NNumber pPlugId,NNumber pColumnSequence,NString pQueryColumnName,NString pDisplayAs,NNumber pNamedLov,NString pInlineLov,NString pLovShowNulls,NString pLovNullText,NString pLovNullValue,NNumber pColumnWidth,NNumber pColumnHeight,NString pCattributes,NString pColumnComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_REGION_RPT_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PLUG_ID", pPlugId);
			cmd.addParameter("@P_COLUMN_SEQUENCE", pColumnSequence);
			cmd.addParameter("@P_QUERY_COLUMN_NAME", pQueryColumnName);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
			cmd.addParameter("@P_NAMED_LOV", pNamedLov);
			cmd.addParameter("@P_INLINE_LOV", pInlineLov);
			cmd.addParameter("@P_LOV_SHOW_NULLS", pLovShowNulls);
			cmd.addParameter("@P_LOV_NULL_TEXT", pLovNullText);
			cmd.addParameter("@P_LOV_NULL_VALUE", pLovNullValue);
			cmd.addParameter("@P_COLUMN_WIDTH", pColumnWidth);
			cmd.addParameter("@P_COLUMN_HEIGHT", pColumnHeight);
			cmd.addParameter("@P_CATTRIBUTES", pCattributes);
			cmd.addParameter("@P_COLUMN_COMMENT", pColumnComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createReportColumns(NNumber pId,NNumber pRegionId,NNumber pFlowId,NNumber pQueryColumnId,NNumber pFormElementId,NString pColumnAlias,NString pColumnDisplaySequence,NString pColumnHeading,NString pColumnFormat,NString pColumnHtmlExpression,NString pColumnCssClass,NString pColumnCssStyle,NString pColumnHitHighlight,NString pColumnLink,NString pColumnLinktext,NString pColumnLinkAttr,NString pColumnAlignment,NString pHeadingAlignment,NString pDefaultSortColumnSequence,NString pDefaultSortDir,NString pDisableSortColumn,NString pSumColumn,NString pHiddenColumn,NString pDisplayWhenCondType,NString pDisplayWhenCondition,NString pDisplayWhenCondition2,NString pReportColumnRequiredRole,NString pSecurityGroupId,NString pLastUpdatedBy,NString pLastUpdatedOn,NString pDisplayAs,NString pNamedLov,NString pInlineLov,NString pLovShowNulls,NString pLovNullText,NString pLovNullValue,NString pColumnWidth,NString pColumnHeight,NString pCattributes,NString pCattributesElement,NString pPkColSourceType,NString pPkColSource,NString pDerivedColumn,NString pColumnDefault,NString pColumnDefaultType,NString pLovDisplayExtra,NString pIncludeInExport,NString pPrintColWidth,NString pPrintColAlign,NString pRefSchema,NString pRefTableName,NString pRefColumnName,NString pColumnLinkChecksumType,NString pColumnComment,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_REPORT_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_QUERY_COLUMN_ID", pQueryColumnId);
			cmd.addParameter("@P_FORM_ELEMENT_ID", pFormElementId);
			cmd.addParameter("@P_COLUMN_ALIAS", pColumnAlias);
			cmd.addParameter("@P_COLUMN_DISPLAY_SEQUENCE", pColumnDisplaySequence);
			cmd.addParameter("@P_COLUMN_HEADING", pColumnHeading);
			cmd.addParameter("@P_COLUMN_FORMAT", pColumnFormat);
			cmd.addParameter("@P_COLUMN_HTML_EXPRESSION", pColumnHtmlExpression);
			cmd.addParameter("@P_COLUMN_CSS_CLASS", pColumnCssClass);
			cmd.addParameter("@P_COLUMN_CSS_STYLE", pColumnCssStyle);
			cmd.addParameter("@P_COLUMN_HIT_HIGHLIGHT", pColumnHitHighlight);
			cmd.addParameter("@P_COLUMN_LINK", pColumnLink);
			cmd.addParameter("@P_COLUMN_LINKTEXT", pColumnLinktext);
			cmd.addParameter("@P_COLUMN_LINK_ATTR", pColumnLinkAttr);
			cmd.addParameter("@P_COLUMN_ALIGNMENT", pColumnAlignment);
			cmd.addParameter("@P_HEADING_ALIGNMENT", pHeadingAlignment);
			cmd.addParameter("@P_DEFAULT_SORT_COLUMN_SEQUENCE", pDefaultSortColumnSequence);
			cmd.addParameter("@P_DEFAULT_SORT_DIR", pDefaultSortDir);
			cmd.addParameter("@P_DISABLE_SORT_COLUMN", pDisableSortColumn);
			cmd.addParameter("@P_SUM_COLUMN", pSumColumn);
			cmd.addParameter("@P_HIDDEN_COLUMN", pHiddenColumn);
			cmd.addParameter("@P_DISPLAY_WHEN_COND_TYPE", pDisplayWhenCondType);
			cmd.addParameter("@P_DISPLAY_WHEN_CONDITION", pDisplayWhenCondition);
			cmd.addParameter("@P_DISPLAY_WHEN_CONDITION2", pDisplayWhenCondition2);
			cmd.addParameter("@P_REPORT_COLUMN_REQUIRED_ROLE", pReportColumnRequiredRole);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_LAST_UPDATED_BY", pLastUpdatedBy);
			cmd.addParameter("@P_LAST_UPDATED_ON", pLastUpdatedOn);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
			cmd.addParameter("@P_NAMED_LOV", pNamedLov);
			cmd.addParameter("@P_INLINE_LOV", pInlineLov);
			cmd.addParameter("@P_LOV_SHOW_NULLS", pLovShowNulls);
			cmd.addParameter("@P_LOV_NULL_TEXT", pLovNullText);
			cmd.addParameter("@P_LOV_NULL_VALUE", pLovNullValue);
			cmd.addParameter("@P_COLUMN_WIDTH", pColumnWidth);
			cmd.addParameter("@P_COLUMN_HEIGHT", pColumnHeight);
			cmd.addParameter("@P_CATTRIBUTES", pCattributes);
			cmd.addParameter("@P_CATTRIBUTES_ELEMENT", pCattributesElement);
			cmd.addParameter("@P_PK_COL_SOURCE_TYPE", pPkColSourceType);
			cmd.addParameter("@P_PK_COL_SOURCE", pPkColSource);
			cmd.addParameter("@P_DERIVED_COLUMN", pDerivedColumn);
			cmd.addParameter("@P_COLUMN_DEFAULT", pColumnDefault);
			cmd.addParameter("@P_COLUMN_DEFAULT_TYPE", pColumnDefaultType);
			cmd.addParameter("@P_LOV_DISPLAY_EXTRA", pLovDisplayExtra);
			cmd.addParameter("@P_INCLUDE_IN_EXPORT", pIncludeInExport);
			cmd.addParameter("@P_PRINT_COL_WIDTH", pPrintColWidth);
			cmd.addParameter("@P_PRINT_COL_ALIGN", pPrintColAlign);
			cmd.addParameter("@P_REF_SCHEMA", pRefSchema);
			cmd.addParameter("@P_REF_TABLE_NAME", pRefTableName);
			cmd.addParameter("@P_REF_COLUMN_NAME", pRefColumnName);
			cmd.addParameter("@P_COLUMN_LINK_CHECKSUM_TYPE", pColumnLinkChecksumType);
			cmd.addParameter("@P_COLUMN_COMMENT", pColumnComment);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
//		public static void createReportLayout(NNumber pId,NNumber pFlowId,NString pReportLayoutName,NString pReportLayoutType,NString pPageTemplate,List<DbmsSql.Varchar2TableRow> pVarchar2Table,NString pXslfoColumnHeading,NString pXslfoColumnTemplate,NString pXslfoColumnTemplateWidth,NNumber pReferenceId,NString pReportLayoutComment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_REPORT_LAYOUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ID", pId);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_REPORT_LAYOUT_NAME", pReportLayoutName);
//			cmd.addParameter("@P_REPORT_LAYOUT_TYPE", pReportLayoutType);
//			cmd.addParameter("@P_PAGE_TEMPLATE", pPageTemplate);
//			// cmd.addParameter(DbTypes.getTableType("P_VARCHAR2_TABLE", "", pVarchar2Table, object.class));
//			cmd.addParameter("@P_XSLFO_COLUMN_HEADING", pXslfoColumnHeading);
//			cmd.addParameter("@P_XSLFO_COLUMN_TEMPLATE", pXslfoColumnTemplate);
//			cmd.addParameter("@P_XSLFO_COLUMN_TEMPLATE_WIDTH", pXslfoColumnTemplateWidth);
//			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
//			cmd.addParameter("@P_REPORT_LAYOUT_COMMENT", pReportLayoutComment);
//				
//			cmd.execute();
//
//
//		}
		
		public static void createReportPage(NNumber pFlowId,NNumber pFlowStepId,NString pPageName,NString pReportSql,NString pReportHeadings,NString pTabSet,NString pPlugTemplate,NString pPlugDisplayColumn,NString pMaxRows,NString pReportType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_REPORT_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_REPORT_SQL", pReportSql);
			cmd.addParameter("@P_REPORT_HEADINGS", pReportHeadings);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_PLUG_TEMPLATE", pPlugTemplate);
			cmd.addParameter("@P_PLUG_DISPLAY_COLUMN", pPlugDisplayColumn);
			cmd.addParameter("@P_MAX_ROWS", pMaxRows);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
				
			cmd.execute();


		}
		
		public static void createReportRegion(NNumber pId,NNumber pFlowId,NNumber pPageId,NString pName,NString pRegionName,NNumber pTemplate,NString pDisplaySequence,NString pDisplayColumn,NString pDisplayPoint,NString pSource,NString pSourceType,NString pDisplayErrorMessage,NString pRequiredRole,NString pDisplayWhenCondition,NString pDisplayWhenCond2,NString pDisplayConditionType,NString pHeader,NString pFooter,NString pOverrideRegPos,NString pCustomized,NString pCustomizedName,NString pTranslateTitle,NNumber pQueryRowTemplate,NNumber pPlugQueryMaxColumns,NString pQueryHeadings,NString pQueryHeadingsType,NNumber pQueryNumRows,NString pQueryOptions,NString pQueryShowNullsAs,NString pQueryBreakCols,NString pQueryNoDataFound,NString pQueryMoreData,NNumber pIgnorePagination,NString pQueryNumRowsItem,NString pQueryNumRowsType,NNumber pQueryRowCountMax,NString pPaginationDisplayPosition,NString pReportTotalTextFormat,NString pBreakColumnTextFormat,NString pBreakBeforeRow,NString pBreakGenericColumn,NString pBreakAfterRow,NString pBreakTypeFlag,NString pBreakRepeatHeadingFormat,NString pCsvOutput,NString pCsvOutputLinkText,NString pPrintUrl,NString pPrintUrlLabel,NString pPrnOutput,NNumber pPrnTemplateId,NString pPrnFormat,NString pPrnFormatItem,NString pPrnOutputShowLink,NString pPrnOutputLinkText,NString pPrnOutputFileName,NString pPrnUnits,NString pPrnPaperSize,NNumber pPrnWidth,NNumber pPrnHeight,NString pPrnOrientation,NString pPrnPageHeader,NString pPrnPageHeaderFontColor,NString pPrnPageHeaderFontFamily,NString pPrnPageHeaderFontWeight,NString pPrnPageHeaderFontSize,NString pPrnPageFooter,NString pPrnPageFooterFontColor,NString pPrnPageFooterFontFamily,NString pPrnPageFooterFontWeight,NString pPrnPageFooterFontSize,NString pPrnHeaderBgColor,NString pPrnHeaderFontColor,NString pPrnHeaderFontFamily,NString pPrnHeaderFontWeight,NString pPrnHeaderFontSize,NString pPrnBodyBgColor,NString pPrnBodyFontColor,NString pPrnBodyFontFamily,NString pPrnBodyFontWeight,NString pPrnBodyFontSize,NNumber pPrnBorderWidth,NNumber pSharedQueryId,NString pQueryAscImage,NString pQueryAscImageAttr,NString pQueryDescImage,NString pQueryDescImageAttr,NString pPlugQueryExpFilename,NString pPlugQueryExpSeparator,NString pPlugQueryExpEnclosedBy,NString pPlugQueryStripHtml,NString pRequiredPatch,NString pComment,NString pPlugColumnWidth,NString pPrnPageHeaderAlignment,NString pPrnPageFooterAlignment,NString pPrnBorderColor,NString pSortNull,NString pPlugCaching,NString pPlugCachingSessionState,NString pPlugCachingMaxAgeInSec,NString pPlugCacheWhenCondType,NString pPlugCacheWhenConditionE1,NString pPlugCacheWhenConditionE2,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_REPORT_REGION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
			cmd.addParameter("@P_TEMPLATE", pTemplate);
			cmd.addParameter("@P_DISPLAY_SEQUENCE", pDisplaySequence);
			cmd.addParameter("@P_DISPLAY_COLUMN", pDisplayColumn);
			cmd.addParameter("@P_DISPLAY_POINT", pDisplayPoint);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_DISPLAY_ERROR_MESSAGE", pDisplayErrorMessage);
			cmd.addParameter("@P_REQUIRED_ROLE", pRequiredRole);
			cmd.addParameter("@P_DISPLAY_WHEN_CONDITION", pDisplayWhenCondition);
			cmd.addParameter("@P_DISPLAY_WHEN_COND2", pDisplayWhenCond2);
			cmd.addParameter("@P_DISPLAY_CONDITION_TYPE", pDisplayConditionType);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_FOOTER", pFooter);
			cmd.addParameter("@P_OVERRIDE_REG_POS", pOverrideRegPos);
			cmd.addParameter("@P_CUSTOMIZED", pCustomized);
			cmd.addParameter("@P_CUSTOMIZED_NAME", pCustomizedName);
			cmd.addParameter("@P_TRANSLATE_TITLE", pTranslateTitle);
			cmd.addParameter("@P_QUERY_ROW_TEMPLATE", pQueryRowTemplate);
			cmd.addParameter("@P_PLUG_QUERY_MAX_COLUMNS", pPlugQueryMaxColumns);
			cmd.addParameter("@P_QUERY_HEADINGS", pQueryHeadings);
			cmd.addParameter("@P_QUERY_HEADINGS_TYPE", pQueryHeadingsType);
			cmd.addParameter("@P_QUERY_NUM_ROWS", pQueryNumRows);
			cmd.addParameter("@P_QUERY_OPTIONS", pQueryOptions);
			cmd.addParameter("@P_QUERY_SHOW_NULLS_AS", pQueryShowNullsAs);
			cmd.addParameter("@P_QUERY_BREAK_COLS", pQueryBreakCols);
			cmd.addParameter("@P_QUERY_NO_DATA_FOUND", pQueryNoDataFound);
			cmd.addParameter("@P_QUERY_MORE_DATA", pQueryMoreData);
			cmd.addParameter("@P_IGNORE_PAGINATION", pIgnorePagination);
			cmd.addParameter("@P_QUERY_NUM_ROWS_ITEM", pQueryNumRowsItem);
			cmd.addParameter("@P_QUERY_NUM_ROWS_TYPE", pQueryNumRowsType);
			cmd.addParameter("@P_QUERY_ROW_COUNT_MAX", pQueryRowCountMax);
			cmd.addParameter("@P_PAGINATION_DISPLAY_POSITION", pPaginationDisplayPosition);
			cmd.addParameter("@P_REPORT_TOTAL_TEXT_FORMAT", pReportTotalTextFormat);
			cmd.addParameter("@P_BREAK_COLUMN_TEXT_FORMAT", pBreakColumnTextFormat);
			cmd.addParameter("@P_BREAK_BEFORE_ROW", pBreakBeforeRow);
			cmd.addParameter("@P_BREAK_GENERIC_COLUMN", pBreakGenericColumn);
			cmd.addParameter("@P_BREAK_AFTER_ROW", pBreakAfterRow);
			cmd.addParameter("@P_BREAK_TYPE_FLAG", pBreakTypeFlag);
			cmd.addParameter("@P_BREAK_REPEAT_HEADING_FORMAT", pBreakRepeatHeadingFormat);
			cmd.addParameter("@P_CSV_OUTPUT", pCsvOutput);
			cmd.addParameter("@P_CSV_OUTPUT_LINK_TEXT", pCsvOutputLinkText);
			cmd.addParameter("@P_PRINT_URL", pPrintUrl);
			cmd.addParameter("@P_PRINT_URL_LABEL", pPrintUrlLabel);
			cmd.addParameter("@P_PRN_OUTPUT", pPrnOutput);
			cmd.addParameter("@P_PRN_TEMPLATE_ID", pPrnTemplateId);
			cmd.addParameter("@P_PRN_FORMAT", pPrnFormat);
			cmd.addParameter("@P_PRN_FORMAT_ITEM", pPrnFormatItem);
			cmd.addParameter("@P_PRN_OUTPUT_SHOW_LINK", pPrnOutputShowLink);
			cmd.addParameter("@P_PRN_OUTPUT_LINK_TEXT", pPrnOutputLinkText);
			cmd.addParameter("@P_PRN_OUTPUT_FILE_NAME", pPrnOutputFileName);
			cmd.addParameter("@P_PRN_UNITS", pPrnUnits);
			cmd.addParameter("@P_PRN_PAPER_SIZE", pPrnPaperSize);
			cmd.addParameter("@P_PRN_WIDTH", pPrnWidth);
			cmd.addParameter("@P_PRN_HEIGHT", pPrnHeight);
			cmd.addParameter("@P_PRN_ORIENTATION", pPrnOrientation);
			cmd.addParameter("@P_PRN_PAGE_HEADER", pPrnPageHeader);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_COLOR", pPrnPageHeaderFontColor);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_FAMILY", pPrnPageHeaderFontFamily);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_WEIGHT", pPrnPageHeaderFontWeight);
			cmd.addParameter("@P_PRN_PAGE_HEADER_FONT_SIZE", pPrnPageHeaderFontSize);
			cmd.addParameter("@P_PRN_PAGE_FOOTER", pPrnPageFooter);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_COLOR", pPrnPageFooterFontColor);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_FAMILY", pPrnPageFooterFontFamily);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_WEIGHT", pPrnPageFooterFontWeight);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_FONT_SIZE", pPrnPageFooterFontSize);
			cmd.addParameter("@P_PRN_HEADER_BG_COLOR", pPrnHeaderBgColor);
			cmd.addParameter("@P_PRN_HEADER_FONT_COLOR", pPrnHeaderFontColor);
			cmd.addParameter("@P_PRN_HEADER_FONT_FAMILY", pPrnHeaderFontFamily);
			cmd.addParameter("@P_PRN_HEADER_FONT_WEIGHT", pPrnHeaderFontWeight);
			cmd.addParameter("@P_PRN_HEADER_FONT_SIZE", pPrnHeaderFontSize);
			cmd.addParameter("@P_PRN_BODY_BG_COLOR", pPrnBodyBgColor);
			cmd.addParameter("@P_PRN_BODY_FONT_COLOR", pPrnBodyFontColor);
			cmd.addParameter("@P_PRN_BODY_FONT_FAMILY", pPrnBodyFontFamily);
			cmd.addParameter("@P_PRN_BODY_FONT_WEIGHT", pPrnBodyFontWeight);
			cmd.addParameter("@P_PRN_BODY_FONT_SIZE", pPrnBodyFontSize);
			cmd.addParameter("@P_PRN_BORDER_WIDTH", pPrnBorderWidth);
			cmd.addParameter("@P_SHARED_QUERY_ID", pSharedQueryId);
			cmd.addParameter("@P_QUERY_ASC_IMAGE", pQueryAscImage);
			cmd.addParameter("@P_QUERY_ASC_IMAGE_ATTR", pQueryAscImageAttr);
			cmd.addParameter("@P_QUERY_DESC_IMAGE", pQueryDescImage);
			cmd.addParameter("@P_QUERY_DESC_IMAGE_ATTR", pQueryDescImageAttr);
			cmd.addParameter("@P_PLUG_QUERY_EXP_FILENAME", pPlugQueryExpFilename);
			cmd.addParameter("@P_PLUG_QUERY_EXP_SEPARATOR", pPlugQueryExpSeparator);
			cmd.addParameter("@P_PLUG_QUERY_EXP_ENCLOSED_BY", pPlugQueryExpEnclosedBy);
			cmd.addParameter("@P_PLUG_QUERY_STRIP_HTML", pPlugQueryStripHtml);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_PLUG_COLUMN_WIDTH", pPlugColumnWidth);
			cmd.addParameter("@P_PRN_PAGE_HEADER_ALIGNMENT", pPrnPageHeaderAlignment);
			cmd.addParameter("@P_PRN_PAGE_FOOTER_ALIGNMENT", pPrnPageFooterAlignment);
			cmd.addParameter("@P_PRN_BORDER_COLOR", pPrnBorderColor);
			cmd.addParameter("@P_SORT_NULL", pSortNull);
			cmd.addParameter("@P_PLUG_CACHING", pPlugCaching);
			cmd.addParameter("@P_PLUG_CACHING_SESSION_STATE", pPlugCachingSessionState);
			cmd.addParameter("@P_PLUG_CACHING_MAX_AGE_IN_SEC", pPlugCachingMaxAgeInSec);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_COND_TYPE", pPlugCacheWhenCondType);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E1", pPlugCacheWhenConditionE1);
			cmd.addParameter("@P_PLUG_CACHE_WHEN_CONDITION_E2", pPlugCacheWhenConditionE2);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createRowTemplate(NNumber pId,NNumber pFlowId,NString pRowTemplateName,NString pRowTemplateType,NString pColumnHeadingTemplate,NString pRowTemplate1,NString pRowTemplateCondition1,NString pRowTemplateDisplayCond1,NString pRowTemplate2,NString pRowTemplateCondition2,NString pRowTemplateDisplayCond2,NString pRowTemplate3,NString pRowTemplateCondition3,NString pRowTemplateDisplayCond3,NString pRowTemplate4,NString pRowTemplateCondition4,NString pRowTemplateDisplayCond4,NString pRowTemplateBeforeRows,NString pRowTemplateAfterRows,NString pRowTemplateBeforeFirst,NString pRowTemplateAfterLast,NString pRowTemplateTableAttr,NNumber pReferenceId,NString pPaginationTemplate,NString pNextPageTemplate,NString pPreviousPageTemplate,NString pNextSetTemplate,NString pPreviousSetTemplate,NString pRowStyleMouseOver,NString pRowStyleMouseOut,NString pRowStyleChecked,NString pRowStyleUnchecked,NString pTranslateThisTemplate,NString pRowTemplateComment,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ROW_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_ROW_TEMPLATE_NAME", pRowTemplateName);
			cmd.addParameter("@P_ROW_TEMPLATE_TYPE", pRowTemplateType);
			cmd.addParameter("@P_COLUMN_HEADING_TEMPLATE", pColumnHeadingTemplate);
			cmd.addParameter("@P_ROW_TEMPLATE1", pRowTemplate1);
			cmd.addParameter("@P_ROW_TEMPLATE_CONDITION1", pRowTemplateCondition1);
			cmd.addParameter("@P_ROW_TEMPLATE_DISPLAY_COND1", pRowTemplateDisplayCond1);
			cmd.addParameter("@P_ROW_TEMPLATE2", pRowTemplate2);
			cmd.addParameter("@P_ROW_TEMPLATE_CONDITION2", pRowTemplateCondition2);
			cmd.addParameter("@P_ROW_TEMPLATE_DISPLAY_COND2", pRowTemplateDisplayCond2);
			cmd.addParameter("@P_ROW_TEMPLATE3", pRowTemplate3);
			cmd.addParameter("@P_ROW_TEMPLATE_CONDITION3", pRowTemplateCondition3);
			cmd.addParameter("@P_ROW_TEMPLATE_DISPLAY_COND3", pRowTemplateDisplayCond3);
			cmd.addParameter("@P_ROW_TEMPLATE4", pRowTemplate4);
			cmd.addParameter("@P_ROW_TEMPLATE_CONDITION4", pRowTemplateCondition4);
			cmd.addParameter("@P_ROW_TEMPLATE_DISPLAY_COND4", pRowTemplateDisplayCond4);
			cmd.addParameter("@P_ROW_TEMPLATE_BEFORE_ROWS", pRowTemplateBeforeRows);
			cmd.addParameter("@P_ROW_TEMPLATE_AFTER_ROWS", pRowTemplateAfterRows);
			cmd.addParameter("@P_ROW_TEMPLATE_BEFORE_FIRST", pRowTemplateBeforeFirst);
			cmd.addParameter("@P_ROW_TEMPLATE_AFTER_LAST", pRowTemplateAfterLast);
			cmd.addParameter("@P_ROW_TEMPLATE_TABLE_ATTR", pRowTemplateTableAttr);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_PAGINATION_TEMPLATE", pPaginationTemplate);
			cmd.addParameter("@P_NEXT_PAGE_TEMPLATE", pNextPageTemplate);
			cmd.addParameter("@P_PREVIOUS_PAGE_TEMPLATE", pPreviousPageTemplate);
			cmd.addParameter("@P_NEXT_SET_TEMPLATE", pNextSetTemplate);
			cmd.addParameter("@P_PREVIOUS_SET_TEMPLATE", pPreviousSetTemplate);
			cmd.addParameter("@P_ROW_STYLE_MOUSE_OVER", pRowStyleMouseOver);
			cmd.addParameter("@P_ROW_STYLE_MOUSE_OUT", pRowStyleMouseOut);
			cmd.addParameter("@P_ROW_STYLE_CHECKED", pRowStyleChecked);
			cmd.addParameter("@P_ROW_STYLE_UNCHECKED", pRowStyleUnchecked);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_ROW_TEMPLATE_COMMENT", pRowTemplateComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createRowTemplatePatch(NNumber pId,NString pRowTemplateBeforeFirst,NString pRowTemplateAfterLast,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_ROW_TEMPLATE_PATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROW_TEMPLATE_BEFORE_FIRST", pRowTemplateBeforeFirst);
			cmd.addParameter("@P_ROW_TEMPLATE_AFTER_LAST", pRowTemplateAfterLast);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createSecurityScheme(NNumber pId,NNumber pSecurityGroupId,NNumber pFlowId,NString pName,NString pSchemeType,NString pScheme,NString pSchemeText,NString pCaching,NString pErrorMessage,NNumber pReferenceId,NString pComments,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_SECURITY_SCHEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SCHEME_TYPE", pSchemeType);
			cmd.addParameter("@P_SCHEME", pScheme);
			cmd.addParameter("@P_SCHEME_TEXT", pSchemeText);
			cmd.addParameter("@P_CACHING", pCaching);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createSharedQuery(NNumber pId,NNumber pFlowId,NString pName,NString pQueryText,NString pXmlStructure,NNumber pReportLayoutId,NString pFormat,NString pFormatItem,NString pOutputFileName,NString pXmlItems) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_SHARED_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_QUERY_TEXT", pQueryText);
			cmd.addParameter("@P_XML_STRUCTURE", pXmlStructure);
			cmd.addParameter("@P_REPORT_LAYOUT_ID", pReportLayoutId);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_FORMAT_ITEM", pFormatItem);
			cmd.addParameter("@P_OUTPUT_FILE_NAME", pOutputFileName);
			cmd.addParameter("@P_XML_ITEMS", pXmlItems);
				
			cmd.execute();


		}
		
		public static void createShortcut(NNumber pId,NNumber pFlowId,NString pShortcutName,NNumber pShortcutConsiderationSeq,NString pShortcutType,NString pShortcutConditionType1,NString pShortcutCondition1,NString pShortcutConditionType2,NString pShortcutCondition2,NNumber pBuildOption,NString pErrorText,NNumber pReferenceId,NString pComments,NString pShortcut,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_SHORTCUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SHORTCUT_NAME", pShortcutName);
			cmd.addParameter("@P_SHORTCUT_CONSIDERATION_SEQ", pShortcutConsiderationSeq);
			cmd.addParameter("@P_SHORTCUT_TYPE", pShortcutType);
			cmd.addParameter("@P_SHORTCUT_CONDITION_TYPE1", pShortcutConditionType1);
			cmd.addParameter("@P_SHORTCUT_CONDITION1", pShortcutCondition1);
			cmd.addParameter("@P_SHORTCUT_CONDITION_TYPE2", pShortcutConditionType2);
			cmd.addParameter("@P_SHORTCUT_CONDITION2", pShortcutCondition2);
			cmd.addParameter("@P_BUILD_OPTION", pBuildOption);
			cmd.addParameter("@P_ERROR_TEXT", pErrorText);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_SHORTCUT", pShortcut);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createStaticLovData(NNumber pId,NNumber pLovId,NNumber pLovDispSequence,NString pLovDispValue,NString pLovReturnValue,NString pLovTemplate,NString pLovDispCondType,NString pLovDispCond,NString pLovDispCond2,NString pRequiredPatch,NString pLovDataComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_STATIC_LOV_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LOV_ID", pLovId);
			cmd.addParameter("@P_LOV_DISP_SEQUENCE", pLovDispSequence);
			cmd.addParameter("@P_LOV_DISP_VALUE", pLovDispValue);
			cmd.addParameter("@P_LOV_RETURN_VALUE", pLovReturnValue);
			cmd.addParameter("@P_LOV_TEMPLATE", pLovTemplate);
			cmd.addParameter("@P_LOV_DISP_COND_TYPE", pLovDispCondType);
			cmd.addParameter("@P_LOV_DISP_COND", pLovDispCond);
			cmd.addParameter("@P_LOV_DISP_COND2", pLovDispCond2);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_LOV_DATA_COMMENT", pLovDataComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createTab(NNumber pId,NNumber pFlowId,NString pTabSet,NNumber pTabSequence,NString pTabName,NString pTabImage,NString pTabNonCurrentImage,NString pTabImageAttributes,NString pTabText,NNumber pTabStep,NString pTabAlsoCurrentForPages,NString pTabParentTabset,NString pTabPlsqlCondition,NString pDisplayConditionType,NString pTabDispCondText,NNumber pRequiredPatch,NString pSecurityScheme,NString pTabComment,NString pAutoParentTabSet,NString pAutoParentTabText,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_TAB_SEQUENCE", pTabSequence);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_TAB_IMAGE", pTabImage);
			cmd.addParameter("@P_TAB_NON_CURRENT_IMAGE", pTabNonCurrentImage);
			cmd.addParameter("@P_TAB_IMAGE_ATTRIBUTES", pTabImageAttributes);
			cmd.addParameter("@P_TAB_TEXT", pTabText);
			cmd.addParameter("@P_TAB_STEP", pTabStep);
			cmd.addParameter("@P_TAB_ALSO_CURRENT_FOR_PAGES", pTabAlsoCurrentForPages);
			cmd.addParameter("@P_TAB_PARENT_TABSET", pTabParentTabset);
			cmd.addParameter("@P_TAB_PLSQL_CONDITION", pTabPlsqlCondition);
			cmd.addParameter("@P_DISPLAY_CONDITION_TYPE", pDisplayConditionType);
			cmd.addParameter("@P_TAB_DISP_COND_TEXT", pTabDispCondText);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_TAB_COMMENT", pTabComment);
			cmd.addParameter("@P_AUTO_PARENT_TAB_SET", pAutoParentTabSet);
			cmd.addParameter("@P_AUTO_PARENT_TAB_TEXT", pAutoParentTabText);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createTemplate(NNumber pId,NNumber pFlowId,NString pName,NNumber pLook,NString pHeaderTemplate,NString pFooterTemplate,NString pSuccessMessage,NString pCurrentTab,NString pCurrentTabFontAttr,NString pNonCurrentTab,NString pNonCurrentTabFontAttr,NString pCurrentImageTab,NString pNonCurrentImageTab,NString pTopCurrentTab,NString pTopCurrentTabFontAttr,NString pTopNonCurrTab,NString pTopNonCurrTabFontAttr,NString pBox,NString pNavigationBar,NString pNavbarEntry,NString pBodyTitle,NString pNotificationMessage,NString pAttribute1,NString pAttribute2,NString pAttribute3,NString pAttribute4,NString pAttribute5,NString pAttribute6,NString pTableBgcolor,NString pHeadingBgcolor,NString pTableCattributes,NString pFontSize,NString pFontFace,NString pRegionTableCattributes,NString pAppTabBeforeTabs,NString pAppTabCurrentTab,NString pAppTabNonCurrentTab,NString pAppTabAfterTabs,NString pErrorPageTemplate,NString pDefaultButtonPosition,NNumber pRequiredPatch,NNumber pReferenceId,NString pTranslateThisTemplate,NString pTemplateComment,NString pBreadcrumbDefRegPos,NString pSidebarDefRegPos,NNumber pIdOffset,NString pTarget,NNumber pThemeId,NNumber pThemeClassId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LOOK", pLook);
			cmd.addParameter("@P_HEADER_TEMPLATE", pHeaderTemplate);
			cmd.addParameter("@P_FOOTER_TEMPLATE", pFooterTemplate);
			cmd.addParameter("@P_SUCCESS_MESSAGE", pSuccessMessage);
			cmd.addParameter("@P_CURRENT_TAB", pCurrentTab);
			cmd.addParameter("@P_CURRENT_TAB_FONT_ATTR", pCurrentTabFontAttr);
			cmd.addParameter("@P_NON_CURRENT_TAB", pNonCurrentTab);
			cmd.addParameter("@P_NON_CURRENT_TAB_FONT_ATTR", pNonCurrentTabFontAttr);
			cmd.addParameter("@P_CURRENT_IMAGE_TAB", pCurrentImageTab);
			cmd.addParameter("@P_NON_CURRENT_IMAGE_TAB", pNonCurrentImageTab);
			cmd.addParameter("@P_TOP_CURRENT_TAB", pTopCurrentTab);
			cmd.addParameter("@P_TOP_CURRENT_TAB_FONT_ATTR", pTopCurrentTabFontAttr);
			cmd.addParameter("@P_TOP_NON_CURR_TAB", pTopNonCurrTab);
			cmd.addParameter("@P_TOP_NON_CURR_TAB_FONT_ATTR", pTopNonCurrTabFontAttr);
			cmd.addParameter("@P_BOX", pBox);
			cmd.addParameter("@P_NAVIGATION_BAR", pNavigationBar);
			cmd.addParameter("@P_NAVBAR_ENTRY", pNavbarEntry);
			cmd.addParameter("@P_BODY_TITLE", pBodyTitle);
			cmd.addParameter("@P_NOTIFICATION_MESSAGE", pNotificationMessage);
			cmd.addParameter("@P_ATTRIBUTE1", pAttribute1);
			cmd.addParameter("@P_ATTRIBUTE2", pAttribute2);
			cmd.addParameter("@P_ATTRIBUTE3", pAttribute3);
			cmd.addParameter("@P_ATTRIBUTE4", pAttribute4);
			cmd.addParameter("@P_ATTRIBUTE5", pAttribute5);
			cmd.addParameter("@P_ATTRIBUTE6", pAttribute6);
			cmd.addParameter("@P_TABLE_BGCOLOR", pTableBgcolor);
			cmd.addParameter("@P_HEADING_BGCOLOR", pHeadingBgcolor);
			cmd.addParameter("@P_TABLE_CATTRIBUTES", pTableCattributes);
			cmd.addParameter("@P_FONT_SIZE", pFontSize);
			cmd.addParameter("@P_FONT_FACE", pFontFace);
			cmd.addParameter("@P_REGION_TABLE_CATTRIBUTES", pRegionTableCattributes);
			cmd.addParameter("@P_APP_TAB_BEFORE_TABS", pAppTabBeforeTabs);
			cmd.addParameter("@P_APP_TAB_CURRENT_TAB", pAppTabCurrentTab);
			cmd.addParameter("@P_APP_TAB_NON_CURRENT_TAB", pAppTabNonCurrentTab);
			cmd.addParameter("@P_APP_TAB_AFTER_TABS", pAppTabAfterTabs);
			cmd.addParameter("@P_ERROR_PAGE_TEMPLATE", pErrorPageTemplate);
			cmd.addParameter("@P_DEFAULT_BUTTON_POSITION", pDefaultButtonPosition);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_TRANSLATE_THIS_TEMPLATE", pTranslateThisTemplate);
			cmd.addParameter("@P_TEMPLATE_COMMENT", pTemplateComment);
			cmd.addParameter("@P_BREADCRUMB_DEF_REG_POS", pBreadcrumbDefRegPos);
			cmd.addParameter("@P_SIDEBAR_DEF_REG_POS", pSidebarDefRegPos);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_CLASS_ID", pThemeClassId);
				
			cmd.execute();


		}
		
		public static void createTheme(NNumber pId,NNumber pFlowId,NNumber pThemeId,NString pThemeName,NNumber pDefaultPageTemplate,NNumber pErrorTemplate,NNumber pPrinterFriendlyTemplate,NString pBreadcrumbDisplayPoint,NString pSidebarDisplayPoint,NNumber pLoginTemplate,NNumber pDefaultButtonTemplate,NNumber pDefaultRegionTemplate,NNumber pDefaultChartTemplate,NNumber pDefaultFormTemplate,NNumber pDefaultReportrTemplate,NNumber pDefaultTabformTemplate,NNumber pDefaultWizardTemplate,NNumber pDefaultMenurTemplate,NNumber pDefaultListrTemplate,NNumber pDefaultReportTemplate,NNumber pDefaultLabelTemplate,NNumber pDefaultMenuTemplate,NNumber pDefaultCalendarTemplate,NNumber pDefaultListTemplate,NNumber pDefaultOptionLabel,NNumber pDefaultRequiredLabel,NString pCalendarIcon,NString pCalendarIconAttr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_THEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_THEME_NAME", pThemeName);
			cmd.addParameter("@P_DEFAULT_PAGE_TEMPLATE", pDefaultPageTemplate);
			cmd.addParameter("@P_ERROR_TEMPLATE", pErrorTemplate);
			cmd.addParameter("@P_PRINTER_FRIENDLY_TEMPLATE", pPrinterFriendlyTemplate);
			cmd.addParameter("@P_BREADCRUMB_DISPLAY_POINT", pBreadcrumbDisplayPoint);
			cmd.addParameter("@P_SIDEBAR_DISPLAY_POINT", pSidebarDisplayPoint);
			cmd.addParameter("@P_LOGIN_TEMPLATE", pLoginTemplate);
			cmd.addParameter("@P_DEFAULT_BUTTON_TEMPLATE", pDefaultButtonTemplate);
			cmd.addParameter("@P_DEFAULT_REGION_TEMPLATE", pDefaultRegionTemplate);
			cmd.addParameter("@P_DEFAULT_CHART_TEMPLATE", pDefaultChartTemplate);
			cmd.addParameter("@P_DEFAULT_FORM_TEMPLATE", pDefaultFormTemplate);
			cmd.addParameter("@P_DEFAULT_REPORTR_TEMPLATE", pDefaultReportrTemplate);
			cmd.addParameter("@P_DEFAULT_TABFORM_TEMPLATE", pDefaultTabformTemplate);
			cmd.addParameter("@P_DEFAULT_WIZARD_TEMPLATE", pDefaultWizardTemplate);
			cmd.addParameter("@P_DEFAULT_MENUR_TEMPLATE", pDefaultMenurTemplate);
			cmd.addParameter("@P_DEFAULT_LISTR_TEMPLATE", pDefaultListrTemplate);
			cmd.addParameter("@P_DEFAULT_REPORT_TEMPLATE", pDefaultReportTemplate);
			cmd.addParameter("@P_DEFAULT_LABEL_TEMPLATE", pDefaultLabelTemplate);
			cmd.addParameter("@P_DEFAULT_MENU_TEMPLATE", pDefaultMenuTemplate);
			cmd.addParameter("@P_DEFAULT_CALENDAR_TEMPLATE", pDefaultCalendarTemplate);
			cmd.addParameter("@P_DEFAULT_LIST_TEMPLATE", pDefaultListTemplate);
			cmd.addParameter("@P_DEFAULT_OPTION_LABEL", pDefaultOptionLabel);
			cmd.addParameter("@P_DEFAULT_REQUIRED_LABEL", pDefaultRequiredLabel);
			cmd.addParameter("@P_CALENDAR_ICON", pCalendarIcon);
			cmd.addParameter("@P_CALENDAR_ICON_ATTR", pCalendarIconAttr);
				
			cmd.execute();


		}
		
		public static void createToplevelTab(NNumber pId,NNumber pFlowId,NString pTabSet,NNumber pTabSequence,NString pTabName,NString pTabImage,NString pTabNonCurrentImage,NString pTabImageAttributes,NString pTabText,NString pTabTarget,NString pCurrentOnTabset,NString pDisplayCondition,NString pDisplayCondition2,NString pDisplayConditionType,NNumber pRequiredPatch,NString pSecurityScheme,NString pTabComment,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_TOPLEVEL_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_TAB_SEQUENCE", pTabSequence);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_TAB_IMAGE", pTabImage);
			cmd.addParameter("@P_TAB_NON_CURRENT_IMAGE", pTabNonCurrentImage);
			cmd.addParameter("@P_TAB_IMAGE_ATTRIBUTES", pTabImageAttributes);
			cmd.addParameter("@P_TAB_TEXT", pTabText);
			cmd.addParameter("@P_TAB_TARGET", pTabTarget);
			cmd.addParameter("@P_CURRENT_ON_TABSET", pCurrentOnTabset);
			cmd.addParameter("@P_DISPLAY_CONDITION", pDisplayCondition);
			cmd.addParameter("@P_DISPLAY_CONDITION2", pDisplayCondition2);
			cmd.addParameter("@P_DISPLAY_CONDITION_TYPE", pDisplayConditionType);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
			cmd.addParameter("@P_TAB_COMMENT", pTabComment);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createTranslation(NNumber pId,NNumber pTranslatedFlowId,NNumber pFlowId,NNumber pPageId,NNumber pTranslateToId,NNumber pTranslateFromId,NString pTranslateFromFlowTable,NString pTranslateFromFlowColumn,NString pTranslateToLangCode,NString pTranslationSpecificToItem,NString pTranslateToText,NString pTranslateFromText,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_TRANSLATED_FLOW_ID", pTranslatedFlowId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_TRANSLATE_TO_ID", pTranslateToId);
			cmd.addParameter("@P_TRANSLATE_FROM_ID", pTranslateFromId);
			cmd.addParameter("@P_TRANSLATE_FROM_FLOW_TABLE", pTranslateFromFlowTable);
			cmd.addParameter("@P_TRANSLATE_FROM_FLOW_COLUMN", pTranslateFromFlowColumn);
			cmd.addParameter("@P_TRANSLATE_TO_LANG_CODE", pTranslateToLangCode);
			cmd.addParameter("@P_TRANSLATION_SPECIFIC_TO_ITEM", pTranslationSpecificToItem);
			cmd.addParameter("@P_TRANSLATE_TO_TEXT", pTranslateToText);
			cmd.addParameter("@P_TRANSLATE_FROM_TEXT", pTranslateFromText);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createTree(NNumber pId,NNumber pFlowId,NString pName,NString pType,NString pItem,NString pQuery,NNumber pLevels,NString pUnexpandedParent,NString pUnexpandedParentLast,NString pExpandedParent,NString pExpandedParentLast,NString pLeafNode,NString pLeafNodeLast,NString pNameLinkAnchorTag,NString pNameLinkNotAnchorTag,NString pIndentVerticalLine,NString pIndentVerticalLineLast,NString pDrillUp,NString pBeforeTree,NString pAfterTree,NString pLevel1Template,NString pLevel2Template,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_TREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_LEVELS", pLevels);
			cmd.addParameter("@P_UNEXPANDED_PARENT", pUnexpandedParent);
			cmd.addParameter("@P_UNEXPANDED_PARENT_LAST", pUnexpandedParentLast);
			cmd.addParameter("@P_EXPANDED_PARENT", pExpandedParent);
			cmd.addParameter("@P_EXPANDED_PARENT_LAST", pExpandedParentLast);
			cmd.addParameter("@P_LEAF_NODE", pLeafNode);
			cmd.addParameter("@P_LEAF_NODE_LAST", pLeafNodeLast);
			cmd.addParameter("@P_NAME_LINK_ANCHOR_TAG", pNameLinkAnchorTag);
			cmd.addParameter("@P_NAME_LINK_NOT_ANCHOR_TAG", pNameLinkNotAnchorTag);
			cmd.addParameter("@P_INDENT_VERTICAL_LINE", pIndentVerticalLine);
			cmd.addParameter("@P_INDENT_VERTICAL_LINE_LAST", pIndentVerticalLineLast);
			cmd.addParameter("@P_DRILL_UP", pDrillUp);
			cmd.addParameter("@P_BEFORE_TREE", pBeforeTree);
			cmd.addParameter("@P_AFTER_TREE", pAfterTree);
			cmd.addParameter("@P_LEVEL_1_TEMPLATE", pLevel1Template);
			cmd.addParameter("@P_LEVEL_2_TEMPLATE", pLevel2Template);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createWebService(NNumber pId,NNumber pSecurityGroupId,NNumber pFlowId,NString pName,NString pUrl,NString pAction,NString pProxyOverride,NString pSoapEnvelope,NString pFlowItemsCommaDelimited,NString pStaticParm01,NString pStaticParm02,NString pStaticParm03,NString pStaticParm04,NString pStaticParm05,NString pStaticParm06,NString pStaticParm07,NString pStaticParm08,NString pStaticParm09,NString pStaticParm10,NString pStylesheet,NNumber pReferenceId,NNumber pIdOffset,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_WEB_SERVICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_PROXY_OVERRIDE", pProxyOverride);
			cmd.addParameter("@P_SOAP_ENVELOPE", pSoapEnvelope);
			cmd.addParameter("@P_FLOW_ITEMS_COMMA_DELIMITED", pFlowItemsCommaDelimited);
			cmd.addParameter("@P_STATIC_PARM_01", pStaticParm01);
			cmd.addParameter("@P_STATIC_PARM_02", pStaticParm02);
			cmd.addParameter("@P_STATIC_PARM_03", pStaticParm03);
			cmd.addParameter("@P_STATIC_PARM_04", pStaticParm04);
			cmd.addParameter("@P_STATIC_PARM_05", pStaticParm05);
			cmd.addParameter("@P_STATIC_PARM_06", pStaticParm06);
			cmd.addParameter("@P_STATIC_PARM_07", pStaticParm07);
			cmd.addParameter("@P_STATIC_PARM_08", pStaticParm08);
			cmd.addParameter("@P_STATIC_PARM_09", pStaticParm09);
			cmd.addParameter("@P_STATIC_PARM_10", pStaticParm10);
			cmd.addParameter("@P_STYLESHEET", pStylesheet);
			cmd.addParameter("@P_REFERENCE_ID", pReferenceId);
			cmd.addParameter("@P_ID_OFFSET", pIdOffset);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void createWsOperations(NNumber pId,NNumber pWsId,NString pName,NString pInputMessageName,NString pInputMessageNs,NString pInputMessageStyle,NString pOutputMessageName,NString pOutputMessageNs,NString pOutputMessageStyle,NString pHeaderMessageName,NString pHeaderMessageStyle,NString pSoapAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_WS_OPERATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_WS_ID", pWsId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_INPUT_MESSAGE_NAME", pInputMessageName);
			cmd.addParameter("@P_INPUT_MESSAGE_NS", pInputMessageNs);
			cmd.addParameter("@P_INPUT_MESSAGE_STYLE", pInputMessageStyle);
			cmd.addParameter("@P_OUTPUT_MESSAGE_NAME", pOutputMessageName);
			cmd.addParameter("@P_OUTPUT_MESSAGE_NS", pOutputMessageNs);
			cmd.addParameter("@P_OUTPUT_MESSAGE_STYLE", pOutputMessageStyle);
			cmd.addParameter("@P_HEADER_MESSAGE_NAME", pHeaderMessageName);
			cmd.addParameter("@P_HEADER_MESSAGE_STYLE", pHeaderMessageStyle);
			cmd.addParameter("@P_SOAP_ACTION", pSoapAction);
				
			cmd.execute();


		}
		
		public static void createWsParameters(NNumber pId,NNumber pWsOpersId,NString pName,NString pInputOrOutput,NString pParmType,NString pTypeIsXsd,NString pParentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_WS_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_WS_OPERS_ID", pWsOpersId);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_INPUT_OR_OUTPUT", pInputOrOutput);
			cmd.addParameter("@P_PARM_TYPE", pParmType);
			cmd.addParameter("@P_TYPE_IS_XSD", pTypeIsXsd);
			cmd.addParameter("@P_PARENT_ID", pParentId);
				
			cmd.execute();


		}
		
		public static void createWsProcessParmsMap(NNumber pId,NNumber pParameterId,NNumber pProcessId,NString pMapType,NString pParmValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.CREATE_WS_PROCESS_PARMS_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PARAMETER_ID", pParameterId);
			cmd.addParameter("@P_PROCESS_ID", pProcessId);
			cmd.addParameter("@P_MAP_TYPE", pMapType);
			cmd.addParameter("@P_PARM_VALUE", pParmValue);
				
			cmd.execute();


		}
		
		public static void deleteTemplate(NString pType,NNumber pFlowId,NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.DELETE_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void deleteTheme(NNumber pFlowId,NNumber pThemeId,NString pImport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.DELETE_THEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_THEME_ID", pThemeId);
			cmd.addParameter("@P_IMPORT", pImport);
				
			cmd.execute();


		}
		
		public static NString FgetApplicationOwner(NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.GET_APPLICATION_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetSecurityGroupId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.GET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void importScript(NString pFilename,List<DbmsSql.Varchar2TableRow> pVarchar2Table,NNumber pFlowId,NNumber pPathid,NString pName,NString pTitle,NString pMimeType,NString pDadCharset,NDate pDeletedAsOf,NString pContentType,NString pLanguage,NString pDescription,NString pFileType,NString pFileCharset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.IMPORT_SCRIPT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_FILENAME", pFilename);
//			// cmd.addParameter(DbTypes.getTableType("P_VARCHAR2_TABLE", "", pVarchar2Table, object.class));
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_PATHID", pPathid);
//			cmd.addParameter("@P_NAME", pName);
//			cmd.addParameter("@P_TITLE", pTitle);
//			cmd.addParameter("@P_MIME_TYPE", pMimeType);
//			cmd.addParameter("@P_DAD_CHARSET", pDadCharset);
//			cmd.addParameter("@P_DELETED_AS_OF", pDeletedAsOf);
//			cmd.addParameter("@P_CONTENT_TYPE", pContentType);
//			cmd.addParameter("@P_LANGUAGE", pLanguage);
//			cmd.addParameter("@P_DESCRIPTION", pDescription);
//			cmd.addParameter("@P_FILE_TYPE", pFileType);
//			cmd.addParameter("@P_FILE_CHARSET", pFileCharset);
//				
//			cmd.execute();
//
//
//		}
		
		public static void removeDyanamicTranslation(NNumber pFlowId,NString pLanguage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.REMOVE_DYANAMIC_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LANGUAGE", pLanguage);
				
			cmd.execute();


		}
		
		public static void removeFlow(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.REMOVE_FLOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void removeIconBarItem(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.REMOVE_ICON_BAR_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void removePage(NNumber pFlowId,NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.REMOVE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void removeTranslation(NNumber pTranslatedFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.REMOVE_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANSLATED_FLOW_ID", pTranslatedFlowId);
				
			cmd.execute();


		}
		
		public static void renameTabset(NNumber pFlowId,NString pOldName,NString pNewName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.RENAME_TABSET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_OLD_NAME", pOldName);
			cmd.addParameter("@P_NEW_NAME", pNewName);
				
			cmd.execute();


		}
		
		public static void setApplicationAlias(NNumber pFlowId,NString pAlias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_APPLICATION_ALIAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_ALIAS", pAlias);
				
			cmd.execute();


		}
		
		public static void setApplicationLock(NNumber pFlowId,NString pLockedBy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_APPLICATION_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOCKED_BY", pLockedBy);
				
			cmd.execute();


		}
		
		public static void setApplicationName(NNumber pFlowId,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_APPLICATION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();


		}
		
		public static void setApplicationOwner(NNumber pFlowId,NString pApplicationOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_APPLICATION_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_APPLICATION_OWNER", pApplicationOwner);
				
			cmd.execute();


		}
		
		public static void setAuthenticatedUrlPrefix(NNumber pFlowId,NString pAuthenticatedUrlPrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_AUTHENTICATED_URL_PREFIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_AUTHENTICATED_URL_PREFIX", pAuthenticatedUrlPrefix);
				
			cmd.execute();


		}
		
		public static void setBuildOption(NNumber pId,NString pBuildOptionStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_BUILD_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_BUILD_OPTION_STATUS", pBuildOptionStatus);
				
			cmd.execute();


		}
		
		public static void setBuildStatusRunOnly(NNumber pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_BUILD_STATUS_RUN_ONLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void setEnableAppDebugging(NNumber pFlowId,NString pDebugging) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_ENABLE_APP_DEBUGGING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_DEBUGGING", pDebugging);
				
			cmd.execute();


		}
		
		public static void setExactSubs(NNumber pFlowId,NString pExactSubstitutions) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_EXACT_SUBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_EXACT_SUBSTITUTIONS", pExactSubstitutions);
				
			cmd.execute();


		}
		
		public static void setFlowAuthentication(NNumber pFlowId,NString pAuthentication) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_FLOW_AUTHENTICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_AUTHENTICATION", pAuthentication);
				
			cmd.execute();


		}
		
		public static void setFlowProcessSql(NNumber pId,NString pProcessSql) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_FLOW_PROCESS_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PROCESS_SQL", pProcessSql);
				
			cmd.execute();


		}
		
		public static void setFlowStatus(NNumber pFlowId,NString pFlowStatus,NString pFlowStatusMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_FLOW_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STATUS", pFlowStatus);
			cmd.addParameter("@P_FLOW_STATUS_MESSAGE", pFlowStatusMessage);
				
			cmd.execute();


		}
		
		public static void setGlobalNotification(NNumber pFlowId,NString pGlobalNotification) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_GLOBAL_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_GLOBAL_NOTIFICATION", pGlobalNotification);
				
			cmd.execute();


		}
		
		public static void setHomeLink(NNumber pFlowId,NString pHomeLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_HOME_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_HOME_LINK", pHomeLink);
				
			cmd.execute();


		}
		
		public static void setHtmlPageHeader(NNumber pFlowId,NNumber pFlowStepId,NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_HTML_PAGE_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();


		}
		
		public static void setIconBarItem(NNumber pId,NNumber pIconSequence,NString pIconImage,NString pIconImage2,NString pIconImage3,NString pIconSubtext,NString pIconSubtext2,NString pIconSubtext3,NString pIconTarget,NString pIconImageAlt,NNumber pIconHeight,NNumber pIconWidth,NNumber pIconHeight2,NNumber pIconWidth2,NNumber pIconHeight3,NNumber pIconWidth3,NString pIconBarDispCond,NString pIconBarDispCondType,NString pIconBarFlowCondInstr,NString pBeginsOnNewLine,NNumber pCellColspan,NNumber pRequiredPatch,NString pIconBarComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_ICON_BAR_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ICON_SEQUENCE", pIconSequence);
			cmd.addParameter("@P_ICON_IMAGE", pIconImage);
			cmd.addParameter("@P_ICON_IMAGE2", pIconImage2);
			cmd.addParameter("@P_ICON_IMAGE3", pIconImage3);
			cmd.addParameter("@P_ICON_SUBTEXT", pIconSubtext);
			cmd.addParameter("@P_ICON_SUBTEXT2", pIconSubtext2);
			cmd.addParameter("@P_ICON_SUBTEXT3", pIconSubtext3);
			cmd.addParameter("@P_ICON_TARGET", pIconTarget);
			cmd.addParameter("@P_ICON_IMAGE_ALT", pIconImageAlt);
			cmd.addParameter("@P_ICON_HEIGHT", pIconHeight);
			cmd.addParameter("@P_ICON_WIDTH", pIconWidth);
			cmd.addParameter("@P_ICON_HEIGHT2", pIconHeight2);
			cmd.addParameter("@P_ICON_WIDTH2", pIconWidth2);
			cmd.addParameter("@P_ICON_HEIGHT3", pIconHeight3);
			cmd.addParameter("@P_ICON_WIDTH3", pIconWidth3);
			cmd.addParameter("@P_ICON_BAR_DISP_COND", pIconBarDispCond);
			cmd.addParameter("@P_ICON_BAR_DISP_COND_TYPE", pIconBarDispCondType);
			cmd.addParameter("@P_ICON_BAR_FLOW_COND_INSTR", pIconBarFlowCondInstr);
			cmd.addParameter("@P_BEGINS_ON_NEW_LINE", pBeginsOnNewLine);
			cmd.addParameter("@P_CELL_COLSPAN", pCellColspan);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_ICON_BAR_COMMENT", pIconBarComment);
				
			cmd.execute();


		}
		
		public static void setImagePrefix(NNumber pFlowId,NString pImagePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_IMAGE_PREFIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_IMAGE_PREFIX", pImagePrefix);
				
			cmd.execute();


		}
		
		public static void setListItemLinkTarget(NNumber pId,NString pLinkTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LIST_ITEM_LINK_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LINK_TARGET", pLinkTarget);
				
			cmd.execute();


		}
		
		public static void setListItemLinkText(NNumber pId,NString pLinkText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LIST_ITEM_LINK_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LINK_TEXT", pLinkText);
				
			cmd.execute();


		}
		
		public static void setListItemSequence(NNumber pId,NNumber pItemSequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LIST_ITEM_SEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ITEM_SEQUENCE", pItemSequence);
				
			cmd.execute();


		}
		
		public static void setLogging(NNumber pFlowId,NString pLogging) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LOGGING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOGGING", pLogging);
				
			cmd.execute();


		}
		
		public static void setLoginUrl(NNumber pFlowId,NString pLoginUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LOGIN_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOGIN_URL", pLoginUrl);
				
			cmd.execute();


		}
		
		public static void setLogoImage(NNumber pFlowId,NString pLogoImage,NString pLogoImageAttributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LOGO_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOGO_IMAGE", pLogoImage);
			cmd.addParameter("@P_LOGO_IMAGE_ATTRIBUTES", pLogoImageAttributes);
				
			cmd.execute();


		}
		
		public static void setLogoutUrl(NNumber pFlowId,NString pLogoutUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_LOGOUT_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LOGOUT_URL", pLogoutUrl);
				
			cmd.execute();


		}
		
		public static void setPageHelpText(NNumber pFlowId,NNumber pFlowStepId,NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PAGE_HELP_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();


		}
		
		public static void setPageProtEnabledYN(NNumber pFlowId,NString pPageProtection) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PAGE_PROT_ENABLED_Y_N", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_PROTECTION", pPageProtection);
				
			cmd.execute();


		}
		
		public static void setPlugQueryHeading(NNumber pId,NString pPlugQueryHeading) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PLUG_QUERY_HEADING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PLUG_QUERY_HEADING", pPlugQueryHeading);
				
			cmd.execute();


		}
		
		public static void setPlugSource(NNumber pId,NString pPlugSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PLUG_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PLUG_SOURCE", pPlugSource);
				
			cmd.execute();


		}
		
		public static void setPlugTemplateTabAttr(NNumber pId,NString pFormTableAttr,NString pTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PLUG_TEMPLATE_TAB_ATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FORM_TABLE_ATTR", pFormTableAttr);
			cmd.addParameter("@P_TARGET", pTarget);
				
			cmd.execute();


		}
		
		public static void setProxyServer(NNumber pFlowId,NString pProxyServer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PROXY_SERVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PROXY_SERVER", pProxyServer);
				
			cmd.execute();


		}
		
		public static void setPublicUrlPrefix(NNumber pFlowId,NString pPublicUrlPrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_PUBLIC_URL_PREFIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PUBLIC_URL_PREFIX", pPublicUrlPrefix);
				
			cmd.execute();


		}
		
		public static void setRegionColumnWidth(NNumber pId,NNumber pFlowId,NNumber pPageId,NString pPlugColumnWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_REGION_COLUMN_WIDTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_PLUG_COLUMN_WIDTH", pPlugColumnWidth);
				
			cmd.execute();


		}
		
		public static void setSecurityGroupId(NNumber pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_SECURITY_GROUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();


		}
		
		public static void setSecurityScheme(NNumber pFlowId,NString pSecurityScheme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_SECURITY_SCHEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
				
			cmd.execute();


		}
		
		public static void setStaticSubStrings(NNumber pFlowId,NString pSubstitutionString01,NString pSubstitutionValue01,NString pSubstitutionString02,NString pSubstitutionValue02,NString pSubstitutionString03,NString pSubstitutionValue03,NString pSubstitutionString04,NString pSubstitutionValue04,NString pSubstitutionString05,NString pSubstitutionValue05,NString pSubstitutionString06,NString pSubstitutionValue06,NString pSubstitutionString07,NString pSubstitutionValue07,NString pSubstitutionString08,NString pSubstitutionValue08) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_STATIC_SUB_STRINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_SUBSTITUTION_STRING_01", pSubstitutionString01);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_01", pSubstitutionValue01);
			cmd.addParameter("@P_SUBSTITUTION_STRING_02", pSubstitutionString02);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_02", pSubstitutionValue02);
			cmd.addParameter("@P_SUBSTITUTION_STRING_03", pSubstitutionString03);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_03", pSubstitutionValue03);
			cmd.addParameter("@P_SUBSTITUTION_STRING_04", pSubstitutionString04);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_04", pSubstitutionValue04);
			cmd.addParameter("@P_SUBSTITUTION_STRING_05", pSubstitutionString05);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_05", pSubstitutionValue05);
			cmd.addParameter("@P_SUBSTITUTION_STRING_06", pSubstitutionString06);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_06", pSubstitutionValue06);
			cmd.addParameter("@P_SUBSTITUTION_STRING_07", pSubstitutionString07);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_07", pSubstitutionValue07);
			cmd.addParameter("@P_SUBSTITUTION_STRING_08", pSubstitutionString08);
			cmd.addParameter("@P_SUBSTITUTION_VALUE_08", pSubstitutionValue08);
				
			cmd.execute();


		}
		
		public static void setTemplate(NNumber pFlowId,NString pTemplate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_TEMPLATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TEMPLATE", pTemplate);
				
			cmd.execute();


		}
		
		public static void setThemeCalendarIcon(NNumber pId,NNumber pFlowId,NString pCalendarIcon,NString pCalendarIconAttr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_THEME_CALENDAR_ICON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_CALENDAR_ICON", pCalendarIcon);
			cmd.addParameter("@P_CALENDAR_ICON_ATTR", pCalendarIconAttr);
				
			cmd.execute();


		}
		
		public static void setToplevelTabTarget(NNumber pId,NString pTabTarget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_TOPLEVEL_TAB_TARGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_TAB_TARGET", pTabTarget);
				
			cmd.execute();


		}
		
		public static void setToplevelTabText(NNumber pId,NString pTabText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_TOPLEVEL_TAB_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_TAB_TEXT", pTabText);
				
			cmd.execute();


		}
		
		public static void setVersion(NString pVersionYyyyMmDd,NString pDebug) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VERSION_YYYY_MM_DD", pVersionYyyyMmDd);
			cmd.addParameter("@P_DEBUG", pDebug);
				
			cmd.execute();


		}
		
		public static void setVpd(NNumber pFlowId,NString pVpd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.SET_VPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_VPD", pVpd);
				
			cmd.execute();


		}
		
		public static void updateOwner(NNumber pFlowId,NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_OWNER", pOwner);
				
			cmd.execute();


		}
		
		public static void updatePage(NNumber pId,NNumber pFlowId,NString pTabSet,NString pName,NString pStepTitle,NString pStepSubTitle,NString pStepSubTitleType,NString pWelcomeText,NString pBoxWelcomeText,NString pBoxFooterText,NString pFooterText,NString pHelpText,NString pStepTemplate,NString pBoxImage,NString pRequiredRole,NNumber pRequiredPatch,NString pPageComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_TAB_SET", pTabSet);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_STEP_TITLE", pStepTitle);
			cmd.addParameter("@P_STEP_SUB_TITLE", pStepSubTitle);
			cmd.addParameter("@P_STEP_SUB_TITLE_TYPE", pStepSubTitleType);
			cmd.addParameter("@P_WELCOME_TEXT", pWelcomeText);
			cmd.addParameter("@P_BOX_WELCOME_TEXT", pBoxWelcomeText);
			cmd.addParameter("@P_BOX_FOOTER_TEXT", pBoxFooterText);
			cmd.addParameter("@P_FOOTER_TEXT", pFooterText);
			cmd.addParameter("@P_HELP_TEXT", pHelpText);
			cmd.addParameter("@P_STEP_TEMPLATE", pStepTemplate);
			cmd.addParameter("@P_BOX_IMAGE", pBoxImage);
			cmd.addParameter("@P_REQUIRED_ROLE", pRequiredRole);
			cmd.addParameter("@P_REQUIRED_PATCH", pRequiredPatch);
			cmd.addParameter("@P_PAGE_COMMENT", pPageComment);
				
			cmd.execute();


		}
		
		public static void updatePageItem(NNumber pFlowId,NNumber pPageId,NNumber pItemId,NNumber pNewSequence,NString pDisplayAs,NString pNewName,NString pNewLabel,NString pNewBeginNewLine,NString pNewBeginNewField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_PAGE_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_NEW_SEQUENCE", pNewSequence);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
			cmd.addParameter("@P_NEW_NAME", pNewName);
			cmd.addParameter("@P_NEW_LABEL", pNewLabel);
			cmd.addParameter("@P_NEW_BEGIN_NEW_LINE", pNewBeginNewLine);
			cmd.addParameter("@P_NEW_BEGIN_NEW_FIELD", pNewBeginNewField);
				
			cmd.execute();


		}
		
		public static void updateTabCondition(NNumber pId,NString pTabPlsqlCondition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_TAB_CONDITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_TAB_PLSQL_CONDITION", pTabPlsqlCondition);
				
			cmd.execute();


		}
		
		public static void updateTabText(NNumber pId,NString pTabText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_TAB_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_TAB_TEXT", pTabText);
				
			cmd.execute();


		}
		
		public static void updateToplevelTab(NNumber pId,NString pDisplayCondition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_API.UPDATE_TOPLEVEL_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DISPLAY_CONDITION", pDisplayCondition);
				
			cmd.execute();


		}
		
	
	
	
}
