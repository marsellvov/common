package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtPreferences {
//		public static void addEmailAddresses(NString userNameIn,List<SmpEmdStringArrayRow> userEmailIn,List<SmpEmdIntegerArrayRow> userEmailFormatIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.ADD_EMAIL_ADDRESSES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_IN", "", userEmailIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_FORMAT_IN", "", userEmailFormatIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void createNotificationRule(NString ruleNameIn,NString ruleDescIn,NNumber rulePublicIn,NString ruleTargetTypeIn,List<SmpEmdStringArrayRow> ruleTargetsIn,NNumber wantClearsIn,NNumber wantCriticalAlertsIn,NNumber wantWarningAlertsIn,NNumber wantTgtUpIn,NNumber wantTgtDownIn,NNumber wantTgtUnreachableStartIn,NNumber wantTgtUnreachableEndIn,NNumber wantTgtMetricErrStartIn,NNumber wantTgtMetricErrEndIn,NNumber wantTgtBlkoutStartedIn,NNumber wantTgtBlkoutEndedIn,List<SmpEmdStringArrayRow> ruleMetricNamesIn,List<SmpEmdStringArrayRow> ruleMetricColumnsIn,List<SmpEmdNvpairArrayRow> ruleMetricIndexesIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> emailAddressIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut,NNumber ruleRepeatEnabledIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.CREATE_NOTIFICATION_RULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@RULE_DESC_IN", ruleDescIn);
//			cmd.addParameter("@RULE_PUBLIC_IN", rulePublicIn);
//			cmd.addParameter("@RULE_TARGET_TYPE_IN", ruleTargetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_TARGETS_IN", "", ruleTargetsIn, object.class));
//			cmd.addParameter("@WANT_CLEARS_IN", wantClearsIn);
//			cmd.addParameter("@WANT_CRITICAL_ALERTS_IN", wantCriticalAlertsIn);
//			cmd.addParameter("@WANT_WARNING_ALERTS_IN", wantWarningAlertsIn);
//			cmd.addParameter("@WANT_TGT_UP_IN", wantTgtUpIn);
//			cmd.addParameter("@WANT_TGT_DOWN_IN", wantTgtDownIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_START_IN", wantTgtUnreachableStartIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_END_IN", wantTgtUnreachableEndIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_START_IN", wantTgtMetricErrStartIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_END_IN", wantTgtMetricErrEndIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_STARTED_IN", wantTgtBlkoutStartedIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_ENDED_IN", wantTgtBlkoutEndedIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_NAMES_IN", "", ruleMetricNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_COLUMNS_IN", "", ruleMetricColumnsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_INDEXES_IN", "", ruleMetricIndexesIn, object.class));
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("EMAIL_ADDRESS_IN", "", emailAddressIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULE_REPEAT_ENABLED_IN", ruleRepeatEnabledIn);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void createNotificationRule(NString ruleNameIn,NString ruleOwnerIn,NString ruleDescIn,NNumber rulePublicIn,NString ruleTargetTypeIn,List<SmpEmdStringArrayRow> ruleTargetsIn,List<SmpEmdStringArrayRow> targetTypesIn,NNumber wantTgtUpIn,NNumber wantTgtDownIn,NNumber wantTgtUnreachableStartIn,NNumber wantTgtUnreachableEndIn,NNumber wantTgtMetricErrStartIn,NNumber wantTgtMetricErrEndIn,NNumber wantTgtBlkoutStartedIn,NNumber wantTgtBlkoutEndedIn,NNumber ignoreRcaIn,List<SmpEmdStringArrayRow> ruleMetricNamesIn,List<SmpEmdStringArrayRow> ruleMetricColumnsIn,List<SmpEmdNvpairArrayRow> ruleMetricIndexesIn,List<SmpEmdIntegerArrayRow> metricWantClearsIn,List<SmpEmdIntegerArrayRow> metricWantCriticalAlertsIn,List<SmpEmdIntegerArrayRow> metricWantWarningAlertsIn,List<SmpEmdIntegerArrayRow> wantWarningSucceedIn,List<SmpEmdIntegerArrayRow> wantWarningProblemIn,List<SmpEmdIntegerArrayRow> wantCriticalSucceedIn,List<SmpEmdIntegerArrayRow> wantCriticalProblemIn,List<SmpEmdStringArrayRow> policyNamesIn,List<SmpEmdIntegerArrayRow> wantPolicyViolationIn,List<SmpEmdIntegerArrayRow> wantPolicyClearIn,List<SmpEmdIntegerArrayRow> wantPolicyJobSucceedIn,List<SmpEmdIntegerArrayRow> wantPolicyJobProblemIn,List<SmpEmdStringArrayRow> jobNamesIn,List<SmpEmdStringArrayRow> jobOwnerIn,List<SmpEmdStringArrayRow> jobTypesIn,List<SmpEmdIntegerArrayRow> wantJobScheduledIn,List<SmpEmdIntegerArrayRow> wantJobStartedIn,List<SmpEmdIntegerArrayRow> wantJobSuspendedIn,List<SmpEmdIntegerArrayRow> wantJobSucceededIn,List<SmpEmdIntegerArrayRow> wantJobProblemIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut,NNumber ruleRepeatEnabledIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.CREATE_NOTIFICATION_RULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
//			cmd.addParameter("@RULE_DESC_IN", ruleDescIn);
//			cmd.addParameter("@RULE_PUBLIC_IN", rulePublicIn);
//			cmd.addParameter("@RULE_TARGET_TYPE_IN", ruleTargetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_TARGETS_IN", "", ruleTargetsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_TYPES_IN", "", targetTypesIn, object.class));
//			cmd.addParameter("@WANT_TGT_UP_IN", wantTgtUpIn);
//			cmd.addParameter("@WANT_TGT_DOWN_IN", wantTgtDownIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_START_IN", wantTgtUnreachableStartIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_END_IN", wantTgtUnreachableEndIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_START_IN", wantTgtMetricErrStartIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_END_IN", wantTgtMetricErrEndIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_STARTED_IN", wantTgtBlkoutStartedIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_ENDED_IN", wantTgtBlkoutEndedIn);
//			cmd.addParameter("@IGNORE_RCA_IN", ignoreRcaIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_NAMES_IN", "", ruleMetricNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_COLUMNS_IN", "", ruleMetricColumnsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_INDEXES_IN", "", ruleMetricIndexesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CLEARS_IN", "", metricWantClearsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CRITICAL_ALERTS_IN", "", metricWantCriticalAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_WARNING_ALERTS_IN", "", metricWantWarningAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_SUCCEED_IN", "", wantWarningSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_PROBLEM_IN", "", wantWarningProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_SUCCEED_IN", "", wantCriticalSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_PROBLEM_IN", "", wantCriticalProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("POLICY_NAMES_IN", "", policyNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_VIOLATION_IN", "", wantPolicyViolationIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_CLEAR_IN", "", wantPolicyClearIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_SUCCEED_IN", "", wantPolicyJobSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_PROBLEM_IN", "", wantPolicyJobProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_NAMES_IN", "", jobNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_OWNER_IN", "", jobOwnerIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_TYPES_IN", "", jobTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SCHEDULED_IN", "", wantJobScheduledIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_STARTED_IN", "", wantJobStartedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUSPENDED_IN", "", wantJobSuspendedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUCCEEDED_IN", "", wantJobSucceededIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_PROBLEM_IN", "", wantJobProblemIn, object.class));
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULE_REPEAT_ENABLED_IN", ruleRepeatEnabledIn);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void createNotificationSchedule(NString ownerIn,NString scheduleNameIn,NNumber scheduleWeeksIn,NDate scheduleStartDateIn,List<SmpEmdNvpairArrayRow> scheduleEmailsIn,Ref<List<SmpEmdStringArrayRow>> emailsNotAvailOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.CREATE_NOTIFICATION_SCHEDULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OWNER_IN", ownerIn);
//			cmd.addParameter("@SCHEDULE_NAME_IN", scheduleNameIn);
//			cmd.addParameter("@SCHEDULE_WEEKS_IN", scheduleWeeksIn);
//			cmd.addParameter("@SCHEDULE_START_DATE_IN", scheduleStartDateIn);
//			// cmd.addParameter(DbTypes.getCollectionType("SCHEDULE_EMAILS_IN", "", scheduleEmailsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("EMAILS_NOT_AVAIL_OUT", "", object.class));
//				
//			cmd.execute();
//			// emailsNotAvailOut.val = cmd.getTableParameterValue("@EMAILS_NOT_AVAIL_OUT", object.class);
//
//
//		}
		
//		public static void createNotificationSchedule(NString ownerIn,NString scheduleNameIn,NNumber scheduleWeeksIn,NDate scheduleStartDateIn,NString scheduleTimezoneIn,List<SmpEmdNvpairArrayRow> scheduleEmailsIn,Ref<List<SmpEmdStringArrayRow>> emailsNotAvailOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.CREATE_NOTIFICATION_SCHEDULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OWNER_IN", ownerIn);
//			cmd.addParameter("@SCHEDULE_NAME_IN", scheduleNameIn);
//			cmd.addParameter("@SCHEDULE_WEEKS_IN", scheduleWeeksIn);
//			cmd.addParameter("@SCHEDULE_START_DATE_IN", scheduleStartDateIn);
//			cmd.addParameter("@SCHEDULE_TIMEZONE_IN", scheduleTimezoneIn);
//			// cmd.addParameter(DbTypes.getCollectionType("SCHEDULE_EMAILS_IN", "", scheduleEmailsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("EMAILS_NOT_AVAIL_OUT", "", object.class));
//				
//			cmd.execute();
//			// emailsNotAvailOut.val = cmd.getTableParameterValue("@EMAILS_NOT_AVAIL_OUT", object.class);
//
//
//		}
		
		public static void deleteNotificationRule(NString ruleNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.DELETE_NOTIFICATION_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
				
			cmd.execute();


		}
		
		public static void deleteNotificationRulePriv(NString ruleNameIn,NString ruleOwnerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.DELETE_NOTIFICATION_RULE_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
				
			cmd.execute();


		}
		
		public static void deletePlsqlDeviceData(NString deviceNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.DELETE_PLSQL_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
				
			cmd.execute();


		}
		
		public static void deleteProgramDeviceData(NString deviceNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.DELETE_PROGRAM_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
				
			cmd.execute();


		}
		
		public static void deleteSnmpDeviceData(NString deviceNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.DELETE_SNMP_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
				
			cmd.execute();


		}
		
		public static void editPlsqlDevice(NString deviceNameIn,NString deviceDescIn,NString plsqlProcName,NNumber modeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.EDIT_PLSQL_DEVICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DESC_IN", deviceDescIn);
			cmd.addParameter("@PLSQL_PROC_NAME", plsqlProcName);
			cmd.addParameter("@MODE_IN", modeIn);
				
			cmd.execute();


		}
		
//		public static void editProgramDevice(NString deviceNameIn,NString deviceDescIn,NString osCommandNameIn,List<EmdsystemArgsRow> osCommandArgsIn,NNumber modeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.EDIT_PROGRAM_DEVICE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
//			cmd.addParameter("@DEVICE_DESC_IN", deviceDescIn);
//			cmd.addParameter("@OS_COMMAND_NAME_IN", osCommandNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("OS_COMMAND_ARGS_IN", "", osCommandArgsIn, object.class));
//			cmd.addParameter("@MODE_IN", modeIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void editSnmpDevice(NString deviceNameIn,NString deviceDescIn,NString snmpHostNameIn,NNumber snmpPortIn,NString snmpCommunityIn,NNumber modeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.EDIT_SNMP_DEVICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DESC_IN", deviceDescIn);
			cmd.addParameter("@SNMP_HOST_NAME_IN", snmpHostNameIn);
			cmd.addParameter("@SNMP_PORT_IN", snmpPortIn);
			cmd.addParameter("@SNMP_COMMUNITY_IN", snmpCommunityIn);
			cmd.addParameter("@MODE_IN", modeIn);
				
			cmd.execute();


		}
		
