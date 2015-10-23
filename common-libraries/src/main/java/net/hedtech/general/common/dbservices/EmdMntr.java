package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class EmdMntr {
		public static void addMetricAnnotation(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,NString annotationIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.ADD_METRIC_ANNOTATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@ANNOTATION_IN", annotationIn);
				
			cmd.execute();


		}
		
		public static NNumber FcheckForWarnCritTip(NString lTargetNameIn,NString lTargetTypeIn,NString lMetricNameIn,NString lMetricColumnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.CHECK_FOR_WARN_CRIT_TIP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@L_TARGET_NAME_IN", lTargetNameIn);
			cmd.addParameter("@L_TARGET_TYPE_IN", lTargetTypeIn);
			cmd.addParameter("@L_METRIC_NAME_IN", lMetricNameIn);
			cmd.addParameter("@L_METRIC_COLUMN_IN", lMetricColumnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcheckMetricParent(NString lTargetNameIn,NString lTargetTypeIn,NString lMetricNameIn,NString lMetricColumnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.CHECK_METRIC_PARENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@L_TARGET_NAME_IN", lTargetNameIn);
			cmd.addParameter("@L_TARGET_TYPE_IN", lTargetTypeIn);
			cmd.addParameter("@L_METRIC_NAME_IN", lMetricNameIn);
			cmd.addParameter("@L_METRIC_COLUMN_IN", lMetricColumnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void clearMetricSeverity(List<MgmtUserGuidArrayRow> sevGuidsIn,NString annotationIn,NString messageIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.CLEAR_METRIC_SEVERITY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("SEV_GUIDS_IN", "", sevGuidsIn, object.class));
//			cmd.addParameter("@ANNOTATION_IN", annotationIn);
//			cmd.addParameter("@MESSAGE_IN", messageIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void clearMetricSeverity(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,NString annotationIn,NString messageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.CLEAR_METRIC_SEVERITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@ANNOTATION_IN", annotationIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
				
			cmd.execute();


		}
		
		public static void createUdm(NString targetName,NString targetType,NString udmName,NString udmType,NString warn,NString crit,NString scheduleEx,NString agentFixit,NNumber numOccurrences,NString id,NString command,NString valuetype,NNumber _operator,NString message,NNumber alreadyExists,NNumber isMulti,NString thresholdString,NNumber collectionEnabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.CREATE_UDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME", targetName);
			cmd.addParameter("@TARGET_TYPE", targetType);
			cmd.addParameter("@UDM_NAME", udmName);
			cmd.addParameter("@UDM_TYPE", udmType);
			cmd.addParameter("@WARN", warn);
			cmd.addParameter("@CRIT", crit);
			cmd.addParameter("@SCHEDULE_EX", scheduleEx);
			cmd.addParameter("@AGENT_FIXIT", agentFixit);
			cmd.addParameter("@NUM_OCCURRENCES", numOccurrences);
			cmd.addParameter("@ID", id);
			cmd.addParameter("@COMMAND", command);
			cmd.addParameter("@VALUETYPE", valuetype);
			cmd.addParameter("@OPERATOR", _operator);
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@ALREADY_EXISTS", alreadyExists);
			cmd.addParameter("@IS_MULTI", isMulti);
			cmd.addParameter("@THRESHOLD_STRING", thresholdString);
			cmd.addParameter("@COLLECTION_ENABLED", collectionEnabled);
				
			cmd.execute();


		}
		
//		public static void deleteTargets(List<MgmtUserGuidArrayRow> targetGuidsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.DELETE_TARGETS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_GUIDS_IN", "", targetGuidsIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void deleteUdm(NString pTargetName,NString pTargetType,NString pUdmName,NString pUdmType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.DELETE_UDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_NAME", pTargetName);
			cmd.addParameter("@P_TARGET_TYPE", pTargetType);
			cmd.addParameter("@P_UDM_NAME", pUdmName);
			cmd.addParameter("@P_UDM_TYPE", pUdmType);
				
			cmd.execute();


		}
		
		public static void deleteUdm(byte[] pTargetGuid,byte[] pMetricGuid,NNumber pObjectType,NString pCollName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.DELETE_UDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_GUID", pTargetGuid);
			cmd.addParameter("@P_METRIC_GUID", pMetricGuid);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
			cmd.addParameter("@P_COLL_NAME", pCollName);
				
			cmd.execute();


		}
		
//		public static void getAddtnlFolderDetails(NString targetTypeIn,List<SmpEmdStringArrayRow> folderTgtTypeListIn,Ref<DataCursor> unconfigTargetsCurOut,Ref<DataCursor> brokenCaCurOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_ADDTNL_FOLDER_DETAILS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("FOLDER_TGT_TYPE_LIST_IN", "", folderTgtTypeListIn, object.class));
//			cmd.addParameter("@UNCONFIG_TARGETS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@BROKEN_CA_CUR_OUT", DataCursor.class);
//				
//			cmd.execute();
//			unconfigTargetsCurOut.val = cmd.getParameterValue("@UNCONFIG_TARGETS_CUR_OUT", DataCursor.class);
//			brokenCaCurOut.val = cmd.getParameterValue("@BROKEN_CA_CUR_OUT", DataCursor.class);
//
//
//		}
		
		public static void getAlertDetails(byte[] severityGuidIn,Ref<NString> keyValueOut,Ref<DataCursor> metricInfoOut,Ref<DataCursor> compositeKeyInfoOut,Ref<DataCursor> alertDetailsOut,Ref<byte[]> executionIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_ALERT_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEVERITY_GUID_IN", severityGuidIn);
			cmd.addParameter("@KEY_VALUE_OUT", NString.class);
			cmd.addParameter("@METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			cmd.addParameter("@ALERT_DETAILS_OUT", DataCursor.class);
			cmd.addParameter("@EXECUTION_ID_OUT", byte[].class);
				
			cmd.execute();
			keyValueOut.val = cmd.getParameterValue("@KEY_VALUE_OUT", NString.class);
			metricInfoOut.val = cmd.getParameterValue("@METRIC_INFO_OUT", DataCursor.class);
			compositeKeyInfoOut.val = cmd.getParameterValue("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			alertDetailsOut.val = cmd.getParameterValue("@ALERT_DETAILS_OUT", DataCursor.class);
			executionIdOut.val = cmd.getParameterValue("@EXECUTION_ID_OUT", byte[].class);


		}
		
		public static void getBcnTestCurSummary(NString targetTypeIn,Ref<DataCursor> testSummary,Ref<DataCursor> bcnSummary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_BCN_TEST_CUR_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TEST_SUMMARY", DataCursor.class);
			cmd.addParameter("@BCN_SUMMARY", DataCursor.class);
				
			cmd.execute();
			testSummary.val = cmd.getParameterValue("@TEST_SUMMARY", DataCursor.class);
			bcnSummary.val = cmd.getParameterValue("@BCN_SUMMARY", DataCursor.class);


		}
		
		public static void getCmanagerSitemapInfo(NString targetNameIn,NString targetTypeIn,Ref<NString> typeDisplayNameOut,Ref<NString> lastLoadTimeOut,Ref<NNumber> currentStatusOut,Ref<NNumber> availPctOut,Ref<NNumber> severityCodeOut,Ref<NNumber> numSeverityOut,Ref<NNumber> requestSuccessfulOut,Ref<NNumber> requestWarningOut,Ref<NNumber> requestErrorOut,Ref<NNumber> currentFormsOut,Ref<NNumber> standbyRequestOut,Ref<NNumber> pendingRequestOut,Ref<NNumber> runningRequestOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_CMANAGER_SITEMAP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TYPE_DISPLAY_NAME_OUT", NString.class);
			cmd.addParameter("@LAST_LOAD_TIME_OUT", NString.class);
			cmd.addParameter("@CURRENT_STATUS_OUT", NNumber.class);
			cmd.addParameter("@AVAIL_PCT_OUT", NNumber.class);
			cmd.addParameter("@SEVERITY_CODE_OUT", NNumber.class);
			cmd.addParameter("@NUM_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@REQUEST_SUCCESSFUL_OUT", NNumber.class);
			cmd.addParameter("@REQUEST_WARNING_OUT", NNumber.class);
			cmd.addParameter("@REQUEST_ERROR_OUT", NNumber.class);
			cmd.addParameter("@CURRENT_FORMS_OUT", NNumber.class);
			cmd.addParameter("@STANDBY_REQUEST_OUT", NNumber.class);
			cmd.addParameter("@PENDING_REQUEST_OUT", NNumber.class);
			cmd.addParameter("@RUNNING_REQUEST_OUT", NNumber.class);
				
			cmd.execute();
			typeDisplayNameOut.val = cmd.getParameterValue("@TYPE_DISPLAY_NAME_OUT", NString.class);
			lastLoadTimeOut.val = cmd.getParameterValue("@LAST_LOAD_TIME_OUT", NString.class);
			currentStatusOut.val = cmd.getParameterValue("@CURRENT_STATUS_OUT", NNumber.class);
			availPctOut.val = cmd.getParameterValue("@AVAIL_PCT_OUT", NNumber.class);
			severityCodeOut.val = cmd.getParameterValue("@SEVERITY_CODE_OUT", NNumber.class);
			numSeverityOut.val = cmd.getParameterValue("@NUM_SEVERITY_OUT", NNumber.class);
			requestSuccessfulOut.val = cmd.getParameterValue("@REQUEST_SUCCESSFUL_OUT", NNumber.class);
			requestWarningOut.val = cmd.getParameterValue("@REQUEST_WARNING_OUT", NNumber.class);
			requestErrorOut.val = cmd.getParameterValue("@REQUEST_ERROR_OUT", NNumber.class);
			currentFormsOut.val = cmd.getParameterValue("@CURRENT_FORMS_OUT", NNumber.class);
			standbyRequestOut.val = cmd.getParameterValue("@STANDBY_REQUEST_OUT", NNumber.class);
			pendingRequestOut.val = cmd.getParameterValue("@PENDING_REQUEST_OUT", NNumber.class);
			runningRequestOut.val = cmd.getParameterValue("@RUNNING_REQUEST_OUT", NNumber.class);


		}
		
		public static void getCompTgtChildrenData(NString targetNameIn,NString targetTypeIn,NNumber timeperiodIn,Ref<DataCursor> trafficSummaryOut,Ref<DataCursor> summaryOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_COMP_TGT_CHILDREN_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TIMEPERIOD_IN", timeperiodIn);
			cmd.addParameter("@TRAFFIC_SUMMARY_OUT", DataCursor.class);
			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
				
			cmd.execute();
			trafficSummaryOut.val = cmd.getParameterValue("@TRAFFIC_SUMMARY_OUT", DataCursor.class);
			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);


		}
		
		public static void getConsoleHomepageInfo(NString targetTypeIn,Ref<NNumber> numTargetsOut,Ref<DataCursor> targetTypesCurOut,Ref<DataCursor> availCurOut,Ref<DataCursor> severityCurOut,Ref<DataCursor> metricErrorCurOut,Ref<DataCursor> policyViolationCurOut,Ref<DataCursor> numTargetsCurOut,Ref<DataCursor> mtBrokenCaCurOut,Ref<DataCursor> policyBrokenCaCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_CONSOLE_HOMEPAGE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@NUM_TARGETS_OUT", NNumber.class);
			cmd.addParameter("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@AVAIL_CUR_OUT", DataCursor.class);
			cmd.addParameter("@SEVERITY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@METRIC_ERROR_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_VIOLATION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@NUM_TARGETS_CUR_OUT", DataCursor.class);
			cmd.addParameter("@MT_BROKEN_CA_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_BROKEN_CA_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			numTargetsOut.val = cmd.getParameterValue("@NUM_TARGETS_OUT", NNumber.class);
			targetTypesCurOut.val = cmd.getParameterValue("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			availCurOut.val = cmd.getParameterValue("@AVAIL_CUR_OUT", DataCursor.class);
			severityCurOut.val = cmd.getParameterValue("@SEVERITY_CUR_OUT", DataCursor.class);
			metricErrorCurOut.val = cmd.getParameterValue("@METRIC_ERROR_CUR_OUT", DataCursor.class);
			policyViolationCurOut.val = cmd.getParameterValue("@POLICY_VIOLATION_CUR_OUT", DataCursor.class);
			numTargetsCurOut.val = cmd.getParameterValue("@NUM_TARGETS_CUR_OUT", DataCursor.class);
			mtBrokenCaCurOut.val = cmd.getParameterValue("@MT_BROKEN_CA_CUR_OUT", DataCursor.class);
			policyBrokenCaCurOut.val = cmd.getParameterValue("@POLICY_BROKEN_CA_CUR_OUT", DataCursor.class);


		}
		
		public static void getConsoleHomepageInfoSimp(NString targetTypeIn,Ref<NNumber> numTargetsOut,Ref<DataCursor> targetTypesCurOut,Ref<DataCursor> availCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_CONSOLE_HOMEPAGE_INFO_SIMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@NUM_TARGETS_OUT", NNumber.class);
			cmd.addParameter("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@AVAIL_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			numTargetsOut.val = cmd.getParameterValue("@NUM_TARGETS_OUT", NNumber.class);
			targetTypesCurOut.val = cmd.getParameterValue("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			availCurOut.val = cmd.getParameterValue("@AVAIL_CUR_OUT", DataCursor.class);


		}
		
		public static void getCurrentMetricDetails(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,Ref<NString> metricWarningThresholdOut,Ref<NString> metricCriticalThresholdOut,Ref<NString> numOccurencesOut,Ref<NNumber> hasPrivOut,Ref<DataCursor> metricInfoOut,Ref<DataCursor> compositeKeyInfoOut,Ref<DataCursor> numberMetricInfoOut,Ref<DataCursor> stringMetricInfoOut,Ref<DataCursor> metricSevOut,Ref<DataCursor> currentMetricSevOut,Ref<NNumber> caSeverityOut,Ref<DataCursor> targetInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_CURRENT_METRIC_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@METRIC_WARNING_THRESHOLD_OUT", NString.class);
			cmd.addParameter("@METRIC_CRITICAL_THRESHOLD_OUT", NString.class);
			cmd.addParameter("@NUM_OCCURENCES_OUT", NString.class);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			cmd.addParameter("@NUMBER_METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@STRING_METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@METRIC_SEV_OUT", DataCursor.class);
			cmd.addParameter("@CURRENT_METRIC_SEV_OUT", DataCursor.class);
			cmd.addParameter("@CA_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@TARGET_INFO_OUT", DataCursor.class);
				
			cmd.execute();
			metricWarningThresholdOut.val = cmd.getParameterValue("@METRIC_WARNING_THRESHOLD_OUT", NString.class);
			metricCriticalThresholdOut.val = cmd.getParameterValue("@METRIC_CRITICAL_THRESHOLD_OUT", NString.class);
			numOccurencesOut.val = cmd.getParameterValue("@NUM_OCCURENCES_OUT", NString.class);
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			metricInfoOut.val = cmd.getParameterValue("@METRIC_INFO_OUT", DataCursor.class);
			compositeKeyInfoOut.val = cmd.getParameterValue("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			numberMetricInfoOut.val = cmd.getParameterValue("@NUMBER_METRIC_INFO_OUT", DataCursor.class);
			stringMetricInfoOut.val = cmd.getParameterValue("@STRING_METRIC_INFO_OUT", DataCursor.class);
			metricSevOut.val = cmd.getParameterValue("@METRIC_SEV_OUT", DataCursor.class);
			currentMetricSevOut.val = cmd.getParameterValue("@CURRENT_METRIC_SEV_OUT", DataCursor.class);
			caSeverityOut.val = cmd.getParameterValue("@CA_SEVERITY_OUT", NNumber.class);
			targetInfoOut.val = cmd.getParameterValue("@TARGET_INFO_OUT", DataCursor.class);


		}
		
		public static void getEbsSitemapInfo(NString targetNameIn,NString targetTypeIn,Ref<NString> typeDisplayNameOut,Ref<NString> lastLoadTimeOut,Ref<NNumber> currentStatusOut,Ref<NNumber> availPctOut,Ref<NNumber> severityCodeOut,Ref<NNumber> numSeverityOut,Ref<NNumber> currentFormsOut,Ref<NNumber> standbyRequestOut,Ref<NNumber> pendingRequestOut,Ref<NNumber> runningRequestOut,Ref<NString> versionOut,Ref<NNumber> productsOut,Ref<NNumber> invalidObjectsOut,Ref<NNumber> patchesOut,Ref<NString> hasChronosDataOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_EBS_SITEMAP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TYPE_DISPLAY_NAME_OUT", NString.class);
			cmd.addParameter("@LAST_LOAD_TIME_OUT", NString.class);
			cmd.addParameter("@CURRENT_STATUS_OUT", NNumber.class);
			cmd.addParameter("@AVAIL_PCT_OUT", NNumber.class);
			cmd.addParameter("@SEVERITY_CODE_OUT", NNumber.class);
			cmd.addParameter("@NUM_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@CURRENT_FORMS_OUT", NNumber.class);
			cmd.addParameter("@STANDBY_REQUEST_OUT", NNumber.class);
			cmd.addParameter("@PENDING_REQUEST_OUT", NNumber.class);
			cmd.addParameter("@RUNNING_REQUEST_OUT", NNumber.class);
			cmd.addParameter("@VERSION_OUT", NString.class);
			cmd.addParameter("@PRODUCTS_OUT", NNumber.class);
			cmd.addParameter("@INVALID_OBJECTS_OUT", NNumber.class);
			cmd.addParameter("@PATCHES_OUT", NNumber.class);
			cmd.addParameter("@HAS_CHRONOS_DATA_OUT", NString.class);
				
			cmd.execute();
			typeDisplayNameOut.val = cmd.getParameterValue("@TYPE_DISPLAY_NAME_OUT", NString.class);
			lastLoadTimeOut.val = cmd.getParameterValue("@LAST_LOAD_TIME_OUT", NString.class);
			currentStatusOut.val = cmd.getParameterValue("@CURRENT_STATUS_OUT", NNumber.class);
			availPctOut.val = cmd.getParameterValue("@AVAIL_PCT_OUT", NNumber.class);
			severityCodeOut.val = cmd.getParameterValue("@SEVERITY_CODE_OUT", NNumber.class);
			numSeverityOut.val = cmd.getParameterValue("@NUM_SEVERITY_OUT", NNumber.class);
			currentFormsOut.val = cmd.getParameterValue("@CURRENT_FORMS_OUT", NNumber.class);
			standbyRequestOut.val = cmd.getParameterValue("@STANDBY_REQUEST_OUT", NNumber.class);
			pendingRequestOut.val = cmd.getParameterValue("@PENDING_REQUEST_OUT", NNumber.class);
			runningRequestOut.val = cmd.getParameterValue("@RUNNING_REQUEST_OUT", NNumber.class);
			versionOut.val = cmd.getParameterValue("@VERSION_OUT", NString.class);
			productsOut.val = cmd.getParameterValue("@PRODUCTS_OUT", NNumber.class);
			invalidObjectsOut.val = cmd.getParameterValue("@INVALID_OBJECTS_OUT", NNumber.class);
			patchesOut.val = cmd.getParameterValue("@PATCHES_OUT", NNumber.class);
			hasChronosDataOut.val = cmd.getParameterValue("@HAS_CHRONOS_DATA_OUT", NString.class);


		}
		
		public static void getForms6SitemapInfo(NString targetNameIn,NString targetTypeIn,Ref<NString> typeDisplayNameOut,Ref<NString> lastLoadTimeOut,Ref<NNumber> currentStatusOut,Ref<NNumber> availPctOut,Ref<NNumber> severityCodeOut,Ref<NNumber> numSeverityOut,Ref<NNumber> numFormsSessionsOut,Ref<NNumber> memUtilOut,Ref<NNumber> cpuUtilOut,Ref<NString> appsContextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_FORMS6_SITEMAP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TYPE_DISPLAY_NAME_OUT", NString.class);
			cmd.addParameter("@LAST_LOAD_TIME_OUT", NString.class);
			cmd.addParameter("@CURRENT_STATUS_OUT", NNumber.class);
			cmd.addParameter("@AVAIL_PCT_OUT", NNumber.class);
			cmd.addParameter("@SEVERITY_CODE_OUT", NNumber.class);
			cmd.addParameter("@NUM_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@NUM_FORMS_SESSIONS_OUT", NNumber.class);
			cmd.addParameter("@MEM_UTIL_OUT", NNumber.class);
			cmd.addParameter("@CPU_UTIL_OUT", NNumber.class);
			cmd.addParameter("@APPS_CONTEXT_OUT", NString.class);
				
			cmd.execute();
			typeDisplayNameOut.val = cmd.getParameterValue("@TYPE_DISPLAY_NAME_OUT", NString.class);
			lastLoadTimeOut.val = cmd.getParameterValue("@LAST_LOAD_TIME_OUT", NString.class);
			currentStatusOut.val = cmd.getParameterValue("@CURRENT_STATUS_OUT", NNumber.class);
			availPctOut.val = cmd.getParameterValue("@AVAIL_PCT_OUT", NNumber.class);
			severityCodeOut.val = cmd.getParameterValue("@SEVERITY_CODE_OUT", NNumber.class);
			numSeverityOut.val = cmd.getParameterValue("@NUM_SEVERITY_OUT", NNumber.class);
			numFormsSessionsOut.val = cmd.getParameterValue("@NUM_FORMS_SESSIONS_OUT", NNumber.class);
			memUtilOut.val = cmd.getParameterValue("@MEM_UTIL_OUT", NNumber.class);
			cpuUtilOut.val = cmd.getParameterValue("@CPU_UTIL_OUT", NNumber.class);
			appsContextOut.val = cmd.getParameterValue("@APPS_CONTEXT_OUT", NString.class);


		}
		
		public static void getGroupHomepageInfo(NString targetNameIn,NString targetTypeIn,Ref<NNumber> numGroupTargetsOut,Ref<DataCursor> availCurOut,Ref<DataCursor> severityCurOut,Ref<DataCursor> metricErrorCurOut,Ref<DataCursor> numTargetsCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_GROUP_HOMEPAGE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@NUM_GROUP_TARGETS_OUT", NNumber.class);
			cmd.addParameter("@AVAIL_CUR_OUT", DataCursor.class);
			cmd.addParameter("@SEVERITY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@METRIC_ERROR_CUR_OUT", DataCursor.class);
			cmd.addParameter("@NUM_TARGETS_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			numGroupTargetsOut.val = cmd.getParameterValue("@NUM_GROUP_TARGETS_OUT", NNumber.class);
			availCurOut.val = cmd.getParameterValue("@AVAIL_CUR_OUT", DataCursor.class);
			severityCurOut.val = cmd.getParameterValue("@SEVERITY_CUR_OUT", DataCursor.class);
			metricErrorCurOut.val = cmd.getParameterValue("@METRIC_ERROR_CUR_OUT", DataCursor.class);
			numTargetsCurOut.val = cmd.getParameterValue("@NUM_TARGETS_CUR_OUT", DataCursor.class);


		}
		
		public static void getHasTemplatePriv(NString templateNameIn,NString targetTypeIn,NString eventNameIn,Ref<NNumber> hasPrivOut,Ref<DataCursor> pendingChangesPrivOut,Ref<NNumber> allPendingChangesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_HAS_TEMPLATE_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@EVENT_NAME_IN", eventNameIn);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@PENDING_CHANGES_PRIV_OUT", DataCursor.class);
			cmd.addParameter("@ALL_PENDING_CHANGES_OUT", NNumber.class);
				
			cmd.execute();
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			pendingChangesPrivOut.val = cmd.getParameterValue("@PENDING_CHANGES_PRIV_OUT", DataCursor.class);
			allPendingChangesOut.val = cmd.getParameterValue("@ALL_PENDING_CHANGES_OUT", NNumber.class);


		}
		
		public static void getHasTemplatePrivilege(NString templateNameIn,NString targetTypeIn,Ref<NNumber> hasPrivOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_HAS_TEMPLATE_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
				
			cmd.execute();
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);


		}
		
		public static void getKeyValueAvgDetails(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString timePeriodIn,Ref<NNumber> hasPrivOut,Ref<NNumber> statefullOut,Ref<DataCursor> keyValuesOut,Ref<DataCursor> avgDetailsOut,Ref<DataCursor> thresholdsOut,Ref<DataCursor> targetInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_KEY_VALUE_AVG_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@TIME_PERIOD_IN", timePeriodIn);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@STATEFULL_OUT", NNumber.class);
			cmd.addParameter("@KEY_VALUES_OUT", DataCursor.class);
			cmd.addParameter("@AVG_DETAILS_OUT", DataCursor.class);
			cmd.addParameter("@THRESHOLDS_OUT", DataCursor.class);
			cmd.addParameter("@TARGET_INFO_OUT", DataCursor.class);
				
			cmd.execute();
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			statefullOut.val = cmd.getParameterValue("@STATEFULL_OUT", NNumber.class);
			keyValuesOut.val = cmd.getParameterValue("@KEY_VALUES_OUT", DataCursor.class);
			avgDetailsOut.val = cmd.getParameterValue("@AVG_DETAILS_OUT", DataCursor.class);
			thresholdsOut.val = cmd.getParameterValue("@THRESHOLDS_OUT", DataCursor.class);
			targetInfoOut.val = cmd.getParameterValue("@TARGET_INFO_OUT", DataCursor.class);


		}
		
		public static void getKeyValueCurrentDetails(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,Ref<NNumber> hasPrivOut,Ref<NNumber> statefullOut,Ref<DataCursor> thresholdsOut,Ref<DataCursor> currentMetricSevOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_KEY_VALUE_CURRENT_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@STATEFULL_OUT", NNumber.class);
			cmd.addParameter("@THRESHOLDS_OUT", DataCursor.class);
			cmd.addParameter("@CURRENT_METRIC_SEV_OUT", DataCursor.class);
				
			cmd.execute();
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			statefullOut.val = cmd.getParameterValue("@STATEFULL_OUT", NNumber.class);
			thresholdsOut.val = cmd.getParameterValue("@THRESHOLDS_OUT", DataCursor.class);
			currentMetricSevOut.val = cmd.getParameterValue("@CURRENT_METRIC_SEV_OUT", DataCursor.class);


		}
		
		public static void getLsnrMemberSummary(NString targetNameIn,Ref<DataCursor> summaryOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_LSNR_MEMBER_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@SUMMARY_OUT", DataCursor.class);
				
			cmd.execute();
			summaryOut.val = cmd.getParameterValue("@SUMMARY_OUT", DataCursor.class);


		}
		
		public static void getMetricAssociatedCa(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,Ref<NNumber> caSeverityOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_ASSOCIATED_CA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@CA_SEVERITY_OUT", NNumber.class);
				
			cmd.execute();
			caSeverityOut.val = cmd.getParameterValue("@CA_SEVERITY_OUT", NNumber.class);


		}
		
//		public static void getMetricCollectionInfo(NString targetTypeIn,List<MgmtGuidArrayRow> metricGuidListIn,Ref<DataCursor> metricCurOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_COLLECTION_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_GUID_LIST_IN", "", metricGuidListIn, object.class));
//			cmd.addParameter("@METRIC_CUR_OUT", DataCursor.class);
//				
//			cmd.execute();
//			metricCurOut.val = cmd.getParameterValue("@METRIC_CUR_OUT", DataCursor.class);
//
//
//		}
		
		public static void getMetricDetails(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,NString pageTypeIn,Ref<NString> metricLatestValueOut,Ref<NDate> collectionTimestampOut,Ref<NString> metricWarningThresholdOut,Ref<NString> metricCriticalThresholdOut,Ref<NString> numOccurencesOut,Ref<NNumber> hasPrivOut,Ref<DataCursor> metricInfoOut,Ref<DataCursor> compositeKeyInfoOut,Ref<DataCursor> numberMetricInfoOut,Ref<DataCursor> stringMetricInfoOut,Ref<DataCursor> metricSevOut,Ref<DataCursor> currentMetricSevOut,NString startDateIn,NString endDateIn,Ref<NNumber> caSeverityOut,Ref<DataCursor> targetInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@PAGE_TYPE_IN", pageTypeIn);
			cmd.addParameter("@METRIC_LATEST_VALUE_OUT", NString.class);
			cmd.addParameter("@COLLECTION_TIMESTAMP_OUT", NDate.class);
			cmd.addParameter("@METRIC_WARNING_THRESHOLD_OUT", NString.class);
			cmd.addParameter("@METRIC_CRITICAL_THRESHOLD_OUT", NString.class);
			cmd.addParameter("@NUM_OCCURENCES_OUT", NString.class);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			cmd.addParameter("@NUMBER_METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@STRING_METRIC_INFO_OUT", DataCursor.class);
			cmd.addParameter("@METRIC_SEV_OUT", DataCursor.class);
			cmd.addParameter("@CURRENT_METRIC_SEV_OUT", DataCursor.class);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@CA_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@TARGET_INFO_OUT", DataCursor.class);
				
			cmd.execute();
			metricLatestValueOut.val = cmd.getParameterValue("@METRIC_LATEST_VALUE_OUT", NString.class);
			collectionTimestampOut.val = cmd.getParameterValue("@COLLECTION_TIMESTAMP_OUT", NDate.class);
			metricWarningThresholdOut.val = cmd.getParameterValue("@METRIC_WARNING_THRESHOLD_OUT", NString.class);
			metricCriticalThresholdOut.val = cmd.getParameterValue("@METRIC_CRITICAL_THRESHOLD_OUT", NString.class);
			numOccurencesOut.val = cmd.getParameterValue("@NUM_OCCURENCES_OUT", NString.class);
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			metricInfoOut.val = cmd.getParameterValue("@METRIC_INFO_OUT", DataCursor.class);
			compositeKeyInfoOut.val = cmd.getParameterValue("@COMPOSITE_KEY_INFO_OUT", DataCursor.class);
			numberMetricInfoOut.val = cmd.getParameterValue("@NUMBER_METRIC_INFO_OUT", DataCursor.class);
			stringMetricInfoOut.val = cmd.getParameterValue("@STRING_METRIC_INFO_OUT", DataCursor.class);
			metricSevOut.val = cmd.getParameterValue("@METRIC_SEV_OUT", DataCursor.class);
			currentMetricSevOut.val = cmd.getParameterValue("@CURRENT_METRIC_SEV_OUT", DataCursor.class);
			caSeverityOut.val = cmd.getParameterValue("@CA_SEVERITY_OUT", NNumber.class);
			targetInfoOut.val = cmd.getParameterValue("@TARGET_INFO_OUT", DataCursor.class);


		}
		
//		public static void getMetricDetailsTs(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,NString pageTypeIn,List<SmpEmdStringArrayRow> cmpTargetsIn,List<SmpEmdStringArrayRow> cmpKeyValuesIn,Ref<DataCursor> timeseriesOut,NString startDateIn,NString endDateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_DETAILS_TS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
//			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
//			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
//			cmd.addParameter("@PAGE_TYPE_IN", pageTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("CMP_TARGETS_IN", "", cmpTargetsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("CMP_KEY_VALUES_IN", "", cmpKeyValuesIn, object.class));
//			cmd.addParameter("@TIMESERIES_OUT", DataCursor.class);
//			cmd.addParameter("@START_DATE_IN", startDateIn);
//			cmd.addParameter("@END_DATE_IN", endDateIn);
//				
//			cmd.execute();
//			timeseriesOut.val = cmd.getParameterValue("@TIMESERIES_OUT", DataCursor.class);
//
//
//		}
		
//		public static void getMetricDetailsTsMk(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,NString pageTypeIn,List<SmpEmdStringArrayRow> cmpTargetsIn,List<SmpEmdStringArrayRow> cmpKeyValuesIn,Ref<DataCursor> timeseriesOut,NString startDateIn,NString endDateIn,NNumber multiKeyValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_DETAILS_TS_MK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
//			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
//			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
//			cmd.addParameter("@PAGE_TYPE_IN", pageTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("CMP_TARGETS_IN", "", cmpTargetsIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("CMP_KEY_VALUES_IN", "", cmpKeyValuesIn, object.class));
//			cmd.addParameter("@TIMESERIES_OUT", DataCursor.class);
//			cmd.addParameter("@START_DATE_IN", startDateIn);
//			cmd.addParameter("@END_DATE_IN", endDateIn);
//			cmd.addParameter("@MULTI_KEY_VALUE_IN", multiKeyValueIn);
//				
//			cmd.execute();
//			timeseriesOut.val = cmd.getParameterValue("@TIMESERIES_OUT", DataCursor.class);
//
//
//		}
		
		public static void getMetricErrors(NString pEmdUrl,Ref<DataCursor> pMetCur) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_METRIC_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMD_URL", pEmdUrl);
			cmd.addParameter("@P_MET_CUR", DataCursor.class);
				
			cmd.execute();
			pMetCur.val = cmd.getParameterValue("@P_MET_CUR", DataCursor.class);


		}
		
		public static void getMntrSettingsCopy(NString mntrSettingsCopyGuidIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_MNTR_SETTINGS_COPY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MNTR_SETTINGS_COPY_GUID_IN", mntrSettingsCopyGuidIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static NNumber FgetPendingChanges(NString targetNameIn,NString targetTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_PENDING_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getReports6SitemapInfo(NString targetNameIn,NString targetTypeIn,Ref<NString> typeDisplayNameOut,Ref<NString> lastLoadTimeOut,Ref<NNumber> currentStatusOut,Ref<NNumber> availPctOut,Ref<NNumber> severityCodeOut,Ref<NNumber> numSeverityOut,Ref<NNumber> numUsersOut,Ref<NNumber> memUtilOut,Ref<NNumber> cpuUtilOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_REPORTS6_SITEMAP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TYPE_DISPLAY_NAME_OUT", NString.class);
			cmd.addParameter("@LAST_LOAD_TIME_OUT", NString.class);
			cmd.addParameter("@CURRENT_STATUS_OUT", NNumber.class);
			cmd.addParameter("@AVAIL_PCT_OUT", NNumber.class);
			cmd.addParameter("@SEVERITY_CODE_OUT", NNumber.class);
			cmd.addParameter("@NUM_SEVERITY_OUT", NNumber.class);
			cmd.addParameter("@NUM_USERS_OUT", NNumber.class);
			cmd.addParameter("@MEM_UTIL_OUT", NNumber.class);
			cmd.addParameter("@CPU_UTIL_OUT", NNumber.class);
				
			cmd.execute();
			typeDisplayNameOut.val = cmd.getParameterValue("@TYPE_DISPLAY_NAME_OUT", NString.class);
			lastLoadTimeOut.val = cmd.getParameterValue("@LAST_LOAD_TIME_OUT", NString.class);
			currentStatusOut.val = cmd.getParameterValue("@CURRENT_STATUS_OUT", NNumber.class);
			availPctOut.val = cmd.getParameterValue("@AVAIL_PCT_OUT", NNumber.class);
			severityCodeOut.val = cmd.getParameterValue("@SEVERITY_CODE_OUT", NNumber.class);
			numSeverityOut.val = cmd.getParameterValue("@NUM_SEVERITY_OUT", NNumber.class);
			numUsersOut.val = cmd.getParameterValue("@NUM_USERS_OUT", NNumber.class);
			memUtilOut.val = cmd.getParameterValue("@MEM_UTIL_OUT", NNumber.class);
			cpuUtilOut.val = cmd.getParameterValue("@CPU_UTIL_OUT", NNumber.class);


		}
		
		public static void getTargetCollectionInfo(NString targetNameIn,NString targetTypeIn,NString collNameIn,NString languageCodeIn,NString countryCodeIn,Ref<DataCursor> metricCurOut,Ref<DataCursor> policyCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_COLLECTION_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@COLL_NAME_IN", collNameIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@METRIC_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			metricCurOut.val = cmd.getParameterValue("@METRIC_CUR_OUT", DataCursor.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);


		}
		
		public static void getTargetInfo(NString targetNameIn,NString targetTypeIn,Ref<DataCursor> targetInfoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_INFO_OUT", DataCursor.class);
				
			cmd.execute();
			targetInfoOut.val = cmd.getParameterValue("@TARGET_INFO_OUT", DataCursor.class);


		}
		
		public static void getTargetLibMntrSettings(NString targetNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut,Ref<DataCursor> defaultUdpRepositoryCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_LIB_MNTR_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@DEFAULT_UDP_REPOSITORY_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);
			defaultUdpRepositoryCurOut.val = cmd.getParameterValue("@DEFAULT_UDP_REPOSITORY_CUR_OUT", DataCursor.class);


		}
		
		public static void getTargetMntrSettings(NString targetNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_MNTR_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTargetSettings(NString targetNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasPrivOut,Ref<NNumber> hasRemoteOut,Ref<NNumber> hasUpdateExecutionOut,Ref<NNumber> agentCurrentStatusOut,Ref<NString> agentVersionOut,Ref<NString> isBaselineableOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@HAS_UPDATE_EXECUTION_OUT", NNumber.class);
			cmd.addParameter("@AGENT_CURRENT_STATUS_OUT", NNumber.class);
			cmd.addParameter("@AGENT_VERSION_OUT", NString.class);
			cmd.addParameter("@IS_BASELINEABLE_OUT", NString.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			hasUpdateExecutionOut.val = cmd.getParameterValue("@HAS_UPDATE_EXECUTION_OUT", NNumber.class);
			agentCurrentStatusOut.val = cmd.getParameterValue("@AGENT_CURRENT_STATUS_OUT", NNumber.class);
			agentVersionOut.val = cmd.getParameterValue("@AGENT_VERSION_OUT", NString.class);
			isBaselineableOut.val = cmd.getParameterValue("@IS_BASELINEABLE_OUT", NString.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTargetTimestampInfo(NString targetNameIn,NString targetTypeIn,NString metricNameIn,NString metricColumnIn,NString keyValueIn,Ref<NDate> loadTimestampOut,Ref<NDate> lastLoadTimeOut,Ref<NString> timezoneRegionOut,Ref<NDate> collectionTimestampOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGET_TIMESTAMP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_NAME_IN", metricNameIn);
			cmd.addParameter("@METRIC_COLUMN_IN", metricColumnIn);
			cmd.addParameter("@KEY_VALUE_IN", keyValueIn);
			cmd.addParameter("@LOAD_TIMESTAMP_OUT", NDate.class);
			cmd.addParameter("@LAST_LOAD_TIME_OUT", NDate.class);
			cmd.addParameter("@TIMEZONE_REGION_OUT", NString.class);
			cmd.addParameter("@COLLECTION_TIMESTAMP_OUT", NDate.class);
				
			cmd.execute();
			loadTimestampOut.val = cmd.getParameterValue("@LOAD_TIMESTAMP_OUT", NDate.class);
			lastLoadTimeOut.val = cmd.getParameterValue("@LAST_LOAD_TIME_OUT", NDate.class);
			timezoneRegionOut.val = cmd.getParameterValue("@TIMEZONE_REGION_OUT", NString.class);
			collectionTimestampOut.val = cmd.getParameterValue("@COLLECTION_TIMESTAMP_OUT", NDate.class);


		}
		
//		public static List<SmpEmdTgtObjectTblRow> FgetTargets(NString query) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SmpEmdTgtObjectTblRow>.class);
//			cmd.addParameter("@QUERY", query);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SmpEmdTgtObjectTblRow>.class);
//
//		}
		
		public static DataCursor FgetTargetsByHostWithPriv(NString privNameIn,NString targetTypeIn,NString targetNameSearchIn,NString hostNameSearchIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS_BY_HOST_WITH_PRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_NAME_SEARCH_IN", targetNameSearchIn);
			cmd.addParameter("@HOST_NAME_SEARCH_IN", hostNameSearchIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor FgetTargetsByMembers(NString privNameIn,NString targetTypeIn,NString targetNameSearchIn,NString childTypeIn,NString childNameSearchIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS_BY_MEMBERS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_NAME_SEARCH_IN", targetNameSearchIn);
			cmd.addParameter("@CHILD_TYPE_IN", childTypeIn);
			cmd.addParameter("@CHILD_NAME_SEARCH_IN", childNameSearchIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor FgetTargetsByMembership(NString privNameIn,NString targetTypeIn,NString targetNameSearchIn,NString parentTypeIn,NString parentNameSearchIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS_BY_MEMBERSHIP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@TARGET_NAME_SEARCH_IN", targetNameSearchIn);
			cmd.addParameter("@PARENT_TYPE_IN", parentTypeIn);
			cmd.addParameter("@PARENT_NAME_SEARCH_IN", parentNameSearchIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void getTargetsInfo(List<MgmtUserGuidArrayRow> targetGuidsIn,Ref<DataCursor> targetsCursorOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS_INFO", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("TARGET_GUIDS_IN", "", targetGuidsIn, object.class));
//			cmd.addParameter("@TARGETS_CURSOR_OUT", DataCursor.class);
//				
//			cmd.execute();
//			targetsCursorOut.val = cmd.getParameterValue("@TARGETS_CURSOR_OUT", DataCursor.class);
//
//
//		}
		
//		public static void getTargetsSummary(List<SmpEmdStringArrayRow> folderTypesIn,NString searchQueryIn,Ref<NNumber> caseNumberOut,Ref<DataCursor> userPrefsCurOut,Ref<DataCursor> metricSevsCurOut,Ref<DataCursor> metricValsCurOut,Ref<DataCursor> targetsCurOut,Ref<DataCursor> propValsCurOut,Ref<DataCursor> memberTypeCurOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TARGETS_SUMMARY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("FOLDER_TYPES_IN", "", folderTypesIn, object.class));
//			cmd.addParameter("@SEARCH_QUERY_IN", searchQueryIn);
//			cmd.addParameter("@CASE_NUMBER_OUT", NNumber.class);
//			cmd.addParameter("@USER_PREFS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@METRIC_SEVS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@METRIC_VALS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@TARGETS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@PROP_VALS_CUR_OUT", DataCursor.class);
//			cmd.addParameter("@MEMBER_TYPE_CUR_OUT", DataCursor.class);
//				
//			cmd.execute();
//			caseNumberOut.val = cmd.getParameterValue("@CASE_NUMBER_OUT", NNumber.class);
//			userPrefsCurOut.val = cmd.getParameterValue("@USER_PREFS_CUR_OUT", DataCursor.class);
//			metricSevsCurOut.val = cmd.getParameterValue("@METRIC_SEVS_CUR_OUT", DataCursor.class);
//			metricValsCurOut.val = cmd.getParameterValue("@METRIC_VALS_CUR_OUT", DataCursor.class);
//			targetsCurOut.val = cmd.getParameterValue("@TARGETS_CUR_OUT", DataCursor.class);
//			propValsCurOut.val = cmd.getParameterValue("@PROP_VALS_CUR_OUT", DataCursor.class);
//			memberTypeCurOut.val = cmd.getParameterValue("@MEMBER_TYPE_CUR_OUT", DataCursor.class);
//
//
//		}
		
		public static void getTemplateApplyOperations(NString searchQueryIn,Ref<DataCursor> applyOperation1CurOut,Ref<DataCursor> applyOperation2CurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_APPLY_OPERATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEARCH_QUERY_IN", searchQueryIn);
			cmd.addParameter("@APPLY_OPERATION1_CUR_OUT", DataCursor.class);
			cmd.addParameter("@APPLY_OPERATION2_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			applyOperation1CurOut.val = cmd.getParameterValue("@APPLY_OPERATION1_CUR_OUT", DataCursor.class);
			applyOperation2CurOut.val = cmd.getParameterValue("@APPLY_OPERATION2_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateCollectionInfo(NString templateNameIn,NString targetTypeIn,NString metricGuidIn,NString languageCodeIn,NString countryCodeIn,Ref<DataCursor> metricCurOut,Ref<DataCursor> policyCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_COLLECTION_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_GUID_IN", metricGuidIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@METRIC_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			metricCurOut.val = cmd.getParameterValue("@METRIC_CUR_OUT", DataCursor.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateCopySettings(NString templateCopyGuidIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_COPY_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_COPY_GUID_IN", templateCopyGuidIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateCopyTgtSettings(NString templateCopyGuidIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut,NString targetGuidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_COPY_TGT_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_COPY_GUID_IN", templateCopyGuidIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@TARGET_GUID_IN", targetGuidIn);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateCrtMntrSettings(NString targetNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_CRT_MNTR_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateLibMntrSettings(NString templateNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut,Ref<DataCursor> defaultUdpRepositoryCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_LIB_MNTR_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@DEFAULT_UDP_REPOSITORY_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);
			defaultUdpRepositoryCurOut.val = cmd.getParameterValue("@DEFAULT_UDP_REPOSITORY_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateMntrSettings(NString templateNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_MNTR_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTemplateSettings(NString templateNameIn,NString targetTypeIn,NString languageCodeIn,NString countryCodeIn,Ref<NString> templateOwnerOut,Ref<NString> templateDescriptionOut,Ref<NNumber> isPublicOut,Ref<NNumber> hasPrivOut,Ref<NNumber> hasRemoteOut,Ref<DataCursor> policyCurOut,Ref<DataCursor> collectionCurOut,Ref<DataCursor> keyRenderCurOut,Ref<DataCursor> policyCtxtCurOut,Ref<DataCursor> caMultitaskCurOut,Ref<DataCursor> caParamCurOut,Ref<DataCursor> caCredCurOut,Ref<DataCursor> jobTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TEMPLATE_SETTINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMPLATE_NAME_IN", templateNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@LANGUAGE_CODE_IN", languageCodeIn);
			cmd.addParameter("@COUNTRY_CODE_IN", countryCodeIn);
			cmd.addParameter("@TEMPLATE_OWNER_OUT", NString.class);
			cmd.addParameter("@TEMPLATE_DESCRIPTION_OUT", NString.class);
			cmd.addParameter("@IS_PUBLIC_OUT", NNumber.class);
			cmd.addParameter("@HAS_PRIV_OUT", NNumber.class);
			cmd.addParameter("@HAS_REMOTE_OUT", NNumber.class);
			cmd.addParameter("@POLICY_CUR_OUT", DataCursor.class);
			cmd.addParameter("@COLLECTION_CUR_OUT", DataCursor.class);
			cmd.addParameter("@KEY_RENDER_CUR_OUT", DataCursor.class);
			cmd.addParameter("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_PARAM_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CA_CRED_CUR_OUT", DataCursor.class);
			cmd.addParameter("@JOB_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			templateOwnerOut.val = cmd.getParameterValue("@TEMPLATE_OWNER_OUT", NString.class);
			templateDescriptionOut.val = cmd.getParameterValue("@TEMPLATE_DESCRIPTION_OUT", NString.class);
			isPublicOut.val = cmd.getParameterValue("@IS_PUBLIC_OUT", NNumber.class);
			hasPrivOut.val = cmd.getParameterValue("@HAS_PRIV_OUT", NNumber.class);
			hasRemoteOut.val = cmd.getParameterValue("@HAS_REMOTE_OUT", NNumber.class);
			policyCurOut.val = cmd.getParameterValue("@POLICY_CUR_OUT", DataCursor.class);
			collectionCurOut.val = cmd.getParameterValue("@COLLECTION_CUR_OUT", DataCursor.class);
			keyRenderCurOut.val = cmd.getParameterValue("@KEY_RENDER_CUR_OUT", DataCursor.class);
			policyCtxtCurOut.val = cmd.getParameterValue("@POLICY_CTXT_CUR_OUT", DataCursor.class);
			caMultitaskCurOut.val = cmd.getParameterValue("@CA_MULTITASK_CUR_OUT", DataCursor.class);
			caParamCurOut.val = cmd.getParameterValue("@CA_PARAM_CUR_OUT", DataCursor.class);
			caCredCurOut.val = cmd.getParameterValue("@CA_CRED_CUR_OUT", DataCursor.class);
			jobTypesCurOut.val = cmd.getParameterValue("@JOB_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTypesInTargetSelection(NString privNameIn,Ref<DataCursor> targetTypesCurOut,Ref<DataCursor> parentTypesCurOut,Ref<DataCursor> childTypesCurOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TYPES_IN_TARGET_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIV_NAME_IN", privNameIn);
			cmd.addParameter("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@PARENT_TYPES_CUR_OUT", DataCursor.class);
			cmd.addParameter("@CHILD_TYPES_CUR_OUT", DataCursor.class);
				
			cmd.execute();
			targetTypesCurOut.val = cmd.getParameterValue("@TARGET_TYPES_CUR_OUT", DataCursor.class);
			parentTypesCurOut.val = cmd.getParameterValue("@PARENT_TYPES_CUR_OUT", DataCursor.class);
			childTypesCurOut.val = cmd.getParameterValue("@CHILD_TYPES_CUR_OUT", DataCursor.class);


		}
		
		public static void getTypesResourceBundles(Ref<DataCursor> bundlesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GET_TYPES_RESOURCE_BUNDLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUNDLES_OUT", DataCursor.class);
				
			cmd.execute();
			bundlesOut.val = cmd.getParameterValue("@BUNDLES_OUT", DataCursor.class);


		}
		
		public static NNumber Fgetmetricvalue(NString targetname,NString targettype,NString metricname,NString metriccolumn,NNumber doround) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GETMETRICVALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGETNAME", targetname);
			cmd.addParameter("@TARGETTYPE", targettype);
			cmd.addParameter("@METRICNAME", metricname);
			cmd.addParameter("@METRICCOLUMN", metriccolumn);
			cmd.addParameter("@DOROUND", doround);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetstatuscode(NString targetname,NString targettype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.GETSTATUSCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TARGETNAME", targetname);
			cmd.addParameter("@TARGETTYPE", targettype);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void isServerGnrtdMetric(NString targetNameIn,NString targetTypeIn,byte[] metricGuidIn,Ref<NNumber> isSrvrGnrtd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.IS_SERVER_GNRTD_METRIC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
			cmd.addParameter("@METRIC_GUID_IN", metricGuidIn);
			cmd.addParameter("@IS_SRVR_GNRTD", NNumber.class);
				
			cmd.execute();
			isSrvrGnrtd.val = cmd.getParameterValue("@IS_SRVR_GNRTD", NNumber.class);


		}
		
		public static void modifyThreshold(NString targetName,NString targetType,NString metric,NString column,NString collName,NString keyInfo,NNumber _operator,NString warn,NString crit,NString scheduleEx,NString agentFixit,NNumber numOccurrences) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.MODIFY_THRESHOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TARGET_NAME", targetName);
			cmd.addParameter("@TARGET_TYPE", targetType);
			cmd.addParameter("@METRIC", metric);
			cmd.addParameter("@COLUMN", column);
			cmd.addParameter("@COLL_NAME", collName);
			cmd.addParameter("@KEY_INFO", keyInfo);
			cmd.addParameter("@OPERATOR", _operator);
			cmd.addParameter("@WARN", warn);
			cmd.addParameter("@CRIT", crit);
			cmd.addParameter("@SCHEDULE_EX", scheduleEx);
			cmd.addParameter("@AGENT_FIXIT", agentFixit);
			cmd.addParameter("@NUM_OCCURRENCES", numOccurrences);
				
			cmd.execute();


		}
		
//		public static void saveTargetSettings(NString targetNameIn,NString targetTypeIn,List<MgmtMntrMetricArrayRow> metricListIn,List<MgmtMntrPolicyArrayRow> policyListIn,List<MgmtMntrCollectionArrayRow> collectionListIn,Ref<NString> emdUrlOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.SAVE_TARGET_SETTINGS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGET_NAME_IN", targetNameIn);
//			cmd.addParameter("@TARGET_TYPE_IN", targetTypeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("METRIC_LIST_IN", "", metricListIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("POLICY_LIST_IN", "", policyListIn, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("COLLECTION_LIST_IN", "", collectionListIn, object.class));
//			cmd.addParameter("@EMD_URL_OUT", NString.class);
//				
//			cmd.execute();
//			emdUrlOut.val = cmd.getParameterValue("@EMD_URL_OUT", NString.class);
//
//
//		}
		
//		public static void updateUserLicense(NString usernameIn,NString iAgreeIn,List<SmpEmdStringArrayRow> setupDetailsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EMD_MNTR.UPDATE_USER_LICENSE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@USERNAME_IN", usernameIn);
//			cmd.addParameter("@I_AGREE_IN", iAgreeIn);
//			// cmd.addParameter(DbTypes.getCollectionType("SETUP_DETAILS_IN", "", setupDetailsIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