//		public static void getAllKeyValues(NString targetTypeIn,List<SmpEmdStringArrayRow> targetNamesIn,NString metricNameIn,NString metricColumnIn,List<SmpEmdStringArrayRow> searchNamesIn,NString searchTargetNameIn,Ref<DataCursor> keyValueCurrentOut,Ref<DataCursor> keyValue1dayOut,Ref<DataCursor> keyMetricColumnsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_ALL_KEY_VALUES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_NAMES_IN", "", targetNamesIn, object.class));
//			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
//			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
//			// cmd.addParameter(DbTypes.getCollectionType("SEARCH_NAMES_IN", "", searchNamesIn, object.class));
//			cmd.addParameter("@SEARCH_TARGET_NAME_IN", searchTargetNameIn);
//			cmd.addParameter("@KEY_VALUE_CURRENT_OUT", DataCursor.class);
//			cmd.addParameter("@KEY_VALUE_1DAY_OUT", DataCursor.class);
//			cmd.addParameter("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
//				
//			cmd.execute();
//			keyValueCurrentOut.val = cmd.getParameterValue("@KEY_VALUE_CURRENT_OUT", DataCursor.class);
//			keyValue1dayOut.val = cmd.getParameterValue("@KEY_VALUE_1DAY_OUT", DataCursor.class);
//			keyMetricColumnsOut.val = cmd.getParameterValue("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
//
//
//		}
		
		public static void getAssignDevToRulesData(NNumber modeIn,Ref<DataCursor> devicesDataOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_ASSIGN_DEV_TO_RULES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODE_IN", modeIn);
			cmd.addParameter("@DEVICES_DATA_OUT", DataCursor.class);
				
			cmd.execute();
			devicesDataOut.val = cmd.getParameterValue("@DEVICES_DATA_OUT", DataCursor.class);


		}
		
		public static void getAssignDevToRulesData(NString ruleOwnerIn,NNumber modeIn,Ref<DataCursor> devicesDataOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_ASSIGN_DEV_TO_RULES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
			cmd.addParameter("@MODE_IN", modeIn);
			cmd.addParameter("@DEVICES_DATA_OUT", DataCursor.class);
				
			cmd.execute();
			devicesDataOut.val = cmd.getParameterValue("@DEVICES_DATA_OUT", DataCursor.class);


		}
		
		public static void getJavaDeviceData(NString deviceNameIn,Ref<DataCursor> deviceDataOut,Ref<DataCursor> deviceParameterOut,Ref<DataCursor> deviceRulesListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_JAVA_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DATA_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_PARAMETER_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_RULES_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			deviceDataOut.val = cmd.getParameterValue("@DEVICE_DATA_OUT", DataCursor.class);
			deviceParameterOut.val = cmd.getParameterValue("@DEVICE_PARAMETER_OUT", DataCursor.class);
			deviceRulesListOut.val = cmd.getParameterValue("@DEVICE_RULES_LIST_OUT", DataCursor.class);


		}
		
//		public static void getMetricsForRule(NString targetTypeIn,List<SmpEmdStringArrayRow> targetNamesIn,Ref<DataCursor> thresholdMetricColumsOut,Ref<DataCursor> keyMetricColumnsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_METRICS_FOR_RULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_NAMES_IN", "", targetNamesIn, object.class));
//			cmd.addParameter("@THRESHOLD_METRIC_COLUMS_OUT", DataCursor.class);
//			cmd.addParameter("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
//				
//			cmd.execute();
//			thresholdMetricColumsOut.val = cmd.getParameterValue("@THRESHOLD_METRIC_COLUMS_OUT", DataCursor.class);
//			keyMetricColumnsOut.val = cmd.getParameterValue("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
//
//
//		}
		
		public static void getNotifDevicesData(Ref<DataCursor> mailGatewayListOut,Ref<DataCursor> notifDevicesListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIF_DEVICES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL_GATEWAY_LIST_OUT", DataCursor.class);
			cmd.addParameter("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			mailGatewayListOut.val = cmd.getParameterValue("@MAIL_GATEWAY_LIST_OUT", DataCursor.class);
			notifDevicesListOut.val = cmd.getParameterValue("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);


		}
		
		public static void getNotificationRuleDetails(NString ruleNameIn,NString userNameIn,Ref<DataCursor> rulesDetailListOut,Ref<DataCursor> rulesTargetListOut,Ref<DataCursor> rulesMetricListOut,Ref<DataCursor> rulesMetricIndexListOut,Ref<DataCursor> rulesPolicyListOut,Ref<DataCursor> rulesJobListOut,Ref<DataCursor> rulesEmailNotifListOut,Ref<DataCursor> rulesDeviceNotifListOut,Ref<DataCursor> userPrefEmailListOut,Ref<DataCursor> notifDevicesListOut,Ref<DataCursor> keyMetricColumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIFICATION_RULE_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_TARGET_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_POLICY_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_JOB_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			cmd.addParameter("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
				
			cmd.execute();
			rulesDetailListOut.val = cmd.getParameterValue("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			rulesTargetListOut.val = cmd.getParameterValue("@RULES_TARGET_LIST_OUT", DataCursor.class);
			rulesMetricListOut.val = cmd.getParameterValue("@RULES_METRIC_LIST_OUT", DataCursor.class);
			rulesMetricIndexListOut.val = cmd.getParameterValue("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			rulesPolicyListOut.val = cmd.getParameterValue("@RULES_POLICY_LIST_OUT", DataCursor.class);
			rulesJobListOut.val = cmd.getParameterValue("@RULES_JOB_LIST_OUT", DataCursor.class);
			rulesEmailNotifListOut.val = cmd.getParameterValue("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			rulesDeviceNotifListOut.val = cmd.getParameterValue("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			userPrefEmailListOut.val = cmd.getParameterValue("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			notifDevicesListOut.val = cmd.getParameterValue("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			keyMetricColumnsOut.val = cmd.getParameterValue("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);


		}
		
		public static void getNotificationRuleDetails(NString ruleNameIn,Ref<DataCursor> rulesDetailListOut,Ref<DataCursor> rulesTargetListOut,Ref<DataCursor> rulesMetricListOut,Ref<DataCursor> rulesMetricIndexListOut,Ref<DataCursor> rulesPolicyListOut,Ref<DataCursor> rulesJobListOut,Ref<DataCursor> rulesEmailNotifListOut,Ref<DataCursor> rulesDeviceNotifListOut,Ref<DataCursor> userPrefEmailListOut,Ref<DataCursor> notifDevicesListOut,Ref<DataCursor> keyMetricColumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIFICATION_RULE_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_TARGET_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_POLICY_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_JOB_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			cmd.addParameter("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
				
			cmd.execute();
			rulesDetailListOut.val = cmd.getParameterValue("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			rulesTargetListOut.val = cmd.getParameterValue("@RULES_TARGET_LIST_OUT", DataCursor.class);
			rulesMetricListOut.val = cmd.getParameterValue("@RULES_METRIC_LIST_OUT", DataCursor.class);
			rulesMetricIndexListOut.val = cmd.getParameterValue("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			rulesPolicyListOut.val = cmd.getParameterValue("@RULES_POLICY_LIST_OUT", DataCursor.class);
			rulesJobListOut.val = cmd.getParameterValue("@RULES_JOB_LIST_OUT", DataCursor.class);
			rulesEmailNotifListOut.val = cmd.getParameterValue("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			rulesDeviceNotifListOut.val = cmd.getParameterValue("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			userPrefEmailListOut.val = cmd.getParameterValue("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			notifDevicesListOut.val = cmd.getParameterValue("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			keyMetricColumnsOut.val = cmd.getParameterValue("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);


		}
		
		public static void getNotificationRuleDetails(NString ruleNameIn,NString userNameIn,NString languageIn,NString countryIn,Ref<DataCursor> rulesDetailListOut,Ref<DataCursor> rulesTargetListOut,Ref<DataCursor> rulesMetricListOut,Ref<DataCursor> rulesMetricIndexListOut,Ref<DataCursor> rulesPolicyListOut,Ref<DataCursor> rulesJobListOut,Ref<DataCursor> rulesEmailNotifListOut,Ref<DataCursor> rulesDeviceNotifListOut,Ref<DataCursor> userPrefEmailListOut,Ref<DataCursor> notifDevicesListOut,Ref<DataCursor> keyMetricColumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIFICATION_RULE_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@LANGUAGE_IN", languageIn);
			cmd.addParameter("@COUNTRY_IN", countryIn);
			cmd.addParameter("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_TARGET_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_POLICY_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_JOB_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			cmd.addParameter("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			cmd.addParameter("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			cmd.addParameter("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);
				
			cmd.execute();
			rulesDetailListOut.val = cmd.getParameterValue("@RULES_DETAIL_LIST_OUT", DataCursor.class);
			rulesTargetListOut.val = cmd.getParameterValue("@RULES_TARGET_LIST_OUT", DataCursor.class);
			rulesMetricListOut.val = cmd.getParameterValue("@RULES_METRIC_LIST_OUT", DataCursor.class);
			rulesMetricIndexListOut.val = cmd.getParameterValue("@RULES_METRIC_INDEX_LIST_OUT", DataCursor.class);
			rulesPolicyListOut.val = cmd.getParameterValue("@RULES_POLICY_LIST_OUT", DataCursor.class);
			rulesJobListOut.val = cmd.getParameterValue("@RULES_JOB_LIST_OUT", DataCursor.class);
			rulesEmailNotifListOut.val = cmd.getParameterValue("@RULES_EMAIL_NOTIF_LIST_OUT", DataCursor.class);
			rulesDeviceNotifListOut.val = cmd.getParameterValue("@RULES_DEVICE_NOTIF_LIST_OUT", DataCursor.class);
			userPrefEmailListOut.val = cmd.getParameterValue("@USER_PREF_EMAIL_LIST_OUT", DataCursor.class);
			notifDevicesListOut.val = cmd.getParameterValue("@NOTIF_DEVICES_LIST_OUT", DataCursor.class);
			keyMetricColumnsOut.val = cmd.getParameterValue("@KEY_METRIC_COLUMNS_OUT", DataCursor.class);


		}
		
		public static void getNotificationRules(NString userNameIn,NString rulesTypeIn,Ref<DataCursor> rulesOverviewListOut,Ref<DataCursor> rulesTargetTypeListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIFICATION_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@RULES_TYPE_IN", rulesTypeIn);
			cmd.addParameter("@RULES_OVERVIEW_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_TARGET_TYPE_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			rulesOverviewListOut.val = cmd.getParameterValue("@RULES_OVERVIEW_LIST_OUT", DataCursor.class);
			rulesTargetTypeListOut.val = cmd.getParameterValue("@RULES_TARGET_TYPE_LIST_OUT", DataCursor.class);


		}
		
		public static void getNotificationRules(NString rulesTypeIn,Ref<DataCursor> rulesOverviewListOut,Ref<DataCursor> rulesTargetTypeListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_NOTIFICATION_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULES_TYPE_IN", rulesTypeIn);
			cmd.addParameter("@RULES_OVERVIEW_LIST_OUT", DataCursor.class);
			cmd.addParameter("@RULES_TARGET_TYPE_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			rulesOverviewListOut.val = cmd.getParameterValue("@RULES_OVERVIEW_LIST_OUT", DataCursor.class);
			rulesTargetTypeListOut.val = cmd.getParameterValue("@RULES_TARGET_TYPE_LIST_OUT", DataCursor.class);


		}
		
		public static void getPlsqlDeviceData(NString deviceNameIn,Ref<DataCursor> deviceDataOut,Ref<DataCursor> deviceRulesListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_PLSQL_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DATA_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_RULES_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			deviceDataOut.val = cmd.getParameterValue("@DEVICE_DATA_OUT", DataCursor.class);
			deviceRulesListOut.val = cmd.getParameterValue("@DEVICE_RULES_LIST_OUT", DataCursor.class);


		}
		
		public static void getProgramDeviceData(NString deviceNameIn,Ref<DataCursor> deviceDataOut,Ref<DataCursor> deviceRulesListOut,Ref<DataCursor> deviceParametersOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_PROGRAM_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DATA_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_RULES_LIST_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_PARAMETERS_OUT", DataCursor.class);
				
			cmd.execute();
			deviceDataOut.val = cmd.getParameterValue("@DEVICE_DATA_OUT", DataCursor.class);
			deviceRulesListOut.val = cmd.getParameterValue("@DEVICE_RULES_LIST_OUT", DataCursor.class);
			deviceParametersOut.val = cmd.getParameterValue("@DEVICE_PARAMETERS_OUT", DataCursor.class);


		}
		
		public static void getRuleConfigDevicesData(NString ruleNameIn,Ref<DataCursor> ruleEmailOut,Ref<DataCursor> userPrefEmailOut,Ref<DataCursor> ruleDevicesOut,Ref<DataCursor> allDevicesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_RULE_CONFIG_DEVICES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@RULE_EMAIL_OUT", DataCursor.class);
			cmd.addParameter("@USER_PREF_EMAIL_OUT", DataCursor.class);
			cmd.addParameter("@RULE_DEVICES_OUT", DataCursor.class);
			cmd.addParameter("@ALL_DEVICES_OUT", DataCursor.class);
				
			cmd.execute();
			ruleEmailOut.val = cmd.getParameterValue("@RULE_EMAIL_OUT", DataCursor.class);
			userPrefEmailOut.val = cmd.getParameterValue("@USER_PREF_EMAIL_OUT", DataCursor.class);
			ruleDevicesOut.val = cmd.getParameterValue("@RULE_DEVICES_OUT", DataCursor.class);
			allDevicesOut.val = cmd.getParameterValue("@ALL_DEVICES_OUT", DataCursor.class);


		}
		
		public static void getRuleConfigDevicesData(NString ruleNameIn,NString ruleOwnerIn,Ref<DataCursor> ruleEmailOut,Ref<DataCursor> userPrefEmailOut,Ref<DataCursor> ruleDevicesOut,Ref<DataCursor> allDevicesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_RULE_CONFIG_DEVICES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
			cmd.addParameter("@RULE_EMAIL_OUT", DataCursor.class);
			cmd.addParameter("@USER_PREF_EMAIL_OUT", DataCursor.class);
			cmd.addParameter("@RULE_DEVICES_OUT", DataCursor.class);
			cmd.addParameter("@ALL_DEVICES_OUT", DataCursor.class);
				
			cmd.execute();
			ruleEmailOut.val = cmd.getParameterValue("@RULE_EMAIL_OUT", DataCursor.class);
			userPrefEmailOut.val = cmd.getParameterValue("@USER_PREF_EMAIL_OUT", DataCursor.class);
			ruleDevicesOut.val = cmd.getParameterValue("@RULE_DEVICES_OUT", DataCursor.class);
			allDevicesOut.val = cmd.getParameterValue("@ALL_DEVICES_OUT", DataCursor.class);


		}
		
		public static void getRuleDevicesData(Ref<DataCursor> userEmailOut,Ref<DataCursor> ruleDevicesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_RULE_DEVICES_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_EMAIL_OUT", DataCursor.class);
			cmd.addParameter("@RULE_DEVICES_OUT", DataCursor.class);
				
			cmd.execute();
			userEmailOut.val = cmd.getParameterValue("@USER_EMAIL_OUT", DataCursor.class);
			ruleDevicesOut.val = cmd.getParameterValue("@RULE_DEVICES_OUT", DataCursor.class);


		}
		
		public static void getRuleTargetTypes(Ref<DataCursor> availTargetTypeOut,Ref<DataCursor> metricTargetTypeOut,Ref<DataCursor> policyTargetTypeOut,Ref<DataCursor> jobTargetTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_RULE_TARGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AVAIL_TARGET_TYPE_OUT", DataCursor.class);
			cmd.addParameter("@METRIC_TARGET_TYPE_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_TARGET_TYPE_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TARGET_TYPE_OUT", DataCursor.class);
				
			cmd.execute();
			availTargetTypeOut.val = cmd.getParameterValue("@AVAIL_TARGET_TYPE_OUT", DataCursor.class);
			metricTargetTypeOut.val = cmd.getParameterValue("@METRIC_TARGET_TYPE_OUT", DataCursor.class);
			policyTargetTypeOut.val = cmd.getParameterValue("@POLICY_TARGET_TYPE_OUT", DataCursor.class);
			jobTargetTypeOut.val = cmd.getParameterValue("@JOB_TARGET_TYPE_OUT", DataCursor.class);


		}
		
		public static void getScheduleDefination(NString ownerIn,NString scheduleNameIn,Ref<DataCursor> scheduleInfoOut,Ref<DataCursor> scheduleEmailsOut,Ref<DataCursor> availEmailsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_SCHEDULE_DEFINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@SCHEDULE_NAME_IN", scheduleNameIn);
			cmd.addParameter("@SCHEDULE_INFO_OUT", DataCursor.class);
			cmd.addParameter("@SCHEDULE_EMAILS_OUT", DataCursor.class);
			cmd.addParameter("@AVAIL_EMAILS_OUT", DataCursor.class);
				
			cmd.execute();
			scheduleInfoOut.val = cmd.getParameterValue("@SCHEDULE_INFO_OUT", DataCursor.class);
			scheduleEmailsOut.val = cmd.getParameterValue("@SCHEDULE_EMAILS_OUT", DataCursor.class);
			availEmailsOut.val = cmd.getParameterValue("@AVAIL_EMAILS_OUT", DataCursor.class);


		}
		
		public static void getSnmpDeviceData(NString deviceNameIn,Ref<DataCursor> deviceDataOut,Ref<DataCursor> deviceRulesListOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_SNMP_DEVICE_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEVICE_NAME_IN", deviceNameIn);
			cmd.addParameter("@DEVICE_DATA_OUT", DataCursor.class);
			cmd.addParameter("@DEVICE_RULES_LIST_OUT", DataCursor.class);
				
			cmd.execute();
			deviceDataOut.val = cmd.getParameterValue("@DEVICE_DATA_OUT", DataCursor.class);
			deviceRulesListOut.val = cmd.getParameterValue("@DEVICE_RULES_LIST_OUT", DataCursor.class);


		}
		
		public static void getUserEmail(NString userNameIn,Ref<DataCursor> userEmailOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_USER_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_NAME_IN", userNameIn);
			cmd.addParameter("@USER_EMAIL_OUT", DataCursor.class);
				
			cmd.execute();
			userEmailOut.val = cmd.getParameterValue("@USER_EMAIL_OUT", DataCursor.class);


		}
		
		public static void getUserPrefEmail(Ref<DataCursor> userEmailOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.GET_USER_PREF_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_EMAIL_OUT", DataCursor.class);
				
			cmd.execute();
			userEmailOut.val = cmd.getParameterValue("@USER_EMAIL_OUT", DataCursor.class);


		}
		
//		public static void subscribeToRules(NString userNameIn,List<SmpEmdStringArrayRow> ruleNameListIn,List<SmpEmdStringArrayRow> ruleOwnerListIn,Ref<List<SmpEmdStringArrayRow>> ruleNotAvailListOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.SUBSCRIBE_TO_RULES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_NAME_LIST_IN", "", ruleNameListIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_OWNER_LIST_IN", "", ruleOwnerListIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_NOT_AVAIL_LIST_OUT", "", object.class));
//				
//			cmd.execute();
//			// ruleNotAvailListOut.val = cmd.getTableParameterValue("@RULE_NOT_AVAIL_LIST_OUT", object.class);
//
//
//		}
		
		public static NNumber FtestPlsqlDevice(NString plsqlIn,Ref<NString> errMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.TEST_PLSQL_DEVICE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PLSQL_IN", plsqlIn);
			cmd.addParameter("@ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			errMsgOut.val = cmd.getParameterValue("@ERR_MSG_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void tryUpdateUserPref(NString userNameIn,NString userPasswordIn,NNumber shouldUpdatePwdIn,List<SmpEmdStringArrayRow> userEmailIn,List<SmpEmdIntegerArrayRow> userEmailFormatIn,Ref<NNumber> mailGatewaySetupOut,Ref<NNumber> rulesSubscribedOut,Ref<NNumber> scheduleSetupOut,Ref<NNumber> operationDoneOut,Ref<DataCursor> emailUsedOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.TRY_UPDATE_USER_PREF", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@USER_PASSWORD_IN", userPasswordIn);
//			cmd.addParameter("@SHOULD_UPDATE_PWD_IN", shouldUpdatePwdIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_IN", "", userEmailIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_FORMAT_IN", "", userEmailFormatIn, object.class));
//			cmd.addParameter("@MAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULES_SUBSCRIBED_OUT", NNumber.class);
//			cmd.addParameter("@SCHEDULE_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@OPERATION_DONE_OUT", NNumber.class);
//			cmd.addParameter("@EMAIL_USED_OUT", DataCursor.class);
//				
//			cmd.execute();
//			mailGatewaySetupOut.val = cmd.getParameterValue("@MAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			rulesSubscribedOut.val = cmd.getParameterValue("@RULES_SUBSCRIBED_OUT", NNumber.class);
//			scheduleSetupOut.val = cmd.getParameterValue("@SCHEDULE_SETUP_OUT", NNumber.class);
//			operationDoneOut.val = cmd.getParameterValue("@OPERATION_DONE_OUT", NNumber.class);
//			emailUsedOut.val = cmd.getParameterValue("@EMAIL_USED_OUT", DataCursor.class);
//
//
//		}
		
//		public static void updateAssignData(List<SmpEmdStringArrayRow> ruleNameIn,List<SmpEmdStringArrayRow> ruleOwnerIn,List<SmpEmdStringArrayRow> deviceNameIn,List<SmpEmdIntegerArrayRow> deviceTypeIn,List<SmpEmdIntegerArrayRow> notifyIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<List<SmpEmdStringArrayRow>> ruleNotAvailListOut,Ref<List<SmpEmdStringArrayRow>> userNotAvailListOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_ASSIGN_DATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_NAME_IN", "", ruleNameIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_OWNER_IN", "", ruleOwnerIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAME_IN", "", deviceNameIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPE_IN", "", deviceTypeIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("NOTIFY_IN", "", notifyIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_NOT_AVAIL_LIST_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USER_NOT_AVAIL_LIST_OUT", "", object.class));
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			// ruleNotAvailListOut.val = cmd.getTableParameterValue("@RULE_NOT_AVAIL_LIST_OUT", object.class);
//			// userNotAvailListOut.val = cmd.getTableParameterValue("@USER_NOT_AVAIL_LIST_OUT", object.class);
//
//
//		}
		
//		public static void updateMailGatewayData(List<SmpEmdStringArrayRow> mailGatewayServerArray,NString mailUsernameIn,NString mailPasswordIn,NString mailAddressIn,NString mailNameIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_MAIL_GATEWAY_DATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("MAIL_GATEWAY_SERVER_ARRAY", "", mailGatewayServerArray, object.class));
//			cmd.addParameter("@MAIL_USERNAME_IN", mailUsernameIn);
//			cmd.addParameter("@MAIL_PASSWORD_IN", mailPasswordIn);
//			cmd.addParameter("@MAIL_ADDRESS_IN", mailAddressIn);
//			cmd.addParameter("@MAIL_NAME_IN", mailNameIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateNotificationRule(NString ruleNameIn,NString ruleOwnerIn,NString ruleDescIn,NNumber rulePublicIn,NString ruleTargetTypeIn,List<SmpEmdStringArrayRow> ruleTargetsIn,List<SmpEmdStringArrayRow> targetTypesIn,NNumber wantTgtUpIn,NNumber wantTgtDownIn,NNumber wantTgtUnreachableStartIn,NNumber wantTgtUnreachableEndIn,NNumber wantTgtMetricErrStartIn,NNumber wantTgtMetricErrEndIn,NNumber wantTgtBlkoutStartedIn,NNumber wantTgtBlkoutEndedIn,NNumber ignoreRcaIn,List<SmpEmdStringArrayRow> ruleMetricNamesIn,List<SmpEmdStringArrayRow> ruleMetricColumnsIn,List<SmpEmdNvpairArrayRow> ruleMetricIndexesIn,List<SmpEmdIntegerArrayRow> metricWantClearsIn,List<SmpEmdIntegerArrayRow> metricWantCriticalAlertsIn,List<SmpEmdIntegerArrayRow> metricWantWarningAlertsIn,List<SmpEmdIntegerArrayRow> wantWarningSucceedIn,List<SmpEmdIntegerArrayRow> wantWarningProblemIn,List<SmpEmdIntegerArrayRow> wantCriticalSucceedIn,List<SmpEmdIntegerArrayRow> wantCriticalProblemIn,List<SmpEmdStringArrayRow> policyNamesIn,List<SmpEmdIntegerArrayRow> wantPolicyViolationIn,List<SmpEmdIntegerArrayRow> wantPolicyClearIn,List<SmpEmdIntegerArrayRow> wantPolicyJobSucceedIn,List<SmpEmdIntegerArrayRow> wantPolicyJobProblemIn,List<SmpEmdStringArrayRow> jobNamesIn,List<SmpEmdStringArrayRow> jobOwnerIn,List<SmpEmdStringArrayRow> jobTypesIn,List<SmpEmdIntegerArrayRow> wantJobScheduledIn,List<SmpEmdIntegerArrayRow> wantJobStartedIn,List<SmpEmdIntegerArrayRow> wantJobSuspendedIn,List<SmpEmdIntegerArrayRow> wantJobSucceededIn,List<SmpEmdIntegerArrayRow> wantJobProblemIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut,NNumber ruleRepeatEnabledIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_NOTIFICATION_RULE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
//			cmd.addParameter("@RULE_DESC_IN", ruleDescIn);
//			cmd.addParameter("@RULE_PUBLIC_IN", rulePublicIn);
//			cmd.addParameter("@RULE_TARGET_TYPE_IN", ruleTargetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_TARGETS_IN", "", ruleTargetsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_TYPES_IN", "", targetTypesIn, object.class));
//			cmd.addParameter("@WANT_TGT_UP_IN", wantTgtUpIn);
//			cmd.addParameter("@WANT_TGT_DOWN_IN", wantTgtDownIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_START_IN", wantTgtUnreachableStartIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_END_IN", wantTgtUnreachableEndIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_START_IN", wantTgtMetricErrStartIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_END_IN", wantTgtMetricErrEndIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_STARTED_IN", wantTgtBlkoutStartedIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_ENDED_IN", wantTgtBlkoutEndedIn);
//			cmd.addParameter("@IGNORE_RCA_IN", ignoreRcaIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_NAMES_IN", "", ruleMetricNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_COLUMNS_IN", "", ruleMetricColumnsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_INDEXES_IN", "", ruleMetricIndexesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CLEARS_IN", "", metricWantClearsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CRITICAL_ALERTS_IN", "", metricWantCriticalAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_WARNING_ALERTS_IN", "", metricWantWarningAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_SUCCEED_IN", "", wantWarningSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_PROBLEM_IN", "", wantWarningProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_SUCCEED_IN", "", wantCriticalSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_PROBLEM_IN", "", wantCriticalProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("POLICY_NAMES_IN", "", policyNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_VIOLATION_IN", "", wantPolicyViolationIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_CLEAR_IN", "", wantPolicyClearIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_SUCCEED_IN", "", wantPolicyJobSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_PROBLEM_IN", "", wantPolicyJobProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_NAMES_IN", "", jobNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_OWNER_IN", "", jobOwnerIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_TYPES_IN", "", jobTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SCHEDULED_IN", "", wantJobScheduledIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_STARTED_IN", "", wantJobStartedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUSPENDED_IN", "", wantJobSuspendedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUCCEEDED_IN", "", wantJobSucceededIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_PROBLEM_IN", "", wantJobProblemIn, object.class));
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULE_REPEAT_ENABLED_IN", ruleRepeatEnabledIn);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void updateNotificationRulePriv(NString ruleNameIn,NString ruleOwnerIn,NString ruleDescIn,NNumber rulePublicIn,NString ruleTargetTypeIn,List<SmpEmdStringArrayRow> ruleTargetsIn,List<SmpEmdStringArrayRow> targetTypesIn,NNumber wantTgtUpIn,NNumber wantTgtDownIn,NNumber wantTgtUnreachableStartIn,NNumber wantTgtUnreachableEndIn,NNumber wantTgtMetricErrStartIn,NNumber wantTgtMetricErrEndIn,NNumber wantTgtBlkoutStartedIn,NNumber wantTgtBlkoutEndedIn,NNumber ignoreRcaIn,List<SmpEmdStringArrayRow> ruleMetricNamesIn,List<SmpEmdStringArrayRow> ruleMetricColumnsIn,List<SmpEmdNvpairArrayRow> ruleMetricIndexesIn,List<SmpEmdIntegerArrayRow> metricWantClearsIn,List<SmpEmdIntegerArrayRow> metricWantCriticalAlertsIn,List<SmpEmdIntegerArrayRow> metricWantWarningAlertsIn,List<SmpEmdIntegerArrayRow> wantWarningSucceedIn,List<SmpEmdIntegerArrayRow> wantWarningProblemIn,List<SmpEmdIntegerArrayRow> wantCriticalSucceedIn,List<SmpEmdIntegerArrayRow> wantCriticalProblemIn,List<SmpEmdStringArrayRow> policyNamesIn,List<SmpEmdIntegerArrayRow> wantPolicyViolationIn,List<SmpEmdIntegerArrayRow> wantPolicyClearIn,List<SmpEmdIntegerArrayRow> wantPolicyJobSucceedIn,List<SmpEmdIntegerArrayRow> wantPolicyJobProblemIn,List<SmpEmdStringArrayRow> jobNamesIn,List<SmpEmdStringArrayRow> jobOwnerIn,List<SmpEmdStringArrayRow> jobTypesIn,List<SmpEmdIntegerArrayRow> wantJobScheduledIn,List<SmpEmdIntegerArrayRow> wantJobStartedIn,List<SmpEmdIntegerArrayRow> wantJobSuspendedIn,List<SmpEmdIntegerArrayRow> wantJobSucceededIn,List<SmpEmdIntegerArrayRow> wantJobProblemIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut,NNumber ruleRepeatEnabledIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_NOTIFICATION_RULE_PRIV", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
//			cmd.addParameter("@RULE_DESC_IN", ruleDescIn);
//			cmd.addParameter("@RULE_PUBLIC_IN", rulePublicIn);
//			cmd.addParameter("@RULE_TARGET_TYPE_IN", ruleTargetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_TARGETS_IN", "", ruleTargetsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_TYPES_IN", "", targetTypesIn, object.class));
//			cmd.addParameter("@WANT_TGT_UP_IN", wantTgtUpIn);
//			cmd.addParameter("@WANT_TGT_DOWN_IN", wantTgtDownIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_START_IN", wantTgtUnreachableStartIn);
//			cmd.addParameter("@WANT_TGT_UNREACHABLE_END_IN", wantTgtUnreachableEndIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_START_IN", wantTgtMetricErrStartIn);
//			cmd.addParameter("@WANT_TGT_METRIC_ERR_END_IN", wantTgtMetricErrEndIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_STARTED_IN", wantTgtBlkoutStartedIn);
//			cmd.addParameter("@WANT_TGT_BLKOUT_ENDED_IN", wantTgtBlkoutEndedIn);
//			cmd.addParameter("@IGNORE_RCA_IN", ignoreRcaIn);
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_NAMES_IN", "", ruleMetricNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_COLUMNS_IN", "", ruleMetricColumnsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_METRIC_INDEXES_IN", "", ruleMetricIndexesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CLEARS_IN", "", metricWantClearsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_CRITICAL_ALERTS_IN", "", metricWantCriticalAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_WANT_WARNING_ALERTS_IN", "", metricWantWarningAlertsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_SUCCEED_IN", "", wantWarningSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_WARNING_PROBLEM_IN", "", wantWarningProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_SUCCEED_IN", "", wantCriticalSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_CRITICAL_PROBLEM_IN", "", wantCriticalProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("POLICY_NAMES_IN", "", policyNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_VIOLATION_IN", "", wantPolicyViolationIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_CLEAR_IN", "", wantPolicyClearIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_SUCCEED_IN", "", wantPolicyJobSucceedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_POLICY_JOB_PROBLEM_IN", "", wantPolicyJobProblemIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_NAMES_IN", "", jobNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_OWNER_IN", "", jobOwnerIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("JOB_TYPES_IN", "", jobTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SCHEDULED_IN", "", wantJobScheduledIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_STARTED_IN", "", wantJobStartedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUSPENDED_IN", "", wantJobSuspendedIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_SUCCEEDED_IN", "", wantJobSucceededIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("WANT_JOB_PROBLEM_IN", "", wantJobProblemIn, object.class));
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULE_REPEAT_ENABLED_IN", ruleRepeatEnabledIn);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void updateRuleDevicesData(NString ruleNameIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_RULE_DEVICES_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void updateRuleDevicesData(NString ruleNameIn,NString ruleOwnerIn,NNumber sendEmailIn,List<SmpEmdStringArrayRow> deviceNamesIn,List<SmpEmdIntegerArrayRow> deviceTypesIn,Ref<List<SmpEmdStringArrayRow>> deviceNotAvailListOut,Ref<NNumber> emailGatewaySetupOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_RULE_DEVICES_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@RULE_NAME_IN", ruleNameIn);
//			cmd.addParameter("@RULE_OWNER_IN", ruleOwnerIn);
//			cmd.addParameter("@SEND_EMAIL_IN", sendEmailIn);
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NAMES_IN", "", deviceNamesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_TYPES_IN", "", deviceTypesIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DEVICE_NOT_AVAIL_LIST_OUT", "", object.class));
//			cmd.addParameter("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//				
//			cmd.execute();
//			// deviceNotAvailListOut.val = cmd.getTableParameterValue("@DEVICE_NOT_AVAIL_LIST_OUT", object.class);
//			emailGatewaySetupOut.val = cmd.getParameterValue("@EMAIL_GATEWAY_SETUP_OUT", NNumber.class);
//
//
//		}
		
//		public static void updateRuleOverviewData(List<SmpEmdStringArrayRow> ruleNameIn,List<SmpEmdStringArrayRow> ruleOwnerIn,List<SmpEmdIntegerArrayRow> rulePublicIn,List<SmpEmdIntegerArrayRow> sendEmailIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_RULE_OVERVIEW_DATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_NAME_IN", "", ruleNameIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_OWNER_IN", "", ruleOwnerIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RULE_PUBLIC_IN", "", rulePublicIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("SEND_EMAIL_IN", "", sendEmailIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateUserPrefData(NString userNameIn,NString userPasswordIn,NNumber shouldUpdatePwdIn,List<SmpEmdStringArrayRow> userEmailIn,List<SmpEmdIntegerArrayRow> userEmailFormatIn,Ref<NNumber> mailGatewaySetupOut,Ref<NNumber> rulesSubscribedOut,Ref<NNumber> scheduleSetupOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_PREFERENCES.UPDATE_USER_PREF_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USER_NAME_IN", userNameIn);
//			cmd.addParameter("@USER_PASSWORD_IN", userPasswordIn);
//			cmd.addParameter("@SHOULD_UPDATE_PWD_IN", shouldUpdatePwdIn);
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_IN", "", userEmailIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("USER_EMAIL_FORMAT_IN", "", userEmailFormatIn, object.class));
//			cmd.addParameter("@MAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			cmd.addParameter("@RULES_SUBSCRIBED_OUT", NNumber.class);
//			cmd.addParameter("@SCHEDULE_SETUP_OUT", NNumber.class);
//				
//			cmd.execute();
//			mailGatewaySetupOut.val = cmd.getParameterValue("@MAIL_GATEWAY_SETUP_OUT", NNumber.class);
//			rulesSubscribedOut.val = cmd.getParameterValue("@RULES_SUBSCRIBED_OUT", NNumber.class);
//			scheduleSetupOut.val = cmd.getParameterValue("@SCHEDULE_SETUP_OUT", NNumber.class);
//
//
//		}
		
	
	
	
}
